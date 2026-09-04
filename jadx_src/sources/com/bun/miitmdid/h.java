package com.bun.miitmdid;

/* JADX INFO: loaded from: classes6.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Class<?> f42093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    public Object f42094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f42095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Class<?>[] f42096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f42097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    public Class<?> f42098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f42099g = false;

    public h(Class<?> cls, @androidx.annotation.p0 Object obj, String str, Class<?>[] clsArr, Object[] objArr) {
        this.f42093a = cls;
        this.f42094b = obj;
        this.f42095c = str;
        this.f42096d = clsArr;
        this.f42097e = objArr;
    }

    public h(Class<?> cls, @androidx.annotation.p0 Object obj, String str, Class<?>[] clsArr, Object[] objArr, Class<?> cls2) {
        this.f42093a = cls;
        this.f42094b = obj;
        this.f42095c = str;
        this.f42096d = clsArr;
        this.f42097e = objArr;
        this.f42098f = cls2;
    }

    public native Object a();

    @androidx.annotation.p0
    public Class<?> b() {
        return this.f42098f;
    }

    public native boolean c();
}
