package androidx.work.impl.model;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: WorkSpec.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Landroidx/work/impl/model/u;", "Landroidx/work/impl/model/m;", ak.av, "work-runtime_release"}, k = 2, mv = {1, 7, 1})
public final class x {
    @dl.d
    public static final WorkGenerationalId a(@dl.d u uVar) {
        f0.p(uVar, "<this>");
        return new WorkGenerationalId(uVar.id, uVar.z());
    }
}
