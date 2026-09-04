package androidx.compose.foundation;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: FocusedBounds.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\"\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0007\"6\u0010\f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00068\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\u0007\u0010\t¨\u0006\r"}, d2 = {"Landroidx/compose/ui/n;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/q;", "Lkotlin/b2;", "onPositioned", ak.aF, "Landroidx/compose/ui/modifier/p;", ak.av, "Landroidx/compose/ui/modifier/p;", "()Landroidx/compose/ui/modifier/p;", "getModifierLocalFocusedBoundsObserver$annotations", "()V", "ModifierLocalFocusedBoundsObserver", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class FocusedBoundsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.ui.modifier.p<yh.l<androidx.compose.ui.layout.q, b2>> f4905a = androidx.compose.ui.modifier.g.a(new yh.a<yh.l<? super androidx.compose.ui.layout.q, ? extends b2>>() { // from class: androidx.compose.foundation.FocusedBoundsKt$ModifierLocalFocusedBoundsObserver$1
        @Override // yh.a
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final yh.l<androidx.compose.ui.layout.q, b2> invoke() {
            return null;
        }
    });

    @dl.d
    public static final androidx.compose.ui.modifier.p<yh.l<androidx.compose.ui.layout.q, b2>> a() {
        return f4905a;
    }

    public static /* synthetic */ void b() {
    }

    @t
    @dl.d
    public static final androidx.compose.ui.n c(@dl.d androidx.compose.ui.n nVar, @dl.d final yh.l<? super androidx.compose.ui.layout.q, b2> onPositioned) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(onPositioned, "onPositioned");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.foundation.FocusedBoundsKt$onFocusedBoundsChanged$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("onFocusedBoundsChanged");
                x0Var.getProperties().c("onPositioned", onPositioned);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.FocusedBoundsKt$onFocusedBoundsChanged$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(1176407768);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1176407768, i10, -1, "androidx.compose.foundation.onFocusedBoundsChanged.<anonymous> (FocusedBounds.kt:53)");
                }
                yh.l<androidx.compose.ui.layout.q, b2> lVar = onPositioned;
                pVar.T(1157296644);
                boolean zS = pVar.s(lVar);
                Object objU = pVar.U();
                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new v(lVar);
                    pVar.N(objU);
                }
                pVar.c0();
                v vVar = (v) objU;
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return vVar;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }
}
