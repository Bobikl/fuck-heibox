package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class FaqObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String text;
    private String type;
    private String url;

    public String getText() {
        return this.text;
    }

    public String getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
