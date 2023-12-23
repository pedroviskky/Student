package Listt;

import java.util.ArrayList;

import Information.Student;

public class ListStudent {
	ArrayList<Student> ListOfStudent;

	public ListStudent () {
		this.ListOfStudent = new ArrayList();
	}
	
	public void insertStudent (Student newStudent) {
		newStudent.TotalGrade();
		ListOfStudent.add(newStudent);
	}
	
	public void ListStudent () {
		System.out.println("List of the student: ");
		
		for(Student ListStudent: ListOfStudent) {
			ListStudent.ListStudents();
		}
	}
	
	public void ListSituation() {
		System.out.println("List of the student situation: ");
		
		for(Student ListStudent: ListOfStudent) {
			ListStudent.situationStudent();
		}
	}

}
