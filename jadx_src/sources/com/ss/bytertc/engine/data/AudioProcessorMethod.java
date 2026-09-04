package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum AudioProcessorMethod {
    AUDIO_FRAME_PROCESSOR_RECORD(0),
    AUDIO_FRAME_PROCESSOR_PLAYBACK(1),
    AUDIO_FRAME_PROCESSOR_REMOTE_USER(2),
    AUDIO_FRAME_PROCESSOR_EAR_MONITOR(3),
    AUDIO_FRAME_PROCESSOR_SCREEN(4);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.AudioProcessorMethod$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioProcessorMethod;

        static {
            int[] iArr = new int[AudioProcessorMethod.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioProcessorMethod = iArr;
            try {
                iArr[AudioProcessorMethod.AUDIO_FRAME_PROCESSOR_RECORD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioProcessorMethod[AudioProcessorMethod.AUDIO_FRAME_PROCESSOR_PLAYBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioProcessorMethod[AudioProcessorMethod.AUDIO_FRAME_PROCESSOR_REMOTE_USER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioProcessorMethod[AudioProcessorMethod.AUDIO_FRAME_PROCESSOR_EAR_MONITOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioProcessorMethod[AudioProcessorMethod.AUDIO_FRAME_PROCESSOR_SCREEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    AudioProcessorMethod(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static AudioProcessorMethod fromId(int i10) {
        for (AudioProcessorMethod audioProcessorMethod : values()) {
            if (audioProcessorMethod.value() == i10) {
                return audioProcessorMethod;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i10 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioProcessorMethod[ordinal()];
        if (i10 == 1) {
            return "AUDIO_FRAME_PROCESSOR_RECORD";
        }
        if (i10 == 2) {
            return "AUDIO_FRAME_PROCESSOR_PLAYBACK";
        }
        if (i10 == 3) {
            return "AUDIO_FRAME_PROCESSOR_REMOTE_USER";
        }
        if (i10 != 4) {
            return i10 != 5 ? "" : "AUDIO_FRAME_PROCESSOR_SCREEN";
        }
        return "AUDIO_FRAME_PROCESSOR_EAR_MONITOR";
    }

    public int value() {
        return this.value;
    }
}
