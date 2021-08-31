package com.josamuna.project.person;

import com.josamuna.project.person.model.Employee;
import com.josamuna.project.person.model.IPerson;
import com.josamuna.project.person.model.Student;

public class TestInterface {

	public static void main(String[] args) {
		
		IPerson student1 = new Student(1, "Paul", "Mupenda", "ED217454");
		IPerson student2 = new Student();
		((Student)student2).setId(2);
		((Student)student2).setFirstName("Alpha");
		((Student)student2).setLastName("Cubaka");
		((Student)student2).setRollNumber("EC14983");
		
		IPerson employee1 = new Employee(3, "Shekinah", "Kavira", "123045789641");
		IPerson employee2 = new Employee();
		((Employee)employee2).setId(4);
		((Employee)employee2).setFirstName("Moise");
		((Employee)employee2).setLastName("Tumusifu");
		((Employee)employee2).setCnss("21548790145");
		
		// Show Values
		student1.showStaticIdentity(1);
		student2.showStaticIdentity(2);
		
		employee1.showStaticIdentity(3);
		employee2.showStaticIdentity(4);
	}

}
