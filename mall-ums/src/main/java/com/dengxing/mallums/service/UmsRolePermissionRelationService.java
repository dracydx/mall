package com.dengxing.mallums.service;

import com.dengxing.mallums.entity.UmsRolePermissionRelation;
import java.util.List;

/**
 * 后台用户角色和权限关系表(UmsRolePermissionRelation)表服务接口
 *
 * @author makejava
 * @since 2021-01-29 15:38:57
 */
public interface UmsRolePermissionRelationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsRolePermissionRelation queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UmsRolePermissionRelation> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param umsRolePermissionRelation 实例对象
     * @return 实例对象
     */
    UmsRolePermissionRelation insert(UmsRolePermissionRelation umsRolePermissionRelation);

    /**
     * 修改数据
     *
     * @param umsRolePermissionRelation 实例对象
     * @return 实例对象
     */
    UmsRolePermissionRelation update(UmsRolePermissionRelation umsRolePermissionRelation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}