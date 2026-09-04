package com.ss.bytertc.engine.engineimpl;

import android.content.Context;
import android.content.Intent;
import android.opengl.EGLContext;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.n0;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.EglBase14;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.utils.RtcContextUtils;
import com.ss.bytertc.engine.AudioEffectPlayer;
import com.ss.bytertc.engine.AudioMixingManager;
import com.ss.bytertc.engine.IAudioFrameObserver;
import com.ss.bytertc.engine.IAudioFrameProcessor;
import com.ss.bytertc.engine.IMetadataObserver;
import com.ss.bytertc.engine.IRTCAudioDeviceManager;
import com.ss.bytertc.engine.IRTCAudioDeviceManagerEx;
import com.ss.bytertc.engine.InternalCloudProxyInfo;
import com.ss.bytertc.engine.InternalLocalProxyConfiguration;
import com.ss.bytertc.engine.InternalMediaTypeEnhancementConfig;
import com.ss.bytertc.engine.InternalScreenVideoEncoderConfig;
import com.ss.bytertc.engine.InternalVideoCaptureConfig;
import com.ss.bytertc.engine.InternalVideoEncoderConfig;
import com.ss.bytertc.engine.InternalVideoSourceConfig;
import com.ss.bytertc.engine.InternalVideoStreamDescription;
import com.ss.bytertc.engine.NativeRTCVideoFunctions;
import com.ss.bytertc.engine.NativeRTCVideoFunctionsEx;
import com.ss.bytertc.engine.NetworkTimeInfo;
import com.ss.bytertc.engine.RTCAudioDeviceManager;
import com.ss.bytertc.engine.RTCAudioDeviceManagerEx;
import com.ss.bytertc.engine.RTCRoom;
import com.ss.bytertc.engine.RTCRoomEx;
import com.ss.bytertc.engine.RTCRoomImpl;
import com.ss.bytertc.engine.RTCVideo;
import com.ss.bytertc.engine.RTCVideoEx;
import com.ss.bytertc.engine.RemoteVideoRenderConfig;
import com.ss.bytertc.engine.RtcMediaPlayer;
import com.ss.bytertc.engine.ScreenVideoEncoderConfig;
import com.ss.bytertc.engine.SingScoringManager;
import com.ss.bytertc.engine.VideoCanvas;
import com.ss.bytertc.engine.VideoDeviceManager;
import com.ss.bytertc.engine.VideoEncoderConfig;
import com.ss.bytertc.engine.VideoStreamDescription;
import com.ss.bytertc.engine.adapter.VideoSinkAdapter;
import com.ss.bytertc.engine.adapter.VideoSinkTask;
import com.ss.bytertc.engine.audio.IAudioEffectPlayer;
import com.ss.bytertc.engine.audio.IAudioMixingManager;
import com.ss.bytertc.engine.audio.IMediaPlayer;
import com.ss.bytertc.engine.audio.ISingScoringManager;
import com.ss.bytertc.engine.data.AlphaLayout;
import com.ss.bytertc.engine.data.AudioAlignmentMode;
import com.ss.bytertc.engine.data.AudioContentTypeConfig;
import com.ss.bytertc.engine.data.AudioEncodeConfig;
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
import com.ss.bytertc.engine.data.MirrorType;
import com.ss.bytertc.engine.data.MuteState;
import com.ss.bytertc.engine.data.RTCASRConfig;
import com.ss.bytertc.engine.data.RTCData;
import com.ss.bytertc.engine.data.RTCLogConfig;
import com.ss.bytertc.engine.data.RecordingConfig;
import com.ss.bytertc.engine.data.RemoteMirrorType;
import com.ss.bytertc.engine.data.RemoteStreamKey;
import com.ss.bytertc.engine.data.ReturnStatus;
import com.ss.bytertc.engine.data.SEICountPerFrame;
import com.ss.bytertc.engine.data.ScreenMediaType;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.StreamKey;
import com.ss.bytertc.engine.data.StreamPriority;
import com.ss.bytertc.engine.data.StreamSycnInfoConfig;
import com.ss.bytertc.engine.data.VideoDenoiseMode;
import com.ss.bytertc.engine.data.VideoFrameType;
import com.ss.bytertc.engine.data.VideoOrientation;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.data.VideoRotation;
import com.ss.bytertc.engine.data.VideoRotationMode;
import com.ss.bytertc.engine.data.VideoSourceType;
import com.ss.bytertc.engine.data.VideoSuperResolutionMode;
import com.ss.bytertc.engine.data.VirtualBackgroundSource;
import com.ss.bytertc.engine.data.ZoomConfigType;
import com.ss.bytertc.engine.data.ZoomDirectionType;
import com.ss.bytertc.engine.handler.IExternalVideoEncoderEventHandler;
import com.ss.bytertc.engine.handler.IRTCASREngineEventHandler;
import com.ss.bytertc.engine.handler.IRTCEngineInternalP2PEventHandler;
import com.ss.bytertc.engine.handler.IRTCVideoEventHandler;
import com.ss.bytertc.engine.handler.IRTCVideoEventHandlerEx;
import com.ss.bytertc.engine.handler.RTCASREngineEventHandler;
import com.ss.bytertc.engine.handler.RTCAudioDeviceEventHandler;
import com.ss.bytertc.engine.handler.RTCEncryptHandler;
import com.ss.bytertc.engine.handler.RTCEngineInternalP2PEventHandler;
import com.ss.bytertc.engine.handler.RTCExternalVideoEncoderEventHandler;
import com.ss.bytertc.engine.handler.RTCLocalEncodedVideoFrameObserver;
import com.ss.bytertc.engine.handler.RTCRemoteEncodedVideoFrameObserver;
import com.ss.bytertc.engine.handler.RTCVideoEventHandler;
import com.ss.bytertc.engine.handler.RTCVideoProcessor;
import com.ss.bytertc.engine.live.ChorusCacheSyncConfig;
import com.ss.bytertc.engine.live.ChorusCacheSyncObserver;
import com.ss.bytertc.engine.live.IChorusCacheSyncObserver;
import com.ss.bytertc.engine.live.ILiveTranscodingObserver;
import com.ss.bytertc.engine.live.IMixedStreamObserver;
import com.ss.bytertc.engine.live.IPushSingleStreamToCDNObserver;
import com.ss.bytertc.engine.live.LiveTranscoding;
import com.ss.bytertc.engine.live.LiveTranscodingObserver;
import com.ss.bytertc.engine.live.MixedStreamConfig;
import com.ss.bytertc.engine.live.PushMixedStreamToCDNObserver;
import com.ss.bytertc.engine.live.PushSingleStreamParam;
import com.ss.bytertc.engine.live.PushSingleStreamToCDNObserver;
import com.ss.bytertc.engine.loader.RTCNativeLibraryListenerImpl;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoader;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderInfo;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderListener;
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
import com.ss.bytertc.engine.type.ErrorCode;
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
import com.ss.bytertc.engine.utils.AppMonitor;
import com.ss.bytertc.engine.utils.AudioFrame;
import com.ss.bytertc.engine.utils.LogRecover;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.engine.utils.VideoFrameConverter;
import com.ss.bytertc.engine.video.AmazingEffect;
import com.ss.bytertc.engine.video.ByteWatermark;
import com.ss.bytertc.engine.video.IAmazingEffect;
import com.ss.bytertc.engine.video.IFaceDetectionObserver;
import com.ss.bytertc.engine.video.ISnapshotResultCallback;
import com.ss.bytertc.engine.video.IVideoDeviceManager;
import com.ss.bytertc.engine.video.IVideoEffect;
import com.ss.bytertc.engine.video.IVideoProcessor;
import com.ss.bytertc.engine.video.IVideoSink;
import com.ss.bytertc.engine.video.LocalVideoSinkConfig;
import com.ss.bytertc.engine.video.RTCVideoEffect;
import com.ss.bytertc.engine.video.RTCWatermarkConfig;
import com.ss.bytertc.engine.video.RemoteVideoSinkConfig;
import com.ss.bytertc.engine.video.VideoCaptureConfig;
import com.ss.bytertc.engine.video.VideoDecoderConfig;
import com.ss.bytertc.engine.video.VideoEffectExpressionConfig;
import com.ss.bytertc.engine.video.VideoEncoderConfiguration;
import com.ss.bytertc.engine.video.VideoFrame;
import com.ss.bytertc.engine.video.VideoPreprocessorConfig;
import com.ss.bytertc.engine.video.builder.GLTextureVideoFrameBuilder;
import com.ss.bytertc.ktv.IKTVManager;
import com.ss.bytertc.ktv.KTVManagerImpl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class RTCVideoImpl extends RTCVideoEx {
    protected static final String TAG = "RtcVideoImpl";
    private static WeakReference<IRTCAudioDeviceManagerEx.IRTCAudioDeviceEventHandler> mAudioDeviceManagerEventHandler = null;
    private static boolean mLibraryLoaded = false;
    private static final String nativeLibraryPrefix = "lib";
    private static final String nativeLibrarySurffix = ".so";
    private static final String sSoLibraryName = "volcenginertc";
    private AppMonitor.Callback appStateCallback;
    private boolean isExEngine;
    private RTCVideoEffect mAdvanceVideoEffect;
    private AmazingEffect mAmazingEffect;
    private RTCAudioDeviceManager mAudioDeviceManagerInterval;
    private AudioEffectPlayer mAudioEffectPlayer;
    private AudioMixingManager mAudioMixingManager;
    private ChorusCacheSyncObserver mChorusObserver;
    private Context mContext;
    private EglBase.Context mEglBaseCtx;
    private Handler mEglHandler;
    private HandlerThread mEglThread;
    private boolean mEnableTranscode;
    private RTCVideoEventHandler mEngineEventHandler;
    private RTCEngineInternalP2PEventHandler mEngineInternalP2PEventHandler;
    private IExternalVideoEncoderEventHandler mExternalVideoEncoderHandler;
    private boolean mIsFront;
    private boolean mIsUseCustomEglEnv;
    private final ReentrantReadWriteLock.ReadLock mJniReadLock;
    private final ReentrantReadWriteLock.WriteLock mJniWriteLock;
    private KTVManagerImpl mKTVManager;
    private LiveTranscoding mLiveTranscoding;
    private ILiveTranscodingObserver mLiveTranscodingObserver;
    private ILocalEncodedVideoFrameObserver mLocalEncodedVideoFrameObserver;
    private LogUtil.ILoggerSink mLoggerSink;
    private IMetadataObserver mMetadataObserver;
    private PushMixedStreamToCDNObserver mMixedStreamToCDNObserver;
    protected long mNativeEngine;
    private Runnable mOnDestroyCompletedCallback;
    private RTCASREngineEventHandler mRTCASREngineEventHandler;
    private final ReentrantReadWriteLock mReadWriteLock;
    private IRemoteEncodedVideoFrameObserver mRemoteEncodedVideoFrameObserver;
    private List<RTCRoomImpl> mRoomLists;
    private EglBase mRootEglBase;
    private IRTCVideoEventHandler mRtcEngineHandler;
    private IRTCVideoEventHandlerEx mRtcEngineHandlerEx;
    private RTCExternalVideoEncoderEventHandler mRtcExVideoEncoderHandler;
    private RTCLocalEncodedVideoFrameObserver mRtcLocalEncodedVideoFrameObserver;
    private Map<Integer, RtcMediaPlayer> mRtcMediaPlayerMap;
    private RTCRemoteEncodedVideoFrameObserver mRtcRemoteEncodedVideoFrameObserver;
    private RTCVideoProcessor mRtcVideoPreprocessor;
    private VideoFrameConverter mScreenFrameConverter;
    private SingScoringManager mSingScoringManager;
    private PushSingleStreamToCDNObserver mSingleStreamToCDNObserver;
    private State mState;
    private LiveTranscodingObserver mTranscodingObserver;
    private VideoDeviceManager mVideoDevicemanager;
    private VideoFrameConverter mVideoFrameConverter;
    private VideoSinkTask mVideoSinkTask;
    private HashMap<Integer, VideoSinkAdapter> videoSinkAdapterMap;
    private static RTCNativeLibraryLoaderListener mRtcNativeLibraryListener = new RTCNativeLibraryListenerImpl();
    private static RTCNativeLibraryLoaderInfo sRtcLoaderInfo = new RTCNativeLibraryLoaderInfo();
    private static RTCAudioDeviceEventHandler mRTCAudioDeviceManagerEventHandler = null;
    private static RTCAudioDeviceManagerEx mAudioDeviceManager = null;
    private static String mDeviceId = "";

    public enum State {
        IDLE,
        IN_ROOM,
        DESTORY
    }

    public RTCVideoImpl(Context context, String str, IRTCVideoEventHandler iRTCVideoEventHandler, IRTCVideoEventHandlerEx iRTCVideoEventHandlerEx, Object obj, JSONObject jSONObject, boolean z10, boolean z11) throws IllegalStateException {
        int i10;
        String str2;
        this.isExEngine = false;
        this.mSingleStreamToCDNObserver = null;
        this.mIsUseCustomEglEnv = false;
        this.mNativeEngine = 0L;
        this.mLiveTranscoding = null;
        this.mEnableTranscode = false;
        this.mOnDestroyCompletedCallback = null;
        this.mRtcVideoPreprocessor = null;
        this.mRtcExVideoEncoderHandler = null;
        this.mRtcLocalEncodedVideoFrameObserver = null;
        this.mRtcRemoteEncodedVideoFrameObserver = null;
        this.mRootEglBase = null;
        this.mEglBaseCtx = null;
        this.mTranscodingObserver = null;
        this.mChorusObserver = null;
        this.mMixedStreamToCDNObserver = null;
        this.mIsFront = true;
        this.mAudioMixingManager = null;
        this.mAudioEffectPlayer = null;
        this.mRtcMediaPlayerMap = null;
        this.mAudioDeviceManagerInterval = null;
        this.mSingScoringManager = null;
        this.mAdvanceVideoEffect = null;
        this.mKTVManager = null;
        this.mVideoDevicemanager = null;
        this.mAmazingEffect = null;
        this.mRoomLists = null;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWriteLock = reentrantReadWriteLock;
        this.mJniReadLock = reentrantReadWriteLock.readLock();
        this.mJniWriteLock = reentrantReadWriteLock.writeLock();
        this.videoSinkAdapterMap = new HashMap<>();
        this.mLoggerSink = new LogUtil.ILoggerSink() { // from class: com.ss.bytertc.engine.engineimpl.c
            @Override // com.ss.bytertc.engine.utils.LogUtil.ILoggerSink
            public final void onLoggerMessage(LogUtil.LogLevel logLevel, String str3, Throwable th2) {
                this.f97953a.lambda$new$0(logLevel, str3, th2);
            }
        };
        this.appStateCallback = new AppMonitor.Callback() { // from class: com.ss.bytertc.engine.engineimpl.d
            @Override // com.ss.bytertc.engine.utils.AppMonitor.Callback
            public final void callback(int i11) {
                this.f97954a.lambda$new$1(i11);
            }
        };
        LogUtil.d(TAG, "create RtcEngineImpl with appId: " + str);
        if (obj != null && !(obj instanceof EGLContext)) {
            throw new IllegalArgumentException("eglContext is not an instance of android.opengl.EGLContext");
        }
        if (!mLibraryLoaded || str == null) {
            JSONObject jSONObject2 = new JSONObject();
            if (mLibraryLoaded) {
                i10 = ErrorCode.ERROR_CODE_APP_ID_NULL;
                str2 = "app id is null";
            } else {
                i10 = ErrorCode.ERROR_CODE_LOAD_SO_LIB;
                str2 = "rtc sdk load so failed";
            }
            try {
                jSONObject2.put("event_key", "rtc_error");
                jSONObject2.put("rtc_app_id", str);
                jSONObject2.put("device_id", mDeviceId);
                jSONObject2.put("error_code", i10);
                jSONObject2.put("message", str2);
                jSONObject2.put("timestamp", System.currentTimeMillis());
                jSONObject2.put("rtc_timestamp", System.currentTimeMillis());
                jSONObject2.put("os", "android");
                jSONObject2.put("product_line", "rtc");
                jSONObject2.put("report_version", 5);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            if (iRTCVideoEventHandler != null) {
                iRTCVideoEventHandler.onLogReport("live_webrtc_monitor_log", jSONObject2);
                iRTCVideoEventHandler.onError(i10);
            }
            LogUtil.e(TAG, str2);
            throw new IllegalStateException("Create engine failed " + str2);
        }
        HandlerThread handlerThread = new HandlerThread("rtc_egl_thread");
        this.mEglThread = handlerThread;
        handlerThread.start();
        VideoSinkTask videoSinkTask = new VideoSinkTask();
        this.mVideoSinkTask = videoSinkTask;
        videoSinkTask.init();
        Handler handler = new Handler(this.mEglThread.getLooper());
        this.mEglHandler = handler;
        if (obj == null) {
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() { // from class: com.ss.bytertc.engine.engineimpl.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f97955b.lambda$new$2();
                }
            });
            this.mEglBaseCtx = this.mRootEglBase.getEglBaseContext();
        } else {
            this.mEglBaseCtx = new EglBase14.Context((EGLContext) obj);
        }
        this.mRtcVideoPreprocessor = new RTCVideoProcessor();
        this.mContext = context.getApplicationContext();
        this.mState = State.IDLE;
        this.mRtcEngineHandler = iRTCVideoEventHandler;
        this.mRtcEngineHandlerEx = iRTCVideoEventHandlerEx;
        LogUtil.setLoggerSink(this.mLoggerSink);
        this.mEngineEventHandler = new RTCVideoEventHandler(this);
        this.mEngineInternalP2PEventHandler = new RTCEngineInternalP2PEventHandler();
        this.mVideoFrameConverter = new VideoFrameConverter();
        this.mScreenFrameConverter = new VideoFrameConverter();
        this.mRtcLocalEncodedVideoFrameObserver = new RTCLocalEncodedVideoFrameObserver(this);
        this.mRtcRemoteEncodedVideoFrameObserver = new RTCRemoteEncodedVideoFrameObserver(this);
        this.mTranscodingObserver = new LiveTranscodingObserver();
        this.mChorusObserver = new ChorusCacheSyncObserver();
        this.mMixedStreamToCDNObserver = new PushMixedStreamToCDNObserver();
        this.mSingleStreamToCDNObserver = new PushSingleStreamToCDNObserver();
        this.mRTCASREngineEventHandler = new RTCASREngineEventHandler();
        this.mRtcExVideoEncoderHandler = new RTCExternalVideoEncoderEventHandler(this);
        this.mRoomLists = new ArrayList();
        String string = "";
        try {
            if (z11) {
                Context applicationContext = this.mContext.getApplicationContext();
                RTCVideoEventHandler rTCVideoEventHandler = this.mEngineEventHandler;
                if (jSONObject != null) {
                    string = jSONObject.toString();
                }
                this.mNativeEngine = createRTCVideoMulti(applicationContext, str, rTCVideoEventHandler, string, this.mEglBaseCtx);
            } else {
                this.isExEngine = z10;
                if (z10) {
                    Context applicationContext2 = this.mContext.getApplicationContext();
                    RTCVideoEventHandler rTCVideoEventHandler2 = this.mEngineEventHandler;
                    if (jSONObject != null) {
                        string = jSONObject.toString();
                    }
                    this.mNativeEngine = createRTCVideoEx(applicationContext2, str, rTCVideoEventHandler2, string, this.mEglBaseCtx);
                } else {
                    Context applicationContext3 = this.mContext.getApplicationContext();
                    RTCVideoEventHandler rTCVideoEventHandler3 = this.mEngineEventHandler;
                    if (jSONObject != null) {
                        string = jSONObject.toString();
                    }
                    this.mNativeEngine = createRTCVideo(applicationContext3, str, rTCVideoEventHandler3, string, this.mEglBaseCtx);
                }
            }
            if (engineInvalid()) {
                LogUtil.e(TAG, "create native engine error, native engine is invalid.");
                throw new IllegalStateException("pthread key create fail");
            }
            this.mAdvanceVideoEffect = new RTCVideoEffect(this.mNativeEngine);
            NativeRTCVideoFunctions.nativeRegisterInternalP2PEventObserver(this.mNativeEngine, this.mEngineInternalP2PEventHandler);
            LogRecover.getInstance().startTimer();
            AppMonitor.get(context).register(context, this.appStateCallback);
        } catch (UnsatisfiedLinkError e11) {
            e11.printStackTrace();
            throw new UnsatisfiedLinkError("rtc loader info:" + sRtcLoaderInfo.toString() + " exception info:" + e11.getStackTrace().toString());
        }
    }

    public RTCVideoImpl(Context context, String str, IRTCVideoEventHandler iRTCVideoEventHandler, Object obj, JSONObject jSONObject) throws IllegalStateException {
        this(context, str, iRTCVideoEventHandler, null, obj, jSONObject, false, false);
    }

    public static IRTCAudioDeviceManagerEx createAudioDeviceManager(IRTCAudioDeviceManagerEx.IRTCAudioDeviceEventHandler iRTCAudioDeviceEventHandler) {
        mAudioDeviceManagerEventHandler = new WeakReference<>(iRTCAudioDeviceEventHandler);
        RTCAudioDeviceManagerEx rTCAudioDeviceManagerEx = mAudioDeviceManager;
        if (rTCAudioDeviceManagerEx != null) {
            return rTCAudioDeviceManagerEx;
        }
        RTCAudioDeviceEventHandler rTCAudioDeviceEventHandler = new RTCAudioDeviceEventHandler();
        mRTCAudioDeviceManagerEventHandler = rTCAudioDeviceEventHandler;
        RTCAudioDeviceManagerEx rTCAudioDeviceManagerEx2 = new RTCAudioDeviceManagerEx(rTCAudioDeviceEventHandler);
        mAudioDeviceManager = rTCAudioDeviceManagerEx2;
        return rTCAudioDeviceManagerEx2;
    }

    public static Context getApplicationContext() {
        return RtcContextUtils.getApplicationContext();
    }

    public static IRTCAudioDeviceManagerEx.IRTCAudioDeviceEventHandler getAudioDeviceManagerEvent() {
        return mAudioDeviceManagerEventHandler.get();
    }

    public static String getErrorDescription(int i10) {
        return i10 != -1072 ? NativeRTCVideoFunctions.nativeGetErrorDescription(i10) : RtcErrorCodeDescription.BRERR_LOAD_SO_LIB_DESCRIPTION;
    }

    public static String getSdkVersion() {
        return NativeRTCVideoFunctions.nativeGetSDKVersion();
    }

    private void initEglContext(Object obj) {
        if (obj == null) {
            this.mRootEglBase = com.bytedance.realx.video.a.a();
            this.mIsUseCustomEglEnv = false;
            return;
        }
        if (obj instanceof javax.microedition.khronos.egl.EGLContext) {
            this.mRootEglBase = com.bytedance.realx.video.a.d((javax.microedition.khronos.egl.EGLContext) obj, EglBase.CONFIG_PLAIN);
        } else if (obj instanceof EGLContext) {
            this.mRootEglBase = com.bytedance.realx.video.a.f((EGLContext) obj, EglBase.CONFIG_PLAIN);
        } else if (obj instanceof EglBase) {
            this.mRootEglBase = com.bytedance.realx.video.a.c(((EglBase) obj).getEglBaseContext(), EglBase.CONFIG_PLAIN);
        } else {
            this.mRootEglBase = com.bytedance.realx.video.a.a();
        }
        this.mIsUseCustomEglEnv = true;
    }

    public static synchronized boolean initializeNativeLibs() {
        return initializeNativeLibs(null);
    }

    public static synchronized boolean initializeNativeLibs(String str) {
        if (mLibraryLoaded) {
            mRtcNativeLibraryListener.onLoadAlready("volcenginertc");
        } else {
            boolean zLoadNativeLib = loadNativeLib(str, "volcenginertc");
            mLibraryLoaded = zLoadNativeLib;
            if (!zLoadNativeLib) {
                mRtcNativeLibraryListener.onLoadError("volcenginertc");
                return mLibraryLoaded;
            }
        }
        mRtcNativeLibraryListener.onLoadSuccess("volcenginertc");
        sRtcLoaderInfo.setLoadResult(mLibraryLoaded);
        sRtcLoaderInfo.setLoadTimeStampMs(System.currentTimeMillis());
        return mLibraryLoaded;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doDestroy$3() {
        Runnable runnable = this.mOnDestroyCompletedCallback;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doDestroy$4() {
        EglBase eglBase = this.mRootEglBase;
        if (eglBase != null) {
            eglBase.release();
            this.mRootEglBase = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(LogUtil.LogLevel logLevel, String str, Throwable th2) {
        IRTCVideoEventHandler rtcEngineHandler = getRtcEngineHandler();
        if (rtcEngineHandler != null) {
            try {
                rtcEngineHandler.onLoggerMessage(logLevel, str, th2);
            } catch (Exception e10) {
                Log.w(TAG, "Exception in App thread when handler onLoggerMessage , e : " + e10.getMessage(), e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(int i10) {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, SetAppState failed.");
            } else {
                NativeRTCVideoFunctions.nativeSetAppState(this.mNativeEngine, i10 == 1 ? "active" : UiKitSpanObj.TYPE_BACKGROUND);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2() {
        initEglContext(null);
        this.mRootEglBase.createDummyPbufferSurface();
        this.mRootEglBase.makeCurrent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$pushExternalVideoFrame$5(VideoFrame videoFrame, CountDownLatch countDownLatch) {
        videoFrame.release();
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$pushExternalVideoFrame$7(VideoFrame videoFrame, CountDownLatch countDownLatch) {
        videoFrame.release();
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$pushScreenVideoFrame$6(VideoFrame videoFrame, CountDownLatch countDownLatch) {
        videoFrame.release();
        countDownLatch.countDown();
    }

    private static boolean loadNativeLib(String str, String str2) {
        LogUtil.i(TAG, "Loading library: " + str2);
        String str3 = str + (nativeLibraryPrefix + str2 + ".so");
        RTCNativeLibraryLoader rTCNativeLibraryLoader = RTCVideo.mRtcNativeLibraryLoader;
        if (rTCNativeLibraryLoader != null) {
            return rTCNativeLibraryLoader.load(str2);
        }
        try {
            if (TextUtils.isEmpty(str)) {
                System.loadLibrary(str2);
            } else {
                System.load(str3);
            }
            LogUtil.i(TAG, "loadNativeLib: Success Load " + str2);
            return true;
        } catch (NullPointerException e10) {
            LogUtil.e(TAG, "loadNativeLib: Failed to load native library: " + str2, e10);
            return false;
        } catch (SecurityException e11) {
            LogUtil.e(TAG, "loadNativeLib: Failed to load native library: " + str2, e11);
            return false;
        } catch (Exception e12) {
            LogUtil.e(TAG, "loadNativeLib: Failed to load native library: " + str2, e12);
            return false;
        } catch (UnsatisfiedLinkError e13) {
            LogUtil.e(TAG, "loadNativeLib: Failed to load native library: " + str2, e13);
            return false;
        }
    }

    public static int setDeviceId(String str) {
        if (str == null) {
            return -1;
        }
        mDeviceId = str;
        return NativeRTCVideoFunctions.nativeSetDeviceId(str);
    }

    public static int setLogConfig(RTCLogConfig rTCLogConfig) {
        return NativeRTCVideoFunctions.nativeSetLogConfig(rTCLogConfig.logLevel.getValue(), rTCLogConfig.logPath, rTCLogConfig.logFileSize, rTCLogConfig.logFilenamePrefix);
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int appendVideoEffectNodes(List<String> list) {
        RTCVideoEffect rTCVideoEffect = this.mAdvanceVideoEffect;
        return rTCVideoEffect == null ? ErrorCode.ERROR_CODE_KICKED_OUT : rTCVideoEffect.appendEffectNodes(list);
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int checkVideoEffectLicense(Context context, String str) {
        int iNativeCheckVideoEffectLicense;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, checkVideoEffectLicense failed.");
                iNativeCheckVideoEffectLicense = -1;
            } else {
                iNativeCheckVideoEffectLicense = NativeRTCVideoFunctions.nativeCheckVideoEffectLicense(context, this.mNativeEngine, str);
            }
            return iNativeCheckVideoEffectLicense;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int clearVideoWatermark(StreamIndex streamIndex) {
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "native engine is invalid, clearVideoWatermark failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iValue = NativeRTCVideoFunctions.nativeClearVideoWatermark(this.mNativeEngine, streamIndex.value());
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public RTCRoom createRTCRoom(String str) {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, createRoom failed.");
            } else {
                if (str == null) {
                    str = "";
                }
                long jNativeCreateRoom = NativeRTCVideoFunctions.nativeCreateRoom(this.mNativeEngine, str);
                if (jNativeCreateRoom != 0) {
                    RTCRoomImpl rTCRoomImpl = new RTCRoomImpl(str, jNativeCreateRoom);
                    this.mRoomLists.add(rTCRoomImpl);
                    return rTCRoomImpl;
                }
                LogUtil.e(TAG, "createRoom failed, native room is invalid");
            }
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideoEx
    public RTCRoomEx createRTCRoomEx(String str) {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, createRoom failed.");
            } else {
                if (str == null) {
                    str = "";
                }
                long jNativeCreateRoomEx = NativeRTCVideoFunctions.nativeCreateRoomEx(this.mNativeEngine, str);
                if (jNativeCreateRoomEx != 0) {
                    RTCRoomImpl rTCRoomImpl = new RTCRoomImpl(str, jNativeCreateRoomEx);
                    this.mRoomLists.add(rTCRoomImpl);
                    return rTCRoomImpl;
                }
                LogUtil.e(TAG, "createRoom failed, native room is invalid");
            }
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public long createRTCVideo(Context context, String str, RTCVideoEventHandler rTCVideoEventHandler, String str2, EglBase.Context context2) {
        return NativeRTCVideoFunctions.nativeCreateRTCVideo(context, str, rTCVideoEventHandler, str2, context2);
    }

    public long createRTCVideoEx(Context context, String str, RTCVideoEventHandler rTCVideoEventHandler, String str2, EglBase.Context context2) {
        return NativeRTCVideoFunctionsEx.nativeCreateRTCVideoEx(context, str, rTCVideoEventHandler, str2, context2);
    }

    public long createRTCVideoMulti(Context context, String str, RTCVideoEventHandler rTCVideoEventHandler, String str2, EglBase.Context context2) {
        return NativeRTCVideoFunctions.nativeCreateRTCVideoMulti(context, str, rTCVideoEventHandler, str2, context2);
    }

    public void destroyRTCVideo(long j10) {
        NativeRTCVideoFunctions.nativeDestroyRTCVideo(j10);
    }

    public void destroyRTCVideoEx(long j10) {
        NativeRTCVideoFunctionsEx.nativeDestroyRTCVideoEx(j10);
    }

    public void destroyRTCVideoMulti(long j10) {
        NativeRTCVideoFunctions.nativeDestroyRTCVideoMulti(j10);
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int disableAlphaChannelVideoEncode(StreamIndex streamIndex) {
        int iValue;
        LogUtil.d(TAG, "disableAlphaChannelVideoEncode");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "native engine is invalid, disableAlphaChannelVideoEncode failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iValue = NativeRTCVideoFunctions.nativeDisableAlphaChannelVideoEncode(this.mNativeEngine, streamIndex.value());
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int disableAudioFrameCallback(AudioFrameCallbackMethod audioFrameCallbackMethod) {
        int iNativeDisableAudioFrameCallback;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, disableAudioFrameCallback failed.");
                iNativeDisableAudioFrameCallback = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeDisableAudioFrameCallback = NativeRTCVideoFunctions.nativeDisableAudioFrameCallback(this.mNativeEngine, audioFrameCallbackMethod.value());
            }
            return iNativeDisableAudioFrameCallback;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int disableAudioProcessor(AudioProcessorMethod audioProcessorMethod) {
        int iNativeDisableAudioProcessor;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, disableAudioProcessor failed.");
                iNativeDisableAudioProcessor = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeDisableAudioProcessor = NativeRTCVideoFunctions.nativeDisableAudioProcessor(this.mNativeEngine, audioProcessorMethod.value());
            }
            return iNativeDisableAudioProcessor;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void doDestroy(boolean z10) {
        LogUtil.d(TAG, "destroy RtcEngineImpl.");
        this.mJniWriteLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, no need to destroy now.");
                this.mJniWriteLock.unlock();
                return;
            }
            long j10 = this.mNativeEngine;
            this.mNativeEngine = 0L;
            this.mJniWriteLock.unlock();
            AudioMixingManager audioMixingManager = this.mAudioMixingManager;
            if (audioMixingManager instanceof AudioMixingManager) {
                audioMixingManager.destroy();
            }
            this.mState = State.DESTORY;
            SingScoringManager singScoringManager = this.mSingScoringManager;
            if (singScoringManager instanceof SingScoringManager) {
                singScoringManager.destroy();
            }
            KTVManagerImpl kTVManagerImpl = this.mKTVManager;
            if (kTVManagerImpl instanceof KTVManagerImpl) {
                kTVManagerImpl.destroy();
            }
            RTCAudioDeviceManager rTCAudioDeviceManager = this.mAudioDeviceManagerInterval;
            if (rTCAudioDeviceManager instanceof RTCAudioDeviceManager) {
                rTCAudioDeviceManager.destroy();
            }
            RTCAudioDeviceManagerEx rTCAudioDeviceManagerEx = mAudioDeviceManager;
            if (rTCAudioDeviceManagerEx instanceof RTCAudioDeviceManagerEx) {
                rTCAudioDeviceManagerEx.destroy();
            }
            List<RTCRoomImpl> list = this.mRoomLists;
            if (list != null) {
                Iterator<RTCRoomImpl> it = list.iterator();
                while (it.hasNext()) {
                    it.next().destroy();
                }
            }
            if (z10) {
                destroyRTCVideoMulti(j10);
            } else if (this.isExEngine) {
                destroyRTCVideoEx(j10);
            } else {
                destroyRTCVideo(j10);
            }
            AudioEffectPlayer audioEffectPlayer = this.mAudioEffectPlayer;
            if (audioEffectPlayer instanceof AudioEffectPlayer) {
                audioEffectPlayer.destroy();
            }
            Map<Integer, RtcMediaPlayer> map = this.mRtcMediaPlayerMap;
            if (map != null) {
                Iterator<RtcMediaPlayer> it2 = map.values().iterator();
                while (it2.hasNext()) {
                    it2.next().destroy();
                }
            }
            this.mIsFront = true;
            this.mVideoFrameConverter.dispose();
            this.mVideoFrameConverter = null;
            this.mScreenFrameConverter.dispose();
            this.mScreenFrameConverter = null;
            RTCVideoEffect rTCVideoEffect = this.mAdvanceVideoEffect;
            if (rTCVideoEffect instanceof RTCVideoEffect) {
                rTCVideoEffect.destroy();
                this.mAdvanceVideoEffect = null;
            }
            AmazingEffect amazingEffect = this.mAmazingEffect;
            if (amazingEffect != null) {
                amazingEffect.dispose();
                this.mAmazingEffect = null;
            }
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ss.bytertc.engine.engineimpl.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f97956b.lambda$doDestroy$3();
                }
            });
            AppMonitor.get(this.mContext).unRegister(this.appStateCallback).release(this.mContext);
            this.mRtcVideoPreprocessor.dispose();
            this.mRtcVideoPreprocessor = null;
            ThreadUtils.invokeAtFrontUninterruptibly(this.mEglHandler, new Runnable() { // from class: com.ss.bytertc.engine.engineimpl.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f97957b.lambda$doDestroy$4();
                }
            });
            HandlerThread handlerThread = this.mEglThread;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            VideoSinkTask videoSinkTask = this.mVideoSinkTask;
            if (videoSinkTask != null) {
                videoSinkTask.exit();
            }
            KTVManagerImpl kTVManagerImpl2 = this.mKTVManager;
            if (kTVManagerImpl2 != null) {
                kTVManagerImpl2.destroy();
                this.mKTVManager = null;
            }
            LogUtil.setLoggerSink(null);
        } catch (Throwable th2) {
            this.mJniWriteLock.unlock();
            throw th2;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int enableAlphaChannelVideoEncode(StreamIndex streamIndex, AlphaLayout alphaLayout) {
        int iValue;
        LogUtil.d(TAG, "enableAlphaChannelVideoEncode");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "native engine is invalid, enableAlphaChannelVideoEncode failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iValue = alphaLayout == null ? ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value() : NativeRTCVideoFunctions.nativeEnableAlphaChannelVideoEncode(this.mNativeEngine, streamIndex.value(), alphaLayout.value());
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int enableAudioFrameCallback(AudioFrameCallbackMethod audioFrameCallbackMethod, AudioFormat audioFormat) {
        int iNativeEnableAudioFrameCallback;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, enableAudioFrameCallback failed.");
                iNativeEnableAudioFrameCallback = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeEnableAudioFrameCallback = NativeRTCVideoFunctions.nativeEnableAudioFrameCallback(this.mNativeEngine, audioFrameCallbackMethod.value(), audioFormat.sampleRate.value(), audioFormat.channel.value());
            }
            return iNativeEnableAudioFrameCallback;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int enableAudioProcessor(AudioProcessorMethod audioProcessorMethod, AudioFormat audioFormat) {
        int iNativeEnableAudioProcessor;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, enableAudioProcessor failed.");
                iNativeEnableAudioProcessor = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeEnableAudioProcessor = NativeRTCVideoFunctions.nativeEnableAudioProcessor(this.mNativeEngine, audioProcessorMethod.value(), audioFormat.sampleRate.value(), audioFormat.channel.value(), audioFormat.samplesPerCall);
            }
            return iNativeEnableAudioProcessor;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int enableAudioPropertiesReport(AudioPropertiesConfig audioPropertiesConfig) {
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "native engine is invalid, EnableAudioPropertiesReport failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iValue = NativeRTCVideoFunctions.nativeEnableAudioPropertiesReport(this.mNativeEngine, audioPropertiesConfig.interval, audioPropertiesConfig.enableSpectrum, audioPropertiesConfig.enableVad, audioPropertiesConfig.localMainReportMode.value(), audioPropertiesConfig.smooth, audioPropertiesConfig.audioReportMode.value(), audioPropertiesConfig.enableVoicePitch, audioPropertiesConfig.enableDeviceLoopDelay);
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int enableCameraAutoExposureFaceMode(boolean z10) {
        this.mJniReadLock.lock();
        try {
            return (engineInvalid() || this.mState == State.DESTORY) ? -1 : NativeRTCVideoFunctions.nativeEnableCameraAutoExposureFaceMode(this.mNativeEngine, z10);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int enableEffectBeauty(boolean z10) {
        int iNativeEnableEffectBeauty;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, enableEffectBeauty failed.");
                iNativeEnableEffectBeauty = 1000;
            } else {
                iNativeEnableEffectBeauty = NativeRTCVideoFunctions.nativeEnableEffectBeauty(this.mNativeEngine, z10);
            }
            return iNativeEnableEffectBeauty;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int enableExternalSoundCard(boolean z10) {
        int iNativeEnableExternalSoundCard;
        LogUtil.d(TAG, "enableExternalSoundCard");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, enableExternalSoundCard failed.");
                iNativeEnableExternalSoundCard = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeEnableExternalSoundCard = NativeRTCVideoFunctions.nativeEnableExternalSoundCard(this.mNativeEngine, z10);
            }
            return iNativeEnableExternalSoundCard;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int enableLocalVoiceReverb(boolean z10) {
        int iNativeEnableLocalVoiceReverb;
        LogUtil.d(TAG, "enableLocalVoiceReverb...enable: " + z10);
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, enableLocalVoiceReverb failed.");
                iNativeEnableLocalVoiceReverb = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeEnableLocalVoiceReverb = NativeRTCVideoFunctions.nativeEnableLocalVoiceReverb(this.mNativeEngine, z10);
            }
            return iNativeEnableLocalVoiceReverb;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int enableP2PAbility(String str, boolean z10) {
        int iNativeEnableP2PAbility;
        LogUtil.d(TAG, "enableP2PAbility...roomId: " + str + ", onlyLan: " + z10);
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, enableP2PAbility failed.");
                iNativeEnableP2PAbility = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeEnableP2PAbility = NativeRTCVideoFunctions.nativeEnableP2PAbility(this.mNativeEngine, str, z10);
            }
            return iNativeEnableP2PAbility;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int enablePlaybackDucking(boolean z10) {
        int iNativeEnablePlaybackDucking;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, EnablePlaybackDucking failed.");
                iNativeEnablePlaybackDucking = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeEnablePlaybackDucking = NativeRTCVideoFunctions.nativeEnablePlaybackDucking(this.mNativeEngine, z10);
            }
            return iNativeEnablePlaybackDucking;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int enableSimulcastMode(boolean z10) {
        int iNativeEnableSimulcastMode;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setVideoResolutions failed.");
                iNativeEnableSimulcastMode = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeEnableSimulcastMode = NativeRTCVideoFunctions.nativeEnableSimulcastMode(this.mNativeEngine, z10);
            }
            return iNativeEnableSimulcastMode;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int enableVideoEffect(boolean z10) {
        int iNativeEnableVideoEffect;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, enableVideoEffect failed.");
                iNativeEnableVideoEffect = 1000;
            } else {
                iNativeEnableVideoEffect = NativeRTCVideoFunctions.nativeEnableVideoEffect(this.mNativeEngine, z10);
            }
            return iNativeEnableVideoEffect;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int enableVocalInstrumentBalance(boolean z10) {
        int iNativeEnableVocalInstrumentBalance;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, EnableVocalInstrumentBalance failed.");
                iNativeEnableVocalInstrumentBalance = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeEnableVocalInstrumentBalance = NativeRTCVideoFunctions.nativeEnableVocalInstrumentBalance(this.mNativeEngine, z10);
            }
            return iNativeEnableVocalInstrumentBalance;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    protected boolean engineInvalid() {
        return this.mNativeEngine == 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int feedback(List<ProblemFeedbackOption> list, ProblemFeedbackInfo problemFeedbackInfo) {
        int iNativeReportFeedback;
        if (!mLibraryLoaded) {
            initializeNativeLibs();
        }
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, SetRuntimeParameters failed.");
                iNativeReportFeedback = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                long j10 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    j10 |= list.get(i10).value;
                }
                iNativeReportFeedback = NativeRTCVideoFunctions.nativeReportFeedback(this.mNativeEngine, j10, problemFeedbackInfo);
            }
            return iNativeReportFeedback;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public IAmazingEffect getAmazingEffectInterface() {
        LogUtil.d(TAG, "getAmazingEffectInterface");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, getAmazingEffectInterface");
            } else {
                AmazingEffect amazingEffect = this.mAmazingEffect;
                if (amazingEffect != null) {
                    return amazingEffect;
                }
                long jNativeGetAmazingEffectInterface = NativeRTCVideoFunctions.nativeGetAmazingEffectInterface(this.mNativeEngine);
                if (jNativeGetAmazingEffectInterface != 0) {
                    AmazingEffect amazingEffect2 = new AmazingEffect(jNativeGetAmazingEffectInterface);
                    this.mAmazingEffect = amazingEffect2;
                    return amazingEffect2;
                }
                LogUtil.e(TAG, "getAmazingEffectInterface failed");
            }
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public IRTCAudioDeviceManager getAudioDeviceManager() {
        LogUtil.d(TAG, "getAudioDeviceManager");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, getAudioDeviceManager failed.");
                return null;
            }
            long jNativeGetAudioDeviceManager = NativeRTCVideoFunctions.nativeGetAudioDeviceManager(this.mNativeEngine);
            if (jNativeGetAudioDeviceManager == 0 || jNativeGetAudioDeviceManager == -1) {
                LogUtil.e(TAG, "getAudioDeviceManager failed");
                this.mAudioDeviceManagerInterval = null;
            } else {
                this.mAudioDeviceManagerInterval = new RTCAudioDeviceManager(jNativeGetAudioDeviceManager);
            }
            return this.mAudioDeviceManagerInterval;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public IAudioEffectPlayer getAudioEffectPlayer() {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid()) {
                AudioEffectPlayer audioEffectPlayer = this.mAudioEffectPlayer;
                if (audioEffectPlayer == null) {
                    long jNativeGetAudioEffectPlayer = NativeRTCVideoFunctions.nativeGetAudioEffectPlayer(this.mNativeEngine);
                    if (jNativeGetAudioEffectPlayer == 0) {
                        LogUtil.e(TAG, "getAudioEffectPlayer failed");
                    } else {
                        audioEffectPlayer = new AudioEffectPlayer(jNativeGetAudioEffectPlayer, this.mNativeEngine);
                        this.mAudioEffectPlayer = audioEffectPlayer;
                    }
                }
                return audioEffectPlayer;
            }
            LogUtil.e(TAG, "native engine is invalid, getAudioEffectPlayer");
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public IAudioMixingManager getAudioMixingManager() {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid()) {
                AudioMixingManager audioMixingManager = this.mAudioMixingManager;
                if (audioMixingManager == null) {
                    long jNativeGetAudioMixingManager = NativeRTCVideoFunctions.nativeGetAudioMixingManager(this.mNativeEngine);
                    if (jNativeGetAudioMixingManager == 0) {
                        LogUtil.e(TAG, "getAudioMixingManager failed");
                    } else {
                        audioMixingManager = new AudioMixingManager(jNativeGetAudioMixingManager, this.mNativeEngine);
                        this.mAudioMixingManager = audioMixingManager;
                    }
                }
                return audioMixingManager;
            }
            LogUtil.e(TAG, "native engine is invalid, getAudioMixingManager");
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public AudioRoute getAudioRoute() {
        AudioRoute audioRouteFromId;
        LogUtil.d(TAG, "getAudioRoute");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, getAudioRoute failed.");
                audioRouteFromId = null;
            } else {
                audioRouteFromId = AudioRoute.fromId(NativeRTCVideoFunctions.nativeGetAudioRoute(this.mNativeEngine));
            }
            return audioRouteFromId;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public float getCameraZoomMaxRatio() {
        float fNativeGetCameraZoomMaxRatio;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "native engine is invalid, PushScreenAudioFrame failed.");
                fNativeGetCameraZoomMaxRatio = -1.0f;
            } else {
                fNativeGetCameraZoomMaxRatio = NativeRTCVideoFunctions.nativeGetCameraZoomMaxRatio(this.mNativeEngine);
            }
            return fNativeGetCameraZoomMaxRatio;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public EglBase getEGLContext() {
        EglBase eglBase = this.mRootEglBase;
        if (eglBase != null) {
            return eglBase;
        }
        return null;
    }

    public ILocalEncodedVideoFrameObserver getEncodedVideoFrameObserver() {
        return this.mLocalEncodedVideoFrameObserver;
    }

    public IExternalVideoEncoderEventHandler getExternalVideoEncoderEventHandler() {
        return this.mExternalVideoEncoderHandler;
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public IKTVManager getKTVManager() {
        this.mJniReadLock.lock();
        try {
            KTVManagerImpl kTVManagerImpl = null;
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, getKTVManger failed.");
            } else {
                synchronized (RTCVideoImpl.class) {
                    KTVManagerImpl kTVManagerImpl2 = this.mKTVManager;
                    if (kTVManagerImpl2 != null) {
                        this.mJniReadLock.unlock();
                        return kTVManagerImpl2;
                    }
                    long jNativeGetKTVManager = NativeRTCVideoFunctions.nativeGetKTVManager(this.mNativeEngine);
                    if (jNativeGetKTVManager == 0) {
                        LogUtil.e(TAG, "getKTVManger failed");
                    } else {
                        kTVManagerImpl = new KTVManagerImpl(jNativeGetKTVManager);
                        this.mKTVManager = kTVManagerImpl;
                    }
                }
            }
            this.mJniReadLock.unlock();
            return kTVManagerImpl;
        } catch (Throwable th2) {
            this.mJniReadLock.unlock();
            throw th2;
        }
    }

    public ILiveTranscodingObserver getLiveTranscodingObserver() {
        return this.mLiveTranscodingObserver;
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public IMediaPlayer getMediaPlayer(int i10) {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, getMediaPlayer");
            } else {
                Map<Integer, RtcMediaPlayer> map = this.mRtcMediaPlayerMap;
                if (map != null && map.containsKey(Integer.valueOf(i10))) {
                    return this.mRtcMediaPlayerMap.get(Integer.valueOf(i10));
                }
                long jNativeGetMediaPlayer = NativeRTCVideoFunctions.nativeGetMediaPlayer(this.mNativeEngine, i10);
                if (jNativeGetMediaPlayer != 0) {
                    RtcMediaPlayer rtcMediaPlayer = new RtcMediaPlayer(jNativeGetMediaPlayer, this.mNativeEngine);
                    if (this.mRtcMediaPlayerMap == null) {
                        this.mRtcMediaPlayerMap = new HashMap();
                    }
                    this.mRtcMediaPlayerMap.put(Integer.valueOf(i10), rtcMediaPlayer);
                    return rtcMediaPlayer;
                }
                LogUtil.e(TAG, "getMediaPlayer failed");
            }
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public IMetadataObserver getMetadataObserver() {
        return this.mMetadataObserver;
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public long getNativeHandle() {
        if (!engineInvalid()) {
            return this.mNativeEngine;
        }
        LogUtil.e(TAG, "native engine is invalid, getNativeHandle failed.");
        return -1L;
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public NetworkTimeInfo getNetworkTimeInfo() {
        NetworkTimeInfo networkTimeInfoNativeGetNetworkTimeInfo;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, getNetworkTimeInfo");
                networkTimeInfoNativeGetNetworkTimeInfo = null;
            } else {
                networkTimeInfoNativeGetNetworkTimeInfo = NativeRTCVideoFunctions.nativeGetNetworkTimeInfo(this.mNativeEngine);
            }
            return networkTimeInfoNativeGetNetworkTimeInfo;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int getPeerOnlineStatus(String str) {
        int iNativeGetPeerOnlineStatus;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, sendBinaryMessage failed.");
                iNativeGetPeerOnlineStatus = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeGetPeerOnlineStatus = NativeRTCVideoFunctions.nativeGetPeerOnlineStatus(this.mNativeEngine, str);
            }
            return iNativeGetPeerOnlineStatus;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public IRemoteEncodedVideoFrameObserver getRemoteEncodedVideoFrameObserver() {
        return this.mRemoteEncodedVideoFrameObserver;
    }

    public IRTCVideoEventHandler getRtcEngineHandler() {
        return this.mRtcEngineHandler;
    }

    public IRTCVideoEventHandlerEx getRtcEngineHandlerEx() {
        return this.mRtcEngineHandlerEx;
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public ISingScoringManager getSingScoringManager() {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid()) {
                SingScoringManager singScoringManager = this.mSingScoringManager;
                if (singScoringManager == null) {
                    long jNativeGetSingScoringManager = NativeRTCVideoFunctions.nativeGetSingScoringManager(this.mNativeEngine);
                    if (jNativeGetSingScoringManager == 0) {
                        LogUtil.e(TAG, "getSingScoringManager failed");
                    } else {
                        singScoringManager = new SingScoringManager(this.mNativeEngine, jNativeGetSingScoringManager);
                        this.mSingScoringManager = singScoringManager;
                    }
                }
                return singScoringManager;
            }
            LogUtil.e(TAG, "native engine is invalid, getSingScoringManager");
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public IVideoDeviceManager getVideoDeviceManager() {
        LogUtil.d(TAG, "getVideoDeviceManager");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, getVideoDeviceManager");
            } else {
                VideoDeviceManager videoDeviceManager = this.mVideoDevicemanager;
                if (videoDeviceManager != null) {
                    return videoDeviceManager;
                }
                long jNativeGetVideoDeviceManager = NativeRTCVideoFunctions.nativeGetVideoDeviceManager(this.mNativeEngine);
                if (jNativeGetVideoDeviceManager != 0) {
                    VideoDeviceManager videoDeviceManager2 = new VideoDeviceManager(jNativeGetVideoDeviceManager);
                    this.mVideoDevicemanager = videoDeviceManager2;
                    return videoDeviceManager2;
                }
                LogUtil.e(TAG, "getVideoDeviceManager failed");
            }
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public IVideoEffect getVideoEffectInterface() {
        LogUtil.d(TAG, "getVideoEffectInterface");
        return this.mAdvanceVideoEffect;
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int invokeExperimentalAPI(String str) {
        int iValue;
        LogUtil.d(TAG, "invokeExperimentalAPI");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "native engine is invalid, startCloudProxy failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iValue = NativeRTCVideoFunctions.nativeInvokeExperimentalAPI(this.mNativeEngine, str);
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public boolean isCameraExposurePositionSupported() {
        this.mJniReadLock.lock();
        try {
            return (engineInvalid() || this.mState == State.DESTORY) ? false : NativeRTCVideoFunctions.nativeIsCameraExposurePositionSupported(this.mNativeEngine);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public boolean isCameraFocusPositionSupported() {
        this.mJniReadLock.lock();
        try {
            return (engineInvalid() || this.mState == State.DESTORY) ? false : NativeRTCVideoFunctions.nativeIsCameraFocusPositionSupported(this.mNativeEngine);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public boolean isCameraTorchSupported() {
        boolean zNativeIsSupportFlashLight;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "native engine is invalid, PushScreenAudioFrame failed.");
                zNativeIsSupportFlashLight = false;
            } else {
                zNativeIsSupportFlashLight = NativeRTCVideoFunctions.nativeIsSupportFlashLight(this.mNativeEngine);
            }
            return zNativeIsSupportFlashLight;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public boolean isCameraZoomSupported() {
        boolean zNativeIsCameraZoomSupported;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "native engine is invalid, PushScreenAudioFrame failed.");
                zNativeIsCameraZoomSupported = false;
            } else {
                zNativeIsCameraZoomSupported = NativeRTCVideoFunctions.nativeIsCameraZoomSupported(this.mNativeEngine);
            }
            return zNativeIsCameraZoomSupported;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int login(String str, String str2) {
        int iNativeLogin;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, sendBinaryMessage failed.");
                iNativeLogin = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeLogin = NativeRTCVideoFunctions.nativeLogin(this.mNativeEngine, str, str2);
            }
            return iNativeLogin;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int logout() {
        int iNativeLogout;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, sendBinaryMessage failed.");
                iNativeLogout = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeLogout = NativeRTCVideoFunctions.nativeLogout(this.mNativeEngine);
            }
            return iNativeLogout;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int muteAudioCapture(StreamIndex streamIndex, boolean z10) {
        int iNativeMuteAudioCapture;
        LogUtil.d(TAG, "muteAudioCapture");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, muteAudioCapture failed.");
                iNativeMuteAudioCapture = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeMuteAudioCapture = NativeRTCVideoFunctions.nativeMuteAudioCapture(this.mNativeEngine, streamIndex.value(), z10);
            }
            return iNativeMuteAudioCapture;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int muteAudioPlayback(MuteState muteState) {
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "native engine is invalid, muteAudioPlayback failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iValue = NativeRTCVideoFunctions.nativeMuteAudioPlayback(this.mNativeEngine, muteState.value());
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int pullExternalAudioFrame(AudioFrame audioFrame) {
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "native engine is invalid, pullExternalAudioFrame failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iValue = NativeRTCVideoFunctions.nativePullExternalAudioFrame(this.mNativeEngine, audioFrame.buffer, audioFrame.samples, audioFrame.sampleRate.value(), audioFrame.channel.value());
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int pushExternalAudioFrame(AudioFrame audioFrame) {
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "native engine is invalid, pushExternalAudioFrame failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iValue = NativeRTCVideoFunctions.nativePushExternalAudioFrame(this.mNativeEngine, audioFrame.buffer, audioFrame.samples, audioFrame.sampleRate.value(), audioFrame.channel.value());
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int pushExternalEncodedVideoFrame(StreamIndex streamIndex, int i10, RTCEncodedVideoFrame rTCEncodedVideoFrame) {
        int iNativePushExternalEncodedVideoFrame;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, PushExternalEncodedVideoFrame failed.");
                iNativePushExternalEncodedVideoFrame = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativePushExternalEncodedVideoFrame = NativeRTCVideoFunctions.nativePushExternalEncodedVideoFrame(this.mNativeEngine, streamIndex.value(), i10, rTCEncodedVideoFrame.buffer, rTCEncodedVideoFrame.timestampUs, rTCEncodedVideoFrame.timestampDtsUs, rTCEncodedVideoFrame.width, rTCEncodedVideoFrame.height, rTCEncodedVideoFrame.videoCodecType.value(), rTCEncodedVideoFrame.videoPictureType.value(), rTCEncodedVideoFrame.videoRotation.value());
            }
            return iNativePushExternalEncodedVideoFrame;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideoEx
    public int pushExternalVideoFrame(StreamIndex streamIndex, final VideoFrame videoFrame) {
        int iValue;
        ReturnStatus returnStatusFromId;
        LogUtil.d(TAG, "pushExternalVideoFrame");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "pushExternalVideoFrame: native engine is invalid, pushExternalVideoFrame failed.");
                videoFrame.release();
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (videoFrame == null) {
                LogUtil.i(TAG, "pushExternalVideoFrame: videoFrame is null, drop frame.");
                iValue = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                ReturnStatus returnStatus = ReturnStatus.RETURN_STATUS_SUCCESS;
                if (videoFrame.getFrameType() == VideoFrameType.RAW_MEMORY || videoFrame.hasReleaseCallback()) {
                    returnStatusFromId = ReturnStatus.fromId(NativeRTCVideoFunctionsEx.nativePushExternalVideoFrame(this.mNativeEngine, streamIndex.value(), videoFrame));
                } else {
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    videoFrame.retain();
                    VideoFrame videoFrameBuild = new GLTextureVideoFrameBuilder(videoFrame.getPixelFormat()).setTextureID(videoFrame.getTextureID()).setTextureMatrix(videoFrame.getTextureMatrix()).setEGLContext(videoFrame.getEGLContext()).setColorSpace(videoFrame.getColorSpace()).setWidth(videoFrame.getWidth()).setHeight(videoFrame.getHeight()).setRotation(videoFrame.getRotation()).setExternalDataInfo(videoFrame.getExternalDataInfo()).setSupplementaryInfo(videoFrame.getSupplementaryInfo()).setTimeStampUs(videoFrame.getTimeStampUs()).setReleaseCallback(new Runnable() { // from class: com.ss.bytertc.engine.engineimpl.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            RTCVideoImpl.lambda$pushExternalVideoFrame$7(videoFrame, countDownLatch);
                        }
                    }).build();
                    returnStatusFromId = ReturnStatus.fromId(NativeRTCVideoFunctionsEx.nativePushExternalVideoFrame(this.mNativeEngine, streamIndex.value(), videoFrameBuild));
                    videoFrameBuild.release();
                    if (!ThreadUtils.awaitUninterruptibly(countDownLatch, 1000L)) {
                        LogUtil.w(TAG, "pushExternalVideoFrame: pushExternalVideoFrame timeout.");
                    }
                }
                iValue = returnStatusFromId.value();
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int pushExternalVideoFrame(VideoFrame videoFrame) {
        return pushExternalVideoFrame(videoFrame, this.mIsUseCustomEglEnv);
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int pushExternalVideoFrame(final VideoFrame videoFrame, boolean z10) {
        int iValue;
        ReturnStatus returnStatusFromId;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "pushExternalVideoFrame: native engine is invalid, pushExternalVideoFrame failed.");
                videoFrame.release();
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (videoFrame == null) {
                LogUtil.i(TAG, "pushExternalVideoFrame: videoFrame is null, drop frame.");
                iValue = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                ReturnStatus returnStatus = ReturnStatus.RETURN_STATUS_SUCCESS;
                if (videoFrame.getFrameType() == VideoFrameType.RAW_MEMORY || videoFrame.hasReleaseCallback()) {
                    returnStatusFromId = ReturnStatus.fromId(NativeRTCVideoFunctions.nativePushExternalByteRtcVideoFrame(this.mNativeEngine, videoFrame));
                } else {
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    videoFrame.retain();
                    VideoFrame videoFrameBuild = new GLTextureVideoFrameBuilder(videoFrame.getPixelFormat()).setTextureID(videoFrame.getTextureID()).setTextureMatrix(videoFrame.getTextureMatrix()).setEGLContext(videoFrame.getEGLContext()).setColorSpace(videoFrame.getColorSpace()).setWidth(videoFrame.getWidth()).setHeight(videoFrame.getHeight()).setRotation(videoFrame.getRotation()).setExternalDataInfo(videoFrame.getExternalDataInfo()).setSupplementaryInfo(videoFrame.getSupplementaryInfo()).setTimeStampUs(videoFrame.getTimeStampUs()).setReleaseCallback(new Runnable() { // from class: com.ss.bytertc.engine.engineimpl.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            RTCVideoImpl.lambda$pushExternalVideoFrame$5(videoFrame, countDownLatch);
                        }
                    }).build();
                    returnStatusFromId = ReturnStatus.fromId(NativeRTCVideoFunctions.nativePushExternalByteRtcVideoFrame(this.mNativeEngine, videoFrameBuild));
                    videoFrameBuild.release();
                    if (!ThreadUtils.awaitUninterruptibly(countDownLatch, 1000L)) {
                        LogUtil.w(TAG, "pushExternalVideoFrame: pushExternalVideoFrame timeout.");
                    }
                }
                iValue = returnStatusFromId.value();
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int pushScreenAudioFrame(AudioFrame audioFrame) {
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "native engine is invalid, PushScreenAudioFrame failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iValue = NativeRTCVideoFunctions.nativePushScreenAudioFrame(this.mNativeEngine, audioFrame.buffer, audioFrame.samples, audioFrame.sampleRate.value(), audioFrame.channel.value());
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int pushScreenVideoFrame(final VideoFrame videoFrame) {
        int iValue;
        ReturnStatus returnStatusFromId;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "pushExternalVideoFrame: native engine is invalid, pushExternalVideoFrame failed.");
                videoFrame.release();
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (videoFrame == null) {
                LogUtil.i(TAG, "pushExternalVideoFrame: videoFrame is null, drop frame.");
                iValue = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                ReturnStatus returnStatus = ReturnStatus.RETURN_STATUS_SUCCESS;
                if (videoFrame.getFrameType() == VideoFrameType.RAW_MEMORY || videoFrame.hasReleaseCallback()) {
                    returnStatusFromId = ReturnStatus.fromId(NativeRTCVideoFunctions.nativePushScreenByteRtcFrame(this.mNativeEngine, videoFrame));
                } else {
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    videoFrame.retain();
                    VideoFrame videoFrameBuild = new GLTextureVideoFrameBuilder(videoFrame.getPixelFormat()).setTextureID(videoFrame.getTextureID()).setTextureMatrix(videoFrame.getTextureMatrix()).setEGLContext(videoFrame.getEGLContext()).setColorSpace(videoFrame.getColorSpace()).setWidth(videoFrame.getWidth()).setHeight(videoFrame.getHeight()).setRotation(videoFrame.getRotation()).setExternalDataInfo(videoFrame.getExternalDataInfo()).setSupplementaryInfo(videoFrame.getSupplementaryInfo()).setTimeStampUs(videoFrame.getTimeStampUs()).setReleaseCallback(new Runnable() { // from class: com.ss.bytertc.engine.engineimpl.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            RTCVideoImpl.lambda$pushScreenVideoFrame$6(videoFrame, countDownLatch);
                        }
                    }).build();
                    returnStatusFromId = ReturnStatus.fromId(NativeRTCVideoFunctions.nativePushScreenByteRtcFrame(this.mNativeEngine, videoFrameBuild));
                    videoFrameBuild.release();
                    if (!ThreadUtils.awaitUninterruptibly(countDownLatch, 1000L)) {
                        LogUtil.w(TAG, "pushExternalVideoFrame: pushExternalVideoFrame timeout.");
                    }
                }
                iValue = returnStatusFromId.value();
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int registerAudioFrameObserver(IAudioFrameObserver iAudioFrameObserver) {
        int iNativeSetAudioFrameObserver;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, registerAudioFrameObserver failed.");
                iNativeSetAudioFrameObserver = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetAudioFrameObserver = NativeRTCVideoFunctions.nativeSetAudioFrameObserver(this.mNativeEngine, iAudioFrameObserver);
            }
            return iNativeSetAudioFrameObserver;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int registerAudioProcessor(IAudioFrameProcessor iAudioFrameProcessor) {
        int iNativeSetAudioFrameProcessor;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, registerAudioProcessor failed.");
                iNativeSetAudioFrameProcessor = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetAudioFrameProcessor = NativeRTCVideoFunctions.nativeSetAudioFrameProcessor(this.mNativeEngine, iAudioFrameProcessor);
            }
            return iNativeSetAudioFrameProcessor;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int registerFaceDetectionObserver(IFaceDetectionObserver iFaceDetectionObserver, int i10) {
        RTCVideoEffect rTCVideoEffect = this.mAdvanceVideoEffect;
        return rTCVideoEffect == null ? ErrorCode.ERROR_CODE_KICKED_OUT : rTCVideoEffect.registerFaceDetectionObserver(iFaceDetectionObserver, i10);
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int registerLocalEncodedVideoFrameObserver(ILocalEncodedVideoFrameObserver iLocalEncodedVideoFrameObserver) {
        int iNativeRegisterLocalEncodedVideoFrameObserver;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, registerAudioFrameObserver failed.");
                iNativeRegisterLocalEncodedVideoFrameObserver = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                this.mLocalEncodedVideoFrameObserver = iLocalEncodedVideoFrameObserver;
                iNativeRegisterLocalEncodedVideoFrameObserver = iLocalEncodedVideoFrameObserver == null ? NativeRTCVideoFunctions.nativeRegisterLocalEncodedVideoFrameObserver(this.mNativeEngine, null) : NativeRTCVideoFunctions.nativeRegisterLocalEncodedVideoFrameObserver(this.mNativeEngine, this.mRtcLocalEncodedVideoFrameObserver);
            }
            return iNativeRegisterLocalEncodedVideoFrameObserver;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int registerLocalVideoProcessor(IVideoProcessor iVideoProcessor, VideoPreprocessorConfig videoPreprocessorConfig) {
        int iValue;
        VideoPixelFormat videoPixelFormat;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, registerLocalVideoProcessor failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                if (videoPreprocessorConfig == null) {
                    videoPreprocessorConfig = new VideoPreprocessorConfig();
                }
                RTCVideoProcessor rTCVideoProcessor = this.mRtcVideoPreprocessor;
                if (rTCVideoProcessor == null || rTCVideoProcessor.registerLocalVideoProcessor(iVideoProcessor, videoPreprocessorConfig.requiredPixelFormat) != 0) {
                    iValue = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
                } else {
                    VideoPixelFormat videoPixelFormat2 = videoPreprocessorConfig.requiredPixelFormat;
                    if (videoPixelFormat2 != VideoPixelFormat.I420 && videoPixelFormat2 != (videoPixelFormat = VideoPixelFormat.UNKNOWN)) {
                        videoPixelFormat2 = videoPixelFormat;
                    }
                    iValue = iVideoProcessor == null ? NativeRTCVideoFunctions.nativeRegisterLocalVideoProcessor(this.mNativeEngine, null, videoPixelFormat2.value()) : NativeRTCVideoFunctions.nativeRegisterLocalVideoProcessor(this.mNativeEngine, this.mRtcVideoPreprocessor, videoPixelFormat2.value());
                }
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int registerRemoteEncodedVideoFrameObserver(IRemoteEncodedVideoFrameObserver iRemoteEncodedVideoFrameObserver) {
        int iNativeRegisterRemoteEncodedVideoFrameObserver;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, RegisterRemoteEncodedVideoFrameObserver failed.");
                iNativeRegisterRemoteEncodedVideoFrameObserver = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                this.mRemoteEncodedVideoFrameObserver = iRemoteEncodedVideoFrameObserver;
                iNativeRegisterRemoteEncodedVideoFrameObserver = iRemoteEncodedVideoFrameObserver == null ? NativeRTCVideoFunctions.nativeRegisterRemoteEncodedVideoFrameObserver(this.mNativeEngine, null) : NativeRTCVideoFunctions.nativeRegisterRemoteEncodedVideoFrameObserver(this.mNativeEngine, this.mRtcRemoteEncodedVideoFrameObserver);
            }
            return iNativeRegisterRemoteEncodedVideoFrameObserver;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int removeVideoEffectNodes(List<String> list) {
        RTCVideoEffect rTCVideoEffect = this.mAdvanceVideoEffect;
        return rTCVideoEffect == null ? ErrorCode.ERROR_CODE_KICKED_OUT : rTCVideoEffect.removeEffectNodes(list);
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int replaceBackground(BackgroundMode backgroundMode, DivideModel divideModel) {
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int requestRemoteVideoKeyFrame(RemoteStreamKey remoteStreamKey) {
        int iNativeRequestRemoteVideoKeyFrame;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, RequestRemoteVideoKeyFrame failed.");
                iNativeRequestRemoteVideoKeyFrame = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeRequestRemoteVideoKeyFrame = NativeRTCVideoFunctions.nativeRequestRemoteVideoKeyFrame(this.mNativeEngine, remoteStreamKey.getRoomId(), remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value());
            }
            return iNativeRequestRemoteVideoKeyFrame;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int sendPublicStreamSEIMessage(StreamIndex streamIndex, int i10, byte[] bArr, int i11, SEICountPerFrame sEICountPerFrame) {
        int iNativeSendPublicStreamSEIMessage;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, sendPublicStreamSEIMessage failed.");
                iNativeSendPublicStreamSEIMessage = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSendPublicStreamSEIMessage = NativeRTCVideoFunctions.nativeSendPublicStreamSEIMessage(this.mNativeEngine, streamIndex.value(), i10, bArr, i11, sEICountPerFrame.value());
            }
            return iNativeSendPublicStreamSEIMessage;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int sendSEIMessage(StreamIndex streamIndex, byte[] bArr, int i10) {
        int iNativeSendSEIMessage;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, registerMetadataObserver failed.");
                iNativeSendSEIMessage = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSendSEIMessage = NativeRTCVideoFunctions.nativeSendSEIMessage(this.mNativeEngine, streamIndex.value(), bArr, i10);
            }
            return iNativeSendSEIMessage;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int sendSEIMessage(StreamIndex streamIndex, byte[] bArr, int i10, SEICountPerFrame sEICountPerFrame) {
        int iNativeSendMultiSEIMessagePerVideoFrame;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, registerMetadataObserver failed.");
                iNativeSendMultiSEIMessagePerVideoFrame = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSendMultiSEIMessagePerVideoFrame = NativeRTCVideoFunctions.nativeSendMultiSEIMessagePerVideoFrame(this.mNativeEngine, streamIndex.value(), bArr, i10, sEICountPerFrame.value());
            }
            return iNativeSendMultiSEIMessagePerVideoFrame;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public long sendServerBinaryMessage(byte[] bArr) {
        long jNativeSendServerBinaryMessage;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, sendBinaryMessage failed.");
                jNativeSendServerBinaryMessage = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                jNativeSendServerBinaryMessage = NativeRTCVideoFunctions.nativeSendServerBinaryMessage(this.mNativeEngine, bArr);
            }
            return jNativeSendServerBinaryMessage;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public long sendServerMessage(String str) {
        long jNativeSendServerMessage;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, sendBinaryMessage failed.");
                jNativeSendServerMessage = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                jNativeSendServerMessage = NativeRTCVideoFunctions.nativeSendServerMessage(this.mNativeEngine, str);
            }
            return jNativeSendServerMessage;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int sendStreamSyncInfo(byte[] bArr, StreamSycnInfoConfig streamSycnInfoConfig) {
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "native engine is invalid, SendStreamSyncInfo failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iValue = NativeRTCVideoFunctions.nativeSendStreamSyncInfo(this.mNativeEngine, bArr, streamSycnInfoConfig.streamIndex.value(), streamSycnInfoConfig.repeatCount, 0);
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public long sendUserBinaryMessageOutsideRoom(String str, byte[] bArr, MessageConfig messageConfig) {
        long jNativeSendUserBinaryMessageOutsideRoom;
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid()) {
                if (str == null) {
                    LogUtil.e(TAG, "sendUserBinaryMessageOutsideRoom: uid is null send failed");
                    iValue = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
                } else {
                    jNativeSendUserBinaryMessageOutsideRoom = NativeRTCVideoFunctions.nativeSendUserBinaryMessageOutsideRoom(this.mNativeEngine, str, bArr, messageConfig.value());
                }
                return jNativeSendUserBinaryMessageOutsideRoom;
            }
            LogUtil.e(TAG, "native engine is invalid, sendBinaryMessage failed.");
            iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            jNativeSendUserBinaryMessageOutsideRoom = iValue;
            return jNativeSendUserBinaryMessageOutsideRoom;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public long sendUserMessageOutsideRoom(String str, String str2, MessageConfig messageConfig) {
        long jNativeSendUserMessageOutsideRoom;
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid()) {
                if (str == null) {
                    LogUtil.e(TAG, "sendUserMessageOutsideRoom: uid is null send failed");
                    iValue = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
                } else {
                    jNativeSendUserMessageOutsideRoom = NativeRTCVideoFunctions.nativeSendUserMessageOutsideRoom(this.mNativeEngine, str, str2, messageConfig.value());
                }
                return jNativeSendUserMessageOutsideRoom;
            }
            LogUtil.e(TAG, "native engine is invalid, sendBinaryMessage failed.");
            iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            jNativeSendUserMessageOutsideRoom = iValue;
            return jNativeSendUserMessageOutsideRoom;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setAnsMode(AnsMode ansMode) {
        int iNativeSetAnsMode;
        LogUtil.d(TAG, "setAnsMode:" + ansMode);
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setAnsMode failed.");
                iNativeSetAnsMode = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (ansMode == null) {
                LogUtil.e(TAG, "ansMode is invalid, setAnsMode failed.");
                iNativeSetAnsMode = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                iNativeSetAnsMode = NativeRTCVideoFunctions.nativeSetAnsMode(this.mNativeEngine, ansMode.value());
            }
            return iNativeSetAnsMode;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setAudioAlignmentProperty(RemoteStreamKey remoteStreamKey, AudioAlignmentMode audioAlignmentMode) {
        int iNativeSetAudioAlignmentProperty;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setAudioAlignmentProperty failed.");
                iNativeSetAudioAlignmentProperty = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (remoteStreamKey == null) {
                LogUtil.e(TAG, "setAudioAlignmentProperty: streamKey is null");
                iNativeSetAudioAlignmentProperty = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                iNativeSetAudioAlignmentProperty = NativeRTCVideoFunctions.nativeSetAudioAlignmentProperty(this.mNativeEngine, remoteStreamKey.getRoomId(), remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value(), audioAlignmentMode.value());
            }
            return iNativeSetAudioAlignmentProperty;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideoEx
    public int setAudioContentType(StreamIndex streamIndex, AudioContentTypeConfig audioContentTypeConfig) {
        int iNativeSetAudioContentType;
        LogUtil.d(TAG, "SetAudioContentType");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, SetAudioContentType failed.");
                iNativeSetAudioContentType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetAudioContentType = NativeRTCVideoFunctionsEx.nativeSetAudioContentType(this.mNativeEngine, streamIndex.value(), audioContentTypeConfig.hasMic, audioContentTypeConfig.hasScreenAudio, audioContentTypeConfig.hasMediaPlayer);
            }
            return iNativeSetAudioContentType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideoEx
    public int setAudioEncodeConfig(StreamIndex streamIndex, AudioEncodeConfig audioEncodeConfig) {
        int iNativeSetAudioEncodeConfig;
        LogUtil.d(TAG, "SetAudioEncodeConfig");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, SetAudioEncodeConfig failed.");
                iNativeSetAudioEncodeConfig = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetAudioEncodeConfig = NativeRTCVideoFunctionsEx.nativeSetAudioEncodeConfig(this.mNativeEngine, streamIndex.value(), audioEncodeConfig.codecType, audioEncodeConfig.encMode, audioEncodeConfig.channelNum, audioEncodeConfig.encBitrate, audioEncodeConfig.useDtx, audioEncodeConfig.useInbandfec, audioEncodeConfig.sampleRate, audioEncodeConfig.packetSize);
            }
            return iNativeSetAudioEncodeConfig;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setAudioPlaybackDevice(AudioPlaybackDevice audioPlaybackDevice) {
        int iNativeSetAudioPlaybackDevice;
        LogUtil.d(TAG, "setAudioPlaybackDevice: " + audioPlaybackDevice.value());
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setAudioPlaybackDevice failed.");
                iNativeSetAudioPlaybackDevice = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetAudioPlaybackDevice = NativeRTCVideoFunctions.nativeSetAudioPlaybackDevice(this.mNativeEngine, audioPlaybackDevice.value());
            }
            return iNativeSetAudioPlaybackDevice;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setAudioProfile(AudioProfileType audioProfileType) {
        int iNativeSetAudioProfile;
        LogUtil.d(TAG, "setAudioProfile:" + audioProfileType);
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setAudioProfile failed.");
                iNativeSetAudioProfile = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (audioProfileType == null) {
                LogUtil.e(TAG, "audioProfile is invalid, setAudioProfile failed.");
                iNativeSetAudioProfile = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                iNativeSetAudioProfile = NativeRTCVideoFunctions.nativeSetAudioProfile(this.mNativeEngine, audioProfileType.value());
            }
            return iNativeSetAudioProfile;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setAudioRenderType(AudioRenderType audioRenderType) {
        int iNativeSetAudioRenderType;
        LogUtil.d(TAG, "SetAudioRenderType");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, SetAudioRenderType failed.");
                iNativeSetAudioRenderType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetAudioRenderType = NativeRTCVideoFunctions.nativeSetAudioRenderType(this.mNativeEngine, audioRenderType.value());
            }
            return iNativeSetAudioRenderType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setAudioRoute(AudioRoute audioRoute) {
        int iNativeSetAudioRoute;
        LogUtil.d(TAG, "setAudioRoute: " + audioRoute.value());
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setAudioRoute failed.");
                iNativeSetAudioRoute = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetAudioRoute = NativeRTCVideoFunctions.nativeSetAudioRoute(this.mNativeEngine, audioRoute.value());
            }
            return iNativeSetAudioRoute;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setAudioScenario(AudioScenarioType audioScenarioType) {
        int iNativeSetAudioScenario;
        LogUtil.d(TAG, "setAudioScenario...audioScenario: " + audioScenarioType);
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setAudioScenario failed.");
                iNativeSetAudioScenario = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetAudioScenario = NativeRTCVideoFunctions.nativeSetAudioScenario(this.mNativeEngine, audioScenarioType.value());
            }
            return iNativeSetAudioScenario;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setAudioScene(AudioSceneType audioSceneType) {
        int iNativeSetAudioScene;
        LogUtil.d(TAG, "setAudioScene...audioScene: " + audioSceneType);
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setAudioScene failed.");
                iNativeSetAudioScene = -1;
            } else {
                iNativeSetAudioScene = NativeRTCVideoFunctions.nativeSetAudioScene(this.mNativeEngine, audioSceneType.value);
            }
            return iNativeSetAudioScene;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setAudioSourceType(AudioSourceType audioSourceType) {
        int iNativeSetAudioSourceType;
        LogUtil.d(TAG, "SetAudioSourceType");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, SetAudioSourceType failed.");
                iNativeSetAudioSourceType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetAudioSourceType = NativeRTCVideoFunctions.nativeSetAudioSourceType(this.mNativeEngine, audioSourceType.value());
            }
            return iNativeSetAudioSourceType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideoEx
    public int setAudioSourceVolume(StreamIndex streamIndex, int i10) {
        int iNativeSetAudioSourceVolume;
        LogUtil.d(TAG, "setSourceVolume");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "native engine is invalid, setSourceVolume failed.");
                iNativeSetAudioSourceVolume = -1;
            } else {
                iNativeSetAudioSourceVolume = NativeRTCVideoFunctionsEx.nativeSetAudioSourceVolume(this.mNativeEngine, streamIndex.value(), i10);
            }
            return iNativeSetAudioSourceVolume;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setBackgroundSticker(String str, VirtualBackgroundSource virtualBackgroundSource) {
        RTCVideoEffect rTCVideoEffect = this.mAdvanceVideoEffect;
        if (rTCVideoEffect == null) {
            return ErrorCode.ERROR_CODE_KICKED_OUT;
        }
        return str != null ? rTCVideoEffect.enableVirtualBackground(str, virtualBackgroundSource) : rTCVideoEffect.disableVirtualBackground();
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setBeautyIntensity(EffectBeautyMode effectBeautyMode, float f10) {
        int iNativeSetBeautyIntensity;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setBeautyIntensity failed.");
                iNativeSetBeautyIntensity = 1000;
            } else {
                iNativeSetBeautyIntensity = NativeRTCVideoFunctions.nativeSetBeautyIntensity(this.mNativeEngine, effectBeautyMode.value(), f10);
            }
            return iNativeSetBeautyIntensity;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setBusinessId(String str) {
        int iNativeSetBusinessId;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setBusinessId failed.");
                iNativeSetBusinessId = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetBusinessId = NativeRTCVideoFunctions.nativeSetBusinessId(this.mNativeEngine, str);
            }
            return iNativeSetBusinessId;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setCameraAdaptiveMinimumFrameRate(int i10) {
        this.mJniReadLock.lock();
        try {
            return (engineInvalid() || this.mState == State.DESTORY) ? -1 : NativeRTCVideoFunctions.nativeSetCameraAdaptiveMinimumFrameRate(this.mNativeEngine, i10);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setCameraExposureCompensation(float f10) {
        this.mJniReadLock.lock();
        try {
            return (engineInvalid() || this.mState == State.DESTORY) ? -1 : NativeRTCVideoFunctions.nativeSetCameraExposureCompensation(this.mNativeEngine, f10);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setCameraExposurePosition(float f10, float f11) {
        this.mJniReadLock.lock();
        try {
            return (engineInvalid() || this.mState == State.DESTORY) ? -1 : NativeRTCVideoFunctions.nativeSetCameraExposurePosition(this.mNativeEngine, f10, f11);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setCameraFocusPosition(float f10, float f11) {
        this.mJniReadLock.lock();
        try {
            return (engineInvalid() || this.mState == State.DESTORY) ? -1 : NativeRTCVideoFunctions.nativeSetCameraFocusPosition(this.mNativeEngine, f10, f11);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setCameraTorch(TorchState torchState) {
        int iNativeEnableCameraTorch;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "native engine is invalid, PushScreenAudioFrame failed.");
                iNativeEnableCameraTorch = -1;
            } else {
                iNativeEnableCameraTorch = NativeRTCVideoFunctions.nativeEnableCameraTorch(this.mNativeEngine, torchState == TorchState.TORCH_STATE_ON);
            }
            return iNativeEnableCameraTorch;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setCameraZoomRatio(float f10) {
        int iNativeSetCameraZoomRatio;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "native engine is invalid, PushScreenAudioFrame failed.");
                iNativeSetCameraZoomRatio = -1;
            } else {
                iNativeSetCameraZoomRatio = NativeRTCVideoFunctions.nativeSetCameraZoomRatio(this.mNativeEngine, f10);
            }
            return iNativeSetCameraZoomRatio;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideoEx
    public int setCaptureVolume(int i10) {
        int iNativeSetCaptureVolume;
        LogUtil.d(TAG, "setCaptureVolume");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "native engine is invalid, setCaptureVolume failed.");
                iNativeSetCaptureVolume = -1;
            } else {
                iNativeSetCaptureVolume = NativeRTCVideoFunctionsEx.nativeSetCaptureVolume(this.mNativeEngine, i10);
            }
            return iNativeSetCaptureVolume;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setCaptureVolume(StreamIndex streamIndex, int i10) {
        int iNativeSetCaptureVolume;
        LogUtil.d(TAG, "setCaptureVolume");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setCaptureVolume failed.");
                iNativeSetCaptureVolume = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetCaptureVolume = NativeRTCVideoFunctions.nativeSetCaptureVolume(this.mNativeEngine, i10, streamIndex.value());
            }
            return iNativeSetCaptureVolume;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setCellularEnhancement(MediaTypeEnhancementConfig mediaTypeEnhancementConfig) {
        int iNativeSetCellularEnhancement;
        LogUtil.d(TAG, "setCellularEnhancement");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "native engine is invalid, setCellularEnhancement failed.");
                iNativeSetCellularEnhancement = -1;
            } else {
                iNativeSetCellularEnhancement = NativeRTCVideoFunctions.nativeSetCellularEnhancement(this.mNativeEngine, new InternalMediaTypeEnhancementConfig(mediaTypeEnhancementConfig));
            }
            return iNativeSetCellularEnhancement;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setCustomizeEncryptHandler(RTCEncryptHandler rTCEncryptHandler) {
        int iNativeSetCustomizeEncryptHandler;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setCustomizeEncryptHandler failed.");
                iNativeSetCustomizeEncryptHandler = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetCustomizeEncryptHandler = NativeRTCVideoFunctions.nativeSetCustomizeEncryptHandler(this.mNativeEngine, rTCEncryptHandler);
            }
            return iNativeSetCustomizeEncryptHandler;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setDefaultAudioRoute(AudioRoute audioRoute) {
        int iNativeSetDefaultAudioRoute;
        LogUtil.d(TAG, "setDefaultAudioRoute: " + audioRoute.value());
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setDefaultAudioRoute failed.");
                iNativeSetDefaultAudioRoute = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetDefaultAudioRoute = NativeRTCVideoFunctions.nativeSetDefaultAudioRoute(this.mNativeEngine, audioRoute.value());
            }
            return iNativeSetDefaultAudioRoute;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setDummyCaptureImagePath(String str) {
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "native engine is invalid, setDummyCaptureImagePath failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iValue = NativeRTCVideoFunctions.nativeSetDummyCaptureImagePath(this.mNativeEngine, str);
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setEarMonitorMode(EarMonitorMode earMonitorMode) {
        int iNativeSetEarMonitorMode;
        LogUtil.d(TAG, "setEarMonitorMode");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setEarMonitorMode failed.");
                iNativeSetEarMonitorMode = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetEarMonitorMode = NativeRTCVideoFunctions.nativeSetEarMonitorMode(this.mNativeEngine, earMonitorMode.value());
            }
            return iNativeSetEarMonitorMode;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setEarMonitorVolume(int i10) {
        int iNativeSetEarMonitorVolume;
        LogUtil.d(TAG, "setEarMonitorVolume");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setEarMonitorVolume failed.");
                iNativeSetEarMonitorVolume = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetEarMonitorVolume = NativeRTCVideoFunctions.nativeSetEarMonitorVolume(this.mNativeEngine, i10);
            }
            return iNativeSetEarMonitorVolume;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setEncryptInfo(int i10, String str) {
        int iNativeSetEncryptInfo;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setEncryptInfo failed.");
                iNativeSetEncryptInfo = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetEncryptInfo = NativeRTCVideoFunctions.nativeSetEncryptInfo(this.mNativeEngine, i10, str);
            }
            return iNativeSetEncryptInfo;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setExternalVideoEncoderEventHandler(IExternalVideoEncoderEventHandler iExternalVideoEncoderEventHandler) {
        int iNativeSetExternalVideoEncoderEventHandler;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setExternalVideoEncoderEventHandler failed.");
                iNativeSetExternalVideoEncoderEventHandler = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                this.mExternalVideoEncoderHandler = iExternalVideoEncoderEventHandler;
                iNativeSetExternalVideoEncoderEventHandler = iExternalVideoEncoderEventHandler == null ? NativeRTCVideoFunctions.nativeSetExternalVideoEncoderEventHandler(this.mNativeEngine, null) : NativeRTCVideoFunctions.nativeSetExternalVideoEncoderEventHandler(this.mNativeEngine, this.mRtcExVideoEncoderHandler);
            }
            return iNativeSetExternalVideoEncoderEventHandler;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setInternalP2PEventHandler(IRTCEngineInternalP2PEventHandler iRTCEngineInternalP2PEventHandler) {
        LogUtil.d(TAG, "setInternalP2PEventHandler...");
        this.mEngineInternalP2PEventHandler.setInternalP2PEventHandler(iRTCEngineInternalP2PEventHandler);
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setLocalProxy(List<LocalProxyConfiguration> list) {
        int iNativeSetLocalProxy;
        LogUtil.d(TAG, "setLocalProxy");
        this.mJniReadLock.lock();
        try {
            if (this.mNativeEngine == -1 || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "native engine is invalid, setLocalProxy failed.");
                iNativeSetLocalProxy = -1;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<LocalProxyConfiguration> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new InternalLocalProxyConfiguration(it.next()));
                }
                iNativeSetLocalProxy = NativeRTCVideoFunctions.nativeSetLocalProxy(this.mNativeEngine, arrayList);
            }
            return iNativeSetLocalProxy;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideoEx
    public int setLocalStreamPriority(StreamIndex streamIndex, StreamPriority streamPriority) {
        int iNativeSetLocalStreamPriority;
        LogUtil.d(TAG, "setLocalStreamPriority");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "native engine is invalid, setLocalStreamPriority failed.");
                iNativeSetLocalStreamPriority = -1;
            } else {
                iNativeSetLocalStreamPriority = NativeRTCVideoFunctionsEx.nativeSetLocalStreamPriority(this.mNativeEngine, streamIndex.value(), streamPriority.value());
            }
            return iNativeSetLocalStreamPriority;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setLocalVideoCanvas(StreamIndex streamIndex, VideoCanvas videoCanvas) {
        int iNativeSetLocalVideoCanvas;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setLocalVideoCanvas failed.");
                iNativeSetLocalVideoCanvas = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                if (videoCanvas == null) {
                    videoCanvas = new VideoCanvas();
                }
                iNativeSetLocalVideoCanvas = NativeRTCVideoFunctions.nativeSetLocalVideoCanvas(this.mNativeEngine, streamIndex.value(), videoCanvas.renderView, videoCanvas.renderSurface, videoCanvas.renderMode, videoCanvas.backgroundColor);
            }
            return iNativeSetLocalVideoCanvas;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setLocalVideoMirrorType(MirrorType mirrorType) {
        int iNativeSetLocalVideoMirrorType;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setLocalVideoMirrorType failed.");
                iNativeSetLocalVideoMirrorType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetLocalVideoMirrorType = NativeRTCVideoFunctions.nativeSetLocalVideoMirrorType(this.mNativeEngine, mirrorType.value());
            }
            return iNativeSetLocalVideoMirrorType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setLocalVideoRender(StreamIndex streamIndex, IVideoSink iVideoSink, LocalVideoSinkConfig localVideoSinkConfig) {
        int iNativeSetLocalVideoRender;
        this.mJniReadLock.lock();
        try {
            if (streamIndex == null) {
                LogUtil.e(TAG, "EventType: setLocalVideoSink, streamIndex is null");
                iNativeSetLocalVideoRender = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setLocalVideoSink failed.");
                iNativeSetLocalVideoRender = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (iVideoSink == null) {
                LogUtil.e(TAG, "video sink is null, setLocalVideoSink failed.");
                iNativeSetLocalVideoRender = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                int iHashCode = iVideoSink.hashCode();
                if (!this.videoSinkAdapterMap.containsKey(Integer.valueOf(iHashCode))) {
                    this.videoSinkAdapterMap.put(Integer.valueOf(iHashCode), new VideoSinkAdapter(iVideoSink));
                }
                iNativeSetLocalVideoRender = NativeRTCVideoFunctions.nativeSetLocalVideoRender(this.mNativeEngine, streamIndex.value(), this.videoSinkAdapterMap.get(Integer.valueOf(iHashCode)), localVideoSinkConfig.pixelFormat, localVideoSinkConfig.position.getValue());
            }
            this.mJniReadLock.unlock();
            return iNativeSetLocalVideoRender;
        } catch (Throwable th2) {
            this.mJniReadLock.unlock();
            throw th2;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setLocalVideoSink(StreamIndex streamIndex, IVideoSink iVideoSink, int i10) {
        int iNativeSetLocalVideoSink;
        this.mJniReadLock.lock();
        try {
            if (streamIndex == null) {
                LogUtil.e(TAG, "EventType: setLocalVideoSink, streamIndex is null");
                iNativeSetLocalVideoSink = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setLocalVideoSink failed.");
                iNativeSetLocalVideoSink = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetLocalVideoSink = NativeRTCVideoFunctions.nativeSetLocalVideoSink(this.mNativeEngine, streamIndex.value(), iVideoSink != null ? new VideoSinkAdapter(iVideoSink) : null, i10);
            }
            this.mJniReadLock.unlock();
            return iNativeSetLocalVideoSink;
        } catch (Throwable th2) {
            this.mJniReadLock.unlock();
            throw th2;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setLocalVoiceEqualization(VoiceEqualizationConfig voiceEqualizationConfig) {
        int iNativeSetLocalVoiceEqualization;
        LogUtil.d(TAG, "setLocalVoiceEqualization...frequency : " + voiceEqualizationConfig.frequency + ", gain: " + voiceEqualizationConfig.gain);
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setLocalVoiceEqualization failed.");
                iNativeSetLocalVoiceEqualization = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetLocalVoiceEqualization = NativeRTCVideoFunctions.nativeSetLocalVoiceEqualization(this.mNativeEngine, voiceEqualizationConfig.frequency.value(), voiceEqualizationConfig.gain);
            }
            return iNativeSetLocalVoiceEqualization;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setLocalVoicePitch(int i10) {
        int iNativeSetLocalVoicePitch;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setLocalVoicePitch failed.");
                iNativeSetLocalVoicePitch = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetLocalVoicePitch = NativeRTCVideoFunctions.nativeSetLocalVoicePitch(this.mNativeEngine, i10);
            }
            return iNativeSetLocalVoicePitch;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setLocalVoiceReverbParam(VoiceReverbConfig voiceReverbConfig) {
        int iNativeSetLocalVoiceReverbParam;
        LogUtil.d(TAG, "setLocalVoiceReverbParam...roomSize: " + voiceReverbConfig.roomSize + ", decayTime: " + voiceReverbConfig.decayTime + ", damping:" + voiceReverbConfig.damping + ", wetGain:" + voiceReverbConfig.wetGain + ", dryGain:" + voiceReverbConfig.dryGain + ", preDelay:" + voiceReverbConfig.preDelay);
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setLocalVoiceReverbParam failed.");
                iNativeSetLocalVoiceReverbParam = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetLocalVoiceReverbParam = NativeRTCVideoFunctions.nativeSetLocalVoiceReverbParam(this.mNativeEngine, voiceReverbConfig.roomSize, voiceReverbConfig.decayTime, voiceReverbConfig.damping, voiceReverbConfig.wetGain, voiceReverbConfig.dryGain, voiceReverbConfig.preDelay);
            }
            return iNativeSetLocalVoiceReverbParam;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setOnDestroyCompletedCallback(Runnable runnable) {
        this.mOnDestroyCompletedCallback = runnable;
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setPlaybackVolume(int i10) {
        int iNativeSetPlaybackVolume;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setPlaybackVolume failed.");
                iNativeSetPlaybackVolume = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetPlaybackVolume = NativeRTCVideoFunctions.nativeSetPlaybackVolume(this.mNativeEngine, i10);
            }
            return iNativeSetPlaybackVolume;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setPublicStreamAudioPlaybackVolume(String str, int i10) {
        int iNativeSetPublicStreamAudioPlaybackVolume;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setPublicStreamAudioPlaybackVolume failed.");
                iNativeSetPublicStreamAudioPlaybackVolume = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                LogUtil.d(TAG, "setPublicStreamAudioPlaybackVolume...public stream id: " + str + ", volume: " + i10);
                iNativeSetPublicStreamAudioPlaybackVolume = NativeRTCVideoFunctions.nativeSetPublicStreamAudioPlaybackVolume(this.mNativeEngine, str, i10);
            }
            return iNativeSetPublicStreamAudioPlaybackVolume;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setPublicStreamVideoCanvas(String str, VideoCanvas videoCanvas) {
        int iNativeSetPublicStreamVideoCanvas;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setPublicStreamVideoCanvas failed.");
                iNativeSetPublicStreamVideoCanvas = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                LogUtil.d(TAG, "startPlayPublicStream...public stream id: " + str);
                iNativeSetPublicStreamVideoCanvas = NativeRTCVideoFunctions.nativeSetPublicStreamVideoCanvas(this.mNativeEngine, str, videoCanvas.renderView, videoCanvas.renderMode);
            }
            return iNativeSetPublicStreamVideoCanvas;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setPublicStreamVideoSink(String str, IVideoSink iVideoSink, int i10) {
        int iNativeSetPublicStreamVideoSink;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setPublicStreamVideoSink failed.");
                iNativeSetPublicStreamVideoSink = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                LogUtil.d(TAG, "setPublicStreamVideoSink...public stream id: " + str);
                iNativeSetPublicStreamVideoSink = NativeRTCVideoFunctions.nativeSetPublicStreamVideoSink(this.mNativeEngine, str, iVideoSink != null ? new VideoSinkAdapter(iVideoSink) : null, i10);
            }
            return iNativeSetPublicStreamVideoSink;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setPublishFallbackOption(PublishFallbackOption publishFallbackOption) {
        int iNativeSetPublishFallbackOption;
        LogUtil.d(TAG, "setPublishFallbackOption: option: " + publishFallbackOption);
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setPublishFallbackOption failed.");
                iNativeSetPublishFallbackOption = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetPublishFallbackOption = NativeRTCVideoFunctions.nativeSetPublishFallbackOption(this.mNativeEngine, publishFallbackOption.value());
            }
            return iNativeSetPublishFallbackOption;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideoEx
    public int setRemoteAudioPlaybackVolume(StreamKey streamKey, int i10) {
        int iNativeSetRemoteAudioPlaybackVolume;
        LogUtil.d(TAG, "setRemoteAudioPlaybackVolume");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "native engine is invalid, setRemoteAudioPlaybackVolume failed.");
                iNativeSetRemoteAudioPlaybackVolume = -1;
            } else {
                iNativeSetRemoteAudioPlaybackVolume = NativeRTCVideoFunctionsEx.nativeSetRemoteAudioPlaybackVolume(this.mNativeEngine, streamKey.getRoomId(), streamKey.getUserId(), streamKey.getStreamIndex().value(), i10);
            }
            return iNativeSetRemoteAudioPlaybackVolume;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setRemoteAudioPlaybackVolume(String str, @n0 String str2, int i10) {
        int iNativeSetRemoteAudioPlaybackVolume;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setRemoteAudioPlaybackVolume failed.");
                iNativeSetRemoteAudioPlaybackVolume = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (str == null) {
                LogUtil.e(TAG, "setRemoteAudioPlaybackVolume: roomId is null adjust failed");
                iNativeSetRemoteAudioPlaybackVolume = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (str2 == null) {
                LogUtil.e(TAG, "setRemoteAudioPlaybackVolume: uid is null adjust failed");
                iNativeSetRemoteAudioPlaybackVolume = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                iNativeSetRemoteAudioPlaybackVolume = NativeRTCVideoFunctions.nativeSetRemoteAudioPlaybackVolume(this.mNativeEngine, str, str2, i10);
            }
            return iNativeSetRemoteAudioPlaybackVolume;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setRemoteUserPriority(@n0 String str, @n0 String str2, RemoteUserPriority remoteUserPriority) {
        int iNativeSetRemoteUserPriority;
        LogUtil.d(TAG, "setRemoteUserPriority: uid: " + str2 + ", priority: " + remoteUserPriority);
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setRemoteUserPriority failed.");
                iNativeSetRemoteUserPriority = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (str2 == null) {
                LogUtil.e(TAG, "setRemoteUserPriority: uid is null set failed");
                iNativeSetRemoteUserPriority = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                iNativeSetRemoteUserPriority = NativeRTCVideoFunctions.nativeSetRemoteUserPriority(this.mNativeEngine, str, str2, remoteUserPriority.value());
            }
            return iNativeSetRemoteUserPriority;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setRemoteVideoCanvas(RemoteStreamKey remoteStreamKey, VideoCanvas videoCanvas) {
        int iNativeSetRemoteVideoCanvas;
        this.mJniReadLock.lock();
        if (remoteStreamKey != null) {
            try {
                if (remoteStreamKey.hasNullProperty()) {
                    LogUtil.i(TAG, "EventType: setupRemoteVideo stream_key has null property");
                    iNativeSetRemoteVideoCanvas = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
                } else if (engineInvalid()) {
                    LogUtil.e(TAG, "native engine is invalid, setRemoteVideoCanvas failed.");
                    iNativeSetRemoteVideoCanvas = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
                } else {
                    if (videoCanvas == null) {
                        videoCanvas = new VideoCanvas();
                    }
                    iNativeSetRemoteVideoCanvas = NativeRTCVideoFunctions.nativeSetRemoteVideoCanvas(this.mNativeEngine, remoteStreamKey.getRoomId(), remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value(), videoCanvas.renderView, videoCanvas.renderSurface, videoCanvas.renderMode, videoCanvas.backgroundColor, videoCanvas.renderRotation.value());
                }
            } finally {
                this.mJniReadLock.unlock();
            }
        } else {
            LogUtil.i(TAG, "EventType: setupRemoteVideo stream_key has null property");
            iNativeSetRemoteVideoCanvas = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
        }
        return iNativeSetRemoteVideoCanvas;
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setRemoteVideoMirrorType(RemoteStreamKey remoteStreamKey, RemoteMirrorType remoteMirrorType) {
        int iNativeSetRemoteVideoMirrorType;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setLocalVideoMirrorType failed.");
                iNativeSetRemoteVideoMirrorType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetRemoteVideoMirrorType = NativeRTCVideoFunctions.nativeSetRemoteVideoMirrorType(this.mNativeEngine, remoteStreamKey.getRoomId(), remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value(), remoteMirrorType.value());
            }
            return iNativeSetRemoteVideoMirrorType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setRemoteVideoRender(RemoteStreamKey remoteStreamKey, IVideoSink iVideoSink, RemoteVideoSinkConfig remoteVideoSinkConfig) {
        int iNativeSetRemoteVideoRender;
        this.mJniReadLock.lock();
        try {
            if (remoteStreamKey == null) {
                LogUtil.e(TAG, "EventType: setupRemoteRenderInternal, streamKey is null");
                iNativeSetRemoteVideoRender = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (remoteStreamKey.getStreamIndex() == null) {
                LogUtil.e(TAG, "EventType: setupRemoteRenderInternal, streamIndex is null");
                iNativeSetRemoteVideoRender = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setRemoteVideoSink failed.");
                iNativeSetRemoteVideoRender = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetRemoteVideoRender = NativeRTCVideoFunctions.nativeSetRemoteVideoRender(this.mNativeEngine, remoteStreamKey.getRoomId(), remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value(), iVideoSink != null ? new VideoSinkAdapter(iVideoSink) : null, remoteVideoSinkConfig.pixelFormat, remoteVideoSinkConfig.position.getValue(), remoteVideoSinkConfig.applyRotation.getValue(), remoteVideoSinkConfig.mirrorType.getValue());
            }
            this.mJniReadLock.unlock();
            return iNativeSetRemoteVideoRender;
        } catch (Throwable th2) {
            this.mJniReadLock.unlock();
            throw th2;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setRemoteVideoSink(RemoteStreamKey remoteStreamKey, IVideoSink iVideoSink, int i10) {
        int iNativeSetRemoteVideoSink;
        this.mJniReadLock.lock();
        try {
            if (remoteStreamKey == null) {
                LogUtil.e(TAG, "EventType: setupRemoteRenderInternal, streamKey is null");
                iNativeSetRemoteVideoSink = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (remoteStreamKey.getStreamIndex() == null) {
                LogUtil.e(TAG, "EventType: setupRemoteRenderInternal, streamIndex is null");
                iNativeSetRemoteVideoSink = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setRemoteVideoSink failed.");
                iNativeSetRemoteVideoSink = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetRemoteVideoSink = NativeRTCVideoFunctions.nativeSetRemoteVideoSink(this.mNativeEngine, remoteStreamKey.getRoomId(), remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value(), iVideoSink != null ? new VideoSinkAdapter(iVideoSink) : null, i10);
            }
            this.mJniReadLock.unlock();
            return iNativeSetRemoteVideoSink;
        } catch (Throwable th2) {
            this.mJniReadLock.unlock();
            throw th2;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setRemoteVideoSuperResolution(RemoteStreamKey remoteStreamKey, VideoSuperResolutionMode videoSuperResolutionMode) {
        int iNativeSetRemoteVideoSuperResolution;
        LogUtil.d(TAG, "setRemoteVideoSuperResolution: " + remoteStreamKey.toString() + " " + videoSuperResolutionMode.toString());
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setRemoteVideoSuperResolution failed.");
                iNativeSetRemoteVideoSuperResolution = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetRemoteVideoSuperResolution = NativeRTCVideoFunctions.nativeSetRemoteVideoSuperResolution(this.mNativeEngine, remoteStreamKey.getRoomId(), remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value(), videoSuperResolutionMode.value());
            }
            return iNativeSetRemoteVideoSuperResolution;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setRtcVideoEventHandler(IRTCVideoEventHandler iRTCVideoEventHandler) {
        LogUtil.d(TAG, "setRtcEngineEventHandler");
        this.mRtcEngineHandler = iRTCVideoEventHandler;
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoEx
    public int setRtcVideoEventHandlerEx(IRTCVideoEventHandlerEx iRTCVideoEventHandlerEx) {
        LogUtil.d(TAG, "setRtcEngineEventHandlerEx");
        this.mRtcEngineHandlerEx = iRTCVideoEventHandlerEx;
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setRuntimeParameters(JSONObject jSONObject) {
        int iNativeSetRuntimeParameters;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, SetRuntimeParameters failed.");
                iNativeSetRuntimeParameters = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetRuntimeParameters = NativeRTCVideoFunctions.nativeSetRuntimeParameters(this.mNativeEngine, jSONObject == null ? "" : jSONObject.toString());
            }
            return iNativeSetRuntimeParameters;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setScreenAudioSourceType(AudioSourceType audioSourceType) {
        int iNativeSetScreenAudioSourceType;
        LogUtil.d(TAG, "SetScreenAudioSourceType");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, SetScreenAudioSourceType failed.");
                iNativeSetScreenAudioSourceType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetScreenAudioSourceType = NativeRTCVideoFunctions.nativeSetScreenAudioSourceType(this.mNativeEngine, audioSourceType.value());
            }
            return iNativeSetScreenAudioSourceType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setScreenAudioStreamIndex(StreamIndex streamIndex) {
        int iNativeSetScreenAudioStreamIndex;
        this.mJniReadLock.lock();
        try {
            LogUtil.d(TAG, "SetScreenAudioStreamIndex");
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, SetScreenAudioStreamIndex failed.");
                iNativeSetScreenAudioStreamIndex = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetScreenAudioStreamIndex = NativeRTCVideoFunctions.nativeSetScreenAudioStreamIndex(this.mNativeEngine, streamIndex.value());
            }
            return iNativeSetScreenAudioStreamIndex;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideoEx
    public int setScreenCaptureVolume(int i10) {
        int iNativeSetScreenCaptureVolume;
        LogUtil.d(TAG, "setScreenCaptureVolume");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "native engine is invalid, setScreenCaptureVolume failed.");
                iNativeSetScreenCaptureVolume = -1;
            } else {
                iNativeSetScreenCaptureVolume = NativeRTCVideoFunctionsEx.nativeSetScreenCaptureVolume(this.mNativeEngine, i10);
            }
            return iNativeSetScreenCaptureVolume;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setScreenVideoEncoderConfig(ScreenVideoEncoderConfig screenVideoEncoderConfig) {
        int iNativeSetScreenVideoEncoderConfig;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setScreenVideoEncoderConfig failed.");
                iNativeSetScreenVideoEncoderConfig = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetScreenVideoEncoderConfig = NativeRTCVideoFunctions.nativeSetScreenVideoEncoderConfig(this.mNativeEngine, new InternalScreenVideoEncoderConfig(screenVideoEncoderConfig));
            }
            return iNativeSetScreenVideoEncoderConfig;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setServerParams(String str, String str2) {
        int iNativeSetServerParams;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, sendBinaryMessage failed.");
                iNativeSetServerParams = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetServerParams = NativeRTCVideoFunctions.nativeSetServerParams(this.mNativeEngine, str, str2);
            }
            return iNativeSetServerParams;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setSubscribeFallbackOption(SubscribeFallbackOptions subscribeFallbackOptions) {
        int iNativeSetRemoteSubscribeFallbackOption;
        LogUtil.d(TAG, "setRemoteSubscribeFallbackOption: option: " + subscribeFallbackOptions);
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setRemoteSubscribeFallbackOption failed.");
                iNativeSetRemoteSubscribeFallbackOption = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetRemoteSubscribeFallbackOption = NativeRTCVideoFunctions.nativeSetRemoteSubscribeFallbackOption(this.mNativeEngine, subscribeFallbackOptions.value());
            }
            return iNativeSetRemoteSubscribeFallbackOption;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideoEx
    public int setVideoCaptureConfig(StreamIndex streamIndex, VideoCaptureConfig videoCaptureConfig) {
        int iNativeSetVideoCaptureConfig;
        LogUtil.d(TAG, "setVideoCaptureConfig");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "native engine is invalid, setVideoCaptureConfig failed.");
                iNativeSetVideoCaptureConfig = -1;
            } else {
                iNativeSetVideoCaptureConfig = NativeRTCVideoFunctionsEx.nativeSetVideoCaptureConfig(this.mNativeEngine, streamIndex.value(), new InternalVideoCaptureConfig(videoCaptureConfig.capturePreference.getValue(), videoCaptureConfig.width, videoCaptureConfig.height, videoCaptureConfig.frameRate));
            }
            return iNativeSetVideoCaptureConfig;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoCaptureConfig(VideoCaptureConfig videoCaptureConfig) {
        int iNativeSetVideoCaptureConfig;
        this.mJniReadLock.lock();
        try {
            if (videoCaptureConfig == null) {
                LogUtil.e(TAG, "native engine is invalid or videoCaptureConfig is null, setVideoCaptureConfig failed.");
                iNativeSetVideoCaptureConfig = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid or videoCaptureConfig is null, setVideoCaptureConfig failed.");
                iNativeSetVideoCaptureConfig = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                LogUtil.d(TAG, "setVideoCaptureConfig: " + videoCaptureConfig.toString());
                iNativeSetVideoCaptureConfig = NativeRTCVideoFunctions.nativeSetVideoCaptureConfig(this.mNativeEngine, new InternalVideoCaptureConfig(videoCaptureConfig.capturePreference.getValue(), videoCaptureConfig.width, videoCaptureConfig.height, videoCaptureConfig.frameRate));
            }
            this.mJniReadLock.unlock();
            return iNativeSetVideoCaptureConfig;
        } catch (Throwable th2) {
            this.mJniReadLock.unlock();
            throw th2;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoCaptureRotation(VideoRotation videoRotation) {
        int iNativeSetVideoCaptureRotation;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setVideoCaptureRotation failed.");
                iNativeSetVideoCaptureRotation = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetVideoCaptureRotation = NativeRTCVideoFunctions.nativeSetVideoCaptureRotation(this.mNativeEngine, videoRotation.value());
            }
            return iNativeSetVideoCaptureRotation;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoDecoderConfig(RemoteStreamKey remoteStreamKey, VideoDecoderConfig videoDecoderConfig) {
        int iNativeSetVideoDecoderConfig;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, SetVideoDecoderConfig failed.");
                iNativeSetVideoDecoderConfig = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetVideoDecoderConfig = NativeRTCVideoFunctions.nativeSetVideoDecoderConfig(this.mNativeEngine, remoteStreamKey.getRoomId(), remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value(), videoDecoderConfig.value());
            }
            return iNativeSetVideoDecoderConfig;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoDenoiser(VideoDenoiseMode videoDenoiseMode) {
        int iNativeSetVideoDenoiser;
        LogUtil.d(TAG, "setVideoDenoiser: " + videoDenoiseMode.toString());
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setVideoDenoiser failed.");
                iNativeSetVideoDenoiser = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetVideoDenoiser = NativeRTCVideoFunctions.nativeSetVideoDenoiser(this.mNativeEngine, videoDenoiseMode.value());
            }
            return iNativeSetVideoDenoiser;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoDigitalZoomConfig(ZoomConfigType zoomConfigType, float f10) {
        int iNativeSetVideoDigitalZoomConfig;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setVideoDigitalZoomConfig failed.");
                iNativeSetVideoDigitalZoomConfig = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetVideoDigitalZoomConfig = NativeRTCVideoFunctions.nativeSetVideoDigitalZoomConfig(this.mNativeEngine, zoomConfigType.value(), f10);
            }
            return iNativeSetVideoDigitalZoomConfig;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoDigitalZoomControl(ZoomDirectionType zoomDirectionType) {
        int iNativeSetVideoDigitalZoomControl;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setVideoDigitalZoomControl failed.");
                iNativeSetVideoDigitalZoomControl = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetVideoDigitalZoomControl = NativeRTCVideoFunctions.nativeSetVideoDigitalZoomControl(this.mNativeEngine, zoomDirectionType.value());
            }
            return iNativeSetVideoDigitalZoomControl;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoEffectAlgoModelPath(String str) {
        int iNativeSetVideoEffectAlgoModelPath;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setVideoEffectAlgoModelPath failed.");
                iNativeSetVideoEffectAlgoModelPath = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetVideoEffectAlgoModelPath = NativeRTCVideoFunctions.nativeSetVideoEffectAlgoModelPath(this.mNativeEngine, str);
            }
            return iNativeSetVideoEffectAlgoModelPath;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoEffectAlgoModelResourceFinder(long j10, long j11) {
        RTCVideoEffect rTCVideoEffect = this.mAdvanceVideoEffect;
        return rTCVideoEffect == null ? ErrorCode.ERROR_CODE_KICKED_OUT : rTCVideoEffect.setAlgoModelResourceFinder(j10, j11);
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoEffectColorFilter(String str) {
        RTCVideoEffect rTCVideoEffect = this.mAdvanceVideoEffect;
        return rTCVideoEffect == null ? ErrorCode.ERROR_CODE_KICKED_OUT : rTCVideoEffect.setColorFilter(str);
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoEffectColorFilterIntensity(float f10) {
        RTCVideoEffect rTCVideoEffect = this.mAdvanceVideoEffect;
        return rTCVideoEffect == null ? ErrorCode.ERROR_CODE_KICKED_OUT : rTCVideoEffect.setColorFilterIntensity(f10);
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoEffectExpressionDetect(VideoEffectExpressionConfig videoEffectExpressionConfig) {
        RTCVideoEffect rTCVideoEffect = this.mAdvanceVideoEffect;
        return rTCVideoEffect == null ? ErrorCode.ERROR_CODE_KICKED_OUT : rTCVideoEffect.setVideoEffectExpressionDetect(videoEffectExpressionConfig);
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoEffectNodes(List<String> list) {
        RTCVideoEffect rTCVideoEffect = this.mAdvanceVideoEffect;
        return rTCVideoEffect == null ? ErrorCode.ERROR_CODE_KICKED_OUT : rTCVideoEffect.setEffectNodes(list);
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoEncoderConfig(VideoEncoderConfig videoEncoderConfig) {
        return setVideoEncoderConfig(videoEncoderConfig, (JSONObject) null);
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoEncoderConfig(VideoEncoderConfig videoEncoderConfig, JSONObject jSONObject) {
        int iNativeSetVideoEncoderConfigV3;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setVideoResolutions failed.");
                iNativeSetVideoEncoderConfigV3 = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetVideoEncoderConfigV3 = NativeRTCVideoFunctions.nativeSetVideoEncoderConfigV3(this.mNativeEngine, new InternalVideoEncoderConfig(videoEncoderConfig), jSONObject != null ? jSONObject.toString() : "");
            }
            return iNativeSetVideoEncoderConfigV3;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoEncoderConfig(StreamIndex streamIndex, List<VideoStreamDescription> list) {
        int iNativeSetVideoEncoderConfig;
        this.mJniReadLock.lock();
        if (list == null) {
            try {
                list = new ArrayList<>();
            } finally {
                this.mJniReadLock.unlock();
            }
        }
        if (engineInvalid()) {
            LogUtil.e(TAG, "native engine is invalid, setVideoResolutions failed.");
            iNativeSetVideoEncoderConfig = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        } else {
            ArrayList arrayList = new ArrayList();
            for (VideoStreamDescription videoStreamDescription : list) {
                if (streamIndex != StreamIndex.STREAM_INDEX_MAIN || videoStreamDescription.isValid()) {
                    arrayList.add(new InternalVideoStreamDescription(videoStreamDescription));
                } else {
                    LogUtil.e(TAG, "setVideoResolutions with illegal params");
                    iNativeSetVideoEncoderConfig = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
                }
            }
            iNativeSetVideoEncoderConfig = NativeRTCVideoFunctions.nativeSetVideoEncoderConfig(this.mNativeEngine, streamIndex.value(), arrayList);
        }
        return iNativeSetVideoEncoderConfig;
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoEncoderConfig(List<VideoStreamDescription> list, VideoEncoderConfiguration.OrientationMode orientationMode) {
        int videoEncoderConfig;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setVideoResolutions failed.");
                videoEncoderConfig = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                RTCData.instance().setOrientationMode(orientationMode);
                videoEncoderConfig = setVideoEncoderConfig(StreamIndex.STREAM_INDEX_MAIN, list);
            }
            return videoEncoderConfig;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoEncoderConfig(VideoEncoderConfig[] videoEncoderConfigArr) {
        int iNativeSetVideoEncoderConfigV2;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setVideoEncoderConfig failed.");
                iNativeSetVideoEncoderConfigV2 = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (videoEncoderConfigArr == null) {
                iNativeSetVideoEncoderConfigV2 = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                ArrayList arrayList = new ArrayList();
                for (VideoEncoderConfig videoEncoderConfig : videoEncoderConfigArr) {
                    if (videoEncoderConfig.isValid()) {
                        arrayList.add(new InternalVideoEncoderConfig(videoEncoderConfig));
                    } else {
                        LogUtil.e(TAG, "setVideoEncoderConfig with illegal params");
                        iNativeSetVideoEncoderConfigV2 = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
                    }
                }
                iNativeSetVideoEncoderConfigV2 = NativeRTCVideoFunctions.nativeSetVideoEncoderConfigV2(this.mNativeEngine, arrayList);
            }
            return iNativeSetVideoEncoderConfigV2;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoOrientation(VideoOrientation videoOrientation) {
        int iNativeSetVideoOrientation;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setVideoOrientation failed.");
                iNativeSetVideoOrientation = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetVideoOrientation = NativeRTCVideoFunctions.nativeSetVideoOrientation(this.mNativeEngine, videoOrientation.value());
            }
            return iNativeSetVideoOrientation;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoRotationMode(VideoRotationMode videoRotationMode) {
        int iNativeSetVideoRotationMode;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setVideoRotationMode failed.");
                iNativeSetVideoRotationMode = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetVideoRotationMode = NativeRTCVideoFunctions.nativeSetVideoRotationMode(this.mNativeEngine, videoRotationMode.value());
            }
            return iNativeSetVideoRotationMode;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideoEx
    public int setVideoSource(StreamIndex streamIndex, InternalVideoSourceConfig internalVideoSourceConfig) {
        int iNativeSetVideoSource;
        LogUtil.d(TAG, "setVideoSource");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "native engine is invalid, setVideoSource failed.");
                iNativeSetVideoSource = -1;
            } else {
                iNativeSetVideoSource = NativeRTCVideoFunctionsEx.nativeSetVideoSource(this.mNativeEngine, streamIndex.value(), internalVideoSourceConfig.getVideoSourceType(), internalVideoSourceConfig.getVideoSourceCategory());
            }
            return iNativeSetVideoSource;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoSourceType(StreamIndex streamIndex, VideoSourceType videoSourceType) {
        int iNativeSetVideoSourceTypeWithStreamId;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setVideoInputType failed.");
                iNativeSetVideoSourceTypeWithStreamId = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetVideoSourceTypeWithStreamId = NativeRTCVideoFunctions.nativeSetVideoSourceTypeWithStreamId(this.mNativeEngine, streamIndex.value(), videoSourceType.value());
            }
            return iNativeSetVideoSourceTypeWithStreamId;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoWatermark(StreamIndex streamIndex, String str, RTCWatermarkConfig rTCWatermarkConfig) {
        int iValue;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "native engine is invalid, muteAudioPlayback failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                ByteWatermark byteWatermark = rTCWatermarkConfig.positionInLandscapeMode;
                if (byteWatermark != null) {
                    float f18 = byteWatermark.f98038x;
                    float f19 = byteWatermark.f98039y;
                    float f20 = byteWatermark.width;
                    f13 = byteWatermark.height;
                    f10 = f18;
                    f11 = f19;
                    f12 = f20;
                } else {
                    f10 = 0.0f;
                    f11 = 0.0f;
                    f12 = 0.0f;
                    f13 = 0.0f;
                }
                ByteWatermark byteWatermark2 = rTCWatermarkConfig.positionInPortraitMode;
                if (byteWatermark2 != null) {
                    float f21 = byteWatermark2.f98038x;
                    float f22 = byteWatermark2.f98039y;
                    float f23 = byteWatermark2.width;
                    f17 = byteWatermark2.height;
                    f14 = f21;
                    f15 = f22;
                    f16 = f23;
                } else {
                    f14 = 0.0f;
                    f15 = 0.0f;
                    f16 = 0.0f;
                    f17 = 0.0f;
                }
                iValue = NativeRTCVideoFunctions.nativeSetVideoWatermark(this.mNativeEngine, streamIndex.value(), str, rTCWatermarkConfig.visibleInPreview, f10, f11, f12, f13, f14, f15, f16, f17);
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVoiceChangerType(VoiceChangerType voiceChangerType) {
        int iNativeSetVoiceChangerType;
        LogUtil.d(TAG, "setVoiceChangerType...voiceChanger: " + voiceChangerType);
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setVoiceChangerType failed.");
                iNativeSetVoiceChangerType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetVoiceChangerType = NativeRTCVideoFunctions.nativeSetVoiceChangerType(this.mNativeEngine, voiceChangerType.value());
            }
            return iNativeSetVoiceChangerType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVoiceReverbType(VoiceReverbType voiceReverbType) {
        int iNativeSetVoiceReverbType;
        LogUtil.d(TAG, "setVoiceReverbType...voiceReverb: " + voiceReverbType);
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, setVoiceReverbType failed.");
                iNativeSetVoiceReverbType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetVoiceReverbType = NativeRTCVideoFunctions.nativeSetVoiceReverbType(this.mNativeEngine, voiceReverbType.value());
            }
            return iNativeSetVoiceReverbType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int startASR(RTCASRConfig rTCASRConfig, IRTCASREngineEventHandler iRTCASREngineEventHandler) {
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, startASR");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (iRTCASREngineEventHandler == null || rTCASRConfig == null) {
                iValue = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                String str = rTCASRConfig.userId;
                String str2 = str == null ? "" : str;
                String str3 = rTCASRConfig.appId;
                String str4 = str3 == null ? "" : str3;
                String str5 = rTCASRConfig.accessToken;
                String str6 = str5 == null ? "" : str5;
                String str7 = rTCASRConfig.secretKey;
                String str8 = str7 == null ? "" : str7;
                int iValue2 = rTCASRConfig.authorizationType.value();
                String str9 = rTCASRConfig.cluster;
                String str10 = str9 == null ? "" : str9;
                this.mRTCASREngineEventHandler.setAsrEventHandler(iRTCASREngineEventHandler);
                iValue = NativeRTCVideoFunctions.nativeStartASR(this.mNativeEngine, this.mRTCASREngineEventHandler, str2, str4, str6, str8, iValue2, str10);
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int startAudioCapture() {
        int iNativeStartAudioCapture;
        LogUtil.d(TAG, "startAudioCapture");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, startAudioCapture failed.");
                iNativeStartAudioCapture = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStartAudioCapture = NativeRTCVideoFunctions.nativeStartAudioCapture(this.mNativeEngine);
            }
            return iNativeStartAudioCapture;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int startAudioRecording(AudioRecordingConfig audioRecordingConfig) {
        int iNativeStartAudioRecording;
        LogUtil.d(TAG, "startAudioRecording");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, startFileRecording failed.");
                iNativeStartAudioRecording = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStartAudioRecording = NativeRTCVideoFunctions.nativeStartAudioRecording(this.mNativeEngine, audioRecordingConfig.absoluteFileName, audioRecordingConfig.sampleRate.value(), audioRecordingConfig.channel.value(), audioRecordingConfig.frameSource.value(), audioRecordingConfig.quality.value());
            }
            return iNativeStartAudioRecording;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int startChorusCacheSync(ChorusCacheSyncConfig chorusCacheSyncConfig, IChorusCacheSyncObserver iChorusCacheSyncObserver) {
        int iNativeStartChorusCacheSync;
        this.mJniReadLock.lock();
        if (iChorusCacheSyncObserver != null) {
            try {
                this.mChorusObserver.setUserObserver(iChorusCacheSyncObserver);
            } finally {
                this.mJniReadLock.unlock();
            }
        }
        LogUtil.d(TAG, "startChorusCacheSync...");
        if (chorusCacheSyncConfig == null) {
            LogUtil.d(TAG, "startChorusCacheSync...chorusConfig is null, no effect, please check.");
            iNativeStartChorusCacheSync = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
        } else if (engineInvalid()) {
            LogUtil.e(TAG, "native engine is invalid, startChorusCacheSync failed.");
            iNativeStartChorusCacheSync = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        } else {
            iNativeStartChorusCacheSync = NativeRTCVideoFunctions.nativeStartChorusCacheSync(this.mNativeEngine, chorusCacheSyncConfig, this.mChorusObserver);
        }
        return iNativeStartChorusCacheSync;
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int startCloudProxy(List<CloudProxyInfo> list) {
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "native engine is invalid, startCloudProxy failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (list == null) {
                iValue = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<CloudProxyInfo> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new InternalCloudProxyInfo(it.next()));
                }
                iValue = NativeRTCVideoFunctions.nativeStartCloudProxy(this.mNativeEngine, arrayList);
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int startEchoTest(EchoTestConfig echoTestConfig, int i10) {
        int iNativeStartEchoTest;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, startEchoTest failed.");
                iNativeStartEchoTest = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                LogUtil.d(TAG, "startEchoTest");
                iNativeStartEchoTest = NativeRTCVideoFunctions.nativeStartEchoTest(this.mNativeEngine, echoTestConfig, i10);
            }
            return iNativeStartEchoTest;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int startFileRecording(StreamIndex streamIndex, RecordingConfig recordingConfig, RecordingType recordingType) {
        int iNativeStartFileRecording;
        LogUtil.d(TAG, "startFileRecording");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, startFileRecording failed.");
                iNativeStartFileRecording = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStartFileRecording = NativeRTCVideoFunctions.nativeStartFileRecording(this.mNativeEngine, streamIndex.value(), recordingConfig.dirPath, recordingConfig.recordingFileType.value(), recordingType.value());
            }
            return iNativeStartFileRecording;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int startHardwareEchoDetection(String str) {
        int iNativeStartHardwareEchoDetection;
        LogUtil.d(TAG, "startHardwareEchoDetection");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "native engine is invalid, startHardwareEchoDetection failed.");
                iNativeStartHardwareEchoDetection = -2;
            } else {
                iNativeStartHardwareEchoDetection = NativeRTCVideoFunctions.nativeStartHardwareEchoDetection(this.mNativeEngine, str);
            }
            return iNativeStartHardwareEchoDetection;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int startLiveTranscoding(String str, LiveTranscoding liveTranscoding, ILiveTranscodingObserver iLiveTranscodingObserver) {
        int iNativeStartLiveTranscoding;
        this.mJniReadLock.lock();
        try {
            this.mLiveTranscodingObserver = iLiveTranscodingObserver;
            LiveTranscodingObserver liveTranscodingObserver = this.mTranscodingObserver;
            if (liveTranscodingObserver != null) {
                liveTranscodingObserver.setUserObserver(str, iLiveTranscodingObserver);
            }
            LogUtil.d(TAG, "enableLiveTranscoding...");
            if (liveTranscoding == null) {
                LogUtil.d(TAG, "enableLiveTranscoding...liveTranscode is null, no effect, please check.");
                iNativeStartLiveTranscoding = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, enableLiveTranscoding failed.");
                iNativeStartLiveTranscoding = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                this.mEnableTranscode = true;
                this.mLiveTranscoding = liveTranscoding;
                liveTranscoding.setAction("started");
                if (this.mLiveTranscoding.getTranscodeMessage() == null) {
                    iNativeStartLiveTranscoding = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
                } else {
                    LogUtil.d(TAG, "enableLiveTranscoding...");
                    iNativeStartLiveTranscoding = NativeRTCVideoFunctions.nativeStartLiveTranscoding(this.mNativeEngine, str, liveTranscoding, this.mTranscodingObserver);
                }
            }
            return iNativeStartLiveTranscoding;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int startNetworkDetection(boolean z10, int i10, boolean z11, int i11) {
        int iNativeStartNetworkProbe;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, sendCustomMessage failed.");
                iNativeStartNetworkProbe = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStartNetworkProbe = NativeRTCVideoFunctions.nativeStartNetworkProbe(this.mNativeEngine, z10, i10, z11, i11);
            }
            return iNativeStartNetworkProbe;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int startPlayPublicStream(String str) {
        int iNativeStartPlayPublicStream;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, startPlayPublicStream failed.");
                iNativeStartPlayPublicStream = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                LogUtil.d(TAG, "startPlayPublicStream...public stream id: " + str);
                iNativeStartPlayPublicStream = NativeRTCVideoFunctions.nativeStartPlayPublicStream(this.mNativeEngine, str);
            }
            return iNativeStartPlayPublicStream;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int startPushMixedStreamToCDN(String str, MixedStreamConfig mixedStreamConfig, IMixedStreamObserver iMixedStreamObserver) {
        this.mJniReadLock.lock();
        try {
            LogUtil.d(TAG, "startPushMixedStreamToCDN...");
            if (mixedStreamConfig == null) {
                LogUtil.d(TAG, "startPushMixedStreamToCDN...liveTranscode is null, no effect, please check.");
            } else if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, enableLiveTranscoding failed.");
            } else {
                this.mEnableTranscode = true;
                if (mixedStreamConfig.getTranscodeMessage() != null) {
                    PushMixedStreamToCDNObserver pushMixedStreamToCDNObserver = this.mMixedStreamToCDNObserver;
                    if (pushMixedStreamToCDNObserver != null) {
                        pushMixedStreamToCDNObserver.setUserObserver(str, iMixedStreamObserver);
                    }
                    LogUtil.d(TAG, "startPushMixedStreamToCDN...");
                    return NativeRTCVideoFunctions.nativeStartPushMixedStreamToCDN(this.mNativeEngine, str, mixedStreamConfig, this.mMixedStreamToCDNObserver);
                }
            }
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int startPushPublicStream(String str, PublicStreaming publicStreaming) {
        int iNativeStartPushPublicStream;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, startPushPublicStream failed.");
                iNativeStartPushPublicStream = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (publicStreaming == null) {
                LogUtil.e(TAG, "startPushPublicStream failed for publicStreaming is null.");
                iNativeStartPushPublicStream = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                publicStreaming.setAction("started");
                JSONObject publicStreamMessage = publicStreaming.getPublicStreamMessage();
                if (publicStreamMessage == null) {
                    LogUtil.e(TAG, "public stream parameter is invalid, startPushPublicStream failed.");
                    iNativeStartPushPublicStream = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
                } else {
                    String string = publicStreamMessage.toString();
                    LogUtil.d(TAG, "startPushPublicStream...public stream parameter: " + string);
                    iNativeStartPushPublicStream = NativeRTCVideoFunctions.nativeStartPushPublicStream(this.mNativeEngine, str, string);
                }
            }
            return iNativeStartPushPublicStream;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int startPushSingleStreamToCDN(String str, PushSingleStreamParam pushSingleStreamParam, IPushSingleStreamToCDNObserver iPushSingleStreamToCDNObserver) {
        int iNativeStartPushSingleStreamToCDN;
        this.mJniReadLock.lock();
        try {
            PushSingleStreamToCDNObserver pushSingleStreamToCDNObserver = this.mSingleStreamToCDNObserver;
            if (pushSingleStreamToCDNObserver != null) {
                pushSingleStreamToCDNObserver.setUserObserver(str, iPushSingleStreamToCDNObserver);
            }
            LogUtil.d(TAG, "startSingleStreamToCDN...");
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, startSingleStreamToCDN failed.");
                iNativeStartPushSingleStreamToCDN = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStartPushSingleStreamToCDN = NativeRTCVideoFunctions.nativeStartPushSingleStreamToCDN(this.mNativeEngine, str, pushSingleStreamParam.roomId, pushSingleStreamParam.userId, pushSingleStreamParam.url, pushSingleStreamParam.isScreen, this.mSingleStreamToCDNObserver);
            }
            return iNativeStartPushSingleStreamToCDN;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int startScreenCapture(ScreenMediaType screenMediaType, Intent intent) {
        int iNativeStartScreenCapture;
        LogUtil.d(TAG, "StartScreenAudioCapture");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, StopScreenAudioCapture failed.");
                iNativeStartScreenCapture = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStartScreenCapture = NativeRTCVideoFunctions.nativeStartScreenCapture(this.mNativeEngine, screenMediaType.value(), intent);
            }
            return iNativeStartScreenCapture;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int startVideoCapture() {
        int iNativeStartVideoCapture;
        LogUtil.d(TAG, "startVideoCapture");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, startVideoCapture failed.");
                iNativeStartVideoCapture = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStartVideoCapture = NativeRTCVideoFunctions.nativeStartVideoCapture(this.mNativeEngine);
            }
            return iNativeStartVideoCapture;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideoEx
    public int startVideoCapture(StreamIndex streamIndex, String str) {
        int iNativeStartVideoCapture;
        LogUtil.d(TAG, "startVideoCapture");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "native engine is invalid, startVideoCapture failed.");
                iNativeStartVideoCapture = -1;
            } else {
                iNativeStartVideoCapture = NativeRTCVideoFunctionsEx.nativeStartVideoCapture(this.mNativeEngine, streamIndex.value(), str);
            }
            return iNativeStartVideoCapture;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int startVideoDigitalZoomControl(ZoomDirectionType zoomDirectionType) {
        int iNativeStartVideoDigitalZoomControl;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, startVideoDigitalZoomControl failed.");
                iNativeStartVideoDigitalZoomControl = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStartVideoDigitalZoomControl = NativeRTCVideoFunctions.nativeStartVideoDigitalZoomControl(this.mNativeEngine, zoomDirectionType.value());
            }
            return iNativeStartVideoDigitalZoomControl;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int stopASR() {
        int iNativeStopASR;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, stopASR");
                iNativeStopASR = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStopASR = NativeRTCVideoFunctions.nativeStopASR(this.mNativeEngine);
            }
            return iNativeStopASR;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int stopAudioCapture() {
        int iNativeStopAudioCapture;
        LogUtil.d(TAG, "stopAudioCapture");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, stopAudioCapture failed.");
                iNativeStopAudioCapture = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStopAudioCapture = NativeRTCVideoFunctions.nativeStopAudioCapture(this.mNativeEngine);
            }
            return iNativeStopAudioCapture;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int stopAudioRecording() {
        int iNativeStopAudioRecording;
        LogUtil.d(TAG, "startAudioRecording");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, startFileRecording failed.");
                iNativeStopAudioRecording = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStopAudioRecording = NativeRTCVideoFunctions.nativeStopAudioRecording(this.mNativeEngine);
            }
            return iNativeStopAudioRecording;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int stopChorusCacheSync() {
        int iNativeStopChorusCacheSync;
        LogUtil.d(TAG, "stopChorusCacheSync...");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, stopChorusCacheSync failed.");
                iNativeStopChorusCacheSync = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStopChorusCacheSync = NativeRTCVideoFunctions.nativeStopChorusCacheSync(this.mNativeEngine);
            }
            return iNativeStopChorusCacheSync;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int stopCloudProxy() {
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "native engine is invalid, stopCloudProxy failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iValue = NativeRTCVideoFunctions.nativeStopCloudProxy(this.mNativeEngine);
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int stopEchoTest() {
        int iNativeStopEchoTest;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, stopEchoTest failed.");
                iNativeStopEchoTest = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                LogUtil.d(TAG, "stopEchoTest");
                iNativeStopEchoTest = NativeRTCVideoFunctions.nativeStopEchoTest(this.mNativeEngine);
            }
            return iNativeStopEchoTest;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int stopFileRecording(StreamIndex streamIndex) {
        int iNativeStopFileRecording;
        LogUtil.d(TAG, "stopFileRecording");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, stopFileRecording failed.");
                iNativeStopFileRecording = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStopFileRecording = NativeRTCVideoFunctions.nativeStopFileRecording(this.mNativeEngine, streamIndex.value());
            }
            return iNativeStopFileRecording;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int stopHardwareEchoDetection() {
        int iNativeStopHardwareEchoDetection;
        LogUtil.d(TAG, "stopHardwareEchoDetection");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "native engine is invalid, stopHardwareEchoDetection failed.");
                iNativeStopHardwareEchoDetection = -2;
            } else {
                iNativeStopHardwareEchoDetection = NativeRTCVideoFunctions.nativeStopHardwareEchoDetection(this.mNativeEngine);
            }
            return iNativeStopHardwareEchoDetection;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int stopLiveTranscoding(String str) {
        int iNativeStopLiveTranscoding;
        LogUtil.d(TAG, "disableLiveTranscoding...");
        this.mJniReadLock.lock();
        try {
            this.mEnableTranscode = false;
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, disableLiveTranscoding failed.");
                iNativeStopLiveTranscoding = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStopLiveTranscoding = NativeRTCVideoFunctions.nativeStopLiveTranscoding(this.mNativeEngine, str);
            }
            return iNativeStopLiveTranscoding;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int stopNetworkDetection() {
        int iNativeStopNetworkProbe;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, sendCustomMessage failed.");
                iNativeStopNetworkProbe = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStopNetworkProbe = NativeRTCVideoFunctions.nativeStopNetworkProbe(this.mNativeEngine);
            }
            return iNativeStopNetworkProbe;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int stopPlayPublicStream(String str) {
        int iNativeStopPlayPublicStream;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, stopPlayPublicStream failed.");
                iNativeStopPlayPublicStream = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                LogUtil.d(TAG, "startPlayPublicStream...public stream id: " + str);
                iNativeStopPlayPublicStream = NativeRTCVideoFunctions.nativeStopPlayPublicStream(this.mNativeEngine, str);
            }
            return iNativeStopPlayPublicStream;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int stopPushPublicStream(String str) {
        int iNativeStopPushPublicStream;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, stopPushPublicStream failed.");
                iNativeStopPushPublicStream = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStopPushPublicStream = NativeRTCVideoFunctions.nativeStopPushPublicStream(this.mNativeEngine, str);
            }
            return iNativeStopPushPublicStream;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int stopPushStreamToCDN(String str) {
        int iNativeStopPushStreamToCDN;
        LogUtil.d(TAG, "stopPushStreamToCDN...");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, stopPushStreamToCDN failed.");
                iNativeStopPushStreamToCDN = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStopPushStreamToCDN = NativeRTCVideoFunctions.nativeStopPushStreamToCDN(this.mNativeEngine, str);
            }
            return iNativeStopPushStreamToCDN;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int stopScreenCapture() {
        int iNativeStopScreenCapture;
        LogUtil.d(TAG, "StopScreenCapture");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, StopScreenAudioCapture failed.");
                iNativeStopScreenCapture = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStopScreenCapture = NativeRTCVideoFunctions.nativeStopScreenCapture(this.mNativeEngine);
            }
            return iNativeStopScreenCapture;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int stopVideoCapture() {
        int iNativeStopVideoCapture;
        LogUtil.d(TAG, "stopVideoCapture");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, stopVideoCapture failed.");
                iNativeStopVideoCapture = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStopVideoCapture = NativeRTCVideoFunctions.nativeStopVideoCapture(this.mNativeEngine);
            }
            return iNativeStopVideoCapture;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideoEx
    public int stopVideoCapture(StreamIndex streamIndex) {
        int iNativeStopVideoCapture;
        LogUtil.d(TAG, "stopVideoCapture");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.e(TAG, "native engine is invalid, stopVideoCapture failed.");
                iNativeStopVideoCapture = -1;
            } else {
                iNativeStopVideoCapture = NativeRTCVideoFunctionsEx.nativeStopVideoCapture(this.mNativeEngine, streamIndex.value());
            }
            return iNativeStopVideoCapture;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int stopVideoDigitalZoomControl() {
        int iNativeStopVideoDigitalZoomControl;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, stopVideoDigitalZoomControl failed.");
                iNativeStopVideoDigitalZoomControl = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStopVideoDigitalZoomControl = NativeRTCVideoFunctions.nativeStopVideoDigitalZoomControl(this.mNativeEngine);
            }
            return iNativeStopVideoDigitalZoomControl;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int switchCamera(CameraId cameraId) {
        int iNativeSwitchCamera;
        LogUtil.d(TAG, "switchCamera");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, switchCamera failed.");
                iNativeSwitchCamera = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSwitchCamera = NativeRTCVideoFunctions.nativeSwitchCamera(this.mNativeEngine, cameraId.value());
                this.mIsFront = !this.mIsFront;
            }
            return iNativeSwitchCamera;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public long takeLocalSnapshot(StreamIndex streamIndex, ISnapshotResultCallback iSnapshotResultCallback) {
        long jNativeTakeLocalSnapshot;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, takeLocalSnapshot failed.");
                jNativeTakeLocalSnapshot = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                jNativeTakeLocalSnapshot = NativeRTCVideoFunctions.nativeTakeLocalSnapshot(this.mNativeEngine, streamIndex.value(), iSnapshotResultCallback);
            }
            return jNativeTakeLocalSnapshot;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public long takeRemoteSnapshot(RemoteStreamKey remoteStreamKey, ISnapshotResultCallback iSnapshotResultCallback) {
        long jNativeTakeRemoteSnapshot;
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid()) {
                if (remoteStreamKey == null) {
                    LogUtil.e(TAG, "EventType: setupRemoteRenderInternal, streamKey is null");
                } else if (remoteStreamKey.getStreamIndex() == null) {
                    LogUtil.e(TAG, "EventType: setupRemoteRenderInternal, streamIndex is null");
                } else {
                    jNativeTakeRemoteSnapshot = NativeRTCVideoFunctions.nativeTakeRemoteSnapshot(this.mNativeEngine, remoteStreamKey.getRoomId(), remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value(), iSnapshotResultCallback);
                }
                return -1L;
            }
            LogUtil.e(TAG, "native engine is invalid, takeRemoteSnapshot failed.");
            jNativeTakeRemoteSnapshot = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            return jNativeTakeRemoteSnapshot;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int updateLiveTranscoding(String str, LiveTranscoding liveTranscoding) {
        int iNativeUpdateLiveTranscoding;
        LogUtil.d(TAG, "updateLiveTranscoding...");
        this.mJniReadLock.lock();
        try {
            if (liveTranscoding == null) {
                LogUtil.d(TAG, "updateLiveTranscoding...mLiveTranscoding is null, no effect, please check.");
                iNativeUpdateLiveTranscoding = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, updateLiveTranscoding failed.");
                iNativeUpdateLiveTranscoding = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                liveTranscoding.setAction("layoutChanged");
                if (liveTranscoding.getTranscodeMessage() == null) {
                    iNativeUpdateLiveTranscoding = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
                } else {
                    LogUtil.d(TAG, "updateLiveTranscoding...");
                    iNativeUpdateLiveTranscoding = NativeRTCVideoFunctions.nativeUpdateLiveTranscoding(this.mNativeEngine, str, liveTranscoding);
                }
            }
            this.mJniReadLock.unlock();
            return iNativeUpdateLiveTranscoding;
        } catch (Throwable th2) {
            this.mJniReadLock.unlock();
            throw th2;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int updateLocalVideoCanvas(StreamIndex streamIndex, int i10, int i11) {
        int iNativeUpdateLocalVideoCanvas;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, updateLocalVideoCanvas failed.");
                iNativeUpdateLocalVideoCanvas = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeUpdateLocalVideoCanvas = NativeRTCVideoFunctions.nativeUpdateLocalVideoCanvas(this.mNativeEngine, streamIndex.value(), i10, i11);
            }
            return iNativeUpdateLocalVideoCanvas;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int updateLoginToken(String str) {
        int iNativeUpdateLoginToken;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, sendBinaryMessage failed.");
                iNativeUpdateLoginToken = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeUpdateLoginToken = NativeRTCVideoFunctions.nativeUpdateLoginToken(this.mNativeEngine, str);
            }
            return iNativeUpdateLoginToken;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int updatePublicStreamParam(String str, PublicStreaming publicStreaming) {
        int iNativeUpdatePublicStreamParam;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, updatePublicStreamParam failed.");
                iNativeUpdatePublicStreamParam = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (publicStreaming == null) {
                LogUtil.e(TAG, "updatePublicStreamParam failed for publicStreaming is null.");
                iNativeUpdatePublicStreamParam = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                publicStreaming.setAction("layoutChanged");
                JSONObject publicStreamMessage = publicStreaming.getPublicStreamMessage();
                if (publicStreamMessage == null) {
                    LogUtil.e(TAG, "public stream parameter is invalid, updatePublicStreamParam failed.");
                    iNativeUpdatePublicStreamParam = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
                } else {
                    String string = publicStreamMessage.toString();
                    LogUtil.d(TAG, "updatePublicStreamParam...public stream parameter: " + string);
                    iNativeUpdatePublicStreamParam = NativeRTCVideoFunctions.nativeUpdatePublicStreamParam(this.mNativeEngine, str, string);
                }
            }
            return iNativeUpdatePublicStreamParam;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int updatePushMixedStreamToCDN(String str, MixedStreamConfig mixedStreamConfig) {
        this.mJniReadLock.lock();
        try {
            LogUtil.d(TAG, "updatePushMixedStreamToCDN...");
            if (mixedStreamConfig == null) {
                LogUtil.d(TAG, "updatePushMixedStreamToCDN...mLiveTranscoding is null, no effect, please check.");
            } else if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, updatePushMixedStreamToCDN failed.");
            } else if (mixedStreamConfig.getTranscodeMessage() != null) {
                LogUtil.d(TAG, "updatePushMixedStreamToCDN...");
                return NativeRTCVideoFunctions.nativeUpdatePushMixedStreamToCDN(this.mNativeEngine, str, mixedStreamConfig);
            }
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int updateRemoteStreamVideoCanvas(RemoteStreamKey remoteStreamKey, int i10, int i11) {
        RemoteVideoRenderConfig remoteVideoRenderConfig = new RemoteVideoRenderConfig();
        remoteVideoRenderConfig.renderMode = i10;
        remoteVideoRenderConfig.backgroundColor = i11;
        return updateRemoteStreamVideoCanvas(remoteStreamKey, remoteVideoRenderConfig);
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int updateRemoteStreamVideoCanvas(RemoteStreamKey remoteStreamKey, RemoteVideoRenderConfig remoteVideoRenderConfig) {
        int iNativeUpdateRemoteVideoCanvas;
        this.mJniReadLock.lock();
        try {
            if (remoteStreamKey == null) {
                LogUtil.e(TAG, "EventType: updateRemoteStreamVideoCanvas, streamKey is null");
                iNativeUpdateRemoteVideoCanvas = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (remoteStreamKey.hasNullProperty()) {
                LogUtil.e(TAG, "EventType: updateRemoteStreamVideoCanvas, hasNullProperty");
                iNativeUpdateRemoteVideoCanvas = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, updateRemoteStreamVideoCanvas failed.");
                iNativeUpdateRemoteVideoCanvas = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeUpdateRemoteVideoCanvas = NativeRTCVideoFunctions.nativeUpdateRemoteVideoCanvas(this.mNativeEngine, remoteStreamKey.getRoomId(), remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value(), remoteVideoRenderConfig.renderMode, remoteVideoRenderConfig.backgroundColor, remoteVideoRenderConfig.renderRotation.value());
            }
            this.mJniReadLock.unlock();
            return iNativeUpdateRemoteVideoCanvas;
        } catch (Throwable th2) {
            this.mJniReadLock.unlock();
            throw th2;
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int updateScreenCapture(ScreenMediaType screenMediaType) {
        int iNativeUpdateScreenCapture;
        LogUtil.d(TAG, "UpdateScreenCapture");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e(TAG, "native engine is invalid, StopScreenAudioCapture failed.");
                iNativeUpdateScreenCapture = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeUpdateScreenCapture = NativeRTCVideoFunctions.nativeUpdateScreenCapture(this.mNativeEngine, screenMediaType.value());
            }
            return iNativeUpdateScreenCapture;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int updateVideoEffectNode(String str, String str2, float f10) {
        RTCVideoEffect rTCVideoEffect = this.mAdvanceVideoEffect;
        return rTCVideoEffect == null ? ErrorCode.ERROR_CODE_KICKED_OUT : rTCVideoEffect.updateEffectNode(str, str2, f10);
    }
}
