package com.ss.bytertc.engine;

import android.content.Context;
import android.content.Intent;
import android.view.Surface;
import android.view.View;
import com.bytedance.realx.video.EglBase;
import com.ss.bytertc.engine.data.EchoTestConfig;
import com.ss.bytertc.engine.handler.RTCASREngineEventHandler;
import com.ss.bytertc.engine.handler.RTCAudioDeviceEventHandler;
import com.ss.bytertc.engine.handler.RTCEncryptHandler;
import com.ss.bytertc.engine.handler.RTCEngineInternalP2PEventHandler;
import com.ss.bytertc.engine.handler.RTCExternalVideoEncoderEventHandler;
import com.ss.bytertc.engine.handler.RTCFaceDetectionObserver;
import com.ss.bytertc.engine.handler.RTCLocalEncodedVideoFrameObserver;
import com.ss.bytertc.engine.handler.RTCRemoteEncodedVideoFrameObserver;
import com.ss.bytertc.engine.handler.RTCVideoEventHandler;
import com.ss.bytertc.engine.handler.RTCVideoFrameObserver;
import com.ss.bytertc.engine.handler.RTCVideoProcessor;
import com.ss.bytertc.engine.live.ChorusCacheSyncConfig;
import com.ss.bytertc.engine.live.ChorusCacheSyncObserver;
import com.ss.bytertc.engine.live.LiveTranscoding;
import com.ss.bytertc.engine.live.LiveTranscodingObserver;
import com.ss.bytertc.engine.live.MixedStreamConfig;
import com.ss.bytertc.engine.live.PushMixedStreamToCDNObserver;
import com.ss.bytertc.engine.live.PushSingleStreamToCDNObserver;
import com.ss.bytertc.engine.type.ProblemFeedbackInfo;
import com.ss.bytertc.engine.video.ISnapshotResultCallback;
import com.ss.bytertc.engine.video.IVideoSink;
import com.ss.bytertc.engine.video.VideoFrame;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class NativeRTCVideoFunctions {
    public static native int nativeAppendVideoEffectNodes(long j10, String[] strArr);

    public static native int nativeApplyStickerEffect(long j10, String str);

    public static native int nativeCheckVideoEffectLicense(Context context, long j10, String str);

    public static native int nativeClearVideoWatermark(long j10, int i10);

    public static native long nativeCreateAudioDeviceManager(RTCAudioDeviceEventHandler rTCAudioDeviceEventHandler);

    public static native long nativeCreateRTCVideo(Context context, String str, RTCVideoEventHandler rTCVideoEventHandler, String str2, EglBase.Context context2);

    public static native long nativeCreateRTCVideoMulti(Context context, String str, RTCVideoEventHandler rTCVideoEventHandler, String str2, EglBase.Context context2);

    public static native long nativeCreateRoom(long j10, String str);

    public static native long nativeCreateRoomEx(long j10, String str);

    public static native void nativeDestroyRTCVideo(long j10);

    public static native void nativeDestroyRTCVideoMulti(long j10);

    public static native int nativeDisableAlphaChannelVideoEncode(long j10, int i10);

    public static native int nativeDisableAudioFrameCallback(long j10, int i10);

    public static native int nativeDisableAudioProcessor(long j10, int i10);

    public static native int nativeDisableFaceDetection(long j10);

    public static native int nativeDisableVideoEffect(long j10);

    public static native int nativeDisableVirtualBackground(long j10);

    public static native int nativeEenableRescaleAudioVolume(long j10, boolean z10);

    public static native int nativeEnableAlphaChannelVideoEncode(long j10, int i10, int i11);

    public static native int nativeEnableAudioFrameCallback(long j10, int i10, int i11, int i12);

    public static native int nativeEnableAudioProcessor(long j10, int i10, int i11, int i12, int i13);

    public static native int nativeEnableAudioPropertiesReport(long j10, int i10, boolean z10, boolean z11, int i11, float f10, int i12, boolean z12, boolean z13);

    public static native int nativeEnableAutoSubscribe(long j10, int i10, int i11);

    public static native int nativeEnableCameraAutoExposureFaceMode(long j10, boolean z10);

    public static native int nativeEnableCameraTorch(long j10, boolean z10);

    public static native int nativeEnableEffectBeauty(long j10, boolean z10);

    public static native int nativeEnableExternalSoundCard(long j10, boolean z10);

    public static native int nativeEnableFaceDetection(long j10, RTCFaceDetectionObserver rTCFaceDetectionObserver, int i10, String str);

    public static native int nativeEnableLocalVoiceReverb(long j10, boolean z10);

    public static native int nativeEnableP2PAbility(long j10, String str, boolean z10);

    public static native int nativeEnablePlaybackDucking(long j10, boolean z10);

    public static native int nativeEnableSimulcastMode(long j10, boolean z10);

    public static native int nativeEnableVideoEffect(long j10, boolean z10);

    public static native int nativeEnableVideoEffect2(long j10);

    public static native int nativeEnableVirtualBackground(long j10, String str, int i10, int i11, String str2);

    public static native int nativeEnableVocalInstrumentBalance(long j10, boolean z10);

    public static native long nativeGetAmazingEffectInterface(long j10);

    public static native long nativeGetAudioDeviceManager(long j10);

    public static native long nativeGetAudioEffectPlayer(long j10);

    public static native long nativeGetAudioMixingManager(long j10);

    public static native int nativeGetAudioRoute(long j10);

    public static native float nativeGetCameraZoomMaxRatio(long j10);

    public static native int nativeGetDownlinkNetworkBandwidthEstimationStatus(long j10);

    public static native String nativeGetErrorDescription(int i10);

    public static native long nativeGetKTVManager(long j10);

    public static native long nativeGetMediaPlayer(long j10, int i10);

    public static native NetworkTimeInfo nativeGetNetworkTimeInfo(long j10);

    public static native int nativeGetPeerOnlineStatus(long j10, String str);

    public static native String nativeGetSDKVersion();

    public static native long nativeGetSingScoringManager(long j10);

    public static native int nativeGetUplinkNetworkBandwidthEstimationStatus(long j10);

    public static native long nativeGetVideoDeviceManager(long j10);

    public static native long nativeGetVideoEffectHandle(long j10);

    public static native int nativeInitCVResource(long j10, String str, String str2);

    public static native int nativeInvokeExperimentalAPI(long j10, String str);

    public static native boolean nativeIsCameraExposurePositionSupported(long j10);

    public static native boolean nativeIsCameraFocusPositionSupported(long j10);

    public static native boolean nativeIsCameraZoomSupported(long j10);

    public static native boolean nativeIsStreamUnpublished(long j10, int i10);

    public static native boolean nativeIsSupportFlashLight(long j10);

    public static native int nativeLogin(long j10, String str, String str2);

    public static native int nativeLogout(long j10);

    public static native int nativeMuteAudioCapture(long j10, int i10, boolean z10);

    public static native int nativeMuteAudioPlayback(long j10, int i10);

    public static native int nativePullExternalAudioFrame(long j10, byte[] bArr, int i10, int i11, int i12);

    public static native int nativePushExternalAudioFrame(long j10, byte[] bArr, int i10, int i11, int i12);

    public static native int nativePushExternalByteRtcVideoFrame(long j10, VideoFrame videoFrame);

    public static native int nativePushExternalEncodedVideoFrame(long j10, int i10, int i11, ByteBuffer byteBuffer, long j11, long j12, int i12, int i13, int i14, int i15, int i16);

    public static native int nativePushExternalWebrtcVideoFrame(long j10, com.bytedance.realx.video.VideoFrame videoFrame, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, long j11);

    public static native int nativePushScreenAudioFrame(long j10, byte[] bArr, int i10, int i11, int i12);

    public static native int nativePushScreenByteRtcFrame(long j10, VideoFrame videoFrame);

    public static native int nativePushScreenFrame(long j10, com.bytedance.realx.video.VideoFrame videoFrame);

    public static native int nativeRegisterFaceDetectionObserver(long j10, RTCFaceDetectionObserver rTCFaceDetectionObserver, int i10);

    public static native int nativeRegisterInternalP2PEventObserver(long j10, RTCEngineInternalP2PEventHandler rTCEngineInternalP2PEventHandler);

    public static native int nativeRegisterLocalEncodedVideoFrameObserver(long j10, RTCLocalEncodedVideoFrameObserver rTCLocalEncodedVideoFrameObserver);

    public static native int nativeRegisterLocalVideoProcessor(long j10, RTCVideoProcessor rTCVideoProcessor, int i10);

    public static native int nativeRegisterRemoteEncodedVideoFrameObserver(long j10, RTCRemoteEncodedVideoFrameObserver rTCRemoteEncodedVideoFrameObserver);

    public static native int nativeRegisterVideoFrameObserver(long j10, RTCVideoFrameObserver rTCVideoFrameObserver);

    public static native int nativeRemoveVideoEffectNodes(long j10, String[] strArr);

    public static native int nativeReportFeedback(long j10, long j11, ProblemFeedbackInfo problemFeedbackInfo);

    public static native int nativeRequestRemoteVideoKeyFrame(long j10, String str, String str2, int i10);

    public static native void nativeResetScreenVideoConfigs(long j10);

    public static native int nativeSendMultiSEIMessagePerVideoFrame(long j10, int i10, byte[] bArr, int i11, int i12);

    public static native int nativeSendPublicStreamSEIMessage(long j10, int i10, int i11, byte[] bArr, int i12, int i13);

    public static native int nativeSendSEIMessage(long j10, int i10, byte[] bArr, int i11);

    public static native long nativeSendServerBinaryMessage(long j10, byte[] bArr);

    public static native long nativeSendServerMessage(long j10, String str);

    public static native int nativeSendStreamSyncInfo(long j10, byte[] bArr, int i10, int i11, int i12);

    public static native long nativeSendUserBinaryMessageOutsideRoom(long j10, String str, byte[] bArr, int i10);

    public static native long nativeSendUserMessageOutsideRoom(long j10, String str, String str2, int i10);

    public static native int nativeSetAnsMode(long j10, int i10);

    public static native void nativeSetAppState(long j10, String str);

    public static native int nativeSetAudioAlignmentProperty(long j10, String str, String str2, int i10, int i11);

    public static native int nativeSetAudioFrameObserver(long j10, IAudioFrameObserver iAudioFrameObserver);

    public static native int nativeSetAudioFrameProcessor(long j10, IAudioFrameProcessor iAudioFrameProcessor);

    public static native int nativeSetAudioPlaybackDevice(long j10, int i10);

    public static native int nativeSetAudioProfile(long j10, int i10);

    public static native int nativeSetAudioRenderType(long j10, int i10);

    public static native int nativeSetAudioRoute(long j10, int i10);

    public static native int nativeSetAudioScenario(long j10, int i10);

    public static native int nativeSetAudioScene(long j10, int i10);

    public static native int nativeSetAudioSourceType(long j10, int i10);

    public static native int nativeSetBackgroundSticker(long j10, String str, int i10, int i11, String str2);

    public static native int nativeSetBeautyIntensity(long j10, int i10, float f10);

    public static native int nativeSetBusinessId(long j10, String str);

    public static native int nativeSetCameraAdaptiveMinimumFrameRate(long j10, int i10);

    public static native int nativeSetCameraExposureCompensation(long j10, float f10);

    public static native int nativeSetCameraExposurePosition(long j10, float f10, float f11);

    public static native int nativeSetCameraFocusPosition(long j10, float f10, float f11);

    public static native int nativeSetCameraZoomRatio(long j10, float f10);

    public static native int nativeSetCaptureVolume(long j10, int i10, int i11);

    public static native int nativeSetCellularEnhancement(long j10, InternalMediaTypeEnhancementConfig internalMediaTypeEnhancementConfig);

    public static native int nativeSetCustomizeEncryptHandler(long j10, RTCEncryptHandler rTCEncryptHandler);

    public static native int nativeSetDefaultAudioRoute(long j10, int i10);

    public static native int nativeSetDeviceId(String str);

    public static native int nativeSetDummyCaptureImagePath(long j10, String str);

    public static native int nativeSetEarMonitorMode(long j10, int i10);

    public static native int nativeSetEarMonitorVolume(long j10, int i10);

    public static native void nativeSetEnableSpeakerphoneForTest(long j10, boolean z10);

    public static native int nativeSetEncryptInfo(long j10, int i10, String str);

    public static native int nativeSetEnv(int i10);

    public static native void nativeSetExternalSurface(long j10, String str, String str2, int i10, Surface surface);

    public static native int nativeSetExternalVideoEncoderEventHandler(long j10, RTCExternalVideoEncoderEventHandler rTCExternalVideoEncoderEventHandler);

    public static native int nativeSetLocalProxy(long j10, List<InternalLocalProxyConfiguration> list);

    public static native int nativeSetLocalVideoCanvas(long j10, int i10, View view, Surface surface, int i11, int i12);

    public static native int nativeSetLocalVideoMirrorType(long j10, int i10);

    public static native int nativeSetLocalVideoRender(long j10, int i10, IVideoSink iVideoSink, int i11, int i12);

    public static native int nativeSetLocalVideoSink(long j10, int i10, IVideoSink iVideoSink, int i11);

    public static native int nativeSetLocalVoiceEqualization(long j10, int i10, int i11);

    public static native int nativeSetLocalVoicePitch(long j10, int i10);

    public static native int nativeSetLocalVoiceReverbParam(long j10, float f10, float f11, float f12, float f13, float f14, float f15);

    public static native int nativeSetLogConfig(int i10, String str, int i11, String str2);

    public static native void nativeSetNetworkRequestIntercept(int i10);

    public static native int nativeSetParameters(String str);

    public static native int nativeSetPlaybackVolume(long j10, int i10);

    public static native int nativeSetPublicStreamAudioPlaybackVolume(long j10, String str, int i10);

    public static native int nativeSetPublicStreamVideoCanvas(long j10, String str, View view, int i10);

    public static native int nativeSetPublicStreamVideoSink(long j10, String str, IVideoSink iVideoSink, int i10);

    public static native int nativeSetPublishChannel(long j10, String str);

    public static native int nativeSetPublishFallbackOption(long j10, int i10);

    public static native int nativeSetPublishSpecialStream(long j10, int i10);

    public static native int nativeSetRemoteAudioPlaybackVolume(long j10, String str, String str2, int i10);

    public static native int nativeSetRemoteSubscribeFallbackOption(long j10, int i10);

    public static native int nativeSetRemoteUserPriority(long j10, String str, String str2, int i10);

    public static native int nativeSetRemoteVideoCanvas(long j10, String str, String str2, int i10, View view, Surface surface, int i11, int i12, int i13);

    public static native int nativeSetRemoteVideoMirrorType(long j10, String str, String str2, int i10, int i11);

    public static native int nativeSetRemoteVideoRender(long j10, String str, String str2, int i10, IVideoSink iVideoSink, int i11, int i12, int i13, int i14);

    public static native int nativeSetRemoteVideoSink(long j10, String str, String str2, int i10, IVideoSink iVideoSink, int i11);

    public static native int nativeSetRemoteVideoSuperResolution(long j10, String str, String str2, int i10, int i11);

    public static native int nativeSetRuntimeParameters(long j10, String str);

    public static native int nativeSetScreenAudioSourceType(long j10, int i10);

    public static native int nativeSetScreenAudioStreamIndex(long j10, int i10);

    public static native void nativeSetScreenVideoConfigs(long j10);

    public static native int nativeSetScreenVideoEncoderConfig(long j10, InternalScreenVideoEncoderConfig internalScreenVideoEncoderConfig);

    public static native int nativeSetServerParams(long j10, String str, String str2);

    public static native void nativeSetSubscribeBaselineData(long j10, String str, boolean z10, SubscribeVideoBaseline subscribeVideoBaseline);

    public static native int nativeSetSubscribeChannels(long j10, String[] strArr, boolean z10);

    public static native int nativeSetSubscribeSpecialStream(long j10, int[] iArr);

    public static native int nativeSetVideoCaptureConfig(long j10, InternalVideoCaptureConfig internalVideoCaptureConfig);

    public static native int nativeSetVideoCaptureRotation(long j10, int i10);

    public static native int nativeSetVideoDecoderConfig(long j10, String str, String str2, int i10, int i11);

    public static native int nativeSetVideoDenoiser(long j10, int i10);

    public static native int nativeSetVideoDigitalZoomConfig(long j10, int i10, float f10);

    public static native int nativeSetVideoDigitalZoomControl(long j10, int i10);

    public static native int nativeSetVideoEffectAlgoModelPath(long j10, String str);

    public static native int nativeSetVideoEffectAlgoModelResourceFinder(long j10, long j11, long j12);

    public static native int nativeSetVideoEffectColorFilter(long j10, String str);

    public static native int nativeSetVideoEffectColorFilterIntensity(long j10, float f10);

    public static native int nativeSetVideoEffectExpressionDetect(long j10, InternalExpressDetectConfig internalExpressDetectConfig);

    public static native int nativeSetVideoEffectNodes(long j10, String[] strArr);

    public static native int nativeSetVideoEncoderConfig(long j10, int i10, List<InternalVideoStreamDescription> list);

    public static native int nativeSetVideoEncoderConfigV2(long j10, List<InternalVideoEncoderConfig> list);

    public static native int nativeSetVideoEncoderConfigV3(long j10, InternalVideoEncoderConfig internalVideoEncoderConfig, String str);

    public static native int nativeSetVideoEncoderConfigWithMain(long j10, List<InternalVideoEncoderConfig> list, List<InternalVideoEncoderConfig> list2);

    public static native int nativeSetVideoOrientation(long j10, int i10);

    public static native int nativeSetVideoRotationMode(long j10, int i10);

    public static native int nativeSetVideoSourceTypeWithStreamId(long j10, int i10, int i11);

    public static native int nativeSetVideoWatermark(long j10, int i10, String str, boolean z10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17);

    public static native int nativeSetVoiceChangerType(long j10, int i10);

    public static native int nativeSetVoiceReverbType(long j10, int i10);

    public static native int nativeSetupLocalScreenSink(long j10, IVideoSink iVideoSink, String str);

    public static native int nativeSetupLocalVideoSink(long j10, IVideoSink iVideoSink, String str);

    public static native int nativeStartASR(long j10, RTCASREngineEventHandler rTCASREngineEventHandler, String str, String str2, String str3, String str4, int i10, String str5);

    public static native int nativeStartAudioCapture(long j10);

    public static native int nativeStartAudioCaptureDeviceTestEx(long j10, int i10);

    public static native int nativeStartAudioPlaybackDeviceTestEx(long j10, String str, int i10);

    public static native int nativeStartAudioRecording(long j10, String str, int i10, int i11, int i12, int i13);

    public static native int nativeStartChorusCacheSync(long j10, ChorusCacheSyncConfig chorusCacheSyncConfig, ChorusCacheSyncObserver chorusCacheSyncObserver);

    public static native int nativeStartCloudProxy(long j10, List<InternalCloudProxyInfo> list);

    public static native int nativeStartEchoTest(long j10, EchoTestConfig echoTestConfig, int i10);

    public static native int nativeStartFileRecording(long j10, int i10, String str, int i11, int i12);

    public static native int nativeStartHardwareEchoDetection(long j10, String str);

    public static native int nativeStartLiveTranscoding(long j10, String str, LiveTranscoding liveTranscoding, LiveTranscodingObserver liveTranscodingObserver);

    public static native int nativeStartNetworkProbe(long j10, boolean z10, int i10, boolean z11, int i11);

    public static native int nativeStartPlayPublicStream(long j10, String str);

    public static native int nativeStartPushMixedStreamToCDN(long j10, String str, MixedStreamConfig mixedStreamConfig, PushMixedStreamToCDNObserver pushMixedStreamToCDNObserver);

    public static native int nativeStartPushPublicStream(long j10, String str, String str2);

    public static native int nativeStartPushSingleStreamToCDN(long j10, String str, String str2, String str3, String str4, boolean z10, PushSingleStreamToCDNObserver pushSingleStreamToCDNObserver);

    public static native int nativeStartScreenAudioCapture(long j10);

    public static native int nativeStartScreenCapture(long j10, int i10, Intent intent);

    public static native int nativeStartVideoCapture(long j10);

    public static native int nativeStartVideoDigitalZoomControl(long j10, int i10);

    public static native int nativeStopASR(long j10);

    public static native int nativeStopAudioCapture(long j10);

    public static native int nativeStopAudioCaptureDeviceTestEx(long j10);

    public static native int nativeStopAudioPlaybackDeviceTestEx(long j10);

    public static native int nativeStopAudioRecording(long j10);

    public static native int nativeStopChorusCacheSync(long j10);

    public static native int nativeStopCloudProxy(long j10);

    public static native int nativeStopEchoTest(long j10);

    public static native int nativeStopFileRecording(long j10, int i10);

    public static native int nativeStopHardwareEchoDetection(long j10);

    public static native int nativeStopLiveTranscoding(long j10, String str);

    public static native int nativeStopNetworkProbe(long j10);

    public static native int nativeStopPlayPublicStream(long j10, String str);

    public static native int nativeStopPushPublicStream(long j10, String str);

    public static native int nativeStopPushStreamToCDN(long j10, String str);

    public static native int nativeStopScreenAudioCapture(long j10);

    public static native int nativeStopScreenCapture(long j10);

    public static native int nativeStopScreenVideoCapture(long j10);

    public static native int nativeStopVideoCapture(long j10);

    public static native int nativeStopVideoDigitalZoomControl(long j10);

    public static native int nativeSwitchCamera(long j10, int i10);

    public static native long nativeTakeLocalSnapshot(long j10, int i10, ISnapshotResultCallback iSnapshotResultCallback);

    public static native long nativeTakeRemoteSnapshot(long j10, String str, String str2, int i10, ISnapshotResultCallback iSnapshotResultCallback);

    public static native int nativeUpdateLiveTranscoding(long j10, String str, LiveTranscoding liveTranscoding);

    public static native int nativeUpdateLocalVideoCanvas(long j10, int i10, int i11, int i12);

    public static native int nativeUpdateLoginToken(long j10, String str);

    public static native int nativeUpdatePublicStreamParam(long j10, String str, String str2);

    public static native int nativeUpdatePushMixedStreamToCDN(long j10, String str, MixedStreamConfig mixedStreamConfig);

    public static native int nativeUpdateRemoteVideoCanvas(long j10, String str, String str2, int i10, int i11, int i12, int i13);

    public static native int nativeUpdateScreenCapture(long j10, int i10);

    public static native int nativeUpdateVideoEffectNode(long j10, String str, String str2, float f10);

    public static native void nativeWriteLog(String str, int i10, String str2, String str3, String str4);
}
