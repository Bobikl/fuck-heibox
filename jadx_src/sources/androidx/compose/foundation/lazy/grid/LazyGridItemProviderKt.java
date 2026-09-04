package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyNearestItemsRangeKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.m2;
import com.umeng.analytics.pro.ak;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyGridItemProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a0\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u000b\"\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/s;", "Lkotlin/b2;", "Lkotlin/t;", "content", "Landroidx/compose/foundation/lazy/grid/j;", ak.av, "(Landroidx/compose/foundation/lazy/grid/LazyGridState;Lyh/l;Landroidx/compose/runtime/p;I)Landroidx/compose/foundation/lazy/grid/j;", "", "I", "NearestItemsSlidingWindowSize", "b", "NearestItemsExtraItemCount", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class LazyGridItemProviderKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f6747a = 90;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f6748b = 200;

    /* JADX INFO: compiled from: LazyGridItemProvider.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a implements j, androidx.compose.foundation.lazy.layout.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ androidx.compose.foundation.lazy.layout.i f6749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m2<j> f6750b;

        /* JADX WARN: Multi-variable type inference failed */
        a(m2<? extends j> m2Var) {
            this.f6750b = m2Var;
            this.f6749a = androidx.compose.foundation.lazy.layout.j.a(m2Var);
        }

        @Override // androidx.compose.foundation.lazy.layout.i
        public int a() {
            return this.f6749a.a();
        }

        @Override // androidx.compose.foundation.lazy.layout.i
        @dl.e
        public Object b(int i10) {
            return this.f6749a.b(i10);
        }

        @Override // androidx.compose.foundation.lazy.layout.i
        @androidx.compose.runtime.h
        public void c(int i10, @dl.e androidx.compose.runtime.p pVar, int i11) {
            pVar.T(125380152);
            if (ComposerKt.g0()) {
                ComposerKt.w0(125380152, i11, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridItemProvider.<anonymous>.<no name provided>.Item (LazyGridItemProvider.kt:-1)");
            }
            this.f6749a.c(i10, pVar, i11 & 14);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVar.c0();
        }

        @Override // androidx.compose.foundation.lazy.layout.i
        @dl.d
        public Map<Object, Integer> d() {
            return this.f6749a.d();
        }

        @Override // androidx.compose.foundation.lazy.layout.i
        @dl.d
        public Object e(int i10) {
            return this.f6749a.e(i10);
        }

        @Override // androidx.compose.foundation.lazy.grid.j
        public long f(@dl.d m getSpan, int i10) {
            f0.p(getSpan, "$this$getSpan");
            return this.f6750b.getValue().f(getSpan, i10);
        }

        @Override // androidx.compose.foundation.lazy.grid.j
        /* JADX INFO: renamed from: g */
        public boolean getHasCustomSpans() {
            return this.f6750b.getValue().getHasCustomSpans();
        }

        @Override // androidx.compose.foundation.lazy.grid.j
        @dl.d
        /* JADX INFO: renamed from: j */
        public LazyGridSpanLayoutProvider getSpanLayoutProvider() {
            return this.f6750b.getValue().getSpanLayoutProvider();
        }
    }

    @androidx.compose.foundation.t
    @dl.d
    @androidx.compose.runtime.h
    public static final j a(@dl.d final LazyGridState state, @dl.d yh.l<? super s, b2> content, @dl.e androidx.compose.runtime.p pVar, int i10) {
        f0.p(state, "state");
        f0.p(content, "content");
        pVar.T(1831211759);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1831211759, i10, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridItemProvider (LazyGridItemProvider.kt:39)");
        }
        final m2 m2VarT = e2.t(content, pVar, (i10 >> 3) & 14);
        pVar.T(1157296644);
        boolean zS = pVar.s(state);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = new yh.a<Integer>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt$rememberLazyGridItemProvider$nearestItemsRangeState$1$1
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Integer invoke() {
                    return Integer.valueOf(state.m());
                }
            };
            pVar.N(objU);
        }
        pVar.c0();
        final m2<fi.l> m2VarC = LazyNearestItemsRangeKt.c((yh.a) objU, new yh.a<Integer>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt$rememberLazyGridItemProvider$nearestItemsRangeState$2
            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke() {
                return 90;
            }
        }, new yh.a<Integer>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt$rememberLazyGridItemProvider$nearestItemsRangeState$3
            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke() {
                return 200;
            }
        }, pVar, bb.c.b.f30879q5);
        pVar.T(1157296644);
        boolean zS2 = pVar.s(m2VarC);
        Object objU2 = pVar.U();
        if (zS2 || objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
            objU2 = new a(e2.d(new yh.a<LazyGridItemProviderImpl>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt$rememberLazyGridItemProvider$1$itemProviderState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final LazyGridItemProviderImpl invoke() {
                    LazyGridScopeImpl lazyGridScopeImpl = new LazyGridScopeImpl();
                    m2VarT.getValue().invoke(lazyGridScopeImpl);
                    return new LazyGridItemProviderImpl(lazyGridScopeImpl.d(), lazyGridScopeImpl.getHasCustomSpans(), m2VarC.getValue());
                }
            }));
            pVar.N(objU2);
        }
        pVar.c0();
        a aVar = (a) objU2;
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return aVar;
    }
}
