package com.bytedance.realx.video;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.p0;
import com.bytedance.realx.base.RXLogging;

/* JADX INFO: loaded from: classes6.dex */
@TargetApi(18)
public class EglBase14 implements EglBase {
    private static final int EGLExt_SDK_VERSION = 18;
    private static final String TAG = "EglBase14";

    @p0
    private EGLConfig eglConfig;
    private EGLContext eglContext;
    private EGLDisplay eglDisplay;
    private EGLSurface eglSurface = EGL14.EGL_NO_SURFACE;
    private static final int CURRENT_SDK_VERSION = Build.VERSION.SDK_INT;
    private static int egl14ContextCount = 0;

    public static class Context implements EglBase.Context {
        private final EGLContext egl14Context;

        public Context(EGLContext eGLContext) {
            this.egl14Context = eGLContext;
        }

        @Override // com.bytedance.realx.video.EglBase.Context
        public EGLContext getEgl14Context() {
            return this.egl14Context;
        }

        @Override // com.bytedance.realx.video.EglBase.Context
        @TargetApi(21)
        public long getNativeEglContext() {
            return EglBase14.CURRENT_SDK_VERSION >= 21 ? this.egl14Context.getNativeHandle() : this.egl14Context.getHandle();
        }
    }

    public EglBase14(Context context, int[] iArr) {
        EGLDisplay eglDisplay = getEglDisplay();
        this.eglDisplay = eglDisplay;
        EGLConfig eglConfig = getEglConfig(eglDisplay, iArr);
        this.eglConfig = eglConfig;
        this.eglContext = createEglContext(context, this.eglDisplay, eglConfig);
    }

    private void checkIsNotReleased() {
        if (this.eglDisplay == EGL14.EGL_NO_DISPLAY || this.eglContext == EGL14.EGL_NO_CONTEXT || this.eglConfig == null) {
            Log.e(TAG, "This object has been released");
            throw new RuntimeException("This object has been released");
        }
    }

    private static EGLContext createEglContext(@p0 Context context, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        EGLContext eGLContextEglCreateContext;
        if (context != null && context.egl14Context == EGL14.EGL_NO_CONTEXT) {
            Log.e(TAG, "Invalid sharedContext");
            throw new RuntimeException("Invalid sharedContext");
        }
        int[] iArr = {bb.c.m.co, 2, bb.c.m.km};
        EGLContext eGLContext = (context == null || context.egl14Context == null) ? EGL14.EGL_NO_CONTEXT : context.egl14Context;
        synchronized (EglBase.lock) {
            eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr, 0);
        }
        if (eGLContextEglCreateContext != EGL14.EGL_NO_CONTEXT) {
            egl14ContextCount++;
            RXLogging.w(TAG, "EGL14 context create. current count is:" + egl14ContextCount);
            return eGLContextEglCreateContext;
        }
        Log.e(TAG, "Failed to create EGL context: 0x" + Integer.toHexString(EGL14.eglGetError()));
        throw new RuntimeException("Failed to create EGL context: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    private void createSurfaceInternal(Object obj) {
        if (!(obj instanceof Surface) && !(obj instanceof SurfaceTexture)) {
            Log.e(TAG, "Input must be either a Surface or SurfaceTexture");
            throw new IllegalStateException("Input must be either a Surface or SurfaceTexture");
        }
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            Log.e(TAG, "Already has an EGLSurface");
            throw new RuntimeException("Already has an EGLSurface");
        }
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, obj, new int[]{bb.c.m.km}, 0);
        this.eglSurface = eGLSurfaceEglCreateWindowSurface;
        if (eGLSurfaceEglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
            return;
        }
        Log.e(TAG, "Failed to create window surface: 0x" + Integer.toHexString(EGL14.eglGetError()));
        throw new RuntimeException("Failed to create window surface: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    private void eglDetachCurrent() {
        EGLDisplay eGLDisplay = this.eglDisplay;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
            return;
        }
        Log.e(TAG, "eglDetachCurrent failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
        throw new RuntimeException("eglDetachCurrent failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    private void eglMakeCurrent() {
        EGLDisplay eGLDisplay = this.eglDisplay;
        EGLSurface eGLSurface = this.eglSurface;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
            return;
        }
        Log.e(TAG, "eglMakeCurrent failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
        throw new RuntimeException("eglMakeCurrent failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    private static EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) {
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

    private static EGLDisplay getEglDisplay() {
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

    public static boolean isEGL14Supported() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SDK version: ");
        int i10 = CURRENT_SDK_VERSION;
        sb2.append(i10);
        sb2.append(". isEGL14Supported: ");
        sb2.append(i10 >= 18);
        Log.d(TAG, sb2.toString());
        return i10 >= 18;
    }

    @Override // com.bytedance.realx.video.EglBase
    public void createDummyPbufferSurface() {
        createPbufferSurface(1, 1);
    }

    @Override // com.bytedance.realx.video.EglBase
    public void createPbufferSurface(int i10, int i11) {
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            Log.e(TAG, "Already has an EGLSurface");
            throw new RuntimeException("Already has an EGLSurface");
        }
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.eglDisplay, this.eglConfig, new int[]{bb.c.m.Pm, i10, bb.c.m.Om, i11, bb.c.m.km}, 0);
        this.eglSurface = eGLSurfaceEglCreatePbufferSurface;
        if (eGLSurfaceEglCreatePbufferSurface != EGL14.EGL_NO_SURFACE) {
            return;
        }
        Log.e(TAG, "Failed to create pixel buffer surface with size " + i10 + "x" + i11 + ": 0x" + Integer.toHexString(EGL14.eglGetError()));
        throw new RuntimeException("Failed to create pixel buffer surface with size " + i10 + "x" + i11 + ": 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    @Override // com.bytedance.realx.video.EglBase
    public void createSurface(SurfaceTexture surfaceTexture) {
        createSurfaceInternal(surfaceTexture);
    }

    @Override // com.bytedance.realx.video.EglBase
    public void createSurface(Surface surface) {
        createSurfaceInternal(surface);
    }

    @Override // com.bytedance.realx.video.EglBase
    public void detachCurrent() {
        if (!EglBase.EglLock.enableEglLock) {
            eglDetachCurrent();
            return;
        }
        synchronized (EglBase.lock) {
            eglDetachCurrent();
        }
    }

    @Override // com.bytedance.realx.video.EglBase
    public Context getEglBaseContext() {
        return new Context(this.eglContext);
    }

    @Override // com.bytedance.realx.video.EglBase
    public boolean hasSurface() {
        return this.eglSurface != EGL14.EGL_NO_SURFACE;
    }

    @Override // com.bytedance.realx.video.EglBase
    public void makeCurrent() {
        checkIsNotReleased();
        if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
            Log.e(TAG, "No EGLSurface - can't make current");
            throw new RuntimeException("No EGLSurface - can't make current");
        }
        if (!EglBase.EglLock.enableEglLock) {
            eglMakeCurrent();
            return;
        }
        synchronized (EglBase.lock) {
            eglMakeCurrent();
        }
    }

    @Override // com.bytedance.realx.video.EglBase
    public void release() {
        checkIsNotReleased();
        releaseSurface();
        detachCurrent();
        a.i();
        EGL14.eglDestroyContext(this.eglDisplay, this.eglContext);
        a.h();
        if (!GlReleaseThreadByPass.isEglReleaseThreadByPass()) {
            EGL14.eglReleaseThread();
        }
        EGL14.eglTerminate(this.eglDisplay);
        this.eglContext = EGL14.EGL_NO_CONTEXT;
        this.eglDisplay = EGL14.EGL_NO_DISPLAY;
        this.eglConfig = null;
        egl14ContextCount--;
        RXLogging.w(TAG, "EGL14 context destroy. current count is:" + egl14ContextCount);
    }

    @Override // com.bytedance.realx.video.EglBase
    public void releaseSurface() {
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.eglDisplay, eGLSurface);
            this.eglSurface = EGL14.EGL_NO_SURFACE;
        }
    }

    @Override // com.bytedance.realx.video.EglBase
    public int surfaceHeight() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglDisplay, this.eglSurface, bb.c.m.Om, iArr, 0);
        return iArr[0];
    }

    @Override // com.bytedance.realx.video.EglBase
    public int surfaceWidth() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglDisplay, this.eglSurface, bb.c.m.Pm, iArr, 0);
        return iArr[0];
    }

    @Override // com.bytedance.realx.video.EglBase
    public void swapBuffers() {
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            Log.e(TAG, "No EGLSurface - can't swap buffers");
            throw new RuntimeException("No EGLSurface - can't swap buffers");
        }
        if (!EglBase.EglLock.enableEglLock) {
            EGL14.eglSwapBuffers(this.eglDisplay, eGLSurface);
            return;
        }
        synchronized (EglBase.lock) {
            EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
        }
    }

    @Override // com.bytedance.realx.video.EglBase
    public void swapBuffers(long j10) {
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            Log.e(TAG, "No EGLSurface - can't swap buffers");
            throw new RuntimeException("No EGLSurface - can't swap buffers");
        }
        if (!EglBase.EglLock.enableEglLock) {
            EGLExt.eglPresentationTimeANDROID(this.eglDisplay, eGLSurface, j10);
            EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
        } else {
            synchronized (EglBase.lock) {
                EGLExt.eglPresentationTimeANDROID(this.eglDisplay, this.eglSurface, j10);
                EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
            }
        }
    }
}
