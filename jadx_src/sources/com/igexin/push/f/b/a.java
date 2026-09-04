package com.igexin.push.f.b;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class a extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f64023b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<c> f64024a;

    private a() {
        super(60000L);
        this.f63235n = true;
        this.f64024a = new ArrayList();
    }

    public static a i() {
        if (f64023b == null) {
            f64023b = new a();
        }
        return f64023b;
    }

    private void j() {
        a(360000L, TimeUnit.MILLISECONDS);
    }

    public boolean a(c cVar) {
        List<c> list = this.f64024a;
        return (list == null || list.contains(cVar) || !this.f64024a.add(cVar)) ? false : true;
    }

    @Override // com.igexin.a.a.d.a.e
    public int b_() {
        return 0;
    }

    @Override // com.igexin.push.f.b.g
    protected void d_() {
        com.igexin.push.core.a.e.a().k();
        for (c cVar : this.f64024a) {
            if (cVar.b()) {
                cVar.a();
                cVar.a(System.currentTimeMillis());
            }
        }
        j();
        com.igexin.a.a.b.c.b().a(this);
    }
}
