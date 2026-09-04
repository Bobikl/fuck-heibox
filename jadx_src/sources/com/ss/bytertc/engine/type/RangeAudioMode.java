package com.ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes4.dex */
public enum RangeAudioMode {
    RANGE_AUDIO_MODE_UNDEFINED(0),
    RANGE_AUDIO_MODE_TEAM(1),
    RANGE_AUDIO_MODE_WORLD(2);

    private int value;

    RangeAudioMode(int i10) {
        this.value = i10;
    }

    public int value() {
        return this.value;
    }
}
