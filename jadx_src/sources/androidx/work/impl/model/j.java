package androidx.work.impl.model;

import androidx.room.q0;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SystemIdInfoDao.kt */
/* JADX INFO: loaded from: classes6.dex */
@androidx.room.h
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH'J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH'J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H'¨\u0006\u0013"}, d2 = {"Landroidx/work/impl/model/j;", "", "Landroidx/work/impl/model/i;", "systemIdInfo", "Lkotlin/b2;", ak.aF, "", "workSpecId", "", "generation", ak.av, "Landroidx/work/impl/model/m;", "id", "d", "f", "g", "b", "", "e", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public interface j {

    /* JADX INFO: compiled from: SystemIdInfoDao.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @dl.e
        public static SystemIdInfo a(@dl.d j jVar, @dl.d WorkGenerationalId id2) {
            f0.p(id2, "id");
            return jVar.a(id2.f(), id2.e());
        }

        public static void b(@dl.d j jVar, @dl.d WorkGenerationalId id2) {
            f0.p(id2, "id");
            jVar.f(id2.f(), id2.e());
        }
    }

    @dl.e
    @q0("SELECT * FROM SystemIdInfo WHERE work_spec_id=:workSpecId AND generation=:generation")
    SystemIdInfo a(@dl.d String workSpecId, int generation);

    void b(@dl.d WorkGenerationalId workGenerationalId);

    @androidx.room.c0(onConflict = 1)
    void c(@dl.d SystemIdInfo systemIdInfo);

    @dl.e
    SystemIdInfo d(@dl.d WorkGenerationalId id2);

    @dl.d
    @q0("SELECT DISTINCT work_spec_id FROM SystemIdInfo")
    List<String> e();

    @q0("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId AND generation=:generation")
    void f(@dl.d String str, int i10);

    @q0("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId")
    void g(@dl.d String str);
}
