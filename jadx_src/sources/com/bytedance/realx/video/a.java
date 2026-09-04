package com.bytedance.realx.video;

import androidx.annotation.p0;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: compiled from: EglBase.java */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a {
    static {
        Object obj = EglBase.lock;
    }

    public static EglBase a() {
        return c(null, EglBase.CONFIG_PLAIN);
    }

    public static EglBase b(EglBase.Context context) {
        return c(context, EglBase.CONFIG_PLAIN);
    }

    public static EglBase c(@p0 EglBase.Context context, int[] iArr) {
        return (EglBase14.isEGL14Supported() && (context == null || (context instanceof EglBase14.Context))) ? new EglBase14((EglBase14.Context) context, iArr) : new EglBase10((EglBase10.Context) context, iArr);
    }

    public static EglBase d(EGLContext eGLContext, int[] iArr) {
        return new EglBase10(new EglBase10.Context(eGLContext), iArr);
    }

    public static EglBase e(int[] iArr) {
        return new EglBase10(null, iArr);
    }

    public static EglBase f(android.opengl.EGLContext eGLContext, int[] iArr) {
        return new EglBase14(new EglBase14.Context(eGLContext), iArr);
    }

    public static EglBase g(int[] iArr) {
        return new EglBase14(null, iArr);
    }

    public static void h() {
        EglBaseCheckerHelper.EglContextDestoryEnd();
    }

    public static void i() {
        EglBaseCheckerHelper.EglContextDestoryStart();
    }

    public static void j(EglBase.EglContextChecker eglContextChecker) {
        EglBaseCheckerHelper.setEglContextChecker(eglContextChecker);
    }
}
