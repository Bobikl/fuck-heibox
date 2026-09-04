package cn.fly.verify;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public class ai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ai f35705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f35706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f35707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f35708d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f35710f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile long f35714j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f35715k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f35716l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Boolean f35717m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Integer f35718n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Integer f35719o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Integer f35720p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Integer f35721q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Integer f35722r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Integer f35723s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f35724t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Integer f35725u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Integer f35726v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Integer f35727w;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f35709e = "LphSZLqaUeFdyaQq";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicInteger f35711g = new AtomicInteger(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile int f35712h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile int f35713i = -1;

    private ai() {
    }

    public static ai a() {
        if (f35705a == null) {
            synchronized (ai.class) {
                if (f35705a == null) {
                    f35705a = new ai();
                }
            }
        }
        return f35705a;
    }

    private boolean v() {
        String[] strArrS = s();
        if (strArrS != null) {
            for (String str : strArrS) {
                if (fz.d.k().equalsIgnoreCase(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void a(int i10) {
        this.f35712h = i10;
    }

    public void a(long j10) {
        this.f35714j = j10;
    }

    public void a(Boolean bool) {
        this.f35717m = bool;
    }

    public void a(String str) {
        this.f35716l = str;
    }

    public void a(List<String> list) {
        this.f35706b = list;
    }

    public void a(boolean z10) {
        this.f35710f = z10;
    }

    public String b() {
        return this.f35716l;
    }

    public void b(int i10) {
        this.f35713i = i10;
    }

    public void b(String str) {
        this.f35715k = str;
    }

    public String c() {
        return this.f35715k;
    }

    public void c(int i10) {
        this.f35707c = i10;
    }

    public void c(String str) {
        this.f35709e = str;
    }

    public int d() {
        return this.f35712h;
    }

    public void d(int i10) {
        this.f35708d = Integer.valueOf(i10);
    }

    public void d(String str) {
        this.f35724t = str;
    }

    public int e() {
        int i10 = this.f35713i;
        this.f35713i = -1;
        return i10;
    }

    public void e(int i10) {
        this.f35718n = Integer.valueOf(i10);
    }

    public long f() {
        long j10 = this.f35714j;
        this.f35714j = 0L;
        return j10;
    }

    public void f(int i10) {
        this.f35719o = Integer.valueOf(i10);
    }

    public List<String> g() {
        if (this.f35706b == null) {
            this.f35706b = new ArrayList();
        }
        return this.f35706b;
    }

    public void g(int i10) {
        this.f35720p = Integer.valueOf(i10);
    }

    public int h() {
        return this.f35707c;
    }

    public void h(int i10) {
        this.f35721q = Integer.valueOf(i10);
    }

    public String i() {
        return this.f35709e;
    }

    public void i(int i10) {
        this.f35722r = Integer.valueOf(i10);
    }

    public void j(int i10) {
        this.f35723s = Integer.valueOf(i10);
    }

    public boolean j() {
        return this.f35710f;
    }

    public Boolean k() {
        if (this.f35717m == null) {
            this.f35717m = Boolean.valueOf(aq.c());
        }
        return this.f35717m;
    }

    public void k(int i10) {
        this.f35725u = Integer.valueOf(i10);
    }

    public int l() {
        if (this.f35708d == null) {
            this.f35708d = Integer.valueOf(aq.l());
        }
        return this.f35708d.intValue();
    }

    public void l(int i10) {
        this.f35726v = Integer.valueOf(i10);
    }

    public int m() {
        if (this.f35718n == null) {
            this.f35718n = Integer.valueOf(aq.d());
        }
        if (this.f35718n == null) {
            this.f35718n = 1;
        }
        return this.f35718n.intValue();
    }

    public void m(int i10) {
        this.f35727w = Integer.valueOf(i10);
    }

    public int n() {
        if (this.f35719o == null) {
            this.f35719o = Integer.valueOf(aq.m());
        }
        if (this.f35719o == null) {
            this.f35719o = 1;
        }
        return this.f35719o.intValue();
    }

    public int o() {
        if (this.f35720p == null) {
            this.f35720p = Integer.valueOf(aq.n());
        }
        if (this.f35720p == null) {
            this.f35720p = 1;
        }
        return this.f35720p.intValue();
    }

    public int p() {
        if (v()) {
            return 0;
        }
        if (this.f35721q == null) {
            this.f35721q = Integer.valueOf(aq.o());
        }
        if (this.f35721q == null) {
            this.f35721q = 1;
        }
        return this.f35721q.intValue();
    }

    public int q() {
        if (v()) {
            return 0;
        }
        if (this.f35722r == null) {
            this.f35722r = Integer.valueOf(aq.p());
        }
        if (this.f35722r == null) {
            this.f35722r = 1;
        }
        return this.f35722r.intValue();
    }

    public int r() {
        if (v()) {
            return 0;
        }
        if (this.f35723s == null) {
            this.f35723s = Integer.valueOf(aq.q());
        }
        if (this.f35723s == null) {
            this.f35723s = 1;
        }
        return this.f35723s.intValue();
    }

    public String[] s() {
        String[] strArrSplit;
        if (TextUtils.isEmpty(this.f35724t)) {
            this.f35724t = aq.r();
        }
        String str = this.f35724t;
        if (str == null || (strArrSplit = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) == null || strArrSplit.length <= 0) {
            return null;
        }
        return strArrSplit;
    }

    public int t() {
        if (this.f35725u == null) {
            this.f35725u = Integer.valueOf(aq.s());
        }
        if (this.f35725u == null) {
            this.f35725u = 0;
        }
        return this.f35725u.intValue();
    }

    public int u() {
        if (this.f35727w == null) {
            this.f35727w = Integer.valueOf(aq.t());
        }
        return this.f35727w.intValue();
    }
}
