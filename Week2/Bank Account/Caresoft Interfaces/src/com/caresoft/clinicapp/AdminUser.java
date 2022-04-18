package com.caresoft.clinicapp;

import java.util.ArrayList;

public class AdminUser implements HIPAACompliantUser, HIPAACompliantAdmin extends User {
	//... imports class definition...
    
    // Inside class:
    private String role;
    private ArrayList<String> securityIncidents;
    
    // TO DO: Implement a constructor that takes an ID and a role
    
    public AdminUser(Integer id, String role) {
    	super(id);
    	this.role = role;
    }
    

    // TO DO: Implement HIPAACompliantUser!
    
    // TO DO: Implement HIPAACompliantAdmin!
    
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    @Override
	public ArrayList<String> reportSecurityIncidents() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void printSecurityIncidents() {
		// TODO Auto-generated method stub
		HIPAACompliantAdmin.super.printSecurityIncidents();
	}


	@Override
	public boolean adminQATest(ArrayList<String> expectedIncidents) {
		// TODO Auto-generated method stub
		return HIPAACompliantAdmin.super.adminQATest(expectedIncidents);
	}


	@Override
	public boolean assignPin(int pin) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		return false;
	}


	public AdminUser(String role, ArrayList<String> securityIncidents) {
		super();
		this.role = role;
		this.securityIncidents = securityIncidents;
	}
	public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}
	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}
    
    // TO DO: Setters & Getters
	


}
