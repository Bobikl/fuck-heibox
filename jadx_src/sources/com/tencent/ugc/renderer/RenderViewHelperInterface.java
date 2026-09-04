package com.tencent.ugc.renderer;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.videobase.videobase.TXCCloudVideoViewMethodInvoker;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::ugc")
public abstract class RenderViewHelperInterface {
    private static final String TAG = "RenderViewHelperInterface";

    /* JADX INFO: renamed from: com.tencent.ugc.renderer.RenderViewHelperInterface$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f103793a;

        static {
            int[] iArr = new int[DisplayTarget.a.values().length];
            f103793a = iArr;
            try {
                iArr[DisplayTarget.a.SURFACEVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f103793a[DisplayTarget.a.TEXTUREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f103793a[DisplayTarget.a.SURFACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f103793a[DisplayTarget.a.TXCLOUDVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface RenderViewListener {
        void onRequestRedraw(Bitmap bitmap);

        void onSurfaceChanged(Surface surface, boolean z10);

        void onSurfaceDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.SurfaceView] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.TextureView] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    public static RenderViewHelperInterface create(DisplayTarget displayTarget, RenderViewListener renderViewListener) {
        Surface surface;
        ?? textureView;
        ?? surfaceView;
        TXCloudVideoView tXCloudVideoView;
        if (displayTarget == null || displayTarget.getType() == null) {
            LiteavLog.w(TAG, "displayTarget or type is null. displayTarget=".concat(String.valueOf(displayTarget)));
            return null;
        }
        int i10 = AnonymousClass1.f103793a[displayTarget.getType().ordinal()];
        if (i10 == 1) {
            surface = null;
            textureView = 0;
            surfaceView = displayTarget.getSurfaceView();
            tXCloudVideoView = null;
        } else if (i10 != 2) {
            if (i10 == 3) {
                surface = displayTarget.getSurface();
                tXCloudVideoView = null;
            } else if (i10 != 4) {
                surface = null;
                tXCloudVideoView = null;
            } else {
                TXCloudVideoView tXCloudVideoView2 = displayTarget.getTXCloudVideoView();
                if (tXCloudVideoView2 == null) {
                    LiteavLog.w(TAG, "txCloudVideoView is null.");
                    surfaceView = 0;
                    textureView = 0;
                    tXCloudVideoView = tXCloudVideoView2;
                    surface = null;
                } else {
                    SurfaceView surfaceView2 = tXCloudVideoView2.getSurfaceView();
                    textureView = TXCCloudVideoViewMethodInvoker.getTextureViewSetByUser(tXCloudVideoView2);
                    surfaceView = surfaceView2;
                    tXCloudVideoView = tXCloudVideoView2;
                    surface = null;
                }
            }
            TXCloudVideoView tXCloudVideoView3 = tXCloudVideoView;
            textureView = tXCloudVideoView3;
            surfaceView = tXCloudVideoView3;
        } else {
            surface = null;
            tXCloudVideoView = null;
            textureView = displayTarget.getTextureView();
            surfaceView = 0;
        }
        if (surfaceView != 0) {
            return new SurfaceViewRenderHelper(surfaceView, renderViewListener);
        }
        if (textureView != 0) {
            return new TextureViewRenderHelper((TextureView) textureView, renderViewListener);
        }
        if (surface != null) {
            return new SurfaceRenderHelper(surface, renderViewListener);
        }
        if (tXCloudVideoView != null) {
            return new TextureViewRenderHelper(tXCloudVideoView, renderViewListener);
        }
        LiteavLog.w(TAG, "RenderViewHelper not created. displayTarget=".concat(String.valueOf(displayTarget)));
        return null;
    }

    public static GLConstants.GLScaleType createScaleType(int i10) {
        return GLConstants.GLScaleType.a(i10);
    }

    public abstract void checkViewAvailability();

    public abstract Matrix getTransformMatrix(int i10, int i11);

    public abstract boolean isUsingTextureView();

    public abstract void release(boolean z10);

    public abstract void updateVideoFrameInfo(GLConstants.GLScaleType gLScaleType, int i10, int i11, boolean z10);
}
