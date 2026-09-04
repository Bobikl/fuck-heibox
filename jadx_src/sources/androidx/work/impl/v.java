package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: StartStopToken.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Landroidx/work/impl/v;", "", "Landroidx/work/impl/model/m;", ak.av, "Landroidx/work/impl/model/m;", "()Landroidx/work/impl/model/m;", "id", "<init>", "(Landroidx/work/impl/model/m;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final WorkGenerationalId id;

    public v(@dl.d WorkGenerationalId id2) {
        kotlin.jvm.internal.f0.p(id2, "id");
        this.id = id2;
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final WorkGenerationalId getId() {
        return this.id;
    }
}
