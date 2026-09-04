package com.ss.bytertc.engine.handler;

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
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class IRTCRoomEventHandler {
    public void onAVSyncStateChange(AVSyncState aVSyncState) {
    }

    public void onAudioStreamBanned(String str, boolean z10) {
    }

    public void onForwardStreamEvent(ForwardStreamEventInfo[] forwardStreamEventInfoArr) {
    }

    public void onForwardStreamStateChanged(ForwardStreamStateInfo[] forwardStreamStateInfoArr) {
    }

    public void onLeaveRoom(RTCRoomStats rTCRoomStats) {
    }

    public void onLocalStreamStats(LocalStreamStats localStreamStats) {
    }

    public void onNetworkQuality(NetworkQualityStats networkQualityStats, NetworkQualityStats[] networkQualityStatsArr) {
    }

    public void onPublishPrivilegeTokenWillExpire() {
    }

    public void onRemoteStreamStats(RemoteStreamStats remoteStreamStats) {
    }

    public void onRoomBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
    }

    @Deprecated
    public void onRoomError(int i10) {
    }

    public void onRoomExtraInfoUpdate(String str, String str2, String str3, long j10) {
    }

    public void onRoomMessageReceived(String str, String str2) {
    }

    public void onRoomMessageSendResult(long j10, int i10) {
    }

    public void onRoomStateChanged(String str, String str2, int i10, String str3) {
    }

    public void onRoomStats(RTCRoomStats rTCRoomStats) {
    }

    @Deprecated
    public void onRoomWarning(int i10) {
    }

    public void onSetRoomExtraInfoResult(long j10, SetRoomExtraInfoResult setRoomExtraInfoResult) {
    }

    @Deprecated
    public void onStreamAdd(RTCStream rTCStream) {
    }

    public void onStreamPublishSuccess(String str, boolean z10) {
    }

    @Deprecated
    public void onStreamRemove(RTCStream rTCStream, StreamRemoveReason streamRemoveReason) {
    }

    public void onStreamStateChanged(String str, String str2, int i10, String str3) {
    }

    public void onStreamSubscribed(int i10, String str, SubscribeConfig subscribeConfig) {
    }

    public void onSubscribePrivilegeTokenWillExpire() {
    }

    public void onSubtitleMessageReceived(SubtitleMessage[] subtitleMessageArr) {
    }

    public void onSubtitleStateChanged(SubtitleState subtitleState, SubtitleErrorCode subtitleErrorCode, String str) {
    }

    public void onTokenWillExpire() {
    }

    public void onUserBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
    }

    public void onUserJoined(UserInfo userInfo, int i10) {
    }

    public void onUserLeave(String str, int i10) {
    }

    public void onUserMessageReceived(String str, String str2) {
    }

    public void onUserMessageSendResult(long j10, int i10) {
    }

    public void onUserPublishScreen(String str, MediaStreamType mediaStreamType) {
    }

    public void onUserPublishStream(String str, MediaStreamType mediaStreamType) {
    }

    public void onUserUnpublishScreen(String str, MediaStreamType mediaStreamType, StreamRemoveReason streamRemoveReason) {
    }

    public void onUserUnpublishStream(String str, MediaStreamType mediaStreamType, StreamRemoveReason streamRemoveReason) {
    }

    public void onUserVisibilityChanged(boolean z10, UserVisibilityChangeError userVisibilityChangeError) {
    }

    public void onVideoStreamBanned(String str, boolean z10) {
    }
}
