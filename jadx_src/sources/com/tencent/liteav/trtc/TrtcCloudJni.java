package com.tencent.liteav.trtc;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.liteav.base.ThreadUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.g;
import com.tencent.liteav.base.util.l;
import com.tencent.liteav.base.util.s;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.trtc.TRTCCloudListener;
import com.tencent.trtc.TRTCStatistics;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::trtc")
public class TrtcCloudJni {
    private static final Object INIT_LOCK = new Object();
    private static final String TAG = "TrtcCloudJni";
    private static boolean mHasInited = false;
    private TRTCCloudListener.TRTCAudioFrameListener mAudioFrameListener;
    private TRTCCloudListener.TRTCVideoFrameListener mCalledGLCreatedFrameListener;
    private final HashSet<View> mFloatingWindowSet;
    private final ReentrantReadWriteLock.ReadLock mJniReadLock;
    private final ReentrantReadWriteLock.WriteLock mJniWriteLock;
    private TRTCCloudListener mListener;
    private Handler mListenerHandler;
    private List<TRTCCloudListener> mListenerList;
    private String mLocalUserId;
    private final a<TRTCCloudListener.TRTCVideoRenderListener> mLocalVideoRenderListenerWrapper;
    private long mNativeTrtcCloudJni;
    private final ReentrantReadWriteLock mReadWriteLock;
    private final Map<String, a<TRTCCloudListener.TRTCVideoRenderListener>> mRemoteVideoRenderListenerMap;
    private final a<TRTCCloudListener.TRTCVideoFrameListener> mVideoFrameListenerWrapper;

    /* JADX INFO: renamed from: com.tencent.liteav.trtc.TrtcCloudJni$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f99861a;

        static {
            int[] iArr = new int[l.values().length];
            f99861a = iArr;
            try {
                iArr[l.ROTATION_90.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f99861a[l.ROTATION_180.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f99861a[l.ROTATION_270.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class AudioFrame {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCAudioFrame f99862a;

        public AudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
            this.f99862a = tRTCAudioFrame;
        }

        public int getChannel() {
            return this.f99862a.channel;
        }

        public byte[] getData() {
            return this.f99862a.data;
        }

        public int getSampleRate() {
            return this.f99862a.sampleRate;
        }

        public long getTimestamp() {
            return this.f99862a.timestamp;
        }
    }

    public static class AudioParallelParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCAudioParallelParams f99863a;

        public AudioParallelParams(TRTCCloudDef.TRTCAudioParallelParams tRTCAudioParallelParams) {
            this.f99863a = tRTCAudioParallelParams;
        }

        public String[] getIncludeUsers() {
            ArrayList<String> arrayList = this.f99863a.includeUsers;
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }

        public int getMaxCount() {
            return this.f99863a.maxCount;
        }
    }

    public static class AudioRecordingParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TRTCCloudDef.TRTCAudioRecordingParams f99864a;

        public AudioRecordingParams(TRTCCloudDef.TRTCAudioRecordingParams tRTCAudioRecordingParams) {
            this.f99864a = tRTCAudioRecordingParams;
        }

        public int getContent() {
            return this.f99864a.recordingContent;
        }

        public String getFilePath() {
            return this.f99864a.filePath;
        }

        public int getMaxDurationPerFile() {
            return this.f99864a.maxDurationPerFile;
        }
    }

    public static class EnterRoomParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCParams f99865a;

        public EnterRoomParams(TRTCCloudDef.TRTCParams tRTCParams) {
            this.f99865a = tRTCParams;
        }

        public String getBusinessInfo() {
            return this.f99865a.businessInfo;
        }

        public String getPrivateMapKey() {
            return this.f99865a.privateMapKey;
        }

        public String getRecordId() {
            return this.f99865a.userDefineRecordId;
        }

        public int getRole() {
            return this.f99865a.role;
        }

        public int getRoomId() {
            return this.f99865a.roomId;
        }

        public int getSdkAppId() {
            return this.f99865a.sdkAppId;
        }

        public String getStrRoomId() {
            return this.f99865a.strRoomId;
        }

        public String getStreamId() {
            return this.f99865a.streamId;
        }

        public String getUserId() {
            return this.f99865a.userId;
        }

        public String getUserSig() {
            return this.f99865a.userSig;
        }
    }

    public static class LocalRecordingParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TRTCCloudDef.TRTCLocalRecordingParams f99866a;

        public LocalRecordingParams(TRTCCloudDef.TRTCLocalRecordingParams tRTCLocalRecordingParams) {
            this.f99866a = tRTCLocalRecordingParams;
        }

        public String getFilePath() {
            return this.f99866a.filePath;
        }

        public int getInterval() {
            return this.f99866a.interval;
        }

        public int getMaxDurationPerFile() {
            return this.f99866a.maxDurationPerFile;
        }

        public int getRecordType() {
            return this.f99866a.recordType;
        }
    }

    public static class LocalStatistics {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TRTCStatistics.TRTCLocalStatistics f99867a = new TRTCStatistics.TRTCLocalStatistics();

        LocalStatistics() {
        }

        public static void addLocalStatistics(LocalStatistics localStatistics, ArrayList<LocalStatistics> arrayList) {
            arrayList.add(localStatistics);
        }

        public static LocalStatistics createLocalStatistics(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            LocalStatistics localStatistics = new LocalStatistics();
            TRTCStatistics.TRTCLocalStatistics tRTCLocalStatistics = localStatistics.f99867a;
            tRTCLocalStatistics.streamType = i10;
            tRTCLocalStatistics.width = i11;
            tRTCLocalStatistics.height = i12;
            tRTCLocalStatistics.frameRate = i13;
            tRTCLocalStatistics.videoBitrate = i14;
            tRTCLocalStatistics.audioBitrate = i16;
            tRTCLocalStatistics.audioSampleRate = i15;
            tRTCLocalStatistics.audioCaptureState = i17;
            return localStatistics;
        }

        public static ArrayList<LocalStatistics> createLocalStatisticsArray() {
            return new ArrayList<>();
        }
    }

    public static class MixUser {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCMixUser f99868a;

        private MixUser(TRTCCloudDef.TRTCMixUser tRTCMixUser) {
            this.f99868a = tRTCMixUser;
        }

        /* synthetic */ MixUser(TRTCCloudDef.TRTCMixUser tRTCMixUser, byte b10) {
            this(tRTCMixUser);
        }

        public int getHeight() {
            return this.f99868a.height;
        }

        public String getImage() {
            return TextUtils.isEmpty(this.f99868a.image) ? "" : this.f99868a.image;
        }

        public int getInputType() {
            return this.f99868a.inputType;
        }

        public boolean getPureAudio() {
            return this.f99868a.pureAudio;
        }

        public int getRenderMode() {
            return this.f99868a.renderMode;
        }

        public String getRoomId() {
            return TextUtils.isEmpty(this.f99868a.roomId) ? "" : this.f99868a.roomId;
        }

        public int getSoundLevel() {
            return this.f99868a.soundLevel;
        }

        public int getStreamType() {
            return this.f99868a.streamType;
        }

        public String getUserId() {
            return TextUtils.isEmpty(this.f99868a.userId) ? "" : this.f99868a.userId;
        }

        public int getWidth() {
            return this.f99868a.width;
        }

        public int getX() {
            return this.f99868a.f103189x;
        }

        public int getY() {
            return this.f99868a.f103190y;
        }

        public int getZOrder() {
            return this.f99868a.zOrder;
        }
    }

    public static class PayloadPrivateEncryptionConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCPayloadPrivateEncryptionConfig f99869a;

        public PayloadPrivateEncryptionConfig(TRTCCloudDef.TRTCPayloadPrivateEncryptionConfig tRTCPayloadPrivateEncryptionConfig) {
            this.f99869a = tRTCPayloadPrivateEncryptionConfig;
        }

        public int getEncryptionAlgorithm() {
            return this.f99869a.encryptionAlgorithm;
        }

        public String getEncryptionKey() {
            String str = this.f99869a.encryptionKey;
            return str != null ? str : "";
        }

        public byte[] getEncryptionSalt() {
            return this.f99869a.encryptionSalt;
        }
    }

    public static class PublishCDNParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCPublishCDNParam f99870a;

        public PublishCDNParams(TRTCCloudDef.TRTCPublishCDNParam tRTCPublishCDNParam) {
            this.f99870a = tRTCPublishCDNParam;
        }

        public int getAppId() {
            return this.f99870a.appId;
        }

        public int getBizId() {
            return this.f99870a.bizId;
        }

        public String getStreamId() {
            return TextUtils.isEmpty(this.f99870a.streamId) ? "" : this.f99870a.streamId;
        }

        public String getUrl() {
            return TextUtils.isEmpty(this.f99870a.url) ? "" : this.f99870a.url;
        }
    }

    public static class PublishCdnUrl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCPublishCdnUrl f99871a;

        public PublishCdnUrl(TRTCCloudDef.TRTCPublishCdnUrl tRTCPublishCdnUrl) {
            this.f99871a = tRTCPublishCdnUrl;
        }

        public boolean getIsInternalLine() {
            return this.f99871a.isInternalLine;
        }

        public String getRtmpUrl() {
            String str = this.f99871a.rtmpUrl;
            return str != null ? str : "";
        }
    }

    public static class PublishTarget {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCPublishTarget f99872a;

        public PublishTarget(TRTCCloudDef.TRTCPublishTarget tRTCPublishTarget) {
            this.f99872a = tRTCPublishTarget;
        }

        public int getMode() {
            return this.f99872a.mode;
        }

        public PublishCdnUrl[] getPublishCdnUrls() {
            ArrayList<TRTCCloudDef.TRTCPublishCdnUrl> arrayList = this.f99872a.cdnUrlList;
            if (arrayList == null) {
                return null;
            }
            PublishCdnUrl[] publishCdnUrlArr = new PublishCdnUrl[arrayList.size()];
            for (int i10 = 0; i10 < this.f99872a.cdnUrlList.size(); i10++) {
                publishCdnUrlArr[i10] = new PublishCdnUrl(this.f99872a.cdnUrlList.get(i10));
            }
            return publishCdnUrlArr;
        }

        public TRTCUser getTRTCUser() {
            return new TRTCUser(this.f99872a.mixStreamIdentity);
        }
    }

    public static class RemoteStatistics {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TRTCStatistics.TRTCRemoteStatistics f99873a = new TRTCStatistics.TRTCRemoteStatistics();

        RemoteStatistics() {
        }

        public static void addRemoteStatistics(RemoteStatistics remoteStatistics, ArrayList<RemoteStatistics> arrayList) {
            arrayList.add(remoteStatistics);
        }

        public static RemoteStatistics createRemoteStatistics(String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27) {
            RemoteStatistics remoteStatistics = new RemoteStatistics();
            TRTCStatistics.TRTCRemoteStatistics tRTCRemoteStatistics = remoteStatistics.f99873a;
            tRTCRemoteStatistics.userId = str;
            tRTCRemoteStatistics.streamType = i10;
            tRTCRemoteStatistics.width = i11;
            tRTCRemoteStatistics.height = i12;
            tRTCRemoteStatistics.frameRate = i13;
            tRTCRemoteStatistics.audioPacketLoss = i20;
            tRTCRemoteStatistics.videoPacketLoss = i14;
            tRTCRemoteStatistics.videoBlockRate = i17;
            tRTCRemoteStatistics.videoTotalBlockTime = i16;
            tRTCRemoteStatistics.videoBitrate = i15;
            tRTCRemoteStatistics.audioBitrate = i19;
            tRTCRemoteStatistics.audioSampleRate = i18;
            tRTCRemoteStatistics.audioTotalBlockTime = i21;
            tRTCRemoteStatistics.audioBlockRate = i22;
            tRTCRemoteStatistics.jitterBufferDelay = i23;
            tRTCRemoteStatistics.point2PointDelay = i24;
            tRTCRemoteStatistics.finalLoss = i25;
            tRTCRemoteStatistics.remoteNetworkUplinkLoss = i26;
            tRTCRemoteStatistics.remoteNetworkRTT = i27;
            return remoteStatistics;
        }

        public static ArrayList<RemoteStatistics> createRemoteStatisticsArray() {
            return new ArrayList<>();
        }
    }

    public static class ScreenShareParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TRTCCloudDef.TRTCScreenShareParams f99874a;

        public ScreenShareParams(TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
            this.f99874a = tRTCScreenShareParams;
        }

        public Object getMediaProjection() {
            return this.f99874a.mediaProjection;
        }
    }

    public static class SpeedTestParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TRTCCloudDef.TRTCSpeedTestParams f99875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f99876b;

        public SpeedTestParams(int i10, String str, String str2) {
            TRTCCloudDef.TRTCSpeedTestParams tRTCSpeedTestParams = new TRTCCloudDef.TRTCSpeedTestParams();
            this.f99875a = tRTCSpeedTestParams;
            tRTCSpeedTestParams.sdkAppId = i10;
            tRTCSpeedTestParams.userId = str;
            tRTCSpeedTestParams.userSig = str2;
            tRTCSpeedTestParams.scene = 1;
            this.f99876b = true;
        }

        public SpeedTestParams(TRTCCloudDef.TRTCSpeedTestParams tRTCSpeedTestParams) {
            this.f99875a = tRTCSpeedTestParams;
            this.f99876b = false;
        }

        public int getExpectedDownBandwidth() {
            return this.f99875a.expectedDownBandwidth;
        }

        public int getExpectedUpBandwidth() {
            return this.f99875a.expectedUpBandwidth;
        }

        public boolean getIsCalledFromDeprecatedApi() {
            return this.f99876b;
        }

        public int getSDKAppId() {
            return this.f99875a.sdkAppId;
        }

        public int getScene() {
            return this.f99875a.scene;
        }

        public String getUserId() {
            return this.f99875a.userId;
        }

        public String getUserSig() {
            return this.f99875a.userSig;
        }
    }

    public static class SpeedTestResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCSpeedTestResult f99877a = new TRTCCloudDef.TRTCSpeedTestResult();

        SpeedTestResult() {
        }

        public static SpeedTestResult createSpeedTestResult(boolean z10, String str, String str2, int i10, float f10, float f11, int i11, int i12, int i13, int i14, int i15) {
            SpeedTestResult speedTestResult = new SpeedTestResult();
            TRTCCloudDef.TRTCSpeedTestResult tRTCSpeedTestResult = speedTestResult.f99877a;
            tRTCSpeedTestResult.success = z10;
            tRTCSpeedTestResult.errMsg = str;
            tRTCSpeedTestResult.ip = str2;
            tRTCSpeedTestResult.quality = i10;
            tRTCSpeedTestResult.upLostRate = f10;
            tRTCSpeedTestResult.downLostRate = f11;
            tRTCSpeedTestResult.rtt = i11;
            tRTCSpeedTestResult.availableUpBandwidth = i12;
            tRTCSpeedTestResult.availableDownBandwidth = i13;
            tRTCSpeedTestResult.upJitter = i14;
            tRTCSpeedTestResult.downJitter = i15;
            return speedTestResult;
        }
    }

    public static class Statistics {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TRTCStatistics f99878a = new TRTCStatistics();

        Statistics() {
        }

        public static Statistics createStatistics(int i10, int i11, int i12, int i13, int i14, int i15, long j10, long j11, ArrayList<LocalStatistics> arrayList, ArrayList<RemoteStatistics> arrayList2) {
            Statistics statistics = new Statistics();
            TRTCStatistics tRTCStatistics = statistics.f99878a;
            tRTCStatistics.appCpu = i10;
            tRTCStatistics.systemCpu = i11;
            tRTCStatistics.upLoss = i12;
            tRTCStatistics.downLoss = i13;
            tRTCStatistics.rtt = i14;
            tRTCStatistics.gatewayRtt = i15;
            tRTCStatistics.sendBytes = j10;
            tRTCStatistics.receiveBytes = j11;
            tRTCStatistics.localArray = new ArrayList<>();
            statistics.f99878a.remoteArray = new ArrayList<>();
            if (arrayList != null) {
                Iterator<LocalStatistics> it = arrayList.iterator();
                while (it.hasNext()) {
                    statistics.f99878a.localArray.add(it.next().f99867a);
                }
            }
            if (arrayList2 != null) {
                Iterator<RemoteStatistics> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    statistics.f99878a.remoteArray.add(it2.next().f99873a);
                }
            }
            return statistics;
        }
    }

    public static class StreamEncoderParam {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCStreamEncoderParam f99879a;

        public StreamEncoderParam(TRTCCloudDef.TRTCStreamEncoderParam tRTCStreamEncoderParam) {
            this.f99879a = tRTCStreamEncoderParam;
        }

        public int getAudioEncodedChannelNum() {
            return this.f99879a.audioEncodedChannelNum;
        }

        public int getAudioEncodedCodecType() {
            return this.f99879a.audioEncodedCodecType;
        }

        public int getAudioEncodedKbps() {
            return this.f99879a.audioEncodedKbps;
        }

        public int getAudioEncodedSampleRate() {
            return this.f99879a.audioEncodedSampleRate;
        }

        public int getVideoEncodedCodecType() {
            return this.f99879a.videoEncodedCodecType;
        }

        public int getVideoEncodedFPS() {
            return this.f99879a.videoEncodedFPS;
        }

        public int getVideoEncodedGOP() {
            return this.f99879a.videoEncodedGOP;
        }

        public int getVideoEncodedHeight() {
            return this.f99879a.videoEncodedHeight;
        }

        public int getVideoEncodedKbps() {
            return this.f99879a.videoEncodedKbps;
        }

        public int getVideoEncodedWidth() {
            return this.f99879a.videoEncodedWidth;
        }

        public String getVideoSeiParams() {
            return TextUtils.isEmpty(this.f99879a.videoSeiParams) ? "" : this.f99879a.videoSeiParams;
        }
    }

    public static class StreamMixingConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCStreamMixingConfig f99880a;

        public StreamMixingConfig(TRTCCloudDef.TRTCStreamMixingConfig tRTCStreamMixingConfig) {
            this.f99880a = tRTCStreamMixingConfig;
        }

        public TRTCUser[] getAudioMixUserList() {
            ArrayList<TRTCCloudDef.TRTCUser> arrayList = this.f99880a.audioMixUserList;
            if (arrayList == null) {
                return null;
            }
            TRTCUser[] tRTCUserArr = new TRTCUser[arrayList.size()];
            for (int i10 = 0; i10 < this.f99880a.audioMixUserList.size(); i10++) {
                tRTCUserArr[i10] = new TRTCUser(this.f99880a.audioMixUserList.get(i10));
            }
            return tRTCUserArr;
        }

        public int getBackgroundColor() {
            return this.f99880a.backgroundColor;
        }

        public String getBackgroundImage() {
            String str = this.f99880a.backgroundImage;
            return str != null ? str : "";
        }

        public VideoLayout[] getVideoLayoutList() {
            ArrayList<TRTCCloudDef.TRTCVideoLayout> arrayList = this.f99880a.videoLayoutList;
            if (arrayList == null) {
                return null;
            }
            VideoLayout[] videoLayoutArr = new VideoLayout[arrayList.size()];
            for (int i10 = 0; i10 < this.f99880a.videoLayoutList.size(); i10++) {
                videoLayoutArr[i10] = new VideoLayout(this.f99880a.videoLayoutList.get(i10));
            }
            return videoLayoutArr;
        }

        public Watermark[] getWatermarkList() {
            ArrayList<TRTCCloudDef.TRTCWatermark> arrayList = this.f99880a.watermarkList;
            if (arrayList == null) {
                return null;
            }
            Watermark[] watermarkArr = new Watermark[arrayList.size()];
            for (int i10 = 0; i10 < this.f99880a.watermarkList.size(); i10++) {
                watermarkArr[i10] = new Watermark(this.f99880a.watermarkList.get(i10));
            }
            return watermarkArr;
        }
    }

    public static class SwitchRoomConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCSwitchRoomConfig f99881a;

        public SwitchRoomConfig(TRTCCloudDef.TRTCSwitchRoomConfig tRTCSwitchRoomConfig) {
            this.f99881a = tRTCSwitchRoomConfig;
        }

        public String getPrivateMapKey() {
            String str = this.f99881a.privateMapKey;
            return str != null ? str : "";
        }

        public int getRoomId() {
            return this.f99881a.roomId;
        }

        public String getStringRoomId() {
            String str = this.f99881a.strRoomId;
            return str != null ? str : "";
        }

        public String getUserSig() {
            String str = this.f99881a.userSig;
            return str != null ? str : "";
        }
    }

    public static class TRTCUser {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCUser f99882a;

        public TRTCUser(TRTCCloudDef.TRTCUser tRTCUser) {
            this.f99882a = tRTCUser;
        }

        public int getIntRoomId() {
            return this.f99882a.intRoomId;
        }

        public String getStrRoomId() {
            String str = this.f99882a.strRoomId;
            return str != null ? str : "";
        }

        public String getUserId() {
            String str = this.f99882a.userId;
            return str != null ? str : "";
        }
    }

    public static class TranscodingConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCTranscodingConfig f99883a;

        public TranscodingConfig(TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig) {
            this.f99883a = tRTCTranscodingConfig;
        }

        public int getAppId() {
            return this.f99883a.appId;
        }

        public int getAudioBitrate() {
            return this.f99883a.audioBitrate;
        }

        public int getAudioChannels() {
            return this.f99883a.audioChannels;
        }

        public int getAudioSampleRate() {
            return this.f99883a.audioSampleRate;
        }

        public int getBackgroundColor() {
            return this.f99883a.backgroundColor;
        }

        public String getBackgroundImage() {
            return TextUtils.isEmpty(this.f99883a.backgroundImage) ? "" : this.f99883a.backgroundImage;
        }

        public int getBizId() {
            return this.f99883a.bizId;
        }

        public MixUser[] getMixUsers() {
            ArrayList<TRTCCloudDef.TRTCMixUser> arrayList = this.f99883a.mixUsers;
            if (arrayList == null) {
                return null;
            }
            MixUser[] mixUserArr = new MixUser[arrayList.size()];
            byte b10 = 0;
            for (int i10 = 0; i10 < this.f99883a.mixUsers.size(); i10++) {
                mixUserArr[i10] = new MixUser(this.f99883a.mixUsers.get(i10), b10);
            }
            return mixUserArr;
        }

        public int getMode() {
            return this.f99883a.mode;
        }

        public String getStreamId() {
            return TextUtils.isEmpty(this.f99883a.streamId) ? "" : this.f99883a.streamId;
        }

        public int getVideoBitrate() {
            return this.f99883a.videoBitrate;
        }

        public int getVideoFramerate() {
            return this.f99883a.videoFramerate;
        }

        public int getVideoGOP() {
            return this.f99883a.videoGOP;
        }

        public int getVideoHeight() {
            return this.f99883a.videoHeight;
        }

        public String getVideoSeiParams() {
            return TextUtils.isEmpty(this.f99883a.videoSeiParams) ? "" : this.f99883a.videoSeiParams;
        }

        public int getVideoWidth() {
            return this.f99883a.videoWidth;
        }
    }

    public static class VideoEncParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCVideoEncParam f99884a;

        public VideoEncParams(TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
            this.f99884a = tRTCVideoEncParam;
        }

        public int getMinVideoBitrate() {
            return this.f99884a.minVideoBitrate;
        }

        public int getVideoBitrate() {
            return this.f99884a.videoBitrate;
        }

        public int getVideoFps() {
            return this.f99884a.videoFps;
        }

        public int getVideoResolution() {
            return this.f99884a.videoResolution;
        }

        public int getVideoResolutionMode() {
            return this.f99884a.videoResolutionMode;
        }

        public boolean isEnableAdjustRes() {
            return this.f99884a.enableAdjustRes;
        }
    }

    public static class VideoLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCVideoLayout f99885a;

        public VideoLayout(TRTCCloudDef.TRTCVideoLayout tRTCVideoLayout) {
            this.f99885a = tRTCVideoLayout;
        }

        public int getBackgroundColor() {
            return this.f99885a.backgroundColor;
        }

        public int getFillMode() {
            return this.f99885a.fillMode;
        }

        public int getHeight() {
            return this.f99885a.height;
        }

        public String getPlaceHolderImage() {
            String str = this.f99885a.placeHolderImage;
            return str != null ? str : "";
        }

        public TRTCUser getTRTCUser() {
            return new TRTCUser(this.f99885a.fixedVideoUser);
        }

        public int getVideoStreamType() {
            return this.f99885a.fixedVideoStreamType;
        }

        public int getWidth() {
            return this.f99885a.width;
        }

        public int getX() {
            return this.f99885a.f103191x;
        }

        public int getY() {
            return this.f99885a.f103192y;
        }

        public int getZOrder() {
            return this.f99885a.zOrder;
        }
    }

    public static class Watermark {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCWatermark f99886a;

        public Watermark(TRTCCloudDef.TRTCWatermark tRTCWatermark) {
            this.f99886a = tRTCWatermark;
        }

        public int getHeight() {
            return this.f99886a.height;
        }

        public String getWatermarkUrl() {
            String str = this.f99886a.watermarkUrl;
            return str != null ? str : "";
        }

        public int getWidth() {
            return this.f99886a.width;
        }

        public int getX() {
            return this.f99886a.f103193x;
        }

        public int getY() {
            return this.f99886a.f103194y;
        }

        public int getZOrder() {
            return this.f99886a.zOrder;
        }
    }

    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f99887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f99888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f99889c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public T f99890d;

        private a() {
        }

        /* synthetic */ a(byte b10) {
            this();
        }
    }

    static {
        s.a();
    }

    public TrtcCloudJni(long j10, boolean z10) {
        this.mNativeTrtcCloudJni = 0L;
        this.mLocalUserId = "";
        this.mListenerList = new CopyOnWriteArrayList();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWriteLock = reentrantReadWriteLock;
        this.mJniReadLock = reentrantReadWriteLock.readLock();
        this.mJniWriteLock = reentrantReadWriteLock.writeLock();
        this.mFloatingWindowSet = new HashSet<>();
        if (j10 == 0) {
            this.mNativeTrtcCloudJni = nativeCreatePipeline(this, z10);
        } else {
            this.mNativeTrtcCloudJni = nativeCreateSubCloud(this, j10);
        }
        byte b10 = 0;
        this.mVideoFrameListenerWrapper = new a<>(b10);
        this.mLocalVideoRenderListenerWrapper = new a<>(b10);
        this.mRemoteVideoRenderListenerMap = new HashMap();
        this.mListenerHandler = new Handler(Looper.getMainLooper());
    }

    public TrtcCloudJni(boolean z10) {
        this(0L, z10);
    }

    private List<TRTCCloudListener> CopyOnReadListeners() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.mListenerList);
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null && !copyOnWriteArrayList.contains(tRTCCloudListener)) {
            copyOnWriteArrayList.add(tRTCCloudListener);
        }
        return copyOnWriteArrayList;
    }

    private static int convertPixelFrameRotationToTRTCVideoRotation(l lVar) {
        int i10 = AnonymousClass1.f99861a[lVar.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    return 0;
                }
            }
        }
        return i11;
    }

    private static l covertTRTCVideoRotationToPixelFrameRotation(int i10) {
        if (i10 == 1) {
            return l.ROTATION_90;
        }
        if (i10 != 2) {
            return i10 != 3 ? l.NORMAL : l.ROTATION_270;
        }
        return l.ROTATION_180;
    }

    public static Bundle createExtraInfoBundle(String str, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(str, i10);
        return bundle;
    }

    private Bundle extraToBundle(String str) {
        Bundle bundle = new Bundle();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    String[] strArr = new String[jSONArray.length()];
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        strArr[i10] = jSONArray.getString(i10);
                    }
                    bundle.putStringArray(next, strArr);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return bundle;
    }

    public static long getGLContextNativeHandle(Object obj) {
        return TRTCDefConverter.getGLContextNativeHandle(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideFloatingWindow() {
        WindowManager windowManager;
        if (this.mFloatingWindowSet.isEmpty()) {
            return;
        }
        for (View view : this.mFloatingWindowSet) {
            if (view != null && (windowManager = (WindowManager) view.getContext().getSystemService("window")) != null) {
                windowManager.removeViewImmediate(view);
            }
        }
        this.mFloatingWindowSet.clear();
    }

    public static void init(int i10) {
        synchronized (INIT_LOCK) {
            if (!mHasInited) {
                mHasInited = true;
                nativeGlobalInit(i10);
            }
        }
    }

    private static boolean isCustomPreprocessSupportedBufferType(int i10) {
        return i10 == 1 || i10 == 2 || i10 == 3;
    }

    private static boolean isCustomPreprocessSupportedFormatType(int i10) {
        return i10 == 1 || i10 == 4 || i10 == 5 || i10 == 2;
    }

    private static boolean isCustomRenderSupportedBufferType(int i10) {
        return i10 == 1 || i10 == 2 || i10 == 3;
    }

    private static boolean isCustomRenderSupportedFormatType(int i10) {
        return i10 == 1 || i10 == 4 || i10 == 5 || i10 == 2;
    }

    public static boolean isInUIThread() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    static /* synthetic */ void lambda$enterRoom$0(TrtcCloudJni trtcCloudJni) {
        trtcCloudJni.onEnterRoom(-3316);
        trtcCloudJni.onError(-3316, "enter room param null");
    }

    static /* synthetic */ void lambda$onSnapshotComplete$2(TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener, Bitmap bitmap) {
        if (tRTCSnapshotListener != null) {
            tRTCSnapshotListener.onSnapshotComplete(bitmap);
        }
    }

    private static native String nativeCallExperimentalAPI(long j10, String str);

    private static native void nativeConnectOtherRoom(long j10, String str);

    private static native long nativeCreateAudioEffectManager(long j10);

    private static native long nativeCreateBeautyManager(long j10);

    private static native long nativeCreateDeviceManager(long j10);

    private static native long nativeCreatePipeline(TrtcCloudJni trtcCloudJni, boolean z10);

    private static native long nativeCreateSubCloud(TrtcCloudJni trtcCloudJni, long j10);

    private static native void nativeDestroyPipeline(long j10);

    private static native void nativeDisconnectOtherRoom(long j10);

    private static native void nativeEnable3DSpatialAudioEffect(long j10, boolean z10);

    private static native void nativeEnableAudioFrameNotification(long j10, boolean z10);

    private static native void nativeEnableAudioVolumeEvaluation(long j10, boolean z10, int i10, boolean z11, boolean z12, boolean z13);

    private static native void nativeEnableCustomAudioCapture(long j10, boolean z10);

    private static native void nativeEnableCustomAudioRendering(long j10, boolean z10);

    private static native void nativeEnableCustomVideoCapture(long j10, int i10, boolean z10);

    private static native void nativeEnableEncSmallVideoStream(long j10, boolean z10, VideoEncParams videoEncParams);

    private static native void nativeEnableMixExternalAudioFrame(long j10, boolean z10, boolean z11);

    private static native int nativeEnablePayloadPrivateEncryption(long j10, boolean z10, PayloadPrivateEncryptionConfig payloadPrivateEncryptionConfig);

    private static native void nativeEnableVideoCustomPreprocess(long j10, boolean z10, int i10, int i11, int i12);

    private static native void nativeEnableVideoCustomRender(long j10, boolean z10, String str, int i10, int i11, int i12);

    private static native void nativeEnterRoom(long j10, EnterRoomParams enterRoomParams, int i10);

    private static native void nativeExitRoom(long j10);

    private static native int nativeGetAudioCaptureVolume(long j10);

    private static native int nativeGetAudioPlayoutVolume(long j10);

    private static native void nativeGetCustomAudioRenderingFrame(long j10, byte[] bArr, int i10, int i11);

    private static native void nativeGlobalInit(int i10);

    private static native void nativeGlobalUninit();

    private static native int nativeMixExternalAudioFrame(long j10, AudioFrame audioFrame);

    private static native void nativeMuteAllRemoteAudio(long j10, boolean z10);

    private static native void nativeMuteAllRemoteVideoStreams(long j10, boolean z10);

    private static native void nativeMuteLocalAudio(long j10, boolean z10);

    private static native void nativeMuteLocalVideo(long j10, int i10, boolean z10);

    private static native void nativeMuteRemoteAudio(long j10, String str, boolean z10);

    private static native void nativeMuteRemoteVideoStream(long j10, String str, int i10, boolean z10);

    private static native void nativePauseScreenCapture(long j10, int i10);

    private static native void nativeResumeScreenCapture(long j10, int i10);

    private static native void nativeSendCustomAudioData(long j10, AudioFrame audioFrame);

    private static native boolean nativeSendCustomCmdMsg(long j10, int i10, byte[] bArr, boolean z10, boolean z11);

    private static native void nativeSendCustomVideoData(long j10, int i10, int i11, int i12, Object obj, int i13, int i14, int i15, int i16, long j11, byte[] bArr, ByteBuffer byteBuffer);

    private static native boolean nativeSendSEIMsg(long j10, byte[] bArr, int i10);

    private static native void nativeSet3DSpatialReceivingRange(long j10, String str, int i10);

    private static native void nativeSetAudioCaptureVolume(long j10, int i10);

    private static native void nativeSetAudioPlayoutVolume(long j10, int i10);

    private static native void nativeSetAudioQuality(long j10, int i10);

    private static native int nativeSetCapturedAudioFrameCallbackFormat(long j10, int i10, int i11, int i12, int i13);

    private static native void nativeSetConsoleEnabled(boolean z10);

    private static native void nativeSetDefaultStreamRecvMode(long j10, boolean z10, boolean z11);

    private static native void nativeSetGSensorMode(long j10, int i10, int i11);

    private static native void nativeSetGravitySensorAdaptiveMode(long j10, int i10);

    private static native void nativeSetListenerHandler(long j10, Handler handler);

    private static native int nativeSetLocalProcessedAudioFrameCallbackFormat(long j10, int i10, int i11, int i12, int i13);

    private static native void nativeSetLocalViewFillMode(long j10, int i10);

    private static native void nativeSetLocalViewMirror(long j10, int i10);

    private static native void nativeSetLocalViewRotation(long j10, int i10);

    private static native void nativeSetLogCompressEnabled(boolean z10);

    private static native void nativeSetLogLevel(int i10);

    private static native void nativeSetLogPath(String str);

    private static native void nativeSetMixExternalAudioVolume(long j10, int i10, int i11);

    private static native void nativeSetMixTranscodingConfig(long j10, TranscodingConfig transcodingConfig);

    private static native int nativeSetMixedPlayAudioFrameCallbackFormat(long j10, int i10, int i11, int i12, int i13);

    private static native void nativeSetNetworkQosParam(long j10, int i10, int i11);

    private static native void nativeSetPerspectiveCorrectionPoints(long j10, String str, float[] fArr, float[] fArr2);

    private static native void nativeSetPriorRemoteVideoStreamType(long j10, int i10);

    private static native void nativeSetRemoteAudioParallelParams(long j10, AudioParallelParams audioParallelParams);

    private static native void nativeSetRemoteAudioVolume(long j10, String str, int i10);

    private static native void nativeSetRemoteVideoStreamType(long j10, String str, int i10);

    private static native void nativeSetRemoteViewFillMode(long j10, String str, int i10, int i11);

    private static native void nativeSetRemoteViewMirror(long j10, String str, int i10, int i11);

    private static native void nativeSetRemoteViewRotation(long j10, String str, int i10, int i11);

    private static native void nativeSetVideoEncoderMirror(long j10, boolean z10);

    private static native void nativeSetVideoEncoderParams(long j10, int i10, VideoEncParams videoEncParams);

    private static native void nativeSetVideoEncoderRotation(long j10, int i10);

    private static native void nativeSetVideoMuteImage(long j10, Bitmap bitmap, int i10);

    private static native void nativeSetWatermark(long j10, Bitmap bitmap, int i10, float f10, float f11, float f12);

    private static native void nativeShowDashboardManager(long j10, int i10);

    private static native void nativeSnapshotVideo(long j10, String str, int i10, int i11, TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener);

    private static native int nativeStartAudioRecording(long j10, AudioRecordingParams audioRecordingParams);

    private static native void nativeStartLocalAudio(long j10);

    private static native void nativeStartLocalAudioWithQuality(long j10, int i10);

    private static native void nativeStartLocalPreview(long j10, boolean z10, TXCloudVideoView tXCloudVideoView);

    private static native void nativeStartLocalRecording(long j10, LocalRecordingParams localRecordingParams);

    private static native void nativeStartPublishCDNStream(long j10, PublishCDNParams publishCDNParams);

    private static native void nativeStartPublishMediaStream(long j10, PublishTarget publishTarget, StreamEncoderParam streamEncoderParam, StreamMixingConfig streamMixingConfig);

    private static native void nativeStartPublishing(long j10, String str, int i10);

    private static native void nativeStartRemoteView(long j10, String str, int i10, TXCloudVideoView tXCloudVideoView);

    private static native void nativeStartRemoteViewWithoutStreamType(long j10, String str, TXCloudVideoView tXCloudVideoView);

    private static native void nativeStartScreenCapture(long j10, int i10, VideoEncParams videoEncParams, ScreenShareParams screenShareParams);

    private static native void nativeStartSpeedTest(long j10, SpeedTestParams speedTestParams);

    private static native void nativeStartSystemAudioLoopback(long j10);

    private static native void nativeStopAllRemoteView(long j10);

    private static native void nativeStopAudioRecording(long j10);

    private static native void nativeStopLocalAudio(long j10);

    private static native void nativeStopLocalPreview(long j10);

    private static native void nativeStopLocalRecording(long j10);

    private static native void nativeStopPublishCDNStream(long j10);

    private static native void nativeStopPublishMediaStream(long j10, String str);

    private static native void nativeStopPublishing(long j10);

    private static native void nativeStopRemoteView(long j10, String str, int i10);

    private static native void nativeStopRemoteViewWithoutStreamType(long j10, String str);

    private static native void nativeStopScreenCapture(long j10, int i10);

    private static native void nativeStopSpeedTest(long j10);

    private static native void nativeStopSystemAudioLoopback(long j10);

    private static native void nativeSwitchRole(long j10, int i10);

    private static native void nativeSwitchRoleWithPrivateMapKey(long j10, int i10, String str);

    private static native void nativeSwitchRoom(long j10, SwitchRoomConfig switchRoomConfig);

    private static native void nativeUpdateLocalView(long j10, TXCloudVideoView tXCloudVideoView);

    private static native void nativeUpdateOtherRoomForwardMode(long j10, String str);

    private static native void nativeUpdatePublishMediaStream(long j10, String str, PublishTarget publishTarget, StreamEncoderParam streamEncoderParam, StreamMixingConfig streamMixingConfig);

    private static native void nativeUpdateRemote3DSpatialPosition(long j10, String str, int[] iArr);

    private static native void nativeUpdateRemoteView(long j10, String str, int i10, TXCloudVideoView tXCloudVideoView);

    private static native void nativeUpdateSelf3DSpatialPosition(long j10, int[] iArr, float[] fArr, float[] fArr2, float[] fArr3);

    private void runOnListenerThread(Runnable runnable) {
        Handler handler = this.mListenerHandler;
        if (Looper.myLooper() != handler.getLooper()) {
            handler.post(runnable);
        } else {
            runnable.run();
        }
    }

    public static void setConsoleEnabled(boolean z10) {
        nativeSetConsoleEnabled(z10);
    }

    public static void setLogCompressEnabled(boolean z10) {
        nativeSetLogCompressEnabled(z10);
    }

    public static void setLogDirPath(String str) {
        nativeSetLogPath(str);
    }

    public static void setLogLevel(int i10) {
        nativeSetLogLevel(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showFloatingWindow(View view) {
        if (view == null) {
            return;
        }
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 23 && !Settings.canDrawOverlays(view.getContext())) {
            LiteavLog.e(TAG, "can't show floating window for no drawing overlay permission");
            return;
        }
        if (this.mFloatingWindowSet.contains(view)) {
            LiteavLog.i(TAG, "the window has been added");
            return;
        }
        WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
        if (windowManager == null) {
            LiteavLog.e(TAG, "get windowManager error");
            return;
        }
        this.mFloatingWindowSet.add(view);
        int i10 = 2005;
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 26) {
            i10 = bb.c.d.f31311j;
        } else if (LiteavSystemInfo.getSystemOSVersionInt() > 24) {
            i10 = 2002;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(i10);
        layoutParams.flags = 8 | 262144;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        windowManager.addView(view, layoutParams);
    }

    public static void uninit() {
        synchronized (INIT_LOCK) {
            if (mHasInited) {
                mHasInited = false;
                nativeGlobalUninit();
            }
        }
    }

    public void addListener(TRTCCloudListener tRTCCloudListener) {
        if (tRTCCloudListener == null || this.mListenerList.contains(tRTCCloudListener)) {
            return;
        }
        this.mListenerList.add(tRTCCloudListener);
    }

    public String callExperimentalAPI(String str) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                return nativeCallExperimentalAPI(j10, str);
            }
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void connectOtherRoom(String str) {
        long j10 = this.mNativeTrtcCloudJni;
        if (j10 != 0) {
            nativeConnectOtherRoom(j10, str);
        }
    }

    public long createAudioEffectManager() {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            return j10 != 0 ? nativeCreateAudioEffectManager(j10) : 0L;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public long createBeautyManager() {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            return j10 != 0 ? nativeCreateBeautyManager(j10) : 0L;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public ByteBuffer createByteBuffer(int i10) {
        return ByteBuffer.allocateDirect(i10);
    }

    public long createDeviceManager() {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            return j10 != 0 ? nativeCreateDeviceManager(j10) : 0L;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public TRTCCloudDef.TRTCVideoFrame createTRTCVideoFrame(int i10, int i11, Object obj, int i12, int i13, int i14, int i15, long j10, byte[] bArr, ByteBuffer byteBuffer) {
        TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame = new TRTCCloudDef.TRTCVideoFrame();
        tRTCVideoFrame.pixelFormat = i10;
        tRTCVideoFrame.bufferType = i11;
        TRTCCloudDef.TRTCTexture tRTCTexture = new TRTCCloudDef.TRTCTexture();
        tRTCVideoFrame.texture = tRTCTexture;
        tRTCTexture.textureId = i12;
        if (obj instanceof EGLContext) {
            tRTCTexture.eglContext10 = (EGLContext) obj;
        } else if (LiteavSystemInfo.getSystemOSVersionInt() >= 17 && (obj instanceof android.opengl.EGLContext)) {
            tRTCVideoFrame.texture.eglContext14 = (android.opengl.EGLContext) obj;
        }
        tRTCVideoFrame.data = bArr;
        tRTCVideoFrame.buffer = byteBuffer;
        tRTCVideoFrame.width = i13;
        tRTCVideoFrame.height = i14;
        tRTCVideoFrame.timestamp = j10;
        tRTCVideoFrame.rotation = convertPixelFrameRotationToTRTCVideoRotation(l.a(i15));
        return tRTCVideoFrame;
    }

    public void destroy() {
        this.mJniWriteLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeDestroyPipeline(j10);
                this.mNativeTrtcCloudJni = 0L;
            }
            this.mListenerList.clear();
        } finally {
            this.mJniWriteLock.unlock();
        }
    }

    public void disconnectOtherRoom() {
        long j10 = this.mNativeTrtcCloudJni;
        if (j10 != 0) {
            nativeDisconnectOtherRoom(j10);
        }
    }

    public void enable3DSpatialAudioEffect(boolean z10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeEnable3DSpatialAudioEffect(j10, z10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void enableAudioVolumeEvaluation(boolean z10, TRTCCloudDef.TRTCAudioVolumeEvaluateParams tRTCAudioVolumeEvaluateParams) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeEnableAudioVolumeEvaluation(j10, z10, tRTCAudioVolumeEvaluateParams.interval, tRTCAudioVolumeEvaluateParams.enableVadDetection, tRTCAudioVolumeEvaluateParams.enablePitchCalculation, tRTCAudioVolumeEvaluateParams.enableSpectrumCalculation);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void enableCustomAudioCapture(boolean z10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeEnableCustomAudioCapture(j10, z10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void enableCustomAudioRendering(boolean z10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeEnableCustomAudioRendering(j10, z10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void enableCustomVideoCapture(int i10, boolean z10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeEnableCustomVideoCapture(j10, i10, z10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int enableEncSmallVideoStream(boolean z10, TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeEnableEncSmallVideoStream(j10, z10, tRTCVideoEncParam == null ? null : new VideoEncParams(tRTCVideoEncParam));
            }
            return 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void enableMixExternalAudioFrame(boolean z10, boolean z11) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeEnableMixExternalAudioFrame(j10, z10, z11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int enablePayloadPrivateEncryption(boolean z10, TRTCCloudDef.TRTCPayloadPrivateEncryptionConfig tRTCPayloadPrivateEncryptionConfig) {
        int iNativeEnablePayloadPrivateEncryption;
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                iNativeEnablePayloadPrivateEncryption = nativeEnablePayloadPrivateEncryption(j10, z10, tRTCPayloadPrivateEncryptionConfig == null ? null : new PayloadPrivateEncryptionConfig(tRTCPayloadPrivateEncryptionConfig));
            } else {
                iNativeEnablePayloadPrivateEncryption = -1;
            }
            return iNativeEnablePayloadPrivateEncryption;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void enterRoom(TRTCCloudDef.TRTCParams tRTCParams, int i10) {
        if (tRTCParams == null) {
            LiteavLog.e(TAG, "enterRoom param is null");
            runOnListenerThread(com.tencent.liteav.trtc.a.a(this));
            return;
        }
        this.mJniReadLock.lock();
        try {
            this.mLocalUserId = tRTCParams.userId;
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeEnterRoom(j10, new EnterRoomParams(tRTCParams), i10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void exitRoom() {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeExitRoom(j10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int getAudioCaptureVolume() {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            return j10 != 0 ? nativeGetAudioCaptureVolume(j10) : 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int getAudioPlayoutVolume() {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            return j10 != 0 ? nativeGetAudioPlayoutVolume(j10) : 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void getCustomAudioRenderingFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeGetCustomAudioRenderingFrame(j10, tRTCAudioFrame.data, tRTCAudioFrame.sampleRate, tRTCAudioFrame.channel);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int getFrameBufferType(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.bufferType;
    }

    public byte[] getFrameByteArray(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.data;
    }

    public ByteBuffer getFrameByteBuffer(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.buffer;
    }

    public Object getFrameEglContext(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return LiteavSystemInfo.getSystemOSVersionInt() >= 17 ? tRTCVideoFrame.texture.eglContext14 : tRTCVideoFrame.texture.eglContext10;
    }

    public int getFrameHeight(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.height;
    }

    public int getFramePixelFormat(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.pixelFormat;
    }

    public long getFramePts(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.timestamp;
    }

    public int getFrameRotation(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return covertTRTCVideoRotationToPixelFrameRotation(tRTCVideoFrame.rotation).mValue;
    }

    public int getFrameTextureId(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.texture.textureId;
    }

    public int getFrameWidth(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.width;
    }

    public long getTrtcCloudJni() {
        this.mJniReadLock.lock();
        try {
            return this.mNativeTrtcCloudJni;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int mixExternalAudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                return nativeMixExternalAudioFrame(j10, new AudioFrame(tRTCAudioFrame));
            }
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void muteAllRemoteAudio(boolean z10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeMuteAllRemoteAudio(j10, z10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void muteAllRemoteVideoStreams(boolean z10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeMuteAllRemoteVideoStreams(j10, z10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void muteLocalAudio(boolean z10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeMuteLocalAudio(j10, z10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void muteLocalVideo(int i10, boolean z10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeMuteLocalVideo(j10, i10, z10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void muteRemoteAudio(String str, boolean z10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeMuteRemoteAudio(j10, str, z10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void muteRemoteVideoStream(String str, int i10, boolean z10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeMuteRemoteVideoStream(j10, str, i10, z10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void onAudioCaptureProcessedData(byte[] bArr, long j10, int i10, int i11) {
        TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
        if (tRTCAudioFrameListener == null) {
            return;
        }
        TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new TRTCCloudDef.TRTCAudioFrame();
        tRTCAudioFrame.data = bArr;
        tRTCAudioFrame.timestamp = j10;
        tRTCAudioFrame.sampleRate = i10;
        tRTCAudioFrame.channel = i11;
        tRTCAudioFrameListener.onCapturedAudioFrame(tRTCAudioFrame);
    }

    public void onAudioMixedAllData(byte[] bArr, int i10, int i11) {
        TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
        if (tRTCAudioFrameListener == null) {
            return;
        }
        TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new TRTCCloudDef.TRTCAudioFrame();
        tRTCAudioFrame.data = bArr;
        tRTCAudioFrame.timestamp = 0L;
        tRTCAudioFrame.sampleRate = i10;
        tRTCAudioFrame.channel = i11;
        tRTCAudioFrameListener.onMixedAllAudioFrame(tRTCAudioFrame);
    }

    public void onAudioPlayoutData(byte[] bArr, long j10, int i10, int i11) {
        TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
        if (tRTCAudioFrameListener == null) {
            return;
        }
        TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new TRTCCloudDef.TRTCAudioFrame();
        tRTCAudioFrame.data = bArr;
        tRTCAudioFrame.timestamp = j10;
        tRTCAudioFrame.sampleRate = i10;
        tRTCAudioFrame.channel = i11;
        tRTCAudioFrameListener.onMixedPlayAudioFrame(tRTCAudioFrame);
    }

    public void onAudioRemoteStreamData(String str, byte[] bArr, long j10, int i10, int i11, byte[] bArr2) {
        TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
        if (tRTCAudioFrameListener == null) {
            return;
        }
        TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new TRTCCloudDef.TRTCAudioFrame();
        tRTCAudioFrame.data = bArr;
        tRTCAudioFrame.timestamp = j10;
        tRTCAudioFrame.sampleRate = i10;
        tRTCAudioFrame.channel = i11;
        tRTCAudioFrame.extraData = bArr2;
        tRTCAudioFrameListener.onRemoteUserAudioFrame(tRTCAudioFrame, str);
    }

    public void onAudioRouteChanged(int i10, int i11) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onAudioRouteChanged(i10, i11);
        }
    }

    void onCameraDidReady() {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onCameraDidReady();
        }
    }

    public void onCdnStreamStateChanged(String str, int i10, int i11, String str2, String str3) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onCdnStreamStateChanged(str, i10, i11, str2, null);
        }
    }

    public void onConnectOtherRoom(String str, int i10, String str2) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onConnectOtherRoom(str, i10, str2);
        }
    }

    void onConnectionLost() {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onConnectionLost();
        }
    }

    void onConnectionRecovery() {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onConnectionRecovery();
        }
    }

    public void onDisConnectOtherRoom(int i10, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onDisConnectOtherRoom(i10, str);
        }
    }

    public void onEarMonitoringData(byte[] bArr, int i10, int i11) {
        TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
        if (tRTCAudioFrameListener == null) {
            return;
        }
        TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new TRTCCloudDef.TRTCAudioFrame();
        tRTCAudioFrame.data = bArr;
        tRTCAudioFrame.timestamp = 0L;
        tRTCAudioFrame.sampleRate = i10;
        tRTCAudioFrame.channel = i11;
        tRTCAudioFrameListener.onVoiceEarMonitorAudioFrame(tRTCAudioFrame);
    }

    public void onEnterRoom(int i10) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onEnterRoom(i10);
        }
    }

    public void onError(int i10, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onError(i10, str, null);
        }
    }

    public void onExitRoom(int i10) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onExitRoom(i10);
        }
        synchronized (this.mLocalVideoRenderListenerWrapper) {
            this.mLocalVideoRenderListenerWrapper.f99890d = null;
        }
        synchronized (this.mRemoteVideoRenderListenerMap) {
            this.mRemoteVideoRenderListenerMap.clear();
        }
    }

    void onFirstAudioFrame(String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onFirstAudioFrame(str);
        }
    }

    void onFirstVideoFrame(String str, int i10, int i11, int i12) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onFirstVideoFrame(str, i10, i11, i12);
        }
    }

    public void onGLContextCreated() {
        synchronized (this.mVideoFrameListenerWrapper) {
            this.mCalledGLCreatedFrameListener = this.mVideoFrameListenerWrapper.f99890d;
        }
        LiteavLog.i(TAG, "onGLContextCreated " + this.mCalledGLCreatedFrameListener);
        TRTCCloudListener.TRTCVideoFrameListener tRTCVideoFrameListener = this.mCalledGLCreatedFrameListener;
        if (tRTCVideoFrameListener != null) {
            tRTCVideoFrameListener.onGLContextCreated();
        }
    }

    public void onGLContextDestroy() {
        LiteavLog.i(TAG, "onGLContextDestroy " + this.mCalledGLCreatedFrameListener);
        TRTCCloudListener.TRTCVideoFrameListener tRTCVideoFrameListener = this.mCalledGLCreatedFrameListener;
        if (tRTCVideoFrameListener != null) {
            tRTCVideoFrameListener.onGLContextDestory();
            this.mCalledGLCreatedFrameListener = null;
        }
    }

    public byte[] onLocalAudioStreamData(byte[] bArr, long j10, int i10, int i11) {
        TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
        if (tRTCAudioFrameListener == null) {
            return null;
        }
        TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new TRTCCloudDef.TRTCAudioFrame();
        tRTCAudioFrame.data = bArr;
        tRTCAudioFrame.timestamp = j10;
        tRTCAudioFrame.sampleRate = i10;
        tRTCAudioFrame.channel = i11;
        tRTCAudioFrameListener.onLocalProcessedAudioFrame(tRTCAudioFrame);
        byte[] bArr2 = tRTCAudioFrame.extraData;
        if (bArr2 == null) {
            return null;
        }
        if (bArr2.length <= 100) {
            return bArr2;
        }
        LiteavLog.w(TAG, "Audioframe.extraData length need to be under 100!");
        return null;
    }

    public void onLocalRecordBegin(int i10, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onLocalRecordBegin(i10, str);
        }
    }

    public void onLocalRecordComplete(int i10, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onLocalRecordComplete(i10, str);
        }
    }

    public void onLocalRecordFragment(String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onLocalRecordFragment(str);
        }
    }

    public void onLocalRecording(long j10, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onLocalRecording(j10, str);
        }
    }

    void onMicDidReady() {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onMicDidReady();
        }
    }

    public void onMissCustomCmdMsg(String str, int i10, int i11, int i12) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onMissCustomCmdMsg(str, i10, i11, i12);
        }
    }

    public void onNetworkQuality(int i10, String[] strArr, int[] iArr) {
        if (CopyOnReadListeners().size() == 0) {
            return;
        }
        TRTCCloudDef.TRTCQuality tRTCQuality = new TRTCCloudDef.TRTCQuality();
        tRTCQuality.userId = "";
        tRTCQuality.quality = i10;
        ArrayList<TRTCCloudDef.TRTCQuality> arrayList = new ArrayList<>();
        if (strArr != null && strArr.length != 0 && iArr != null && iArr.length != 0 && iArr.length == strArr.length) {
            for (int i11 = 0; i11 < strArr.length; i11++) {
                TRTCCloudDef.TRTCQuality tRTCQuality2 = new TRTCCloudDef.TRTCQuality();
                tRTCQuality2.userId = strArr[i11];
                tRTCQuality2.quality = iArr[i11];
                arrayList.add(tRTCQuality2);
            }
        }
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onNetworkQuality(tRTCQuality, arrayList);
        }
    }

    public void onPreprocessVideoFrame(int i10, TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame, TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame2) {
        TRTCCloudListener.TRTCVideoFrameListener tRTCVideoFrameListener = this.mCalledGLCreatedFrameListener;
        if (tRTCVideoFrameListener == null || tRTCVideoFrameListener == null) {
            return;
        }
        tRTCVideoFrameListener.onProcessVideoFrame(tRTCVideoFrame, tRTCVideoFrame2);
    }

    public void onRecvCustomCmdMsg(String str, int i10, int i11, byte[] bArr) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onRecvCustomCmdMsg(str, i10, i11, bArr);
        }
    }

    public void onRemoteAudioStatusUpdated(String str, int i10, int i11) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onRemoteAudioStatusUpdated(str, i10, i11, null);
        }
    }

    public void onRemoteVideoStatusUpdated(String str, int i10, int i11, int i12) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onRemoteVideoStatusUpdated(str, i10, i11, i12, null);
        }
    }

    public void onRenderVideoFrame(String str, int i10, TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener;
        if (TextUtils.isEmpty(str)) {
            str = this.mLocalUserId;
            tRTCVideoRenderListener = this.mLocalVideoRenderListenerWrapper.f99890d;
        } else {
            a<TRTCCloudListener.TRTCVideoRenderListener> aVar = this.mRemoteVideoRenderListenerMap.get(str);
            tRTCVideoRenderListener = aVar == null ? null : aVar.f99890d;
        }
        if (tRTCVideoRenderListener != null) {
            tRTCVideoRenderListener.onRenderVideoFrame(str, i10, tRTCVideoFrame);
        }
    }

    public void onSEIMessageReceived(byte[] bArr, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onRecvSEIMsg(str, bArr);
        }
    }

    void onScreenCapturePaused() {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onScreenCapturePaused();
        }
    }

    void onScreenCaptureResumed() {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onScreenCaptureResumed();
        }
    }

    void onScreenCaptureStarted() {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onScreenCaptureStarted();
        }
    }

    void onScreenCaptureStopped(int i10) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onScreenCaptureStopped(i10);
        }
    }

    void onSendFirstLocalAudioFrame() {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onSendFirstLocalAudioFrame();
        }
    }

    void onSendFirstLocalVideoFrame(int i10) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onSendFirstLocalVideoFrame(i10);
        }
    }

    void onSetMixTranscodingConfig(int i10, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onSetMixTranscodingConfig(i10, str);
        }
    }

    public void onSnapshotComplete(TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener, Bitmap bitmap) {
        runOnListenerThread(d.a(tRTCSnapshotListener, bitmap));
    }

    public void onSpeedTest(SpeedTestResult speedTestResult, int i10, int i11) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onSpeedTest(speedTestResult.f99877a, i10, i11);
        }
    }

    public void onSpeedTestResult(SpeedTestResult speedTestResult) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onSpeedTestResult(speedTestResult.f99877a);
        }
    }

    void onStartPublishCDNStream(int i10, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onStartPublishCDNStream(i10, str);
        }
    }

    public void onStartPublishMediaStream(String str, int i10, String str2, String str3) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onStartPublishMediaStream(str, i10, str2, extraToBundle(str3));
        }
    }

    void onStartPublishing(int i10, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onStartPublishing(i10, str);
        }
    }

    public void onStatistics(Statistics statistics) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onStatistics(statistics.f99878a);
        }
    }

    void onStopPublishCDNStream(int i10, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onStopPublishCDNStream(i10, str);
        }
    }

    public void onStopPublishMediaStream(String str, int i10, String str2, String str3) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onStopPublishMediaStream(str, i10, str2, extraToBundle(str3));
        }
    }

    void onStopPublishing(int i10, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onStopPublishing(i10, str);
        }
    }

    public void onSwitchRole(int i10, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onSwitchRole(i10, str);
        }
    }

    public void onSwitchRoom(int i10, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onSwitchRoom(i10, str);
        }
    }

    void onTryToReconnect() {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onTryToReconnect();
        }
    }

    public void onUpdateOtherRoomForwardMode(int i10, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUpdateOtherRoomForwardMode(i10, str);
        }
    }

    public void onUpdatePublishMediaStream(String str, int i10, String str2, String str3) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUpdatePublishMediaStream(str, i10, str2, extraToBundle(str3));
        }
    }

    void onUserAudioAvailable(String str, boolean z10) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserAudioAvailable(str, z10);
        }
    }

    public void onUserEnter(String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserEnter(str);
        }
    }

    public void onUserExit(String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserExit(str, 0);
        }
    }

    public void onUserOffline(String str, int i10) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onRemoteUserLeaveRoom(str, i10);
        }
    }

    public void onUserOnline(String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onRemoteUserEnterRoom(str);
        }
    }

    void onUserSubStreamAvailable(String str, boolean z10) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserSubStreamAvailable(str, z10);
        }
    }

    void onUserVideoAvailable(String str, boolean z10) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserVideoAvailable(str, z10);
        }
    }

    public void onUserVideoSizeChanged(String str, int i10, int i11, int i12) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserVideoSizeChanged(str, i10, i11, i12);
        }
    }

    public void onUserVoiceVolume(String[] strArr, int[] iArr, int[] iArr2, float[] fArr, float[][] fArr2, int i10) {
        String str;
        if (strArr == null || iArr == null) {
            return;
        }
        if (strArr.length != iArr.length) {
            throw new IllegalArgumentException("Invalid parameter, userIds and volumes do not match.");
        }
        ArrayList<TRTCCloudDef.TRTCVolumeInfo> arrayList = new ArrayList<>();
        for (int i11 = 0; i11 < strArr.length; i11++) {
            TRTCCloudDef.TRTCVolumeInfo tRTCVolumeInfo = new TRTCCloudDef.TRTCVolumeInfo();
            if (!strArr[i11].isEmpty() || (str = this.mLocalUserId) == null || str.isEmpty()) {
                tRTCVolumeInfo.userId = strArr[i11];
            } else {
                tRTCVolumeInfo.userId = this.mLocalUserId;
            }
            tRTCVolumeInfo.volume = iArr[i11];
            tRTCVolumeInfo.vad = iArr2[i11];
            tRTCVolumeInfo.pitch = fArr[i11];
            tRTCVolumeInfo.spectrumData = fArr2[i11];
            arrayList.add(tRTCVolumeInfo);
        }
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserVoiceVolume(arrayList, i10);
        }
    }

    public void onWarning(int i10, String str, Bundle bundle) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onWarning(i10, str, bundle);
        }
    }

    public void pauseScreenCapture(int i10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativePauseScreenCapture(j10, i10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void removeListener(TRTCCloudListener tRTCCloudListener) {
        if (tRTCCloudListener == null || !this.mListenerList.contains(tRTCCloudListener)) {
            return;
        }
        this.mListenerList.remove(tRTCCloudListener);
    }

    public void resumeScreenCapture(int i10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeResumeScreenCapture(j10, i10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void sendCustomAudioData(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeSendCustomAudioData(j10, new AudioFrame(tRTCAudioFrame));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public boolean sendCustomCmdMsg(int i10, byte[] bArr, boolean z10, boolean z11) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                return nativeSendCustomCmdMsg(j10, i10, bArr, z10, z11);
            }
            return false;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void sendCustomVideoData(int i10, TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                TRTCCloudDef.TRTCTexture tRTCTexture = tRTCVideoFrame.texture;
                int i11 = -1;
                Object obj = null;
                if (tRTCTexture != null) {
                    i11 = tRTCTexture.textureId;
                    obj = tRTCTexture.eglContext10;
                    if (obj == null) {
                        obj = tRTCTexture.eglContext14;
                    }
                }
                Object obj2 = obj;
                nativeSendCustomVideoData(j10, i10, tRTCVideoFrame.pixelFormat, tRTCVideoFrame.bufferType, obj2, i11, tRTCVideoFrame.width, tRTCVideoFrame.height, covertTRTCVideoRotationToPixelFrameRotation(tRTCVideoFrame.rotation).mValue, tRTCVideoFrame.timestamp, tRTCVideoFrame.data, tRTCVideoFrame.buffer);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public boolean sendSEIMsg(byte[] bArr, int i10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                return nativeSendSEIMsg(j10, bArr, i10);
            }
            return false;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void set3DSpatialReceivingRange(String str, int i10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeSet3DSpatialReceivingRange(j10, str, i10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setAudioCaptureVolume(int i10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeSetAudioCaptureVolume(j10, i10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setAudioFrameListener(TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                this.mAudioFrameListener = tRTCAudioFrameListener;
                nativeEnableAudioFrameNotification(j10, tRTCAudioFrameListener != null);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setAudioPlayoutVolume(int i10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeSetAudioPlayoutVolume(j10, i10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setAudioQuality(int i10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeSetAudioQuality(j10, i10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int setCapturedAudioFrameCallbackFormat(int i10, int i11, int i12, int i13) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            return j10 != 0 ? nativeSetCapturedAudioFrameCallbackFormat(j10, i10, i11, i12, i13) : 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setDefaultStreamRecvMode(boolean z10, boolean z11) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeSetDefaultStreamRecvMode(j10, z10, z11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setGSensorMode(int i10, int i11) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeSetGSensorMode(j10, i10, i11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setGravitySensorAdaptiveMode(int i10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeSetGravitySensorAdaptiveMode(j10, i10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setListener(TRTCCloudListener tRTCCloudListener) {
        this.mListener = tRTCCloudListener;
    }

    public void setListenerHandler(Handler handler) {
        this.mJniReadLock.lock();
        if (handler == null) {
            this.mListenerHandler = new Handler(Looper.getMainLooper());
        } else {
            this.mListenerHandler = handler;
        }
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeSetListenerHandler(j10, handler);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int setLocalProcessedAudioFrameCallbackFormat(int i10, int i11, int i12, int i13) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            return j10 != 0 ? nativeSetLocalProcessedAudioFrameCallbackFormat(j10, i10, i11, i12, i13) : 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int setLocalVideoProcessListener(int i10, int i11, int i12, TRTCCloudListener.TRTCVideoFrameListener tRTCVideoFrameListener) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeTrtcCloudJni != 0) {
                if (!isCustomPreprocessSupportedFormatType(i11)) {
                    this.mJniReadLock.unlock();
                    return TXLiteAVCode.ERR_PIXEL_FORMAT_UNSUPPORTED;
                }
                if (!isCustomPreprocessSupportedBufferType(i12)) {
                    this.mJniReadLock.unlock();
                    return TXLiteAVCode.ERR_BUFFER_TYPE_UNSUPPORTED;
                }
                synchronized (this.mVideoFrameListenerWrapper) {
                    a<TRTCCloudListener.TRTCVideoFrameListener> aVar = this.mVideoFrameListenerWrapper;
                    if (aVar.f99890d != null) {
                        nativeEnableVideoCustomPreprocess(this.mNativeTrtcCloudJni, false, aVar.f99887a, aVar.f99888b, aVar.f99889c);
                    }
                    a<TRTCCloudListener.TRTCVideoFrameListener> aVar2 = this.mVideoFrameListenerWrapper;
                    aVar2.f99890d = tRTCVideoFrameListener;
                    aVar2.f99887a = i10;
                    aVar2.f99888b = i11;
                    aVar2.f99889c = i12;
                    if (tRTCVideoFrameListener != 0) {
                        nativeEnableVideoCustomPreprocess(this.mNativeTrtcCloudJni, true, i10, i11, i12);
                    }
                }
            }
            this.mJniReadLock.unlock();
            return 0;
        } catch (Throwable th2) {
            this.mJniReadLock.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0086 A[Catch: all -> 0x00a9, TryCatch #0 {, blocks: (B:18:0x003b, B:20:0x0041, B:22:0x0045, B:30:0x0052, B:31:0x0054, B:33:0x0056, B:34:0x007c, B:36:0x0086, B:37:0x00a6), top: B:45:0x003b, outer: #1 }] */
    /* JADX WARN: Multi-variable type inference failed */
    public int setLocalVideoRenderListener(int i10, int i11, TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeTrtcCloudJni != 0) {
                if (!isCustomRenderSupportedFormatType(i10)) {
                    this.mJniReadLock.unlock();
                    return TXLiteAVCode.ERR_PIXEL_FORMAT_UNSUPPORTED;
                }
                if (!isCustomRenderSupportedBufferType(i11)) {
                    this.mJniReadLock.unlock();
                    return TXLiteAVCode.ERR_BUFFER_TYPE_UNSUPPORTED;
                }
                synchronized (this.mLocalVideoRenderListenerWrapper) {
                    a<TRTCCloudListener.TRTCVideoRenderListener> aVar = this.mLocalVideoRenderListenerWrapper;
                    if (aVar.f99890d == null) {
                        a<TRTCCloudListener.TRTCVideoRenderListener> aVar2 = this.mLocalVideoRenderListenerWrapper;
                        aVar2.f99890d = tRTCVideoRenderListener;
                        aVar2.f99888b = i10;
                        aVar2.f99889c = i11;
                        if (tRTCVideoRenderListener != 0) {
                            nativeEnableVideoCustomRender(this.mNativeTrtcCloudJni, true, "", 0, i10, i11);
                            long j10 = this.mNativeTrtcCloudJni;
                            a<TRTCCloudListener.TRTCVideoRenderListener> aVar3 = this.mLocalVideoRenderListenerWrapper;
                            nativeEnableVideoCustomRender(j10, true, "", 2, aVar3.f99888b, aVar3.f99889c);
                        }
                    } else {
                        int i12 = aVar.f99888b;
                        if (((i12 == i10 && aVar.f99889c == i11) ? false : true) || tRTCVideoRenderListener == 0) {
                            nativeEnableVideoCustomRender(this.mNativeTrtcCloudJni, false, "", 0, i12, aVar.f99889c);
                            long j11 = this.mNativeTrtcCloudJni;
                            a<TRTCCloudListener.TRTCVideoRenderListener> aVar4 = this.mLocalVideoRenderListenerWrapper;
                            nativeEnableVideoCustomRender(j11, false, "", 2, aVar4.f99888b, aVar4.f99889c);
                            a<TRTCCloudListener.TRTCVideoRenderListener> aVar5 = this.mLocalVideoRenderListenerWrapper;
                            aVar5.f99890d = tRTCVideoRenderListener;
                            aVar5.f99888b = i10;
                            aVar5.f99889c = i11;
                            if (tRTCVideoRenderListener != 0) {
                                nativeEnableVideoCustomRender(this.mNativeTrtcCloudJni, true, "", 0, i10, i11);
                                long j12 = this.mNativeTrtcCloudJni;
                                a<TRTCCloudListener.TRTCVideoRenderListener> aVar6 = this.mLocalVideoRenderListenerWrapper;
                                nativeEnableVideoCustomRender(j12, true, "", 2, aVar6.f99888b, aVar6.f99889c);
                            }
                        } else {
                            aVar.f99890d = tRTCVideoRenderListener;
                        }
                    }
                }
            }
            this.mJniReadLock.unlock();
            return 0;
        } catch (Throwable th2) {
            this.mJniReadLock.unlock();
            throw th2;
        }
    }

    public void setLocalViewFillMode(int i10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeSetLocalViewFillMode(j10, i10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setLocalViewMirror(int i10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeSetLocalViewMirror(j10, i10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setLocalViewRotation(int i10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeSetLocalViewRotation(j10, i10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setMixExternalAudioVolume(int i10, int i11) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeSetMixExternalAudioVolume(j10, i10, i11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setMixTranscodingConfig(TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeSetMixTranscodingConfig(j10, tRTCTranscodingConfig == null ? null : new TranscodingConfig(tRTCTranscodingConfig));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int setMixedPlayAudioFrameCallbackFormat(int i10, int i11, int i12, int i13) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            return j10 != 0 ? nativeSetMixedPlayAudioFrameCallbackFormat(j10, i10, i11, i12, i13) : 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setNetworkQosParam(TRTCCloudDef.TRTCNetworkQosParam tRTCNetworkQosParam) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeSetNetworkQosParam(j10, tRTCNetworkQosParam.preference, tRTCNetworkQosParam.controlMode);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setPerspectiveCorrectionPoints(String str, PointF[] pointFArr, PointF[] pointFArr2) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                List listAsList = null;
                float[] fArrA = g.a(pointFArr == null ? null : Arrays.asList(pointFArr));
                if (pointFArr2 != null) {
                    listAsList = Arrays.asList(pointFArr2);
                }
                nativeSetPerspectiveCorrectionPoints(j10, str, fArrA, g.a(listAsList));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int setPriorRemoteVideoStreamType(int i10) {
        long j10 = this.mNativeTrtcCloudJni;
        if (j10 == 0) {
            return 0;
        }
        nativeSetPriorRemoteVideoStreamType(j10, i10);
        return 0;
    }

    public void setRemoteAudioParallelParams(TRTCCloudDef.TRTCAudioParallelParams tRTCAudioParallelParams) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeSetRemoteAudioParallelParams(j10, new AudioParallelParams(tRTCAudioParallelParams));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setRemoteAudioVolume(String str, int i10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeSetRemoteAudioVolume(j10, str, i10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int setRemoteVideoRenderListener(String str, int i10, int i11, TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener) {
        this.mJniReadLock.lock();
        try {
            byte b10 = 0;
            if (this.mNativeTrtcCloudJni != 0) {
                if (TextUtils.isEmpty(str)) {
                    this.mJniReadLock.unlock();
                    return -3319;
                }
                if (!isCustomRenderSupportedFormatType(i10)) {
                    this.mJniReadLock.unlock();
                    return TXLiteAVCode.ERR_PIXEL_FORMAT_UNSUPPORTED;
                }
                if (!isCustomRenderSupportedBufferType(i11)) {
                    this.mJniReadLock.unlock();
                    return TXLiteAVCode.ERR_BUFFER_TYPE_UNSUPPORTED;
                }
                synchronized (this.mRemoteVideoRenderListenerMap) {
                    a<TRTCCloudListener.TRTCVideoRenderListener> aVar = this.mRemoteVideoRenderListenerMap.get(str);
                    if (aVar != null) {
                        int i12 = aVar.f99888b;
                        if (((i12 == i10 && aVar.f99889c == i11) ? false : true) || tRTCVideoRenderListener == 0) {
                            nativeEnableVideoCustomRender(this.mNativeTrtcCloudJni, false, str, 0, i12, aVar.f99889c);
                            nativeEnableVideoCustomRender(this.mNativeTrtcCloudJni, false, str, 2, aVar.f99888b, aVar.f99889c);
                        } else {
                            aVar.f99890d = tRTCVideoRenderListener;
                            this.mRemoteVideoRenderListenerMap.put(str, aVar);
                        }
                    }
                    if (tRTCVideoRenderListener != 0) {
                        a<TRTCCloudListener.TRTCVideoRenderListener> aVar2 = new a<>(b10);
                        aVar2.f99890d = tRTCVideoRenderListener;
                        aVar2.f99888b = i10;
                        aVar2.f99889c = i11;
                        nativeEnableVideoCustomRender(this.mNativeTrtcCloudJni, true, str, 0, i10, i11);
                        nativeEnableVideoCustomRender(this.mNativeTrtcCloudJni, true, str, 2, aVar2.f99888b, aVar2.f99889c);
                        this.mRemoteVideoRenderListenerMap.put(str, aVar2);
                    } else {
                        this.mRemoteVideoRenderListenerMap.remove(str);
                    }
                }
            }
            this.mJniReadLock.unlock();
            return 0;
        } catch (Throwable th2) {
            this.mJniReadLock.unlock();
            throw th2;
        }
    }

    public int setRemoteVideoStreamType(String str, int i10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeSetRemoteVideoStreamType(j10, str, i10);
            }
            return 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setRemoteViewFillMode(String str, int i10, int i11) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeSetRemoteViewFillMode(j10, str, i10, i11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setRemoteViewMirror(String str, int i10, int i11) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeSetRemoteViewMirror(j10, str, i10, i11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setRemoteViewRotation(String str, int i10, int i11) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeSetRemoteViewRotation(j10, str, i10, i11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setVideoEncoderMirror(boolean z10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeSetVideoEncoderMirror(j10, z10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setVideoEncoderParams(int i10, TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeSetVideoEncoderParams(j10, i10, new VideoEncParams(tRTCVideoEncParam));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setVideoEncoderRotation(int i10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeSetVideoEncoderRotation(j10, i10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setVideoMuteImage(Bitmap bitmap, int i10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeSetVideoMuteImage(j10, bitmap, i10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setWatermark(Bitmap bitmap, int i10, float f10, float f11, float f12) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeSetWatermark(j10, bitmap, i10, f10, f11, f12);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void showDashboardManager(int i10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeShowDashboardManager(j10, i10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void snapshotVideo(String str, int i10, int i11, TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeSnapshotVideo(j10, str, i10, i11, tRTCSnapshotListener);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int startAudioRecording(TRTCCloudDef.TRTCAudioRecordingParams tRTCAudioRecordingParams) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 == 0) {
                return 0;
            }
            return nativeStartAudioRecording(j10, new AudioRecordingParams(tRTCAudioRecordingParams));
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startLocalAudio() {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeStartLocalAudio(j10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startLocalAudio(int i10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeStartLocalAudioWithQuality(j10, i10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startLocalPreview(boolean z10, TXCloudVideoView tXCloudVideoView) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeStartLocalPreview(j10, z10, tXCloudVideoView);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startLocalRecording(TRTCCloudDef.TRTCLocalRecordingParams tRTCLocalRecordingParams) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeStartLocalRecording(j10, new LocalRecordingParams(tRTCLocalRecordingParams));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startPublishCDNStream(TRTCCloudDef.TRTCPublishCDNParam tRTCPublishCDNParam) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeStartPublishCDNStream(j10, new PublishCDNParams(tRTCPublishCDNParam));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startPublishMediaStream(TRTCCloudDef.TRTCPublishTarget tRTCPublishTarget, TRTCCloudDef.TRTCStreamEncoderParam tRTCStreamEncoderParam, TRTCCloudDef.TRTCStreamMixingConfig tRTCStreamMixingConfig) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                StreamMixingConfig streamMixingConfig = null;
                PublishTarget publishTarget = tRTCPublishTarget == null ? null : new PublishTarget(tRTCPublishTarget);
                StreamEncoderParam streamEncoderParam = tRTCStreamEncoderParam == null ? null : new StreamEncoderParam(tRTCStreamEncoderParam);
                if (tRTCStreamMixingConfig != null) {
                    streamMixingConfig = new StreamMixingConfig(tRTCStreamMixingConfig);
                }
                nativeStartPublishMediaStream(j10, publishTarget, streamEncoderParam, streamMixingConfig);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startPublishing(String str, int i10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeStartPublishing(j10, str, i10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startRemoteView(String str, int i10, TXCloudVideoView tXCloudVideoView) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeStartRemoteView(j10, str, i10, tXCloudVideoView);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startRemoteView(String str, TXCloudVideoView tXCloudVideoView) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeStartRemoteViewWithoutStreamType(j10, str, tXCloudVideoView);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startScreenCapture(int i10, TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam, TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeTrtcCloudJni != 0) {
                ScreenShareParams screenShareParams = tRTCScreenShareParams != null ? new ScreenShareParams(tRTCScreenShareParams) : null;
                if (tRTCVideoEncParam == null) {
                    nativeStartScreenCapture(this.mNativeTrtcCloudJni, i10, null, screenShareParams);
                    LiteavLog.w(TAG, "startScreenCapture encParams is null");
                } else {
                    nativeStartScreenCapture(this.mNativeTrtcCloudJni, i10, new VideoEncParams(tRTCVideoEncParam), screenShareParams);
                }
            }
            this.mJniReadLock.unlock();
            if (tRTCScreenShareParams != null) {
                ThreadUtils.runOnUiThread(b.a(this, tRTCScreenShareParams));
            }
        } catch (Throwable th2) {
            this.mJniReadLock.unlock();
            throw th2;
        }
    }

    public void startSpeedTest(int i10, String str, String str2) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeStartSpeedTest(j10, new SpeedTestParams(i10, str, str2));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startSpeedTest(TRTCCloudDef.TRTCSpeedTestParams tRTCSpeedTestParams) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeStartSpeedTest(j10, new SpeedTestParams(tRTCSpeedTestParams));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startSystemAudioLoopback() {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeStartSystemAudioLoopback(j10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopAllRemoteView() {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeStopAllRemoteView(j10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopAudioRecording() {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeStopAudioRecording(j10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopLocalAudio() {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeStopLocalAudio(j10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopLocalPreview() {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeStopLocalPreview(j10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopLocalRecording() {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeStopLocalRecording(j10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopPublishCDNStream() {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeStopPublishCDNStream(j10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopPublishMediaStream(String str) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeStopPublishMediaStream(j10, str);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopPublishing() {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeStopPublishing(j10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopRemoteView(String str) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeStopRemoteViewWithoutStreamType(j10, str);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopRemoteView(String str, int i10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeStopRemoteView(j10, str, i10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopScreenCapture(int i10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeStopScreenCapture(j10, i10);
            }
            this.mJniReadLock.unlock();
            ThreadUtils.runOnUiThread(c.a(this));
        } catch (Throwable th2) {
            this.mJniReadLock.unlock();
            throw th2;
        }
    }

    public void stopSpeedTest() {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeStopSpeedTest(j10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopSystemAudioLoopback() {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeStopSystemAudioLoopback(j10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void switchRole(int i10) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeSwitchRole(j10, i10);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void switchRole(int i10, String str) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeSwitchRoleWithPrivateMapKey(j10, i10, str);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void switchRoom(TRTCCloudDef.TRTCSwitchRoomConfig tRTCSwitchRoomConfig) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeSwitchRoom(j10, new SwitchRoomConfig(tRTCSwitchRoomConfig));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void updateLocalView(TXCloudVideoView tXCloudVideoView) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeUpdateLocalView(j10, tXCloudVideoView);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void updateOtherRoomForwardMode(String str) {
        long j10 = this.mNativeTrtcCloudJni;
        if (j10 != 0) {
            nativeUpdateOtherRoomForwardMode(j10, str);
        }
    }

    public void updatePublishMediaStream(String str, TRTCCloudDef.TRTCPublishTarget tRTCPublishTarget, TRTCCloudDef.TRTCStreamEncoderParam tRTCStreamEncoderParam, TRTCCloudDef.TRTCStreamMixingConfig tRTCStreamMixingConfig) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeUpdatePublishMediaStream(j10, str, tRTCPublishTarget == null ? null : new PublishTarget(tRTCPublishTarget), tRTCStreamEncoderParam == null ? null : new StreamEncoderParam(tRTCStreamEncoderParam), tRTCStreamMixingConfig == null ? null : new StreamMixingConfig(tRTCStreamMixingConfig));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void updateRemote3DSpatialPosition(String str, int[] iArr) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeUpdateRemote3DSpatialPosition(j10, str, iArr);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void updateRemoteView(String str, int i10, TXCloudVideoView tXCloudVideoView) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeUpdateRemoteView(j10, str, i10, tXCloudVideoView);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void updateSelf3DSpatialPosition(int[] iArr, float[] fArr, float[] fArr2, float[] fArr3) {
        this.mJniReadLock.lock();
        try {
            long j10 = this.mNativeTrtcCloudJni;
            if (j10 != 0) {
                nativeUpdateSelf3DSpatialPosition(j10, iArr, fArr, fArr2, fArr3);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }
}
