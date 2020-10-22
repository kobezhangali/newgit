package com.ali.controller;

import com.ali.entity.Details;
import com.ali.service.DetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Details)表控制层
 *
 * @author makejava
 * @since 2020-10-21 20:45:37
 */
@RestController
@RequestMapping("details")
public class DetailsController {
    /**
     * 服务对象
     */
    @Resource
    private DetailsService detailsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Details selectOne(String id) {
        return this.detailsService.queryById(id);
    }

}