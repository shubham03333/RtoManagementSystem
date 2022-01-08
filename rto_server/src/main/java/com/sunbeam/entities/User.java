package com.sunbeam.entities;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CollectionId;



@Entity
@Table(name = "users")
public class User {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "user_id")
	private int id;
	private long aadhar_no;
	private String name;
	private String role;
	@Temporal(TemporalType.DATE)
	private Date dob;
	private String address;
	private String gender;
	private String blood_group;
	private long mobile_no ;
	private String email;
	private String password;
	@Lob
	private byte[] photo;
	public User() {
	}
	public User(int id, long aadhar_no, String name, String role, Date dob, String address, String gender,
			String blood_group, long mobile_no, String email, String password, byte[] photo) {
		this.id = id;
		this.aadhar_no = aadhar_no;
		this.name = name;
		this.role = role;
		this.dob = dob;
		this.address = address;
		this.gender = gender;
		this.blood_group = blood_group;
		this.mobile_no = mobile_no;
		this.email = email;
		this.password = password;
		this.photo = photo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAadhar_no() {
		return aadhar_no;
	}
	public void setAadhar_no(long aadhar_no) {
		this.aadhar_no = aadhar_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBlood_group() {
		return blood_group;
	}
	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}
	public long getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public byte[] getphoto() {
		return photo;
	}
	public void setphoto(byte[] photo) {
		this.photo = photo;
	}
	@Override
	public String toString() {
		return String.format(
				"User [id=%s, aadhar_no=%s, name=%s, role=%s, dob=%s, address=%s, gender=%s, blood_group=%s, mobile_no=%s, email=%s, password=%s, photo=%s]",
				id, aadhar_no, name, role, dob, address, gender, blood_group, mobile_no, email, password,
				Arrays.toString(photo));
	}
	
	

}
