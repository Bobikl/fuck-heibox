package com.ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes4.dex */
public enum AudioDumpStatus {
    AUDIO_DUMP_START_FAILURE(0),
    AUDIO_DUMP_START_SUCCESS(1),
    AUDIO_DUMP_STOP_FAILURE(2),
    AUDIO_DUMP_STOP_SUCCESS(3),
    AUDIO_DUMP_RUNNING_FAILURE(4),
    AUDIO_DUMP_RUNNING_SUCCESS(5);

    private int value;

    AudioDumpStatus(int i10) {
        this.value = i10;
    }

    public static AudioDumpStatus fromId(int i10) {
        for (AudioDumpStatus audioDumpStatus : values()) {
            if (audioDumpStatus.value() == i10) {
                return audioDumpStatus;
            }
        }
        return AUDIO_DUMP_START_FAILURE;
    }

    public int value() {
        return this.value;
    }
}
