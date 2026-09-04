package com.max.hbcommon.analytics;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.r;
import androidx.room.s;
import androidx.room.w1;
import com.max.hbcommon.bean.analytics.PageEventEntity;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: EventDao_Impl.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b implements com.max.hbcommon.analytics.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RoomDatabase f66527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s<PageEventEntity> f66528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f66529c = new i();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r<PageEventEntity> f66530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SharedSQLiteStatement f66531e;

    /* JADX INFO: compiled from: EventDao_Impl.java */
    public class a extends s<PageEventEntity> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String e() {
            return "INSERT OR ABORT INTO `page_event` (`id`,`path`,`time`,`type`,`stay_duration`,`stay_duration_ms`,`src`,`addition`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.s
        public /* bridge */ /* synthetic */ void i(j3.l lVar, PageEventEntity pageEventEntity) {
            if (PatchProxy.proxy(new Object[]{lVar, pageEventEntity}, this, changeQuickRedirect, false, bb.c.b.yr, new Class[]{j3.l.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            t(lVar, pageEventEntity);
        }

        public void t(j3.l lVar, PageEventEntity pageEventEntity) {
            if (PatchProxy.proxy(new Object[]{lVar, pageEventEntity}, this, changeQuickRedirect, false, bb.c.b.xr, new Class[]{j3.l.class, PageEventEntity.class}, Void.TYPE).isSupported) {
                return;
            }
            lVar.d0(1, pageEventEntity.getId());
            if (pageEventEntity.getPath() == null) {
                lVar.r0(2);
            } else {
                lVar.X(2, pageEventEntity.getPath());
            }
            if (pageEventEntity.getTime() == null) {
                lVar.r0(3);
            } else {
                lVar.X(3, pageEventEntity.getTime());
            }
            if (pageEventEntity.getType() == null) {
                lVar.r0(4);
            } else {
                lVar.X(4, pageEventEntity.getType());
            }
            if (pageEventEntity.getStay_duration() == null) {
                lVar.r0(5);
            } else {
                lVar.X(5, pageEventEntity.getStay_duration());
            }
            if (pageEventEntity.getStay_duration_ms() == null) {
                lVar.r0(6);
            } else {
                lVar.X(6, pageEventEntity.getStay_duration_ms());
            }
            if (pageEventEntity.getSrc() == null) {
                lVar.r0(7);
            } else {
                lVar.X(7, pageEventEntity.getSrc());
            }
            String strA = b.this.f66529c.a(pageEventEntity.getAddition());
            if (strA == null) {
                lVar.r0(8);
            } else {
                lVar.X(8, strA);
            }
        }
    }

    /* JADX INFO: renamed from: com.max.hbcommon.analytics.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EventDao_Impl.java */
    public class C0535b extends r<PageEventEntity> {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0535b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.r, androidx.room.SharedSQLiteStatement
        public String e() {
            return "DELETE FROM `page_event` WHERE `id` = ?";
        }

        @Override // androidx.room.r
        public /* bridge */ /* synthetic */ void i(j3.l lVar, PageEventEntity pageEventEntity) {
            if (PatchProxy.proxy(new Object[]{lVar, pageEventEntity}, this, changeQuickRedirect, false, bb.c.b.Ar, new Class[]{j3.l.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(lVar, pageEventEntity);
        }

        public void m(j3.l lVar, PageEventEntity pageEventEntity) {
            if (PatchProxy.proxy(new Object[]{lVar, pageEventEntity}, this, changeQuickRedirect, false, bb.c.b.zr, new Class[]{j3.l.class, PageEventEntity.class}, Void.TYPE).isSupported) {
                return;
            }
            lVar.d0(1, pageEventEntity.getId());
        }
    }

    /* JADX INFO: compiled from: EventDao_Impl.java */
    public class c extends SharedSQLiteStatement {
        public static ChangeQuickRedirect changeQuickRedirect;

        c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String e() {
            return "DELETE FROM page_event";
        }
    }

    /* JADX INFO: compiled from: EventDao_Impl.java */
    public class d implements Callable<List<PageEventEntity>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w1 f66535b;

        d(w1 w1Var) {
            this.f66535b = w1Var;
        }

        public List<PageEventEntity> a() throws Exception {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Br, new Class[0], List.class);
            if (patchProxyResultProxy.isSupported) {
                return (List) patchProxyResultProxy.result;
            }
            Cursor cursorF = androidx.room.util.b.f(b.this.f66527a, this.f66535b, false, null);
            try {
                int iE = androidx.room.util.a.e(cursorF, "id");
                int iE2 = androidx.room.util.a.e(cursorF, FlutterActivityLaunchConfigs.EXTRA_PATH);
                int iE3 = androidx.room.util.a.e(cursorF, "time");
                int iE4 = androidx.room.util.a.e(cursorF, "type");
                int iE5 = androidx.room.util.a.e(cursorF, "stay_duration");
                int iE6 = androidx.room.util.a.e(cursorF, "stay_duration_ms");
                int iE7 = androidx.room.util.a.e(cursorF, com.max.hbsearch.l.W);
                int iE8 = androidx.room.util.a.e(cursorF, "addition");
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    arrayList.add(new PageEventEntity(cursorF.getInt(iE), cursorF.isNull(iE2) ? null : cursorF.getString(iE2), cursorF.isNull(iE3) ? null : cursorF.getString(iE3), cursorF.isNull(iE4) ? null : cursorF.getString(iE4), cursorF.isNull(iE5) ? null : cursorF.getString(iE5), cursorF.isNull(iE6) ? null : cursorF.getString(iE6), cursorF.isNull(iE7) ? null : cursorF.getString(iE7), b.this.f66529c.b(cursorF.isNull(iE8) ? null : cursorF.getString(iE8))));
                }
                return arrayList;
            } finally {
                cursorF.close();
            }
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List<com.max.hbcommon.bean.analytics.PageEventEntity>] */
        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ List<PageEventEntity> call() throws Exception {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Dr, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }

        public void finalize() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Cr, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f66535b.release();
        }
    }

    public b(RoomDatabase roomDatabase) {
        this.f66527a = roomDatabase;
        this.f66528b = new a(roomDatabase);
        this.f66530d = new C0535b(roomDatabase);
        this.f66531e = new c(roomDatabase);
    }

    public static List<Class<?>> i() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.b.wr, new Class[0], List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : Collections.emptyList();
    }

    @Override // com.max.hbcommon.analytics.a
    public void a(PageEventEntity... pageEventEntityArr) {
        if (PatchProxy.proxy(new Object[]{pageEventEntityArr}, this, changeQuickRedirect, false, bb.c.b.qr, new Class[]{PageEventEntity[].class}, Void.TYPE).isSupported) {
            return;
        }
        this.f66527a.d();
        this.f66527a.e();
        try {
            this.f66528b.l(pageEventEntityArr);
            this.f66527a.O();
        } finally {
            this.f66527a.k();
        }
    }

    @Override // com.max.hbcommon.analytics.a
    public void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.tr, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66527a.d();
        j3.l lVarB = this.f66531e.b();
        this.f66527a.e();
        try {
            lVarB.y();
            this.f66527a.O();
        } finally {
            this.f66527a.k();
            this.f66531e.h(lVarB);
        }
    }

    @Override // com.max.hbcommon.analytics.a
    public void c(PageEventEntity... pageEventEntityArr) {
        if (PatchProxy.proxy(new Object[]{pageEventEntityArr}, this, changeQuickRedirect, false, bb.c.b.rr, new Class[]{PageEventEntity[].class}, Void.TYPE).isSupported) {
            return;
        }
        this.f66527a.d();
        this.f66527a.e();
        try {
            this.f66530d.l(pageEventEntityArr);
            this.f66527a.O();
        } finally {
            this.f66527a.k();
        }
    }

    @Override // com.max.hbcommon.analytics.a
    public void d(PageEventEntity pageEventEntity) {
        if (PatchProxy.proxy(new Object[]{pageEventEntity}, this, changeQuickRedirect, false, bb.c.b.pr, new Class[]{PageEventEntity.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f66527a.d();
        this.f66527a.e();
        try {
            this.f66528b.k(pageEventEntity);
            this.f66527a.O();
        } finally {
            this.f66527a.k();
        }
    }

    @Override // com.max.hbcommon.analytics.a
    public void e(PageEventEntity[] pageEventEntityArr) {
        if (PatchProxy.proxy(new Object[]{pageEventEntityArr}, this, changeQuickRedirect, false, bb.c.b.sr, new Class[]{PageEventEntity[].class}, Void.TYPE).isSupported) {
            return;
        }
        this.f66527a.d();
        this.f66527a.e();
        try {
            this.f66530d.l(pageEventEntityArr);
            this.f66527a.O();
        } finally {
            this.f66527a.k();
        }
    }

    @Override // com.max.hbcommon.analytics.a
    public kotlinx.coroutines.flow.e<List<PageEventEntity>> f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.vr, new Class[0], kotlinx.coroutines.flow.e.class);
        if (patchProxyResultProxy.isSupported) {
            return (kotlinx.coroutines.flow.e) patchProxyResultProxy.result;
        }
        return CoroutinesRoom.a(this.f66527a, false, new String[]{ReportLinkViewTimeWorker.f66524j}, new d(w1.d("SELECT * FROM page_event", 0)));
    }

    @Override // com.max.hbcommon.analytics.a
    public List<PageEventEntity> getAll() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.ur, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        w1 w1VarD = w1.d("SELECT * FROM page_event", 0);
        this.f66527a.d();
        Cursor cursorF = androidx.room.util.b.f(this.f66527a, w1VarD, false, null);
        try {
            int iE = androidx.room.util.a.e(cursorF, "id");
            int iE2 = androidx.room.util.a.e(cursorF, FlutterActivityLaunchConfigs.EXTRA_PATH);
            int iE3 = androidx.room.util.a.e(cursorF, "time");
            int iE4 = androidx.room.util.a.e(cursorF, "type");
            int iE5 = androidx.room.util.a.e(cursorF, "stay_duration");
            int iE6 = androidx.room.util.a.e(cursorF, "stay_duration_ms");
            int iE7 = androidx.room.util.a.e(cursorF, com.max.hbsearch.l.W);
            int iE8 = androidx.room.util.a.e(cursorF, "addition");
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                arrayList.add(new PageEventEntity(cursorF.getInt(iE), cursorF.isNull(iE2) ? null : cursorF.getString(iE2), cursorF.isNull(iE3) ? null : cursorF.getString(iE3), cursorF.isNull(iE4) ? null : cursorF.getString(iE4), cursorF.isNull(iE5) ? null : cursorF.getString(iE5), cursorF.isNull(iE6) ? null : cursorF.getString(iE6), cursorF.isNull(iE7) ? null : cursorF.getString(iE7), this.f66529c.b(cursorF.isNull(iE8) ? null : cursorF.getString(iE8))));
            }
            return arrayList;
        } finally {
            cursorF.close();
            w1VarD.release();
        }
    }
}
