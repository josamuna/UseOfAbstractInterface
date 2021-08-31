package com.josamuna.project.person.model;

import java.sql.SQLException;

public interface IPerson {
	
	public void showStaticIdentity(int id_person);
	
	public void showDynamicIdentity() throws ClassNotFoundException, SQLException;
	
	public void showDynamicIdentity(int id_person) throws ClassNotFoundException, SQLException;
}
