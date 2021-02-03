package com.dengxing.mallums.service.impl;

import com.dengxing.mallums.entity.UmsRolePermissionRelation;
import com.dengxing.mallums.dao.UmsRolePermissionRelationDao;
import com.dengxing.mallums.service.UmsRolePermissionRelationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 后台用户角色和权限关系表(UmsRolePermissionRelation)表服务实现类
 *
 * @author makejava
 * @since 2021-01-29 15:38:57
 */
@Service("umsRolePermissionRelationService")
public class UmsRolePermissionRelationServiceImpl implements UmsRolePermissionRelationService {
    @Resource
    private UmsRolePermissionRelationDao umsRolePermissionRelationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsRolePermissionRelation queryById(Long id) {
        return this.umsRolePermissionRelationDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UmsRolePermissionRelation> queryAllByLimit(int offset, int limit) {
        return this.umsRolePermissionRelationDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param umsRolePermissionRelation 实例对象
     * @return 实例对象
     */
    @Override
    public UmsRolePermissionRelation insert(UmsRolePermissionRelation umsRolePermissionRelation) {
        this.umsRolePermissionRelationDao.insert(umsRolePermissionRelation);
        return umsRolePermissionRelation;
    }

    /**
     * 修改数据
     *
     * @param umsRolePermissionRelation 实例对象
     * @return 实例对象
     */
    @Override
    public UmsRolePermissionRelation update(UmsRolePermissionRelation umsRolePermissionRelation) {
        this.umsRolePermissionRelationDao.update(umsRolePermissionRelation);
        return this.queryById(umsRolePermissionRelation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsRolePermissionRelationDao.deleteById(id) > 0;
    }
}