package com.ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes4.dex */
public enum SubtitleMode {
    SUBTITLE_MODE_RECOGINTE(0),
    SUBTITLE_MODE_TRANSLATION(1);

    private int value;

    SubtitleMode(int i10) {
        this.value = i10;
    }

    public static SubtitleMode fromId(int i10) {
        for (SubtitleMode subtitleMode : values()) {
            if (subtitleMode.value() == i10) {
                return subtitleMode;
            }
        }
        return SUBTITLE_MODE_RECOGINTE;
    }

    public int value() {
        return this.value;
    }
}
