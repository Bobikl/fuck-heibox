package com.igexin.assist;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes7.dex */
public class MessageBean {
    private Context context;
    public final Bundle extra = new Bundle();
    private Object message;
    private String messageSource;
    private String messageType;

    public MessageBean(Context context, String str, Object obj) {
        this.messageType = str;
        this.message = obj;
        this.context = context;
    }

    public Context getContext() {
        return this.context;
    }

    public Object getMessage() {
        return this.message;
    }

    public String getMessageSource() {
        return this.messageSource;
    }

    public String getMessageType() {
        return this.messageType;
    }

    public Object getObjectMessage() {
        return this.message;
    }

    public String getStringMessage() {
        Object obj = this.message;
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public void setMessageSource(String str) {
        this.messageSource = str;
    }
}
