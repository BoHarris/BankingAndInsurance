
package com.solvd.bankingandinsurance.utilities.address;

import java.util.Optional;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Address {

	private String buildingNum;
	private String streetName;
	private City city;
	private STATE state;
	private Country country;
	private CONTINENT continent;

	private static final Logger log = LogManager.getLogger(Address.class.getName());

	public Address() {

	}

	public Address(String buildingNum, String streetName, City city, STATE stateName, City zipCode, Country countryName,
			Country countryCode, CONTINENT continent) {

		this.buildingNum = buildingNum;
		this.streetName = streetName;
		this.city = city;
		this.state = stateName;
		this.country = countryName;
		this.continent = continent;

	}

	public String getBuildingNum() {
		return buildingNum;
	}

	public void setBuildingNum(String buildingNum) {
		this.buildingNum = buildingNum;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public Optional<City>  getCity() {
		return Optional.ofNullable(city) ;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public STATE getState() {
		return state;
	}

	public void setState(STATE state) {
		this.state = state;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Optional<CONTINENT>  getContinent() {
		return Optional.ofNullable(continent) ;
	}

	public void setContinent(CONTINENT continent) {
		this.continent = continent;
	}

	@Override
	public String toString() {
		return "Address [buildingNum=" + buildingNum + ", streetName=" + streetName + ", city=" + city + ", state="
				+ state + ", country=" + country + ", continent=" + continent + "] \n";
	}

}
