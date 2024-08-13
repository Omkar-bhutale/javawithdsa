package com.omkar.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import com.omkar.dao.IDoctersDAO;
import com.omkar.daofactory.DoctorsDAOFactory;
import com.omkar.entity.Doctor;

public class DocterSeviceImpl implements IDoctersService{
	
	IDoctersDAO dao = DoctorsDAOFactory.getDoctoerDAO();

	@Override
	public List<Doctor> fetchAllDoctors() {
		return dao.fetchAllDoctors();
	}

	@Override
	public Doctor checkDoctor(Integer id) {
		return dao.checkDoctor(id);
	}

	@Override
	public boolean bookAppointment(int patient_id, int docter_id, String date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");;
		 java.util.Date date2 = null;
		try {
			date2 = format.parse(date);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		 java.sql.Date sqlDate = new java.sql.Date(date2.getTime());
		 
		return dao.bookAppointment(patient_id, docter_id, sqlDate);
	}

	@Override
	public void cleanUpConnection() {

		dao.colseUpConnection();
	}
				
}
