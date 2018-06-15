package jp.co.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.example.dao.impl.AdminDao;
import jp.co.example.entity.Admin;
import jp.co.example.service.IAdminService;

@Service
@Transactional
public class AdminService implements IAdminService {

	@Autowired
	private AdminDao adminDao;

	@Override
    public Admin authentication(String id, String password) {
    	return adminDao.findByIdAndPassword(id, password);
    }
}
