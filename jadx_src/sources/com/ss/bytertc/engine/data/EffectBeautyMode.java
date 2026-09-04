package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum EffectBeautyMode {
    WHITE(0),
    SMOOTH(1),
    SHARPEN(2),
    CLEAR(3);

    private int value;

    EffectBeautyMode(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static EffectBeautyMode fromId(int i10) {
        for (EffectBeautyMode effectBeautyMode : values()) {
            if (effectBeautyMode.value() == i10) {
                return effectBeautyMode;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        if (this == WHITE) {
            return "kEffectBeautyWhiteMode";
        }
        if (this == SMOOTH) {
            return "kEffectBeautySmoothMode";
        }
        if (this == SHARPEN) {
            return "kEffectBeautySharpenMode";
        }
        return this == CLEAR ? "kEffectBeautyClearMode" : "";
    }

    public int value() {
        return this.value;
    }
}
