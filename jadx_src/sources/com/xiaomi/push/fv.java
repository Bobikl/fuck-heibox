package com.xiaomi.push;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import androidx.core.app.o0;

/* JADX INFO: loaded from: classes4.dex */
public class fv implements fu.a {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    protected Context f443a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private PendingIntent f442a = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile long f107147a = 0;

    public fv(Context context) {
        this.f443a = null;
        this.f443a = context;
    }

    private void a(AlarmManager alarmManager, long j10, PendingIntent pendingIntent) {
        try {
            AlarmManager.class.getMethod("setExact", Integer.TYPE, Long.TYPE, PendingIntent.class).invoke(alarmManager, 2, Long.valueOf(j10), pendingIntent);
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.d("[Alarm] invoke setExact method meet error. " + e10);
        }
    }

    @Override // com.xiaomi.push.fu.a
    public void a() {
        if (this.f442a != null) {
            try {
                ((AlarmManager) this.f443a.getSystemService(o0.K0)).cancel(this.f442a);
            } catch (Exception unused) {
            } finally {
                this.f442a = null;
                com.xiaomi.channel.commonutils.logger.b.c("[Alarm] unregister timer");
                this.f107147a = 0L;
            }
        }
        this.f107147a = 0L;
    }

    public void a(Intent intent, long j10) {
        AlarmManager alarmManager = (AlarmManager) this.f443a.getSystemService(o0.K0);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            this.f442a = PendingIntent.getBroadcast(this.f443a, 0, intent, 33554432);
        } else {
            this.f442a = PendingIntent.getBroadcast(this.f443a, 0, intent, 0);
        }
        if (i10 < 31 || j.m521a(this.f443a)) {
            bk.a((Object) alarmManager, "setExactAndAllowWhileIdle", 2, Long.valueOf(j10), this.f442a);
        } else {
            alarmManager.set(2, j10, this.f442a);
        }
        com.xiaomi.channel.commonutils.logger.b.c("[Alarm] register timer " + j10);
    }

    @Override // com.xiaomi.push.fu.a
    public void a(boolean z10) {
        long jM755a = com.xiaomi.push.service.p.a(this.f443a).m755a();
        if (z10 || this.f107147a != 0) {
            if (z10) {
                a();
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (z10 || this.f107147a == 0) {
                this.f107147a = jElapsedRealtime + (jM755a - (jElapsedRealtime % jM755a));
            } else if (this.f107147a <= jElapsedRealtime) {
                this.f107147a += jM755a;
                if (this.f107147a < jElapsedRealtime) {
                    this.f107147a = jElapsedRealtime + jM755a;
                }
            }
            Intent intent = new Intent(com.xiaomi.push.service.bj.f107947q);
            intent.setPackage(this.f443a.getPackageName());
            a(intent, this.f107147a);
        }
    }

    @Override // com.xiaomi.push.fu.a
    /* JADX INFO: renamed from: a */
    public boolean mo390a() {
        return this.f107147a != 0;
    }
}
