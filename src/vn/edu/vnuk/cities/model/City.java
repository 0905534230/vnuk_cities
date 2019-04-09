package vn.edu.vnuk.cities.model;



public class City {
	private Long id;
	private String city;
	private String province;
	private Long zip_code;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public Long getZip_code() {
		return zip_code;
	}
	public void setZip_code(Long zip_code) {
		this.zip_code = zip_code;
	}
}
