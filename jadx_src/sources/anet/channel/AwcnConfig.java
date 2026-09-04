package anet.channel;

import android.text.TextUtils;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.StrategyTemplate;
import anet.channel.util.ALog;
import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class AwcnConfig {
    public static final String HTTP3_ENABLE = "HTTP3_ENABLE";
    public static final String NEXT_LAUNCH_FORBID = "NEXT_LAUNCH_FORBID";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile boolean f29492a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f29493b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile boolean f29494c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile boolean f29495d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile boolean f29496e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile boolean f29497f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile long f29498g = 43200000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile boolean f29499h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile boolean f29500i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f29501j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static boolean f29502k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static volatile boolean f29503l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static volatile boolean f29504m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile boolean f29505n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static volatile int f29506o = 10000;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static volatile boolean f29507p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static volatile boolean f29508q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static volatile int f29509r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static volatile boolean f29510s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static volatile boolean f29511t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static volatile boolean f29512u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static volatile boolean f29513v = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static volatile CopyOnWriteArrayList<String> f29514w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static volatile boolean f29515x = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static volatile boolean f29516y = true;

    public static int getAccsReconnectionDelayPeriod() {
        return f29506o;
    }

    public static long getIpv6BlackListTtl() {
        return f29498g;
    }

    public static int getXquicCongControl() {
        return f29509r;
    }

    public static boolean isAccsSessionCreateForbiddenInBg() {
        return f29492a;
    }

    public static boolean isAllowHttpDnsNotify(String str) {
        if (f29514w == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return f29514w.contains(str);
    }

    public static boolean isAppLifeCycleListenerEnable() {
        return f29501j;
    }

    public static boolean isAsyncLoadStrategyEnable() {
        return f29502k;
    }

    public static boolean isCarrierInfoEnable() {
        return f29516y;
    }

    public static boolean isCookieHeaderRedundantFix() {
        return f29511t;
    }

    public static boolean isHorseRaceEnable() {
        return f29494c;
    }

    public static boolean isHttp3Enable() {
        return f29507p;
    }

    public static boolean isHttp3OrangeEnable() {
        return f29508q;
    }

    public static boolean isHttpsSniEnable() {
        return f29493b;
    }

    public static boolean isIdleSessionCloseEnable() {
        return f29497f;
    }

    public static boolean isIpStackDetectByUdpConnect() {
        return f29510s;
    }

    public static boolean isIpv6BlackListEnable() {
        return f29500i;
    }

    public static boolean isIpv6Enable() {
        return f29499h;
    }

    public static boolean isNetworkDetectEnable() {
        return f29505n;
    }

    public static boolean isPing6Enable() {
        return f29504m;
    }

    public static boolean isQuicEnable() {
        return f29496e;
    }

    public static boolean isSendConnectInfoByBroadcast() {
        return f29512u;
    }

    public static boolean isSendConnectInfoByService() {
        return f29513v;
    }

    public static boolean isTbNextLaunch() {
        return f29503l;
    }

    public static boolean isTnetHeaderCacheEnable() {
        return f29495d;
    }

    public static boolean isWifiInfoEnable() {
        return f29515x;
    }

    public static void registerPresetSessions(String str) {
        if (GlobalAppRuntimeInfo.isTargetProcess() && !TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    String string = jSONObject.getString("host");
                    if (!anet.channel.strategy.utils.c.c(string)) {
                        return;
                    }
                    StrategyTemplate.getInstance().registerConnProtocol(string, ConnProtocol.valueOf(jSONObject.getString(SwitchDetailActivity.P), jSONObject.getString("rtt"), jSONObject.getString("publicKey")));
                    if (jSONObject.getBoolean("isKeepAlive")) {
                        SessionCenter.getInstance().registerSessionInfo(SessionInfo.create(string, true, false, null, null, null));
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void setAccsReconnectionDelayPeriod(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        if (i10 > 10000) {
            i10 = 10000;
        }
        f29506o = i10;
    }

    public static void setAccsSessionCreateForbiddenInBg(boolean z10) {
        f29492a = z10;
    }

    public static void setAppLifeCycleListenerEnable(boolean z10) {
        f29501j = z10;
    }

    public static void setAsyncLoadStrategyEnable(boolean z10) {
        f29502k = z10;
    }

    public static void setCarrierInfoEnable(boolean z10) {
        f29516y = z10;
    }

    public static void setCookieHeaderRedundantFix(boolean z10) {
        f29511t = z10;
    }

    public static void setHorseRaceEnable(boolean z10) {
        f29494c = z10;
    }

    public static void setHttp3Enable(boolean z10) {
        f29507p = z10;
        ALog.e("awcn.AwcnConfig", "[setHttp3Enable]", null, "enable", Boolean.valueOf(z10));
    }

    public static void setHttp3OrangeEnable(boolean z10) {
        f29508q = z10;
    }

    public static void setHttpDnsNotifyWhiteList(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String string = jSONArray.getString(i10);
                if (!TextUtils.isEmpty(string)) {
                    copyOnWriteArrayList.add(string);
                }
            }
            f29514w = copyOnWriteArrayList;
        } catch (Exception e10) {
            ALog.e("awcn.AwcnConfig", "[setHttpDnsNotifyWhiteList] error", null, e10, new Object[0]);
        }
    }

    public static void setHttpsSniEnable(boolean z10) {
        f29493b = z10;
    }

    public static void setIdleSessionCloseEnable(boolean z10) {
        f29497f = z10;
    }

    public static void setIpStackDetectByUdpConnect(boolean z10) {
        f29510s = z10;
    }

    public static void setIpv6BlackListEnable(boolean z10) {
        f29500i = z10;
    }

    public static void setIpv6BlackListTtl(long j10) {
        f29498g = j10;
    }

    public static void setIpv6Enable(boolean z10) {
        f29499h = z10;
    }

    public static void setNetworkDetectEnable(boolean z10) {
        f29505n = z10;
    }

    public static void setPing6Enable(boolean z10) {
        f29504m = z10;
    }

    public static void setQuicEnable(boolean z10) {
        f29496e = z10;
    }

    public static void setSendConnectInfoByBroadcast(boolean z10) {
        f29512u = z10;
    }

    public static void setSendConnectInfoByService(boolean z10) {
        f29513v = z10;
    }

    public static void setTbNextLaunch(boolean z10) {
        f29503l = z10;
    }

    public static void setTnetHeaderCacheEnable(boolean z10) {
        f29495d = z10;
    }

    public static void setWifiInfoEnable(boolean z10) {
        f29515x = z10;
    }

    public static void setXquicCongControl(int i10) {
        if (i10 < 0) {
            return;
        }
        f29509r = i10;
    }
}
