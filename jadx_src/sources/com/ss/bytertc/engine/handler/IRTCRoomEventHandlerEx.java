package com.ss.bytertc.engine.handler;

import com.ss.bytertc.engine.SubscribeConfig;
import com.ss.bytertc.engine.data.RemoteStreamKey;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.StreamKey;
import com.ss.bytertc.engine.type.MediaStreamType;
import com.ss.bytertc.engine.type.StreamRemoveReason;

/* JADX INFO: loaded from: classes4.dex */
public abstract class IRTCRoomEventHandlerEx {
    public void onStreamStateChanged(StreamKey streamKey, int i10, String str) {
    }

    public void onStreamSubscribed(int i10, String str, StreamIndex streamIndex, SubscribeConfig subscribeConfig) {
    }

    public void onUserPublishStream(RemoteStreamKey remoteStreamKey, boolean z10, MediaStreamType mediaStreamType) {
    }

    public void onUserUnpublishStream(RemoteStreamKey remoteStreamKey, MediaStreamType mediaStreamType, StreamRemoveReason streamRemoveReason) {
    }
}
