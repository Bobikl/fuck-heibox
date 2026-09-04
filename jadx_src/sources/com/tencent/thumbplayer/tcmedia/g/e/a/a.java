package com.tencent.thumbplayer.tcmedia.g.e.a;

import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;
import bb.c;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: loaded from: classes4.dex */
public class a implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    EGL10 f102743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    EGLDisplay f102744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    EGLContext f102745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    EGLSurface f102746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    com.tencent.thumbplayer.tcmedia.g.c.b f102747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Surface f102748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Object f102749g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f102750h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    b f102751i;

    public a() {
        a();
    }

    public a(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException();
        }
        a(i10, i11);
        c();
        a();
    }

    void a() {
        b bVar = new b();
        this.f102751i = bVar;
        bVar.b();
        com.tencent.thumbplayer.tcmedia.g.c.b bVar2 = new com.tencent.thumbplayer.tcmedia.g.c.b(this.f102751i.a());
        this.f102747e = bVar2;
        bVar2.a(new com.tencent.thumbplayer.tcmedia.g.c.b.a() { // from class: com.tencent.thumbplayer.tcmedia.g.e.a.a.1
            @Override // com.tencent.thumbplayer.tcmedia.g.c.b.a
            public void a() {
                com.tencent.thumbplayer.tcmedia.g.h.b.b("OutputSurface", "mSurfaceTexture:" + a.this.f102747e + " onReleased, release OutputSurface");
                a.this.b();
            }
        });
        this.f102747e.setOnFrameAvailableListener(this);
        this.f102748f = new com.tencent.thumbplayer.tcmedia.g.c.a(this.f102747e);
    }

    void a(int i10, int i11) {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f102743a = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f102744b = eGLDisplayEglGetDisplay;
        if (!this.f102743a.eglInitialize(eGLDisplayEglGetDisplay, null)) {
            throw new RuntimeException("unable to initialize EGL10");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!this.f102743a.eglChooseConfig(this.f102744b, new int[]{c.m.Ql, 8, c.m.Pl, 8, c.m.Ol, 8, c.m.fm, 1, c.m.sm, 4, c.m.km}, eGLConfigArr, 1, new int[1])) {
            throw new RuntimeException("unable to find RGB888+pbuffer EGL config");
        }
        this.f102745c = this.f102743a.eglCreateContext(this.f102744b, eGLConfigArr[0], EGL10.EGL_NO_CONTEXT, new int[]{c.m.co, 2, c.m.km});
        a("eglCreateContext");
        if (this.f102745c == null) {
            throw new RuntimeException("null context");
        }
        this.f102746d = this.f102743a.eglCreatePbufferSurface(this.f102744b, eGLConfigArr[0], new int[]{c.m.Pm, i10, c.m.Om, i11, c.m.km});
        a("eglCreatePbufferSurface");
        if (this.f102746d == null) {
            throw new RuntimeException("surface was null");
        }
    }

    void a(String str) {
        boolean z10 = false;
        while (true) {
            int iEglGetError = this.f102743a.eglGetError();
            if (iEglGetError == 12288) {
                break;
            }
            Log.e("OutputSurface", str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
            z10 = true;
        }
        if (z10) {
            throw new RuntimeException("EGL error encountered (see log)");
        }
    }

    public void b() {
        EGL10 egl10 = this.f102743a;
        if (egl10 != null) {
            if (egl10.eglGetCurrentContext().equals(this.f102745c)) {
                EGL10 egl11 = this.f102743a;
                EGLDisplay eGLDisplay = this.f102744b;
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl11.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            }
            this.f102743a.eglDestroySurface(this.f102744b, this.f102746d);
            this.f102743a.eglDestroyContext(this.f102744b, this.f102745c);
        }
        this.f102748f.release();
        this.f102744b = null;
        this.f102745c = null;
        this.f102746d = null;
        this.f102743a = null;
        this.f102751i = null;
        this.f102748f = null;
        this.f102747e = null;
    }

    public void c() {
        if (this.f102743a == null) {
            throw new RuntimeException("not configured for makeCurrent");
        }
        a("before makeCurrent");
        EGL10 egl10 = this.f102743a;
        EGLDisplay eGLDisplay = this.f102744b;
        EGLSurface eGLSurface = this.f102746d;
        if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f102745c)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public Surface d() {
        return this.f102748f;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.f102749g) {
            if (this.f102750h) {
                throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
            }
            this.f102750h = true;
            this.f102749g.notifyAll();
        }
    }
}
