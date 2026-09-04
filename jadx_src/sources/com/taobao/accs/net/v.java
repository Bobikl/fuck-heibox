package com.taobao.accs.net;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.strategy.IConnStrategy;
import com.google.android.exoplayer2.source.rtsp.k0;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.max.xiaoheihe.module.voice.HeyboxMicFragment;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.ErrorCode;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.data.Message;
import com.taobao.accs.ut.monitor.SessionMonitor;
import com.taobao.accs.ut.monitor.TrafficsMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import java.net.URL;
import java.net.URLEncoder;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.android.spdy.RequestPriority;
import org.android.spdy.SessionCb;
import org.android.spdy.SessionInfo;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdyByteArray;
import org.android.spdy.SpdyDataProvider;
import org.android.spdy.SpdyRequest;
import org.android.spdy.SpdySession;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import org.android.spdy.Spdycb;
import org.android.spdy.SuperviseConnectInfo;
import org.android.spdy.SuperviseData;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class v extends com.taobao.accs.net.a implements SessionCb, Spdycb {
    private SpdySession A;
    private Object B;
    private long C;
    private long D;
    private long E;
    private long F;
    private int G;
    private String H;
    private SessionMonitor I;
    private com.taobao.accs.ut.a.c J;
    private boolean K;
    private String L;
    private boolean M;
    private h N;
    private String O;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected ScheduledFuture<?> f98369o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected String f98370p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected int f98371q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected String f98372r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected int f98373s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f98374t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private LinkedList<Message> f98375u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private a f98376v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f98377w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f98378x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f98379y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private SpdyAgent f98380z;

    /* JADX INFO: compiled from: Taobao */
    public class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f98381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f98382b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f98384d;

        public a(String str) {
            super(str);
            this.f98384d = getName();
            this.f98381a = 0;
        }

        private void a(boolean z10) {
            if (v.this.f98374t == 1) {
                if (v.this.f98374t != 1 || System.currentTimeMillis() - this.f98382b <= 5000) {
                    return;
                }
                this.f98381a = 0;
                return;
            }
            ALog.d(v.this.d(), "tryConnect", "force", Boolean.valueOf(z10));
            if (!UtilityImpl.i(v.this.f98300d)) {
                ALog.e(this.f98384d, "Network not available", new Object[0]);
                return;
            }
            if (z10) {
                this.f98381a = 0;
            }
            ALog.i(this.f98384d, "tryConnect", "force", Boolean.valueOf(z10), "failTimes", Integer.valueOf(this.f98381a));
            if (v.this.f98374t != 1 && this.f98381a >= 4) {
                v.this.K = true;
                ALog.e(this.f98384d, "tryConnect fail", "maxTimes", 4);
                return;
            }
            if (v.this.f98374t != 1) {
                if (v.this.f98299c == 1 && this.f98381a == 0) {
                    ALog.i(this.f98384d, "tryConnect in app, no sleep", new Object[0]);
                } else {
                    ALog.i(this.f98384d, "tryConnect, need sleep", new Object[0]);
                    try {
                        Thread.sleep(5000L);
                    } catch (InterruptedException e10) {
                        e10.printStackTrace();
                    }
                }
                v.this.L = "";
                if (this.f98381a == 3) {
                    v.this.N.b(v.this.p());
                }
                v.this.d((String) null);
                v.this.I.setRetryTimes(this.f98381a);
                if (v.this.f98374t == 1) {
                    this.f98382b = System.currentTimeMillis();
                    return;
                }
                this.f98381a++;
                ALog.e(this.f98384d, "try connect fail, ready for reconnect", new Object[0]);
                a(false);
            }
        }

        /* JADX WARN: Code duplicated, block: B:104:0x0361 A[Catch: all -> 0x0381, TryCatch #2 {all -> 0x0381, blocks: (B:81:0x02e8, B:83:0x02f5, B:84:0x0301, B:85:0x0307, B:103:0x0360, B:104:0x0361, B:105:0x0371, B:111:0x0380, B:106:0x0372, B:107:0x037b, B:86:0x0308, B:88:0x0315, B:90:0x0323, B:92:0x0327, B:94:0x032d, B:96:0x0335, B:97:0x0345, B:98:0x0348, B:99:0x035b), top: B:200:0x02e8, inners: #14, #15 }] */
        /* JADX WARN: Code duplicated, block: B:200:0x02e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:221:0x0372 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:223:0x0308 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:239:0x0345 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:76:0x02c6  */
        /* JADX WARN: Code duplicated, block: B:83:0x02f5 A[Catch: all -> 0x0381, TryCatch #2 {all -> 0x0381, blocks: (B:81:0x02e8, B:83:0x02f5, B:84:0x0301, B:85:0x0307, B:103:0x0360, B:104:0x0361, B:105:0x0371, B:111:0x0380, B:106:0x0372, B:107:0x037b, B:86:0x0308, B:88:0x0315, B:90:0x0323, B:92:0x0327, B:94:0x032d, B:96:0x0335, B:97:0x0345, B:98:0x0348, B:99:0x035b), top: B:200:0x02e8, inners: #14, #15 }] */
        /* JADX WARN: Code duplicated, block: B:88:0x0315 A[Catch: all -> 0x035e, TryCatch #15 {, blocks: (B:86:0x0308, B:88:0x0315, B:90:0x0323, B:92:0x0327, B:94:0x032d, B:96:0x0335, B:97:0x0345, B:98:0x0348, B:99:0x035b), top: B:223:0x0308, outer: #2 }] */
        /* JADX WARN: Code duplicated, block: B:90:0x0323 A[Catch: all -> 0x035e, TryCatch #15 {, blocks: (B:86:0x0308, B:88:0x0315, B:90:0x0323, B:92:0x0327, B:94:0x032d, B:96:0x0335, B:97:0x0345, B:98:0x0348, B:99:0x035b), top: B:223:0x0308, outer: #2 }] */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Message message;
            boolean z10;
            Integer num;
            Integer num2;
            int size;
            Message message2;
            Integer num3;
            ALog.i(this.f98384d, "NetworkThread run", new Object[0]);
            this.f98381a = 0;
            Message message3 = null;
            while (v.this.f98377w) {
                ALog.d(this.f98384d, "ready to get message", new Object[0]);
                synchronized (v.this.f98375u) {
                    if (v.this.f98375u.size() == 0) {
                        try {
                            ALog.d(this.f98384d, "no message, wait", new Object[0]);
                            v.this.f98375u.wait();
                        } catch (InterruptedException e10) {
                            e10.printStackTrace();
                        }
                    }
                    ALog.d(this.f98384d, "try get message", new Object[0]);
                    if (v.this.f98375u.size() != 0) {
                        message3 = (Message) v.this.f98375u.getFirst();
                        if (message3.getNetPermanceMonitor() != null) {
                            message3.getNetPermanceMonitor().onTakeFromQueue();
                        }
                    }
                    message = message3;
                }
                if (!v.this.f98377w) {
                    break;
                }
                if (message != null) {
                    ALog.d(this.f98384d, "sendMessage not null", new Object[0]);
                    try {
                        int type = message.getType();
                        ALog.i(this.f98384d, "sendMessage", "type", Message.MsgType.name(type), "status", Integer.valueOf(v.this.f98374t));
                        if (type != 2) {
                            if (type == 1) {
                                a(true);
                                if (v.this.f98374t != 1 || v.this.A == null) {
                                    z10 = false;
                                } else {
                                    v vVar = v.this;
                                    byte[] bArrBuild = message.build(vVar.f98300d, vVar.f98299c);
                                    message.setSendTime(System.currentTimeMillis());
                                    if (bArrBuild.length <= 49152 || message.command.intValue() == 102) {
                                        int id2 = message.isAck ? -message.getMsgId().getId() : message.getMsgId().getId();
                                        v.this.A.sendCustomControlFrame(id2, 200, 0, bArrBuild.length, bArrBuild);
                                        ALog.e(this.f98384d, "send data", k0.f48801p, Integer.valueOf(bArrBuild.length), Constants.KEY_DATA_ID, message.getDataId(), "utdid", v.this.f98306j);
                                        v.this.f98301e.a(message);
                                        if (message.isAck) {
                                            ALog.e(this.f98384d, "sendCFrame end ack", Constants.KEY_DATA_ID, Integer.valueOf(id2));
                                            v.this.f98308l.put(Integer.valueOf(id2), message);
                                        }
                                        if (message.getNetPermanceMonitor() != null) {
                                            message.getNetPermanceMonitor().onSendData();
                                        }
                                        v.this.a(message.getDataId(), v.this.f98305i.isQuickReconnect(), message.timeout);
                                        v.this.f98301e.a(new TrafficsMonitor.a(message.serviceId, GlobalAppRuntimeInfo.isAppBackground(), v.this.p(), bArrBuild.length));
                                    } else {
                                        v.this.f98301e.a(message, -4);
                                    }
                                }
                                v.this.t();
                                if (z10) {
                                    ALog.d(this.f98384d, "send succ, remove it", new Object[0]);
                                    synchronized (v.this.f98375u) {
                                        v.this.f98375u.remove(message);
                                    }
                                } else {
                                    v.this.o();
                                    if (v.this.I != null) {
                                        v.this.I.setCloseReason("send fail");
                                    }
                                    synchronized (v.this.f98375u) {
                                        while (size >= 0) {
                                            message2 = (Message) v.this.f98375u.get(size);
                                            if (message2 == null) {
                                            }
                                        }
                                        ALog.e(this.f98384d, "network disconnected, wait", new Object[0]);
                                        v.this.f98375u.wait();
                                    }
                                }
                            } else {
                                a(false);
                                ALog.e(this.f98384d, "skip msg", "type", Integer.valueOf(type));
                            }
                            z10 = true;
                            v.this.t();
                            if (z10) {
                                v.this.o();
                                if (v.this.I != null) {
                                    v.this.I.setCloseReason("send fail");
                                }
                                synchronized (v.this.f98375u) {
                                    while (size >= 0) {
                                        message2 = (Message) v.this.f98375u.get(size);
                                        if (message2 == null) {
                                        }
                                    }
                                    ALog.e(this.f98384d, "network disconnected, wait", new Object[0]);
                                    v.this.f98375u.wait();
                                }
                            } else {
                                ALog.d(this.f98384d, "send succ, remove it", new Object[0]);
                                synchronized (v.this.f98375u) {
                                    v.this.f98375u.remove(message);
                                }
                            }
                        } else if (v.this.f98299c == 1) {
                            ALog.d(this.f98384d, "sendMessage INAPP ping, skip", new Object[0]);
                            try {
                                ALog.d(this.f98384d, "send succ, remove it", new Object[0]);
                                synchronized (v.this.f98375u) {
                                    try {
                                        v.this.f98375u.remove(message);
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th3) {
                                ALog.e(this.f98384d, " run finally error", th3, new Object[0]);
                            }
                        } else {
                            try {
                                if (System.currentTimeMillis() - v.this.C >= (g.a(v.this.f98300d).b() - 1) * 1000 || message.force) {
                                    ALog.d(this.f98384d, "sendMessage", "force", Boolean.valueOf(message.force), "last ping", Long.valueOf(System.currentTimeMillis() - v.this.C));
                                    a(true);
                                    if (v.this.A == null || v.this.f98374t != 1) {
                                        z10 = false;
                                    } else if (System.currentTimeMillis() - v.this.C >= (g.a(v.this.f98300d).b() - 1) * 1000) {
                                        ALog.i(this.f98384d, "sendMessage onSendPing", new Object[0]);
                                        v.this.f98301e.a();
                                        v.this.A.submitPing();
                                        v.this.I.onSendPing();
                                        v.this.C = System.currentTimeMillis();
                                        v.this.D = System.nanoTime();
                                        v.this.f();
                                    }
                                    v.this.t();
                                    if (z10) {
                                        try {
                                            v.this.o();
                                            if (v.this.I != null) {
                                                v.this.I.setCloseReason("send fail");
                                            }
                                            synchronized (v.this.f98375u) {
                                                for (size = v.this.f98375u.size() - 1; size >= 0; size--) {
                                                    message2 = (Message) v.this.f98375u.get(size);
                                                    if (message2 == null && (num3 = message2.command) != null && (num3.intValue() == 100 || message2.command.intValue() == 201)) {
                                                        v.this.f98301e.a(message2, -1);
                                                        v.this.f98375u.remove(size);
                                                    }
                                                }
                                                ALog.e(this.f98384d, "network disconnected, wait", new Object[0]);
                                                v.this.f98375u.wait();
                                            }
                                        } catch (Throwable th4) {
                                            ALog.e(this.f98384d, " run finally error", th4, new Object[0]);
                                        }
                                    } else {
                                        ALog.d(this.f98384d, "send succ, remove it", new Object[0]);
                                        synchronized (v.this.f98375u) {
                                            v.this.f98375u.remove(message);
                                        }
                                    }
                                } else {
                                    a(false);
                                }
                                v.this.t();
                                if (z10) {
                                    v.this.o();
                                    if (v.this.I != null) {
                                        v.this.I.setCloseReason("send fail");
                                    }
                                    synchronized (v.this.f98375u) {
                                        while (size >= 0) {
                                            message2 = (Message) v.this.f98375u.get(size);
                                            if (message2 == null) {
                                            }
                                        }
                                        ALog.e(this.f98384d, "network disconnected, wait", new Object[0]);
                                        v.this.f98375u.wait();
                                    }
                                } else {
                                    ALog.d(this.f98384d, "send succ, remove it", new Object[0]);
                                    synchronized (v.this.f98375u) {
                                        v.this.f98375u.remove(message);
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                try {
                                    com.taobao.accs.utl.k.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, message.serviceId, "1", v.this.f98299c + th.toString());
                                    th.printStackTrace();
                                    ALog.e(this.f98384d, "service connection run", th, new Object[0]);
                                    if (z10) {
                                        ALog.d(this.f98384d, "send succ, remove it", new Object[0]);
                                        synchronized (v.this.f98375u) {
                                            v.this.f98375u.remove(message);
                                        }
                                    } else {
                                        try {
                                            v.this.o();
                                            if (v.this.I != null) {
                                                v.this.I.setCloseReason("send fail");
                                            }
                                            synchronized (v.this.f98375u) {
                                                for (int size2 = v.this.f98375u.size() - 1; size2 >= 0; size2--) {
                                                    Message message4 = (Message) v.this.f98375u.get(size2);
                                                    if (message4 != null && (num2 = message4.command) != null && (num2.intValue() == 100 || message4.command.intValue() == 201)) {
                                                        v.this.f98301e.a(message4, -1);
                                                        v.this.f98375u.remove(size2);
                                                    }
                                                }
                                                ALog.e(this.f98384d, "network disconnected, wait", new Object[0]);
                                                v.this.f98375u.wait();
                                            }
                                        } catch (Throwable th6) {
                                            ALog.e(this.f98384d, " run finally error", th6, new Object[0]);
                                        }
                                    }
                                } catch (Throwable th7) {
                                    try {
                                        if (z10) {
                                            ALog.d(this.f98384d, "send succ, remove it", new Object[0]);
                                            synchronized (v.this.f98375u) {
                                                v.this.f98375u.remove(message);
                                                throw th7;
                                            }
                                        }
                                        v.this.o();
                                        if (v.this.I != null) {
                                            v.this.I.setCloseReason("send fail");
                                        }
                                        synchronized (v.this.f98375u) {
                                            for (int size3 = v.this.f98375u.size() - 1; size3 >= 0; size3--) {
                                                Message message5 = (Message) v.this.f98375u.get(size3);
                                                if (message5 != null && (num = message5.command) != null && (num.intValue() == 100 || message5.command.intValue() == 201)) {
                                                    v.this.f98301e.a(message5, -1);
                                                    v.this.f98375u.remove(size3);
                                                }
                                            }
                                            ALog.e(this.f98384d, "network disconnected, wait", new Object[0]);
                                            v.this.f98375u.wait();
                                            throw th7;
                                        }
                                    } catch (Throwable th8) {
                                        ALog.e(this.f98384d, " run finally error", th8, new Object[0]);
                                        throw th7;
                                    }
                                    ALog.e(this.f98384d, " run finally error", th8, new Object[0]);
                                    throw th7;
                                }
                            }
                            z10 = true;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        z10 = true;
                    }
                }
                message3 = message;
            }
            v.this.o();
        }
    }

    public v(Context context, int i10, String str) {
        super(context, i10, str);
        this.f98374t = 3;
        this.f98375u = new LinkedList<>();
        this.f98377w = true;
        this.f98380z = null;
        this.A = null;
        this.B = new Object();
        this.G = -1;
        this.H = null;
        this.K = false;
        this.L = "";
        this.M = false;
        this.N = new h(p());
        u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        if (message.command == null || this.f98375u.size() == 0) {
            return;
        }
        for (int size = this.f98375u.size() - 1; size >= 0; size--) {
            Message message2 = this.f98375u.get(size);
            if (message2 != null && message2.command != null && message2.getPackageName().equals(message.getPackageName())) {
                switch (message.command.intValue()) {
                    case 1:
                    case 2:
                        if (message2.command.intValue() == 1 || message2.command.intValue() == 2) {
                            this.f98375u.remove(size);
                        }
                        break;
                    case 3:
                    case 4:
                        if (message2.command.intValue() == 3 || message2.command.intValue() == 4) {
                            this.f98375u.remove(size);
                        }
                        break;
                    case 5:
                    case 6:
                        if (message2.command.intValue() == 5 || message2.command.intValue() == 6) {
                            this.f98375u.remove(size);
                        }
                        break;
                }
                ALog.d(d(), "clearRepeatControlCommand message:" + message2.command + "/" + message2.getPackageName(), new Object[0]);
            }
        }
        com.taobao.accs.data.d dVar = this.f98301e;
        if (dVar != null) {
            dVar.b(message);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    private boolean a(String str, String str2, String str3) {
        if (com.taobao.accs.utl.v.b(this.f98300d) == 2) {
            return true;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            return true;
        }
        int i10 = 3;
        d(3);
        if (TextUtils.isEmpty(str)) {
            i10 = 1;
        } else if (TextUtils.isEmpty(str2)) {
            i10 = 2;
        } else if (!TextUtils.isEmpty(str3)) {
            i10 = 1;
        }
        this.I.setFailReason(i10);
        this.I.onConnectStop();
        String str4 = this.f98299c == 0 ? "service" : "inapp";
        a aVar = this.f98376v;
        int i11 = aVar != null ? aVar.f98381a : 0;
        UTMini.getInstance().commitEvent(66001, "DISCONNECT " + str4, (Object) Integer.valueOf(i10), (Object) Integer.valueOf(i11), (Object) 221, this.f98379y, this.L);
        com.taobao.accs.utl.k.a("accs", "connect", "retrytimes:" + i11, i10 + "", "");
        return false;
    }

    private synchronized void d(int i10) {
        ALog.e(d(), "notifyStatus start", "status", a(i10));
        if (i10 == this.f98374t) {
            ALog.i(d(), "ignore notifyStatus", new Object[0]);
            return;
        }
        this.f98374t = i10;
        if (i10 == 1) {
            g.a(this.f98300d).f();
            t();
            ScheduledFuture<?> scheduledFuture = this.f98369o;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            synchronized (this.B) {
                try {
                    this.B.notifyAll();
                } catch (Exception unused) {
                }
            }
            synchronized (this.f98375u) {
                try {
                    this.f98375u.notifyAll();
                } catch (Exception unused2) {
                }
            }
            ALog.i(d(), "notifyStatus end", "status", a(i10));
        }
        if (i10 == 2) {
            ScheduledFuture<?> scheduledFuture2 = this.f98369o;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(true);
            }
            ThreadPoolExecutorFactory.getScheduledExecutor().schedule(new y(this, this.O), 120000L, TimeUnit.MILLISECONDS);
        } else if (i10 == 3) {
            t();
            g.a(this.f98300d).d();
            synchronized (this.B) {
                try {
                    this.B.notifyAll();
                } catch (Exception unused3) {
                }
            }
            this.f98301e.a(-10);
            a(false, true);
        }
        ALog.i(d(), "notifyStatus end", "status", a(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        SessionInfo sessionInfo;
        int i10 = this.f98374t;
        if (i10 == 2 || i10 == 1) {
            return;
        }
        if (this.N == null) {
            this.N = new h(p());
        }
        List<IConnStrategy> listA = this.N.a(p());
        if (listA == null || listA.size() <= 0) {
            if (str != null) {
                this.f98370p = str;
            } else {
                this.f98370p = p();
            }
            this.f98371q = System.currentTimeMillis() % 2 == 0 ? 80 : 443;
            com.taobao.accs.utl.k.a("accs", BaseMonitor.COUNT_POINT_DNS, "localdns", 0.0d);
            ALog.i(d(), "connect get ip from amdc fail!!", new Object[0]);
        } else {
            for (IConnStrategy iConnStrategy : listA) {
                if (iConnStrategy != null) {
                    ALog.e(d(), "connect", "ip", iConnStrategy.getIp(), HeyboxMicFragment.f93763y, Integer.valueOf(iConnStrategy.getPort()));
                }
            }
            if (this.M) {
                this.N.b();
                this.M = false;
            }
            IConnStrategy iConnStrategyA = this.N.a();
            this.f98370p = iConnStrategyA == null ? p() : iConnStrategyA.getIp();
            this.f98371q = iConnStrategyA != null ? iConnStrategyA.getPort() : 443;
            com.taobao.accs.utl.k.a("accs", BaseMonitor.COUNT_POINT_DNS, "httpdns", 0.0d);
            ALog.e(d(), "connect from amdc succ", "ip", this.f98370p, HeyboxMicFragment.f93763y, Integer.valueOf(this.f98371q), "originPos", Integer.valueOf(this.N.c()));
        }
        this.f98378x = "https://" + this.f98370p + ":" + this.f98371q + "/accs/";
        ALog.e(d(), "connect", "URL", this.f98378x);
        this.O = String.valueOf(System.currentTimeMillis());
        if (this.I != null) {
            AppMonitor.getInstance().commitStat(this.I);
        }
        SessionMonitor sessionMonitor = new SessionMonitor();
        this.I = sessionMonitor;
        sessionMonitor.setConnectType(this.f98299c == 0 ? "service" : "inapp");
        if (this.f98380z != null) {
            try {
                this.E = System.currentTimeMillis();
                this.F = System.nanoTime();
                this.f98372r = UtilityImpl.a(this.f98300d);
                this.f98373s = UtilityImpl.b(this.f98300d);
                this.C = System.currentTimeMillis();
                this.I.onStartConnect();
                d(2);
                synchronized (this.B) {
                    try {
                        if (TextUtils.isEmpty(this.f98372r) || this.f98373s < 0 || !this.K) {
                            ALog.e(d(), "connect normal", new Object[0]);
                            sessionInfo = new SessionInfo(this.f98370p, this.f98371q, p() + lg.a.f131412e + this.f98298b, null, 0, this.O, this, 4226);
                            this.L = "";
                        } else {
                            ALog.e(d(), "connect", WebviewFragment.A4, this.f98372r, HeyboxMicFragment.f93763y, Integer.valueOf(this.f98373s));
                            sessionInfo = new SessionInfo(this.f98370p, this.f98371q, p() + lg.a.f131412e + this.f98298b, this.f98372r, this.f98373s, this.O, this, 4226);
                            this.L = this.f98372r + ":" + this.f98373s;
                        }
                        sessionInfo.setPubKeySeqNum(r());
                        sessionInfo.setConnectionTimeoutMs(40000);
                        this.A = this.f98380z.createSession(sessionInfo);
                        this.I.connection_stop_date = 0L;
                        this.B.wait();
                    } catch (InterruptedException e10) {
                        e10.printStackTrace();
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        this.K = false;
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    private void e(int i10) {
        this.f98307k = null;
        o();
        a aVar = this.f98376v;
        int i11 = aVar != null ? aVar.f98381a : 0;
        this.I.setCloseReason("code not 200 is" + i10);
        this.M = true;
        String str = this.f98299c == 0 ? "service" : "inapp";
        UTMini.getInstance().commitEvent(66001, "CONNECTED NO 200 " + str, (Object) Integer.valueOf(i10), (Object) Integer.valueOf(i11), (Object) 221, this.f98379y, this.L);
        com.taobao.accs.utl.k.a("accs", "auth", "", i10 + "", "");
    }

    private int r() {
        boolean zL = l();
        if (AccsClientConfig.mEnv == 2) {
            return 0;
        }
        int channelPubKey = this.f98305i.getChannelPubKey();
        if (channelPubKey <= 0) {
            return zL ? 4 : 3;
        }
        ALog.i(d(), "getPublicKeyType use custom pub key", "pubKey", Integer.valueOf(channelPubKey));
        return channelPubKey;
    }

    private void s() {
        if (this.A == null) {
            d(3);
            return;
        }
        try {
            String strEncode = URLEncoder.encode(UtilityImpl.j(this.f98300d));
            String strA = UtilityImpl.a(i(), this.f98305i.getAppSecret(), UtilityImpl.j(this.f98300d));
            String strC = c(this.f98378x);
            ALog.e(d(), "auth", "url", strC);
            this.f98379y = strC;
            if (!a(strEncode, i(), strA)) {
                ALog.e(d(), "auth param error!", new Object[0]);
                e(-6);
            } else {
                SpdyRequest spdyRequest = new SpdyRequest(new URL(strC), "GET", RequestPriority.DEFAULT_PRIORITY, com.google.android.exoplayer2.audio.b.f44079a, 40000);
                spdyRequest.setDomain(p());
                this.A.submitRequest(spdyRequest, new SpdyDataProvider((byte[]) null), p(), this);
            }
        } catch (Throwable th2) {
            ALog.e(d(), "auth exception ", th2, new Object[0]);
            e(-7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void t() {
        if (this.f98299c == 1) {
            return;
        }
        this.C = System.currentTimeMillis();
        this.D = System.nanoTime();
        g.a(this.f98300d).a();
    }

    private void u() {
        try {
            SpdyAgent.enableDebug = ALog.isPrintLog();
            this.f98380z = SpdyAgent.getInstance(this.f98300d, SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
            if (SpdyAgent.checkLoadSucc()) {
                com.taobao.accs.utl.q.a();
            } else {
                ALog.e(d(), "initClient", new Object[0]);
                this.f98380z = null;
                com.taobao.accs.utl.q.b();
            }
        } catch (Throwable th2) {
            ALog.e(d(), "initClient", th2, new Object[0]);
        }
    }

    @Override // com.taobao.accs.net.a
    public void a() {
        this.f98377w = true;
        ALog.d(d(), com.google.android.exoplayer2.text.ttml.d.f49798o0, new Object[0]);
        a(this.f98300d);
        if (this.f98376v == null) {
            ALog.i(d(), "start thread", new Object[0]);
            a aVar = new a("NetworkThread_" + this.f98309m);
            this.f98376v = aVar;
            aVar.setPriority(2);
            this.f98376v.start();
        }
        a(false, false);
    }

    @Override // com.taobao.accs.net.a
    protected void a(Context context) {
        if (this.f98303g) {
            return;
        }
        super.a(context);
        GlobalAppRuntimeInfo.setBackground(false);
        this.f98303g = true;
        ALog.i(d(), "init awcn success!", new Object[0]);
    }

    @Override // com.taobao.accs.net.a
    public void a(Message message, boolean z10) {
        if (!this.f98377w || message == null) {
            ALog.e(d(), "not running or msg null! " + this.f98377w, new Object[0]);
            return;
        }
        try {
            if (ThreadPoolExecutorFactory.getScheduledExecutor().getQueue().size() > 1000) {
                throw new RejectedExecutionException("accs");
            }
            ScheduledFuture<?> scheduledFutureSchedule = ThreadPoolExecutorFactory.getScheduledExecutor().schedule(new w(this, message, z10), message.delyTime, TimeUnit.MILLISECONDS);
            if (message.getType() == 1 && message.cunstomDataId != null) {
                if (message.isControlFrame()) {
                    a(message.cunstomDataId);
                }
                this.f98301e.f98243a.put(message.cunstomDataId, scheduledFutureSchedule);
            }
            if (message.getNetPermanceMonitor() != null) {
                message.getNetPermanceMonitor().setDeviceId(UtilityImpl.j(this.f98300d));
                message.getNetPermanceMonitor().setConnType(this.f98299c);
                message.getNetPermanceMonitor().onEnterQueueData();
            }
        } catch (RejectedExecutionException unused) {
            this.f98301e.a(message, ErrorCode.MESSAGE_QUEUE_FULL);
            ALog.e(d(), "send queue full count:" + ThreadPoolExecutorFactory.getScheduledExecutor().getQueue().size(), new Object[0]);
        } catch (Throwable th2) {
            this.f98301e.a(message, -8);
            ALog.e(d(), "send error", th2, new Object[0]);
        }
    }

    @Override // com.taobao.accs.net.a
    public void a(String str, boolean z10, String str2) {
        try {
            d(4);
            o();
            this.I.setCloseReason(str2);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.taobao.accs.net.a
    public void a(boolean z10, boolean z11) {
        ALog.d(d(), "try ping, force:" + z10, new Object[0]);
        if (this.f98299c == 1) {
            ALog.d(d(), "INAPP, skip", new Object[0]);
            return;
        }
        Message messageBuildPing = Message.BuildPing(z10, (int) (z11 ? Math.random() * 10.0d * 1000.0d : 0.0d));
        int pingTimeout = this.f98305i.getPingTimeout();
        if (pingTimeout > 0) {
            messageBuildPing.timeout = pingTimeout;
        }
        b(messageBuildPing, z10);
    }

    @Override // com.taobao.accs.net.a
    public boolean a(String str) {
        boolean z10;
        String str2;
        synchronized (this.f98375u) {
            z10 = true;
            for (int size = this.f98375u.size() - 1; size >= 0; size--) {
                Message message = this.f98375u.get(size);
                if (message != null && message.getType() == 1 && (str2 = message.cunstomDataId) != null && str2.equals(str)) {
                    this.f98375u.remove(size);
                }
            }
            z10 = false;
        }
        return z10;
    }

    @Override // com.taobao.accs.net.a
    public String b(String str) {
        return "https://" + this.f98305i.getChannelHost();
    }

    @Override // com.taobao.accs.net.a
    public void b() {
        this.K = false;
        this.f98302f = 0;
    }

    @Override // org.android.spdy.SessionCb
    public void bioPingRecvCallback(SpdySession spdySession, int i10) {
        ALog.w(d(), "bioPingRecvCallback uniId:" + i10, new Object[0]);
    }

    @Override // com.taobao.accs.net.a
    public com.taobao.accs.ut.a.c c() {
        if (this.J == null) {
            this.J = new com.taobao.accs.ut.a.c();
        }
        com.taobao.accs.ut.a.c cVar = this.J;
        cVar.f98405b = this.f98299c;
        cVar.f98407d = this.f98375u.size();
        this.J.f98412i = UtilityImpl.i(this.f98300d);
        com.taobao.accs.ut.a.c cVar2 = this.J;
        cVar2.f98409f = this.L;
        cVar2.f98404a = this.f98374t;
        SessionMonitor sessionMonitor = this.I;
        cVar2.f98406c = sessionMonitor != null && sessionMonitor.getRet();
        this.J.f98413j = q();
        com.taobao.accs.ut.a.c cVar3 = this.J;
        com.taobao.accs.data.d dVar = this.f98301e;
        cVar3.f98408e = dVar != null ? dVar.d() : 0;
        com.taobao.accs.ut.a.c cVar4 = this.J;
        cVar4.f98410g = this.f98379y;
        return cVar4;
    }

    @Override // com.taobao.accs.net.a
    public String d() {
        return "SilenceConn_" + this.f98309m;
    }

    @Override // com.taobao.accs.net.a
    public void e() {
        super.e();
        this.f98377w = false;
        ThreadPoolExecutorFactory.getScheduledExecutor().execute(new x(this));
        ALog.e(d(), "shut down", new Object[0]);
    }

    @Override // org.android.spdy.SessionCb
    public byte[] getSSLMeta(SpdySession spdySession) {
        spdySession.getDomain();
        return UtilityImpl.c();
    }

    @Override // com.taobao.accs.net.a
    protected boolean h() {
        return false;
    }

    public void o() {
        ALog.e(d(), " force close!", new Object[0]);
        try {
            this.A.closeSession();
            this.I.setCloseType(1);
        } catch (Exception unused) {
        }
        d(3);
    }

    public String p() {
        String channelHost = this.f98305i.getChannelHost();
        ALog.i(d(), "getChannelHost", "host", channelHost);
        return channelHost == null ? "" : channelHost;
    }

    @Override // org.android.spdy.SessionCb
    public int putSSLMeta(SpdySession spdySession, byte[] bArr) {
        spdySession.getDomain();
        return UtilityImpl.b();
    }

    public boolean q() {
        return this.f98377w;
    }

    @Override // org.android.spdy.SessionCb
    public void spdyCustomControlFrameFailCallback(SpdySession spdySession, Object obj, int i10, int i11) {
        b(i10);
    }

    @Override // org.android.spdy.SessionCb
    public void spdyCustomControlFrameRecvCallback(SpdySession spdySession, Object obj, int i10, int i11, int i12, int i13, byte[] bArr) {
        t();
        ALog.e(d(), "onFrame", "type", Integer.valueOf(i11), "len", Integer.valueOf(bArr.length));
        StringBuilder sb2 = new StringBuilder();
        if (ALog.isPrintLog(ALog.Level.D) && bArr.length < 512) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (byte b10 : bArr) {
                sb2.append(Integer.toHexString(b10 & 255));
                sb2.append(" ");
            }
            ALog.d(d(), ((Object) sb2) + " log time:" + (System.currentTimeMillis() - jCurrentTimeMillis), new Object[0]);
        }
        if (i11 == 200) {
            try {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                this.f98301e.a(bArr);
                com.taobao.accs.ut.a.d dVarG = this.f98301e.g();
                if (dVarG != null) {
                    dVarG.f98417c = String.valueOf(jCurrentTimeMillis2);
                    dVarG.f98421g = this.f98299c == 0 ? "service" : "inapp";
                    dVarG.a();
                }
            } catch (Throwable th2) {
                ALog.e(d(), "onDataReceive ", th2, new Object[0]);
                UTMini.getInstance().commitEvent(66001, "SERVICE_DATA_RECEIVE", UtilityImpl.a(th2));
            }
            ALog.d(d(), "try handle msg", new Object[0]);
            g();
        } else {
            ALog.e(d(), "drop frame", "len", Integer.valueOf(bArr.length));
        }
        ALog.d(d(), "spdyCustomControlFrameRecvCallback", new Object[0]);
    }

    @Override // org.android.spdy.Spdycb
    public void spdyDataChunkRecvCB(SpdySession spdySession, boolean z10, long j10, SpdyByteArray spdyByteArray, Object obj) {
        ALog.d(d(), "spdyDataChunkRecvCB", new Object[0]);
    }

    @Override // org.android.spdy.Spdycb
    public void spdyDataRecvCallback(SpdySession spdySession, boolean z10, long j10, int i10, Object obj) {
        ALog.d(d(), "spdyDataRecvCallback", new Object[0]);
    }

    @Override // org.android.spdy.Spdycb
    public void spdyDataSendCallback(SpdySession spdySession, boolean z10, long j10, int i10, Object obj) {
        ALog.d(d(), "spdyDataSendCallback", new Object[0]);
    }

    @Override // org.android.spdy.Spdycb
    public void spdyOnStreamResponse(SpdySession spdySession, long j10, Map<String, List<String>> map, Object obj) {
        this.C = System.currentTimeMillis();
        this.D = System.nanoTime();
        try {
            Map<String, String> mapA = UtilityImpl.a(map);
            ALog.d("SilenceConn_", "spdyOnStreamResponse", "header", map);
            int i10 = Integer.parseInt(mapA.get(":status"));
            ALog.e(d(), "spdyOnStreamResponse", "httpStatusCode", Integer.valueOf(i10));
            if (i10 == 200) {
                d(1);
                String str = mapA.get("x-at");
                if (!TextUtils.isEmpty(str)) {
                    this.f98307k = str;
                }
                SessionMonitor sessionMonitor = this.I;
                sessionMonitor.auth_time = sessionMonitor.connection_stop_date > 0 ? System.currentTimeMillis() - this.I.connection_stop_date : 0L;
                String str2 = this.f98299c == 0 ? "service" : "inapp";
                UTMini.getInstance().commitEvent(66001, "CONNECTED 200 " + str2, (Object) this.f98379y, (Object) this.L, (Object) 221, "0");
                com.taobao.accs.utl.k.a("accs", "auth", "");
            } else {
                e(i10);
            }
        } catch (Exception e10) {
            ALog.e(d(), e10.toString(), new Object[0]);
            o();
            this.I.setCloseReason("exception");
        }
        ALog.d(d(), "spdyOnStreamResponse", new Object[0]);
    }

    @Override // org.android.spdy.SessionCb
    public void spdyPingRecvCallback(SpdySession spdySession, long j10, Object obj) {
        ALog.d(d(), "spdyPingRecvCallback uniId:" + j10, new Object[0]);
        if (j10 < 0) {
            return;
        }
        this.f98301e.b();
        g.a(this.f98300d).e();
        g.a(this.f98300d).a();
        this.I.onPingCBReceive();
        if (this.I.ping_rec_times % 2 == 0) {
            UtilityImpl.a(this.f98300d, Constants.SP_KEY_SERVICE_END, System.currentTimeMillis());
        }
    }

    @Override // org.android.spdy.Spdycb
    public void spdyRequestRecvCallback(SpdySession spdySession, long j10, Object obj) {
        ALog.d(d(), "spdyRequestRecvCallback", new Object[0]);
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionCloseCallback(SpdySession spdySession, Object obj, SuperviseConnectInfo superviseConnectInfo, int i10) {
        ALog.e(d(), "spdySessionCloseCallback", Constants.KEY_ERROR_CODE, Integer.valueOf(i10));
        if (spdySession != null) {
            try {
                spdySession.cleanUp();
            } catch (Exception e10) {
                ALog.e(d(), "session cleanUp has exception: " + e10, new Object[0]);
            }
        }
        d(3);
        this.I.onCloseConnect();
        if (this.I.getConCloseDate() > 0 && this.I.getConStopDate() > 0) {
            this.I.getConCloseDate();
            this.I.getConStopDate();
        }
        this.I.setCloseReason(this.I.getCloseReason() + "tnet error:" + i10);
        if (superviseConnectInfo != null) {
            this.I.live_time = superviseConnectInfo.keepalive_period_second;
        }
        AppMonitor.getInstance().commitStat(this.I);
        for (Message message : this.f98301e.e()) {
            if (message.getNetPermanceMonitor() != null) {
                message.getNetPermanceMonitor().setRet(false);
                message.getNetPermanceMonitor().setFailReason("session close");
                AppMonitor.getInstance().commitStat(message.getNetPermanceMonitor());
            }
        }
        String str = this.f98299c == 0 ? "service" : "inapp";
        ALog.d(d(), "spdySessionCloseCallback, conKeepTime:" + this.I.live_time + " connectType:" + str, new Object[0]);
        UTMini uTMini = UTMini.getInstance();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DISCONNECT CLOSE ");
        sb2.append(str);
        uTMini.commitEvent(66001, sb2.toString(), (Object) Integer.valueOf(i10), (Object) Long.valueOf(this.I.live_time), (Object) 221, this.f98379y, this.L);
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionConnectCB(SpdySession spdySession, SuperviseConnectInfo superviseConnectInfo) {
        this.G = superviseConnectInfo.connectTime;
        int i10 = superviseConnectInfo.handshakeTime;
        ALog.e(d(), "spdySessionConnectCB", "sessionConnectInterval", Integer.valueOf(this.G), "sslTime", Integer.valueOf(i10), "reuse", Integer.valueOf(superviseConnectInfo.sessionTicketReused));
        s();
        this.I.setRet(true);
        this.I.onConnectStop();
        SessionMonitor sessionMonitor = this.I;
        sessionMonitor.tcp_time = this.G;
        sessionMonitor.ssl_time = i10;
        String str = this.f98299c == 0 ? "service" : "inapp";
        UTMini.getInstance().commitEvent(66001, "CONNECTED " + str + " " + superviseConnectInfo.sessionTicketReused, (Object) String.valueOf(this.G), (Object) String.valueOf(i10), (Object) 221, String.valueOf(superviseConnectInfo.sessionTicketReused), this.f98379y, this.L);
        com.taobao.accs.utl.k.a("accs", "connect", "");
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionFailedError(SpdySession spdySession, int i10, Object obj) {
        if (spdySession != null) {
            try {
                spdySession.cleanUp();
            } catch (Exception e10) {
                ALog.e(d(), "session cleanUp has exception: " + e10, new Object[0]);
            }
        }
        a aVar = this.f98376v;
        int i11 = aVar != null ? aVar.f98381a : 0;
        ALog.e(d(), "spdySessionFailedError", "retryTimes", Integer.valueOf(i11), "errorId", Integer.valueOf(i10));
        this.K = false;
        this.M = true;
        d(3);
        this.I.setFailReason(i10);
        this.I.onConnectStop();
        String str = this.f98299c == 0 ? "service" : "inapp";
        UTMini.getInstance().commitEvent(66001, "DISCONNECT " + str, (Object) Integer.valueOf(i10), (Object) Integer.valueOf(i11), (Object) 221, this.f98379y, this.L);
        com.taobao.accs.utl.k.a("accs", "connect", "retrytimes:" + i11, i10 + "", "");
    }

    @Override // org.android.spdy.Spdycb
    public void spdyStreamCloseCallback(SpdySession spdySession, long j10, int i10, Object obj, SuperviseData superviseData) {
        ALog.d(d(), "spdyStreamCloseCallback", new Object[0]);
        if (i10 != 0) {
            ALog.e(d(), "spdyStreamCloseCallback", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, Integer.valueOf(i10));
            e(i10);
        }
    }
}
