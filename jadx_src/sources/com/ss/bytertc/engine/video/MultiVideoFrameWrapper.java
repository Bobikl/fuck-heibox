package com.ss.bytertc.engine.video;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class MultiVideoFrameWrapper {
    private final Type frameType;
    private final Object videoFrame;

    public enum Type {
        BYTE_RTC_FRAME,
        WEB_RTC_FRAME
    }

    public MultiVideoFrameWrapper(com.bytedance.realx.video.VideoFrame videoFrame) {
        this.videoFrame = videoFrame;
        this.frameType = Type.WEB_RTC_FRAME;
    }

    public MultiVideoFrameWrapper(VideoFrame videoFrame) {
        this.videoFrame = videoFrame;
        this.frameType = Type.BYTE_RTC_FRAME;
    }

    @CalledByNative
    public Object getVideoFrame() {
        return this.videoFrame;
    }

    @CalledByNative
    public boolean isByteRTCVideoFrame() {
        return this.frameType == Type.BYTE_RTC_FRAME;
    }

    @CalledByNative
    public boolean isWebRTCVideoFrame() {
        return this.frameType == Type.WEB_RTC_FRAME;
    }
}
