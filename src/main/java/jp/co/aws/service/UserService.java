package jp.co.aws.service;

import jp.co.aws.mapper.UserMapper;
import jp.co.aws.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void insert(UserEntity user){
        userMapper.insertUser(user);
    }
}
