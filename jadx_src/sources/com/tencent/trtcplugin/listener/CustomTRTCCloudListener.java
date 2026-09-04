package com.tencent.trtcplugin.listener;

import android.os.Bundle;
import com.google.gson.Gson;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.trtc.TRTCCloudListener;
import com.tencent.trtc.TRTCStatistics;
import i7.a;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class CustomTRTCCloudListener extends TRTCCloudListener {
    private static final String LISTENER_FUNC_NAME = "onListener";
    private MethodChannel channel;

    public CustomTRTCCloudListener(MethodChannel methodChannel) {
        this.channel = methodChannel;
    }

    private void invokeListener(CallBackNoticeEnum callBackNoticeEnum, Object obj) {
        Gson gson = new Gson();
        HashMap map = new HashMap();
        map.put("type", callBackNoticeEnum);
        if (obj != null) {
            map.put("params", obj);
        }
        this.channel.invokeMethod(LISTENER_FUNC_NAME, gson.toJson(map));
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onAudioRouteChanged(int i10, int i11) {
        super.onAudioRouteChanged(i10, i11);
        HashMap map = new HashMap();
        map.put("route", Integer.valueOf(i10));
        map.put("fromRoute", Integer.valueOf(i11));
        invokeListener(CallBackNoticeEnum.onAudioRouteChanged, map);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onCameraDidReady() {
        super.onCameraDidReady();
        invokeListener(CallBackNoticeEnum.onCameraDidReady, null);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onConnectOtherRoom(String str, int i10, String str2) {
        super.onConnectOtherRoom(str, i10, str2);
        HashMap map = new HashMap();
        map.put("userId", str);
        map.put(a.i.f119320o, Integer.valueOf(i10));
        map.put("errMsg", str2);
        invokeListener(CallBackNoticeEnum.onConnectOtherRoom, map);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onConnectionLost() {
        super.onConnectionLost();
        invokeListener(CallBackNoticeEnum.onConnectionLost, null);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onConnectionRecovery() {
        super.onConnectionRecovery();
        invokeListener(CallBackNoticeEnum.onConnectionRecovery, null);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onDisConnectOtherRoom(int i10, String str) {
        super.onDisConnectOtherRoom(i10, str);
        HashMap map = new HashMap();
        map.put(a.i.f119320o, Integer.valueOf(i10));
        map.put("errMsg", str);
        invokeListener(CallBackNoticeEnum.onDisConnectOtherRoom, map);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onEnterRoom(long j10) {
        super.onEnterRoom(j10);
        invokeListener(CallBackNoticeEnum.onEnterRoom, Long.valueOf(j10));
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onError(int i10, String str, Bundle bundle) {
        super.onError(i10, str, bundle);
        HashMap map = new HashMap();
        map.put(a.i.f119320o, Integer.valueOf(i10));
        map.put("errMsg", str);
        invokeListener(CallBackNoticeEnum.onError, map);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onExitRoom(int i10) {
        super.onExitRoom(i10);
        invokeListener(CallBackNoticeEnum.onExitRoom, Integer.valueOf(i10));
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onFirstAudioFrame(String str) {
        super.onFirstAudioFrame(str);
        invokeListener(CallBackNoticeEnum.onFirstAudioFrame, str);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onFirstVideoFrame(String str, int i10, int i11, int i12) {
        super.onFirstVideoFrame(str, i10, i11, i12);
        HashMap map = new HashMap();
        map.put("userId", str);
        map.put("streamType", Integer.valueOf(i10));
        map.put("width", Integer.valueOf(i11));
        map.put("height", Integer.valueOf(i12));
        invokeListener(CallBackNoticeEnum.onFirstVideoFrame, map);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onLocalRecordBegin(int i10, String str) {
        HashMap map = new HashMap();
        map.put(a.i.f119320o, Integer.valueOf(i10));
        map.put("storagePath", str);
        invokeListener(CallBackNoticeEnum.onLocalRecordBegin, map);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onLocalRecordComplete(int i10, String str) {
        HashMap map = new HashMap();
        map.put(a.i.f119320o, Integer.valueOf(i10));
        map.put("storagePath", str);
        invokeListener(CallBackNoticeEnum.onLocalRecordComplete, map);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onLocalRecordFragment(String str) {
        HashMap map = new HashMap();
        map.put("storagePath", str);
        invokeListener(CallBackNoticeEnum.onLocalRecordFragment, map);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onLocalRecording(long j10, String str) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j10));
        map.put("storagePath", str);
        invokeListener(CallBackNoticeEnum.onLocalRecording, map);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onMicDidReady() {
        super.onMicDidReady();
        invokeListener(CallBackNoticeEnum.onMicDidReady, null);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onMissCustomCmdMsg(String str, int i10, int i11, int i12) {
        super.onMissCustomCmdMsg(str, i10, i11, i12);
        HashMap map = new HashMap();
        map.put("userId", str);
        map.put("cmdID", Integer.valueOf(i10));
        map.put(a.i.f119320o, Integer.valueOf(i11));
        map.put("missed", Integer.valueOf(i12));
        invokeListener(CallBackNoticeEnum.onMissCustomCmdMsg, map);
    }

    public void onMusicObserverComplete(int i10, int i11) {
        HashMap map = new HashMap();
        map.put("id", Integer.valueOf(i10));
        map.put(a.i.f119320o, Integer.valueOf(i11));
        invokeListener(CallBackNoticeEnum.onMusicObserverComplete, map);
    }

    public void onMusicObserverPlayProgress(int i10, long j10, long j11) {
        HashMap map = new HashMap();
        map.put("id", Integer.valueOf(i10));
        map.put("curPtsMS", Long.valueOf(j10));
        map.put("durationMS", Long.valueOf(j11));
        invokeListener(CallBackNoticeEnum.onMusicObserverPlayProgress, map);
    }

    public void onMusicObserverStart(int i10, int i11) {
        HashMap map = new HashMap();
        map.put("id", Integer.valueOf(i10));
        map.put(a.i.f119320o, Integer.valueOf(i11));
        invokeListener(CallBackNoticeEnum.onMusicObserverStart, map);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onNetworkQuality(TRTCCloudDef.TRTCQuality tRTCQuality, ArrayList<TRTCCloudDef.TRTCQuality> arrayList) {
        super.onNetworkQuality(tRTCQuality, arrayList);
        HashMap map = new HashMap();
        map.put("localQuality", tRTCQuality);
        map.put("remoteQuality", arrayList);
        invokeListener(CallBackNoticeEnum.onNetworkQuality, map);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onRecvCustomCmdMsg(String str, int i10, int i11, byte[] bArr) {
        super.onRecvCustomCmdMsg(str, i10, i11, bArr);
        HashMap map = new HashMap();
        map.put("userId", str);
        map.put("cmdID", Integer.valueOf(i10));
        map.put("seq", Integer.valueOf(i11));
        map.put("message", new String(bArr));
        invokeListener(CallBackNoticeEnum.onRecvCustomCmdMsg, map);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onRecvSEIMsg(String str, byte[] bArr) {
        super.onRecvSEIMsg(str, bArr);
        HashMap map = new HashMap();
        map.put("userId", str);
        map.put("message", new String(bArr));
        invokeListener(CallBackNoticeEnum.onRecvSEIMsg, map);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onRemoteUserEnterRoom(String str) {
        super.onRemoteUserEnterRoom(str);
        invokeListener(CallBackNoticeEnum.onRemoteUserEnterRoom, str);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onRemoteUserLeaveRoom(String str, int i10) {
        super.onRemoteUserLeaveRoom(str, i10);
        HashMap map = new HashMap();
        map.put("userId", str);
        map.put("reason", Integer.valueOf(i10));
        invokeListener(CallBackNoticeEnum.onRemoteUserLeaveRoom, map);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onScreenCapturePaused() {
        super.onScreenCapturePaused();
        invokeListener(CallBackNoticeEnum.onScreenCapturePaused, 0);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onScreenCaptureResumed() {
        super.onScreenCaptureResumed();
        invokeListener(CallBackNoticeEnum.onScreenCaptureResumed, 0);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onScreenCaptureStarted() {
        super.onScreenCaptureStarted();
        invokeListener(CallBackNoticeEnum.onScreenCaptureStarted, 0);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onScreenCaptureStopped(int i10) {
        super.onScreenCaptureStopped(i10);
        invokeListener(CallBackNoticeEnum.onScreenCaptureStoped, Integer.valueOf(i10));
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onSendFirstLocalAudioFrame() {
        super.onSendFirstLocalAudioFrame();
        invokeListener(CallBackNoticeEnum.onSendFirstLocalAudioFrame, null);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onSendFirstLocalVideoFrame(int i10) {
        super.onSendFirstLocalVideoFrame(i10);
        invokeListener(CallBackNoticeEnum.onSendFirstLocalVideoFrame, Integer.valueOf(i10));
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onSetMixTranscodingConfig(int i10, String str) {
        super.onSetMixTranscodingConfig(i10, str);
        HashMap map = new HashMap();
        map.put(a.i.f119320o, Integer.valueOf(i10));
        map.put("errMsg", str);
        invokeListener(CallBackNoticeEnum.onSetMixTranscodingConfig, map);
    }

    public void onSnapshotComplete(int i10, String str, String str2) {
        HashMap map = new HashMap();
        map.put(a.i.f119320o, Integer.valueOf(i10));
        map.put("errMsg", str);
        map.put(FlutterActivityLaunchConfigs.EXTRA_PATH, str2);
        invokeListener(CallBackNoticeEnum.onSnapshotComplete, map);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onSpeedTest(TRTCCloudDef.TRTCSpeedTestResult tRTCSpeedTestResult, int i10, int i11) {
        super.onSpeedTest(tRTCSpeedTestResult, i10, i11);
        HashMap map = new HashMap();
        map.put("currentResult", tRTCSpeedTestResult);
        map.put("finishedCount", Integer.valueOf(i10));
        map.put("totalCount", Integer.valueOf(i11));
        invokeListener(CallBackNoticeEnum.onSpeedTest, map);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onSpeedTestResult(TRTCCloudDef.TRTCSpeedTestResult tRTCSpeedTestResult) {
        super.onSpeedTestResult(tRTCSpeedTestResult);
        HashMap map = new HashMap();
        map.put("result", tRTCSpeedTestResult);
        invokeListener(CallBackNoticeEnum.onSpeedTestResult, map);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onStartPublishCDNStream(int i10, String str) {
        super.onStartPublishCDNStream(i10, str);
        HashMap map = new HashMap();
        map.put(a.i.f119320o, Integer.valueOf(i10));
        map.put("errMsg", str);
        invokeListener(CallBackNoticeEnum.onStartPublishCDNStream, map);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onStartPublishMediaStream(String str, int i10, String str2, Bundle bundle) {
        super.onStartPublishMediaStream(str, i10, str2, bundle);
        HashMap map = new HashMap();
        map.put("taskId", str);
        map.put("code", Integer.valueOf(i10));
        map.put("message", str2);
        invokeListener(CallBackNoticeEnum.onStartPublishMediaStream, map);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onStartPublishing(int i10, String str) {
        super.onStartPublishing(i10, str);
        HashMap map = new HashMap();
        map.put(a.i.f119320o, Integer.valueOf(i10));
        map.put("errMsg", str);
        invokeListener(CallBackNoticeEnum.onStartPublishing, map);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onStatistics(TRTCStatistics tRTCStatistics) {
        super.onStatistics(tRTCStatistics);
        invokeListener(CallBackNoticeEnum.onStatistics, tRTCStatistics);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onStopPublishCDNStream(int i10, String str) {
        super.onStopPublishCDNStream(i10, str);
        HashMap map = new HashMap();
        map.put(a.i.f119320o, Integer.valueOf(i10));
        map.put("errMsg", str);
        invokeListener(CallBackNoticeEnum.onStopPublishCDNStream, map);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onStopPublishMediaStream(String str, int i10, String str2, Bundle bundle) {
        super.onStopPublishMediaStream(str, i10, str2, bundle);
        HashMap map = new HashMap();
        map.put("taskId", str);
        map.put("code", Integer.valueOf(i10));
        map.put("message", str2);
        invokeListener(CallBackNoticeEnum.onStopPublishMediaStream, map);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onStopPublishing(int i10, String str) {
        super.onStopPublishing(i10, str);
        HashMap map = new HashMap();
        map.put(a.i.f119320o, Integer.valueOf(i10));
        map.put("errMsg", str);
        invokeListener(CallBackNoticeEnum.onStopPublishing, map);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onSwitchRole(int i10, String str) {
        super.onSwitchRole(i10, str);
        HashMap map = new HashMap();
        map.put(a.i.f119320o, Integer.valueOf(i10));
        map.put("errMsg", str);
        invokeListener(CallBackNoticeEnum.onSwitchRole, map);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onSwitchRoom(int i10, String str) {
        super.onSwitchRoom(i10, str);
        HashMap map = new HashMap();
        map.put(a.i.f119320o, Integer.valueOf(i10));
        map.put("errMsg", str);
        invokeListener(CallBackNoticeEnum.onSwitchRoom, map);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onTryToReconnect() {
        super.onTryToReconnect();
        invokeListener(CallBackNoticeEnum.onTryToReconnect, null);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onUpdatePublishMediaStream(String str, int i10, String str2, Bundle bundle) {
        super.onUpdatePublishMediaStream(str, i10, str2, bundle);
        HashMap map = new HashMap();
        map.put("taskId", str);
        map.put("code", Integer.valueOf(i10));
        map.put("message", str2);
        invokeListener(CallBackNoticeEnum.onUpdatePublishMediaStream, map);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onUserAudioAvailable(String str, boolean z10) {
        super.onUserAudioAvailable(str, z10);
        HashMap map = new HashMap();
        map.put("userId", str);
        map.put("available", Boolean.valueOf(z10));
        invokeListener(CallBackNoticeEnum.onUserAudioAvailable, map);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onUserSubStreamAvailable(String str, boolean z10) {
        super.onUserSubStreamAvailable(str, z10);
        HashMap map = new HashMap();
        map.put("userId", str);
        map.put("available", Boolean.valueOf(z10));
        invokeListener(CallBackNoticeEnum.onUserSubStreamAvailable, map);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onUserVideoAvailable(String str, boolean z10) {
        super.onUserVideoAvailable(str, z10);
        HashMap map = new HashMap();
        map.put("userId", str);
        map.put("available", Boolean.valueOf(z10));
        invokeListener(CallBackNoticeEnum.onUserVideoAvailable, map);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onUserVoiceVolume(ArrayList<TRTCCloudDef.TRTCVolumeInfo> arrayList, int i10) {
        super.onUserVoiceVolume(arrayList, i10);
        HashMap map = new HashMap();
        map.put("userVolumes", arrayList);
        map.put("totalVolume", Integer.valueOf(i10));
        invokeListener(CallBackNoticeEnum.onUserVoiceVolume, map);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onWarning(int i10, String str, Bundle bundle) {
        super.onWarning(i10, str, bundle);
        HashMap map = new HashMap();
        map.put("warningCode", Integer.valueOf(i10));
        map.put("warningMsg", str);
        invokeListener(CallBackNoticeEnum.onWarning, map);
    }

    public void release() {
        this.channel = null;
    }
}
