package com.alipay.zoloz.toyger.algorithm;

/* JADX INFO: loaded from: classes6.dex */
public class ToygerLivenessConfig {
    public float batLivenessThreshold;
    public String collection;
    public float dragonflyMax;
    public float dragonflyMin;
    public float eye_blink_threshold;
    public float eye_occlusion_threshold;
    public boolean fppPreProcess;
    public float geminiMax;
    public float geminiMin;
    public String livenessCombinations;

    public ToygerLivenessConfig() {
        this.batLivenessThreshold = 0.5f;
        this.dragonflyMin = 0.0f;
        this.dragonflyMax = 0.5f;
        this.geminiMin = 0.0f;
        this.geminiMax = 0.0f;
        this.eye_occlusion_threshold = 0.8f;
        this.eye_blink_threshold = 0.2f;
        this.fppPreProcess = false;
    }

    public ToygerLivenessConfig(String str, float f10, float f11, float f12, float f13, float f14, boolean z10) {
        this.eye_occlusion_threshold = 0.8f;
        this.eye_blink_threshold = 0.2f;
        this.livenessCombinations = str;
        this.batLivenessThreshold = f10;
        this.dragonflyMin = f11;
        this.dragonflyMax = f12;
        this.geminiMin = f13;
        this.geminiMax = f14;
        this.fppPreProcess = z10;
    }

    public String toString() {
        return "ToygerLivenessConfig{livenessCombinations='" + this.livenessCombinations + "', collection='" + this.collection + "', batLivenessThreshold=" + this.batLivenessThreshold + ", dragonflyMin=" + this.dragonflyMin + ", dragonflyMax=" + this.dragonflyMax + ", geminiMin=" + this.geminiMin + ", geminiMax=" + this.geminiMax + '}';
    }
}
