package com.ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class SubscribeVideoBaseline {
    public int acceptableBadVideoFpsBaseline;
    public int acceptableBadVideoPixelBaseline;
    public int acceptableGoodVideoFpsBaseline;
    public int acceptableGoodVideoPixelBaseline;
    public int acceptableMinVideoResolutionHeight;
    public int acceptableMinVideoResolutionWidth;
    public int streamPriority;

    public SubscribeVideoBaseline(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.acceptableGoodVideoPixelBaseline = i10;
        this.acceptableGoodVideoFpsBaseline = i11;
        this.acceptableBadVideoPixelBaseline = i12;
        this.acceptableBadVideoFpsBaseline = i13;
        this.acceptableMinVideoResolutionWidth = i14;
        this.acceptableMinVideoResolutionHeight = i15;
        this.streamPriority = i16;
    }

    @CalledByNative
    public int getAcceptableBadVideoFpsBaseline() {
        return this.acceptableBadVideoFpsBaseline;
    }

    @CalledByNative
    public int getAcceptableBadVideoPixelBaseline() {
        return this.acceptableBadVideoPixelBaseline;
    }

    @CalledByNative
    public int getAcceptableGoodVideoFpsBaseline() {
        return this.acceptableGoodVideoFpsBaseline;
    }

    @CalledByNative
    public int getAcceptableGoodVideoPixelBaseline() {
        return this.acceptableGoodVideoPixelBaseline;
    }

    @CalledByNative
    public int getAcceptableMinVideoResolutionHeight() {
        return this.acceptableMinVideoResolutionHeight;
    }

    @CalledByNative
    public int getAcceptableMinVideoResolutionWidth() {
        return this.acceptableMinVideoResolutionWidth;
    }

    @CalledByNative
    public int getStreamPriority() {
        return this.streamPriority;
    }
}
