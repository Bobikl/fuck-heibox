package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.w1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: DependencyDao_Impl.java */
/* JADX INFO: loaded from: classes6.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RoomDatabase f29086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.s<androidx.work.impl.model.a> f29087b;

    /* JADX INFO: compiled from: DependencyDao_Impl.java */
    public class a extends androidx.room.s<androidx.work.impl.model.a> {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String e() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // androidx.room.s
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void i(j3.l lVar, androidx.work.impl.model.a aVar) {
            if (aVar.getWorkSpecId() == null) {
                lVar.r0(1);
            } else {
                lVar.X(1, aVar.getWorkSpecId());
            }
            if (aVar.getPrerequisiteId() == null) {
                lVar.r0(2);
            } else {
                lVar.X(2, aVar.getPrerequisiteId());
            }
        }
    }

    public c(RoomDatabase roomDatabase) {
        this.f29086a = roomDatabase;
        this.f29087b = new a(roomDatabase);
    }

    public static List<Class<?>> f() {
        return Collections.emptyList();
    }

    @Override // androidx.work.impl.model.b
    public void a(androidx.work.impl.model.a aVar) {
        this.f29086a.d();
        this.f29086a.e();
        try {
            this.f29087b.k(aVar);
            this.f29086a.O();
        } finally {
            this.f29086a.k();
        }
    }

    @Override // androidx.work.impl.model.b
    public List<String> b(String str) {
        w1 w1VarD = w1.d("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            w1VarD.r0(1);
        } else {
            w1VarD.X(1, str);
        }
        this.f29086a.d();
        Cursor cursorF = androidx.room.util.b.f(this.f29086a, w1VarD, false, null);
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

    @Override // androidx.work.impl.model.b
    public boolean c(String str) {
        w1 w1VarD = w1.d("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            w1VarD.r0(1);
        } else {
            w1VarD.X(1, str);
        }
        this.f29086a.d();
        boolean z10 = false;
        Cursor cursorF = androidx.room.util.b.f(this.f29086a, w1VarD, false, null);
        try {
            if (cursorF.moveToFirst()) {
                z10 = cursorF.getInt(0) != 0;
            }
            return z10;
        } finally {
            cursorF.close();
            w1VarD.release();
        }
    }

    @Override // androidx.work.impl.model.b
    public List<String> d(String str) {
        w1 w1VarD = w1.d("SELECT prerequisite_id FROM dependency WHERE work_spec_id=?", 1);
        if (str == null) {
            w1VarD.r0(1);
        } else {
            w1VarD.X(1, str);
        }
        this.f29086a.d();
        Cursor cursorF = androidx.room.util.b.f(this.f29086a, w1VarD, false, null);
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

    @Override // androidx.work.impl.model.b
    public boolean e(String str) {
        w1 w1VarD = w1.d("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            w1VarD.r0(1);
        } else {
            w1VarD.X(1, str);
        }
        this.f29086a.d();
        boolean z10 = false;
        Cursor cursorF = androidx.room.util.b.f(this.f29086a, w1VarD, false, null);
        try {
            if (cursorF.moveToFirst()) {
                z10 = cursorF.getInt(0) != 0;
            }
            return z10;
        } finally {
            cursorF.close();
            w1VarD.release();
        }
    }
}
