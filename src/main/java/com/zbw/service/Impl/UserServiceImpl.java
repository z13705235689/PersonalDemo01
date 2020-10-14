package com.zbw.service.Impl;

import com.zbw.dao.Impl.UserDaoImpl;
import com.zbw.dao.UserDao;
import com.zbw.model.User;
import com.zbw.service.UserService;

public class UserServiceImpl implements UserService {

    UserDao dao = new UserDaoImpl();
    @Override
    public void login(User user) {
        dao.login(user);
    }
}
