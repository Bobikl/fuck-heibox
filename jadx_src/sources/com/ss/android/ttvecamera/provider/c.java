package com.ss.android.ttvecamera.provider;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.view.Surface;
import androidx.annotation.n0;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.h;
import com.ss.android.ttvecamera.j;
import com.ss.android.ttvecamera.o;
import com.ss.android.ttvecamera.q;
import java.util.List;

/* JADX INFO: compiled from: TECameraProviderManager.java */
/* JADX INFO: loaded from: classes9.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f97789b = "c";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f97790a;

    /* JADX INFO: compiled from: TECameraProviderManager.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f97791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TEFrameSizei f97792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b.c f97793c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public SurfaceTexture f97794d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f97795e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f97796f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Surface f97797g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public TECameraFrame.ETEPixelFormat f97798h;

        public a(TEFrameSizei tEFrameSizei, @n0 b.c cVar, boolean z10, SurfaceTexture surfaceTexture, int i10) {
            this.f97791a = true;
            this.f97796f = 0;
            this.f97798h = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_Count;
            this.f97792b = tEFrameSizei;
            this.f97793c = cVar;
            this.f97794d = surfaceTexture;
            this.f97795e = i10;
            this.f97791a = z10;
            this.f97798h = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES;
        }

        public a(TEFrameSizei tEFrameSizei, @n0 b.c cVar, boolean z10, SurfaceTexture surfaceTexture, int i10, Surface surface) {
            this.f97791a = true;
            this.f97796f = 0;
            this.f97798h = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_Count;
            this.f97792b = tEFrameSizei;
            this.f97793c = cVar;
            this.f97794d = surfaceTexture;
            this.f97795e = i10;
            this.f97791a = z10;
            this.f97798h = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_Recorder;
            this.f97797g = surface;
        }

        public a(TEFrameSizei tEFrameSizei, @n0 b.c cVar, boolean z10, SurfaceTexture surfaceTexture, TECameraFrame.ETEPixelFormat eTEPixelFormat) {
            this.f97791a = true;
            this.f97796f = 0;
            TECameraFrame.ETEPixelFormat eTEPixelFormat2 = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_Count;
            this.f97792b = tEFrameSizei;
            this.f97793c = cVar;
            this.f97794d = surfaceTexture;
            this.f97791a = z10;
            this.f97798h = eTEPixelFormat;
        }

        public a(TEFrameSizei tEFrameSizei, @n0 b.c cVar, boolean z10, SurfaceTexture surfaceTexture, TECameraFrame.ETEPixelFormat eTEPixelFormat, int i10) {
            this.f97791a = true;
            this.f97796f = 0;
            TECameraFrame.ETEPixelFormat eTEPixelFormat2 = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_Count;
            this.f97792b = tEFrameSizei;
            this.f97793c = cVar;
            this.f97794d = surfaceTexture;
            this.f97791a = z10;
            this.f97798h = eTEPixelFormat;
            this.f97796f = i10;
        }

        public a(TEFrameSizei tEFrameSizei, @n0 b.c cVar, boolean z10, TECameraFrame.ETEPixelFormat eTEPixelFormat) {
            this.f97791a = true;
            this.f97796f = 0;
            TECameraFrame.ETEPixelFormat eTEPixelFormat2 = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_Count;
            this.f97792b = tEFrameSizei;
            this.f97793c = cVar;
            this.f97798h = eTEPixelFormat;
            this.f97791a = z10;
        }

        public a(@n0 a aVar) {
            this.f97791a = true;
            this.f97796f = 0;
            this.f97798h = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_Count;
            this.f97791a = aVar.f97791a;
            this.f97792b = aVar.f97792b;
            this.f97793c = aVar.f97793c;
            this.f97794d = aVar.f97794d;
            this.f97795e = aVar.f97795e;
            this.f97796f = aVar.f97796f;
        }

        public void a(@n0 a aVar) {
            this.f97791a = aVar.f97791a;
            this.f97792b = aVar.f97792b;
            this.f97793c = aVar.f97793c;
            this.f97794d = aVar.f97794d;
            this.f97795e = aVar.f97795e;
            this.f97796f = aVar.f97796f;
        }

        public boolean b(a aVar) {
            if (aVar != null && this.f97791a == aVar.f97791a) {
                TEFrameSizei tEFrameSizei = this.f97792b;
                int i10 = tEFrameSizei.f97206b;
                TEFrameSizei tEFrameSizei2 = aVar.f97792b;
                if (i10 == tEFrameSizei2.f97206b && tEFrameSizei.f97207c == tEFrameSizei2.f97207c && this.f97793c == aVar.f97793c && this.f97794d == aVar.f97794d && this.f97795e == aVar.f97795e && this.f97796f == aVar.f97796f) {
                    return true;
                }
            }
            return false;
        }

        @n0
        public String toString() {
            return "ProviderSettings: [mIsPreview = " + this.f97791a + ", mSize = " + this.f97792b + ", mListener = " + this.f97793c + ", mSurfaceTexture = " + this.f97794d + ", mTextureOES = " + this.f97795e + ", mImageReaderCount = " + this.f97796f + "]";
        }
    }

    public void a(@n0 a aVar, @n0 j jVar) {
        b bVar = this.f97790a;
        if (bVar != null) {
            bVar.r();
        }
        TECameraFrame.ETEPixelFormat eTEPixelFormat = aVar.f97798h;
        if (eTEPixelFormat == TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_Recorder) {
            this.f97790a = new f(aVar, jVar);
        } else if (eTEPixelFormat == TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES) {
            this.f97790a = new g(aVar, jVar);
        } else if (!(jVar instanceof h)) {
            this.f97790a = new com.ss.android.ttvecamera.provider.a(aVar, jVar);
        } else if (aVar.f97796f > 0) {
            this.f97790a = new e(aVar, jVar);
        } else {
            this.f97790a = new d(aVar, jVar);
        }
        jVar.s0(this);
    }

    public TEFrameSizei b() {
        return !this.f97790a.n() ? this.f97790a.f97779c : new TEFrameSizei(1080, 1920);
    }

    public TEFrameSizei c() {
        if (this.f97790a.n()) {
            return this.f97790a.e();
        }
        return null;
    }

    public Surface d() {
        b bVar = this.f97790a;
        if (bVar != null) {
            return bVar.f();
        }
        return null;
    }

    public Surface[] e() {
        b bVar = this.f97790a;
        if (bVar != null) {
            return bVar.h();
        }
        return null;
    }

    public b f() {
        return this.f97790a;
    }

    public int g() {
        b bVar = this.f97790a;
        if (bVar != null) {
            return bVar.j();
        }
        return 0;
    }

    public SurfaceTexture h() {
        b bVar = this.f97790a;
        if (bVar != null) {
            return bVar.g();
        }
        return null;
    }

    public Surface i() {
        b bVar = this.f97790a;
        if (bVar != null) {
            return bVar.d();
        }
        return null;
    }

    public int j(@n0 Camera.Parameters parameters, TEFrameSizei tEFrameSizei) {
        b bVar = this.f97790a;
        return (bVar == null || bVar == null) ? o.f97693p : bVar.k(parameters, tEFrameSizei);
    }

    public int k(@n0 StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        b bVar = this.f97790a;
        return (bVar == null || bVar == null) ? o.f97693p : bVar.l(streamConfigurationMap, tEFrameSizei);
    }

    public int l(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        b bVar = this.f97790a;
        return bVar != null ? bVar.m(list, tEFrameSizei) : o.f97693p;
    }

    public void m() {
        b bVar = this.f97790a;
        if (bVar != null) {
            bVar.r();
            this.f97790a = null;
        }
    }

    public void n(j.f fVar) {
        b bVar = this.f97790a;
        if (bVar == null) {
            q.e(f97789b, "provider is null!");
        } else {
            bVar.u(fVar);
        }
    }
}
