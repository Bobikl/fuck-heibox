package com.alipay.android.fintech.log;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public class HttpUploader extends BaseUploader {
    public HttpUploader(Context context) {
        super(context);
    }

    public void upload(String str, String str2, String str3) {
        uploadFileByHttp(str3, str, str2, "default");
    }
}
