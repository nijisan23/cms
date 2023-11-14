package com.briup.cms.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("cms_log")
public class Log implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 访问用户账号
     */
    private String username;

    /**
     * 接口描述信息
     */
    private String businessName;

    /**
     * 请求的地址
     */
    private String requestUrl;

    /**
     * 请求的方式，get post delete put
     */
    private String requestMethod;

    /**
     * ip
     */
    private String ip;

    /**
     * ip来源
     */
    private String source;

    /**
     * 请求接口耗时
     */
    private Long spendTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 请求的参数
     */
    private String paramsJson;

    /**
     * 响应参数
     */
    private String resultJson;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Long getSpendTime() {
        return spendTime;
    }

    public void setSpendTime(Long spendTime) {
        this.spendTime = spendTime;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getParamsJson() {
        return paramsJson;
    }

    public void setParamsJson(String paramsJson) {
        this.paramsJson = paramsJson;
    }

    public String getResultJson() {
        return resultJson;
    }

    public void setResultJson(String resultJson) {
        this.resultJson = resultJson;
    }

    @Override
    public String toString() {
        return "Log{" +
            "id = " + id +
            ", username = " + username +
            ", businessName = " + businessName +
            ", requestUrl = " + requestUrl +
            ", requestMethod = " + requestMethod +
            ", ip = " + ip +
            ", source = " + source +
            ", spendTime = " + spendTime +
            ", createTime = " + createTime +
            ", paramsJson = " + paramsJson +
            ", resultJson = " + resultJson +
        "}";
    }
}
