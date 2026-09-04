package com.max.mediaselector.lib.config;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: InjectResourceSource.java */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f75086a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f75087b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f75088c = 3;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f75089d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f75090e = 5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f75091f = 6;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f75092g = 7;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f75093h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f75094i = 9;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f75095j = 10;

    public static int a(Context context, int i10) {
        Object[] objArr = {context, new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.l.ql, new Class[]{Context.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        oe.g gVar = PictureSelectionConfig.f75024i4;
        if (gVar != null) {
            return gVar.a(context, i10);
        }
        return 0;
    }
}
