package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum AudioMixingDualMonoMode {
    AUDIO_MIXING_DUAL_MONO_MODE_AUTO(0),
    AUDIO_MIXING_DUAL_MONO_MODE_L(1),
    AUDIO_MIXING_DUAL_MONO_MODE_R(2),
    AUDIO_MIXING_DUAL_MONO_MODE_MIX(3);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.AudioMixingDualMonoMode$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioMixingDualMonoMode;

        static {
            int[] iArr = new int[AudioMixingDualMonoMode.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioMixingDualMonoMode = iArr;
            try {
                iArr[AudioMixingDualMonoMode.AUDIO_MIXING_DUAL_MONO_MODE_AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioMixingDualMonoMode[AudioMixingDualMonoMode.AUDIO_MIXING_DUAL_MONO_MODE_L.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioMixingDualMonoMode[AudioMixingDualMonoMode.AUDIO_MIXING_DUAL_MONO_MODE_R.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioMixingDualMonoMode[AudioMixingDualMonoMode.AUDIO_MIXING_DUAL_MONO_MODE_MIX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    AudioMixingDualMonoMode(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static AudioMixingDualMonoMode fromId(int i10) {
        for (AudioMixingDualMonoMode audioMixingDualMonoMode : values()) {
            if (audioMixingDualMonoMode.value() == i10) {
                return audioMixingDualMonoMode;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i10 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioMixingDualMonoMode[ordinal()];
        if (i10 == 1) {
            return "AUDIO_MIXING_DUAL_MONO_MODE_AUTO";
        }
        if (i10 == 2) {
            return "AUDIO_MIXING_DUAL_MONO_MODE_L";
        }
        if (i10 != 3) {
            return i10 != 4 ? "" : "AUDIO_MIXING_DUAL_MONO_MODE_MIX";
        }
        return "AUDIO_MIXING_DUAL_MONO_MODE_R";
    }

    public int value() {
        return this.value;
    }
}
