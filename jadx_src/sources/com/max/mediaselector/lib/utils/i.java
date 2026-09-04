package com.max.mediaselector.lib.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DoubleUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f75543a = 600;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f75544b;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.f35172z8, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f75544b < f75543a) {
            return true;
        }
        f75544b = jCurrentTimeMillis;
        return false;
    }
}
