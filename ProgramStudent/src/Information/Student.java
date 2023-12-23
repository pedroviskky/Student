package Information;

import java.util.ArrayList;

public class Student {
	private String name, situacao = "Reprovado";
	private int id;
	private int age;
	private float total =0;
	
	ArrayList<Float> gradeStudent =  new ArrayList();
	
	public Student() {
		
	}

	public Student(String name, int id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	public void insetGrade(float nota) {
		gradeStudent.add(nota);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void ListStudents () {
		System.out.println("Name: " + this.name);
		System.out.println("ID: " + this.id);
		System.out.println("Age: " + this.age);
		
		for (int i = 0; i < gradeStudent.size(); i++) {		
			System.out.println("Grade" + (i + 1) + ": " +  this.gradeStudent.get(i));
			
		}
	}
	
	public void situationStudent () {
		System.out.println("Name: " + this.name);
		System.out.println("ID: " + this.id);
		System.out.println("Age: " + this.age);
		System.out.println("Total: " + this.total);
		System.out.println("Situation: " + this.situacao);
	}
	
	public void TotalGrade () {
		for(float gradeOfList: gradeStudent) {
			total += gradeOfList;
		}
		
		if(total >=70) {
			this.situacao = "Aprovado";
		} else {
			this.situacao = "Reprovado";
		}
	}

	public ArrayList<Float> gradeStudent() {
		return gradeStudent;
	}

	public ArrayList<Float> getGradeStudent() {
		return gradeStudent;
	}

	public void setGradeStudent(ArrayList<Float> gradeStudent) {
		this.gradeStudent = gradeStudent;
	}
		
	 

}
