package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyNearestItemsRangeKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.m2;
import com.umeng.analytics.pro.ak;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyStaggeredGridItemProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/o;", "Lkotlin/b2;", "Lkotlin/t;", "content", "Landroidx/compose/foundation/lazy/layout/i;", ak.av, "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Lyh/l;Landroidx/compose/runtime/p;I)Landroidx/compose/foundation/lazy/layout/i;", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class LazyStaggeredGridItemProviderKt {

    /* JADX INFO: compiled from: LazyStaggeredGridItemProvider.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a implements androidx.compose.foundation.lazy.layout.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ androidx.compose.foundation.lazy.layout.i f7247a;

        a(m2<? extends androidx.compose.foundation.lazy.layout.i> m2Var) {
            this.f7247a = androidx.compose.foundation.lazy.layout.j.a(m2Var);
        }

        @Override // androidx.compose.foundation.lazy.layout.i
        public int a() {
            return this.f7247a.a();
        }

        @Override // androidx.compose.foundation.lazy.layout.i
        @dl.e
        public Object b(int i10) {
            return this.f7247a.b(i10);
        }

        @Override // androidx.compose.foundation.lazy.layout.i
        @androidx.compose.runtime.h
        public void c(int i10, @dl.e androidx.compose.runtime.p pVar, int i11) {
            pVar.T(-1058165788);
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1058165788, i11, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProvider.<anonymous>.<no name provided>.Item (LazyStaggeredGridItemProvider.kt:-1)");
            }
            this.f7247a.c(i10, pVar, i11 & 14);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVar.c0();
        }

        @Override // androidx.compose.foundation.lazy.layout.i
        @dl.d
        public Map<Object, Integer> d() {
            return this.f7247a.d();
        }

        @Override // androidx.compose.foundation.lazy.layout.i
        @dl.d
        public Object e(int i10) {
            return this.f7247a.e(i10);
        }
    }

    @androidx.compose.foundation.t
    @dl.d
    @androidx.compose.runtime.h
    public static final androidx.compose.foundation.lazy.layout.i a(@dl.d final LazyStaggeredGridState state, @dl.d yh.l<? super o, b2> content, @dl.e androidx.compose.runtime.p pVar, int i10) {
        f0.p(state, "state");
        f0.p(content, "content");
        pVar.T(290499291);
        if (ComposerKt.g0()) {
            ComposerKt.w0(290499291, i10, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProvider (LazyStaggeredGridItemProvider.kt:29)");
        }
        final m2 m2VarT = e2.t(content, pVar, (i10 >> 3) & 14);
        final m2<fi.l> m2VarC = LazyNearestItemsRangeKt.c(new yh.a<Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$nearestItemsRangeState$1
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke() {
                return Integer.valueOf(state.p());
            }
        }, new yh.a<Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$nearestItemsRangeState$2
            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke() {
                return 90;
            }
        }, new yh.a<Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$nearestItemsRangeState$3
            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke() {
                return 200;
            }
        }, pVar, bb.c.b.f30879q5);
        pVar.T(1157296644);
        boolean zS = pVar.s(state);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = new a(e2.d(new yh.a<androidx.compose.foundation.lazy.layout.i>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$1$itemProviderState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // yh.a
                @androidx.compose.runtime.j(index = 0)
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final androidx.compose.foundation.lazy.layout.i invoke() {
                    LazyStaggeredGridScopeImpl lazyStaggeredGridScopeImpl = new LazyStaggeredGridScopeImpl();
                    m2VarT.getValue().invoke(lazyStaggeredGridScopeImpl);
                    return androidx.compose.foundation.lazy.layout.j.b(lazyStaggeredGridScopeImpl.c(), m2VarC.getValue(), ComposableSingletons$LazyStaggeredGridItemProviderKt.f7188a.a());
                }
            }));
            pVar.N(objU);
        }
        pVar.c0();
        a aVar = (a) objU;
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return aVar;
    }
}
