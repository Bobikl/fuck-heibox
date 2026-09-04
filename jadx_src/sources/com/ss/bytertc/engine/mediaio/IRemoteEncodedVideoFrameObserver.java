package com.ss.bytertc.engine.mediaio;

import com.ss.bytertc.engine.data.RemoteStreamKey;

/* JADX INFO: loaded from: classes4.dex */
public abstract class IRemoteEncodedVideoFrameObserver {
    public abstract void onRemoteEncodedVideoFrame(RemoteStreamKey remoteStreamKey, RTCEncodedVideoFrame rTCEncodedVideoFrame);
}
