package com.max.mediaselector.lib.utils;

import android.annotation.TargetApi;
import android.opengl.EGL14;
import android.opengl.GLES10;
import android.opengl.GLES20;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: compiled from: PSEglUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f75553a = "EglUtils";
    public static ChangeQuickRedirect changeQuickRedirect;

    private m() {
    }

    @TargetApi(14)
    private static int a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.f34814j9, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2]);
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        egl10.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{bb.c.m.rm, bb.c.m.Sn, bb.c.m.Vl, 0, bb.c.m.fm, 1, bb.c.m.km}, eGLConfigArr, 1, iArr);
        if (iArr[0] == 0) {
            return 0;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLSurface eGLSurfaceEglCreatePbufferSurface = egl10.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfig, new int[]{bb.c.m.Pm, 64, bb.c.m.Om, 64, bb.c.m.km});
        EGLContext eGLContextEglCreateContext = egl10.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{bb.c.m.co, 1, bb.c.m.km});
        egl10.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext);
        int[] iArr2 = new int[1];
        GLES10.glGetIntegerv(bb.c.d.Yo, iArr2, 0);
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        egl10.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        egl10.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
        egl10.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
        egl10.eglTerminate(eGLDisplayEglGetDisplay);
        return iArr2[0];
    }

    @TargetApi(17)
    private static int b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.f34791i9, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        android.opengl.EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        int[] iArr = new int[2];
        EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1);
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        int[] iArr2 = new int[1];
        EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{bb.c.m.rm, bb.c.m.Sn, bb.c.m.Vl, 0, bb.c.m.sm, 4, bb.c.m.fm, 1, bb.c.m.km}, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (iArr2[0] == 0) {
            return 0;
        }
        android.opengl.EGLConfig eGLConfig = eGLConfigArr[0];
        android.opengl.EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfig, new int[]{bb.c.m.Pm, 64, bb.c.m.Om, 64, bb.c.m.km}, 0);
        android.opengl.EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{bb.c.m.co, 2, bb.c.m.km}, 0);
        EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext);
        int[] iArr3 = new int[1];
        GLES20.glGetIntegerv(bb.c.d.Yo, iArr3, 0);
        android.opengl.EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
        EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
        EGL14.eglTerminate(eGLDisplayEglGetDisplay);
        return iArr3[0];
    }

    public static int c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.f34768h9, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        try {
            return b();
        } catch (Exception e10) {
            Log.d(f75553a, "getMaxTextureSize: ", e10);
            return 0;
        }
    }
}
