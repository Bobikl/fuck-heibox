package com.bytedance.realx.video;

import android.view.Surface;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.video.memory.RXVideoFrameInterface;

/* JADX INFO: loaded from: classes6.dex */
public interface VideoDecoder {

    public interface Callback {
        void onDecodedFrame(RXVideoFrameInterface rXVideoFrameInterface);

        void onDecoderInited(long j10);

        void onMediaCodecStatus(VideoCodecStatus videoCodecStatus, String str);
    }

    public static class DecodeInfo {
        public final boolean isMissingFrames;
        public final long renderTimeMs;

        public DecodeInfo(boolean z10, long j10) {
            this.isMissingFrames = z10;
            this.renderTimeMs = j10;
        }
    }

    public static class Settings {
        public final boolean enableBFrameDecode;
        public final boolean enableRecreateByResolution;
        public final boolean enableSmoothOutput;
        public final boolean enableSurfaceTextureReuse;
        public final boolean enableYUVOutput;
        public final int height;
        public final boolean latencyInsensitiveMode;
        public final int numberOfCores;
        public final boolean outputByDts;
        public final int width;

        @CalledByNative("Settings")
        public Settings(int i10, int i11, int i12, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
            this.numberOfCores = i10;
            this.width = i11;
            this.height = i12;
            this.outputByDts = z10;
            this.enableSmoothOutput = z11;
            this.enableYUVOutput = z12;
            this.latencyInsensitiveMode = z13;
            this.enableSurfaceTextureReuse = z14;
            this.enableRecreateByResolution = z15;
            this.enableBFrameDecode = z16;
        }
    }

    @CalledByNative
    long createNativeVideoDecoder();

    @CalledByNative
    VideoCodecStatus decode(EncodedImage encodedImage);

    @CalledByNative
    void disableExternalSurface();

    @CalledByNative
    String getImplementationName();

    @CalledByNative
    boolean getPrefersLateDecoding();

    @CalledByNative
    VideoCodecStatus initDecode(Settings settings, Callback callback);

    @CalledByNative
    void onFrame(RXVideoFrameInterface rXVideoFrameInterface);

    @CalledByNative
    VideoCodecStatus release();

    @CalledByNative
    VideoCodecStatus setDeliverParams(boolean z10, int i10, float f10, float f11, int i11);

    @CalledByNative
    void setExternalSurface(Surface surface);

    @CalledByNative
    VideoCodecStatus setPrivateParam(String str, String str2);

    @CalledByNative
    VideoCodecStatus updateSettings(Settings settings);
}
