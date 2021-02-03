package com.dengxing.mallums.service;

import com.dengxing.mallums.entity.UmsRole;
import java.util.List;

/**
 * 后台用户角色表(UmsRole)表服务接口
 *
 * @author makejava
 * @since 2021-01-29 15:13:49
 */
public interface UmsRoleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsRole queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UmsRole> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param umsRole 实例对象
     * @return 实例对象
     */
    UmsRole insert(UmsRole umsRole);

    /**
     * 修改数据
     *
     * @param umsRole 实例对象
     * @return 实例对象
     */
    UmsRole update(UmsRole umsRole);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}