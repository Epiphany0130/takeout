package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author GuYuqi
 * @version 1.0
 */
@Mapper
public interface SetmealDishMapper {

    /**
     * 根据菜品 id 查询套餐 id
     * @param dishIds
     * @return
     */
    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);


}
