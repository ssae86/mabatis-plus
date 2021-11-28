package com.cda.user.service.impl;

import com.cda.user.entity.User;
import com.cda.user.mapper.UserMapper;
import com.cda.user.service.IUserService;
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
