package it.pcacademy.corsojava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainSqlite {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		System.out.println("\n0) inizializzazione.............................");
		// carichiamo il bridge per SQLite
		Class.forName("org.sqlite.JDBC");
		// NOTA: per sqlite non serve password in realtà!
		Connection conn = DriverManager.getConnection("jdbc:sqlite:file/Chinook.db", "root", "root");

		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select Title,Name from Album,Artist WHERE Album.ArtistId=Artist.ArtistId;");
		while (rs.next()) {
			String name = rs.getString("Name");
			String title = rs.getString("Title");
			String text = String.format("name: %1s\t| Title: %2s", name, title);
			System.out.println(text);
		}
		rs.close();
		stmt.close();
	}

}
