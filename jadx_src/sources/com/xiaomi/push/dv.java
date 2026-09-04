package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class dv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static dk f106989a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static dl f296a;

    public static void a(Context context) {
        a("onSendMsg");
        if (m265b(context)) {
            dy.a(context, System.currentTimeMillis(), m264a(context));
        }
    }

    public static void a(Context context, hb hbVar) {
        if (m265b(context)) {
            if (f106989a == null) {
                f106989a = new dk(context);
            }
            if (f296a == null) {
                f296a = new dl(context);
            }
            dk dkVar = f106989a;
            hbVar.a(dkVar, dkVar);
            dl dlVar = f296a;
            hbVar.b(dlVar, dlVar);
            a("startStats");
        }
    }

    static void a(String str) {
        dj.a("Push-PowerStats", str);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m264a(Context context) {
        return i.m471b(context);
    }

    public static void b(Context context) {
        a("onReceiveMsg");
        if (m265b(context)) {
            dy.b(context, System.currentTimeMillis(), m264a(context));
        }
    }

    public static void b(Context context, hb hbVar) {
        dk dkVar = f106989a;
        if (dkVar != null) {
            hbVar.a(dkVar);
            f106989a = null;
        }
        dl dlVar = f296a;
        if (dlVar != null) {
            hbVar.b(dlVar);
            f296a = null;
        }
        a("stopStats");
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    private static boolean m265b(Context context) {
        return dj.a(context);
    }

    public static void c(Context context) {
        a("onPing");
        if (m265b(context)) {
            dy.c(context, System.currentTimeMillis(), m264a(context));
        }
    }

    public static void d(Context context) {
        a("onPong");
        if (m265b(context)) {
            dy.d(context, System.currentTimeMillis(), m264a(context));
        }
    }
}
