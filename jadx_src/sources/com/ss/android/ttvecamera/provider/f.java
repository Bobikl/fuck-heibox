package com.ss.android.ttvecamera.provider;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.n0;
import androidx.annotation.w0;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.j;
import com.ss.android.ttvecamera.p;
import java.util.List;

/* JADX INFO: compiled from: TERecorderProvider.java */
/* JADX INFO: loaded from: classes9.dex */
public class f extends b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f97807v = "TERecorderProvider";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Surface f97808q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Surface f97809r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private SurfaceTexture f97810s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float[] f97811t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f97812u;

    /* JADX INFO: compiled from: TERecorderProvider.java */
    public class a implements SurfaceTexture.OnFrameAvailableListener {
        a() {
        }

        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            f fVar = f.this;
            if (fVar.f97780d == null) {
                return;
            }
            surfaceTexture.getTransformMatrix(fVar.f97811t);
            TEFrameSizei tEFrameSizei = f.this.f97779c;
            TECameraFrame tECameraFrame = new TECameraFrame(tEFrameSizei.f97206b, tEFrameSizei.f97207c, surfaceTexture.getTimestamp());
            f fVar2 = f.this;
            int i10 = fVar2.f97812u;
            int iE = fVar2.f97780d.E();
            float[] fArr = f.this.f97811t;
            f fVar3 = f.this;
            tECameraFrame.r(i10, iE, fArr, fVar3.f97778b, fVar3.f97780d.z());
            f.this.p(tECameraFrame);
        }
    }

    public f(c.a aVar, j jVar) {
        super(aVar, jVar);
        this.f97811t = new float[16];
        this.f97810s = aVar.f97794d;
        this.f97812u = aVar.f97795e;
        this.f97809r = new Surface(aVar.f97794d);
        this.f97808q = aVar.f97797g;
        Log.d(f97807v, "constructor");
    }

    private void z(@n0 SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
        this.f97810s.setOnFrameAvailableListener(onFrameAvailableListener, this.f97780d.F());
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public Surface d() {
        return this.f97808q;
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public Surface f() {
        Log.d(f97807v, "get preview surface");
        return this.f97809r;
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public SurfaceTexture g() {
        return this.f97810s;
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public int j() {
        return 16;
    }

    @Override // com.ss.android.ttvecamera.provider.b
    @w0(api = 21)
    public int l(@n0 StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        return m(b.b(streamConfigurationMap.getOutputSizes(SurfaceTexture.class)), tEFrameSizei);
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public int m(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        if (list != null && list.size() > 0) {
            this.f97779c = p.b(list, this.f97779c);
        }
        SurfaceTexture surfaceTexture = this.f97810s;
        TEFrameSizei tEFrameSizei2 = this.f97779c;
        surfaceTexture.setDefaultBufferSize(tEFrameSizei2.f97206b, tEFrameSizei2.f97207c);
        z(new a());
        return 0;
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public void q() {
        Surface surface = this.f97809r;
        if (surface != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture = this.f97810s;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.f97810s = new SurfaceTexture(this.f97812u);
        this.f97809r = new Surface(this.f97810s);
        this.f97777a.onNewSurfaceTexture(this.f97810s);
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public void r() {
        super.r();
        Surface surface = this.f97809r;
        if (surface != null) {
            surface.release();
            this.f97809r = null;
        }
        Surface surface2 = this.f97808q;
        if (surface2 != null) {
            surface2.release();
            this.f97808q = null;
        }
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public void w(SurfaceTexture surfaceTexture, boolean z10) {
    }
}
