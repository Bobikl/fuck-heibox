package com.tencent.ugc.videobase.egl;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import bb.c;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;

/* JADX INFO: loaded from: classes4.dex */
public class EGL14Helper implements EGLHelper<EGLContext> {
    private static final int EGL_RECORDABLE_ANDROID = 12610;
    private final int mHeight;
    private final int mWidth;
    private static final int[] ATTRIBUTE_LIST_FOR_SURFACE = {c.m.Ql, 8, c.m.Pl, 8, c.m.Ol, 8, c.m.Nl, 8, c.m.Rl, 0, c.m.Sl, 0, c.m.sm, 4, 12610, 1, c.m.km};
    private static final int[] ATTRIBUTE_LIST_FOR_OFFSCREEN_SURFACE = {c.m.fm, 1, c.m.Ql, 8, c.m.Pl, 8, c.m.Ol, 8, c.m.Nl, 8, c.m.Rl, 0, c.m.Sl, 0, c.m.sm, 4, 12610, 1, c.m.km};
    private EGLConfig mEGLConfig = null;
    private EGLDisplay mEGLDisplay = EGL14.EGL_NO_DISPLAY;
    private EGLContext mEGLContext = EGL14.EGL_NO_CONTEXT;
    private EGLSurface mEGLSurface = EGL14.EGL_NO_SURFACE;
    private final String mTAG = "EGL14Helper@" + hashCode();

    private EGL14Helper(int i10, int i11) {
        this.mWidth = i10;
        this.mHeight = i11;
    }

    private static EGLContext createEGLContext(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10, EGLContext eGLContext) throws EGLException {
        int[] iArr = {c.m.co, i10, c.m.km};
        if (eGLContext == null) {
            eGLContext = EGL14.EGL_NO_CONTEXT;
        }
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr, 0);
        throwEGLExceptionIfFailed();
        return eGLContextEglCreateContext;
    }

    public static EGL14Helper createEGLSurface(EGLConfig eGLConfig, EGLContext eGLContext, Surface surface, int i10, int i11) throws EGLException {
        EGL14Helper eGL14Helper = new EGL14Helper(i10, i11);
        try {
            eGL14Helper.initialize(eGLConfig, eGLContext, surface);
            return eGL14Helper;
        } catch (EGLException e10) {
            eGL14Helper.destroy();
            throw e10;
        }
    }

    private void initialize(EGLConfig eGLConfig, EGLContext eGLContext, Surface surface) throws EGLException {
        int i10;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.mEGLDisplay = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            LiteavLog.e(this.mTAG, "unable to get EGL14 display");
            throw new EGLException(0);
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            this.mEGLDisplay = null;
            LiteavLog.e(this.mTAG, "unable to initialize EGL14");
            throw new EGLException(0);
        }
        if (eGLConfig != null) {
            this.mEGLConfig = eGLConfig;
        } else {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!EGL14.eglChooseConfig(this.mEGLDisplay, surface == null ? ATTRIBUTE_LIST_FOR_OFFSCREEN_SURFACE : ATTRIBUTE_LIST_FOR_SURFACE, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                throw new EGLException(0);
            }
            this.mEGLConfig = eGLConfigArr[0];
        }
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 18) {
            try {
                this.mEGLContext = createEGLContext(this.mEGLDisplay, this.mEGLConfig, 2, eGLContext);
            } catch (EGLException unused) {
                LiteavLog.i(this.mTAG, "failed to create EGLContext of OpenGL ES 2.0, try 3.0");
                this.mEGLContext = createEGLContext(this.mEGLDisplay, this.mEGLConfig, 3, eGLContext);
                i10 = 3;
            }
        } else {
            this.mEGLContext = createEGLContext(this.mEGLDisplay, this.mEGLConfig, 2, eGLContext);
        }
        i10 = 2;
        LiteavLog.i(this.mTAG, "create eglContext " + this.mEGLContext + " sharedContext: " + eGLContext + " version:" + i10);
        if (surface == null) {
            this.mEGLSurface = EGL14.eglCreatePbufferSurface(this.mEGLDisplay, this.mEGLConfig, new int[]{c.m.Pm, this.mWidth, c.m.Om, this.mHeight, c.m.km}, 0);
        } else {
            try {
                this.mEGLSurface = EGL14.eglCreateWindowSurface(this.mEGLDisplay, this.mEGLConfig, surface, new int[]{c.m.km}, 0);
            } catch (Throwable th2) {
                throw new EGLException(EGL14.eglGetError(), "", th2);
            }
        }
        throwEGLExceptionIfFailed();
        EGLDisplay eGLDisplay = this.mEGLDisplay;
        EGLSurface eGLSurface = this.mEGLSurface;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.mEGLContext)) {
            return;
        }
        throwEGLExceptionIfFailed();
    }

    private static void throwEGLExceptionIfFailed() throws EGLException {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError != 12288) {
            throw new EGLException(iEglGetError);
        }
    }

    @Override // com.tencent.ugc.videobase.egl.EGLHelper
    public void destroy() {
        EGLDisplay eGLDisplay = this.mEGLDisplay;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGLSurface eGLSurface2 = this.mEGLSurface;
            if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.mEGLDisplay, eGLSurface2);
                this.mEGLSurface = EGL14.EGL_NO_SURFACE;
            }
            if (this.mEGLContext != EGL14.EGL_NO_CONTEXT) {
                LiteavLog.i(this.mTAG, "destroy eglContext " + this.mEGLContext);
                EGL14.eglDestroyContext(this.mEGLDisplay, this.mEGLContext);
                this.mEGLContext = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.mEGLDisplay);
        }
        this.mEGLDisplay = EGL14.EGL_NO_DISPLAY;
    }

    @Override // com.tencent.ugc.videobase.egl.EGLHelper
    public void destroySurface() {
        if (this.mEGLSurface != EGL14.EGL_NO_SURFACE) {
            unmakeCurrent();
            EGL14.eglDestroySurface(this.mEGLDisplay, this.mEGLSurface);
            this.mEGLSurface = EGL14.EGL_NO_SURFACE;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.ugc.videobase.egl.EGLHelper
    public EGLContext getContext() {
        return this.mEGLContext;
    }

    @Override // com.tencent.ugc.videobase.egl.EGLHelper
    public Size getSurfaceSize() {
        int[] iArr = new int[2];
        return (EGL14.eglQuerySurface(this.mEGLDisplay, this.mEGLSurface, c.m.Pm, iArr, 0) && EGL14.eglQuerySurface(this.mEGLDisplay, this.mEGLSurface, c.m.Om, iArr, 1)) ? new Size(iArr[0], iArr[1]) : new Size(0, 0);
    }

    @Override // com.tencent.ugc.videobase.egl.EGLHelper
    public void makeCurrent() throws EGLException {
        EGLDisplay eGLDisplay = this.mEGLDisplay;
        EGLSurface eGLSurface = this.mEGLSurface;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.mEGLContext)) {
            return;
        }
        throwEGLExceptionIfFailed();
    }

    public void setPresentationTime(long j10) {
        EGLExt.eglPresentationTimeANDROID(this.mEGLDisplay, this.mEGLSurface, j10);
    }

    @Override // com.tencent.ugc.videobase.egl.EGLHelper
    public void swapBuffers() throws EGLException {
        GLES20.glFinish();
        if (EGL14.eglSwapBuffers(this.mEGLDisplay, this.mEGLSurface)) {
            return;
        }
        throwEGLExceptionIfFailed();
    }

    @Override // com.tencent.ugc.videobase.egl.EGLHelper
    public void unmakeCurrent() {
        EGLDisplay eGLDisplay = this.mEGLDisplay;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        }
    }

    @Override // com.tencent.ugc.videobase.egl.EGLHelper
    public void updateSurface(Object obj) throws EGLException {
        destroySurface();
        this.mEGLSurface = EGL14.eglCreateWindowSurface(this.mEGLDisplay, this.mEGLConfig, obj, new int[]{c.m.km}, 0);
        throwEGLExceptionIfFailed();
    }
}
