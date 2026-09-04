package com.ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class InternalRemoteStreamStats {
    public InternalRemoteAudioStats audioStats;
    public boolean isScreen;
    public int rxQuality;
    public int txQuality;
    public String uid;
    public InternalRemoteVideoStats videoStats;

    public InternalRemoteStreamStats() {
    }

    public InternalRemoteStreamStats(String str, InternalRemoteAudioStats internalRemoteAudioStats, InternalRemoteVideoStats internalRemoteVideoStats, boolean z10, int i10, int i11) {
        this.uid = str;
        this.audioStats = internalRemoteAudioStats;
        this.videoStats = internalRemoteVideoStats;
        this.isScreen = z10;
        this.txQuality = i10;
        this.rxQuality = i11;
    }

    @CalledByNative
    public static InternalRemoteStreamStats create(String str, InternalRemoteAudioStats internalRemoteAudioStats, InternalRemoteVideoStats internalRemoteVideoStats, boolean z10, int i10, int i11) {
        return new InternalRemoteStreamStats(str, internalRemoteAudioStats, internalRemoteVideoStats, z10, i10, i11);
    }
}
