package com.ss.bytertc.engine.flutter.video;

import androidx.annotation.RestrictTo;
import androidx.core.app.o0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.bytertc.engine.SysStats;
import com.ss.bytertc.engine.data.AudioMixingError;
import com.ss.bytertc.engine.data.AudioMixingState;
import com.ss.bytertc.engine.data.AudioRoute;
import com.ss.bytertc.engine.data.DataMessageSourceType;
import com.ss.bytertc.engine.data.LocalAudioPropertiesInfo;
import com.ss.bytertc.engine.data.LocalAudioStreamError;
import com.ss.bytertc.engine.data.LocalAudioStreamState;
import com.ss.bytertc.engine.data.RecordingInfo;
import com.ss.bytertc.engine.data.RecordingProgress;
import com.ss.bytertc.engine.data.RemoteAudioPropertiesInfo;
import com.ss.bytertc.engine.data.RemoteAudioState;
import com.ss.bytertc.engine.data.RemoteAudioStateChangeReason;
import com.ss.bytertc.engine.data.RemoteStreamKey;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.StreamSycnInfoConfig;
import com.ss.bytertc.engine.data.VideoDenoiseMode;
import com.ss.bytertc.engine.data.VideoDenoiseModeChangedReason;
import com.ss.bytertc.engine.data.VideoFrameInfo;
import com.ss.bytertc.engine.data.VideoSuperResolutionMode;
import com.ss.bytertc.engine.data.VideoSuperResolutionModeChangedReason;
import com.ss.bytertc.engine.flutter.base.RTCMap;
import com.ss.bytertc.engine.flutter.base.RTCTypeBox;
import com.ss.bytertc.engine.flutter.event.EventEmitter;
import com.ss.bytertc.engine.handler.IRTCVideoEventHandler;
import com.ss.bytertc.engine.type.AudioDeviceType;
import com.ss.bytertc.engine.type.AudioRecordingErrorCode;
import com.ss.bytertc.engine.type.AudioRecordingState;
import com.ss.bytertc.engine.type.EchoTestResult;
import com.ss.bytertc.engine.type.FirstFramePlayState;
import com.ss.bytertc.engine.type.FirstFrameSendState;
import com.ss.bytertc.engine.type.HardwareEchoDetectionResult;
import com.ss.bytertc.engine.type.LocalProxyError;
import com.ss.bytertc.engine.type.LocalProxyState;
import com.ss.bytertc.engine.type.LocalProxyType;
import com.ss.bytertc.engine.type.LocalVideoStreamError;
import com.ss.bytertc.engine.type.LocalVideoStreamState;
import com.ss.bytertc.engine.type.NetworkDetectionLinkType;
import com.ss.bytertc.engine.type.NetworkDetectionStopReason;
import com.ss.bytertc.engine.type.PerformanceAlarmMode;
import com.ss.bytertc.engine.type.PerformanceAlarmReason;
import com.ss.bytertc.engine.type.PublicStreamErrorCode;
import com.ss.bytertc.engine.type.RecordingErrorCode;
import com.ss.bytertc.engine.type.RecordingState;
import com.ss.bytertc.engine.type.RemoteStreamSwitch;
import com.ss.bytertc.engine.type.RemoteVideoState;
import com.ss.bytertc.engine.type.RemoteVideoStateChangeReason;
import com.ss.bytertc.engine.type.RtcUser;
import com.ss.bytertc.engine.type.SEIStreamUpdateEvent;
import com.ss.bytertc.engine.type.SourceWantedData;
import com.ss.bytertc.engine.type.VideoDeviceType;
import com.ss.bytertc.engine.utils.LogUtil;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.ak;
import io.flutter.plugin.common.BinaryMessenger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class VideoEventProxy extends IRTCVideoEventHandler {
    private final EventEmitter emitter = new EventEmitter();
    private boolean enableSysStats = false;

    public void destroy() {
        this.emitter.destroy();
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onActiveSpeaker(String str, String str2) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("roomId", str);
        map.put("uid", str2);
        this.emitter.emit("onActiveSpeaker", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onAudioDeviceStateChanged(String str, AudioDeviceType audioDeviceType, int i10, int i11) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("deviceId", str);
        map.put("deviceType", Integer.valueOf(audioDeviceType.value()));
        map.put("deviceState", Integer.valueOf(i10));
        map.put("deviceError", Integer.valueOf(i11));
        this.emitter.emit("onAudioDeviceStateChanged", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onAudioDeviceWarning(String str, AudioDeviceType audioDeviceType, int i10) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("deviceId", str);
        map.put("deviceType", Integer.valueOf(audioDeviceType.value()));
        map.put("deviceWarning", Integer.valueOf(i10));
        this.emitter.emit("onAudioDeviceWarning", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onAudioFramePlayStateChanged(String str, RtcUser rtcUser, FirstFramePlayState firstFramePlayState) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("roomId", str);
        map.put(Constants.KEY_USER_ID, RTCMap.from(rtcUser));
        map.put("state", Integer.valueOf(firstFramePlayState.value()));
        this.emitter.emit("onAudioFramePlayStateChanged", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onAudioFrameSendStateChanged(String str, RtcUser rtcUser, FirstFrameSendState firstFrameSendState) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("roomId", str);
        map.put(Constants.KEY_USER_ID, RTCMap.from(rtcUser));
        map.put("state", Integer.valueOf(firstFrameSendState.value()));
        this.emitter.emit("onAudioFrameSendStateChanged", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onAudioMixingPlayingProgress(int i10, long j10) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("mixId", Integer.valueOf(i10));
        map.put("progress", Long.valueOf(j10));
        this.emitter.emit("onAudioMixingPlayingProgress", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onAudioMixingStateChanged(int i10, AudioMixingState audioMixingState, AudioMixingError audioMixingError) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("mixId", Integer.valueOf(i10));
        map.put("state", Integer.valueOf(audioMixingState.value()));
        map.put("error", Integer.valueOf(audioMixingError.value()));
        this.emitter.emit("onAudioMixingStateChanged", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onAudioRecordingStateUpdate(AudioRecordingState audioRecordingState, AudioRecordingErrorCode audioRecordingErrorCode) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("state", Integer.valueOf(audioRecordingState.value()));
        map.put(Constants.KEY_ERROR_CODE, Integer.valueOf(audioRecordingErrorCode.value()));
        this.emitter.emit("onAudioRecordingStateUpdate", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onAudioRouteChanged(AudioRoute audioRoute) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("route", Integer.valueOf(audioRoute.value()));
        this.emitter.emit("onAudioRouteChanged", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onCloudProxyConnected(int i10) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(ak.aT, Integer.valueOf(i10));
        this.emitter.emit("onCloudProxyConnected", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onConnectionStateChanged(int i10, int i11) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("state", Integer.valueOf(i10));
        map.put("reason", Integer.valueOf(i11));
        this.emitter.emit("onConnectionStateChanged", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onCreateRoomStateChanged(String str, int i10) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("roomId", str);
        map.put(Constants.KEY_ERROR_CODE, Integer.valueOf(i10));
        this.emitter.emit("onCreateRoomStateChanged", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onEchoTestResult(EchoTestResult echoTestResult) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("result", Integer.valueOf(echoTestResult.value()));
        this.emitter.emit("onEchoTestResult", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onError(int i10) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("code", Integer.valueOf(i10));
        this.emitter.emit("onError", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onExtensionAccessError(String str, String str2) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("extensionName", str);
        map.put("msg", str2);
        this.emitter.emit("onExtensionAccessError", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onFirstLocalAudioFrame(StreamIndex streamIndex) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(UCropPlusActivity.ARG_INDEX, Integer.valueOf(streamIndex.value()));
        this.emitter.emit("onFirstLocalAudioFrame", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onFirstLocalVideoFrameCaptured(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(UCropPlusActivity.ARG_INDEX, Integer.valueOf(streamIndex.value()));
        map.put("videoFrame", RTCMap.from(videoFrameInfo));
        this.emitter.emit("onFirstLocalVideoFrameCaptured", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onFirstPublicStreamAudioFrame(String str) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("publicStreamId", str);
        this.emitter.emit("onFirstPublicStreamAudioFrame", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onFirstPublicStreamVideoFrameDecoded(String str, VideoFrameInfo videoFrameInfo) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("publicStreamId", str);
        map.put("videoFrame", RTCMap.from(videoFrameInfo));
        this.emitter.emit("onFirstPublicStreamVideoFrameDecoded", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onFirstRemoteAudioFrame(RemoteStreamKey remoteStreamKey) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("streamKey", RTCMap.from(remoteStreamKey));
        this.emitter.emit("onFirstRemoteAudioFrame", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onFirstRemoteVideoFrameDecoded(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("streamKey", RTCMap.from(remoteStreamKey));
        map.put("videoFrame", RTCMap.from(videoFrameInfo));
        this.emitter.emit("onFirstRemoteVideoFrameDecoded", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onFirstRemoteVideoFrameRendered(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("streamKey", RTCMap.from(remoteStreamKey));
        map.put("videoFrame", RTCMap.from(videoFrameInfo));
        this.emitter.emit("onFirstRemoteVideoFrameRendered", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onGetPeerOnlineStatus(String str, int i10) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("uid", str);
        map.put("status", Integer.valueOf(i10));
        this.emitter.emit("onGetPeerOnlineStatus", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onHardwareEchoDetectionResult(HardwareEchoDetectionResult hardwareEchoDetectionResult) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("result", Integer.valueOf(hardwareEchoDetectionResult.value()));
        this.emitter.emit("onHardwareEchoDetectionResult", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onHttpProxyState(int i10) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("state", Integer.valueOf(i10));
        this.emitter.emit("onHttpProxyState", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onHttpsProxyState(int i10) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("state", Integer.valueOf(i10));
        this.emitter.emit("onHttpsProxyState", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onInvokeExperimentalAPI(String str) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(RemoteMessageConst.MessageBody.PARAM, str);
        this.emitter.emit("onInvokeExperimentalAPI", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onLicenseWillExpire(int i10) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("days", Integer.valueOf(i10));
        this.emitter.emit("onLicenseWillExpire", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onLocalAudioPropertiesReport(LocalAudioPropertiesInfo[] localAudioPropertiesInfoArr) {
        ArrayList arrayList = new ArrayList();
        for (LocalAudioPropertiesInfo localAudioPropertiesInfo : localAudioPropertiesInfoArr) {
            HashMap map = new HashMap();
            map.put("type", Integer.valueOf(localAudioPropertiesInfo.streamIndex.value()));
            map.put("audioPropertiesInfo", RTCMap.from(localAudioPropertiesInfo.audioPropertiesInfo));
            arrayList.add(map);
        }
        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("infos", arrayList);
        this.emitter.emit("onLocalAudioPropertiesReport", map2);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onLocalAudioStateChanged(LocalAudioStreamState localAudioStreamState, LocalAudioStreamError localAudioStreamError) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("state", Integer.valueOf(localAudioStreamState.value()));
        map.put("error", Integer.valueOf(localAudioStreamError.value()));
        this.emitter.emit("onLocalAudioStateChanged", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onLocalProxyStateChanged(LocalProxyType localProxyType, LocalProxyState localProxyState, LocalProxyError localProxyError) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("localProxyType", Integer.valueOf(localProxyType.value()));
        map.put("localProxyState", Integer.valueOf(localProxyState.value()));
        map.put("localProxyError", Integer.valueOf(localProxyError.value()));
        this.emitter.emit("onLocalProxyStateChanged", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onLocalVideoSizeChanged(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(UCropPlusActivity.ARG_INDEX, Integer.valueOf(streamIndex.value()));
        map.put("videoFrame", RTCMap.from(videoFrameInfo));
        this.emitter.emit("onLocalVideoSizeChanged", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onLocalVideoStateChanged(StreamIndex streamIndex, LocalVideoStreamState localVideoStreamState, LocalVideoStreamError localVideoStreamError) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(UCropPlusActivity.ARG_INDEX, Integer.valueOf(streamIndex.value()));
        map.put("state", Integer.valueOf(localVideoStreamState.value()));
        map.put("error", Integer.valueOf(localVideoStreamError.value()));
        this.emitter.emit("onLocalVideoStateChanged", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onLogReport(String str, JSONObject jSONObject) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onLoggerMessage(LogUtil.LogLevel logLevel, String str, Throwable th2) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onLoginResult(String str, int i10, int i11) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("uid", str);
        map.put(Constants.KEY_ERROR_CODE, Integer.valueOf(i10));
        map.put("elapsed", Integer.valueOf(i11));
        this.emitter.emit("onLoginResult", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onLogout(int i10) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("reason", Integer.valueOf(i10));
        this.emitter.emit("onLogout", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onNetworkDetectionResult(NetworkDetectionLinkType networkDetectionLinkType, int i10, int i11, double d10, int i12, int i13) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("type", Integer.valueOf(networkDetectionLinkType.value()));
        map.put("quality", Integer.valueOf(i10));
        map.put("rtt", Integer.valueOf(i11));
        map.put("lostRate", Double.valueOf(d10));
        map.put("bitrate", Integer.valueOf(i12));
        map.put("jitter", Integer.valueOf(i13));
        this.emitter.emit("onNetworkDetectionResult", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onNetworkDetectionStopped(NetworkDetectionStopReason networkDetectionStopReason) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("reason", Integer.valueOf(networkDetectionStopReason.value()));
        this.emitter.emit("onNetworkDetectionStopped", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onNetworkTimeSynchronized() {
        this.emitter.emit("onNetworkTimeSynchronized", new HashMap<>());
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onNetworkTypeChanged(int i10) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("type", Integer.valueOf(i10));
        this.emitter.emit("onNetworkTypeChanged", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onPerformanceAlarms(PerformanceAlarmMode performanceAlarmMode, String str, PerformanceAlarmReason performanceAlarmReason, SourceWantedData sourceWantedData) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("mode", Integer.valueOf(performanceAlarmMode.ordinal()));
        map.put("roomId", str);
        map.put("reason", Integer.valueOf(performanceAlarmReason.ordinal()));
        map.put("data", RTCMap.from(sourceWantedData));
        this.emitter.emit("onPerformanceAlarms", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onPlayPublicStreamResult(String str, PublicStreamErrorCode publicStreamErrorCode) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("publicStreamId", str);
        map.put(Constants.KEY_ERROR_CODE, Integer.valueOf(publicStreamErrorCode.value()));
        this.emitter.emit("onPlayPublicStreamResult", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onPublicStreamDataMessageReceived(String str, ByteBuffer byteBuffer, DataMessageSourceType dataMessageSourceType) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("publicStreamId", str);
        map.put("message", byteBuffer.array());
        map.put("sourceType", Integer.valueOf(dataMessageSourceType.value()));
        this.emitter.emit("onPublicStreamDataMessageReceived", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onPublicStreamSEIMessageReceived(String str, ByteBuffer byteBuffer, DataMessageSourceType dataMessageSourceType) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("publicStreamId", str);
        map.put("message", byteBuffer.array());
        map.put("sourceType", Integer.valueOf(dataMessageSourceType.value()));
        this.emitter.emit("onPublicStreamSEIMessageReceived", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onPublicStreamSEIMessageReceivedWithChannel(String str, int i10, ByteBuffer byteBuffer) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("publicStreamId", str);
        map.put(RemoteMessageConst.Notification.CHANNEL_ID, Integer.valueOf(i10));
        map.put("message", byteBuffer.array());
        this.emitter.emit("onPublicStreamSEIMessageReceivedWithChannel", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onPushPublicStreamResult(String str, String str2, PublicStreamErrorCode publicStreamErrorCode) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("roomId", str);
        map.put("publicStreamId", str2);
        map.put(Constants.KEY_ERROR_CODE, Integer.valueOf(publicStreamErrorCode.value()));
        this.emitter.emit("onPushPublicStreamResult", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onRecordingProgressUpdate(StreamIndex streamIndex, RecordingProgress recordingProgress, RecordingInfo recordingInfo) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("type", Integer.valueOf(streamIndex.value()));
        map.put("progress", RTCMap.from(recordingProgress));
        map.put("info", RTCMap.from(recordingInfo));
        this.emitter.emit("onRecordingProgressUpdate", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onRecordingStateUpdate(StreamIndex streamIndex, RecordingState recordingState, RecordingErrorCode recordingErrorCode, RecordingInfo recordingInfo) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("type", Integer.valueOf(streamIndex.value()));
        map.put("state", Integer.valueOf(recordingState.value()));
        map.put(Constants.KEY_ERROR_CODE, Integer.valueOf(recordingErrorCode.value()));
        map.put("info", RTCMap.from(recordingInfo));
        this.emitter.emit("onRecordingStateUpdate", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onRemoteAudioPropertiesReport(RemoteAudioPropertiesInfo[] remoteAudioPropertiesInfoArr, int i10) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("infos", RTCMap.from(remoteAudioPropertiesInfoArr));
        map.put("totalRemoteVolume", Integer.valueOf(i10));
        this.emitter.emit("onRemoteAudioPropertiesReport", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onRemoteAudioStateChanged(RemoteStreamKey remoteStreamKey, RemoteAudioState remoteAudioState, RemoteAudioStateChangeReason remoteAudioStateChangeReason) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("streamKey", RTCMap.from(remoteStreamKey));
        map.put("state", Integer.valueOf(remoteAudioState.value()));
        map.put("reason", Integer.valueOf(remoteAudioStateChangeReason.value()));
        this.emitter.emit("onRemoteAudioStateChanged", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onRemoteVideoSizeChanged(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("streamKey", RTCMap.from(remoteStreamKey));
        map.put("videoFrame", RTCMap.from(videoFrameInfo));
        this.emitter.emit("onRemoteVideoSizeChanged", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onRemoteVideoStateChanged(RemoteStreamKey remoteStreamKey, RemoteVideoState remoteVideoState, RemoteVideoStateChangeReason remoteVideoStateChangeReason) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("streamKey", RTCMap.from(remoteStreamKey));
        map.put("state", Integer.valueOf(remoteVideoState.value()));
        map.put("reason", Integer.valueOf(remoteVideoStateChangeReason.value()));
        this.emitter.emit("onRemoteVideoStateChanged", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onRemoteVideoSuperResolutionModeChanged(RemoteStreamKey remoteStreamKey, VideoSuperResolutionMode videoSuperResolutionMode, VideoSuperResolutionModeChangedReason videoSuperResolutionModeChangedReason) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("streamKey", RTCMap.from(remoteStreamKey));
        map.put("mode", Integer.valueOf(videoSuperResolutionMode.value()));
        map.put("reason", Integer.valueOf(videoSuperResolutionModeChangedReason.value()));
        this.emitter.emit("onRemoteVideoSuperResolutionModeChanged", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onSEIMessageReceived(RemoteStreamKey remoteStreamKey, ByteBuffer byteBuffer) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("streamKey", RTCMap.from(remoteStreamKey));
        map.put("message", byteBuffer.array());
        this.emitter.emit("onSEIMessageReceived", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onSEIStreamUpdate(RemoteStreamKey remoteStreamKey, SEIStreamUpdateEvent sEIStreamUpdateEvent) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("streamKey", RTCMap.from(remoteStreamKey));
        map.put(o0.I0, Integer.valueOf(sEIStreamUpdateEvent.value()));
        this.emitter.emit("onSEIStreamUpdate", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onScreenVideoFramePlayStateChanged(String str, RtcUser rtcUser, FirstFramePlayState firstFramePlayState) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("roomId", str);
        map.put(Constants.KEY_USER_ID, RTCMap.from(rtcUser));
        map.put("state", Integer.valueOf(firstFramePlayState.value()));
        this.emitter.emit("onScreenVideoFramePlayStateChanged", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onScreenVideoFrameSendStateChanged(String str, RtcUser rtcUser, FirstFrameSendState firstFrameSendState) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("roomId", str);
        map.put(Constants.KEY_USER_ID, RTCMap.from(rtcUser));
        map.put("state", Integer.valueOf(firstFrameSendState.value()));
        this.emitter.emit("onScreenVideoFrameSendStateChanged", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onServerMessageSendResult(long j10, int i10, ByteBuffer byteBuffer) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("msgid", Long.valueOf(j10));
        map.put("error", Integer.valueOf(i10));
        map.put("message", byteBuffer.array());
        this.emitter.emit("onServerMessageSendResult", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onServerParamsSetResult(int i10) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("error", Integer.valueOf(i10));
        this.emitter.emit("onServerParamsSetResult", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onSimulcastSubscribeFallback(RemoteStreamSwitch remoteStreamSwitch) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(o0.I0, RTCMap.from(remoteStreamSwitch));
        this.emitter.emit("onSimulcastSubscribeFallback", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onSocks5ProxyState(int i10, String str, String str2, String str3, String str4) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("state", Integer.valueOf(i10));
        map.put(com.taobao.agoo.a.a.b.JSON_CMD, str);
        map.put("proxyAddress", str2);
        map.put("localAddress", str3);
        map.put("remoteAddress", str4);
        this.emitter.emit("onSocks5ProxyState", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onStreamSyncInfoReceived(RemoteStreamKey remoteStreamKey, StreamSycnInfoConfig.SyncInfoStreamType syncInfoStreamType, ByteBuffer byteBuffer) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("streamKey", RTCMap.from(remoteStreamKey));
        map.put("streamType", Integer.valueOf(syncInfoStreamType.ordinal()));
        map.put("data", byteBuffer.array());
        this.emitter.emit("onStreamSyncInfoReceived", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onSysStats(SysStats sysStats) {
        if (this.enableSysStats) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("stats", RTCMap.from(sysStats));
            this.emitter.emit("onSysStats", map);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onUserBinaryMessageReceivedOutsideRoom(String str, ByteBuffer byteBuffer) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("uid", str);
        map.put("message", byteBuffer.array());
        this.emitter.emit("onUserBinaryMessageReceivedOutsideRoom", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onUserMessageReceivedOutsideRoom(String str, String str2) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("uid", str);
        map.put("message", str2);
        this.emitter.emit("onUserMessageReceivedOutsideRoom", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onUserMessageSendResultOutsideRoom(long j10, int i10) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("msgid", Long.valueOf(j10));
        map.put("error", Integer.valueOf(i10));
        this.emitter.emit("onUserMessageSendResultOutsideRoom", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onUserStartAudioCapture(String str, String str2) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("roomId", str);
        map.put("uid", str2);
        this.emitter.emit("onUserStartAudioCapture", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onUserStartVideoCapture(String str, String str2) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("roomId", str);
        map.put("uid", str2);
        this.emitter.emit("onUserStartVideoCapture", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onUserStopAudioCapture(String str, String str2) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("roomId", str);
        map.put("uid", str2);
        this.emitter.emit("onUserStopAudioCapture", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onUserStopVideoCapture(String str, String str2) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("roomId", str);
        map.put("uid", str2);
        this.emitter.emit("onUserStopVideoCapture", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onVideoDenoiseModeChanged(VideoDenoiseMode videoDenoiseMode, VideoDenoiseModeChangedReason videoDenoiseModeChangedReason) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("mode", Integer.valueOf(videoDenoiseMode.value()));
        map.put("reason", Integer.valueOf(videoDenoiseModeChangedReason.value()));
        this.emitter.emit("onVideoDenoiseModeChanged", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onVideoDeviceStateChanged(String str, VideoDeviceType videoDeviceType, int i10, int i11) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("deviceId", str);
        map.put("deviceType", Integer.valueOf(videoDeviceType.value()));
        map.put("deviceState", Integer.valueOf(i10));
        map.put("deviceError", Integer.valueOf(i11));
        this.emitter.emit("onVideoDeviceStateChanged", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onVideoDeviceWarning(String str, VideoDeviceType videoDeviceType, int i10) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("deviceId", str);
        map.put("deviceType", Integer.valueOf(videoDeviceType.value()));
        map.put("deviceWarning", Integer.valueOf(i10));
        this.emitter.emit("onVideoDeviceWarning", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onVideoFramePlayStateChanged(String str, RtcUser rtcUser, FirstFramePlayState firstFramePlayState) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("roomId", str);
        map.put(Constants.KEY_USER_ID, RTCMap.from(rtcUser));
        map.put("state", Integer.valueOf(firstFramePlayState.value()));
        this.emitter.emit("onVideoFramePlayStateChanged", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onVideoFrameSendStateChanged(String str, RtcUser rtcUser, FirstFrameSendState firstFrameSendState) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("roomId", str);
        map.put(Constants.KEY_USER_ID, RTCMap.from(rtcUser));
        map.put("state", Integer.valueOf(firstFrameSendState.value()));
        this.emitter.emit("onVideoFrameSendStateChanged", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onWarning(int i10) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("code", Integer.valueOf(i10));
        this.emitter.emit("onWarning", map);
    }

    public void registerEvent(BinaryMessenger binaryMessenger) {
        this.emitter.registerEvent(binaryMessenger, "com.bytedance.ve_rtc_video_event");
    }

    public void setSwitches(RTCTypeBox rTCTypeBox) {
        this.enableSysStats = rTCTypeBox.optBoolean("enableSysStats", this.enableSysStats);
    }
}
