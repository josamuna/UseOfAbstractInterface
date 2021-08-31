package com.josamuna.project.database.implementations;

import java.sql.Connection;
import java.sql.SQLException;

import com.josamuna.project.database.model.ConnectionDataBase;

public abstract class DatabaseConnection {
	protected static Connection connection_database;
	
	public DatabaseConnection() {
	}
	
	public abstract Connection getConnection() throws SQLException, ClassNotFoundException;
	
	public abstract String formatConnectionString(ConnectionDataBase connectionDataBase);
}
