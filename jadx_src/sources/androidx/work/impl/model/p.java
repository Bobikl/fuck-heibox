package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.w1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: WorkNameDao_Impl.java */
/* JADX INFO: loaded from: classes6.dex */
public final class p implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RoomDatabase f29113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.s<n> f29114b;

    /* JADX INFO: compiled from: WorkNameDao_Impl.java */
    public class a extends androidx.room.s<n> {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String e() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // androidx.room.s
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void i(j3.l lVar, n nVar) {
            if (nVar.getName() == null) {
                lVar.r0(1);
            } else {
                lVar.X(1, nVar.getName());
            }
            if (nVar.getWorkSpecId() == null) {
                lVar.r0(2);
            } else {
                lVar.X(2, nVar.getWorkSpecId());
            }
        }
    }

    public p(RoomDatabase roomDatabase) {
        this.f29113a = roomDatabase;
        this.f29114b = new a(roomDatabase);
    }

    public static List<Class<?>> d() {
        return Collections.emptyList();
    }

    @Override // androidx.work.impl.model.o
    public void a(n nVar) {
        this.f29113a.d();
        this.f29113a.e();
        try {
            this.f29114b.k(nVar);
            this.f29113a.O();
        } finally {
            this.f29113a.k();
        }
    }

    @Override // androidx.work.impl.model.o
    public List<String> b(String str) {
        w1 w1VarD = w1.d("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            w1VarD.r0(1);
        } else {
            w1VarD.X(1, str);
        }
        this.f29113a.d();
        Cursor cursorF = androidx.room.util.b.f(this.f29113a, w1VarD, false, null);
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

    @Override // androidx.work.impl.model.o
    public List<String> c(String str) {
        w1 w1VarD = w1.d("SELECT work_spec_id FROM workname WHERE name=?", 1);
        if (str == null) {
            w1VarD.r0(1);
        } else {
            w1VarD.X(1, str);
        }
        this.f29113a.d();
        Cursor cursorF = androidx.room.util.b.f(this.f29113a, w1VarD, false, null);
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
