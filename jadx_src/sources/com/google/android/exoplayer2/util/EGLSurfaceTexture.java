package com.google.android.exoplayer2.util;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes7.dex */
@androidx.annotation.w0(17)
public final class EGLSurfaceTexture implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f51325i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f51326j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f51327k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f51328l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f51329m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f51330n = {bb.c.m.sm, 4, bb.c.m.Ql, 8, bb.c.m.Pl, 8, bb.c.m.Ol, 8, bb.c.m.Nl, 8, bb.c.m.Rl, 0, bb.c.m.Tl, bb.c.m.km, bb.c.m.fm, 4, bb.c.m.km};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f51331o = 12992;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f51332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f51333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private final c f51334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private EGLDisplay f51335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private EGLContext f51336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private EGLSurface f51337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private SurfaceTexture f51338h;

    public static final class GlException extends RuntimeException {
        private GlException(String str) {
            super(str);
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public interface c {
        void a();
    }

    public EGLSurfaceTexture(Handler handler) {
        this(handler, null);
    }

    public EGLSurfaceTexture(Handler handler, @androidx.annotation.p0 c cVar) {
        this.f51332b = handler;
        this.f51334d = cVar;
        this.f51333c = new int[1];
    }

    private static EGLConfig a(EGLDisplay eGLDisplay) {
        EGLConfig eGLConfig;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f51330n, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (!zEglChooseConfig || iArr[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
            throw new GlException(u0.H("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        }
        return eGLConfig;
    }

    private static EGLContext b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{bb.c.m.co, 2, bb.c.m.km} : new int[]{bb.c.m.co, 2, 12992, 1, bb.c.m.km}, 0);
        if (eGLContextEglCreateContext != null) {
            return eGLContextEglCreateContext;
        }
        throw new GlException("eglCreateContext failed");
    }

    private static EGLSurface c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i10 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{bb.c.m.Pm, 1, bb.c.m.Om, 1, 12992, 1, bb.c.m.km} : new int[]{bb.c.m.Pm, 1, bb.c.m.Om, 1, bb.c.m.km}, 0);
            if (eGLSurfaceEglCreatePbufferSurface == null) {
                throw new GlException("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext)) {
            return eGLSurfaceEglCreatePbufferSurface;
        }
        throw new GlException("eglMakeCurrent failed");
    }

    private void d() {
        c cVar = this.f51334d;
        if (cVar != null) {
            cVar.a();
        }
    }

    private static void e(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        GlUtil.e();
    }

    private static EGLDisplay f() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay == null) {
            throw new GlException("eglGetDisplay failed");
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            return eGLDisplayEglGetDisplay;
        }
        throw new GlException("eglInitialize failed");
    }

    public SurfaceTexture g() {
        return (SurfaceTexture) com.google.android.exoplayer2.util.a.g(this.f51338h);
    }

    public void h(int i10) {
        EGLDisplay eGLDisplayF = f();
        this.f51335e = eGLDisplayF;
        EGLConfig eGLConfigA = a(eGLDisplayF);
        EGLContext eGLContextB = b(this.f51335e, eGLConfigA, i10);
        this.f51336f = eGLContextB;
        this.f51337g = c(this.f51335e, eGLConfigA, eGLContextB, i10);
        e(this.f51333c);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f51333c[0]);
        this.f51338h = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i() {
        this.f51332b.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f51338h;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f51333c, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f51335e;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f51335e;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f51337g;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f51335e, this.f51337g);
            }
            EGLContext eGLContext = this.f51336f;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f51335e, eGLContext);
            }
            if (u0.f51536a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f51335e;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f51335e);
            }
            this.f51335e = null;
            this.f51336f = null;
            this.f51337g = null;
            this.f51338h = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f51332b.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        d();
        SurfaceTexture surfaceTexture = this.f51338h;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
