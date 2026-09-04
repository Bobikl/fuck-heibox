package com.igexin.a.a.b.a.a;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a extends com.igexin.a.a.b.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected volatile boolean f63134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected volatile b f63135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f63136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected volatile boolean f63137g;

    public a(int i10, String str, com.igexin.a.a.b.b bVar) {
        super(i10, str, bVar);
        this.f63135e = b.NORMAL;
        this.f63137g = true;
    }

    @Override // com.igexin.a.a.d.e
    public final void d() {
        super.d();
        this.f63234m = true;
    }

    @Override // com.igexin.a.a.d.e
    protected void e() {
    }

    protected boolean i() {
        return this.f63135e == b.INTERRUPT;
    }
}
