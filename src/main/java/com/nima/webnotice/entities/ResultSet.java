package com.nima.webnotice.entities;

public class ResultSet {
    private Integer status;
    private String message;
    private Object data;

    public ResultSet() {
    }

    @Override
    public String toString() {
        return "{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ResultSet(Integer status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }
}
