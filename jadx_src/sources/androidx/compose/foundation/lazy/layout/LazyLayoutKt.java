package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.m2;
import androidx.compose.runtime.u1;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.layout.j0;
import androidx.compose.ui.layout.q1;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001aO\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u001d\u0010\u000b\u001a\u0019\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/lazy/layout/i;", "itemProvider", "Landroidx/compose/ui/n;", "modifier", "Landroidx/compose/foundation/lazy/layout/o;", "prefetchState", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/m;", "Ls1/b;", "Landroidx/compose/ui/layout/j0;", "Lkotlin/t;", "measurePolicy", "Lkotlin/b2;", ak.av, "(Landroidx/compose/foundation/lazy/layout/i;Landroidx/compose/ui/n;Landroidx/compose/foundation/lazy/layout/o;Lyh/p;Landroidx/compose/runtime/p;II)V", "", "I", "MaxItemsToRetainForReuse", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class LazyLayoutKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f7064a = 7;

    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00db  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    @androidx.compose.foundation.t
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void a(@dl.d final i itemProvider, @dl.e androidx.compose.ui.n nVar, @dl.e o oVar, @dl.d final yh.p<? super m, ? super s1.b, ? extends j0> measurePolicy, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.n nVar2;
        int i13;
        o oVar2;
        int i14;
        int i15;
        final int i16;
        androidx.compose.ui.n nVar3;
        o oVar3;
        final androidx.compose.ui.n nVar4;
        final o oVar4;
        u1 u1VarH;
        f0.p(itemProvider, "itemProvider");
        f0.p(measurePolicy, "measurePolicy");
        androidx.compose.runtime.p pVarF = pVar.F(852831187);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(itemProvider) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 == 0) {
            if ((i10 & 112) == 0) {
                nVar2 = nVar;
                i12 |= pVarF.s(nVar2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & bb.c.b.f30796me) == 0) {
                    oVar2 = oVar;
                    if (pVarF.s(oVar2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i11 & 8) != 0) {
                    i12 |= bb.c.d.f31193dj;
                } else if ((i10 & bb.c.g.f32954lc) == 0) {
                    if (pVarF.s(measurePolicy)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                i16 = i12;
                if ((i16 & bb.c.f.br) == 1170 || !pVarF.b()) {
                    if (i17 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        oVar3 = null;
                    } else {
                        oVar3 = oVar2;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(852831187, i16, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:41)");
                    }
                    final m2 m2VarT = e2.t(itemProvider, pVarF, i16 & 14);
                    final o oVar5 = oVar3;
                    final androidx.compose.ui.n nVar5 = nVar3;
                    LazySaveableStateHolderKt.a(androidx.compose.runtime.internal.b.b(pVarF, 1342877611, true, new yh.q<androidx.compose.runtime.saveable.b, androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d androidx.compose.runtime.saveable.b saveableStateHolder, @dl.e androidx.compose.runtime.p pVar2, int i18) {
                            f0.p(saveableStateHolder, "saveableStateHolder");
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1342877611, i18, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:49)");
                            }
                            final m2<i> m2Var = m2VarT;
                            pVar2.T(-492369756);
                            Object objU = pVar2.U();
                            androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
                            if (objU == companion.a()) {
                                objU = new LazyLayoutItemContentFactory(saveableStateHolder, new yh.a<i>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(0);
                                    }

                                    @Override // yh.a
                                    @dl.d
                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final i invoke() {
                                        return m2Var.getValue();
                                    }
                                });
                                pVar2.N(objU);
                            }
                            pVar2.c0();
                            final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) objU;
                            pVar2.T(-492369756);
                            Object objU2 = pVar2.U();
                            if (objU2 == companion.a()) {
                                objU2 = new SubcomposeLayoutState(new k(lazyLayoutItemContentFactory));
                                pVar2.N(objU2);
                            }
                            pVar2.c0();
                            SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) objU2;
                            o oVar6 = oVar5;
                            if (oVar6 != null) {
                                LazyLayoutPrefetcher_androidKt.a(oVar6, lazyLayoutItemContentFactory, subcomposeLayoutState, pVar2, ((i16 >> 6) & 14) | 64 | (SubcomposeLayoutState.f14963f << 6));
                            }
                            androidx.compose.ui.n nVar6 = nVar5;
                            final yh.p<m, s1.b, j0> pVar3 = measurePolicy;
                            pVar2.T(511388516);
                            boolean zS = pVar2.s(lazyLayoutItemContentFactory) | pVar2.s(pVar3);
                            Object objU3 = pVar2.U();
                            if (zS || objU3 == companion.a()) {
                                objU3 = new yh.p<q1, s1.b, j0>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @dl.d
                                    public final j0 a(@dl.d q1 q1Var, long j10) {
                                        f0.p(q1Var, "$this$null");
                                        return pVar3.invoke(new n(lazyLayoutItemContentFactory, q1Var), s1.b.b(j10));
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ j0 invoke(q1 q1Var, s1.b bVar) {
                                        return a(q1Var, bVar.getF139216a());
                                    }
                                };
                                pVar2.N(objU3);
                            }
                            pVar2.c0();
                            SubcomposeLayoutKt.b(subcomposeLayoutState, nVar6, (yh.p) objU3, pVar2, SubcomposeLayoutState.f14963f | (i16 & 112), 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.saveable.b bVar, androidx.compose.runtime.p pVar2, Integer num) {
                            a(bVar, pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    }), pVarF, 6);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    oVar4 = oVar3;
                } else {
                    pVarF.l();
                    nVar4 = nVar2;
                    oVar4 = oVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i18) {
                        LazyLayoutKt.a(itemProvider, nVar4, oVar4, measurePolicy, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.b.f30966u4;
            oVar2 = oVar;
            if ((i11 & 8) != 0) {
                i12 |= bb.c.d.f31193dj;
            } else if ((i10 & bb.c.g.f32954lc) == 0) {
                if (pVarF.s(measurePolicy)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            i16 = i12;
            if ((i16 & bb.c.f.br) == 1170) {
                if (i17 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    oVar3 = null;
                } else {
                    oVar3 = oVar2;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(852831187, i16, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:41)");
                }
                final m2<? extends i> m2VarT2 = e2.t(itemProvider, pVarF, i16 & 14);
                final o oVar6 = oVar3;
                final androidx.compose.ui.n nVar6 = nVar3;
                LazySaveableStateHolderKt.a(androidx.compose.runtime.internal.b.b(pVarF, 1342877611, true, new yh.q<androidx.compose.runtime.saveable.b, androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.d androidx.compose.runtime.saveable.b saveableStateHolder, @dl.e androidx.compose.runtime.p pVar2, int i18) {
                        f0.p(saveableStateHolder, "saveableStateHolder");
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1342877611, i18, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:49)");
                        }
                        final m2<? extends i> m2Var = m2VarT2;
                        pVar2.T(-492369756);
                        Object objU = pVar2.U();
                        androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            objU = new LazyLayoutItemContentFactory(saveableStateHolder, new yh.a<i>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final i invoke() {
                                    return m2Var.getValue();
                                }
                            });
                            pVar2.N(objU);
                        }
                        pVar2.c0();
                        final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) objU;
                        pVar2.T(-492369756);
                        Object objU2 = pVar2.U();
                        if (objU2 == companion.a()) {
                            objU2 = new SubcomposeLayoutState(new k(lazyLayoutItemContentFactory));
                            pVar2.N(objU2);
                        }
                        pVar2.c0();
                        SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) objU2;
                        o oVar7 = oVar6;
                        if (oVar7 != null) {
                            LazyLayoutPrefetcher_androidKt.a(oVar7, lazyLayoutItemContentFactory, subcomposeLayoutState, pVar2, ((i16 >> 6) & 14) | 64 | (SubcomposeLayoutState.f14963f << 6));
                        }
                        androidx.compose.ui.n nVar7 = nVar6;
                        final yh.p<? super m, ? super s1.b, ? extends j0> pVar3 = measurePolicy;
                        pVar2.T(511388516);
                        boolean zS = pVar2.s(lazyLayoutItemContentFactory) | pVar2.s(pVar3);
                        Object objU3 = pVar2.U();
                        if (zS || objU3 == companion.a()) {
                            objU3 = new yh.p<q1, s1.b, j0>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @dl.d
                                public final j0 a(@dl.d q1 q1Var, long j10) {
                                    f0.p(q1Var, "$this$null");
                                    return pVar3.invoke(new n(lazyLayoutItemContentFactory, q1Var), s1.b.b(j10));
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ j0 invoke(q1 q1Var, s1.b bVar) {
                                    return a(q1Var, bVar.getF139216a());
                                }
                            };
                            pVar2.N(objU3);
                        }
                        pVar2.c0();
                        SubcomposeLayoutKt.b(subcomposeLayoutState, nVar7, (yh.p) objU3, pVar2, SubcomposeLayoutState.f14963f | (i16 & 112), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.q
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.saveable.b bVar, androidx.compose.runtime.p pVar2, Integer num) {
                        a(bVar, pVar2, num.intValue());
                        return b2.f124493a;
                    }
                }), pVarF, 6);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                oVar4 = oVar3;
            } else {
                if (i17 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    oVar3 = null;
                } else {
                    oVar3 = oVar2;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(852831187, i16, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:41)");
                }
                final m2<? extends i> m2VarT3 = e2.t(itemProvider, pVarF, i16 & 14);
                final o oVar7 = oVar3;
                final androidx.compose.ui.n nVar7 = nVar3;
                LazySaveableStateHolderKt.a(androidx.compose.runtime.internal.b.b(pVarF, 1342877611, true, new yh.q<androidx.compose.runtime.saveable.b, androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.d androidx.compose.runtime.saveable.b saveableStateHolder, @dl.e androidx.compose.runtime.p pVar2, int i18) {
                        f0.p(saveableStateHolder, "saveableStateHolder");
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1342877611, i18, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:49)");
                        }
                        final m2<? extends i> m2Var = m2VarT3;
                        pVar2.T(-492369756);
                        Object objU = pVar2.U();
                        androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            objU = new LazyLayoutItemContentFactory(saveableStateHolder, new yh.a<i>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final i invoke() {
                                    return m2Var.getValue();
                                }
                            });
                            pVar2.N(objU);
                        }
                        pVar2.c0();
                        final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) objU;
                        pVar2.T(-492369756);
                        Object objU2 = pVar2.U();
                        if (objU2 == companion.a()) {
                            objU2 = new SubcomposeLayoutState(new k(lazyLayoutItemContentFactory));
                            pVar2.N(objU2);
                        }
                        pVar2.c0();
                        SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) objU2;
                        o oVar8 = oVar7;
                        if (oVar8 != null) {
                            LazyLayoutPrefetcher_androidKt.a(oVar8, lazyLayoutItemContentFactory, subcomposeLayoutState, pVar2, ((i16 >> 6) & 14) | 64 | (SubcomposeLayoutState.f14963f << 6));
                        }
                        androidx.compose.ui.n nVar8 = nVar7;
                        final yh.p<? super m, ? super s1.b, ? extends j0> pVar3 = measurePolicy;
                        pVar2.T(511388516);
                        boolean zS = pVar2.s(lazyLayoutItemContentFactory) | pVar2.s(pVar3);
                        Object objU3 = pVar2.U();
                        if (zS || objU3 == companion.a()) {
                            objU3 = new yh.p<q1, s1.b, j0>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @dl.d
                                public final j0 a(@dl.d q1 q1Var, long j10) {
                                    f0.p(q1Var, "$this$null");
                                    return pVar3.invoke(new n(lazyLayoutItemContentFactory, q1Var), s1.b.b(j10));
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ j0 invoke(q1 q1Var, s1.b bVar) {
                                    return a(q1Var, bVar.getF139216a());
                                }
                            };
                            pVar2.N(objU3);
                        }
                        pVar2.c0();
                        SubcomposeLayoutKt.b(subcomposeLayoutState, nVar8, (yh.p) objU3, pVar2, SubcomposeLayoutState.f14963f | (i16 & 112), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.q
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.saveable.b bVar, androidx.compose.runtime.p pVar2, Integer num) {
                        a(bVar, pVar2, num.intValue());
                        return b2.f124493a;
                    }
                }), pVarF, 6);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                oVar4 = oVar3;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i18) {
                    LazyLayoutKt.a(itemProvider, nVar4, oVar4, measurePolicy, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= 48;
        nVar2 = nVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & bb.c.b.f30796me) == 0) {
                oVar2 = oVar;
                if (pVarF.s(oVar2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i11 & 8) != 0) {
                i12 |= bb.c.d.f31193dj;
            } else if ((i10 & bb.c.g.f32954lc) == 0) {
                if (pVarF.s(measurePolicy)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            i16 = i12;
            if ((i16 & bb.c.f.br) == 1170) {
                if (i17 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    oVar3 = null;
                } else {
                    oVar3 = oVar2;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(852831187, i16, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:41)");
                }
                final m2<? extends i> m2VarT4 = e2.t(itemProvider, pVarF, i16 & 14);
                final o oVar8 = oVar3;
                final androidx.compose.ui.n nVar8 = nVar3;
                LazySaveableStateHolderKt.a(androidx.compose.runtime.internal.b.b(pVarF, 1342877611, true, new yh.q<androidx.compose.runtime.saveable.b, androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.d androidx.compose.runtime.saveable.b saveableStateHolder, @dl.e androidx.compose.runtime.p pVar2, int i18) {
                        f0.p(saveableStateHolder, "saveableStateHolder");
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1342877611, i18, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:49)");
                        }
                        final m2<? extends i> m2Var = m2VarT4;
                        pVar2.T(-492369756);
                        Object objU = pVar2.U();
                        androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            objU = new LazyLayoutItemContentFactory(saveableStateHolder, new yh.a<i>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final i invoke() {
                                    return m2Var.getValue();
                                }
                            });
                            pVar2.N(objU);
                        }
                        pVar2.c0();
                        final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) objU;
                        pVar2.T(-492369756);
                        Object objU2 = pVar2.U();
                        if (objU2 == companion.a()) {
                            objU2 = new SubcomposeLayoutState(new k(lazyLayoutItemContentFactory));
                            pVar2.N(objU2);
                        }
                        pVar2.c0();
                        SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) objU2;
                        o oVar9 = oVar8;
                        if (oVar9 != null) {
                            LazyLayoutPrefetcher_androidKt.a(oVar9, lazyLayoutItemContentFactory, subcomposeLayoutState, pVar2, ((i16 >> 6) & 14) | 64 | (SubcomposeLayoutState.f14963f << 6));
                        }
                        androidx.compose.ui.n nVar9 = nVar8;
                        final yh.p<? super m, ? super s1.b, ? extends j0> pVar3 = measurePolicy;
                        pVar2.T(511388516);
                        boolean zS = pVar2.s(lazyLayoutItemContentFactory) | pVar2.s(pVar3);
                        Object objU3 = pVar2.U();
                        if (zS || objU3 == companion.a()) {
                            objU3 = new yh.p<q1, s1.b, j0>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @dl.d
                                public final j0 a(@dl.d q1 q1Var, long j10) {
                                    f0.p(q1Var, "$this$null");
                                    return pVar3.invoke(new n(lazyLayoutItemContentFactory, q1Var), s1.b.b(j10));
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ j0 invoke(q1 q1Var, s1.b bVar) {
                                    return a(q1Var, bVar.getF139216a());
                                }
                            };
                            pVar2.N(objU3);
                        }
                        pVar2.c0();
                        SubcomposeLayoutKt.b(subcomposeLayoutState, nVar9, (yh.p) objU3, pVar2, SubcomposeLayoutState.f14963f | (i16 & 112), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.q
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.saveable.b bVar, androidx.compose.runtime.p pVar2, Integer num) {
                        a(bVar, pVar2, num.intValue());
                        return b2.f124493a;
                    }
                }), pVarF, 6);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                oVar4 = oVar3;
            } else {
                if (i17 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    oVar3 = null;
                } else {
                    oVar3 = oVar2;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(852831187, i16, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:41)");
                }
                final m2<? extends i> m2VarT5 = e2.t(itemProvider, pVarF, i16 & 14);
                final o oVar9 = oVar3;
                final androidx.compose.ui.n nVar9 = nVar3;
                LazySaveableStateHolderKt.a(androidx.compose.runtime.internal.b.b(pVarF, 1342877611, true, new yh.q<androidx.compose.runtime.saveable.b, androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.d androidx.compose.runtime.saveable.b saveableStateHolder, @dl.e androidx.compose.runtime.p pVar2, int i18) {
                        f0.p(saveableStateHolder, "saveableStateHolder");
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1342877611, i18, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:49)");
                        }
                        final m2<? extends i> m2Var = m2VarT5;
                        pVar2.T(-492369756);
                        Object objU = pVar2.U();
                        androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            objU = new LazyLayoutItemContentFactory(saveableStateHolder, new yh.a<i>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final i invoke() {
                                    return m2Var.getValue();
                                }
                            });
                            pVar2.N(objU);
                        }
                        pVar2.c0();
                        final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) objU;
                        pVar2.T(-492369756);
                        Object objU2 = pVar2.U();
                        if (objU2 == companion.a()) {
                            objU2 = new SubcomposeLayoutState(new k(lazyLayoutItemContentFactory));
                            pVar2.N(objU2);
                        }
                        pVar2.c0();
                        SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) objU2;
                        o oVar10 = oVar9;
                        if (oVar10 != null) {
                            LazyLayoutPrefetcher_androidKt.a(oVar10, lazyLayoutItemContentFactory, subcomposeLayoutState, pVar2, ((i16 >> 6) & 14) | 64 | (SubcomposeLayoutState.f14963f << 6));
                        }
                        androidx.compose.ui.n nVar10 = nVar9;
                        final yh.p<? super m, ? super s1.b, ? extends j0> pVar3 = measurePolicy;
                        pVar2.T(511388516);
                        boolean zS = pVar2.s(lazyLayoutItemContentFactory) | pVar2.s(pVar3);
                        Object objU3 = pVar2.U();
                        if (zS || objU3 == companion.a()) {
                            objU3 = new yh.p<q1, s1.b, j0>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @dl.d
                                public final j0 a(@dl.d q1 q1Var, long j10) {
                                    f0.p(q1Var, "$this$null");
                                    return pVar3.invoke(new n(lazyLayoutItemContentFactory, q1Var), s1.b.b(j10));
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ j0 invoke(q1 q1Var, s1.b bVar) {
                                    return a(q1Var, bVar.getF139216a());
                                }
                            };
                            pVar2.N(objU3);
                        }
                        pVar2.c0();
                        SubcomposeLayoutKt.b(subcomposeLayoutState, nVar10, (yh.p) objU3, pVar2, SubcomposeLayoutState.f14963f | (i16 & 112), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.q
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.saveable.b bVar, androidx.compose.runtime.p pVar2, Integer num) {
                        a(bVar, pVar2, num.intValue());
                        return b2.f124493a;
                    }
                }), pVarF, 6);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                oVar4 = oVar3;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i18) {
                    LazyLayoutKt.a(itemProvider, nVar4, oVar4, measurePolicy, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= bb.c.b.f30966u4;
        oVar2 = oVar;
        if ((i11 & 8) != 0) {
            i12 |= bb.c.d.f31193dj;
        } else if ((i10 & bb.c.g.f32954lc) == 0) {
            if (pVarF.s(measurePolicy)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i12 |= i15;
        }
        i16 = i12;
        if ((i16 & bb.c.f.br) == 1170) {
            if (i17 != 0) {
                nVar3 = androidx.compose.ui.n.INSTANCE;
            } else {
                nVar3 = nVar2;
            }
            if (i13 != 0) {
                oVar3 = null;
            } else {
                oVar3 = oVar2;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(852831187, i16, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:41)");
            }
            final m2<? extends i> m2VarT6 = e2.t(itemProvider, pVarF, i16 & 14);
            final o oVar10 = oVar3;
            final androidx.compose.ui.n nVar10 = nVar3;
            LazySaveableStateHolderKt.a(androidx.compose.runtime.internal.b.b(pVarF, 1342877611, true, new yh.q<androidx.compose.runtime.saveable.b, androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.d androidx.compose.runtime.saveable.b saveableStateHolder, @dl.e androidx.compose.runtime.p pVar2, int i18) {
                    f0.p(saveableStateHolder, "saveableStateHolder");
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1342877611, i18, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:49)");
                    }
                    final m2<? extends i> m2Var = m2VarT6;
                    pVar2.T(-492369756);
                    Object objU = pVar2.U();
                    androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = new LazyLayoutItemContentFactory(saveableStateHolder, new yh.a<i>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final i invoke() {
                                return m2Var.getValue();
                            }
                        });
                        pVar2.N(objU);
                    }
                    pVar2.c0();
                    final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) objU;
                    pVar2.T(-492369756);
                    Object objU2 = pVar2.U();
                    if (objU2 == companion.a()) {
                        objU2 = new SubcomposeLayoutState(new k(lazyLayoutItemContentFactory));
                        pVar2.N(objU2);
                    }
                    pVar2.c0();
                    SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) objU2;
                    o oVar11 = oVar10;
                    if (oVar11 != null) {
                        LazyLayoutPrefetcher_androidKt.a(oVar11, lazyLayoutItemContentFactory, subcomposeLayoutState, pVar2, ((i16 >> 6) & 14) | 64 | (SubcomposeLayoutState.f14963f << 6));
                    }
                    androidx.compose.ui.n nVar11 = nVar10;
                    final yh.p<? super m, ? super s1.b, ? extends j0> pVar3 = measurePolicy;
                    pVar2.T(511388516);
                    boolean zS = pVar2.s(lazyLayoutItemContentFactory) | pVar2.s(pVar3);
                    Object objU3 = pVar2.U();
                    if (zS || objU3 == companion.a()) {
                        objU3 = new yh.p<q1, s1.b, j0>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @dl.d
                            public final j0 a(@dl.d q1 q1Var, long j10) {
                                f0.p(q1Var, "$this$null");
                                return pVar3.invoke(new n(lazyLayoutItemContentFactory, q1Var), s1.b.b(j10));
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ j0 invoke(q1 q1Var, s1.b bVar) {
                                return a(q1Var, bVar.getF139216a());
                            }
                        };
                        pVar2.N(objU3);
                    }
                    pVar2.c0();
                    SubcomposeLayoutKt.b(subcomposeLayoutState, nVar11, (yh.p) objU3, pVar2, SubcomposeLayoutState.f14963f | (i16 & 112), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.saveable.b bVar, androidx.compose.runtime.p pVar2, Integer num) {
                    a(bVar, pVar2, num.intValue());
                    return b2.f124493a;
                }
            }), pVarF, 6);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            oVar4 = oVar3;
        } else {
            if (i17 != 0) {
                nVar3 = androidx.compose.ui.n.INSTANCE;
            } else {
                nVar3 = nVar2;
            }
            if (i13 != 0) {
                oVar3 = null;
            } else {
                oVar3 = oVar2;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(852831187, i16, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:41)");
            }
            final m2<? extends i> m2VarT7 = e2.t(itemProvider, pVarF, i16 & 14);
            final o oVar11 = oVar3;
            final androidx.compose.ui.n nVar11 = nVar3;
            LazySaveableStateHolderKt.a(androidx.compose.runtime.internal.b.b(pVarF, 1342877611, true, new yh.q<androidx.compose.runtime.saveable.b, androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.d androidx.compose.runtime.saveable.b saveableStateHolder, @dl.e androidx.compose.runtime.p pVar2, int i18) {
                    f0.p(saveableStateHolder, "saveableStateHolder");
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1342877611, i18, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:49)");
                    }
                    final m2<? extends i> m2Var = m2VarT7;
                    pVar2.T(-492369756);
                    Object objU = pVar2.U();
                    androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = new LazyLayoutItemContentFactory(saveableStateHolder, new yh.a<i>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final i invoke() {
                                return m2Var.getValue();
                            }
                        });
                        pVar2.N(objU);
                    }
                    pVar2.c0();
                    final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) objU;
                    pVar2.T(-492369756);
                    Object objU2 = pVar2.U();
                    if (objU2 == companion.a()) {
                        objU2 = new SubcomposeLayoutState(new k(lazyLayoutItemContentFactory));
                        pVar2.N(objU2);
                    }
                    pVar2.c0();
                    SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) objU2;
                    o oVar12 = oVar11;
                    if (oVar12 != null) {
                        LazyLayoutPrefetcher_androidKt.a(oVar12, lazyLayoutItemContentFactory, subcomposeLayoutState, pVar2, ((i16 >> 6) & 14) | 64 | (SubcomposeLayoutState.f14963f << 6));
                    }
                    androidx.compose.ui.n nVar12 = nVar11;
                    final yh.p<? super m, ? super s1.b, ? extends j0> pVar3 = measurePolicy;
                    pVar2.T(511388516);
                    boolean zS = pVar2.s(lazyLayoutItemContentFactory) | pVar2.s(pVar3);
                    Object objU3 = pVar2.U();
                    if (zS || objU3 == companion.a()) {
                        objU3 = new yh.p<q1, s1.b, j0>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @dl.d
                            public final j0 a(@dl.d q1 q1Var, long j10) {
                                f0.p(q1Var, "$this$null");
                                return pVar3.invoke(new n(lazyLayoutItemContentFactory, q1Var), s1.b.b(j10));
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ j0 invoke(q1 q1Var, s1.b bVar) {
                                return a(q1Var, bVar.getF139216a());
                            }
                        };
                        pVar2.N(objU3);
                    }
                    pVar2.c0();
                    SubcomposeLayoutKt.b(subcomposeLayoutState, nVar12, (yh.p) objU3, pVar2, SubcomposeLayoutState.f14963f | (i16 & 112), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.saveable.b bVar, androidx.compose.runtime.p pVar2, Integer num) {
                    a(bVar, pVar2, num.intValue());
                    return b2.f124493a;
                }
            }), pVarF, 6);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            oVar4 = oVar3;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i18) {
                LazyLayoutKt.a(itemProvider, nVar4, oVar4, measurePolicy, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }
}
