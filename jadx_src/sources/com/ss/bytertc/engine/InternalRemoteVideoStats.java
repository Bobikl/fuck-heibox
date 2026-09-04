package com.ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class InternalRemoteVideoStats {
    public int codecType;
    public int decoderOutputFrameRate;
    public long e2eDelay;
    public int frozenRate;
    public int height;
    public boolean isScreen;
    public int jitter;
    public float receivedKBitrate;
    public int rendererOutputFrameRate;
    public int rtt;
    public int stallCount;
    public int stallDuration;
    public int statsInterval;
    public int superResolutionMode;
    public int videoIndex;
    public float videoLossRate;
    public int width;

    public InternalRemoteVideoStats() {
    }

    public InternalRemoteVideoStats(int i10, int i11, float f10, float f11, int i12, int i13, int i14, int i15, long j10, boolean z10, int i16, int i17, int i18, int i19, int i20, int i21, int i22) {
        this.width = i10;
        this.height = i11;
        this.videoLossRate = f10;
        this.receivedKBitrate = f11;
        this.decoderOutputFrameRate = i12;
        this.rendererOutputFrameRate = i13;
        this.stallCount = i14;
        this.stallDuration = i15;
        this.e2eDelay = j10;
        this.isScreen = z10;
        this.statsInterval = i16;
        this.rtt = i17;
        this.frozenRate = i18;
        this.codecType = i19;
        this.videoIndex = i20;
        this.jitter = i21;
        this.superResolutionMode = i22;
    }

    @CalledByNative
    private static InternalRemoteVideoStats create(int i10, int i11, float f10, float f11, int i12, int i13, int i14, int i15, long j10, boolean z10, int i16, int i17, int i18, int i19, int i20, int i21, int i22) {
        return new InternalRemoteVideoStats(i10, i11, f10, f11, i12, i13, i14, i15, j10, z10, i16, i17, i18, i19, i20, i21, i22);
    }
}
