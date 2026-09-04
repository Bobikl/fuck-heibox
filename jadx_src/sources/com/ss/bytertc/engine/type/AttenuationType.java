package com.ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes4.dex */
public enum AttenuationType {
    ATTENUATION_TYPE_NONE(0),
    ATTENUATION_TYPE_LINEAR(1),
    ATTENUATION_TYPE_EXPONENTIAL(2);

    private final int value;

    AttenuationType(int i10) {
        this.value = i10;
    }

    public int value() {
        return this.value;
    }
}
