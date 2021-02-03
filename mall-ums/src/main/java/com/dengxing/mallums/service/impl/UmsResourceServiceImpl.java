package com.dengxing.mallums.service.impl;

import com.dengxing.mallums.entity.UmsResource;
import com.dengxing.mallums.dao.UmsResourceDao;
import com.dengxing.mallums.service.UmsResourceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 后台资源表(UmsResource)表服务实现类
 *
 * @author makejava
 * @since 2021-01-29 16:31:51
 */
@Service("umsResourceService")
public class UmsResourceServiceImpl implements UmsResourceService {
    @Resource
    private UmsResourceDao umsResourceDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsResource queryById(Long id) {
        return this.umsResourceDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UmsResource> queryAllByLimit(int offset, int limit) {
        return this.umsResourceDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param umsResource 实例对象
     * @return 实例对象
     */
    @Override
    public UmsResource insert(UmsResource umsResource) {
        this.umsResourceDao.insert(umsResource);
        return umsResource;
    }

    /**
     * 修改数据
     *
     * @param umsResource 实例对象
     * @return 实例对象
     */
    @Override
    public UmsResource update(UmsResource umsResource) {
        this.umsResourceDao.update(umsResource);
        return this.queryById(umsResource.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsResourceDao.deleteById(id) > 0;
    }
}