package com.alipay.deviceid.module.x;

import android.content.Context;
import android.util.Log;

/* JADX INFO: compiled from: MiscUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public final class bb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f38298a;

    public static final boolean a(Context context) {
        Boolean bool = f38298a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean boolValueOf = Boolean.valueOf((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 2) != 0);
            f38298a = boolValueOf;
            return boolValueOf.booleanValue();
        } catch (Exception e10) {
            Log.e("MiscUtils", "", e10);
            return false;
        }
    }
}
