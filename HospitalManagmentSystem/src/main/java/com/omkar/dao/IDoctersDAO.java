package com.omkar.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import com.omkar.entity.Doctor;

public interface IDoctersDAO {
	
	public List<Doctor> fetchAllDoctors();
	public Doctor checkDoctor(Integer id);
	public boolean bookAppointment(int patient_id,int docter_id,Date date);
	public void colseUpConnection();

}
