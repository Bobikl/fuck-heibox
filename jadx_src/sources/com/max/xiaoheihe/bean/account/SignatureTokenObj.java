package com.max.xiaoheihe.bean.account;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class SignatureTokenObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String appkey;
    private String open_token;
    private String union_id;

    public String getAppkey() {
        return this.appkey;
    }

    public String getOpen_token() {
        return this.open_token;
    }

    public String getUnion_id() {
        return this.union_id;
    }

    public void setAppkey(String str) {
        this.appkey = str;
    }

    public void setOpen_token(String str) {
        this.open_token = str;
    }

    public void setUnion_id(String str) {
        this.union_id = str;
    }
}
