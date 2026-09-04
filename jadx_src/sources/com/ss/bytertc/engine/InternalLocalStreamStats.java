package com.ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class InternalLocalStreamStats {
    public InternalLocalAudioStats audioStats;
    public boolean isScreen;
    public int rxQuality;
    public int txQuality;
    public InternalLocalVideoStats videoStats;

    public InternalLocalStreamStats() {
    }

    public InternalLocalStreamStats(InternalLocalAudioStats internalLocalAudioStats, InternalLocalVideoStats internalLocalVideoStats, boolean z10, int i10, int i11) {
        this.audioStats = internalLocalAudioStats;
        this.videoStats = internalLocalVideoStats;
        this.isScreen = z10;
        this.txQuality = i10;
        this.rxQuality = i11;
    }

    @CalledByNative
    public static InternalLocalStreamStats create(InternalLocalAudioStats internalLocalAudioStats, InternalLocalVideoStats internalLocalVideoStats, boolean z10, int i10, int i11) {
        return new InternalLocalStreamStats(internalLocalAudioStats, internalLocalVideoStats, z10, i10, i11);
    }
}
