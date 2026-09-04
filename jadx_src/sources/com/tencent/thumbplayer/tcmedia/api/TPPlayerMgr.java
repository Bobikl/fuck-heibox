package com.tencent.thumbplayer.tcmedia.api;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.thumbplayer.tcmedia.adapter.a.b.a;
import com.tencent.thumbplayer.tcmedia.adapter.strategy.utils.TPNativeKeyMapUtil;
import com.tencent.thumbplayer.tcmedia.c.b;
import com.tencent.thumbplayer.tcmedia.c.i;
import com.tencent.thumbplayer.tcmedia.common.a.c;
import com.tencent.thumbplayer.tcmedia.config.TPPlayerConfig;
import com.tencent.thumbplayer.tcmedia.core.common.ITPNativeLibraryExternalLoader;
import com.tencent.thumbplayer.tcmedia.core.common.ITPNativeLogCallback;
import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLibraryLoader;
import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLog;
import com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo;
import com.tencent.thumbplayer.tcmedia.core.common.TPThumbplayerCapabilityHelper;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyNativeLibLoader;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPProxyAdapter;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyHelper;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import com.tencent.thumbplayer.tcmedia.utils.d;
import com.tencent.thumbplayer.tcmedia.utils.f;
import com.tencent.thumbplayer.tcmedia.utils.o;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
public class TPPlayerMgr {
    public static final String BEACON_LOG_HOST_KEY = "beacon_log_host";
    public static final String BEACON_POLICY_HOST_KEY = "beacon_policy_host";
    public static final int EVENT_ID_APP_ENTER_BACKGROUND = 100001;
    public static final int EVENT_ID_APP_ENTER_FOREGROUND = 100002;
    public static final int INVALID_CELLULAR_FLOW = -1;
    public static final int INVALID_SUGGEST_BITRATE = -1;
    public static final String PLYAER_HOST_KEY = "player_host_config";
    public static final String PROPERTY_AB_USER_ID = "PROPERTY_AbUserId";
    public static final String PROPERTY_ENABLE_DATA_REPORT = "PROPERTY_EnableDataReport";
    public static final String PROPERTY_ENABLE_NEW_REPORT = "PROPERTY_EnableNewReport";
    public static final String PROPERTY_ENABLE_PLAYER_REPORT = "PROPERTY_EnablePlayerReport";
    public static final String PROPERTY_MEDIA_DRM_REUSE = "PROPERTY_MediaDrmReuse";
    public static final String PROPERTY_PROXY_MAX_USE_MEMORY_MB = "PROPERTY_ProxyMaxUseMemoryMB";
    public static final String PROPERTY_VIDEO_MEDIACODEC_CO_EXIST_MAX_CNT = "PROPERTY_VideoMediaCodecCoexistMaxCnt";
    public static final String PROPERTY_WIDEVINE_PROVISIONING_SERVER_URL = "PROPERTY_WidevineProvisioningServerUrl";
    public static final String PROXY_HOST_KEY = "httpproxy_config";
    private static final String TAG = "TPThumbPlayer[TPPlayerMgr.java]";
    public static final String TP_DOWNLOAD_PROXY_MODULE_NAME = "DownloadProxy";
    public static final String TP_PLAYERCORE_MODULE_NAME = "TPCore";
    private static Context mAppContext;
    private static final HashMap<String, ITPPropertyHandler<Boolean>> mBooleanPropertyNameToPropertyHandlerTables;
    private static final HashMap<String, ITPPropertyHandler<Integer>> mIntegerPropertyNameToPropertyHandlerTables;
    private static boolean mIsInit;
    private static final HashMap<String, ITPPropertyHandler<Long>> mLongPropertyNameToPropertyHandlerTables;
    private static final HashMap<String, ITPPropertyHandler<String>> mStringPropertyNameToPropertyHandlerTables;
    private static final HashMap<String, Boolean> mBoolPropertyNameToValueCache = new HashMap<>();
    private static final HashMap<String, Integer> mIntegerPropertyNameToValueCache = new HashMap<>();
    private static final HashMap<String, String> mStringPropertyNameToValueCache = new HashMap<>();
    private static final HashMap<String, Long> mLongPropertyNameToValueCache = new HashMap<>();

    @Retention(RetentionPolicy.SOURCE)
    public @interface BooleanProperty {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface EventId {
    }

    public interface ITPPropertyHandler<T> {
        T getPropertyValue();

        void setPropertyValue(T t10);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface IntegerProperty {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LongProperty {
    }

    public interface OnLogListener {
        int d(String str, String str2);

        int e(String str, String str2);

        int i(String str, String str2);

        int v(String str, String str2);

        int w(String str, String str2);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface StringProperty {
    }

    static {
        HashMap<String, ITPPropertyHandler<Boolean>> map = new HashMap<>();
        mBooleanPropertyNameToPropertyHandlerTables = map;
        map.put(PROPERTY_MEDIA_DRM_REUSE, new ITPPropertyHandler<Boolean>() { // from class: com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.ITPPropertyHandler
            public final Boolean getPropertyValue() {
                return Boolean.valueOf(TPPlayerConfig.getMediaDrmReuseEnable());
            }

            @Override // com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.ITPPropertyHandler
            public final void setPropertyValue(Boolean bool) {
                TPPlayerConfig.setMediaDrmReuseEnable(bool.booleanValue());
            }
        });
        map.put(PROPERTY_ENABLE_DATA_REPORT, new ITPPropertyHandler<Boolean>() { // from class: com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.ITPPropertyHandler
            public final Boolean getPropertyValue() {
                return Boolean.valueOf(TPPlayerConfig.isDataReportEnable());
            }

            @Override // com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.ITPPropertyHandler
            public final void setPropertyValue(Boolean bool) {
                TPLogUtil.e(TPPlayerMgr.TAG, "set data report enable : ".concat(String.valueOf(bool)));
                TPPlayerConfig.setDataReportEnable(bool.booleanValue());
                i.a().a(bool.booleanValue());
            }
        });
        map.put(PROPERTY_ENABLE_PLAYER_REPORT, new ITPPropertyHandler<Boolean>() { // from class: com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.ITPPropertyHandler
            public final Boolean getPropertyValue() {
                return Boolean.valueOf(TPPlayerConfig.isPlayerReportEnable());
            }

            @Override // com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.ITPPropertyHandler
            public final void setPropertyValue(Boolean bool) {
                TPLogUtil.e(TPPlayerMgr.TAG, "set player report enable : ".concat(String.valueOf(bool)));
                TPPlayerConfig.setPlayerReportEnable(bool.booleanValue());
            }
        });
        map.put(PROPERTY_ENABLE_NEW_REPORT, new ITPPropertyHandler<Boolean>() { // from class: com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.ITPPropertyHandler
            public final Boolean getPropertyValue() {
                return Boolean.valueOf(TPPlayerConfig.getNewReportEnable());
            }

            @Override // com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.ITPPropertyHandler
            public final void setPropertyValue(Boolean bool) {
                TPLogUtil.e(TPPlayerMgr.TAG, "set new report enable : ".concat(String.valueOf(bool)));
                TPPlayerConfig.setNewReportEnable(bool.booleanValue());
            }
        });
        HashMap<String, ITPPropertyHandler<String>> map2 = new HashMap<>();
        mStringPropertyNameToPropertyHandlerTables = map2;
        map2.put(PROPERTY_AB_USER_ID, new ITPPropertyHandler<String>() { // from class: com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.10
            @Override // com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.ITPPropertyHandler
            public final String getPropertyValue() {
                return TPPlayerConfig.getAbUserId();
            }

            @Override // com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.ITPPropertyHandler
            public final void setPropertyValue(String str) {
                TPPlayerConfig.setAbUserId(str);
            }
        });
        map2.put(PROPERTY_WIDEVINE_PROVISIONING_SERVER_URL, new ITPPropertyHandler<String>() { // from class: com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.11
            @Override // com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.ITPPropertyHandler
            public final String getPropertyValue() {
                return TPPlayerConfig.getWidevineProvisioningServerUrl();
            }

            @Override // com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.ITPPropertyHandler
            public final void setPropertyValue(String str) {
                TPPlayerConfig.setWidevineProvisioningServerUrl(str);
            }
        });
        HashMap<String, ITPPropertyHandler<Integer>> map3 = new HashMap<>();
        mIntegerPropertyNameToPropertyHandlerTables = map3;
        map3.put(PROPERTY_VIDEO_MEDIACODEC_CO_EXIST_MAX_CNT, new ITPPropertyHandler<Integer>() { // from class: com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.ITPPropertyHandler
            public final Integer getPropertyValue() {
                return Integer.valueOf(TPPlayerConfig.getVideoMediaCodecCoexistMaxCnt());
            }

            @Override // com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.ITPPropertyHandler
            public final void setPropertyValue(Integer num) {
                TPPlayerConfig.setVideoMediaCodecCoexistMaxCnt(num.intValue());
            }
        });
        HashMap<String, ITPPropertyHandler<Long>> map4 = new HashMap<>();
        mLongPropertyNameToPropertyHandlerTables = map4;
        map4.put(PROPERTY_PROXY_MAX_USE_MEMORY_MB, new ITPPropertyHandler<Long>() { // from class: com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.ITPPropertyHandler
            public final Long getPropertyValue() {
                return Long.valueOf(TPPlayerConfig.getProxyMaxUseMemoryMB());
            }

            @Override // com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.ITPPropertyHandler
            public final void setPropertyValue(Long l10) {
                TPPlayerConfig.setProxyMaxUseMemoryMB(l10.longValue());
                i.a().b(l10.longValue());
            }
        });
    }

    private static void dumpStackTrace() {
        TPLogUtil.i(TAG, "Current stack trace: ");
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            TPLogUtil.i(TAG, stackTraceElement.toString());
        }
    }

    public static Context getAppContext() {
        return mAppContext;
    }

    public static int getCellularDataCost() {
        ITPDownloadProxy iTPDownloadProxyA;
        b bVarA = i.a().a(TPPlayerConfig.getProxyServiceType());
        if (bVarA == null || (iTPDownloadProxyA = bVarA.a()) == null) {
            return -1;
        }
        return com.tencent.thumbplayer.tcmedia.utils.b.a(iTPDownloadProxyA.getNativeInfo(2), -1);
    }

    public static String getLibVersion(String str) {
        if (!mIsInit) {
            throw new IllegalStateException("player not initialized");
        }
        if (!TextUtils.isEmpty(str)) {
            if (str.equals(TP_DOWNLOAD_PROXY_MODULE_NAME)) {
                return TPDownloadProxyHelper.getNativeLibVersion();
            }
            if (str.equals(TP_PLAYERCORE_MODULE_NAME)) {
                return TPNativeLibraryLoader.getLibVersion();
            }
        }
        throw new IllegalArgumentException("libName:".concat(String.valueOf(str)));
    }

    public static int getOfflineRecordDurationMs(String str, String str2) {
        return TPDownloadProxyHelper.getRecordDuration(str, str2);
    }

    public static String getOfflineRecordVinfo(String str, String str2) {
        return TPDownloadProxyHelper.checkVideoStatus(str, str2);
    }

    @Deprecated
    public static synchronized boolean getPropertyBoolean(String str) {
        return getPropertyBoolean(str, false);
    }

    public static synchronized boolean getPropertyBoolean(String str, boolean z10) {
        Boolean bool = mBoolPropertyNameToValueCache.get(str);
        if (bool == null) {
            return z10;
        }
        return bool.booleanValue();
    }

    @Deprecated
    public static synchronized int getPropertyInteger(String str) {
        return getPropertyInteger(str, 0);
    }

    public static synchronized int getPropertyInteger(String str, int i10) {
        Integer num = mIntegerPropertyNameToValueCache.get(str);
        if (num == null) {
            return i10;
        }
        return num.intValue();
    }

    @Deprecated
    public static long getPropertyLong(String str) {
        return getPropertyLong(str, 0L);
    }

    public static synchronized long getPropertyLong(String str, long j10) {
        Long l10 = mLongPropertyNameToValueCache.get(str);
        if (l10 == null) {
            return j10;
        }
        return l10.longValue();
    }

    @Deprecated
    public static String getPropertyString(String str) {
        return getPropertyString(str, "");
    }

    public static synchronized String getPropertyString(String str, String str2) {
        String str3;
        str3 = mStringPropertyNameToValueCache.get(str);
        return str3 == null ? str2 : str3;
    }

    public static int getSuggestedBitrate() {
        ITPDownloadProxy iTPDownloadProxyA;
        b bVarA = i.a().a(TPPlayerConfig.getProxyServiceType());
        if (bVarA == null || (iTPDownloadProxyA = bVarA.a()) == null) {
            return -1;
        }
        return com.tencent.thumbplayer.tcmedia.utils.b.a(iTPDownloadProxyA.getNativeInfo(0), -1);
    }

    public static String getThumbPlayerVersion() {
        return TPPlayerConfig.VERSION;
    }

    private static Future<Boolean> initAsyncWithWait() {
        return o.a().c().submit(new Callable<Boolean>() { // from class: com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public final Boolean call() {
                TPPlayerMgr.initInAsyncThread();
                return Boolean.TRUE;
            }
        });
    }

    private static void initAsyncWithoutWait() {
        o.a().d().execute(new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.3
            @Override // java.lang.Runnable
            public final void run() {
                d dVar = new d();
                dVar.a();
                TPNativeKeyMapUtil.init();
                TPLogUtil.i(TPPlayerMgr.TAG, "Init SDK, initAsyncWithoutWait  nativeKeyMap init, times: " + dVar.c());
                com.tencent.thumbplayer.tcmedia.utils.i.a().a(TPPlayerMgr.mAppContext);
                new c().a();
                TPPlayerMgr.setExternalProperties();
                TPLogUtil.i(TPPlayerMgr.TAG, "Init SDK, initAsyncWithoutWait all times: " + dVar.d());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void initInAsyncThread() {
        d dVar = new d();
        dVar.a();
        com.tencent.thumbplayer.tcmedia.common.a.b.a(mAppContext.getApplicationContext());
        TPLogUtil.i(TAG, "Init SDK, initAsyncWithWait  TPBeaconReportWrapper init, times: " + dVar.e());
        a.a(mAppContext);
        TPLogUtil.i(TAG, "Init SDK, initAsyncWithWait  TPDrmCapability init, times: " + dVar.e());
        TPThumbplayerCapabilityHelper.init(mAppContext, true);
        TPLogUtil.i(TAG, "Init SDK, initAsyncWithWait all times: " + dVar.d());
    }

    public static void initSdk(Context context, TPInitParams tPInitParams) {
        TPSystemInfo.setDeviceName(tPInitParams.getDeviceName());
        initSdk(context, tPInitParams.getGuid(), tPInitParams.getPlatform());
    }

    public static synchronized void initSdk(Context context, String str, int i10) {
        String str2;
        String str3;
        dumpStackTrace();
        if (mIsInit) {
            TPLogUtil.i(TAG, "Init SDK, has init sdk");
            return;
        }
        mIsInit = true;
        d dVar = new d();
        dVar.a();
        preInitSync(context, str, i10);
        Future<Boolean> futureInitAsyncWithWait = initAsyncWithWait();
        initSync();
        initAsyncWithoutWait();
        dVar.b();
        try {
            if (futureInitAsyncWithWait.get().booleanValue()) {
                TPLogUtil.i(TAG, "Init SDK, TPPlayer  wait initSync finish, times: " + dVar.c());
            }
        } catch (InterruptedException unused) {
            str2 = TAG;
            str3 = "Init SDK, TPPlayer wait initSync InterruptedException, times: " + dVar.c();
            TPLogUtil.e(str2, str3);
        } catch (ExecutionException unused2) {
            str2 = TAG;
            str3 = "Init SDK, TPPlayer wait initSync ExecutionException, times: " + dVar.c();
            TPLogUtil.e(str2, str3);
        }
        TPLogUtil.i(TAG, "Init SDK, TPPlayer all times: " + dVar.d());
    }

    private static void initSync() {
        d dVar = new d();
        dVar.a();
        try {
            TPNativeLibraryLoader.loadLibIfNeeded(mAppContext);
        } catch (UnsupportedOperationException e10) {
            TPLogUtil.e(TAG, e10);
        }
        TPLogUtil.i(TAG, "Init SDK, initSync so load times: " + dVar.d());
    }

    public static boolean isProxyEnable() {
        return TPPlayerConfig.isUseP2P() && TPDownloadProxyHelper.isReadyForPlay();
    }

    public static boolean isThumbPlayerEnable() {
        return TPNativeLibraryLoader.isLibLoadedAndTryToLoad();
    }

    public static void postEvent(int i10, int i11, int i12, Object obj) {
        f.a(i10, i11, i12, obj);
    }

    private static void preInitSync(Context context, String str, int i10) {
        d dVar = new d();
        dVar.a();
        mAppContext = context.getApplicationContext();
        TPPlayerConfig.setGuid(str);
        TPPlayerConfig.setPlatform(i10);
        TPNativeLog.setLogCallback(new ITPNativeLogCallback() { // from class: com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.1
            @Override // com.tencent.thumbplayer.tcmedia.core.common.ITPNativeLogCallback
            public final void onPrintLog(int i11, String str2, String str3) {
                if (i11 == 0) {
                    TPLogUtil.v(str2, str3);
                    return;
                }
                if (i11 == 1) {
                    TPLogUtil.d(str2, str3);
                    return;
                }
                if (i11 == 2) {
                    TPLogUtil.i(str2, str3);
                } else if (i11 == 3) {
                    TPLogUtil.w(str2, str3);
                } else {
                    if (i11 != 4) {
                        return;
                    }
                    TPLogUtil.e(str2, str3);
                }
            }
        });
        TPLogUtil.i(TAG, "Init SDK, preInitSync all times: " + dVar.d());
    }

    public static void setDebugEnable(boolean z10) {
        TPPlayerConfig.setDebugEnable(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void setExternalProperties() {
        for (Map.Entry<String, Boolean> entry : mBoolPropertyNameToValueCache.entrySet()) {
            ITPPropertyHandler<Boolean> iTPPropertyHandler = mBooleanPropertyNameToPropertyHandlerTables.get(entry.getKey());
            if (iTPPropertyHandler != null) {
                iTPPropertyHandler.setPropertyValue(entry.getValue());
            }
        }
        for (Map.Entry<String, Integer> entry2 : mIntegerPropertyNameToValueCache.entrySet()) {
            ITPPropertyHandler<Integer> iTPPropertyHandler2 = mIntegerPropertyNameToPropertyHandlerTables.get(entry2.getKey());
            if (iTPPropertyHandler2 != null) {
                iTPPropertyHandler2.setPropertyValue(entry2.getValue());
            }
        }
        for (Map.Entry<String, String> entry3 : mStringPropertyNameToValueCache.entrySet()) {
            ITPPropertyHandler<String> iTPPropertyHandler3 = mStringPropertyNameToPropertyHandlerTables.get(entry3.getKey());
            if (iTPPropertyHandler3 != null) {
                iTPPropertyHandler3.setPropertyValue(entry3.getValue());
            }
        }
        for (Map.Entry<String, Long> entry4 : mLongPropertyNameToValueCache.entrySet()) {
            ITPPropertyHandler<Long> iTPPropertyHandler4 = mLongPropertyNameToPropertyHandlerTables.get(entry4.getKey());
            if (iTPPropertyHandler4 != null) {
                iTPPropertyHandler4.setPropertyValue(entry4.getValue());
            }
        }
    }

    public static void setHost(String str) {
        TPPlayerConfig.parseHostConfig(str);
    }

    public static void setLibLoader(final ITPModuleLoader iTPModuleLoader) {
        if (mIsInit) {
            throw new IllegalStateException("player has init");
        }
        TPNativeLibraryLoader.setLibLoader(new ITPNativeLibraryExternalLoader() { // from class: com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.4
            @Override // com.tencent.thumbplayer.tcmedia.core.common.ITPNativeLibraryExternalLoader
            public final boolean loadLib(String str, String str2) {
                ITPModuleLoader iTPModuleLoader2 = iTPModuleLoader;
                if (iTPModuleLoader2 == null) {
                    return false;
                }
                try {
                    iTPModuleLoader2.loadLibrary(str, str2);
                    return true;
                } catch (Throwable th2) {
                    TPLogUtil.e(TPPlayerMgr.TAG, th2);
                    return false;
                }
            }
        });
        TPDownloadProxyHelper.setNativeLibLoader(new ITPDLProxyNativeLibLoader() { // from class: com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr.5
            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyNativeLibLoader
            public final boolean loadLib(String str, String str2) {
                ITPModuleLoader iTPModuleLoader2 = iTPModuleLoader;
                if (iTPModuleLoader2 == null) {
                    return false;
                }
                try {
                    iTPModuleLoader2.loadLibrary(str, str2);
                    return true;
                } catch (Throwable th2) {
                    TPLogUtil.e(TPPlayerMgr.TAG, th2);
                    return false;
                }
            }
        });
    }

    public static void setOnLogListener(OnLogListener onLogListener) {
        TPLogUtil.setOnLogListener(onLogListener);
    }

    public static void setOutNetIP(String str) {
        TPPlayerConfig.setOutNetIp(str);
    }

    public static synchronized void setPropertyBool(String str, boolean z10) {
        if (!mIsInit) {
            mBoolPropertyNameToValueCache.put(str, Boolean.valueOf(z10));
            return;
        }
        ITPPropertyHandler<Boolean> iTPPropertyHandler = mBooleanPropertyNameToPropertyHandlerTables.get(str);
        if (iTPPropertyHandler == null) {
            TPLogUtil.w(TAG, "not found handler of property, propertyName:".concat(String.valueOf(str)));
        } else {
            iTPPropertyHandler.setPropertyValue(Boolean.valueOf(z10));
            mBoolPropertyNameToValueCache.put(str, Boolean.valueOf(z10));
        }
    }

    public static synchronized void setPropertyInteger(String str, int i10) {
        if (!mIsInit) {
            mIntegerPropertyNameToValueCache.put(str, Integer.valueOf(i10));
            return;
        }
        ITPPropertyHandler<Integer> iTPPropertyHandler = mIntegerPropertyNameToPropertyHandlerTables.get(str);
        if (iTPPropertyHandler == null) {
            TPLogUtil.w(TAG, "not found handler of property, propertyName:".concat(String.valueOf(str)));
        } else {
            iTPPropertyHandler.setPropertyValue(Integer.valueOf(i10));
            mIntegerPropertyNameToValueCache.put(str, Integer.valueOf(i10));
        }
    }

    public static synchronized void setPropertyLong(String str, long j10) {
        if (!mIsInit) {
            mLongPropertyNameToValueCache.put(str, Long.valueOf(j10));
            return;
        }
        ITPPropertyHandler<Long> iTPPropertyHandler = mLongPropertyNameToPropertyHandlerTables.get(str);
        if (iTPPropertyHandler == null) {
            TPLogUtil.w(TAG, "not found handler of property, propertyName:".concat(String.valueOf(str)));
        } else {
            iTPPropertyHandler.setPropertyValue(Long.valueOf(j10));
            mLongPropertyNameToValueCache.put(str, Long.valueOf(j10));
        }
    }

    public static synchronized void setPropertyString(String str, String str2) {
        if (!mIsInit) {
            mStringPropertyNameToValueCache.put(str, str2);
            return;
        }
        ITPPropertyHandler<String> iTPPropertyHandler = mStringPropertyNameToPropertyHandlerTables.get(str);
        if (iTPPropertyHandler == null) {
            TPLogUtil.w(TAG, "not found handler of property, propertyName:".concat(String.valueOf(str)));
        } else {
            iTPPropertyHandler.setPropertyValue(str2);
            mStringPropertyNameToValueCache.put(str, str2);
        }
    }

    public static void setProxyEnable(boolean z10) {
        TPPlayerConfig.setP2PEnable(z10);
    }

    public static void setProxyMaxStorageSizeMB(long j10) {
        TPLogUtil.i(TAG, "setProxyMaxStorageSize: " + j10 + " MB.");
        TPPlayerConfig.setProxyMaxStorageSizeMB(j10);
        i.a().a(j10);
    }

    public static void setProxyServiceType(int i10) {
        TPPlayerConfig.setProxyServiceType(i10);
    }

    public static void setTPProxyAdapter(ITPProxyAdapter iTPProxyAdapter) {
        TPDownloadProxyHelper.setTPProxyAdapter(iTPProxyAdapter);
    }

    public static void setUpcInfo(String str, int i10) {
        TPPlayerConfig.setUserUpc(str);
        TPPlayerConfig.setUserUpcState(i10);
        f.a(100003, i10, 0, str);
    }

    public static void setUserInfo(String str, boolean z10) {
        TPPlayerConfig.setUserUin(str);
        TPPlayerConfig.setUserIsVip(z10);
    }
}
