package com.huawei.hms.scankit.p;

import java.security.SecureRandom;

/* JADX INFO: compiled from: RandomUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public class n6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SecureRandom f62142a = new SecureRandom();

    public static float a(float f10) {
        return f62142a.nextFloat() * f10;
    }

    public static int a(int i10) {
        return f62142a.nextInt(i10);
    }
}
