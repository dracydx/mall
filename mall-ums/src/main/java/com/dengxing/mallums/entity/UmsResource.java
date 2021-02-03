package com.dengxing.mallums.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 后台资源表(UmsResource)实体类
 *
 * @author makejava
 * @since 2021-01-29 16:31:51
 */
public class UmsResource implements Serializable {
    private static final long serialVersionUID = 638227839786572316L;
    
    private Long id;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 资源名称
    */
    private String name;
    /**
    * 资源URL
    */
    private String url;
    /**
    * 描述
    */
    private String description;
    /**
    * 资源分类ID
    */
    private Long categoryId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

}