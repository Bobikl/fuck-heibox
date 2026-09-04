package androidx.compose.material3;

import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.material.ripple.RippleThemeKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: MaterialTheme.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a@\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010\"\u0014\u0010\u0015\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/o;", "colorScheme", "Landroidx/compose/material3/i1;", "shapes", "Landroidx/compose/material3/e2;", "typography", "Lkotlin/Function0;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "content", ak.av, "(Landroidx/compose/material3/o;Landroidx/compose/material3/i1;Landroidx/compose/material3/e2;Lyh/p;Landroidx/compose/runtime/p;II)V", "Landroidx/compose/foundation/text/selection/v;", ak.aF, "(Landroidx/compose/material3/o;Landroidx/compose/runtime/p;I)Landroidx/compose/foundation/text/selection/v;", "Landroidx/compose/material/ripple/e;", "Landroidx/compose/material/ripple/e;", "DefaultRippleAlpha", "", "b", "F", "TextSelectionBackgroundOpacity", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class MaterialThemeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final RippleAlpha f9758a = new RippleAlpha(0.16f, 0.12f, 0.08f, 0.12f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f9759b = 0.4f;

    @androidx.compose.runtime.i(scheme = "[0[0]]")
    @androidx.compose.runtime.h
    public static final void a(@dl.e ColorScheme colorScheme, @dl.e Shapes shapes, @dl.e Typography typography, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        ColorScheme colorSchemeA;
        int i12;
        Shapes shapesB;
        final Typography typographyC;
        Shapes shapes2;
        int i13;
        kotlin.jvm.internal.f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(-2127166334);
        if ((i10 & 14) == 0) {
            if ((i11 & 1) == 0) {
                colorSchemeA = colorScheme;
                if (pVarF.s(colorSchemeA)) {
                    i13 = 4;
                }
                i12 = i13 | i10;
            } else {
                colorSchemeA = colorScheme;
            }
            i13 = 2;
            i12 = i13 | i10;
        } else {
            colorSchemeA = colorScheme;
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                shapesB = shapes;
                int i14 = pVarF.s(shapesB) ? 32 : 16;
                i12 |= i14;
            } else {
                shapesB = shapes;
            }
            i12 |= i14;
        } else {
            shapesB = shapes;
        }
        if ((i10 & bb.c.b.f30796me) == 0) {
            if ((i11 & 4) == 0) {
                typographyC = typography;
                int i15 = pVarF.s(typographyC) ? 256 : 128;
                i12 |= i15;
            } else {
                typographyC = typography;
            }
            i12 |= i15;
        } else {
            typographyC = typography;
        }
        if ((i11 & 8) != 0) {
            i12 |= bb.c.d.f31193dj;
        } else if ((i10 & bb.c.g.f32954lc) == 0) {
            i12 |= pVarF.s(content) ? 2048 : 1024;
        }
        if ((i12 & bb.c.f.br) == 1170 && pVarF.b()) {
            pVarF.l();
            shapes2 = shapesB;
        } else {
            pVarF.W();
            if ((i10 & 1) == 0 || pVarF.o()) {
                if ((i11 & 1) != 0) {
                    colorSchemeA = o0.f12059a.a(pVarF, 6);
                    i12 &= -15;
                }
                if ((i11 & 2) != 0) {
                    shapesB = o0.f12059a.b(pVarF, 6);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                }
                if ((i11 & 4) != 0) {
                    typographyC = o0.f12059a.c(pVarF, 6);
                    i12 &= -897;
                }
            } else {
                pVarF.l();
                if ((i11 & 1) != 0) {
                    i12 &= -15;
                }
                if ((i11 & 2) != 0) {
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
            }
            final int i16 = i12;
            Shapes shapes3 = shapesB;
            Typography typography2 = typographyC;
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-2127166334, i16, -1, "androidx.compose.material3.MaterialTheme (MaterialTheme.kt:57)");
            }
            pVarF.T(-492369756);
            Object objU = pVarF.U();
            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                ColorScheme colorScheme2 = colorSchemeA;
                objU = colorScheme2.a((536870911 & 1) != 0 ? colorScheme2.v() : 0L, (536870911 & 2) != 0 ? colorScheme2.l() : 0L, (536870911 & 4) != 0 ? colorScheme2.w() : 0L, (536870911 & 8) != 0 ? colorScheme2.m() : 0L, (536870911 & 16) != 0 ? colorScheme2.g() : 0L, (536870911 & 32) != 0 ? colorScheme2.y() : 0L, (536870911 & 64) != 0 ? colorScheme2.n() : 0L, (536870911 & 128) != 0 ? colorScheme2.z() : 0L, (536870911 & 256) != 0 ? colorScheme2.o() : 0L, (536870911 & 512) != 0 ? colorScheme2.D() : 0L, (536870911 & 1024) != 0 ? colorScheme2.r() : 0L, (536870911 & 2048) != 0 ? colorScheme2.E() : 0L, (536870911 & 4096) != 0 ? colorScheme2.s() : 0L, (536870911 & 8192) != 0 ? colorScheme2.c() : 0L, (536870911 & 16384) != 0 ? colorScheme2.i() : 0L, (536870911 & 32768) != 0 ? colorScheme2.A() : 0L, (536870911 & 65536) != 0 ? colorScheme2.p() : 0L, (536870911 & 131072) != 0 ? colorScheme2.C() : 0L, (536870911 & 262144) != 0 ? colorScheme2.q() : 0L, (536870911 & 524288) != 0 ? colorScheme2.B() : 0L, (536870911 & 1048576) != 0 ? colorScheme2.h() : 0L, (536870911 & 2097152) != 0 ? colorScheme2.f() : 0L, (536870911 & 4194304) != 0 ? colorScheme2.d() : 0L, (536870911 & 8388608) != 0 ? colorScheme2.j() : 0L, (536870911 & 16777216) != 0 ? colorScheme2.e() : 0L, (536870911 & 33554432) != 0 ? colorScheme2.k() : 0L, (536870911 & 67108864) != 0 ? colorScheme2.t() : 0L, (536870911 & 134217728) != 0 ? colorScheme2.u() : 0L, (536870911 & 268435456) != 0 ? colorScheme2.x() : 0L);
                pVarF.N(objU);
            }
            pVarF.c0();
            ColorScheme colorScheme3 = (ColorScheme) objU;
            ColorSchemeKt.l(colorScheme3, colorSchemeA);
            shapes2 = shapes3;
            typographyC = typography2;
            CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ColorSchemeKt.g().f(colorScheme3), IndicationKt.a().f(androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVarF, 0, 7)), RippleThemeKt.d().f(n0.f12032b), ShapesKt.c().f(shapes2), TextSelectionColorsKt.c().f(c(colorScheme3, pVarF, 0)), TypographyKt.b().f(typographyC)}, androidx.compose.runtime.internal.b.b(pVarF, -1066563262, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.MaterialThemeKt$MaterialTheme$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i17) {
                    if ((i17 & 11) == 2 && pVar2.b()) {
                        pVar2.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1066563262, i17, -1, "androidx.compose.material3.MaterialTheme.<anonymous> (MaterialTheme.kt:79)");
                    }
                    TextKt.a(typographyC.getBodyLarge(), content, pVar2, (i16 >> 6) & 112);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            }), pVarF, 56);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        final Typography typography3 = typographyC;
        androidx.compose.runtime.u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        final ColorScheme colorScheme4 = colorSchemeA;
        final Shapes shapes4 = shapes2;
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.MaterialThemeKt$MaterialTheme$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i17) {
                MaterialThemeKt.a(colorScheme4, shapes4, typography3, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    @dl.d
    @androidx.compose.runtime.h
    public static final SelectionColors c(@dl.d ColorScheme colorScheme, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(colorScheme, "colorScheme");
        pVar.T(1866455512);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1866455512, i10, -1, "androidx.compose.material3.rememberTextSelectionColors (MaterialTheme.kt:132)");
        }
        long jV = colorScheme.v();
        androidx.compose.ui.graphics.l0 l0VarN = androidx.compose.ui.graphics.l0.n(jV);
        pVar.T(1157296644);
        boolean zS = pVar.s(l0VarN);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = new SelectionColors(jV, androidx.compose.ui.graphics.l0.w(jV, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
            pVar.N(objU);
        }
        pVar.c0();
        SelectionColors selectionColors = (SelectionColors) objU;
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return selectionColors;
    }
}
