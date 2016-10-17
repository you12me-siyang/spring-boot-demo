package sy.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sy.dao.mapper.UserMapper;
import sy.model.User;
import sy.service.user.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User get(Long userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

}
