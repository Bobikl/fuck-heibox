package com.google.android.exoplayer2.mediacodec;

import androidx.annotation.f0;
import androidx.annotation.j1;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: BatchBuffer.java */
/* JADX INFO: loaded from: classes7.dex */
public final class i extends DecoderInputBuffer {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f46765q = 32;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @j1
    static final int f46766r = 3072000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f46767n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f46768o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f46769p;

    public i() {
        super(2);
        this.f46769p = 32;
    }

    private boolean w(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        if (!A()) {
            return true;
        }
        if (this.f46768o >= this.f46769p || decoderInputBuffer.j() != j()) {
            return false;
        }
        ByteBuffer byteBuffer2 = decoderInputBuffer.f44488e;
        return byteBuffer2 == null || (byteBuffer = this.f44488e) == null || byteBuffer.position() + byteBuffer2.remaining() <= f46766r;
    }

    public boolean A() {
        return this.f46768o > 0;
    }

    public void C(@f0(from = 1) int i10) {
        com.google.android.exoplayer2.util.a.a(i10 > 0);
        this.f46769p = i10;
    }

    @Override // com.google.android.exoplayer2.decoder.DecoderInputBuffer, com.google.android.exoplayer2.decoder.a
    public void f() {
        super.f();
        this.f46768o = 0;
    }

    public boolean t(DecoderInputBuffer decoderInputBuffer) {
        com.google.android.exoplayer2.util.a.a(!decoderInputBuffer.q());
        com.google.android.exoplayer2.util.a.a(!decoderInputBuffer.i());
        com.google.android.exoplayer2.util.a.a(!decoderInputBuffer.k());
        if (!w(decoderInputBuffer)) {
            return false;
        }
        int i10 = this.f46768o;
        this.f46768o = i10 + 1;
        if (i10 == 0) {
            this.f44490g = decoderInputBuffer.f44490g;
            if (decoderInputBuffer.l()) {
                m(1);
            }
        }
        if (decoderInputBuffer.j()) {
            m(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = decoderInputBuffer.f44488e;
        if (byteBuffer != null) {
            o(byteBuffer.remaining());
            this.f44488e.put(byteBuffer);
        }
        this.f46767n = decoderInputBuffer.f44490g;
        return true;
    }

    public long x() {
        return this.f44490g;
    }

    public long y() {
        return this.f46767n;
    }

    public int z() {
        return this.f46768o;
    }
}
