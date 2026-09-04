package com.ss.bytertc.engine.video;

/* JADX INFO: loaded from: classes4.dex */
public enum LocalVideoRenderPosition {
    AFTER_CAPTURE(0),
    AFTER_PREPROCESS(1);

    private int value;

    LocalVideoRenderPosition(int i10) {
        this.value = i10;
    }

    public static LocalVideoRenderPosition convertFromInt(int i10) {
        return values()[i10];
    }

    public int getValue() {
        return this.value;
    }
}
