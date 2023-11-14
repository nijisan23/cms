package com.briup.cms.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author xps
 * @since 2023-11-14
 */
@TableName("cms_subcomment")
public class Subcomment implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String content;

    private LocalDateTime publishTime;

    private Long userId;

    /**
     * 一级评论id
     */
    private Long parentId;

    /**
     * 回复评论id
     */
    private Long replyId;

    private Integer deleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(LocalDateTime publishTime) {
        this.publishTime = publishTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getReplyId() {
        return replyId;
    }

    public void setReplyId(Long replyId) {
        this.replyId = replyId;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "Subcomment{" +
            "id = " + id +
            ", content = " + content +
            ", publishTime = " + publishTime +
            ", userId = " + userId +
            ", parentId = " + parentId +
            ", replyId = " + replyId +
            ", deleted = " + deleted +
        "}";
    }
}
