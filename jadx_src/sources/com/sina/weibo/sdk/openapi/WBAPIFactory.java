package com.sina.weibo.sdk.openapi;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public class WBAPIFactory {
    public static IWBAPI createWBAPI(Context context) {
        return new a(context);
    }
}
