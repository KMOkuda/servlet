package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Contact;

public class ContactDAO {
	// データベース接続に使用する情報
	private final String JDBC_URL = "jdbc:h2:tcp://localhost/~/hiiragi";
	private final String DB_USER = "sa";
	private final String DB_PASS = "pass";

	public boolean create(Contact contact) {

		try {
			Class.forName("org.h2.Driver");
			// データベースへ接続
			try (Connection conn = DriverManager.getConnection(
					JDBC_URL, DB_USER, DB_PASS)) {

				// SELECT文を準備
				String sql = "INSERT INTO CONTACT(NAME, FURIGANA, TEL, MAIL, COMMENT) VALUES (?, ?, ?, ?, ?)";
				PreparedStatement pStmt = conn.prepareStatement(sql);

				pStmt.setString(1, contact.getName());
				pStmt.setString(2, contact.getFurigana());
				pStmt.setString(3, contact.getTel());
				pStmt.setString(4, contact.getMail());
				pStmt.setString(5, contact.getComment());

				int result = pStmt.executeUpdate();
				if (result != 1) {
					return false;
				}

			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
			return true;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("ドライバのロードに失敗");
			return false;
		}
	}

	public List<Contact> read() {
		try {
			Class.forName("org.h2.Driver");
			// データベースへ接続
			try (Connection conn = DriverManager.getConnection(
					JDBC_URL, DB_USER, DB_PASS)) {

				List<Contact> contactList = new ArrayList<Contact>();

				// SELECT文を準備
				String sql = "SELECT * FROM CONTACT";
				PreparedStatement pStmt = conn.prepareStatement(sql);

				ResultSet rs = pStmt.executeQuery();

				while(rs.next()) {
					Contact contact = new Contact();

					contact.setId(Integer.parseInt(rs.getString("id")));
					contact.setName(rs.getString("name"));
					contact.setFurigana(rs.getString("furigana"));
					contact.setTel(rs.getString("tel"));
					contact.setMail(rs.getString("mail"));
					contact.setComment(rs.getString("comment"));

					contactList.add(contact);
				}

				return contactList;

			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("ドライバのロードに失敗");

			return null;
		}
	}
}