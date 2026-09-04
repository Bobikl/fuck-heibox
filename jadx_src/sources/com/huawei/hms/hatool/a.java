package com.huawei.hms.hatool;

import android.content.Context;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static z0 f60874a;

    private static synchronized z0 a() {
        if (f60874a == null) {
            f60874a = q.c().b();
        }
        return f60874a;
    }

    public static void a(int i10, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (a() == null || !q1.b().a()) {
            return;
        }
        if (i10 == 1 || i10 == 0) {
            f60874a.a(i10, str, linkedHashMap);
            return;
        }
        v.d("hmsSdk", "Data type no longer collects range.type: " + i10);
    }

    @Deprecated
    public static void a(Context context, String str, String str2) {
        if (a() != null) {
            f60874a.a(context, str, str2);
        }
    }

    public static void b(int i10, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (a() == null || !q1.b().a()) {
            return;
        }
        if (i10 == 1 || i10 == 0) {
            f60874a.b(i10, str, linkedHashMap);
            return;
        }
        v.d("hmsSdk", "Data type no longer collects range.type: " + i10);
    }

    public static boolean b() {
        return q.c().a();
    }

    public static void c() {
        if (a() == null || !q1.b().a()) {
            return;
        }
        f60874a.a(-1);
    }
}
