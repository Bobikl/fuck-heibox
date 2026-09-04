package androidx.work.impl.model;

import androidx.room.q0;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: WorkNameDao.kt */
/* JADX INFO: loaded from: classes6.dex */
@androidx.room.h
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\n\u001a\u00020\u0006H'¨\u0006\f"}, d2 = {"Landroidx/work/impl/model/o;", "", "Landroidx/work/impl/model/n;", "workName", "Lkotlin/b2;", ak.av, "", "name", "", ak.aF, "workSpecId", "b", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public interface o {
    @androidx.room.c0(onConflict = 5)
    void a(@dl.d n nVar);

    @dl.d
    @q0("SELECT name FROM workname WHERE work_spec_id=:workSpecId")
    List<String> b(@dl.d String workSpecId);

    @dl.d
    @q0("SELECT work_spec_id FROM workname WHERE name=:name")
    List<String> c(@dl.d String name);
}
