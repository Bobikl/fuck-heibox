package com.ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes4.dex */
public enum BackgroundMode {
    BACKGROUND_A(0),
    BACKGROUND_B(1),
    BLUR(2),
    NONE(3);

    private int value;

    BackgroundMode(int i10) {
        this.value = i10;
    }

    public int value() {
        return this.value;
    }
}
