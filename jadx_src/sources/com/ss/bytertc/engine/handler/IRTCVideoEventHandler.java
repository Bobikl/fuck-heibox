package com.ss.bytertc.engine.handler;

import android.annotation.SuppressLint;
import com.ss.bytertc.engine.SysStats;
import com.ss.bytertc.engine.data.AudioMixingError;
import com.ss.bytertc.engine.data.AudioMixingState;
import com.ss.bytertc.engine.data.AudioPlaybackDevice;
import com.ss.bytertc.engine.data.AudioRoute;
import com.ss.bytertc.engine.data.DataMessageSourceType;
import com.ss.bytertc.engine.data.DeadLockMsg;
import com.ss.bytertc.engine.data.FrameUpdateInfo;
import com.ss.bytertc.engine.data.LocalAudioPropertiesInfo;
import com.ss.bytertc.engine.data.LocalAudioStreamError;
import com.ss.bytertc.engine.data.LocalAudioStreamState;
import com.ss.bytertc.engine.data.MuteState;
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
import com.ss.bytertc.engine.type.AudioDeviceType;
import com.ss.bytertc.engine.type.AudioDumpStatus;
import com.ss.bytertc.engine.type.AudioRecordingErrorCode;
import com.ss.bytertc.engine.type.AudioRecordingState;
import com.ss.bytertc.engine.type.EchoTestResult;
import com.ss.bytertc.engine.type.EffectErrorType;
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
import com.ss.bytertc.engine.type.RenderError;
import com.ss.bytertc.engine.type.RtcUser;
import com.ss.bytertc.engine.type.SEIStreamUpdateEvent;
import com.ss.bytertc.engine.type.SourceWantedData;
import com.ss.bytertc.engine.type.VideoDeviceType;
import com.ss.bytertc.engine.utils.LogUtil;
import java.nio.ByteBuffer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"DefaultLocale"})
public abstract class IRTCVideoEventHandler {
    public void onActiveSpeaker(String str, String str2) {
    }

    public void onAudioDeviceStateChanged(String str, AudioDeviceType audioDeviceType, int i10, int i11) {
    }

    public void onAudioDeviceWarning(String str, AudioDeviceType audioDeviceType, int i10) {
    }

    public void onAudioDumpStateChanged(AudioDumpStatus audioDumpStatus) {
    }

    public void onAudioFramePlayStateChanged(String str, RtcUser rtcUser, FirstFramePlayState firstFramePlayState) {
    }

    public void onAudioFrameSendStateChanged(String str, RtcUser rtcUser, FirstFrameSendState firstFrameSendState) {
    }

    public void onAudioMixingPlayingProgress(int i10, long j10) {
    }

    public void onAudioMixingStateChanged(int i10, AudioMixingState audioMixingState, AudioMixingError audioMixingError) {
    }

    @Deprecated
    public void onAudioPlaybackDeviceChanged(AudioPlaybackDevice audioPlaybackDevice) {
    }

    public void onAudioPlaybackDeviceTestVolume(int i10) {
    }

    public void onAudioRecordingStateUpdate(AudioRecordingState audioRecordingState, AudioRecordingErrorCode audioRecordingErrorCode) {
    }

    public void onAudioRouteChanged(AudioRoute audioRoute) {
    }

    public void onCloudProxyConnected(int i10) {
    }

    public void onConnectionStateChanged(int i10, int i11) {
    }

    public void onCreateRoomStateChanged(String str, int i10) {
    }

    public void onDeadLockError(DeadLockMsg deadLockMsg) {
    }

    public void onEchoTestResult(EchoTestResult echoTestResult) {
    }

    public void onEffectError(EffectErrorType effectErrorType, String str) {
    }

    public void onError(int i10) {
    }

    public void onExtensionAccessError(String str, String str2) {
    }

    public void onExternalScreenFrameUpdate(FrameUpdateInfo frameUpdateInfo) {
    }

    public void onFirstLocalAudioFrame(StreamIndex streamIndex) {
    }

    public void onFirstLocalVideoFrameCaptured(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
    }

    public void onFirstPublicStreamAudioFrame(String str) {
    }

    public void onFirstPublicStreamVideoFrameDecoded(String str, VideoFrameInfo videoFrameInfo) {
    }

    public void onFirstRemoteAudioFrame(RemoteStreamKey remoteStreamKey) {
    }

    public void onFirstRemoteVideoFrameDecoded(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
    }

    public void onFirstRemoteVideoFrameRendered(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
    }

    public void onGetPeerOnlineStatus(String str, int i10) {
    }

    public void onHardwareEchoDetectionResult(HardwareEchoDetectionResult hardwareEchoDetectionResult) {
    }

    public void onHttpProxyState(int i10) {
    }

    public void onHttpsProxyState(int i10) {
    }

    public void onInvokeExperimentalAPI(String str) {
    }

    public void onLicenseWillExpire(int i10) {
    }

    public void onLocalAudioPropertiesReport(LocalAudioPropertiesInfo[] localAudioPropertiesInfoArr) {
    }

    public void onLocalAudioStateChanged(LocalAudioStreamState localAudioStreamState, LocalAudioStreamError localAudioStreamError) {
    }

    public void onLocalProxyStateChanged(LocalProxyType localProxyType, LocalProxyState localProxyState, LocalProxyError localProxyError) {
    }

    public void onLocalVideoSizeChanged(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
    }

    public void onLocalVideoStateChanged(StreamIndex streamIndex, LocalVideoStreamState localVideoStreamState, LocalVideoStreamError localVideoStreamError) {
    }

    public void onLogReport(String str, JSONObject jSONObject) {
    }

    public void onLoggerMessage(LogUtil.LogLevel logLevel, String str, Throwable th2) {
    }

    public void onLoginResult(String str, int i10, int i11) {
    }

    public void onLogout(int i10) {
    }

    @Deprecated
    public void onMediaDeviceStateChanged(String str, int i10, int i11, int i12) {
    }

    @Deprecated
    public void onMediaDeviceWarning(String str, int i10, int i11) {
    }

    public void onNetworkDetectionResult(NetworkDetectionLinkType networkDetectionLinkType, int i10, int i11, double d10, int i12, int i13) {
    }

    public void onNetworkDetectionStopped(NetworkDetectionStopReason networkDetectionStopReason) {
    }

    public void onNetworkTimeSynchronized() {
    }

    public void onNetworkTypeChanged(int i10) {
    }

    public void onPerformanceAlarms(PerformanceAlarmMode performanceAlarmMode, String str, PerformanceAlarmReason performanceAlarmReason, SourceWantedData sourceWantedData) {
    }

    public void onPlayPublicStreamResult(String str, PublicStreamErrorCode publicStreamErrorCode) {
    }

    public void onPublicStreamDataMessageReceived(String str, ByteBuffer byteBuffer, DataMessageSourceType dataMessageSourceType) {
    }

    public void onPublicStreamSEIMessageReceived(String str, ByteBuffer byteBuffer, DataMessageSourceType dataMessageSourceType) {
    }

    public void onPublicStreamSEIMessageReceivedWithChannel(String str, int i10, ByteBuffer byteBuffer) {
    }

    public void onPushPublicStreamResult(String str, String str2, PublicStreamErrorCode publicStreamErrorCode) {
    }

    public void onRecordingProgressUpdate(StreamIndex streamIndex, RecordingProgress recordingProgress, RecordingInfo recordingInfo) {
    }

    public void onRecordingStateUpdate(StreamIndex streamIndex, RecordingState recordingState, RecordingErrorCode recordingErrorCode, RecordingInfo recordingInfo) {
    }

    public void onRemoteAudioPropertiesReport(RemoteAudioPropertiesInfo[] remoteAudioPropertiesInfoArr, int i10) {
    }

    public void onRemoteAudioStateChanged(RemoteStreamKey remoteStreamKey, RemoteAudioState remoteAudioState, RemoteAudioStateChangeReason remoteAudioStateChangeReason) {
    }

    public void onRemoteRenderError(RemoteStreamKey remoteStreamKey, RenderError renderError, String str) {
    }

    public void onRemoteVideoSizeChanged(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
    }

    public void onRemoteVideoStateChanged(RemoteStreamKey remoteStreamKey, RemoteVideoState remoteVideoState, RemoteVideoStateChangeReason remoteVideoStateChangeReason) {
    }

    public void onRemoteVideoSuperResolutionModeChanged(RemoteStreamKey remoteStreamKey, VideoSuperResolutionMode videoSuperResolutionMode, VideoSuperResolutionModeChangedReason videoSuperResolutionModeChangedReason) {
    }

    public void onSEIMessageReceived(RemoteStreamKey remoteStreamKey, ByteBuffer byteBuffer) {
    }

    public void onSEIStreamUpdate(RemoteStreamKey remoteStreamKey, SEIStreamUpdateEvent sEIStreamUpdateEvent) {
    }

    public void onScreenVideoFramePlayStateChanged(String str, RtcUser rtcUser, FirstFramePlayState firstFramePlayState) {
    }

    public void onScreenVideoFrameSendStateChanged(String str, RtcUser rtcUser, FirstFrameSendState firstFrameSendState) {
    }

    public void onServerMessageSendResult(long j10, int i10, ByteBuffer byteBuffer) {
    }

    public void onServerParamsSetResult(int i10) {
    }

    public void onSimulcastSubscribeFallback(RemoteStreamSwitch remoteStreamSwitch) {
    }

    public void onSocks5ProxyState(int i10, String str, String str2, String str3, String str4) {
    }

    public void onStreamSyncInfoReceived(RemoteStreamKey remoteStreamKey, StreamSycnInfoConfig.SyncInfoStreamType syncInfoStreamType, ByteBuffer byteBuffer) {
    }

    public void onSysStats(SysStats sysStats) {
    }

    public void onUserBinaryMessageReceivedOutsideRoom(String str, ByteBuffer byteBuffer) {
    }

    public void onUserMessageReceivedOutsideRoom(String str, String str2) {
    }

    public void onUserMessageSendResultOutsideRoom(long j10, int i10) {
    }

    @Deprecated
    public void onUserMuteAudio(String str, String str2, MuteState muteState) {
    }

    @Deprecated
    public void onUserMuteVideo(String str, String str2, MuteState muteState) {
    }

    public void onUserStartAudioCapture(String str, String str2) {
    }

    public void onUserStartVideoCapture(String str, String str2) {
    }

    public void onUserStopAudioCapture(String str, String str2) {
    }

    public void onUserStopVideoCapture(String str, String str2) {
    }

    public void onVideoDenoiseModeChanged(VideoDenoiseMode videoDenoiseMode, VideoDenoiseModeChangedReason videoDenoiseModeChangedReason) {
    }

    public void onVideoDeviceStateChanged(String str, VideoDeviceType videoDeviceType, int i10, int i11) {
    }

    public void onVideoDeviceWarning(String str, VideoDeviceType videoDeviceType, int i10) {
    }

    public void onVideoFramePlayStateChanged(String str, RtcUser rtcUser, FirstFramePlayState firstFramePlayState) {
    }

    public void onVideoFrameSendStateChanged(String str, RtcUser rtcUser, FirstFrameSendState firstFrameSendState) {
    }

    public void onWarning(int i10) {
    }
}
