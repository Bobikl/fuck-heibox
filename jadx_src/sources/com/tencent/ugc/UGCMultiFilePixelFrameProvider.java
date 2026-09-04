package com.tencent.ugc;

import android.os.Looper;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.frame.PixelFrame;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class UGCMultiFilePixelFrameProvider implements UGCFrameQueue.UGCFrameQueueListener, UGCPixelFrameProvider {
    private static final String TAG = "UGCMultiFileVideoFrameProvider";
    private final List<Clip> mClipList;
    private final TXVideoJoiner.DurationControlMode mDurationControlMode;
    private final UGCFrameQueue<List<PixelFrame>> mPixelFrameListQueue;
    private final PixelFrame[] mPixelFrameStash;
    private final UGCPixelFrameProvider[] mProviderList;
    private final CustomHandler mSingleFileProviderHandler;
    private final CustomHandler mWorkHandler;
    private long mCurrentTimestamp = 0;
    private long mFrameDuration = 0;

    public UGCMultiFilePixelFrameProvider(List<Clip> list, TXVideoJoiner.DurationControlMode durationControlMode, CustomHandler customHandler) {
        UGCFrameQueue<List<PixelFrame>> uGCFrameQueue = new UGCFrameQueue<>();
        this.mPixelFrameListQueue = uGCFrameQueue;
        this.mProviderList = new UGCPixelFrameProvider[list.size()];
        this.mPixelFrameStash = new PixelFrame[list.size()];
        this.mClipList = list;
        this.mDurationControlMode = durationControlMode;
        this.mSingleFileProviderHandler = customHandler;
        this.mWorkHandler = new CustomHandler(Looper.myLooper());
        uGCFrameQueue.setUGCFrameQueueListener(this);
    }

    private void clearFrameCache() {
        int i10 = 0;
        while (true) {
            PixelFrame[] pixelFrameArr = this.mPixelFrameStash;
            if (i10 >= pixelFrameArr.length) {
                return;
            }
            PixelFrame pixelFrame = pixelFrameArr[i10];
            if (pixelFrame != null) {
                pixelFrame.release();
                this.mPixelFrameStash[i10] = null;
            }
            i10++;
        }
    }

    private void clearFrameQueue() {
        Iterator<List<PixelFrame>> it = this.mPixelFrameListQueue.dequeueAll().iterator();
        while (it.hasNext()) {
            PixelFrame.releasePixelFrames(it.next());
        }
    }

    private PixelFrame copyPixelFrame(PixelFrame pixelFrame) {
        if (!(pixelFrame instanceof GLTexturePool.TextureFrame)) {
            return null;
        }
        GLTexturePool.TextureFrame textureFrame = (GLTexturePool.TextureFrame) pixelFrame;
        return textureFrame.getGLTexture().wrap(textureFrame.getGLContext());
    }

    private PixelFrame getFrameFromProvider(int i10) {
        UGCPixelFrameProvider uGCPixelFrameProvider = this.mProviderList[i10];
        if (uGCPixelFrameProvider == null) {
            return null;
        }
        List<PixelFrame> listDequeue = uGCPixelFrameProvider.getFrameQueue().dequeue();
        if (listDequeue != UGCPixelFrameProvider.END_OF_STREAM) {
            return listDequeue.get(0);
        }
        uGCPixelFrameProvider.stop();
        uGCPixelFrameProvider.uninitialize();
        this.mProviderList[i10] = null;
        return null;
    }

    private boolean hasOneProviderMeetsEndOfStream() {
        for (UGCPixelFrameProvider uGCPixelFrameProvider : this.mProviderList) {
            if (uGCPixelFrameProvider == null) {
                return true;
            }
        }
        return false;
    }

    private boolean isAllProviderEndOfStream() {
        for (UGCPixelFrameProvider uGCPixelFrameProvider : this.mProviderList) {
            if (uGCPixelFrameProvider != null) {
                return false;
            }
        }
        return true;
    }

    private boolean isEndStream() {
        return this.mDurationControlMode == TXVideoJoiner.DurationControlMode.ALIGNS_TO_LONGEST ? isAllProviderEndOfStream() : hasOneProviderMeetsEndOfStream();
    }

    static /* synthetic */ void lambda$seekTo$2(UGCMultiFilePixelFrameProvider uGCMultiFilePixelFrameProvider, long j10, boolean z10) {
        for (UGCPixelFrameProvider uGCPixelFrameProvider : uGCMultiFilePixelFrameProvider.mProviderList) {
            if (uGCPixelFrameProvider != null) {
                uGCPixelFrameProvider.seekTo(j10, z10);
            }
        }
        uGCMultiFilePixelFrameProvider.mCurrentTimestamp = j10;
        uGCMultiFilePixelFrameProvider.clearFrameCache();
        uGCMultiFilePixelFrameProvider.clearFrameQueue();
        uGCMultiFilePixelFrameProvider.readFrameToQueue();
    }

    static /* synthetic */ void lambda$start$0(UGCMultiFilePixelFrameProvider uGCMultiFilePixelFrameProvider) {
        float f10 = -1.0f;
        for (int i10 = 0; i10 < uGCMultiFilePixelFrameProvider.mClipList.size(); i10++) {
            UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider = new UGCSingleFilePixelFrameProvider(uGCMultiFilePixelFrameProvider.mClipList.get(i10), uGCMultiFilePixelFrameProvider.mSingleFileProviderHandler);
            uGCSingleFilePixelFrameProvider.initialize();
            uGCSingleFilePixelFrameProvider.start();
            uGCMultiFilePixelFrameProvider.mProviderList[i10] = uGCSingleFilePixelFrameProvider;
            if (f10 < uGCMultiFilePixelFrameProvider.mClipList.get(i10).fps) {
                f10 = uGCMultiFilePixelFrameProvider.mClipList.get(i10).fps;
            }
        }
        uGCMultiFilePixelFrameProvider.mFrameDuration = (long) (f10 > 0.0f ? 1000.0f / f10 : 40.0f);
        uGCMultiFilePixelFrameProvider.readFrameToQueue();
    }

    static /* synthetic */ void lambda$stop$1(UGCMultiFilePixelFrameProvider uGCMultiFilePixelFrameProvider) {
        int i10 = 0;
        while (true) {
            UGCPixelFrameProvider[] uGCPixelFrameProviderArr = uGCMultiFilePixelFrameProvider.mProviderList;
            if (i10 >= uGCPixelFrameProviderArr.length) {
                uGCMultiFilePixelFrameProvider.clearFrameCache();
                uGCMultiFilePixelFrameProvider.clearFrameQueue();
                return;
            }
            UGCPixelFrameProvider uGCPixelFrameProvider = uGCPixelFrameProviderArr[i10];
            if (uGCPixelFrameProvider != null) {
                uGCPixelFrameProvider.stop();
                uGCMultiFilePixelFrameProvider.mProviderList[i10].uninitialize();
            }
            uGCMultiFilePixelFrameProvider.mProviderList[i10] = null;
            i10++;
        }
    }

    private void putOneFrameToList(PixelFrame pixelFrame, List<PixelFrame> list) {
        if (pixelFrame == null) {
            return;
        }
        if (pixelFrame.getTimestamp() == this.mCurrentTimestamp) {
            list.add(pixelFrame);
            pixelFrame.retain();
            return;
        }
        PixelFrame pixelFrameCopyPixelFrame = copyPixelFrame(pixelFrame);
        if (pixelFrameCopyPixelFrame != null) {
            pixelFrameCopyPixelFrame.setTimestamp(this.mCurrentTimestamp);
            pixelFrame = pixelFrameCopyPixelFrame;
        } else {
            pixelFrame.retain();
        }
        list.add(pixelFrame);
    }

    private void readFrameToCache() {
        PixelFrame frameFromProvider;
        for (int i10 = 0; i10 < this.mProviderList.length; i10++) {
            PixelFrame pixelFrame = this.mPixelFrameStash[i10];
            if ((pixelFrame == null || this.mCurrentTimestamp - pixelFrame.getTimestamp() > this.mFrameDuration / 2) && (frameFromProvider = getFrameFromProvider(i10)) != null) {
                this.mPixelFrameStash[i10] = frameFromProvider;
                if (pixelFrame != null) {
                    pixelFrame.release();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readFrameToQueue() {
        if (this.mPixelFrameListQueue.size() > 1) {
            return;
        }
        this.mCurrentTimestamp += this.mFrameDuration;
        readFrameToCache();
        if (isEndStream()) {
            this.mPixelFrameListQueue.queue(UGCPixelFrameProvider.END_OF_STREAM);
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (PixelFrame pixelFrame : this.mPixelFrameStash) {
            putOneFrameToList(pixelFrame, linkedList);
        }
        if (linkedList.isEmpty()) {
            this.mPixelFrameListQueue.queue(UGCPixelFrameProvider.END_OF_STREAM);
        } else {
            this.mPixelFrameListQueue.queue(linkedList);
        }
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public UGCFrameQueue<List<PixelFrame>> getFrameQueue() {
        return this.mPixelFrameListQueue;
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void initialize() {
        LiteavLog.i(TAG, "initialize");
    }

    @Override // com.tencent.ugc.UGCFrameQueue.UGCFrameQueueListener
    public void onFrameDequeued() {
        this.mWorkHandler.runOrPost(fa.a(this));
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void seekTo(long j10, boolean z10) {
        this.mWorkHandler.runOrPost(ez.a(this, j10, z10));
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void setMaxBufferFrameCount(int i10) {
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void setPlayEndPts(long j10) {
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void setReverse(boolean z10) {
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void start() {
        this.mWorkHandler.runOrPost(ex.a(this));
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void stop() {
        this.mWorkHandler.runOrPost(ey.a(this));
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void uninitialize() {
        stop();
    }
}
