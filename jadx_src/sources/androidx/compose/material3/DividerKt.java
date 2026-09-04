package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Divider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Landroidx/compose/ui/n;", "modifier", "Ls1/h;", "thickness", "Landroidx/compose/ui/graphics/l0;", "color", "Lkotlin/b2;", ak.av, "(Landroidx/compose/ui/n;FJLandroidx/compose/runtime/p;II)V", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class DividerKt {
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void a(@dl.e androidx.compose.ui.n nVar, float f10, long j10, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.p pVarF = pVar.F(1562471785);
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
            i12 |= pVarF.w(f10) ? 32 : 16;
        }
        if ((i10 & bb.c.b.f30796me) == 0) {
            i12 |= ((i11 & 4) == 0 && pVarF.z(j10)) ? 256 : 128;
        }
        if ((i12 & bb.c.b.f30586db) == 146 && pVarF.b()) {
            pVarF.l();
        } else {
            pVarF.W();
            if ((i10 & 1) == 0 || pVarF.o()) {
                if (i13 != 0) {
                    nVar = androidx.compose.ui.n.INSTANCE;
                }
                if (i14 != 0) {
                    f10 = q.f12084a.b();
                }
                if ((i11 & 4) != 0) {
                    j10 = q.f12084a.a(pVarF, 6);
                }
            } else {
                pVarF.l();
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(1562471785, i10, -1, "androidx.compose.material3.Divider (Divider.kt:43)");
            }
            pVarF.T(1232935509);
            float fG = s1.h.l(f10, s1.h.f139219c.a()) ? s1.h.g(1.0f / ((s1.e) pVarF.K(CompositionLocalsKt.i())).getF139217b()) : f10;
            pVarF.c0();
            BoxKt.a(BackgroundKt.d(SizeKt.o(SizeKt.n(nVar, 0.0f, 1, null), fG), j10, null, 2, null), pVarF, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        final androidx.compose.ui.n nVar2 = nVar;
        final float f11 = f10;
        final long j11 = j10;
        androidx.compose.runtime.u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.DividerKt$Divider$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i15) {
                DividerKt.a(nVar2, f11, j11, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }
}
