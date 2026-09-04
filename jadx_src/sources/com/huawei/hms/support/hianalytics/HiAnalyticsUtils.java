package com.huawei.hms.support.hianalytics;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hianalytics.util.HiAnalyticTools;
import com.huawei.hms.hatool.HmsHiAnalyticsUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.AnalyticsSwitchHolder;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class HiAnalyticsUtils {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f62680c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f62681d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static HiAnalyticsUtils f62682e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f62683a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f62684b = com.huawei.hms.stats.c.a();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f62685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f62686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f62687c;

        a(Context context, String str, Map map) {
            this.f62685a = context;
            this.f62686b = str;
            this.f62687c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onEvent(this.f62685a, this.f62686b, this.f62687c);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f62689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f62690b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f62691c;

        b(Context context, String str, String str2) {
            this.f62689a = context;
            this.f62690b = str;
            this.f62691c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onEvent2(this.f62689a, this.f62690b, this.f62691c);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f62693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f62694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f62695c;

        c(Context context, String str, Map map) {
            this.f62693a = context;
            this.f62694b = str;
            this.f62695c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onNewEvent(this.f62693a, this.f62694b, this.f62695c);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f62697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f62698b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f62699c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f62700d;

        d(Context context, String str, Map map, int i10) {
            this.f62697a = context;
            this.f62698b = str;
            this.f62699c = map;
            this.f62700d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onNewEvent(this.f62697a, this.f62698b, this.f62699c, this.f62700d);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f62702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f62703b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f62704c;

        e(Context context, String str, Map map) {
            this.f62702a = context;
            this.f62703b = str;
            this.f62704c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onReport(this.f62702a, this.f62703b, this.f62704c);
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f62706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f62707b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f62708c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f62709d;

        f(Context context, String str, Map map, int i10) {
            this.f62706a = context;
            this.f62707b = str;
            this.f62708c = map;
            this.f62709d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onReport(this.f62706a, this.f62707b, this.f62708c, this.f62709d);
        }
    }

    private HiAnalyticsUtils() {
    }

    private int a(Context context) {
        int i10 = 0;
        try {
            i10 = Settings.Secure.getInt(context.getContentResolver(), "hw_app_analytics_state");
            HMSLog.i("HiAnalyticsUtils", "getOobeStateForSettings value is " + i10);
            return i10;
        } catch (Settings.SettingNotFoundException e10) {
            HMSLog.i("HiAnalyticsUtils", "Settings.SettingNotFoundException " + e10.getMessage());
            return i10;
        }
    }

    private static LinkedHashMap<String, String> a(Map<String, String> map) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    private void a(Context context, String str, String str2) {
        try {
            com.huawei.hms.stats.a.c().a(new b(context.getApplicationContext(), str, str2));
        } catch (Throwable th2) {
            HMSLog.e("HiAnalyticsUtils", "<addOnEvent2ToCache> Failed. " + th2.getMessage());
        }
    }

    private void a(Context context, String str, Map<String, String> map) {
        try {
            com.huawei.hms.stats.a.c().a(new a(context.getApplicationContext(), str, map));
        } catch (Throwable th2) {
            HMSLog.e("HiAnalyticsUtils", "<addOnEventToCache> failed. " + th2.getMessage());
        }
    }

    private void a(Context context, String str, Map map, int i10) {
        try {
            com.huawei.hms.stats.a.c().a(new d(context.getApplicationContext(), str, map, i10));
        } catch (Throwable th2) {
            HMSLog.e("HiAnalyticsUtils", "<addOnNewEventToCache with type> failed. " + th2.getMessage());
        }
    }

    private boolean a(String str) {
        if (str == null) {
            return false;
        }
        try {
            return str.getBytes(Charset.forName("UTF-8")).length <= 512;
        } catch (Throwable th2) {
            HMSLog.e("HiAnalyticsUtils", "<isValidSize String> Exception: " + th2.getMessage());
            return false;
        }
    }

    private boolean a(boolean z10, boolean z11, Map<?, ?> map) {
        return !z10 && z11 && b(map);
    }

    private void b(Context context) {
        synchronized (f62681d) {
            int i10 = this.f62683a;
            if (i10 < 60) {
                this.f62683a = i10 + 1;
            } else {
                this.f62683a = 0;
                if (this.f62684b) {
                    com.huawei.hms.stats.b.a(context, 0);
                    com.huawei.hms.stats.b.a(context, 1);
                } else {
                    HmsHiAnalyticsUtils.onReport();
                }
            }
        }
    }

    private void b(Context context, String str, Map map) {
        try {
            com.huawei.hms.stats.a.c().a(new c(context.getApplicationContext(), str, map));
        } catch (Throwable th2) {
            HMSLog.e("HiAnalyticsUtils", "<addOnNewEventToCache> failed. " + th2.getMessage());
        }
    }

    private void b(Context context, String str, Map map, int i10) {
        try {
            com.huawei.hms.stats.a.c().a(new f(context.getApplicationContext(), str, map, i10));
        } catch (Throwable th2) {
            HMSLog.e("HiAnalyticsUtils", "<addOnReportToCache with type> failed. " + th2.getMessage());
        }
    }

    private boolean b(Map<?, ?> map) {
        try {
            long length = 0;
            for (Object obj : map.values()) {
                if (obj instanceof String) {
                    length += (long) ((String) obj).getBytes(Charset.forName("UTF-8")).length;
                }
            }
            return length <= 512;
        } catch (Throwable th2) {
            HMSLog.e("HiAnalyticsUtils", "<isValidSize map> Exception: " + th2.getMessage());
            return false;
        }
    }

    private void c(Context context, String str, Map map) {
        try {
            com.huawei.hms.stats.a.c().a(new e(context.getApplicationContext(), str, map));
        } catch (Throwable th2) {
            HMSLog.e("HiAnalyticsUtils", "<addOnReportToCache> failed. " + th2.getMessage());
        }
    }

    public static HiAnalyticsUtils getInstance() {
        HiAnalyticsUtils hiAnalyticsUtils;
        synchronized (f62680c) {
            if (f62682e == null) {
                f62682e = new HiAnalyticsUtils();
            }
            hiAnalyticsUtils = f62682e;
        }
        return hiAnalyticsUtils;
    }

    public static String versionCodeToName(String str) {
        if (!TextUtils.isEmpty(str) && (str.length() == 8 || str.length() == 9)) {
            try {
                Integer.parseInt(str);
                return Integer.parseInt(str.substring(0, str.length() - 7)) + "." + Integer.parseInt(str.substring(str.length() - 7, str.length() - 5)) + "." + Integer.parseInt(str.substring(str.length() - 5, str.length() - 3)) + "." + Integer.parseInt(str.substring(str.length() - 3));
            } catch (NumberFormatException unused) {
            }
        }
        return "";
    }

    public void enableLog() {
        HMSLog.i("HiAnalyticsUtils", "Enable Log");
        if (this.f62684b) {
            HMSLog.i("HiAnalyticsUtils", "cp needs to pass in the context, this method is not supported");
        } else {
            HmsHiAnalyticsUtils.enableLog();
        }
    }

    public void enableLog(Context context) {
        HMSLog.i("HiAnalyticsUtils", "Enable Log");
        if (this.f62684b) {
            HiAnalyticTools.enableLog(context);
        } else {
            HmsHiAnalyticsUtils.enableLog();
        }
    }

    public boolean getInitFlag() {
        return !this.f62684b ? HmsHiAnalyticsUtils.getInitFlag() : HiAnalyticsManager.getInitFlag(HiAnalyticsConstant.HA_SERVICE_TAG);
    }

    public int getOobeAnalyticsState(Context context) {
        if (context == null) {
            return 0;
        }
        int iA = a(context);
        if (iA == 1) {
            return iA;
        }
        Bundle bundle = new Bundle();
        bundle.putString("hms_cp_bundle_key", "content://com.huawei.hms.contentprovider/com.huawei.hms.privacy.HmsAnalyticsStateProvider");
        try {
            Bundle bundleCall = context.getApplicationContext().getContentResolver().call(Uri.parse("content://com.huawei.hms.contentprovider"), "getAnalyticsState", (String) null, bundle);
            if (bundleCall == null) {
                return iA;
            }
            iA = bundleCall.getInt("SWITCH_IS_CHECKED");
            HMSLog.i("HiAnalyticsUtils", "get hms analyticsOobe state " + iA);
            return iA;
        } catch (IllegalArgumentException unused) {
            HMSLog.i("HiAnalyticsUtils", "getOobeAnalyticsState IllegalArgumentException ");
            return iA;
        } catch (SecurityException unused2) {
            HMSLog.i("HiAnalyticsUtils", "getOobeAnalyticsState SecurityException ");
            return iA;
        } catch (Exception unused3) {
            HMSLog.i("HiAnalyticsUtils", "getOobeAnalyticsState Exception ");
            return iA;
        }
    }

    public boolean hasError(Context context) {
        return AnalyticsSwitchHolder.isAnalyticsDisabled(context);
    }

    public void onBuoyEvent(Context context, String str, String str2) {
        onEvent2(context, str, str2);
    }

    public void onEvent(Context context, String str, Map<String, String> map) {
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (map == null || map.isEmpty() || context == null) {
            HMSLog.e("HiAnalyticsUtils", "<onEvent> map or context is null, state: " + andRefreshAnalyticsState);
            return;
        }
        boolean initFlag = getInitFlag();
        if (a(initFlag, andRefreshAnalyticsState != 2, map)) {
            a(context, str, map);
        }
        if (andRefreshAnalyticsState == 1 && initFlag) {
            if (this.f62684b) {
                com.huawei.hms.stats.b.a(context, 0, str, a(map));
                com.huawei.hms.stats.b.a(context, 1, str, a(map));
            } else {
                HmsHiAnalyticsUtils.onEvent(0, str, a(map));
                HmsHiAnalyticsUtils.onEvent(1, str, a(map));
            }
            b(context);
        }
    }

    public void onEvent2(Context context, String str, String str2) {
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (context == null) {
            HMSLog.e("HiAnalyticsUtils", "<onEvent2> context is null, state: " + andRefreshAnalyticsState);
            return;
        }
        boolean initFlag = getInitFlag();
        if (!initFlag && andRefreshAnalyticsState != 2 && a(str2)) {
            a(context, str, str2);
        }
        if (andRefreshAnalyticsState == 1 && initFlag) {
            if (this.f62684b) {
                com.huawei.hms.stats.b.a(context, str, str2);
            } else {
                HmsHiAnalyticsUtils.onEvent(context, str, str2);
            }
        }
    }

    public void onNewEvent(Context context, String str, Map map) {
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (map == null || map.isEmpty() || context == null) {
            HMSLog.e("HiAnalyticsUtils", "<onNewEvent> map or context is null, state: " + andRefreshAnalyticsState);
            return;
        }
        boolean initFlag = getInitFlag();
        if (a(initFlag, andRefreshAnalyticsState != 2, (Map<?, ?>) map)) {
            b(context, str, map);
        }
        if (andRefreshAnalyticsState == 1 && initFlag) {
            if (this.f62684b) {
                com.huawei.hms.stats.b.a(context, 0, str, a((Map<String, String>) map));
                com.huawei.hms.stats.b.a(context, 1, str, a((Map<String, String>) map));
            } else {
                HmsHiAnalyticsUtils.onEvent(0, str, a((Map<String, String>) map));
                HmsHiAnalyticsUtils.onEvent(1, str, a((Map<String, String>) map));
            }
            b(context);
        }
    }

    public void onNewEvent(Context context, String str, Map map, int i10) {
        if (i10 != 0 && i10 != 1) {
            HMSLog.e("HiAnalyticsUtils", "<onNewEvent with type> Data reporting type is not supported");
            return;
        }
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (map == null || map.isEmpty() || context == null) {
            HMSLog.e("HiAnalyticsUtils", "<onNewEvent with type> map or context is null, state: " + andRefreshAnalyticsState);
            return;
        }
        boolean initFlag = getInitFlag();
        if (a(initFlag, andRefreshAnalyticsState != 2, (Map<?, ?>) map)) {
            a(context, str, map, i10);
        }
        if (andRefreshAnalyticsState == 1 && initFlag) {
            if (this.f62684b) {
                com.huawei.hms.stats.b.a(context, i10, str, a((Map<String, String>) map));
            } else {
                HmsHiAnalyticsUtils.onEvent(i10, str, a((Map<String, String>) map));
            }
            b(context);
        }
    }

    public void onReport(Context context, String str, Map map) {
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (map == null || map.isEmpty() || context == null) {
            HMSLog.e("HiAnalyticsUtils", "<onReport> map or context is null, state: " + andRefreshAnalyticsState);
            return;
        }
        boolean initFlag = getInitFlag();
        if (a(initFlag, andRefreshAnalyticsState != 2, (Map<?, ?>) map)) {
            c(context, str, map);
        }
        if (andRefreshAnalyticsState == 1 && initFlag) {
            if (this.f62684b) {
                com.huawei.hms.stats.b.b(context, 0, str, a((Map<String, String>) map));
                com.huawei.hms.stats.b.b(context, 1, str, a((Map<String, String>) map));
            } else {
                HmsHiAnalyticsUtils.onStreamEvent(0, str, a((Map<String, String>) map));
                HmsHiAnalyticsUtils.onStreamEvent(1, str, a((Map<String, String>) map));
            }
        }
    }

    public void onReport(Context context, String str, Map map, int i10) {
        if (i10 != 0 && i10 != 1) {
            HMSLog.e("HiAnalyticsUtils", "<onReport with type> Data reporting type is not supported");
            return;
        }
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (map == null || map.isEmpty() || context == null) {
            HMSLog.e("HiAnalyticsUtils", "<onReport with type> map or context is null, state: " + andRefreshAnalyticsState);
            return;
        }
        boolean initFlag = getInitFlag();
        if (a(initFlag, andRefreshAnalyticsState != 2, (Map<?, ?>) map)) {
            b(context, str, map, i10);
        }
        if (andRefreshAnalyticsState == 1 && initFlag) {
            if (this.f62684b) {
                com.huawei.hms.stats.b.b(context, i10, str, a((Map<String, String>) map));
            } else {
                HmsHiAnalyticsUtils.onStreamEvent(i10, str, a((Map<String, String>) map));
            }
        }
    }
}
