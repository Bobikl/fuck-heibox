package androidx.work.impl.model;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.w1;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: WorkSpecDao_Impl.java */
/* JADX INFO: loaded from: classes6.dex */
public final class w implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RoomDatabase f29158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.s<u> f29159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.room.r<u> f29160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SharedSQLiteStatement f29161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SharedSQLiteStatement f29162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SharedSQLiteStatement f29163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SharedSQLiteStatement f29164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final SharedSQLiteStatement f29165h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SharedSQLiteStatement f29166i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final SharedSQLiteStatement f29167j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final SharedSQLiteStatement f29168k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final SharedSQLiteStatement f29169l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final SharedSQLiteStatement f29170m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SharedSQLiteStatement f29171n;

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class a extends SharedSQLiteStatement {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String e() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class b extends SharedSQLiteStatement {
        b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String e() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class c extends SharedSQLiteStatement {
        c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String e() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class d extends SharedSQLiteStatement {
        d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String e() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class e implements Callable<List<String>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w1 f29176b;

        e(w1 w1Var) {
            this.f29176b = w1Var;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<String> call() throws Exception {
            w.this.f29158a.e();
            try {
                Cursor cursorF = androidx.room.util.b.f(w.this.f29158a, this.f29176b, false, null);
                try {
                    ArrayList arrayList = new ArrayList(cursorF.getCount());
                    while (cursorF.moveToNext()) {
                        arrayList.add(cursorF.isNull(0) ? null : cursorF.getString(0));
                    }
                    w.this.f29158a.O();
                    cursorF.close();
                    w.this.f29158a.k();
                    return arrayList;
                } catch (Throwable th2) {
                    cursorF.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                w.this.f29158a.k();
                throw th3;
            }
        }

        protected void finalize() {
            this.f29176b.release();
        }
    }

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class f implements Callable<List<u.WorkInfoPojo>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w1 f29178b;

        f(w1 w1Var) {
            this.f29178b = w1Var;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<u.WorkInfoPojo> call() throws Exception {
            w.this.f29158a.e();
            try {
                Cursor cursorF = androidx.room.util.b.f(w.this.f29158a, this.f29178b, true, null);
                try {
                    androidx.collection.a aVar = new androidx.collection.a();
                    androidx.collection.a aVar2 = new androidx.collection.a();
                    while (cursorF.moveToNext()) {
                        String string = cursorF.getString(0);
                        if (((ArrayList) aVar.get(string)) == null) {
                            aVar.put(string, new ArrayList());
                        }
                        String string2 = cursorF.getString(0);
                        if (((ArrayList) aVar2.get(string2)) == null) {
                            aVar2.put(string2, new ArrayList());
                        }
                    }
                    cursorF.moveToPosition(-1);
                    w.this.L(aVar);
                    w.this.K(aVar2);
                    ArrayList arrayList = new ArrayList(cursorF.getCount());
                    while (cursorF.moveToNext()) {
                        String string3 = cursorF.isNull(0) ? null : cursorF.getString(0);
                        int i10 = cursorF.getInt(1);
                        b0 b0Var = b0.f29060a;
                        WorkInfo.State stateF = b0.f(i10);
                        androidx.work.e eVarM = androidx.work.e.m(cursorF.isNull(2) ? null : cursorF.getBlob(2));
                        int i11 = cursorF.getInt(3);
                        int i12 = cursorF.getInt(4);
                        ArrayList arrayList2 = (ArrayList) aVar.get(cursorF.getString(0));
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        ArrayList arrayList3 = arrayList2;
                        ArrayList arrayList4 = (ArrayList) aVar2.get(cursorF.getString(0));
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList.add(new u.WorkInfoPojo(string3, stateF, eVarM, i11, i12, arrayList3, arrayList4));
                    }
                    w.this.f29158a.O();
                    cursorF.close();
                    w.this.f29158a.k();
                    return arrayList;
                } catch (Throwable th2) {
                    cursorF.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                w.this.f29158a.k();
                throw th3;
            }
        }

        protected void finalize() {
            this.f29178b.release();
        }
    }

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class g implements Callable<List<u.WorkInfoPojo>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w1 f29180b;

        g(w1 w1Var) {
            this.f29180b = w1Var;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<u.WorkInfoPojo> call() throws Exception {
            w.this.f29158a.e();
            try {
                Cursor cursorF = androidx.room.util.b.f(w.this.f29158a, this.f29180b, true, null);
                try {
                    androidx.collection.a aVar = new androidx.collection.a();
                    androidx.collection.a aVar2 = new androidx.collection.a();
                    while (cursorF.moveToNext()) {
                        String string = cursorF.getString(0);
                        if (((ArrayList) aVar.get(string)) == null) {
                            aVar.put(string, new ArrayList());
                        }
                        String string2 = cursorF.getString(0);
                        if (((ArrayList) aVar2.get(string2)) == null) {
                            aVar2.put(string2, new ArrayList());
                        }
                    }
                    cursorF.moveToPosition(-1);
                    w.this.L(aVar);
                    w.this.K(aVar2);
                    ArrayList arrayList = new ArrayList(cursorF.getCount());
                    while (cursorF.moveToNext()) {
                        String string3 = cursorF.isNull(0) ? null : cursorF.getString(0);
                        int i10 = cursorF.getInt(1);
                        b0 b0Var = b0.f29060a;
                        WorkInfo.State stateF = b0.f(i10);
                        androidx.work.e eVarM = androidx.work.e.m(cursorF.isNull(2) ? null : cursorF.getBlob(2));
                        int i11 = cursorF.getInt(3);
                        int i12 = cursorF.getInt(4);
                        ArrayList arrayList2 = (ArrayList) aVar.get(cursorF.getString(0));
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        ArrayList arrayList3 = arrayList2;
                        ArrayList arrayList4 = (ArrayList) aVar2.get(cursorF.getString(0));
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList.add(new u.WorkInfoPojo(string3, stateF, eVarM, i11, i12, arrayList3, arrayList4));
                    }
                    w.this.f29158a.O();
                    cursorF.close();
                    w.this.f29158a.k();
                    return arrayList;
                } catch (Throwable th2) {
                    cursorF.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                w.this.f29158a.k();
                throw th3;
            }
        }

        protected void finalize() {
            this.f29180b.release();
        }
    }

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class h implements Callable<List<u.WorkInfoPojo>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w1 f29182b;

        h(w1 w1Var) {
            this.f29182b = w1Var;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<u.WorkInfoPojo> call() throws Exception {
            w.this.f29158a.e();
            try {
                Cursor cursorF = androidx.room.util.b.f(w.this.f29158a, this.f29182b, true, null);
                try {
                    androidx.collection.a aVar = new androidx.collection.a();
                    androidx.collection.a aVar2 = new androidx.collection.a();
                    while (cursorF.moveToNext()) {
                        String string = cursorF.getString(0);
                        if (((ArrayList) aVar.get(string)) == null) {
                            aVar.put(string, new ArrayList());
                        }
                        String string2 = cursorF.getString(0);
                        if (((ArrayList) aVar2.get(string2)) == null) {
                            aVar2.put(string2, new ArrayList());
                        }
                    }
                    cursorF.moveToPosition(-1);
                    w.this.L(aVar);
                    w.this.K(aVar2);
                    ArrayList arrayList = new ArrayList(cursorF.getCount());
                    while (cursorF.moveToNext()) {
                        String string3 = cursorF.isNull(0) ? null : cursorF.getString(0);
                        int i10 = cursorF.getInt(1);
                        b0 b0Var = b0.f29060a;
                        WorkInfo.State stateF = b0.f(i10);
                        androidx.work.e eVarM = androidx.work.e.m(cursorF.isNull(2) ? null : cursorF.getBlob(2));
                        int i11 = cursorF.getInt(3);
                        int i12 = cursorF.getInt(4);
                        ArrayList arrayList2 = (ArrayList) aVar.get(cursorF.getString(0));
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        ArrayList arrayList3 = arrayList2;
                        ArrayList arrayList4 = (ArrayList) aVar2.get(cursorF.getString(0));
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList.add(new u.WorkInfoPojo(string3, stateF, eVarM, i11, i12, arrayList3, arrayList4));
                    }
                    w.this.f29158a.O();
                    cursorF.close();
                    w.this.f29158a.k();
                    return arrayList;
                } catch (Throwable th2) {
                    cursorF.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                w.this.f29158a.k();
                throw th3;
            }
        }

        protected void finalize() {
            this.f29182b.release();
        }
    }

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class i implements Callable<Long> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w1 f29184b;

        i(w1 w1Var) {
            this.f29184b = w1Var;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call() throws Exception {
            Cursor cursorF = androidx.room.util.b.f(w.this.f29158a, this.f29184b, false, null);
            try {
                return Long.valueOf(cursorF.moveToFirst() ? cursorF.getLong(0) : 0L);
            } finally {
                cursorF.close();
            }
        }

        protected void finalize() {
            this.f29184b.release();
        }
    }

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class j extends androidx.room.s<u> {
        j(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String e() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.s
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void i(j3.l lVar, u uVar) throws Throwable {
            String str = uVar.id;
            if (str == null) {
                lVar.r0(1);
            } else {
                lVar.X(1, str);
            }
            b0 b0Var = b0.f29060a;
            lVar.d0(2, b0.j(uVar.state));
            String str2 = uVar.workerClassName;
            if (str2 == null) {
                lVar.r0(3);
            } else {
                lVar.X(3, str2);
            }
            String str3 = uVar.inputMergerClassName;
            if (str3 == null) {
                lVar.r0(4);
            } else {
                lVar.X(4, str3);
            }
            byte[] bArrF = androidx.work.e.F(uVar.input);
            if (bArrF == null) {
                lVar.r0(5);
            } else {
                lVar.l0(5, bArrF);
            }
            byte[] bArrF2 = androidx.work.e.F(uVar.output);
            if (bArrF2 == null) {
                lVar.r0(6);
            } else {
                lVar.l0(6, bArrF2);
            }
            lVar.d0(7, uVar.initialDelay);
            lVar.d0(8, uVar.intervalDuration);
            lVar.d0(9, uVar.flexDuration);
            lVar.d0(10, uVar.runAttemptCount);
            lVar.d0(11, b0.a(uVar.backoffPolicy));
            lVar.d0(12, uVar.backoffDelayDuration);
            lVar.d0(13, uVar.lastEnqueueTime);
            lVar.d0(14, uVar.minimumRetentionDuration);
            lVar.d0(15, uVar.scheduleRequestedAt);
            lVar.d0(16, uVar.expedited ? 1L : 0L);
            lVar.d0(17, b0.h(uVar.outOfQuotaPolicy));
            lVar.d0(18, uVar.getPeriodCount());
            lVar.d0(19, uVar.z());
            androidx.work.c cVar = uVar.constraints;
            if (cVar == null) {
                lVar.r0(20);
                lVar.r0(21);
                lVar.r0(22);
                lVar.r0(23);
                lVar.r0(24);
                lVar.r0(25);
                lVar.r0(26);
                lVar.r0(27);
                return;
            }
            lVar.d0(20, b0.g(cVar.getRequiredNetworkType()));
            lVar.d0(21, cVar.getRequiresCharging() ? 1L : 0L);
            lVar.d0(22, cVar.getRequiresDeviceIdle() ? 1L : 0L);
            lVar.d0(23, cVar.getRequiresBatteryNotLow() ? 1L : 0L);
            lVar.d0(24, cVar.getRequiresStorageNotLow() ? 1L : 0L);
            lVar.d0(25, cVar.getContentTriggerUpdateDelayMillis());
            lVar.d0(26, cVar.getContentTriggerMaxDelayMillis());
            byte[] bArrI = b0.i(cVar.c());
            if (bArrI == null) {
                lVar.r0(27);
            } else {
                lVar.l0(27, bArrI);
            }
        }
    }

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class k extends androidx.room.r<u> {
        k(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.r, androidx.room.SharedSQLiteStatement
        public String e() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }

        @Override // androidx.room.r
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void i(j3.l lVar, u uVar) throws Throwable {
            String str = uVar.id;
            if (str == null) {
                lVar.r0(1);
            } else {
                lVar.X(1, str);
            }
            b0 b0Var = b0.f29060a;
            lVar.d0(2, b0.j(uVar.state));
            String str2 = uVar.workerClassName;
            if (str2 == null) {
                lVar.r0(3);
            } else {
                lVar.X(3, str2);
            }
            String str3 = uVar.inputMergerClassName;
            if (str3 == null) {
                lVar.r0(4);
            } else {
                lVar.X(4, str3);
            }
            byte[] bArrF = androidx.work.e.F(uVar.input);
            if (bArrF == null) {
                lVar.r0(5);
            } else {
                lVar.l0(5, bArrF);
            }
            byte[] bArrF2 = androidx.work.e.F(uVar.output);
            if (bArrF2 == null) {
                lVar.r0(6);
            } else {
                lVar.l0(6, bArrF2);
            }
            lVar.d0(7, uVar.initialDelay);
            lVar.d0(8, uVar.intervalDuration);
            lVar.d0(9, uVar.flexDuration);
            lVar.d0(10, uVar.runAttemptCount);
            lVar.d0(11, b0.a(uVar.backoffPolicy));
            lVar.d0(12, uVar.backoffDelayDuration);
            lVar.d0(13, uVar.lastEnqueueTime);
            lVar.d0(14, uVar.minimumRetentionDuration);
            lVar.d0(15, uVar.scheduleRequestedAt);
            lVar.d0(16, uVar.expedited ? 1L : 0L);
            lVar.d0(17, b0.h(uVar.outOfQuotaPolicy));
            lVar.d0(18, uVar.getPeriodCount());
            lVar.d0(19, uVar.z());
            androidx.work.c cVar = uVar.constraints;
            if (cVar != null) {
                lVar.d0(20, b0.g(cVar.getRequiredNetworkType()));
                lVar.d0(21, cVar.getRequiresCharging() ? 1L : 0L);
                lVar.d0(22, cVar.getRequiresDeviceIdle() ? 1L : 0L);
                lVar.d0(23, cVar.getRequiresBatteryNotLow() ? 1L : 0L);
                lVar.d0(24, cVar.getRequiresStorageNotLow() ? 1L : 0L);
                lVar.d0(25, cVar.getContentTriggerUpdateDelayMillis());
                lVar.d0(26, cVar.getContentTriggerMaxDelayMillis());
                byte[] bArrI = b0.i(cVar.c());
                if (bArrI == null) {
                    lVar.r0(27);
                } else {
                    lVar.l0(27, bArrI);
                }
            } else {
                lVar.r0(20);
                lVar.r0(21);
                lVar.r0(22);
                lVar.r0(23);
                lVar.r0(24);
                lVar.r0(25);
                lVar.r0(26);
                lVar.r0(27);
            }
            String str4 = uVar.id;
            if (str4 == null) {
                lVar.r0(28);
            } else {
                lVar.X(28, str4);
            }
        }
    }

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class l extends SharedSQLiteStatement {
        l(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String e() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class m extends SharedSQLiteStatement {
        m(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String e() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class n extends SharedSQLiteStatement {
        n(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String e() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class o extends SharedSQLiteStatement {
        o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String e() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class p extends SharedSQLiteStatement {
        p(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String e() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class q extends SharedSQLiteStatement {
        q(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String e() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class r extends SharedSQLiteStatement {
        r(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String e() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    public w(RoomDatabase roomDatabase) {
        this.f29158a = roomDatabase;
        this.f29159b = new j(roomDatabase);
        this.f29160c = new k(roomDatabase);
        this.f29161d = new l(roomDatabase);
        this.f29162e = new m(roomDatabase);
        this.f29163f = new n(roomDatabase);
        this.f29164g = new o(roomDatabase);
        this.f29165h = new p(roomDatabase);
        this.f29166i = new q(roomDatabase);
        this.f29167j = new r(roomDatabase);
        this.f29168k = new a(roomDatabase);
        this.f29169l = new b(roomDatabase);
        this.f29170m = new c(roomDatabase);
        this.f29171n = new d(roomDatabase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(androidx.collection.a<String, ArrayList<androidx.work.e>> aVar) {
        Set<String> setKeySet = aVar.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (aVar.size() > 999) {
            androidx.collection.a<String, ArrayList<androidx.work.e>> aVar2 = new androidx.collection.a<>(999);
            int size = aVar.size();
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                aVar2.put(aVar.g(i10), aVar.k(i10));
                i10++;
                i11++;
                if (i11 == 999) {
                    K(aVar2);
                    aVar2 = new androidx.collection.a<>(999);
                    i11 = 0;
                }
            }
            if (i11 > 0) {
                K(aVar2);
                return;
            }
            return;
        }
        StringBuilder sbD = androidx.room.util.e.d();
        sbD.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size2 = setKeySet.size();
        androidx.room.util.e.a(sbD, size2);
        sbD.append(")");
        w1 w1VarD = w1.d(sbD.toString(), size2 + 0);
        int i12 = 1;
        for (String str : setKeySet) {
            if (str == null) {
                w1VarD.r0(i12);
            } else {
                w1VarD.X(i12, str);
            }
            i12++;
        }
        Cursor cursorF = androidx.room.util.b.f(this.f29158a, w1VarD, false, null);
        try {
            int iD = androidx.room.util.a.d(cursorF, "work_spec_id");
            if (iD == -1) {
                return;
            }
            while (cursorF.moveToNext()) {
                ArrayList<androidx.work.e> arrayList = aVar.get(cursorF.getString(iD));
                if (arrayList != null) {
                    arrayList.add(androidx.work.e.m(cursorF.isNull(0) ? null : cursorF.getBlob(0)));
                }
            }
        } finally {
            cursorF.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(androidx.collection.a<String, ArrayList<String>> aVar) {
        Set<String> setKeySet = aVar.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (aVar.size() > 999) {
            androidx.collection.a<String, ArrayList<String>> aVar2 = new androidx.collection.a<>(999);
            int size = aVar.size();
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                aVar2.put(aVar.g(i10), aVar.k(i10));
                i10++;
                i11++;
                if (i11 == 999) {
                    L(aVar2);
                    aVar2 = new androidx.collection.a<>(999);
                    i11 = 0;
                }
            }
            if (i11 > 0) {
                L(aVar2);
                return;
            }
            return;
        }
        StringBuilder sbD = androidx.room.util.e.d();
        sbD.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size2 = setKeySet.size();
        androidx.room.util.e.a(sbD, size2);
        sbD.append(")");
        w1 w1VarD = w1.d(sbD.toString(), size2 + 0);
        int i12 = 1;
        for (String str : setKeySet) {
            if (str == null) {
                w1VarD.r0(i12);
            } else {
                w1VarD.X(i12, str);
            }
            i12++;
        }
        Cursor cursorF = androidx.room.util.b.f(this.f29158a, w1VarD, false, null);
        try {
            int iD = androidx.room.util.a.d(cursorF, "work_spec_id");
            if (iD == -1) {
                return;
            }
            while (cursorF.moveToNext()) {
                ArrayList<String> arrayList = aVar.get(cursorF.getString(iD));
                if (arrayList != null) {
                    arrayList.add(cursorF.isNull(0) ? null : cursorF.getString(0));
                }
            }
        } finally {
            cursorF.close();
        }
    }

    public static List<Class<?>> P() {
        return Collections.emptyList();
    }

    @Override // androidx.work.impl.model.v
    public LiveData<Long> A(String str) {
        w1 w1VarD = w1.d("SELECT schedule_requested_at FROM workspec WHERE id=?", 1);
        if (str == null) {
            w1VarD.r0(1);
        } else {
            w1VarD.X(1, str);
        }
        return this.f29158a.getInvalidationTracker().e(new String[]{"workspec"}, false, new i(w1VarD));
    }

    @Override // androidx.work.impl.model.v
    public int B() {
        this.f29158a.d();
        j3.l lVarB = this.f29169l.b();
        this.f29158a.e();
        try {
            int iY = lVarB.y();
            this.f29158a.O();
            return iY;
        } finally {
            this.f29158a.k();
            this.f29169l.h(lVarB);
        }
    }

    @Override // androidx.work.impl.model.v
    public int C(String str, long j10) {
        this.f29158a.d();
        j3.l lVarB = this.f29168k.b();
        lVarB.d0(1, j10);
        if (str == null) {
            lVarB.r0(2);
        } else {
            lVarB.X(2, str);
        }
        this.f29158a.e();
        try {
            int iY = lVarB.y();
            this.f29158a.O();
            return iY;
        } finally {
            this.f29158a.k();
            this.f29168k.h(lVarB);
        }
    }

    @Override // androidx.work.impl.model.v
    public List<u.IdAndState> D(String str) {
        w1 w1VarD = w1.d("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            w1VarD.r0(1);
        } else {
            w1VarD.X(1, str);
        }
        this.f29158a.d();
        Cursor cursorF = androidx.room.util.b.f(this.f29158a, w1VarD, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                String string = cursorF.isNull(0) ? null : cursorF.getString(0);
                int i10 = cursorF.getInt(1);
                b0 b0Var = b0.f29060a;
                arrayList.add(new u.IdAndState(string, b0.f(i10)));
            }
            return arrayList;
        } finally {
            cursorF.close();
            w1VarD.release();
        }
    }

    @Override // androidx.work.impl.model.v
    public List<u> E(int i10) throws Throwable {
        w1 w1Var;
        w1 w1VarD = w1.d("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        w1VarD.d0(1, i10);
        this.f29158a.d();
        Cursor cursorF = androidx.room.util.b.f(this.f29158a, w1VarD, false, null);
        try {
            int iE = androidx.room.util.a.e(cursorF, "id");
            int iE2 = androidx.room.util.a.e(cursorF, "state");
            int iE3 = androidx.room.util.a.e(cursorF, "worker_class_name");
            int iE4 = androidx.room.util.a.e(cursorF, "input_merger_class_name");
            int iE5 = androidx.room.util.a.e(cursorF, "input");
            int iE6 = androidx.room.util.a.e(cursorF, "output");
            int iE7 = androidx.room.util.a.e(cursorF, "initial_delay");
            int iE8 = androidx.room.util.a.e(cursorF, "interval_duration");
            int iE9 = androidx.room.util.a.e(cursorF, "flex_duration");
            int iE10 = androidx.room.util.a.e(cursorF, "run_attempt_count");
            int iE11 = androidx.room.util.a.e(cursorF, "backoff_policy");
            int iE12 = androidx.room.util.a.e(cursorF, "backoff_delay_duration");
            int iE13 = androidx.room.util.a.e(cursorF, "last_enqueue_time");
            int iE14 = androidx.room.util.a.e(cursorF, "minimum_retention_duration");
            w1Var = w1VarD;
            try {
                int iE15 = androidx.room.util.a.e(cursorF, "schedule_requested_at");
                int iE16 = androidx.room.util.a.e(cursorF, "run_in_foreground");
                int iE17 = androidx.room.util.a.e(cursorF, "out_of_quota_policy");
                int iE18 = androidx.room.util.a.e(cursorF, "period_count");
                int iE19 = androidx.room.util.a.e(cursorF, "generation");
                int iE20 = androidx.room.util.a.e(cursorF, "required_network_type");
                int iE21 = androidx.room.util.a.e(cursorF, "requires_charging");
                int iE22 = androidx.room.util.a.e(cursorF, "requires_device_idle");
                int iE23 = androidx.room.util.a.e(cursorF, "requires_battery_not_low");
                int iE24 = androidx.room.util.a.e(cursorF, "requires_storage_not_low");
                int iE25 = androidx.room.util.a.e(cursorF, "trigger_content_update_delay");
                int iE26 = androidx.room.util.a.e(cursorF, "trigger_max_content_delay");
                int iE27 = androidx.room.util.a.e(cursorF, "content_uri_triggers");
                int i11 = iE14;
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    String string = cursorF.isNull(iE) ? null : cursorF.getString(iE);
                    int i12 = cursorF.getInt(iE2);
                    b0 b0Var = b0.f29060a;
                    WorkInfo.State stateF = b0.f(i12);
                    String string2 = cursorF.isNull(iE3) ? null : cursorF.getString(iE3);
                    String string3 = cursorF.isNull(iE4) ? null : cursorF.getString(iE4);
                    androidx.work.e eVarM = androidx.work.e.m(cursorF.isNull(iE5) ? null : cursorF.getBlob(iE5));
                    androidx.work.e eVarM2 = androidx.work.e.m(cursorF.isNull(iE6) ? null : cursorF.getBlob(iE6));
                    long j10 = cursorF.getLong(iE7);
                    long j11 = cursorF.getLong(iE8);
                    long j12 = cursorF.getLong(iE9);
                    int i13 = cursorF.getInt(iE10);
                    BackoffPolicy backoffPolicyC = b0.c(cursorF.getInt(iE11));
                    long j13 = cursorF.getLong(iE12);
                    long j14 = cursorF.getLong(iE13);
                    int i14 = i11;
                    long j15 = cursorF.getLong(i14);
                    int i15 = iE;
                    int i16 = iE15;
                    long j16 = cursorF.getLong(i16);
                    iE15 = i16;
                    iE16 = iE16;
                    boolean z10 = cursorF.getInt(iE16) != 0;
                    OutOfQuotaPolicy outOfQuotaPolicyE = b0.e(cursorF.getInt(iE17));
                    iE17 = iE17;
                    int i17 = iE18;
                    int i18 = cursorF.getInt(i17);
                    iE18 = i17;
                    int i19 = iE19;
                    int i20 = cursorF.getInt(i19);
                    iE19 = i19;
                    int i21 = iE20;
                    NetworkType networkTypeD = b0.d(cursorF.getInt(i21));
                    iE20 = i21;
                    iE21 = iE21;
                    boolean z11 = cursorF.getInt(iE21) != 0;
                    boolean z12 = cursorF.getInt(iE22) != 0;
                    boolean z13 = cursorF.getInt(iE23) != 0;
                    boolean z14 = cursorF.getInt(iE24) != 0;
                    long j17 = cursorF.getLong(iE25);
                    iE25 = iE25;
                    int i22 = iE26;
                    long j18 = cursorF.getLong(i22);
                    iE26 = i22;
                    int i23 = iE27;
                    iE27 = i23;
                    arrayList.add(new u(string, stateF, string2, string3, eVarM, eVarM2, j10, j11, j12, new androidx.work.c(networkTypeD, z11, z12, z13, z14, j17, j18, b0.b(cursorF.isNull(i23) ? null : cursorF.getBlob(i23))), i13, backoffPolicyC, j13, j14, j15, j16, z10, outOfQuotaPolicyE, i18, i20));
                    iE = i15;
                    i11 = i14;
                }
                cursorF.close();
                w1Var.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorF.close();
                w1Var.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            w1Var = w1VarD;
        }
    }

    @Override // androidx.work.impl.model.v
    public void F(String str, androidx.work.e eVar) throws Throwable {
        this.f29158a.d();
        j3.l lVarB = this.f29164g.b();
        byte[] bArrF = androidx.work.e.F(eVar);
        if (bArrF == null) {
            lVarB.r0(1);
        } else {
            lVarB.l0(1, bArrF);
        }
        if (str == null) {
            lVarB.r0(2);
        } else {
            lVarB.X(2, str);
        }
        this.f29158a.e();
        try {
            lVarB.y();
            this.f29158a.O();
        } finally {
            this.f29158a.k();
            this.f29164g.h(lVarB);
        }
    }

    @Override // androidx.work.impl.model.v
    public List<u> G() throws Throwable {
        w1 w1Var;
        w1 w1VarD = w1.d("SELECT * FROM workspec WHERE state=1", 0);
        this.f29158a.d();
        Cursor cursorF = androidx.room.util.b.f(this.f29158a, w1VarD, false, null);
        try {
            int iE = androidx.room.util.a.e(cursorF, "id");
            int iE2 = androidx.room.util.a.e(cursorF, "state");
            int iE3 = androidx.room.util.a.e(cursorF, "worker_class_name");
            int iE4 = androidx.room.util.a.e(cursorF, "input_merger_class_name");
            int iE5 = androidx.room.util.a.e(cursorF, "input");
            int iE6 = androidx.room.util.a.e(cursorF, "output");
            int iE7 = androidx.room.util.a.e(cursorF, "initial_delay");
            int iE8 = androidx.room.util.a.e(cursorF, "interval_duration");
            int iE9 = androidx.room.util.a.e(cursorF, "flex_duration");
            int iE10 = androidx.room.util.a.e(cursorF, "run_attempt_count");
            int iE11 = androidx.room.util.a.e(cursorF, "backoff_policy");
            int iE12 = androidx.room.util.a.e(cursorF, "backoff_delay_duration");
            int iE13 = androidx.room.util.a.e(cursorF, "last_enqueue_time");
            int iE14 = androidx.room.util.a.e(cursorF, "minimum_retention_duration");
            w1Var = w1VarD;
            try {
                int iE15 = androidx.room.util.a.e(cursorF, "schedule_requested_at");
                int iE16 = androidx.room.util.a.e(cursorF, "run_in_foreground");
                int iE17 = androidx.room.util.a.e(cursorF, "out_of_quota_policy");
                int iE18 = androidx.room.util.a.e(cursorF, "period_count");
                int iE19 = androidx.room.util.a.e(cursorF, "generation");
                int iE20 = androidx.room.util.a.e(cursorF, "required_network_type");
                int iE21 = androidx.room.util.a.e(cursorF, "requires_charging");
                int iE22 = androidx.room.util.a.e(cursorF, "requires_device_idle");
                int iE23 = androidx.room.util.a.e(cursorF, "requires_battery_not_low");
                int iE24 = androidx.room.util.a.e(cursorF, "requires_storage_not_low");
                int iE25 = androidx.room.util.a.e(cursorF, "trigger_content_update_delay");
                int iE26 = androidx.room.util.a.e(cursorF, "trigger_max_content_delay");
                int iE27 = androidx.room.util.a.e(cursorF, "content_uri_triggers");
                int i10 = iE14;
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    String string = cursorF.isNull(iE) ? null : cursorF.getString(iE);
                    int i11 = cursorF.getInt(iE2);
                    b0 b0Var = b0.f29060a;
                    WorkInfo.State stateF = b0.f(i11);
                    String string2 = cursorF.isNull(iE3) ? null : cursorF.getString(iE3);
                    String string3 = cursorF.isNull(iE4) ? null : cursorF.getString(iE4);
                    androidx.work.e eVarM = androidx.work.e.m(cursorF.isNull(iE5) ? null : cursorF.getBlob(iE5));
                    androidx.work.e eVarM2 = androidx.work.e.m(cursorF.isNull(iE6) ? null : cursorF.getBlob(iE6));
                    long j10 = cursorF.getLong(iE7);
                    long j11 = cursorF.getLong(iE8);
                    long j12 = cursorF.getLong(iE9);
                    int i12 = cursorF.getInt(iE10);
                    BackoffPolicy backoffPolicyC = b0.c(cursorF.getInt(iE11));
                    long j13 = cursorF.getLong(iE12);
                    long j14 = cursorF.getLong(iE13);
                    int i13 = i10;
                    long j15 = cursorF.getLong(i13);
                    int i14 = iE;
                    int i15 = iE15;
                    long j16 = cursorF.getLong(i15);
                    iE15 = i15;
                    iE16 = iE16;
                    boolean z10 = cursorF.getInt(iE16) != 0;
                    OutOfQuotaPolicy outOfQuotaPolicyE = b0.e(cursorF.getInt(iE17));
                    iE17 = iE17;
                    int i16 = iE18;
                    int i17 = cursorF.getInt(i16);
                    iE18 = i16;
                    int i18 = iE19;
                    int i19 = cursorF.getInt(i18);
                    iE19 = i18;
                    int i20 = iE20;
                    NetworkType networkTypeD = b0.d(cursorF.getInt(i20));
                    iE20 = i20;
                    iE21 = iE21;
                    boolean z11 = cursorF.getInt(iE21) != 0;
                    boolean z12 = cursorF.getInt(iE22) != 0;
                    boolean z13 = cursorF.getInt(iE23) != 0;
                    boolean z14 = cursorF.getInt(iE24) != 0;
                    long j17 = cursorF.getLong(iE25);
                    iE25 = iE25;
                    int i21 = iE26;
                    long j18 = cursorF.getLong(i21);
                    iE26 = i21;
                    int i22 = iE27;
                    iE27 = i22;
                    arrayList.add(new u(string, stateF, string2, string3, eVarM, eVarM2, j10, j11, j12, new androidx.work.c(networkTypeD, z11, z12, z13, z14, j17, j18, b0.b(cursorF.isNull(i22) ? null : cursorF.getBlob(i22))), i12, backoffPolicyC, j13, j14, j15, j16, z10, outOfQuotaPolicyE, i17, i19));
                    iE = i14;
                    i10 = i13;
                }
                cursorF.close();
                w1Var.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorF.close();
                w1Var.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            w1Var = w1VarD;
        }
    }

    @Override // androidx.work.impl.model.v
    public List<u.WorkInfoPojo> H(String str) {
        w1 w1VarD = w1.d("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            w1VarD.r0(1);
        } else {
            w1VarD.X(1, str);
        }
        this.f29158a.d();
        this.f29158a.e();
        try {
            Cursor cursorF = androidx.room.util.b.f(this.f29158a, w1VarD, true, null);
            try {
                androidx.collection.a<String, ArrayList<String>> aVar = new androidx.collection.a<>();
                androidx.collection.a<String, ArrayList<androidx.work.e>> aVar2 = new androidx.collection.a<>();
                while (cursorF.moveToNext()) {
                    String string = cursorF.getString(0);
                    if (aVar.get(string) == null) {
                        aVar.put(string, new ArrayList<>());
                    }
                    String string2 = cursorF.getString(0);
                    if (aVar2.get(string2) == null) {
                        aVar2.put(string2, new ArrayList<>());
                    }
                }
                cursorF.moveToPosition(-1);
                L(aVar);
                K(aVar2);
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    String string3 = cursorF.isNull(0) ? null : cursorF.getString(0);
                    int i10 = cursorF.getInt(1);
                    b0 b0Var = b0.f29060a;
                    WorkInfo.State stateF = b0.f(i10);
                    androidx.work.e eVarM = androidx.work.e.m(cursorF.isNull(2) ? null : cursorF.getBlob(2));
                    int i11 = cursorF.getInt(3);
                    int i12 = cursorF.getInt(4);
                    ArrayList<String> arrayList2 = aVar.get(cursorF.getString(0));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    ArrayList<String> arrayList3 = arrayList2;
                    ArrayList<androidx.work.e> arrayList4 = aVar2.get(cursorF.getString(0));
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList<>();
                    }
                    arrayList.add(new u.WorkInfoPojo(string3, stateF, eVarM, i11, i12, arrayList3, arrayList4));
                }
                this.f29158a.O();
                cursorF.close();
                w1VarD.release();
                this.f29158a.k();
                return arrayList;
            } catch (Throwable th2) {
                cursorF.close();
                w1VarD.release();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f29158a.k();
            throw th3;
        }
    }

    @Override // androidx.work.impl.model.v
    public int I(String str) {
        this.f29158a.d();
        j3.l lVarB = this.f29166i.b();
        if (str == null) {
            lVarB.r0(1);
        } else {
            lVarB.X(1, str);
        }
        this.f29158a.e();
        try {
            int iY = lVarB.y();
            this.f29158a.O();
            return iY;
        } finally {
            this.f29158a.k();
            this.f29166i.h(lVarB);
        }
    }

    @Override // androidx.work.impl.model.v
    public List<u.WorkInfoPojo> J(List<String> list) {
        StringBuilder sbD = androidx.room.util.e.d();
        sbD.append("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (");
        int size = list.size();
        androidx.room.util.e.a(sbD, size);
        sbD.append(")");
        w1 w1VarD = w1.d(sbD.toString(), size + 0);
        int i10 = 1;
        for (String str : list) {
            if (str == null) {
                w1VarD.r0(i10);
            } else {
                w1VarD.X(i10, str);
            }
            i10++;
        }
        this.f29158a.d();
        this.f29158a.e();
        try {
            Cursor cursorF = androidx.room.util.b.f(this.f29158a, w1VarD, true, null);
            try {
                androidx.collection.a<String, ArrayList<String>> aVar = new androidx.collection.a<>();
                androidx.collection.a<String, ArrayList<androidx.work.e>> aVar2 = new androidx.collection.a<>();
                while (cursorF.moveToNext()) {
                    String string = cursorF.getString(0);
                    if (aVar.get(string) == null) {
                        aVar.put(string, new ArrayList<>());
                    }
                    String string2 = cursorF.getString(0);
                    if (aVar2.get(string2) == null) {
                        aVar2.put(string2, new ArrayList<>());
                    }
                }
                cursorF.moveToPosition(-1);
                L(aVar);
                K(aVar2);
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    String string3 = cursorF.isNull(0) ? null : cursorF.getString(0);
                    int i11 = cursorF.getInt(1);
                    b0 b0Var = b0.f29060a;
                    WorkInfo.State stateF = b0.f(i11);
                    androidx.work.e eVarM = androidx.work.e.m(cursorF.isNull(2) ? null : cursorF.getBlob(2));
                    int i12 = cursorF.getInt(3);
                    int i13 = cursorF.getInt(4);
                    ArrayList<String> arrayList2 = aVar.get(cursorF.getString(0));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    ArrayList<String> arrayList3 = arrayList2;
                    ArrayList<androidx.work.e> arrayList4 = aVar2.get(cursorF.getString(0));
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList<>();
                    }
                    arrayList.add(new u.WorkInfoPojo(string3, stateF, eVarM, i12, i13, arrayList3, arrayList4));
                }
                this.f29158a.O();
                cursorF.close();
                w1VarD.release();
                this.f29158a.k();
                return arrayList;
            } catch (Throwable th2) {
                cursorF.close();
                w1VarD.release();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f29158a.k();
            throw th3;
        }
    }

    @Override // androidx.work.impl.model.v
    public void a(String str) {
        this.f29158a.d();
        j3.l lVarB = this.f29161d.b();
        if (str == null) {
            lVarB.r0(1);
        } else {
            lVarB.X(1, str);
        }
        this.f29158a.e();
        try {
            lVarB.y();
            this.f29158a.O();
        } finally {
            this.f29158a.k();
            this.f29161d.h(lVarB);
        }
    }

    @Override // androidx.work.impl.model.v
    public void b(u uVar) {
        this.f29158a.d();
        this.f29158a.e();
        try {
            this.f29160c.j(uVar);
            this.f29158a.O();
        } finally {
            this.f29158a.k();
        }
    }

    @Override // androidx.work.impl.model.v
    public void c() {
        this.f29158a.d();
        j3.l lVarB = this.f29170m.b();
        this.f29158a.e();
        try {
            lVarB.y();
            this.f29158a.O();
        } finally {
            this.f29158a.k();
            this.f29170m.h(lVarB);
        }
    }

    @Override // androidx.work.impl.model.v
    public void d(String str) {
        this.f29158a.d();
        j3.l lVarB = this.f29171n.b();
        if (str == null) {
            lVarB.r0(1);
        } else {
            lVarB.X(1, str);
        }
        this.f29158a.e();
        try {
            lVarB.y();
            this.f29158a.O();
        } finally {
            this.f29158a.k();
            this.f29171n.h(lVarB);
        }
    }

    @Override // androidx.work.impl.model.v
    public void e(u uVar) {
        this.f29158a.d();
        this.f29158a.e();
        try {
            this.f29159b.k(uVar);
            this.f29158a.O();
        } finally {
            this.f29158a.k();
        }
    }

    @Override // androidx.work.impl.model.v
    public List<String> f(String str) {
        w1 w1VarD = w1.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            w1VarD.r0(1);
        } else {
            w1VarD.X(1, str);
        }
        this.f29158a.d();
        Cursor cursorF = androidx.room.util.b.f(this.f29158a, w1VarD, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                arrayList.add(cursorF.isNull(0) ? null : cursorF.getString(0));
            }
            return arrayList;
        } finally {
            cursorF.close();
            w1VarD.release();
        }
    }

    @Override // androidx.work.impl.model.v
    public WorkInfo.State g(String str) {
        w1 w1VarD = w1.d("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            w1VarD.r0(1);
        } else {
            w1VarD.X(1, str);
        }
        this.f29158a.d();
        WorkInfo.State stateF = null;
        Cursor cursorF = androidx.room.util.b.f(this.f29158a, w1VarD, false, null);
        try {
            if (cursorF.moveToFirst()) {
                Integer numValueOf = cursorF.isNull(0) ? null : Integer.valueOf(cursorF.getInt(0));
                if (numValueOf != null) {
                    b0 b0Var = b0.f29060a;
                    stateF = b0.f(numValueOf.intValue());
                }
            }
            return stateF;
        } finally {
            cursorF.close();
            w1VarD.release();
        }
    }

    @Override // androidx.work.impl.model.v
    public void h(String str, long j10) {
        this.f29158a.d();
        j3.l lVarB = this.f29165h.b();
        lVarB.d0(1, j10);
        if (str == null) {
            lVarB.r0(2);
        } else {
            lVarB.X(2, str);
        }
        this.f29158a.e();
        try {
            lVarB.y();
            this.f29158a.O();
        } finally {
            this.f29158a.k();
            this.f29165h.h(lVarB);
        }
    }

    @Override // androidx.work.impl.model.v
    public List<String> i(String str) {
        w1 w1VarD = w1.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            w1VarD.r0(1);
        } else {
            w1VarD.X(1, str);
        }
        this.f29158a.d();
        Cursor cursorF = androidx.room.util.b.f(this.f29158a, w1VarD, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                arrayList.add(cursorF.isNull(0) ? null : cursorF.getString(0));
            }
            return arrayList;
        } finally {
            cursorF.close();
            w1VarD.release();
        }
    }

    @Override // androidx.work.impl.model.v
    public List<androidx.work.e> j(String str) {
        w1 w1VarD = w1.d("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            w1VarD.r0(1);
        } else {
            w1VarD.X(1, str);
        }
        this.f29158a.d();
        Cursor cursorF = androidx.room.util.b.f(this.f29158a, w1VarD, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                arrayList.add(androidx.work.e.m(cursorF.isNull(0) ? null : cursorF.getBlob(0)));
            }
            return arrayList;
        } finally {
            cursorF.close();
            w1VarD.release();
        }
    }

    @Override // androidx.work.impl.model.v
    public List<u.WorkInfoPojo> k(String str) {
        w1 w1VarD = w1.d("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            w1VarD.r0(1);
        } else {
            w1VarD.X(1, str);
        }
        this.f29158a.d();
        this.f29158a.e();
        try {
            Cursor cursorF = androidx.room.util.b.f(this.f29158a, w1VarD, true, null);
            try {
                androidx.collection.a<String, ArrayList<String>> aVar = new androidx.collection.a<>();
                androidx.collection.a<String, ArrayList<androidx.work.e>> aVar2 = new androidx.collection.a<>();
                while (cursorF.moveToNext()) {
                    String string = cursorF.getString(0);
                    if (aVar.get(string) == null) {
                        aVar.put(string, new ArrayList<>());
                    }
                    String string2 = cursorF.getString(0);
                    if (aVar2.get(string2) == null) {
                        aVar2.put(string2, new ArrayList<>());
                    }
                }
                cursorF.moveToPosition(-1);
                L(aVar);
                K(aVar2);
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    String string3 = cursorF.isNull(0) ? null : cursorF.getString(0);
                    int i10 = cursorF.getInt(1);
                    b0 b0Var = b0.f29060a;
                    WorkInfo.State stateF = b0.f(i10);
                    androidx.work.e eVarM = androidx.work.e.m(cursorF.isNull(2) ? null : cursorF.getBlob(2));
                    int i11 = cursorF.getInt(3);
                    int i12 = cursorF.getInt(4);
                    ArrayList<String> arrayList2 = aVar.get(cursorF.getString(0));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    ArrayList<String> arrayList3 = arrayList2;
                    ArrayList<androidx.work.e> arrayList4 = aVar2.get(cursorF.getString(0));
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList<>();
                    }
                    arrayList.add(new u.WorkInfoPojo(string3, stateF, eVarM, i11, i12, arrayList3, arrayList4));
                }
                this.f29158a.O();
                cursorF.close();
                w1VarD.release();
                this.f29158a.k();
                return arrayList;
            } catch (Throwable th2) {
                cursorF.close();
                w1VarD.release();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f29158a.k();
            throw th3;
        }
    }

    @Override // androidx.work.impl.model.v
    public List<u> l(int i10) throws Throwable {
        w1 w1Var;
        w1 w1VarD = w1.d("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        w1VarD.d0(1, i10);
        this.f29158a.d();
        Cursor cursorF = androidx.room.util.b.f(this.f29158a, w1VarD, false, null);
        try {
            int iE = androidx.room.util.a.e(cursorF, "id");
            int iE2 = androidx.room.util.a.e(cursorF, "state");
            int iE3 = androidx.room.util.a.e(cursorF, "worker_class_name");
            int iE4 = androidx.room.util.a.e(cursorF, "input_merger_class_name");
            int iE5 = androidx.room.util.a.e(cursorF, "input");
            int iE6 = androidx.room.util.a.e(cursorF, "output");
            int iE7 = androidx.room.util.a.e(cursorF, "initial_delay");
            int iE8 = androidx.room.util.a.e(cursorF, "interval_duration");
            int iE9 = androidx.room.util.a.e(cursorF, "flex_duration");
            int iE10 = androidx.room.util.a.e(cursorF, "run_attempt_count");
            int iE11 = androidx.room.util.a.e(cursorF, "backoff_policy");
            int iE12 = androidx.room.util.a.e(cursorF, "backoff_delay_duration");
            int iE13 = androidx.room.util.a.e(cursorF, "last_enqueue_time");
            int iE14 = androidx.room.util.a.e(cursorF, "minimum_retention_duration");
            w1Var = w1VarD;
            try {
                int iE15 = androidx.room.util.a.e(cursorF, "schedule_requested_at");
                int iE16 = androidx.room.util.a.e(cursorF, "run_in_foreground");
                int iE17 = androidx.room.util.a.e(cursorF, "out_of_quota_policy");
                int iE18 = androidx.room.util.a.e(cursorF, "period_count");
                int iE19 = androidx.room.util.a.e(cursorF, "generation");
                int iE20 = androidx.room.util.a.e(cursorF, "required_network_type");
                int iE21 = androidx.room.util.a.e(cursorF, "requires_charging");
                int iE22 = androidx.room.util.a.e(cursorF, "requires_device_idle");
                int iE23 = androidx.room.util.a.e(cursorF, "requires_battery_not_low");
                int iE24 = androidx.room.util.a.e(cursorF, "requires_storage_not_low");
                int iE25 = androidx.room.util.a.e(cursorF, "trigger_content_update_delay");
                int iE26 = androidx.room.util.a.e(cursorF, "trigger_max_content_delay");
                int iE27 = androidx.room.util.a.e(cursorF, "content_uri_triggers");
                int i11 = iE14;
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    String string = cursorF.isNull(iE) ? null : cursorF.getString(iE);
                    int i12 = cursorF.getInt(iE2);
                    b0 b0Var = b0.f29060a;
                    WorkInfo.State stateF = b0.f(i12);
                    String string2 = cursorF.isNull(iE3) ? null : cursorF.getString(iE3);
                    String string3 = cursorF.isNull(iE4) ? null : cursorF.getString(iE4);
                    androidx.work.e eVarM = androidx.work.e.m(cursorF.isNull(iE5) ? null : cursorF.getBlob(iE5));
                    androidx.work.e eVarM2 = androidx.work.e.m(cursorF.isNull(iE6) ? null : cursorF.getBlob(iE6));
                    long j10 = cursorF.getLong(iE7);
                    long j11 = cursorF.getLong(iE8);
                    long j12 = cursorF.getLong(iE9);
                    int i13 = cursorF.getInt(iE10);
                    BackoffPolicy backoffPolicyC = b0.c(cursorF.getInt(iE11));
                    long j13 = cursorF.getLong(iE12);
                    long j14 = cursorF.getLong(iE13);
                    int i14 = i11;
                    long j15 = cursorF.getLong(i14);
                    int i15 = iE;
                    int i16 = iE15;
                    long j16 = cursorF.getLong(i16);
                    iE15 = i16;
                    iE16 = iE16;
                    boolean z10 = cursorF.getInt(iE16) != 0;
                    OutOfQuotaPolicy outOfQuotaPolicyE = b0.e(cursorF.getInt(iE17));
                    iE17 = iE17;
                    int i17 = iE18;
                    int i18 = cursorF.getInt(i17);
                    iE18 = i17;
                    int i19 = iE19;
                    int i20 = cursorF.getInt(i19);
                    iE19 = i19;
                    int i21 = iE20;
                    NetworkType networkTypeD = b0.d(cursorF.getInt(i21));
                    iE20 = i21;
                    iE21 = iE21;
                    boolean z11 = cursorF.getInt(iE21) != 0;
                    boolean z12 = cursorF.getInt(iE22) != 0;
                    boolean z13 = cursorF.getInt(iE23) != 0;
                    boolean z14 = cursorF.getInt(iE24) != 0;
                    long j17 = cursorF.getLong(iE25);
                    iE25 = iE25;
                    int i22 = iE26;
                    long j18 = cursorF.getLong(i22);
                    iE26 = i22;
                    int i23 = iE27;
                    iE27 = i23;
                    arrayList.add(new u(string, stateF, string2, string3, eVarM, eVarM2, j10, j11, j12, new androidx.work.c(networkTypeD, z11, z12, z13, z14, j17, j18, b0.b(cursorF.isNull(i23) ? null : cursorF.getBlob(i23))), i13, backoffPolicyC, j13, j14, j15, j16, z10, outOfQuotaPolicyE, i18, i20));
                    iE = i15;
                    i11 = i14;
                }
                cursorF.close();
                w1Var.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorF.close();
                w1Var.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            w1Var = w1VarD;
        }
    }

    @Override // androidx.work.impl.model.v
    public int m(WorkInfo.State state, String str) {
        this.f29158a.d();
        j3.l lVarB = this.f29162e.b();
        b0 b0Var = b0.f29060a;
        lVarB.d0(1, b0.j(state));
        if (str == null) {
            lVarB.r0(2);
        } else {
            lVarB.X(2, str);
        }
        this.f29158a.e();
        try {
            int iY = lVarB.y();
            this.f29158a.O();
            return iY;
        } finally {
            this.f29158a.k();
            this.f29162e.h(lVarB);
        }
    }

    @Override // androidx.work.impl.model.v
    public LiveData<List<String>> n() {
        return this.f29158a.getInvalidationTracker().e(new String[]{"workspec"}, true, new e(w1.d("SELECT id FROM workspec", 0)));
    }

    @Override // androidx.work.impl.model.v
    public LiveData<List<u.WorkInfoPojo>> o(String str) {
        w1 w1VarD = w1.d("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            w1VarD.r0(1);
        } else {
            w1VarD.X(1, str);
        }
        return this.f29158a.getInvalidationTracker().e(new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, true, new h(w1VarD));
    }

    @Override // androidx.work.impl.model.v
    public LiveData<List<u.WorkInfoPojo>> p(String str) {
        w1 w1VarD = w1.d("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            w1VarD.r0(1);
        } else {
            w1VarD.X(1, str);
        }
        return this.f29158a.getInvalidationTracker().e(new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, true, new g(w1VarD));
    }

    @Override // androidx.work.impl.model.v
    public List<String> q() {
        w1 w1VarD = w1.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.f29158a.d();
        Cursor cursorF = androidx.room.util.b.f(this.f29158a, w1VarD, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                arrayList.add(cursorF.isNull(0) ? null : cursorF.getString(0));
            }
            return arrayList;
        } finally {
            cursorF.close();
            w1VarD.release();
        }
    }

    @Override // androidx.work.impl.model.v
    public boolean r() {
        boolean z10 = false;
        w1 w1VarD = w1.d("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f29158a.d();
        Cursor cursorF = androidx.room.util.b.f(this.f29158a, w1VarD, false, null);
        try {
            if (cursorF.moveToFirst() && cursorF.getInt(0) != 0) {
                z10 = true;
            }
            return z10;
        } finally {
            cursorF.close();
            w1VarD.release();
        }
    }

    @Override // androidx.work.impl.model.v
    public int s(String str) {
        this.f29158a.d();
        j3.l lVarB = this.f29167j.b();
        if (str == null) {
            lVarB.r0(1);
        } else {
            lVarB.X(1, str);
        }
        this.f29158a.e();
        try {
            int iY = lVarB.y();
            this.f29158a.O();
            return iY;
        } finally {
            this.f29158a.k();
            this.f29167j.h(lVarB);
        }
    }

    @Override // androidx.work.impl.model.v
    public LiveData<List<u.WorkInfoPojo>> t(List<String> list) {
        StringBuilder sbD = androidx.room.util.e.d();
        sbD.append("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (");
        int size = list.size();
        androidx.room.util.e.a(sbD, size);
        sbD.append(")");
        w1 w1VarD = w1.d(sbD.toString(), size + 0);
        int i10 = 1;
        for (String str : list) {
            if (str == null) {
                w1VarD.r0(i10);
            } else {
                w1VarD.X(i10, str);
            }
            i10++;
        }
        return this.f29158a.getInvalidationTracker().e(new String[]{"WorkTag", "WorkProgress", "workspec"}, true, new f(w1VarD));
    }

    @Override // androidx.work.impl.model.v
    public List<String> u() {
        w1 w1VarD = w1.d("SELECT id FROM workspec", 0);
        this.f29158a.d();
        Cursor cursorF = androidx.room.util.b.f(this.f29158a, w1VarD, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                arrayList.add(cursorF.isNull(0) ? null : cursorF.getString(0));
            }
            return arrayList;
        } finally {
            cursorF.close();
            w1VarD.release();
        }
    }

    @Override // androidx.work.impl.model.v
    public void v(String str) {
        this.f29158a.d();
        j3.l lVarB = this.f29163f.b();
        if (str == null) {
            lVarB.r0(1);
        } else {
            lVarB.X(1, str);
        }
        this.f29158a.e();
        try {
            lVarB.y();
            this.f29158a.O();
        } finally {
            this.f29158a.k();
            this.f29163f.h(lVarB);
        }
    }

    @Override // androidx.work.impl.model.v
    public List<u> w(long j10) throws Throwable {
        w1 w1Var;
        w1 w1VarD = w1.d("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        w1VarD.d0(1, j10);
        this.f29158a.d();
        Cursor cursorF = androidx.room.util.b.f(this.f29158a, w1VarD, false, null);
        try {
            int iE = androidx.room.util.a.e(cursorF, "id");
            int iE2 = androidx.room.util.a.e(cursorF, "state");
            int iE3 = androidx.room.util.a.e(cursorF, "worker_class_name");
            int iE4 = androidx.room.util.a.e(cursorF, "input_merger_class_name");
            int iE5 = androidx.room.util.a.e(cursorF, "input");
            int iE6 = androidx.room.util.a.e(cursorF, "output");
            int iE7 = androidx.room.util.a.e(cursorF, "initial_delay");
            int iE8 = androidx.room.util.a.e(cursorF, "interval_duration");
            int iE9 = androidx.room.util.a.e(cursorF, "flex_duration");
            int iE10 = androidx.room.util.a.e(cursorF, "run_attempt_count");
            int iE11 = androidx.room.util.a.e(cursorF, "backoff_policy");
            int iE12 = androidx.room.util.a.e(cursorF, "backoff_delay_duration");
            int iE13 = androidx.room.util.a.e(cursorF, "last_enqueue_time");
            int iE14 = androidx.room.util.a.e(cursorF, "minimum_retention_duration");
            w1Var = w1VarD;
            try {
                int iE15 = androidx.room.util.a.e(cursorF, "schedule_requested_at");
                int iE16 = androidx.room.util.a.e(cursorF, "run_in_foreground");
                int iE17 = androidx.room.util.a.e(cursorF, "out_of_quota_policy");
                int iE18 = androidx.room.util.a.e(cursorF, "period_count");
                int iE19 = androidx.room.util.a.e(cursorF, "generation");
                int iE20 = androidx.room.util.a.e(cursorF, "required_network_type");
                int iE21 = androidx.room.util.a.e(cursorF, "requires_charging");
                int iE22 = androidx.room.util.a.e(cursorF, "requires_device_idle");
                int iE23 = androidx.room.util.a.e(cursorF, "requires_battery_not_low");
                int iE24 = androidx.room.util.a.e(cursorF, "requires_storage_not_low");
                int iE25 = androidx.room.util.a.e(cursorF, "trigger_content_update_delay");
                int iE26 = androidx.room.util.a.e(cursorF, "trigger_max_content_delay");
                int iE27 = androidx.room.util.a.e(cursorF, "content_uri_triggers");
                int i10 = iE14;
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    String string = cursorF.isNull(iE) ? null : cursorF.getString(iE);
                    int i11 = cursorF.getInt(iE2);
                    b0 b0Var = b0.f29060a;
                    WorkInfo.State stateF = b0.f(i11);
                    String string2 = cursorF.isNull(iE3) ? null : cursorF.getString(iE3);
                    String string3 = cursorF.isNull(iE4) ? null : cursorF.getString(iE4);
                    androidx.work.e eVarM = androidx.work.e.m(cursorF.isNull(iE5) ? null : cursorF.getBlob(iE5));
                    androidx.work.e eVarM2 = androidx.work.e.m(cursorF.isNull(iE6) ? null : cursorF.getBlob(iE6));
                    long j11 = cursorF.getLong(iE7);
                    long j12 = cursorF.getLong(iE8);
                    long j13 = cursorF.getLong(iE9);
                    int i12 = cursorF.getInt(iE10);
                    BackoffPolicy backoffPolicyC = b0.c(cursorF.getInt(iE11));
                    long j14 = cursorF.getLong(iE12);
                    long j15 = cursorF.getLong(iE13);
                    int i13 = i10;
                    long j16 = cursorF.getLong(i13);
                    int i14 = iE;
                    int i15 = iE15;
                    long j17 = cursorF.getLong(i15);
                    iE15 = i15;
                    iE16 = iE16;
                    boolean z10 = cursorF.getInt(iE16) != 0;
                    OutOfQuotaPolicy outOfQuotaPolicyE = b0.e(cursorF.getInt(iE17));
                    iE17 = iE17;
                    int i16 = iE18;
                    int i17 = cursorF.getInt(i16);
                    iE18 = i16;
                    int i18 = iE19;
                    int i19 = cursorF.getInt(i18);
                    iE19 = i18;
                    int i20 = iE20;
                    NetworkType networkTypeD = b0.d(cursorF.getInt(i20));
                    iE20 = i20;
                    iE21 = iE21;
                    boolean z11 = cursorF.getInt(iE21) != 0;
                    boolean z12 = cursorF.getInt(iE22) != 0;
                    boolean z13 = cursorF.getInt(iE23) != 0;
                    boolean z14 = cursorF.getInt(iE24) != 0;
                    long j18 = cursorF.getLong(iE25);
                    iE25 = iE25;
                    int i21 = iE26;
                    long j19 = cursorF.getLong(i21);
                    iE26 = i21;
                    int i22 = iE27;
                    iE27 = i22;
                    arrayList.add(new u(string, stateF, string2, string3, eVarM, eVarM2, j11, j12, j13, new androidx.work.c(networkTypeD, z11, z12, z13, z14, j18, j19, b0.b(cursorF.isNull(i22) ? null : cursorF.getBlob(i22))), i12, backoffPolicyC, j14, j15, j16, j17, z10, outOfQuotaPolicyE, i17, i19));
                    iE = i14;
                    i10 = i13;
                }
                cursorF.close();
                w1Var.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorF.close();
                w1Var.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            w1Var = w1VarD;
        }
    }

    @Override // androidx.work.impl.model.v
    public List<u> x() throws Throwable {
        w1 w1Var;
        w1 w1VarD = w1.d("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f29158a.d();
        Cursor cursorF = androidx.room.util.b.f(this.f29158a, w1VarD, false, null);
        try {
            int iE = androidx.room.util.a.e(cursorF, "id");
            int iE2 = androidx.room.util.a.e(cursorF, "state");
            int iE3 = androidx.room.util.a.e(cursorF, "worker_class_name");
            int iE4 = androidx.room.util.a.e(cursorF, "input_merger_class_name");
            int iE5 = androidx.room.util.a.e(cursorF, "input");
            int iE6 = androidx.room.util.a.e(cursorF, "output");
            int iE7 = androidx.room.util.a.e(cursorF, "initial_delay");
            int iE8 = androidx.room.util.a.e(cursorF, "interval_duration");
            int iE9 = androidx.room.util.a.e(cursorF, "flex_duration");
            int iE10 = androidx.room.util.a.e(cursorF, "run_attempt_count");
            int iE11 = androidx.room.util.a.e(cursorF, "backoff_policy");
            int iE12 = androidx.room.util.a.e(cursorF, "backoff_delay_duration");
            int iE13 = androidx.room.util.a.e(cursorF, "last_enqueue_time");
            int iE14 = androidx.room.util.a.e(cursorF, "minimum_retention_duration");
            w1Var = w1VarD;
            try {
                int iE15 = androidx.room.util.a.e(cursorF, "schedule_requested_at");
                int iE16 = androidx.room.util.a.e(cursorF, "run_in_foreground");
                int iE17 = androidx.room.util.a.e(cursorF, "out_of_quota_policy");
                int iE18 = androidx.room.util.a.e(cursorF, "period_count");
                int iE19 = androidx.room.util.a.e(cursorF, "generation");
                int iE20 = androidx.room.util.a.e(cursorF, "required_network_type");
                int iE21 = androidx.room.util.a.e(cursorF, "requires_charging");
                int iE22 = androidx.room.util.a.e(cursorF, "requires_device_idle");
                int iE23 = androidx.room.util.a.e(cursorF, "requires_battery_not_low");
                int iE24 = androidx.room.util.a.e(cursorF, "requires_storage_not_low");
                int iE25 = androidx.room.util.a.e(cursorF, "trigger_content_update_delay");
                int iE26 = androidx.room.util.a.e(cursorF, "trigger_max_content_delay");
                int iE27 = androidx.room.util.a.e(cursorF, "content_uri_triggers");
                int i10 = iE14;
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    String string = cursorF.isNull(iE) ? null : cursorF.getString(iE);
                    int i11 = cursorF.getInt(iE2);
                    b0 b0Var = b0.f29060a;
                    WorkInfo.State stateF = b0.f(i11);
                    String string2 = cursorF.isNull(iE3) ? null : cursorF.getString(iE3);
                    String string3 = cursorF.isNull(iE4) ? null : cursorF.getString(iE4);
                    androidx.work.e eVarM = androidx.work.e.m(cursorF.isNull(iE5) ? null : cursorF.getBlob(iE5));
                    androidx.work.e eVarM2 = androidx.work.e.m(cursorF.isNull(iE6) ? null : cursorF.getBlob(iE6));
                    long j10 = cursorF.getLong(iE7);
                    long j11 = cursorF.getLong(iE8);
                    long j12 = cursorF.getLong(iE9);
                    int i12 = cursorF.getInt(iE10);
                    BackoffPolicy backoffPolicyC = b0.c(cursorF.getInt(iE11));
                    long j13 = cursorF.getLong(iE12);
                    long j14 = cursorF.getLong(iE13);
                    int i13 = i10;
                    long j15 = cursorF.getLong(i13);
                    int i14 = iE;
                    int i15 = iE15;
                    long j16 = cursorF.getLong(i15);
                    iE15 = i15;
                    iE16 = iE16;
                    boolean z10 = cursorF.getInt(iE16) != 0;
                    OutOfQuotaPolicy outOfQuotaPolicyE = b0.e(cursorF.getInt(iE17));
                    iE17 = iE17;
                    int i16 = iE18;
                    int i17 = cursorF.getInt(i16);
                    iE18 = i16;
                    int i18 = iE19;
                    int i19 = cursorF.getInt(i18);
                    iE19 = i18;
                    int i20 = iE20;
                    NetworkType networkTypeD = b0.d(cursorF.getInt(i20));
                    iE20 = i20;
                    iE21 = iE21;
                    boolean z11 = cursorF.getInt(iE21) != 0;
                    boolean z12 = cursorF.getInt(iE22) != 0;
                    boolean z13 = cursorF.getInt(iE23) != 0;
                    boolean z14 = cursorF.getInt(iE24) != 0;
                    long j17 = cursorF.getLong(iE25);
                    iE25 = iE25;
                    int i21 = iE26;
                    long j18 = cursorF.getLong(i21);
                    iE26 = i21;
                    int i22 = iE27;
                    iE27 = i22;
                    arrayList.add(new u(string, stateF, string2, string3, eVarM, eVarM2, j10, j11, j12, new androidx.work.c(networkTypeD, z11, z12, z13, z14, j17, j18, b0.b(cursorF.isNull(i22) ? null : cursorF.getBlob(i22))), i12, backoffPolicyC, j13, j14, j15, j16, z10, outOfQuotaPolicyE, i17, i19));
                    iE = i14;
                    i10 = i13;
                }
                cursorF.close();
                w1Var.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorF.close();
                w1Var.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            w1Var = w1VarD;
        }
    }

    @Override // androidx.work.impl.model.v
    public u.WorkInfoPojo y(String str) {
        w1 w1VarD = w1.d("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id=?", 1);
        if (str == null) {
            w1VarD.r0(1);
        } else {
            w1VarD.X(1, str);
        }
        this.f29158a.d();
        this.f29158a.e();
        try {
            u.WorkInfoPojo workInfoPojo = null;
            byte[] blob = null;
            Cursor cursorF = androidx.room.util.b.f(this.f29158a, w1VarD, true, null);
            try {
                androidx.collection.a<String, ArrayList<String>> aVar = new androidx.collection.a<>();
                androidx.collection.a<String, ArrayList<androidx.work.e>> aVar2 = new androidx.collection.a<>();
                while (cursorF.moveToNext()) {
                    String string = cursorF.getString(0);
                    if (aVar.get(string) == null) {
                        aVar.put(string, new ArrayList<>());
                    }
                    String string2 = cursorF.getString(0);
                    if (aVar2.get(string2) == null) {
                        aVar2.put(string2, new ArrayList<>());
                    }
                }
                cursorF.moveToPosition(-1);
                L(aVar);
                K(aVar2);
                if (cursorF.moveToFirst()) {
                    String string3 = cursorF.isNull(0) ? null : cursorF.getString(0);
                    int i10 = cursorF.getInt(1);
                    b0 b0Var = b0.f29060a;
                    WorkInfo.State stateF = b0.f(i10);
                    if (!cursorF.isNull(2)) {
                        blob = cursorF.getBlob(2);
                    }
                    androidx.work.e eVarM = androidx.work.e.m(blob);
                    int i11 = cursorF.getInt(3);
                    int i12 = cursorF.getInt(4);
                    ArrayList<String> arrayList = aVar.get(cursorF.getString(0));
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    ArrayList<String> arrayList2 = arrayList;
                    ArrayList<androidx.work.e> arrayList3 = aVar2.get(cursorF.getString(0));
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList<>();
                    }
                    workInfoPojo = new u.WorkInfoPojo(string3, stateF, eVarM, i11, i12, arrayList2, arrayList3);
                }
                this.f29158a.O();
                cursorF.close();
                w1VarD.release();
                this.f29158a.k();
                return workInfoPojo;
            } catch (Throwable th2) {
                cursorF.close();
                w1VarD.release();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f29158a.k();
            throw th3;
        }
    }

    @Override // androidx.work.impl.model.v
    public u z(String str) throws Throwable {
        w1 w1Var;
        u uVar;
        w1 w1VarD = w1.d("SELECT * FROM workspec WHERE id=?", 1);
        if (str == null) {
            w1VarD.r0(1);
        } else {
            w1VarD.X(1, str);
        }
        this.f29158a.d();
        Cursor cursorF = androidx.room.util.b.f(this.f29158a, w1VarD, false, null);
        try {
            int iE = androidx.room.util.a.e(cursorF, "id");
            int iE2 = androidx.room.util.a.e(cursorF, "state");
            int iE3 = androidx.room.util.a.e(cursorF, "worker_class_name");
            int iE4 = androidx.room.util.a.e(cursorF, "input_merger_class_name");
            int iE5 = androidx.room.util.a.e(cursorF, "input");
            int iE6 = androidx.room.util.a.e(cursorF, "output");
            int iE7 = androidx.room.util.a.e(cursorF, "initial_delay");
            int iE8 = androidx.room.util.a.e(cursorF, "interval_duration");
            int iE9 = androidx.room.util.a.e(cursorF, "flex_duration");
            int iE10 = androidx.room.util.a.e(cursorF, "run_attempt_count");
            int iE11 = androidx.room.util.a.e(cursorF, "backoff_policy");
            int iE12 = androidx.room.util.a.e(cursorF, "backoff_delay_duration");
            int iE13 = androidx.room.util.a.e(cursorF, "last_enqueue_time");
            int iE14 = androidx.room.util.a.e(cursorF, "minimum_retention_duration");
            w1Var = w1VarD;
            try {
                int iE15 = androidx.room.util.a.e(cursorF, "schedule_requested_at");
                int iE16 = androidx.room.util.a.e(cursorF, "run_in_foreground");
                int iE17 = androidx.room.util.a.e(cursorF, "out_of_quota_policy");
                int iE18 = androidx.room.util.a.e(cursorF, "period_count");
                int iE19 = androidx.room.util.a.e(cursorF, "generation");
                int iE20 = androidx.room.util.a.e(cursorF, "required_network_type");
                int iE21 = androidx.room.util.a.e(cursorF, "requires_charging");
                int iE22 = androidx.room.util.a.e(cursorF, "requires_device_idle");
                int iE23 = androidx.room.util.a.e(cursorF, "requires_battery_not_low");
                int iE24 = androidx.room.util.a.e(cursorF, "requires_storage_not_low");
                int iE25 = androidx.room.util.a.e(cursorF, "trigger_content_update_delay");
                int iE26 = androidx.room.util.a.e(cursorF, "trigger_max_content_delay");
                int iE27 = androidx.room.util.a.e(cursorF, "content_uri_triggers");
                if (cursorF.moveToFirst()) {
                    String string = cursorF.isNull(iE) ? null : cursorF.getString(iE);
                    int i10 = cursorF.getInt(iE2);
                    b0 b0Var = b0.f29060a;
                    uVar = new u(string, b0.f(i10), cursorF.isNull(iE3) ? null : cursorF.getString(iE3), cursorF.isNull(iE4) ? null : cursorF.getString(iE4), androidx.work.e.m(cursorF.isNull(iE5) ? null : cursorF.getBlob(iE5)), androidx.work.e.m(cursorF.isNull(iE6) ? null : cursorF.getBlob(iE6)), cursorF.getLong(iE7), cursorF.getLong(iE8), cursorF.getLong(iE9), new androidx.work.c(b0.d(cursorF.getInt(iE20)), cursorF.getInt(iE21) != 0, cursorF.getInt(iE22) != 0, cursorF.getInt(iE23) != 0, cursorF.getInt(iE24) != 0, cursorF.getLong(iE25), cursorF.getLong(iE26), b0.b(cursorF.isNull(iE27) ? null : cursorF.getBlob(iE27))), cursorF.getInt(iE10), b0.c(cursorF.getInt(iE11)), cursorF.getLong(iE12), cursorF.getLong(iE13), cursorF.getLong(iE14), cursorF.getLong(iE15), cursorF.getInt(iE16) != 0, b0.e(cursorF.getInt(iE17)), cursorF.getInt(iE18), cursorF.getInt(iE19));
                } else {
                    uVar = null;
                }
                cursorF.close();
                w1Var.release();
                return uVar;
            } catch (Throwable th2) {
                th = th2;
                cursorF.close();
                w1Var.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            w1Var = w1VarD;
        }
    }
}
