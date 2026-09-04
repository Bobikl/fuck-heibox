package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@o0
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0006\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/y0;", "", "Landroidx/compose/runtime/x1;", ak.av, "Landroidx/compose/runtime/x1;", "()Landroidx/compose/runtime/x1;", "slotTable", "<init>", "(Landroidx/compose/runtime/x1;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f13350b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final x1 slotTable;

    public y0(@dl.d x1 slotTable) {
        kotlin.jvm.internal.f0.p(slotTable, "slotTable");
        this.slotTable = slotTable;
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final x1 getSlotTable() {
        return this.slotTable;
    }
}
