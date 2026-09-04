package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum VideoPictureType {
    VIDEO_PICTURE_TYPE_UNKNOWN(0),
    VIDEO_PICTURE_TYPE_I(1),
    VIDEO_PICTURE_TYPE_P(2),
    VIDEO_PICTURE_TYPE_B(3);

    int value;

    VideoPictureType(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static VideoPictureType fromId(int i10) {
        for (VideoPictureType videoPictureType : values()) {
            if (videoPictureType.value() == i10) {
                return videoPictureType;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
