package com.ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class InternalVideoCaptureConfig {
    public int capturePreference;
    public int frameRate;
    public int height;
    public int width;

    public InternalVideoCaptureConfig(int i10, int i11, int i12, int i13) {
        this.capturePreference = i10;
        this.width = i11;
        this.height = i12;
        this.frameRate = i13;
    }

    @CalledByNative
    public int getCapturePreference() {
        return this.capturePreference;
    }

    @CalledByNative
    public int getFrameRate() {
        return this.frameRate;
    }

    @CalledByNative
    public int getHeight() {
        return this.height;
    }

    @CalledByNative
    public int getWidth() {
        return this.width;
    }
}
