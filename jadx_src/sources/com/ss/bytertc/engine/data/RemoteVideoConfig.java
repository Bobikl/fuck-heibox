package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class RemoteVideoConfig {
    public int framerate;
    public int height;
    public int width;

    @CalledByNative
    public RemoteVideoConfig(int i10, int i11, int i12) {
        this.width = i10;
        this.height = i11;
        this.framerate = i12;
    }

    public int getFrameRate() {
        return this.framerate;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public String toString() {
        return "RemoteVideoConfig{width=" + this.width + ", height=" + this.height + ", framerate=" + this.framerate + '}';
    }
}
