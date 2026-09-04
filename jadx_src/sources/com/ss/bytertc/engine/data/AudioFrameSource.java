package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum AudioFrameSource {
    AUDIO_FRAME_SOURCE_MIC(0),
    AUDIO_FRAME_SOURCE_PLAYBACK(1),
    AUDIO_FRAME_SOURCE_MIXED(2);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.AudioFrameSource$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioFrameSource;

        static {
            int[] iArr = new int[AudioFrameSource.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioFrameSource = iArr;
            try {
                iArr[AudioFrameSource.AUDIO_FRAME_SOURCE_MIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioFrameSource[AudioFrameSource.AUDIO_FRAME_SOURCE_PLAYBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioFrameSource[AudioFrameSource.AUDIO_FRAME_SOURCE_MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    AudioFrameSource(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static AudioFrameSource fromId(int i10) {
        for (AudioFrameSource audioFrameSource : values()) {
            if (audioFrameSource.value() == i10) {
                return audioFrameSource;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i10 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioFrameSource[ordinal()];
        if (i10 == 1) {
            return "kAudioFrameSourceMic";
        }
        if (i10 != 2) {
            return i10 != 3 ? "" : "kAudioFrameSourceMixed";
        }
        return "kAudioFrameSourcePlayback";
    }

    public int value() {
        return this.value;
    }
}
