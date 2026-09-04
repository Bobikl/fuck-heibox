package com.ss.android.ttvecamera.provider;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import androidx.annotation.n0;
import androidx.annotation.w0;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.j;
import com.ss.android.ttvecamera.p;
import com.ss.android.ttvecamera.r;
import java.util.List;

/* JADX INFO: compiled from: TEMultiCamera2Provider.java */
/* JADX INFO: loaded from: classes9.dex */
@w0(api = 19)
public class e extends b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    SurfaceTexture f97801q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    float[] f97802r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f97803s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    ImageReader[] f97804t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    Surface[] f97805u;

    /* JADX INFO: compiled from: TEMultiCamera2Provider.java */
    public class a implements ImageReader.OnImageAvailableListener {
        a() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Image imageAcquireNextImage = imageReader.acquireNextImage();
            if (imageAcquireNextImage == null) {
                return;
            }
            TECameraFrame tECameraFrame = new TECameraFrame(imageAcquireNextImage.getWidth(), imageAcquireNextImage.getHeight(), System.currentTimeMillis() * 1000);
            r rVar = new r(imageAcquireNextImage.getPlanes());
            int iE = e.this.f97780d.E();
            e eVar = e.this;
            tECameraFrame.t(rVar, iE, eVar.f97778b, eVar.f97780d.z());
            e.this.p(tECameraFrame);
            imageAcquireNextImage.close();
        }
    }

    public e(c.a aVar, j jVar) {
        super(aVar, jVar);
        this.f97802r = new float[16];
        SurfaceTexture surfaceTexture = aVar.f97794d;
        this.f97801q = surfaceTexture;
        this.f97803s = aVar.f97795e;
        int i10 = this.f97782f;
        this.f97804t = new ImageReader[i10];
        Surface[] surfaceArr = new Surface[surfaceTexture != null ? i10 + 1 : i10];
        this.f97805u = surfaceArr;
        if (surfaceTexture != null) {
            surfaceArr[0] = new Surface(this.f97801q);
        }
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public Surface f() {
        Surface[] surfaceArr = this.f97805u;
        if (surfaceArr != null) {
            return surfaceArr[0];
        }
        return null;
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public SurfaceTexture g() {
        return this.f97801q;
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public Surface[] h() {
        return this.f97805u;
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public int i() {
        return this.f97801q != null ? this.f97803s : super.i();
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public int j() {
        return 8;
    }

    @Override // com.ss.android.ttvecamera.provider.b
    @w0(api = 21)
    public int l(@n0 StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        int[] outputFormats = streamConfigurationMap.getOutputFormats();
        int iU = TECameraFrame.u(this.f97778b);
        int i10 = 0;
        for (int i11 : outputFormats) {
            if (i11 == iU) {
                i10 = i11;
                break;
            }
        }
        if (i10 == 0) {
            i10 = 35;
            this.f97778b = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_YUV420;
        }
        return m(b.b(streamConfigurationMap.getOutputSizes(i10)), tEFrameSizei);
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public int m(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        if (list != null && list.size() > 0) {
            this.f97779c = p.b(list, this.f97779c);
        }
        SurfaceTexture surfaceTexture = this.f97801q;
        if (surfaceTexture != null) {
            TEFrameSizei tEFrameSizei2 = this.f97779c;
            surfaceTexture.setDefaultBufferSize(tEFrameSizei2.f97206b, tEFrameSizei2.f97207c);
        }
        for (int i10 = 0; i10 < this.f97782f; i10++) {
            ImageReader[] imageReaderArr = this.f97804t;
            TEFrameSizei tEFrameSizei3 = this.f97779c;
            imageReaderArr[i10] = ImageReader.newInstance(tEFrameSizei3.f97206b, tEFrameSizei3.f97207c, TECameraFrame.u(this.f97778b), 1);
            this.f97804t[i10].setOnImageAvailableListener(new a(), this.f97780d.F());
            if (this.f97801q != null) {
                this.f97805u[i10 + 1] = this.f97804t[i10].getSurface();
            } else {
                this.f97805u[i10] = this.f97804t[i10].getSurface();
            }
        }
        return 0;
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public void q() {
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public void r() {
        Surface[] surfaceArr;
        Surface surface;
        super.r();
        ImageReader[] imageReaderArr = this.f97804t;
        if (imageReaderArr != null) {
            for (ImageReader imageReader : imageReaderArr) {
                if (imageReader != null) {
                    imageReader.close();
                }
            }
            this.f97804t = null;
        }
        if (this.f97801q == null || (surfaceArr = this.f97805u) == null || (surface = surfaceArr[0]) == null) {
            return;
        }
        surface.release();
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public void w(SurfaceTexture surfaceTexture, boolean z10) {
        Surface surface;
        if (this.f97801q == null) {
            return;
        }
        Surface[] surfaceArr = this.f97805u;
        if (surfaceArr != null && (surface = surfaceArr[0]) != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture2 = this.f97801q;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        this.f97801q = surfaceTexture;
        this.f97805u[0] = new Surface(this.f97801q);
        b.c cVar = this.f97777a;
        if (cVar == null || !(cVar instanceof b.d)) {
            return;
        }
        ((b.d) cVar).b(this.f97801q, z10);
    }
}
