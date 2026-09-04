package com.ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;
import com.ss.bytertc.engine.data.RemoteStreamKey;
import com.ss.bytertc.engine.utils.IAudioFrame;

/* JADX INFO: loaded from: classes4.dex */
public interface IAudioFrameProcessor {
    @CalledByNative
    int onProcessEarMonitorAudioFrame(IAudioFrame iAudioFrame);

    @CalledByNative
    int onProcessPlayBackAudioFrame(IAudioFrame iAudioFrame);

    @CalledByNative
    int onProcessRecordAudioFrame(IAudioFrame iAudioFrame);

    @CalledByNative
    int onProcessRemoteUserAudioFrame(RemoteStreamKey remoteStreamKey, IAudioFrame iAudioFrame);

    @CalledByNative
    int onProcessScreenAudioFrame(IAudioFrame iAudioFrame);
}
