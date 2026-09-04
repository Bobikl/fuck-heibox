package cn.fly.verify;

import com.max.xiaoheihe.module.account.AliVerifyDialogActivity;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f35967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f35968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f35969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f35970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f35971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f35972h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f35973i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f35974j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f35975k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f35976l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f35977m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f35979o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f35980p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f35981q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Integer f35983s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f35984t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Integer f35985u;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f35982r = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f35978n = System.currentTimeMillis();

    /* JADX INFO: renamed from: cn.fly.verify.c$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f35986a;

        static {
            int[] iArr = new int[g.values().length];
            f35986a = iArr;
            try {
                iArr[g.INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35986a[g.PREVERIFY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35986a[g.AUTHPAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35986a[g.VERIFY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35986a[g.LOG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public c(g gVar, String str) {
        String str2;
        int i10 = AnonymousClass1.f35986a[gVar.ordinal()];
        if (i10 == 1) {
            str2 = lg.a.f131415h;
        } else if (i10 == 2) {
            str2 = "preVerify";
        } else if (i10 == 3) {
            str2 = "authPageOpend";
        } else {
            if (i10 != 4) {
                if (i10 == 5) {
                    str2 = "log";
                }
                this.f35966b = str;
            }
            str2 = AliVerifyDialogActivity.f77461k;
        }
        this.f35965a = str2;
        this.f35966b = str;
    }

    public void a(int i10) {
        this.f35967c = i10;
    }

    public void a(long j10) {
        this.f35971g = j10;
    }

    public void a(Integer num) {
        this.f35983s = num;
    }

    public void a(String str) {
        this.f35980p = str;
    }

    public void a(boolean z10) {
        this.f35982r = z10;
    }

    public boolean a() {
        return this.f35982r;
    }

    public String b() {
        return this.f35980p;
    }

    public void b(int i10) {
        this.f35969e = i10;
    }

    public void b(long j10) {
        this.f35972h = j10;
    }

    public void b(Integer num) {
        this.f35985u = num;
    }

    public void b(String str) {
        this.f35966b = str;
    }

    public void b(boolean z10) {
        this.f35977m = z10;
    }

    public String c() {
        return this.f35965a;
    }

    public void c(long j10) {
        this.f35973i = j10;
    }

    public void c(String str) {
        this.f35968d = str;
    }

    public void c(boolean z10) {
        this.f35981q = z10;
    }

    public String d() {
        return this.f35966b;
    }

    public void d(String str) {
        this.f35970f = str;
    }

    public int e() {
        return this.f35967c;
    }

    public void e(String str) {
        this.f35976l = str;
    }

    public String f() {
        return this.f35968d;
    }

    public void f(String str) {
        this.f35979o = str;
    }

    public int g() {
        return this.f35969e;
    }

    public void g(String str) {
        this.f35984t = str;
    }

    public String h() {
        return this.f35970f;
    }

    public long i() {
        return this.f35971g;
    }

    public long j() {
        return this.f35972h;
    }

    public long k() {
        return this.f35973i;
    }

    public boolean l() {
        return this.f35974j;
    }

    public boolean m() {
        return this.f35975k;
    }

    public String n() {
        return this.f35976l;
    }

    public boolean o() {
        return this.f35977m;
    }

    public boolean p() {
        return this.f35981q;
    }

    public String q() {
        return this.f35979o;
    }

    public Integer r() {
        return this.f35983s;
    }

    public String s() {
        return this.f35984t;
    }

    public Integer t() {
        return this.f35985u;
    }
}
