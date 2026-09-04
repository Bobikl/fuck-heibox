package com.google.android.exoplayer2.text;

import androidx.annotation.p0;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: SimpleSubtitleDecoder.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class f extends com.google.android.exoplayer2.decoder.k<k, l, SubtitleDecoderException> implements h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f49629n;

    /* JADX INFO: compiled from: SimpleSubtitleDecoder.java */
    public class a extends l {
        a() {
        }

        @Override // com.google.android.exoplayer2.decoder.h
        public void n() {
            f.this.q(this);
        }
    }

    protected f(String str) {
        super(new k[2], new l[2]);
        this.f49629n = str;
        t(1024);
    }

    @Override // com.google.android.exoplayer2.text.h
    public void b(long j10) {
    }

    @Override // com.google.android.exoplayer2.decoder.f
    public final String getName() {
        return this.f49629n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.decoder.k
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final k f() {
        return new k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.decoder.k
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final l g() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.decoder.k
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final SubtitleDecoderException h(Throwable th2) {
        return new SubtitleDecoderException("Unexpected decode error", th2);
    }

    protected abstract g y(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.decoder.k
    @p0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final SubtitleDecoderException i(k kVar, l lVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) com.google.android.exoplayer2.util.a.g(kVar.f44488e);
            lVar.o(kVar.f44490g, y(byteBuffer.array(), byteBuffer.limit(), z10), kVar.f49650n);
            lVar.g(Integer.MIN_VALUE);
            return null;
        } catch (SubtitleDecoderException e10) {
            return e10;
        }
    }
}
