package com.ss.bytertc.engine.type;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum VideoDeviceFacing {
    FRONT(0),
    BACK(1),
    UNKNOWN(2);

    private int value;

    VideoDeviceFacing(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static VideoDeviceFacing fromId(int i10) {
        for (VideoDeviceFacing videoDeviceFacing : values()) {
            if (videoDeviceFacing.value() == i10) {
                return videoDeviceFacing;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
