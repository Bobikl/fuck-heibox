package com.ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class InternalSourceWantedData {
    public int frameRate;
    public int height;
    public int width;

    public InternalSourceWantedData(int i10, int i11, int i12) {
        this.width = i10;
        this.height = i11;
        this.frameRate = i12;
    }

    @CalledByNative
    private static InternalSourceWantedData create(int i10, int i11, int i12) {
        return new InternalSourceWantedData(i10, i11, i12);
    }

    public String toString() {
        return "InternalSourceWantedData{width='" + this.width + "', height='" + this.height + "', frameRate='" + this.frameRate + "'}";
    }
}
