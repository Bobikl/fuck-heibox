package com.donkingliang.consecutivescroller;

import android.content.res.Resources;

/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static float f42400a = Resources.getSystem().getDisplayMetrics().density;

    public static int a(float f10) {
        return (int) ((f10 * f42400a) + 0.5f);
    }

    public static float b(int i10) {
        return i10 / f42400a;
    }
}
