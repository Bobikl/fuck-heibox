package com.alipay.zoloz.toyger.algorithm;

/* JADX INFO: loaded from: classes6.dex */
public class TGFaceState {
    public static final int TG_MESSAGE_BAD_BRIGHTNESS = 8;
    public static final int TG_MESSAGE_BAD_EYE_OPENNESS = 10;
    public static final int TG_MESSAGE_BAD_PITCH = 5;
    public static final int TG_MESSAGE_BAD_QUALITY = 9;
    public static final int TG_MESSAGE_BAD_YAW = 6;
    public static final int TG_MESSAGE_BLINK_OPENNESS = 11;
    public static final int TG_MESSAGE_DEPTH_DAMAGE = 13;
    public static final int TG_MESSAGE_DISTANCE_TOO_CLOSE = 3;
    public static final int TG_MESSAGE_DISTANCE_TOO_FAR = 2;
    public static final int TG_MESSAGE_FACE_NOT_IN_CENTER = 4;
    public static final int TG_MESSAGE_IMAGE_PERFECT = 0;
    public static final int TG_MESSAGE_IS_MOVING = 7;
    public static final int TG_MESSAGE_NO_FACE = 1;
    public static final int TG_MESSAGE_STACK_TIME = 12;
    public static final int TG_STATIC_MESSAGE_BLINK_LIVENESS = 1;
    public static final int TG_STATIC_MESSAGE_NOLIVENESS = 0;

    @Deprecated
    public int brightness;

    @Deprecated
    public int distance;

    @Deprecated
    public boolean faceInCenter;

    @Deprecated
    public int goodPitch;

    @Deprecated
    public boolean goodQuality;

    @Deprecated
    public int goodYaw;

    @Deprecated
    public boolean hasFace;

    @Deprecated
    public boolean isMoving;
    public int messageCode;
    public float progress;
    public int staticMessage;

    public TGFaceState() {
    }

    public TGFaceState(float f10, int i10) {
        this.progress = f10;
        this.messageCode = i10;
    }

    @Deprecated
    public TGFaceState(boolean z10, int i10, int i11, boolean z11, int i12, int i13, boolean z12, boolean z13, float f10) {
        this.hasFace = z10;
        this.brightness = i10;
        this.distance = i11;
        this.faceInCenter = z11;
        this.goodPitch = i12;
        this.goodYaw = i13;
        this.isMoving = z12;
        this.goodQuality = z13;
        this.progress = f10;
    }

    public String toString() {
        return "TGFaceState{progress=" + this.progress + ", messageCode=" + this.messageCode + ", staticMessage=" + this.staticMessage + '}';
    }
}
