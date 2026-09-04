package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.w1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: WorkTagDao_Impl.java */
/* JADX INFO: loaded from: classes6.dex */
public final class a0 implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RoomDatabase f29055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.s<y> f29056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SharedSQLiteStatement f29057c;

    /* JADX INFO: compiled from: WorkTagDao_Impl.java */
    public class a extends androidx.room.s<y> {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String e() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // androidx.room.s
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void i(j3.l lVar, y yVar) {
            if (yVar.getTag() == null) {
                lVar.r0(1);
            } else {
                lVar.X(1, yVar.getTag());
            }
            if (yVar.getWorkSpecId() == null) {
                lVar.r0(2);
            } else {
                lVar.X(2, yVar.getWorkSpecId());
            }
        }
    }

    /* JADX INFO: compiled from: WorkTagDao_Impl.java */
    public class b extends SharedSQLiteStatement {
        b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String e() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public a0(RoomDatabase roomDatabase) {
        this.f29055a = roomDatabase;
        this.f29056b = new a(roomDatabase);
        this.f29057c = new b(roomDatabase);
    }

    public static List<Class<?>> f() {
        return Collections.emptyList();
    }

    @Override // androidx.work.impl.model.z
    public void a(String str) {
        this.f29055a.d();
        j3.l lVarB = this.f29057c.b();
        if (str == null) {
            lVarB.r0(1);
        } else {
            lVarB.X(1, str);
        }
        this.f29055a.e();
        try {
            lVarB.y();
            this.f29055a.O();
        } finally {
            this.f29055a.k();
            this.f29057c.h(lVarB);
        }
    }

    @Override // androidx.work.impl.model.z
    public void b(String str, Set<String> set) {
        z.a.a(this, str, set);
    }

    @Override // androidx.work.impl.model.z
    public List<String> c(String str) {
        w1 w1VarD = w1.d("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            w1VarD.r0(1);
        } else {
            w1VarD.X(1, str);
        }
        this.f29055a.d();
        Cursor cursorF = androidx.room.util.b.f(this.f29055a, w1VarD, false, null);
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

    @Override // androidx.work.impl.model.z
    public void d(y yVar) {
        this.f29055a.d();
        this.f29055a.e();
        try {
            this.f29056b.k(yVar);
            this.f29055a.O();
        } finally {
            this.f29055a.k();
        }
    }

    @Override // androidx.work.impl.model.z
    public List<String> e(String str) {
        w1 w1VarD = w1.d("SELECT work_spec_id FROM worktag WHERE tag=?", 1);
        if (str == null) {
            w1VarD.r0(1);
        } else {
            w1VarD.X(1, str);
        }
        this.f29055a.d();
        Cursor cursorF = androidx.room.util.b.f(this.f29055a, w1VarD, false, null);
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
}
