package com.igexin.push.extension.distribution.basic.g;

import android.app.Notification;
import android.app.NotificationManager;

/* JADX INFO: loaded from: classes6.dex */
public class f {
    public static void a(NotificationManager notificationManager, int i10, Notification notification, int i11, com.igexin.push.extension.distribution.basic.b.a aVar) {
        try {
            if (notification.icon == 0 || com.igexin.push.core.d.f63671e.getResources().getDrawable(notification.icon) != null) {
                if (aVar.D() > 0) {
                    d.a(aVar.D(), false);
                    d.a(aVar.D(), notification);
                }
                notificationManager.notify(i10, notification);
                return;
            }
            com.igexin.a.a.c.b.a("NotificationShow|showNotification smallIconId: " + notification.icon + " couldn't find resource", new Object[0]);
        } catch (Throwable unused) {
        }
    }
}
