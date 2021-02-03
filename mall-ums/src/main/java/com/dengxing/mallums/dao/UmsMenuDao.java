package com.dengxing.mallums.dao;

import com.dengxing.mallums.entity.UmsMenu;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 后台菜单表(UmsMenu)表数据库访问层
 *
 * @author makejava
 * @since 2021-01-29 15:36:14
 */
public interface UmsMenuDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsMenu queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UmsMenu> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param umsMenu 实例对象
     * @return 对象列表
     */
    List<UmsMenu> queryAll(UmsMenu umsMenu);

    /**
     * 新增数据
     *
     * @param umsMenu 实例对象
     * @return 影响行数
     */
    int insert(UmsMenu umsMenu);

    /**
     * 修改数据
     *
     * @param umsMenu 实例对象
     * @return 影响行数
     */
    int update(UmsMenu umsMenu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}