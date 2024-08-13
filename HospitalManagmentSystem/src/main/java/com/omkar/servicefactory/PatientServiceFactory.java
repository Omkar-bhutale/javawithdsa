package com.omkar.servicefactory;

import com.omkar.service.IPatientService;
import com.omkar.service.PatientServiceImpl;

public class PatientServiceFactory {
	private PatientServiceFactory() {}
	
	private static IPatientService service= null;
	
	public static IPatientService getPatientService() {
		if (service == null) {
			service = new PatientServiceImpl();
		}
		return service;
	}
	
	
}
