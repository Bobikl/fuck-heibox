package androidx.compose.ui.focus;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FocusEventModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\"\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/n;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/v;", "Lkotlin/b2;", "onFocusEvent", "b", "Landroidx/compose/ui/modifier/p;", "Landroidx/compose/ui/focus/e;", ak.av, "Landroidx/compose/ui/modifier/p;", "()Landroidx/compose/ui/modifier/p;", "ModifierLocalFocusEvent", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class FocusEventModifierKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.ui.modifier.p<e> f13486a = androidx.compose.ui.modifier.g.a(new yh.a<e>() { // from class: androidx.compose.ui.focus.FocusEventModifierKt$ModifierLocalFocusEvent$1
        @Override // yh.a
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e invoke() {
            return null;
        }
    });

    @dl.d
    public static final androidx.compose.ui.modifier.p<e> a() {
        return f13486a;
    }

    @dl.d
    public static final androidx.compose.ui.n b(@dl.d androidx.compose.ui.n nVar, @dl.d final yh.l<? super v, b2> onFocusEvent) {
        f0.p(nVar, "<this>");
        f0.p(onFocusEvent, "onFocusEvent");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.ui.focus.FocusEventModifierKt$onFocusEvent$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                f0.p(x0Var, "$this$null");
                x0Var.d("onFocusEvent");
                x0Var.getProperties().c("onFocusEvent", onFocusEvent);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.ui.focus.FocusEventModifierKt$onFocusEvent$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                f0.p(composed, "$this$composed");
                pVar.T(607036704);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(607036704, i10, -1, "androidx.compose.ui.focus.onFocusEvent.<anonymous> (FocusEventModifier.kt:155)");
                }
                yh.l<v, b2> lVar = onFocusEvent;
                pVar.T(1157296644);
                boolean zS = pVar.s(lVar);
                Object objU = pVar.U();
                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new e(lVar);
                    pVar.N(objU);
                }
                pVar.c0();
                final e eVar = (e) objU;
                pVar.T(1157296644);
                boolean zS2 = pVar.s(eVar);
                Object objU2 = pVar.U();
                if (zS2 || objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU2 = new yh.a<b2>() { // from class: androidx.compose.ui.focus.FocusEventModifierKt$onFocusEvent$2$1$1
                        {
                            super(0);
                        }

                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            eVar.f();
                        }
                    };
                    pVar.N(objU2);
                }
                pVar.c0();
                EffectsKt.k((yh.a) objU2, pVar, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return eVar;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }
}
