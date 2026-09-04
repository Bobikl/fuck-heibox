package com.airbnb.lottie;

import android.graphics.Bitmap;
import androidx.annotation.RestrictTo;
import androidx.annotation.p0;

/* JADX INFO: compiled from: LottieImageAsset.java */
/* JADX INFO: loaded from: classes6.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f37439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f37440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f37441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f37442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private Bitmap f37443f;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public k(int i10, int i11, String str, String str2, String str3) {
        this.f37438a = i10;
        this.f37439b = i11;
        this.f37440c = str;
        this.f37441d = str2;
        this.f37442e = str3;
    }

    @p0
    public Bitmap a() {
        return this.f37443f;
    }

    public String b() {
        return this.f37442e;
    }

    public String c() {
        return this.f37441d;
    }

    public int d() {
        return this.f37439b;
    }

    public String e() {
        return this.f37440c;
    }

    public int f() {
        return this.f37438a;
    }

    public boolean g() {
        return this.f37443f != null || (this.f37441d.startsWith("data:") && this.f37441d.indexOf("base64,") > 0);
    }

    public void h(@p0 Bitmap bitmap) {
        this.f37443f = bitmap;
    }
}
