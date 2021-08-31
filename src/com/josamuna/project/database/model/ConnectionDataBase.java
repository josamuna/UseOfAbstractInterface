package com.josamuna.project.database.model;

public class ConnectionDataBase {
	
	private String username;
	private String password;
	private String host;
	private String databaseName;
	private String driver;
	private String portNumber;
	private String path;
	
	public ConnectionDataBase() {
	}

	public ConnectionDataBase(String username, String password, String host, String databaseName, String driver, String portNumber,
			 String path) {
		this.username = username;
		this.password = password;
		this.host = host;
		this.databaseName = databaseName;
		this.driver = driver;
		this.portNumber = portNumber;
		this.path = path;
	}

	public ConnectionDataBase(String username, String password, String host, String databaseName, String driver, String portNumber) {
		this.username = username;
		this.password = password;
		this.host = host;
		this.databaseName = databaseName;
		this.driver = driver;
		this.portNumber = portNumber;
	}

	public ConnectionDataBase(String username, String password, String host, String databaseName, String driver) {
		this.username = username;
		this.password = password;
		this.host = host;
		this.databaseName = databaseName;
		this.driver = driver;
	}

	public ConnectionDataBase(String path) {
		this.path = path;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getDatabaseName() {
		return databaseName;
	}

	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getPortNumber() {
		return portNumber;
	}

	public void setPortNumber(String portNumber) {
		this.portNumber = portNumber;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
}
