package org.kiot.trainee;

import java.util.Scanner;

public class Trainee {
	private int  traineeId;
	private int contactNo;
	private int age;
	private String traineeName;
	private String emailId;
	private String gender;
	Scanner scanner = new Scanner(System.in);
	public Trainee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trainee(int traineeId, String traineeName, int contactNo, String emailId, String gender, int age) {
		super();
		this.traineeId = traineeId;
		this.contactNo = contactNo;
		this.age = age;
		this.traineeName = traineeName;
		this.emailId = emailId;
		this.gender = gender;
	}
	
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + traineeId;
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
		Trainee other = (Trainee) obj;
		if (traineeId != other.traineeId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", contactNo=" + contactNo + ", age=" + age + ", traineeName="
				+ traineeName + ", emailId=" + emailId + ", gender=" + gender + "]";
	}
	
	public void getTraineeDetails() {
		// TODO Auto-generated method stub
		System.out.println("Enter trainee Id:");
		traineeId = scanner.nextInt();
		System.out.println("Enter trainee Name:");
		scanner.nextLine();
		traineeName = scanner.nextLine();
		System.out.println("Enter trainee ContactNo:");
		contactNo = scanner.nextInt();
		System.out.println("Enter trainee emailId:");
		scanner.nextLine();
		emailId = scanner.nextLine();
		System.out.println("Enter trainee gender:");
		gender = scanner.nextLine();
		System.out.println("Enter trainee age:");
		age = scanner.nextInt();
	}
	
	
}

