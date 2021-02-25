package com.chandra;

import java.util.Scanner;

public class OnlineTraining {

	public static void main(String[] args) {
		FastTrackBatchStudent fbs = new FastTrackBatchStudent();
		CorporateBatchStudent cbs = new CorporateBatchStudent();
		WeekendBatchStudent wbs = new WeekendBatchStudent();
		CorporateWeekendBatchStudent cwbs = new CorporateWeekendBatchStudent();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("----------------------------------------");
			System.out.println("|      ONLINE TRAINING MAIN MENU       |");
			System.out.println("----------------------------------------");
			System.out.println("|  1. FASTTRACK BATCH                  |");
			System.out.println("|  2. CORPORATE BATCH                  |");
			System.out.println("|  3. WEEKEND BATCH                    |");
			System.out.println("|  4. CORPORATE WEEKEND BATCH          |");
			System.out.println("|  5. EXIT                             |");
			System.out.println("----------------------------------------");
			System.out.println("Enter Your Choice ?");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Student Id ?");
				fbs.setStudentId(sc.nextInt());
				System.out.println("Enter Student Name ?");
				fbs.setName(sc.next());
				System.out.println("Enter Student Mobile No ?");
				fbs.setMobileNo(sc.nextLong());
				System.out.println("Enter Student Address ?");
				fbs.setAddress(sc.next());
				System.out.println("Enter Student Course 1. Java  2. Frameworks 3. Tools");
				int n = sc.nextInt();
				if (n == 1) {
					fbs.setCourse("java");
				} else if (n == 2) {
					fbs.setCourse("frameworks");
				} else if (n == 3) {
					fbs.setCourse("tools");
				}
				double fee = fbs.calculateFee(fbs.getCourse());
				System.out.println("Student Id         : " + fbs.getStudentId());
				System.out.println("Student Name       : " + fbs.getName());
				System.out.println("Student Mobile No  : " + fbs.getMobileNo());
				System.out.println("Student Address    : " + fbs.getAddress());
				System.out.println("Student Course     : " + fbs.getCourse());
				System.out.println("Course Fees        : " + fee);
				break;
			case 2:
				System.out.println("Enter Student Id ?");
				cbs.setStudentId(sc.nextInt());
				System.out.println("Enter Student Name ?");
				cbs.setName(sc.next());
				System.out.println("Enter Student Mobile No ?");
				cbs.setMobileNo(sc.nextLong());
				System.out.println("Enter Student Address ?");
				cbs.setAddress(sc.next());
				System.out.println("Enter Student Course 1. Java  2. Frameworks 3. Tools");
				int n1 = sc.nextInt();
				if (n1 == 1) {
					cbs.setCourse("java");
				} else if (n1 == 2) {
					cbs.setCourse("frameworks");
				} else if (n1 == 3) {
					cbs.setCourse("tools");
				}
				double fee1 = cbs.calculateFee(cbs.getCourse());
				System.out.println("Student Id         : " + cbs.getStudentId());
				System.out.println("Student Name       : " + cbs.getName());
				System.out.println("Student Mobile No  : " + cbs.getMobileNo());
				System.out.println("Student Address    : " + cbs.getAddress());
				System.out.println("Student Course     : " + cbs.getCourse());
				System.out.println("Course Fees        : " + fee1);
				break;
			case 3:
				System.out.println("Enter Student Id ?");
				wbs.setStudentId(sc.nextInt());
				System.out.println("Enter Student Name ?");
				wbs.setName(sc.next());
				System.out.println("Enter Student Mobile No ?");
				wbs.setMobileNo(sc.nextLong());
				System.out.println("Enter Student Address ?");
				wbs.setAddress(sc.next());
				System.out.println("Enter Student Course 1. Java  2. Frameworks 3. Tools");
				int n2 = sc.nextInt();
				if (n2 == 1) {
					wbs.setCourse("java");
				} else if (n2 == 2) {
					wbs.setCourse("frameworks");
				} else if (n2 == 3) {
					wbs.setCourse("tools");
				}
				double fee2 = wbs.calculateFee(wbs.getCourse());
				System.out.println("Student Id         : " + wbs.getStudentId());
				System.out.println("Student Name       : " + wbs.getName());
				System.out.println("Student Mobile No  : " + wbs.getMobileNo());
				System.out.println("Student Address    : " + wbs.getAddress());
				System.out.println("Student Course     : " + wbs.getCourse());
				System.out.println("Course Fees        : " + fee2);
				break;
			case 4:
				System.out.println("Enter Student Id ?");
				cwbs.setStudentId(sc.nextInt());
				System.out.println("Enter Student Name ?");
				cwbs.setName(sc.next());
				System.out.println("Enter Student Mobile No ?");
				cwbs.setMobileNo(sc.nextLong());
				System.out.println("Enter Student Address ?");
				cwbs.setAddress(sc.next());
				System.out.println("Enter Student Course 1. Java  2. Frameworks 3. Tools");
				int n3 = sc.nextInt();
				if (n3 == 1) {
					cwbs.setCourse("java");
				} else if (n3 == 2) {
					cwbs.setCourse("frameworks");
				} else if (n3 == 3) {
					cwbs.setCourse("tools");
				}
				double fee3 = cwbs.calculateFee(cwbs.getCourse());
				System.out.println("Student Id         : " + cwbs.getStudentId());
				System.out.println("Student Name       : " + cwbs.getName());
				System.out.println("Student Mobile No  : " + cwbs.getMobileNo());
				System.out.println("Student Address    : " + cwbs.getAddress());
				System.out.println("Student Course     : " + cwbs.getCourse());
				System.out.println("Course Fees        : " + fee3);
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Please select your choice range 1-5 only");
			}
		}

	}

}
