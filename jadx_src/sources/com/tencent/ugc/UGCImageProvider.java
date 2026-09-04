package com.tencent.ugc;

import android.graphics.Bitmap;
import android.os.HandlerThread;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.videobase.egl.EGLCore;
import com.tencent.ugc.videobase.egl.EGLException;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public class UGCImageProvider implements UGCFrameQueue.UGCFrameQueueListener, UGCPixelFrameProvider {
    private static final int MAX_FRAME_SIZE = 5;
    private static final String TAG = "UGCImageProvider";
    private final List<Bitmap> mBitmapList;
    private FutureTask<Long> mDurationFuture;
    private long mDurationMs;
    private EGLCore mEGLCore;
    private final int mFps;
    private final int mFrameIntervalMs;
    private final UGCFrameQueue<List<PixelFrame>> mFrameQueue;
    private final Map<Bitmap, GLTexture> mGLTextureMap;
    private GLTexturePool mGLTexturePool;
    private int mTotalFrameCount;
    private CustomHandler mWorkHandler;
    private final com.tencent.liteav.base.b.b mThrottlers = new com.tencent.liteav.base.b.b();
    private int mCurrentFrameCount = 0;
    private long mStayDurationMs = 1000;
    private long mMotionDurationMs = 500;
    private int mTransitionType = 1;

    public UGCImageProvider(List<Bitmap> list, int i10) {
        LiteavLog.i(TAG, TAG);
        i10 = i10 <= 0 ? 20 : i10;
        this.mFps = i10;
        this.mFrameIntervalMs = 1000 / i10;
        this.mFrameQueue = new UGCFrameQueue<>();
        this.mGLTextureMap = new HashMap();
        this.mBitmapList = list;
    }

    private int clamp(int i10, int i11, int i12) {
        if (i10 < i11) {
            return i11;
        }
        return i10 > i12 ? i12 : i10;
    }

    private void clearGLTextureCache() {
        for (GLTexture gLTexture : this.mGLTextureMap.values()) {
            if (gLTexture != null) {
                gLTexture.release();
            }
        }
        this.mGLTextureMap.clear();
    }

    private void clearPixelFrameQueue() {
        for (List<PixelFrame> list : this.mFrameQueue.dequeueAll()) {
            if (list != null) {
                Iterator<PixelFrame> it = list.iterator();
                while (it.hasNext()) {
                    it.next().release();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void decodeBitmapFrame() {
        if (this.mEGLCore == null || this.mFrameQueue.size() > 5) {
            return;
        }
        if (this.mCurrentFrameCount >= this.mTotalFrameCount) {
            this.mFrameQueue.queue(UGCPixelFrameProvider.END_OF_STREAM);
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = this.mCurrentFrameCount;
        long j10 = ((long) i10) * ((long) this.mFrameIntervalMs);
        this.mCurrentFrameCount = i10 + 1;
        int iClamp = clamp((int) (j10 / (this.mStayDurationMs + this.mMotionDurationMs)), 0, this.mBitmapList.size() - 1);
        arrayList.add(loadBitmapToPixelFrame(this.mBitmapList.get(iClamp), j10));
        arrayList.add(loadBitmapToPixelFrame(this.mBitmapList.get(clamp(iClamp + 1, 0, this.mBitmapList.size() - 1)), j10));
        this.mFrameQueue.queue(arrayList);
        CustomHandler customHandler = this.mWorkHandler;
        if (customHandler != null) {
            customHandler.removeCallbacks(dl.a(this));
            customHandler.post(dm.a(this));
        }
    }

    private void initializeGLComponents() {
        EGLCore eGLCore = new EGLCore();
        this.mEGLCore = eGLCore;
        try {
            eGLCore.initialize(GlobalContextManager.getInstance().getGLContext(), null, 128, 128);
            this.mEGLCore.makeCurrent();
            this.mGLTexturePool = new GLTexturePool();
        } catch (EGLException e10) {
            LiteavLog.e(this.mThrottlers.a("initGL"), TAG, "create EGLCore failed.", e10);
            this.mEGLCore = null;
        }
    }

    static /* synthetic */ void lambda$initialize$0(UGCImageProvider uGCImageProvider) {
        uGCImageProvider.mFrameQueue.setUGCFrameQueueListener(uGCImageProvider);
        uGCImageProvider.initializeGLComponents();
    }

    static /* synthetic */ void lambda$seekTo$4(UGCImageProvider uGCImageProvider, long j10) {
        uGCImageProvider.mCurrentFrameCount = (((int) (j10 - 1)) / uGCImageProvider.mFrameIntervalMs) + 1;
        uGCImageProvider.clearPixelFrameQueue();
        uGCImageProvider.runOnWorkThread(dd.a(uGCImageProvider));
    }

    static /* synthetic */ Long lambda$setPictureTransition$5(UGCImageProvider uGCImageProvider, int i10) throws Exception {
        uGCImageProvider.setPictureTransitionInternal(i10);
        return Long.valueOf(uGCImageProvider.mDurationMs);
    }

    static /* synthetic */ void lambda$start$2(UGCImageProvider uGCImageProvider) {
        uGCImageProvider.setPictureTransitionInternal(uGCImageProvider.mTransitionType);
        uGCImageProvider.decodeBitmapFrame();
    }

    static /* synthetic */ void lambda$stop$3(UGCImageProvider uGCImageProvider) {
        CustomHandler customHandler = uGCImageProvider.mWorkHandler;
        if (customHandler != null) {
            customHandler.removeCallbacks(de.a(uGCImageProvider));
        }
    }

    static /* synthetic */ void lambda$uninitialize$1(UGCImageProvider uGCImageProvider) {
        uGCImageProvider.clearPixelFrameQueue();
        uGCImageProvider.clearGLTextureCache();
        uGCImageProvider.uninitGLComponents();
        uGCImageProvider.mFrameQueue.setUGCFrameQueueListener(null);
        CustomHandler customHandler = uGCImageProvider.mWorkHandler;
        if (customHandler != null) {
            customHandler.quitLooper();
            uGCImageProvider.mWorkHandler = null;
        }
    }

    private PixelFrame loadBitmapToPixelFrame(Bitmap bitmap, long j10) {
        GLTexture gLTextureObtain;
        try {
            EGLCore eGLCore = this.mEGLCore;
            if (eGLCore != null) {
                eGLCore.makeCurrent();
            }
        } catch (Exception e10) {
            LiteavLog.e(this.mThrottlers.a("make_current_fail"), TAG, "loadBitmapToPixelFrame makeCurrent fail".concat(String.valueOf(e10)), new Object[0]);
        }
        if (this.mGLTextureMap.containsKey(bitmap)) {
            gLTextureObtain = this.mGLTextureMap.get(bitmap);
        } else {
            gLTextureObtain = this.mGLTexturePool.obtain(bitmap.getWidth(), bitmap.getHeight());
            gLTextureObtain.setColorFormat(GLConstants.ColorRange.VIDEO_RANGE, GLConstants.ColorSpace.BT601);
            OpenGlUtils.loadTexture(bitmap, gLTextureObtain.getId(), false);
            this.mGLTextureMap.put(bitmap, gLTextureObtain);
        }
        PixelFrame pixelFrameWrap = gLTextureObtain.wrap(GlobalContextManager.getInstance().getGLContext());
        pixelFrameWrap.setTimestamp(j10);
        return pixelFrameWrap;
    }

    private boolean runOnWorkThread(Runnable runnable) {
        CustomHandler customHandler = this.mWorkHandler;
        if (customHandler != null) {
            return customHandler.runOrPost(runnable, 0);
        }
        return false;
    }

    private void setPictureTransitionInternal(int i10) {
        this.mTransitionType = i10;
        this.mStayDurationMs = UGCTransitionRules.getStayDurationMs(i10);
        this.mMotionDurationMs = UGCTransitionRules.getMotionDurationMs(i10);
        List<Bitmap> list = this.mBitmapList;
        if (list == null) {
            return;
        }
        if (i10 == 5 || i10 == 4) {
            this.mDurationMs = ((long) list.size()) * (this.mStayDurationMs + this.mMotionDurationMs);
        } else {
            long size = list.size();
            long j10 = this.mStayDurationMs;
            long j11 = this.mMotionDurationMs;
            this.mDurationMs = (size * (j10 + j11)) - j11;
        }
        this.mTotalFrameCount = (int) ((this.mDurationMs / 1000) * ((long) this.mFps));
    }

    private void uninitGLComponents() {
        EGLCore eGLCore = this.mEGLCore;
        if (eGLCore == null) {
            return;
        }
        try {
            eGLCore.makeCurrent();
            GLTexturePool gLTexturePool = this.mGLTexturePool;
            if (gLTexturePool != null) {
                gLTexturePool.evictAll();
                this.mGLTexturePool.destroy();
            }
        } catch (EGLException e10) {
            LiteavLog.e(this.mThrottlers.a("uninitGL"), TAG, "EGLCore destroy failed.", e10);
        }
        this.mGLTexturePool = null;
        EGLCore.destroy(this.mEGLCore);
        this.mEGLCore = null;
    }

    public long getDuration() throws ExecutionException, InterruptedException, TimeoutException {
        if (this.mDurationFuture == null) {
            return 0L;
        }
        Long l10 = 0L;
        try {
            l10 = this.mDurationFuture.get(500L, TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            LiteavLog.w(TAG, "getDuration future task exception: ".concat(String.valueOf(e10)));
        }
        return l10.longValue();
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public UGCFrameQueue<List<PixelFrame>> getFrameQueue() {
        return this.mFrameQueue;
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void initialize() {
        LiteavLog.i(TAG, "initialize");
        synchronized (this) {
            if (this.mWorkHandler != null) {
                LiteavLog.w(TAG, "UGCPixelFrameProvider is initialized");
                return;
            }
            HandlerThread handlerThread = new HandlerThread("ugc-image-frame-provider");
            handlerThread.start();
            this.mWorkHandler = new CustomHandler(handlerThread.getLooper());
            runOnWorkThread(dc.a(this));
        }
    }

    @Override // com.tencent.ugc.UGCFrameQueue.UGCFrameQueueListener
    public void onFrameDequeued() {
        runOnWorkThread(dk.a(this));
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void seekTo(long j10, boolean z10) {
        runOnWorkThread(di.a(this, j10));
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void setMaxBufferFrameCount(int i10) {
    }

    public void setPictureTransition(int i10) {
        LiteavLog.i(TAG, "setPictureTransition type = ".concat(String.valueOf(i10)));
        FutureTask<Long> futureTask = new FutureTask<>(dj.a(this, i10));
        this.mDurationFuture = futureTask;
        runOnWorkThread(futureTask);
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void setPlayEndPts(long j10) {
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void setReverse(boolean z10) {
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void start() {
        Log.i(TAG, "Start", new Object[0]);
        runOnWorkThread(dg.a(this));
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void stop() {
        LiteavLog.i(TAG, "stop");
        runOnWorkThread(dh.a(this));
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void uninitialize() {
        LiteavLog.i(TAG, "unInitialize");
        runOnWorkThread(df.a(this));
    }
}
