package androidx.compose.foundation.lazy;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.u1;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyListItemProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.t
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u0011\u0010\n\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\u0016R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00188VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006#"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListItemProviderImpl;", "Landroidx/compose/foundation/lazy/o;", "Landroidx/compose/foundation/lazy/layout/i;", "", UCropPlusActivity.ARG_INDEX, "Lkotlin/b2;", ak.aF, "(ILandroidx/compose/runtime/p;I)V", "", "b", "e", "", ak.av, "Ljava/util/List;", "i", "()Ljava/util/List;", "headerIndexes", "Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "itemScope", "()I", "itemCount", "", "d", "()Ljava/util/Map;", "keyToIndexMap", "Landroidx/compose/foundation/lazy/layout/c;", "Landroidx/compose/foundation/lazy/l;", "intervals", "Lfi/l;", "nearestItemsRange", "<init>", "(Landroidx/compose/foundation/lazy/layout/c;Lfi/l;Ljava/util/List;Landroidx/compose/foundation/lazy/LazyItemScopeImpl;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class LazyListItemProviderImpl implements o, androidx.compose.foundation.lazy.layout.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<Integer> headerIndexes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LazyItemScopeImpl itemScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ androidx.compose.foundation.lazy.layout.i f6513c;

    public LazyListItemProviderImpl(@dl.d androidx.compose.foundation.lazy.layout.c<l> intervals, @dl.d fi.l nearestItemsRange, @dl.d List<Integer> headerIndexes, @dl.d final LazyItemScopeImpl itemScope) {
        f0.p(intervals, "intervals");
        f0.p(nearestItemsRange, "nearestItemsRange");
        f0.p(headerIndexes, "headerIndexes");
        f0.p(itemScope, "itemScope");
        this.headerIndexes = headerIndexes;
        this.itemScope = itemScope;
        this.f6513c = androidx.compose.foundation.lazy.layout.j.b(intervals, nearestItemsRange, androidx.compose.runtime.internal.b.c(-1230121334, true, new yh.r<l, Integer, androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderImpl.1
            {
                super(4);
            }

            @Override // yh.r
            public /* bridge */ /* synthetic */ b2 U0(l lVar, Integer num, androidx.compose.runtime.p pVar, Integer num2) {
                a(lVar, num.intValue(), pVar, num2.intValue());
                return b2.f124493a;
            }

            @androidx.compose.runtime.h
            public final void a(@dl.d l interval, int i10, @dl.e androidx.compose.runtime.p pVar, int i11) {
                int i12;
                f0.p(interval, "interval");
                if ((i11 & 14) == 0) {
                    i12 = (pVar.s(interval) ? 4 : 2) | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 112) == 0) {
                    i12 |= pVar.y(i10) ? 32 : 16;
                }
                if ((i12 & bb.c.b.f30586db) == 146 && pVar.b()) {
                    pVar.l();
                    return;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1230121334, i12, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.$$delegate_0.<anonymous> (LazyListItemProvider.kt:78)");
                }
                interval.a().U0(itemScope, Integer.valueOf(i10), pVar, Integer.valueOf(i12 & 112));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }
        }));
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    public int a() {
        return this.f6513c.a();
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    @dl.e
    public Object b(int index) {
        return this.f6513c.b(index);
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    @androidx.compose.runtime.h
    public void c(final int i10, @dl.e androidx.compose.runtime.p pVar, final int i11) {
        int i12;
        androidx.compose.runtime.p pVarF = pVar.F(-1645068522);
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
                ComposerKt.w0(-1645068522, i12, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:-1)");
            }
            this.f6513c.c(i10, pVarF, i12 & 14);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderImpl$Item$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i13) {
                this.f6515b.c(i10, pVar2, i11 | 1);
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
        return this.f6513c.d();
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    @dl.d
    public Object e(int index) {
        return this.f6513c.e(index);
    }

    @Override // androidx.compose.foundation.lazy.o
    @dl.d
    /* JADX INFO: renamed from: h, reason: from getter */
    public LazyItemScopeImpl getItemScope() {
        return this.itemScope;
    }

    @Override // androidx.compose.foundation.lazy.o
    @dl.d
    public List<Integer> i() {
        return this.headerIndexes;
    }
}
