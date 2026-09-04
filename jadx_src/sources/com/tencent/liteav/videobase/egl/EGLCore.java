package com.tencent.liteav.videobase.egl;

import android.opengl.EGLContext;
import android.opengl.EGLExt;
import android.view.Surface;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.base.util.m;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::video")
public class EGLCore {
    private static final long DESTROY_EGL_CORE_DELAY_TIME_MS = 100;
    private static final int MAX_EGL_CORE_COUNT = 50;
    private static final String TAG = "EGLCore";
    private e<?> mEglHelper;
    private boolean mIsOffScreen = false;
    private Object mSharedContext;
    private static final m sSequenceTaskRunner = new m();
    private static final AtomicInteger sEGLCoreCount = new AtomicInteger();

    public static EGLCore create(Object obj) {
        EGLCore eGLCore = new EGLCore();
        try {
            eGLCore.initialize(obj, null, 128, 128);
            eGLCore.makeCurrent();
            return eGLCore;
        } catch (d e10) {
            LiteavLog.e(TAG, "create EGLCore failed.", e10);
            return null;
        }
    }

    public static void destroy(EGLCore eGLCore) {
        if (eGLCore == null) {
            return;
        }
        eGLCore.unmakeCurrent();
        Runnable runnableA = c.a(eGLCore);
        if (eGLCore.mIsOffScreen) {
            sSequenceTaskRunner.b(runnableA, 100L);
        } else {
            runnableA.run();
        }
    }

    static /* synthetic */ void lambda$destroy$0(EGLCore eGLCore) {
        try {
            eGLCore.uninitialize();
            LiteavLog.i(TAG, "EGLCore destroy success. ".concat(String.valueOf(eGLCore)));
        } catch (d e10) {
            LiteavLog.e(TAG, "EGLCore destroy failed.", e10);
        }
    }

    private void uninitialize() throws d {
        e<?> eVar = this.mEglHelper;
        if (eVar != null) {
            eVar.c();
            this.mEglHelper = null;
        }
        this.mSharedContext = null;
        sEGLCoreCount.decrementAndGet();
    }

    public Object getEglContext() {
        e<?> eVar = this.mEglHelper;
        if (eVar == null) {
            return null;
        }
        return eVar.f();
    }

    public Object getSharedContext() {
        return this.mSharedContext;
    }

    public Size getSurfaceSize() {
        e<?> eVar = this.mEglHelper;
        return eVar == null ? new Size(0, 0) : eVar.e();
    }

    public void initialize(Object obj, Surface surface, int i10, int i11) throws d {
        this.mIsOffScreen = surface == null;
        if (obj == null) {
            if (LiteavSystemInfo.getSystemOSVersionInt() >= 17) {
                this.mEglHelper = b.a((EGLContext) null, surface, i10, i11);
            } else {
                this.mEglHelper = a.a((javax.microedition.khronos.egl.EGLContext) null, surface, i10, i11);
            }
        } else if (obj instanceof javax.microedition.khronos.egl.EGLContext) {
            this.mEglHelper = a.a((javax.microedition.khronos.egl.EGLContext) obj, surface, i10, i11);
        } else {
            if (LiteavSystemInfo.getSystemOSVersionInt() < 17 || !(obj instanceof EGLContext)) {
                throw new d(0, "sharedContext isn't EGLContext");
            }
            this.mEglHelper = b.a((EGLContext) obj, surface, i10, i11);
        }
        this.mSharedContext = obj;
        LiteavLog.i(TAG, "EGLCore created in thread " + Thread.currentThread().getId() + ", sharedContext: " + obj + ", Surface: " + surface + ", width: " + i10 + ", height: " + i11 + ", eglCoreCount: " + sEGLCoreCount.incrementAndGet());
    }

    public void makeCurrent() throws d {
        e<?> eVar = this.mEglHelper;
        if (eVar != null) {
            eVar.b();
        }
    }

    public void setPresentationTime(long j10) {
        e<?> eVar = this.mEglHelper;
        if (eVar == null || !(eVar instanceof b)) {
            return;
        }
        b bVar = (b) eVar;
        EGLExt.eglPresentationTimeANDROID(bVar.f100344a, bVar.f100345b, j10);
    }

    public void swapBuffers() throws d {
        e<?> eVar = this.mEglHelper;
        if (eVar != null) {
            eVar.a();
        }
    }

    public void unmakeCurrent() {
        e<?> eVar = this.mEglHelper;
        if (eVar != null) {
            eVar.d();
        }
    }
}
