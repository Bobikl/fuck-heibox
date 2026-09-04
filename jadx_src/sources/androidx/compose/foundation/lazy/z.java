package androidx.compose.foundation.lazy;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: LazyMeasuredItemProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B4\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0012\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000eø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0016\u001a\u00020\u00128\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000b\u0010\u0015R\u001d\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00180\u00178F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0019\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/foundation/lazy/z;", "", "Landroidx/compose/foundation/lazy/b;", UCropPlusActivity.ARG_INDEX, "Landroidx/compose/foundation/lazy/y;", ak.av, "(I)Landroidx/compose/foundation/lazy/y;", "Landroidx/compose/foundation/lazy/o;", "Landroidx/compose/foundation/lazy/o;", "itemProvider", "Landroidx/compose/foundation/lazy/layout/m;", "b", "Landroidx/compose/foundation/lazy/layout/m;", "measureScope", "Landroidx/compose/foundation/lazy/b0;", ak.aF, "Landroidx/compose/foundation/lazy/b0;", "measuredItemFactory", "Ls1/b;", "d", "J", "()J", "childConstraints", "", "", "()Ljava/util/Map;", "keyToIndexMap", "constraints", "", "isVertical", "<init>", "(JZLandroidx/compose/foundation/lazy/o;Landroidx/compose/foundation/lazy/layout/m;Landroidx/compose/foundation/lazy/b0;Lkotlin/jvm/internal/u;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final o itemProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.foundation.lazy.layout.m measureScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final b0 measuredItemFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long childConstraints;

    private z(long j10, boolean z10, o oVar, androidx.compose.foundation.lazy.layout.m mVar, b0 b0Var) {
        this.itemProvider = oVar;
        this.measureScope = mVar;
        this.measuredItemFactory = b0Var;
        this.childConstraints = s1.c.b(0, z10 ? s1.b.p(j10) : Integer.MAX_VALUE, 0, z10 ? Integer.MAX_VALUE : s1.b.o(j10), 5, null);
    }

    @androidx.compose.foundation.t
    public /* synthetic */ z(long j10, boolean z10, o oVar, androidx.compose.foundation.lazy.layout.m mVar, b0 b0Var, kotlin.jvm.internal.u uVar) {
        this(j10, z10, oVar, mVar, b0Var);
    }

    @dl.d
    public final y a(int index) {
        return this.measuredItemFactory.a(index, this.itemProvider.e(index), this.measureScope.k0(index, this.childConstraints));
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getChildConstraints() {
        return this.childConstraints;
    }

    @dl.d
    public final Map<Object, Integer> c() {
        return this.itemProvider.d();
    }
}
