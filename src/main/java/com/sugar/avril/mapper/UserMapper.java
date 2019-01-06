package com.sugar.avril.mapper;

import com.sugar.avril.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * @Auther: xieyuhui
 * @Date: 2019-01-06 15:54
 * @Description:
 */
@Mapper
public interface UserMapper {

//    void insert(User t);
//
//    @Select("SELECT * FROM user WHERE id = #{id}")
//    @Results(value = {
//            @Result(property = "cname", column = "cname"),
//            @Result(property = "ename", column = "ename"),
//            @Result(property = "age", column = "age"),
//            @Result(property = "createTime", column = "create_time"),
//            @Result(property = "updateTime", column = "update_time")
//    })
//    User getOne(int id);

    String getTest();
}
