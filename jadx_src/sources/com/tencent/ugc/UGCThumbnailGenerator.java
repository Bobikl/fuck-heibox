package com.tencent.ugc;

import android.graphics.Bitmap;
import android.os.HandlerThread;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.videobase.egl.EGLCore;
import com.tencent.ugc.videobase.egl.EGLException;
import com.tencent.ugc.videobase.frame.GLFrameBuffer;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.frame.PixelFrameRenderer;
import com.tencent.ugc.videobase.utils.CollectionUtils;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class UGCThumbnailGenerator {
    private GLTexturePool mGLTexturePool;
    private CustomHandler mHandler;
    private boolean mIsInitialized;
    private final UGCMediaListSource mMediaListSource;
    private PixelFrameRenderer mPixelFrameRender;
    private String mSourcePath;
    private UGCThumbnailGenerateParams mThumbnailGenerateInfo;
    private TXVideoEditer.TXThumbnailListener mThumbnailListener;
    private final com.tencent.liteav.base.b.b mThrottlers = new com.tencent.liteav.base.b.b();
    private String mTag = "ThumbnailGenerator_";
    private int mGenerateIndex = 0;
    private EGLCore mEGLCore = null;
    private final GLFrameBuffer mGLFrameBuffer = new GLFrameBuffer();
    private Object mSharedContext = null;

    public static class UGCThumbnailGenerateParams {
        boolean fast;
        int height;
        int thumbnailCount;
        List<Long> thumbnailPtsList;
        int width;
    }

    public UGCThumbnailGenerator() {
        UGCMediaListSource uGCMediaListSource = new UGCMediaListSource();
        this.mMediaListSource = uGCMediaListSource;
        uGCMediaListSource.setNeedAudioSource(false);
        uGCMediaListSource.setMaxFrameSize(1);
        this.mTag += hashCode();
    }

    public static List<Long> calculateThumbnailList(int i10, long j10, long j11, long j12) {
        if (j12 < 0 || i10 == 0) {
            LiteavLog.w("calculateThumbnailList", "param error: duration= " + j12 + ",count= " + i10);
            return null;
        }
        LiteavLog.i("calculateThumbnailList", "calculateThumbnailList startTimeMs : " + j10 + ", endTimeMs : " + j11 + "  duration:" + j12);
        long jMin = Math.min(j11, j12);
        ArrayList arrayList = new ArrayList();
        long j13 = jMin - j10;
        if (j13 > 0) {
            j12 = j13;
        }
        long j14 = j12 / ((long) i10);
        for (int i11 = 0; i11 < i10; i11++) {
            long jMin2 = (((long) i11) * j14) + j10;
            if (jMin > 0) {
                jMin2 = Math.min(jMin2, jMin);
            }
            arrayList.add(Long.valueOf(jMin2));
        }
        return arrayList;
    }

    private Bitmap getBitmapFromTexture(GLTexture gLTexture) {
        this.mGLFrameBuffer.attachTexture(gLTexture.getId());
        this.mGLFrameBuffer.bindToContext();
        UGCThumbnailGenerateParams uGCThumbnailGenerateParams = this.mThumbnailGenerateInfo;
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(uGCThumbnailGenerateParams.width * uGCThumbnailGenerateParams.height * 4).order(ByteOrder.nativeOrder());
        byteBufferOrder.position(0);
        UGCThumbnailGenerateParams uGCThumbnailGenerateParams2 = this.mThumbnailGenerateInfo;
        OpenGlUtils.readPixels(0, 0, uGCThumbnailGenerateParams2.width, uGCThumbnailGenerateParams2.height, byteBufferOrder);
        byteBufferOrder.position(0);
        UGCThumbnailGenerateParams uGCThumbnailGenerateParams3 = this.mThumbnailGenerateInfo;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(uGCThumbnailGenerateParams3.width, uGCThumbnailGenerateParams3.height, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferOrder);
        this.mGLFrameBuffer.unbindFromContext();
        this.mGLFrameBuffer.detachTexture();
        return bitmapCreateBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getNextThumbnail() {
        List<Long> list;
        GLTexturePool gLTexturePool;
        UGCThumbnailGenerateParams uGCThumbnailGenerateParams = this.mThumbnailGenerateInfo;
        if (uGCThumbnailGenerateParams != null && (list = uGCThumbnailGenerateParams.thumbnailPtsList) != null) {
            int size = list.size();
            int i10 = this.mGenerateIndex;
            if (size > i10) {
                List<Long> list2 = this.mThumbnailGenerateInfo.thumbnailPtsList;
                this.mGenerateIndex = i10 + 1;
                long jLongValue = list2.get(i10).longValue();
                System.currentTimeMillis();
                if (this.mThumbnailGenerateInfo.fast) {
                    this.mMediaListSource.impreciseSeekTo(jLongValue);
                } else {
                    this.mMediaListSource.seekTo(jLongValue);
                }
                List<PixelFrame> nextVideoFrame = this.mMediaListSource.readNextVideoFrame();
                if (CollectionUtils.isEmpty(nextVideoFrame) || nextVideoFrame.get(0) == null) {
                    LiteavLog.i(this.mTag, "readNextVideoFrame return null.");
                    return;
                }
                PixelFrame pixelFrame = nextVideoFrame.get(0);
                if (this.mEGLCore == null || !CommonUtil.equals(this.mSharedContext, pixelFrame.getGLContext())) {
                    uninitOpenGLComponents();
                    Object gLContext = pixelFrame.getGLContext();
                    UGCThumbnailGenerateParams uGCThumbnailGenerateParams2 = this.mThumbnailGenerateInfo;
                    initOpenGLComponents(gLContext, uGCThumbnailGenerateParams2.width, uGCThumbnailGenerateParams2.height);
                }
                if (this.mEGLCore == null || (gLTexturePool = this.mGLTexturePool) == null) {
                    LiteavLog.e(this.mThrottlers.a("NoEGLCore"), this.mTag, "EGLCore or GLTexturePool is null", new Object[0]);
                    pixelFrame.release();
                    return;
                }
                UGCThumbnailGenerateParams uGCThumbnailGenerateParams3 = this.mThumbnailGenerateInfo;
                GLTexture gLTextureObtain = gLTexturePool.obtain(uGCThumbnailGenerateParams3.width, uGCThumbnailGenerateParams3.height);
                gLTextureObtain.setColorFormat(pixelFrame.getColorRange(), pixelFrame.getColorSpace());
                this.mPixelFrameRender.renderFrame(pixelFrame, GLConstants.GLScaleType.CENTER_CROP, gLTextureObtain);
                Bitmap bitmapFromTexture = getBitmapFromTexture(gLTextureObtain);
                TXVideoEditer.TXThumbnailListener tXThumbnailListener = this.mThumbnailListener;
                if (tXThumbnailListener != null) {
                    tXThumbnailListener.onThumbnail(this.mGenerateIndex, jLongValue, bitmapFromTexture);
                }
                gLTextureObtain.release();
                pixelFrame.release();
                if (list2.size() > this.mGenerateIndex) {
                    this.mHandler.post(gm.a(this));
                    return;
                }
                return;
            }
        }
        LiteavLog.i(this.mTag, "generate runnable: mThumbnailGenerateInfo= " + this.mThumbnailGenerateInfo + " mGenerateIndex = " + this.mGenerateIndex);
    }

    private void initOpenGLComponents(Object obj, int i10, int i11) {
        LiteavLog.i(this.mThrottlers.a("initGL"), this.mTag, "initOpenGLComponents ".concat(String.valueOf(obj)), new Object[0]);
        if (this.mEGLCore != null) {
            return;
        }
        EGLCore eGLCore = new EGLCore();
        this.mEGLCore = eGLCore;
        try {
            eGLCore.initialize(obj, null, 128, 128);
            this.mGLTexturePool = new GLTexturePool();
            this.mPixelFrameRender = new PixelFrameRenderer(i10, i11);
            this.mGLFrameBuffer.initialize();
            this.mSharedContext = obj;
        } catch (EGLException e10) {
            this.mEGLCore = null;
            LiteavLog.e(this.mThrottlers.a("initGLError"), this.mTag, "EGLCore create failed.", e10);
        }
    }

    static /* synthetic */ void lambda$setVideoSourceList$1(UGCThumbnailGenerator uGCThumbnailGenerator, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LiteavLog.i(uGCThumbnailGenerator.mTag, "setVideoSourceList ".concat(String.valueOf((String) it.next())));
        }
        uGCThumbnailGenerator.mMediaListSource.setVideoSources(list);
        uGCThumbnailGenerator.mSourcePath = (String) list.get(0);
    }

    static /* synthetic */ void lambda$start$3(UGCThumbnailGenerator uGCThumbnailGenerator, UGCThumbnailGenerateParams uGCThumbnailGenerateParams, TXVideoEditer.TXThumbnailListener tXThumbnailListener) {
        if (uGCThumbnailGenerateParams == null || CollectionUtils.isEmpty(uGCThumbnailGenerateParams.thumbnailPtsList)) {
            LiteavLog.w(uGCThumbnailGenerator.mTag, "start param error!");
            return;
        }
        LiteavLog.i(uGCThumbnailGenerator.mTag, "start width = " + uGCThumbnailGenerateParams.width + " height = " + uGCThumbnailGenerateParams.height);
        uGCThumbnailGenerator.mGenerateIndex = 0;
        uGCThumbnailGenerator.mThumbnailGenerateInfo = uGCThumbnailGenerateParams;
        uGCThumbnailGenerator.mThumbnailListener = tXThumbnailListener;
        uGCThumbnailGenerator.getNextThumbnail();
    }

    static /* synthetic */ void lambda$stop$4(UGCThumbnailGenerator uGCThumbnailGenerator) {
        LiteavLog.i(uGCThumbnailGenerator.mTag, "stop");
        uGCThumbnailGenerator.mThumbnailGenerateInfo = null;
        uGCThumbnailGenerator.mThumbnailListener = null;
    }

    static /* synthetic */ void lambda$uninitialize$0(UGCThumbnailGenerator uGCThumbnailGenerator) {
        LiteavLog.i(uGCThumbnailGenerator.mTag, "unInitialize");
        uGCThumbnailGenerator.uninitOpenGLComponents();
        synchronized (uGCThumbnailGenerator) {
            if (!uGCThumbnailGenerator.mIsInitialized) {
                LiteavLog.w(uGCThumbnailGenerator.mTag, "already uninitialize.");
                return;
            }
            CustomHandler customHandler = uGCThumbnailGenerator.mHandler;
            uGCThumbnailGenerator.mHandler = null;
            uGCThumbnailGenerator.mIsInitialized = false;
            uGCThumbnailGenerator.mMediaListSource.uninitialize();
            if (customHandler != null) {
                customHandler.quitLooper();
            }
        }
    }

    private boolean runOnThumbnailThread(Runnable runnable) {
        CustomHandler customHandler = this.mHandler;
        if (!this.mIsInitialized || customHandler == null) {
            return false;
        }
        return customHandler.runOrPost(runnable);
    }

    private void uninitOpenGLComponents() {
        LiteavLog.i(this.mThrottlers.a("uninitGL"), this.mTag, "uninitOpenGLComponents", new Object[0]);
        if (EGLCore.makeCurrent(this.mEGLCore)) {
            GLTexturePool gLTexturePool = this.mGLTexturePool;
            if (gLTexturePool != null) {
                gLTexturePool.destroy();
            }
            PixelFrameRenderer pixelFrameRenderer = this.mPixelFrameRender;
            if (pixelFrameRenderer != null) {
                pixelFrameRenderer.uninitialize();
            }
            this.mGLFrameBuffer.uninitialize();
        }
        this.mGLTexturePool = null;
        this.mPixelFrameRender = null;
        EGLCore.destroy(this.mEGLCore);
        this.mEGLCore = null;
    }

    public void initialize() {
        LiteavLog.i(this.mTag, "initialize");
        synchronized (this) {
            if (this.mIsInitialized) {
                LiteavLog.w(this.mTag, "already initialized.");
                return;
            }
            HandlerThread handlerThread = new HandlerThread("thumbnailG_" + hashCode());
            handlerThread.start();
            this.mHandler = new CustomHandler(handlerThread.getLooper());
            this.mIsInitialized = true;
            UGCMediaListSource uGCMediaListSource = this.mMediaListSource;
            uGCMediaListSource.getClass();
            runOnThumbnailThread(gh.a(uGCMediaListSource));
        }
    }

    public void setVideoSourceList(List<String> list) {
        runOnThumbnailThread(gj.a(this, list));
    }

    public void setVideoSourceRange(long j10, long j11) {
        runOnThumbnailThread(gk.a(this, j10, j11));
    }

    public void start(UGCThumbnailGenerateParams uGCThumbnailGenerateParams, TXVideoEditer.TXThumbnailListener tXThumbnailListener) {
        runOnThumbnailThread(gl.a(this, uGCThumbnailGenerateParams, tXThumbnailListener));
    }

    public void stop() {
        runOnThumbnailThread(gn.a(this));
    }

    public void uninitialize() {
        runOnThumbnailThread(gi.a(this));
    }
}
