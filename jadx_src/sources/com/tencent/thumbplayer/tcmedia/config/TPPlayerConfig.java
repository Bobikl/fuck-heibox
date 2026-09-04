package com.tencent.thumbplayer.tcmedia.config;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr;
import com.tencent.thumbplayer.tcmedia.core.config.TPPlayerCoreConfig;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class TPPlayerConfig {
    private static String DOT = "\\.";
    public static final boolean ISOTT = false;
    private static final String TAG = "TPPlayerConfig";
    public static final String VERSION = "2.32.0.448";
    private static String appVersion = "";
    private static String appVersionName = null;
    public static String beacon_log_host = "";
    public static String beacon_policy_host = "";
    private static long buildNum = -1;
    private static String host_config = "";
    private static String mAbUserId = "";
    private static boolean mEnableDataReport = false;
    private static boolean mEnablePlayerReport = false;
    private static String mGuid = "";
    private static String mOutNetIp = "";
    private static int mPlatform = -1;
    private static String mProxyCacheDir = null;
    private static String mProxyDataDir = null;
    private static long mProxyMaxStorageSizeMB = 0;
    private static long mProxyMaxUseMemoryMB = 0;
    private static int mProxyServiceType = -1;
    private static boolean mUseP2P = true;
    private static boolean mUserIsVip = false;
    private static String mUserUin = null;
    private static String mUserUpc = "";
    private static int mUserUpcState;

    public static String getAbUserId() {
        return TextUtils.isEmpty(mAbUserId) ? "" : mAbUserId;
    }

    public static String getAppBigVersion(Context context) {
        if (!TextUtils.isEmpty(appVersion)) {
            return appVersion;
        }
        String appVersionName2 = getAppVersionName(context);
        if (TextUtils.isEmpty(appVersionName2)) {
            appVersionName2 = "0.0.0";
        } else {
            String[] strArrSplit = appVersionName2.split(DOT);
            if (strArrSplit != null && strArrSplit.length == 4) {
                appVersionName2 = appVersionName2.substring(0, appVersionName2.lastIndexOf("."));
            }
        }
        appVersion = appVersionName2;
        return appVersionName2;
    }

    public static String getAppVersionName(Context context) {
        if (!TextUtils.isEmpty(appVersionName)) {
            return appVersionName;
        }
        if (context == null) {
            return "";
        }
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            appVersionName = str;
            return str == null ? "" : str;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static long getBuildNumber(Context context) {
        long j10 = buildNum;
        if (-1 != j10) {
            return j10;
        }
        try {
            long longVersionCode = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).getLongVersionCode();
            buildNum = longVersionCode;
            return longVersionCode;
        } catch (Throwable unused) {
            TPLogUtil.e(TAG, "getLongVersionCode less api 28");
            return buildNum;
        }
    }

    public static String getGuid() {
        return mGuid;
    }

    public static boolean getMediaDrmReuseEnable() {
        return TPPlayerCoreConfig.getMediaDrmReuseEnable();
    }

    public static boolean getNewReportEnable() {
        return TPPlayerCoreConfig.getCoreEventProcessEnable();
    }

    public static String getOutNetIp() {
        return mOutNetIp;
    }

    public static int getPlatform() {
        return mPlatform;
    }

    public static String getProxyCacheDir() {
        return mProxyCacheDir;
    }

    public static String getProxyConfigDir() {
        if (TextUtils.isEmpty(host_config)) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject(host_config);
            return !jSONObject.has(TPPlayerMgr.PROXY_HOST_KEY) ? "" : jSONObject.getString(TPPlayerMgr.PROXY_HOST_KEY);
        } catch (JSONException e10) {
            TPLogUtil.e(TAG, e10);
            return "";
        }
    }

    public static String getProxyDataDir() {
        return mProxyDataDir;
    }

    public static long getProxyMaxStorageSizeMB() {
        return mProxyMaxStorageSizeMB;
    }

    public static long getProxyMaxUseMemoryMB() {
        return mProxyMaxUseMemoryMB;
    }

    public static int getProxyServiceType() {
        int i10;
        int i11 = mProxyServiceType;
        return (i11 != -1 || (i10 = mPlatform) == -1) ? i11 : i10;
    }

    public static String getUserUin() {
        return mUserUin;
    }

    public static String getUserUpc() {
        return mUserUpc;
    }

    public static int getUserUpcState() {
        return mUserUpcState;
    }

    public static int getVideoMediaCodecCoexistMaxCnt() {
        return TPPlayerCoreConfig.getVideoMediaCodecCoexistMaxCnt();
    }

    public static String getWidevineProvisioningServerUrl() {
        return TPPlayerCoreConfig.getWidevineProvisioningServerUrl();
    }

    public static boolean isDataReportEnable() {
        return mEnableDataReport;
    }

    public static boolean isPlayerReportEnable() {
        return mEnablePlayerReport;
    }

    public static boolean isUseP2P() {
        return mUseP2P;
    }

    public static boolean isUserIsVip() {
        return mUserIsVip;
    }

    public static void parseHostConfig(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "parseHostConfig, config is null.";
        } else {
            host_config = str;
            TPLogUtil.i(TAG, "parseHostConfig:".concat(String.valueOf(str)));
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has(TPPlayerMgr.PLYAER_HOST_KEY)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(TPPlayerMgr.PLYAER_HOST_KEY);
                    if (jSONObject2.has(TPPlayerMgr.BEACON_POLICY_HOST_KEY)) {
                        beacon_policy_host = jSONObject2.getString(TPPlayerMgr.BEACON_POLICY_HOST_KEY);
                    }
                    if (jSONObject2.has(TPPlayerMgr.BEACON_LOG_HOST_KEY)) {
                        beacon_log_host = jSONObject2.getString(TPPlayerMgr.BEACON_LOG_HOST_KEY);
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th2) {
                str2 = "parseHostConfig exception: " + th2.toString();
            }
        }
        TPLogUtil.w(TAG, str2);
    }

    public static void setAbUserId(String str) {
        mAbUserId = str;
    }

    public static void setDataReportEnable(boolean z10) {
        mEnableDataReport = z10;
    }

    public static void setDebugEnable(boolean z10) {
        TPLogUtil.setDebugEnable(z10);
    }

    public static void setGuid(String str) {
        mGuid = str;
    }

    public static void setMediaDrmReuseEnable(boolean z10) {
        TPPlayerCoreConfig.setMediaDrmReuseEnable(z10);
    }

    public static void setNewReportEnable(boolean z10) {
        TPPlayerCoreConfig.setCoreEventProcessEnable(z10);
    }

    public static void setOutNetIp(String str) {
        mOutNetIp = str;
    }

    public static void setP2PEnable(boolean z10) {
        mUseP2P = z10;
    }

    public static void setPlatform(int i10) {
        mPlatform = i10;
    }

    public static void setPlayerReportEnable(boolean z10) {
        mEnablePlayerReport = z10;
    }

    public static void setProxyCacheDir(String str) {
        mProxyCacheDir = str;
    }

    public static void setProxyDataDir(String str) {
        mProxyDataDir = str;
    }

    public static void setProxyMaxStorageSizeMB(long j10) {
        mProxyMaxStorageSizeMB = j10;
    }

    public static void setProxyMaxUseMemoryMB(long j10) {
        mProxyMaxUseMemoryMB = j10;
    }

    public static void setProxyServiceType(int i10) {
        mProxyServiceType = i10;
    }

    public static void setUserIsVip(boolean z10) {
        mUserIsVip = z10;
    }

    public static void setUserUin(String str) {
        mUserUin = str;
    }

    public static void setUserUpc(String str) {
        mUserUpc = str;
    }

    public static void setUserUpcState(int i10) {
        mUserUpcState = i10;
    }

    public static void setVideoMediaCodecCoexistMaxCnt(int i10) {
        TPPlayerCoreConfig.setVideoMediaCodecCoexistMaxCnt(i10);
    }

    public static void setWidevineProvisioningServerUrl(String str) {
        TPPlayerCoreConfig.setWidevineProvisioningServerUrl(str);
    }
}
