package com.ss.bytertc.engine.live;

import android.opengl.EGL14;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.video.VideoFrame;
import com.ss.bytertc.engine.video.impl.WebrtcWrapperVideoFrame;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class PushMixedStreamToCDNObserver {
    private Map<String, IMixedStreamObserver> mLiveTransObserver = new HashMap();
    private Map<String, Boolean> mSupportClientPushStream = new HashMap();

    @CalledByNative
    public boolean isSupportClientPushStream(String str) {
        Map<String, Boolean> map = this.mSupportClientPushStream;
        if (map == null || !map.containsKey(str)) {
            return false;
        }
        return this.mSupportClientPushStream.get(str).booleanValue();
    }

    @CalledByNative
    public void onCacheSyncVideoFrames(String str, String[] strArr, VideoFrame[] videoFrameArr, byte[][] bArr, int i10) {
        Map<String, IMixedStreamObserver> map = this.mLiveTransObserver;
        if (map == null || !map.containsKey(str)) {
            return;
        }
        WebrtcWrapperVideoFrame[] webrtcWrapperVideoFrameArr = new WebrtcWrapperVideoFrame[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            webrtcWrapperVideoFrameArr[i11] = videoFrameArr[i11].getBuffer().getBufferType() == 4 ? new WebrtcWrapperVideoFrame(videoFrameArr[i11], EGL14.eglGetCurrentContext()) : new WebrtcWrapperVideoFrame(videoFrameArr[i11], null);
            videoFrameArr[i11].release();
        }
        this.mLiveTransObserver.get(str).onCacheSyncVideoFrames(str, strArr, webrtcWrapperVideoFrameArr, bArr, i10);
    }

    @CalledByNative
    public void onMixingAudioFrame(String str, byte[] bArr, int i10, long j10) {
        Map<String, IMixedStreamObserver> map = this.mLiveTransObserver;
        if (map == null || !map.containsKey(str)) {
            return;
        }
        this.mLiveTransObserver.get(str).onMixingAudioFrame(str, bArr, i10, j10);
    }

    @CalledByNative
    public void onMixingDataFrame(String str, byte[] bArr, long j10) {
        Map<String, IMixedStreamObserver> map = this.mLiveTransObserver;
        if (map == null || !map.containsKey(str)) {
            return;
        }
        this.mLiveTransObserver.get(str).onMixingDataFrame(str, bArr, j10);
    }

    @CalledByNative
    public void onMixingEvent(ByteRTCStreamMixingEvent byteRTCStreamMixingEvent, String str, ByteRTCTranscoderErrorCode byteRTCTranscoderErrorCode, MixedStreamType mixedStreamType) {
        Map<String, IMixedStreamObserver> map = this.mLiveTransObserver;
        if (map == null || !map.containsKey(str)) {
            return;
        }
        this.mLiveTransObserver.get(str).onMixingEvent(byteRTCStreamMixingEvent, str, byteRTCTranscoderErrorCode, mixedStreamType);
    }

    @CalledByNative
    public void onMixingVideoFrame(String str, VideoFrame videoFrame) {
        Map<String, IMixedStreamObserver> map = this.mLiveTransObserver;
        if (map == null || !map.containsKey(str)) {
            return;
        }
        this.mLiveTransObserver.get(str).onMixingVideoFrame(str, videoFrame.getBuffer().getBufferType() == 4 ? new WebrtcWrapperVideoFrame(videoFrame, EGL14.eglGetCurrentContext()) : new WebrtcWrapperVideoFrame(videoFrame, null));
        videoFrame.release();
    }

    public void setUserObserver(String str, IMixedStreamObserver iMixedStreamObserver) {
        if (this.mLiveTransObserver == null) {
            this.mLiveTransObserver = new HashMap();
        }
        if (this.mSupportClientPushStream == null) {
            this.mSupportClientPushStream = new HashMap();
        }
        this.mLiveTransObserver.put(str, iMixedStreamObserver);
        if (iMixedStreamObserver != null) {
            this.mSupportClientPushStream.put(str, Boolean.valueOf(iMixedStreamObserver.isSupportClientPushStream()));
        } else {
            this.mSupportClientPushStream.put(str, Boolean.FALSE);
        }
    }
}
