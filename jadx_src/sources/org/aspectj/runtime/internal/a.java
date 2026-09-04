package org.aspectj.runtime.internal;

/* JADX INFO: compiled from: AroundClosure.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Object[] f137695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f137696b = 1048576;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Object[] f137697c;

    public a() {
    }

    public a(Object[] objArr) {
        this.f137695a = objArr;
    }

    public int a() {
        return this.f137696b;
    }

    public Object[] b() {
        return this.f137697c;
    }

    public Object[] c() {
        return this.f137695a;
    }

    public org.aspectj.lang.e d() {
        Object[] objArr = this.f137695a;
        org.aspectj.lang.e eVar = (org.aspectj.lang.e) objArr[objArr.length - 1];
        eVar.i(this);
        return eVar;
    }

    public org.aspectj.lang.e e(int i10) {
        Object[] objArr = this.f137695a;
        org.aspectj.lang.e eVar = (org.aspectj.lang.e) objArr[objArr.length - 1];
        eVar.i(this);
        this.f137696b = i10;
        return eVar;
    }

    public org.aspectj.lang.e f(int i10) {
        Object[] objArr = this.f137695a;
        org.aspectj.lang.e eVar = (org.aspectj.lang.e) objArr[objArr.length - 1];
        eVar.l(this);
        this.f137696b = i10;
        return eVar;
    }

    public abstract Object g(Object[] objArr) throws Throwable;

    public void h() {
        Object[] objArr = this.f137695a;
        ((org.aspectj.lang.e) objArr[objArr.length - 1]).l(null);
    }
}
