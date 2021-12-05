
package com.solvd.bankingandinsurance.client;

import com.solvd.bankingandinsurance.insuranceservices.HomeOwnersInsurance;
import com.solvd.bankingandinsurance.insuranceservices.LifeInsurance;
import com.solvd.bankingandinsurance.insuranceservices.VehicleInsurance;

public class InsuranceClient extends Client {
	private Client client;
	private LifeInsurance lifeInsurance;
	private HomeOwnersInsurance homeOwnersInsurance;
	private VehicleInsurance vehicleInsurance;
	private Boolean isASmoker;
	private Boolean hasExistingHealthProblems;
	private int numOfAutoAccidents;

	public InsuranceClient(Client client, LifeInsurance lifeInsurance, HomeOwnersInsurance homeOwnersInsurance,
			VehicleInsurance vehicleInsurance, Boolean isASmoker, Boolean hasExistingHealthProblems,
			int numOfAutoAccidents) {
		this.client = client;
		this.lifeInsurance = lifeInsurance;
		this.homeOwnersInsurance = homeOwnersInsurance;
		this.vehicleInsurance = vehicleInsurance;
		this.isASmoker = isASmoker;
		this.hasExistingHealthProblems = hasExistingHealthProblems;
		this.numOfAutoAccidents = numOfAutoAccidents;
	}

	public  Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Boolean getIsASmoker() {
		return isASmoker;
	}

	public void setIsASmoker(Boolean isASmoker) {
		this.isASmoker = isASmoker;
	}

	public Boolean getHasExistingHealthProblems() {
		return hasExistingHealthProblems;
	}

	public void setHasExistingHealthProblems(Boolean hasExistingHealthProblems) {
		this.hasExistingHealthProblems = hasExistingHealthProblems;
	}

	public int getNumOfAutoAccidents() {
		return numOfAutoAccidents;
	}

	public void setNumOfAutoAccidents(int numOfAutoAccidents) {
		this.numOfAutoAccidents = numOfAutoAccidents;
	}

	public LifeInsurance getLifeInsurance() {
		return lifeInsurance;
	}

	public void setLifeInsurance(LifeInsurance lifeInsurance) {
		this.lifeInsurance = lifeInsurance;
	}

	public HomeOwnersInsurance getHomeOwnersInsurance() {
		return homeOwnersInsurance;
	}

	public void setHomeOwnersInsurance(HomeOwnersInsurance homeOwnersInsurance) {
		this.homeOwnersInsurance = homeOwnersInsurance;
	}

	public VehicleInsurance getVehicleInsurance() {
		return vehicleInsurance;
	}

	public void setVehicleInsurance(VehicleInsurance vehicleInsurance) {
		this.vehicleInsurance = vehicleInsurance;
	}

	@Override
	public String toString() {

		return " Client : " + client + " Life Insurance : " + lifeInsurance + " Home Owners Insurance : "
				+ homeOwnersInsurance + " Automobile Insurance : " + vehicleInsurance + " Client is a smoker : "
				+ isASmoker + " Client has existing health problems : " + hasExistingHealthProblems
				+ " Clients Auto-collision history : " + numOfAutoAccidents + "\n";
	}

}
