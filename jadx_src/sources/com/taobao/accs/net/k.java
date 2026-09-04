package com.taobao.accs.net;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import anet.channel.DataFrameCb;
import anet.channel.IAuth;
import anet.channel.ISessionListener;
import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.SessionInfo;
import anet.channel.entity.ConnType;
import anet.channel.request.Request;
import anet.channel.session.TnetSpdySession;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.StrategyTemplate;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.ErrorCode;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.data.Message;
import com.taobao.accs.ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class k extends com.taobao.accs.net.a implements DataFrameCb {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f98335o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f98336p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ScheduledFuture f98337q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Handler f98338r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Runnable f98339s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ISessionListener f98340t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Runnable f98341u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Set<String> f98342v;

    /* JADX INFO: compiled from: Taobao */
    public static class a implements IAuth {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f98343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f98344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f98345c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.taobao.accs.net.a f98346d;

        public a(com.taobao.accs.net.a aVar, String str) {
            this.f98345c = aVar.d();
            this.f98343a = aVar.c("https://" + str + "/accs/");
            this.f98344b = aVar.f98299c;
            this.f98346d = aVar;
        }

        @Override // anet.channel.IAuth
        public void auth(Session session, IAuth.AuthCallback authCallback) {
            ALog.e(this.f98345c, "auth", "URL", this.f98343a);
            session.request(new Request.Builder().setUrl(this.f98343a).build(), new u(this, authCallback));
        }
    }

    public k(Context context, int i10, String str) {
        super(context, i10, str);
        this.f98335o = true;
        this.f98336p = 3600000L;
        this.f98338r = new Handler(Looper.getMainLooper());
        this.f98339s = new l(this);
        this.f98340t = new m(this);
        this.f98341u = new t(this);
        this.f98342v = Collections.synchronizedSet(new HashSet());
        ThreadPoolExecutorFactory.getScheduledExecutor().schedule(this.f98341u, 120000L, TimeUnit.MILLISECONDS);
    }

    public k(Context context, int i10, String str, int i11) {
        super(context, i10, str);
        this.f98335o = true;
        this.f98336p = 3600000L;
        this.f98338r = new Handler(Looper.getMainLooper());
        this.f98339s = new l(this);
        this.f98340t = new m(this);
        this.f98341u = new t(this);
        this.f98342v = Collections.synchronizedSet(new HashSet());
        c(i11);
        ThreadPoolExecutorFactory.getScheduledExecutor().schedule(this.f98341u, 120000L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (this.f98305i.isAccsHeartbeatEnable()) {
            ALog.e(d(), "startAccsHeartBeat", new Object[0]);
            ScheduledFuture scheduledFuture = this.f98337q;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            ScheduledThreadPoolExecutor scheduledExecutor = ThreadPoolExecutorFactory.getScheduledExecutor();
            Runnable runnable = this.f98339s;
            long j10 = this.f98336p;
            this.f98337q = scheduledExecutor.scheduleAtFixedRate(runnable, j10, j10, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.taobao.accs.net.a
    public synchronized void a() {
        ALog.d(d(), com.google.android.exoplayer2.text.ttml.d.f49798o0, new Object[0]);
        this.f98335o = true;
        a(this.f98300d);
    }

    @Override // com.taobao.accs.net.a
    protected void a(Context context) {
        boolean z10;
        try {
            if (this.f98303g) {
                return;
            }
            super.a(context);
            if (com.taobao.accs.utl.t.c()) {
                SessionCenter.getInstance(this.f98305i.getAppKey()).registerAccsSessionListener(this.f98340t);
            }
            String inappHost = this.f98305i.getInappHost();
            if (h() && this.f98305i.isKeepalive()) {
                z10 = true;
            } else {
                ALog.d(d(), "initAwcn close keepalive", new Object[0]);
                z10 = false;
            }
            a(SessionCenter.getInstance(this.f98305i.getAppKey()), inappHost, z10);
            this.f98303g = true;
            ALog.i(d(), "initAwcn success!", new Object[0]);
        } catch (Throwable th2) {
            ALog.e(d(), "initAwcn", th2, new Object[0]);
        }
    }

    public void a(SessionCenter sessionCenter, String str, boolean z10) {
        if (this.f98342v.contains(str)) {
            return;
        }
        sessionCenter.registerSessionInfo(SessionInfo.create(str, z10, true, new a(this, str), null, this));
        sessionCenter.registerPublicKey(str, this.f98305i.getInappPubKey());
        this.f98342v.add(str);
        ALog.i(d(), "registerSessionInfo", "host", str);
    }

    public void a(AccsClientConfig accsClientConfig) {
        if (accsClientConfig == null) {
            ALog.i(d(), "updateConfig null", new Object[0]);
            return;
        }
        if (accsClientConfig.equals(this.f98305i)) {
            ALog.w(d(), "updateConfig not any changed", new Object[0]);
            return;
        }
        if (!this.f98303g) {
            if (UtilityImpl.isMainProcess(this.f98300d)) {
                this.f98305i = accsClientConfig;
                a(this.f98300d);
                return;
            }
            return;
        }
        try {
            boolean z10 = true;
            ALog.w(d(), "updateConfig", "old", this.f98305i, "new", accsClientConfig);
            String inappHost = this.f98305i.getInappHost();
            String inappHost2 = accsClientConfig.getInappHost();
            SessionCenter sessionCenter = SessionCenter.getInstance(this.f98305i.getAppKey());
            if (sessionCenter == null) {
                ALog.w(d(), "updateConfig not need update", new Object[0]);
                return;
            }
            sessionCenter.unregisterSessionInfo(inappHost);
            ALog.w(d(), "updateConfig unregisterSessionInfo", "host", inappHost);
            if (this.f98342v.contains(inappHost)) {
                this.f98342v.remove(inappHost);
                ALog.w(d(), "updateConfig removeSessionRegistered", "oldHost", inappHost);
            }
            this.f98305i = accsClientConfig;
            this.f98298b = accsClientConfig.getAppKey();
            this.f98309m = this.f98305i.getTag();
            String str = ConnType.PK_ACS;
            if (this.f98305i.getInappPubKey() == 10 || this.f98305i.getInappPubKey() == 11) {
                str = "open";
            }
            ALog.i(d(), "update config register new conn protocol host:", this.f98305i.getInappHost());
            StrategyTemplate.getInstance().registerConnProtocol(this.f98305i.getInappHost(), ConnProtocol.valueOf(ConnType.HTTP2, ConnType.RTT_0, str, false));
            if (!h() || !this.f98305i.isKeepalive()) {
                ALog.i(d(), "updateConfig close keepalive", new Object[0]);
                z10 = false;
            }
            a(sessionCenter, inappHost2, z10);
        } catch (Throwable th2) {
            ALog.e(d(), "updateConfig", th2, new Object[0]);
        }
    }

    @Override // com.taobao.accs.net.a
    public void a(Message message, boolean z10) {
        if (!this.f98335o || message == null) {
            ALog.e(d(), "not running or msg null! " + this.f98335o, new Object[0]);
            return;
        }
        try {
            if (ThreadPoolExecutorFactory.getSendScheduledExecutor().getQueue().size() > 1000) {
                throw new RejectedExecutionException("accs");
            }
            ScheduledFuture<?> scheduledFutureSchedule = ThreadPoolExecutorFactory.getSendScheduledExecutor().schedule(new o(this, message), message.delyTime, TimeUnit.MILLISECONDS);
            if (message.getType() == 1 && message.cunstomDataId != null) {
                if (message.isControlFrame() && a(message.cunstomDataId)) {
                    this.f98301e.b(message);
                }
                this.f98301e.f98243a.put(message.cunstomDataId, scheduledFutureSchedule);
            }
            NetPerformanceMonitor netPermanceMonitor = message.getNetPermanceMonitor();
            if (netPermanceMonitor != null) {
                netPermanceMonitor.setDeviceId(UtilityImpl.j(this.f98300d));
                netPermanceMonitor.setConnType(this.f98299c);
                netPermanceMonitor.onEnterQueueData();
            }
        } catch (RejectedExecutionException unused) {
            this.f98301e.a(message, ErrorCode.MESSAGE_QUEUE_FULL);
            ALog.e(d(), "send queue full count:" + ThreadPoolExecutorFactory.getSendScheduledExecutor().getQueue().size(), new Object[0]);
        } catch (Throwable th2) {
            this.f98301e.a(message, -8);
            ALog.e(d(), "send error", th2, new Object[0]);
        }
    }

    @Override // com.taobao.accs.net.a
    protected void a(String str, boolean z10, long j10) {
        ThreadPoolExecutorFactory.getScheduledExecutor().schedule(new p(this, str, z10), j10, TimeUnit.MILLISECONDS);
    }

    @Override // com.taobao.accs.net.a
    public void a(String str, boolean z10, String str2) {
        Session session;
        try {
            Message messageB = this.f98301e.b(str);
            if (messageB != null && messageB.host != null && (session = SessionCenter.getInstance(this.f98305i.getAppKey()).get(messageB.host.toString(), 0L)) != null) {
                if (z10) {
                    ALog.e(d(), "close session by time out", new Object[0]);
                    session.close(true);
                } else {
                    session.ping(true);
                }
            }
        } catch (Exception e10) {
            ALog.e(d(), "onTimeOut", e10, new Object[0]);
        }
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            ALog.e(d(), "onReceiveAccsHeartbeatResp response data is null", new Object[0]);
            return;
        }
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.i(d(), "onReceiveAccsHeartbeatResp", "data", jSONObject);
        }
        try {
            int i10 = jSONObject.getInt("timeInterval");
            if (i10 == -1) {
                ScheduledFuture scheduledFuture = this.f98337q;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                    return;
                }
                return;
            }
            long j10 = i10 * 1000;
            if (this.f98336p != j10) {
                if (i10 == 0) {
                    j10 = 3600000;
                }
                this.f98336p = j10;
                ScheduledFuture scheduledFuture2 = this.f98337q;
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(true);
                }
                ScheduledThreadPoolExecutor scheduledExecutor = ThreadPoolExecutorFactory.getScheduledExecutor();
                Runnable runnable = this.f98339s;
                long j11 = this.f98336p;
                this.f98337q = scheduledExecutor.scheduleAtFixedRate(runnable, j11, j11, TimeUnit.MILLISECONDS);
            }
        } catch (JSONException e10) {
            ALog.e(d(), "onReceiveAccsHeartbeatResp", "e", e10.getMessage());
        }
    }

    @Override // com.taobao.accs.net.a
    public void a(boolean z10, boolean z11) {
        ThreadPoolExecutorFactory.getSendScheduledExecutor().execute(new q(this));
    }

    @Override // com.taobao.accs.net.a
    public boolean a(String str) {
        if (str == null) {
            return false;
        }
        ScheduledFuture<?> scheduledFuture = this.f98301e.f98243a.get(str);
        boolean zCancel = scheduledFuture != null ? scheduledFuture.cancel(false) : false;
        if (zCancel) {
            ALog.e(d(), "cancel", "customDataId", str);
        }
        return zCancel;
    }

    @Override // com.taobao.accs.net.a
    public void b() {
        this.f98302f = 0;
    }

    @Override // com.taobao.accs.net.a
    public com.taobao.accs.ut.a.c c() {
        return null;
    }

    @Override // com.taobao.accs.net.a
    public void c(int i10) {
        super.c(i10);
    }

    @Override // com.taobao.accs.net.a
    public String d() {
        return "InAppConn_" + this.f98309m;
    }

    @Override // com.taobao.accs.net.a
    public void e() {
        ALog.e(d(), "shut down", new Object[0]);
        this.f98335o = false;
    }

    @Override // com.taobao.accs.net.a
    public boolean m() {
        if (!this.f98303g) {
            return false;
        }
        try {
            Session session = SessionCenter.getInstance(this.f98305i.getAppKey()).get(b((String) null), ConnType.TypeLevel.SPDY, 0L);
            Object[] objArr = new Object[2];
            objArr[0] = "state";
            objArr[1] = Boolean.valueOf(session == null || session.isAvailable());
            ALog.e("InAppConn_", "isConnected", objArr);
            return session != null && session.isAvailable();
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // anet.channel.DataFrameCb
    public void onDataReceive(TnetSpdySession tnetSpdySession, byte[] bArr, int i10, int i11) {
        if (ALog.isPrintLog(ALog.Level.E)) {
            ALog.e(d(), "onDataReceive", "type", Integer.valueOf(i11), "dataid", Integer.valueOf(i10));
        }
        ThreadPoolExecutorFactory.getScheduledExecutor().execute(new r(this, i11, bArr, tnetSpdySession));
    }

    @Override // anet.channel.DataFrameCb
    public void onException(int i10, int i11, boolean z10, String str) {
        ALog.e(d(), "errorId:" + i11 + "detail:" + str + " dataId:" + i10 + " needRetry:" + z10, new Object[0]);
        ThreadPoolExecutorFactory.getScheduledExecutor().execute(new s(this, i10, z10, i11));
    }
}
