package com.ss.bytertc.engine.video;

/* JADX INFO: loaded from: classes4.dex */
public enum VideoApplyRotation {
    DEFAULT(-1),
    DEGREE_0(0);

    private int value;

    VideoApplyRotation(int i10) {
        this.value = i10;
    }

    public static VideoApplyRotation convertFromInt(int i10) {
        if (i10 == -1) {
            return DEFAULT;
        }
        if (i10 == 0) {
            return DEGREE_0;
        }
        throw new IllegalArgumentException("VideoApplyRotation enum value invalidate: " + i10);
    }

    public int getValue() {
        return this.value;
    }
}
