package com.test.bean;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.test.HibernateSessionFactory;

public class M2OAndO2MTest {

	private Session session;
	private Transaction transaction;
	@Before
	public void setUp() throws Exception {
		session = HibernateSessionFactory.getSession();
		transaction = session.beginTransaction();
	}

	@After
	public void tearDown() throws Exception {
		HibernateSessionFactory.closeSession();
	}

	@Test
	public void test() {
		Class c1 = new Class("JAVA五班");
		Student s1 = new Student("张三");
		Student s2 = new Student("李四");
		
		c1.getStudents().add(s1);
		c1.getStudents().add(s2);
		s1.setClass1(c1);
		s2.setClass1(c1);
		
		session.save(c1);
		//session.save(s1);
		//session.save(s2);
		transaction.commit();
	}

}
