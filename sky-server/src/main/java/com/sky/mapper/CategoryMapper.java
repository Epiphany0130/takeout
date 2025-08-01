package com.sky.mapper;

import com.sky.entity.Category;
import org.apache.ibatis.annotations.Insert;

/**
 * @author GuYuqi
 * @version 1.0
 */
public interface CategoryMapper {

    /**
     * 插入数据
     * @param category
     */
    @Insert("insert into category(type, name, sort, status, create_time, update_time, create_user, update_user) " +
            "values " +
            "(#{type}, #{name}, #{sort}, #{status}, #{createTime}, #{updateTime}, #{createUser}, #{updateUser})")
    void insert(Category category);
}
