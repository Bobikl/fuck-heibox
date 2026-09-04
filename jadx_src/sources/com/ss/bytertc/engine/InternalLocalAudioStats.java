package com.ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class InternalLocalAudioStats {
    public float audioLossRate;
    public int jitter;
    public int numChannels;
    public int recordSampleRate;
    public int rtt;
    public int sendKBitrate;
    public int sentSampleRate;
    public int statsInterval;

    public InternalLocalAudioStats() {
    }

    public InternalLocalAudioStats(float f10, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.audioLossRate = f10;
        this.sendKBitrate = i10;
        this.recordSampleRate = i11;
        this.statsInterval = i12;
        this.rtt = i13;
        this.numChannels = i14;
        this.sentSampleRate = i15;
        this.jitter = i16;
    }

    @CalledByNative
    private static InternalLocalAudioStats create(float f10, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        return new InternalLocalAudioStats(f10, i10, i11, i12, i13, i14, i15, i16);
    }
}
