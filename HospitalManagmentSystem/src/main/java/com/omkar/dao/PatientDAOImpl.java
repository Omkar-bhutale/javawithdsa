package com.omkar.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.google.protobuf.DescriptorProtos.FeatureSet.EnumType;
import com.mysql.cj.QueryReturnType;
import com.mysql.cj.telemetry.TelemetryAttribute;
import com.omkar.entity.Doctor;
import com.omkar.entity.Gender;
import com.omkar.entity.Patient;
import com.omkar.util.JDBCUtil;

public class PatientDAOImpl implements IPatientDAO{

	private Connection connection;
	private PreparedStatement statement;
    private	ResultSet rs = null;

	@Override
	public List<Patient> fetchAllPatients() {
		String query = "Select * from patient";
		List<Patient> patients = new ArrayList<Patient>();
		try {
			connection = JDBCUtil.getConnection();
			statement = connection.prepareStatement(query);
			 rs = statement.executeQuery();
			while (rs.next()) {
				Patient patient = new Patient();
				patient.setId(rs.getInt("id"));
				patient.setName(rs.getString("name"));
				patient.setAge(rs.getInt("age"));
				patient.setGender(Gender.valueOf(rs.getString("gender")));
				patients.add(patient);
			}

		} catch (SQLException | IOException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return patients;
	}

	@Override
	public Boolean addPatient(Patient patient) {
		String query = "insert into patient(name,age,gender) values (?,?,?)";
		int rowsAffected = 0;
		try {
			connection = JDBCUtil.getConnection();
			statement = connection.prepareStatement(query);
			statement.setString(1, patient.getName());
			statement.setInt(2, patient.getAge());
			statement.setString(3, patient.getGender().toString());
			rowsAffected = statement.executeUpdate();
		} catch (SQLException | IOException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowsAffected==1;
		
	}

	@Override
	public Boolean checkPatient(Integer id) {
		String query = "Select * from Patient where id = ?";
		try {
			connection = JDBCUtil.getConnection();
			statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			 rs = statement.executeQuery();
			if(rs.next()) return true;

		} catch (SQLException | IOException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Patient> checkPatient(String name) {
		String query = "Select * from patient where name = ?";
		List<Patient> patients = new ArrayList<Patient>();
		try {
			connection = JDBCUtil.getConnection();
			statement = connection.prepareStatement(query);
			statement.setString(1, name);
			 rs = statement.executeQuery();
			
			while (rs.next()) {
				System.out.println("PatientDAOImpl.checkPatient() inresult set");
				Patient patient = new Patient();
				patient.setId(rs.getInt("id"));
				patient.setName(rs.getString("name"));
				patient.setAge(rs.getInt("age"));
				patient.setGender(Gender.valueOf(rs.getString("gender")));
				patients.add(patient);
			}

		} catch (SQLException | IOException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return patients;
	}

	@Override
	public Patient fetchPatientById(Integer id) {
		String query = "Select * from Patient where id = ?";
		Patient patient = new Patient();
		try {
			connection = JDBCUtil.getConnection();
			statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {

				patient.setId(rs.getInt("id"));
				patient.setName(rs.getString("name"));
				patient.setAge(rs.getInt("age"));
				patient.setGender(Gender.valueOf(rs.getString("gender")));
			}

		} catch (SQLException | IOException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return patient;
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
