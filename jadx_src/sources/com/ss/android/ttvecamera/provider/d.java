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

/* JADX INFO: compiled from: TEImageReaderProvider.java */
/* JADX INFO: loaded from: classes9.dex */
@w0(api = 19)
public class d extends b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ImageReader f97799q;

    /* JADX INFO: compiled from: TEImageReaderProvider.java */
    public class a implements ImageReader.OnImageAvailableListener {
        a() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Image imageAcquireLatestImage = imageReader.acquireLatestImage();
            if (imageAcquireLatestImage == null) {
                return;
            }
            try {
                try {
                    TECameraFrame tECameraFrame = new TECameraFrame(imageAcquireLatestImage.getWidth(), imageAcquireLatestImage.getHeight(), System.currentTimeMillis() * 1000);
                    r rVar = new r(imageAcquireLatestImage.getPlanes());
                    int iE = d.this.f97780d.E();
                    d dVar = d.this;
                    tECameraFrame.t(rVar, iE, dVar.f97778b, dVar.f97780d.z());
                    d.this.p(tECameraFrame);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            } finally {
                imageAcquireLatestImage.close();
            }
        }
    }

    public d(c.a aVar, j jVar) {
        super(aVar, jVar);
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public Surface f() {
        ImageReader imageReader = this.f97799q;
        if (imageReader != null) {
            return imageReader.getSurface();
        }
        return null;
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public SurfaceTexture g() {
        return null;
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public int j() {
        return 2;
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
        ImageReader imageReader = this.f97799q;
        if (imageReader != null) {
            imageReader.close();
        }
        TEFrameSizei tEFrameSizei2 = this.f97779c;
        ImageReader imageReaderNewInstance = ImageReader.newInstance(tEFrameSizei2.f97206b, tEFrameSizei2.f97207c, TECameraFrame.u(this.f97778b), 1);
        this.f97799q = imageReaderNewInstance;
        imageReaderNewInstance.setOnImageAvailableListener(new a(), this.f97780d.F());
        return 0;
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public void q() {
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public void r() {
        super.r();
        ImageReader imageReader = this.f97799q;
        if (imageReader != null) {
            imageReader.close();
            this.f97799q = null;
        }
    }

    @Override // com.ss.android.ttvecamera.provider.b
    public void w(SurfaceTexture surfaceTexture, boolean z10) {
    }
}
