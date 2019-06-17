package com.briup.apps.briupej.web.controller;

import com.briup.apps.briupej.bean.Category;
import com.briup.apps.briupej.bean.CategoryExample;
import com.briup.apps.briupej.bean.extend.CategoryExtend;
import com.briup.apps.briupej.service.ICategoryService;
import com.briup.apps.briupej.service.IProductService;
import com.briup.apps.briupej.utils.Message;
import com.briup.apps.briupej.utils.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 刘帅男
 * @date 2019/6/13 14:13
 */
@Api(description = "分类管理相关接口")
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Resource
    private ICategoryService categoryService;
    @Resource
    private IProductService productService;

    @ApiOperation("插入数据")
    @GetMapping("/insert")
    public Message insert(Category category){
        try{
            categoryService.insert(category);
            return MessageUtil.success("插入成功！");
        }
        catch (Exception e){
            return  MessageUtil.error("插入失败！"+e.getMessage());
        }
    }

    @ApiOperation("通过ID删除数据")
    @GetMapping("/deleteByPrimaryKey")
    public Message deleteByPrimaryKey(Long id){
        try {
            categoryService.deleteByPrimaryKey(id);
            return  MessageUtil.success("删除成功！");
        }
        catch (Exception e){
            return  MessageUtil.error("删除失败！");
        }
    }

    @ApiOperation("通过ID修改数据")
    @GetMapping("/updateByPrimaryKey")
    public Message updateByPrimaryKey(Category category){
        try{
            categoryService.updateByPrimaryKey(category);
            return MessageUtil.success("更新成功！");
        }
        catch (Exception e) {
            return MessageUtil.error("更新失败！");
        }
    }

    @ApiOperation("查询所有")
    @GetMapping("/selectByExample")
    public Message selectByExample(){
        List<Category> categories = categoryService.selectByExample(new CategoryExample());
        return MessageUtil.success("查询成功！" ,categories);
    }

    @ApiOperation(" 通过ID查询数据")
    @GetMapping("/selectByPrimaryKey")
    public Message selectByPrimary(Long id){
        Category category = categoryService.selectByPrimaryKey(id);
        if (category == null) {
            return MessageUtil.error("查询不存在！");
        }
        return MessageUtil.success("查询成功！",category);
    }

    @ApiOperation("批量删除Category")
    @GetMapping("/batchDelete")
    public Message batchDelete(Long[] ids){
        if (ids==null){
            return MessageUtil.error("失败!");
        }
        try {
            categoryService.batchDelete(ids);
            return MessageUtil.success("成功!");
        } catch (Exception e) {
            return MessageUtil.error("失败!");
        }

    }
    @ApiOperation("通过id查询商品")
    @GetMapping("findAllP")
    public Message findAllP(Long id) {
        List<CategoryExtend> list=categoryService.findAllP(id);
        return MessageUtil.success("sucess",list);

    }
}
