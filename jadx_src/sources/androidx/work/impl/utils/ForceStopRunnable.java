package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.app.o0;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ForceStopRunnable implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @j1
    static final String f29262g = "ACTION_FORCE_STOP_RESCHEDULE";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @j1
    static final int f29263h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f29264i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f29265j = 300;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f29267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.work.impl.g0 f29268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f29269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f29270e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f29261f = androidx.work.n.i("ForceStopRunnable");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f29266k = TimeUnit.DAYS.toMillis(3650);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f29271a = androidx.work.n.i("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(@n0 Context context, @p0 Intent intent) {
            if (intent == null || !ForceStopRunnable.f29262g.equals(intent.getAction())) {
                return;
            }
            androidx.work.n.e().j(f29271a, "Rescheduling alarm that keeps track of force-stops.");
            ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(@n0 Context context, @n0 androidx.work.impl.g0 g0Var) {
        this.f29267b = context.getApplicationContext();
        this.f29268c = g0Var;
        this.f29269d = g0Var.K();
    }

    @j1
    static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction(f29262g);
        return intent;
    }

    private static PendingIntent d(Context context, int i10) {
        return PendingIntent.getBroadcast(context, -1, c(context), i10);
    }

    @SuppressLint({"ClassVerificationFailure"})
    static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(o0.K0);
        PendingIntent pendingIntentD = d(context, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        long jCurrentTimeMillis = System.currentTimeMillis() + f29266k;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentD);
        }
    }

    @j1
    public boolean a() {
        boolean zH = androidx.work.impl.background.systemjob.j.h(this.f29267b, this.f29268c);
        WorkDatabase workDatabaseP = this.f29268c.P();
        androidx.work.impl.model.v vVarX = workDatabaseP.X();
        androidx.work.impl.model.r rVarW = workDatabaseP.W();
        workDatabaseP.e();
        try {
            List<androidx.work.impl.model.u> listG = vVarX.G();
            boolean z10 = (listG == null || listG.isEmpty()) ? false : true;
            if (z10) {
                for (androidx.work.impl.model.u uVar : listG) {
                    vVarX.m(WorkInfo.State.ENQUEUED, uVar.id);
                    vVarX.C(uVar.id, -1L);
                }
            }
            rVarW.b();
            workDatabaseP.O();
            workDatabaseP.k();
            return z10 || zH;
        } catch (Throwable th2) {
            workDatabaseP.k();
            throw th2;
        }
    }

    @j1
    public void b() {
        boolean zA = a();
        if (h()) {
            androidx.work.n.e().a(f29261f, "Rescheduling Workers.");
            this.f29268c.U();
            this.f29268c.K().h(false);
        } else if (e()) {
            androidx.work.n.e().a(f29261f, "Application was force-stopped, rescheduling.");
            this.f29268c.U();
            this.f29269d.g(System.currentTimeMillis());
        } else if (zA) {
            androidx.work.n.e().a(f29261f, "Found unfinished work, scheduling it.");
            androidx.work.impl.u.b(this.f29268c.o(), this.f29268c.P(), this.f29268c.N());
        }
    }

    @j1
    @SuppressLint({"ClassVerificationFailure"})
    public boolean e() {
        try {
            int i10 = Build.VERSION.SDK_INT;
            PendingIntent pendingIntentD = d(this.f29267b, i10 >= 31 ? 570425344 : 536870912);
            if (i10 >= 30) {
                if (pendingIntentD != null) {
                    pendingIntentD.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) this.f29267b.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY)).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long jC = this.f29269d.c();
                    for (int i11 = 0; i11 < historicalProcessExitReasons.size(); i11++) {
                        ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) historicalProcessExitReasons.get(i11);
                        if (applicationExitInfo.getReason() == 10 && applicationExitInfo.getTimestamp() >= jC) {
                            return true;
                        }
                    }
                }
            } else if (pendingIntentD == null) {
                g(this.f29267b);
                return true;
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e10) {
            androidx.work.n.e().m(f29261f, "Ignoring exception", e10);
            return true;
        }
    }

    @j1
    public boolean f() {
        androidx.work.a aVarO = this.f29268c.o();
        if (TextUtils.isEmpty(aVarO.c())) {
            androidx.work.n.e().a(f29261f, "The default process name was not specified.");
            return true;
        }
        boolean zB = s.b(this.f29267b, aVarO);
        androidx.work.n.e().a(f29261f, "Is default app process = " + zB);
        return zB;
    }

    @j1
    public boolean h() {
        return this.f29268c.K().d();
    }

    @j1
    public void i(long j10) {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10;
        try {
            if (!f()) {
                this.f29268c.T();
                return;
            }
            while (true) {
                try {
                    androidx.work.impl.b0.d(this.f29267b);
                    androidx.work.n.e().a(f29261f, "Performing cleanup operations.");
                    try {
                        b();
                        break;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e10) {
                        i10 = this.f29270e + 1;
                        this.f29270e = i10;
                        if (i10 >= 3) {
                            androidx.work.n nVarE = androidx.work.n.e();
                            String str = f29261f;
                            nVarE.d(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                            androidx.core.util.d<Throwable> dVarE = this.f29268c.o().e();
                            if (dVarE == null) {
                                throw illegalStateException;
                            }
                            androidx.work.n.e().b(str, "Routing exception to the specified exception handler", illegalStateException);
                            dVarE.accept(illegalStateException);
                            break;
                        }
                        androidx.work.n.e().b(f29261f, "Retrying after " + (((long) i10) * 300), e10);
                        i(((long) this.f29270e) * 300);
                    }
                    androidx.work.n.e().b(f29261f, "Retrying after " + (((long) i10) * 300), e10);
                    i(((long) this.f29270e) * 300);
                } catch (SQLiteException e11) {
                    androidx.work.n.e().c(f29261f, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e11);
                    androidx.core.util.d<Throwable> dVarE2 = this.f29268c.o().e();
                    if (dVarE2 == null) {
                        throw illegalStateException2;
                    }
                    dVarE2.accept(illegalStateException2);
                }
            }
            this.f29268c.T();
        } catch (Throwable th2) {
            this.f29268c.T();
            throw th2;
        }
    }
}
