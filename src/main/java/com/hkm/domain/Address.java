package com.hkm.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "address")
public class Address implements Serializable {
	
	private static final long serialVersionUID = -3939299126711542785L;

	@Id
	@Column(name="addressId")
	private int addressId;
	
	@Column(name="fullAddress")
	private String fullAddress;
	
	@Column(name="city")
	private String city;
	
	@Column(name="country")
	private String country;
	
	public Address() {
		super();
	}

	public Address(int addressId, String fullAddress, String city, String country) {
		super();
		this.addressId = addressId;
		this.fullAddress = fullAddress;
		this.city = city;
		this.country = country;
	}
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getFullAddress() {
		return fullAddress;
	}
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", fullAddress=" + fullAddress + ", city=" + city + ", country="
				+ country + "]";
	}
	
}
