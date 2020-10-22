package com.aa.service.impl;

import com.aa.dao.TypesDao;
import com.aa.entity.Types;
import com.aa.service.TypesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Types)表服务实现类
 *
 * @author makejava
 * @since 2020-10-21 20:45:39
 */
@Service("typesService")
public class TypesServiceImpl implements TypesService {
    @Resource
    private TypesDao typesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param tid 主键
     * @return 实例对象
     */
    @Override
    public Types queryById(String tid) {
        return this.typesDao.queryById(tid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Types> queryAllByLimit(int offset, int limit) {
        return this.typesDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param types 实例对象
     * @return 实例对象
     */
    @Override
    public Types insert(Types types) {
        this.typesDao.insert(types);
        return types;
    }

    /**
     * 修改数据
     *
     * @param types 实例对象
     * @return 实例对象
     */
    @Override
    public Types update(Types types) {
        this.typesDao.update(types);
        return this.queryById(types.getTid());
    }

    /**
     * 通过主键删除数据
     *
     * @param tid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String tid) {
        return this.typesDao.deleteById(tid) > 0;
    }
}