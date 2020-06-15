package com.crud.mytest.mapper;


import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserMapper {

    @Select(" select username,password from user")
    List<com.crud.mytest.entity.User> getUser();

}
