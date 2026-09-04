package com.umeng.message.proguard;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes4.dex */
public final class bb {
    public static int a() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static int a(float f10) {
        return Math.round(Resources.getSystem().getDisplayMetrics().density * f10);
    }
}
