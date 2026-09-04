package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.w1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: SystemIdInfoDao_Impl.java */
/* JADX INFO: loaded from: classes6.dex */
public final class k implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RoomDatabase f29102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.s<SystemIdInfo> f29103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SharedSQLiteStatement f29104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SharedSQLiteStatement f29105d;

    /* JADX INFO: compiled from: SystemIdInfoDao_Impl.java */
    public class a extends androidx.room.s<SystemIdInfo> {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String e() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        @Override // androidx.room.s
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void i(j3.l lVar, SystemIdInfo systemIdInfo) {
            String str = systemIdInfo.workSpecId;
            if (str == null) {
                lVar.r0(1);
            } else {
                lVar.X(1, str);
            }
            lVar.d0(2, systemIdInfo.f());
            lVar.d0(3, systemIdInfo.systemId);
        }
    }

    /* JADX INFO: compiled from: SystemIdInfoDao_Impl.java */
    public class b extends SharedSQLiteStatement {
        b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    /* JADX INFO: compiled from: SystemIdInfoDao_Impl.java */
    public class c extends SharedSQLiteStatement {
        c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public k(RoomDatabase roomDatabase) {
        this.f29102a = roomDatabase;
        this.f29103b = new a(roomDatabase);
        this.f29104c = new b(roomDatabase);
        this.f29105d = new c(roomDatabase);
    }

    public static List<Class<?>> h() {
        return Collections.emptyList();
    }

    @Override // androidx.work.impl.model.j
    public SystemIdInfo a(String str, int i10) {
        w1 w1VarD = w1.d("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        if (str == null) {
            w1VarD.r0(1);
        } else {
            w1VarD.X(1, str);
        }
        w1VarD.d0(2, i10);
        this.f29102a.d();
        SystemIdInfo systemIdInfo = null;
        String string = null;
        Cursor cursorF = androidx.room.util.b.f(this.f29102a, w1VarD, false, null);
        try {
            int iE = androidx.room.util.a.e(cursorF, "work_spec_id");
            int iE2 = androidx.room.util.a.e(cursorF, "generation");
            int iE3 = androidx.room.util.a.e(cursorF, "system_id");
            if (cursorF.moveToFirst()) {
                if (!cursorF.isNull(iE)) {
                    string = cursorF.getString(iE);
                }
                systemIdInfo = new SystemIdInfo(string, cursorF.getInt(iE2), cursorF.getInt(iE3));
            }
            return systemIdInfo;
        } finally {
            cursorF.close();
            w1VarD.release();
        }
    }

    @Override // androidx.work.impl.model.j
    public void b(WorkGenerationalId workGenerationalId) {
        j.a.b(this, workGenerationalId);
    }

    @Override // androidx.work.impl.model.j
    public void c(SystemIdInfo systemIdInfo) {
        this.f29102a.d();
        this.f29102a.e();
        try {
            this.f29103b.k(systemIdInfo);
            this.f29102a.O();
        } finally {
            this.f29102a.k();
        }
    }

    @Override // androidx.work.impl.model.j
    public SystemIdInfo d(WorkGenerationalId workGenerationalId) {
        return j.a.a(this, workGenerationalId);
    }

    @Override // androidx.work.impl.model.j
    public List<String> e() {
        w1 w1VarD = w1.d("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f29102a.d();
        Cursor cursorF = androidx.room.util.b.f(this.f29102a, w1VarD, false, null);
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

    @Override // androidx.work.impl.model.j
    public void f(String str, int i10) {
        this.f29102a.d();
        j3.l lVarB = this.f29104c.b();
        if (str == null) {
            lVarB.r0(1);
        } else {
            lVarB.X(1, str);
        }
        lVarB.d0(2, i10);
        this.f29102a.e();
        try {
            lVarB.y();
            this.f29102a.O();
        } finally {
            this.f29102a.k();
            this.f29104c.h(lVarB);
        }
    }

    @Override // androidx.work.impl.model.j
    public void g(String str) {
        this.f29102a.d();
        j3.l lVarB = this.f29105d.b();
        if (str == null) {
            lVarB.r0(1);
        } else {
            lVarB.X(1, str);
        }
        this.f29102a.e();
        try {
            lVarB.y();
            this.f29102a.O();
        } finally {
            this.f29102a.k();
            this.f29105d.h(lVarB);
        }
    }
}
