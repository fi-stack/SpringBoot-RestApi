package com.example.demo.dto;

import java.util.ArrayList;
import java.util.List;

public class ResponseData<T> {
    private boolean success;
    private List<String> message = new ArrayList<>();
    private T payload;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }

    public T getPayload() {
        return payload;
    }

    public void setPayload(T payload) {
        this.payload = payload;
    }

}
