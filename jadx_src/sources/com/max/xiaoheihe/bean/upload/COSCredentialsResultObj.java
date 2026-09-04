package com.max.xiaoheihe.bean.upload;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class COSCredentialsResultObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private COSCredentialsObj credentials;
    private long expiredTime;
    private long startTime;

    public COSCredentialsObj getCredentials() {
        return this.credentials;
    }

    public long getExpiredTime() {
        return this.expiredTime;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public void setCredentials(COSCredentialsObj cOSCredentialsObj) {
        this.credentials = cOSCredentialsObj;
    }

    public void setExpiredTime(long j10) {
        this.expiredTime = j10;
    }

    public void setStartTime(long j10) {
        this.startTime = j10;
    }
}
