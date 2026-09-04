package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.util.u0;
import java.io.IOException;

/* JADX INFO: compiled from: DefaultMediaCodecAdapterFactory.java */
/* JADX INFO: loaded from: classes7.dex */
public final class k implements m.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f46775d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f46776e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f46777f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f46778g = "DefaultMediaCodecAdapterFactory";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f46779b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f46780c;

    @Override // com.google.android.exoplayer2.mediacodec.m.b
    public m a(m.a aVar) throws IOException {
        int i10 = this.f46779b;
        if ((i10 != 1 || u0.f51536a < 23) && (i10 != 0 || u0.f51536a < 31)) {
            return new y.c().a(aVar);
        }
        int iL = com.google.android.exoplayer2.util.y.l(aVar.f46789c.f43593m);
        String strValueOf = String.valueOf(u0.w0(iL));
        com.google.android.exoplayer2.util.u.h(f46778g, strValueOf.length() != 0 ? "Creating an asynchronous MediaCodec adapter for track type ".concat(strValueOf) : new String("Creating an asynchronous MediaCodec adapter for track type "));
        return new c.b(iL, this.f46780c).a(aVar);
    }

    public void b(boolean z10) {
        this.f46780c = z10;
    }

    public k c() {
        this.f46779b = 2;
        return this;
    }

    public k d() {
        this.f46779b = 1;
        return this;
    }
}
