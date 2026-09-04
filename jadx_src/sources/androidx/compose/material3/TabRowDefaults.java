package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.m2;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\r\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bR\u001a\u0010\u0010\u001a\u00020\u00068Gø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00068Gø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/material3/TabRowDefaults;", "", "Landroidx/compose/ui/n;", "modifier", "Ls1/h;", "height", "Landroidx/compose/ui/graphics/l0;", "color", "Lkotlin/b2;", ak.av, "(Landroidx/compose/ui/n;FJLandroidx/compose/runtime/p;II)V", "Landroidx/compose/material3/w1;", "currentTabPosition", "d", "b", "(Landroidx/compose/runtime/p;I)J", "containerColor", ak.aF, "contentColor", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class TabRowDefaults {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final TabRowDefaults f11245a = new TabRowDefaults();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f11246b = 0;

    private TabRowDefaults() {
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083 A[PHI: r2 r3
  0x0083: PHI (r2v5 androidx.compose.ui.n) = (r2v2 androidx.compose.ui.n), (r2v6 androidx.compose.ui.n) binds: [B:55:0x0097, B:46:0x007e] A[DONT_GENERATE, DONT_INLINE]
  0x0083: PHI (r3v9 float) = (r3v5 float), (r3v10 float) binds: [B:55:0x0097, B:46:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public final void a(@dl.e androidx.compose.ui.n nVar, float f10, long j10, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        long j11;
        final androidx.compose.ui.n nVar2;
        final float fG;
        final long jF;
        androidx.compose.runtime.u1 u1VarH;
        androidx.compose.runtime.p pVarF = pVar.F(1454716052);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(nVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 == 0) {
            if ((i10 & 112) == 0) {
                i12 |= pVarF.w(f10) ? 32 : 16;
            }
            if ((i10 & bb.c.b.f30796me) == 0) {
                if ((i11 & 4) == 0) {
                    j11 = j10;
                    int i15 = pVarF.z(j11) ? 256 : 128;
                    i12 |= i15;
                } else {
                    j11 = j10;
                }
                i12 |= i15;
            } else {
                j11 = j10;
            }
            if ((i12 & bb.c.b.f30586db) == 146 || !pVarF.b()) {
                pVarF.W();
                if ((i10 & 1) != 0 || pVarF.o()) {
                    if (i13 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i14 != 0) {
                        fG = t0.o0.f140157a.g();
                    } else {
                        fG = f10;
                    }
                    if ((i11 & 4) != 0) {
                        jF = ColorSchemeKt.f(o0.f12059a.a(pVarF, 6), t0.o0.f140157a.f());
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1454716052, i10, -1, "androidx.compose.material3.TabRowDefaults.Indicator (TabRow.kt:372)");
                    }
                    BoxKt.a(BackgroundKt.d(SizeKt.o(SizeKt.n(nVar2, 0.0f, 1, null), fG), jF, null, 2, null), pVarF, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                } else {
                    pVarF.l();
                    nVar2 = nVar;
                    fG = f10;
                }
                jF = j11;
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1454716052, i10, -1, "androidx.compose.material3.TabRowDefaults.Indicator (TabRow.kt:372)");
                }
                BoxKt.a(BackgroundKt.d(SizeKt.o(SizeKt.n(nVar2, 0.0f, 1, null), fG), jF, null, 2, null), pVarF, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            } else {
                pVarF.l();
                nVar2 = nVar;
                fG = f10;
                jF = j11;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowDefaults$Indicator$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i16) {
                    this.f11247b.a(nVar2, fG, jF, pVar2, i10 | 1, i11);
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
                j11 = j10;
                if (pVarF.z(j11)) {
                }
                i12 |= i15;
            } else {
                j11 = j10;
            }
            i12 |= i15;
        } else {
            j11 = j10;
        }
        if ((i12 & bb.c.b.f30586db) == 146) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i14 != 0) {
                    fG = t0.o0.f140157a.g();
                } else {
                    fG = f10;
                }
                if ((i11 & 4) != 0) {
                    jF = ColorSchemeKt.f(o0.f12059a.a(pVarF, 6), t0.o0.f140157a.f());
                } else {
                    jF = j11;
                }
            } else {
                if (i13 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i14 != 0) {
                    fG = t0.o0.f140157a.g();
                } else {
                    fG = f10;
                }
                if ((i11 & 4) != 0) {
                    jF = ColorSchemeKt.f(o0.f12059a.a(pVarF, 6), t0.o0.f140157a.f());
                } else {
                    jF = j11;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(1454716052, i10, -1, "androidx.compose.material3.TabRowDefaults.Indicator (TabRow.kt:372)");
            }
            BoxKt.a(BackgroundKt.d(SizeKt.o(SizeKt.n(nVar2, 0.0f, 1, null), fG), jF, null, 2, null), pVarF, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i14 != 0) {
                    fG = t0.o0.f140157a.g();
                } else {
                    fG = f10;
                }
                if ((i11 & 4) != 0) {
                    jF = ColorSchemeKt.f(o0.f12059a.a(pVarF, 6), t0.o0.f140157a.f());
                } else {
                    jF = j11;
                }
            } else {
                if (i13 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i14 != 0) {
                    fG = t0.o0.f140157a.g();
                } else {
                    fG = f10;
                }
                if ((i11 & 4) != 0) {
                    jF = ColorSchemeKt.f(o0.f12059a.a(pVarF, 6), t0.o0.f140157a.f());
                } else {
                    jF = j11;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(1454716052, i10, -1, "androidx.compose.material3.TabRowDefaults.Indicator (TabRow.kt:372)");
            }
            BoxKt.a(BackgroundKt.d(SizeKt.o(SizeKt.n(nVar2, 0.0f, 1, null), fG), jF, null, 2, null), pVarF, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowDefaults$Indicator$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i16) {
                this.f11247b.a(nVar2, fG, jF, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    @xh.h(name = "getContainerColor")
    @androidx.compose.runtime.h
    public final long b(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-2026555673);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-2026555673, i10, -1, "androidx.compose.material3.TabRowDefaults.<get-containerColor> (TabRow.kt:356)");
        }
        long jK = ColorSchemeKt.k(t0.o0.f140157a.l(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return jK;
    }

    @xh.h(name = "getContentColor")
    @androidx.compose.runtime.h
    public final long c(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(1163072359);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1163072359, i10, -1, "androidx.compose.material3.TabRowDefaults.<get-contentColor> (TabRow.kt:360)");
        }
        long jK = ColorSchemeKt.k(t0.o0.f140157a.i(), pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return jK;
    }

    @dl.d
    public final androidx.compose.ui.n d(@dl.d androidx.compose.ui.n nVar, @dl.d final TabPosition currentTabPosition) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(currentTabPosition, "currentTabPosition");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, kotlin.b2>() { // from class: androidx.compose.material3.TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("tabIndicatorOffset");
                x0Var.e(currentTabPosition);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return kotlin.b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.material3.TabRowDefaults$tabIndicatorOffset$2
            {
                super(3);
            }

            private static final float b(m2<s1.h> m2Var) {
                return m2Var.getValue().w();
            }

            private static final float c(m2<s1.h> m2Var) {
                return m2Var.getValue().w();
            }

            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(-1541271084);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1541271084, i10, -1, "androidx.compose.material3.TabRowDefaults.tabIndicatorOffset.<anonymous> (TabRow.kt:400)");
                }
                m2 m2VarD = AnimateAsStateKt.d(currentTabPosition.getWidth(), androidx.compose.animation.core.i.q(250, 0, androidx.compose.animation.core.d0.b(), 2, null), null, pVar, 0, 4);
                androidx.compose.ui.n nVarH = SizeKt.H(OffsetKt.f(SizeKt.N(SizeKt.n(composed, 0.0f, 1, null), androidx.compose.ui.c.INSTANCE.g(), false, 2, null), c(AnimateAsStateKt.d(currentTabPosition.getLeft(), androidx.compose.animation.core.i.q(250, 0, androidx.compose.animation.core.d0.b(), 2, null), null, pVar, 0, 4)), 0.0f, 2, null), b(m2VarD));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return nVarH;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }
}
