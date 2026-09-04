package androidx.compose.ui.focus;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FocusRequesterModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0012\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\"\"\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/n;", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", ak.av, "Landroidx/compose/ui/modifier/p;", "Landroidx/compose/ui/focus/u;", "Landroidx/compose/ui/modifier/p;", "b", "()Landroidx/compose/ui/modifier/p;", "ModifierLocalFocusRequester", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class FocusRequesterModifierKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.ui.modifier.p<u> f13551a = androidx.compose.ui.modifier.g.a(new yh.a<u>() { // from class: androidx.compose.ui.focus.FocusRequesterModifierKt$ModifierLocalFocusRequester$1
        @Override // yh.a
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u invoke() {
            return null;
        }
    });

    @dl.d
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, @dl.d final FocusRequester focusRequester) {
        f0.p(nVar, "<this>");
        f0.p(focusRequester, "focusRequester");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.ui.focus.FocusRequesterModifierKt$focusRequester$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                f0.p(x0Var, "$this$null");
                x0Var.d("focusRequester");
                x0Var.getProperties().c("focusRequester", focusRequester);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.ui.focus.FocusRequesterModifierKt$focusRequester$2
            {
                super(3);
            }

            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                f0.p(composed, "$this$composed");
                pVar.T(-307396750);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-307396750, i10, -1, "androidx.compose.ui.focus.focusRequester.<anonymous> (FocusRequesterModifier.kt:134)");
                }
                FocusRequester focusRequester2 = focusRequester;
                int i11 = androidx.compose.runtime.collection.e.f12643e;
                pVar.T(1157296644);
                boolean zS = pVar.s(focusRequester2);
                Object objU = pVar.U();
                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new u(focusRequester2);
                    pVar.N(objU);
                }
                pVar.c0();
                u uVar = (u) objU;
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return uVar;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }

    @dl.d
    public static final androidx.compose.ui.modifier.p<u> b() {
        return f13551a;
    }
}
