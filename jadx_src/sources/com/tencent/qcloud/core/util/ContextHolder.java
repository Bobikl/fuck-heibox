package com.tencent.qcloud.core.util;

import android.content.Context;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public class ContextHolder {
    private static Context appContext;

    @p0
    public static Context getAppContext() {
        return appContext;
    }

    public static void setContext(@n0 Context context) {
        appContext = context.getApplicationContext();
    }
}
