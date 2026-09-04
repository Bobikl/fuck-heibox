package com.ss.bytertc.engine.video;

/* JADX INFO: loaded from: classes4.dex */
public enum VideoRenderMirrorType {
    ON(1),
    OFF(2);

    private int value;

    VideoRenderMirrorType(int i10) {
        this.value = i10;
    }

    public static VideoRenderMirrorType convertFromInt(int i10) {
        if (i10 == 1) {
            return ON;
        }
        if (i10 == 2) {
            return OFF;
        }
        throw new IllegalArgumentException("VideoRenderMirrorType enum value invalidate: " + i10);
    }

    public int getValue() {
        return this.value;
    }
}
