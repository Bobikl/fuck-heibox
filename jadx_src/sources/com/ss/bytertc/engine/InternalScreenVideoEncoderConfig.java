package com.ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class InternalScreenVideoEncoderConfig {
    public InternalScreenVideoEncoderPreference encodePreference;
    public int frameRate;
    public int height;
    public int maxBitrate;
    public int minBitrate;
    public int width;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.InternalScreenVideoEncoderConfig$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$ScreenVideoEncoderConfig$EncoderPreference;

        static {
            int[] iArr = new int[ScreenVideoEncoderConfig.EncoderPreference.values().length];
            $SwitchMap$com$ss$bytertc$engine$ScreenVideoEncoderConfig$EncoderPreference = iArr;
            try {
                iArr[ScreenVideoEncoderConfig.EncoderPreference.MaintainFramerate.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$ScreenVideoEncoderConfig$EncoderPreference[ScreenVideoEncoderConfig.EncoderPreference.MaintainQuality.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum InternalScreenVideoEncoderPreference {
        SCREEN_VIDEO_ENCODER_PREFERENCE_MAINTAIN_FRAMERATE(1),
        SCREEN_VIDEO_ENCODER_PREFERENCE_MAINTAIN_QUALITY(2);

        private int value;

        InternalScreenVideoEncoderPreference(int i10) {
            this.value = i10;
        }

        @CalledByNative("InternalScreenVideoEncoderPreference")
        public int getIntValue() {
            return this.value;
        }
    }

    public InternalScreenVideoEncoderConfig(ScreenVideoEncoderConfig screenVideoEncoderConfig) {
        this.minBitrate = 0;
        this.encodePreference = InternalScreenVideoEncoderPreference.SCREEN_VIDEO_ENCODER_PREFERENCE_MAINTAIN_FRAMERATE;
        this.width = screenVideoEncoderConfig.width;
        this.height = screenVideoEncoderConfig.height;
        this.frameRate = screenVideoEncoderConfig.frameRate;
        this.maxBitrate = screenVideoEncoderConfig.maxBitrate;
        this.minBitrate = screenVideoEncoderConfig.minBitrate;
        this.encodePreference = ConvertEnumValue(screenVideoEncoderConfig.encodePreference);
    }

    private InternalScreenVideoEncoderPreference ConvertEnumValue(ScreenVideoEncoderConfig.EncoderPreference encoderPreference) {
        InternalScreenVideoEncoderPreference internalScreenVideoEncoderPreference = InternalScreenVideoEncoderPreference.SCREEN_VIDEO_ENCODER_PREFERENCE_MAINTAIN_FRAMERATE;
        int i10 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$ScreenVideoEncoderConfig$EncoderPreference[encoderPreference.ordinal()];
        return (i10 == 1 || i10 != 2) ? internalScreenVideoEncoderPreference : InternalScreenVideoEncoderPreference.SCREEN_VIDEO_ENCODER_PREFERENCE_MAINTAIN_QUALITY;
    }

    @CalledByNative
    InternalScreenVideoEncoderPreference getEncoderPreference() {
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
