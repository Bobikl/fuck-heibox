package com.airbnb.lottie.model;

import androidx.annotation.RestrictTo;
import androidx.annotation.p0;
import androidx.core.util.k;

/* JADX INFO: compiled from: MutablePair.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    T f37587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    T f37588b;

    private static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public void b(T t10, T t11) {
        this.f37587a = t10;
        this.f37588b = t11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return a(kVar.f21263a, this.f37587a) && a(kVar.f21264b, this.f37588b);
    }

    public int hashCode() {
        T t10 = this.f37587a;
        int iHashCode = t10 == null ? 0 : t10.hashCode();
        T t11 = this.f37588b;
        return iHashCode ^ (t11 != null ? t11.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f37587a) + " " + String.valueOf(this.f37588b) + z5.g.f141884d;
    }
}
