package com.dengxing.mallums.service;

import com.dengxing.mallums.entity.UmsRoleMenuRelation;
import java.util.List;

/**
 * 后台角色菜单关系表(UmsRoleMenuRelation)表服务接口
 *
 * @author makejava
 * @since 2021-01-29 15:37:57
 */
public interface UmsRoleMenuRelationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsRoleMenuRelation queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UmsRoleMenuRelation> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param umsRoleMenuRelation 实例对象
     * @return 实例对象
     */
    UmsRoleMenuRelation insert(UmsRoleMenuRelation umsRoleMenuRelation);

    /**
     * 修改数据
     *
     * @param umsRoleMenuRelation 实例对象
     * @return 实例对象
     */
    UmsRoleMenuRelation update(UmsRoleMenuRelation umsRoleMenuRelation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}