package com.omkar.daofactory;

import com.omkar.dao.IPatientDAO;
import com.omkar.dao.PatientDAOImpl;

public class PatientSDAOFactory {
	private static IPatientDAO dao;
	private PatientSDAOFactory() {
	}
	public static IPatientDAO getPatientDAO() {
		if (dao == null) {
			dao= new PatientDAOImpl();
		}
		return dao;
	}
}
