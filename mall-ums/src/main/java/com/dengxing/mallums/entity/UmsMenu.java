package com.dengxing.mallums.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * 后台菜单表(UmsMenu)实体类
 *
 * @author makejava
 * @since 2021-01-29 15:36:14
 */@Data
public class UmsMenu implements Serializable {
    private static final long serialVersionUID = -58534912034549837L;
    
    private Long id;
    /**
    * 父级ID
    */
    private Long parentId;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 菜单名称
    */
    private String title;
    /**
    * 菜单级数
    */
    private Integer level;
    /**
    * 菜单排序
    */
    private Integer sort;
    /**
    * 前端名称
    */
    private String name;
    /**
    * 前端图标
    */
    private String icon;
    /**
    * 前端隐藏
    */
    private Integer hidden;


}