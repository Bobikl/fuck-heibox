package com.alipay.zoloz.android.phone.mrpc.core;

import android.content.Context;
import android.util.Log;

/* JADX INFO: compiled from: MiscUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f39749a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f39750b = "com.eg.android.AlipayGphoneRC";

    public static final boolean a(Context context) {
        Boolean bool = f39749a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean boolValueOf = Boolean.valueOf((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 2) != 0);
            f39749a = boolValueOf;
            return boolValueOf.booleanValue();
        } catch (Exception e10) {
            Log.e("MiscUtils", "", e10);
            return false;
        }
    }
}
