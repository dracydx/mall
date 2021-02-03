package com.dengxing.mallums.service.impl;

import com.dengxing.mallums.entity.UmsPermission;
import com.dengxing.mallums.dao.UmsPermissionDao;
import com.dengxing.mallums.service.UmsPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 后台用户权限表(UmsPermission)表服务实现类
 *
 * @author makejava
 * @since 2021-01-29 15:37:17
 */
@Service("umsPermissionService")
public class UmsPermissionServiceImpl implements UmsPermissionService {
    @Resource
    private UmsPermissionDao umsPermissionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsPermission queryById(Long id) {
        return this.umsPermissionDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UmsPermission> queryAllByLimit(int offset, int limit) {
        return this.umsPermissionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param umsPermission 实例对象
     * @return 实例对象
     */
    @Override
    public UmsPermission insert(UmsPermission umsPermission) {
        this.umsPermissionDao.insert(umsPermission);
        return umsPermission;
    }

    /**
     * 修改数据
     *
     * @param umsPermission 实例对象
     * @return 实例对象
     */
    @Override
    public UmsPermission update(UmsPermission umsPermission) {
        this.umsPermissionDao.update(umsPermission);
        return this.queryById(umsPermission.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsPermissionDao.deleteById(id) > 0;
    }
}