package com.huawei.hms.framework.network.grs.g;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected d f60790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f60791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f60792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f60793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f60794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f60795f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final GrsBaseInfo f60796g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.huawei.hms.framework.network.grs.e.c f60797h;

    public a(String str, int i10, c cVar, Context context, String str2, GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.c cVar2) {
        this.f60791b = str;
        this.f60792c = cVar;
        this.f60793d = i10;
        this.f60794e = context;
        this.f60795f = str2;
        this.f60796g = grsBaseInfo;
        this.f60797h = cVar2;
    }

    public Context a() {
        return this.f60794e;
    }

    public c b() {
        return this.f60792c;
    }

    public String c() {
        return this.f60791b;
    }

    public int d() {
        return this.f60793d;
    }

    public String e() {
        return this.f60795f;
    }

    public com.huawei.hms.framework.network.grs.e.c f() {
        return this.f60797h;
    }

    public Callable<d> g() {
        return new f(this.f60791b, this.f60793d, this.f60792c, this.f60794e, this.f60795f, this.f60796g, this.f60797h);
    }
}
