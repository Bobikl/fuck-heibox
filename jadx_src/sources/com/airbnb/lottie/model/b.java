package com.airbnb.lottie.model;

import android.graphics.Typeface;
import androidx.annotation.RestrictTo;
import androidx.annotation.p0;

/* JADX INFO: compiled from: Font.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f37476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f37477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f37478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private Typeface f37479e;

    public b(String str, String str2, String str3, float f10) {
        this.f37475a = str;
        this.f37476b = str2;
        this.f37477c = str3;
        this.f37478d = f10;
    }

    float a() {
        return this.f37478d;
    }

    public String b() {
        return this.f37475a;
    }

    public String c() {
        return this.f37476b;
    }

    public String d() {
        return this.f37477c;
    }

    @p0
    public Typeface e() {
        return this.f37479e;
    }

    public void f(@p0 Typeface typeface) {
        this.f37479e = typeface;
    }
}
