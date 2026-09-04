package com.google.android.exoplayer2.decoder;

/* JADX INFO: compiled from: Buffer.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f44496b;

    public final void e(int i10) {
        this.f44496b = i10 | this.f44496b;
    }

    public void f() {
        this.f44496b = 0;
    }

    public final void g(int i10) {
        this.f44496b = (~i10) & this.f44496b;
    }

    protected final boolean h(int i10) {
        return (this.f44496b & i10) == i10;
    }

    public final boolean i() {
        return h(268435456);
    }

    public final boolean j() {
        return h(Integer.MIN_VALUE);
    }

    public final boolean k() {
        return h(4);
    }

    public final boolean l() {
        return h(1);
    }

    public final void m(int i10) {
        this.f44496b = i10;
    }
}
