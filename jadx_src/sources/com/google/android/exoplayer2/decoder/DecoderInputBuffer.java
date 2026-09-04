package com.google.android.exoplayer2.decoder;

import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.y1;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class DecoderInputBuffer extends com.google.android.exoplayer2.decoder.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f44483k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f44484l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f44485m = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public a2 f44486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f44487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    public ByteBuffer f44488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f44489f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f44490g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    public ByteBuffer f44491h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f44492i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f44493j;

    public static final class InsufficientCapacityException extends IllegalStateException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f44494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f44495c;

        public InsufficientCapacityException(int i10, int i11) {
            StringBuilder sb2 = new StringBuilder(44);
            sb2.append("Buffer too small (");
            sb2.append(i10);
            sb2.append(" < ");
            sb2.append(i11);
            sb2.append(")");
            super(sb2.toString());
            this.f44494b = i10;
            this.f44495c = i11;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    static {
        y1.a("goog.exo.decoder");
    }

    public DecoderInputBuffer(int i10) {
        this(i10, 0);
    }

    public DecoderInputBuffer(int i10, int i11) {
        this.f44487d = new d();
        this.f44492i = i10;
        this.f44493j = i11;
    }

    private ByteBuffer n(int i10) {
        int i11 = this.f44492i;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f44488e;
        throw new InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    public static DecoderInputBuffer r() {
        return new DecoderInputBuffer(0);
    }

    @Override // com.google.android.exoplayer2.decoder.a
    public void f() {
        super.f();
        ByteBuffer byteBuffer = this.f44488e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f44491h;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f44489f = false;
    }

    @mk.d({"data"})
    public void o(int i10) {
        int i11 = i10 + this.f44493j;
        ByteBuffer byteBuffer = this.f44488e;
        if (byteBuffer == null) {
            this.f44488e = n(i11);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i12 = i11 + iPosition;
        if (iCapacity >= i12) {
            this.f44488e = byteBuffer;
            return;
        }
        ByteBuffer byteBufferN = n(i12);
        byteBufferN.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferN.put(byteBuffer);
        }
        this.f44488e = byteBufferN;
    }

    public final void p() {
        ByteBuffer byteBuffer = this.f44488e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f44491h;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean q() {
        return h(1073741824);
    }

    @mk.d({"supplementalData"})
    public void s(int i10) {
        ByteBuffer byteBuffer = this.f44491h;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f44491h = ByteBuffer.allocate(i10);
        } else {
            this.f44491h.clear();
        }
    }
}
