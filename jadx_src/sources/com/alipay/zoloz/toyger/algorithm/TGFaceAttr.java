package com.alipay.zoloz.toyger.algorithm;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class TGFaceAttr {
    public float brightness;
    public float confidence;
    public float deepLiveness;
    public float depthQuality;
    public short distance;
    public boolean eyeBlink;
    public boolean eyeOpen;
    public int faceId;
    public RectF faceRegion;
    public float gaussian;
    public boolean hasFace;
    public float integrity;
    public float iodRatio;
    public float[] keypts10;
    public float leftEyeBlinkRatio;
    public float leftEyeBlinkRatioMax;
    public float leftEyeBlinkRatioMin;
    public float motion;
    public float pitch;
    public float quality;
    public float rightEyeBlinkRatio;
    public float rightEyeBlinkRatioMax;
    public float rightEyeBlinkRatioMin;
    public float roll;
    public float yaw;

    public TGFaceAttr() {
        this.faceId = -1;
        this.depthQuality = -1.0f;
        this.faceRegion = new RectF();
    }

    public TGFaceAttr(TGFaceAttr tGFaceAttr) {
        this.faceId = -1;
        this.depthQuality = -1.0f;
        if (tGFaceAttr != null) {
            this.hasFace = tGFaceAttr.hasFace;
            this.faceId = tGFaceAttr.faceId;
            this.eyeOpen = tGFaceAttr.eyeOpen;
            this.eyeBlink = tGFaceAttr.eyeBlink;
            this.faceRegion = new RectF(tGFaceAttr.faceRegion);
            this.quality = tGFaceAttr.quality;
            this.yaw = tGFaceAttr.yaw;
            this.pitch = tGFaceAttr.pitch;
            this.gaussian = tGFaceAttr.gaussian;
            this.motion = tGFaceAttr.motion;
            this.brightness = tGFaceAttr.brightness;
            this.integrity = tGFaceAttr.integrity;
            this.leftEyeBlinkRatio = tGFaceAttr.leftEyeBlinkRatio;
            this.leftEyeBlinkRatioMin = tGFaceAttr.leftEyeBlinkRatioMin;
            this.leftEyeBlinkRatioMax = tGFaceAttr.leftEyeBlinkRatioMax;
            this.rightEyeBlinkRatio = tGFaceAttr.rightEyeBlinkRatio;
            this.rightEyeBlinkRatioMin = tGFaceAttr.rightEyeBlinkRatioMin;
            this.rightEyeBlinkRatioMax = tGFaceAttr.rightEyeBlinkRatioMax;
            this.distance = tGFaceAttr.distance;
            this.keypts10 = tGFaceAttr.keypts10;
            this.confidence = tGFaceAttr.confidence;
            this.roll = tGFaceAttr.roll;
            this.iodRatio = tGFaceAttr.iodRatio;
            this.deepLiveness = tGFaceAttr.deepLiveness;
            this.depthQuality = tGFaceAttr.depthQuality;
        }
    }

    public TGFaceAttr(boolean z10, int i10, boolean z11, boolean z12, RectF rectF, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, short s10, float[] fArr, float f23, float f24, float f25, float f26, float f27) {
        this.hasFace = z10;
        this.eyeOpen = z12;
        this.faceId = i10;
        this.eyeBlink = z11;
        this.faceRegion = rectF;
        this.quality = f10;
        this.yaw = f11;
        this.pitch = f12;
        this.gaussian = f13;
        this.motion = f14;
        this.brightness = f15;
        this.integrity = f16;
        this.leftEyeBlinkRatio = f17;
        this.leftEyeBlinkRatioMin = f18;
        this.leftEyeBlinkRatioMax = f19;
        this.rightEyeBlinkRatio = f20;
        this.rightEyeBlinkRatioMin = f21;
        this.rightEyeBlinkRatioMax = f22;
        this.distance = s10;
        this.keypts10 = fArr;
        this.confidence = f23;
        this.roll = f24;
        this.iodRatio = f25;
        this.deepLiveness = f26;
        this.depthQuality = f27;
    }

    public String toString() {
        return "TGFaceAttr{hasFace=" + this.hasFace + ", faceId=" + this.faceId + ", eyeBlink=" + this.eyeBlink + ", eyeOpen=" + this.eyeOpen + ", faceRegion=" + this.faceRegion + ", quality=" + this.quality + ", yaw=" + this.yaw + ", pitch=" + this.pitch + ", gaussian=" + this.gaussian + ", motion=" + this.motion + ", brightness=" + this.brightness + ", integrity=" + this.integrity + ", leftEyeBlinkRatio=" + this.leftEyeBlinkRatio + ", leftEyeBlinkRatioMin=" + this.leftEyeBlinkRatioMin + ", leftEyeBlinkRatioMax=" + this.leftEyeBlinkRatioMax + ", rightEyeBlinkRatio=" + this.rightEyeBlinkRatio + ", rightEyeBlinkRatioMin=" + this.rightEyeBlinkRatioMin + ", rightEyeBlinkRatioMax=" + this.rightEyeBlinkRatioMax + ", distance=" + ((int) this.distance) + ", keypts10=" + Arrays.toString(this.keypts10) + ", confidence=" + this.confidence + ", roll=" + this.roll + ", iodRatio=" + this.iodRatio + ", deepLiveness=" + this.deepLiveness + ", depthQuality=" + this.depthQuality + '}';
    }
}
