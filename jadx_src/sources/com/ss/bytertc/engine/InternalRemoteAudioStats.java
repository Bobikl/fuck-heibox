package com.ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class InternalRemoteAudioStats {
    public float audioLossRate;
    public int concealedSamples;
    public int concealmentEvent;
    public int decDuration;
    public int decSampleRate;
    public long e2eDelay;
    public int frozenRate;
    public int jitter;
    public int jitterBufferDelay;
    public int numChannels;
    public int playoutSampleRate;
    public int quality;
    public int receivedKBitrate;
    public int receivedSampleRate;
    public int rtt;
    public int stallCount;
    public int stallDuration;
    public int statsInterval;
    public int totalRtt;

    public InternalRemoteAudioStats() {
    }

    public InternalRemoteAudioStats(float f10, int i10, int i11, int i12, long j10, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26) {
        this.audioLossRate = f10;
        this.receivedKBitrate = i10;
        this.stallCount = i11;
        this.stallDuration = i12;
        this.e2eDelay = j10;
        this.statsInterval = i14;
        this.rtt = i15;
        this.totalRtt = i16;
        this.quality = i17;
        this.jitterBufferDelay = i18;
        this.numChannels = i19;
        this.receivedSampleRate = i20;
        this.frozenRate = i21;
        this.concealedSamples = i22;
        this.concealmentEvent = i23;
        this.decSampleRate = i24;
        this.decDuration = i25;
        this.jitter = i26;
    }

    @CalledByNative
    private static InternalRemoteAudioStats create(float f10, int i10, int i11, int i12, long j10, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26) {
        return new InternalRemoteAudioStats(f10, i10, i11, i12, j10, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26);
    }
}
