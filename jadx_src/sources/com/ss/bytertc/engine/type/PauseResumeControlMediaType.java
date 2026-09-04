package com.ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes4.dex */
public enum PauseResumeControlMediaType {
    AUDIO(0),
    VIDEO(1),
    AUDIO_AND_VIDEO(2);

    private int value;

    PauseResumeControlMediaType(int i10) {
        this.value = i10;
    }

    public int value() {
        return this.value;
    }
}
