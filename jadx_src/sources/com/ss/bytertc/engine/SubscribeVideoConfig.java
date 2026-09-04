package com.ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class SubscribeVideoConfig {
    private int priority;
    private int videoIndex;

    public SubscribeVideoConfig(int i10, int i11) {
        this.videoIndex = i10;
        this.priority = i11;
    }

    @CalledByNative
    public int getPriority() {
        return this.priority;
    }

    @CalledByNative
    public int getVideoIndex() {
        return this.videoIndex;
    }

    public String toString() {
        return "SubscribeVideoConfig{videoIndex=" + this.videoIndex + ", priority=" + this.priority + '}';
    }
}
