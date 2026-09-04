package com.huawei.hms.scankit.p;

import java.util.Stack;

/* JADX INFO: compiled from: GlobalVariable.java */
/* JADX INFO: loaded from: classes7.dex */
public class r3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f62275a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f62276b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f62277c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f62278d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f62279e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f62280f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f62281g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f62282h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static float f62283i = -1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f62284j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f62285k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f62286l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static boolean f62287m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean f62288n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static boolean f62289o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static boolean f62290p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static boolean f62291q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static boolean f62292r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static boolean f62293s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static boolean f62294t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static boolean f62295u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static boolean[] f62296v = new boolean[8];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static Stack<Integer> f62297w = new Stack<>();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static boolean f62298x = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static float[] f62299y = new float[4];

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static int f62300z = 0;
    public static boolean A = false;

    public static void a() {
        f62282h = false;
        f62283i = -1.0f;
        f62284j = 0;
        f62290p = false;
        f62291q = false;
        f62292r = false;
        f62294t = false;
        f62287m = false;
        f62288n = false;
        f62289o = false;
        f62293s = false;
        f62296v = new boolean[8];
        f62297w = new Stack<>();
        f62298x = true;
        f62279e = false;
        f62278d = false;
    }

    public static void a(int i10) {
        if (i10 % 2 == 1) {
            f62290p = true;
        }
        if (i10 % 3 == 2) {
            f62291q = true;
        }
        if (i10 % 5 == 4) {
            f62292r = true;
        }
    }

    public static void a(x6 x6Var) {
        a();
        boolean z10 = x6Var.f62555e;
        f62277c = z10;
        f62298x = x6Var.f62557g;
        if (z10) {
            a(1);
        } else {
            a(x6Var.f62556f);
        }
    }
}
