package com.ss.bytertc.engine;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.realx.video.a;
import com.ss.bytertc.engine.audio.IAudioEffectPlayer;
import com.ss.bytertc.engine.audio.IAudioMixingManager;
import com.ss.bytertc.engine.audio.IMediaPlayer;
import com.ss.bytertc.engine.audio.ISingScoringManager;
import com.ss.bytertc.engine.data.AlphaLayout;
import com.ss.bytertc.engine.data.AudioAlignmentMode;
import com.ss.bytertc.engine.data.AudioFormat;
import com.ss.bytertc.engine.data.AudioFrameCallbackMethod;
import com.ss.bytertc.engine.data.AudioPlaybackDevice;
import com.ss.bytertc.engine.data.AudioProcessorMethod;
import com.ss.bytertc.engine.data.AudioPropertiesConfig;
import com.ss.bytertc.engine.data.AudioRecordingConfig;
import com.ss.bytertc.engine.data.AudioRenderType;
import com.ss.bytertc.engine.data.AudioRoute;
import com.ss.bytertc.engine.data.AudioSourceType;
import com.ss.bytertc.engine.data.CameraId;
import com.ss.bytertc.engine.data.CloudProxyInfo;
import com.ss.bytertc.engine.data.EarMonitorMode;
import com.ss.bytertc.engine.data.EchoTestConfig;
import com.ss.bytertc.engine.data.EffectBeautyMode;
import com.ss.bytertc.engine.data.EngineConfig;
import com.ss.bytertc.engine.data.MirrorType;
import com.ss.bytertc.engine.data.MuteState;
import com.ss.bytertc.engine.data.RTCASRConfig;
import com.ss.bytertc.engine.data.RTCLogConfig;
import com.ss.bytertc.engine.data.RecordingConfig;
import com.ss.bytertc.engine.data.RemoteMirrorType;
import com.ss.bytertc.engine.data.RemoteStreamKey;
import com.ss.bytertc.engine.data.SEICountPerFrame;
import com.ss.bytertc.engine.data.ScreenMediaType;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.StreamSycnInfoConfig;
import com.ss.bytertc.engine.data.VideoDenoiseMode;
import com.ss.bytertc.engine.data.VideoOrientation;
import com.ss.bytertc.engine.data.VideoRotation;
import com.ss.bytertc.engine.data.VideoRotationMode;
import com.ss.bytertc.engine.data.VideoSourceType;
import com.ss.bytertc.engine.data.VideoSuperResolutionMode;
import com.ss.bytertc.engine.data.VirtualBackgroundSource;
import com.ss.bytertc.engine.data.ZoomConfigType;
import com.ss.bytertc.engine.data.ZoomDirectionType;
import com.ss.bytertc.engine.engineimpl.RTCVideoImpl;
import com.ss.bytertc.engine.handler.IExternalVideoEncoderEventHandler;
import com.ss.bytertc.engine.handler.IRTCASREngineEventHandler;
import com.ss.bytertc.engine.handler.IRTCVideoEventHandler;
import com.ss.bytertc.engine.handler.RTCEncryptHandler;
import com.ss.bytertc.engine.live.ChorusCacheSyncConfig;
import com.ss.bytertc.engine.live.IChorusCacheSyncObserver;
import com.ss.bytertc.engine.live.ILiveTranscodingObserver;
import com.ss.bytertc.engine.live.IMixedStreamObserver;
import com.ss.bytertc.engine.live.IPushSingleStreamToCDNObserver;
import com.ss.bytertc.engine.live.LiveTranscoding;
import com.ss.bytertc.engine.live.MixedStreamConfig;
import com.ss.bytertc.engine.live.PushSingleStreamParam;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoader;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderImpl;
import com.ss.bytertc.engine.mediaio.ILocalEncodedVideoFrameObserver;
import com.ss.bytertc.engine.mediaio.IRemoteEncodedVideoFrameObserver;
import com.ss.bytertc.engine.mediaio.RTCEncodedVideoFrame;
import com.ss.bytertc.engine.publicstream.PublicStreaming;
import com.ss.bytertc.engine.type.AnsMode;
import com.ss.bytertc.engine.type.AudioProfileType;
import com.ss.bytertc.engine.type.AudioScenarioType;
import com.ss.bytertc.engine.type.AudioSceneType;
import com.ss.bytertc.engine.type.BackgroundMode;
import com.ss.bytertc.engine.type.DivideModel;
import com.ss.bytertc.engine.type.LocalProxyConfiguration;
import com.ss.bytertc.engine.type.MediaTypeEnhancementConfig;
import com.ss.bytertc.engine.type.MessageConfig;
import com.ss.bytertc.engine.type.ProblemFeedbackInfo;
import com.ss.bytertc.engine.type.ProblemFeedbackOption;
import com.ss.bytertc.engine.type.PublishFallbackOption;
import com.ss.bytertc.engine.type.RecordingType;
import com.ss.bytertc.engine.type.RemoteUserPriority;
import com.ss.bytertc.engine.type.RtcErrorCodeDescription;
import com.ss.bytertc.engine.type.SubscribeFallbackOptions;
import com.ss.bytertc.engine.type.TorchState;
import com.ss.bytertc.engine.type.VoiceChangerType;
import com.ss.bytertc.engine.type.VoiceEqualizationConfig;
import com.ss.bytertc.engine.type.VoiceReverbConfig;
import com.ss.bytertc.engine.type.VoiceReverbType;
import com.ss.bytertc.engine.utils.AudioFrame;
import com.ss.bytertc.engine.utils.EngineConfigCheck;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.engine.utils.RTCEglContextChecker;
import com.ss.bytertc.engine.video.IFaceDetectionObserver;
import com.ss.bytertc.engine.video.ISnapshotResultCallback;
import com.ss.bytertc.engine.video.IVideoDeviceManager;
import com.ss.bytertc.engine.video.IVideoEffect;
import com.ss.bytertc.engine.video.IVideoProcessor;
import com.ss.bytertc.engine.video.IVideoSink;
import com.ss.bytertc.engine.video.LocalVideoSinkConfig;
import com.ss.bytertc.engine.video.RTCWatermarkConfig;
import com.ss.bytertc.engine.video.RemoteVideoSinkConfig;
import com.ss.bytertc.engine.video.VideoDecoderConfig;
import com.ss.bytertc.engine.video.VideoEffectExpressionConfig;
import com.ss.bytertc.engine.video.VideoEncoderConfiguration;
import com.ss.bytertc.engine.video.VideoFrame;
import com.ss.bytertc.engine.video.VideoPreprocessorConfig;
import com.ss.bytertc.ktv.IKTVManager;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RTCVideo {
    private static final String TAG = "RtcVideo";
    protected static RTCVideoImpl mInstance;
    protected static RTCVideoImpl mInstanceEx;
    protected static RTCEglContextChecker mRtcEglContextChecker;
    protected static RTCNativeLibraryLoader mRtcNativeLibraryLoader = new RTCNativeLibraryLoaderImpl();

    public static synchronized IRTCAudioDeviceManagerEx createAudioDeviceManager(IRTCAudioDeviceManagerEx.IRTCAudioDeviceEventHandler iRTCAudioDeviceEventHandler) {
        return !RTCVideoImpl.initializeNativeLibs() ? null : RTCVideoImpl.createAudioDeviceManager(iRTCAudioDeviceEventHandler);
    }

    public static synchronized RTCVideo createRTCVideo(Context context, IRTCVideoEventHandler iRTCVideoEventHandler, EngineConfig engineConfig) {
        if (EngineConfigCheck.checkValid(engineConfig) != 0) {
            LogUtil.e(TAG, "createRTCVideo: engine config is invalid, error code is " + EngineConfigCheck.checkValid(engineConfig));
            return null;
        }
        if (!RTCVideoImpl.initializeNativeLibs(engineConfig.nativeLoadPath)) {
            LogUtil.e(TAG, "createRTCVideo: fail to load native library");
            return null;
        }
        try {
            engineConfig.parameters.put("rtc.native_load_path", engineConfig.nativeLoadPath);
        } catch (JSONException e10) {
            LogUtil.e(TAG, "createRTCVideo: addParameter fail: " + e10.getMessage());
        }
        RTCVideoImpl rTCVideoImpl = mInstance;
        if (rTCVideoImpl != null) {
            return rTCVideoImpl;
        }
        try {
            RTCVideoImpl rTCVideoImpl2 = new RTCVideoImpl(context, engineConfig.appID, iRTCVideoEventHandler, engineConfig.eglContext, engineConfig.parameters);
            mInstance = rTCVideoImpl2;
            return rTCVideoImpl2;
        } catch (IllegalStateException e11) {
            LogUtil.e(TAG, "createRTCVideo: throw exception " + e11.getMessage());
            return null;
        }
    }

    public static synchronized RTCVideo createRTCVideo(Context context, String str, IRTCVideoEventHandler iRTCVideoEventHandler, Object obj, JSONObject jSONObject) {
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (!RTCVideoImpl.initializeNativeLibs()) {
                    LogUtil.e(TAG, " createRTCVideo: fail to load native library");
                    return null;
                }
                RTCVideoImpl rTCVideoImpl = mInstance;
                if (rTCVideoImpl != null || mInstanceEx != null) {
                    return rTCVideoImpl;
                }
                try {
                    RTCVideoImpl rTCVideoImpl2 = new RTCVideoImpl(context, str, iRTCVideoEventHandler, null, obj, jSONObject, false, false);
                    mInstance = rTCVideoImpl2;
                    return rTCVideoImpl2;
                } catch (IllegalStateException e10) {
                    LogUtil.e(TAG, "createRTCVideo: throw exception " + e10.getMessage());
                    return null;
                }
            }
        }
        LogUtil.e(TAG, "createRTCVideo: context or app id is empty");
        return null;
    }

    public static synchronized RTCVideo createRTCVideoMulti(Context context, String str, IRTCVideoEventHandler iRTCVideoEventHandler, Object obj, JSONObject jSONObject) {
        if (context != null && str != null) {
            if (RTCVideoImpl.initializeNativeLibs()) {
                try {
                    return new RTCVideoImpl(context, str, iRTCVideoEventHandler, null, obj, jSONObject, false, true);
                } catch (IllegalStateException unused) {
                    return null;
                }
            }
        }
        return null;
    }

    public static synchronized void destroyRTCVideo() {
        RTCVideoImpl rTCVideoImpl = mInstance;
        if (rTCVideoImpl != null) {
            rTCVideoImpl.doDestroy(false);
            mInstance = null;
            mRtcNativeLibraryLoader = null;
            mRtcEglContextChecker = null;
            System.gc();
        }
    }

    public static synchronized void destroyRTCVideoMulti(RTCVideo rTCVideo) {
        if (rTCVideo != null) {
            if (rTCVideo == mInstance) {
                destroyRTCVideo();
            } else {
                ((RTCVideoImpl) rTCVideo).doDestroy(true);
                System.gc();
            }
        }
    }

    public static String getErrorDescription(int i10) {
        return !RTCVideoImpl.initializeNativeLibs() ? RtcErrorCodeDescription.BRERR_LOAD_SO_LIB_DESCRIPTION : RTCVideoImpl.getErrorDescription(i10);
    }

    public static String getSDKVersion() {
        return !RTCVideoImpl.initializeNativeLibs() ? "" : RTCVideoImpl.getSdkVersion();
    }

    @Deprecated
    public static int setDeviceId(String str) {
        if (RTCVideoImpl.initializeNativeLibs()) {
            return RTCVideoImpl.setDeviceId(str);
        }
        return -1;
    }

    public static int setLogConfig(RTCLogConfig rTCLogConfig) {
        if (RTCVideoImpl.initializeNativeLibs()) {
            return RTCVideoImpl.setLogConfig(rTCLogConfig);
        }
        return -1;
    }

    public static void setRtcEglContextChecker(RTCEglContextChecker rTCEglContextChecker) {
        if (rTCEglContextChecker != null) {
            mRtcEglContextChecker = rTCEglContextChecker;
            a.j(rTCEglContextChecker);
        }
    }

    public static void setRtcNativeLibraryLoader(RTCNativeLibraryLoader rTCNativeLibraryLoader) {
        LogUtil.i(TAG, "set rtc native library loader" + rTCNativeLibraryLoader);
        mRtcNativeLibraryLoader = rTCNativeLibraryLoader;
    }

    @Deprecated
    public abstract int appendVideoEffectNodes(List<String> list);

    @Deprecated
    public abstract int checkVideoEffectLicense(Context context, String str);

    public abstract int clearVideoWatermark(StreamIndex streamIndex);

    public abstract RTCRoom createRTCRoom(String str);

    public abstract int disableAlphaChannelVideoEncode(StreamIndex streamIndex);

    public abstract int disableAudioFrameCallback(AudioFrameCallbackMethod audioFrameCallbackMethod);

    public abstract int disableAudioProcessor(AudioProcessorMethod audioProcessorMethod);

    public abstract int enableAlphaChannelVideoEncode(StreamIndex streamIndex, AlphaLayout alphaLayout);

    public abstract int enableAudioFrameCallback(AudioFrameCallbackMethod audioFrameCallbackMethod, AudioFormat audioFormat);

    public abstract int enableAudioProcessor(AudioProcessorMethod audioProcessorMethod, AudioFormat audioFormat);

    public abstract int enableAudioPropertiesReport(AudioPropertiesConfig audioPropertiesConfig);

    public abstract int enableCameraAutoExposureFaceMode(boolean z10);

    public abstract int enableEffectBeauty(boolean z10);

    public abstract int enableExternalSoundCard(boolean z10);

    public abstract int enableLocalVoiceReverb(boolean z10);

    public abstract int enablePlaybackDucking(boolean z10);

    public abstract int enableSimulcastMode(boolean z10);

    @Deprecated
    public abstract int enableVideoEffect(boolean z10);

    public abstract int enableVocalInstrumentBalance(boolean z10);

    public abstract int feedback(List<ProblemFeedbackOption> list, ProblemFeedbackInfo problemFeedbackInfo);

    public abstract IRTCAudioDeviceManager getAudioDeviceManager();

    public abstract IAudioEffectPlayer getAudioEffectPlayer();

    @Deprecated
    public abstract IAudioMixingManager getAudioMixingManager();

    public abstract AudioRoute getAudioRoute();

    public abstract float getCameraZoomMaxRatio();

    public abstract IKTVManager getKTVManager();

    public abstract IMediaPlayer getMediaPlayer(int i10);

    public abstract long getNativeHandle();

    public abstract NetworkTimeInfo getNetworkTimeInfo();

    public abstract int getPeerOnlineStatus(String str);

    public abstract ISingScoringManager getSingScoringManager();

    public abstract IVideoDeviceManager getVideoDeviceManager();

    public abstract IVideoEffect getVideoEffectInterface();

    public abstract int invokeExperimentalAPI(String str);

    public abstract boolean isCameraExposurePositionSupported();

    public abstract boolean isCameraFocusPositionSupported();

    public abstract boolean isCameraTorchSupported();

    public abstract boolean isCameraZoomSupported();

    public abstract int login(String str, String str2);

    public abstract int logout();

    public abstract int muteAudioCapture(StreamIndex streamIndex, boolean z10);

    @Deprecated
    public abstract int muteAudioPlayback(MuteState muteState);

    public abstract int pullExternalAudioFrame(AudioFrame audioFrame);

    public abstract int pushExternalAudioFrame(AudioFrame audioFrame);

    public abstract int pushExternalEncodedVideoFrame(StreamIndex streamIndex, int i10, RTCEncodedVideoFrame rTCEncodedVideoFrame);

    public abstract int pushExternalVideoFrame(VideoFrame videoFrame);

    @Deprecated
    public abstract int pushExternalVideoFrame(VideoFrame videoFrame, boolean z10);

    public abstract int pushScreenAudioFrame(AudioFrame audioFrame);

    public abstract int pushScreenVideoFrame(VideoFrame videoFrame);

    public abstract int registerAudioFrameObserver(IAudioFrameObserver iAudioFrameObserver);

    public abstract int registerAudioProcessor(IAudioFrameProcessor iAudioFrameProcessor);

    @Deprecated
    public abstract int registerFaceDetectionObserver(IFaceDetectionObserver iFaceDetectionObserver, int i10);

    public abstract int registerLocalEncodedVideoFrameObserver(ILocalEncodedVideoFrameObserver iLocalEncodedVideoFrameObserver);

    public abstract int registerLocalVideoProcessor(IVideoProcessor iVideoProcessor, VideoPreprocessorConfig videoPreprocessorConfig);

    public abstract int registerRemoteEncodedVideoFrameObserver(IRemoteEncodedVideoFrameObserver iRemoteEncodedVideoFrameObserver);

    @Deprecated
    public abstract int removeVideoEffectNodes(List<String> list);

    @Deprecated
    public abstract int replaceBackground(BackgroundMode backgroundMode, DivideModel divideModel);

    public abstract int requestRemoteVideoKeyFrame(RemoteStreamKey remoteStreamKey);

    public abstract int sendPublicStreamSEIMessage(StreamIndex streamIndex, int i10, byte[] bArr, int i11, SEICountPerFrame sEICountPerFrame);

    @Deprecated
    public abstract int sendSEIMessage(StreamIndex streamIndex, byte[] bArr, int i10);

    public abstract int sendSEIMessage(StreamIndex streamIndex, byte[] bArr, int i10, SEICountPerFrame sEICountPerFrame);

    public abstract long sendServerBinaryMessage(byte[] bArr);

    public abstract long sendServerMessage(String str);

    public abstract int sendStreamSyncInfo(byte[] bArr, StreamSycnInfoConfig streamSycnInfoConfig);

    public abstract long sendUserBinaryMessageOutsideRoom(String str, byte[] bArr, MessageConfig messageConfig);

    public abstract long sendUserMessageOutsideRoom(String str, String str2, MessageConfig messageConfig);

    public abstract int setAnsMode(AnsMode ansMode);

    public abstract int setAudioAlignmentProperty(RemoteStreamKey remoteStreamKey, AudioAlignmentMode audioAlignmentMode);

    @Deprecated
    public abstract int setAudioPlaybackDevice(AudioPlaybackDevice audioPlaybackDevice);

    public abstract int setAudioProfile(AudioProfileType audioProfileType);

    public abstract int setAudioRenderType(AudioRenderType audioRenderType);

    public abstract int setAudioRoute(AudioRoute audioRoute);

    public abstract int setAudioScenario(AudioScenarioType audioScenarioType);

    public abstract int setAudioScene(AudioSceneType audioSceneType);

    public abstract int setAudioSourceType(AudioSourceType audioSourceType);

    @Deprecated
    public abstract int setBackgroundSticker(String str, VirtualBackgroundSource virtualBackgroundSource);

    public abstract int setBeautyIntensity(EffectBeautyMode effectBeautyMode, float f10);

    public abstract int setBusinessId(String str);

    public abstract int setCameraAdaptiveMinimumFrameRate(int i10);

    public abstract int setCameraExposureCompensation(float f10);

    public abstract int setCameraExposurePosition(float f10, float f11);

    public abstract int setCameraFocusPosition(float f10, float f11);

    public abstract int setCameraTorch(TorchState torchState);

    public abstract int setCameraZoomRatio(float f10);

    public abstract int setCaptureVolume(StreamIndex streamIndex, int i10);

    public abstract int setCellularEnhancement(MediaTypeEnhancementConfig mediaTypeEnhancementConfig);

    public abstract int setCustomizeEncryptHandler(RTCEncryptHandler rTCEncryptHandler);

    public abstract int setDefaultAudioRoute(AudioRoute audioRoute);

    public abstract int setDummyCaptureImagePath(String str);

    public abstract int setEarMonitorMode(EarMonitorMode earMonitorMode);

    public abstract int setEarMonitorVolume(int i10);

    public abstract int setEncryptInfo(int i10, String str);

    public abstract int setExternalVideoEncoderEventHandler(IExternalVideoEncoderEventHandler iExternalVideoEncoderEventHandler);

    public abstract int setLocalProxy(List<LocalProxyConfiguration> list);

    public abstract int setLocalVideoCanvas(StreamIndex streamIndex, VideoCanvas videoCanvas);

    public abstract int setLocalVideoMirrorType(MirrorType mirrorType);

    public abstract int setLocalVideoRender(StreamIndex streamIndex, IVideoSink iVideoSink, LocalVideoSinkConfig localVideoSinkConfig);

    public abstract int setLocalVideoSink(StreamIndex streamIndex, IVideoSink iVideoSink, int i10);

    public abstract int setLocalVoiceEqualization(VoiceEqualizationConfig voiceEqualizationConfig);

    public abstract int setLocalVoicePitch(int i10);

    public abstract int setLocalVoiceReverbParam(VoiceReverbConfig voiceReverbConfig);

    @Deprecated
    public abstract int setOnDestroyCompletedCallback(Runnable runnable);

    public abstract int setPlaybackVolume(int i10);

    public abstract int setPublicStreamAudioPlaybackVolume(String str, int i10);

    public abstract int setPublicStreamVideoCanvas(String str, VideoCanvas videoCanvas);

    public abstract int setPublicStreamVideoSink(String str, IVideoSink iVideoSink, int i10);

    public abstract int setPublishFallbackOption(PublishFallbackOption publishFallbackOption);

    public abstract int setRemoteAudioPlaybackVolume(String str, String str2, int i10);

    public abstract int setRemoteUserPriority(String str, String str2, RemoteUserPriority remoteUserPriority);

    public abstract int setRemoteVideoCanvas(RemoteStreamKey remoteStreamKey, VideoCanvas videoCanvas);

    public abstract int setRemoteVideoMirrorType(RemoteStreamKey remoteStreamKey, RemoteMirrorType remoteMirrorType);

    public abstract int setRemoteVideoRender(RemoteStreamKey remoteStreamKey, IVideoSink iVideoSink, RemoteVideoSinkConfig remoteVideoSinkConfig);

    public abstract int setRemoteVideoSink(RemoteStreamKey remoteStreamKey, IVideoSink iVideoSink, int i10);

    public abstract int setRemoteVideoSuperResolution(RemoteStreamKey remoteStreamKey, VideoSuperResolutionMode videoSuperResolutionMode);

    public abstract int setRtcVideoEventHandler(IRTCVideoEventHandler iRTCVideoEventHandler);

    public abstract int setRuntimeParameters(JSONObject jSONObject);

    public abstract int setScreenAudioSourceType(AudioSourceType audioSourceType);

    public abstract int setScreenAudioStreamIndex(StreamIndex streamIndex);

    public abstract int setScreenVideoEncoderConfig(ScreenVideoEncoderConfig screenVideoEncoderConfig);

    public abstract int setServerParams(String str, String str2);

    public abstract int setSubscribeFallbackOption(SubscribeFallbackOptions subscribeFallbackOptions);

    public abstract int setVideoCaptureConfig(com.ss.bytertc.engine.video.VideoCaptureConfig videoCaptureConfig);

    public abstract int setVideoCaptureRotation(VideoRotation videoRotation);

    public abstract int setVideoDecoderConfig(RemoteStreamKey remoteStreamKey, VideoDecoderConfig videoDecoderConfig);

    public abstract int setVideoDenoiser(VideoDenoiseMode videoDenoiseMode);

    public abstract int setVideoDigitalZoomConfig(ZoomConfigType zoomConfigType, float f10);

    public abstract int setVideoDigitalZoomControl(ZoomDirectionType zoomDirectionType);

    @Deprecated
    public abstract int setVideoEffectAlgoModelPath(String str);

    @Deprecated
    public abstract int setVideoEffectAlgoModelResourceFinder(long j10, long j11);

    @Deprecated
    public abstract int setVideoEffectColorFilter(String str);

    @Deprecated
    public abstract int setVideoEffectColorFilterIntensity(float f10);

    @Deprecated
    public abstract int setVideoEffectExpressionDetect(VideoEffectExpressionConfig videoEffectExpressionConfig);

    @Deprecated
    public abstract int setVideoEffectNodes(List<String> list);

    public abstract int setVideoEncoderConfig(VideoEncoderConfig videoEncoderConfig);

    public abstract int setVideoEncoderConfig(VideoEncoderConfig videoEncoderConfig, JSONObject jSONObject);

    @Deprecated
    public abstract int setVideoEncoderConfig(StreamIndex streamIndex, List<VideoStreamDescription> list);

    @Deprecated
    public abstract int setVideoEncoderConfig(List<VideoStreamDescription> list, VideoEncoderConfiguration.OrientationMode orientationMode);

    public abstract int setVideoEncoderConfig(VideoEncoderConfig[] videoEncoderConfigArr);

    public abstract int setVideoOrientation(VideoOrientation videoOrientation);

    public abstract int setVideoRotationMode(VideoRotationMode videoRotationMode);

    public abstract int setVideoSourceType(StreamIndex streamIndex, VideoSourceType videoSourceType);

    public abstract int setVideoWatermark(StreamIndex streamIndex, String str, RTCWatermarkConfig rTCWatermarkConfig);

    public abstract int setVoiceChangerType(VoiceChangerType voiceChangerType);

    public abstract int setVoiceReverbType(VoiceReverbType voiceReverbType);

    public abstract int startASR(RTCASRConfig rTCASRConfig, IRTCASREngineEventHandler iRTCASREngineEventHandler);

    public abstract int startAudioCapture();

    public abstract int startAudioRecording(AudioRecordingConfig audioRecordingConfig);

    public abstract int startChorusCacheSync(ChorusCacheSyncConfig chorusCacheSyncConfig, IChorusCacheSyncObserver iChorusCacheSyncObserver);

    public abstract int startCloudProxy(List<CloudProxyInfo> list);

    public abstract int startEchoTest(EchoTestConfig echoTestConfig, int i10);

    public abstract int startFileRecording(StreamIndex streamIndex, RecordingConfig recordingConfig, RecordingType recordingType);

    public abstract int startHardwareEchoDetection(String str);

    @Deprecated
    public abstract int startLiveTranscoding(String str, LiveTranscoding liveTranscoding, ILiveTranscodingObserver iLiveTranscodingObserver);

    public abstract int startNetworkDetection(boolean z10, int i10, boolean z11, int i11);

    public abstract int startPlayPublicStream(String str);

    public abstract int startPushMixedStreamToCDN(String str, MixedStreamConfig mixedStreamConfig, IMixedStreamObserver iMixedStreamObserver);

    public abstract int startPushPublicStream(String str, PublicStreaming publicStreaming);

    public abstract int startPushSingleStreamToCDN(String str, PushSingleStreamParam pushSingleStreamParam, IPushSingleStreamToCDNObserver iPushSingleStreamToCDNObserver);

    public abstract int startScreenCapture(ScreenMediaType screenMediaType, Intent intent);

    public abstract int startVideoCapture();

    public abstract int startVideoDigitalZoomControl(ZoomDirectionType zoomDirectionType);

    public abstract int stopASR();

    public abstract int stopAudioCapture();

    public abstract int stopAudioRecording();

    public abstract int stopChorusCacheSync();

    public abstract int stopCloudProxy();

    public abstract int stopEchoTest();

    public abstract int stopFileRecording(StreamIndex streamIndex);

    public abstract int stopHardwareEchoDetection();

    @Deprecated
    public abstract int stopLiveTranscoding(String str);

    public abstract int stopNetworkDetection();

    public abstract int stopPlayPublicStream(String str);

    public abstract int stopPushPublicStream(String str);

    public abstract int stopPushStreamToCDN(String str);

    public abstract int stopScreenCapture();

    public abstract int stopVideoCapture();

    public abstract int stopVideoDigitalZoomControl();

    public abstract int switchCamera(CameraId cameraId);

    public abstract long takeLocalSnapshot(StreamIndex streamIndex, ISnapshotResultCallback iSnapshotResultCallback);

    public abstract long takeRemoteSnapshot(RemoteStreamKey remoteStreamKey, ISnapshotResultCallback iSnapshotResultCallback);

    @Deprecated
    public abstract int updateLiveTranscoding(String str, LiveTranscoding liveTranscoding);

    public abstract int updateLocalVideoCanvas(StreamIndex streamIndex, int i10, int i11);

    public abstract int updateLoginToken(String str);

    public abstract int updatePublicStreamParam(String str, PublicStreaming publicStreaming);

    public abstract int updatePushMixedStreamToCDN(String str, MixedStreamConfig mixedStreamConfig);

    public abstract int updateRemoteStreamVideoCanvas(RemoteStreamKey remoteStreamKey, int i10, int i11);

    public abstract int updateRemoteStreamVideoCanvas(RemoteStreamKey remoteStreamKey, RemoteVideoRenderConfig remoteVideoRenderConfig);

    public abstract int updateScreenCapture(ScreenMediaType screenMediaType);

    @Deprecated
    public abstract int updateVideoEffectNode(String str, String str2, float f10);
}
