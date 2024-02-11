package com.cg.placement.client;

import java.util.ArrayList;
import java.util.List;

import com.cg.placement.entities.Admin;
import com.cg.placement.entities.Certificate;
import com.cg.placement.entities.College;
import com.cg.placement.entities.Placement;
import com.cg.placement.entities.Student;
import com.cg.placement.entities.User;
import com.cg.placement.service.ICertificateService;
import com.cg.placement.service.ICollegeService;
import com.cg.placement.service.IPlacementService;
import com.cg.placement.service.IStudentService;
import com.cg.placement.service.IUserService;
import com.cg.placement.service.PlacementServiceImpl;
import com.cg.placement.service.StudentServiceImpl;
import com.cg.placement.service.UserServiceImpl;
import com.cg.placement.service.CertificateServiceImpl;
import com.cg.placement.service.CollegeServiceImpl;

/* By Vikas Gowda J A*/

public class client 
{
	public static void main(String[] args) 
	{
		// CRUD operation calling activity
		Student student = new Student();
		IStudentService service = new StudentServiceImpl();
		
		Certificate certificate = new Certificate();
		ICertificateService service2 = new CertificateServiceImpl();
		
    	College college = new College();
		ICollegeService service3 = new CollegeServiceImpl();
		
		User user = new User();
		User user2 = new User();
		User user3 = new User();
		IUserService service4 = new UserServiceImpl();
		
		Placement placement = new Placement();
		IPlacementService service5 = new PlacementServiceImpl();
		
		Admin admin = new Admin();
		
		//  Creation //
		
		student.setName("Vikas Gowda Ja");
		student.setCollege(college);
		student.setRoll(67);
		student.setQualification("B.E");
		student.setCourse("IT");
		student.setYear(2021);
		student.setHallTicketNo(102);
		student.setCertificate(certificate);                  
		service.addStudent(student);
		
		List<Student> list = new ArrayList<Student>();
		list.add(student);
		
		certificate.setYear(2020);
		certificate.setCollege(college);                       
		certificate.setStudent(student);                       
    	service2.addCertificate(certificate);
    	
    	List<Certificate> list2 = new ArrayList<Certificate>();               
		list2.add(certificate);
		
		
		placement.setName("Capgemini ");
		placement.setCollege(college);
		placement.setDate("15-02-2022");
		placement.setQualification("BE MECH");
		placement.setYear(2022);
		service5.addPlacement(placement);
		
		List<Placement> list4 = new ArrayList<Placement>();
		list4.add(placement);
		
		college.setCollege("GECH");
		college.setLocation("Karnataka");
		college.setCollegeAdmin(user);                           //add different user here when user isn't an admin
		college.setStudents(list);
		college.setCertificates(list2);
		college.setPlacements(list4);
		service3.addCollege(college);
		
		admin.setUser(user);                                     //add different user here when user isn't an admin.
		
		List<Admin> list3 = new ArrayList<Admin>();              
		list3.add(admin);

		user.setName("Govrav");
		user.setPassword("12345");
		user.setType("Admin");
		user.setCollege(college);
		user.setAdmins(list3);
		service4.addNewUser(user);
		
		service4.addAdmin(admin);                                 // change (admin) accordingly

		user2.setName("Sharan");
		user2.setPassword("K123");
		user2.setType("Corporate user");
		service4.addNewUser(user2);
		
		user3.setName("Meghana");
		user3.setPassword("m@007");
		user3.setType("Corporate user");
		service4.addNewUser(user3);
	
		//  Retrieval //		
		
		student	= service.searchStudentById(1);                                                //Student
		System.out.println("ID is: "+student.getId());
		System.out.println("Roll is: "+student.getRoll());
		System.out.println("College is: "+student.getCollege().getCollege());
		System.out.println("Course is: "+student.getCourse());
		System.out.println("Certificate No.: "+student.getCertificate().getId() + ", from college: " + student.getCertificate().getCollege().getCollege());
//		
//		certificate	= service2.searchCertificate(150);                                           //Certificate
//		System.out.println("ID is: "+certificate.getId());
//		System.out.println("Year is: "+certificate.getYear());
//		System.out.println("From College: "+certificate.getCollege().getCollege());
//		System.out.println("Student is: "+ certificate.getStudent().getName());	
//		
//		
//		college = service3.searchCollege(151);                                                    //College
//		System.out.println("College ID is: "+college.getId());
//		System.out.println("Name is: "+college.getCollege());
//		System.out.println("Administrator is: "+college.getCollegeAdmin().getName());
//		System.out.println("Location is: "+college.getLocation());
//		
//		//traversing list with the help of for each
//		
//		for (Certificate c: college.getCertificates()) 
//		{
//			System.out.println("Certificate no.s associated are: "+c.getId());
//			
//		}
//		
//		for (Student s: college.getStudents()) 
//		{
//			System.out.println("Students associated are: "+ s.getName());
//			
//		}
//		
//		for (Placement p: college.getPlacements()) 
//		{
//			System.out.println("Placements scheduled are: " + p.getName() + ", on date " + p.getDate());
//			
//		}
//		
//		
//		placement = service5.searchPlacement(152);                                                  //Placement
//		System.out.println("ID is: "+placement.getId());
//		System.out.println("Name is: "+placement.getName());
//		System.out.println("College is: "+placement.getCollege().getCollege());
//		System.out.println("Qualification Requirement is: "+placement.getQualification());
//		System.out.println("Date is: "+placement.getDate());
//		

		
		//  Updation //
		
		
//		certificate	= service2.searchCertificate(1);
//		certificate.setCollege("RAIT");
//		service2.updateCertificate(certificate);
//		System.out.println("Update is successful");
		
//		student	= service.searchStudentById(1);
//		student.setName("Sumit R");
//		service.updateStudent(student);
//		System.out.println("Update is successful");
		
				
		//  Deletion //
		
//		student	= service.searchStudentById(1);
//		service.deleteStudent(student);
//		System.out.println("Delete is successful");
//	
//		student	= service.searchStudentByHallTicket(111);
//		service.deleteStudent(student);
//		System.out.println("Delete is successful");
		
//		certificate	= service2.searchCertificate(2);
//		service2.deleteCertificate(certificate);
//		System.out.println("Delete is successful");
	
	}

}
