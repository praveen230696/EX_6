package org.kiot.course;

import org.kiot.batch.Batch;
import org.kiot.trainee.Trainee;
import java.util.Scanner;

public class Course {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Batch batch = new Batch();
		System.out.println("Enter no of Trainee Details");
		int n = scanner.nextInt();
		Trainee[] traineeArray = new Trainee[n];
		for(int i = 0; i < traineeArray.length; i++) {
			traineeArray[i] = new Trainee(); 
			traineeArray[i].getTraineeDetails();
		}
		/*trainee[0] = new Trainee(1, "praveen", 90420, 
				"praveendebugger@gmail.com", "male", 25);
		trainee[1] = new Trainee(2, "arun", 90421, "arun@gmail.com", "male",
				26);
		trainee[2] = new Trainee(3, "bama", 90422, "bama@gmail.com", "female", 
				27);*/
		batch.setTrainee(traineeArray);
		System.out.println("Enter trainee id to search: ");
		if(batch.getTrainee(scanner.nextInt()) != null) {
			System.out.println("Details displayed successfully");
		} else {
			System.out.println("id not found");
		}
		System.out.println("Enter gender to search: ");
		if(batch.getTrainee(scanner.next()) != null) {
			System.out.println("Details displayed successfully");
		} else {
			System.out.println("Details insertion failed");
		}		
	}
}
