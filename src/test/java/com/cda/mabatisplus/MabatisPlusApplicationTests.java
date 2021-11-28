package com.cda.mabatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cda.mabatisplus.mapper.UserMapper;
import com.cda.mabatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Wrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
class MabatisPlusApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void testSelect(){
        List<User> list = userMapper.selectList(null);
        list.forEach(System.out::println);
    }
    @Test
    void testinsert(){
        User user = new User();
        user.setAge(20);
        user.setEmail("qqqqq@qq.com");
        user.setName("张三4");
        user.setGender(1);

        int insert = userMapper.insert(user);
        System.out.println(insert);
        System.out.println(user);

    }
    @Test
    void testUpdate(){
        User user = new User();
        user.setId(1);
        user.setName("我是嫩爹");
        user.setGender(0);
        userMapper.updateById(user);
    }

    @Test
    void testOptimisticLockerInsert(){
        User user = new User();
        user.setName("我是嫩爹");
        user.setEmail("1212112@qq.com");
        user.setGender(0);
        int update = userMapper.insert(user);
        System.out.println(update);
        System.out.println(user);
    }
    @Test
    void testOptimisticLockerUpdate(){
        User user = userMapper.selectById(29454343);
        user.setName("我是嫩爹");
        user.setEmail("55555@qq.com");
        user.setGender(1);
        int update = userMapper.updateById(user);
        System.out.println(update);
        System.out.println(user);
    }
    @Test
    void testSelectByBatchId(){
        List<User> userList = userMapper.selectBatchIds(Arrays.asList(1, 2, 3));
        userList.forEach(System.out::println);
    }

    @Test
    void testSelectByMap(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("name","张三");
        map.put("gender",1);
        List<User> users = userMapper.selectByMap(map);
        users.forEach(System.out::println);
    }

    /*
    * 分页插件
    * */
    @Test
    void testSelectPage(){
        Page<User> page = new Page<>(2,3);
//        Page<User> result = userMapper.selectPage(page, null);
        Page<User> result = userMapper.selectPage(page, Wrappers.<User>lambdaQuery().ge(User::getAge,10));
        List<User> list = page.getRecords();
        list.forEach(System.out::println);
    }

    @Test
    void testWrapper(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        //查询age>=10
        //支持链式编程
        wrapper.ge("age",10)
                .isNotNull("name");
        int delete = userMapper.delete(wrapper);
        System.out.println(delete);
    }

    //in notin insql notinsql exists notexists
    @Test
    void testWrapper2(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        //查询结果只返回第一个字段的值
        wrapper.inSql("id","select id from user where id<3");
        List<Object> objects = userMapper.selectObjs(wrapper);
        System.out.println(objects);
    }


}
