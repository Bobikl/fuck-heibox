package com.huawei.hms.scankit.p;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import android.view.TextureView;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: compiled from: CameraManager.java */
/* JADX INFO: loaded from: classes7.dex */
public class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e0 f61962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f61963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f61964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Camera.PreviewCallback f61965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WeakReference<Context> f61966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private i0 f61967f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private h0 f61968g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private n0 f61969h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private l0 f61970i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Camera f61971j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private f0 f61972k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f61973l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c f61974m = c.CAMERA_CLOSED;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f61975n = -1;

    /* JADX INFO: compiled from: CameraManager.java */
    public interface b {
        void a(Point point);
    }

    /* JADX INFO: compiled from: CameraManager.java */
    public enum c {
        CAMERA_CLOSED(1),
        CAMERA_OPENED(2),
        CAMERA_INITIALED(3),
        PREVIEW_STARTED(4),
        PREVIEW_STOPPED(5);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f61982a;

        c(int i10) {
            this.f61982a = i10;
        }

        public int a() {
            return this.f61982a;
        }
    }

    /* JADX INFO: compiled from: CameraManager.java */
    public interface d {
        void a();

        void b();

        void c();
    }

    /* JADX INFO: compiled from: CameraManager.java */
    public interface e {
        void a(byte[] bArr);
    }

    /* JADX INFO: compiled from: CameraManager.java */
    public static class f implements Camera.PreviewCallback {
        private f() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
        }
    }

    public j0(Context context, e0 e0Var) {
        if (context == null || e0Var == null) {
            throw new IllegalArgumentException("CameraManager constructor param invalid");
        }
        this.f61966e = new WeakReference<>(context);
        this.f61962a = e0Var;
        this.f61973l = e0Var.f();
        this.f61972k = new f0();
        this.f61968g = new h0();
        this.f61969h = new n0();
        this.f61970i = new l0();
    }

    private int a(int i10) {
        if (i10 != 0 && i10 != 1) {
            return 0;
        }
        try {
            int numberOfCameras = Camera.getNumberOfCameras();
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            for (int i11 = 0; i11 < numberOfCameras; i11++) {
                Camera.getCameraInfo(i11, cameraInfo);
                if (cameraInfo.facing == i10) {
                    Log.i("CameraManager", "findCameraId: " + i11);
                    return i11;
                }
            }
        } catch (RuntimeException unused) {
            Log.e("CameraManager", "getCameraInfo RuntimeException");
        } catch (Exception unused2) {
            Log.e("CameraManager", "getCameraInfo Exception");
        }
        return 0;
    }

    public synchronized void a() {
        i0 i0Var = this.f61967f;
        if (i0Var != null) {
            i0Var.e();
            this.f61967f = null;
        }
    }

    public synchronized void a(Rect rect, boolean z10) {
        if (this.f61971j == null) {
            return;
        }
        if (this.f61967f == null) {
            this.f61967f = new i0(this.f61971j);
        }
        this.f61967f.a(rect, this.f61972k.a().x, this.f61972k.a().y, z10, this.f61962a.b() == 1);
    }

    public synchronized void a(TextureView textureView) throws IOException {
        try {
            if (textureView == null) {
                throw new IllegalArgumentException("CameraManager::initCamera SurfaceHolder is null");
            }
            if (this.f61974m.a() != c.CAMERA_OPENED.a()) {
                Log.w("CameraManager", "CameraManager::initCamera camera is not opened yet");
                m();
            }
            this.f61968g.a(this.f61971j);
            this.f61969h.a(this.f61971j);
            this.f61970i.a(this.f61971j);
            Camera camera = this.f61971j;
            if (camera != null) {
                camera.setPreviewTexture(textureView.getSurfaceTexture());
            }
            this.f61972k.a(this.f61971j, this.f61962a);
            Camera camera2 = this.f61971j;
            if (camera2 != null) {
                camera2.setDisplayOrientation(this.f61962a.d());
            }
            b bVar = this.f61964c;
            if (bVar != null) {
                bVar.a(this.f61972k.a());
            }
            this.f61974m = c.CAMERA_INITIALED;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void a(d dVar) {
        try {
            if (dVar == null) {
                throw new IllegalArgumentException("CameraManager::setCameraStatusListener param invalid");
            }
            this.f61963b = dVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void a(e eVar) {
        try {
            if (eVar == null) {
                throw new IllegalArgumentException("CameraManager::setFrameCallback param invalid");
            }
            this.f61965d = new f6(eVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void a(String str) {
        try {
            if (this.f61971j != null && this.f61974m.a() != c.CAMERA_CLOSED.a()) {
                if (kotlinx.coroutines.s0.f130317e.equals(str) || "torch".equals(str)) {
                    Camera.Parameters parameters = this.f61971j.getParameters();
                    parameters.setFlashMode(str);
                    this.f61971j.setParameters(parameters);
                    this.f61973l = str;
                }
            }
        } catch (RuntimeException unused) {
            Log.w("CameraManager", "CameraManager::setTorchStatus error");
        }
    }

    public synchronized void a(List<k0.a> list) {
        if (this.f61971j != null && this.f61974m.a() != c.CAMERA_CLOSED.a()) {
            this.f61970i.a(list);
        }
    }

    public synchronized g0 b() {
        if (this.f61971j == null || this.f61974m.a() == c.CAMERA_CLOSED.a()) {
            return null;
        }
        try {
            return this.f61968g.a();
        } catch (Exception unused) {
            Log.e("CameraManager", "CameraManager::getCameraExposureData failed");
            return null;
        }
    }

    public synchronized void b(int i10) {
        if (this.f61962a != null && this.f61971j != null && this.f61974m.a() >= c.CAMERA_OPENED.a()) {
            this.f61962a.a(i10);
            try {
                try {
                    this.f61971j.setDisplayOrientation(i10);
                } catch (RuntimeException unused) {
                    Log.e("CameraManager", "setDisplayOrientation RuntimeException");
                }
            } catch (Exception unused2) {
                Log.e("CameraManager", "setDisplayOrientation Exception");
            }
        }
    }

    public synchronized k0 c() {
        if (this.f61971j != null && this.f61974m.a() != c.CAMERA_CLOSED.a()) {
            return this.f61970i.a();
        }
        return null;
    }

    public synchronized void c(int i10) {
        if (this.f61971j != null && this.f61974m.a() != c.CAMERA_CLOSED.a()) {
            this.f61968g.a(i10);
        }
    }

    public synchronized int d() {
        return this.f61962a.d();
    }

    public synchronized void d(int i10) {
        if (this.f61971j != null && this.f61974m.a() != c.CAMERA_CLOSED.a()) {
            this.f61969h.a(i10);
        }
    }

    public synchronized Point e() {
        return this.f61972k.a();
    }

    public synchronized c f() {
        return this.f61974m;
    }

    public synchronized m0 g() {
        if (this.f61971j != null && this.f61974m.a() != c.CAMERA_CLOSED.a()) {
            return this.f61969h.a();
        }
        return null;
    }

    public synchronized String h() {
        return this.f61973l;
    }

    public synchronized boolean i() {
        return this.f61971j != null && this.f61974m.a() >= c.CAMERA_OPENED.a();
    }

    public synchronized boolean j() {
        return this.f61969h.b();
    }

    public synchronized void k() {
        this.f61964c = null;
    }

    public synchronized void l() {
        try {
            if (this.f61974m.a() == c.PREVIEW_STARTED.a()) {
                a();
                q();
                this.f61974m = c.PREVIEW_STOPPED;
            }
            if (h().equals("torch")) {
                a(kotlinx.coroutines.s0.f130317e);
            }
            if (this.f61974m.a() >= c.CAMERA_OPENED.a()) {
                this.f61974m = c.CAMERA_CLOSED;
                Camera camera = this.f61971j;
                if (camera != null) {
                    camera.setPreviewCallback(null);
                    this.f61971j.stopPreview();
                    this.f61971j.release();
                    this.f61971j = null;
                }
                d dVar = this.f61963b;
                if (dVar != null) {
                    dVar.c();
                }
            }
        } catch (RuntimeException unused) {
            Log.e("CameraManager", "CameraManager::onPause failed");
        }
    }

    public synchronized void m() {
        c cVar = this.f61974m;
        if (cVar == c.CAMERA_CLOSED || cVar == c.PREVIEW_STOPPED) {
            int iA = a(this.f61962a.b());
            Log.i("CameraManager", "onResume: " + iA);
            try {
                this.f61971j = Camera.open(iA);
            } catch (RuntimeException e10) {
                Log.e("CameraManager", "CameraManager::Camera open failed, " + e10.getMessage());
            }
            if (this.f61971j == null) {
                Log.e("CameraManager", "CameraManager::initCamera failed");
                d dVar = this.f61963b;
                if (dVar != null) {
                    dVar.b();
                }
            } else {
                d dVar2 = this.f61963b;
                if (dVar2 != null) {
                    dVar2.a();
                }
                this.f61974m = c.CAMERA_OPENED;
            }
        }
    }

    public synchronized void n() {
        Camera camera;
        if (this.f61974m.a() < c.CAMERA_OPENED.a()) {
            return;
        }
        if (this.f61962a.c() != 0 && (camera = this.f61971j) != null) {
            camera.setPreviewCallback(new f());
        }
    }

    public synchronized void o() {
        if (this.f61962a.c() == 1) {
            Log.d("CameraManager", "CameraManager::requestPreviewFrame PREVIEW_ONE_SHOT");
            if (this.f61974m == c.PREVIEW_STOPPED) {
                return;
            }
            Camera camera = this.f61971j;
            if (camera != null) {
                camera.setOneShotPreviewCallback(this.f61965d);
            }
        } else if (this.f61962a.c() == 0) {
            Log.d("CameraManager", "CameraManager::requestPreviewFrame PICTURE_MODE");
            if (this.f61974m == c.PREVIEW_STOPPED) {
                p();
            }
        } else if (this.f61962a.c() == 2) {
            Log.d("CameraManager", "CameraManager::requestPreviewFrame PREVIEW_MULTI_SHOT");
            if (this.f61974m == c.PREVIEW_STOPPED) {
                return;
            }
            Camera camera2 = this.f61971j;
            if (camera2 != null) {
                camera2.setPreviewCallback(this.f61965d);
            }
        } else {
            Log.w("CameraManager", "CameraManager::requestPreviewFrame unknown mode");
        }
    }

    public synchronized void p() {
        try {
            if (this.f61974m.a() < c.CAMERA_INITIALED.a()) {
                Log.w("CameraManager", "CameraManager::startPreview camera is not initialed yet");
                return;
            }
            Camera camera = this.f61971j;
            if (camera != null) {
                camera.startPreview();
                this.f61974m = c.PREVIEW_STARTED;
            }
        } catch (RuntimeException unused) {
            Log.w("CameraManager", "stopPreview error");
        }
    }

    public synchronized void q() {
        try {
            if (this.f61974m.a() < c.PREVIEW_STARTED.a()) {
                Log.w("CameraManager", "CameraManager::startPreview camera is not startPreview yet");
                return;
            }
            Camera camera = this.f61971j;
            if (camera != null) {
                camera.setPreviewCallback(null);
                this.f61971j.stopPreview();
                this.f61974m = c.PREVIEW_STOPPED;
            }
        } catch (RuntimeException unused) {
            Log.w("CameraManager", "stopPreview error");
        }
    }
}
