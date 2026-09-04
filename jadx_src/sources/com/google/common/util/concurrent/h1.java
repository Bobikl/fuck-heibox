package com.google.common.util.concurrent;

/* JADX INFO: compiled from: SettableFuture.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@o9.b
public final class h1<V> extends AbstractFuture.i<V> {
    private h1() {
    }

    public static <V> h1<V> F() {
        return new h1<>();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @s9.a
    public boolean B(@b1 V v10) {
        return super.B(v10);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @s9.a
    public boolean C(Throwable th2) {
        return super.C(th2);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @s9.a
    public boolean D(p0<? extends V> p0Var) {
        return super.D(p0Var);
    }
}
