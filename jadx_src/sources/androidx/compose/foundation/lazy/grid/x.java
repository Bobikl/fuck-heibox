package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.layout.e1;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyMeasuredItemProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00198F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/lazy/grid/x;", "", "Landroidx/compose/foundation/lazy/grid/e;", UCropPlusActivity.ARG_INDEX, "", "mainAxisSpacing", "Ls1/b;", "constraints", "Landroidx/compose/foundation/lazy/grid/w;", ak.av, "(IIJ)Landroidx/compose/foundation/lazy/grid/w;", "Landroidx/compose/foundation/lazy/grid/j;", "Landroidx/compose/foundation/lazy/grid/j;", "itemProvider", "Landroidx/compose/foundation/lazy/layout/m;", "b", "Landroidx/compose/foundation/lazy/layout/m;", "measureScope", ak.aF, "I", "defaultMainAxisSpacing", "Landroidx/compose/foundation/lazy/grid/b0;", "d", "Landroidx/compose/foundation/lazy/grid/b0;", "measuredItemFactory", "", "()Ljava/util/Map;", "keyToIndexMap", "<init>", "(Landroidx/compose/foundation/lazy/grid/j;Landroidx/compose/foundation/lazy/layout/m;ILandroidx/compose/foundation/lazy/grid/b0;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final j itemProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.foundation.lazy.layout.m measureScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int defaultMainAxisSpacing;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final b0 measuredItemFactory;

    @androidx.compose.foundation.t
    public x(@dl.d j itemProvider, @dl.d androidx.compose.foundation.lazy.layout.m measureScope, int i10, @dl.d b0 measuredItemFactory) {
        f0.p(itemProvider, "itemProvider");
        f0.p(measureScope, "measureScope");
        f0.p(measuredItemFactory, "measuredItemFactory");
        this.itemProvider = itemProvider;
        this.measureScope = measureScope;
        this.defaultMainAxisSpacing = i10;
        this.measuredItemFactory = measuredItemFactory;
    }

    public static /* synthetic */ w b(x xVar, int i10, int i11, long j10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = xVar.defaultMainAxisSpacing;
        }
        return xVar.a(i10, i11, j10);
    }

    @dl.d
    public final w a(int index, int mainAxisSpacing, long constraints) {
        int iQ;
        Object objE = this.itemProvider.e(index);
        List<e1> listK0 = this.measureScope.k0(index, constraints);
        if (s1.b.n(constraints)) {
            iQ = s1.b.r(constraints);
        } else {
            if (!s1.b.l(constraints)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            iQ = s1.b.q(constraints);
        }
        return this.measuredItemFactory.a(index, objE, iQ, mainAxisSpacing, listK0);
    }

    @dl.d
    public final Map<Object, Integer> c() {
        return this.itemProvider.d();
    }
}
