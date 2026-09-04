package com.sankuai.waimai.router.service;

/* JADX INFO: compiled from: ServiceImpl.java */
/* JADX INFO: loaded from: classes8.dex */
public class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f96547e = ":";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f96548f = "singleton";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f96549g = "_service_default_impl";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f96550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f96551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class f96552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f96553d;

    public f(String str, Class cls, boolean z10) {
        if (str == null || cls == null) {
            throw new RuntimeException("key和implementation不应该为空");
        }
        this.f96550a = str;
        this.f96551b = "";
        this.f96552c = cls;
        this.f96553d = z10;
    }

    public f(String str, String str2, boolean z10) {
        if (e(str2)) {
            throw new RuntimeException("implementation不应该为空");
        }
        this.f96550a = e(str) ? str2 : str;
        this.f96551b = str2;
        this.f96552c = null;
        this.f96553d = z10;
    }

    public static String a(String str, f fVar, f fVar2) {
        if (fVar == null || fVar2 == null || g(fVar2.f96551b, fVar.f96551b)) {
            return null;
        }
        return f96549g.equals(fVar.d()) ? String.format("接口%s 的默认实现只允许存在一个\n目前存在多个默认实现: %s, %s", str, fVar2, fVar) : String.format("接口%s对应key='%s'存在多个实现: %s, %s", str, fVar.d(), fVar2, fVar);
    }

    private static boolean e(String str) {
        return str == null || str.length() == 0;
    }

    private static boolean g(String str, String str2) {
        return str == str2 || (str != null && str.equals(str2));
    }

    public String b() {
        return this.f96551b;
    }

    public Class c() {
        return this.f96552c;
    }

    public String d() {
        return this.f96550a;
    }

    public boolean f() {
        return this.f96553d;
    }

    public String h() {
        String str = this.f96550a + ":" + this.f96551b;
        if (!this.f96553d) {
            return str;
        }
        return str + ":singleton";
    }

    public String toString() {
        return this.f96551b;
    }
}
