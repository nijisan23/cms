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
@TableName("cms_article")
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文章id
     */
    private Long id;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 文章审核状态
     */
    private String status;

    /**
     * 阅读量
     */
    private Integer readNum;

    /**
     * 点赞量
     */
    private Integer likeNum;

    /**
     * 拉踩量
     */
    private Integer dislikeNum;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 类别id
     */
    private Integer categoryId;

    /**
     * 是否收费，默认0不收费
     */
    private Integer charged;

    /**
     * 文章删除状态
     */
    private Integer deleted;

    /**
     * 文章发表时间
     */
    private LocalDateTime publishTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getReadNum() {
        return readNum;
    }

    public void setReadNum(Integer readNum) {
        this.readNum = readNum;
    }

    public Integer getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    public Integer getDislikeNum() {
        return dislikeNum;
    }

    public void setDislikeNum(Integer dislikeNum) {
        this.dislikeNum = dislikeNum;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getCharged() {
        return charged;
    }

    public void setCharged(Integer charged) {
        this.charged = charged;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public LocalDateTime getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(LocalDateTime publishTime) {
        this.publishTime = publishTime;
    }

    @Override
    public String toString() {
        return "Article{" +
            "id = " + id +
            ", title = " + title +
            ", content = " + content +
            ", status = " + status +
            ", readNum = " + readNum +
            ", likeNum = " + likeNum +
            ", dislikeNum = " + dislikeNum +
            ", userId = " + userId +
            ", categoryId = " + categoryId +
            ", charged = " + charged +
            ", deleted = " + deleted +
            ", publishTime = " + publishTime +
        "}";
    }
}
