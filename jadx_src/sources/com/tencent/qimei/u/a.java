package com.tencent.qimei.u;

import androidx.annotation.p0;
import com.tencent.qimei.shellapi.IDependency;

/* JADX INFO: compiled from: BizInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f101443b;

    public a(String str) {
        this.f101442a = str;
    }

    public static void a(IDependency iDependency, String str) {
        com.tencent.qimei.t.b.a().a("BizInfo" + str, iDependency);
    }

    @Override // com.tencent.qimei.u.b
    public String D() {
        return a() == null ? "" : a().D();
    }

    @Override // com.tencent.qimei.u.b
    public String E() {
        return a() == null ? "" : a().E();
    }

    @Override // com.tencent.qimei.u.b
    public String G() {
        return a() == null ? "" : a().G();
    }

    @Override // com.tencent.qimei.u.b
    public String H() {
        return a() == null ? "" : a().H();
    }

    @Override // com.tencent.qimei.u.b
    public void I() {
        if (a() == null) {
            return;
        }
        a().I();
    }

    @Override // com.tencent.qimei.u.b
    public String J() {
        return a() == null ? "" : a().J();
    }

    @p0
    public final b a() {
        b bVar = this.f101443b;
        if (bVar != null) {
            return bVar;
        }
        IDependency iDependencyA = com.tencent.qimei.t.b.a().a("BizInfo" + this.f101442a);
        if (!(iDependencyA instanceof b)) {
            return null;
        }
        b bVar2 = (b) iDependencyA;
        this.f101443b = bVar2;
        return bVar2;
    }
}
