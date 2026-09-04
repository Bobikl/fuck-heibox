package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class VideoFrameInfo {
    public int height;
    public VideoRotation rotation;
    public int width;

    @CalledByNative
    public VideoFrameInfo(int i10, int i11, int i12) {
        this.width = 0;
        this.height = 0;
        this.rotation = VideoRotation.VIDEO_ROTATION_0;
        this.width = i10;
        this.height = i11;
        this.rotation = VideoRotation.fromId(i12);
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int i10) {
        this.width = i10;
    }

    public String toString() {
        return "VideoFrameInfo{width=" + this.width + ", height=" + this.height + ", rotation=" + this.rotation + '}';
    }
}
