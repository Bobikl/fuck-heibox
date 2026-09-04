package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import androidx.annotation.i1;
import androidx.annotation.j1;
import androidx.annotation.p0;
import com.google.android.exoplayer2.util.u0;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes7.dex */
public final class SphericalGLSurfaceView extends GLSurfaceView {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f51839n = 90;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float f51840o = 0.1f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final float f51841p = 100.0f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final float f51842q = 25.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final float f51843r = 3.1415927f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<b> f51844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SensorManager f51845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private final Sensor f51846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f51847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Handler f51848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final m f51849g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i f51850h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private SurfaceTexture f51851i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private Surface f51852j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f51853k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f51854l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f51855m;

    @j1
    public final class a implements GLSurfaceView.Renderer, m.a, d.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final i f51856b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float[] f51859e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float[] f51860f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float[] f51861g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f51862h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f51863i;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float[] f51857c = new float[16];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float[] f51858d = new float[16];

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final float[] f51864j = new float[16];

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final float[] f51865k = new float[16];

        public a(i iVar) {
            float[] fArr = new float[16];
            this.f51859e = fArr;
            float[] fArr2 = new float[16];
            this.f51860f = fArr2;
            float[] fArr3 = new float[16];
            this.f51861g = fArr3;
            this.f51856b = iVar;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f51863i = SphericalGLSurfaceView.f51843r;
        }

        private float c(float f10) {
            if (f10 > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f10))) * 2.0d);
            }
            return 90.0f;
        }

        @androidx.annotation.d
        private void d() {
            Matrix.setRotateM(this.f51860f, 0, -this.f51862h, (float) Math.cos(this.f51863i), (float) Math.sin(this.f51863i), 0.0f);
        }

        @Override // com.google.android.exoplayer2.video.spherical.d.a
        @androidx.annotation.g
        public synchronized void a(float[] fArr, float f10) {
            float[] fArr2 = this.f51859e;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f51863i = -f10;
            d();
        }

        @Override // com.google.android.exoplayer2.video.spherical.m.a
        @i1
        public synchronized void b(PointF pointF) {
            this.f51862h = pointF.y;
            d();
            Matrix.setRotateM(this.f51861g, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f51865k, 0, this.f51859e, 0, this.f51861g, 0);
                Matrix.multiplyMM(this.f51864j, 0, this.f51860f, 0, this.f51865k, 0);
            }
            Matrix.multiplyMM(this.f51858d, 0, this.f51857c, 0, this.f51864j, 0);
            this.f51856b.c(this.f51858d, false);
        }

        @Override // com.google.android.exoplayer2.video.spherical.m.a
        @i1
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return SphericalGLSurfaceView.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
            float f10 = i10 / i11;
            Matrix.perspectiveM(this.f51857c, 0, c(f10), f10, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            SphericalGLSurfaceView.this.g(this.f51856b.d());
        }
    }

    public interface b {
        void L(Surface surface);

        void N(Surface surface);
    }

    public SphericalGLSurfaceView(Context context) {
        this(context, null);
    }

    public SphericalGLSurfaceView(Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51844b = new CopyOnWriteArrayList<>();
        this.f51848f = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) com.google.android.exoplayer2.util.a.g(context.getSystemService(ak.f104420ac));
        this.f51845c = sensorManager;
        Sensor defaultSensor = u0.f51536a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f51846d = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f51850h = iVar;
        a aVar = new a(iVar);
        m mVar = new m(context, aVar, f51842q);
        this.f51849g = mVar;
        this.f51847e = new d(((WindowManager) com.google.android.exoplayer2.util.a.g((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), mVar, aVar);
        this.f51853k = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        Surface surface = this.f51852j;
        if (surface != null) {
            Iterator<b> it = this.f51844b.iterator();
            while (it.hasNext()) {
                it.next().L(surface);
            }
        }
        h(this.f51851i, surface);
        this.f51851i = null;
        this.f51852j = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f51851i;
        Surface surface = this.f51852j;
        Surface surface2 = new Surface(surfaceTexture);
        this.f51851i = surfaceTexture;
        this.f51852j = surface2;
        Iterator<b> it = this.f51844b.iterator();
        while (it.hasNext()) {
            it.next().N(surface2);
        }
        h(surfaceTexture2, surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(final SurfaceTexture surfaceTexture) {
        this.f51848f.post(new Runnable() { // from class: com.google.android.exoplayer2.video.spherical.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f51943b.f(surfaceTexture);
            }
        });
    }

    private static void h(@p0 SurfaceTexture surfaceTexture, @p0 Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    private void j() {
        boolean z10 = this.f51853k && this.f51854l;
        Sensor sensor = this.f51846d;
        if (sensor == null || z10 == this.f51855m) {
            return;
        }
        if (z10) {
            this.f51845c.registerListener(this.f51847e, sensor, 0);
        } else {
            this.f51845c.unregisterListener(this.f51847e);
        }
        this.f51855m = z10;
    }

    public void d(b bVar) {
        this.f51844b.add(bVar);
    }

    public com.google.android.exoplayer2.video.spherical.a getCameraMotionListener() {
        return this.f51850h;
    }

    public com.google.android.exoplayer2.video.j getVideoFrameMetadataListener() {
        return this.f51850h;
    }

    @p0
    public Surface getVideoSurface() {
        return this.f51852j;
    }

    public void i(b bVar) {
        this.f51844b.remove(bVar);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f51848f.post(new Runnable() { // from class: com.google.android.exoplayer2.video.spherical.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f51945b.e();
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f51854l = false;
        j();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f51854l = true;
        j();
    }

    public void setDefaultStereoMode(int i10) {
        this.f51850h.h(i10);
    }

    public void setUseSensorRotation(boolean z10) {
        this.f51853k = z10;
        j();
    }
}
