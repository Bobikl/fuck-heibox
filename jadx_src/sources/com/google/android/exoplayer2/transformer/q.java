package com.google.android.exoplayer2.transformer;

import androidx.annotation.w0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.a2;

/* JADX INFO: compiled from: TransformerBaseRenderer.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(18)
public abstract class q extends com.google.android.exoplayer2.e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final e f50329n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected final s f50330o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected final m f50331p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected boolean f50332q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected long f50333r;

    public q(int i10, e eVar, s sVar, m mVar) {
        super(i10);
        this.f50329n = eVar;
        this.f50330o = sVar;
        this.f50331p = mVar;
    }

    @Override // com.google.android.exoplayer2.e
    protected final void F(boolean z10, boolean z11) {
        this.f50329n.e();
        this.f50330o.a(d(), 0L);
    }

    @Override // com.google.android.exoplayer2.e
    protected void I() throws ExoPlaybackException {
        this.f50332q = true;
    }

    @Override // com.google.android.exoplayer2.e
    protected final void J() {
        this.f50332q = false;
    }

    @Override // com.google.android.exoplayer2.e
    protected void K(a2[] a2VarArr, long j10, long j11) {
        this.f50333r = j11;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        if (r0.g(r3) != false) goto L21;
     */
    @Override // com.google.android.exoplayer2.o3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.google.android.exoplayer2.a2 r3) {
        /*
            r2 = this;
            java.lang.String r3 = r3.f43593m
            int r0 = com.google.android.exoplayer2.util.y.l(r3)
            int r1 = r2.d()
            if (r0 == r1) goto L12
            r3 = 0
            int r3 = com.google.android.exoplayer2.n3.a(r3)
            return r3
        L12:
            boolean r0 = com.google.android.exoplayer2.util.y.p(r3)
            if (r0 == 0) goto L27
            com.google.android.exoplayer2.transformer.e r0 = r2.f50329n
            com.google.android.exoplayer2.transformer.m r1 = r2.f50331p
            java.lang.String r1 = r1.f50289e
            if (r1 != 0) goto L21
            r1 = r3
        L21:
            boolean r0 = r0.g(r1)
            if (r0 != 0) goto L3d
        L27:
            boolean r0 = com.google.android.exoplayer2.util.y.t(r3)
            if (r0 == 0) goto L43
            com.google.android.exoplayer2.transformer.e r0 = r2.f50329n
            com.google.android.exoplayer2.transformer.m r1 = r2.f50331p
            java.lang.String r1 = r1.f50290f
            if (r1 != 0) goto L36
            goto L37
        L36:
            r3 = r1
        L37:
            boolean r3 = r0.g(r3)
            if (r3 == 0) goto L43
        L3d:
            r3 = 4
            int r3 = com.google.android.exoplayer2.n3.a(r3)
            return r3
        L43:
            r3 = 1
            int r3 = com.google.android.exoplayer2.n3.a(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.transformer.q.a(com.google.android.exoplayer2.a2):int");
    }

    @Override // com.google.android.exoplayer2.m3
    public final boolean isReady() {
        return D();
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.m3
    public final com.google.android.exoplayer2.util.w n() {
        return this.f50330o;
    }
}
