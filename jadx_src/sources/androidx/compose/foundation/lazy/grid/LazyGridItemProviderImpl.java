package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.u1;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyGridItemProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.t
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u0011\u0010\n\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J$\u0010\r\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001fR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030!8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\"\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006("}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemProviderImpl;", "Landroidx/compose/foundation/lazy/grid/j;", "Landroidx/compose/foundation/lazy/layout/i;", "", UCropPlusActivity.ARG_INDEX, "Lkotlin/b2;", ak.aF, "(ILandroidx/compose/runtime/p;I)V", "", "b", "e", "Landroidx/compose/foundation/lazy/grid/m;", "Landroidx/compose/foundation/lazy/grid/d;", "f", "(Landroidx/compose/foundation/lazy/grid/m;I)J", "Landroidx/compose/foundation/lazy/layout/c;", "Landroidx/compose/foundation/lazy/grid/g;", ak.av, "Landroidx/compose/foundation/lazy/layout/c;", "intervals", "", "Z", "g", "()Z", "hasCustomSpans", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "d", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "j", "()Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "spanLayoutProvider", "()I", "itemCount", "", "()Ljava/util/Map;", "keyToIndexMap", "Lfi/l;", "nearestItemsRange", "<init>", "(Landroidx/compose/foundation/lazy/layout/c;ZLfi/l;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class LazyGridItemProviderImpl implements j, androidx.compose.foundation.lazy.layout.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.foundation.lazy.layout.c<g> intervals;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean hasCustomSpans;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ androidx.compose.foundation.lazy.layout.i f6742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LazyGridSpanLayoutProvider spanLayoutProvider;

    public LazyGridItemProviderImpl(@dl.d androidx.compose.foundation.lazy.layout.c<g> intervals, boolean z10, @dl.d fi.l nearestItemsRange) {
        f0.p(intervals, "intervals");
        f0.p(nearestItemsRange, "nearestItemsRange");
        this.intervals = intervals;
        this.hasCustomSpans = z10;
        this.f6742c = androidx.compose.foundation.lazy.layout.j.b(intervals, nearestItemsRange, ComposableSingletons$LazyGridItemProviderKt.f6652a.a());
        this.spanLayoutProvider = new LazyGridSpanLayoutProvider(this);
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    public int a() {
        return this.f6742c.a();
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    @dl.e
    public Object b(int index) {
        return this.f6742c.b(index);
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    @androidx.compose.runtime.h
    public void c(final int i10, @dl.e androidx.compose.runtime.p pVar, final int i11) {
        int i12;
        androidx.compose.runtime.p pVarF = pVar.F(1355196996);
        if ((i11 & 14) == 0) {
            i12 = (pVarF.y(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= pVarF.s(this) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(1355196996, i12, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item (LazyGridItemProvider.kt:-1)");
            }
            this.f6742c.c(i10, pVarF, i12 & 14);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl$Item$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i13) {
                this.f6744b.c(i10, pVar2, i11 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    @dl.d
    public Map<Object, Integer> d() {
        return this.f6742c.d();
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    @dl.d
    public Object e(int index) {
        return this.f6742c.e(index);
    }

    @Override // androidx.compose.foundation.lazy.grid.j
    public long f(@dl.d m getSpan, int i10) {
        f0.p(getSpan, "$this$getSpan");
        androidx.compose.foundation.lazy.layout.c.a<g> aVar = this.intervals.get(i10);
        return aVar.c().b().invoke(getSpan, Integer.valueOf(i10 - aVar.getStartIndex())).getPackedValue();
    }

    @Override // androidx.compose.foundation.lazy.grid.j
    /* JADX INFO: renamed from: g, reason: from getter */
    public boolean getHasCustomSpans() {
        return this.hasCustomSpans;
    }

    @Override // androidx.compose.foundation.lazy.grid.j
    @dl.d
    /* JADX INFO: renamed from: j, reason: from getter */
    public LazyGridSpanLayoutProvider getSpanLayoutProvider() {
        return this.spanLayoutProvider;
    }
}
