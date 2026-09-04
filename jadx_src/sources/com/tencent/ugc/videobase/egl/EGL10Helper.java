package com.tencent.ugc.videobase.egl;

import android.opengl.GLES20;
import android.view.Surface;
import bb.c;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: loaded from: classes4.dex */
public class EGL10Helper implements EGLHelper<EGLContext> {
    private static final int[] ATTRIBUTES_FOR_OFFSCREEN_SURFACE = {c.m.fm, 1, c.m.Ql, 8, c.m.Pl, 8, c.m.Ol, 8, c.m.Nl, 8, c.m.Rl, 0, c.m.Sl, 0, c.m.sm, 4, c.m.km};
    private static final int[] ATTRIBUTES_FOR_SURFACE = {c.m.fm, 4, c.m.Ql, 8, c.m.Pl, 8, c.m.Ol, 8, c.m.Nl, 8, c.m.Rl, 0, c.m.Sl, 0, c.m.sm, 4, 12610, 1, c.m.km};
    private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private static final int EGL_OPENGL_ES2_BIT = 4;
    private static final int EGL_RECORDABLE_ANDROID = 12610;
    private EGL10 mEGL;
    private EGLConfig mEGLConfig;
    private final int mHeight;
    private final int mWidth;
    private EGLDisplay mEGLDisplay = EGL10.EGL_NO_DISPLAY;
    private EGLContext mEGLContext = EGL10.EGL_NO_CONTEXT;
    private EGLSurface mEGLSurface = EGL10.EGL_NO_SURFACE;
    private final String mTag = "EGL10Helper@" + hashCode();

    private EGL10Helper(int i10, int i11) {
        this.mWidth = i10;
        this.mHeight = i11;
    }

    private EGLContext createEGLContext(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10, EGLContext eGLContext) throws EGLException {
        int[] iArr = {12440, i10, c.m.km};
        if (eGLContext == null) {
            eGLContext = EGL10.EGL_NO_CONTEXT;
        }
        EGLContext eGLContextEglCreateContext = this.mEGL.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        throwEGLExceptionIfFailed();
        return eGLContextEglCreateContext;
    }

    public static EGL10Helper createEGLSurface(EGLConfig eGLConfig, EGLContext eGLContext, Surface surface, int i10, int i11) throws EGLException {
        EGL10Helper eGL10Helper = new EGL10Helper(i10, i11);
        try {
            eGL10Helper.initialize(eGLConfig, eGLContext, surface);
            return eGL10Helper;
        } catch (EGLException e10) {
            eGL10Helper.destroy();
            throw e10;
        }
    }

    private void initialize(EGLConfig eGLConfig, EGLContext eGLContext, Surface surface) throws EGLException {
        int i10;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.mEGL = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.mEGLDisplay = eGLDisplayEglGetDisplay;
        this.mEGL.eglInitialize(eGLDisplayEglGetDisplay, new int[2]);
        if (eGLConfig == null) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            this.mEGL.eglChooseConfig(this.mEGLDisplay, surface == null ? ATTRIBUTES_FOR_OFFSCREEN_SURFACE : ATTRIBUTES_FOR_SURFACE, eGLConfigArr, 1, new int[1]);
            this.mEGLConfig = eGLConfigArr[0];
        } else {
            this.mEGLConfig = eGLConfig;
        }
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 18) {
            try {
                this.mEGLContext = createEGLContext(this.mEGLDisplay, this.mEGLConfig, 2, eGLContext);
            } catch (EGLException unused) {
                LiteavLog.i(this.mTag, "failed to create EGLContext of OpenGL ES 2.0, try 3.0");
                this.mEGLContext = createEGLContext(this.mEGLDisplay, this.mEGLConfig, 3, eGLContext);
                i10 = 3;
            }
        } else {
            this.mEGLContext = createEGLContext(this.mEGLDisplay, this.mEGLConfig, 2, eGLContext);
        }
        i10 = 2;
        LiteavLog.i(this.mTag, "create eglContext " + this.mEGLContext + " sharedContext: " + eGLContext + " version:" + i10);
        if (surface == null) {
            this.mEGLSurface = this.mEGL.eglCreatePbufferSurface(this.mEGLDisplay, this.mEGLConfig, new int[]{c.m.Pm, this.mWidth, c.m.Om, this.mHeight, c.m.km});
        } else {
            try {
                this.mEGLSurface = this.mEGL.eglCreateWindowSurface(this.mEGLDisplay, this.mEGLConfig, surface, null);
            } catch (Throwable th2) {
                throw new EGLException(this.mEGL.eglGetError(), "", th2);
            }
        }
        if (this.mEGLSurface == EGL10.EGL_NO_SURFACE) {
            throwEGLExceptionIfFailed();
        }
        EGL10 egl11 = this.mEGL;
        EGLDisplay eGLDisplay = this.mEGLDisplay;
        EGLSurface eGLSurface = this.mEGLSurface;
        if (egl11.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.mEGLContext)) {
            return;
        }
        throwEGLExceptionIfFailed();
    }

    private void throwEGLExceptionIfFailed() throws EGLException {
        int iEglGetError = this.mEGL.eglGetError();
        if (iEglGetError != 12288) {
            throw new EGLException(iEglGetError);
        }
    }

    @Override // com.tencent.ugc.videobase.egl.EGLHelper
    public void destroy() throws EGLException {
        if (this.mEGLDisplay != EGL10.EGL_NO_DISPLAY) {
            unmakeCurrent();
            destroySurface();
            if (this.mEGLContext != EGL10.EGL_NO_CONTEXT) {
                LiteavLog.i(this.mTag, "destroy eglContext " + this.mEGLContext);
                this.mEGL.eglDestroyContext(this.mEGLDisplay, this.mEGLContext);
                this.mEGLContext = EGL10.EGL_NO_CONTEXT;
            }
            this.mEGL.eglTerminate(this.mEGLDisplay);
        }
        this.mEGLDisplay = EGL10.EGL_NO_DISPLAY;
    }

    @Override // com.tencent.ugc.videobase.egl.EGLHelper
    public void destroySurface() throws EGLException {
        if (this.mEGLSurface != EGL10.EGL_NO_SURFACE) {
            unmakeCurrent();
            if (!this.mEGL.eglDestroySurface(this.mEGLDisplay, this.mEGLSurface)) {
                throwEGLExceptionIfFailed();
            }
            this.mEGLSurface = EGL10.EGL_NO_SURFACE;
        }
    }

    @Override // com.tencent.ugc.videobase.egl.EGLHelper
    public EGLContext getContext() {
        return this.mEGLContext;
    }

    @Override // com.tencent.ugc.videobase.egl.EGLHelper
    public Size getSurfaceSize() {
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        return (this.mEGL.eglQuerySurface(this.mEGLDisplay, this.mEGLSurface, c.m.Pm, iArr) && this.mEGL.eglQuerySurface(this.mEGLDisplay, this.mEGLSurface, c.m.Om, iArr2)) ? new Size(iArr[0], iArr2[0]) : new Size(0, 0);
    }

    @Override // com.tencent.ugc.videobase.egl.EGLHelper
    public void makeCurrent() throws EGLException {
        EGL10 egl10 = this.mEGL;
        EGLDisplay eGLDisplay = this.mEGLDisplay;
        EGLSurface eGLSurface = this.mEGLSurface;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.mEGLContext)) {
            return;
        }
        throwEGLExceptionIfFailed();
    }

    @Override // com.tencent.ugc.videobase.egl.EGLHelper
    public void swapBuffers() throws EGLException {
        GLES20.glFinish();
        if (this.mEGL.eglSwapBuffers(this.mEGLDisplay, this.mEGLSurface)) {
            return;
        }
        throwEGLExceptionIfFailed();
    }

    @Override // com.tencent.ugc.videobase.egl.EGLHelper
    public void unmakeCurrent() {
        EGLDisplay eGLDisplay = this.mEGLDisplay;
        if (eGLDisplay != EGL10.EGL_NO_DISPLAY) {
            EGL10 egl10 = this.mEGL;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        }
    }

    @Override // com.tencent.ugc.videobase.egl.EGLHelper
    public void updateSurface(Object obj) throws EGLException {
        destroySurface();
        this.mEGLSurface = this.mEGL.eglCreateWindowSurface(this.mEGLDisplay, this.mEGLConfig, obj, null);
        throwEGLExceptionIfFailed();
    }
}
