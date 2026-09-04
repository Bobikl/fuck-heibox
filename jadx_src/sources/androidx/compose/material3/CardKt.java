package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.g2;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Card.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001aa\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0083\u0001\u0010\u0018\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001aU\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001aw\u0010\u001c\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a_\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001e\u0010\u0011\u001a\u0081\u0001\u0010\u001f\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001f\u0010\u0019¨\u0006 "}, d2 = {"Landroidx/compose/ui/n;", "modifier", "Landroidx/compose/ui/graphics/g2;", "shape", "Landroidx/compose/material3/g;", "colors", "Landroidx/compose/material3/CardElevation;", "elevation", "Landroidx/compose/foundation/g;", "border", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/o;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "Lkotlin/t;", "content", ak.av, "(Landroidx/compose/ui/n;Landroidx/compose/ui/graphics/g2;Landroidx/compose/material3/g;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/g;Lyh/q;Landroidx/compose/runtime/p;II)V", "Lkotlin/Function0;", "onClick", "", "enabled", "Landroidx/compose/foundation/interaction/g;", "interactionSource", "b", "(Lyh/a;Landroidx/compose/ui/n;ZLandroidx/compose/ui/graphics/g2;Landroidx/compose/material3/g;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/g;Landroidx/compose/foundation/interaction/g;Lyh/q;Landroidx/compose/runtime/p;II)V", ak.aF, "(Landroidx/compose/ui/n;Landroidx/compose/ui/graphics/g2;Landroidx/compose/material3/g;Landroidx/compose/material3/CardElevation;Lyh/q;Landroidx/compose/runtime/p;II)V", "d", "(Lyh/a;Landroidx/compose/ui/n;ZLandroidx/compose/ui/graphics/g2;Landroidx/compose/material3/g;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/interaction/g;Lyh/q;Landroidx/compose/runtime/p;II)V", "e", "f", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class CardKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0154  */
    /* JADX WARN: Code duplicated, block: B:102:0x0158  */
    /* JADX WARN: Code duplicated, block: B:103:0x015b  */
    /* JADX WARN: Code duplicated, block: B:107:0x016b  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0100  */
    /* JADX WARN: Code duplicated, block: B:88:0x0103  */
    /* JADX WARN: Code duplicated, block: B:91:0x0108  */
    /* JADX WARN: Code duplicated, block: B:92:0x0111  */
    /* JADX WARN: Code duplicated, block: B:95:0x0116  */
    /* JADX WARN: Code duplicated, block: B:96:0x0139  */
    /* JADX WARN: Code duplicated, block: B:99:0x0140  */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void a(@dl.e androidx.compose.ui.n nVar, @dl.e g2 g2Var, @dl.e g gVar, @dl.e CardElevation cardElevation, @dl.e BorderStroke borderStroke, @dl.d final yh.q<? super androidx.compose.foundation.layout.o, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        androidx.compose.ui.n nVar2;
        int i12;
        g2 g2Var2;
        g gVar2;
        CardElevation cardElevation2;
        BorderStroke borderStroke2;
        int i13;
        androidx.compose.ui.n nVar3;
        g2 g2VarG;
        g gVarA;
        CardElevation cardElevationB;
        BorderStroke borderStroke3;
        final int i14;
        CardElevation cardElevation3;
        final BorderStroke borderStroke4;
        final CardElevation cardElevation4;
        androidx.compose.runtime.u1 u1VarH;
        kotlin.jvm.internal.f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(1179621553);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
            nVar2 = nVar;
        } else if ((i10 & 14) == 0) {
            nVar2 = nVar;
            i12 = (pVarF.s(nVar2) ? 4 : 2) | i10;
        } else {
            nVar2 = nVar;
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                g2Var2 = g2Var;
                int i16 = pVarF.s(g2Var2) ? 32 : 16;
                i12 |= i16;
            } else {
                g2Var2 = g2Var;
            }
            i12 |= i16;
        } else {
            g2Var2 = g2Var;
        }
        if ((i10 & bb.c.b.f30796me) == 0) {
            if ((i11 & 4) == 0) {
                gVar2 = gVar;
                int i17 = pVarF.s(gVar2) ? 256 : 128;
                i12 |= i17;
            } else {
                gVar2 = gVar;
            }
            i12 |= i17;
        } else {
            gVar2 = gVar;
        }
        if ((i10 & bb.c.g.f32954lc) == 0) {
            cardElevation2 = cardElevation;
            i12 |= ((i11 & 8) == 0 && pVarF.s(cardElevation2)) ? 2048 : 1024;
        } else {
            cardElevation2 = cardElevation;
        }
        int i18 = i11 & 16;
        if (i18 != 0) {
            i12 |= 24576;
            borderStroke2 = borderStroke;
        } else {
            borderStroke2 = borderStroke;
            if ((57344 & i10) == 0) {
                i12 |= pVarF.s(borderStroke2) ? 16384 : 8192;
            }
        }
        if ((i11 & 32) == 0) {
            if ((458752 & i10) == 0) {
                i13 = pVarF.s(content) ? 131072 : 65536;
            }
            if ((374491 & i12) == 74898 || !pVarF.b()) {
                pVarF.W();
                if ((i10 & 1) != 0 || pVarF.o()) {
                    if (i15 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if ((i11 & 2) != 0) {
                        g2VarG = h.f11894a.g(pVarF, 6);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        g2VarG = g2Var2;
                    }
                    if ((i11 & 4) != 0) {
                        gVarA = h.f11894a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        i12 &= -897;
                    } else {
                        gVarA = gVar2;
                    }
                    if ((i11 & 8) != 0) {
                        cardElevationB = h.f11894a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        cardElevationB = cardElevation;
                    }
                    if (i18 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    CardElevation cardElevation5 = cardElevationB;
                    i14 = i12;
                    cardElevation3 = cardElevation5;
                } else {
                    pVarF.l();
                    if ((i11 & 2) != 0) {
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    nVar3 = nVar2;
                    g2VarG = g2Var2;
                    gVarA = gVar2;
                    borderStroke3 = borderStroke2;
                    i14 = i12;
                    cardElevation3 = cardElevation2;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1179621553, i14, -1, "androidx.compose.material3.Card (Card.kt:75)");
                }
                int i19 = i14 >> 3;
                int i20 = (i19 & 112) | 6;
                long jM = gVarA.a(true, pVarF, i20).getValue().M();
                long jM2 = gVarA.b(true, pVarF, i20).getValue().M();
                int i21 = (i19 & bb.c.b.f30796me) | 54;
                CardElevation cardElevation6 = cardElevation3;
                SurfaceKt.a(nVar3, g2VarG, jM, jM2, cardElevation3.h(true, null, pVarF, i21).getValue().w(), cardElevation3.g(true, null, pVarF, i21).getValue().w(), borderStroke3, androidx.compose.runtime.internal.b.b(pVarF, 664103990, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$Card$1
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
                            ComposerKt.w0(664103990, i22, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:91)");
                        }
                        yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                        int i23 = (i14 >> 6) & bb.c.g.f32954lc;
                        pVar2.T(-483455358);
                        androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                        int i24 = i23 >> 3;
                        androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(Arrangement.f5896a.r(), androidx.compose.ui.c.INSTANCE.u(), pVar2, (i24 & 112) | (i24 & 14));
                        pVar2.T(-1323940314);
                        s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA = companion2.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(companion);
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
                        Updater.j(pVarB, i0VarB, companion2.d());
                        Updater.j(pVarB, eVar, companion2.b());
                        Updater.j(pVarB, layoutDirection, companion2.c());
                        Updater.j(pVarB, d2Var, companion2.f());
                        pVar2.x();
                        qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, Integer.valueOf((i25 >> 3) & 112));
                        pVar2.T(2058660585);
                        pVar2.T(-1163856341);
                        if (((i25 >> 9) & 14 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                        } else {
                            qVar.invoke(ColumnScopeInstance.f5971a, pVar2, Integer.valueOf(((i23 >> 6) & 112) | 6));
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
                }), pVarF, 12582912 | (i14 & 14) | (i14 & 112) | ((i14 << 6) & 3670016), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                gVar2 = gVarA;
                borderStroke4 = borderStroke3;
                cardElevation4 = cardElevation6;
            } else {
                pVarF.l();
                nVar3 = nVar2;
                g2VarG = g2Var2;
                borderStroke4 = borderStroke2;
                cardElevation4 = cardElevation2;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar4 = nVar3;
            final g2 g2Var3 = g2VarG;
            final g gVar3 = gVar2;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$Card$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i22) {
                    CardKt.a(nVar4, g2Var3, gVar3, cardElevation4, borderStroke4, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i13 = androidx.profileinstaller.o.c.f26824k;
        i12 |= i13;
        if ((374491 & i12) == 74898) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if ((i11 & 2) != 0) {
                    g2VarG = h.f11894a.g(pVarF, 6);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                } else {
                    g2VarG = g2Var2;
                }
                if ((i11 & 4) != 0) {
                    gVarA = h.f11894a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    i12 &= -897;
                } else {
                    gVarA = gVar2;
                }
                if ((i11 & 8) != 0) {
                    cardElevationB = h.f11894a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                    i12 &= -7169;
                } else {
                    cardElevationB = cardElevation;
                }
                if (i18 != 0) {
                    borderStroke3 = null;
                } else {
                    borderStroke3 = borderStroke;
                }
                CardElevation cardElevation7 = cardElevationB;
                i14 = i12;
                cardElevation3 = cardElevation7;
            } else {
                if (i15 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if ((i11 & 2) != 0) {
                    g2VarG = h.f11894a.g(pVarF, 6);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                } else {
                    g2VarG = g2Var2;
                }
                if ((i11 & 4) != 0) {
                    gVarA = h.f11894a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    i12 &= -897;
                } else {
                    gVarA = gVar2;
                }
                if ((i11 & 8) != 0) {
                    cardElevationB = h.f11894a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                    i12 &= -7169;
                } else {
                    cardElevationB = cardElevation;
                }
                if (i18 != 0) {
                    borderStroke3 = null;
                } else {
                    borderStroke3 = borderStroke;
                }
                CardElevation cardElevation8 = cardElevationB;
                i14 = i12;
                cardElevation3 = cardElevation8;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(1179621553, i14, -1, "androidx.compose.material3.Card (Card.kt:75)");
            }
            int i110 = i14 >> 3;
            int i22 = (i110 & 112) | 6;
            long jM3 = gVarA.a(true, pVarF, i22).getValue().M();
            long jM4 = gVarA.b(true, pVarF, i22).getValue().M();
            int i23 = (i110 & bb.c.b.f30796me) | 54;
            CardElevation cardElevation9 = cardElevation3;
            SurfaceKt.a(nVar3, g2VarG, jM3, jM4, cardElevation3.h(true, null, pVarF, i23).getValue().w(), cardElevation3.g(true, null, pVarF, i23).getValue().w(), borderStroke3, androidx.compose.runtime.internal.b.b(pVarF, 664103990, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$Card$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i24) {
                    if ((i24 & 11) == 2 && pVar2.b()) {
                        pVar2.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(664103990, i24, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:91)");
                    }
                    yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                    int i25 = (i14 >> 6) & bb.c.g.f32954lc;
                    pVar2.T(-483455358);
                    androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                    int i26 = i25 >> 3;
                    androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(Arrangement.f5896a.r(), androidx.compose.ui.c.INSTANCE.u(), pVar2, (i26 & 112) | (i26 & 14));
                    pVar2.T(-1323940314);
                    s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                    androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    yh.a<ComposeUiNode> aVarA = companion2.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(companion);
                    int i27 = ((((i25 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
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
                    Updater.j(pVarB, i0VarB, companion2.d());
                    Updater.j(pVarB, eVar, companion2.b());
                    Updater.j(pVarB, layoutDirection, companion2.c());
                    Updater.j(pVarB, d2Var, companion2.f());
                    pVar2.x();
                    qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, Integer.valueOf((i27 >> 3) & 112));
                    pVar2.T(2058660585);
                    pVar2.T(-1163856341);
                    if (((i27 >> 9) & 14 & 11) == 2 && pVar2.b()) {
                        pVar2.l();
                    } else {
                        qVar.invoke(ColumnScopeInstance.f5971a, pVar2, Integer.valueOf(((i25 >> 6) & 112) | 6));
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
            }), pVarF, 12582912 | (i14 & 14) | (i14 & 112) | ((i14 << 6) & 3670016), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            gVar2 = gVarA;
            borderStroke4 = borderStroke3;
            cardElevation4 = cardElevation9;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if ((i11 & 2) != 0) {
                    g2VarG = h.f11894a.g(pVarF, 6);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                } else {
                    g2VarG = g2Var2;
                }
                if ((i11 & 4) != 0) {
                    gVarA = h.f11894a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    i12 &= -897;
                } else {
                    gVarA = gVar2;
                }
                if ((i11 & 8) != 0) {
                    cardElevationB = h.f11894a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                    i12 &= -7169;
                } else {
                    cardElevationB = cardElevation;
                }
                if (i18 != 0) {
                    borderStroke3 = null;
                } else {
                    borderStroke3 = borderStroke;
                }
                CardElevation cardElevation10 = cardElevationB;
                i14 = i12;
                cardElevation3 = cardElevation10;
            } else {
                if (i15 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if ((i11 & 2) != 0) {
                    g2VarG = h.f11894a.g(pVarF, 6);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                } else {
                    g2VarG = g2Var2;
                }
                if ((i11 & 4) != 0) {
                    gVarA = h.f11894a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    i12 &= -897;
                } else {
                    gVarA = gVar2;
                }
                if ((i11 & 8) != 0) {
                    cardElevationB = h.f11894a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                    i12 &= -7169;
                } else {
                    cardElevationB = cardElevation;
                }
                if (i18 != 0) {
                    borderStroke3 = null;
                } else {
                    borderStroke3 = borderStroke;
                }
                CardElevation cardElevation11 = cardElevationB;
                i14 = i12;
                cardElevation3 = cardElevation11;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(1179621553, i14, -1, "androidx.compose.material3.Card (Card.kt:75)");
            }
            int i111 = i14 >> 3;
            int i24 = (i111 & 112) | 6;
            long jM5 = gVarA.a(true, pVarF, i24).getValue().M();
            long jM6 = gVarA.b(true, pVarF, i24).getValue().M();
            int i25 = (i111 & bb.c.b.f30796me) | 54;
            CardElevation cardElevation12 = cardElevation3;
            SurfaceKt.a(nVar3, g2VarG, jM5, jM6, cardElevation3.h(true, null, pVarF, i25).getValue().w(), cardElevation3.g(true, null, pVarF, i25).getValue().w(), borderStroke3, androidx.compose.runtime.internal.b.b(pVarF, 664103990, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$Card$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i26) {
                    if ((i26 & 11) == 2 && pVar2.b()) {
                        pVar2.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(664103990, i26, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:91)");
                    }
                    yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                    int i27 = (i14 >> 6) & bb.c.g.f32954lc;
                    pVar2.T(-483455358);
                    androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                    int i28 = i27 >> 3;
                    androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(Arrangement.f5896a.r(), androidx.compose.ui.c.INSTANCE.u(), pVar2, (i28 & 112) | (i28 & 14));
                    pVar2.T(-1323940314);
                    s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                    androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    yh.a<ComposeUiNode> aVarA = companion2.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(companion);
                    int i29 = ((((i27 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
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
                    Updater.j(pVarB, i0VarB, companion2.d());
                    Updater.j(pVarB, eVar, companion2.b());
                    Updater.j(pVarB, layoutDirection, companion2.c());
                    Updater.j(pVarB, d2Var, companion2.f());
                    pVar2.x();
                    qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, Integer.valueOf((i29 >> 3) & 112));
                    pVar2.T(2058660585);
                    pVar2.T(-1163856341);
                    if (((i29 >> 9) & 14 & 11) == 2 && pVar2.b()) {
                        pVar2.l();
                    } else {
                        qVar.invoke(ColumnScopeInstance.f5971a, pVar2, Integer.valueOf(((i27 >> 6) & 112) | 6));
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
            }), pVarF, 12582912 | (i14 & 14) | (i14 & 112) | ((i14 << 6) & 3670016), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            gVar2 = gVarA;
            borderStroke4 = borderStroke3;
            cardElevation4 = cardElevation12;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        final androidx.compose.ui.n nVar5 = nVar3;
        final g2 g2Var4 = g2VarG;
        final g gVar4 = gVar2;
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$Card$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i26) {
                CardKt.a(nVar5, g2Var4, gVar4, cardElevation4, borderStroke4, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0135  */
    /* JADX WARN: Code duplicated, block: B:106:0x0143  */
    /* JADX WARN: Code duplicated, block: B:120:0x016f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0171  */
    /* JADX WARN: Code duplicated, block: B:122:0x0174  */
    /* JADX WARN: Code duplicated, block: B:124:0x0178  */
    /* JADX WARN: Code duplicated, block: B:127:0x017d  */
    /* JADX WARN: Code duplicated, block: B:128:0x0187  */
    /* JADX WARN: Code duplicated, block: B:131:0x018d  */
    /* JADX WARN: Code duplicated, block: B:132:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:135:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:136:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:138:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:139:0x01da  */
    /* JADX WARN: Code duplicated, block: B:141:0x01de  */
    /* JADX WARN: Code duplicated, block: B:143:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:145:0x0207  */
    /* JADX WARN: Code duplicated, block: B:148:0x021c  */
    /* JADX WARN: Code duplicated, block: B:151:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:156:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:90:0x0101  */
    /* JADX WARN: Code duplicated, block: B:92:0x0105  */
    /* JADX WARN: Code duplicated, block: B:94:0x0109  */
    /* JADX WARN: Code duplicated, block: B:96:0x010f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0112  */
    @w
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void b(@dl.d final yh.a<kotlin.b2> onClick, @dl.e androidx.compose.ui.n nVar, boolean z10, @dl.e g2 g2Var, @dl.e g gVar, @dl.e CardElevation cardElevation, @dl.e BorderStroke borderStroke, @dl.e androidx.compose.foundation.interaction.g gVar2, @dl.d final yh.q<? super androidx.compose.foundation.layout.o, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        int i13;
        boolean z11;
        int i14;
        g2 g2Var2;
        g gVar3;
        CardElevation cardElevation2;
        int i15;
        BorderStroke borderStroke2;
        int i16;
        int i17;
        int i18;
        int i19;
        androidx.compose.ui.n nVar2;
        char c10;
        g2 g2VarG;
        g gVarA;
        CardElevation cardElevationB;
        BorderStroke borderStroke3;
        androidx.compose.foundation.interaction.g gVar4;
        androidx.compose.ui.n nVar3;
        final int i20;
        g2 g2Var3;
        BorderStroke borderStroke4;
        g gVar5;
        boolean z12;
        CardElevation cardElevation3;
        Object objU;
        androidx.compose.runtime.p pVar2;
        final androidx.compose.ui.n nVar4;
        final g2 g2Var4;
        final BorderStroke borderStroke5;
        final g gVar6;
        final boolean z13;
        final androidx.compose.foundation.interaction.g gVar7;
        final CardElevation cardElevation4;
        androidx.compose.runtime.u1 u1VarH;
        kotlin.jvm.internal.f0.p(onClick, "onClick");
        kotlin.jvm.internal.f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(-2024281376);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(onClick) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i21 = i11 & 2;
        if (i21 == 0) {
            if ((i10 & 112) == 0) {
                i12 |= pVarF.s(nVar) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & bb.c.b.f30796me) == 0) {
                    z11 = z10;
                    if (pVarF.u(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    if ((i11 & 8) == 0) {
                        g2Var2 = g2Var;
                        int i22 = pVarF.s(g2Var2) ? 2048 : 1024;
                        i12 |= i22;
                    } else {
                        g2Var2 = g2Var;
                    }
                    i12 |= i22;
                } else {
                    g2Var2 = g2Var;
                }
                if ((57344 & i10) == 0) {
                    if ((i11 & 16) == 0) {
                        gVar3 = gVar;
                        int i23 = pVarF.s(gVar3) ? 16384 : 8192;
                        i12 |= i23;
                    } else {
                        gVar3 = gVar;
                    }
                    i12 |= i23;
                } else {
                    gVar3 = gVar;
                }
                if ((458752 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        cardElevation2 = cardElevation;
                        int i24 = pVarF.s(cardElevation2) ? 131072 : 65536;
                        i12 |= i24;
                    } else {
                        cardElevation2 = cardElevation;
                    }
                    i12 |= i24;
                } else {
                    cardElevation2 = cardElevation;
                }
                i15 = i11 & 64;
                if (i15 != 0) {
                    i12 |= 1572864;
                    borderStroke2 = borderStroke;
                } else {
                    borderStroke2 = borderStroke;
                    if ((3670016 & i10) == 0) {
                        if (pVarF.s(borderStroke2)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i12 |= i16;
                    }
                }
                i17 = i11 & 128;
                if (i17 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (pVarF.s(gVar2)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 234881024) == 0) {
                        if (pVarF.s(content)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                    }
                    if ((191739611 & i12) == 38347922 || !pVarF.b()) {
                        pVarF.W();
                        if ((i10 & 1) != 0 || pVarF.o()) {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                c10 = 6;
                                g2VarG = h.f11894a.g(pVarF, 6);
                                i12 &= -7169;
                            } else {
                                c10 = 6;
                                g2VarG = g2Var2;
                            }
                            if ((i11 & 16) != 0) {
                                gVarA = h.f11894a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                                i12 &= -57345;
                            } else {
                                gVarA = gVar3;
                            }
                            if ((i11 & 32) != 0) {
                                cardElevationB = h.f11894a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                                i12 &= -458753;
                            } else {
                                cardElevationB = cardElevation2;
                            }
                            if (i15 != 0) {
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                            }
                            if (i17 != 0) {
                                pVarF.T(-492369756);
                                objU = pVarF.U();
                                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = androidx.compose.foundation.interaction.f.a();
                                    pVarF.N(objU);
                                }
                                pVarF.c0();
                                nVar3 = nVar2;
                                g2Var3 = g2VarG;
                                borderStroke4 = borderStroke3;
                                gVar5 = gVarA;
                                cardElevation3 = cardElevationB;
                                gVar4 = (androidx.compose.foundation.interaction.g) objU;
                            } else {
                                gVar4 = gVar2;
                                nVar3 = nVar2;
                                i20 = i12;
                                g2Var3 = g2VarG;
                                borderStroke4 = borderStroke3;
                                gVar5 = gVarA;
                                z12 = z11;
                                cardElevation3 = cardElevationB;
                            }
                            pVarF.O();
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-2024281376, i20, -1, "androidx.compose.material3.Card (Card.kt:131)");
                            }
                            int i25 = (i20 >> 6) & 14;
                            int i26 = i20 >> 9;
                            int i27 = i25 | (i26 & 112);
                            long jM = gVar5.a(z12, pVarF, i27).getValue().M();
                            long jM2 = gVar5.b(z12, pVarF, i27).getValue().M();
                            int i28 = i25 | ((i20 >> 18) & 112) | (i26 & bb.c.b.f30796me);
                            float fW = cardElevation3.h(z12, gVar4, pVarF, i28).getValue().w();
                            g gVar8 = gVar5;
                            float fW2 = cardElevation3.g(z12, gVar4, pVarF, i28).getValue().w();
                            boolean z14 = z12;
                            androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVarF, 776921067, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$Card$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar3, int i29) {
                                    if ((i29 & 11) == 2 && pVar3.b()) {
                                        pVar3.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(776921067, i29, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:153)");
                                    }
                                    yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                    int i30 = (i20 >> 15) & bb.c.g.f32954lc;
                                    pVar3.T(-483455358);
                                    androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                                    int i31 = i30 >> 3;
                                    androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(Arrangement.f5896a.r(), androidx.compose.ui.c.INSTANCE.u(), pVar3, (i31 & 112) | (i31 & 14));
                                    pVar3.T(-1323940314);
                                    s1.e eVar = (s1.e) pVar3.K(CompositionLocalsKt.i());
                                    LayoutDirection layoutDirection = (LayoutDirection) pVar3.K(CompositionLocalsKt.p());
                                    androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar3.K(CompositionLocalsKt.u());
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    yh.a<ComposeUiNode> aVarA = companion2.a();
                                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(companion);
                                    int i32 = ((((i30 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                                    if (!(pVar3.G() instanceof androidx.compose.runtime.e)) {
                                        ComposablesKt.n();
                                    }
                                    pVar3.h();
                                    if (pVar3.D()) {
                                        pVar3.L(aVarA);
                                    } else {
                                        pVar3.d();
                                    }
                                    pVar3.Y();
                                    androidx.compose.runtime.p pVarB = Updater.b(pVar3);
                                    Updater.j(pVarB, i0VarB, companion2.d());
                                    Updater.j(pVarB, eVar, companion2.b());
                                    Updater.j(pVarB, layoutDirection, companion2.c());
                                    Updater.j(pVarB, d2Var, companion2.f());
                                    pVar3.x();
                                    qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar3)), pVar3, Integer.valueOf((i32 >> 3) & 112));
                                    pVar3.T(2058660585);
                                    pVar3.T(-1163856341);
                                    if (((i32 >> 9) & 14 & 11) == 2 && pVar3.b()) {
                                        pVar3.l();
                                    } else {
                                        qVar.invoke(ColumnScopeInstance.f5971a, pVar3, Integer.valueOf(((i30 >> 6) & 112) | 6));
                                    }
                                    pVar3.c0();
                                    pVar3.c0();
                                    pVar3.f();
                                    pVar3.c0();
                                    pVar3.c0();
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                                    a(pVar3, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                            int i29 = i20;
                            int i30 = (i29 & 14) | (i29 & 112) | (i29 & bb.c.b.f30796me) | (i29 & bb.c.g.f32954lc);
                            int i31 = i29 << 6;
                            androidx.compose.foundation.interaction.g gVar9 = gVar4;
                            CardElevation cardElevation5 = cardElevation3;
                            pVar2 = pVarF;
                            SurfaceKt.d(onClick, nVar3, z14, g2Var3, jM, jM2, fW, fW2, borderStroke4, gVar9, aVarB, pVar2, i30 | (i31 & 234881024) | (i31 & 1879048192), 6, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            nVar4 = nVar3;
                            g2Var4 = g2Var3;
                            borderStroke5 = borderStroke4;
                            gVar6 = gVar8;
                            z13 = z14;
                            gVar7 = gVar9;
                            cardElevation4 = cardElevation5;
                        } else {
                            pVarF.l();
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
                            borderStroke4 = borderStroke;
                            gVar4 = gVar2;
                            g2Var3 = g2Var2;
                            gVar5 = gVar3;
                            cardElevation3 = cardElevation2;
                        }
                        i20 = i12;
                        z12 = z11;
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-2024281376, i20, -1, "androidx.compose.material3.Card (Card.kt:131)");
                        }
                        int i210 = (i20 >> 6) & 14;
                        int i211 = i20 >> 9;
                        int i212 = i210 | (i211 & 112);
                        long jM3 = gVar5.a(z12, pVarF, i212).getValue().M();
                        long jM4 = gVar5.b(z12, pVarF, i212).getValue().M();
                        int i213 = i210 | ((i20 >> 18) & 112) | (i211 & bb.c.b.f30796me);
                        float fW3 = cardElevation3.h(z12, gVar4, pVarF, i213).getValue().w();
                        g gVar10 = gVar5;
                        float fW4 = cardElevation3.g(z12, gVar4, pVarF, i213).getValue().w();
                        boolean z15 = z12;
                        androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVarF, 776921067, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$Card$4
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
                                    ComposerKt.w0(776921067, i214, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:153)");
                                }
                                yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                int i32 = (i20 >> 15) & bb.c.g.f32954lc;
                                pVar3.T(-483455358);
                                androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                                int i33 = i32 >> 3;
                                androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(Arrangement.f5896a.r(), androidx.compose.ui.c.INSTANCE.u(), pVar3, (i33 & 112) | (i33 & 14));
                                pVar3.T(-1323940314);
                                s1.e eVar = (s1.e) pVar3.K(CompositionLocalsKt.i());
                                LayoutDirection layoutDirection = (LayoutDirection) pVar3.K(CompositionLocalsKt.p());
                                androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar3.K(CompositionLocalsKt.u());
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                yh.a<ComposeUiNode> aVarA = companion2.a();
                                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(companion);
                                int i34 = ((((i32 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                                if (!(pVar3.G() instanceof androidx.compose.runtime.e)) {
                                    ComposablesKt.n();
                                }
                                pVar3.h();
                                if (pVar3.D()) {
                                    pVar3.L(aVarA);
                                } else {
                                    pVar3.d();
                                }
                                pVar3.Y();
                                androidx.compose.runtime.p pVarB = Updater.b(pVar3);
                                Updater.j(pVarB, i0VarB, companion2.d());
                                Updater.j(pVarB, eVar, companion2.b());
                                Updater.j(pVarB, layoutDirection, companion2.c());
                                Updater.j(pVarB, d2Var, companion2.f());
                                pVar3.x();
                                qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar3)), pVar3, Integer.valueOf((i34 >> 3) & 112));
                                pVar3.T(2058660585);
                                pVar3.T(-1163856341);
                                if (((i34 >> 9) & 14 & 11) == 2 && pVar3.b()) {
                                    pVar3.l();
                                } else {
                                    qVar.invoke(ColumnScopeInstance.f5971a, pVar3, Integer.valueOf(((i32 >> 6) & 112) | 6));
                                }
                                pVar3.c0();
                                pVar3.c0();
                                pVar3.f();
                                pVar3.c0();
                                pVar3.c0();
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                                a(pVar3, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        int i214 = i20;
                        int i32 = (i214 & 14) | (i214 & 112) | (i214 & bb.c.b.f30796me) | (i214 & bb.c.g.f32954lc);
                        int i33 = i214 << 6;
                        androidx.compose.foundation.interaction.g gVar11 = gVar4;
                        CardElevation cardElevation6 = cardElevation3;
                        pVar2 = pVarF;
                        SurfaceKt.d(onClick, nVar3, z15, g2Var3, jM3, jM4, fW3, fW4, borderStroke4, gVar11, aVarB2, pVar2, i32 | (i33 & 234881024) | (i33 & 1879048192), 6, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        g2Var4 = g2Var3;
                        borderStroke5 = borderStroke4;
                        gVar6 = gVar10;
                        z13 = z15;
                        gVar7 = gVar11;
                        cardElevation4 = cardElevation6;
                    } else {
                        pVarF.l();
                        pVar2 = pVarF;
                        z13 = z11;
                        g2Var4 = g2Var2;
                        gVar6 = gVar3;
                        cardElevation4 = cardElevation2;
                        borderStroke5 = borderStroke2;
                        nVar4 = nVar;
                        gVar7 = gVar2;
                    }
                    u1VarH = pVar2.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$Card$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar3, int i34) {
                            CardKt.b(onClick, nVar4, z13, g2Var4, gVar6, cardElevation4, borderStroke5, gVar7, content, pVar3, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                            a(pVar3, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i19 = 100663296;
                i12 |= i19;
                if ((191739611 & i12) == 38347922) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c10 = 6;
                            g2VarG = h.f11894a.g(pVarF, 6);
                            i12 &= -7169;
                        } else {
                            c10 = 6;
                            g2VarG = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            gVarA = h.f11894a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                            i12 &= -57345;
                        } else {
                            gVarA = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationB = h.f11894a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                            i12 &= -458753;
                        } else {
                            cardElevationB = cardElevation2;
                        }
                        if (i15 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i17 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            nVar3 = nVar2;
                            g2Var3 = g2VarG;
                            borderStroke4 = borderStroke3;
                            gVar5 = gVarA;
                            cardElevation3 = cardElevationB;
                            gVar4 = (androidx.compose.foundation.interaction.g) objU;
                            i20 = i12;
                            z12 = z11;
                        } else {
                            gVar4 = gVar2;
                            nVar3 = nVar2;
                            i20 = i12;
                            g2Var3 = g2VarG;
                            borderStroke4 = borderStroke3;
                            gVar5 = gVarA;
                            z12 = z11;
                            cardElevation3 = cardElevationB;
                        }
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c10 = 6;
                            g2VarG = h.f11894a.g(pVarF, 6);
                            i12 &= -7169;
                        } else {
                            c10 = 6;
                            g2VarG = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            gVarA = h.f11894a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                            i12 &= -57345;
                        } else {
                            gVarA = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationB = h.f11894a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                            i12 &= -458753;
                        } else {
                            cardElevationB = cardElevation2;
                        }
                        if (i15 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i17 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            nVar3 = nVar2;
                            g2Var3 = g2VarG;
                            borderStroke4 = borderStroke3;
                            gVar5 = gVarA;
                            cardElevation3 = cardElevationB;
                            gVar4 = (androidx.compose.foundation.interaction.g) objU;
                            i20 = i12;
                            z12 = z11;
                        } else {
                            gVar4 = gVar2;
                            nVar3 = nVar2;
                            i20 = i12;
                            g2Var3 = g2VarG;
                            borderStroke4 = borderStroke3;
                            gVar5 = gVarA;
                            z12 = z11;
                            cardElevation3 = cardElevationB;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-2024281376, i20, -1, "androidx.compose.material3.Card (Card.kt:131)");
                    }
                    int i215 = (i20 >> 6) & 14;
                    int i216 = i20 >> 9;
                    int i217 = i215 | (i216 & 112);
                    long jM5 = gVar5.a(z12, pVarF, i217).getValue().M();
                    long jM6 = gVar5.b(z12, pVarF, i217).getValue().M();
                    int i218 = i215 | ((i20 >> 18) & 112) | (i216 & bb.c.b.f30796me);
                    float fW5 = cardElevation3.h(z12, gVar4, pVarF, i218).getValue().w();
                    g gVar12 = gVar5;
                    float fW6 = cardElevation3.g(z12, gVar4, pVarF, i218).getValue().w();
                    boolean z16 = z12;
                    androidx.compose.runtime.internal.a aVarB3 = androidx.compose.runtime.internal.b.b(pVarF, 776921067, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$Card$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar3, int i219) {
                            if ((i219 & 11) == 2 && pVar3.b()) {
                                pVar3.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(776921067, i219, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:153)");
                            }
                            yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            int i34 = (i20 >> 15) & bb.c.g.f32954lc;
                            pVar3.T(-483455358);
                            androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                            int i35 = i34 >> 3;
                            androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(Arrangement.f5896a.r(), androidx.compose.ui.c.INSTANCE.u(), pVar3, (i35 & 112) | (i35 & 14));
                            pVar3.T(-1323940314);
                            s1.e eVar = (s1.e) pVar3.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection = (LayoutDirection) pVar3.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar3.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA = companion2.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(companion);
                            int i36 = ((((i34 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                            if (!(pVar3.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVar3.h();
                            if (pVar3.D()) {
                                pVar3.L(aVarA);
                            } else {
                                pVar3.d();
                            }
                            pVar3.Y();
                            androidx.compose.runtime.p pVarB = Updater.b(pVar3);
                            Updater.j(pVarB, i0VarB, companion2.d());
                            Updater.j(pVarB, eVar, companion2.b());
                            Updater.j(pVarB, layoutDirection, companion2.c());
                            Updater.j(pVarB, d2Var, companion2.f());
                            pVar3.x();
                            qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar3)), pVar3, Integer.valueOf((i36 >> 3) & 112));
                            pVar3.T(2058660585);
                            pVar3.T(-1163856341);
                            if (((i36 >> 9) & 14 & 11) == 2 && pVar3.b()) {
                                pVar3.l();
                            } else {
                                qVar.invoke(ColumnScopeInstance.f5971a, pVar3, Integer.valueOf(((i34 >> 6) & 112) | 6));
                            }
                            pVar3.c0();
                            pVar3.c0();
                            pVar3.f();
                            pVar3.c0();
                            pVar3.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                            a(pVar3, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    int i219 = i20;
                    int i34 = (i219 & 14) | (i219 & 112) | (i219 & bb.c.b.f30796me) | (i219 & bb.c.g.f32954lc);
                    int i35 = i219 << 6;
                    androidx.compose.foundation.interaction.g gVar13 = gVar4;
                    CardElevation cardElevation7 = cardElevation3;
                    pVar2 = pVarF;
                    SurfaceKt.d(onClick, nVar3, z16, g2Var3, jM5, jM6, fW5, fW6, borderStroke4, gVar13, aVarB3, pVar2, i34 | (i35 & 234881024) | (i35 & 1879048192), 6, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    g2Var4 = g2Var3;
                    borderStroke5 = borderStroke4;
                    gVar6 = gVar12;
                    z13 = z16;
                    gVar7 = gVar13;
                    cardElevation4 = cardElevation7;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c10 = 6;
                            g2VarG = h.f11894a.g(pVarF, 6);
                            i12 &= -7169;
                        } else {
                            c10 = 6;
                            g2VarG = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            gVarA = h.f11894a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                            i12 &= -57345;
                        } else {
                            gVarA = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationB = h.f11894a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                            i12 &= -458753;
                        } else {
                            cardElevationB = cardElevation2;
                        }
                        if (i15 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i17 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            nVar3 = nVar2;
                            g2Var3 = g2VarG;
                            borderStroke4 = borderStroke3;
                            gVar5 = gVarA;
                            cardElevation3 = cardElevationB;
                            gVar4 = (androidx.compose.foundation.interaction.g) objU;
                            i20 = i12;
                            z12 = z11;
                        } else {
                            gVar4 = gVar2;
                            nVar3 = nVar2;
                            i20 = i12;
                            g2Var3 = g2VarG;
                            borderStroke4 = borderStroke3;
                            gVar5 = gVarA;
                            z12 = z11;
                            cardElevation3 = cardElevationB;
                        }
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c10 = 6;
                            g2VarG = h.f11894a.g(pVarF, 6);
                            i12 &= -7169;
                        } else {
                            c10 = 6;
                            g2VarG = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            gVarA = h.f11894a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                            i12 &= -57345;
                        } else {
                            gVarA = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationB = h.f11894a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                            i12 &= -458753;
                        } else {
                            cardElevationB = cardElevation2;
                        }
                        if (i15 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i17 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            nVar3 = nVar2;
                            g2Var3 = g2VarG;
                            borderStroke4 = borderStroke3;
                            gVar5 = gVarA;
                            cardElevation3 = cardElevationB;
                            gVar4 = (androidx.compose.foundation.interaction.g) objU;
                            i20 = i12;
                            z12 = z11;
                        } else {
                            gVar4 = gVar2;
                            nVar3 = nVar2;
                            i20 = i12;
                            g2Var3 = g2VarG;
                            borderStroke4 = borderStroke3;
                            gVar5 = gVarA;
                            z12 = z11;
                            cardElevation3 = cardElevationB;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-2024281376, i20, -1, "androidx.compose.material3.Card (Card.kt:131)");
                    }
                    int i2110 = (i20 >> 6) & 14;
                    int i2111 = i20 >> 9;
                    int i2112 = i2110 | (i2111 & 112);
                    long jM7 = gVar5.a(z12, pVarF, i2112).getValue().M();
                    long jM8 = gVar5.b(z12, pVarF, i2112).getValue().M();
                    int i2113 = i2110 | ((i20 >> 18) & 112) | (i2111 & bb.c.b.f30796me);
                    float fW7 = cardElevation3.h(z12, gVar4, pVarF, i2113).getValue().w();
                    g gVar14 = gVar5;
                    float fW8 = cardElevation3.g(z12, gVar4, pVarF, i2113).getValue().w();
                    boolean z17 = z12;
                    androidx.compose.runtime.internal.a aVarB4 = androidx.compose.runtime.internal.b.b(pVarF, 776921067, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$Card$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar3, int i2114) {
                            if ((i2114 & 11) == 2 && pVar3.b()) {
                                pVar3.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(776921067, i2114, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:153)");
                            }
                            yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            int i36 = (i20 >> 15) & bb.c.g.f32954lc;
                            pVar3.T(-483455358);
                            androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                            int i37 = i36 >> 3;
                            androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(Arrangement.f5896a.r(), androidx.compose.ui.c.INSTANCE.u(), pVar3, (i37 & 112) | (i37 & 14));
                            pVar3.T(-1323940314);
                            s1.e eVar = (s1.e) pVar3.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection = (LayoutDirection) pVar3.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar3.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA = companion2.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(companion);
                            int i38 = ((((i36 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                            if (!(pVar3.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVar3.h();
                            if (pVar3.D()) {
                                pVar3.L(aVarA);
                            } else {
                                pVar3.d();
                            }
                            pVar3.Y();
                            androidx.compose.runtime.p pVarB = Updater.b(pVar3);
                            Updater.j(pVarB, i0VarB, companion2.d());
                            Updater.j(pVarB, eVar, companion2.b());
                            Updater.j(pVarB, layoutDirection, companion2.c());
                            Updater.j(pVarB, d2Var, companion2.f());
                            pVar3.x();
                            qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar3)), pVar3, Integer.valueOf((i38 >> 3) & 112));
                            pVar3.T(2058660585);
                            pVar3.T(-1163856341);
                            if (((i38 >> 9) & 14 & 11) == 2 && pVar3.b()) {
                                pVar3.l();
                            } else {
                                qVar.invoke(ColumnScopeInstance.f5971a, pVar3, Integer.valueOf(((i36 >> 6) & 112) | 6));
                            }
                            pVar3.c0();
                            pVar3.c0();
                            pVar3.f();
                            pVar3.c0();
                            pVar3.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                            a(pVar3, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    int i2114 = i20;
                    int i36 = (i2114 & 14) | (i2114 & 112) | (i2114 & bb.c.b.f30796me) | (i2114 & bb.c.g.f32954lc);
                    int i37 = i2114 << 6;
                    androidx.compose.foundation.interaction.g gVar15 = gVar4;
                    CardElevation cardElevation8 = cardElevation3;
                    pVar2 = pVarF;
                    SurfaceKt.d(onClick, nVar3, z17, g2Var3, jM7, jM8, fW7, fW8, borderStroke4, gVar15, aVarB4, pVar2, i36 | (i37 & 234881024) | (i37 & 1879048192), 6, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    g2Var4 = g2Var3;
                    borderStroke5 = borderStroke4;
                    gVar6 = gVar14;
                    z13 = z17;
                    gVar7 = gVar15;
                    cardElevation4 = cardElevation8;
                }
                u1VarH = pVar2.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$Card$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar3, int i38) {
                        CardKt.b(onClick, nVar4, z13, g2Var4, gVar6, cardElevation4, borderStroke5, gVar7, content, pVar3, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                        a(pVar3, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.b.f30966u4;
            z11 = z10;
            if ((i10 & bb.c.g.f32954lc) == 0) {
                if ((i11 & 8) == 0) {
                    g2Var2 = g2Var;
                    if (pVarF.s(g2Var2)) {
                    }
                    i12 |= i22;
                } else {
                    g2Var2 = g2Var;
                }
                i12 |= i22;
            } else {
                g2Var2 = g2Var;
            }
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    gVar3 = gVar;
                    if (pVarF.s(gVar3)) {
                    }
                    i12 |= i23;
                } else {
                    gVar3 = gVar;
                }
                i12 |= i23;
            } else {
                gVar3 = gVar;
            }
            if ((458752 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    cardElevation2 = cardElevation;
                    if (pVarF.s(cardElevation2)) {
                    }
                    i12 |= i24;
                } else {
                    cardElevation2 = cardElevation;
                }
                i12 |= i24;
            } else {
                cardElevation2 = cardElevation;
            }
            i15 = i11 & 64;
            if (i15 != 0) {
                i12 |= 1572864;
                borderStroke2 = borderStroke;
            } else {
                borderStroke2 = borderStroke;
                if ((3670016 & i10) == 0) {
                    if (pVarF.s(borderStroke2)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
            }
            i17 = i11 & 128;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (pVarF.s(gVar2)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 234881024) == 0) {
                    if (pVarF.s(content)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                }
                if ((191739611 & i12) == 38347922) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c10 = 6;
                            g2VarG = h.f11894a.g(pVarF, 6);
                            i12 &= -7169;
                        } else {
                            c10 = 6;
                            g2VarG = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            gVarA = h.f11894a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                            i12 &= -57345;
                        } else {
                            gVarA = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationB = h.f11894a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                            i12 &= -458753;
                        } else {
                            cardElevationB = cardElevation2;
                        }
                        if (i15 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i17 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            nVar3 = nVar2;
                            g2Var3 = g2VarG;
                            borderStroke4 = borderStroke3;
                            gVar5 = gVarA;
                            cardElevation3 = cardElevationB;
                            gVar4 = (androidx.compose.foundation.interaction.g) objU;
                            i20 = i12;
                            z12 = z11;
                        } else {
                            gVar4 = gVar2;
                            nVar3 = nVar2;
                            i20 = i12;
                            g2Var3 = g2VarG;
                            borderStroke4 = borderStroke3;
                            gVar5 = gVarA;
                            z12 = z11;
                            cardElevation3 = cardElevationB;
                        }
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c10 = 6;
                            g2VarG = h.f11894a.g(pVarF, 6);
                            i12 &= -7169;
                        } else {
                            c10 = 6;
                            g2VarG = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            gVarA = h.f11894a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                            i12 &= -57345;
                        } else {
                            gVarA = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationB = h.f11894a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                            i12 &= -458753;
                        } else {
                            cardElevationB = cardElevation2;
                        }
                        if (i15 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i17 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            nVar3 = nVar2;
                            g2Var3 = g2VarG;
                            borderStroke4 = borderStroke3;
                            gVar5 = gVarA;
                            cardElevation3 = cardElevationB;
                            gVar4 = (androidx.compose.foundation.interaction.g) objU;
                            i20 = i12;
                            z12 = z11;
                        } else {
                            gVar4 = gVar2;
                            nVar3 = nVar2;
                            i20 = i12;
                            g2Var3 = g2VarG;
                            borderStroke4 = borderStroke3;
                            gVar5 = gVarA;
                            z12 = z11;
                            cardElevation3 = cardElevationB;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-2024281376, i20, -1, "androidx.compose.material3.Card (Card.kt:131)");
                    }
                    int i2115 = (i20 >> 6) & 14;
                    int i2116 = i20 >> 9;
                    int i2117 = i2115 | (i2116 & 112);
                    long jM9 = gVar5.a(z12, pVarF, i2117).getValue().M();
                    long jM10 = gVar5.b(z12, pVarF, i2117).getValue().M();
                    int i2118 = i2115 | ((i20 >> 18) & 112) | (i2116 & bb.c.b.f30796me);
                    float fW9 = cardElevation3.h(z12, gVar4, pVarF, i2118).getValue().w();
                    g gVar16 = gVar5;
                    float fW10 = cardElevation3.g(z12, gVar4, pVarF, i2118).getValue().w();
                    boolean z18 = z12;
                    androidx.compose.runtime.internal.a aVarB5 = androidx.compose.runtime.internal.b.b(pVarF, 776921067, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$Card$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar3, int i2119) {
                            if ((i2119 & 11) == 2 && pVar3.b()) {
                                pVar3.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(776921067, i2119, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:153)");
                            }
                            yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            int i38 = (i20 >> 15) & bb.c.g.f32954lc;
                            pVar3.T(-483455358);
                            androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                            int i39 = i38 >> 3;
                            androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(Arrangement.f5896a.r(), androidx.compose.ui.c.INSTANCE.u(), pVar3, (i39 & 112) | (i39 & 14));
                            pVar3.T(-1323940314);
                            s1.e eVar = (s1.e) pVar3.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection = (LayoutDirection) pVar3.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar3.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA = companion2.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(companion);
                            int i310 = ((((i38 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                            if (!(pVar3.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVar3.h();
                            if (pVar3.D()) {
                                pVar3.L(aVarA);
                            } else {
                                pVar3.d();
                            }
                            pVar3.Y();
                            androidx.compose.runtime.p pVarB = Updater.b(pVar3);
                            Updater.j(pVarB, i0VarB, companion2.d());
                            Updater.j(pVarB, eVar, companion2.b());
                            Updater.j(pVarB, layoutDirection, companion2.c());
                            Updater.j(pVarB, d2Var, companion2.f());
                            pVar3.x();
                            qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar3)), pVar3, Integer.valueOf((i310 >> 3) & 112));
                            pVar3.T(2058660585);
                            pVar3.T(-1163856341);
                            if (((i310 >> 9) & 14 & 11) == 2 && pVar3.b()) {
                                pVar3.l();
                            } else {
                                qVar.invoke(ColumnScopeInstance.f5971a, pVar3, Integer.valueOf(((i38 >> 6) & 112) | 6));
                            }
                            pVar3.c0();
                            pVar3.c0();
                            pVar3.f();
                            pVar3.c0();
                            pVar3.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                            a(pVar3, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    int i2119 = i20;
                    int i38 = (i2119 & 14) | (i2119 & 112) | (i2119 & bb.c.b.f30796me) | (i2119 & bb.c.g.f32954lc);
                    int i39 = i2119 << 6;
                    androidx.compose.foundation.interaction.g gVar17 = gVar4;
                    CardElevation cardElevation9 = cardElevation3;
                    pVar2 = pVarF;
                    SurfaceKt.d(onClick, nVar3, z18, g2Var3, jM9, jM10, fW9, fW10, borderStroke4, gVar17, aVarB5, pVar2, i38 | (i39 & 234881024) | (i39 & 1879048192), 6, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    g2Var4 = g2Var3;
                    borderStroke5 = borderStroke4;
                    gVar6 = gVar16;
                    z13 = z18;
                    gVar7 = gVar17;
                    cardElevation4 = cardElevation9;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c10 = 6;
                            g2VarG = h.f11894a.g(pVarF, 6);
                            i12 &= -7169;
                        } else {
                            c10 = 6;
                            g2VarG = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            gVarA = h.f11894a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                            i12 &= -57345;
                        } else {
                            gVarA = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationB = h.f11894a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                            i12 &= -458753;
                        } else {
                            cardElevationB = cardElevation2;
                        }
                        if (i15 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i17 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            nVar3 = nVar2;
                            g2Var3 = g2VarG;
                            borderStroke4 = borderStroke3;
                            gVar5 = gVarA;
                            cardElevation3 = cardElevationB;
                            gVar4 = (androidx.compose.foundation.interaction.g) objU;
                            i20 = i12;
                            z12 = z11;
                        } else {
                            gVar4 = gVar2;
                            nVar3 = nVar2;
                            i20 = i12;
                            g2Var3 = g2VarG;
                            borderStroke4 = borderStroke3;
                            gVar5 = gVarA;
                            z12 = z11;
                            cardElevation3 = cardElevationB;
                        }
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c10 = 6;
                            g2VarG = h.f11894a.g(pVarF, 6);
                            i12 &= -7169;
                        } else {
                            c10 = 6;
                            g2VarG = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            gVarA = h.f11894a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                            i12 &= -57345;
                        } else {
                            gVarA = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationB = h.f11894a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                            i12 &= -458753;
                        } else {
                            cardElevationB = cardElevation2;
                        }
                        if (i15 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i17 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            nVar3 = nVar2;
                            g2Var3 = g2VarG;
                            borderStroke4 = borderStroke3;
                            gVar5 = gVarA;
                            cardElevation3 = cardElevationB;
                            gVar4 = (androidx.compose.foundation.interaction.g) objU;
                            i20 = i12;
                            z12 = z11;
                        } else {
                            gVar4 = gVar2;
                            nVar3 = nVar2;
                            i20 = i12;
                            g2Var3 = g2VarG;
                            borderStroke4 = borderStroke3;
                            gVar5 = gVarA;
                            z12 = z11;
                            cardElevation3 = cardElevationB;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-2024281376, i20, -1, "androidx.compose.material3.Card (Card.kt:131)");
                    }
                    int i21110 = (i20 >> 6) & 14;
                    int i21111 = i20 >> 9;
                    int i21112 = i21110 | (i21111 & 112);
                    long jM11 = gVar5.a(z12, pVarF, i21112).getValue().M();
                    long jM12 = gVar5.b(z12, pVarF, i21112).getValue().M();
                    int i21113 = i21110 | ((i20 >> 18) & 112) | (i21111 & bb.c.b.f30796me);
                    float fW11 = cardElevation3.h(z12, gVar4, pVarF, i21113).getValue().w();
                    g gVar18 = gVar5;
                    float fW12 = cardElevation3.g(z12, gVar4, pVarF, i21113).getValue().w();
                    boolean z19 = z12;
                    androidx.compose.runtime.internal.a aVarB6 = androidx.compose.runtime.internal.b.b(pVarF, 776921067, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$Card$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar3, int i21114) {
                            if ((i21114 & 11) == 2 && pVar3.b()) {
                                pVar3.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(776921067, i21114, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:153)");
                            }
                            yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            int i310 = (i20 >> 15) & bb.c.g.f32954lc;
                            pVar3.T(-483455358);
                            androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                            int i311 = i310 >> 3;
                            androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(Arrangement.f5896a.r(), androidx.compose.ui.c.INSTANCE.u(), pVar3, (i311 & 112) | (i311 & 14));
                            pVar3.T(-1323940314);
                            s1.e eVar = (s1.e) pVar3.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection = (LayoutDirection) pVar3.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar3.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA = companion2.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(companion);
                            int i312 = ((((i310 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                            if (!(pVar3.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVar3.h();
                            if (pVar3.D()) {
                                pVar3.L(aVarA);
                            } else {
                                pVar3.d();
                            }
                            pVar3.Y();
                            androidx.compose.runtime.p pVarB = Updater.b(pVar3);
                            Updater.j(pVarB, i0VarB, companion2.d());
                            Updater.j(pVarB, eVar, companion2.b());
                            Updater.j(pVarB, layoutDirection, companion2.c());
                            Updater.j(pVarB, d2Var, companion2.f());
                            pVar3.x();
                            qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar3)), pVar3, Integer.valueOf((i312 >> 3) & 112));
                            pVar3.T(2058660585);
                            pVar3.T(-1163856341);
                            if (((i312 >> 9) & 14 & 11) == 2 && pVar3.b()) {
                                pVar3.l();
                            } else {
                                qVar.invoke(ColumnScopeInstance.f5971a, pVar3, Integer.valueOf(((i310 >> 6) & 112) | 6));
                            }
                            pVar3.c0();
                            pVar3.c0();
                            pVar3.f();
                            pVar3.c0();
                            pVar3.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                            a(pVar3, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    int i21114 = i20;
                    int i310 = (i21114 & 14) | (i21114 & 112) | (i21114 & bb.c.b.f30796me) | (i21114 & bb.c.g.f32954lc);
                    int i311 = i21114 << 6;
                    androidx.compose.foundation.interaction.g gVar19 = gVar4;
                    CardElevation cardElevation10 = cardElevation3;
                    pVar2 = pVarF;
                    SurfaceKt.d(onClick, nVar3, z19, g2Var3, jM11, jM12, fW11, fW12, borderStroke4, gVar19, aVarB6, pVar2, i310 | (i311 & 234881024) | (i311 & 1879048192), 6, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    g2Var4 = g2Var3;
                    borderStroke5 = borderStroke4;
                    gVar6 = gVar18;
                    z13 = z19;
                    gVar7 = gVar19;
                    cardElevation4 = cardElevation10;
                }
                u1VarH = pVar2.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$Card$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar3, int i312) {
                        CardKt.b(onClick, nVar4, z13, g2Var4, gVar6, cardElevation4, borderStroke5, gVar7, content, pVar3, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                        a(pVar3, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i19 = 100663296;
            i12 |= i19;
            if ((191739611 & i12) == 38347922) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c10 = 6;
                        g2VarG = h.f11894a.g(pVarF, 6);
                        i12 &= -7169;
                    } else {
                        c10 = 6;
                        g2VarG = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        gVarA = h.f11894a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        i12 &= -57345;
                    } else {
                        gVarA = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationB = h.f11894a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        i12 &= -458753;
                    } else {
                        cardElevationB = cardElevation2;
                    }
                    if (i15 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if (i17 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        g2Var3 = g2VarG;
                        borderStroke4 = borderStroke3;
                        gVar5 = gVarA;
                        cardElevation3 = cardElevationB;
                        gVar4 = (androidx.compose.foundation.interaction.g) objU;
                        i20 = i12;
                        z12 = z11;
                    } else {
                        gVar4 = gVar2;
                        nVar3 = nVar2;
                        i20 = i12;
                        g2Var3 = g2VarG;
                        borderStroke4 = borderStroke3;
                        gVar5 = gVarA;
                        z12 = z11;
                        cardElevation3 = cardElevationB;
                    }
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c10 = 6;
                        g2VarG = h.f11894a.g(pVarF, 6);
                        i12 &= -7169;
                    } else {
                        c10 = 6;
                        g2VarG = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        gVarA = h.f11894a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        i12 &= -57345;
                    } else {
                        gVarA = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationB = h.f11894a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        i12 &= -458753;
                    } else {
                        cardElevationB = cardElevation2;
                    }
                    if (i15 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if (i17 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        g2Var3 = g2VarG;
                        borderStroke4 = borderStroke3;
                        gVar5 = gVarA;
                        cardElevation3 = cardElevationB;
                        gVar4 = (androidx.compose.foundation.interaction.g) objU;
                        i20 = i12;
                        z12 = z11;
                    } else {
                        gVar4 = gVar2;
                        nVar3 = nVar2;
                        i20 = i12;
                        g2Var3 = g2VarG;
                        borderStroke4 = borderStroke3;
                        gVar5 = gVarA;
                        z12 = z11;
                        cardElevation3 = cardElevationB;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-2024281376, i20, -1, "androidx.compose.material3.Card (Card.kt:131)");
                }
                int i21115 = (i20 >> 6) & 14;
                int i21116 = i20 >> 9;
                int i21117 = i21115 | (i21116 & 112);
                long jM13 = gVar5.a(z12, pVarF, i21117).getValue().M();
                long jM14 = gVar5.b(z12, pVarF, i21117).getValue().M();
                int i21118 = i21115 | ((i20 >> 18) & 112) | (i21116 & bb.c.b.f30796me);
                float fW13 = cardElevation3.h(z12, gVar4, pVarF, i21118).getValue().w();
                g gVar110 = gVar5;
                float fW14 = cardElevation3.g(z12, gVar4, pVarF, i21118).getValue().w();
                boolean z110 = z12;
                androidx.compose.runtime.internal.a aVarB7 = androidx.compose.runtime.internal.b.b(pVarF, 776921067, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$Card$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar3, int i21119) {
                        if ((i21119 & 11) == 2 && pVar3.b()) {
                            pVar3.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(776921067, i21119, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:153)");
                        }
                        yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                        int i312 = (i20 >> 15) & bb.c.g.f32954lc;
                        pVar3.T(-483455358);
                        androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                        int i313 = i312 >> 3;
                        androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(Arrangement.f5896a.r(), androidx.compose.ui.c.INSTANCE.u(), pVar3, (i313 & 112) | (i313 & 14));
                        pVar3.T(-1323940314);
                        s1.e eVar = (s1.e) pVar3.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection = (LayoutDirection) pVar3.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar3.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA = companion2.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(companion);
                        int i314 = ((((i312 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                        if (!(pVar3.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar3.h();
                        if (pVar3.D()) {
                            pVar3.L(aVarA);
                        } else {
                            pVar3.d();
                        }
                        pVar3.Y();
                        androidx.compose.runtime.p pVarB = Updater.b(pVar3);
                        Updater.j(pVarB, i0VarB, companion2.d());
                        Updater.j(pVarB, eVar, companion2.b());
                        Updater.j(pVarB, layoutDirection, companion2.c());
                        Updater.j(pVarB, d2Var, companion2.f());
                        pVar3.x();
                        qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar3)), pVar3, Integer.valueOf((i314 >> 3) & 112));
                        pVar3.T(2058660585);
                        pVar3.T(-1163856341);
                        if (((i314 >> 9) & 14 & 11) == 2 && pVar3.b()) {
                            pVar3.l();
                        } else {
                            qVar.invoke(ColumnScopeInstance.f5971a, pVar3, Integer.valueOf(((i312 >> 6) & 112) | 6));
                        }
                        pVar3.c0();
                        pVar3.c0();
                        pVar3.f();
                        pVar3.c0();
                        pVar3.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                        a(pVar3, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                int i21119 = i20;
                int i312 = (i21119 & 14) | (i21119 & 112) | (i21119 & bb.c.b.f30796me) | (i21119 & bb.c.g.f32954lc);
                int i313 = i21119 << 6;
                androidx.compose.foundation.interaction.g gVar111 = gVar4;
                CardElevation cardElevation11 = cardElevation3;
                pVar2 = pVarF;
                SurfaceKt.d(onClick, nVar3, z110, g2Var3, jM13, jM14, fW13, fW14, borderStroke4, gVar111, aVarB7, pVar2, i312 | (i313 & 234881024) | (i313 & 1879048192), 6, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                g2Var4 = g2Var3;
                borderStroke5 = borderStroke4;
                gVar6 = gVar110;
                z13 = z110;
                gVar7 = gVar111;
                cardElevation4 = cardElevation11;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c10 = 6;
                        g2VarG = h.f11894a.g(pVarF, 6);
                        i12 &= -7169;
                    } else {
                        c10 = 6;
                        g2VarG = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        gVarA = h.f11894a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        i12 &= -57345;
                    } else {
                        gVarA = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationB = h.f11894a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        i12 &= -458753;
                    } else {
                        cardElevationB = cardElevation2;
                    }
                    if (i15 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if (i17 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        g2Var3 = g2VarG;
                        borderStroke4 = borderStroke3;
                        gVar5 = gVarA;
                        cardElevation3 = cardElevationB;
                        gVar4 = (androidx.compose.foundation.interaction.g) objU;
                        i20 = i12;
                        z12 = z11;
                    } else {
                        gVar4 = gVar2;
                        nVar3 = nVar2;
                        i20 = i12;
                        g2Var3 = g2VarG;
                        borderStroke4 = borderStroke3;
                        gVar5 = gVarA;
                        z12 = z11;
                        cardElevation3 = cardElevationB;
                    }
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c10 = 6;
                        g2VarG = h.f11894a.g(pVarF, 6);
                        i12 &= -7169;
                    } else {
                        c10 = 6;
                        g2VarG = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        gVarA = h.f11894a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        i12 &= -57345;
                    } else {
                        gVarA = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationB = h.f11894a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        i12 &= -458753;
                    } else {
                        cardElevationB = cardElevation2;
                    }
                    if (i15 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if (i17 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        g2Var3 = g2VarG;
                        borderStroke4 = borderStroke3;
                        gVar5 = gVarA;
                        cardElevation3 = cardElevationB;
                        gVar4 = (androidx.compose.foundation.interaction.g) objU;
                        i20 = i12;
                        z12 = z11;
                    } else {
                        gVar4 = gVar2;
                        nVar3 = nVar2;
                        i20 = i12;
                        g2Var3 = g2VarG;
                        borderStroke4 = borderStroke3;
                        gVar5 = gVarA;
                        z12 = z11;
                        cardElevation3 = cardElevationB;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-2024281376, i20, -1, "androidx.compose.material3.Card (Card.kt:131)");
                }
                int i211110 = (i20 >> 6) & 14;
                int i211111 = i20 >> 9;
                int i211112 = i211110 | (i211111 & 112);
                long jM15 = gVar5.a(z12, pVarF, i211112).getValue().M();
                long jM16 = gVar5.b(z12, pVarF, i211112).getValue().M();
                int i211113 = i211110 | ((i20 >> 18) & 112) | (i211111 & bb.c.b.f30796me);
                float fW15 = cardElevation3.h(z12, gVar4, pVarF, i211113).getValue().w();
                g gVar112 = gVar5;
                float fW16 = cardElevation3.g(z12, gVar4, pVarF, i211113).getValue().w();
                boolean z111 = z12;
                androidx.compose.runtime.internal.a aVarB8 = androidx.compose.runtime.internal.b.b(pVarF, 776921067, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$Card$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar3, int i211114) {
                        if ((i211114 & 11) == 2 && pVar3.b()) {
                            pVar3.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(776921067, i211114, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:153)");
                        }
                        yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                        int i314 = (i20 >> 15) & bb.c.g.f32954lc;
                        pVar3.T(-483455358);
                        androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                        int i315 = i314 >> 3;
                        androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(Arrangement.f5896a.r(), androidx.compose.ui.c.INSTANCE.u(), pVar3, (i315 & 112) | (i315 & 14));
                        pVar3.T(-1323940314);
                        s1.e eVar = (s1.e) pVar3.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection = (LayoutDirection) pVar3.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar3.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA = companion2.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(companion);
                        int i316 = ((((i314 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                        if (!(pVar3.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar3.h();
                        if (pVar3.D()) {
                            pVar3.L(aVarA);
                        } else {
                            pVar3.d();
                        }
                        pVar3.Y();
                        androidx.compose.runtime.p pVarB = Updater.b(pVar3);
                        Updater.j(pVarB, i0VarB, companion2.d());
                        Updater.j(pVarB, eVar, companion2.b());
                        Updater.j(pVarB, layoutDirection, companion2.c());
                        Updater.j(pVarB, d2Var, companion2.f());
                        pVar3.x();
                        qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar3)), pVar3, Integer.valueOf((i316 >> 3) & 112));
                        pVar3.T(2058660585);
                        pVar3.T(-1163856341);
                        if (((i316 >> 9) & 14 & 11) == 2 && pVar3.b()) {
                            pVar3.l();
                        } else {
                            qVar.invoke(ColumnScopeInstance.f5971a, pVar3, Integer.valueOf(((i314 >> 6) & 112) | 6));
                        }
                        pVar3.c0();
                        pVar3.c0();
                        pVar3.f();
                        pVar3.c0();
                        pVar3.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                        a(pVar3, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                int i211114 = i20;
                int i314 = (i211114 & 14) | (i211114 & 112) | (i211114 & bb.c.b.f30796me) | (i211114 & bb.c.g.f32954lc);
                int i315 = i211114 << 6;
                androidx.compose.foundation.interaction.g gVar113 = gVar4;
                CardElevation cardElevation12 = cardElevation3;
                pVar2 = pVarF;
                SurfaceKt.d(onClick, nVar3, z111, g2Var3, jM15, jM16, fW15, fW16, borderStroke4, gVar113, aVarB8, pVar2, i314 | (i315 & 234881024) | (i315 & 1879048192), 6, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                g2Var4 = g2Var3;
                borderStroke5 = borderStroke4;
                gVar6 = gVar112;
                z13 = z111;
                gVar7 = gVar113;
                cardElevation4 = cardElevation12;
            }
            u1VarH = pVar2.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$Card$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar3, int i316) {
                    CardKt.b(onClick, nVar4, z13, g2Var4, gVar6, cardElevation4, borderStroke5, gVar7, content, pVar3, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                    a(pVar3, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & bb.c.b.f30796me) == 0) {
                z11 = z10;
                if (pVarF.u(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & bb.c.g.f32954lc) == 0) {
                if ((i11 & 8) == 0) {
                    g2Var2 = g2Var;
                    if (pVarF.s(g2Var2)) {
                    }
                    i12 |= i22;
                } else {
                    g2Var2 = g2Var;
                }
                i12 |= i22;
            } else {
                g2Var2 = g2Var;
            }
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    gVar3 = gVar;
                    if (pVarF.s(gVar3)) {
                    }
                    i12 |= i23;
                } else {
                    gVar3 = gVar;
                }
                i12 |= i23;
            } else {
                gVar3 = gVar;
            }
            if ((458752 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    cardElevation2 = cardElevation;
                    if (pVarF.s(cardElevation2)) {
                    }
                    i12 |= i24;
                } else {
                    cardElevation2 = cardElevation;
                }
                i12 |= i24;
            } else {
                cardElevation2 = cardElevation;
            }
            i15 = i11 & 64;
            if (i15 != 0) {
                i12 |= 1572864;
                borderStroke2 = borderStroke;
            } else {
                borderStroke2 = borderStroke;
                if ((3670016 & i10) == 0) {
                    if (pVarF.s(borderStroke2)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
            }
            i17 = i11 & 128;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (pVarF.s(gVar2)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 234881024) == 0) {
                    if (pVarF.s(content)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                }
                if ((191739611 & i12) == 38347922) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c10 = 6;
                            g2VarG = h.f11894a.g(pVarF, 6);
                            i12 &= -7169;
                        } else {
                            c10 = 6;
                            g2VarG = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            gVarA = h.f11894a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                            i12 &= -57345;
                        } else {
                            gVarA = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationB = h.f11894a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                            i12 &= -458753;
                        } else {
                            cardElevationB = cardElevation2;
                        }
                        if (i15 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i17 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            nVar3 = nVar2;
                            g2Var3 = g2VarG;
                            borderStroke4 = borderStroke3;
                            gVar5 = gVarA;
                            cardElevation3 = cardElevationB;
                            gVar4 = (androidx.compose.foundation.interaction.g) objU;
                            i20 = i12;
                            z12 = z11;
                        } else {
                            gVar4 = gVar2;
                            nVar3 = nVar2;
                            i20 = i12;
                            g2Var3 = g2VarG;
                            borderStroke4 = borderStroke3;
                            gVar5 = gVarA;
                            z12 = z11;
                            cardElevation3 = cardElevationB;
                        }
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c10 = 6;
                            g2VarG = h.f11894a.g(pVarF, 6);
                            i12 &= -7169;
                        } else {
                            c10 = 6;
                            g2VarG = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            gVarA = h.f11894a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                            i12 &= -57345;
                        } else {
                            gVarA = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationB = h.f11894a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                            i12 &= -458753;
                        } else {
                            cardElevationB = cardElevation2;
                        }
                        if (i15 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i17 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            nVar3 = nVar2;
                            g2Var3 = g2VarG;
                            borderStroke4 = borderStroke3;
                            gVar5 = gVarA;
                            cardElevation3 = cardElevationB;
                            gVar4 = (androidx.compose.foundation.interaction.g) objU;
                            i20 = i12;
                            z12 = z11;
                        } else {
                            gVar4 = gVar2;
                            nVar3 = nVar2;
                            i20 = i12;
                            g2Var3 = g2VarG;
                            borderStroke4 = borderStroke3;
                            gVar5 = gVarA;
                            z12 = z11;
                            cardElevation3 = cardElevationB;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-2024281376, i20, -1, "androidx.compose.material3.Card (Card.kt:131)");
                    }
                    int i211115 = (i20 >> 6) & 14;
                    int i211116 = i20 >> 9;
                    int i211117 = i211115 | (i211116 & 112);
                    long jM17 = gVar5.a(z12, pVarF, i211117).getValue().M();
                    long jM18 = gVar5.b(z12, pVarF, i211117).getValue().M();
                    int i211118 = i211115 | ((i20 >> 18) & 112) | (i211116 & bb.c.b.f30796me);
                    float fW17 = cardElevation3.h(z12, gVar4, pVarF, i211118).getValue().w();
                    g gVar114 = gVar5;
                    float fW18 = cardElevation3.g(z12, gVar4, pVarF, i211118).getValue().w();
                    boolean z112 = z12;
                    androidx.compose.runtime.internal.a aVarB9 = androidx.compose.runtime.internal.b.b(pVarF, 776921067, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$Card$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar3, int i211119) {
                            if ((i211119 & 11) == 2 && pVar3.b()) {
                                pVar3.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(776921067, i211119, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:153)");
                            }
                            yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            int i316 = (i20 >> 15) & bb.c.g.f32954lc;
                            pVar3.T(-483455358);
                            androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                            int i317 = i316 >> 3;
                            androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(Arrangement.f5896a.r(), androidx.compose.ui.c.INSTANCE.u(), pVar3, (i317 & 112) | (i317 & 14));
                            pVar3.T(-1323940314);
                            s1.e eVar = (s1.e) pVar3.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection = (LayoutDirection) pVar3.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar3.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA = companion2.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(companion);
                            int i318 = ((((i316 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                            if (!(pVar3.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVar3.h();
                            if (pVar3.D()) {
                                pVar3.L(aVarA);
                            } else {
                                pVar3.d();
                            }
                            pVar3.Y();
                            androidx.compose.runtime.p pVarB = Updater.b(pVar3);
                            Updater.j(pVarB, i0VarB, companion2.d());
                            Updater.j(pVarB, eVar, companion2.b());
                            Updater.j(pVarB, layoutDirection, companion2.c());
                            Updater.j(pVarB, d2Var, companion2.f());
                            pVar3.x();
                            qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar3)), pVar3, Integer.valueOf((i318 >> 3) & 112));
                            pVar3.T(2058660585);
                            pVar3.T(-1163856341);
                            if (((i318 >> 9) & 14 & 11) == 2 && pVar3.b()) {
                                pVar3.l();
                            } else {
                                qVar.invoke(ColumnScopeInstance.f5971a, pVar3, Integer.valueOf(((i316 >> 6) & 112) | 6));
                            }
                            pVar3.c0();
                            pVar3.c0();
                            pVar3.f();
                            pVar3.c0();
                            pVar3.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                            a(pVar3, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    int i211119 = i20;
                    int i316 = (i211119 & 14) | (i211119 & 112) | (i211119 & bb.c.b.f30796me) | (i211119 & bb.c.g.f32954lc);
                    int i317 = i211119 << 6;
                    androidx.compose.foundation.interaction.g gVar115 = gVar4;
                    CardElevation cardElevation13 = cardElevation3;
                    pVar2 = pVarF;
                    SurfaceKt.d(onClick, nVar3, z112, g2Var3, jM17, jM18, fW17, fW18, borderStroke4, gVar115, aVarB9, pVar2, i316 | (i317 & 234881024) | (i317 & 1879048192), 6, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    g2Var4 = g2Var3;
                    borderStroke5 = borderStroke4;
                    gVar6 = gVar114;
                    z13 = z112;
                    gVar7 = gVar115;
                    cardElevation4 = cardElevation13;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c10 = 6;
                            g2VarG = h.f11894a.g(pVarF, 6);
                            i12 &= -7169;
                        } else {
                            c10 = 6;
                            g2VarG = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            gVarA = h.f11894a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                            i12 &= -57345;
                        } else {
                            gVarA = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationB = h.f11894a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                            i12 &= -458753;
                        } else {
                            cardElevationB = cardElevation2;
                        }
                        if (i15 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i17 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            nVar3 = nVar2;
                            g2Var3 = g2VarG;
                            borderStroke4 = borderStroke3;
                            gVar5 = gVarA;
                            cardElevation3 = cardElevationB;
                            gVar4 = (androidx.compose.foundation.interaction.g) objU;
                            i20 = i12;
                            z12 = z11;
                        } else {
                            gVar4 = gVar2;
                            nVar3 = nVar2;
                            i20 = i12;
                            g2Var3 = g2VarG;
                            borderStroke4 = borderStroke3;
                            gVar5 = gVarA;
                            z12 = z11;
                            cardElevation3 = cardElevationB;
                        }
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c10 = 6;
                            g2VarG = h.f11894a.g(pVarF, 6);
                            i12 &= -7169;
                        } else {
                            c10 = 6;
                            g2VarG = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            gVarA = h.f11894a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                            i12 &= -57345;
                        } else {
                            gVarA = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationB = h.f11894a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                            i12 &= -458753;
                        } else {
                            cardElevationB = cardElevation2;
                        }
                        if (i15 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i17 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            nVar3 = nVar2;
                            g2Var3 = g2VarG;
                            borderStroke4 = borderStroke3;
                            gVar5 = gVarA;
                            cardElevation3 = cardElevationB;
                            gVar4 = (androidx.compose.foundation.interaction.g) objU;
                            i20 = i12;
                            z12 = z11;
                        } else {
                            gVar4 = gVar2;
                            nVar3 = nVar2;
                            i20 = i12;
                            g2Var3 = g2VarG;
                            borderStroke4 = borderStroke3;
                            gVar5 = gVarA;
                            z12 = z11;
                            cardElevation3 = cardElevationB;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-2024281376, i20, -1, "androidx.compose.material3.Card (Card.kt:131)");
                    }
                    int i2111110 = (i20 >> 6) & 14;
                    int i2111111 = i20 >> 9;
                    int i2111112 = i2111110 | (i2111111 & 112);
                    long jM19 = gVar5.a(z12, pVarF, i2111112).getValue().M();
                    long jM110 = gVar5.b(z12, pVarF, i2111112).getValue().M();
                    int i2111113 = i2111110 | ((i20 >> 18) & 112) | (i2111111 & bb.c.b.f30796me);
                    float fW19 = cardElevation3.h(z12, gVar4, pVarF, i2111113).getValue().w();
                    g gVar116 = gVar5;
                    float fW110 = cardElevation3.g(z12, gVar4, pVarF, i2111113).getValue().w();
                    boolean z113 = z12;
                    androidx.compose.runtime.internal.a aVarB10 = androidx.compose.runtime.internal.b.b(pVarF, 776921067, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$Card$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar3, int i2111114) {
                            if ((i2111114 & 11) == 2 && pVar3.b()) {
                                pVar3.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(776921067, i2111114, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:153)");
                            }
                            yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            int i318 = (i20 >> 15) & bb.c.g.f32954lc;
                            pVar3.T(-483455358);
                            androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                            int i319 = i318 >> 3;
                            androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(Arrangement.f5896a.r(), androidx.compose.ui.c.INSTANCE.u(), pVar3, (i319 & 112) | (i319 & 14));
                            pVar3.T(-1323940314);
                            s1.e eVar = (s1.e) pVar3.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection = (LayoutDirection) pVar3.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar3.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA = companion2.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(companion);
                            int i3110 = ((((i318 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                            if (!(pVar3.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVar3.h();
                            if (pVar3.D()) {
                                pVar3.L(aVarA);
                            } else {
                                pVar3.d();
                            }
                            pVar3.Y();
                            androidx.compose.runtime.p pVarB = Updater.b(pVar3);
                            Updater.j(pVarB, i0VarB, companion2.d());
                            Updater.j(pVarB, eVar, companion2.b());
                            Updater.j(pVarB, layoutDirection, companion2.c());
                            Updater.j(pVarB, d2Var, companion2.f());
                            pVar3.x();
                            qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar3)), pVar3, Integer.valueOf((i3110 >> 3) & 112));
                            pVar3.T(2058660585);
                            pVar3.T(-1163856341);
                            if (((i3110 >> 9) & 14 & 11) == 2 && pVar3.b()) {
                                pVar3.l();
                            } else {
                                qVar.invoke(ColumnScopeInstance.f5971a, pVar3, Integer.valueOf(((i318 >> 6) & 112) | 6));
                            }
                            pVar3.c0();
                            pVar3.c0();
                            pVar3.f();
                            pVar3.c0();
                            pVar3.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                            a(pVar3, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    int i2111114 = i20;
                    int i318 = (i2111114 & 14) | (i2111114 & 112) | (i2111114 & bb.c.b.f30796me) | (i2111114 & bb.c.g.f32954lc);
                    int i319 = i2111114 << 6;
                    androidx.compose.foundation.interaction.g gVar117 = gVar4;
                    CardElevation cardElevation14 = cardElevation3;
                    pVar2 = pVarF;
                    SurfaceKt.d(onClick, nVar3, z113, g2Var3, jM19, jM110, fW19, fW110, borderStroke4, gVar117, aVarB10, pVar2, i318 | (i319 & 234881024) | (i319 & 1879048192), 6, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    g2Var4 = g2Var3;
                    borderStroke5 = borderStroke4;
                    gVar6 = gVar116;
                    z13 = z113;
                    gVar7 = gVar117;
                    cardElevation4 = cardElevation14;
                }
                u1VarH = pVar2.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$Card$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar3, int i3110) {
                        CardKt.b(onClick, nVar4, z13, g2Var4, gVar6, cardElevation4, borderStroke5, gVar7, content, pVar3, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                        a(pVar3, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i19 = 100663296;
            i12 |= i19;
            if ((191739611 & i12) == 38347922) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c10 = 6;
                        g2VarG = h.f11894a.g(pVarF, 6);
                        i12 &= -7169;
                    } else {
                        c10 = 6;
                        g2VarG = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        gVarA = h.f11894a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        i12 &= -57345;
                    } else {
                        gVarA = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationB = h.f11894a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        i12 &= -458753;
                    } else {
                        cardElevationB = cardElevation2;
                    }
                    if (i15 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if (i17 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        g2Var3 = g2VarG;
                        borderStroke4 = borderStroke3;
                        gVar5 = gVarA;
                        cardElevation3 = cardElevationB;
                        gVar4 = (androidx.compose.foundation.interaction.g) objU;
                        i20 = i12;
                        z12 = z11;
                    } else {
                        gVar4 = gVar2;
                        nVar3 = nVar2;
                        i20 = i12;
                        g2Var3 = g2VarG;
                        borderStroke4 = borderStroke3;
                        gVar5 = gVarA;
                        z12 = z11;
                        cardElevation3 = cardElevationB;
                    }
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c10 = 6;
                        g2VarG = h.f11894a.g(pVarF, 6);
                        i12 &= -7169;
                    } else {
                        c10 = 6;
                        g2VarG = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        gVarA = h.f11894a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        i12 &= -57345;
                    } else {
                        gVarA = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationB = h.f11894a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        i12 &= -458753;
                    } else {
                        cardElevationB = cardElevation2;
                    }
                    if (i15 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if (i17 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        g2Var3 = g2VarG;
                        borderStroke4 = borderStroke3;
                        gVar5 = gVarA;
                        cardElevation3 = cardElevationB;
                        gVar4 = (androidx.compose.foundation.interaction.g) objU;
                        i20 = i12;
                        z12 = z11;
                    } else {
                        gVar4 = gVar2;
                        nVar3 = nVar2;
                        i20 = i12;
                        g2Var3 = g2VarG;
                        borderStroke4 = borderStroke3;
                        gVar5 = gVarA;
                        z12 = z11;
                        cardElevation3 = cardElevationB;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-2024281376, i20, -1, "androidx.compose.material3.Card (Card.kt:131)");
                }
                int i2111115 = (i20 >> 6) & 14;
                int i2111116 = i20 >> 9;
                int i2111117 = i2111115 | (i2111116 & 112);
                long jM111 = gVar5.a(z12, pVarF, i2111117).getValue().M();
                long jM112 = gVar5.b(z12, pVarF, i2111117).getValue().M();
                int i2111118 = i2111115 | ((i20 >> 18) & 112) | (i2111116 & bb.c.b.f30796me);
                float fW111 = cardElevation3.h(z12, gVar4, pVarF, i2111118).getValue().w();
                g gVar118 = gVar5;
                float fW112 = cardElevation3.g(z12, gVar4, pVarF, i2111118).getValue().w();
                boolean z114 = z12;
                androidx.compose.runtime.internal.a aVarB11 = androidx.compose.runtime.internal.b.b(pVarF, 776921067, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$Card$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar3, int i2111119) {
                        if ((i2111119 & 11) == 2 && pVar3.b()) {
                            pVar3.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(776921067, i2111119, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:153)");
                        }
                        yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                        int i3110 = (i20 >> 15) & bb.c.g.f32954lc;
                        pVar3.T(-483455358);
                        androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                        int i3111 = i3110 >> 3;
                        androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(Arrangement.f5896a.r(), androidx.compose.ui.c.INSTANCE.u(), pVar3, (i3111 & 112) | (i3111 & 14));
                        pVar3.T(-1323940314);
                        s1.e eVar = (s1.e) pVar3.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection = (LayoutDirection) pVar3.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar3.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA = companion2.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(companion);
                        int i3112 = ((((i3110 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                        if (!(pVar3.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar3.h();
                        if (pVar3.D()) {
                            pVar3.L(aVarA);
                        } else {
                            pVar3.d();
                        }
                        pVar3.Y();
                        androidx.compose.runtime.p pVarB = Updater.b(pVar3);
                        Updater.j(pVarB, i0VarB, companion2.d());
                        Updater.j(pVarB, eVar, companion2.b());
                        Updater.j(pVarB, layoutDirection, companion2.c());
                        Updater.j(pVarB, d2Var, companion2.f());
                        pVar3.x();
                        qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar3)), pVar3, Integer.valueOf((i3112 >> 3) & 112));
                        pVar3.T(2058660585);
                        pVar3.T(-1163856341);
                        if (((i3112 >> 9) & 14 & 11) == 2 && pVar3.b()) {
                            pVar3.l();
                        } else {
                            qVar.invoke(ColumnScopeInstance.f5971a, pVar3, Integer.valueOf(((i3110 >> 6) & 112) | 6));
                        }
                        pVar3.c0();
                        pVar3.c0();
                        pVar3.f();
                        pVar3.c0();
                        pVar3.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                        a(pVar3, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                int i2111119 = i20;
                int i3110 = (i2111119 & 14) | (i2111119 & 112) | (i2111119 & bb.c.b.f30796me) | (i2111119 & bb.c.g.f32954lc);
                int i3111 = i2111119 << 6;
                androidx.compose.foundation.interaction.g gVar119 = gVar4;
                CardElevation cardElevation15 = cardElevation3;
                pVar2 = pVarF;
                SurfaceKt.d(onClick, nVar3, z114, g2Var3, jM111, jM112, fW111, fW112, borderStroke4, gVar119, aVarB11, pVar2, i3110 | (i3111 & 234881024) | (i3111 & 1879048192), 6, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                g2Var4 = g2Var3;
                borderStroke5 = borderStroke4;
                gVar6 = gVar118;
                z13 = z114;
                gVar7 = gVar119;
                cardElevation4 = cardElevation15;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c10 = 6;
                        g2VarG = h.f11894a.g(pVarF, 6);
                        i12 &= -7169;
                    } else {
                        c10 = 6;
                        g2VarG = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        gVarA = h.f11894a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        i12 &= -57345;
                    } else {
                        gVarA = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationB = h.f11894a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        i12 &= -458753;
                    } else {
                        cardElevationB = cardElevation2;
                    }
                    if (i15 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if (i17 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        g2Var3 = g2VarG;
                        borderStroke4 = borderStroke3;
                        gVar5 = gVarA;
                        cardElevation3 = cardElevationB;
                        gVar4 = (androidx.compose.foundation.interaction.g) objU;
                        i20 = i12;
                        z12 = z11;
                    } else {
                        gVar4 = gVar2;
                        nVar3 = nVar2;
                        i20 = i12;
                        g2Var3 = g2VarG;
                        borderStroke4 = borderStroke3;
                        gVar5 = gVarA;
                        z12 = z11;
                        cardElevation3 = cardElevationB;
                    }
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c10 = 6;
                        g2VarG = h.f11894a.g(pVarF, 6);
                        i12 &= -7169;
                    } else {
                        c10 = 6;
                        g2VarG = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        gVarA = h.f11894a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        i12 &= -57345;
                    } else {
                        gVarA = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationB = h.f11894a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        i12 &= -458753;
                    } else {
                        cardElevationB = cardElevation2;
                    }
                    if (i15 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if (i17 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        g2Var3 = g2VarG;
                        borderStroke4 = borderStroke3;
                        gVar5 = gVarA;
                        cardElevation3 = cardElevationB;
                        gVar4 = (androidx.compose.foundation.interaction.g) objU;
                        i20 = i12;
                        z12 = z11;
                    } else {
                        gVar4 = gVar2;
                        nVar3 = nVar2;
                        i20 = i12;
                        g2Var3 = g2VarG;
                        borderStroke4 = borderStroke3;
                        gVar5 = gVarA;
                        z12 = z11;
                        cardElevation3 = cardElevationB;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-2024281376, i20, -1, "androidx.compose.material3.Card (Card.kt:131)");
                }
                int i21111110 = (i20 >> 6) & 14;
                int i21111111 = i20 >> 9;
                int i21111112 = i21111110 | (i21111111 & 112);
                long jM113 = gVar5.a(z12, pVarF, i21111112).getValue().M();
                long jM114 = gVar5.b(z12, pVarF, i21111112).getValue().M();
                int i21111113 = i21111110 | ((i20 >> 18) & 112) | (i21111111 & bb.c.b.f30796me);
                float fW113 = cardElevation3.h(z12, gVar4, pVarF, i21111113).getValue().w();
                g gVar1110 = gVar5;
                float fW114 = cardElevation3.g(z12, gVar4, pVarF, i21111113).getValue().w();
                boolean z115 = z12;
                androidx.compose.runtime.internal.a aVarB12 = androidx.compose.runtime.internal.b.b(pVarF, 776921067, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$Card$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar3, int i21111114) {
                        if ((i21111114 & 11) == 2 && pVar3.b()) {
                            pVar3.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(776921067, i21111114, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:153)");
                        }
                        yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                        int i3112 = (i20 >> 15) & bb.c.g.f32954lc;
                        pVar3.T(-483455358);
                        androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                        int i3113 = i3112 >> 3;
                        androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(Arrangement.f5896a.r(), androidx.compose.ui.c.INSTANCE.u(), pVar3, (i3113 & 112) | (i3113 & 14));
                        pVar3.T(-1323940314);
                        s1.e eVar = (s1.e) pVar3.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection = (LayoutDirection) pVar3.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar3.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA = companion2.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(companion);
                        int i3114 = ((((i3112 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                        if (!(pVar3.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar3.h();
                        if (pVar3.D()) {
                            pVar3.L(aVarA);
                        } else {
                            pVar3.d();
                        }
                        pVar3.Y();
                        androidx.compose.runtime.p pVarB = Updater.b(pVar3);
                        Updater.j(pVarB, i0VarB, companion2.d());
                        Updater.j(pVarB, eVar, companion2.b());
                        Updater.j(pVarB, layoutDirection, companion2.c());
                        Updater.j(pVarB, d2Var, companion2.f());
                        pVar3.x();
                        qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar3)), pVar3, Integer.valueOf((i3114 >> 3) & 112));
                        pVar3.T(2058660585);
                        pVar3.T(-1163856341);
                        if (((i3114 >> 9) & 14 & 11) == 2 && pVar3.b()) {
                            pVar3.l();
                        } else {
                            qVar.invoke(ColumnScopeInstance.f5971a, pVar3, Integer.valueOf(((i3112 >> 6) & 112) | 6));
                        }
                        pVar3.c0();
                        pVar3.c0();
                        pVar3.f();
                        pVar3.c0();
                        pVar3.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                        a(pVar3, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                int i21111114 = i20;
                int i3112 = (i21111114 & 14) | (i21111114 & 112) | (i21111114 & bb.c.b.f30796me) | (i21111114 & bb.c.g.f32954lc);
                int i3113 = i21111114 << 6;
                androidx.compose.foundation.interaction.g gVar1111 = gVar4;
                CardElevation cardElevation16 = cardElevation3;
                pVar2 = pVarF;
                SurfaceKt.d(onClick, nVar3, z115, g2Var3, jM113, jM114, fW113, fW114, borderStroke4, gVar1111, aVarB12, pVar2, i3112 | (i3113 & 234881024) | (i3113 & 1879048192), 6, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                g2Var4 = g2Var3;
                borderStroke5 = borderStroke4;
                gVar6 = gVar1110;
                z13 = z115;
                gVar7 = gVar1111;
                cardElevation4 = cardElevation16;
            }
            u1VarH = pVar2.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$Card$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar3, int i3114) {
                    CardKt.b(onClick, nVar4, z13, g2Var4, gVar6, cardElevation4, borderStroke5, gVar7, content, pVar3, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                    a(pVar3, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= bb.c.b.f30966u4;
        z11 = z10;
        if ((i10 & bb.c.g.f32954lc) == 0) {
            if ((i11 & 8) == 0) {
                g2Var2 = g2Var;
                if (pVarF.s(g2Var2)) {
                }
                i12 |= i22;
            } else {
                g2Var2 = g2Var;
            }
            i12 |= i22;
        } else {
            g2Var2 = g2Var;
        }
        if ((57344 & i10) == 0) {
            if ((i11 & 16) == 0) {
                gVar3 = gVar;
                if (pVarF.s(gVar3)) {
                }
                i12 |= i23;
            } else {
                gVar3 = gVar;
            }
            i12 |= i23;
        } else {
            gVar3 = gVar;
        }
        if ((458752 & i10) == 0) {
            if ((i11 & 32) == 0) {
                cardElevation2 = cardElevation;
                if (pVarF.s(cardElevation2)) {
                }
                i12 |= i24;
            } else {
                cardElevation2 = cardElevation;
            }
            i12 |= i24;
        } else {
            cardElevation2 = cardElevation;
        }
        i15 = i11 & 64;
        if (i15 != 0) {
            i12 |= 1572864;
            borderStroke2 = borderStroke;
        } else {
            borderStroke2 = borderStroke;
            if ((3670016 & i10) == 0) {
                if (pVarF.s(borderStroke2)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i12 |= i16;
            }
        }
        i17 = i11 & 128;
        if (i17 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            if (pVarF.s(gVar2)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i12 |= i18;
        }
        if ((i11 & 256) != 0) {
            if ((i10 & 234881024) == 0) {
                if (pVarF.s(content)) {
                    i19 = 67108864;
                } else {
                    i19 = 33554432;
                }
            }
            if ((191739611 & i12) == 38347922) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c10 = 6;
                        g2VarG = h.f11894a.g(pVarF, 6);
                        i12 &= -7169;
                    } else {
                        c10 = 6;
                        g2VarG = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        gVarA = h.f11894a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        i12 &= -57345;
                    } else {
                        gVarA = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationB = h.f11894a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        i12 &= -458753;
                    } else {
                        cardElevationB = cardElevation2;
                    }
                    if (i15 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if (i17 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        g2Var3 = g2VarG;
                        borderStroke4 = borderStroke3;
                        gVar5 = gVarA;
                        cardElevation3 = cardElevationB;
                        gVar4 = (androidx.compose.foundation.interaction.g) objU;
                        i20 = i12;
                        z12 = z11;
                    } else {
                        gVar4 = gVar2;
                        nVar3 = nVar2;
                        i20 = i12;
                        g2Var3 = g2VarG;
                        borderStroke4 = borderStroke3;
                        gVar5 = gVarA;
                        z12 = z11;
                        cardElevation3 = cardElevationB;
                    }
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c10 = 6;
                        g2VarG = h.f11894a.g(pVarF, 6);
                        i12 &= -7169;
                    } else {
                        c10 = 6;
                        g2VarG = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        gVarA = h.f11894a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        i12 &= -57345;
                    } else {
                        gVarA = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationB = h.f11894a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        i12 &= -458753;
                    } else {
                        cardElevationB = cardElevation2;
                    }
                    if (i15 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if (i17 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        g2Var3 = g2VarG;
                        borderStroke4 = borderStroke3;
                        gVar5 = gVarA;
                        cardElevation3 = cardElevationB;
                        gVar4 = (androidx.compose.foundation.interaction.g) objU;
                        i20 = i12;
                        z12 = z11;
                    } else {
                        gVar4 = gVar2;
                        nVar3 = nVar2;
                        i20 = i12;
                        g2Var3 = g2VarG;
                        borderStroke4 = borderStroke3;
                        gVar5 = gVarA;
                        z12 = z11;
                        cardElevation3 = cardElevationB;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-2024281376, i20, -1, "androidx.compose.material3.Card (Card.kt:131)");
                }
                int i21111115 = (i20 >> 6) & 14;
                int i21111116 = i20 >> 9;
                int i21111117 = i21111115 | (i21111116 & 112);
                long jM115 = gVar5.a(z12, pVarF, i21111117).getValue().M();
                long jM116 = gVar5.b(z12, pVarF, i21111117).getValue().M();
                int i21111118 = i21111115 | ((i20 >> 18) & 112) | (i21111116 & bb.c.b.f30796me);
                float fW115 = cardElevation3.h(z12, gVar4, pVarF, i21111118).getValue().w();
                g gVar1112 = gVar5;
                float fW116 = cardElevation3.g(z12, gVar4, pVarF, i21111118).getValue().w();
                boolean z116 = z12;
                androidx.compose.runtime.internal.a aVarB13 = androidx.compose.runtime.internal.b.b(pVarF, 776921067, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$Card$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar3, int i21111119) {
                        if ((i21111119 & 11) == 2 && pVar3.b()) {
                            pVar3.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(776921067, i21111119, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:153)");
                        }
                        yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                        int i3114 = (i20 >> 15) & bb.c.g.f32954lc;
                        pVar3.T(-483455358);
                        androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                        int i3115 = i3114 >> 3;
                        androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(Arrangement.f5896a.r(), androidx.compose.ui.c.INSTANCE.u(), pVar3, (i3115 & 112) | (i3115 & 14));
                        pVar3.T(-1323940314);
                        s1.e eVar = (s1.e) pVar3.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection = (LayoutDirection) pVar3.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar3.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA = companion2.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(companion);
                        int i3116 = ((((i3114 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                        if (!(pVar3.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar3.h();
                        if (pVar3.D()) {
                            pVar3.L(aVarA);
                        } else {
                            pVar3.d();
                        }
                        pVar3.Y();
                        androidx.compose.runtime.p pVarB = Updater.b(pVar3);
                        Updater.j(pVarB, i0VarB, companion2.d());
                        Updater.j(pVarB, eVar, companion2.b());
                        Updater.j(pVarB, layoutDirection, companion2.c());
                        Updater.j(pVarB, d2Var, companion2.f());
                        pVar3.x();
                        qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar3)), pVar3, Integer.valueOf((i3116 >> 3) & 112));
                        pVar3.T(2058660585);
                        pVar3.T(-1163856341);
                        if (((i3116 >> 9) & 14 & 11) == 2 && pVar3.b()) {
                            pVar3.l();
                        } else {
                            qVar.invoke(ColumnScopeInstance.f5971a, pVar3, Integer.valueOf(((i3114 >> 6) & 112) | 6));
                        }
                        pVar3.c0();
                        pVar3.c0();
                        pVar3.f();
                        pVar3.c0();
                        pVar3.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                        a(pVar3, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                int i21111119 = i20;
                int i3114 = (i21111119 & 14) | (i21111119 & 112) | (i21111119 & bb.c.b.f30796me) | (i21111119 & bb.c.g.f32954lc);
                int i3115 = i21111119 << 6;
                androidx.compose.foundation.interaction.g gVar1113 = gVar4;
                CardElevation cardElevation17 = cardElevation3;
                pVar2 = pVarF;
                SurfaceKt.d(onClick, nVar3, z116, g2Var3, jM115, jM116, fW115, fW116, borderStroke4, gVar1113, aVarB13, pVar2, i3114 | (i3115 & 234881024) | (i3115 & 1879048192), 6, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                g2Var4 = g2Var3;
                borderStroke5 = borderStroke4;
                gVar6 = gVar1112;
                z13 = z116;
                gVar7 = gVar1113;
                cardElevation4 = cardElevation17;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c10 = 6;
                        g2VarG = h.f11894a.g(pVarF, 6);
                        i12 &= -7169;
                    } else {
                        c10 = 6;
                        g2VarG = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        gVarA = h.f11894a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        i12 &= -57345;
                    } else {
                        gVarA = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationB = h.f11894a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        i12 &= -458753;
                    } else {
                        cardElevationB = cardElevation2;
                    }
                    if (i15 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if (i17 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        g2Var3 = g2VarG;
                        borderStroke4 = borderStroke3;
                        gVar5 = gVarA;
                        cardElevation3 = cardElevationB;
                        gVar4 = (androidx.compose.foundation.interaction.g) objU;
                        i20 = i12;
                        z12 = z11;
                    } else {
                        gVar4 = gVar2;
                        nVar3 = nVar2;
                        i20 = i12;
                        g2Var3 = g2VarG;
                        borderStroke4 = borderStroke3;
                        gVar5 = gVarA;
                        z12 = z11;
                        cardElevation3 = cardElevationB;
                    }
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c10 = 6;
                        g2VarG = h.f11894a.g(pVarF, 6);
                        i12 &= -7169;
                    } else {
                        c10 = 6;
                        g2VarG = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        gVarA = h.f11894a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        i12 &= -57345;
                    } else {
                        gVarA = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationB = h.f11894a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        i12 &= -458753;
                    } else {
                        cardElevationB = cardElevation2;
                    }
                    if (i15 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if (i17 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        g2Var3 = g2VarG;
                        borderStroke4 = borderStroke3;
                        gVar5 = gVarA;
                        cardElevation3 = cardElevationB;
                        gVar4 = (androidx.compose.foundation.interaction.g) objU;
                        i20 = i12;
                        z12 = z11;
                    } else {
                        gVar4 = gVar2;
                        nVar3 = nVar2;
                        i20 = i12;
                        g2Var3 = g2VarG;
                        borderStroke4 = borderStroke3;
                        gVar5 = gVarA;
                        z12 = z11;
                        cardElevation3 = cardElevationB;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-2024281376, i20, -1, "androidx.compose.material3.Card (Card.kt:131)");
                }
                int i211111110 = (i20 >> 6) & 14;
                int i211111111 = i20 >> 9;
                int i211111112 = i211111110 | (i211111111 & 112);
                long jM117 = gVar5.a(z12, pVarF, i211111112).getValue().M();
                long jM118 = gVar5.b(z12, pVarF, i211111112).getValue().M();
                int i211111113 = i211111110 | ((i20 >> 18) & 112) | (i211111111 & bb.c.b.f30796me);
                float fW117 = cardElevation3.h(z12, gVar4, pVarF, i211111113).getValue().w();
                g gVar1114 = gVar5;
                float fW118 = cardElevation3.g(z12, gVar4, pVarF, i211111113).getValue().w();
                boolean z117 = z12;
                androidx.compose.runtime.internal.a aVarB14 = androidx.compose.runtime.internal.b.b(pVarF, 776921067, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$Card$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar3, int i211111114) {
                        if ((i211111114 & 11) == 2 && pVar3.b()) {
                            pVar3.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(776921067, i211111114, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:153)");
                        }
                        yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                        int i3116 = (i20 >> 15) & bb.c.g.f32954lc;
                        pVar3.T(-483455358);
                        androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                        int i3117 = i3116 >> 3;
                        androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(Arrangement.f5896a.r(), androidx.compose.ui.c.INSTANCE.u(), pVar3, (i3117 & 112) | (i3117 & 14));
                        pVar3.T(-1323940314);
                        s1.e eVar = (s1.e) pVar3.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection = (LayoutDirection) pVar3.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar3.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA = companion2.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(companion);
                        int i3118 = ((((i3116 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                        if (!(pVar3.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar3.h();
                        if (pVar3.D()) {
                            pVar3.L(aVarA);
                        } else {
                            pVar3.d();
                        }
                        pVar3.Y();
                        androidx.compose.runtime.p pVarB = Updater.b(pVar3);
                        Updater.j(pVarB, i0VarB, companion2.d());
                        Updater.j(pVarB, eVar, companion2.b());
                        Updater.j(pVarB, layoutDirection, companion2.c());
                        Updater.j(pVarB, d2Var, companion2.f());
                        pVar3.x();
                        qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar3)), pVar3, Integer.valueOf((i3118 >> 3) & 112));
                        pVar3.T(2058660585);
                        pVar3.T(-1163856341);
                        if (((i3118 >> 9) & 14 & 11) == 2 && pVar3.b()) {
                            pVar3.l();
                        } else {
                            qVar.invoke(ColumnScopeInstance.f5971a, pVar3, Integer.valueOf(((i3116 >> 6) & 112) | 6));
                        }
                        pVar3.c0();
                        pVar3.c0();
                        pVar3.f();
                        pVar3.c0();
                        pVar3.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                        a(pVar3, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                int i211111114 = i20;
                int i3116 = (i211111114 & 14) | (i211111114 & 112) | (i211111114 & bb.c.b.f30796me) | (i211111114 & bb.c.g.f32954lc);
                int i3117 = i211111114 << 6;
                androidx.compose.foundation.interaction.g gVar1115 = gVar4;
                CardElevation cardElevation18 = cardElevation3;
                pVar2 = pVarF;
                SurfaceKt.d(onClick, nVar3, z117, g2Var3, jM117, jM118, fW117, fW118, borderStroke4, gVar1115, aVarB14, pVar2, i3116 | (i3117 & 234881024) | (i3117 & 1879048192), 6, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                g2Var4 = g2Var3;
                borderStroke5 = borderStroke4;
                gVar6 = gVar1114;
                z13 = z117;
                gVar7 = gVar1115;
                cardElevation4 = cardElevation18;
            }
            u1VarH = pVar2.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$Card$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar3, int i3118) {
                    CardKt.b(onClick, nVar4, z13, g2Var4, gVar6, cardElevation4, borderStroke5, gVar7, content, pVar3, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                    a(pVar3, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i19 = 100663296;
        i12 |= i19;
        if ((191739611 & i12) == 38347922) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    c10 = 6;
                    g2VarG = h.f11894a.g(pVarF, 6);
                    i12 &= -7169;
                } else {
                    c10 = 6;
                    g2VarG = g2Var2;
                }
                if ((i11 & 16) != 0) {
                    gVarA = h.f11894a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    i12 &= -57345;
                } else {
                    gVarA = gVar3;
                }
                if ((i11 & 32) != 0) {
                    cardElevationB = h.f11894a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                    i12 &= -458753;
                } else {
                    cardElevationB = cardElevation2;
                }
                if (i15 != 0) {
                    borderStroke3 = null;
                } else {
                    borderStroke3 = borderStroke;
                }
                if (i17 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    nVar3 = nVar2;
                    g2Var3 = g2VarG;
                    borderStroke4 = borderStroke3;
                    gVar5 = gVarA;
                    cardElevation3 = cardElevationB;
                    gVar4 = (androidx.compose.foundation.interaction.g) objU;
                    i20 = i12;
                    z12 = z11;
                } else {
                    gVar4 = gVar2;
                    nVar3 = nVar2;
                    i20 = i12;
                    g2Var3 = g2VarG;
                    borderStroke4 = borderStroke3;
                    gVar5 = gVarA;
                    z12 = z11;
                    cardElevation3 = cardElevationB;
                }
            } else {
                if (i21 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    c10 = 6;
                    g2VarG = h.f11894a.g(pVarF, 6);
                    i12 &= -7169;
                } else {
                    c10 = 6;
                    g2VarG = g2Var2;
                }
                if ((i11 & 16) != 0) {
                    gVarA = h.f11894a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    i12 &= -57345;
                } else {
                    gVarA = gVar3;
                }
                if ((i11 & 32) != 0) {
                    cardElevationB = h.f11894a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                    i12 &= -458753;
                } else {
                    cardElevationB = cardElevation2;
                }
                if (i15 != 0) {
                    borderStroke3 = null;
                } else {
                    borderStroke3 = borderStroke;
                }
                if (i17 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    nVar3 = nVar2;
                    g2Var3 = g2VarG;
                    borderStroke4 = borderStroke3;
                    gVar5 = gVarA;
                    cardElevation3 = cardElevationB;
                    gVar4 = (androidx.compose.foundation.interaction.g) objU;
                    i20 = i12;
                    z12 = z11;
                } else {
                    gVar4 = gVar2;
                    nVar3 = nVar2;
                    i20 = i12;
                    g2Var3 = g2VarG;
                    borderStroke4 = borderStroke3;
                    gVar5 = gVarA;
                    z12 = z11;
                    cardElevation3 = cardElevationB;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-2024281376, i20, -1, "androidx.compose.material3.Card (Card.kt:131)");
            }
            int i211111115 = (i20 >> 6) & 14;
            int i211111116 = i20 >> 9;
            int i211111117 = i211111115 | (i211111116 & 112);
            long jM119 = gVar5.a(z12, pVarF, i211111117).getValue().M();
            long jM1110 = gVar5.b(z12, pVarF, i211111117).getValue().M();
            int i211111118 = i211111115 | ((i20 >> 18) & 112) | (i211111116 & bb.c.b.f30796me);
            float fW119 = cardElevation3.h(z12, gVar4, pVarF, i211111118).getValue().w();
            g gVar1116 = gVar5;
            float fW1110 = cardElevation3.g(z12, gVar4, pVarF, i211111118).getValue().w();
            boolean z118 = z12;
            androidx.compose.runtime.internal.a aVarB15 = androidx.compose.runtime.internal.b.b(pVarF, 776921067, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$Card$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar3, int i211111119) {
                    if ((i211111119 & 11) == 2 && pVar3.b()) {
                        pVar3.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(776921067, i211111119, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:153)");
                    }
                    yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                    int i3118 = (i20 >> 15) & bb.c.g.f32954lc;
                    pVar3.T(-483455358);
                    androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                    int i3119 = i3118 >> 3;
                    androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(Arrangement.f5896a.r(), androidx.compose.ui.c.INSTANCE.u(), pVar3, (i3119 & 112) | (i3119 & 14));
                    pVar3.T(-1323940314);
                    s1.e eVar = (s1.e) pVar3.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection = (LayoutDirection) pVar3.K(CompositionLocalsKt.p());
                    androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar3.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    yh.a<ComposeUiNode> aVarA = companion2.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(companion);
                    int i31110 = ((((i3118 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                    if (!(pVar3.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVar3.h();
                    if (pVar3.D()) {
                        pVar3.L(aVarA);
                    } else {
                        pVar3.d();
                    }
                    pVar3.Y();
                    androidx.compose.runtime.p pVarB = Updater.b(pVar3);
                    Updater.j(pVarB, i0VarB, companion2.d());
                    Updater.j(pVarB, eVar, companion2.b());
                    Updater.j(pVarB, layoutDirection, companion2.c());
                    Updater.j(pVarB, d2Var, companion2.f());
                    pVar3.x();
                    qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar3)), pVar3, Integer.valueOf((i31110 >> 3) & 112));
                    pVar3.T(2058660585);
                    pVar3.T(-1163856341);
                    if (((i31110 >> 9) & 14 & 11) == 2 && pVar3.b()) {
                        pVar3.l();
                    } else {
                        qVar.invoke(ColumnScopeInstance.f5971a, pVar3, Integer.valueOf(((i3118 >> 6) & 112) | 6));
                    }
                    pVar3.c0();
                    pVar3.c0();
                    pVar3.f();
                    pVar3.c0();
                    pVar3.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                    a(pVar3, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
            int i211111119 = i20;
            int i3118 = (i211111119 & 14) | (i211111119 & 112) | (i211111119 & bb.c.b.f30796me) | (i211111119 & bb.c.g.f32954lc);
            int i3119 = i211111119 << 6;
            androidx.compose.foundation.interaction.g gVar1117 = gVar4;
            CardElevation cardElevation19 = cardElevation3;
            pVar2 = pVarF;
            SurfaceKt.d(onClick, nVar3, z118, g2Var3, jM119, jM1110, fW119, fW1110, borderStroke4, gVar1117, aVarB15, pVar2, i3118 | (i3119 & 234881024) | (i3119 & 1879048192), 6, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            g2Var4 = g2Var3;
            borderStroke5 = borderStroke4;
            gVar6 = gVar1116;
            z13 = z118;
            gVar7 = gVar1117;
            cardElevation4 = cardElevation19;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    c10 = 6;
                    g2VarG = h.f11894a.g(pVarF, 6);
                    i12 &= -7169;
                } else {
                    c10 = 6;
                    g2VarG = g2Var2;
                }
                if ((i11 & 16) != 0) {
                    gVarA = h.f11894a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    i12 &= -57345;
                } else {
                    gVarA = gVar3;
                }
                if ((i11 & 32) != 0) {
                    cardElevationB = h.f11894a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                    i12 &= -458753;
                } else {
                    cardElevationB = cardElevation2;
                }
                if (i15 != 0) {
                    borderStroke3 = null;
                } else {
                    borderStroke3 = borderStroke;
                }
                if (i17 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    nVar3 = nVar2;
                    g2Var3 = g2VarG;
                    borderStroke4 = borderStroke3;
                    gVar5 = gVarA;
                    cardElevation3 = cardElevationB;
                    gVar4 = (androidx.compose.foundation.interaction.g) objU;
                    i20 = i12;
                    z12 = z11;
                } else {
                    gVar4 = gVar2;
                    nVar3 = nVar2;
                    i20 = i12;
                    g2Var3 = g2VarG;
                    borderStroke4 = borderStroke3;
                    gVar5 = gVarA;
                    z12 = z11;
                    cardElevation3 = cardElevationB;
                }
            } else {
                if (i21 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    c10 = 6;
                    g2VarG = h.f11894a.g(pVarF, 6);
                    i12 &= -7169;
                } else {
                    c10 = 6;
                    g2VarG = g2Var2;
                }
                if ((i11 & 16) != 0) {
                    gVarA = h.f11894a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    i12 &= -57345;
                } else {
                    gVarA = gVar3;
                }
                if ((i11 & 32) != 0) {
                    cardElevationB = h.f11894a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                    i12 &= -458753;
                } else {
                    cardElevationB = cardElevation2;
                }
                if (i15 != 0) {
                    borderStroke3 = null;
                } else {
                    borderStroke3 = borderStroke;
                }
                if (i17 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    nVar3 = nVar2;
                    g2Var3 = g2VarG;
                    borderStroke4 = borderStroke3;
                    gVar5 = gVarA;
                    cardElevation3 = cardElevationB;
                    gVar4 = (androidx.compose.foundation.interaction.g) objU;
                    i20 = i12;
                    z12 = z11;
                } else {
                    gVar4 = gVar2;
                    nVar3 = nVar2;
                    i20 = i12;
                    g2Var3 = g2VarG;
                    borderStroke4 = borderStroke3;
                    gVar5 = gVarA;
                    z12 = z11;
                    cardElevation3 = cardElevationB;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-2024281376, i20, -1, "androidx.compose.material3.Card (Card.kt:131)");
            }
            int i2111111110 = (i20 >> 6) & 14;
            int i2111111111 = i20 >> 9;
            int i2111111112 = i2111111110 | (i2111111111 & 112);
            long jM1111 = gVar5.a(z12, pVarF, i2111111112).getValue().M();
            long jM1112 = gVar5.b(z12, pVarF, i2111111112).getValue().M();
            int i2111111113 = i2111111110 | ((i20 >> 18) & 112) | (i2111111111 & bb.c.b.f30796me);
            float fW1111 = cardElevation3.h(z12, gVar4, pVarF, i2111111113).getValue().w();
            g gVar1118 = gVar5;
            float fW1112 = cardElevation3.g(z12, gVar4, pVarF, i2111111113).getValue().w();
            boolean z119 = z12;
            androidx.compose.runtime.internal.a aVarB16 = androidx.compose.runtime.internal.b.b(pVarF, 776921067, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$Card$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar3, int i2111111114) {
                    if ((i2111111114 & 11) == 2 && pVar3.b()) {
                        pVar3.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(776921067, i2111111114, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:153)");
                    }
                    yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                    int i31110 = (i20 >> 15) & bb.c.g.f32954lc;
                    pVar3.T(-483455358);
                    androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                    int i31111 = i31110 >> 3;
                    androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(Arrangement.f5896a.r(), androidx.compose.ui.c.INSTANCE.u(), pVar3, (i31111 & 112) | (i31111 & 14));
                    pVar3.T(-1323940314);
                    s1.e eVar = (s1.e) pVar3.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection = (LayoutDirection) pVar3.K(CompositionLocalsKt.p());
                    androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar3.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    yh.a<ComposeUiNode> aVarA = companion2.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(companion);
                    int i31112 = ((((i31110 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                    if (!(pVar3.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVar3.h();
                    if (pVar3.D()) {
                        pVar3.L(aVarA);
                    } else {
                        pVar3.d();
                    }
                    pVar3.Y();
                    androidx.compose.runtime.p pVarB = Updater.b(pVar3);
                    Updater.j(pVarB, i0VarB, companion2.d());
                    Updater.j(pVarB, eVar, companion2.b());
                    Updater.j(pVarB, layoutDirection, companion2.c());
                    Updater.j(pVarB, d2Var, companion2.f());
                    pVar3.x();
                    qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar3)), pVar3, Integer.valueOf((i31112 >> 3) & 112));
                    pVar3.T(2058660585);
                    pVar3.T(-1163856341);
                    if (((i31112 >> 9) & 14 & 11) == 2 && pVar3.b()) {
                        pVar3.l();
                    } else {
                        qVar.invoke(ColumnScopeInstance.f5971a, pVar3, Integer.valueOf(((i31110 >> 6) & 112) | 6));
                    }
                    pVar3.c0();
                    pVar3.c0();
                    pVar3.f();
                    pVar3.c0();
                    pVar3.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                    a(pVar3, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
            int i2111111114 = i20;
            int i31110 = (i2111111114 & 14) | (i2111111114 & 112) | (i2111111114 & bb.c.b.f30796me) | (i2111111114 & bb.c.g.f32954lc);
            int i31111 = i2111111114 << 6;
            androidx.compose.foundation.interaction.g gVar1119 = gVar4;
            CardElevation cardElevation110 = cardElevation3;
            pVar2 = pVarF;
            SurfaceKt.d(onClick, nVar3, z119, g2Var3, jM1111, jM1112, fW1111, fW1112, borderStroke4, gVar1119, aVarB16, pVar2, i31110 | (i31111 & 234881024) | (i31111 & 1879048192), 6, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            g2Var4 = g2Var3;
            borderStroke5 = borderStroke4;
            gVar6 = gVar1118;
            z13 = z119;
            gVar7 = gVar1119;
            cardElevation4 = cardElevation110;
        }
        u1VarH = pVar2.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$Card$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar3, int i31112) {
                CardKt.b(onClick, nVar4, z13, g2Var4, gVar6, cardElevation4, borderStroke5, gVar7, content, pVar3, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                a(pVar3, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:95:0x0138  */
    /* JADX WARN: Code duplicated, block: B:98:0x0167  */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void c(@dl.e androidx.compose.ui.n nVar, @dl.e g2 g2Var, @dl.e g gVar, @dl.e CardElevation cardElevation, @dl.d final yh.q<? super androidx.compose.foundation.layout.o, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        androidx.compose.ui.n nVar2;
        int i12;
        g2 g2Var2;
        g gVar2;
        CardElevation cardElevation2;
        g2 g2VarE;
        g gVarC;
        androidx.compose.ui.n nVar3;
        g2 g2Var3;
        g gVar3;
        CardElevation cardElevationD;
        final androidx.compose.ui.n nVar4;
        final g2 g2Var4;
        final g gVar4;
        final CardElevation cardElevation3;
        kotlin.jvm.internal.f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(895940201);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            nVar2 = nVar;
        } else if ((i10 & 14) == 0) {
            nVar2 = nVar;
            i12 = (pVarF.s(nVar2) ? 4 : 2) | i10;
        } else {
            nVar2 = nVar;
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                g2Var2 = g2Var;
                int i14 = pVarF.s(g2Var2) ? 32 : 16;
                i12 |= i14;
            } else {
                g2Var2 = g2Var;
            }
            i12 |= i14;
        } else {
            g2Var2 = g2Var;
        }
        if ((i10 & bb.c.b.f30796me) == 0) {
            if ((i11 & 4) == 0) {
                gVar2 = gVar;
                int i15 = pVarF.s(gVar2) ? 256 : 128;
                i12 |= i15;
            } else {
                gVar2 = gVar;
            }
            i12 |= i15;
        } else {
            gVar2 = gVar;
        }
        if ((i10 & bb.c.g.f32954lc) == 0) {
            if ((i11 & 8) == 0) {
                cardElevation2 = cardElevation;
                int i16 = pVarF.s(cardElevation2) ? 2048 : 1024;
                i12 |= i16;
            } else {
                cardElevation2 = cardElevation;
            }
            i12 |= i16;
        } else {
            cardElevation2 = cardElevation;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            i12 |= pVarF.s(content) ? 16384 : 8192;
        }
        if ((46811 & i12) == 9362 && pVarF.b()) {
            pVarF.l();
            nVar4 = nVar2;
            g2Var4 = g2Var2;
            gVar4 = gVar2;
            cardElevation3 = cardElevation2;
        } else {
            pVarF.W();
            if ((i10 & 1) == 0 || pVarF.o()) {
                androidx.compose.ui.n nVar5 = i13 != 0 ? androidx.compose.ui.n.INSTANCE : nVar2;
                if ((i11 & 2) != 0) {
                    g2VarE = h.f11894a.e(pVarF, 6);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                } else {
                    g2VarE = g2Var2;
                }
                if ((i11 & 4) != 0) {
                    gVarC = h.f11894a.c(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    i12 &= -897;
                } else {
                    gVarC = gVar2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    nVar3 = nVar5;
                    g2Var3 = g2VarE;
                    gVar3 = gVarC;
                    cardElevationD = h.f11894a.d(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                } else {
                    nVar3 = nVar5;
                    g2Var3 = g2VarE;
                    gVar3 = gVarC;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(895940201, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:183)");
                }
                a(nVar3, g2Var3, gVar3, cardElevationD, null, content, pVarF, (i12 & 14) | 24576 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (458752 & (i12 << 3)), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                g2Var4 = g2Var3;
                gVar4 = gVar3;
                cardElevation3 = cardElevationD;
            } else {
                pVarF.l();
                if ((i11 & 2) != 0) {
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                }
                nVar3 = nVar2;
                g2Var3 = g2Var2;
                gVar3 = gVar2;
            }
            cardElevationD = cardElevation2;
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(895940201, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:183)");
            }
            a(nVar3, g2Var3, gVar3, cardElevationD, null, content, pVarF, (i12 & 14) | 24576 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (458752 & (i12 << 3)), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            g2Var4 = g2Var3;
            gVar4 = gVar3;
            cardElevation3 = cardElevationD;
        }
        androidx.compose.runtime.u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$ElevatedCard$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i17) {
                CardKt.c(nVar4, g2Var4, gVar4, cardElevation3, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:109:0x014b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x014d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0150  */
    /* JADX WARN: Code duplicated, block: B:113:0x0153  */
    /* JADX WARN: Code duplicated, block: B:114:0x0157  */
    /* JADX WARN: Code duplicated, block: B:117:0x015d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0169  */
    /* JADX WARN: Code duplicated, block: B:121:0x016f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0189  */
    /* JADX WARN: Code duplicated, block: B:125:0x0191  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:130:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:132:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:136:0x01df  */
    /* JADX WARN: Code duplicated, block: B:139:0x0226  */
    /* JADX WARN: Code duplicated, block: B:144:0x023c  */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00db  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x0101  */
    /* JADX WARN: Code duplicated, block: B:94:0x0115  */
    /* JADX WARN: Code duplicated, block: B:96:0x0122  */
    @w
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void d(@dl.d final yh.a<kotlin.b2> onClick, @dl.e androidx.compose.ui.n nVar, boolean z10, @dl.e g2 g2Var, @dl.e g gVar, @dl.e CardElevation cardElevation, @dl.e androidx.compose.foundation.interaction.g gVar2, @dl.d final yh.q<? super androidx.compose.foundation.layout.o, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.n nVar2;
        int i13;
        boolean z11;
        int i14;
        g2 g2Var2;
        g gVar3;
        CardElevation cardElevationD;
        int i15;
        androidx.compose.foundation.interaction.g gVar4;
        int i16;
        int i17;
        androidx.compose.ui.n nVar3;
        boolean z12;
        g2 g2VarE;
        int i18;
        g gVarC;
        androidx.compose.foundation.interaction.g gVar5;
        CardElevation cardElevation2;
        g gVar6;
        androidx.compose.ui.n nVar4;
        Object objU;
        final androidx.compose.ui.n nVar5;
        final g gVar7;
        final CardElevation cardElevation3;
        final androidx.compose.foundation.interaction.g gVar8;
        final boolean z13;
        final g2 g2Var3;
        androidx.compose.runtime.u1 u1VarH;
        kotlin.jvm.internal.f0.p(onClick, "onClick");
        kotlin.jvm.internal.f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(-1850977784);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(onClick) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 == 0) {
            if ((i10 & 112) == 0) {
                nVar2 = nVar;
                i12 |= pVarF.s(nVar2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & bb.c.b.f30796me) == 0) {
                    z11 = z10;
                    if (pVarF.u(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    if ((i11 & 8) == 0) {
                        g2Var2 = g2Var;
                        int i20 = pVarF.s(g2Var2) ? 2048 : 1024;
                        i12 |= i20;
                    } else {
                        g2Var2 = g2Var;
                    }
                    i12 |= i20;
                } else {
                    g2Var2 = g2Var;
                }
                if ((i10 & 57344) == 0) {
                    if ((i11 & 16) == 0) {
                        gVar3 = gVar;
                        int i21 = pVarF.s(gVar3) ? 16384 : 8192;
                        i12 |= i21;
                    } else {
                        gVar3 = gVar;
                    }
                    i12 |= i21;
                } else {
                    gVar3 = gVar;
                }
                if ((i10 & 458752) == 0) {
                    if ((i11 & 32) == 0) {
                        cardElevationD = cardElevation;
                        int i22 = pVarF.s(cardElevationD) ? 131072 : 65536;
                        i12 |= i22;
                    } else {
                        cardElevationD = cardElevation;
                    }
                    i12 |= i22;
                } else {
                    cardElevationD = cardElevation;
                }
                i15 = i11 & 64;
                if (i15 != 0) {
                    i12 |= 1572864;
                    gVar4 = gVar2;
                } else {
                    gVar4 = gVar2;
                    if ((3670016 & i10) == 0) {
                        if (pVarF.s(gVar4)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i12 |= i16;
                    }
                }
                if ((i11 & 128) != 0) {
                    if ((i10 & 29360128) == 0) {
                        if (pVarF.s(content)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                    }
                    if ((23967451 & i12) == 4793490 || !pVarF.b()) {
                        pVarF.W();
                        if ((i10 & 1) != 0 || pVarF.o()) {
                            if (i19 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                g2VarE = h.f11894a.e(pVarF, 6);
                            } else {
                                g2VarE = g2Var2;
                            }
                            if ((i11 & 16) != 0) {
                                i18 = i12 & (-57345);
                                gVarC = h.f11894a.c(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                            } else {
                                i18 = i12;
                                gVarC = gVar3;
                            }
                            if ((i11 & 32) != 0) {
                                cardElevationD = h.f11894a.d(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                                i12 = i18 & (-458753);
                            } else {
                                i12 = i18;
                            }
                            if (i15 != 0) {
                                pVarF.T(-492369756);
                                objU = pVarF.U();
                                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = androidx.compose.foundation.interaction.f.a();
                                    pVarF.N(objU);
                                }
                                pVarF.c0();
                                gVar5 = (androidx.compose.foundation.interaction.g) objU;
                            } else {
                                gVar5 = gVar2;
                            }
                            cardElevation2 = cardElevationD;
                            gVar6 = gVarC;
                            nVar4 = nVar3;
                        } else {
                            pVarF.l();
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                            }
                            nVar4 = nVar2;
                            z12 = z11;
                            g2VarE = g2Var2;
                            gVar6 = gVar3;
                            cardElevation2 = cardElevationD;
                            gVar5 = gVar4;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1850977784, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:230)");
                        }
                        int i23 = (i12 & 14) | 1572864 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752);
                        int i24 = i12 << 3;
                        b(onClick, nVar4, z12, g2VarE, gVar6, cardElevation2, null, gVar5, content, pVarF, i23 | (i24 & 29360128) | (i24 & 234881024), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar5 = nVar4;
                        gVar7 = gVar6;
                        cardElevation3 = cardElevation2;
                        gVar8 = gVar5;
                        z13 = z12;
                        g2Var3 = g2VarE;
                    } else {
                        pVarF.l();
                        nVar5 = nVar2;
                        z13 = z11;
                        g2Var3 = g2Var2;
                        gVar7 = gVar3;
                        cardElevation3 = cardElevationD;
                        gVar8 = gVar4;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$ElevatedCard$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i25) {
                            CardKt.d(onClick, nVar5, z13, g2Var3, gVar7, cardElevation3, gVar8, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i17 = 12582912;
                i12 |= i17;
                if ((23967451 & i12) == 4793490) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            g2VarE = h.f11894a.e(pVarF, 6);
                        } else {
                            g2VarE = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            gVarC = h.f11894a.c(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        } else {
                            i18 = i12;
                            gVarC = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationD = h.f11894a.d(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                            i12 = i18 & (-458753);
                        } else {
                            i12 = i18;
                        }
                        if (i15 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar5 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar5 = gVar2;
                        }
                        cardElevation2 = cardElevationD;
                        gVar6 = gVarC;
                        nVar4 = nVar3;
                    } else {
                        if (i19 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            g2VarE = h.f11894a.e(pVarF, 6);
                        } else {
                            g2VarE = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            gVarC = h.f11894a.c(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        } else {
                            i18 = i12;
                            gVarC = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationD = h.f11894a.d(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                            i12 = i18 & (-458753);
                        } else {
                            i12 = i18;
                        }
                        if (i15 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar5 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar5 = gVar2;
                        }
                        cardElevation2 = cardElevationD;
                        gVar6 = gVarC;
                        nVar4 = nVar3;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1850977784, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:230)");
                    }
                    int i25 = (i12 & 14) | 1572864 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752);
                    int i26 = i12 << 3;
                    b(onClick, nVar4, z12, g2VarE, gVar6, cardElevation2, null, gVar5, content, pVarF, i25 | (i26 & 29360128) | (i26 & 234881024), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar5 = nVar4;
                    gVar7 = gVar6;
                    cardElevation3 = cardElevation2;
                    gVar8 = gVar5;
                    z13 = z12;
                    g2Var3 = g2VarE;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            g2VarE = h.f11894a.e(pVarF, 6);
                        } else {
                            g2VarE = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            gVarC = h.f11894a.c(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        } else {
                            i18 = i12;
                            gVarC = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationD = h.f11894a.d(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                            i12 = i18 & (-458753);
                        } else {
                            i12 = i18;
                        }
                        if (i15 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar5 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar5 = gVar2;
                        }
                        cardElevation2 = cardElevationD;
                        gVar6 = gVarC;
                        nVar4 = nVar3;
                    } else {
                        if (i19 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            g2VarE = h.f11894a.e(pVarF, 6);
                        } else {
                            g2VarE = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            gVarC = h.f11894a.c(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        } else {
                            i18 = i12;
                            gVarC = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationD = h.f11894a.d(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                            i12 = i18 & (-458753);
                        } else {
                            i12 = i18;
                        }
                        if (i15 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar5 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar5 = gVar2;
                        }
                        cardElevation2 = cardElevationD;
                        gVar6 = gVarC;
                        nVar4 = nVar3;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1850977784, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:230)");
                    }
                    int i27 = (i12 & 14) | 1572864 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752);
                    int i28 = i12 << 3;
                    b(onClick, nVar4, z12, g2VarE, gVar6, cardElevation2, null, gVar5, content, pVarF, i27 | (i28 & 29360128) | (i28 & 234881024), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar5 = nVar4;
                    gVar7 = gVar6;
                    cardElevation3 = cardElevation2;
                    gVar8 = gVar5;
                    z13 = z12;
                    g2Var3 = g2VarE;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$ElevatedCard$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i29) {
                        CardKt.d(onClick, nVar5, z13, g2Var3, gVar7, cardElevation3, gVar8, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.b.f30966u4;
            z11 = z10;
            if ((i10 & bb.c.g.f32954lc) == 0) {
                if ((i11 & 8) == 0) {
                    g2Var2 = g2Var;
                    if (pVarF.s(g2Var2)) {
                    }
                    i12 |= i20;
                } else {
                    g2Var2 = g2Var;
                }
                i12 |= i20;
            } else {
                g2Var2 = g2Var;
            }
            if ((i10 & 57344) == 0) {
                if ((i11 & 16) == 0) {
                    gVar3 = gVar;
                    if (pVarF.s(gVar3)) {
                    }
                    i12 |= i21;
                } else {
                    gVar3 = gVar;
                }
                i12 |= i21;
            } else {
                gVar3 = gVar;
            }
            if ((i10 & 458752) == 0) {
                if ((i11 & 32) == 0) {
                    cardElevationD = cardElevation;
                    if (pVarF.s(cardElevationD)) {
                    }
                    i12 |= i22;
                } else {
                    cardElevationD = cardElevation;
                }
                i12 |= i22;
            } else {
                cardElevationD = cardElevation;
            }
            i15 = i11 & 64;
            if (i15 != 0) {
                i12 |= 1572864;
                gVar4 = gVar2;
            } else {
                gVar4 = gVar2;
                if ((3670016 & i10) == 0) {
                    if (pVarF.s(gVar4)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
            }
            if ((i11 & 128) != 0) {
                if ((i10 & 29360128) == 0) {
                    if (pVarF.s(content)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                }
                if ((23967451 & i12) == 4793490) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            g2VarE = h.f11894a.e(pVarF, 6);
                        } else {
                            g2VarE = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            gVarC = h.f11894a.c(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        } else {
                            i18 = i12;
                            gVarC = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationD = h.f11894a.d(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                            i12 = i18 & (-458753);
                        } else {
                            i12 = i18;
                        }
                        if (i15 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar5 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar5 = gVar2;
                        }
                        cardElevation2 = cardElevationD;
                        gVar6 = gVarC;
                        nVar4 = nVar3;
                    } else {
                        if (i19 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            g2VarE = h.f11894a.e(pVarF, 6);
                        } else {
                            g2VarE = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            gVarC = h.f11894a.c(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        } else {
                            i18 = i12;
                            gVarC = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationD = h.f11894a.d(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                            i12 = i18 & (-458753);
                        } else {
                            i12 = i18;
                        }
                        if (i15 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar5 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar5 = gVar2;
                        }
                        cardElevation2 = cardElevationD;
                        gVar6 = gVarC;
                        nVar4 = nVar3;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1850977784, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:230)");
                    }
                    int i29 = (i12 & 14) | 1572864 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752);
                    int i210 = i12 << 3;
                    b(onClick, nVar4, z12, g2VarE, gVar6, cardElevation2, null, gVar5, content, pVarF, i29 | (i210 & 29360128) | (i210 & 234881024), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar5 = nVar4;
                    gVar7 = gVar6;
                    cardElevation3 = cardElevation2;
                    gVar8 = gVar5;
                    z13 = z12;
                    g2Var3 = g2VarE;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            g2VarE = h.f11894a.e(pVarF, 6);
                        } else {
                            g2VarE = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            gVarC = h.f11894a.c(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        } else {
                            i18 = i12;
                            gVarC = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationD = h.f11894a.d(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                            i12 = i18 & (-458753);
                        } else {
                            i12 = i18;
                        }
                        if (i15 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar5 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar5 = gVar2;
                        }
                        cardElevation2 = cardElevationD;
                        gVar6 = gVarC;
                        nVar4 = nVar3;
                    } else {
                        if (i19 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            g2VarE = h.f11894a.e(pVarF, 6);
                        } else {
                            g2VarE = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            gVarC = h.f11894a.c(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        } else {
                            i18 = i12;
                            gVarC = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationD = h.f11894a.d(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                            i12 = i18 & (-458753);
                        } else {
                            i12 = i18;
                        }
                        if (i15 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar5 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar5 = gVar2;
                        }
                        cardElevation2 = cardElevationD;
                        gVar6 = gVarC;
                        nVar4 = nVar3;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1850977784, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:230)");
                    }
                    int i211 = (i12 & 14) | 1572864 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752);
                    int i212 = i12 << 3;
                    b(onClick, nVar4, z12, g2VarE, gVar6, cardElevation2, null, gVar5, content, pVarF, i211 | (i212 & 29360128) | (i212 & 234881024), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar5 = nVar4;
                    gVar7 = gVar6;
                    cardElevation3 = cardElevation2;
                    gVar8 = gVar5;
                    z13 = z12;
                    g2Var3 = g2VarE;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$ElevatedCard$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i213) {
                        CardKt.d(onClick, nVar5, z13, g2Var3, gVar7, cardElevation3, gVar8, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i17 = 12582912;
            i12 |= i17;
            if ((23967451 & i12) == 4793490) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        g2VarE = h.f11894a.e(pVarF, 6);
                    } else {
                        g2VarE = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        gVarC = h.f11894a.c(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    } else {
                        i18 = i12;
                        gVarC = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationD = h.f11894a.d(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        i12 = i18 & (-458753);
                    } else {
                        i12 = i18;
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar5 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar5 = gVar2;
                    }
                    cardElevation2 = cardElevationD;
                    gVar6 = gVarC;
                    nVar4 = nVar3;
                } else {
                    if (i19 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        g2VarE = h.f11894a.e(pVarF, 6);
                    } else {
                        g2VarE = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        gVarC = h.f11894a.c(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    } else {
                        i18 = i12;
                        gVarC = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationD = h.f11894a.d(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        i12 = i18 & (-458753);
                    } else {
                        i12 = i18;
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar5 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar5 = gVar2;
                    }
                    cardElevation2 = cardElevationD;
                    gVar6 = gVarC;
                    nVar4 = nVar3;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1850977784, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:230)");
                }
                int i213 = (i12 & 14) | 1572864 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752);
                int i214 = i12 << 3;
                b(onClick, nVar4, z12, g2VarE, gVar6, cardElevation2, null, gVar5, content, pVarF, i213 | (i214 & 29360128) | (i214 & 234881024), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar5 = nVar4;
                gVar7 = gVar6;
                cardElevation3 = cardElevation2;
                gVar8 = gVar5;
                z13 = z12;
                g2Var3 = g2VarE;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        g2VarE = h.f11894a.e(pVarF, 6);
                    } else {
                        g2VarE = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        gVarC = h.f11894a.c(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    } else {
                        i18 = i12;
                        gVarC = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationD = h.f11894a.d(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        i12 = i18 & (-458753);
                    } else {
                        i12 = i18;
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar5 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar5 = gVar2;
                    }
                    cardElevation2 = cardElevationD;
                    gVar6 = gVarC;
                    nVar4 = nVar3;
                } else {
                    if (i19 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        g2VarE = h.f11894a.e(pVarF, 6);
                    } else {
                        g2VarE = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        gVarC = h.f11894a.c(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    } else {
                        i18 = i12;
                        gVarC = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationD = h.f11894a.d(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        i12 = i18 & (-458753);
                    } else {
                        i12 = i18;
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar5 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar5 = gVar2;
                    }
                    cardElevation2 = cardElevationD;
                    gVar6 = gVarC;
                    nVar4 = nVar3;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1850977784, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:230)");
                }
                int i215 = (i12 & 14) | 1572864 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752);
                int i216 = i12 << 3;
                b(onClick, nVar4, z12, g2VarE, gVar6, cardElevation2, null, gVar5, content, pVarF, i215 | (i216 & 29360128) | (i216 & 234881024), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar5 = nVar4;
                gVar7 = gVar6;
                cardElevation3 = cardElevation2;
                gVar8 = gVar5;
                z13 = z12;
                g2Var3 = g2VarE;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$ElevatedCard$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i217) {
                    CardKt.d(onClick, nVar5, z13, g2Var3, gVar7, cardElevation3, gVar8, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= 48;
        nVar2 = nVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & bb.c.b.f30796me) == 0) {
                z11 = z10;
                if (pVarF.u(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & bb.c.g.f32954lc) == 0) {
                if ((i11 & 8) == 0) {
                    g2Var2 = g2Var;
                    if (pVarF.s(g2Var2)) {
                    }
                    i12 |= i20;
                } else {
                    g2Var2 = g2Var;
                }
                i12 |= i20;
            } else {
                g2Var2 = g2Var;
            }
            if ((i10 & 57344) == 0) {
                if ((i11 & 16) == 0) {
                    gVar3 = gVar;
                    if (pVarF.s(gVar3)) {
                    }
                    i12 |= i21;
                } else {
                    gVar3 = gVar;
                }
                i12 |= i21;
            } else {
                gVar3 = gVar;
            }
            if ((i10 & 458752) == 0) {
                if ((i11 & 32) == 0) {
                    cardElevationD = cardElevation;
                    if (pVarF.s(cardElevationD)) {
                    }
                    i12 |= i22;
                } else {
                    cardElevationD = cardElevation;
                }
                i12 |= i22;
            } else {
                cardElevationD = cardElevation;
            }
            i15 = i11 & 64;
            if (i15 != 0) {
                i12 |= 1572864;
                gVar4 = gVar2;
            } else {
                gVar4 = gVar2;
                if ((3670016 & i10) == 0) {
                    if (pVarF.s(gVar4)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
            }
            if ((i11 & 128) != 0) {
                if ((i10 & 29360128) == 0) {
                    if (pVarF.s(content)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                }
                if ((23967451 & i12) == 4793490) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            g2VarE = h.f11894a.e(pVarF, 6);
                        } else {
                            g2VarE = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            gVarC = h.f11894a.c(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        } else {
                            i18 = i12;
                            gVarC = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationD = h.f11894a.d(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                            i12 = i18 & (-458753);
                        } else {
                            i12 = i18;
                        }
                        if (i15 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar5 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar5 = gVar2;
                        }
                        cardElevation2 = cardElevationD;
                        gVar6 = gVarC;
                        nVar4 = nVar3;
                    } else {
                        if (i19 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            g2VarE = h.f11894a.e(pVarF, 6);
                        } else {
                            g2VarE = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            gVarC = h.f11894a.c(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        } else {
                            i18 = i12;
                            gVarC = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationD = h.f11894a.d(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                            i12 = i18 & (-458753);
                        } else {
                            i12 = i18;
                        }
                        if (i15 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar5 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar5 = gVar2;
                        }
                        cardElevation2 = cardElevationD;
                        gVar6 = gVarC;
                        nVar4 = nVar3;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1850977784, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:230)");
                    }
                    int i217 = (i12 & 14) | 1572864 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752);
                    int i218 = i12 << 3;
                    b(onClick, nVar4, z12, g2VarE, gVar6, cardElevation2, null, gVar5, content, pVarF, i217 | (i218 & 29360128) | (i218 & 234881024), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar5 = nVar4;
                    gVar7 = gVar6;
                    cardElevation3 = cardElevation2;
                    gVar8 = gVar5;
                    z13 = z12;
                    g2Var3 = g2VarE;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            g2VarE = h.f11894a.e(pVarF, 6);
                        } else {
                            g2VarE = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            gVarC = h.f11894a.c(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        } else {
                            i18 = i12;
                            gVarC = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationD = h.f11894a.d(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                            i12 = i18 & (-458753);
                        } else {
                            i12 = i18;
                        }
                        if (i15 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar5 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar5 = gVar2;
                        }
                        cardElevation2 = cardElevationD;
                        gVar6 = gVarC;
                        nVar4 = nVar3;
                    } else {
                        if (i19 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            g2VarE = h.f11894a.e(pVarF, 6);
                        } else {
                            g2VarE = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            gVarC = h.f11894a.c(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        } else {
                            i18 = i12;
                            gVarC = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationD = h.f11894a.d(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                            i12 = i18 & (-458753);
                        } else {
                            i12 = i18;
                        }
                        if (i15 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar5 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar5 = gVar2;
                        }
                        cardElevation2 = cardElevationD;
                        gVar6 = gVarC;
                        nVar4 = nVar3;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1850977784, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:230)");
                    }
                    int i219 = (i12 & 14) | 1572864 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752);
                    int i2110 = i12 << 3;
                    b(onClick, nVar4, z12, g2VarE, gVar6, cardElevation2, null, gVar5, content, pVarF, i219 | (i2110 & 29360128) | (i2110 & 234881024), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar5 = nVar4;
                    gVar7 = gVar6;
                    cardElevation3 = cardElevation2;
                    gVar8 = gVar5;
                    z13 = z12;
                    g2Var3 = g2VarE;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$ElevatedCard$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2111) {
                        CardKt.d(onClick, nVar5, z13, g2Var3, gVar7, cardElevation3, gVar8, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i17 = 12582912;
            i12 |= i17;
            if ((23967451 & i12) == 4793490) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        g2VarE = h.f11894a.e(pVarF, 6);
                    } else {
                        g2VarE = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        gVarC = h.f11894a.c(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    } else {
                        i18 = i12;
                        gVarC = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationD = h.f11894a.d(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        i12 = i18 & (-458753);
                    } else {
                        i12 = i18;
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar5 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar5 = gVar2;
                    }
                    cardElevation2 = cardElevationD;
                    gVar6 = gVarC;
                    nVar4 = nVar3;
                } else {
                    if (i19 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        g2VarE = h.f11894a.e(pVarF, 6);
                    } else {
                        g2VarE = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        gVarC = h.f11894a.c(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    } else {
                        i18 = i12;
                        gVarC = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationD = h.f11894a.d(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        i12 = i18 & (-458753);
                    } else {
                        i12 = i18;
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar5 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar5 = gVar2;
                    }
                    cardElevation2 = cardElevationD;
                    gVar6 = gVarC;
                    nVar4 = nVar3;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1850977784, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:230)");
                }
                int i2111 = (i12 & 14) | 1572864 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752);
                int i2112 = i12 << 3;
                b(onClick, nVar4, z12, g2VarE, gVar6, cardElevation2, null, gVar5, content, pVarF, i2111 | (i2112 & 29360128) | (i2112 & 234881024), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar5 = nVar4;
                gVar7 = gVar6;
                cardElevation3 = cardElevation2;
                gVar8 = gVar5;
                z13 = z12;
                g2Var3 = g2VarE;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        g2VarE = h.f11894a.e(pVarF, 6);
                    } else {
                        g2VarE = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        gVarC = h.f11894a.c(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    } else {
                        i18 = i12;
                        gVarC = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationD = h.f11894a.d(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        i12 = i18 & (-458753);
                    } else {
                        i12 = i18;
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar5 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar5 = gVar2;
                    }
                    cardElevation2 = cardElevationD;
                    gVar6 = gVarC;
                    nVar4 = nVar3;
                } else {
                    if (i19 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        g2VarE = h.f11894a.e(pVarF, 6);
                    } else {
                        g2VarE = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        gVarC = h.f11894a.c(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    } else {
                        i18 = i12;
                        gVarC = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationD = h.f11894a.d(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        i12 = i18 & (-458753);
                    } else {
                        i12 = i18;
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar5 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar5 = gVar2;
                    }
                    cardElevation2 = cardElevationD;
                    gVar6 = gVarC;
                    nVar4 = nVar3;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1850977784, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:230)");
                }
                int i2113 = (i12 & 14) | 1572864 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752);
                int i2114 = i12 << 3;
                b(onClick, nVar4, z12, g2VarE, gVar6, cardElevation2, null, gVar5, content, pVarF, i2113 | (i2114 & 29360128) | (i2114 & 234881024), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar5 = nVar4;
                gVar7 = gVar6;
                cardElevation3 = cardElevation2;
                gVar8 = gVar5;
                z13 = z12;
                g2Var3 = g2VarE;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$ElevatedCard$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2115) {
                    CardKt.d(onClick, nVar5, z13, g2Var3, gVar7, cardElevation3, gVar8, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= bb.c.b.f30966u4;
        z11 = z10;
        if ((i10 & bb.c.g.f32954lc) == 0) {
            if ((i11 & 8) == 0) {
                g2Var2 = g2Var;
                if (pVarF.s(g2Var2)) {
                }
                i12 |= i20;
            } else {
                g2Var2 = g2Var;
            }
            i12 |= i20;
        } else {
            g2Var2 = g2Var;
        }
        if ((i10 & 57344) == 0) {
            if ((i11 & 16) == 0) {
                gVar3 = gVar;
                if (pVarF.s(gVar3)) {
                }
                i12 |= i21;
            } else {
                gVar3 = gVar;
            }
            i12 |= i21;
        } else {
            gVar3 = gVar;
        }
        if ((i10 & 458752) == 0) {
            if ((i11 & 32) == 0) {
                cardElevationD = cardElevation;
                if (pVarF.s(cardElevationD)) {
                }
                i12 |= i22;
            } else {
                cardElevationD = cardElevation;
            }
            i12 |= i22;
        } else {
            cardElevationD = cardElevation;
        }
        i15 = i11 & 64;
        if (i15 != 0) {
            i12 |= 1572864;
            gVar4 = gVar2;
        } else {
            gVar4 = gVar2;
            if ((3670016 & i10) == 0) {
                if (pVarF.s(gVar4)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i12 |= i16;
            }
        }
        if ((i11 & 128) != 0) {
            if ((i10 & 29360128) == 0) {
                if (pVarF.s(content)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
            }
            if ((23967451 & i12) == 4793490) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        g2VarE = h.f11894a.e(pVarF, 6);
                    } else {
                        g2VarE = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        gVarC = h.f11894a.c(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    } else {
                        i18 = i12;
                        gVarC = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationD = h.f11894a.d(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        i12 = i18 & (-458753);
                    } else {
                        i12 = i18;
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar5 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar5 = gVar2;
                    }
                    cardElevation2 = cardElevationD;
                    gVar6 = gVarC;
                    nVar4 = nVar3;
                } else {
                    if (i19 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        g2VarE = h.f11894a.e(pVarF, 6);
                    } else {
                        g2VarE = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        gVarC = h.f11894a.c(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    } else {
                        i18 = i12;
                        gVarC = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationD = h.f11894a.d(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        i12 = i18 & (-458753);
                    } else {
                        i12 = i18;
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar5 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar5 = gVar2;
                    }
                    cardElevation2 = cardElevationD;
                    gVar6 = gVarC;
                    nVar4 = nVar3;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1850977784, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:230)");
                }
                int i2115 = (i12 & 14) | 1572864 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752);
                int i2116 = i12 << 3;
                b(onClick, nVar4, z12, g2VarE, gVar6, cardElevation2, null, gVar5, content, pVarF, i2115 | (i2116 & 29360128) | (i2116 & 234881024), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar5 = nVar4;
                gVar7 = gVar6;
                cardElevation3 = cardElevation2;
                gVar8 = gVar5;
                z13 = z12;
                g2Var3 = g2VarE;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        g2VarE = h.f11894a.e(pVarF, 6);
                    } else {
                        g2VarE = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        gVarC = h.f11894a.c(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    } else {
                        i18 = i12;
                        gVarC = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationD = h.f11894a.d(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        i12 = i18 & (-458753);
                    } else {
                        i12 = i18;
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar5 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar5 = gVar2;
                    }
                    cardElevation2 = cardElevationD;
                    gVar6 = gVarC;
                    nVar4 = nVar3;
                } else {
                    if (i19 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        g2VarE = h.f11894a.e(pVarF, 6);
                    } else {
                        g2VarE = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        gVarC = h.f11894a.c(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    } else {
                        i18 = i12;
                        gVarC = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationD = h.f11894a.d(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        i12 = i18 & (-458753);
                    } else {
                        i12 = i18;
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar5 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar5 = gVar2;
                    }
                    cardElevation2 = cardElevationD;
                    gVar6 = gVarC;
                    nVar4 = nVar3;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1850977784, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:230)");
                }
                int i2117 = (i12 & 14) | 1572864 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752);
                int i2118 = i12 << 3;
                b(onClick, nVar4, z12, g2VarE, gVar6, cardElevation2, null, gVar5, content, pVarF, i2117 | (i2118 & 29360128) | (i2118 & 234881024), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar5 = nVar4;
                gVar7 = gVar6;
                cardElevation3 = cardElevation2;
                gVar8 = gVar5;
                z13 = z12;
                g2Var3 = g2VarE;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$ElevatedCard$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2119) {
                    CardKt.d(onClick, nVar5, z13, g2Var3, gVar7, cardElevation3, gVar8, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i17 = 12582912;
        i12 |= i17;
        if ((23967451 & i12) == 4793490) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    g2VarE = h.f11894a.e(pVarF, 6);
                } else {
                    g2VarE = g2Var2;
                }
                if ((i11 & 16) != 0) {
                    i18 = i12 & (-57345);
                    gVarC = h.f11894a.c(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                } else {
                    i18 = i12;
                    gVarC = gVar3;
                }
                if ((i11 & 32) != 0) {
                    cardElevationD = h.f11894a.d(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                    i12 = i18 & (-458753);
                } else {
                    i12 = i18;
                }
                if (i15 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar5 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar5 = gVar2;
                }
                cardElevation2 = cardElevationD;
                gVar6 = gVarC;
                nVar4 = nVar3;
            } else {
                if (i19 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    g2VarE = h.f11894a.e(pVarF, 6);
                } else {
                    g2VarE = g2Var2;
                }
                if ((i11 & 16) != 0) {
                    i18 = i12 & (-57345);
                    gVarC = h.f11894a.c(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                } else {
                    i18 = i12;
                    gVarC = gVar3;
                }
                if ((i11 & 32) != 0) {
                    cardElevationD = h.f11894a.d(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                    i12 = i18 & (-458753);
                } else {
                    i12 = i18;
                }
                if (i15 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar5 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar5 = gVar2;
                }
                cardElevation2 = cardElevationD;
                gVar6 = gVarC;
                nVar4 = nVar3;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1850977784, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:230)");
            }
            int i2119 = (i12 & 14) | 1572864 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752);
            int i21110 = i12 << 3;
            b(onClick, nVar4, z12, g2VarE, gVar6, cardElevation2, null, gVar5, content, pVarF, i2119 | (i21110 & 29360128) | (i21110 & 234881024), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar5 = nVar4;
            gVar7 = gVar6;
            cardElevation3 = cardElevation2;
            gVar8 = gVar5;
            z13 = z12;
            g2Var3 = g2VarE;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    g2VarE = h.f11894a.e(pVarF, 6);
                } else {
                    g2VarE = g2Var2;
                }
                if ((i11 & 16) != 0) {
                    i18 = i12 & (-57345);
                    gVarC = h.f11894a.c(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                } else {
                    i18 = i12;
                    gVarC = gVar3;
                }
                if ((i11 & 32) != 0) {
                    cardElevationD = h.f11894a.d(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                    i12 = i18 & (-458753);
                } else {
                    i12 = i18;
                }
                if (i15 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar5 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar5 = gVar2;
                }
                cardElevation2 = cardElevationD;
                gVar6 = gVarC;
                nVar4 = nVar3;
            } else {
                if (i19 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    g2VarE = h.f11894a.e(pVarF, 6);
                } else {
                    g2VarE = g2Var2;
                }
                if ((i11 & 16) != 0) {
                    i18 = i12 & (-57345);
                    gVarC = h.f11894a.c(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                } else {
                    i18 = i12;
                    gVarC = gVar3;
                }
                if ((i11 & 32) != 0) {
                    cardElevationD = h.f11894a.d(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                    i12 = i18 & (-458753);
                } else {
                    i12 = i18;
                }
                if (i15 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar5 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar5 = gVar2;
                }
                cardElevation2 = cardElevationD;
                gVar6 = gVarC;
                nVar4 = nVar3;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1850977784, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:230)");
            }
            int i21111 = (i12 & 14) | 1572864 | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752);
            int i21112 = i12 << 3;
            b(onClick, nVar4, z12, g2VarE, gVar6, cardElevation2, null, gVar5, content, pVarF, i21111 | (i21112 & 29360128) | (i21112 & 234881024), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar5 = nVar4;
            gVar7 = gVar6;
            cardElevation3 = cardElevation2;
            gVar8 = gVar5;
            z13 = z12;
            g2Var3 = g2VarE;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$ElevatedCard$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21113) {
                CardKt.d(onClick, nVar5, z13, g2Var3, gVar7, cardElevation3, gVar8, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0137  */
    /* JADX WARN: Code duplicated, block: B:103:0x013c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0153  */
    /* JADX WARN: Code duplicated, block: B:107:0x0158  */
    /* JADX WARN: Code duplicated, block: B:108:0x016a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0179  */
    /* JADX WARN: Code duplicated, block: B:114:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:90:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0108  */
    /* JADX WARN: Code duplicated, block: B:92:0x010b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0110  */
    /* JADX WARN: Code duplicated, block: B:96:0x011a  */
    /* JADX WARN: Code duplicated, block: B:99:0x011f  */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void e(@dl.e androidx.compose.ui.n nVar, @dl.e g2 g2Var, @dl.e g gVar, @dl.e CardElevation cardElevation, @dl.e BorderStroke borderStroke, @dl.d final yh.q<? super androidx.compose.foundation.layout.o, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        androidx.compose.ui.n nVar2;
        int i12;
        g2 g2Var2;
        g gVar2;
        CardElevation cardElevation2;
        BorderStroke borderStroke2;
        int i13;
        androidx.compose.ui.n nVar3;
        g2 g2VarF;
        g gVarI;
        CardElevation cardElevationJ;
        BorderStroke borderStrokeH;
        androidx.compose.ui.n nVar4;
        g2 g2Var3;
        g gVar3;
        CardElevation cardElevation3;
        final androidx.compose.ui.n nVar5;
        final g2 g2Var4;
        final g gVar4;
        final CardElevation cardElevation4;
        final BorderStroke borderStroke3;
        androidx.compose.runtime.u1 u1VarH;
        kotlin.jvm.internal.f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(740336179);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            nVar2 = nVar;
        } else if ((i10 & 14) == 0) {
            nVar2 = nVar;
            i12 = (pVarF.s(nVar2) ? 4 : 2) | i10;
        } else {
            nVar2 = nVar;
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                g2Var2 = g2Var;
                int i15 = pVarF.s(g2Var2) ? 32 : 16;
                i12 |= i15;
            } else {
                g2Var2 = g2Var;
            }
            i12 |= i15;
        } else {
            g2Var2 = g2Var;
        }
        if ((i10 & bb.c.b.f30796me) == 0) {
            if ((i11 & 4) == 0) {
                gVar2 = gVar;
                int i16 = pVarF.s(gVar2) ? 256 : 128;
                i12 |= i16;
            } else {
                gVar2 = gVar;
            }
            i12 |= i16;
        } else {
            gVar2 = gVar;
        }
        if ((i10 & bb.c.g.f32954lc) == 0) {
            if ((i11 & 8) == 0) {
                cardElevation2 = cardElevation;
                int i17 = pVarF.s(cardElevation2) ? 2048 : 1024;
                i12 |= i17;
            } else {
                cardElevation2 = cardElevation;
            }
            i12 |= i17;
        } else {
            cardElevation2 = cardElevation;
        }
        if ((i10 & 57344) == 0) {
            borderStroke2 = borderStroke;
            i12 |= ((i11 & 16) == 0 && pVarF.s(borderStroke2)) ? 16384 : 8192;
        } else {
            borderStroke2 = borderStroke;
        }
        if ((i11 & 32) == 0) {
            if ((i10 & 458752) == 0) {
                i13 = pVarF.s(content) ? 131072 : 65536;
            }
            if ((374491 & i12) == 74898 || !pVarF.b()) {
                pVarF.W();
                if ((i10 & 1) != 0 || pVarF.o()) {
                    if (i14 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if ((i11 & 2) != 0) {
                        g2VarF = h.f11894a.f(pVarF, 6);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    } else {
                        g2VarF = g2Var2;
                    }
                    if ((i11 & 4) != 0) {
                        gVarI = h.f11894a.i(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        i12 &= -897;
                    } else {
                        gVarI = gVar2;
                    }
                    if ((i11 & 8) != 0) {
                        cardElevationJ = h.f11894a.j(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        cardElevationJ = cardElevation2;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        nVar4 = nVar3;
                        g2Var3 = g2VarF;
                        gVar3 = gVarI;
                        cardElevation3 = cardElevationJ;
                        borderStrokeH = h.f11894a.h(false, pVarF, 48, 1);
                    } else {
                        borderStrokeH = borderStroke;
                        nVar4 = nVar3;
                        g2Var3 = g2VarF;
                        gVar3 = gVarI;
                        cardElevation3 = cardElevationJ;
                    }
                } else {
                    pVarF.l();
                    if ((i11 & 2) != 0) {
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                    }
                    nVar4 = nVar2;
                    g2Var3 = g2Var2;
                    gVar3 = gVar2;
                    borderStrokeH = borderStroke2;
                    cardElevation3 = cardElevation2;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(740336179, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:277)");
                }
                a(nVar4, g2Var3, gVar3, cardElevation3, borderStrokeH, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar5 = nVar4;
                g2Var4 = g2Var3;
                gVar4 = gVar3;
                cardElevation4 = cardElevation3;
                borderStroke3 = borderStrokeH;
            } else {
                pVarF.l();
                nVar5 = nVar2;
                g2Var4 = g2Var2;
                gVar4 = gVar2;
                cardElevation4 = cardElevation2;
                borderStroke3 = borderStroke2;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$OutlinedCard$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i18) {
                    CardKt.e(nVar5, g2Var4, gVar4, cardElevation4, borderStroke3, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i13 = androidx.profileinstaller.o.c.f26824k;
        i12 |= i13;
        if ((374491 & i12) == 74898) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if ((i11 & 2) != 0) {
                    g2VarF = h.f11894a.f(pVarF, 6);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                } else {
                    g2VarF = g2Var2;
                }
                if ((i11 & 4) != 0) {
                    gVarI = h.f11894a.i(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    i12 &= -897;
                } else {
                    gVarI = gVar2;
                }
                if ((i11 & 8) != 0) {
                    cardElevationJ = h.f11894a.j(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                    i12 &= -7169;
                } else {
                    cardElevationJ = cardElevation2;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    nVar4 = nVar3;
                    g2Var3 = g2VarF;
                    gVar3 = gVarI;
                    cardElevation3 = cardElevationJ;
                    borderStrokeH = h.f11894a.h(false, pVarF, 48, 1);
                } else {
                    borderStrokeH = borderStroke;
                    nVar4 = nVar3;
                    g2Var3 = g2VarF;
                    gVar3 = gVarI;
                    cardElevation3 = cardElevationJ;
                }
            } else {
                if (i14 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if ((i11 & 2) != 0) {
                    g2VarF = h.f11894a.f(pVarF, 6);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                } else {
                    g2VarF = g2Var2;
                }
                if ((i11 & 4) != 0) {
                    gVarI = h.f11894a.i(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    i12 &= -897;
                } else {
                    gVarI = gVar2;
                }
                if ((i11 & 8) != 0) {
                    cardElevationJ = h.f11894a.j(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                    i12 &= -7169;
                } else {
                    cardElevationJ = cardElevation2;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    nVar4 = nVar3;
                    g2Var3 = g2VarF;
                    gVar3 = gVarI;
                    cardElevation3 = cardElevationJ;
                    borderStrokeH = h.f11894a.h(false, pVarF, 48, 1);
                } else {
                    borderStrokeH = borderStroke;
                    nVar4 = nVar3;
                    g2Var3 = g2VarF;
                    gVar3 = gVarI;
                    cardElevation3 = cardElevationJ;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(740336179, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:277)");
            }
            a(nVar4, g2Var3, gVar3, cardElevation3, borderStrokeH, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar5 = nVar4;
            g2Var4 = g2Var3;
            gVar4 = gVar3;
            cardElevation4 = cardElevation3;
            borderStroke3 = borderStrokeH;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if ((i11 & 2) != 0) {
                    g2VarF = h.f11894a.f(pVarF, 6);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                } else {
                    g2VarF = g2Var2;
                }
                if ((i11 & 4) != 0) {
                    gVarI = h.f11894a.i(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    i12 &= -897;
                } else {
                    gVarI = gVar2;
                }
                if ((i11 & 8) != 0) {
                    cardElevationJ = h.f11894a.j(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                    i12 &= -7169;
                } else {
                    cardElevationJ = cardElevation2;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    nVar4 = nVar3;
                    g2Var3 = g2VarF;
                    gVar3 = gVarI;
                    cardElevation3 = cardElevationJ;
                    borderStrokeH = h.f11894a.h(false, pVarF, 48, 1);
                } else {
                    borderStrokeH = borderStroke;
                    nVar4 = nVar3;
                    g2Var3 = g2VarF;
                    gVar3 = gVarI;
                    cardElevation3 = cardElevationJ;
                }
            } else {
                if (i14 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if ((i11 & 2) != 0) {
                    g2VarF = h.f11894a.f(pVarF, 6);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                } else {
                    g2VarF = g2Var2;
                }
                if ((i11 & 4) != 0) {
                    gVarI = h.f11894a.i(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    i12 &= -897;
                } else {
                    gVarI = gVar2;
                }
                if ((i11 & 8) != 0) {
                    cardElevationJ = h.f11894a.j(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                    i12 &= -7169;
                } else {
                    cardElevationJ = cardElevation2;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    nVar4 = nVar3;
                    g2Var3 = g2VarF;
                    gVar3 = gVarI;
                    cardElevation3 = cardElevationJ;
                    borderStrokeH = h.f11894a.h(false, pVarF, 48, 1);
                } else {
                    borderStrokeH = borderStroke;
                    nVar4 = nVar3;
                    g2Var3 = g2VarF;
                    gVar3 = gVarI;
                    cardElevation3 = cardElevationJ;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(740336179, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:277)");
            }
            a(nVar4, g2Var3, gVar3, cardElevation3, borderStrokeH, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar5 = nVar4;
            g2Var4 = g2Var3;
            gVar4 = gVar3;
            cardElevation4 = cardElevation3;
            borderStroke3 = borderStrokeH;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$OutlinedCard$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i18) {
                CardKt.e(nVar5, g2Var4, gVar4, cardElevation4, borderStroke3, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0135  */
    /* JADX WARN: Code duplicated, block: B:106:0x013c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0174 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x0176  */
    /* JADX WARN: Code duplicated, block: B:124:0x0179  */
    /* JADX WARN: Code duplicated, block: B:126:0x017d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0183  */
    /* JADX WARN: Code duplicated, block: B:130:0x018f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0195  */
    /* JADX WARN: Code duplicated, block: B:134:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:138:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:141:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:144:0x0202  */
    /* JADX WARN: Code duplicated, block: B:146:0x0214  */
    /* JADX WARN: Code duplicated, block: B:148:0x0225  */
    /* JADX WARN: Code duplicated, block: B:152:0x023c  */
    /* JADX WARN: Code duplicated, block: B:155:0x0282  */
    /* JADX WARN: Code duplicated, block: B:160:0x029a  */
    /* JADX WARN: Code duplicated, block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:90:0x0101  */
    /* JADX WARN: Code duplicated, block: B:92:0x0105  */
    /* JADX WARN: Code duplicated, block: B:94:0x0109  */
    /* JADX WARN: Code duplicated, block: B:96:0x010f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0112  */
    @w
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void f(@dl.d final yh.a<kotlin.b2> onClick, @dl.e androidx.compose.ui.n nVar, boolean z10, @dl.e g2 g2Var, @dl.e g gVar, @dl.e CardElevation cardElevation, @dl.e BorderStroke borderStroke, @dl.e androidx.compose.foundation.interaction.g gVar2, @dl.d final yh.q<? super androidx.compose.foundation.layout.o, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        int i13;
        boolean z11;
        int i14;
        g2 g2Var2;
        g gVar3;
        CardElevation cardElevationJ;
        BorderStroke borderStroke2;
        int i15;
        int i16;
        int i17;
        androidx.compose.ui.n nVar2;
        g2 g2VarF;
        int i18;
        g gVarI;
        boolean z12;
        BorderStroke borderStrokeH;
        androidx.compose.foundation.interaction.g gVar4;
        CardElevation cardElevation2;
        g gVar5;
        androidx.compose.ui.n nVar3;
        boolean z13;
        Object objU;
        final androidx.compose.ui.n nVar4;
        final boolean z14;
        final g gVar6;
        final CardElevation cardElevation3;
        final BorderStroke borderStroke3;
        final androidx.compose.foundation.interaction.g gVar7;
        final g2 g2Var3;
        androidx.compose.runtime.u1 u1VarH;
        int i19;
        kotlin.jvm.internal.f0.p(onClick, "onClick");
        kotlin.jvm.internal.f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(-727137250);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(onClick) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & 112) == 0) {
                i12 |= pVarF.s(nVar) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & bb.c.b.f30796me) == 0) {
                    z11 = z10;
                    if (pVarF.u(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    if ((i11 & 8) == 0) {
                        g2Var2 = g2Var;
                        int i21 = pVarF.s(g2Var2) ? 2048 : 1024;
                        i12 |= i21;
                    } else {
                        g2Var2 = g2Var;
                    }
                    i12 |= i21;
                } else {
                    g2Var2 = g2Var;
                }
                if ((i10 & 57344) == 0) {
                    if ((i11 & 16) == 0) {
                        gVar3 = gVar;
                        int i22 = pVarF.s(gVar3) ? 16384 : 8192;
                        i12 |= i22;
                    } else {
                        gVar3 = gVar;
                    }
                    i12 |= i22;
                } else {
                    gVar3 = gVar;
                }
                if ((i10 & 458752) == 0) {
                    if ((i11 & 32) == 0) {
                        cardElevationJ = cardElevation;
                        int i23 = pVarF.s(cardElevationJ) ? 131072 : 65536;
                        i12 |= i23;
                    } else {
                        cardElevationJ = cardElevation;
                    }
                    i12 |= i23;
                } else {
                    cardElevationJ = cardElevation;
                }
                if ((i10 & 3670016) == 0) {
                    borderStroke2 = borderStroke;
                    if ((i11 & 64) == 0 || !pVarF.s(borderStroke2)) {
                        i19 = 524288;
                    } else {
                        i19 = 1048576;
                    }
                    i12 |= i19;
                } else {
                    borderStroke2 = borderStroke;
                }
                i15 = i11 & 128;
                if (i15 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (pVarF.s(gVar2)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i12 |= i16;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 234881024) == 0) {
                        if (pVarF.s(content)) {
                            i17 = 67108864;
                        } else {
                            i17 = 33554432;
                        }
                    }
                    if ((191739611 & i12) == 38347922 || !pVarF.b()) {
                        pVarF.W();
                        if ((i10 & 1) != 0 || pVarF.o()) {
                            if (i20 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                g2VarF = h.f11894a.f(pVarF, 6);
                            } else {
                                g2VarF = g2Var2;
                            }
                            if ((i11 & 16) != 0) {
                                i18 = i12 & (-57345);
                                gVarI = h.f11894a.i(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                            } else {
                                i18 = i12;
                                gVarI = gVar3;
                            }
                            if ((i11 & 32) != 0) {
                                i18 &= -458753;
                                cardElevationJ = h.f11894a.j(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                            }
                            if ((i11 & 64) != 0) {
                                borderStrokeH = h.f11894a.h(z12, pVarF, ((i18 >> 6) & 14) | 48, 0);
                                i18 &= -3670017;
                            } else {
                                borderStrokeH = borderStroke;
                            }
                            if (i15 != 0) {
                                z12 = z11;
                                pVarF.T(-492369756);
                                objU = pVarF.U();
                                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    z12 = z11;
                                    objU = androidx.compose.foundation.interaction.f.a();
                                    pVarF.N(objU);
                                }
                                z12 = z11;
                                pVarF.c0();
                                gVar4 = (androidx.compose.foundation.interaction.g) objU;
                            } else {
                                z12 = z11;
                                z12 = z11;
                                gVar4 = gVar2;
                            }
                            cardElevation2 = cardElevationJ;
                            gVar5 = gVarI;
                            i12 = i18;
                            nVar3 = nVar2;
                            z13 = z12;
                        } else {
                            pVarF.l();
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                            }
                            nVar3 = nVar;
                            gVar4 = gVar2;
                            z13 = z11;
                            g2VarF = g2Var2;
                            gVar5 = gVar3;
                            cardElevation2 = cardElevationJ;
                            borderStrokeH = borderStroke2;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-727137250, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:326)");
                        }
                        b(onClick, nVar3, z13, g2VarF, gVar5, cardElevation2, borderStrokeH, gVar4, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        z14 = z13;
                        gVar6 = gVar5;
                        cardElevation3 = cardElevation2;
                        borderStroke3 = borderStrokeH;
                        gVar7 = gVar4;
                        g2Var3 = g2VarF;
                    } else {
                        pVarF.l();
                        nVar4 = nVar;
                        z14 = z11;
                        g2Var3 = g2Var2;
                        gVar6 = gVar3;
                        cardElevation3 = cardElevationJ;
                        borderStroke3 = borderStroke2;
                        gVar7 = gVar2;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$OutlinedCard$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i24) {
                            CardKt.f(onClick, nVar4, z14, g2Var3, gVar6, cardElevation3, borderStroke3, gVar7, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i17 = 100663296;
                i12 |= i17;
                if ((191739611 & i12) == 38347922) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            g2VarF = h.f11894a.f(pVarF, 6);
                        } else {
                            g2VarF = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            gVarI = h.f11894a.i(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        } else {
                            i18 = i12;
                            gVarI = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            i18 &= -458753;
                            cardElevationJ = h.f11894a.j(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        }
                        if ((i11 & 64) != 0) {
                            borderStrokeH = h.f11894a.h(z12, pVarF, ((i18 >> 6) & 14) | 48, 0);
                            i18 &= -3670017;
                        } else {
                            borderStrokeH = borderStroke;
                        }
                        if (i15 != 0) {
                            z12 = z11;
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                z12 = z11;
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            z12 = z11;
                            pVarF.c0();
                            gVar4 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            z12 = z11;
                            z12 = z11;
                            gVar4 = gVar2;
                        }
                        cardElevation2 = cardElevationJ;
                        gVar5 = gVarI;
                        i12 = i18;
                        nVar3 = nVar2;
                        z13 = z12;
                    } else {
                        if (i20 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            g2VarF = h.f11894a.f(pVarF, 6);
                        } else {
                            g2VarF = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            gVarI = h.f11894a.i(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        } else {
                            i18 = i12;
                            gVarI = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            i18 &= -458753;
                            cardElevationJ = h.f11894a.j(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        }
                        if ((i11 & 64) != 0) {
                            borderStrokeH = h.f11894a.h(z12, pVarF, ((i18 >> 6) & 14) | 48, 0);
                            i18 &= -3670017;
                        } else {
                            borderStrokeH = borderStroke;
                        }
                        if (i15 != 0) {
                            z12 = z11;
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                z12 = z11;
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            z12 = z11;
                            pVarF.c0();
                            gVar4 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            z12 = z11;
                            z12 = z11;
                            gVar4 = gVar2;
                        }
                        cardElevation2 = cardElevationJ;
                        gVar5 = gVarI;
                        i12 = i18;
                        nVar3 = nVar2;
                        z13 = z12;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-727137250, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:326)");
                    }
                    b(onClick, nVar3, z13, g2VarF, gVar5, cardElevation2, borderStrokeH, gVar4, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    z14 = z13;
                    gVar6 = gVar5;
                    cardElevation3 = cardElevation2;
                    borderStroke3 = borderStrokeH;
                    gVar7 = gVar4;
                    g2Var3 = g2VarF;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            g2VarF = h.f11894a.f(pVarF, 6);
                        } else {
                            g2VarF = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            gVarI = h.f11894a.i(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        } else {
                            i18 = i12;
                            gVarI = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            i18 &= -458753;
                            cardElevationJ = h.f11894a.j(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        }
                        if ((i11 & 64) != 0) {
                            borderStrokeH = h.f11894a.h(z12, pVarF, ((i18 >> 6) & 14) | 48, 0);
                            i18 &= -3670017;
                        } else {
                            borderStrokeH = borderStroke;
                        }
                        if (i15 != 0) {
                            z12 = z11;
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                z12 = z11;
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            z12 = z11;
                            pVarF.c0();
                            gVar4 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            z12 = z11;
                            z12 = z11;
                            gVar4 = gVar2;
                        }
                        cardElevation2 = cardElevationJ;
                        gVar5 = gVarI;
                        i12 = i18;
                        nVar3 = nVar2;
                        z13 = z12;
                    } else {
                        if (i20 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            g2VarF = h.f11894a.f(pVarF, 6);
                        } else {
                            g2VarF = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            gVarI = h.f11894a.i(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        } else {
                            i18 = i12;
                            gVarI = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            i18 &= -458753;
                            cardElevationJ = h.f11894a.j(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        }
                        if ((i11 & 64) != 0) {
                            borderStrokeH = h.f11894a.h(z12, pVarF, ((i18 >> 6) & 14) | 48, 0);
                            i18 &= -3670017;
                        } else {
                            borderStrokeH = borderStroke;
                        }
                        if (i15 != 0) {
                            z12 = z11;
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                z12 = z11;
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            z12 = z11;
                            pVarF.c0();
                            gVar4 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            z12 = z11;
                            z12 = z11;
                            gVar4 = gVar2;
                        }
                        cardElevation2 = cardElevationJ;
                        gVar5 = gVarI;
                        i12 = i18;
                        nVar3 = nVar2;
                        z13 = z12;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-727137250, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:326)");
                    }
                    b(onClick, nVar3, z13, g2VarF, gVar5, cardElevation2, borderStrokeH, gVar4, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    z14 = z13;
                    gVar6 = gVar5;
                    cardElevation3 = cardElevation2;
                    borderStroke3 = borderStrokeH;
                    gVar7 = gVar4;
                    g2Var3 = g2VarF;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$OutlinedCard$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i24) {
                        CardKt.f(onClick, nVar4, z14, g2Var3, gVar6, cardElevation3, borderStroke3, gVar7, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.b.f30966u4;
            z11 = z10;
            if ((i10 & bb.c.g.f32954lc) == 0) {
                if ((i11 & 8) == 0) {
                    g2Var2 = g2Var;
                    if (pVarF.s(g2Var2)) {
                    }
                    i12 |= i21;
                } else {
                    g2Var2 = g2Var;
                }
                i12 |= i21;
            } else {
                g2Var2 = g2Var;
            }
            if ((i10 & 57344) == 0) {
                if ((i11 & 16) == 0) {
                    gVar3 = gVar;
                    if (pVarF.s(gVar3)) {
                    }
                    i12 |= i22;
                } else {
                    gVar3 = gVar;
                }
                i12 |= i22;
            } else {
                gVar3 = gVar;
            }
            if ((i10 & 458752) == 0) {
                if ((i11 & 32) == 0) {
                    cardElevationJ = cardElevation;
                    if (pVarF.s(cardElevationJ)) {
                    }
                    i12 |= i23;
                } else {
                    cardElevationJ = cardElevation;
                }
                i12 |= i23;
            } else {
                cardElevationJ = cardElevation;
            }
            if ((i10 & 3670016) == 0) {
                borderStroke2 = borderStroke;
                if ((i11 & 64) == 0) {
                    i19 = 524288;
                } else {
                    i19 = 524288;
                }
                i12 |= i19;
            } else {
                borderStroke2 = borderStroke;
            }
            i15 = i11 & 128;
            if (i15 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (pVarF.s(gVar2)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
                i12 |= i16;
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 234881024) == 0) {
                    if (pVarF.s(content)) {
                        i17 = 67108864;
                    } else {
                        i17 = 33554432;
                    }
                }
                if ((191739611 & i12) == 38347922) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            g2VarF = h.f11894a.f(pVarF, 6);
                        } else {
                            g2VarF = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            gVarI = h.f11894a.i(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        } else {
                            i18 = i12;
                            gVarI = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            i18 &= -458753;
                            cardElevationJ = h.f11894a.j(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        }
                        if ((i11 & 64) != 0) {
                            borderStrokeH = h.f11894a.h(z12, pVarF, ((i18 >> 6) & 14) | 48, 0);
                            i18 &= -3670017;
                        } else {
                            borderStrokeH = borderStroke;
                        }
                        if (i15 != 0) {
                            z12 = z11;
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                z12 = z11;
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            z12 = z11;
                            pVarF.c0();
                            gVar4 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            z12 = z11;
                            z12 = z11;
                            gVar4 = gVar2;
                        }
                        cardElevation2 = cardElevationJ;
                        gVar5 = gVarI;
                        i12 = i18;
                        nVar3 = nVar2;
                        z13 = z12;
                    } else {
                        if (i20 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            g2VarF = h.f11894a.f(pVarF, 6);
                        } else {
                            g2VarF = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            gVarI = h.f11894a.i(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        } else {
                            i18 = i12;
                            gVarI = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            i18 &= -458753;
                            cardElevationJ = h.f11894a.j(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        }
                        if ((i11 & 64) != 0) {
                            borderStrokeH = h.f11894a.h(z12, pVarF, ((i18 >> 6) & 14) | 48, 0);
                            i18 &= -3670017;
                        } else {
                            borderStrokeH = borderStroke;
                        }
                        if (i15 != 0) {
                            z12 = z11;
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                z12 = z11;
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            z12 = z11;
                            pVarF.c0();
                            gVar4 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            z12 = z11;
                            z12 = z11;
                            gVar4 = gVar2;
                        }
                        cardElevation2 = cardElevationJ;
                        gVar5 = gVarI;
                        i12 = i18;
                        nVar3 = nVar2;
                        z13 = z12;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-727137250, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:326)");
                    }
                    b(onClick, nVar3, z13, g2VarF, gVar5, cardElevation2, borderStrokeH, gVar4, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    z14 = z13;
                    gVar6 = gVar5;
                    cardElevation3 = cardElevation2;
                    borderStroke3 = borderStrokeH;
                    gVar7 = gVar4;
                    g2Var3 = g2VarF;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            g2VarF = h.f11894a.f(pVarF, 6);
                        } else {
                            g2VarF = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            gVarI = h.f11894a.i(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        } else {
                            i18 = i12;
                            gVarI = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            i18 &= -458753;
                            cardElevationJ = h.f11894a.j(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        }
                        if ((i11 & 64) != 0) {
                            borderStrokeH = h.f11894a.h(z12, pVarF, ((i18 >> 6) & 14) | 48, 0);
                            i18 &= -3670017;
                        } else {
                            borderStrokeH = borderStroke;
                        }
                        if (i15 != 0) {
                            z12 = z11;
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                z12 = z11;
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            z12 = z11;
                            pVarF.c0();
                            gVar4 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            z12 = z11;
                            z12 = z11;
                            gVar4 = gVar2;
                        }
                        cardElevation2 = cardElevationJ;
                        gVar5 = gVarI;
                        i12 = i18;
                        nVar3 = nVar2;
                        z13 = z12;
                    } else {
                        if (i20 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            g2VarF = h.f11894a.f(pVarF, 6);
                        } else {
                            g2VarF = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            gVarI = h.f11894a.i(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        } else {
                            i18 = i12;
                            gVarI = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            i18 &= -458753;
                            cardElevationJ = h.f11894a.j(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        }
                        if ((i11 & 64) != 0) {
                            borderStrokeH = h.f11894a.h(z12, pVarF, ((i18 >> 6) & 14) | 48, 0);
                            i18 &= -3670017;
                        } else {
                            borderStrokeH = borderStroke;
                        }
                        if (i15 != 0) {
                            z12 = z11;
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                z12 = z11;
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            z12 = z11;
                            pVarF.c0();
                            gVar4 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            z12 = z11;
                            z12 = z11;
                            gVar4 = gVar2;
                        }
                        cardElevation2 = cardElevationJ;
                        gVar5 = gVarI;
                        i12 = i18;
                        nVar3 = nVar2;
                        z13 = z12;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-727137250, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:326)");
                    }
                    b(onClick, nVar3, z13, g2VarF, gVar5, cardElevation2, borderStrokeH, gVar4, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    z14 = z13;
                    gVar6 = gVar5;
                    cardElevation3 = cardElevation2;
                    borderStroke3 = borderStrokeH;
                    gVar7 = gVar4;
                    g2Var3 = g2VarF;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$OutlinedCard$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i24) {
                        CardKt.f(onClick, nVar4, z14, g2Var3, gVar6, cardElevation3, borderStroke3, gVar7, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i17 = 100663296;
            i12 |= i17;
            if ((191739611 & i12) == 38347922) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        g2VarF = h.f11894a.f(pVarF, 6);
                    } else {
                        g2VarF = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        gVarI = h.f11894a.i(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    } else {
                        i18 = i12;
                        gVarI = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        i18 &= -458753;
                        cardElevationJ = h.f11894a.j(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                    }
                    if ((i11 & 64) != 0) {
                        borderStrokeH = h.f11894a.h(z12, pVarF, ((i18 >> 6) & 14) | 48, 0);
                        i18 &= -3670017;
                    } else {
                        borderStrokeH = borderStroke;
                    }
                    if (i15 != 0) {
                        z12 = z11;
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            z12 = z11;
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        z12 = z11;
                        pVarF.c0();
                        gVar4 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        z12 = z11;
                        z12 = z11;
                        gVar4 = gVar2;
                    }
                    cardElevation2 = cardElevationJ;
                    gVar5 = gVarI;
                    i12 = i18;
                    nVar3 = nVar2;
                    z13 = z12;
                } else {
                    if (i20 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        g2VarF = h.f11894a.f(pVarF, 6);
                    } else {
                        g2VarF = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        gVarI = h.f11894a.i(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    } else {
                        i18 = i12;
                        gVarI = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        i18 &= -458753;
                        cardElevationJ = h.f11894a.j(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                    }
                    if ((i11 & 64) != 0) {
                        borderStrokeH = h.f11894a.h(z12, pVarF, ((i18 >> 6) & 14) | 48, 0);
                        i18 &= -3670017;
                    } else {
                        borderStrokeH = borderStroke;
                    }
                    if (i15 != 0) {
                        z12 = z11;
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            z12 = z11;
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        z12 = z11;
                        pVarF.c0();
                        gVar4 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        z12 = z11;
                        z12 = z11;
                        gVar4 = gVar2;
                    }
                    cardElevation2 = cardElevationJ;
                    gVar5 = gVarI;
                    i12 = i18;
                    nVar3 = nVar2;
                    z13 = z12;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-727137250, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:326)");
                }
                b(onClick, nVar3, z13, g2VarF, gVar5, cardElevation2, borderStrokeH, gVar4, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                z14 = z13;
                gVar6 = gVar5;
                cardElevation3 = cardElevation2;
                borderStroke3 = borderStrokeH;
                gVar7 = gVar4;
                g2Var3 = g2VarF;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        g2VarF = h.f11894a.f(pVarF, 6);
                    } else {
                        g2VarF = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        gVarI = h.f11894a.i(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    } else {
                        i18 = i12;
                        gVarI = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        i18 &= -458753;
                        cardElevationJ = h.f11894a.j(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                    }
                    if ((i11 & 64) != 0) {
                        borderStrokeH = h.f11894a.h(z12, pVarF, ((i18 >> 6) & 14) | 48, 0);
                        i18 &= -3670017;
                    } else {
                        borderStrokeH = borderStroke;
                    }
                    if (i15 != 0) {
                        z12 = z11;
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            z12 = z11;
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        z12 = z11;
                        pVarF.c0();
                        gVar4 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        z12 = z11;
                        z12 = z11;
                        gVar4 = gVar2;
                    }
                    cardElevation2 = cardElevationJ;
                    gVar5 = gVarI;
                    i12 = i18;
                    nVar3 = nVar2;
                    z13 = z12;
                } else {
                    if (i20 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        g2VarF = h.f11894a.f(pVarF, 6);
                    } else {
                        g2VarF = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        gVarI = h.f11894a.i(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    } else {
                        i18 = i12;
                        gVarI = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        i18 &= -458753;
                        cardElevationJ = h.f11894a.j(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                    }
                    if ((i11 & 64) != 0) {
                        borderStrokeH = h.f11894a.h(z12, pVarF, ((i18 >> 6) & 14) | 48, 0);
                        i18 &= -3670017;
                    } else {
                        borderStrokeH = borderStroke;
                    }
                    if (i15 != 0) {
                        z12 = z11;
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            z12 = z11;
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        z12 = z11;
                        pVarF.c0();
                        gVar4 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        z12 = z11;
                        z12 = z11;
                        gVar4 = gVar2;
                    }
                    cardElevation2 = cardElevationJ;
                    gVar5 = gVarI;
                    i12 = i18;
                    nVar3 = nVar2;
                    z13 = z12;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-727137250, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:326)");
                }
                b(onClick, nVar3, z13, g2VarF, gVar5, cardElevation2, borderStrokeH, gVar4, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                z14 = z13;
                gVar6 = gVar5;
                cardElevation3 = cardElevation2;
                borderStroke3 = borderStrokeH;
                gVar7 = gVar4;
                g2Var3 = g2VarF;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$OutlinedCard$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i24) {
                    CardKt.f(onClick, nVar4, z14, g2Var3, gVar6, cardElevation3, borderStroke3, gVar7, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & bb.c.b.f30796me) == 0) {
                z11 = z10;
                if (pVarF.u(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & bb.c.g.f32954lc) == 0) {
                if ((i11 & 8) == 0) {
                    g2Var2 = g2Var;
                    if (pVarF.s(g2Var2)) {
                    }
                    i12 |= i21;
                } else {
                    g2Var2 = g2Var;
                }
                i12 |= i21;
            } else {
                g2Var2 = g2Var;
            }
            if ((i10 & 57344) == 0) {
                if ((i11 & 16) == 0) {
                    gVar3 = gVar;
                    if (pVarF.s(gVar3)) {
                    }
                    i12 |= i22;
                } else {
                    gVar3 = gVar;
                }
                i12 |= i22;
            } else {
                gVar3 = gVar;
            }
            if ((i10 & 458752) == 0) {
                if ((i11 & 32) == 0) {
                    cardElevationJ = cardElevation;
                    if (pVarF.s(cardElevationJ)) {
                    }
                    i12 |= i23;
                } else {
                    cardElevationJ = cardElevation;
                }
                i12 |= i23;
            } else {
                cardElevationJ = cardElevation;
            }
            if ((i10 & 3670016) == 0) {
                borderStroke2 = borderStroke;
                if ((i11 & 64) == 0) {
                    i19 = 524288;
                } else {
                    i19 = 524288;
                }
                i12 |= i19;
            } else {
                borderStroke2 = borderStroke;
            }
            i15 = i11 & 128;
            if (i15 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (pVarF.s(gVar2)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
                i12 |= i16;
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 234881024) == 0) {
                    if (pVarF.s(content)) {
                        i17 = 67108864;
                    } else {
                        i17 = 33554432;
                    }
                }
                if ((191739611 & i12) == 38347922) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            g2VarF = h.f11894a.f(pVarF, 6);
                        } else {
                            g2VarF = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            gVarI = h.f11894a.i(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        } else {
                            i18 = i12;
                            gVarI = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            i18 &= -458753;
                            cardElevationJ = h.f11894a.j(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        }
                        if ((i11 & 64) != 0) {
                            borderStrokeH = h.f11894a.h(z12, pVarF, ((i18 >> 6) & 14) | 48, 0);
                            i18 &= -3670017;
                        } else {
                            borderStrokeH = borderStroke;
                        }
                        if (i15 != 0) {
                            z12 = z11;
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                z12 = z11;
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            z12 = z11;
                            pVarF.c0();
                            gVar4 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            z12 = z11;
                            z12 = z11;
                            gVar4 = gVar2;
                        }
                        cardElevation2 = cardElevationJ;
                        gVar5 = gVarI;
                        i12 = i18;
                        nVar3 = nVar2;
                        z13 = z12;
                    } else {
                        if (i20 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            g2VarF = h.f11894a.f(pVarF, 6);
                        } else {
                            g2VarF = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            gVarI = h.f11894a.i(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        } else {
                            i18 = i12;
                            gVarI = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            i18 &= -458753;
                            cardElevationJ = h.f11894a.j(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        }
                        if ((i11 & 64) != 0) {
                            borderStrokeH = h.f11894a.h(z12, pVarF, ((i18 >> 6) & 14) | 48, 0);
                            i18 &= -3670017;
                        } else {
                            borderStrokeH = borderStroke;
                        }
                        if (i15 != 0) {
                            z12 = z11;
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                z12 = z11;
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            z12 = z11;
                            pVarF.c0();
                            gVar4 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            z12 = z11;
                            z12 = z11;
                            gVar4 = gVar2;
                        }
                        cardElevation2 = cardElevationJ;
                        gVar5 = gVarI;
                        i12 = i18;
                        nVar3 = nVar2;
                        z13 = z12;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-727137250, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:326)");
                    }
                    b(onClick, nVar3, z13, g2VarF, gVar5, cardElevation2, borderStrokeH, gVar4, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    z14 = z13;
                    gVar6 = gVar5;
                    cardElevation3 = cardElevation2;
                    borderStroke3 = borderStrokeH;
                    gVar7 = gVar4;
                    g2Var3 = g2VarF;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            g2VarF = h.f11894a.f(pVarF, 6);
                        } else {
                            g2VarF = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            gVarI = h.f11894a.i(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        } else {
                            i18 = i12;
                            gVarI = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            i18 &= -458753;
                            cardElevationJ = h.f11894a.j(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        }
                        if ((i11 & 64) != 0) {
                            borderStrokeH = h.f11894a.h(z12, pVarF, ((i18 >> 6) & 14) | 48, 0);
                            i18 &= -3670017;
                        } else {
                            borderStrokeH = borderStroke;
                        }
                        if (i15 != 0) {
                            z12 = z11;
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                z12 = z11;
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            z12 = z11;
                            pVarF.c0();
                            gVar4 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            z12 = z11;
                            z12 = z11;
                            gVar4 = gVar2;
                        }
                        cardElevation2 = cardElevationJ;
                        gVar5 = gVarI;
                        i12 = i18;
                        nVar3 = nVar2;
                        z13 = z12;
                    } else {
                        if (i20 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            g2VarF = h.f11894a.f(pVarF, 6);
                        } else {
                            g2VarF = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            gVarI = h.f11894a.i(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        } else {
                            i18 = i12;
                            gVarI = gVar3;
                        }
                        if ((i11 & 32) != 0) {
                            i18 &= -458753;
                            cardElevationJ = h.f11894a.j(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                        }
                        if ((i11 & 64) != 0) {
                            borderStrokeH = h.f11894a.h(z12, pVarF, ((i18 >> 6) & 14) | 48, 0);
                            i18 &= -3670017;
                        } else {
                            borderStrokeH = borderStroke;
                        }
                        if (i15 != 0) {
                            z12 = z11;
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                z12 = z11;
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            z12 = z11;
                            pVarF.c0();
                            gVar4 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            z12 = z11;
                            z12 = z11;
                            gVar4 = gVar2;
                        }
                        cardElevation2 = cardElevationJ;
                        gVar5 = gVarI;
                        i12 = i18;
                        nVar3 = nVar2;
                        z13 = z12;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-727137250, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:326)");
                    }
                    b(onClick, nVar3, z13, g2VarF, gVar5, cardElevation2, borderStrokeH, gVar4, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    z14 = z13;
                    gVar6 = gVar5;
                    cardElevation3 = cardElevation2;
                    borderStroke3 = borderStrokeH;
                    gVar7 = gVar4;
                    g2Var3 = g2VarF;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$OutlinedCard$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i24) {
                        CardKt.f(onClick, nVar4, z14, g2Var3, gVar6, cardElevation3, borderStroke3, gVar7, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i17 = 100663296;
            i12 |= i17;
            if ((191739611 & i12) == 38347922) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        g2VarF = h.f11894a.f(pVarF, 6);
                    } else {
                        g2VarF = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        gVarI = h.f11894a.i(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    } else {
                        i18 = i12;
                        gVarI = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        i18 &= -458753;
                        cardElevationJ = h.f11894a.j(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                    }
                    if ((i11 & 64) != 0) {
                        borderStrokeH = h.f11894a.h(z12, pVarF, ((i18 >> 6) & 14) | 48, 0);
                        i18 &= -3670017;
                    } else {
                        borderStrokeH = borderStroke;
                    }
                    if (i15 != 0) {
                        z12 = z11;
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            z12 = z11;
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        z12 = z11;
                        pVarF.c0();
                        gVar4 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        z12 = z11;
                        z12 = z11;
                        gVar4 = gVar2;
                    }
                    cardElevation2 = cardElevationJ;
                    gVar5 = gVarI;
                    i12 = i18;
                    nVar3 = nVar2;
                    z13 = z12;
                } else {
                    if (i20 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        g2VarF = h.f11894a.f(pVarF, 6);
                    } else {
                        g2VarF = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        gVarI = h.f11894a.i(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    } else {
                        i18 = i12;
                        gVarI = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        i18 &= -458753;
                        cardElevationJ = h.f11894a.j(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                    }
                    if ((i11 & 64) != 0) {
                        borderStrokeH = h.f11894a.h(z12, pVarF, ((i18 >> 6) & 14) | 48, 0);
                        i18 &= -3670017;
                    } else {
                        borderStrokeH = borderStroke;
                    }
                    if (i15 != 0) {
                        z12 = z11;
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            z12 = z11;
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        z12 = z11;
                        pVarF.c0();
                        gVar4 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        z12 = z11;
                        z12 = z11;
                        gVar4 = gVar2;
                    }
                    cardElevation2 = cardElevationJ;
                    gVar5 = gVarI;
                    i12 = i18;
                    nVar3 = nVar2;
                    z13 = z12;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-727137250, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:326)");
                }
                b(onClick, nVar3, z13, g2VarF, gVar5, cardElevation2, borderStrokeH, gVar4, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                z14 = z13;
                gVar6 = gVar5;
                cardElevation3 = cardElevation2;
                borderStroke3 = borderStrokeH;
                gVar7 = gVar4;
                g2Var3 = g2VarF;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        g2VarF = h.f11894a.f(pVarF, 6);
                    } else {
                        g2VarF = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        gVarI = h.f11894a.i(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    } else {
                        i18 = i12;
                        gVarI = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        i18 &= -458753;
                        cardElevationJ = h.f11894a.j(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                    }
                    if ((i11 & 64) != 0) {
                        borderStrokeH = h.f11894a.h(z12, pVarF, ((i18 >> 6) & 14) | 48, 0);
                        i18 &= -3670017;
                    } else {
                        borderStrokeH = borderStroke;
                    }
                    if (i15 != 0) {
                        z12 = z11;
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            z12 = z11;
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        z12 = z11;
                        pVarF.c0();
                        gVar4 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        z12 = z11;
                        z12 = z11;
                        gVar4 = gVar2;
                    }
                    cardElevation2 = cardElevationJ;
                    gVar5 = gVarI;
                    i12 = i18;
                    nVar3 = nVar2;
                    z13 = z12;
                } else {
                    if (i20 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        g2VarF = h.f11894a.f(pVarF, 6);
                    } else {
                        g2VarF = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        gVarI = h.f11894a.i(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    } else {
                        i18 = i12;
                        gVarI = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        i18 &= -458753;
                        cardElevationJ = h.f11894a.j(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                    }
                    if ((i11 & 64) != 0) {
                        borderStrokeH = h.f11894a.h(z12, pVarF, ((i18 >> 6) & 14) | 48, 0);
                        i18 &= -3670017;
                    } else {
                        borderStrokeH = borderStroke;
                    }
                    if (i15 != 0) {
                        z12 = z11;
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            z12 = z11;
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        z12 = z11;
                        pVarF.c0();
                        gVar4 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        z12 = z11;
                        z12 = z11;
                        gVar4 = gVar2;
                    }
                    cardElevation2 = cardElevationJ;
                    gVar5 = gVarI;
                    i12 = i18;
                    nVar3 = nVar2;
                    z13 = z12;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-727137250, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:326)");
                }
                b(onClick, nVar3, z13, g2VarF, gVar5, cardElevation2, borderStrokeH, gVar4, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                z14 = z13;
                gVar6 = gVar5;
                cardElevation3 = cardElevation2;
                borderStroke3 = borderStrokeH;
                gVar7 = gVar4;
                g2Var3 = g2VarF;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$OutlinedCard$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i24) {
                    CardKt.f(onClick, nVar4, z14, g2Var3, gVar6, cardElevation3, borderStroke3, gVar7, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= bb.c.b.f30966u4;
        z11 = z10;
        if ((i10 & bb.c.g.f32954lc) == 0) {
            if ((i11 & 8) == 0) {
                g2Var2 = g2Var;
                if (pVarF.s(g2Var2)) {
                }
                i12 |= i21;
            } else {
                g2Var2 = g2Var;
            }
            i12 |= i21;
        } else {
            g2Var2 = g2Var;
        }
        if ((i10 & 57344) == 0) {
            if ((i11 & 16) == 0) {
                gVar3 = gVar;
                if (pVarF.s(gVar3)) {
                }
                i12 |= i22;
            } else {
                gVar3 = gVar;
            }
            i12 |= i22;
        } else {
            gVar3 = gVar;
        }
        if ((i10 & 458752) == 0) {
            if ((i11 & 32) == 0) {
                cardElevationJ = cardElevation;
                if (pVarF.s(cardElevationJ)) {
                }
                i12 |= i23;
            } else {
                cardElevationJ = cardElevation;
            }
            i12 |= i23;
        } else {
            cardElevationJ = cardElevation;
        }
        if ((i10 & 3670016) == 0) {
            borderStroke2 = borderStroke;
            if ((i11 & 64) == 0) {
                i19 = 524288;
            } else {
                i19 = 524288;
            }
            i12 |= i19;
        } else {
            borderStroke2 = borderStroke;
        }
        i15 = i11 & 128;
        if (i15 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            if (pVarF.s(gVar2)) {
                i16 = 8388608;
            } else {
                i16 = 4194304;
            }
            i12 |= i16;
        }
        if ((i11 & 256) != 0) {
            if ((i10 & 234881024) == 0) {
                if (pVarF.s(content)) {
                    i17 = 67108864;
                } else {
                    i17 = 33554432;
                }
            }
            if ((191739611 & i12) == 38347922) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        g2VarF = h.f11894a.f(pVarF, 6);
                    } else {
                        g2VarF = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        gVarI = h.f11894a.i(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    } else {
                        i18 = i12;
                        gVarI = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        i18 &= -458753;
                        cardElevationJ = h.f11894a.j(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                    }
                    if ((i11 & 64) != 0) {
                        borderStrokeH = h.f11894a.h(z12, pVarF, ((i18 >> 6) & 14) | 48, 0);
                        i18 &= -3670017;
                    } else {
                        borderStrokeH = borderStroke;
                    }
                    if (i15 != 0) {
                        z12 = z11;
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            z12 = z11;
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        z12 = z11;
                        pVarF.c0();
                        gVar4 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        z12 = z11;
                        z12 = z11;
                        gVar4 = gVar2;
                    }
                    cardElevation2 = cardElevationJ;
                    gVar5 = gVarI;
                    i12 = i18;
                    nVar3 = nVar2;
                    z13 = z12;
                } else {
                    if (i20 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        g2VarF = h.f11894a.f(pVarF, 6);
                    } else {
                        g2VarF = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        gVarI = h.f11894a.i(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    } else {
                        i18 = i12;
                        gVarI = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        i18 &= -458753;
                        cardElevationJ = h.f11894a.j(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                    }
                    if ((i11 & 64) != 0) {
                        borderStrokeH = h.f11894a.h(z12, pVarF, ((i18 >> 6) & 14) | 48, 0);
                        i18 &= -3670017;
                    } else {
                        borderStrokeH = borderStroke;
                    }
                    if (i15 != 0) {
                        z12 = z11;
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            z12 = z11;
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        z12 = z11;
                        pVarF.c0();
                        gVar4 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        z12 = z11;
                        z12 = z11;
                        gVar4 = gVar2;
                    }
                    cardElevation2 = cardElevationJ;
                    gVar5 = gVarI;
                    i12 = i18;
                    nVar3 = nVar2;
                    z13 = z12;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-727137250, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:326)");
                }
                b(onClick, nVar3, z13, g2VarF, gVar5, cardElevation2, borderStrokeH, gVar4, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                z14 = z13;
                gVar6 = gVar5;
                cardElevation3 = cardElevation2;
                borderStroke3 = borderStrokeH;
                gVar7 = gVar4;
                g2Var3 = g2VarF;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        g2VarF = h.f11894a.f(pVarF, 6);
                    } else {
                        g2VarF = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        gVarI = h.f11894a.i(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    } else {
                        i18 = i12;
                        gVarI = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        i18 &= -458753;
                        cardElevationJ = h.f11894a.j(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                    }
                    if ((i11 & 64) != 0) {
                        borderStrokeH = h.f11894a.h(z12, pVarF, ((i18 >> 6) & 14) | 48, 0);
                        i18 &= -3670017;
                    } else {
                        borderStrokeH = borderStroke;
                    }
                    if (i15 != 0) {
                        z12 = z11;
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            z12 = z11;
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        z12 = z11;
                        pVarF.c0();
                        gVar4 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        z12 = z11;
                        z12 = z11;
                        gVar4 = gVar2;
                    }
                    cardElevation2 = cardElevationJ;
                    gVar5 = gVarI;
                    i12 = i18;
                    nVar3 = nVar2;
                    z13 = z12;
                } else {
                    if (i20 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        g2VarF = h.f11894a.f(pVarF, 6);
                    } else {
                        g2VarF = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        gVarI = h.f11894a.i(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    } else {
                        i18 = i12;
                        gVarI = gVar3;
                    }
                    if ((i11 & 32) != 0) {
                        i18 &= -458753;
                        cardElevationJ = h.f11894a.j(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                    }
                    if ((i11 & 64) != 0) {
                        borderStrokeH = h.f11894a.h(z12, pVarF, ((i18 >> 6) & 14) | 48, 0);
                        i18 &= -3670017;
                    } else {
                        borderStrokeH = borderStroke;
                    }
                    if (i15 != 0) {
                        z12 = z11;
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            z12 = z11;
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        z12 = z11;
                        pVarF.c0();
                        gVar4 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        z12 = z11;
                        z12 = z11;
                        gVar4 = gVar2;
                    }
                    cardElevation2 = cardElevationJ;
                    gVar5 = gVarI;
                    i12 = i18;
                    nVar3 = nVar2;
                    z13 = z12;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-727137250, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:326)");
                }
                b(onClick, nVar3, z13, g2VarF, gVar5, cardElevation2, borderStrokeH, gVar4, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                z14 = z13;
                gVar6 = gVar5;
                cardElevation3 = cardElevation2;
                borderStroke3 = borderStrokeH;
                gVar7 = gVar4;
                g2Var3 = g2VarF;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$OutlinedCard$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i24) {
                    CardKt.f(onClick, nVar4, z14, g2Var3, gVar6, cardElevation3, borderStroke3, gVar7, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i17 = 100663296;
        i12 |= i17;
        if ((191739611 & i12) == 38347922) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    g2VarF = h.f11894a.f(pVarF, 6);
                } else {
                    g2VarF = g2Var2;
                }
                if ((i11 & 16) != 0) {
                    i18 = i12 & (-57345);
                    gVarI = h.f11894a.i(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                } else {
                    i18 = i12;
                    gVarI = gVar3;
                }
                if ((i11 & 32) != 0) {
                    i18 &= -458753;
                    cardElevationJ = h.f11894a.j(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                }
                if ((i11 & 64) != 0) {
                    borderStrokeH = h.f11894a.h(z12, pVarF, ((i18 >> 6) & 14) | 48, 0);
                    i18 &= -3670017;
                } else {
                    borderStrokeH = borderStroke;
                }
                if (i15 != 0) {
                    z12 = z11;
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        z12 = z11;
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    z12 = z11;
                    pVarF.c0();
                    gVar4 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    z12 = z11;
                    z12 = z11;
                    gVar4 = gVar2;
                }
                cardElevation2 = cardElevationJ;
                gVar5 = gVarI;
                i12 = i18;
                nVar3 = nVar2;
                z13 = z12;
            } else {
                if (i20 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    g2VarF = h.f11894a.f(pVarF, 6);
                } else {
                    g2VarF = g2Var2;
                }
                if ((i11 & 16) != 0) {
                    i18 = i12 & (-57345);
                    gVarI = h.f11894a.i(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                } else {
                    i18 = i12;
                    gVarI = gVar3;
                }
                if ((i11 & 32) != 0) {
                    i18 &= -458753;
                    cardElevationJ = h.f11894a.j(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                }
                if ((i11 & 64) != 0) {
                    borderStrokeH = h.f11894a.h(z12, pVarF, ((i18 >> 6) & 14) | 48, 0);
                    i18 &= -3670017;
                } else {
                    borderStrokeH = borderStroke;
                }
                if (i15 != 0) {
                    z12 = z11;
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        z12 = z11;
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    z12 = z11;
                    pVarF.c0();
                    gVar4 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    z12 = z11;
                    z12 = z11;
                    gVar4 = gVar2;
                }
                cardElevation2 = cardElevationJ;
                gVar5 = gVarI;
                i12 = i18;
                nVar3 = nVar2;
                z13 = z12;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-727137250, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:326)");
            }
            b(onClick, nVar3, z13, g2VarF, gVar5, cardElevation2, borderStrokeH, gVar4, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            z14 = z13;
            gVar6 = gVar5;
            cardElevation3 = cardElevation2;
            borderStroke3 = borderStrokeH;
            gVar7 = gVar4;
            g2Var3 = g2VarF;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    g2VarF = h.f11894a.f(pVarF, 6);
                } else {
                    g2VarF = g2Var2;
                }
                if ((i11 & 16) != 0) {
                    i18 = i12 & (-57345);
                    gVarI = h.f11894a.i(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                } else {
                    i18 = i12;
                    gVarI = gVar3;
                }
                if ((i11 & 32) != 0) {
                    i18 &= -458753;
                    cardElevationJ = h.f11894a.j(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                }
                if ((i11 & 64) != 0) {
                    borderStrokeH = h.f11894a.h(z12, pVarF, ((i18 >> 6) & 14) | 48, 0);
                    i18 &= -3670017;
                } else {
                    borderStrokeH = borderStroke;
                }
                if (i15 != 0) {
                    z12 = z11;
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        z12 = z11;
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    z12 = z11;
                    pVarF.c0();
                    gVar4 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    z12 = z11;
                    z12 = z11;
                    gVar4 = gVar2;
                }
                cardElevation2 = cardElevationJ;
                gVar5 = gVarI;
                i12 = i18;
                nVar3 = nVar2;
                z13 = z12;
            } else {
                if (i20 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    g2VarF = h.f11894a.f(pVarF, 6);
                } else {
                    g2VarF = g2Var2;
                }
                if ((i11 & 16) != 0) {
                    i18 = i12 & (-57345);
                    gVarI = h.f11894a.i(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                } else {
                    i18 = i12;
                    gVarI = gVar3;
                }
                if ((i11 & 32) != 0) {
                    i18 &= -458753;
                    cardElevationJ = h.f11894a.j(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pVarF, 1572864, 63);
                }
                if ((i11 & 64) != 0) {
                    borderStrokeH = h.f11894a.h(z12, pVarF, ((i18 >> 6) & 14) | 48, 0);
                    i18 &= -3670017;
                } else {
                    borderStrokeH = borderStroke;
                }
                if (i15 != 0) {
                    z12 = z11;
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        z12 = z11;
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    z12 = z11;
                    pVarF.c0();
                    gVar4 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    z12 = z11;
                    z12 = z11;
                    gVar4 = gVar2;
                }
                cardElevation2 = cardElevationJ;
                gVar5 = gVarI;
                i12 = i18;
                nVar3 = nVar2;
                z13 = z12;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-727137250, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:326)");
            }
            b(onClick, nVar3, z13, g2VarF, gVar5, cardElevation2, borderStrokeH, gVar4, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            z14 = z13;
            gVar6 = gVar5;
            cardElevation3 = cardElevation2;
            borderStroke3 = borderStrokeH;
            gVar7 = gVar4;
            g2Var3 = g2VarF;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.CardKt$OutlinedCard$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i24) {
                CardKt.f(onClick, nVar4, z14, g2Var3, gVar6, cardElevation3, borderStroke3, gVar7, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }
}
