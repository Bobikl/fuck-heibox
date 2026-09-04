package com.umeng.umcrash;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.efs.sdk.base.core.util.concurrent.WorkThreadUtil;
import com.efs.sdk.base.integrationtesting.IntegrationTestingUtil;
import com.efs.sdk.base.newsharedpreferences.SharedPreferencesUtils;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.samplingwhitelist.SamplingWhiteListUtil;
import com.efs.sdk.fluttersdk.FlutterManager;
import com.efs.sdk.h5pagesdk.H5Manager;
import com.efs.sdk.launch.LaunchManager;
import com.efs.sdk.memoryinfo.UMMemoryMonitor;
import com.efs.sdk.net.NetManager;
import com.efs.sdk.pa.IPaClient;
import com.efs.sdk.pa.PAFactory;
import com.efs.sdk.pa.config.IEfsReporter;
import com.efs.sdk.pa.config.PackageLevel;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.uc.crashsdk.export.CrashApi;
import com.uc.crashsdk.export.CustomLogInfo;
import com.uc.crashsdk.export.ICrashClient;
import com.uc.crashsdk.export.LogType;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.pagesdk.PageManger;
import com.umeng.powersdk.PowerManager;
import com.xiaomi.mipush.sdk.Constants;
import j5.b;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class UMCrash {
    private static final long DEFAULT_PA_TIMEOUT_TIME = 2000;
    private static final boolean DEFAULT_VALUE_CRASH_ANR = true;
    private static final boolean DEFAULT_VALUE_CRASH_JAVA = true;
    private static final boolean DEFAULT_VALUE_CRASH_NATIVE = true;
    private static final boolean DEFAULT_VALUE_CRASH_UNEXP = false;
    private static final boolean DEFAULT_VALUE_FLUTTER = true;
    private static final boolean DEFAULT_VALUE_H5PAGE = true;
    private static final boolean DEFAULT_VALUE_LAUNCH = true;
    private static final boolean DEFAULT_VALUE_MEM = true;
    private static final boolean DEFAULT_VALUE_NET = true;
    private static final boolean DEFAULT_VALUE_PA = true;
    private static final boolean DEFAULT_VALUE_PAGE = true;
    private static final boolean DEFAULT_VALUE_POWER = true;
    private static final String INTEGRATIONTESTING_SP = "itconfig";
    private static final String IT_DEBUGKEY = "apm_debugkey";
    private static final String IT_SENDAGING = "apm_sendaging";
    private static final String KEY_ACTIITY_ON_CREATED = "onCreated";
    private static final String KEY_ACTIITY_ON_DESTROYED = "onDestroyed";
    private static final String KEY_ACTIITY_ON_PAUSED = "onPaused";
    private static final String KEY_ACTIITY_ON_RESUMED = "onResumed";
    private static final String KEY_ACTIITY_ON_STARTED = "onStarted";
    private static final String KEY_ACTIITY_ON_STOPPED = "onStopped";
    public static final String KEY_APM_DEFAULT_SECRET = "NEej8y@anWa*8hep";
    public static final String KEY_APM_ROOT_NAME = "UApm";
    public static final String KEY_CALLBACK_PAGE_ACTION = "um_action_log";
    public static final String KEY_CALLBACK_SESSION_ID = "um_session_id";
    public static final String KEY_CALLBACK_UMID = "um_umid";
    private static final String KEY_CALLBACK_USER_STRING = "um_user_string";
    public static final String KEY_DEBUGKEY = "um_dk";
    public static final String KEY_ENABLE_ANR = "enableANRLog";
    public static final String KEY_ENABLE_CRASH_JAVA = "enableJavaLog";
    public static final String KEY_ENABLE_CRASH_NATIVE = "enableNativeLog";
    public static final String KEY_ENABLE_CRASH_UNEXP = "enableUnexpLog";
    public static final String KEY_ENABLE_FLUTTER = "enableFlutterLog";
    public static final String KEY_ENABLE_H5PAGE = "enableH5PageLog";
    public static final String KEY_ENABLE_LAUNCH = "enableLaunchLog";
    public static final String KEY_ENABLE_MEM = "enableMemLog";
    public static final String KEY_ENABLE_NET = "enableNetLog";
    public static final String KEY_ENABLE_PA = "enablePaLog";
    public static final String KEY_ENABLE_PAGE = "enablePageLog";
    public static final String KEY_ENABLE_POWER = "enablePowerLog";
    public static final String KEY_HEADER_ACCESS = "um_access";
    public static final String KEY_HEADER_ACCESS_SUBTYPE = "um_access_subtype";
    public static final String KEY_HEADER_APPKEY = "um_app_key";
    public static final String KEY_HEADER_BESRIAL = "um_bserial";
    public static final String KEY_HEADER_BSVER = "um_bsver";
    public static final String KEY_HEADER_BVER = "um_bver";
    public static final String KEY_HEADER_CARRIER = "um_app_carrier";
    public static final String KEY_HEADER_CHANNEL = "um_app_channel";
    public static final String KEY_HEADER_CRASH_VERSION = "um_crash_sdk_version";
    public static final String KEY_HEADER_DEBUGKEY = "um_dk";
    public static final String KEY_HEADER_NETWORK_TYPE = "um_network_type";
    public static final String KEY_HEADER_OS = "um_os";
    public static final String KEY_HEADER_PROVIDER = "um_app_provider";
    public static final String KEY_HEADER_PUID = "um_app_puid";
    public static final String KEY_HEADER_START_TIME = "um_app_start_time";
    public static final String KEY_HEADER_UMID = "um_umid_header";
    private static final int KEY_MAX_LENGTH = 20480;
    private static final int KEY_MAX_LENGTH_128 = 128;
    public static final String KEY_PA_TIMEOUT_TIME = "pa_timeout_time";
    public static final String SP_KEY_DEBUG = "debugkey";
    public static final String SP_KEY_TIMESTAMP = "timestamp";
    private static final String TAG = "UMCrash";
    private static String crashSdkVersion = "1.9.3";
    private static boolean isBuildId = true;
    private static boolean isDebug = true;
    private static boolean isEncrypt = false;
    private static boolean isIntl = false;
    private static boolean isZip = true;
    private static Context mContext;
    private static UMCrashCallback mUMCrashCallback;
    public static EfsReporter sReporter;
    private static String userBesrial;
    private static String userBsver;
    private static String userBver;
    private static Object pageArrayLock = new Object();
    private static ArrayList<String> mArrayList = new ArrayList<>(10);
    private static boolean isPA = false;
    private static boolean isLa = false;
    private static boolean isNet = false;
    private static boolean isPage = false;
    private static boolean isPower = false;
    private static boolean isFlutter = false;
    private static boolean enableJavaLog = true;
    private static boolean enableNativeLog = true;
    private static boolean enableANRLog = true;
    private static boolean enablePaLog = true;
    private static boolean enableLaunchLog = true;
    private static boolean enableMemLog = true;
    private static boolean enableNetLog = true;
    private static boolean enableH5PageLog = true;
    private static boolean enablePageLog = true;
    private static boolean enablePowerLog = true;
    private static boolean enableFlutterLog = true;
    private static long paTimeoutTime = 2000;
    private static int index = 0;
    private static boolean isOpenUserCrash = true;
    private static boolean isUploadNowUserCrash = false;

    public static class CrashClientImpl implements ICrashClient {
        private CrashClientImpl() {
        }

        @Override // com.uc.crashsdk.export.ICrashClient
        public void onAddCrashStats(String str, int i10, int i11) {
        }

        @Override // com.uc.crashsdk.export.ICrashClient
        public File onBeforeUploadLog(File file) {
            return file;
        }

        @Override // com.uc.crashsdk.export.ICrashClient
        public void onClientProcessLogGenerated(String str, File file, String str2) {
        }

        @Override // com.uc.crashsdk.export.ICrashClient
        public void onCrashRestarting(boolean z10) {
        }

        @Override // com.uc.crashsdk.export.ICrashClient
        public String onGetCallbackInfo(String str, boolean z10) {
            String strOnCallback;
            String string = null;
            if (!UMCrash.KEY_CALLBACK_PAGE_ACTION.equals(str)) {
                if (UMCrash.KEY_CALLBACK_UMID.equals(str)) {
                    return UMCrash.getUMID(UMCrash.mContext);
                }
                if (!UMCrash.KEY_CALLBACK_USER_STRING.equals(str)) {
                    if (UMCrash.KEY_CALLBACK_SESSION_ID.equals(str)) {
                        return UMCrash.getSessionId(UMCrash.mContext);
                    }
                    return null;
                }
                if (UMCrash.mUMCrashCallback == null || (strOnCallback = UMCrash.mUMCrashCallback.onCallback()) == null) {
                    return null;
                }
                return strOnCallback.trim().getBytes().length > 20480 ? UMCrashUtils.splitByByte(strOnCallback, 20480) : strOnCallback;
            }
            try {
                if (UMCrash.mArrayList != null && UMCrash.mArrayList.size() > 0) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("source", 0);
                    jSONObject.put("action_name", "page_view");
                    jSONObject.put("action_page_state", UMCrash.isPage);
                    JSONArray jSONArray = new JSONArray();
                    for (int i10 = 0; i10 < UMCrash.mArrayList.size(); i10++) {
                        String str2 = (String) UMCrash.mArrayList.get(i10);
                        if (str2 != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("name", str2);
                            jSONArray.put(jSONObject2);
                        }
                    }
                    jSONObject.put("action_parameter", jSONArray);
                    string = jSONObject.toString();
                    if (UMCrash.isDebug) {
                        Log.i(UMCrash.TAG, "page json is " + string);
                    }
                }
            } catch (Throwable unused) {
            }
            return string;
        }

        @Override // com.uc.crashsdk.export.ICrashClient
        public void onLogGenerated(File file, String str) {
        }
    }

    public static class PaClientImpl implements IPaClient {
        private PaClientImpl() {
        }

        @Override // com.efs.sdk.pa.IPaClient
        public String onGetCallbackInfo() {
            String strOnCallback;
            if (UMCrash.mUMCrashCallback == null || (strOnCallback = UMCrash.mUMCrashCallback.onCallback()) == null) {
                return null;
            }
            return strOnCallback.trim().getBytes().length > 20480 ? UMCrashUtils.splitByByte(strOnCallback, 20480) : strOnCallback;
        }
    }

    static /* synthetic */ int access$1008() {
        int i10 = index;
        index = i10 + 1;
        return i10;
    }

    static /* synthetic */ int access$1010() {
        int i10 = index;
        index = i10 - 1;
        return i10;
    }

    @Deprecated
    public static void enableANRLog(boolean z10) {
        enableANRLog = z10;
    }

    public static void enableJavaScriptBridge(View view) {
        try {
            H5Manager.setWebView(view);
        } catch (Throwable unused) {
        }
    }

    public static void enableJavaScriptBridge(WebView webView) {
        enableJavaScriptBridge((View) webView);
    }

    @Deprecated
    public static void enableMemoryMonitor(boolean z10) {
        UMMemoryMonitor.get().setEnable(z10);
    }

    @Deprecated
    public static void enableNativeLog(boolean z10) {
        enableNativeLog = z10;
    }

    public static void generateCustomLog(String str, String str2) {
        if (!isOpenUserCrash) {
            Log.e(TAG, "generate user is closed .");
            return;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            Log.e(TAG, "generate custom log failed ! e is null or type is empty .");
            return;
        }
        try {
            CustomLogInfo customLogInfo = new CustomLogInfo(null, "exception");
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(KEY_CALLBACK_UMID);
            arrayList.add(KEY_CALLBACK_PAGE_ACTION);
            arrayList.add(KEY_CALLBACK_SESSION_ID);
            arrayList.add(KEY_CALLBACK_USER_STRING);
            customLogInfo.mCallbacks = arrayList;
            Log.i(TAG, "upload is " + isUploadNowUserCrash);
            customLogInfo.mUploadNow = isUploadNowUserCrash;
            HashMap map = new HashMap(20);
            map.put(UMCustomLogInfoBuilder.LOG_KEY_CT, "exception");
            map.put(UMCustomLogInfoBuilder.LOG_KEY_AC, str2);
            StringBuffer stringBuffer = new StringBuffer();
            for (Map.Entry entry : map.entrySet()) {
                stringBuffer.append((String) entry.getKey());
                stringBuffer.append(":");
                stringBuffer.append((String) entry.getValue());
                stringBuffer.append("\n");
            }
            String str3 = "Exception message:\nBack traces starts.\n" + str + "\nBack traces ends.";
            if (!TextUtils.isEmpty(str3)) {
                stringBuffer.append(str3);
                stringBuffer.append("\n");
            }
            customLogInfo.mData = stringBuffer;
            CrashApi crashApi = CrashApi.getInstance();
            if (crashApi == null) {
                Log.e(TAG, "CrashApi is null, not init .");
            } else {
                crashApi.generateCustomLog(customLogInfo);
            }
        } catch (Throwable unused) {
        }
    }

    public static void generateCustomLog(Throwable th2, String str) {
        if (!isOpenUserCrash) {
            Log.e(TAG, "generate user is closed .");
            return;
        }
        if (th2 == null || TextUtils.isEmpty(str)) {
            Log.e(TAG, "generate custom log failed ! e is null or type is empty .");
            return;
        }
        try {
            CustomLogInfo customLogInfoBuild = new UMCustomLogInfoBuilder(str).stack(th2).build();
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(KEY_CALLBACK_UMID);
            arrayList.add(KEY_CALLBACK_PAGE_ACTION);
            arrayList.add(KEY_CALLBACK_SESSION_ID);
            arrayList.add(KEY_CALLBACK_USER_STRING);
            customLogInfoBuild.mCallbacks = arrayList;
            String str2 = TAG;
            Log.i(str2, "upload is " + isUploadNowUserCrash);
            customLogInfoBuild.mUploadNow = isUploadNowUserCrash;
            CrashApi crashApi = CrashApi.getInstance();
            if (crashApi == null) {
                Log.e(str2, "CrashApi is null, not init .");
            } else {
                crashApi.generateCustomLog(customLogInfoBuild);
            }
        } catch (Throwable unused) {
        }
    }

    public static EfsReporter getReporter() {
        return sReporter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized String getSessionId(Context context) {
        Class<?> cls;
        Method method;
        String string = null;
        if (context == null) {
            return null;
        }
        try {
            cls = Class.forName("com.umeng.commonsdk.statistics.common.DeviceConfig");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                method = cls.getMethod("getSid", Context.class);
            } catch (NoSuchMethodException unused2) {
                method = null;
            }
            if (method != null) {
                try {
                    Object objInvoke = method.invoke(null, context);
                    if (objInvoke != null) {
                        string = objInvoke.toString();
                    }
                } catch (IllegalAccessException | InvocationTargetException unused3) {
                }
            }
        }
        return string;
    }

    public static String getUMAPMFlag() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", 0);
            jSONObject.put(CrashHianalyticsData.EVENT_ID_CRASH, 1);
            if (enableJavaLog) {
                jSONObject.put("crashJava", 1);
            } else {
                jSONObject.put("crashJava", 0);
            }
            if (enableNativeLog) {
                jSONObject.put("crashNative", 1);
            } else {
                jSONObject.put("crashNative", 0);
            }
            if (enableANRLog) {
                jSONObject.put(LogType.ANR_TYPE, 1);
            } else {
                jSONObject.put(LogType.ANR_TYPE, 0);
            }
            if (isPA) {
                jSONObject.put(b.f124286k, 1);
            } else {
                jSONObject.put(b.f124286k, 0);
            }
            if (isLa) {
                jSONObject.put("la", 1);
            } else {
                jSONObject.put("la", 0);
            }
            if (UMMemoryMonitor.get().isEnable()) {
                jSONObject.put("mem", 1);
            } else {
                jSONObject.put("mem", 0);
            }
            if (isNet) {
                jSONObject.put(h5.b.f119111k, 1);
            } else {
                jSONObject.put(h5.b.f119111k, 0);
            }
            if (H5Manager.getH5ConfigMananger() == null || !H5Manager.getH5ConfigMananger().isH5TracerEnable()) {
                jSONObject.put("h5", 0);
            } else {
                jSONObject.put("h5", 1);
            }
            if (isOpenUserCrash) {
                jSONObject.put("crashUser", 1);
            } else {
                jSONObject.put("crashUser", 0);
            }
            if (isPage) {
                jSONObject.put("page", 1);
            } else {
                jSONObject.put("page", 0);
            }
            if (isPower) {
                jSONObject.put("power", 1);
            } else {
                jSONObject.put("power", 0);
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized String getUMID(Context context) {
        Class<?> cls;
        Method method;
        String string = null;
        if (context == null) {
            return null;
        }
        try {
            cls = Class.forName("com.umeng.commonsdk.UMConfigure");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                method = cls.getMethod("getUMIDString", Context.class);
            } catch (NoSuchMethodException unused2) {
                method = null;
            }
            if (method != null) {
                try {
                    Object objInvoke = method.invoke(null, context);
                    if (objInvoke != null) {
                        string = objInvoke.toString();
                    }
                } catch (IllegalAccessException | InvocationTargetException unused3) {
                }
            }
        }
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01f6 A[Catch: all -> 0x029b, TryCatch #22 {, blocks: (B:63:0x01ac, B:71:0x01e4, B:73:0x01f6, B:74:0x01fe, B:76:0x0206, B:77:0x020e, B:79:0x0216, B:92:0x0255, B:94:0x0259, B:99:0x028b, B:95:0x027a, B:91:0x0252, B:83:0x0239, B:70:0x01de, B:100:0x028f, B:80:0x021e, B:96:0x0281, B:84:0x023c, B:87:0x0245, B:88:0x024b, B:64:0x01c9, B:66:0x01cf, B:68:0x01d3), top: B:323:0x019f, inners: #7, #13, #15, #23 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0206 A[Catch: all -> 0x029b, TryCatch #22 {, blocks: (B:63:0x01ac, B:71:0x01e4, B:73:0x01f6, B:74:0x01fe, B:76:0x0206, B:77:0x020e, B:79:0x0216, B:92:0x0255, B:94:0x0259, B:99:0x028b, B:95:0x027a, B:91:0x0252, B:83:0x0239, B:70:0x01de, B:100:0x028f, B:80:0x021e, B:96:0x0281, B:84:0x023c, B:87:0x0245, B:88:0x024b, B:64:0x01c9, B:66:0x01cf, B:68:0x01d3), top: B:323:0x019f, inners: #7, #13, #15, #23 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0216 A[Catch: all -> 0x029b, TRY_LEAVE, TryCatch #22 {, blocks: (B:63:0x01ac, B:71:0x01e4, B:73:0x01f6, B:74:0x01fe, B:76:0x0206, B:77:0x020e, B:79:0x0216, B:92:0x0255, B:94:0x0259, B:99:0x028b, B:95:0x027a, B:91:0x0252, B:83:0x0239, B:70:0x01de, B:100:0x028f, B:80:0x021e, B:96:0x0281, B:84:0x023c, B:87:0x0245, B:88:0x024b, B:64:0x01c9, B:66:0x01cf, B:68:0x01d3), top: B:323:0x019f, inners: #7, #13, #15, #23 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0245 A[Catch: all -> 0x0251, TRY_ENTER, TryCatch #15 {all -> 0x0251, blocks: (B:84:0x023c, B:87:0x0245, B:88:0x024b), top: B:313:0x023c, outer: #22 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x024b A[Catch: all -> 0x0251, TRY_LEAVE, TryCatch #15 {all -> 0x0251, blocks: (B:84:0x023c, B:87:0x0245, B:88:0x024b), top: B:313:0x023c, outer: #22 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0259 A[Catch: all -> 0x029b, TryCatch #22 {, blocks: (B:63:0x01ac, B:71:0x01e4, B:73:0x01f6, B:74:0x01fe, B:76:0x0206, B:77:0x020e, B:79:0x0216, B:92:0x0255, B:94:0x0259, B:99:0x028b, B:95:0x027a, B:91:0x0252, B:83:0x0239, B:70:0x01de, B:100:0x028f, B:80:0x021e, B:96:0x0281, B:84:0x023c, B:87:0x0245, B:88:0x024b, B:64:0x01c9, B:66:0x01cf, B:68:0x01d3), top: B:323:0x019f, inners: #7, #13, #15, #23 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x027a A[Catch: all -> 0x029b, TRY_LEAVE, TryCatch #22 {, blocks: (B:63:0x01ac, B:71:0x01e4, B:73:0x01f6, B:74:0x01fe, B:76:0x0206, B:77:0x020e, B:79:0x0216, B:92:0x0255, B:94:0x0259, B:99:0x028b, B:95:0x027a, B:91:0x0252, B:83:0x0239, B:70:0x01de, B:100:0x028f, B:80:0x021e, B:96:0x0281, B:84:0x023c, B:87:0x0245, B:88:0x024b, B:64:0x01c9, B:66:0x01cf, B:68:0x01d3), top: B:323:0x019f, inners: #7, #13, #15, #23 }] */
    public static void init(final Context context, final String str, String str2) {
        if (context == null || str == null) {
            Log.e(TAG, "context is null or appkey is null, init failed.");
            return;
        }
        mContext = context;
        try {
            WorkThreadUtil.submit(new Runnable() { // from class: com.umeng.umcrash.UMCrash.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ImprintHandler.getImprintService(UMCrash.mContext).registImprintCallback(UMCrashContent.KEY_APM_CTR_FLAG, new UMImprintChangeCallback() { // from class: com.umeng.umcrash.UMCrash.1.1
                            @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
                            public void onImprintValueChanged(String str3, String str4) {
                                try {
                                    if (TextUtils.isEmpty(str3) || !UMCrashContent.KEY_APM_CTR_FLAG.equals(str3)) {
                                        return;
                                    }
                                    if (UMCrash.isDebug) {
                                        Log.i(UMCrash.TAG, "common callback. apm ctr flag is " + str4);
                                    }
                                    UMCrashUtils.saveInnerConfig(context.getApplicationContext(), str3, str4);
                                } catch (Throwable th2) {
                                    th2.printStackTrace();
                                }
                            }
                        });
                        String strImprintProperty = UMEnvelopeBuild.imprintProperty(UMCrash.mContext, UMCrashContent.KEY_APM_CTR_FLAG, "0");
                        if (UMCrash.isDebug) {
                            Log.i(UMCrash.TAG, "get common. apm ctr flag is " + strImprintProperty);
                        }
                        if (strImprintProperty == null || TextUtils.isEmpty(strImprintProperty)) {
                            return;
                        }
                        UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.KEY_APM_CTR_FLAG, strImprintProperty);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            });
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        try {
            int innerConfig = UMCrashUtils.getInnerConfig(mContext, UMCrashContent.KEY_APM_CTR_FLAG, 0);
            if (isDebug) {
                Log.i(TAG, "int apm. flag is " + innerConfig);
            }
            if (innerConfig == -1) {
                return;
            }
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
        try {
            int innerConfig2 = UMCrashUtils.getInnerConfig(mContext, UMCrashContent.APM_STATE_HIT_WL, 0);
            if (isDebug) {
                Log.i(TAG, "int apm. hitWlState is " + innerConfig2);
            }
            SamplingWhiteListUtil.setHitWL(innerConfig2 == 1);
        } catch (Throwable th4) {
            th4.printStackTrace();
        }
        final SharedPreferences sharedPreferences = SharedPreferencesUtils.getSharedPreferences(context, INTEGRATIONTESTING_SP);
        try {
            if (enableJavaLog) {
                enableJavaLog = UMCrashUtils.random(UMCrashUtils.getInnerConfig(context.getApplicationContext(), UMCrashContent.APM_CRASH_JAVA_SAMPLING_RATE, 100));
            }
            if (enableNativeLog) {
                enableNativeLog = UMCrashUtils.random(UMCrashUtils.getInnerConfig(context.getApplicationContext(), UMCrashContent.APM_CRASH_NATIVE_SAMPLING_RATE, 100));
            }
            if (enableANRLog) {
                enableANRLog = UMCrashUtils.random(UMCrashUtils.getInnerConfig(context.getApplicationContext(), UMCrashContent.APM_CRASH_ANR_SAMPLING_RATE, 100));
            }
            isOpenUserCrash = UMCrashUtils.random(UMCrashUtils.getInnerConfig(context.getApplicationContext(), UMCrashContent.APM_CRASH_USER_SAMPLING_RATE, 100));
            if (UMCrashUtils.getInnerConfig(context.getApplicationContext(), UMCrashContent.APM_CRASH_USER_UPLOAD_TYPE, -1) == 0) {
                isUploadNowUserCrash = true;
            } else {
                isUploadNowUserCrash = false;
            }
        } catch (Throwable th5) {
            th5.printStackTrace();
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("mDebug", isDebug);
        bundle.putBoolean("mEncryptLog", isEncrypt);
        bundle.putBoolean("mZipLog", isZip);
        bundle.putBoolean(KEY_ENABLE_CRASH_JAVA, enableJavaLog);
        bundle.putBoolean(KEY_ENABLE_CRASH_NATIVE, enableNativeLog);
        bundle.putBoolean(KEY_ENABLE_ANR, enableANRLog);
        if (isDebug) {
            Log.i(TAG, "enable : java is " + enableJavaLog + ", native is " + enableNativeLog + ", anr is " + enableANRLog);
        }
        bundle.putBoolean(KEY_ENABLE_CRASH_UNEXP, false);
        bundle.putBoolean("mIsInternational", isIntl);
        bundle.putBoolean("mDumpUserSolibBuildId", isBuildId);
        if (isIntl) {
            bundle.putString("mCrashLogUploadUrl", "https://errnewlogos.umeng.com/upload");
            bundle.putString("mCrashSDKAuthUrl", UMCrashContent.UM_DOMAIN_APM_URL_INTL);
            bundle.putString("mCrashRateUploadUrl", UMCrashContent.UM_DOMAIN_APM_URL_INTL);
            if (isDebug) {
                Log.i(TAG, "crash log domain is https://errnewlogos.umeng.com");
            }
        } else {
            bundle.putString("mCrashLogUploadUrl", "https://errnewlog.umeng.com/upload");
            bundle.putString("mCrashSDKAuthUrl", UMCrashContent.UM_DOMAIN_APM_URL);
            bundle.putString("mCrashRateUploadUrl", UMCrashContent.UM_DOMAIN_APM_URL);
            if (isDebug) {
                Log.i(TAG, "crash rate domain is https://errnewlog.umeng.com");
            }
        }
        final CrashApi crashApiCreateInstanceEx = CrashApi.createInstanceEx(context, str, isDebug, bundle, new CrashClientImpl());
        if (crashApiCreateInstanceEx != null) {
            crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_APPKEY, str);
            crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_CHANNEL, str2);
            crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_OS, "android");
            crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_CRASH_VERSION, crashSdkVersion);
            crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_UMID, getUMID(context));
            try {
                String[] activeUser = UMCrashUtils.getActiveUser(context);
                if (activeUser == null || activeUser.length != 2) {
                    crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_CARRIER, UMCrashUtils.getNetworkOperatorName(context));
                    if (!TextUtils.isEmpty(userBver)) {
                        crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_BVER, userBver);
                    }
                    if (!TextUtils.isEmpty(userBsver)) {
                        crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_BSVER, userBsver);
                    }
                    if (!TextUtils.isEmpty(userBesrial)) {
                        crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_BESRIAL, userBesrial);
                    }
                    try {
                        crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_NETWORK_TYPE, "" + NetworkUtil.getNetworkTypeUmeng(context));
                    } catch (Throwable th6) {
                        th6.printStackTrace();
                    }
                    try {
                        if (UMCrashUtils.isHarmony(context)) {
                            crashApiCreateInstanceEx.addHeaderInfo("others_OS", "harmony");
                        } else {
                            crashApiCreateInstanceEx.addHeaderInfo("others_OS", "Android");
                        }
                    } catch (Throwable th7) {
                        th7.printStackTrace();
                    }
                    if (context instanceof Application) {
                        ((Application) context).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.umeng.umcrash.UMCrash.2
                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public void onActivityCreated(Activity activity, Bundle bundle2) {
                                Intent intent;
                                Uri data;
                                String scheme;
                                long j10;
                                UMCrash.saveActivityState(activity.getClass().getName(), UMCrash.KEY_ACTIITY_ON_CREATED);
                                if (UMCrash.index != 0 || (intent = activity.getIntent()) == null || (data = intent.getData()) == null || (scheme = data.getScheme()) == null || scheme.isEmpty()) {
                                    return;
                                }
                                if (scheme.contains("um." + str)) {
                                    Set<String> queryParameterNames = data.getQueryParameterNames();
                                    if (queryParameterNames.contains(UMCrash.IT_DEBUGKEY) && queryParameterNames.contains(UMCrash.IT_SENDAGING)) {
                                        String queryParameter = data.getQueryParameter(UMCrash.IT_DEBUGKEY);
                                        try {
                                            j10 = Long.parseLong(data.getQueryParameter(UMCrash.IT_SENDAGING));
                                        } catch (NumberFormatException unused) {
                                            j10 = 0;
                                        }
                                        if (j10 < 0) {
                                            sharedPreferences.edit().clear().apply();
                                            IntegrationTestingUtil.setIntegrationTestingInPeriod(false);
                                            return;
                                        }
                                        if (j10 > 6) {
                                            j10 = 6;
                                        }
                                        sharedPreferences.edit().putString("debugkey", queryParameter).apply();
                                        sharedPreferences.edit().putLong("timestamp", System.currentTimeMillis() + (j10 * 60 * 60 * 1000)).apply();
                                        UMCrashUtils.setIntegrationTesingParams(queryParameter);
                                        IntegrationTestingUtil.setIntegrationTestingInPeriod(true);
                                    }
                                }
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public void onActivityDestroyed(Activity activity) {
                                UMCrash.saveActivityState(activity.getClass().getName(), UMCrash.KEY_ACTIITY_ON_DESTROYED);
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public void onActivityPaused(Activity activity) {
                                UMCrash.saveActivityState(activity.getClass().getName(), UMCrash.KEY_ACTIITY_ON_PAUSED);
                                UMCrash.access$1010();
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public void onActivityResumed(Activity activity) {
                                UMCrash.saveActivityState(activity.getClass().getName(), UMCrash.KEY_ACTIITY_ON_RESUMED);
                                UMMemoryMonitor.get().onActivityResumed(activity);
                                PowerManager.onActivityResumed(activity);
                                UMCrash.access$1008();
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public void onActivitySaveInstanceState(Activity activity, Bundle bundle2) {
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public void onActivityStarted(Activity activity) {
                                UMCrash.saveActivityState(activity.getClass().getName(), UMCrash.KEY_ACTIITY_ON_STARTED);
                                UMMemoryMonitor.get().onActivityStarted(activity);
                                PowerManager.onActivityStarted(activity);
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public void onActivityStopped(Activity activity) {
                                UMCrash.saveActivityState(activity.getClass().getName(), UMCrash.KEY_ACTIITY_ON_STOPPED);
                                UMMemoryMonitor.get().onActivityStopped(activity);
                                PowerManager.onActivityStopped(activity);
                            }
                        });
                        crashApiCreateInstanceEx.registerInfoCallback(KEY_CALLBACK_UMID, 1048593);
                        crashApiCreateInstanceEx.registerInfoCallback(KEY_CALLBACK_PAGE_ACTION, 1048593);
                        crashApiCreateInstanceEx.registerInfoCallback(KEY_CALLBACK_SESSION_ID, 1048593);
                    } else {
                        Log.e(TAG, "context not instanceof application.");
                    }
                    try {
                        WorkThreadUtil.submit(new Runnable() { // from class: com.umeng.umcrash.UMCrash.3
                            @Override // java.lang.Runnable
                            public void run() {
                                try {
                                    String[] networkAccessMode = NetworkUtil.getNetworkAccessMode(context);
                                    if ("Wi-Fi".equals(networkAccessMode[0])) {
                                        crashApiCreateInstanceEx.addHeaderInfo(UMCrash.KEY_HEADER_ACCESS, "wifi");
                                    } else if ("2G/3G".equals(networkAccessMode[0])) {
                                        crashApiCreateInstanceEx.addHeaderInfo(UMCrash.KEY_HEADER_ACCESS, "2G/3G");
                                    } else {
                                        crashApiCreateInstanceEx.addHeaderInfo(UMCrash.KEY_HEADER_ACCESS, "unknow");
                                    }
                                    if ("".equals(networkAccessMode[1])) {
                                        return;
                                    }
                                    crashApiCreateInstanceEx.addHeaderInfo(UMCrash.KEY_HEADER_ACCESS_SUBTYPE, networkAccessMode[1]);
                                } catch (Throwable th8) {
                                    th8.printStackTrace();
                                }
                            }
                        });
                    } catch (Throwable th8) {
                        th8.printStackTrace();
                    }
                } else {
                    crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_PUID, activeUser[1]);
                    crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_PROVIDER, activeUser[0]);
                    crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_CARRIER, UMCrashUtils.getNetworkOperatorName(context));
                    if (!TextUtils.isEmpty(userBver)) {
                        crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_BVER, userBver);
                    }
                    if (!TextUtils.isEmpty(userBsver)) {
                        crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_BSVER, userBsver);
                    }
                    if (!TextUtils.isEmpty(userBesrial)) {
                        crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_BESRIAL, userBesrial);
                    }
                    crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_NETWORK_TYPE, "" + NetworkUtil.getNetworkTypeUmeng(context));
                    if (UMCrashUtils.isHarmony(context)) {
                        crashApiCreateInstanceEx.addHeaderInfo("others_OS", "harmony");
                    } else {
                        crashApiCreateInstanceEx.addHeaderInfo("others_OS", "Android");
                    }
                    if (context instanceof Application) {
                        ((Application) context).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.umeng.umcrash.UMCrash.2
                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public void onActivityCreated(Activity activity, Bundle bundle2) {
                                Intent intent;
                                Uri data;
                                String scheme;
                                long j10;
                                UMCrash.saveActivityState(activity.getClass().getName(), UMCrash.KEY_ACTIITY_ON_CREATED);
                                if (UMCrash.index != 0 || (intent = activity.getIntent()) == null || (data = intent.getData()) == null || (scheme = data.getScheme()) == null || scheme.isEmpty()) {
                                    return;
                                }
                                if (scheme.contains("um." + str)) {
                                    Set<String> queryParameterNames = data.getQueryParameterNames();
                                    if (queryParameterNames.contains(UMCrash.IT_DEBUGKEY) && queryParameterNames.contains(UMCrash.IT_SENDAGING)) {
                                        String queryParameter = data.getQueryParameter(UMCrash.IT_DEBUGKEY);
                                        try {
                                            j10 = Long.parseLong(data.getQueryParameter(UMCrash.IT_SENDAGING));
                                        } catch (NumberFormatException unused) {
                                            j10 = 0;
                                        }
                                        if (j10 < 0) {
                                            sharedPreferences.edit().clear().apply();
                                            IntegrationTestingUtil.setIntegrationTestingInPeriod(false);
                                            return;
                                        }
                                        if (j10 > 6) {
                                            j10 = 6;
                                        }
                                        sharedPreferences.edit().putString("debugkey", queryParameter).apply();
                                        sharedPreferences.edit().putLong("timestamp", System.currentTimeMillis() + (j10 * 60 * 60 * 1000)).apply();
                                        UMCrashUtils.setIntegrationTesingParams(queryParameter);
                                        IntegrationTestingUtil.setIntegrationTestingInPeriod(true);
                                    }
                                }
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public void onActivityDestroyed(Activity activity) {
                                UMCrash.saveActivityState(activity.getClass().getName(), UMCrash.KEY_ACTIITY_ON_DESTROYED);
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public void onActivityPaused(Activity activity) {
                                UMCrash.saveActivityState(activity.getClass().getName(), UMCrash.KEY_ACTIITY_ON_PAUSED);
                                UMCrash.access$1010();
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public void onActivityResumed(Activity activity) {
                                UMCrash.saveActivityState(activity.getClass().getName(), UMCrash.KEY_ACTIITY_ON_RESUMED);
                                UMMemoryMonitor.get().onActivityResumed(activity);
                                PowerManager.onActivityResumed(activity);
                                UMCrash.access$1008();
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public void onActivitySaveInstanceState(Activity activity, Bundle bundle2) {
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public void onActivityStarted(Activity activity) {
                                UMCrash.saveActivityState(activity.getClass().getName(), UMCrash.KEY_ACTIITY_ON_STARTED);
                                UMMemoryMonitor.get().onActivityStarted(activity);
                                PowerManager.onActivityStarted(activity);
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public void onActivityStopped(Activity activity) {
                                UMCrash.saveActivityState(activity.getClass().getName(), UMCrash.KEY_ACTIITY_ON_STOPPED);
                                UMMemoryMonitor.get().onActivityStopped(activity);
                                PowerManager.onActivityStopped(activity);
                            }
                        });
                        crashApiCreateInstanceEx.registerInfoCallback(KEY_CALLBACK_UMID, 1048593);
                        crashApiCreateInstanceEx.registerInfoCallback(KEY_CALLBACK_PAGE_ACTION, 1048593);
                        crashApiCreateInstanceEx.registerInfoCallback(KEY_CALLBACK_SESSION_ID, 1048593);
                    } else {
                        Log.e(TAG, "context not instanceof application.");
                    }
                    WorkThreadUtil.submit(new Runnable() { // from class: com.umeng.umcrash.UMCrash.3
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                String[] networkAccessMode = NetworkUtil.getNetworkAccessMode(context);
                                if ("Wi-Fi".equals(networkAccessMode[0])) {
                                    crashApiCreateInstanceEx.addHeaderInfo(UMCrash.KEY_HEADER_ACCESS, "wifi");
                                } else if ("2G/3G".equals(networkAccessMode[0])) {
                                    crashApiCreateInstanceEx.addHeaderInfo(UMCrash.KEY_HEADER_ACCESS, "2G/3G");
                                } else {
                                    crashApiCreateInstanceEx.addHeaderInfo(UMCrash.KEY_HEADER_ACCESS, "unknow");
                                }
                                if ("".equals(networkAccessMode[1])) {
                                    return;
                                }
                                crashApiCreateInstanceEx.addHeaderInfo(UMCrash.KEY_HEADER_ACCESS_SUBTYPE, networkAccessMode[1]);
                            } catch (Throwable th9) {
                                th9.printStackTrace();
                            }
                        }
                    });
                }
            } catch (Throwable unused) {
                crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_PUID, "");
                crashApiCreateInstanceEx.addHeaderInfo(KEY_HEADER_PROVIDER, "");
            }
        } else {
            Log.e(TAG, "create CrashAPI is null.");
        }
        try {
            initReporter(context, str, str2);
        } catch (Throwable th9) {
            th9.printStackTrace();
        }
        try {
            String string = sharedPreferences.getString("debugkey", "");
            if (sharedPreferences.getLong("timestamp", 0L) - System.currentTimeMillis() < 0 || TextUtils.isEmpty(string)) {
                sharedPreferences.edit().clear().apply();
                IntegrationTestingUtil.setIntegrationTestingInPeriod(false);
            } else {
                IntegrationTestingUtil.setIntegrationTestingInPeriod(true);
                UMCrashUtils.setIntegrationTesingParams(string);
            }
        } catch (Throwable th10) {
            th10.printStackTrace();
        }
        try {
            if (enablePaLog) {
                WorkThreadUtil.submit(new Runnable() { // from class: com.umeng.umcrash.UMCrash.4
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            PAFactory.Builder builder = new PAFactory.Builder(context.getApplicationContext(), new IEfsReporter() { // from class: com.umeng.umcrash.UMCrash.4.1
                                @Override // com.efs.sdk.pa.config.IEfsReporter
                                public EfsReporter getReporter() {
                                    return UMCrash.sReporter;
                                }
                            });
                            builder.packageLevel(PackageLevel.RELEASE);
                            builder.timeoutTime(UMCrash.paTimeoutTime);
                            builder.setPaClient(new PaClientImpl());
                            PAFactory pAFactoryBuild = builder.build();
                            pAFactoryBuild.getPaInstance().start();
                            boolean unused2 = UMCrash.isPA = pAFactoryBuild.getConfigManager().enableTracer();
                        } catch (Throwable th11) {
                            th11.printStackTrace();
                        }
                    }
                });
            } else if (isDebug) {
                Log.e(TAG, "enablePaLog is false");
            }
        } catch (Throwable th11) {
            th11.printStackTrace();
        }
        try {
            if (enableLaunchLog) {
                LaunchManager.init(context, sReporter);
                try {
                    if (LaunchManager.getLaunchConfigManager() != null) {
                        isLa = LaunchManager.getLaunchConfigManager().enableTracer();
                    }
                } catch (Throwable th12) {
                    th12.printStackTrace();
                }
                String uMId = UMUtils.getUMId(context);
                if (uMId == null || TextUtils.isEmpty(uMId)) {
                    if (isDebug) {
                        Log.i(TAG, "begin register common callback.  key is umid.");
                    }
                    ImprintHandler.getImprintService(context).registImprintCallback("umid", new UMImprintChangeCallback() { // from class: com.umeng.umcrash.UMCrash.5
                        @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
                        public void onImprintValueChanged(String str3, String str4) {
                            if (UMCrash.isDebug) {
                                Log.i(UMCrash.TAG, "common callback.  key is " + str3 + "; value is " + str4);
                            }
                            try {
                                if ("umid".equals(str3)) {
                                    LaunchManager.sendLaunchCache(context, str4);
                                    ImprintHandler.getImprintService(context).unregistImprintCallback("umid", this);
                                }
                            } catch (Throwable th13) {
                                th13.printStackTrace();
                            }
                        }
                    });
                }
            } else if (isDebug) {
                Log.e(TAG, "enableLaunchLog is false");
            }
        } catch (Throwable th13) {
            th13.printStackTrace();
        }
        try {
            if (enableMemLog) {
                UMMemoryMonitor.get().start(context, sReporter);
            } else if (isDebug) {
                Log.e(TAG, "enableMemLog is false");
            }
        } catch (Throwable th14) {
            th14.printStackTrace();
        }
        try {
            int innerConfig3 = UMCrashUtils.getInnerConfig(context.getApplicationContext(), UMCrashContent.APM_STATE_NET, -1);
            if (isDebug) {
                Log.i(TAG, "inner config : net rate is " + innerConfig3);
            }
            if (innerConfig3 == 0) {
                if (isDebug) {
                    Log.i(TAG, "inner config : net close.");
                }
            } else if (innerConfig3 == 100) {
                if (isDebug) {
                    Log.i(TAG, "inner config : net open.");
                }
                if (enableNetLog) {
                    NetManager.init(context, sReporter);
                    try {
                        if (NetManager.getNetConfigManager() != null) {
                            isNet = NetManager.getNetConfigManager().enableTracer();
                        }
                    } catch (Throwable th15) {
                        th15.printStackTrace();
                    }
                } else if (isDebug) {
                    Log.e(TAG, "enableNetLog is false");
                }
            }
        } catch (Throwable th16) {
            th16.printStackTrace();
        }
        try {
            int innerConfig4 = UMCrashUtils.getInnerConfig(context.getApplicationContext(), UMCrashContent.APM_STATE_NATIVE_H5, -1);
            if (isDebug) {
                Log.i(TAG, "inner config : nativeH5Rate is " + innerConfig4);
            }
            if (innerConfig4 == 0) {
                if (isDebug) {
                    Log.i(TAG, "inner config : h5 close.");
                }
            } else if (innerConfig4 == 100) {
                if (isDebug) {
                    Log.i(TAG, "inner config : h5 open.");
                }
                if (enableH5PageLog) {
                    H5Manager.init(context, sReporter);
                } else if (isDebug) {
                    Log.e(TAG, "enableH5PageLog is false");
                }
            }
        } catch (Throwable th17) {
            th17.printStackTrace();
        }
        try {
            int innerConfig5 = UMCrashUtils.getInnerConfig(context.getApplicationContext(), UMCrashContent.APM_STATE_PAGE, -1);
            if (isDebug) {
                Log.i(TAG, "inner config : page rate is " + innerConfig5);
            }
            if (innerConfig5 == 0) {
                if (isDebug) {
                    Log.i(TAG, "inner config : page close.");
                }
            } else if (innerConfig5 == 100) {
                if (isDebug) {
                    Log.i(TAG, "inner config : page open.");
                }
                if (enablePageLog) {
                    PageManger.init(mContext, sReporter);
                    try {
                        if (PageManger.getPageConfigManger() != null) {
                            isPage = PageManger.getPageConfigManger().enableTracer();
                        }
                    } catch (Throwable th18) {
                        th18.printStackTrace();
                    }
                } else if (isDebug) {
                    Log.e(TAG, "enablePageLog is false");
                }
            }
        } catch (Throwable th19) {
            th19.printStackTrace();
        }
        try {
            int innerConfig6 = UMCrashUtils.getInnerConfig(context.getApplicationContext(), UMCrashContent.APM_STATE_POWER, -1);
            if (isDebug) {
                Log.i(TAG, "inner config : power rate is " + innerConfig6);
            }
            if (innerConfig6 == 0) {
                if (isDebug) {
                    Log.i(TAG, "inner config : power close.");
                }
            } else if (innerConfig6 == 100) {
                if (isDebug) {
                    Log.i(TAG, "inner config : power open.");
                }
                if (enablePowerLog) {
                    PowerManager.init(mContext, sReporter);
                    try {
                        if (PowerManager.getPowerConfigManager() != null) {
                            isPower = PowerManager.getPowerConfigManager().enableTracer();
                        }
                    } catch (Throwable th20) {
                        th20.printStackTrace();
                    }
                } else if (isDebug) {
                    Log.e(TAG, "enablePowerLog is false");
                }
            }
        } catch (Throwable th21) {
            th21.printStackTrace();
        }
        try {
            int innerConfig7 = UMCrashUtils.getInnerConfig(context.getApplicationContext(), UMCrashContent.APM_STATE_FLUTTER, -1);
            if (isDebug) {
                Log.i(TAG, "inner config : flutter rate is " + innerConfig7);
            }
            if (innerConfig7 == 0) {
                if (isDebug) {
                    Log.i(TAG, "inner config : flutter close.");
                    return;
                }
                return;
            }
            if (innerConfig7 == 100) {
                if (isDebug) {
                    Log.i(TAG, "inner config : flutter open.");
                }
                if (!enableFlutterLog) {
                    if (isDebug) {
                        Log.e(TAG, "enableFlutterLog is false");
                        return;
                    }
                    return;
                }
                FlutterManager.init(mContext, sReporter);
                try {
                    if (FlutterManager.getFlutterConfigManager() != null) {
                        isFlutter = FlutterManager.getFlutterConfigManager().isFlutterEnable();
                    }
                } catch (Throwable th22) {
                    th22.printStackTrace();
                }
            }
        } catch (Throwable th23) {
            th23.printStackTrace();
        }
    }

    public static void initConfig(Bundle bundle) {
        if (bundle != null) {
            if (bundle.getBoolean(KEY_ENABLE_CRASH_JAVA, true)) {
                enableJavaLog = true;
            } else {
                enableJavaLog = false;
            }
            if (bundle.getBoolean(KEY_ENABLE_CRASH_NATIVE, true)) {
                enableNativeLog = true;
            } else {
                enableNativeLog = false;
            }
            if (bundle.getBoolean(KEY_ENABLE_ANR, true)) {
                enableANRLog = true;
            } else {
                enableANRLog = false;
            }
            if (bundle.getBoolean(KEY_ENABLE_PA, true)) {
                enablePaLog = true;
            } else {
                enablePaLog = false;
            }
            if (bundle.getBoolean(KEY_ENABLE_LAUNCH, true)) {
                enableLaunchLog = true;
            } else {
                enableLaunchLog = false;
            }
            if (bundle.getBoolean(KEY_ENABLE_MEM, true)) {
                enableMemLog = true;
            } else {
                enableMemLog = false;
            }
            if (bundle.getBoolean(KEY_ENABLE_NET, true)) {
                enableNetLog = true;
            } else {
                enableNetLog = false;
            }
            if (bundle.getBoolean(KEY_ENABLE_H5PAGE, true)) {
                enableH5PageLog = true;
            } else {
                enableH5PageLog = false;
            }
            paTimeoutTime = bundle.getLong(KEY_PA_TIMEOUT_TIME, 2000L);
            if (bundle.getBoolean(KEY_ENABLE_PAGE, true)) {
                enablePageLog = true;
            } else {
                enablePageLog = false;
            }
            if (bundle.getBoolean(KEY_ENABLE_POWER, true)) {
                enablePowerLog = true;
            } else {
                enablePowerLog = false;
            }
            if (bundle.getBoolean(KEY_ENABLE_FLUTTER, true)) {
                enableFlutterLog = true;
            } else {
                enableFlutterLog = false;
            }
        }
    }

    private static void initReporter(final Context context, String str, String str2) {
        HashMap map = new HashMap(1);
        map.put(KEY_HEADER_UMID, getUMID(context));
        map.put(KEY_HEADER_CHANNEL, str2);
        map.put(KEY_HEADER_CARRIER, UMCrashUtils.getNetworkOperatorName(context));
        map.put(KEY_HEADER_OS, "android");
        map.put(KEY_HEADER_CRASH_VERSION, crashSdkVersion);
        try {
            String[] activeUser = UMCrashUtils.getActiveUser(context);
            if (activeUser != null && activeUser.length == 2) {
                map.put(KEY_HEADER_PUID, activeUser[1]);
                map.put(KEY_HEADER_PROVIDER, activeUser[0]);
            }
        } catch (Throwable unused) {
            map.put(KEY_HEADER_PUID, "");
            map.put(KEY_HEADER_PROVIDER, "");
        }
        if (!TextUtils.isEmpty(userBver)) {
            map.put(KEY_HEADER_BVER, userBver);
        }
        if (!TextUtils.isEmpty(userBsver)) {
            map.put(KEY_HEADER_BSVER, userBsver);
        }
        if (!TextUtils.isEmpty(userBesrial)) {
            map.put(KEY_HEADER_BESRIAL, userBesrial);
        }
        try {
            if (UMCrashUtils.isHarmony(context)) {
                map.put("others_OS", "harmony");
            } else {
                map.put("others_OS", "Android");
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        EfsReporter efsReporterBuild = new EfsReporter.Builder(context.getApplicationContext(), str, KEY_APM_DEFAULT_SECRET).debug(isDebug).efsDirRootName(KEY_APM_ROOT_NAME).printLogDetail(isDebug).intl(isIntl).enableWaStat(false).build();
        sReporter = efsReporterBuild;
        efsReporterBuild.addPublicParams(map);
        try {
            sReporter.getAllSdkConfig(new String[]{UMCrashContent.APM_STATE_HIT_WL, UMCrashContent.APM_STATE_FLUTTER, UMCrashContent.APM_STATE_POWER, UMCrashContent.APM_STATE_PAGE, UMCrashContent.APM_STATE_NET, UMCrashContent.APM_STATE_NATIVE_H5, UMCrashContent.APM_CRASH_JAVA_SAMPLING_RATE, UMCrashContent.APM_CRASH_NATIVE_SAMPLING_RATE, UMCrashContent.APM_CRASH_ANR_SAMPLING_RATE, UMCrashContent.APM_CRASH_USER_SAMPLING_RATE, UMCrashContent.APM_CRASH_USER_MAX_COUNT, UMCrashContent.APM_CRASH_USER_UPLOAD_TYPE}, new IConfigCallback() { // from class: com.umeng.umcrash.UMCrash.6
                @Override // com.efs.sdk.base.observer.IConfigCallback
                public void onChange(Map<String, Object> map2) {
                    try {
                        Object obj = map2.get(UMCrashContent.APM_STATE_NET);
                        if (obj != null) {
                            if (UMCrash.isDebug) {
                                Log.i("efs.config", "callback netRate is " + obj.toString());
                            }
                            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_STATE_NET, obj);
                        }
                    } catch (Throwable th3) {
                        th3.printStackTrace();
                    }
                    try {
                        Object obj2 = map2.get(UMCrashContent.APM_STATE_NATIVE_H5);
                        if (obj2 != null) {
                            if (UMCrash.isDebug) {
                                Log.i("efs.config", "callback nativeH5Rate is " + obj2.toString());
                            }
                            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_STATE_NATIVE_H5, obj2);
                        }
                    } catch (Throwable th4) {
                        th4.printStackTrace();
                    }
                    try {
                        UMCrash.saveLocalCrashSampling(context, map2);
                    } catch (Throwable th5) {
                        th5.printStackTrace();
                    }
                    try {
                        UMCrash.updateLocalCrashConfig(context, map2);
                    } catch (Throwable th6) {
                        th6.printStackTrace();
                    }
                    try {
                        Object obj3 = map2.get(UMCrashContent.APM_CRASH_USER_UPLOAD_TYPE);
                        if (obj3 != null) {
                            if (UMCrash.isDebug) {
                                Log.i("efs.config", "callback uploadType is " + obj3.toString());
                            }
                            if (Integer.valueOf(obj3.toString()).intValue() == 0) {
                                boolean unused2 = UMCrash.isUploadNowUserCrash = true;
                            } else {
                                boolean unused3 = UMCrash.isUploadNowUserCrash = false;
                            }
                            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_CRASH_USER_UPLOAD_TYPE, obj3);
                        }
                    } catch (Throwable th7) {
                        th7.printStackTrace();
                    }
                    try {
                        Object obj4 = map2.get(UMCrashContent.APM_STATE_PAGE);
                        if (obj4 != null) {
                            if (UMCrash.isDebug) {
                                Log.i("efs.config", "callback pageRate is " + obj4.toString());
                            }
                            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_STATE_PAGE, obj4);
                        }
                    } catch (Throwable th8) {
                        th8.printStackTrace();
                    }
                    try {
                        Object obj5 = map2.get(UMCrashContent.APM_STATE_POWER);
                        if (obj5 != null) {
                            if (UMCrash.isDebug) {
                                Log.i("efs.config", "callback powerRate is " + obj5);
                            }
                            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_STATE_POWER, obj5);
                        }
                    } catch (Throwable th9) {
                        th9.printStackTrace();
                    }
                    try {
                        Object obj6 = map2.get(UMCrashContent.APM_STATE_HIT_WL);
                        if (obj6 != null) {
                            if (UMCrash.isDebug) {
                                Log.i("efs.config", "callback hitwl is " + obj6);
                            }
                            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_STATE_HIT_WL, obj6);
                        }
                    } catch (Throwable th10) {
                        th10.printStackTrace();
                    }
                    try {
                        Object obj7 = map2.get(UMCrashContent.APM_STATE_FLUTTER);
                        if (obj7 != null) {
                            if (UMCrash.isDebug) {
                                Log.i("efs.config", "callback flutterRate is " + obj7);
                            }
                            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_STATE_FLUTTER, obj7);
                        }
                    } catch (Throwable th11) {
                        th11.printStackTrace();
                    }
                }
            });
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
    }

    public static void isBuildId(boolean z10) {
        isBuildId = z10;
    }

    public static void registerUMCrashCallback(UMCrashCallback uMCrashCallback) {
        if (uMCrashCallback == null) {
            Log.e(TAG, "callback error.");
            return;
        }
        mUMCrashCallback = uMCrashCallback;
        if (CrashApi.getInstance() != null) {
            CrashApi.getInstance().registerInfoCallback(KEY_CALLBACK_USER_STRING, 1048593);
        } else {
            Log.e(TAG, "callback error, instance is null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void saveActivityState(String str, String str2) {
        try {
            ArrayList<String> arrayList = mArrayList;
            if (arrayList != null) {
                if (arrayList.size() >= 20) {
                    mArrayList.remove(0);
                }
                mArrayList.add(str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + System.currentTimeMillis() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str2);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void saveLocalCrashSampling(Context context, Map<String, Object> map) {
        if (context == null || map == null) {
            return;
        }
        Object obj = map.get(UMCrashContent.APM_CRASH_JAVA_SAMPLING_RATE);
        if (obj != null) {
            if (isDebug) {
                Log.i("efs.config", "callback crashJavaSampling is " + obj.toString());
            }
            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_CRASH_JAVA_SAMPLING_RATE, obj);
        }
        Object obj2 = map.get(UMCrashContent.APM_CRASH_NATIVE_SAMPLING_RATE);
        if (obj2 != null) {
            if (isDebug) {
                Log.i("efs.config", "callback crashNativeSampling is " + obj2.toString());
            }
            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_CRASH_NATIVE_SAMPLING_RATE, obj2);
        }
        Object obj3 = map.get(UMCrashContent.APM_CRASH_ANR_SAMPLING_RATE);
        if (obj3 != null) {
            if (isDebug) {
                Log.i("efs.config", "callback crashANRSampling is " + obj3.toString());
            }
            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_CRASH_ANR_SAMPLING_RATE, obj3);
        }
        Object obj4 = map.get(UMCrashContent.APM_CRASH_USER_SAMPLING_RATE);
        if (obj4 != null) {
            if (isDebug) {
                Log.i("efs.config", "callback crashUserSampling is " + obj4.toString());
            }
            UMCrashUtils.saveInnerConfig(context.getApplicationContext(), UMCrashContent.APM_CRASH_USER_SAMPLING_RATE, obj4);
        }
    }

    public static void setAppVersion(String str, String str2, String str3) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (str.trim().getBytes().length > 128) {
                    str = UMCrashUtils.splitByByte(str, 128);
                }
                userBver = str;
            } else if (isDebug) {
                Log.e(TAG, "version is null or empty !");
            }
            if (!TextUtils.isEmpty(str2)) {
                if (str2.trim().getBytes().length > 128) {
                    str2 = UMCrashUtils.splitByByte(str2, 128);
                }
                userBsver = str2;
            } else if (isDebug) {
                Log.e(TAG, "sub version is null or empty !");
            }
            if (!TextUtils.isEmpty(str3)) {
                if (str3.trim().getBytes().length > 128) {
                    str3 = UMCrashUtils.splitByByte(str3, 128);
                }
                userBesrial = str3;
            } else if (isDebug) {
                Log.e(TAG, "build id is null or empty !");
            }
            CrashApi crashApi = CrashApi.getInstance();
            if (crashApi != null) {
                if (!TextUtils.isEmpty(userBver)) {
                    crashApi.addHeaderInfo(KEY_HEADER_BVER, userBver);
                }
                if (!TextUtils.isEmpty(userBsver)) {
                    crashApi.addHeaderInfo(KEY_HEADER_BSVER, userBsver);
                }
                if (!TextUtils.isEmpty(userBesrial)) {
                    crashApi.addHeaderInfo(KEY_HEADER_BESRIAL, userBesrial);
                }
            } else if (isDebug) {
                Log.e(TAG, "set app version. crashApi is null");
            }
            HashMap map = new HashMap(1);
            if (!TextUtils.isEmpty(userBver)) {
                map.put(KEY_HEADER_BVER, userBver);
            }
            if (!TextUtils.isEmpty(userBsver)) {
                map.put(KEY_HEADER_BSVER, userBsver);
            }
            if (!TextUtils.isEmpty(userBesrial)) {
                map.put(KEY_HEADER_BESRIAL, userBesrial);
            }
            EfsReporter efsReporter = sReporter;
            if (efsReporter != null) {
                efsReporter.addPublicParams(map);
            } else if (isDebug) {
                Log.e(TAG, "set app version.  sReporter is null");
            }
            if (!TextUtils.isEmpty(userBver)) {
                UMCrashUtils.setCommonTag(KEY_HEADER_BVER, userBver);
            }
            if (!TextUtils.isEmpty(userBsver)) {
                UMCrashUtils.setCommonTag(KEY_HEADER_BSVER, userBsver);
            }
            if (TextUtils.isEmpty(userBesrial)) {
                return;
            }
            UMCrashUtils.setCommonTag(KEY_HEADER_BESRIAL, userBesrial);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void setDebug(boolean z10) {
        isDebug = z10;
        LaunchManager.isDebug = z10;
        H5Manager.isDebug = z10;
        PageManger.isDebug = z10;
        PowerManager.isDebug = z10;
    }

    public static void setPaTimeoutTime(long j10) {
        paTimeoutTime = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void updateLocalCrashConfig(Context context, Map<String, Object> map) {
        if (context == null || map == null) {
            return;
        }
        Bundle bundle = new Bundle();
        Object obj = map.get(UMCrashContent.APM_CRASH_USER_MAX_COUNT);
        if (obj != null) {
            if (isDebug) {
                Log.i("efs.config", "callback crashMaxUserCount is " + obj.toString());
            }
            bundle.putInt("mMaxCustomLogCountPerTypePerDay", Integer.valueOf(obj.toString()).intValue());
            bundle.putInt("mMaxUploadCustomLogCountPerDay", Integer.valueOf(obj.toString()).intValue());
        }
        CrashApi.getInstance().updateCustomInfo(bundle);
    }

    private static void updateLocalCrashSampling(Object obj, Object obj2, Object obj3, Object obj4) {
        CrashApi crashApi = CrashApi.getInstance();
        if (crashApi != null) {
            if (obj != null && UMCrashUtils.random(Integer.valueOf(obj.toString()).intValue())) {
                crashApi.disableLog(16);
            }
            if (obj2 != null && UMCrashUtils.random(Integer.valueOf(obj2.toString()).intValue())) {
                crashApi.disableLog(1);
            }
            if (obj3 != null && UMCrashUtils.random(Integer.valueOf(obj3.toString()).intValue())) {
                crashApi.disableLog(1048576);
            }
            if (obj4 == null || !UMCrashUtils.random(Integer.valueOf(obj4.toString()).intValue())) {
                return;
            }
            isOpenUserCrash = false;
        }
    }

    private static void useIntlServices(boolean z10) {
        isIntl = z10;
        if (isDebug) {
            Log.i(TAG, "useIntlServices is " + isIntl);
        }
    }
}
