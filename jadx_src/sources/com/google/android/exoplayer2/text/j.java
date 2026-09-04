package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.extractor.e0;
import com.google.android.exoplayer2.extractor.z;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.y;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: SubtitleExtractor.java */
/* JADX INFO: loaded from: classes7.dex */
public class j implements com.google.android.exoplayer2.extractor.k {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f49632o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f49633p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f49634q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f49635r = 3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f49636s = 4;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f49637t = 5;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f49638u = 1024;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h f49639d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a2 f49642g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.android.exoplayer2.extractor.m f49645j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private e0 f49646k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f49647l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f49640e = new d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e0 f49641f = new com.google.android.exoplayer2.util.e0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<Long> f49643h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<com.google.android.exoplayer2.util.e0> f49644i = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f49648m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f49649n = com.google.android.exoplayer2.j.f46377b;

    public j(h hVar, a2 a2Var) {
        this.f49639d = hVar;
        this.f49642g = a2Var.c().e0(y.f51575h0).I(a2Var.f43593m).E();
    }

    private void c() throws IOException, DecoderException {
        try {
            k kVarA = this.f49639d.a();
            while (kVarA == null) {
                Thread.sleep(5L);
                kVarA = this.f49639d.a();
            }
            kVarA.o(this.f49647l);
            kVarA.f44488e.put(this.f49641f.d(), 0, this.f49647l);
            kVarA.f44488e.limit(this.f49647l);
            this.f49639d.c(kVarA);
            l lVarDequeueOutputBuffer = this.f49639d.dequeueOutputBuffer();
            while (lVarDequeueOutputBuffer == null) {
                Thread.sleep(5L);
                lVarDequeueOutputBuffer = this.f49639d.dequeueOutputBuffer();
            }
            for (int i10 = 0; i10 < lVarDequeueOutputBuffer.b(); i10++) {
                byte[] bArrA = this.f49640e.a(lVarDequeueOutputBuffer.d(lVarDequeueOutputBuffer.a(i10)));
                this.f49643h.add(Long.valueOf(lVarDequeueOutputBuffer.a(i10)));
                this.f49644i.add(new com.google.android.exoplayer2.util.e0(bArrA));
            }
            lVarDequeueOutputBuffer.n();
        } catch (SubtitleDecoderException e10) {
            throw ParserException.a("SubtitleDecoder failed.", e10);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    private boolean d(com.google.android.exoplayer2.extractor.l lVar) throws IOException {
        int iB = this.f49641f.b();
        int i10 = this.f49647l;
        if (iB == i10) {
            this.f49641f.c(i10 + 1024);
        }
        int i11 = lVar.read(this.f49641f.d(), this.f49647l, this.f49641f.b() - this.f49647l);
        if (i11 != -1) {
            this.f49647l += i11;
        }
        long length = lVar.getLength();
        return (length != -1 && ((long) this.f49647l) == length) || i11 == -1;
    }

    private boolean e(com.google.android.exoplayer2.extractor.l lVar) throws IOException {
        return lVar.c((lVar.getLength() > (-1L) ? 1 : (lVar.getLength() == (-1L) ? 0 : -1)) != 0 ? Ints.d(lVar.getLength()) : 1024) == -1;
    }

    private void h() {
        com.google.android.exoplayer2.util.a.k(this.f49646k);
        com.google.android.exoplayer2.util.a.i(this.f49643h.size() == this.f49644i.size());
        long j10 = this.f49649n;
        for (int iH = j10 == com.google.android.exoplayer2.j.f46377b ? 0 : u0.h(this.f49643h, Long.valueOf(j10), true, true); iH < this.f49644i.size(); iH++) {
            com.google.android.exoplayer2.util.e0 e0Var = this.f49644i.get(iH);
            e0Var.S(0);
            int length = e0Var.d().length;
            this.f49646k.c(e0Var, length);
            this.f49646k.e(this.f49643h.get(iH).longValue(), 1, length, 0, null);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void a(long j10, long j11) {
        int i10 = this.f49648m;
        com.google.android.exoplayer2.util.a.i((i10 == 0 || i10 == 5) ? false : true);
        this.f49649n = j11;
        if (this.f49648m == 2) {
            this.f49648m = 1;
        }
        if (this.f49648m == 4) {
            this.f49648m = 3;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void b(com.google.android.exoplayer2.extractor.m mVar) {
        com.google.android.exoplayer2.util.a.i(this.f49648m == 0);
        this.f49645j = mVar;
        this.f49646k = mVar.b(0, 3);
        this.f49645j.n();
        this.f49645j.t(new com.google.android.exoplayer2.extractor.y(new long[]{0}, new long[]{0}, com.google.android.exoplayer2.j.f46377b));
        this.f49646k.d(this.f49642g);
        this.f49648m = 1;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public boolean f(com.google.android.exoplayer2.extractor.l lVar) throws IOException {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public int g(com.google.android.exoplayer2.extractor.l lVar, z zVar) throws IOException, DecoderException {
        int i10 = this.f49648m;
        com.google.android.exoplayer2.util.a.i((i10 == 0 || i10 == 5) ? false : true);
        if (this.f49648m == 1) {
            this.f49641f.O(lVar.getLength() != -1 ? Ints.d(lVar.getLength()) : 1024);
            this.f49647l = 0;
            this.f49648m = 2;
        }
        if (this.f49648m == 2 && d(lVar)) {
            c();
            h();
            this.f49648m = 4;
        }
        if (this.f49648m == 3 && e(lVar)) {
            h();
            this.f49648m = 4;
        }
        return this.f49648m == 4 ? -1 : 0;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void release() {
        if (this.f49648m == 5) {
            return;
        }
        this.f49639d.release();
        this.f49648m = 5;
    }
}
