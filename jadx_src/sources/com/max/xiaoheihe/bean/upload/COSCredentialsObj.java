package com.max.xiaoheihe.bean.upload;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class COSCredentialsObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String sessionToken;
    private String tmpSecretId;
    private String tmpSecretKey;

    public String getSessionToken() {
        return this.sessionToken;
    }

    public String getTmpSecretId() {
        return this.tmpSecretId;
    }

    public String getTmpSecretKey() {
        return this.tmpSecretKey;
    }

    public void setSessionToken(String str) {
        this.sessionToken = str;
    }

    public void setTmpSecretId(String str) {
        this.tmpSecretId = str;
    }

    public void setTmpSecretKey(String str) {
        this.tmpSecretKey = str;
    }
}
