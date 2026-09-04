package com.lzy.okgo.db;

/* JADX INFO: compiled from: ColumnEntity.java */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f64701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f64702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f64703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f64704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f64705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f64706f;

    public c(String str, String str2) {
        this(str, str2, false, false, false);
    }

    public c(String str, String str2, boolean z10, boolean z11) {
        this(str, str2, z10, z11, false);
    }

    public c(String str, String str2, boolean z10, boolean z11, boolean z12) {
        this.f64701a = str;
        this.f64702b = str2;
        this.f64704d = z10;
        this.f64705e = z11;
        this.f64706f = z12;
    }

    public c(String... strArr) {
        this.f64703c = strArr;
    }
}
