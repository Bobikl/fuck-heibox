package androidx.work.impl.model;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import androidx.room.w1;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PreferenceDao_Impl.java */
/* JADX INFO: loaded from: classes6.dex */
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RoomDatabase f29091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.s<Preference> f29092b;

    /* JADX INFO: compiled from: PreferenceDao_Impl.java */
    public class a extends androidx.room.s<Preference> {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String e() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // androidx.room.s
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void i(j3.l lVar, Preference preference) {
            if (preference.e() == null) {
                lVar.r0(1);
            } else {
                lVar.X(1, preference.e());
            }
            if (preference.f() == null) {
                lVar.r0(2);
            } else {
                lVar.d0(2, preference.f().longValue());
            }
        }
    }

    /* JADX INFO: compiled from: PreferenceDao_Impl.java */
    public class b implements Callable<Long> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w1 f29094b;

        b(w1 w1Var) {
            this.f29094b = w1Var;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call() throws Exception {
            Long lValueOf = null;
            Cursor cursorF = androidx.room.util.b.f(f.this.f29091a, this.f29094b, false, null);
            try {
                if (cursorF.moveToFirst() && !cursorF.isNull(0)) {
                    lValueOf = Long.valueOf(cursorF.getLong(0));
                }
                return lValueOf;
            } finally {
                cursorF.close();
            }
        }

        protected void finalize() {
            this.f29094b.release();
        }
    }

    public f(RoomDatabase roomDatabase) {
        this.f29091a = roomDatabase;
        this.f29092b = new a(roomDatabase);
    }

    public static List<Class<?>> e() {
        return Collections.emptyList();
    }

    @Override // androidx.work.impl.model.e
    public LiveData<Long> a(String str) {
        w1 w1VarD = w1.d("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            w1VarD.r0(1);
        } else {
            w1VarD.X(1, str);
        }
        return this.f29091a.getInvalidationTracker().e(new String[]{"Preference"}, false, new b(w1VarD));
    }

    @Override // androidx.work.impl.model.e
    public void b(Preference preference) {
        this.f29091a.d();
        this.f29091a.e();
        try {
            this.f29092b.k(preference);
            this.f29091a.O();
        } finally {
            this.f29091a.k();
        }
    }

    @Override // androidx.work.impl.model.e
    public Long c(String str) {
        w1 w1VarD = w1.d("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            w1VarD.r0(1);
        } else {
            w1VarD.X(1, str);
        }
        this.f29091a.d();
        Long lValueOf = null;
        Cursor cursorF = androidx.room.util.b.f(this.f29091a, w1VarD, false, null);
        try {
            if (cursorF.moveToFirst() && !cursorF.isNull(0)) {
                lValueOf = Long.valueOf(cursorF.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorF.close();
            w1VarD.release();
        }
    }
}
