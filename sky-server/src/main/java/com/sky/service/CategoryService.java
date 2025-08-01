package com.sky.service;

import com.sky.dto.CategoryDTO;

/**
 * @author GuYuqi
 * @version 1.0
 */
public interface CategoryService {

    /**
     * 新增分类
     * @param categoryDTO
     */
    void save(CategoryDTO categoryDTO);
}
