package com.tencent.custom.customcapture.render;

import android.util.Log;
import android.view.Surface;
import bb.c;
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
    private static final String TAG = "EGL10Helper";
    private EGL10 mEGL;
    private EGLConfig mEGLConfig;
    private final int mHeight;
    private final int mWidth;
    private EGLDisplay mEGLDisplay = EGL10.EGL_NO_DISPLAY;
    private EGLContext mEGLContext = EGL10.EGL_NO_CONTEXT;
    private EGLSurface mEGLSurface = EGL10.EGL_NO_SURFACE;

    private EGL10Helper(int i10, int i11) {
        this.mWidth = i10;
        this.mHeight = i11;
    }

    public static EGL10Helper createEGLSurface(EGLConfig eGLConfig, EGLContext eGLContext, Surface surface, int i10, int i11) {
        EGL10Helper eGL10Helper = new EGL10Helper(i10, i11);
        if (eGL10Helper.initialize(eGLConfig, eGLContext, surface)) {
            return eGL10Helper;
        }
        return null;
    }

    private boolean initialize(EGLConfig eGLConfig, EGLContext eGLContext, Surface surface) {
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
        int[] iArr = {12440, 2, c.m.km};
        if (eGLContext == null) {
            eGLContext = EGL10.EGL_NO_CONTEXT;
        }
        EGLContext eGLContextEglCreateContext = this.mEGL.eglCreateContext(this.mEGLDisplay, this.mEGLConfig, eGLContext, iArr);
        this.mEGLContext = eGLContextEglCreateContext;
        if (eGLContextEglCreateContext == EGL10.EGL_NO_CONTEXT) {
            checkEglError();
            return false;
        }
        int[] iArr2 = {c.m.Pm, this.mWidth, c.m.Om, this.mHeight, c.m.km};
        if (surface == null) {
            this.mEGLSurface = this.mEGL.eglCreatePbufferSurface(this.mEGLDisplay, this.mEGLConfig, iArr2);
        } else {
            this.mEGLSurface = this.mEGL.eglCreateWindowSurface(this.mEGLDisplay, this.mEGLConfig, surface, null);
        }
        EGLSurface eGLSurface = this.mEGLSurface;
        if (eGLSurface == EGL10.EGL_NO_SURFACE) {
            checkEglError();
            return false;
        }
        if (this.mEGL.eglMakeCurrent(this.mEGLDisplay, eGLSurface, eGLSurface, this.mEGLContext)) {
            return true;
        }
        checkEglError();
        return false;
    }

    public void checkEglError() {
        int iEglGetError = this.mEGL.eglGetError();
        if (iEglGetError != 12288) {
            Log.e(TAG, "EGL error: 0x" + Integer.toHexString(iEglGetError));
        }
    }

    @Override // com.tencent.custom.customcapture.render.EGLHelper
    public void destroy() {
        EGLDisplay eGLDisplay = this.mEGLDisplay;
        if (eGLDisplay != EGL10.EGL_NO_DISPLAY) {
            EGL10 egl10 = this.mEGL;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            EGLSurface eGLSurface2 = this.mEGLSurface;
            if (eGLSurface2 != EGL10.EGL_NO_SURFACE) {
                this.mEGL.eglDestroySurface(this.mEGLDisplay, eGLSurface2);
                this.mEGLSurface = EGL10.EGL_NO_SURFACE;
            }
            EGLContext eGLContext = this.mEGLContext;
            if (eGLContext != EGL10.EGL_NO_CONTEXT) {
                this.mEGL.eglDestroyContext(this.mEGLDisplay, eGLContext);
                this.mEGLContext = EGL10.EGL_NO_CONTEXT;
            }
            this.mEGL.eglTerminate(this.mEGLDisplay);
            checkEglError();
        }
        this.mEGLDisplay = EGL10.EGL_NO_DISPLAY;
    }

    @Override // com.tencent.custom.customcapture.render.EGLHelper
    public EGLContext getContext() {
        return this.mEGLContext;
    }

    @Override // com.tencent.custom.customcapture.render.EGLHelper
    public void makeCurrent() {
        EGL10 egl10 = this.mEGL;
        EGLDisplay eGLDisplay = this.mEGLDisplay;
        EGLSurface eGLSurface = this.mEGLSurface;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.mEGLContext);
        checkEglError();
    }

    @Override // com.tencent.custom.customcapture.render.EGLHelper
    public boolean swapBuffers() {
        boolean zEglSwapBuffers = this.mEGL.eglSwapBuffers(this.mEGLDisplay, this.mEGLSurface);
        checkEglError();
        return zEglSwapBuffers;
    }

    @Override // com.tencent.custom.customcapture.render.EGLHelper
    public void unmakeCurrent() {
        EGLDisplay eGLDisplay = this.mEGLDisplay;
        if (eGLDisplay != EGL10.EGL_NO_DISPLAY) {
            EGL10 egl10 = this.mEGL;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        }
    }
}
