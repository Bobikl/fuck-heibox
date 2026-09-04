package com.max.xiaoheihe.accelworld;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.collections.ArraysKt___ArraysKt;

/* JADX INFO: compiled from: AccelAccountWhiteList.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final String[] f76732a = {"22429189"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final String[] f76733b = {"239275"};
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    public static final String[] a() {
        return f76733b;
    }

    @dl.d
    public static final String[] b() {
        return f76732a;
    }

    public static final boolean c(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.m.Ou, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return com.max.hbcommon.network.b.f68052i ? ArraysKt___ArraysKt.T8(f76733b, str) : ArraysKt___ArraysKt.T8(f76732a, str);
    }
}
