package androidx.compose.foundation.text;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.u1;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ClickableText.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ay\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/d;", "text", "Landroidx/compose/ui/n;", "modifier", "Landroidx/compose/ui/text/q0;", "style", "", "softWrap", "Landroidx/compose/ui/text/style/q;", "overflow", "", "maxLines", "Lkotlin/Function1;", "Landroidx/compose/ui/text/i0;", "Lkotlin/b2;", "onTextLayout", "onClick", ak.av, "(Landroidx/compose/ui/text/d;Landroidx/compose/ui/n;Landroidx/compose/ui/text/q0;ZIILyh/l;Lyh/l;Landroidx/compose/runtime/p;II)V", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class ClickableTextKt {
    /* JADX WARN: Code duplicated, block: B:101:0x0137  */
    /* JADX WARN: Code duplicated, block: B:102:0x0140  */
    /* JADX WARN: Code duplicated, block: B:104:0x0144  */
    /* JADX WARN: Code duplicated, block: B:105:0x014a  */
    /* JADX WARN: Code duplicated, block: B:107:0x014e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0152  */
    /* JADX WARN: Code duplicated, block: B:111:0x015a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0176  */
    /* JADX WARN: Code duplicated, block: B:117:0x019a  */
    /* JADX WARN: Code duplicated, block: B:119:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:122:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:124:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:127:0x020f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0225  */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x009e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00be  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00de  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:88:0x0107  */
    /* JADX WARN: Code duplicated, block: B:92:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x011d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0122  */
    /* JADX WARN: Code duplicated, block: B:96:0x012b  */
    /* JADX WARN: Code duplicated, block: B:98:0x012f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0133  */
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void a(@dl.d final androidx.compose.ui.text.d text, @dl.e androidx.compose.ui.n nVar, @dl.e TextStyle textStyle, boolean z10, int i10, int i11, @dl.e yh.l<? super TextLayoutResult, b2> lVar, @dl.d final yh.l<? super Integer, b2> onClick, @dl.e androidx.compose.runtime.p pVar, final int i12, final int i13) {
        int i14;
        androidx.compose.ui.n nVar2;
        int i15;
        TextStyle textStyle2;
        int i16;
        int i17;
        boolean z11;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        TextStyle textStyleA;
        boolean z12;
        int iA;
        int i27;
        final yh.l<? super TextLayoutResult, b2> lVar2;
        Object objU;
        androidx.compose.runtime.p.Companion companion;
        final a1 a1Var;
        boolean zS;
        Object objU2;
        boolean zS2;
        Object objU3;
        final int i28;
        final androidx.compose.ui.n nVar3;
        final yh.l<? super TextLayoutResult, b2> lVar3;
        final TextStyle textStyle3;
        final boolean z13;
        final int i29;
        u1 u1VarH;
        f0.p(text, "text");
        f0.p(onClick, "onClick");
        androidx.compose.runtime.p pVarF = pVar.F(-246609449);
        if ((i13 & 1) != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            i14 = (pVarF.s(text) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        int i30 = i13 & 2;
        if (i30 == 0) {
            if ((i12 & 112) == 0) {
                nVar2 = nVar;
                i14 |= pVarF.s(nVar2) ? 32 : 16;
            }
            i15 = i13 & 4;
            if (i15 != 0) {
                if ((i12 & bb.c.b.f30796me) == 0) {
                    textStyle2 = textStyle;
                    if (pVarF.s(textStyle2)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i14 |= i16;
                }
                i17 = i13 & 8;
                if (i17 != 0) {
                    if ((i12 & bb.c.g.f32954lc) == 0) {
                        z11 = z10;
                        if (pVarF.u(z11)) {
                            i18 = 2048;
                        } else {
                            i18 = 1024;
                        }
                        i14 |= i18;
                    }
                    i19 = i13 & 16;
                    if (i19 != 0) {
                        i14 |= 24576;
                        i20 = i10;
                    } else {
                        i20 = i10;
                        if ((i12 & 57344) == 0) {
                            if (pVarF.y(i20)) {
                                i21 = 16384;
                            } else {
                                i21 = 8192;
                            }
                            i14 |= i21;
                        }
                    }
                    i22 = i13 & 32;
                    if (i22 != 0) {
                        i14 |= androidx.profileinstaller.o.c.f26824k;
                    } else if ((i12 & 458752) == 0) {
                        if (pVarF.y(i11)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i14 |= i23;
                    }
                    i24 = i13 & 64;
                    if (i24 != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 3670016) == 0) {
                        if (pVarF.s(lVar)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i13 & 128) != 0) {
                        if ((29360128 & i12) == 0) {
                            if (pVarF.s(onClick)) {
                                i26 = 8388608;
                            } else {
                                i26 = 4194304;
                            }
                        }
                        if ((23967451 & i14) == 4793490 || !pVarF.b()) {
                            if (i30 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i15 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if (i19 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            } else {
                                iA = i20;
                            }
                            if (i22 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i11;
                            }
                            if (i24 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                                    public final void a(@dl.d TextLayoutResult it) {
                                        f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return b2.f124493a;
                                    }
                                };
                            } else {
                                lVar2 = lVar;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:63)");
                            }
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            companion = androidx.compose.runtime.p.INSTANCE;
                            if (objU == companion.a()) {
                                objU = h2.g(null, null, 2, null);
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            a1Var = (a1) objU;
                            androidx.compose.ui.n.Companion companion2 = androidx.compose.ui.n.INSTANCE;
                            pVarF.T(511388516);
                            zS = pVarF.s(a1Var) | pVarF.s(onClick);
                            objU2 = pVarF.U();
                            if (zS || objU2 == companion.a()) {
                                objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                                pVarF.N(objU2);
                            }
                            pVarF.c0();
                            androidx.compose.ui.n nVarS0 = nVar2.s0(SuspendingPointerInputFilterKt.c(companion2, onClick, (yh.p) objU2));
                            pVarF.T(511388516);
                            zS2 = pVarF.s(a1Var) | pVarF.s(lVar2);
                            objU3 = pVarF.U();
                            if (zS2 || objU3 == companion.a()) {
                                objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    public final void a(@dl.d TextLayoutResult it) {
                                        f0.p(it, "it");
                                        a1Var.setValue(it);
                                        lVar2.invoke(it);
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return b2.f124493a;
                                    }
                                };
                                pVarF.N(objU3);
                            }
                            pVarF.c0();
                            androidx.compose.ui.n nVar4 = nVar2;
                            yh.l<? super TextLayoutResult, b2> lVar4 = lVar2;
                            BasicTextKt.a(text, nVarS0, textStyleA, (yh.l) objU3, iA, z12, i27, null, pVarF, (i14 & 14) | (i14 & bb.c.b.f30796me) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            i28 = i27;
                            nVar3 = nVar4;
                            lVar3 = lVar4;
                            textStyle3 = textStyleA;
                            z13 = z12;
                            i29 = iA;
                        } else {
                            pVarF.l();
                            lVar3 = lVar;
                            nVar3 = nVar2;
                            textStyle3 = textStyle2;
                            z13 = z11;
                            i29 = i20;
                            i28 = i11;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i31) {
                                ClickableTextKt.a(text, nVar3, textStyle3, z13, i29, i28, lVar3, onClick, pVar2, i12 | 1, i13);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    i26 = 12582912;
                    i14 |= i26;
                    if ((23967451 & i14) == 4793490) {
                        if (i30 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i20;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i24 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:63)");
                        }
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            objU = h2.g(null, null, 2, null);
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        a1Var = (a1) objU;
                        androidx.compose.ui.n.Companion companion3 = androidx.compose.ui.n.INSTANCE;
                        pVarF.T(511388516);
                        zS = pVarF.s(a1Var) | pVarF.s(onClick);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVarS1 = nVar2.s0(SuspendingPointerInputFilterKt.c(companion3, onClick, (yh.p) objU2));
                        pVarF.T(511388516);
                        zS2 = pVarF.s(a1Var) | pVarF.s(lVar2);
                        objU3 = pVarF.U();
                        if (zS2) {
                            objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                    a1Var.setValue(it);
                                    lVar2.invoke(it);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                            pVarF.N(objU3);
                        } else {
                            objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                    a1Var.setValue(it);
                                    lVar2.invoke(it);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                            pVarF.N(objU3);
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVar5 = nVar2;
                        yh.l<? super TextLayoutResult, b2> lVar5 = lVar2;
                        BasicTextKt.a(text, nVarS1, textStyleA, (yh.l) objU3, iA, z12, i27, null, pVarF, (i14 & 14) | (i14 & bb.c.b.f30796me) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i28 = i27;
                        nVar3 = nVar5;
                        lVar3 = lVar5;
                        textStyle3 = textStyleA;
                        z13 = z12;
                        i29 = iA;
                    } else {
                        if (i30 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i20;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i24 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:63)");
                        }
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            objU = h2.g(null, null, 2, null);
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        a1Var = (a1) objU;
                        androidx.compose.ui.n.Companion companion4 = androidx.compose.ui.n.INSTANCE;
                        pVarF.T(511388516);
                        zS = pVarF.s(a1Var) | pVarF.s(onClick);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVarS2 = nVar2.s0(SuspendingPointerInputFilterKt.c(companion4, onClick, (yh.p) objU2));
                        pVarF.T(511388516);
                        zS2 = pVarF.s(a1Var) | pVarF.s(lVar2);
                        objU3 = pVarF.U();
                        if (zS2) {
                            objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                    a1Var.setValue(it);
                                    lVar2.invoke(it);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                            pVarF.N(objU3);
                        } else {
                            objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                    a1Var.setValue(it);
                                    lVar2.invoke(it);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                            pVarF.N(objU3);
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVar6 = nVar2;
                        yh.l<? super TextLayoutResult, b2> lVar6 = lVar2;
                        BasicTextKt.a(text, nVarS2, textStyleA, (yh.l) objU3, iA, z12, i27, null, pVarF, (i14 & 14) | (i14 & bb.c.b.f30796me) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i28 = i27;
                        nVar3 = nVar6;
                        lVar3 = lVar6;
                        textStyle3 = textStyleA;
                        z13 = z12;
                        i29 = iA;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i31) {
                            ClickableTextKt.a(text, nVar3, textStyle3, z13, i29, i28, lVar3, onClick, pVar2, i12 | 1, i13);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i14 |= bb.c.d.f31193dj;
                z11 = z10;
                i19 = i13 & 16;
                if (i19 != 0) {
                    i14 |= 24576;
                    i20 = i10;
                } else {
                    i20 = i10;
                    if ((i12 & 57344) == 0) {
                        if (pVarF.y(i20)) {
                            i21 = 16384;
                        } else {
                            i21 = 8192;
                        }
                        i14 |= i21;
                    }
                }
                i22 = i13 & 32;
                if (i22 != 0) {
                    i14 |= androidx.profileinstaller.o.c.f26824k;
                } else if ((i12 & 458752) == 0) {
                    if (pVarF.y(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i14 |= i23;
                }
                i24 = i13 & 64;
                if (i24 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (pVarF.s(lVar)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i13 & 128) != 0) {
                    if ((29360128 & i12) == 0) {
                        if (pVarF.s(onClick)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                    }
                    if ((23967451 & i14) == 4793490) {
                        if (i30 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i20;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i24 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:63)");
                        }
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            objU = h2.g(null, null, 2, null);
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        a1Var = (a1) objU;
                        androidx.compose.ui.n.Companion companion5 = androidx.compose.ui.n.INSTANCE;
                        pVarF.T(511388516);
                        zS = pVarF.s(a1Var) | pVarF.s(onClick);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVarS3 = nVar2.s0(SuspendingPointerInputFilterKt.c(companion5, onClick, (yh.p) objU2));
                        pVarF.T(511388516);
                        zS2 = pVarF.s(a1Var) | pVarF.s(lVar2);
                        objU3 = pVarF.U();
                        if (zS2) {
                            objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                    a1Var.setValue(it);
                                    lVar2.invoke(it);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                            pVarF.N(objU3);
                        } else {
                            objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                    a1Var.setValue(it);
                                    lVar2.invoke(it);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                            pVarF.N(objU3);
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVar7 = nVar2;
                        yh.l<? super TextLayoutResult, b2> lVar7 = lVar2;
                        BasicTextKt.a(text, nVarS3, textStyleA, (yh.l) objU3, iA, z12, i27, null, pVarF, (i14 & 14) | (i14 & bb.c.b.f30796me) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i28 = i27;
                        nVar3 = nVar7;
                        lVar3 = lVar7;
                        textStyle3 = textStyleA;
                        z13 = z12;
                        i29 = iA;
                    } else {
                        if (i30 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i20;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i24 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:63)");
                        }
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            objU = h2.g(null, null, 2, null);
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        a1Var = (a1) objU;
                        androidx.compose.ui.n.Companion companion6 = androidx.compose.ui.n.INSTANCE;
                        pVarF.T(511388516);
                        zS = pVarF.s(a1Var) | pVarF.s(onClick);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVarS4 = nVar2.s0(SuspendingPointerInputFilterKt.c(companion6, onClick, (yh.p) objU2));
                        pVarF.T(511388516);
                        zS2 = pVarF.s(a1Var) | pVarF.s(lVar2);
                        objU3 = pVarF.U();
                        if (zS2) {
                            objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                    a1Var.setValue(it);
                                    lVar2.invoke(it);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                            pVarF.N(objU3);
                        } else {
                            objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                    a1Var.setValue(it);
                                    lVar2.invoke(it);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                            pVarF.N(objU3);
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVar8 = nVar2;
                        yh.l<? super TextLayoutResult, b2> lVar8 = lVar2;
                        BasicTextKt.a(text, nVarS4, textStyleA, (yh.l) objU3, iA, z12, i27, null, pVarF, (i14 & 14) | (i14 & bb.c.b.f30796me) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i28 = i27;
                        nVar3 = nVar8;
                        lVar3 = lVar8;
                        textStyle3 = textStyleA;
                        z13 = z12;
                        i29 = iA;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i31) {
                            ClickableTextKt.a(text, nVar3, textStyle3, z13, i29, i28, lVar3, onClick, pVar2, i12 | 1, i13);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i26 = 12582912;
                i14 |= i26;
                if ((23967451 & i14) == 4793490) {
                    if (i30 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:63)");
                    }
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = h2.g(null, null, 2, null);
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    a1Var = (a1) objU;
                    androidx.compose.ui.n.Companion companion7 = androidx.compose.ui.n.INSTANCE;
                    pVarF.T(511388516);
                    zS = pVarF.s(a1Var) | pVarF.s(onClick);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarS5 = nVar2.s0(SuspendingPointerInputFilterKt.c(companion7, onClick, (yh.p) objU2));
                    pVarF.T(511388516);
                    zS2 = pVarF.s(a1Var) | pVarF.s(lVar2);
                    objU3 = pVarF.U();
                    if (zS2) {
                        objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                                a1Var.setValue(it);
                                lVar2.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                                a1Var.setValue(it);
                                lVar2.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVar9 = nVar2;
                    yh.l<? super TextLayoutResult, b2> lVar9 = lVar2;
                    BasicTextKt.a(text, nVarS5, textStyleA, (yh.l) objU3, iA, z12, i27, null, pVarF, (i14 & 14) | (i14 & bb.c.b.f30796me) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i28 = i27;
                    nVar3 = nVar9;
                    lVar3 = lVar9;
                    textStyle3 = textStyleA;
                    z13 = z12;
                    i29 = iA;
                } else {
                    if (i30 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:63)");
                    }
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = h2.g(null, null, 2, null);
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    a1Var = (a1) objU;
                    androidx.compose.ui.n.Companion companion8 = androidx.compose.ui.n.INSTANCE;
                    pVarF.T(511388516);
                    zS = pVarF.s(a1Var) | pVarF.s(onClick);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarS6 = nVar2.s0(SuspendingPointerInputFilterKt.c(companion8, onClick, (yh.p) objU2));
                    pVarF.T(511388516);
                    zS2 = pVarF.s(a1Var) | pVarF.s(lVar2);
                    objU3 = pVarF.U();
                    if (zS2) {
                        objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                                a1Var.setValue(it);
                                lVar2.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                                a1Var.setValue(it);
                                lVar2.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVar10 = nVar2;
                    yh.l<? super TextLayoutResult, b2> lVar10 = lVar2;
                    BasicTextKt.a(text, nVarS6, textStyleA, (yh.l) objU3, iA, z12, i27, null, pVarF, (i14 & 14) | (i14 & bb.c.b.f30796me) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i28 = i27;
                    nVar3 = nVar10;
                    lVar3 = lVar10;
                    textStyle3 = textStyleA;
                    z13 = z12;
                    i29 = iA;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i31) {
                        ClickableTextKt.a(text, nVar3, textStyle3, z13, i29, i28, lVar3, onClick, pVar2, i12 | 1, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i14 |= bb.c.b.f30966u4;
            textStyle2 = textStyle;
            i17 = i13 & 8;
            if (i17 != 0) {
                if ((i12 & bb.c.g.f32954lc) == 0) {
                    z11 = z10;
                    if (pVarF.u(z11)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 16;
                if (i19 != 0) {
                    i14 |= 24576;
                    i20 = i10;
                } else {
                    i20 = i10;
                    if ((i12 & 57344) == 0) {
                        if (pVarF.y(i20)) {
                            i21 = 16384;
                        } else {
                            i21 = 8192;
                        }
                        i14 |= i21;
                    }
                }
                i22 = i13 & 32;
                if (i22 != 0) {
                    i14 |= androidx.profileinstaller.o.c.f26824k;
                } else if ((i12 & 458752) == 0) {
                    if (pVarF.y(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i14 |= i23;
                }
                i24 = i13 & 64;
                if (i24 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (pVarF.s(lVar)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i13 & 128) != 0) {
                    if ((29360128 & i12) == 0) {
                        if (pVarF.s(onClick)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                    }
                    if ((23967451 & i14) == 4793490) {
                        if (i30 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i20;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i24 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:63)");
                        }
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            objU = h2.g(null, null, 2, null);
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        a1Var = (a1) objU;
                        androidx.compose.ui.n.Companion companion9 = androidx.compose.ui.n.INSTANCE;
                        pVarF.T(511388516);
                        zS = pVarF.s(a1Var) | pVarF.s(onClick);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVarS7 = nVar2.s0(SuspendingPointerInputFilterKt.c(companion9, onClick, (yh.p) objU2));
                        pVarF.T(511388516);
                        zS2 = pVarF.s(a1Var) | pVarF.s(lVar2);
                        objU3 = pVarF.U();
                        if (zS2) {
                            objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                    a1Var.setValue(it);
                                    lVar2.invoke(it);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                            pVarF.N(objU3);
                        } else {
                            objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                    a1Var.setValue(it);
                                    lVar2.invoke(it);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                            pVarF.N(objU3);
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVar11 = nVar2;
                        yh.l<? super TextLayoutResult, b2> lVar11 = lVar2;
                        BasicTextKt.a(text, nVarS7, textStyleA, (yh.l) objU3, iA, z12, i27, null, pVarF, (i14 & 14) | (i14 & bb.c.b.f30796me) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i28 = i27;
                        nVar3 = nVar11;
                        lVar3 = lVar11;
                        textStyle3 = textStyleA;
                        z13 = z12;
                        i29 = iA;
                    } else {
                        if (i30 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i20;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i24 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:63)");
                        }
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            objU = h2.g(null, null, 2, null);
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        a1Var = (a1) objU;
                        androidx.compose.ui.n.Companion companion10 = androidx.compose.ui.n.INSTANCE;
                        pVarF.T(511388516);
                        zS = pVarF.s(a1Var) | pVarF.s(onClick);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVarS8 = nVar2.s0(SuspendingPointerInputFilterKt.c(companion10, onClick, (yh.p) objU2));
                        pVarF.T(511388516);
                        zS2 = pVarF.s(a1Var) | pVarF.s(lVar2);
                        objU3 = pVarF.U();
                        if (zS2) {
                            objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                    a1Var.setValue(it);
                                    lVar2.invoke(it);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                            pVarF.N(objU3);
                        } else {
                            objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                    a1Var.setValue(it);
                                    lVar2.invoke(it);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                            pVarF.N(objU3);
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVar12 = nVar2;
                        yh.l<? super TextLayoutResult, b2> lVar12 = lVar2;
                        BasicTextKt.a(text, nVarS8, textStyleA, (yh.l) objU3, iA, z12, i27, null, pVarF, (i14 & 14) | (i14 & bb.c.b.f30796me) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i28 = i27;
                        nVar3 = nVar12;
                        lVar3 = lVar12;
                        textStyle3 = textStyleA;
                        z13 = z12;
                        i29 = iA;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i31) {
                            ClickableTextKt.a(text, nVar3, textStyle3, z13, i29, i28, lVar3, onClick, pVar2, i12 | 1, i13);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i26 = 12582912;
                i14 |= i26;
                if ((23967451 & i14) == 4793490) {
                    if (i30 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:63)");
                    }
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = h2.g(null, null, 2, null);
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    a1Var = (a1) objU;
                    androidx.compose.ui.n.Companion companion11 = androidx.compose.ui.n.INSTANCE;
                    pVarF.T(511388516);
                    zS = pVarF.s(a1Var) | pVarF.s(onClick);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarS9 = nVar2.s0(SuspendingPointerInputFilterKt.c(companion11, onClick, (yh.p) objU2));
                    pVarF.T(511388516);
                    zS2 = pVarF.s(a1Var) | pVarF.s(lVar2);
                    objU3 = pVarF.U();
                    if (zS2) {
                        objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                                a1Var.setValue(it);
                                lVar2.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                                a1Var.setValue(it);
                                lVar2.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVar13 = nVar2;
                    yh.l<? super TextLayoutResult, b2> lVar13 = lVar2;
                    BasicTextKt.a(text, nVarS9, textStyleA, (yh.l) objU3, iA, z12, i27, null, pVarF, (i14 & 14) | (i14 & bb.c.b.f30796me) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i28 = i27;
                    nVar3 = nVar13;
                    lVar3 = lVar13;
                    textStyle3 = textStyleA;
                    z13 = z12;
                    i29 = iA;
                } else {
                    if (i30 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:63)");
                    }
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = h2.g(null, null, 2, null);
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    a1Var = (a1) objU;
                    androidx.compose.ui.n.Companion companion12 = androidx.compose.ui.n.INSTANCE;
                    pVarF.T(511388516);
                    zS = pVarF.s(a1Var) | pVarF.s(onClick);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarS10 = nVar2.s0(SuspendingPointerInputFilterKt.c(companion12, onClick, (yh.p) objU2));
                    pVarF.T(511388516);
                    zS2 = pVarF.s(a1Var) | pVarF.s(lVar2);
                    objU3 = pVarF.U();
                    if (zS2) {
                        objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                                a1Var.setValue(it);
                                lVar2.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                                a1Var.setValue(it);
                                lVar2.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVar14 = nVar2;
                    yh.l<? super TextLayoutResult, b2> lVar14 = lVar2;
                    BasicTextKt.a(text, nVarS10, textStyleA, (yh.l) objU3, iA, z12, i27, null, pVarF, (i14 & 14) | (i14 & bb.c.b.f30796me) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i28 = i27;
                    nVar3 = nVar14;
                    lVar3 = lVar14;
                    textStyle3 = textStyleA;
                    z13 = z12;
                    i29 = iA;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i31) {
                        ClickableTextKt.a(text, nVar3, textStyle3, z13, i29, i28, lVar3, onClick, pVar2, i12 | 1, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i14 |= bb.c.d.f31193dj;
            z11 = z10;
            i19 = i13 & 16;
            if (i19 != 0) {
                i14 |= 24576;
                i20 = i10;
            } else {
                i20 = i10;
                if ((i12 & 57344) == 0) {
                    if (pVarF.y(i20)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i14 |= i21;
                }
            }
            i22 = i13 & 32;
            if (i22 != 0) {
                i14 |= androidx.profileinstaller.o.c.f26824k;
            } else if ((i12 & 458752) == 0) {
                if (pVarF.y(i11)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i14 |= i23;
            }
            i24 = i13 & 64;
            if (i24 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (pVarF.s(lVar)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i14 |= i25;
            }
            if ((i13 & 128) != 0) {
                if ((29360128 & i12) == 0) {
                    if (pVarF.s(onClick)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                }
                if ((23967451 & i14) == 4793490) {
                    if (i30 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:63)");
                    }
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = h2.g(null, null, 2, null);
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    a1Var = (a1) objU;
                    androidx.compose.ui.n.Companion companion13 = androidx.compose.ui.n.INSTANCE;
                    pVarF.T(511388516);
                    zS = pVarF.s(a1Var) | pVarF.s(onClick);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarS11 = nVar2.s0(SuspendingPointerInputFilterKt.c(companion13, onClick, (yh.p) objU2));
                    pVarF.T(511388516);
                    zS2 = pVarF.s(a1Var) | pVarF.s(lVar2);
                    objU3 = pVarF.U();
                    if (zS2) {
                        objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                                a1Var.setValue(it);
                                lVar2.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                                a1Var.setValue(it);
                                lVar2.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVar15 = nVar2;
                    yh.l<? super TextLayoutResult, b2> lVar15 = lVar2;
                    BasicTextKt.a(text, nVarS11, textStyleA, (yh.l) objU3, iA, z12, i27, null, pVarF, (i14 & 14) | (i14 & bb.c.b.f30796me) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i28 = i27;
                    nVar3 = nVar15;
                    lVar3 = lVar15;
                    textStyle3 = textStyleA;
                    z13 = z12;
                    i29 = iA;
                } else {
                    if (i30 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:63)");
                    }
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = h2.g(null, null, 2, null);
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    a1Var = (a1) objU;
                    androidx.compose.ui.n.Companion companion14 = androidx.compose.ui.n.INSTANCE;
                    pVarF.T(511388516);
                    zS = pVarF.s(a1Var) | pVarF.s(onClick);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarS12 = nVar2.s0(SuspendingPointerInputFilterKt.c(companion14, onClick, (yh.p) objU2));
                    pVarF.T(511388516);
                    zS2 = pVarF.s(a1Var) | pVarF.s(lVar2);
                    objU3 = pVarF.U();
                    if (zS2) {
                        objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                                a1Var.setValue(it);
                                lVar2.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                                a1Var.setValue(it);
                                lVar2.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVar16 = nVar2;
                    yh.l<? super TextLayoutResult, b2> lVar16 = lVar2;
                    BasicTextKt.a(text, nVarS12, textStyleA, (yh.l) objU3, iA, z12, i27, null, pVarF, (i14 & 14) | (i14 & bb.c.b.f30796me) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i28 = i27;
                    nVar3 = nVar16;
                    lVar3 = lVar16;
                    textStyle3 = textStyleA;
                    z13 = z12;
                    i29 = iA;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i31) {
                        ClickableTextKt.a(text, nVar3, textStyle3, z13, i29, i28, lVar3, onClick, pVar2, i12 | 1, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i26 = 12582912;
            i14 |= i26;
            if ((23967451 & i14) == 4793490) {
                if (i30 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i15 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle2;
                }
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i19 != 0) {
                    iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                } else {
                    iA = i20;
                }
                if (i22 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i11;
                }
                if (i24 != 0) {
                    lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                } else {
                    lVar2 = lVar;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:63)");
                }
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = h2.g(null, null, 2, null);
                    pVarF.N(objU);
                }
                pVarF.c0();
                a1Var = (a1) objU;
                androidx.compose.ui.n.Companion companion15 = androidx.compose.ui.n.INSTANCE;
                pVarF.T(511388516);
                zS = pVarF.s(a1Var) | pVarF.s(onClick);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                    pVarF.N(objU2);
                } else {
                    objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                androidx.compose.ui.n nVarS13 = nVar2.s0(SuspendingPointerInputFilterKt.c(companion15, onClick, (yh.p) objU2));
                pVarF.T(511388516);
                zS2 = pVarF.s(a1Var) | pVarF.s(lVar2);
                objU3 = pVarF.U();
                if (zS2) {
                    objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                            a1Var.setValue(it);
                            lVar2.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                            a1Var.setValue(it);
                            lVar2.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                }
                pVarF.c0();
                androidx.compose.ui.n nVar17 = nVar2;
                yh.l<? super TextLayoutResult, b2> lVar17 = lVar2;
                BasicTextKt.a(text, nVarS13, textStyleA, (yh.l) objU3, iA, z12, i27, null, pVarF, (i14 & 14) | (i14 & bb.c.b.f30796me) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                i28 = i27;
                nVar3 = nVar17;
                lVar3 = lVar17;
                textStyle3 = textStyleA;
                z13 = z12;
                i29 = iA;
            } else {
                if (i30 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i15 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle2;
                }
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i19 != 0) {
                    iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                } else {
                    iA = i20;
                }
                if (i22 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i11;
                }
                if (i24 != 0) {
                    lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                } else {
                    lVar2 = lVar;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:63)");
                }
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = h2.g(null, null, 2, null);
                    pVarF.N(objU);
                }
                pVarF.c0();
                a1Var = (a1) objU;
                androidx.compose.ui.n.Companion companion16 = androidx.compose.ui.n.INSTANCE;
                pVarF.T(511388516);
                zS = pVarF.s(a1Var) | pVarF.s(onClick);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                    pVarF.N(objU2);
                } else {
                    objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                androidx.compose.ui.n nVarS14 = nVar2.s0(SuspendingPointerInputFilterKt.c(companion16, onClick, (yh.p) objU2));
                pVarF.T(511388516);
                zS2 = pVarF.s(a1Var) | pVarF.s(lVar2);
                objU3 = pVarF.U();
                if (zS2) {
                    objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                            a1Var.setValue(it);
                            lVar2.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                            a1Var.setValue(it);
                            lVar2.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                }
                pVarF.c0();
                androidx.compose.ui.n nVar18 = nVar2;
                yh.l<? super TextLayoutResult, b2> lVar18 = lVar2;
                BasicTextKt.a(text, nVarS14, textStyleA, (yh.l) objU3, iA, z12, i27, null, pVarF, (i14 & 14) | (i14 & bb.c.b.f30796me) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                i28 = i27;
                nVar3 = nVar18;
                lVar3 = lVar18;
                textStyle3 = textStyleA;
                z13 = z12;
                i29 = iA;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i31) {
                    ClickableTextKt.a(text, nVar3, textStyle3, z13, i29, i28, lVar3, onClick, pVar2, i12 | 1, i13);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i14 |= 48;
        nVar2 = nVar;
        i15 = i13 & 4;
        if (i15 != 0) {
            if ((i12 & bb.c.b.f30796me) == 0) {
                textStyle2 = textStyle;
                if (pVarF.s(textStyle2)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i14 |= i16;
            }
            i17 = i13 & 8;
            if (i17 != 0) {
                if ((i12 & bb.c.g.f32954lc) == 0) {
                    z11 = z10;
                    if (pVarF.u(z11)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 16;
                if (i19 != 0) {
                    i14 |= 24576;
                    i20 = i10;
                } else {
                    i20 = i10;
                    if ((i12 & 57344) == 0) {
                        if (pVarF.y(i20)) {
                            i21 = 16384;
                        } else {
                            i21 = 8192;
                        }
                        i14 |= i21;
                    }
                }
                i22 = i13 & 32;
                if (i22 != 0) {
                    i14 |= androidx.profileinstaller.o.c.f26824k;
                } else if ((i12 & 458752) == 0) {
                    if (pVarF.y(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i14 |= i23;
                }
                i24 = i13 & 64;
                if (i24 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (pVarF.s(lVar)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i13 & 128) != 0) {
                    if ((29360128 & i12) == 0) {
                        if (pVarF.s(onClick)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                    }
                    if ((23967451 & i14) == 4793490) {
                        if (i30 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i20;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i24 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:63)");
                        }
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            objU = h2.g(null, null, 2, null);
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        a1Var = (a1) objU;
                        androidx.compose.ui.n.Companion companion17 = androidx.compose.ui.n.INSTANCE;
                        pVarF.T(511388516);
                        zS = pVarF.s(a1Var) | pVarF.s(onClick);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVarS15 = nVar2.s0(SuspendingPointerInputFilterKt.c(companion17, onClick, (yh.p) objU2));
                        pVarF.T(511388516);
                        zS2 = pVarF.s(a1Var) | pVarF.s(lVar2);
                        objU3 = pVarF.U();
                        if (zS2) {
                            objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                    a1Var.setValue(it);
                                    lVar2.invoke(it);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                            pVarF.N(objU3);
                        } else {
                            objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                    a1Var.setValue(it);
                                    lVar2.invoke(it);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                            pVarF.N(objU3);
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVar19 = nVar2;
                        yh.l<? super TextLayoutResult, b2> lVar19 = lVar2;
                        BasicTextKt.a(text, nVarS15, textStyleA, (yh.l) objU3, iA, z12, i27, null, pVarF, (i14 & 14) | (i14 & bb.c.b.f30796me) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i28 = i27;
                        nVar3 = nVar19;
                        lVar3 = lVar19;
                        textStyle3 = textStyleA;
                        z13 = z12;
                        i29 = iA;
                    } else {
                        if (i30 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        } else {
                            iA = i20;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i24 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar2 = lVar;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:63)");
                        }
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            objU = h2.g(null, null, 2, null);
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        a1Var = (a1) objU;
                        androidx.compose.ui.n.Companion companion18 = androidx.compose.ui.n.INSTANCE;
                        pVarF.T(511388516);
                        zS = pVarF.s(a1Var) | pVarF.s(onClick);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVarS16 = nVar2.s0(SuspendingPointerInputFilterKt.c(companion18, onClick, (yh.p) objU2));
                        pVarF.T(511388516);
                        zS2 = pVarF.s(a1Var) | pVarF.s(lVar2);
                        objU3 = pVarF.U();
                        if (zS2) {
                            objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                    a1Var.setValue(it);
                                    lVar2.invoke(it);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                            pVarF.N(objU3);
                        } else {
                            objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                    a1Var.setValue(it);
                                    lVar2.invoke(it);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                            pVarF.N(objU3);
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVar110 = nVar2;
                        yh.l<? super TextLayoutResult, b2> lVar110 = lVar2;
                        BasicTextKt.a(text, nVarS16, textStyleA, (yh.l) objU3, iA, z12, i27, null, pVarF, (i14 & 14) | (i14 & bb.c.b.f30796me) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i28 = i27;
                        nVar3 = nVar110;
                        lVar3 = lVar110;
                        textStyle3 = textStyleA;
                        z13 = z12;
                        i29 = iA;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i31) {
                            ClickableTextKt.a(text, nVar3, textStyle3, z13, i29, i28, lVar3, onClick, pVar2, i12 | 1, i13);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i26 = 12582912;
                i14 |= i26;
                if ((23967451 & i14) == 4793490) {
                    if (i30 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:63)");
                    }
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = h2.g(null, null, 2, null);
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    a1Var = (a1) objU;
                    androidx.compose.ui.n.Companion companion19 = androidx.compose.ui.n.INSTANCE;
                    pVarF.T(511388516);
                    zS = pVarF.s(a1Var) | pVarF.s(onClick);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarS17 = nVar2.s0(SuspendingPointerInputFilterKt.c(companion19, onClick, (yh.p) objU2));
                    pVarF.T(511388516);
                    zS2 = pVarF.s(a1Var) | pVarF.s(lVar2);
                    objU3 = pVarF.U();
                    if (zS2) {
                        objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                                a1Var.setValue(it);
                                lVar2.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                                a1Var.setValue(it);
                                lVar2.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVar111 = nVar2;
                    yh.l<? super TextLayoutResult, b2> lVar111 = lVar2;
                    BasicTextKt.a(text, nVarS17, textStyleA, (yh.l) objU3, iA, z12, i27, null, pVarF, (i14 & 14) | (i14 & bb.c.b.f30796me) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i28 = i27;
                    nVar3 = nVar111;
                    lVar3 = lVar111;
                    textStyle3 = textStyleA;
                    z13 = z12;
                    i29 = iA;
                } else {
                    if (i30 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:63)");
                    }
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = h2.g(null, null, 2, null);
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    a1Var = (a1) objU;
                    androidx.compose.ui.n.Companion companion110 = androidx.compose.ui.n.INSTANCE;
                    pVarF.T(511388516);
                    zS = pVarF.s(a1Var) | pVarF.s(onClick);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarS18 = nVar2.s0(SuspendingPointerInputFilterKt.c(companion110, onClick, (yh.p) objU2));
                    pVarF.T(511388516);
                    zS2 = pVarF.s(a1Var) | pVarF.s(lVar2);
                    objU3 = pVarF.U();
                    if (zS2) {
                        objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                                a1Var.setValue(it);
                                lVar2.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                                a1Var.setValue(it);
                                lVar2.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVar112 = nVar2;
                    yh.l<? super TextLayoutResult, b2> lVar112 = lVar2;
                    BasicTextKt.a(text, nVarS18, textStyleA, (yh.l) objU3, iA, z12, i27, null, pVarF, (i14 & 14) | (i14 & bb.c.b.f30796me) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i28 = i27;
                    nVar3 = nVar112;
                    lVar3 = lVar112;
                    textStyle3 = textStyleA;
                    z13 = z12;
                    i29 = iA;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i31) {
                        ClickableTextKt.a(text, nVar3, textStyle3, z13, i29, i28, lVar3, onClick, pVar2, i12 | 1, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i14 |= bb.c.d.f31193dj;
            z11 = z10;
            i19 = i13 & 16;
            if (i19 != 0) {
                i14 |= 24576;
                i20 = i10;
            } else {
                i20 = i10;
                if ((i12 & 57344) == 0) {
                    if (pVarF.y(i20)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i14 |= i21;
                }
            }
            i22 = i13 & 32;
            if (i22 != 0) {
                i14 |= androidx.profileinstaller.o.c.f26824k;
            } else if ((i12 & 458752) == 0) {
                if (pVarF.y(i11)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i14 |= i23;
            }
            i24 = i13 & 64;
            if (i24 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (pVarF.s(lVar)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i14 |= i25;
            }
            if ((i13 & 128) != 0) {
                if ((29360128 & i12) == 0) {
                    if (pVarF.s(onClick)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                }
                if ((23967451 & i14) == 4793490) {
                    if (i30 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:63)");
                    }
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = h2.g(null, null, 2, null);
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    a1Var = (a1) objU;
                    androidx.compose.ui.n.Companion companion111 = androidx.compose.ui.n.INSTANCE;
                    pVarF.T(511388516);
                    zS = pVarF.s(a1Var) | pVarF.s(onClick);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarS19 = nVar2.s0(SuspendingPointerInputFilterKt.c(companion111, onClick, (yh.p) objU2));
                    pVarF.T(511388516);
                    zS2 = pVarF.s(a1Var) | pVarF.s(lVar2);
                    objU3 = pVarF.U();
                    if (zS2) {
                        objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                                a1Var.setValue(it);
                                lVar2.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                                a1Var.setValue(it);
                                lVar2.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVar113 = nVar2;
                    yh.l<? super TextLayoutResult, b2> lVar113 = lVar2;
                    BasicTextKt.a(text, nVarS19, textStyleA, (yh.l) objU3, iA, z12, i27, null, pVarF, (i14 & 14) | (i14 & bb.c.b.f30796me) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i28 = i27;
                    nVar3 = nVar113;
                    lVar3 = lVar113;
                    textStyle3 = textStyleA;
                    z13 = z12;
                    i29 = iA;
                } else {
                    if (i30 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:63)");
                    }
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = h2.g(null, null, 2, null);
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    a1Var = (a1) objU;
                    androidx.compose.ui.n.Companion companion112 = androidx.compose.ui.n.INSTANCE;
                    pVarF.T(511388516);
                    zS = pVarF.s(a1Var) | pVarF.s(onClick);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarS110 = nVar2.s0(SuspendingPointerInputFilterKt.c(companion112, onClick, (yh.p) objU2));
                    pVarF.T(511388516);
                    zS2 = pVarF.s(a1Var) | pVarF.s(lVar2);
                    objU3 = pVarF.U();
                    if (zS2) {
                        objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                                a1Var.setValue(it);
                                lVar2.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                                a1Var.setValue(it);
                                lVar2.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVar114 = nVar2;
                    yh.l<? super TextLayoutResult, b2> lVar114 = lVar2;
                    BasicTextKt.a(text, nVarS110, textStyleA, (yh.l) objU3, iA, z12, i27, null, pVarF, (i14 & 14) | (i14 & bb.c.b.f30796me) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i28 = i27;
                    nVar3 = nVar114;
                    lVar3 = lVar114;
                    textStyle3 = textStyleA;
                    z13 = z12;
                    i29 = iA;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i31) {
                        ClickableTextKt.a(text, nVar3, textStyle3, z13, i29, i28, lVar3, onClick, pVar2, i12 | 1, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i26 = 12582912;
            i14 |= i26;
            if ((23967451 & i14) == 4793490) {
                if (i30 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i15 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle2;
                }
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i19 != 0) {
                    iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                } else {
                    iA = i20;
                }
                if (i22 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i11;
                }
                if (i24 != 0) {
                    lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                } else {
                    lVar2 = lVar;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:63)");
                }
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = h2.g(null, null, 2, null);
                    pVarF.N(objU);
                }
                pVarF.c0();
                a1Var = (a1) objU;
                androidx.compose.ui.n.Companion companion113 = androidx.compose.ui.n.INSTANCE;
                pVarF.T(511388516);
                zS = pVarF.s(a1Var) | pVarF.s(onClick);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                    pVarF.N(objU2);
                } else {
                    objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                androidx.compose.ui.n nVarS111 = nVar2.s0(SuspendingPointerInputFilterKt.c(companion113, onClick, (yh.p) objU2));
                pVarF.T(511388516);
                zS2 = pVarF.s(a1Var) | pVarF.s(lVar2);
                objU3 = pVarF.U();
                if (zS2) {
                    objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                            a1Var.setValue(it);
                            lVar2.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                            a1Var.setValue(it);
                            lVar2.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                }
                pVarF.c0();
                androidx.compose.ui.n nVar115 = nVar2;
                yh.l<? super TextLayoutResult, b2> lVar115 = lVar2;
                BasicTextKt.a(text, nVarS111, textStyleA, (yh.l) objU3, iA, z12, i27, null, pVarF, (i14 & 14) | (i14 & bb.c.b.f30796me) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                i28 = i27;
                nVar3 = nVar115;
                lVar3 = lVar115;
                textStyle3 = textStyleA;
                z13 = z12;
                i29 = iA;
            } else {
                if (i30 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i15 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle2;
                }
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i19 != 0) {
                    iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                } else {
                    iA = i20;
                }
                if (i22 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i11;
                }
                if (i24 != 0) {
                    lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                } else {
                    lVar2 = lVar;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:63)");
                }
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = h2.g(null, null, 2, null);
                    pVarF.N(objU);
                }
                pVarF.c0();
                a1Var = (a1) objU;
                androidx.compose.ui.n.Companion companion114 = androidx.compose.ui.n.INSTANCE;
                pVarF.T(511388516);
                zS = pVarF.s(a1Var) | pVarF.s(onClick);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                    pVarF.N(objU2);
                } else {
                    objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                androidx.compose.ui.n nVarS112 = nVar2.s0(SuspendingPointerInputFilterKt.c(companion114, onClick, (yh.p) objU2));
                pVarF.T(511388516);
                zS2 = pVarF.s(a1Var) | pVarF.s(lVar2);
                objU3 = pVarF.U();
                if (zS2) {
                    objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                            a1Var.setValue(it);
                            lVar2.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                            a1Var.setValue(it);
                            lVar2.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                }
                pVarF.c0();
                androidx.compose.ui.n nVar116 = nVar2;
                yh.l<? super TextLayoutResult, b2> lVar116 = lVar2;
                BasicTextKt.a(text, nVarS112, textStyleA, (yh.l) objU3, iA, z12, i27, null, pVarF, (i14 & 14) | (i14 & bb.c.b.f30796me) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                i28 = i27;
                nVar3 = nVar116;
                lVar3 = lVar116;
                textStyle3 = textStyleA;
                z13 = z12;
                i29 = iA;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i31) {
                    ClickableTextKt.a(text, nVar3, textStyle3, z13, i29, i28, lVar3, onClick, pVar2, i12 | 1, i13);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i14 |= bb.c.b.f30966u4;
        textStyle2 = textStyle;
        i17 = i13 & 8;
        if (i17 != 0) {
            if ((i12 & bb.c.g.f32954lc) == 0) {
                z11 = z10;
                if (pVarF.u(z11)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i14 |= i18;
            }
            i19 = i13 & 16;
            if (i19 != 0) {
                i14 |= 24576;
                i20 = i10;
            } else {
                i20 = i10;
                if ((i12 & 57344) == 0) {
                    if (pVarF.y(i20)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i14 |= i21;
                }
            }
            i22 = i13 & 32;
            if (i22 != 0) {
                i14 |= androidx.profileinstaller.o.c.f26824k;
            } else if ((i12 & 458752) == 0) {
                if (pVarF.y(i11)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i14 |= i23;
            }
            i24 = i13 & 64;
            if (i24 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (pVarF.s(lVar)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i14 |= i25;
            }
            if ((i13 & 128) != 0) {
                if ((29360128 & i12) == 0) {
                    if (pVarF.s(onClick)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                }
                if ((23967451 & i14) == 4793490) {
                    if (i30 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:63)");
                    }
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = h2.g(null, null, 2, null);
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    a1Var = (a1) objU;
                    androidx.compose.ui.n.Companion companion115 = androidx.compose.ui.n.INSTANCE;
                    pVarF.T(511388516);
                    zS = pVarF.s(a1Var) | pVarF.s(onClick);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarS113 = nVar2.s0(SuspendingPointerInputFilterKt.c(companion115, onClick, (yh.p) objU2));
                    pVarF.T(511388516);
                    zS2 = pVarF.s(a1Var) | pVarF.s(lVar2);
                    objU3 = pVarF.U();
                    if (zS2) {
                        objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                                a1Var.setValue(it);
                                lVar2.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                                a1Var.setValue(it);
                                lVar2.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVar117 = nVar2;
                    yh.l<? super TextLayoutResult, b2> lVar117 = lVar2;
                    BasicTextKt.a(text, nVarS113, textStyleA, (yh.l) objU3, iA, z12, i27, null, pVarF, (i14 & 14) | (i14 & bb.c.b.f30796me) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i28 = i27;
                    nVar3 = nVar117;
                    lVar3 = lVar117;
                    textStyle3 = textStyleA;
                    z13 = z12;
                    i29 = iA;
                } else {
                    if (i30 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    } else {
                        iA = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar2 = lVar;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:63)");
                    }
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = h2.g(null, null, 2, null);
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    a1Var = (a1) objU;
                    androidx.compose.ui.n.Companion companion116 = androidx.compose.ui.n.INSTANCE;
                    pVarF.T(511388516);
                    zS = pVarF.s(a1Var) | pVarF.s(onClick);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarS114 = nVar2.s0(SuspendingPointerInputFilterKt.c(companion116, onClick, (yh.p) objU2));
                    pVarF.T(511388516);
                    zS2 = pVarF.s(a1Var) | pVarF.s(lVar2);
                    objU3 = pVarF.U();
                    if (zS2) {
                        objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                                a1Var.setValue(it);
                                lVar2.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                                a1Var.setValue(it);
                                lVar2.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVar118 = nVar2;
                    yh.l<? super TextLayoutResult, b2> lVar118 = lVar2;
                    BasicTextKt.a(text, nVarS114, textStyleA, (yh.l) objU3, iA, z12, i27, null, pVarF, (i14 & 14) | (i14 & bb.c.b.f30796me) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i28 = i27;
                    nVar3 = nVar118;
                    lVar3 = lVar118;
                    textStyle3 = textStyleA;
                    z13 = z12;
                    i29 = iA;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i31) {
                        ClickableTextKt.a(text, nVar3, textStyle3, z13, i29, i28, lVar3, onClick, pVar2, i12 | 1, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i26 = 12582912;
            i14 |= i26;
            if ((23967451 & i14) == 4793490) {
                if (i30 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i15 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle2;
                }
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i19 != 0) {
                    iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                } else {
                    iA = i20;
                }
                if (i22 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i11;
                }
                if (i24 != 0) {
                    lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                } else {
                    lVar2 = lVar;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:63)");
                }
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = h2.g(null, null, 2, null);
                    pVarF.N(objU);
                }
                pVarF.c0();
                a1Var = (a1) objU;
                androidx.compose.ui.n.Companion companion117 = androidx.compose.ui.n.INSTANCE;
                pVarF.T(511388516);
                zS = pVarF.s(a1Var) | pVarF.s(onClick);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                    pVarF.N(objU2);
                } else {
                    objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                androidx.compose.ui.n nVarS115 = nVar2.s0(SuspendingPointerInputFilterKt.c(companion117, onClick, (yh.p) objU2));
                pVarF.T(511388516);
                zS2 = pVarF.s(a1Var) | pVarF.s(lVar2);
                objU3 = pVarF.U();
                if (zS2) {
                    objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                            a1Var.setValue(it);
                            lVar2.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                            a1Var.setValue(it);
                            lVar2.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                }
                pVarF.c0();
                androidx.compose.ui.n nVar119 = nVar2;
                yh.l<? super TextLayoutResult, b2> lVar119 = lVar2;
                BasicTextKt.a(text, nVarS115, textStyleA, (yh.l) objU3, iA, z12, i27, null, pVarF, (i14 & 14) | (i14 & bb.c.b.f30796me) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                i28 = i27;
                nVar3 = nVar119;
                lVar3 = lVar119;
                textStyle3 = textStyleA;
                z13 = z12;
                i29 = iA;
            } else {
                if (i30 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i15 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle2;
                }
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i19 != 0) {
                    iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                } else {
                    iA = i20;
                }
                if (i22 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i11;
                }
                if (i24 != 0) {
                    lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                } else {
                    lVar2 = lVar;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:63)");
                }
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = h2.g(null, null, 2, null);
                    pVarF.N(objU);
                }
                pVarF.c0();
                a1Var = (a1) objU;
                androidx.compose.ui.n.Companion companion118 = androidx.compose.ui.n.INSTANCE;
                pVarF.T(511388516);
                zS = pVarF.s(a1Var) | pVarF.s(onClick);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                    pVarF.N(objU2);
                } else {
                    objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                androidx.compose.ui.n nVarS116 = nVar2.s0(SuspendingPointerInputFilterKt.c(companion118, onClick, (yh.p) objU2));
                pVarF.T(511388516);
                zS2 = pVarF.s(a1Var) | pVarF.s(lVar2);
                objU3 = pVarF.U();
                if (zS2) {
                    objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                            a1Var.setValue(it);
                            lVar2.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                            a1Var.setValue(it);
                            lVar2.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                }
                pVarF.c0();
                androidx.compose.ui.n nVar1110 = nVar2;
                yh.l<? super TextLayoutResult, b2> lVar1110 = lVar2;
                BasicTextKt.a(text, nVarS116, textStyleA, (yh.l) objU3, iA, z12, i27, null, pVarF, (i14 & 14) | (i14 & bb.c.b.f30796me) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                i28 = i27;
                nVar3 = nVar1110;
                lVar3 = lVar1110;
                textStyle3 = textStyleA;
                z13 = z12;
                i29 = iA;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i31) {
                    ClickableTextKt.a(text, nVar3, textStyle3, z13, i29, i28, lVar3, onClick, pVar2, i12 | 1, i13);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i14 |= bb.c.d.f31193dj;
        z11 = z10;
        i19 = i13 & 16;
        if (i19 != 0) {
            i14 |= 24576;
            i20 = i10;
        } else {
            i20 = i10;
            if ((i12 & 57344) == 0) {
                if (pVarF.y(i20)) {
                    i21 = 16384;
                } else {
                    i21 = 8192;
                }
                i14 |= i21;
            }
        }
        i22 = i13 & 32;
        if (i22 != 0) {
            i14 |= androidx.profileinstaller.o.c.f26824k;
        } else if ((i12 & 458752) == 0) {
            if (pVarF.y(i11)) {
                i23 = 131072;
            } else {
                i23 = 65536;
            }
            i14 |= i23;
        }
        i24 = i13 & 64;
        if (i24 != 0) {
            i14 |= 1572864;
        } else if ((i12 & 3670016) == 0) {
            if (pVarF.s(lVar)) {
                i25 = 1048576;
            } else {
                i25 = 524288;
            }
            i14 |= i25;
        }
        if ((i13 & 128) != 0) {
            if ((29360128 & i12) == 0) {
                if (pVarF.s(onClick)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
            }
            if ((23967451 & i14) == 4793490) {
                if (i30 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i15 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle2;
                }
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i19 != 0) {
                    iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                } else {
                    iA = i20;
                }
                if (i22 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i11;
                }
                if (i24 != 0) {
                    lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                } else {
                    lVar2 = lVar;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:63)");
                }
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = h2.g(null, null, 2, null);
                    pVarF.N(objU);
                }
                pVarF.c0();
                a1Var = (a1) objU;
                androidx.compose.ui.n.Companion companion119 = androidx.compose.ui.n.INSTANCE;
                pVarF.T(511388516);
                zS = pVarF.s(a1Var) | pVarF.s(onClick);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                    pVarF.N(objU2);
                } else {
                    objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                androidx.compose.ui.n nVarS117 = nVar2.s0(SuspendingPointerInputFilterKt.c(companion119, onClick, (yh.p) objU2));
                pVarF.T(511388516);
                zS2 = pVarF.s(a1Var) | pVarF.s(lVar2);
                objU3 = pVarF.U();
                if (zS2) {
                    objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                            a1Var.setValue(it);
                            lVar2.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                            a1Var.setValue(it);
                            lVar2.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                }
                pVarF.c0();
                androidx.compose.ui.n nVar1111 = nVar2;
                yh.l<? super TextLayoutResult, b2> lVar1111 = lVar2;
                BasicTextKt.a(text, nVarS117, textStyleA, (yh.l) objU3, iA, z12, i27, null, pVarF, (i14 & 14) | (i14 & bb.c.b.f30796me) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                i28 = i27;
                nVar3 = nVar1111;
                lVar3 = lVar1111;
                textStyle3 = textStyleA;
                z13 = z12;
                i29 = iA;
            } else {
                if (i30 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i15 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle2;
                }
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i19 != 0) {
                    iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                } else {
                    iA = i20;
                }
                if (i22 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i11;
                }
                if (i24 != 0) {
                    lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                } else {
                    lVar2 = lVar;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:63)");
                }
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = h2.g(null, null, 2, null);
                    pVarF.N(objU);
                }
                pVarF.c0();
                a1Var = (a1) objU;
                androidx.compose.ui.n.Companion companion1110 = androidx.compose.ui.n.INSTANCE;
                pVarF.T(511388516);
                zS = pVarF.s(a1Var) | pVarF.s(onClick);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                    pVarF.N(objU2);
                } else {
                    objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                androidx.compose.ui.n nVarS118 = nVar2.s0(SuspendingPointerInputFilterKt.c(companion1110, onClick, (yh.p) objU2));
                pVarF.T(511388516);
                zS2 = pVarF.s(a1Var) | pVarF.s(lVar2);
                objU3 = pVarF.U();
                if (zS2) {
                    objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                            a1Var.setValue(it);
                            lVar2.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                            a1Var.setValue(it);
                            lVar2.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                }
                pVarF.c0();
                androidx.compose.ui.n nVar1112 = nVar2;
                yh.l<? super TextLayoutResult, b2> lVar1112 = lVar2;
                BasicTextKt.a(text, nVarS118, textStyleA, (yh.l) objU3, iA, z12, i27, null, pVarF, (i14 & 14) | (i14 & bb.c.b.f30796me) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                i28 = i27;
                nVar3 = nVar1112;
                lVar3 = lVar1112;
                textStyle3 = textStyleA;
                z13 = z12;
                i29 = iA;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i31) {
                    ClickableTextKt.a(text, nVar3, textStyle3, z13, i29, i28, lVar3, onClick, pVar2, i12 | 1, i13);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i26 = 12582912;
        i14 |= i26;
        if ((23967451 & i14) == 4793490) {
            if (i30 != 0) {
                nVar2 = androidx.compose.ui.n.INSTANCE;
            }
            if (i15 != 0) {
                textStyleA = TextStyle.INSTANCE.a();
            } else {
                textStyleA = textStyle2;
            }
            if (i17 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (i19 != 0) {
                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
            } else {
                iA = i20;
            }
            if (i22 != 0) {
                i27 = Integer.MAX_VALUE;
            } else {
                i27 = i11;
            }
            if (i24 != 0) {
                lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                    public final void a(@dl.d TextLayoutResult it) {
                        f0.p(it, "it");
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                        a(textLayoutResult);
                        return b2.f124493a;
                    }
                };
            } else {
                lVar2 = lVar;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:63)");
            }
            pVarF.T(-492369756);
            objU = pVarF.U();
            companion = androidx.compose.runtime.p.INSTANCE;
            if (objU == companion.a()) {
                objU = h2.g(null, null, 2, null);
                pVarF.N(objU);
            }
            pVarF.c0();
            a1Var = (a1) objU;
            androidx.compose.ui.n.Companion companion1111 = androidx.compose.ui.n.INSTANCE;
            pVarF.T(511388516);
            zS = pVarF.s(a1Var) | pVarF.s(onClick);
            objU2 = pVarF.U();
            if (zS) {
                objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                pVarF.N(objU2);
            } else {
                objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                pVarF.N(objU2);
            }
            pVarF.c0();
            androidx.compose.ui.n nVarS119 = nVar2.s0(SuspendingPointerInputFilterKt.c(companion1111, onClick, (yh.p) objU2));
            pVarF.T(511388516);
            zS2 = pVarF.s(a1Var) | pVarF.s(lVar2);
            objU3 = pVarF.U();
            if (zS2) {
                objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void a(@dl.d TextLayoutResult it) {
                        f0.p(it, "it");
                        a1Var.setValue(it);
                        lVar2.invoke(it);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                        a(textLayoutResult);
                        return b2.f124493a;
                    }
                };
                pVarF.N(objU3);
            } else {
                objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void a(@dl.d TextLayoutResult it) {
                        f0.p(it, "it");
                        a1Var.setValue(it);
                        lVar2.invoke(it);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                        a(textLayoutResult);
                        return b2.f124493a;
                    }
                };
                pVarF.N(objU3);
            }
            pVarF.c0();
            androidx.compose.ui.n nVar1113 = nVar2;
            yh.l<? super TextLayoutResult, b2> lVar1113 = lVar2;
            BasicTextKt.a(text, nVarS119, textStyleA, (yh.l) objU3, iA, z12, i27, null, pVarF, (i14 & 14) | (i14 & bb.c.b.f30796me) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            i28 = i27;
            nVar3 = nVar1113;
            lVar3 = lVar1113;
            textStyle3 = textStyleA;
            z13 = z12;
            i29 = iA;
        } else {
            if (i30 != 0) {
                nVar2 = androidx.compose.ui.n.INSTANCE;
            }
            if (i15 != 0) {
                textStyleA = TextStyle.INSTANCE.a();
            } else {
                textStyleA = textStyle2;
            }
            if (i17 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (i19 != 0) {
                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
            } else {
                iA = i20;
            }
            if (i22 != 0) {
                i27 = Integer.MAX_VALUE;
            } else {
                i27 = i11;
            }
            if (i24 != 0) {
                lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                    public final void a(@dl.d TextLayoutResult it) {
                        f0.p(it, "it");
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                        a(textLayoutResult);
                        return b2.f124493a;
                    }
                };
            } else {
                lVar2 = lVar;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:63)");
            }
            pVarF.T(-492369756);
            objU = pVarF.U();
            companion = androidx.compose.runtime.p.INSTANCE;
            if (objU == companion.a()) {
                objU = h2.g(null, null, 2, null);
                pVarF.N(objU);
            }
            pVarF.c0();
            a1Var = (a1) objU;
            androidx.compose.ui.n.Companion companion1112 = androidx.compose.ui.n.INSTANCE;
            pVarF.T(511388516);
            zS = pVarF.s(a1Var) | pVarF.s(onClick);
            objU2 = pVarF.U();
            if (zS) {
                objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                pVarF.N(objU2);
            } else {
                objU2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(a1Var, onClick, null);
                pVarF.N(objU2);
            }
            pVarF.c0();
            androidx.compose.ui.n nVarS1110 = nVar2.s0(SuspendingPointerInputFilterKt.c(companion1112, onClick, (yh.p) objU2));
            pVarF.T(511388516);
            zS2 = pVarF.s(a1Var) | pVarF.s(lVar2);
            objU3 = pVarF.U();
            if (zS2) {
                objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void a(@dl.d TextLayoutResult it) {
                        f0.p(it, "it");
                        a1Var.setValue(it);
                        lVar2.invoke(it);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                        a(textLayoutResult);
                        return b2.f124493a;
                    }
                };
                pVarF.N(objU3);
            } else {
                objU3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void a(@dl.d TextLayoutResult it) {
                        f0.p(it, "it");
                        a1Var.setValue(it);
                        lVar2.invoke(it);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                        a(textLayoutResult);
                        return b2.f124493a;
                    }
                };
                pVarF.N(objU3);
            }
            pVarF.c0();
            androidx.compose.ui.n nVar1114 = nVar2;
            yh.l<? super TextLayoutResult, b2> lVar1114 = lVar2;
            BasicTextKt.a(text, nVarS1110, textStyleA, (yh.l) objU3, iA, z12, i27, null, pVarF, (i14 & 14) | (i14 & bb.c.b.f30796me) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            i28 = i27;
            nVar3 = nVar1114;
            lVar3 = lVar1114;
            textStyle3 = textStyleA;
            z13 = z12;
            i29 = iA;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i31) {
                ClickableTextKt.a(text, nVar3, textStyle3, z13, i29, i28, lVar3, onClick, pVar2, i12 | 1, i13);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }
}
