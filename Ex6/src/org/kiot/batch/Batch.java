package org.kiot.batch;

import java.util.Arrays;
import java.util.Objects;

import org.kiot.trainee.Trainee;

public class Batch {
	private int batchCode;
	private String startDate, endDate;
	private Trainee[] trainee;
	
	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Batch(int batchCode, String startDate, String endDate,
				Trainee[] trainee) {
		super();
		this.batchCode = batchCode;
		this.startDate = startDate;
		this.endDate = endDate;
		this.trainee = trainee;
	}
	
	public Batch(Trainee[] trainee) {
		super();
		this.trainee = trainee;
	}
	
	public int getBatchCode() {
		return batchCode;
	}
	public void setBatchCode(int batchCode) {
		this.batchCode = batchCode;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public Trainee[] getTrainee() {
		return trainee;
	}
	public void setTrainee(Trainee[] trainee) {
		this.trainee = trainee;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + batchCode;
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
		Batch other = (Batch) obj;
		if (batchCode != other.batchCode)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Batch [batchCode=" + batchCode + ", startDate=" + startDate 
				+ ", endDate=" + endDate + ", trainee="
				+ Arrays.toString(trainee) + "]";
	}
	
	public Trainee getTrainee(int traineeId) {
		int traineeIdFound = -1;
		for (int i = 0; i < trainee.length; i++) {
			if(Objects.equals(trainee[i].getTraineeId(), traineeId)) {   
				System.out.println("hi" + trainee[i]);
				traineeIdFound = i;
	        }
		}
		if(-1 != traineeIdFound ) {
			return trainee[traineeIdFound];
		} 
		return null;
	}
	public Trainee[] getTrainee(String gender) {
		int traineeFound = 0;
		for (int i = 0; i < trainee.length; i++) {
			if(Objects.equals(trainee[i].getGender(), gender)) {   
				System.out.println(trainee[i]);
				traineeFound = 1;
	        }
		}
		if(traineeFound == 1) {
			return trainee;
		} else {
			return new Trainee[0];
		}
	}	
}
