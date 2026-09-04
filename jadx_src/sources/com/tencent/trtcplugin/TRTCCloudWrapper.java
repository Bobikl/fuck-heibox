package com.tencent.trtcplugin;

import ad.c;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.SurfaceTexture;
import androidx.constraintlayout.motion.widget.f;
import com.google.gson.Gson;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.device.TXDeviceManager;
import com.tencent.live.beauty.custom.ITXCustomBeautyProcesser;
import com.tencent.live.beauty.custom.ITXCustomBeautyProcesserFactory;
import com.tencent.live.beauty.custom.TXCustomBeautyDef;
import com.tencent.trtc.TRTCCloud;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.trtc.TRTCCloudListener;
import com.tencent.trtcplugin.listener.AudioFrameListener;
import com.tencent.trtcplugin.listener.CustomTRTCCloudListener;
import com.tencent.trtcplugin.listener.ProcessVideoFrame;
import com.tencent.trtcplugin.util.CommonUtil;
import com.tencent.trtcplugin.util.ObjectUtils;
import com.tencent.trtcplugin.view.CustomRenderVideoFrame;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.JSONMessageCodec;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.platform.PlatformViewRegistry;
import io.flutter.view.TextureRegistry;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class TRTCCloudWrapper {
    public static Map<String, TRTCCloudWrapper> mTRTCManagerMap = new HashMap();
    private AudioFrameListener mAudioFrameListener;
    private BasicMessageChannel mBasicChannel;
    private BinaryMessenger mBinaryMessenger;
    private MethodChannel mChannel;
    private String mChannelName;
    private Context mContext;
    private ITXCustomBeautyProcesser mCustomBeautyProcesser;
    private FlutterPlugin.FlutterAssets mFlutterAssets;
    private CustomRenderVideoFrame mLocalCustomRender;
    private SurfaceTexture mLocalSufaceTexture;
    private PlatformViewRegistry mPlatformRegistry;
    private TRTCCloud mTRTCCloud;
    private CustomTRTCCloudListener mTRTCListener;
    private TXAudioEffectManager mTXAudioEffectManager;
    private TXBeautyManager mTXBeautyManager;
    private TXDeviceManager mTXDeviceManager;
    private TextureRegistry mTextureRegistry;
    private Map<String, TextureRegistry.SurfaceTextureEntry> mSurfaceMap = new HashMap();
    private Map<String, CustomRenderVideoFrame> mRenderMap = new HashMap();

    /* JADX INFO: renamed from: com.tencent.trtcplugin.TRTCCloudWrapper$7, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$live$beauty$custom$TXCustomBeautyDef$TXCustomBeautyBufferType;
        static final /* synthetic */ int[] $SwitchMap$com$tencent$live$beauty$custom$TXCustomBeautyDef$TXCustomBeautyPixelFormat;

        static {
            int[] iArr = new int[TXCustomBeautyDef.TXCustomBeautyBufferType.values().length];
            $SwitchMap$com$tencent$live$beauty$custom$TXCustomBeautyDef$TXCustomBeautyBufferType = iArr;
            try {
                iArr[TXCustomBeautyDef.TXCustomBeautyBufferType.TXCustomBeautyBufferTypeUnknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$live$beauty$custom$TXCustomBeautyDef$TXCustomBeautyBufferType[TXCustomBeautyDef.TXCustomBeautyBufferType.TXCustomBeautyBufferTypeByteBuffer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$live$beauty$custom$TXCustomBeautyDef$TXCustomBeautyBufferType[TXCustomBeautyDef.TXCustomBeautyBufferType.TXCustomBeautyBufferTypeByteArray.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$tencent$live$beauty$custom$TXCustomBeautyDef$TXCustomBeautyBufferType[TXCustomBeautyDef.TXCustomBeautyBufferType.TXCustomBeautyBufferTypeTexture.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[TXCustomBeautyDef.TXCustomBeautyPixelFormat.values().length];
            $SwitchMap$com$tencent$live$beauty$custom$TXCustomBeautyDef$TXCustomBeautyPixelFormat = iArr2;
            try {
                iArr2[TXCustomBeautyDef.TXCustomBeautyPixelFormat.TXCustomBeautyPixelFormatUnknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$tencent$live$beauty$custom$TXCustomBeautyDef$TXCustomBeautyPixelFormat[TXCustomBeautyDef.TXCustomBeautyPixelFormat.TXCustomBeautyPixelFormatI420.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$tencent$live$beauty$custom$TXCustomBeautyDef$TXCustomBeautyPixelFormat[TXCustomBeautyDef.TXCustomBeautyPixelFormat.TXCustomBeautyPixelFormatTexture2D.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public TRTCCloudWrapper(Context context, String str, TRTCCloud tRTCCloud, PlatformViewRegistry platformViewRegistry, TextureRegistry textureRegistry, FlutterPlugin.FlutterAssets flutterAssets, BinaryMessenger binaryMessenger) {
        this.mTRTCCloud = tRTCCloud;
        init(context, str, platformViewRegistry, textureRegistry, flutterAssets, binaryMessenger);
        this.mTRTCCloud.setListener(this.mTRTCListener);
    }

    public TRTCCloudWrapper(Context context, String str, PlatformViewRegistry platformViewRegistry, TextureRegistry textureRegistry, FlutterPlugin.FlutterAssets flutterAssets, BinaryMessenger binaryMessenger) {
        init(context, str, platformViewRegistry, textureRegistry, flutterAssets, binaryMessenger);
    }

    private void callExperimentalAPI(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.callExperimentalAPI((String) CommonUtil.getParam(methodCall, result, "jsonStr"));
        result.success(null);
    }

    private void connectOtherRoom(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.ConnectOtherRoom((String) CommonUtil.getParam(methodCall, result, RemoteMessageConst.MessageBody.PARAM));
        result.success(null);
    }

    private static int convertTRTCBufferType(TXCustomBeautyDef.TXCustomBeautyBufferType tXCustomBeautyBufferType) {
        int i10 = AnonymousClass7.$SwitchMap$com$tencent$live$beauty$custom$TXCustomBeautyDef$TXCustomBeautyBufferType[tXCustomBeautyBufferType.ordinal()];
        if (i10 == 2) {
            return 1;
        }
        if (i10 != 3) {
            return i10 != 4 ? 0 : 3;
        }
        return 2;
    }

    private static int convertTRTCPixelFormat(TXCustomBeautyDef.TXCustomBeautyPixelFormat tXCustomBeautyPixelFormat) {
        int i10 = AnonymousClass7.$SwitchMap$com$tencent$live$beauty$custom$TXCustomBeautyDef$TXCustomBeautyPixelFormat[tXCustomBeautyPixelFormat.ordinal()];
        if (i10 != 2) {
            return i10 != 3 ? 0 : 2;
        }
        return 1;
    }

    private void createSubCloud(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) CommonUtil.getParam(methodCall, result, "channelName");
        mTRTCManagerMap.put(str, new TRTCCloudWrapper(this.mContext, str, this.mTRTCCloud.createSubCloud(), this.mPlatformRegistry, this.mTextureRegistry, this.mFlutterAssets, this.mBinaryMessenger));
        result.success(null);
    }

    private void destroySharedInstance(MethodCall methodCall, MethodChannel.Result result) {
        TRTCCloud.destroySharedInstance();
        mTRTCManagerMap.remove(this.mChannelName);
        this.mTRTCCloud = null;
        this.mSurfaceMap.clear();
        this.mRenderMap.clear();
        this.mLocalCustomRender = null;
        this.mLocalSufaceTexture = null;
        result.success(null);
    }

    private void destroySubCloud(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) CommonUtil.getParam(methodCall, result, "channelName");
        mTRTCManagerMap.get(str).release(this.mTRTCCloud);
        mTRTCManagerMap.remove(str);
        result.success(null);
    }

    private void disconnectOtherRoom(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.DisconnectOtherRoom();
        result.success(null);
    }

    private void enableAudioVolumeEvaluation(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.enableAudioVolumeEvaluation(((Integer) CommonUtil.getParam(methodCall, result, "intervalMs")).intValue());
        result.success(null);
    }

    private void enableCameraAutoFocus(MethodCall methodCall, MethodChannel.Result result) {
        result.success(Integer.valueOf(this.mTXDeviceManager.enableCameraAutoFocus(((Boolean) CommonUtil.getParam(methodCall, result, "enable")).booleanValue())));
    }

    private void enableCameraTorch(MethodCall methodCall, MethodChannel.Result result) {
        result.success(Boolean.valueOf(this.mTXDeviceManager.enableCameraTorch(((Boolean) CommonUtil.getParam(methodCall, result, "enable")).booleanValue())));
    }

    private void enableEncSmallVideoStream(MethodCall methodCall, MethodChannel.Result result) {
        result.success(Integer.valueOf(this.mTRTCCloud.enableEncSmallVideoStream(((Boolean) CommonUtil.getParam(methodCall, result, "enable")).booleanValue(), (TRTCCloudDef.TRTCVideoEncParam) new Gson().fromJson((String) CommonUtil.getParam(methodCall, result, "smallVideoEncParam"), TRTCCloudDef.TRTCVideoEncParam.class))));
    }

    private void enableSharpnessEnhancement(MethodCall methodCall, MethodChannel.Result result) {
        this.mTXBeautyManager.enableSharpnessEnhancement(((Boolean) CommonUtil.getParam(methodCall, result, "enable")).booleanValue());
        result.success(null);
    }

    private void enableVoiceEarMonitor(MethodCall methodCall, MethodChannel.Result result) {
        this.mTXAudioEffectManager.enableVoiceEarMonitor(((Boolean) CommonUtil.getParam(methodCall, result, "enable")).booleanValue());
        result.success(null);
    }

    private void enterRoom(MethodCall methodCall, MethodChannel.Result result) {
        TRTCCloudDef.TRTCParams tRTCParams = new TRTCCloudDef.TRTCParams();
        tRTCParams.sdkAppId = ((Integer) CommonUtil.getParam(methodCall, result, "sdkAppId")).intValue();
        tRTCParams.userId = (String) CommonUtil.getParam(methodCall, result, "userId");
        tRTCParams.userSig = (String) CommonUtil.getParam(methodCall, result, "userSig");
        tRTCParams.roomId = (int) (Long.parseLong((String) CommonUtil.getParam(methodCall, result, "roomId")) & (-1));
        tRTCParams.strRoomId = (String) CommonUtil.getParam(methodCall, result, "strRoomId");
        tRTCParams.role = ((Integer) CommonUtil.getParam(methodCall, result, "role")).intValue();
        tRTCParams.streamId = (String) CommonUtil.getParam(methodCall, result, "streamId");
        tRTCParams.userDefineRecordId = (String) CommonUtil.getParam(methodCall, result, "userDefineRecordId");
        tRTCParams.privateMapKey = (String) CommonUtil.getParam(methodCall, result, "privateMapKey");
        tRTCParams.businessInfo = (String) CommonUtil.getParam(methodCall, result, "businessInfo");
        int iIntValue = ((Integer) CommonUtil.getParam(methodCall, result, "scene")).intValue();
        this.mTRTCCloud.callExperimentalAPI("{\"api\": \"setFramework\", \"params\": {\"framework\": 7}}");
        this.mTRTCCloud.enterRoom(tRTCParams, iIntValue);
        result.success(null);
    }

    private void exitRoom(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.exitRoom();
        this.mSurfaceMap.clear();
        this.mRenderMap.clear();
        this.mLocalCustomRender = null;
        this.mLocalSufaceTexture = null;
        result.success(null);
    }

    private void getAudioCaptureVolume(MethodCall methodCall, MethodChannel.Result result) {
        result.success(Integer.valueOf(this.mTRTCCloud.getAudioCaptureVolume()));
    }

    private void getAudioEffectManager(MethodCall methodCall, MethodChannel.Result result) {
        this.mTXAudioEffectManager = this.mTRTCCloud.getAudioEffectManager();
    }

    private void getAudioPlayoutVolume(MethodCall methodCall, MethodChannel.Result result) {
        result.success(Integer.valueOf(this.mTRTCCloud.getAudioPlayoutVolume()));
    }

    private void getBeautyManager(MethodCall methodCall, MethodChannel.Result result) {
        this.mTXBeautyManager = this.mTRTCCloud.getBeautyManager();
    }

    private void getCameraZoomMaxRatio(MethodCall methodCall, MethodChannel.Result result) {
        result.success(Float.valueOf(this.mTXDeviceManager.getCameraZoomMaxRatio()));
    }

    private void getDeviceManager(MethodCall methodCall, MethodChannel.Result result) {
        this.mTXDeviceManager = this.mTRTCCloud.getDeviceManager();
    }

    private void getMusicCurrentPosInMS(MethodCall methodCall, MethodChannel.Result result) {
        result.success(Long.valueOf(this.mTXAudioEffectManager.getMusicCurrentPosInMS(((Integer) CommonUtil.getParam(methodCall, result, "id")).intValue())));
    }

    private void getMusicDurationInMS(MethodCall methodCall, MethodChannel.Result result) {
        result.success(Long.valueOf(this.mTXAudioEffectManager.getMusicDurationInMS((String) CommonUtil.getParamCanBeNull(methodCall, result, FlutterActivityLaunchConfigs.EXTRA_PATH))));
    }

    private void getSDKVersion(MethodCall methodCall, MethodChannel.Result result) {
        result.success(TRTCCloud.getSDKVersion());
    }

    private void init(Context context, String str, PlatformViewRegistry platformViewRegistry, TextureRegistry textureRegistry, FlutterPlugin.FlutterAssets flutterAssets, BinaryMessenger binaryMessenger) {
        this.mContext = context;
        this.mChannelName = str;
        this.mPlatformRegistry = platformViewRegistry;
        this.mTextureRegistry = textureRegistry;
        this.mFlutterAssets = flutterAssets;
        this.mBinaryMessenger = binaryMessenger;
        this.mChannel = new MethodChannel(binaryMessenger, str);
        this.mBasicChannel = new BasicMessageChannel(this.mBinaryMessenger, this.mChannelName + "_basic_channel", JSONMessageCodec.INSTANCE);
        this.mTRTCListener = new CustomTRTCCloudListener(this.mChannel);
        this.mChannel.setMethodCallHandler(new MethodChannel.MethodCallHandler() { // from class: com.tencent.trtcplugin.a
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                this.f103209b.lambda$init$0(methodCall, result);
            }
        });
    }

    private void isAutoFocusEnabled(MethodCall methodCall, MethodChannel.Result result) {
        result.success(Boolean.valueOf(this.mTXDeviceManager.isAutoFocusEnabled()));
    }

    private void isFrontCamera(MethodCall methodCall, MethodChannel.Result result) {
        result.success(Boolean.valueOf(this.mTXDeviceManager.isFrontCamera()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(MethodCall methodCall, MethodChannel.Result result) {
        TXCLog.i(TRTCCloudPlugin.TAG, "TRTCCloudWrapper|channel=" + this.mChannelName + "|method=" + methodCall.method + "|arguments=" + methodCall.arguments);
        try {
            TRTCCloudWrapper.class.getDeclaredMethod(methodCall.method, MethodCall.class, MethodChannel.Result.class).invoke(this, methodCall, result);
        } catch (IllegalAccessException e10) {
            TXCLog.e(TRTCCloudPlugin.TAG, "TRTCCloudWrapper|channel=" + this.mChannelName + "|method=" + methodCall.method + "|arguments=" + methodCall.arguments + "|error=" + e10);
        } catch (NoSuchMethodException e11) {
            TXCLog.e(TRTCCloudPlugin.TAG, "TRTCCloudWrapper|channel=" + this.mChannelName + "|method=" + methodCall.method + "|arguments=" + methodCall.arguments + "|error=" + e11);
        } catch (Exception e12) {
            TXCLog.e(TRTCCloudPlugin.TAG, "TRTCCloudWrapper|channel=" + this.mChannelName + "|method=" + methodCall.method + "|arguments=" + methodCall.arguments + "|error=" + e12);
        }
    }

    private void muteAllRemoteAudio(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.muteAllRemoteAudio(((Boolean) CommonUtil.getParam(methodCall, result, "mute")).booleanValue());
        result.success(null);
    }

    private void muteAllRemoteVideoStreams(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.muteAllRemoteVideoStreams(((Boolean) CommonUtil.getParam(methodCall, result, "mute")).booleanValue());
        result.success(null);
    }

    private void muteLocalAudio(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.muteLocalAudio(((Boolean) CommonUtil.getParam(methodCall, result, "mute")).booleanValue());
        result.success(null);
    }

    private void muteLocalVideo(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.muteLocalVideo(((Boolean) CommonUtil.getParam(methodCall, result, "mute")).booleanValue());
        result.success(null);
    }

    private void muteRemoteAudio(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.muteRemoteAudio((String) CommonUtil.getParam(methodCall, result, "userId"), ((Boolean) CommonUtil.getParam(methodCall, result, "mute")).booleanValue());
        result.success(null);
    }

    private void muteRemoteVideoStream(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.muteRemoteVideoStream((String) CommonUtil.getParam(methodCall, result, "userId"), ((Boolean) CommonUtil.getParam(methodCall, result, "mute")).booleanValue());
        result.success(null);
    }

    private void pausePlayMusic(MethodCall methodCall, MethodChannel.Result result) {
        this.mTXAudioEffectManager.pausePlayMusic(((Integer) CommonUtil.getParam(methodCall, result, "id")).intValue());
        result.success(null);
    }

    private void pauseScreenCapture(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.pauseScreenCapture();
        result.success(null);
    }

    private void resumePlayMusic(MethodCall methodCall, MethodChannel.Result result) {
        this.mTXAudioEffectManager.resumePlayMusic(((Integer) CommonUtil.getParam(methodCall, result, "id")).intValue());
        result.success(null);
    }

    private void resumeScreenCapture(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.resumeScreenCapture();
        result.success(null);
    }

    private void seekMusicToPosInMS(MethodCall methodCall, MethodChannel.Result result) {
        this.mTXAudioEffectManager.seekMusicToPosInMS(((Integer) CommonUtil.getParam(methodCall, result, "id")).intValue(), ((Integer) CommonUtil.getParam(methodCall, result, "pts")).intValue());
        result.success(null);
    }

    private void sendCustomCmdMsg(MethodCall methodCall, MethodChannel.Result result) {
        int iIntValue = ((Integer) CommonUtil.getParam(methodCall, result, "cmdID")).intValue();
        String str = (String) CommonUtil.getParam(methodCall, result, "data");
        result.success(Boolean.valueOf(this.mTRTCCloud.sendCustomCmdMsg(iIntValue, str.getBytes(), ((Boolean) CommonUtil.getParam(methodCall, result, "reliable")).booleanValue(), ((Boolean) CommonUtil.getParam(methodCall, result, "ordered")).booleanValue())));
    }

    private void sendSEIMsg(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) CommonUtil.getParam(methodCall, result, "data");
        result.success(Boolean.valueOf(this.mTRTCCloud.sendSEIMsg(str.getBytes(), ((Integer) CommonUtil.getParam(methodCall, result, "repeatCount")).intValue())));
    }

    private void setAllMusicVolume(MethodCall methodCall, MethodChannel.Result result) {
        this.mTXAudioEffectManager.setAllMusicVolume(((Integer) CommonUtil.getParam(methodCall, result, com.max.xiaoheihe.module.voice.component.a.f94101q)).intValue());
        result.success(null);
    }

    private void setAudioCaptureVolume(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.setAudioCaptureVolume(((Integer) CommonUtil.getParam(methodCall, result, com.max.xiaoheihe.module.voice.component.a.f94101q)).intValue());
        result.success(null);
    }

    private void setAudioFrameListener(MethodCall methodCall, MethodChannel.Result result) {
        if (((Boolean) CommonUtil.getParamCanBeNull(methodCall, result, "isNullListener")).booleanValue()) {
            this.mAudioFrameListener = null;
            this.mTRTCCloud.setAudioFrameListener(null);
        } else {
            AudioFrameListener audioFrameListener = new AudioFrameListener(this.mBasicChannel);
            this.mAudioFrameListener = audioFrameListener;
            this.mTRTCCloud.setAudioFrameListener(audioFrameListener);
        }
    }

    private void setAudioPlayoutVolume(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.setAudioPlayoutVolume(((Integer) CommonUtil.getParam(methodCall, result, com.max.xiaoheihe.module.voice.component.a.f94101q)).intValue());
        result.success(null);
    }

    private void setAudioRoute(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.setAudioRoute(((Integer) CommonUtil.getParam(methodCall, result, "route")).intValue());
        result.success(null);
    }

    private void setBeautyLevel(MethodCall methodCall, MethodChannel.Result result) {
        this.mTXBeautyManager.setBeautyLevel(((Integer) CommonUtil.getParam(methodCall, result, "beautyLevel")).intValue());
        result.success(null);
    }

    private void setBeautyStyle(MethodCall methodCall, MethodChannel.Result result) {
        this.mTXBeautyManager.setBeautyStyle(((Integer) CommonUtil.getParam(methodCall, result, "beautyStyle")).intValue());
        result.success(null);
    }

    private void setCameraFocusPosition(MethodCall methodCall, MethodChannel.Result result) {
        this.mTXDeviceManager.setCameraFocusPosition(((Integer) CommonUtil.getParam(methodCall, result, "x")).intValue(), ((Integer) CommonUtil.getParam(methodCall, result, "y")).intValue());
        result.success(null);
    }

    private void setCameraZoomRatio(MethodCall methodCall, MethodChannel.Result result) {
        result.success(Integer.valueOf(this.mTXDeviceManager.setCameraZoomRatio(Float.parseFloat((String) CommonUtil.getParam(methodCall, result, "value")))));
    }

    private void setConsoleEnabled(MethodCall methodCall, MethodChannel.Result result) {
        TRTCCloud.setConsoleEnabled(((Boolean) CommonUtil.getParam(methodCall, result, "enabled")).booleanValue());
        result.success(null);
    }

    private void setDefaultStreamRecvMode(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.setDefaultStreamRecvMode(((Boolean) CommonUtil.getParam(methodCall, result, "autoRecvAudio")).booleanValue(), ((Boolean) CommonUtil.getParam(methodCall, result, "autoRecvVideo")).booleanValue());
        result.success(null);
    }

    private void setFilter(MethodCall methodCall, MethodChannel.Result result) {
        Bitmap bitmapDecodeStream;
        String str = (String) CommonUtil.getParam(methodCall, result, "type");
        final String str2 = (String) CommonUtil.getParam(methodCall, result, "imageUrl");
        if (str.equals(c.f1243w)) {
            new Thread() { // from class: com.tencent.trtcplugin.TRTCCloudWrapper.4
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
                        httpURLConnection.setDoInput(true);
                        httpURLConnection.connect();
                        TRTCCloudWrapper.this.mTXBeautyManager.setFilter(BitmapFactory.decodeStream(httpURLConnection.getInputStream()));
                    } catch (IOException e10) {
                        TXCLog.e(TRTCCloudPlugin.TAG, "TRTCCloudWrapper|method=setFilter|error=" + e10);
                    }
                }
            }.start();
        } else {
            try {
                if (str2.startsWith("/")) {
                    bitmapDecodeStream = BitmapFactory.decodeFile(str2);
                } else {
                    bitmapDecodeStream = BitmapFactory.decodeStream(this.mContext.getAssets().open(this.mFlutterAssets.getAssetFilePathByName(str2)));
                }
                this.mTXBeautyManager.setFilter(bitmapDecodeStream);
            } catch (Exception e10) {
                TXCLog.e(TRTCCloudPlugin.TAG, "TRTCCloudWrapper|method=setFilter|error=" + e10);
            }
        }
        result.success(null);
    }

    private void setFilterStrength(MethodCall methodCall, MethodChannel.Result result) {
        this.mTXBeautyManager.setFilterStrength(Float.parseFloat((String) CommonUtil.getParam(methodCall, result, "strength")));
        result.success(null);
    }

    private void setGSensorMode(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.setGSensorMode(((Integer) CommonUtil.getParam(methodCall, result, "mode")).intValue());
        result.success(null);
    }

    private void setLocalRenderParams(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.setLocalRenderParams((TRTCCloudDef.TRTCRenderParams) new Gson().fromJson((String) CommonUtil.getParam(methodCall, result, RemoteMessageConst.MessageBody.PARAM), TRTCCloudDef.TRTCRenderParams.class));
        result.success(null);
    }

    private void setLocalVideoRenderListener(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.startLocalPreview(((Boolean) CommonUtil.getParam(methodCall, result, "isFront")).booleanValue(), null);
        TextureRegistry.SurfaceTextureEntry surfaceTextureEntryCreateSurfaceTexture = this.mTextureRegistry.createSurfaceTexture();
        SurfaceTexture surfaceTexture = surfaceTextureEntryCreateSurfaceTexture.surfaceTexture();
        String str = (String) CommonUtil.getParam(methodCall, result, "userId");
        int iIntValue = ((Integer) CommonUtil.getParam(methodCall, result, "streamType")).intValue();
        int iIntValue2 = ((Integer) CommonUtil.getParam(methodCall, result, "width")).intValue();
        int iIntValue3 = ((Integer) CommonUtil.getParam(methodCall, result, "height")).intValue();
        surfaceTexture.setDefaultBufferSize(iIntValue2, iIntValue3);
        CustomRenderVideoFrame customRenderVideoFrame = new CustomRenderVideoFrame(str, iIntValue);
        this.mTRTCCloud.setLocalVideoRenderListener(2, 3, customRenderVideoFrame);
        customRenderVideoFrame.start(surfaceTexture, iIntValue2, iIntValue3);
        this.mSurfaceMap.put(Long.toString(surfaceTextureEntryCreateSurfaceTexture.id()), surfaceTextureEntryCreateSurfaceTexture);
        this.mRenderMap.put(Long.toString(surfaceTextureEntryCreateSurfaceTexture.id()), customRenderVideoFrame);
        this.mLocalSufaceTexture = surfaceTexture;
        this.mLocalCustomRender = customRenderVideoFrame;
        result.success(Long.valueOf(surfaceTextureEntryCreateSurfaceTexture.id()));
    }

    private void setLogCompressEnabled(MethodCall methodCall, MethodChannel.Result result) {
        TRTCCloud.setLogCompressEnabled(((Boolean) CommonUtil.getParam(methodCall, result, "enabled")).booleanValue());
        result.success(null);
    }

    private void setLogDirPath(MethodCall methodCall, MethodChannel.Result result) {
        TRTCCloud.setLogDirPath((String) CommonUtil.getParam(methodCall, result, FlutterActivityLaunchConfigs.EXTRA_PATH));
        result.success(null);
    }

    private void setLogLevel(MethodCall methodCall, MethodChannel.Result result) {
        TRTCCloud.setLogLevel(((Integer) CommonUtil.getParam(methodCall, result, "level")).intValue());
        result.success(null);
    }

    private void setMixTranscodingConfig(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) CommonUtil.getParam(methodCall, result, "config");
        if (str == "null") {
            this.mTRTCCloud.setMixTranscodingConfig(null);
        } else {
            this.mTRTCCloud.setMixTranscodingConfig((TRTCCloudDef.TRTCTranscodingConfig) new Gson().fromJson(str, TRTCCloudDef.TRTCTranscodingConfig.class));
        }
        result.success(null);
    }

    private void setMusicObserver(MethodCall methodCall, MethodChannel.Result result) {
        this.mTXAudioEffectManager.setMusicObserver(((Integer) CommonUtil.getParam(methodCall, result, "id")).intValue(), new TXAudioEffectManager.TXMusicPlayObserver() { // from class: com.tencent.trtcplugin.TRTCCloudWrapper.5
            @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
            public void onComplete(int i10, int i11) {
                TRTCCloudWrapper.this.mTRTCListener.onMusicObserverComplete(i10, i11);
            }

            @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
            public void onPlayProgress(int i10, long j10, long j11) {
                TRTCCloudWrapper.this.mTRTCListener.onMusicObserverPlayProgress(i10, j10, j11);
            }

            @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
            public void onStart(int i10, int i11) {
                TRTCCloudWrapper.this.mTRTCListener.onMusicObserverStart(i10, i11);
            }
        });
        result.success(null);
    }

    private void setMusicPitch(MethodCall methodCall, MethodChannel.Result result) {
        this.mTXAudioEffectManager.setMusicPitch(((Integer) CommonUtil.getParam(methodCall, result, "id")).intValue(), Float.parseFloat((String) CommonUtil.getParam(methodCall, result, "pitch")));
        result.success(null);
    }

    private void setMusicPlayoutVolume(MethodCall methodCall, MethodChannel.Result result) {
        this.mTXAudioEffectManager.setMusicPlayoutVolume(((Integer) CommonUtil.getParam(methodCall, result, "id")).intValue(), ((Integer) CommonUtil.getParam(methodCall, result, com.max.xiaoheihe.module.voice.component.a.f94101q)).intValue());
        result.success(null);
    }

    private void setMusicPublishVolume(MethodCall methodCall, MethodChannel.Result result) {
        this.mTXAudioEffectManager.setMusicPublishVolume(((Integer) CommonUtil.getParam(methodCall, result, "id")).intValue(), ((Integer) CommonUtil.getParam(methodCall, result, com.max.xiaoheihe.module.voice.component.a.f94101q)).intValue());
        result.success(null);
    }

    private void setMusicSpeedRate(MethodCall methodCall, MethodChannel.Result result) {
        this.mTXAudioEffectManager.setMusicSpeedRate(((Integer) CommonUtil.getParam(methodCall, result, "id")).intValue(), Float.parseFloat((String) CommonUtil.getParam(methodCall, result, "speedRate")));
        result.success(null);
    }

    private void setNetworkQosParam(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.setNetworkQosParam((TRTCCloudDef.TRTCNetworkQosParam) new Gson().fromJson((String) CommonUtil.getParam(methodCall, result, RemoteMessageConst.MessageBody.PARAM), TRTCCloudDef.TRTCNetworkQosParam.class));
        result.success(null);
    }

    private void setRemoteAudioVolume(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.setRemoteAudioVolume((String) CommonUtil.getParam(methodCall, result, "userId"), ((Integer) CommonUtil.getParam(methodCall, result, com.max.xiaoheihe.module.voice.component.a.f94101q)).intValue());
        result.success(null);
    }

    private void setRemoteRenderParams(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.setRemoteRenderParams((String) CommonUtil.getParam(methodCall, result, "userId"), ((Integer) CommonUtil.getParam(methodCall, result, "streamType")).intValue(), (TRTCCloudDef.TRTCRenderParams) new Gson().fromJson((String) CommonUtil.getParam(methodCall, result, RemoteMessageConst.MessageBody.PARAM), TRTCCloudDef.TRTCRenderParams.class));
        result.success(null);
    }

    private void setRemoteVideoRenderListener(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) CommonUtil.getParam(methodCall, result, "userId");
        int iIntValue = ((Integer) CommonUtil.getParam(methodCall, result, "streamType")).intValue();
        int iIntValue2 = ((Integer) CommonUtil.getParam(methodCall, result, "width")).intValue();
        int iIntValue3 = ((Integer) CommonUtil.getParam(methodCall, result, "height")).intValue();
        this.mTRTCCloud.startRemoteView(str, iIntValue, null);
        TextureRegistry.SurfaceTextureEntry surfaceTextureEntryCreateSurfaceTexture = this.mTextureRegistry.createSurfaceTexture();
        SurfaceTexture surfaceTexture = surfaceTextureEntryCreateSurfaceTexture.surfaceTexture();
        surfaceTexture.setDefaultBufferSize(iIntValue2, iIntValue3);
        CustomRenderVideoFrame customRenderVideoFrame = new CustomRenderVideoFrame(str, iIntValue);
        this.mTRTCCloud.setRemoteVideoRenderListener(str, 2, 3, customRenderVideoFrame);
        customRenderVideoFrame.start(surfaceTexture, iIntValue2, iIntValue3);
        this.mSurfaceMap.put(Long.toString(surfaceTextureEntryCreateSurfaceTexture.id()), surfaceTextureEntryCreateSurfaceTexture);
        this.mRenderMap.put(Long.toString(surfaceTextureEntryCreateSurfaceTexture.id()), customRenderVideoFrame);
        result.success(Long.valueOf(surfaceTextureEntryCreateSurfaceTexture.id()));
    }

    private void setRemoteVideoStreamType(MethodCall methodCall, MethodChannel.Result result) {
        result.success(Integer.valueOf(this.mTRTCCloud.setRemoteVideoStreamType((String) CommonUtil.getParam(methodCall, result, "userId"), ((Integer) CommonUtil.getParam(methodCall, result, "streamType")).intValue())));
    }

    private void setRuddyLevel(MethodCall methodCall, MethodChannel.Result result) {
        this.mTXBeautyManager.setRuddyLevel(((Integer) CommonUtil.getParam(methodCall, result, "ruddyLevel")).intValue());
        result.success(null);
    }

    private void setSystemVolumeType(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.setSystemVolumeType(((Integer) CommonUtil.getParam(methodCall, result, "type")).intValue());
        result.success(null);
    }

    private void setVideoEncoderMirror(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.setVideoEncoderMirror(((Boolean) CommonUtil.getParam(methodCall, result, "mirror")).booleanValue());
        result.success(null);
    }

    private void setVideoEncoderParam(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.setVideoEncoderParam((TRTCCloudDef.TRTCVideoEncParam) new Gson().fromJson((String) CommonUtil.getParam(methodCall, result, RemoteMessageConst.MessageBody.PARAM), TRTCCloudDef.TRTCVideoEncParam.class));
        result.success(null);
    }

    private void setVideoEncoderRotation(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.setVideoEncoderRotation(((Integer) CommonUtil.getParam(methodCall, result, f.f18721i)).intValue());
        result.success(null);
    }

    private void setVideoMuteImage(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) CommonUtil.getParam(methodCall, result, "type");
        final String str2 = (String) CommonUtil.getParamCanBeNull(methodCall, result, "imageUrl");
        final int iIntValue = ((Integer) CommonUtil.getParam(methodCall, result, "fps")).intValue();
        if (str2 == null) {
            this.mTRTCCloud.setVideoMuteImage(null, iIntValue);
        } else if (str.equals(c.f1243w)) {
            new Thread() { // from class: com.tencent.trtcplugin.TRTCCloudWrapper.2
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
                        httpURLConnection.setDoInput(true);
                        httpURLConnection.connect();
                        TRTCCloudWrapper.this.mTRTCCloud.setVideoMuteImage(BitmapFactory.decodeStream(httpURLConnection.getInputStream()), iIntValue);
                    } catch (IOException e10) {
                        TXCLog.e(TRTCCloudPlugin.TAG, "TRTCCloudWrapper|method=setVideoMuteImage|error=" + e10);
                    }
                }
            }.start();
        } else {
            try {
                this.mTRTCCloud.setVideoMuteImage(BitmapFactory.decodeStream(this.mContext.getAssets().open(this.mFlutterAssets.getAssetFilePathByName(str2))), iIntValue);
            } catch (Exception e10) {
                TXCLog.e(TRTCCloudPlugin.TAG, "TRTCCloudWrapper|method=setVideoMuteImage|error=" + e10);
            }
        }
        result.success(null);
    }

    private void setVoiceCaptureVolume(MethodCall methodCall, MethodChannel.Result result) {
        this.mTXAudioEffectManager.setVoiceCaptureVolume(((Integer) CommonUtil.getParam(methodCall, result, com.max.xiaoheihe.module.voice.component.a.f94101q)).intValue());
        result.success(null);
    }

    private void setVoiceChangerType(MethodCall methodCall, MethodChannel.Result result) {
        int iIntValue = ((Integer) CommonUtil.getParam(methodCall, result, "type")).intValue();
        TXAudioEffectManager.TXVoiceChangerType tXVoiceChangerType = TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_0;
        switch (iIntValue) {
            case 1:
                tXVoiceChangerType = TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_1;
                break;
            case 2:
                tXVoiceChangerType = TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_2;
                break;
            case 3:
                tXVoiceChangerType = TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_3;
                break;
            case 4:
                tXVoiceChangerType = TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_4;
                break;
            case 5:
                tXVoiceChangerType = TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_5;
                break;
            case 6:
                tXVoiceChangerType = TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_6;
                break;
            case 7:
                tXVoiceChangerType = TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_7;
                break;
            case 8:
                tXVoiceChangerType = TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_8;
                break;
            case 9:
                tXVoiceChangerType = TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_9;
                break;
            case 10:
                tXVoiceChangerType = TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_10;
                break;
            case 11:
                tXVoiceChangerType = TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_11;
                break;
        }
        this.mTXAudioEffectManager.setVoiceChangerType(tXVoiceChangerType);
        result.success(null);
    }

    private void setVoiceEarMonitorVolume(MethodCall methodCall, MethodChannel.Result result) {
        this.mTXAudioEffectManager.setVoiceEarMonitorVolume(((Integer) CommonUtil.getParam(methodCall, result, com.max.xiaoheihe.module.voice.component.a.f94101q)).intValue());
        result.success(null);
    }

    private void setVoicePitch(MethodCall methodCall, MethodChannel.Result result) {
        this.mTXAudioEffectManager.setVoicePitch(((Double) CommonUtil.getParam(methodCall, result, "pitch")).doubleValue());
        result.success(null);
    }

    private void setVoiceReverbType(MethodCall methodCall, MethodChannel.Result result) {
        int iIntValue = ((Integer) CommonUtil.getParam(methodCall, result, "type")).intValue();
        TXAudioEffectManager.TXVoiceReverbType tXVoiceReverbType = TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_0;
        switch (iIntValue) {
            case 1:
                tXVoiceReverbType = TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_1;
                break;
            case 2:
                tXVoiceReverbType = TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_2;
                break;
            case 3:
                tXVoiceReverbType = TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_3;
                break;
            case 4:
                tXVoiceReverbType = TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_4;
                break;
            case 5:
                tXVoiceReverbType = TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_5;
                break;
            case 6:
                tXVoiceReverbType = TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_6;
                break;
            case 7:
                tXVoiceReverbType = TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_7;
                break;
            case 8:
                tXVoiceReverbType = TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_8;
                break;
            case 9:
                tXVoiceReverbType = TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_9;
                break;
            case 10:
                tXVoiceReverbType = TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_10;
                break;
            case 11:
                tXVoiceReverbType = TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_11;
                break;
        }
        this.mTXAudioEffectManager.setVoiceReverbType(tXVoiceReverbType);
        result.success(null);
    }

    private void setWatermark(MethodCall methodCall, MethodChannel.Result result) {
        Bitmap bitmapDecodeStream;
        final String str = (String) CommonUtil.getParam(methodCall, result, "imageUrl");
        String str2 = (String) CommonUtil.getParam(methodCall, result, "type");
        final int iIntValue = ((Integer) CommonUtil.getParam(methodCall, result, "streamType")).intValue();
        final float f10 = Float.parseFloat((String) CommonUtil.getParam(methodCall, result, "x"));
        final float f11 = Float.parseFloat((String) CommonUtil.getParam(methodCall, result, "y"));
        final float f12 = Float.parseFloat((String) CommonUtil.getParam(methodCall, result, "width"));
        if (str2.equals(c.f1243w)) {
            new Thread() { // from class: com.tencent.trtcplugin.TRTCCloudWrapper.3
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                        httpURLConnection.setDoInput(true);
                        httpURLConnection.connect();
                        TRTCCloudWrapper.this.mTRTCCloud.setWatermark(BitmapFactory.decodeStream(httpURLConnection.getInputStream()), iIntValue, f10, f11, f12);
                    } catch (IOException e10) {
                        TXCLog.e(TRTCCloudPlugin.TAG, "TRTCCloudWrapper|method=setWatermark|error=" + e10);
                    }
                }
            }.start();
        } else {
            try {
                if (str.startsWith("/")) {
                    bitmapDecodeStream = BitmapFactory.decodeFile(str);
                } else {
                    bitmapDecodeStream = BitmapFactory.decodeStream(this.mContext.getAssets().open(this.mFlutterAssets.getAssetFilePathByName(str)));
                }
                this.mTRTCCloud.setWatermark(bitmapDecodeStream, iIntValue, f10, f11, f12);
            } catch (Exception e10) {
                TXCLog.e(TRTCCloudPlugin.TAG, "TRTCCloudWrapper|method=setWatermark|error=" + e10);
            }
        }
        result.success(null);
    }

    private void setWhitenessLevel(MethodCall methodCall, MethodChannel.Result result) {
        this.mTXBeautyManager.setWhitenessLevel(((Integer) CommonUtil.getParam(methodCall, result, "whitenessLevel")).intValue());
        result.success(null);
    }

    private void sharedInstance(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud = TRTCCloud.sharedInstance(this.mContext);
        mTRTCManagerMap.put(this.mChannelName, this);
        this.mTRTCCloud.setListener(this.mTRTCListener);
        result.success(null);
    }

    private void showDebugView(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.showDebugView(((Integer) CommonUtil.getParam(methodCall, result, "mode")).intValue());
        result.success(null);
    }

    private void snapshotVideo(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) CommonUtil.getParamCanBeNull(methodCall, result, "userId");
        int iIntValue = ((Integer) CommonUtil.getParam(methodCall, result, "streamType")).intValue();
        ((Integer) CommonUtil.getParam(methodCall, result, "sourceType")).intValue();
        final String str2 = (String) CommonUtil.getParam(methodCall, result, FlutterActivityLaunchConfigs.EXTRA_PATH);
        this.mTRTCCloud.snapshotVideo(str, iIntValue, new TRTCCloudListener.TRTCSnapshotListener() { // from class: com.tencent.trtcplugin.TRTCCloudWrapper.1
            @Override // com.tencent.trtc.TRTCCloudListener.TRTCSnapshotListener
            public void onSnapshotComplete(Bitmap bitmap) {
                try {
                    String[] strArrSplit = str2.split("\\.");
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                    if (strArrSplit[strArrSplit.length - 1].equals("jpg")) {
                        compressFormat = Bitmap.CompressFormat.JPEG;
                    } else if (strArrSplit[strArrSplit.length - 1].equals("webp")) {
                        compressFormat = Bitmap.CompressFormat.WEBP;
                    }
                    if (bitmap.compress(compressFormat, 100, new FileOutputStream(str2))) {
                        TRTCCloudWrapper.this.mTRTCListener.onSnapshotComplete(0, "success", str2);
                    } else {
                        TRTCCloudWrapper.this.mTRTCListener.onSnapshotComplete(-101, "bitmap compress failed", null);
                    }
                } catch (FileNotFoundException e10) {
                    TXCLog.e(TRTCCloudPlugin.TAG, "TRTCCloudWrapper|method=snapshotVideo|error=" + e10);
                    TRTCCloudWrapper.this.mTRTCListener.onSnapshotComplete(-102, e10.toString(), null);
                } catch (Exception e11) {
                    TXCLog.e(TRTCCloudPlugin.TAG, "TRTCCloudWrapper|method=snapshotVideo|error=" + e11);
                    TRTCCloudWrapper.this.mTRTCListener.onSnapshotComplete(-103, e11.toString(), null);
                }
            }
        });
        result.success(null);
    }

    private void startAudioRecording(MethodCall methodCall, MethodChannel.Result result) {
        result.success(Integer.valueOf(this.mTRTCCloud.startAudioRecording((TRTCCloudDef.TRTCAudioRecordingParams) new Gson().fromJson((String) CommonUtil.getParam(methodCall, result, RemoteMessageConst.MessageBody.PARAM), TRTCCloudDef.TRTCAudioRecordingParams.class))));
    }

    private void startLocalAudio(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.startLocalAudio(((Integer) CommonUtil.getParam(methodCall, result, "quality")).intValue());
        result.success(null);
    }

    private void startLocalPreview(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.startLocalPreview(((Boolean) CommonUtil.getParam(methodCall, result, "isFront")).booleanValue(), null);
        result.success(null);
    }

    private void startLocalRecording(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.startLocalRecording((TRTCCloudDef.TRTCLocalRecordingParams) new Gson().fromJson((String) CommonUtil.getParam(methodCall, result, RemoteMessageConst.MessageBody.PARAM), TRTCCloudDef.TRTCLocalRecordingParams.class));
        result.success(null);
    }

    private void startPlayMusic(MethodCall methodCall, MethodChannel.Result result) {
        TXAudioEffectManager.AudioMusicParam audioMusicParam = (TXAudioEffectManager.AudioMusicParam) new Gson().fromJson((String) CommonUtil.getParam(methodCall, result, "musicParam"), TXAudioEffectManager.AudioMusicParam.class);
        result.success(Boolean.valueOf(this.mTXAudioEffectManager.startPlayMusic(audioMusicParam)));
        this.mTXAudioEffectManager.setMusicObserver(audioMusicParam.f99526id, new TXAudioEffectManager.TXMusicPlayObserver() { // from class: com.tencent.trtcplugin.TRTCCloudWrapper.6
            @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
            public void onComplete(int i10, int i11) {
                TRTCCloudWrapper.this.mTRTCListener.onMusicObserverComplete(i10, i11);
            }

            @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
            public void onPlayProgress(int i10, long j10, long j11) {
                TRTCCloudWrapper.this.mTRTCListener.onMusicObserverPlayProgress(i10, j10, j11);
            }

            @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
            public void onStart(int i10, int i11) {
                TRTCCloudWrapper.this.mTRTCListener.onMusicObserverStart(i10, i11);
            }
        });
    }

    private void startPublishCDNStream(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.startPublishCDNStream((TRTCCloudDef.TRTCPublishCDNParam) new Gson().fromJson((String) CommonUtil.getParam(methodCall, result, RemoteMessageConst.MessageBody.PARAM), TRTCCloudDef.TRTCPublishCDNParam.class));
        result.success(null);
    }

    private void startPublishMediaStream(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.startPublishMediaStream(ObjectUtils.getTRTCPublishTargetFromMap((Map) CommonUtil.getParamCanBeNull(methodCall, result, "target")), ObjectUtils.getTRTCStreamEncoderParamFromMap((Map) CommonUtil.getParamCanBeNull(methodCall, result, RemoteMessageConst.MessageBody.PARAM)), ObjectUtils.getTRTCStreamMixingConfigFromMap((Map) CommonUtil.getParamCanBeNull(methodCall, result, "config")));
        result.success(null);
    }

    private void startPublishing(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.startPublishing((String) CommonUtil.getParam(methodCall, result, "streamId"), ((Integer) CommonUtil.getParam(methodCall, result, "streamType")).intValue());
        result.success(null);
    }

    private void startRemoteView(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.startRemoteView((String) CommonUtil.getParam(methodCall, result, "userId"), ((Integer) CommonUtil.getParam(methodCall, result, "streamType")).intValue(), null);
        result.success(null);
    }

    private void startScreenCapture(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.startScreenCapture(((Integer) CommonUtil.getParam(methodCall, result, "streamType")).intValue(), (TRTCCloudDef.TRTCVideoEncParam) new Gson().fromJson((String) CommonUtil.getParam(methodCall, result, "encParams"), TRTCCloudDef.TRTCVideoEncParam.class), null);
        result.success(null);
    }

    private void startSpeedTest(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.startSpeedTest(((Integer) CommonUtil.getParam(methodCall, result, "sdkAppId")).intValue(), (String) CommonUtil.getParam(methodCall, result, "userId"), (String) CommonUtil.getParam(methodCall, result, "userSig"));
        result.success(null);
    }

    private void startSpeedTestWithParams(MethodCall methodCall, MethodChannel.Result result) {
        Map map = (Map) CommonUtil.getParam(methodCall, result, "params");
        TRTCCloudDef.TRTCSpeedTestParams tRTCSpeedTestParams = new TRTCCloudDef.TRTCSpeedTestParams();
        tRTCSpeedTestParams.sdkAppId = map.get("sdkAppId") != null ? ((Integer) map.get("sdkAppId")).intValue() : 0;
        tRTCSpeedTestParams.userId = map.get("userId") != null ? (String) map.get("userId") : "";
        tRTCSpeedTestParams.userSig = map.get("userSig") != null ? (String) map.get("userSig") : "";
        tRTCSpeedTestParams.expectedUpBandwidth = map.get("expectedUpBandwidth") != null ? ((Integer) map.get("expectedUpBandwidth")).intValue() : 0;
        tRTCSpeedTestParams.expectedDownBandwidth = map.get("expectedDownBandwidth") != null ? ((Integer) map.get("expectedDownBandwidth")).intValue() : 0;
        tRTCSpeedTestParams.scene = map.get("scene") != null ? ((Integer) map.get("scene")).intValue() : 0;
        result.success(Integer.valueOf(this.mTRTCCloud.startSpeedTest(tRTCSpeedTestParams)));
    }

    private void startSystemAudioLoopback(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.startSystemAudioLoopback();
        result.success(null);
    }

    private void stopAllRemoteView(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.stopAllRemoteView();
        result.success(null);
    }

    private void stopAudioRecording(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.stopAudioRecording();
        result.success(null);
    }

    private void stopLocalAudio(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.stopLocalAudio();
        result.success(null);
    }

    private void stopLocalPreview(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.stopLocalPreview();
        result.success(null);
    }

    private void stopLocalRecording(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.stopLocalRecording();
        result.success(null);
    }

    private void stopPlayMusic(MethodCall methodCall, MethodChannel.Result result) {
        this.mTXAudioEffectManager.stopPlayMusic(((Integer) CommonUtil.getParam(methodCall, result, "id")).intValue());
        result.success(null);
    }

    private void stopPublishCDNStream(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.stopPublishCDNStream();
        result.success(null);
    }

    private void stopPublishMediaStream(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.stopPublishMediaStream((String) CommonUtil.getParamCanBeNull(methodCall, result, "taskId"));
        result.success(null);
    }

    private void stopPublishing(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.stopPublishing();
        result.success(null);
    }

    private void stopRemoteView(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.stopRemoteView((String) CommonUtil.getParam(methodCall, result, "userId"), ((Integer) CommonUtil.getParam(methodCall, result, "streamType")).intValue());
        result.success(null);
    }

    private void stopScreenCapture(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.stopScreenCapture();
        result.success(null);
    }

    private void stopSpeedTest(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.stopSpeedTest();
        result.success(null);
    }

    private void stopSystemAudioLoopback(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.stopSystemAudioLoopback();
        result.success(null);
    }

    private void switchCamera(MethodCall methodCall, MethodChannel.Result result) {
        result.success(Integer.valueOf(this.mTXDeviceManager.switchCamera(((Boolean) CommonUtil.getParam(methodCall, result, "isFrontCamera")).booleanValue())));
    }

    private void switchRole(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.switchRole(((Integer) CommonUtil.getParam(methodCall, result, "role")).intValue());
        result.success(null);
    }

    private void switchRoom(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.switchRoom((TRTCCloudDef.TRTCSwitchRoomConfig) new Gson().fromJson((String) CommonUtil.getParam(methodCall, result, "config"), TRTCCloudDef.TRTCSwitchRoomConfig.class));
        result.success(null);
    }

    private void unregisterTexture(MethodCall methodCall, MethodChannel.Result result) {
        int iIntValue = ((Integer) CommonUtil.getParam(methodCall, result, "textureID")).intValue();
        TextureRegistry.SurfaceTextureEntry surfaceTextureEntry = this.mSurfaceMap.get(String.valueOf(iIntValue));
        CustomRenderVideoFrame customRenderVideoFrame = this.mRenderMap.get(String.valueOf(iIntValue));
        if (surfaceTextureEntry != null) {
            surfaceTextureEntry.release();
            this.mSurfaceMap.remove(String.valueOf(iIntValue));
        }
        if (customRenderVideoFrame != null) {
            customRenderVideoFrame.stop();
            this.mRenderMap.remove(String.valueOf(iIntValue));
        }
        result.success(null);
    }

    private void updateLocalVideoRender(MethodCall methodCall, MethodChannel.Result result) {
        int iIntValue = ((Integer) CommonUtil.getParam(methodCall, result, "width")).intValue();
        int iIntValue2 = ((Integer) CommonUtil.getParam(methodCall, result, "height")).intValue();
        this.mLocalSufaceTexture.setDefaultBufferSize(iIntValue, iIntValue2);
        this.mLocalCustomRender.updateSize(iIntValue, iIntValue2);
        result.success(null);
    }

    private void updatePublishMediaStream(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.updatePublishMediaStream((String) CommonUtil.getParamCanBeNull(methodCall, result, "taskId"), ObjectUtils.getTRTCPublishTargetFromMap((Map) CommonUtil.getParamCanBeNull(methodCall, result, "target")), ObjectUtils.getTRTCStreamEncoderParamFromMap((Map) CommonUtil.getParamCanBeNull(methodCall, result, "encoderParam")), ObjectUtils.getTRTCStreamMixingConfigFromMap((Map) CommonUtil.getParamCanBeNull(methodCall, result, "mixingConfig")));
        result.success(null);
    }

    private void updateRemoteVideoRender(MethodCall methodCall, MethodChannel.Result result) {
        int iIntValue = ((Integer) CommonUtil.getParam(methodCall, result, "width")).intValue();
        int iIntValue2 = ((Integer) CommonUtil.getParam(methodCall, result, "height")).intValue();
        int iIntValue3 = ((Integer) CommonUtil.getParam(methodCall, result, "textureID")).intValue();
        TextureRegistry.SurfaceTextureEntry surfaceTextureEntry = this.mSurfaceMap.get(String.valueOf(iIntValue3));
        CustomRenderVideoFrame customRenderVideoFrame = this.mRenderMap.get(String.valueOf(iIntValue3));
        this.mLocalSufaceTexture.setDefaultBufferSize(iIntValue, iIntValue2);
        if (surfaceTextureEntry != null) {
            surfaceTextureEntry.surfaceTexture().setDefaultBufferSize(iIntValue, iIntValue2);
        }
        if (customRenderVideoFrame != null) {
            customRenderVideoFrame.updateSize(iIntValue, iIntValue2);
        }
        result.success(null);
    }

    public void enableCustomVideoProcess(MethodCall methodCall, MethodChannel.Result result) {
        boolean zBooleanValue = ((Boolean) CommonUtil.getParam(methodCall, result, "enable")).booleanValue();
        ITXCustomBeautyProcesserFactory beautyProcesserFactory = TRTCCloudPlugin.getBeautyProcesserFactory();
        if (this.mCustomBeautyProcesser == null) {
            this.mCustomBeautyProcesser = beautyProcesserFactory.createCustomBeautyProcesser();
        }
        TXCustomBeautyDef.TXCustomBeautyBufferType supportedBufferType = this.mCustomBeautyProcesser.getSupportedBufferType();
        TXCustomBeautyDef.TXCustomBeautyPixelFormat supportedPixelFormat = this.mCustomBeautyProcesser.getSupportedPixelFormat();
        if (zBooleanValue) {
            result.success(Integer.valueOf(this.mTRTCCloud.setLocalVideoProcessListener(convertTRTCPixelFormat(supportedPixelFormat), convertTRTCBufferType(supportedBufferType), new ProcessVideoFrame(this.mCustomBeautyProcesser))));
        } else {
            int localVideoProcessListener = this.mTRTCCloud.setLocalVideoProcessListener(convertTRTCPixelFormat(supportedPixelFormat), convertTRTCBufferType(supportedBufferType), null);
            beautyProcesserFactory.destroyCustomBeautyProcesser();
            this.mCustomBeautyProcesser = null;
            result.success(Integer.valueOf(localVideoProcessListener));
        }
    }

    public TRTCCloud getTRTCCloud() {
        return this.mTRTCCloud;
    }

    public void release(TRTCCloud tRTCCloud) {
        tRTCCloud.destroySubCloud(this.mTRTCCloud);
        this.mChannel.setMethodCallHandler(null);
        this.mTRTCCloud = null;
        this.mSurfaceMap.clear();
        this.mRenderMap.clear();
        this.mLocalCustomRender = null;
        this.mLocalSufaceTexture = null;
        this.mTRTCListener.release();
        this.mTRTCListener = null;
        this.mChannel = null;
        this.mChannelName = null;
    }
}
