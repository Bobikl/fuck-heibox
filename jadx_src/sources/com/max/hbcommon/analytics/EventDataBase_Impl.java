package com.max.hbcommon.analytics;

import androidx.annotation.n0;
import androidx.room.RoomDatabase;
import androidx.room.f0;
import androidx.room.u1;
import androidx.room.v1;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class EventDataBase_Impl extends EventDataBase {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile com.max.hbcommon.analytics.a f66504s;

    public class a extends v1.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(int i10) {
            super(i10);
        }

        @Override // androidx.room.v1.b
        public void a(j3.g gVar) {
            if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, bb.c.b.Qr, new Class[]{j3.g.class}, Void.TYPE).isSupported) {
                return;
            }
            gVar.y0("CREATE TABLE IF NOT EXISTS `page_event` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `path` TEXT NOT NULL, `time` TEXT NOT NULL, `type` TEXT NOT NULL, `stay_duration` TEXT, `stay_duration_ms` TEXT, `src` TEXT, `addition` TEXT)");
            gVar.y0(u1.CREATE_QUERY);
            gVar.y0("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '64bd1415ba400800403605aa7815801e')");
        }

        @Override // androidx.room.v1.b
        public void b(j3.g gVar) {
            if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, bb.c.b.Rr, new Class[]{j3.g.class}, Void.TYPE).isSupported) {
                return;
            }
            gVar.y0("DROP TABLE IF EXISTS `page_event`");
            if (((RoomDatabase) EventDataBase_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) EventDataBase_Impl.this).mCallbacks.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((RoomDatabase.b) ((RoomDatabase) EventDataBase_Impl.this).mCallbacks.get(i10)).b(gVar);
                }
            }
        }

        @Override // androidx.room.v1.b
        public void c(j3.g gVar) {
            if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, bb.c.b.Sr, new Class[]{j3.g.class}, Void.TYPE).isSupported || ((RoomDatabase) EventDataBase_Impl.this).mCallbacks == null) {
                return;
            }
            int size = ((RoomDatabase) EventDataBase_Impl.this).mCallbacks.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((RoomDatabase.b) ((RoomDatabase) EventDataBase_Impl.this).mCallbacks.get(i10)).a(gVar);
            }
        }

        @Override // androidx.room.v1.b
        public void d(j3.g gVar) {
            if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, bb.c.b.Tr, new Class[]{j3.g.class}, Void.TYPE).isSupported) {
                return;
            }
            ((RoomDatabase) EventDataBase_Impl.this).f26958a = gVar;
            EventDataBase_Impl.b0(EventDataBase_Impl.this, gVar);
            if (((RoomDatabase) EventDataBase_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) EventDataBase_Impl.this).mCallbacks.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((RoomDatabase.b) ((RoomDatabase) EventDataBase_Impl.this).mCallbacks.get(i10)).c(gVar);
                }
            }
        }

        @Override // androidx.room.v1.b
        public void e(j3.g gVar) {
        }

        @Override // androidx.room.v1.b
        public void f(j3.g gVar) {
            if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, bb.c.b.Ur, new Class[]{j3.g.class}, Void.TYPE).isSupported) {
                return;
            }
            androidx.room.util.b.b(gVar);
        }

        @Override // androidx.room.v1.b
        public v1.c g(j3.g gVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, bb.c.b.Vr, new Class[]{j3.g.class}, v1.c.class);
            if (patchProxyResultProxy.isSupported) {
                return (v1.c) patchProxyResultProxy.result;
            }
            HashMap map = new HashMap(8);
            map.put("id", new androidx.room.util.f.a("id", "INTEGER", true, 1, null, 1));
            map.put(FlutterActivityLaunchConfigs.EXTRA_PATH, new androidx.room.util.f.a(FlutterActivityLaunchConfigs.EXTRA_PATH, "TEXT", true, 0, null, 1));
            map.put("time", new androidx.room.util.f.a("time", "TEXT", true, 0, null, 1));
            map.put("type", new androidx.room.util.f.a("type", "TEXT", true, 0, null, 1));
            map.put("stay_duration", new androidx.room.util.f.a("stay_duration", "TEXT", false, 0, null, 1));
            map.put("stay_duration_ms", new androidx.room.util.f.a("stay_duration_ms", "TEXT", false, 0, null, 1));
            map.put(com.max.hbsearch.l.W, new androidx.room.util.f.a(com.max.hbsearch.l.W, "TEXT", false, 0, null, 1));
            map.put("addition", new androidx.room.util.f.a("addition", "TEXT", false, 0, null, 1));
            androidx.room.util.f fVar = new androidx.room.util.f(ReportLinkViewTimeWorker.f66524j, map, new HashSet(0), new HashSet(0));
            androidx.room.util.f fVarA = androidx.room.util.f.a(gVar, ReportLinkViewTimeWorker.f66524j);
            if (fVar.equals(fVarA)) {
                return new v1.c(true, null);
            }
            return new v1.c(false, "page_event(com.max.hbcommon.bean.analytics.PageEventEntity).\n Expected:\n" + fVar + "\n Found:\n" + fVarA);
        }
    }

    static /* synthetic */ void b0(EventDataBase_Impl eventDataBase_Impl, j3.g gVar) {
        if (PatchProxy.proxy(new Object[]{eventDataBase_Impl, gVar}, null, changeQuickRedirect, true, bb.c.b.Pr, new Class[]{EventDataBase_Impl.class, j3.g.class}, Void.TYPE).isSupported) {
            return;
        }
        eventDataBase_Impl.D(gVar);
    }

    @Override // com.max.hbcommon.analytics.EventDataBase
    public com.max.hbcommon.analytics.a S() {
        com.max.hbcommon.analytics.a aVar;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1600, new Class[0], com.max.hbcommon.analytics.a.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.hbcommon.analytics.a) patchProxyResultProxy.result;
        }
        if (this.f66504s != null) {
            return this.f66504s;
        }
        synchronized (this) {
            if (this.f66504s == null) {
                this.f66504s = new b(this);
            }
            aVar = this.f66504s;
        }
        return aVar;
    }

    @Override // androidx.room.RoomDatabase
    public void f() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Kr, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.c();
        j3.g writableDatabase = super.s().getWritableDatabase();
        try {
            super.e();
            writableDatabase.y0("DELETE FROM `page_event`");
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
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Jr, new Class[0], f0.class);
        return patchProxyResultProxy.isSupported ? (f0) patchProxyResultProxy.result : new f0(this, new HashMap(0), new HashMap(0), ReportLinkViewTimeWorker.f66524j);
    }

    @Override // androidx.room.RoomDatabase
    public j3.h j(androidx.room.j jVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, bb.c.b.Ir, new Class[]{androidx.room.j.class}, j3.h.class);
        return patchProxyResultProxy.isSupported ? (j3.h) patchProxyResultProxy.result : jVar.f27197c.a(j3.h.b.a(jVar.context).d(jVar.name).c(new v1(jVar, new a(2), "64bd1415ba400800403605aa7815801e", "0b8a58a6b2b42f5aed24c5110108296c")).b());
    }

    @Override // androidx.room.RoomDatabase
    public List<f3.c> m(@n0 Map<Class<? extends f3.b>, f3.b> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, bb.c.b.Nr, new Class[]{Map.class}, List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : Arrays.asList(new f3.c[0]);
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends f3.b>> u() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Mr, new Class[0], Set.class);
        return patchProxyResultProxy.isSupported ? (Set) patchProxyResultProxy.result : new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> v() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Lr, new Class[0], Map.class);
        if (patchProxyResultProxy.isSupported) {
            return (Map) patchProxyResultProxy.result;
        }
        HashMap map = new HashMap();
        map.put(com.max.hbcommon.analytics.a.class, b.i());
        return map;
    }
}
