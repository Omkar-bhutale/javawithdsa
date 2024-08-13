package com.omkar;

import java.io.NotActiveException;
import java.util.FormatFlagsConversionMismatchException;
import java.util.List;
import java.util.Scanner;


import com.omkar.dao.IDoctersDAO;
import com.omkar.dao.IPatientDAO;
import com.omkar.daofactory.DoctorsDAOFactory;
import com.omkar.daofactory.PatientSDAOFactory;
import com.omkar.entity.Doctor;
import com.omkar.entity.Gender;
import com.omkar.entity.Patient;
import com.omkar.service.IDoctersService;
import com.omkar.service.IPatientService;
import com.omkar.servicefactory.DoctorsServiceFactory;
import com.omkar.servicefactory.PatientServiceFactory;
import com.omkar.util.JDBCUtil;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Boolean flag = true;
    	IDoctersService doctersService = DoctorsServiceFactory.getDoctersService();
    	IPatientService patientService = PatientServiceFactory.getPatientService();
    	while(flag) {
        System.out.println("WELCOME TO THE HOSPITAL");
        System.out.println("Select one of the blow Operation");
        System.out.println("1)ADD Patient   2)ViewAllPatient 3)CheckPatientByID 4)checkPatientByName 5)getPatientByID" );
        System.out.println("6)getAllDoctors Details 7)CheckDoctorByID ");
        System.out.println("8)BookAppointment ");
        System.out.println("Enter Your Choice Or to Exit pressenter or press 9");
        Scanner scanner = new Scanner(System.in);
        Integer key = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        switch (key) {
		case 1:
			System.out.println("enter the name of the patient");
			System.out.println();
			String name = scanner.nextLine();
			System.out.println("enter the age of patient");
			Integer age = scanner.nextInt();
			System.out.println("enter the gender of doctor \"MALE \" \" FEMALE\" \"OTHER\"");
			String gender = scanner.next();
			Patient patient = new Patient(null,name,age,Gender.valueOf(gender.toUpperCase()));
			Boolean isAdded = patientService.addPatient(patient);
			if (isAdded) {
				System.out.println("patient Insertion succesfull");
			}else {
				System.out.println("Insertion Falied");
			}
			break;
		case 2:
			System.out.println(" patient info is");
			patientService.fetchAllPatients().forEach(t->System.out.println(t));
			break;
		case 3:
			System.out.println("Enter the id to check the patient");
			Integer id = scanner.nextInt();
			Boolean status = patientService.checkPatientById(id);
			if (status) {
				System.out.println("patient exist for given id");
			}else {
				System.out.println("patient dose not exist");
			}
			break;
		case 4:
			System.out.println("enter the name to search patients");
			scanner.nextLine();
			name = scanner.nextLine();
			List<Patient> patients = patientService.checkPatientByName(name);
			if (patients.size()>0) {
				patients.forEach(t->System.out.println(t));
			}else {
				System.out.println("NO RESULT FOUNND");
			}
			break;
		case 5:
			System.out.println("enter the id to fetch patient");
			 id = scanner.nextInt();
			patient = patientService.fetchPatientById(id);
			System.out.println(patient);
			break;
		case 6:
			System.out.println("All doctors are ::");
			List<Doctor> doctors = doctersService.fetchAllDoctors();
			if (doctors.size()>0) {
				doctors.forEach(System.out::println);
			}else {
				System.out.println("doctor dose not exist");
			}
			break;
		case 7:
			System.out.println("enter the id to fetch doctor");
			 id = scanner.nextInt();
			Doctor doctor = doctersService.checkDoctor(id);
			if(doctor.getId()!=null) 
				System.out.println(doctor);
			else {
				System.out.println("doctor dose not exist");
			}
			break;
		case 8:
			System.out.println("Enter Doctor Id");
			Integer doctorId = scanner.nextInt();
			System.out.println("Enter patient Id");
			Integer patientId = scanner.nextInt();
			System.out.println("enter date (yyyy-mm-dd )");
			String date = scanner.next();
			 status = doctersService.bookAppointment(patientId, doctorId, date);
			if(status) System.out.println("appoint ment succes full");
			else System.out.println("appoint ment failed eitheer doctor entry dose not exist either patient entry dose not exist or doctor is busy on given date");
			break;
		default:
			scanner.close();
			patientService.cleanUpConnection();
			doctersService.cleanUpConnection();
			flag = false;
			break;
		}
    	}
        
    }
}
