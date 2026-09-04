package com.google.android.exoplayer2.text.cea;

import androidx.annotation.p0;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.h;
import com.google.android.exoplayer2.text.k;
import com.google.android.exoplayer2.text.l;
import com.google.android.exoplayer2.util.u0;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: CeaDecoder.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class e implements h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f49532g = 10;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f49533h = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque<b> f49534a = new ArrayDeque<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque<l> f49535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PriorityQueue<b> f49536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private b f49537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f49538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f49539f;

    /* JADX INFO: compiled from: CeaDecoder.java */
    public static final class b extends k implements Comparable<b> {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private long f49540o;

        private b() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (k() != bVar.k()) {
                return k() ? 1 : -1;
            }
            long j10 = this.f44490g - bVar.f44490g;
            if (j10 == 0) {
                j10 = this.f49540o - bVar.f49540o;
                if (j10 == 0) {
                    return 0;
                }
            }
            return j10 > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: compiled from: CeaDecoder.java */
    public static final class c extends l {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private com.google.android.exoplayer2.decoder.h.a<c> f49541g;

        public c(com.google.android.exoplayer2.decoder.h.a<c> aVar) {
            this.f49541g = aVar;
        }

        @Override // com.google.android.exoplayer2.decoder.h
        public final void n() {
            this.f49541g.a(this);
        }
    }

    public e() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f49534a.add(new b());
        }
        this.f49535b = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f49535b.add(new c(new com.google.android.exoplayer2.decoder.h.a() { // from class: com.google.android.exoplayer2.text.cea.d
                @Override // com.google.android.exoplayer2.decoder.h.a
                public final void a(com.google.android.exoplayer2.decoder.h hVar) {
                    this.f49531a.m((e.c) hVar);
                }
            }));
        }
        this.f49536c = new PriorityQueue<>();
    }

    private void l(b bVar) {
        bVar.f();
        this.f49534a.add(bVar);
    }

    @Override // com.google.android.exoplayer2.text.h
    public void b(long j10) {
        this.f49538e = j10;
    }

    protected abstract com.google.android.exoplayer2.text.g d();

    protected abstract void e(k kVar);

    @Override // com.google.android.exoplayer2.decoder.f
    @p0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public k a() throws SubtitleDecoderException {
        com.google.android.exoplayer2.util.a.i(this.f49537d == null);
        if (this.f49534a.isEmpty()) {
            return null;
        }
        b bVarPollFirst = this.f49534a.pollFirst();
        this.f49537d = bVarPollFirst;
        return bVarPollFirst;
    }

    @Override // com.google.android.exoplayer2.decoder.f
    public void flush() {
        this.f49539f = 0L;
        this.f49538e = 0L;
        while (!this.f49536c.isEmpty()) {
            l((b) u0.k(this.f49536c.poll()));
        }
        b bVar = this.f49537d;
        if (bVar != null) {
            l(bVar);
            this.f49537d = null;
        }
    }

    @Override // com.google.android.exoplayer2.decoder.f
    @p0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public l dequeueOutputBuffer() throws SubtitleDecoderException {
        if (this.f49535b.isEmpty()) {
            return null;
        }
        while (!this.f49536c.isEmpty() && ((b) u0.k(this.f49536c.peek())).f44490g <= this.f49538e) {
            b bVar = (b) u0.k(this.f49536c.poll());
            if (bVar.k()) {
                l lVar = (l) u0.k(this.f49535b.pollFirst());
                lVar.e(4);
                l(bVar);
                return lVar;
            }
            e(bVar);
            if (j()) {
                com.google.android.exoplayer2.text.g gVarD = d();
                l lVar2 = (l) u0.k(this.f49535b.pollFirst());
                lVar2.o(bVar.f44490g, gVarD, Long.MAX_VALUE);
                l(bVar);
                return lVar2;
            }
            l(bVar);
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.decoder.f
    public abstract String getName();

    @p0
    protected final l h() {
        return this.f49535b.pollFirst();
    }

    protected final long i() {
        return this.f49538e;
    }

    protected abstract boolean j();

    @Override // com.google.android.exoplayer2.decoder.f
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void c(k kVar) throws SubtitleDecoderException {
        com.google.android.exoplayer2.util.a.a(kVar == this.f49537d);
        b bVar = (b) kVar;
        if (bVar.j()) {
            l(bVar);
        } else {
            long j10 = this.f49539f;
            this.f49539f = 1 + j10;
            bVar.f49540o = j10;
            this.f49536c.add(bVar);
        }
        this.f49537d = null;
    }

    protected void m(l lVar) {
        lVar.f();
        this.f49535b.add(lVar);
    }

    @Override // com.google.android.exoplayer2.decoder.f
    public void release() {
    }
}
