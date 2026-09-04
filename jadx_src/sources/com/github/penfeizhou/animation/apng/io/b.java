package com.github.penfeizhou.animation.apng.io;

import java.nio.ByteOrder;

/* JADX INFO: compiled from: APNGWriter.java */
/* JADX INFO: loaded from: classes6.dex */
public class b extends com.github.penfeizhou.animation.io.b {
    public void a(int i10) {
        b((byte) (i10 & 255));
        b((byte) ((i10 >> 8) & 255));
        b((byte) ((i10 >> 16) & 255));
        b((byte) ((i10 >> 24) & 255));
    }

    public void d(int i10) {
        b((byte) ((i10 >> 24) & 255));
        b((byte) ((i10 >> 16) & 255));
        b((byte) ((i10 >> 8) & 255));
        b((byte) (i10 & 255));
    }

    @Override // com.github.penfeizhou.animation.io.b, com.github.penfeizhou.animation.io.g
    public void f(int i10) {
        super.f(i10);
        this.f43311a.order(ByteOrder.BIG_ENDIAN);
    }
}
