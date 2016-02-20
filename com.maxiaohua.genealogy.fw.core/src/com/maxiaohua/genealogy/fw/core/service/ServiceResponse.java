package com.maxiaohua.genealogy.fw.core.service;

import java.util.ArrayList;
import java.util.List;

import com.maxiaohua.genealogy.fw.core.message.Message;


public class ServiceResponse implements java.io.Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private boolean success;
    
    private Object result;
    
    private List<Message> messages;
    
    private List<Message> exceptions;

    
    
    
    

    
    public void addMessage(
            Message message) {
        if (this.messages == null) {
            this.messages = new ArrayList<Message>();
        }
        this.messages.add(message);
    }

    
    public void addExceptionMessage(
            Message exception) {
        if (this.exceptions == null) {
            this.exceptions = new ArrayList<Message>();
        }
        this.exceptions.add(exception);
    }

    
    public boolean isSuccess() {
        return success;
    }

    
    public void setSuccess(
            boolean success) {
        this.success = success;
    }

    
    public Object getResult() {
        return result;
    }

    
    public void setResult(
            Object result) {
        this.result = result;
    }

    
    public List<Message> getMessages() {
        return messages;
    }

    
    public void setMessages(
            List<Message> messages) {
        this.messages = messages;
    }

    
    public List<Message> getExceptions() {
        return exceptions;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
}