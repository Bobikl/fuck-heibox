package com.ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;
import com.ss.bytertc.engine.video.ScreenSharingParameters;

/* JADX INFO: loaded from: classes4.dex */
public class InternalScreenSharingParams {
    public int bitrate;
    public int frameRate;
    public int maxHeight;
    public int maxWidth;
    public int minBitrate;

    public InternalScreenSharingParams(int i10, int i11, int i12, int i13, int i14) {
        this.maxHeight = i11;
        this.maxWidth = i10;
        this.frameRate = i12;
        this.bitrate = i13;
        this.minBitrate = i14;
    }

    public InternalScreenSharingParams(ScreenSharingParameters screenSharingParameters) {
        this.maxWidth = 0;
        this.maxHeight = 0;
        this.frameRate = 15;
        this.bitrate = -1;
        this.minBitrate = 0;
        if (screenSharingParameters != null) {
            this.maxHeight = screenSharingParameters.maxHeight;
            this.maxWidth = screenSharingParameters.maxWidth;
            this.frameRate = screenSharingParameters.frameRate;
            this.bitrate = screenSharingParameters.bitrate;
            this.minBitrate = screenSharingParameters.minBitrate;
        }
    }

    @CalledByNative
    public int getBitrate() {
        return this.bitrate;
    }

    @CalledByNative
    public int getFrameRate() {
        return this.frameRate;
    }

    @CalledByNative
    public int getHeight() {
        return this.maxHeight;
    }

    @CalledByNative
    public int getMinBitrate() {
        return this.minBitrate;
    }

    @CalledByNative
    public int getWidth() {
        return this.maxWidth;
    }
}
