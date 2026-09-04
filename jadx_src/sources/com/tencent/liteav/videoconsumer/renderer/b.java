package com.tencent.liteav.videoconsumer.renderer;

import android.graphics.Matrix;
import android.os.Looper;
import android.view.Surface;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends RenderViewHelperInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f100577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CustomHandler f100578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RenderViewHelperInterface.RenderViewListener f100579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Surface f100580d;

    public b(Surface surface, RenderViewHelperInterface.RenderViewListener renderViewListener) {
        String str = "SurfaceRenderHelper_" + hashCode();
        this.f100577a = str;
        CustomHandler customHandler = new CustomHandler(Looper.getMainLooper());
        this.f100578b = customHandler;
        this.f100579c = renderViewListener;
        if (surface == null) {
            LiteavLog.w(str, "surface is null.");
        } else {
            this.f100580d = surface;
            customHandler.post(c.a(this, surface));
        }
    }

    static /* synthetic */ void a(b bVar) {
        Surface surface = bVar.f100580d;
        if (surface == null) {
            LiteavLog.i(bVar.f100577a, "view is not available when surface is null");
        } else {
            if (surface.isValid()) {
                return;
            }
            LiteavLog.i(bVar.f100577a, "view is not available when %s is not valid", bVar.f100580d);
        }
    }

    static /* synthetic */ void a(b bVar, Surface surface) {
        LiteavLog.i(bVar.f100577a, "construct,surface=".concat(String.valueOf(surface)));
        RenderViewHelperInterface.RenderViewListener renderViewListener = bVar.f100579c;
        if (renderViewListener != null) {
            renderViewListener.onSurfaceChanged(surface, false);
        }
    }

    static /* synthetic */ void b(b bVar) {
        LiteavLog.i(bVar.f100577a, "release,mSurface=" + bVar.f100580d);
        if (bVar.f100580d == null) {
            return;
        }
        RenderViewHelperInterface.RenderViewListener renderViewListener = bVar.f100579c;
        if (renderViewListener != null) {
            renderViewListener.onSurfaceDestroy();
        }
        bVar.f100580d = null;
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final void checkViewAvailability() {
        this.f100578b.post(e.a(this));
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final void enableNonUniformScale(boolean z10) {
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final Matrix getTransformMatrix(int i10, int i11) {
        Matrix matrix = new Matrix();
        matrix.postScale(1.0f, -1.0f, i10 / 2.0f, i11 / 2.0f);
        return matrix;
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final boolean isUsingTextureView() {
        return false;
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final void release(boolean z10) {
        this.f100578b.post(d.a(this));
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final void updateVideoFrameInfo(GLConstants.GLScaleType gLScaleType, int i10, int i11, boolean z10) {
    }
}
