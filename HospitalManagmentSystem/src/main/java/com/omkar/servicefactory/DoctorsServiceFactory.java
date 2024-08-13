package com.omkar.servicefactory;

import com.omkar.service.DocterSeviceImpl;
import com.omkar.service.IDoctersService;

public class DoctorsServiceFactory {
	private DoctorsServiceFactory() {}
	private static IDoctersService service = null;
	public static IDoctersService getDoctersService() {
		if (service == null) {
			service = new DocterSeviceImpl();
		}
		return service;
	}
	

}
