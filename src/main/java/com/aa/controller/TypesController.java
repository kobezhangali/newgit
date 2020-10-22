package com.aa.controller;

import com.aa.entity.Types;
import com.aa.service.TypesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Types)表控制层
 *
 * @author makejava
 * @since 2020-10-21 20:45:39
 */
@RestController
@RequestMapping("types")
public class TypesController {
    /**
     * 服务对象
     */
    @Resource
    private TypesService typesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Types selectOne(String id) {
        return this.typesService.queryById(id);
    }

}