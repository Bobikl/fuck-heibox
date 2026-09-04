package com.vivo.push.model;

import android.text.TextUtils;
import z5.g;

/* JADX INFO: compiled from: PushPackageInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f106618a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f106621d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f106619b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f106620c = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f106622e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f106623f = false;

    public b(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalAccessError("PushPackageInfo need a non-null pkgName.");
        }
        this.f106618a = str;
    }

    public final String a() {
        return this.f106618a;
    }

    public final void a(int i10) {
        this.f106620c = i10;
    }

    public final void a(long j10) {
        this.f106619b = j10;
    }

    public final void a(String str) {
        this.f106621d = str;
    }

    public final void a(boolean z10) {
        this.f106622e = z10;
    }

    public final long b() {
        return this.f106619b;
    }

    public final void b(boolean z10) {
        this.f106623f = z10;
    }

    public final boolean c() {
        return this.f106622e;
    }

    public final boolean d() {
        return this.f106623f;
    }

    public final String toString() {
        return "PushPackageInfo{mPackageName=" + this.f106618a + ", mPushVersion=" + this.f106619b + ", mPackageVersion=" + this.f106620c + ", mInBlackList=" + this.f106622e + ", mPushEnable=" + this.f106623f + g.f141884d;
    }
}
