package com.aa.service;

import com.aa.entity.Types;

import java.util.List;

/**
 * (Types)表服务接口
 *
 * @author makejava
 * @since 2020-10-21 20:45:39
 */
public interface TypesService {

    /**
     * 通过ID查询单条数据
     *
     * @param tid 主键
     * @return 实例对象
     */
    Types queryById(String tid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Types> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param types 实例对象
     * @return 实例对象
     */
    Types insert(Types types);

    /**
     * 修改数据
     *
     * @param types 实例对象
     * @return 实例对象
     */
    Types update(Types types);

    /**
     * 通过主键删除数据
     *
     * @param tid 主键
     * @return 是否成功
     */
    boolean deleteById(String tid);

}