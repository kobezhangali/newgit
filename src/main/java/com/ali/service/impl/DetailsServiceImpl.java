package com.ali.service.impl;

import com.ali.dao.DetailsDao;
import com.ali.entity.Details;
import com.ali.service.DetailsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Details)表服务实现类
 *
 * @author makejava
 * @since 2020-10-21 20:45:37
 */
@Service("detailsService")
public class DetailsServiceImpl implements DetailsService {
    @Resource
    private DetailsDao detailsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param did 主键
     * @return 实例对象
     */
    @Override
    public Details queryById(String did) {
        return this.detailsDao.queryById(did);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Details> queryAllByLimit(int offset, int limit) {
        return this.detailsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param details 实例对象
     * @return 实例对象
     */
    @Override
    public Details insert(Details details) {
        this.detailsDao.insert(details);
        return details;
    }

    /**
     * 修改数据
     *
     * @param details 实例对象
     * @return 实例对象
     */
    @Override
    public Details update(Details details) {
        this.detailsDao.update(details);
        return this.queryById(details.getDid());
    }

    /**
     * 通过主键删除数据
     *
     * @param did 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String did) {
        return this.detailsDao.deleteById(did) > 0;
    }
}