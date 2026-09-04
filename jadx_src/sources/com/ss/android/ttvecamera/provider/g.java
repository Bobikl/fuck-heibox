package com.ss.android.ttvecamera.provider;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.n0;
import androidx.annotation.w0;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.j;
import com.ss.android.ttvecamera.p;
import java.util.List;

/* JADX INFO: compiled from: TESurfaceTextureProvider.java */
/* JADX INFO: loaded from: classes9.dex */
public class g extends b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    SurfaceTexture f97814q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Surface f97815r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    float[] f97816s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f97817t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    SurfaceTexture.OnFrameAvailableListener f97818u;

    /* JADX INFO: compiled from: TESurfaceTextureProvider.java */
    public class a implements SurfaceTexture.OnFrameAvailableListener {
        a() {
        }

        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            g gVar = g.this;
            if (gVar.f97780d == null) {
                return;
            }
            surfaceTexture.getTransformMatrix(gVar.f97816s);
            TEFrameSizei tEFrameSizei = g.this.f97779c;
            TECameraFrame tECameraFrame = new TECameraFrame(tEFrameSizei.f97206b, tEFrameSizei.f97207c, surfaceTexture.getTimestamp());
            g gVar2 = g.this;
            int i10 = gVar2.f97817t;
            int iE = gVar2.f97780d.E();
            g gVar3 = g.this;
            tECameraFrame.r(i10, iE, gVar3.f97816s, gVar3.f97778b, gVar3.f97780d.z());
            tECameraFrame.v(g.this.f97783g);
            g.this.p(tECameraFrame);
        }
    }

    public g(c.a aVar, j jVar) {
        super(aVar, jVar);
        this.f97816s = new float[16];
        this.f97818u = new a();
        this.f97814q = aVar.f97794d;
        this.f97817t = aVar.f97795e;
        this.f97815r = new Surface(this.f97814q);
    }

    private void y(@n0 SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
        this.f97814q.setOnFrameAvailableListener(onFrameAvailableListener, this.f97780d.F());
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public Surface f() {
        return this.f97815r;
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public SurfaceTexture g() {
        return this.f97814q;
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public int i() {
        return this.f97817t;
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public int j() {
        return 1;
    }

    @Override // com.ss.android.ttvecamera.provider.b
    @w0(api = 21)
    public int l(@n0 StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        if (!this.f97780d.u().f97075a0) {
            return m(b.b(outputSizes), tEFrameSizei);
        }
        return m(p.z(b.b(outputSizes), b.b(streamConfigurationMap.getOutputSizes(MediaRecorder.class))), tEFrameSizei);
    }

    @Override // com.ss.android.ttvecamera.provider.b
    @w0(api = 15)
    public int m(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        TEFrameSizei previewSize;
        if (list != null && list.size() > 0) {
            j.f fVar = this.f97784h;
            if (fVar == null || (previewSize = fVar.getPreviewSize(list)) == null) {
                this.f97779c = p.b(list, this.f97779c);
            } else {
                this.f97779c = previewSize;
            }
        }
        SurfaceTexture surfaceTexture = this.f97814q;
        TEFrameSizei tEFrameSizei2 = this.f97779c;
        surfaceTexture.setDefaultBufferSize(tEFrameSizei2.f97206b, tEFrameSizei2.f97207c);
        y(this.f97818u);
        return 0;
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public void q() {
        Surface surface = this.f97815r;
        if (surface != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture = this.f97814q;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.f97814q = new SurfaceTexture(this.f97817t);
        this.f97815r = new Surface(this.f97814q);
        this.f97777a.onNewSurfaceTexture(this.f97814q);
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public void r() {
        super.r();
        Surface surface = this.f97815r;
        if (surface != null) {
            surface.release();
            this.f97815r = null;
        }
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public void w(SurfaceTexture surfaceTexture, boolean z10) {
        Surface surface = this.f97815r;
        if (surface != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture2 = this.f97814q;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        this.f97814q = surfaceTexture;
        this.f97815r = new Surface(this.f97814q);
        y(this.f97818u);
        b.c cVar = this.f97777a;
        if (cVar == null || !(cVar instanceof b.d)) {
            return;
        }
        ((b.d) cVar).b(this.f97814q, z10);
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public void x() {
        super.x();
        this.f97818u.onFrameAvailable(this.f97814q);
    }
}
