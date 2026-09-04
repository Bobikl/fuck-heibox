package com.ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;
import com.ss.bytertc.engine.data.StreamIndex;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RTCStream {
    public boolean hasAudio;
    public boolean hasVideo;
    public boolean isScreen;
    public StreamIndex streamIndex;
    public String userId;
    public List<VideoStreamDescription> videoStreamDescriptions;

    public RTCStream() {
    }

    public RTCStream(String str, StreamIndex streamIndex, boolean z10, boolean z11, boolean z12, List<VideoStreamDescription> list) {
        this.userId = str;
        this.streamIndex = streamIndex;
        this.isScreen = z10;
        this.hasVideo = z11;
        this.hasAudio = z12;
        this.videoStreamDescriptions = list;
    }

    @CalledByNative
    private static RTCStream create(String str, StreamIndex streamIndex, boolean z10, boolean z11, boolean z12) {
        return new RTCStream(str, streamIndex, z10, z11, z12, null);
    }

    @CalledByNative
    private static RTCStream createWithStreamDescriptions(String str, StreamIndex streamIndex, boolean z10, boolean z11, boolean z12, VideoStreamDescription[] videoStreamDescriptionArr) {
        return new RTCStream(str, streamIndex, z10, z11, z12, Arrays.asList(videoStreamDescriptionArr));
    }

    public String toString() {
        return "RTCStream{ userId='" + this.userId + "', isScreen=" + this.isScreen + ", hasVideo=" + this.hasVideo + ", hasAudio=" + this.hasAudio + ", videoStreamDescriptions=" + this.videoStreamDescriptions + '}';
    }
}
