package com.fluentgrid.mdms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fluentgrid.mdms.dao.RequestTypeMDao;
import com.fluentgrid.mdms.service.RequestTypeMService;
import com.fluentgrid.mdms.vo.RequestTypeM;

@Service
public class RequestTypeMServiceImpl implements RequestTypeMService {
	
	@Autowired
	private RequestTypeMDao requestTypeMDao;

	@Override
	public List<RequestTypeM> getRequestTypeM() {
		return requestTypeMDao.getRequestTypeM();
	}

}
