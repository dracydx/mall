package com.dengxing.mallums.controller;

import com.dengxing.mallcommon.api.CommonResult;
import com.dengxing.mallcommon.domain.UserDto;
import com.dengxing.mallums.dto.UmsAdminLoginParam;
import com.dengxing.mallums.entity.UmsAdmin;
import com.dengxing.mallums.service.UmsAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 后台用户表(UmsAdmin)表控制层
 *
 * @author makejava
 * @since 2021-01-29 14:57:46
 */
@RestController
@Api(tags = "后台用户", description = "后台用户")
@RequestMapping("umsAdmin")
public class UmsAdminController {
    /**
     * 服务对象
     */
    @Resource
    private UmsAdminService umsAdminService;



    @ApiOperation("登陆")
    @GetMapping("login")
    public CommonResult login(@Validated @RequestBody UmsAdminLoginParam umsAdminLoginParam){

        return umsAdminService.login(umsAdminLoginParam.getUsername(),umsAdminLoginParam.getPassword());

    }


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation("获取用户")
    @GetMapping("selectOne")
    public UmsAdmin selectOne(Long id) {
        return this.umsAdminService.queryById(id);
    }

    /**
     * 通过查询
     *
     * @param ps pi
     * @return 分页数据
     */
    @ApiOperation("分页查询用户")
    @GetMapping("selectPage")
    public List<UmsAdmin> selectPage(int pi, int ps) {
        return umsAdminService.queryAllByLimit(pi, ps);
    }

}