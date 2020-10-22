package com.ali.service.impl;

import com.ali.dao.ProductsDao;
import com.ali.entity.Products;
import com.ali.service.ProductsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Products)表服务实现类
 *
 * @author makejava
 * @since 2020-10-21 20:45:39
 */
@Service("productsService")
public class ProductsServiceImpl implements ProductsService {
    @Resource
    private ProductsDao productsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pid 主键
     * @return 实例对象
     */
    @Override
    public Products queryById(String pid) {
        return this.productsDao.queryById(pid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Products> queryAllByLimit(int offset, int limit) {
        return this.productsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param products 实例对象
     * @return 实例对象
     */
    @Override
    public Products insert(Products products) {
        this.productsDao.insert(products);
        return products;
    }

    /**
     * 修改数据
     *
     * @param products 实例对象
     * @return 实例对象
     */
    @Override
    public Products update(Products products) {
        this.productsDao.update(products);
        return this.queryById(products.getPid());
    }

    /**
     * 通过主键删除数据
     *
     * @param pid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String pid) {
        return this.productsDao.deleteById(pid) > 0;
    }
}