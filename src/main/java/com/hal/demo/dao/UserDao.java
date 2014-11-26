package com.hal.demo.dao;

import java.util.List;

import com.hal.common.dao.IBaseDao;
import com.hal.demo.model.UserModel;
import com.hal.demo.model.UserQueryModel;


public interface UserDao extends IBaseDao<UserModel, Integer> {
    
    List<UserModel> query(int pn, int pageSize, UserQueryModel command);

    int countQuery(UserQueryModel command);

}
