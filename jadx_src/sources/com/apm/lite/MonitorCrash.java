package com.apm.lite;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import anet.channel.util.HttpConstant;
import com.apm.lite.j.j;
import com.apm.lite.k.q;
import com.apm.lite.runtime.ConfigManager;
import com.apm.lite.runtime.l;
import com.apm.lite.runtime.m;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class MonitorCrash {
    private static final String TAG = "MonitorCrash";
    com.apm.lite.b mAppLog;
    Config mConfig;
    AttachUserData mCustomData;
    HashMap<String, String> mTagMap = new HashMap<>();
    HashMap<String, String> mPageViewTagMap = new HashMap<>();
    private volatile boolean isAppLogInit = false;

    public static class Config {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f39808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f39809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f39810c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f39811d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f39812e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        String[] f39813f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        String[] f39814g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        AttachUserData f39815h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f39816i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        com.apm.lite.b f39817j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f39818k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        String f39819l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private IDynamicParams f39820m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Map<String, String> f39821n;

        public interface IDynamicParams {
            String getDid();

            String getUserId();
        }

        public static class SdkBuilder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Config f39822a;

            private SdkBuilder(String str) {
                Config config = new Config(null);
                this.f39822a = config;
                config.f39808a = str;
            }

            /* synthetic */ SdkBuilder(String str, a aVar) {
                this(str);
            }

            public SdkBuilder acceptWithActivity(boolean z10) {
                this.f39822a.f39818k = z10;
                return this;
            }

            public Config build() {
                return this.f39822a;
            }

            public SdkBuilder channel(String str) {
                this.f39822a.f39810c = str;
                return this;
            }

            public SdkBuilder debugMode(boolean z10) {
                Npth.getConfigManager().setDebugMode(z10);
                return this;
            }

            public SdkBuilder dynamicParams(IDynamicParams iDynamicParams) {
                this.f39822a.f39820m = iDynamicParams;
                return this;
            }

            public SdkBuilder enableAnrMonitor(boolean z10) {
                Npth.getConfigManager().setAnrEnable(z10);
                return this;
            }

            public SdkBuilder enableJavaCrash(boolean z10) {
                Npth.getConfigManager().setJavaCrashEnable(z10);
                return this;
            }

            public SdkBuilder enableNativeCrash(boolean z10) {
                Npth.getConfigManager().setNativeCrashEnable(z10);
                return this;
            }

            public SdkBuilder keyWords(String... strArr) {
                this.f39822a.f39813f = strArr;
                return this;
            }

            public SdkBuilder pageViewTags(Map<String, String> map) {
                this.f39822a.f39821n = map;
                return this;
            }

            public SdkBuilder soList(String... strArr) {
                this.f39822a.f39814g = strArr;
                return this;
            }

            public SdkBuilder token(String str) {
                this.f39822a.f39809b = str;
                return this;
            }

            public SdkBuilder url(String str) {
                this.f39822a.f39819l = str;
                return this;
            }

            public SdkBuilder versionCode(long j10) {
                this.f39822a.f39811d = j10;
                return this;
            }

            public SdkBuilder versionName(String str) {
                this.f39822a.f39812e = str;
                return this;
            }
        }

        private Config() {
            this.f39811d = -1L;
            this.f39818k = false;
            this.f39821n = null;
        }

        /* synthetic */ Config(a aVar) {
            this();
        }

        public static SdkBuilder sdk(String str) {
            return new SdkBuilder(str, null);
        }

        public String getDeviceId() {
            IDynamicParams iDynamicParams = this.f39820m;
            return iDynamicParams == null ? this.f39816i : iDynamicParams.getDid();
        }

        public String getUID() {
            IDynamicParams iDynamicParams = this.f39820m;
            return iDynamicParams == null ? "" : iDynamicParams.getUserId();
        }

        public Config setChannel(String str) {
            this.f39810c = str;
            com.apm.lite.b bVar = this.f39817j;
            if (bVar != null) {
                bVar.g(str);
            }
            com.apm.lite.i.b.e();
            return this;
        }

        @Deprecated
        public Config setDeviceId(String str) {
            return setDeviceId(str, true);
        }

        @Deprecated
        public Config setDeviceId(String str, boolean z10) {
            this.f39816i = str;
            com.apm.lite.b bVar = this.f39817j;
            if (bVar != null) {
                bVar.e(str);
            }
            if (z10) {
                com.apm.lite.i.b.e();
            }
            return this;
        }

        public Config setPackageName(String str) {
            return setPackageName(str);
        }

        public Config setPackageName(String... strArr) {
            this.f39813f = strArr;
            com.apm.lite.i.b.e();
            return this;
        }

        public Config setSoList(String[] strArr) {
            this.f39814g = strArr;
            com.apm.lite.i.b.e();
            return this;
        }
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f39823b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f39824c;

        a(boolean z10, Context context) {
            this.f39823b = z10;
            this.f39824c = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MonitorCrash.this.isAppLogInit) {
                return;
            }
            if (!j.e()) {
                j.f();
            }
            if (com.apm.lite.runtime.e.n(MonitorCrash.this.mConfig.f39808a)) {
                MonitorCrash.this.isAppLogInit = true;
                MonitorCrash monitorCrash = MonitorCrash.this;
                if (monitorCrash.mAppLog == null) {
                    monitorCrash.mAppLog = new com.apm.lite.b();
                }
                HashMap map = null;
                if (!this.f39823b) {
                    String strB = com.apm.lite.d.b.b(d.b());
                    HashMap map2 = new HashMap();
                    map2.put("host_app_id", strB);
                    map2.put("sdk_version", MonitorCrash.this.mConfig.f39812e);
                    map = map2;
                }
                MonitorCrash monitorCrash2 = MonitorCrash.this;
                monitorCrash2.mAppLog.d(this.f39824c, monitorCrash2.mConfig, map);
                MonitorCrash monitorCrash3 = MonitorCrash.this;
                monitorCrash3.mConfig.f39817j = monitorCrash3.mAppLog;
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IUploadCallback f39826b;

        b(IUploadCallback iUploadCallback) {
            this.f39826b = iUploadCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            MonitorCrash monitorCrash = MonitorCrash.this;
            com.apm.lite.b bVar = monitorCrash.mAppLog;
            if (bVar != null) {
                bVar.f(monitorCrash.mPageViewTagMap, this.f39826b);
                return;
            }
            IUploadCallback iUploadCallback = this.f39826b;
            if (iUploadCallback != null) {
                iUploadCallback.afterUpload(false);
            }
        }
    }

    private MonitorCrash(Config config) {
        this.mConfig = config;
        this.mCustomData = config.f39815h;
    }

    private void initAppLog(Context context, boolean z10) {
        initAppLogAsync(context, z10);
    }

    private void initAppLogAsync(Context context, boolean z10) {
        m.b().f(new a(z10, context), 5L);
    }

    public static synchronized MonitorCrash initSDK(Context context, Config config) {
        if (TextUtils.isEmpty(config.f39809b)) {
            Log.e(TAG, config.f39808a + " MonitorCrash init without token.");
        }
        MonitorCrash monitorCrashA = d.a(config.f39808a);
        if (monitorCrashA != null) {
            Log.e(TAG, "Duplicate init MonitorCrash with same aid.");
            return monitorCrashA;
        }
        MonitorCrash monitorCrash = new MonitorCrash(config);
        if (!TextUtils.isEmpty(config.f39819l)) {
            monitorCrash.setReportUrl(config.f39819l);
        }
        Map<String, String> map = config.f39821n;
        if (map != null) {
            monitorCrash.mPageViewTagMap.putAll(map);
            monitorCrash.mTagMap.putAll(monitorCrash.mPageViewTagMap);
        }
        l.c(context, Npth.getConfigManager().isJavaCrashEnable(), Npth.getConfigManager().isJavaCrashEnable(), Npth.getConfigManager().isNativeCrashEnable(), Npth.getConfigManager().isAnrEnable(), 0L);
        monitorCrash.initAppLog(context, false);
        d.i(monitorCrash);
        return monitorCrash;
    }

    public static void reInitAppLog(String str) {
    }

    private MonitorCrash setReportUrl(String str) {
        int i10;
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        int iIndexOf = str.indexOf(HttpConstant.SCHEME_SPLIT);
        if (iIndexOf < 0) {
            i10 = 8;
            str = "https://" + str;
        } else {
            i10 = iIndexOf + 3;
        }
        int iIndexOf2 = str.indexOf("/", i10);
        if (iIndexOf2 >= 0) {
            str = str.substring(0, iIndexOf2);
        }
        q.a("set url " + str);
        e.o().setLaunchCrashUrl(str + ConfigManager.EXCEPTION_URL_SUFFIX);
        e.o().setJavaCrashUploadUrl(str + ConfigManager.JAVA_URL_SUFFIX);
        e.o().setNativeCrashUrl(str + ConfigManager.NATIVE_URL_SUFFIX);
        e.o().setConfigUrl(str + ConfigManager.CONFIG_URL_SUFFIX);
        e.o().setAlogUploadUrl(str + ConfigManager.ALOG_URL_SUFFIX);
        e.o().setFileUploadUrl(str + ConfigManager.FILE_UPLOAD_URL_SUFFIX);
        e.o().setPageViewUrl(str + ConfigManager.PAGEVIEW_URL_SUFFIX);
        return this;
    }

    public MonitorCrash addPageViewTags(String str, String str2) {
        this.mPageViewTagMap.put(str, str2);
        this.mTagMap.put(str, str2);
        return this;
    }

    public MonitorCrash addTags(String str, String str2) {
        this.mTagMap.put(str, str2);
        return this;
    }

    public Config config() {
        return this.mConfig;
    }

    public void registerCrashCallback(ICrashCallback iCrashCallback, CrashType crashType) {
        l.d(iCrashCallback, crashType);
    }

    public void registerOOMCallback(IOOMCallback iOOMCallback) {
        l.e(iOOMCallback);
    }

    public void reportPageView(IUploadCallback iUploadCallback) {
        m.b().f(new b(iUploadCallback), 10L);
    }

    public void unregisterCrashCallback(ICrashCallback iCrashCallback, CrashType crashType) {
        l.i(iCrashCallback, crashType);
    }

    public void unregisterOOMCallback(IOOMCallback iOOMCallback, CrashType crashType) {
        l.f(iOOMCallback, crashType);
    }
}
