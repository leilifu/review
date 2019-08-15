package com.weilianda.pojo;

public class NotificationRequest {
    private Integer id;

    private String postId;

    private String code;

    private String token;

    private String msg;

    private String detail;

    private String type;

    private String warnMsg;

    private Integer requestId;

    private String location;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId == null ? null : postId.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getWarnMsg() {
        return warnMsg;
    }

    public void setWarnMsg(String warnMsg) {
        this.warnMsg = warnMsg == null ? null : warnMsg.trim();
    }

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    @Override
    public String toString() {
        return "NotificationRequest{" +
                "id=" + id +
                ", postId='" + postId + '\'' +
                ", code='" + code + '\'' +
                ", token='" + token + '\'' +
                ", msg='" + msg + '\'' +
                ", detail='" + detail + '\'' +
                ", type='" + type + '\'' +
                ", warnMsg='" + warnMsg + '\'' +
                ", requestId=" + requestId +
                ", location='" + location + '\'' +
                '}';
    }
}