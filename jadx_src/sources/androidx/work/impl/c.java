package androidx.work.impl;

import androidx.room.RoomDatabase;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: WorkDatabase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/work/impl/c;", "Landroidx/room/RoomDatabase$b;", "Lj3/g;", "db", "Lkotlin/b2;", ak.aF, "", "e", "()Ljava/lang/String;", "pruneSQL", "", "d", "()J", "pruneDate", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class c extends RoomDatabase.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final c f28920a = new c();

    private c() {
    }

    private final String e() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + d() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    @Override // androidx.room.RoomDatabase.b
    public void c(@dl.d j3.g db2) {
        kotlin.jvm.internal.f0.p(db2, "db");
        super.c(db2);
        db2.u();
        try {
            db2.y0(e());
            db2.O0();
        } finally {
            db2.U0();
        }
    }

    public final long d() {
        return System.currentTimeMillis() - z.f29428c;
    }
}
