package androidx.work.impl.model;

import androidx.lifecycle.LiveData;
import androidx.room.o1;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: RawWorkInfoDao.kt */
/* JADX INFO: loaded from: classes6.dex */
@androidx.room.h
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006\t"}, d2 = {"Landroidx/work/impl/model/g;", "", "Lj3/j;", "query", "", "Landroidx/work/impl/model/u$c;", "b", "Landroidx/lifecycle/LiveData;", ak.av, "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public interface g {
    @dl.d
    @o1(observedEntities = {u.class})
    LiveData<List<u.WorkInfoPojo>> a(@dl.d j3.j query);

    @dl.d
    @o1(observedEntities = {u.class})
    List<u.WorkInfoPojo> b(@dl.d j3.j query);
}
