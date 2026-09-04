package com.alipay.zoloz.toyger.face;

import android.graphics.RectF;
import com.alipay.zoloz.toyger.ToygerAttr;
import com.alipay.zoloz.toyger.algorithm.TGFaceAttr;

/* JADX INFO: loaded from: classes6.dex */
public class ToygerFaceAttr extends TGFaceAttr implements ToygerAttr {
    public ToygerFaceAttr() {
    }

    public ToygerFaceAttr(TGFaceAttr tGFaceAttr) {
        super(tGFaceAttr);
    }

    public ToygerFaceAttr(ToygerFaceAttr toygerFaceAttr, boolean z10) {
        float[] fArr;
        super(toygerFaceAttr);
        if (!z10) {
            RectF rectF = toygerFaceAttr.faceRegion;
            this.faceRegion = new RectF(1.0f - rectF.right, rectF.top, 1.0f - rectF.left, rectF.bottom);
        }
        if (toygerFaceAttr == null || (fArr = toygerFaceAttr.keypts10) == null) {
            this.keypts10 = toygerFaceAttr != null ? toygerFaceAttr.keypts10 : new float[10];
            return;
        }
        float[] fArr2 = new float[10];
        if (z10) {
            fArr2[0] = 1.0f - fArr[1];
            fArr2[1] = 1.0f - fArr[0];
            fArr2[2] = 1.0f - fArr[2];
            fArr2[3] = 1.0f - fArr[4];
            fArr2[4] = 1.0f - fArr[3];
            fArr2[5] = fArr[5];
            fArr2[6] = fArr[6];
            fArr2[7] = fArr[7];
            fArr2[8] = fArr[8];
            fArr2[9] = fArr[9];
        }
        this.keypts10 = fArr2;
    }

    public ToygerFaceAttr(boolean z10, int i10, boolean z11, boolean z12, RectF rectF, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, short s10, float[] fArr, float f23, float f24, float f25, float f26, float f27) {
        super(z10, i10, z11, z12, rectF, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, s10, fArr, f23, f24, f25, f26, f27);
    }

    @Override // com.alipay.zoloz.toyger.ToygerAttr
    public float brightness() {
        return this.brightness;
    }

    @Override // com.alipay.zoloz.toyger.ToygerAttr
    public short distance() {
        return this.distance;
    }

    public boolean eyeBlink() {
        return this.eyeBlink;
    }

    @Override // com.alipay.zoloz.toyger.ToygerAttr
    public float gaussian() {
        return this.gaussian;
    }

    @Override // com.alipay.zoloz.toyger.ToygerAttr
    public boolean hasTarget() {
        return this.hasFace;
    }

    @Override // com.alipay.zoloz.toyger.ToygerAttr
    public float integrity() {
        return this.integrity;
    }

    public float leftEyeBlinkRatio() {
        return this.leftEyeBlinkRatio;
    }

    public float leftEyeBlinkRatioMax() {
        return this.leftEyeBlinkRatioMax;
    }

    public float leftEyeBlinkRatioMin() {
        return this.leftEyeBlinkRatioMin;
    }

    @Override // com.alipay.zoloz.toyger.ToygerAttr
    public float motion() {
        return this.motion;
    }

    public float pitch() {
        return this.pitch;
    }

    @Override // com.alipay.zoloz.toyger.ToygerAttr
    public float quality() {
        return this.quality;
    }

    @Override // com.alipay.zoloz.toyger.ToygerAttr
    public RectF region() {
        return this.faceRegion;
    }

    public float rightEyeBlinkRatio() {
        return this.rightEyeBlinkRatio;
    }

    public float rightEyeBlinkRatioMax() {
        return this.rightEyeBlinkRatioMax;
    }

    public float rightEyeBlinkRatioMin() {
        return this.rightEyeBlinkRatioMin;
    }

    public float yaw() {
        return this.yaw;
    }
}
