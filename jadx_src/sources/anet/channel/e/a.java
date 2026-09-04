package anet.channel.e;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.IStrategyFilter;
import anet.channel.strategy.IStrategyListener;
import anet.channel.strategy.StrategyCenter;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f29674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f29675b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static SharedPreferences f29679f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static AtomicBoolean f29676c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static AtomicBoolean f29677d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f29678e = 21600000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static IStrategyFilter f29680g = new anet.channel.e.b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static AtomicInteger f29681h = new AtomicInteger(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static IStrategyListener f29682i = new c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static NetworkStatusHelper.INetworkStatusChangeListener f29683j = new d();

    /* JADX INFO: renamed from: anet.channel.e.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Taobao */
    public static class C0241a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f29684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f29685b;

        private C0241a() {
        }

        /* synthetic */ C0241a(anet.channel.e.b bVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: Taobao */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map<String, C0241a> f29686a = new ConcurrentHashMap();

        b() {
            a();
        }

        private void a() {
            anet.channel.e.b bVar = null;
            String string = a.f29679f.getString("networksdk_http3_history_records", null);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.get(i10);
                    C0241a c0241a = new C0241a(bVar);
                    String string2 = jSONObject.getString("networkUniqueId");
                    c0241a.f29684a = jSONObject.getLong("time");
                    c0241a.f29685b = jSONObject.getBoolean("enable");
                    if (a(c0241a.f29684a)) {
                        synchronized (this.f29686a) {
                            try {
                                this.f29686a.put(string2, c0241a);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }

        private boolean a(long j10) {
            return System.currentTimeMillis() - j10 < a.f29678e;
        }

        void a(String str, boolean z10) {
            C0241a c0241a = new C0241a(null);
            c0241a.f29685b = z10;
            c0241a.f29684a = System.currentTimeMillis();
            JSONArray jSONArray = new JSONArray();
            synchronized (this.f29686a) {
                this.f29686a.put(str, c0241a);
                for (Map.Entry<String, C0241a> entry : this.f29686a.entrySet()) {
                    String key = entry.getKey();
                    C0241a value = entry.getValue();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("networkUniqueId", key);
                        jSONObject.put("time", value.f29684a);
                        jSONObject.put("enable", value.f29685b);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                }
            }
            a.f29679f.edit().putString("networksdk_http3_history_records", jSONArray.toString()).apply();
        }

        boolean a(String str) {
            synchronized (this.f29686a) {
                C0241a c0241a = this.f29686a.get(str);
                boolean z10 = true;
                if (c0241a == null) {
                    return true;
                }
                if (a(c0241a.f29684a)) {
                    z10 = false;
                }
                return z10;
            }
        }

        boolean b(String str) {
            synchronized (this.f29686a) {
                C0241a c0241a = this.f29686a.get(str);
                if (c0241a == null) {
                    return false;
                }
                return c0241a.f29685b;
            }
        }
    }

    public static void a() {
        try {
            ALog.e("awcn.Http3ConnDetector", "registerListener", null, "http3Enable", Boolean.valueOf(AwcnConfig.isHttp3Enable()));
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext());
            f29679f = defaultSharedPreferences;
            f29675b = defaultSharedPreferences.getString("http3_detector_host", "");
            a(NetworkStatusHelper.getStatus());
            NetworkStatusHelper.addStatusChangeListener(f29683j);
            StrategyCenter.getInstance().registerListener(f29682i);
        } catch (Exception e10) {
            ALog.e("awcn.Http3ConnDetector", "[registerListener]error", null, e10, new Object[0]);
        }
    }

    public static void a(long j10) {
        if (j10 < 0) {
            return;
        }
        f29678e = j10;
    }

    public static void a(NetworkStatusHelper.NetworkStatus networkStatus) {
        if (!AwcnConfig.isHttp3Enable()) {
            ALog.i("awcn.Http3ConnDetector", "startDetect", null, "http3 global config close.");
            return;
        }
        if (f29677d.get()) {
            ALog.e("awcn.Http3ConnDetector", "tnet exception.", null, new Object[0]);
            return;
        }
        if (NetworkStatusHelper.isConnected()) {
            if (TextUtils.isEmpty(f29675b)) {
                ALog.e("awcn.Http3ConnDetector", "startDetect", null, "host is null");
                return;
            }
            List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(f29675b, f29680g);
            if (connStrategyListByHost.isEmpty()) {
                ALog.e("awcn.Http3ConnDetector", "startDetect", null, "http3 strategy is null.");
                return;
            }
            if (f29676c.compareAndSet(false, true)) {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    SpdyAgent.getInstance(GlobalAppRuntimeInfo.getContext(), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION).InitializeSecurityStuff();
                    ALog.e("awcn.Http3ConnDetector", "tnet init http3.", null, "cost", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                } catch (Throwable th2) {
                    ALog.e("awcn.Http3ConnDetector", "tnet init http3 error.", null, th2, new Object[0]);
                    f29677d.set(true);
                    return;
                }
            }
            if (f29674a == null) {
                f29674a = new b();
            }
            if (f29674a.a(NetworkStatusHelper.getUniqueId(networkStatus))) {
                ThreadPoolExecutorFactory.submitDetectTask(new e(connStrategyListByHost, networkStatus));
            }
        }
    }

    public static void a(boolean z10) {
        b bVar = f29674a;
        if (bVar != null) {
            bVar.a(NetworkStatusHelper.getUniqueId(NetworkStatusHelper.getStatus()), z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IConnStrategy b(IConnStrategy iConnStrategy) {
        return new g(iConnStrategy);
    }

    public static boolean b() {
        b bVar = f29674a;
        if (bVar != null) {
            return bVar.b(NetworkStatusHelper.getUniqueId(NetworkStatusHelper.getStatus()));
        }
        return false;
    }
}
