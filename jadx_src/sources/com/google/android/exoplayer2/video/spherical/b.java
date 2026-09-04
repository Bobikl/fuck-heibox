package com.google.android.exoplayer2.video.spherical;

import androidx.annotation.p0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.n3;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.y;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: CameraMotionRenderer.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b extends com.google.android.exoplayer2.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f51867s = "CameraMotionRenderer";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f51868t = 100000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final DecoderInputBuffer f51869n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final e0 f51870o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f51871p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @p0
    private a f51872q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f51873r;

    public b() {
        super(6);
        this.f51869n = new DecoderInputBuffer(1);
        this.f51870o = new e0();
    }

    @p0
    private float[] N(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f51870o.Q(byteBuffer.array(), byteBuffer.limit());
        this.f51870o.S(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.f51870o.r());
        }
        return fArr;
    }

    private void O() {
        a aVar = this.f51872q;
        if (aVar != null) {
            aVar.g();
        }
    }

    @Override // com.google.android.exoplayer2.e
    protected void E() {
        O();
    }

    @Override // com.google.android.exoplayer2.e
    protected void G(long j10, boolean z10) {
        this.f51873r = Long.MIN_VALUE;
        O();
    }

    @Override // com.google.android.exoplayer2.e
    protected void K(a2[] a2VarArr, long j10, long j11) {
        this.f51871p = j11;
    }

    @Override // com.google.android.exoplayer2.o3
    public int a(a2 a2Var) {
        return y.B0.equals(a2Var.f43593m) ? n3.a(4) : n3.a(0);
    }

    @Override // com.google.android.exoplayer2.m3
    public boolean b() {
        return f();
    }

    @Override // com.google.android.exoplayer2.m3, com.google.android.exoplayer2.o3
    public String getName() {
        return f51867s;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.h3.b
    public void h(int i10, @p0 Object obj) throws ExoPlaybackException {
        if (i10 == 8) {
            this.f51872q = (a) obj;
        } else {
            super.h(i10, obj);
        }
    }

    @Override // com.google.android.exoplayer2.m3
    public boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.m3
    public void j(long j10, long j11) {
        while (!f() && this.f51873r < 100000 + j10) {
            this.f51869n.f();
            if (L(z(), this.f51869n, 0) != -4 || this.f51869n.k()) {
                return;
            }
            DecoderInputBuffer decoderInputBuffer = this.f51869n;
            this.f51873r = decoderInputBuffer.f44490g;
            if (this.f51872q != null && !decoderInputBuffer.j()) {
                this.f51869n.p();
                float[] fArrN = N((ByteBuffer) u0.k(this.f51869n.f44488e));
                if (fArrN != null) {
                    ((a) u0.k(this.f51872q)).e(this.f51873r - this.f51871p, fArrN);
                }
            }
        }
    }
}
