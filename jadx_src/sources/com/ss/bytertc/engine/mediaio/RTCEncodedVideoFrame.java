package com.ss.bytertc.engine.mediaio;

import com.ss.bytertc.engine.data.VideoCodecType;
import com.ss.bytertc.engine.data.VideoPictureType;
import com.ss.bytertc.engine.data.VideoRotation;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class RTCEncodedVideoFrame {
    public final ByteBuffer buffer;
    public int height;
    public long timestampDtsUs;
    public long timestampUs;
    public VideoCodecType videoCodecType;
    public VideoPictureType videoPictureType;
    public VideoRotation videoRotation;
    public int width;

    public RTCEncodedVideoFrame(ByteBuffer byteBuffer, long j10, long j11, int i10, int i11, VideoCodecType videoCodecType, VideoPictureType videoPictureType, VideoRotation videoRotation) {
        this.buffer = byteBuffer;
        this.timestampUs = j10;
        this.timestampDtsUs = j11;
        this.width = i10;
        this.height = i11;
        this.videoCodecType = videoCodecType;
        this.videoPictureType = videoPictureType;
        this.videoRotation = videoRotation;
    }
}
