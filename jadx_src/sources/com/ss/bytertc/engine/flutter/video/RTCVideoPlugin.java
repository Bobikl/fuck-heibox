package com.ss.bytertc.engine.flutter.video;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.constraintlayout.motion.widget.f;
import com.google.common.primitives.SignedBytes;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.lzy.okgo.model.Progress;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.max.xiaoheihe.module.mall.SteamStoreLoginActivity;
import com.ss.bytertc.engine.NetworkTimeInfo;
import com.ss.bytertc.engine.RTCRoom;
import com.ss.bytertc.engine.RTCVideo;
import com.ss.bytertc.engine.VideoCanvas;
import com.ss.bytertc.engine.audio.IAudioEffectPlayer;
import com.ss.bytertc.engine.audio.IMediaPlayer;
import com.ss.bytertc.engine.audio.ISingScoringManager;
import com.ss.bytertc.engine.data.AudioAlignmentMode;
import com.ss.bytertc.engine.data.AudioRoute;
import com.ss.bytertc.engine.data.CameraId;
import com.ss.bytertc.engine.data.EarMonitorMode;
import com.ss.bytertc.engine.data.EchoTestConfig;
import com.ss.bytertc.engine.data.EffectBeautyMode;
import com.ss.bytertc.engine.data.MirrorType;
import com.ss.bytertc.engine.data.MuteState;
import com.ss.bytertc.engine.data.RemoteMirrorType;
import com.ss.bytertc.engine.data.RemoteStreamKey;
import com.ss.bytertc.engine.data.SEICountPerFrame;
import com.ss.bytertc.engine.data.ScreenMediaType;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.VideoDenoiseMode;
import com.ss.bytertc.engine.data.VideoOrientation;
import com.ss.bytertc.engine.data.VideoRotation;
import com.ss.bytertc.engine.data.VideoRotationMode;
import com.ss.bytertc.engine.data.VideoSuperResolutionMode;
import com.ss.bytertc.engine.data.ZoomConfigType;
import com.ss.bytertc.engine.data.ZoomDirectionType;
import com.ss.bytertc.engine.flutter.base.RTCType;
import com.ss.bytertc.engine.flutter.base.RTCTypeBox;
import com.ss.bytertc.engine.flutter.base.RTCVideoManager;
import com.ss.bytertc.engine.flutter.ktv.KTVManagerPlugin;
import com.ss.bytertc.engine.flutter.plugin.RTCFlutterPlugin;
import com.ss.bytertc.engine.flutter.render.EchoTestViewHolder;
import com.ss.bytertc.engine.flutter.room.RTCRoomPlugin;
import com.ss.bytertc.engine.flutter.screencapture.LaunchHelper;
import com.ss.bytertc.engine.publicstream.PublicStreaming;
import com.ss.bytertc.engine.type.AnsMode;
import com.ss.bytertc.engine.type.AudioProfileType;
import com.ss.bytertc.engine.type.AudioScenarioType;
import com.ss.bytertc.engine.type.AudioSceneType;
import com.ss.bytertc.engine.type.MessageConfig;
import com.ss.bytertc.engine.type.RecordingType;
import com.ss.bytertc.engine.type.VoiceChangerType;
import com.ss.bytertc.engine.type.VoiceReverbType;
import com.ss.bytertc.ktv.IKTVManager;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.taobao.accs.common.Constants;
import com.tencent.live2.impl.V2TXLiveDefInner;
import com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.TPReportParams;
import com.umeng.analytics.pro.ak;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import okio.Utf8;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class RTCVideoPlugin extends RTCFlutterPlugin {
    private final ASREngineEventProxy asrEventHandler;
    private final MethodChannel.MethodCallHandler callHandler;
    private final FaceDetectionEventProxy faceDetectionHandler;
    private final HashMap<String, RTCFlutterPlugin> flutterPlugins;
    private final LiveTranscodingEventProxy liveTranscodingEventProxy;
    private final MixedStreamProxy mixedStreamProxy;
    private final PushSingleStreamToCDNProxy pushSingleStreamToCDNProxy;
    private final HashMap<Integer, RTCRoomPlugin> roomPlugins;
    private final SnapshotResultCallbackProxy snapshotResultCallbackProxy;

    public RTCVideoPlugin() {
        HashMap<String, RTCFlutterPlugin> map = new HashMap<>();
        this.flutterPlugins = map;
        this.roomPlugins = new HashMap<>();
        this.faceDetectionHandler = new FaceDetectionEventProxy();
        this.liveTranscodingEventProxy = new LiveTranscodingEventProxy();
        this.mixedStreamProxy = new MixedStreamProxy();
        this.asrEventHandler = new ASREngineEventProxy();
        this.pushSingleStreamToCDNProxy = new PushSingleStreamToCDNProxy();
        this.snapshotResultCallbackProxy = new SnapshotResultCallbackProxy();
        this.callHandler = new MethodChannel.MethodCallHandler() { // from class: com.ss.bytertc.engine.flutter.video.RTCVideoPlugin.1
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(@n0 MethodCall methodCall, @n0 MethodChannel.Result result) {
                RTCTypeBox rTCTypeBox = new RTCTypeBox(methodCall.arguments, methodCall.method);
                String str = methodCall.method;
                str.hashCode();
                byte b10 = -1;
                switch (str.hashCode()) {
                    case -2116493571:
                        if (str.equals("setBusinessId")) {
                            b10 = 0;
                        }
                        break;
                    case -2108985057:
                        if (str.equals("startPlayPublicStream")) {
                            b10 = 1;
                        }
                        break;
                    case -2078519315:
                        if (str.equals("setBackgroundSticker")) {
                            b10 = 2;
                        }
                        break;
                    case -2059924751:
                        if (str.equals("setEncryptInfo")) {
                            b10 = 3;
                        }
                        break;
                    case -2025822283:
                        if (str.equals("getCameraZoomMaxRatio")) {
                            b10 = 4;
                        }
                        break;
                    case -2023897565:
                        if (str.equals("setRemoteAudioPlaybackVolume")) {
                            b10 = 5;
                        }
                        break;
                    case -1996664412:
                        if (str.equals("setPublishFallbackOption")) {
                            b10 = 6;
                        }
                        break;
                    case -1975544447:
                        if (str.equals("sendPublicStreamSEIMessage")) {
                            b10 = 7;
                        }
                        break;
                    case -1964757132:
                        if (str.equals("removeLocalVideo")) {
                            b10 = 8;
                        }
                        break;
                    case -1951724019:
                        if (str.equals("sendUserBinaryMessageOutsideRoom")) {
                            b10 = 9;
                        }
                        break;
                    case -1940429344:
                        if (str.equals("setEarMonitorVolume")) {
                            b10 = 10;
                        }
                        break;
                    case -1884365026:
                        if (str.equals("stopASR")) {
                            b10 = 11;
                        }
                        break;
                    case -1881258538:
                        if (str.equals("clearVideoWatermark")) {
                            b10 = 12;
                        }
                        break;
                    case -1880670041:
                        if (str.equals("setVideoEffectNodes")) {
                            b10 = 13;
                        }
                        break;
                    case -1851386976:
                        if (str.equals("setRuntimeParameters")) {
                            b10 = 14;
                        }
                        break;
                    case -1719988628:
                        if (str.equals("sendUserMessageOutsideRoom")) {
                            b10 = 15;
                        }
                        break;
                    case -1688646392:
                        if (str.equals("takeLocalSnapshot")) {
                            b10 = 16;
                        }
                        break;
                    case -1660009230:
                        if (str.equals("setDefaultAudioRoute")) {
                            b10 = 17;
                        }
                        break;
                    case -1603654547:
                        if (str.equals("enableSimulcastMode")) {
                            b10 = com.google.common.base.a.f56668u;
                        }
                        break;
                    case -1544515871:
                        if (str.equals("isCameraTorchSupported")) {
                            b10 = 19;
                        }
                        break;
                    case -1522830145:
                        if (str.equals("stopPlayPublicStream")) {
                            b10 = com.google.common.base.a.f56671x;
                        }
                        break;
                    case -1482967488:
                        if (str.equals("createRTCRoom")) {
                            b10 = com.google.common.base.a.f56672y;
                        }
                        break;
                    case -1480820867:
                        if (str.equals("updateLiveTranscoding")) {
                            b10 = com.google.common.base.a.f56673z;
                        }
                        break;
                    case -1460651508:
                        if (str.equals("setRemoteVideoMirrorType")) {
                            b10 = com.google.common.base.a.A;
                        }
                        break;
                    case -1362272188:
                        if (str.equals("setAudioScenario")) {
                            b10 = com.google.common.base.a.B;
                        }
                        break;
                    case -1349797482:
                        if (str.equals("startHardwareEchoDetection")) {
                            b10 = com.google.common.base.a.C;
                        }
                        break;
                    case -1346984596:
                        if (str.equals("isCameraZoomSupported")) {
                            b10 = com.google.common.base.a.D;
                        }
                        break;
                    case -1267587940:
                        if (str.equals("sendServerMessage")) {
                            b10 = com.google.common.base.a.E;
                        }
                        break;
                    case -1243157499:
                        if (str.equals("startPushPublicStream")) {
                            b10 = com.google.common.base.a.F;
                        }
                        break;
                    case -1134828994:
                        if (str.equals("enableCameraAutoExposureFaceMode")) {
                            b10 = com.google.common.base.a.G;
                        }
                        break;
                    case -1128824021:
                        if (str.equals("setVideoWatermark")) {
                            b10 = com.google.common.base.a.H;
                        }
                        break;
                    case -1109513839:
                        if (str.equals("setCameraZoomRatio")) {
                            b10 = 31;
                        }
                        break;
                    case -1097329270:
                        if (str.equals("logout")) {
                            b10 = 32;
                        }
                        break;
                    case -1085233925:
                        if (str.equals("updatePublicStreamParam")) {
                            b10 = 33;
                        }
                        break;
                    case -1071201617:
                        if (str.equals("getMediaPlayer")) {
                            b10 = 34;
                        }
                        break;
                    case -1046270159:
                        if (str.equals("sendStreamSyncInfo")) {
                            b10 = 35;
                        }
                        break;
                    case -1038418453:
                        if (str.equals("startVideoDigitalZoomControl")) {
                            b10 = 36;
                        }
                        break;
                    case -906448706:
                        if (str.equals("setCaptureVolume")) {
                            b10 = 37;
                        }
                        break;
                    case -904990449:
                        if (str.equals("isCameraExposurePositionSupported")) {
                            b10 = 38;
                        }
                        break;
                    case -841078663:
                        if (str.equals("startNetworkDetection")) {
                            b10 = 39;
                        }
                        break;
                    case -790368626:
                        if (str.equals("removePublicStreamVideo")) {
                            b10 = 40;
                        }
                        break;
                    case -705717394:
                        if (str.equals("startPushSingleStreamToCDN")) {
                            b10 = 41;
                        }
                        break;
                    case -674345885:
                        if (str.equals("enableVocalInstrumentBalance")) {
                            b10 = 42;
                        }
                        break;
                    case -670598441:
                        if (str.equals("setVideoOrientation")) {
                            b10 = 43;
                        }
                        break;
                    case -657002587:
                        if (str.equals("stopPushPublicStream")) {
                            b10 = 44;
                        }
                        break;
                    case -595900328:
                        if (str.equals("stopScreenCapture")) {
                            b10 = 45;
                        }
                        break;
                    case -522973499:
                        if (str.equals("setVideoEncoderConfig")) {
                            b10 = 46;
                        }
                        break;
                    case -491990407:
                        if (str.equals("stopEchoTest")) {
                            b10 = 47;
                        }
                        break;
                    case -385105142:
                        if (str.equals("setScreenAudioStreamIndex")) {
                            b10 = org.apache.tools.tar.c.F;
                        }
                        break;
                    case -364891643:
                        if (str.equals("updateVideoEffectNode")) {
                            b10 = org.apache.tools.tar.c.G;
                        }
                        break;
                    case -363132395:
                        if (str.equals("setCameraTorch")) {
                            b10 = org.apache.tools.tar.c.H;
                        }
                        break;
                    case -341470063:
                        if (str.equals("takeRemoteSnapshot")) {
                            b10 = org.apache.tools.tar.c.I;
                        }
                        break;
                    case -300517486:
                        if (str.equals("setLocalVoiceReverbParam")) {
                            b10 = org.apache.tools.tar.c.J;
                        }
                        break;
                    case -300279741:
                        if (str.equals("getSingScoringManager")) {
                            b10 = org.apache.tools.tar.c.K;
                        }
                        break;
                    case -263591398:
                        if (str.equals("setVideoRotationMode")) {
                            b10 = org.apache.tools.tar.c.L;
                        }
                        break;
                    case -254923751:
                        if (str.equals("stopNetworkDetection")) {
                            b10 = org.apache.tools.tar.c.M;
                        }
                        break;
                    case -243368574:
                        if (str.equals("destroyRTCRoom")) {
                            b10 = 56;
                        }
                        break;
                    case -221565293:
                        if (str.equals("startFileRecording")) {
                            b10 = 57;
                        }
                        break;
                    case -220562414:
                        if (str.equals("startAudioCapture")) {
                            b10 = 58;
                        }
                        break;
                    case -191501435:
                        if (str.equals("feedback")) {
                            b10 = 59;
                        }
                        break;
                    case -154190229:
                        if (str.equals("setVideoCaptureRotation")) {
                            b10 = 60;
                        }
                        break;
                    case -122363968:
                        if (str.equals("setPublicStreamAudioPlaybackVolume")) {
                            b10 = 61;
                        }
                        break;
                    case -52601679:
                        if (str.equals("removeRemoteVideo")) {
                            b10 = 62;
                        }
                        break;
                    case -20966180:
                        if (str.equals("enableLocalVoiceReverb")) {
                            b10 = Utf8.REPLACEMENT_BYTE;
                        }
                        break;
                    case 23963211:
                        if (str.equals("stopVideoDigitalZoomControl")) {
                            b10 = SignedBytes.f59068a;
                        }
                        break;
                    case 49275947:
                        if (str.equals("setServerParams")) {
                            b10 = 65;
                        }
                        break;
                    case 78618135:
                        if (str.equals("setPlaybackVolume")) {
                            b10 = 66;
                        }
                        break;
                    case 85614165:
                        if (str.equals("setBeautyIntensity")) {
                            b10 = 67;
                        }
                        break;
                    case 94739293:
                        if (str.equals("stopAudioRecording")) {
                            b10 = 68;
                        }
                        break;
                    case 102301239:
                        if (str.equals("setLocalVoicePitch")) {
                            b10 = 69;
                        }
                        break;
                    case 103149417:
                        if (str.equals(SteamStoreLoginActivity.f89907b0)) {
                            b10 = 70;
                        }
                        break;
                    case 105711083:
                        if (str.equals("setVideoDigitalZoomControl")) {
                            b10 = 71;
                        }
                        break;
                    case 133579217:
                        if (str.equals("setVideoEffectAlgoModelPath")) {
                            b10 = 72;
                        }
                        break;
                    case 153026565:
                        if (str.equals("setMaxVideoEncoderConfig")) {
                            b10 = 73;
                        }
                        break;
                    case 173748411:
                        if (str.equals("registerFaceDetectionObserver")) {
                            b10 = 74;
                        }
                        break;
                    case 197148369:
                        if (str.equals("setScreenVideoEncoderConfig")) {
                            b10 = org.apache.tools.tar.c.N;
                        }
                        break;
                    case 226102394:
                        if (str.equals("invokeExperimentalAPI")) {
                            b10 = org.apache.tools.tar.c.O;
                        }
                        break;
                    case 228075204:
                        if (str.equals("startLiveTranscoding")) {
                            b10 = 77;
                        }
                        break;
                    case 243375802:
                        if (str.equals("updatePushMixedStreamToCDN")) {
                            b10 = 78;
                        }
                        break;
                    case 276874743:
                        if (str.equals("setRemoteUserPriority")) {
                            b10 = 79;
                        }
                        break;
                    case 285701650:
                        if (str.equals("getAudioEffectPlayer")) {
                            b10 = 80;
                        }
                        break;
                    case 304937462:
                        if (str.equals("stopHardwareEchoDetection")) {
                            b10 = 81;
                        }
                        break;
                    case 479756083:
                        if (str.equals("getNetworkTimeInfo")) {
                            b10 = 82;
                        }
                        break;
                    case 547180466:
                        if (str.equals("stopAudioCapture")) {
                            b10 = org.apache.tools.tar.c.P;
                        }
                        break;
                    case 641480309:
                        if (str.equals("setAudioProfile")) {
                            b10 = 84;
                        }
                        break;
                    case 649569548:
                        if (str.equals("setVoiceChangerType")) {
                            b10 = 85;
                        }
                        break;
                    case 705570486:
                        if (str.equals("getKTVManager")) {
                            b10 = 86;
                        }
                        break;
                    case 759498554:
                        if (str.equals("setCameraFocusPosition")) {
                            b10 = 87;
                        }
                        break;
                    case 767111033:
                        if (str.equals("switchCamera")) {
                            b10 = org.apache.tools.tar.c.R;
                        }
                        break;
                    case 774429169:
                        if (str.equals("enableExternalSoundCard")) {
                            b10 = 89;
                        }
                        break;
                    case 808398553:
                        if (str.equals("startEchoTest")) {
                            b10 = 90;
                        }
                        break;
                    case 816125312:
                        if (str.equals("setCellularEnhancement")) {
                            b10 = 91;
                        }
                        break;
                    case 851665875:
                        if (str.equals("startPushMixedStreamToCDN")) {
                            b10 = 92;
                        }
                        break;
                    case 883496904:
                        if (str.equals("setCameraExposureCompensation")) {
                            b10 = 93;
                        }
                        break;
                    case 908804956:
                        if (str.equals("isCameraFocusPositionSupported")) {
                            b10 = 94;
                        }
                        break;
                    case 944402084:
                        if (str.equals("setAudioAlignmentProperty")) {
                            b10 = 95;
                        }
                        break;
                    case 1028206525:
                        if (str.equals("startAudioRecording")) {
                            b10 = 96;
                        }
                        break;
                    case 1068020203:
                        if (str.equals("enablePlaybackDucking")) {
                            b10 = 97;
                        }
                        break;
                    case 1098902283:
                        if (str.equals("setLocalVideoMirrorType")) {
                            b10 = 98;
                        }
                        break;
                    case 1141364511:
                        if (str.equals("setSubscribeFallbackOption")) {
                            b10 = 99;
                        }
                        break;
                    case 1181004034:
                        if (str.equals("setVideoEffectColorFilterIntensity")) {
                            b10 = 100;
                        }
                        break;
                    case 1215071804:
                        if (str.equals("setVoiceReverbType")) {
                            b10 = 101;
                        }
                        break;
                    case 1218637773:
                        if (str.equals("startVideoCapture")) {
                            b10 = 102;
                        }
                        break;
                    case 1238243962:
                        if (str.equals("enableAudioPropertiesReport")) {
                            b10 = org.apache.tools.tar.c.S;
                        }
                        break;
                    case 1239471113:
                        if (str.equals("getAudioRoute")) {
                            b10 = 104;
                        }
                        break;
                    case 1253343673:
                        if (str.equals("updateLoginToken")) {
                            b10 = 105;
                        }
                        break;
                    case 1293537936:
                        if (str.equals("enableEffectBeauty")) {
                            b10 = 106;
                        }
                        break;
                    case 1316767422:
                        if (str.equals("startASR")) {
                            b10 = 107;
                        }
                        break;
                    case 1355362084:
                        if (str.equals("stopLiveTranscoding")) {
                            b10 = 108;
                        }
                        break;
                    case 1373874168:
                        if (str.equals("startScreenCapture")) {
                            b10 = 109;
                        }
                        break;
                    case 1427116892:
                        if (str.equals("setCameraAdaptiveMinimumFrameRate")) {
                            b10 = 110;
                        }
                        break;
                    case 1522609993:
                        if (str.equals("muteAudioCapture")) {
                            b10 = 111;
                        }
                        break;
                    case 1541773277:
                        if (str.equals("checkVideoEffectLicense")) {
                            b10 = 112;
                        }
                        break;
                    case 1571201851:
                        if (str.equals("startCloudProxy")) {
                            b10 = 113;
                        }
                        break;
                    case 1623579035:
                        if (str.equals("sendServerBinaryMessage")) {
                            b10 = 114;
                        }
                        break;
                    case 1633464809:
                        if (str.equals("setEarMonitorMode")) {
                            b10 = 115;
                        }
                        break;
                    case 1665964276:
                        if (str.equals("setVideoDigitalZoomConfig")) {
                            b10 = 116;
                        }
                        break;
                    case 1679722863:
                        if (str.equals("setVideoCaptureConfig")) {
                            b10 = 117;
                        }
                        break;
                    case 1705620375:
                        if (str.equals("setCameraExposurePosition")) {
                            b10 = 118;
                        }
                        break;
                    case 1732894427:
                        if (str.equals("stopCloudProxy")) {
                            b10 = 119;
                        }
                        break;
                    case 1737733108:
                        if (str.equals("setRemoteVideoSuperResolution")) {
                            b10 = org.apache.tools.tar.c.Q;
                        }
                        break;
                    case 1766190021:
                        if (str.equals("setLocalProxy")) {
                            b10 = 121;
                        }
                        break;
                    case 1800072753:
                        if (str.equals("setVideoEffectColorFilter")) {
                            b10 = 122;
                        }
                        break;
                    case 1828803101:
                        if (str.equals("getPeerOnlineStatus")) {
                            b10 = 123;
                        }
                        break;
                    case 1838743896:
                        if (str.equals("sendSEIMessage")) {
                            b10 = 124;
                        }
                        break;
                    case 1881592561:
                        if (str.equals("updateScreenCapture")) {
                            b10 = 125;
                        }
                        break;
                    case 1885171320:
                        if (str.equals("muteAudioPlayback")) {
                            b10 = 126;
                        }
                        break;
                    case 1891724249:
                        if (str.equals("setLocalVoiceEqualization")) {
                            b10 = 127;
                        }
                        break;
                    case 1946039401:
                        if (str.equals("enableVideoEffect")) {
                            b10 = 128;
                        }
                        break;
                    case 1964741810:
                        if (str.equals("setVideoDenoiser")) {
                            b10 = 129;
                        }
                        break;
                    case 1986380653:
                        if (str.equals("stopVideoCapture")) {
                            b10 = 130;
                        }
                        break;
                    case 1994350646:
                        if (str.equals("stopPushStreamToCDN")) {
                            b10 = 131;
                        }
                        break;
                    case 2013602325:
                        if (str.equals(V2TXLiveDefInner.TXLivePropertyKey.kV2SetAudioRoute)) {
                            b10 = 132;
                        }
                        break;
                    case 2014152792:
                        if (str.equals("setAudioScene")) {
                            b10 = 133;
                        }
                        break;
                    case 2017067264:
                        if (str.equals("setDummyCaptureImagePath")) {
                            b10 = 134;
                        }
                        break;
                    case 2103627507:
                        if (str.equals("stopFileRecording")) {
                            b10 = 135;
                        }
                        break;
                    case 2125024743:
                        if (str.equals("setAnsMode")) {
                            b10 = 136;
                        }
                        break;
                }
                switch (b10) {
                    case 0:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setBusinessId(rTCTypeBox.optString(Constants.KEY_BUSINESSID))));
                        break;
                    case 1:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().startPlayPublicStream(rTCTypeBox.optString("publicStreamId"))));
                        break;
                    case 2:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setBackgroundSticker(rTCTypeBox.optString("modelPath"), RTCType.toVirtualBackgroundSource(rTCTypeBox.optBox("source")))));
                        break;
                    case 3:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setEncryptInfo(rTCTypeBox.optInt("aesType"), rTCTypeBox.optString("key"))));
                        break;
                    case 4:
                        result.success(Float.valueOf(RTCVideoManager.getRTCVideo().getCameraZoomMaxRatio()));
                        break;
                    case 5:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setRemoteAudioPlaybackVolume(rTCTypeBox.optString("roomId"), rTCTypeBox.optString("uid"), rTCTypeBox.optInt(com.max.xiaoheihe.module.voice.component.a.f94101q))));
                        break;
                    case 6:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setPublishFallbackOption(RTCType.toPublishFallbackOption(rTCTypeBox.optInt("option")))));
                        break;
                    case 7:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().sendPublicStreamSEIMessage(StreamIndex.fromId(rTCTypeBox.optInt("streamIndex")), rTCTypeBox.optInt(RemoteMessageConst.Notification.CHANNEL_ID), rTCTypeBox.optBytes("message"), rTCTypeBox.optInt("repeatCount"), SEICountPerFrame.fromId(rTCTypeBox.optInt("mode")))));
                        break;
                    case 8:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setLocalVideoCanvas(StreamIndex.fromId(rTCTypeBox.optInt("streamType")), new VideoCanvas())));
                        break;
                    case 9:
                        result.success(Long.valueOf(RTCVideoManager.getRTCVideo().sendUserBinaryMessageOutsideRoom(rTCTypeBox.optString("uid"), rTCTypeBox.optBytes("message"), MessageConfig.fromId(rTCTypeBox.optInt("config")))));
                        break;
                    case 10:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setEarMonitorVolume(rTCTypeBox.optInt(com.max.xiaoheihe.module.voice.component.a.f94101q))));
                        break;
                    case 11:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().stopASR()));
                        break;
                    case 12:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().clearVideoWatermark(StreamIndex.fromId(rTCTypeBox.optInt("streamIndex")))));
                        break;
                    case 13:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setVideoEffectNodes(rTCTypeBox.getList("effectNodes"))));
                        break;
                    case 14:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setRuntimeParameters(rTCTypeBox.optJSONObject("params"))));
                        break;
                    case 15:
                        result.success(Long.valueOf(RTCVideoManager.getRTCVideo().sendUserMessageOutsideRoom(rTCTypeBox.optString("uid"), rTCTypeBox.optString("message"), MessageConfig.fromId(rTCTypeBox.optInt("config")))));
                        break;
                    case 16:
                        result.success(Long.valueOf(RTCVideoManager.getRTCVideo().takeLocalSnapshot(StreamIndex.fromId(rTCTypeBox.optInt("streamIndex")), RTCVideoPlugin.this.snapshotResultCallbackProxy.createCallback(rTCTypeBox.optString(Progress.E)))));
                        break;
                    case 17:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setDefaultAudioRoute(AudioRoute.fromId(rTCTypeBox.optInt("audioRoute")))));
                        break;
                    case 18:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().enableSimulcastMode(rTCTypeBox.optBoolean("enable"))));
                        break;
                    case 19:
                        result.success(Boolean.valueOf(RTCVideoManager.getRTCVideo().isCameraTorchSupported()));
                        break;
                    case 20:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().stopPlayPublicStream(rTCTypeBox.optString("publicStreamId"))));
                        break;
                    case 21:
                        int iOptInt = rTCTypeBox.optInt("roomInsId");
                        RTCRoom rTCRoomCreateRoom = RTCVideoManager.createRoom(Integer.valueOf(iOptInt), rTCTypeBox.optString("roomId"));
                        if (rTCRoomCreateRoom == null) {
                            result.success(Boolean.FALSE);
                        } else {
                            RTCRoomPlugin rTCRoomPlugin = new RTCRoomPlugin(Integer.valueOf(iOptInt), rTCRoomCreateRoom);
                            rTCRoomPlugin.onAttachedToEngine(RTCVideoPlugin.this.binding);
                            RTCVideoPlugin.this.roomPlugins.put(Integer.valueOf(iOptInt), rTCRoomPlugin);
                            result.success(Boolean.TRUE);
                        }
                        break;
                    case 22:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().updateLiveTranscoding(rTCTypeBox.optString("taskId"), RTCType.toLiveTranscoding(rTCTypeBox.optBox("transcoding")))));
                        break;
                    case 23:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setRemoteVideoMirrorType(RTCType.toRemoteStreamKey(rTCTypeBox.optBox("streamKey")), RemoteMirrorType.fromId(rTCTypeBox.optInt("mirrorType")))));
                        break;
                    case 24:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setAudioScenario(AudioScenarioType.fromId(rTCTypeBox.optInt("audioScenario")))));
                        break;
                    case 25:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().startHardwareEchoDetection(rTCTypeBox.optString("testAudioFilePath"))));
                        break;
                    case 26:
                        result.success(Boolean.valueOf(RTCVideoManager.getRTCVideo().isCameraZoomSupported()));
                        break;
                    case 27:
                        result.success(Long.valueOf(RTCVideoManager.getRTCVideo().sendServerMessage(rTCTypeBox.optString("message"))));
                        break;
                    case 28:
                        String strOptString = rTCTypeBox.optString("publicStreamId");
                        PublicStreaming publicStreaming = RTCType.toPublicStreaming(rTCTypeBox.optBox("publicStreamParam"));
                        publicStreaming.setAction("started");
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().startPushPublicStream(strOptString, publicStreaming)));
                        break;
                    case 29:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().enableCameraAutoExposureFaceMode(rTCTypeBox.optBoolean("enable"))));
                        break;
                    case 30:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setVideoWatermark(StreamIndex.fromId(rTCTypeBox.optInt("streamIndex")), rTCTypeBox.optString("imagePath"), RTCType.toRTCWatermarkConfig(rTCTypeBox.optBox("watermarkConfig")))));
                        break;
                    case 31:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setCameraZoomRatio(rTCTypeBox.optFloat("zoom"))));
                        break;
                    case 32:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().logout()));
                        break;
                    case 33:
                        String strOptString2 = rTCTypeBox.optString("publicStreamId");
                        PublicStreaming publicStreaming2 = RTCType.toPublicStreaming(rTCTypeBox.optBox("publicStreamParam"));
                        publicStreaming2.setAction("layoutChanged");
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().updatePublicStreamParam(strOptString2, publicStreaming2)));
                        break;
                    case 34:
                        int iOptInt2 = rTCTypeBox.optInt("playerId");
                        String str2 = "MediaPlayer" + iOptInt2;
                        if (RTCVideoPlugin.this.flutterPlugins.get(str2) != null) {
                            result.success(Boolean.TRUE);
                        } else {
                            IMediaPlayer mediaPlayer = RTCVideoManager.getRTCVideo().getMediaPlayer(iOptInt2);
                            boolean z10 = mediaPlayer != null;
                            if (z10) {
                                MediaPlayerPlugin mediaPlayerPlugin = new MediaPlayerPlugin(mediaPlayer, iOptInt2);
                                mediaPlayerPlugin.onAttachedToEngine(RTCVideoPlugin.this.binding);
                                RTCVideoPlugin.this.flutterPlugins.put(str2, mediaPlayerPlugin);
                            }
                            result.success(Boolean.valueOf(z10));
                        }
                        break;
                    case 35:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().sendStreamSyncInfo(rTCTypeBox.optBytes("data"), RTCType.toStreamSyncInfoConfig(rTCTypeBox.optBox("config")))));
                        break;
                    case 36:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().startVideoDigitalZoomControl(ZoomDirectionType.fromId(rTCTypeBox.optInt(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION)))));
                        break;
                    case 37:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setCaptureVolume(StreamIndex.fromId(rTCTypeBox.optInt(UCropPlusActivity.ARG_INDEX)), rTCTypeBox.optInt(com.max.xiaoheihe.module.voice.component.a.f94101q))));
                        break;
                    case 38:
                        result.success(Boolean.valueOf(RTCVideoManager.getRTCVideo().isCameraExposurePositionSupported()));
                        break;
                    case 39:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().startNetworkDetection(rTCTypeBox.optBoolean("isTestUplink"), rTCTypeBox.optInt("expectedUplinkBitrate"), rTCTypeBox.optBoolean("isTestDownlink"), rTCTypeBox.optInt("expectedDownlinkBitrate"))));
                        break;
                    case 40:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setPublicStreamVideoCanvas(rTCTypeBox.optString("publicStreamId"), new VideoCanvas())));
                        break;
                    case 41:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().startPushSingleStreamToCDN(rTCTypeBox.optString("taskId"), RTCType.toPushSingleStreamParam(rTCTypeBox.optBox(RemoteMessageConst.MessageBody.PARAM)), RTCVideoPlugin.this.pushSingleStreamToCDNProxy)));
                        break;
                    case 42:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().enableVocalInstrumentBalance(rTCTypeBox.optBoolean("enable"))));
                        break;
                    case 43:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setVideoOrientation(VideoOrientation.fromId(rTCTypeBox.optInt("orientation")))));
                        break;
                    case 44:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().stopPushPublicStream(rTCTypeBox.optString("publicStreamId"))));
                        break;
                    case 45:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().stopScreenCapture()));
                        break;
                    case 46:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setVideoEncoderConfig(RTCType.toVideoEncoderConfigArray(rTCTypeBox.getList("channelSolutions")))));
                        break;
                    case 47:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().stopEchoTest()));
                        break;
                    case 48:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setScreenAudioStreamIndex(StreamIndex.fromId(rTCTypeBox.optInt("streamIndex")))));
                        break;
                    case 49:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().updateVideoEffectNode(rTCTypeBox.optString("effectNode"), rTCTypeBox.optString("key"), rTCTypeBox.optFloat("value"))));
                        break;
                    case 50:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setCameraTorch(RTCType.toTorchState(rTCTypeBox.optInt("torchState")))));
                        break;
                    case 51:
                        result.success(Long.valueOf(RTCVideoManager.getRTCVideo().takeRemoteSnapshot(RTCType.toRemoteStreamKey(rTCTypeBox.optBox("streamKey")), RTCVideoPlugin.this.snapshotResultCallbackProxy.createCallback(rTCTypeBox.optString(Progress.E)))));
                        break;
                    case 52:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setLocalVoiceReverbParam(RTCType.toVoiceReverbConfig(rTCTypeBox.optBox("config")))));
                        break;
                    case 53:
                        if (RTCVideoPlugin.this.flutterPlugins.get("SingScoring") != null) {
                            result.success(Boolean.TRUE);
                        } else {
                            ISingScoringManager singScoringManager = RTCVideoManager.getRTCVideo().getSingScoringManager();
                            boolean z11 = singScoringManager != null;
                            if (z11) {
                                SingScoringPlugin singScoringPlugin = new SingScoringPlugin(singScoringManager);
                                singScoringPlugin.onAttachedToEngine(RTCVideoPlugin.this.binding);
                                RTCVideoPlugin.this.flutterPlugins.put("SingScoring", singScoringPlugin);
                            }
                            result.success(Boolean.valueOf(z11));
                        }
                        break;
                    case 54:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setVideoRotationMode(VideoRotationMode.fromId(rTCTypeBox.optInt("rotationMode")))));
                        break;
                    case 55:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().stopNetworkDetection()));
                        break;
                    case 56:
                        RTCRoomPlugin rTCRoomPlugin2 = (RTCRoomPlugin) RTCVideoPlugin.this.roomPlugins.remove(Integer.valueOf(rTCTypeBox.optInt("insId")));
                        if (rTCRoomPlugin2 != null) {
                            rTCRoomPlugin2.onDetachedFromEngine(RTCVideoPlugin.this.binding);
                        }
                        result.success(null);
                        break;
                    case 57:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().startFileRecording(StreamIndex.fromId(rTCTypeBox.optInt("streamIndex")), RTCType.toRecordingConfig(rTCTypeBox.optBox("config")), RecordingType.fromId(rTCTypeBox.optInt("recordingType")))));
                        break;
                    case 58:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().startAudioCapture()));
                        break;
                    case 59:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().feedback(RTCType.toFeedBackList(rTCTypeBox.getList("types")), RTCType.toFeedbackInfo(rTCTypeBox.optBox("info")))));
                        break;
                    case 60:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setVideoCaptureRotation(VideoRotation.fromId(rTCTypeBox.optInt(f.f18721i)))));
                        break;
                    case 61:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setPublicStreamAudioPlaybackVolume(rTCTypeBox.optString("publicStreamId"), rTCTypeBox.optInt(com.max.xiaoheihe.module.voice.component.a.f94101q))));
                        break;
                    case 62:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setRemoteVideoCanvas(new RemoteStreamKey(rTCTypeBox.optString("roomId"), rTCTypeBox.optString("uid"), StreamIndex.fromId(rTCTypeBox.optInt("streamType"))), new VideoCanvas())));
                        break;
                    case 63:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().enableLocalVoiceReverb(rTCTypeBox.optBoolean("enable"))));
                        break;
                    case 64:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().stopVideoDigitalZoomControl()));
                        break;
                    case 65:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setServerParams(rTCTypeBox.optString("signature"), rTCTypeBox.optString("url"))));
                        break;
                    case 66:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setPlaybackVolume(rTCTypeBox.optInt(com.max.xiaoheihe.module.voice.component.a.f94101q))));
                        break;
                    case 67:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setBeautyIntensity(EffectBeautyMode.fromId(rTCTypeBox.optInt("beautyMode")), rTCTypeBox.optFloat("intensity"))));
                        break;
                    case 68:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().stopAudioRecording()));
                        break;
                    case 69:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setLocalVoicePitch(rTCTypeBox.optInt("pitch"))));
                        break;
                    case 70:
                        result.success(Long.valueOf(RTCVideoManager.getRTCVideo().login(rTCTypeBox.optString("token"), rTCTypeBox.optString("uid"))));
                        break;
                    case 71:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setVideoDigitalZoomControl(ZoomDirectionType.fromId(rTCTypeBox.optInt(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION)))));
                        break;
                    case 72:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setVideoEffectAlgoModelPath(rTCTypeBox.optString("modelPath"))));
                        break;
                    case 73:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setVideoEncoderConfig(RTCType.toVideoEncoderConfig(rTCTypeBox.optBox("maxSolution")))));
                        break;
                    case 74:
                        int iOptInt3 = rTCTypeBox.optInt(ak.aT);
                        boolean zOptBoolean = rTCTypeBox.optBoolean("observer");
                        RTCVideo rTCVideo = RTCVideoManager.getRTCVideo();
                        result.success(Integer.valueOf(zOptBoolean ? rTCVideo.registerFaceDetectionObserver(RTCVideoPlugin.this.faceDetectionHandler, iOptInt3) : rTCVideo.registerFaceDetectionObserver(null, iOptInt3)));
                        break;
                    case 75:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setScreenVideoEncoderConfig(RTCType.toScreenVideoEncoderConfig(rTCTypeBox.optBox("screenSolution")))));
                        break;
                    case 76:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().invokeExperimentalAPI(rTCTypeBox.optString(RemoteMessageConst.MessageBody.PARAM))));
                        break;
                    case 77:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().startLiveTranscoding(rTCTypeBox.optString("taskId"), RTCType.toLiveTranscoding(rTCTypeBox.optBox("transcoding")), RTCVideoPlugin.this.liveTranscodingEventProxy)));
                        break;
                    case 78:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().updatePushMixedStreamToCDN(rTCTypeBox.optString("taskId"), RTCType.toMixedStreamConfig(rTCTypeBox.optBox("mixedConfig")))));
                        break;
                    case 79:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setRemoteUserPriority(rTCTypeBox.optString("roomId"), rTCTypeBox.optString("uid"), RTCType.toRemoteUserPriority(rTCTypeBox.optInt("priority")))));
                        break;
                    case 80:
                        if (RTCVideoPlugin.this.flutterPlugins.get("AudioEffectPlayer") != null) {
                            result.success(Boolean.TRUE);
                        } else {
                            IAudioEffectPlayer audioEffectPlayer = RTCVideoManager.getRTCVideo().getAudioEffectPlayer();
                            boolean z12 = audioEffectPlayer != null;
                            if (z12) {
                                AudioEffectPlayerPlugin audioEffectPlayerPlugin = new AudioEffectPlayerPlugin(audioEffectPlayer);
                                audioEffectPlayerPlugin.onAttachedToEngine(RTCVideoPlugin.this.binding);
                                RTCVideoPlugin.this.flutterPlugins.put("AudioEffectPlayer", audioEffectPlayerPlugin);
                            }
                            result.success(Boolean.valueOf(z12));
                        }
                        break;
                    case 81:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().stopHardwareEchoDetection()));
                        break;
                    case 82:
                        NetworkTimeInfo networkTimeInfo = RTCVideoManager.getRTCVideo().getNetworkTimeInfo();
                        if (networkTimeInfo == null) {
                            result.success(null);
                        } else {
                            HashMap map2 = new HashMap();
                            map2.put("timestamp", Long.valueOf(networkTimeInfo.timestamp));
                            result.success(map2);
                        }
                        break;
                    case 83:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().stopAudioCapture()));
                        break;
                    case 84:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setAudioProfile(AudioProfileType.fromId(rTCTypeBox.optInt("audioProfile")))));
                        break;
                    case 85:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setVoiceChangerType(VoiceChangerType.fromId(rTCTypeBox.optInt("voiceChanger")))));
                        break;
                    case 86:
                        if (RTCVideoPlugin.this.flutterPlugins.get("KTVManager") != null) {
                            result.success(Boolean.TRUE);
                        } else {
                            IKTVManager kTVManager = RTCVideoManager.getRTCVideo().getKTVManager();
                            boolean z13 = kTVManager != null;
                            if (z13) {
                                KTVManagerPlugin kTVManagerPlugin = new KTVManagerPlugin(kTVManager);
                                kTVManagerPlugin.onAttachedToEngine(RTCVideoPlugin.this.binding);
                                RTCVideoPlugin.this.flutterPlugins.put("KTVManager", kTVManagerPlugin);
                            }
                            result.success(Boolean.valueOf(z13));
                        }
                        break;
                    case 87:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setCameraFocusPosition(rTCTypeBox.optFloat("x"), rTCTypeBox.optFloat("y"))));
                        break;
                    case 88:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().switchCamera(CameraId.fromId(rTCTypeBox.optInt("cameraId")))));
                        break;
                    case 89:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().enableExternalSoundCard(rTCTypeBox.optBoolean("enable"))));
                        break;
                    case 90:
                        EchoTestConfig echoTestConfig = RTCType.toEchoTestConfig(rTCTypeBox.optBox("config"));
                        echoTestConfig.view = EchoTestViewHolder.getRenderView();
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().startEchoTest(echoTestConfig, rTCTypeBox.optInt("delayTime"))));
                        break;
                    case 91:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setCellularEnhancement(RTCType.toMediaTypeEnhancementConfig(rTCTypeBox.optBox("config")))));
                        break;
                    case 92:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().startPushMixedStreamToCDN(rTCTypeBox.optString("taskId"), RTCType.toMixedStreamConfig(rTCTypeBox.optBox("mixedConfig")), RTCVideoPlugin.this.mixedStreamProxy)));
                        break;
                    case 93:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setCameraExposureCompensation(rTCTypeBox.optFloat(TPReportParams.JSON_KEY_VAL))));
                        break;
                    case 94:
                        result.success(Boolean.valueOf(RTCVideoManager.getRTCVideo().isCameraFocusPositionSupported()));
                        break;
                    case 95:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setAudioAlignmentProperty(RTCType.toRemoteStreamKey(rTCTypeBox.optBox("streamKey")), AudioAlignmentMode.fromId(rTCTypeBox.optInt("mode")))));
                        break;
                    case 96:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().startAudioRecording(RTCType.toAudioRecordingConfig(rTCTypeBox.optBox("config")))));
                        break;
                    case 97:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().enablePlaybackDucking(rTCTypeBox.optBoolean("enable"))));
                        break;
                    case 98:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setLocalVideoMirrorType(MirrorType.fromId(rTCTypeBox.optInt("mirrorType")))));
                        break;
                    case 99:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setSubscribeFallbackOption(RTCType.toSubscribeFallbackOptions(rTCTypeBox.optInt("option")))));
                        break;
                    case 100:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setVideoEffectColorFilterIntensity(rTCTypeBox.optFloat("intensity"))));
                        break;
                    case 101:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setVoiceReverbType(VoiceReverbType.fromId(rTCTypeBox.optInt("voiceReverb")))));
                        break;
                    case 102:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().startVideoCapture()));
                        break;
                    case 103:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().enableAudioPropertiesReport(RTCType.toAudioPropertiesConfig(rTCTypeBox.optBox("config")))));
                        break;
                    case 104:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().getAudioRoute().value()));
                        break;
                    case 105:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().updateLoginToken(rTCTypeBox.optString("token"))));
                        break;
                    case 106:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().enableEffectBeauty(rTCTypeBox.optBoolean("enable"))));
                        break;
                    case 107:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().startASR(RTCType.toRTCASRConfig(rTCTypeBox.optBox("asrConfig")), RTCVideoPlugin.this.asrEventHandler)));
                        break;
                    case 108:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().stopLiveTranscoding(rTCTypeBox.optString("taskId"))));
                        break;
                    case 109:
                        result.success(Boolean.valueOf(LaunchHelper.requestScreenCapture(RTCVideoPlugin.this.binding.getApplicationContext(), ScreenMediaType.fromId(rTCTypeBox.optInt("type")))));
                        break;
                    case 110:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setCameraAdaptiveMinimumFrameRate(rTCTypeBox.optInt("framerate"))));
                        break;
                    case 111:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().muteAudioCapture(StreamIndex.fromId(rTCTypeBox.optInt(UCropPlusActivity.ARG_INDEX)), rTCTypeBox.optBoolean("mute"))));
                        break;
                    case 112:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().checkVideoEffectLicense(RTCVideoPlugin.this.binding.getApplicationContext(), rTCTypeBox.optString("licenseFile"))));
                        break;
                    case 113:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().startCloudProxy(RTCType.toCloudProxyInfoList((List) rTCTypeBox.opt("cloudProxiesInfo", Collections.emptyList(), List.class)))));
                        break;
                    case 114:
                        result.success(Long.valueOf(RTCVideoManager.getRTCVideo().sendServerBinaryMessage(rTCTypeBox.optBytes("message"))));
                        break;
                    case 115:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setEarMonitorMode(EarMonitorMode.fromId(rTCTypeBox.optInt("mode")))));
                        break;
                    case 116:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setVideoDigitalZoomConfig(ZoomConfigType.fromId(rTCTypeBox.optInt("type")), rTCTypeBox.optFloat(UiKitSpanObj.TYPE_SIZE))));
                        break;
                    case 117:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setVideoCaptureConfig(RTCType.toVideoCaptureConfig(rTCTypeBox.optBox("config")))));
                        break;
                    case 118:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setCameraExposurePosition(rTCTypeBox.optFloat("x"), rTCTypeBox.optFloat("y"))));
                        break;
                    case 119:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().stopCloudProxy()));
                        break;
                    case 120:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setRemoteVideoSuperResolution(RTCType.toRemoteStreamKey(rTCTypeBox.optBox("streamKey")), VideoSuperResolutionMode.fromId(rTCTypeBox.optInt("mode")))));
                        break;
                    case 121:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setLocalProxy(RTCType.toLocalProxyConfigurations(rTCTypeBox.getList("configurations")))));
                        break;
                    case 122:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setVideoEffectColorFilter(rTCTypeBox.optString("resFile"))));
                        break;
                    case 123:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().getPeerOnlineStatus(rTCTypeBox.optString("peerUid"))));
                        break;
                    case 124:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().sendSEIMessage(StreamIndex.fromId(rTCTypeBox.optInt("streamIndex")), rTCTypeBox.optBytes("message"), rTCTypeBox.optInt("repeatCount"), SEICountPerFrame.fromId(rTCTypeBox.optInt("mode")))));
                        break;
                    case 125:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().updateScreenCapture(ScreenMediaType.fromId(rTCTypeBox.optInt("type")))));
                        break;
                    case 126:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().muteAudioPlayback(MuteState.fromId(rTCTypeBox.optInt("muteState")))));
                        break;
                    case 127:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setLocalVoiceEqualization(RTCType.toVoiceEqualizationConfig(rTCTypeBox.optBox("config")))));
                        break;
                    case 128:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().enableVideoEffect(rTCTypeBox.optBoolean("enable"))));
                        break;
                    case 129:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setVideoDenoiser(VideoDenoiseMode.fromId(rTCTypeBox.optInt("mode")))));
                        break;
                    case 130:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().stopVideoCapture()));
                        break;
                    case 131:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().stopPushStreamToCDN(rTCTypeBox.optString("taskId"))));
                        break;
                    case 132:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setAudioRoute(AudioRoute.fromId(rTCTypeBox.optInt("audioRoute")))));
                        break;
                    case 133:
                        AudioSceneType audioSceneType = AudioSceneType.AUDIO_SCENE_DEFAULT;
                        for (AudioSceneType audioSceneType2 : AudioSceneType.values()) {
                            if (audioSceneType2.value == rTCTypeBox.optInt("audioScene")) {
                                audioSceneType = audioSceneType2;
                                result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setAudioScene(audioSceneType)));
                            }
                            break;
                        }
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setAudioScene(audioSceneType)));
                        break;
                    case 134:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setDummyCaptureImagePath(rTCTypeBox.optString(Progress.E))));
                        break;
                    case 135:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().stopFileRecording(StreamIndex.fromId(rTCTypeBox.optInt("streamIndex")))));
                        break;
                    case 136:
                        result.success(Integer.valueOf(RTCVideoManager.getRTCVideo().setAnsMode(AnsMode.fromId(rTCTypeBox.optInt("ansMode")))));
                        break;
                    default:
                        result.notImplemented();
                        break;
                }
            }
        };
        map.put("AudioMixing", new AudioMixingPlugin());
        map.put("VideoEffect", new VideoEffectPlugin());
    }

    @Override // com.ss.bytertc.engine.flutter.plugin.RTCFlutterPlugin, io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@n0 FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        super.onAttachedToEngine(flutterPluginBinding);
        Iterator<RTCFlutterPlugin> it = this.flutterPlugins.values().iterator();
        while (it.hasNext()) {
            it.next().onAttachedToEngine(flutterPluginBinding);
        }
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.bytedance.ve_rtc_video");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this.callHandler);
        this.faceDetectionHandler.registerEvent(flutterPluginBinding.getBinaryMessenger(), "com.bytedance.ve_rtc_face_detection");
        this.liveTranscodingEventProxy.registerEvent(flutterPluginBinding.getBinaryMessenger());
        this.mixedStreamProxy.registerEvent(flutterPluginBinding.getBinaryMessenger());
        this.asrEventHandler.registerEvent(flutterPluginBinding.getBinaryMessenger());
        this.pushSingleStreamToCDNProxy.registerEvent(flutterPluginBinding.getBinaryMessenger());
        this.snapshotResultCallbackProxy.registerEvent(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // com.ss.bytertc.engine.flutter.plugin.RTCFlutterPlugin, io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@n0 FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        super.onDetachedFromEngine(flutterPluginBinding);
        Iterator<RTCFlutterPlugin> it = this.flutterPlugins.values().iterator();
        while (it.hasNext()) {
            it.next().onDetachedFromEngine(flutterPluginBinding);
        }
        Iterator<RTCRoomPlugin> it2 = this.roomPlugins.values().iterator();
        while (it2.hasNext()) {
            it2.next().onDetachedFromEngine(flutterPluginBinding);
        }
        this.roomPlugins.clear();
        this.faceDetectionHandler.destroy();
        this.liveTranscodingEventProxy.destroy();
        this.mixedStreamProxy.destroy();
        this.asrEventHandler.destroy();
        this.pushSingleStreamToCDNProxy.destroy();
        this.snapshotResultCallbackProxy.destroy();
    }
}
