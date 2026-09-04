package androidx.room.paging;

import android.database.Cursor;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.paging.u0;
import androidx.room.RoomDatabase;
import androidx.room.f0;
import androidx.room.w1;
import j3.j;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: LimitOffsetDataSource.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class a<T> extends u0<T> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w1 f27248i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f27249j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f27250k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final RoomDatabase f27251l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final f0.c f27252m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f27253n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f27254o;

    /* JADX INFO: renamed from: androidx.room.paging.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LimitOffsetDataSource.java */
    public class C0214a extends f0.c {
        C0214a(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.f0.c
        public void c(@n0 Set<String> set) {
            a.this.g();
        }
    }

    protected a(@n0 RoomDatabase roomDatabase, @n0 w1 w1Var, boolean z10, boolean z11, @n0 String... strArr) {
        this.f27254o = new AtomicBoolean(false);
        this.f27251l = roomDatabase;
        this.f27248i = w1Var;
        this.f27253n = z10;
        this.f27249j = "SELECT COUNT(*) FROM ( " + w1Var.getF124204b() + " )";
        this.f27250k = "SELECT * FROM ( " + w1Var.getF124204b() + " ) LIMIT ? OFFSET ?";
        this.f27252m = new C0214a(strArr);
        if (z11) {
            F();
        }
    }

    protected a(@n0 RoomDatabase roomDatabase, @n0 w1 w1Var, boolean z10, @n0 String... strArr) {
        this(roomDatabase, w1Var, z10, true, strArr);
    }

    protected a(@n0 RoomDatabase roomDatabase, @n0 j jVar, boolean z10, boolean z11, @n0 String... strArr) {
        this(roomDatabase, w1.f(jVar), z10, z11, strArr);
    }

    protected a(@n0 RoomDatabase roomDatabase, @n0 j jVar, boolean z10, @n0 String... strArr) {
        this(roomDatabase, w1.f(jVar), z10, strArr);
    }

    private w1 D(int i10, int i11) {
        w1 w1VarD = w1.d(this.f27250k, this.f27248i.getArgCount() + 2);
        w1VarD.e(this.f27248i);
        w1VarD.d0(w1VarD.getArgCount() - 1, i11);
        w1VarD.d0(w1VarD.getArgCount(), i10);
        return w1VarD;
    }

    private void F() {
        if (this.f27254o.compareAndSet(false, true)) {
            this.f27251l.getInvalidationTracker().c(this.f27252m);
        }
    }

    @n0
    protected abstract List<T> B(@n0 Cursor cursor);

    public int C() {
        F();
        w1 w1VarD = w1.d(this.f27249j, this.f27248i.getArgCount());
        w1VarD.e(this.f27248i);
        Cursor cursorH = this.f27251l.H(w1VarD);
        try {
            if (cursorH.moveToFirst()) {
                return cursorH.getInt(0);
            }
            return 0;
        } finally {
            cursorH.close();
            w1VarD.release();
        }
    }

    @n0
    public List<T> E(int i10, int i11) {
        w1 w1VarD = D(i10, i11);
        if (!this.f27253n) {
            Cursor cursorH = this.f27251l.H(w1VarD);
            try {
                return B(cursorH);
            } finally {
                cursorH.close();
                w1VarD.release();
            }
        }
        this.f27251l.e();
        Cursor cursorH2 = null;
        try {
            cursorH2 = this.f27251l.H(w1VarD);
            List<T> listB = B(cursorH2);
            this.f27251l.O();
            return listB;
        } finally {
            if (cursorH2 != null) {
                cursorH2.close();
            }
            this.f27251l.k();
            w1VarD.release();
        }
    }

    @Override // androidx.paging.DataSource
    public boolean i() {
        F();
        this.f27251l.getInvalidationTracker().r();
        return super.i();
    }

    @Override // androidx.paging.u0
    public void t(@n0 u0.c cVar, @n0 u0.b<T> bVar) throws Throwable {
        w1 w1VarD;
        int i10;
        w1 w1Var;
        F();
        List<T> listEmptyList = Collections.emptyList();
        this.f27251l.e();
        Cursor cursorH = null;
        try {
            int iC = C();
            if (iC != 0) {
                int iP = u0.p(cVar, iC);
                w1VarD = D(iP, u0.q(cVar, iP, iC));
                try {
                    cursorH = this.f27251l.H(w1VarD);
                    List<T> listB = B(cursorH);
                    this.f27251l.O();
                    w1Var = w1VarD;
                    i10 = iP;
                    listEmptyList = listB;
                } catch (Throwable th2) {
                    th = th2;
                    if (cursorH != null) {
                        cursorH.close();
                    }
                    this.f27251l.k();
                    if (w1VarD != null) {
                        w1VarD.release();
                    }
                    throw th;
                }
            } else {
                i10 = 0;
                w1Var = null;
            }
            if (cursorH != null) {
                cursorH.close();
            }
            this.f27251l.k();
            if (w1Var != null) {
                w1Var.release();
            }
            bVar.b(listEmptyList, i10, iC);
        } catch (Throwable th3) {
            th = th3;
            w1VarD = null;
        }
    }

    @Override // androidx.paging.u0
    public void w(@n0 u0.e eVar, @n0 u0.d<T> dVar) {
        dVar.a(E(eVar.startPosition, eVar.loadSize));
    }
}
