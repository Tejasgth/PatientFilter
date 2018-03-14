package com.fhir.Patient;

import java.util.Date;


import org.springframework.data.annotation.Id;

import ca.uhn.fhir.model.dstu2.composite.AddressDt;
import ca.uhn.fhir.model.primitive.IdDt;

public class patientDetail {
	
    public String getID() {
		return ID;
	}
	
	public void setID(String iD) {
		ID = iD;
	}
	
	public String getFirstname() {
		return Firstname;
	}
	
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	
	public String getLastname() {
		return Lastname;
	}
	
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	
	public Date getDateofbirth() {
		return dateofbirth;
	}
	
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getResidentCountry() {
		return ResidentCountry;
	}
	

	public void setResidentCountry(String residentCountry) {
		ResidentCountry = residentCountry;
	}   
	
	public String getGender() {
		return Gender;
	}
	
	public void setGender(String gender) {
		Gender = gender;
	}
	
	private String ID;
	private String Firstname;
    private String Lastname;
    private Date dateofbirth;
	private String ResidentCountry;
	
	

	private String Gender;
	

}
