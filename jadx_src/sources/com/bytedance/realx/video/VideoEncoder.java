package com.bytedance.realx.video;

import androidx.annotation.p0;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.video.memory.RXVideoFrameInterface;

/* JADX INFO: loaded from: classes6.dex */
public interface VideoEncoder {

    public enum BitrateMode {
        AUTO(0),
        VBR(1),
        CBR(2);

        private int value;

        BitrateMode(int i10) {
            this.value = i10;
        }

        static BitrateMode fromValue(int i10) {
            if (i10 == 0) {
                return AUTO;
            }
            if (i10 != 1) {
                return i10 != 2 ? AUTO : CBR;
            }
            return VBR;
        }
    }

    public interface Callback {
        void onEncodedFrame(EncodedImage encodedImage, CodecSpecificInfo codecSpecificInfo);
    }

    public static class CodecSpecificInfo {
        public RXVideoCodecStandard codec_standard;

        public CodecSpecificInfo(RXVideoCodecStandard rXVideoCodecStandard) {
            this.codec_standard = rXVideoCodecStandard;
        }
    }

    public enum EncodeMode {
        COMMON(0),
        CLOUD_GAME(1),
        CONFERENCE(2),
        LIVE(3);

        private int value;

        EncodeMode(int i10) {
            this.value = i10;
        }

        static EncodeMode fromValue(int i10) {
            if (i10 == 1) {
                return CLOUD_GAME;
            }
            if (i10 != 2) {
                return i10 != 3 ? COMMON : LIVE;
            }
            return CONFERENCE;
        }
    }

    public enum ScaleMode {
        AUTO(0),
        STRETCH(1),
        FIT_WITH_CROPPING(2),
        FIT_WITH_FILLING(3);

        private int value;

        ScaleMode(int i10) {
            this.value = i10;
        }

        static ScaleMode fromValue(int i10) {
            if (i10 == 0) {
                return AUTO;
            }
            if (i10 == 1) {
                return STRETCH;
            }
            if (i10 != 2) {
                return i10 != 3 ? AUTO : FIT_WITH_FILLING;
            }
            return FIT_WITH_CROPPING;
        }
    }

    public static class ScalingSettings {
        public static final ScalingSettings OFF = new ScalingSettings();

        @p0
        public final Integer high;

        @p0
        public final Integer low;
        public final boolean on;

        private ScalingSettings() {
            this.on = false;
            this.low = null;
            this.high = null;
        }

        public ScalingSettings(int i10, int i11) {
            this.on = true;
            this.low = Integer.valueOf(i10);
            this.high = Integer.valueOf(i11);
        }

        @Deprecated
        public ScalingSettings(boolean z10) {
            this.on = z10;
            this.low = null;
            this.high = null;
        }

        @Deprecated
        public ScalingSettings(boolean z10, int i10, int i11) {
            this.on = z10;
            this.low = Integer.valueOf(i10);
            this.high = Integer.valueOf(i11);
        }

        public String toString() {
            if (!this.on) {
                return "OFF";
            }
            return "[ " + this.low + ", " + this.high + " ]";
        }
    }

    public static class Settings {
        public final int bFrameNum;
        public final BitrateMode bitrateMode;
        public final boolean closeSetProfile;
        public final boolean enableQpSetting;
        public final EncodeMode encodeMode;
        public final int height;
        public final int matrixId;
        public final int maxIQp;
        public final int maxQp;
        public final int minIQp;
        public final int minQp;
        public final int primaryId;
        public final int rangeId;
        public final ScaleMode scaleMode;
        public final EglBase14.Context sharedContext;
        public int targetBps;
        public final int targetFps;
        public final int targetKeyFrameIntervalMs;
        public final int temporalLayerNum;
        public final int transferId;
        public final boolean useSurfaceMode;
        public final int width;

        @CalledByNative("Settings")
        public Settings(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, boolean z10, int i23, int i24, int i25, boolean z11, boolean z12, int i26, int i27, EglBase.Context context) {
            this.width = i10;
            this.height = i11;
            this.scaleMode = ScaleMode.fromValue(i12);
            this.targetBps = i13;
            this.targetFps = i14;
            this.primaryId = i15;
            this.transferId = i16;
            this.matrixId = i17;
            this.rangeId = i18;
            this.maxQp = i19;
            this.minQp = i20;
            this.temporalLayerNum = i23;
            this.bitrateMode = BitrateMode.fromValue(i24);
            this.targetKeyFrameIntervalMs = i25;
            this.closeSetProfile = z11;
            this.useSurfaceMode = z12;
            this.maxIQp = i21;
            this.minIQp = i22;
            this.bFrameNum = i27;
            this.enableQpSetting = z10;
            this.encodeMode = EncodeMode.fromValue(i26);
            if (context instanceof EglBase14.Context) {
                this.sharedContext = (EglBase14.Context) context;
            } else {
                this.sharedContext = null;
            }
        }
    }

    @CalledByNative
    VideoCodecStatus encode(RXVideoFrameInterface rXVideoFrameInterface, boolean z10);

    @CalledByNative
    VideoCodecStatus initEncode(Settings settings, Callback callback);

    @CalledByNative
    VideoCodecStatus release();

    @CalledByNative
    VideoCodecStatus requestKeyFrame();

    @CalledByNative
    VideoCodecStatus setPrivateParam(String str, String str2);

    @CalledByNative
    VideoCodecStatus setRateAllocation(int i10, int i11);
}
