package com.tencent.qimei.u;

import android.content.Context;
import androidx.annotation.p0;
import com.tencent.qimei.shellapi.IDependency;

/* JADX INFO: compiled from: SdkInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile d f101444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f101445b;

    public static void a(IDependency iDependency) {
        com.tencent.qimei.t.b.a().a("SdkInfo", iDependency);
    }

    public static d b() {
        if (f101444a == null) {
            synchronized (d.class) {
                if (f101444a == null) {
                    f101444a = new d();
                }
            }
        }
        return f101444a;
    }

    @Override // com.tencent.qimei.u.c
    @p0
    public synchronized Context F() {
        if (a() == null) {
            return null;
        }
        return a().F();
    }

    @Override // com.tencent.qimei.u.c
    public String K() {
        return a() == null ? "" : a().K();
    }

    @p0
    public final c a() {
        IDependency iDependencyA = com.tencent.qimei.t.b.a().a("SdkInfo");
        if (!(iDependencyA instanceof c)) {
            return null;
        }
        c cVar = (c) iDependencyA;
        this.f101445b = cVar;
        return cVar;
    }

    @Override // com.tencent.qimei.u.c
    public String getSdkVersion() {
        return a() == null ? "" : a().getSdkVersion();
    }
}
