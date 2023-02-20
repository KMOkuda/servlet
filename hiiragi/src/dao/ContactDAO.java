package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}