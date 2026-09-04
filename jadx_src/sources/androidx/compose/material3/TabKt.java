package androidx.compose.material3;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.m2;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.LayoutDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* JADX INFO: compiled from: Tab.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000j\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u008b\u0001\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\b2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0083\u0001\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\b2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a{\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\u0002\b\b¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a@\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\bH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a9\u0010\u001e\u001a\u00020\u00032\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\b2\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\bH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001c\u0010%\u001a\u00020\u0003*\u00020 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0002\u001aD\u0010-\u001a\u00020\u0003*\u00020 2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0006\u0010+\u001a\u00020#2\u0006\u0010,\u001a\u00020#H\u0002\"\u0017\u00100\u001a\u00020.8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010/\"\u0017\u00101\u001a\u00020.8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0018\u0010/\"\u0014\u00103\u001a\u00020#8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u00102\"\u0014\u00104\u001a\u00020#8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u00102\"\u0014\u00105\u001a\u00020#8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u00102\"\u0017\u00107\u001a\u00020.8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b6\u0010/\"\u0017\u00109\u001a\u00020.8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b8\u0010/\"\u0017\u0010;\u001a\u00020.8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b:\u0010/\"\u0017\u0010?\u001a\u00020<8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b=\u0010>\"\u0017\u0010A\u001a\u00020.8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b@\u0010/\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006B"}, d2 = {"", "selected", "Lkotlin/Function0;", "Lkotlin/b2;", "onClick", "Landroidx/compose/ui/n;", "modifier", "enabled", "Landroidx/compose/runtime/h;", "text", "icon", "Landroidx/compose/ui/graphics/l0;", "selectedContentColor", "unselectedContentColor", "Landroidx/compose/foundation/interaction/g;", "interactionSource", ak.aF, "(ZLyh/a;Landroidx/compose/ui/n;ZLyh/p;Lyh/p;JJLandroidx/compose/foundation/interaction/g;Landroidx/compose/runtime/p;II)V", ak.av, "(ZLyh/a;Lyh/p;Lyh/p;Landroidx/compose/ui/n;ZJJLandroidx/compose/foundation/interaction/g;Landroidx/compose/runtime/p;II)V", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/o;", "Lkotlin/t;", "content", "b", "(ZLyh/a;Landroidx/compose/ui/n;ZJJLandroidx/compose/foundation/interaction/g;Lyh/q;Landroidx/compose/runtime/p;II)V", "activeColor", "inactiveColor", "e", "(JJZLyh/p;Landroidx/compose/runtime/p;I)V", "d", "(Lyh/p;Lyh/p;Landroidx/compose/runtime/p;I)V", "Landroidx/compose/ui/layout/e1$a;", "Landroidx/compose/ui/layout/e1;", "textOrIconPlaceable", "", "tabHeight", "q", "Ls1/e;", "density", "textPlaceable", "iconPlaceable", "tabWidth", "firstBaseline", "lastBaseline", "p", "Ls1/h;", "F", "SmallTabHeight", "LargeTabHeight", "I", "TabFadeInAnimationDuration", "TabFadeInAnimationDelay", "TabFadeOutAnimationDuration", "f", "HorizontalTextPadding", "g", "SingleLineTextBaselineWithIcon", RXScreenCaptureService.KEY_HEIGHT, "DoubleLineTextBaselineWithIcon", "Ls1/u;", "i", "J", "IconDistanceFromBaseline", "j", "TextDistanceFromLeadingIcon", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class TabKt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f11165c = 150;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f11166d = 100;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f11167e = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f11163a = t0.o0.f140157a.n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f11164b = s1.h.g(72);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f11168f = s1.h.g(16);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f11169g = s1.h.g(14);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f11170h = s1.h.g(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f11171i = s1.v.m(20);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f11172j = s1.h.g(8);

    /* JADX WARN: Code duplicated, block: B:102:0x0138  */
    /* JADX WARN: Code duplicated, block: B:104:0x0143  */
    /* JADX WARN: Code duplicated, block: B:114:0x0169 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x016b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0170  */
    /* JADX WARN: Code duplicated, block: B:120:0x0175  */
    /* JADX WARN: Code duplicated, block: B:123:0x0189  */
    /* JADX WARN: Code duplicated, block: B:124:0x0191  */
    /* JADX WARN: Code duplicated, block: B:126:0x0197  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:130:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:134:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:137:0x0233  */
    /* JADX WARN: Code duplicated, block: B:142:0x0247  */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00df  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:89:0x0106  */
    /* JADX WARN: Code duplicated, block: B:91:0x010e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0114  */
    /* JADX WARN: Code duplicated, block: B:94:0x0117  */
    /* JADX WARN: Code duplicated, block: B:98:0x0125  */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void a(final boolean z10, @dl.d final yh.a<kotlin.b2> onClick, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> text, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> icon, @dl.e androidx.compose.ui.n nVar, boolean z11, long j10, long j11, @dl.e androidx.compose.foundation.interaction.g gVar, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.n nVar2;
        int i13;
        boolean z12;
        int i14;
        long jM;
        int i15;
        int i16;
        int i17;
        final int i18;
        long j12;
        androidx.compose.foundation.interaction.g gVar2;
        long j13;
        long j14;
        androidx.compose.ui.n nVar3;
        boolean z13;
        Object objU;
        final androidx.compose.ui.n nVar4;
        final boolean z14;
        final long j15;
        final long j16;
        final androidx.compose.foundation.interaction.g gVar3;
        androidx.compose.runtime.u1 u1VarH;
        int i19;
        kotlin.jvm.internal.f0.p(onClick, "onClick");
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(icon, "icon");
        androidx.compose.runtime.p pVarF = pVar.F(-777316544);
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
            i12 |= pVarF.s(onClick) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= bb.c.b.f30966u4;
        } else if ((i10 & bb.c.b.f30796me) == 0) {
            i12 |= pVarF.s(text) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= bb.c.d.f31193dj;
        } else if ((i10 & bb.c.g.f32954lc) == 0) {
            i12 |= pVarF.s(icon) ? 2048 : 1024;
        }
        int i20 = i11 & 16;
        if (i20 == 0) {
            if ((57344 & i10) == 0) {
                nVar2 = nVar;
                i12 |= pVarF.s(nVar2) ? 16384 : 8192;
            }
            i13 = i11 & 32;
            if (i13 != 0) {
                if ((458752 & i10) == 0) {
                    z12 = z11;
                    if (pVarF.u(z12)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i12 |= i14;
                }
                if ((3670016 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        jM = j10;
                        int i21 = pVarF.z(jM) ? 1048576 : 524288;
                        i12 |= i21;
                    } else {
                        jM = j10;
                    }
                    i12 |= i21;
                } else {
                    jM = j10;
                }
                if ((29360128 & i10) == 0) {
                    int i22 = i12;
                    if ((i11 & 128) == 0 || !pVarF.z(j11)) {
                        i19 = 4194304;
                    } else {
                        i19 = 8388608;
                    }
                    i15 = i22 | i19;
                } else {
                    i15 = i12;
                }
                i16 = i11 & 256;
                if (i16 != 0) {
                    i15 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (pVarF.s(gVar)) {
                        i17 = 67108864;
                    } else {
                        i17 = 33554432;
                    }
                    i15 |= i17;
                }
                if ((i15 & 191739611) == 38347922 || !pVarF.b()) {
                    pVarF.W();
                    if ((i10 & 1) != 0 || pVarF.o()) {
                        if (i20 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            i15 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            i18 = i15 & (-29360129);
                            j12 = jM;
                        } else {
                            i18 = i15;
                            j12 = j11;
                        }
                        if (i16 != 0) {
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
                        j13 = jM;
                        j14 = j12;
                        nVar3 = nVar2;
                        z13 = z12;
                    } else {
                        pVarF.l();
                        if ((i11 & 64) != 0) {
                            i15 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            i15 &= -29360129;
                        }
                        j14 = j11;
                        gVar2 = gVar;
                        z13 = z12;
                        j13 = jM;
                        i18 = i15;
                        nVar3 = nVar2;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-777316544, i18, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:154)");
                    }
                    final androidx.compose.foundation.x xVarE = androidx.compose.material.ripple.j.e(true, 0.0f, j13, pVarF, ((i18 >> 12) & bb.c.b.f30796me) | 6, 2);
                    final androidx.compose.ui.n nVar5 = nVar3;
                    final androidx.compose.foundation.interaction.g gVar4 = gVar2;
                    final boolean z15 = z13;
                    int i23 = i18;
                    androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVarF, -429037564, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$LeadingIconTab$2
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
                                ComposerKt.w0(-429037564, i24, -1, "androidx.compose.material3.LeadingIconTab.<anonymous> (Tab.kt:170)");
                            }
                            androidx.compose.ui.n nVarN = SizeKt.n(PaddingKt.m(SelectableKt.a(SizeKt.o(nVar5, TabKt.f11163a), z10, gVar4, xVarE, z15, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), TabKt.f11168f, 0.0f, 2, null), 0.0f, 1, null);
                            Arrangement.e eVarF = Arrangement.f5896a.f();
                            androidx.compose.ui.c.InterfaceC0079c interfaceC0079cQ = androidx.compose.ui.c.INSTANCE.q();
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar3 = icon;
                            int i25 = i18;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar4 = text;
                            pVar2.T(693286680);
                            androidx.compose.ui.layout.i0 i0VarD = RowKt.d(eVarF, interfaceC0079cQ, pVar2, 54);
                            pVar2.T(-1323940314);
                            s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA = companion.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarN);
                            if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVar2.h();
                            if (pVar2.getInserting()) {
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
                            pVar2.T(-501504408);
                            pVar3.invoke(pVar2, Integer.valueOf((i25 >> 9) & 14));
                            androidx.compose.foundation.layout.b1.a(SizeKt.z(androidx.compose.ui.n.INSTANCE, TabKt.f11172j), pVar2, 6);
                            TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar2, 6), t0.o0.f140157a.B());
                            TextKt.a(textStyleA.b((262142 & 1) != 0 ? textStyleA.spanStyle.m() : 0L, (262142 & 2) != 0 ? textStyleA.spanStyle.getFontSize() : 0L, (262142 & 4) != 0 ? textStyleA.spanStyle.getFontWeight() : null, (262142 & 8) != 0 ? textStyleA.spanStyle.getFontStyle() : null, (262142 & 16) != 0 ? textStyleA.spanStyle.getFontSynthesis() : null, (262142 & 32) != 0 ? textStyleA.spanStyle.getFontFamily() : null, (262142 & 64) != 0 ? textStyleA.spanStyle.getFontFeatureSettings() : null, (262142 & 128) != 0 ? textStyleA.spanStyle.getLetterSpacing() : 0L, (262142 & 256) != 0 ? textStyleA.spanStyle.getBaselineShift() : null, (262142 & 512) != 0 ? textStyleA.spanStyle.getTextGeometricTransform() : null, (262142 & 1024) != 0 ? textStyleA.spanStyle.getLocaleList() : null, (262142 & 2048) != 0 ? textStyleA.spanStyle.getBackground() : 0L, (262142 & 4096) != 0 ? textStyleA.spanStyle.getTextDecoration() : null, (262142 & 8192) != 0 ? textStyleA.spanStyle.getShadow() : null, (262142 & 16384) != 0 ? textStyleA.paragraphStyle.getTextAlign() : androidx.compose.ui.text.style.h.g(androidx.compose.ui.text.style.h.INSTANCE.a()), (262142 & 32768) != 0 ? textStyleA.paragraphStyle.getTextDirection() : null, (262142 & 65536) != 0 ? textStyleA.paragraphStyle.getLineHeight() : 0L, (262142 & 131072) != 0 ? textStyleA.paragraphStyle.getTextIndent() : null), pVar4, pVar2, (i25 >> 3) & 112);
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
                    int i24 = i23 >> 18;
                    e(j13, j14, z10, aVarB, pVarF, (i24 & 112) | (i24 & 14) | bb.c.d.f31193dj | ((i23 << 6) & bb.c.b.f30796me));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    z14 = z13;
                    j15 = j13;
                    j16 = j14;
                    gVar3 = gVar2;
                } else {
                    pVarF.l();
                    j16 = j11;
                    gVar3 = gVar;
                    j15 = jM;
                    z14 = z12;
                    nVar4 = nVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$LeadingIconTab$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i25) {
                        TabKt.a(z10, onClick, text, icon, nVar4, z14, j15, j16, gVar3, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i12 |= androidx.profileinstaller.o.c.f26824k;
            z12 = z11;
            if ((3670016 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    jM = j10;
                    if (pVarF.z(jM)) {
                    }
                    i12 |= i21;
                } else {
                    jM = j10;
                }
                i12 |= i21;
            } else {
                jM = j10;
            }
            if ((29360128 & i10) == 0) {
                int i25 = i12;
                if ((i11 & 128) == 0) {
                    i19 = 4194304;
                } else {
                    i19 = 4194304;
                }
                i15 = i25 | i19;
            } else {
                i15 = i12;
            }
            i16 = i11 & 256;
            if (i16 != 0) {
                i15 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (pVarF.s(gVar)) {
                    i17 = 67108864;
                } else {
                    i17 = 33554432;
                }
                i15 |= i17;
            }
            if ((i15 & 191739611) == 38347922) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        i15 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        i18 = i15 & (-29360129);
                        j12 = jM;
                    } else {
                        i18 = i15;
                        j12 = j11;
                    }
                    if (i16 != 0) {
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
                    j13 = jM;
                    j14 = j12;
                    nVar3 = nVar2;
                    z13 = z12;
                } else {
                    if (i20 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        i15 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        i18 = i15 & (-29360129);
                        j12 = jM;
                    } else {
                        i18 = i15;
                        j12 = j11;
                    }
                    if (i16 != 0) {
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
                    j13 = jM;
                    j14 = j12;
                    nVar3 = nVar2;
                    z13 = z12;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-777316544, i18, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:154)");
                }
                final androidx.compose.foundation.x xVarE2 = androidx.compose.material.ripple.j.e(true, 0.0f, j13, pVarF, ((i18 >> 12) & bb.c.b.f30796me) | 6, 2);
                final androidx.compose.ui.n nVar6 = nVar3;
                final androidx.compose.foundation.interaction.g gVar5 = gVar2;
                final boolean z16 = z13;
                int i26 = i18;
                androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVarF, -429037564, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$LeadingIconTab$2
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
                            ComposerKt.w0(-429037564, i27, -1, "androidx.compose.material3.LeadingIconTab.<anonymous> (Tab.kt:170)");
                        }
                        androidx.compose.ui.n nVarN = SizeKt.n(PaddingKt.m(SelectableKt.a(SizeKt.o(nVar6, TabKt.f11163a), z10, gVar5, xVarE2, z16, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), TabKt.f11168f, 0.0f, 2, null), 0.0f, 1, null);
                        Arrangement.e eVarF = Arrangement.f5896a.f();
                        androidx.compose.ui.c.InterfaceC0079c interfaceC0079cQ = androidx.compose.ui.c.INSTANCE.q();
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar3 = icon;
                        int i28 = i18;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar4 = text;
                        pVar2.T(693286680);
                        androidx.compose.ui.layout.i0 i0VarD = RowKt.d(eVarF, interfaceC0079cQ, pVar2, 54);
                        pVar2.T(-1323940314);
                        s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA = companion.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarN);
                        if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar2.h();
                        if (pVar2.getInserting()) {
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
                        pVar2.T(-501504408);
                        pVar3.invoke(pVar2, Integer.valueOf((i28 >> 9) & 14));
                        androidx.compose.foundation.layout.b1.a(SizeKt.z(androidx.compose.ui.n.INSTANCE, TabKt.f11172j), pVar2, 6);
                        TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar2, 6), t0.o0.f140157a.B());
                        TextKt.a(textStyleA.b((262142 & 1) != 0 ? textStyleA.spanStyle.m() : 0L, (262142 & 2) != 0 ? textStyleA.spanStyle.getFontSize() : 0L, (262142 & 4) != 0 ? textStyleA.spanStyle.getFontWeight() : null, (262142 & 8) != 0 ? textStyleA.spanStyle.getFontStyle() : null, (262142 & 16) != 0 ? textStyleA.spanStyle.getFontSynthesis() : null, (262142 & 32) != 0 ? textStyleA.spanStyle.getFontFamily() : null, (262142 & 64) != 0 ? textStyleA.spanStyle.getFontFeatureSettings() : null, (262142 & 128) != 0 ? textStyleA.spanStyle.getLetterSpacing() : 0L, (262142 & 256) != 0 ? textStyleA.spanStyle.getBaselineShift() : null, (262142 & 512) != 0 ? textStyleA.spanStyle.getTextGeometricTransform() : null, (262142 & 1024) != 0 ? textStyleA.spanStyle.getLocaleList() : null, (262142 & 2048) != 0 ? textStyleA.spanStyle.getBackground() : 0L, (262142 & 4096) != 0 ? textStyleA.spanStyle.getTextDecoration() : null, (262142 & 8192) != 0 ? textStyleA.spanStyle.getShadow() : null, (262142 & 16384) != 0 ? textStyleA.paragraphStyle.getTextAlign() : androidx.compose.ui.text.style.h.g(androidx.compose.ui.text.style.h.INSTANCE.a()), (262142 & 32768) != 0 ? textStyleA.paragraphStyle.getTextDirection() : null, (262142 & 65536) != 0 ? textStyleA.paragraphStyle.getLineHeight() : 0L, (262142 & 131072) != 0 ? textStyleA.paragraphStyle.getTextIndent() : null), pVar4, pVar2, (i28 >> 3) & 112);
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
                int i27 = i26 >> 18;
                e(j13, j14, z10, aVarB2, pVarF, (i27 & 112) | (i27 & 14) | bb.c.d.f31193dj | ((i26 << 6) & bb.c.b.f30796me));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                z14 = z13;
                j15 = j13;
                j16 = j14;
                gVar3 = gVar2;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        i15 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        i18 = i15 & (-29360129);
                        j12 = jM;
                    } else {
                        i18 = i15;
                        j12 = j11;
                    }
                    if (i16 != 0) {
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
                    j13 = jM;
                    j14 = j12;
                    nVar3 = nVar2;
                    z13 = z12;
                } else {
                    if (i20 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        i15 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        i18 = i15 & (-29360129);
                        j12 = jM;
                    } else {
                        i18 = i15;
                        j12 = j11;
                    }
                    if (i16 != 0) {
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
                    j13 = jM;
                    j14 = j12;
                    nVar3 = nVar2;
                    z13 = z12;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-777316544, i18, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:154)");
                }
                final androidx.compose.foundation.x xVarE3 = androidx.compose.material.ripple.j.e(true, 0.0f, j13, pVarF, ((i18 >> 12) & bb.c.b.f30796me) | 6, 2);
                final androidx.compose.ui.n nVar7 = nVar3;
                final androidx.compose.foundation.interaction.g gVar6 = gVar2;
                final boolean z17 = z13;
                int i28 = i18;
                androidx.compose.runtime.internal.a aVarB3 = androidx.compose.runtime.internal.b.b(pVarF, -429037564, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$LeadingIconTab$2
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
                            ComposerKt.w0(-429037564, i29, -1, "androidx.compose.material3.LeadingIconTab.<anonymous> (Tab.kt:170)");
                        }
                        androidx.compose.ui.n nVarN = SizeKt.n(PaddingKt.m(SelectableKt.a(SizeKt.o(nVar7, TabKt.f11163a), z10, gVar6, xVarE3, z17, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), TabKt.f11168f, 0.0f, 2, null), 0.0f, 1, null);
                        Arrangement.e eVarF = Arrangement.f5896a.f();
                        androidx.compose.ui.c.InterfaceC0079c interfaceC0079cQ = androidx.compose.ui.c.INSTANCE.q();
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar3 = icon;
                        int i210 = i18;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar4 = text;
                        pVar2.T(693286680);
                        androidx.compose.ui.layout.i0 i0VarD = RowKt.d(eVarF, interfaceC0079cQ, pVar2, 54);
                        pVar2.T(-1323940314);
                        s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA = companion.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarN);
                        if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar2.h();
                        if (pVar2.getInserting()) {
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
                        pVar2.T(-501504408);
                        pVar3.invoke(pVar2, Integer.valueOf((i210 >> 9) & 14));
                        androidx.compose.foundation.layout.b1.a(SizeKt.z(androidx.compose.ui.n.INSTANCE, TabKt.f11172j), pVar2, 6);
                        TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar2, 6), t0.o0.f140157a.B());
                        TextKt.a(textStyleA.b((262142 & 1) != 0 ? textStyleA.spanStyle.m() : 0L, (262142 & 2) != 0 ? textStyleA.spanStyle.getFontSize() : 0L, (262142 & 4) != 0 ? textStyleA.spanStyle.getFontWeight() : null, (262142 & 8) != 0 ? textStyleA.spanStyle.getFontStyle() : null, (262142 & 16) != 0 ? textStyleA.spanStyle.getFontSynthesis() : null, (262142 & 32) != 0 ? textStyleA.spanStyle.getFontFamily() : null, (262142 & 64) != 0 ? textStyleA.spanStyle.getFontFeatureSettings() : null, (262142 & 128) != 0 ? textStyleA.spanStyle.getLetterSpacing() : 0L, (262142 & 256) != 0 ? textStyleA.spanStyle.getBaselineShift() : null, (262142 & 512) != 0 ? textStyleA.spanStyle.getTextGeometricTransform() : null, (262142 & 1024) != 0 ? textStyleA.spanStyle.getLocaleList() : null, (262142 & 2048) != 0 ? textStyleA.spanStyle.getBackground() : 0L, (262142 & 4096) != 0 ? textStyleA.spanStyle.getTextDecoration() : null, (262142 & 8192) != 0 ? textStyleA.spanStyle.getShadow() : null, (262142 & 16384) != 0 ? textStyleA.paragraphStyle.getTextAlign() : androidx.compose.ui.text.style.h.g(androidx.compose.ui.text.style.h.INSTANCE.a()), (262142 & 32768) != 0 ? textStyleA.paragraphStyle.getTextDirection() : null, (262142 & 65536) != 0 ? textStyleA.paragraphStyle.getLineHeight() : 0L, (262142 & 131072) != 0 ? textStyleA.paragraphStyle.getTextIndent() : null), pVar4, pVar2, (i210 >> 3) & 112);
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
                int i29 = i28 >> 18;
                e(j13, j14, z10, aVarB3, pVarF, (i29 & 112) | (i29 & 14) | bb.c.d.f31193dj | ((i28 << 6) & bb.c.b.f30796me));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                z14 = z13;
                j15 = j13;
                j16 = j14;
                gVar3 = gVar2;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$LeadingIconTab$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i210) {
                    TabKt.a(z10, onClick, text, icon, nVar4, z14, j15, j16, gVar3, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= 24576;
        nVar2 = nVar;
        i13 = i11 & 32;
        if (i13 != 0) {
            if ((458752 & i10) == 0) {
                z12 = z11;
                if (pVarF.u(z12)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i12 |= i14;
            }
            if ((3670016 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    jM = j10;
                    if (pVarF.z(jM)) {
                    }
                    i12 |= i21;
                } else {
                    jM = j10;
                }
                i12 |= i21;
            } else {
                jM = j10;
            }
            if ((29360128 & i10) == 0) {
                int i210 = i12;
                if ((i11 & 128) == 0) {
                    i19 = 4194304;
                } else {
                    i19 = 4194304;
                }
                i15 = i210 | i19;
            } else {
                i15 = i12;
            }
            i16 = i11 & 256;
            if (i16 != 0) {
                i15 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (pVarF.s(gVar)) {
                    i17 = 67108864;
                } else {
                    i17 = 33554432;
                }
                i15 |= i17;
            }
            if ((i15 & 191739611) == 38347922) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        i15 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        i18 = i15 & (-29360129);
                        j12 = jM;
                    } else {
                        i18 = i15;
                        j12 = j11;
                    }
                    if (i16 != 0) {
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
                    j13 = jM;
                    j14 = j12;
                    nVar3 = nVar2;
                    z13 = z12;
                } else {
                    if (i20 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        i15 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        i18 = i15 & (-29360129);
                        j12 = jM;
                    } else {
                        i18 = i15;
                        j12 = j11;
                    }
                    if (i16 != 0) {
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
                    j13 = jM;
                    j14 = j12;
                    nVar3 = nVar2;
                    z13 = z12;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-777316544, i18, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:154)");
                }
                final androidx.compose.foundation.x xVarE4 = androidx.compose.material.ripple.j.e(true, 0.0f, j13, pVarF, ((i18 >> 12) & bb.c.b.f30796me) | 6, 2);
                final androidx.compose.ui.n nVar8 = nVar3;
                final androidx.compose.foundation.interaction.g gVar7 = gVar2;
                final boolean z18 = z13;
                int i211 = i18;
                androidx.compose.runtime.internal.a aVarB4 = androidx.compose.runtime.internal.b.b(pVarF, -429037564, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$LeadingIconTab$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i212) {
                        if ((i212 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-429037564, i212, -1, "androidx.compose.material3.LeadingIconTab.<anonymous> (Tab.kt:170)");
                        }
                        androidx.compose.ui.n nVarN = SizeKt.n(PaddingKt.m(SelectableKt.a(SizeKt.o(nVar8, TabKt.f11163a), z10, gVar7, xVarE4, z18, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), TabKt.f11168f, 0.0f, 2, null), 0.0f, 1, null);
                        Arrangement.e eVarF = Arrangement.f5896a.f();
                        androidx.compose.ui.c.InterfaceC0079c interfaceC0079cQ = androidx.compose.ui.c.INSTANCE.q();
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar3 = icon;
                        int i213 = i18;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar4 = text;
                        pVar2.T(693286680);
                        androidx.compose.ui.layout.i0 i0VarD = RowKt.d(eVarF, interfaceC0079cQ, pVar2, 54);
                        pVar2.T(-1323940314);
                        s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA = companion.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarN);
                        if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar2.h();
                        if (pVar2.getInserting()) {
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
                        pVar2.T(-501504408);
                        pVar3.invoke(pVar2, Integer.valueOf((i213 >> 9) & 14));
                        androidx.compose.foundation.layout.b1.a(SizeKt.z(androidx.compose.ui.n.INSTANCE, TabKt.f11172j), pVar2, 6);
                        TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar2, 6), t0.o0.f140157a.B());
                        TextKt.a(textStyleA.b((262142 & 1) != 0 ? textStyleA.spanStyle.m() : 0L, (262142 & 2) != 0 ? textStyleA.spanStyle.getFontSize() : 0L, (262142 & 4) != 0 ? textStyleA.spanStyle.getFontWeight() : null, (262142 & 8) != 0 ? textStyleA.spanStyle.getFontStyle() : null, (262142 & 16) != 0 ? textStyleA.spanStyle.getFontSynthesis() : null, (262142 & 32) != 0 ? textStyleA.spanStyle.getFontFamily() : null, (262142 & 64) != 0 ? textStyleA.spanStyle.getFontFeatureSettings() : null, (262142 & 128) != 0 ? textStyleA.spanStyle.getLetterSpacing() : 0L, (262142 & 256) != 0 ? textStyleA.spanStyle.getBaselineShift() : null, (262142 & 512) != 0 ? textStyleA.spanStyle.getTextGeometricTransform() : null, (262142 & 1024) != 0 ? textStyleA.spanStyle.getLocaleList() : null, (262142 & 2048) != 0 ? textStyleA.spanStyle.getBackground() : 0L, (262142 & 4096) != 0 ? textStyleA.spanStyle.getTextDecoration() : null, (262142 & 8192) != 0 ? textStyleA.spanStyle.getShadow() : null, (262142 & 16384) != 0 ? textStyleA.paragraphStyle.getTextAlign() : androidx.compose.ui.text.style.h.g(androidx.compose.ui.text.style.h.INSTANCE.a()), (262142 & 32768) != 0 ? textStyleA.paragraphStyle.getTextDirection() : null, (262142 & 65536) != 0 ? textStyleA.paragraphStyle.getLineHeight() : 0L, (262142 & 131072) != 0 ? textStyleA.paragraphStyle.getTextIndent() : null), pVar4, pVar2, (i213 >> 3) & 112);
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
                int i212 = i211 >> 18;
                e(j13, j14, z10, aVarB4, pVarF, (i212 & 112) | (i212 & 14) | bb.c.d.f31193dj | ((i211 << 6) & bb.c.b.f30796me));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                z14 = z13;
                j15 = j13;
                j16 = j14;
                gVar3 = gVar2;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        i15 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        i18 = i15 & (-29360129);
                        j12 = jM;
                    } else {
                        i18 = i15;
                        j12 = j11;
                    }
                    if (i16 != 0) {
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
                    j13 = jM;
                    j14 = j12;
                    nVar3 = nVar2;
                    z13 = z12;
                } else {
                    if (i20 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        i15 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        i18 = i15 & (-29360129);
                        j12 = jM;
                    } else {
                        i18 = i15;
                        j12 = j11;
                    }
                    if (i16 != 0) {
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
                    j13 = jM;
                    j14 = j12;
                    nVar3 = nVar2;
                    z13 = z12;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-777316544, i18, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:154)");
                }
                final androidx.compose.foundation.x xVarE5 = androidx.compose.material.ripple.j.e(true, 0.0f, j13, pVarF, ((i18 >> 12) & bb.c.b.f30796me) | 6, 2);
                final androidx.compose.ui.n nVar9 = nVar3;
                final androidx.compose.foundation.interaction.g gVar8 = gVar2;
                final boolean z19 = z13;
                int i213 = i18;
                androidx.compose.runtime.internal.a aVarB5 = androidx.compose.runtime.internal.b.b(pVarF, -429037564, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$LeadingIconTab$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i214) {
                        if ((i214 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-429037564, i214, -1, "androidx.compose.material3.LeadingIconTab.<anonymous> (Tab.kt:170)");
                        }
                        androidx.compose.ui.n nVarN = SizeKt.n(PaddingKt.m(SelectableKt.a(SizeKt.o(nVar9, TabKt.f11163a), z10, gVar8, xVarE5, z19, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), TabKt.f11168f, 0.0f, 2, null), 0.0f, 1, null);
                        Arrangement.e eVarF = Arrangement.f5896a.f();
                        androidx.compose.ui.c.InterfaceC0079c interfaceC0079cQ = androidx.compose.ui.c.INSTANCE.q();
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar3 = icon;
                        int i215 = i18;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar4 = text;
                        pVar2.T(693286680);
                        androidx.compose.ui.layout.i0 i0VarD = RowKt.d(eVarF, interfaceC0079cQ, pVar2, 54);
                        pVar2.T(-1323940314);
                        s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA = companion.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarN);
                        if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar2.h();
                        if (pVar2.getInserting()) {
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
                        pVar2.T(-501504408);
                        pVar3.invoke(pVar2, Integer.valueOf((i215 >> 9) & 14));
                        androidx.compose.foundation.layout.b1.a(SizeKt.z(androidx.compose.ui.n.INSTANCE, TabKt.f11172j), pVar2, 6);
                        TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar2, 6), t0.o0.f140157a.B());
                        TextKt.a(textStyleA.b((262142 & 1) != 0 ? textStyleA.spanStyle.m() : 0L, (262142 & 2) != 0 ? textStyleA.spanStyle.getFontSize() : 0L, (262142 & 4) != 0 ? textStyleA.spanStyle.getFontWeight() : null, (262142 & 8) != 0 ? textStyleA.spanStyle.getFontStyle() : null, (262142 & 16) != 0 ? textStyleA.spanStyle.getFontSynthesis() : null, (262142 & 32) != 0 ? textStyleA.spanStyle.getFontFamily() : null, (262142 & 64) != 0 ? textStyleA.spanStyle.getFontFeatureSettings() : null, (262142 & 128) != 0 ? textStyleA.spanStyle.getLetterSpacing() : 0L, (262142 & 256) != 0 ? textStyleA.spanStyle.getBaselineShift() : null, (262142 & 512) != 0 ? textStyleA.spanStyle.getTextGeometricTransform() : null, (262142 & 1024) != 0 ? textStyleA.spanStyle.getLocaleList() : null, (262142 & 2048) != 0 ? textStyleA.spanStyle.getBackground() : 0L, (262142 & 4096) != 0 ? textStyleA.spanStyle.getTextDecoration() : null, (262142 & 8192) != 0 ? textStyleA.spanStyle.getShadow() : null, (262142 & 16384) != 0 ? textStyleA.paragraphStyle.getTextAlign() : androidx.compose.ui.text.style.h.g(androidx.compose.ui.text.style.h.INSTANCE.a()), (262142 & 32768) != 0 ? textStyleA.paragraphStyle.getTextDirection() : null, (262142 & 65536) != 0 ? textStyleA.paragraphStyle.getLineHeight() : 0L, (262142 & 131072) != 0 ? textStyleA.paragraphStyle.getTextIndent() : null), pVar4, pVar2, (i215 >> 3) & 112);
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
                int i214 = i213 >> 18;
                e(j13, j14, z10, aVarB5, pVarF, (i214 & 112) | (i214 & 14) | bb.c.d.f31193dj | ((i213 << 6) & bb.c.b.f30796me));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                z14 = z13;
                j15 = j13;
                j16 = j14;
                gVar3 = gVar2;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$LeadingIconTab$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i215) {
                    TabKt.a(z10, onClick, text, icon, nVar4, z14, j15, j16, gVar3, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= androidx.profileinstaller.o.c.f26824k;
        z12 = z11;
        if ((3670016 & i10) == 0) {
            if ((i11 & 64) == 0) {
                jM = j10;
                if (pVarF.z(jM)) {
                }
                i12 |= i21;
            } else {
                jM = j10;
            }
            i12 |= i21;
        } else {
            jM = j10;
        }
        if ((29360128 & i10) == 0) {
            int i215 = i12;
            if ((i11 & 128) == 0) {
                i19 = 4194304;
            } else {
                i19 = 4194304;
            }
            i15 = i215 | i19;
        } else {
            i15 = i12;
        }
        i16 = i11 & 256;
        if (i16 != 0) {
            i15 |= 100663296;
        } else if ((i10 & 234881024) == 0) {
            if (pVarF.s(gVar)) {
                i17 = 67108864;
            } else {
                i17 = 33554432;
            }
            i15 |= i17;
        }
        if ((i15 & 191739611) == 38347922) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i13 != 0) {
                    z12 = true;
                }
                if ((i11 & 64) != 0) {
                    jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    i15 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    i18 = i15 & (-29360129);
                    j12 = jM;
                } else {
                    i18 = i15;
                    j12 = j11;
                }
                if (i16 != 0) {
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
                j13 = jM;
                j14 = j12;
                nVar3 = nVar2;
                z13 = z12;
            } else {
                if (i20 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i13 != 0) {
                    z12 = true;
                }
                if ((i11 & 64) != 0) {
                    jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    i15 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    i18 = i15 & (-29360129);
                    j12 = jM;
                } else {
                    i18 = i15;
                    j12 = j11;
                }
                if (i16 != 0) {
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
                j13 = jM;
                j14 = j12;
                nVar3 = nVar2;
                z13 = z12;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-777316544, i18, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:154)");
            }
            final androidx.compose.foundation.x xVarE6 = androidx.compose.material.ripple.j.e(true, 0.0f, j13, pVarF, ((i18 >> 12) & bb.c.b.f30796me) | 6, 2);
            final androidx.compose.ui.n nVar10 = nVar3;
            final androidx.compose.foundation.interaction.g gVar9 = gVar2;
            final boolean z110 = z13;
            int i216 = i18;
            androidx.compose.runtime.internal.a aVarB6 = androidx.compose.runtime.internal.b.b(pVarF, -429037564, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$LeadingIconTab$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i217) {
                    if ((i217 & 11) == 2 && pVar2.b()) {
                        pVar2.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-429037564, i217, -1, "androidx.compose.material3.LeadingIconTab.<anonymous> (Tab.kt:170)");
                    }
                    androidx.compose.ui.n nVarN = SizeKt.n(PaddingKt.m(SelectableKt.a(SizeKt.o(nVar10, TabKt.f11163a), z10, gVar9, xVarE6, z110, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), TabKt.f11168f, 0.0f, 2, null), 0.0f, 1, null);
                    Arrangement.e eVarF = Arrangement.f5896a.f();
                    androidx.compose.ui.c.InterfaceC0079c interfaceC0079cQ = androidx.compose.ui.c.INSTANCE.q();
                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar3 = icon;
                    int i218 = i18;
                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar4 = text;
                    pVar2.T(693286680);
                    androidx.compose.ui.layout.i0 i0VarD = RowKt.d(eVarF, interfaceC0079cQ, pVar2, 54);
                    pVar2.T(-1323940314);
                    s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                    androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    yh.a<ComposeUiNode> aVarA = companion.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarN);
                    if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVar2.h();
                    if (pVar2.getInserting()) {
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
                    pVar2.T(-501504408);
                    pVar3.invoke(pVar2, Integer.valueOf((i218 >> 9) & 14));
                    androidx.compose.foundation.layout.b1.a(SizeKt.z(androidx.compose.ui.n.INSTANCE, TabKt.f11172j), pVar2, 6);
                    TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar2, 6), t0.o0.f140157a.B());
                    TextKt.a(textStyleA.b((262142 & 1) != 0 ? textStyleA.spanStyle.m() : 0L, (262142 & 2) != 0 ? textStyleA.spanStyle.getFontSize() : 0L, (262142 & 4) != 0 ? textStyleA.spanStyle.getFontWeight() : null, (262142 & 8) != 0 ? textStyleA.spanStyle.getFontStyle() : null, (262142 & 16) != 0 ? textStyleA.spanStyle.getFontSynthesis() : null, (262142 & 32) != 0 ? textStyleA.spanStyle.getFontFamily() : null, (262142 & 64) != 0 ? textStyleA.spanStyle.getFontFeatureSettings() : null, (262142 & 128) != 0 ? textStyleA.spanStyle.getLetterSpacing() : 0L, (262142 & 256) != 0 ? textStyleA.spanStyle.getBaselineShift() : null, (262142 & 512) != 0 ? textStyleA.spanStyle.getTextGeometricTransform() : null, (262142 & 1024) != 0 ? textStyleA.spanStyle.getLocaleList() : null, (262142 & 2048) != 0 ? textStyleA.spanStyle.getBackground() : 0L, (262142 & 4096) != 0 ? textStyleA.spanStyle.getTextDecoration() : null, (262142 & 8192) != 0 ? textStyleA.spanStyle.getShadow() : null, (262142 & 16384) != 0 ? textStyleA.paragraphStyle.getTextAlign() : androidx.compose.ui.text.style.h.g(androidx.compose.ui.text.style.h.INSTANCE.a()), (262142 & 32768) != 0 ? textStyleA.paragraphStyle.getTextDirection() : null, (262142 & 65536) != 0 ? textStyleA.paragraphStyle.getLineHeight() : 0L, (262142 & 131072) != 0 ? textStyleA.paragraphStyle.getTextIndent() : null), pVar4, pVar2, (i218 >> 3) & 112);
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
            int i217 = i216 >> 18;
            e(j13, j14, z10, aVarB6, pVarF, (i217 & 112) | (i217 & 14) | bb.c.d.f31193dj | ((i216 << 6) & bb.c.b.f30796me));
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            z14 = z13;
            j15 = j13;
            j16 = j14;
            gVar3 = gVar2;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i13 != 0) {
                    z12 = true;
                }
                if ((i11 & 64) != 0) {
                    jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    i15 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    i18 = i15 & (-29360129);
                    j12 = jM;
                } else {
                    i18 = i15;
                    j12 = j11;
                }
                if (i16 != 0) {
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
                j13 = jM;
                j14 = j12;
                nVar3 = nVar2;
                z13 = z12;
            } else {
                if (i20 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i13 != 0) {
                    z12 = true;
                }
                if ((i11 & 64) != 0) {
                    jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    i15 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    i18 = i15 & (-29360129);
                    j12 = jM;
                } else {
                    i18 = i15;
                    j12 = j11;
                }
                if (i16 != 0) {
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
                j13 = jM;
                j14 = j12;
                nVar3 = nVar2;
                z13 = z12;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-777316544, i18, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:154)");
            }
            final androidx.compose.foundation.x xVarE7 = androidx.compose.material.ripple.j.e(true, 0.0f, j13, pVarF, ((i18 >> 12) & bb.c.b.f30796me) | 6, 2);
            final androidx.compose.ui.n nVar11 = nVar3;
            final androidx.compose.foundation.interaction.g gVar10 = gVar2;
            final boolean z111 = z13;
            int i218 = i18;
            androidx.compose.runtime.internal.a aVarB7 = androidx.compose.runtime.internal.b.b(pVarF, -429037564, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$LeadingIconTab$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i219) {
                    if ((i219 & 11) == 2 && pVar2.b()) {
                        pVar2.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-429037564, i219, -1, "androidx.compose.material3.LeadingIconTab.<anonymous> (Tab.kt:170)");
                    }
                    androidx.compose.ui.n nVarN = SizeKt.n(PaddingKt.m(SelectableKt.a(SizeKt.o(nVar11, TabKt.f11163a), z10, gVar10, xVarE7, z111, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), TabKt.f11168f, 0.0f, 2, null), 0.0f, 1, null);
                    Arrangement.e eVarF = Arrangement.f5896a.f();
                    androidx.compose.ui.c.InterfaceC0079c interfaceC0079cQ = androidx.compose.ui.c.INSTANCE.q();
                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar3 = icon;
                    int i2110 = i18;
                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar4 = text;
                    pVar2.T(693286680);
                    androidx.compose.ui.layout.i0 i0VarD = RowKt.d(eVarF, interfaceC0079cQ, pVar2, 54);
                    pVar2.T(-1323940314);
                    s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                    androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    yh.a<ComposeUiNode> aVarA = companion.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarN);
                    if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVar2.h();
                    if (pVar2.getInserting()) {
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
                    pVar2.T(-501504408);
                    pVar3.invoke(pVar2, Integer.valueOf((i2110 >> 9) & 14));
                    androidx.compose.foundation.layout.b1.a(SizeKt.z(androidx.compose.ui.n.INSTANCE, TabKt.f11172j), pVar2, 6);
                    TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar2, 6), t0.o0.f140157a.B());
                    TextKt.a(textStyleA.b((262142 & 1) != 0 ? textStyleA.spanStyle.m() : 0L, (262142 & 2) != 0 ? textStyleA.spanStyle.getFontSize() : 0L, (262142 & 4) != 0 ? textStyleA.spanStyle.getFontWeight() : null, (262142 & 8) != 0 ? textStyleA.spanStyle.getFontStyle() : null, (262142 & 16) != 0 ? textStyleA.spanStyle.getFontSynthesis() : null, (262142 & 32) != 0 ? textStyleA.spanStyle.getFontFamily() : null, (262142 & 64) != 0 ? textStyleA.spanStyle.getFontFeatureSettings() : null, (262142 & 128) != 0 ? textStyleA.spanStyle.getLetterSpacing() : 0L, (262142 & 256) != 0 ? textStyleA.spanStyle.getBaselineShift() : null, (262142 & 512) != 0 ? textStyleA.spanStyle.getTextGeometricTransform() : null, (262142 & 1024) != 0 ? textStyleA.spanStyle.getLocaleList() : null, (262142 & 2048) != 0 ? textStyleA.spanStyle.getBackground() : 0L, (262142 & 4096) != 0 ? textStyleA.spanStyle.getTextDecoration() : null, (262142 & 8192) != 0 ? textStyleA.spanStyle.getShadow() : null, (262142 & 16384) != 0 ? textStyleA.paragraphStyle.getTextAlign() : androidx.compose.ui.text.style.h.g(androidx.compose.ui.text.style.h.INSTANCE.a()), (262142 & 32768) != 0 ? textStyleA.paragraphStyle.getTextDirection() : null, (262142 & 65536) != 0 ? textStyleA.paragraphStyle.getLineHeight() : 0L, (262142 & 131072) != 0 ? textStyleA.paragraphStyle.getTextIndent() : null), pVar4, pVar2, (i2110 >> 3) & 112);
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
            int i219 = i218 >> 18;
            e(j13, j14, z10, aVarB7, pVarF, (i219 & 112) | (i219 & 14) | bb.c.d.f31193dj | ((i218 << 6) & bb.c.b.f30796me));
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            z14 = z13;
            j15 = j13;
            j16 = j14;
            gVar3 = gVar2;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$LeadingIconTab$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2110) {
                TabKt.a(z10, onClick, text, icon, nVar4, z14, j15, j16, gVar3, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0144 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x0146  */
    /* JADX WARN: Code duplicated, block: B:107:0x014b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0150  */
    /* JADX WARN: Code duplicated, block: B:113:0x0164  */
    /* JADX WARN: Code duplicated, block: B:114:0x016c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0170  */
    /* JADX WARN: Code duplicated, block: B:118:0x0182  */
    /* JADX WARN: Code duplicated, block: B:120:0x0193  */
    /* JADX WARN: Code duplicated, block: B:124:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:127:0x0205  */
    /* JADX WARN: Code duplicated, block: B:132:0x0218  */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00df  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:88:0x0105  */
    /* JADX WARN: Code duplicated, block: B:92:0x0116  */
    /* JADX WARN: Code duplicated, block: B:94:0x0121  */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void b(final boolean z10, @dl.d final yh.a<kotlin.b2> onClick, @dl.e androidx.compose.ui.n nVar, boolean z11, long j10, long j11, @dl.e androidx.compose.foundation.interaction.g gVar, @dl.d final yh.q<? super androidx.compose.foundation.layout.o, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        final androidx.compose.ui.n nVar2;
        int i13;
        boolean z12;
        int i14;
        long jM;
        int i15;
        int i16;
        androidx.compose.foundation.interaction.g gVar2;
        int i17;
        int i18;
        long j12;
        androidx.compose.foundation.interaction.g gVar3;
        final int i19;
        long j13;
        androidx.compose.ui.n nVar3;
        long j14;
        Object objU;
        final boolean z13;
        final long j15;
        final long j16;
        final androidx.compose.foundation.interaction.g gVar4;
        androidx.compose.runtime.u1 u1VarH;
        int i20;
        kotlin.jvm.internal.f0.p(onClick, "onClick");
        kotlin.jvm.internal.f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(-202735880);
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
            i12 |= pVarF.s(onClick) ? 32 : 16;
        }
        int i21 = i11 & 4;
        if (i21 == 0) {
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
                        jM = j10;
                        int i22 = pVarF.z(jM) ? 16384 : 8192;
                        i12 |= i22;
                    } else {
                        jM = j10;
                    }
                    i12 |= i22;
                } else {
                    jM = j10;
                }
                if ((458752 & i10) == 0) {
                    int i23 = i12;
                    if ((i11 & 32) == 0 || !pVarF.z(j11)) {
                        i20 = 65536;
                    } else {
                        i20 = 131072;
                    }
                    i15 = i23 | i20;
                } else {
                    i15 = i12;
                }
                i16 = i11 & 64;
                if (i16 != 0) {
                    i15 |= 1572864;
                    gVar2 = gVar;
                } else {
                    gVar2 = gVar;
                    if ((i10 & 3670016) == 0) {
                        if (pVarF.s(gVar2)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i15 |= i17;
                    }
                }
                if ((i11 & 128) != 0) {
                    if ((29360128 & i10) == 0) {
                        if (pVarF.s(content)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                    }
                    if ((23967451 & i15) == 4793490 || !pVarF.b()) {
                        pVarF.W();
                        if ((i10 & 1) != 0 || pVarF.o()) {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            }
                            if ((i11 & 16) != 0) {
                                jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                                i15 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                i15 = (-458753) & i15;
                                j12 = jM;
                            } else {
                                j12 = j11;
                            }
                            if (i16 != 0) {
                                pVarF.T(-492369756);
                                objU = pVarF.U();
                                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = androidx.compose.foundation.interaction.f.a();
                                    pVarF.N(objU);
                                }
                                pVarF.c0();
                                gVar3 = (androidx.compose.foundation.interaction.g) objU;
                            } else {
                                gVar3 = gVar2;
                            }
                            i19 = i15;
                            j13 = j12;
                            nVar3 = nVar2;
                            j14 = jM;
                        } else {
                            pVarF.l();
                            if ((i11 & 16) != 0) {
                                i15 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                i15 &= -458753;
                            }
                            j13 = j11;
                            z12 = z12;
                            j14 = jM;
                            gVar3 = gVar2;
                            i19 = i15;
                            nVar3 = nVar2;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-202735880, i19, -1, "androidx.compose.material3.Tab (Tab.kt:225)");
                        }
                        final androidx.compose.foundation.x xVarE = androidx.compose.material.ripple.j.e(true, 0.0f, j14, pVarF, ((i19 >> 6) & bb.c.b.f30796me) | 6, 2);
                        final androidx.compose.ui.n nVar4 = nVar3;
                        final androidx.compose.foundation.interaction.g gVar5 = gVar3;
                        final boolean z14 = z12;
                        int i24 = i19;
                        int i25 = i24 >> 12;
                        e(j14, j13, z10, androidx.compose.runtime.internal.b.b(pVarF, -551896140, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$5
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
                                    ComposerKt.w0(-551896140, i26, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:240)");
                                }
                                androidx.compose.ui.n nVarN = SizeKt.n(SelectableKt.a(nVar4, z10, gVar5, xVarE, z14, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), 0.0f, 1, null);
                                androidx.compose.ui.c.b bVarM = androidx.compose.ui.c.INSTANCE.m();
                                Arrangement.e eVarF = Arrangement.f5896a.f();
                                yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                                int i27 = ((i19 >> 12) & bb.c.g.f32954lc) | bb.c.b.f30879q5;
                                pVar2.T(-483455358);
                                int i28 = i27 >> 3;
                                androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(eVarF, bVarM, pVar2, (i28 & 112) | (i28 & 14));
                                pVar2.T(-1323940314);
                                s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                                LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                                androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                yh.a<ComposeUiNode> aVarA = companion.a();
                                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarN);
                                int i29 = ((((i27 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                                if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                                    ComposablesKt.n();
                                }
                                pVar2.h();
                                if (pVar2.getInserting()) {
                                    pVar2.L(aVarA);
                                } else {
                                    pVar2.d();
                                }
                                pVar2.Y();
                                androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                                Updater.j(pVarB, i0VarB, companion.d());
                                Updater.j(pVarB, eVar, companion.b());
                                Updater.j(pVarB, layoutDirection, companion.c());
                                Updater.j(pVarB, d2Var, companion.f());
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
                        }), pVarF, (i25 & 112) | (i25 & 14) | bb.c.d.f31193dj | ((i24 << 6) & bb.c.b.f30796me));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar2 = nVar3;
                        z13 = z12;
                        j15 = j14;
                        j16 = j13;
                        gVar4 = gVar3;
                    } else {
                        pVarF.l();
                        z13 = z12;
                        j15 = jM;
                        gVar4 = gVar2;
                        j16 = j11;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i26) {
                            TabKt.b(z10, onClick, nVar2, z13, j15, j16, gVar4, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i18 = 12582912;
                i15 |= i18;
                if ((23967451 & i15) == 4793490) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            i15 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i15 = (-458753) & i15;
                            j12 = jM;
                        } else {
                            j12 = j11;
                        }
                        if (i16 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar2;
                        }
                        i19 = i15;
                        j13 = j12;
                        nVar3 = nVar2;
                        j14 = jM;
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            i15 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i15 = (-458753) & i15;
                            j12 = jM;
                        } else {
                            j12 = j11;
                        }
                        if (i16 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar2;
                        }
                        i19 = i15;
                        j13 = j12;
                        nVar3 = nVar2;
                        j14 = jM;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-202735880, i19, -1, "androidx.compose.material3.Tab (Tab.kt:225)");
                    }
                    final androidx.compose.foundation.x xVarE2 = androidx.compose.material.ripple.j.e(true, 0.0f, j14, pVarF, ((i19 >> 6) & bb.c.b.f30796me) | 6, 2);
                    final androidx.compose.ui.n nVar5 = nVar3;
                    final androidx.compose.foundation.interaction.g gVar6 = gVar3;
                    final boolean z15 = z12;
                    int i26 = i19;
                    int i27 = i26 >> 12;
                    e(j14, j13, z10, androidx.compose.runtime.internal.b.b(pVarF, -551896140, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i28) {
                            if ((i28 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-551896140, i28, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:240)");
                            }
                            androidx.compose.ui.n nVarN = SizeKt.n(SelectableKt.a(nVar5, z10, gVar6, xVarE2, z15, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), 0.0f, 1, null);
                            androidx.compose.ui.c.b bVarM = androidx.compose.ui.c.INSTANCE.m();
                            Arrangement.e eVarF = Arrangement.f5896a.f();
                            yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            int i29 = ((i19 >> 12) & bb.c.g.f32954lc) | bb.c.b.f30879q5;
                            pVar2.T(-483455358);
                            int i210 = i29 >> 3;
                            androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(eVarF, bVarM, pVar2, (i210 & 112) | (i210 & 14));
                            pVar2.T(-1323940314);
                            s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA = companion.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarN);
                            int i211 = ((((i29 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                            if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVar2.h();
                            if (pVar2.getInserting()) {
                                pVar2.L(aVarA);
                            } else {
                                pVar2.d();
                            }
                            pVar2.Y();
                            androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                            Updater.j(pVarB, i0VarB, companion.d());
                            Updater.j(pVarB, eVar, companion.b());
                            Updater.j(pVarB, layoutDirection, companion.c());
                            Updater.j(pVarB, d2Var, companion.f());
                            pVar2.x();
                            qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, Integer.valueOf((i211 >> 3) & 112));
                            pVar2.T(2058660585);
                            pVar2.T(-1163856341);
                            if (((i211 >> 9) & 14 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                            } else {
                                qVar.invoke(ColumnScopeInstance.f5971a, pVar2, Integer.valueOf(((i29 >> 6) & 112) | 6));
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
                    }), pVarF, (i27 & 112) | (i27 & 14) | bb.c.d.f31193dj | ((i26 << 6) & bb.c.b.f30796me));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar2 = nVar3;
                    z13 = z12;
                    j15 = j14;
                    j16 = j13;
                    gVar4 = gVar3;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            i15 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i15 = (-458753) & i15;
                            j12 = jM;
                        } else {
                            j12 = j11;
                        }
                        if (i16 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar2;
                        }
                        i19 = i15;
                        j13 = j12;
                        nVar3 = nVar2;
                        j14 = jM;
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            i15 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i15 = (-458753) & i15;
                            j12 = jM;
                        } else {
                            j12 = j11;
                        }
                        if (i16 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar2;
                        }
                        i19 = i15;
                        j13 = j12;
                        nVar3 = nVar2;
                        j14 = jM;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-202735880, i19, -1, "androidx.compose.material3.Tab (Tab.kt:225)");
                    }
                    final androidx.compose.foundation.x xVarE3 = androidx.compose.material.ripple.j.e(true, 0.0f, j14, pVarF, ((i19 >> 6) & bb.c.b.f30796me) | 6, 2);
                    final androidx.compose.ui.n nVar6 = nVar3;
                    final androidx.compose.foundation.interaction.g gVar7 = gVar3;
                    final boolean z16 = z12;
                    int i28 = i19;
                    int i29 = i28 >> 12;
                    e(j14, j13, z10, androidx.compose.runtime.internal.b.b(pVarF, -551896140, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i210) {
                            if ((i210 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-551896140, i210, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:240)");
                            }
                            androidx.compose.ui.n nVarN = SizeKt.n(SelectableKt.a(nVar6, z10, gVar7, xVarE3, z16, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), 0.0f, 1, null);
                            androidx.compose.ui.c.b bVarM = androidx.compose.ui.c.INSTANCE.m();
                            Arrangement.e eVarF = Arrangement.f5896a.f();
                            yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            int i211 = ((i19 >> 12) & bb.c.g.f32954lc) | bb.c.b.f30879q5;
                            pVar2.T(-483455358);
                            int i212 = i211 >> 3;
                            androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(eVarF, bVarM, pVar2, (i212 & 112) | (i212 & 14));
                            pVar2.T(-1323940314);
                            s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA = companion.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarN);
                            int i213 = ((((i211 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                            if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVar2.h();
                            if (pVar2.getInserting()) {
                                pVar2.L(aVarA);
                            } else {
                                pVar2.d();
                            }
                            pVar2.Y();
                            androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                            Updater.j(pVarB, i0VarB, companion.d());
                            Updater.j(pVarB, eVar, companion.b());
                            Updater.j(pVarB, layoutDirection, companion.c());
                            Updater.j(pVarB, d2Var, companion.f());
                            pVar2.x();
                            qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, Integer.valueOf((i213 >> 3) & 112));
                            pVar2.T(2058660585);
                            pVar2.T(-1163856341);
                            if (((i213 >> 9) & 14 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                            } else {
                                qVar.invoke(ColumnScopeInstance.f5971a, pVar2, Integer.valueOf(((i211 >> 6) & 112) | 6));
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
                    }), pVarF, (i29 & 112) | (i29 & 14) | bb.c.d.f31193dj | ((i28 << 6) & bb.c.b.f30796me));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar2 = nVar3;
                    z13 = z12;
                    j15 = j14;
                    j16 = j13;
                    gVar4 = gVar3;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i210) {
                        TabKt.b(z10, onClick, nVar2, z13, j15, j16, gVar4, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.d.f31193dj;
            z12 = z11;
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    jM = j10;
                    if (pVarF.z(jM)) {
                    }
                    i12 |= i22;
                } else {
                    jM = j10;
                }
                i12 |= i22;
            } else {
                jM = j10;
            }
            if ((458752 & i10) == 0) {
                int i210 = i12;
                if ((i11 & 32) == 0) {
                    i20 = 65536;
                } else {
                    i20 = 65536;
                }
                i15 = i210 | i20;
            } else {
                i15 = i12;
            }
            i16 = i11 & 64;
            if (i16 != 0) {
                i15 |= 1572864;
                gVar2 = gVar;
            } else {
                gVar2 = gVar;
                if ((i10 & 3670016) == 0) {
                    if (pVarF.s(gVar2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i15 |= i17;
                }
            }
            if ((i11 & 128) != 0) {
                if ((29360128 & i10) == 0) {
                    if (pVarF.s(content)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                }
                if ((23967451 & i15) == 4793490) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            i15 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i15 = (-458753) & i15;
                            j12 = jM;
                        } else {
                            j12 = j11;
                        }
                        if (i16 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar2;
                        }
                        i19 = i15;
                        j13 = j12;
                        nVar3 = nVar2;
                        j14 = jM;
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            i15 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i15 = (-458753) & i15;
                            j12 = jM;
                        } else {
                            j12 = j11;
                        }
                        if (i16 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar2;
                        }
                        i19 = i15;
                        j13 = j12;
                        nVar3 = nVar2;
                        j14 = jM;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-202735880, i19, -1, "androidx.compose.material3.Tab (Tab.kt:225)");
                    }
                    final androidx.compose.foundation.x xVarE4 = androidx.compose.material.ripple.j.e(true, 0.0f, j14, pVarF, ((i19 >> 6) & bb.c.b.f30796me) | 6, 2);
                    final androidx.compose.ui.n nVar7 = nVar3;
                    final androidx.compose.foundation.interaction.g gVar8 = gVar3;
                    final boolean z17 = z12;
                    int i211 = i19;
                    int i212 = i211 >> 12;
                    e(j14, j13, z10, androidx.compose.runtime.internal.b.b(pVarF, -551896140, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$5
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
                                ComposerKt.w0(-551896140, i213, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:240)");
                            }
                            androidx.compose.ui.n nVarN = SizeKt.n(SelectableKt.a(nVar7, z10, gVar8, xVarE4, z17, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), 0.0f, 1, null);
                            androidx.compose.ui.c.b bVarM = androidx.compose.ui.c.INSTANCE.m();
                            Arrangement.e eVarF = Arrangement.f5896a.f();
                            yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            int i214 = ((i19 >> 12) & bb.c.g.f32954lc) | bb.c.b.f30879q5;
                            pVar2.T(-483455358);
                            int i215 = i214 >> 3;
                            androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(eVarF, bVarM, pVar2, (i215 & 112) | (i215 & 14));
                            pVar2.T(-1323940314);
                            s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA = companion.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarN);
                            int i216 = ((((i214 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                            if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVar2.h();
                            if (pVar2.getInserting()) {
                                pVar2.L(aVarA);
                            } else {
                                pVar2.d();
                            }
                            pVar2.Y();
                            androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                            Updater.j(pVarB, i0VarB, companion.d());
                            Updater.j(pVarB, eVar, companion.b());
                            Updater.j(pVarB, layoutDirection, companion.c());
                            Updater.j(pVarB, d2Var, companion.f());
                            pVar2.x();
                            qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, Integer.valueOf((i216 >> 3) & 112));
                            pVar2.T(2058660585);
                            pVar2.T(-1163856341);
                            if (((i216 >> 9) & 14 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                            } else {
                                qVar.invoke(ColumnScopeInstance.f5971a, pVar2, Integer.valueOf(((i214 >> 6) & 112) | 6));
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
                    }), pVarF, (i212 & 112) | (i212 & 14) | bb.c.d.f31193dj | ((i211 << 6) & bb.c.b.f30796me));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar2 = nVar3;
                    z13 = z12;
                    j15 = j14;
                    j16 = j13;
                    gVar4 = gVar3;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            i15 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i15 = (-458753) & i15;
                            j12 = jM;
                        } else {
                            j12 = j11;
                        }
                        if (i16 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar2;
                        }
                        i19 = i15;
                        j13 = j12;
                        nVar3 = nVar2;
                        j14 = jM;
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            i15 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i15 = (-458753) & i15;
                            j12 = jM;
                        } else {
                            j12 = j11;
                        }
                        if (i16 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar2;
                        }
                        i19 = i15;
                        j13 = j12;
                        nVar3 = nVar2;
                        j14 = jM;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-202735880, i19, -1, "androidx.compose.material3.Tab (Tab.kt:225)");
                    }
                    final androidx.compose.foundation.x xVarE5 = androidx.compose.material.ripple.j.e(true, 0.0f, j14, pVarF, ((i19 >> 6) & bb.c.b.f30796me) | 6, 2);
                    final androidx.compose.ui.n nVar8 = nVar3;
                    final androidx.compose.foundation.interaction.g gVar9 = gVar3;
                    final boolean z18 = z12;
                    int i213 = i19;
                    int i214 = i213 >> 12;
                    e(j14, j13, z10, androidx.compose.runtime.internal.b.b(pVarF, -551896140, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i215) {
                            if ((i215 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-551896140, i215, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:240)");
                            }
                            androidx.compose.ui.n nVarN = SizeKt.n(SelectableKt.a(nVar8, z10, gVar9, xVarE5, z18, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), 0.0f, 1, null);
                            androidx.compose.ui.c.b bVarM = androidx.compose.ui.c.INSTANCE.m();
                            Arrangement.e eVarF = Arrangement.f5896a.f();
                            yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            int i216 = ((i19 >> 12) & bb.c.g.f32954lc) | bb.c.b.f30879q5;
                            pVar2.T(-483455358);
                            int i217 = i216 >> 3;
                            androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(eVarF, bVarM, pVar2, (i217 & 112) | (i217 & 14));
                            pVar2.T(-1323940314);
                            s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA = companion.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarN);
                            int i218 = ((((i216 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                            if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVar2.h();
                            if (pVar2.getInserting()) {
                                pVar2.L(aVarA);
                            } else {
                                pVar2.d();
                            }
                            pVar2.Y();
                            androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                            Updater.j(pVarB, i0VarB, companion.d());
                            Updater.j(pVarB, eVar, companion.b());
                            Updater.j(pVarB, layoutDirection, companion.c());
                            Updater.j(pVarB, d2Var, companion.f());
                            pVar2.x();
                            qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, Integer.valueOf((i218 >> 3) & 112));
                            pVar2.T(2058660585);
                            pVar2.T(-1163856341);
                            if (((i218 >> 9) & 14 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                            } else {
                                qVar.invoke(ColumnScopeInstance.f5971a, pVar2, Integer.valueOf(((i216 >> 6) & 112) | 6));
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
                    }), pVarF, (i214 & 112) | (i214 & 14) | bb.c.d.f31193dj | ((i213 << 6) & bb.c.b.f30796me));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar2 = nVar3;
                    z13 = z12;
                    j15 = j14;
                    j16 = j13;
                    gVar4 = gVar3;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i215) {
                        TabKt.b(z10, onClick, nVar2, z13, j15, j16, gVar4, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i18 = 12582912;
            i15 |= i18;
            if ((23967451 & i15) == 4793490) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        i15 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i15 = (-458753) & i15;
                        j12 = jM;
                    } else {
                        j12 = j11;
                    }
                    if (i16 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar2;
                    }
                    i19 = i15;
                    j13 = j12;
                    nVar3 = nVar2;
                    j14 = jM;
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        i15 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i15 = (-458753) & i15;
                        j12 = jM;
                    } else {
                        j12 = j11;
                    }
                    if (i16 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar2;
                    }
                    i19 = i15;
                    j13 = j12;
                    nVar3 = nVar2;
                    j14 = jM;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-202735880, i19, -1, "androidx.compose.material3.Tab (Tab.kt:225)");
                }
                final androidx.compose.foundation.x xVarE6 = androidx.compose.material.ripple.j.e(true, 0.0f, j14, pVarF, ((i19 >> 6) & bb.c.b.f30796me) | 6, 2);
                final androidx.compose.ui.n nVar9 = nVar3;
                final androidx.compose.foundation.interaction.g gVar10 = gVar3;
                final boolean z19 = z12;
                int i215 = i19;
                int i216 = i215 >> 12;
                e(j14, j13, z10, androidx.compose.runtime.internal.b.b(pVarF, -551896140, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i217) {
                        if ((i217 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-551896140, i217, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:240)");
                        }
                        androidx.compose.ui.n nVarN = SizeKt.n(SelectableKt.a(nVar9, z10, gVar10, xVarE6, z19, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), 0.0f, 1, null);
                        androidx.compose.ui.c.b bVarM = androidx.compose.ui.c.INSTANCE.m();
                        Arrangement.e eVarF = Arrangement.f5896a.f();
                        yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                        int i218 = ((i19 >> 12) & bb.c.g.f32954lc) | bb.c.b.f30879q5;
                        pVar2.T(-483455358);
                        int i219 = i218 >> 3;
                        androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(eVarF, bVarM, pVar2, (i219 & 112) | (i219 & 14));
                        pVar2.T(-1323940314);
                        s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA = companion.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarN);
                        int i2110 = ((((i218 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                        if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar2.h();
                        if (pVar2.getInserting()) {
                            pVar2.L(aVarA);
                        } else {
                            pVar2.d();
                        }
                        pVar2.Y();
                        androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                        Updater.j(pVarB, i0VarB, companion.d());
                        Updater.j(pVarB, eVar, companion.b());
                        Updater.j(pVarB, layoutDirection, companion.c());
                        Updater.j(pVarB, d2Var, companion.f());
                        pVar2.x();
                        qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, Integer.valueOf((i2110 >> 3) & 112));
                        pVar2.T(2058660585);
                        pVar2.T(-1163856341);
                        if (((i2110 >> 9) & 14 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                        } else {
                            qVar.invoke(ColumnScopeInstance.f5971a, pVar2, Integer.valueOf(((i218 >> 6) & 112) | 6));
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
                }), pVarF, (i216 & 112) | (i216 & 14) | bb.c.d.f31193dj | ((i215 << 6) & bb.c.b.f30796me));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar2 = nVar3;
                z13 = z12;
                j15 = j14;
                j16 = j13;
                gVar4 = gVar3;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        i15 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i15 = (-458753) & i15;
                        j12 = jM;
                    } else {
                        j12 = j11;
                    }
                    if (i16 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar2;
                    }
                    i19 = i15;
                    j13 = j12;
                    nVar3 = nVar2;
                    j14 = jM;
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        i15 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i15 = (-458753) & i15;
                        j12 = jM;
                    } else {
                        j12 = j11;
                    }
                    if (i16 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar2;
                    }
                    i19 = i15;
                    j13 = j12;
                    nVar3 = nVar2;
                    j14 = jM;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-202735880, i19, -1, "androidx.compose.material3.Tab (Tab.kt:225)");
                }
                final androidx.compose.foundation.x xVarE7 = androidx.compose.material.ripple.j.e(true, 0.0f, j14, pVarF, ((i19 >> 6) & bb.c.b.f30796me) | 6, 2);
                final androidx.compose.ui.n nVar10 = nVar3;
                final androidx.compose.foundation.interaction.g gVar11 = gVar3;
                final boolean z110 = z12;
                int i217 = i19;
                int i218 = i217 >> 12;
                e(j14, j13, z10, androidx.compose.runtime.internal.b.b(pVarF, -551896140, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i219) {
                        if ((i219 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-551896140, i219, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:240)");
                        }
                        androidx.compose.ui.n nVarN = SizeKt.n(SelectableKt.a(nVar10, z10, gVar11, xVarE7, z110, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), 0.0f, 1, null);
                        androidx.compose.ui.c.b bVarM = androidx.compose.ui.c.INSTANCE.m();
                        Arrangement.e eVarF = Arrangement.f5896a.f();
                        yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                        int i2110 = ((i19 >> 12) & bb.c.g.f32954lc) | bb.c.b.f30879q5;
                        pVar2.T(-483455358);
                        int i2111 = i2110 >> 3;
                        androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(eVarF, bVarM, pVar2, (i2111 & 112) | (i2111 & 14));
                        pVar2.T(-1323940314);
                        s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA = companion.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarN);
                        int i2112 = ((((i2110 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                        if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar2.h();
                        if (pVar2.getInserting()) {
                            pVar2.L(aVarA);
                        } else {
                            pVar2.d();
                        }
                        pVar2.Y();
                        androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                        Updater.j(pVarB, i0VarB, companion.d());
                        Updater.j(pVarB, eVar, companion.b());
                        Updater.j(pVarB, layoutDirection, companion.c());
                        Updater.j(pVarB, d2Var, companion.f());
                        pVar2.x();
                        qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, Integer.valueOf((i2112 >> 3) & 112));
                        pVar2.T(2058660585);
                        pVar2.T(-1163856341);
                        if (((i2112 >> 9) & 14 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                        } else {
                            qVar.invoke(ColumnScopeInstance.f5971a, pVar2, Integer.valueOf(((i2110 >> 6) & 112) | 6));
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
                }), pVarF, (i218 & 112) | (i218 & 14) | bb.c.d.f31193dj | ((i217 << 6) & bb.c.b.f30796me));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar2 = nVar3;
                z13 = z12;
                j15 = j14;
                j16 = j13;
                gVar4 = gVar3;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i219) {
                    TabKt.b(z10, onClick, nVar2, z13, j15, j16, gVar4, content, pVar2, i10 | 1, i11);
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
                    jM = j10;
                    if (pVarF.z(jM)) {
                    }
                    i12 |= i22;
                } else {
                    jM = j10;
                }
                i12 |= i22;
            } else {
                jM = j10;
            }
            if ((458752 & i10) == 0) {
                int i219 = i12;
                if ((i11 & 32) == 0) {
                    i20 = 65536;
                } else {
                    i20 = 65536;
                }
                i15 = i219 | i20;
            } else {
                i15 = i12;
            }
            i16 = i11 & 64;
            if (i16 != 0) {
                i15 |= 1572864;
                gVar2 = gVar;
            } else {
                gVar2 = gVar;
                if ((i10 & 3670016) == 0) {
                    if (pVarF.s(gVar2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i15 |= i17;
                }
            }
            if ((i11 & 128) != 0) {
                if ((29360128 & i10) == 0) {
                    if (pVarF.s(content)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                }
                if ((23967451 & i15) == 4793490) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            i15 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i15 = (-458753) & i15;
                            j12 = jM;
                        } else {
                            j12 = j11;
                        }
                        if (i16 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar2;
                        }
                        i19 = i15;
                        j13 = j12;
                        nVar3 = nVar2;
                        j14 = jM;
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            i15 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i15 = (-458753) & i15;
                            j12 = jM;
                        } else {
                            j12 = j11;
                        }
                        if (i16 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar2;
                        }
                        i19 = i15;
                        j13 = j12;
                        nVar3 = nVar2;
                        j14 = jM;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-202735880, i19, -1, "androidx.compose.material3.Tab (Tab.kt:225)");
                    }
                    final androidx.compose.foundation.x xVarE8 = androidx.compose.material.ripple.j.e(true, 0.0f, j14, pVarF, ((i19 >> 6) & bb.c.b.f30796me) | 6, 2);
                    final androidx.compose.ui.n nVar11 = nVar3;
                    final androidx.compose.foundation.interaction.g gVar12 = gVar3;
                    final boolean z111 = z12;
                    int i2110 = i19;
                    int i2111 = i2110 >> 12;
                    e(j14, j13, z10, androidx.compose.runtime.internal.b.b(pVarF, -551896140, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2112) {
                            if ((i2112 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-551896140, i2112, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:240)");
                            }
                            androidx.compose.ui.n nVarN = SizeKt.n(SelectableKt.a(nVar11, z10, gVar12, xVarE8, z111, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), 0.0f, 1, null);
                            androidx.compose.ui.c.b bVarM = androidx.compose.ui.c.INSTANCE.m();
                            Arrangement.e eVarF = Arrangement.f5896a.f();
                            yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            int i2113 = ((i19 >> 12) & bb.c.g.f32954lc) | bb.c.b.f30879q5;
                            pVar2.T(-483455358);
                            int i2114 = i2113 >> 3;
                            androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(eVarF, bVarM, pVar2, (i2114 & 112) | (i2114 & 14));
                            pVar2.T(-1323940314);
                            s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA = companion.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarN);
                            int i2115 = ((((i2113 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                            if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVar2.h();
                            if (pVar2.getInserting()) {
                                pVar2.L(aVarA);
                            } else {
                                pVar2.d();
                            }
                            pVar2.Y();
                            androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                            Updater.j(pVarB, i0VarB, companion.d());
                            Updater.j(pVarB, eVar, companion.b());
                            Updater.j(pVarB, layoutDirection, companion.c());
                            Updater.j(pVarB, d2Var, companion.f());
                            pVar2.x();
                            qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, Integer.valueOf((i2115 >> 3) & 112));
                            pVar2.T(2058660585);
                            pVar2.T(-1163856341);
                            if (((i2115 >> 9) & 14 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                            } else {
                                qVar.invoke(ColumnScopeInstance.f5971a, pVar2, Integer.valueOf(((i2113 >> 6) & 112) | 6));
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
                    }), pVarF, (i2111 & 112) | (i2111 & 14) | bb.c.d.f31193dj | ((i2110 << 6) & bb.c.b.f30796me));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar2 = nVar3;
                    z13 = z12;
                    j15 = j14;
                    j16 = j13;
                    gVar4 = gVar3;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            i15 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i15 = (-458753) & i15;
                            j12 = jM;
                        } else {
                            j12 = j11;
                        }
                        if (i16 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar2;
                        }
                        i19 = i15;
                        j13 = j12;
                        nVar3 = nVar2;
                        j14 = jM;
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            i15 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i15 = (-458753) & i15;
                            j12 = jM;
                        } else {
                            j12 = j11;
                        }
                        if (i16 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar2;
                        }
                        i19 = i15;
                        j13 = j12;
                        nVar3 = nVar2;
                        j14 = jM;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-202735880, i19, -1, "androidx.compose.material3.Tab (Tab.kt:225)");
                    }
                    final androidx.compose.foundation.x xVarE9 = androidx.compose.material.ripple.j.e(true, 0.0f, j14, pVarF, ((i19 >> 6) & bb.c.b.f30796me) | 6, 2);
                    final androidx.compose.ui.n nVar12 = nVar3;
                    final androidx.compose.foundation.interaction.g gVar13 = gVar3;
                    final boolean z112 = z12;
                    int i2112 = i19;
                    int i2113 = i2112 >> 12;
                    e(j14, j13, z10, androidx.compose.runtime.internal.b.b(pVarF, -551896140, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2114) {
                            if ((i2114 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-551896140, i2114, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:240)");
                            }
                            androidx.compose.ui.n nVarN = SizeKt.n(SelectableKt.a(nVar12, z10, gVar13, xVarE9, z112, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), 0.0f, 1, null);
                            androidx.compose.ui.c.b bVarM = androidx.compose.ui.c.INSTANCE.m();
                            Arrangement.e eVarF = Arrangement.f5896a.f();
                            yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            int i2115 = ((i19 >> 12) & bb.c.g.f32954lc) | bb.c.b.f30879q5;
                            pVar2.T(-483455358);
                            int i2116 = i2115 >> 3;
                            androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(eVarF, bVarM, pVar2, (i2116 & 112) | (i2116 & 14));
                            pVar2.T(-1323940314);
                            s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA = companion.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarN);
                            int i2117 = ((((i2115 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                            if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVar2.h();
                            if (pVar2.getInserting()) {
                                pVar2.L(aVarA);
                            } else {
                                pVar2.d();
                            }
                            pVar2.Y();
                            androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                            Updater.j(pVarB, i0VarB, companion.d());
                            Updater.j(pVarB, eVar, companion.b());
                            Updater.j(pVarB, layoutDirection, companion.c());
                            Updater.j(pVarB, d2Var, companion.f());
                            pVar2.x();
                            qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, Integer.valueOf((i2117 >> 3) & 112));
                            pVar2.T(2058660585);
                            pVar2.T(-1163856341);
                            if (((i2117 >> 9) & 14 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                            } else {
                                qVar.invoke(ColumnScopeInstance.f5971a, pVar2, Integer.valueOf(((i2115 >> 6) & 112) | 6));
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
                    }), pVarF, (i2113 & 112) | (i2113 & 14) | bb.c.d.f31193dj | ((i2112 << 6) & bb.c.b.f30796me));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar2 = nVar3;
                    z13 = z12;
                    j15 = j14;
                    j16 = j13;
                    gVar4 = gVar3;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2114) {
                        TabKt.b(z10, onClick, nVar2, z13, j15, j16, gVar4, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i18 = 12582912;
            i15 |= i18;
            if ((23967451 & i15) == 4793490) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        i15 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i15 = (-458753) & i15;
                        j12 = jM;
                    } else {
                        j12 = j11;
                    }
                    if (i16 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar2;
                    }
                    i19 = i15;
                    j13 = j12;
                    nVar3 = nVar2;
                    j14 = jM;
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        i15 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i15 = (-458753) & i15;
                        j12 = jM;
                    } else {
                        j12 = j11;
                    }
                    if (i16 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar2;
                    }
                    i19 = i15;
                    j13 = j12;
                    nVar3 = nVar2;
                    j14 = jM;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-202735880, i19, -1, "androidx.compose.material3.Tab (Tab.kt:225)");
                }
                final androidx.compose.foundation.x xVarE10 = androidx.compose.material.ripple.j.e(true, 0.0f, j14, pVarF, ((i19 >> 6) & bb.c.b.f30796me) | 6, 2);
                final androidx.compose.ui.n nVar13 = nVar3;
                final androidx.compose.foundation.interaction.g gVar14 = gVar3;
                final boolean z113 = z12;
                int i2114 = i19;
                int i2115 = i2114 >> 12;
                e(j14, j13, z10, androidx.compose.runtime.internal.b.b(pVarF, -551896140, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2116) {
                        if ((i2116 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-551896140, i2116, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:240)");
                        }
                        androidx.compose.ui.n nVarN = SizeKt.n(SelectableKt.a(nVar13, z10, gVar14, xVarE10, z113, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), 0.0f, 1, null);
                        androidx.compose.ui.c.b bVarM = androidx.compose.ui.c.INSTANCE.m();
                        Arrangement.e eVarF = Arrangement.f5896a.f();
                        yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                        int i2117 = ((i19 >> 12) & bb.c.g.f32954lc) | bb.c.b.f30879q5;
                        pVar2.T(-483455358);
                        int i2118 = i2117 >> 3;
                        androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(eVarF, bVarM, pVar2, (i2118 & 112) | (i2118 & 14));
                        pVar2.T(-1323940314);
                        s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA = companion.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarN);
                        int i2119 = ((((i2117 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                        if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar2.h();
                        if (pVar2.getInserting()) {
                            pVar2.L(aVarA);
                        } else {
                            pVar2.d();
                        }
                        pVar2.Y();
                        androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                        Updater.j(pVarB, i0VarB, companion.d());
                        Updater.j(pVarB, eVar, companion.b());
                        Updater.j(pVarB, layoutDirection, companion.c());
                        Updater.j(pVarB, d2Var, companion.f());
                        pVar2.x();
                        qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, Integer.valueOf((i2119 >> 3) & 112));
                        pVar2.T(2058660585);
                        pVar2.T(-1163856341);
                        if (((i2119 >> 9) & 14 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                        } else {
                            qVar.invoke(ColumnScopeInstance.f5971a, pVar2, Integer.valueOf(((i2117 >> 6) & 112) | 6));
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
                }), pVarF, (i2115 & 112) | (i2115 & 14) | bb.c.d.f31193dj | ((i2114 << 6) & bb.c.b.f30796me));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar2 = nVar3;
                z13 = z12;
                j15 = j14;
                j16 = j13;
                gVar4 = gVar3;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        i15 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i15 = (-458753) & i15;
                        j12 = jM;
                    } else {
                        j12 = j11;
                    }
                    if (i16 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar2;
                    }
                    i19 = i15;
                    j13 = j12;
                    nVar3 = nVar2;
                    j14 = jM;
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        i15 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i15 = (-458753) & i15;
                        j12 = jM;
                    } else {
                        j12 = j11;
                    }
                    if (i16 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar2;
                    }
                    i19 = i15;
                    j13 = j12;
                    nVar3 = nVar2;
                    j14 = jM;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-202735880, i19, -1, "androidx.compose.material3.Tab (Tab.kt:225)");
                }
                final androidx.compose.foundation.x xVarE11 = androidx.compose.material.ripple.j.e(true, 0.0f, j14, pVarF, ((i19 >> 6) & bb.c.b.f30796me) | 6, 2);
                final androidx.compose.ui.n nVar14 = nVar3;
                final androidx.compose.foundation.interaction.g gVar15 = gVar3;
                final boolean z114 = z12;
                int i2116 = i19;
                int i2117 = i2116 >> 12;
                e(j14, j13, z10, androidx.compose.runtime.internal.b.b(pVarF, -551896140, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2118) {
                        if ((i2118 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-551896140, i2118, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:240)");
                        }
                        androidx.compose.ui.n nVarN = SizeKt.n(SelectableKt.a(nVar14, z10, gVar15, xVarE11, z114, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), 0.0f, 1, null);
                        androidx.compose.ui.c.b bVarM = androidx.compose.ui.c.INSTANCE.m();
                        Arrangement.e eVarF = Arrangement.f5896a.f();
                        yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                        int i2119 = ((i19 >> 12) & bb.c.g.f32954lc) | bb.c.b.f30879q5;
                        pVar2.T(-483455358);
                        int i21110 = i2119 >> 3;
                        androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(eVarF, bVarM, pVar2, (i21110 & 112) | (i21110 & 14));
                        pVar2.T(-1323940314);
                        s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA = companion.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarN);
                        int i21111 = ((((i2119 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                        if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar2.h();
                        if (pVar2.getInserting()) {
                            pVar2.L(aVarA);
                        } else {
                            pVar2.d();
                        }
                        pVar2.Y();
                        androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                        Updater.j(pVarB, i0VarB, companion.d());
                        Updater.j(pVarB, eVar, companion.b());
                        Updater.j(pVarB, layoutDirection, companion.c());
                        Updater.j(pVarB, d2Var, companion.f());
                        pVar2.x();
                        qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, Integer.valueOf((i21111 >> 3) & 112));
                        pVar2.T(2058660585);
                        pVar2.T(-1163856341);
                        if (((i21111 >> 9) & 14 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                        } else {
                            qVar.invoke(ColumnScopeInstance.f5971a, pVar2, Integer.valueOf(((i2119 >> 6) & 112) | 6));
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
                }), pVarF, (i2117 & 112) | (i2117 & 14) | bb.c.d.f31193dj | ((i2116 << 6) & bb.c.b.f30796me));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar2 = nVar3;
                z13 = z12;
                j15 = j14;
                j16 = j13;
                gVar4 = gVar3;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2118) {
                    TabKt.b(z10, onClick, nVar2, z13, j15, j16, gVar4, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= bb.c.d.f31193dj;
        z12 = z11;
        if ((57344 & i10) == 0) {
            if ((i11 & 16) == 0) {
                jM = j10;
                if (pVarF.z(jM)) {
                }
                i12 |= i22;
            } else {
                jM = j10;
            }
            i12 |= i22;
        } else {
            jM = j10;
        }
        if ((458752 & i10) == 0) {
            int i2118 = i12;
            if ((i11 & 32) == 0) {
                i20 = 65536;
            } else {
                i20 = 65536;
            }
            i15 = i2118 | i20;
        } else {
            i15 = i12;
        }
        i16 = i11 & 64;
        if (i16 != 0) {
            i15 |= 1572864;
            gVar2 = gVar;
        } else {
            gVar2 = gVar;
            if ((i10 & 3670016) == 0) {
                if (pVarF.s(gVar2)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i15 |= i17;
            }
        }
        if ((i11 & 128) != 0) {
            if ((29360128 & i10) == 0) {
                if (pVarF.s(content)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
            }
            if ((23967451 & i15) == 4793490) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        i15 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i15 = (-458753) & i15;
                        j12 = jM;
                    } else {
                        j12 = j11;
                    }
                    if (i16 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar2;
                    }
                    i19 = i15;
                    j13 = j12;
                    nVar3 = nVar2;
                    j14 = jM;
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        i15 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i15 = (-458753) & i15;
                        j12 = jM;
                    } else {
                        j12 = j11;
                    }
                    if (i16 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar2;
                    }
                    i19 = i15;
                    j13 = j12;
                    nVar3 = nVar2;
                    j14 = jM;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-202735880, i19, -1, "androidx.compose.material3.Tab (Tab.kt:225)");
                }
                final androidx.compose.foundation.x xVarE12 = androidx.compose.material.ripple.j.e(true, 0.0f, j14, pVarF, ((i19 >> 6) & bb.c.b.f30796me) | 6, 2);
                final androidx.compose.ui.n nVar15 = nVar3;
                final androidx.compose.foundation.interaction.g gVar16 = gVar3;
                final boolean z115 = z12;
                int i2119 = i19;
                int i21110 = i2119 >> 12;
                e(j14, j13, z10, androidx.compose.runtime.internal.b.b(pVarF, -551896140, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21111) {
                        if ((i21111 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-551896140, i21111, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:240)");
                        }
                        androidx.compose.ui.n nVarN = SizeKt.n(SelectableKt.a(nVar15, z10, gVar16, xVarE12, z115, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), 0.0f, 1, null);
                        androidx.compose.ui.c.b bVarM = androidx.compose.ui.c.INSTANCE.m();
                        Arrangement.e eVarF = Arrangement.f5896a.f();
                        yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                        int i21112 = ((i19 >> 12) & bb.c.g.f32954lc) | bb.c.b.f30879q5;
                        pVar2.T(-483455358);
                        int i21113 = i21112 >> 3;
                        androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(eVarF, bVarM, pVar2, (i21113 & 112) | (i21113 & 14));
                        pVar2.T(-1323940314);
                        s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA = companion.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarN);
                        int i21114 = ((((i21112 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                        if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar2.h();
                        if (pVar2.getInserting()) {
                            pVar2.L(aVarA);
                        } else {
                            pVar2.d();
                        }
                        pVar2.Y();
                        androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                        Updater.j(pVarB, i0VarB, companion.d());
                        Updater.j(pVarB, eVar, companion.b());
                        Updater.j(pVarB, layoutDirection, companion.c());
                        Updater.j(pVarB, d2Var, companion.f());
                        pVar2.x();
                        qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, Integer.valueOf((i21114 >> 3) & 112));
                        pVar2.T(2058660585);
                        pVar2.T(-1163856341);
                        if (((i21114 >> 9) & 14 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                        } else {
                            qVar.invoke(ColumnScopeInstance.f5971a, pVar2, Integer.valueOf(((i21112 >> 6) & 112) | 6));
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
                }), pVarF, (i21110 & 112) | (i21110 & 14) | bb.c.d.f31193dj | ((i2119 << 6) & bb.c.b.f30796me));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar2 = nVar3;
                z13 = z12;
                j15 = j14;
                j16 = j13;
                gVar4 = gVar3;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        i15 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i15 = (-458753) & i15;
                        j12 = jM;
                    } else {
                        j12 = j11;
                    }
                    if (i16 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar2;
                    }
                    i19 = i15;
                    j13 = j12;
                    nVar3 = nVar2;
                    j14 = jM;
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        i15 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i15 = (-458753) & i15;
                        j12 = jM;
                    } else {
                        j12 = j11;
                    }
                    if (i16 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar2;
                    }
                    i19 = i15;
                    j13 = j12;
                    nVar3 = nVar2;
                    j14 = jM;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-202735880, i19, -1, "androidx.compose.material3.Tab (Tab.kt:225)");
                }
                final androidx.compose.foundation.x xVarE13 = androidx.compose.material.ripple.j.e(true, 0.0f, j14, pVarF, ((i19 >> 6) & bb.c.b.f30796me) | 6, 2);
                final androidx.compose.ui.n nVar16 = nVar3;
                final androidx.compose.foundation.interaction.g gVar17 = gVar3;
                final boolean z116 = z12;
                int i21111 = i19;
                int i21112 = i21111 >> 12;
                e(j14, j13, z10, androidx.compose.runtime.internal.b.b(pVarF, -551896140, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21113) {
                        if ((i21113 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-551896140, i21113, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:240)");
                        }
                        androidx.compose.ui.n nVarN = SizeKt.n(SelectableKt.a(nVar16, z10, gVar17, xVarE13, z116, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), 0.0f, 1, null);
                        androidx.compose.ui.c.b bVarM = androidx.compose.ui.c.INSTANCE.m();
                        Arrangement.e eVarF = Arrangement.f5896a.f();
                        yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                        int i21114 = ((i19 >> 12) & bb.c.g.f32954lc) | bb.c.b.f30879q5;
                        pVar2.T(-483455358);
                        int i21115 = i21114 >> 3;
                        androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(eVarF, bVarM, pVar2, (i21115 & 112) | (i21115 & 14));
                        pVar2.T(-1323940314);
                        s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA = companion.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarN);
                        int i21116 = ((((i21114 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                        if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar2.h();
                        if (pVar2.getInserting()) {
                            pVar2.L(aVarA);
                        } else {
                            pVar2.d();
                        }
                        pVar2.Y();
                        androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                        Updater.j(pVarB, i0VarB, companion.d());
                        Updater.j(pVarB, eVar, companion.b());
                        Updater.j(pVarB, layoutDirection, companion.c());
                        Updater.j(pVarB, d2Var, companion.f());
                        pVar2.x();
                        qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, Integer.valueOf((i21116 >> 3) & 112));
                        pVar2.T(2058660585);
                        pVar2.T(-1163856341);
                        if (((i21116 >> 9) & 14 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                        } else {
                            qVar.invoke(ColumnScopeInstance.f5971a, pVar2, Integer.valueOf(((i21114 >> 6) & 112) | 6));
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
                }), pVarF, (i21112 & 112) | (i21112 & 14) | bb.c.d.f31193dj | ((i21111 << 6) & bb.c.b.f30796me));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar2 = nVar3;
                z13 = z12;
                j15 = j14;
                j16 = j13;
                gVar4 = gVar3;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21113) {
                    TabKt.b(z10, onClick, nVar2, z13, j15, j16, gVar4, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i18 = 12582912;
        i15 |= i18;
        if ((23967451 & i15) == 4793490) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i13 != 0) {
                    z12 = true;
                }
                if ((i11 & 16) != 0) {
                    jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    i15 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    i15 = (-458753) & i15;
                    j12 = jM;
                } else {
                    j12 = j11;
                }
                if (i16 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar3 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar3 = gVar2;
                }
                i19 = i15;
                j13 = j12;
                nVar3 = nVar2;
                j14 = jM;
            } else {
                if (i21 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i13 != 0) {
                    z12 = true;
                }
                if ((i11 & 16) != 0) {
                    jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    i15 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    i15 = (-458753) & i15;
                    j12 = jM;
                } else {
                    j12 = j11;
                }
                if (i16 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar3 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar3 = gVar2;
                }
                i19 = i15;
                j13 = j12;
                nVar3 = nVar2;
                j14 = jM;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-202735880, i19, -1, "androidx.compose.material3.Tab (Tab.kt:225)");
            }
            final androidx.compose.foundation.x xVarE14 = androidx.compose.material.ripple.j.e(true, 0.0f, j14, pVarF, ((i19 >> 6) & bb.c.b.f30796me) | 6, 2);
            final androidx.compose.ui.n nVar17 = nVar3;
            final androidx.compose.foundation.interaction.g gVar18 = gVar3;
            final boolean z117 = z12;
            int i21113 = i19;
            int i21114 = i21113 >> 12;
            e(j14, j13, z10, androidx.compose.runtime.internal.b.b(pVarF, -551896140, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21115) {
                    if ((i21115 & 11) == 2 && pVar2.b()) {
                        pVar2.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-551896140, i21115, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:240)");
                    }
                    androidx.compose.ui.n nVarN = SizeKt.n(SelectableKt.a(nVar17, z10, gVar18, xVarE14, z117, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), 0.0f, 1, null);
                    androidx.compose.ui.c.b bVarM = androidx.compose.ui.c.INSTANCE.m();
                    Arrangement.e eVarF = Arrangement.f5896a.f();
                    yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                    int i21116 = ((i19 >> 12) & bb.c.g.f32954lc) | bb.c.b.f30879q5;
                    pVar2.T(-483455358);
                    int i21117 = i21116 >> 3;
                    androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(eVarF, bVarM, pVar2, (i21117 & 112) | (i21117 & 14));
                    pVar2.T(-1323940314);
                    s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                    androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    yh.a<ComposeUiNode> aVarA = companion.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarN);
                    int i21118 = ((((i21116 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                    if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVar2.h();
                    if (pVar2.getInserting()) {
                        pVar2.L(aVarA);
                    } else {
                        pVar2.d();
                    }
                    pVar2.Y();
                    androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                    Updater.j(pVarB, i0VarB, companion.d());
                    Updater.j(pVarB, eVar, companion.b());
                    Updater.j(pVarB, layoutDirection, companion.c());
                    Updater.j(pVarB, d2Var, companion.f());
                    pVar2.x();
                    qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, Integer.valueOf((i21118 >> 3) & 112));
                    pVar2.T(2058660585);
                    pVar2.T(-1163856341);
                    if (((i21118 >> 9) & 14 & 11) == 2 && pVar2.b()) {
                        pVar2.l();
                    } else {
                        qVar.invoke(ColumnScopeInstance.f5971a, pVar2, Integer.valueOf(((i21116 >> 6) & 112) | 6));
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
            }), pVarF, (i21114 & 112) | (i21114 & 14) | bb.c.d.f31193dj | ((i21113 << 6) & bb.c.b.f30796me));
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar2 = nVar3;
            z13 = z12;
            j15 = j14;
            j16 = j13;
            gVar4 = gVar3;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i13 != 0) {
                    z12 = true;
                }
                if ((i11 & 16) != 0) {
                    jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    i15 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    i15 = (-458753) & i15;
                    j12 = jM;
                } else {
                    j12 = j11;
                }
                if (i16 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar3 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar3 = gVar2;
                }
                i19 = i15;
                j13 = j12;
                nVar3 = nVar2;
                j14 = jM;
            } else {
                if (i21 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i13 != 0) {
                    z12 = true;
                }
                if ((i11 & 16) != 0) {
                    jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    i15 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    i15 = (-458753) & i15;
                    j12 = jM;
                } else {
                    j12 = j11;
                }
                if (i16 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar3 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar3 = gVar2;
                }
                i19 = i15;
                j13 = j12;
                nVar3 = nVar2;
                j14 = jM;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-202735880, i19, -1, "androidx.compose.material3.Tab (Tab.kt:225)");
            }
            final androidx.compose.foundation.x xVarE15 = androidx.compose.material.ripple.j.e(true, 0.0f, j14, pVarF, ((i19 >> 6) & bb.c.b.f30796me) | 6, 2);
            final androidx.compose.ui.n nVar18 = nVar3;
            final androidx.compose.foundation.interaction.g gVar19 = gVar3;
            final boolean z118 = z12;
            int i21115 = i19;
            int i21116 = i21115 >> 12;
            e(j14, j13, z10, androidx.compose.runtime.internal.b.b(pVarF, -551896140, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21117) {
                    if ((i21117 & 11) == 2 && pVar2.b()) {
                        pVar2.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-551896140, i21117, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:240)");
                    }
                    androidx.compose.ui.n nVarN = SizeKt.n(SelectableKt.a(nVar18, z10, gVar19, xVarE15, z118, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), 0.0f, 1, null);
                    androidx.compose.ui.c.b bVarM = androidx.compose.ui.c.INSTANCE.m();
                    Arrangement.e eVarF = Arrangement.f5896a.f();
                    yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                    int i21118 = ((i19 >> 12) & bb.c.g.f32954lc) | bb.c.b.f30879q5;
                    pVar2.T(-483455358);
                    int i21119 = i21118 >> 3;
                    androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(eVarF, bVarM, pVar2, (i21119 & 112) | (i21119 & 14));
                    pVar2.T(-1323940314);
                    s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                    androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    yh.a<ComposeUiNode> aVarA = companion.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarN);
                    int i211110 = ((((i21118 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                    if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVar2.h();
                    if (pVar2.getInserting()) {
                        pVar2.L(aVarA);
                    } else {
                        pVar2.d();
                    }
                    pVar2.Y();
                    androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                    Updater.j(pVarB, i0VarB, companion.d());
                    Updater.j(pVarB, eVar, companion.b());
                    Updater.j(pVarB, layoutDirection, companion.c());
                    Updater.j(pVarB, d2Var, companion.f());
                    pVar2.x();
                    qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, Integer.valueOf((i211110 >> 3) & 112));
                    pVar2.T(2058660585);
                    pVar2.T(-1163856341);
                    if (((i211110 >> 9) & 14 & 11) == 2 && pVar2.b()) {
                        pVar2.l();
                    } else {
                        qVar.invoke(ColumnScopeInstance.f5971a, pVar2, Integer.valueOf(((i21118 >> 6) & 112) | 6));
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
            }), pVarF, (i21116 & 112) | (i21116 & 14) | bb.c.d.f31193dj | ((i21115 << 6) & bb.c.b.f30796me));
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar2 = nVar3;
            z13 = z12;
            j15 = j14;
            j16 = j13;
            gVar4 = gVar3;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21117) {
                TabKt.b(z10, onClick, nVar2, z13, j15, j16, gVar4, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0138  */
    /* JADX WARN: Code duplicated, block: B:104:0x0145  */
    /* JADX WARN: Code duplicated, block: B:114:0x016c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x016e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0171  */
    /* JADX WARN: Code duplicated, block: B:118:0x0175  */
    /* JADX WARN: Code duplicated, block: B:119:0x0177  */
    /* JADX WARN: Code duplicated, block: B:121:0x017b  */
    /* JADX WARN: Code duplicated, block: B:122:0x017e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0182  */
    /* JADX WARN: Code duplicated, block: B:127:0x0188  */
    /* JADX WARN: Code duplicated, block: B:128:0x0199  */
    /* JADX WARN: Code duplicated, block: B:131:0x019f  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:141:0x01db  */
    /* JADX WARN: Code duplicated, block: B:143:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:146:0x0243  */
    /* JADX WARN: Code duplicated, block: B:151:0x025b  */
    /* JADX WARN: Code duplicated, block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00df  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:91:0x0107  */
    /* JADX WARN: Code duplicated, block: B:93:0x010d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0110  */
    /* JADX WARN: Code duplicated, block: B:98:0x011e  */
    /* JADX WARN: Instruction removed from duplicated block: B:102:0x0138, please report this as an issue */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void c(final boolean z10, @dl.d final yh.a<kotlin.b2> onClick, @dl.e androidx.compose.ui.n nVar, boolean z11, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar2, long j10, long j11, @dl.e androidx.compose.foundation.interaction.g gVar, @dl.e androidx.compose.runtime.p pVar3, final int i10, final int i11) {
        final int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar4;
        int i18;
        long j12;
        int i19;
        int i20;
        androidx.compose.ui.n nVar2;
        boolean z12;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar5;
        long jM;
        androidx.compose.foundation.interaction.g gVar2;
        androidx.compose.ui.n nVar3;
        boolean z13;
        long j13;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar6;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar7;
        Object objU;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar8;
        final androidx.compose.ui.n nVar4;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar9;
        final boolean z14;
        final long j14;
        final long j15;
        final androidx.compose.foundation.interaction.g gVar3;
        androidx.compose.runtime.u1 u1VarH;
        int i21;
        int i22;
        kotlin.jvm.internal.f0.p(onClick, "onClick");
        androidx.compose.runtime.p pVarF = pVar3.F(-350627181);
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
            i12 |= pVarF.s(onClick) ? 32 : 16;
        }
        int i23 = i11 & 4;
        if (i23 == 0) {
            if ((i10 & bb.c.b.f30796me) == 0) {
                i12 |= pVarF.s(nVar) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    if (pVarF.u(z11)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((i10 & 57344) == 0) {
                        if (pVarF.s(pVar)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 32;
                    if (i17 != 0) {
                        i12 |= androidx.profileinstaller.o.c.f26824k;
                        pVar4 = pVar2;
                    } else {
                        pVar4 = pVar2;
                        if ((i10 & 458752) == 0) {
                            if (pVarF.s(pVar4)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                    }
                    if ((i10 & 3670016) != 0) {
                        if ((i11 & 64) == 0 || !pVarF.z(j10)) {
                            i22 = 524288;
                        } else {
                            i22 = 1048576;
                        }
                        i12 |= i22;
                    }
                    if ((i10 & 29360128) == 0) {
                        j12 = j11;
                        if ((i11 & 128) == 0 || !pVarF.z(j12)) {
                            i21 = 4194304;
                        } else {
                            i21 = 8388608;
                        }
                        i12 |= i21;
                    } else {
                        j12 = j11;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 234881024) == 0) {
                        if (pVarF.s(gVar)) {
                            i20 = 67108864;
                        } else {
                            i20 = 33554432;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 191739611) == 38347922 || !pVarF.b()) {
                        pVarF.W();
                        if ((i10 & 1) != 0 || pVarF.o()) {
                            if (i23 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if (i15 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i17 != 0) {
                                pVar4 = null;
                            }
                            if ((i11 & 64) != 0) {
                                jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                                i12 &= -3670017;
                            } else {
                                jM = j10;
                            }
                            if ((i11 & 128) != 0) {
                                i12 &= -29360129;
                                j12 = jM;
                            }
                            if (i19 != 0) {
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
                            nVar3 = nVar2;
                            z13 = z12;
                            j13 = j12;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                        } else {
                            pVarF.l();
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                i12 &= -29360129;
                            }
                            nVar3 = nVar;
                            z13 = z11;
                            jM = j10;
                            gVar2 = gVar;
                            j13 = j12;
                            pVar6 = pVar4;
                            pVar7 = pVar;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-350627181, i12, -1, "androidx.compose.material3.Tab (Tab.kt:91)");
                        }
                        final androidx.compose.runtime.internal.a aVarB = pVar7 != null ? androidx.compose.runtime.internal.b.b(pVarF, 708874428, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$styledText$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar10, int i24) {
                                if ((i24 & 11) == 2 && pVar10.b()) {
                                    pVar10.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(708874428, i24, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:103)");
                                }
                                TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar10, 6), t0.o0.f140157a.B());
                                TextKt.a(textStyleA.b((262142 & 1) != 0 ? textStyleA.spanStyle.m() : 0L, (262142 & 2) != 0 ? textStyleA.spanStyle.getFontSize() : 0L, (262142 & 4) != 0 ? textStyleA.spanStyle.getFontWeight() : null, (262142 & 8) != 0 ? textStyleA.spanStyle.getFontStyle() : null, (262142 & 16) != 0 ? textStyleA.spanStyle.getFontSynthesis() : null, (262142 & 32) != 0 ? textStyleA.spanStyle.getFontFamily() : null, (262142 & 64) != 0 ? textStyleA.spanStyle.getFontFeatureSettings() : null, (262142 & 128) != 0 ? textStyleA.spanStyle.getLetterSpacing() : 0L, (262142 & 256) != 0 ? textStyleA.spanStyle.getBaselineShift() : null, (262142 & 512) != 0 ? textStyleA.spanStyle.getTextGeometricTransform() : null, (262142 & 1024) != 0 ? textStyleA.spanStyle.getLocaleList() : null, (262142 & 2048) != 0 ? textStyleA.spanStyle.getBackground() : 0L, (262142 & 4096) != 0 ? textStyleA.spanStyle.getTextDecoration() : null, (262142 & 8192) != 0 ? textStyleA.spanStyle.getShadow() : null, (262142 & 16384) != 0 ? textStyleA.paragraphStyle.getTextAlign() : androidx.compose.ui.text.style.h.g(androidx.compose.ui.text.style.h.INSTANCE.a()), (262142 & 32768) != 0 ? textStyleA.paragraphStyle.getTextDirection() : null, (262142 & 65536) != 0 ? textStyleA.paragraphStyle.getLineHeight() : 0L, (262142 & 131072) != 0 ? textStyleA.paragraphStyle.getTextIndent() : null), pVar7, pVar10, (i12 >> 9) & 112);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar10, Integer num) {
                                a(pVar10, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }) : null;
                        androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVarF, 1540996038, true, new yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d androidx.compose.foundation.layout.o Tab, @dl.e androidx.compose.runtime.p pVar10, int i24) {
                                kotlin.jvm.internal.f0.p(Tab, "$this$Tab");
                                if ((i24 & 81) == 16 && pVar10.b()) {
                                    pVar10.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1540996038, i24, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:118)");
                                }
                                TabKt.d(aVarB, pVar6, pVar10, (i12 >> 12) & 112);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.foundation.layout.o oVar, androidx.compose.runtime.p pVar10, Integer num) {
                                a(oVar, pVar10, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        int i24 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc);
                        int i25 = i12 >> 6;
                        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar10 = pVar6;
                        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11 = pVar7;
                        b(z10, onClick, nVar3, z13, jM, j13, gVar2, aVarB2, pVarF, i24 | (57344 & i25) | (458752 & i25) | (i25 & 3670016), 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        pVar8 = pVar11;
                        nVar4 = nVar3;
                        pVar9 = pVar10;
                        z14 = z13;
                        j14 = jM;
                        j15 = j13;
                        gVar3 = gVar2;
                    } else {
                        pVarF.l();
                        nVar4 = nVar;
                        z14 = z11;
                        pVar8 = pVar;
                        gVar3 = gVar;
                        pVar9 = pVar4;
                        j15 = j12;
                        j14 = j10;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar12, int i26) {
                            TabKt.c(z10, onClick, nVar4, z14, pVar8, pVar9, j14, j15, gVar3, pVar12, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar12, Integer num) {
                            a(pVar12, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i12 |= 24576;
                i17 = i11 & 32;
                if (i17 != 0) {
                    i12 |= androidx.profileinstaller.o.c.f26824k;
                    pVar4 = pVar2;
                } else {
                    pVar4 = pVar2;
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(pVar4)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i22 = 524288;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((i10 & 29360128) == 0) {
                    j12 = j11;
                    if ((i11 & 128) == 0) {
                        i21 = 4194304;
                    } else {
                        i21 = 4194304;
                    }
                    i12 |= i21;
                } else {
                    j12 = j11;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (pVarF.s(gVar)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i12 & 191739611) == 38347922) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i17 != 0) {
                            pVar4 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            i12 &= -3670017;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            j12 = jM;
                        }
                        if (i19 != 0) {
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
                        nVar3 = nVar2;
                        z13 = z12;
                        j13 = j12;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                    } else {
                        if (i23 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i17 != 0) {
                            pVar4 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            i12 &= -3670017;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            j12 = jM;
                        }
                        if (i19 != 0) {
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
                        nVar3 = nVar2;
                        z13 = z12;
                        j13 = j12;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-350627181, i12, -1, "androidx.compose.material3.Tab (Tab.kt:91)");
                    }
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> aVarB3 = pVar7 != null ? androidx.compose.runtime.internal.b.b(pVarF, 708874428, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$styledText$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar12, int i26) {
                            if ((i26 & 11) == 2 && pVar12.b()) {
                                pVar12.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(708874428, i26, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:103)");
                            }
                            TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar12, 6), t0.o0.f140157a.B());
                            TextKt.a(textStyleA.b((262142 & 1) != 0 ? textStyleA.spanStyle.m() : 0L, (262142 & 2) != 0 ? textStyleA.spanStyle.getFontSize() : 0L, (262142 & 4) != 0 ? textStyleA.spanStyle.getFontWeight() : null, (262142 & 8) != 0 ? textStyleA.spanStyle.getFontStyle() : null, (262142 & 16) != 0 ? textStyleA.spanStyle.getFontSynthesis() : null, (262142 & 32) != 0 ? textStyleA.spanStyle.getFontFamily() : null, (262142 & 64) != 0 ? textStyleA.spanStyle.getFontFeatureSettings() : null, (262142 & 128) != 0 ? textStyleA.spanStyle.getLetterSpacing() : 0L, (262142 & 256) != 0 ? textStyleA.spanStyle.getBaselineShift() : null, (262142 & 512) != 0 ? textStyleA.spanStyle.getTextGeometricTransform() : null, (262142 & 1024) != 0 ? textStyleA.spanStyle.getLocaleList() : null, (262142 & 2048) != 0 ? textStyleA.spanStyle.getBackground() : 0L, (262142 & 4096) != 0 ? textStyleA.spanStyle.getTextDecoration() : null, (262142 & 8192) != 0 ? textStyleA.spanStyle.getShadow() : null, (262142 & 16384) != 0 ? textStyleA.paragraphStyle.getTextAlign() : androidx.compose.ui.text.style.h.g(androidx.compose.ui.text.style.h.INSTANCE.a()), (262142 & 32768) != 0 ? textStyleA.paragraphStyle.getTextDirection() : null, (262142 & 65536) != 0 ? textStyleA.paragraphStyle.getLineHeight() : 0L, (262142 & 131072) != 0 ? textStyleA.paragraphStyle.getTextIndent() : null), pVar7, pVar12, (i12 >> 9) & 112);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar12, Integer num) {
                            a(pVar12, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }) : null;
                    androidx.compose.runtime.internal.a aVarB4 = androidx.compose.runtime.internal.b.b(pVarF, 1540996038, true, new yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d androidx.compose.foundation.layout.o Tab, @dl.e androidx.compose.runtime.p pVar12, int i26) {
                            kotlin.jvm.internal.f0.p(Tab, "$this$Tab");
                            if ((i26 & 81) == 16 && pVar12.b()) {
                                pVar12.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1540996038, i26, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:118)");
                            }
                            TabKt.d(aVarB3, pVar6, pVar12, (i12 >> 12) & 112);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.foundation.layout.o oVar, androidx.compose.runtime.p pVar12, Integer num) {
                            a(oVar, pVar12, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    int i26 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc);
                    int i27 = i12 >> 6;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar12 = pVar6;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar13 = pVar7;
                    b(z10, onClick, nVar3, z13, jM, j13, gVar2, aVarB4, pVarF, i26 | (57344 & i27) | (458752 & i27) | (i27 & 3670016), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar8 = pVar13;
                    nVar4 = nVar3;
                    pVar9 = pVar12;
                    z14 = z13;
                    j14 = jM;
                    j15 = j13;
                    gVar3 = gVar2;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i17 != 0) {
                            pVar4 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            i12 &= -3670017;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            j12 = jM;
                        }
                        if (i19 != 0) {
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
                        nVar3 = nVar2;
                        z13 = z12;
                        j13 = j12;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                    } else {
                        if (i23 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i17 != 0) {
                            pVar4 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            i12 &= -3670017;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            j12 = jM;
                        }
                        if (i19 != 0) {
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
                        nVar3 = nVar2;
                        z13 = z12;
                        j13 = j12;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-350627181, i12, -1, "androidx.compose.material3.Tab (Tab.kt:91)");
                    }
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> aVarB5 = pVar7 != null ? androidx.compose.runtime.internal.b.b(pVarF, 708874428, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$styledText$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar14, int i28) {
                            if ((i28 & 11) == 2 && pVar14.b()) {
                                pVar14.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(708874428, i28, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:103)");
                            }
                            TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar14, 6), t0.o0.f140157a.B());
                            TextKt.a(textStyleA.b((262142 & 1) != 0 ? textStyleA.spanStyle.m() : 0L, (262142 & 2) != 0 ? textStyleA.spanStyle.getFontSize() : 0L, (262142 & 4) != 0 ? textStyleA.spanStyle.getFontWeight() : null, (262142 & 8) != 0 ? textStyleA.spanStyle.getFontStyle() : null, (262142 & 16) != 0 ? textStyleA.spanStyle.getFontSynthesis() : null, (262142 & 32) != 0 ? textStyleA.spanStyle.getFontFamily() : null, (262142 & 64) != 0 ? textStyleA.spanStyle.getFontFeatureSettings() : null, (262142 & 128) != 0 ? textStyleA.spanStyle.getLetterSpacing() : 0L, (262142 & 256) != 0 ? textStyleA.spanStyle.getBaselineShift() : null, (262142 & 512) != 0 ? textStyleA.spanStyle.getTextGeometricTransform() : null, (262142 & 1024) != 0 ? textStyleA.spanStyle.getLocaleList() : null, (262142 & 2048) != 0 ? textStyleA.spanStyle.getBackground() : 0L, (262142 & 4096) != 0 ? textStyleA.spanStyle.getTextDecoration() : null, (262142 & 8192) != 0 ? textStyleA.spanStyle.getShadow() : null, (262142 & 16384) != 0 ? textStyleA.paragraphStyle.getTextAlign() : androidx.compose.ui.text.style.h.g(androidx.compose.ui.text.style.h.INSTANCE.a()), (262142 & 32768) != 0 ? textStyleA.paragraphStyle.getTextDirection() : null, (262142 & 65536) != 0 ? textStyleA.paragraphStyle.getLineHeight() : 0L, (262142 & 131072) != 0 ? textStyleA.paragraphStyle.getTextIndent() : null), pVar7, pVar14, (i12 >> 9) & 112);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar14, Integer num) {
                            a(pVar14, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }) : null;
                    androidx.compose.runtime.internal.a aVarB6 = androidx.compose.runtime.internal.b.b(pVarF, 1540996038, true, new yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d androidx.compose.foundation.layout.o Tab, @dl.e androidx.compose.runtime.p pVar14, int i28) {
                            kotlin.jvm.internal.f0.p(Tab, "$this$Tab");
                            if ((i28 & 81) == 16 && pVar14.b()) {
                                pVar14.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1540996038, i28, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:118)");
                            }
                            TabKt.d(aVarB5, pVar6, pVar14, (i12 >> 12) & 112);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.foundation.layout.o oVar, androidx.compose.runtime.p pVar14, Integer num) {
                            a(oVar, pVar14, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    int i28 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc);
                    int i29 = i12 >> 6;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar14 = pVar6;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar15 = pVar7;
                    b(z10, onClick, nVar3, z13, jM, j13, gVar2, aVarB6, pVarF, i28 | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar8 = pVar15;
                    nVar4 = nVar3;
                    pVar9 = pVar14;
                    z14 = z13;
                    j14 = jM;
                    j15 = j13;
                    gVar3 = gVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar16, int i210) {
                        TabKt.c(z10, onClick, nVar4, z14, pVar8, pVar9, j14, j15, gVar3, pVar16, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar16, Integer num) {
                        a(pVar16, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.d.f31193dj;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    if (pVarF.s(pVar)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    i12 |= androidx.profileinstaller.o.c.f26824k;
                    pVar4 = pVar2;
                } else {
                    pVar4 = pVar2;
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(pVar4)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i22 = 524288;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((i10 & 29360128) == 0) {
                    j12 = j11;
                    if ((i11 & 128) == 0) {
                        i21 = 4194304;
                    } else {
                        i21 = 4194304;
                    }
                    i12 |= i21;
                } else {
                    j12 = j11;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (pVarF.s(gVar)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i12 & 191739611) == 38347922) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i17 != 0) {
                            pVar4 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            i12 &= -3670017;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            j12 = jM;
                        }
                        if (i19 != 0) {
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
                        nVar3 = nVar2;
                        z13 = z12;
                        j13 = j12;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                    } else {
                        if (i23 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i17 != 0) {
                            pVar4 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            i12 &= -3670017;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            j12 = jM;
                        }
                        if (i19 != 0) {
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
                        nVar3 = nVar2;
                        z13 = z12;
                        j13 = j12;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-350627181, i12, -1, "androidx.compose.material3.Tab (Tab.kt:91)");
                    }
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> aVarB7 = pVar7 != null ? androidx.compose.runtime.internal.b.b(pVarF, 708874428, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$styledText$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar16, int i210) {
                            if ((i210 & 11) == 2 && pVar16.b()) {
                                pVar16.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(708874428, i210, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:103)");
                            }
                            TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar16, 6), t0.o0.f140157a.B());
                            TextKt.a(textStyleA.b((262142 & 1) != 0 ? textStyleA.spanStyle.m() : 0L, (262142 & 2) != 0 ? textStyleA.spanStyle.getFontSize() : 0L, (262142 & 4) != 0 ? textStyleA.spanStyle.getFontWeight() : null, (262142 & 8) != 0 ? textStyleA.spanStyle.getFontStyle() : null, (262142 & 16) != 0 ? textStyleA.spanStyle.getFontSynthesis() : null, (262142 & 32) != 0 ? textStyleA.spanStyle.getFontFamily() : null, (262142 & 64) != 0 ? textStyleA.spanStyle.getFontFeatureSettings() : null, (262142 & 128) != 0 ? textStyleA.spanStyle.getLetterSpacing() : 0L, (262142 & 256) != 0 ? textStyleA.spanStyle.getBaselineShift() : null, (262142 & 512) != 0 ? textStyleA.spanStyle.getTextGeometricTransform() : null, (262142 & 1024) != 0 ? textStyleA.spanStyle.getLocaleList() : null, (262142 & 2048) != 0 ? textStyleA.spanStyle.getBackground() : 0L, (262142 & 4096) != 0 ? textStyleA.spanStyle.getTextDecoration() : null, (262142 & 8192) != 0 ? textStyleA.spanStyle.getShadow() : null, (262142 & 16384) != 0 ? textStyleA.paragraphStyle.getTextAlign() : androidx.compose.ui.text.style.h.g(androidx.compose.ui.text.style.h.INSTANCE.a()), (262142 & 32768) != 0 ? textStyleA.paragraphStyle.getTextDirection() : null, (262142 & 65536) != 0 ? textStyleA.paragraphStyle.getLineHeight() : 0L, (262142 & 131072) != 0 ? textStyleA.paragraphStyle.getTextIndent() : null), pVar7, pVar16, (i12 >> 9) & 112);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar16, Integer num) {
                            a(pVar16, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }) : null;
                    androidx.compose.runtime.internal.a aVarB8 = androidx.compose.runtime.internal.b.b(pVarF, 1540996038, true, new yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d androidx.compose.foundation.layout.o Tab, @dl.e androidx.compose.runtime.p pVar16, int i210) {
                            kotlin.jvm.internal.f0.p(Tab, "$this$Tab");
                            if ((i210 & 81) == 16 && pVar16.b()) {
                                pVar16.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1540996038, i210, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:118)");
                            }
                            TabKt.d(aVarB7, pVar6, pVar16, (i12 >> 12) & 112);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.foundation.layout.o oVar, androidx.compose.runtime.p pVar16, Integer num) {
                            a(oVar, pVar16, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    int i210 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc);
                    int i211 = i12 >> 6;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar16 = pVar6;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar17 = pVar7;
                    b(z10, onClick, nVar3, z13, jM, j13, gVar2, aVarB8, pVarF, i210 | (57344 & i211) | (458752 & i211) | (i211 & 3670016), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar8 = pVar17;
                    nVar4 = nVar3;
                    pVar9 = pVar16;
                    z14 = z13;
                    j14 = jM;
                    j15 = j13;
                    gVar3 = gVar2;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i17 != 0) {
                            pVar4 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            i12 &= -3670017;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            j12 = jM;
                        }
                        if (i19 != 0) {
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
                        nVar3 = nVar2;
                        z13 = z12;
                        j13 = j12;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                    } else {
                        if (i23 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i17 != 0) {
                            pVar4 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            i12 &= -3670017;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            j12 = jM;
                        }
                        if (i19 != 0) {
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
                        nVar3 = nVar2;
                        z13 = z12;
                        j13 = j12;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-350627181, i12, -1, "androidx.compose.material3.Tab (Tab.kt:91)");
                    }
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> aVarB9 = pVar7 != null ? androidx.compose.runtime.internal.b.b(pVarF, 708874428, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$styledText$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar18, int i212) {
                            if ((i212 & 11) == 2 && pVar18.b()) {
                                pVar18.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(708874428, i212, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:103)");
                            }
                            TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar18, 6), t0.o0.f140157a.B());
                            TextKt.a(textStyleA.b((262142 & 1) != 0 ? textStyleA.spanStyle.m() : 0L, (262142 & 2) != 0 ? textStyleA.spanStyle.getFontSize() : 0L, (262142 & 4) != 0 ? textStyleA.spanStyle.getFontWeight() : null, (262142 & 8) != 0 ? textStyleA.spanStyle.getFontStyle() : null, (262142 & 16) != 0 ? textStyleA.spanStyle.getFontSynthesis() : null, (262142 & 32) != 0 ? textStyleA.spanStyle.getFontFamily() : null, (262142 & 64) != 0 ? textStyleA.spanStyle.getFontFeatureSettings() : null, (262142 & 128) != 0 ? textStyleA.spanStyle.getLetterSpacing() : 0L, (262142 & 256) != 0 ? textStyleA.spanStyle.getBaselineShift() : null, (262142 & 512) != 0 ? textStyleA.spanStyle.getTextGeometricTransform() : null, (262142 & 1024) != 0 ? textStyleA.spanStyle.getLocaleList() : null, (262142 & 2048) != 0 ? textStyleA.spanStyle.getBackground() : 0L, (262142 & 4096) != 0 ? textStyleA.spanStyle.getTextDecoration() : null, (262142 & 8192) != 0 ? textStyleA.spanStyle.getShadow() : null, (262142 & 16384) != 0 ? textStyleA.paragraphStyle.getTextAlign() : androidx.compose.ui.text.style.h.g(androidx.compose.ui.text.style.h.INSTANCE.a()), (262142 & 32768) != 0 ? textStyleA.paragraphStyle.getTextDirection() : null, (262142 & 65536) != 0 ? textStyleA.paragraphStyle.getLineHeight() : 0L, (262142 & 131072) != 0 ? textStyleA.paragraphStyle.getTextIndent() : null), pVar7, pVar18, (i12 >> 9) & 112);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar18, Integer num) {
                            a(pVar18, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }) : null;
                    androidx.compose.runtime.internal.a aVarB10 = androidx.compose.runtime.internal.b.b(pVarF, 1540996038, true, new yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d androidx.compose.foundation.layout.o Tab, @dl.e androidx.compose.runtime.p pVar18, int i212) {
                            kotlin.jvm.internal.f0.p(Tab, "$this$Tab");
                            if ((i212 & 81) == 16 && pVar18.b()) {
                                pVar18.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1540996038, i212, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:118)");
                            }
                            TabKt.d(aVarB9, pVar6, pVar18, (i12 >> 12) & 112);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.foundation.layout.o oVar, androidx.compose.runtime.p pVar18, Integer num) {
                            a(oVar, pVar18, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    int i212 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc);
                    int i213 = i12 >> 6;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar18 = pVar6;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar19 = pVar7;
                    b(z10, onClick, nVar3, z13, jM, j13, gVar2, aVarB10, pVarF, i212 | (57344 & i213) | (458752 & i213) | (i213 & 3670016), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar8 = pVar19;
                    nVar4 = nVar3;
                    pVar9 = pVar18;
                    z14 = z13;
                    j14 = jM;
                    j15 = j13;
                    gVar3 = gVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar110, int i214) {
                        TabKt.c(z10, onClick, nVar4, z14, pVar8, pVar9, j14, j15, gVar3, pVar110, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar110, Integer num) {
                        a(pVar110, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i12 |= 24576;
            i17 = i11 & 32;
            if (i17 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                pVar4 = pVar2;
            } else {
                pVar4 = pVar2;
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(pVar4)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i22 = 524288;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            if ((i10 & 29360128) == 0) {
                j12 = j11;
                if ((i11 & 128) == 0) {
                    i21 = 4194304;
                } else {
                    i21 = 4194304;
                }
                i12 |= i21;
            } else {
                j12 = j11;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (pVarF.s(gVar)) {
                    i20 = 67108864;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i12 & 191739611) == 38347922) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i17 != 0) {
                        pVar4 = null;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        i12 &= -3670017;
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        j12 = jM;
                    }
                    if (i19 != 0) {
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
                    nVar3 = nVar2;
                    z13 = z12;
                    j13 = j12;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                } else {
                    if (i23 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i17 != 0) {
                        pVar4 = null;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        i12 &= -3670017;
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        j12 = jM;
                    }
                    if (i19 != 0) {
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
                    nVar3 = nVar2;
                    z13 = z12;
                    j13 = j12;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-350627181, i12, -1, "androidx.compose.material3.Tab (Tab.kt:91)");
                }
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> aVarB11 = pVar7 != null ? androidx.compose.runtime.internal.b.b(pVarF, 708874428, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$styledText$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar110, int i214) {
                        if ((i214 & 11) == 2 && pVar110.b()) {
                            pVar110.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(708874428, i214, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:103)");
                        }
                        TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar110, 6), t0.o0.f140157a.B());
                        TextKt.a(textStyleA.b((262142 & 1) != 0 ? textStyleA.spanStyle.m() : 0L, (262142 & 2) != 0 ? textStyleA.spanStyle.getFontSize() : 0L, (262142 & 4) != 0 ? textStyleA.spanStyle.getFontWeight() : null, (262142 & 8) != 0 ? textStyleA.spanStyle.getFontStyle() : null, (262142 & 16) != 0 ? textStyleA.spanStyle.getFontSynthesis() : null, (262142 & 32) != 0 ? textStyleA.spanStyle.getFontFamily() : null, (262142 & 64) != 0 ? textStyleA.spanStyle.getFontFeatureSettings() : null, (262142 & 128) != 0 ? textStyleA.spanStyle.getLetterSpacing() : 0L, (262142 & 256) != 0 ? textStyleA.spanStyle.getBaselineShift() : null, (262142 & 512) != 0 ? textStyleA.spanStyle.getTextGeometricTransform() : null, (262142 & 1024) != 0 ? textStyleA.spanStyle.getLocaleList() : null, (262142 & 2048) != 0 ? textStyleA.spanStyle.getBackground() : 0L, (262142 & 4096) != 0 ? textStyleA.spanStyle.getTextDecoration() : null, (262142 & 8192) != 0 ? textStyleA.spanStyle.getShadow() : null, (262142 & 16384) != 0 ? textStyleA.paragraphStyle.getTextAlign() : androidx.compose.ui.text.style.h.g(androidx.compose.ui.text.style.h.INSTANCE.a()), (262142 & 32768) != 0 ? textStyleA.paragraphStyle.getTextDirection() : null, (262142 & 65536) != 0 ? textStyleA.paragraphStyle.getLineHeight() : 0L, (262142 & 131072) != 0 ? textStyleA.paragraphStyle.getTextIndent() : null), pVar7, pVar110, (i12 >> 9) & 112);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar110, Integer num) {
                        a(pVar110, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }) : null;
                androidx.compose.runtime.internal.a aVarB12 = androidx.compose.runtime.internal.b.b(pVarF, 1540996038, true, new yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.d androidx.compose.foundation.layout.o Tab, @dl.e androidx.compose.runtime.p pVar110, int i214) {
                        kotlin.jvm.internal.f0.p(Tab, "$this$Tab");
                        if ((i214 & 81) == 16 && pVar110.b()) {
                            pVar110.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1540996038, i214, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:118)");
                        }
                        TabKt.d(aVarB11, pVar6, pVar110, (i12 >> 12) & 112);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.q
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.foundation.layout.o oVar, androidx.compose.runtime.p pVar110, Integer num) {
                        a(oVar, pVar110, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                int i214 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc);
                int i215 = i12 >> 6;
                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar110 = pVar6;
                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111 = pVar7;
                b(z10, onClick, nVar3, z13, jM, j13, gVar2, aVarB12, pVarF, i214 | (57344 & i215) | (458752 & i215) | (i215 & 3670016), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar8 = pVar111;
                nVar4 = nVar3;
                pVar9 = pVar110;
                z14 = z13;
                j14 = jM;
                j15 = j13;
                gVar3 = gVar2;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i17 != 0) {
                        pVar4 = null;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        i12 &= -3670017;
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        j12 = jM;
                    }
                    if (i19 != 0) {
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
                    nVar3 = nVar2;
                    z13 = z12;
                    j13 = j12;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                } else {
                    if (i23 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i17 != 0) {
                        pVar4 = null;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        i12 &= -3670017;
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        j12 = jM;
                    }
                    if (i19 != 0) {
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
                    nVar3 = nVar2;
                    z13 = z12;
                    j13 = j12;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-350627181, i12, -1, "androidx.compose.material3.Tab (Tab.kt:91)");
                }
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> aVarB13 = pVar7 != null ? androidx.compose.runtime.internal.b.b(pVarF, 708874428, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$styledText$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar112, int i216) {
                        if ((i216 & 11) == 2 && pVar112.b()) {
                            pVar112.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(708874428, i216, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:103)");
                        }
                        TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar112, 6), t0.o0.f140157a.B());
                        TextKt.a(textStyleA.b((262142 & 1) != 0 ? textStyleA.spanStyle.m() : 0L, (262142 & 2) != 0 ? textStyleA.spanStyle.getFontSize() : 0L, (262142 & 4) != 0 ? textStyleA.spanStyle.getFontWeight() : null, (262142 & 8) != 0 ? textStyleA.spanStyle.getFontStyle() : null, (262142 & 16) != 0 ? textStyleA.spanStyle.getFontSynthesis() : null, (262142 & 32) != 0 ? textStyleA.spanStyle.getFontFamily() : null, (262142 & 64) != 0 ? textStyleA.spanStyle.getFontFeatureSettings() : null, (262142 & 128) != 0 ? textStyleA.spanStyle.getLetterSpacing() : 0L, (262142 & 256) != 0 ? textStyleA.spanStyle.getBaselineShift() : null, (262142 & 512) != 0 ? textStyleA.spanStyle.getTextGeometricTransform() : null, (262142 & 1024) != 0 ? textStyleA.spanStyle.getLocaleList() : null, (262142 & 2048) != 0 ? textStyleA.spanStyle.getBackground() : 0L, (262142 & 4096) != 0 ? textStyleA.spanStyle.getTextDecoration() : null, (262142 & 8192) != 0 ? textStyleA.spanStyle.getShadow() : null, (262142 & 16384) != 0 ? textStyleA.paragraphStyle.getTextAlign() : androidx.compose.ui.text.style.h.g(androidx.compose.ui.text.style.h.INSTANCE.a()), (262142 & 32768) != 0 ? textStyleA.paragraphStyle.getTextDirection() : null, (262142 & 65536) != 0 ? textStyleA.paragraphStyle.getLineHeight() : 0L, (262142 & 131072) != 0 ? textStyleA.paragraphStyle.getTextIndent() : null), pVar7, pVar112, (i12 >> 9) & 112);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar112, Integer num) {
                        a(pVar112, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }) : null;
                androidx.compose.runtime.internal.a aVarB14 = androidx.compose.runtime.internal.b.b(pVarF, 1540996038, true, new yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.d androidx.compose.foundation.layout.o Tab, @dl.e androidx.compose.runtime.p pVar112, int i216) {
                        kotlin.jvm.internal.f0.p(Tab, "$this$Tab");
                        if ((i216 & 81) == 16 && pVar112.b()) {
                            pVar112.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1540996038, i216, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:118)");
                        }
                        TabKt.d(aVarB13, pVar6, pVar112, (i12 >> 12) & 112);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.q
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.foundation.layout.o oVar, androidx.compose.runtime.p pVar112, Integer num) {
                        a(oVar, pVar112, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                int i216 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc);
                int i217 = i12 >> 6;
                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar112 = pVar6;
                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar113 = pVar7;
                b(z10, onClick, nVar3, z13, jM, j13, gVar2, aVarB14, pVarF, i216 | (57344 & i217) | (458752 & i217) | (i217 & 3670016), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar8 = pVar113;
                nVar4 = nVar3;
                pVar9 = pVar112;
                z14 = z13;
                j14 = jM;
                j15 = j13;
                gVar3 = gVar2;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar114, int i218) {
                    TabKt.c(z10, onClick, nVar4, z14, pVar8, pVar9, j14, j15, gVar3, pVar114, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar114, Integer num) {
                    a(pVar114, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= bb.c.b.f30966u4;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & bb.c.g.f32954lc) == 0) {
                if (pVarF.u(z11)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    if (pVarF.s(pVar)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    i12 |= androidx.profileinstaller.o.c.f26824k;
                    pVar4 = pVar2;
                } else {
                    pVar4 = pVar2;
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(pVar4)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i22 = 524288;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((i10 & 29360128) == 0) {
                    j12 = j11;
                    if ((i11 & 128) == 0) {
                        i21 = 4194304;
                    } else {
                        i21 = 4194304;
                    }
                    i12 |= i21;
                } else {
                    j12 = j11;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (pVarF.s(gVar)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i12 & 191739611) == 38347922) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i17 != 0) {
                            pVar4 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            i12 &= -3670017;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            j12 = jM;
                        }
                        if (i19 != 0) {
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
                        nVar3 = nVar2;
                        z13 = z12;
                        j13 = j12;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                    } else {
                        if (i23 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i17 != 0) {
                            pVar4 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            i12 &= -3670017;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            j12 = jM;
                        }
                        if (i19 != 0) {
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
                        nVar3 = nVar2;
                        z13 = z12;
                        j13 = j12;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-350627181, i12, -1, "androidx.compose.material3.Tab (Tab.kt:91)");
                    }
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> aVarB15 = pVar7 != null ? androidx.compose.runtime.internal.b.b(pVarF, 708874428, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$styledText$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar114, int i218) {
                            if ((i218 & 11) == 2 && pVar114.b()) {
                                pVar114.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(708874428, i218, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:103)");
                            }
                            TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar114, 6), t0.o0.f140157a.B());
                            TextKt.a(textStyleA.b((262142 & 1) != 0 ? textStyleA.spanStyle.m() : 0L, (262142 & 2) != 0 ? textStyleA.spanStyle.getFontSize() : 0L, (262142 & 4) != 0 ? textStyleA.spanStyle.getFontWeight() : null, (262142 & 8) != 0 ? textStyleA.spanStyle.getFontStyle() : null, (262142 & 16) != 0 ? textStyleA.spanStyle.getFontSynthesis() : null, (262142 & 32) != 0 ? textStyleA.spanStyle.getFontFamily() : null, (262142 & 64) != 0 ? textStyleA.spanStyle.getFontFeatureSettings() : null, (262142 & 128) != 0 ? textStyleA.spanStyle.getLetterSpacing() : 0L, (262142 & 256) != 0 ? textStyleA.spanStyle.getBaselineShift() : null, (262142 & 512) != 0 ? textStyleA.spanStyle.getTextGeometricTransform() : null, (262142 & 1024) != 0 ? textStyleA.spanStyle.getLocaleList() : null, (262142 & 2048) != 0 ? textStyleA.spanStyle.getBackground() : 0L, (262142 & 4096) != 0 ? textStyleA.spanStyle.getTextDecoration() : null, (262142 & 8192) != 0 ? textStyleA.spanStyle.getShadow() : null, (262142 & 16384) != 0 ? textStyleA.paragraphStyle.getTextAlign() : androidx.compose.ui.text.style.h.g(androidx.compose.ui.text.style.h.INSTANCE.a()), (262142 & 32768) != 0 ? textStyleA.paragraphStyle.getTextDirection() : null, (262142 & 65536) != 0 ? textStyleA.paragraphStyle.getLineHeight() : 0L, (262142 & 131072) != 0 ? textStyleA.paragraphStyle.getTextIndent() : null), pVar7, pVar114, (i12 >> 9) & 112);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar114, Integer num) {
                            a(pVar114, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }) : null;
                    androidx.compose.runtime.internal.a aVarB16 = androidx.compose.runtime.internal.b.b(pVarF, 1540996038, true, new yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d androidx.compose.foundation.layout.o Tab, @dl.e androidx.compose.runtime.p pVar114, int i218) {
                            kotlin.jvm.internal.f0.p(Tab, "$this$Tab");
                            if ((i218 & 81) == 16 && pVar114.b()) {
                                pVar114.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1540996038, i218, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:118)");
                            }
                            TabKt.d(aVarB15, pVar6, pVar114, (i12 >> 12) & 112);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.foundation.layout.o oVar, androidx.compose.runtime.p pVar114, Integer num) {
                            a(oVar, pVar114, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    int i218 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc);
                    int i219 = i12 >> 6;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar114 = pVar6;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar115 = pVar7;
                    b(z10, onClick, nVar3, z13, jM, j13, gVar2, aVarB16, pVarF, i218 | (57344 & i219) | (458752 & i219) | (i219 & 3670016), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar8 = pVar115;
                    nVar4 = nVar3;
                    pVar9 = pVar114;
                    z14 = z13;
                    j14 = jM;
                    j15 = j13;
                    gVar3 = gVar2;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i17 != 0) {
                            pVar4 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            i12 &= -3670017;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            j12 = jM;
                        }
                        if (i19 != 0) {
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
                        nVar3 = nVar2;
                        z13 = z12;
                        j13 = j12;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                    } else {
                        if (i23 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i17 != 0) {
                            pVar4 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                            i12 &= -3670017;
                        } else {
                            jM = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            j12 = jM;
                        }
                        if (i19 != 0) {
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
                        nVar3 = nVar2;
                        z13 = z12;
                        j13 = j12;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-350627181, i12, -1, "androidx.compose.material3.Tab (Tab.kt:91)");
                    }
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> aVarB17 = pVar7 != null ? androidx.compose.runtime.internal.b.b(pVarF, 708874428, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$styledText$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar116, int i2110) {
                            if ((i2110 & 11) == 2 && pVar116.b()) {
                                pVar116.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(708874428, i2110, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:103)");
                            }
                            TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar116, 6), t0.o0.f140157a.B());
                            TextKt.a(textStyleA.b((262142 & 1) != 0 ? textStyleA.spanStyle.m() : 0L, (262142 & 2) != 0 ? textStyleA.spanStyle.getFontSize() : 0L, (262142 & 4) != 0 ? textStyleA.spanStyle.getFontWeight() : null, (262142 & 8) != 0 ? textStyleA.spanStyle.getFontStyle() : null, (262142 & 16) != 0 ? textStyleA.spanStyle.getFontSynthesis() : null, (262142 & 32) != 0 ? textStyleA.spanStyle.getFontFamily() : null, (262142 & 64) != 0 ? textStyleA.spanStyle.getFontFeatureSettings() : null, (262142 & 128) != 0 ? textStyleA.spanStyle.getLetterSpacing() : 0L, (262142 & 256) != 0 ? textStyleA.spanStyle.getBaselineShift() : null, (262142 & 512) != 0 ? textStyleA.spanStyle.getTextGeometricTransform() : null, (262142 & 1024) != 0 ? textStyleA.spanStyle.getLocaleList() : null, (262142 & 2048) != 0 ? textStyleA.spanStyle.getBackground() : 0L, (262142 & 4096) != 0 ? textStyleA.spanStyle.getTextDecoration() : null, (262142 & 8192) != 0 ? textStyleA.spanStyle.getShadow() : null, (262142 & 16384) != 0 ? textStyleA.paragraphStyle.getTextAlign() : androidx.compose.ui.text.style.h.g(androidx.compose.ui.text.style.h.INSTANCE.a()), (262142 & 32768) != 0 ? textStyleA.paragraphStyle.getTextDirection() : null, (262142 & 65536) != 0 ? textStyleA.paragraphStyle.getLineHeight() : 0L, (262142 & 131072) != 0 ? textStyleA.paragraphStyle.getTextIndent() : null), pVar7, pVar116, (i12 >> 9) & 112);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar116, Integer num) {
                            a(pVar116, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }) : null;
                    androidx.compose.runtime.internal.a aVarB18 = androidx.compose.runtime.internal.b.b(pVarF, 1540996038, true, new yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d androidx.compose.foundation.layout.o Tab, @dl.e androidx.compose.runtime.p pVar116, int i2110) {
                            kotlin.jvm.internal.f0.p(Tab, "$this$Tab");
                            if ((i2110 & 81) == 16 && pVar116.b()) {
                                pVar116.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1540996038, i2110, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:118)");
                            }
                            TabKt.d(aVarB17, pVar6, pVar116, (i12 >> 12) & 112);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.foundation.layout.o oVar, androidx.compose.runtime.p pVar116, Integer num) {
                            a(oVar, pVar116, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    int i2110 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc);
                    int i2111 = i12 >> 6;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar116 = pVar6;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar117 = pVar7;
                    b(z10, onClick, nVar3, z13, jM, j13, gVar2, aVarB18, pVarF, i2110 | (57344 & i2111) | (458752 & i2111) | (i2111 & 3670016), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar8 = pVar117;
                    nVar4 = nVar3;
                    pVar9 = pVar116;
                    z14 = z13;
                    j14 = jM;
                    j15 = j13;
                    gVar3 = gVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar118, int i2112) {
                        TabKt.c(z10, onClick, nVar4, z14, pVar8, pVar9, j14, j15, gVar3, pVar118, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar118, Integer num) {
                        a(pVar118, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i12 |= 24576;
            i17 = i11 & 32;
            if (i17 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                pVar4 = pVar2;
            } else {
                pVar4 = pVar2;
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(pVar4)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i22 = 524288;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            if ((i10 & 29360128) == 0) {
                j12 = j11;
                if ((i11 & 128) == 0) {
                    i21 = 4194304;
                } else {
                    i21 = 4194304;
                }
                i12 |= i21;
            } else {
                j12 = j11;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (pVarF.s(gVar)) {
                    i20 = 67108864;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i12 & 191739611) == 38347922) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i17 != 0) {
                        pVar4 = null;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        i12 &= -3670017;
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        j12 = jM;
                    }
                    if (i19 != 0) {
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
                    nVar3 = nVar2;
                    z13 = z12;
                    j13 = j12;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                } else {
                    if (i23 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i17 != 0) {
                        pVar4 = null;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        i12 &= -3670017;
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        j12 = jM;
                    }
                    if (i19 != 0) {
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
                    nVar3 = nVar2;
                    z13 = z12;
                    j13 = j12;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-350627181, i12, -1, "androidx.compose.material3.Tab (Tab.kt:91)");
                }
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> aVarB19 = pVar7 != null ? androidx.compose.runtime.internal.b.b(pVarF, 708874428, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$styledText$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar118, int i2112) {
                        if ((i2112 & 11) == 2 && pVar118.b()) {
                            pVar118.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(708874428, i2112, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:103)");
                        }
                        TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar118, 6), t0.o0.f140157a.B());
                        TextKt.a(textStyleA.b((262142 & 1) != 0 ? textStyleA.spanStyle.m() : 0L, (262142 & 2) != 0 ? textStyleA.spanStyle.getFontSize() : 0L, (262142 & 4) != 0 ? textStyleA.spanStyle.getFontWeight() : null, (262142 & 8) != 0 ? textStyleA.spanStyle.getFontStyle() : null, (262142 & 16) != 0 ? textStyleA.spanStyle.getFontSynthesis() : null, (262142 & 32) != 0 ? textStyleA.spanStyle.getFontFamily() : null, (262142 & 64) != 0 ? textStyleA.spanStyle.getFontFeatureSettings() : null, (262142 & 128) != 0 ? textStyleA.spanStyle.getLetterSpacing() : 0L, (262142 & 256) != 0 ? textStyleA.spanStyle.getBaselineShift() : null, (262142 & 512) != 0 ? textStyleA.spanStyle.getTextGeometricTransform() : null, (262142 & 1024) != 0 ? textStyleA.spanStyle.getLocaleList() : null, (262142 & 2048) != 0 ? textStyleA.spanStyle.getBackground() : 0L, (262142 & 4096) != 0 ? textStyleA.spanStyle.getTextDecoration() : null, (262142 & 8192) != 0 ? textStyleA.spanStyle.getShadow() : null, (262142 & 16384) != 0 ? textStyleA.paragraphStyle.getTextAlign() : androidx.compose.ui.text.style.h.g(androidx.compose.ui.text.style.h.INSTANCE.a()), (262142 & 32768) != 0 ? textStyleA.paragraphStyle.getTextDirection() : null, (262142 & 65536) != 0 ? textStyleA.paragraphStyle.getLineHeight() : 0L, (262142 & 131072) != 0 ? textStyleA.paragraphStyle.getTextIndent() : null), pVar7, pVar118, (i12 >> 9) & 112);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar118, Integer num) {
                        a(pVar118, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }) : null;
                androidx.compose.runtime.internal.a aVarB110 = androidx.compose.runtime.internal.b.b(pVarF, 1540996038, true, new yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.d androidx.compose.foundation.layout.o Tab, @dl.e androidx.compose.runtime.p pVar118, int i2112) {
                        kotlin.jvm.internal.f0.p(Tab, "$this$Tab");
                        if ((i2112 & 81) == 16 && pVar118.b()) {
                            pVar118.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1540996038, i2112, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:118)");
                        }
                        TabKt.d(aVarB19, pVar6, pVar118, (i12 >> 12) & 112);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.q
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.foundation.layout.o oVar, androidx.compose.runtime.p pVar118, Integer num) {
                        a(oVar, pVar118, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                int i2112 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc);
                int i2113 = i12 >> 6;
                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar118 = pVar6;
                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar119 = pVar7;
                b(z10, onClick, nVar3, z13, jM, j13, gVar2, aVarB110, pVarF, i2112 | (57344 & i2113) | (458752 & i2113) | (i2113 & 3670016), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar8 = pVar119;
                nVar4 = nVar3;
                pVar9 = pVar118;
                z14 = z13;
                j14 = jM;
                j15 = j13;
                gVar3 = gVar2;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i17 != 0) {
                        pVar4 = null;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        i12 &= -3670017;
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        j12 = jM;
                    }
                    if (i19 != 0) {
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
                    nVar3 = nVar2;
                    z13 = z12;
                    j13 = j12;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                } else {
                    if (i23 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i17 != 0) {
                        pVar4 = null;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        i12 &= -3670017;
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        j12 = jM;
                    }
                    if (i19 != 0) {
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
                    nVar3 = nVar2;
                    z13 = z12;
                    j13 = j12;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-350627181, i12, -1, "androidx.compose.material3.Tab (Tab.kt:91)");
                }
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> aVarB111 = pVar7 != null ? androidx.compose.runtime.internal.b.b(pVarF, 708874428, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$styledText$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar1110, int i2114) {
                        if ((i2114 & 11) == 2 && pVar1110.b()) {
                            pVar1110.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(708874428, i2114, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:103)");
                        }
                        TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar1110, 6), t0.o0.f140157a.B());
                        TextKt.a(textStyleA.b((262142 & 1) != 0 ? textStyleA.spanStyle.m() : 0L, (262142 & 2) != 0 ? textStyleA.spanStyle.getFontSize() : 0L, (262142 & 4) != 0 ? textStyleA.spanStyle.getFontWeight() : null, (262142 & 8) != 0 ? textStyleA.spanStyle.getFontStyle() : null, (262142 & 16) != 0 ? textStyleA.spanStyle.getFontSynthesis() : null, (262142 & 32) != 0 ? textStyleA.spanStyle.getFontFamily() : null, (262142 & 64) != 0 ? textStyleA.spanStyle.getFontFeatureSettings() : null, (262142 & 128) != 0 ? textStyleA.spanStyle.getLetterSpacing() : 0L, (262142 & 256) != 0 ? textStyleA.spanStyle.getBaselineShift() : null, (262142 & 512) != 0 ? textStyleA.spanStyle.getTextGeometricTransform() : null, (262142 & 1024) != 0 ? textStyleA.spanStyle.getLocaleList() : null, (262142 & 2048) != 0 ? textStyleA.spanStyle.getBackground() : 0L, (262142 & 4096) != 0 ? textStyleA.spanStyle.getTextDecoration() : null, (262142 & 8192) != 0 ? textStyleA.spanStyle.getShadow() : null, (262142 & 16384) != 0 ? textStyleA.paragraphStyle.getTextAlign() : androidx.compose.ui.text.style.h.g(androidx.compose.ui.text.style.h.INSTANCE.a()), (262142 & 32768) != 0 ? textStyleA.paragraphStyle.getTextDirection() : null, (262142 & 65536) != 0 ? textStyleA.paragraphStyle.getLineHeight() : 0L, (262142 & 131072) != 0 ? textStyleA.paragraphStyle.getTextIndent() : null), pVar7, pVar1110, (i12 >> 9) & 112);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1110, Integer num) {
                        a(pVar1110, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }) : null;
                androidx.compose.runtime.internal.a aVarB112 = androidx.compose.runtime.internal.b.b(pVarF, 1540996038, true, new yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.d androidx.compose.foundation.layout.o Tab, @dl.e androidx.compose.runtime.p pVar1110, int i2114) {
                        kotlin.jvm.internal.f0.p(Tab, "$this$Tab");
                        if ((i2114 & 81) == 16 && pVar1110.b()) {
                            pVar1110.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1540996038, i2114, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:118)");
                        }
                        TabKt.d(aVarB111, pVar6, pVar1110, (i12 >> 12) & 112);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.q
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.foundation.layout.o oVar, androidx.compose.runtime.p pVar1110, Integer num) {
                        a(oVar, pVar1110, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                int i2114 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc);
                int i2115 = i12 >> 6;
                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1110 = pVar6;
                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111 = pVar7;
                b(z10, onClick, nVar3, z13, jM, j13, gVar2, aVarB112, pVarF, i2114 | (57344 & i2115) | (458752 & i2115) | (i2115 & 3670016), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar8 = pVar1111;
                nVar4 = nVar3;
                pVar9 = pVar1110;
                z14 = z13;
                j14 = jM;
                j15 = j13;
                gVar3 = gVar2;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar1112, int i2116) {
                    TabKt.c(z10, onClick, nVar4, z14, pVar8, pVar9, j14, j15, gVar3, pVar1112, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1112, Integer num) {
                    a(pVar1112, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= bb.c.d.f31193dj;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((i10 & 57344) == 0) {
                if (pVarF.s(pVar)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            i17 = i11 & 32;
            if (i17 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                pVar4 = pVar2;
            } else {
                pVar4 = pVar2;
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(pVar4)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i22 = 524288;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            if ((i10 & 29360128) == 0) {
                j12 = j11;
                if ((i11 & 128) == 0) {
                    i21 = 4194304;
                } else {
                    i21 = 4194304;
                }
                i12 |= i21;
            } else {
                j12 = j11;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (pVarF.s(gVar)) {
                    i20 = 67108864;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i12 & 191739611) == 38347922) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i17 != 0) {
                        pVar4 = null;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        i12 &= -3670017;
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        j12 = jM;
                    }
                    if (i19 != 0) {
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
                    nVar3 = nVar2;
                    z13 = z12;
                    j13 = j12;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                } else {
                    if (i23 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i17 != 0) {
                        pVar4 = null;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        i12 &= -3670017;
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        j12 = jM;
                    }
                    if (i19 != 0) {
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
                    nVar3 = nVar2;
                    z13 = z12;
                    j13 = j12;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-350627181, i12, -1, "androidx.compose.material3.Tab (Tab.kt:91)");
                }
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> aVarB113 = pVar7 != null ? androidx.compose.runtime.internal.b.b(pVarF, 708874428, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$styledText$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar1112, int i2116) {
                        if ((i2116 & 11) == 2 && pVar1112.b()) {
                            pVar1112.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(708874428, i2116, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:103)");
                        }
                        TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar1112, 6), t0.o0.f140157a.B());
                        TextKt.a(textStyleA.b((262142 & 1) != 0 ? textStyleA.spanStyle.m() : 0L, (262142 & 2) != 0 ? textStyleA.spanStyle.getFontSize() : 0L, (262142 & 4) != 0 ? textStyleA.spanStyle.getFontWeight() : null, (262142 & 8) != 0 ? textStyleA.spanStyle.getFontStyle() : null, (262142 & 16) != 0 ? textStyleA.spanStyle.getFontSynthesis() : null, (262142 & 32) != 0 ? textStyleA.spanStyle.getFontFamily() : null, (262142 & 64) != 0 ? textStyleA.spanStyle.getFontFeatureSettings() : null, (262142 & 128) != 0 ? textStyleA.spanStyle.getLetterSpacing() : 0L, (262142 & 256) != 0 ? textStyleA.spanStyle.getBaselineShift() : null, (262142 & 512) != 0 ? textStyleA.spanStyle.getTextGeometricTransform() : null, (262142 & 1024) != 0 ? textStyleA.spanStyle.getLocaleList() : null, (262142 & 2048) != 0 ? textStyleA.spanStyle.getBackground() : 0L, (262142 & 4096) != 0 ? textStyleA.spanStyle.getTextDecoration() : null, (262142 & 8192) != 0 ? textStyleA.spanStyle.getShadow() : null, (262142 & 16384) != 0 ? textStyleA.paragraphStyle.getTextAlign() : androidx.compose.ui.text.style.h.g(androidx.compose.ui.text.style.h.INSTANCE.a()), (262142 & 32768) != 0 ? textStyleA.paragraphStyle.getTextDirection() : null, (262142 & 65536) != 0 ? textStyleA.paragraphStyle.getLineHeight() : 0L, (262142 & 131072) != 0 ? textStyleA.paragraphStyle.getTextIndent() : null), pVar7, pVar1112, (i12 >> 9) & 112);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1112, Integer num) {
                        a(pVar1112, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }) : null;
                androidx.compose.runtime.internal.a aVarB114 = androidx.compose.runtime.internal.b.b(pVarF, 1540996038, true, new yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.d androidx.compose.foundation.layout.o Tab, @dl.e androidx.compose.runtime.p pVar1112, int i2116) {
                        kotlin.jvm.internal.f0.p(Tab, "$this$Tab");
                        if ((i2116 & 81) == 16 && pVar1112.b()) {
                            pVar1112.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1540996038, i2116, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:118)");
                        }
                        TabKt.d(aVarB113, pVar6, pVar1112, (i12 >> 12) & 112);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.q
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.foundation.layout.o oVar, androidx.compose.runtime.p pVar1112, Integer num) {
                        a(oVar, pVar1112, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                int i2116 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc);
                int i2117 = i12 >> 6;
                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1112 = pVar6;
                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1113 = pVar7;
                b(z10, onClick, nVar3, z13, jM, j13, gVar2, aVarB114, pVarF, i2116 | (57344 & i2117) | (458752 & i2117) | (i2117 & 3670016), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar8 = pVar1113;
                nVar4 = nVar3;
                pVar9 = pVar1112;
                z14 = z13;
                j14 = jM;
                j15 = j13;
                gVar3 = gVar2;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i17 != 0) {
                        pVar4 = null;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        i12 &= -3670017;
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        j12 = jM;
                    }
                    if (i19 != 0) {
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
                    nVar3 = nVar2;
                    z13 = z12;
                    j13 = j12;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                } else {
                    if (i23 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i17 != 0) {
                        pVar4 = null;
                    }
                    if ((i11 & 64) != 0) {
                        jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                        i12 &= -3670017;
                    } else {
                        jM = j10;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        j12 = jM;
                    }
                    if (i19 != 0) {
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
                    nVar3 = nVar2;
                    z13 = z12;
                    j13 = j12;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-350627181, i12, -1, "androidx.compose.material3.Tab (Tab.kt:91)");
                }
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> aVarB115 = pVar7 != null ? androidx.compose.runtime.internal.b.b(pVarF, 708874428, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$styledText$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar1114, int i2118) {
                        if ((i2118 & 11) == 2 && pVar1114.b()) {
                            pVar1114.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(708874428, i2118, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:103)");
                        }
                        TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar1114, 6), t0.o0.f140157a.B());
                        TextKt.a(textStyleA.b((262142 & 1) != 0 ? textStyleA.spanStyle.m() : 0L, (262142 & 2) != 0 ? textStyleA.spanStyle.getFontSize() : 0L, (262142 & 4) != 0 ? textStyleA.spanStyle.getFontWeight() : null, (262142 & 8) != 0 ? textStyleA.spanStyle.getFontStyle() : null, (262142 & 16) != 0 ? textStyleA.spanStyle.getFontSynthesis() : null, (262142 & 32) != 0 ? textStyleA.spanStyle.getFontFamily() : null, (262142 & 64) != 0 ? textStyleA.spanStyle.getFontFeatureSettings() : null, (262142 & 128) != 0 ? textStyleA.spanStyle.getLetterSpacing() : 0L, (262142 & 256) != 0 ? textStyleA.spanStyle.getBaselineShift() : null, (262142 & 512) != 0 ? textStyleA.spanStyle.getTextGeometricTransform() : null, (262142 & 1024) != 0 ? textStyleA.spanStyle.getLocaleList() : null, (262142 & 2048) != 0 ? textStyleA.spanStyle.getBackground() : 0L, (262142 & 4096) != 0 ? textStyleA.spanStyle.getTextDecoration() : null, (262142 & 8192) != 0 ? textStyleA.spanStyle.getShadow() : null, (262142 & 16384) != 0 ? textStyleA.paragraphStyle.getTextAlign() : androidx.compose.ui.text.style.h.g(androidx.compose.ui.text.style.h.INSTANCE.a()), (262142 & 32768) != 0 ? textStyleA.paragraphStyle.getTextDirection() : null, (262142 & 65536) != 0 ? textStyleA.paragraphStyle.getLineHeight() : 0L, (262142 & 131072) != 0 ? textStyleA.paragraphStyle.getTextIndent() : null), pVar7, pVar1114, (i12 >> 9) & 112);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1114, Integer num) {
                        a(pVar1114, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }) : null;
                androidx.compose.runtime.internal.a aVarB116 = androidx.compose.runtime.internal.b.b(pVarF, 1540996038, true, new yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.d androidx.compose.foundation.layout.o Tab, @dl.e androidx.compose.runtime.p pVar1114, int i2118) {
                        kotlin.jvm.internal.f0.p(Tab, "$this$Tab");
                        if ((i2118 & 81) == 16 && pVar1114.b()) {
                            pVar1114.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1540996038, i2118, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:118)");
                        }
                        TabKt.d(aVarB115, pVar6, pVar1114, (i12 >> 12) & 112);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.q
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.foundation.layout.o oVar, androidx.compose.runtime.p pVar1114, Integer num) {
                        a(oVar, pVar1114, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                int i2118 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc);
                int i2119 = i12 >> 6;
                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1114 = pVar6;
                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1115 = pVar7;
                b(z10, onClick, nVar3, z13, jM, j13, gVar2, aVarB116, pVarF, i2118 | (57344 & i2119) | (458752 & i2119) | (i2119 & 3670016), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar8 = pVar1115;
                nVar4 = nVar3;
                pVar9 = pVar1114;
                z14 = z13;
                j14 = jM;
                j15 = j13;
                gVar3 = gVar2;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar1116, int i21110) {
                    TabKt.c(z10, onClick, nVar4, z14, pVar8, pVar9, j14, j15, gVar3, pVar1116, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1116, Integer num) {
                    a(pVar1116, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= 24576;
        i17 = i11 & 32;
        if (i17 != 0) {
            i12 |= androidx.profileinstaller.o.c.f26824k;
            pVar4 = pVar2;
        } else {
            pVar4 = pVar2;
            if ((i10 & 458752) == 0) {
                if (pVarF.s(pVar4)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
        }
        if ((i10 & 3670016) != 0) {
            if ((i11 & 64) == 0) {
                i22 = 524288;
            } else {
                i22 = 524288;
            }
            i12 |= i22;
        }
        if ((i10 & 29360128) == 0) {
            j12 = j11;
            if ((i11 & 128) == 0) {
                i21 = 4194304;
            } else {
                i21 = 4194304;
            }
            i12 |= i21;
        } else {
            j12 = j11;
        }
        i19 = i11 & 256;
        if (i19 != 0) {
            i12 |= 100663296;
        } else if ((i10 & 234881024) == 0) {
            if (pVarF.s(gVar)) {
                i20 = 67108864;
            } else {
                i20 = 33554432;
            }
            i12 |= i20;
        }
        if ((i12 & 191739611) == 38347922) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i23 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i15 != 0) {
                    pVar5 = null;
                } else {
                    pVar5 = pVar;
                }
                if (i17 != 0) {
                    pVar4 = null;
                }
                if ((i11 & 64) != 0) {
                    jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    i12 &= -3670017;
                } else {
                    jM = j10;
                }
                if ((i11 & 128) != 0) {
                    i12 &= -29360129;
                    j12 = jM;
                }
                if (i19 != 0) {
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
                nVar3 = nVar2;
                z13 = z12;
                j13 = j12;
                pVar6 = pVar4;
                pVar7 = pVar5;
            } else {
                if (i23 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i15 != 0) {
                    pVar5 = null;
                } else {
                    pVar5 = pVar;
                }
                if (i17 != 0) {
                    pVar4 = null;
                }
                if ((i11 & 64) != 0) {
                    jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    i12 &= -3670017;
                } else {
                    jM = j10;
                }
                if ((i11 & 128) != 0) {
                    i12 &= -29360129;
                    j12 = jM;
                }
                if (i19 != 0) {
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
                nVar3 = nVar2;
                z13 = z12;
                j13 = j12;
                pVar6 = pVar4;
                pVar7 = pVar5;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-350627181, i12, -1, "androidx.compose.material3.Tab (Tab.kt:91)");
            }
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> aVarB117 = pVar7 != null ? androidx.compose.runtime.internal.b.b(pVarF, 708874428, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$styledText$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar1116, int i21110) {
                    if ((i21110 & 11) == 2 && pVar1116.b()) {
                        pVar1116.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(708874428, i21110, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:103)");
                    }
                    TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar1116, 6), t0.o0.f140157a.B());
                    TextKt.a(textStyleA.b((262142 & 1) != 0 ? textStyleA.spanStyle.m() : 0L, (262142 & 2) != 0 ? textStyleA.spanStyle.getFontSize() : 0L, (262142 & 4) != 0 ? textStyleA.spanStyle.getFontWeight() : null, (262142 & 8) != 0 ? textStyleA.spanStyle.getFontStyle() : null, (262142 & 16) != 0 ? textStyleA.spanStyle.getFontSynthesis() : null, (262142 & 32) != 0 ? textStyleA.spanStyle.getFontFamily() : null, (262142 & 64) != 0 ? textStyleA.spanStyle.getFontFeatureSettings() : null, (262142 & 128) != 0 ? textStyleA.spanStyle.getLetterSpacing() : 0L, (262142 & 256) != 0 ? textStyleA.spanStyle.getBaselineShift() : null, (262142 & 512) != 0 ? textStyleA.spanStyle.getTextGeometricTransform() : null, (262142 & 1024) != 0 ? textStyleA.spanStyle.getLocaleList() : null, (262142 & 2048) != 0 ? textStyleA.spanStyle.getBackground() : 0L, (262142 & 4096) != 0 ? textStyleA.spanStyle.getTextDecoration() : null, (262142 & 8192) != 0 ? textStyleA.spanStyle.getShadow() : null, (262142 & 16384) != 0 ? textStyleA.paragraphStyle.getTextAlign() : androidx.compose.ui.text.style.h.g(androidx.compose.ui.text.style.h.INSTANCE.a()), (262142 & 32768) != 0 ? textStyleA.paragraphStyle.getTextDirection() : null, (262142 & 65536) != 0 ? textStyleA.paragraphStyle.getLineHeight() : 0L, (262142 & 131072) != 0 ? textStyleA.paragraphStyle.getTextIndent() : null), pVar7, pVar1116, (i12 >> 9) & 112);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1116, Integer num) {
                    a(pVar1116, num.intValue());
                    return kotlin.b2.f124493a;
                }
            }) : null;
            androidx.compose.runtime.internal.a aVarB118 = androidx.compose.runtime.internal.b.b(pVarF, 1540996038, true, new yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.d androidx.compose.foundation.layout.o Tab, @dl.e androidx.compose.runtime.p pVar1116, int i21110) {
                    kotlin.jvm.internal.f0.p(Tab, "$this$Tab");
                    if ((i21110 & 81) == 16 && pVar1116.b()) {
                        pVar1116.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1540996038, i21110, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:118)");
                    }
                    TabKt.d(aVarB117, pVar6, pVar1116, (i12 >> 12) & 112);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.foundation.layout.o oVar, androidx.compose.runtime.p pVar1116, Integer num) {
                    a(oVar, pVar1116, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
            int i21110 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc);
            int i21111 = i12 >> 6;
            yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1116 = pVar6;
            yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1117 = pVar7;
            b(z10, onClick, nVar3, z13, jM, j13, gVar2, aVarB118, pVarF, i21110 | (57344 & i21111) | (458752 & i21111) | (i21111 & 3670016), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVar8 = pVar1117;
            nVar4 = nVar3;
            pVar9 = pVar1116;
            z14 = z13;
            j14 = jM;
            j15 = j13;
            gVar3 = gVar2;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i23 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i15 != 0) {
                    pVar5 = null;
                } else {
                    pVar5 = pVar;
                }
                if (i17 != 0) {
                    pVar4 = null;
                }
                if ((i11 & 64) != 0) {
                    jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    i12 &= -3670017;
                } else {
                    jM = j10;
                }
                if ((i11 & 128) != 0) {
                    i12 &= -29360129;
                    j12 = jM;
                }
                if (i19 != 0) {
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
                nVar3 = nVar2;
                z13 = z12;
                j13 = j12;
                pVar6 = pVar4;
                pVar7 = pVar5;
            } else {
                if (i23 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i15 != 0) {
                    pVar5 = null;
                } else {
                    pVar5 = pVar;
                }
                if (i17 != 0) {
                    pVar4 = null;
                }
                if ((i11 & 64) != 0) {
                    jM = ((androidx.compose.ui.graphics.l0) pVarF.K(ContentColorKt.a())).M();
                    i12 &= -3670017;
                } else {
                    jM = j10;
                }
                if ((i11 & 128) != 0) {
                    i12 &= -29360129;
                    j12 = jM;
                }
                if (i19 != 0) {
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
                nVar3 = nVar2;
                z13 = z12;
                j13 = j12;
                pVar6 = pVar4;
                pVar7 = pVar5;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-350627181, i12, -1, "androidx.compose.material3.Tab (Tab.kt:91)");
            }
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> aVarB119 = pVar7 != null ? androidx.compose.runtime.internal.b.b(pVarF, 708874428, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$styledText$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar1118, int i21112) {
                    if ((i21112 & 11) == 2 && pVar1118.b()) {
                        pVar1118.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(708874428, i21112, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:103)");
                    }
                    TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar1118, 6), t0.o0.f140157a.B());
                    TextKt.a(textStyleA.b((262142 & 1) != 0 ? textStyleA.spanStyle.m() : 0L, (262142 & 2) != 0 ? textStyleA.spanStyle.getFontSize() : 0L, (262142 & 4) != 0 ? textStyleA.spanStyle.getFontWeight() : null, (262142 & 8) != 0 ? textStyleA.spanStyle.getFontStyle() : null, (262142 & 16) != 0 ? textStyleA.spanStyle.getFontSynthesis() : null, (262142 & 32) != 0 ? textStyleA.spanStyle.getFontFamily() : null, (262142 & 64) != 0 ? textStyleA.spanStyle.getFontFeatureSettings() : null, (262142 & 128) != 0 ? textStyleA.spanStyle.getLetterSpacing() : 0L, (262142 & 256) != 0 ? textStyleA.spanStyle.getBaselineShift() : null, (262142 & 512) != 0 ? textStyleA.spanStyle.getTextGeometricTransform() : null, (262142 & 1024) != 0 ? textStyleA.spanStyle.getLocaleList() : null, (262142 & 2048) != 0 ? textStyleA.spanStyle.getBackground() : 0L, (262142 & 4096) != 0 ? textStyleA.spanStyle.getTextDecoration() : null, (262142 & 8192) != 0 ? textStyleA.spanStyle.getShadow() : null, (262142 & 16384) != 0 ? textStyleA.paragraphStyle.getTextAlign() : androidx.compose.ui.text.style.h.g(androidx.compose.ui.text.style.h.INSTANCE.a()), (262142 & 32768) != 0 ? textStyleA.paragraphStyle.getTextDirection() : null, (262142 & 65536) != 0 ? textStyleA.paragraphStyle.getLineHeight() : 0L, (262142 & 131072) != 0 ? textStyleA.paragraphStyle.getTextIndent() : null), pVar7, pVar1118, (i12 >> 9) & 112);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1118, Integer num) {
                    a(pVar1118, num.intValue());
                    return kotlin.b2.f124493a;
                }
            }) : null;
            androidx.compose.runtime.internal.a aVarB1110 = androidx.compose.runtime.internal.b.b(pVarF, 1540996038, true, new yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.d androidx.compose.foundation.layout.o Tab, @dl.e androidx.compose.runtime.p pVar1118, int i21112) {
                    kotlin.jvm.internal.f0.p(Tab, "$this$Tab");
                    if ((i21112 & 81) == 16 && pVar1118.b()) {
                        pVar1118.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1540996038, i21112, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:118)");
                    }
                    TabKt.d(aVarB119, pVar6, pVar1118, (i12 >> 12) & 112);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.foundation.layout.o oVar, androidx.compose.runtime.p pVar1118, Integer num) {
                    a(oVar, pVar1118, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
            int i21112 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc);
            int i21113 = i12 >> 6;
            yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1118 = pVar6;
            yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1119 = pVar7;
            b(z10, onClick, nVar3, z13, jM, j13, gVar2, aVarB1110, pVarF, i21112 | (57344 & i21113) | (458752 & i21113) | (i21113 & 3670016), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVar8 = pVar1119;
            nVar4 = nVar3;
            pVar9 = pVar1118;
            z14 = z13;
            j14 = jM;
            j15 = j13;
            gVar3 = gVar2;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$Tab$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar11110, int i21114) {
                TabKt.c(z10, onClick, nVar4, z14, pVar8, pVar9, j14, j15, gVar3, pVar11110, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11110, Integer num) {
                a(pVar11110, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void d(final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar, final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar2, androidx.compose.runtime.p pVar3, final int i10) {
        int i11;
        androidx.compose.runtime.p pVarF = pVar3.F(514131524);
        if ((i10 & 14) == 0) {
            i11 = (pVarF.s(pVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= pVarF.s(pVar2) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(514131524, i11, -1, "androidx.compose.material3.TabBaselineLayout (Tab.kt:302)");
            }
            androidx.compose.ui.layout.i0 i0Var = new androidx.compose.ui.layout.i0() { // from class: androidx.compose.material3.TabKt$TabBaselineLayout$2
                @Override // androidx.compose.ui.layout.i0
                @dl.d
                public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.l0 Layout, @dl.d List<? extends androidx.compose.ui.layout.g0> measurables, long j10) {
                    androidx.compose.ui.layout.e1 e1VarZ1;
                    final androidx.compose.ui.layout.e1 e1VarZ2;
                    androidx.compose.ui.layout.g0 g0Var;
                    androidx.compose.ui.layout.g0 g0Var2;
                    kotlin.jvm.internal.f0.p(Layout, "$this$Layout");
                    kotlin.jvm.internal.f0.p(measurables, "measurables");
                    if (pVar != null) {
                        Iterator<T> it = measurables.iterator();
                        do {
                            if (!it.hasNext()) {
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            g0Var2 = (androidx.compose.ui.layout.g0) it.next();
                        } while (!kotlin.jvm.internal.f0.g(LayoutIdKt.a(g0Var2), "text"));
                        e1VarZ1 = g0Var2.z1(s1.b.e(j10, 0, 0, 0, 0, 11, null));
                    } else {
                        e1VarZ1 = null;
                    }
                    if (pVar2 != null) {
                        Iterator<T> it2 = measurables.iterator();
                        do {
                            if (!it2.hasNext()) {
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            g0Var = (androidx.compose.ui.layout.g0) it2.next();
                        } while (!kotlin.jvm.internal.f0.g(LayoutIdKt.a(g0Var), "icon"));
                        e1VarZ2 = g0Var.z1(j10);
                    } else {
                        e1VarZ2 = null;
                    }
                    final int iMax = Math.max(e1VarZ1 != null ? e1VarZ1.getWidth() : 0, e1VarZ2 != null ? e1VarZ2.getWidth() : 0);
                    final int iMax2 = Math.max(Layout.e1((e1VarZ1 == null || e1VarZ2 == null) ? TabKt.f11163a : TabKt.f11164b), (e1VarZ2 != null ? e1VarZ2.getHeight() : 0) + (e1VarZ1 != null ? e1VarZ1.getHeight() : 0) + Layout.J1(TabKt.f11171i));
                    final Integer numValueOf = e1VarZ1 != null ? Integer.valueOf(e1VarZ1.v(AlignmentLineKt.a())) : null;
                    final Integer numValueOf2 = e1VarZ1 != null ? Integer.valueOf(e1VarZ1.v(AlignmentLineKt.b())) : null;
                    final androidx.compose.ui.layout.e1 e1Var = e1VarZ1;
                    return androidx.compose.ui.layout.k0.p(Layout, iMax, iMax2, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$TabBaselineLayout$2$measure$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                            androidx.compose.ui.layout.e1 e1Var2;
                            kotlin.jvm.internal.f0.p(layout, "$this$layout");
                            androidx.compose.ui.layout.e1 e1Var3 = e1Var;
                            if (e1Var3 == null || (e1Var2 = e1VarZ2) == null) {
                                if (e1Var3 != null) {
                                    TabKt.q(layout, e1Var3, iMax2);
                                    return;
                                }
                                androidx.compose.ui.layout.e1 e1Var4 = e1VarZ2;
                                if (e1Var4 != null) {
                                    TabKt.q(layout, e1Var4, iMax2);
                                    return;
                                }
                                return;
                            }
                            androidx.compose.ui.layout.l0 l0Var = Layout;
                            int i12 = iMax;
                            int i13 = iMax2;
                            Integer num = numValueOf;
                            kotlin.jvm.internal.f0.m(num);
                            int iIntValue = num.intValue();
                            Integer num2 = numValueOf2;
                            kotlin.jvm.internal.f0.m(num2);
                            TabKt.p(layout, l0Var, e1Var3, e1Var2, i12, i13, iIntValue, num2.intValue());
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                            a(aVar);
                            return kotlin.b2.f124493a;
                        }
                    }, 4, null);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int b(androidx.compose.ui.layout.n nVar, List list, int i12) {
                    return androidx.compose.ui.layout.h0.c(this, nVar, list, i12);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int c(androidx.compose.ui.layout.n nVar, List list, int i12) {
                    return androidx.compose.ui.layout.h0.d(this, nVar, list, i12);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int d(androidx.compose.ui.layout.n nVar, List list, int i12) {
                    return androidx.compose.ui.layout.h0.a(this, nVar, list, i12);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int e(androidx.compose.ui.layout.n nVar, List list, int i12) {
                    return androidx.compose.ui.layout.h0.b(this, nVar, list, i12);
                }
            };
            pVarF.T(-1323940314);
            androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
            s1.e eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            yh.a<ComposeUiNode> aVarA = companion2.a();
            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(companion);
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
            Updater.j(pVarB, i0Var, companion2.d());
            Updater.j(pVarB, eVar, companion2.b());
            Updater.j(pVarB, layoutDirection, companion2.c());
            Updater.j(pVarB, d2Var, companion2.f());
            pVarF.x();
            qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
            pVarF.T(2058660585);
            pVarF.T(1480471867);
            pVarF.T(720850841);
            if (pVar != null) {
                androidx.compose.ui.n nVarM = PaddingKt.m(LayoutIdKt.b(companion, "text"), f11168f, 0.0f, 2, null);
                pVarF.T(733328855);
                androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVarF, 0);
                pVarF.T(-1323940314);
                s1.e eVar2 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection2 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                androidx.compose.ui.platform.d2 d2Var2 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                yh.a<ComposeUiNode> aVarA2 = companion2.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF2 = LayoutKt.f(nVarM);
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
                Updater.j(pVarB2, i0VarK, companion2.d());
                Updater.j(pVarB2, eVar2, companion2.b());
                Updater.j(pVarB2, layoutDirection2, companion2.c());
                Updater.j(pVarB2, d2Var2, companion2.f());
                pVarF.x();
                qVarF2.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                pVarF.T(2058660585);
                pVarF.T(-2137368960);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
                pVarF.T(-947514212);
                pVar.invoke(pVarF, Integer.valueOf(i11 & 14));
                pVarF.c0();
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
            }
            pVarF.c0();
            if (pVar2 != null) {
                androidx.compose.ui.n nVarB = LayoutIdKt.b(companion, "icon");
                pVarF.T(733328855);
                androidx.compose.ui.layout.i0 i0VarK2 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVarF, 0);
                pVarF.T(-1323940314);
                s1.e eVar3 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection3 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                androidx.compose.ui.platform.d2 d2Var3 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                yh.a<ComposeUiNode> aVarA3 = companion2.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF3 = LayoutKt.f(nVarB);
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
                Updater.j(pVarB3, i0VarK2, companion2.d());
                Updater.j(pVarB3, eVar3, companion2.b());
                Updater.j(pVarB3, layoutDirection3, companion2.c());
                Updater.j(pVarB3, d2Var3, companion2.f());
                pVarF.x();
                qVarF3.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                pVarF.T(2058660585);
                pVarF.T(-2137368960);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f5954a;
                pVarF.T(-1983967725);
                pVar2.invoke(pVarF, Integer.valueOf((i11 >> 3) & 14));
                pVarF.c0();
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
        androidx.compose.runtime.u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$TabBaselineLayout$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar4, int i12) {
                TabKt.d(pVar, pVar2, pVar4, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar4, Integer num) {
                a(pVar4, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.i(scheme = "[0[0]]")
    @androidx.compose.runtime.h
    public static final void e(final long j10, final long j11, final boolean z10, final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar, androidx.compose.runtime.p pVar2, final int i10) {
        int i11;
        androidx.compose.runtime.p pVarF = pVar2.F(735731848);
        if ((i10 & 14) == 0) {
            i11 = (pVarF.z(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= pVarF.z(j11) ? 32 : 16;
        }
        if ((i10 & bb.c.b.f30796me) == 0) {
            i11 |= pVarF.u(z10) ? 256 : 128;
        }
        if ((i10 & bb.c.g.f32954lc) == 0) {
            i11 |= pVarF.s(pVar) ? 2048 : 1024;
        }
        if ((i11 & bb.c.f.br) == 1170 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(735731848, i11, -1, "androidx.compose.material3.TabTransition (Tab.kt:265)");
            }
            int i12 = i11 >> 6;
            Transition transitionO = TransitionKt.o(Boolean.valueOf(z10), null, pVarF, i12 & 14, 2);
            TabKt$TabTransition$color$2 tabKt$TabTransition$color$2 = new yh.q<Transition.b<Boolean>, androidx.compose.runtime.p, Integer, androidx.compose.animation.core.f0<androidx.compose.ui.graphics.l0>>() { // from class: androidx.compose.material3.TabKt$TabTransition$color$2
                @dl.d
                @androidx.compose.runtime.h
                public final androidx.compose.animation.core.f0<androidx.compose.ui.graphics.l0> a(@dl.d Transition.b<Boolean> animateColor, @dl.e androidx.compose.runtime.p pVar3, int i13) {
                    kotlin.jvm.internal.f0.p(animateColor, "$this$animateColor");
                    pVar3.T(-899623535);
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-899623535, i13, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:273)");
                    }
                    androidx.compose.animation.core.e1 e1VarP = animateColor.b(Boolean.FALSE, Boolean.TRUE) ? androidx.compose.animation.core.i.p(150, 100, androidx.compose.animation.core.d0.c()) : androidx.compose.animation.core.i.q(100, 0, androidx.compose.animation.core.d0.c(), 2, null);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar3.c0();
                    return e1VarP;
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ androidx.compose.animation.core.f0<androidx.compose.ui.graphics.l0> invoke(Transition.b<Boolean> bVar, androidx.compose.runtime.p pVar3, Integer num) {
                    return a(bVar, pVar3, num.intValue());
                }
            };
            pVarF.T(-1462136984);
            boolean zBooleanValue = ((Boolean) transitionO.o()).booleanValue();
            pVarF.T(-1997025499);
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1997025499, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:287)");
            }
            long j12 = zBooleanValue ? j10 : j11;
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVarF.c0();
            androidx.compose.ui.graphics.colorspace.c cVarE = androidx.compose.ui.graphics.l0.E(j12);
            pVarF.T(-3686930);
            boolean zS = pVarF.s(cVarE);
            Object objU = pVarF.U();
            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                objU = (androidx.compose.animation.core.f1) ColorVectorConverterKt.d(androidx.compose.ui.graphics.l0.INSTANCE).invoke(cVarE);
                pVarF.N(objU);
            }
            pVarF.c0();
            androidx.compose.animation.core.f1 f1Var = (androidx.compose.animation.core.f1) objU;
            pVarF.T(1847725064);
            boolean zBooleanValue2 = ((Boolean) transitionO.h()).booleanValue();
            pVarF.T(-1997025499);
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1997025499, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:287)");
            }
            long j13 = zBooleanValue2 ? j10 : j11;
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVarF.c0();
            androidx.compose.ui.graphics.l0 l0VarN = androidx.compose.ui.graphics.l0.n(j13);
            boolean zBooleanValue3 = ((Boolean) transitionO.o()).booleanValue();
            pVarF.T(-1997025499);
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1997025499, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:287)");
            }
            long j14 = zBooleanValue3 ? j10 : j11;
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVarF.c0();
            m2 m2VarM = TransitionKt.m(transitionO, l0VarN, androidx.compose.ui.graphics.l0.n(j14), tabKt$TabTransition$color$2.invoke(transitionO.m(), pVarF, 0), f1Var, "ColorAnimation", pVarF, 32768);
            pVarF.c0();
            pVarF.c0();
            CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(f(m2VarM)))}, pVar, pVarF, (i12 & 112) | 8);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        androidx.compose.runtime.u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabKt$TabTransition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar3, int i13) {
                TabKt.e(j10, j11, z10, pVar, pVar3, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                a(pVar3, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    private static final long f(m2<androidx.compose.ui.graphics.l0> m2Var) {
        return m2Var.getValue().M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(androidx.compose.ui.layout.e1.a aVar, s1.e eVar, androidx.compose.ui.layout.e1 e1Var, androidx.compose.ui.layout.e1 e1Var2, int i10, int i11, int i12, int i13) {
        int iE1 = eVar.e1(i12 == i13 ? f11169g : f11170h) + eVar.e1(t0.o0.f140157a.g());
        int height = (e1Var2.getHeight() + eVar.J1(f11171i)) - i12;
        int i14 = (i11 - i13) - iE1;
        androidx.compose.ui.layout.e1.a.v(aVar, e1Var, (i10 - e1Var.getWidth()) / 2, i14, 0.0f, 4, null);
        androidx.compose.ui.layout.e1.a.v(aVar, e1Var2, (i10 - e1Var2.getWidth()) / 2, i14 - height, 0.0f, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(androidx.compose.ui.layout.e1.a aVar, androidx.compose.ui.layout.e1 e1Var, int i10) {
        androidx.compose.ui.layout.e1.a.v(aVar, e1Var, 0, (i10 - e1Var.getHeight()) / 2, 0.0f, 4, null);
    }
}
