package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum VideoRotationMode {
    FOLLOW_APP(0),
    FOLLOW_GSENSOR(1);

    private int value;

    VideoRotationMode(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static VideoRotationMode fromId(int i10) {
        for (VideoRotationMode videoRotationMode : values()) {
            if (videoRotationMode.value() == i10) {
                return videoRotationMode;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this == FOLLOW_GSENSOR ? "kVideoRotationModeFollowGSensor" : "kVideoRotationModeFollowApp";
    }

    public int value() {
        return this.value;
    }
}
