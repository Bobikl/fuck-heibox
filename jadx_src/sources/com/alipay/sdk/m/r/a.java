package com.alipay.sdk.m.r;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public enum a {
    None("none"),
    WapPay("js://wappay"),
    Update("js://update"),
    OpenWeb("loc:openweb"),
    SetResult("loc:setResult"),
    Exit("loc:exit");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f39508a;

    a(String str) {
        this.f39508a = str;
    }

    public static a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return None;
        }
        a aVar = None;
        for (a aVar2 : values()) {
            if (str.startsWith(aVar2.f39508a)) {
                return aVar2;
            }
        }
        return aVar;
    }
}
