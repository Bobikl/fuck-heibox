package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;

/* JADX INFO: compiled from: AlarmManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: compiled from: AlarmManagerCompat.java */
    @androidx.annotation.w0(19)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
            alarmManager.setExact(i10, j10, pendingIntent);
        }
    }

    /* JADX INFO: compiled from: AlarmManagerCompat.java */
    @androidx.annotation.w0(21)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static AlarmManager.AlarmClockInfo a(long j10, PendingIntent pendingIntent) {
            return new AlarmManager.AlarmClockInfo(j10, pendingIntent);
        }

        @androidx.annotation.u
        static void b(AlarmManager alarmManager, Object obj, PendingIntent pendingIntent) {
            alarmManager.setAlarmClock((AlarmManager.AlarmClockInfo) obj, pendingIntent);
        }
    }

    /* JADX INFO: compiled from: AlarmManagerCompat.java */
    @androidx.annotation.w0(23)
    public static class c {
        private c() {
        }

        @androidx.annotation.u
        static void a(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
            alarmManager.setAndAllowWhileIdle(i10, j10, pendingIntent);
        }

        @androidx.annotation.u
        static void b(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
            alarmManager.setExactAndAllowWhileIdle(i10, j10, pendingIntent);
        }
    }

    private m() {
    }

    @SuppressLint({"MissingPermission"})
    public static void a(@androidx.annotation.n0 AlarmManager alarmManager, long j10, @androidx.annotation.n0 PendingIntent pendingIntent, @androidx.annotation.n0 PendingIntent pendingIntent2) {
        b.b(alarmManager, b.a(j10, pendingIntent), pendingIntent2);
    }

    public static void b(@androidx.annotation.n0 AlarmManager alarmManager, int i10, long j10, @androidx.annotation.n0 PendingIntent pendingIntent) {
        c.a(alarmManager, i10, j10, pendingIntent);
    }

    public static void c(@androidx.annotation.n0 AlarmManager alarmManager, int i10, long j10, @androidx.annotation.n0 PendingIntent pendingIntent) {
        a.a(alarmManager, i10, j10, pendingIntent);
    }

    public static void d(@androidx.annotation.n0 AlarmManager alarmManager, int i10, long j10, @androidx.annotation.n0 PendingIntent pendingIntent) {
        c.b(alarmManager, i10, j10, pendingIntent);
    }
}
