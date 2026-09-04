package androidx.work.impl;

import android.content.ContentValues;
import androidx.room.q1;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: WorkDatabaseMigrations.kt */
/* JADX INFO: loaded from: classes6.dex */
@q1(fromColumnName = "period_start_time", tableName = "WorkSpec", toColumnName = "last_enqueue_time")
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Landroidx/work/impl/b;", "Lf3/b;", "Lj3/g;", "db", "Lkotlin/b2;", ak.av, "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class b implements f3.b {
    @Override // f3.b
    public void a(@dl.d j3.g db2) {
        kotlin.jvm.internal.f0.p(db2, "db");
        db2.y0("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        db2.x1("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }
}
