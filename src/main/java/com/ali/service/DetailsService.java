package com.ali.service;

import com.ali.entity.Details;

import java.util.List;

/**
 * (Details)表服务接口
 *
 * @author makejava
 * @since 2020-10-21 20:45:37
 */
public interface DetailsService {

    /**
     * 通过ID查询单条数据
     *
     * @param did 主键
     * @return 实例对象
     */
    Details queryById(String did);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Details> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param details 实例对象
     * @return 实例对象
     */
    Details insert(Details details);

    /**
     * 修改数据
     *
     * @param details 实例对象
     * @return 实例对象
     */
    Details update(Details details);

    /**
     * 通过主键删除数据
     *
     * @param did 主键
     * @return 是否成功
     */
    boolean deleteById(String did);

}