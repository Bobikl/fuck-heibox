package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class RemoteAudioPropertiesInfo {
    public AudioPropertiesInfo audioPropertiesInfo;
    public RemoteStreamKey streamKey;

    public RemoteAudioPropertiesInfo(RemoteStreamKey remoteStreamKey, AudioPropertiesInfo audioPropertiesInfo) {
        this.streamKey = remoteStreamKey;
        this.audioPropertiesInfo = audioPropertiesInfo;
    }

    @CalledByNative
    private static RemoteAudioPropertiesInfo create(String str, String str2, int i10, int i11, int i12, float[] fArr, int i13) {
        return new RemoteAudioPropertiesInfo(new RemoteStreamKey(str, str2, StreamIndex.fromId(i10)), new AudioPropertiesInfo(i11, i12, fArr, i13));
    }

    public String toString() {
        return "RemoteAudioPropertiesInfo{user_id='" + this.streamKey.getUserId() + "'room_id='" + this.streamKey.getUserId() + "'stream_index='" + this.streamKey.getStreamIndex() + "'audioPropertiesInfo ['linear_volume='" + this.audioPropertiesInfo.linearVolume + "'nonlinear_volume='" + this.audioPropertiesInfo.nonlinearVolume + "']}";
    }
}
