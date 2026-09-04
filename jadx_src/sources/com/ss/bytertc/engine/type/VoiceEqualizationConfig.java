package com.ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes4.dex */
public class VoiceEqualizationConfig {
    public VoiceEqualizationBandFrequency frequency;
    public int gain;

    public VoiceEqualizationConfig(VoiceEqualizationBandFrequency voiceEqualizationBandFrequency, int i10) {
        this.frequency = voiceEqualizationBandFrequency;
        this.gain = i10;
    }

    public String toString() {
        return "the frequency: " + this.frequency + ", the gain: " + this.gain;
    }
}
