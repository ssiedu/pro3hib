package com.ssi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity

public class Emp {
	@Id
	private int eno;
	//@Column(name="empname", nullable=false, unique=true, length=20)
	private String ename;
	private int sal;
	private String desg;
	
	
	
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public Emp(int eno, String ename, int sal, String desg) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		this.desg = desg;
	}
	public Emp(int eno) {
		super();
		this.eno = eno;
	}
	public Emp() {
		super();
	}
	public Emp(int eno, String ename, int sal) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	
}
