package com.xiaomi.push;

import android.os.SystemClock;
import android.util.Pair;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.xiaomi.push.service.XMPushService;
import java.io.Reader;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f107244a = new AtomicInteger(0);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static boolean f519a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    protected hc f522a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    protected XMPushService f524a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    protected int f520a = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    protected long f521a = -1;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    protected volatile long f529b = 0;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    protected volatile long f532c = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private LinkedList<Pair<Integer, Long>> f527a = new LinkedList<>();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final Collection<he> f526a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    protected final Map<hg, a> f528a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    protected final Map<hg, a> f531b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    protected hn f523a = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    protected String f525a = "";

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    protected String f530b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f107246c = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f107245b = f107244a.getAndIncrement();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f107248e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected long f107247d = 0;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private hg f107249a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private ho f533a;

        public a(hg hgVar, ho hoVar) {
            this.f107249a = hgVar;
            this.f533a = hoVar;
        }

        public void a(gq gqVar) {
            this.f107249a.a(gqVar);
        }

        public void a(hs hsVar) {
            ho hoVar = this.f533a;
            if (hoVar == null || hoVar.mo252a(hsVar)) {
                this.f107249a.a(hsVar);
            }
        }
    }

    static {
        f519a = false;
        try {
            f519a = Boolean.getBoolean("smack.debugEnabled");
        } catch (Exception unused) {
        }
        hh.m448a();
    }

    protected hb(XMPushService xMPushService, hc hcVar) {
        this.f522a = hcVar;
        this.f524a = xMPushService;
        m442b();
    }

    private String a(int i10) {
        if (i10 == 1) {
            return "connected";
        }
        if (i10 == 0) {
            return "connecting";
        }
        return i10 == 2 ? NetworkUtil.NETWORK_CLASS_DISCONNECTED : "unknown";
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private void m436a(int i10) {
        synchronized (this.f527a) {
            try {
                if (i10 == 1) {
                    this.f527a.clear();
                } else {
                    this.f527a.add(new Pair<>(Integer.valueOf(i10), Long.valueOf(System.currentTimeMillis())));
                    if (this.f527a.size() > 6) {
                        this.f527a.remove(0);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int a() {
        return this.f520a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public long m437a() {
        return this.f532c;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public hc m438a() {
        return this.f522a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String mo439a() {
        return this.f522a.c();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    protected Map<hg, a> m440a() {
        return this.f528a;
    }

    public void a(int i10, int i11, Exception exc) {
        int i12 = this.f107246c;
        if (i10 != i12) {
            com.xiaomi.channel.commonutils.logger.b.m62a(String.format("update the connection status. %1$s -> %2$s : %3$s ", a(i12), a(i10), com.xiaomi.push.service.bj.a(i11)));
        }
        if (bg.b(this.f524a)) {
            m436a(i10);
        }
        if (i10 == 1) {
            this.f524a.a(10);
            if (this.f107246c != 0) {
                com.xiaomi.channel.commonutils.logger.b.m62a("try set connected while not connecting.");
            }
            this.f107246c = i10;
            Iterator<he> it = this.f526a.iterator();
            while (it.hasNext()) {
                it.next().b(this);
            }
            return;
        }
        if (i10 == 0) {
            if (this.f107246c != 2) {
                com.xiaomi.channel.commonutils.logger.b.m62a("try set connecting while not disconnected.");
            }
            this.f107246c = i10;
            Iterator<he> it2 = this.f526a.iterator();
            while (it2.hasNext()) {
                it2.next().a(this);
            }
            return;
        }
        if (i10 == 2) {
            this.f524a.a(10);
            int i13 = this.f107246c;
            if (i13 == 0) {
                Iterator<he> it3 = this.f526a.iterator();
                while (it3.hasNext()) {
                    it3.next().a(this, exc == null ? new CancellationException("disconnect while connecting") : exc);
                }
            } else if (i13 == 1) {
                Iterator<he> it4 = this.f526a.iterator();
                while (it4.hasNext()) {
                    it4.next().a(this, i11, exc);
                }
            }
            this.f107246c = i10;
        }
    }

    public void a(he heVar) {
        if (heVar == null || this.f526a.contains(heVar)) {
            return;
        }
        this.f526a.add(heVar);
    }

    public void a(hg hgVar) {
        this.f528a.remove(hgVar);
    }

    public void a(hg hgVar, ho hoVar) {
        if (hgVar == null) {
            throw new NullPointerException("Packet listener is null.");
        }
        this.f528a.put(hgVar, new a(hgVar, hoVar));
    }

    public abstract void a(hs hsVar);

    public abstract void a(com.xiaomi.push.service.bf.b bVar);

    public synchronized void a(String str) {
        if (this.f107246c == 0) {
            com.xiaomi.channel.commonutils.logger.b.m62a("setChallenge hash = " + bo.a(str).substring(0, 8));
            this.f525a = str;
            a(1, 0, null);
        } else {
            com.xiaomi.channel.commonutils.logger.b.m62a("ignore setChallenge because connection was disconnected");
        }
    }

    public abstract void a(String str, String str2);

    public abstract void a(gq[] gqVarArr);

    /* JADX INFO: renamed from: a */
    public boolean mo432a() {
        return false;
    }

    public synchronized boolean a(long j10) {
        return this.f107248e >= j10;
    }

    public int b() {
        return this.f107246c;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public String m441b() {
        return this.f522a.b();
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    protected void m442b() {
        String property;
        if (this.f522a.m446a() && this.f523a == null) {
            Class<?> cls = null;
            try {
                property = System.getProperty("smack.debuggerClass");
            } catch (Throwable unused) {
                property = null;
            }
            if (property != null) {
                try {
                    cls = Class.forName(property);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            if (cls == null) {
                this.f523a = new gz(this);
                return;
            }
            try {
                this.f523a = (hn) cls.getConstructor(hb.class, Writer.class, Reader.class).newInstance(this);
            } catch (Exception e11) {
                throw new IllegalArgumentException("Can't initialize the configured debugger!", e11);
            }
        }
    }

    public abstract void b(int i10, Exception exc);

    public abstract void b(gq gqVar);

    public void b(he heVar) {
        this.f526a.remove(heVar);
    }

    public void b(hg hgVar) {
        this.f531b.remove(hgVar);
    }

    public void b(hg hgVar, ho hoVar) {
        if (hgVar == null) {
            throw new NullPointerException("Packet listener is null.");
        }
        this.f531b.put(hgVar, new a(hgVar, hoVar));
    }

    public abstract void b(boolean z10);

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m443b() {
        return this.f107246c == 0;
    }

    public synchronized void c() {
        this.f107248e = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m444c() {
        return this.f107246c == 1;
    }

    public void d() {
        synchronized (this.f527a) {
            this.f527a.clear();
        }
    }
}
