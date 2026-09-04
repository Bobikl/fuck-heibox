package com.huawei.hms.hatool;

/* JADX INFO: loaded from: classes7.dex */
public class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private s0 f60988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s0 f60989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s0 f60990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private s0 f60991d;

    public l1(String str) {
    }

    public s0 a() {
        return this.f60990c;
    }

    public s0 a(String str) {
        if (str.equals("oper")) {
            return c();
        }
        if (str.equals("maint")) {
            return b();
        }
        if (str.equals("diffprivacy")) {
            return a();
        }
        if (str.equals("preins")) {
            return d();
        }
        v.f("hmsSdk", "HiAnalyticsInstData.getConfig(type): wrong type: " + str);
        return null;
    }

    public void a(s0 s0Var) {
        this.f60988a = s0Var;
    }

    public s0 b() {
        return this.f60988a;
    }

    public void b(s0 s0Var) {
        this.f60989b = s0Var;
    }

    public s0 c() {
        return this.f60989b;
    }

    public s0 d() {
        return this.f60991d;
    }
}
