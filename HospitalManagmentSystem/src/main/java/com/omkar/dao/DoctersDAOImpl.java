package com.omkar.dao;

import java.io.IOException;
import java.nio.channels.SelectableChannel;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.omkar.entity.Doctor;
import com.omkar.util.JDBCUtil;

public class DoctersDAOImpl implements IDoctersDAO {

	private Connection connection = null;
	private PreparedStatement statement = null;
	ResultSet rs;

	@Override
	public List<Doctor> fetchAllDoctors() {
		String query = "Select * from Doctor";
		List<Doctor> doctors = new ArrayList<Doctor>();
		try {
			connection = JDBCUtil.getConnection();
			statement = connection.prepareStatement(query);
			 rs = statement.executeQuery();
			while (rs.next()) {
				Doctor doctor = new Doctor();
				doctor.setId(rs.getInt("id"));
				doctor.setName(rs.getString("name"));
				doctor.setSpeciality(rs.getString("speciality"));
				doctors.add(doctor);
			}

		} catch (SQLException | IOException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return doctors;
	}

	@Override
	public Doctor checkDoctor(Integer id) {
		String query = "Select * from Doctor where id = ?";
		Doctor doctor = new Doctor();
		try {
			connection = JDBCUtil.getConnection();
			statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			 rs = statement.executeQuery();
			while (rs.next()) {

				doctor.setId(rs.getInt("id"));
				doctor.setName(rs.getString("name"));
				doctor.setSpeciality(rs.getString("speciality"));
			}

		} catch (SQLException | IOException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return doctor;
	}

	@Override
	public boolean bookAppointment(int patient_id, int docter_id, Date date) {
		String query ="select count(*) from appointment where appointment_date = ?";
		String query1 = "insert into appointment (patient_id, doctor_id, appointment_date) VALUES (?,?,?)";
		int rowAffected =0;
		try {
			connection = JDBCUtil.getConnection();
			statement = connection.prepareStatement(query);
			statement.setDate(1, date);
			 rs = statement.executeQuery();
			if(!rs.next()) return false;
			statement.close();
			statement = connection.prepareStatement(query1);
			statement.setInt(1, patient_id);
			statement.setInt(2, docter_id);
			statement.setDate(3, date);
			
			 rowAffected = statement.executeUpdate();
			
			
		} catch (SQLException | IOException e) {
			System.out.println("eithe patient or doctor dose not exist");
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowAffected==1;
	}

	@Override
	public void colseUpConnection() {

		try {
			JDBCUtil.cleanUp(connection, statement, rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
