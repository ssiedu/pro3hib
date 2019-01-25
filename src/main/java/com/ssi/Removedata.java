package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Removedata {
	public static void main(String[] args) {
		
		Emp e=new Emp(111);
		Configuration conf=new Configuration().configure().addAnnotatedClass(Emp.class);
		Session session=conf.buildSessionFactory().openSession();
		Transaction tr=session.beginTransaction();
		session.delete(e);
		tr.commit();
		System.out.println("DATA REMOVED");
	}

}
