package kcp.servlet.service;

import kcp.servlet.dto.CustomerDTO;

public interface CustomerService {
	public String processData(CustomerDTO dto) throws Exception;
}
