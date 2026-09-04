package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.h2;
import androidx.compose.ui.graphics.o2;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidMenu.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ag\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0090\u0001\u0010\u001d\u001a\u00020\u00032\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"", "expanded", "Lkotlin/Function0;", "Lkotlin/b2;", "onDismissRequest", "Landroidx/compose/ui/n;", "modifier", "Ls1/j;", androidx.constraintlayout.core.motion.utils.w.c.R, "Landroidx/compose/ui/window/h;", "properties", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/o;", "Landroidx/compose/runtime/h;", "Lkotlin/t;", "content", ak.av, "(ZLyh/a;Landroidx/compose/ui/n;JLandroidx/compose/ui/window/h;Lyh/q;Landroidx/compose/runtime/p;II)V", "text", "onClick", "leadingIcon", "trailingIcon", "enabled", "Landroidx/compose/material3/q0;", "colors", "Landroidx/compose/foundation/layout/m0;", "contentPadding", "Landroidx/compose/foundation/interaction/g;", "interactionSource", "b", "(Lyh/p;Lyh/a;Landroidx/compose/ui/n;Lyh/p;Lyh/p;ZLandroidx/compose/material3/q0;Landroidx/compose/foundation/layout/m0;Landroidx/compose/foundation/interaction/g;Landroidx/compose/runtime/p;II)V", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class AndroidMenu_androidKt {
    /* JADX WARN: Code duplicated, block: B:100:0x017e  */
    /* JADX WARN: Code duplicated, block: B:102:0x018b  */
    /* JADX WARN: Code duplicated, block: B:105:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:111:0x020c  */
    /* JADX WARN: Code duplicated, block: B:116:0x021b  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0095  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:87:0x010b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0129  */
    /* JADX WARN: Code duplicated, block: B:92:0x0138  */
    /* JADX WARN: Code duplicated, block: B:95:0x0150  */
    /* JADX WARN: Code duplicated, block: B:98:0x0172  */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void a(final boolean z10, @dl.d final yh.a<kotlin.b2> onDismissRequest, @dl.e androidx.compose.ui.n nVar, long j10, @dl.e androidx.compose.ui.window.h hVar, @dl.d final yh.q<? super androidx.compose.foundation.layout.o, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.n nVar2;
        int i13;
        long jA;
        int i14;
        final androidx.compose.ui.window.h hVar2;
        int i15;
        androidx.compose.ui.n nVar3;
        androidx.compose.ui.window.h hVar3;
        int i16;
        androidx.compose.ui.n nVar4;
        Object objU;
        androidx.compose.runtime.p.Companion companion;
        final androidx.compose.animation.core.r0 r0Var;
        Object objU2;
        final androidx.compose.runtime.a1 a1Var;
        boolean zS;
        Object objU3;
        final androidx.compose.ui.n nVar5;
        final long j11;
        androidx.compose.runtime.u1 u1VarH;
        kotlin.jvm.internal.f0.p(onDismissRequest, "onDismissRequest");
        kotlin.jvm.internal.f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(354826666);
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
            i12 |= pVarF.s(onDismissRequest) ? 32 : 16;
        }
        int i17 = i11 & 4;
        if (i17 == 0) {
            if ((i10 & bb.c.b.f30796me) == 0) {
                nVar2 = nVar;
                i12 |= pVarF.s(nVar2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                i12 |= bb.c.d.f31193dj;
                jA = j10;
            } else {
                jA = j10;
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    if (pVarF.z(jA)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
            }
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    hVar2 = hVar;
                    int i18 = pVarF.s(hVar2) ? 16384 : 8192;
                    i12 |= i18;
                } else {
                    hVar2 = hVar;
                }
                i12 |= i18;
            } else {
                hVar2 = hVar;
            }
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (pVarF.s(content)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                }
                if ((374491 & i12) == 74898 || !pVarF.b()) {
                    pVarF.W();
                    if ((i10 & 1) != 0 || pVarF.o()) {
                        if (i17 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            float f10 = 0;
                            jA = s1.i.a(s1.h.g(f10), s1.h.g(f10));
                        }
                        if ((i11 & 16) != 0) {
                            i16 = i12 & (-57345);
                            hVar3 = new androidx.compose.ui.window.h(true, false, false, null, false, false, 62, null);
                        } else {
                            hVar3 = hVar2;
                            i16 = i12;
                        }
                        nVar4 = nVar3;
                    } else {
                        pVarF.l();
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        hVar3 = hVar2;
                        jA = jA;
                        i16 = i12;
                        nVar4 = nVar2;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(354826666, i16, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:73)");
                    }
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = new androidx.compose.animation.core.r0(Boolean.FALSE);
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    r0Var = (androidx.compose.animation.core.r0) objU;
                    r0Var.g(Boolean.valueOf(z10));
                    if (((Boolean) r0Var.a()).booleanValue() || ((Boolean) r0Var.b()).booleanValue()) {
                        pVarF.T(-492369756);
                        objU2 = pVarF.U();
                        if (objU2 == companion.a()) {
                            objU2 = h2.g(o2.b(o2.INSTANCE.a()), null, 2, null);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        a1Var = (androidx.compose.runtime.a1) objU2;
                        s1.e eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        pVarF.T(1157296644);
                        zS = pVarF.s(a1Var);
                        objU3 = pVarF.U();
                        if (zS || objU3 == companion.a()) {
                            objU3 = new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                public final void a(@dl.d s1.p parentBounds, @dl.d s1.p menuBounds) {
                                    kotlin.jvm.internal.f0.p(parentBounds, "parentBounds");
                                    kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
                                    a1Var.setValue(o2.b(MenuKt.h(parentBounds, menuBounds)));
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.p pVar2, s1.p pVar3) {
                                    a(pVar2, pVar3);
                                    return kotlin.b2.f124493a;
                                }
                            };
                            pVarF.N(objU3);
                        }
                        pVarF.c0();
                        final androidx.compose.ui.n nVar6 = nVar4;
                        final int i19 = i16;
                        AndroidPopup_androidKt.a(new DropdownMenuPositionProvider(jA, eVar, (yh.p) objU3, null), onDismissRequest, hVar3, androidx.compose.runtime.internal.b.b(pVarF, -1192563503, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i20) {
                                if ((i20 & 11) == 2 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1192563503, i20, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:98)");
                                }
                                androidx.compose.animation.core.r0<Boolean> r0Var2 = r0Var;
                                androidx.compose.runtime.a1<o2> a1Var2 = a1Var;
                                androidx.compose.ui.n nVar7 = nVar6;
                                yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                int i21 = androidx.compose.animation.core.r0.f4499d | 48;
                                int i22 = i19;
                                MenuKt.a(r0Var2, a1Var2, nVar7, qVar, pVar2, i21 | (i22 & bb.c.b.f30796me) | ((i22 >> 6) & bb.c.g.f32954lc), 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, (i16 & 112) | bb.c.d.f31193dj | ((i16 >> 6) & bb.c.b.f30796me), 0);
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar5 = nVar4;
                    j11 = jA;
                    hVar2 = hVar3;
                } else {
                    pVarF.l();
                    nVar5 = nVar2;
                    j11 = jA;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i20) {
                        AndroidMenu_androidKt.a(z10, onDismissRequest, nVar5, j11, hVar2, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i15 = androidx.profileinstaller.o.c.f26824k;
            i12 |= i15;
            if ((374491 & i12) == 74898) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        float f11 = 0;
                        jA = s1.i.a(s1.h.g(f11), s1.h.g(f11));
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        hVar3 = new androidx.compose.ui.window.h(true, false, false, null, false, false, 62, null);
                    } else {
                        hVar3 = hVar2;
                        i16 = i12;
                    }
                    nVar4 = nVar3;
                } else {
                    if (i17 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        float f12 = 0;
                        jA = s1.i.a(s1.h.g(f12), s1.h.g(f12));
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        hVar3 = new androidx.compose.ui.window.h(true, false, false, null, false, false, 62, null);
                    } else {
                        hVar3 = hVar2;
                        i16 = i12;
                    }
                    nVar4 = nVar3;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(354826666, i16, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:73)");
                }
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = new androidx.compose.animation.core.r0(Boolean.FALSE);
                    pVarF.N(objU);
                }
                pVarF.c0();
                r0Var = (androidx.compose.animation.core.r0) objU;
                r0Var.g(Boolean.valueOf(z10));
                if (((Boolean) r0Var.a()).booleanValue()) {
                    pVarF.T(-492369756);
                    objU2 = pVarF.U();
                    if (objU2 == companion.a()) {
                        objU2 = h2.g(o2.b(o2.INSTANCE.a()), null, 2, null);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    a1Var = (androidx.compose.runtime.a1) objU2;
                    s1.e eVar2 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    pVarF.T(1157296644);
                    zS = pVarF.s(a1Var);
                    objU3 = pVarF.U();
                    if (zS) {
                        objU3 = new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void a(@dl.d s1.p parentBounds, @dl.d s1.p menuBounds) {
                                kotlin.jvm.internal.f0.p(parentBounds, "parentBounds");
                                kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
                                a1Var.setValue(o2.b(MenuKt.h(parentBounds, menuBounds)));
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.p pVar2, s1.p pVar3) {
                                a(pVar2, pVar3);
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void a(@dl.d s1.p parentBounds, @dl.d s1.p menuBounds) {
                                kotlin.jvm.internal.f0.p(parentBounds, "parentBounds");
                                kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
                                a1Var.setValue(o2.b(MenuKt.h(parentBounds, menuBounds)));
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.p pVar2, s1.p pVar3) {
                                a(pVar2, pVar3);
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    final androidx.compose.ui.n nVar7 = nVar4;
                    final int i110 = i16;
                    AndroidPopup_androidKt.a(new DropdownMenuPositionProvider(jA, eVar2, (yh.p) objU3, null), onDismissRequest, hVar3, androidx.compose.runtime.internal.b.b(pVarF, -1192563503, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i20) {
                            if ((i20 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1192563503, i20, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:98)");
                            }
                            androidx.compose.animation.core.r0<Boolean> r0Var2 = r0Var;
                            androidx.compose.runtime.a1<o2> a1Var2 = a1Var;
                            androidx.compose.ui.n nVar8 = nVar7;
                            yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            int i21 = androidx.compose.animation.core.r0.f4499d | 48;
                            int i22 = i110;
                            MenuKt.a(r0Var2, a1Var2, nVar8, qVar, pVar2, i21 | (i22 & bb.c.b.f30796me) | ((i22 >> 6) & bb.c.g.f32954lc), 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, (i16 & 112) | bb.c.d.f31193dj | ((i16 >> 6) & bb.c.b.f30796me), 0);
                } else {
                    pVarF.T(-492369756);
                    objU2 = pVarF.U();
                    if (objU2 == companion.a()) {
                        objU2 = h2.g(o2.b(o2.INSTANCE.a()), null, 2, null);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    a1Var = (androidx.compose.runtime.a1) objU2;
                    s1.e eVar3 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    pVarF.T(1157296644);
                    zS = pVarF.s(a1Var);
                    objU3 = pVarF.U();
                    if (zS) {
                        objU3 = new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void a(@dl.d s1.p parentBounds, @dl.d s1.p menuBounds) {
                                kotlin.jvm.internal.f0.p(parentBounds, "parentBounds");
                                kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
                                a1Var.setValue(o2.b(MenuKt.h(parentBounds, menuBounds)));
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.p pVar2, s1.p pVar3) {
                                a(pVar2, pVar3);
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void a(@dl.d s1.p parentBounds, @dl.d s1.p menuBounds) {
                                kotlin.jvm.internal.f0.p(parentBounds, "parentBounds");
                                kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
                                a1Var.setValue(o2.b(MenuKt.h(parentBounds, menuBounds)));
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.p pVar2, s1.p pVar3) {
                                a(pVar2, pVar3);
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    final androidx.compose.ui.n nVar8 = nVar4;
                    final int i111 = i16;
                    AndroidPopup_androidKt.a(new DropdownMenuPositionProvider(jA, eVar3, (yh.p) objU3, null), onDismissRequest, hVar3, androidx.compose.runtime.internal.b.b(pVarF, -1192563503, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i20) {
                            if ((i20 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1192563503, i20, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:98)");
                            }
                            androidx.compose.animation.core.r0<Boolean> r0Var2 = r0Var;
                            androidx.compose.runtime.a1<o2> a1Var2 = a1Var;
                            androidx.compose.ui.n nVar9 = nVar8;
                            yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            int i21 = androidx.compose.animation.core.r0.f4499d | 48;
                            int i22 = i111;
                            MenuKt.a(r0Var2, a1Var2, nVar9, qVar, pVar2, i21 | (i22 & bb.c.b.f30796me) | ((i22 >> 6) & bb.c.g.f32954lc), 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, (i16 & 112) | bb.c.d.f31193dj | ((i16 >> 6) & bb.c.b.f30796me), 0);
                }
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar5 = nVar4;
                j11 = jA;
                hVar2 = hVar3;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        float f13 = 0;
                        jA = s1.i.a(s1.h.g(f13), s1.h.g(f13));
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        hVar3 = new androidx.compose.ui.window.h(true, false, false, null, false, false, 62, null);
                    } else {
                        hVar3 = hVar2;
                        i16 = i12;
                    }
                    nVar4 = nVar3;
                } else {
                    if (i17 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        float f14 = 0;
                        jA = s1.i.a(s1.h.g(f14), s1.h.g(f14));
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        hVar3 = new androidx.compose.ui.window.h(true, false, false, null, false, false, 62, null);
                    } else {
                        hVar3 = hVar2;
                        i16 = i12;
                    }
                    nVar4 = nVar3;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(354826666, i16, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:73)");
                }
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = new androidx.compose.animation.core.r0(Boolean.FALSE);
                    pVarF.N(objU);
                }
                pVarF.c0();
                r0Var = (androidx.compose.animation.core.r0) objU;
                r0Var.g(Boolean.valueOf(z10));
                if (((Boolean) r0Var.a()).booleanValue()) {
                    pVarF.T(-492369756);
                    objU2 = pVarF.U();
                    if (objU2 == companion.a()) {
                        objU2 = h2.g(o2.b(o2.INSTANCE.a()), null, 2, null);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    a1Var = (androidx.compose.runtime.a1) objU2;
                    s1.e eVar4 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    pVarF.T(1157296644);
                    zS = pVarF.s(a1Var);
                    objU3 = pVarF.U();
                    if (zS) {
                        objU3 = new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void a(@dl.d s1.p parentBounds, @dl.d s1.p menuBounds) {
                                kotlin.jvm.internal.f0.p(parentBounds, "parentBounds");
                                kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
                                a1Var.setValue(o2.b(MenuKt.h(parentBounds, menuBounds)));
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.p pVar2, s1.p pVar3) {
                                a(pVar2, pVar3);
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void a(@dl.d s1.p parentBounds, @dl.d s1.p menuBounds) {
                                kotlin.jvm.internal.f0.p(parentBounds, "parentBounds");
                                kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
                                a1Var.setValue(o2.b(MenuKt.h(parentBounds, menuBounds)));
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.p pVar2, s1.p pVar3) {
                                a(pVar2, pVar3);
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    final androidx.compose.ui.n nVar9 = nVar4;
                    final int i112 = i16;
                    AndroidPopup_androidKt.a(new DropdownMenuPositionProvider(jA, eVar4, (yh.p) objU3, null), onDismissRequest, hVar3, androidx.compose.runtime.internal.b.b(pVarF, -1192563503, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i20) {
                            if ((i20 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1192563503, i20, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:98)");
                            }
                            androidx.compose.animation.core.r0<Boolean> r0Var2 = r0Var;
                            androidx.compose.runtime.a1<o2> a1Var2 = a1Var;
                            androidx.compose.ui.n nVar10 = nVar9;
                            yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            int i21 = androidx.compose.animation.core.r0.f4499d | 48;
                            int i22 = i112;
                            MenuKt.a(r0Var2, a1Var2, nVar10, qVar, pVar2, i21 | (i22 & bb.c.b.f30796me) | ((i22 >> 6) & bb.c.g.f32954lc), 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, (i16 & 112) | bb.c.d.f31193dj | ((i16 >> 6) & bb.c.b.f30796me), 0);
                } else {
                    pVarF.T(-492369756);
                    objU2 = pVarF.U();
                    if (objU2 == companion.a()) {
                        objU2 = h2.g(o2.b(o2.INSTANCE.a()), null, 2, null);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    a1Var = (androidx.compose.runtime.a1) objU2;
                    s1.e eVar5 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    pVarF.T(1157296644);
                    zS = pVarF.s(a1Var);
                    objU3 = pVarF.U();
                    if (zS) {
                        objU3 = new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void a(@dl.d s1.p parentBounds, @dl.d s1.p menuBounds) {
                                kotlin.jvm.internal.f0.p(parentBounds, "parentBounds");
                                kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
                                a1Var.setValue(o2.b(MenuKt.h(parentBounds, menuBounds)));
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.p pVar2, s1.p pVar3) {
                                a(pVar2, pVar3);
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void a(@dl.d s1.p parentBounds, @dl.d s1.p menuBounds) {
                                kotlin.jvm.internal.f0.p(parentBounds, "parentBounds");
                                kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
                                a1Var.setValue(o2.b(MenuKt.h(parentBounds, menuBounds)));
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.p pVar2, s1.p pVar3) {
                                a(pVar2, pVar3);
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    final androidx.compose.ui.n nVar10 = nVar4;
                    final int i113 = i16;
                    AndroidPopup_androidKt.a(new DropdownMenuPositionProvider(jA, eVar5, (yh.p) objU3, null), onDismissRequest, hVar3, androidx.compose.runtime.internal.b.b(pVarF, -1192563503, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i20) {
                            if ((i20 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1192563503, i20, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:98)");
                            }
                            androidx.compose.animation.core.r0<Boolean> r0Var2 = r0Var;
                            androidx.compose.runtime.a1<o2> a1Var2 = a1Var;
                            androidx.compose.ui.n nVar11 = nVar10;
                            yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            int i21 = androidx.compose.animation.core.r0.f4499d | 48;
                            int i22 = i113;
                            MenuKt.a(r0Var2, a1Var2, nVar11, qVar, pVar2, i21 | (i22 & bb.c.b.f30796me) | ((i22 >> 6) & bb.c.g.f32954lc), 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, (i16 & 112) | bb.c.d.f31193dj | ((i16 >> 6) & bb.c.b.f30796me), 0);
                }
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar5 = nVar4;
                j11 = jA;
                hVar2 = hVar3;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i20) {
                    AndroidMenu_androidKt.a(z10, onDismissRequest, nVar5, j11, hVar2, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= bb.c.b.f30966u4;
        nVar2 = nVar;
        i13 = i11 & 8;
        if (i13 != 0) {
            i12 |= bb.c.d.f31193dj;
            jA = j10;
        } else {
            jA = j10;
            if ((i10 & bb.c.g.f32954lc) == 0) {
                if (pVarF.z(jA)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
        }
        if ((57344 & i10) == 0) {
            if ((i11 & 16) == 0) {
                hVar2 = hVar;
                if (pVarF.s(hVar2)) {
                }
                i12 |= i18;
            } else {
                hVar2 = hVar;
            }
            i12 |= i18;
        } else {
            hVar2 = hVar;
        }
        if ((i11 & 32) != 0) {
            if ((458752 & i10) == 0) {
                if (pVarF.s(content)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
            }
            if ((374491 & i12) == 74898) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        float f15 = 0;
                        jA = s1.i.a(s1.h.g(f15), s1.h.g(f15));
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        hVar3 = new androidx.compose.ui.window.h(true, false, false, null, false, false, 62, null);
                    } else {
                        hVar3 = hVar2;
                        i16 = i12;
                    }
                    nVar4 = nVar3;
                } else {
                    if (i17 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        float f16 = 0;
                        jA = s1.i.a(s1.h.g(f16), s1.h.g(f16));
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        hVar3 = new androidx.compose.ui.window.h(true, false, false, null, false, false, 62, null);
                    } else {
                        hVar3 = hVar2;
                        i16 = i12;
                    }
                    nVar4 = nVar3;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(354826666, i16, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:73)");
                }
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = new androidx.compose.animation.core.r0(Boolean.FALSE);
                    pVarF.N(objU);
                }
                pVarF.c0();
                r0Var = (androidx.compose.animation.core.r0) objU;
                r0Var.g(Boolean.valueOf(z10));
                if (((Boolean) r0Var.a()).booleanValue()) {
                    pVarF.T(-492369756);
                    objU2 = pVarF.U();
                    if (objU2 == companion.a()) {
                        objU2 = h2.g(o2.b(o2.INSTANCE.a()), null, 2, null);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    a1Var = (androidx.compose.runtime.a1) objU2;
                    s1.e eVar6 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    pVarF.T(1157296644);
                    zS = pVarF.s(a1Var);
                    objU3 = pVarF.U();
                    if (zS) {
                        objU3 = new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void a(@dl.d s1.p parentBounds, @dl.d s1.p menuBounds) {
                                kotlin.jvm.internal.f0.p(parentBounds, "parentBounds");
                                kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
                                a1Var.setValue(o2.b(MenuKt.h(parentBounds, menuBounds)));
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.p pVar2, s1.p pVar3) {
                                a(pVar2, pVar3);
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void a(@dl.d s1.p parentBounds, @dl.d s1.p menuBounds) {
                                kotlin.jvm.internal.f0.p(parentBounds, "parentBounds");
                                kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
                                a1Var.setValue(o2.b(MenuKt.h(parentBounds, menuBounds)));
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.p pVar2, s1.p pVar3) {
                                a(pVar2, pVar3);
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    final androidx.compose.ui.n nVar11 = nVar4;
                    final int i114 = i16;
                    AndroidPopup_androidKt.a(new DropdownMenuPositionProvider(jA, eVar6, (yh.p) objU3, null), onDismissRequest, hVar3, androidx.compose.runtime.internal.b.b(pVarF, -1192563503, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i20) {
                            if ((i20 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1192563503, i20, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:98)");
                            }
                            androidx.compose.animation.core.r0<Boolean> r0Var2 = r0Var;
                            androidx.compose.runtime.a1<o2> a1Var2 = a1Var;
                            androidx.compose.ui.n nVar12 = nVar11;
                            yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            int i21 = androidx.compose.animation.core.r0.f4499d | 48;
                            int i22 = i114;
                            MenuKt.a(r0Var2, a1Var2, nVar12, qVar, pVar2, i21 | (i22 & bb.c.b.f30796me) | ((i22 >> 6) & bb.c.g.f32954lc), 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, (i16 & 112) | bb.c.d.f31193dj | ((i16 >> 6) & bb.c.b.f30796me), 0);
                } else {
                    pVarF.T(-492369756);
                    objU2 = pVarF.U();
                    if (objU2 == companion.a()) {
                        objU2 = h2.g(o2.b(o2.INSTANCE.a()), null, 2, null);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    a1Var = (androidx.compose.runtime.a1) objU2;
                    s1.e eVar7 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    pVarF.T(1157296644);
                    zS = pVarF.s(a1Var);
                    objU3 = pVarF.U();
                    if (zS) {
                        objU3 = new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void a(@dl.d s1.p parentBounds, @dl.d s1.p menuBounds) {
                                kotlin.jvm.internal.f0.p(parentBounds, "parentBounds");
                                kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
                                a1Var.setValue(o2.b(MenuKt.h(parentBounds, menuBounds)));
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.p pVar2, s1.p pVar3) {
                                a(pVar2, pVar3);
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void a(@dl.d s1.p parentBounds, @dl.d s1.p menuBounds) {
                                kotlin.jvm.internal.f0.p(parentBounds, "parentBounds");
                                kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
                                a1Var.setValue(o2.b(MenuKt.h(parentBounds, menuBounds)));
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.p pVar2, s1.p pVar3) {
                                a(pVar2, pVar3);
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    final androidx.compose.ui.n nVar12 = nVar4;
                    final int i115 = i16;
                    AndroidPopup_androidKt.a(new DropdownMenuPositionProvider(jA, eVar7, (yh.p) objU3, null), onDismissRequest, hVar3, androidx.compose.runtime.internal.b.b(pVarF, -1192563503, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i20) {
                            if ((i20 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1192563503, i20, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:98)");
                            }
                            androidx.compose.animation.core.r0<Boolean> r0Var2 = r0Var;
                            androidx.compose.runtime.a1<o2> a1Var2 = a1Var;
                            androidx.compose.ui.n nVar13 = nVar12;
                            yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            int i21 = androidx.compose.animation.core.r0.f4499d | 48;
                            int i22 = i115;
                            MenuKt.a(r0Var2, a1Var2, nVar13, qVar, pVar2, i21 | (i22 & bb.c.b.f30796me) | ((i22 >> 6) & bb.c.g.f32954lc), 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, (i16 & 112) | bb.c.d.f31193dj | ((i16 >> 6) & bb.c.b.f30796me), 0);
                }
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar5 = nVar4;
                j11 = jA;
                hVar2 = hVar3;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        float f17 = 0;
                        jA = s1.i.a(s1.h.g(f17), s1.h.g(f17));
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        hVar3 = new androidx.compose.ui.window.h(true, false, false, null, false, false, 62, null);
                    } else {
                        hVar3 = hVar2;
                        i16 = i12;
                    }
                    nVar4 = nVar3;
                } else {
                    if (i17 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        float f18 = 0;
                        jA = s1.i.a(s1.h.g(f18), s1.h.g(f18));
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        hVar3 = new androidx.compose.ui.window.h(true, false, false, null, false, false, 62, null);
                    } else {
                        hVar3 = hVar2;
                        i16 = i12;
                    }
                    nVar4 = nVar3;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(354826666, i16, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:73)");
                }
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = new androidx.compose.animation.core.r0(Boolean.FALSE);
                    pVarF.N(objU);
                }
                pVarF.c0();
                r0Var = (androidx.compose.animation.core.r0) objU;
                r0Var.g(Boolean.valueOf(z10));
                if (((Boolean) r0Var.a()).booleanValue()) {
                    pVarF.T(-492369756);
                    objU2 = pVarF.U();
                    if (objU2 == companion.a()) {
                        objU2 = h2.g(o2.b(o2.INSTANCE.a()), null, 2, null);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    a1Var = (androidx.compose.runtime.a1) objU2;
                    s1.e eVar8 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    pVarF.T(1157296644);
                    zS = pVarF.s(a1Var);
                    objU3 = pVarF.U();
                    if (zS) {
                        objU3 = new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void a(@dl.d s1.p parentBounds, @dl.d s1.p menuBounds) {
                                kotlin.jvm.internal.f0.p(parentBounds, "parentBounds");
                                kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
                                a1Var.setValue(o2.b(MenuKt.h(parentBounds, menuBounds)));
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.p pVar2, s1.p pVar3) {
                                a(pVar2, pVar3);
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void a(@dl.d s1.p parentBounds, @dl.d s1.p menuBounds) {
                                kotlin.jvm.internal.f0.p(parentBounds, "parentBounds");
                                kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
                                a1Var.setValue(o2.b(MenuKt.h(parentBounds, menuBounds)));
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.p pVar2, s1.p pVar3) {
                                a(pVar2, pVar3);
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    final androidx.compose.ui.n nVar13 = nVar4;
                    final int i116 = i16;
                    AndroidPopup_androidKt.a(new DropdownMenuPositionProvider(jA, eVar8, (yh.p) objU3, null), onDismissRequest, hVar3, androidx.compose.runtime.internal.b.b(pVarF, -1192563503, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i20) {
                            if ((i20 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1192563503, i20, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:98)");
                            }
                            androidx.compose.animation.core.r0<Boolean> r0Var2 = r0Var;
                            androidx.compose.runtime.a1<o2> a1Var2 = a1Var;
                            androidx.compose.ui.n nVar14 = nVar13;
                            yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            int i21 = androidx.compose.animation.core.r0.f4499d | 48;
                            int i22 = i116;
                            MenuKt.a(r0Var2, a1Var2, nVar14, qVar, pVar2, i21 | (i22 & bb.c.b.f30796me) | ((i22 >> 6) & bb.c.g.f32954lc), 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, (i16 & 112) | bb.c.d.f31193dj | ((i16 >> 6) & bb.c.b.f30796me), 0);
                } else {
                    pVarF.T(-492369756);
                    objU2 = pVarF.U();
                    if (objU2 == companion.a()) {
                        objU2 = h2.g(o2.b(o2.INSTANCE.a()), null, 2, null);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    a1Var = (androidx.compose.runtime.a1) objU2;
                    s1.e eVar9 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    pVarF.T(1157296644);
                    zS = pVarF.s(a1Var);
                    objU3 = pVarF.U();
                    if (zS) {
                        objU3 = new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void a(@dl.d s1.p parentBounds, @dl.d s1.p menuBounds) {
                                kotlin.jvm.internal.f0.p(parentBounds, "parentBounds");
                                kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
                                a1Var.setValue(o2.b(MenuKt.h(parentBounds, menuBounds)));
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.p pVar2, s1.p pVar3) {
                                a(pVar2, pVar3);
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void a(@dl.d s1.p parentBounds, @dl.d s1.p menuBounds) {
                                kotlin.jvm.internal.f0.p(parentBounds, "parentBounds");
                                kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
                                a1Var.setValue(o2.b(MenuKt.h(parentBounds, menuBounds)));
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.p pVar2, s1.p pVar3) {
                                a(pVar2, pVar3);
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    final androidx.compose.ui.n nVar14 = nVar4;
                    final int i117 = i16;
                    AndroidPopup_androidKt.a(new DropdownMenuPositionProvider(jA, eVar9, (yh.p) objU3, null), onDismissRequest, hVar3, androidx.compose.runtime.internal.b.b(pVarF, -1192563503, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i20) {
                            if ((i20 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1192563503, i20, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:98)");
                            }
                            androidx.compose.animation.core.r0<Boolean> r0Var2 = r0Var;
                            androidx.compose.runtime.a1<o2> a1Var2 = a1Var;
                            androidx.compose.ui.n nVar15 = nVar14;
                            yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            int i21 = androidx.compose.animation.core.r0.f4499d | 48;
                            int i22 = i117;
                            MenuKt.a(r0Var2, a1Var2, nVar15, qVar, pVar2, i21 | (i22 & bb.c.b.f30796me) | ((i22 >> 6) & bb.c.g.f32954lc), 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, (i16 & 112) | bb.c.d.f31193dj | ((i16 >> 6) & bb.c.b.f30796me), 0);
                }
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar5 = nVar4;
                j11 = jA;
                hVar2 = hVar3;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i20) {
                    AndroidMenu_androidKt.a(z10, onDismissRequest, nVar5, j11, hVar2, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i15 = androidx.profileinstaller.o.c.f26824k;
        i12 |= i15;
        if ((374491 & i12) == 74898) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    float f19 = 0;
                    jA = s1.i.a(s1.h.g(f19), s1.h.g(f19));
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    hVar3 = new androidx.compose.ui.window.h(true, false, false, null, false, false, 62, null);
                } else {
                    hVar3 = hVar2;
                    i16 = i12;
                }
                nVar4 = nVar3;
            } else {
                if (i17 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    float f110 = 0;
                    jA = s1.i.a(s1.h.g(f110), s1.h.g(f110));
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    hVar3 = new androidx.compose.ui.window.h(true, false, false, null, false, false, 62, null);
                } else {
                    hVar3 = hVar2;
                    i16 = i12;
                }
                nVar4 = nVar3;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(354826666, i16, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:73)");
            }
            pVarF.T(-492369756);
            objU = pVarF.U();
            companion = androidx.compose.runtime.p.INSTANCE;
            if (objU == companion.a()) {
                objU = new androidx.compose.animation.core.r0(Boolean.FALSE);
                pVarF.N(objU);
            }
            pVarF.c0();
            r0Var = (androidx.compose.animation.core.r0) objU;
            r0Var.g(Boolean.valueOf(z10));
            if (((Boolean) r0Var.a()).booleanValue()) {
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                if (objU2 == companion.a()) {
                    objU2 = h2.g(o2.b(o2.INSTANCE.a()), null, 2, null);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                a1Var = (androidx.compose.runtime.a1) objU2;
                s1.e eVar10 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                pVarF.T(1157296644);
                zS = pVarF.s(a1Var);
                objU3 = pVarF.U();
                if (zS) {
                    objU3 = new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void a(@dl.d s1.p parentBounds, @dl.d s1.p menuBounds) {
                            kotlin.jvm.internal.f0.p(parentBounds, "parentBounds");
                            kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
                            a1Var.setValue(o2.b(MenuKt.h(parentBounds, menuBounds)));
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.p pVar2, s1.p pVar3) {
                            a(pVar2, pVar3);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void a(@dl.d s1.p parentBounds, @dl.d s1.p menuBounds) {
                            kotlin.jvm.internal.f0.p(parentBounds, "parentBounds");
                            kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
                            a1Var.setValue(o2.b(MenuKt.h(parentBounds, menuBounds)));
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.p pVar2, s1.p pVar3) {
                            a(pVar2, pVar3);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                }
                pVarF.c0();
                final androidx.compose.ui.n nVar15 = nVar4;
                final int i118 = i16;
                AndroidPopup_androidKt.a(new DropdownMenuPositionProvider(jA, eVar10, (yh.p) objU3, null), onDismissRequest, hVar3, androidx.compose.runtime.internal.b.b(pVarF, -1192563503, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i20) {
                        if ((i20 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1192563503, i20, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:98)");
                        }
                        androidx.compose.animation.core.r0<Boolean> r0Var2 = r0Var;
                        androidx.compose.runtime.a1<o2> a1Var2 = a1Var;
                        androidx.compose.ui.n nVar16 = nVar15;
                        yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                        int i21 = androidx.compose.animation.core.r0.f4499d | 48;
                        int i22 = i118;
                        MenuKt.a(r0Var2, a1Var2, nVar16, qVar, pVar2, i21 | (i22 & bb.c.b.f30796me) | ((i22 >> 6) & bb.c.g.f32954lc), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, (i16 & 112) | bb.c.d.f31193dj | ((i16 >> 6) & bb.c.b.f30796me), 0);
            } else {
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                if (objU2 == companion.a()) {
                    objU2 = h2.g(o2.b(o2.INSTANCE.a()), null, 2, null);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                a1Var = (androidx.compose.runtime.a1) objU2;
                s1.e eVar11 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                pVarF.T(1157296644);
                zS = pVarF.s(a1Var);
                objU3 = pVarF.U();
                if (zS) {
                    objU3 = new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void a(@dl.d s1.p parentBounds, @dl.d s1.p menuBounds) {
                            kotlin.jvm.internal.f0.p(parentBounds, "parentBounds");
                            kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
                            a1Var.setValue(o2.b(MenuKt.h(parentBounds, menuBounds)));
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.p pVar2, s1.p pVar3) {
                            a(pVar2, pVar3);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void a(@dl.d s1.p parentBounds, @dl.d s1.p menuBounds) {
                            kotlin.jvm.internal.f0.p(parentBounds, "parentBounds");
                            kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
                            a1Var.setValue(o2.b(MenuKt.h(parentBounds, menuBounds)));
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.p pVar2, s1.p pVar3) {
                            a(pVar2, pVar3);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                }
                pVarF.c0();
                final androidx.compose.ui.n nVar16 = nVar4;
                final int i119 = i16;
                AndroidPopup_androidKt.a(new DropdownMenuPositionProvider(jA, eVar11, (yh.p) objU3, null), onDismissRequest, hVar3, androidx.compose.runtime.internal.b.b(pVarF, -1192563503, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i20) {
                        if ((i20 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1192563503, i20, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:98)");
                        }
                        androidx.compose.animation.core.r0<Boolean> r0Var2 = r0Var;
                        androidx.compose.runtime.a1<o2> a1Var2 = a1Var;
                        androidx.compose.ui.n nVar17 = nVar16;
                        yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                        int i21 = androidx.compose.animation.core.r0.f4499d | 48;
                        int i22 = i119;
                        MenuKt.a(r0Var2, a1Var2, nVar17, qVar, pVar2, i21 | (i22 & bb.c.b.f30796me) | ((i22 >> 6) & bb.c.g.f32954lc), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, (i16 & 112) | bb.c.d.f31193dj | ((i16 >> 6) & bb.c.b.f30796me), 0);
            }
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar5 = nVar4;
            j11 = jA;
            hVar2 = hVar3;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    float f111 = 0;
                    jA = s1.i.a(s1.h.g(f111), s1.h.g(f111));
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    hVar3 = new androidx.compose.ui.window.h(true, false, false, null, false, false, 62, null);
                } else {
                    hVar3 = hVar2;
                    i16 = i12;
                }
                nVar4 = nVar3;
            } else {
                if (i17 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    float f112 = 0;
                    jA = s1.i.a(s1.h.g(f112), s1.h.g(f112));
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    hVar3 = new androidx.compose.ui.window.h(true, false, false, null, false, false, 62, null);
                } else {
                    hVar3 = hVar2;
                    i16 = i12;
                }
                nVar4 = nVar3;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(354826666, i16, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:73)");
            }
            pVarF.T(-492369756);
            objU = pVarF.U();
            companion = androidx.compose.runtime.p.INSTANCE;
            if (objU == companion.a()) {
                objU = new androidx.compose.animation.core.r0(Boolean.FALSE);
                pVarF.N(objU);
            }
            pVarF.c0();
            r0Var = (androidx.compose.animation.core.r0) objU;
            r0Var.g(Boolean.valueOf(z10));
            if (((Boolean) r0Var.a()).booleanValue()) {
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                if (objU2 == companion.a()) {
                    objU2 = h2.g(o2.b(o2.INSTANCE.a()), null, 2, null);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                a1Var = (androidx.compose.runtime.a1) objU2;
                s1.e eVar12 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                pVarF.T(1157296644);
                zS = pVarF.s(a1Var);
                objU3 = pVarF.U();
                if (zS) {
                    objU3 = new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void a(@dl.d s1.p parentBounds, @dl.d s1.p menuBounds) {
                            kotlin.jvm.internal.f0.p(parentBounds, "parentBounds");
                            kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
                            a1Var.setValue(o2.b(MenuKt.h(parentBounds, menuBounds)));
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.p pVar2, s1.p pVar3) {
                            a(pVar2, pVar3);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void a(@dl.d s1.p parentBounds, @dl.d s1.p menuBounds) {
                            kotlin.jvm.internal.f0.p(parentBounds, "parentBounds");
                            kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
                            a1Var.setValue(o2.b(MenuKt.h(parentBounds, menuBounds)));
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.p pVar2, s1.p pVar3) {
                            a(pVar2, pVar3);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                }
                pVarF.c0();
                final androidx.compose.ui.n nVar17 = nVar4;
                final int i1110 = i16;
                AndroidPopup_androidKt.a(new DropdownMenuPositionProvider(jA, eVar12, (yh.p) objU3, null), onDismissRequest, hVar3, androidx.compose.runtime.internal.b.b(pVarF, -1192563503, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i20) {
                        if ((i20 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1192563503, i20, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:98)");
                        }
                        androidx.compose.animation.core.r0<Boolean> r0Var2 = r0Var;
                        androidx.compose.runtime.a1<o2> a1Var2 = a1Var;
                        androidx.compose.ui.n nVar18 = nVar17;
                        yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                        int i21 = androidx.compose.animation.core.r0.f4499d | 48;
                        int i22 = i1110;
                        MenuKt.a(r0Var2, a1Var2, nVar18, qVar, pVar2, i21 | (i22 & bb.c.b.f30796me) | ((i22 >> 6) & bb.c.g.f32954lc), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, (i16 & 112) | bb.c.d.f31193dj | ((i16 >> 6) & bb.c.b.f30796me), 0);
            } else {
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                if (objU2 == companion.a()) {
                    objU2 = h2.g(o2.b(o2.INSTANCE.a()), null, 2, null);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                a1Var = (androidx.compose.runtime.a1) objU2;
                s1.e eVar13 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                pVarF.T(1157296644);
                zS = pVarF.s(a1Var);
                objU3 = pVarF.U();
                if (zS) {
                    objU3 = new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void a(@dl.d s1.p parentBounds, @dl.d s1.p menuBounds) {
                            kotlin.jvm.internal.f0.p(parentBounds, "parentBounds");
                            kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
                            a1Var.setValue(o2.b(MenuKt.h(parentBounds, menuBounds)));
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.p pVar2, s1.p pVar3) {
                            a(pVar2, pVar3);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void a(@dl.d s1.p parentBounds, @dl.d s1.p menuBounds) {
                            kotlin.jvm.internal.f0.p(parentBounds, "parentBounds");
                            kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
                            a1Var.setValue(o2.b(MenuKt.h(parentBounds, menuBounds)));
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.p pVar2, s1.p pVar3) {
                            a(pVar2, pVar3);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                }
                pVarF.c0();
                final androidx.compose.ui.n nVar18 = nVar4;
                final int i1111 = i16;
                AndroidPopup_androidKt.a(new DropdownMenuPositionProvider(jA, eVar13, (yh.p) objU3, null), onDismissRequest, hVar3, androidx.compose.runtime.internal.b.b(pVarF, -1192563503, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i20) {
                        if ((i20 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1192563503, i20, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:98)");
                        }
                        androidx.compose.animation.core.r0<Boolean> r0Var2 = r0Var;
                        androidx.compose.runtime.a1<o2> a1Var2 = a1Var;
                        androidx.compose.ui.n nVar19 = nVar18;
                        yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                        int i21 = androidx.compose.animation.core.r0.f4499d | 48;
                        int i22 = i1111;
                        MenuKt.a(r0Var2, a1Var2, nVar19, qVar, pVar2, i21 | (i22 & bb.c.b.f30796me) | ((i22 >> 6) & bb.c.g.f32954lc), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, (i16 & 112) | bb.c.d.f31193dj | ((i16 >> 6) & bb.c.b.f30796me), 0);
            }
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar5 = nVar4;
            j11 = jA;
            hVar2 = hVar3;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i20) {
                AndroidMenu_androidKt.a(z10, onDismissRequest, nVar5, j11, hVar2, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0140  */
    /* JADX WARN: Code duplicated, block: B:105:0x014a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0169 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x016b  */
    /* JADX WARN: Code duplicated, block: B:114:0x016e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0173  */
    /* JADX WARN: Code duplicated, block: B:118:0x0175  */
    /* JADX WARN: Code duplicated, block: B:121:0x017a  */
    /* JADX WARN: Code duplicated, block: B:123:0x017d  */
    /* JADX WARN: Code duplicated, block: B:124:0x017f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0184  */
    /* JADX WARN: Code duplicated, block: B:128:0x019e  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:135:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:137:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:141:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:144:0x022c  */
    /* JADX WARN: Code duplicated, block: B:149:0x0243  */
    /* JADX WARN: Code duplicated, block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00da  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:89:0x0102  */
    /* JADX WARN: Code duplicated, block: B:90:0x0109  */
    /* JADX WARN: Code duplicated, block: B:92:0x010f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0115  */
    /* JADX WARN: Code duplicated, block: B:95:0x0118  */
    /* JADX WARN: Code duplicated, block: B:99:0x0126  */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void b(@dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> text, @dl.d final yh.a<kotlin.b2> onClick, @dl.e androidx.compose.ui.n nVar, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar2, boolean z10, @dl.e q0 q0Var, @dl.e androidx.compose.foundation.layout.m0 m0Var, @dl.e androidx.compose.foundation.interaction.g gVar, @dl.e androidx.compose.runtime.p pVar3, final int i10, final int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar4;
        int i16;
        int i17;
        boolean z11;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        androidx.compose.ui.n nVar2;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar5;
        boolean z12;
        q0 q0VarB;
        androidx.compose.foundation.layout.m0 m0VarA;
        androidx.compose.foundation.interaction.g gVar2;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar6;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar7;
        boolean z13;
        q0 q0Var2;
        Object objU;
        final androidx.compose.ui.n nVar3;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar8;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar9;
        final boolean z14;
        final q0 q0Var3;
        final androidx.compose.foundation.layout.m0 m0Var2;
        final androidx.compose.foundation.interaction.g gVar3;
        androidx.compose.runtime.u1 u1VarH;
        int i23;
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(onClick, "onClick");
        androidx.compose.runtime.p pVarF = pVar3.F(1826340448);
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
            i12 |= pVarF.s(onClick) ? 32 : 16;
        }
        int i24 = i11 & 4;
        if (i24 == 0) {
            if ((i10 & bb.c.b.f30796me) == 0) {
                i12 |= pVarF.s(nVar) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    if (pVarF.s(pVar)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((i10 & 57344) == 0) {
                        pVar4 = pVar2;
                        if (pVarF.s(pVar4)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 32;
                    if (i17 != 0) {
                        if ((i10 & 458752) == 0) {
                            z11 = z10;
                            if (pVarF.u(z11)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                        if ((i10 & 3670016) != 0) {
                            if ((i11 & 64) == 0 || !pVarF.s(q0Var)) {
                                i23 = 524288;
                            } else {
                                i23 = 1048576;
                            }
                            i12 |= i23;
                        }
                        i19 = i11 & 128;
                        if (i19 != 0) {
                            i12 |= 12582912;
                        } else if ((i10 & 29360128) == 0) {
                            if (pVarF.s(m0Var)) {
                                i20 = 8388608;
                            } else {
                                i20 = 4194304;
                            }
                            i12 |= i20;
                        }
                        i21 = i11 & 256;
                        if (i21 != 0) {
                            i12 |= 100663296;
                        } else if ((i10 & 234881024) == 0) {
                            if (pVarF.s(gVar)) {
                                i22 = 67108864;
                            } else {
                                i22 = 33554432;
                            }
                            i12 |= i22;
                        }
                        if ((i12 & 191739611) == 38347922 || !pVarF.b()) {
                            pVarF.W();
                            if ((i10 & 1) != 0 || pVarF.o()) {
                                if (i24 != 0) {
                                    nVar2 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar2 = nVar;
                                }
                                if (i13 != 0) {
                                    pVar5 = null;
                                } else {
                                    pVar5 = pVar;
                                }
                                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar10 = i15 == 0 ? pVar4 : null;
                                if (i17 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z11;
                                }
                                if ((i11 & 64) != 0) {
                                    q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                                    i12 &= -3670017;
                                } else {
                                    q0VarB = q0Var;
                                }
                                if (i19 != 0) {
                                    m0VarA = p0.f12081a.a();
                                } else {
                                    m0VarA = m0Var;
                                }
                                if (i21 != 0) {
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
                                pVar6 = pVar5;
                                pVar7 = pVar10;
                                z13 = z12;
                                q0Var2 = q0VarB;
                            } else {
                                pVarF.l();
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                }
                                pVar6 = pVar;
                                q0Var2 = q0Var;
                                m0VarA = m0Var;
                                gVar2 = gVar;
                                pVar7 = pVar4;
                                z13 = z11;
                                nVar2 = nVar;
                            }
                            pVarF.O();
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                            }
                            MenuKt.d(text, onClick, nVar2, pVar6, pVar7, z13, q0Var2, m0VarA, gVar2, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            nVar3 = nVar2;
                            pVar8 = pVar6;
                            pVar9 = pVar7;
                            z14 = z13;
                            q0Var3 = q0Var2;
                            m0Var2 = m0VarA;
                            gVar3 = gVar2;
                        } else {
                            pVarF.l();
                            nVar3 = nVar;
                            pVar8 = pVar;
                            q0Var3 = q0Var;
                            gVar3 = gVar;
                            pVar9 = pVar4;
                            z14 = z11;
                            m0Var2 = m0Var;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar11, int i25) {
                                AndroidMenu_androidKt.b(text, onClick, nVar3, pVar8, pVar9, z14, q0Var3, m0Var2, gVar3, pVar11, i10 | 1, i11);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11, Integer num) {
                                a(pVar11, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    }
                    i12 |= androidx.profileinstaller.o.c.f26824k;
                    z11 = z10;
                    if ((i10 & 3670016) != 0) {
                        if ((i11 & 64) == 0) {
                            i23 = 524288;
                        } else {
                            i23 = 524288;
                        }
                        i12 |= i23;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (pVarF.s(m0Var)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    i21 = i11 & 256;
                    if (i21 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 234881024) == 0) {
                        if (pVarF.s(gVar)) {
                            i22 = 67108864;
                        } else {
                            i22 = 33554432;
                        }
                        i12 |= i22;
                    }
                    if ((i12 & 191739611) == 38347922) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i13 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i15 == 0) {
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 64) != 0) {
                                q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                q0VarB = q0Var;
                            }
                            if (i19 != 0) {
                                m0VarA = p0.f12081a.a();
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i21 != 0) {
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
                            pVar6 = pVar5;
                            pVar7 = pVar10;
                            z13 = z12;
                            q0Var2 = q0VarB;
                        } else {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i13 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i15 == 0) {
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 64) != 0) {
                                q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                q0VarB = q0Var;
                            }
                            if (i19 != 0) {
                                m0VarA = p0.f12081a.a();
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i21 != 0) {
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
                            pVar6 = pVar5;
                            pVar7 = pVar10;
                            z13 = z12;
                            q0Var2 = q0VarB;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                        }
                        MenuKt.d(text, onClick, nVar2, pVar6, pVar7, z13, q0Var2, m0VarA, gVar2, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar3 = nVar2;
                        pVar8 = pVar6;
                        pVar9 = pVar7;
                        z14 = z13;
                        q0Var3 = q0Var2;
                        m0Var2 = m0VarA;
                        gVar3 = gVar2;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i13 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i15 == 0) {
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 64) != 0) {
                                q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                q0VarB = q0Var;
                            }
                            if (i19 != 0) {
                                m0VarA = p0.f12081a.a();
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i21 != 0) {
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
                            pVar6 = pVar5;
                            pVar7 = pVar10;
                            z13 = z12;
                            q0Var2 = q0VarB;
                        } else {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i13 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i15 == 0) {
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 64) != 0) {
                                q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                q0VarB = q0Var;
                            }
                            if (i19 != 0) {
                                m0VarA = p0.f12081a.a();
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i21 != 0) {
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
                            pVar6 = pVar5;
                            pVar7 = pVar10;
                            z13 = z12;
                            q0Var2 = q0VarB;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                        }
                        MenuKt.d(text, onClick, nVar2, pVar6, pVar7, z13, q0Var2, m0VarA, gVar2, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar3 = nVar2;
                        pVar8 = pVar6;
                        pVar9 = pVar7;
                        z14 = z13;
                        q0Var3 = q0Var2;
                        m0Var2 = m0VarA;
                        gVar3 = gVar2;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar11, int i25) {
                            AndroidMenu_androidKt.b(text, onClick, nVar3, pVar8, pVar9, z14, q0Var3, m0Var2, gVar3, pVar11, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11, Integer num) {
                            a(pVar11, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i12 |= 24576;
                pVar4 = pVar2;
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((i10 & 458752) == 0) {
                        z11 = z10;
                        if (pVarF.u(z11)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((i10 & 3670016) != 0) {
                        if ((i11 & 64) == 0) {
                            i23 = 524288;
                        } else {
                            i23 = 524288;
                        }
                        i12 |= i23;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (pVarF.s(m0Var)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    i21 = i11 & 256;
                    if (i21 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 234881024) == 0) {
                        if (pVarF.s(gVar)) {
                            i22 = 67108864;
                        } else {
                            i22 = 33554432;
                        }
                        i12 |= i22;
                    }
                    if ((i12 & 191739611) == 38347922) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i13 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i15 == 0) {
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 64) != 0) {
                                q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                q0VarB = q0Var;
                            }
                            if (i19 != 0) {
                                m0VarA = p0.f12081a.a();
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i21 != 0) {
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
                            pVar6 = pVar5;
                            pVar7 = pVar10;
                            z13 = z12;
                            q0Var2 = q0VarB;
                        } else {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i13 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i15 == 0) {
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 64) != 0) {
                                q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                q0VarB = q0Var;
                            }
                            if (i19 != 0) {
                                m0VarA = p0.f12081a.a();
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i21 != 0) {
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
                            pVar6 = pVar5;
                            pVar7 = pVar10;
                            z13 = z12;
                            q0Var2 = q0VarB;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                        }
                        MenuKt.d(text, onClick, nVar2, pVar6, pVar7, z13, q0Var2, m0VarA, gVar2, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar3 = nVar2;
                        pVar8 = pVar6;
                        pVar9 = pVar7;
                        z14 = z13;
                        q0Var3 = q0Var2;
                        m0Var2 = m0VarA;
                        gVar3 = gVar2;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i13 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i15 == 0) {
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 64) != 0) {
                                q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                q0VarB = q0Var;
                            }
                            if (i19 != 0) {
                                m0VarA = p0.f12081a.a();
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i21 != 0) {
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
                            pVar6 = pVar5;
                            pVar7 = pVar10;
                            z13 = z12;
                            q0Var2 = q0VarB;
                        } else {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i13 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i15 == 0) {
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 64) != 0) {
                                q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                q0VarB = q0Var;
                            }
                            if (i19 != 0) {
                                m0VarA = p0.f12081a.a();
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i21 != 0) {
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
                            pVar6 = pVar5;
                            pVar7 = pVar10;
                            z13 = z12;
                            q0Var2 = q0VarB;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                        }
                        MenuKt.d(text, onClick, nVar2, pVar6, pVar7, z13, q0Var2, m0VarA, gVar2, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar3 = nVar2;
                        pVar8 = pVar6;
                        pVar9 = pVar7;
                        z14 = z13;
                        q0Var3 = q0Var2;
                        m0Var2 = m0VarA;
                        gVar3 = gVar2;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar11, int i25) {
                            AndroidMenu_androidKt.b(text, onClick, nVar3, pVar8, pVar9, z14, q0Var3, m0Var2, gVar3, pVar11, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11, Integer num) {
                            a(pVar11, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i12 |= androidx.profileinstaller.o.c.f26824k;
                z11 = z10;
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (pVarF.s(m0Var)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 256;
                if (i21 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (pVarF.s(gVar)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i12 |= i22;
                }
                if ((i12 & 191739611) == 38347922) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            q0VarB = q0Var;
                        }
                        if (i19 != 0) {
                            m0VarA = p0.f12081a.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i21 != 0) {
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
                        pVar6 = pVar5;
                        pVar7 = pVar10;
                        z13 = z12;
                        q0Var2 = q0VarB;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            q0VarB = q0Var;
                        }
                        if (i19 != 0) {
                            m0VarA = p0.f12081a.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i21 != 0) {
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
                        pVar6 = pVar5;
                        pVar7 = pVar10;
                        z13 = z12;
                        q0Var2 = q0VarB;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                    }
                    MenuKt.d(text, onClick, nVar2, pVar6, pVar7, z13, q0Var2, m0VarA, gVar2, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    pVar8 = pVar6;
                    pVar9 = pVar7;
                    z14 = z13;
                    q0Var3 = q0Var2;
                    m0Var2 = m0VarA;
                    gVar3 = gVar2;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            q0VarB = q0Var;
                        }
                        if (i19 != 0) {
                            m0VarA = p0.f12081a.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i21 != 0) {
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
                        pVar6 = pVar5;
                        pVar7 = pVar10;
                        z13 = z12;
                        q0Var2 = q0VarB;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            q0VarB = q0Var;
                        }
                        if (i19 != 0) {
                            m0VarA = p0.f12081a.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i21 != 0) {
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
                        pVar6 = pVar5;
                        pVar7 = pVar10;
                        z13 = z12;
                        q0Var2 = q0VarB;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                    }
                    MenuKt.d(text, onClick, nVar2, pVar6, pVar7, z13, q0Var2, m0VarA, gVar2, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    pVar8 = pVar6;
                    pVar9 = pVar7;
                    z14 = z13;
                    q0Var3 = q0Var2;
                    m0Var2 = m0VarA;
                    gVar3 = gVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar11, int i25) {
                        AndroidMenu_androidKt.b(text, onClick, nVar3, pVar8, pVar9, z14, q0Var3, m0Var2, gVar3, pVar11, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11, Integer num) {
                        a(pVar11, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.d.f31193dj;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    pVar4 = pVar2;
                    if (pVarF.s(pVar4)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((i10 & 458752) == 0) {
                        z11 = z10;
                        if (pVarF.u(z11)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((i10 & 3670016) != 0) {
                        if ((i11 & 64) == 0) {
                            i23 = 524288;
                        } else {
                            i23 = 524288;
                        }
                        i12 |= i23;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (pVarF.s(m0Var)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    i21 = i11 & 256;
                    if (i21 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 234881024) == 0) {
                        if (pVarF.s(gVar)) {
                            i22 = 67108864;
                        } else {
                            i22 = 33554432;
                        }
                        i12 |= i22;
                    }
                    if ((i12 & 191739611) == 38347922) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i13 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i15 == 0) {
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 64) != 0) {
                                q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                q0VarB = q0Var;
                            }
                            if (i19 != 0) {
                                m0VarA = p0.f12081a.a();
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i21 != 0) {
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
                            pVar6 = pVar5;
                            pVar7 = pVar10;
                            z13 = z12;
                            q0Var2 = q0VarB;
                        } else {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i13 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i15 == 0) {
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 64) != 0) {
                                q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                q0VarB = q0Var;
                            }
                            if (i19 != 0) {
                                m0VarA = p0.f12081a.a();
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i21 != 0) {
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
                            pVar6 = pVar5;
                            pVar7 = pVar10;
                            z13 = z12;
                            q0Var2 = q0VarB;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                        }
                        MenuKt.d(text, onClick, nVar2, pVar6, pVar7, z13, q0Var2, m0VarA, gVar2, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar3 = nVar2;
                        pVar8 = pVar6;
                        pVar9 = pVar7;
                        z14 = z13;
                        q0Var3 = q0Var2;
                        m0Var2 = m0VarA;
                        gVar3 = gVar2;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i13 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i15 == 0) {
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 64) != 0) {
                                q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                q0VarB = q0Var;
                            }
                            if (i19 != 0) {
                                m0VarA = p0.f12081a.a();
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i21 != 0) {
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
                            pVar6 = pVar5;
                            pVar7 = pVar10;
                            z13 = z12;
                            q0Var2 = q0VarB;
                        } else {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i13 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i15 == 0) {
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 64) != 0) {
                                q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                q0VarB = q0Var;
                            }
                            if (i19 != 0) {
                                m0VarA = p0.f12081a.a();
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i21 != 0) {
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
                            pVar6 = pVar5;
                            pVar7 = pVar10;
                            z13 = z12;
                            q0Var2 = q0VarB;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                        }
                        MenuKt.d(text, onClick, nVar2, pVar6, pVar7, z13, q0Var2, m0VarA, gVar2, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar3 = nVar2;
                        pVar8 = pVar6;
                        pVar9 = pVar7;
                        z14 = z13;
                        q0Var3 = q0Var2;
                        m0Var2 = m0VarA;
                        gVar3 = gVar2;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar11, int i25) {
                            AndroidMenu_androidKt.b(text, onClick, nVar3, pVar8, pVar9, z14, q0Var3, m0Var2, gVar3, pVar11, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11, Integer num) {
                            a(pVar11, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i12 |= androidx.profileinstaller.o.c.f26824k;
                z11 = z10;
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (pVarF.s(m0Var)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 256;
                if (i21 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (pVarF.s(gVar)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i12 |= i22;
                }
                if ((i12 & 191739611) == 38347922) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            q0VarB = q0Var;
                        }
                        if (i19 != 0) {
                            m0VarA = p0.f12081a.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i21 != 0) {
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
                        pVar6 = pVar5;
                        pVar7 = pVar10;
                        z13 = z12;
                        q0Var2 = q0VarB;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            q0VarB = q0Var;
                        }
                        if (i19 != 0) {
                            m0VarA = p0.f12081a.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i21 != 0) {
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
                        pVar6 = pVar5;
                        pVar7 = pVar10;
                        z13 = z12;
                        q0Var2 = q0VarB;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                    }
                    MenuKt.d(text, onClick, nVar2, pVar6, pVar7, z13, q0Var2, m0VarA, gVar2, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    pVar8 = pVar6;
                    pVar9 = pVar7;
                    z14 = z13;
                    q0Var3 = q0Var2;
                    m0Var2 = m0VarA;
                    gVar3 = gVar2;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            q0VarB = q0Var;
                        }
                        if (i19 != 0) {
                            m0VarA = p0.f12081a.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i21 != 0) {
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
                        pVar6 = pVar5;
                        pVar7 = pVar10;
                        z13 = z12;
                        q0Var2 = q0VarB;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            q0VarB = q0Var;
                        }
                        if (i19 != 0) {
                            m0VarA = p0.f12081a.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i21 != 0) {
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
                        pVar6 = pVar5;
                        pVar7 = pVar10;
                        z13 = z12;
                        q0Var2 = q0VarB;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                    }
                    MenuKt.d(text, onClick, nVar2, pVar6, pVar7, z13, q0Var2, m0VarA, gVar2, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    pVar8 = pVar6;
                    pVar9 = pVar7;
                    z14 = z13;
                    q0Var3 = q0Var2;
                    m0Var2 = m0VarA;
                    gVar3 = gVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar11, int i25) {
                        AndroidMenu_androidKt.b(text, onClick, nVar3, pVar8, pVar9, z14, q0Var3, m0Var2, gVar3, pVar11, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11, Integer num) {
                        a(pVar11, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i12 |= 24576;
            pVar4 = pVar2;
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((i10 & 458752) == 0) {
                    z11 = z10;
                    if (pVarF.u(z11)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (pVarF.s(m0Var)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 256;
                if (i21 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (pVarF.s(gVar)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i12 |= i22;
                }
                if ((i12 & 191739611) == 38347922) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            q0VarB = q0Var;
                        }
                        if (i19 != 0) {
                            m0VarA = p0.f12081a.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i21 != 0) {
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
                        pVar6 = pVar5;
                        pVar7 = pVar10;
                        z13 = z12;
                        q0Var2 = q0VarB;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            q0VarB = q0Var;
                        }
                        if (i19 != 0) {
                            m0VarA = p0.f12081a.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i21 != 0) {
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
                        pVar6 = pVar5;
                        pVar7 = pVar10;
                        z13 = z12;
                        q0Var2 = q0VarB;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                    }
                    MenuKt.d(text, onClick, nVar2, pVar6, pVar7, z13, q0Var2, m0VarA, gVar2, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    pVar8 = pVar6;
                    pVar9 = pVar7;
                    z14 = z13;
                    q0Var3 = q0Var2;
                    m0Var2 = m0VarA;
                    gVar3 = gVar2;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            q0VarB = q0Var;
                        }
                        if (i19 != 0) {
                            m0VarA = p0.f12081a.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i21 != 0) {
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
                        pVar6 = pVar5;
                        pVar7 = pVar10;
                        z13 = z12;
                        q0Var2 = q0VarB;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            q0VarB = q0Var;
                        }
                        if (i19 != 0) {
                            m0VarA = p0.f12081a.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i21 != 0) {
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
                        pVar6 = pVar5;
                        pVar7 = pVar10;
                        z13 = z12;
                        q0Var2 = q0VarB;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                    }
                    MenuKt.d(text, onClick, nVar2, pVar6, pVar7, z13, q0Var2, m0VarA, gVar2, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    pVar8 = pVar6;
                    pVar9 = pVar7;
                    z14 = z13;
                    q0Var3 = q0Var2;
                    m0Var2 = m0VarA;
                    gVar3 = gVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar11, int i25) {
                        AndroidMenu_androidKt.b(text, onClick, nVar3, pVar8, pVar9, z14, q0Var3, m0Var2, gVar3, pVar11, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11, Integer num) {
                        a(pVar11, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i12 |= androidx.profileinstaller.o.c.f26824k;
            z11 = z10;
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i12 |= i23;
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (pVarF.s(m0Var)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            i21 = i11 & 256;
            if (i21 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (pVarF.s(gVar)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i12 |= i22;
            }
            if ((i12 & 191739611) == 38347922) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i15 == 0) {
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 64) != 0) {
                        q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        q0VarB = q0Var;
                    }
                    if (i19 != 0) {
                        m0VarA = p0.f12081a.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i21 != 0) {
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
                    pVar6 = pVar5;
                    pVar7 = pVar10;
                    z13 = z12;
                    q0Var2 = q0VarB;
                } else {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i15 == 0) {
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 64) != 0) {
                        q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        q0VarB = q0Var;
                    }
                    if (i19 != 0) {
                        m0VarA = p0.f12081a.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i21 != 0) {
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
                    pVar6 = pVar5;
                    pVar7 = pVar10;
                    z13 = z12;
                    q0Var2 = q0VarB;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                }
                MenuKt.d(text, onClick, nVar2, pVar6, pVar7, z13, q0Var2, m0VarA, gVar2, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar3 = nVar2;
                pVar8 = pVar6;
                pVar9 = pVar7;
                z14 = z13;
                q0Var3 = q0Var2;
                m0Var2 = m0VarA;
                gVar3 = gVar2;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i15 == 0) {
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 64) != 0) {
                        q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        q0VarB = q0Var;
                    }
                    if (i19 != 0) {
                        m0VarA = p0.f12081a.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i21 != 0) {
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
                    pVar6 = pVar5;
                    pVar7 = pVar10;
                    z13 = z12;
                    q0Var2 = q0VarB;
                } else {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i15 == 0) {
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 64) != 0) {
                        q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        q0VarB = q0Var;
                    }
                    if (i19 != 0) {
                        m0VarA = p0.f12081a.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i21 != 0) {
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
                    pVar6 = pVar5;
                    pVar7 = pVar10;
                    z13 = z12;
                    q0Var2 = q0VarB;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                }
                MenuKt.d(text, onClick, nVar2, pVar6, pVar7, z13, q0Var2, m0VarA, gVar2, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar3 = nVar2;
                pVar8 = pVar6;
                pVar9 = pVar7;
                z14 = z13;
                q0Var3 = q0Var2;
                m0Var2 = m0VarA;
                gVar3 = gVar2;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar11, int i25) {
                    AndroidMenu_androidKt.b(text, onClick, nVar3, pVar8, pVar9, z14, q0Var3, m0Var2, gVar3, pVar11, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11, Integer num) {
                    a(pVar11, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= bb.c.b.f30966u4;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & bb.c.g.f32954lc) == 0) {
                if (pVarF.s(pVar)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    pVar4 = pVar2;
                    if (pVarF.s(pVar4)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((i10 & 458752) == 0) {
                        z11 = z10;
                        if (pVarF.u(z11)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((i10 & 3670016) != 0) {
                        if ((i11 & 64) == 0) {
                            i23 = 524288;
                        } else {
                            i23 = 524288;
                        }
                        i12 |= i23;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (pVarF.s(m0Var)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    i21 = i11 & 256;
                    if (i21 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 234881024) == 0) {
                        if (pVarF.s(gVar)) {
                            i22 = 67108864;
                        } else {
                            i22 = 33554432;
                        }
                        i12 |= i22;
                    }
                    if ((i12 & 191739611) == 38347922) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i13 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i15 == 0) {
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 64) != 0) {
                                q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                q0VarB = q0Var;
                            }
                            if (i19 != 0) {
                                m0VarA = p0.f12081a.a();
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i21 != 0) {
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
                            pVar6 = pVar5;
                            pVar7 = pVar10;
                            z13 = z12;
                            q0Var2 = q0VarB;
                        } else {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i13 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i15 == 0) {
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 64) != 0) {
                                q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                q0VarB = q0Var;
                            }
                            if (i19 != 0) {
                                m0VarA = p0.f12081a.a();
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i21 != 0) {
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
                            pVar6 = pVar5;
                            pVar7 = pVar10;
                            z13 = z12;
                            q0Var2 = q0VarB;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                        }
                        MenuKt.d(text, onClick, nVar2, pVar6, pVar7, z13, q0Var2, m0VarA, gVar2, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar3 = nVar2;
                        pVar8 = pVar6;
                        pVar9 = pVar7;
                        z14 = z13;
                        q0Var3 = q0Var2;
                        m0Var2 = m0VarA;
                        gVar3 = gVar2;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i13 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i15 == 0) {
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 64) != 0) {
                                q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                q0VarB = q0Var;
                            }
                            if (i19 != 0) {
                                m0VarA = p0.f12081a.a();
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i21 != 0) {
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
                            pVar6 = pVar5;
                            pVar7 = pVar10;
                            z13 = z12;
                            q0Var2 = q0VarB;
                        } else {
                            if (i24 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i13 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i15 == 0) {
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 64) != 0) {
                                q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                q0VarB = q0Var;
                            }
                            if (i19 != 0) {
                                m0VarA = p0.f12081a.a();
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i21 != 0) {
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
                            pVar6 = pVar5;
                            pVar7 = pVar10;
                            z13 = z12;
                            q0Var2 = q0VarB;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                        }
                        MenuKt.d(text, onClick, nVar2, pVar6, pVar7, z13, q0Var2, m0VarA, gVar2, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar3 = nVar2;
                        pVar8 = pVar6;
                        pVar9 = pVar7;
                        z14 = z13;
                        q0Var3 = q0Var2;
                        m0Var2 = m0VarA;
                        gVar3 = gVar2;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar11, int i25) {
                            AndroidMenu_androidKt.b(text, onClick, nVar3, pVar8, pVar9, z14, q0Var3, m0Var2, gVar3, pVar11, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11, Integer num) {
                            a(pVar11, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i12 |= androidx.profileinstaller.o.c.f26824k;
                z11 = z10;
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (pVarF.s(m0Var)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 256;
                if (i21 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (pVarF.s(gVar)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i12 |= i22;
                }
                if ((i12 & 191739611) == 38347922) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            q0VarB = q0Var;
                        }
                        if (i19 != 0) {
                            m0VarA = p0.f12081a.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i21 != 0) {
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
                        pVar6 = pVar5;
                        pVar7 = pVar10;
                        z13 = z12;
                        q0Var2 = q0VarB;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            q0VarB = q0Var;
                        }
                        if (i19 != 0) {
                            m0VarA = p0.f12081a.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i21 != 0) {
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
                        pVar6 = pVar5;
                        pVar7 = pVar10;
                        z13 = z12;
                        q0Var2 = q0VarB;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                    }
                    MenuKt.d(text, onClick, nVar2, pVar6, pVar7, z13, q0Var2, m0VarA, gVar2, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    pVar8 = pVar6;
                    pVar9 = pVar7;
                    z14 = z13;
                    q0Var3 = q0Var2;
                    m0Var2 = m0VarA;
                    gVar3 = gVar2;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            q0VarB = q0Var;
                        }
                        if (i19 != 0) {
                            m0VarA = p0.f12081a.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i21 != 0) {
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
                        pVar6 = pVar5;
                        pVar7 = pVar10;
                        z13 = z12;
                        q0Var2 = q0VarB;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            q0VarB = q0Var;
                        }
                        if (i19 != 0) {
                            m0VarA = p0.f12081a.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i21 != 0) {
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
                        pVar6 = pVar5;
                        pVar7 = pVar10;
                        z13 = z12;
                        q0Var2 = q0VarB;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                    }
                    MenuKt.d(text, onClick, nVar2, pVar6, pVar7, z13, q0Var2, m0VarA, gVar2, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    pVar8 = pVar6;
                    pVar9 = pVar7;
                    z14 = z13;
                    q0Var3 = q0Var2;
                    m0Var2 = m0VarA;
                    gVar3 = gVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar11, int i25) {
                        AndroidMenu_androidKt.b(text, onClick, nVar3, pVar8, pVar9, z14, q0Var3, m0Var2, gVar3, pVar11, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11, Integer num) {
                        a(pVar11, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i12 |= 24576;
            pVar4 = pVar2;
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((i10 & 458752) == 0) {
                    z11 = z10;
                    if (pVarF.u(z11)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (pVarF.s(m0Var)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 256;
                if (i21 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (pVarF.s(gVar)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i12 |= i22;
                }
                if ((i12 & 191739611) == 38347922) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            q0VarB = q0Var;
                        }
                        if (i19 != 0) {
                            m0VarA = p0.f12081a.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i21 != 0) {
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
                        pVar6 = pVar5;
                        pVar7 = pVar10;
                        z13 = z12;
                        q0Var2 = q0VarB;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            q0VarB = q0Var;
                        }
                        if (i19 != 0) {
                            m0VarA = p0.f12081a.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i21 != 0) {
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
                        pVar6 = pVar5;
                        pVar7 = pVar10;
                        z13 = z12;
                        q0Var2 = q0VarB;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                    }
                    MenuKt.d(text, onClick, nVar2, pVar6, pVar7, z13, q0Var2, m0VarA, gVar2, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    pVar8 = pVar6;
                    pVar9 = pVar7;
                    z14 = z13;
                    q0Var3 = q0Var2;
                    m0Var2 = m0VarA;
                    gVar3 = gVar2;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            q0VarB = q0Var;
                        }
                        if (i19 != 0) {
                            m0VarA = p0.f12081a.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i21 != 0) {
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
                        pVar6 = pVar5;
                        pVar7 = pVar10;
                        z13 = z12;
                        q0Var2 = q0VarB;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            q0VarB = q0Var;
                        }
                        if (i19 != 0) {
                            m0VarA = p0.f12081a.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i21 != 0) {
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
                        pVar6 = pVar5;
                        pVar7 = pVar10;
                        z13 = z12;
                        q0Var2 = q0VarB;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                    }
                    MenuKt.d(text, onClick, nVar2, pVar6, pVar7, z13, q0Var2, m0VarA, gVar2, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    pVar8 = pVar6;
                    pVar9 = pVar7;
                    z14 = z13;
                    q0Var3 = q0Var2;
                    m0Var2 = m0VarA;
                    gVar3 = gVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar11, int i25) {
                        AndroidMenu_androidKt.b(text, onClick, nVar3, pVar8, pVar9, z14, q0Var3, m0Var2, gVar3, pVar11, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11, Integer num) {
                        a(pVar11, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i12 |= androidx.profileinstaller.o.c.f26824k;
            z11 = z10;
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i12 |= i23;
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (pVarF.s(m0Var)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            i21 = i11 & 256;
            if (i21 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (pVarF.s(gVar)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i12 |= i22;
            }
            if ((i12 & 191739611) == 38347922) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i15 == 0) {
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 64) != 0) {
                        q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        q0VarB = q0Var;
                    }
                    if (i19 != 0) {
                        m0VarA = p0.f12081a.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i21 != 0) {
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
                    pVar6 = pVar5;
                    pVar7 = pVar10;
                    z13 = z12;
                    q0Var2 = q0VarB;
                } else {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i15 == 0) {
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 64) != 0) {
                        q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        q0VarB = q0Var;
                    }
                    if (i19 != 0) {
                        m0VarA = p0.f12081a.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i21 != 0) {
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
                    pVar6 = pVar5;
                    pVar7 = pVar10;
                    z13 = z12;
                    q0Var2 = q0VarB;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                }
                MenuKt.d(text, onClick, nVar2, pVar6, pVar7, z13, q0Var2, m0VarA, gVar2, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar3 = nVar2;
                pVar8 = pVar6;
                pVar9 = pVar7;
                z14 = z13;
                q0Var3 = q0Var2;
                m0Var2 = m0VarA;
                gVar3 = gVar2;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i15 == 0) {
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 64) != 0) {
                        q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        q0VarB = q0Var;
                    }
                    if (i19 != 0) {
                        m0VarA = p0.f12081a.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i21 != 0) {
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
                    pVar6 = pVar5;
                    pVar7 = pVar10;
                    z13 = z12;
                    q0Var2 = q0VarB;
                } else {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i15 == 0) {
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 64) != 0) {
                        q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        q0VarB = q0Var;
                    }
                    if (i19 != 0) {
                        m0VarA = p0.f12081a.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i21 != 0) {
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
                    pVar6 = pVar5;
                    pVar7 = pVar10;
                    z13 = z12;
                    q0Var2 = q0VarB;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                }
                MenuKt.d(text, onClick, nVar2, pVar6, pVar7, z13, q0Var2, m0VarA, gVar2, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar3 = nVar2;
                pVar8 = pVar6;
                pVar9 = pVar7;
                z14 = z13;
                q0Var3 = q0Var2;
                m0Var2 = m0VarA;
                gVar3 = gVar2;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar11, int i25) {
                    AndroidMenu_androidKt.b(text, onClick, nVar3, pVar8, pVar9, z14, q0Var3, m0Var2, gVar3, pVar11, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11, Integer num) {
                    a(pVar11, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= bb.c.d.f31193dj;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((i10 & 57344) == 0) {
                pVar4 = pVar2;
                if (pVarF.s(pVar4)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((i10 & 458752) == 0) {
                    z11 = z10;
                    if (pVarF.u(z11)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (pVarF.s(m0Var)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 256;
                if (i21 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (pVarF.s(gVar)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i12 |= i22;
                }
                if ((i12 & 191739611) == 38347922) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            q0VarB = q0Var;
                        }
                        if (i19 != 0) {
                            m0VarA = p0.f12081a.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i21 != 0) {
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
                        pVar6 = pVar5;
                        pVar7 = pVar10;
                        z13 = z12;
                        q0Var2 = q0VarB;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            q0VarB = q0Var;
                        }
                        if (i19 != 0) {
                            m0VarA = p0.f12081a.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i21 != 0) {
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
                        pVar6 = pVar5;
                        pVar7 = pVar10;
                        z13 = z12;
                        q0Var2 = q0VarB;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                    }
                    MenuKt.d(text, onClick, nVar2, pVar6, pVar7, z13, q0Var2, m0VarA, gVar2, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    pVar8 = pVar6;
                    pVar9 = pVar7;
                    z14 = z13;
                    q0Var3 = q0Var2;
                    m0Var2 = m0VarA;
                    gVar3 = gVar2;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            q0VarB = q0Var;
                        }
                        if (i19 != 0) {
                            m0VarA = p0.f12081a.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i21 != 0) {
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
                        pVar6 = pVar5;
                        pVar7 = pVar10;
                        z13 = z12;
                        q0Var2 = q0VarB;
                    } else {
                        if (i24 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i15 == 0) {
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 64) != 0) {
                            q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            q0VarB = q0Var;
                        }
                        if (i19 != 0) {
                            m0VarA = p0.f12081a.a();
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i21 != 0) {
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
                        pVar6 = pVar5;
                        pVar7 = pVar10;
                        z13 = z12;
                        q0Var2 = q0VarB;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                    }
                    MenuKt.d(text, onClick, nVar2, pVar6, pVar7, z13, q0Var2, m0VarA, gVar2, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar3 = nVar2;
                    pVar8 = pVar6;
                    pVar9 = pVar7;
                    z14 = z13;
                    q0Var3 = q0Var2;
                    m0Var2 = m0VarA;
                    gVar3 = gVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar11, int i25) {
                        AndroidMenu_androidKt.b(text, onClick, nVar3, pVar8, pVar9, z14, q0Var3, m0Var2, gVar3, pVar11, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11, Integer num) {
                        a(pVar11, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i12 |= androidx.profileinstaller.o.c.f26824k;
            z11 = z10;
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i12 |= i23;
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (pVarF.s(m0Var)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            i21 = i11 & 256;
            if (i21 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (pVarF.s(gVar)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i12 |= i22;
            }
            if ((i12 & 191739611) == 38347922) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i15 == 0) {
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 64) != 0) {
                        q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        q0VarB = q0Var;
                    }
                    if (i19 != 0) {
                        m0VarA = p0.f12081a.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i21 != 0) {
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
                    pVar6 = pVar5;
                    pVar7 = pVar10;
                    z13 = z12;
                    q0Var2 = q0VarB;
                } else {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i15 == 0) {
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 64) != 0) {
                        q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        q0VarB = q0Var;
                    }
                    if (i19 != 0) {
                        m0VarA = p0.f12081a.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i21 != 0) {
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
                    pVar6 = pVar5;
                    pVar7 = pVar10;
                    z13 = z12;
                    q0Var2 = q0VarB;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                }
                MenuKt.d(text, onClick, nVar2, pVar6, pVar7, z13, q0Var2, m0VarA, gVar2, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar3 = nVar2;
                pVar8 = pVar6;
                pVar9 = pVar7;
                z14 = z13;
                q0Var3 = q0Var2;
                m0Var2 = m0VarA;
                gVar3 = gVar2;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i15 == 0) {
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 64) != 0) {
                        q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        q0VarB = q0Var;
                    }
                    if (i19 != 0) {
                        m0VarA = p0.f12081a.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i21 != 0) {
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
                    pVar6 = pVar5;
                    pVar7 = pVar10;
                    z13 = z12;
                    q0Var2 = q0VarB;
                } else {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i15 == 0) {
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 64) != 0) {
                        q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        q0VarB = q0Var;
                    }
                    if (i19 != 0) {
                        m0VarA = p0.f12081a.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i21 != 0) {
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
                    pVar6 = pVar5;
                    pVar7 = pVar10;
                    z13 = z12;
                    q0Var2 = q0VarB;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                }
                MenuKt.d(text, onClick, nVar2, pVar6, pVar7, z13, q0Var2, m0VarA, gVar2, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar3 = nVar2;
                pVar8 = pVar6;
                pVar9 = pVar7;
                z14 = z13;
                q0Var3 = q0Var2;
                m0Var2 = m0VarA;
                gVar3 = gVar2;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar11, int i25) {
                    AndroidMenu_androidKt.b(text, onClick, nVar3, pVar8, pVar9, z14, q0Var3, m0Var2, gVar3, pVar11, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11, Integer num) {
                    a(pVar11, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= 24576;
        pVar4 = pVar2;
        i17 = i11 & 32;
        if (i17 != 0) {
            if ((i10 & 458752) == 0) {
                z11 = z10;
                if (pVarF.u(z11)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i12 |= i23;
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (pVarF.s(m0Var)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            i21 = i11 & 256;
            if (i21 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (pVarF.s(gVar)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i12 |= i22;
            }
            if ((i12 & 191739611) == 38347922) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i15 == 0) {
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 64) != 0) {
                        q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        q0VarB = q0Var;
                    }
                    if (i19 != 0) {
                        m0VarA = p0.f12081a.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i21 != 0) {
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
                    pVar6 = pVar5;
                    pVar7 = pVar10;
                    z13 = z12;
                    q0Var2 = q0VarB;
                } else {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i15 == 0) {
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 64) != 0) {
                        q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        q0VarB = q0Var;
                    }
                    if (i19 != 0) {
                        m0VarA = p0.f12081a.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i21 != 0) {
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
                    pVar6 = pVar5;
                    pVar7 = pVar10;
                    z13 = z12;
                    q0Var2 = q0VarB;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                }
                MenuKt.d(text, onClick, nVar2, pVar6, pVar7, z13, q0Var2, m0VarA, gVar2, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar3 = nVar2;
                pVar8 = pVar6;
                pVar9 = pVar7;
                z14 = z13;
                q0Var3 = q0Var2;
                m0Var2 = m0VarA;
                gVar3 = gVar2;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i15 == 0) {
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 64) != 0) {
                        q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        q0VarB = q0Var;
                    }
                    if (i19 != 0) {
                        m0VarA = p0.f12081a.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i21 != 0) {
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
                    pVar6 = pVar5;
                    pVar7 = pVar10;
                    z13 = z12;
                    q0Var2 = q0VarB;
                } else {
                    if (i24 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i15 == 0) {
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 64) != 0) {
                        q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        q0VarB = q0Var;
                    }
                    if (i19 != 0) {
                        m0VarA = p0.f12081a.a();
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i21 != 0) {
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
                    pVar6 = pVar5;
                    pVar7 = pVar10;
                    z13 = z12;
                    q0Var2 = q0VarB;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
                }
                MenuKt.d(text, onClick, nVar2, pVar6, pVar7, z13, q0Var2, m0VarA, gVar2, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar3 = nVar2;
                pVar8 = pVar6;
                pVar9 = pVar7;
                z14 = z13;
                q0Var3 = q0Var2;
                m0Var2 = m0VarA;
                gVar3 = gVar2;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar11, int i25) {
                    AndroidMenu_androidKt.b(text, onClick, nVar3, pVar8, pVar9, z14, q0Var3, m0Var2, gVar3, pVar11, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11, Integer num) {
                    a(pVar11, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= androidx.profileinstaller.o.c.f26824k;
        z11 = z10;
        if ((i10 & 3670016) != 0) {
            if ((i11 & 64) == 0) {
                i23 = 524288;
            } else {
                i23 = 524288;
            }
            i12 |= i23;
        }
        i19 = i11 & 128;
        if (i19 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            if (pVarF.s(m0Var)) {
                i20 = 8388608;
            } else {
                i20 = 4194304;
            }
            i12 |= i20;
        }
        i21 = i11 & 256;
        if (i21 != 0) {
            i12 |= 100663296;
        } else if ((i10 & 234881024) == 0) {
            if (pVarF.s(gVar)) {
                i22 = 67108864;
            } else {
                i22 = 33554432;
            }
            i12 |= i22;
        }
        if ((i12 & 191739611) == 38347922) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i24 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i13 != 0) {
                    pVar5 = null;
                } else {
                    pVar5 = pVar;
                }
                if (i15 == 0) {
                }
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if ((i11 & 64) != 0) {
                    q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                    i12 &= -3670017;
                } else {
                    q0VarB = q0Var;
                }
                if (i19 != 0) {
                    m0VarA = p0.f12081a.a();
                } else {
                    m0VarA = m0Var;
                }
                if (i21 != 0) {
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
                pVar6 = pVar5;
                pVar7 = pVar10;
                z13 = z12;
                q0Var2 = q0VarB;
            } else {
                if (i24 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i13 != 0) {
                    pVar5 = null;
                } else {
                    pVar5 = pVar;
                }
                if (i15 == 0) {
                }
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if ((i11 & 64) != 0) {
                    q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                    i12 &= -3670017;
                } else {
                    q0VarB = q0Var;
                }
                if (i19 != 0) {
                    m0VarA = p0.f12081a.a();
                } else {
                    m0VarA = m0Var;
                }
                if (i21 != 0) {
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
                pVar6 = pVar5;
                pVar7 = pVar10;
                z13 = z12;
                q0Var2 = q0VarB;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
            }
            MenuKt.d(text, onClick, nVar2, pVar6, pVar7, z13, q0Var2, m0VarA, gVar2, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar3 = nVar2;
            pVar8 = pVar6;
            pVar9 = pVar7;
            z14 = z13;
            q0Var3 = q0Var2;
            m0Var2 = m0VarA;
            gVar3 = gVar2;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i24 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i13 != 0) {
                    pVar5 = null;
                } else {
                    pVar5 = pVar;
                }
                if (i15 == 0) {
                }
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if ((i11 & 64) != 0) {
                    q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                    i12 &= -3670017;
                } else {
                    q0VarB = q0Var;
                }
                if (i19 != 0) {
                    m0VarA = p0.f12081a.a();
                } else {
                    m0VarA = m0Var;
                }
                if (i21 != 0) {
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
                pVar6 = pVar5;
                pVar7 = pVar10;
                z13 = z12;
                q0Var2 = q0VarB;
            } else {
                if (i24 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i13 != 0) {
                    pVar5 = null;
                } else {
                    pVar5 = pVar;
                }
                if (i15 == 0) {
                }
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if ((i11 & 64) != 0) {
                    q0VarB = p0.f12081a.b(0L, 0L, 0L, 0L, 0L, 0L, pVarF, 1572864, 63);
                    i12 &= -3670017;
                } else {
                    q0VarB = q0Var;
                }
                if (i19 != 0) {
                    m0VarA = p0.f12081a.a();
                } else {
                    m0VarA = m0Var;
                }
                if (i21 != 0) {
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
                pVar6 = pVar5;
                pVar7 = pVar10;
                z13 = z12;
                q0Var2 = q0VarB;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(1826340448, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)");
            }
            MenuKt.d(text, onClick, nVar2, pVar6, pVar7, z13, q0Var2, m0VarA, gVar2, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (57344 & i12) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar3 = nVar2;
            pVar8 = pVar6;
            pVar9 = pVar7;
            z14 = z13;
            q0Var3 = q0Var2;
            m0Var2 = m0VarA;
            gVar3 = gVar2;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar11, int i25) {
                AndroidMenu_androidKt.b(text, onClick, nVar3, pVar8, pVar9, z14, q0Var3, m0Var2, gVar3, pVar11, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11, Integer num) {
                a(pVar11, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }
}
