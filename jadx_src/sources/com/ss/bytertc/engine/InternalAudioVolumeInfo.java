package com.ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class InternalAudioVolumeInfo {
    public int linearVolume;
    public int nonlinearVolume;
    public int smoothVolume;
    public String uid;

    public InternalAudioVolumeInfo(String str, int i10, int i11) {
        this.uid = str;
        this.linearVolume = i10;
        this.nonlinearVolume = i11;
    }

    @CalledByNative
    private static InternalAudioVolumeInfo create(String str, int i10, int i11) {
        return new InternalAudioVolumeInfo(str, i10, i11);
    }
}
