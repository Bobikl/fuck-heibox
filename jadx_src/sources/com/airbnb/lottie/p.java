package com.airbnb.lottie;

import androidx.annotation.p0;
import java.util.Arrays;

/* JADX INFO: compiled from: LottieResult.java */
/* JADX INFO: loaded from: classes6.dex */
public final class p<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final V f37676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final Throwable f37677b;

    public p(V v10) {
        this.f37676a = v10;
        this.f37677b = null;
    }

    public p(Throwable th2) {
        this.f37677b = th2;
        this.f37676a = null;
    }

    @p0
    public Throwable a() {
        return this.f37677b;
    }

    @p0
    public V b() {
        return this.f37676a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (b() != null && b().equals(pVar.b())) {
            return true;
        }
        if (a() == null || pVar.a() == null) {
            return false;
        }
        return a().toString().equals(a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }
}
