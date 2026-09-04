package com.xiaomi.push.service;

import android.app.Notification;
import android.content.Context;
import android.os.SystemClock;
import android.service.notification.StatusBarNotification;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static List<a> f108007a = new CopyOnWriteArrayList();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f108008a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        public final long f1085a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        public final String f1086a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        public final Notification.Action[] f1087a;

        a(String str, long j10, int i10, Notification.Action[] actionArr) {
            this.f1086a = str;
            this.f1085a = j10;
            this.f108008a = i10;
            this.f1087a = actionArr;
        }
    }

    private static void a() {
        for (int size = f108007a.size() - 1; size >= 0; size--) {
            a aVar = f108007a.get(size);
            if (SystemClock.elapsedRealtime() - aVar.f1085a > 5000) {
                f108007a.remove(aVar);
            }
        }
        if (f108007a.size() > 10) {
            f108007a.remove(0);
        }
    }

    protected static void a(Context context, StatusBarNotification statusBarNotification, int i10) {
        if (!com.xiaomi.push.j.m521a(context) || i10 <= 0 || statusBarNotification == null) {
            return;
        }
        a(new a(statusBarNotification.getKey(), SystemClock.elapsedRealtime(), i10, ax.m723a(statusBarNotification.getNotification())));
    }

    private static void a(a aVar) {
        f108007a.add(aVar);
        a();
    }
}
