package com.ss.bytertc.base.media;

import android.graphics.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.TextureBufferImpl;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.realx.video.YuvConverter;

/* JADX INFO: loaded from: classes10.dex */
public class Texture2DToWebRTCVideoFrame {
    Handler mHandler;
    Matrix mMat;
    boolean needPendingRelease;
    YuvConverter yuvConverter = new YuvConverter();
    boolean isReleased = false;
    boolean isFrameInUse = false;

    @CalledByNative
    public Texture2DToWebRTCVideoFrame() {
        this.mHandler = null;
        this.needPendingRelease = false;
        HandlerThread handlerThread = new HandlerThread("Texture2DToVideoFrame");
        handlerThread.start();
        this.mHandler = new Handler(handlerThread.getLooper());
        this.needPendingRelease = false;
        Matrix matrix = new Matrix();
        this.mMat = matrix;
        matrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$1() {
        this.yuvConverter.release();
        this.mHandler.getLooper().quit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseFrame$0() {
        this.yuvConverter.release();
        this.mHandler.getLooper().quit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseFrame() {
        this.isFrameInUse = false;
        if (!this.needPendingRelease || this.isReleased) {
            return;
        }
        this.isReleased = true;
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.bytertc.base.media.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f97930b.lambda$releaseFrame$0();
            }
        });
    }

    @CalledByNative
    public VideoFrame convertTexture2DToWebRTCVideoFrame(int i10, int i11, int i12) {
        if (this.needPendingRelease || this.isReleased) {
            return null;
        }
        this.isFrameInUse = true;
        return new VideoFrame(new TextureBufferImpl(i11, i12, VideoFrame.TextureBuffer.Type.RGB, i10, this.mMat, this.mHandler, this.yuvConverter, new Runnable() { // from class: com.ss.bytertc.base.media.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f97931b.releaseFrame();
            }
        }), 0, 0L);
    }

    @CalledByNative
    public boolean isFameInUse() {
        return this.isFrameInUse;
    }

    @CalledByNative
    public void release() {
        if (this.isFrameInUse) {
            this.needPendingRelease = true;
        } else {
            this.isReleased = true;
            ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.bytertc.base.media.t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f97929b.lambda$release$1();
                }
            });
        }
    }
}
