package com.google.common.hash;

import com.google.common.base.w;
import java.io.Serializable;
import java.nio.ByteBuffer;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@h
@s9.j
public final class SipHashFunction extends c implements Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final k f58517f = new SipHashFunction(2, 4, 506097522914230528L, 1084818905618843912L);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f58518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f58519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f58520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f58521e;

    public static final class a extends f {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f58522l = 8;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f58523d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f58524e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f58525f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f58526g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f58527h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f58528i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f58529j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f58530k;

        a(int i10, int i11, long j10, long j11) {
            super(8);
            this.f58529j = 0L;
            this.f58530k = 0L;
            this.f58523d = i10;
            this.f58524e = i11;
            this.f58525f = 8317987319222330741L ^ j10;
            this.f58526g = 7237128888997146477L ^ j11;
            this.f58527h = 7816392313619706465L ^ j10;
            this.f58528i = 8387220255154660723L ^ j11;
        }

        private void v(long j10) {
            this.f58528i ^= j10;
            w(this.f58523d);
            this.f58525f = j10 ^ this.f58525f;
        }

        private void w(int i10) {
            for (int i11 = 0; i11 < i10; i11++) {
                long j10 = this.f58525f;
                long j11 = this.f58526g;
                this.f58525f = j10 + j11;
                this.f58527h += this.f58528i;
                this.f58526g = Long.rotateLeft(j11, 13);
                long jRotateLeft = Long.rotateLeft(this.f58528i, 16);
                long j12 = this.f58526g;
                long j13 = this.f58525f;
                this.f58526g = j12 ^ j13;
                this.f58528i = jRotateLeft ^ this.f58527h;
                long jRotateLeft2 = Long.rotateLeft(j13, 32);
                long j14 = this.f58527h;
                long j15 = this.f58526g;
                this.f58527h = j14 + j15;
                this.f58525f = jRotateLeft2 + this.f58528i;
                this.f58526g = Long.rotateLeft(j15, 17);
                long jRotateLeft3 = Long.rotateLeft(this.f58528i, 21);
                long j16 = this.f58526g;
                long j17 = this.f58527h;
                this.f58526g = j16 ^ j17;
                this.f58528i = jRotateLeft3 ^ this.f58525f;
                this.f58527h = Long.rotateLeft(j17, 32);
            }
        }

        @Override // com.google.common.hash.f
        protected HashCode p() {
            long j10 = this.f58530k ^ (this.f58529j << 56);
            this.f58530k = j10;
            v(j10);
            this.f58527h ^= 255;
            w(this.f58524e);
            return HashCode.j(((this.f58525f ^ this.f58526g) ^ this.f58527h) ^ this.f58528i);
        }

        @Override // com.google.common.hash.f
        protected void s(ByteBuffer byteBuffer) {
            this.f58529j += 8;
            v(byteBuffer.getLong());
        }

        @Override // com.google.common.hash.f
        protected void t(ByteBuffer byteBuffer) {
            this.f58529j += (long) byteBuffer.remaining();
            int i10 = 0;
            while (byteBuffer.hasRemaining()) {
                this.f58530k ^= (((long) byteBuffer.get()) & 255) << i10;
                i10 += 8;
            }
        }
    }

    SipHashFunction(int i10, int i11, long j10, long j11) {
        w.k(i10 > 0, "The number of SipRound iterations (c=%s) during Compression must be positive.", i10);
        w.k(i11 > 0, "The number of SipRound iterations (d=%s) during Finalization must be positive.", i11);
        this.f58518b = i10;
        this.f58519c = i11;
        this.f58520d = j10;
        this.f58521e = j11;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof SipHashFunction)) {
            return false;
        }
        SipHashFunction sipHashFunction = (SipHashFunction) obj;
        return this.f58518b == sipHashFunction.f58518b && this.f58519c == sipHashFunction.f58519c && this.f58520d == sipHashFunction.f58520d && this.f58521e == sipHashFunction.f58521e;
    }

    @Override // com.google.common.hash.k
    public int h() {
        return 64;
    }

    public int hashCode() {
        return (int) ((((long) ((SipHashFunction.class.hashCode() ^ this.f58518b) ^ this.f58519c)) ^ this.f58520d) ^ this.f58521e);
    }

    @Override // com.google.common.hash.k
    public m i() {
        return new a(this.f58518b, this.f58519c, this.f58520d, this.f58521e);
    }

    public String toString() {
        int i10 = this.f58518b;
        int i11 = this.f58519c;
        long j10 = this.f58520d;
        long j11 = this.f58521e;
        StringBuilder sb2 = new StringBuilder(81);
        sb2.append("Hashing.sipHash");
        sb2.append(i10);
        sb2.append(i11);
        sb2.append("(");
        sb2.append(j10);
        sb2.append(", ");
        sb2.append(j11);
        sb2.append(")");
        return sb2.toString();
    }
}
