package com.dengxing.mallums.controller;

import com.dengxing.mallums.entity.UmsRolePermissionRelation;
import com.dengxing.mallums.service.UmsRolePermissionRelationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 后台用户角色和权限关系表(UmsRolePermissionRelation)表控制层
 *
 * @author makejava
 * @since 2021-01-29 15:38:57
 */
@RestController
@RequestMapping("umsRolePermissionRelation")
public class UmsRolePermissionRelationController {
    /**
     * 服务对象
     */
    @Resource
    private UmsRolePermissionRelationService umsRolePermissionRelationService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UmsRolePermissionRelation selectOne(Long id) {
        return this.umsRolePermissionRelationService.queryById(id);
    }

}