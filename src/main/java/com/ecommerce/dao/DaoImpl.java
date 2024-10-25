package com.ecommerce.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.rowset.serial.SerialBlob;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ecommerce.model.Preferences;

//@Service
public class DaoImpl implements PreferencesDao{

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String dburl = "jdbc:mysql://localhost:3306/limitSettings";
	static final String dbuser = "root";
	static final String dbpass = "bluebird";

	Connection con = null;
	Statement stmt = null;

	public DaoImpl() {
		try {
			con = DriverManager.getConnection(dburl, dbuser, dbpass);

			if (con.isClosed()) {
				System.out.println("Connection closed");
			} else {
				System.out.println("Connection open");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		DaoImpl impl = new DaoImpl();

		impl.test();
	}

	public void savePreferences(Preferences model) {

	    System.out.println("savePreferences----------");
	    this.jdbcTemplate.execute("select * from preferences");
	    
	    this.jdbcTemplate.getMaxRows();
		/*
		 * try { Preferences preferences =
		 * jdbcTemplate.queryForObject("SELECT * FROM tutorials WHERE id=?",
		 * BeanPropertyRowMapper.newInstance(Preferences.class), id);
		 * 
		 * // return preferences; } catch (IncorrectResultSizeDataAccessException e) {
		 * return null; }
		 */
	}

	public void test(MultipartFile multipartFile) {

		System.out.println("Test db connection");
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement("insert into customers values(?, ?, ?,?, ?)", Statement.RETURN_GENERATED_KEYS);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Step 2 : Initialize Statement

		SerialBlob blob = null;
		// blob = new SerialBlob(multipartFile.getBytes() );

		FileInputStream fin = null;
		// Step 4 : Run Query
		try {
			// pstmt.setInt(1,101);//1 specifies the first parameter in the query
			pstmt.setString(1, null);
			pstmt.setString(2, "Mike");
			pstmt.setString(3, "doe");
			pstmt.setString(4, "doe");
			try {
				fin = new FileInputStream("C:\\Users\\sky.png");
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				System.out.println(multipartFile.getInputStream().read());
				pstmt.setBinaryStream(5, fin);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void test() {

	}

}
