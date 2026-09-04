package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum AudioQuality {
    AUDIO_QUALITY_LOW(0),
    AUDIO_QUALITY_MEDIUM(1),
    AUDIO_QUALITY_HIGH(2),
    AUDIO_QUALITY_ULTRA_HIGH(3);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.AudioQuality$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioQuality;

        static {
            int[] iArr = new int[AudioQuality.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioQuality = iArr;
            try {
                iArr[AudioQuality.AUDIO_QUALITY_LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioQuality[AudioQuality.AUDIO_QUALITY_MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioQuality[AudioQuality.AUDIO_QUALITY_HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioQuality[AudioQuality.AUDIO_QUALITY_ULTRA_HIGH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    AudioQuality(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static AudioQuality fromId(int i10) {
        for (AudioQuality audioQuality : values()) {
            if (audioQuality.value() == i10) {
                return audioQuality;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i10 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioQuality[ordinal()];
        if (i10 == 1) {
            return "kAudioQualityLow";
        }
        if (i10 == 2) {
            return "kAudioQualityMedium";
        }
        if (i10 != 3) {
            return i10 != 4 ? "" : "kAudioQualityUltraHigh";
        }
        return "kAudioQualityHigh";
    }

    public int value() {
        return this.value;
    }
}
