package com.google.android.exoplayer2.transformer;

import androidx.annotation.p0;
import androidx.annotation.w0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.b2;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: TransformerMuxingVideoRenderer.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(18)
public final class t extends q {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f50336x = "TransformerVideoRenderer";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final DecoderInputBuffer f50337s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @p0
    private g f50338t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f50339u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f50340v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f50341w;

    public t(e eVar, s sVar, m mVar) {
        super(2, eVar, sVar, mVar);
        this.f50337s = new DecoderInputBuffer(2);
    }

    private boolean N() {
        this.f50337s.f();
        int iL = L(z(), this.f50337s, 0);
        if (iL == -5) {
            throw new IllegalStateException("Format changes are not supported.");
        }
        if (iL == -3) {
            return false;
        }
        if (this.f50337s.k()) {
            this.f50341w = true;
            this.f50329n.c(d());
            return false;
        }
        this.f50330o.a(d(), this.f50337s.f44490g);
        DecoderInputBuffer decoderInputBuffer = this.f50337s;
        decoderInputBuffer.f44490g -= this.f50333r;
        ((ByteBuffer) com.google.android.exoplayer2.util.a.g(decoderInputBuffer.f44488e)).flip();
        g gVar = this.f50338t;
        if (gVar != null) {
            gVar.a(this.f50337s);
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.m3
    public boolean b() {
        return this.f50341w;
    }

    @Override // com.google.android.exoplayer2.m3, com.google.android.exoplayer2.o3
    public String getName() {
        return f50336x;
    }

    @Override // com.google.android.exoplayer2.m3
    public void j(long j10, long j11) {
        boolean z10;
        if (!this.f50332q || b()) {
            return;
        }
        if (!this.f50339u) {
            b2 b2VarZ = z();
            if (L(b2VarZ, this.f50337s, 2) != -5) {
                return;
            }
            a2 a2Var = (a2) com.google.android.exoplayer2.util.a.g(b2VarZ.f44366b);
            this.f50339u = true;
            if (this.f50331p.f50287c) {
                this.f50338t = new h(a2Var);
            }
            this.f50329n.a(a2Var);
        }
        do {
            if (!this.f50340v && !N()) {
                return;
            }
            e eVar = this.f50329n;
            int iD = d();
            DecoderInputBuffer decoderInputBuffer = this.f50337s;
            z10 = !eVar.h(iD, decoderInputBuffer.f44488e, decoderInputBuffer.l(), this.f50337s.f44490g);
            this.f50340v = z10;
        } while (!z10);
    }
}
