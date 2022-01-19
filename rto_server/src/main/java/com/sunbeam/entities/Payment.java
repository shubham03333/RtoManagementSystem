package com.sunbeam.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "payment_table")
public class Payment {

	// | payment_refno | user_id | payment_id | payment_mode | amount | payment_date
	// |

	@Id
	@Column(name = "payment_refno")
	private int id;
	private int payment_id;
	private String payment_mode;
	private double amount;
	@Temporal(TemporalType.DATE)
	private Date payment_date;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "user_id")
	private User user;

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "registration_id")
	private VehicleRegistration vehicleRegistration;

	public Payment() {
	}

	public Payment(int payment_refno, int user_id, int payment_id, String payment_mode, double amount,
			Date payment_date) {
		this.id = payment_refno;
		this.payment_id = payment_id;
		this.payment_mode = payment_mode;
		this.amount = amount;
		this.payment_date = payment_date;
	}

	public int getId() {
		return id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public VehicleRegistration getVehicleRegistration() {
		return vehicleRegistration;
	}

	public void setVehicleRegistration(VehicleRegistration vehicleRegistration) {
		this.vehicleRegistration = vehicleRegistration;
	}

	public int getPayment_id() {
		return payment_id;
	}

	public String getPayment_mode() {
		return payment_mode;
	}

	public double getAmount() {
		return amount;
	}

	public Date getPayment_date() {
		return payment_date;
	}

	public void setId(int payment_refno) {
		this.id = payment_refno;
	}

	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}

	public void setPayment_mode(String payment_mode) {
		this.payment_mode = payment_mode;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setPayment_date(Date payment_date) {
		this.payment_date = payment_date;
	}

	@Override
	public String toString() {
		return String.format("Payment [payment_refno=%s, payment_id=%s, payment_mode=%s, amount=%s, payment_date=%s]",
				id, payment_id, payment_mode, amount, payment_date);
	}

}
