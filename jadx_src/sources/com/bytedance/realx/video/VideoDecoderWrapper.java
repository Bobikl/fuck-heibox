package com.bytedance.realx.video;

import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.video.memory.RXVideoFrameInterface;

/* JADX INFO: loaded from: classes6.dex */
public class VideoDecoderWrapper {
    VideoDecoderWrapper() {
    }

    @CalledByNative
    static VideoDecoder.Callback createDecoderCallback(final long j10) {
        return new VideoDecoder.Callback() { // from class: com.bytedance.realx.video.VideoDecoderWrapper.1
            @Override // com.bytedance.realx.video.VideoDecoder.Callback
            public void onDecodedFrame(RXVideoFrameInterface rXVideoFrameInterface) {
                long j11 = j10;
                if (j11 != 0) {
                    VideoDecoderWrapper.nativeOnDecodedFrame(j11, rXVideoFrameInterface);
                }
            }

            @Override // com.bytedance.realx.video.VideoDecoder.Callback
            public void onDecoderInited(long j11) {
                long j12 = j10;
                if (j12 != 0) {
                    VideoDecoderWrapper.nativeOnDecoderInited(j12, j11);
                }
            }

            @Override // com.bytedance.realx.video.VideoDecoder.Callback
            public void onMediaCodecStatus(VideoCodecStatus videoCodecStatus, String str) {
                if (j10 == 0 || str == null || str.length() == 0) {
                    return;
                }
                VideoDecoderWrapper.nativeOnMediaCodecStatus(j10, videoCodecStatus, str);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnDecodedFrame(long j10, RXVideoFrameInterface rXVideoFrameInterface);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnDecoderInited(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnMediaCodecStatus(long j10, VideoCodecStatus videoCodecStatus, String str);
}
