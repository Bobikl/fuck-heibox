package com.tencent.ugc;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.ugc.datereport.UGCDataReport;
import com.tencent.ugc.encoder.UGCVideoEncodeController;
import com.tencent.ugc.encoder.UGCVideoEncoderJNI;
import com.tencent.ugc.encoder.VideoEncodeParams;
import com.tencent.ugc.renderer.VideoRenderListener;
import com.tencent.ugc.renderer.VideoRenderer;
import com.tencent.ugc.videobase.common.EncodedVideoFrame;
import com.tencent.ugc.videobase.egl.EGLCore;
import com.tencent.ugc.videobase.egl.EGLException;
import com.tencent.ugc.videobase.frame.FrameMetaData;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.frame.PixelFrameRenderer;
import com.tencent.ugc.videoprocessor.SpeedProcessor;
import com.tencent.ugc.videoprocessor.VideoEffectProcessor;
import com.tencent.ugc.videoprocessor.VideoProcessManager;
import com.tencent.ugc.videoprocessor.VideoTransitionProcessor;
import com.tencent.ugc.videoprocessor.WatermarkProcessor;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public class UGCVideoProcessor {
    private static final int MSG_FORCE_PROCESS = 105;
    private static final int MSG_PAUSE = 102;
    private static final int MSG_PROCESS_FROM_SOURCE = 101;
    private static final int MSG_REFRESH = 104;
    private static final int MSG_START = 100;
    private static final int MSG_STOP = 103;
    private DisplayTarget mDisplayTarget;
    private EGLCore mEGLCore;
    private UGCFrameRateFilter mFrameRateFilter;
    private GLTexturePool mGLTexturePool;
    private boolean mInvalidate;
    private PixelFrame mLastFrameOfReadFromSource;
    private PixelFrameRenderer mPreScaleRenderer;
    private List<TXVideoEditConstants.TXAbsoluteRect> mRectList;
    private HandlerThread mRenderThread;
    private VideoRenderer mRenderer;
    private SpeedProcessor mSpeedProcessor;
    private a mStatus;
    private TXVideoEditer.TXVideoCustomProcessListener mTXVideoCustomProcessListener;
    private final UGCAVSyncer mUGCAVSyncer;
    private UGCCombineProcessor mUGCCombineProcessor;
    private UGCMediaListSource mUGCMediaListSource;
    private UGCTransitionProcessor mUGCTransitionProcessor;
    private UGCVideoEncoderJNI.UGCVideoEncoderListener mUGCVideoEncoderListener;
    private UGCVideoEncodeController mVideoEncodeController;
    private VideoEncodeParams mVideoEncodeParams;
    private VideoEncodedFrameListener mVideoEncodedFrameListener;
    private CustomHandler mVideoProcessHandler;
    private VideoProcessListener mVideoProcessListener;
    private final VideoProcessManager mVideoProcessManager;
    private final String mTag = "UGCVideoProcessor_" + hashCode();
    private final com.tencent.liteav.base.b.b mThrottlers = new com.tencent.liteav.base.b.b();
    private boolean mIsInit = false;
    private int mTransitionType = -1;
    private long mFinalPts = -1;
    private GLConstants.GLScaleType mScaleType = GLConstants.GLScaleType.FIT_CENTER;
    private com.tencent.liteav.base.util.l mRotation = com.tencent.liteav.base.util.l.NORMAL;
    private boolean mIsRecord = false;
    private Object mCurEGLContext = null;
    private int mCurEGLWidth = -1;
    private int mCurEGLHeight = -1;
    private int mOutputWidth = -1;
    private int mOutputHeight = -1;
    private AtomicReference<Long> mTargetSeekPts = new AtomicReference<>();
    private final long MIN_SEEK_DIR = 100;
    private long mLastProcessFramePts = -1;
    private boolean mReverse = false;
    private boolean mHasFirstFrameProcessed = false;
    private int mSkipFrameCount = 0;
    private final int MAX_SKIP_FRAME_COUNT = 3;
    private UGCVideoEncoderJNI.EncoderType mUsingEncoderType = UGCVideoEncoderJNI.EncoderType.HARDWARE;
    private final VideoRenderListener mVideoRenderListener = new AnonymousClass1();
    private Runnable onCompleteBroadcastRunnable = go.a(this);

    /* JADX INFO: renamed from: com.tencent.ugc.UGCVideoProcessor$1, reason: invalid class name */
    public final class AnonymousClass1 extends VideoRenderListener {
        AnonymousClass1() {
        }

        @Override // com.tencent.ugc.renderer.VideoRenderListener
        public final void onRenderTargetSizeChanged(int i10, int i11) {
            LiteavLog.i(UGCVideoProcessor.this.mTag, "onRenderSizeChange " + i10 + Constants.ACCEPT_TIME_SEPARATOR_SP + i11);
            UGCVideoProcessor.this.runOnVideoProcessHandler(hh.a(this, i10, i11));
        }
    }

    public interface VideoEncodedFrameListener {
        void onEncodedFail(UGCVideoEncoderJNI.EncoderType encoderType);

        void onVideoEncodeStarted();

        void onVideoEncodingCompleted();

        void onVideoFrameEncoded(EncodedVideoFrame encodedVideoFrame);
    }

    public interface VideoProcessListener {
        void onComplete(TXVideoEditConstants.TXGenerateResult tXGenerateResult);

        void onProgress(long j10);
    }

    public enum a {
        STOPPED,
        STARTED,
        PAUSED
    }

    public final class b implements UGCVideoEncoderJNI.UGCVideoEncoderListener {
        private b() {
        }

        /* synthetic */ b(UGCVideoProcessor uGCVideoProcessor, byte b10) {
            this();
        }

        static /* synthetic */ void a(b bVar) {
            if (bVar != UGCVideoProcessor.this.mUGCVideoEncoderListener || UGCVideoProcessor.this.mVideoEncodedFrameListener == null) {
                return;
            }
            UGCVideoProcessor.this.mVideoEncodedFrameListener.onEncodedFail(UGCVideoProcessor.this.mUsingEncoderType);
        }

        static /* synthetic */ void a(b bVar, EncodedVideoFrame encodedVideoFrame) {
            if (bVar != UGCVideoProcessor.this.mUGCVideoEncoderListener || UGCVideoProcessor.this.mVideoEncodedFrameListener == null) {
                return;
            }
            if (encodedVideoFrame == null) {
                UGCVideoProcessor.this.mVideoEncodedFrameListener.onVideoEncodingCompleted();
                UGCVideoProcessor.this.stopEncoder();
                return;
            }
            if (!encodedVideoFrame.isEosFrame) {
                UGCVideoProcessor.this.mVideoEncodedFrameListener.onVideoFrameEncoded(encodedVideoFrame);
            }
            if ((encodedVideoFrame.pts < UGCVideoProcessor.this.mFinalPts || UGCVideoProcessor.this.mFinalPts == -1) && !encodedVideoFrame.isEosFrame) {
                return;
            }
            UGCVideoProcessor.this.mVideoEncodedFrameListener.onVideoEncodingCompleted();
            UGCVideoProcessor.this.stopEncoder();
        }

        @Override // com.tencent.ugc.encoder.UGCVideoEncoderJNI.UGCVideoEncoderListener
        public final void onEncodedFail() {
            LiteavLog.e(UGCVideoProcessor.this.mTag, "encoded fail.");
            UGCVideoProcessor.this.runOnVideoProcessHandler(hj.a(this));
        }

        @Override // com.tencent.ugc.encoder.UGCVideoEncoderJNI.UGCVideoEncoderListener
        public final void onEncodedNAL(EncodedVideoFrame encodedVideoFrame) {
            UGCVideoProcessor.this.runOnVideoProcessHandler(hi.a(this, encodedVideoFrame));
        }
    }

    public final class c implements VideoProcessManager.IVideoProcessManagerListener {
        private c() {
        }

        /* synthetic */ c(UGCVideoProcessor uGCVideoProcessor, byte b10) {
            this();
        }

        @Override // com.tencent.ugc.videoprocessor.VideoProcessManager.IVideoProcessManagerListener
        public final int customProcessFrame(PixelFrame pixelFrame) {
            if (UGCVideoProcessor.this.mTXVideoCustomProcessListener == null || pixelFrame == null) {
                return -1;
            }
            if (pixelFrame.getPixelBufferType() == GLConstants.a.TEXTURE_2D || pixelFrame.getPixelBufferType() == GLConstants.a.TEXTURE_OES) {
                GLES20.glFinish();
            }
            return UGCVideoProcessor.this.mTXVideoCustomProcessListener.onTextureCustomProcess(pixelFrame.getTextureId(), pixelFrame.getWidth(), pixelFrame.getHeight(), pixelFrame.getTimestamp());
        }

        @Override // com.tencent.ugc.videoprocessor.VideoProcessManager.IVideoProcessManagerListener
        public final void didProcessFrame(PixelFrame pixelFrame) {
            if (UGCVideoProcessor.this.filterInvalidatedFrame(pixelFrame.getTimestamp())) {
                return;
            }
            UGCVideoProcessor.this.handleProcessFrame(pixelFrame);
        }
    }

    public UGCVideoProcessor(Context context, UGCMediaListSource uGCMediaListSource, UGCAVSyncer uGCAVSyncer, boolean z10) {
        this.mUGCMediaListSource = uGCMediaListSource;
        this.mUGCAVSyncer = uGCAVSyncer;
        this.mVideoProcessManager = new VideoProcessManager(context, z10);
    }

    private boolean createProcessChainIfNeed(List<PixelFrame> list) {
        int i10;
        PixelFrame pixelFrame = list.get(0);
        int width = pixelFrame.getWidth();
        int height = pixelFrame.getHeight();
        int i11 = this.mOutputWidth;
        if (i11 > 0 && (i10 = this.mOutputHeight) > 0) {
            width = i11;
            height = i10;
        }
        if (isNeedReCreateEGL(pixelFrame.getGLContext(), width, height)) {
            unInitVideoProcessor();
            uninitializedEGL();
        }
        if (this.mEGLCore == null) {
            initializeEGL(pixelFrame.getGLContext(), width, height);
            initProcessChain(width, height);
        }
        return this.mEGLCore != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean filterInvalidatedFrame(long j10) {
        if (this.mReverse) {
            j10 = Math.abs(this.mUGCMediaListSource.getDuration() - j10);
        }
        long jMin = Math.min(this.mUGCMediaListSource.getDuration(), j10);
        if (this.mTargetSeekPts.get() == null || Math.abs(jMin - this.mTargetSeekPts.get().longValue()) <= 100) {
            return false;
        }
        LiteavLog.i(this.mTag, "filtInvalidatedFrame: framePts:" + jMin + "  mTargetSeekPts:" + this.mTargetSeekPts + "  d :" + Math.abs(jMin - this.mTargetSeekPts.get().longValue()));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public boolean handleMessage(Message message) {
        PixelFrame pixelFrame;
        switch (message.what) {
            case 100:
                this.mStatus = a.STARTED;
                if (!this.mIsRecord) {
                    initRenderer();
                } else {
                    initEncoder();
                }
                break;
            case 101:
                if (this.mStatus == a.STARTED && !this.mInvalidate) {
                    LiteavLog.e(this.mTag, "MSG_PROCESS_FROM_SOURCE FAILD AS mStatus == " + this.mStatus);
                } else {
                    processFrame();
                    this.mInvalidate = false;
                }
                break;
            case 102:
                this.mStatus = a.PAUSED;
                break;
            case 103:
                PixelFrame pixelFrame2 = this.mLastFrameOfReadFromSource;
                if (pixelFrame2 != null) {
                    pixelFrame2.release();
                    this.mLastFrameOfReadFromSource = null;
                }
                this.mStatus = a.STOPPED;
                break;
            case 104:
                if (this.mStatus != a.STARTED && (pixelFrame = this.mLastFrameOfReadFromSource) != null) {
                    this.mVideoProcessManager.processFrame(pixelFrame);
                }
                break;
            case 105:
                LiteavLog.i(this.mTag, "handleMessage: MSG_FORCE_PROCESS");
                removeMsgFromVideoProcessHandler(105);
                this.mInvalidate = true;
                if (this.mStatus == a.STARTED) {
                }
                processFrame();
                this.mInvalidate = false;
                break;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleProcessFrame(PixelFrame pixelFrame) {
        UGCVideoEncodeController uGCVideoEncodeController;
        VideoRenderer videoRenderer;
        if (filterInvalidatedFrame(pixelFrame.getTimestamp())) {
            return;
        }
        this.mTargetSeekPts.set(null);
        VideoProcessListener videoProcessListener = this.mVideoProcessListener;
        if (videoProcessListener != null) {
            videoProcessListener.onProgress(pixelFrame.getTimestamp());
        }
        this.mLastProcessFramePts = pixelFrame.getTimestamp();
        FrameMetaData frameMetaData = new FrameMetaData();
        frameMetaData.setEncodeRotation(this.mRotation);
        frameMetaData.setRenderRotation(this.mRotation);
        pixelFrame.setMetaData(frameMetaData);
        if (!this.mIsRecord && (videoRenderer = this.mRenderer) != null) {
            videoRenderer.renderFrame(pixelFrame);
        }
        if (!this.mIsRecord || (uGCVideoEncodeController = this.mVideoEncodeController) == null) {
            long j10 = this.mFinalPts;
            if (j10 > 0 && this.mLastProcessFramePts >= j10) {
                notifyPreviewComplete();
            }
        } else {
            uGCVideoEncodeController.encodeFrame(pixelFrame);
            long j11 = this.mFinalPts;
            if (j11 > 0 && this.mLastProcessFramePts >= j11) {
                LiteavLog.i(this.mTag, "processFrameFromSource: signalEndOfStream");
                this.mVideoEncodeController.signalEndOfStream();
                return;
            }
        }
        if (this.mStatus == a.STARTED) {
            sendMsgToVideoProcessHandler(101);
        }
    }

    private void initEncoder() {
        LiteavLog.i(this.mTag, "init encoder");
        if (this.mVideoEncodeParams == null) {
            LiteavLog.e(this.mTag, "video encode params is null");
            return;
        }
        UGCVideoEncodeController uGCVideoEncodeController = this.mVideoEncodeController;
        if (uGCVideoEncodeController != null) {
            uGCVideoEncodeController.stop();
        }
        this.mVideoEncodeController = new UGCVideoEncodeController(this.mUsingEncoderType);
        b bVar = new b(this, (byte) 0);
        this.mUGCVideoEncoderListener = bVar;
        this.mVideoEncodeController.start(this.mVideoEncodeParams, bVar);
        VideoEncodedFrameListener videoEncodedFrameListener = this.mVideoEncodedFrameListener;
        if (videoEncodedFrameListener != null) {
            videoEncodedFrameListener.onVideoEncodeStarted();
        }
        this.mFinalPts = -1L;
    }

    private void initProcessChain(int i10, int i11) {
        LiteavLog.i(this.mTag, "init process chain:  width:" + i10 + " height:" + i11);
        if (this.mEGLCore == null) {
            return;
        }
        this.mVideoProcessManager.initFilter(this.mGLTexturePool, i10, i11);
        this.mUGCTransitionProcessor = new UGCTransitionProcessor(i10, i11, this.mGLTexturePool);
        this.mUGCCombineProcessor = new UGCCombineProcessor(i10, i11, this.mGLTexturePool);
    }

    private void initRenderer() {
        if (this.mRenderer != null) {
            return;
        }
        if (this.mRenderThread == null) {
            HandlerThread handlerThread = new HandlerThread("VideoProcessRender" + hashCode());
            this.mRenderThread = handlerThread;
            handlerThread.start();
        }
        VideoRenderer videoRenderer = new VideoRenderer(this.mRenderThread.getLooper());
        this.mRenderer = videoRenderer;
        DisplayTarget displayTarget = this.mDisplayTarget;
        if (displayTarget != null) {
            videoRenderer.setDisplayView(displayTarget, true);
            this.mRenderer.setScaleType(this.mScaleType);
        }
        this.mRenderer.start(this.mVideoRenderListener);
    }

    private void initializeEGL(Object obj, int i10, int i11) {
        try {
            EGLCore eGLCore = new EGLCore();
            this.mEGLCore = eGLCore;
            eGLCore.initialize(obj, null, i10, i11);
            this.mEGLCore.makeCurrent();
            this.mCurEGLContext = obj;
            this.mCurEGLWidth = i10;
            this.mCurEGLHeight = i11;
            this.mGLTexturePool = new GLTexturePool();
        } catch (EGLException e10) {
            this.mEGLCore = null;
            LiteavLog.e(this.mThrottlers.a("initGL"), this.mTag, e10.getMessage(), new Object[0]);
        }
    }

    private boolean isFilterFrameDueToChangeFrameRate(List<PixelFrame> list) {
        if (this.mFrameRateFilter == null || !this.mIsRecord || list.size() > 1) {
            return false;
        }
        return this.mFrameRateFilter.isFilterOutFrame(list.get(0));
    }

    private boolean isFilterFrameDueToSync(List<PixelFrame> list) {
        UGCAVSyncer.SkipMode skipModeSyncVideo = UGCAVSyncer.SkipMode.NOOP;
        if (this.mHasFirstFrameProcessed || this.mIsRecord) {
            skipModeSyncVideo = this.mUGCAVSyncer.syncVideo(list.get(0).getTimestamp());
        }
        this.mHasFirstFrameProcessed = true;
        if (skipModeSyncVideo != UGCAVSyncer.SkipMode.SKIP_CURRENT_FRAME) {
            this.mSkipFrameCount = 0;
            return false;
        }
        int i10 = this.mSkipFrameCount + 1;
        this.mSkipFrameCount = i10;
        return i10 < 3;
    }

    private boolean isNeedReCreateEGL(Object obj, int i10, int i11) {
        Object obj2 = this.mCurEGLContext;
        if (obj2 == null || i10 < 0 || i11 < 0) {
            return false;
        }
        if (obj.equals(obj2) && this.mCurEGLWidth == i10 && this.mCurEGLHeight == i11) {
            return false;
        }
        LiteavLog.i(this.mThrottlers.a("recreateGL"), this.mTag, "isNeedReCreateEGL: true", new Object[0]);
        return true;
    }

    static /* synthetic */ void lambda$setDisplayView$5(UGCVideoProcessor uGCVideoProcessor, DisplayTarget displayTarget, GLConstants.GLScaleType gLScaleType) {
        uGCVideoProcessor.mDisplayTarget = displayTarget;
        if (gLScaleType != null) {
            uGCVideoProcessor.mScaleType = gLScaleType;
        }
        VideoRenderer videoRenderer = uGCVideoProcessor.mRenderer;
        if (videoRenderer != null) {
            videoRenderer.setDisplayView(displayTarget, true);
            uGCVideoProcessor.mRenderer.setScaleType(uGCVideoProcessor.mScaleType);
        }
        uGCVideoProcessor.mVideoProcessManager.setScaleType(uGCVideoProcessor.mScaleType);
    }

    static /* synthetic */ void lambda$setOutputSize$4(UGCVideoProcessor uGCVideoProcessor, int i10, int i11, GLConstants.GLScaleType gLScaleType) {
        uGCVideoProcessor.mOutputWidth = i10;
        uGCVideoProcessor.mOutputHeight = i11;
        if (i10 > 0) {
            uGCVideoProcessor.mScaleType = gLScaleType;
        }
    }

    static /* synthetic */ void lambda$setSpeedList$10(UGCVideoProcessor uGCVideoProcessor, List list) {
        if (uGCVideoProcessor.mSpeedProcessor == null) {
            uGCVideoProcessor.mSpeedProcessor = new SpeedProcessor();
        }
        LiteavLog.i(uGCVideoProcessor.mTag, "==== setSpeedList ==== ");
        if (list == null) {
            uGCVideoProcessor.mSpeedProcessor.setSpeedList(null);
            return;
        }
        UGCDataReport.reportDAU(1019);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            TXVideoEditConstants.TXSpeed tXSpeed = (TXVideoEditConstants.TXSpeed) list.get(i10);
            TXVideoEditConstants.TXSpeed tXSpeed2 = new TXVideoEditConstants.TXSpeed();
            tXSpeed2.speedLevel = tXSpeed.speedLevel;
            tXSpeed2.startTime = tXSpeed.startTime;
            tXSpeed2.endTime = tXSpeed.endTime;
            arrayList.add(tXSpeed2);
        }
        uGCVideoProcessor.mSpeedProcessor.setSpeedList(arrayList);
    }

    static /* synthetic */ void lambda$setSplitScreenList$3(UGCVideoProcessor uGCVideoProcessor, List list, int i10, int i11) {
        uGCVideoProcessor.mRectList = list;
        uGCVideoProcessor.setOutputSize(i10, i11, GLConstants.GLScaleType.FIT_CENTER);
    }

    static /* synthetic */ void lambda$start$1(UGCVideoProcessor uGCVideoProcessor, boolean z10, UGCVideoEncoderJNI.EncoderType encoderType) {
        uGCVideoProcessor.mIsRecord = z10;
        uGCVideoProcessor.mUsingEncoderType = encoderType;
        uGCVideoProcessor.mTargetSeekPts.set(null);
        uGCVideoProcessor.mFinalPts = -1L;
        uGCVideoProcessor.mSkipFrameCount = 0;
        uGCVideoProcessor.mHasFirstFrameProcessed = false;
        uGCVideoProcessor.mVideoProcessManager.setListener(new c(uGCVideoProcessor, (byte) 0));
    }

    static /* synthetic */ void lambda$unInitialize$0(UGCVideoProcessor uGCVideoProcessor) {
        uGCVideoProcessor.mFinalPts = -1L;
        PixelFrame pixelFrame = uGCVideoProcessor.mLastFrameOfReadFromSource;
        if (pixelFrame != null) {
            pixelFrame.release();
            uGCVideoProcessor.mLastFrameOfReadFromSource = null;
        }
        VideoRenderer videoRenderer = uGCVideoProcessor.mRenderer;
        if (videoRenderer != null) {
            videoRenderer.stop(false);
            uGCVideoProcessor.mRenderer = null;
        }
        uGCVideoProcessor.stopEncoder();
        PixelFrameRenderer pixelFrameRenderer = uGCVideoProcessor.mPreScaleRenderer;
        if (pixelFrameRenderer != null) {
            pixelFrameRenderer.uninitialize();
            uGCVideoProcessor.mPreScaleRenderer = null;
        }
        uGCVideoProcessor.unInitVideoProcessor();
        uGCVideoProcessor.mVideoProcessManager.unInitialize();
        if (uGCVideoProcessor.mRenderThread != null) {
            if (LiteavSystemInfo.getSystemOSVersionInt() >= 18) {
                uGCVideoProcessor.mRenderThread.quitSafely();
            } else {
                uGCVideoProcessor.mRenderThread.quit();
            }
            uGCVideoProcessor.mRenderThread = null;
        }
        uGCVideoProcessor.uninitializedEGL();
        synchronized (uGCVideoProcessor) {
            CustomHandler customHandler = uGCVideoProcessor.mVideoProcessHandler;
            if (customHandler != null) {
                customHandler.quitLooper();
                uGCVideoProcessor.mVideoProcessHandler = null;
            }
        }
    }

    private PixelFrame mergeFramesIfNeeded(List<PixelFrame> list) {
        if (list.size() <= 1) {
            list.get(0).retain();
            return list.get(0);
        }
        List<TXVideoEditConstants.TXAbsoluteRect> list2 = this.mRectList;
        if (list2 != null) {
            UGCCombineProcessor uGCCombineProcessor = this.mUGCCombineProcessor;
            if (uGCCombineProcessor != null) {
                return uGCCombineProcessor.processFrame(list, list2);
            }
            return null;
        }
        UGCTransitionProcessor uGCTransitionProcessor = this.mUGCTransitionProcessor;
        if (uGCTransitionProcessor != null) {
            return uGCTransitionProcessor.processFrame(list, this.mTransitionType);
        }
        return null;
    }

    private void notifyPreviewComplete() {
        CustomHandler customHandler = this.mVideoProcessHandler;
        if (customHandler != null) {
            customHandler.removeCallbacks(this.onCompleteBroadcastRunnable);
            customHandler.post(this.onCompleteBroadcastRunnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCompleteBroadcast() {
        if (this.mVideoProcessListener != null) {
            TXVideoEditConstants.TXGenerateResult tXGenerateResult = new TXVideoEditConstants.TXGenerateResult();
            tXGenerateResult.retCode = 0;
            tXGenerateResult.descMsg = "";
            this.mVideoProcessListener.onComplete(tXGenerateResult);
        }
    }

    private PixelFrame preScale(PixelFrame pixelFrame) {
        int i10 = this.mOutputWidth;
        int i11 = this.mOutputHeight;
        com.tencent.liteav.base.util.l lVar = this.mRotation;
        if (lVar == com.tencent.liteav.base.util.l.ROTATION_90 || lVar == com.tencent.liteav.base.util.l.ROTATION_270) {
            i11 = i10;
            i10 = i11;
        }
        if (this.mEGLCore == null || i10 <= 0 || i11 <= 0 || (pixelFrame.getWidth() == i10 && pixelFrame.getHeight() == i11)) {
            pixelFrame.retain();
            return pixelFrame;
        }
        if (this.mPreScaleRenderer == null) {
            this.mPreScaleRenderer = new PixelFrameRenderer(i10, i11);
        }
        this.mPreScaleRenderer.setOutputSize(i10, i11);
        GLTexture gLTextureObtain = this.mGLTexturePool.obtain(i10, i11);
        gLTextureObtain.setColorFormat(pixelFrame.getColorRange(), pixelFrame.getColorSpace());
        this.mPreScaleRenderer.renderFrame(pixelFrame, this.mScaleType, gLTextureObtain);
        PixelFrame pixelFrameWrap = gLTextureObtain.wrap(pixelFrame.getGLContext());
        pixelFrameWrap.setTimestamp(pixelFrame.getTimestamp());
        gLTextureObtain.release();
        return pixelFrameWrap;
    }

    private void processEndOfFrameRead() {
        UGCVideoEncodeController uGCVideoEncodeController;
        PixelFrame pixelFrame = this.mLastFrameOfReadFromSource;
        if (pixelFrame != null) {
            this.mFinalPts = pixelFrame.getTimestamp();
        }
        LiteavLog.i(this.mTag, "final frame pts is " + this.mFinalPts + "  last progressed frame pts is " + this.mLastProcessFramePts);
        if (this.mLastProcessFramePts < this.mFinalPts) {
            return;
        }
        if (this.mIsRecord && (uGCVideoEncodeController = this.mVideoEncodeController) != null) {
            uGCVideoEncodeController.signalEndOfStream();
        }
        if (this.mIsRecord) {
            return;
        }
        notifyPreviewComplete();
    }

    private void processFrame() {
        if (this.mIsInit) {
            List<PixelFrame> nextVideoFrame = this.mUGCMediaListSource.readNextVideoFrame();
            if (nextVideoFrame == null || nextVideoFrame.isEmpty()) {
                processEndOfFrameRead();
                return;
            }
            if (!createProcessChainIfNeed(nextVideoFrame)) {
                PixelFrame.releasePixelFrames(nextVideoFrame);
                return;
            }
            if (isFilterFrameDueToSync(nextVideoFrame) || isFilterFrameDueToChangeFrameRate(nextVideoFrame)) {
                PixelFrame.releasePixelFrames(nextVideoFrame);
                if (this.mStatus == a.STARTED) {
                    sendMsgToVideoProcessHandler(101);
                    return;
                }
                return;
            }
            PixelFrame pixelFrameMergeFramesIfNeeded = mergeFramesIfNeeded(nextVideoFrame);
            if (pixelFrameMergeFramesIfNeeded == null) {
                PixelFrame.releasePixelFrames(nextVideoFrame);
                return;
            }
            PixelFrame pixelFrame = this.mLastFrameOfReadFromSource;
            if (pixelFrame != null) {
                pixelFrame.release();
            }
            PixelFrame pixelFramePreScale = preScale(pixelFrameMergeFramesIfNeeded);
            this.mLastFrameOfReadFromSource = pixelFramePreScale;
            this.mVideoProcessManager.processFrame(pixelFramePreScale);
            pixelFrameMergeFramesIfNeeded.release();
            PixelFrame.releasePixelFrames(nextVideoFrame);
        }
    }

    private void removeMsgFromVideoProcessHandler(int i10) {
        synchronized (this) {
            CustomHandler customHandler = this.mVideoProcessHandler;
            if (customHandler != null) {
                customHandler.removeMessages(i10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean runOnVideoProcessHandler(Runnable runnable) {
        synchronized (this) {
            CustomHandler customHandler = this.mVideoProcessHandler;
            if (customHandler != null && customHandler.getLooper() != null && this.mVideoProcessHandler.getLooper().getThread() != null && this.mVideoProcessHandler.getLooper().getThread().isAlive()) {
                CustomHandler customHandler2 = this.mVideoProcessHandler;
                if (customHandler2 == null) {
                    return false;
                }
                if (Looper.myLooper() == customHandler2.getLooper()) {
                    runnable.run();
                    return true;
                }
                boolean zPost = customHandler2.post(runnable);
                if (!zPost) {
                    LiteavLog.e(this.mTag, "handler post fail ret = ".concat(String.valueOf(zPost)));
                }
                return zPost;
            }
            LiteavLog.e(this.mTag, "handler post fail thread is not alive ");
            return false;
        }
    }

    private void sendMsgToVideoProcessHandler(int i10) {
        synchronized (this) {
            CustomHandler customHandler = this.mVideoProcessHandler;
            if (customHandler != null) {
                customHandler.sendEmptyMessage(i10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopEncoder() {
        UGCVideoEncodeController uGCVideoEncodeController = this.mVideoEncodeController;
        if (uGCVideoEncodeController == null) {
            return;
        }
        this.mFinalPts = -1L;
        uGCVideoEncodeController.signalEndOfStream();
        this.mVideoEncodeController.stop();
        this.mVideoEncodeController = null;
        if (this.mFrameRateFilter != null) {
            this.mFrameRateFilter = null;
        }
    }

    private void unInitVideoProcessor() {
        LiteavLog.i(this.mTag, "uninitVideoProcessor: ");
        this.mVideoProcessManager.unInitFilter();
        UGCTransitionProcessor uGCTransitionProcessor = this.mUGCTransitionProcessor;
        if (uGCTransitionProcessor != null) {
            uGCTransitionProcessor.release();
            this.mUGCTransitionProcessor = null;
        }
        UGCCombineProcessor uGCCombineProcessor = this.mUGCCombineProcessor;
        if (uGCCombineProcessor != null) {
            uGCCombineProcessor.release();
            this.mUGCCombineProcessor = null;
        }
        PixelFrameRenderer pixelFrameRenderer = this.mPreScaleRenderer;
        if (pixelFrameRenderer != null) {
            pixelFrameRenderer.uninitialize();
            this.mPreScaleRenderer = null;
        }
    }

    private void uninitializedEGL() {
        GLTexturePool gLTexturePool;
        LiteavLog.i(this.mThrottlers.a("uninitGL"), this.mTag, "uninitializedEGL", new Object[0]);
        if (EGLCore.makeCurrent(this.mEGLCore) && (gLTexturePool = this.mGLTexturePool) != null) {
            gLTexturePool.destroy();
        }
        TXVideoEditer.TXVideoCustomProcessListener tXVideoCustomProcessListener = this.mTXVideoCustomProcessListener;
        if (tXVideoCustomProcessListener != null) {
            tXVideoCustomProcessListener.onTextureDestroyed();
        }
        EGLCore.destroy(this.mEGLCore);
        this.mEGLCore = null;
    }

    public VideoEffectProcessor getEffectProcessor() {
        return this.mVideoProcessManager.getEffectProcessor();
    }

    public VideoTransitionProcessor getTransitionProcessor() {
        return this.mVideoProcessManager.getTransitionProcessor();
    }

    public WatermarkProcessor getWatermarkProcessor() {
        return this.mVideoProcessManager.getWatermarkProcessor();
    }

    public void initialize() {
        if (this.mIsInit) {
            return;
        }
        this.mIsInit = true;
        LiteavLog.i(this.mTag, "initialize: ");
        HandlerThread handlerThread = new HandlerThread("VideoProcess_" + hashCode());
        handlerThread.start();
        synchronized (this) {
            this.mVideoProcessHandler = new CustomHandler(handlerThread.getLooper(), gz.a(this));
        }
    }

    public void refreshOneFrame() {
        sendMsgToVideoProcessHandler(104);
    }

    public void seekTo(long j10) {
        this.mTargetSeekPts.set(Long.valueOf(j10));
        removeMsgFromVideoProcessHandler(105);
        sendMsgToVideoProcessHandler(105);
    }

    public void setBeautyFilter(int i10, int i11) {
        runOnVideoProcessHandler(gu.a(this, i10, i11));
    }

    public void setCustomVideoProcessListener(TXVideoEditer.TXVideoCustomProcessListener tXVideoCustomProcessListener) {
        runOnVideoProcessHandler(gx.a(this, tXVideoCustomProcessListener));
    }

    public void setDisplayView(DisplayTarget displayTarget, GLConstants.GLScaleType gLScaleType) {
        LiteavLog.i(this.mTag, "setDisplayView: displayTarget:" + displayTarget + "scaleType:" + gLScaleType);
        runOnVideoProcessHandler(hg.a(this, displayTarget, gLScaleType));
    }

    public void setEncodeParams(VideoEncodeParams videoEncodeParams) {
        LiteavLog.i(this.mTag, "setEncodeParams: ".concat(String.valueOf(videoEncodeParams)));
        runOnVideoProcessHandler(gq.a(this, videoEncodeParams));
    }

    public void setFilter(Bitmap bitmap, float f10, Bitmap bitmap2, float f11, float f12) {
        runOnVideoProcessHandler(gw.a(this, bitmap, f10, bitmap2, f11, f12));
        sendMsgToVideoProcessHandler(104);
    }

    public void setFilteredFrameRate(int i10) {
        runOnVideoProcessHandler(hd.a(this, i10));
    }

    public void setOutputSize(int i10, int i11, GLConstants.GLScaleType gLScaleType) {
        runOnVideoProcessHandler(hf.a(this, i10, i11, gLScaleType));
    }

    public void setPictureTransition(int i10) {
        runOnVideoProcessHandler(gs.a(this, i10));
    }

    public void setProgressListener(VideoProcessListener videoProcessListener) {
        runOnVideoProcessHandler(gy.a(this, videoProcessListener));
    }

    public void setRenderRotation(com.tencent.liteav.base.util.l lVar) {
        LiteavLog.i(this.mTag, "setRenderRotation: ".concat(String.valueOf(lVar)));
        if (lVar == null) {
            return;
        }
        runOnVideoProcessHandler(gp.a(this, lVar));
        sendMsgToVideoProcessHandler(104);
    }

    public void setReverse(boolean z10) {
        this.mReverse = z10;
    }

    public void setSpecialRatio(float f10) {
        runOnVideoProcessHandler(gv.a(this, f10));
        sendMsgToVideoProcessHandler(104);
    }

    public void setSpeedList(List<TXVideoEditConstants.TXSpeed> list) {
        runOnVideoProcessHandler(gt.a(this, list));
    }

    public void setSplitScreenList(List<TXVideoEditConstants.TXAbsoluteRect> list, int i10, int i11) {
        runOnVideoProcessHandler(he.a(this, list, i10, i11));
    }

    public void setVideoEncodedFrameListener(VideoEncodedFrameListener videoEncodedFrameListener) {
        runOnVideoProcessHandler(gr.a(this, videoEncodedFrameListener));
    }

    public void start(boolean z10, UGCVideoEncoderJNI.EncoderType encoderType) {
        LiteavLog.i(this.mTag, "start: ".concat(String.valueOf(z10)));
        runOnVideoProcessHandler(hb.a(this, z10, encoderType));
        sendMsgToVideoProcessHandler(100);
        sendMsgToVideoProcessHandler(101);
    }

    public void stop() {
        LiteavLog.i(this.mTag, "stop: ");
        removeMsgFromVideoProcessHandler(101);
        sendMsgToVideoProcessHandler(103);
        runOnVideoProcessHandler(hc.a(this));
    }

    public void unInitialize() {
        if (this.mIsInit) {
            this.mIsInit = false;
            LiteavLog.i(this.mTag, "uninitialize");
            runOnVideoProcessHandler(ha.a(this));
        }
    }
}
