package cn.fly.verify;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes6.dex */
public class l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static SparseArray<l> f36874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static SparseArray<l> f36875i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f36876j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static volatile long f36877k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Object f36878l = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f36880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f36881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f36882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f36884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f36885g;

    public l(int i10, String str, String str2, boolean z10) {
        this.f36879a = i10;
        this.f36880b = str;
        this.f36881c = str2;
        this.f36882d = z10;
    }

    public l(int i10, String str, String str2, boolean z10, int i11, Integer num, String str3) {
        this.f36879a = i10;
        this.f36880b = str;
        this.f36881c = str2;
        this.f36882d = z10;
        this.f36883e = i11;
        this.f36884f = num;
        this.f36885g = str3;
    }

    public static SparseArray<l> a() {
        SparseArray<l> sparseArray;
        synchronized (f36878l) {
            if (System.currentTimeMillis() > f36877k) {
                if (f36877k > 0) {
                    f.a().b("[FlyVerify] ==>%s", "memory config expire");
                }
                f36874h = null;
            }
            sparseArray = f36874h;
        }
        return sparseArray;
    }

    public static void a(SparseArray<l> sparseArray) {
        f36875i = sparseArray;
    }

    public static void a(SparseArray<l> sparseArray, boolean z10) {
        synchronized (f36878l) {
            f36876j = z10;
            f36877k = System.currentTimeMillis() + 600000;
            f36874h = sparseArray;
        }
    }

    public static boolean b() {
        boolean z10;
        synchronized (f36878l) {
            z10 = f36876j;
        }
        return z10;
    }

    public static SparseArray<l> c() {
        return f36875i;
    }

    public void a(Integer num) {
        this.f36884f = num;
    }

    public void a(String str) {
        this.f36885g = str;
    }

    public int d() {
        return this.f36883e;
    }

    public Integer e() {
        return this.f36884f;
    }

    public String f() {
        return this.f36885g;
    }
}
