package com.ss.bytertc.engine.flutter.room;

import androidx.annotation.RestrictTo;
import com.ss.bytertc.engine.SubscribeConfig;
import com.ss.bytertc.engine.UserInfo;
import com.ss.bytertc.engine.data.AVSyncState;
import com.ss.bytertc.engine.data.ForwardStreamEventInfo;
import com.ss.bytertc.engine.data.ForwardStreamStateInfo;
import com.ss.bytertc.engine.flutter.base.RTCMap;
import com.ss.bytertc.engine.flutter.base.RTCTypeBox;
import com.ss.bytertc.engine.flutter.event.EventEmitter;
import com.ss.bytertc.engine.handler.IRTCRoomEventHandler;
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
import com.taobao.accs.common.Constants;
import io.flutter.plugin.common.BinaryMessenger;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class RTCRoomEventProxy extends IRTCRoomEventHandler {
    private final EventEmitter emitter = new EventEmitter();
    private boolean enableRoomStats = false;
    private boolean enableLocalStreamStats = false;
    private boolean enableRemoteStreamStats = false;
    private boolean enableNetworkQualityStats = false;

    public void destroy() {
        this.emitter.destroy();
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onAVSyncStateChange(AVSyncState aVSyncState) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("state", Integer.valueOf(aVSyncState.value()));
        this.emitter.emit("onAVSyncStateChange", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onAudioStreamBanned(String str, boolean z10) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("uid", str);
        map.put("banned", Boolean.valueOf(z10));
        this.emitter.emit("onAudioStreamBanned", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onForwardStreamEvent(ForwardStreamEventInfo[] forwardStreamEventInfoArr) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("eventInfos", RTCMap.from(forwardStreamEventInfoArr));
        this.emitter.emit("onForwardStreamEvent", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onForwardStreamStateChanged(ForwardStreamStateInfo[] forwardStreamStateInfoArr) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("stateInfos", RTCMap.from(forwardStreamStateInfoArr));
        this.emitter.emit("onForwardStreamStateChanged", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onLeaveRoom(RTCRoomStats rTCRoomStats) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("stats", RTCMap.from(rTCRoomStats));
        this.emitter.emit("onLeaveRoom", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onLocalStreamStats(LocalStreamStats localStreamStats) {
        if (this.enableLocalStreamStats) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("stats", RTCMap.from(localStreamStats));
            this.emitter.emit("onLocalStreamStats", map);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onNetworkQuality(NetworkQualityStats networkQualityStats, NetworkQualityStats[] networkQualityStatsArr) {
        if (this.enableNetworkQualityStats) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("localQuality", RTCMap.from(networkQualityStats));
            map.put("remoteQualities", RTCMap.from(networkQualityStatsArr));
            this.emitter.emit("onNetworkQuality", map);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onPublishPrivilegeTokenWillExpire() {
        this.emitter.emit("onPublishPrivilegeTokenWillExpire", new HashMap<>());
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onRemoteStreamStats(RemoteStreamStats remoteStreamStats) {
        if (this.enableRemoteStreamStats) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("stats", RTCMap.from(remoteStreamStats));
            this.emitter.emit("onRemoteStreamStats", map);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onRoomBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("uid", str);
        map.put("message", byteBuffer.array());
        this.emitter.emit("onRoomBinaryMessageReceived", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onRoomExtraInfoUpdate(String str, String str2, String str3, long j10) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("key", str);
        map.put("value", str2);
        map.put("lastUpdateUserId", str3);
        map.put("lastUpdateTimeMs", Long.valueOf(j10));
        this.emitter.emit("onRoomExtraInfoUpdate", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onRoomMessageReceived(String str, String str2) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("uid", str);
        map.put("message", str2);
        this.emitter.emit("onRoomMessageReceived", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onRoomMessageSendResult(long j10, int i10) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("msgid", Long.valueOf(j10));
        map.put("error", Integer.valueOf(i10));
        this.emitter.emit("onRoomMessageSendResult", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onRoomStateChanged(String str, String str2, int i10, String str3) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("roomId", str);
        map.put("uid", str2);
        map.put("state", Integer.valueOf(i10));
        map.put("extraInfo", str3);
        this.emitter.emit("onRoomStateChanged", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onRoomStats(RTCRoomStats rTCRoomStats) {
        if (this.enableRoomStats) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("stats", RTCMap.from(rTCRoomStats));
            this.emitter.emit("onRoomStats", map);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onSetRoomExtraInfoResult(long j10, SetRoomExtraInfoResult setRoomExtraInfoResult) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("taskId", Long.valueOf(j10));
        map.put("error", Integer.valueOf(setRoomExtraInfoResult.value()));
        this.emitter.emit("onSetRoomExtraInfoResult", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onStreamPublishSuccess(String str, boolean z10) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("uid", str);
        map.put("isScreen", Boolean.valueOf(z10));
        this.emitter.emit("onStreamPublishSuccess", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onStreamStateChanged(String str, String str2, int i10, String str3) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("roomId", str);
        map.put("uid", str2);
        map.put("state", Integer.valueOf(i10));
        map.put("extraInfo", str3);
        this.emitter.emit("onStreamStateChanged", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onStreamSubscribed(int i10, String str, SubscribeConfig subscribeConfig) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("stateCode", Integer.valueOf(i10));
        map.put("uid", str);
        map.put("info", RTCMap.from(subscribeConfig));
        this.emitter.emit("onStreamSubscribed", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onSubscribePrivilegeTokenWillExpire() {
        this.emitter.emit("onSubscribePrivilegeTokenWillExpire", new HashMap<>());
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onSubtitleMessageReceived(SubtitleMessage[] subtitleMessageArr) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("subtitles", RTCMap.from(subtitleMessageArr));
        this.emitter.emit("onSubtitleMessageReceived", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onSubtitleStateChanged(SubtitleState subtitleState, SubtitleErrorCode subtitleErrorCode, String str) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("state", Integer.valueOf(subtitleState.value()));
        map.put(Constants.KEY_ERROR_CODE, Integer.valueOf(subtitleErrorCode.value()));
        map.put("errorMessage", str);
        this.emitter.emit("onSubtitleStateChanged", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onTokenWillExpire() {
        this.emitter.emit("onTokenWillExpire", new HashMap<>());
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("uid", str);
        map.put("message", byteBuffer.array());
        this.emitter.emit("onUserBinaryMessageReceived", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserJoined(UserInfo userInfo, int i10) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(Constants.KEY_USER_ID, RTCMap.from(userInfo));
        map.put("elapsed", Integer.valueOf(i10));
        this.emitter.emit("onUserJoined", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserLeave(String str, int i10) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("uid", str);
        map.put("reason", Integer.valueOf(i10));
        this.emitter.emit("onUserLeave", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserMessageReceived(String str, String str2) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("uid", str);
        map.put("message", str2);
        this.emitter.emit("onUserMessageReceived", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserMessageSendResult(long j10, int i10) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("msgid", Long.valueOf(j10));
        map.put("error", Integer.valueOf(i10));
        this.emitter.emit("onUserMessageSendResult", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserPublishScreen(String str, MediaStreamType mediaStreamType) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("uid", str);
        map.put("type", Integer.valueOf(mediaStreamType.value));
        this.emitter.emit("onUserPublishScreen", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserPublishStream(String str, MediaStreamType mediaStreamType) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("uid", str);
        map.put("type", Integer.valueOf(mediaStreamType.value));
        this.emitter.emit("onUserPublishStream", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserUnpublishScreen(String str, MediaStreamType mediaStreamType, StreamRemoveReason streamRemoveReason) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("uid", str);
        map.put("type", Integer.valueOf(mediaStreamType.value));
        map.put("reason", Integer.valueOf(streamRemoveReason.value()));
        this.emitter.emit("onUserUnpublishScreen", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserUnpublishStream(String str, MediaStreamType mediaStreamType, StreamRemoveReason streamRemoveReason) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("uid", str);
        map.put("type", Integer.valueOf(mediaStreamType.value));
        map.put("reason", Integer.valueOf(streamRemoveReason.value()));
        this.emitter.emit("onUserUnpublishStream", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserVisibilityChanged(boolean z10, UserVisibilityChangeError userVisibilityChangeError) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("currentUserVisibility", Boolean.valueOf(z10));
        map.put(Constants.KEY_ERROR_CODE, Integer.valueOf(userVisibilityChangeError.value()));
        this.emitter.emit("onUserVisibilityChanged", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onVideoStreamBanned(String str, boolean z10) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("uid", str);
        map.put("banned", Boolean.valueOf(z10));
        this.emitter.emit("onVideoStreamBanned", map);
    }

    public void registerEvent(BinaryMessenger binaryMessenger, int i10) {
        this.emitter.registerEvent(binaryMessenger, "com.bytedance.ve_rtc_room_event" + i10);
    }

    void setSwitch(RTCTypeBox rTCTypeBox) {
        this.enableNetworkQualityStats = rTCTypeBox.optBoolean("enableNetworkQualityStats", this.enableNetworkQualityStats);
        this.enableLocalStreamStats = rTCTypeBox.optBoolean("enableLocalStreamStats", this.enableLocalStreamStats);
        this.enableRemoteStreamStats = rTCTypeBox.optBoolean("enableRemoteStreamStats", this.enableRemoteStreamStats);
        this.enableRoomStats = rTCTypeBox.optBoolean("enableRoomStats", this.enableRoomStats);
    }
}
