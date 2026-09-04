package com.ss.bytertc.engine.type;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum LocalVideoStreamError {
    LOCAL_VIDEO_STREAM_ERROR_OK(0),
    LOCAL_VIDEO_STREAM_ERROR_FAILURE(1),
    LOCAL_VIDEO_STREAM_ERROR_DEVICE_NO_PERMISSION(2),
    LOCAL_VIDEO_STREAM_ERROR_DEVICE_BUSY(3),
    LOCAL_VIDEO_STREAM_ERROR_DEVICE_NOT_FOUND(4),
    LOCAL_VIDEO_STREAM_ERROR_CAPTURE_FAILURE(5),
    LOCAL_VIDEO_STREAM_ERROR_ENCODE_FAILURE(6),
    LOCAL_VIDEO_STREAM_ERROR_DEVICE_DISCONNECTED(7);

    private int value;

    LocalVideoStreamError(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static LocalVideoStreamError fromId(int i10) {
        for (LocalVideoStreamError localVideoStreamError : values()) {
            if (localVideoStreamError.value() == i10) {
                return localVideoStreamError;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
