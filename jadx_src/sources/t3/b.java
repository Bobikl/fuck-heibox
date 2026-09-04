package t3;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.statist.RequestStatistic;
import anet.channel.strategy.dispatch.HttpDispatcher;
import anet.channel.strategy.utils.c;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;
import anetwork.channel.http.NetworkSdkSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f140641a = "SERVICE_OPTIMIZE";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f140642b = "SESSION_ASYNC_OPTIMIZE";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile boolean f140643c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile boolean f140644d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile boolean f140645e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile int f140646f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile boolean f140647g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile boolean f140648h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile boolean f140649i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile long f140650j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static volatile boolean f140651k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static volatile ConcurrentHashMap<String, List<String>> f140652l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static volatile CopyOnWriteArrayList<String> f140653m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final List<String> f140654n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static volatile int f140655o = 10000;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static volatile boolean f140656p = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static volatile boolean f140657q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static volatile int f140658r = 60000;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static volatile CopyOnWriteArrayList<String> f140659s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static volatile ConcurrentHashMap<String, List<String>> f140660t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static volatile boolean f140661u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static volatile boolean f140662v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static volatile boolean f140663w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static volatile boolean f140664x = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static volatile boolean f140665y = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static volatile a f140666z;

    public static void A(int i10) {
        f140658r = i10;
    }

    public static void B(boolean z10) {
        f140651k = z10;
    }

    public static void C(boolean z10) {
        f140662v = z10;
    }

    public static void D(long j10) {
        if (j10 != f140650j) {
            ALog.i("anet.NetworkConfigCenter", "set cache flag", null, "old", Long.valueOf(f140650j), "new", Long.valueOf(j10));
            f140650j = j10;
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.a()).edit();
            editorEdit.putLong("Cache.Flag", f140650j);
            editorEdit.apply();
            anetwork.channel.cache.a.b();
        }
    }

    public static void E(boolean z10) {
        f140663w = z10;
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.a()).edit();
        editorEdit.putBoolean("CHANNEL_LOCAL_INSTANCE_ENABLE", f140663w);
        editorEdit.apply();
    }

    public static void F(boolean z10) {
        f140665y = z10;
    }

    public static void G(String str) {
        if (ALog.isPrintLog(2)) {
            ALog.i("anet.NetworkConfigCenter", "setDegradeRequestList", null, "Degrade List", str);
        }
        if (TextUtils.isEmpty(str)) {
            f140660t = null;
            return;
        }
        ConcurrentHashMap<String, List<String>> concurrentHashMap = new ConcurrentHashMap<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                try {
                    if (androidx.webkit.b.f28327e.equals(obj)) {
                        concurrentHashMap.put(next, f140654n);
                    } else if (obj instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) obj;
                        int length = jSONArray.length();
                        ArrayList arrayList = new ArrayList(length);
                        for (int i10 = 0; i10 < length; i10++) {
                            Object obj2 = jSONArray.get(i10);
                            if (obj2 instanceof String) {
                                arrayList.add((String) obj2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            concurrentHashMap.put(next, arrayList);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
        } catch (JSONException e10) {
            ALog.e("anet.NetworkConfigCenter", "parse jsonObject failed", null, e10, new Object[0]);
        }
        f140660t = concurrentHashMap;
    }

    public static void H(boolean z10) {
        f140657q = z10;
    }

    public static void I(boolean z10) {
        f140648h = z10;
    }

    public static void J(boolean z10) {
        f140647g = z10;
    }

    @Deprecated
    public static void K(boolean z10) {
    }

    public static void L(String str) {
        if (TextUtils.isEmpty(str)) {
            f140659s = null;
        }
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("host");
            int length = jSONArray.length();
            CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            for (int i10 = 0; i10 < length; i10++) {
                String string = jSONArray.getString(i10);
                if (c.c(string)) {
                    copyOnWriteArrayList.add(string);
                }
            }
            f140659s = copyOnWriteArrayList;
        } catch (JSONException e10) {
            ALog.e("anet.NetworkConfigCenter", "parse hosts failed", null, e10, new Object[0]);
        }
    }

    public static void M(a aVar) {
        if (f140666z != null) {
            f140666z.unRegister();
        }
        if (aVar != null) {
            aVar.register();
        }
        f140666z = aVar;
    }

    public static void N(boolean z10) {
        f140645e = z10;
    }

    public static void O(boolean z10) {
        f140661u = z10;
    }

    public static void P(int i10) {
        f140655o = i10;
    }

    public static void Q(boolean z10) {
        f140656p = z10;
    }

    public static void R(boolean z10) {
        ALog.i("anet.NetworkConfigCenter", "[setSSLEnabled]", null, "enable", Boolean.valueOf(z10));
        f140643c = z10;
    }

    public static void S(int i10) {
        f140646f = i10;
    }

    public static void T(boolean z10) {
        ALog.i("anet.NetworkConfigCenter", "[setSpdyEnabled]", null, "enable", Boolean.valueOf(z10));
        f140644d = z10;
    }

    public static void U(String str) {
        if (ALog.isPrintLog(2)) {
            ALog.i("anet.NetworkConfigCenter", "updateRequestWhiteList", null, "White List", str);
        }
        if (TextUtils.isEmpty(str)) {
            f140653m = null;
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            for (int i10 = 0; i10 < length; i10++) {
                String string = jSONArray.getString(i10);
                if (!string.isEmpty()) {
                    copyOnWriteArrayList.add(string);
                }
            }
            f140653m = copyOnWriteArrayList;
        } catch (JSONException e10) {
            ALog.e("anet.NetworkConfigCenter", "parse bizId failed", null, e10, new Object[0]);
        }
    }

    public static void V(String str) {
        if (ALog.isPrintLog(2)) {
            ALog.i("anet.NetworkConfigCenter", "updateWhiteUrlList", null, "White List", str);
        }
        if (TextUtils.isEmpty(str)) {
            f140652l = null;
            return;
        }
        ConcurrentHashMap<String, List<String>> concurrentHashMap = new ConcurrentHashMap<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                try {
                    if (androidx.webkit.b.f28327e.equals(obj)) {
                        concurrentHashMap.put(next, f140654n);
                    } else if (obj instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) obj;
                        int length = jSONArray.length();
                        ArrayList arrayList = new ArrayList(length);
                        for (int i10 = 0; i10 < length; i10++) {
                            Object obj2 = jSONArray.get(i10);
                            if (obj2 instanceof String) {
                                arrayList.add((String) obj2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            concurrentHashMap.put(next, arrayList);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
        } catch (JSONException e10) {
            ALog.e("anet.NetworkConfigCenter", "parse jsonObject failed", null, e10, new Object[0]);
        }
        f140652l = concurrentHashMap;
    }

    public static void a(boolean z10) {
        if (!z10) {
            H(false);
            ThreadPoolExecutorFactory.setNormalExecutorPoolSize(6);
        } else {
            H(true);
            ThreadPoolExecutorFactory.setNormalExecutorPoolSize(16);
            AwcnConfig.registerPresetSessions("[{\"host\":\"trade-acs.m.taobao.com\", \"protocol\":\"http2\", \"rtt\":\"0rtt\", \"publicKey\": \"acs\", \"isKeepAlive\":true}]");
        }
    }

    public static int b() {
        return f140658r;
    }

    public static int c() {
        return f140655o;
    }

    public static int d() {
        return f140646f;
    }

    public static void e() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.a());
        f140650j = defaultSharedPreferences.getLong("Cache.Flag", 0L);
        f140663w = defaultSharedPreferences.getBoolean("CHANNEL_LOCAL_INSTANCE_ENABLE", false);
        f140664x = defaultSharedPreferences.getBoolean("ALLOW_SPDY_WHEN_BIND_SERVICE_FAILED", true);
    }

    public static boolean f() {
        return f140647g && f140649i;
    }

    public static boolean g() {
        return f140664x;
    }

    public static boolean h() {
        return f140651k;
    }

    public static boolean i() {
        return f140662v;
    }

    public static boolean j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        CopyOnWriteArrayList<String> copyOnWriteArrayList = f140653m;
        if (f140653m == null) {
            return false;
        }
        Iterator<String> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (str.equalsIgnoreCase(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean k() {
        return f140663w;
    }

    public static boolean l() {
        return f140665y;
    }

    public static boolean m() {
        return f140657q;
    }

    public static boolean n() {
        return f140648h;
    }

    public static boolean o() {
        return f140647g;
    }

    public static boolean p() {
        return f140645e;
    }

    public static boolean q() {
        return f140661u;
    }

    public static boolean r(RequestStatistic requestStatistic) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        if (requestStatistic == null || (copyOnWriteArrayList = f140659s) == null || TextUtils.isEmpty(requestStatistic.host)) {
            return false;
        }
        Iterator<String> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (requestStatistic.host.equalsIgnoreCase(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean s() {
        return f140656p;
    }

    public static boolean t() {
        return f140643c;
    }

    public static boolean u() {
        return f140644d;
    }

    public static boolean v(HttpUrl httpUrl) {
        ConcurrentHashMap<String, List<String>> concurrentHashMap;
        List<String> list;
        if (httpUrl == null || (concurrentHashMap = f140660t) == null || (list = concurrentHashMap.get(httpUrl.host())) == null) {
            return false;
        }
        if (list == f140654n) {
            return true;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (httpUrl.path().startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean w(HttpUrl httpUrl) {
        ConcurrentHashMap<String, List<String>> concurrentHashMap;
        List<String> list;
        if (httpUrl == null || (concurrentHashMap = f140652l) == null || (list = concurrentHashMap.get(httpUrl.host())) == null) {
            return false;
        }
        if (list == f140654n) {
            return true;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (httpUrl.path().startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static void x(boolean z10) {
        f140649i = z10;
    }

    public static void y(boolean z10) {
        f140664x = z10;
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.a()).edit();
        editorEdit.putBoolean("ALLOW_SPDY_WHEN_BIND_SERVICE_FAILED", f140664x);
        editorEdit.apply();
    }

    public static void z(String str) {
        if (GlobalAppRuntimeInfo.isTargetProcess()) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                ArrayList arrayList = new ArrayList(length);
                for (int i10 = 0; i10 < length; i10++) {
                    String string = jSONArray.getString(i10);
                    if (c.c(string)) {
                        arrayList.add(string);
                    }
                }
                HttpDispatcher.getInstance().addHosts(arrayList);
            } catch (JSONException e10) {
                ALog.e("anet.NetworkConfigCenter", "parse hosts failed", null, e10, new Object[0]);
            }
        }
    }
}
