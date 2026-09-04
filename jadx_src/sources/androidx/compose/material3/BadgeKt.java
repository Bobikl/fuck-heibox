package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
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
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* JADX INFO: compiled from: Badge.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001aU\u0010\t\u001a\u00020\u00022\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\t\u0010\n\u001aU\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2 \b\u0002\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\"\u001d\u0010\u0015\u001a\u00020\u00118\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u001d\u0010\u0017\u001a\u00020\u00118\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014\"\u001d\u0010\u001a\u001a\u00020\u00118\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u001d\u0010\u001b\u001a\u00020\u00118\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/foundation/layout/k;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "Lkotlin/t;", "badge", "Landroidx/compose/ui/n;", "modifier", "content", "b", "(Lyh/q;Landroidx/compose/ui/n;Lyh/q;Landroidx/compose/runtime/p;II)V", "Landroidx/compose/ui/graphics/l0;", "containerColor", "contentColor", "Landroidx/compose/foundation/layout/x0;", ak.av, "(Landroidx/compose/ui/n;JJLyh/q;Landroidx/compose/runtime/p;II)V", "Ls1/h;", "F", "e", "()F", "BadgeWithContentHorizontalPadding", "d", "BadgeWithContentHorizontalOffset", ak.aF, "f", "BadgeWithContentVerticalOffset", "BadgeOffset", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class BadgeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f8853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f8854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f8855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f8856d = s1.h.g(0);

    static {
        float f10 = 4;
        f8853a = s1.h.g(f10);
        f8854b = s1.h.g(-s1.h.g(f10));
        f8855c = s1.h.g(-s1.h.g(f10));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x021e  */
    /* JADX WARN: Code duplicated, block: B:105:0x022c  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00da  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:83:0x0103  */
    /* JADX WARN: Code duplicated, block: B:86:0x0124  */
    /* JADX WARN: Code duplicated, block: B:87:0x012e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0184  */
    /* JADX WARN: Code duplicated, block: B:93:0x0190  */
    /* JADX WARN: Code duplicated, block: B:94:0x0194  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e3  */
    @w
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void a(@dl.e androidx.compose.ui.n nVar, long j10, long j11, @dl.e yh.q<? super androidx.compose.foundation.layout.x0, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        androidx.compose.ui.n nVar2;
        final int i12;
        long jA;
        long jC;
        final yh.q<? super androidx.compose.foundation.layout.x0, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar2;
        androidx.compose.ui.n nVar3;
        t0.b bVar;
        float fH;
        g2 g2VarD;
        androidx.compose.ui.n nVarM;
        yh.a<ComposeUiNode> aVarA;
        final RowScopeInstance rowScopeInstance;
        final long j12;
        final yh.q<? super androidx.compose.foundation.layout.x0, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar3;
        androidx.compose.runtime.u1 u1VarH;
        androidx.compose.runtime.p pVarF = pVar.F(1298144073);
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
            jA = j10;
            i12 |= ((i11 & 2) == 0 && pVarF.z(jA)) ? 32 : 16;
        } else {
            jA = j10;
        }
        if ((i10 & bb.c.b.f30796me) == 0) {
            jC = j11;
            i12 |= ((i11 & 4) == 0 && pVarF.z(jC)) ? 256 : 128;
        } else {
            jC = j11;
        }
        int i14 = i11 & 8;
        if (i14 == 0) {
            if ((i10 & bb.c.g.f32954lc) == 0) {
                qVar2 = qVar;
                i12 |= pVarF.s(qVar2) ? 2048 : 1024;
            }
            if ((i12 & bb.c.f.br) == 1170 || !pVarF.b()) {
                pVarF.W();
                if ((i10 & 1) != 0 || pVarF.o()) {
                    if (i13 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = c.f11808a.a(pVarF, 6);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    }
                    if ((i11 & 4) != 0) {
                        jC = ColorSchemeKt.c(jA, pVarF, (i12 >> 3) & 14);
                        i12 &= -897;
                    }
                    if (i14 != 0) {
                        qVar2 = null;
                    }
                } else {
                    pVarF.l();
                    if ((i11 & 2) != 0) {
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    nVar3 = nVar2;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1298144073, i12, -1, "androidx.compose.material3.Badge (Badge.kt:139)");
                }
                bVar = t0.b.f139476a;
                if (qVar2 != null) {
                    fH = bVar.f();
                } else {
                    fH = bVar.h();
                }
                if (qVar2 != null) {
                    pVarF.T(1947275116);
                    g2VarD = ShapesKt.d(t0.b.f139476a.e(), pVarF, 6);
                    pVarF.c0();
                } else {
                    pVarF.T(1947275170);
                    g2VarD = ShapesKt.d(t0.b.f139476a.g(), pVarF, 6);
                    pVarF.c0();
                }
                androidx.compose.ui.n nVarA = androidx.compose.ui.draw.d.a(BackgroundKt.c(SizeKt.g(nVar3, fH, fH), jA, g2VarD), g2VarD);
                if (qVar2 != null) {
                    nVarM = PaddingKt.m(androidx.compose.ui.n.INSTANCE, f8853a, 0.0f, 2, null);
                } else {
                    nVarM = androidx.compose.ui.n.INSTANCE;
                }
                androidx.compose.ui.n nVarS0 = nVarA.s0(nVarM);
                androidx.compose.ui.c.InterfaceC0079c interfaceC0079cQ = androidx.compose.ui.c.INSTANCE.q();
                Arrangement.e eVarF = Arrangement.f5896a.f();
                pVarF.T(693286680);
                androidx.compose.ui.layout.i0 i0VarD = RowKt.d(eVarF, interfaceC0079cQ, pVarF, 54);
                pVarF.T(-1323940314);
                s1.e eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                aVarA = companion.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarS0);
                androidx.compose.ui.n nVar4 = nVar3;
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.getInserting()) {
                    pVarF.L(aVarA);
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB = Updater.b(pVarF);
                Updater.j(pVarB, i0VarD, companion.d());
                Updater.j(pVarB, eVar, companion.b());
                Updater.j(pVarB, layoutDirection, companion.c());
                Updater.j(pVarB, d2Var, companion.f());
                pVarF.x();
                qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                pVarF.T(2058660585);
                pVarF.T(-678309503);
                rowScopeInstance = RowScopeInstance.f6091a;
                pVarF.T(-1186521243);
                if (qVar2 != null) {
                    final int i15 = 6;
                    CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(jC))}, androidx.compose.runtime.internal.b.b(pVarF, 5609066, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.BadgeKt$Badge$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i16) {
                            if ((i16 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(5609066, i16, -1, "androidx.compose.material3.Badge.<anonymous>.<anonymous> (Badge.kt:172)");
                            }
                            TextStyle textStyleA = j0.a(TypographyKt.a(o0.f12059a.c(pVar2, 6), t0.b.f139476a.d()), false);
                            final yh.q<androidx.compose.foundation.layout.x0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar4 = qVar2;
                            final androidx.compose.foundation.layout.x0 x0Var = rowScopeInstance;
                            final int i17 = i15;
                            final int i18 = i12;
                            TextKt.a(textStyleA, androidx.compose.runtime.internal.b.b(pVar2, -1175098791, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.BadgeKt$Badge$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar3, int i19) {
                                    if ((i19 & 11) == 2 && pVar3.b()) {
                                        pVar3.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1175098791, i19, -1, "androidx.compose.material3.Badge.<anonymous>.<anonymous>.<anonymous> (Badge.kt:179)");
                                    }
                                    qVar4.invoke(x0Var, pVar3, Integer.valueOf((i17 & 14) | ((i18 >> 6) & 112)));
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                                    a(pVar3, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVar2, 48);
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
                }
                pVarF.c0();
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar2 = nVar4;
            } else {
                pVarF.l();
            }
            j12 = jA;
            qVar3 = qVar2;
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar5 = nVar2;
            final long j13 = jC;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.BadgeKt$Badge$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i16) {
                    BadgeKt.a(nVar5, j12, j13, qVar3, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= bb.c.d.f31193dj;
        qVar2 = qVar;
        if ((i12 & bb.c.f.br) == 1170) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if ((i11 & 2) != 0) {
                    jA = c.f11808a.a(pVarF, 6);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                }
                if ((i11 & 4) != 0) {
                    jC = ColorSchemeKt.c(jA, pVarF, (i12 >> 3) & 14);
                    i12 &= -897;
                }
                if (i14 != 0) {
                    qVar2 = null;
                }
            } else {
                if (i13 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if ((i11 & 2) != 0) {
                    jA = c.f11808a.a(pVarF, 6);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                }
                if ((i11 & 4) != 0) {
                    jC = ColorSchemeKt.c(jA, pVarF, (i12 >> 3) & 14);
                    i12 &= -897;
                }
                if (i14 != 0) {
                    qVar2 = null;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(1298144073, i12, -1, "androidx.compose.material3.Badge (Badge.kt:139)");
            }
            bVar = t0.b.f139476a;
            if (qVar2 != null) {
                fH = bVar.f();
            } else {
                fH = bVar.h();
            }
            if (qVar2 != null) {
                pVarF.T(1947275116);
                g2VarD = ShapesKt.d(t0.b.f139476a.e(), pVarF, 6);
                pVarF.c0();
            } else {
                pVarF.T(1947275170);
                g2VarD = ShapesKt.d(t0.b.f139476a.g(), pVarF, 6);
                pVarF.c0();
            }
            androidx.compose.ui.n nVarA2 = androidx.compose.ui.draw.d.a(BackgroundKt.c(SizeKt.g(nVar3, fH, fH), jA, g2VarD), g2VarD);
            if (qVar2 != null) {
                nVarM = PaddingKt.m(androidx.compose.ui.n.INSTANCE, f8853a, 0.0f, 2, null);
            } else {
                nVarM = androidx.compose.ui.n.INSTANCE;
            }
            androidx.compose.ui.n nVarS1 = nVarA2.s0(nVarM);
            androidx.compose.ui.c.InterfaceC0079c interfaceC0079cQ2 = androidx.compose.ui.c.INSTANCE.q();
            Arrangement.e eVarF2 = Arrangement.f5896a.f();
            pVarF.T(693286680);
            androidx.compose.ui.layout.i0 i0VarD2 = RowKt.d(eVarF2, interfaceC0079cQ2, pVarF, 54);
            pVarF.T(-1323940314);
            s1.e eVar2 = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection2 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            androidx.compose.ui.platform.d2 d2Var2 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            aVarA = companion2.a();
            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF2 = LayoutKt.f(nVarS1);
            androidx.compose.ui.n nVar6 = nVar3;
            if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                ComposablesKt.n();
            }
            pVarF.h();
            if (pVarF.getInserting()) {
                pVarF.L(aVarA);
            } else {
                pVarF.d();
            }
            pVarF.Y();
            androidx.compose.runtime.p pVarB2 = Updater.b(pVarF);
            Updater.j(pVarB2, i0VarD2, companion2.d());
            Updater.j(pVarB2, eVar2, companion2.b());
            Updater.j(pVarB2, layoutDirection2, companion2.c());
            Updater.j(pVarB2, d2Var2, companion2.f());
            pVarF.x();
            qVarF2.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
            pVarF.T(2058660585);
            pVarF.T(-678309503);
            rowScopeInstance = RowScopeInstance.f6091a;
            pVarF.T(-1186521243);
            if (qVar2 != null) {
                final int i16 = 6;
                CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(jC))}, androidx.compose.runtime.internal.b.b(pVarF, 5609066, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.BadgeKt$Badge$1$1
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
                            ComposerKt.w0(5609066, i17, -1, "androidx.compose.material3.Badge.<anonymous>.<anonymous> (Badge.kt:172)");
                        }
                        TextStyle textStyleA = j0.a(TypographyKt.a(o0.f12059a.c(pVar2, 6), t0.b.f139476a.d()), false);
                        final yh.q<? super androidx.compose.foundation.layout.x0, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar4 = qVar2;
                        final androidx.compose.foundation.layout.x0 x0Var = rowScopeInstance;
                        final int i18 = i16;
                        final int i19 = i12;
                        TextKt.a(textStyleA, androidx.compose.runtime.internal.b.b(pVar2, -1175098791, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.BadgeKt$Badge$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar3, int i110) {
                                if ((i110 & 11) == 2 && pVar3.b()) {
                                    pVar3.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1175098791, i110, -1, "androidx.compose.material3.Badge.<anonymous>.<anonymous>.<anonymous> (Badge.kt:179)");
                                }
                                qVar4.invoke(x0Var, pVar3, Integer.valueOf((i18 & 14) | ((i19 >> 6) & 112)));
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                                a(pVar3, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVar2, 48);
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
            }
            pVarF.c0();
            pVarF.c0();
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            pVarF.c0();
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar2 = nVar6;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if ((i11 & 2) != 0) {
                    jA = c.f11808a.a(pVarF, 6);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                }
                if ((i11 & 4) != 0) {
                    jC = ColorSchemeKt.c(jA, pVarF, (i12 >> 3) & 14);
                    i12 &= -897;
                }
                if (i14 != 0) {
                    qVar2 = null;
                }
            } else {
                if (i13 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if ((i11 & 2) != 0) {
                    jA = c.f11808a.a(pVarF, 6);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                }
                if ((i11 & 4) != 0) {
                    jC = ColorSchemeKt.c(jA, pVarF, (i12 >> 3) & 14);
                    i12 &= -897;
                }
                if (i14 != 0) {
                    qVar2 = null;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(1298144073, i12, -1, "androidx.compose.material3.Badge (Badge.kt:139)");
            }
            bVar = t0.b.f139476a;
            if (qVar2 != null) {
                fH = bVar.f();
            } else {
                fH = bVar.h();
            }
            if (qVar2 != null) {
                pVarF.T(1947275116);
                g2VarD = ShapesKt.d(t0.b.f139476a.e(), pVarF, 6);
                pVarF.c0();
            } else {
                pVarF.T(1947275170);
                g2VarD = ShapesKt.d(t0.b.f139476a.g(), pVarF, 6);
                pVarF.c0();
            }
            androidx.compose.ui.n nVarA3 = androidx.compose.ui.draw.d.a(BackgroundKt.c(SizeKt.g(nVar3, fH, fH), jA, g2VarD), g2VarD);
            if (qVar2 != null) {
                nVarM = PaddingKt.m(androidx.compose.ui.n.INSTANCE, f8853a, 0.0f, 2, null);
            } else {
                nVarM = androidx.compose.ui.n.INSTANCE;
            }
            androidx.compose.ui.n nVarS2 = nVarA3.s0(nVarM);
            androidx.compose.ui.c.InterfaceC0079c interfaceC0079cQ3 = androidx.compose.ui.c.INSTANCE.q();
            Arrangement.e eVarF3 = Arrangement.f5896a.f();
            pVarF.T(693286680);
            androidx.compose.ui.layout.i0 i0VarD3 = RowKt.d(eVarF3, interfaceC0079cQ3, pVarF, 54);
            pVarF.T(-1323940314);
            s1.e eVar3 = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection3 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            androidx.compose.ui.platform.d2 d2Var3 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            aVarA = companion3.a();
            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF3 = LayoutKt.f(nVarS2);
            androidx.compose.ui.n nVar7 = nVar3;
            if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                ComposablesKt.n();
            }
            pVarF.h();
            if (pVarF.getInserting()) {
                pVarF.L(aVarA);
            } else {
                pVarF.d();
            }
            pVarF.Y();
            androidx.compose.runtime.p pVarB3 = Updater.b(pVarF);
            Updater.j(pVarB3, i0VarD3, companion3.d());
            Updater.j(pVarB3, eVar3, companion3.b());
            Updater.j(pVarB3, layoutDirection3, companion3.c());
            Updater.j(pVarB3, d2Var3, companion3.f());
            pVarF.x();
            qVarF3.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
            pVarF.T(2058660585);
            pVarF.T(-678309503);
            rowScopeInstance = RowScopeInstance.f6091a;
            pVarF.T(-1186521243);
            if (qVar2 != null) {
                final int i17 = 6;
                CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(jC))}, androidx.compose.runtime.internal.b.b(pVarF, 5609066, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.BadgeKt$Badge$1$1
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
                            ComposerKt.w0(5609066, i18, -1, "androidx.compose.material3.Badge.<anonymous>.<anonymous> (Badge.kt:172)");
                        }
                        TextStyle textStyleA = j0.a(TypographyKt.a(o0.f12059a.c(pVar2, 6), t0.b.f139476a.d()), false);
                        final yh.q<? super androidx.compose.foundation.layout.x0, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar4 = qVar2;
                        final androidx.compose.foundation.layout.x0 x0Var = rowScopeInstance;
                        final int i19 = i17;
                        final int i110 = i12;
                        TextKt.a(textStyleA, androidx.compose.runtime.internal.b.b(pVar2, -1175098791, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.BadgeKt$Badge$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar3, int i111) {
                                if ((i111 & 11) == 2 && pVar3.b()) {
                                    pVar3.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1175098791, i111, -1, "androidx.compose.material3.Badge.<anonymous>.<anonymous>.<anonymous> (Badge.kt:179)");
                                }
                                qVar4.invoke(x0Var, pVar3, Integer.valueOf((i19 & 14) | ((i110 >> 6) & 112)));
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                                a(pVar3, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVar2, 48);
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
            }
            pVarF.c0();
            pVarF.c0();
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            pVarF.c0();
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar2 = nVar7;
        }
        j12 = jA;
        qVar3 = qVar2;
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        final androidx.compose.ui.n nVar8 = nVar2;
        final long j14 = jC;
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.BadgeKt$Badge$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i18) {
                BadgeKt.a(nVar8, j12, j14, qVar3, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00da  */
    /* JADX WARN: Code duplicated, block: B:55:0x012b  */
    /* JADX WARN: Code duplicated, block: B:59:0x013a  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x0202  */
    /* JADX WARN: Code duplicated, block: B:72:0x020d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0289  */
    /* JADX WARN: Code duplicated, block: B:78:0x0295  */
    /* JADX WARN: Code duplicated, block: B:79:0x0299  */
    /* JADX WARN: Code duplicated, block: B:82:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:86:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:90:0x0326  */
    /* JADX WARN: Code duplicated, block: B:94:0x0330  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    @w
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void b(@dl.d final yh.q<? super androidx.compose.foundation.layout.k, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> badge, @dl.e androidx.compose.ui.n nVar, @dl.d final yh.q<? super androidx.compose.foundation.layout.k, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.n nVar2;
        int i13;
        androidx.compose.ui.n nVar3;
        ComposeUiNode.Companion companion;
        yh.a<ComposeUiNode> aVarA;
        int i14;
        int i15;
        yh.a<ComposeUiNode> aVarA2;
        int i16;
        int i17;
        yh.a<ComposeUiNode> aVarA3;
        int i18;
        androidx.compose.runtime.u1 u1VarH;
        kotlin.jvm.internal.f0.p(badge, "badge");
        kotlin.jvm.internal.f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(1404022535);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(badge) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 == 0) {
            if ((i10 & 112) == 0) {
                nVar2 = nVar;
                i12 |= pVarF.s(nVar2) ? 32 : 16;
            }
            if ((i11 & 4) != 0) {
                i12 |= bb.c.b.f30966u4;
            } else if ((i10 & bb.c.b.f30796me) == 0) {
                if (pVarF.s(content)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            }
            if ((i12 & bb.c.b.f30586db) == 146 || !pVarF.b()) {
                if (i19 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1404022535, i12, -1, "androidx.compose.material3.BadgedBox (Badge.kt:61)");
                }
                BadgeKt$BadgedBox$2 badgeKt$BadgedBox$2 = new androidx.compose.ui.layout.i0() { // from class: androidx.compose.material3.BadgeKt$BadgedBox$2
                    @Override // androidx.compose.ui.layout.i0
                    @dl.d
                    public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.l0 Layout, @dl.d List<? extends androidx.compose.ui.layout.g0> measurables, long j10) {
                        kotlin.jvm.internal.f0.p(Layout, "$this$Layout");
                        kotlin.jvm.internal.f0.p(measurables, "measurables");
                        for (androidx.compose.ui.layout.g0 g0Var : measurables) {
                            if (kotlin.jvm.internal.f0.g(LayoutIdKt.a(g0Var), "badge")) {
                                final androidx.compose.ui.layout.e1 e1VarZ1 = g0Var.z1(s1.b.e(j10, 0, 0, 0, 0, 11, null));
                                for (androidx.compose.ui.layout.g0 g0Var2 : measurables) {
                                    if (kotlin.jvm.internal.f0.g(LayoutIdKt.a(g0Var2), "anchor")) {
                                        final androidx.compose.ui.layout.e1 e1VarZ2 = g0Var2.z1(j10);
                                        return Layout.p1(e1VarZ2.getWidth(), e1VarZ2.getHeight(), kotlin.collections.s0.W(kotlin.c1.a(AlignmentLineKt.a(), Integer.valueOf(e1VarZ2.v(AlignmentLineKt.a()))), kotlin.c1.a(AlignmentLineKt.b(), Integer.valueOf(e1VarZ2.v(AlignmentLineKt.b())))), new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.BadgeKt$BadgedBox$2$measure$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                                boolean z10 = e1VarZ1.getWidth() > Layout.e1(t0.b.f139476a.h());
                                                float fD = z10 ? BadgeKt.d() : BadgeKt.c();
                                                float f10 = z10 ? BadgeKt.f() : BadgeKt.c();
                                                androidx.compose.ui.layout.e1.a.v(layout, e1VarZ2, 0, 0, 0.0f, 4, null);
                                                androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, e1VarZ2.getWidth() + Layout.e1(fD), ((-e1VarZ1.getHeight()) / 2) + Layout.e1(f10), 0.0f, 4, null);
                                            }

                                            @Override // yh.l
                                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                                a(aVar);
                                                return kotlin.b2.f124493a;
                                            }
                                        });
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }

                    @Override // androidx.compose.ui.layout.i0
                    public /* synthetic */ int b(androidx.compose.ui.layout.n nVar4, List list, int i20) {
                        return androidx.compose.ui.layout.h0.c(this, nVar4, list, i20);
                    }

                    @Override // androidx.compose.ui.layout.i0
                    public /* synthetic */ int c(androidx.compose.ui.layout.n nVar4, List list, int i20) {
                        return androidx.compose.ui.layout.h0.d(this, nVar4, list, i20);
                    }

                    @Override // androidx.compose.ui.layout.i0
                    public /* synthetic */ int d(androidx.compose.ui.layout.n nVar4, List list, int i20) {
                        return androidx.compose.ui.layout.h0.a(this, nVar4, list, i20);
                    }

                    @Override // androidx.compose.ui.layout.i0
                    public /* synthetic */ int e(androidx.compose.ui.layout.n nVar4, List list, int i20) {
                        return androidx.compose.ui.layout.h0.b(this, nVar4, list, i20);
                    }
                };
                pVarF.T(-1323940314);
                s1.e eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                companion = ComposeUiNode.INSTANCE;
                aVarA = companion.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVar3);
                i14 = (((i12 & 112) << 9) & bb.c.g.f32954lc) | 6;
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.getInserting()) {
                    pVarF.L(aVarA);
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB = Updater.b(pVarF);
                Updater.j(pVarB, badgeKt$BadgedBox$2, companion.d());
                Updater.j(pVarB, eVar, companion.b());
                Updater.j(pVarB, layoutDirection, companion.c());
                Updater.j(pVarB, d2Var, companion.f());
                pVarF.x();
                qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, Integer.valueOf((i14 >> 3) & 112));
                pVarF.T(2058660585);
                pVarF.T(483395760);
                if (((i14 >> 9) & 14 & 11) == 2 || !pVarF.b()) {
                    androidx.compose.ui.n.Companion companion2 = androidx.compose.ui.n.INSTANCE;
                    androidx.compose.ui.n nVarB = LayoutIdKt.b(companion2, "anchor");
                    androidx.compose.ui.c.Companion companion3 = androidx.compose.ui.c.INSTANCE;
                    androidx.compose.ui.c cVarI = companion3.i();
                    i15 = ((i12 << 3) & bb.c.g.f32954lc) | 54;
                    pVarF.T(733328855);
                    int i20 = i15 >> 3;
                    androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(cVarI, false, pVarF, (i20 & 14) | (i20 & 112));
                    pVarF.T(-1323940314);
                    s1.e eVar2 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection2 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    androidx.compose.ui.platform.d2 d2Var2 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                    aVarA2 = companion.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF2 = LayoutKt.f(nVarB);
                    i16 = ((((i15 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.getInserting()) {
                        pVarF.L(aVarA2);
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB2 = Updater.b(pVarF);
                    Updater.j(pVarB2, i0VarK, companion.d());
                    Updater.j(pVarB2, eVar2, companion.b());
                    Updater.j(pVarB2, layoutDirection2, companion.c());
                    Updater.j(pVarB2, d2Var2, companion.f());
                    pVarF.x();
                    qVarF2.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, Integer.valueOf((i16 >> 3) & 112));
                    pVarF.T(2058660585);
                    pVarF.T(-2137368960);
                    if (((i16 >> 9) & 14 & 11) == 2 || !pVarF.b()) {
                        content.invoke(BoxScopeInstance.f5954a, pVarF, Integer.valueOf(((i15 >> 6) & 112) | 6));
                    } else {
                        pVarF.l();
                    }
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    androidx.compose.ui.n nVarB2 = LayoutIdKt.b(companion2, "badge");
                    i17 = ((i12 << 9) & bb.c.g.f32954lc) | 6;
                    pVarF.T(733328855);
                    int i21 = i17 >> 3;
                    androidx.compose.ui.layout.i0 i0VarK2 = BoxKt.k(companion3.C(), false, pVarF, (i21 & 112) | (i21 & 14));
                    pVarF.T(-1323940314);
                    s1.e eVar3 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection3 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    androidx.compose.ui.platform.d2 d2Var3 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                    aVarA3 = companion.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF3 = LayoutKt.f(nVarB2);
                    i18 = ((((i17 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.getInserting()) {
                        pVarF.L(aVarA3);
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB3 = Updater.b(pVarF);
                    Updater.j(pVarB3, i0VarK2, companion.d());
                    Updater.j(pVarB3, eVar3, companion.b());
                    Updater.j(pVarB3, layoutDirection3, companion.c());
                    Updater.j(pVarB3, d2Var3, companion.f());
                    pVarF.x();
                    qVarF3.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, Integer.valueOf((i18 >> 3) & 112));
                    pVarF.T(2058660585);
                    pVarF.T(-2137368960);
                    if (((i18 >> 9) & 14 & 11) == 2 || !pVarF.b()) {
                        badge.invoke(BoxScopeInstance.f5954a, pVarF, Integer.valueOf(((i17 >> 6) & 112) | 6));
                    } else {
                        pVarF.l();
                    }
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                } else {
                    pVarF.l();
                }
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            } else {
                pVarF.l();
                nVar3 = nVar2;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar4 = nVar3;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.BadgeKt$BadgedBox$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i22) {
                    BadgeKt.b(badge, nVar4, content, pVar2, i10 | 1, i11);
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
        if ((i11 & 4) != 0) {
            i12 |= bb.c.b.f30966u4;
        } else if ((i10 & bb.c.b.f30796me) == 0) {
            if (pVarF.s(content)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & bb.c.b.f30586db) == 146) {
            if (i19 != 0) {
                nVar3 = androidx.compose.ui.n.INSTANCE;
            } else {
                nVar3 = nVar2;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(1404022535, i12, -1, "androidx.compose.material3.BadgedBox (Badge.kt:61)");
            }
            BadgeKt$BadgedBox$2 badgeKt$BadgedBox$3 = new androidx.compose.ui.layout.i0() { // from class: androidx.compose.material3.BadgeKt$BadgedBox$2
                @Override // androidx.compose.ui.layout.i0
                @dl.d
                public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.l0 Layout, @dl.d List<? extends androidx.compose.ui.layout.g0> measurables, long j10) {
                    kotlin.jvm.internal.f0.p(Layout, "$this$Layout");
                    kotlin.jvm.internal.f0.p(measurables, "measurables");
                    for (androidx.compose.ui.layout.g0 g0Var : measurables) {
                        if (kotlin.jvm.internal.f0.g(LayoutIdKt.a(g0Var), "badge")) {
                            final androidx.compose.ui.layout.e1 e1VarZ1 = g0Var.z1(s1.b.e(j10, 0, 0, 0, 0, 11, null));
                            for (androidx.compose.ui.layout.g0 g0Var2 : measurables) {
                                if (kotlin.jvm.internal.f0.g(LayoutIdKt.a(g0Var2), "anchor")) {
                                    final androidx.compose.ui.layout.e1 e1VarZ2 = g0Var2.z1(j10);
                                    return Layout.p1(e1VarZ2.getWidth(), e1VarZ2.getHeight(), kotlin.collections.s0.W(kotlin.c1.a(AlignmentLineKt.a(), Integer.valueOf(e1VarZ2.v(AlignmentLineKt.a()))), kotlin.c1.a(AlignmentLineKt.b(), Integer.valueOf(e1VarZ2.v(AlignmentLineKt.b())))), new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.BadgeKt$BadgedBox$2$measure$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                            kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                            boolean z10 = e1VarZ1.getWidth() > Layout.e1(t0.b.f139476a.h());
                                            float fD = z10 ? BadgeKt.d() : BadgeKt.c();
                                            float f10 = z10 ? BadgeKt.f() : BadgeKt.c();
                                            androidx.compose.ui.layout.e1.a.v(layout, e1VarZ2, 0, 0, 0.0f, 4, null);
                                            androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, e1VarZ2.getWidth() + Layout.e1(fD), ((-e1VarZ1.getHeight()) / 2) + Layout.e1(f10), 0.0f, 4, null);
                                        }

                                        @Override // yh.l
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                            a(aVar);
                                            return kotlin.b2.f124493a;
                                        }
                                    });
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int b(androidx.compose.ui.layout.n nVar5, List list, int i22) {
                    return androidx.compose.ui.layout.h0.c(this, nVar5, list, i22);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int c(androidx.compose.ui.layout.n nVar5, List list, int i22) {
                    return androidx.compose.ui.layout.h0.d(this, nVar5, list, i22);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int d(androidx.compose.ui.layout.n nVar5, List list, int i22) {
                    return androidx.compose.ui.layout.h0.a(this, nVar5, list, i22);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int e(androidx.compose.ui.layout.n nVar5, List list, int i22) {
                    return androidx.compose.ui.layout.h0.b(this, nVar5, list, i22);
                }
            };
            pVarF.T(-1323940314);
            s1.e eVar4 = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection4 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            androidx.compose.ui.platform.d2 d2Var4 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
            companion = ComposeUiNode.INSTANCE;
            aVarA = companion.a();
            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF4 = LayoutKt.f(nVar3);
            i14 = (((i12 & 112) << 9) & bb.c.g.f32954lc) | 6;
            if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                ComposablesKt.n();
            }
            pVarF.h();
            if (pVarF.getInserting()) {
                pVarF.L(aVarA);
            } else {
                pVarF.d();
            }
            pVarF.Y();
            androidx.compose.runtime.p pVarB4 = Updater.b(pVarF);
            Updater.j(pVarB4, badgeKt$BadgedBox$3, companion.d());
            Updater.j(pVarB4, eVar4, companion.b());
            Updater.j(pVarB4, layoutDirection4, companion.c());
            Updater.j(pVarB4, d2Var4, companion.f());
            pVarF.x();
            qVarF4.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, Integer.valueOf((i14 >> 3) & 112));
            pVarF.T(2058660585);
            pVarF.T(483395760);
            if (((i14 >> 9) & 14 & 11) == 2) {
                androidx.compose.ui.n.Companion companion4 = androidx.compose.ui.n.INSTANCE;
                androidx.compose.ui.n nVarB3 = LayoutIdKt.b(companion4, "anchor");
                androidx.compose.ui.c.Companion companion5 = androidx.compose.ui.c.INSTANCE;
                androidx.compose.ui.c cVarI2 = companion5.i();
                i15 = ((i12 << 3) & bb.c.g.f32954lc) | 54;
                pVarF.T(733328855);
                int i22 = i15 >> 3;
                androidx.compose.ui.layout.i0 i0VarK3 = BoxKt.k(cVarI2, false, pVarF, (i22 & 14) | (i22 & 112));
                pVarF.T(-1323940314);
                s1.e eVar5 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection5 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                androidx.compose.ui.platform.d2 d2Var5 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                aVarA2 = companion.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF5 = LayoutKt.f(nVarB3);
                i16 = ((((i15 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.getInserting()) {
                    pVarF.L(aVarA2);
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB5 = Updater.b(pVarF);
                Updater.j(pVarB5, i0VarK3, companion.d());
                Updater.j(pVarB5, eVar5, companion.b());
                Updater.j(pVarB5, layoutDirection5, companion.c());
                Updater.j(pVarB5, d2Var5, companion.f());
                pVarF.x();
                qVarF5.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, Integer.valueOf((i16 >> 3) & 112));
                pVarF.T(2058660585);
                pVarF.T(-2137368960);
                if (((i16 >> 9) & 14 & 11) == 2) {
                    content.invoke(BoxScopeInstance.f5954a, pVarF, Integer.valueOf(((i15 >> 6) & 112) | 6));
                } else {
                    content.invoke(BoxScopeInstance.f5954a, pVarF, Integer.valueOf(((i15 >> 6) & 112) | 6));
                }
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                androidx.compose.ui.n nVarB4 = LayoutIdKt.b(companion4, "badge");
                i17 = ((i12 << 9) & bb.c.g.f32954lc) | 6;
                pVarF.T(733328855);
                int i23 = i17 >> 3;
                androidx.compose.ui.layout.i0 i0VarK4 = BoxKt.k(companion5.C(), false, pVarF, (i23 & 112) | (i23 & 14));
                pVarF.T(-1323940314);
                s1.e eVar6 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection6 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                androidx.compose.ui.platform.d2 d2Var6 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                aVarA3 = companion.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF6 = LayoutKt.f(nVarB4);
                i18 = ((((i17 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.getInserting()) {
                    pVarF.L(aVarA3);
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB6 = Updater.b(pVarF);
                Updater.j(pVarB6, i0VarK4, companion.d());
                Updater.j(pVarB6, eVar6, companion.b());
                Updater.j(pVarB6, layoutDirection6, companion.c());
                Updater.j(pVarB6, d2Var6, companion.f());
                pVarF.x();
                qVarF6.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, Integer.valueOf((i18 >> 3) & 112));
                pVarF.T(2058660585);
                pVarF.T(-2137368960);
                if (((i18 >> 9) & 14 & 11) == 2) {
                    badge.invoke(BoxScopeInstance.f5954a, pVarF, Integer.valueOf(((i17 >> 6) & 112) | 6));
                } else {
                    badge.invoke(BoxScopeInstance.f5954a, pVarF, Integer.valueOf(((i17 >> 6) & 112) | 6));
                }
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
            } else {
                androidx.compose.ui.n.Companion companion6 = androidx.compose.ui.n.INSTANCE;
                androidx.compose.ui.n nVarB5 = LayoutIdKt.b(companion6, "anchor");
                androidx.compose.ui.c.Companion companion7 = androidx.compose.ui.c.INSTANCE;
                androidx.compose.ui.c cVarI3 = companion7.i();
                i15 = ((i12 << 3) & bb.c.g.f32954lc) | 54;
                pVarF.T(733328855);
                int i24 = i15 >> 3;
                androidx.compose.ui.layout.i0 i0VarK5 = BoxKt.k(cVarI3, false, pVarF, (i24 & 14) | (i24 & 112));
                pVarF.T(-1323940314);
                s1.e eVar7 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection7 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                androidx.compose.ui.platform.d2 d2Var7 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                aVarA2 = companion.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF7 = LayoutKt.f(nVarB5);
                i16 = ((((i15 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.getInserting()) {
                    pVarF.L(aVarA2);
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB7 = Updater.b(pVarF);
                Updater.j(pVarB7, i0VarK5, companion.d());
                Updater.j(pVarB7, eVar7, companion.b());
                Updater.j(pVarB7, layoutDirection7, companion.c());
                Updater.j(pVarB7, d2Var7, companion.f());
                pVarF.x();
                qVarF7.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, Integer.valueOf((i16 >> 3) & 112));
                pVarF.T(2058660585);
                pVarF.T(-2137368960);
                if (((i16 >> 9) & 14 & 11) == 2) {
                    content.invoke(BoxScopeInstance.f5954a, pVarF, Integer.valueOf(((i15 >> 6) & 112) | 6));
                } else {
                    content.invoke(BoxScopeInstance.f5954a, pVarF, Integer.valueOf(((i15 >> 6) & 112) | 6));
                }
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                androidx.compose.ui.n nVarB6 = LayoutIdKt.b(companion6, "badge");
                i17 = ((i12 << 9) & bb.c.g.f32954lc) | 6;
                pVarF.T(733328855);
                int i25 = i17 >> 3;
                androidx.compose.ui.layout.i0 i0VarK6 = BoxKt.k(companion7.C(), false, pVarF, (i25 & 112) | (i25 & 14));
                pVarF.T(-1323940314);
                s1.e eVar8 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection8 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                androidx.compose.ui.platform.d2 d2Var8 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                aVarA3 = companion.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF8 = LayoutKt.f(nVarB6);
                i18 = ((((i17 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.getInserting()) {
                    pVarF.L(aVarA3);
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB8 = Updater.b(pVarF);
                Updater.j(pVarB8, i0VarK6, companion.d());
                Updater.j(pVarB8, eVar8, companion.b());
                Updater.j(pVarB8, layoutDirection8, companion.c());
                Updater.j(pVarB8, d2Var8, companion.f());
                pVarF.x();
                qVarF8.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, Integer.valueOf((i18 >> 3) & 112));
                pVarF.T(2058660585);
                pVarF.T(-2137368960);
                if (((i18 >> 9) & 14 & 11) == 2) {
                    badge.invoke(BoxScopeInstance.f5954a, pVarF, Integer.valueOf(((i17 >> 6) & 112) | 6));
                } else {
                    badge.invoke(BoxScopeInstance.f5954a, pVarF, Integer.valueOf(((i17 >> 6) & 112) | 6));
                }
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
            }
            pVarF.c0();
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        } else {
            if (i19 != 0) {
                nVar3 = androidx.compose.ui.n.INSTANCE;
            } else {
                nVar3 = nVar2;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(1404022535, i12, -1, "androidx.compose.material3.BadgedBox (Badge.kt:61)");
            }
            BadgeKt$BadgedBox$2 badgeKt$BadgedBox$4 = new androidx.compose.ui.layout.i0() { // from class: androidx.compose.material3.BadgeKt$BadgedBox$2
                @Override // androidx.compose.ui.layout.i0
                @dl.d
                public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.l0 Layout, @dl.d List<? extends androidx.compose.ui.layout.g0> measurables, long j10) {
                    kotlin.jvm.internal.f0.p(Layout, "$this$Layout");
                    kotlin.jvm.internal.f0.p(measurables, "measurables");
                    for (androidx.compose.ui.layout.g0 g0Var : measurables) {
                        if (kotlin.jvm.internal.f0.g(LayoutIdKt.a(g0Var), "badge")) {
                            final androidx.compose.ui.layout.e1 e1VarZ1 = g0Var.z1(s1.b.e(j10, 0, 0, 0, 0, 11, null));
                            for (androidx.compose.ui.layout.g0 g0Var2 : measurables) {
                                if (kotlin.jvm.internal.f0.g(LayoutIdKt.a(g0Var2), "anchor")) {
                                    final androidx.compose.ui.layout.e1 e1VarZ2 = g0Var2.z1(j10);
                                    return Layout.p1(e1VarZ2.getWidth(), e1VarZ2.getHeight(), kotlin.collections.s0.W(kotlin.c1.a(AlignmentLineKt.a(), Integer.valueOf(e1VarZ2.v(AlignmentLineKt.a()))), kotlin.c1.a(AlignmentLineKt.b(), Integer.valueOf(e1VarZ2.v(AlignmentLineKt.b())))), new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.BadgeKt$BadgedBox$2$measure$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                            kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                            boolean z10 = e1VarZ1.getWidth() > Layout.e1(t0.b.f139476a.h());
                                            float fD = z10 ? BadgeKt.d() : BadgeKt.c();
                                            float f10 = z10 ? BadgeKt.f() : BadgeKt.c();
                                            androidx.compose.ui.layout.e1.a.v(layout, e1VarZ2, 0, 0, 0.0f, 4, null);
                                            androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, e1VarZ2.getWidth() + Layout.e1(fD), ((-e1VarZ1.getHeight()) / 2) + Layout.e1(f10), 0.0f, 4, null);
                                        }

                                        @Override // yh.l
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                            a(aVar);
                                            return kotlin.b2.f124493a;
                                        }
                                    });
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int b(androidx.compose.ui.layout.n nVar5, List list, int i26) {
                    return androidx.compose.ui.layout.h0.c(this, nVar5, list, i26);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int c(androidx.compose.ui.layout.n nVar5, List list, int i26) {
                    return androidx.compose.ui.layout.h0.d(this, nVar5, list, i26);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int d(androidx.compose.ui.layout.n nVar5, List list, int i26) {
                    return androidx.compose.ui.layout.h0.a(this, nVar5, list, i26);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int e(androidx.compose.ui.layout.n nVar5, List list, int i26) {
                    return androidx.compose.ui.layout.h0.b(this, nVar5, list, i26);
                }
            };
            pVarF.T(-1323940314);
            s1.e eVar9 = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection9 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            androidx.compose.ui.platform.d2 d2Var9 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
            companion = ComposeUiNode.INSTANCE;
            aVarA = companion.a();
            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF9 = LayoutKt.f(nVar3);
            i14 = (((i12 & 112) << 9) & bb.c.g.f32954lc) | 6;
            if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                ComposablesKt.n();
            }
            pVarF.h();
            if (pVarF.getInserting()) {
                pVarF.L(aVarA);
            } else {
                pVarF.d();
            }
            pVarF.Y();
            androidx.compose.runtime.p pVarB9 = Updater.b(pVarF);
            Updater.j(pVarB9, badgeKt$BadgedBox$4, companion.d());
            Updater.j(pVarB9, eVar9, companion.b());
            Updater.j(pVarB9, layoutDirection9, companion.c());
            Updater.j(pVarB9, d2Var9, companion.f());
            pVarF.x();
            qVarF9.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, Integer.valueOf((i14 >> 3) & 112));
            pVarF.T(2058660585);
            pVarF.T(483395760);
            if (((i14 >> 9) & 14 & 11) == 2) {
                androidx.compose.ui.n.Companion companion8 = androidx.compose.ui.n.INSTANCE;
                androidx.compose.ui.n nVarB7 = LayoutIdKt.b(companion8, "anchor");
                androidx.compose.ui.c.Companion companion9 = androidx.compose.ui.c.INSTANCE;
                androidx.compose.ui.c cVarI4 = companion9.i();
                i15 = ((i12 << 3) & bb.c.g.f32954lc) | 54;
                pVarF.T(733328855);
                int i26 = i15 >> 3;
                androidx.compose.ui.layout.i0 i0VarK7 = BoxKt.k(cVarI4, false, pVarF, (i26 & 14) | (i26 & 112));
                pVarF.T(-1323940314);
                s1.e eVar10 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection10 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                androidx.compose.ui.platform.d2 d2Var10 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                aVarA2 = companion.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF10 = LayoutKt.f(nVarB7);
                i16 = ((((i15 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.getInserting()) {
                    pVarF.L(aVarA2);
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB10 = Updater.b(pVarF);
                Updater.j(pVarB10, i0VarK7, companion.d());
                Updater.j(pVarB10, eVar10, companion.b());
                Updater.j(pVarB10, layoutDirection10, companion.c());
                Updater.j(pVarB10, d2Var10, companion.f());
                pVarF.x();
                qVarF10.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, Integer.valueOf((i16 >> 3) & 112));
                pVarF.T(2058660585);
                pVarF.T(-2137368960);
                if (((i16 >> 9) & 14 & 11) == 2) {
                    content.invoke(BoxScopeInstance.f5954a, pVarF, Integer.valueOf(((i15 >> 6) & 112) | 6));
                } else {
                    content.invoke(BoxScopeInstance.f5954a, pVarF, Integer.valueOf(((i15 >> 6) & 112) | 6));
                }
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                androidx.compose.ui.n nVarB8 = LayoutIdKt.b(companion8, "badge");
                i17 = ((i12 << 9) & bb.c.g.f32954lc) | 6;
                pVarF.T(733328855);
                int i27 = i17 >> 3;
                androidx.compose.ui.layout.i0 i0VarK8 = BoxKt.k(companion9.C(), false, pVarF, (i27 & 112) | (i27 & 14));
                pVarF.T(-1323940314);
                s1.e eVar11 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection11 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                androidx.compose.ui.platform.d2 d2Var11 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                aVarA3 = companion.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF11 = LayoutKt.f(nVarB8);
                i18 = ((((i17 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.getInserting()) {
                    pVarF.L(aVarA3);
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB11 = Updater.b(pVarF);
                Updater.j(pVarB11, i0VarK8, companion.d());
                Updater.j(pVarB11, eVar11, companion.b());
                Updater.j(pVarB11, layoutDirection11, companion.c());
                Updater.j(pVarB11, d2Var11, companion.f());
                pVarF.x();
                qVarF11.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, Integer.valueOf((i18 >> 3) & 112));
                pVarF.T(2058660585);
                pVarF.T(-2137368960);
                if (((i18 >> 9) & 14 & 11) == 2) {
                    badge.invoke(BoxScopeInstance.f5954a, pVarF, Integer.valueOf(((i17 >> 6) & 112) | 6));
                } else {
                    badge.invoke(BoxScopeInstance.f5954a, pVarF, Integer.valueOf(((i17 >> 6) & 112) | 6));
                }
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
            } else {
                androidx.compose.ui.n.Companion companion10 = androidx.compose.ui.n.INSTANCE;
                androidx.compose.ui.n nVarB9 = LayoutIdKt.b(companion10, "anchor");
                androidx.compose.ui.c.Companion companion11 = androidx.compose.ui.c.INSTANCE;
                androidx.compose.ui.c cVarI5 = companion11.i();
                i15 = ((i12 << 3) & bb.c.g.f32954lc) | 54;
                pVarF.T(733328855);
                int i28 = i15 >> 3;
                androidx.compose.ui.layout.i0 i0VarK9 = BoxKt.k(cVarI5, false, pVarF, (i28 & 14) | (i28 & 112));
                pVarF.T(-1323940314);
                s1.e eVar12 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection12 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                androidx.compose.ui.platform.d2 d2Var12 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                aVarA2 = companion.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF12 = LayoutKt.f(nVarB9);
                i16 = ((((i15 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.getInserting()) {
                    pVarF.L(aVarA2);
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB12 = Updater.b(pVarF);
                Updater.j(pVarB12, i0VarK9, companion.d());
                Updater.j(pVarB12, eVar12, companion.b());
                Updater.j(pVarB12, layoutDirection12, companion.c());
                Updater.j(pVarB12, d2Var12, companion.f());
                pVarF.x();
                qVarF12.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, Integer.valueOf((i16 >> 3) & 112));
                pVarF.T(2058660585);
                pVarF.T(-2137368960);
                if (((i16 >> 9) & 14 & 11) == 2) {
                    content.invoke(BoxScopeInstance.f5954a, pVarF, Integer.valueOf(((i15 >> 6) & 112) | 6));
                } else {
                    content.invoke(BoxScopeInstance.f5954a, pVarF, Integer.valueOf(((i15 >> 6) & 112) | 6));
                }
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                androidx.compose.ui.n nVarB10 = LayoutIdKt.b(companion10, "badge");
                i17 = ((i12 << 9) & bb.c.g.f32954lc) | 6;
                pVarF.T(733328855);
                int i29 = i17 >> 3;
                androidx.compose.ui.layout.i0 i0VarK10 = BoxKt.k(companion11.C(), false, pVarF, (i29 & 112) | (i29 & 14));
                pVarF.T(-1323940314);
                s1.e eVar13 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection13 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                androidx.compose.ui.platform.d2 d2Var13 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                aVarA3 = companion.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF13 = LayoutKt.f(nVarB10);
                i18 = ((((i17 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.getInserting()) {
                    pVarF.L(aVarA3);
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB13 = Updater.b(pVarF);
                Updater.j(pVarB13, i0VarK10, companion.d());
                Updater.j(pVarB13, eVar13, companion.b());
                Updater.j(pVarB13, layoutDirection13, companion.c());
                Updater.j(pVarB13, d2Var13, companion.f());
                pVarF.x();
                qVarF13.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, Integer.valueOf((i18 >> 3) & 112));
                pVarF.T(2058660585);
                pVarF.T(-2137368960);
                if (((i18 >> 9) & 14 & 11) == 2) {
                    badge.invoke(BoxScopeInstance.f5954a, pVarF, Integer.valueOf(((i17 >> 6) & 112) | 6));
                } else {
                    badge.invoke(BoxScopeInstance.f5954a, pVarF, Integer.valueOf(((i17 >> 6) & 112) | 6));
                }
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
            }
            pVarF.c0();
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        final androidx.compose.ui.n nVar5 = nVar3;
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.BadgeKt$BadgedBox$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i210) {
                BadgeKt.b(badge, nVar5, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    public static final float c() {
        return f8856d;
    }

    public static final float d() {
        return f8854b;
    }

    public static final float e() {
        return f8853a;
    }

    public static final float f() {
        return f8855c;
    }
}
