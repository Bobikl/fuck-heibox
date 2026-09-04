package com.ss.bytertc.engine.type;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum UserVisibilityChangeError {
    OK(0),
    UNKNOWN(1),
    TOO_MANY_VISIBLE_USER(2);

    private int value;

    UserVisibilityChangeError(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static UserVisibilityChangeError fromId(int i10) {
        for (UserVisibilityChangeError userVisibilityChangeError : values()) {
            if (userVisibilityChangeError.value() == i10) {
                return userVisibilityChangeError;
            }
        }
        return UNKNOWN;
    }

    public int value() {
        return this.value;
    }
}
