package com.ss.bytertc.engine.type;

import bb.c;
import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum PublicStreamErrorCode {
    ERROR_CODE_SUCCESS(0),
    ERROR_CODE_PUSH_PARAM_ERROR(c.b.Vj),
    ERROR_CODE_PUSH_STATE_ERROR(c.b.Wj),
    ERROR_CODE_PUSH_INTERNAL_ERROR(c.b.Xj),
    ERROR_CODE_PUSH_ERROR(c.b.Zj),
    ERROR_CODE_PUSH_TIMEOUT(c.b.f30525ak),
    ERROR_CODE_PULL_NO_PUSH_STREAM(1300);

    private final int value;

    PublicStreamErrorCode(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static PublicStreamErrorCode fromId(int i10) {
        for (PublicStreamErrorCode publicStreamErrorCode : values()) {
            if (publicStreamErrorCode.value() == i10) {
                return publicStreamErrorCode;
            }
        }
        return ERROR_CODE_SUCCESS;
    }

    public int value() {
        return this.value;
    }
}
