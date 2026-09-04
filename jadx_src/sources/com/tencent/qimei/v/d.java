package com.tencent.qimei.v;

import android.content.Context;
import com.tencent.qimei.shellapi.IDependency;

/* JADX INFO: compiled from: Strategy.java */
/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f101449a = new a();

    public static b a() {
        return f101449a;
    }

    public static b a(String str) {
        IDependency iDependencyA = com.tencent.qimei.t.b.a().a("StrategyProvider" + str);
        return iDependencyA instanceof b ? (b) iDependencyA : f101449a;
    }

    public static void a(Context context, String str, b bVar, k kVar) {
        a(str, bVar);
        com.tencent.qimei.c.a.a().a(new c(str, context, kVar));
    }

    public static void a(String str, b bVar) {
        com.tencent.qimei.t.b.a().a("StrategyProvider" + str, bVar);
    }
}
