package kcp.servlet.service;

import kcp.servlet.dto.CustomerDTO;

public interface CustomerService {
	public String ProcessData(CustomerDTO dto) throws Exception;
}
