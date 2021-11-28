package com.cdauser.service.impl;

import com.cdauser.entity.User;
import com.cdauser.mapper.UserMapper;
import com.cdauser.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cda
 * @since 2021-11-13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
