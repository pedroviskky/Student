package ListStudent;

import java.util.Locale;
import java.util.Scanner;

import Information.Student;
import Listt.ListStudent;

public class Class {

	public static void main(String[] args) {
		int opc = 0, qnt = 0;
		float grade;
		String name;
		int id = 0, age = 0;
		Student newStudent = new Student();
		ListStudent NewClass = new ListStudent();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------- BEM-VINDO ----------");
		System.out.println();
		
		do {
		System.out.println("Choose one of the options below:");
		System.out.println("1) Enter the student name: ");
		System.out.println("2) Show the student information: ");
		System.out.println("3) Student status: ");
		System.out.println("0) Close!");
		System.out.println("--------------------------------");
		opc = sc.nextInt();
		
		sc.nextLine();
		
		switch (opc) {
		case 1:
			System.out.println("Enter de name of the student: ");
			name = sc.nextLine();
			System.out.println("Enther the id of the student: ");
			id = sc.nextInt();
			System.out.println("Enther the age of the student: ");
			age = sc.nextInt();
			
			newStudent = new Student(name, id, age);
			
			System.out.println("How many student notes do you have type?: ");
			qnt = sc.nextInt();
			
			for(int i = 0; i < qnt; i++) {
				System.out.println("Grade " + (i + 1) +  ":");
				grade = sc.nextFloat();
				newStudent.insetGrade(grade);
			}
			
			NewClass.insertStudent(newStudent);
			
			System.out.println();
			break;
		case 2:
			NewClass.ListStudent();
			break;
		case 3:
			NewClass.ListSituation();
			break;
		case 0:
			System.out.println("Close!");
			break;
		}
		
		} while (opc != 0); 
		
		sc.close();

	}

}
