package com.sunbeam.entities;

import java.util.Date;

import javax.persistence.CascadeType;
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
@Table(name = "dl_table")
public class DrivingLicence {

	// | dl_id | payment_id | user_id | temp_LL_no | dl_issue_date | dl_expiry_date
	// |
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int dl_id;
	private int dl_no;
	private int user_id;
	@Temporal(TemporalType.DATE)
	private Date dl_issue_date;
	@Temporal(TemporalType.DATE)
	private Date dl_expiry_date;

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "temp_LL_no")
	private LearningLicence learningLicence;

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "payment_no")
	private Payment payment;

	public DrivingLicence() {
	}

	public DrivingLicence(int dl_id, int dl_no, int user_id, Date dl_issue_date, Date dl_expiry_date,
			LearningLicence learningLicence, Payment payment) {
		this.dl_id = dl_id;
		this.dl_no = dl_no;
		this.user_id = user_id;
		this.dl_issue_date = dl_issue_date;
		this.dl_expiry_date = dl_expiry_date;
		this.learningLicence = learningLicence;
		this.payment = payment;
	}

	public int getDl_id() {
		return dl_id;
	}

	public void setDl_id(int dl_id) {
		this.dl_id = dl_id;
	}

	public int getDl_no() {
		return dl_no;
	}

	public void setDl_no(int dl_no) {
		this.dl_no = dl_no;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public Date getDl_issue_date() {
		return dl_issue_date;
	}

	public void setDl_issue_date(Date dl_issue_date) {
		this.dl_issue_date = dl_issue_date;
	}

	public Date getDl_expiry_date() {
		return dl_expiry_date;
	}

	public void setDl_expiry_date(Date dl_expiry_date) {
		this.dl_expiry_date = dl_expiry_date;
	}

	public LearningLicence getLearningLicence() {
		return learningLicence;
	}

	public void setLearningLicence(LearningLicence learningLicence) {
		this.learningLicence = learningLicence;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return String.format(
				"DrivingLicence [dl_id=%s, dl_no=%s, user_id=%s, dl_issue_date=%s, dl_expiry_date=%s, learningLicence=%s, payment=%s]",
				dl_id, dl_no, user_id, dl_issue_date, dl_expiry_date, learningLicence, payment);
	}

}
