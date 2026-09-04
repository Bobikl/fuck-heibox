package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.q0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: WorkProgressDao.kt */
/* JADX INFO: loaded from: classes6.dex */
@androidx.room.h
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H'J\b\u0010\t\u001a\u00020\u0004H'J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u0006H'¨\u0006\f"}, d2 = {"Landroidx/work/impl/model/r;", "", "Landroidx/work/impl/model/q;", "progress", "Lkotlin/b2;", "d", "", "workSpecId", ak.av, "b", "Landroidx/work/e;", ak.aF, "work-runtime_release"}, k = 1, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface r {
    @q0("DELETE from WorkProgress where work_spec_id=:workSpecId")
    void a(@dl.d String str);

    @q0("DELETE FROM WorkProgress")
    void b();

    @dl.e
    @q0("SELECT progress FROM WorkProgress WHERE work_spec_id=:workSpecId")
    androidx.work.e c(@dl.d String workSpecId);

    @androidx.room.c0(onConflict = 1)
    void d(@dl.d q qVar);
}
