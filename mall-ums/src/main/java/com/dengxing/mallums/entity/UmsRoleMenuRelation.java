package com.dengxing.mallums.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 后台角色菜单关系表(UmsRoleMenuRelation)实体类
 *
 * @author makejava
 * @since 2021-01-29 15:37:57
 */
@Data
public class UmsRoleMenuRelation implements Serializable {
    private static final long serialVersionUID = -97562255766255155L;
    
    private Long id;
    /**
    * 角色ID
    */
    private Long roleId;
    /**
    * 菜单ID
    */
    private Long menuId;

}