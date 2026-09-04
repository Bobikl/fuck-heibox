package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.r3;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: MediaPeriod.java */
/* JADX INFO: loaded from: classes7.dex */
public interface c0 extends e1 {

    /* JADX INFO: compiled from: MediaPeriod.java */
    public interface a extends e1.a<c0> {
        void q(c0 c0Var);
    }

    @Override // com.google.android.exoplayer2.source.e1
    boolean a();

    @Override // com.google.android.exoplayer2.source.e1
    boolean d(long j10);

    @Override // com.google.android.exoplayer2.source.e1
    long e();

    @Override // com.google.android.exoplayer2.source.e1
    void f(long j10);

    @Override // com.google.android.exoplayer2.source.e1
    long g();

    long h(long j10, r3 r3Var);

    List<StreamKey> i(List<com.google.android.exoplayer2.trackselection.j> list);

    long j(long j10);

    long k();

    long l(com.google.android.exoplayer2.trackselection.j[] jVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10);

    p1 o();

    void r(a aVar, long j10);

    void u() throws IOException;

    void v(long j10, boolean z10);
}
