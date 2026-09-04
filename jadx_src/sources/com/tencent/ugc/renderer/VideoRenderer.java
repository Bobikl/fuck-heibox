package com.tencent.ugc.renderer;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import android.view.TextureView;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.ugc.videobase.base.TakeSnapshotListener;
import com.tencent.ugc.videobase.egl.EGLCore;
import com.tencent.ugc.videobase.egl.EGLException;
import com.tencent.ugc.videobase.frame.FrameMetaData;
import com.tencent.ugc.videobase.frame.GLFrameBuffer;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.frame.PixelFrameRenderer;
import com.tencent.ugc.videobase.utils.BitmapUtils;
import com.tencent.ugc.videobase.utils.MemoryAllocator;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import com.tencent.ugc.videobase.utils.RingFrameQueue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class VideoRenderer extends VideoRenderInterface implements RenderViewHelperInterface.RenderViewListener {
    private static final int DESTROY_TIMEOUT_MS = 2000;
    private static final int RENDER_QUEUE_MAX_SIZE = 1;
    private final Size mCaptureRealFrameSize;
    private final com.tencent.liteav.base.b.a mCheckViewStatusThrottler;
    private DisplayTarget mDisplayTarget;
    private EGLCore mEGLCore;
    private final GLFrameBuffer mGLFrameBuffer;
    private GLTexturePool mGLTexturePool;
    private boolean mIsHDR;
    private boolean mIsHorizontalMirror;
    private boolean mIsNeedReleaseSurface;
    private boolean mIsReceivedFirstFrame;
    private boolean mIsRenderViewChanged;
    private volatile boolean mIsStarted;
    private boolean mIsVerticalMirror;
    private final Size mLastSurfaceSize;
    private Bitmap mPendingRedrawBitmap;
    private List<PointF> mPerspectiveCorrectionDstPoints;
    private List<PointF> mPerspectiveCorrectionSrcPoints;
    private PixelFrameRenderer mPixelFrameRender;
    private PostProcessor mPostProcessor;
    private final RingFrameQueue mRenderFrameQueue;
    private final CustomHandler mRenderHandler;
    private com.tencent.liteav.base.util.l mRenderRotation;
    private RenderViewHelperInterface mRenderViewHelper;
    private GLConstants.GLScaleType mScaleType;
    private final com.tencent.liteav.base.util.m mSequenceTaskRunner;
    private Object mSharedContext;
    private TakeSnapshotListener mSnapshotListener;
    private final com.tencent.liteav.base.util.m mSnapshotTaskRunner;
    private Surface mSurface;
    private final String mTAG;
    private final com.tencent.liteav.base.b.b mThrottlers;
    private final Handler mUIHandler;
    private VideoRenderListener mVideoRenderListener;
    private final Size mVideoSizeWithRenderParams;

    public VideoRenderer(Looper looper) {
        this.mTAG = "VideoRenderer_" + hashCode();
        this.mUIHandler = new Handler(Looper.getMainLooper());
        this.mSnapshotTaskRunner = new com.tencent.liteav.base.util.m(5);
        this.mThrottlers = new com.tencent.liteav.base.b.b();
        this.mLastSurfaceSize = new Size();
        this.mSurface = null;
        this.mIsNeedReleaseSurface = false;
        this.mEGLCore = null;
        this.mGLFrameBuffer = new GLFrameBuffer();
        this.mRenderFrameQueue = new RingFrameQueue(1);
        this.mScaleType = GLConstants.GLScaleType.CENTER_CROP;
        this.mRenderRotation = com.tencent.liteav.base.util.l.NORMAL;
        this.mIsHorizontalMirror = false;
        this.mIsVerticalMirror = false;
        this.mCaptureRealFrameSize = new Size();
        this.mIsStarted = false;
        this.mIsReceivedFirstFrame = false;
        this.mIsHDR = false;
        this.mVideoSizeWithRenderParams = new Size();
        this.mIsRenderViewChanged = false;
        this.mCheckViewStatusThrottler = new com.tencent.liteav.base.b.a(5000L);
        this.mRenderHandler = new CustomHandler(looper);
        this.mSequenceTaskRunner = null;
    }

    public VideoRenderer(com.tencent.liteav.base.util.m mVar) {
        this.mTAG = "VideoRenderer_" + hashCode();
        this.mUIHandler = new Handler(Looper.getMainLooper());
        this.mSnapshotTaskRunner = new com.tencent.liteav.base.util.m(5);
        this.mThrottlers = new com.tencent.liteav.base.b.b();
        this.mLastSurfaceSize = new Size();
        this.mSurface = null;
        this.mIsNeedReleaseSurface = false;
        this.mEGLCore = null;
        this.mGLFrameBuffer = new GLFrameBuffer();
        this.mRenderFrameQueue = new RingFrameQueue(1);
        this.mScaleType = GLConstants.GLScaleType.CENTER_CROP;
        this.mRenderRotation = com.tencent.liteav.base.util.l.NORMAL;
        this.mIsHorizontalMirror = false;
        this.mIsVerticalMirror = false;
        this.mCaptureRealFrameSize = new Size();
        this.mIsStarted = false;
        this.mIsReceivedFirstFrame = false;
        this.mIsHDR = false;
        this.mVideoSizeWithRenderParams = new Size();
        this.mIsRenderViewChanged = false;
        this.mCheckViewStatusThrottler = new com.tencent.liteav.base.b.a(5000L);
        this.mRenderHandler = null;
        this.mSequenceTaskRunner = mVar;
    }

    private void applyRenderParamsToPixelFrame(PixelFrame pixelFrame, boolean z10, boolean z11, com.tencent.liteav.base.util.l lVar) {
        pixelFrame.setRotation(com.tencent.liteav.base.util.l.a((pixelFrame.getRotation().mValue + lVar.mValue) % 360));
        if (z10) {
            pixelFrame.setMirrorHorizontal(!pixelFrame.isMirrorHorizontal());
        }
        if (z11) {
            pixelFrame.setMirrorVertical(!pixelFrame.isMirrorVertical());
        }
        if (lVar == com.tencent.liteav.base.util.l.ROTATION_90 || lVar == com.tencent.liteav.base.util.l.ROTATION_270) {
            int width = pixelFrame.getWidth();
            pixelFrame.setWidth(pixelFrame.getHeight());
            pixelFrame.setHeight(width);
        }
        pixelFrame.setMirrorVertical(!pixelFrame.isMirrorVertical());
        if (pixelFrame.getRotation() != com.tencent.liteav.base.util.l.NORMAL) {
            com.tencent.liteav.base.util.l rotation = pixelFrame.getRotation();
            com.tencent.liteav.base.util.l lVar2 = com.tencent.liteav.base.util.l.ROTATION_180;
            if (rotation != lVar2) {
                pixelFrame.setRotation(com.tencent.liteav.base.util.l.a((pixelFrame.getRotation().mValue + lVar2.mValue) % 360));
            }
        }
    }

    private void destroyRenderViewHelper(boolean z10) {
        RenderViewHelperInterface renderViewHelperInterface = this.mRenderViewHelper;
        if (renderViewHelperInterface != null) {
            renderViewHelperInterface.release(z10);
            this.mRenderViewHelper = null;
        }
    }

    private void initializeEGL(Object obj) {
        if (this.mSurface == null) {
            LiteavLog.e(this.mThrottlers.a("initGLNoSurface"), this.mTAG, "Initialize EGL failed because surface is null", new Object[0]);
            return;
        }
        try {
            LiteavLog.i(this.mThrottlers.a("initGL"), this.mTAG, "initializeEGL surface=" + this.mSurface + ",size=" + this.mLastSurfaceSize, new Object[0]);
            EGLCore eGLCore = new EGLCore();
            this.mEGLCore = eGLCore;
            Surface surface = this.mSurface;
            Size size = this.mLastSurfaceSize;
            eGLCore.initialize(obj, surface, size.width, size.height);
            this.mSharedContext = obj;
            this.mEGLCore.makeCurrent();
            if (this.mGLTexturePool == null) {
                this.mGLTexturePool = new GLTexturePool();
            }
            this.mGLFrameBuffer.initialize();
        } catch (EGLException e10) {
            LiteavLog.e(this.mThrottlers.a("initGLError"), this.mTAG, "initializeEGL failed.", e10);
            this.mEGLCore = null;
        }
    }

    private boolean isPerspectiveCorrectionPointsValid(List<PointF> list, List<PointF> list2) {
        return list != null && list.size() == 4 && list2 != null && list2.size() == 4;
    }

    static /* synthetic */ void lambda$onRequestRedraw$14(VideoRenderer videoRenderer) {
        PixelFrame pixelFrameCreateFromBitmap;
        Bitmap bitmapUpdatePendingRedrawBitmap = videoRenderer.updatePendingRedrawBitmap(null);
        if (bitmapUpdatePendingRedrawBitmap == null || (pixelFrameCreateFromBitmap = PixelFrame.createFromBitmap(bitmapUpdatePendingRedrawBitmap)) == null || !videoRenderer.makeCurrentForFrame(pixelFrameCreateFromBitmap)) {
            return;
        }
        videoRenderer.updateSurfaceSize();
        pixelFrameCreateFromBitmap.setMirrorVertical(true);
        videoRenderer.renderPixelFrameToSurface(pixelFrameCreateFromBitmap, videoRenderer.mScaleType);
        videoRenderer.swapBuffers();
    }

    static /* synthetic */ void lambda$onSurfaceChanged$13(VideoRenderer videoRenderer, Surface surface, boolean z10) {
        LiteavLog.i(videoRenderer.mTAG, "onSurfaceChanged surface: %s, oldSurface: %s, isNeedRelease: %b", surface, videoRenderer.mSurface, Boolean.valueOf(z10));
        videoRenderer.updateSurface(surface, z10);
    }

    static /* synthetic */ void lambda$onSurfaceDestroy$15(VideoRenderer videoRenderer) {
        LiteavLog.i(videoRenderer.mTAG, "onSurfaceDestroy " + videoRenderer.mSurface);
        videoRenderer.updateSurface(null, videoRenderer.mIsNeedReleaseSurface);
    }

    static /* synthetic */ void lambda$renderFrame$9(VideoRenderer videoRenderer) {
        PixelFrame pixelFramePoll = videoRenderer.mRenderFrameQueue.poll();
        if (pixelFramePoll == null) {
            LiteavLog.d(videoRenderer.mTAG, "renderFrameInternal pixelFrame is null!");
        } else {
            videoRenderer.renderFrameInternal(pixelFramePoll);
            pixelFramePoll.release();
        }
    }

    static /* synthetic */ void lambda$setHorizontalMirror$7(VideoRenderer videoRenderer, boolean z10) {
        if (videoRenderer.mIsHorizontalMirror != z10) {
            LiteavLog.i(videoRenderer.mTAG, "setHorizontalMirror ".concat(String.valueOf(z10)));
        }
        videoRenderer.mIsHorizontalMirror = z10;
    }

    static /* synthetic */ void lambda$setPerspectiveCorrectionPoints$4(VideoRenderer videoRenderer, List list, List list2) {
        videoRenderer.mPerspectiveCorrectionSrcPoints = list;
        videoRenderer.mPerspectiveCorrectionDstPoints = list2;
        if (!videoRenderer.isPerspectiveCorrectionPointsValid(list, list2)) {
            videoRenderer.uninitializePostProcessor();
            return;
        }
        PostProcessor postProcessor = videoRenderer.mPostProcessor;
        if (postProcessor != null) {
            postProcessor.setPerspectiveCorrectionPoints(list, list2);
        }
    }

    static /* synthetic */ void lambda$setRenderRotation$6(VideoRenderer videoRenderer, com.tencent.liteav.base.util.l lVar) {
        if (videoRenderer.mRenderRotation != lVar) {
            LiteavLog.i(videoRenderer.mTAG, "setRenderRotation ".concat(String.valueOf(lVar)));
            videoRenderer.mRenderRotation = lVar;
        }
    }

    static /* synthetic */ void lambda$setScaleType$5(VideoRenderer videoRenderer, GLConstants.GLScaleType gLScaleType) {
        if (videoRenderer.mScaleType != gLScaleType) {
            LiteavLog.i(videoRenderer.mTAG, "setScaleType ".concat(String.valueOf(gLScaleType)));
            videoRenderer.mScaleType = gLScaleType;
        }
    }

    static /* synthetic */ void lambda$setVerticalMirror$8(VideoRenderer videoRenderer, boolean z10) {
        if (videoRenderer.mIsVerticalMirror != z10) {
            LiteavLog.i(videoRenderer.mTAG, "setVerticalMirror ".concat(String.valueOf(z10)));
        }
        videoRenderer.mIsVerticalMirror = z10;
    }

    static /* synthetic */ void lambda$snapshotVideoFrameFromFrameBuffer$12(VideoRenderer videoRenderer, RenderViewHelperInterface renderViewHelperInterface, ByteBuffer byteBuffer, int i10, int i11, TakeSnapshotListener takeSnapshotListener) {
        TextureView textureView = renderViewHelperInterface instanceof TextureViewRenderHelper ? ((TextureViewRenderHelper) renderViewHelperInterface).getTextureView() : null;
        videoRenderer.mSnapshotTaskRunner.a(u.a(videoRenderer, byteBuffer, i10, i11, textureView != null ? textureView.getTransform(new Matrix()) : null, takeSnapshotListener));
    }

    static /* synthetic */ void lambda$start$0(VideoRenderer videoRenderer, VideoRenderListener videoRenderListener) {
        LiteavLog.i(videoRenderer.mTAG, "Start");
        if (videoRenderer.mIsStarted) {
            LiteavLog.w(videoRenderer.mTAG, "renderer is started!");
            return;
        }
        videoRenderer.mIsStarted = true;
        videoRenderer.mVideoRenderListener = videoRenderListener;
        Surface surface = videoRenderer.mSurface;
        if (surface != null && videoRenderListener != null) {
            videoRenderListener.onRenderSurfaceChanged(surface);
        }
        DisplayTarget displayTarget = videoRenderer.mDisplayTarget;
        if (displayTarget != null) {
            videoRenderer.setDisplayViewInternal(displayTarget, true);
        }
        videoRenderer.mCheckViewStatusThrottler.f99568a = SystemClock.elapsedRealtime();
    }

    static /* synthetic */ void lambda$stop$1(VideoRenderer videoRenderer, boolean z10) {
        Surface surface;
        LiteavLog.i(videoRenderer.mTAG, "Stop,clearLastImage=".concat(String.valueOf(z10)));
        if (!videoRenderer.mIsStarted) {
            LiteavLog.w(videoRenderer.mTAG, "renderer is not started!");
            return;
        }
        videoRenderer.mIsStarted = false;
        videoRenderer.mSnapshotListener = null;
        videoRenderer.destroyRenderViewHelper(z10);
        DisplayTarget displayTarget = videoRenderer.mDisplayTarget;
        if (displayTarget != null && z10) {
            displayTarget.hideAll();
        }
        videoRenderer.mRenderFrameQueue.evictAll();
        videoRenderer.uninitializeEGL();
        if (videoRenderer.mIsNeedReleaseSurface && (surface = videoRenderer.mSurface) != null) {
            surface.release();
            videoRenderer.mIsNeedReleaseSurface = false;
        }
        videoRenderer.mSurface = null;
        videoRenderer.mLastSurfaceSize.set(0, 0);
        videoRenderer.mCaptureRealFrameSize.set(0, 0);
        videoRenderer.mIsReceivedFirstFrame = false;
    }

    static /* synthetic */ void lambda$takeSnapshot$3(VideoRenderer videoRenderer, TakeSnapshotListener takeSnapshotListener) {
        LiteavLog.i(videoRenderer.mTAG, "takeSnapshot ");
        videoRenderer.mSnapshotListener = takeSnapshotListener;
    }

    private boolean makeCurrentForFrame(PixelFrame pixelFrame) {
        Object gLContext = pixelFrame.getGLContext();
        if (this.mEGLCore == null || !(gLContext == null || CommonUtil.equals(this.mSharedContext, gLContext))) {
            uninitializeEGL();
            initializeEGL(pixelFrame.getGLContext());
        }
        EGLCore eGLCore = this.mEGLCore;
        if (eGLCore == null) {
            return false;
        }
        try {
            eGLCore.makeCurrent();
            return true;
        } catch (EGLException e10) {
            LiteavLog.e(this.mThrottlers.a("makeCurrentForFrameError"), this.mTAG, "EGLCore makeCurrent failed.".concat(String.valueOf(e10)), new Object[0]);
            return false;
        }
    }

    private void notifyFirstFrameRenderToView(PixelFrame pixelFrame) {
        if (this.mIsRenderViewChanged) {
            this.mIsRenderViewChanged = false;
        }
    }

    private void notifyFrameRenderResult(PixelFrame pixelFrame, VideoRenderListener.RenderResult renderResult) {
        VideoRenderListener videoRenderListener = this.mVideoRenderListener;
        if (videoRenderListener != null) {
            videoRenderListener.onRenderFrame(pixelFrame, renderResult);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifySnapshotCompleted(ByteBuffer byteBuffer, int i10, int i11, Matrix matrix, TakeSnapshotListener takeSnapshotListener) {
        try {
            byteBuffer.position(0);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer);
            if (matrix == null) {
                matrix = new Matrix();
            }
            matrix.postScale(1.0f, -1.0f, i10 / 2.0f, i11 / 2.0f);
            takeSnapshotListener.onComplete(BitmapUtils.createBitmap(bitmapCreateBitmap, matrix, true));
        } catch (Throwable th2) {
            LiteavLog.e(this.mTAG, "build snapshot bitmap failed.", th2);
            takeSnapshotListener.onComplete(null);
        }
    }

    private void renderFrameInternal(PixelFrame pixelFrame) {
        RenderViewHelperInterface renderViewHelperInterface;
        this.mCaptureRealFrameSize.set(pixelFrame.getWidth(), pixelFrame.getHeight());
        FrameMetaData metaData = pixelFrame.getMetaData();
        if (metaData != null) {
            this.mRenderRotation = metaData.getRenderRotation();
            this.mIsHorizontalMirror = metaData.isRenderMirrorHorizontal();
            this.mIsVerticalMirror = metaData.isRenderMirrorVertical();
            this.mCaptureRealFrameSize.set(metaData.getCaptureRealSize());
        }
        if (this.mCheckViewStatusThrottler.a() && (renderViewHelperInterface = this.mRenderViewHelper) != null) {
            renderViewHelperInterface.checkViewAvailability();
        }
        if (this.mIsHDR) {
            RenderViewHelperInterface renderViewHelperInterface2 = this.mRenderViewHelper;
            if (renderViewHelperInterface2 != null) {
                renderViewHelperInterface2.updateVideoFrameInfo(this.mScaleType, pixelFrame.getWidth(), pixelFrame.getHeight(), this.mIsHDR);
            }
            notifyFrameRenderResult(pixelFrame, VideoRenderListener.RenderResult.RENDER_WITH_HDR);
            return;
        }
        if (this.mRenderViewHelper == null) {
            notifyFrameRenderResult(pixelFrame, VideoRenderListener.RenderResult.RENDER_WITHOUT_VIEW);
            return;
        }
        if (!makeCurrentForFrame(pixelFrame)) {
            notifyFrameRenderResult(pixelFrame, VideoRenderListener.RenderResult.RENDER_FAILED);
            LiteavLog.e(this.mThrottlers.a("makeCurrent"), this.mTAG, "make current failed.", new Object[0]);
            return;
        }
        updateSurfaceSize();
        PixelFrame pixelFrame2 = new PixelFrame(pixelFrame);
        applyRenderParamsToPixelFrame(pixelFrame2, this.mIsHorizontalMirror, this.mIsVerticalMirror, this.mRenderRotation);
        this.mVideoSizeWithRenderParams.width = pixelFrame2.getWidth();
        this.mVideoSizeWithRenderParams.height = pixelFrame2.getHeight();
        renderPixelFrameToSurface(pixelFrame2, this.mScaleType);
        if (this.mSnapshotListener != null) {
            OpenGlUtils.bindFramebuffer(36160, 0);
            Size size = this.mLastSurfaceSize;
            snapshotVideoFrameFromFrameBuffer(size.width, size.height);
        }
        if (!swapBuffers() || OpenGlUtils.getGLErrorCount() > 0) {
            notifyFrameRenderResult(pixelFrame, VideoRenderListener.RenderResult.RENDER_FAILED);
            LiteavLog.e(this.mThrottlers.a("renderFailed"), this.mTAG, "render frame failed.", new Object[0]);
        } else {
            notifyFrameRenderResult(pixelFrame, VideoRenderListener.RenderResult.RENDER_ON_VIEW);
            notifyFirstFrameRenderToView(pixelFrame);
        }
    }

    private void renderPixelFrameToSurface(PixelFrame pixelFrame, GLConstants.GLScaleType gLScaleType) {
        RenderViewHelperInterface renderViewHelperInterface = this.mRenderViewHelper;
        if (renderViewHelperInterface != null) {
            renderViewHelperInterface.updateVideoFrameInfo(this.mScaleType, this.mVideoSizeWithRenderParams.getWidth(), this.mVideoSizeWithRenderParams.getHeight(), this.mIsHDR);
        }
        if (this.mLastSurfaceSize.isValid()) {
            if (this.mRenderViewHelper instanceof TextureViewRenderHelper) {
                gLScaleType = GLConstants.GLScaleType.FILL;
            }
            if (isPerspectiveCorrectionPointsValid(this.mPerspectiveCorrectionSrcPoints, this.mPerspectiveCorrectionDstPoints)) {
                renderPixelFrameWithPostProcess(pixelFrame, gLScaleType);
            } else {
                renderPixelFrameWithoutPostProcess(pixelFrame, gLScaleType);
            }
        }
    }

    private void renderPixelFrameWithPostProcess(PixelFrame pixelFrame, GLConstants.GLScaleType gLScaleType) {
        if (this.mPostProcessor == null) {
            GLTexturePool gLTexturePool = this.mGLTexturePool;
            Size size = this.mLastSurfaceSize;
            PostProcessor postProcessor = new PostProcessor(gLTexturePool, size.width, size.height);
            this.mPostProcessor = postProcessor;
            postProcessor.setPerspectiveCorrectionPoints(this.mPerspectiveCorrectionSrcPoints, this.mPerspectiveCorrectionDstPoints);
        }
        RenderViewHelperInterface renderViewHelperInterface = this.mRenderViewHelper;
        if (renderViewHelperInterface != null) {
            PostProcessor postProcessor2 = this.mPostProcessor;
            Size size2 = this.mLastSurfaceSize;
            postProcessor2.setRenderViewTransformMatrix(renderViewHelperInterface.getTransformMatrix(size2.width, size2.height));
        }
        PostProcessor postProcessor3 = this.mPostProcessor;
        Size size3 = this.mLastSurfaceSize;
        postProcessor3.setOutputSize(size3.width, size3.height);
        this.mPostProcessor.processFrame(pixelFrame, gLScaleType);
    }

    private void renderPixelFrameWithoutPostProcess(PixelFrame pixelFrame, GLConstants.GLScaleType gLScaleType) {
        Size size = this.mLastSurfaceSize;
        OpenGlUtils.glViewport(0, 0, size.width, size.height);
        if (this.mPixelFrameRender == null) {
            LiteavLog.i(this.mTAG, "create PixelFrameRenderer, surfaceSize=" + this.mLastSurfaceSize);
            Size size2 = this.mLastSurfaceSize;
            this.mPixelFrameRender = new PixelFrameRenderer(size2.width, size2.height);
        }
        PixelFrameRenderer pixelFrameRenderer = this.mPixelFrameRender;
        Size size3 = this.mLastSurfaceSize;
        pixelFrameRenderer.setOutputSize(size3.width, size3.height);
        this.mPixelFrameRender.renderFrame(pixelFrame, gLScaleType, null);
    }

    private void runOnRenderThread(Runnable runnable) {
        com.tencent.liteav.base.util.m mVar = this.mSequenceTaskRunner;
        if (mVar != null) {
            mVar.a(runnable);
        } else if (Looper.myLooper() == this.mRenderHandler.getLooper()) {
            runnable.run();
        } else {
            this.mRenderHandler.post(runnable);
        }
    }

    private void runOnRenderThreadAndWaitDone(Runnable runnable, long j10) {
        com.tencent.liteav.base.util.m mVar = this.mSequenceTaskRunner;
        if (mVar != null) {
            mVar.a(runnable, j10);
        } else if (Looper.myLooper() == this.mRenderHandler.getLooper()) {
            runnable.run();
        } else {
            this.mRenderHandler.runAndWaitDone(runnable, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayViewInternal(DisplayTarget displayTarget, boolean z10) {
        LiteavLog.i(this.mTAG, "setDisplayViewInternal=" + displayTarget + ",clearLastImage=" + z10);
        boolean zEquals = CommonUtil.equals(this.mDisplayTarget, displayTarget);
        if (zEquals && displayTarget != null && this.mRenderViewHelper != null) {
            LiteavLog.w(this.mTAG, "view is equal and RenderViewHelper is created.");
            return;
        }
        if (!zEquals) {
            this.mIsRenderViewChanged = true;
            DisplayTarget displayTarget2 = this.mDisplayTarget;
            if (displayTarget2 != null && z10) {
                displayTarget2.hideAll();
            }
        }
        destroyRenderViewHelper(z10);
        this.mDisplayTarget = displayTarget;
        if (displayTarget == null) {
            return;
        }
        displayTarget.showAll();
        this.mRenderViewHelper = RenderViewHelperInterface.create(displayTarget, this);
    }

    private void snapshotVideoFrameFromFrameBuffer(int i10, int i11) {
        TakeSnapshotListener takeSnapshotListener = this.mSnapshotListener;
        if (takeSnapshotListener == null) {
            return;
        }
        this.mSnapshotListener = null;
        ByteBuffer byteBufferAllocateDirectBuffer = MemoryAllocator.allocateDirectBuffer(i10 * i11 * 4);
        if (byteBufferAllocateDirectBuffer == null) {
            LiteavLog.e(this.mTAG, "snapshotVideoFrameFromFrameBuffer, allocate direct buffer failed.");
            takeSnapshotListener.onComplete(null);
            return;
        }
        byteBufferAllocateDirectBuffer.order(ByteOrder.nativeOrder());
        byteBufferAllocateDirectBuffer.position(0);
        GLES20.glReadPixels(0, 0, i10, i11, bb.c.f.OB, bb.c.f.Zc, byteBufferAllocateDirectBuffer);
        this.mUIHandler.post(q.a(this, this.mRenderViewHelper, byteBufferAllocateDirectBuffer, i10, i11, takeSnapshotListener));
    }

    private boolean swapBuffers() {
        try {
            this.mEGLCore.swapBuffers();
            return true;
        } catch (EGLException e10) {
            LiteavLog.e(this.mThrottlers.a("swapBuffers"), this.mTAG, "EGLCore swapBuffers failed.".concat(String.valueOf(e10)), new Object[0]);
            return false;
        }
    }

    private void uninitializeEGL() {
        if (this.mEGLCore == null) {
            return;
        }
        com.tencent.liteav.base.b.a aVarA = this.mThrottlers.a("uninitGL");
        String str = this.mTAG;
        Object[] objArr = new Object[2];
        Surface surface = this.mSurface;
        objArr[0] = Integer.valueOf(surface != null ? surface.hashCode() : 0);
        objArr[1] = this.mLastSurfaceSize;
        LiteavLog.i(aVarA, str, "uninitializeEGL %d %s", objArr);
        try {
            this.mEGLCore.makeCurrent();
        } catch (EGLException e10) {
            LiteavLog.e(this.mThrottlers.a("makeCurrentError"), this.mTAG, "uninitializeEGL EGLCore makeCurrent failed.".concat(String.valueOf(e10)), new Object[0]);
        }
        uninitializePostProcessor();
        uninitializePixelFrameRender();
        this.mGLFrameBuffer.uninitialize();
        GLTexturePool gLTexturePool = this.mGLTexturePool;
        if (gLTexturePool != null) {
            gLTexturePool.evictAll();
            this.mGLTexturePool.destroy();
            this.mGLTexturePool = null;
        }
        EGLCore.destroy(this.mEGLCore);
        this.mEGLCore = null;
    }

    private void uninitializePixelFrameRender() {
        PixelFrameRenderer pixelFrameRenderer = this.mPixelFrameRender;
        if (pixelFrameRenderer != null) {
            pixelFrameRenderer.uninitialize();
            this.mPixelFrameRender = null;
        }
    }

    private void uninitializePostProcessor() {
        PostProcessor postProcessor = this.mPostProcessor;
        if (postProcessor == null) {
            return;
        }
        postProcessor.uninitialize();
        this.mPostProcessor = null;
    }

    private Bitmap updatePendingRedrawBitmap(Bitmap bitmap) {
        Bitmap bitmap2;
        synchronized (this) {
            bitmap2 = this.mPendingRedrawBitmap;
            this.mPendingRedrawBitmap = bitmap;
        }
        return bitmap2;
    }

    private void updateSurface(Surface surface, boolean z10) {
        VideoRenderListener videoRenderListener;
        Surface surface2;
        if (com.tencent.liteav.base.util.i.a(this.mSurface, surface)) {
            LiteavLog.d(this.mTAG, "updateSurface same surface!");
            return;
        }
        uninitializeEGL();
        if (this.mIsNeedReleaseSurface && (surface2 = this.mSurface) != null) {
            surface2.release();
        }
        if (this.mSurface != surface && (videoRenderListener = this.mVideoRenderListener) != null) {
            videoRenderListener.onRenderSurfaceChanged(surface);
        }
        this.mSurface = surface;
        if (surface == null) {
            this.mLastSurfaceSize.set(0, 0);
        }
        this.mIsNeedReleaseSurface = z10;
    }

    private void updateSurfaceSize() {
        EGLCore eGLCore = this.mEGLCore;
        if (eGLCore == null) {
            return;
        }
        Size surfaceSize = eGLCore.getSurfaceSize();
        if (this.mLastSurfaceSize.equals(surfaceSize)) {
            return;
        }
        LiteavLog.i(this.mThrottlers.a("updateSurfaceSize"), this.mTAG, "surface size changed,old size=" + this.mLastSurfaceSize + ",new size=" + surfaceSize, new Object[0]);
        this.mLastSurfaceSize.set(surfaceSize);
        VideoRenderListener videoRenderListener = this.mVideoRenderListener;
        if (videoRenderListener != null) {
            Size size = this.mLastSurfaceSize;
            videoRenderListener.onRenderTargetSizeChanged(size.width, size.height);
        }
    }

    @Override // com.tencent.ugc.renderer.RenderViewHelperInterface.RenderViewListener
    public void onRequestRedraw(Bitmap bitmap) {
        updatePendingRedrawBitmap(bitmap);
        runOnRenderThread(s.a(this));
    }

    @Override // com.tencent.ugc.renderer.RenderViewHelperInterface.RenderViewListener
    public void onSurfaceChanged(Surface surface, boolean z10) {
        runOnRenderThread(r.a(this, surface, z10));
    }

    @Override // com.tencent.ugc.renderer.RenderViewHelperInterface.RenderViewListener
    public void onSurfaceDestroy() {
        runOnRenderThreadAndWaitDone(t.a(this), 2000L);
    }

    @Override // com.tencent.ugc.renderer.VideoRenderInterface
    public void renderFrame(PixelFrame pixelFrame) {
        if (this.mIsStarted) {
            if (pixelFrame == null) {
                LiteavLog.w(this.mTAG, "renderFrame pixelFrame is null!");
                return;
            }
            if (!this.mIsReceivedFirstFrame) {
                this.mIsReceivedFirstFrame = true;
                LiteavLog.d(this.mTAG, "VideoRender receive first frame!");
            }
            if (pixelFrame.getGLContext() != null) {
                GLES20.glFinish();
            }
            this.mRenderFrameQueue.push(pixelFrame);
            runOnRenderThread(o.a(this));
        }
    }

    @Override // com.tencent.ugc.renderer.VideoRenderInterface
    public void setDisplayView(DisplayTarget displayTarget, boolean z10) {
        runOnRenderThread(w.a(this, displayTarget, z10));
    }

    public void setHDRRender(boolean z10) {
        runOnRenderThread(p.a(this, z10));
    }

    @Override // com.tencent.ugc.renderer.VideoRenderInterface
    public void setHorizontalMirror(boolean z10) {
        runOnRenderThread(ab.a(this, z10));
    }

    @Override // com.tencent.ugc.renderer.VideoRenderInterface
    public void setPerspectiveCorrectionPoints(List<PointF> list, List<PointF> list2) {
        runOnRenderThread(y.a(this, list, list2));
    }

    @Override // com.tencent.ugc.renderer.VideoRenderInterface
    public void setRenderRotation(com.tencent.liteav.base.util.l lVar) {
        runOnRenderThread(aa.a(this, lVar));
    }

    @Override // com.tencent.ugc.renderer.VideoRenderInterface
    public void setScaleType(GLConstants.GLScaleType gLScaleType) {
        runOnRenderThread(z.a(this, gLScaleType));
    }

    @Override // com.tencent.ugc.renderer.VideoRenderInterface
    public void setVerticalMirror(boolean z10) {
        runOnRenderThread(ac.a(this, z10));
    }

    @Override // com.tencent.ugc.renderer.VideoRenderInterface
    public void start(VideoRenderListener videoRenderListener) {
        runOnRenderThread(n.a(this, videoRenderListener));
    }

    @Override // com.tencent.ugc.renderer.VideoRenderInterface
    public void stop(boolean z10) {
        runOnRenderThread(v.a(this, z10));
    }

    @Override // com.tencent.ugc.renderer.VideoRenderInterface
    public void takeSnapshot(TakeSnapshotListener takeSnapshotListener) {
        runOnRenderThread(x.a(this, takeSnapshotListener));
    }
}
