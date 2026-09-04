package androidx.work.impl;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: WorkDatabaseMigrations.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Landroidx/work/impl/f;", "Lf3/c;", "Lj3/g;", "db", "Lkotlin/b2;", ak.av, "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class f extends f3.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final f f28967c = new f();

    private f() {
        super(11, 12);
    }

    @Override // f3.c
    public void a(@dl.d j3.g db2) {
        kotlin.jvm.internal.f0.p(db2, "db");
        db2.y0("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
