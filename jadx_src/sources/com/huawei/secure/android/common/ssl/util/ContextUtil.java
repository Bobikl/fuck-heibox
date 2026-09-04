package com.huawei.secure.android.common.ssl.util;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public class ContextUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f63045a;

    public static Context getInstance() {
        return f63045a;
    }

    public static void setContext(Context context) {
        if (context == null || f63045a != null) {
            return;
        }
        f63045a = context.getApplicationContext();
    }
}
