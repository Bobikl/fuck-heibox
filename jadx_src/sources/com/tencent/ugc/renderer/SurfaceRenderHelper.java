package com.tencent.ugc.renderer;

import android.graphics.Matrix;
import android.os.Looper;
import android.view.Surface;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;

/* JADX INFO: loaded from: classes4.dex */
public class SurfaceRenderHelper extends RenderViewHelperInterface {
    private final RenderViewHelperInterface.RenderViewListener mListener;
    private Surface mSurface;
    private final String mTAG;
    private final CustomHandler mUIHandler;

    public SurfaceRenderHelper(Surface surface, RenderViewHelperInterface.RenderViewListener renderViewListener) {
        String str = "SurfaceRenderHelper_" + hashCode();
        this.mTAG = str;
        CustomHandler customHandler = new CustomHandler(Looper.getMainLooper());
        this.mUIHandler = customHandler;
        this.mListener = renderViewListener;
        if (surface == null) {
            LiteavLog.w(str, "surface is null.");
        } else {
            this.mSurface = surface;
            customHandler.post(a.a(this, surface));
        }
    }

    static /* synthetic */ void lambda$checkViewAvailability$2(SurfaceRenderHelper surfaceRenderHelper) {
        Surface surface = surfaceRenderHelper.mSurface;
        if (surface == null) {
            LiteavLog.i(surfaceRenderHelper.mTAG, "view is not available when surface is null");
        } else {
            if (surface.isValid()) {
                return;
            }
            LiteavLog.i(surfaceRenderHelper.mTAG, "view is not available when %s is not valid", surfaceRenderHelper.mSurface);
        }
    }

    static /* synthetic */ void lambda$new$0(SurfaceRenderHelper surfaceRenderHelper, Surface surface) {
        LiteavLog.i(surfaceRenderHelper.mTAG, "construct,surface=".concat(String.valueOf(surface)));
        RenderViewHelperInterface.RenderViewListener renderViewListener = surfaceRenderHelper.mListener;
        if (renderViewListener != null) {
            renderViewListener.onSurfaceChanged(surface, false);
        }
    }

    static /* synthetic */ void lambda$release$1(SurfaceRenderHelper surfaceRenderHelper) {
        LiteavLog.i(surfaceRenderHelper.mTAG, "release,mSurface=" + surfaceRenderHelper.mSurface);
        if (surfaceRenderHelper.mSurface == null) {
            return;
        }
        RenderViewHelperInterface.RenderViewListener renderViewListener = surfaceRenderHelper.mListener;
        if (renderViewListener != null) {
            renderViewListener.onSurfaceDestroy();
        }
        surfaceRenderHelper.mSurface = null;
    }

    @Override // com.tencent.ugc.renderer.RenderViewHelperInterface
    public void checkViewAvailability() {
        this.mUIHandler.post(c.a(this));
    }

    @Override // com.tencent.ugc.renderer.RenderViewHelperInterface
    public Matrix getTransformMatrix(int i10, int i11) {
        Matrix matrix = new Matrix();
        matrix.postScale(1.0f, -1.0f, i10 / 2.0f, i11 / 2.0f);
        return matrix;
    }

    @Override // com.tencent.ugc.renderer.RenderViewHelperInterface
    public boolean isUsingTextureView() {
        return false;
    }

    @Override // com.tencent.ugc.renderer.RenderViewHelperInterface
    public void release(boolean z10) {
        this.mUIHandler.post(b.a(this));
    }

    @Override // com.tencent.ugc.renderer.RenderViewHelperInterface
    public void updateVideoFrameInfo(GLConstants.GLScaleType gLScaleType, int i10, int i11, boolean z10) {
    }
}
