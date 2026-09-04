package com.ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes4.dex */
public class VoiceReverbConfig {
    public float damping;
    public float decayTime;
    public float dryGain;
    public float preDelay;
    public float roomSize;
    public float wetGain;

    public VoiceReverbConfig(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.roomSize = f10;
        this.decayTime = f11;
        this.damping = f12;
        this.wetGain = f13;
        this.dryGain = f14;
        this.preDelay = f15;
    }

    public String toString() {
        return "VoiceReverbConfig, room_size: " + this.roomSize + ", decay_time: " + this.decayTime + ", damping: " + this.damping + ", wet_gain: " + this.wetGain + ", dry_gain: " + this.dryGain + ", pre_delay: " + this.preDelay;
    }
}
