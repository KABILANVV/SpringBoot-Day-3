package com.example.demo.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class StudentDemo {
	@Id
	@Column(name="sid")
	private int sid;
	@Column(name="sname")
	private String sname;
	@Column(name="dname")
	private String dname;
	@Column(name="sec")
	private String sec;
	@Column(name="mob")
	private long mobile;
	@Column(name="mail")
	private String mailid;
	@Column(name="addr")
	private String address;
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getSec() {
		return sec;
	}
	public void setSec(String sec) {
		this.sec = sec;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSid() {
		return sid;
	}
	
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public StudentDemo(int sid, String sname, String dname, String sec, long mobile, String mailid, String address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.dname = dname;
		this.sec = sec;
		this.mobile = mobile;
		this.mailid = mailid;
		this.address = address;
	}
	public StudentDemo() {
	}
}