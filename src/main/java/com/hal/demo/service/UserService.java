package com.hal.demo.service;

import com.hal.common.pagination.Page;
import com.hal.common.service.IBaseService;
import com.hal.demo.model.UserModel;
import com.hal.demo.model.UserQueryModel;

/**
 * User: Zhang Kaitao
 * Date: 12-1-4 上午10:13
 * Version: 1.0
 */
public interface UserService extends IBaseService<UserModel, Integer> {

    Page<UserModel> query(int pn, int pageSize, UserQueryModel command);
}
