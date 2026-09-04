package com.ss.android.ttvecamera.provider;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.n0;
import androidx.annotation.w0;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.j;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: TECameraProvider.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f97771k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f97772l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f97773m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f97774n = 4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f97775o = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f97776p = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    c f97777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    TECameraFrame.ETEPixelFormat f97778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    TEFrameSizei f97779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    j f97780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f97781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f97782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TECameraFrame.d f97783g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected j.f f97784h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private c f97785i = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f97786j = new C0932b();

    /* JADX INFO: compiled from: TECameraProvider.java */
    public class a implements c {
        a() {
        }

        @Override // com.ss.android.ttvecamera.provider.b.c
        public void onFrameCaptured(TECameraFrame tECameraFrame) {
        }

        @Override // com.ss.android.ttvecamera.provider.b.c
        public void onNewSurfaceTexture(SurfaceTexture surfaceTexture) {
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.provider.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TECameraProvider.java */
    public class C0932b implements d {
        C0932b() {
        }

        @Override // com.ss.android.ttvecamera.provider.b.d
        public void a(Object obj) {
        }

        @Override // com.ss.android.ttvecamera.provider.b.d
        public void b(SurfaceTexture surfaceTexture, boolean z10) {
        }

        @Override // com.ss.android.ttvecamera.provider.b.d, com.ss.android.ttvecamera.provider.b.c
        public void onFrameCaptured(TECameraFrame tECameraFrame) {
        }

        @Override // com.ss.android.ttvecamera.provider.b.d, com.ss.android.ttvecamera.provider.b.c
        public void onNewSurfaceTexture(SurfaceTexture surfaceTexture) {
        }
    }

    /* JADX INFO: compiled from: TECameraProvider.java */
    public interface c {
        void onFrameCaptured(TECameraFrame tECameraFrame);

        void onNewSurfaceTexture(SurfaceTexture surfaceTexture);
    }

    /* JADX INFO: compiled from: TECameraProvider.java */
    public interface d extends c {
        void a(Object obj);

        void b(SurfaceTexture surfaceTexture, boolean z10);

        @Override // com.ss.android.ttvecamera.provider.b.c
        void onFrameCaptured(TECameraFrame tECameraFrame);

        @Override // com.ss.android.ttvecamera.provider.b.c
        void onNewSurfaceTexture(SurfaceTexture surfaceTexture);
    }

    public b(com.ss.android.ttvecamera.provider.c.a aVar, j jVar) {
        this.f97779c = new TEFrameSizei();
        this.f97781e = true;
        this.f97782f = 1;
        this.f97778b = aVar.f97798h;
        this.f97777a = aVar.f97793c;
        this.f97779c = aVar.f97792b;
        this.f97780d = jVar;
        this.f97781e = aVar.f97791a;
        this.f97782f = aVar.f97796f;
    }

    public static List<TEFrameSizei> a(List<Camera.Size> list) {
        ArrayList arrayList = new ArrayList();
        for (Camera.Size size : list) {
            arrayList.add(new TEFrameSizei(size.width, size.height));
        }
        return arrayList;
    }

    @w0(api = 21)
    public static List<TEFrameSizei> b(Size[] sizeArr) {
        if (sizeArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : sizeArr) {
            arrayList.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        return arrayList;
    }

    public TECameraFrame.d c() {
        return this.f97783g;
    }

    public Surface d() {
        return null;
    }

    public TEFrameSizei e() {
        return this.f97779c;
    }

    public abstract Surface f();

    public abstract SurfaceTexture g();

    public Surface[] h() {
        return null;
    }

    public int i() {
        return -1;
    }

    public abstract int j();

    public int k(@n0 Camera.Parameters parameters, TEFrameSizei tEFrameSizei) {
        return m(a(parameters.getSupportedPreviewSizes()), tEFrameSizei);
    }

    public int l(@n0 StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        return -1;
    }

    public abstract int m(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei);

    public boolean n() {
        return this.f97781e;
    }

    public void o(Object obj) {
        c cVar = this.f97777a;
        if (cVar == null || !(cVar instanceof d)) {
            return;
        }
        ((d) cVar).a(obj);
    }

    public void p(TECameraFrame tECameraFrame) {
        c cVar = this.f97777a;
        if (cVar != null) {
            cVar.onFrameCaptured(tECameraFrame);
        }
    }

    public abstract void q();

    public void r() {
        if (this.f97777a instanceof d) {
            this.f97777a = this.f97786j;
        } else {
            this.f97777a = this.f97785i;
        }
    }

    public void s(TECameraFrame.ETEPixelFormat eTEPixelFormat) {
        this.f97778b = eTEPixelFormat;
    }

    public void t(TECameraFrame.d dVar) {
        this.f97783g = dVar;
    }

    public void u(j.f fVar) {
        this.f97784h = fVar;
    }

    public void v(int i10, int i11) {
        TEFrameSizei tEFrameSizei = this.f97779c;
        tEFrameSizei.f97206b = i10;
        tEFrameSizei.f97207c = i11;
    }

    public abstract void w(SurfaceTexture surfaceTexture, boolean z10);

    public void x() {
    }
}
