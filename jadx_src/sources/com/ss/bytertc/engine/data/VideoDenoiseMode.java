package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum VideoDenoiseMode {
    VIDEO_DENOISE_MODE_OFF(0),
    VIDEO_DENOISE_MODE_AUTO(1);

    private int value;

    VideoDenoiseMode(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static VideoDenoiseMode fromId(int i10) {
        for (VideoDenoiseMode videoDenoiseMode : values()) {
            if (videoDenoiseMode.value() == i10) {
                return videoDenoiseMode;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i10 = this.value;
        if (i10 != 0) {
            return i10 != 1 ? "" : "kVideoDenoiseModeAuto";
        }
        return "kVideoDenoiseModeOff";
    }

    public int value() {
        return this.value;
    }
}
