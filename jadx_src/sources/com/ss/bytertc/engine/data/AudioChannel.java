package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum AudioChannel {
    AUDIO_CHANNEL_AUTO(-1),
    AUDIO_CHANNEL_MONO(1),
    AUDIO_CHANNEL_STEREO(2);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.AudioChannel$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioChannel;

        static {
            int[] iArr = new int[AudioChannel.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioChannel = iArr;
            try {
                iArr[AudioChannel.AUDIO_CHANNEL_AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioChannel[AudioChannel.AUDIO_CHANNEL_MONO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioChannel[AudioChannel.AUDIO_CHANNEL_STEREO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    AudioChannel(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static AudioChannel fromId(int i10) {
        for (AudioChannel audioChannel : values()) {
            if (audioChannel.value() == i10) {
                return audioChannel;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i10 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioChannel[ordinal()];
        if (i10 == 1) {
            return "kAudioChannelAuto";
        }
        if (i10 != 2) {
            return i10 != 3 ? "kAudioChannelUnknown" : "kAudioChannelStereo";
        }
        return "kAudioChannelMono";
    }

    public int value() {
        return this.value;
    }
}
