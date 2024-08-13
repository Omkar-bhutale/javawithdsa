package com.omkar.dao;

import java.util.List;

import com.omkar.entity.Patient;

public interface IPatientDAO {
	List<Patient> fetchAllPatients();
	Boolean addPatient(Patient patient);
	Boolean checkPatient(Integer id);
	List<Patient> checkPatient(String name);
	Patient fetchPatientById(Integer id);
	public void colseUpConnection();
	
	
}
