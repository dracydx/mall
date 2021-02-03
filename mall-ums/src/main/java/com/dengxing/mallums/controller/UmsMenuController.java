package com.dengxing.mallums.controller;

import com.dengxing.mallums.entity.UmsMenu;
import com.dengxing.mallums.service.UmsMenuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 后台菜单表(UmsMenu)表控制层
 *
 * @author makejava
 * @since 2021-01-29 15:36:14
 */
@RestController
@RequestMapping("umsMenu")
public class UmsMenuController {
    /**
     * 服务对象
     */
    @Resource
    private UmsMenuService umsMenuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UmsMenu selectOne(Long id) {
        return this.umsMenuService.queryById(id);
    }

}