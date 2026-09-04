package com.tencent.liteav.videobase.utils;

import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::video")
public class SurfaceTextureHolder implements SurfaceTexture.OnFrameAvailableListener {
    private CustomHandler mCallbackHandler;
    private SurfaceTexture.OnFrameAvailableListener mOnFrameAvailableListener;
    private Surface mSurface;
    private SurfaceTexture mSurfaceTexture;
    private final String mTag = "SurfaceTextureHolder_" + Integer.toHexString(hashCode());
    private final com.tencent.liteav.base.b.b mThrottlers = new com.tencent.liteav.base.b.b();

    public SurfaceTextureHolder(int i10, boolean z10) {
        this.mSurfaceTexture = new SurfaceTexture(i10);
        if (z10) {
            this.mSurface = new Surface(this.mSurfaceTexture);
        }
    }

    static /* synthetic */ void lambda$onFrameAvailable$0(SurfaceTextureHolder surfaceTextureHolder, SurfaceTexture surfaceTexture) {
        SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener = surfaceTextureHolder.mOnFrameAvailableListener;
        if (onFrameAvailableListener != null) {
            onFrameAvailableListener.onFrameAvailable(surfaceTexture);
        }
    }

    public Surface getSurface() {
        return this.mSurface;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.mSurfaceTexture;
    }

    public float[] getTransformMatrix(boolean z10, float f10, float f11, float f12, float f13) {
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture == null) {
            LiteavLog.e(this.mThrottlers.a("getTransformMatrix"), this.mTag, "getTransformMatrix, surface texture is released!", new Object[0]);
            return null;
        }
        float[] fArr = new float[16];
        try {
            surfaceTexture.getTransformMatrix(fArr);
        } catch (Throwable th2) {
            LiteavLog.w(this.mThrottlers.a("getTransformMatrix"), this.mTag, "updateTexImage exception: ".concat(String.valueOf(th2)), new Object[0]);
        }
        if (z10) {
            if (!com.tencent.liteav.base.util.g.a(f10, 0.0f) || !com.tencent.liteav.base.util.g.a(f11, 0.0f)) {
                Matrix.translateM(fArr, 0, f10, f11, 0.0f);
            }
            if (!com.tencent.liteav.base.util.g.a(f12, 1.0f) || !com.tencent.liteav.base.util.g.a(f13, 1.0f)) {
                Matrix.scaleM(fArr, 0, f12, f13, 1.0f);
            }
        }
        return fArr;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        CustomHandler customHandler = this.mCallbackHandler;
        if (customHandler != null) {
            customHandler.runOrPost(g.a(this, surfaceTexture));
        }
    }

    public void release() {
        Surface surface = this.mSurface;
        if (surface != null) {
            surface.release();
            this.mSurface = null;
        }
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.mSurfaceTexture = null;
        }
    }

    public void setDefaultBufferSize(int i10, int i11) {
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture == null) {
            LiteavLog.e(this.mThrottlers.a("setDefaultBufferSize"), this.mTag, "setDefaultBufferSize, surface texture is released!", new Object[0]);
        } else {
            surfaceTexture.setDefaultBufferSize(i10, i11);
        }
    }

    public void setOnFrameAvailableListener(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, Handler handler) {
        if (this.mSurfaceTexture == null) {
            LiteavLog.e(this.mThrottlers.a("setOnFrameAvailableListener"), this.mTag, "setOnFrameAvailableListener, surface texture is released!", new Object[0]);
            return;
        }
        this.mCallbackHandler = new CustomHandler(handler != null ? handler.getLooper() : Looper.getMainLooper());
        this.mOnFrameAvailableListener = onFrameAvailableListener;
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 21) {
            this.mSurfaceTexture.setOnFrameAvailableListener(this, this.mCallbackHandler);
        } else {
            this.mSurfaceTexture.setOnFrameAvailableListener(this);
        }
    }

    public void updateTexImage() {
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture == null) {
            LiteavLog.e(this.mThrottlers.a("updateTexImage"), this.mTag, "updateTexImage, surface texture is released!", new Object[0]);
            return;
        }
        try {
            surfaceTexture.updateTexImage();
        } catch (Throwable th2) {
            LiteavLog.w(this.mThrottlers.a("updateTexImage"), this.mTag, "updateTexImage exception: ".concat(String.valueOf(th2)), new Object[0]);
        }
    }
}
