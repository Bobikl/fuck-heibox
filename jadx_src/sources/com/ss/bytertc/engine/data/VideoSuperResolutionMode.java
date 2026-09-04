package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum VideoSuperResolutionMode {
    VIDEO_SUPER_RESOLUTION_MODE_OFF(0),
    VIDEO_SUPER_RESOLUTION_MODE_ON(1);

    private int value;

    VideoSuperResolutionMode(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static VideoSuperResolutionMode fromId(int i10) {
        for (VideoSuperResolutionMode videoSuperResolutionMode : values()) {
            if (videoSuperResolutionMode.value() == i10) {
                return videoSuperResolutionMode;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i10 = this.value;
        if (i10 != 0) {
            return i10 != 1 ? "" : "kVideoSuperResolutionModeOn";
        }
        return "kVideoSuperResolutionModeOff";
    }

    public int value() {
        return this.value;
    }
}
