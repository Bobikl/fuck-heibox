package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum VideoRotation {
    VIDEO_ROTATION_0(0),
    VIDEO_ROTATION_90(90),
    VIDEO_ROTATION_180(180),
    VIDEO_ROTATION_270(270);

    private int value;

    VideoRotation(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static VideoRotation fromId(int i10) {
        for (VideoRotation videoRotation : values()) {
            if (videoRotation.value() == i10) {
                return videoRotation;
            }
        }
        return null;
    }

    @CalledByNative
    public int value() {
        return this.value;
    }
}
