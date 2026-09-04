package anet.channel;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.entity.ConnType;
import anet.channel.entity.EventCb;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.statist.SessionStatistic;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpHelper;
import anet.channel.util.StringUtils;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Session implements Comparable<Session> {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static ExecutorService f29539v = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f29540a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f29542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f29543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f29544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f29545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f29546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f29547h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f29548i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ConnType f29549j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public IConnStrategy f29550k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f29552m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected Runnable f29554o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f29555p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SessionStatistic f29556q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f29557r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f29558s;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Future<?> f29562x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Map<EventCb, Integer> f29541b = new LinkedHashMap();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f29561w = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f29551l = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f29553n = 6;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f29559t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f29560u = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private List<Long> f29563y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f29564z = 0;

    /* JADX INFO: compiled from: Taobao */
    public static class a {
        public static final int AUTHING = 3;
        public static final int AUTH_FAIL = 5;
        public static final int AUTH_SUCC = 4;
        public static final int CONNECTED = 0;
        public static final int CONNECTING = 1;
        public static final int CONNETFAIL = 2;
        public static final int DISCONNECTED = 6;
        public static final int DISCONNECTING = 7;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final String[] f29565a = {"CONNECTED", "CONNECTING", "CONNETFAIL", "AUTHING", "AUTH_SUCC", "AUTH_FAIL", "DISCONNECTED", "DISCONNECTING"};

        static String a(int i10) {
            return f29565a[i10];
        }
    }

    public Session(Context context, anet.channel.entity.a aVar) {
        boolean z10 = false;
        this.f29552m = false;
        this.f29540a = context;
        String strA = aVar.a();
        this.f29544e = strA;
        this.f29545f = strA;
        this.f29546g = aVar.b();
        this.f29549j = aVar.c();
        String strF = aVar.f();
        this.f29542c = strF;
        this.f29543d = strF.substring(strF.indexOf(HttpConstant.SCHEME_SPLIT) + 3);
        this.f29558s = aVar.e();
        this.f29557r = aVar.d();
        IConnStrategy iConnStrategy = aVar.f29692a;
        this.f29550k = iConnStrategy;
        if (iConnStrategy != null && iConnStrategy.getIpType() == -1) {
            z10 = true;
        }
        this.f29552m = z10;
        this.f29555p = aVar.h();
        SessionStatistic sessionStatistic = new SessionStatistic(aVar);
        this.f29556q = sessionStatistic;
        sessionStatistic.host = this.f29543d;
    }

    public static void configTnetALog(Context context, String str, int i10, int i11) {
        SpdyAgent spdyAgent = SpdyAgent.getInstance(context, SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
        if (spdyAgent == null || !SpdyAgent.checkLoadSucc()) {
            ALog.e("agent null or configTnetALog load so fail!!!", null, "loadso", Boolean.valueOf(SpdyAgent.checkLoadSucc()));
        } else {
            spdyAgent.configLogFile(str, i10, i11);
        }
    }

    protected void a() {
        Future<?> future;
        if (this.f29554o == null || (future = this.f29562x) == null) {
            return;
        }
        future.cancel(true);
    }

    public void checkAvailable() {
        ping(true);
    }

    public abstract void close();

    public void close(boolean z10) {
        this.f29559t = z10;
        close();
    }

    @Override // java.lang.Comparable
    public int compareTo(Session session) {
        return ConnType.compare(this.f29549j, session.f29549j);
    }

    public void connect() {
    }

    public IConnStrategy getConnStrategy() {
        return this.f29550k;
    }

    public ConnType getConnType() {
        return this.f29549j;
    }

    public String getHost() {
        return this.f29542c;
    }

    public String getIp() {
        return this.f29544e;
    }

    public int getPort() {
        return this.f29546g;
    }

    public String getRealHost() {
        return this.f29543d;
    }

    public abstract Runnable getRecvTimeOutRunnable();

    public String getUnit() {
        return this.f29551l;
    }

    public void handleCallbacks(int i10, anet.channel.entity.b bVar) {
        f29539v.submit(new b(this, i10, bVar));
    }

    public void handleResponseCode(Request request, int i10) {
        if (request.getHeaders().containsKey(HttpConstant.X_PV) && i10 >= 500 && i10 < 600) {
            synchronized (this) {
                if (this.f29563y == null) {
                    this.f29563y = new LinkedList();
                }
                if (this.f29563y.size() < 5) {
                    this.f29563y.add(Long.valueOf(System.currentTimeMillis()));
                } else {
                    long jLongValue = this.f29563y.remove(0).longValue();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - jLongValue <= 60000) {
                        StrategyCenter.getInstance().forceRefreshStrategy(request.getHost());
                        this.f29563y.clear();
                    } else {
                        this.f29563y.add(Long.valueOf(jCurrentTimeMillis));
                    }
                }
            }
        }
    }

    public void handleResponseHeaders(Request request, Map<String, List<String>> map) {
        try {
            if (map.containsKey(HttpConstant.X_SWITCH_UNIT)) {
                String singleHeaderFieldByKey = HttpHelper.getSingleHeaderFieldByKey(map, HttpConstant.X_SWITCH_UNIT);
                if (TextUtils.isEmpty(singleHeaderFieldByKey)) {
                    singleHeaderFieldByKey = null;
                }
                if (StringUtils.isStringEqual(this.f29551l, singleHeaderFieldByKey)) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.f29564z > 60000) {
                    StrategyCenter.getInstance().forceRefreshStrategy(request.getHost());
                    this.f29564z = jCurrentTimeMillis;
                }
            }
        } catch (Exception unused) {
        }
    }

    public abstract boolean isAvailable();

    public synchronized void notifyStatus(int i10, anet.channel.entity.b bVar) {
        ALog.e("awcn.Session", "notifyStatus", this.f29555p, "status", a.a(i10));
        if (i10 == this.f29553n) {
            ALog.i("awcn.Session", "ignore notifyStatus", this.f29555p, new Object[0]);
            return;
        }
        this.f29553n = i10;
        if (i10 == 0) {
            handleCallbacks(1, bVar);
        } else if (i10 == 2) {
            handleCallbacks(256, bVar);
        } else if (i10 == 4) {
            this.f29551l = StrategyCenter.getInstance().getUnitByHost(this.f29543d);
            handleCallbacks(512, bVar);
        } else if (i10 == 5) {
            handleCallbacks(1024, bVar);
        } else if (i10 == 6) {
            onDisconnect();
            if (!this.f29561w) {
                handleCallbacks(2, bVar);
            }
        }
    }

    public void onDisconnect() {
    }

    public void ping(boolean z10) {
    }

    public void ping(boolean z10, int i10) {
    }

    public void registerEventcb(int i10, EventCb eventCb) {
        Map<EventCb, Integer> map = this.f29541b;
        if (map != null) {
            map.put(eventCb, Integer.valueOf(i10));
        }
    }

    public abstract Cancelable request(Request request, RequestCb requestCb);

    public void sendCustomFrame(int i10, byte[] bArr, int i11) {
    }

    public void setPingTimeout(int i10) {
        if (this.f29554o == null) {
            this.f29554o = getRecvTimeOutRunnable();
        }
        a();
        Runnable runnable = this.f29554o;
        if (runnable != null) {
            this.f29562x = ThreadPoolExecutorFactory.submitScheduledTask(runnable, i10, TimeUnit.MILLISECONDS);
        }
    }

    public String toString() {
        return "Session@[" + this.f29555p + '|' + this.f29549j + ']';
    }
}
