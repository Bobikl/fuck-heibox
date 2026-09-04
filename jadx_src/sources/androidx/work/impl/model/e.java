package androidx.work.impl.model;

import androidx.lifecycle.LiveData;
import androidx.room.q0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: PreferenceDao.kt */
/* JADX INFO: loaded from: classes6.dex */
@androidx.room.h
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H'¨\u0006\r"}, d2 = {"Landroidx/work/impl/model/e;", "", "Landroidx/work/impl/model/d;", "preference", "Lkotlin/b2;", "b", "", "key", "", ak.aF, "(Ljava/lang/String;)Ljava/lang/Long;", "Landroidx/lifecycle/LiveData;", ak.av, "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public interface e {
    @dl.d
    @q0("SELECT long_value FROM Preference where `key`=:key")
    LiveData<Long> a(@dl.d String key);

    @androidx.room.c0(onConflict = 1)
    void b(@dl.d Preference preference);

    @dl.e
    @q0("SELECT long_value FROM Preference where `key`=:key")
    Long c(@dl.d String key);
}
