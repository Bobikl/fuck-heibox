package com.max.hbcommon.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class PostEncryptParamsObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6240297084028455356L;
    private String data;
    private String key;
    private String sid;
    private String time;

    public PostEncryptParamsObj(String str, String str2, String str3, String str4) {
        this.data = str;
        this.key = str2;
        this.sid = str3;
        this.time = str4;
    }

    public String getData() {
        return this.data;
    }

    public String getKey() {
        return this.key;
    }

    public String getSid() {
        return this.sid;
    }

    public String getTime() {
        return this.time;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setSid(String str) {
        this.sid = str;
    }

    public void setTime(String str) {
        this.time = str;
    }
}
