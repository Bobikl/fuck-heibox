package com.bytedance.realx.video;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.memory.RXVideoFrameInterface;

/* JADX INFO: loaded from: classes6.dex */
public class SurfaceViewRenderer extends SurfaceView implements SurfaceHolder.Callback, VideoSink, RendererCommon.RendererEvents {
    private static final String TAG = "SurfaceViewRenderer";
    private final SurfaceEglRenderer eglRenderer;
    private boolean enableFixedSize;
    private float radius;
    private RendererCommon.RendererEvents rendererEvents;
    private final String resourceName;
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;
    private int surfaceHeight;
    private int surfaceWidth;
    private final RendererCommon.VideoLayoutMeasure videoLayoutMeasure;

    public SurfaceViewRenderer(Context context) {
        super(context);
        this.videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();
        String resourceName = getResourceName();
        this.resourceName = resourceName;
        SurfaceEglRenderer surfaceEglRenderer = new SurfaceEglRenderer(resourceName);
        this.eglRenderer = surfaceEglRenderer;
        getHolder().addCallback(this);
        getHolder().addCallback(surfaceEglRenderer);
        this.radius = 0.0f;
        setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.transparent)));
    }

    public SurfaceViewRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();
        String resourceName = getResourceName();
        this.resourceName = resourceName;
        SurfaceEglRenderer surfaceEglRenderer = new SurfaceEglRenderer(resourceName);
        this.eglRenderer = surfaceEglRenderer;
        getHolder().addCallback(this);
        getHolder().addCallback(surfaceEglRenderer);
        this.radius = 0.0f;
        setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.transparent)));
    }

    private String getResourceName() {
        try {
            return getResources().getResourceEntryName(getId());
        } catch (Resources.NotFoundException unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onFrameResolutionChanged$0(int i10, int i11) {
        this.rotatedFrameWidth = i10;
        this.rotatedFrameHeight = i11;
        updateSurfaceSize();
        requestLayout();
    }

    private void logD(String str) {
        RXLogging.i(TAG, this.resourceName + ": " + str);
    }

    private void postOrRun(Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    private void updateSurfaceSize() {
        ThreadUtils.checkIsOnMainThread();
        if (!this.enableFixedSize || this.rotatedFrameWidth == 0 || this.rotatedFrameHeight == 0 || getWidth() == 0 || getHeight() == 0) {
            this.surfaceHeight = 0;
            this.surfaceWidth = 0;
            getHolder().setSizeFromLayout();
            return;
        }
        float width = getWidth() / getHeight();
        int i10 = this.rotatedFrameWidth;
        int i11 = this.rotatedFrameHeight;
        if (i10 / i11 > width) {
            i10 = (int) (i11 * width);
        } else {
            i11 = (int) (i10 / width);
        }
        int iMin = Math.min(getWidth(), i10);
        int iMin2 = Math.min(getHeight(), i11);
        logD("updateSurfaceSize. Layout size: " + getWidth() + "x" + getHeight() + ", frame size: " + this.rotatedFrameWidth + "x" + this.rotatedFrameHeight + ", requested surface size: " + iMin + "x" + iMin2 + ", old surface size: " + this.surfaceWidth + "x" + this.surfaceHeight);
        if (iMin == this.surfaceWidth && iMin2 == this.surfaceHeight) {
            return;
        }
        this.surfaceWidth = iMin;
        this.surfaceHeight = iMin2;
        getHolder().setFixedSize(iMin, iMin2);
    }

    public void addFrameListener(EglRenderer.FrameListener frameListener, float f10) {
        this.eglRenderer.addFrameListener(frameListener, f10);
    }

    public void addFrameListener(EglRenderer.FrameListener frameListener, float f10, RendererCommon.GlDrawer glDrawer) {
        this.eglRenderer.addFrameListener(frameListener, f10, glDrawer);
    }

    public void clearImage() {
        this.eglRenderer.clearImage();
    }

    public void disableFpsReduction() {
        this.eglRenderer.disableFpsReduction();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void draw(Canvas canvas) {
        if (this.radius > 0.0f) {
            Path path = new Path();
            RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
            float f10 = this.radius;
            path.addRoundRect(rectF, f10, f10, Path.Direction.CCW);
            canvas.clipPath(path, Region.Op.REPLACE);
        }
        super.draw(canvas);
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents) {
        init(context, rendererEvents, EglBase.CONFIG_PLAIN, new GlRectDrawer());
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        this.rendererEvents = rendererEvents;
        this.rotatedFrameWidth = 0;
        this.rotatedFrameHeight = 0;
        this.eglRenderer.init(context, this, iArr, glDrawer);
    }

    @Override // com.bytedance.realx.video.RendererCommon.RendererEvents
    public void onFirstFrameRendered() {
        RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
        if (rendererEvents != null) {
            rendererEvents.onFirstFrameRendered();
        }
    }

    @Override // com.bytedance.realx.video.VideoSink
    public void onFrame(RXVideoFrameInterface rXVideoFrameInterface) {
        this.eglRenderer.onFrame(rXVideoFrameInterface);
    }

    @Override // com.bytedance.realx.video.RendererCommon.RendererEvents
    public void onFrameResolutionChanged(final int i10, int i11, int i12) {
        RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
        if (rendererEvents != null) {
            rendererEvents.onFrameResolutionChanged(i10, i11, i12);
        }
        final int i13 = (i12 == 0 || i12 == 180) ? i10 : i11;
        if (i12 == 0 || i12 == 180) {
            i10 = i11;
        }
        postOrRun(new Runnable() { // from class: com.bytedance.realx.video.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f42226b.lambda$onFrameResolutionChanged$0(i13, i10);
            }
        });
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ThreadUtils.checkIsOnMainThread();
        this.eglRenderer.setLayoutAspectRatio((i12 - i10) / (i13 - i11));
        updateSurfaceSize();
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int i10, int i11) {
        ThreadUtils.checkIsOnMainThread();
        Point pointMeasure = this.videoLayoutMeasure.measure(i10, i11, this.rotatedFrameWidth, this.rotatedFrameHeight);
        setMeasuredDimension(pointMeasure.x, pointMeasure.y);
        logD("onMeasure(). New size: " + pointMeasure.x + "x" + pointMeasure.y);
    }

    public void pauseVideo() {
        this.eglRenderer.pauseVideo();
    }

    public void release() {
        this.eglRenderer.release();
    }

    public void removeFrameListener(EglRenderer.FrameListener frameListener) {
        this.eglRenderer.removeFrameListener(frameListener);
    }

    public void setEnableHardwareScaler(boolean z10) {
        ThreadUtils.checkIsOnMainThread();
        this.enableFixedSize = z10;
        updateSurfaceSize();
    }

    public void setFpsReduction(float f10) {
        this.eglRenderer.setFpsReduction(f10);
    }

    public void setMirror(boolean z10) {
        this.eglRenderer.setMirror(z10);
    }

    public void setRadius(float f10) {
        this.radius = Math.max(0.0f, f10);
    }

    public void setScalingType(RendererCommon.ScalingType scalingType) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType);
        requestLayout();
        this.eglRenderer.setRenderModel(scalingType);
    }

    public void setScalingType(RendererCommon.ScalingType scalingType, RendererCommon.ScalingType scalingType2) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType, scalingType2);
        requestLayout();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        this.surfaceHeight = 0;
        this.surfaceWidth = 0;
        updateSurfaceSize();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }
}
