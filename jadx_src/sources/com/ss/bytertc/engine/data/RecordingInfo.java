package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class RecordingInfo {
    public String filePath;
    public int height;
    public VideoCodecType videoCodecType;
    public int width;

    public RecordingInfo(String str, VideoCodecType videoCodecType, int i10, int i11) {
        this.filePath = str;
        this.videoCodecType = videoCodecType;
        this.width = i10;
        this.height = i11;
    }

    @CalledByNative
    public static RecordingInfo create(String str, VideoCodecType videoCodecType, int i10, int i11) {
        return new RecordingInfo(str, videoCodecType, i10, i11);
    }
}
