package kcp.servlet.dao;

import kcp.servlet.bo.CustomerBO;

public interface CustomerDAO {
	public int InsertData(CustomerBO bo)throws Exception;
}
