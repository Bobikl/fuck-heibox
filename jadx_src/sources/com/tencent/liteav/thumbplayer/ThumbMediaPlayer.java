package com.tencent.liteav.thumbplayer;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import anet.channel.util.HttpConstant;
import com.huawei.hms.framework.common.ContainerUtils;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.s;
import com.tencent.liteav.sdk.common.LicenseChecker;
import com.tencent.liteav.txcplayer.a;
import com.tencent.liteav.txcplayer.b;
import com.tencent.liteav.txcplayer.c;
import com.tencent.liteav.txcplayer.e;
import com.tencent.liteav.txcplayer.model.TXSubtitleRenderModel;
import com.tencent.liteav.txcvodplayer.hlsencoder.TXCHLSEncoder;
import com.tencent.rtmp.TXVodConstants;
import com.tencent.thumbplayer.tcmedia.api.ITPModuleLoader;
import com.tencent.thumbplayer.tcmedia.api.ITPPlayer;
import com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener;
import com.tencent.thumbplayer.tcmedia.api.TPAudioFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPOptionalParam;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerFactory;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr;
import com.tencent.thumbplayer.tcmedia.api.TPProgramInfo;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleRenderModel;
import com.tencent.thumbplayer.tcmedia.api.TPTrackInfo;
import com.tencent.thumbplayer.tcmedia.api.TPVideoInfo;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAssetExtraParam;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAssetOrderedMap;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaDRMAsset;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaUrlAsset;
import com.tencent.thumbplayer.tcmedia.api.composition.TPMediaCompositionFactory;
import com.tencent.thumbplayer.tcmedia.api.proxy.TPDownloadParamData;
import com.tencent.thumbplayer.tcmedia.api.report.ITPBusinessReportManager;
import com.tencent.thumbplayer.tcmedia.api.report.TPDefaultReportInfo;
import com.tencent.thumbplayer.tcmedia.config.TPPlayerConfig;
import com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDLProxyInitParam;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyFactory;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import com.tencent.trtc.TRTCCloudDef;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ThumbMediaPlayer extends a implements b {
    private static int MODE_PHONE = 0;
    private static int MODE_TV = 1;
    private static final String THUMB_PLAYER_GUID = "liteav_tbplayer_android_";
    private static final int THUMB_PLAYER_PLATFORM_ID = 2330303;
    private static volatile boolean mSDKInited = false;
    private e mConfig;
    private Context mContext;
    private String mDataSource;
    private boolean mIsLooping;
    private boolean mIsPlayerReleased;
    private Map<String, Object> mPrivateConfig;
    private float mRate;
    private boolean mReuseSurfaceTexture;
    private boolean mScreenOnWhilePlaying;
    private Surface mSurface;
    private SurfaceHolder mSurfaceHolder;
    private SurfaceTexture mSurfaceTexture;
    private c mSurfaceTextureHost;
    private volatile ITPPlayer mTPPPlayer;
    private final String TAG = ThumbMediaPlayer.class.getName();
    private boolean mEnableAccurateSeek = false;
    private PowerManager.WakeLock mWakeLock = null;
    private int mBitrateIndex = -1000;
    private long mCachedBytes = 0;
    private long mBitrate = 0;
    private long mTcpSpeed = 0;
    private long mTotalFileSize = 0;
    private boolean mHasReceiveFirstVideoRenderEvent = false;
    private Object mTrtcCloud = null;
    private boolean mIsSetDefaultBufferSize = false;

    public static class TRTCCloudClassInvokeHelper {
        private static final String TAG = "com.tencent.liteav.thumbplayer.ThumbMediaPlayer$TRTCCloudClassInvokeHelper";
        private static TRTCCloudClassInvokeHelper mInstance;
        private Class mClazzTRTCAudioFrame;
        private Class mClazzTRTCCloud;
        private Field mFieldChannel;
        private Field mFieldData;
        private Field mFieldSampleRate;
        private Method mMethodMixExternalAudioFrame;

        private TRTCCloudClassInvokeHelper(Object obj) {
            if (obj != null) {
                try {
                    this.mClazzTRTCCloud = obj.getClass();
                    this.mClazzTRTCAudioFrame = TRTCCloudDef.TRTCAudioFrame.class;
                    this.mFieldData = TRTCCloudDef.TRTCAudioFrame.class.getDeclaredField("data");
                    this.mFieldSampleRate = this.mClazzTRTCAudioFrame.getDeclaredField("sampleRate");
                    this.mFieldChannel = this.mClazzTRTCAudioFrame.getDeclaredField("channel");
                    this.mMethodMixExternalAudioFrame = this.mClazzTRTCCloud.getDeclaredMethod("mixExternalAudioFrame", this.mClazzTRTCAudioFrame);
                } catch (Exception e10) {
                    LiteavLog.e(TAG, "init TRTCCloudClassInvokeWrapper error: " + e10.getMessage());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static TRTCCloudClassInvokeHelper getInstance(Object obj) {
            if (mInstance == null) {
                mInstance = new TRTCCloudClassInvokeHelper(obj);
            }
            return mInstance;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mixExternalAudioFrame(Object obj, TPAudioFrameBuffer tPAudioFrameBuffer) {
            if (obj != null) {
                try {
                    Object objNewInstance = this.mClazzTRTCAudioFrame.newInstance();
                    this.mFieldData.set(objNewInstance, tPAudioFrameBuffer.data[0]);
                    this.mFieldSampleRate.set(objNewInstance, Integer.valueOf(tPAudioFrameBuffer.sampleRate));
                    this.mFieldChannel.set(objNewInstance, Integer.valueOf(tPAudioFrameBuffer.channels));
                    this.mMethodMixExternalAudioFrame.invoke(obj, objNewInstance);
                } catch (Exception e10) {
                    LiteavLog.e(TAG, "mixExternalAudioFrame method error ", e10);
                }
            }
        }
    }

    public static class TXSDKModuleLoader implements ITPModuleLoader {
        private TXSDKModuleLoader() {
        }

        @Override // com.tencent.thumbplayer.tcmedia.api.ITPModuleLoader
        public void loadLibrary(String str, String str2) {
            s.a(str);
        }
    }

    public ThumbMediaPlayer(Context context) {
        synchronized (ThumbMediaPlayer.class) {
            if (!mSDKInited) {
                setTPSystemInfo();
                setTPPLibCustomLoader();
                TPPlayerMgr.initSdk(context, THUMB_PLAYER_GUID + context.getPackageName(), THUMB_PLAYER_PLATFORM_ID);
                TPPlayerMgr.setDebugEnable(false);
                mSDKInited = true;
            }
        }
        if (this.mTPPPlayer == null) {
            TPPlayerMgr.setDebugEnable(false);
            this.mTPPPlayer = TPPlayerFactory.createTPPlayer(context);
            new ThumbMediaPlayerListener(this).attachToPlayer();
        }
        this.mContext = context;
        setCustomReportData();
    }

    private int checkDlType() {
        e eVar = this.mConfig;
        if (eVar == null) {
            return 0;
        }
        int i10 = eVar.D;
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 2) {
            return 5;
        }
        if (i10 != 3) {
            return i10 != 4 ? 0 : 19;
        }
        return 10;
    }

    public static boolean clearAllOnlineCache(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        ITPDownloadProxy tPDownloadProxy = TPDownloadProxyFactory.getTPDownloadProxy(THUMB_PLAYER_PLATFORM_ID);
        tPDownloadProxy.init(context, new TPDLProxyInitParam(THUMB_PLAYER_PLATFORM_ID, "1.0.0", THUMB_PLAYER_GUID + context.getPackageName(), str));
        return tPDownloadProxy.clearCache(str, "", 8, -1L) == 0;
    }

    private TPSubtitleRenderModel convertToTPSubtitleRenderModel(TXSubtitleRenderModel tXSubtitleRenderModel) {
        int i10;
        TPSubtitleRenderModel tPSubtitleRenderModel = new TPSubtitleRenderModel();
        int i11 = tXSubtitleRenderModel.canvasHeight;
        if (i11 != 0 && (i10 = tXSubtitleRenderModel.canvasWidth) != 0) {
            tPSubtitleRenderModel.canvasWidth = i10;
            tPSubtitleRenderModel.canvasHeight = i11;
            long j10 = tPSubtitleRenderModel.paramFlags | 1 | 2;
            tPSubtitleRenderModel.paramFlags = j10;
            float f10 = tXSubtitleRenderModel.fontSize;
            if (f10 != 0.0f) {
                tPSubtitleRenderModel.fontSize = f10;
                tPSubtitleRenderModel.paramFlags = j10 | 4;
            }
            float f11 = tXSubtitleRenderModel.outlineWidth;
            if (f11 != 0.0f) {
                tPSubtitleRenderModel.outlineWidth = f11;
                tPSubtitleRenderModel.paramFlags |= 16;
            }
            float f12 = tXSubtitleRenderModel.lineSpace;
            if (f12 != 0.0f) {
                tPSubtitleRenderModel.lineSpace = f12;
                tPSubtitleRenderModel.paramFlags |= 64;
            }
        }
        float f13 = tXSubtitleRenderModel.fontScale;
        if (f13 != 0.0f) {
            tPSubtitleRenderModel.fontScale = f13;
            tPSubtitleRenderModel.paramFlags |= 2048;
        }
        String str = tXSubtitleRenderModel.familyName;
        if (str != null) {
            tPSubtitleRenderModel.familyName = str;
        }
        int i12 = tXSubtitleRenderModel.fontColor;
        if (i12 != 0) {
            tPSubtitleRenderModel.fontColor = i12;
            tPSubtitleRenderModel.paramFlags |= 8;
        }
        if (tXSubtitleRenderModel.isBondFontStyle) {
            tPSubtitleRenderModel.fontStyleFlags |= 1;
            tPSubtitleRenderModel.paramFlags |= 1024;
        }
        int i13 = tXSubtitleRenderModel.outlineColor;
        if (i13 != 0) {
            tPSubtitleRenderModel.outlineColor = i13;
            tPSubtitleRenderModel.paramFlags |= 32;
        }
        float f14 = tXSubtitleRenderModel.startMargin;
        if (f14 != 0.0f) {
            tPSubtitleRenderModel.lineSpace = f14;
            tPSubtitleRenderModel.paramFlags |= 128;
        }
        float f15 = tXSubtitleRenderModel.endMargin;
        if (f15 != 0.0f) {
            tPSubtitleRenderModel.endMargin = f15;
            tPSubtitleRenderModel.paramFlags |= 256;
        }
        float f16 = tXSubtitleRenderModel.verticalMargin;
        if (f16 != 0.0f) {
            tPSubtitleRenderModel.verticalMargin = f16;
            tPSubtitleRenderModel.paramFlags |= 512;
        }
        return tPSubtitleRenderModel;
    }

    private ITPMediaAsset handleDRMAsset(String str) {
        Map<String, Object> map = this.mPrivateConfig;
        if (map == null) {
            return null;
        }
        Object obj = map.get("TXC_DRM_ENABLE");
        if (!(obj instanceof Boolean) || !((Boolean) obj).booleanValue()) {
            return null;
        }
        Object obj2 = this.mPrivateConfig.get("TXC_DRM_KEY_URL");
        Object obj3 = this.mPrivateConfig.get("TXC_DRM_PROVISION_URL");
        if ((obj2 instanceof String) && (obj3 instanceof String)) {
            String str2 = (String) obj2;
            if (!TextUtils.isEmpty(str2)) {
                String str3 = (String) obj3;
                if (!TextUtils.isEmpty(str3)) {
                    ITPMediaDRMAsset iTPMediaDRMAssetCreateMediaDRMAsset = TPMediaCompositionFactory.createMediaDRMAsset(0, str);
                    iTPMediaDRMAssetCreateMediaDRMAsset.setDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_PROVISION_URL, str3);
                    iTPMediaDRMAssetCreateMediaDRMAsset.setDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_LICENSE_URL, str2);
                    iTPMediaDRMAssetCreateMediaDRMAsset.setDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_LICENSE_STANDARDIZATION, "1");
                    return iTPMediaDRMAssetCreateMediaDRMAsset;
                }
            }
        }
        Object obj4 = this.mPrivateConfig.get("TXC_DRM_SIMPLE_AES_URL");
        if (!(obj4 instanceof String)) {
            return null;
        }
        String str4 = (String) obj4;
        if (TextUtils.isEmpty(str4)) {
            return null;
        }
        return TPMediaCompositionFactory.createMediaUrlAsset(str4);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0075  */
    private ITPMediaUrlAsset handleUrlAsset(String str) {
        e eVar = this.mConfig;
        if (eVar == null) {
            return null;
        }
        boolean z10 = true;
        if (eVar.f99907g != 1) {
            return null;
        }
        int i10 = eVar.f99918r;
        long jResolveAdaptivePreferredResolution = resolveAdaptivePreferredResolution(eVar.f99922v);
        if (i10 <= 0 && jResolveAdaptivePreferredResolution <= 0) {
            return null;
        }
        ITPMediaUrlAsset iTPMediaUrlAssetCreateMediaUrlAsset = TPMediaCompositionFactory.createMediaUrlAsset(str);
        ITPMediaAssetExtraParam iTPMediaAssetExtraParamCreateMediaAssetExtraParam = TPMediaCompositionFactory.createMediaAssetExtraParam();
        ITPMediaAssetOrderedMap iTPMediaAssetOrderedMapCreateMediaAssetOrderedMap = TPMediaCompositionFactory.createMediaAssetOrderedMap();
        String strA = com.tencent.liteav.txcplayer.a.a.a(str);
        if (TextUtils.isEmpty(strA)) {
            z10 = false;
        } else if (strA.toLowerCase().endsWith("m3u8")) {
            if (i10 > 0) {
                iTPMediaAssetOrderedMapCreateMediaAssetOrderedMap.addKeyValue(ITPMediaAssetOrderedMap.TP_PLAYER_EXTRA_PARAM_HLS_TRACK_BANDWIDTH, String.valueOf(i10));
            } else {
                iTPMediaAssetOrderedMapCreateMediaAssetOrderedMap.addKeyValue(ITPMediaAssetOrderedMap.TP_PLAYER_EXTRA_PARAM_HLS_TRACK_LUMA_SAMPLES, String.valueOf(jResolveAdaptivePreferredResolution));
            }
        } else if (!strA.toLowerCase().endsWith("mpd")) {
            z10 = false;
        } else if (i10 > 0) {
            iTPMediaAssetOrderedMapCreateMediaAssetOrderedMap.addKeyValue(ITPMediaAssetOrderedMap.TP_PLAYER_EXTRA_PARAM_DASH_TRACK_BANDWIDTH, String.valueOf(i10));
        } else {
            iTPMediaAssetOrderedMapCreateMediaAssetOrderedMap.addKeyValue(ITPMediaAssetOrderedMap.TP_PLAYER_EXTRA_PARAM_DASH_TRACK_LUMA_SAMPLES, String.valueOf(jResolveAdaptivePreferredResolution));
        }
        if (!z10) {
            return null;
        }
        iTPMediaAssetExtraParamCreateMediaAssetExtraParam.setExtraObject(ITPMediaAssetExtraParam.TP_PLAYER_EXTRA_PARAM_PREFERRED_VIDEO, iTPMediaAssetOrderedMapCreateMediaAssetOrderedMap);
        iTPMediaUrlAssetCreateMediaUrlAsset.setExtraParam(iTPMediaAssetExtraParamCreateMediaAssetExtraParam);
        return iTPMediaUrlAssetCreateMediaUrlAsset;
    }

    private boolean isAssetFile(String str) {
        return !TextUtils.isEmpty(str) && str.toLowerCase().startsWith("asset://");
    }

    private boolean isContentUri(String str) {
        return !TextUtils.isEmpty(str) && str.toLowerCase().startsWith("content://");
    }

    private boolean isOfflinePlay(String str) {
        if (!TextUtils.isEmpty(str) && str.contains("?") && !str.startsWith("http")) {
            String strD = com.tencent.liteav.txcplayer.a.a.d(str.substring(str.indexOf("?") + 1));
            if (!TextUtils.isEmpty(strD)) {
                if (str.contains(strD + "?")) {
                    return true;
                }
            }
        }
        return false;
    }

    static /* synthetic */ void lambda$checkSubtitle$0(ThumbMediaPlayer thumbMediaPlayer) {
        TPTrackInfo[] trackInfo = thumbMediaPlayer.getTrackInfo();
        if (trackInfo == null || trackInfo.length == 0) {
            return;
        }
        for (int i10 = 0; i10 < trackInfo.length; i10++) {
            TPTrackInfo tPTrackInfo = trackInfo[i10];
            if (tPTrackInfo.trackType == 3 && tPTrackInfo.isInternal && tPTrackInfo.isSelected) {
                thumbMediaPlayer.deselectTrack(i10);
            }
        }
    }

    private void parseExtraConfig(Map<String, Object> map) {
        if (map == null || map.size() == 0) {
            return;
        }
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (str.equals(TXVodConstants.VOD_USE_DOWNLOADER) && (obj instanceof Boolean)) {
                TPPlayerConfig.setP2PEnable(((Boolean) obj).booleanValue());
            } else {
                try {
                    int i10 = Integer.parseInt(str);
                    if (obj instanceof Boolean) {
                        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildBoolean(i10, ((Boolean) obj).booleanValue()));
                    } else if ((obj instanceof Long) || (obj instanceof Integer)) {
                        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(i10, obj instanceof Long ? ((Long) obj).longValue() : ((Integer) obj).longValue()));
                    } else if ((obj instanceof Float) || (obj instanceof Double)) {
                        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildFloat(i10, obj instanceof Float ? ((Float) obj).floatValue() : ((Double) obj).floatValue()));
                    } else if (obj instanceof String) {
                        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildString(i10, (String) obj));
                    } else {
                        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildObject(i10, obj));
                    }
                } catch (Exception unused) {
                    LiteavLog.e(this.TAG, "key " + str + " is not id!");
                }
            }
        }
    }

    private long resolveAdaptivePreferredResolution(long j10) {
        if (this.mBitrateIndex == -1 && j10 <= 0) {
            long j11 = this.mConfig.f99920t;
            if (j11 > 0) {
                return j11;
            }
        }
        return j10;
    }

    private void setCustomReportData() {
        ITPBusinessReportManager reportManager = this.mTPPPlayer.getReportManager();
        TPDefaultReportInfo tPDefaultReportInfo = new TPDefaultReportInfo() { // from class: com.tencent.liteav.thumbplayer.ThumbMediaPlayer.1
            @Override // com.tencent.thumbplayer.tcmedia.api.report.TPDefaultReportInfo
            public int getPlayType() {
                return 0;
            }
        };
        if (TextUtils.isEmpty(null)) {
            return;
        }
        try {
            tPDefaultReportInfo.scenesId = Integer.parseInt(null);
        } catch (Exception e10) {
            LiteavLog.w(this.TAG, "set scenesId fail for parse appid:" + ((String) null) + " ,error=" + e10.getMessage());
        }
        reportManager.setReportInfoGetter(tPDefaultReportInfo);
    }

    private void setEnableMixExternalAudioFrame() {
        LiteavLog.i(this.TAG, "setEnableMixExternalAudioFrame");
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(404, -1L));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildBoolean(120, true));
        this.mTPPPlayer.setOnAudioFrameOutputListener(new ITPPlayerListener.IOnAudioFrameOutputListener() { // from class: com.tencent.liteav.thumbplayer.ThumbMediaPlayer.3
            @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnAudioFrameOutputListener
            public void onAudioFrameOut(ITPPlayer iTPPlayer, TPAudioFrameBuffer tPAudioFrameBuffer) {
                if (ThumbMediaPlayer.this.mTrtcCloud != null) {
                    TRTCCloudClassInvokeHelper.getInstance(ThumbMediaPlayer.this.mTrtcCloud).mixExternalAudioFrame(ThumbMediaPlayer.this.mTrtcCloud, tPAudioFrameBuffer);
                }
            }
        });
    }

    private void setMp4EncryptionInfo(String str, boolean z10) {
        boolean z11 = true;
        if (this.mConfig.f99921u != 1 || str == null || str.isEmpty() || !com.tencent.liteav.txcplayer.common.c.a(LicenseChecker.a.PLAYER_PREMIUM)) {
            return;
        }
        String strD = com.tencent.liteav.txcplayer.a.a.d(str);
        com.tencent.liteav.txcvodplayer.c.a aVarA = com.tencent.liteav.txcvodplayer.c.a.a();
        synchronized (aVarA.f100127b) {
            aVarA.f100128c.add(strD);
        }
        com.tencent.liteav.txcvodplayer.b.c.b bVarA = com.tencent.liteav.txcvodplayer.c.a.a().a(bb.c.b.Q9, strD);
        if (bVarA == null || TextUtils.isEmpty(bVarA.f100079a)) {
            bVarA = new com.tencent.liteav.txcvodplayer.b.c.b();
            bVarA.f100079a = TXCHLSEncoder.a();
            bVarA.f100080b = TXCHLSEncoder.a();
        } else {
            z11 = false;
        }
        if (TextUtils.isEmpty(bVarA.f100081c)) {
            bVarA.f100081c = TXCHLSEncoder.a(bVarA.f100079a);
            bVarA.f100082d = TXCHLSEncoder.a(bVarA.f100080b);
        }
        if (TextUtils.isEmpty(bVarA.f100081c) || TextUtils.isEmpty(bVarA.f100082d)) {
            return;
        }
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildString(184, bVarA.f100079a));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildString(185, bVarA.f100080b));
        Map<String, String> map = this.mConfig.f99908h;
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("X-Request-CipheredOverlayKey", bVarA.f100081c);
        map.put("X-Request-CipheredOverlayIV", bVarA.f100082d);
        map.put("X-Request-CipheredOverlayVersion", "v2");
        this.mConfig.f99908h = map;
        if (z11 && z10) {
            com.tencent.liteav.txcvodplayer.c.a.a().a(bb.c.b.Q9, strD, bVarA, str);
        }
    }

    private void setSurfaceToPlayer(Surface surface) {
        this.mSurfaceHolder = null;
        this.mSurface = surface;
        this.mTPPPlayer.setSurface(surface);
        LiteavLog.i(this.TAG, "setSurface mSurface:" + this.mSurface);
    }

    private void setTPPLibCustomLoader() {
        try {
            if (TextUtils.isEmpty(s.b())) {
                return;
            }
            TPPlayerMgr.setLibLoader(new TXSDKModuleLoader());
        } catch (Throwable th2) {
            LiteavLog.e(this.TAG, "setTPPLibCustomLoader, ex = " + th2.getMessage());
        }
    }

    private void setTPSystemInfo() {
        TPSystemInfo.setProperty(TPSystemInfo.KEY_PROPERTY_MODEL, LiteavSystemInfo.getModel());
        TPSystemInfo.setProperty(TPSystemInfo.KEY_PROPERTY_MANUFACTURER, LiteavSystemInfo.getManufacturer());
        TPSystemInfo.setProperty(TPSystemInfo.KEY_PROPERTY_VERSION_RELEASE, LiteavSystemInfo.getSystemOSVersion());
        TPSystemInfo.setProperty(TPSystemInfo.KEY_PROPERTY_BOARD, LiteavSystemInfo.getBoard());
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0096 A[PHI: r3
  0x0096: PHI (r3v13 float) = (r3v6 float), (r3v5 float) binds: [B:30:0x0094, B:27:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    private void setVideoInfo(String str) {
        String strD;
        long j10;
        e eVar;
        if (TextUtils.isEmpty(str) || this.mTPPPlayer == null) {
            return;
        }
        TPVideoInfo.Builder builder = new TPVideoInfo.Builder();
        int iCheckDlType = checkDlType();
        TPDownloadParamData tPDownloadParamData = new TPDownloadParamData(iCheckDlType);
        if (isOfflinePlay(str)) {
            String strSubstring = str.substring(0, str.indexOf("?"));
            String strSubstring2 = strSubstring.substring(strSubstring.lastIndexOf(47) + 1);
            TPDownloadProxyFactory.getTPDownloadProxy(THUMB_PLAYER_PLATFORM_ID).updateStoragePath(strSubstring.substring(0, strSubstring.lastIndexOf(47)));
            tPDownloadParamData.setOffline(true);
            strD = strSubstring2;
        } else {
            strD = com.tencent.liteav.txcplayer.a.a.d(str);
            if (iCheckDlType == 0 && strD.endsWith(".mp4")) {
                tPDownloadParamData.setDlType(10);
            }
        }
        builder.fileId(strD);
        if (iCheckDlType == 0 && (eVar = this.mConfig) != null && eVar.f99926z && strD.endsWith(".hls")) {
            tPDownloadParamData.setDlType(3);
        }
        HashMap map = new HashMap();
        e eVar2 = this.mConfig;
        float f10 = eVar2.f99914n;
        if (f10 <= 0.0f || eVar2.f99916p) {
            f10 = eVar2.f99913m;
            j10 = f10 > 0.0f ? (long) (f10 * 1024.0f * 1024.0f) : -1L;
        }
        if (j10 >= 0) {
            map.put(TPDownloadProxyEnum.DLPARAM_BUFFER_SIZE, Long.valueOf(j10));
        } else if (eVar2.f99916p) {
            map.put(TPDownloadProxyEnum.DLPARAM_BUFFER_SIZE, 0);
        } else {
            map.put(TPDownloadProxyEnum.DLPARAM_BUFFER_SIZE, Integer.valueOf(CommonNetImpl.MAX_SIZE_IN_KB));
            this.mIsSetDefaultBufferSize = true;
        }
        int i10 = this.mConfig.f99919s;
        if (i10 != -1000) {
            map.put(TPDownloadProxyEnum.DLPARAM_PREFERRED_BITRATE_INDEX, Integer.valueOf(i10));
        } else {
            int i11 = this.mBitrateIndex;
            if (i11 != -1000) {
                map.put(TPDownloadProxyEnum.DLPARAM_PREFERRED_BITRATE_INDEX, Integer.valueOf(i11));
            }
        }
        long j11 = this.mConfig.f99922v;
        if (j11 > 0) {
            map.put(TPDownloadProxyEnum.DLPARAM_PREFERRED_RESOLUTION, Long.valueOf(j11));
        }
        if (this.mConfig.f99921u == 2 && com.tencent.liteav.txcplayer.common.c.a(LicenseChecker.a.PLAYER_PREMIUM)) {
            map.put(TPDownloadProxyEnum.DLPARAM_CACHE_NEED_ENCRYPT, Boolean.TRUE);
        }
        if (map.size() > 0) {
            tPDownloadParamData.setExtInfoMap(map);
        }
        builder.downloadParam(tPDownloadParamData);
        this.mTPPPlayer.setVideoInfo(builder.build());
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void addSubtitleSource(String str, String str2, String str3) {
        this.mTPPPlayer.addSubtitleSource(str, str3, str2);
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void attachTRTC(Object obj) {
        this.mTrtcCloud = obj;
        if (obj != null) {
            try {
                Class<?> cls = obj.getClass();
                Class<?> cls2 = Boolean.TYPE;
                cls.getDeclaredMethod("enableMixExternalAudioFrame", cls2, cls2).invoke(this.mTrtcCloud, Boolean.FALSE, Boolean.TRUE);
                LiteavLog.i(this.TAG, "attachTRTC enableMixExternalAudioFrame");
                setEnableMixExternalAudioFrame();
            } catch (Exception e10) {
                LiteavLog.e(this.TAG, "attachTRTC exception : " + e10.toString());
            }
        }
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void checkSubtitle() {
        com.tencent.liteav.txcplayer.common.a.a().execute(ThumbMediaPlayer$$Lambda$1.lambdaFactory$(this));
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void deselectTrack(int i10) {
        this.mTPPPlayer.deselectTrack(i10, i10);
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void detachTRTC() {
        LiteavLog.i(this.TAG, "detachTRTC");
        Object obj = this.mTrtcCloud;
        if (obj != null) {
            try {
                Class<?> cls = obj.getClass();
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("enableMixExternalAudioFrame", cls2, cls2);
                Object obj2 = this.mTrtcCloud;
                Boolean bool = Boolean.FALSE;
                declaredMethod.invoke(obj2, bool, bool);
            } catch (Exception e10) {
                LiteavLog.e(this.TAG, "detachTRTC exception : " + e10.toString());
            }
            this.mTrtcCloud = null;
            TRTCCloudClassInvokeHelper unused = TRTCCloudClassInvokeHelper.mInstance = null;
        }
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void enableAdaptiveBitrate() {
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(504, 1L));
        this.mBitrateIndex = -1;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public int getBitrateIndex() {
        int i10 = this.mBitrateIndex;
        if (i10 == -1) {
            return i10;
        }
        TPProgramInfo[] programInfo = this.mTPPPlayer.getProgramInfo();
        if (programInfo != null && programInfo.length > 0) {
            for (TPProgramInfo tPProgramInfo : programInfo) {
                if (tPProgramInfo.actived && !TextUtils.isEmpty(tPProgramInfo.resolution)) {
                    this.mBitrateIndex = tPProgramInfo.programId;
                    break;
                }
            }
        }
        LiteavLog.i(this.TAG, "getBitrateIndex ：" + this.mBitrateIndex);
        return this.mBitrateIndex;
    }

    public e getConfig() {
        return this.mConfig;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public long getCurrentPosition() {
        return this.mTPPPlayer.getCurrentPositionMs();
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public long getDuration() {
        ITPPlayer iTPPlayer = this.mTPPPlayer;
        if (this.mIsPlayerReleased || iTPPlayer == null) {
            return 0L;
        }
        return iTPPlayer.getDurationMs();
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public com.tencent.liteav.txcplayer.model.b getMediaInfo() {
        String[] strArrSplit;
        LiteavLog.i(this.TAG, "getMediaInfo");
        com.tencent.liteav.txcplayer.model.b bVar = new com.tencent.liteav.txcplayer.model.b();
        bVar.f99932a = "thumbplayer";
        bVar.f99937f = new com.tencent.liteav.txcplayer.model.c();
        String propertyString = this.mTPPPlayer.getPropertyString(0);
        if (propertyString != null && propertyString.length() > 0 && (strArrSplit = propertyString.split("\\n")) != null && strArrSplit.length > 0) {
            bVar.f99937f.f99939b = getSupportedBitrates();
            int i10 = this.mBitrateIndex;
            if (i10 == -1000) {
                i10 = 0;
            }
            bVar.f99937f.f99942e = new com.tencent.liteav.txcplayer.model.c.a(i10);
            bVar.f99937f.f99941d = new com.tencent.liteav.txcplayer.model.c.a(i10);
            com.tencent.liteav.txcplayer.model.c cVar = bVar.f99937f;
            cVar.f99940c.add(cVar.f99942e);
            com.tencent.liteav.txcplayer.model.c cVar2 = bVar.f99937f;
            cVar2.f99940c.add(cVar2.f99941d);
            for (String str : strArrSplit) {
                if (str != null) {
                    String strTrim = str.substring(str.indexOf(ContainerUtils.KEY_VALUE_DELIMITER) + 1, str.length()).trim();
                    if (str.contains("ContainerFormat=")) {
                        bVar.f99937f.f99938a = strTrim;
                    } else if (str.contains("VideoCodec=")) {
                        bVar.f99933b = "avcodec";
                        bVar.f99934c = strTrim;
                        bVar.f99937f.f99941d.f99944b = strTrim;
                    } else if (str.contains("VideoProfile=")) {
                        bVar.f99937f.f99941d.f99945c = strTrim;
                    } else if (str.contains("Width=")) {
                        bVar.f99937f.f99941d.f99947e = Integer.valueOf(strTrim).intValue();
                    } else if (str.contains("Height=")) {
                        bVar.f99937f.f99941d.f99948f = Integer.valueOf(strTrim).intValue();
                    } else if (str.contains("VideoBitRate=")) {
                        bVar.f99937f.f99941d.f99946d = Integer.valueOf(strTrim).intValue();
                    } else if (str.contains("AudioCodec=")) {
                        bVar.f99935d = "avcodec";
                        bVar.f99936e = strTrim;
                        bVar.f99937f.f99942e.f99944b = strTrim;
                    } else if (str.contains("AudioProfile=")) {
                        bVar.f99937f.f99942e.f99945c = strTrim;
                    } else if (str.contains("AudioBitRate=")) {
                        bVar.f99937f.f99942e.f99946d = Integer.valueOf(strTrim).intValue();
                    } else if (str.contains("SampleRate=")) {
                        bVar.f99937f.f99942e.f99949g = Integer.valueOf(strTrim).intValue();
                    }
                }
            }
        }
        return bVar;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public long getPdtTimeMs(long j10) {
        return this.mTPPPlayer.getPdtTimeMs(j10);
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public long getPlayableDurationMs() {
        return this.mTPPPlayer.getPlayableDurationMs();
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public long getPositionMs(long j10) {
        return this.mTPPPlayer.getPositionMs(j10);
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public long getPropertyLong(int i10) throws IllegalStateException {
        if (i10 == 208) {
            i10 = 208;
        } else if (i10 != 209) {
            switch (i10) {
                case 100:
                    i10 = 100;
                    break;
                case 101:
                    i10 = 101;
                    break;
                case 102:
                    i10 = 102;
                    break;
                case 103:
                    i10 = 103;
                    break;
                default:
                    switch (i10) {
                        case 201:
                            i10 = 201;
                            break;
                        case 202:
                            i10 = 202;
                            break;
                        case 203:
                            i10 = 203;
                            break;
                        case 204:
                            i10 = 204;
                            break;
                        case 205:
                            i10 = 205;
                            break;
                        case 206:
                            i10 = 206;
                            break;
                        default:
                            switch (i10) {
                                case 301:
                                    return this.mBitrate;
                                case 302:
                                    long playableDurationMs = ((this.mBitrate * (this.mTPPPlayer.getPlayableDurationMs() - this.mTPPPlayer.getCurrentPositionMs())) / 1000) / 8;
                                    if (playableDurationMs < 0) {
                                        return 0L;
                                    }
                                    return playableDurationMs;
                                case 303:
                                    return this.mTcpSpeed;
                            }
                    }
                    break;
            }
        } else {
            i10 = 209;
        }
        return this.mTPPPlayer.getPropertyLong(i10);
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public float getRate() {
        return this.mRate;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public ArrayList<com.tencent.liteav.txcplayer.model.a> getSupportedBitrates() {
        ArrayList<com.tencent.liteav.txcplayer.model.a> arrayList;
        TPProgramInfo[] programInfo = this.mTPPPlayer.getProgramInfo();
        if (programInfo == null || programInfo.length <= 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<>(programInfo.length);
            for (TPProgramInfo tPProgramInfo : programInfo) {
                if (tPProgramInfo != null) {
                    com.tencent.liteav.txcplayer.model.a aVar = new com.tencent.liteav.txcplayer.model.a();
                    String[] strArrSplit = tPProgramInfo.resolution.split("x");
                    if (strArrSplit != null && strArrSplit.length == 2) {
                        aVar.f99929b = Integer.valueOf(strArrSplit[0]).intValue();
                        aVar.f99930c = Integer.valueOf(strArrSplit[1]).intValue();
                    }
                    int i10 = (int) tPProgramInfo.bandwidth;
                    aVar.f99931d = i10;
                    aVar.f99928a = tPProgramInfo.programId;
                    if (tPProgramInfo.actived) {
                        this.mBitrate = i10;
                    }
                    if ((aVar.f99929b != 0 && aVar.f99930c != 0) || i10 != 0) {
                        arrayList.add(aVar);
                        LiteavLog.i(this.TAG, "getSupportedBitrates item index：" + aVar.f99928a + ":width:" + aVar.f99929b + ":height:" + aVar.f99930c + ":bitrate:" + aVar.f99931d);
                    }
                }
            }
        }
        LiteavLog.i(this.TAG, "mBitrateIndex:" + this.mBitrateIndex + ":mBitrate:" + this.mBitrate);
        return arrayList;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public Surface getSurface() {
        LiteavLog.i(this.TAG, "getSurface ：" + this.mSurface);
        return this.mSurface;
    }

    @Override // com.tencent.liteav.txcplayer.b
    public SurfaceTexture getSurfaceTexture() {
        return this.mSurfaceTexture;
    }

    ITPPlayer getTPPPlayer() {
        return this.mTPPPlayer;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public TPTrackInfo[] getTrackInfo() {
        return this.mTPPPlayer.getTrackInfo();
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public int getVideoHeight() {
        try {
            return this.mTPPPlayer.getVideoHeight();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return 0;
        }
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public int getVideoSarDen() {
        return 0;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public int getVideoSarNum() {
        return 0;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public int getVideoWidth() {
        try {
            return this.mTPPPlayer.getVideoWidth();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return 0;
        }
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public boolean isLooping() {
        LiteavLog.i(this.TAG, "isLooping ：" + this.mIsLooping);
        return this.mIsLooping;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public boolean isPlayable() {
        return true;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public boolean isPlaying() {
        try {
            return this.mTPPPlayer.getCurrentState() == 5;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }

    public void onReceiveFirstPacketReadEvent() {
        notifyOnInfo(2017, 0, 0, null);
    }

    public void onReceiveFirstVideoRenderEvent() {
        if (getTXCVodVideoViewTargetState() == 4 || !(getConfig().f99916p || this.mTPPPlayer.getCurrentState() == 5)) {
            this.mHasReceiveFirstVideoRenderEvent = true;
            return;
        }
        notifyOnInfo(2026, 0, 0, null);
        notifyOnInfo(2003, 0, 0, null);
        this.mHasReceiveFirstVideoRenderEvent = false;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void pause() throws IllegalStateException {
        this.mTPPPlayer.pause();
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void prepareAsync() throws IllegalStateException {
        try {
            LiteavLog.i(this.TAG, "prepareAsync");
            this.mTPPPlayer.prepareAsync();
        } catch (Throwable th2) {
            th2.printStackTrace();
            throw new IllegalStateException(th2);
        }
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void publishAudioToNetwork() {
        LiteavLog.i(this.TAG, "publishAudioToNetwork");
        Object obj = this.mTrtcCloud;
        if (obj != null) {
            try {
                Class<?> cls = obj.getClass();
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("enableMixExternalAudioFrame", cls2, cls2);
                Object obj2 = this.mTrtcCloud;
                Boolean bool = Boolean.TRUE;
                declaredMethod.invoke(obj2, bool, bool);
            } catch (Exception e10) {
                LiteavLog.e(this.TAG, "publishAudioToNetwork exception : " + e10.toString());
            }
        }
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void release() {
        this.mIsPlayerReleased = true;
        releaseSurfaceTexture();
        this.mTPPPlayer.setSurface(null);
        detachTRTC();
        com.tencent.liteav.txcplayer.common.a.a().execute(new Runnable() { // from class: com.tencent.liteav.thumbplayer.ThumbMediaPlayer.2
            @Override // java.lang.Runnable
            public void run() {
                ThumbMediaPlayer.this.mTPPPlayer.release();
            }
        });
    }

    public void releaseSurfaceTexture() {
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture == null || this.mReuseSurfaceTexture) {
            return;
        }
        c cVar = this.mSurfaceTextureHost;
        if (cVar != null) {
            cVar.a(surfaceTexture);
        } else {
            surfaceTexture.release();
        }
        this.mSurfaceTexture = null;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void reset() {
        releaseSurfaceTexture();
        this.mTPPPlayer.updateTaskInfo(TPDownloadProxyEnum.TASKINFO_PLAYER_START, Boolean.FALSE);
        if (this.mTPPPlayer != null) {
            this.mTPPPlayer.reset();
        }
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void seekTo(long j10, boolean z10) throws IllegalStateException {
        LiteavLog.i(this.TAG, "seekTo msec: " + j10 + "：isAccurateSeek：" + z10);
        if (z10) {
            this.mTPPPlayer.seekTo((int) j10, 3);
        } else {
            this.mTPPPlayer.seekTo((int) j10, 1);
        }
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void selectTrack(int i10) {
        this.mTPPPlayer.selectTrack(i10, i10);
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setAudioNormalization(float f10) {
        if (f10 < -70.0f || f10 > 0.0f) {
            if (f10 == 1.0f) {
                this.mTPPPlayer.setAudioNormalizeVolumeParams("disable");
            }
        } else {
            this.mTPPPlayer.setAudioNormalizeVolumeParams("enable,loudnorm=I=" + f10 + ":TP=-1.5:LRA=5.4:linear=1");
        }
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setAudioStreamType(int i10) {
        LiteavLog.i(this.TAG, "setAudioStreamType：".concat(String.valueOf(i10)));
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setAudioVolume(int i10) {
        LiteavLog.i(this.TAG, "setAudioVolume： ".concat(String.valueOf(i10)));
        if (i10 == 0) {
            this.mTPPPlayer.setOutputMute(true);
        } else {
            this.mTPPPlayer.setOutputMute(false);
            this.mTPPPlayer.setAudioGainRatio(i10 / 100.0f);
        }
        Object obj = this.mTrtcCloud;
        if (obj != null) {
            try {
                Class<?> cls = obj.getClass();
                Class<?> cls2 = Integer.TYPE;
                cls.getDeclaredMethod("setMixExternalAudioVolume", cls2, cls2).invoke(this.mTrtcCloud, Integer.valueOf(i10), Integer.valueOf(i10));
            } catch (Exception e10) {
                LiteavLog.e(this.TAG, "setAudioVolume exception : " + e10.toString());
            }
        }
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setAutoMaxBitrate(int i10) {
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(503, 0L, i10, 0L));
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setBitrateIndex(int i10) {
        TPProgramInfo[] programInfo;
        LiteavLog.i(this.TAG, "setBitrateIndex ：".concat(String.valueOf(i10)));
        if (this.mBitrateIndex == -1) {
            this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(504, 0L));
        }
        if (i10 != -1 && (programInfo = this.mTPPPlayer.getProgramInfo()) != null && i10 >= 0 && i10 < programInfo.length) {
            this.mTPPPlayer.selectProgram(i10, 0L);
        }
        this.mBitrateIndex = i10;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setConfig(e eVar) {
        if (eVar == null) {
            return;
        }
        this.mConfig = eVar;
        String strA = com.tencent.liteav.txcplayer.common.b.a();
        TPPlayerConfig.setProxyDataDir(strA);
        int iB = com.tencent.liteav.txcplayer.common.b.b() >= 0 ? com.tencent.liteav.txcplayer.common.b.b() : this.mConfig.f99906f * 100;
        if (iB > 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("VodCacheReserveSizeMB", iB);
                TPPlayerConfig.parseHostConfig(new JSONObject().put(TPPlayerMgr.PROXY_HOST_KEY, jSONObject).toString());
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        setEnableAccurateSeek(eVar.f99909i);
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(100, eVar.f99915o));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildBoolean(101, eVar.f99909i));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(102, 1000L));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(117, 80000L));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(103, 200L));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(105, 1000L));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(106, 8000L));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(107, 10000L));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(108, (long) (eVar.f99903c * 1000.0f)));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(109, eVar.f99901a));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(504, eVar.f99926z ? 1L : 0L));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildString(180, eVar.f99924x));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildString(181, eVar.f99925y));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(200, 80L));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildBoolean(201, true));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildBoolean(401, true));
        if (this.mConfig.f99907g == 0) {
            this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(202, 4L));
        } else {
            this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(202, 2L));
        }
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(203, eVar.f99904d ? 2L : 4L));
        int i10 = this.mConfig.f99919s;
        if (i10 == -1000 && (i10 = this.mBitrateIndex) == -1000) {
            i10 = -1000;
        }
        if (i10 != -1000) {
            this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(132, i10));
        }
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(133, resolveAdaptivePreferredResolution(eVar.f99922v)));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(450, 1L));
        if (com.tencent.liteav.txcplayer.common.c.a(LicenseChecker.a.PLAYER_PREMIUM)) {
            this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildBoolean(182, true));
        } else {
            this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildBoolean(182, false));
        }
        TPPlayerConfig.setP2PEnable(true);
        ITPDownloadProxy tPDownloadProxy = TPDownloadProxyFactory.getTPDownloadProxy(THUMB_PLAYER_PLATFORM_ID);
        if (tPDownloadProxy != null) {
            tPDownloadProxy.updateStoragePath(strA);
            tPDownloadProxy.setMaxStorageSizeMB(iB);
        }
        Map<String, Object> map = this.mConfig.A;
        if (map != null) {
            parseExtraConfig(map);
        }
        setVideoInfo(eVar.f99917q);
        setMp4EncryptionInfo(eVar.f99917q, !TextUtils.isEmpty(strA));
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setDataSource(Context context, Uri uri) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        if (isContentUri(uri.toString())) {
            this.mTPPPlayer.setDataSource(this.mContext.getContentResolver().openAssetFileDescriptor(uri, "r"));
        } else if (!isAssetFile(uri.toString())) {
            setDataSource(context, uri, null);
        } else {
            this.mTPPPlayer.setDataSource(this.mContext.getAssets().openFd(uri.toString().substring(uri.toString().indexOf(HttpConstant.SCHEME_SPLIT) + 3)));
        }
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setDataSource(Context context, Uri uri, Map<String, String> map) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        String string = uri.toString();
        this.mDataSource = string;
        if (isOfflinePlay(string)) {
            string = string.substring(string.indexOf("?") + 1);
        }
        ITPMediaAsset iTPMediaAssetHandleDRMAsset = handleDRMAsset(string);
        if (iTPMediaAssetHandleDRMAsset != null) {
            ITPMediaUrlAsset iTPMediaUrlAssetHandleUrlAsset = handleUrlAsset(string);
            if (iTPMediaUrlAssetHandleUrlAsset != null) {
                iTPMediaAssetHandleDRMAsset.setExtraParam(iTPMediaUrlAssetHandleUrlAsset.getExtraParam());
            }
            if (map != null && map.size() > 0) {
                iTPMediaAssetHandleDRMAsset.setHttpHeader(map);
            }
            this.mTPPPlayer.setDataSource(iTPMediaAssetHandleDRMAsset);
            return;
        }
        ITPMediaUrlAsset iTPMediaUrlAssetHandleUrlAsset2 = handleUrlAsset(string);
        if (iTPMediaUrlAssetHandleUrlAsset2 == null) {
            this.mTPPPlayer.setDataSource(string, map);
            return;
        }
        if (map != null && map.size() > 0) {
            iTPMediaUrlAssetHandleUrlAsset2.setHttpHeader(map);
        }
        this.mTPPPlayer.setDataSource(iTPMediaUrlAssetHandleUrlAsset2);
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setDataSource(FileDescriptor fileDescriptor) throws IllegalStateException, IOException, IllegalArgumentException {
        this.mTPPPlayer.setDataSource(ParcelFileDescriptor.dup(fileDescriptor));
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setDataSource(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        setDataSource(null, Uri.parse(str));
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
        if (this.mSurfaceTexture != null) {
            return;
        }
        if (surfaceHolder != null) {
            this.mSurface = surfaceHolder.getSurface();
        }
        this.mSurfaceHolder = surfaceHolder;
        this.mTPPPlayer.setSurfaceHolder(surfaceHolder);
    }

    void setEnableAccurateSeek(boolean z10) {
        this.mEnableAccurateSeek = z10;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setKeepInBackground(boolean z10) {
        LiteavLog.i(this.TAG, "setKeepInBackground none：".concat(String.valueOf(z10)));
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setLogEnabled(boolean z10) {
        TPLogUtil.setDebugEnable(z10);
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setLooping(boolean z10) {
        LiteavLog.i(this.TAG, "setLooping ：".concat(String.valueOf(z10)));
        this.mIsLooping = z10;
        this.mTPPPlayer.setLoopback(z10);
    }

    public void setMaxCacheSize(int i10) {
        TPPlayerMgr.setProxyMaxStorageSizeMB(i10);
    }

    @Override // com.tencent.liteav.txcplayer.a, com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setPrivateConfig(Map<String, Object> map) {
        this.mPrivateConfig = map;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setRate(float f10) {
        LiteavLog.i(this.TAG, "setRate " + this.mRate);
        this.mRate = f10;
        this.mTPPPlayer.setPlaySpeedRatio(f10);
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setScreenOnWhilePlaying(boolean z10) {
        LiteavLog.i(this.TAG, "setScreenOnWhilePlaying(true) screenOn:".concat(String.valueOf(z10)));
        if (this.mScreenOnWhilePlaying != z10) {
            if (z10 && this.mSurfaceHolder == null) {
                LiteavLog.w(this.TAG, "setScreenOnWhilePlaying(true) is ineffective without a SurfaceHolder");
            }
            this.mScreenOnWhilePlaying = z10;
            SurfaceHolder surfaceHolder = this.mSurfaceHolder;
            if (surfaceHolder != null) {
                surfaceHolder.setKeepScreenOn(z10);
            }
        }
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setSubtitleStyle(TXSubtitleRenderModel tXSubtitleRenderModel) {
        if (this.mTPPPlayer != null) {
            this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildObject(507, convertToTPSubtitleRenderModel(tXSubtitleRenderModel)));
        }
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setSurface(Surface surface) {
        if (this.mSurfaceTexture == null) {
            setSurfaceToPlayer(surface);
        }
        LiteavLog.i(this.TAG, "setSurface mSurface:" + this.mSurface);
    }

    @Override // com.tencent.liteav.txcplayer.b
    public void setSurfaceTexture(SurfaceTexture surfaceTexture) {
        if (this.mSurfaceTexture == surfaceTexture) {
            return;
        }
        releaseSurfaceTexture();
        this.mSurfaceTexture = surfaceTexture;
        if (surfaceTexture == null) {
            this.mSurface = null;
            setSurfaceToPlayer(null);
        } else {
            if (this.mSurface == null) {
                this.mSurface = new Surface(surfaceTexture);
            }
            setSurfaceToPlayer(this.mSurface);
        }
    }

    @Override // com.tencent.liteav.txcplayer.b
    public void setSurfaceTextureHost(c cVar) {
        this.mSurfaceTextureHost = cVar;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setWakeMode(Context context, int i10) {
        boolean z10;
        LiteavLog.i(this.TAG, "setWakeMode ：".concat(String.valueOf(i10)));
        PowerManager.WakeLock wakeLock = this.mWakeLock;
        if (wakeLock != null) {
            if (wakeLock.isHeld()) {
                z10 = true;
                this.mWakeLock.release();
            } else {
                z10 = false;
            }
            this.mWakeLock = null;
        } else {
            z10 = false;
        }
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(i10 | 536870912, ThumbMediaPlayer.class.getName());
        this.mWakeLock = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
        if (z10) {
            this.mWakeLock.acquire();
        }
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void start() throws IllegalStateException {
        LiteavLog.i(this.TAG, "TPPlayer start");
        if (this.mHasReceiveFirstVideoRenderEvent) {
            notifyOnInfo(2026, 0, 0, null);
            notifyOnInfo(2003, 0, 0, null);
            this.mHasReceiveFirstVideoRenderEvent = false;
        }
        if (this.mConfig.f99913m >= 0.0f) {
            this.mTPPPlayer.updateTaskInfo(TPDownloadProxyEnum.TASKINFO_BUFFER_SIZE_BYTE, Long.valueOf((long) (this.mConfig.f99913m * 1024.0f * 1024.0f)));
        } else if (this.mIsSetDefaultBufferSize) {
            this.mTPPPlayer.updateTaskInfo(TPDownloadProxyEnum.TASKINFO_BUFFER_SIZE_BYTE, 0);
            this.mIsSetDefaultBufferSize = false;
        }
        this.mTPPPlayer.updateTaskInfo(TPDownloadProxyEnum.TASKINFO_PLAYER_START, Boolean.TRUE);
        this.mTPPPlayer.start();
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void stop() throws IllegalStateException {
        try {
            this.mTPPPlayer.stopAsync();
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void unpublishAudioToNetwork() {
        LiteavLog.i(this.TAG, "unpublishAudioToNetwork ：none");
        Object obj = this.mTrtcCloud;
        if (obj != null) {
            try {
                Class<?> cls = obj.getClass();
                Class<?> cls2 = Boolean.TYPE;
                cls.getDeclaredMethod("enableMixExternalAudioFrame", cls2, cls2).invoke(this.mTrtcCloud, Boolean.FALSE, Boolean.TRUE);
            } catch (Exception e10) {
                LiteavLog.e(this.TAG, "unpublishAudioToNetwork exception : " + e10.toString());
            }
        }
    }

    void updateBitrate(long j10) {
        if (j10 > 0) {
            if (this.mTotalFileSize != j10 || this.mBitrate == 0) {
                this.mTotalFileSize = j10;
                long duration = getDuration();
                if (duration <= 0 || j10 <= 0) {
                    return;
                }
                this.mBitrate = ((j10 * 1000) * 8) / duration;
            }
        }
    }

    void updateTcpSpeed(long j10) {
        this.mTcpSpeed = j10;
    }
}
