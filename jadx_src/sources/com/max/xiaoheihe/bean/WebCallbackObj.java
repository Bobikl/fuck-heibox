package com.max.xiaoheihe.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class WebCallbackObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 431905341887131374L;
    private Object content;
    private HashMap<String, String> data;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f76942id;
    private String methods;
    private String type;
    private String url;

    public Object getContent() {
        return this.content;
    }

    public HashMap<String, String> getData() {
        return this.data;
    }

    public String getId() {
        return this.f76942id;
    }

    public String getMethods() {
        return this.methods;
    }

    public String getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public void setContent(Object obj) {
        this.content = obj;
    }

    public void setData(HashMap<String, String> map) {
        this.data = map;
    }

    public void setId(String str) {
        this.f76942id = str;
    }

    public void setMethods(String str) {
        this.methods = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
