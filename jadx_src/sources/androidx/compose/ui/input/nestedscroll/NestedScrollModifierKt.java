package androidx.compose.ui.input.nestedscroll;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.h;
import androidx.compose.runtime.p;
import androidx.compose.runtime.x;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.n;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import com.alipay.zoloz.android.phone.mrpc.core.f;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.q0;
import yh.l;
import yh.q;

/* JADX INFO: compiled from: NestedScrollModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/n;", "Landroidx/compose/ui/input/nestedscroll/b;", f.f39665q, "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", ak.av, "ui_release"}, k = 2, mv = {1, 7, 1})
public final class NestedScrollModifierKt {
    @d
    public static final n a(@d n nVar, @d final b connection, @e final NestedScrollDispatcher nestedScrollDispatcher) {
        f0.p(nVar, "<this>");
        f0.p(connection, "connection");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new l<x0, b2>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt$nestedScroll$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@d x0 x0Var) {
                f0.p(x0Var, "$this$null");
                x0Var.d("nestedScroll");
                x0Var.getProperties().c(f.f39665q, connection);
                x0Var.getProperties().c("dispatcher", nestedScrollDispatcher);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new q<n, p, Integer, n>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt$nestedScroll$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @d
            @h
            public final n a(@d n composed, @e p pVar, int i10) {
                f0.p(composed, "$this$composed");
                pVar.T(410346167);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(410346167, i10, -1, "androidx.compose.ui.input.nestedscroll.nestedScroll.<anonymous> (NestedScrollModifier.kt:335)");
                }
                pVar.T(773894976);
                pVar.T(-492369756);
                Object objU = pVar.U();
                p.Companion companion = p.INSTANCE;
                if (objU == companion.a()) {
                    Object xVar = new x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVar));
                    pVar.N(xVar);
                    objU = xVar;
                }
                pVar.c0();
                q0 coroutineScope = ((x) objU).getCoroutineScope();
                pVar.c0();
                NestedScrollDispatcher nestedScrollDispatcher2 = nestedScrollDispatcher;
                pVar.T(100475956);
                if (nestedScrollDispatcher2 == null) {
                    pVar.T(-492369756);
                    Object objU2 = pVar.U();
                    if (objU2 == companion.a()) {
                        objU2 = new NestedScrollDispatcher();
                        pVar.N(objU2);
                    }
                    pVar.c0();
                    nestedScrollDispatcher2 = (NestedScrollDispatcher) objU2;
                }
                pVar.c0();
                b bVar = connection;
                pVar.T(1618982084);
                boolean zS = pVar.s(bVar) | pVar.s(nestedScrollDispatcher2) | pVar.s(coroutineScope);
                Object objU3 = pVar.U();
                if (zS || objU3 == companion.a()) {
                    nestedScrollDispatcher2.j(coroutineScope);
                    objU3 = new NestedScrollModifierLocal(nestedScrollDispatcher2, bVar);
                    pVar.N(objU3);
                }
                pVar.c0();
                NestedScrollModifierLocal nestedScrollModifierLocal = (NestedScrollModifierLocal) objU3;
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return nestedScrollModifierLocal;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ n invoke(n nVar2, p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }

    public static /* synthetic */ n b(n nVar, b bVar, NestedScrollDispatcher nestedScrollDispatcher, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            nestedScrollDispatcher = null;
        }
        return a(nVar, bVar, nestedScrollDispatcher);
    }
}
