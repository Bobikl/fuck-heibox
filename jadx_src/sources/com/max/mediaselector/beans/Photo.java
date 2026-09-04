package com.max.mediaselector.beans;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class Photo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f74737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f74738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f74739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f74740e;

    public Photo(String str) {
        this.f74738c = str;
    }

    public Photo(String str, String str2, String str3) {
        this.f74738c = str;
        this.f74739d = str2;
        this.f74740e = str3;
    }

    public int a() {
        return this.f74737b;
    }

    public String b() {
        return this.f74738c;
    }

    public String c() {
        return this.f74740e;
    }

    public String d() {
        return this.f74739d;
    }

    public void e(int i10) {
        this.f74737b = i10;
    }

    public void f(String str) {
        this.f74738c = str;
    }

    public void g(String str) {
        this.f74740e = str;
    }

    public void h(String str) {
        this.f74739d = str;
    }
}
