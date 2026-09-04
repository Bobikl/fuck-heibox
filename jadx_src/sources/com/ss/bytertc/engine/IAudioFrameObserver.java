package com.ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;
import com.ss.bytertc.engine.data.RemoteStreamKey;
import com.ss.bytertc.engine.utils.IAudioFrame;

/* JADX INFO: loaded from: classes4.dex */
public interface IAudioFrameObserver {
    @CalledByNative
    void onMixedAudioFrame(IAudioFrame iAudioFrame);

    @CalledByNative
    void onPlaybackAudioFrame(IAudioFrame iAudioFrame);

    @CalledByNative
    void onRecordAudioFrame(IAudioFrame iAudioFrame);

    @CalledByNative
    void onRemoteUserAudioFrame(RemoteStreamKey remoteStreamKey, IAudioFrame iAudioFrame);
}
