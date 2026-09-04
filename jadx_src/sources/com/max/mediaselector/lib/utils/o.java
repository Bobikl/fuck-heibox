package com.max.mediaselector.lib.utils;

import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: compiled from: SdkVersionUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f75562a = 30;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean b() {
        return false;
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT == 24;
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 30;
    }
}
