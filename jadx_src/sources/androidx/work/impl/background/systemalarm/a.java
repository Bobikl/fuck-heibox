package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.u;
import androidx.annotation.w0;
import androidx.core.app.o0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.j;
import androidx.work.impl.model.l;
import androidx.work.n;

/* JADX INFO: compiled from: Alarms.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f28845a = n.i("Alarms");

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Alarms.java */
    @w0(19)
    public static class C0231a {
        private C0231a() {
        }

        @u
        static void a(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
            alarmManager.setExact(i10, j10, pendingIntent);
        }
    }

    private a() {
    }

    public static void a(@n0 Context context, @n0 WorkDatabase workDatabase, @n0 WorkGenerationalId workGenerationalId) {
        j jVarU = workDatabase.U();
        SystemIdInfo systemIdInfoD = jVarU.d(workGenerationalId);
        if (systemIdInfoD != null) {
            b(context, workGenerationalId, systemIdInfoD.systemId);
            n.e().a(f28845a, "Removing SystemIdInfo for workSpecId (" + workGenerationalId + ")");
            jVarU.b(workGenerationalId);
        }
    }

    private static void b(@n0 Context context, @n0 WorkGenerationalId workGenerationalId, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(o0.K0);
        PendingIntent service = PendingIntent.getService(context, i10, b.b(context, workGenerationalId), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        n.e().a(f28845a, "Cancelling existing alarm with (workSpecId, systemId) (" + workGenerationalId + ", " + i10 + ")");
        alarmManager.cancel(service);
    }

    public static void c(@n0 Context context, @n0 WorkDatabase workDatabase, @n0 WorkGenerationalId workGenerationalId, long j10) {
        j jVarU = workDatabase.U();
        SystemIdInfo systemIdInfoD = jVarU.d(workGenerationalId);
        if (systemIdInfoD != null) {
            b(context, workGenerationalId, systemIdInfoD.systemId);
            d(context, workGenerationalId, systemIdInfoD.systemId, j10);
        } else {
            int iC = new androidx.work.impl.utils.j(workDatabase).c();
            jVarU.c(l.a(workGenerationalId, iC));
            d(context, workGenerationalId, iC, j10);
        }
    }

    private static void d(@n0 Context context, @n0 WorkGenerationalId workGenerationalId, int i10, long j10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(o0.K0);
        PendingIntent service = PendingIntent.getService(context, i10, b.b(context, workGenerationalId), 201326592);
        if (alarmManager != null) {
            C0231a.a(alarmManager, 0, j10, service);
        }
    }
}
