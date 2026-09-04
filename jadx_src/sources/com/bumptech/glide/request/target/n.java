package com.bumptech.glide.request.target;

import androidx.annotation.n0;

/* JADX INFO: compiled from: SimpleTarget.java */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class n<Z> extends b<Z> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f41926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f41927d;

    public n() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public n(int i10, int i11) {
        this.f41926c = i10;
        this.f41927d = i11;
    }

    @Override // com.bumptech.glide.request.target.p
    public final void getSize(@n0 o oVar) {
        if (com.bumptech.glide.util.o.x(this.f41926c, this.f41927d)) {
            oVar.d(this.f41926c, this.f41927d);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.f41926c + " and height: " + this.f41927d + ", either provide dimensions in the constructor or call override()");
    }

    @Override // com.bumptech.glide.request.target.p
    public void removeCallback(@n0 o oVar) {
    }
}
