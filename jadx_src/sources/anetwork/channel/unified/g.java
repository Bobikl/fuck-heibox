package anetwork.channel.unified;

import android.text.TextUtils;
import anet.channel.Config;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.NoAvailStrategyException;
import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.bytes.ByteArray;
import anet.channel.entity.ENV;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.statist.RequestStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.cache.Cache;
import anetwork.channel.http.NetworkSdkSetting;
import com.google.android.exoplayer2.source.rtsp.q;
import com.tencent.open.utils.HttpUtils;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class g implements anetwork.channel.unified.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f30304o = "anet.NetworkTask";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f30305p = 131072;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    l f30306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Cache f30307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Cache.Entry f30308d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f30310f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    volatile AtomicBoolean f30313i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ByteArrayOutputStream f30309e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    volatile Cancelable f30311g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    volatile boolean f30312h = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f30314j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f30315k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f30316l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f30317m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    a f30318n = null;

    /* JADX INFO: compiled from: Taobao */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Map<String, List<String>> f30320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        List<ByteArray> f30321c = new ArrayList();

        a(int i10, Map<String, List<String>> map) {
            this.f30319a = i10;
            this.f30320b = map;
        }

        int a(v3.a aVar, int i10) {
            aVar.onResponseCode(this.f30319a, this.f30320b);
            Iterator<ByteArray> it = this.f30321c.iterator();
            int i11 = 1;
            while (it.hasNext()) {
                aVar.a(i11, i10, it.next());
                i11++;
            }
            return i11;
        }

        void b() {
            Iterator<ByteArray> it = this.f30321c.iterator();
            while (it.hasNext()) {
                it.next().recycle();
            }
        }
    }

    g(l lVar, Cache cache, Cache.Entry entry) {
        this.f30307c = null;
        this.f30308d = null;
        this.f30310f = "other";
        this.f30313i = null;
        this.f30306b = lVar;
        this.f30313i = lVar.f30342d;
        this.f30307c = cache;
        this.f30308d = entry;
        this.f30310f = lVar.f30339a.m().get(HttpConstant.F_REFER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Session a(Session session, SessionCenter sessionCenter, HttpUrl httpUrl, boolean z10) {
        anetwork.channel.entity.k kVar = this.f30306b.f30339a;
        RequestStatistic requestStatistic = kVar.f30244f;
        if (session == null && kVar.j() && !z10 && !NetworkStatusHelper.isProxy()) {
            session = sessionCenter.get(httpUrl, anet.channel.entity.c.f29701b, 0L);
        }
        if (session == null) {
            ALog.i(f30304o, "create HttpSession with local DNS", this.f30306b.f30341c, new Object[0]);
            session = new anet.channel.session.d(GlobalAppRuntimeInfo.getContext(), new anet.channel.entity.a(StringUtils.concatString(httpUrl.scheme(), HttpConstant.SCHEME_SPLIT, httpUrl.host()), this.f30306b.f30341c, null));
        }
        if (requestStatistic.spdyRequestSend) {
            requestStatistic.degraded = 1;
        }
        ALog.i(f30304o, "tryGetHttpSession", this.f30306b.f30341c, q.f48929z, session);
        return session;
    }

    private SessionCenter c() {
        String strB = this.f30306b.f30339a.b(w3.a.f140965a);
        if (TextUtils.isEmpty(strB)) {
            return SessionCenter.getInstance();
        }
        ENV env = ENV.ONLINE;
        String strB2 = this.f30306b.f30339a.b(w3.a.f140966b);
        if ("pre".equalsIgnoreCase(strB2)) {
            env = ENV.PREPARE;
        } else if ("test".equalsIgnoreCase(strB2)) {
            env = ENV.TEST;
        }
        if (env != NetworkSdkSetting.f30251c) {
            NetworkSdkSetting.f30251c = env;
            SessionCenter.switchEnvironment(env);
        }
        Config config = Config.getConfig(strB, env);
        if (config == null) {
            config = new Config.Builder().setAppkey(strB).setEnv(env).setAuthCode(this.f30306b.f30339a.b(w3.a.f140967c)).build();
        }
        return SessionCenter.getInstance(config);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003c  */
    private Request d(Request request) {
        Request.Builder builderNewBuilder;
        if (this.f30306b.f30339a.n()) {
            String strJ = anetwork.channel.cookie.a.j(this.f30306b.f30339a.l());
            if (TextUtils.isEmpty(strJ)) {
                builderNewBuilder = null;
            } else {
                builderNewBuilder = request.newBuilder();
                String str = request.getHeaders().get("Cookie");
                if (!TextUtils.isEmpty(str)) {
                    strJ = StringUtils.concatString(str, "; ", strJ);
                }
                builderNewBuilder.addHeader("Cookie", strJ);
            }
        } else {
            builderNewBuilder = null;
        }
        if (this.f30308d != null) {
            if (builderNewBuilder == null) {
                builderNewBuilder = request.newBuilder();
            }
            String str2 = this.f30308d.f30150c;
            if (str2 != null) {
                builderNewBuilder.addHeader("If-None-Match", str2);
            }
            long j10 = this.f30308d.f30152e;
            if (j10 > 0) {
                builderNewBuilder.addHeader("If-Modified-Since", anetwork.channel.cache.c.c(j10));
            }
        }
        if (this.f30306b.f30339a.f30243e == 0 && "weex".equalsIgnoreCase(this.f30310f)) {
            if (builderNewBuilder == null) {
                builderNewBuilder = request.newBuilder();
            }
            builderNewBuilder.setReadTimeout(3000);
        }
        return builderNewBuilder == null ? request : builderNewBuilder.build();
    }

    private HttpUrl e(HttpUrl httpUrl) {
        HttpUrl httpUrl2;
        String str = this.f30306b.f30339a.m().get(HttpConstant.X_HOST_CNAME);
        return (TextUtils.isEmpty(str) || (httpUrl2 = HttpUrl.parse(httpUrl.urlString().replaceFirst(httpUrl.host(), str))) == null) ? httpUrl : httpUrl2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Session session, Request request) {
        if (session == null || this.f30312h) {
            return;
        }
        Request requestD = d(request);
        RequestStatistic requestStatistic = this.f30306b.f30339a.f30244f;
        requestStatistic.reqStart = System.currentTimeMillis();
        this.f30311g = session.request(requestD, new k(this, requestD, requestStatistic));
    }

    private Session h() {
        Session throwsException;
        SessionCenter sessionCenterC = c();
        HttpUrl httpUrlK = this.f30306b.f30339a.k();
        boolean zContainsNonDefaultPort = httpUrlK.containsNonDefaultPort();
        anetwork.channel.entity.k kVar = this.f30306b.f30339a;
        RequestStatistic requestStatistic = kVar.f30244f;
        if (kVar.f30248j != 1 || !t3.b.u() || this.f30306b.f30339a.f30243e != 0 || zContainsNonDefaultPort) {
            return a(null, sessionCenterC, httpUrlK, zContainsNonDefaultPort);
        }
        HttpUrl httpUrlE = e(httpUrlK);
        try {
            throwsException = sessionCenterC.getThrowsException(httpUrlE, anet.channel.entity.c.f29700a, 0L);
        } catch (NoAvailStrategyException unused) {
            return a(null, sessionCenterC, httpUrlK, zContainsNonDefaultPort);
        } catch (Exception unused2) {
            throwsException = null;
        }
        if (throwsException == null) {
            ThreadPoolExecutorFactory.submitPriorityTask(new i(this, sessionCenterC, httpUrlE, requestStatistic, httpUrlK, zContainsNonDefaultPort), ThreadPoolExecutorFactory.Priority.NORMAL);
            return null;
        }
        ALog.i(f30304o, "tryGetSession", this.f30306b.f30341c, q.f48929z, throwsException);
        requestStatistic.spdyRequestSend = true;
        return throwsException;
    }

    private void i() {
        SessionCenter sessionCenterC = c();
        HttpUrl httpUrlK = this.f30306b.f30339a.k();
        boolean zContainsNonDefaultPort = httpUrlK.containsNonDefaultPort();
        anetwork.channel.entity.k kVar = this.f30306b.f30339a;
        RequestStatistic requestStatistic = kVar.f30244f;
        Request requestA = kVar.a();
        if (this.f30306b.f30339a.f30248j != 1 || !t3.b.u() || this.f30306b.f30339a.f30243e != 0 || zContainsNonDefaultPort) {
            f(a(null, sessionCenterC, httpUrlK, zContainsNonDefaultPort), requestA);
            return;
        }
        sessionCenterC.asyncGet(e(httpUrlK), anet.channel.entity.c.f29700a, 3000L, new j(this, requestStatistic, System.currentTimeMillis(), requestA, sessionCenterC, httpUrlK, zContainsNonDefaultPort));
    }

    @Override // anet.channel.request.Cancelable
    public void cancel() {
        this.f30312h = true;
        if (this.f30311g != null) {
            this.f30311g.cancel();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f30312h) {
            return;
        }
        RequestStatistic requestStatistic = this.f30306b.f30339a.f30244f;
        requestStatistic.f_refer = this.f30310f;
        if (!NetworkStatusHelper.isConnected()) {
            if (t3.b.q() && requestStatistic.statusCode != -200) {
                requestStatistic.statusCode = -200;
                ThreadPoolExecutorFactory.submitScheduledTask(new h(this), 1000L, TimeUnit.MILLISECONDS);
                return;
            }
            if (ALog.isPrintLog(2)) {
                ALog.i(f30304o, HttpUtils.NetworkUnavailableException.ERROR_INFO, this.f30306b.f30341c, "NetworkStatus", NetworkStatusHelper.getStatus());
            }
            this.f30313i.set(true);
            this.f30306b.a();
            requestStatistic.isDone.set(true);
            requestStatistic.statusCode = -200;
            requestStatistic.msg = ErrorConstant.getErrMsg(-200);
            requestStatistic.rspEnd = System.currentTimeMillis();
            this.f30306b.f30340b.b(new DefaultFinishEvent(-200, (String) null, this.f30306b.f30339a.a()));
            return;
        }
        if (!t3.b.h() || !GlobalAppRuntimeInfo.isAppBackground() || AppLifecycle.lastEnterBackgroundTime <= 0 || AppLifecycle.isGoingForeground || System.currentTimeMillis() - AppLifecycle.lastEnterBackgroundTime <= t3.b.b() || t3.b.w(this.f30306b.f30339a.k()) || t3.b.j(this.f30306b.f30339a.a().getBizId()) || this.f30306b.f30339a.a().isAllowRequestInBg()) {
            if (ALog.isPrintLog(2)) {
                l lVar = this.f30306b;
                ALog.i(f30304o, "exec request", lVar.f30341c, "retryTimes", Integer.valueOf(lVar.f30339a.f30243e));
            }
            if (t3.b.m()) {
                i();
                return;
            }
            try {
                Session sessionH = h();
                if (sessionH == null) {
                    return;
                }
                f(sessionH, this.f30306b.f30339a.a());
                return;
            } catch (Exception e10) {
                ALog.e(f30304o, "send request failed.", this.f30306b.f30341c, e10, new Object[0]);
                return;
            }
        }
        this.f30313i.set(true);
        this.f30306b.a();
        if (ALog.isPrintLog(2)) {
            l lVar2 = this.f30306b;
            ALog.i(f30304o, "request forbidden in background", lVar2.f30341c, "url", lVar2.f30339a.k());
        }
        requestStatistic.isDone.set(true);
        requestStatistic.statusCode = -205;
        requestStatistic.msg = ErrorConstant.getErrMsg(-205);
        requestStatistic.rspEnd = System.currentTimeMillis();
        this.f30306b.f30340b.b(new DefaultFinishEvent(-205, (String) null, this.f30306b.f30339a.a()));
        ExceptionStatistic exceptionStatistic = new ExceptionStatistic(-205, null, "rt");
        exceptionStatistic.host = this.f30306b.f30339a.k().host();
        exceptionStatistic.url = this.f30306b.f30339a.l();
        AppMonitor.getInstance().commitStat(exceptionStatistic);
    }
}
