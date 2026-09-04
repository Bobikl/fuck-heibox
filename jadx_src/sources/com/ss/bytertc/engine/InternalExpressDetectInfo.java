package com.ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class InternalExpressDetectInfo {
    public float age;
    public float angryScore;
    public float arousal;
    public float attractive;
    public float boyProb;
    public float happyScore;
    public float sadScore;
    public float surpriseScore;
    public float valence;

    public InternalExpressDetectInfo(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.age = f10;
        this.boyProb = f11;
        this.attractive = f12;
        this.happyScore = f13;
        this.sadScore = f14;
        this.angryScore = f15;
        this.surpriseScore = f16;
        this.arousal = f17;
        this.valence = f18;
    }

    @CalledByNative
    private static InternalExpressDetectInfo create(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        return new InternalExpressDetectInfo(f10, f11, f12, f13, f14, f15, f16, f17, f18);
    }
}
