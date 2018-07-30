package com.yueer.demo.service;

public interface ISmUserService {
	public Boolean login(String username, String password);
	public Boolean register(String username, String password, String email);
}
