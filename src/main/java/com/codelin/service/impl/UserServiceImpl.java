package com.codelin.service.impl;

import com.codelin.dao.UserDao;
import com.codelin.entity.User;
import com.codelin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void register(User user) {
        user.setId(UUID.randomUUID().toString());
        userDao.save(user);
    }
}
