package com.sina.weibo.sdk.common;

/* JADX INFO: loaded from: classes8.dex */
public class UiError {
    public int errorCode;
    public String errorDetail;
    public String errorMessage;

    public UiError(int i10, String str, String str2) {
        this.errorCode = i10;
        this.errorMessage = str;
        this.errorDetail = str2;
    }
}
