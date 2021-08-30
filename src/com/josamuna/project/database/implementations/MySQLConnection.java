package com.josamuna.project.database.implementations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.josamuna.project.database.interfaces.IConnection;
import com.josamuna.project.database.model.ConnectionDataBase;

public class MySQLConnection implements IConnection {

	private static Connection connection = null;

	private MySQLConnection() {
	}

	@Override
	public Connection loadConnection() throws SQLException, ClassNotFoundException {

		ConnectionDataBase connectionDataBase = new ConnectionDataBase("josue", "localhost", "josue", "db_person", null,
				"3306");
		if (connection == null) {
			connection = DriverManager.getConnection(formatConnectionString(connectionDataBase));
		}
		return connection;
	}

	@Override
	public String formatConnectionString(ConnectionDataBase connectionDataBase) {
		StringBuilder connectionString = new StringBuilder();
		connectionString.append("jdbc:mysql://")
				.append(connectionDataBase.getHost())
				.append(connectionDataBase.getPortNumber())
				.append(connectionDataBase.getDatabaseName())
				.append("?user=").append(connectionDataBase.getUsername())
				.append("?password=")
				.append(connectionDataBase.getPassword())
				.append("&serverTimezone=UTC");
		return connectionString.toString();
	}

}
