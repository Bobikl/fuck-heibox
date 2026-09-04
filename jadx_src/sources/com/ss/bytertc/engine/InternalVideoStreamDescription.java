package com.ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class InternalVideoStreamDescription {
    public VideoEncoderPreference encodePreference;
    public int frameRate;
    public int height;
    public int maxKbps;
    public int minKbps;
    public int width;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.InternalVideoStreamDescription$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$CodecMode;
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$EncoderPreference;
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$VideoCodecType;

        static {
            int[] iArr = new int[VideoStreamDescription.EncoderPreference.values().length];
            $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$EncoderPreference = iArr;
            try {
                iArr[VideoStreamDescription.EncoderPreference.Disabled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$EncoderPreference[VideoStreamDescription.EncoderPreference.MaintainFramerate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$EncoderPreference[VideoStreamDescription.EncoderPreference.MaintainQuality.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$EncoderPreference[VideoStreamDescription.EncoderPreference.Balance.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[VideoStreamDescription.VideoCodecType.values().length];
            $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$VideoCodecType = iArr2;
            try {
                iArr2[VideoStreamDescription.VideoCodecType.CODEC_TYPE_AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$VideoCodecType[VideoStreamDescription.VideoCodecType.CODEC_TYPE_H264.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$VideoCodecType[VideoStreamDescription.VideoCodecType.CODEC_TYPE_BYTEVC1.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[VideoStreamDescription.CodecMode.values().length];
            $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$CodecMode = iArr3;
            try {
                iArr3[VideoStreamDescription.CodecMode.CODEC_MODE_AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$CodecMode[VideoStreamDescription.CodecMode.CODEC_MODE_HARDWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$CodecMode[VideoStreamDescription.CodecMode.CODEC_MODE_SOFTWARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public enum VideoCodecMode {
        VIDEO_CODEC_MODE_AUTO(0),
        VIDEO_CODEC_MODE_HARDWARE(1),
        VIDEO_CODEC_MODE_SOFTWARE(2);

        private int value;

        VideoCodecMode(int i10) {
            this.value = i10;
        }

        @CalledByNative("VideoCodecMode")
        public int getIntValue() {
            return this.value;
        }
    }

    public enum VideoCodecType {
        VIDEO_CODEC_TYPE_AUTO(0),
        VIDEO_CODEC_TYPE_H264(1),
        VIDEO_CODEC_TYPE_BYTEVC1(2);

        private int value;

        VideoCodecType(int i10) {
            this.value = i10;
        }

        @CalledByNative("VideoCodecType")
        public int getIntValue() {
            return this.value;
        }
    }

    public enum VideoEncoderPreference {
        VIDEO_ENCODER_PREFERENCE_DISABLED(0),
        VIDEO_ENCODER_PREFERENCE_MAINTAIN_FRAMERATE(1),
        VIDEO_ENCODER_PREFERENCE_MAINTAIN_QUALITY(2),
        VIDEO_ENCODER_PREFERENCE_BALANCE(3);

        private int value;

        VideoEncoderPreference(int i10) {
            this.value = i10;
        }

        @CalledByNative("VideoEncoderPreference")
        public int getIntValue() {
            return this.value;
        }
    }

    public InternalVideoStreamDescription(VideoStreamDescription videoStreamDescription) {
        this.minKbps = 0;
        this.encodePreference = VideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_MAINTAIN_FRAMERATE;
        this.width = ((Integer) videoStreamDescription.videoSize.first).intValue();
        this.height = ((Integer) videoStreamDescription.videoSize.second).intValue();
        this.frameRate = videoStreamDescription.frameRate;
        this.maxKbps = videoStreamDescription.maxKbps;
        this.minKbps = videoStreamDescription.minKbps;
        this.encodePreference = ConvertEnumValue(videoStreamDescription.encodePreference);
    }

    private VideoCodecMode ConvertEnumValue(VideoStreamDescription.CodecMode codecMode) {
        VideoCodecMode videoCodecMode = VideoCodecMode.VIDEO_CODEC_MODE_AUTO;
        int i10 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$CodecMode[codecMode.ordinal()];
        if (i10 == 1) {
            return videoCodecMode;
        }
        if (i10 != 2) {
            return i10 != 3 ? videoCodecMode : VideoCodecMode.VIDEO_CODEC_MODE_SOFTWARE;
        }
        return VideoCodecMode.VIDEO_CODEC_MODE_HARDWARE;
    }

    private VideoCodecType ConvertEnumValue(VideoStreamDescription.VideoCodecType videoCodecType) {
        VideoCodecType videoCodecType2 = VideoCodecType.VIDEO_CODEC_TYPE_AUTO;
        int i10 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$VideoCodecType[videoCodecType.ordinal()];
        if (i10 == 1) {
            return videoCodecType2;
        }
        if (i10 != 2) {
            return i10 != 3 ? videoCodecType2 : VideoCodecType.VIDEO_CODEC_TYPE_BYTEVC1;
        }
        return VideoCodecType.VIDEO_CODEC_TYPE_H264;
    }

    private VideoEncoderPreference ConvertEnumValue(VideoStreamDescription.EncoderPreference encoderPreference) {
        VideoEncoderPreference videoEncoderPreference = VideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_MAINTAIN_FRAMERATE;
        int i10 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$EncoderPreference[encoderPreference.ordinal()];
        if (i10 == 1) {
            return VideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_DISABLED;
        }
        if (i10 == 2) {
            return videoEncoderPreference;
        }
        if (i10 != 3) {
            return i10 != 4 ? videoEncoderPreference : VideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_BALANCE;
        }
        return VideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_MAINTAIN_QUALITY;
    }

    @CalledByNative
    VideoEncoderPreference getEncoderPreference() {
        return this.encodePreference;
    }

    @CalledByNative
    int getFrameRate() {
        return this.frameRate;
    }

    @CalledByNative
    int getHeight() {
        return this.height;
    }

    @CalledByNative
    int getMaxKBps() {
        return this.maxKbps;
    }

    @CalledByNative
    int getMinKBps() {
        return this.minKbps;
    }

    @CalledByNative
    int getWidth() {
        return this.width;
    }
}
