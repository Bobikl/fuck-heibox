package androidx.activity.compose;

import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.o;
import androidx.activity.s;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.e0;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.h;
import androidx.compose.runtime.m2;
import androidx.compose.runtime.p;
import androidx.compose.runtime.u1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.y;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import yh.l;

/* JADX INFO: compiled from: BackHandler.kt */
/* JADX INFO: loaded from: classes.dex */
@t0({"SMAP\nBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt\n*L\n1#1,110:1\n25#2:111\n50#2:118\n49#2:119\n955#3,6:112\n955#3,6:120\n76#4:126\n89#5:127\n*S KotlinDebug\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt\n*L\n86#1:111\n94#1:118\n94#1:119\n86#1:112,6\n94#1:120,6\n100#1:126\n84#1:127\n*E\n"})
public final class BackHandlerKt {

    /* JADX INFO: compiled from: BackHandler.kt */
    public static final class a extends o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m2<yh.a<b2>> f1429a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z10, m2<? extends yh.a<b2>> m2Var) {
            super(z10);
            this.f1429a = m2Var;
        }

        @Override // androidx.activity.o
        public void handleOnBackPressed() {
            BackHandlerKt.b(this.f1429a).invoke();
        }
    }

    @h
    public static final void a(final boolean z10, @dl.d final yh.a<b2> onBack, @dl.e p pVar, final int i10, final int i11) {
        int i12;
        f0.p(onBack, "onBack");
        p pVarF = pVar.F(-361453782);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.u(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= pVarF.s(onBack) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && pVarF.b()) {
            pVarF.l();
        } else {
            if (i13 != 0) {
                z10 = true;
            }
            m2 m2VarT = e2.t(onBack, pVarF, (i12 >> 3) & 14);
            pVarF.T(-3687241);
            Object objU = pVarF.U();
            p.Companion companion = p.INSTANCE;
            if (objU == companion.a()) {
                objU = new a(z10, m2VarT);
                pVarF.N(objU);
            }
            pVarF.c0();
            final a aVar = (a) objU;
            Boolean boolValueOf = Boolean.valueOf(z10);
            pVarF.T(-3686552);
            boolean zS = pVarF.s(boolValueOf) | pVarF.s(aVar);
            Object objU2 = pVarF.U();
            if (zS || objU2 == companion.a()) {
                objU2 = new yh.a<b2>() { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        aVar.setEnabled(z10);
                    }
                };
                pVarF.N(objU2);
            }
            pVarF.c0();
            EffectsKt.k((yh.a) objU2, pVarF, 0);
            s sVarA = LocalOnBackPressedDispatcherOwner.f1438a.a(pVarF, 6);
            if (sVarA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner".toString());
            }
            final OnBackPressedDispatcher onBackPressedDispatcher = sVarA.getOnBackPressedDispatcher();
            final y yVar = (y) pVarF.K(AndroidCompositionLocals_androidKt.i());
            EffectsKt.b(yVar, onBackPressedDispatcher, new l<androidx.compose.runtime.f0, e0>() { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$2

                /* JADX INFO: compiled from: Effects.kt */
                @t0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt$BackHandler$2\n*L\n1#1,483:1\n106#2,2:484\n*E\n"})
                public static final class a implements e0 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ BackHandlerKt.a f1424a;

                    public a(BackHandlerKt.a aVar) {
                        this.f1424a = aVar;
                    }

                    @Override // androidx.compose.runtime.e0
                    public void dispose() {
                        this.f1424a.remove();
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
                    onBackPressedDispatcher.c(yVar, aVar);
                    return new a(aVar);
                }
            }, pVarF, 72);
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<p, Integer, b2>() { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e p pVar2, int i14) {
                BackHandlerKt.a(z10, onBack, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yh.a<b2> b(m2<? extends yh.a<b2>> m2Var) {
        return m2Var.getValue();
    }
}
