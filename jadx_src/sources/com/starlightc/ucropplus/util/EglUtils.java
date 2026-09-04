package com.starlightc.ucropplus.util;

import android.annotation.TargetApi;
import android.opengl.EGL14;
import android.opengl.GLES10;
import android.opengl.GLES20;
import android.util.Log;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: loaded from: classes4.dex */
public class EglUtils {
    private static final String TAG = "EglUtils";
    public static ChangeQuickRedirect changeQuickRedirect;

    private EglUtils() {
    }

    @TargetApi(14)
    private static int getMaxTextureEgl10() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 50915, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2]);
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        egl10.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{c.m.rm, c.m.Sn, c.m.Vl, 0, c.m.fm, 1, c.m.km}, eGLConfigArr, 1, iArr);
        if (iArr[0] == 0) {
            return 0;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLSurface eGLSurfaceEglCreatePbufferSurface = egl10.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfig, new int[]{c.m.Pm, 64, c.m.Om, 64, c.m.km});
        EGLContext eGLContextEglCreateContext = egl10.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{c.m.co, 1, c.m.km});
        egl10.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext);
        int[] iArr2 = new int[1];
        GLES10.glGetIntegerv(c.d.Yo, iArr2, 0);
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        egl10.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        egl10.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
        egl10.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
        egl10.eglTerminate(eGLDisplayEglGetDisplay);
        return iArr2[0];
    }

    @TargetApi(17)
    private static int getMaxTextureEgl14() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 50914, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        android.opengl.EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        int[] iArr = new int[2];
        EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1);
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        int[] iArr2 = new int[1];
        EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{c.m.rm, c.m.Sn, c.m.Vl, 0, c.m.sm, 4, c.m.fm, 1, c.m.km}, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (iArr2[0] == 0) {
            return 0;
        }
        android.opengl.EGLConfig eGLConfig = eGLConfigArr[0];
        android.opengl.EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfig, new int[]{c.m.Pm, 64, c.m.Om, 64, c.m.km}, 0);
        android.opengl.EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{c.m.co, 2, c.m.km}, 0);
        EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext);
        int[] iArr3 = new int[1];
        GLES20.glGetIntegerv(c.d.Yo, iArr3, 0);
        android.opengl.EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
        EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
        EGL14.eglTerminate(eGLDisplayEglGetDisplay);
        return iArr3[0];
    }

    public static int getMaxTextureSize() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 50913, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        try {
            return getMaxTextureEgl14();
        } catch (Exception e10) {
            Log.d(TAG, "getMaxTextureSize: ", e10);
            return 0;
        }
    }
}
