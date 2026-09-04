package com.ss.bytertc.ktv.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum AudioTrackType {
    ORIGINAL(1),
    ACCOMPANY(2);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.ktv.data.AudioTrackType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$ktv$data$AudioTrackType;

        static {
            int[] iArr = new int[AudioTrackType.values().length];
            $SwitchMap$com$ss$bytertc$ktv$data$AudioTrackType = iArr;
            try {
                iArr[AudioTrackType.ACCOMPANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$AudioTrackType[AudioTrackType.ORIGINAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    AudioTrackType(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static AudioTrackType fromId(int i10) {
        for (AudioTrackType audioTrackType : values()) {
            if (audioTrackType.value() == i10) {
                return audioTrackType;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i10 = AnonymousClass1.$SwitchMap$com$ss$bytertc$ktv$data$AudioTrackType[ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? "" : "AUDIO_TRACK_TYPE_ORIGINAL";
        }
        return "AUDIO_TRACK_TYPE_ACCOMPANY";
    }

    public int value() {
        return this.value;
    }
}
