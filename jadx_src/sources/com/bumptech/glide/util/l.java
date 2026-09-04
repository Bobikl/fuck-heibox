package com.bumptech.glide.util;

import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: MultiClassKey.java */
/* JADX INFO: loaded from: classes6.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Class<?> f42008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Class<?> f42009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Class<?> f42010c;

    public l() {
    }

    public l(@n0 Class<?> cls, @n0 Class<?> cls2) {
        a(cls, cls2);
    }

    public l(@n0 Class<?> cls, @n0 Class<?> cls2, @p0 Class<?> cls3) {
        b(cls, cls2, cls3);
    }

    public void a(@n0 Class<?> cls, @n0 Class<?> cls2) {
        b(cls, cls2, null);
    }

    public void b(@n0 Class<?> cls, @n0 Class<?> cls2, @p0 Class<?> cls3) {
        this.f42008a = cls;
        this.f42009b = cls2;
        this.f42010c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f42008a.equals(lVar.f42008a) && this.f42009b.equals(lVar.f42009b) && o.e(this.f42010c, lVar.f42010c);
    }

    public int hashCode() {
        int iHashCode = ((this.f42008a.hashCode() * 31) + this.f42009b.hashCode()) * 31;
        Class<?> cls = this.f42010c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f42008a + ", second=" + this.f42009b + '}';
    }
}
