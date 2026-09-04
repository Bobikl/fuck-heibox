package com.ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class SubChannelInfo {
    private String channelName;
    private double volumeScale;

    public SubChannelInfo(String str, double d10) {
        this.channelName = str;
        this.volumeScale = d10;
    }

    @CalledByNative
    public String getChannelName() {
        return this.channelName;
    }

    @CalledByNative
    public double getVolumeScale() {
        return this.volumeScale;
    }
}
