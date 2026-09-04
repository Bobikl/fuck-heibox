package com.tencent.custom.customcapture.render;

import android.annotation.TargetApi;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.util.Log;
import android.view.Surface;
import bb.c;

/* JADX INFO: loaded from: classes4.dex */
@TargetApi(17)
public class EGL14Helper implements EGLHelper<EGLContext> {
    private static final int EGL_RECORDABLE_ANDROID = 12610;
    private static final int GLES_VERSION = 2;
    private static final String TAG = "EGL14Helper";
    private EGLSurface mEGLSurface;
    private final int mHeight;
    private final int mWidth;
    private static final int[] ATTRIBUTE_LIST_FOR_SURFACE = {c.m.Ql, 8, c.m.Pl, 8, c.m.Ol, 8, c.m.Nl, 8, c.m.Rl, 0, c.m.Sl, 0, c.m.sm, 4, 12610, 1, c.m.km};
    private static final int[] ATTRIBUTE_LIST_FOR_OFFSCREEN_SURFACE = {c.m.fm, 1, c.m.Ql, 8, c.m.Pl, 8, c.m.Ol, 8, c.m.Nl, 8, c.m.Rl, 0, c.m.Sl, 0, c.m.sm, 4, 12610, 1, c.m.km};
    private EGLConfig mEGLConfig = null;
    private EGLDisplay mEGLDisplay = EGL14.EGL_NO_DISPLAY;
    private EGLContext mEGLContext = EGL14.EGL_NO_CONTEXT;

    private EGL14Helper(int i10, int i11) {
        this.mWidth = i10;
        this.mHeight = i11;
    }

    private void checkEGLError() {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        Log.e(TAG, "EGL error:" + iEglGetError);
        throw new RuntimeException(": EGL error: 0x" + Integer.toHexString(iEglGetError));
    }

    public static EGL14Helper createEGLSurface(EGLConfig eGLConfig, EGLContext eGLContext, Surface surface, int i10, int i11) {
        EGL14Helper eGL14Helper = new EGL14Helper(i10, i11);
        if (eGL14Helper.initialize(eGLConfig, eGLContext, surface)) {
            return eGL14Helper;
        }
        return null;
    }

    private boolean initialize(EGLConfig eGLConfig, EGLContext eGLContext, Surface surface) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.mEGLDisplay = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            this.mEGLDisplay = null;
            throw new RuntimeException("unable to initialize EGL14");
        }
        if (eGLConfig != null) {
            this.mEGLConfig = eGLConfig;
        } else {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!EGL14.eglChooseConfig(this.mEGLDisplay, surface == null ? ATTRIBUTE_LIST_FOR_OFFSCREEN_SURFACE : ATTRIBUTE_LIST_FOR_SURFACE, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                return false;
            }
            this.mEGLConfig = eGLConfigArr[0];
        }
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.mEGLDisplay, this.mEGLConfig, eGLContext == null ? EGL14.EGL_NO_CONTEXT : eGLContext, new int[]{c.m.co, 2, c.m.km}, 0);
        this.mEGLContext = eGLContextEglCreateContext;
        if (eGLContextEglCreateContext == EGL14.EGL_NO_CONTEXT) {
            checkEGLError();
            return false;
        }
        if (surface == null) {
            this.mEGLSurface = EGL14.eglCreatePbufferSurface(this.mEGLDisplay, this.mEGLConfig, new int[]{c.m.Pm, this.mWidth, c.m.Om, this.mHeight, c.m.km}, 0);
        } else {
            this.mEGLSurface = EGL14.eglCreateWindowSurface(this.mEGLDisplay, this.mEGLConfig, surface, new int[]{c.m.km}, 0);
        }
        checkEGLError();
        EGLDisplay eGLDisplay = this.mEGLDisplay;
        EGLSurface eGLSurface = this.mEGLSurface;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.mEGLContext)) {
            return true;
        }
        checkEGLError();
        return false;
    }

    @Override // com.tencent.custom.customcapture.render.EGLHelper
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
            EGLContext eGLContext = this.mEGLContext;
            if (eGLContext != EGL14.EGL_NO_CONTEXT) {
                EGL14.eglDestroyContext(this.mEGLDisplay, eGLContext);
                this.mEGLContext = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.mEGLDisplay);
        }
        this.mEGLDisplay = EGL14.EGL_NO_DISPLAY;
    }

    public EGLConfig getConfig() {
        return this.mEGLConfig;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.custom.customcapture.render.EGLHelper
    public EGLContext getContext() {
        return this.mEGLContext;
    }

    @Override // com.tencent.custom.customcapture.render.EGLHelper
    public void makeCurrent() {
        if (this.mEGLDisplay == EGL14.EGL_NO_DISPLAY) {
            Log.d(TAG, "NOTE: makeCurrent w/o display");
        }
        EGLDisplay eGLDisplay = this.mEGLDisplay;
        EGLSurface eGLSurface = this.mEGLSurface;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.mEGLContext)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public void setPresentationTime(long j10) {
        EGLExt.eglPresentationTimeANDROID(this.mEGLDisplay, this.mEGLSurface, j10);
    }

    @Override // com.tencent.custom.customcapture.render.EGLHelper
    public boolean swapBuffers() {
        return EGL14.eglSwapBuffers(this.mEGLDisplay, this.mEGLSurface);
    }

    @Override // com.tencent.custom.customcapture.render.EGLHelper
    public void unmakeCurrent() {
        EGLDisplay eGLDisplay = this.mEGLDisplay;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        }
    }
}
