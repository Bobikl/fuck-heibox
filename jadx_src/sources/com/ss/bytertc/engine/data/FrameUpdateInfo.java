package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class FrameUpdateInfo {
    public int frameRate;
    public int pixel;

    @CalledByNative
    public FrameUpdateInfo(int i10, int i11) {
        this.pixel = i10;
        this.frameRate = i11;
    }

    public String toString() {
        return "FrameUpdateInfo{pixel='" + this.pixel + "', frameRate='" + this.frameRate + '}';
    }
}
