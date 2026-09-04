package org.aspectj.runtime.internal;

/* JADX INFO: compiled from: CFlowPlusState.java */
/* JADX INFO: loaded from: classes5.dex */
public class c extends ak.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f137700b;

    public c(Object[] objArr) {
        this.f137700b = objArr;
    }

    public c(Object[] objArr, Object obj) {
        super(obj);
        this.f137700b = objArr;
    }

    @Override // ak.a
    public Object a(int i10) {
        return this.f137700b[i10];
    }
}
