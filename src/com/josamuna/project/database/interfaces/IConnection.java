package com.josamuna.project.database.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

import com.josamuna.project.database.model.ConnectionDataBase;

public interface IConnection {
	public Connection loadConnection() throws SQLException, ClassNotFoundException;
	
	public String formatConnectionString(ConnectionDataBase connectionDataBase);
}
