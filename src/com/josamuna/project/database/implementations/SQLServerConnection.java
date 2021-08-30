package com.josamuna.project.database.implementations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.josamuna.project.database.interfaces.IConnection;
import com.josamuna.project.database.model.ConnectionDataBase;

public class SQLServerConnection implements IConnection {

	private static Connection connection = null;

	private SQLServerConnection() {
	}

	@Override
	public Connection loadConnection() throws SQLException, ClassNotFoundException {

		ConnectionDataBase connectionDataBase = new ConnectionDataBase("josue", "josue", "localhost", "db_person",
				"com.microsoft.sqlserver.jdbc.SQLServerDriver");
		if (connection == null) {
			connection = DriverManager.getConnection(formatConnectionString(connectionDataBase));
		}
		return connection;
	}

	@Override
	public String formatConnectionString(ConnectionDataBase connectionDataBase) {

		StringBuilder connectionString = new StringBuilder();
		connectionString.append("jdbc:sqlserver://").append(connectionDataBase.getHost())
				.append("databaseName=")
				.append(connectionDataBase.getDatabaseName())
				.append(";").append("user=")
				.append(connectionDataBase
				.getUsername()).append(";")
				.append("password=")
				.append(connectionDataBase.getPassword());
		return connectionString.toString();
	}

}
