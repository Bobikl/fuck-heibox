package com.bytedance.realx.video;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes6.dex */
public enum RXVideoRotation {
    VIDEO_ROTATION_0(0),
    VIDEO_ROTATION_90(90),
    VIDEO_ROTATION_180(180),
    VIDEO_ROTATION_270(270);

    private int value;

    RXVideoRotation(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static RXVideoRotation fromId(int i10) {
        for (RXVideoRotation rXVideoRotation : values()) {
            if (rXVideoRotation.value() == i10) {
                return rXVideoRotation;
            }
        }
        return null;
    }

    @CalledByNative
    public int value() {
        return this.value;
    }
}
