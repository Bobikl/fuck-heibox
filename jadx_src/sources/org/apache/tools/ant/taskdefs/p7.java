package org.apache.tools.ant.taskdefs;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: WaitFor.java */
/* JADX INFO: loaded from: classes5.dex */
public class p7 extends org.apache.tools.ant.taskdefs.condition.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f135553l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f135554m = 1000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f135555n = 60000;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f135556o = 3600000;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f135557p = 86400000;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long f135558q = 604800000;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f135559r = 180000;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final long f135560s = 500;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f135561g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f135562h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f135563i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f135564j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f135565k;

    /* JADX INFO: compiled from: WaitFor.java */
    public static class a extends org.apache.tools.ant.types.w {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f135566d = "millisecond";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f135567e = "second";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f135568f = "minute";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f135569g = "hour";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f135570h = "day";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f135571i = "week";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String[] f135572j = {f135566d, f135567e, f135568f, f135569g, f135570h, f135571i};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Map<String, Long> f135573c;

        public a() {
            HashMap map = new HashMap();
            this.f135573c = map;
            map.put(f135566d, 1L);
            this.f135573c.put(f135567e, 1000L);
            this.f135573c.put(f135568f, 60000L);
            this.f135573c.put(f135569g, 3600000L);
            this.f135573c.put(f135570h, 86400000L);
            this.f135573c.put(f135571i, 604800000L);
        }

        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return f135572j;
        }

        public long h() {
            return this.f135573c.get(d().toLowerCase(Locale.ENGLISH)).longValue();
        }
    }

    public p7() {
        super("waitfor");
        this.f135561g = 180000L;
        this.f135562h = 1L;
        this.f135563i = 500L;
        this.f135564j = 1L;
    }

    public p7(String str) {
        super(str);
        this.f135561g = 180000L;
        this.f135562h = 1L;
        this.f135563i = 500L;
        this.f135564j = 1L;
    }

    public long e2() {
        return this.f135563i * this.f135564j;
    }

    public long f2() {
        return this.f135561g * this.f135562h;
    }

    public void g2() throws BuildException {
        if (a2() > 1) {
            throw new BuildException("You must not nest more than one condition into %s", c2());
        }
        if (a2() < 1) {
            throw new BuildException("You must nest a condition into %s", c2());
        }
        org.apache.tools.ant.taskdefs.condition.d dVarNextElement = b2().nextElement();
        try {
            long jF2 = f2();
            long jE2 = e2();
            long jCurrentTimeMillis = System.currentTimeMillis() + jF2;
            while (System.currentTimeMillis() < jCurrentTimeMillis) {
                if (dVarNextElement.e()) {
                    h2();
                    return;
                }
                Thread.sleep(jE2);
            }
        } catch (InterruptedException unused) {
            log("Task " + c2() + " interrupted, treating as timed out.");
        }
        i2();
    }

    protected void h2() {
        x1(c2() + ": condition was met", 3);
    }

    protected void i2() {
        x1(c2() + ": timeout", 3);
        if (this.f135565k != null) {
            b().n1(this.f135565k, "true");
        }
    }

    public void j2(long j10) {
        this.f135563i = j10;
    }

    public void k2(a aVar) {
        this.f135564j = aVar.h();
    }

    public void l2(long j10) {
        this.f135561g = j10;
    }

    public void m2(a aVar) {
        this.f135562h = aVar.h();
    }

    public void n2(String str) {
        this.f135565k = str;
    }
}
