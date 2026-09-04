package androidx.work.impl.model;

import androidx.room.q0;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: DependencyDao.kt */
/* JADX INFO: loaded from: classes6.dex */
@androidx.room.h
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H'¨\u0006\u000e"}, d2 = {"Landroidx/work/impl/model/b;", "", "Landroidx/work/impl/model/a;", "dependency", "Lkotlin/b2;", ak.av, "", "id", "", ak.aF, "", "d", "b", "e", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public interface b {
    @androidx.room.c0(onConflict = 5)
    void a(@dl.d a aVar);

    @dl.d
    @q0("SELECT work_spec_id FROM dependency WHERE prerequisite_id=:id")
    List<String> b(@dl.d String id2);

    @q0("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=:id AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)")
    boolean c(@dl.d String id2);

    @dl.d
    @q0("SELECT prerequisite_id FROM dependency WHERE work_spec_id=:id")
    List<String> d(@dl.d String id2);

    @q0("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=:id")
    boolean e(@dl.d String id2);
}
