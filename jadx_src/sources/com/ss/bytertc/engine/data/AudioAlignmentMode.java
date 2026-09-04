package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum AudioAlignmentMode {
    AUDIO_ALIGNMENT_MODE_OFF(0),
    AUDIO_ALIGNMENT_MODE_AUDIOMIXING(1);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.AudioAlignmentMode$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioAlignmentMode;

        static {
            int[] iArr = new int[AudioAlignmentMode.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioAlignmentMode = iArr;
            try {
                iArr[AudioAlignmentMode.AUDIO_ALIGNMENT_MODE_OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioAlignmentMode[AudioAlignmentMode.AUDIO_ALIGNMENT_MODE_AUDIOMIXING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    AudioAlignmentMode(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static AudioAlignmentMode fromId(int i10) {
        for (AudioAlignmentMode audioAlignmentMode : values()) {
            if (audioAlignmentMode.value() == i10) {
                return audioAlignmentMode;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i10 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioAlignmentMode[ordinal()];
        return (i10 == 1 || i10 != 2) ? "kAudioAlignmentModeOff" : "kAudioAlignmentModeAudioMixing";
    }

    public int value() {
        return this.value;
    }
}
