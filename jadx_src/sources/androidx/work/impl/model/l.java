package androidx.work.impl.model;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SystemIdInfo.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Landroidx/work/impl/model/m;", "generationalId", "", "systemId", "Landroidx/work/impl/model/i;", ak.av, "work-runtime_release"}, k = 2, mv = {1, 7, 1})
public final class l {
    @dl.d
    public static final SystemIdInfo a(@dl.d WorkGenerationalId generationalId, int i10) {
        f0.p(generationalId, "generationalId");
        return new SystemIdInfo(generationalId.f(), generationalId.e(), i10);
    }
}
