package com.omkar.service;

import java.util.List;

import com.omkar.entity.Patient;

public interface IPatientService {
	List<Patient> fetchAllPatients();
	Boolean addPatient(Patient patient);
	Boolean checkPatientById(Integer id);
	List<Patient> checkPatientByName(String name);
	Patient fetchPatientById(Integer id);
	void cleanUpConnection();

}
