package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: ScanAlgDecodeOption.java */
/* JADX INFO: loaded from: classes7.dex */
public class x6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f62551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f62552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f62553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f62554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f62555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f62556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f62557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f62558h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f62559i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f62560j;

    public x6(int i10, int i11, int i12) {
        this.f62558h = 0;
        this.f62559i = 0;
        this.f62560j = false;
        this.f62551a = i10;
        this.f62552b = i11;
        this.f62553c = i12;
        this.f62554d = false;
        this.f62555e = false;
        this.f62557g = true;
    }

    public x6(int i10, int i11, int i12, boolean z10, boolean z11) {
        this.f62558h = 0;
        this.f62559i = 0;
        this.f62560j = false;
        this.f62551a = i10;
        this.f62552b = i11;
        this.f62553c = i12;
        this.f62554d = z10;
        this.f62555e = z11;
        this.f62557g = true;
    }

    public x6(int i10, boolean z10) {
        this.f62558h = 0;
        this.f62559i = 0;
        this.f62560j = false;
        this.f62551a = 0;
        this.f62552b = 0;
        this.f62553c = i10;
        this.f62554d = false;
        this.f62555e = z10;
        this.f62557g = true;
    }

    public x6(x6 x6Var) {
        this.f62558h = 0;
        this.f62559i = 0;
        this.f62560j = false;
        this.f62551a = x6Var.f62551a;
        this.f62552b = x6Var.f62552b;
        this.f62553c = x6Var.f62553c;
        this.f62554d = x6Var.f62554d;
        this.f62555e = x6Var.f62555e;
        this.f62557g = x6Var.f62557g;
        this.f62556f = x6Var.f62556f;
        this.f62558h = x6Var.f62558h;
        this.f62559i = x6Var.f62559i;
        this.f62560j = x6Var.f62560j;
    }

    public x6 a(int i10) {
        this.f62556f = i10;
        return this;
    }
}
