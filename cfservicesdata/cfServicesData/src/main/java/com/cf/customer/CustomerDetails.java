package com.cf.customer;

public class CustomerDetails {
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the landline
	 */
	public String getLandline() {
		return landline;
	}
	/**
	 * @param landline the landline to set
	 */
	public void setLandline(String landline) {
		this.landline = landline;
	}
	/**
	 * @return the buildingname
	 */
	public String getBuildingname() {
		return buildingname;
	}
	/**
	 * @param buildingname the buildingname to set
	 */
	public void setBuildingname(String buildingname) {
		this.buildingname = buildingname;
	}
	/**
	 * @return the streetname
	 */
	public String getStreetname() {
		return streetname;
	}
	/**
	 * @param streetname the streetname to set
	 */
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	/**
	 * @return the doornumber
	 */
	public String getDoornumber() {
		return doornumber;
	}
	/**
	 * @param doornumber the doornumber to set
	 */
	public void setDoornumber(String doornumber) {
		this.doornumber = doornumber;
	}
	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}
	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the postcode
	 */
	public Integer getPostcode() {
		return postcode;
	}
	/**
	 * @param postcode the postcode to set
	 */
	public void setPostcode(Integer postcode) {
		this.postcode = postcode;
	}
	
	public String toString() {
        return "first:" + firstname + ":" + "lastname:" + lastname + ":" + "email:" + email + ":" + "city:" + city;
    }
	/*
	 * first name
	 */
	private String firstname;
	/*
	 * last name
	 */
	private String lastname;
	/*
	 * email
	 */
	private String email;
	/*
	 * mobile
	 */
	private String mobile;
	/*
	 * landline
	 */
	private String landline;
	/*
	 * buildingname
	 */
	private String buildingname;
	/*
	 * streetname
	 */
	private String streetname;
	/*
	 * doornumber
	 */
	private String doornumber;
	/*
	 * area
	 */
	private String area;
	/*
	 * city
	 */
	private String city;
	/*
	 * state
	 */
	private String state;
	/*
	 * postcode
	 */
	private Integer postcode;

}
