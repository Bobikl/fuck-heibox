package com.huawei.hms.scankit;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import android.view.MotionEvent;
import android.view.TextureView;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.hmsscankit.api.IOnErrorCallback;
import com.huawei.hms.hmsscankit.api.IOnResultCallback;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.p.e0;
import com.huawei.hms.scankit.p.e5;
import com.huawei.hms.scankit.p.f5;
import com.huawei.hms.scankit.p.j0;
import com.huawei.hms.scankit.p.k0;
import com.huawei.hms.scankit.p.l1;
import com.huawei.hms.scankit.p.m0;
import com.huawei.hms.scankit.p.o4;
import com.huawei.hms.scankit.p.v3;
import com.huawei.hms.scankit.p.w3;
import com.huawei.hms.scankit.p.w7;
import com.max.hbcommon.bean.segmentfilter.FilterGroup;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: CaptureHelper.java */
/* JADX INFO: loaded from: classes7.dex */
public class b {
    public static final String H = "b";
    public static volatile v3 I;
    public static volatile w3 J;
    private IOnErrorCallback D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f61374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f61375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f61376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f61377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.huawei.hms.scankit.a f61378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f5 f61379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private j0 f61380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ViewfinderView f61381h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextureView f61382i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TextureView.SurfaceTextureListener f61383j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Collection<BarcodeFormat> f61384k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<l1, ?> f61385l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f61386m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f61388o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f61390q;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f61394u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f61395v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f61396w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private IObjectWrapper f61397x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private e5 f61398y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private IOnResultCallback f61399z;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f61389p = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f61391r = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f61392s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f61393t = true;
    private boolean A = false;
    private boolean B = false;
    private boolean E = true;
    private boolean F = false;
    private boolean G = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f61387n = false;
    private boolean C = false;

    /* JADX INFO: compiled from: CaptureHelper.java */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f61380g.m();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.scankit.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CaptureHelper.java */
    public class C0511b implements j0.d {
        C0511b() {
        }

        @Override // com.huawei.hms.scankit.p.j0.d
        public void a() {
        }

        @Override // com.huawei.hms.scankit.p.j0.d
        public void b() {
            if (b.this.D != null) {
                try {
                    b.this.D.onError(-1000);
                } catch (RemoteException unused) {
                    o4.b(b.H, "RemoteException");
                }
            }
        }

        @Override // com.huawei.hms.scankit.p.j0.d
        public void c() {
        }
    }

    /* JADX INFO: compiled from: CaptureHelper.java */
    public class c implements TextureView.SurfaceTextureListener {
        c() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            b.this.B = false;
            if (surfaceTexture == null) {
                o4.b(b.H, "*** WARNING *** surfaceCreated() gave us a null surface!");
            }
            if (b.this.f61387n) {
                return;
            }
            b.this.f61387n = true;
            if (b.this.f61377d.checkPermission("android.permission.CAMERA", Process.myPid(), Process.myUid()) == 0) {
                b bVar = b.this;
                bVar.a(bVar.f61382i);
            } else {
                if (b.this.G || !(b.this.f61377d instanceof Activity)) {
                    return;
                }
                b.this.B = true;
                ((Activity) b.this.f61377d).requestPermissions(new String[]{"android.permission.CAMERA"}, 1);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            b.this.f61387n = false;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* JADX INFO: compiled from: CaptureHelper.java */
    public class d implements f5 {
        d() {
        }

        @Override // com.huawei.hms.scankit.p.f5
        public void a(HmsScan[] hmsScanArr, Bitmap bitmap, float f10) {
            b.this.a(hmsScanArr, bitmap);
        }
    }

    public b(Context context, TextureView textureView, ViewfinderView viewfinderView, Rect rect, int i10, IObjectWrapper iObjectWrapper, boolean z10, String str, boolean z11) {
        this.f61377d = context;
        this.f61381h = viewfinderView;
        this.f61397x = iObjectWrapper;
        this.f61382i = textureView;
        this.f61374a = rect;
        this.f61375b = i10;
        this.f61376c = z10;
        this.f61388o = str;
        this.f61395v = z11;
    }

    private float a(MotionEvent motionEvent) {
        float x10 = motionEvent.getX(0) - motionEvent.getX(1);
        float y10 = motionEvent.getY(0) - motionEvent.getY(1);
        double dSqrt = Math.sqrt((x10 * x10) + (y10 * y10));
        if (Double.isInfinite(dSqrt) || Double.isNaN(dSqrt)) {
            return 0.0f;
        }
        return BigDecimal.valueOf(dSqrt).floatValue();
    }

    private e0 a(Context context) {
        e0 e0VarA;
        Activity activity = (Activity) context;
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        Log.i(H, "initCameraConfig:false" + androidx.constraintlayout.motion.widget.f.f18721i + rotation);
        if (rotation == 0) {
            e0VarA = new e0.b().a(new Point(1920, 1080)).a(1).b(90).b(false).a(true).a();
        } else if (rotation == 1) {
            e0VarA = new e0.b().a(new Point(1920, 1080)).a(1).b(0).b(false).a(true).a();
        } else if (rotation != 2) {
            e0VarA = rotation != 3 ? new e0.b().a(new Point(1920, 1080)).a(1).b(90).b(false).a(true).a() : new e0.b().a(new Point(1920, 1080)).a(1).b(180).b(false).a(true).a();
        } else {
            e0VarA = new e0.b().a(new Point(1920, 1080)).a(1).b(270).b(false).a(true).a();
        }
        if (w7.f(context) || w7.b(activity) || w7.e(context)) {
            e0VarA.a(new Point(1080, 1080));
            this.F = true;
        }
        if ("ceres-c3".equals(Build.DEVICE)) {
            e0VarA = new e0.b().a(new Point(1080, 1920)).a(1).b(false).a(true).a();
        }
        boolean zB = w7.b();
        boolean zE = w7.e();
        if ((!w7.e(context) || zB) && (!w7.b(activity) || zE)) {
            return e0VarA;
        }
        e0 e0VarA2 = new e0.b().a(new Point(1080, 1080)).a(1).b(90).b(false).a(true).a();
        this.F = true;
        return e0VarA2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TextureView textureView) {
        if (textureView == null || textureView.getSurfaceTexture() == null) {
            o4.e(H, "initCamera() no surface view");
            return;
        }
        try {
            this.f61380g.a(textureView);
            this.f61380g.a(Collections.singletonList(new k0.a(new Rect(-150, -150, 150, 150), 1000)));
            try {
                this.f61380g.n();
            } catch (Exception unused) {
                o4.b(H, "initCamera() get exception");
            }
            if (this.f61378e == null) {
                com.huawei.hms.scankit.a aVar = new com.huawei.hms.scankit.a(this.f61377d, this.f61381h, this.f61379f, this.f61384k, this.f61385l, this.f61386m, this.f61380g, this.f61374a, this.f61375b, this.f61395v, this.E);
                this.f61378e = aVar;
                aVar.c(this.f61394u);
                this.f61378e.a(this.f61396w);
                this.f61378e.b(this.f61391r);
                this.f61378e.a(this.f61398y);
            }
        } catch (Exception e10) {
            if (I != null) {
                I.c(-1002);
            }
            o4.a(H, "initCamera IOException", e10);
        }
    }

    private void a(boolean z10, j0 j0Var) {
        try {
            m0 m0VarG = j0Var.g();
            if (!j0Var.j()) {
                o4.d(H, "zoom not supported");
                return;
            }
            int iC = m0VarG.c();
            int iB = m0VarG.b();
            if (z10 && iB < iC) {
                iB++;
            } else if (iB > 0) {
                iB--;
            } else {
                o4.d(H, "handleZoom  zoom not change");
            }
            j0Var.d(iB);
        } catch (RuntimeException unused) {
            Log.e(H, "handleZoom: RuntimeException");
        }
    }

    private void j() {
        com.huawei.hms.scankit.a aVar = this.f61378e;
        if (aVar != null) {
            aVar.e();
            this.f61378e = null;
        }
        this.f61380g.l();
    }

    public b a(e5 e5Var) {
        this.f61398y = e5Var;
        return this;
    }

    public b a(boolean z10) {
        this.f61396w = z10;
        com.huawei.hms.scankit.a aVar = this.f61378e;
        if (aVar != null) {
            aVar.a(z10);
        }
        return this;
    }

    public j0 a() {
        return this.f61380g;
    }

    public void a(IOnErrorCallback iOnErrorCallback) {
        this.D = iOnErrorCallback;
    }

    public void a(IOnResultCallback iOnResultCallback) {
        this.f61399z = iOnResultCallback;
    }

    public void a(HmsScan[] hmsScanArr, Bitmap bitmap) {
        o4.a("scan-time", "decode time:" + System.currentTimeMillis());
        try {
            String str = H;
            o4.d(str, "result onResult");
            if (this.f61398y.a()) {
                o4.d(str, "result intercepted");
                return;
            }
            if (I != null) {
                I.a(hmsScanArr);
            }
            if (!this.f61376c) {
                hmsScanArr = w7.a(hmsScanArr);
            }
            if (this.f61398y != null) {
                if (this.f61381h != null && hmsScanArr.length > 0 && hmsScanArr[0] != null) {
                    o4.d(str, "result draw result point");
                    if (this.f61377d instanceof Activity) {
                        this.f61381h.a(hmsScanArr[0].getBorderRect(), w7.c((Activity) this.f61377d), this.f61380g.e());
                    }
                    this.C = false;
                }
                this.f61398y.a(hmsScanArr);
            }
            if (this.f61399z != null) {
                try {
                    o4.d(str, "result callback end: pauseStatus" + this.C);
                    if (this.C) {
                        return;
                    }
                    if (this.f61396w && hmsScanArr != null && hmsScanArr.length > 0 && hmsScanArr[0] != null) {
                        Context context = this.f61377d;
                        if (context instanceof Activity) {
                            hmsScanArr[0].originalBitmap = w7.a(bitmap, ((Activity) context).getWindowManager().getDefaultDisplay().getRotation());
                        }
                    }
                    this.f61399z.onResult(hmsScanArr);
                } catch (RemoteException e10) {
                    if (I != null) {
                        I.c(-1003);
                    }
                    o4.e("CaptureHelper", "onResult  RemoteException  e:" + e10);
                }
            }
        } catch (RuntimeException e11) {
            Log.e(H, "onResult:RuntimeException " + e11);
        } catch (Exception e12) {
            Log.e(H, "onResult:Exception: " + e12);
        }
    }

    public void b(boolean z10) {
        this.E = z10;
    }

    public boolean b() {
        return this.F;
    }

    public boolean b(MotionEvent motionEvent) {
        j0 j0Var = this.f61380g;
        if (j0Var == null || !this.f61389p || j0Var.f().a() < j0.c.CAMERA_OPENED.a() || motionEvent.getPointerCount() <= 1) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 2) {
            float fA = a(motionEvent);
            float f10 = this.f61390q;
            if (fA > f10 + 6.0f) {
                a(true, this.f61380g);
            } else if (fA < f10 - 6.0f) {
                a(false, this.f61380g);
            } else {
                o4.d("CaptureHelper", "MotionEvent.ACTION_MOVE no handleZoom");
            }
            this.f61390q = fA;
        } else if (action == 5) {
            this.f61390q = a(motionEvent);
        }
        return true;
    }

    public void c() {
        this.C = false;
        try {
            J = new w3((Bundle) ObjectWrapper.unwrap(this.f61397x), this.f61388o);
            J.a(FilterGroup.TYPE_SINGLE);
        } catch (RuntimeException unused) {
            o4.b(H, "RuntimeException");
        } catch (Exception unused2) {
            o4.b(H, "Exception");
        }
        if (this.f61377d.getPackageManager() != null && !this.f61377d.getPackageManager().hasSystemFeature("android.hardware.camera")) {
            Log.e("scankit", "has no camera");
            return;
        }
        e0 e0VarA = a(this.f61377d);
        Log.i(H, "onCreate: CameraManageOncreate");
        this.f61380g = new j0(this.f61377d, e0VarA);
        new Thread(new a()).start();
        this.f61380g.a(new C0511b());
        this.f61383j = new c();
        this.f61379f = new d();
    }

    public void c(boolean z10) {
        this.G = z10;
    }

    public void d() {
        this.C = true;
        this.f61382i.setSurfaceTextureListener(null);
        this.f61380g.k();
        J.f62482l.b();
        J = null;
    }

    public void e() {
        this.C = true;
        if (this.A) {
            return;
        }
        j();
    }

    public void f() {
        TextureView textureView;
        TextureView textureView2;
        this.C = false;
        try {
            I = new v3((Bundle) ObjectWrapper.unwrap(this.f61397x), this.f61388o);
            I.h();
        } catch (RuntimeException unused) {
            o4.b(H, "RuntimeException");
        } catch (Exception unused2) {
            o4.b(H, "Exception");
        }
        if (!this.A && !this.f61387n && (textureView2 = this.f61382i) != null) {
            textureView2.setSurfaceTextureListener(this.f61383j);
            if (this.f61387n) {
                a(this.f61382i);
            } else {
                this.f61382i.setSurfaceTextureListener(this.f61383j);
            }
        }
        if (this.B && this.f61377d.checkPermission("android.permission.CAMERA", Process.myPid(), Process.myUid()) == 0 && (textureView = this.f61382i) != null) {
            this.B = false;
            a(textureView);
        }
    }

    public void g() {
        this.C = false;
        TextureView textureView = this.f61382i;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(this.f61383j);
            this.A = true;
            if (this.f61387n) {
                a(this.f61382i);
            } else {
                this.f61382i.setSurfaceTextureListener(this.f61383j);
            }
        }
    }

    public void h() {
        this.C = true;
        if (I != null) {
            I.i();
        }
        I = null;
        if (this.A) {
            j();
        }
    }

    public void i() {
        try {
            j0 j0Var = this.f61380g;
            if (j0Var != null) {
                j0Var.d(1);
            }
        } catch (RuntimeException unused) {
            o4.b(H, "RuntimeException in reset zoomValue");
        } catch (Exception unused2) {
            o4.b(H, "Exception in reset zoomValue");
        }
    }
}
