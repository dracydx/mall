package com.dengxing.mallums.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * 后台用户表(UmsAdmin)实体类
 *
 * @author makejava
 * @since 2021-01-29 14:57:42
 */
@Data
public class UmsAdmin implements Serializable {
    private static final long serialVersionUID = 122376404551714441L;

    private Long id;

    private String username;

    private String password;
    /**
     * 头像
     */
    private String icon;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 备注信息
     */
    private String note;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 最后登录时间
     */
    private Date loginTime;
    /**
     * 帐号启用状态：0->禁用；1->启用
     */
    private Integer status;


}