package com.ss.bytertc.engine.type;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum EffectErrorType {
    OK(0),
    EFFECT_ERROR_VIRTUAL_BACKFROUND_FAILURE(1),
    EFFECT_ERROR_CHILD_PROC_TERMINATE(2);

    private int value;

    EffectErrorType(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static EffectErrorType fromId(int i10) {
        for (EffectErrorType effectErrorType : values()) {
            if (effectErrorType.value() == i10) {
                return effectErrorType;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
