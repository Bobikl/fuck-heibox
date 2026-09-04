package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.play.core.splitinstall.internal.p1;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p1 f56353c = new p1("SplitInstallService");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Intent f56354d = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f56355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.j1
    @androidx.annotation.p0
    com.google.android.play.core.splitinstall.internal.g f56356b;

    l0(Context context, String str) {
        this.f56355a = str;
        if (com.google.android.play.core.splitinstall.internal.t0.a(context)) {
            this.f56356b = new com.google.android.play.core.splitinstall.internal.g(com.google.android.play.core.splitinstall.internal.q0.a(context), f56353c, "SplitInstallService", f56354d, s.f56369a, null);
        }
    }

    static /* bridge */ /* synthetic */ Bundle b(com.google.android.play.core.splitinstall.internal.i1 i1Var) {
        Bundle bundleO = o();
        bundleO.putParcelableArrayList("event_timestamps", new ArrayList<>(i1Var.a()));
        return bundleO;
    }

    static /* bridge */ /* synthetic */ ArrayList m(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putString(ak.N, str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    static /* bridge */ /* synthetic */ ArrayList n(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putString(com.huawei.hms.feature.dynamic.b.f60688j, str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle o() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", bb.c.l.f34305mk);
        return bundle;
    }

    private static com.google.android.gms.tasks.k p() {
        f56353c.b("onError(%d)", -14);
        return com.google.android.gms.tasks.n.f(new SplitInstallException(-14));
    }

    public final com.google.android.gms.tasks.k c(int i10) {
        if (this.f56356b == null) {
            return p();
        }
        f56353c.d("cancelInstall(%d)", Integer.valueOf(i10));
        com.google.android.gms.tasks.l lVar = new com.google.android.gms.tasks.l();
        this.f56356b.s(new a0(this, lVar, i10, lVar), lVar);
        return lVar.a();
    }

    public final com.google.android.gms.tasks.k d(List list) {
        if (this.f56356b == null) {
            return p();
        }
        f56353c.d("deferredInstall(%s)", list);
        com.google.android.gms.tasks.l lVar = new com.google.android.gms.tasks.l();
        this.f56356b.s(new v(this, lVar, list, lVar), lVar);
        return lVar.a();
    }

    public final com.google.android.gms.tasks.k e(List list) {
        if (this.f56356b == null) {
            return p();
        }
        f56353c.d("deferredLanguageInstall(%s)", list);
        com.google.android.gms.tasks.l lVar = new com.google.android.gms.tasks.l();
        this.f56356b.s(new w(this, lVar, list, lVar), lVar);
        return lVar.a();
    }

    public final com.google.android.gms.tasks.k f(List list) {
        if (this.f56356b == null) {
            return p();
        }
        f56353c.d("deferredLanguageUninstall(%s)", list);
        com.google.android.gms.tasks.l lVar = new com.google.android.gms.tasks.l();
        this.f56356b.s(new x(this, lVar, list, lVar), lVar);
        return lVar.a();
    }

    public final com.google.android.gms.tasks.k g(List list) {
        if (this.f56356b == null) {
            return p();
        }
        f56353c.d("deferredUninstall(%s)", list);
        com.google.android.gms.tasks.l lVar = new com.google.android.gms.tasks.l();
        this.f56356b.s(new u(this, lVar, list, lVar), lVar);
        return lVar.a();
    }

    public final com.google.android.gms.tasks.k h(int i10) {
        if (this.f56356b == null) {
            return p();
        }
        f56353c.d("getSessionState(%d)", Integer.valueOf(i10));
        com.google.android.gms.tasks.l lVar = new com.google.android.gms.tasks.l();
        this.f56356b.s(new y(this, lVar, i10, lVar), lVar);
        return lVar.a();
    }

    public final com.google.android.gms.tasks.k i() {
        if (this.f56356b == null) {
            return p();
        }
        f56353c.d("getSessionStates", new Object[0]);
        com.google.android.gms.tasks.l lVar = new com.google.android.gms.tasks.l();
        this.f56356b.s(new z(this, lVar, lVar), lVar);
        return lVar.a();
    }

    public final com.google.android.gms.tasks.k j(Collection collection, Collection collection2, com.google.android.play.core.splitinstall.internal.i1 i1Var) {
        if (this.f56356b == null) {
            return p();
        }
        f56353c.d("startInstall(%s,%s)", collection, collection2);
        com.google.android.gms.tasks.l lVar = new com.google.android.gms.tasks.l();
        this.f56356b.s(new t(this, lVar, collection, collection2, i1Var, lVar), lVar);
        return lVar.a();
    }
}
