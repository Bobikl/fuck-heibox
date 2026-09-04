package androidx.activity.compose;

import androidx.activity.m;
import androidx.activity.n;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.e0;
import androidx.compose.runtime.h;
import androidx.compose.runtime.p;
import androidx.compose.runtime.u1;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import yh.l;

/* JADX INFO: compiled from: ReportDrawn.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ReportDrawnKt {
    @h
    public static final void a(@dl.e p pVar, final int i10) {
        p pVarF = pVar.F(-1357012904);
        if (i10 == 0 && pVarF.b()) {
            pVarF.l();
        } else {
            c(new yh.a<Boolean>() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawn$1
                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    return Boolean.TRUE;
                }
            }, pVarF, 6);
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<p, Integer, b2>() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawn$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e p pVar2, int i11) {
                ReportDrawnKt.a(pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    @h
    public static final void b(@dl.d final l<? super kotlin.coroutines.c<? super b2>, ? extends Object> block, @dl.e p pVar, final int i10) {
        m fullyDrawnReporter;
        f0.p(block, "block");
        p pVarF = pVar.F(945311272);
        n nVarA = LocalFullyDrawnReporterOwner.f1434a.a(pVarF, 6);
        if (nVarA == null || (fullyDrawnReporter = nVarA.getFullyDrawnReporter()) == null) {
            u1 u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<p, Integer, b2>() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$fullyDrawnReporter$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e p pVar2, int i11) {
                    ReportDrawnKt.b(block, pVar2, i10 | 1);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
            return;
        }
        EffectsKt.g(block, fullyDrawnReporter, new ReportDrawnKt$ReportDrawnAfter$1(fullyDrawnReporter, block, null), pVarF, bb.c.b.f30790m8);
        u1 u1VarH2 = pVarF.H();
        if (u1VarH2 == null) {
            return;
        }
        u1VarH2.a(new yh.p<p, Integer, b2>() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e p pVar2, int i11) {
                ReportDrawnKt.b(block, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    @h
    public static final void c(@dl.d final yh.a<Boolean> predicate, @dl.e p pVar, final int i10) {
        int i11;
        final m fullyDrawnReporter;
        f0.p(predicate, "predicate");
        p pVarF = pVar.F(-2047119994);
        if ((i10 & 14) == 0) {
            i11 = (pVarF.s(predicate) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && pVarF.b()) {
            pVarF.l();
        } else {
            n nVarA = LocalFullyDrawnReporterOwner.f1434a.a(pVarF, 6);
            if (nVarA == null || (fullyDrawnReporter = nVarA.getFullyDrawnReporter()) == null) {
                u1 u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<p, Integer, b2>() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$fullyDrawnReporter$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void a(@dl.e p pVar2, int i12) {
                        ReportDrawnKt.c(predicate, pVar2, i10 | 1);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
                return;
            }
            EffectsKt.b(fullyDrawnReporter, predicate, new l<androidx.compose.runtime.f0, e0>() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$1

                /* JADX INFO: compiled from: Effects.kt */
                @t0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnWhen$1\n*L\n1#1,483:1\n135#2:484\n*E\n"})
                public static final class a implements e0 {
                    @Override // androidx.compose.runtime.e0
                    public void dispose() {
                    }
                }

                /* JADX INFO: compiled from: Effects.kt */
                @t0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnWhen$1\n*L\n1#1,483:1\n139#2,2:484\n*E\n"})
                public static final class b implements e0 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ ReportDrawnComposition f1461a;

                    public b(ReportDrawnComposition reportDrawnComposition) {
                        this.f1461a = reportDrawnComposition;
                    }

                    @Override // androidx.compose.runtime.e0
                    public void dispose() {
                        this.f1461a.d();
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
                    return fullyDrawnReporter.e() ? new a() : new b(new ReportDrawnComposition(fullyDrawnReporter, predicate));
                }
            }, pVarF, ((i11 << 3) & 112) | 8);
        }
        u1 u1VarH2 = pVarF.H();
        if (u1VarH2 == null) {
            return;
        }
        u1VarH2.a(new yh.p<p, Integer, b2>() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e p pVar2, int i12) {
                ReportDrawnKt.c(predicate, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }
}
