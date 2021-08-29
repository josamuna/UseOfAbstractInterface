package com.josamuna.project.useofinterface;

public class TestInterface {

	public static void main(String[] args) {
		
		IPerson student1 = new Student("Paul", "Mupenda", "ED217454");
		IPerson student2 = new Student();
		((Student)student2).setFirstName("Alpha");
		((Student)student2).setLastName("Cubaka");
		((Student)student2).setRollNumber("EC14983");
		
		IPerson employe1 = new Employe("Shekinah", "Kavira", "123045789641");
		IPerson employe2 = new Employe();
		((Employe)employe2).setFirstName("Moise");
		((Employe)employe2).setLastName("Tumusifu");
		((Employe)employe2).setCnss("21548790145");
		
		// Show Values
		student1.showIdentity();
		student2.showIdentity();
		
		employe1.showIdentity();
		employe2.showIdentity();
	}

}
