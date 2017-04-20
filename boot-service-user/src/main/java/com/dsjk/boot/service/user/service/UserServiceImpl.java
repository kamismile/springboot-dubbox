package com.dsjk.boot.service.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.dsjk.boot.common.base.BaseService;
import com.dsjk.boot.common.base.Global;
import com.dsjk.boot.common.bean.user.SysUser;
import com.dsjk.boot.common.service.user.UserService;
import com.dsjk.boot.service.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author fengcheng
 * @version 2017/2/28
 */
@Component
@Transactional(readOnly = true)
@Service(interfaceClass = UserService.class, group = Global.DUBBO_GROUP)
public class UserServiceImpl extends BaseService<SysUser> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public SysUser getUserBySql(String id) {
        return userMapper.getUserBySql(id);
    }

    @Override
    @Transactional
    public int save(SysUser entity) {
        super.save(entity);
        return 1;
    }
}
