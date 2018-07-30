package com.yueer.demo.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yueer.demo.dao.SmUserMapper;
import com.yueer.demo.model.SmUserExample;

public class SmUserService implements ISmUserService {
	
	private static SmUserMapper smUserMapper;
	
	static {
		smUserMapper = (SmUserMapper) new ClassPathXmlApplicationContext("classpath:applicationContext.xml").getBean("smUserMapper");
	}
	
	public Boolean login(String username, String password) {
		SmUserExample smUserExample = new SmUserExample();
		SmUserExample.Criteria criteria = smUserExample.createCriteria();
		criteria.andUsernameEqualTo(username);
		criteria.andPasswordEqualTo(password);
		return smUserMapper.countByExample(smUserExample) == 1;
	};
	public Boolean register(String username, String password, String email) {
		return true;
	};
}
