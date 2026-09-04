package com.ss.bytertc.engine.type;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum RemoteVideoStateChangeReason {
    REMOTE_VIDEO_STATE_CHANGE_REASON_INTERNAL(0),
    REMOTE_VIDEO_STATE_CHANGE_REASON_NETWORK_CONGESTION(1),
    REMOTE_VIDEO_STATE_CHANGE_REASON_NETWORK_RECOVERY(2),
    REMOTE_VIDEO_STATE_CHANGE_REASON_LOCAL_MUTED(3),
    REMOTE_VIDEO_STATE_CHANGE_REASON_LOCAL_UNMUTED(4),
    REMOTE_VIDEO_STATE_CHANGE_REASON_REMOTE_MUTED(5),
    REMOTE_VIDEO_STATE_CHANGE_REASON_REMOTE_UNMUTED(6),
    REMOTE_VIDEO_STATE_CHANGE_REASON_REMOTE_OFFLINE(7);

    private int value;

    RemoteVideoStateChangeReason(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static RemoteVideoStateChangeReason fromId(int i10) {
        for (RemoteVideoStateChangeReason remoteVideoStateChangeReason : values()) {
            if (remoteVideoStateChangeReason.value() == i10) {
                return remoteVideoStateChangeReason;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
