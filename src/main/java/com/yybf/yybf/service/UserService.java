package com.yybf.yybf.service;

import com.github.pagehelper.PageHelper;
import com.yybf.yybf.dao.UserMapper;
import com.yybf.yybf.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yhg
 *
 */
@Service
public class UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User getPasswordByid(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }


    public List<User> getAll(){
        PageHelper.startPage(1,5);

        List<User> user_list = userMapper.getAllUser();
//        for(User user : user_list){
//            System.out.println(user.getId()+","+user.getUsername()+","+user.getPassword());
//        }
        return user_list;
    }
}
