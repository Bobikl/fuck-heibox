package com.google.android.exoplayer2.video.spherical;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.exoplayer2.util.m0;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: SceneRenderer.java */
/* JADX INFO: loaded from: classes7.dex */
public final class i implements com.google.android.exoplayer2.video.j, a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f51938j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private SurfaceTexture f51939k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private byte[] f51942n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f51930b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f51931c = new AtomicBoolean(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f51932d = new g();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f51933e = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m0<Long> f51934f = new m0<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final m0<e> f51935g = new m0<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f51936h = new float[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float[] f51937i = new float[16];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile int f51940l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f51941m = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(SurfaceTexture surfaceTexture) {
        this.f51930b.set(true);
    }

    private void i(@p0 byte[] bArr, int i10, long j10) {
        byte[] bArr2 = this.f51942n;
        int i11 = this.f51941m;
        this.f51942n = bArr;
        if (i10 == -1) {
            i10 = this.f51940l;
        }
        this.f51941m = i10;
        if (i11 == i10 && Arrays.equals(bArr2, this.f51942n)) {
            return;
        }
        byte[] bArr3 = this.f51942n;
        e eVarA = bArr3 != null ? f.a(bArr3, this.f51941m) : null;
        if (eVarA == null || !g.c(eVarA)) {
            eVarA = e.b(this.f51941m);
        }
        this.f51935g.a(j10, eVarA);
    }

    @Override // com.google.android.exoplayer2.video.j
    public void a(long j10, long j11, a2 a2Var, @p0 MediaFormat mediaFormat) {
        this.f51934f.a(j11, Long.valueOf(j10));
        i(a2Var.f43603w, a2Var.f43604x, j11);
    }

    public void c(float[] fArr, boolean z10) {
        GLES20.glClear(16384);
        GlUtil.e();
        if (this.f51930b.compareAndSet(true, false)) {
            ((SurfaceTexture) com.google.android.exoplayer2.util.a.g(this.f51939k)).updateTexImage();
            GlUtil.e();
            if (this.f51931c.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f51936h, 0);
            }
            long timestamp = this.f51939k.getTimestamp();
            Long lG = this.f51934f.g(timestamp);
            if (lG != null) {
                this.f51933e.c(this.f51936h, lG.longValue());
            }
            e eVarJ = this.f51935g.j(timestamp);
            if (eVarJ != null) {
                this.f51932d.d(eVarJ);
            }
        }
        Matrix.multiplyMM(this.f51937i, 0, fArr, 0, this.f51936h, 0);
        this.f51932d.a(this.f51938j, this.f51937i, z10);
    }

    public SurfaceTexture d() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        GlUtil.e();
        this.f51932d.b();
        GlUtil.e();
        this.f51938j = GlUtil.j();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f51938j);
        this.f51939k = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.google.android.exoplayer2.video.spherical.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f51929b.f(surfaceTexture2);
            }
        });
        return this.f51939k;
    }

    @Override // com.google.android.exoplayer2.video.spherical.a
    public void e(long j10, float[] fArr) {
        this.f51933e.e(j10, fArr);
    }

    @Override // com.google.android.exoplayer2.video.spherical.a
    public void g() {
        this.f51934f.c();
        this.f51933e.d();
        this.f51931c.set(true);
    }

    public void h(int i10) {
        this.f51940l = i10;
    }

    public void j() {
        this.f51932d.e();
    }
}
