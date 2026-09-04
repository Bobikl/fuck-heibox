package androidx.work.impl.model;

import androidx.room.q0;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: WorkTagDao.kt */
/* JADX INFO: loaded from: classes6.dex */
@androidx.room.h
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\t\u001a\u00020\u0006H'J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0007\u001a\u00020\u0006H'J\u001e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0016¨\u0006\u0010"}, d2 = {"Landroidx/work/impl/model/z;", "", "Landroidx/work/impl/model/y;", "workTag", "Lkotlin/b2;", "d", "", "id", ak.av, "tag", "", "e", ak.aF, "", "tags", "b", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public interface z {

    /* JADX INFO: compiled from: WorkTagDao.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        public static void a(@dl.d z zVar, @dl.d String id2, @dl.d Set<String> tags) {
            f0.p(id2, "id");
            f0.p(tags, "tags");
            Iterator<T> it = tags.iterator();
            while (it.hasNext()) {
                zVar.d(new y((String) it.next(), id2));
            }
        }
    }

    @q0("DELETE FROM worktag WHERE work_spec_id=:id")
    void a(@dl.d String str);

    void b(@dl.d String str, @dl.d Set<String> set);

    @dl.d
    @q0("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=:id")
    List<String> c(@dl.d String id2);

    @androidx.room.c0(onConflict = 5)
    void d(@dl.d y yVar);

    @dl.d
    @q0("SELECT work_spec_id FROM worktag WHERE tag=:tag")
    List<String> e(@dl.d String tag);
}
