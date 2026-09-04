package com.umeng.analytics.pro;

/* JADX INFO: compiled from: TProtocolException.java */
/* JADX INFO: loaded from: classes4.dex */
public class bt extends az {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f104643a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f104644b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104645c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f104646d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f104647e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f104648f = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f104649h = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f104650g;

    public bt() {
        this.f104650g = 0;
    }

    public bt(int i10) {
        this.f104650g = i10;
    }

    public bt(int i10, String str) {
        super(str);
        this.f104650g = i10;
    }

    public bt(int i10, String str, Throwable th2) {
        super(str, th2);
        this.f104650g = i10;
    }

    public bt(int i10, Throwable th2) {
        super(th2);
        this.f104650g = i10;
    }

    public bt(String str) {
        super(str);
        this.f104650g = 0;
    }

    public bt(String str, Throwable th2) {
        super(str, th2);
        this.f104650g = 0;
    }

    public bt(Throwable th2) {
        super(th2);
        this.f104650g = 0;
    }

    public int a() {
        return this.f104650g;
    }
}
