package com.alibaba.sdk.android.httpdns.b;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static f f37900a = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static com.alibaba.sdk.android.httpdns.c.a f18a = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static boolean f19a = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static boolean f37901n = true;

    public static List<e> a() {
        ArrayList arrayList = new ArrayList();
        if (!f19a) {
            return arrayList;
        }
        arrayList.addAll(f37900a.a());
        return arrayList;
    }

    public static void a(Context context) {
        a(context, (com.alibaba.sdk.android.httpdns.c.a) null);
    }

    public static void a(Context context, com.alibaba.sdk.android.httpdns.c.a aVar) {
        f37900a = new a(context);
        f18a = aVar;
        if (aVar == null) {
            f18a = com.alibaba.sdk.android.httpdns.c.a.a();
        }
    }

    public static void a(e eVar) {
        if (eVar == null) {
            return;
        }
        f37900a.a(eVar);
    }

    public static void a(boolean z10, boolean z11) {
        f19a = z10;
        f37901n = z11;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m10a() {
        return f19a;
    }

    public static void b(Context context) {
        if (context != null) {
            f18a.c(context);
        }
    }

    public static void b(e eVar) {
        if (eVar == null) {
            return;
        }
        f37900a.b(eVar);
    }

    public static boolean g() {
        return f37901n;
    }

    public static String i() {
        return f18a.i();
    }
}
