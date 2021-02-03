package com.dengxing.mallums.service.impl;

import com.dengxing.mallums.entity.UmsRoleMenuRelation;
import com.dengxing.mallums.dao.UmsRoleMenuRelationDao;
import com.dengxing.mallums.service.UmsRoleMenuRelationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 后台角色菜单关系表(UmsRoleMenuRelation)表服务实现类
 *
 * @author makejava
 * @since 2021-01-29 15:37:57
 */
@Service("umsRoleMenuRelationService")
public class UmsRoleMenuRelationServiceImpl implements UmsRoleMenuRelationService {
    @Resource
    private UmsRoleMenuRelationDao umsRoleMenuRelationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsRoleMenuRelation queryById(Long id) {
        return this.umsRoleMenuRelationDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UmsRoleMenuRelation> queryAllByLimit(int offset, int limit) {
        return this.umsRoleMenuRelationDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param umsRoleMenuRelation 实例对象
     * @return 实例对象
     */
    @Override
    public UmsRoleMenuRelation insert(UmsRoleMenuRelation umsRoleMenuRelation) {
        this.umsRoleMenuRelationDao.insert(umsRoleMenuRelation);
        return umsRoleMenuRelation;
    }

    /**
     * 修改数据
     *
     * @param umsRoleMenuRelation 实例对象
     * @return 实例对象
     */
    @Override
    public UmsRoleMenuRelation update(UmsRoleMenuRelation umsRoleMenuRelation) {
        this.umsRoleMenuRelationDao.update(umsRoleMenuRelation);
        return this.queryById(umsRoleMenuRelation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsRoleMenuRelationDao.deleteById(id) > 0;
    }
}