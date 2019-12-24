package kcp.servlet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;

import kcp.servlet.bo.CustomerBO;

public class CustomerDAOImpl implements CustomerDAO {
	private static final String sql = "insert into customerOrderItem values(?,?,?,?,?)";
	Connection con = null;
	PreparedStatement ps = null;
	int res = 0;
	long orderId = 0;

	@Override
	public int InsertData(CustomerBO bo) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "kalia");
		ps = con.prepareStatement(sql);
		orderId = new Random().nextInt(987654321);
		ps.setLong(1, orderId);
		ps.setString(2, bo.getCustomerName());
		ps.setDouble(3, bo.getBillAmount());
		ps.setDouble(4, bo.getDiscountAmount());
		ps.setDouble(5, bo.getFinalAmount());
		int res = ps.executeUpdate();
		ps.close();
		con.close();
		return res;
	}

}
