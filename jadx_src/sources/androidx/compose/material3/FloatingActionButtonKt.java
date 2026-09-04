package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.g2;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.r;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: FloatingActionButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ar\u0010\u0010\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001ar\u0010\u0012\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0011\u001ar\u0010\u0013\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0011\u001a}\u0010\u0017\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u008f\u0001\u0010\u001d\u001a\u00020\u00012\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000e2\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\"\u0017\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001d\u0010 \"\u0017\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010 \"\u0017\u0010#\u001a\u00020\u001f8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0010\u0010 \"\u0017\u0010$\u001a\u00020\u001f8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010 \"\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010&\"\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lkotlin/Function0;", "Lkotlin/b2;", "onClick", "Landroidx/compose/ui/n;", "modifier", "Landroidx/compose/ui/graphics/g2;", "shape", "Landroidx/compose/ui/graphics/l0;", "containerColor", "contentColor", "Landroidx/compose/material3/FloatingActionButtonElevation;", "elevation", "Landroidx/compose/foundation/interaction/g;", "interactionSource", "Landroidx/compose/runtime/h;", "content", ak.aF, "(Lyh/a;Landroidx/compose/ui/n;Landroidx/compose/ui/graphics/g2;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/g;Lyh/p;Landroidx/compose/runtime/p;II)V", "e", "d", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/x0;", "Lkotlin/t;", "b", "(Lyh/a;Landroidx/compose/ui/n;Landroidx/compose/ui/graphics/g2;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/g;Lyh/q;Landroidx/compose/runtime/p;II)V", "text", "icon", "", "expanded", ak.av, "(Lyh/p;Lyh/p;Lyh/a;Landroidx/compose/ui/n;ZLandroidx/compose/ui/graphics/g2;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/g;Landroidx/compose/runtime/p;II)V", "Ls1/h;", "F", "ExtendedFabStartIconPadding", "ExtendedFabEndIconPadding", "ExtendedFabTextPadding", "ExtendedFabMinimumWidth", "Landroidx/compose/animation/h;", "Landroidx/compose/animation/h;", "ExtendedFabCollapseAnimation", "Landroidx/compose/animation/f;", "f", "Landroidx/compose/animation/f;", "ExtendedFabExpandAnimation", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class FloatingActionButtonKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f9485a = s1.h.g(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f9486b = s1.h.g(12);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f9487c = s1.h.g(20);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f9488d = s1.h.g(80);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.animation.h f9489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.animation.f f9490f;

    static {
        t0.e0 e0Var = t0.e0.f139658a;
        androidx.compose.animation.h hVarX = EnterExitTransitionKt.x(androidx.compose.animation.core.i.q(100, 0, e0Var.g(), 2, null), 0.0f, 2, null);
        androidx.compose.animation.core.e1 e1VarQ = androidx.compose.animation.core.i.q(500, 0, e0Var.b(), 2, null);
        androidx.compose.ui.c.Companion companion = androidx.compose.ui.c.INSTANCE;
        f9489e = hVarX.c(EnterExitTransitionKt.E(e1VarQ, companion.u(), false, null, 12, null));
        f9490f = EnterExitTransitionKt.v(androidx.compose.animation.core.i.p(200, 100, e0Var.g()), 0.0f, 2, null).c(EnterExitTransitionKt.p(androidx.compose.animation.core.i.q(500, 0, e0Var.b(), 2, null), companion.u(), false, null, 12, null));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0120  */
    /* JADX WARN: Code duplicated, block: B:102:0x0128  */
    /* JADX WARN: Code duplicated, block: B:104:0x012e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0131  */
    /* JADX WARN: Code duplicated, block: B:109:0x013f  */
    /* JADX WARN: Code duplicated, block: B:113:0x015e  */
    /* JADX WARN: Code duplicated, block: B:115:0x016e  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:132:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:135:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:140:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:146:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:149:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:150:0x0203  */
    /* JADX WARN: Code duplicated, block: B:152:0x0206  */
    /* JADX WARN: Code duplicated, block: B:154:0x0218  */
    /* JADX WARN: Code duplicated, block: B:156:0x0227  */
    /* JADX WARN: Code duplicated, block: B:160:0x023b  */
    /* JADX WARN: Code duplicated, block: B:163:0x0293  */
    /* JADX WARN: Code duplicated, block: B:168:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX WARN: Code duplicated, block: B:52:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:90:0x0101  */
    /* JADX WARN: Code duplicated, block: B:92:0x0109  */
    /* JADX WARN: Code duplicated, block: B:93:0x010c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0113  */
    /* JADX WARN: Code duplicated, block: B:99:0x0119  */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void a(@dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> text, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> icon, @dl.d final yh.a<kotlin.b2> onClick, @dl.e androidx.compose.ui.n nVar, boolean z10, @dl.e g2 g2Var, long j10, long j11, @dl.e FloatingActionButtonElevation floatingActionButtonElevation, @dl.e androidx.compose.foundation.interaction.g gVar, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        final int i12;
        int i13;
        int i14;
        long jD;
        long jC;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        int i15;
        int i16;
        androidx.compose.ui.n nVar2;
        boolean z11;
        g2 g2VarE;
        FloatingActionButtonElevation floatingActionButtonElevationC;
        androidx.compose.foundation.interaction.g gVar2;
        final boolean z12;
        FloatingActionButtonElevation floatingActionButtonElevation3;
        g2 g2Var2;
        long j12;
        long j13;
        Object objU;
        final androidx.compose.ui.n nVar3;
        final g2 g2Var3;
        final long j14;
        final FloatingActionButtonElevation floatingActionButtonElevation4;
        final boolean z13;
        final long j15;
        final androidx.compose.foundation.interaction.g gVar3;
        androidx.compose.runtime.u1 u1VarH;
        int i17;
        int i18;
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(icon, "icon");
        kotlin.jvm.internal.f0.p(onClick, "onClick");
        androidx.compose.runtime.p pVarF = pVar.F(-1387401842);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(text) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= pVarF.s(icon) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= bb.c.b.f30966u4;
        } else if ((i10 & bb.c.b.f30796me) == 0) {
            i12 |= pVarF.s(onClick) ? 256 : 128;
        }
        int i19 = i11 & 8;
        if (i19 == 0) {
            if ((i10 & bb.c.g.f32954lc) == 0) {
                i12 |= pVarF.s(nVar) ? 2048 : 1024;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 57344) == 0) {
                    if (pVarF.u(z10)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                if ((i10 & 458752) != 0) {
                    i12 |= ((i11 & 32) == 0 || !pVarF.s(g2Var)) ? 65536 : 131072;
                }
                if ((i10 & 3670016) == 0) {
                    jD = j10;
                    if ((i11 & 64) == 0 || !pVarF.z(jD)) {
                        i18 = 524288;
                    } else {
                        i18 = 1048576;
                    }
                    i12 |= i18;
                } else {
                    jD = j10;
                }
                if ((i10 & 29360128) == 0) {
                    jC = j11;
                    if ((i11 & 128) == 0 || !pVarF.z(jC)) {
                        i17 = 4194304;
                    } else {
                        i17 = 8388608;
                    }
                    i12 |= i17;
                } else {
                    jC = j11;
                }
                if ((i10 & 234881024) == 0) {
                    if ((i11 & 256) == 0) {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                        int i20 = pVarF.s(floatingActionButtonElevation2) ? 67108864 : 33554432;
                        i12 |= i20;
                    } else {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                    }
                    i12 |= i20;
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                i15 = i11 & 512;
                if (i15 != 0) {
                    i12 |= com.google.android.exoplayer2.j.G;
                } else if ((i10 & 1879048192) == 0) {
                    if (pVarF.s(gVar)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i12 |= i16;
                }
                if ((i12 & 1533916891) == 306783378 || !pVarF.b()) {
                    pVarF.W();
                    if ((i10 & 1) != 0 || pVarF.o()) {
                        if (i19 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 32) != 0) {
                            g2VarE = e0.f11833a.e(pVarF, 6);
                            i12 &= -458753;
                        } else {
                            g2VarE = g2Var;
                        }
                        if ((i11 & 64) != 0) {
                            jD = e0.f11833a.d(pVarF, 6);
                            i12 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                            i12 &= -234881025;
                        } else {
                            floatingActionButtonElevationC = floatingActionButtonElevation2;
                        }
                        if (i15 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        z12 = z11;
                        floatingActionButtonElevation3 = floatingActionButtonElevationC;
                        g2Var2 = g2VarE;
                        j12 = jC;
                        j13 = jD;
                    } else {
                        pVarF.l();
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                        }
                        nVar2 = nVar;
                        g2Var2 = g2Var;
                        gVar2 = gVar;
                        j12 = jC;
                        j13 = jD;
                        floatingActionButtonElevation3 = floatingActionButtonElevation2;
                        z12 = z10;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1387401842, i12, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:335)");
                    }
                    androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVarF, 1172118032, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21) {
                            if ((i21 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1172118032, i21, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:355)");
                            }
                            androidx.compose.ui.n nVarO = PaddingKt.o(SizeKt.G(androidx.compose.ui.n.INSTANCE, z12 ? FloatingActionButtonKt.f9488d : t0.p.f140183a.e(), 0.0f, 0.0f, 0.0f, 14, null), z12 ? FloatingActionButtonKt.f9485a : s1.h.g(0), 0.0f, z12 ? FloatingActionButtonKt.f9487c : s1.h.g(0), 0.0f, 10, null);
                            androidx.compose.ui.c.InterfaceC0079c interfaceC0079cQ = androidx.compose.ui.c.INSTANCE.q();
                            Arrangement.d dVarP = z12 ? Arrangement.f5896a.p() : Arrangement.f5896a.f();
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar3 = icon;
                            final int i22 = i12;
                            boolean z14 = z12;
                            final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar4 = text;
                            pVar2.T(693286680);
                            androidx.compose.ui.layout.i0 i0VarD = RowKt.d(dVarP, interfaceC0079cQ, pVar2, 48);
                            pVar2.T(-1323940314);
                            s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA = companion.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarO);
                            if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVar2.h();
                            if (pVar2.D()) {
                                pVar2.L(aVarA);
                            } else {
                                pVar2.d();
                            }
                            pVar2.Y();
                            androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                            Updater.j(pVarB, i0VarD, companion.d());
                            Updater.j(pVarB, eVar, companion.b());
                            Updater.j(pVarB, layoutDirection, companion.c());
                            Updater.j(pVarB, d2Var, companion.f());
                            pVar2.x();
                            qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, 0);
                            pVar2.T(2058660585);
                            pVar2.T(-678309503);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.f6091a;
                            pVar2.T(1368928116);
                            pVar3.invoke(pVar2, Integer.valueOf((i22 >> 3) & 14));
                            AnimatedVisibilityKt.h(rowScopeInstance, z14, null, FloatingActionButtonKt.f9490f, FloatingActionButtonKt.f9489e, null, androidx.compose.runtime.internal.b.b(pVar2, 176242764, true, new yh.q<androidx.compose.animation.c, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d androidx.compose.animation.c AnimatedVisibility, @dl.e androidx.compose.runtime.p pVar5, int i23) {
                                    kotlin.jvm.internal.f0.p(AnimatedVisibility, "$this$AnimatedVisibility");
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(176242764, i23, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:374)");
                                    }
                                    androidx.compose.ui.n.Companion companion2 = androidx.compose.ui.n.INSTANCE;
                                    androidx.compose.ui.n nVarA = SemanticsModifierKt.a(companion2, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5$1$1.1
                                        public final void a(@dl.d r clearAndSetSemantics) {
                                            kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                                        }

                                        @Override // yh.l
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                            a(rVar);
                                            return kotlin.b2.f124493a;
                                        }
                                    });
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar6 = pVar4;
                                    int i24 = i22;
                                    pVar5.T(693286680);
                                    androidx.compose.ui.layout.i0 i0VarD2 = RowKt.d(Arrangement.f5896a.p(), androidx.compose.ui.c.INSTANCE.w(), pVar5, 0);
                                    pVar5.T(-1323940314);
                                    s1.e eVar2 = (s1.e) pVar5.K(CompositionLocalsKt.i());
                                    LayoutDirection layoutDirection2 = (LayoutDirection) pVar5.K(CompositionLocalsKt.p());
                                    androidx.compose.ui.platform.d2 d2Var2 = (androidx.compose.ui.platform.d2) pVar5.K(CompositionLocalsKt.u());
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    yh.a<ComposeUiNode> aVarA2 = companion3.a();
                                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF2 = LayoutKt.f(nVarA);
                                    if (!(pVar5.G() instanceof androidx.compose.runtime.e)) {
                                        ComposablesKt.n();
                                    }
                                    pVar5.h();
                                    if (pVar5.D()) {
                                        pVar5.L(aVarA2);
                                    } else {
                                        pVar5.d();
                                    }
                                    pVar5.Y();
                                    androidx.compose.runtime.p pVarB2 = Updater.b(pVar5);
                                    Updater.j(pVarB2, i0VarD2, companion3.d());
                                    Updater.j(pVarB2, eVar2, companion3.b());
                                    Updater.j(pVarB2, layoutDirection2, companion3.c());
                                    Updater.j(pVarB2, d2Var2, companion3.f());
                                    pVar5.x();
                                    qVarF2.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar5)), pVar5, 0);
                                    pVar5.T(2058660585);
                                    pVar5.T(-678309503);
                                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.f6091a;
                                    pVar5.T(-141102928);
                                    androidx.compose.foundation.layout.b1.a(SizeKt.H(companion2, FloatingActionButtonKt.f9486b), pVar5, 6);
                                    pVar6.invoke(pVar5, Integer.valueOf(i24 & 14));
                                    pVar5.c0();
                                    pVar5.c0();
                                    pVar5.c0();
                                    pVar5.f();
                                    pVar5.c0();
                                    pVar5.c0();
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.animation.c cVar, androidx.compose.runtime.p pVar5, Integer num) {
                                    a(cVar, pVar5, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVar2, 1600518 | ((i22 >> 9) & 112), 18);
                            pVar2.c0();
                            pVar2.c0();
                            pVar2.c0();
                            pVar2.f();
                            pVar2.c0();
                            pVar2.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    int i21 = i12 >> 6;
                    int i22 = i12 >> 9;
                    boolean z14 = z12;
                    c(onClick, nVar2, g2Var2, j13, j12, floatingActionButtonElevation3, gVar2, aVarB, pVarF, 12582912 | (i21 & 14) | (i21 & 112) | (i22 & bb.c.b.f30796me) | (i22 & bb.c.g.f32954lc) | (57344 & i22) | (458752 & i22) | (i22 & 3670016), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    g2Var3 = g2Var2;
                    j14 = j13;
                    floatingActionButtonElevation4 = floatingActionButtonElevation3;
                    z13 = z14;
                    j15 = j12;
                    gVar3 = gVar2;
                } else {
                    pVarF.l();
                    nVar3 = nVar;
                    z13 = z10;
                    g2Var3 = g2Var;
                    FloatingActionButtonElevation floatingActionButtonElevation5 = floatingActionButtonElevation2;
                    gVar3 = gVar;
                    floatingActionButtonElevation4 = floatingActionButtonElevation5;
                    j15 = jC;
                    j14 = jD;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i23) {
                        FloatingActionButtonKt.a(text, icon, onClick, nVar3, z13, g2Var3, j14, j15, floatingActionButtonElevation4, gVar3, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i12 |= 24576;
            if ((i10 & 458752) != 0) {
                i12 |= ((i11 & 32) == 0 || !pVarF.s(g2Var)) ? 65536 : 131072;
            }
            if ((i10 & 3670016) == 0) {
                jD = j10;
                if ((i11 & 64) == 0) {
                    i18 = 524288;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            } else {
                jD = j10;
            }
            if ((i10 & 29360128) == 0) {
                jC = j11;
                if ((i11 & 128) == 0) {
                    i17 = 4194304;
                } else {
                    i17 = 4194304;
                }
                i12 |= i17;
            } else {
                jC = j11;
            }
            if ((i10 & 234881024) == 0) {
                if ((i11 & 256) == 0) {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                    if (pVarF.s(floatingActionButtonElevation2)) {
                    }
                    i12 |= i20;
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                i12 |= i20;
            } else {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
            }
            i15 = i11 & 512;
            if (i15 != 0) {
                i12 |= com.google.android.exoplayer2.j.G;
            } else if ((i10 & 1879048192) == 0) {
                if (pVarF.s(gVar)) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i12 |= i16;
            }
            if ((i12 & 1533916891) == 306783378) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 32) != 0) {
                        g2VarE = e0.f11833a.e(pVarF, 6);
                        i12 &= -458753;
                    } else {
                        g2VarE = g2Var;
                    }
                    if ((i11 & 64) != 0) {
                        jD = e0.f11833a.d(pVarF, 6);
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                        i12 &= -234881025;
                    } else {
                        floatingActionButtonElevationC = floatingActionButtonElevation2;
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    z12 = z11;
                    floatingActionButtonElevation3 = floatingActionButtonElevationC;
                    g2Var2 = g2VarE;
                    j12 = jC;
                    j13 = jD;
                } else {
                    if (i19 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 32) != 0) {
                        g2VarE = e0.f11833a.e(pVarF, 6);
                        i12 &= -458753;
                    } else {
                        g2VarE = g2Var;
                    }
                    if ((i11 & 64) != 0) {
                        jD = e0.f11833a.d(pVarF, 6);
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                        i12 &= -234881025;
                    } else {
                        floatingActionButtonElevationC = floatingActionButtonElevation2;
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    z12 = z11;
                    floatingActionButtonElevation3 = floatingActionButtonElevationC;
                    g2Var2 = g2VarE;
                    j12 = jC;
                    j13 = jD;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1387401842, i12, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:335)");
                }
                androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVarF, 1172118032, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i23) {
                        if ((i23 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1172118032, i23, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:355)");
                        }
                        androidx.compose.ui.n nVarO = PaddingKt.o(SizeKt.G(androidx.compose.ui.n.INSTANCE, z12 ? FloatingActionButtonKt.f9488d : t0.p.f140183a.e(), 0.0f, 0.0f, 0.0f, 14, null), z12 ? FloatingActionButtonKt.f9485a : s1.h.g(0), 0.0f, z12 ? FloatingActionButtonKt.f9487c : s1.h.g(0), 0.0f, 10, null);
                        androidx.compose.ui.c.InterfaceC0079c interfaceC0079cQ = androidx.compose.ui.c.INSTANCE.q();
                        Arrangement.d dVarP = z12 ? Arrangement.f5896a.p() : Arrangement.f5896a.f();
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar3 = icon;
                        final int i24 = i12;
                        boolean z15 = z12;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar4 = text;
                        pVar2.T(693286680);
                        androidx.compose.ui.layout.i0 i0VarD = RowKt.d(dVarP, interfaceC0079cQ, pVar2, 48);
                        pVar2.T(-1323940314);
                        s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA = companion.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarO);
                        if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar2.h();
                        if (pVar2.D()) {
                            pVar2.L(aVarA);
                        } else {
                            pVar2.d();
                        }
                        pVar2.Y();
                        androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                        Updater.j(pVarB, i0VarD, companion.d());
                        Updater.j(pVarB, eVar, companion.b());
                        Updater.j(pVarB, layoutDirection, companion.c());
                        Updater.j(pVarB, d2Var, companion.f());
                        pVar2.x();
                        qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, 0);
                        pVar2.T(2058660585);
                        pVar2.T(-678309503);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.f6091a;
                        pVar2.T(1368928116);
                        pVar3.invoke(pVar2, Integer.valueOf((i24 >> 3) & 14));
                        AnimatedVisibilityKt.h(rowScopeInstance, z15, null, FloatingActionButtonKt.f9490f, FloatingActionButtonKt.f9489e, null, androidx.compose.runtime.internal.b.b(pVar2, 176242764, true, new yh.q<androidx.compose.animation.c, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d androidx.compose.animation.c AnimatedVisibility, @dl.e androidx.compose.runtime.p pVar5, int i25) {
                                kotlin.jvm.internal.f0.p(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(176242764, i25, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:374)");
                                }
                                androidx.compose.ui.n.Companion companion2 = androidx.compose.ui.n.INSTANCE;
                                androidx.compose.ui.n nVarA = SemanticsModifierKt.a(companion2, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5$1$1.1
                                    public final void a(@dl.d r clearAndSetSemantics) {
                                        kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                        a(rVar);
                                        return kotlin.b2.f124493a;
                                    }
                                });
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar6 = pVar4;
                                int i26 = i24;
                                pVar5.T(693286680);
                                androidx.compose.ui.layout.i0 i0VarD2 = RowKt.d(Arrangement.f5896a.p(), androidx.compose.ui.c.INSTANCE.w(), pVar5, 0);
                                pVar5.T(-1323940314);
                                s1.e eVar2 = (s1.e) pVar5.K(CompositionLocalsKt.i());
                                LayoutDirection layoutDirection2 = (LayoutDirection) pVar5.K(CompositionLocalsKt.p());
                                androidx.compose.ui.platform.d2 d2Var2 = (androidx.compose.ui.platform.d2) pVar5.K(CompositionLocalsKt.u());
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                yh.a<ComposeUiNode> aVarA2 = companion3.a();
                                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF2 = LayoutKt.f(nVarA);
                                if (!(pVar5.G() instanceof androidx.compose.runtime.e)) {
                                    ComposablesKt.n();
                                }
                                pVar5.h();
                                if (pVar5.D()) {
                                    pVar5.L(aVarA2);
                                } else {
                                    pVar5.d();
                                }
                                pVar5.Y();
                                androidx.compose.runtime.p pVarB2 = Updater.b(pVar5);
                                Updater.j(pVarB2, i0VarD2, companion3.d());
                                Updater.j(pVarB2, eVar2, companion3.b());
                                Updater.j(pVarB2, layoutDirection2, companion3.c());
                                Updater.j(pVarB2, d2Var2, companion3.f());
                                pVar5.x();
                                qVarF2.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar5)), pVar5, 0);
                                pVar5.T(2058660585);
                                pVar5.T(-678309503);
                                RowScopeInstance rowScopeInstance2 = RowScopeInstance.f6091a;
                                pVar5.T(-141102928);
                                androidx.compose.foundation.layout.b1.a(SizeKt.H(companion2, FloatingActionButtonKt.f9486b), pVar5, 6);
                                pVar6.invoke(pVar5, Integer.valueOf(i26 & 14));
                                pVar5.c0();
                                pVar5.c0();
                                pVar5.c0();
                                pVar5.f();
                                pVar5.c0();
                                pVar5.c0();
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.animation.c cVar, androidx.compose.runtime.p pVar5, Integer num) {
                                a(cVar, pVar5, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVar2, 1600518 | ((i24 >> 9) & 112), 18);
                        pVar2.c0();
                        pVar2.c0();
                        pVar2.c0();
                        pVar2.f();
                        pVar2.c0();
                        pVar2.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                int i23 = i12 >> 6;
                int i24 = i12 >> 9;
                boolean z15 = z12;
                c(onClick, nVar2, g2Var2, j13, j12, floatingActionButtonElevation3, gVar2, aVarB2, pVarF, 12582912 | (i23 & 14) | (i23 & 112) | (i24 & bb.c.b.f30796me) | (i24 & bb.c.g.f32954lc) | (57344 & i24) | (458752 & i24) | (i24 & 3670016), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar3 = nVar2;
                g2Var3 = g2Var2;
                j14 = j13;
                floatingActionButtonElevation4 = floatingActionButtonElevation3;
                z13 = z15;
                j15 = j12;
                gVar3 = gVar2;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 32) != 0) {
                        g2VarE = e0.f11833a.e(pVarF, 6);
                        i12 &= -458753;
                    } else {
                        g2VarE = g2Var;
                    }
                    if ((i11 & 64) != 0) {
                        jD = e0.f11833a.d(pVarF, 6);
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                        i12 &= -234881025;
                    } else {
                        floatingActionButtonElevationC = floatingActionButtonElevation2;
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    z12 = z11;
                    floatingActionButtonElevation3 = floatingActionButtonElevationC;
                    g2Var2 = g2VarE;
                    j12 = jC;
                    j13 = jD;
                } else {
                    if (i19 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 32) != 0) {
                        g2VarE = e0.f11833a.e(pVarF, 6);
                        i12 &= -458753;
                    } else {
                        g2VarE = g2Var;
                    }
                    if ((i11 & 64) != 0) {
                        jD = e0.f11833a.d(pVarF, 6);
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                        i12 &= -234881025;
                    } else {
                        floatingActionButtonElevationC = floatingActionButtonElevation2;
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    z12 = z11;
                    floatingActionButtonElevation3 = floatingActionButtonElevationC;
                    g2Var2 = g2VarE;
                    j12 = jC;
                    j13 = jD;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1387401842, i12, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:335)");
                }
                androidx.compose.runtime.internal.a aVarB3 = androidx.compose.runtime.internal.b.b(pVarF, 1172118032, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i25) {
                        if ((i25 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1172118032, i25, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:355)");
                        }
                        androidx.compose.ui.n nVarO = PaddingKt.o(SizeKt.G(androidx.compose.ui.n.INSTANCE, z12 ? FloatingActionButtonKt.f9488d : t0.p.f140183a.e(), 0.0f, 0.0f, 0.0f, 14, null), z12 ? FloatingActionButtonKt.f9485a : s1.h.g(0), 0.0f, z12 ? FloatingActionButtonKt.f9487c : s1.h.g(0), 0.0f, 10, null);
                        androidx.compose.ui.c.InterfaceC0079c interfaceC0079cQ = androidx.compose.ui.c.INSTANCE.q();
                        Arrangement.d dVarP = z12 ? Arrangement.f5896a.p() : Arrangement.f5896a.f();
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar3 = icon;
                        final int i26 = i12;
                        boolean z16 = z12;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar4 = text;
                        pVar2.T(693286680);
                        androidx.compose.ui.layout.i0 i0VarD = RowKt.d(dVarP, interfaceC0079cQ, pVar2, 48);
                        pVar2.T(-1323940314);
                        s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA = companion.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarO);
                        if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar2.h();
                        if (pVar2.D()) {
                            pVar2.L(aVarA);
                        } else {
                            pVar2.d();
                        }
                        pVar2.Y();
                        androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                        Updater.j(pVarB, i0VarD, companion.d());
                        Updater.j(pVarB, eVar, companion.b());
                        Updater.j(pVarB, layoutDirection, companion.c());
                        Updater.j(pVarB, d2Var, companion.f());
                        pVar2.x();
                        qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, 0);
                        pVar2.T(2058660585);
                        pVar2.T(-678309503);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.f6091a;
                        pVar2.T(1368928116);
                        pVar3.invoke(pVar2, Integer.valueOf((i26 >> 3) & 14));
                        AnimatedVisibilityKt.h(rowScopeInstance, z16, null, FloatingActionButtonKt.f9490f, FloatingActionButtonKt.f9489e, null, androidx.compose.runtime.internal.b.b(pVar2, 176242764, true, new yh.q<androidx.compose.animation.c, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d androidx.compose.animation.c AnimatedVisibility, @dl.e androidx.compose.runtime.p pVar5, int i27) {
                                kotlin.jvm.internal.f0.p(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(176242764, i27, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:374)");
                                }
                                androidx.compose.ui.n.Companion companion2 = androidx.compose.ui.n.INSTANCE;
                                androidx.compose.ui.n nVarA = SemanticsModifierKt.a(companion2, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5$1$1.1
                                    public final void a(@dl.d r clearAndSetSemantics) {
                                        kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                        a(rVar);
                                        return kotlin.b2.f124493a;
                                    }
                                });
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar6 = pVar4;
                                int i28 = i26;
                                pVar5.T(693286680);
                                androidx.compose.ui.layout.i0 i0VarD2 = RowKt.d(Arrangement.f5896a.p(), androidx.compose.ui.c.INSTANCE.w(), pVar5, 0);
                                pVar5.T(-1323940314);
                                s1.e eVar2 = (s1.e) pVar5.K(CompositionLocalsKt.i());
                                LayoutDirection layoutDirection2 = (LayoutDirection) pVar5.K(CompositionLocalsKt.p());
                                androidx.compose.ui.platform.d2 d2Var2 = (androidx.compose.ui.platform.d2) pVar5.K(CompositionLocalsKt.u());
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                yh.a<ComposeUiNode> aVarA2 = companion3.a();
                                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF2 = LayoutKt.f(nVarA);
                                if (!(pVar5.G() instanceof androidx.compose.runtime.e)) {
                                    ComposablesKt.n();
                                }
                                pVar5.h();
                                if (pVar5.D()) {
                                    pVar5.L(aVarA2);
                                } else {
                                    pVar5.d();
                                }
                                pVar5.Y();
                                androidx.compose.runtime.p pVarB2 = Updater.b(pVar5);
                                Updater.j(pVarB2, i0VarD2, companion3.d());
                                Updater.j(pVarB2, eVar2, companion3.b());
                                Updater.j(pVarB2, layoutDirection2, companion3.c());
                                Updater.j(pVarB2, d2Var2, companion3.f());
                                pVar5.x();
                                qVarF2.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar5)), pVar5, 0);
                                pVar5.T(2058660585);
                                pVar5.T(-678309503);
                                RowScopeInstance rowScopeInstance2 = RowScopeInstance.f6091a;
                                pVar5.T(-141102928);
                                androidx.compose.foundation.layout.b1.a(SizeKt.H(companion2, FloatingActionButtonKt.f9486b), pVar5, 6);
                                pVar6.invoke(pVar5, Integer.valueOf(i28 & 14));
                                pVar5.c0();
                                pVar5.c0();
                                pVar5.c0();
                                pVar5.f();
                                pVar5.c0();
                                pVar5.c0();
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.animation.c cVar, androidx.compose.runtime.p pVar5, Integer num) {
                                a(cVar, pVar5, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVar2, 1600518 | ((i26 >> 9) & 112), 18);
                        pVar2.c0();
                        pVar2.c0();
                        pVar2.c0();
                        pVar2.f();
                        pVar2.c0();
                        pVar2.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                int i25 = i12 >> 6;
                int i26 = i12 >> 9;
                boolean z16 = z12;
                c(onClick, nVar2, g2Var2, j13, j12, floatingActionButtonElevation3, gVar2, aVarB3, pVarF, 12582912 | (i25 & 14) | (i25 & 112) | (i26 & bb.c.b.f30796me) | (i26 & bb.c.g.f32954lc) | (57344 & i26) | (458752 & i26) | (i26 & 3670016), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar3 = nVar2;
                g2Var3 = g2Var2;
                j14 = j13;
                floatingActionButtonElevation4 = floatingActionButtonElevation3;
                z13 = z16;
                j15 = j12;
                gVar3 = gVar2;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i27) {
                    FloatingActionButtonKt.a(text, icon, onClick, nVar3, z13, g2Var3, j14, j15, floatingActionButtonElevation4, gVar3, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= bb.c.d.f31193dj;
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((i10 & 57344) == 0) {
                if (pVarF.u(z10)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            if ((i10 & 458752) != 0) {
                i12 |= ((i11 & 32) == 0 || !pVarF.s(g2Var)) ? 65536 : 131072;
            }
            if ((i10 & 3670016) == 0) {
                jD = j10;
                if ((i11 & 64) == 0) {
                    i18 = 524288;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            } else {
                jD = j10;
            }
            if ((i10 & 29360128) == 0) {
                jC = j11;
                if ((i11 & 128) == 0) {
                    i17 = 4194304;
                } else {
                    i17 = 4194304;
                }
                i12 |= i17;
            } else {
                jC = j11;
            }
            if ((i10 & 234881024) == 0) {
                if ((i11 & 256) == 0) {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                    if (pVarF.s(floatingActionButtonElevation2)) {
                    }
                    i12 |= i20;
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                i12 |= i20;
            } else {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
            }
            i15 = i11 & 512;
            if (i15 != 0) {
                i12 |= com.google.android.exoplayer2.j.G;
            } else if ((i10 & 1879048192) == 0) {
                if (pVarF.s(gVar)) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i12 |= i16;
            }
            if ((i12 & 1533916891) == 306783378) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 32) != 0) {
                        g2VarE = e0.f11833a.e(pVarF, 6);
                        i12 &= -458753;
                    } else {
                        g2VarE = g2Var;
                    }
                    if ((i11 & 64) != 0) {
                        jD = e0.f11833a.d(pVarF, 6);
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                        i12 &= -234881025;
                    } else {
                        floatingActionButtonElevationC = floatingActionButtonElevation2;
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    z12 = z11;
                    floatingActionButtonElevation3 = floatingActionButtonElevationC;
                    g2Var2 = g2VarE;
                    j12 = jC;
                    j13 = jD;
                } else {
                    if (i19 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 32) != 0) {
                        g2VarE = e0.f11833a.e(pVarF, 6);
                        i12 &= -458753;
                    } else {
                        g2VarE = g2Var;
                    }
                    if ((i11 & 64) != 0) {
                        jD = e0.f11833a.d(pVarF, 6);
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                        i12 &= -234881025;
                    } else {
                        floatingActionButtonElevationC = floatingActionButtonElevation2;
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    z12 = z11;
                    floatingActionButtonElevation3 = floatingActionButtonElevationC;
                    g2Var2 = g2VarE;
                    j12 = jC;
                    j13 = jD;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1387401842, i12, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:335)");
                }
                androidx.compose.runtime.internal.a aVarB4 = androidx.compose.runtime.internal.b.b(pVarF, 1172118032, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i27) {
                        if ((i27 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1172118032, i27, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:355)");
                        }
                        androidx.compose.ui.n nVarO = PaddingKt.o(SizeKt.G(androidx.compose.ui.n.INSTANCE, z12 ? FloatingActionButtonKt.f9488d : t0.p.f140183a.e(), 0.0f, 0.0f, 0.0f, 14, null), z12 ? FloatingActionButtonKt.f9485a : s1.h.g(0), 0.0f, z12 ? FloatingActionButtonKt.f9487c : s1.h.g(0), 0.0f, 10, null);
                        androidx.compose.ui.c.InterfaceC0079c interfaceC0079cQ = androidx.compose.ui.c.INSTANCE.q();
                        Arrangement.d dVarP = z12 ? Arrangement.f5896a.p() : Arrangement.f5896a.f();
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar3 = icon;
                        final int i28 = i12;
                        boolean z17 = z12;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar4 = text;
                        pVar2.T(693286680);
                        androidx.compose.ui.layout.i0 i0VarD = RowKt.d(dVarP, interfaceC0079cQ, pVar2, 48);
                        pVar2.T(-1323940314);
                        s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA = companion.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarO);
                        if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar2.h();
                        if (pVar2.D()) {
                            pVar2.L(aVarA);
                        } else {
                            pVar2.d();
                        }
                        pVar2.Y();
                        androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                        Updater.j(pVarB, i0VarD, companion.d());
                        Updater.j(pVarB, eVar, companion.b());
                        Updater.j(pVarB, layoutDirection, companion.c());
                        Updater.j(pVarB, d2Var, companion.f());
                        pVar2.x();
                        qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, 0);
                        pVar2.T(2058660585);
                        pVar2.T(-678309503);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.f6091a;
                        pVar2.T(1368928116);
                        pVar3.invoke(pVar2, Integer.valueOf((i28 >> 3) & 14));
                        AnimatedVisibilityKt.h(rowScopeInstance, z17, null, FloatingActionButtonKt.f9490f, FloatingActionButtonKt.f9489e, null, androidx.compose.runtime.internal.b.b(pVar2, 176242764, true, new yh.q<androidx.compose.animation.c, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d androidx.compose.animation.c AnimatedVisibility, @dl.e androidx.compose.runtime.p pVar5, int i29) {
                                kotlin.jvm.internal.f0.p(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(176242764, i29, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:374)");
                                }
                                androidx.compose.ui.n.Companion companion2 = androidx.compose.ui.n.INSTANCE;
                                androidx.compose.ui.n nVarA = SemanticsModifierKt.a(companion2, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5$1$1.1
                                    public final void a(@dl.d r clearAndSetSemantics) {
                                        kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                        a(rVar);
                                        return kotlin.b2.f124493a;
                                    }
                                });
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar6 = pVar4;
                                int i210 = i28;
                                pVar5.T(693286680);
                                androidx.compose.ui.layout.i0 i0VarD2 = RowKt.d(Arrangement.f5896a.p(), androidx.compose.ui.c.INSTANCE.w(), pVar5, 0);
                                pVar5.T(-1323940314);
                                s1.e eVar2 = (s1.e) pVar5.K(CompositionLocalsKt.i());
                                LayoutDirection layoutDirection2 = (LayoutDirection) pVar5.K(CompositionLocalsKt.p());
                                androidx.compose.ui.platform.d2 d2Var2 = (androidx.compose.ui.platform.d2) pVar5.K(CompositionLocalsKt.u());
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                yh.a<ComposeUiNode> aVarA2 = companion3.a();
                                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF2 = LayoutKt.f(nVarA);
                                if (!(pVar5.G() instanceof androidx.compose.runtime.e)) {
                                    ComposablesKt.n();
                                }
                                pVar5.h();
                                if (pVar5.D()) {
                                    pVar5.L(aVarA2);
                                } else {
                                    pVar5.d();
                                }
                                pVar5.Y();
                                androidx.compose.runtime.p pVarB2 = Updater.b(pVar5);
                                Updater.j(pVarB2, i0VarD2, companion3.d());
                                Updater.j(pVarB2, eVar2, companion3.b());
                                Updater.j(pVarB2, layoutDirection2, companion3.c());
                                Updater.j(pVarB2, d2Var2, companion3.f());
                                pVar5.x();
                                qVarF2.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar5)), pVar5, 0);
                                pVar5.T(2058660585);
                                pVar5.T(-678309503);
                                RowScopeInstance rowScopeInstance2 = RowScopeInstance.f6091a;
                                pVar5.T(-141102928);
                                androidx.compose.foundation.layout.b1.a(SizeKt.H(companion2, FloatingActionButtonKt.f9486b), pVar5, 6);
                                pVar6.invoke(pVar5, Integer.valueOf(i210 & 14));
                                pVar5.c0();
                                pVar5.c0();
                                pVar5.c0();
                                pVar5.f();
                                pVar5.c0();
                                pVar5.c0();
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.animation.c cVar, androidx.compose.runtime.p pVar5, Integer num) {
                                a(cVar, pVar5, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVar2, 1600518 | ((i28 >> 9) & 112), 18);
                        pVar2.c0();
                        pVar2.c0();
                        pVar2.c0();
                        pVar2.f();
                        pVar2.c0();
                        pVar2.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                int i27 = i12 >> 6;
                int i28 = i12 >> 9;
                boolean z17 = z12;
                c(onClick, nVar2, g2Var2, j13, j12, floatingActionButtonElevation3, gVar2, aVarB4, pVarF, 12582912 | (i27 & 14) | (i27 & 112) | (i28 & bb.c.b.f30796me) | (i28 & bb.c.g.f32954lc) | (57344 & i28) | (458752 & i28) | (i28 & 3670016), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar3 = nVar2;
                g2Var3 = g2Var2;
                j14 = j13;
                floatingActionButtonElevation4 = floatingActionButtonElevation3;
                z13 = z17;
                j15 = j12;
                gVar3 = gVar2;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 32) != 0) {
                        g2VarE = e0.f11833a.e(pVarF, 6);
                        i12 &= -458753;
                    } else {
                        g2VarE = g2Var;
                    }
                    if ((i11 & 64) != 0) {
                        jD = e0.f11833a.d(pVarF, 6);
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                        i12 &= -234881025;
                    } else {
                        floatingActionButtonElevationC = floatingActionButtonElevation2;
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    z12 = z11;
                    floatingActionButtonElevation3 = floatingActionButtonElevationC;
                    g2Var2 = g2VarE;
                    j12 = jC;
                    j13 = jD;
                } else {
                    if (i19 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 32) != 0) {
                        g2VarE = e0.f11833a.e(pVarF, 6);
                        i12 &= -458753;
                    } else {
                        g2VarE = g2Var;
                    }
                    if ((i11 & 64) != 0) {
                        jD = e0.f11833a.d(pVarF, 6);
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                        i12 &= -234881025;
                    } else {
                        floatingActionButtonElevationC = floatingActionButtonElevation2;
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    z12 = z11;
                    floatingActionButtonElevation3 = floatingActionButtonElevationC;
                    g2Var2 = g2VarE;
                    j12 = jC;
                    j13 = jD;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1387401842, i12, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:335)");
                }
                androidx.compose.runtime.internal.a aVarB5 = androidx.compose.runtime.internal.b.b(pVarF, 1172118032, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i29) {
                        if ((i29 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1172118032, i29, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:355)");
                        }
                        androidx.compose.ui.n nVarO = PaddingKt.o(SizeKt.G(androidx.compose.ui.n.INSTANCE, z12 ? FloatingActionButtonKt.f9488d : t0.p.f140183a.e(), 0.0f, 0.0f, 0.0f, 14, null), z12 ? FloatingActionButtonKt.f9485a : s1.h.g(0), 0.0f, z12 ? FloatingActionButtonKt.f9487c : s1.h.g(0), 0.0f, 10, null);
                        androidx.compose.ui.c.InterfaceC0079c interfaceC0079cQ = androidx.compose.ui.c.INSTANCE.q();
                        Arrangement.d dVarP = z12 ? Arrangement.f5896a.p() : Arrangement.f5896a.f();
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar3 = icon;
                        final int i210 = i12;
                        boolean z18 = z12;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar4 = text;
                        pVar2.T(693286680);
                        androidx.compose.ui.layout.i0 i0VarD = RowKt.d(dVarP, interfaceC0079cQ, pVar2, 48);
                        pVar2.T(-1323940314);
                        s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA = companion.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarO);
                        if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar2.h();
                        if (pVar2.D()) {
                            pVar2.L(aVarA);
                        } else {
                            pVar2.d();
                        }
                        pVar2.Y();
                        androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                        Updater.j(pVarB, i0VarD, companion.d());
                        Updater.j(pVarB, eVar, companion.b());
                        Updater.j(pVarB, layoutDirection, companion.c());
                        Updater.j(pVarB, d2Var, companion.f());
                        pVar2.x();
                        qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, 0);
                        pVar2.T(2058660585);
                        pVar2.T(-678309503);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.f6091a;
                        pVar2.T(1368928116);
                        pVar3.invoke(pVar2, Integer.valueOf((i210 >> 3) & 14));
                        AnimatedVisibilityKt.h(rowScopeInstance, z18, null, FloatingActionButtonKt.f9490f, FloatingActionButtonKt.f9489e, null, androidx.compose.runtime.internal.b.b(pVar2, 176242764, true, new yh.q<androidx.compose.animation.c, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d androidx.compose.animation.c AnimatedVisibility, @dl.e androidx.compose.runtime.p pVar5, int i211) {
                                kotlin.jvm.internal.f0.p(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(176242764, i211, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:374)");
                                }
                                androidx.compose.ui.n.Companion companion2 = androidx.compose.ui.n.INSTANCE;
                                androidx.compose.ui.n nVarA = SemanticsModifierKt.a(companion2, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5$1$1.1
                                    public final void a(@dl.d r clearAndSetSemantics) {
                                        kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                        a(rVar);
                                        return kotlin.b2.f124493a;
                                    }
                                });
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar6 = pVar4;
                                int i212 = i210;
                                pVar5.T(693286680);
                                androidx.compose.ui.layout.i0 i0VarD2 = RowKt.d(Arrangement.f5896a.p(), androidx.compose.ui.c.INSTANCE.w(), pVar5, 0);
                                pVar5.T(-1323940314);
                                s1.e eVar2 = (s1.e) pVar5.K(CompositionLocalsKt.i());
                                LayoutDirection layoutDirection2 = (LayoutDirection) pVar5.K(CompositionLocalsKt.p());
                                androidx.compose.ui.platform.d2 d2Var2 = (androidx.compose.ui.platform.d2) pVar5.K(CompositionLocalsKt.u());
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                yh.a<ComposeUiNode> aVarA2 = companion3.a();
                                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF2 = LayoutKt.f(nVarA);
                                if (!(pVar5.G() instanceof androidx.compose.runtime.e)) {
                                    ComposablesKt.n();
                                }
                                pVar5.h();
                                if (pVar5.D()) {
                                    pVar5.L(aVarA2);
                                } else {
                                    pVar5.d();
                                }
                                pVar5.Y();
                                androidx.compose.runtime.p pVarB2 = Updater.b(pVar5);
                                Updater.j(pVarB2, i0VarD2, companion3.d());
                                Updater.j(pVarB2, eVar2, companion3.b());
                                Updater.j(pVarB2, layoutDirection2, companion3.c());
                                Updater.j(pVarB2, d2Var2, companion3.f());
                                pVar5.x();
                                qVarF2.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar5)), pVar5, 0);
                                pVar5.T(2058660585);
                                pVar5.T(-678309503);
                                RowScopeInstance rowScopeInstance2 = RowScopeInstance.f6091a;
                                pVar5.T(-141102928);
                                androidx.compose.foundation.layout.b1.a(SizeKt.H(companion2, FloatingActionButtonKt.f9486b), pVar5, 6);
                                pVar6.invoke(pVar5, Integer.valueOf(i212 & 14));
                                pVar5.c0();
                                pVar5.c0();
                                pVar5.c0();
                                pVar5.f();
                                pVar5.c0();
                                pVar5.c0();
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.animation.c cVar, androidx.compose.runtime.p pVar5, Integer num) {
                                a(cVar, pVar5, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVar2, 1600518 | ((i210 >> 9) & 112), 18);
                        pVar2.c0();
                        pVar2.c0();
                        pVar2.c0();
                        pVar2.f();
                        pVar2.c0();
                        pVar2.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                int i29 = i12 >> 6;
                int i210 = i12 >> 9;
                boolean z18 = z12;
                c(onClick, nVar2, g2Var2, j13, j12, floatingActionButtonElevation3, gVar2, aVarB5, pVarF, 12582912 | (i29 & 14) | (i29 & 112) | (i210 & bb.c.b.f30796me) | (i210 & bb.c.g.f32954lc) | (57344 & i210) | (458752 & i210) | (i210 & 3670016), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar3 = nVar2;
                g2Var3 = g2Var2;
                j14 = j13;
                floatingActionButtonElevation4 = floatingActionButtonElevation3;
                z13 = z18;
                j15 = j12;
                gVar3 = gVar2;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i211) {
                    FloatingActionButtonKt.a(text, icon, onClick, nVar3, z13, g2Var3, j14, j15, floatingActionButtonElevation4, gVar3, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= 24576;
        if ((i10 & 458752) != 0) {
            i12 |= ((i11 & 32) == 0 || !pVarF.s(g2Var)) ? 65536 : 131072;
        }
        if ((i10 & 3670016) == 0) {
            jD = j10;
            if ((i11 & 64) == 0) {
                i18 = 524288;
            } else {
                i18 = 524288;
            }
            i12 |= i18;
        } else {
            jD = j10;
        }
        if ((i10 & 29360128) == 0) {
            jC = j11;
            if ((i11 & 128) == 0) {
                i17 = 4194304;
            } else {
                i17 = 4194304;
            }
            i12 |= i17;
        } else {
            jC = j11;
        }
        if ((i10 & 234881024) == 0) {
            if ((i11 & 256) == 0) {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
                if (pVarF.s(floatingActionButtonElevation2)) {
                }
                i12 |= i20;
            } else {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
            }
            i12 |= i20;
        } else {
            floatingActionButtonElevation2 = floatingActionButtonElevation;
        }
        i15 = i11 & 512;
        if (i15 != 0) {
            i12 |= com.google.android.exoplayer2.j.G;
        } else if ((i10 & 1879048192) == 0) {
            if (pVarF.s(gVar)) {
                i16 = 536870912;
            } else {
                i16 = 268435456;
            }
            i12 |= i16;
        }
        if ((i12 & 1533916891) == 306783378) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i13 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if ((i11 & 32) != 0) {
                    g2VarE = e0.f11833a.e(pVarF, 6);
                    i12 &= -458753;
                } else {
                    g2VarE = g2Var;
                }
                if ((i11 & 64) != 0) {
                    jD = e0.f11833a.d(pVarF, 6);
                    i12 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 18) & 14);
                    i12 &= -29360129;
                }
                if ((i11 & 256) != 0) {
                    floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                    i12 &= -234881025;
                } else {
                    floatingActionButtonElevationC = floatingActionButtonElevation2;
                }
                if (i15 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar2 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar2 = gVar;
                }
                z12 = z11;
                floatingActionButtonElevation3 = floatingActionButtonElevationC;
                g2Var2 = g2VarE;
                j12 = jC;
                j13 = jD;
            } else {
                if (i19 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i13 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if ((i11 & 32) != 0) {
                    g2VarE = e0.f11833a.e(pVarF, 6);
                    i12 &= -458753;
                } else {
                    g2VarE = g2Var;
                }
                if ((i11 & 64) != 0) {
                    jD = e0.f11833a.d(pVarF, 6);
                    i12 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 18) & 14);
                    i12 &= -29360129;
                }
                if ((i11 & 256) != 0) {
                    floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                    i12 &= -234881025;
                } else {
                    floatingActionButtonElevationC = floatingActionButtonElevation2;
                }
                if (i15 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar2 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar2 = gVar;
                }
                z12 = z11;
                floatingActionButtonElevation3 = floatingActionButtonElevationC;
                g2Var2 = g2VarE;
                j12 = jC;
                j13 = jD;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1387401842, i12, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:335)");
            }
            androidx.compose.runtime.internal.a aVarB6 = androidx.compose.runtime.internal.b.b(pVarF, 1172118032, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i211) {
                    if ((i211 & 11) == 2 && pVar2.b()) {
                        pVar2.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1172118032, i211, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:355)");
                    }
                    androidx.compose.ui.n nVarO = PaddingKt.o(SizeKt.G(androidx.compose.ui.n.INSTANCE, z12 ? FloatingActionButtonKt.f9488d : t0.p.f140183a.e(), 0.0f, 0.0f, 0.0f, 14, null), z12 ? FloatingActionButtonKt.f9485a : s1.h.g(0), 0.0f, z12 ? FloatingActionButtonKt.f9487c : s1.h.g(0), 0.0f, 10, null);
                    androidx.compose.ui.c.InterfaceC0079c interfaceC0079cQ = androidx.compose.ui.c.INSTANCE.q();
                    Arrangement.d dVarP = z12 ? Arrangement.f5896a.p() : Arrangement.f5896a.f();
                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar3 = icon;
                    final int i212 = i12;
                    boolean z19 = z12;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar4 = text;
                    pVar2.T(693286680);
                    androidx.compose.ui.layout.i0 i0VarD = RowKt.d(dVarP, interfaceC0079cQ, pVar2, 48);
                    pVar2.T(-1323940314);
                    s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                    androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    yh.a<ComposeUiNode> aVarA = companion.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarO);
                    if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVar2.h();
                    if (pVar2.D()) {
                        pVar2.L(aVarA);
                    } else {
                        pVar2.d();
                    }
                    pVar2.Y();
                    androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                    Updater.j(pVarB, i0VarD, companion.d());
                    Updater.j(pVarB, eVar, companion.b());
                    Updater.j(pVarB, layoutDirection, companion.c());
                    Updater.j(pVarB, d2Var, companion.f());
                    pVar2.x();
                    qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, 0);
                    pVar2.T(2058660585);
                    pVar2.T(-678309503);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.f6091a;
                    pVar2.T(1368928116);
                    pVar3.invoke(pVar2, Integer.valueOf((i212 >> 3) & 14));
                    AnimatedVisibilityKt.h(rowScopeInstance, z19, null, FloatingActionButtonKt.f9490f, FloatingActionButtonKt.f9489e, null, androidx.compose.runtime.internal.b.b(pVar2, 176242764, true, new yh.q<androidx.compose.animation.c, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d androidx.compose.animation.c AnimatedVisibility, @dl.e androidx.compose.runtime.p pVar5, int i213) {
                            kotlin.jvm.internal.f0.p(AnimatedVisibility, "$this$AnimatedVisibility");
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(176242764, i213, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:374)");
                            }
                            androidx.compose.ui.n.Companion companion2 = androidx.compose.ui.n.INSTANCE;
                            androidx.compose.ui.n nVarA = SemanticsModifierKt.a(companion2, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5$1$1.1
                                public final void a(@dl.d r clearAndSetSemantics) {
                                    kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                    a(rVar);
                                    return kotlin.b2.f124493a;
                                }
                            });
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar6 = pVar4;
                            int i214 = i212;
                            pVar5.T(693286680);
                            androidx.compose.ui.layout.i0 i0VarD2 = RowKt.d(Arrangement.f5896a.p(), androidx.compose.ui.c.INSTANCE.w(), pVar5, 0);
                            pVar5.T(-1323940314);
                            s1.e eVar2 = (s1.e) pVar5.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection2 = (LayoutDirection) pVar5.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var2 = (androidx.compose.ui.platform.d2) pVar5.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA2 = companion3.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF2 = LayoutKt.f(nVarA);
                            if (!(pVar5.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVar5.h();
                            if (pVar5.D()) {
                                pVar5.L(aVarA2);
                            } else {
                                pVar5.d();
                            }
                            pVar5.Y();
                            androidx.compose.runtime.p pVarB2 = Updater.b(pVar5);
                            Updater.j(pVarB2, i0VarD2, companion3.d());
                            Updater.j(pVarB2, eVar2, companion3.b());
                            Updater.j(pVarB2, layoutDirection2, companion3.c());
                            Updater.j(pVarB2, d2Var2, companion3.f());
                            pVar5.x();
                            qVarF2.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar5)), pVar5, 0);
                            pVar5.T(2058660585);
                            pVar5.T(-678309503);
                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.f6091a;
                            pVar5.T(-141102928);
                            androidx.compose.foundation.layout.b1.a(SizeKt.H(companion2, FloatingActionButtonKt.f9486b), pVar5, 6);
                            pVar6.invoke(pVar5, Integer.valueOf(i214 & 14));
                            pVar5.c0();
                            pVar5.c0();
                            pVar5.c0();
                            pVar5.f();
                            pVar5.c0();
                            pVar5.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.animation.c cVar, androidx.compose.runtime.p pVar5, Integer num) {
                            a(cVar, pVar5, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVar2, 1600518 | ((i212 >> 9) & 112), 18);
                    pVar2.c0();
                    pVar2.c0();
                    pVar2.c0();
                    pVar2.f();
                    pVar2.c0();
                    pVar2.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
            int i211 = i12 >> 6;
            int i212 = i12 >> 9;
            boolean z19 = z12;
            c(onClick, nVar2, g2Var2, j13, j12, floatingActionButtonElevation3, gVar2, aVarB6, pVarF, 12582912 | (i211 & 14) | (i211 & 112) | (i212 & bb.c.b.f30796me) | (i212 & bb.c.g.f32954lc) | (57344 & i212) | (458752 & i212) | (i212 & 3670016), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar3 = nVar2;
            g2Var3 = g2Var2;
            j14 = j13;
            floatingActionButtonElevation4 = floatingActionButtonElevation3;
            z13 = z19;
            j15 = j12;
            gVar3 = gVar2;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i13 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if ((i11 & 32) != 0) {
                    g2VarE = e0.f11833a.e(pVarF, 6);
                    i12 &= -458753;
                } else {
                    g2VarE = g2Var;
                }
                if ((i11 & 64) != 0) {
                    jD = e0.f11833a.d(pVarF, 6);
                    i12 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 18) & 14);
                    i12 &= -29360129;
                }
                if ((i11 & 256) != 0) {
                    floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                    i12 &= -234881025;
                } else {
                    floatingActionButtonElevationC = floatingActionButtonElevation2;
                }
                if (i15 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar2 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar2 = gVar;
                }
                z12 = z11;
                floatingActionButtonElevation3 = floatingActionButtonElevationC;
                g2Var2 = g2VarE;
                j12 = jC;
                j13 = jD;
            } else {
                if (i19 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i13 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if ((i11 & 32) != 0) {
                    g2VarE = e0.f11833a.e(pVarF, 6);
                    i12 &= -458753;
                } else {
                    g2VarE = g2Var;
                }
                if ((i11 & 64) != 0) {
                    jD = e0.f11833a.d(pVarF, 6);
                    i12 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 18) & 14);
                    i12 &= -29360129;
                }
                if ((i11 & 256) != 0) {
                    floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                    i12 &= -234881025;
                } else {
                    floatingActionButtonElevationC = floatingActionButtonElevation2;
                }
                if (i15 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar2 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar2 = gVar;
                }
                z12 = z11;
                floatingActionButtonElevation3 = floatingActionButtonElevationC;
                g2Var2 = g2VarE;
                j12 = jC;
                j13 = jD;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1387401842, i12, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:335)");
            }
            androidx.compose.runtime.internal.a aVarB7 = androidx.compose.runtime.internal.b.b(pVarF, 1172118032, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i213) {
                    if ((i213 & 11) == 2 && pVar2.b()) {
                        pVar2.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1172118032, i213, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:355)");
                    }
                    androidx.compose.ui.n nVarO = PaddingKt.o(SizeKt.G(androidx.compose.ui.n.INSTANCE, z12 ? FloatingActionButtonKt.f9488d : t0.p.f140183a.e(), 0.0f, 0.0f, 0.0f, 14, null), z12 ? FloatingActionButtonKt.f9485a : s1.h.g(0), 0.0f, z12 ? FloatingActionButtonKt.f9487c : s1.h.g(0), 0.0f, 10, null);
                    androidx.compose.ui.c.InterfaceC0079c interfaceC0079cQ = androidx.compose.ui.c.INSTANCE.q();
                    Arrangement.d dVarP = z12 ? Arrangement.f5896a.p() : Arrangement.f5896a.f();
                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar3 = icon;
                    final int i214 = i12;
                    boolean z110 = z12;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar4 = text;
                    pVar2.T(693286680);
                    androidx.compose.ui.layout.i0 i0VarD = RowKt.d(dVarP, interfaceC0079cQ, pVar2, 48);
                    pVar2.T(-1323940314);
                    s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                    androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    yh.a<ComposeUiNode> aVarA = companion.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarO);
                    if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVar2.h();
                    if (pVar2.D()) {
                        pVar2.L(aVarA);
                    } else {
                        pVar2.d();
                    }
                    pVar2.Y();
                    androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                    Updater.j(pVarB, i0VarD, companion.d());
                    Updater.j(pVarB, eVar, companion.b());
                    Updater.j(pVarB, layoutDirection, companion.c());
                    Updater.j(pVarB, d2Var, companion.f());
                    pVar2.x();
                    qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, 0);
                    pVar2.T(2058660585);
                    pVar2.T(-678309503);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.f6091a;
                    pVar2.T(1368928116);
                    pVar3.invoke(pVar2, Integer.valueOf((i214 >> 3) & 14));
                    AnimatedVisibilityKt.h(rowScopeInstance, z110, null, FloatingActionButtonKt.f9490f, FloatingActionButtonKt.f9489e, null, androidx.compose.runtime.internal.b.b(pVar2, 176242764, true, new yh.q<androidx.compose.animation.c, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d androidx.compose.animation.c AnimatedVisibility, @dl.e androidx.compose.runtime.p pVar5, int i215) {
                            kotlin.jvm.internal.f0.p(AnimatedVisibility, "$this$AnimatedVisibility");
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(176242764, i215, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:374)");
                            }
                            androidx.compose.ui.n.Companion companion2 = androidx.compose.ui.n.INSTANCE;
                            androidx.compose.ui.n nVarA = SemanticsModifierKt.a(companion2, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5$1$1.1
                                public final void a(@dl.d r clearAndSetSemantics) {
                                    kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                    a(rVar);
                                    return kotlin.b2.f124493a;
                                }
                            });
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar6 = pVar4;
                            int i216 = i214;
                            pVar5.T(693286680);
                            androidx.compose.ui.layout.i0 i0VarD2 = RowKt.d(Arrangement.f5896a.p(), androidx.compose.ui.c.INSTANCE.w(), pVar5, 0);
                            pVar5.T(-1323940314);
                            s1.e eVar2 = (s1.e) pVar5.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection2 = (LayoutDirection) pVar5.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var2 = (androidx.compose.ui.platform.d2) pVar5.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA2 = companion3.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF2 = LayoutKt.f(nVarA);
                            if (!(pVar5.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVar5.h();
                            if (pVar5.D()) {
                                pVar5.L(aVarA2);
                            } else {
                                pVar5.d();
                            }
                            pVar5.Y();
                            androidx.compose.runtime.p pVarB2 = Updater.b(pVar5);
                            Updater.j(pVarB2, i0VarD2, companion3.d());
                            Updater.j(pVarB2, eVar2, companion3.b());
                            Updater.j(pVarB2, layoutDirection2, companion3.c());
                            Updater.j(pVarB2, d2Var2, companion3.f());
                            pVar5.x();
                            qVarF2.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar5)), pVar5, 0);
                            pVar5.T(2058660585);
                            pVar5.T(-678309503);
                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.f6091a;
                            pVar5.T(-141102928);
                            androidx.compose.foundation.layout.b1.a(SizeKt.H(companion2, FloatingActionButtonKt.f9486b), pVar5, 6);
                            pVar6.invoke(pVar5, Integer.valueOf(i216 & 14));
                            pVar5.c0();
                            pVar5.c0();
                            pVar5.c0();
                            pVar5.f();
                            pVar5.c0();
                            pVar5.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.animation.c cVar, androidx.compose.runtime.p pVar5, Integer num) {
                            a(cVar, pVar5, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVar2, 1600518 | ((i214 >> 9) & 112), 18);
                    pVar2.c0();
                    pVar2.c0();
                    pVar2.c0();
                    pVar2.f();
                    pVar2.c0();
                    pVar2.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
            int i213 = i12 >> 6;
            int i214 = i12 >> 9;
            boolean z110 = z12;
            c(onClick, nVar2, g2Var2, j13, j12, floatingActionButtonElevation3, gVar2, aVarB7, pVarF, 12582912 | (i213 & 14) | (i213 & 112) | (i214 & bb.c.b.f30796me) | (i214 & bb.c.g.f32954lc) | (57344 & i214) | (458752 & i214) | (i214 & 3670016), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar3 = nVar2;
            g2Var3 = g2Var2;
            j14 = j13;
            floatingActionButtonElevation4 = floatingActionButtonElevation3;
            z13 = z110;
            j15 = j12;
            gVar3 = gVar2;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i215) {
                FloatingActionButtonKt.a(text, icon, onClick, nVar3, z13, g2Var3, j14, j15, floatingActionButtonElevation4, gVar3, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0151 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0153  */
    /* JADX WARN: Code duplicated, block: B:115:0x0156  */
    /* JADX WARN: Code duplicated, block: B:118:0x015d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0168  */
    /* JADX WARN: Code duplicated, block: B:122:0x016e  */
    /* JADX WARN: Code duplicated, block: B:125:0x017b  */
    /* JADX WARN: Code duplicated, block: B:126:0x018c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0194  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:132:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:134:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:136:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:139:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:142:0x0234  */
    /* JADX WARN: Code duplicated, block: B:147:0x024a  */
    /* JADX WARN: Code duplicated, block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00da  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:93:0x0115  */
    /* JADX WARN: Code duplicated, block: B:95:0x0122  */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void b(@dl.d final yh.a<kotlin.b2> onClick, @dl.e androidx.compose.ui.n nVar, @dl.e g2 g2Var, long j10, long j11, @dl.e FloatingActionButtonElevation floatingActionButtonElevation, @dl.e androidx.compose.foundation.interaction.g gVar, @dl.d final yh.q<? super androidx.compose.foundation.layout.x0, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        final int i12;
        g2 g2Var2;
        long jD;
        long j12;
        FloatingActionButtonElevation floatingActionButtonElevationC;
        int i13;
        final androidx.compose.foundation.interaction.g gVar2;
        int i14;
        int i15;
        androidx.compose.ui.n nVar2;
        g2 g2VarE;
        int i16;
        long jC;
        androidx.compose.ui.n nVar3;
        Object objU;
        androidx.compose.foundation.interaction.g gVar3;
        final androidx.compose.ui.n nVar4;
        final FloatingActionButtonElevation floatingActionButtonElevation2;
        final g2 g2Var3;
        final long j13;
        final long j14;
        androidx.compose.runtime.u1 u1VarH;
        int i17;
        kotlin.jvm.internal.f0.p(onClick, "onClick");
        kotlin.jvm.internal.f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(-326283107);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(onClick) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & 112) == 0) {
                i12 |= pVarF.s(nVar) ? 32 : 16;
            }
            if ((i10 & bb.c.b.f30796me) == 0) {
                if ((i11 & 4) == 0) {
                    g2Var2 = g2Var;
                    int i19 = pVarF.s(g2Var2) ? 256 : 128;
                    i12 |= i19;
                } else {
                    g2Var2 = g2Var;
                }
                i12 |= i19;
            } else {
                g2Var2 = g2Var;
            }
            if ((i10 & bb.c.g.f32954lc) == 0) {
                if ((i11 & 8) == 0) {
                    jD = j10;
                    int i20 = pVarF.z(jD) ? 2048 : 1024;
                    i12 |= i20;
                } else {
                    jD = j10;
                }
                i12 |= i20;
            } else {
                jD = j10;
            }
            if ((i10 & 57344) == 0) {
                if ((i11 & 16) == 0) {
                    j12 = j11;
                    int i21 = pVarF.z(j12) ? 16384 : 8192;
                    i12 |= i21;
                } else {
                    j12 = j11;
                }
                i12 |= i21;
            } else {
                j12 = j11;
            }
            if ((i10 & 458752) == 0) {
                floatingActionButtonElevationC = floatingActionButtonElevation;
                if ((i11 & 32) == 0 || !pVarF.s(floatingActionButtonElevationC)) {
                    i17 = 65536;
                } else {
                    i17 = 131072;
                }
                i12 |= i17;
            } else {
                floatingActionButtonElevationC = floatingActionButtonElevation;
            }
            i13 = i11 & 64;
            if (i13 != 0) {
                i12 |= 1572864;
                gVar2 = gVar;
            } else {
                gVar2 = gVar;
                if ((i10 & 3670016) == 0) {
                    if (pVarF.s(gVar2)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i12 |= i14;
                }
            }
            if ((i11 & 128) != 0) {
                i12 |= 12582912;
            } else if ((29360128 & i10) == 0) {
                if (pVarF.s(content)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i12 |= i15;
            }
            if ((23967451 & i12) == 4793490 || !pVarF.b()) {
                pVarF.W();
                if ((i10 & 1) != 0 || pVarF.o()) {
                    if (i18 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        g2VarE = e0.f11833a.e(pVarF, 6);
                    } else {
                        g2VarE = g2Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jD = e0.f11833a.d(pVarF, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                    } else {
                        i16 = i12;
                        jC = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                    }
                    FloatingActionButtonElevation floatingActionButtonElevation3 = floatingActionButtonElevationC;
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-326283107, i12, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:268)");
                    }
                    c(onClick, nVar3, g2VarE, jD, jC, floatingActionButtonElevation3, gVar3, androidx.compose.runtime.internal.b.b(pVarF, 398457247, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i22) {
                            if ((i22 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(398457247, i22, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:286)");
                            }
                            androidx.compose.ui.n nVarM = PaddingKt.m(SizeKt.G(androidx.compose.ui.n.INSTANCE, FloatingActionButtonKt.f9488d, 0.0f, 0.0f, 0.0f, 14, null), FloatingActionButtonKt.f9487c, 0.0f, 2, null);
                            Arrangement.e eVarF = Arrangement.f5896a.f();
                            androidx.compose.ui.c.InterfaceC0079c interfaceC0079cQ = androidx.compose.ui.c.INSTANCE.q();
                            yh.q<androidx.compose.foundation.layout.x0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            int i23 = ((i12 >> 12) & bb.c.g.f32954lc) | bb.c.b.f31011w5;
                            pVar2.T(693286680);
                            int i24 = i23 >> 3;
                            androidx.compose.ui.layout.i0 i0VarD = RowKt.d(eVarF, interfaceC0079cQ, pVar2, (i24 & 112) | (i24 & 14));
                            pVar2.T(-1323940314);
                            s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA = companion.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarM);
                            int i25 = ((((i23 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                            if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVar2.h();
                            if (pVar2.D()) {
                                pVar2.L(aVarA);
                            } else {
                                pVar2.d();
                            }
                            pVar2.Y();
                            androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                            Updater.j(pVarB, i0VarD, companion.d());
                            Updater.j(pVarB, eVar, companion.b());
                            Updater.j(pVarB, layoutDirection, companion.c());
                            Updater.j(pVarB, d2Var, companion.f());
                            pVar2.x();
                            qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, Integer.valueOf((i25 >> 3) & 112));
                            pVar2.T(2058660585);
                            pVar2.T(-678309503);
                            if (((i25 >> 9) & 14 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                            } else {
                                qVar.invoke(RowScopeInstance.f6091a, pVar2, Integer.valueOf(((i23 >> 6) & 112) | 6));
                            }
                            pVar2.c0();
                            pVar2.c0();
                            pVar2.f();
                            pVar2.c0();
                            pVar2.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (458752 & i12) | (i12 & 3670016), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    floatingActionButtonElevation2 = floatingActionButtonElevation3;
                    gVar2 = gVar3;
                    g2Var3 = g2VarE;
                    j13 = jC;
                    j14 = jD;
                } else {
                    pVarF.l();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                    }
                    nVar3 = nVar;
                    g2VarE = g2Var2;
                    jD = jD;
                    jC = j12;
                }
                gVar3 = gVar2;
                FloatingActionButtonElevation floatingActionButtonElevation4 = floatingActionButtonElevationC;
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-326283107, i12, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:268)");
                }
                c(onClick, nVar3, g2VarE, jD, jC, floatingActionButtonElevation4, gVar3, androidx.compose.runtime.internal.b.b(pVarF, 398457247, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i22) {
                        if ((i22 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(398457247, i22, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:286)");
                        }
                        androidx.compose.ui.n nVarM = PaddingKt.m(SizeKt.G(androidx.compose.ui.n.INSTANCE, FloatingActionButtonKt.f9488d, 0.0f, 0.0f, 0.0f, 14, null), FloatingActionButtonKt.f9487c, 0.0f, 2, null);
                        Arrangement.e eVarF = Arrangement.f5896a.f();
                        androidx.compose.ui.c.InterfaceC0079c interfaceC0079cQ = androidx.compose.ui.c.INSTANCE.q();
                        yh.q<androidx.compose.foundation.layout.x0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                        int i23 = ((i12 >> 12) & bb.c.g.f32954lc) | bb.c.b.f31011w5;
                        pVar2.T(693286680);
                        int i24 = i23 >> 3;
                        androidx.compose.ui.layout.i0 i0VarD = RowKt.d(eVarF, interfaceC0079cQ, pVar2, (i24 & 112) | (i24 & 14));
                        pVar2.T(-1323940314);
                        s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA = companion.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarM);
                        int i25 = ((((i23 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                        if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar2.h();
                        if (pVar2.D()) {
                            pVar2.L(aVarA);
                        } else {
                            pVar2.d();
                        }
                        pVar2.Y();
                        androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                        Updater.j(pVarB, i0VarD, companion.d());
                        Updater.j(pVarB, eVar, companion.b());
                        Updater.j(pVarB, layoutDirection, companion.c());
                        Updater.j(pVarB, d2Var, companion.f());
                        pVar2.x();
                        qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, Integer.valueOf((i25 >> 3) & 112));
                        pVar2.T(2058660585);
                        pVar2.T(-678309503);
                        if (((i25 >> 9) & 14 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                        } else {
                            qVar.invoke(RowScopeInstance.f6091a, pVar2, Integer.valueOf(((i23 >> 6) & 112) | 6));
                        }
                        pVar2.c0();
                        pVar2.c0();
                        pVar2.f();
                        pVar2.c0();
                        pVar2.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (458752 & i12) | (i12 & 3670016), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                floatingActionButtonElevation2 = floatingActionButtonElevation4;
                gVar2 = gVar3;
                g2Var3 = g2VarE;
                j13 = jC;
                j14 = jD;
            } else {
                pVarF.l();
                nVar4 = nVar;
                g2Var3 = g2Var2;
                j14 = jD;
                j13 = j12;
                floatingActionButtonElevation2 = floatingActionButtonElevationC;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i22) {
                    FloatingActionButtonKt.b(onClick, nVar4, g2Var3, j14, j13, floatingActionButtonElevation2, gVar2, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= 48;
        if ((i10 & bb.c.b.f30796me) == 0) {
            if ((i11 & 4) == 0) {
                g2Var2 = g2Var;
                if (pVarF.s(g2Var2)) {
                }
                i12 |= i19;
            } else {
                g2Var2 = g2Var;
            }
            i12 |= i19;
        } else {
            g2Var2 = g2Var;
        }
        if ((i10 & bb.c.g.f32954lc) == 0) {
            if ((i11 & 8) == 0) {
                jD = j10;
                if (pVarF.z(jD)) {
                }
                i12 |= i20;
            } else {
                jD = j10;
            }
            i12 |= i20;
        } else {
            jD = j10;
        }
        if ((i10 & 57344) == 0) {
            if ((i11 & 16) == 0) {
                j12 = j11;
                if (pVarF.z(j12)) {
                }
                i12 |= i21;
            } else {
                j12 = j11;
            }
            i12 |= i21;
        } else {
            j12 = j11;
        }
        if ((i10 & 458752) == 0) {
            floatingActionButtonElevationC = floatingActionButtonElevation;
            if ((i11 & 32) == 0) {
                i17 = 65536;
            } else {
                i17 = 65536;
            }
            i12 |= i17;
        } else {
            floatingActionButtonElevationC = floatingActionButtonElevation;
        }
        i13 = i11 & 64;
        if (i13 != 0) {
            i12 |= 1572864;
            gVar2 = gVar;
        } else {
            gVar2 = gVar;
            if ((i10 & 3670016) == 0) {
                if (pVarF.s(gVar2)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i12 |= i14;
            }
        }
        if ((i11 & 128) != 0) {
            i12 |= 12582912;
        } else if ((29360128 & i10) == 0) {
            if (pVarF.s(content)) {
                i15 = 8388608;
            } else {
                i15 = 4194304;
            }
            i12 |= i15;
        }
        if ((23967451 & i12) == 4793490) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    g2VarE = e0.f11833a.e(pVarF, 6);
                } else {
                    g2VarE = g2Var2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jD = e0.f11833a.d(pVarF, 6);
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                } else {
                    i16 = i12;
                    jC = j12;
                }
                if ((i11 & 32) != 0) {
                    floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                    i12 = i16 & (-458753);
                } else {
                    i12 = i16;
                }
                if (i13 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    nVar3 = nVar2;
                    gVar3 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    nVar3 = nVar2;
                    gVar3 = gVar2;
                }
            } else {
                if (i18 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    g2VarE = e0.f11833a.e(pVarF, 6);
                } else {
                    g2VarE = g2Var2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jD = e0.f11833a.d(pVarF, 6);
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                } else {
                    i16 = i12;
                    jC = j12;
                }
                if ((i11 & 32) != 0) {
                    floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                    i12 = i16 & (-458753);
                } else {
                    i12 = i16;
                }
                if (i13 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    nVar3 = nVar2;
                    gVar3 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    nVar3 = nVar2;
                    gVar3 = gVar2;
                }
            }
            FloatingActionButtonElevation floatingActionButtonElevation5 = floatingActionButtonElevationC;
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-326283107, i12, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:268)");
            }
            c(onClick, nVar3, g2VarE, jD, jC, floatingActionButtonElevation5, gVar3, androidx.compose.runtime.internal.b.b(pVarF, 398457247, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i22) {
                    if ((i22 & 11) == 2 && pVar2.b()) {
                        pVar2.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(398457247, i22, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:286)");
                    }
                    androidx.compose.ui.n nVarM = PaddingKt.m(SizeKt.G(androidx.compose.ui.n.INSTANCE, FloatingActionButtonKt.f9488d, 0.0f, 0.0f, 0.0f, 14, null), FloatingActionButtonKt.f9487c, 0.0f, 2, null);
                    Arrangement.e eVarF = Arrangement.f5896a.f();
                    androidx.compose.ui.c.InterfaceC0079c interfaceC0079cQ = androidx.compose.ui.c.INSTANCE.q();
                    yh.q<androidx.compose.foundation.layout.x0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                    int i23 = ((i12 >> 12) & bb.c.g.f32954lc) | bb.c.b.f31011w5;
                    pVar2.T(693286680);
                    int i24 = i23 >> 3;
                    androidx.compose.ui.layout.i0 i0VarD = RowKt.d(eVarF, interfaceC0079cQ, pVar2, (i24 & 112) | (i24 & 14));
                    pVar2.T(-1323940314);
                    s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                    androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    yh.a<ComposeUiNode> aVarA = companion.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarM);
                    int i25 = ((((i23 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                    if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVar2.h();
                    if (pVar2.D()) {
                        pVar2.L(aVarA);
                    } else {
                        pVar2.d();
                    }
                    pVar2.Y();
                    androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                    Updater.j(pVarB, i0VarD, companion.d());
                    Updater.j(pVarB, eVar, companion.b());
                    Updater.j(pVarB, layoutDirection, companion.c());
                    Updater.j(pVarB, d2Var, companion.f());
                    pVar2.x();
                    qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, Integer.valueOf((i25 >> 3) & 112));
                    pVar2.T(2058660585);
                    pVar2.T(-678309503);
                    if (((i25 >> 9) & 14 & 11) == 2 && pVar2.b()) {
                        pVar2.l();
                    } else {
                        qVar.invoke(RowScopeInstance.f6091a, pVar2, Integer.valueOf(((i23 >> 6) & 112) | 6));
                    }
                    pVar2.c0();
                    pVar2.c0();
                    pVar2.f();
                    pVar2.c0();
                    pVar2.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            }), pVarF, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (458752 & i12) | (i12 & 3670016), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            floatingActionButtonElevation2 = floatingActionButtonElevation5;
            gVar2 = gVar3;
            g2Var3 = g2VarE;
            j13 = jC;
            j14 = jD;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    g2VarE = e0.f11833a.e(pVarF, 6);
                } else {
                    g2VarE = g2Var2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jD = e0.f11833a.d(pVarF, 6);
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                } else {
                    i16 = i12;
                    jC = j12;
                }
                if ((i11 & 32) != 0) {
                    floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                    i12 = i16 & (-458753);
                } else {
                    i12 = i16;
                }
                if (i13 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    nVar3 = nVar2;
                    gVar3 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    nVar3 = nVar2;
                    gVar3 = gVar2;
                }
            } else {
                if (i18 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    g2VarE = e0.f11833a.e(pVarF, 6);
                } else {
                    g2VarE = g2Var2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jD = e0.f11833a.d(pVarF, 6);
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                } else {
                    i16 = i12;
                    jC = j12;
                }
                if ((i11 & 32) != 0) {
                    floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                    i12 = i16 & (-458753);
                } else {
                    i12 = i16;
                }
                if (i13 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    nVar3 = nVar2;
                    gVar3 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    nVar3 = nVar2;
                    gVar3 = gVar2;
                }
            }
            FloatingActionButtonElevation floatingActionButtonElevation6 = floatingActionButtonElevationC;
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-326283107, i12, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:268)");
            }
            c(onClick, nVar3, g2VarE, jD, jC, floatingActionButtonElevation6, gVar3, androidx.compose.runtime.internal.b.b(pVarF, 398457247, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i22) {
                    if ((i22 & 11) == 2 && pVar2.b()) {
                        pVar2.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(398457247, i22, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:286)");
                    }
                    androidx.compose.ui.n nVarM = PaddingKt.m(SizeKt.G(androidx.compose.ui.n.INSTANCE, FloatingActionButtonKt.f9488d, 0.0f, 0.0f, 0.0f, 14, null), FloatingActionButtonKt.f9487c, 0.0f, 2, null);
                    Arrangement.e eVarF = Arrangement.f5896a.f();
                    androidx.compose.ui.c.InterfaceC0079c interfaceC0079cQ = androidx.compose.ui.c.INSTANCE.q();
                    yh.q<androidx.compose.foundation.layout.x0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                    int i23 = ((i12 >> 12) & bb.c.g.f32954lc) | bb.c.b.f31011w5;
                    pVar2.T(693286680);
                    int i24 = i23 >> 3;
                    androidx.compose.ui.layout.i0 i0VarD = RowKt.d(eVarF, interfaceC0079cQ, pVar2, (i24 & 112) | (i24 & 14));
                    pVar2.T(-1323940314);
                    s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                    androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    yh.a<ComposeUiNode> aVarA = companion.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarM);
                    int i25 = ((((i23 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                    if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVar2.h();
                    if (pVar2.D()) {
                        pVar2.L(aVarA);
                    } else {
                        pVar2.d();
                    }
                    pVar2.Y();
                    androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                    Updater.j(pVarB, i0VarD, companion.d());
                    Updater.j(pVarB, eVar, companion.b());
                    Updater.j(pVarB, layoutDirection, companion.c());
                    Updater.j(pVarB, d2Var, companion.f());
                    pVar2.x();
                    qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, Integer.valueOf((i25 >> 3) & 112));
                    pVar2.T(2058660585);
                    pVar2.T(-678309503);
                    if (((i25 >> 9) & 14 & 11) == 2 && pVar2.b()) {
                        pVar2.l();
                    } else {
                        qVar.invoke(RowScopeInstance.f6091a, pVar2, Integer.valueOf(((i23 >> 6) & 112) | 6));
                    }
                    pVar2.c0();
                    pVar2.c0();
                    pVar2.f();
                    pVar2.c0();
                    pVar2.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            }), pVarF, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (458752 & i12) | (i12 & 3670016), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            floatingActionButtonElevation2 = floatingActionButtonElevation6;
            gVar2 = gVar3;
            g2Var3 = g2VarE;
            j13 = jC;
            j14 = jD;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i22) {
                FloatingActionButtonKt.b(onClick, nVar4, g2Var3, j14, j13, floatingActionButtonElevation2, gVar2, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0153 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0155  */
    /* JADX WARN: Code duplicated, block: B:113:0x0158  */
    /* JADX WARN: Code duplicated, block: B:116:0x015f  */
    /* JADX WARN: Code duplicated, block: B:119:0x016c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0179  */
    /* JADX WARN: Code duplicated, block: B:123:0x0184  */
    /* JADX WARN: Code duplicated, block: B:126:0x0189  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:130:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:132:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:135:0x01df  */
    /* JADX WARN: Code duplicated, block: B:138:0x0257  */
    /* JADX WARN: Code duplicated, block: B:143:0x026d  */
    /* JADX WARN: Code duplicated, block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:93:0x0115  */
    /* JADX WARN: Code duplicated, block: B:95:0x0122  */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void c(@dl.d final yh.a<kotlin.b2> onClick, @dl.e androidx.compose.ui.n nVar, @dl.e g2 g2Var, long j10, long j11, @dl.e FloatingActionButtonElevation floatingActionButtonElevation, @dl.e androidx.compose.foundation.interaction.g gVar, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        g2 g2VarH;
        long jD;
        long j12;
        FloatingActionButtonElevation floatingActionButtonElevationC;
        int i13;
        int i14;
        int i15;
        androidx.compose.ui.n nVar2;
        long jC;
        androidx.compose.ui.n nVar3;
        final int i16;
        final long j13;
        g2 g2Var2;
        long j14;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        androidx.compose.foundation.interaction.g gVar2;
        Object objU;
        androidx.compose.runtime.p pVar2;
        final androidx.compose.ui.n nVar4;
        final g2 g2Var3;
        final long j15;
        final long j16;
        final androidx.compose.foundation.interaction.g gVar3;
        final FloatingActionButtonElevation floatingActionButtonElevation3;
        androidx.compose.runtime.u1 u1VarH;
        int i17;
        kotlin.jvm.internal.f0.p(onClick, "onClick");
        kotlin.jvm.internal.f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(-731723913);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(onClick) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & 112) == 0) {
                i12 |= pVarF.s(nVar) ? 32 : 16;
            }
            if ((i10 & bb.c.b.f30796me) == 0) {
                if ((i11 & 4) == 0) {
                    g2VarH = g2Var;
                    int i19 = pVarF.s(g2VarH) ? 256 : 128;
                    i12 |= i19;
                } else {
                    g2VarH = g2Var;
                }
                i12 |= i19;
            } else {
                g2VarH = g2Var;
            }
            if ((i10 & bb.c.g.f32954lc) == 0) {
                if ((i11 & 8) == 0) {
                    jD = j10;
                    int i20 = pVarF.z(jD) ? 2048 : 1024;
                    i12 |= i20;
                } else {
                    jD = j10;
                }
                i12 |= i20;
            } else {
                jD = j10;
            }
            if ((i10 & 57344) == 0) {
                j12 = j11;
                if ((i11 & 16) == 0 || !pVarF.z(j12)) {
                    i17 = 8192;
                } else {
                    i17 = 16384;
                }
                i12 |= i17;
            } else {
                j12 = j11;
            }
            if ((i10 & 458752) == 0) {
                if ((i11 & 32) == 0) {
                    floatingActionButtonElevationC = floatingActionButtonElevation;
                    int i21 = pVarF.s(floatingActionButtonElevationC) ? 131072 : 65536;
                    i12 |= i21;
                } else {
                    floatingActionButtonElevationC = floatingActionButtonElevation;
                }
                i12 |= i21;
            } else {
                floatingActionButtonElevationC = floatingActionButtonElevation;
            }
            i13 = i11 & 64;
            if (i13 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (pVarF.s(gVar)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i12 |= i14;
            }
            if ((i11 & 128) != 0) {
                if ((29360128 & i10) == 0) {
                    if (pVarF.s(content)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                }
                if ((23967451 & i12) == 4793490 || !pVarF.b()) {
                    pVarF.W();
                    if ((i10 & 1) != 0 || pVarF.o()) {
                        if (i18 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            g2VarH = e0.f11833a.h(pVarF, 6);
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            jD = e0.f11833a.d(pVarF, 6);
                        }
                        if ((i11 & 16) != 0) {
                            jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                            i12 &= -57345;
                        } else {
                            jC = j12;
                        }
                        if ((i11 & 32) != 0) {
                            floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                            i12 &= -458753;
                        }
                        if (i13 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            nVar3 = nVar2;
                            i16 = i12;
                            j13 = jC;
                            g2Var2 = g2VarH;
                            j14 = jD;
                            floatingActionButtonElevation2 = floatingActionButtonElevationC;
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            nVar3 = nVar2;
                            i16 = i12;
                            j13 = jC;
                            g2Var2 = g2VarH;
                            j14 = jD;
                            floatingActionButtonElevation2 = floatingActionButtonElevationC;
                            gVar2 = gVar;
                        }
                    } else {
                        pVarF.l();
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                        }
                        nVar3 = nVar;
                        gVar2 = gVar;
                        g2Var2 = g2VarH;
                        j14 = jD;
                        floatingActionButtonElevation2 = floatingActionButtonElevationC;
                        long j17 = j12;
                        i16 = i12;
                        j13 = j17;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-731723913, i16, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:93)");
                    }
                    int i22 = ((i16 >> 12) & 112) | ((i16 >> 18) & 14);
                    int i23 = i16 << 3;
                    long j18 = j13;
                    androidx.compose.foundation.interaction.g gVar4 = gVar2;
                    pVar2 = pVarF;
                    FloatingActionButtonElevation floatingActionButtonElevation4 = floatingActionButtonElevation2;
                    SurfaceKt.d(onClick, nVar3, false, g2Var2, j14, j18, floatingActionButtonElevation2.f(gVar2, pVarF, i22).getValue().w(), floatingActionButtonElevation2.e(gVar2, pVarF, i22).getValue().w(), null, gVar4, androidx.compose.runtime.internal.b.b(pVarF, 1249316354, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar3, int i24) {
                            if ((i24 & 11) == 2 && pVar3.b()) {
                                pVar3.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1249316354, i24, -1, "androidx.compose.material3.FloatingActionButton.<anonymous> (FloatingActionButton.kt:112)");
                            }
                            androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(j13))};
                            final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar4 = content;
                            final int i25 = i16;
                            CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar3, -945978686, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar5, int i26) {
                                    if ((i26 & 11) == 2 && pVar5.b()) {
                                        pVar5.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-945978686, i26, -1, "androidx.compose.material3.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:113)");
                                    }
                                    TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar5, 6), t0.m.f140008a.n());
                                    final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar6 = pVar4;
                                    final int i27 = i25;
                                    TextKt.a(textStyleA, androidx.compose.runtime.internal.b.b(pVar5, 167946739, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt.FloatingActionButton.2.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                        @androidx.compose.runtime.h
                                        public final void a(@dl.e androidx.compose.runtime.p pVar7, int i28) {
                                            if ((i28 & 11) == 2 && pVar7.b()) {
                                                pVar7.l();
                                                return;
                                            }
                                            if (ComposerKt.g0()) {
                                                ComposerKt.w0(167946739, i28, -1, "androidx.compose.material3.FloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:120)");
                                            }
                                            androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                                            t0.p pVar8 = t0.p.f140183a;
                                            androidx.compose.ui.n nVarG = SizeKt.g(companion, pVar8.e(), pVar8.c());
                                            androidx.compose.ui.c cVarI = androidx.compose.ui.c.INSTANCE.i();
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar9 = pVar6;
                                            int i29 = i27;
                                            pVar7.T(733328855);
                                            androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(cVarI, false, pVar7, 6);
                                            pVar7.T(-1323940314);
                                            s1.e eVar = (s1.e) pVar7.K(CompositionLocalsKt.i());
                                            LayoutDirection layoutDirection = (LayoutDirection) pVar7.K(CompositionLocalsKt.p());
                                            androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar7.K(CompositionLocalsKt.u());
                                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                            yh.a<ComposeUiNode> aVarA = companion2.a();
                                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarG);
                                            if (!(pVar7.G() instanceof androidx.compose.runtime.e)) {
                                                ComposablesKt.n();
                                            }
                                            pVar7.h();
                                            if (pVar7.D()) {
                                                pVar7.L(aVarA);
                                            } else {
                                                pVar7.d();
                                            }
                                            pVar7.Y();
                                            androidx.compose.runtime.p pVarB = Updater.b(pVar7);
                                            Updater.j(pVarB, i0VarK, companion2.d());
                                            Updater.j(pVarB, eVar, companion2.b());
                                            Updater.j(pVarB, layoutDirection, companion2.c());
                                            Updater.j(pVarB, d2Var, companion2.f());
                                            pVar7.x();
                                            qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar7)), pVar7, 0);
                                            pVar7.T(2058660585);
                                            pVar7.T(-2137368960);
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
                                            pVar7.T(595057145);
                                            pVar9.invoke(pVar7, Integer.valueOf((i29 >> 21) & 14));
                                            pVar7.c0();
                                            pVar7.c0();
                                            pVar7.c0();
                                            pVar7.f();
                                            pVar7.c0();
                                            pVar7.c0();
                                            if (ComposerKt.g0()) {
                                                ComposerKt.v0();
                                            }
                                        }

                                        @Override // yh.p
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar7, Integer num) {
                                            a(pVar7, num.intValue());
                                            return kotlin.b2.f124493a;
                                        }
                                    }), pVar5, 48);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar5, Integer num) {
                                    a(pVar5, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVar3, 56);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                            a(pVar3, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVar2, (i16 & 14) | (i16 & 112) | (i23 & bb.c.g.f32954lc) | (i23 & 57344) | (i23 & 458752) | (1879048192 & (i16 << 9)), 6, bb.c.b.f30507a2);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    g2Var3 = g2Var2;
                    j15 = j14;
                    j16 = j18;
                    gVar3 = gVar4;
                    floatingActionButtonElevation3 = floatingActionButtonElevation4;
                } else {
                    pVarF.l();
                    nVar4 = nVar;
                    pVar2 = pVarF;
                    g2Var3 = g2VarH;
                    j15 = jD;
                    floatingActionButtonElevation3 = floatingActionButtonElevationC;
                    j16 = j12;
                    gVar3 = gVar;
                }
                u1VarH = pVar2.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar3, int i24) {
                        FloatingActionButtonKt.c(onClick, nVar4, g2Var3, j15, j16, floatingActionButtonElevation3, gVar3, content, pVar3, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                        a(pVar3, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i15 = 12582912;
            i12 |= i15;
            if ((23967451 & i12) == 4793490) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        g2VarH = e0.f11833a.h(pVarF, 6);
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jD = e0.f11833a.d(pVarF, 6);
                    }
                    if ((i11 & 16) != 0) {
                        jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                        i12 &= -57345;
                    } else {
                        jC = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                        i12 &= -458753;
                    }
                    if (i13 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        i16 = i12;
                        j13 = jC;
                        g2Var2 = g2VarH;
                        j14 = jD;
                        floatingActionButtonElevation2 = floatingActionButtonElevationC;
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        i16 = i12;
                        j13 = jC;
                        g2Var2 = g2VarH;
                        j14 = jD;
                        floatingActionButtonElevation2 = floatingActionButtonElevationC;
                        gVar2 = gVar;
                    }
                } else {
                    if (i18 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        g2VarH = e0.f11833a.h(pVarF, 6);
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jD = e0.f11833a.d(pVarF, 6);
                    }
                    if ((i11 & 16) != 0) {
                        jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                        i12 &= -57345;
                    } else {
                        jC = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                        i12 &= -458753;
                    }
                    if (i13 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        i16 = i12;
                        j13 = jC;
                        g2Var2 = g2VarH;
                        j14 = jD;
                        floatingActionButtonElevation2 = floatingActionButtonElevationC;
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        i16 = i12;
                        j13 = jC;
                        g2Var2 = g2VarH;
                        j14 = jD;
                        floatingActionButtonElevation2 = floatingActionButtonElevationC;
                        gVar2 = gVar;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-731723913, i16, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:93)");
                }
                int i24 = ((i16 >> 12) & 112) | ((i16 >> 18) & 14);
                int i25 = i16 << 3;
                long j19 = j13;
                androidx.compose.foundation.interaction.g gVar5 = gVar2;
                pVar2 = pVarF;
                FloatingActionButtonElevation floatingActionButtonElevation5 = floatingActionButtonElevation2;
                SurfaceKt.d(onClick, nVar3, false, g2Var2, j14, j19, floatingActionButtonElevation2.f(gVar2, pVarF, i24).getValue().w(), floatingActionButtonElevation2.e(gVar2, pVarF, i24).getValue().w(), null, gVar5, androidx.compose.runtime.internal.b.b(pVarF, 1249316354, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar3, int i26) {
                        if ((i26 & 11) == 2 && pVar3.b()) {
                            pVar3.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1249316354, i26, -1, "androidx.compose.material3.FloatingActionButton.<anonymous> (FloatingActionButton.kt:112)");
                        }
                        androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(j13))};
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar4 = content;
                        final int i27 = i16;
                        CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar3, -945978686, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar5, int i28) {
                                if ((i28 & 11) == 2 && pVar5.b()) {
                                    pVar5.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-945978686, i28, -1, "androidx.compose.material3.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:113)");
                                }
                                TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar5, 6), t0.m.f140008a.n());
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar6 = pVar4;
                                final int i29 = i27;
                                TextKt.a(textStyleA, androidx.compose.runtime.internal.b.b(pVar5, 167946739, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt.FloatingActionButton.2.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar7, int i210) {
                                        if ((i210 & 11) == 2 && pVar7.b()) {
                                            pVar7.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(167946739, i210, -1, "androidx.compose.material3.FloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:120)");
                                        }
                                        androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                                        t0.p pVar8 = t0.p.f140183a;
                                        androidx.compose.ui.n nVarG = SizeKt.g(companion, pVar8.e(), pVar8.c());
                                        androidx.compose.ui.c cVarI = androidx.compose.ui.c.INSTANCE.i();
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar9 = pVar6;
                                        int i211 = i29;
                                        pVar7.T(733328855);
                                        androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(cVarI, false, pVar7, 6);
                                        pVar7.T(-1323940314);
                                        s1.e eVar = (s1.e) pVar7.K(CompositionLocalsKt.i());
                                        LayoutDirection layoutDirection = (LayoutDirection) pVar7.K(CompositionLocalsKt.p());
                                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar7.K(CompositionLocalsKt.u());
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        yh.a<ComposeUiNode> aVarA = companion2.a();
                                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarG);
                                        if (!(pVar7.G() instanceof androidx.compose.runtime.e)) {
                                            ComposablesKt.n();
                                        }
                                        pVar7.h();
                                        if (pVar7.D()) {
                                            pVar7.L(aVarA);
                                        } else {
                                            pVar7.d();
                                        }
                                        pVar7.Y();
                                        androidx.compose.runtime.p pVarB = Updater.b(pVar7);
                                        Updater.j(pVarB, i0VarK, companion2.d());
                                        Updater.j(pVarB, eVar, companion2.b());
                                        Updater.j(pVarB, layoutDirection, companion2.c());
                                        Updater.j(pVarB, d2Var, companion2.f());
                                        pVar7.x();
                                        qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar7)), pVar7, 0);
                                        pVar7.T(2058660585);
                                        pVar7.T(-2137368960);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
                                        pVar7.T(595057145);
                                        pVar9.invoke(pVar7, Integer.valueOf((i211 >> 21) & 14));
                                        pVar7.c0();
                                        pVar7.c0();
                                        pVar7.c0();
                                        pVar7.f();
                                        pVar7.c0();
                                        pVar7.c0();
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar7, Integer num) {
                                        a(pVar7, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                }), pVar5, 48);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar5, Integer num) {
                                a(pVar5, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVar3, 56);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                        a(pVar3, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVar2, (i16 & 14) | (i16 & 112) | (i25 & bb.c.g.f32954lc) | (i25 & 57344) | (i25 & 458752) | (1879048192 & (i16 << 9)), 6, bb.c.b.f30507a2);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                g2Var3 = g2Var2;
                j15 = j14;
                j16 = j19;
                gVar3 = gVar5;
                floatingActionButtonElevation3 = floatingActionButtonElevation5;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        g2VarH = e0.f11833a.h(pVarF, 6);
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jD = e0.f11833a.d(pVarF, 6);
                    }
                    if ((i11 & 16) != 0) {
                        jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                        i12 &= -57345;
                    } else {
                        jC = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                        i12 &= -458753;
                    }
                    if (i13 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        i16 = i12;
                        j13 = jC;
                        g2Var2 = g2VarH;
                        j14 = jD;
                        floatingActionButtonElevation2 = floatingActionButtonElevationC;
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        i16 = i12;
                        j13 = jC;
                        g2Var2 = g2VarH;
                        j14 = jD;
                        floatingActionButtonElevation2 = floatingActionButtonElevationC;
                        gVar2 = gVar;
                    }
                } else {
                    if (i18 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        g2VarH = e0.f11833a.h(pVarF, 6);
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jD = e0.f11833a.d(pVarF, 6);
                    }
                    if ((i11 & 16) != 0) {
                        jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                        i12 &= -57345;
                    } else {
                        jC = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                        i12 &= -458753;
                    }
                    if (i13 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        i16 = i12;
                        j13 = jC;
                        g2Var2 = g2VarH;
                        j14 = jD;
                        floatingActionButtonElevation2 = floatingActionButtonElevationC;
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        i16 = i12;
                        j13 = jC;
                        g2Var2 = g2VarH;
                        j14 = jD;
                        floatingActionButtonElevation2 = floatingActionButtonElevationC;
                        gVar2 = gVar;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-731723913, i16, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:93)");
                }
                int i26 = ((i16 >> 12) & 112) | ((i16 >> 18) & 14);
                int i27 = i16 << 3;
                long j110 = j13;
                androidx.compose.foundation.interaction.g gVar6 = gVar2;
                pVar2 = pVarF;
                FloatingActionButtonElevation floatingActionButtonElevation6 = floatingActionButtonElevation2;
                SurfaceKt.d(onClick, nVar3, false, g2Var2, j14, j110, floatingActionButtonElevation2.f(gVar2, pVarF, i26).getValue().w(), floatingActionButtonElevation2.e(gVar2, pVarF, i26).getValue().w(), null, gVar6, androidx.compose.runtime.internal.b.b(pVarF, 1249316354, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar3, int i28) {
                        if ((i28 & 11) == 2 && pVar3.b()) {
                            pVar3.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1249316354, i28, -1, "androidx.compose.material3.FloatingActionButton.<anonymous> (FloatingActionButton.kt:112)");
                        }
                        androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(j13))};
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar4 = content;
                        final int i29 = i16;
                        CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar3, -945978686, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar5, int i210) {
                                if ((i210 & 11) == 2 && pVar5.b()) {
                                    pVar5.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-945978686, i210, -1, "androidx.compose.material3.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:113)");
                                }
                                TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar5, 6), t0.m.f140008a.n());
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar6 = pVar4;
                                final int i211 = i29;
                                TextKt.a(textStyleA, androidx.compose.runtime.internal.b.b(pVar5, 167946739, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt.FloatingActionButton.2.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar7, int i212) {
                                        if ((i212 & 11) == 2 && pVar7.b()) {
                                            pVar7.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(167946739, i212, -1, "androidx.compose.material3.FloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:120)");
                                        }
                                        androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                                        t0.p pVar8 = t0.p.f140183a;
                                        androidx.compose.ui.n nVarG = SizeKt.g(companion, pVar8.e(), pVar8.c());
                                        androidx.compose.ui.c cVarI = androidx.compose.ui.c.INSTANCE.i();
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar9 = pVar6;
                                        int i213 = i211;
                                        pVar7.T(733328855);
                                        androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(cVarI, false, pVar7, 6);
                                        pVar7.T(-1323940314);
                                        s1.e eVar = (s1.e) pVar7.K(CompositionLocalsKt.i());
                                        LayoutDirection layoutDirection = (LayoutDirection) pVar7.K(CompositionLocalsKt.p());
                                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar7.K(CompositionLocalsKt.u());
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        yh.a<ComposeUiNode> aVarA = companion2.a();
                                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarG);
                                        if (!(pVar7.G() instanceof androidx.compose.runtime.e)) {
                                            ComposablesKt.n();
                                        }
                                        pVar7.h();
                                        if (pVar7.D()) {
                                            pVar7.L(aVarA);
                                        } else {
                                            pVar7.d();
                                        }
                                        pVar7.Y();
                                        androidx.compose.runtime.p pVarB = Updater.b(pVar7);
                                        Updater.j(pVarB, i0VarK, companion2.d());
                                        Updater.j(pVarB, eVar, companion2.b());
                                        Updater.j(pVarB, layoutDirection, companion2.c());
                                        Updater.j(pVarB, d2Var, companion2.f());
                                        pVar7.x();
                                        qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar7)), pVar7, 0);
                                        pVar7.T(2058660585);
                                        pVar7.T(-2137368960);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
                                        pVar7.T(595057145);
                                        pVar9.invoke(pVar7, Integer.valueOf((i213 >> 21) & 14));
                                        pVar7.c0();
                                        pVar7.c0();
                                        pVar7.c0();
                                        pVar7.f();
                                        pVar7.c0();
                                        pVar7.c0();
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar7, Integer num) {
                                        a(pVar7, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                }), pVar5, 48);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar5, Integer num) {
                                a(pVar5, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVar3, 56);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                        a(pVar3, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVar2, (i16 & 14) | (i16 & 112) | (i27 & bb.c.g.f32954lc) | (i27 & 57344) | (i27 & 458752) | (1879048192 & (i16 << 9)), 6, bb.c.b.f30507a2);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                g2Var3 = g2Var2;
                j15 = j14;
                j16 = j110;
                gVar3 = gVar6;
                floatingActionButtonElevation3 = floatingActionButtonElevation6;
            }
            u1VarH = pVar2.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar3, int i28) {
                    FloatingActionButtonKt.c(onClick, nVar4, g2Var3, j15, j16, floatingActionButtonElevation3, gVar3, content, pVar3, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                    a(pVar3, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= 48;
        if ((i10 & bb.c.b.f30796me) == 0) {
            if ((i11 & 4) == 0) {
                g2VarH = g2Var;
                if (pVarF.s(g2VarH)) {
                }
                i12 |= i19;
            } else {
                g2VarH = g2Var;
            }
            i12 |= i19;
        } else {
            g2VarH = g2Var;
        }
        if ((i10 & bb.c.g.f32954lc) == 0) {
            if ((i11 & 8) == 0) {
                jD = j10;
                if (pVarF.z(jD)) {
                }
                i12 |= i20;
            } else {
                jD = j10;
            }
            i12 |= i20;
        } else {
            jD = j10;
        }
        if ((i10 & 57344) == 0) {
            j12 = j11;
            if ((i11 & 16) == 0) {
                i17 = 8192;
            } else {
                i17 = 8192;
            }
            i12 |= i17;
        } else {
            j12 = j11;
        }
        if ((i10 & 458752) == 0) {
            if ((i11 & 32) == 0) {
                floatingActionButtonElevationC = floatingActionButtonElevation;
                if (pVarF.s(floatingActionButtonElevationC)) {
                }
                i12 |= i21;
            } else {
                floatingActionButtonElevationC = floatingActionButtonElevation;
            }
            i12 |= i21;
        } else {
            floatingActionButtonElevationC = floatingActionButtonElevation;
        }
        i13 = i11 & 64;
        if (i13 != 0) {
            i12 |= 1572864;
        } else if ((i10 & 3670016) == 0) {
            if (pVarF.s(gVar)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i12 |= i14;
        }
        if ((i11 & 128) != 0) {
            if ((29360128 & i10) == 0) {
                if (pVarF.s(content)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
            }
            if ((23967451 & i12) == 4793490) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        g2VarH = e0.f11833a.h(pVarF, 6);
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jD = e0.f11833a.d(pVarF, 6);
                    }
                    if ((i11 & 16) != 0) {
                        jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                        i12 &= -57345;
                    } else {
                        jC = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                        i12 &= -458753;
                    }
                    if (i13 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        i16 = i12;
                        j13 = jC;
                        g2Var2 = g2VarH;
                        j14 = jD;
                        floatingActionButtonElevation2 = floatingActionButtonElevationC;
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        i16 = i12;
                        j13 = jC;
                        g2Var2 = g2VarH;
                        j14 = jD;
                        floatingActionButtonElevation2 = floatingActionButtonElevationC;
                        gVar2 = gVar;
                    }
                } else {
                    if (i18 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        g2VarH = e0.f11833a.h(pVarF, 6);
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jD = e0.f11833a.d(pVarF, 6);
                    }
                    if ((i11 & 16) != 0) {
                        jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                        i12 &= -57345;
                    } else {
                        jC = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                        i12 &= -458753;
                    }
                    if (i13 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        i16 = i12;
                        j13 = jC;
                        g2Var2 = g2VarH;
                        j14 = jD;
                        floatingActionButtonElevation2 = floatingActionButtonElevationC;
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        i16 = i12;
                        j13 = jC;
                        g2Var2 = g2VarH;
                        j14 = jD;
                        floatingActionButtonElevation2 = floatingActionButtonElevationC;
                        gVar2 = gVar;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-731723913, i16, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:93)");
                }
                int i28 = ((i16 >> 12) & 112) | ((i16 >> 18) & 14);
                int i29 = i16 << 3;
                long j111 = j13;
                androidx.compose.foundation.interaction.g gVar7 = gVar2;
                pVar2 = pVarF;
                FloatingActionButtonElevation floatingActionButtonElevation7 = floatingActionButtonElevation2;
                SurfaceKt.d(onClick, nVar3, false, g2Var2, j14, j111, floatingActionButtonElevation2.f(gVar2, pVarF, i28).getValue().w(), floatingActionButtonElevation2.e(gVar2, pVarF, i28).getValue().w(), null, gVar7, androidx.compose.runtime.internal.b.b(pVarF, 1249316354, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar3, int i210) {
                        if ((i210 & 11) == 2 && pVar3.b()) {
                            pVar3.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1249316354, i210, -1, "androidx.compose.material3.FloatingActionButton.<anonymous> (FloatingActionButton.kt:112)");
                        }
                        androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(j13))};
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar4 = content;
                        final int i211 = i16;
                        CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar3, -945978686, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar5, int i212) {
                                if ((i212 & 11) == 2 && pVar5.b()) {
                                    pVar5.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-945978686, i212, -1, "androidx.compose.material3.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:113)");
                                }
                                TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar5, 6), t0.m.f140008a.n());
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar6 = pVar4;
                                final int i213 = i211;
                                TextKt.a(textStyleA, androidx.compose.runtime.internal.b.b(pVar5, 167946739, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt.FloatingActionButton.2.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar7, int i214) {
                                        if ((i214 & 11) == 2 && pVar7.b()) {
                                            pVar7.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(167946739, i214, -1, "androidx.compose.material3.FloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:120)");
                                        }
                                        androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                                        t0.p pVar8 = t0.p.f140183a;
                                        androidx.compose.ui.n nVarG = SizeKt.g(companion, pVar8.e(), pVar8.c());
                                        androidx.compose.ui.c cVarI = androidx.compose.ui.c.INSTANCE.i();
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar9 = pVar6;
                                        int i215 = i213;
                                        pVar7.T(733328855);
                                        androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(cVarI, false, pVar7, 6);
                                        pVar7.T(-1323940314);
                                        s1.e eVar = (s1.e) pVar7.K(CompositionLocalsKt.i());
                                        LayoutDirection layoutDirection = (LayoutDirection) pVar7.K(CompositionLocalsKt.p());
                                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar7.K(CompositionLocalsKt.u());
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        yh.a<ComposeUiNode> aVarA = companion2.a();
                                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarG);
                                        if (!(pVar7.G() instanceof androidx.compose.runtime.e)) {
                                            ComposablesKt.n();
                                        }
                                        pVar7.h();
                                        if (pVar7.D()) {
                                            pVar7.L(aVarA);
                                        } else {
                                            pVar7.d();
                                        }
                                        pVar7.Y();
                                        androidx.compose.runtime.p pVarB = Updater.b(pVar7);
                                        Updater.j(pVarB, i0VarK, companion2.d());
                                        Updater.j(pVarB, eVar, companion2.b());
                                        Updater.j(pVarB, layoutDirection, companion2.c());
                                        Updater.j(pVarB, d2Var, companion2.f());
                                        pVar7.x();
                                        qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar7)), pVar7, 0);
                                        pVar7.T(2058660585);
                                        pVar7.T(-2137368960);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
                                        pVar7.T(595057145);
                                        pVar9.invoke(pVar7, Integer.valueOf((i215 >> 21) & 14));
                                        pVar7.c0();
                                        pVar7.c0();
                                        pVar7.c0();
                                        pVar7.f();
                                        pVar7.c0();
                                        pVar7.c0();
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar7, Integer num) {
                                        a(pVar7, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                }), pVar5, 48);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar5, Integer num) {
                                a(pVar5, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVar3, 56);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                        a(pVar3, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVar2, (i16 & 14) | (i16 & 112) | (i29 & bb.c.g.f32954lc) | (i29 & 57344) | (i29 & 458752) | (1879048192 & (i16 << 9)), 6, bb.c.b.f30507a2);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                g2Var3 = g2Var2;
                j15 = j14;
                j16 = j111;
                gVar3 = gVar7;
                floatingActionButtonElevation3 = floatingActionButtonElevation7;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        g2VarH = e0.f11833a.h(pVarF, 6);
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jD = e0.f11833a.d(pVarF, 6);
                    }
                    if ((i11 & 16) != 0) {
                        jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                        i12 &= -57345;
                    } else {
                        jC = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                        i12 &= -458753;
                    }
                    if (i13 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        i16 = i12;
                        j13 = jC;
                        g2Var2 = g2VarH;
                        j14 = jD;
                        floatingActionButtonElevation2 = floatingActionButtonElevationC;
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        i16 = i12;
                        j13 = jC;
                        g2Var2 = g2VarH;
                        j14 = jD;
                        floatingActionButtonElevation2 = floatingActionButtonElevationC;
                        gVar2 = gVar;
                    }
                } else {
                    if (i18 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        g2VarH = e0.f11833a.h(pVarF, 6);
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jD = e0.f11833a.d(pVarF, 6);
                    }
                    if ((i11 & 16) != 0) {
                        jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                        i12 &= -57345;
                    } else {
                        jC = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                        i12 &= -458753;
                    }
                    if (i13 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        i16 = i12;
                        j13 = jC;
                        g2Var2 = g2VarH;
                        j14 = jD;
                        floatingActionButtonElevation2 = floatingActionButtonElevationC;
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        i16 = i12;
                        j13 = jC;
                        g2Var2 = g2VarH;
                        j14 = jD;
                        floatingActionButtonElevation2 = floatingActionButtonElevationC;
                        gVar2 = gVar;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-731723913, i16, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:93)");
                }
                int i210 = ((i16 >> 12) & 112) | ((i16 >> 18) & 14);
                int i211 = i16 << 3;
                long j112 = j13;
                androidx.compose.foundation.interaction.g gVar8 = gVar2;
                pVar2 = pVarF;
                FloatingActionButtonElevation floatingActionButtonElevation8 = floatingActionButtonElevation2;
                SurfaceKt.d(onClick, nVar3, false, g2Var2, j14, j112, floatingActionButtonElevation2.f(gVar2, pVarF, i210).getValue().w(), floatingActionButtonElevation2.e(gVar2, pVarF, i210).getValue().w(), null, gVar8, androidx.compose.runtime.internal.b.b(pVarF, 1249316354, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar3, int i212) {
                        if ((i212 & 11) == 2 && pVar3.b()) {
                            pVar3.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1249316354, i212, -1, "androidx.compose.material3.FloatingActionButton.<anonymous> (FloatingActionButton.kt:112)");
                        }
                        androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(j13))};
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar4 = content;
                        final int i213 = i16;
                        CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar3, -945978686, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar5, int i214) {
                                if ((i214 & 11) == 2 && pVar5.b()) {
                                    pVar5.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-945978686, i214, -1, "androidx.compose.material3.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:113)");
                                }
                                TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar5, 6), t0.m.f140008a.n());
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar6 = pVar4;
                                final int i215 = i213;
                                TextKt.a(textStyleA, androidx.compose.runtime.internal.b.b(pVar5, 167946739, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt.FloatingActionButton.2.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar7, int i216) {
                                        if ((i216 & 11) == 2 && pVar7.b()) {
                                            pVar7.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(167946739, i216, -1, "androidx.compose.material3.FloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:120)");
                                        }
                                        androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                                        t0.p pVar8 = t0.p.f140183a;
                                        androidx.compose.ui.n nVarG = SizeKt.g(companion, pVar8.e(), pVar8.c());
                                        androidx.compose.ui.c cVarI = androidx.compose.ui.c.INSTANCE.i();
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar9 = pVar6;
                                        int i217 = i215;
                                        pVar7.T(733328855);
                                        androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(cVarI, false, pVar7, 6);
                                        pVar7.T(-1323940314);
                                        s1.e eVar = (s1.e) pVar7.K(CompositionLocalsKt.i());
                                        LayoutDirection layoutDirection = (LayoutDirection) pVar7.K(CompositionLocalsKt.p());
                                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar7.K(CompositionLocalsKt.u());
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        yh.a<ComposeUiNode> aVarA = companion2.a();
                                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarG);
                                        if (!(pVar7.G() instanceof androidx.compose.runtime.e)) {
                                            ComposablesKt.n();
                                        }
                                        pVar7.h();
                                        if (pVar7.D()) {
                                            pVar7.L(aVarA);
                                        } else {
                                            pVar7.d();
                                        }
                                        pVar7.Y();
                                        androidx.compose.runtime.p pVarB = Updater.b(pVar7);
                                        Updater.j(pVarB, i0VarK, companion2.d());
                                        Updater.j(pVarB, eVar, companion2.b());
                                        Updater.j(pVarB, layoutDirection, companion2.c());
                                        Updater.j(pVarB, d2Var, companion2.f());
                                        pVar7.x();
                                        qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar7)), pVar7, 0);
                                        pVar7.T(2058660585);
                                        pVar7.T(-2137368960);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
                                        pVar7.T(595057145);
                                        pVar9.invoke(pVar7, Integer.valueOf((i217 >> 21) & 14));
                                        pVar7.c0();
                                        pVar7.c0();
                                        pVar7.c0();
                                        pVar7.f();
                                        pVar7.c0();
                                        pVar7.c0();
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar7, Integer num) {
                                        a(pVar7, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                }), pVar5, 48);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar5, Integer num) {
                                a(pVar5, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVar3, 56);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                        a(pVar3, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVar2, (i16 & 14) | (i16 & 112) | (i211 & bb.c.g.f32954lc) | (i211 & 57344) | (i211 & 458752) | (1879048192 & (i16 << 9)), 6, bb.c.b.f30507a2);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                g2Var3 = g2Var2;
                j15 = j14;
                j16 = j112;
                gVar3 = gVar8;
                floatingActionButtonElevation3 = floatingActionButtonElevation8;
            }
            u1VarH = pVar2.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar3, int i212) {
                    FloatingActionButtonKt.c(onClick, nVar4, g2Var3, j15, j16, floatingActionButtonElevation3, gVar3, content, pVar3, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                    a(pVar3, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i15 = 12582912;
        i12 |= i15;
        if ((23967451 & i12) == 4793490) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    g2VarH = e0.f11833a.h(pVarF, 6);
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jD = e0.f11833a.d(pVarF, 6);
                }
                if ((i11 & 16) != 0) {
                    jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                    i12 &= -57345;
                } else {
                    jC = j12;
                }
                if ((i11 & 32) != 0) {
                    floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                    i12 &= -458753;
                }
                if (i13 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    nVar3 = nVar2;
                    i16 = i12;
                    j13 = jC;
                    g2Var2 = g2VarH;
                    j14 = jD;
                    floatingActionButtonElevation2 = floatingActionButtonElevationC;
                    gVar2 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    nVar3 = nVar2;
                    i16 = i12;
                    j13 = jC;
                    g2Var2 = g2VarH;
                    j14 = jD;
                    floatingActionButtonElevation2 = floatingActionButtonElevationC;
                    gVar2 = gVar;
                }
            } else {
                if (i18 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    g2VarH = e0.f11833a.h(pVarF, 6);
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jD = e0.f11833a.d(pVarF, 6);
                }
                if ((i11 & 16) != 0) {
                    jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                    i12 &= -57345;
                } else {
                    jC = j12;
                }
                if ((i11 & 32) != 0) {
                    floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                    i12 &= -458753;
                }
                if (i13 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    nVar3 = nVar2;
                    i16 = i12;
                    j13 = jC;
                    g2Var2 = g2VarH;
                    j14 = jD;
                    floatingActionButtonElevation2 = floatingActionButtonElevationC;
                    gVar2 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    nVar3 = nVar2;
                    i16 = i12;
                    j13 = jC;
                    g2Var2 = g2VarH;
                    j14 = jD;
                    floatingActionButtonElevation2 = floatingActionButtonElevationC;
                    gVar2 = gVar;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-731723913, i16, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:93)");
            }
            int i212 = ((i16 >> 12) & 112) | ((i16 >> 18) & 14);
            int i213 = i16 << 3;
            long j113 = j13;
            androidx.compose.foundation.interaction.g gVar9 = gVar2;
            pVar2 = pVarF;
            FloatingActionButtonElevation floatingActionButtonElevation9 = floatingActionButtonElevation2;
            SurfaceKt.d(onClick, nVar3, false, g2Var2, j14, j113, floatingActionButtonElevation2.f(gVar2, pVarF, i212).getValue().w(), floatingActionButtonElevation2.e(gVar2, pVarF, i212).getValue().w(), null, gVar9, androidx.compose.runtime.internal.b.b(pVarF, 1249316354, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar3, int i214) {
                    if ((i214 & 11) == 2 && pVar3.b()) {
                        pVar3.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1249316354, i214, -1, "androidx.compose.material3.FloatingActionButton.<anonymous> (FloatingActionButton.kt:112)");
                    }
                    androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(j13))};
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar4 = content;
                    final int i215 = i16;
                    CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar3, -945978686, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar5, int i216) {
                            if ((i216 & 11) == 2 && pVar5.b()) {
                                pVar5.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-945978686, i216, -1, "androidx.compose.material3.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:113)");
                            }
                            TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar5, 6), t0.m.f140008a.n());
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar6 = pVar4;
                            final int i217 = i215;
                            TextKt.a(textStyleA, androidx.compose.runtime.internal.b.b(pVar5, 167946739, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt.FloatingActionButton.2.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar7, int i218) {
                                    if ((i218 & 11) == 2 && pVar7.b()) {
                                        pVar7.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(167946739, i218, -1, "androidx.compose.material3.FloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:120)");
                                    }
                                    androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                                    t0.p pVar8 = t0.p.f140183a;
                                    androidx.compose.ui.n nVarG = SizeKt.g(companion, pVar8.e(), pVar8.c());
                                    androidx.compose.ui.c cVarI = androidx.compose.ui.c.INSTANCE.i();
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar9 = pVar6;
                                    int i219 = i217;
                                    pVar7.T(733328855);
                                    androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(cVarI, false, pVar7, 6);
                                    pVar7.T(-1323940314);
                                    s1.e eVar = (s1.e) pVar7.K(CompositionLocalsKt.i());
                                    LayoutDirection layoutDirection = (LayoutDirection) pVar7.K(CompositionLocalsKt.p());
                                    androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar7.K(CompositionLocalsKt.u());
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    yh.a<ComposeUiNode> aVarA = companion2.a();
                                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarG);
                                    if (!(pVar7.G() instanceof androidx.compose.runtime.e)) {
                                        ComposablesKt.n();
                                    }
                                    pVar7.h();
                                    if (pVar7.D()) {
                                        pVar7.L(aVarA);
                                    } else {
                                        pVar7.d();
                                    }
                                    pVar7.Y();
                                    androidx.compose.runtime.p pVarB = Updater.b(pVar7);
                                    Updater.j(pVarB, i0VarK, companion2.d());
                                    Updater.j(pVarB, eVar, companion2.b());
                                    Updater.j(pVarB, layoutDirection, companion2.c());
                                    Updater.j(pVarB, d2Var, companion2.f());
                                    pVar7.x();
                                    qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar7)), pVar7, 0);
                                    pVar7.T(2058660585);
                                    pVar7.T(-2137368960);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
                                    pVar7.T(595057145);
                                    pVar9.invoke(pVar7, Integer.valueOf((i219 >> 21) & 14));
                                    pVar7.c0();
                                    pVar7.c0();
                                    pVar7.c0();
                                    pVar7.f();
                                    pVar7.c0();
                                    pVar7.c0();
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar7, Integer num) {
                                    a(pVar7, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVar5, 48);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar5, Integer num) {
                            a(pVar5, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVar3, 56);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                    a(pVar3, num.intValue());
                    return kotlin.b2.f124493a;
                }
            }), pVar2, (i16 & 14) | (i16 & 112) | (i213 & bb.c.g.f32954lc) | (i213 & 57344) | (i213 & 458752) | (1879048192 & (i16 << 9)), 6, bb.c.b.f30507a2);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            g2Var3 = g2Var2;
            j15 = j14;
            j16 = j113;
            gVar3 = gVar9;
            floatingActionButtonElevation3 = floatingActionButtonElevation9;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    g2VarH = e0.f11833a.h(pVarF, 6);
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jD = e0.f11833a.d(pVarF, 6);
                }
                if ((i11 & 16) != 0) {
                    jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                    i12 &= -57345;
                } else {
                    jC = j12;
                }
                if ((i11 & 32) != 0) {
                    floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                    i12 &= -458753;
                }
                if (i13 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    nVar3 = nVar2;
                    i16 = i12;
                    j13 = jC;
                    g2Var2 = g2VarH;
                    j14 = jD;
                    floatingActionButtonElevation2 = floatingActionButtonElevationC;
                    gVar2 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    nVar3 = nVar2;
                    i16 = i12;
                    j13 = jC;
                    g2Var2 = g2VarH;
                    j14 = jD;
                    floatingActionButtonElevation2 = floatingActionButtonElevationC;
                    gVar2 = gVar;
                }
            } else {
                if (i18 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    g2VarH = e0.f11833a.h(pVarF, 6);
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jD = e0.f11833a.d(pVarF, 6);
                }
                if ((i11 & 16) != 0) {
                    jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                    i12 &= -57345;
                } else {
                    jC = j12;
                }
                if ((i11 & 32) != 0) {
                    floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                    i12 &= -458753;
                }
                if (i13 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    nVar3 = nVar2;
                    i16 = i12;
                    j13 = jC;
                    g2Var2 = g2VarH;
                    j14 = jD;
                    floatingActionButtonElevation2 = floatingActionButtonElevationC;
                    gVar2 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    nVar3 = nVar2;
                    i16 = i12;
                    j13 = jC;
                    g2Var2 = g2VarH;
                    j14 = jD;
                    floatingActionButtonElevation2 = floatingActionButtonElevationC;
                    gVar2 = gVar;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-731723913, i16, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:93)");
            }
            int i214 = ((i16 >> 12) & 112) | ((i16 >> 18) & 14);
            int i215 = i16 << 3;
            long j114 = j13;
            androidx.compose.foundation.interaction.g gVar10 = gVar2;
            pVar2 = pVarF;
            FloatingActionButtonElevation floatingActionButtonElevation10 = floatingActionButtonElevation2;
            SurfaceKt.d(onClick, nVar3, false, g2Var2, j14, j114, floatingActionButtonElevation2.f(gVar2, pVarF, i214).getValue().w(), floatingActionButtonElevation2.e(gVar2, pVarF, i214).getValue().w(), null, gVar10, androidx.compose.runtime.internal.b.b(pVarF, 1249316354, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar3, int i216) {
                    if ((i216 & 11) == 2 && pVar3.b()) {
                        pVar3.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1249316354, i216, -1, "androidx.compose.material3.FloatingActionButton.<anonymous> (FloatingActionButton.kt:112)");
                    }
                    androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(j13))};
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar4 = content;
                    final int i217 = i16;
                    CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar3, -945978686, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar5, int i218) {
                            if ((i218 & 11) == 2 && pVar5.b()) {
                                pVar5.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-945978686, i218, -1, "androidx.compose.material3.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:113)");
                            }
                            TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar5, 6), t0.m.f140008a.n());
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar6 = pVar4;
                            final int i219 = i217;
                            TextKt.a(textStyleA, androidx.compose.runtime.internal.b.b(pVar5, 167946739, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt.FloatingActionButton.2.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar7, int i2110) {
                                    if ((i2110 & 11) == 2 && pVar7.b()) {
                                        pVar7.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(167946739, i2110, -1, "androidx.compose.material3.FloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:120)");
                                    }
                                    androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                                    t0.p pVar8 = t0.p.f140183a;
                                    androidx.compose.ui.n nVarG = SizeKt.g(companion, pVar8.e(), pVar8.c());
                                    androidx.compose.ui.c cVarI = androidx.compose.ui.c.INSTANCE.i();
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar9 = pVar6;
                                    int i2111 = i219;
                                    pVar7.T(733328855);
                                    androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(cVarI, false, pVar7, 6);
                                    pVar7.T(-1323940314);
                                    s1.e eVar = (s1.e) pVar7.K(CompositionLocalsKt.i());
                                    LayoutDirection layoutDirection = (LayoutDirection) pVar7.K(CompositionLocalsKt.p());
                                    androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar7.K(CompositionLocalsKt.u());
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    yh.a<ComposeUiNode> aVarA = companion2.a();
                                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarG);
                                    if (!(pVar7.G() instanceof androidx.compose.runtime.e)) {
                                        ComposablesKt.n();
                                    }
                                    pVar7.h();
                                    if (pVar7.D()) {
                                        pVar7.L(aVarA);
                                    } else {
                                        pVar7.d();
                                    }
                                    pVar7.Y();
                                    androidx.compose.runtime.p pVarB = Updater.b(pVar7);
                                    Updater.j(pVarB, i0VarK, companion2.d());
                                    Updater.j(pVarB, eVar, companion2.b());
                                    Updater.j(pVarB, layoutDirection, companion2.c());
                                    Updater.j(pVarB, d2Var, companion2.f());
                                    pVar7.x();
                                    qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar7)), pVar7, 0);
                                    pVar7.T(2058660585);
                                    pVar7.T(-2137368960);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
                                    pVar7.T(595057145);
                                    pVar9.invoke(pVar7, Integer.valueOf((i2111 >> 21) & 14));
                                    pVar7.c0();
                                    pVar7.c0();
                                    pVar7.c0();
                                    pVar7.f();
                                    pVar7.c0();
                                    pVar7.c0();
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar7, Integer num) {
                                    a(pVar7, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVar5, 48);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar5, Integer num) {
                            a(pVar5, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVar3, 56);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                    a(pVar3, num.intValue());
                    return kotlin.b2.f124493a;
                }
            }), pVar2, (i16 & 14) | (i16 & 112) | (i215 & bb.c.g.f32954lc) | (i215 & 57344) | (i215 & 458752) | (1879048192 & (i16 << 9)), 6, bb.c.b.f30507a2);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            g2Var3 = g2Var2;
            j15 = j14;
            j16 = j114;
            gVar3 = gVar10;
            floatingActionButtonElevation3 = floatingActionButtonElevation10;
        }
        u1VarH = pVar2.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar3, int i216) {
                FloatingActionButtonKt.c(onClick, nVar4, g2Var3, j15, j16, floatingActionButtonElevation3, gVar3, content, pVar3, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                a(pVar3, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0151 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0153  */
    /* JADX WARN: Code duplicated, block: B:115:0x0156  */
    /* JADX WARN: Code duplicated, block: B:118:0x015d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0168  */
    /* JADX WARN: Code duplicated, block: B:122:0x016e  */
    /* JADX WARN: Code duplicated, block: B:125:0x017b  */
    /* JADX WARN: Code duplicated, block: B:126:0x018c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0194  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:132:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:134:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:136:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:139:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:142:0x0247  */
    /* JADX WARN: Code duplicated, block: B:147:0x025d  */
    /* JADX WARN: Code duplicated, block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00da  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:89:0x0101  */
    /* JADX WARN: Code duplicated, block: B:93:0x0115  */
    /* JADX WARN: Code duplicated, block: B:95:0x0122  */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void d(@dl.d final yh.a<kotlin.b2> onClick, @dl.e androidx.compose.ui.n nVar, @dl.e g2 g2Var, long j10, long j11, @dl.e FloatingActionButtonElevation floatingActionButtonElevation, @dl.e androidx.compose.foundation.interaction.g gVar, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        g2 g2Var2;
        long jD;
        long j12;
        FloatingActionButtonElevation floatingActionButtonElevationC;
        int i13;
        final androidx.compose.foundation.interaction.g gVar2;
        int i14;
        int i15;
        androidx.compose.ui.n nVar2;
        g2 g2VarG;
        int i16;
        long jC;
        androidx.compose.ui.n nVar3;
        Object objU;
        androidx.compose.foundation.interaction.g gVar3;
        final androidx.compose.ui.n nVar4;
        final FloatingActionButtonElevation floatingActionButtonElevation2;
        final g2 g2Var3;
        final long j13;
        final long j14;
        androidx.compose.runtime.u1 u1VarH;
        int i17;
        kotlin.jvm.internal.f0.p(onClick, "onClick");
        kotlin.jvm.internal.f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(-1650866856);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(onClick) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & 112) == 0) {
                i12 |= pVarF.s(nVar) ? 32 : 16;
            }
            if ((i10 & bb.c.b.f30796me) == 0) {
                if ((i11 & 4) == 0) {
                    g2Var2 = g2Var;
                    int i19 = pVarF.s(g2Var2) ? 256 : 128;
                    i12 |= i19;
                } else {
                    g2Var2 = g2Var;
                }
                i12 |= i19;
            } else {
                g2Var2 = g2Var;
            }
            if ((i10 & bb.c.g.f32954lc) == 0) {
                if ((i11 & 8) == 0) {
                    jD = j10;
                    int i20 = pVarF.z(jD) ? 2048 : 1024;
                    i12 |= i20;
                } else {
                    jD = j10;
                }
                i12 |= i20;
            } else {
                jD = j10;
            }
            if ((i10 & 57344) == 0) {
                if ((i11 & 16) == 0) {
                    j12 = j11;
                    int i21 = pVarF.z(j12) ? 16384 : 8192;
                    i12 |= i21;
                } else {
                    j12 = j11;
                }
                i12 |= i21;
            } else {
                j12 = j11;
            }
            if ((i10 & 458752) == 0) {
                floatingActionButtonElevationC = floatingActionButtonElevation;
                if ((i11 & 32) == 0 || !pVarF.s(floatingActionButtonElevationC)) {
                    i17 = 65536;
                } else {
                    i17 = 131072;
                }
                i12 |= i17;
            } else {
                floatingActionButtonElevationC = floatingActionButtonElevation;
            }
            i13 = i11 & 64;
            if (i13 != 0) {
                i12 |= 1572864;
                gVar2 = gVar;
            } else {
                gVar2 = gVar;
                if ((i10 & 3670016) == 0) {
                    if (pVarF.s(gVar2)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i12 |= i14;
                }
            }
            if ((i11 & 128) != 0) {
                if ((i10 & 29360128) == 0) {
                    if (pVarF.s(content)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                }
                if ((23967451 & i12) == 4793490 || !pVarF.b()) {
                    pVarF.W();
                    if ((i10 & 1) != 0 || pVarF.o()) {
                        if (i18 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            g2VarG = e0.f11833a.g(pVarF, 6);
                        } else {
                            g2VarG = g2Var2;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            jD = e0.f11833a.d(pVarF, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i16 = i12 & (-57345);
                            jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                        } else {
                            i16 = i12;
                            jC = j12;
                        }
                        if ((i11 & 32) != 0) {
                            floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                            i12 = i16 & (-458753);
                        } else {
                            i12 = i16;
                        }
                        if (i13 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            nVar3 = nVar2;
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            nVar3 = nVar2;
                        }
                        FloatingActionButtonElevation floatingActionButtonElevation3 = floatingActionButtonElevationC;
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1650866856, i12, -1, "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:213)");
                        }
                        t0.n nVar5 = t0.n.f140069a;
                        c(onClick, SizeKt.G(nVar3, nVar5.e(), nVar5.c(), 0.0f, 0.0f, 12, null), g2VarG, jD, jC, floatingActionButtonElevation3, gVar3, content, pVarF, (i12 & 14) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        floatingActionButtonElevation2 = floatingActionButtonElevation3;
                        gVar2 = gVar3;
                        g2Var3 = g2VarG;
                        j13 = jC;
                        j14 = jD;
                    } else {
                        pVarF.l();
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                        }
                        nVar3 = nVar;
                        g2VarG = g2Var2;
                        jD = jD;
                        jC = j12;
                    }
                    gVar3 = gVar2;
                    FloatingActionButtonElevation floatingActionButtonElevation4 = floatingActionButtonElevationC;
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1650866856, i12, -1, "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:213)");
                    }
                    t0.n nVar6 = t0.n.f140069a;
                    c(onClick, SizeKt.G(nVar3, nVar6.e(), nVar6.c(), 0.0f, 0.0f, 12, null), g2VarG, jD, jC, floatingActionButtonElevation4, gVar3, content, pVarF, (i12 & 14) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    floatingActionButtonElevation2 = floatingActionButtonElevation4;
                    gVar2 = gVar3;
                    g2Var3 = g2VarG;
                    j13 = jC;
                    j14 = jD;
                } else {
                    pVarF.l();
                    nVar4 = nVar;
                    g2Var3 = g2Var2;
                    j14 = jD;
                    j13 = j12;
                    floatingActionButtonElevation2 = floatingActionButtonElevationC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$LargeFloatingActionButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i22) {
                        FloatingActionButtonKt.d(onClick, nVar4, g2Var3, j14, j13, floatingActionButtonElevation2, gVar2, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i15 = 12582912;
            i12 |= i15;
            if ((23967451 & i12) == 4793490) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        g2VarG = e0.f11833a.g(pVarF, 6);
                    } else {
                        g2VarG = g2Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jD = e0.f11833a.d(pVarF, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                    } else {
                        i16 = i12;
                        jC = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        gVar3 = gVar2;
                    }
                } else {
                    if (i18 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        g2VarG = e0.f11833a.g(pVarF, 6);
                    } else {
                        g2VarG = g2Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jD = e0.f11833a.d(pVarF, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                    } else {
                        i16 = i12;
                        jC = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        gVar3 = gVar2;
                    }
                }
                FloatingActionButtonElevation floatingActionButtonElevation5 = floatingActionButtonElevationC;
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1650866856, i12, -1, "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:213)");
                }
                t0.n nVar7 = t0.n.f140069a;
                c(onClick, SizeKt.G(nVar3, nVar7.e(), nVar7.c(), 0.0f, 0.0f, 12, null), g2VarG, jD, jC, floatingActionButtonElevation5, gVar3, content, pVarF, (i12 & 14) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                floatingActionButtonElevation2 = floatingActionButtonElevation5;
                gVar2 = gVar3;
                g2Var3 = g2VarG;
                j13 = jC;
                j14 = jD;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        g2VarG = e0.f11833a.g(pVarF, 6);
                    } else {
                        g2VarG = g2Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jD = e0.f11833a.d(pVarF, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                    } else {
                        i16 = i12;
                        jC = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        gVar3 = gVar2;
                    }
                } else {
                    if (i18 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        g2VarG = e0.f11833a.g(pVarF, 6);
                    } else {
                        g2VarG = g2Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jD = e0.f11833a.d(pVarF, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                    } else {
                        i16 = i12;
                        jC = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        gVar3 = gVar2;
                    }
                }
                FloatingActionButtonElevation floatingActionButtonElevation6 = floatingActionButtonElevationC;
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1650866856, i12, -1, "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:213)");
                }
                t0.n nVar8 = t0.n.f140069a;
                c(onClick, SizeKt.G(nVar3, nVar8.e(), nVar8.c(), 0.0f, 0.0f, 12, null), g2VarG, jD, jC, floatingActionButtonElevation6, gVar3, content, pVarF, (i12 & 14) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                floatingActionButtonElevation2 = floatingActionButtonElevation6;
                gVar2 = gVar3;
                g2Var3 = g2VarG;
                j13 = jC;
                j14 = jD;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$LargeFloatingActionButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i22) {
                    FloatingActionButtonKt.d(onClick, nVar4, g2Var3, j14, j13, floatingActionButtonElevation2, gVar2, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= 48;
        if ((i10 & bb.c.b.f30796me) == 0) {
            if ((i11 & 4) == 0) {
                g2Var2 = g2Var;
                if (pVarF.s(g2Var2)) {
                }
                i12 |= i19;
            } else {
                g2Var2 = g2Var;
            }
            i12 |= i19;
        } else {
            g2Var2 = g2Var;
        }
        if ((i10 & bb.c.g.f32954lc) == 0) {
            if ((i11 & 8) == 0) {
                jD = j10;
                if (pVarF.z(jD)) {
                }
                i12 |= i20;
            } else {
                jD = j10;
            }
            i12 |= i20;
        } else {
            jD = j10;
        }
        if ((i10 & 57344) == 0) {
            if ((i11 & 16) == 0) {
                j12 = j11;
                if (pVarF.z(j12)) {
                }
                i12 |= i21;
            } else {
                j12 = j11;
            }
            i12 |= i21;
        } else {
            j12 = j11;
        }
        if ((i10 & 458752) == 0) {
            floatingActionButtonElevationC = floatingActionButtonElevation;
            if ((i11 & 32) == 0) {
                i17 = 65536;
            } else {
                i17 = 65536;
            }
            i12 |= i17;
        } else {
            floatingActionButtonElevationC = floatingActionButtonElevation;
        }
        i13 = i11 & 64;
        if (i13 != 0) {
            i12 |= 1572864;
            gVar2 = gVar;
        } else {
            gVar2 = gVar;
            if ((i10 & 3670016) == 0) {
                if (pVarF.s(gVar2)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i12 |= i14;
            }
        }
        if ((i11 & 128) != 0) {
            if ((i10 & 29360128) == 0) {
                if (pVarF.s(content)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
            }
            if ((23967451 & i12) == 4793490) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        g2VarG = e0.f11833a.g(pVarF, 6);
                    } else {
                        g2VarG = g2Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jD = e0.f11833a.d(pVarF, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                    } else {
                        i16 = i12;
                        jC = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        gVar3 = gVar2;
                    }
                } else {
                    if (i18 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        g2VarG = e0.f11833a.g(pVarF, 6);
                    } else {
                        g2VarG = g2Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jD = e0.f11833a.d(pVarF, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                    } else {
                        i16 = i12;
                        jC = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        gVar3 = gVar2;
                    }
                }
                FloatingActionButtonElevation floatingActionButtonElevation7 = floatingActionButtonElevationC;
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1650866856, i12, -1, "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:213)");
                }
                t0.n nVar9 = t0.n.f140069a;
                c(onClick, SizeKt.G(nVar3, nVar9.e(), nVar9.c(), 0.0f, 0.0f, 12, null), g2VarG, jD, jC, floatingActionButtonElevation7, gVar3, content, pVarF, (i12 & 14) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                floatingActionButtonElevation2 = floatingActionButtonElevation7;
                gVar2 = gVar3;
                g2Var3 = g2VarG;
                j13 = jC;
                j14 = jD;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        g2VarG = e0.f11833a.g(pVarF, 6);
                    } else {
                        g2VarG = g2Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jD = e0.f11833a.d(pVarF, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                    } else {
                        i16 = i12;
                        jC = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        gVar3 = gVar2;
                    }
                } else {
                    if (i18 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        g2VarG = e0.f11833a.g(pVarF, 6);
                    } else {
                        g2VarG = g2Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jD = e0.f11833a.d(pVarF, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                    } else {
                        i16 = i12;
                        jC = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        gVar3 = gVar2;
                    }
                }
                FloatingActionButtonElevation floatingActionButtonElevation8 = floatingActionButtonElevationC;
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1650866856, i12, -1, "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:213)");
                }
                t0.n nVar10 = t0.n.f140069a;
                c(onClick, SizeKt.G(nVar3, nVar10.e(), nVar10.c(), 0.0f, 0.0f, 12, null), g2VarG, jD, jC, floatingActionButtonElevation8, gVar3, content, pVarF, (i12 & 14) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                floatingActionButtonElevation2 = floatingActionButtonElevation8;
                gVar2 = gVar3;
                g2Var3 = g2VarG;
                j13 = jC;
                j14 = jD;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$LargeFloatingActionButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i22) {
                    FloatingActionButtonKt.d(onClick, nVar4, g2Var3, j14, j13, floatingActionButtonElevation2, gVar2, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i15 = 12582912;
        i12 |= i15;
        if ((23967451 & i12) == 4793490) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    g2VarG = e0.f11833a.g(pVarF, 6);
                } else {
                    g2VarG = g2Var2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jD = e0.f11833a.d(pVarF, 6);
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                } else {
                    i16 = i12;
                    jC = j12;
                }
                if ((i11 & 32) != 0) {
                    floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                    i12 = i16 & (-458753);
                } else {
                    i12 = i16;
                }
                if (i13 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    nVar3 = nVar2;
                    gVar3 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    nVar3 = nVar2;
                    gVar3 = gVar2;
                }
            } else {
                if (i18 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    g2VarG = e0.f11833a.g(pVarF, 6);
                } else {
                    g2VarG = g2Var2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jD = e0.f11833a.d(pVarF, 6);
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                } else {
                    i16 = i12;
                    jC = j12;
                }
                if ((i11 & 32) != 0) {
                    floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                    i12 = i16 & (-458753);
                } else {
                    i12 = i16;
                }
                if (i13 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    nVar3 = nVar2;
                    gVar3 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    nVar3 = nVar2;
                    gVar3 = gVar2;
                }
            }
            FloatingActionButtonElevation floatingActionButtonElevation9 = floatingActionButtonElevationC;
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1650866856, i12, -1, "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:213)");
            }
            t0.n nVar11 = t0.n.f140069a;
            c(onClick, SizeKt.G(nVar3, nVar11.e(), nVar11.c(), 0.0f, 0.0f, 12, null), g2VarG, jD, jC, floatingActionButtonElevation9, gVar3, content, pVarF, (i12 & 14) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            floatingActionButtonElevation2 = floatingActionButtonElevation9;
            gVar2 = gVar3;
            g2Var3 = g2VarG;
            j13 = jC;
            j14 = jD;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    g2VarG = e0.f11833a.g(pVarF, 6);
                } else {
                    g2VarG = g2Var2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jD = e0.f11833a.d(pVarF, 6);
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                } else {
                    i16 = i12;
                    jC = j12;
                }
                if ((i11 & 32) != 0) {
                    floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                    i12 = i16 & (-458753);
                } else {
                    i12 = i16;
                }
                if (i13 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    nVar3 = nVar2;
                    gVar3 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    nVar3 = nVar2;
                    gVar3 = gVar2;
                }
            } else {
                if (i18 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    g2VarG = e0.f11833a.g(pVarF, 6);
                } else {
                    g2VarG = g2Var2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jD = e0.f11833a.d(pVarF, 6);
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                } else {
                    i16 = i12;
                    jC = j12;
                }
                if ((i11 & 32) != 0) {
                    floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                    i12 = i16 & (-458753);
                } else {
                    i12 = i16;
                }
                if (i13 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    nVar3 = nVar2;
                    gVar3 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    nVar3 = nVar2;
                    gVar3 = gVar2;
                }
            }
            FloatingActionButtonElevation floatingActionButtonElevation10 = floatingActionButtonElevationC;
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1650866856, i12, -1, "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:213)");
            }
            t0.n nVar12 = t0.n.f140069a;
            c(onClick, SizeKt.G(nVar3, nVar12.e(), nVar12.c(), 0.0f, 0.0f, 12, null), g2VarG, jD, jC, floatingActionButtonElevation10, gVar3, content, pVarF, (i12 & 14) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            floatingActionButtonElevation2 = floatingActionButtonElevation10;
            gVar2 = gVar3;
            g2Var3 = g2VarG;
            j13 = jC;
            j14 = jD;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$LargeFloatingActionButton$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i22) {
                FloatingActionButtonKt.d(onClick, nVar4, g2Var3, j14, j13, floatingActionButtonElevation2, gVar2, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0151 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0153  */
    /* JADX WARN: Code duplicated, block: B:115:0x0156  */
    /* JADX WARN: Code duplicated, block: B:118:0x015d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0168  */
    /* JADX WARN: Code duplicated, block: B:122:0x016e  */
    /* JADX WARN: Code duplicated, block: B:125:0x017b  */
    /* JADX WARN: Code duplicated, block: B:126:0x018c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0194  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:132:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:134:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:136:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:139:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:142:0x0247  */
    /* JADX WARN: Code duplicated, block: B:147:0x025d  */
    /* JADX WARN: Code duplicated, block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00da  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:89:0x0101  */
    /* JADX WARN: Code duplicated, block: B:93:0x0115  */
    /* JADX WARN: Code duplicated, block: B:95:0x0122  */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void e(@dl.d final yh.a<kotlin.b2> onClick, @dl.e androidx.compose.ui.n nVar, @dl.e g2 g2Var, long j10, long j11, @dl.e FloatingActionButtonElevation floatingActionButtonElevation, @dl.e androidx.compose.foundation.interaction.g gVar, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        g2 g2Var2;
        long jD;
        long j12;
        FloatingActionButtonElevation floatingActionButtonElevationC;
        int i13;
        final androidx.compose.foundation.interaction.g gVar2;
        int i14;
        int i15;
        androidx.compose.ui.n nVar2;
        g2 g2VarI;
        int i16;
        long jC;
        androidx.compose.ui.n nVar3;
        Object objU;
        androidx.compose.foundation.interaction.g gVar3;
        final androidx.compose.ui.n nVar4;
        final FloatingActionButtonElevation floatingActionButtonElevation2;
        final g2 g2Var3;
        final long j13;
        final long j14;
        androidx.compose.runtime.u1 u1VarH;
        int i17;
        kotlin.jvm.internal.f0.p(onClick, "onClick");
        kotlin.jvm.internal.f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(1444748300);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(onClick) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & 112) == 0) {
                i12 |= pVarF.s(nVar) ? 32 : 16;
            }
            if ((i10 & bb.c.b.f30796me) == 0) {
                if ((i11 & 4) == 0) {
                    g2Var2 = g2Var;
                    int i19 = pVarF.s(g2Var2) ? 256 : 128;
                    i12 |= i19;
                } else {
                    g2Var2 = g2Var;
                }
                i12 |= i19;
            } else {
                g2Var2 = g2Var;
            }
            if ((i10 & bb.c.g.f32954lc) == 0) {
                if ((i11 & 8) == 0) {
                    jD = j10;
                    int i20 = pVarF.z(jD) ? 2048 : 1024;
                    i12 |= i20;
                } else {
                    jD = j10;
                }
                i12 |= i20;
            } else {
                jD = j10;
            }
            if ((i10 & 57344) == 0) {
                if ((i11 & 16) == 0) {
                    j12 = j11;
                    int i21 = pVarF.z(j12) ? 16384 : 8192;
                    i12 |= i21;
                } else {
                    j12 = j11;
                }
                i12 |= i21;
            } else {
                j12 = j11;
            }
            if ((i10 & 458752) == 0) {
                floatingActionButtonElevationC = floatingActionButtonElevation;
                if ((i11 & 32) == 0 || !pVarF.s(floatingActionButtonElevationC)) {
                    i17 = 65536;
                } else {
                    i17 = 131072;
                }
                i12 |= i17;
            } else {
                floatingActionButtonElevationC = floatingActionButtonElevation;
            }
            i13 = i11 & 64;
            if (i13 != 0) {
                i12 |= 1572864;
                gVar2 = gVar;
            } else {
                gVar2 = gVar;
                if ((i10 & 3670016) == 0) {
                    if (pVarF.s(gVar2)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i12 |= i14;
                }
            }
            if ((i11 & 128) != 0) {
                if ((i10 & 29360128) == 0) {
                    if (pVarF.s(content)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                }
                if ((23967451 & i12) == 4793490 || !pVarF.b()) {
                    pVarF.W();
                    if ((i10 & 1) != 0 || pVarF.o()) {
                        if (i18 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            g2VarI = e0.f11833a.i(pVarF, 6);
                        } else {
                            g2VarI = g2Var2;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            jD = e0.f11833a.d(pVarF, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i16 = i12 & (-57345);
                            jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                        } else {
                            i16 = i12;
                            jC = j12;
                        }
                        if ((i11 & 32) != 0) {
                            floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                            i12 = i16 & (-458753);
                        } else {
                            i12 = i16;
                        }
                        if (i13 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            nVar3 = nVar2;
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            nVar3 = nVar2;
                        }
                        FloatingActionButtonElevation floatingActionButtonElevation3 = floatingActionButtonElevationC;
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1444748300, i12, -1, "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:161)");
                        }
                        t0.o oVar = t0.o.f140139a;
                        c(onClick, SizeKt.G(nVar3, oVar.e(), oVar.c(), 0.0f, 0.0f, 12, null), g2VarI, jD, jC, floatingActionButtonElevation3, gVar3, content, pVarF, (i12 & 14) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        floatingActionButtonElevation2 = floatingActionButtonElevation3;
                        gVar2 = gVar3;
                        g2Var3 = g2VarI;
                        j13 = jC;
                        j14 = jD;
                    } else {
                        pVarF.l();
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                        }
                        nVar3 = nVar;
                        g2VarI = g2Var2;
                        jD = jD;
                        jC = j12;
                    }
                    gVar3 = gVar2;
                    FloatingActionButtonElevation floatingActionButtonElevation4 = floatingActionButtonElevationC;
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1444748300, i12, -1, "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:161)");
                    }
                    t0.o oVar2 = t0.o.f140139a;
                    c(onClick, SizeKt.G(nVar3, oVar2.e(), oVar2.c(), 0.0f, 0.0f, 12, null), g2VarI, jD, jC, floatingActionButtonElevation4, gVar3, content, pVarF, (i12 & 14) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    floatingActionButtonElevation2 = floatingActionButtonElevation4;
                    gVar2 = gVar3;
                    g2Var3 = g2VarI;
                    j13 = jC;
                    j14 = jD;
                } else {
                    pVarF.l();
                    nVar4 = nVar;
                    g2Var3 = g2Var2;
                    j14 = jD;
                    j13 = j12;
                    floatingActionButtonElevation2 = floatingActionButtonElevationC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$SmallFloatingActionButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i22) {
                        FloatingActionButtonKt.e(onClick, nVar4, g2Var3, j14, j13, floatingActionButtonElevation2, gVar2, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i15 = 12582912;
            i12 |= i15;
            if ((23967451 & i12) == 4793490) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        g2VarI = e0.f11833a.i(pVarF, 6);
                    } else {
                        g2VarI = g2Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jD = e0.f11833a.d(pVarF, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                    } else {
                        i16 = i12;
                        jC = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        gVar3 = gVar2;
                    }
                } else {
                    if (i18 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        g2VarI = e0.f11833a.i(pVarF, 6);
                    } else {
                        g2VarI = g2Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jD = e0.f11833a.d(pVarF, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                    } else {
                        i16 = i12;
                        jC = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        gVar3 = gVar2;
                    }
                }
                FloatingActionButtonElevation floatingActionButtonElevation5 = floatingActionButtonElevationC;
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1444748300, i12, -1, "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:161)");
                }
                t0.o oVar3 = t0.o.f140139a;
                c(onClick, SizeKt.G(nVar3, oVar3.e(), oVar3.c(), 0.0f, 0.0f, 12, null), g2VarI, jD, jC, floatingActionButtonElevation5, gVar3, content, pVarF, (i12 & 14) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                floatingActionButtonElevation2 = floatingActionButtonElevation5;
                gVar2 = gVar3;
                g2Var3 = g2VarI;
                j13 = jC;
                j14 = jD;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        g2VarI = e0.f11833a.i(pVarF, 6);
                    } else {
                        g2VarI = g2Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jD = e0.f11833a.d(pVarF, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                    } else {
                        i16 = i12;
                        jC = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        gVar3 = gVar2;
                    }
                } else {
                    if (i18 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        g2VarI = e0.f11833a.i(pVarF, 6);
                    } else {
                        g2VarI = g2Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jD = e0.f11833a.d(pVarF, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                    } else {
                        i16 = i12;
                        jC = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        gVar3 = gVar2;
                    }
                }
                FloatingActionButtonElevation floatingActionButtonElevation6 = floatingActionButtonElevationC;
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1444748300, i12, -1, "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:161)");
                }
                t0.o oVar4 = t0.o.f140139a;
                c(onClick, SizeKt.G(nVar3, oVar4.e(), oVar4.c(), 0.0f, 0.0f, 12, null), g2VarI, jD, jC, floatingActionButtonElevation6, gVar3, content, pVarF, (i12 & 14) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                floatingActionButtonElevation2 = floatingActionButtonElevation6;
                gVar2 = gVar3;
                g2Var3 = g2VarI;
                j13 = jC;
                j14 = jD;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$SmallFloatingActionButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i22) {
                    FloatingActionButtonKt.e(onClick, nVar4, g2Var3, j14, j13, floatingActionButtonElevation2, gVar2, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= 48;
        if ((i10 & bb.c.b.f30796me) == 0) {
            if ((i11 & 4) == 0) {
                g2Var2 = g2Var;
                if (pVarF.s(g2Var2)) {
                }
                i12 |= i19;
            } else {
                g2Var2 = g2Var;
            }
            i12 |= i19;
        } else {
            g2Var2 = g2Var;
        }
        if ((i10 & bb.c.g.f32954lc) == 0) {
            if ((i11 & 8) == 0) {
                jD = j10;
                if (pVarF.z(jD)) {
                }
                i12 |= i20;
            } else {
                jD = j10;
            }
            i12 |= i20;
        } else {
            jD = j10;
        }
        if ((i10 & 57344) == 0) {
            if ((i11 & 16) == 0) {
                j12 = j11;
                if (pVarF.z(j12)) {
                }
                i12 |= i21;
            } else {
                j12 = j11;
            }
            i12 |= i21;
        } else {
            j12 = j11;
        }
        if ((i10 & 458752) == 0) {
            floatingActionButtonElevationC = floatingActionButtonElevation;
            if ((i11 & 32) == 0) {
                i17 = 65536;
            } else {
                i17 = 65536;
            }
            i12 |= i17;
        } else {
            floatingActionButtonElevationC = floatingActionButtonElevation;
        }
        i13 = i11 & 64;
        if (i13 != 0) {
            i12 |= 1572864;
            gVar2 = gVar;
        } else {
            gVar2 = gVar;
            if ((i10 & 3670016) == 0) {
                if (pVarF.s(gVar2)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i12 |= i14;
            }
        }
        if ((i11 & 128) != 0) {
            if ((i10 & 29360128) == 0) {
                if (pVarF.s(content)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
            }
            if ((23967451 & i12) == 4793490) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        g2VarI = e0.f11833a.i(pVarF, 6);
                    } else {
                        g2VarI = g2Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jD = e0.f11833a.d(pVarF, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                    } else {
                        i16 = i12;
                        jC = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        gVar3 = gVar2;
                    }
                } else {
                    if (i18 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        g2VarI = e0.f11833a.i(pVarF, 6);
                    } else {
                        g2VarI = g2Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jD = e0.f11833a.d(pVarF, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                    } else {
                        i16 = i12;
                        jC = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        gVar3 = gVar2;
                    }
                }
                FloatingActionButtonElevation floatingActionButtonElevation7 = floatingActionButtonElevationC;
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1444748300, i12, -1, "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:161)");
                }
                t0.o oVar5 = t0.o.f140139a;
                c(onClick, SizeKt.G(nVar3, oVar5.e(), oVar5.c(), 0.0f, 0.0f, 12, null), g2VarI, jD, jC, floatingActionButtonElevation7, gVar3, content, pVarF, (i12 & 14) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                floatingActionButtonElevation2 = floatingActionButtonElevation7;
                gVar2 = gVar3;
                g2Var3 = g2VarI;
                j13 = jC;
                j14 = jD;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        g2VarI = e0.f11833a.i(pVarF, 6);
                    } else {
                        g2VarI = g2Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jD = e0.f11833a.d(pVarF, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                    } else {
                        i16 = i12;
                        jC = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        gVar3 = gVar2;
                    }
                } else {
                    if (i18 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        g2VarI = e0.f11833a.i(pVarF, 6);
                    } else {
                        g2VarI = g2Var2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jD = e0.f11833a.d(pVarF, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                    } else {
                        i16 = i12;
                        jC = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        gVar3 = gVar2;
                    }
                }
                FloatingActionButtonElevation floatingActionButtonElevation8 = floatingActionButtonElevationC;
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1444748300, i12, -1, "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:161)");
                }
                t0.o oVar6 = t0.o.f140139a;
                c(onClick, SizeKt.G(nVar3, oVar6.e(), oVar6.c(), 0.0f, 0.0f, 12, null), g2VarI, jD, jC, floatingActionButtonElevation8, gVar3, content, pVarF, (i12 & 14) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                floatingActionButtonElevation2 = floatingActionButtonElevation8;
                gVar2 = gVar3;
                g2Var3 = g2VarI;
                j13 = jC;
                j14 = jD;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$SmallFloatingActionButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i22) {
                    FloatingActionButtonKt.e(onClick, nVar4, g2Var3, j14, j13, floatingActionButtonElevation2, gVar2, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i15 = 12582912;
        i12 |= i15;
        if ((23967451 & i12) == 4793490) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    g2VarI = e0.f11833a.i(pVarF, 6);
                } else {
                    g2VarI = g2Var2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jD = e0.f11833a.d(pVarF, 6);
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                } else {
                    i16 = i12;
                    jC = j12;
                }
                if ((i11 & 32) != 0) {
                    floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                    i12 = i16 & (-458753);
                } else {
                    i12 = i16;
                }
                if (i13 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    nVar3 = nVar2;
                    gVar3 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    nVar3 = nVar2;
                    gVar3 = gVar2;
                }
            } else {
                if (i18 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    g2VarI = e0.f11833a.i(pVarF, 6);
                } else {
                    g2VarI = g2Var2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jD = e0.f11833a.d(pVarF, 6);
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                } else {
                    i16 = i12;
                    jC = j12;
                }
                if ((i11 & 32) != 0) {
                    floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                    i12 = i16 & (-458753);
                } else {
                    i12 = i16;
                }
                if (i13 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    nVar3 = nVar2;
                    gVar3 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    nVar3 = nVar2;
                    gVar3 = gVar2;
                }
            }
            FloatingActionButtonElevation floatingActionButtonElevation9 = floatingActionButtonElevationC;
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(1444748300, i12, -1, "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:161)");
            }
            t0.o oVar7 = t0.o.f140139a;
            c(onClick, SizeKt.G(nVar3, oVar7.e(), oVar7.c(), 0.0f, 0.0f, 12, null), g2VarI, jD, jC, floatingActionButtonElevation9, gVar3, content, pVarF, (i12 & 14) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            floatingActionButtonElevation2 = floatingActionButtonElevation9;
            gVar2 = gVar3;
            g2Var3 = g2VarI;
            j13 = jC;
            j14 = jD;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    g2VarI = e0.f11833a.i(pVarF, 6);
                } else {
                    g2VarI = g2Var2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jD = e0.f11833a.d(pVarF, 6);
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                } else {
                    i16 = i12;
                    jC = j12;
                }
                if ((i11 & 32) != 0) {
                    floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                    i12 = i16 & (-458753);
                } else {
                    i12 = i16;
                }
                if (i13 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    nVar3 = nVar2;
                    gVar3 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    nVar3 = nVar2;
                    gVar3 = gVar2;
                }
            } else {
                if (i18 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    g2VarI = e0.f11833a.i(pVarF, 6);
                } else {
                    g2VarI = g2Var2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jD = e0.f11833a.d(pVarF, 6);
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    jC = ColorSchemeKt.c(jD, pVarF, (i12 >> 9) & 14);
                } else {
                    i16 = i12;
                    jC = j12;
                }
                if ((i11 & 32) != 0) {
                    floatingActionButtonElevationC = e0.f11833a.c(0.0f, 0.0f, 0.0f, 0.0f, pVarF, 24576, 15);
                    i12 = i16 & (-458753);
                } else {
                    i12 = i16;
                }
                if (i13 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    nVar3 = nVar2;
                    gVar3 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    nVar3 = nVar2;
                    gVar3 = gVar2;
                }
            }
            FloatingActionButtonElevation floatingActionButtonElevation10 = floatingActionButtonElevationC;
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(1444748300, i12, -1, "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:161)");
            }
            t0.o oVar8 = t0.o.f140139a;
            c(onClick, SizeKt.G(nVar3, oVar8.e(), oVar8.c(), 0.0f, 0.0f, 12, null), g2VarI, jD, jC, floatingActionButtonElevation10, gVar3, content, pVarF, (i12 & 14) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            floatingActionButtonElevation2 = floatingActionButtonElevation10;
            gVar2 = gVar3;
            g2Var3 = g2VarI;
            j13 = jC;
            j14 = jD;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.FloatingActionButtonKt$SmallFloatingActionButton$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i22) {
                FloatingActionButtonKt.e(onClick, nVar4, g2Var3, j14, j13, floatingActionButtonElevation2, gVar2, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }
}
