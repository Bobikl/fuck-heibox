package com.ss.bytertc.engine.type;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum LocalVideoStreamState {
    LOCAL_VIDEO_STREAM_STATE_STOPPED(0),
    LOCAL_VIDEO_STREAM_STATE_RECORDING(1),
    LOCAL_VIDEO_STREAM_STATE_ENCODING(2),
    LOCAL_VIDEO_STREAM_STATE_FAILED(3);

    private int value;

    @CalledByNative
    LocalVideoStreamState(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static LocalVideoStreamState fromId(int i10) {
        for (LocalVideoStreamState localVideoStreamState : values()) {
            if (localVideoStreamState.value() == i10) {
                return localVideoStreamState;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
