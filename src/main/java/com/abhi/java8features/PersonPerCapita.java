package com.abhi.java8features;
/**
 *  A domain object to store the CSV contains
 * @author AbDas
 *
 */
public class PersonPerCapita {
	
	private String city;
	private String country;
	private String gender;
	private String currency;
	private Integer income;
	public PersonPerCapita(String city, String country, String gender, String currency, Integer income) {
		super();
		this.city = city;
		this.country = country;
		this.gender = gender;
		this.currency = currency;
		this.income = income;
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
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	/**
	 * @return the income
	 */
	public Integer getIncome() {
		return income;
	}
	/**
	 * @param income the income to set
	 */
	public void setIncome(Integer income) {
		this.income = income;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PersonPerCapita [city=" + city + ", country=" + country + ", gender=" + gender + ", currency="
				+ currency + ", income=" + income + "]";
	}
	
	

}
