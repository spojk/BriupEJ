package com.briup.apps.briupej.service;

import com.briup.apps.briupej.bean.Category;
import com.briup.apps.briupej.bean.CategoryExample;

import java.util.List;

/**
 * @author 刘帅男
 * @date 2019/6/13 13:55
 */
public interface ICategoryService {

    int insert (Category category) throws Exception;

    int deleteByPrimaryKey(Long id) throws Exception;

    int updateByPrimaryKey(Category category) throws Exception;

    List<Category> selectByExample(CategoryExample categoryExample);

    Category selectByPrimaryKey(Long id);

    void batchDelete(Long[] ids) throws Exception;
}
