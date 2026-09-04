package com.alipay.face.camera;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import com.alipay.face.config.DeviceSetting;
import com.alipay.zoloz.toyger.ToygerLog;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.s0;

/* JADX INFO: compiled from: AndroidImpl.java */
/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"InlinedApi"})
public class a implements f {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static a f38633t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f38634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Camera f38635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Camera.Parameters f38636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e f38637e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f38639g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f38641i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f38638f = 90;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f38640h = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private DeviceSetting f38642j = new DeviceSetting();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f38643k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f38644l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f38645m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f38646n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f38647o = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f38651s = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f38648p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f38649q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f38650r = false;

    /* JADX INFO: renamed from: com.alipay.face.camera.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AndroidImpl.java */
    public class C0296a implements Camera.PreviewCallback {
        C0296a() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            if (bArr == null || a.this.f38637e == null) {
                return;
            }
            a.this.f38637e.d(new c(ByteBuffer.wrap(bArr), a.this.f38644l, a.this.f38645m, 0, null, 0, 0, a.this.f38646n, a.this.f38647o));
        }
    }

    /* JADX INFO: compiled from: AndroidImpl.java */
    public class b implements Camera.PictureCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f38653a;

        b(g gVar) {
            this.f38653a = gVar;
        }

        @Override // android.hardware.Camera.PictureCallback
        public void onPictureTaken(byte[] bArr, Camera camera) {
            try {
                if (bArr == null) {
                    throw new Exception("taken photo exception, image data null");
                }
                a aVar = a.this;
                int i10 = aVar.f38638f = aVar.Z(aVar.f38642j);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                if (bitmapDecodeByteArray != null) {
                    Matrix matrix = new Matrix();
                    matrix.setRotate(i10);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
                    g gVar = this.f38653a;
                    if (gVar != null) {
                        gVar.a(bitmapCreateBitmap);
                    }
                }
                a.this.f38635c.startPreview();
            } catch (Exception e10) {
                e10.printStackTrace();
                g gVar2 = this.f38653a;
                if (gVar2 != null) {
                    gVar2.a(null);
                }
            }
        }
    }

    private a() {
    }

    private void X() {
        Camera.Size sizeJ;
        int iMin;
        Camera.Size sizeI;
        if (this.f38636d != null) {
            DeviceSetting deviceSetting = this.f38642j;
            if (deviceSetting == null || deviceSetting.isWidthAuto()) {
                sizeJ = this.f38651s ? com.alipay.face.camera.utils.a.g().j(this.f38636d.getSupportedPreviewSizes(), com.alipay.face.camera.b.f38656b, 0) : com.alipay.face.camera.utils.a.g().i(this.f38636d.getSupportedPreviewSizes(), com.alipay.face.camera.utils.c.c(this.f38634b), com.alipay.face.camera.b.f38656b);
            } else {
                sizeJ = com.alipay.face.camera.utils.a.g().j(this.f38636d.getSupportedPreviewSizes(), this.f38642j.getWidth(), 0);
            }
            if (sizeJ != null) {
                int i10 = sizeJ.width;
                this.f38646n = i10;
                int i11 = sizeJ.height;
                this.f38647o = i11;
                this.f38644l = i10;
                this.f38645m = i11;
                this.f38636d.setPreviewSize(i10, i11);
                if (!this.f38651s && (sizeI = com.alipay.face.camera.utils.a.g().i(this.f38636d.getSupportedPictureSizes(), com.alipay.face.camera.utils.c.c(this.f38634b), com.alipay.face.camera.b.f38656b)) != null) {
                    this.f38636d.setPictureSize(sizeI.width, sizeI.height);
                }
            }
            DeviceSetting deviceSetting2 = this.f38642j;
            if (deviceSetting2 != null) {
                int iZ = Z(deviceSetting2);
                this.f38638f = iZ;
                this.f38635c.setDisplayOrientation(iZ);
            }
            if (this.f38642j != null && this.f38636d.isZoomSupported() && (iMin = Math.min(Math.max(this.f38642j.getZoom(), 0), this.f38636d.getMaxZoom())) != this.f38636d.getZoom()) {
                this.f38636d.setZoom(iMin);
            }
            List<String> supportedFocusModes = this.f38636d.getSupportedFocusModes();
            if (supportedFocusModes != null) {
                if (supportedFocusModes.contains("continuous-video")) {
                    this.f38636d.setFocusMode("continuous-video");
                } else if (supportedFocusModes.contains("auto")) {
                    this.f38636d.setFocusMode("auto");
                }
            }
        }
    }

    private int Y(int i10) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i10, cameraInfo);
        int rotation = ((WindowManager) this.f38634b.getSystemService("window")).getDefaultDisplay().getRotation();
        int i11 = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i11 = 90;
            } else if (rotation == 2) {
                i11 = 180;
            } else if (rotation == 3) {
                i11 = 270;
            }
        }
        return cameraInfo.facing == 1 ? (360 - ((cameraInfo.orientation + i11) % 360)) % 360 : ((cameraInfo.orientation - i11) + 360) % 360;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int Z(DeviceSetting deviceSetting) {
        if (deviceSetting != null) {
            return deviceSetting.isDisplayAuto() ? Y(this.f38639g) : deviceSetting.getDisplayAngle();
        }
        throw new IllegalArgumentException("deviceSetting can't be null");
    }

    public static synchronized a a0() {
        if (f38633t == null) {
            f38633t = new a();
        }
        return f38633t;
    }

    private void b0(Context context) {
        this.f38634b = context;
    }

    private boolean c0(int i10) {
        try {
            Camera cameraOpen = Camera.open(i10);
            this.f38635c = cameraOpen;
            if (cameraOpen == null) {
                e eVar = this.f38637e;
                if (eVar != null) {
                    eVar.onError(101);
                }
                return false;
            }
            this.f38639g = i10;
            this.f38636d = cameraOpen.getParameters();
            X();
            this.f38635c.setParameters(this.f38636d);
            ToygerLog.e("打开摄像头....");
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            e eVar2 = this.f38637e;
            if (eVar2 != null) {
                eVar2.onError(101);
            }
            return false;
        } catch (Throwable unused) {
            e eVar3 = this.f38637e;
            if (eVar3 != null) {
                eVar3.onError(101);
            }
            return false;
        }
    }

    @Override // com.alipay.face.camera.f
    public void A() {
        synchronized (this.f38643k) {
            Camera camera = this.f38635c;
            if (camera != null) {
                try {
                    Camera.Parameters parameters = camera.getParameters();
                    parameters.setAutoExposureLock(true);
                    parameters.setAutoWhiteBalanceLock(true);
                    ToygerLog.e("锁定白平衡...");
                    this.f38635c.setParameters(parameters);
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.alipay.face.camera.f
    public int B() {
        return this.f38646n;
    }

    @Override // com.alipay.face.camera.f
    public void C() {
        synchronized (this.f38643k) {
            ToygerLog.e("关闭预览....");
            if (this.f38650r) {
                if (this.f38635c != null) {
                    synchronized (this.f38643k) {
                        try {
                            this.f38635c.setOneShotPreviewCallback(null);
                            this.f38635c.setPreviewCallback(null);
                            this.f38635c.stopPreview();
                        } catch (Exception unused) {
                        }
                    }
                    this.f38650r = false;
                }
            }
        }
    }

    @Override // com.alipay.face.camera.f
    public int D() {
        return 0;
    }

    @Override // com.alipay.face.camera.f
    public void E() {
        synchronized (this.f38643k) {
            if (this.f38649q) {
                return;
            }
            if (c0(this.f38640h ? 1 : 0)) {
                this.f38649q = true;
            }
        }
    }

    @Override // com.alipay.face.camera.f
    public int F() {
        return this.f38638f;
    }

    @Override // com.alipay.face.camera.f
    public void G(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
    }

    @Override // com.alipay.face.camera.f
    public void H(Map<String, Object> map) {
    }

    @Override // com.alipay.face.camera.f
    public void I(Context context, boolean z10, boolean z11, DeviceSetting deviceSetting) {
        this.f38640h = z10;
        this.f38651s = z11;
        if (deviceSetting != null) {
            this.f38642j = deviceSetting;
        }
        if (!z10) {
            this.f38638f = 270;
        }
        b0(context);
    }

    @Override // com.alipay.face.camera.f
    public Object J() {
        return null;
    }

    @Override // com.alipay.face.camera.f
    public void K() {
        Camera.Parameters parameters = this.f38635c.getParameters();
        if (parameters == null) {
            return;
        }
        parameters.setFlashMode("torch");
        this.f38635c.setParameters(parameters);
    }

    @Override // com.alipay.face.camera.f
    public void L() {
        synchronized (this.f38643k) {
            Camera camera = this.f38635c;
            if (camera != null) {
                try {
                    Camera.Parameters parameters = camera.getParameters();
                    parameters.setAutoExposureLock(false);
                    parameters.setAutoWhiteBalanceLock(false);
                    ToygerLog.e("解锁白平衡...");
                    this.f38635c.setParameters(parameters);
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.alipay.face.camera.f
    public void M() {
        C();
        synchronized (this.f38643k) {
            if (this.f38649q) {
                this.f38637e = null;
                Camera camera = this.f38635c;
                if (camera != null) {
                    try {
                        camera.release();
                        this.f38635c = null;
                        this.f38649q = false;
                        ToygerLog.e("关闭摄像头....");
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            }
        }
    }

    @Override // com.alipay.face.camera.f
    public int N() {
        return 0;
    }

    @Override // com.alipay.face.camera.f
    public boolean a(Bitmap bitmap) {
        return true;
    }

    @Override // com.alipay.face.camera.f
    public Camera b() {
        return this.f38635c;
    }

    @Override // com.alipay.face.camera.f
    public Rect c() {
        return null;
    }

    @Override // com.alipay.face.camera.f
    public void d(SurfaceHolder surfaceHolder, float f10, int i10, int i11) {
        synchronized (this.f38643k) {
            if (this.f38650r) {
                return;
            }
            Camera camera = this.f38635c;
            if (camera != null) {
                if (surfaceHolder != null) {
                    try {
                        camera.setPreviewDisplay(surfaceHolder);
                    } catch (Exception unused) {
                        e eVar = this.f38637e;
                        if (eVar != null) {
                            eVar.onError(101);
                        }
                        return;
                    }
                }
                this.f38635c.setPreviewCallback(new C0296a());
                this.f38635c.startPreview();
                ToygerLog.e("开始预览....");
                this.f38650r = true;
            }
        }
    }

    @Override // com.alipay.face.camera.f
    public void e() {
        if (this.f38648p) {
            this.f38648p = false;
        }
    }

    @Override // com.alipay.face.camera.f
    public void f() {
    }

    @Override // com.alipay.face.camera.f
    public void g(g gVar) {
        this.f38635c.takePicture(null, null, new b(gVar));
    }

    @Override // com.alipay.face.camera.f
    public void h() {
    }

    @Override // com.alipay.face.camera.f
    public void i() {
        Camera.Parameters parameters = this.f38635c.getParameters();
        if (parameters == null) {
            return;
        }
        parameters.setFlashMode(s0.f130317e);
        this.f38635c.setParameters(parameters);
    }

    @Override // com.alipay.face.camera.f
    public String j() {
        return null;
    }

    @Override // com.alipay.face.camera.f
    public int k() {
        return this.f38644l;
    }

    @Override // com.alipay.face.camera.f
    public d l() {
        return null;
    }

    @Override // com.alipay.face.camera.f
    public boolean m(boolean z10) {
        return false;
    }

    @Override // com.alipay.face.camera.f
    public void n(h hVar) {
    }

    @Override // com.alipay.face.camera.f
    public int o() {
        return this.f38645m;
    }

    @Override // com.alipay.face.camera.f
    public void p(e eVar) {
        this.f38637e = eVar;
    }

    @Override // com.alipay.face.camera.f
    public int q() {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.f38639g, cameraInfo);
        return cameraInfo.orientation;
    }

    @Override // com.alipay.face.camera.f
    public PointF r(PointF pointF) {
        return null;
    }

    @Override // com.alipay.face.camera.f
    public int s() {
        return 0;
    }

    @Override // com.alipay.face.camera.f
    public void t() {
        this.f38634b = null;
    }

    @Override // com.alipay.face.camera.f
    public boolean u() {
        return false;
    }

    @Override // com.alipay.face.camera.f
    public void v(DeviceSetting deviceSetting) {
        if (this.f38648p) {
            return;
        }
        if (deviceSetting != null) {
            this.f38642j = deviceSetting;
        }
        this.f38648p = true;
    }

    @Override // com.alipay.face.camera.f
    public String w() {
        return null;
    }

    @Override // com.alipay.face.camera.f
    public int x() {
        return this.f38647o;
    }

    @Override // com.alipay.face.camera.f
    public int y() {
        return Z(this.f38642j);
    }

    @Override // com.alipay.face.camera.f
    public PointF z(PointF pointF) {
        return null;
    }
}
