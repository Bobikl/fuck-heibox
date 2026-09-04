package com.airbnb.lottie.model;

import androidx.annotation.RestrictTo;
import androidx.annotation.j1;
import androidx.annotation.p0;
import androidx.collection.z0;

/* JADX INFO: compiled from: LottieCompositionCache.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final f f37581b = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z0<String, com.airbnb.lottie.g> f37582a = new z0<>(20);

    @j1
    f() {
    }

    public static f c() {
        return f37581b;
    }

    public void a() {
        this.f37582a.d();
    }

    @p0
    public com.airbnb.lottie.g b(@p0 String str) {
        if (str == null) {
            return null;
        }
        return this.f37582a.f(str);
    }

    public void d(@p0 String str, com.airbnb.lottie.g gVar) {
        if (str == null) {
            return;
        }
        this.f37582a.j(str, gVar);
    }

    public void e(int i10) {
        this.f37582a.m(i10);
    }
}
