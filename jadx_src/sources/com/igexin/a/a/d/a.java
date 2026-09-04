package com.igexin.a.a.d;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a implements com.igexin.a.a.d.a.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f63208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f63209b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected String f63210l = getClass().getName();

    @Override // com.igexin.a.a.d.a.e
    public void a(boolean z10) {
        this.f63208a = !z10;
    }

    @Override // com.igexin.a.a.d.a.e
    public boolean l() {
        return this.f63208a;
    }

    @Override // com.igexin.a.a.d.a.e
    public long m() {
        return this.f63209b;
    }
}
