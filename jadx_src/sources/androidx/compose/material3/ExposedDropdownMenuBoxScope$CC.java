package androidx.compose.material3;

import androidx.compose.material3.internal.ExposedDropdownMenuPopupKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.h2;
import androidx.compose.ui.graphics.o2;
import androidx.compose.ui.platform.CompositionLocalsKt;

/* JADX INFO: renamed from: androidx.compose.material3.ExposedDropdownMenuBoxScope$-CC, reason: invalid class name */
/* JADX INFO: compiled from: ExposedDropdownMenu.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExposedDropdownMenuBoxScope$CC {
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:75:0x010c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0119  */
    /* JADX WARN: Code duplicated, block: B:80:0x0153  */
    /* JADX WARN: Code duplicated, block: B:82:0x0159  */
    /* JADX WARN: Code duplicated, block: B:86:0x019e  */
    /* JADX WARN: Code duplicated, block: B:91:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static void a(final x xVar, final boolean z10, @dl.d final yh.a onDismissRequest, @dl.e androidx.compose.ui.n nVar, @dl.d final yh.q content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.n nVar2;
        int i13;
        int i14;
        androidx.compose.ui.n nVar3;
        Object objU;
        androidx.compose.runtime.p.Companion companion;
        final androidx.compose.animation.core.r0 r0Var;
        Object objU2;
        final androidx.compose.runtime.a1 a1Var;
        boolean zS;
        Object objU3;
        final androidx.compose.ui.n nVar4;
        androidx.compose.runtime.u1 u1VarH;
        kotlin.jvm.internal.f0.p(onDismissRequest, "onDismissRequest");
        kotlin.jvm.internal.f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(-1658683708);
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
        int i15 = i11 & 4;
        if (i15 == 0) {
            if ((i10 & bb.c.b.f30796me) == 0) {
                nVar2 = nVar;
                i12 |= pVarF.s(nVar2) ? 256 : 128;
            }
            if ((i11 & 8) != 0) {
                i12 |= bb.c.d.f31193dj;
            } else if ((i10 & bb.c.g.f32954lc) == 0) {
                if (pVarF.s(content)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (pVarF.s(xVar)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            if ((46811 & i12) == 9362 || !pVarF.b()) {
                if (i15 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1658683708, i12, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:242)");
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
                    long jB = s1.j.f139224b.b();
                    pVarF.T(1157296644);
                    zS = pVarF.s(a1Var);
                    objU3 = pVarF.U();
                    if (zS || objU3 == companion.a()) {
                        objU3 = new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void a(@dl.d s1.p anchorBounds, @dl.d s1.p menuBounds) {
                                kotlin.jvm.internal.f0.p(anchorBounds, "anchorBounds");
                                kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
                                a1Var.setValue(o2.b(MenuKt.h(anchorBounds, menuBounds)));
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
                    final androidx.compose.ui.n nVar5 = nVar3;
                    final int i16 = i12;
                    ExposedDropdownMenuPopupKt.a(onDismissRequest, new DropdownMenuPositionProvider(jB, eVar, (yh.p) objU3, null), androidx.compose.runtime.internal.b.b(pVarF, 395026654, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i17) {
                            if ((i17 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(395026654, i17, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.kt:273)");
                            }
                            MenuKt.a(r0Var, a1Var, ExposedDropdownMenuBoxScope$CC.b(xVar, nVar5, false, 1, null), content, pVar2, androidx.compose.animation.core.r0.f4499d | 48 | (i16 & bb.c.g.f32954lc), 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, ((i12 >> 3) & 14) | bb.c.b.f30966u4, 0);
                }
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
            } else {
                pVarF.l();
                nVar4 = nVar2;
                pVarF = pVarF;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i17) {
                    xVar.a(z10, onDismissRequest, nVar4, content, pVar2, i10 | 1, i11);
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
        if ((i11 & 8) != 0) {
            i12 |= bb.c.d.f31193dj;
        } else if ((i10 & bb.c.g.f32954lc) == 0) {
            if (pVarF.s(content)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            if (pVarF.s(xVar)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i12 |= i14;
        }
        if ((46811 & i12) == 9362) {
            if (i15 != 0) {
                nVar3 = androidx.compose.ui.n.INSTANCE;
            } else {
                nVar3 = nVar2;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1658683708, i12, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:242)");
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
                long jB2 = s1.j.f139224b.b();
                pVarF.T(1157296644);
                zS = pVarF.s(a1Var);
                objU3 = pVarF.U();
                if (zS) {
                    objU3 = new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void a(@dl.d s1.p anchorBounds, @dl.d s1.p menuBounds) {
                            kotlin.jvm.internal.f0.p(anchorBounds, "anchorBounds");
                            kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
                            a1Var.setValue(o2.b(MenuKt.h(anchorBounds, menuBounds)));
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.p pVar2, s1.p pVar3) {
                            a(pVar2, pVar3);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void a(@dl.d s1.p anchorBounds, @dl.d s1.p menuBounds) {
                            kotlin.jvm.internal.f0.p(anchorBounds, "anchorBounds");
                            kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
                            a1Var.setValue(o2.b(MenuKt.h(anchorBounds, menuBounds)));
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
                final androidx.compose.ui.n nVar6 = nVar3;
                final int i17 = i12;
                ExposedDropdownMenuPopupKt.a(onDismissRequest, new DropdownMenuPositionProvider(jB2, eVar2, (yh.p) objU3, null), androidx.compose.runtime.internal.b.b(pVarF, 395026654, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i18) {
                        if ((i18 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(395026654, i18, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.kt:273)");
                        }
                        MenuKt.a(r0Var, a1Var, ExposedDropdownMenuBoxScope$CC.b(xVar, nVar6, false, 1, null), content, pVar2, androidx.compose.animation.core.r0.f4499d | 48 | (i17 & bb.c.g.f32954lc), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, ((i12 >> 3) & 14) | bb.c.b.f30966u4, 0);
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
                long jB3 = s1.j.f139224b.b();
                pVarF.T(1157296644);
                zS = pVarF.s(a1Var);
                objU3 = pVarF.U();
                if (zS) {
                    objU3 = new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void a(@dl.d s1.p anchorBounds, @dl.d s1.p menuBounds) {
                            kotlin.jvm.internal.f0.p(anchorBounds, "anchorBounds");
                            kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
                            a1Var.setValue(o2.b(MenuKt.h(anchorBounds, menuBounds)));
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.p pVar2, s1.p pVar3) {
                            a(pVar2, pVar3);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void a(@dl.d s1.p anchorBounds, @dl.d s1.p menuBounds) {
                            kotlin.jvm.internal.f0.p(anchorBounds, "anchorBounds");
                            kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
                            a1Var.setValue(o2.b(MenuKt.h(anchorBounds, menuBounds)));
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
                final androidx.compose.ui.n nVar7 = nVar3;
                final int i18 = i12;
                ExposedDropdownMenuPopupKt.a(onDismissRequest, new DropdownMenuPositionProvider(jB3, eVar3, (yh.p) objU3, null), androidx.compose.runtime.internal.b.b(pVarF, 395026654, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i19) {
                        if ((i19 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(395026654, i19, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.kt:273)");
                        }
                        MenuKt.a(r0Var, a1Var, ExposedDropdownMenuBoxScope$CC.b(xVar, nVar7, false, 1, null), content, pVar2, androidx.compose.animation.core.r0.f4499d | 48 | (i18 & bb.c.g.f32954lc), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, ((i12 >> 3) & 14) | bb.c.b.f30966u4, 0);
            }
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
        } else {
            if (i15 != 0) {
                nVar3 = androidx.compose.ui.n.INSTANCE;
            } else {
                nVar3 = nVar2;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1658683708, i12, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:242)");
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
                long jB4 = s1.j.f139224b.b();
                pVarF.T(1157296644);
                zS = pVarF.s(a1Var);
                objU3 = pVarF.U();
                if (zS) {
                    objU3 = new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void a(@dl.d s1.p anchorBounds, @dl.d s1.p menuBounds) {
                            kotlin.jvm.internal.f0.p(anchorBounds, "anchorBounds");
                            kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
                            a1Var.setValue(o2.b(MenuKt.h(anchorBounds, menuBounds)));
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.p pVar2, s1.p pVar3) {
                            a(pVar2, pVar3);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void a(@dl.d s1.p anchorBounds, @dl.d s1.p menuBounds) {
                            kotlin.jvm.internal.f0.p(anchorBounds, "anchorBounds");
                            kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
                            a1Var.setValue(o2.b(MenuKt.h(anchorBounds, menuBounds)));
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
                final androidx.compose.ui.n nVar8 = nVar3;
                final int i19 = i12;
                ExposedDropdownMenuPopupKt.a(onDismissRequest, new DropdownMenuPositionProvider(jB4, eVar4, (yh.p) objU3, null), androidx.compose.runtime.internal.b.b(pVarF, 395026654, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i110) {
                        if ((i110 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(395026654, i110, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.kt:273)");
                        }
                        MenuKt.a(r0Var, a1Var, ExposedDropdownMenuBoxScope$CC.b(xVar, nVar8, false, 1, null), content, pVar2, androidx.compose.animation.core.r0.f4499d | 48 | (i19 & bb.c.g.f32954lc), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, ((i12 >> 3) & 14) | bb.c.b.f30966u4, 0);
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
                long jB5 = s1.j.f139224b.b();
                pVarF.T(1157296644);
                zS = pVarF.s(a1Var);
                objU3 = pVarF.U();
                if (zS) {
                    objU3 = new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void a(@dl.d s1.p anchorBounds, @dl.d s1.p menuBounds) {
                            kotlin.jvm.internal.f0.p(anchorBounds, "anchorBounds");
                            kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
                            a1Var.setValue(o2.b(MenuKt.h(anchorBounds, menuBounds)));
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.p pVar2, s1.p pVar3) {
                            a(pVar2, pVar3);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.p<s1.p, s1.p, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void a(@dl.d s1.p anchorBounds, @dl.d s1.p menuBounds) {
                            kotlin.jvm.internal.f0.p(anchorBounds, "anchorBounds");
                            kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
                            a1Var.setValue(o2.b(MenuKt.h(anchorBounds, menuBounds)));
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
                final androidx.compose.ui.n nVar9 = nVar3;
                final int i110 = i12;
                ExposedDropdownMenuPopupKt.a(onDismissRequest, new DropdownMenuPositionProvider(jB5, eVar5, (yh.p) objU3, null), androidx.compose.runtime.internal.b.b(pVarF, 395026654, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i111) {
                        if ((i111 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(395026654, i111, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.kt:273)");
                        }
                        MenuKt.a(r0Var, a1Var, ExposedDropdownMenuBoxScope$CC.b(xVar, nVar9, false, 1, null), content, pVar2, androidx.compose.animation.core.r0.f4499d | 48 | (i110 & bb.c.g.f32954lc), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, ((i12 >> 3) & 14) | bb.c.b.f30966u4, 0);
            }
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i111) {
                xVar.a(z10, onDismissRequest, nVar4, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    public static /* synthetic */ androidx.compose.ui.n b(x xVar, androidx.compose.ui.n nVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return xVar.b(nVar, z10);
    }
}
