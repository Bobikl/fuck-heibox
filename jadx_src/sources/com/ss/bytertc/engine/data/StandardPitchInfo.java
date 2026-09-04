package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class StandardPitchInfo {
    public int duration;
    public int pitch;
    public int startTime;

    public StandardPitchInfo(int i10, int i11, int i12) {
        this.startTime = i10;
        this.duration = i11;
        this.pitch = i12;
    }

    @CalledByNative
    private static StandardPitchInfo create(int i10, int i11, int i12) {
        return new StandardPitchInfo(i10, i11, i12);
    }
}
