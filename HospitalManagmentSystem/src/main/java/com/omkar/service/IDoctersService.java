package com.omkar.service;

import java.sql.Date;
import java.util.List;

import com.omkar.entity.Doctor;

public interface IDoctersService {
	public List<Doctor> fetchAllDoctors();
	public Doctor checkDoctor(Integer id);
	public boolean bookAppointment(int patient_id,int docter_id,String date);
	void cleanUpConnection();

}
