package com.ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes4.dex */
public enum AudioSelectionPriority {
    AUDIO_SELECTION_PRIORITY_NORMAL(0),
    AUDIO_SELECTION_PRIORITY_HIGIH(1);

    private int value;

    AudioSelectionPriority(int i10) {
        this.value = i10;
    }

    public int value() {
        return this.value;
    }
}
