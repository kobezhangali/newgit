package com.ali.dao;

import com.ali.entity.Details;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Details)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-21 20:45:37
 */
public interface DetailsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param did 主键
     * @return 实例对象
     */
    Details queryById(String did);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Details> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param details 实例对象
     * @return 对象列表
     */
    List<Details> queryAll(Details details);

    /**
     * 新增数据
     *
     * @param details 实例对象
     * @return 影响行数
     */
    int insert(Details details);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Details> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Details> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Details> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Details> entities);

    /**
     * 修改数据
     *
     * @param details 实例对象
     * @return 影响行数
     */
    int update(Details details);

    /**
     * 通过主键删除数据
     *
     * @param did 主键
     * @return 影响行数
     */
    int deleteById(String did);

}