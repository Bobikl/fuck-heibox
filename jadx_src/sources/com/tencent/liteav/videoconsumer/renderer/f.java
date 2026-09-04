package com.tencent.liteav.videoconsumer.renderer;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.rtmp.ui.TXCloudVideoView;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends RenderViewHelperInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f100585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CustomHandler f100586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RenderViewHelperInterface.RenderViewListener f100587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SurfaceView f100588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Size f100589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Size f100590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private GLConstants.GLScaleType f100591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f100592h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SurfaceHolder.Callback f100593i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View.OnLayoutChangeListener f100594j;

    public f(SurfaceView surfaceView, RenderViewHelperInterface.RenderViewListener renderViewListener) {
        String str = "SurfaceViewRenderHelper_" + hashCode();
        this.f100585a = str;
        CustomHandler customHandler = new CustomHandler(Looper.getMainLooper());
        this.f100586b = customHandler;
        this.f100589e = new Size();
        this.f100590f = new Size();
        this.f100591g = null;
        this.f100592h = false;
        this.f100593i = new SurfaceHolder.Callback() { // from class: com.tencent.liteav.videoconsumer.renderer.f.1
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
                if (surfaceHolder != null) {
                    LiteavLog.i(f.this.f100585a, "surfaceChanged,format=%d,Size(%dx%d)", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
                    f.this.a(surfaceHolder.getSurface());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                if (surfaceHolder != null) {
                    Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
                    LiteavLog.i(f.this.f100585a, "surfaceCreated,Size(%dx%d)", Integer.valueOf(surfaceFrame.width()), Integer.valueOf(surfaceFrame.height()));
                    f.this.a(surfaceHolder.getSurface());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                LiteavLog.i(f.this.f100585a, "surfaceDestroyed");
                f.this.a();
            }
        };
        this.f100594j = new View.OnLayoutChangeListener() { // from class: com.tencent.liteav.videoconsumer.renderer.f.2
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                if (f.this.f100592h) {
                    if (f.this.f100590f.width == view.getWidth() && f.this.f100590f.height == view.getHeight()) {
                        return;
                    }
                    f.this.b();
                }
            }
        };
        this.f100587c = renderViewListener;
        if (surfaceView == null) {
            LiteavLog.w(str, "surfaceView is null.");
        } else {
            this.f100588d = surfaceView;
            customHandler.post(g.a(this, surfaceView));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        RenderViewHelperInterface.RenderViewListener renderViewListener = this.f100587c;
        if (renderViewListener != null) {
            renderViewListener.onSurfaceDestroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Surface surface) {
        RenderViewHelperInterface.RenderViewListener renderViewListener = this.f100587c;
        if (renderViewListener != null) {
            renderViewListener.onSurfaceChanged(surface, false);
        }
    }

    static /* synthetic */ void a(f fVar, SurfaceView surfaceView) {
        SurfaceHolder holder = surfaceView.getHolder();
        if (holder.getSurface().isValid()) {
            Surface surface = holder.getSurface();
            Rect surfaceFrame = holder.getSurfaceFrame();
            LiteavLog.i(fVar.f100585a, "construct,surface=%s,Size(%dx%d)", surface, Integer.valueOf(surfaceFrame.width()), Integer.valueOf(surfaceFrame.height()));
            fVar.a(surface);
        } else {
            LiteavLog.i(fVar.f100585a, "construct,surfaceView not valid.");
        }
        holder.addCallback(fVar.f100593i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    public void b() {
        double d10;
        SurfaceView surfaceView = this.f100588d;
        if (surfaceView == null || !(surfaceView.getParent() instanceof TXCloudVideoView)) {
            return;
        }
        TXCloudVideoView tXCloudVideoView = (TXCloudVideoView) this.f100588d.getParent();
        Size size = new Size(tXCloudVideoView.getWidth(), tXCloudVideoView.getHeight());
        if (this.f100589e.isValid() && size.isValid()) {
            if (!this.f100590f.isValid()) {
                tXCloudVideoView.addOnLayoutChangeListener(this.f100594j);
            }
            this.f100590f.set(size);
            double dAspectRatio = size.aspectRatio();
            double dAspectRatio2 = this.f100589e.aspectRatio();
            double d11 = 1.0d;
            if (dAspectRatio2 < dAspectRatio) {
                GLConstants.GLScaleType gLScaleType = this.f100591g;
                if (gLScaleType == GLConstants.GLScaleType.FIT_CENTER) {
                    double d12 = dAspectRatio2 / dAspectRatio;
                    d10 = 1.0d;
                    d11 = d12;
                } else if (gLScaleType == GLConstants.GLScaleType.CENTER_CROP) {
                    d10 = dAspectRatio / dAspectRatio2;
                } else {
                    d10 = 1.0d;
                }
            } else {
                GLConstants.GLScaleType gLScaleType2 = this.f100591g;
                if (gLScaleType2 == GLConstants.GLScaleType.FIT_CENTER) {
                    d10 = dAspectRatio / dAspectRatio2;
                } else if (gLScaleType2 == GLConstants.GLScaleType.CENTER_CROP) {
                    double d13 = dAspectRatio2 / dAspectRatio;
                    d10 = 1.0d;
                    d11 = d13;
                } else {
                    d10 = 1.0d;
                }
            }
            ViewGroup.LayoutParams layoutParams = this.f100588d.getLayoutParams();
            layoutParams.width = (int) (((double) size.getWidth()) * d11);
            layoutParams.height = (int) (((double) size.getHeight()) * d10);
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
            }
            this.f100588d.setLayoutParams(layoutParams);
            LiteavLog.i(this.f100585a, "adjust view size to %d*%d", Integer.valueOf(layoutParams.width), Integer.valueOf(layoutParams.height));
        }
    }

    static /* synthetic */ void b(f fVar) {
        SurfaceView surfaceView = fVar.f100588d;
        if (surfaceView == null) {
            LiteavLog.i(fVar.f100585a, "view is not available when surfaceView is null");
            return;
        }
        Surface surface = surfaceView.getHolder().getSurface();
        boolean z10 = surface != null && surface.isValid();
        if (z10 && fVar.f100588d.getWidth() != 0 && fVar.f100588d.getHeight() != 0 && fVar.f100588d.isShown()) {
            return;
        }
        String str = fVar.f100585a;
        SurfaceView surfaceView2 = fVar.f100588d;
        LiteavLog.i(str, "%s is not available when isShown:%b, surface isValid:%b", surfaceView2, Boolean.valueOf(surfaceView2.isShown()), Boolean.valueOf(z10));
    }

    static /* synthetic */ void c(f fVar) {
        LiteavLog.i(fVar.f100585a, "release,mSurfaceView=" + fVar.f100588d);
        if (fVar.f100588d == null) {
            return;
        }
        fVar.a();
        fVar.f100588d.getHolder().removeCallback(fVar.f100593i);
        fVar.f100588d = null;
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final void checkViewAvailability() {
        this.f100586b.post(i.a(this));
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
        this.f100586b.post(h.a(this));
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final void updateVideoFrameInfo(GLConstants.GLScaleType gLScaleType, int i10, int i11, boolean z10) {
        if (this.f100591g == gLScaleType && this.f100592h == z10) {
            Size size = this.f100589e;
            if (size.width == i10 && size.height == i11) {
                return;
            }
        }
        this.f100592h = z10;
        this.f100591g = gLScaleType;
        this.f100589e.set(i10, i11);
        if (this.f100592h) {
            this.f100586b.runOrPost(j.a(this));
        }
    }
}
