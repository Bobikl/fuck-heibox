package com.ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class InternalLocalVideoStats {
    public int codecType;
    public int encodedBitrate;
    public int encodedFrameCount;
    public int encodedFrameHeight;
    public int encodedFrameWidth;
    public int encoderOutputFrameRate;
    public int inputFrameRate;
    public boolean isScreen;
    public int jitter;
    public int rendererOutputFrameRate;
    public int rtt;
    public int sentFrameRate;
    public float sentKBitrate;
    public int statsInterval;
    public int videoDenoiseMode;
    public float videoLossRate;

    public InternalLocalVideoStats() {
    }

    public InternalLocalVideoStats(float f10, int i10, int i11, int i12, int i13, int i14, float f11, int i15, int i16, int i17, int i18, int i19, int i20, boolean z10, int i21, int i22) {
        this.sentKBitrate = f10;
        this.inputFrameRate = i10;
        this.sentFrameRate = i11;
        this.encoderOutputFrameRate = i12;
        this.rendererOutputFrameRate = i13;
        this.statsInterval = i14;
        this.videoLossRate = f11;
        this.rtt = i15;
        this.encodedBitrate = i16;
        this.encodedFrameWidth = i17;
        this.encodedFrameHeight = i18;
        this.encodedFrameCount = i19;
        this.codecType = i20;
        this.isScreen = z10;
        this.jitter = i21;
        this.videoDenoiseMode = i22;
    }

    @CalledByNative
    private static InternalLocalVideoStats create(float f10, int i10, int i11, int i12, int i13, int i14, float f11, int i15, int i16, int i17, int i18, int i19, int i20, boolean z10, int i21, int i22) {
        return new InternalLocalVideoStats(f10, i10, i11, i12, i13, i14, f11, i15, i16, i17, i18, i19, i20, z10, i21, i22);
    }
}
