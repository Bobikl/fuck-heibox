package com.umeng.message.proguard;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationManager;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.umeng.message.MessageSharedPrefs;
import com.umeng.message.UTrack;
import com.umeng.message.common.UPLog;
import com.umeng.message.entity.UMessage;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class an extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f105735b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ac f105736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f105737d;

    public an(ac acVar) {
        this.f105736c = acVar;
    }

    private StatusBarNotification a(NotificationManager notificationManager) {
        ac acVar = this.f105736c;
        if (acVar == null || acVar.f105670b == null) {
            return null;
        }
        try {
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            if (activeNotifications != null && activeNotifications.length != 0) {
                for (StatusBarNotification statusBarNotification : activeNotifications) {
                    if (TextUtils.equals(statusBarNotification.getTag(), "um") && statusBarNotification.getId() == this.f105736c.f105669a) {
                        return statusBarNotification;
                    }
                }
                return null;
            }
            return null;
        } catch (Throwable th2) {
            UPLog.e("RePop", th2);
            return null;
        }
    }

    @Override // com.umeng.message.proguard.c
    public final Future<?> b() {
        ac acVar;
        UMessage uMessage;
        if (!d() && (acVar = this.f105736c) != null && (uMessage = acVar.f105670b) != null) {
            boolean z10 = false;
            long j10 = this.f105737d;
            if (j10 == 0) {
                this.f105737d = System.currentTimeMillis();
                z10 = true;
            } else if (!f.a(j10)) {
                return this.f105786a;
            }
            Application applicationA = x.a();
            if (MessageSharedPrefs.getInstance(applicationA).o() >= MessageSharedPrefs.getInstance(applicationA).n()) {
                return this.f105786a;
            }
            ScheduledFuture<?> scheduledFutureA = b.a(this, z10 ? uMessage.getRepostStart() : uMessage.getRepostInterval(), TimeUnit.MINUTES);
            this.f105786a = scheduledFutureA;
            return scheduledFutureA;
        }
        return this.f105786a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            synchronized (f105735b) {
                if (this.f105736c == null) {
                    this.f105786a = null;
                    return;
                }
                if (!f.a(this.f105737d)) {
                    this.f105786a = null;
                    return;
                }
                Application applicationA = x.a();
                NotificationManager notificationManager = (NotificationManager) applicationA.getSystemService("notification");
                if (notificationManager == null) {
                    this.f105786a = null;
                    UPLog.d("RePop", "mgr null!");
                    return;
                }
                StatusBarNotification statusBarNotificationA = a(notificationManager);
                if (statusBarNotificationA == null) {
                    this.f105786a = null;
                    UPLog.d("RePop", "sbn null! msgId:", this.f105736c.f105670b.getMsgId());
                    return;
                }
                int iN = MessageSharedPrefs.getInstance(applicationA).n();
                int iO = MessageSharedPrefs.getInstance(applicationA).o();
                UPLog.d("RePop", "task total times:", Integer.valueOf(iO), "config:", Integer.valueOf(iN));
                if (iO >= iN) {
                    return;
                }
                Notification notification = statusBarNotificationA.getNotification();
                if (notification != null) {
                    notificationManager.cancel("um", this.f105736c.f105669a);
                    notification.when = System.currentTimeMillis();
                    notificationManager.notify("um", this.f105736c.f105669a, notification);
                    this.f105786a = null;
                    this.f105736c.f105672d++;
                    MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(applicationA);
                    Calendar calendar = Calendar.getInstance();
                    messageSharedPrefs.f105562b.a("re_pop_times", String.format(Locale.getDefault(), "%d.%d.%d", Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(6)), Integer.valueOf(iO + 1)));
                    UTrack.getInstance().trackMsgRepost(this.f105736c.f105670b, notification);
                    UPLog.d("RePop", "show msgId:", this.f105736c.f105670b.getMsgId(), "count:", Integer.valueOf(this.f105736c.f105672d));
                    a();
                }
            }
        } catch (Throwable th2) {
            UPLog.e("RePop", th2);
        }
    }
}
