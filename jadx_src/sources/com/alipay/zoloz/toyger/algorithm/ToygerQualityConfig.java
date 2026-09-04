package com.alipay.zoloz.toyger.algorithm;

/* JADX INFO: loaded from: classes6.dex */
public class ToygerQualityConfig {
    public float blinkOpenness;
    public int depthCollectCount;
    public float depthMinQuality;
    public float eyeOcclusion;
    public float eyeOpenness;
    public float maxGaussian;
    public float maxMotion;
    public float maxPitch;
    public float maxYaw;
    public float max_iod;
    public float minBrightness;
    public float minFaceWidth;
    public float minIntegrity;
    public float minPitch;
    public float minQuality;
    public float minYaw;
    public float min_iod;
    public float stackTime;

    public ToygerQualityConfig() {
    }

    public ToygerQualityConfig(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25, float f26, int i10) {
        this.minBrightness = f10;
        this.minFaceWidth = f11;
        this.minIntegrity = f12;
        this.maxPitch = f13;
        this.maxYaw = f14;
        this.maxGaussian = f15;
        this.maxMotion = f16;
        this.minQuality = f17;
        this.stackTime = f18;
        this.min_iod = f19;
        this.max_iod = f20;
        this.blinkOpenness = f21;
        this.eyeOpenness = f22;
        this.eyeOcclusion = f23;
        this.minPitch = f24;
        this.minYaw = f25;
        this.depthCollectCount = i10;
        this.depthMinQuality = f26;
    }

    public String toString() {
        return "ToygerQualityConfig{minBrightness=" + this.minBrightness + ", minFaceWidth=" + this.minFaceWidth + ", minIntegrity=" + this.minIntegrity + ", maxPitch=" + this.maxPitch + ", maxYaw=" + this.maxYaw + ", maxGaussian=" + this.maxGaussian + ", maxMotion=" + this.maxMotion + ", minQuality=" + this.minQuality + ", stackTime=" + this.stackTime + ", min_iod=" + this.min_iod + ", max_iod=" + this.max_iod + ", blinkOpenness=" + this.blinkOpenness + ", eyeOpenness=" + this.eyeOpenness + ", eyeOcclusion=" + this.eyeOcclusion + ", minPitch=" + this.minPitch + ", minYaw=" + this.minYaw + ", depthMinQuality=" + this.depthMinQuality + ", depthCollectCount=" + this.depthCollectCount + '}';
    }
}
