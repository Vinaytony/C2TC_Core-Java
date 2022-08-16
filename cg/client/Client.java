package com.cg.client;

import java.sql.Connection;

import com.cg.util.DBUtil;

public class Client {

	public static void main(String[] args) {
		Connection connection = DBUtil.getConnection();
		if(connection != null) {
			System.out.println("JDBC: Connection is established");
		}

	}

}
