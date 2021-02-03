package com.dengxing.mallums.controller;

import com.dengxing.mallums.entity.UmsRoleMenuRelation;
import com.dengxing.mallums.service.UmsRoleMenuRelationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 后台角色菜单关系表(UmsRoleMenuRelation)表控制层
 *
 * @author makejava
 * @since 2021-01-29 15:37:57
 */
@RestController
@RequestMapping("umsRoleMenuRelation")
public class UmsRoleMenuRelationController {
    /**
     * 服务对象
     */
    @Resource
    private UmsRoleMenuRelationService umsRoleMenuRelationService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UmsRoleMenuRelation selectOne(Long id) {
        return this.umsRoleMenuRelationService.queryById(id);
    }

}