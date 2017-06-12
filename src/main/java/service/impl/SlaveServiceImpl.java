package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import commons.annotation.DataSourceChange;
import dao.SlaveMapper;
import service.SlaveService;

@Service
public class SlaveServiceImpl implements SlaveService {

	@Autowired
	private SlaveMapper slaveMapper;
	
	@Override
	@DataSourceChange(slave = false)
	public Integer count() {
		return slaveMapper.count();
	}

	@Override
	@DataSourceChange(slave = true)
	public Integer count2() {
		return slaveMapper.count2();
	}

}
