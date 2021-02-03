package com.dengxing.mallums.service;

import com.dengxing.mallums.entity.UmsMenu;
import java.util.List;

/**
 * 后台菜单表(UmsMenu)表服务接口
 *
 * @author makejava
 * @since 2021-01-29 15:36:14
 */
public interface UmsMenuService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsMenu queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UmsMenu> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param umsMenu 实例对象
     * @return 实例对象
     */
    UmsMenu insert(UmsMenu umsMenu);

    /**
     * 修改数据
     *
     * @param umsMenu 实例对象
     * @return 实例对象
     */
    UmsMenu update(UmsMenu umsMenu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}