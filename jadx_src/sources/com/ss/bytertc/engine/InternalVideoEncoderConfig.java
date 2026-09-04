package com.ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class InternalVideoEncoderConfig {
    public InternalVideoEncoderPreference encodePreference;
    public int frameRate;
    public int height;
    public int maxBitrate;
    public int minBitrate;
    public int width;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.InternalVideoEncoderConfig$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$CodecMode;
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$EncoderPreference;
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$VideoCodecType;

        static {
            int[] iArr = new int[VideoEncoderConfig.EncoderPreference.values().length];
            $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$EncoderPreference = iArr;
            try {
                iArr[VideoEncoderConfig.EncoderPreference.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$EncoderPreference[VideoEncoderConfig.EncoderPreference.MAINTAIN_FRAMERATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$EncoderPreference[VideoEncoderConfig.EncoderPreference.MAINTAIN_QUALITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$EncoderPreference[VideoEncoderConfig.EncoderPreference.BALANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[VideoEncoderConfig.VideoCodecType.values().length];
            $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$VideoCodecType = iArr2;
            try {
                iArr2[VideoEncoderConfig.VideoCodecType.CODEC_TYPE_AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$VideoCodecType[VideoEncoderConfig.VideoCodecType.CODEC_TYPE_H264.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$VideoCodecType[VideoEncoderConfig.VideoCodecType.CODEC_TYPE_BYTEVC1.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[VideoEncoderConfig.CodecMode.values().length];
            $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$CodecMode = iArr3;
            try {
                iArr3[VideoEncoderConfig.CodecMode.CODEC_MODE_AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$CodecMode[VideoEncoderConfig.CodecMode.CODEC_MODE_HARDWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$CodecMode[VideoEncoderConfig.CodecMode.CODEC_MODE_SOFTWARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public enum InternalVideoCodecMode {
        VIDEO_CODEC_MODE_AUTO(0),
        VIDEO_CODEC_MODE_HARDWARE(1),
        VIDEO_CODEC_MODE_SOFTWARE(2);

        private int value;

        InternalVideoCodecMode(int i10) {
            this.value = i10;
        }

        @CalledByNative("InternalVideoCodecMode")
        public int getIntValue() {
            return this.value;
        }
    }

    public enum InternalVideoCodecType {
        VIDEO_CODEC_TYPE_AUTO(0),
        VIDEO_CODEC_TYPE_H264(1),
        VIDEO_CODEC_TYPE_BYTEVC1(2);

        private int value;

        InternalVideoCodecType(int i10) {
            this.value = i10;
        }

        @CalledByNative("InternalVideoCodecType")
        public int getIntValue() {
            return this.value;
        }
    }

    public enum InternalVideoEncoderPreference {
        VIDEO_ENCODER_PREFERENCE_DISABLED(0),
        VIDEO_ENCODER_PREFERENCE_MAINTAIN_FRAMERATE(1),
        VIDEO_ENCODER_PREFERENCE_MAINTAIN_QUALITY(2),
        VIDEO_ENCODER_PREFERENCE_BALANCE(3);

        private int value;

        InternalVideoEncoderPreference(int i10) {
            this.value = i10;
        }

        @CalledByNative("InternalVideoEncoderPreference")
        public int getIntValue() {
            return this.value;
        }
    }

    public InternalVideoEncoderConfig(VideoEncoderConfig videoEncoderConfig) {
        this.minBitrate = 0;
        this.encodePreference = InternalVideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_MAINTAIN_FRAMERATE;
        this.width = videoEncoderConfig.width;
        this.height = videoEncoderConfig.height;
        this.frameRate = videoEncoderConfig.frameRate;
        this.maxBitrate = videoEncoderConfig.maxBitrate;
        this.minBitrate = videoEncoderConfig.minBitrate;
        this.encodePreference = ConvertEnumValue(videoEncoderConfig.encodePreference);
    }

    private InternalVideoCodecMode ConvertEnumValue(VideoEncoderConfig.CodecMode codecMode) {
        InternalVideoCodecMode internalVideoCodecMode = InternalVideoCodecMode.VIDEO_CODEC_MODE_AUTO;
        int i10 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$CodecMode[codecMode.ordinal()];
        if (i10 == 1) {
            return internalVideoCodecMode;
        }
        if (i10 != 2) {
            return i10 != 3 ? internalVideoCodecMode : InternalVideoCodecMode.VIDEO_CODEC_MODE_SOFTWARE;
        }
        return InternalVideoCodecMode.VIDEO_CODEC_MODE_HARDWARE;
    }

    private InternalVideoCodecType ConvertEnumValue(VideoEncoderConfig.VideoCodecType videoCodecType) {
        InternalVideoCodecType internalVideoCodecType = InternalVideoCodecType.VIDEO_CODEC_TYPE_AUTO;
        int i10 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$VideoCodecType[videoCodecType.ordinal()];
        if (i10 == 1) {
            return internalVideoCodecType;
        }
        if (i10 != 2) {
            return i10 != 3 ? internalVideoCodecType : InternalVideoCodecType.VIDEO_CODEC_TYPE_BYTEVC1;
        }
        return InternalVideoCodecType.VIDEO_CODEC_TYPE_H264;
    }

    private InternalVideoEncoderPreference ConvertEnumValue(VideoEncoderConfig.EncoderPreference encoderPreference) {
        InternalVideoEncoderPreference internalVideoEncoderPreference = InternalVideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_MAINTAIN_FRAMERATE;
        int i10 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$EncoderPreference[encoderPreference.ordinal()];
        if (i10 == 1) {
            return InternalVideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_DISABLED;
        }
        if (i10 == 2) {
            return internalVideoEncoderPreference;
        }
        if (i10 != 3) {
            return i10 != 4 ? internalVideoEncoderPreference : InternalVideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_BALANCE;
        }
        return InternalVideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_MAINTAIN_QUALITY;
    }

    @CalledByNative
    InternalVideoEncoderPreference getEncoderPreference() {
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
        return this.maxBitrate;
    }

    @CalledByNative
    int getMinKBps() {
        return this.minBitrate;
    }

    @CalledByNative
    int getWidth() {
        return this.width;
    }
}
