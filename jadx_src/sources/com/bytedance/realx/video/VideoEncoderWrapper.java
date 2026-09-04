package com.bytedance.realx.video;

import androidx.annotation.p0;
import com.bytedance.realx.base.CalledByNative;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public class VideoEncoderWrapper {
    VideoEncoderWrapper() {
    }

    @CalledByNative
    static VideoEncoder.Callback createEncoderCallback(final long j10) {
        return new VideoEncoder.Callback() { // from class: com.bytedance.realx.video.e0
            @Override // com.bytedance.realx.video.VideoEncoder.Callback
            public final void onEncodedFrame(EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
                VideoEncoderWrapper.lambda$createEncoderCallback$0(j10, encodedImage, codecSpecificInfo);
            }
        };
    }

    @CalledByNative
    @p0
    static Integer getScalingSettingsHigh(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.high;
    }

    @CalledByNative
    @p0
    static Integer getScalingSettingsLow(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.low;
    }

    @CalledByNative
    static boolean getScalingSettingsOn(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.on;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createEncoderCallback$0(long j10, EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
        nativeOnEncodedFrame(j10, encodedImage.buffer, encodedImage.encodedWidth, encodedImage.encodedHeight, encodedImage.captureTimeNs, encodedImage.frameType.getNative(), codecSpecificInfo.codec_standard.toInt(), encodedImage.svcLayerNum, encodedImage.compositionTimeUs);
    }

    private static native void nativeOnEncodedFrame(long j10, ByteBuffer byteBuffer, int i10, int i11, long j11, int i12, int i13, int i14, long j12);
}
