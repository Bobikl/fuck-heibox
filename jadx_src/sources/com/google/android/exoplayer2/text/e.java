package com.google.android.exoplayer2.text;

import androidx.annotation.p0;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* JADX INFO: compiled from: ExoplayerCuesDecoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e implements h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f49617f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f49618g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f49619h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f49620i = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f49621a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f49622b = new k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Deque<l> f49623c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f49624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f49625e;

    /* JADX INFO: compiled from: ExoplayerCuesDecoder.java */
    public class a extends l {
        a() {
        }

        @Override // com.google.android.exoplayer2.decoder.h
        public void n() {
            e.this.h(this);
        }
    }

    /* JADX INFO: compiled from: ExoplayerCuesDecoder.java */
    public static final class b implements g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f49627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ImmutableList<com.google.android.exoplayer2.text.b> f49628c;

        public b(long j10, ImmutableList<com.google.android.exoplayer2.text.b> immutableList) {
            this.f49627b = j10;
            this.f49628c = immutableList;
        }

        @Override // com.google.android.exoplayer2.text.g
        public long a(int i10) {
            com.google.android.exoplayer2.util.a.a(i10 == 0);
            return this.f49627b;
        }

        @Override // com.google.android.exoplayer2.text.g
        public int b() {
            return 1;
        }

        @Override // com.google.android.exoplayer2.text.g
        public int c(long j10) {
            return this.f49627b > j10 ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.text.g
        public List<com.google.android.exoplayer2.text.b> d(long j10) {
            return j10 >= this.f49627b ? this.f49628c : ImmutableList.B();
        }
    }

    public e() {
        for (int i10 = 0; i10 < 2; i10++) {
            this.f49623c.addFirst(new a());
        }
        this.f49624d = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(l lVar) {
        com.google.android.exoplayer2.util.a.i(this.f49623c.size() < 2);
        com.google.android.exoplayer2.util.a.a(!this.f49623c.contains(lVar));
        lVar.f();
        this.f49623c.addFirst(lVar);
    }

    @Override // com.google.android.exoplayer2.text.h
    public void b(long j10) {
    }

    @Override // com.google.android.exoplayer2.decoder.f
    @p0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public k a() throws SubtitleDecoderException {
        com.google.android.exoplayer2.util.a.i(!this.f49625e);
        if (this.f49624d != 0) {
            return null;
        }
        this.f49624d = 1;
        return this.f49622b;
    }

    @Override // com.google.android.exoplayer2.decoder.f
    @p0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public l dequeueOutputBuffer() throws SubtitleDecoderException {
        com.google.android.exoplayer2.util.a.i(!this.f49625e);
        if (this.f49624d != 2 || this.f49623c.isEmpty()) {
            return null;
        }
        l lVarRemoveFirst = this.f49623c.removeFirst();
        if (this.f49622b.k()) {
            lVarRemoveFirst.e(4);
        } else {
            k kVar = this.f49622b;
            lVarRemoveFirst.o(this.f49622b.f44490g, new b(kVar.f44490g, this.f49621a.a(((ByteBuffer) com.google.android.exoplayer2.util.a.g(kVar.f44488e)).array())), 0L);
        }
        this.f49622b.f();
        this.f49624d = 0;
        return lVarRemoveFirst;
    }

    @Override // com.google.android.exoplayer2.decoder.f
    public void flush() {
        com.google.android.exoplayer2.util.a.i(!this.f49625e);
        this.f49622b.f();
        this.f49624d = 0;
    }

    @Override // com.google.android.exoplayer2.decoder.f
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void c(k kVar) throws SubtitleDecoderException {
        com.google.android.exoplayer2.util.a.i(!this.f49625e);
        com.google.android.exoplayer2.util.a.i(this.f49624d == 1);
        com.google.android.exoplayer2.util.a.a(this.f49622b == kVar);
        this.f49624d = 2;
    }

    @Override // com.google.android.exoplayer2.decoder.f
    public String getName() {
        return "ExoplayerCuesDecoder";
    }

    @Override // com.google.android.exoplayer2.decoder.f
    public void release() {
        this.f49625e = true;
    }
}
