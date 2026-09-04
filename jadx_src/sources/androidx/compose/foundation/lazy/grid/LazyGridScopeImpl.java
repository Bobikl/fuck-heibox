package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.ComposerKt;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyGridScopeImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b&\u0010'J_\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0019\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0002\b\f¢\u0006\u0002\b\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ¸\u0001\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102#\u0010\u0003\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u001f\u0010\b\u001a\u001b\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0015¢\u0006\u0002\b\u00072#\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000421\u0010\u0016\u001a-\u0012\u0004\u0012\u00020\n\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u000b0\u0015¢\u0006\u0002\b\f¢\u0006\u0002\b\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010%\u001a\u00020\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridScopeImpl;", "Landroidx/compose/foundation/lazy/grid/s;", "", "key", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/m;", "Landroidx/compose/foundation/lazy/grid/d;", "Lkotlin/t;", com.google.android.exoplayer2.text.ttml.d.f49805s, "contentType", "Landroidx/compose/foundation/lazy/grid/l;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "content", "b", "(Ljava/lang/Object;Lyh/l;Ljava/lang/Object;Lyh/q;)V", "", "count", "Lkotlin/m0;", "name", UCropPlusActivity.ARG_INDEX, "Lkotlin/Function2;", "itemContent", ak.av, "(ILyh/l;Lyh/p;Lyh/l;Lyh/r;)V", "Landroidx/compose/foundation/lazy/layout/s;", "Landroidx/compose/foundation/lazy/grid/g;", "Landroidx/compose/foundation/lazy/layout/s;", "d", "()Landroidx/compose/foundation/lazy/layout/s;", "intervals", "", "Z", ak.aF, "()Z", "e", "(Z)V", "hasCustomSpans", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class LazyGridScopeImpl implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean hasCustomSpans;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.foundation.lazy.layout.s<g> intervals = new androidx.compose.foundation.lazy.layout.s<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final yh.p<m, Integer, d> f6807c = new yh.p<m, Integer, d>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScopeImpl$DefaultSpan$1
        public final long a(@dl.d m mVar, int i10) {
            f0.p(mVar, "$this$null");
            return v.a(1);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ d invoke(m mVar, Integer num) {
            return d.a(a(mVar, num.intValue()));
        }
    };

    @Override // androidx.compose.foundation.lazy.grid.s
    public void a(int count, @dl.e yh.l<? super Integer, ? extends Object> key, @dl.e yh.p<? super m, ? super Integer, d> span, @dl.d yh.l<? super Integer, ? extends Object> contentType, @dl.d yh.r<? super l, ? super Integer, ? super androidx.compose.runtime.p, ? super Integer, b2> itemContent) {
        f0.p(contentType, "contentType");
        f0.p(itemContent, "itemContent");
        this.intervals.c(count, new g(key, span == null ? this.f6807c : span, contentType, itemContent));
        if (span != null) {
            this.hasCustomSpans = true;
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.s
    public void b(@dl.e final Object key, @dl.e final yh.l<? super m, d> span, @dl.e final Object contentType, @dl.d final yh.q<? super l, ? super androidx.compose.runtime.p, ? super Integer, b2> content) {
        f0.p(content, "content");
        this.intervals.c(1, new g(key != null ? new yh.l<Integer, Object>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScopeImpl$item$1$1
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
        } : null, span != null ? new yh.p<m, Integer, d>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScopeImpl$item$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final long a(@dl.d m mVar, int i10) {
                f0.p(mVar, "$this$null");
                return span.invoke(mVar).getPackedValue();
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ d invoke(m mVar, Integer num) {
                return d.a(a(mVar, num.intValue()));
            }
        } : this.f6807c, new yh.l<Integer, Object>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScopeImpl$item$3
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
        }, androidx.compose.runtime.internal.b.c(-1504808184, true, new yh.r<l, Integer, androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScopeImpl$item$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            @Override // yh.r
            public /* bridge */ /* synthetic */ b2 U0(l lVar, Integer num, androidx.compose.runtime.p pVar, Integer num2) {
                a(lVar, num.intValue(), pVar, num2.intValue());
                return b2.f124493a;
            }

            @androidx.compose.runtime.h
            public final void a(@dl.d l $receiver, int i10, @dl.e androidx.compose.runtime.p pVar, int i11) {
                f0.p($receiver, "$this$$receiver");
                if ((i11 & 14) == 0) {
                    i11 |= pVar.s($receiver) ? 4 : 2;
                }
                if ((i11 & bb.c.b.B9) == 130 && pVar.b()) {
                    pVar.l();
                    return;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1504808184, i11, -1, "androidx.compose.foundation.lazy.grid.LazyGridScopeImpl.item.<anonymous> (LazyGridScopeImpl.kt:42)");
                }
                content.invoke($receiver, pVar, Integer.valueOf(i11 & 14));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }
        })));
        if (span != null) {
            this.hasCustomSpans = true;
        }
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getHasCustomSpans() {
        return this.hasCustomSpans;
    }

    @dl.d
    public final androidx.compose.foundation.lazy.layout.s<g> d() {
        return this.intervals;
    }

    public final void e(boolean z10) {
        this.hasCustomSpans = z10;
    }
}
