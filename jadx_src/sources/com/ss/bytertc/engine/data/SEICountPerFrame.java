package com.ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes4.dex */
public enum SEICountPerFrame {
    SEI_COUNT_PER_FRAME_SINGLE(0),
    SEI_COUNT_PER_FRAME_MULTI(1);

    private int value;

    SEICountPerFrame(int i10) {
        this.value = i10;
    }

    public static SEICountPerFrame fromId(int i10) {
        for (SEICountPerFrame sEICountPerFrame : values()) {
            if (sEICountPerFrame.value() == i10) {
                return sEICountPerFrame;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
