package com.ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes4.dex */
public enum SubtitleState {
    SUBTITLE_STATE_STARTED(0),
    SUBTITLE_STATE_STOPED(1),
    SUBTITLE_STATE_ERROR(2);

    private int value;

    SubtitleState(int i10) {
        this.value = i10;
    }

    public static SubtitleState fromId(int i10) {
        for (SubtitleState subtitleState : values()) {
            if (subtitleState.value() == i10) {
                return subtitleState;
            }
        }
        return SUBTITLE_STATE_ERROR;
    }

    public int value() {
        return this.value;
    }
}
