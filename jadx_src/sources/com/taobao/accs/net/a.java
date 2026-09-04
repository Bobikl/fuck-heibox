package com.taobao.accs.net;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import anet.channel.Config;
import anet.channel.SessionCenter;
import anet.channel.entity.ConnType;
import anet.channel.entity.ENV;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.StrategyTemplate;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.ErrorCode;
import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.data.Message;
import com.taobao.accs.ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import com.umeng.message.PushAgent;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final int ACCS_RECEIVE_TIMEOUT = 40000;
    public static final int INAPP = 1;
    public static final int SERVICE = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected static int f98296n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f98298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f98299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Context f98300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected com.taobao.accs.data.d f98301e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.taobao.accs.client.b f98304h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AccsClientConfig f98305i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected String f98306j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f98309m;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Runnable f98313r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ScheduledFuture<?> f98314s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f98297a = "android@umeng";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f98302f = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f98310o = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected volatile boolean f98303g = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected String f98307k = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f98311p = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected LinkedHashMap<Integer, Message> f98308l = new LinkedHashMap<Integer, Message>() { // from class: com.taobao.accs.net.BaseConnection$1
        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<Integer, Message> entry) {
            return size() > 10;
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ArrayList<AccsConnectStateListener> f98312q = new ArrayList<>();

    protected a(Context context, int i10, String str) {
        this.f98298b = "";
        this.f98299c = i10;
        this.f98300d = context.getApplicationContext();
        AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
        this.f98305i = configByTag;
        if (configByTag == null) {
            ALog.e(d(), "BaseConnection config null!!", new Object[0]);
            try {
                PushAgent pushAgent = PushAgent.getInstance(context);
                pushAgent.register(pushAgent.getRegisterCallback());
                this.f98305i = AccsClientConfig.getConfigByTag(str);
            } catch (Throwable th2) {
                ALog.e(d(), "BaseConnection build config", th2, new Object[0]);
            }
        }
        AccsClientConfig accsClientConfig = this.f98305i;
        if (accsClientConfig != null) {
            this.f98309m = accsClientConfig.getTag();
            this.f98298b = this.f98305i.getAppKey();
        }
        com.taobao.accs.data.d dVar = new com.taobao.accs.data.d(context, this);
        this.f98301e = dVar;
        dVar.f98244b = this.f98299c;
        ALog.d(d(), "new connection", new Object[0]);
    }

    protected String a(int i10) {
        if (i10 == 1) {
            return "CONNECTED";
        }
        if (i10 != 2) {
            return (i10 == 3 || i10 != 4) ? "DISCONNECTED" : "DISCONNECTING";
        }
        return "CONNECTING";
    }

    public abstract void a();

    protected void a(Context context) {
        try {
            ENV env = ENV.ONLINE;
            int i10 = AccsClientConfig.mEnv;
            if (i10 == 2) {
                env = ENV.TEST;
                SessionCenter.switchEnvironment(env);
            } else if (i10 == 1) {
                env = ENV.PREPARE;
                SessionCenter.switchEnvironment(env);
            }
            SessionCenter.init(context, new Config.Builder().setAppkey(this.f98298b).setAppSecret(this.f98305i.getAppSecret()).setAuthCode(this.f98305i.getAuthCode()).setEnv(env).setTag(this.f98305i.getAppKey()).build());
            String str = ConnType.PK_ACS;
            if (this.f98305i.getInappPubKey() == 10 || this.f98305i.getInappPubKey() == 11) {
                str = "open";
            }
            ALog.i(d(), "init awcn register new conn protocol host:", this.f98305i.getInappHost());
            StrategyTemplate.getInstance().registerConnProtocol(this.f98305i.getInappHost(), ConnProtocol.valueOf(ConnType.HTTP2, ConnType.RTT_0, str, false));
        } catch (Throwable th2) {
            ALog.e(d(), "initAwcn", th2, new Object[0]);
        }
    }

    public void a(AccsConnectStateListener accsConnectStateListener) {
        synchronized (this.f98312q) {
            this.f98312q.add(accsConnectStateListener);
        }
    }

    public abstract void a(Message message, boolean z10);

    protected void a(String str, boolean z10, long j10) {
        ThreadPoolExecutorFactory.getScheduledExecutor().schedule(new b(this, str, z10), j10, TimeUnit.MILLISECONDS);
    }

    public abstract void a(String str, boolean z10, String str2);

    public abstract void a(boolean z10, boolean z11);

    protected boolean a(Message message, int i10) {
        boolean z10 = true;
        try {
            int i11 = message.retryTimes;
            if (i11 > 3) {
                return false;
            }
            message.retryTimes = i11 + 1;
            message.delyTime = i10;
            ALog.e(d(), "reSend dataid:" + message.dataId + " retryTimes:" + message.retryTimes, new Object[0]);
            b(message, true);
            try {
                if (message.getNetPermanceMonitor() != null) {
                    message.getNetPermanceMonitor().take_date = 0L;
                    message.getNetPermanceMonitor().to_tnet_date = 0L;
                    NetPerformanceMonitor netPermanceMonitor = message.getNetPermanceMonitor();
                    int i12 = message.retryTimes;
                    netPermanceMonitor.retry_times = i12;
                    if (i12 == 1) {
                        com.taobao.accs.utl.k.a("accs", BaseMonitor.COUNT_POINT_RESEND, "total", 0.0d);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                this.f98301e.a(message, -8);
                ALog.e(d(), "reSend error", th, new Object[0]);
            }
            return z10;
        } catch (Throwable th3) {
            th = th3;
            z10 = false;
        }
        this.f98301e.a(message, -8);
        ALog.e(d(), "reSend error", th, new Object[0]);
        return z10;
    }

    public abstract boolean a(String str);

    public String b(String str) {
        String inappHost = this.f98305i.getInappHost();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("https://");
        sb2.append(TextUtils.isEmpty(str) ? "" : str);
        sb2.append(inappHost);
        String string = sb2.toString();
        try {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("https://");
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            sb3.append(str);
            sb3.append(inappHost);
            return sb3.toString();
        } catch (Throwable th2) {
            ALog.e("InAppConnection", "getHost", th2, new Object[0]);
            return string;
        }
    }

    public abstract void b();

    protected void b(int i10) {
        if (i10 < 0) {
            ALog.e(d(), "reSendAck", Constants.KEY_DATA_ID, Integer.valueOf(i10));
            Message message = this.f98308l.get(Integer.valueOf(i10));
            if (message != null) {
                a(message, 5000);
                com.taobao.accs.utl.k.a("accs", BaseMonitor.COUNT_POINT_RESEND, BaseMonitor.COUNT_ACK, 0.0d);
            }
        }
    }

    public void b(AccsConnectStateListener accsConnectStateListener) {
        synchronized (this.f98312q) {
            this.f98312q.remove(accsConnectStateListener);
        }
    }

    public void b(Message message, int i10) {
        this.f98301e.a(message, i10);
    }

    public void b(Message message, boolean z10) {
        if (!message.isAck && !UtilityImpl.i(this.f98300d)) {
            ALog.e(d(), "sendMessage ready no network", Constants.KEY_DATA_ID, message.dataId);
            this.f98301e.a(message, -13);
            return;
        }
        long jA = message.getType() != 2 ? this.f98301e.f98246d.a(message.serviceId, message.bizId) : 0L;
        if (jA == -1) {
            ALog.e(d(), "sendMessage ready server limit high", Constants.KEY_DATA_ID, message.dataId);
            this.f98301e.a(message, ErrorCode.SERVIER_HIGH_LIMIT);
            return;
        }
        if (jA == -1000) {
            ALog.e(d(), "sendMessage ready server limit high for brush", Constants.KEY_DATA_ID, message.dataId);
            this.f98301e.a(message, ErrorCode.SERVIER_HIGH_LIMIT_BRUSH);
            return;
        }
        if (jA > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = this.f98310o;
            if (jCurrentTimeMillis > j10) {
                message.delyTime = jA;
            } else {
                message.delyTime = (j10 + jA) - System.currentTimeMillis();
            }
            this.f98310o = System.currentTimeMillis() + message.delyTime;
            ALog.e(d(), "sendMessage ready", Constants.KEY_DATA_ID, message.dataId, "type", Message.MsgType.name(message.getType()), "delay", Long.valueOf(message.delyTime));
        } else if ("accs".equals(message.serviceId)) {
            ALog.e(d(), "sendMessage ready", Constants.KEY_DATA_ID, message.dataId, "type", Message.MsgType.name(message.getType()), "delay", Long.valueOf(message.delyTime));
        } else if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.d(d(), "sendMessage ready", Constants.KEY_DATA_ID, message.dataId, "type", Message.MsgType.name(message.getType()), "delay", Long.valueOf(message.delyTime));
        }
        try {
            if (TextUtils.isEmpty(this.f98306j)) {
                this.f98306j = UtilityImpl.j(this.f98300d);
            }
            if (message.isTimeOut()) {
                this.f98301e.a(message, -9);
            } else {
                a(message, z10);
            }
        } catch (RejectedExecutionException unused) {
            this.f98301e.a(message, ErrorCode.MESSAGE_QUEUE_FULL);
            ALog.e(d(), "sendMessage ready queue full", UiKitSpanObj.TYPE_SIZE, Integer.valueOf(ThreadPoolExecutorFactory.getSendScheduledExecutor().getQueue().size()));
        }
    }

    public abstract com.taobao.accs.ut.a.c c();

    protected String c(String str) {
        String strEncode;
        String strJ = UtilityImpl.j(this.f98300d);
        try {
            strEncode = URLEncoder.encode(strJ);
        } catch (Throwable th2) {
            ALog.e(d(), "buildAuthUrl", th2, new Object[0]);
            strEncode = strJ;
        }
        String strA = UtilityImpl.a(i(), this.f98305i.getAppSecret(), strJ);
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append(str);
        sb2.append("auth?1=");
        sb2.append(strEncode);
        sb2.append("&2=");
        sb2.append(strA);
        sb2.append("&3=");
        sb2.append(i());
        if (this.f98307k != null) {
            sb2.append("&4=");
            sb2.append(this.f98307k);
        }
        sb2.append("&5=");
        sb2.append(this.f98299c);
        sb2.append("&6=");
        sb2.append(UtilityImpl.g(this.f98300d));
        sb2.append("&7=");
        sb2.append(UtilityImpl.d());
        sb2.append("&8=");
        sb2.append(this.f98299c == 1 ? "1.1.2" : 221);
        sb2.append("&9=");
        sb2.append(System.currentTimeMillis());
        sb2.append("&10=");
        sb2.append(1);
        sb2.append("&11=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append("&12=");
        sb2.append(this.f98300d.getPackageName());
        sb2.append("&13=");
        sb2.append(UtilityImpl.l(this.f98300d));
        sb2.append("&14=");
        sb2.append(this.f98297a);
        sb2.append("&15=");
        sb2.append(UtilityImpl.b(Build.MODEL));
        sb2.append("&16=");
        sb2.append(UtilityImpl.b(Build.BRAND));
        sb2.append("&17=");
        sb2.append("221");
        sb2.append("&19=");
        sb2.append(!l() ? 1 : 0);
        sb2.append("&20=");
        sb2.append(this.f98305i.getStoreId());
        return sb2.toString();
    }

    public void c(int i10) {
        f98296n = i10 != 1 ? 0 : 1;
    }

    public abstract String d();

    public void e() {
    }

    protected void f() {
        if (this.f98313r == null) {
            this.f98313r = new c(this);
        }
        g();
        this.f98314s = ThreadPoolExecutorFactory.getScheduledExecutor().schedule(this.f98313r, 40000L, TimeUnit.MILLISECONDS);
    }

    protected void g() {
        ScheduledFuture<?> scheduledFuture = this.f98314s;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    protected boolean h() {
        return true;
    }

    public String i() {
        return this.f98298b;
    }

    public com.taobao.accs.client.b j() {
        if (this.f98304h == null) {
            ALog.d(d(), "new ClientManager", Constants.KEY_CONFIG_TAG, this.f98309m);
            this.f98304h = new com.taobao.accs.client.b(this.f98300d, this.f98309m);
        }
        return this.f98304h;
    }

    public void k() {
        try {
            ThreadPoolExecutorFactory.schedule(new d(this), 10000L, TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            ALog.w(d(), "startChannelService", th2, new Object[0]);
        }
    }

    public boolean l() {
        return 2 == this.f98305i.getSecurity();
    }

    public boolean m() {
        return false;
    }

    protected ArrayList<AccsConnectStateListener> n() {
        return this.f98312q;
    }
}
