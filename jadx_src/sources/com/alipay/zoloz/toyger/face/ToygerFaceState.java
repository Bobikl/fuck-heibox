package com.alipay.zoloz.toyger.face;

import com.alipay.zoloz.toyger.ToygerState;
import com.alipay.zoloz.toyger.algorithm.TGFaceState;

/* JADX INFO: loaded from: classes6.dex */
public class ToygerFaceState extends TGFaceState implements ToygerState {
    public ToygerFaceState() {
    }

    public ToygerFaceState(TGFaceState tGFaceState) {
        this.hasFace = tGFaceState.hasFace;
        this.brightness = tGFaceState.brightness;
        this.distance = tGFaceState.distance;
        this.faceInCenter = tGFaceState.faceInCenter;
        this.goodPitch = tGFaceState.goodPitch;
        this.goodYaw = tGFaceState.goodYaw;
        this.isMoving = tGFaceState.isMoving;
        this.goodQuality = tGFaceState.goodQuality;
        this.progress = tGFaceState.progress;
        this.messageCode = tGFaceState.messageCode;
        this.staticMessage = tGFaceState.staticMessage;
    }

    @Override // com.alipay.zoloz.toyger.ToygerState
    public int brightness() {
        return this.brightness;
    }

    @Override // com.alipay.zoloz.toyger.ToygerState
    public int distance() {
        return this.distance;
    }

    @Override // com.alipay.zoloz.toyger.ToygerState
    public int getMessageCode() {
        return this.messageCode;
    }

    @Override // com.alipay.zoloz.toyger.ToygerState
    public float getProgress() {
        return this.progress;
    }

    @Override // com.alipay.zoloz.toyger.ToygerState
    public int getStaticMessage() {
        return this.staticMessage;
    }

    @Deprecated
    public int goodPitch() {
        return this.goodPitch;
    }

    @Deprecated
    public int goodYaw() {
        return this.goodYaw;
    }

    @Override // com.alipay.zoloz.toyger.ToygerState
    public boolean hasTarget() {
        return this.hasFace;
    }

    @Override // com.alipay.zoloz.toyger.ToygerState
    public boolean isGoodQuality() {
        return this.goodQuality;
    }

    @Override // com.alipay.zoloz.toyger.ToygerState
    public boolean isInCenter() {
        return this.faceInCenter;
    }

    @Override // com.alipay.zoloz.toyger.ToygerState
    public boolean isMoving() {
        return this.isMoving;
    }
}
