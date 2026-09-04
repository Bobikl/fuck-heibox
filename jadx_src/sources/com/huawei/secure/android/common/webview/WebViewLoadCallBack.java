package com.huawei.secure.android.common.webview;

/* JADX INFO: loaded from: classes7.dex */
public interface WebViewLoadCallBack {

    public enum ErrorCode {
        HTTP_URL,
        URL_NOT_IN_WHITE_LIST,
        OTHER
    }

    void onCheckError(String str, ErrorCode errorCode);
}
