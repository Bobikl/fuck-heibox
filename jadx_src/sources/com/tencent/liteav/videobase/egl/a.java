package com.tencent.liteav.videobase.egl;

import android.opengl.GLES20;
import android.view.Surface;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements e<EGLContext> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f100332i = {bb.c.m.fm, 1, bb.c.m.Ql, 8, bb.c.m.Pl, 8, bb.c.m.Ol, 8, bb.c.m.Nl, 8, bb.c.m.Rl, 0, bb.c.m.Sl, 0, bb.c.m.sm, 4, bb.c.m.km};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f100333j = {bb.c.m.fm, 4, bb.c.m.Ql, 8, bb.c.m.Pl, 8, bb.c.m.Ol, 8, bb.c.m.Nl, 8, bb.c.m.Rl, 0, bb.c.m.Sl, 0, bb.c.m.sm, 4, 12610, 1, bb.c.m.km};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f100335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f100336c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private EGL10 f100340g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private EGLConfig f100341h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EGLDisplay f100337d = EGL10.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private EGLContext f100338e = EGL10.EGL_NO_CONTEXT;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private EGLSurface f100339f = EGL10.EGL_NO_SURFACE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f100334a = "EGL10Helper@" + hashCode();

    private a(int i10, int i11) {
        this.f100335b = i10;
        this.f100336c = i11;
    }

    public static a a(EGLContext eGLContext, Surface surface, int i10, int i11) throws d {
        int i12;
        a aVar = new a(i10, i11);
        try {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            aVar.f100340g = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            aVar.f100337d = eGLDisplayEglGetDisplay;
            aVar.f100340g.eglInitialize(eGLDisplayEglGetDisplay, new int[2]);
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            aVar.f100340g.eglChooseConfig(aVar.f100337d, surface == null ? f100332i : f100333j, eGLConfigArr, 1, new int[1]);
            aVar.f100341h = eGLConfigArr[0];
            if (LiteavSystemInfo.getSystemOSVersionInt() >= 18) {
                try {
                    aVar.f100338e = aVar.a(aVar.f100337d, aVar.f100341h, 2, eGLContext);
                } catch (d unused) {
                    LiteavLog.i(aVar.f100334a, "failed to create EGLContext of OpenGL ES 2.0, try 3.0");
                    aVar.f100338e = aVar.a(aVar.f100337d, aVar.f100341h, 3, eGLContext);
                    i12 = 3;
                }
            } else {
                aVar.f100338e = aVar.a(aVar.f100337d, aVar.f100341h, 2, eGLContext);
            }
            i12 = 2;
            LiteavLog.i(aVar.f100334a, "create eglContext " + aVar.f100338e + " sharedContext: " + eGLContext + " version:" + i12);
            if (surface == null) {
                aVar.f100339f = aVar.f100340g.eglCreatePbufferSurface(aVar.f100337d, aVar.f100341h, new int[]{bb.c.m.Pm, aVar.f100335b, bb.c.m.Om, aVar.f100336c, bb.c.m.km});
            } else {
                try {
                    aVar.f100339f = aVar.f100340g.eglCreateWindowSurface(aVar.f100337d, aVar.f100341h, surface, null);
                } catch (Throwable th2) {
                    throw new d(aVar.f100340g.eglGetError(), "", th2);
                }
            }
            if (aVar.f100339f == EGL10.EGL_NO_SURFACE) {
                aVar.h();
            }
            EGL10 egl11 = aVar.f100340g;
            EGLDisplay eGLDisplay = aVar.f100337d;
            EGLSurface eGLSurface = aVar.f100339f;
            if (!egl11.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, aVar.f100338e)) {
                aVar.h();
            }
            return aVar;
        } catch (d e10) {
            aVar.c();
            throw e10;
        }
    }

    private EGLContext a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10, EGLContext eGLContext) throws d {
        int[] iArr = {bb.c.m.co, i10, bb.c.m.km};
        if (eGLContext == null) {
            eGLContext = EGL10.EGL_NO_CONTEXT;
        }
        EGLContext eGLContextEglCreateContext = this.f100340g.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        h();
        return eGLContextEglCreateContext;
    }

    private void g() throws d {
        if (this.f100339f != EGL10.EGL_NO_SURFACE) {
            d();
            if (!this.f100340g.eglDestroySurface(this.f100337d, this.f100339f)) {
                h();
            }
            this.f100339f = EGL10.EGL_NO_SURFACE;
        }
    }

    private void h() throws d {
        int iEglGetError = this.f100340g.eglGetError();
        if (iEglGetError != 12288) {
            throw new d(iEglGetError);
        }
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final void a() throws d {
        GLES20.glFinish();
        if (this.f100340g.eglSwapBuffers(this.f100337d, this.f100339f)) {
            return;
        }
        h();
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final void b() throws d {
        EGL10 egl10 = this.f100340g;
        EGLDisplay eGLDisplay = this.f100337d;
        EGLSurface eGLSurface = this.f100339f;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f100338e)) {
            return;
        }
        h();
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final void c() throws d {
        if (this.f100337d != EGL10.EGL_NO_DISPLAY) {
            d();
            g();
            if (this.f100338e != EGL10.EGL_NO_CONTEXT) {
                LiteavLog.i(this.f100334a, "destroy eglContext " + this.f100338e);
                this.f100340g.eglDestroyContext(this.f100337d, this.f100338e);
                this.f100338e = EGL10.EGL_NO_CONTEXT;
            }
            this.f100340g.eglTerminate(this.f100337d);
        }
        this.f100337d = EGL10.EGL_NO_DISPLAY;
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final void d() {
        EGLDisplay eGLDisplay = this.f100337d;
        if (eGLDisplay != EGL10.EGL_NO_DISPLAY) {
            EGL10 egl10 = this.f100340g;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        }
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final Size e() {
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        return (this.f100340g.eglQuerySurface(this.f100337d, this.f100339f, bb.c.m.Pm, iArr) && this.f100340g.eglQuerySurface(this.f100337d, this.f100339f, bb.c.m.Om, iArr2)) ? new Size(iArr[0], iArr2[0]) : new Size(0, 0);
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final /* bridge */ /* synthetic */ EGLContext f() {
        return this.f100338e;
    }
}
