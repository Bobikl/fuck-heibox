package anet.channel;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.entity.ConnType;
import anet.channel.session.TnetSpdySession;
import anet.channel.statist.AlarmObject;
import anet.channel.statist.SessionConnStat;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class SessionRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    SessionCenter f29578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    e f29579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    SessionInfo f29580c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile Session f29582e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f29586i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f29587j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile Future f29588k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    volatile boolean f29581d = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile boolean f29583f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    HashMap<SessionGetCallback, c> f29584g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    SessionConnStat f29585h = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Object f29589l = new Object();

    /* JADX INFO: compiled from: Taobao */
    public interface IConnCb {
        void onDisConnect(Session session, long j10, int i10);

        void onFailed(Session session, long j10, int i10, int i11);

        void onSuccess(Session session, long j10);
    }

    /* JADX INFO: compiled from: Taobao */
    public class a implements IConnCb {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f29590a = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Context f29592c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<anet.channel.entity.a> f29593d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private anet.channel.entity.a f29594e;

        a(Context context, List<anet.channel.entity.a> list, anet.channel.entity.a aVar) {
            this.f29592c = context;
            this.f29593d = list;
            this.f29594e = aVar;
        }

        @Override // anet.channel.SessionRequest.IConnCb
        public void onDisConnect(Session session, long j10, int i10) {
            SessionInfo sessionInfo;
            boolean zIsAppBackground = GlobalAppRuntimeInfo.isAppBackground();
            ALog.d("awcn.SessionRequest", "Connect Disconnect", this.f29594e.h(), com.umeng.analytics.pro.d.aw, session, "host", SessionRequest.this.a(), "appIsBg", Boolean.valueOf(zIsAppBackground), "isHandleFinish", Boolean.valueOf(this.f29590a));
            SessionRequest sessionRequest = SessionRequest.this;
            sessionRequest.f29579b.b(sessionRequest, session);
            if (this.f29590a) {
                return;
            }
            this.f29590a = true;
            if (session.f29559t) {
                if (zIsAppBackground && ((sessionInfo = SessionRequest.this.f29580c) == null || !sessionInfo.isAccs || AwcnConfig.isAccsSessionCreateForbiddenInBg())) {
                    ALog.e("awcn.SessionRequest", "[onDisConnect]app background, don't Recreate", this.f29594e.h(), com.umeng.analytics.pro.d.aw, session);
                    return;
                }
                if (!NetworkStatusHelper.isConnected()) {
                    ALog.e("awcn.SessionRequest", "[onDisConnect]no network, don't Recreate", this.f29594e.h(), com.umeng.analytics.pro.d.aw, session);
                    return;
                }
                try {
                    ALog.d("awcn.SessionRequest", "session disconnected, try to recreate session", this.f29594e.h(), new Object[0]);
                    int accsReconnectionDelayPeriod = 10000;
                    SessionInfo sessionInfo2 = SessionRequest.this.f29580c;
                    if (sessionInfo2 != null && sessionInfo2.isAccs) {
                        accsReconnectionDelayPeriod = AwcnConfig.getAccsReconnectionDelayPeriod();
                    }
                    ThreadPoolExecutorFactory.submitScheduledTask(new i(this, session), (long) (Math.random() * ((double) accsReconnectionDelayPeriod)), TimeUnit.MILLISECONDS);
                } catch (Exception unused) {
                }
            }
        }

        @Override // anet.channel.SessionRequest.IConnCb
        public void onFailed(Session session, long j10, int i10, int i11) {
            if (ALog.isPrintLog(1)) {
                ALog.d("awcn.SessionRequest", "Connect failed", this.f29594e.h(), com.umeng.analytics.pro.d.aw, session, "host", SessionRequest.this.a(), "isHandleFinish", Boolean.valueOf(this.f29590a));
            }
            if (SessionRequest.this.f29583f) {
                SessionRequest.this.f29583f = false;
                return;
            }
            if (this.f29590a) {
                return;
            }
            this.f29590a = true;
            SessionRequest sessionRequest = SessionRequest.this;
            sessionRequest.f29579b.b(sessionRequest, session);
            if (!session.f29560u || !NetworkStatusHelper.isConnected() || this.f29593d.isEmpty()) {
                SessionRequest.this.c();
                SessionRequest.this.a(session, i10, i11);
                synchronized (SessionRequest.this.f29584g) {
                    for (Map.Entry<SessionGetCallback, c> entry : SessionRequest.this.f29584g.entrySet()) {
                        c value = entry.getValue();
                        if (value.f29598b.compareAndSet(false, true)) {
                            ThreadPoolExecutorFactory.removeScheduleTask(value);
                            entry.getKey().onSessionGetFail();
                        }
                    }
                    SessionRequest.this.f29584g.clear();
                }
                return;
            }
            if (ALog.isPrintLog(1)) {
                ALog.d("awcn.SessionRequest", "use next connInfo to create session", this.f29594e.h(), "host", SessionRequest.this.a());
            }
            anet.channel.entity.a aVar = this.f29594e;
            if (aVar.f29693b == aVar.f29694c && (i11 == -2003 || i11 == -2410)) {
                ListIterator<anet.channel.entity.a> listIterator = this.f29593d.listIterator();
                while (listIterator.hasNext()) {
                    if (session.getIp().equals(listIterator.next().f29692a.getIp())) {
                        listIterator.remove();
                    }
                }
            }
            if (anet.channel.strategy.utils.c.b(session.getIp())) {
                ListIterator<anet.channel.entity.a> listIterator2 = this.f29593d.listIterator();
                while (listIterator2.hasNext()) {
                    if (anet.channel.strategy.utils.c.b(listIterator2.next().f29692a.getIp())) {
                        listIterator2.remove();
                    }
                }
            }
            if (!this.f29593d.isEmpty()) {
                anet.channel.entity.a aVarRemove = this.f29593d.remove(0);
                SessionRequest sessionRequest2 = SessionRequest.this;
                Context context = this.f29592c;
                sessionRequest2.a(context, aVarRemove, sessionRequest2.new a(context, this.f29593d, aVarRemove), aVarRemove.h());
                return;
            }
            SessionRequest.this.c();
            SessionRequest.this.a(session, i10, i11);
            synchronized (SessionRequest.this.f29584g) {
                for (Map.Entry<SessionGetCallback, c> entry2 : SessionRequest.this.f29584g.entrySet()) {
                    c value2 = entry2.getValue();
                    if (value2.f29598b.compareAndSet(false, true)) {
                        ThreadPoolExecutorFactory.removeScheduleTask(value2);
                        entry2.getKey().onSessionGetFail();
                    }
                }
                SessionRequest.this.f29584g.clear();
            }
        }

        @Override // anet.channel.SessionRequest.IConnCb
        public void onSuccess(Session session, long j10) {
            ALog.d("awcn.SessionRequest", "Connect Success", this.f29594e.h(), com.umeng.analytics.pro.d.aw, session, "host", SessionRequest.this.a());
            try {
                try {
                    if (SessionRequest.this.f29583f) {
                        SessionRequest.this.f29583f = false;
                        session.close(false);
                        SessionRequest.this.c();
                        return;
                    }
                    SessionRequest sessionRequest = SessionRequest.this;
                    sessionRequest.f29579b.a(sessionRequest, session);
                    SessionRequest.this.a(session);
                    synchronized (SessionRequest.this.f29584g) {
                        for (Map.Entry<SessionGetCallback, c> entry : SessionRequest.this.f29584g.entrySet()) {
                            c value = entry.getValue();
                            if (value.f29598b.compareAndSet(false, true)) {
                                ThreadPoolExecutorFactory.removeScheduleTask(value);
                                entry.getKey().onSessionGetSuccess(session);
                            }
                        }
                        SessionRequest.this.f29584g.clear();
                    }
                    SessionRequest.this.c();
                } catch (Exception e10) {
                    ALog.e("awcn.SessionRequest", "[onSuccess]:", this.f29594e.h(), e10, new Object[0]);
                    SessionRequest.this.c();
                }
            } catch (Throwable th2) {
                SessionRequest.this.c();
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: Taobao */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f29595a;

        b(String str) {
            this.f29595a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SessionRequest.this.f29581d) {
                ALog.e("awcn.SessionRequest", "Connecting timeout!!! reset status!", this.f29595a, new Object[0]);
                SessionConnStat sessionConnStat = SessionRequest.this.f29585h;
                sessionConnStat.ret = 2;
                sessionConnStat.totalTime = System.currentTimeMillis() - SessionRequest.this.f29585h.start;
                if (SessionRequest.this.f29582e != null) {
                    SessionRequest.this.f29582e.f29560u = false;
                    SessionRequest.this.f29582e.close();
                    SessionRequest sessionRequest = SessionRequest.this;
                    sessionRequest.f29585h.syncValueFromSession(sessionRequest.f29582e);
                }
                AppMonitor.getInstance().commitStat(SessionRequest.this.f29585h);
                SessionRequest.this.a(false);
            }
        }
    }

    /* JADX INFO: compiled from: Taobao */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        SessionGetCallback f29597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        AtomicBoolean f29598b = new AtomicBoolean(false);

        protected c(SessionGetCallback sessionGetCallback) {
            this.f29597a = null;
            this.f29597a = sessionGetCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f29598b.compareAndSet(false, true)) {
                ALog.e("awcn.SessionRequest", "get session timeout", null, new Object[0]);
                synchronized (SessionRequest.this.f29584g) {
                    SessionRequest.this.f29584g.remove(this.f29597a);
                }
                this.f29597a.onSessionGetFail();
            }
        }
    }

    SessionRequest(String str, SessionCenter sessionCenter) {
        this.f29586i = str;
        String strSubstring = str.substring(str.indexOf(HttpConstant.SCHEME_SPLIT) + 3);
        this.f29587j = strSubstring;
        this.f29578a = sessionCenter;
        this.f29580c = sessionCenter.f29573g.b(strSubstring);
        this.f29579b = sessionCenter.f29571e;
    }

    private List<IConnStrategy> a(int i10, String str) {
        List<IConnStrategy> connStrategyListByHost = Collections.EMPTY_LIST;
        try {
            HttpUrl httpUrl = HttpUrl.parse(a());
            if (httpUrl == null) {
                return connStrategyListByHost;
            }
            connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(httpUrl.host());
            if (!connStrategyListByHost.isEmpty()) {
                boolean zEqualsIgnoreCase = "https".equalsIgnoreCase(httpUrl.scheme());
                boolean zB = anet.channel.util.c.b();
                ListIterator<IConnStrategy> listIterator = connStrategyListByHost.listIterator();
                while (listIterator.hasNext()) {
                    IConnStrategy next = listIterator.next();
                    ConnType connTypeValueOf = ConnType.valueOf(next.getProtocol());
                    if (connTypeValueOf != null) {
                        if (connTypeValueOf.isSSL() != zEqualsIgnoreCase || (i10 != anet.channel.entity.c.f29702c && connTypeValueOf.getType() != i10)) {
                            listIterator.remove();
                        } else if (zB && anet.channel.strategy.utils.c.b(next.getIp())) {
                            listIterator.remove();
                        }
                    }
                }
            }
            if (ALog.isPrintLog(1)) {
                ALog.d("awcn.SessionRequest", "[getAvailStrategy]", str, "strategies", connStrategyListByHost);
            }
        } catch (Throwable th2) {
            ALog.e("awcn.SessionRequest", "", str, th2, new Object[0]);
        }
        return connStrategyListByHost;
    }

    private List<anet.channel.entity.a> a(List<IConnStrategy> list, String str) {
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            IConnStrategy iConnStrategy = list.get(i11);
            int retryTimes = iConnStrategy.getRetryTimes();
            for (int i12 = 0; i12 <= retryTimes; i12++) {
                i10++;
                anet.channel.entity.a aVar = new anet.channel.entity.a(a(), str + lg.a.f131412e + i10, iConnStrategy);
                aVar.f29693b = i12;
                aVar.f29694c = retryTimes;
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, anet.channel.entity.a aVar, IConnCb iConnCb, String str) {
        ConnType connTypeC = aVar.c();
        if (context == null || connTypeC.isHttpType()) {
            this.f29582e = new anet.channel.session.d(context, aVar);
        } else {
            TnetSpdySession tnetSpdySession = new TnetSpdySession(context, aVar);
            tnetSpdySession.initConfig(this.f29578a.f29570d);
            tnetSpdySession.initSessionInfo(this.f29580c);
            tnetSpdySession.setTnetPublicKey(this.f29578a.f29573g.c(this.f29587j));
            this.f29582e = tnetSpdySession;
        }
        ALog.i("awcn.SessionRequest", "create connection...", str, "Host", a(), "Type", aVar.c(), "IP", aVar.a(), "Port", Integer.valueOf(aVar.b()), "heartbeat", Integer.valueOf(aVar.g()), com.umeng.analytics.pro.d.aw, this.f29582e);
        a(this.f29582e, iConnCb, System.currentTimeMillis());
        this.f29582e.connect();
        SessionConnStat sessionConnStat = this.f29585h;
        sessionConnStat.retryTimes++;
        sessionConnStat.startConnect = System.currentTimeMillis();
        SessionConnStat sessionConnStat2 = this.f29585h;
        if (sessionConnStat2.retryTimes == 0) {
            sessionConnStat2.putExtra("firstIp", aVar.a());
        }
    }

    private void a(Session session, IConnCb iConnCb, long j10) {
        if (iConnCb == null) {
            return;
        }
        session.registerEventcb(4095, new f(this, iConnCb, j10));
        session.registerEventcb(bb.c.b.zv, new g(this, session));
    }

    private void b(Session session, int i10, String str) {
        SessionInfo sessionInfo;
        Context context = GlobalAppRuntimeInfo.getContext();
        if (context == null || (sessionInfo = this.f29580c) == null || !sessionInfo.isAccs) {
            return;
        }
        ALog.e("awcn.SessionRequest", "sendConnectInfoToAccsByService", null, new Object[0]);
        try {
            Intent intent = new Intent(Constants.ACTION_RECEIVE);
            intent.setPackage(context.getPackageName());
            intent.setClassName(context, com.taobao.accs.utl.j.msgService);
            intent.putExtra("command", 103);
            intent.putExtra("host", session.getHost());
            intent.putExtra(Constants.KEY_CENTER_HOST, true);
            boolean zIsAvailable = session.isAvailable();
            if (!zIsAvailable) {
                intent.putExtra(Constants.KEY_ERROR_CODE, i10);
                intent.putExtra(Constants.KEY_ERROR_DETAIL, str);
            }
            intent.putExtra(Constants.KEY_CONNECT_AVAILABLE, zIsAvailable);
            intent.putExtra(Constants.KEY_TYPE_INAPP, true);
            if (Build.VERSION.SDK_INT >= 26) {
                context.bindService(intent, new h(this, intent, context), 1);
            } else {
                context.startService(intent);
            }
        } catch (Throwable th2) {
            ALog.e("awcn.SessionRequest", "sendConnectInfoToAccsByService", null, th2, new Object[0]);
        }
    }

    private void c(Session session, int i10, String str) {
        SessionInfo sessionInfo = this.f29580c;
        if (sessionInfo == null || !sessionInfo.isAccs) {
            return;
        }
        ALog.e("awcn.SessionRequest", "sendConnectInfoToAccsByCallBack", null, new Object[0]);
        Intent intent = new Intent(Constants.ACTION_ACCS_CONNECT_INFO);
        intent.putExtra("command", 103);
        intent.putExtra("host", session.getHost());
        intent.putExtra(Constants.KEY_CENTER_HOST, true);
        boolean zIsAvailable = session.isAvailable();
        if (!zIsAvailable) {
            intent.putExtra(Constants.KEY_ERROR_CODE, i10);
            intent.putExtra(Constants.KEY_ERROR_DETAIL, str);
        }
        intent.putExtra(Constants.KEY_CONNECT_AVAILABLE, zIsAvailable);
        intent.putExtra(Constants.KEY_TYPE_INAPP, true);
        this.f29578a.f29574h.notifyListener(intent);
    }

    protected String a() {
        return this.f29586i;
    }

    protected void a(long j10) throws InterruptedException, TimeoutException {
        ALog.d("awcn.SessionRequest", "[await]", null, "timeoutMs", Long.valueOf(j10));
        if (j10 <= 0) {
            return;
        }
        synchronized (this.f29589l) {
            long jCurrentTimeMillis = System.currentTimeMillis() + j10;
            while (this.f29581d) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (jCurrentTimeMillis2 >= jCurrentTimeMillis) {
                    break;
                } else {
                    this.f29589l.wait(jCurrentTimeMillis - jCurrentTimeMillis2);
                }
            }
            if (this.f29581d) {
                throw new TimeoutException();
            }
        }
    }

    protected synchronized void a(Context context, int i10, String str, SessionGetCallback sessionGetCallback, long j10) {
        Session sessionA = this.f29579b.a(this, i10);
        if (sessionA != null) {
            ALog.d("awcn.SessionRequest", "Available Session exist!!!", str, new Object[0]);
            if (sessionGetCallback != null) {
                sessionGetCallback.onSessionGetSuccess(sessionA);
            }
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = anet.channel.util.i.a(null);
        }
        ALog.d("awcn.SessionRequest", "SessionRequest start", str, "host", this.f29586i, "type", Integer.valueOf(i10));
        if (this.f29581d) {
            ALog.d("awcn.SessionRequest", "session connecting", str, "host", a());
            if (sessionGetCallback != null) {
                if (b() == i10) {
                    c cVar = new c(sessionGetCallback);
                    synchronized (this.f29584g) {
                        this.f29584g.put(sessionGetCallback, cVar);
                    }
                    ThreadPoolExecutorFactory.submitScheduledTask(cVar, j10, TimeUnit.MILLISECONDS);
                } else {
                    sessionGetCallback.onSessionGetFail();
                }
            }
            return;
        }
        a(true);
        this.f29588k = ThreadPoolExecutorFactory.submitScheduledTask(new b(str), 45L, TimeUnit.SECONDS);
        SessionConnStat sessionConnStat = new SessionConnStat();
        this.f29585h = sessionConnStat;
        sessionConnStat.start = System.currentTimeMillis();
        if (!NetworkStatusHelper.isConnected()) {
            if (ALog.isPrintLog(1)) {
                ALog.d("awcn.SessionRequest", "network is not available, can't create session", str, "isConnected", Boolean.valueOf(NetworkStatusHelper.isConnected()));
            }
            c();
            throw new RuntimeException("no network");
        }
        List<IConnStrategy> listA = a(i10, str);
        if (listA.isEmpty()) {
            ALog.i("awcn.SessionRequest", "no avalible strategy, can't create session", str, "host", this.f29586i, "type", Integer.valueOf(i10));
            c();
            throw new NoAvailStrategyException("no avalible strategy");
        }
        List<anet.channel.entity.a> listA2 = a(listA, str);
        try {
            anet.channel.entity.a aVarRemove = listA2.remove(0);
            a(context, aVarRemove, new a(context, listA2, aVarRemove), aVarRemove.h());
            if (sessionGetCallback != null) {
                c cVar2 = new c(sessionGetCallback);
                synchronized (this.f29584g) {
                    this.f29584g.put(sessionGetCallback, cVar2);
                }
                ThreadPoolExecutorFactory.submitScheduledTask(cVar2, j10, TimeUnit.MILLISECONDS);
            }
        } catch (Throwable unused) {
            c();
        }
        return;
        throw th;
    }

    void a(Session session) {
        AlarmObject alarmObject = new AlarmObject();
        alarmObject.module = "networkPrefer";
        alarmObject.modulePoint = ak.bo;
        alarmObject.arg = this.f29586i;
        alarmObject.isSuccess = true;
        AppMonitor.getInstance().commitAlarm(alarmObject);
        this.f29585h.syncValueFromSession(session);
        SessionConnStat sessionConnStat = this.f29585h;
        sessionConnStat.ret = 1;
        sessionConnStat.totalTime = System.currentTimeMillis() - this.f29585h.start;
        AppMonitor.getInstance().commitStat(this.f29585h);
    }

    void a(Session session, int i10, int i11) {
        if (256 != i10 || i11 == -2613 || i11 == -2601) {
            return;
        }
        AlarmObject alarmObject = new AlarmObject();
        alarmObject.module = "networkPrefer";
        alarmObject.modulePoint = ak.bo;
        alarmObject.arg = this.f29586i;
        alarmObject.errorCode = String.valueOf(i11);
        alarmObject.isSuccess = false;
        AppMonitor.getInstance().commitAlarm(alarmObject);
        SessionConnStat sessionConnStat = this.f29585h;
        sessionConnStat.ret = 0;
        sessionConnStat.appendErrorTrace(i11);
        this.f29585h.errorCode = String.valueOf(i11);
        this.f29585h.totalTime = System.currentTimeMillis() - this.f29585h.start;
        this.f29585h.syncValueFromSession(session);
        AppMonitor.getInstance().commitStat(this.f29585h);
    }

    void a(Session session, int i10, String str) {
        if (AwcnConfig.isSendConnectInfoByService()) {
            b(session, i10, str);
        }
        c(session, i10, str);
    }

    protected void a(String str) {
        ALog.d("awcn.SessionRequest", "reCreateSession", str, "host", this.f29586i);
        b(true);
    }

    void a(boolean z10) {
        this.f29581d = z10;
        if (z10) {
            return;
        }
        if (this.f29588k != null) {
            this.f29588k.cancel(true);
            this.f29588k = null;
        }
        this.f29582e = null;
    }

    protected int b() {
        Session session = this.f29582e;
        if (session != null) {
            return session.f29549j.getType();
        }
        return -1;
    }

    protected synchronized void b(Context context, int i10, String str, SessionGetCallback sessionGetCallback, long j10) {
        Session sessionA = this.f29579b.a(this, i10);
        if (sessionA != null) {
            ALog.d("awcn.SessionRequest", "Available Session exist!!!", str, new Object[0]);
            sessionGetCallback.onSessionGetSuccess(sessionA);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = anet.channel.util.i.a(null);
        }
        ALog.d("awcn.SessionRequest", "SessionRequest start", str, "host", this.f29586i, "type", Integer.valueOf(i10));
        if (this.f29581d) {
            ALog.d("awcn.SessionRequest", "session connecting", str, "host", a());
            if (b() == i10) {
                c cVar = new c(sessionGetCallback);
                synchronized (this.f29584g) {
                    this.f29584g.put(sessionGetCallback, cVar);
                }
                ThreadPoolExecutorFactory.submitScheduledTask(cVar, j10, TimeUnit.MILLISECONDS);
            } else {
                sessionGetCallback.onSessionGetFail();
            }
            return;
        }
        a(true);
        this.f29588k = ThreadPoolExecutorFactory.submitScheduledTask(new b(str), 45L, TimeUnit.SECONDS);
        SessionConnStat sessionConnStat = new SessionConnStat();
        this.f29585h = sessionConnStat;
        sessionConnStat.start = System.currentTimeMillis();
        if (!NetworkStatusHelper.isConnected()) {
            if (ALog.isPrintLog(1)) {
                ALog.d("awcn.SessionRequest", "network is not available, can't create session", str, "isConnected", Boolean.valueOf(NetworkStatusHelper.isConnected()));
            }
            c();
            throw new RuntimeException("no network");
        }
        List<IConnStrategy> listA = a(i10, str);
        if (listA.isEmpty()) {
            ALog.i("awcn.SessionRequest", "no avalible strategy, can't create session", str, "host", this.f29586i, "type", Integer.valueOf(i10));
            c();
            throw new NoAvailStrategyException("no avalible strategy");
        }
        List<anet.channel.entity.a> listA2 = a(listA, str);
        try {
            anet.channel.entity.a aVarRemove = listA2.remove(0);
            a(context, aVarRemove, new a(context, listA2, aVarRemove), aVarRemove.h());
            c cVar2 = new c(sessionGetCallback);
            synchronized (this.f29584g) {
                this.f29584g.put(sessionGetCallback, cVar2);
            }
            ThreadPoolExecutorFactory.submitScheduledTask(cVar2, j10, TimeUnit.MILLISECONDS);
        } catch (Throwable unused) {
            c();
        }
        return;
        throw th;
    }

    protected void b(boolean z10) {
        ALog.d("awcn.SessionRequest", "closeSessions", this.f29578a.f29569c, "host", this.f29586i, "autoCreate", Boolean.valueOf(z10));
        if (!z10 && this.f29582e != null) {
            this.f29582e.f29560u = false;
            this.f29582e.close(false);
        }
        List<Session> listA = this.f29579b.a(this);
        if (listA != null) {
            for (Session session : listA) {
                if (session != null) {
                    session.close(z10);
                }
            }
        }
    }

    void c() {
        a(false);
        synchronized (this.f29589l) {
            this.f29589l.notifyAll();
        }
    }
}
