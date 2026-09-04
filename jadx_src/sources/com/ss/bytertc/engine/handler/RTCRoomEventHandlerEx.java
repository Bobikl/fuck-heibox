package com.ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.ss.bytertc.engine.RTCRoomImpl;
import com.ss.bytertc.engine.SubscribeConfig;
import com.ss.bytertc.engine.data.RemoteStreamKey;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.StreamKey;
import com.ss.bytertc.engine.type.MediaStreamType;
import com.ss.bytertc.engine.type.StreamRemoveReason;
import com.ss.bytertc.engine.utils.LogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class RTCRoomEventHandlerEx {
    private static final String TAG = "RtcRoomEventHandlerEx";
    private RTCRoomImpl mRtcRoom;

    public RTCRoomEventHandlerEx(RTCRoomImpl rTCRoomImpl) {
        this.mRtcRoom = rTCRoomImpl;
    }

    @CalledByNative
    public void onStreamStateChanged(StreamKey streamKey, int i10, String str) {
        LogUtil.d(TAG, "onStreamStateChanged streamIndex: " + streamKey.getStreamIndex());
        try {
            IRTCRoomEventHandlerEx rtcRoomHandlerEx = this.mRtcRoom.getRtcRoomHandlerEx();
            if (rtcRoomHandlerEx != null) {
                rtcRoomHandlerEx.onStreamStateChanged(streamKey, i10, str);
            }
        } catch (Exception e10) {
            LogUtil.d(TAG, "onStreamStateChanged callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onStreamSubscribed(int i10, String str, StreamIndex streamIndex, SubscribeConfig subscribeConfig) {
        LogUtil.d(TAG, "onStreamSubscribed...");
        try {
            IRTCRoomEventHandlerEx rtcRoomHandlerEx = this.mRtcRoom.getRtcRoomHandlerEx();
            if (rtcRoomHandlerEx != null) {
                rtcRoomHandlerEx.onStreamSubscribed(i10, str, streamIndex, subscribeConfig);
            }
        } catch (Exception e10) {
            LogUtil.d(TAG, "onStreamSubscribed callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onUserPublishStream(RemoteStreamKey remoteStreamKey, boolean z10, int i10) {
        LogUtil.d(TAG, "onUserPublishStream streamIndex: " + remoteStreamKey.getStreamIndex());
        try {
            IRTCRoomEventHandlerEx rtcRoomHandlerEx = this.mRtcRoom.getRtcRoomHandlerEx();
            if (rtcRoomHandlerEx != null) {
                rtcRoomHandlerEx.onUserPublishStream(remoteStreamKey, z10, MediaStreamType.valueOf(i10));
            }
        } catch (Exception e10) {
            LogUtil.d(TAG, "onUserPublishStream callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onUserUnpublishStream(RemoteStreamKey remoteStreamKey, int i10, int i11) {
        LogUtil.d(TAG, "onUserUnpublishStream streamIndex: " + remoteStreamKey.getStreamIndex());
        if (i11 >= 0) {
            try {
                if (i11 > StreamRemoveReason.STREAM_REMOVE_REASON_PUBLISH_PRIVILEGE_TOKEN_EXPIRED.value()) {
                    LogUtil.d(TAG, "onUserUnpublishStream callback reason invalid.\n");
                    i11 = 0;
                }
            } catch (Exception e10) {
                LogUtil.d(TAG, "onUserUnpublishStream callback catch exception.\n" + e10.getMessage());
                return;
            }
        } else {
            LogUtil.d(TAG, "onUserUnpublishStream callback reason invalid.\n");
            i11 = 0;
        }
        IRTCRoomEventHandlerEx rtcRoomHandlerEx = this.mRtcRoom.getRtcRoomHandlerEx();
        if (rtcRoomHandlerEx != null) {
            rtcRoomHandlerEx.onUserUnpublishStream(remoteStreamKey, MediaStreamType.valueOf(i10), StreamRemoveReason.values()[i11]);
        }
    }
}
