package com.google.android.exoplayer2.text.dvb;

import com.google.android.exoplayer2.text.f;
import com.google.android.exoplayer2.text.g;
import com.google.android.exoplayer2.util.e0;
import java.util.List;

/* JADX INFO: compiled from: DvbDecoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final b f49543o;

    public a(List<byte[]> list) {
        super("DvbDecoder");
        e0 e0Var = new e0(list.get(0));
        this.f49543o = new b(e0Var.M(), e0Var.M());
    }

    @Override // com.google.android.exoplayer2.text.f
    protected g y(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.f49543o.r();
        }
        return new c(this.f49543o.b(bArr, i10));
    }
}
