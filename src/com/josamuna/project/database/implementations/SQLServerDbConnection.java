package com.josamuna.project.database.implementations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.josamuna.project.database.model.ConnectionDataBase;

public class SQLServerDbConnection extends DatabaseConnection {

	public SQLServerDbConnection() {
	}

	@Override
	public Connection getConnection() throws SQLException, ClassNotFoundException {

		ConnectionDataBase connectionDataBase = new ConnectionDataBase("josue", "josue", "JOSAM\\SQLEXPRESS", "db_person",
				"com.microsoft.sqlserver.jdbc.SQLServerDriver");
//		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		if (DatabaseConnection.connection_database == null) {
			DatabaseConnection.connection_database = DriverManager.getConnection(formatConnectionString(connectionDataBase));
		}
		return DatabaseConnection.connection_database;
	}

	@Override
	public String formatConnectionString(ConnectionDataBase connectionDataBase) {
		StringBuilder connectionString = new StringBuilder();
		connectionString.append("jdbc:sqlserver://")
				.append(connectionDataBase.getHost()).append(";")
				.append("databaseName=")
				.append(connectionDataBase.getDatabaseName())
				.append(";").append("user=")
				.append(connectionDataBase.getUsername()).append(";")
				.append("password=")
				.append(connectionDataBase.getPassword());
		return connectionString.toString();
	}

}
