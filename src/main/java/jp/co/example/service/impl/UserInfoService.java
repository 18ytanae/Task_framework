package jp.co.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.example.dao.impl.UserInfoDao;
import jp.co.example.entity.UserInfo;
import jp.co.example.service.IUserInfoService;

@Service
@Transactional
public class UserInfoService implements IUserInfoService {

	@Autowired
	private UserInfoDao userInfoDao;

	@Override
	public List<UserInfo> find(UserInfo userInfo) {

		if (userInfo.isConditionsEmpty()) {
			return userInfoDao.findAll();
		} else {
			return userInfoDao.findByConditions(userInfo);
		}
	}

	@Override
	public UserInfo findById(Integer id) {
		return userInfoDao.findById(id);
	}

	@Override
	public int insert(UserInfo userInfo) {
		return userInfoDao.register(userInfo);
	}

	@Override
	public void update(UserInfo userInfo) {
		userInfoDao.update(userInfo);
	}

	@Override
	public void delete(Integer id) {
		userInfoDao.delete(id);
	}
}
