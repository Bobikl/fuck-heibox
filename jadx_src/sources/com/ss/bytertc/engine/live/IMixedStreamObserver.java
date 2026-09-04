package com.ss.bytertc.engine.live;

import com.ss.bytertc.engine.video.VideoFrame;

/* JADX INFO: loaded from: classes4.dex */
public interface IMixedStreamObserver {
    boolean isSupportClientPushStream();

    void onCacheSyncVideoFrames(String str, String[] strArr, VideoFrame[] videoFrameArr, byte[][] bArr, int i10);

    void onMixingAudioFrame(String str, byte[] bArr, int i10, long j10);

    void onMixingDataFrame(String str, byte[] bArr, long j10);

    void onMixingEvent(ByteRTCStreamMixingEvent byteRTCStreamMixingEvent, String str, ByteRTCTranscoderErrorCode byteRTCTranscoderErrorCode, MixedStreamType mixedStreamType);

    void onMixingVideoFrame(String str, VideoFrame videoFrame);
}
