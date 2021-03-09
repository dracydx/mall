package com.dengxing.mallums.dao;

import com.dengxing.mallums.entity.UmsAdmin;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 后台用户表(UmsAdmin)表数据库访问层
 *
 * @author makejava
 * @since 2021-01-29 14:57:43
 */
public interface UmsAdminDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsAdmin queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UmsAdmin> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param umsAdmin 实例对象
     * @return 对象列表
     */
    List<UmsAdmin> queryAll(UmsAdmin umsAdmin);

    /**
     * 新增数据
     *
     * @param umsAdmin 实例对象
     * @return 影响行数
     */
    int insert(UmsAdmin umsAdmin);

    /**
     * 修改数据
     *
     * @param umsAdmin 实例对象
     * @return 影响行数
     */
    int update(UmsAdmin umsAdmin);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);


    /**
     * @Author dengxing
     * @Description //TODO
     * @Date
     * @Param name
     **/
    UmsAdmin queryByName(String name);


}