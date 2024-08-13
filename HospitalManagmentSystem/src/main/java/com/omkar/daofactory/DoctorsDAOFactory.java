package com.omkar.daofactory;

import com.omkar.dao.DoctersDAOImpl;
import com.omkar.dao.IDoctersDAO;

public class DoctorsDAOFactory {
	private DoctorsDAOFactory() {}
	private static IDoctersDAO dao = null;
	public static IDoctersDAO getDoctoerDAO() {
		if (dao == null) {
			dao = new DoctersDAOImpl();
		}
		return dao;
	}

}
