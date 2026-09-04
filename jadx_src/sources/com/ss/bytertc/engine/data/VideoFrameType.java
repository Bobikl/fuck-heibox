package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum VideoFrameType {
    RAW_MEMORY(0),
    GL_TEXTURE(2);

    private int value;

    VideoFrameType(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static VideoFrameType fromId(int i10) {
        for (VideoFrameType videoFrameType : values()) {
            if (videoFrameType.value() == i10) {
                return videoFrameType;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this == RAW_MEMORY ? "kVideoFrameTypeRawMemory" : "kVideoFrameTypeGLTexture";
    }

    @CalledByNative
    public int value() {
        return this.value;
    }
}
