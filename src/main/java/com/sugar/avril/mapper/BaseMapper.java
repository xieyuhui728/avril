package com.sugar.avril.mapper;

import com.sugar.avril.domain.User;

import java.util.List;

/**
 * @Auther: xieyuhui
 * @Date: 2019-01-06 20:29
 * @Description:
 */
public interface BaseMapper<T> {

    List<T> getAll();

    T getOne(Long i);

    int insert(T t);

}
