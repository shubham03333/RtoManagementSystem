package com.sunbeam.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "vehicle_registration")
public class VehicleRegistration {
	

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "registration_id")
	private int id;
	private String registration_no;
	private String owner;
	private String make;
	private String chassis_no;
	private String vehicle_class;
	@Temporal(TemporalType.DATE)
	private Date purchase_date;
	private String fuel_type;
	private String engine_no;
	private int engine_capacity;
	private int insurance_status;
	private int puc_status;
	private String hypothecated_to;
	private int wheels;
	private int seat_capacity;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private  User user;
//	@OneToOne(mappedBy = "vehicleRegistration")
//	private VehicleTransfer vehicleTransfer;
	
	@OneToMany(mappedBy = "vehicleRegistration")
	private List<Permit> permitList;
	
	
	@OneToOne(mappedBy = "vehicleRegistration")
	private Puc puc;
	
	@OneToOne(mappedBy = "vehicleRegistration")
	@JoinColumn(name = "payment_no")
	private Payment payment;
	
	public VehicleRegistration() {
	}

	public VehicleRegistration(int id, String registration_no, String owner, String make,
			String chassis_no, String vehicle_class, Date purchase_date, String fuel_type, String engine_no,
			int engine_capacity, int insurance_status, int puc_status, String hypothecated_to,
			int wheels, int seat_capacity) {
		this.id = id;
		this.registration_no = registration_no;
		this.owner = owner;
		this.make = make;
		this.chassis_no = chassis_no;
		this.vehicle_class = vehicle_class;
		this.purchase_date = purchase_date;
		this.fuel_type = fuel_type;
		this.engine_no = engine_no;
		this.engine_capacity = engine_capacity;
		this.insurance_status = insurance_status;
		this.puc_status = puc_status;
		this.hypothecated_to = hypothecated_to;
		this.wheels = wheels;
		this.seat_capacity = seat_capacity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRegistration_no() {
		return registration_no;
	}

	public void setRegistration_no(String registration_no) {
		this.registration_no = registration_no;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getChassis_no() {
		return chassis_no;
	}

	public void setChassis_no(String chassis_no) {
		this.chassis_no = chassis_no;
	}

	public String getVehicle_class() {
		return vehicle_class;
	}

	public void setVehicle_class(String vehicle_class) {
		this.vehicle_class = vehicle_class;
	}

	public Date getPurchase_date() {
		return purchase_date;
	}

	public void setPurchase_date(Date purchase_date) {
		this.purchase_date = purchase_date;
	}

	public String getFuel_type() {
		return fuel_type;
	}

	public void setFuel_type(String fuel_type) {
		this.fuel_type = fuel_type;
	}

	public String getEngine_no() {
		return engine_no;
	}

	public void setEngine_no(String engine_no) {
		this.engine_no = engine_no;
	}

	public int getEngine_capacity() {
		return engine_capacity;
	}

	public void setEngine_capacity(int engine_capacity) {
		this.engine_capacity = engine_capacity;
	}

	public int getInsurance_status() {
		return insurance_status;
	}

	public void setInsurance_status(int insurance_status) {
		this.insurance_status = insurance_status;
	}

	public int getPuc_status() {
		return puc_status;
	}

	public void setPuc_status(int puc_status) {
		this.puc_status = puc_status;
	}

	public String getHypothecated_to() {
		return hypothecated_to;
	}

	public void setHypothecated_to(String hypothecated_to) {
		this.hypothecated_to = hypothecated_to;
	}


	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getSeat_capacity() {
		return seat_capacity;
	}

	public void setSeat_capacity(int seat_capacity) {
		this.seat_capacity = seat_capacity;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Permit> getPermitList() {
		return permitList;
	}

	public void setPermitList(List<Permit> permitList) {
		this.permitList = permitList;
	}

	public Puc getPuc() {
		return puc;
	}

	public void setPuc(Puc puc) {
		this.puc = puc;
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
				"VehicleRegistration [id=%s, registration_no=%s, owner=%s, make=%s, chassis_no=%s, vehicle_class=%s, purchase_date=%s, fuel_type=%s, engine_no=%s, engine_capacity=%s, insurance_status=%s, puc_status=%s, hypothecated_to=%s, wheels=%s, seat_capacity=%s, permitList=%s, puc=%s, payment=%s]",
				id, registration_no, owner, make, chassis_no, vehicle_class, purchase_date, fuel_type, engine_no,
				engine_capacity, insurance_status, puc_status, hypothecated_to, wheels, seat_capacity,
				permitList, puc, payment);
	}
	

	

}
