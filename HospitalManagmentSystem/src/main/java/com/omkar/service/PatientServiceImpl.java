package com.omkar.service;

import java.util.List;

import com.omkar.dao.IPatientDAO;
import com.omkar.daofactory.PatientSDAOFactory;
import com.omkar.entity.Patient;

public class PatientServiceImpl implements IPatientService {
	IPatientDAO dao = PatientSDAOFactory.getPatientDAO();

	@Override
	public List<Patient> fetchAllPatients() {
		
		return dao.fetchAllPatients();
	}

	@Override
	public Boolean addPatient(Patient patient) {
		return dao.addPatient(patient);
	}

	@Override
	public Boolean checkPatientById(Integer id) {
		return dao.checkPatient(id);
	}

	@Override
	public List<Patient> checkPatientByName(String name) {
		return dao.checkPatient(name);
	}

	@Override
	public Patient fetchPatientById(Integer id) {
		
		return dao.fetchPatientById(id);
	}

	@Override
	public void cleanUpConnection() {
		dao.colseUpConnection();
	}

}
