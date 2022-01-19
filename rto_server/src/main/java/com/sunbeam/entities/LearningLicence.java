package com.sunbeam.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ll_table")
public class LearningLicence {
	
	//| temp_LL_no | user_id | rto   | issue_date | expiry_date | L_category | payment_id |
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "temp_ll_id")
	private int id;
	private int temp_LL_no;
	private String rto;
	@Temporal(TemporalType.DATE)
	private Date issue_date;
	@Temporal(TemporalType.DATE)
	private Date expiry_date;
	private String L_category;
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "user_id")
	private User user ;
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "payment_no")
	private Payment payment ;

	public LearningLicence() {
	}

	
	public LearningLicence(int id, int temp_LL_no, String rto, Date issue_date, Date expiry_date, String l_category,
			User user, Payment payment) {
		super();
		this.id = id;
		this.temp_LL_no = temp_LL_no;
		this.rto = rto;
		this.issue_date = issue_date;
		this.expiry_date = expiry_date;
		L_category = l_category;
		this.user = user;
		this.payment = payment;
	}

	
	public int getId() {
		return id;
	}


	public int getTemp_LL_no() {
		return temp_LL_no;
	}


	public String getRto() {
		return rto;
	}


	public Date getIssue_date() {
		return issue_date;
	}


	public Date getExpiry_date() {
		return expiry_date;
	}


	public String getL_category() {
		return L_category;
	}


	public User getUser() {
		return user;
	}


	public Payment getPayment() {
		return payment;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setTemp_LL_no(int temp_LL_no) {
		this.temp_LL_no = temp_LL_no;
	}


	public void setRto(String rto) {
		this.rto = rto;
	}


	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}


	public void setExpiry_date(Date expiry_date) {
		this.expiry_date = expiry_date;
	}


	public void setL_category(String l_category) {
		L_category = l_category;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public void setPayment(Payment payment) {
		this.payment = payment;
	}


	@Override
	public String toString() {
		return String.format(
				"LearningLicence [LL_id=%s, temp_LL_no=%s, rto=%s, issue_date=%s, expiry_date=%s, L_category=%s, user=%s, payment=%s]",
				id, temp_LL_no, rto, issue_date, expiry_date, L_category, user, payment);
	}

	
	
		
}
