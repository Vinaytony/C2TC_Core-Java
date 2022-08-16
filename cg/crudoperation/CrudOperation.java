package com.cg.crudoperation;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.cg.util.DBUtil;

public class CrudOperation {
	
	public static void createStudent() throws SQLException {
		Connection connection = DBUtil.getConnection();
		Statement st = connection.createStatement();
		String sqlinsert = "INSERT INTO students(name, branch, gender, college)"+"values('Vinay','MT','M','AIT')";
		int execute = st.executeUpdate(sqlinsert);
		if(execute==1) {
			System.out.println("entry is added");
		}
		
		String sqlinsert2 = "INSERT INTO students(name, branch, gender, college)"+"values('Dorendra','MT','M','AIT')";
		int execute2 = st.executeUpdate(sqlinsert2);
		if(execute2==1) {
			System.out.println("entry is added");
		}
		
		String sqlinsert3 = "INSERT INTO students(name, branch, gender, college)"+"values('Dorendra','MT','M','AIT')";
		int execute3 = st.executeUpdate(sqlinsert3);
		if(execute3==1) {
			System.out.println("entry is added");
		}
	}

}
