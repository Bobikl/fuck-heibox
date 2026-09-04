package com.max.hbcoco.room.dao;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.r;
import androidx.room.s;
import androidx.room.util.e;
import androidx.room.w1;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import j3.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: ClassNameDao_Impl.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b implements com.max.hbcoco.room.dao.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RoomDatabase f66317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s<za.a> f66318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r<za.a> f66319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SharedSQLiteStatement f66320d;

    /* JADX INFO: compiled from: ClassNameDao_Impl.java */
    public class a extends s<za.a> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String e() {
            return "INSERT OR IGNORE INTO `ClassNameData` (`name`) VALUES (?)";
        }

        @Override // androidx.room.s
        public /* bridge */ /* synthetic */ void i(l lVar, za.a aVar) {
            if (PatchProxy.proxy(new Object[]{lVar, aVar}, this, changeQuickRedirect, false, bb.c.b.Cq, new Class[]{l.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            t(lVar, aVar);
        }

        public void t(l lVar, za.a aVar) {
            if (PatchProxy.proxy(new Object[]{lVar, aVar}, this, changeQuickRedirect, false, bb.c.b.Bq, new Class[]{l.class, za.a.class}, Void.TYPE).isSupported) {
                return;
            }
            if (aVar.d() == null) {
                lVar.r0(1);
            } else {
                lVar.X(1, aVar.d());
            }
        }
    }

    /* JADX INFO: renamed from: com.max.hbcoco.room.dao.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ClassNameDao_Impl.java */
    public class C0533b extends r<za.a> {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0533b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.r, androidx.room.SharedSQLiteStatement
        public String e() {
            return "DELETE FROM `ClassNameData` WHERE `name` = ?";
        }

        @Override // androidx.room.r
        public /* bridge */ /* synthetic */ void i(l lVar, za.a aVar) {
            if (PatchProxy.proxy(new Object[]{lVar, aVar}, this, changeQuickRedirect, false, bb.c.b.Eq, new Class[]{l.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(lVar, aVar);
        }

        public void m(l lVar, za.a aVar) {
            if (PatchProxy.proxy(new Object[]{lVar, aVar}, this, changeQuickRedirect, false, bb.c.b.Dq, new Class[]{l.class, za.a.class}, Void.TYPE).isSupported) {
                return;
            }
            if (aVar.d() == null) {
                lVar.r0(1);
            } else {
                lVar.X(1, aVar.d());
            }
        }
    }

    /* JADX INFO: compiled from: ClassNameDao_Impl.java */
    public class c extends SharedSQLiteStatement {
        public static ChangeQuickRedirect changeQuickRedirect;

        c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String e() {
            return "DELETE FROM classnamedata";
        }
    }

    public b(RoomDatabase roomDatabase) {
        this.f66317a = roomDatabase;
        this.f66318b = new a(roomDatabase);
        this.f66319c = new C0533b(roomDatabase);
        this.f66320d = new c(roomDatabase);
    }

    public static List<Class<?>> e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.b.Aq, new Class[0], List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : Collections.emptyList();
    }

    @Override // com.max.hbcoco.room.dao.a
    public void a(za.a... aVarArr) {
        if (PatchProxy.proxy(new Object[]{aVarArr}, this, changeQuickRedirect, false, bb.c.b.wq, new Class[]{za.a[].class}, Void.TYPE).isSupported) {
            return;
        }
        this.f66317a.d();
        this.f66317a.e();
        try {
            this.f66319c.l(aVarArr);
            this.f66317a.O();
        } finally {
            this.f66317a.k();
        }
    }

    @Override // com.max.hbcoco.room.dao.a
    public List<za.a> b(int[] iArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iArr}, this, changeQuickRedirect, false, bb.c.b.zq, new Class[]{int[].class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        StringBuilder sbD = e.d();
        sbD.append("SELECT * FROM classnamedata WHERE name IN (");
        int length = iArr.length;
        e.a(sbD, length);
        sbD.append(")");
        w1 w1VarD = w1.d(sbD.toString(), length + 0);
        int i10 = 1;
        for (int i11 : iArr) {
            w1VarD.d0(i10, i11);
            i10++;
        }
        this.f66317a.d();
        Cursor cursorF = androidx.room.util.b.f(this.f66317a, w1VarD, false, null);
        try {
            int iE = androidx.room.util.a.e(cursorF, "name");
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                arrayList.add(new za.a(cursorF.isNull(iE) ? null : cursorF.getString(iE)));
            }
            return arrayList;
        } finally {
            cursorF.close();
            w1VarD.release();
        }
    }

    @Override // com.max.hbcoco.room.dao.a
    public void c(List<za.a> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.b.vq, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f66317a.d();
        this.f66317a.e();
        try {
            this.f66318b.j(list);
            this.f66317a.O();
        } finally {
            this.f66317a.k();
        }
    }

    @Override // com.max.hbcoco.room.dao.a
    public void clear() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.xq, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66317a.d();
        l lVarB = this.f66320d.b();
        this.f66317a.e();
        try {
            lVarB.y();
            this.f66317a.O();
        } finally {
            this.f66317a.k();
            this.f66320d.h(lVarB);
        }
    }

    @Override // com.max.hbcoco.room.dao.a
    public void d(za.a... aVarArr) {
        if (PatchProxy.proxy(new Object[]{aVarArr}, this, changeQuickRedirect, false, bb.c.b.uq, new Class[]{za.a[].class}, Void.TYPE).isSupported) {
            return;
        }
        this.f66317a.d();
        this.f66317a.e();
        try {
            this.f66318b.l(aVarArr);
            this.f66317a.O();
        } finally {
            this.f66317a.k();
        }
    }

    @Override // com.max.hbcoco.room.dao.a
    public List<za.a> getAll() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.yq, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        w1 w1VarD = w1.d("SELECT * FROM classnamedata", 0);
        this.f66317a.d();
        Cursor cursorF = androidx.room.util.b.f(this.f66317a, w1VarD, false, null);
        try {
            int iE = androidx.room.util.a.e(cursorF, "name");
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                arrayList.add(new za.a(cursorF.isNull(iE) ? null : cursorF.getString(iE)));
            }
            return arrayList;
        } finally {
            cursorF.close();
            w1VarD.release();
        }
    }
}
