package com.josamuna.project.abstractclass;

public class TestAbstract {
	
	public static void main(String[] args) {
		Person student1 = new Student("Paul", "Mupenda", "ED217454");
		Person student2 = new Student();
		student2.firstName = "Alpha";
		student2.lastName = "Cubaka";
		((Student)student2).setRollNumber("EC14983");
		
		Person employe1 = new Employe("Shekinah", "Kavira", "123045789641");
		Person employe2 = new Employe();
		employe2.firstName = "Moise";
		employe2.lastName = "Tumusifu";
		((Employe)employe2).setCnss("21548790145");
		
		// Show values
		student1.showIdentity();
		student2.showIdentity();
		
		employe1.showIdentity();
		employe2.showIdentity();
		
	}
}
