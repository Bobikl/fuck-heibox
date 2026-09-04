package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.w1;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: WorkProgressDao_Impl.java */
/* JADX INFO: loaded from: classes6.dex */
public final class s implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RoomDatabase f29118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.s<q> f29119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SharedSQLiteStatement f29120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SharedSQLiteStatement f29121d;

    /* JADX INFO: compiled from: WorkProgressDao_Impl.java */
    public class a extends androidx.room.s<q> {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String e() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // androidx.room.s
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void i(j3.l lVar, q qVar) throws Throwable {
            if (qVar.getWorkSpecId() == null) {
                lVar.r0(1);
            } else {
                lVar.X(1, qVar.getWorkSpecId());
            }
            byte[] bArrF = androidx.work.e.F(qVar.getProgress());
            if (bArrF == null) {
                lVar.r0(2);
            } else {
                lVar.l0(2, bArrF);
            }
        }
    }

    /* JADX INFO: compiled from: WorkProgressDao_Impl.java */
    public class b extends SharedSQLiteStatement {
        b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String e() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* JADX INFO: compiled from: WorkProgressDao_Impl.java */
    public class c extends SharedSQLiteStatement {
        c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String e() {
            return "DELETE FROM WorkProgress";
        }
    }

    public s(RoomDatabase roomDatabase) {
        this.f29118a = roomDatabase;
        this.f29119b = new a(roomDatabase);
        this.f29120c = new b(roomDatabase);
        this.f29121d = new c(roomDatabase);
    }

    public static List<Class<?>> e() {
        return Collections.emptyList();
    }

    @Override // androidx.work.impl.model.r
    public void a(String str) {
        this.f29118a.d();
        j3.l lVarB = this.f29120c.b();
        if (str == null) {
            lVarB.r0(1);
        } else {
            lVarB.X(1, str);
        }
        this.f29118a.e();
        try {
            lVarB.y();
            this.f29118a.O();
        } finally {
            this.f29118a.k();
            this.f29120c.h(lVarB);
        }
    }

    @Override // androidx.work.impl.model.r
    public void b() {
        this.f29118a.d();
        j3.l lVarB = this.f29121d.b();
        this.f29118a.e();
        try {
            lVarB.y();
            this.f29118a.O();
        } finally {
            this.f29118a.k();
            this.f29121d.h(lVarB);
        }
    }

    @Override // androidx.work.impl.model.r
    public androidx.work.e c(String str) throws Throwable {
        w1 w1VarD = w1.d("SELECT progress FROM WorkProgress WHERE work_spec_id=?", 1);
        if (str == null) {
            w1VarD.r0(1);
        } else {
            w1VarD.X(1, str);
        }
        this.f29118a.d();
        androidx.work.e eVarM = null;
        Cursor cursorF = androidx.room.util.b.f(this.f29118a, w1VarD, false, null);
        try {
            if (cursorF.moveToFirst()) {
                byte[] blob = cursorF.isNull(0) ? null : cursorF.getBlob(0);
                if (blob != null) {
                    eVarM = androidx.work.e.m(blob);
                }
            }
            return eVarM;
        } finally {
            cursorF.close();
            w1VarD.release();
        }
    }

    @Override // androidx.work.impl.model.r
    public void d(q qVar) {
        this.f29118a.d();
        this.f29118a.e();
        try {
            this.f29119b.k(qVar);
            this.f29118a.O();
        } finally {
            this.f29118a.k();
        }
    }
}
