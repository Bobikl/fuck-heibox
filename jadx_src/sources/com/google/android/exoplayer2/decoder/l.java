package com.google.android.exoplayer2.decoder;

import androidx.annotation.p0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: SimpleDecoderOutputBuffer.java */
/* JADX INFO: loaded from: classes7.dex */
public class l extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h.a<l> f44563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    public ByteBuffer f44564f;

    public l(h.a<l> aVar) {
        this.f44563e = aVar;
    }

    @Override // com.google.android.exoplayer2.decoder.a
    public void f() {
        super.f();
        ByteBuffer byteBuffer = this.f44564f;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    @Override // com.google.android.exoplayer2.decoder.h
    public void n() {
        this.f44563e.a(this);
    }

    public ByteBuffer o(long j10, int i10) {
        this.f44523c = j10;
        ByteBuffer byteBuffer = this.f44564f;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f44564f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        }
        this.f44564f.position(0);
        this.f44564f.limit(i10);
        return this.f44564f;
    }
}
