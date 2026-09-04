package com.google.android.gms.common.internal;

import android.util.Log;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f52519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private final String f52520b;

    @v8.a
    public g(@androidx.annotation.n0 String str) {
        this(str, null);
    }

    @v8.a
    public g(@androidx.annotation.n0 String str, @androidx.annotation.p0 String str2) {
        p.m(str, "log tag cannot be null");
        p.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f52519a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f52520b = null;
        } else {
            this.f52520b = str2;
        }
    }

    private final String r(String str) {
        String str2 = this.f52520b;
        return str2 == null ? str : str2.concat(str);
    }

    @s9.h
    private final String s(String str, Object... objArr) {
        String str2 = String.format(str, objArr);
        String str3 = this.f52520b;
        return str3 == null ? str2 : str3.concat(str2);
    }

    @v8.a
    public boolean a(int i10) {
        return Log.isLoggable(this.f52519a, i10);
    }

    @v8.a
    public boolean b() {
        return false;
    }

    @v8.a
    public void c(@androidx.annotation.n0 String str, @androidx.annotation.n0 String str2) {
        if (a(3)) {
            Log.d(str, r(str2));
        }
    }

    @v8.a
    public void d(@androidx.annotation.n0 String str, @androidx.annotation.n0 String str2, @androidx.annotation.n0 Throwable th2) {
        if (a(3)) {
            Log.d(str, r(str2), th2);
        }
    }

    @v8.a
    public void e(@androidx.annotation.n0 String str, @androidx.annotation.n0 String str2) {
        if (a(6)) {
            Log.e(str, r(str2));
        }
    }

    @v8.a
    public void f(@androidx.annotation.n0 String str, @androidx.annotation.n0 String str2, @androidx.annotation.n0 Throwable th2) {
        if (a(6)) {
            Log.e(str, r(str2), th2);
        }
    }

    @v8.a
    @s9.h
    public void g(@androidx.annotation.n0 String str, @s9.i @androidx.annotation.n0 String str2, @androidx.annotation.n0 Object... objArr) {
        if (a(6)) {
            Log.e(str, s(str2, objArr));
        }
    }

    @v8.a
    public void h(@androidx.annotation.n0 String str, @androidx.annotation.n0 String str2) {
        if (a(4)) {
            Log.i(str, r(str2));
        }
    }

    @v8.a
    public void i(@androidx.annotation.n0 String str, @androidx.annotation.n0 String str2, @androidx.annotation.n0 Throwable th2) {
        if (a(4)) {
            Log.i(str, r(str2), th2);
        }
    }

    @v8.a
    public void j(@androidx.annotation.n0 String str, @androidx.annotation.n0 String str2) {
    }

    @v8.a
    public void k(@androidx.annotation.n0 String str, @androidx.annotation.n0 String str2, @androidx.annotation.n0 Throwable th2) {
    }

    @v8.a
    public void l(@androidx.annotation.n0 String str, @androidx.annotation.n0 String str2) {
        if (a(2)) {
            Log.v(str, r(str2));
        }
    }

    @v8.a
    public void m(@androidx.annotation.n0 String str, @androidx.annotation.n0 String str2, @androidx.annotation.n0 Throwable th2) {
        if (a(2)) {
            Log.v(str, r(str2), th2);
        }
    }

    @v8.a
    public void n(@androidx.annotation.n0 String str, @androidx.annotation.n0 String str2) {
        if (a(5)) {
            Log.w(str, r(str2));
        }
    }

    @v8.a
    public void o(@androidx.annotation.n0 String str, @androidx.annotation.n0 String str2, @androidx.annotation.n0 Throwable th2) {
        if (a(5)) {
            Log.w(str, r(str2), th2);
        }
    }

    @v8.a
    @s9.h
    public void p(@androidx.annotation.n0 String str, @s9.i @androidx.annotation.n0 String str2, @androidx.annotation.n0 Object... objArr) {
        if (a(5)) {
            Log.w(this.f52519a, s(str2, objArr));
        }
    }

    @v8.a
    public void q(@androidx.annotation.n0 String str, @androidx.annotation.n0 String str2, @androidx.annotation.n0 Throwable th2) {
        if (a(7)) {
            Log.e(str, r(str2), th2);
            Log.wtf(str, r(str2), th2);
        }
    }
}
