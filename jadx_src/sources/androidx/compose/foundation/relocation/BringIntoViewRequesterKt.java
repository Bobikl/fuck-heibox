package androidx.compose.foundation.relocation;

import androidx.compose.foundation.t;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.e0;
import androidx.compose.runtime.h;
import androidx.compose.runtime.p;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.n;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;
import yh.q;

/* JADX INFO: compiled from: BringIntoViewRequester.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0000H\u0007¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/relocation/e;", ak.av, "Landroidx/compose/ui/n;", "bringIntoViewRequester", "b", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class BringIntoViewRequesterKt {
    @t
    @dl.d
    public static final e a() {
        return new BringIntoViewRequesterImpl();
    }

    @t
    @dl.d
    public static final n b(@dl.d n nVar, @dl.d final e bringIntoViewRequester) {
        f0.p(nVar, "<this>");
        f0.p(bringIntoViewRequester, "bringIntoViewRequester");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new l<x0, b2>() { // from class: androidx.compose.foundation.relocation.BringIntoViewRequesterKt$bringIntoViewRequester$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                f0.p(x0Var, "$this$null");
                x0Var.d("bringIntoViewRequester");
                x0Var.getProperties().c("bringIntoViewRequester", bringIntoViewRequester);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new q<n, p, Integer, n>() { // from class: androidx.compose.foundation.relocation.BringIntoViewRequesterKt$bringIntoViewRequester$2
            {
                super(3);
            }

            @dl.d
            @h
            public final n a(@dl.d n composed, @dl.e p pVar, int i10) {
                f0.p(composed, "$this$composed");
                pVar.T(-992853993);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-992853993, i10, -1, "androidx.compose.foundation.relocation.bringIntoViewRequester.<anonymous> (BringIntoViewRequester.kt:100)");
                }
                c cVarB = g.b(pVar, 0);
                pVar.T(1157296644);
                boolean zS = pVar.s(cVarB);
                Object objU = pVar.U();
                if (zS || objU == p.INSTANCE.a()) {
                    objU = new BringIntoViewRequesterModifier(cVarB);
                    pVar.N(objU);
                }
                pVar.c0();
                final BringIntoViewRequesterModifier bringIntoViewRequesterModifier = (BringIntoViewRequesterModifier) objU;
                final e eVar = bringIntoViewRequester;
                if (eVar instanceof BringIntoViewRequesterImpl) {
                    EffectsKt.c(eVar, new l<androidx.compose.runtime.f0, e0>() { // from class: androidx.compose.foundation.relocation.BringIntoViewRequesterKt$bringIntoViewRequester$2.1

                        /* JADX INFO: renamed from: androidx.compose.foundation.relocation.BringIntoViewRequesterKt$bringIntoViewRequester$2$1$a */
                        /* JADX INFO: compiled from: Effects.kt */
                        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                        public static final class a implements e0 {

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            final /* synthetic */ e f7468a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            final /* synthetic */ BringIntoViewRequesterModifier f7469b;

                            public a(e eVar, BringIntoViewRequesterModifier bringIntoViewRequesterModifier) {
                                this.f7468a = eVar;
                                this.f7469b = bringIntoViewRequesterModifier;
                            }

                            @Override // androidx.compose.runtime.e0
                            public void dispose() {
                                ((BringIntoViewRequesterImpl) this.f7468a).b().c0(this.f7469b);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // yh.l
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final e0 invoke(@dl.d androidx.compose.runtime.f0 DisposableEffect) {
                            f0.p(DisposableEffect, "$this$DisposableEffect");
                            ((BringIntoViewRequesterImpl) eVar).b().b(bringIntoViewRequesterModifier);
                            return new a(eVar, bringIntoViewRequesterModifier);
                        }
                    }, pVar, 0);
                }
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return bringIntoViewRequesterModifier;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ n invoke(n nVar2, p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }
}
