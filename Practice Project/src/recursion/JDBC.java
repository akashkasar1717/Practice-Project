package recursion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://192.168.0.96:5432/blogapplication", "postgres",
				"SPK@#2023");
		System.out.println("succ..");
		Statement statement = con.createStatement();
		String sql = "select pk_id from t_mst_verification_user_entity";
		ResultSet rs = statement.executeQuery(sql);
		List<Integer> aList = new ArrayList<Integer>();
		while (rs.next()) {
			aList.add(rs.getInt("pk_id"));
		}

		for(Integer a:aList) {
			System.out.println(a);
		}
	}
}
