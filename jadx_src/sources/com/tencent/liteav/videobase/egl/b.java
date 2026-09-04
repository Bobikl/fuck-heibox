package com.tencent.liteav.videobase.egl;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements e<EGLContext> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f100342h = {bb.c.m.Ql, 8, bb.c.m.Pl, 8, bb.c.m.Ol, 8, bb.c.m.Nl, 8, bb.c.m.Rl, 0, bb.c.m.Sl, 0, bb.c.m.sm, 4, 12610, 1, bb.c.m.km};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f100343i = {bb.c.m.fm, 1, bb.c.m.Ql, 8, bb.c.m.Pl, 8, bb.c.m.Ol, 8, bb.c.m.Nl, 8, bb.c.m.Rl, 0, bb.c.m.Sl, 0, bb.c.m.sm, 4, 12610, 1, bb.c.m.km};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f100347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f100348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private EGLConfig f100349f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    EGLDisplay f100344a = EGL14.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private EGLContext f100350g = EGL14.EGL_NO_CONTEXT;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    EGLSurface f100345b = EGL14.EGL_NO_SURFACE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f100346c = "EGL14Helper@" + hashCode();

    private b(int i10, int i11) {
        this.f100347d = i10;
        this.f100348e = i11;
    }

    private static EGLContext a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10, EGLContext eGLContext) throws d {
        int[] iArr = {bb.c.m.co, i10, bb.c.m.km};
        if (eGLContext == null) {
            eGLContext = EGL14.EGL_NO_CONTEXT;
        }
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr, 0);
        g();
        return eGLContextEglCreateContext;
    }

    public static b a(EGLContext eGLContext, Surface surface, int i10, int i11) throws d {
        int i12;
        b bVar = new b(i10, i11);
        try {
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            bVar.f100344a = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
                LiteavLog.e(bVar.f100346c, "unable to get EGL14 display");
                throw new d(0);
            }
            int[] iArr = new int[2];
            if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
                bVar.f100344a = null;
                LiteavLog.e(bVar.f100346c, "unable to initialize EGL14");
                throw new d(0);
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!EGL14.eglChooseConfig(bVar.f100344a, surface == null ? f100343i : f100342h, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                throw new d(0);
            }
            bVar.f100349f = eGLConfigArr[0];
            if (LiteavSystemInfo.getSystemOSVersionInt() >= 18) {
                try {
                    bVar.f100350g = a(bVar.f100344a, bVar.f100349f, 2, eGLContext);
                } catch (d unused) {
                    LiteavLog.i(bVar.f100346c, "failed to create EGLContext of OpenGL ES 2.0, try 3.0");
                    bVar.f100350g = a(bVar.f100344a, bVar.f100349f, 3, eGLContext);
                    i12 = 3;
                }
            } else {
                bVar.f100350g = a(bVar.f100344a, bVar.f100349f, 2, eGLContext);
            }
            i12 = 2;
            LiteavLog.i(bVar.f100346c, "create eglContext " + bVar.f100350g + " sharedContext: " + eGLContext + " version:" + i12);
            if (surface == null) {
                bVar.f100345b = EGL14.eglCreatePbufferSurface(bVar.f100344a, bVar.f100349f, new int[]{bb.c.m.Pm, bVar.f100347d, bb.c.m.Om, bVar.f100348e, bb.c.m.km}, 0);
            } else {
                try {
                    bVar.f100345b = EGL14.eglCreateWindowSurface(bVar.f100344a, bVar.f100349f, surface, new int[]{bb.c.m.km}, 0);
                } catch (Throwable th2) {
                    throw new d(EGL14.eglGetError(), "", th2);
                }
            }
            g();
            EGLDisplay eGLDisplay = bVar.f100344a;
            EGLSurface eGLSurface = bVar.f100345b;
            if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, bVar.f100350g)) {
                g();
            }
            return bVar;
        } catch (d e10) {
            bVar.c();
            throw e10;
        }
    }

    private static void g() throws d {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError != 12288) {
            throw new d(iEglGetError);
        }
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final void a() throws d {
        GLES20.glFinish();
        if (EGL14.eglSwapBuffers(this.f100344a, this.f100345b)) {
            return;
        }
        g();
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final void b() throws d {
        EGLDisplay eGLDisplay = this.f100344a;
        EGLSurface eGLSurface = this.f100345b;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f100350g)) {
            return;
        }
        g();
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final void c() {
        EGLDisplay eGLDisplay = this.f100344a;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGLSurface eGLSurface2 = this.f100345b;
            if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.f100344a, eGLSurface2);
                this.f100345b = EGL14.EGL_NO_SURFACE;
            }
            if (this.f100350g != EGL14.EGL_NO_CONTEXT) {
                LiteavLog.i(this.f100346c, "destroy eglContext " + this.f100350g);
                EGL14.eglDestroyContext(this.f100344a, this.f100350g);
                this.f100350g = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f100344a);
        }
        this.f100344a = EGL14.EGL_NO_DISPLAY;
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final void d() {
        EGLDisplay eGLDisplay = this.f100344a;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        }
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final Size e() {
        int[] iArr = new int[2];
        return (EGL14.eglQuerySurface(this.f100344a, this.f100345b, bb.c.m.Pm, iArr, 0) && EGL14.eglQuerySurface(this.f100344a, this.f100345b, bb.c.m.Om, iArr, 1)) ? new Size(iArr[0], iArr[1]) : new Size(0, 0);
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final /* bridge */ /* synthetic */ EGLContext f() {
        return this.f100350g;
    }
}
