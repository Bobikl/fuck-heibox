package com.huawei.hms.scankit.p;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.feature.DynamicModuleInitializer;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.hms.hatool.HmsHiAnalyticsUtils;
import com.igexin.assist.sdk.AssistPushConsts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: HiAnalyticsLogExecutor.java */
/* JADX INFO: loaded from: classes7.dex */
public class a4 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile a4 f61521h = new a4();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String[] f61522i = {"AD", "AL", "AN", "AT", "AU", "AX", "BA", "BE", "BG", "BQ", "CA", "CH", "CW", "CY", "CZ", "DE", "DK", "EE", "ES", "FI", "FO", "FR", "GB", "GG", "GI", "GL", "GR", "HR", "HU", "IE", "IL", "IM", "IS", "IT", "JE", "LI", "LT", "LU", "LV", "MC", "MD", "ME", "MF", "MK", "MT", "NL", "NO", "NZ", "PL", "PM", AssistPushConsts.MSG_VALUE_PAYLOAD, "RO", "RS", "SE", "SI", "SJ", "SK", "SM", "SX", "TR", "UA", "UM", "US", "VA", "VC", "XK", "YK"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f61525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile long f61526d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Timer f61523a = new Timer();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f61524b = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f61527e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lock f61528f = new ReentrantLock();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<b> f61529g = new ArrayList(5);

    /* JADX INFO: compiled from: HiAnalyticsLogExecutor.java */
    public class a extends Thread {
        a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            a4.this.d();
        }
    }

    /* JADX INFO: compiled from: HiAnalyticsLogExecutor.java */
    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f61531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private LinkedHashMap<String, String> f61532b;

        private b(String str, LinkedHashMap<String, String> linkedHashMap) {
            this.f61531a = str;
            this.f61532b = linkedHashMap;
        }

        /* synthetic */ b(a4 a4Var, String str, LinkedHashMap linkedHashMap, a aVar) {
            this(str, linkedHashMap);
        }
    }

    /* JADX INFO: compiled from: HiAnalyticsLogExecutor.java */
    public class c extends TimerTask {
        private c() {
        }

        /* synthetic */ c(a4 a4Var, a aVar) {
            this();
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                a4.this.f61524b = true;
                HmsHiAnalyticsUtils.onReport();
            } catch (Exception e10) {
                o4.b("ScanHiAnalytics", e10.getMessage());
            }
        }
    }

    private a4() {
    }

    private String a(Context context) {
        try {
            GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
            String strA = new a1(context, false).a();
            Log.i("ScanHiAnalytics", "getCollectURL:localCountryCode " + strA);
            if (strA != null && !strA.isEmpty() && !"UNKNOWN".equals(strA)) {
                grsBaseInfo.setSerCountry(strA.toUpperCase(Locale.ENGLISH));
            }
            if (Arrays.asList(f61522i).contains(strA)) {
                this.f61527e = true;
            }
            GrsClient grsClient = new GrsClient(context, grsBaseInfo);
            String strSynGetGrsUrl = grsClient.synGetGrsUrl("com.huawei.cloud.mlkithianalytics", "ROOTNEW");
            if (TextUtils.isEmpty(strSynGetGrsUrl)) {
                strSynGetGrsUrl = grsClient.synGetGrsUrl("com.huawei.cloud.mlkithianalytics", "ROOT");
            }
            Log.i("ScanHiAnalytics", "grs get url success: " + strSynGetGrsUrl + "  countryCode = " + grsBaseInfo.getSerCountry());
            return strSynGetGrsUrl;
        } catch (RuntimeException | Exception unused) {
            return null;
        }
    }

    private synchronized void a() {
        this.f61525c = true;
        for (b bVar : this.f61529g) {
            c(bVar.f61531a, bVar.f61532b);
        }
        this.f61529g = null;
    }

    private synchronized void a(String str, LinkedHashMap<String, String> linkedHashMap) {
        if (this.f61525c) {
            c(str, linkedHashMap);
        } else {
            if (this.f61529g.size() >= 100) {
                return;
            }
            this.f61529g.add(new b(this, str, linkedHashMap, null));
        }
    }

    public static a4 b() {
        return f61521h;
    }

    private void c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f61526d > 6000) {
            this.f61526d = jCurrentTimeMillis;
            new a("ScanHiAnalytics").start();
        }
    }

    private void c(String str, LinkedHashMap<String, String> linkedHashMap) {
        if (!this.f61527e) {
            HmsHiAnalyticsUtils.onEvent(0, str, linkedHashMap);
            HmsHiAnalyticsUtils.onEvent(1, str, linkedHashMap);
        }
        if (this.f61524b) {
            this.f61524b = false;
            this.f61523a.schedule(new c(this, null), 3000L);
        }
        o4.d("ScanHiAnalytics", str + " " + linkedHashMap.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (!this.f61528f.tryLock() || this.f61525c) {
            return;
        }
        try {
            Context context = DynamicModuleInitializer.getContext();
            if (context == null) {
                return;
            }
            String strA = a(context);
            if (strA != null && !strA.isEmpty()) {
                HmsHiAnalyticsUtils.init(context, false, false, false, strA, context.getPackageName());
                HmsHiAnalyticsUtils.enableLog();
                a();
            }
        } finally {
            this.f61528f.unlock();
        }
    }

    public void b(String str, LinkedHashMap<String, String> linkedHashMap) {
        if (this.f61525c) {
            c(str, linkedHashMap);
        } else {
            a(str, linkedHashMap);
            c();
        }
    }
}
