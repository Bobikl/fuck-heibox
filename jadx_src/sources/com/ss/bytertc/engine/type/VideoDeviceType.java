package com.ss.bytertc.engine.type;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum VideoDeviceType {
    VIDEO_DEVICE_TYPE_UNKNOWN(-1),
    VIDEO_DEVICE_TYPE_RENDER_DEVICE(0),
    VIDEO_DEVICE_TYPE_CAPTURE_DEVICE(1),
    VIDEO_DEVICE_TYPE_SCREEN_CAPTURE_DEVICE(2);

    private final int value;

    VideoDeviceType() {
        this.value = 0;
    }

    VideoDeviceType(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static VideoDeviceType fromId(int i10) {
        for (VideoDeviceType videoDeviceType : values()) {
            if (videoDeviceType.value() == i10) {
                return videoDeviceType;
            }
        }
        return VIDEO_DEVICE_TYPE_UNKNOWN;
    }

    public int value() {
        return this.value;
    }
}
