package com.tencent.ugc;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Looper;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.egl.EGLCore;
import javax.microedition.khronos.egl.EGL10;

/* JADX INFO: loaded from: classes4.dex */
public class GlobalContextManager {
    private static final String TAG = "GlobalContextManager";
    private static volatile GlobalContextManager sInstance;
    private EGLCore mEGLCore;
    private Object mGLContext;

    private GlobalContextManager() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            initGlobalContext();
        } else {
            new CustomHandler(Looper.getMainLooper()).runAndWaitDone(a.a(this));
        }
    }

    private void createContext() {
        EGLCore eGLCore = new EGLCore();
        this.mEGLCore = eGLCore;
        try {
            eGLCore.initialize(null, null, 128, 128);
        } catch (com.tencent.liteav.videobase.egl.d e10) {
            LiteavLog.e(TAG, "initializeEGL failed.", e10);
            this.mEGLCore = null;
        }
        EGLCore eGLCore2 = this.mEGLCore;
        if (eGLCore2 != null) {
            this.mGLContext = eGLCore2.getEglContext();
        }
    }

    public static GlobalContextManager getInstance() {
        if (sInstance == null) {
            synchronized (GlobalContextManager.class) {
                if (sInstance == null) {
                    sInstance = new GlobalContextManager();
                }
            }
        }
        return sInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initGlobalContext() {
        if (this.mGLContext != null) {
            return;
        }
        LiteavLog.i(TAG, "context before creating: " + EGL14.eglGetCurrentContext());
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 17) {
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            EGLSurface eGLSurfaceEglGetCurrentSurface = EGL14.eglGetCurrentSurface(bb.c.m.Sm);
            EGLSurface eGLSurfaceEglGetCurrentSurface2 = EGL14.eglGetCurrentSurface(bb.c.m.Rm);
            EGLContext eGLContextEglGetCurrentContext = EGL14.eglGetCurrentContext();
            createContext();
            EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglGetCurrentSurface2, eGLSurfaceEglGetCurrentSurface, eGLContextEglGetCurrentContext);
        } else {
            EGL10 egl10 = (EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
            javax.microedition.khronos.egl.EGLDisplay eGLDisplayEglGetDisplay2 = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            javax.microedition.khronos.egl.EGLSurface eGLSurfaceEglGetCurrentSurface3 = egl10.eglGetCurrentSurface(bb.c.m.Sm);
            javax.microedition.khronos.egl.EGLSurface eGLSurfaceEglGetCurrentSurface4 = egl10.eglGetCurrentSurface(bb.c.m.Rm);
            javax.microedition.khronos.egl.EGLContext eGLContextEglGetCurrentContext2 = egl10.eglGetCurrentContext();
            createContext();
            egl10.eglMakeCurrent(eGLDisplayEglGetDisplay2, eGLSurfaceEglGetCurrentSurface4, eGLSurfaceEglGetCurrentSurface3, eGLContextEglGetCurrentContext2);
        }
        LiteavLog.i(TAG, "context after creating: " + EGL14.eglGetCurrentContext() + ", global context: " + this.mGLContext);
    }

    public synchronized Object getGLContext() {
        return this.mGLContext;
    }
}
