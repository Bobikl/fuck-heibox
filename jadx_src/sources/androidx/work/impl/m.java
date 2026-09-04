package androidx.work.impl;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: WorkDatabaseMigrations.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Landroidx/work/impl/m;", "Lf3/c;", "Lj3/g;", "db", "Lkotlin/b2;", ak.av, "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class m extends f3.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final m f29050c = new m();

    private m() {
        super(7, 8);
    }

    @Override // f3.c
    public void a(@dl.d j3.g db2) {
        kotlin.jvm.internal.f0.p(db2, "db");
        db2.y0("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
