package com.ali.controller;

import com.ali.entity.Products;
import com.ali.service.ProductsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Products)表控制层
 *
 * @author makejava
 * @since 2020-10-21 20:45:39
 */
@RestController
@RequestMapping("products")
public class ProductsController {
    /**
     * 服务对象
     */
    @Resource
    private ProductsService productsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Products selectOne(String id) {
        return this.productsService.queryById(id);
    }

}