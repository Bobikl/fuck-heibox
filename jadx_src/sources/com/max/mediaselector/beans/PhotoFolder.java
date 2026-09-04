package com.max.mediaselector.beans;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PhotoFolder implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f74741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f74742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<Photo> f74743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f74744e;

    public String a() {
        return this.f74742c;
    }

    public String b() {
        return this.f74741b;
    }

    public List<Photo> c() {
        return this.f74743d;
    }

    public boolean d() {
        return this.f74744e;
    }

    public void e(String str) {
        this.f74742c = str;
    }

    public void f(boolean z10) {
        this.f74744e = z10;
    }

    public void g(String str) {
        this.f74741b = str;
    }

    public void h(List<Photo> list) {
        this.f74743d = list;
    }
}
