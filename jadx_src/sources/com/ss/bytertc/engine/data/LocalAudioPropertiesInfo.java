package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class LocalAudioPropertiesInfo {
    public AudioPropertiesInfo audioPropertiesInfo;
    public StreamIndex streamIndex;

    public LocalAudioPropertiesInfo(StreamIndex streamIndex, AudioPropertiesInfo audioPropertiesInfo) {
        this.streamIndex = streamIndex;
        this.audioPropertiesInfo = audioPropertiesInfo;
    }

    @CalledByNative
    private static LocalAudioPropertiesInfo create(int i10, int i11, int i12, float[] fArr, int i13, double d10, int i14) {
        AudioPropertiesInfo audioPropertiesInfo = new AudioPropertiesInfo(i11, i12, fArr, i13);
        audioPropertiesInfo.voicePitch = d10;
        audioPropertiesInfo.deviceLoopDelay = i14;
        return new LocalAudioPropertiesInfo(StreamIndex.fromId(i10), audioPropertiesInfo);
    }

    public String toString() {
        return "LocalAudioPropertiesInfo{streamIndex='" + this.streamIndex + "'audioPropertiesInfo='" + this.audioPropertiesInfo.toString() + "'}";
    }
}
