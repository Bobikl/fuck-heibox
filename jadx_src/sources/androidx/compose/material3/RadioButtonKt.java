package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.m2;
import androidx.compose.ui.graphics.drawscope.Stroke;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: RadioButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aO\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000f\"\u0017\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0017\u0010\u0016\u001a\u00020\u00118\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013\"\u0017\u0010\u0018\u001a\u00020\u00118\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"", "selected", "Lkotlin/Function0;", "Lkotlin/b2;", "onClick", "Landroidx/compose/ui/n;", "modifier", "enabled", "Landroidx/compose/material3/b1;", "colors", "Landroidx/compose/foundation/interaction/g;", "interactionSource", ak.av, "(ZLyh/a;Landroidx/compose/ui/n;ZLandroidx/compose/material3/b1;Landroidx/compose/foundation/interaction/g;Landroidx/compose/runtime/p;II)V", "", "I", "RadioAnimationDuration", "Ls1/h;", "b", "F", "RadioButtonPadding", ak.aF, "RadioButtonDotSize", "d", "RadioStrokeWidth", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class RadioButtonKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f10376a = 100;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f10377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f10378c = s1.h.g(12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f10379d;

    static {
        float f10 = 2;
        f10377b = s1.h.g(f10);
        f10379d = s1.h.g(f10);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0152  */
    /* JADX WARN: Code duplicated, block: B:103:0x015b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0194  */
    /* JADX WARN: Code duplicated, block: B:107:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:111:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:114:0x0232  */
    /* JADX WARN: Code duplicated, block: B:116:0x023a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0250  */
    /* JADX WARN: Code duplicated, block: B:124:0x0261  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:91:0x0116  */
    /* JADX WARN: Code duplicated, block: B:93:0x0128  */
    /* JADX WARN: Code duplicated, block: B:95:0x013a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0149  */
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void a(final boolean z10, @dl.e final yh.a<kotlin.b2> aVar, @dl.e androidx.compose.ui.n nVar, boolean z11, @dl.e b1 b1Var, @dl.e androidx.compose.foundation.interaction.g gVar, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        final androidx.compose.ui.n nVar2;
        int i13;
        boolean z12;
        int i14;
        b1 b1VarA;
        int i15;
        androidx.compose.foundation.interaction.g gVar2;
        int i16;
        androidx.compose.ui.n nVar3;
        boolean z13;
        androidx.compose.foundation.interaction.g gVar3;
        b1 b1Var2;
        Object objU;
        float fG;
        androidx.compose.ui.n nVar4;
        final m2 m2VarD;
        final m2<androidx.compose.ui.graphics.l0> m2VarA;
        androidx.compose.ui.n nVar5;
        androidx.compose.runtime.p pVar2;
        boolean z14;
        int i17;
        androidx.compose.ui.n nVarA;
        androidx.compose.ui.n nVarC;
        androidx.compose.runtime.p pVar3;
        boolean zS;
        Object objU2;
        final androidx.compose.foundation.interaction.g gVar4;
        final b1 b1Var3;
        final boolean z15;
        androidx.compose.runtime.u1 u1VarH;
        androidx.compose.runtime.p pVarF = pVar.F(408580840);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.u(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= pVarF.s(aVar) ? 32 : 16;
        }
        int i18 = i11 & 4;
        if (i18 == 0) {
            if ((i10 & bb.c.b.f30796me) == 0) {
                nVar2 = nVar;
                i12 |= pVarF.s(nVar2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    z12 = z11;
                    if (pVarF.u(z12)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((57344 & i10) == 0) {
                    if ((i11 & 16) == 0) {
                        b1VarA = b1Var;
                        int i19 = pVarF.s(b1VarA) ? 16384 : 8192;
                        i12 |= i19;
                    } else {
                        b1VarA = b1Var;
                    }
                    i12 |= i19;
                } else {
                    b1VarA = b1Var;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    i12 |= androidx.profileinstaller.o.c.f26824k;
                    gVar2 = gVar;
                } else {
                    gVar2 = gVar;
                    if ((458752 & i10) == 0) {
                        if (pVarF.s(gVar2)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                }
                if ((374491 & i12) == 74898 || !pVarF.b()) {
                    pVarF.W();
                    if ((i10 & 1) != 0 || pVarF.o()) {
                        if (i18 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            b1VarA = c1.f11814a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                        }
                        if (i15 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar;
                        }
                        b1Var2 = b1VarA;
                    } else {
                        pVarF.l();
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        z13 = z12;
                        b1Var2 = b1VarA;
                        gVar3 = gVar2;
                        i12 = i12;
                        nVar3 = nVar2;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(408580840, i12, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:72)");
                    }
                    if (z10) {
                        fG = s1.h.g(f10378c / 2);
                    } else {
                        fG = s1.h.g(0);
                    }
                    nVar4 = nVar3;
                    m2VarD = AnimateAsStateKt.d(fG, androidx.compose.animation.core.i.q(100, 0, null, 6, null), null, pVarF, 48, 4);
                    m2VarA = b1Var2.a(z13, z10, pVarF, ((i12 >> 9) & 14) | ((i12 << 3) & 112) | ((i12 >> 6) & bb.c.b.f30796me));
                    pVarF.T(735546407);
                    if (aVar != null) {
                        pVar2 = pVarF;
                        z14 = z13;
                        i17 = 2;
                        nVar5 = nVar4;
                        nVarA = SelectableKt.a(androidx.compose.ui.n.INSTANCE, z10, gVar3, androidx.compose.material.ripple.j.e(false, s1.h.g(t0.p0.f140201a.h() / 2), 0L, pVar2, 54, 4), z14, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.d()), aVar);
                    } else {
                        nVar5 = nVar4;
                        pVar2 = pVarF;
                        z14 = z13;
                        i17 = 2;
                        nVarA = androidx.compose.ui.n.INSTANCE;
                    }
                    pVar2.c0();
                    if (aVar != null) {
                        nVarC = TouchTargetKt.c(androidx.compose.ui.n.INSTANCE);
                    } else {
                        nVarC = androidx.compose.ui.n.INSTANCE;
                    }
                    androidx.compose.ui.n nVarU = SizeKt.u(PaddingKt.k(SizeKt.N(nVar5.s0(nVarC).s0(nVarA), androidx.compose.ui.c.INSTANCE.i(), r0, i17, null), f10377b), t0.p0.f140201a.c());
                    pVar3 = pVar2;
                    pVar3.T(511388516);
                    zS = pVar3.s(m2VarA) | pVar3.s(m2VarD);
                    objU2 = pVar3.U();
                    if (zS || objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU2 = new yh.l<androidx.compose.ui.graphics.drawscope.g, kotlin.b2>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g Canvas) {
                                kotlin.jvm.internal.f0.p(Canvas, "$this$Canvas");
                                float fE1 = Canvas.E1(RadioButtonKt.f10379d);
                                float f10 = 2;
                                float f11 = fE1 / f10;
                                androidx.compose.ui.graphics.drawscope.f.x(Canvas, m2VarA.getValue().M(), Canvas.E1(s1.h.g(t0.p0.f140201a.c() / f10)) - f11, 0L, 0.0f, new Stroke(fE1, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                if (s1.h.f(m2VarD.getValue().w(), s1.h.g(0)) > 0) {
                                    androidx.compose.ui.graphics.drawscope.f.x(Canvas, m2VarA.getValue().M(), Canvas.E1(m2VarD.getValue().w()) - f11, 0L, 0.0f, androidx.compose.ui.graphics.drawscope.o.f13826a, null, 0, 108, null);
                                }
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar5) {
                                a(gVar5);
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVar3.N(objU2);
                    }
                    pVar3.c0();
                    CanvasKt.b(nVarU, (yh.l) objU2, pVar3, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar2 = nVar5;
                    gVar4 = gVar3;
                    b1Var3 = b1Var2;
                    z15 = z14;
                } else {
                    pVarF.l();
                    pVar3 = pVarF;
                    z15 = z12;
                    b1Var3 = b1VarA;
                    gVar4 = gVar2;
                }
                u1VarH = pVar3.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar4, int i20) {
                        RadioButtonKt.a(z10, aVar, nVar2, z15, b1Var3, gVar4, pVar4, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar4, Integer num) {
                        a(pVar4, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.d.f31193dj;
            z12 = z11;
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    b1VarA = b1Var;
                    if (pVarF.s(b1VarA)) {
                    }
                    i12 |= i19;
                } else {
                    b1VarA = b1Var;
                }
                i12 |= i19;
            } else {
                b1VarA = b1Var;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                gVar2 = gVar;
            } else {
                gVar2 = gVar;
                if ((458752 & i10) == 0) {
                    if (pVarF.s(gVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((374491 & i12) == 74898) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        b1VarA = c1.f11814a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar;
                    }
                    b1Var2 = b1VarA;
                } else {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        b1VarA = c1.f11814a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar;
                    }
                    b1Var2 = b1VarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(408580840, i12, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:72)");
                }
                if (z10) {
                    fG = s1.h.g(f10378c / 2);
                } else {
                    fG = s1.h.g(0);
                }
                nVar4 = nVar3;
                m2VarD = AnimateAsStateKt.d(fG, androidx.compose.animation.core.i.q(100, 0, null, 6, null), null, pVarF, 48, 4);
                m2VarA = b1Var2.a(z13, z10, pVarF, ((i12 >> 9) & 14) | ((i12 << 3) & 112) | ((i12 >> 6) & bb.c.b.f30796me));
                pVarF.T(735546407);
                if (aVar != null) {
                    pVar2 = pVarF;
                    z14 = z13;
                    i17 = 2;
                    nVar5 = nVar4;
                    nVarA = SelectableKt.a(androidx.compose.ui.n.INSTANCE, z10, gVar3, androidx.compose.material.ripple.j.e(false, s1.h.g(t0.p0.f140201a.h() / 2), 0L, pVar2, 54, 4), z14, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.d()), aVar);
                } else {
                    nVar5 = nVar4;
                    pVar2 = pVarF;
                    z14 = z13;
                    i17 = 2;
                    nVarA = androidx.compose.ui.n.INSTANCE;
                }
                pVar2.c0();
                if (aVar != null) {
                    nVarC = TouchTargetKt.c(androidx.compose.ui.n.INSTANCE);
                } else {
                    nVarC = androidx.compose.ui.n.INSTANCE;
                }
                androidx.compose.ui.n nVarU2 = SizeKt.u(PaddingKt.k(SizeKt.N(nVar5.s0(nVarC).s0(nVarA), androidx.compose.ui.c.INSTANCE.i(), r0, i17, null), f10377b), t0.p0.f140201a.c());
                pVar3 = pVar2;
                pVar3.T(511388516);
                zS = pVar3.s(m2VarA) | pVar3.s(m2VarD);
                objU2 = pVar3.U();
                if (zS) {
                    objU2 = new yh.l<androidx.compose.ui.graphics.drawscope.g, kotlin.b2>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g Canvas) {
                            kotlin.jvm.internal.f0.p(Canvas, "$this$Canvas");
                            float fE1 = Canvas.E1(RadioButtonKt.f10379d);
                            float f10 = 2;
                            float f11 = fE1 / f10;
                            androidx.compose.ui.graphics.drawscope.f.x(Canvas, m2VarA.getValue().M(), Canvas.E1(s1.h.g(t0.p0.f140201a.c() / f10)) - f11, 0L, 0.0f, new Stroke(fE1, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                            if (s1.h.f(m2VarD.getValue().w(), s1.h.g(0)) > 0) {
                                androidx.compose.ui.graphics.drawscope.f.x(Canvas, m2VarA.getValue().M(), Canvas.E1(m2VarD.getValue().w()) - f11, 0L, 0.0f, androidx.compose.ui.graphics.drawscope.o.f13826a, null, 0, 108, null);
                            }
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar5) {
                            a(gVar5);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVar3.N(objU2);
                } else {
                    objU2 = new yh.l<androidx.compose.ui.graphics.drawscope.g, kotlin.b2>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g Canvas) {
                            kotlin.jvm.internal.f0.p(Canvas, "$this$Canvas");
                            float fE1 = Canvas.E1(RadioButtonKt.f10379d);
                            float f10 = 2;
                            float f11 = fE1 / f10;
                            androidx.compose.ui.graphics.drawscope.f.x(Canvas, m2VarA.getValue().M(), Canvas.E1(s1.h.g(t0.p0.f140201a.c() / f10)) - f11, 0L, 0.0f, new Stroke(fE1, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                            if (s1.h.f(m2VarD.getValue().w(), s1.h.g(0)) > 0) {
                                androidx.compose.ui.graphics.drawscope.f.x(Canvas, m2VarA.getValue().M(), Canvas.E1(m2VarD.getValue().w()) - f11, 0L, 0.0f, androidx.compose.ui.graphics.drawscope.o.f13826a, null, 0, 108, null);
                            }
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar5) {
                            a(gVar5);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVar3.N(objU2);
                }
                pVar3.c0();
                CanvasKt.b(nVarU2, (yh.l) objU2, pVar3, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar2 = nVar5;
                gVar4 = gVar3;
                b1Var3 = b1Var2;
                z15 = z14;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        b1VarA = c1.f11814a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar;
                    }
                    b1Var2 = b1VarA;
                } else {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        b1VarA = c1.f11814a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar;
                    }
                    b1Var2 = b1VarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(408580840, i12, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:72)");
                }
                if (z10) {
                    fG = s1.h.g(f10378c / 2);
                } else {
                    fG = s1.h.g(0);
                }
                nVar4 = nVar3;
                m2VarD = AnimateAsStateKt.d(fG, androidx.compose.animation.core.i.q(100, 0, null, 6, null), null, pVarF, 48, 4);
                m2VarA = b1Var2.a(z13, z10, pVarF, ((i12 >> 9) & 14) | ((i12 << 3) & 112) | ((i12 >> 6) & bb.c.b.f30796me));
                pVarF.T(735546407);
                if (aVar != null) {
                    pVar2 = pVarF;
                    z14 = z13;
                    i17 = 2;
                    nVar5 = nVar4;
                    nVarA = SelectableKt.a(androidx.compose.ui.n.INSTANCE, z10, gVar3, androidx.compose.material.ripple.j.e(false, s1.h.g(t0.p0.f140201a.h() / 2), 0L, pVar2, 54, 4), z14, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.d()), aVar);
                } else {
                    nVar5 = nVar4;
                    pVar2 = pVarF;
                    z14 = z13;
                    i17 = 2;
                    nVarA = androidx.compose.ui.n.INSTANCE;
                }
                pVar2.c0();
                if (aVar != null) {
                    nVarC = TouchTargetKt.c(androidx.compose.ui.n.INSTANCE);
                } else {
                    nVarC = androidx.compose.ui.n.INSTANCE;
                }
                androidx.compose.ui.n nVarU3 = SizeKt.u(PaddingKt.k(SizeKt.N(nVar5.s0(nVarC).s0(nVarA), androidx.compose.ui.c.INSTANCE.i(), r0, i17, null), f10377b), t0.p0.f140201a.c());
                pVar3 = pVar2;
                pVar3.T(511388516);
                zS = pVar3.s(m2VarA) | pVar3.s(m2VarD);
                objU2 = pVar3.U();
                if (zS) {
                    objU2 = new yh.l<androidx.compose.ui.graphics.drawscope.g, kotlin.b2>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g Canvas) {
                            kotlin.jvm.internal.f0.p(Canvas, "$this$Canvas");
                            float fE1 = Canvas.E1(RadioButtonKt.f10379d);
                            float f10 = 2;
                            float f11 = fE1 / f10;
                            androidx.compose.ui.graphics.drawscope.f.x(Canvas, m2VarA.getValue().M(), Canvas.E1(s1.h.g(t0.p0.f140201a.c() / f10)) - f11, 0L, 0.0f, new Stroke(fE1, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                            if (s1.h.f(m2VarD.getValue().w(), s1.h.g(0)) > 0) {
                                androidx.compose.ui.graphics.drawscope.f.x(Canvas, m2VarA.getValue().M(), Canvas.E1(m2VarD.getValue().w()) - f11, 0L, 0.0f, androidx.compose.ui.graphics.drawscope.o.f13826a, null, 0, 108, null);
                            }
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar5) {
                            a(gVar5);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVar3.N(objU2);
                } else {
                    objU2 = new yh.l<androidx.compose.ui.graphics.drawscope.g, kotlin.b2>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g Canvas) {
                            kotlin.jvm.internal.f0.p(Canvas, "$this$Canvas");
                            float fE1 = Canvas.E1(RadioButtonKt.f10379d);
                            float f10 = 2;
                            float f11 = fE1 / f10;
                            androidx.compose.ui.graphics.drawscope.f.x(Canvas, m2VarA.getValue().M(), Canvas.E1(s1.h.g(t0.p0.f140201a.c() / f10)) - f11, 0L, 0.0f, new Stroke(fE1, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                            if (s1.h.f(m2VarD.getValue().w(), s1.h.g(0)) > 0) {
                                androidx.compose.ui.graphics.drawscope.f.x(Canvas, m2VarA.getValue().M(), Canvas.E1(m2VarD.getValue().w()) - f11, 0L, 0.0f, androidx.compose.ui.graphics.drawscope.o.f13826a, null, 0, 108, null);
                            }
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar5) {
                            a(gVar5);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVar3.N(objU2);
                }
                pVar3.c0();
                CanvasKt.b(nVarU3, (yh.l) objU2, pVar3, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar2 = nVar5;
                gVar4 = gVar3;
                b1Var3 = b1Var2;
                z15 = z14;
            }
            u1VarH = pVar3.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar4, int i20) {
                    RadioButtonKt.a(z10, aVar, nVar2, z15, b1Var3, gVar4, pVar4, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar4, Integer num) {
                    a(pVar4, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= bb.c.b.f30966u4;
        nVar2 = nVar;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & bb.c.g.f32954lc) == 0) {
                z12 = z11;
                if (pVarF.u(z12)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    b1VarA = b1Var;
                    if (pVarF.s(b1VarA)) {
                    }
                    i12 |= i19;
                } else {
                    b1VarA = b1Var;
                }
                i12 |= i19;
            } else {
                b1VarA = b1Var;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                gVar2 = gVar;
            } else {
                gVar2 = gVar;
                if ((458752 & i10) == 0) {
                    if (pVarF.s(gVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((374491 & i12) == 74898) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        b1VarA = c1.f11814a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar;
                    }
                    b1Var2 = b1VarA;
                } else {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        b1VarA = c1.f11814a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar;
                    }
                    b1Var2 = b1VarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(408580840, i12, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:72)");
                }
                if (z10) {
                    fG = s1.h.g(f10378c / 2);
                } else {
                    fG = s1.h.g(0);
                }
                nVar4 = nVar3;
                m2VarD = AnimateAsStateKt.d(fG, androidx.compose.animation.core.i.q(100, 0, null, 6, null), null, pVarF, 48, 4);
                m2VarA = b1Var2.a(z13, z10, pVarF, ((i12 >> 9) & 14) | ((i12 << 3) & 112) | ((i12 >> 6) & bb.c.b.f30796me));
                pVarF.T(735546407);
                if (aVar != null) {
                    pVar2 = pVarF;
                    z14 = z13;
                    i17 = 2;
                    nVar5 = nVar4;
                    nVarA = SelectableKt.a(androidx.compose.ui.n.INSTANCE, z10, gVar3, androidx.compose.material.ripple.j.e(false, s1.h.g(t0.p0.f140201a.h() / 2), 0L, pVar2, 54, 4), z14, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.d()), aVar);
                } else {
                    nVar5 = nVar4;
                    pVar2 = pVarF;
                    z14 = z13;
                    i17 = 2;
                    nVarA = androidx.compose.ui.n.INSTANCE;
                }
                pVar2.c0();
                if (aVar != null) {
                    nVarC = TouchTargetKt.c(androidx.compose.ui.n.INSTANCE);
                } else {
                    nVarC = androidx.compose.ui.n.INSTANCE;
                }
                androidx.compose.ui.n nVarU4 = SizeKt.u(PaddingKt.k(SizeKt.N(nVar5.s0(nVarC).s0(nVarA), androidx.compose.ui.c.INSTANCE.i(), r0, i17, null), f10377b), t0.p0.f140201a.c());
                pVar3 = pVar2;
                pVar3.T(511388516);
                zS = pVar3.s(m2VarA) | pVar3.s(m2VarD);
                objU2 = pVar3.U();
                if (zS) {
                    objU2 = new yh.l<androidx.compose.ui.graphics.drawscope.g, kotlin.b2>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g Canvas) {
                            kotlin.jvm.internal.f0.p(Canvas, "$this$Canvas");
                            float fE1 = Canvas.E1(RadioButtonKt.f10379d);
                            float f10 = 2;
                            float f11 = fE1 / f10;
                            androidx.compose.ui.graphics.drawscope.f.x(Canvas, m2VarA.getValue().M(), Canvas.E1(s1.h.g(t0.p0.f140201a.c() / f10)) - f11, 0L, 0.0f, new Stroke(fE1, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                            if (s1.h.f(m2VarD.getValue().w(), s1.h.g(0)) > 0) {
                                androidx.compose.ui.graphics.drawscope.f.x(Canvas, m2VarA.getValue().M(), Canvas.E1(m2VarD.getValue().w()) - f11, 0L, 0.0f, androidx.compose.ui.graphics.drawscope.o.f13826a, null, 0, 108, null);
                            }
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar5) {
                            a(gVar5);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVar3.N(objU2);
                } else {
                    objU2 = new yh.l<androidx.compose.ui.graphics.drawscope.g, kotlin.b2>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g Canvas) {
                            kotlin.jvm.internal.f0.p(Canvas, "$this$Canvas");
                            float fE1 = Canvas.E1(RadioButtonKt.f10379d);
                            float f10 = 2;
                            float f11 = fE1 / f10;
                            androidx.compose.ui.graphics.drawscope.f.x(Canvas, m2VarA.getValue().M(), Canvas.E1(s1.h.g(t0.p0.f140201a.c() / f10)) - f11, 0L, 0.0f, new Stroke(fE1, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                            if (s1.h.f(m2VarD.getValue().w(), s1.h.g(0)) > 0) {
                                androidx.compose.ui.graphics.drawscope.f.x(Canvas, m2VarA.getValue().M(), Canvas.E1(m2VarD.getValue().w()) - f11, 0L, 0.0f, androidx.compose.ui.graphics.drawscope.o.f13826a, null, 0, 108, null);
                            }
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar5) {
                            a(gVar5);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVar3.N(objU2);
                }
                pVar3.c0();
                CanvasKt.b(nVarU4, (yh.l) objU2, pVar3, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar2 = nVar5;
                gVar4 = gVar3;
                b1Var3 = b1Var2;
                z15 = z14;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        b1VarA = c1.f11814a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar;
                    }
                    b1Var2 = b1VarA;
                } else {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        b1VarA = c1.f11814a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                    }
                    if (i15 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar;
                    }
                    b1Var2 = b1VarA;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(408580840, i12, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:72)");
                }
                if (z10) {
                    fG = s1.h.g(f10378c / 2);
                } else {
                    fG = s1.h.g(0);
                }
                nVar4 = nVar3;
                m2VarD = AnimateAsStateKt.d(fG, androidx.compose.animation.core.i.q(100, 0, null, 6, null), null, pVarF, 48, 4);
                m2VarA = b1Var2.a(z13, z10, pVarF, ((i12 >> 9) & 14) | ((i12 << 3) & 112) | ((i12 >> 6) & bb.c.b.f30796me));
                pVarF.T(735546407);
                if (aVar != null) {
                    pVar2 = pVarF;
                    z14 = z13;
                    i17 = 2;
                    nVar5 = nVar4;
                    nVarA = SelectableKt.a(androidx.compose.ui.n.INSTANCE, z10, gVar3, androidx.compose.material.ripple.j.e(false, s1.h.g(t0.p0.f140201a.h() / 2), 0L, pVar2, 54, 4), z14, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.d()), aVar);
                } else {
                    nVar5 = nVar4;
                    pVar2 = pVarF;
                    z14 = z13;
                    i17 = 2;
                    nVarA = androidx.compose.ui.n.INSTANCE;
                }
                pVar2.c0();
                if (aVar != null) {
                    nVarC = TouchTargetKt.c(androidx.compose.ui.n.INSTANCE);
                } else {
                    nVarC = androidx.compose.ui.n.INSTANCE;
                }
                androidx.compose.ui.n nVarU5 = SizeKt.u(PaddingKt.k(SizeKt.N(nVar5.s0(nVarC).s0(nVarA), androidx.compose.ui.c.INSTANCE.i(), r0, i17, null), f10377b), t0.p0.f140201a.c());
                pVar3 = pVar2;
                pVar3.T(511388516);
                zS = pVar3.s(m2VarA) | pVar3.s(m2VarD);
                objU2 = pVar3.U();
                if (zS) {
                    objU2 = new yh.l<androidx.compose.ui.graphics.drawscope.g, kotlin.b2>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g Canvas) {
                            kotlin.jvm.internal.f0.p(Canvas, "$this$Canvas");
                            float fE1 = Canvas.E1(RadioButtonKt.f10379d);
                            float f10 = 2;
                            float f11 = fE1 / f10;
                            androidx.compose.ui.graphics.drawscope.f.x(Canvas, m2VarA.getValue().M(), Canvas.E1(s1.h.g(t0.p0.f140201a.c() / f10)) - f11, 0L, 0.0f, new Stroke(fE1, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                            if (s1.h.f(m2VarD.getValue().w(), s1.h.g(0)) > 0) {
                                androidx.compose.ui.graphics.drawscope.f.x(Canvas, m2VarA.getValue().M(), Canvas.E1(m2VarD.getValue().w()) - f11, 0L, 0.0f, androidx.compose.ui.graphics.drawscope.o.f13826a, null, 0, 108, null);
                            }
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar5) {
                            a(gVar5);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVar3.N(objU2);
                } else {
                    objU2 = new yh.l<androidx.compose.ui.graphics.drawscope.g, kotlin.b2>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g Canvas) {
                            kotlin.jvm.internal.f0.p(Canvas, "$this$Canvas");
                            float fE1 = Canvas.E1(RadioButtonKt.f10379d);
                            float f10 = 2;
                            float f11 = fE1 / f10;
                            androidx.compose.ui.graphics.drawscope.f.x(Canvas, m2VarA.getValue().M(), Canvas.E1(s1.h.g(t0.p0.f140201a.c() / f10)) - f11, 0L, 0.0f, new Stroke(fE1, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                            if (s1.h.f(m2VarD.getValue().w(), s1.h.g(0)) > 0) {
                                androidx.compose.ui.graphics.drawscope.f.x(Canvas, m2VarA.getValue().M(), Canvas.E1(m2VarD.getValue().w()) - f11, 0L, 0.0f, androidx.compose.ui.graphics.drawscope.o.f13826a, null, 0, 108, null);
                            }
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar5) {
                            a(gVar5);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVar3.N(objU2);
                }
                pVar3.c0();
                CanvasKt.b(nVarU5, (yh.l) objU2, pVar3, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar2 = nVar5;
                gVar4 = gVar3;
                b1Var3 = b1Var2;
                z15 = z14;
            }
            u1VarH = pVar3.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar4, int i20) {
                    RadioButtonKt.a(z10, aVar, nVar2, z15, b1Var3, gVar4, pVar4, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar4, Integer num) {
                    a(pVar4, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= bb.c.d.f31193dj;
        z12 = z11;
        if ((57344 & i10) == 0) {
            if ((i11 & 16) == 0) {
                b1VarA = b1Var;
                if (pVarF.s(b1VarA)) {
                }
                i12 |= i19;
            } else {
                b1VarA = b1Var;
            }
            i12 |= i19;
        } else {
            b1VarA = b1Var;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            i12 |= androidx.profileinstaller.o.c.f26824k;
            gVar2 = gVar;
        } else {
            gVar2 = gVar;
            if ((458752 & i10) == 0) {
                if (pVarF.s(gVar2)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
        }
        if ((374491 & i12) == 74898) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    b1VarA = c1.f11814a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                }
                if (i15 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar3 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar3 = gVar;
                }
                b1Var2 = b1VarA;
            } else {
                if (i18 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    b1VarA = c1.f11814a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                }
                if (i15 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar3 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar3 = gVar;
                }
                b1Var2 = b1VarA;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(408580840, i12, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:72)");
            }
            if (z10) {
                fG = s1.h.g(f10378c / 2);
            } else {
                fG = s1.h.g(0);
            }
            nVar4 = nVar3;
            m2VarD = AnimateAsStateKt.d(fG, androidx.compose.animation.core.i.q(100, 0, null, 6, null), null, pVarF, 48, 4);
            m2VarA = b1Var2.a(z13, z10, pVarF, ((i12 >> 9) & 14) | ((i12 << 3) & 112) | ((i12 >> 6) & bb.c.b.f30796me));
            pVarF.T(735546407);
            if (aVar != null) {
                pVar2 = pVarF;
                z14 = z13;
                i17 = 2;
                nVar5 = nVar4;
                nVarA = SelectableKt.a(androidx.compose.ui.n.INSTANCE, z10, gVar3, androidx.compose.material.ripple.j.e(false, s1.h.g(t0.p0.f140201a.h() / 2), 0L, pVar2, 54, 4), z14, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.d()), aVar);
            } else {
                nVar5 = nVar4;
                pVar2 = pVarF;
                z14 = z13;
                i17 = 2;
                nVarA = androidx.compose.ui.n.INSTANCE;
            }
            pVar2.c0();
            if (aVar != null) {
                nVarC = TouchTargetKt.c(androidx.compose.ui.n.INSTANCE);
            } else {
                nVarC = androidx.compose.ui.n.INSTANCE;
            }
            androidx.compose.ui.n nVarU6 = SizeKt.u(PaddingKt.k(SizeKt.N(nVar5.s0(nVarC).s0(nVarA), androidx.compose.ui.c.INSTANCE.i(), r0, i17, null), f10377b), t0.p0.f140201a.c());
            pVar3 = pVar2;
            pVar3.T(511388516);
            zS = pVar3.s(m2VarA) | pVar3.s(m2VarD);
            objU2 = pVar3.U();
            if (zS) {
                objU2 = new yh.l<androidx.compose.ui.graphics.drawscope.g, kotlin.b2>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g Canvas) {
                        kotlin.jvm.internal.f0.p(Canvas, "$this$Canvas");
                        float fE1 = Canvas.E1(RadioButtonKt.f10379d);
                        float f10 = 2;
                        float f11 = fE1 / f10;
                        androidx.compose.ui.graphics.drawscope.f.x(Canvas, m2VarA.getValue().M(), Canvas.E1(s1.h.g(t0.p0.f140201a.c() / f10)) - f11, 0L, 0.0f, new Stroke(fE1, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                        if (s1.h.f(m2VarD.getValue().w(), s1.h.g(0)) > 0) {
                            androidx.compose.ui.graphics.drawscope.f.x(Canvas, m2VarA.getValue().M(), Canvas.E1(m2VarD.getValue().w()) - f11, 0L, 0.0f, androidx.compose.ui.graphics.drawscope.o.f13826a, null, 0, 108, null);
                        }
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar5) {
                        a(gVar5);
                        return kotlin.b2.f124493a;
                    }
                };
                pVar3.N(objU2);
            } else {
                objU2 = new yh.l<androidx.compose.ui.graphics.drawscope.g, kotlin.b2>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g Canvas) {
                        kotlin.jvm.internal.f0.p(Canvas, "$this$Canvas");
                        float fE1 = Canvas.E1(RadioButtonKt.f10379d);
                        float f10 = 2;
                        float f11 = fE1 / f10;
                        androidx.compose.ui.graphics.drawscope.f.x(Canvas, m2VarA.getValue().M(), Canvas.E1(s1.h.g(t0.p0.f140201a.c() / f10)) - f11, 0L, 0.0f, new Stroke(fE1, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                        if (s1.h.f(m2VarD.getValue().w(), s1.h.g(0)) > 0) {
                            androidx.compose.ui.graphics.drawscope.f.x(Canvas, m2VarA.getValue().M(), Canvas.E1(m2VarD.getValue().w()) - f11, 0L, 0.0f, androidx.compose.ui.graphics.drawscope.o.f13826a, null, 0, 108, null);
                        }
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar5) {
                        a(gVar5);
                        return kotlin.b2.f124493a;
                    }
                };
                pVar3.N(objU2);
            }
            pVar3.c0();
            CanvasKt.b(nVarU6, (yh.l) objU2, pVar3, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar2 = nVar5;
            gVar4 = gVar3;
            b1Var3 = b1Var2;
            z15 = z14;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    b1VarA = c1.f11814a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                }
                if (i15 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar3 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar3 = gVar;
                }
                b1Var2 = b1VarA;
            } else {
                if (i18 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    b1VarA = c1.f11814a.a(0L, 0L, 0L, 0L, pVarF, 24576, 15);
                }
                if (i15 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar3 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar3 = gVar;
                }
                b1Var2 = b1VarA;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(408580840, i12, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:72)");
            }
            if (z10) {
                fG = s1.h.g(f10378c / 2);
            } else {
                fG = s1.h.g(0);
            }
            nVar4 = nVar3;
            m2VarD = AnimateAsStateKt.d(fG, androidx.compose.animation.core.i.q(100, 0, null, 6, null), null, pVarF, 48, 4);
            m2VarA = b1Var2.a(z13, z10, pVarF, ((i12 >> 9) & 14) | ((i12 << 3) & 112) | ((i12 >> 6) & bb.c.b.f30796me));
            pVarF.T(735546407);
            if (aVar != null) {
                pVar2 = pVarF;
                z14 = z13;
                i17 = 2;
                nVar5 = nVar4;
                nVarA = SelectableKt.a(androidx.compose.ui.n.INSTANCE, z10, gVar3, androidx.compose.material.ripple.j.e(false, s1.h.g(t0.p0.f140201a.h() / 2), 0L, pVar2, 54, 4), z14, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.d()), aVar);
            } else {
                nVar5 = nVar4;
                pVar2 = pVarF;
                z14 = z13;
                i17 = 2;
                nVarA = androidx.compose.ui.n.INSTANCE;
            }
            pVar2.c0();
            if (aVar != null) {
                nVarC = TouchTargetKt.c(androidx.compose.ui.n.INSTANCE);
            } else {
                nVarC = androidx.compose.ui.n.INSTANCE;
            }
            androidx.compose.ui.n nVarU7 = SizeKt.u(PaddingKt.k(SizeKt.N(nVar5.s0(nVarC).s0(nVarA), androidx.compose.ui.c.INSTANCE.i(), r0, i17, null), f10377b), t0.p0.f140201a.c());
            pVar3 = pVar2;
            pVar3.T(511388516);
            zS = pVar3.s(m2VarA) | pVar3.s(m2VarD);
            objU2 = pVar3.U();
            if (zS) {
                objU2 = new yh.l<androidx.compose.ui.graphics.drawscope.g, kotlin.b2>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g Canvas) {
                        kotlin.jvm.internal.f0.p(Canvas, "$this$Canvas");
                        float fE1 = Canvas.E1(RadioButtonKt.f10379d);
                        float f10 = 2;
                        float f11 = fE1 / f10;
                        androidx.compose.ui.graphics.drawscope.f.x(Canvas, m2VarA.getValue().M(), Canvas.E1(s1.h.g(t0.p0.f140201a.c() / f10)) - f11, 0L, 0.0f, new Stroke(fE1, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                        if (s1.h.f(m2VarD.getValue().w(), s1.h.g(0)) > 0) {
                            androidx.compose.ui.graphics.drawscope.f.x(Canvas, m2VarA.getValue().M(), Canvas.E1(m2VarD.getValue().w()) - f11, 0L, 0.0f, androidx.compose.ui.graphics.drawscope.o.f13826a, null, 0, 108, null);
                        }
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar5) {
                        a(gVar5);
                        return kotlin.b2.f124493a;
                    }
                };
                pVar3.N(objU2);
            } else {
                objU2 = new yh.l<androidx.compose.ui.graphics.drawscope.g, kotlin.b2>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g Canvas) {
                        kotlin.jvm.internal.f0.p(Canvas, "$this$Canvas");
                        float fE1 = Canvas.E1(RadioButtonKt.f10379d);
                        float f10 = 2;
                        float f11 = fE1 / f10;
                        androidx.compose.ui.graphics.drawscope.f.x(Canvas, m2VarA.getValue().M(), Canvas.E1(s1.h.g(t0.p0.f140201a.c() / f10)) - f11, 0L, 0.0f, new Stroke(fE1, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                        if (s1.h.f(m2VarD.getValue().w(), s1.h.g(0)) > 0) {
                            androidx.compose.ui.graphics.drawscope.f.x(Canvas, m2VarA.getValue().M(), Canvas.E1(m2VarD.getValue().w()) - f11, 0L, 0.0f, androidx.compose.ui.graphics.drawscope.o.f13826a, null, 0, 108, null);
                        }
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar5) {
                        a(gVar5);
                        return kotlin.b2.f124493a;
                    }
                };
                pVar3.N(objU2);
            }
            pVar3.c0();
            CanvasKt.b(nVarU7, (yh.l) objU2, pVar3, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar2 = nVar5;
            gVar4 = gVar3;
            b1Var3 = b1Var2;
            z15 = z14;
        }
        u1VarH = pVar3.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar4, int i20) {
                RadioButtonKt.a(z10, aVar, nVar2, z15, b1Var3, gVar4, pVar4, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar4, Integer num) {
                a(pVar4, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }
}
