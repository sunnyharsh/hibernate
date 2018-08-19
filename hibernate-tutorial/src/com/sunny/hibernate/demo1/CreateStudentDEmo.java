package com.sunny.hibernate.demo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sunny.hibernate.demo.entity.Student;

public class CreateStudentDEmo {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		//create session
		Session session=factory.getCurrentSession();
		try {
			System.out.println("creating new object");
			Student tempStudent=new Student("raushan" , "singh" , "raushan.kr.hr@gmail.com");
			
			//start the transaction
			session.beginTransaction();
			
			//save the student Object
			System.out.println("save the student obj...");
			session.save(tempStudent);
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("DONe!!");
		}
		finally {
			factory.close();
		}
	}

}
