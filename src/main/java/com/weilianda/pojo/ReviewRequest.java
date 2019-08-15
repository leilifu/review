package com.weilianda.pojo;

public class ReviewRequest {
    private Integer id;

    private String appId;

    private String postId;

    private String ver;

    private String token;

    private String notify;

    private Integer requestId;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId == null ? null : postId.trim();
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver == null ? null : ver.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getNotify() {
        return notify;
    }

    public void setNotify(String notify) {
        this.notify = notify == null ? null : notify.trim();
    }

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        return "ReviewRequest{" +
                "id=" + id +
                ", appId='" + appId + '\'' +
                ", postId='" + postId + '\'' +
                ", ver='" + ver + '\'' +
                ", token='" + token + '\'' +
                ", notify='" + notify + '\'' +
                ", requestId=" + requestId +
                ", content='" + content + '\'' +
                '}';
    }
}