package com.google.android.exoplayer2.util;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.annotation.d1;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: NotificationUtil.java */
/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"InlinedApi"})
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f51377a = -1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f51378b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f51379c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f51380d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f51381e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f51382f = 4;

    /* JADX INFO: compiled from: NotificationUtil.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private c0() {
    }

    public static void a(Context context, String str, @d1 int i10, @d1 int i11, int i12) {
        if (u0.f51536a >= 26) {
            NotificationManager notificationManager = (NotificationManager) com.google.android.exoplayer2.util.a.g((NotificationManager) context.getSystemService("notification"));
            NotificationChannel notificationChannel = new NotificationChannel(str, context.getString(i10), i12);
            if (i11 != 0) {
                notificationChannel.setDescription(context.getString(i11));
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public static void b(Context context, int i10, @androidx.annotation.p0 Notification notification) {
        NotificationManager notificationManager = (NotificationManager) com.google.android.exoplayer2.util.a.g((NotificationManager) context.getSystemService("notification"));
        if (notification != null) {
            notificationManager.notify(i10, notification);
        } else {
            notificationManager.cancel(i10);
        }
    }
}
