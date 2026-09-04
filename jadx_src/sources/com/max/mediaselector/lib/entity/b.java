package com.max.mediaselector.lib.entity;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: MediaExtraInfo.java */
/* JADX INFO: loaded from: classes2.dex */
public class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f75226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f75227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f75228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f75229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f75230e;

    public long a() {
        return this.f75229d;
    }

    public int b() {
        return this.f75228c;
    }

    public String c() {
        return this.f75230e;
    }

    public String d() {
        return this.f75226a;
    }

    public int e() {
        return this.f75227b;
    }

    public void f(long j10) {
        this.f75229d = j10;
    }

    public void g(int i10) {
        this.f75228c = i10;
    }

    public void h(String str) {
        this.f75230e = str;
    }

    public void i(String str) {
        this.f75226a = str;
    }

    public void j(int i10) {
        this.f75227b = i10;
    }

    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34758h, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MediaExtraInfo{videoThumbnail='" + this.f75226a + "', width=" + this.f75227b + ", height=" + this.f75228c + ", duration=" + this.f75229d + ", orientation='" + this.f75230e + "'}";
    }
}
