package androidx.compose.foundation.lazy;

import androidx.compose.runtime.ComposerKt;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyListScopeImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\u0094\u0001\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022#\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042#\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000421\u0010\u0010\u001a-\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JA\u0010\u0014\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015JA\u0010\u0016\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0017¢\u0006\u0004\b\u0016\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScopeImpl;", "Landroidx/compose/foundation/lazy/w;", "", "count", "Lkotlin/Function1;", "Lkotlin/m0;", "name", UCropPlusActivity.ARG_INDEX, "", "key", "contentType", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/g;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "Lkotlin/t;", "itemContent", "b", "(ILyh/l;Lyh/l;Lyh/r;)V", "content", ak.av, "(Ljava/lang/Object;Ljava/lang/Object;Lyh/q;)V", "d", "Landroidx/compose/foundation/lazy/layout/s;", "Landroidx/compose/foundation/lazy/l;", "Landroidx/compose/foundation/lazy/layout/s;", "_intervals", "Landroidx/compose/foundation/lazy/layout/c;", "Landroidx/compose/foundation/lazy/layout/c;", "g", "()Landroidx/compose/foundation/lazy/layout/c;", "intervals", "", ak.aF, "Ljava/util/List;", "_headerIndexes", "", "f", "()Ljava/util/List;", "headerIndexes", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class LazyListScopeImpl implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.foundation.lazy.layout.s<l> _intervals;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.foundation.lazy.layout.c<l> intervals;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private List<Integer> _headerIndexes;

    public LazyListScopeImpl() {
        androidx.compose.foundation.lazy.layout.s<l> sVar = new androidx.compose.foundation.lazy.layout.s<>();
        this._intervals = sVar;
        this.intervals = sVar;
    }

    @Override // androidx.compose.foundation.lazy.w
    public void a(@dl.e final Object key, @dl.e final Object contentType, @dl.d final yh.q<? super g, ? super androidx.compose.runtime.p, ? super Integer, b2> content) {
        f0.p(content, "content");
        this._intervals.c(1, new l(key != null ? new yh.l<Integer, Object>() { // from class: androidx.compose.foundation.lazy.LazyListScopeImpl$item$1
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
        } : null, new yh.l<Integer, Object>() { // from class: androidx.compose.foundation.lazy.LazyListScopeImpl$item$2
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
        }, androidx.compose.runtime.internal.b.c(-735119482, true, new yh.r<g, Integer, androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.LazyListScopeImpl$item$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            @Override // yh.r
            public /* bridge */ /* synthetic */ b2 U0(g gVar, Integer num, androidx.compose.runtime.p pVar, Integer num2) {
                a(gVar, num.intValue(), pVar, num2.intValue());
                return b2.f124493a;
            }

            @androidx.compose.runtime.h
            public final void a(@dl.d g $receiver, int i10, @dl.e androidx.compose.runtime.p pVar, int i11) {
                f0.p($receiver, "$this$$receiver");
                if ((i11 & 14) == 0) {
                    i11 |= pVar.s($receiver) ? 4 : 2;
                }
                if ((i11 & bb.c.b.B9) == 130 && pVar.b()) {
                    pVar.l();
                    return;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-735119482, i11, -1, "androidx.compose.foundation.lazy.LazyListScopeImpl.item.<anonymous> (LazyListScopeImpl.kt:55)");
                }
                content.invoke($receiver, pVar, Integer.valueOf(i11 & 14));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }
        })));
    }

    @Override // androidx.compose.foundation.lazy.w
    public void b(int count, @dl.e yh.l<? super Integer, ? extends Object> key, @dl.d yh.l<? super Integer, ? extends Object> contentType, @dl.d yh.r<? super g, ? super Integer, ? super androidx.compose.runtime.p, ? super Integer, b2> itemContent) {
        f0.p(contentType, "contentType");
        f0.p(itemContent, "itemContent");
        this._intervals.c(count, new l(key, contentType, itemContent));
    }

    @Override // androidx.compose.foundation.lazy.w
    public /* synthetic */ void c(Object obj, yh.q qVar) {
        LazyListScope$CC.b(this, obj, qVar);
    }

    @Override // androidx.compose.foundation.lazy.w
    @androidx.compose.foundation.t
    public void d(@dl.e Object key, @dl.e Object contentType, @dl.d yh.q<? super g, ? super androidx.compose.runtime.p, ? super Integer, b2> content) {
        f0.p(content, "content");
        List arrayList = this._headerIndexes;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this._headerIndexes = arrayList;
        }
        arrayList.add(Integer.valueOf(this._intervals.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String()));
        a(key, contentType, content);
    }

    @Override // androidx.compose.foundation.lazy.w
    public /* synthetic */ void e(int i10, yh.l lVar, yh.r rVar) {
        LazyListScope$CC.d(this, i10, lVar, rVar);
    }

    @dl.d
    public final List<Integer> f() {
        List<Integer> list = this._headerIndexes;
        return list == null ? CollectionsKt__CollectionsKt.E() : list;
    }

    @dl.d
    public final androidx.compose.foundation.lazy.layout.c<l> g() {
        return this.intervals;
    }
}
