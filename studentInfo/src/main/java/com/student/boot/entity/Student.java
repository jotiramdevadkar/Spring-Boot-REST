package com.student.boot.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="roll_No")
	private int rollNo;
	
	@Column(name ="first_name")
	private String fristName;
	
	@Column(name= "last_name")
	private String lastName;
	
	@Column(name ="sex")
	private String sex;
	
	@Column(name="age")
	private int age;
	
	@Column(name="b_date")
	private Date bDate;

	public Student(int rollNo, String fristName, String lastName, String sex, int age, Date bDate) {
		super();
		this.rollNo = rollNo;
		this.fristName = fristName;
		this.lastName = lastName;
		this.sex = sex;
		this.age = age;
		this.bDate = bDate;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getFristName() {
		return fristName;
	}

	public void setFristName(String fristName) {
		this.fristName = fristName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getbDate() {
		return bDate;
	}

	public void setbDate(Date bDate) {
		this.bDate = bDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((bDate == null) ? 0 : bDate.hashCode());
		result = prime * result + ((fristName == null) ? 0 : fristName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + rollNo;
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (bDate == null) {
			if (other.bDate != null)
				return false;
		} else if (!bDate.equals(other.bDate))
			return false;
		if (fristName == null) {
			if (other.fristName != null)
				return false;
		} else if (!fristName.equals(other.fristName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (rollNo != other.rollNo)
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", fristName=" + fristName + ", lastName=" + lastName + ", sex=" + sex
				+ ", age=" + age + ", bDate=" + bDate + "]";
	}

	public Student() {
		super();
	}
	
	

}
