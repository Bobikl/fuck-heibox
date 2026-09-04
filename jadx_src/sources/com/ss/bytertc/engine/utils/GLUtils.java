package com.ss.bytertc.engine.utils;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes4.dex */
@w0(api = 17)
public class GLUtils {
    private static int[] defaultEGLConfAttr = {bb.c.m.Ql, 8, bb.c.m.Pl, 8, bb.c.m.Ol, 8, bb.c.m.sm, 4, bb.c.m.km};
    private static int[] ctxAttr = {bb.c.m.co, 2, bb.c.m.km};

    @p0
    public static EGLContext createEglContext(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext) {
        return EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, ctxAttr, 0);
    }

    public static EGLConfig getEglConfig(EGLDisplay eGLDisplay) {
        return getEglConfig(eGLDisplay, defaultEGLConfAttr);
    }

    public static EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
            throw new RuntimeException("eglChooseConfig failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
        }
        if (iArr2[0] <= 0) {
            throw new RuntimeException("Unable to find any matching EGL config");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        if (eGLConfig != null) {
            return eGLConfig;
        }
        throw new RuntimeException("eglChooseConfig returned null");
    }

    public static EGLDisplay getEglDisplay() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("Unable to get EGL14 display: 0x" + Integer.toHexString(EGL14.eglGetError()));
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            return eGLDisplayEglGetDisplay;
        }
        throw new RuntimeException("Unable to initialize EGL14: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    public static int loadShader(int i10, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        if (iGlCreateShader == 0) {
            return iGlCreateShader;
        }
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }
}
