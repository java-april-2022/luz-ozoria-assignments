package com.caresoft.clinicapp;
import java.util.ArrayList;

public class Physician implements HIPAACompliantUser extends User {
	
	//... imports class definition...
    
    // Inside class:    
    private ArrayList<String> patientNotes;
	
    // TO DO: Constructor that takes an ID
    public Physician(Integer id) {
    	super(id);
    }
    
    // TO DO: Implement HIPAACompliantUser!
    public boolean assignPIN(int pin) {
    	if(String.valueOf(pin).length() >= 6) {
    		this.pin=pin;
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean accessAuthorized(Integer confirmedAuthId) {
    	if(this.id == confirmedAuthId) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}
    // TO DO: Setters & Getters
    

	

}

