package com.max.hbcoco.room.database;

import androidx.annotation.n0;
import androidx.room.RoomDatabase;
import androidx.room.f0;
import androidx.room.j;
import androidx.room.u1;
import androidx.room.util.b;
import androidx.room.util.f;
import androidx.room.v1;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import j3.g;
import j3.h;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class ClassNameDataBase_Impl extends ClassNameDataBase {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile com.max.hbcoco.room.dao.a f66324q;

    public class a extends v1.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(int i10) {
            super(i10);
        }

        @Override // androidx.room.v1.b
        public void a(g gVar) {
            if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, c.b.Sq, new Class[]{g.class}, Void.TYPE).isSupported) {
                return;
            }
            gVar.y0("CREATE TABLE IF NOT EXISTS `ClassNameData` (`name` TEXT NOT NULL, PRIMARY KEY(`name`))");
            gVar.y0(u1.CREATE_QUERY);
            gVar.y0("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1607d1ec4449f2762690d3153d129b49')");
        }

        @Override // androidx.room.v1.b
        public void b(g gVar) {
            if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, c.b.Tq, new Class[]{g.class}, Void.TYPE).isSupported) {
                return;
            }
            gVar.y0("DROP TABLE IF EXISTS `ClassNameData`");
            if (((RoomDatabase) ClassNameDataBase_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) ClassNameDataBase_Impl.this).mCallbacks.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((RoomDatabase.b) ((RoomDatabase) ClassNameDataBase_Impl.this).mCallbacks.get(i10)).b(gVar);
                }
            }
        }

        @Override // androidx.room.v1.b
        public void c(g gVar) {
            if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, c.b.Uq, new Class[]{g.class}, Void.TYPE).isSupported || ((RoomDatabase) ClassNameDataBase_Impl.this).mCallbacks == null) {
                return;
            }
            int size = ((RoomDatabase) ClassNameDataBase_Impl.this).mCallbacks.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((RoomDatabase.b) ((RoomDatabase) ClassNameDataBase_Impl.this).mCallbacks.get(i10)).a(gVar);
            }
        }

        @Override // androidx.room.v1.b
        public void d(g gVar) {
            if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, c.b.Vq, new Class[]{g.class}, Void.TYPE).isSupported) {
                return;
            }
            ((RoomDatabase) ClassNameDataBase_Impl.this).f26958a = gVar;
            ClassNameDataBase_Impl.Z(ClassNameDataBase_Impl.this, gVar);
            if (((RoomDatabase) ClassNameDataBase_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) ClassNameDataBase_Impl.this).mCallbacks.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((RoomDatabase.b) ((RoomDatabase) ClassNameDataBase_Impl.this).mCallbacks.get(i10)).c(gVar);
                }
            }
        }

        @Override // androidx.room.v1.b
        public void e(g gVar) {
        }

        @Override // androidx.room.v1.b
        public void f(g gVar) {
            if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, c.b.Wq, new Class[]{g.class}, Void.TYPE).isSupported) {
                return;
            }
            b.b(gVar);
        }

        @Override // androidx.room.v1.b
        public v1.c g(g gVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, c.b.Xq, new Class[]{g.class}, v1.c.class);
            if (patchProxyResultProxy.isSupported) {
                return (v1.c) patchProxyResultProxy.result;
            }
            HashMap map = new HashMap(1);
            map.put("name", new f.a("name", "TEXT", true, 1, null, 1));
            f fVar = new f("ClassNameData", map, new HashSet(0), new HashSet(0));
            f fVarA = f.a(gVar, "ClassNameData");
            if (fVar.equals(fVarA)) {
                return new v1.c(true, null);
            }
            return new v1.c(false, "ClassNameData(com.max.hbcoco.room.data.ClassNameData).\n Expected:\n" + fVar + "\n Found:\n" + fVarA);
        }
    }

    static /* synthetic */ void Z(ClassNameDataBase_Impl classNameDataBase_Impl, g gVar) {
        if (PatchProxy.proxy(new Object[]{classNameDataBase_Impl, gVar}, null, changeQuickRedirect, true, c.b.Rq, new Class[]{ClassNameDataBase_Impl.class, g.class}, Void.TYPE).isSupported) {
            return;
        }
        classNameDataBase_Impl.D(gVar);
    }

    @Override // com.max.hbcoco.room.database.ClassNameDataBase
    public com.max.hbcoco.room.dao.a Q() {
        com.max.hbcoco.room.dao.a aVar;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.Qq, new Class[0], com.max.hbcoco.room.dao.a.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.hbcoco.room.dao.a) patchProxyResultProxy.result;
        }
        if (this.f66324q != null) {
            return this.f66324q;
        }
        synchronized (this) {
            if (this.f66324q == null) {
                this.f66324q = new com.max.hbcoco.room.dao.b(this);
            }
            aVar = this.f66324q;
        }
        return aVar;
    }

    @Override // androidx.room.RoomDatabase
    public void f() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.Mq, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.c();
        g writableDatabase = super.s().getWritableDatabase();
        try {
            super.e();
            writableDatabase.y0("DELETE FROM `ClassNameData`");
            super.O();
        } finally {
            super.k();
            writableDatabase.D1("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.I1()) {
                writableDatabase.y0("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    public f0 i() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1545, new Class[0], f0.class);
        return patchProxyResultProxy.isSupported ? (f0) patchProxyResultProxy.result : new f0(this, new HashMap(0), new HashMap(0), "ClassNameData");
    }

    @Override // androidx.room.RoomDatabase
    public h j(j jVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, c.b.Kq, new Class[]{j.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : jVar.f27197c.a(h.b.a(jVar.context).d(jVar.name).c(new v1(jVar, new a(1), "1607d1ec4449f2762690d3153d129b49", "c43622802d2afa7310149cae3da537c8")).b());
    }

    @Override // androidx.room.RoomDatabase
    public List<f3.c> m(@n0 Map<Class<? extends f3.b>, f3.b> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 1549, new Class[]{Map.class}, List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : Arrays.asList(new f3.c[0]);
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends f3.b>> u() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.Oq, new Class[0], Set.class);
        return patchProxyResultProxy.isSupported ? (Set) patchProxyResultProxy.result : new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> v() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.Nq, new Class[0], Map.class);
        if (patchProxyResultProxy.isSupported) {
            return (Map) patchProxyResultProxy.result;
        }
        HashMap map = new HashMap();
        map.put(com.max.hbcoco.room.dao.a.class, com.max.hbcoco.room.dao.b.e());
        return map;
    }
}
