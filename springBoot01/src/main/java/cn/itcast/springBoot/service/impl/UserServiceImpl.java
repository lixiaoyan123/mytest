package cn.itcast.springBoot.service.impl;

import org.springframework.stereotype.Service;

import cn.itcast.springBoot.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public void save() {
		
		System.out.println("-----------save----------");

	}

}
