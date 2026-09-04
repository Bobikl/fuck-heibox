package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.MagnifierKt;
import androidx.compose.foundation.c0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.h2;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SelectionManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/n;", ak.aF, "(Landroidx/compose/ui/n;Landroidx/compose/runtime/p;I)Landroidx/compose/ui/n;"}, k = 3, mv = {1, 7, 1})
public final class SelectionManager_androidKt$selectionMagnifier$1 extends Lambda implements yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ SelectionManager f8262b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionManager_androidKt$selectionMagnifier$1(SelectionManager selectionManager) {
        super(3);
        this.f8262b = selectionManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long d(a1<s1.r> a1Var) {
        return a1Var.getValue().getF139248a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(a1<s1.r> a1Var, long j10) {
        a1Var.setValue(s1.r.b(j10));
    }

    @dl.d
    @androidx.compose.runtime.h
    public final androidx.compose.ui.n c(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
        f0.p(composed, "$this$composed");
        pVar.T(-1914520728);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1914520728, i10, -1, "androidx.compose.foundation.text.selection.selectionMagnifier.<anonymous> (SelectionManager.android.kt:45)");
        }
        final s1.e eVar = (s1.e) pVar.K(CompositionLocalsKt.i());
        pVar.T(-492369756);
        Object objU = pVar.U();
        androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
        if (objU == companion.a()) {
            objU = h2.g(s1.r.b(s1.r.f139246b.a()), null, 2, null);
            pVar.N(objU);
        }
        pVar.c0();
        final a1 a1Var = (a1) objU;
        final SelectionManager selectionManager = this.f8262b;
        yh.a<b1.f> aVar = new yh.a<b1.f>() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public final long a() {
                return n.a(selectionManager, SelectionManager_androidKt$selectionMagnifier$1.d(a1Var));
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ b1.f invoke() {
                return b1.f.d(a());
            }
        };
        pVar.T(511388516);
        boolean zS = pVar.s(a1Var) | pVar.s(eVar);
        Object objU2 = pVar.U();
        if (zS || objU2 == companion.a()) {
            objU2 = new yh.l<yh.a<? extends b1.f>, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final androidx.compose.ui.n invoke(@dl.d final yh.a<b1.f> center) {
                    f0.p(center, "center");
                    androidx.compose.ui.n.Companion companion2 = androidx.compose.ui.n.INSTANCE;
                    c0 c0VarC = c0.INSTANCE.c();
                    yh.l<s1.e, b1.f> lVar = new yh.l<s1.e, b1.f>() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1$2$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final long a(@dl.d s1.e magnifier) {
                            f0.p(magnifier, "$this$magnifier");
                            return center.invoke().getF30368a();
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b1.f invoke(s1.e eVar2) {
                            return b1.f.d(a(eVar2));
                        }
                    };
                    final s1.e eVar2 = eVar;
                    final a1<s1.r> a1Var2 = a1Var;
                    return MagnifierKt.f(companion2, lVar, null, 0.0f, c0VarC, new yh.l<s1.l, b2>() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1$2$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(long j10) {
                            a1<s1.r> a1Var3 = a1Var2;
                            s1.e eVar3 = eVar2;
                            SelectionManager_androidKt$selectionMagnifier$1.e(a1Var3, s1.s.a(eVar3.e1(s1.l.p(j10)), eVar3.e1(s1.l.m(j10))));
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(s1.l lVar2) {
                            a(lVar2.getF139236a());
                            return b2.f124493a;
                        }
                    }, 6, null);
                }
            };
            pVar.N(objU2);
        }
        pVar.c0();
        androidx.compose.ui.n nVarG = SelectionMagnifierKt.g(composed, aVar, (yh.l) objU2);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return nVarG;
    }

    @Override // yh.q
    public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar, androidx.compose.runtime.p pVar, Integer num) {
        return c(nVar, pVar, num.intValue());
    }
}
