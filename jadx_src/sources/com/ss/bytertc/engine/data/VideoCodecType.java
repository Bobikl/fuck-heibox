package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum VideoCodecType {
    VIDEO_CODEC_TYPE_UNKNOWN(0),
    VIDEO_CODEC_TYPE_H264(1),
    VIDEO_CODEC_TYPE_BYTEVC1(2);

    int value;

    VideoCodecType(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static VideoCodecType fromId(int i10) {
        for (VideoCodecType videoCodecType : values()) {
            if (videoCodecType.value() == i10) {
                return videoCodecType;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
