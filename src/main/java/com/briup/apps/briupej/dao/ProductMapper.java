package com.briup.apps.briupej.dao;

import com.briup.apps.briupej.bean.Product;
import com.briup.apps.briupej.bean.ProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_product
     *
     * @mbg.generated Wed Jun 12 08:52:31 CST 2019
     */
    long countByExample(ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_product
     *
     * @mbg.generated Wed Jun 12 08:52:31 CST 2019
     */
    int deleteByExample(ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_product
     *
     * @mbg.generated Wed Jun 12 08:52:31 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_product
     *
     * @mbg.generated Wed Jun 12 08:52:31 CST 2019
     */
    int insert(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_product
     *
     * @mbg.generated Wed Jun 12 08:52:31 CST 2019
     */
    int insertSelective(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_product
     *
     * @mbg.generated Wed Jun 12 08:52:31 CST 2019
     */
    List<Product> selectByExample(ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_product
     *
     * @mbg.generated Wed Jun 12 08:52:31 CST 2019
     */
    Product selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_product
     *
     * @mbg.generated Wed Jun 12 08:52:31 CST 2019
     */
    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_product
     *
     * @mbg.generated Wed Jun 12 08:52:31 CST 2019
     */
    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_product
     *
     * @mbg.generated Wed Jun 12 08:52:31 CST 2019
     */
    int updateByPrimaryKeySelective(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_product
     *
     * @mbg.generated Wed Jun 12 08:52:31 CST 2019
     */
    int updateByPrimaryKey(Product record);
}