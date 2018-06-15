package jp.co.example.service;

import jp.co.example.entity.Admin;

public interface IAdminService {

	public Admin authentication(String id, String password);
}
