package com.bytedance.realx.video;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import androidx.annotation.w0;
import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes6.dex */
public class EglBaseUtils {
    @CalledByNative
    public static EglBase createEGLBase(EGLContext eGLContext) {
        return (eGLContext == EGL14.EGL_NO_CONTEXT || eGLContext == null) ? a.g(EglBase.CONFIG_PLAIN) : a.f(eGLContext, EglBase.CONFIG_PLAIN);
    }

    @CalledByNative
    @w0(api = 17)
    public static EGLContext getCurrentContext() {
        return EGL14.eglGetCurrentContext();
    }

    @CalledByNative
    public static EglBase.Context getEGLBaseContext(EglBase eglBase) {
        if (eglBase != null) {
            return eglBase.getEglBaseContext();
        }
        return null;
    }

    @CalledByNative
    public static long getNativeContextFromEGLBaseContext(EglBase.Context context) {
        if (context != null) {
            return context.getNativeEglContext();
        }
        return 0L;
    }

    @CalledByNative
    public static long getNativeEGLContext(EGLContext eGLContext) {
        if (eGLContext == null) {
            return 0L;
        }
        return eGLContext.getNativeHandle();
    }

    @CalledByNative
    public static void releaseEGLBase(EglBase eglBase) {
        if (eglBase != null) {
            eglBase.release();
        }
    }
}
