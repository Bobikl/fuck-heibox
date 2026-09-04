package com.ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.VideoCodecType;
import com.ss.bytertc.engine.data.VideoPictureType;
import com.ss.bytertc.engine.data.VideoRotation;
import com.ss.bytertc.engine.engineimpl.RTCVideoImpl;
import com.ss.bytertc.engine.mediaio.ILocalEncodedVideoFrameObserver;
import com.ss.bytertc.engine.mediaio.RTCEncodedVideoFrame;
import com.ss.bytertc.engine.video.VideoStream;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class RTCLocalEncodedVideoFrameObserver {
    private static final String TAG = "RTCLocalEncodedVideoFrameObserver";
    private WeakReference<RTCVideoImpl> mRtcVideoImpl;

    public RTCLocalEncodedVideoFrameObserver(RTCVideoImpl rTCVideoImpl) {
        this.mRtcVideoImpl = new WeakReference<>(rTCVideoImpl);
    }

    @CalledByNative
    void onLocalEncodedVideoFrame(int i10, VideoStream videoStream, long j10, long j11, int i11, int i12, int i13) {
        RTCVideoImpl rTCVideoImpl;
        ILocalEncodedVideoFrameObserver encodedVideoFrameObserver;
        if (videoStream == null) {
            return;
        }
        WeakReference<RTCVideoImpl> weakReference = this.mRtcVideoImpl;
        if (weakReference != null && (rTCVideoImpl = weakReference.get()) != null && (encodedVideoFrameObserver = rTCVideoImpl.getEncodedVideoFrameObserver()) != null) {
            encodedVideoFrameObserver.onLocalEncodedVideoFrame(StreamIndex.fromId(i10), new RTCEncodedVideoFrame(videoStream.getBuffer().getData(), j10, j11, videoStream.getWidth(), videoStream.getHeight(), VideoCodecType.fromId(i11), VideoPictureType.fromId(i12), VideoRotation.fromId(i13)));
        }
        videoStream.release();
    }
}
