package com.josamuna.project.database.implementations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.josamuna.project.database.model.ConnectionDataBase;

public class MySQLDbConnection extends DatabaseConnection {

	public MySQLDbConnection() {
	}

	@Override
	public Connection getConnection() throws SQLException, ClassNotFoundException {

		ConnectionDataBase connectionDataBase = new ConnectionDataBase("root", "", "localhost", "db_person", null,
				"3306");
		if (DatabaseConnection.connection_database == null) {
			DatabaseConnection.connection_database = DriverManager.getConnection(formatConnectionString(connectionDataBase));
		}
		return DatabaseConnection.connection_database;
	}

	@Override
	public String formatConnectionString(ConnectionDataBase connectionDataBase) {
		StringBuilder connectionString = new StringBuilder();
		connectionString.append("jdbc:mysql://")
				.append(connectionDataBase.getHost())
				.append(":")
				.append(connectionDataBase.getPortNumber())
				.append("/")
				.append(connectionDataBase.getDatabaseName())
				.append("?user=")
				.append(connectionDataBase.getUsername())
				.append("&password=")
				.append(connectionDataBase.getPassword())				
				.append("&serverTimezone=UTC");
		return connectionString.toString();
	}

}
