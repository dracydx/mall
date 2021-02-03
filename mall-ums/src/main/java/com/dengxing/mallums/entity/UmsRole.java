package com.dengxing.mallums.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * 后台用户角色表(UmsRole)实体类
 *
 * @author makejava
 * @since 2021-01-29 15:13:49
 */
@Data
public class UmsRole implements Serializable {
    private static final long serialVersionUID = 842953405000017000L;
    
    private Long id;
    /**
    * 名称
    */
    private String name;
    /**
    * 描述
    */
    private String description;
    /**
    * 后台用户数量
    */
    private Integer adminCount;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 启用状态：0->禁用；1->启用
    */
    private Integer status;
    
    private Integer sort;

}