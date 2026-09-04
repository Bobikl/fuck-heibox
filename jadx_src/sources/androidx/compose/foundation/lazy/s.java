package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.PinnableParentKt;
import androidx.compose.ui.layout.k1;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyListPinningModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000 \u001c2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0002:\u0001\u000bB\u0017\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0014¨\u0006 "}, d2 = {"Landroidx/compose/foundation/lazy/s;", "Landroidx/compose/ui/modifier/m;", "Landroidx/compose/foundation/lazy/layout/t;", "Landroidx/compose/ui/modifier/e;", "Landroidx/compose/ui/modifier/n;", "scope", "Lkotlin/b2;", "w1", "Landroidx/compose/foundation/lazy/layout/t$a;", ak.av, "Landroidx/compose/foundation/lazy/LazyListState;", "b", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Landroidx/compose/foundation/lazy/i;", ak.aF, "Landroidx/compose/foundation/lazy/i;", "beyondBoundsInfo", "d", "Landroidx/compose/foundation/lazy/layout/t;", "()Landroidx/compose/foundation/lazy/layout/t;", "f", "(Landroidx/compose/foundation/lazy/layout/t;)V", "pinnableGrandParent", "Landroidx/compose/ui/modifier/p;", "getKey", "()Landroidx/compose/ui/modifier/p;", "key", "e", "value", "<init>", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/lazy/i;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class s implements androidx.compose.ui.modifier.m<androidx.compose.foundation.lazy.layout.t>, androidx.compose.ui.modifier.e, androidx.compose.foundation.lazy.layout.t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final a f7180f = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LazyListState state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final i beyondBoundsInfo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.foundation.lazy.layout.t pinnableGrandParent;

    /* JADX INFO: compiled from: LazyListPinningModifier.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"androidx/compose/foundation/lazy/s$a", "Landroidx/compose/foundation/lazy/layout/t$a;", "Lkotlin/b2;", ak.av, "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements androidx.compose.foundation.lazy.layout.t.a {
        a() {
        }

        @Override // androidx.compose.foundation.lazy.layout.t.a
        public void a() {
        }
    }

    /* JADX INFO: compiled from: LazyListPinningModifier.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"androidx/compose/foundation/lazy/s$c", "Landroidx/compose/foundation/lazy/layout/t$a;", "Lkotlin/b2;", ak.av, "Landroidx/compose/foundation/lazy/layout/t$a;", ak.aF, "()Landroidx/compose/foundation/lazy/layout/t$a;", "parentPinnedItemsHandle", "Landroidx/compose/foundation/lazy/i$a;", "b", "Landroidx/compose/foundation/lazy/i$a;", "()Landroidx/compose/foundation/lazy/i$a;", ak.aT, "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class c implements androidx.compose.foundation.lazy.layout.t.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private final androidx.compose.foundation.lazy.layout.t.a parentPinnedItemsHandle;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final i.Interval interval;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ i f7187d;

        c(i iVar) {
            this.f7187d = iVar;
            androidx.compose.foundation.lazy.layout.t pinnableGrandParent = s.this.getPinnableGrandParent();
            this.parentPinnedItemsHandle = pinnableGrandParent != null ? pinnableGrandParent.a() : null;
            this.interval = iVar.a(iVar.c(), iVar.b());
        }

        @Override // androidx.compose.foundation.lazy.layout.t.a
        public void a() {
            this.f7187d.e(this.interval);
            androidx.compose.foundation.lazy.layout.t.a aVar = this.parentPinnedItemsHandle;
            if (aVar != null) {
                aVar.a();
            }
            k1 k1VarW = s.this.state.w();
            if (k1VarW != null) {
                k1VarW.d();
            }
        }

        @dl.d
        /* JADX INFO: renamed from: b, reason: from getter */
        public final i.Interval getInterval() {
            return this.interval;
        }

        @dl.e
        /* JADX INFO: renamed from: c, reason: from getter */
        public final androidx.compose.foundation.lazy.layout.t.a getParentPinnedItemsHandle() {
            return this.parentPinnedItemsHandle;
        }
    }

    public s(@dl.d LazyListState state, @dl.d i beyondBoundsInfo) {
        f0.p(state, "state");
        f0.p(beyondBoundsInfo, "beyondBoundsInfo");
        this.state = state;
        this.beyondBoundsInfo = beyondBoundsInfo;
    }

    @Override // androidx.compose.foundation.lazy.layout.t
    @dl.d
    public androidx.compose.foundation.lazy.layout.t.a a() {
        androidx.compose.foundation.lazy.layout.t.a aVarA;
        i iVar = this.beyondBoundsInfo;
        if (iVar.d()) {
            return new c(iVar);
        }
        androidx.compose.foundation.lazy.layout.t tVar = this.pinnableGrandParent;
        return (tVar == null || (aVarA = tVar.a()) == null) ? f7180f : aVarA;
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    @dl.e
    /* JADX INFO: renamed from: d, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.t getPinnableGrandParent() {
        return this.pinnableGrandParent;
    }

    @Override // androidx.compose.ui.modifier.m
    @dl.d
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.lazy.layout.t getValue() {
        return this;
    }

    public final void f(@dl.e androidx.compose.foundation.lazy.layout.t tVar) {
        this.pinnableGrandParent = tVar;
    }

    @Override // androidx.compose.ui.modifier.m
    @dl.d
    public androidx.compose.ui.modifier.p<androidx.compose.foundation.lazy.layout.t> getKey() {
        return PinnableParentKt.a();
    }

    @Override // androidx.compose.ui.n
    public /* synthetic */ androidx.compose.ui.n s0(androidx.compose.ui.n nVar) {
        return androidx.compose.ui.m.a(this, nVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean t(yh.l lVar) {
        return androidx.compose.ui.o.b(this, lVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object v(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.d(this, obj, pVar);
    }

    @Override // androidx.compose.ui.modifier.e
    public void w1(@dl.d androidx.compose.ui.modifier.n scope) {
        f0.p(scope, "scope");
        this.pinnableGrandParent = (androidx.compose.foundation.lazy.layout.t) scope.a(PinnableParentKt.a());
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.c(this, obj, pVar);
    }
}
