package androidx.compose.foundation;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.j2;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.u0;
import androidx.compose.ui.platform.x0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Focusable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u001a\f\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0007\u001a\u001e\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0000\u001a\"\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\bH\u0003\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/n;", "", "enabled", "Landroidx/compose/foundation/interaction/g;", "interactionSource", ak.aF, "b", "e", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/layout/t;", "Lkotlin/b2;", "onPinnableParentAvailable", "f", "Landroidx/compose/ui/platform/u0;", ak.av, "Landroidx/compose/ui/platform/u0;", "focusGroupInspectorInfo", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class FocusableKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final u0 f4858a;

    static {
        f4858a = new u0(InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.foundation.FocusableKt$special$$inlined$debugInspectorInfo$1
            public final void a(@dl.d x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("focusGroup");
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b());
    }

    @t
    @dl.d
    public static final androidx.compose.ui.n b(@dl.d androidx.compose.ui.n nVar) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        return FocusModifierKt.b(FocusPropertiesKt.b(nVar.s0(f4858a), new yh.l<androidx.compose.ui.focus.p, b2>() { // from class: androidx.compose.foundation.FocusableKt$focusGroup$1
            public final void a(@dl.d androidx.compose.ui.focus.p focusProperties) {
                kotlin.jvm.internal.f0.p(focusProperties, "$this$focusProperties");
                focusProperties.L(false);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.focus.p pVar) {
                a(pVar);
                return b2.f124493a;
            }
        }));
    }

    @dl.d
    public static final androidx.compose.ui.n c(@dl.d androidx.compose.ui.n nVar, final boolean z10, @dl.e final androidx.compose.foundation.interaction.g gVar) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.foundation.FocusableKt$focusable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("focusable");
                x0Var.getProperties().c("enabled", Boolean.valueOf(z10));
                x0Var.getProperties().c("interactionSource", gVar);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new FocusableKt$focusable$2(gVar, z10));
    }

    public static /* synthetic */ androidx.compose.ui.n d(androidx.compose.ui.n nVar, boolean z10, androidx.compose.foundation.interaction.g gVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            gVar = null;
        }
        return c(nVar, z10, gVar);
    }

    @dl.d
    public static final androidx.compose.ui.n e(@dl.d androidx.compose.ui.n nVar, final boolean z10, @dl.e final androidx.compose.foundation.interaction.g gVar) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.foundation.FocusableKt$focusableInNonTouchMode$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("focusableInNonTouchMode");
                x0Var.getProperties().c("enabled", Boolean.valueOf(z10));
                x0Var.getProperties().c("interactionSource", gVar);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.FocusableKt$focusableInNonTouchMode$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(-618949501);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-618949501, i10, -1, "androidx.compose.foundation.focusableInNonTouchMode.<anonymous> (Focusable.kt:217)");
                }
                final e1.b bVar = (e1.b) pVar.K(CompositionLocalsKt.o());
                androidx.compose.ui.n nVarC = FocusableKt.c(FocusPropertiesKt.b(androidx.compose.ui.n.INSTANCE, new yh.l<androidx.compose.ui.focus.p, b2>() { // from class: androidx.compose.foundation.FocusableKt$focusableInNonTouchMode$2.1
                    {
                        super(1);
                    }

                    public final void a(@dl.d androidx.compose.ui.focus.p focusProperties) {
                        kotlin.jvm.internal.f0.p(focusProperties, "$this$focusProperties");
                        focusProperties.L(!e1.a.f(bVar.b(), e1.a.f118531b.b()));
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.focus.p pVar2) {
                        a(pVar2);
                        return b2.f124493a;
                    }
                }), z10, gVar);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return nVarC;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @t
    @j2
    public static final androidx.compose.ui.n f(androidx.compose.ui.n nVar, final yh.l<? super androidx.compose.foundation.lazy.layout.t, b2> lVar) {
        return InspectableValueKt.d(nVar, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.foundation.FocusableKt$onPinnableParentAvailable$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("onPinnableParentAvailable");
                x0Var.getProperties().c("onPinnableParentAvailable", lVar);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), androidx.compose.ui.n.INSTANCE.s0(new h0(lVar)));
    }
}
