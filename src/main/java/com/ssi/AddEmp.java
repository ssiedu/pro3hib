package com.ssi;



import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddEmp {

	public static void main(String[] args) {

		Emp e1=new Emp(111,"AAA",10000,"CLERK");
		//Configuration conf=new Configuration().configure().addAnnotatedClass(Emp.class);
		Configuration conf=new Configuration().configure("mydata.xml");
		Session session=conf.buildSessionFactory().openSession();
		Transaction tr=session.beginTransaction();
		session.save(e1);
		tr.commit();
		System.out.println("DATA STORED");
	}

}
