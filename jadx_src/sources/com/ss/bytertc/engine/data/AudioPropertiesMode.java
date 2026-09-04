package com.ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes4.dex */
public enum AudioPropertiesMode {
    AUDIO_PROPERTIES_MODE_MICROPHONE(0),
    AUDIO_PROPERTIES_MODE_AUDIOMIXING(1);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.AudioPropertiesMode$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioPropertiesMode;

        static {
            int[] iArr = new int[AudioPropertiesMode.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioPropertiesMode = iArr;
            try {
                iArr[AudioPropertiesMode.AUDIO_PROPERTIES_MODE_MICROPHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioPropertiesMode[AudioPropertiesMode.AUDIO_PROPERTIES_MODE_AUDIOMIXING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    AudioPropertiesMode(int i10) {
        this.value = i10;
    }

    public static AudioPropertiesMode fromId(int i10) {
        for (AudioPropertiesMode audioPropertiesMode : values()) {
            if (audioPropertiesMode.value() == i10) {
                return audioPropertiesMode;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i10 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioPropertiesMode[ordinal()];
        return (i10 == 1 || i10 != 2) ? "AUDIO_PROPERTIES_MODE_MICROPHONE" : "AUDIO_PROPERTIES_MODE_AUDIOMIXING";
    }

    public int value() {
        return this.value;
    }
}
