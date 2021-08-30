package com.josamuna.project.person.model.abstractclass;

public class TestAbstract {
	
	public static void main(String[] args) {
		Person student1 = new Student(1, "Paul", "Mupenda", "ED217454");
		Person student2 = new Student();
		student2.id = 2;
		student2.firstName = "Alpha";
		student2.lastName = "Cubaka";
		((Student)student2).setRollNumber("EC14983");
		
		Person employee1 = new Employee(3, "Shekinah", "Kavira", "123045789641");
		Person employee2 = new Employee();
		employee2.id = 4;
		employee2.firstName = "Moise";
		employee2.lastName = "Tumusifu";
		((Employee)employee2).setCnss("21548790145");
		
		// Show values
		student1.showIdentity(1);
		student2.showIdentity(2);
		
		employee1.showIdentity(3);
		employee2.showIdentity(4);
		
	}
}
