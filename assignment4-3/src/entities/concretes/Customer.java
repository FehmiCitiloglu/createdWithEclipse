package entities.concretes;

import java.time.LocalDate;

import entities.abstracts.Entities;

public class Customer implements Entities{
	int id;
	private String nickName;
	private String nationalId;
	private String firstName;
	private String lastName;
	private 
	LocalDate birthday;
	
	public Customer() {}
	
	public Customer(int id, String nickName, String nationalId, String firstName, String lastName, LocalDate birthday) {
		super();
		this.id = id;
		this.nickName = nickName;
		this.nationalId = nationalId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	
}
