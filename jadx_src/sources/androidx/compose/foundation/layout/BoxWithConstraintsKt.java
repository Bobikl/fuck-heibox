package androidx.compose.foundation.layout;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.u1;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.q1;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: BoxWithConstraints.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aP\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042!\u0010\f\u001a\u001d\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0002\b\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/n;", "modifier", "Landroidx/compose/ui/c;", "contentAlignment", "", "propagateMinConstraints", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/l;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "Landroidx/compose/ui/t;", "Lkotlin/t;", "content", ak.av, "(Landroidx/compose/ui/n;Landroidx/compose/ui/c;ZLyh/q;Landroidx/compose/runtime/p;II)V", "foundation-layout_release"}, k = 2, mv = {1, 7, 1})
public final class BoxWithConstraintsKt {
    @androidx.compose.ui.t
    @androidx.compose.runtime.h
    public static final void a(@dl.e androidx.compose.ui.n nVar, @dl.e androidx.compose.ui.c cVar, boolean z10, @dl.d final yh.q<? super l, ? super androidx.compose.runtime.p, ? super Integer, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        final int i12;
        kotlin.jvm.internal.f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(1781813501);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(nVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= pVarF.s(cVar) ? 32 : 16;
        }
        int i15 = i11 & 4;
        if (i15 != 0) {
            i12 |= bb.c.b.f30966u4;
        } else if ((i10 & bb.c.b.f30796me) == 0) {
            i12 |= pVarF.u(z10) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= bb.c.d.f31193dj;
        } else if ((i10 & bb.c.g.f32954lc) == 0) {
            i12 |= pVarF.s(content) ? 2048 : 1024;
        }
        if ((i12 & bb.c.f.br) == 1170 && pVarF.b()) {
            pVarF.l();
        } else {
            if (i13 != 0) {
                nVar = androidx.compose.ui.n.INSTANCE;
            }
            if (i14 != 0) {
                cVar = androidx.compose.ui.c.INSTANCE.C();
            }
            if (i15 != 0) {
                z10 = false;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(1781813501, i12, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:58)");
            }
            int i16 = i12 >> 3;
            final androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(cVar, z10, pVarF, (i16 & 112) | (i16 & 14));
            pVarF.T(511388516);
            boolean zS = pVarF.s(content) | pVarF.s(i0VarK);
            Object objU = pVarF.U();
            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                objU = new yh.p<q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @dl.d
                    public final androidx.compose.ui.layout.j0 a(@dl.d q1 SubcomposeLayout, long j10) {
                        kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                        final BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = new BoxWithConstraintsScopeImpl(SubcomposeLayout, j10, null);
                        b2 b2Var = b2.f124493a;
                        final yh.q<l, androidx.compose.runtime.p, Integer, b2> qVar = content;
                        final int i17 = i12;
                        return i0VarK.a(SubcomposeLayout, SubcomposeLayout.y1(b2Var, androidx.compose.runtime.internal.b.c(-1945019079, true, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i18) {
                                if ((i18 & 11) == 2 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1945019079, i18, -1, "androidx.compose.foundation.layout.BoxWithConstraints.<anonymous>.<anonymous>.<anonymous> (BoxWithConstraints.kt:68)");
                                }
                                qVar.invoke(boxWithConstraintsScopeImpl, pVar2, Integer.valueOf((i17 >> 6) & 112));
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        })), j10);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(q1 q1Var, s1.b bVar) {
                        return a(q1Var, bVar.getF139216a());
                    }
                };
                pVarF.N(objU);
            }
            pVarF.c0();
            SubcomposeLayoutKt.a(nVar, (yh.p) objU, pVarF, i12 & 14, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        final androidx.compose.ui.n nVar2 = nVar;
        final androidx.compose.ui.c cVar2 = cVar;
        final boolean z11 = z10;
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i17) {
                BoxWithConstraintsKt.a(nVar2, cVar2, z11, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }
}
