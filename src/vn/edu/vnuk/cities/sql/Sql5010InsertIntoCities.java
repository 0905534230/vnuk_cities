package vn.edu.vnuk.cities.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

public class Sql5010InsertIntoCities {
	
	private final Connection connection;
	private final String sqlQuery;
	
	public Sql5010InsertIntoCities(Connection connection) {
		this.connection = connection;
		
		this.sqlQuery = "insert into cities (city, province, zip_code) "
                +	"values (?, ?, ?";
	}
	
	public void run() throws SQLException {

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(">  Sql5010InsertIntoCategories started");
		
		PreparedStatement statement;
		
		try {
			statement = connection.prepareStatement(sqlQuery);

            //	Replacing "?" through values
            statement.setString(1, "Clue System");
            statement.setString(2, "clue.system@success.com");
            statement.setString(3, "Forever clue");
            statement.setDate(4, new java.sql.Date(
                            Calendar.getInstance().getTimeInMillis()
                    )
            );

            // 	Executing statement
			statement.execute();
			statement.close();
	        System.out.println("   DATA successfully loaded in \'categories\'");
		
		}
		
		catch (Exception e) {
	        e.printStackTrace();
	        connection.close();
		}
		
		finally {
			System.out.println("<  Sql5010InsertIntoCategories ended");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("");
		}
			
	}
}
