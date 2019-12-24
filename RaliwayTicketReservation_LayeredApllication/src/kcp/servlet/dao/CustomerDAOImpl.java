package kcp.servlet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import kcp.servlet.bo.CustomerBO;

public class CustomerDAOImpl implements CustomerDAO {
	private static final String sql = "insert into raliwaytable values(?,?,?,?,?,?,?,?)";
	Connection con = null;
	PreparedStatement ps = null;
	int res = 0;

	@Override
	public int insrtData(CustomerBO bo) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "kalia");
		ps = con.prepareStatement(sql);
		ps.setLong(1, bo.getPNRno());
		ps.setString(2,bo.getCustomerName());
		ps.setString(3,bo.getSource());
		ps.setString(4,bo.getDestination());
		ps.setDouble(5,bo.getDistance());
		ps.setDouble(6,bo.getPrice());
		ps.setDouble(7, bo.getDiscountAmount());
		ps.setDouble(8,bo.getTotalPrice());
		int result =ps.executeUpdate();
		return result;
	}

}
