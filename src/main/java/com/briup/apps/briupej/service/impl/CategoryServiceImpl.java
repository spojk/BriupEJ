package com.briup.apps.briupej.service.impl;

import com.briup.apps.briupej.bean.Category;
import com.briup.apps.briupej.bean.CategoryExample;
import com.briup.apps.briupej.bean.extend.CategoryExtend;
import com.briup.apps.briupej.mapper.CategoryMapper;
import com.briup.apps.briupej.mapper.extend.CategoryExtendMapper;
import com.briup.apps.briupej.service.ICategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 刘帅男
 * @date 2019/6/13 14:08
 */

@Service
public abstract class CategoryServiceImpl implements ICategoryService {
    @Resource
    private CategoryMapper categoryMapper;
    @Resource
    private CategoryExtendMapper categoryExtendMapper;
    @Override
    public int insert(Category category){
        return categoryMapper.insert(category);
    }

    @Override
    public int deleteByPrimaryKey(Long id){
        return categoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(Category category){
        return categoryMapper.updateByPrimaryKey(category);
    }

    @Override
    public List<Category> selectByExample(CategoryExample categoryExample){
        return categoryMapper.selectByExample(new CategoryExample());
    }

    @Override
    public Category selectByPrimaryKey(Long id){
        return categoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public void batchDelete(Long[] ids){
        for (Long id: ids){
            categoryMapper.selectByPrimaryKey(id);
        }
    }
    @Override
    public List<CategoryExtend> findAllP(Long id) {

        return categoryExtendMapper.findAllP(id);

    }

}
