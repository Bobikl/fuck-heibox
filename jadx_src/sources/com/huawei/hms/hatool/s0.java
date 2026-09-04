package com.huawei.hms.hatool;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f61029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f61030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f61031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f61032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f61033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f61034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private j0 f61035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f61036h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, String> f61037i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f61038j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f61039k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f61040l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f61041m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f61042n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f61043o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f61044p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f61045q;

    public s0() {
        this.f61033e = "";
        this.f61034f = "";
        this.f61035g = new j0();
        this.f61036h = "";
        this.f61038j = "";
        this.f61039k = 10;
        this.f61040l = 7;
        this.f61041m = true;
        this.f61042n = true;
        this.f61043o = false;
        this.f61045q = 0L;
    }

    public s0(s0 s0Var) {
        this.f61033e = "";
        this.f61034f = "";
        this.f61035g = new j0();
        this.f61036h = "";
        this.f61038j = "";
        this.f61039k = 10;
        this.f61040l = 7;
        this.f61041m = true;
        this.f61042n = true;
        this.f61043o = false;
        this.f61045q = 0L;
        this.f61035g = s0Var.f61035g;
        b(s0Var.f61029a);
        a(s0Var.f61031c);
        b(s0Var.f61032d);
        e(s0Var.f61033e);
        g(s0Var.f61034f);
        d(s0Var.f61036h);
        f(s0Var.f61038j);
        c(s0Var.f61030b);
        a(s0Var.f61039k);
        b(s0Var.f61040l);
        d(s0Var.f61041m);
        a(s0Var.f61042n);
        e(s0Var.f61043o);
        a(s0Var.f61037i);
        c(s0Var.f61044p);
        a(s0Var.f61045q);
    }

    public void a(int i10) {
        this.f61039k = i10;
    }

    public void a(long j10) {
        this.f61045q = j10;
    }

    public void a(String str) {
        this.f61031c = str;
    }

    public void a(Map<String, String> map) {
        this.f61037i = map;
    }

    public void a(boolean z10) {
        this.f61042n = z10;
    }

    public boolean a() {
        return this.f61042n;
    }

    public int b() {
        return this.f61039k;
    }

    public void b(int i10) {
        this.f61040l = i10;
    }

    public void b(String str) {
        this.f61032d = str;
    }

    public void b(boolean z10) {
        this.f61029a = z10;
    }

    public void c(String str) {
        this.f61044p = str;
    }

    public void c(boolean z10) {
        this.f61030b = z10;
    }

    public boolean c() {
        return this.f61029a;
    }

    public int d() {
        return this.f61040l;
    }

    public void d(String str) {
        this.f61036h = str;
    }

    public void d(boolean z10) {
        this.f61041m = z10;
    }

    public void e(String str) {
        this.f61033e = str;
    }

    public void e(boolean z10) {
        this.f61043o = z10;
    }

    public boolean e() {
        return this.f61030b;
    }

    public String f() {
        return this.f61031c;
    }

    public void f(String str) {
        this.f61038j = str;
    }

    public void g(String str) {
        this.f61034f = str;
    }

    public boolean g() {
        return this.f61041m;
    }

    public String h() {
        return this.f61032d;
    }

    public boolean i() {
        return this.f61043o;
    }

    public j0 j() {
        return this.f61035g;
    }

    public Map<String, String> k() {
        return this.f61037i;
    }

    public long l() {
        return this.f61045q;
    }

    public String m() {
        return this.f61044p;
    }

    public String n() {
        return this.f61036h;
    }

    public String o() {
        return this.f61033e;
    }

    public String p() {
        return this.f61038j;
    }

    public String q() {
        return this.f61034f;
    }
}
