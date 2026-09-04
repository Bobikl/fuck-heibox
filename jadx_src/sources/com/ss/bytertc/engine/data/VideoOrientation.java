package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum VideoOrientation {
    ADAPTIVE(0),
    PORTRAIT(1),
    LANDSCAPE(2);

    private int value;

    VideoOrientation(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static VideoOrientation fromId(int i10) {
        for (VideoOrientation videoOrientation : values()) {
            if (videoOrientation.value() == i10) {
                return videoOrientation;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i10 = this.value;
        if (i10 == 0) {
            return "kVideoOrientationAdaptive";
        }
        if (i10 != 1) {
            return i10 != 2 ? "" : "kVideoOrientationLandscape";
        }
        return "kVideoOrientationPortrait";
    }

    public int value() {
        return this.value;
    }
}
