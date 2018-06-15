package jp.co.example.dao;

import jp.co.example.entity.Admin;

public interface IAdminDao {

	public Admin findByIdAndPassword(String id, String password);
}
