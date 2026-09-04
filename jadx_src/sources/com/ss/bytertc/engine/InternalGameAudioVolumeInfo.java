package com.ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class InternalGameAudioVolumeInfo {
    public String userId;
    public int volume;

    public InternalGameAudioVolumeInfo(String str, int i10) {
        this.userId = str;
        this.volume = i10;
    }

    @CalledByNative
    private static InternalGameAudioVolumeInfo create(String str, int i10) {
        return new InternalGameAudioVolumeInfo(str, i10);
    }
}
