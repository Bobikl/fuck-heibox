package com.bytedance.realx.video;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.view.Surface;

/* JADX INFO: loaded from: classes6.dex */
public interface EglBase {
    public static final int EGL_OPENGL_ES2_BIT = 4;
    public static final int EGL_RECORDABLE_ANDROID = 12610;
    public static final Object lock = new Object();
    public static final int[] CONFIG_PLAIN = {bb.c.m.Ql, 8, bb.c.m.Pl, 8, bb.c.m.Ol, 8, bb.c.m.sm, 4, bb.c.m.km};
    public static final int[] CONFIG_RGBA = {bb.c.m.Ql, 8, bb.c.m.Pl, 8, bb.c.m.Ol, 8, bb.c.m.Nl, 8, bb.c.m.sm, 4, bb.c.m.km};
    public static final int[] CONFIG_PIXEL_BUFFER = {bb.c.m.Ql, 8, bb.c.m.Pl, 8, bb.c.m.Ol, 8, bb.c.m.sm, 4, bb.c.m.fm, 1, bb.c.m.km};
    public static final int[] CONFIG_PIXEL_RGBA_BUFFER = {bb.c.m.Ql, 8, bb.c.m.Pl, 8, bb.c.m.Ol, 8, bb.c.m.Nl, 8, bb.c.m.sm, 4, bb.c.m.fm, 1, bb.c.m.km};
    public static final int[] CONFIG_RECORDABLE = {bb.c.m.Ql, 8, bb.c.m.Pl, 8, bb.c.m.Ol, 8, bb.c.m.Nl, 8, bb.c.m.sm, 4, 12610, 1, bb.c.m.km};

    public interface Context {
        public static final long NO_CONTEXT = 0;

        EGLContext getEgl14Context();

        long getNativeEglContext();
    }

    public interface EglContextChecker {
        void EglContextDestoryEnd();

        void EglContextDestoryStart();
    }

    public static class EglLock {
        public static boolean enableEglLock = true;
    }

    void createDummyPbufferSurface();

    void createPbufferSurface(int i10, int i11);

    void createSurface(SurfaceTexture surfaceTexture);

    void createSurface(Surface surface);

    void detachCurrent();

    Context getEglBaseContext();

    boolean hasSurface();

    void makeCurrent();

    void release();

    void releaseSurface();

    int surfaceHeight();

    int surfaceWidth();

    void swapBuffers();

    void swapBuffers(long j10);
}
