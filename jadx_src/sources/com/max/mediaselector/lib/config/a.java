package com.max.mediaselector.lib.config;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: Crop.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f75063a = 696;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f75064b = 69;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f75065c = 96;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f75066d = "com.yalantis.ucrop";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f75067e = "com.yalantis.ucrop.CropAspectRatio";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f75068f = "com.yalantis.ucrop.ImageWidth";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f75069g = "com.yalantis.ucrop.ImageHeight";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f75070h = "com.yalantis.ucrop.OffsetX";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f75071i = "com.yalantis.ucrop.OffsetY";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f75072j = "com.yalantis.ucrop.Error";

    @p0
    public static Throwable a(@n0 Intent intent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{intent}, null, changeQuickRedirect, true, bb.c.l.f34375pl, new Class[]{Intent.class}, Throwable.class);
        return patchProxyResultProxy.isSupported ? (Throwable) patchProxyResultProxy.result : (Throwable) intent.getSerializableExtra(f75072j);
    }

    @p0
    public static Uri b(@n0 Intent intent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{intent}, null, changeQuickRedirect, true, bb.c.l.f34214il, new Class[]{Intent.class}, Uri.class);
        return patchProxyResultProxy.isSupported ? (Uri) patchProxyResultProxy.result : (Uri) intent.getParcelableExtra("output");
    }

    public static float c(@n0 Intent intent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{intent}, null, changeQuickRedirect, true, bb.c.l.f34306ml, new Class[]{Intent.class}, Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : intent.getFloatExtra(f75067e, 0.0f);
    }

    public static String d(@n0 Intent intent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{intent}, null, changeQuickRedirect, true, bb.c.l.f34237jl, new Class[]{Intent.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : intent.getStringExtra(b.f75073a);
    }

    public static int e(@n0 Intent intent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{intent}, null, changeQuickRedirect, true, bb.c.l.f34283ll, new Class[]{Intent.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : intent.getIntExtra(f75069g, -1);
    }

    public static int f(@n0 Intent intent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{intent}, null, changeQuickRedirect, true, bb.c.l.f34329nl, new Class[]{Intent.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : intent.getIntExtra(f75070h, 0);
    }

    public static int g(@n0 Intent intent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{intent}, null, changeQuickRedirect, true, bb.c.l.f34352ol, new Class[]{Intent.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : intent.getIntExtra(f75071i, 0);
    }

    public static int h(@n0 Intent intent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{intent}, null, changeQuickRedirect, true, bb.c.l.f34260kl, new Class[]{Intent.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : intent.getIntExtra(f75068f, -1);
    }
}
