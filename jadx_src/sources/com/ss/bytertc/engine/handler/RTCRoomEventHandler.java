package com.ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.ss.bytertc.engine.InternalLocalStreamStats;
import com.ss.bytertc.engine.InternalNetworkQualityInfo;
import com.ss.bytertc.engine.InternalRTCStats;
import com.ss.bytertc.engine.InternalRemoteStreamStats;
import com.ss.bytertc.engine.RTCRoomImpl;
import com.ss.bytertc.engine.RTCStream;
import com.ss.bytertc.engine.SubscribeConfig;
import com.ss.bytertc.engine.UserInfo;
import com.ss.bytertc.engine.data.AVSyncState;
import com.ss.bytertc.engine.data.ForwardStreamEventInfo;
import com.ss.bytertc.engine.data.ForwardStreamStateInfo;
import com.ss.bytertc.engine.type.LocalStreamStats;
import com.ss.bytertc.engine.type.MediaStreamType;
import com.ss.bytertc.engine.type.NetworkQualityStats;
import com.ss.bytertc.engine.type.RTCRoomStats;
import com.ss.bytertc.engine.type.RemoteStreamStats;
import com.ss.bytertc.engine.type.SetRoomExtraInfoResult;
import com.ss.bytertc.engine.type.StreamRemoveReason;
import com.ss.bytertc.engine.type.SubtitleErrorCode;
import com.ss.bytertc.engine.type.SubtitleMessage;
import com.ss.bytertc.engine.type.SubtitleState;
import com.ss.bytertc.engine.type.UserVisibilityChangeError;
import com.ss.bytertc.engine.utils.LogUtil;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class RTCRoomEventHandler {
    private static final String TAG = "RtcRoomEventHandler";
    private RTCRoomImpl mRtcRoom;

    public RTCRoomEventHandler(RTCRoomImpl rTCRoomImpl) {
        this.mRtcRoom = rTCRoomImpl;
    }

    @CalledByNative
    public static ByteBuffer allocateDirectByteBuffer(int i10) {
        return ByteBuffer.allocateDirect(i10);
    }

    @CalledByNative
    public void onAVSyncStateChange(AVSyncState aVSyncState) {
        LogUtil.d(TAG, "onAVSyncStateChange: " + aVSyncState);
        try {
            this.mRtcRoom.getRtcRoomHandler().onAVSyncStateChange(aVSyncState);
        } catch (Exception e10) {
            LogUtil.d(TAG, "onAVSyncStateChange callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onAudioStreamBanned(String str, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onAudioStreamBanned, user: ");
        sb2.append(str);
        sb2.append(", banned: ");
        sb2.append(z10 ? "true" : "false");
        LogUtil.d(TAG, sb2.toString());
        try {
            this.mRtcRoom.getRtcRoomHandler().onAudioStreamBanned(str, z10);
        } catch (Exception e10) {
            LogUtil.d(TAG, "onAudioStreamBanned callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onForwardStreamEvent(ForwardStreamEventInfo[] forwardStreamEventInfoArr) {
        LogUtil.d(TAG, "onForwardStreamEvent");
        try {
            this.mRtcRoom.getRtcRoomHandler().onForwardStreamEvent(forwardStreamEventInfoArr);
        } catch (Exception e10) {
            LogUtil.d(TAG, "onForwardStreamEvent callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onForwardStreamStateChanged(ForwardStreamStateInfo[] forwardStreamStateInfoArr) {
        LogUtil.d(TAG, "OnForwardStreamStateChanged");
        try {
            this.mRtcRoom.getRtcRoomHandler().onForwardStreamStateChanged(forwardStreamStateInfoArr);
        } catch (Exception e10) {
            LogUtil.d(TAG, "onForwardStreamStateChanged callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onLeaveRoom(InternalRTCStats internalRTCStats) {
        LogUtil.d(TAG, "onLeaveRoom...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onLeaveRoom(new RTCRoomStats(internalRTCStats));
        } catch (Exception e10) {
            LogUtil.d(TAG, "onLeaveRoom callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onLocalStreamStats(InternalLocalStreamStats internalLocalStreamStats) {
        LogUtil.d(TAG, "onLocalStreamStats...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onLocalStreamStats(new LocalStreamStats(internalLocalStreamStats));
        } catch (Exception e10) {
            LogUtil.d(TAG, "onLocalStreamStats callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onNetworkQuality(InternalNetworkQualityInfo internalNetworkQualityInfo, InternalNetworkQualityInfo[] internalNetworkQualityInfoArr) {
        LogUtil.d(TAG, "Local onNetworkQuality, uid: " + internalNetworkQualityInfo.uid + ", info: " + internalNetworkQualityInfo.toString());
        try {
            IRTCRoomEventHandler rtcRoomHandler = this.mRtcRoom.getRtcRoomHandler();
            if (rtcRoomHandler != null) {
                NetworkQualityStats[] networkQualityStatsArr = new NetworkQualityStats[internalNetworkQualityInfoArr.length];
                for (int i10 = 0; i10 < internalNetworkQualityInfoArr.length; i10++) {
                    LogUtil.d(TAG, "Remote onNetworkQuality, uid: " + internalNetworkQualityInfoArr[i10].uid + ", info: " + internalNetworkQualityInfoArr[i10].toString());
                    networkQualityStatsArr[i10] = new NetworkQualityStats(internalNetworkQualityInfoArr[i10]);
                }
                rtcRoomHandler.onNetworkQuality(new NetworkQualityStats(internalNetworkQualityInfo), networkQualityStatsArr);
            }
        } catch (Exception e10) {
            LogUtil.d(TAG, "onNetworkQuality callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onPublishPrivilegeTokenWillExpire() {
        LogUtil.d(TAG, "onPublishPrivilegeTokenWillExpire");
        try {
            this.mRtcRoom.getRtcRoomHandler().onPublishPrivilegeTokenWillExpire();
        } catch (Exception e10) {
            LogUtil.d(TAG, "onPublishPrivilegeTokenWillExpire callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onRemoteStreamStats(InternalRemoteStreamStats internalRemoteStreamStats) {
        LogUtil.d(TAG, "onRemoteStreamStats...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onRemoteStreamStats(new RemoteStreamStats(internalRemoteStreamStats));
        } catch (Exception e10) {
            LogUtil.d(TAG, "onRemoteStreamStats callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onRoomBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
        LogUtil.d(TAG, "onRoomBinaryMessageReceived, length: " + byteBuffer.capacity());
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomBinaryMessageReceived(str, byteBuffer);
        } catch (Exception e10) {
            LogUtil.d(TAG, "onRoomBinaryMessageReceived callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onRoomError(int i10) {
        LogUtil.d(TAG, "onRoomError...errorNum: " + i10);
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomError(i10);
        } catch (Exception e10) {
            LogUtil.d(TAG, "onRoomError callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onRoomExtraInfoUpdate(String str, String str2, String str3, long j10) {
        LogUtil.d(TAG, "onRoomExtraInfoUpdate , key:" + str + ",value:" + str2);
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomExtraInfoUpdate(str, str2, str3, j10);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onRoomExtraInfoUpdate callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onRoomMessageReceived(String str, String str2) {
        LogUtil.d(TAG, "onRoomMessageReceived: " + str2);
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomMessageReceived(str, str2);
        } catch (Exception e10) {
            LogUtil.d(TAG, "onRoomMessageReceived callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onRoomMessageSendResult(long j10, int i10) {
        LogUtil.d(TAG, "onRoomMessageSendResult...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomMessageSendResult(j10, i10);
        } catch (Exception e10) {
            LogUtil.d(TAG, "onRoomMessageSendResult callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onRoomStateChanged(String str, String str2, int i10, String str3) {
        LogUtil.d(TAG, "onRoomStateChanged...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomStateChanged(str, str2, i10, str3);
        } catch (Exception e10) {
            LogUtil.d(TAG, "onRoomStateChanged callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onRoomStats(InternalRTCStats internalRTCStats) {
        LogUtil.d(TAG, "onRtcStats...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomStats(new RTCRoomStats(internalRTCStats));
        } catch (Exception e10) {
            LogUtil.d(TAG, "onRtcStats callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onRoomWarning(int i10) {
        LogUtil.d(TAG, "onRoomWarning, warnNum: " + i10);
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomWarning(i10);
        } catch (Exception e10) {
            LogUtil.d(TAG, "onRoomWarning callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onSetRoomExtraInfoResult(long j10, int i10) {
        LogUtil.d(TAG, "onSetRoomExtraInfoResult,result:" + i10);
        try {
            this.mRtcRoom.getRtcRoomHandler().onSetRoomExtraInfoResult(j10, SetRoomExtraInfoResult.fromId(i10));
        } catch (Exception e10) {
            LogUtil.d(TAG, "onSetRoomExtraInfoResult callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onStreamAdd(RTCStream rTCStream) {
        LogUtil.d(TAG, "onStreamAdd...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onStreamAdd(rTCStream);
        } catch (Exception e10) {
            LogUtil.d(TAG, "onStreamAdd callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onStreamPublishSuccess(String str, boolean z10) {
        LogUtil.d(TAG, "onStreamPublishSuccess...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onStreamPublishSuccess(str, z10);
        } catch (Exception e10) {
            LogUtil.d(TAG, "onStreamPublishSuccess callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onStreamRemove(RTCStream rTCStream, int i10) {
        LogUtil.d(TAG, "onStreamRemove...uid: " + rTCStream.userId);
        try {
            this.mRtcRoom.getRtcRoomHandler().onStreamRemove(rTCStream, StreamRemoveReason.values()[i10]);
        } catch (Exception e10) {
            LogUtil.d(TAG, "onStreamRemove callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onStreamStateChanged(String str, String str2, int i10, String str3) {
        LogUtil.d(TAG, "onStreamStateChanged...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onStreamStateChanged(str, str2, i10, str3);
        } catch (Exception e10) {
            LogUtil.d(TAG, "onStreamStateChanged callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onStreamSubscribed(int i10, String str, SubscribeConfig subscribeConfig) {
        LogUtil.d(TAG, "onStreamSubscribed...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onStreamSubscribed(i10, str, subscribeConfig);
        } catch (Exception e10) {
            LogUtil.d(TAG, "onStreamSubscribed callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onSubscribePrivilegeTokenWillExpire() {
        LogUtil.d(TAG, "onSubscribePrivilegeTokenWillExpire");
        try {
            this.mRtcRoom.getRtcRoomHandler().onSubscribePrivilegeTokenWillExpire();
        } catch (Exception e10) {
            LogUtil.d(TAG, "onSubscribePrivilegeTokenWillExpire callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onSubtitleMessageReceived(SubtitleMessage[] subtitleMessageArr) {
        LogUtil.d(TAG, "onSubtitleMessageReceived, subtitles length: " + subtitleMessageArr.length);
        try {
            this.mRtcRoom.getRtcRoomHandler().onSubtitleMessageReceived(subtitleMessageArr);
        } catch (Exception e10) {
            LogUtil.d(TAG, "onSubtitleMessageReceived callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onSubtitleStateChanged(int i10, int i11, String str) {
        LogUtil.d(TAG, "onSubtitleStateChanged, state: " + i10 + ", errorCode: " + i11 + ", errorMessage: " + str);
        try {
            this.mRtcRoom.getRtcRoomHandler().onSubtitleStateChanged(SubtitleState.fromId(i10), SubtitleErrorCode.fromId(i11), str);
        } catch (Exception e10) {
            LogUtil.d(TAG, "onSubtitleStateChanged callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onTokenWillExpire() {
        LogUtil.d(TAG, "onTokenWillExpire");
        try {
            this.mRtcRoom.getRtcRoomHandler().onTokenWillExpire();
        } catch (Exception e10) {
            LogUtil.d(TAG, "onTokenWillExpire callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onUserBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
        LogUtil.d(TAG, "onUserBinaryMessageReceived: uid:" + str + "binary message length" + byteBuffer.capacity());
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserBinaryMessageReceived(str, byteBuffer);
        } catch (Exception e10) {
            LogUtil.d(TAG, "onUserBinaryMessageReceived callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onUserJoined(UserInfo userInfo, int i10) {
        LogUtil.d(TAG, "onUserJoined... uid: " + userInfo.getUid() + ", extraInfo: " + userInfo.getExtraInfo() + ", elapsed: " + i10);
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserJoined(userInfo, i10);
        } catch (Exception e10) {
            LogUtil.d(TAG, "onUserJoined callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onUserLeave(String str, int i10) {
        LogUtil.d(TAG, "onUserLeave... uid: " + str + ", reason: " + i10);
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserLeave(str, i10);
        } catch (Exception e10) {
            LogUtil.d(TAG, "onUserLeave callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onUserMessageReceived(String str, String str2) {
        LogUtil.d(TAG, "onUserMessageReceived: uid:" + str + "message" + str2);
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserMessageReceived(str, str2);
        } catch (Exception e10) {
            LogUtil.d(TAG, "onUserMessageReceived callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onUserMessageSendResult(long j10, int i10) {
        LogUtil.d(TAG, "onUserMessageSendResult...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserMessageSendResult(j10, i10);
        } catch (Exception e10) {
            LogUtil.d(TAG, "onUserMessageSendResult callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onUserPublishScreen(String str, int i10) {
        LogUtil.d(TAG, "onUserPublishScreen... uid: " + str + ", type: " + i10);
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserPublishScreen(str, MediaStreamType.valueOf(i10));
        } catch (Exception e10) {
            LogUtil.d(TAG, "onUserPublishScreen callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onUserPublishStream(String str, int i10) {
        LogUtil.d(TAG, "onUserPublishStream... uid: " + str + ", type: " + i10);
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserPublishStream(str, MediaStreamType.valueOf(i10));
        } catch (Exception e10) {
            LogUtil.d(TAG, "onUserPublishStream callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onUserUnpublishScreen(String str, int i10, int i11) {
        LogUtil.d(TAG, "onUserUnPublishScreen... uid: " + str + ", type: " + i10 + ", reasen:" + i11);
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserUnpublishScreen(str, MediaStreamType.valueOf(i10), StreamRemoveReason.values()[i11]);
        } catch (Exception e10) {
            LogUtil.d(TAG, "onUserUnPublishScreen callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onUserUnpublishStream(String str, int i10, int i11) {
        LogUtil.d(TAG, "onUserUnPublishStream... uid: " + str + ", type: " + i10 + ", reasen:" + i11);
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserUnpublishStream(str, MediaStreamType.valueOf(i10), StreamRemoveReason.values()[i11]);
        } catch (Exception e10) {
            LogUtil.d(TAG, "onUserUnPublishStream callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onUserVisibilityChanged(boolean z10, UserVisibilityChangeError userVisibilityChangeError) {
        LogUtil.d(TAG, "onUserVisibilityChanged, currentUserVisibility:" + z10 + ", errorCode:" + userVisibilityChangeError);
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserVisibilityChanged(z10, userVisibilityChangeError);
        } catch (Exception e10) {
            LogUtil.e(TAG, "onUserVisibilityChanged callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onVideoStreamBanned(String str, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onVideoStreamBanned, user: ");
        sb2.append(str);
        sb2.append(", banned: ");
        sb2.append(z10 ? "true" : "false");
        LogUtil.d(TAG, sb2.toString());
        try {
            this.mRtcRoom.getRtcRoomHandler().onVideoStreamBanned(str, z10);
        } catch (Exception e10) {
            LogUtil.d(TAG, "onVideoStreamBanned callback catch exception.\n" + e10.getMessage());
        }
    }
}
