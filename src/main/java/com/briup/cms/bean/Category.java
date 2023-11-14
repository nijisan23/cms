package com.briup.cms.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author xps
 * @since 2023-11-14
 */
@TableName("cms_category")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 栏目编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 栏目名称
     */
    private String name;

    /**
     * 栏目描述
     */
    private String description;

    /**
     * 栏目序号
     */
    private Integer orderNum;

    /**
     * 栏目删除状态
     */
    private Integer deleted;

    /**
     * 父栏目id
     */
    private Integer parentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "Category{" +
            "id = " + id +
            ", name = " + name +
            ", description = " + description +
            ", orderNum = " + orderNum +
            ", deleted = " + deleted +
            ", parentId = " + parentId +
        "}";
    }
}
