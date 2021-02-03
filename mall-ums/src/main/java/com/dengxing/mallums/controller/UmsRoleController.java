package com.dengxing.mallums.controller;

import com.dengxing.mallums.entity.UmsRole;
import com.dengxing.mallums.service.UmsRoleService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 后台用户角色表(UmsRole)表控制层
 *
 * @author makejava
 * @since 2021-01-29 15:13:49
 */
@RestController
@Api(tags = "后台用户角色", description = "后台用户角色")
@RequestMapping("umsRole")
public class UmsRoleController {
    /**
     * 服务对象
     */
    @Resource
    private UmsRoleService umsRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UmsRole selectOne(Long id) {
        return this.umsRoleService.queryById(id);
    }

}