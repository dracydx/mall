package com.dengxing.mallums.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 后台用户角色和权限关系表(UmsRolePermissionRelation)实体类
 *
 * @author makejava
 * @since 2021-01-29 15:38:57
 */
@Data
public class UmsRolePermissionRelation implements Serializable {
    private static final long serialVersionUID = 691334858947288992L;
    
    private Long id;
    
    private Long roleId;
    
    private Long permissionId;

}