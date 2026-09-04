package com.tencent.custom.customcapture.render;

import android.annotation.TargetApi;
import android.opengl.EGLContext;
import android.view.Surface;

/* JADX INFO: loaded from: classes4.dex */
public class EglCore {
    private EGLHelper mEglHelper;

    public EglCore(int i10, int i11) {
        this((EGLContext) null, i10, i11);
    }

    public EglCore(EGLContext eGLContext, int i10, int i11) {
        this.mEglHelper = EGL14Helper.createEGLSurface(null, eGLContext, null, i10, i11);
    }

    public EglCore(EGLContext eGLContext, Surface surface) {
        this.mEglHelper = EGL14Helper.createEGLSurface(null, eGLContext, surface, 0, 0);
    }

    public EglCore(Surface surface) {
        this((EGLContext) null, surface);
    }

    public EglCore(javax.microedition.khronos.egl.EGLContext eGLContext, int i10, int i11) {
        this.mEglHelper = EGL10Helper.createEGLSurface(null, eGLContext, null, i10, i11);
    }

    public EglCore(javax.microedition.khronos.egl.EGLContext eGLContext, Surface surface) {
        this.mEglHelper = EGL10Helper.createEGLSurface(null, eGLContext, surface, 0, 0);
    }

    public void destroy() {
        this.mEglHelper.destroy();
        this.mEglHelper = null;
    }

    public Object getEglContext() {
        return this.mEglHelper.getContext();
    }

    public EGLHelper getmEglHelper() {
        return this.mEglHelper;
    }

    public void makeCurrent() {
        EGLHelper eGLHelper = this.mEglHelper;
        if (eGLHelper == null) {
            return;
        }
        eGLHelper.makeCurrent();
    }

    @TargetApi(18)
    public void setPresentationTime(long j10) {
        EGLHelper eGLHelper = this.mEglHelper;
        if (eGLHelper instanceof EGL14Helper) {
            ((EGL14Helper) eGLHelper).setPresentationTime(j10);
        }
    }

    public void swapBuffer() {
        this.mEglHelper.swapBuffers();
    }

    public void unmakeCurrent() {
        this.mEglHelper.unmakeCurrent();
    }
}
