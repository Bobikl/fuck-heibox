package anet.channel;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.LruCache;
import anet.channel.detect.n;
import anet.channel.entity.ConnType;
import anet.channel.entity.ENV;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.IStrategyListener;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.l;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import anet.channel.util.Utils;
import com.max.hbutils.utils.o;
import com.max.xiaoheihe.module.voice.HeyboxMicFragment;
import com.umeng.analytics.pro.ak;
import java.net.ConnectException;
import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class SessionCenter {
    public static final String TAG = "awcn.SessionCenter";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static Map<Config, SessionCenter> f29566a = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f29567j = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Context f29568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f29569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Config f29570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final e f29571e = new e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final LruCache<String, SessionRequest> f29572f = new LruCache<>(32);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final c f29573g = new c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final AccsSessionManager f29574h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final a f29575i;

    /* JADX INFO: compiled from: Taobao */
    public class a implements NetworkStatusHelper.INetworkStatusChangeListener, IStrategyListener, AppLifecycle.AppLifecycleListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f29576a;

        private a() {
            this.f29576a = false;
        }

        /* synthetic */ a(SessionCenter sessionCenter, d dVar) {
            this();
        }

        void a() {
            AppLifecycle.registerLifecycleListener(this);
            NetworkStatusHelper.addStatusChangeListener(this);
            StrategyCenter.getInstance().registerListener(this);
        }

        void b() {
            StrategyCenter.getInstance().unregisterListener(this);
            AppLifecycle.unregisterLifecycleListener(this);
            NetworkStatusHelper.removeStatusChangeListener(this);
        }

        @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
        public void background() {
            ALog.i(SessionCenter.TAG, "[background]", SessionCenter.this.f29569c, new Object[0]);
            if (!SessionCenter.f29567j) {
                ALog.e(SessionCenter.TAG, "background not inited!", SessionCenter.this.f29569c, new Object[0]);
                return;
            }
            try {
                StrategyCenter.getInstance().saveData();
                if (AwcnConfig.isAccsSessionCreateForbiddenInBg() && o.f73559e.equalsIgnoreCase(Build.BRAND)) {
                    ALog.i(SessionCenter.TAG, "close session for OPPO", SessionCenter.this.f29569c, new Object[0]);
                    SessionCenter.this.f29574h.forceCloseSession(false);
                }
            } catch (Exception unused) {
            }
        }

        @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
        public void forground() {
            ALog.i(SessionCenter.TAG, "[forground]", SessionCenter.this.f29569c, new Object[0]);
            if (SessionCenter.this.f29568b == null || this.f29576a) {
                return;
            }
            this.f29576a = true;
            try {
                if (!SessionCenter.f29567j) {
                    ALog.e(SessionCenter.TAG, "forground not inited!", SessionCenter.this.f29569c, new Object[0]);
                    return;
                }
                try {
                    if (AppLifecycle.lastEnterBackgroundTime == 0 || System.currentTimeMillis() - AppLifecycle.lastEnterBackgroundTime <= 60000) {
                        SessionCenter.this.f29574h.checkAndStartSession();
                    } else {
                        SessionCenter.this.f29574h.forceCloseSession(true);
                    }
                } catch (Exception unused) {
                } finally {
                    this.f29576a = false;
                }
            } catch (Exception unused2) {
            }
        }

        @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
        public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
            ALog.e(SessionCenter.TAG, "onNetworkStatusChanged.", SessionCenter.this.f29569c, "networkStatus", networkStatus);
            List<SessionRequest> listA = SessionCenter.this.f29571e.a();
            if (!listA.isEmpty()) {
                for (SessionRequest sessionRequest : listA) {
                    ALog.d(SessionCenter.TAG, "network change, try recreate session", SessionCenter.this.f29569c, new Object[0]);
                    sessionRequest.a((String) null);
                }
            }
            SessionCenter.this.f29574h.checkAndStartSession();
        }

        @Override // anet.channel.strategy.IStrategyListener
        public void onStrategyUpdated(l.d dVar) {
            SessionCenter.this.a(dVar);
            SessionCenter.this.f29574h.checkAndStartSession();
        }
    }

    private SessionCenter(Config config) {
        a aVar = new a(this, null);
        this.f29575i = aVar;
        this.f29568b = GlobalAppRuntimeInfo.getContext();
        this.f29570d = config;
        this.f29569c = config.getAppkey();
        aVar.a();
        this.f29574h = new AccsSessionManager(this);
        if (config.getAppkey().equals("[default]")) {
            return;
        }
        AmdcRuntimeInfo.setSign(new d(this, config.getAppkey(), config.getSecurity()));
    }

    private SessionRequest a(HttpUrl httpUrl) {
        String cNameByHost = StrategyCenter.getInstance().getCNameByHost(httpUrl.host());
        if (cNameByHost == null) {
            cNameByHost = httpUrl.host();
        }
        String strScheme = httpUrl.scheme();
        if (!httpUrl.isSchemeLocked()) {
            strScheme = StrategyCenter.getInstance().getSchemeByHost(cNameByHost, strScheme);
        }
        return a(StringUtils.concatString(strScheme, HttpConstant.SCHEME_SPLIT, cNameByHost));
    }

    private void a(l.b bVar) {
        for (Session session : this.f29571e.a(a(StringUtils.buildKey(bVar.f29954c, bVar.f29952a)))) {
            if (!StringUtils.isStringEqual(session.f29551l, bVar.f29956e)) {
                ALog.i(TAG, "unit change", session.f29555p, "session unit", session.f29551l, "unit", bVar.f29956e);
                session.close(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(l.d dVar) {
        try {
            for (l.b bVar : dVar.f29967b) {
                if (bVar.f29962k) {
                    b(bVar);
                }
                if (bVar.f29956e != null) {
                    a(bVar);
                }
            }
        } catch (Exception e10) {
            ALog.e(TAG, "checkStrategy failed", this.f29569c, e10, new Object[0]);
        }
    }

    private void b(l.b bVar) {
        boolean z10;
        boolean z11;
        ALog.i(TAG, "find effectNow", this.f29569c, "host", bVar.f29952a);
        l.a[] aVarArr = bVar.f29959h;
        String[] strArr = bVar.f29957f;
        for (Session session : this.f29571e.a(a(StringUtils.buildKey(bVar.f29954c, bVar.f29952a)))) {
            if (!session.getConnType().isHttpType()) {
                int i10 = 0;
                while (true) {
                    if (i10 >= strArr.length) {
                        z10 = false;
                        break;
                    } else {
                        if (session.getIp().equals(strArr[i10])) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    }
                }
                if (z10) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= aVarArr.length) {
                            z11 = false;
                            break;
                        } else {
                            if (session.getPort() == aVarArr[i11].f29944a && session.getConnType().equals(ConnType.valueOf(ConnProtocol.valueOf(aVarArr[i11])))) {
                                z11 = true;
                                break;
                            }
                            i11++;
                        }
                    }
                    if (!z11) {
                        if (ALog.isPrintLog(2)) {
                            ALog.i(TAG, "aisle not match", session.f29555p, HeyboxMicFragment.f93763y, Integer.valueOf(session.getPort()), "connType", session.getConnType(), "aisle", Arrays.toString(aVarArr));
                        }
                        session.close(true);
                    }
                } else {
                    if (ALog.isPrintLog(2)) {
                        ALog.i(TAG, "ip not match", session.f29555p, "session ip", session.getIp(), "ips", Arrays.toString(strArr));
                    }
                    session.close(true);
                }
            }
        }
    }

    public static void checkAndStartAccsSession() {
        Iterator<SessionCenter> it = f29566a.values().iterator();
        while (it.hasNext()) {
            it.next().f29574h.checkAndStartSession();
        }
    }

    @Deprecated
    public static synchronized SessionCenter getInstance() {
        Context appContext;
        if (!f29567j && (appContext = Utils.getAppContext()) != null) {
            init(appContext);
        }
        SessionCenter sessionCenter = null;
        for (Map.Entry<Config, SessionCenter> entry : f29566a.entrySet()) {
            SessionCenter value = entry.getValue();
            if (entry.getKey() != Config.DEFAULT_CONFIG) {
                return value;
            }
            sessionCenter = value;
        }
        return sessionCenter;
    }

    public static synchronized SessionCenter getInstance(Config config) {
        SessionCenter sessionCenter;
        Context appContext;
        try {
            if (config == null) {
                throw new NullPointerException("config is null!");
            }
            if (!f29567j && (appContext = Utils.getAppContext()) != null) {
                init(appContext);
            }
            sessionCenter = f29566a.get(config);
            if (sessionCenter == null) {
                sessionCenter = new SessionCenter(config);
                f29566a.put(config, sessionCenter);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return sessionCenter;
    }

    public static synchronized SessionCenter getInstance(String str) {
        Config configByTag;
        configByTag = Config.getConfigByTag(str);
        if (configByTag == null) {
            throw new RuntimeException("tag not exist!");
        }
        return getInstance(configByTag);
    }

    public static synchronized void init(Context context) {
        try {
            if (context == null) {
                ALog.e(TAG, "context is null!", null, new Object[0]);
                throw new NullPointerException("init failed. context is null");
            }
            GlobalAppRuntimeInfo.setContext(context.getApplicationContext());
            if (!f29567j) {
                Map<Config, SessionCenter> map = f29566a;
                Config config = Config.DEFAULT_CONFIG;
                map.put(config, new SessionCenter(config));
                AppLifecycle.initialize();
                NetworkStatusHelper.startListener(context);
                if (!AwcnConfig.isTbNextLaunch()) {
                    StrategyCenter.getInstance().initialize(GlobalAppRuntimeInfo.getContext());
                }
                if (GlobalAppRuntimeInfo.isTargetProcess()) {
                    n.a();
                    anet.channel.e.a.a();
                }
                f29567j = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized void init(Context context, Config config) {
        try {
            if (context == null) {
                ALog.e(TAG, "context is null!", null, new Object[0]);
                throw new NullPointerException("init failed. context is null");
            }
            if (config == null) {
                ALog.e(TAG, "paramter config is null!", null, new Object[0]);
                throw new NullPointerException("init failed. config is null");
            }
            init(context);
            if (!f29566a.containsKey(config)) {
                f29566a.put(config, new SessionCenter(config));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Deprecated
    public static synchronized void init(Context context, String str) {
        init(context, str, GlobalAppRuntimeInfo.getEnv());
    }

    public static synchronized void init(Context context, String str, ENV env) {
        try {
            if (context == null) {
                ALog.e(TAG, "context is null!", null, new Object[0]);
                throw new NullPointerException("init failed. context is null");
            }
            Config config = Config.getConfig(str, env);
            if (config == null) {
                config = new Config.Builder().setAppkey(str).setEnv(env).build();
            }
            init(context, config);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized void switchEnvironment(ENV env) {
        try {
            if (GlobalAppRuntimeInfo.getEnv() != env) {
                ALog.i(TAG, "switch env", null, "old", GlobalAppRuntimeInfo.getEnv(), "new", env);
                GlobalAppRuntimeInfo.setEnv(env);
                StrategyCenter.getInstance().switchEnv();
                SpdyAgent.getInstance(GlobalAppRuntimeInfo.getContext(), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION).switchAccsServer(env == ENV.TEST ? 0 : 1);
            }
            Iterator<Map.Entry<Config, SessionCenter>> it = f29566a.entrySet().iterator();
            while (it.hasNext()) {
                SessionCenter value = it.next().getValue();
                if (value.f29570d.getEnv() != env) {
                    ALog.i(TAG, "remove instance", value.f29569c, w3.a.f140966b, value.f29570d.getEnv());
                    value.f29574h.forceCloseSession(false);
                    value.f29575i.b();
                    it.remove();
                }
            }
        } catch (Throwable th2) {
            ALog.e(TAG, "switch env error.", null, th2, new Object[0]);
        }
    }

    protected Session a(HttpUrl httpUrl, int i10, long j10, SessionGetCallback sessionGetCallback) throws Exception {
        SessionInfo sessionInfoB;
        if (!f29567j) {
            ALog.e(TAG, "getInternal not inited!", this.f29569c, new Object[0]);
            throw new IllegalStateException("getInternal not inited");
        }
        if (httpUrl == null) {
            throw new InvalidParameterException("httpUrl is null");
        }
        String str = this.f29569c;
        Object[] objArr = new Object[6];
        objArr[0] = ak.aG;
        objArr[1] = httpUrl.urlString();
        objArr[2] = "sessionType";
        objArr[3] = i10 == anet.channel.entity.c.f29700a ? "LongLink" : "ShortLink";
        objArr[4] = l5.a.f130839h0;
        objArr[5] = Long.valueOf(j10);
        ALog.d(TAG, "getInternal", str, objArr);
        SessionRequest sessionRequestA = a(httpUrl);
        Session sessionA = this.f29571e.a(sessionRequestA, i10);
        if (sessionA != null) {
            ALog.d(TAG, "get internal hit cache session", this.f29569c, com.umeng.analytics.pro.d.aw, sessionA);
        } else {
            if (this.f29570d == Config.DEFAULT_CONFIG && i10 != anet.channel.entity.c.f29701b) {
                if (sessionGetCallback == null) {
                    return null;
                }
                sessionGetCallback.onSessionGetFail();
                return null;
            }
            if (GlobalAppRuntimeInfo.isAppBackground() && i10 == anet.channel.entity.c.f29700a && AwcnConfig.isAccsSessionCreateForbiddenInBg() && (sessionInfoB = this.f29573g.b(httpUrl.host())) != null && sessionInfoB.isAccs) {
                ALog.w(TAG, "app background, forbid to create accs session", this.f29569c, new Object[0]);
                throw new ConnectException("accs session connecting forbidden in background");
            }
            sessionRequestA.a(this.f29568b, i10, anet.channel.util.i.a(this.f29569c), sessionGetCallback, j10);
            if (sessionGetCallback == null && j10 > 0 && (i10 == anet.channel.entity.c.f29702c || sessionRequestA.b() == i10)) {
                sessionRequestA.a(j10);
                sessionA = this.f29571e.a(sessionRequestA, i10);
                if (sessionA == null) {
                    throw new ConnectException("session connecting failed or timeout");
                }
            }
        }
        return sessionA;
    }

    protected SessionRequest a(String str) {
        SessionRequest sessionRequest;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f29572f) {
            sessionRequest = this.f29572f.get(str);
            if (sessionRequest == null) {
                sessionRequest = new SessionRequest(str, this);
                this.f29572f.put(str, sessionRequest);
            }
        }
        return sessionRequest;
    }

    public void asyncGet(HttpUrl httpUrl, int i10, long j10, SessionGetCallback sessionGetCallback) {
        if (sessionGetCallback == null) {
            throw new NullPointerException("cb is null");
        }
        if (j10 <= 0) {
            throw new InvalidParameterException("timeout must > 0");
        }
        try {
            b(httpUrl, i10, j10, sessionGetCallback);
        } catch (Exception unused) {
            sessionGetCallback.onSessionGetFail();
        }
    }

    protected void b(HttpUrl httpUrl, int i10, long j10, SessionGetCallback sessionGetCallback) throws Exception {
        SessionInfo sessionInfoB;
        if (!f29567j) {
            ALog.e(TAG, "getInternal not inited!", this.f29569c, new Object[0]);
            throw new IllegalStateException("getInternal not inited");
        }
        if (httpUrl == null) {
            throw new InvalidParameterException("httpUrl is null");
        }
        if (sessionGetCallback == null) {
            throw new InvalidParameterException("sessionGetCallback is null");
        }
        String str = this.f29569c;
        Object[] objArr = new Object[6];
        objArr[0] = ak.aG;
        objArr[1] = httpUrl.urlString();
        objArr[2] = "sessionType";
        objArr[3] = i10 == anet.channel.entity.c.f29700a ? "LongLink" : "ShortLink";
        objArr[4] = l5.a.f130839h0;
        objArr[5] = Long.valueOf(j10);
        ALog.d(TAG, "getInternal", str, objArr);
        SessionRequest sessionRequestA = a(httpUrl);
        Session sessionA = this.f29571e.a(sessionRequestA, i10);
        if (sessionA != null) {
            ALog.d(TAG, "get internal hit cache session", this.f29569c, com.umeng.analytics.pro.d.aw, sessionA);
            sessionGetCallback.onSessionGetSuccess(sessionA);
            return;
        }
        if (this.f29570d == Config.DEFAULT_CONFIG && i10 != anet.channel.entity.c.f29701b) {
            sessionGetCallback.onSessionGetFail();
            return;
        }
        if (GlobalAppRuntimeInfo.isAppBackground() && i10 == anet.channel.entity.c.f29700a && AwcnConfig.isAccsSessionCreateForbiddenInBg() && (sessionInfoB = this.f29573g.b(httpUrl.host())) != null && sessionInfoB.isAccs) {
            ALog.w(TAG, "app background, forbid to create accs session", this.f29569c, new Object[0]);
            throw new ConnectException("accs session connecting forbidden in background");
        }
        sessionRequestA.b(this.f29568b, i10, anet.channel.util.i.a(this.f29569c), sessionGetCallback, j10);
    }

    @Deprecated
    public void enterBackground() {
        AppLifecycle.onBackground();
    }

    @Deprecated
    public void enterForeground() {
        AppLifecycle.onForeground();
    }

    public void forceRecreateAccsSession() {
        this.f29574h.forceCloseSession(true);
    }

    public Session get(HttpUrl httpUrl, int i10, long j10) {
        try {
            return a(httpUrl, i10, j10, null);
        } catch (NoAvailStrategyException e10) {
            ALog.i(TAG, "[Get]" + e10.getMessage(), this.f29569c, null, "url", httpUrl.urlString());
            return null;
        } catch (ConnectException e11) {
            ALog.e(TAG, "[Get]connect exception", this.f29569c, "errMsg", e11.getMessage(), "url", httpUrl.urlString());
            return null;
        } catch (InvalidParameterException e12) {
            ALog.e(TAG, "[Get]param url is invalid", this.f29569c, e12, "url", httpUrl);
            return null;
        } catch (TimeoutException e13) {
            ALog.e(TAG, "[Get]timeout exception", this.f29569c, e13, "url", httpUrl.urlString());
            return null;
        } catch (Exception e14) {
            ALog.e(TAG, "[Get]" + e14.getMessage(), this.f29569c, null, "url", httpUrl.urlString());
            return null;
        }
    }

    @Deprecated
    public Session get(HttpUrl httpUrl, ConnType.TypeLevel typeLevel, long j10) {
        return get(httpUrl, typeLevel == ConnType.TypeLevel.SPDY ? anet.channel.entity.c.f29700a : anet.channel.entity.c.f29701b, j10);
    }

    public Session get(String str, long j10) {
        return get(HttpUrl.parse(str), anet.channel.entity.c.f29702c, j10);
    }

    @Deprecated
    public Session get(String str, ConnType.TypeLevel typeLevel, long j10) {
        return get(HttpUrl.parse(str), typeLevel == ConnType.TypeLevel.SPDY ? anet.channel.entity.c.f29700a : anet.channel.entity.c.f29701b, j10);
    }

    public Session getThrowsException(HttpUrl httpUrl, int i10, long j10) throws Exception {
        return a(httpUrl, i10, j10, null);
    }

    @Deprecated
    public Session getThrowsException(HttpUrl httpUrl, ConnType.TypeLevel typeLevel, long j10) throws Exception {
        return a(httpUrl, typeLevel == ConnType.TypeLevel.SPDY ? anet.channel.entity.c.f29700a : anet.channel.entity.c.f29701b, j10, null);
    }

    public Session getThrowsException(String str, long j10) throws Exception {
        return a(HttpUrl.parse(str), anet.channel.entity.c.f29702c, j10, null);
    }

    @Deprecated
    public Session getThrowsException(String str, ConnType.TypeLevel typeLevel, long j10) throws Exception {
        return a(HttpUrl.parse(str), typeLevel == ConnType.TypeLevel.SPDY ? anet.channel.entity.c.f29700a : anet.channel.entity.c.f29701b, j10, null);
    }

    public void registerAccsSessionListener(ISessionListener iSessionListener) {
        this.f29574h.registerListener(iSessionListener);
    }

    public void registerPublicKey(String str, int i10) {
        this.f29573g.a(str, i10);
    }

    public void registerSessionInfo(SessionInfo sessionInfo) {
        this.f29573g.a(sessionInfo);
        if (sessionInfo.isKeepAlive) {
            this.f29574h.checkAndStartSession();
        }
    }

    @Deprecated
    public synchronized void switchEnv(ENV env) {
        switchEnvironment(env);
    }

    public void unregisterAccsSessionListener(ISessionListener iSessionListener) {
        this.f29574h.unregisterListener(iSessionListener);
    }

    public void unregisterSessionInfo(String str) {
        SessionInfo sessionInfoA = this.f29573g.a(str);
        if (sessionInfoA == null || !sessionInfoA.isKeepAlive) {
            return;
        }
        this.f29574h.checkAndStartSession();
    }
}
