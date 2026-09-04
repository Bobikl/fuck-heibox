package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.ComposerKt;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyStaggeredGridScope.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.t
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJA\u0010\u000b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0002\b\tH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0094\u0001\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2#\u0010\u0003\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052#\u0010\u0004\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000521\u0010\u0013\u001a-\u0012\u0004\u0012\u00020\u0006\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00070\u0012¢\u0006\u0002\b\b¢\u0006\u0002\b\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScopeImpl;", "Landroidx/compose/foundation/lazy/staggeredgrid/o;", "", "key", "contentType", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/f;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "Lkotlin/t;", "content", ak.av, "(Ljava/lang/Object;Ljava/lang/Object;Lyh/q;)V", "", "count", "Lkotlin/m0;", "name", UCropPlusActivity.ARG_INDEX, "Lkotlin/Function2;", "itemContent", "b", "(ILyh/l;Lyh/l;Lyh/r;)V", "Landroidx/compose/foundation/lazy/layout/s;", "Landroidx/compose/foundation/lazy/staggeredgrid/d;", "Landroidx/compose/foundation/lazy/layout/s;", ak.aF, "()Landroidx/compose/foundation/lazy/layout/s;", "intervals", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class LazyStaggeredGridScopeImpl implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.foundation.lazy.layout.s<d> intervals = new androidx.compose.foundation.lazy.layout.s<>();

    @Override // androidx.compose.foundation.lazy.staggeredgrid.o
    @androidx.compose.foundation.t
    public void a(@dl.e final Object key, @dl.e final Object contentType, @dl.d final yh.q<? super f, ? super androidx.compose.runtime.p, ? super Integer, b2> content) {
        f0.p(content, "content");
        b(1, key != null ? new yh.l<Integer, Object>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScopeImpl$item$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @dl.d
            public final Object a(int i10) {
                return key;
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        } : null, new yh.l<Integer, Object>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScopeImpl$item$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @dl.e
            public final Object a(int i10) {
                return contentType;
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }, androidx.compose.runtime.internal.b.c(2037756640, true, new yh.r<f, Integer, androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScopeImpl$item$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            @Override // yh.r
            public /* bridge */ /* synthetic */ b2 U0(f fVar, Integer num, androidx.compose.runtime.p pVar, Integer num2) {
                a(fVar, num.intValue(), pVar, num2.intValue());
                return b2.f124493a;
            }

            @androidx.compose.runtime.h
            public final void a(@dl.d f items, int i10, @dl.e androidx.compose.runtime.p pVar, int i11) {
                f0.p(items, "$this$items");
                if ((i11 & 14) == 0) {
                    i11 |= pVar.s(items) ? 4 : 2;
                }
                if ((i11 & bb.c.b.B9) == 130 && pVar.b()) {
                    pVar.l();
                    return;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(2037756640, i11, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScopeImpl.item.<anonymous> (LazyStaggeredGridScope.kt:37)");
                }
                content.invoke(items, pVar, Integer.valueOf(i11 & 14));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }
        }));
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.o
    public void b(int count, @dl.e yh.l<? super Integer, ? extends Object> key, @dl.d yh.l<? super Integer, ? extends Object> contentType, @dl.d yh.r<? super f, ? super Integer, ? super androidx.compose.runtime.p, ? super Integer, b2> itemContent) {
        f0.p(contentType, "contentType");
        f0.p(itemContent, "itemContent");
        this.intervals.c(count, new d(key, contentType, itemContent));
    }

    @dl.d
    public final androidx.compose.foundation.lazy.layout.s<d> c() {
        return this.intervals;
    }
}
