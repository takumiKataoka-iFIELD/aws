package jp.co.aws.mapper;

import jp.co.aws.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    void insertUser(UserEntity user);
}
