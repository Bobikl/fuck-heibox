package androidx.compose.material3;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.g2;
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

/* JADX INFO: compiled from: Snackbar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u009c\u0001\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0015\b\u0002\u0010\u0005\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001am\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001ah\u0010\u001b\u001a\u00020\u00032\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0013\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001aj\u0010\u001f\u001a\u00020\u00032\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0013\u0010\u0005\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0013\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u001c\"\u0017\u0010\"\u001a\u00020 8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001b\u0010!\"\u0017\u0010#\u001a\u00020 8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u0010!\"\u0017\u0010$\u001a\u00020 8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0011\u0010!\"\u0017\u0010%\u001a\u00020 8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0016\u0010!\"\u0017\u0010'\u001a\u00020 8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b&\u0010!\"\u0017\u0010)\u001a\u00020 8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b(\u0010!\"\u0017\u0010+\u001a\u00020 8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b*\u0010!\"\u0017\u0010-\u001a\u00020 8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b,\u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006."}, d2 = {"Landroidx/compose/ui/n;", "modifier", "Lkotlin/Function0;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "action", "dismissAction", "", "actionOnNewLine", "Landroidx/compose/ui/graphics/g2;", "shape", "Landroidx/compose/ui/graphics/l0;", "containerColor", "contentColor", "actionContentColor", "dismissActionContentColor", "content", ak.aF, "(Landroidx/compose/ui/n;Lyh/p;Lyh/p;ZLandroidx/compose/ui/graphics/g2;JJJJLyh/p;Landroidx/compose/runtime/p;II)V", "Landroidx/compose/material3/l1;", "snackbarData", "actionColor", "d", "(Landroidx/compose/material3/l1;Landroidx/compose/ui/n;ZLandroidx/compose/ui/graphics/g2;JJJJJLandroidx/compose/runtime/p;II)V", "text", "Landroidx/compose/ui/text/q0;", "actionTextStyle", ak.av, "(Lyh/p;Lyh/p;Lyh/p;Landroidx/compose/ui/text/q0;JJLandroidx/compose/runtime/p;I)V", "actionTextColor", "dismissActionColor", "b", "Ls1/h;", "F", "ContainerMaxWidth", "HeightToFirstLine", "HorizontalSpacing", "HorizontalSpacingButtonSide", "e", "SeparateButtonExtraY", "f", "SnackbarVerticalPadding", "g", "TextEndExtraSpacing", RXScreenCaptureService.KEY_HEIGHT, "LongButtonVerticalOffset", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class SnackbarKt {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f10874d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f10877g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f10871a = s1.h.g(600);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f10872b = s1.h.g(30);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f10873c = s1.h.g(16);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f10875e = s1.h.g(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f10876f = s1.h.g(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f10878h = s1.h.g(12);

    static {
        float f10 = 8;
        f10874d = s1.h.g(f10);
        f10877g = s1.h.g(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void a(final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar, final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar2, final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar3, final TextStyle textStyle, final long j10, final long j11, androidx.compose.runtime.p pVar4, final int i10) {
        int i11;
        androidx.compose.runtime.p pVarF = pVar4.F(-1332496681);
        if ((i10 & 14) == 0) {
            i11 = (pVarF.s(pVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= pVarF.s(pVar2) ? 32 : 16;
        }
        if ((i10 & bb.c.b.f30796me) == 0) {
            i11 |= pVarF.s(pVar3) ? 256 : 128;
        }
        if ((i10 & bb.c.g.f32954lc) == 0) {
            i11 |= pVarF.s(textStyle) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= pVarF.z(j10) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= pVarF.z(j11) ? 131072 : 65536;
        }
        if ((374491 & i11) == 74898 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1332496681, i11, -1, "androidx.compose.material3.NewLineButtonSnackbar (Snackbar.kt:248)");
            }
            androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
            androidx.compose.ui.n nVarO = PaddingKt.o(SizeKt.n(SizeKt.J(companion, 0.0f, f10871a, 1, null), 0.0f, 1, null), f10873c, 0.0f, 0.0f, f10875e, 6, null);
            pVarF.T(-483455358);
            Arrangement arrangement = Arrangement.f5896a;
            Arrangement.l lVarR = arrangement.r();
            androidx.compose.ui.c.Companion companion2 = androidx.compose.ui.c.INSTANCE;
            androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(lVarR, companion2.u(), pVarF, 0);
            pVarF.T(-1323940314);
            s1.e eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            yh.a<ComposeUiNode> aVarA = companion3.a();
            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarO);
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
            Updater.j(pVarB, i0VarB, companion3.d());
            Updater.j(pVarB, eVar, companion3.b());
            Updater.j(pVarB, layoutDirection, companion3.c());
            Updater.j(pVarB, d2Var, companion3.f());
            pVarF.x();
            qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
            pVarF.T(2058660585);
            pVarF.T(-1163856341);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f5971a;
            pVarF.T(-363148767);
            androidx.compose.ui.n nVarI = AlignmentLineKt.i(companion, f10872b, f10878h);
            float f10 = f10874d;
            androidx.compose.ui.n nVarO2 = PaddingKt.o(nVarI, 0.0f, 0.0f, f10, 0.0f, 11, null);
            pVarF.T(733328855);
            androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(companion2.C(), false, pVarF, 0);
            pVarF.T(-1323940314);
            s1.e eVar2 = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection2 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            androidx.compose.ui.platform.d2 d2Var2 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
            yh.a<ComposeUiNode> aVarA2 = companion3.a();
            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF2 = LayoutKt.f(nVarO2);
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
            Updater.j(pVarB2, i0VarK, companion3.d());
            Updater.j(pVarB2, eVar2, companion3.b());
            Updater.j(pVarB2, layoutDirection2, companion3.c());
            Updater.j(pVarB2, d2Var2, companion3.f());
            pVarF.x();
            qVarF2.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
            pVarF.T(2058660585);
            pVarF.T(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
            pVarF.T(74621659);
            pVar.invoke(pVarF, Integer.valueOf(i11 & 14));
            pVarF.c0();
            pVarF.c0();
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            pVarF.c0();
            androidx.compose.ui.n nVarO3 = PaddingKt.o(columnScopeInstance.d(companion, companion2.s()), 0.0f, 0.0f, pVar3 == null ? f10 : s1.h.g(0), 0.0f, 11, null);
            pVarF.T(733328855);
            androidx.compose.ui.layout.i0 i0VarK2 = BoxKt.k(companion2.C(), false, pVarF, 0);
            pVarF.T(-1323940314);
            s1.e eVar3 = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection3 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            androidx.compose.ui.platform.d2 d2Var3 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
            yh.a<ComposeUiNode> aVarA3 = companion3.a();
            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF3 = LayoutKt.f(nVarO3);
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
            Updater.j(pVarB3, i0VarK2, companion3.d());
            Updater.j(pVarB3, eVar3, companion3.b());
            Updater.j(pVarB3, layoutDirection3, companion3.c());
            Updater.j(pVarB3, d2Var3, companion3.f());
            pVarF.x();
            qVarF3.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
            pVarF.T(2058660585);
            pVarF.T(-2137368960);
            pVarF.T(1640608516);
            pVarF.T(693286680);
            androidx.compose.ui.layout.i0 i0VarD = RowKt.d(arrangement.p(), companion2.w(), pVarF, 0);
            pVarF.T(-1323940314);
            s1.e eVar4 = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection4 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            androidx.compose.ui.platform.d2 d2Var4 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
            yh.a<ComposeUiNode> aVarA4 = companion3.a();
            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF4 = LayoutKt.f(companion);
            if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                ComposablesKt.n();
            }
            pVarF.h();
            if (pVarF.getInserting()) {
                pVarF.L(aVarA4);
            } else {
                pVarF.d();
            }
            pVarF.Y();
            androidx.compose.runtime.p pVarB4 = Updater.b(pVarF);
            Updater.j(pVarB4, i0VarD, companion3.d());
            Updater.j(pVarB4, eVar4, companion3.b());
            Updater.j(pVarB4, layoutDirection4, companion3.c());
            Updater.j(pVarB4, d2Var4, companion3.f());
            pVarF.x();
            qVarF4.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
            pVarF.T(2058660585);
            pVarF.T(-678309503);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6091a;
            pVarF.T(-1595822816);
            CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(j10)), TextKt.d().f(textStyle)}, pVar2, pVarF, (i11 & 112) | 8);
            if (pVar3 != null) {
                CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(j11))}, pVar3, pVarF, ((i11 >> 3) & 112) | 8);
            }
            pVarF.c0();
            pVarF.c0();
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            pVarF.c0();
            pVarF.c0();
            pVarF.c0();
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            pVarF.c0();
            pVarF.c0();
            pVarF.c0();
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            pVarF.c0();
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        androidx.compose.runtime.u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$NewLineButtonSnackbar$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar5, int i12) {
                SnackbarKt.a(pVar, pVar2, pVar3, textStyle, j10, j11, pVar5, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar5, Integer num) {
                a(pVar5, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void b(final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar, final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar2, final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar3, final TextStyle textStyle, final long j10, final long j11, androidx.compose.runtime.p pVar4, final int i10) {
        int i11;
        androidx.compose.runtime.p pVarF = pVar4.F(-903235475);
        if ((i10 & 14) == 0) {
            i11 = (pVarF.s(pVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= pVarF.s(pVar2) ? 32 : 16;
        }
        if ((i10 & bb.c.b.f30796me) == 0) {
            i11 |= pVarF.s(pVar3) ? 256 : 128;
        }
        if ((i10 & bb.c.g.f32954lc) == 0) {
            i11 |= pVarF.s(textStyle) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= pVarF.z(j10) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= pVarF.z(j11) ? 131072 : 65536;
        }
        if ((374491 & i11) == 74898 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(-903235475, i11, -1, "androidx.compose.material3.OneRowSnackbar (Snackbar.kt:293)");
            }
            final String str = "text";
            final String str2 = "action";
            final String str3 = "dismissAction";
            androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
            androidx.compose.ui.n nVarO = PaddingKt.o(companion, f10873c, 0.0f, pVar3 == null ? f10874d : s1.h.g(0), 0.0f, 10, null);
            androidx.compose.ui.layout.i0 i0Var = new androidx.compose.ui.layout.i0() { // from class: androidx.compose.material3.SnackbarKt$OneRowSnackbar$2
                @Override // androidx.compose.ui.layout.i0
                @dl.d
                public final androidx.compose.ui.layout.j0 a(@dl.d androidx.compose.ui.layout.l0 Layout, @dl.d List<? extends androidx.compose.ui.layout.g0> measurables, long j12) {
                    Object next;
                    Object next2;
                    int iMax;
                    final int i12;
                    final int height;
                    int iV;
                    kotlin.jvm.internal.f0.p(Layout, "$this$Layout");
                    kotlin.jvm.internal.f0.p(measurables, "measurables");
                    int iMin = Math.min(s1.b.p(j12), Layout.e1(SnackbarKt.f10871a));
                    String str4 = str2;
                    Iterator<T> it = measurables.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!kotlin.jvm.internal.f0.g(LayoutIdKt.a((androidx.compose.ui.layout.g0) next), str4));
                    androidx.compose.ui.layout.g0 g0Var = (androidx.compose.ui.layout.g0) next;
                    androidx.compose.ui.layout.e1 e1VarZ1 = g0Var != null ? g0Var.z1(j12) : null;
                    String str5 = str3;
                    Iterator<T> it2 = measurables.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                    } while (!kotlin.jvm.internal.f0.g(LayoutIdKt.a((androidx.compose.ui.layout.g0) next2), str5));
                    androidx.compose.ui.layout.g0 g0Var2 = (androidx.compose.ui.layout.g0) next2;
                    final androidx.compose.ui.layout.e1 e1VarZ2 = g0Var2 != null ? g0Var2.z1(j12) : null;
                    int width = e1VarZ1 != null ? e1VarZ1.getWidth() : 0;
                    int height2 = e1VarZ1 != null ? e1VarZ1.getHeight() : 0;
                    int width2 = e1VarZ2 != null ? e1VarZ2.getWidth() : 0;
                    int height3 = e1VarZ2 != null ? e1VarZ2.getHeight() : 0;
                    int iU = fi.u.u(((iMin - width) - width2) - (width2 == 0 ? Layout.e1(SnackbarKt.f10877g) : 0), s1.b.r(j12));
                    String str6 = str;
                    for (androidx.compose.ui.layout.g0 g0Var3 : measurables) {
                        if (kotlin.jvm.internal.f0.g(LayoutIdKt.a(g0Var3), str6)) {
                            int i13 = height3;
                            final androidx.compose.ui.layout.e1 e1VarZ3 = g0Var3.z1(s1.b.e(j12, 0, iU, 0, 0, 9, null));
                            int iV2 = e1VarZ3.v(androidx.compose.ui.layout.AlignmentLineKt.a());
                            if (!(iV2 != Integer.MIN_VALUE)) {
                                throw new IllegalArgumentException("No baselines for text".toString());
                            }
                            int iV3 = e1VarZ3.v(androidx.compose.ui.layout.AlignmentLineKt.b());
                            if (!(iV3 != Integer.MIN_VALUE)) {
                                throw new IllegalArgumentException("No baselines for text".toString());
                            }
                            boolean z10 = iV2 == iV3;
                            final int i14 = iMin - width2;
                            final int i15 = i14 - width;
                            if (z10) {
                                int iMax2 = Math.max(Layout.e1(t0.t0.f140362a.n()), Math.max(height2, i13));
                                int height4 = (iMax2 - e1VarZ3.getHeight()) / 2;
                                height = (e1VarZ1 == null || (iV = e1VarZ1.v(androidx.compose.ui.layout.AlignmentLineKt.a())) == Integer.MIN_VALUE) ? 0 : (iV2 + height4) - iV;
                                i12 = height4;
                                iMax = iMax2;
                            } else {
                                int iE1 = Layout.e1(SnackbarKt.f10872b) - iV2;
                                iMax = Math.max(Layout.e1(t0.t0.f140362a.q()), e1VarZ3.getHeight() + iE1);
                                i12 = iE1;
                                height = e1VarZ1 != null ? (iMax - e1VarZ1.getHeight()) / 2 : 0;
                            }
                            final int height5 = e1VarZ2 != null ? (iMax - e1VarZ2.getHeight()) / 2 : 0;
                            final androidx.compose.ui.layout.e1 e1Var = e1VarZ1;
                            return androidx.compose.ui.layout.k0.p(Layout, iMin, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$OneRowSnackbar$2$measure$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                    kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                    androidx.compose.ui.layout.e1.a.v(layout, e1VarZ3, 0, i12, 0.0f, 4, null);
                                    androidx.compose.ui.layout.e1 e1Var2 = e1VarZ2;
                                    if (e1Var2 != null) {
                                        androidx.compose.ui.layout.e1.a.v(layout, e1Var2, i14, height5, 0.0f, 4, null);
                                    }
                                    androidx.compose.ui.layout.e1 e1Var3 = e1Var;
                                    if (e1Var3 != null) {
                                        androidx.compose.ui.layout.e1.a.v(layout, e1Var3, i15, height, 0.0f, 4, null);
                                    }
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                    a(aVar);
                                    return kotlin.b2.f124493a;
                                }
                            }, 4, null);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
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
            s1.e eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            yh.a<ComposeUiNode> aVarA = companion2.a();
            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarO);
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
            pVarF.T(-1961334364);
            androidx.compose.ui.n nVarM = PaddingKt.m(LayoutIdKt.b(companion, "text"), 0.0f, f10876f, 1, null);
            pVarF.T(733328855);
            androidx.compose.ui.c.Companion companion3 = androidx.compose.ui.c.INSTANCE;
            androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(companion3.C(), false, pVarF, 0);
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
            pVarF.T(-789862614);
            pVar.invoke(pVarF, Integer.valueOf(i11 & 14));
            pVarF.c0();
            pVarF.c0();
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            pVarF.c0();
            pVarF.T(-167734710);
            if (pVar2 != null) {
                androidx.compose.ui.n nVarB = LayoutIdKt.b(companion, "action");
                pVarF.T(733328855);
                androidx.compose.ui.layout.i0 i0VarK2 = BoxKt.k(companion3.C(), false, pVarF, 0);
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
                pVarF.T(801714373);
                CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(j10)), TextKt.d().f(textStyle)}, pVar2, pVarF, (i11 & 112) | 8);
                pVarF.c0();
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
            }
            pVarF.c0();
            if (pVar3 != null) {
                androidx.compose.ui.n nVarB2 = LayoutIdKt.b(companion, "dismissAction");
                pVarF.T(733328855);
                androidx.compose.ui.layout.i0 i0VarK3 = BoxKt.k(companion3.C(), false, pVarF, 0);
                pVarF.T(-1323940314);
                s1.e eVar4 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection4 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                androidx.compose.ui.platform.d2 d2Var4 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                yh.a<ComposeUiNode> aVarA4 = companion2.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF4 = LayoutKt.f(nVarB2);
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.getInserting()) {
                    pVarF.L(aVarA4);
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB4 = Updater.b(pVarF);
                Updater.j(pVarB4, i0VarK3, companion2.d());
                Updater.j(pVarB4, eVar4, companion2.b());
                Updater.j(pVarB4, layoutDirection4, companion2.c());
                Updater.j(pVarB4, d2Var4, companion2.f());
                pVarF.x();
                qVarF4.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                pVarF.T(2058660585);
                pVarF.T(-2137368960);
                pVarF.T(88411260);
                CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(j11))}, pVar3, pVarF, ((i11 >> 3) & 112) | 8);
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
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$OneRowSnackbar$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar5, int i12) {
                SnackbarKt.b(pVar, pVar2, pVar3, textStyle, j10, j11, pVar5, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar5, Integer num) {
                a(pVar5, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0113  */
    /* JADX WARN: Code duplicated, block: B:103:0x0118  */
    /* JADX WARN: Code duplicated, block: B:105:0x011e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0121  */
    /* JADX WARN: Code duplicated, block: B:109:0x012d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0145  */
    /* JADX WARN: Code duplicated, block: B:115:0x015b  */
    /* JADX WARN: Code duplicated, block: B:134:0x0190 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x0192  */
    /* JADX WARN: Code duplicated, block: B:136:0x0195  */
    /* JADX WARN: Code duplicated, block: B:139:0x0199  */
    /* JADX WARN: Code duplicated, block: B:142:0x019d  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:145:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:148:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:149:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:152:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:153:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:156:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:157:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:160:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:161:0x01df  */
    /* JADX WARN: Code duplicated, block: B:164:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:167:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:170:0x0259  */
    /* JADX WARN: Code duplicated, block: B:175:0x026c  */
    /* JADX WARN: Code duplicated, block: B:177:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:94:0x0105  */
    /* JADX WARN: Code duplicated, block: B:96:0x0109  */
    /* JADX WARN: Code duplicated, block: B:99:0x010f  */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void c(@dl.e androidx.compose.ui.n nVar, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar2, boolean z10, @dl.e g2 g2Var, long j10, long j11, long j12, long j13, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> content, @dl.e androidx.compose.runtime.p pVar3, final int i10, final int i11) {
        androidx.compose.ui.n nVar2;
        int i12;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar4;
        int i13;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar5;
        int i14;
        int i15;
        int i16;
        long jE;
        int i17;
        androidx.compose.ui.n nVar3;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar6;
        boolean z11;
        final g2 g2VarF;
        long jC;
        long jD;
        long jB;
        final boolean z12;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar7;
        final long j14;
        final long j15;
        final long j16;
        androidx.compose.runtime.u1 u1VarH;
        int i18;
        int i19;
        int i20;
        int i21;
        kotlin.jvm.internal.f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar3.F(-1235788955);
        int i22 = i11 & 1;
        if (i22 != 0) {
            i12 = i10 | 6;
            nVar2 = nVar;
        } else if ((i10 & 14) == 0) {
            nVar2 = nVar;
            i12 = (pVarF.s(nVar2) ? 4 : 2) | i10;
        } else {
            nVar2 = nVar;
            i12 = i10;
        }
        int i23 = i11 & 2;
        if (i23 == 0) {
            if ((i10 & 112) == 0) {
                pVar4 = pVar;
                i12 |= pVarF.s(pVar4) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & bb.c.b.f30796me) == 0) {
                    pVar5 = pVar2;
                    if (pVarF.s(pVar5)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & bb.c.g.f32954lc) == 0) {
                        if (pVarF.u(z10)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((57344 & i10) != 0) {
                        i12 |= ((i11 & 16) == 0 || !pVarF.s(g2Var)) ? 8192 : 16384;
                    }
                    if ((458752 & i10) != 0) {
                        if ((i11 & 32) == 0 || !pVarF.z(j10)) {
                            i21 = 65536;
                        } else {
                            i21 = 131072;
                        }
                        i12 |= i21;
                    }
                    if ((3670016 & i10) != 0) {
                        if ((i11 & 64) == 0 || !pVarF.z(j11)) {
                            i20 = 524288;
                        } else {
                            i20 = 1048576;
                        }
                        i12 |= i20;
                    }
                    if ((29360128 & i10) != 0) {
                        if ((i11 & 128) == 0 || !pVarF.z(j12)) {
                            i19 = 4194304;
                        } else {
                            i19 = 8388608;
                        }
                        i12 |= i19;
                    }
                    if ((234881024 & i10) == 0) {
                        jE = j13;
                        if ((i11 & 256) == 0 || !pVarF.z(jE)) {
                            i18 = 33554432;
                        } else {
                            i18 = 67108864;
                        }
                        i12 |= i18;
                    } else {
                        jE = j13;
                    }
                    if ((i11 & 512) != 0) {
                        if ((1879048192 & i10) == 0) {
                            if (pVarF.s(content)) {
                                i17 = 536870912;
                            } else {
                                i17 = 268435456;
                            }
                        }
                        if ((1533916891 & i12) == 306783378 || !pVarF.b()) {
                            pVarF.W();
                            if ((i10 & 1) != 0 || pVarF.o()) {
                                if (i22 != 0) {
                                    nVar3 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar3 = nVar2;
                                }
                                if (i23 != 0) {
                                    pVar4 = null;
                                }
                                pVar6 = i13 == 0 ? pVar5 : null;
                                if (i15 != 0) {
                                    z11 = false;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 16) != 0) {
                                    g2VarF = m1.f12029a.f(pVarF, 6);
                                    i12 &= -57345;
                                } else {
                                    g2VarF = g2Var;
                                }
                                if ((i11 & 32) != 0) {
                                    jC = m1.f12029a.c(pVarF, 6);
                                    i12 &= -458753;
                                } else {
                                    jC = j10;
                                }
                                if ((i11 & 64) != 0) {
                                    jD = m1.f12029a.d(pVarF, 6);
                                    i12 &= -3670017;
                                } else {
                                    jD = j11;
                                }
                                if ((i11 & 128) != 0) {
                                    jB = m1.f12029a.b(pVarF, 6);
                                    i12 &= -29360129;
                                } else {
                                    jB = j12;
                                }
                                if ((i11 & 256) != 0) {
                                    jE = m1.f12029a.e(pVarF, 6);
                                    i12 &= -234881025;
                                }
                            } else {
                                pVarF.l();
                                if ((i11 & 16) != 0) {
                                    i12 &= -57345;
                                }
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
                                g2VarF = g2Var;
                                jD = j11;
                                jB = j12;
                                nVar3 = nVar2;
                                pVar6 = pVar5;
                                z11 = z10;
                                jC = j10;
                            }
                            pVarF.O();
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:91)");
                            }
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar8 = pVar4;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar9 = pVar6;
                            final long j17 = jB;
                            final long j18 = jE;
                            final int i24 = i12;
                            final boolean z13 = z11;
                            yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar10 = pVar6;
                            int i25 = 12779520 | (i12 & 14);
                            int i26 = i12 >> 9;
                            SurfaceKt.a(nVar3, g2VarF, jC, jD, 0.0f, t0.t0.f140362a.g(), null, androidx.compose.runtime.internal.b.b(pVarF, -1829663446, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar11, int i27) {
                                    if ((i27 & 11) == 2 && pVar11.b()) {
                                        pVar11.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1829663446, i27, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:109)");
                                    }
                                    o0 o0Var = o0.f12059a;
                                    Typography typographyC = o0Var.c(pVar11, 6);
                                    t0.t0 t0Var = t0.t0.f140362a;
                                    TextStyle textStyleA = TypographyKt.a(typographyC, t0Var.p());
                                    final TextStyle textStyleA2 = TypographyKt.a(o0Var.c(pVar11, 6), t0Var.d());
                                    androidx.compose.runtime.k1[] k1VarArr = {TextKt.d().f(textStyleA)};
                                    final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar12 = pVar8;
                                    final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar13 = content;
                                    final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar14 = pVar9;
                                    final long j19 = j17;
                                    final long j20 = j18;
                                    final int i28 = i24;
                                    final boolean z14 = z13;
                                    CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar11, 835891690, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                        @androidx.compose.runtime.h
                                        public final void a(@dl.e androidx.compose.runtime.p pVar15, int i29) {
                                            if ((i29 & 11) == 2 && pVar15.b()) {
                                                pVar15.l();
                                                return;
                                            }
                                            if (ComposerKt.g0()) {
                                                ComposerKt.w0(835891690, i29, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:112)");
                                            }
                                            if (pVar12 == null) {
                                                pVar15.T(-2104362770);
                                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar16 = pVar13;
                                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar17 = pVar14;
                                                TextStyle textStyle = textStyleA2;
                                                long j21 = j19;
                                                long j22 = j20;
                                                int i30 = i28;
                                                SnackbarKt.b(pVar16, null, pVar17, textStyle, j21, j22, pVar15, (57344 & (i30 >> 9)) | ((i30 >> 27) & 14) | 48 | (i30 & bb.c.b.f30796me) | ((i30 >> 9) & 458752));
                                                pVar15.c0();
                                            } else if (z14) {
                                                pVar15.T(-2104362456);
                                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar18 = pVar13;
                                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar19 = pVar12;
                                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar14;
                                                TextStyle textStyle2 = textStyleA2;
                                                long j23 = j19;
                                                long j24 = j20;
                                                int i31 = i28;
                                                SnackbarKt.a(pVar18, pVar19, pVar20, textStyle2, j23, j24, pVar15, (57344 & (i31 >> 9)) | ((i31 >> 27) & 14) | (i31 & 112) | (i31 & bb.c.b.f30796me) | ((i31 >> 9) & 458752));
                                                pVar15.c0();
                                            } else {
                                                pVar15.T(-2104362176);
                                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar21 = pVar13;
                                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar22 = pVar12;
                                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar23 = pVar14;
                                                TextStyle textStyle3 = textStyleA2;
                                                long j25 = j19;
                                                long j26 = j20;
                                                int i32 = i28;
                                                SnackbarKt.b(pVar21, pVar22, pVar23, textStyle3, j25, j26, pVar15, (57344 & (i32 >> 9)) | ((i32 >> 27) & 14) | (i32 & 112) | (i32 & bb.c.b.f30796me) | ((i32 >> 9) & 458752));
                                                pVar15.c0();
                                            }
                                            if (ComposerKt.g0()) {
                                                ComposerKt.v0();
                                            }
                                        }

                                        @Override // yh.p
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar15, Integer num) {
                                            a(pVar15, num.intValue());
                                            return kotlin.b2.f124493a;
                                        }
                                    }), pVar11, 56);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11, Integer num) {
                                    a(pVar11, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVarF, (i26 & bb.c.g.f32954lc) | i25 | (i26 & 112) | (i26 & bb.c.b.f30796me), 80);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            z12 = z11;
                            pVar7 = pVar4;
                            j14 = jC;
                            j15 = jE;
                            j16 = jB;
                            pVar5 = pVar10;
                            nVar2 = nVar3;
                        } else {
                            pVarF.l();
                            z12 = z10;
                            g2VarF = g2Var;
                            jD = j11;
                            pVar7 = pVar4;
                            j15 = jE;
                            j14 = j10;
                            j16 = j12;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        final androidx.compose.ui.n nVar4 = nVar2;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11 = pVar5;
                        final long j19 = jD;
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar12, int i27) {
                                SnackbarKt.c(nVar4, pVar7, pVar11, z12, g2VarF, j14, j19, j16, j15, content, pVar12, i10 | 1, i11);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar12, Integer num) {
                                a(pVar12, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    }
                    i17 = com.google.android.exoplayer2.j.G;
                    i12 |= i17;
                    if ((1533916891 & i12) == 306783378) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i23 != 0) {
                                pVar4 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 16) != 0) {
                                g2VarF = m1.f12029a.f(pVarF, 6);
                                i12 &= -57345;
                            } else {
                                g2VarF = g2Var;
                            }
                            if ((i11 & 32) != 0) {
                                jC = m1.f12029a.c(pVarF, 6);
                                i12 &= -458753;
                            } else {
                                jC = j10;
                            }
                            if ((i11 & 64) != 0) {
                                jD = m1.f12029a.d(pVarF, 6);
                                i12 &= -3670017;
                            } else {
                                jD = j11;
                            }
                            if ((i11 & 128) != 0) {
                                jB = m1.f12029a.b(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                jB = j12;
                            }
                            if ((i11 & 256) != 0) {
                                jE = m1.f12029a.e(pVarF, 6);
                                i12 &= -234881025;
                            }
                        } else {
                            if (i22 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i23 != 0) {
                                pVar4 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 16) != 0) {
                                g2VarF = m1.f12029a.f(pVarF, 6);
                                i12 &= -57345;
                            } else {
                                g2VarF = g2Var;
                            }
                            if ((i11 & 32) != 0) {
                                jC = m1.f12029a.c(pVarF, 6);
                                i12 &= -458753;
                            } else {
                                jC = j10;
                            }
                            if ((i11 & 64) != 0) {
                                jD = m1.f12029a.d(pVarF, 6);
                                i12 &= -3670017;
                            } else {
                                jD = j11;
                            }
                            if ((i11 & 128) != 0) {
                                jB = m1.f12029a.b(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                jB = j12;
                            }
                            if ((i11 & 256) != 0) {
                                jE = m1.f12029a.e(pVarF, 6);
                                i12 &= -234881025;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:91)");
                        }
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar12 = pVar4;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar13 = pVar6;
                        final long j110 = jB;
                        final long j111 = jE;
                        final int i27 = i12;
                        final boolean z14 = z11;
                        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar14 = pVar6;
                        int i28 = 12779520 | (i12 & 14);
                        int i29 = i12 >> 9;
                        SurfaceKt.a(nVar3, g2VarF, jC, jD, 0.0f, t0.t0.f140362a.g(), null, androidx.compose.runtime.internal.b.b(pVarF, -1829663446, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar15, int i210) {
                                if ((i210 & 11) == 2 && pVar15.b()) {
                                    pVar15.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1829663446, i210, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:109)");
                                }
                                o0 o0Var = o0.f12059a;
                                Typography typographyC = o0Var.c(pVar15, 6);
                                t0.t0 t0Var = t0.t0.f140362a;
                                TextStyle textStyleA = TypographyKt.a(typographyC, t0Var.p());
                                final TextStyle textStyleA2 = TypographyKt.a(o0Var.c(pVar15, 6), t0Var.d());
                                androidx.compose.runtime.k1[] k1VarArr = {TextKt.d().f(textStyleA)};
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar16 = pVar12;
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar17 = content;
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar18 = pVar13;
                                final long j112 = j110;
                                final long j20 = j111;
                                final int i211 = i27;
                                final boolean z15 = z14;
                                CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar15, 835891690, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar19, int i212) {
                                        if ((i212 & 11) == 2 && pVar19.b()) {
                                            pVar19.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(835891690, i212, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:112)");
                                        }
                                        if (pVar16 == null) {
                                            pVar19.T(-2104362770);
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar110 = pVar17;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111 = pVar18;
                                            TextStyle textStyle = textStyleA2;
                                            long j21 = j112;
                                            long j22 = j20;
                                            int i30 = i211;
                                            SnackbarKt.b(pVar110, null, pVar111, textStyle, j21, j22, pVar19, (57344 & (i30 >> 9)) | ((i30 >> 27) & 14) | 48 | (i30 & bb.c.b.f30796me) | ((i30 >> 9) & 458752));
                                            pVar19.c0();
                                        } else if (z15) {
                                            pVar19.T(-2104362456);
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar112 = pVar17;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar113 = pVar16;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar18;
                                            TextStyle textStyle2 = textStyleA2;
                                            long j23 = j112;
                                            long j24 = j20;
                                            int i31 = i211;
                                            SnackbarKt.a(pVar112, pVar113, pVar20, textStyle2, j23, j24, pVar19, (57344 & (i31 >> 9)) | ((i31 >> 27) & 14) | (i31 & 112) | (i31 & bb.c.b.f30796me) | ((i31 >> 9) & 458752));
                                            pVar19.c0();
                                        } else {
                                            pVar19.T(-2104362176);
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar21 = pVar17;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar22 = pVar16;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar23 = pVar18;
                                            TextStyle textStyle3 = textStyleA2;
                                            long j25 = j112;
                                            long j26 = j20;
                                            int i32 = i211;
                                            SnackbarKt.b(pVar21, pVar22, pVar23, textStyle3, j25, j26, pVar19, (57344 & (i32 >> 9)) | ((i32 >> 27) & 14) | (i32 & 112) | (i32 & bb.c.b.f30796me) | ((i32 >> 9) & 458752));
                                            pVar19.c0();
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar19, Integer num) {
                                        a(pVar19, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                }), pVar15, 56);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar15, Integer num) {
                                a(pVar15, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, (i29 & bb.c.g.f32954lc) | i28 | (i29 & 112) | (i29 & bb.c.b.f30796me), 80);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        z12 = z11;
                        pVar7 = pVar4;
                        j14 = jC;
                        j15 = jE;
                        j16 = jB;
                        pVar5 = pVar14;
                        nVar2 = nVar3;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i23 != 0) {
                                pVar4 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 16) != 0) {
                                g2VarF = m1.f12029a.f(pVarF, 6);
                                i12 &= -57345;
                            } else {
                                g2VarF = g2Var;
                            }
                            if ((i11 & 32) != 0) {
                                jC = m1.f12029a.c(pVarF, 6);
                                i12 &= -458753;
                            } else {
                                jC = j10;
                            }
                            if ((i11 & 64) != 0) {
                                jD = m1.f12029a.d(pVarF, 6);
                                i12 &= -3670017;
                            } else {
                                jD = j11;
                            }
                            if ((i11 & 128) != 0) {
                                jB = m1.f12029a.b(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                jB = j12;
                            }
                            if ((i11 & 256) != 0) {
                                jE = m1.f12029a.e(pVarF, 6);
                                i12 &= -234881025;
                            }
                        } else {
                            if (i22 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i23 != 0) {
                                pVar4 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 16) != 0) {
                                g2VarF = m1.f12029a.f(pVarF, 6);
                                i12 &= -57345;
                            } else {
                                g2VarF = g2Var;
                            }
                            if ((i11 & 32) != 0) {
                                jC = m1.f12029a.c(pVarF, 6);
                                i12 &= -458753;
                            } else {
                                jC = j10;
                            }
                            if ((i11 & 64) != 0) {
                                jD = m1.f12029a.d(pVarF, 6);
                                i12 &= -3670017;
                            } else {
                                jD = j11;
                            }
                            if ((i11 & 128) != 0) {
                                jB = m1.f12029a.b(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                jB = j12;
                            }
                            if ((i11 & 256) != 0) {
                                jE = m1.f12029a.e(pVarF, 6);
                                i12 &= -234881025;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:91)");
                        }
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar15 = pVar4;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar16 = pVar6;
                        final long j112 = jB;
                        final long j113 = jE;
                        final int i210 = i12;
                        final boolean z15 = z11;
                        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar17 = pVar6;
                        int i211 = 12779520 | (i12 & 14);
                        int i212 = i12 >> 9;
                        SurfaceKt.a(nVar3, g2VarF, jC, jD, 0.0f, t0.t0.f140362a.g(), null, androidx.compose.runtime.internal.b.b(pVarF, -1829663446, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar18, int i213) {
                                if ((i213 & 11) == 2 && pVar18.b()) {
                                    pVar18.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1829663446, i213, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:109)");
                                }
                                o0 o0Var = o0.f12059a;
                                Typography typographyC = o0Var.c(pVar18, 6);
                                t0.t0 t0Var = t0.t0.f140362a;
                                TextStyle textStyleA = TypographyKt.a(typographyC, t0Var.p());
                                final TextStyle textStyleA2 = TypographyKt.a(o0Var.c(pVar18, 6), t0Var.d());
                                androidx.compose.runtime.k1[] k1VarArr = {TextKt.d().f(textStyleA)};
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar19 = pVar15;
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar110 = content;
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111 = pVar16;
                                final long j114 = j112;
                                final long j20 = j113;
                                final int i214 = i210;
                                final boolean z16 = z15;
                                CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar18, 835891690, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar112, int i215) {
                                        if ((i215 & 11) == 2 && pVar112.b()) {
                                            pVar112.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(835891690, i215, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:112)");
                                        }
                                        if (pVar19 == null) {
                                            pVar112.T(-2104362770);
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar113 = pVar110;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar114 = pVar111;
                                            TextStyle textStyle = textStyleA2;
                                            long j21 = j114;
                                            long j22 = j20;
                                            int i30 = i214;
                                            SnackbarKt.b(pVar113, null, pVar114, textStyle, j21, j22, pVar112, (57344 & (i30 >> 9)) | ((i30 >> 27) & 14) | 48 | (i30 & bb.c.b.f30796me) | ((i30 >> 9) & 458752));
                                            pVar112.c0();
                                        } else if (z16) {
                                            pVar112.T(-2104362456);
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar115 = pVar110;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar116 = pVar19;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar111;
                                            TextStyle textStyle2 = textStyleA2;
                                            long j23 = j114;
                                            long j24 = j20;
                                            int i31 = i214;
                                            SnackbarKt.a(pVar115, pVar116, pVar20, textStyle2, j23, j24, pVar112, (57344 & (i31 >> 9)) | ((i31 >> 27) & 14) | (i31 & 112) | (i31 & bb.c.b.f30796me) | ((i31 >> 9) & 458752));
                                            pVar112.c0();
                                        } else {
                                            pVar112.T(-2104362176);
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar21 = pVar110;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar22 = pVar19;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar23 = pVar111;
                                            TextStyle textStyle3 = textStyleA2;
                                            long j25 = j114;
                                            long j26 = j20;
                                            int i32 = i214;
                                            SnackbarKt.b(pVar21, pVar22, pVar23, textStyle3, j25, j26, pVar112, (57344 & (i32 >> 9)) | ((i32 >> 27) & 14) | (i32 & 112) | (i32 & bb.c.b.f30796me) | ((i32 >> 9) & 458752));
                                            pVar112.c0();
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar112, Integer num) {
                                        a(pVar112, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                }), pVar18, 56);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar18, Integer num) {
                                a(pVar18, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, (i212 & bb.c.g.f32954lc) | i211 | (i212 & 112) | (i212 & bb.c.b.f30796me), 80);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        z12 = z11;
                        pVar7 = pVar4;
                        j14 = jC;
                        j15 = jE;
                        j16 = jB;
                        pVar5 = pVar17;
                        nVar2 = nVar3;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final androidx.compose.ui.n nVar5 = nVar2;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar18 = pVar5;
                    final long j114 = jD;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar19, int i213) {
                            SnackbarKt.c(nVar5, pVar7, pVar18, z12, g2VarF, j14, j114, j16, j15, content, pVar19, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar19, Integer num) {
                            a(pVar19, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i12 |= bb.c.d.f31193dj;
                if ((57344 & i10) != 0) {
                    i12 |= ((i11 & 16) == 0 || !pVarF.s(g2Var)) ? 8192 : 16384;
                }
                if ((458752 & i10) != 0) {
                    if ((i11 & 32) == 0) {
                        i21 = 65536;
                    } else {
                        i21 = 65536;
                    }
                    i12 |= i21;
                }
                if ((3670016 & i10) != 0) {
                    if ((i11 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                if ((29360128 & i10) != 0) {
                    if ((i11 & 128) == 0) {
                        i19 = 4194304;
                    } else {
                        i19 = 4194304;
                    }
                    i12 |= i19;
                }
                if ((234881024 & i10) == 0) {
                    jE = j13;
                    if ((i11 & 256) == 0) {
                        i18 = 33554432;
                    } else {
                        i18 = 33554432;
                    }
                    i12 |= i18;
                } else {
                    jE = j13;
                }
                if ((i11 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (pVarF.s(content)) {
                            i17 = 536870912;
                        } else {
                            i17 = 268435456;
                        }
                    }
                    if ((1533916891 & i12) == 306783378) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i23 != 0) {
                                pVar4 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 16) != 0) {
                                g2VarF = m1.f12029a.f(pVarF, 6);
                                i12 &= -57345;
                            } else {
                                g2VarF = g2Var;
                            }
                            if ((i11 & 32) != 0) {
                                jC = m1.f12029a.c(pVarF, 6);
                                i12 &= -458753;
                            } else {
                                jC = j10;
                            }
                            if ((i11 & 64) != 0) {
                                jD = m1.f12029a.d(pVarF, 6);
                                i12 &= -3670017;
                            } else {
                                jD = j11;
                            }
                            if ((i11 & 128) != 0) {
                                jB = m1.f12029a.b(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                jB = j12;
                            }
                            if ((i11 & 256) != 0) {
                                jE = m1.f12029a.e(pVarF, 6);
                                i12 &= -234881025;
                            }
                        } else {
                            if (i22 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i23 != 0) {
                                pVar4 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 16) != 0) {
                                g2VarF = m1.f12029a.f(pVarF, 6);
                                i12 &= -57345;
                            } else {
                                g2VarF = g2Var;
                            }
                            if ((i11 & 32) != 0) {
                                jC = m1.f12029a.c(pVarF, 6);
                                i12 &= -458753;
                            } else {
                                jC = j10;
                            }
                            if ((i11 & 64) != 0) {
                                jD = m1.f12029a.d(pVarF, 6);
                                i12 &= -3670017;
                            } else {
                                jD = j11;
                            }
                            if ((i11 & 128) != 0) {
                                jB = m1.f12029a.b(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                jB = j12;
                            }
                            if ((i11 & 256) != 0) {
                                jE = m1.f12029a.e(pVarF, 6);
                                i12 &= -234881025;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:91)");
                        }
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar19 = pVar4;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar110 = pVar6;
                        final long j115 = jB;
                        final long j116 = jE;
                        final int i213 = i12;
                        final boolean z16 = z11;
                        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111 = pVar6;
                        int i214 = 12779520 | (i12 & 14);
                        int i215 = i12 >> 9;
                        SurfaceKt.a(nVar3, g2VarF, jC, jD, 0.0f, t0.t0.f140362a.g(), null, androidx.compose.runtime.internal.b.b(pVarF, -1829663446, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
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
                                    ComposerKt.w0(-1829663446, i216, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:109)");
                                }
                                o0 o0Var = o0.f12059a;
                                Typography typographyC = o0Var.c(pVar112, 6);
                                t0.t0 t0Var = t0.t0.f140362a;
                                TextStyle textStyleA = TypographyKt.a(typographyC, t0Var.p());
                                final TextStyle textStyleA2 = TypographyKt.a(o0Var.c(pVar112, 6), t0Var.d());
                                androidx.compose.runtime.k1[] k1VarArr = {TextKt.d().f(textStyleA)};
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar113 = pVar19;
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar114 = content;
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar115 = pVar110;
                                final long j117 = j115;
                                final long j20 = j116;
                                final int i217 = i213;
                                final boolean z17 = z16;
                                CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar112, 835891690, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar116, int i218) {
                                        if ((i218 & 11) == 2 && pVar116.b()) {
                                            pVar116.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(835891690, i218, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:112)");
                                        }
                                        if (pVar113 == null) {
                                            pVar116.T(-2104362770);
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar117 = pVar114;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar118 = pVar115;
                                            TextStyle textStyle = textStyleA2;
                                            long j21 = j117;
                                            long j22 = j20;
                                            int i30 = i217;
                                            SnackbarKt.b(pVar117, null, pVar118, textStyle, j21, j22, pVar116, (57344 & (i30 >> 9)) | ((i30 >> 27) & 14) | 48 | (i30 & bb.c.b.f30796me) | ((i30 >> 9) & 458752));
                                            pVar116.c0();
                                        } else if (z17) {
                                            pVar116.T(-2104362456);
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar119 = pVar114;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1110 = pVar113;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar115;
                                            TextStyle textStyle2 = textStyleA2;
                                            long j23 = j117;
                                            long j24 = j20;
                                            int i31 = i217;
                                            SnackbarKt.a(pVar119, pVar1110, pVar20, textStyle2, j23, j24, pVar116, (57344 & (i31 >> 9)) | ((i31 >> 27) & 14) | (i31 & 112) | (i31 & bb.c.b.f30796me) | ((i31 >> 9) & 458752));
                                            pVar116.c0();
                                        } else {
                                            pVar116.T(-2104362176);
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar21 = pVar114;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar22 = pVar113;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar23 = pVar115;
                                            TextStyle textStyle3 = textStyleA2;
                                            long j25 = j117;
                                            long j26 = j20;
                                            int i32 = i217;
                                            SnackbarKt.b(pVar21, pVar22, pVar23, textStyle3, j25, j26, pVar116, (57344 & (i32 >> 9)) | ((i32 >> 27) & 14) | (i32 & 112) | (i32 & bb.c.b.f30796me) | ((i32 >> 9) & 458752));
                                            pVar116.c0();
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar116, Integer num) {
                                        a(pVar116, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                }), pVar112, 56);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar112, Integer num) {
                                a(pVar112, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, (i215 & bb.c.g.f32954lc) | i214 | (i215 & 112) | (i215 & bb.c.b.f30796me), 80);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        z12 = z11;
                        pVar7 = pVar4;
                        j14 = jC;
                        j15 = jE;
                        j16 = jB;
                        pVar5 = pVar111;
                        nVar2 = nVar3;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i23 != 0) {
                                pVar4 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 16) != 0) {
                                g2VarF = m1.f12029a.f(pVarF, 6);
                                i12 &= -57345;
                            } else {
                                g2VarF = g2Var;
                            }
                            if ((i11 & 32) != 0) {
                                jC = m1.f12029a.c(pVarF, 6);
                                i12 &= -458753;
                            } else {
                                jC = j10;
                            }
                            if ((i11 & 64) != 0) {
                                jD = m1.f12029a.d(pVarF, 6);
                                i12 &= -3670017;
                            } else {
                                jD = j11;
                            }
                            if ((i11 & 128) != 0) {
                                jB = m1.f12029a.b(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                jB = j12;
                            }
                            if ((i11 & 256) != 0) {
                                jE = m1.f12029a.e(pVarF, 6);
                                i12 &= -234881025;
                            }
                        } else {
                            if (i22 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i23 != 0) {
                                pVar4 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 16) != 0) {
                                g2VarF = m1.f12029a.f(pVarF, 6);
                                i12 &= -57345;
                            } else {
                                g2VarF = g2Var;
                            }
                            if ((i11 & 32) != 0) {
                                jC = m1.f12029a.c(pVarF, 6);
                                i12 &= -458753;
                            } else {
                                jC = j10;
                            }
                            if ((i11 & 64) != 0) {
                                jD = m1.f12029a.d(pVarF, 6);
                                i12 &= -3670017;
                            } else {
                                jD = j11;
                            }
                            if ((i11 & 128) != 0) {
                                jB = m1.f12029a.b(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                jB = j12;
                            }
                            if ((i11 & 256) != 0) {
                                jE = m1.f12029a.e(pVarF, 6);
                                i12 &= -234881025;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:91)");
                        }
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar112 = pVar4;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar113 = pVar6;
                        final long j117 = jB;
                        final long j118 = jE;
                        final int i216 = i12;
                        final boolean z17 = z11;
                        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar114 = pVar6;
                        int i217 = 12779520 | (i12 & 14);
                        int i218 = i12 >> 9;
                        SurfaceKt.a(nVar3, g2VarF, jC, jD, 0.0f, t0.t0.f140362a.g(), null, androidx.compose.runtime.internal.b.b(pVarF, -1829663446, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar115, int i219) {
                                if ((i219 & 11) == 2 && pVar115.b()) {
                                    pVar115.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1829663446, i219, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:109)");
                                }
                                o0 o0Var = o0.f12059a;
                                Typography typographyC = o0Var.c(pVar115, 6);
                                t0.t0 t0Var = t0.t0.f140362a;
                                TextStyle textStyleA = TypographyKt.a(typographyC, t0Var.p());
                                final TextStyle textStyleA2 = TypographyKt.a(o0Var.c(pVar115, 6), t0Var.d());
                                androidx.compose.runtime.k1[] k1VarArr = {TextKt.d().f(textStyleA)};
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar116 = pVar112;
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar117 = content;
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar118 = pVar113;
                                final long j119 = j117;
                                final long j20 = j118;
                                final int i2110 = i216;
                                final boolean z18 = z17;
                                CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar115, 835891690, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar119, int i2111) {
                                        if ((i2111 & 11) == 2 && pVar119.b()) {
                                            pVar119.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(835891690, i2111, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:112)");
                                        }
                                        if (pVar116 == null) {
                                            pVar119.T(-2104362770);
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1110 = pVar117;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111 = pVar118;
                                            TextStyle textStyle = textStyleA2;
                                            long j21 = j119;
                                            long j22 = j20;
                                            int i30 = i2110;
                                            SnackbarKt.b(pVar1110, null, pVar1111, textStyle, j21, j22, pVar119, (57344 & (i30 >> 9)) | ((i30 >> 27) & 14) | 48 | (i30 & bb.c.b.f30796me) | ((i30 >> 9) & 458752));
                                            pVar119.c0();
                                        } else if (z18) {
                                            pVar119.T(-2104362456);
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1112 = pVar117;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1113 = pVar116;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar118;
                                            TextStyle textStyle2 = textStyleA2;
                                            long j23 = j119;
                                            long j24 = j20;
                                            int i31 = i2110;
                                            SnackbarKt.a(pVar1112, pVar1113, pVar20, textStyle2, j23, j24, pVar119, (57344 & (i31 >> 9)) | ((i31 >> 27) & 14) | (i31 & 112) | (i31 & bb.c.b.f30796me) | ((i31 >> 9) & 458752));
                                            pVar119.c0();
                                        } else {
                                            pVar119.T(-2104362176);
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar21 = pVar117;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar22 = pVar116;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar23 = pVar118;
                                            TextStyle textStyle3 = textStyleA2;
                                            long j25 = j119;
                                            long j26 = j20;
                                            int i32 = i2110;
                                            SnackbarKt.b(pVar21, pVar22, pVar23, textStyle3, j25, j26, pVar119, (57344 & (i32 >> 9)) | ((i32 >> 27) & 14) | (i32 & 112) | (i32 & bb.c.b.f30796me) | ((i32 >> 9) & 458752));
                                            pVar119.c0();
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar119, Integer num) {
                                        a(pVar119, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                }), pVar115, 56);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar115, Integer num) {
                                a(pVar115, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, (i218 & bb.c.g.f32954lc) | i217 | (i218 & 112) | (i218 & bb.c.b.f30796me), 80);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        z12 = z11;
                        pVar7 = pVar4;
                        j14 = jC;
                        j15 = jE;
                        j16 = jB;
                        pVar5 = pVar114;
                        nVar2 = nVar3;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final androidx.compose.ui.n nVar6 = nVar2;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar115 = pVar5;
                    final long j119 = jD;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar116, int i219) {
                            SnackbarKt.c(nVar6, pVar7, pVar115, z12, g2VarF, j14, j119, j16, j15, content, pVar116, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar116, Integer num) {
                            a(pVar116, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i17 = com.google.android.exoplayer2.j.G;
                i12 |= i17;
                if ((1533916891 & i12) == 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i23 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            g2VarF = m1.f12029a.f(pVarF, 6);
                            i12 &= -57345;
                        } else {
                            g2VarF = g2Var;
                        }
                        if ((i11 & 32) != 0) {
                            jC = m1.f12029a.c(pVarF, 6);
                            i12 &= -458753;
                        } else {
                            jC = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jD = m1.f12029a.d(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = m1.f12029a.b(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = m1.f12029a.e(pVarF, 6);
                            i12 &= -234881025;
                        }
                    } else {
                        if (i22 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i23 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            g2VarF = m1.f12029a.f(pVarF, 6);
                            i12 &= -57345;
                        } else {
                            g2VarF = g2Var;
                        }
                        if ((i11 & 32) != 0) {
                            jC = m1.f12029a.c(pVarF, 6);
                            i12 &= -458753;
                        } else {
                            jC = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jD = m1.f12029a.d(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = m1.f12029a.b(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = m1.f12029a.e(pVarF, 6);
                            i12 &= -234881025;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:91)");
                    }
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar116 = pVar4;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar117 = pVar6;
                    final long j1110 = jB;
                    final long j1111 = jE;
                    final int i219 = i12;
                    final boolean z18 = z11;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar118 = pVar6;
                    int i2110 = 12779520 | (i12 & 14);
                    int i2111 = i12 >> 9;
                    SurfaceKt.a(nVar3, g2VarF, jC, jD, 0.0f, t0.t0.f140362a.g(), null, androidx.compose.runtime.internal.b.b(pVarF, -1829663446, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar119, int i2112) {
                            if ((i2112 & 11) == 2 && pVar119.b()) {
                                pVar119.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1829663446, i2112, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:109)");
                            }
                            o0 o0Var = o0.f12059a;
                            Typography typographyC = o0Var.c(pVar119, 6);
                            t0.t0 t0Var = t0.t0.f140362a;
                            TextStyle textStyleA = TypographyKt.a(typographyC, t0Var.p());
                            final TextStyle textStyleA2 = TypographyKt.a(o0Var.c(pVar119, 6), t0Var.d());
                            androidx.compose.runtime.k1[] k1VarArr = {TextKt.d().f(textStyleA)};
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1110 = pVar116;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111 = content;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1112 = pVar117;
                            final long j1112 = j1110;
                            final long j20 = j1111;
                            final int i2113 = i219;
                            final boolean z19 = z18;
                            CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar119, 835891690, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar1113, int i2114) {
                                    if ((i2114 & 11) == 2 && pVar1113.b()) {
                                        pVar1113.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(835891690, i2114, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:112)");
                                    }
                                    if (pVar1110 == null) {
                                        pVar1113.T(-2104362770);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1114 = pVar1111;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1115 = pVar1112;
                                        TextStyle textStyle = textStyleA2;
                                        long j21 = j1112;
                                        long j22 = j20;
                                        int i30 = i2113;
                                        SnackbarKt.b(pVar1114, null, pVar1115, textStyle, j21, j22, pVar1113, (57344 & (i30 >> 9)) | ((i30 >> 27) & 14) | 48 | (i30 & bb.c.b.f30796me) | ((i30 >> 9) & 458752));
                                        pVar1113.c0();
                                    } else if (z19) {
                                        pVar1113.T(-2104362456);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1116 = pVar1111;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1117 = pVar1110;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar1112;
                                        TextStyle textStyle2 = textStyleA2;
                                        long j23 = j1112;
                                        long j24 = j20;
                                        int i31 = i2113;
                                        SnackbarKt.a(pVar1116, pVar1117, pVar20, textStyle2, j23, j24, pVar1113, (57344 & (i31 >> 9)) | ((i31 >> 27) & 14) | (i31 & 112) | (i31 & bb.c.b.f30796me) | ((i31 >> 9) & 458752));
                                        pVar1113.c0();
                                    } else {
                                        pVar1113.T(-2104362176);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar21 = pVar1111;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar22 = pVar1110;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar23 = pVar1112;
                                        TextStyle textStyle3 = textStyleA2;
                                        long j25 = j1112;
                                        long j26 = j20;
                                        int i32 = i2113;
                                        SnackbarKt.b(pVar21, pVar22, pVar23, textStyle3, j25, j26, pVar1113, (57344 & (i32 >> 9)) | ((i32 >> 27) & 14) | (i32 & 112) | (i32 & bb.c.b.f30796me) | ((i32 >> 9) & 458752));
                                        pVar1113.c0();
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1113, Integer num) {
                                    a(pVar1113, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVar119, 56);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar119, Integer num) {
                            a(pVar119, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, (i2111 & bb.c.g.f32954lc) | i2110 | (i2111 & 112) | (i2111 & bb.c.b.f30796me), 80);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z12 = z11;
                    pVar7 = pVar4;
                    j14 = jC;
                    j15 = jE;
                    j16 = jB;
                    pVar5 = pVar118;
                    nVar2 = nVar3;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i23 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            g2VarF = m1.f12029a.f(pVarF, 6);
                            i12 &= -57345;
                        } else {
                            g2VarF = g2Var;
                        }
                        if ((i11 & 32) != 0) {
                            jC = m1.f12029a.c(pVarF, 6);
                            i12 &= -458753;
                        } else {
                            jC = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jD = m1.f12029a.d(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = m1.f12029a.b(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = m1.f12029a.e(pVarF, 6);
                            i12 &= -234881025;
                        }
                    } else {
                        if (i22 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i23 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            g2VarF = m1.f12029a.f(pVarF, 6);
                            i12 &= -57345;
                        } else {
                            g2VarF = g2Var;
                        }
                        if ((i11 & 32) != 0) {
                            jC = m1.f12029a.c(pVarF, 6);
                            i12 &= -458753;
                        } else {
                            jC = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jD = m1.f12029a.d(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = m1.f12029a.b(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = m1.f12029a.e(pVarF, 6);
                            i12 &= -234881025;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:91)");
                    }
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar119 = pVar4;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1110 = pVar6;
                    final long j1112 = jB;
                    final long j1113 = jE;
                    final int i2112 = i12;
                    final boolean z19 = z11;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111 = pVar6;
                    int i2113 = 12779520 | (i12 & 14);
                    int i2114 = i12 >> 9;
                    SurfaceKt.a(nVar3, g2VarF, jC, jD, 0.0f, t0.t0.f140362a.g(), null, androidx.compose.runtime.internal.b.b(pVarF, -1829663446, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar1112, int i2115) {
                            if ((i2115 & 11) == 2 && pVar1112.b()) {
                                pVar1112.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1829663446, i2115, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:109)");
                            }
                            o0 o0Var = o0.f12059a;
                            Typography typographyC = o0Var.c(pVar1112, 6);
                            t0.t0 t0Var = t0.t0.f140362a;
                            TextStyle textStyleA = TypographyKt.a(typographyC, t0Var.p());
                            final TextStyle textStyleA2 = TypographyKt.a(o0Var.c(pVar1112, 6), t0Var.d());
                            androidx.compose.runtime.k1[] k1VarArr = {TextKt.d().f(textStyleA)};
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1113 = pVar119;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1114 = content;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1115 = pVar1110;
                            final long j1114 = j1112;
                            final long j20 = j1113;
                            final int i2116 = i2112;
                            final boolean z110 = z19;
                            CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar1112, 835891690, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar1116, int i2117) {
                                    if ((i2117 & 11) == 2 && pVar1116.b()) {
                                        pVar1116.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(835891690, i2117, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:112)");
                                    }
                                    if (pVar1113 == null) {
                                        pVar1116.T(-2104362770);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1117 = pVar1114;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1118 = pVar1115;
                                        TextStyle textStyle = textStyleA2;
                                        long j21 = j1114;
                                        long j22 = j20;
                                        int i30 = i2116;
                                        SnackbarKt.b(pVar1117, null, pVar1118, textStyle, j21, j22, pVar1116, (57344 & (i30 >> 9)) | ((i30 >> 27) & 14) | 48 | (i30 & bb.c.b.f30796me) | ((i30 >> 9) & 458752));
                                        pVar1116.c0();
                                    } else if (z110) {
                                        pVar1116.T(-2104362456);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1119 = pVar1114;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11110 = pVar1113;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar1115;
                                        TextStyle textStyle2 = textStyleA2;
                                        long j23 = j1114;
                                        long j24 = j20;
                                        int i31 = i2116;
                                        SnackbarKt.a(pVar1119, pVar11110, pVar20, textStyle2, j23, j24, pVar1116, (57344 & (i31 >> 9)) | ((i31 >> 27) & 14) | (i31 & 112) | (i31 & bb.c.b.f30796me) | ((i31 >> 9) & 458752));
                                        pVar1116.c0();
                                    } else {
                                        pVar1116.T(-2104362176);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar21 = pVar1114;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar22 = pVar1113;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar23 = pVar1115;
                                        TextStyle textStyle3 = textStyleA2;
                                        long j25 = j1114;
                                        long j26 = j20;
                                        int i32 = i2116;
                                        SnackbarKt.b(pVar21, pVar22, pVar23, textStyle3, j25, j26, pVar1116, (57344 & (i32 >> 9)) | ((i32 >> 27) & 14) | (i32 & 112) | (i32 & bb.c.b.f30796me) | ((i32 >> 9) & 458752));
                                        pVar1116.c0();
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1116, Integer num) {
                                    a(pVar1116, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVar1112, 56);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1112, Integer num) {
                            a(pVar1112, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, (i2114 & bb.c.g.f32954lc) | i2113 | (i2114 & 112) | (i2114 & bb.c.b.f30796me), 80);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z12 = z11;
                    pVar7 = pVar4;
                    j14 = jC;
                    j15 = jE;
                    j16 = jB;
                    pVar5 = pVar1111;
                    nVar2 = nVar3;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar7 = nVar2;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1112 = pVar5;
                final long j1114 = jD;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar1113, int i2115) {
                        SnackbarKt.c(nVar7, pVar7, pVar1112, z12, g2VarF, j14, j1114, j16, j15, content, pVar1113, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1113, Integer num) {
                        a(pVar1113, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.b.f30966u4;
            pVar5 = pVar2;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    if (pVarF.u(z10)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((57344 & i10) != 0) {
                    i12 |= ((i11 & 16) == 0 || !pVarF.s(g2Var)) ? 8192 : 16384;
                }
                if ((458752 & i10) != 0) {
                    if ((i11 & 32) == 0) {
                        i21 = 65536;
                    } else {
                        i21 = 65536;
                    }
                    i12 |= i21;
                }
                if ((3670016 & i10) != 0) {
                    if ((i11 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                if ((29360128 & i10) != 0) {
                    if ((i11 & 128) == 0) {
                        i19 = 4194304;
                    } else {
                        i19 = 4194304;
                    }
                    i12 |= i19;
                }
                if ((234881024 & i10) == 0) {
                    jE = j13;
                    if ((i11 & 256) == 0) {
                        i18 = 33554432;
                    } else {
                        i18 = 33554432;
                    }
                    i12 |= i18;
                } else {
                    jE = j13;
                }
                if ((i11 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (pVarF.s(content)) {
                            i17 = 536870912;
                        } else {
                            i17 = 268435456;
                        }
                    }
                    if ((1533916891 & i12) == 306783378) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i23 != 0) {
                                pVar4 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 16) != 0) {
                                g2VarF = m1.f12029a.f(pVarF, 6);
                                i12 &= -57345;
                            } else {
                                g2VarF = g2Var;
                            }
                            if ((i11 & 32) != 0) {
                                jC = m1.f12029a.c(pVarF, 6);
                                i12 &= -458753;
                            } else {
                                jC = j10;
                            }
                            if ((i11 & 64) != 0) {
                                jD = m1.f12029a.d(pVarF, 6);
                                i12 &= -3670017;
                            } else {
                                jD = j11;
                            }
                            if ((i11 & 128) != 0) {
                                jB = m1.f12029a.b(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                jB = j12;
                            }
                            if ((i11 & 256) != 0) {
                                jE = m1.f12029a.e(pVarF, 6);
                                i12 &= -234881025;
                            }
                        } else {
                            if (i22 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i23 != 0) {
                                pVar4 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 16) != 0) {
                                g2VarF = m1.f12029a.f(pVarF, 6);
                                i12 &= -57345;
                            } else {
                                g2VarF = g2Var;
                            }
                            if ((i11 & 32) != 0) {
                                jC = m1.f12029a.c(pVarF, 6);
                                i12 &= -458753;
                            } else {
                                jC = j10;
                            }
                            if ((i11 & 64) != 0) {
                                jD = m1.f12029a.d(pVarF, 6);
                                i12 &= -3670017;
                            } else {
                                jD = j11;
                            }
                            if ((i11 & 128) != 0) {
                                jB = m1.f12029a.b(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                jB = j12;
                            }
                            if ((i11 & 256) != 0) {
                                jE = m1.f12029a.e(pVarF, 6);
                                i12 &= -234881025;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:91)");
                        }
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1113 = pVar4;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1114 = pVar6;
                        final long j1115 = jB;
                        final long j1116 = jE;
                        final int i2115 = i12;
                        final boolean z110 = z11;
                        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1115 = pVar6;
                        int i2116 = 12779520 | (i12 & 14);
                        int i2117 = i12 >> 9;
                        SurfaceKt.a(nVar3, g2VarF, jC, jD, 0.0f, t0.t0.f140362a.g(), null, androidx.compose.runtime.internal.b.b(pVarF, -1829663446, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar1116, int i2118) {
                                if ((i2118 & 11) == 2 && pVar1116.b()) {
                                    pVar1116.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1829663446, i2118, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:109)");
                                }
                                o0 o0Var = o0.f12059a;
                                Typography typographyC = o0Var.c(pVar1116, 6);
                                t0.t0 t0Var = t0.t0.f140362a;
                                TextStyle textStyleA = TypographyKt.a(typographyC, t0Var.p());
                                final TextStyle textStyleA2 = TypographyKt.a(o0Var.c(pVar1116, 6), t0Var.d());
                                androidx.compose.runtime.k1[] k1VarArr = {TextKt.d().f(textStyleA)};
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1117 = pVar1113;
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1118 = content;
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1119 = pVar1114;
                                final long j1117 = j1115;
                                final long j20 = j1116;
                                final int i2119 = i2115;
                                final boolean z111 = z110;
                                CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar1116, 835891690, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar11110, int i21110) {
                                        if ((i21110 & 11) == 2 && pVar11110.b()) {
                                            pVar11110.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(835891690, i21110, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:112)");
                                        }
                                        if (pVar1117 == null) {
                                            pVar11110.T(-2104362770);
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111 = pVar1118;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11112 = pVar1119;
                                            TextStyle textStyle = textStyleA2;
                                            long j21 = j1117;
                                            long j22 = j20;
                                            int i30 = i2119;
                                            SnackbarKt.b(pVar11111, null, pVar11112, textStyle, j21, j22, pVar11110, (57344 & (i30 >> 9)) | ((i30 >> 27) & 14) | 48 | (i30 & bb.c.b.f30796me) | ((i30 >> 9) & 458752));
                                            pVar11110.c0();
                                        } else if (z111) {
                                            pVar11110.T(-2104362456);
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11113 = pVar1118;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11114 = pVar1117;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar1119;
                                            TextStyle textStyle2 = textStyleA2;
                                            long j23 = j1117;
                                            long j24 = j20;
                                            int i31 = i2119;
                                            SnackbarKt.a(pVar11113, pVar11114, pVar20, textStyle2, j23, j24, pVar11110, (57344 & (i31 >> 9)) | ((i31 >> 27) & 14) | (i31 & 112) | (i31 & bb.c.b.f30796me) | ((i31 >> 9) & 458752));
                                            pVar11110.c0();
                                        } else {
                                            pVar11110.T(-2104362176);
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar21 = pVar1118;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar22 = pVar1117;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar23 = pVar1119;
                                            TextStyle textStyle3 = textStyleA2;
                                            long j25 = j1117;
                                            long j26 = j20;
                                            int i32 = i2119;
                                            SnackbarKt.b(pVar21, pVar22, pVar23, textStyle3, j25, j26, pVar11110, (57344 & (i32 >> 9)) | ((i32 >> 27) & 14) | (i32 & 112) | (i32 & bb.c.b.f30796me) | ((i32 >> 9) & 458752));
                                            pVar11110.c0();
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11110, Integer num) {
                                        a(pVar11110, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                }), pVar1116, 56);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1116, Integer num) {
                                a(pVar1116, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, (i2117 & bb.c.g.f32954lc) | i2116 | (i2117 & 112) | (i2117 & bb.c.b.f30796me), 80);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        z12 = z11;
                        pVar7 = pVar4;
                        j14 = jC;
                        j15 = jE;
                        j16 = jB;
                        pVar5 = pVar1115;
                        nVar2 = nVar3;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i23 != 0) {
                                pVar4 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 16) != 0) {
                                g2VarF = m1.f12029a.f(pVarF, 6);
                                i12 &= -57345;
                            } else {
                                g2VarF = g2Var;
                            }
                            if ((i11 & 32) != 0) {
                                jC = m1.f12029a.c(pVarF, 6);
                                i12 &= -458753;
                            } else {
                                jC = j10;
                            }
                            if ((i11 & 64) != 0) {
                                jD = m1.f12029a.d(pVarF, 6);
                                i12 &= -3670017;
                            } else {
                                jD = j11;
                            }
                            if ((i11 & 128) != 0) {
                                jB = m1.f12029a.b(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                jB = j12;
                            }
                            if ((i11 & 256) != 0) {
                                jE = m1.f12029a.e(pVarF, 6);
                                i12 &= -234881025;
                            }
                        } else {
                            if (i22 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i23 != 0) {
                                pVar4 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 16) != 0) {
                                g2VarF = m1.f12029a.f(pVarF, 6);
                                i12 &= -57345;
                            } else {
                                g2VarF = g2Var;
                            }
                            if ((i11 & 32) != 0) {
                                jC = m1.f12029a.c(pVarF, 6);
                                i12 &= -458753;
                            } else {
                                jC = j10;
                            }
                            if ((i11 & 64) != 0) {
                                jD = m1.f12029a.d(pVarF, 6);
                                i12 &= -3670017;
                            } else {
                                jD = j11;
                            }
                            if ((i11 & 128) != 0) {
                                jB = m1.f12029a.b(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                jB = j12;
                            }
                            if ((i11 & 256) != 0) {
                                jE = m1.f12029a.e(pVarF, 6);
                                i12 &= -234881025;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:91)");
                        }
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1116 = pVar4;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1117 = pVar6;
                        final long j1117 = jB;
                        final long j1118 = jE;
                        final int i2118 = i12;
                        final boolean z111 = z11;
                        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1118 = pVar6;
                        int i2119 = 12779520 | (i12 & 14);
                        int i21110 = i12 >> 9;
                        SurfaceKt.a(nVar3, g2VarF, jC, jD, 0.0f, t0.t0.f140362a.g(), null, androidx.compose.runtime.internal.b.b(pVarF, -1829663446, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar1119, int i21111) {
                                if ((i21111 & 11) == 2 && pVar1119.b()) {
                                    pVar1119.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1829663446, i21111, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:109)");
                                }
                                o0 o0Var = o0.f12059a;
                                Typography typographyC = o0Var.c(pVar1119, 6);
                                t0.t0 t0Var = t0.t0.f140362a;
                                TextStyle textStyleA = TypographyKt.a(typographyC, t0Var.p());
                                final TextStyle textStyleA2 = TypographyKt.a(o0Var.c(pVar1119, 6), t0Var.d());
                                androidx.compose.runtime.k1[] k1VarArr = {TextKt.d().f(textStyleA)};
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11110 = pVar1116;
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111 = content;
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11112 = pVar1117;
                                final long j1119 = j1117;
                                final long j20 = j1118;
                                final int i21112 = i2118;
                                final boolean z112 = z111;
                                CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar1119, 835891690, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar11113, int i21113) {
                                        if ((i21113 & 11) == 2 && pVar11113.b()) {
                                            pVar11113.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(835891690, i21113, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:112)");
                                        }
                                        if (pVar11110 == null) {
                                            pVar11113.T(-2104362770);
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11114 = pVar11111;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11115 = pVar11112;
                                            TextStyle textStyle = textStyleA2;
                                            long j21 = j1119;
                                            long j22 = j20;
                                            int i30 = i21112;
                                            SnackbarKt.b(pVar11114, null, pVar11115, textStyle, j21, j22, pVar11113, (57344 & (i30 >> 9)) | ((i30 >> 27) & 14) | 48 | (i30 & bb.c.b.f30796me) | ((i30 >> 9) & 458752));
                                            pVar11113.c0();
                                        } else if (z112) {
                                            pVar11113.T(-2104362456);
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11116 = pVar11111;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11117 = pVar11110;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar11112;
                                            TextStyle textStyle2 = textStyleA2;
                                            long j23 = j1119;
                                            long j24 = j20;
                                            int i31 = i21112;
                                            SnackbarKt.a(pVar11116, pVar11117, pVar20, textStyle2, j23, j24, pVar11113, (57344 & (i31 >> 9)) | ((i31 >> 27) & 14) | (i31 & 112) | (i31 & bb.c.b.f30796me) | ((i31 >> 9) & 458752));
                                            pVar11113.c0();
                                        } else {
                                            pVar11113.T(-2104362176);
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar21 = pVar11111;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar22 = pVar11110;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar23 = pVar11112;
                                            TextStyle textStyle3 = textStyleA2;
                                            long j25 = j1119;
                                            long j26 = j20;
                                            int i32 = i21112;
                                            SnackbarKt.b(pVar21, pVar22, pVar23, textStyle3, j25, j26, pVar11113, (57344 & (i32 >> 9)) | ((i32 >> 27) & 14) | (i32 & 112) | (i32 & bb.c.b.f30796me) | ((i32 >> 9) & 458752));
                                            pVar11113.c0();
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11113, Integer num) {
                                        a(pVar11113, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                }), pVar1119, 56);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1119, Integer num) {
                                a(pVar1119, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, (i21110 & bb.c.g.f32954lc) | i2119 | (i21110 & 112) | (i21110 & bb.c.b.f30796me), 80);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        z12 = z11;
                        pVar7 = pVar4;
                        j14 = jC;
                        j15 = jE;
                        j16 = jB;
                        pVar5 = pVar1118;
                        nVar2 = nVar3;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final androidx.compose.ui.n nVar8 = nVar2;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1119 = pVar5;
                    final long j1119 = jD;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar11110, int i21111) {
                            SnackbarKt.c(nVar8, pVar7, pVar1119, z12, g2VarF, j14, j1119, j16, j15, content, pVar11110, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11110, Integer num) {
                            a(pVar11110, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i17 = com.google.android.exoplayer2.j.G;
                i12 |= i17;
                if ((1533916891 & i12) == 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i23 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            g2VarF = m1.f12029a.f(pVarF, 6);
                            i12 &= -57345;
                        } else {
                            g2VarF = g2Var;
                        }
                        if ((i11 & 32) != 0) {
                            jC = m1.f12029a.c(pVarF, 6);
                            i12 &= -458753;
                        } else {
                            jC = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jD = m1.f12029a.d(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = m1.f12029a.b(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = m1.f12029a.e(pVarF, 6);
                            i12 &= -234881025;
                        }
                    } else {
                        if (i22 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i23 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            g2VarF = m1.f12029a.f(pVarF, 6);
                            i12 &= -57345;
                        } else {
                            g2VarF = g2Var;
                        }
                        if ((i11 & 32) != 0) {
                            jC = m1.f12029a.c(pVarF, 6);
                            i12 &= -458753;
                        } else {
                            jC = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jD = m1.f12029a.d(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = m1.f12029a.b(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = m1.f12029a.e(pVarF, 6);
                            i12 &= -234881025;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:91)");
                    }
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11110 = pVar4;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111 = pVar6;
                    final long j11110 = jB;
                    final long j11111 = jE;
                    final int i21111 = i12;
                    final boolean z112 = z11;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11112 = pVar6;
                    int i21112 = 12779520 | (i12 & 14);
                    int i21113 = i12 >> 9;
                    SurfaceKt.a(nVar3, g2VarF, jC, jD, 0.0f, t0.t0.f140362a.g(), null, androidx.compose.runtime.internal.b.b(pVarF, -1829663446, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar11113, int i21114) {
                            if ((i21114 & 11) == 2 && pVar11113.b()) {
                                pVar11113.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1829663446, i21114, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:109)");
                            }
                            o0 o0Var = o0.f12059a;
                            Typography typographyC = o0Var.c(pVar11113, 6);
                            t0.t0 t0Var = t0.t0.f140362a;
                            TextStyle textStyleA = TypographyKt.a(typographyC, t0Var.p());
                            final TextStyle textStyleA2 = TypographyKt.a(o0Var.c(pVar11113, 6), t0Var.d());
                            androidx.compose.runtime.k1[] k1VarArr = {TextKt.d().f(textStyleA)};
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11114 = pVar11110;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11115 = content;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11116 = pVar11111;
                            final long j11112 = j11110;
                            final long j20 = j11111;
                            final int i21115 = i21111;
                            final boolean z113 = z112;
                            CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar11113, 835891690, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar11117, int i21116) {
                                    if ((i21116 & 11) == 2 && pVar11117.b()) {
                                        pVar11117.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(835891690, i21116, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:112)");
                                    }
                                    if (pVar11114 == null) {
                                        pVar11117.T(-2104362770);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11118 = pVar11115;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11119 = pVar11116;
                                        TextStyle textStyle = textStyleA2;
                                        long j21 = j11112;
                                        long j22 = j20;
                                        int i30 = i21115;
                                        SnackbarKt.b(pVar11118, null, pVar11119, textStyle, j21, j22, pVar11117, (57344 & (i30 >> 9)) | ((i30 >> 27) & 14) | 48 | (i30 & bb.c.b.f30796me) | ((i30 >> 9) & 458752));
                                        pVar11117.c0();
                                    } else if (z113) {
                                        pVar11117.T(-2104362456);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111110 = pVar11115;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111 = pVar11114;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar11116;
                                        TextStyle textStyle2 = textStyleA2;
                                        long j23 = j11112;
                                        long j24 = j20;
                                        int i31 = i21115;
                                        SnackbarKt.a(pVar111110, pVar111111, pVar20, textStyle2, j23, j24, pVar11117, (57344 & (i31 >> 9)) | ((i31 >> 27) & 14) | (i31 & 112) | (i31 & bb.c.b.f30796me) | ((i31 >> 9) & 458752));
                                        pVar11117.c0();
                                    } else {
                                        pVar11117.T(-2104362176);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar21 = pVar11115;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar22 = pVar11114;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar23 = pVar11116;
                                        TextStyle textStyle3 = textStyleA2;
                                        long j25 = j11112;
                                        long j26 = j20;
                                        int i32 = i21115;
                                        SnackbarKt.b(pVar21, pVar22, pVar23, textStyle3, j25, j26, pVar11117, (57344 & (i32 >> 9)) | ((i32 >> 27) & 14) | (i32 & 112) | (i32 & bb.c.b.f30796me) | ((i32 >> 9) & 458752));
                                        pVar11117.c0();
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11117, Integer num) {
                                    a(pVar11117, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVar11113, 56);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11113, Integer num) {
                            a(pVar11113, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, (i21113 & bb.c.g.f32954lc) | i21112 | (i21113 & 112) | (i21113 & bb.c.b.f30796me), 80);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z12 = z11;
                    pVar7 = pVar4;
                    j14 = jC;
                    j15 = jE;
                    j16 = jB;
                    pVar5 = pVar11112;
                    nVar2 = nVar3;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i23 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            g2VarF = m1.f12029a.f(pVarF, 6);
                            i12 &= -57345;
                        } else {
                            g2VarF = g2Var;
                        }
                        if ((i11 & 32) != 0) {
                            jC = m1.f12029a.c(pVarF, 6);
                            i12 &= -458753;
                        } else {
                            jC = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jD = m1.f12029a.d(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = m1.f12029a.b(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = m1.f12029a.e(pVarF, 6);
                            i12 &= -234881025;
                        }
                    } else {
                        if (i22 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i23 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            g2VarF = m1.f12029a.f(pVarF, 6);
                            i12 &= -57345;
                        } else {
                            g2VarF = g2Var;
                        }
                        if ((i11 & 32) != 0) {
                            jC = m1.f12029a.c(pVarF, 6);
                            i12 &= -458753;
                        } else {
                            jC = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jD = m1.f12029a.d(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = m1.f12029a.b(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = m1.f12029a.e(pVarF, 6);
                            i12 &= -234881025;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:91)");
                    }
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11113 = pVar4;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11114 = pVar6;
                    final long j11112 = jB;
                    final long j11113 = jE;
                    final int i21114 = i12;
                    final boolean z113 = z11;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11115 = pVar6;
                    int i21115 = 12779520 | (i12 & 14);
                    int i21116 = i12 >> 9;
                    SurfaceKt.a(nVar3, g2VarF, jC, jD, 0.0f, t0.t0.f140362a.g(), null, androidx.compose.runtime.internal.b.b(pVarF, -1829663446, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar11116, int i21117) {
                            if ((i21117 & 11) == 2 && pVar11116.b()) {
                                pVar11116.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1829663446, i21117, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:109)");
                            }
                            o0 o0Var = o0.f12059a;
                            Typography typographyC = o0Var.c(pVar11116, 6);
                            t0.t0 t0Var = t0.t0.f140362a;
                            TextStyle textStyleA = TypographyKt.a(typographyC, t0Var.p());
                            final TextStyle textStyleA2 = TypographyKt.a(o0Var.c(pVar11116, 6), t0Var.d());
                            androidx.compose.runtime.k1[] k1VarArr = {TextKt.d().f(textStyleA)};
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11117 = pVar11113;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11118 = content;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11119 = pVar11114;
                            final long j11114 = j11112;
                            final long j20 = j11113;
                            final int i21118 = i21114;
                            final boolean z114 = z113;
                            CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar11116, 835891690, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar111110, int i21119) {
                                    if ((i21119 & 11) == 2 && pVar111110.b()) {
                                        pVar111110.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(835891690, i21119, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:112)");
                                    }
                                    if (pVar11117 == null) {
                                        pVar111110.T(-2104362770);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111 = pVar11118;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111112 = pVar11119;
                                        TextStyle textStyle = textStyleA2;
                                        long j21 = j11114;
                                        long j22 = j20;
                                        int i30 = i21118;
                                        SnackbarKt.b(pVar111111, null, pVar111112, textStyle, j21, j22, pVar111110, (57344 & (i30 >> 9)) | ((i30 >> 27) & 14) | 48 | (i30 & bb.c.b.f30796me) | ((i30 >> 9) & 458752));
                                        pVar111110.c0();
                                    } else if (z114) {
                                        pVar111110.T(-2104362456);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111113 = pVar11118;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111114 = pVar11117;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar11119;
                                        TextStyle textStyle2 = textStyleA2;
                                        long j23 = j11114;
                                        long j24 = j20;
                                        int i31 = i21118;
                                        SnackbarKt.a(pVar111113, pVar111114, pVar20, textStyle2, j23, j24, pVar111110, (57344 & (i31 >> 9)) | ((i31 >> 27) & 14) | (i31 & 112) | (i31 & bb.c.b.f30796me) | ((i31 >> 9) & 458752));
                                        pVar111110.c0();
                                    } else {
                                        pVar111110.T(-2104362176);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar21 = pVar11118;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar22 = pVar11117;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar23 = pVar11119;
                                        TextStyle textStyle3 = textStyleA2;
                                        long j25 = j11114;
                                        long j26 = j20;
                                        int i32 = i21118;
                                        SnackbarKt.b(pVar21, pVar22, pVar23, textStyle3, j25, j26, pVar111110, (57344 & (i32 >> 9)) | ((i32 >> 27) & 14) | (i32 & 112) | (i32 & bb.c.b.f30796me) | ((i32 >> 9) & 458752));
                                        pVar111110.c0();
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111110, Integer num) {
                                    a(pVar111110, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVar11116, 56);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11116, Integer num) {
                            a(pVar11116, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, (i21116 & bb.c.g.f32954lc) | i21115 | (i21116 & 112) | (i21116 & bb.c.b.f30796me), 80);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z12 = z11;
                    pVar7 = pVar4;
                    j14 = jC;
                    j15 = jE;
                    j16 = jB;
                    pVar5 = pVar11115;
                    nVar2 = nVar3;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar9 = nVar2;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11116 = pVar5;
                final long j11114 = jD;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar11117, int i21117) {
                        SnackbarKt.c(nVar9, pVar7, pVar11116, z12, g2VarF, j14, j11114, j16, j15, content, pVar11117, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11117, Integer num) {
                        a(pVar11117, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.d.f31193dj;
            if ((57344 & i10) != 0) {
                i12 |= ((i11 & 16) == 0 || !pVarF.s(g2Var)) ? 8192 : 16384;
            }
            if ((458752 & i10) != 0) {
                if ((i11 & 32) == 0) {
                    i21 = 65536;
                } else {
                    i21 = 65536;
                }
                i12 |= i21;
            }
            if ((3670016 & i10) != 0) {
                if ((i11 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            if ((29360128 & i10) != 0) {
                if ((i11 & 128) == 0) {
                    i19 = 4194304;
                } else {
                    i19 = 4194304;
                }
                i12 |= i19;
            }
            if ((234881024 & i10) == 0) {
                jE = j13;
                if ((i11 & 256) == 0) {
                    i18 = 33554432;
                } else {
                    i18 = 33554432;
                }
                i12 |= i18;
            } else {
                jE = j13;
            }
            if ((i11 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (pVarF.s(content)) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                }
                if ((1533916891 & i12) == 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i23 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            g2VarF = m1.f12029a.f(pVarF, 6);
                            i12 &= -57345;
                        } else {
                            g2VarF = g2Var;
                        }
                        if ((i11 & 32) != 0) {
                            jC = m1.f12029a.c(pVarF, 6);
                            i12 &= -458753;
                        } else {
                            jC = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jD = m1.f12029a.d(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = m1.f12029a.b(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = m1.f12029a.e(pVarF, 6);
                            i12 &= -234881025;
                        }
                    } else {
                        if (i22 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i23 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            g2VarF = m1.f12029a.f(pVarF, 6);
                            i12 &= -57345;
                        } else {
                            g2VarF = g2Var;
                        }
                        if ((i11 & 32) != 0) {
                            jC = m1.f12029a.c(pVarF, 6);
                            i12 &= -458753;
                        } else {
                            jC = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jD = m1.f12029a.d(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = m1.f12029a.b(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = m1.f12029a.e(pVarF, 6);
                            i12 &= -234881025;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:91)");
                    }
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11117 = pVar4;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11118 = pVar6;
                    final long j11115 = jB;
                    final long j11116 = jE;
                    final int i21117 = i12;
                    final boolean z114 = z11;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11119 = pVar6;
                    int i21118 = 12779520 | (i12 & 14);
                    int i21119 = i12 >> 9;
                    SurfaceKt.a(nVar3, g2VarF, jC, jD, 0.0f, t0.t0.f140362a.g(), null, androidx.compose.runtime.internal.b.b(pVarF, -1829663446, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar111110, int i211110) {
                            if ((i211110 & 11) == 2 && pVar111110.b()) {
                                pVar111110.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1829663446, i211110, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:109)");
                            }
                            o0 o0Var = o0.f12059a;
                            Typography typographyC = o0Var.c(pVar111110, 6);
                            t0.t0 t0Var = t0.t0.f140362a;
                            TextStyle textStyleA = TypographyKt.a(typographyC, t0Var.p());
                            final TextStyle textStyleA2 = TypographyKt.a(o0Var.c(pVar111110, 6), t0Var.d());
                            androidx.compose.runtime.k1[] k1VarArr = {TextKt.d().f(textStyleA)};
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111 = pVar11117;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111112 = content;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111113 = pVar11118;
                            final long j11117 = j11115;
                            final long j20 = j11116;
                            final int i211111 = i21117;
                            final boolean z115 = z114;
                            CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar111110, 835891690, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar111114, int i211112) {
                                    if ((i211112 & 11) == 2 && pVar111114.b()) {
                                        pVar111114.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(835891690, i211112, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:112)");
                                    }
                                    if (pVar111111 == null) {
                                        pVar111114.T(-2104362770);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111115 = pVar111112;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111116 = pVar111113;
                                        TextStyle textStyle = textStyleA2;
                                        long j21 = j11117;
                                        long j22 = j20;
                                        int i30 = i211111;
                                        SnackbarKt.b(pVar111115, null, pVar111116, textStyle, j21, j22, pVar111114, (57344 & (i30 >> 9)) | ((i30 >> 27) & 14) | 48 | (i30 & bb.c.b.f30796me) | ((i30 >> 9) & 458752));
                                        pVar111114.c0();
                                    } else if (z115) {
                                        pVar111114.T(-2104362456);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111117 = pVar111112;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111118 = pVar111111;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar111113;
                                        TextStyle textStyle2 = textStyleA2;
                                        long j23 = j11117;
                                        long j24 = j20;
                                        int i31 = i211111;
                                        SnackbarKt.a(pVar111117, pVar111118, pVar20, textStyle2, j23, j24, pVar111114, (57344 & (i31 >> 9)) | ((i31 >> 27) & 14) | (i31 & 112) | (i31 & bb.c.b.f30796me) | ((i31 >> 9) & 458752));
                                        pVar111114.c0();
                                    } else {
                                        pVar111114.T(-2104362176);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar21 = pVar111112;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar22 = pVar111111;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar23 = pVar111113;
                                        TextStyle textStyle3 = textStyleA2;
                                        long j25 = j11117;
                                        long j26 = j20;
                                        int i32 = i211111;
                                        SnackbarKt.b(pVar21, pVar22, pVar23, textStyle3, j25, j26, pVar111114, (57344 & (i32 >> 9)) | ((i32 >> 27) & 14) | (i32 & 112) | (i32 & bb.c.b.f30796me) | ((i32 >> 9) & 458752));
                                        pVar111114.c0();
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111114, Integer num) {
                                    a(pVar111114, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVar111110, 56);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111110, Integer num) {
                            a(pVar111110, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, (i21119 & bb.c.g.f32954lc) | i21118 | (i21119 & 112) | (i21119 & bb.c.b.f30796me), 80);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z12 = z11;
                    pVar7 = pVar4;
                    j14 = jC;
                    j15 = jE;
                    j16 = jB;
                    pVar5 = pVar11119;
                    nVar2 = nVar3;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i23 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            g2VarF = m1.f12029a.f(pVarF, 6);
                            i12 &= -57345;
                        } else {
                            g2VarF = g2Var;
                        }
                        if ((i11 & 32) != 0) {
                            jC = m1.f12029a.c(pVarF, 6);
                            i12 &= -458753;
                        } else {
                            jC = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jD = m1.f12029a.d(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = m1.f12029a.b(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = m1.f12029a.e(pVarF, 6);
                            i12 &= -234881025;
                        }
                    } else {
                        if (i22 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i23 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            g2VarF = m1.f12029a.f(pVarF, 6);
                            i12 &= -57345;
                        } else {
                            g2VarF = g2Var;
                        }
                        if ((i11 & 32) != 0) {
                            jC = m1.f12029a.c(pVarF, 6);
                            i12 &= -458753;
                        } else {
                            jC = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jD = m1.f12029a.d(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = m1.f12029a.b(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = m1.f12029a.e(pVarF, 6);
                            i12 &= -234881025;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:91)");
                    }
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111110 = pVar4;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111 = pVar6;
                    final long j11117 = jB;
                    final long j11118 = jE;
                    final int i211110 = i12;
                    final boolean z115 = z11;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111112 = pVar6;
                    int i211111 = 12779520 | (i12 & 14);
                    int i211112 = i12 >> 9;
                    SurfaceKt.a(nVar3, g2VarF, jC, jD, 0.0f, t0.t0.f140362a.g(), null, androidx.compose.runtime.internal.b.b(pVarF, -1829663446, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar111113, int i211113) {
                            if ((i211113 & 11) == 2 && pVar111113.b()) {
                                pVar111113.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1829663446, i211113, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:109)");
                            }
                            o0 o0Var = o0.f12059a;
                            Typography typographyC = o0Var.c(pVar111113, 6);
                            t0.t0 t0Var = t0.t0.f140362a;
                            TextStyle textStyleA = TypographyKt.a(typographyC, t0Var.p());
                            final TextStyle textStyleA2 = TypographyKt.a(o0Var.c(pVar111113, 6), t0Var.d());
                            androidx.compose.runtime.k1[] k1VarArr = {TextKt.d().f(textStyleA)};
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111114 = pVar111110;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111115 = content;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111116 = pVar111111;
                            final long j11119 = j11117;
                            final long j20 = j11118;
                            final int i211114 = i211110;
                            final boolean z116 = z115;
                            CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar111113, 835891690, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar111117, int i211115) {
                                    if ((i211115 & 11) == 2 && pVar111117.b()) {
                                        pVar111117.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(835891690, i211115, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:112)");
                                    }
                                    if (pVar111114 == null) {
                                        pVar111117.T(-2104362770);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111118 = pVar111115;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111119 = pVar111116;
                                        TextStyle textStyle = textStyleA2;
                                        long j21 = j11119;
                                        long j22 = j20;
                                        int i30 = i211114;
                                        SnackbarKt.b(pVar111118, null, pVar111119, textStyle, j21, j22, pVar111117, (57344 & (i30 >> 9)) | ((i30 >> 27) & 14) | 48 | (i30 & bb.c.b.f30796me) | ((i30 >> 9) & 458752));
                                        pVar111117.c0();
                                    } else if (z116) {
                                        pVar111117.T(-2104362456);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111110 = pVar111115;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111 = pVar111114;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar111116;
                                        TextStyle textStyle2 = textStyleA2;
                                        long j23 = j11119;
                                        long j24 = j20;
                                        int i31 = i211114;
                                        SnackbarKt.a(pVar1111110, pVar1111111, pVar20, textStyle2, j23, j24, pVar111117, (57344 & (i31 >> 9)) | ((i31 >> 27) & 14) | (i31 & 112) | (i31 & bb.c.b.f30796me) | ((i31 >> 9) & 458752));
                                        pVar111117.c0();
                                    } else {
                                        pVar111117.T(-2104362176);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar21 = pVar111115;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar22 = pVar111114;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar23 = pVar111116;
                                        TextStyle textStyle3 = textStyleA2;
                                        long j25 = j11119;
                                        long j26 = j20;
                                        int i32 = i211114;
                                        SnackbarKt.b(pVar21, pVar22, pVar23, textStyle3, j25, j26, pVar111117, (57344 & (i32 >> 9)) | ((i32 >> 27) & 14) | (i32 & 112) | (i32 & bb.c.b.f30796me) | ((i32 >> 9) & 458752));
                                        pVar111117.c0();
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111117, Integer num) {
                                    a(pVar111117, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVar111113, 56);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111113, Integer num) {
                            a(pVar111113, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, (i211112 & bb.c.g.f32954lc) | i211111 | (i211112 & 112) | (i211112 & bb.c.b.f30796me), 80);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z12 = z11;
                    pVar7 = pVar4;
                    j14 = jC;
                    j15 = jE;
                    j16 = jB;
                    pVar5 = pVar111112;
                    nVar2 = nVar3;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar10 = nVar2;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111113 = pVar5;
                final long j11119 = jD;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar111114, int i211113) {
                        SnackbarKt.c(nVar10, pVar7, pVar111113, z12, g2VarF, j14, j11119, j16, j15, content, pVar111114, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111114, Integer num) {
                        a(pVar111114, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i17 = com.google.android.exoplayer2.j.G;
            i12 |= i17;
            if ((1533916891 & i12) == 306783378) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i23 != 0) {
                        pVar4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        g2VarF = m1.f12029a.f(pVarF, 6);
                        i12 &= -57345;
                    } else {
                        g2VarF = g2Var;
                    }
                    if ((i11 & 32) != 0) {
                        jC = m1.f12029a.c(pVarF, 6);
                        i12 &= -458753;
                    } else {
                        jC = j10;
                    }
                    if ((i11 & 64) != 0) {
                        jD = m1.f12029a.d(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 128) != 0) {
                        jB = m1.f12029a.b(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i11 & 256) != 0) {
                        jE = m1.f12029a.e(pVarF, 6);
                        i12 &= -234881025;
                    }
                } else {
                    if (i22 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i23 != 0) {
                        pVar4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        g2VarF = m1.f12029a.f(pVarF, 6);
                        i12 &= -57345;
                    } else {
                        g2VarF = g2Var;
                    }
                    if ((i11 & 32) != 0) {
                        jC = m1.f12029a.c(pVarF, 6);
                        i12 &= -458753;
                    } else {
                        jC = j10;
                    }
                    if ((i11 & 64) != 0) {
                        jD = m1.f12029a.d(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 128) != 0) {
                        jB = m1.f12029a.b(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i11 & 256) != 0) {
                        jE = m1.f12029a.e(pVarF, 6);
                        i12 &= -234881025;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:91)");
                }
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111114 = pVar4;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111115 = pVar6;
                final long j111110 = jB;
                final long j111111 = jE;
                final int i211113 = i12;
                final boolean z116 = z11;
                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111116 = pVar6;
                int i211114 = 12779520 | (i12 & 14);
                int i211115 = i12 >> 9;
                SurfaceKt.a(nVar3, g2VarF, jC, jD, 0.0f, t0.t0.f140362a.g(), null, androidx.compose.runtime.internal.b.b(pVarF, -1829663446, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar111117, int i211116) {
                        if ((i211116 & 11) == 2 && pVar111117.b()) {
                            pVar111117.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1829663446, i211116, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:109)");
                        }
                        o0 o0Var = o0.f12059a;
                        Typography typographyC = o0Var.c(pVar111117, 6);
                        t0.t0 t0Var = t0.t0.f140362a;
                        TextStyle textStyleA = TypographyKt.a(typographyC, t0Var.p());
                        final TextStyle textStyleA2 = TypographyKt.a(o0Var.c(pVar111117, 6), t0Var.d());
                        androidx.compose.runtime.k1[] k1VarArr = {TextKt.d().f(textStyleA)};
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111118 = pVar111114;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111119 = content;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111110 = pVar111115;
                        final long j111112 = j111110;
                        final long j20 = j111111;
                        final int i211117 = i211113;
                        final boolean z117 = z116;
                        CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar111117, 835891690, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar1111111, int i211118) {
                                if ((i211118 & 11) == 2 && pVar1111111.b()) {
                                    pVar1111111.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(835891690, i211118, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:112)");
                                }
                                if (pVar111118 == null) {
                                    pVar1111111.T(-2104362770);
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111112 = pVar111119;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111113 = pVar1111110;
                                    TextStyle textStyle = textStyleA2;
                                    long j21 = j111112;
                                    long j22 = j20;
                                    int i30 = i211117;
                                    SnackbarKt.b(pVar1111112, null, pVar1111113, textStyle, j21, j22, pVar1111111, (57344 & (i30 >> 9)) | ((i30 >> 27) & 14) | 48 | (i30 & bb.c.b.f30796me) | ((i30 >> 9) & 458752));
                                    pVar1111111.c0();
                                } else if (z117) {
                                    pVar1111111.T(-2104362456);
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111114 = pVar111119;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111115 = pVar111118;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar1111110;
                                    TextStyle textStyle2 = textStyleA2;
                                    long j23 = j111112;
                                    long j24 = j20;
                                    int i31 = i211117;
                                    SnackbarKt.a(pVar1111114, pVar1111115, pVar20, textStyle2, j23, j24, pVar1111111, (57344 & (i31 >> 9)) | ((i31 >> 27) & 14) | (i31 & 112) | (i31 & bb.c.b.f30796me) | ((i31 >> 9) & 458752));
                                    pVar1111111.c0();
                                } else {
                                    pVar1111111.T(-2104362176);
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar21 = pVar111119;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar22 = pVar111118;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar23 = pVar1111110;
                                    TextStyle textStyle3 = textStyleA2;
                                    long j25 = j111112;
                                    long j26 = j20;
                                    int i32 = i211117;
                                    SnackbarKt.b(pVar21, pVar22, pVar23, textStyle3, j25, j26, pVar1111111, (57344 & (i32 >> 9)) | ((i32 >> 27) & 14) | (i32 & 112) | (i32 & bb.c.b.f30796me) | ((i32 >> 9) & 458752));
                                    pVar1111111.c0();
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111111, Integer num) {
                                a(pVar1111111, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVar111117, 56);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111117, Integer num) {
                        a(pVar111117, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, (i211115 & bb.c.g.f32954lc) | i211114 | (i211115 & 112) | (i211115 & bb.c.b.f30796me), 80);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                z12 = z11;
                pVar7 = pVar4;
                j14 = jC;
                j15 = jE;
                j16 = jB;
                pVar5 = pVar111116;
                nVar2 = nVar3;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i23 != 0) {
                        pVar4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        g2VarF = m1.f12029a.f(pVarF, 6);
                        i12 &= -57345;
                    } else {
                        g2VarF = g2Var;
                    }
                    if ((i11 & 32) != 0) {
                        jC = m1.f12029a.c(pVarF, 6);
                        i12 &= -458753;
                    } else {
                        jC = j10;
                    }
                    if ((i11 & 64) != 0) {
                        jD = m1.f12029a.d(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 128) != 0) {
                        jB = m1.f12029a.b(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i11 & 256) != 0) {
                        jE = m1.f12029a.e(pVarF, 6);
                        i12 &= -234881025;
                    }
                } else {
                    if (i22 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i23 != 0) {
                        pVar4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        g2VarF = m1.f12029a.f(pVarF, 6);
                        i12 &= -57345;
                    } else {
                        g2VarF = g2Var;
                    }
                    if ((i11 & 32) != 0) {
                        jC = m1.f12029a.c(pVarF, 6);
                        i12 &= -458753;
                    } else {
                        jC = j10;
                    }
                    if ((i11 & 64) != 0) {
                        jD = m1.f12029a.d(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 128) != 0) {
                        jB = m1.f12029a.b(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i11 & 256) != 0) {
                        jE = m1.f12029a.e(pVarF, 6);
                        i12 &= -234881025;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:91)");
                }
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111117 = pVar4;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111118 = pVar6;
                final long j111112 = jB;
                final long j111113 = jE;
                final int i211116 = i12;
                final boolean z117 = z11;
                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111119 = pVar6;
                int i211117 = 12779520 | (i12 & 14);
                int i211118 = i12 >> 9;
                SurfaceKt.a(nVar3, g2VarF, jC, jD, 0.0f, t0.t0.f140362a.g(), null, androidx.compose.runtime.internal.b.b(pVarF, -1829663446, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar1111110, int i211119) {
                        if ((i211119 & 11) == 2 && pVar1111110.b()) {
                            pVar1111110.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1829663446, i211119, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:109)");
                        }
                        o0 o0Var = o0.f12059a;
                        Typography typographyC = o0Var.c(pVar1111110, 6);
                        t0.t0 t0Var = t0.t0.f140362a;
                        TextStyle textStyleA = TypographyKt.a(typographyC, t0Var.p());
                        final TextStyle textStyleA2 = TypographyKt.a(o0Var.c(pVar1111110, 6), t0Var.d());
                        androidx.compose.runtime.k1[] k1VarArr = {TextKt.d().f(textStyleA)};
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111 = pVar111117;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111112 = content;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111113 = pVar111118;
                        final long j111114 = j111112;
                        final long j20 = j111113;
                        final int i2111110 = i211116;
                        final boolean z118 = z117;
                        CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar1111110, 835891690, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar1111114, int i2111111) {
                                if ((i2111111 & 11) == 2 && pVar1111114.b()) {
                                    pVar1111114.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(835891690, i2111111, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:112)");
                                }
                                if (pVar1111111 == null) {
                                    pVar1111114.T(-2104362770);
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111115 = pVar1111112;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111116 = pVar1111113;
                                    TextStyle textStyle = textStyleA2;
                                    long j21 = j111114;
                                    long j22 = j20;
                                    int i30 = i2111110;
                                    SnackbarKt.b(pVar1111115, null, pVar1111116, textStyle, j21, j22, pVar1111114, (57344 & (i30 >> 9)) | ((i30 >> 27) & 14) | 48 | (i30 & bb.c.b.f30796me) | ((i30 >> 9) & 458752));
                                    pVar1111114.c0();
                                } else if (z118) {
                                    pVar1111114.T(-2104362456);
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111117 = pVar1111112;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111118 = pVar1111111;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar1111113;
                                    TextStyle textStyle2 = textStyleA2;
                                    long j23 = j111114;
                                    long j24 = j20;
                                    int i31 = i2111110;
                                    SnackbarKt.a(pVar1111117, pVar1111118, pVar20, textStyle2, j23, j24, pVar1111114, (57344 & (i31 >> 9)) | ((i31 >> 27) & 14) | (i31 & 112) | (i31 & bb.c.b.f30796me) | ((i31 >> 9) & 458752));
                                    pVar1111114.c0();
                                } else {
                                    pVar1111114.T(-2104362176);
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar21 = pVar1111112;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar22 = pVar1111111;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar23 = pVar1111113;
                                    TextStyle textStyle3 = textStyleA2;
                                    long j25 = j111114;
                                    long j26 = j20;
                                    int i32 = i2111110;
                                    SnackbarKt.b(pVar21, pVar22, pVar23, textStyle3, j25, j26, pVar1111114, (57344 & (i32 >> 9)) | ((i32 >> 27) & 14) | (i32 & 112) | (i32 & bb.c.b.f30796me) | ((i32 >> 9) & 458752));
                                    pVar1111114.c0();
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111114, Integer num) {
                                a(pVar1111114, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVar1111110, 56);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111110, Integer num) {
                        a(pVar1111110, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, (i211118 & bb.c.g.f32954lc) | i211117 | (i211118 & 112) | (i211118 & bb.c.b.f30796me), 80);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                z12 = z11;
                pVar7 = pVar4;
                j14 = jC;
                j15 = jE;
                j16 = jB;
                pVar5 = pVar111119;
                nVar2 = nVar3;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar11 = nVar2;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111110 = pVar5;
            final long j111114 = jD;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar1111111, int i211119) {
                    SnackbarKt.c(nVar11, pVar7, pVar1111110, z12, g2VarF, j14, j111114, j16, j15, content, pVar1111111, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111111, Integer num) {
                    a(pVar1111111, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= 48;
        pVar4 = pVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & bb.c.b.f30796me) == 0) {
                pVar5 = pVar2;
                if (pVarF.s(pVar5)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    if (pVarF.u(z10)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((57344 & i10) != 0) {
                    i12 |= ((i11 & 16) == 0 || !pVarF.s(g2Var)) ? 8192 : 16384;
                }
                if ((458752 & i10) != 0) {
                    if ((i11 & 32) == 0) {
                        i21 = 65536;
                    } else {
                        i21 = 65536;
                    }
                    i12 |= i21;
                }
                if ((3670016 & i10) != 0) {
                    if ((i11 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                if ((29360128 & i10) != 0) {
                    if ((i11 & 128) == 0) {
                        i19 = 4194304;
                    } else {
                        i19 = 4194304;
                    }
                    i12 |= i19;
                }
                if ((234881024 & i10) == 0) {
                    jE = j13;
                    if ((i11 & 256) == 0) {
                        i18 = 33554432;
                    } else {
                        i18 = 33554432;
                    }
                    i12 |= i18;
                } else {
                    jE = j13;
                }
                if ((i11 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (pVarF.s(content)) {
                            i17 = 536870912;
                        } else {
                            i17 = 268435456;
                        }
                    }
                    if ((1533916891 & i12) == 306783378) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i23 != 0) {
                                pVar4 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 16) != 0) {
                                g2VarF = m1.f12029a.f(pVarF, 6);
                                i12 &= -57345;
                            } else {
                                g2VarF = g2Var;
                            }
                            if ((i11 & 32) != 0) {
                                jC = m1.f12029a.c(pVarF, 6);
                                i12 &= -458753;
                            } else {
                                jC = j10;
                            }
                            if ((i11 & 64) != 0) {
                                jD = m1.f12029a.d(pVarF, 6);
                                i12 &= -3670017;
                            } else {
                                jD = j11;
                            }
                            if ((i11 & 128) != 0) {
                                jB = m1.f12029a.b(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                jB = j12;
                            }
                            if ((i11 & 256) != 0) {
                                jE = m1.f12029a.e(pVarF, 6);
                                i12 &= -234881025;
                            }
                        } else {
                            if (i22 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i23 != 0) {
                                pVar4 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 16) != 0) {
                                g2VarF = m1.f12029a.f(pVarF, 6);
                                i12 &= -57345;
                            } else {
                                g2VarF = g2Var;
                            }
                            if ((i11 & 32) != 0) {
                                jC = m1.f12029a.c(pVarF, 6);
                                i12 &= -458753;
                            } else {
                                jC = j10;
                            }
                            if ((i11 & 64) != 0) {
                                jD = m1.f12029a.d(pVarF, 6);
                                i12 &= -3670017;
                            } else {
                                jD = j11;
                            }
                            if ((i11 & 128) != 0) {
                                jB = m1.f12029a.b(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                jB = j12;
                            }
                            if ((i11 & 256) != 0) {
                                jE = m1.f12029a.e(pVarF, 6);
                                i12 &= -234881025;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:91)");
                        }
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111 = pVar4;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111112 = pVar6;
                        final long j111115 = jB;
                        final long j111116 = jE;
                        final int i211119 = i12;
                        final boolean z118 = z11;
                        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111113 = pVar6;
                        int i2111110 = 12779520 | (i12 & 14);
                        int i2111111 = i12 >> 9;
                        SurfaceKt.a(nVar3, g2VarF, jC, jD, 0.0f, t0.t0.f140362a.g(), null, androidx.compose.runtime.internal.b.b(pVarF, -1829663446, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar1111114, int i2111112) {
                                if ((i2111112 & 11) == 2 && pVar1111114.b()) {
                                    pVar1111114.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1829663446, i2111112, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:109)");
                                }
                                o0 o0Var = o0.f12059a;
                                Typography typographyC = o0Var.c(pVar1111114, 6);
                                t0.t0 t0Var = t0.t0.f140362a;
                                TextStyle textStyleA = TypographyKt.a(typographyC, t0Var.p());
                                final TextStyle textStyleA2 = TypographyKt.a(o0Var.c(pVar1111114, 6), t0Var.d());
                                androidx.compose.runtime.k1[] k1VarArr = {TextKt.d().f(textStyleA)};
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111115 = pVar1111111;
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111116 = content;
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111117 = pVar1111112;
                                final long j111117 = j111115;
                                final long j20 = j111116;
                                final int i2111113 = i211119;
                                final boolean z119 = z118;
                                CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar1111114, 835891690, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar1111118, int i2111114) {
                                        if ((i2111114 & 11) == 2 && pVar1111118.b()) {
                                            pVar1111118.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(835891690, i2111114, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:112)");
                                        }
                                        if (pVar1111115 == null) {
                                            pVar1111118.T(-2104362770);
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111119 = pVar1111116;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111110 = pVar1111117;
                                            TextStyle textStyle = textStyleA2;
                                            long j21 = j111117;
                                            long j22 = j20;
                                            int i30 = i2111113;
                                            SnackbarKt.b(pVar1111119, null, pVar11111110, textStyle, j21, j22, pVar1111118, (57344 & (i30 >> 9)) | ((i30 >> 27) & 14) | 48 | (i30 & bb.c.b.f30796me) | ((i30 >> 9) & 458752));
                                            pVar1111118.c0();
                                        } else if (z119) {
                                            pVar1111118.T(-2104362456);
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111 = pVar1111116;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111112 = pVar1111115;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar1111117;
                                            TextStyle textStyle2 = textStyleA2;
                                            long j23 = j111117;
                                            long j24 = j20;
                                            int i31 = i2111113;
                                            SnackbarKt.a(pVar11111111, pVar11111112, pVar20, textStyle2, j23, j24, pVar1111118, (57344 & (i31 >> 9)) | ((i31 >> 27) & 14) | (i31 & 112) | (i31 & bb.c.b.f30796me) | ((i31 >> 9) & 458752));
                                            pVar1111118.c0();
                                        } else {
                                            pVar1111118.T(-2104362176);
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar21 = pVar1111116;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar22 = pVar1111115;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar23 = pVar1111117;
                                            TextStyle textStyle3 = textStyleA2;
                                            long j25 = j111117;
                                            long j26 = j20;
                                            int i32 = i2111113;
                                            SnackbarKt.b(pVar21, pVar22, pVar23, textStyle3, j25, j26, pVar1111118, (57344 & (i32 >> 9)) | ((i32 >> 27) & 14) | (i32 & 112) | (i32 & bb.c.b.f30796me) | ((i32 >> 9) & 458752));
                                            pVar1111118.c0();
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111118, Integer num) {
                                        a(pVar1111118, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                }), pVar1111114, 56);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111114, Integer num) {
                                a(pVar1111114, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, (i2111111 & bb.c.g.f32954lc) | i2111110 | (i2111111 & 112) | (i2111111 & bb.c.b.f30796me), 80);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        z12 = z11;
                        pVar7 = pVar4;
                        j14 = jC;
                        j15 = jE;
                        j16 = jB;
                        pVar5 = pVar1111113;
                        nVar2 = nVar3;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i23 != 0) {
                                pVar4 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 16) != 0) {
                                g2VarF = m1.f12029a.f(pVarF, 6);
                                i12 &= -57345;
                            } else {
                                g2VarF = g2Var;
                            }
                            if ((i11 & 32) != 0) {
                                jC = m1.f12029a.c(pVarF, 6);
                                i12 &= -458753;
                            } else {
                                jC = j10;
                            }
                            if ((i11 & 64) != 0) {
                                jD = m1.f12029a.d(pVarF, 6);
                                i12 &= -3670017;
                            } else {
                                jD = j11;
                            }
                            if ((i11 & 128) != 0) {
                                jB = m1.f12029a.b(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                jB = j12;
                            }
                            if ((i11 & 256) != 0) {
                                jE = m1.f12029a.e(pVarF, 6);
                                i12 &= -234881025;
                            }
                        } else {
                            if (i22 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i23 != 0) {
                                pVar4 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 16) != 0) {
                                g2VarF = m1.f12029a.f(pVarF, 6);
                                i12 &= -57345;
                            } else {
                                g2VarF = g2Var;
                            }
                            if ((i11 & 32) != 0) {
                                jC = m1.f12029a.c(pVarF, 6);
                                i12 &= -458753;
                            } else {
                                jC = j10;
                            }
                            if ((i11 & 64) != 0) {
                                jD = m1.f12029a.d(pVarF, 6);
                                i12 &= -3670017;
                            } else {
                                jD = j11;
                            }
                            if ((i11 & 128) != 0) {
                                jB = m1.f12029a.b(pVarF, 6);
                                i12 &= -29360129;
                            } else {
                                jB = j12;
                            }
                            if ((i11 & 256) != 0) {
                                jE = m1.f12029a.e(pVarF, 6);
                                i12 &= -234881025;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:91)");
                        }
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111114 = pVar4;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111115 = pVar6;
                        final long j111117 = jB;
                        final long j111118 = jE;
                        final int i2111112 = i12;
                        final boolean z119 = z11;
                        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111116 = pVar6;
                        int i2111113 = 12779520 | (i12 & 14);
                        int i2111114 = i12 >> 9;
                        SurfaceKt.a(nVar3, g2VarF, jC, jD, 0.0f, t0.t0.f140362a.g(), null, androidx.compose.runtime.internal.b.b(pVarF, -1829663446, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar1111117, int i2111115) {
                                if ((i2111115 & 11) == 2 && pVar1111117.b()) {
                                    pVar1111117.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1829663446, i2111115, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:109)");
                                }
                                o0 o0Var = o0.f12059a;
                                Typography typographyC = o0Var.c(pVar1111117, 6);
                                t0.t0 t0Var = t0.t0.f140362a;
                                TextStyle textStyleA = TypographyKt.a(typographyC, t0Var.p());
                                final TextStyle textStyleA2 = TypographyKt.a(o0Var.c(pVar1111117, 6), t0Var.d());
                                androidx.compose.runtime.k1[] k1VarArr = {TextKt.d().f(textStyleA)};
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111118 = pVar1111114;
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111119 = content;
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111110 = pVar1111115;
                                final long j111119 = j111117;
                                final long j20 = j111118;
                                final int i2111116 = i2111112;
                                final boolean z1110 = z119;
                                CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar1111117, 835891690, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar11111111, int i2111117) {
                                        if ((i2111117 & 11) == 2 && pVar11111111.b()) {
                                            pVar11111111.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(835891690, i2111117, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:112)");
                                        }
                                        if (pVar1111118 == null) {
                                            pVar11111111.T(-2104362770);
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111112 = pVar1111119;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111113 = pVar11111110;
                                            TextStyle textStyle = textStyleA2;
                                            long j21 = j111119;
                                            long j22 = j20;
                                            int i30 = i2111116;
                                            SnackbarKt.b(pVar11111112, null, pVar11111113, textStyle, j21, j22, pVar11111111, (57344 & (i30 >> 9)) | ((i30 >> 27) & 14) | 48 | (i30 & bb.c.b.f30796me) | ((i30 >> 9) & 458752));
                                            pVar11111111.c0();
                                        } else if (z1110) {
                                            pVar11111111.T(-2104362456);
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111114 = pVar1111119;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111115 = pVar1111118;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar11111110;
                                            TextStyle textStyle2 = textStyleA2;
                                            long j23 = j111119;
                                            long j24 = j20;
                                            int i31 = i2111116;
                                            SnackbarKt.a(pVar11111114, pVar11111115, pVar20, textStyle2, j23, j24, pVar11111111, (57344 & (i31 >> 9)) | ((i31 >> 27) & 14) | (i31 & 112) | (i31 & bb.c.b.f30796me) | ((i31 >> 9) & 458752));
                                            pVar11111111.c0();
                                        } else {
                                            pVar11111111.T(-2104362176);
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar21 = pVar1111119;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar22 = pVar1111118;
                                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar23 = pVar11111110;
                                            TextStyle textStyle3 = textStyleA2;
                                            long j25 = j111119;
                                            long j26 = j20;
                                            int i32 = i2111116;
                                            SnackbarKt.b(pVar21, pVar22, pVar23, textStyle3, j25, j26, pVar11111111, (57344 & (i32 >> 9)) | ((i32 >> 27) & 14) | (i32 & 112) | (i32 & bb.c.b.f30796me) | ((i32 >> 9) & 458752));
                                            pVar11111111.c0();
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111111, Integer num) {
                                        a(pVar11111111, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                }), pVar1111117, 56);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111117, Integer num) {
                                a(pVar1111117, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, (i2111114 & bb.c.g.f32954lc) | i2111113 | (i2111114 & 112) | (i2111114 & bb.c.b.f30796me), 80);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        z12 = z11;
                        pVar7 = pVar4;
                        j14 = jC;
                        j15 = jE;
                        j16 = jB;
                        pVar5 = pVar1111116;
                        nVar2 = nVar3;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final androidx.compose.ui.n nVar12 = nVar2;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111117 = pVar5;
                    final long j111119 = jD;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar1111118, int i2111115) {
                            SnackbarKt.c(nVar12, pVar7, pVar1111117, z12, g2VarF, j14, j111119, j16, j15, content, pVar1111118, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111118, Integer num) {
                            a(pVar1111118, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i17 = com.google.android.exoplayer2.j.G;
                i12 |= i17;
                if ((1533916891 & i12) == 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i23 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            g2VarF = m1.f12029a.f(pVarF, 6);
                            i12 &= -57345;
                        } else {
                            g2VarF = g2Var;
                        }
                        if ((i11 & 32) != 0) {
                            jC = m1.f12029a.c(pVarF, 6);
                            i12 &= -458753;
                        } else {
                            jC = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jD = m1.f12029a.d(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = m1.f12029a.b(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = m1.f12029a.e(pVarF, 6);
                            i12 &= -234881025;
                        }
                    } else {
                        if (i22 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i23 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            g2VarF = m1.f12029a.f(pVarF, 6);
                            i12 &= -57345;
                        } else {
                            g2VarF = g2Var;
                        }
                        if ((i11 & 32) != 0) {
                            jC = m1.f12029a.c(pVarF, 6);
                            i12 &= -458753;
                        } else {
                            jC = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jD = m1.f12029a.d(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = m1.f12029a.b(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = m1.f12029a.e(pVarF, 6);
                            i12 &= -234881025;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:91)");
                    }
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111118 = pVar4;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111119 = pVar6;
                    final long j1111110 = jB;
                    final long j1111111 = jE;
                    final int i2111115 = i12;
                    final boolean z1110 = z11;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111110 = pVar6;
                    int i2111116 = 12779520 | (i12 & 14);
                    int i2111117 = i12 >> 9;
                    SurfaceKt.a(nVar3, g2VarF, jC, jD, 0.0f, t0.t0.f140362a.g(), null, androidx.compose.runtime.internal.b.b(pVarF, -1829663446, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar11111111, int i2111118) {
                            if ((i2111118 & 11) == 2 && pVar11111111.b()) {
                                pVar11111111.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1829663446, i2111118, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:109)");
                            }
                            o0 o0Var = o0.f12059a;
                            Typography typographyC = o0Var.c(pVar11111111, 6);
                            t0.t0 t0Var = t0.t0.f140362a;
                            TextStyle textStyleA = TypographyKt.a(typographyC, t0Var.p());
                            final TextStyle textStyleA2 = TypographyKt.a(o0Var.c(pVar11111111, 6), t0Var.d());
                            androidx.compose.runtime.k1[] k1VarArr = {TextKt.d().f(textStyleA)};
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111112 = pVar1111118;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111113 = content;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111114 = pVar1111119;
                            final long j1111112 = j1111110;
                            final long j20 = j1111111;
                            final int i2111119 = i2111115;
                            final boolean z1111 = z1110;
                            CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar11111111, 835891690, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar11111115, int i21111110) {
                                    if ((i21111110 & 11) == 2 && pVar11111115.b()) {
                                        pVar11111115.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(835891690, i21111110, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:112)");
                                    }
                                    if (pVar11111112 == null) {
                                        pVar11111115.T(-2104362770);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111116 = pVar11111113;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111117 = pVar11111114;
                                        TextStyle textStyle = textStyleA2;
                                        long j21 = j1111112;
                                        long j22 = j20;
                                        int i30 = i2111119;
                                        SnackbarKt.b(pVar11111116, null, pVar11111117, textStyle, j21, j22, pVar11111115, (57344 & (i30 >> 9)) | ((i30 >> 27) & 14) | 48 | (i30 & bb.c.b.f30796me) | ((i30 >> 9) & 458752));
                                        pVar11111115.c0();
                                    } else if (z1111) {
                                        pVar11111115.T(-2104362456);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111118 = pVar11111113;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111119 = pVar11111112;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar11111114;
                                        TextStyle textStyle2 = textStyleA2;
                                        long j23 = j1111112;
                                        long j24 = j20;
                                        int i31 = i2111119;
                                        SnackbarKt.a(pVar11111118, pVar11111119, pVar20, textStyle2, j23, j24, pVar11111115, (57344 & (i31 >> 9)) | ((i31 >> 27) & 14) | (i31 & 112) | (i31 & bb.c.b.f30796me) | ((i31 >> 9) & 458752));
                                        pVar11111115.c0();
                                    } else {
                                        pVar11111115.T(-2104362176);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar21 = pVar11111113;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar22 = pVar11111112;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar23 = pVar11111114;
                                        TextStyle textStyle3 = textStyleA2;
                                        long j25 = j1111112;
                                        long j26 = j20;
                                        int i32 = i2111119;
                                        SnackbarKt.b(pVar21, pVar22, pVar23, textStyle3, j25, j26, pVar11111115, (57344 & (i32 >> 9)) | ((i32 >> 27) & 14) | (i32 & 112) | (i32 & bb.c.b.f30796me) | ((i32 >> 9) & 458752));
                                        pVar11111115.c0();
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111115, Integer num) {
                                    a(pVar11111115, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVar11111111, 56);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111111, Integer num) {
                            a(pVar11111111, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, (i2111117 & bb.c.g.f32954lc) | i2111116 | (i2111117 & 112) | (i2111117 & bb.c.b.f30796me), 80);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z12 = z11;
                    pVar7 = pVar4;
                    j14 = jC;
                    j15 = jE;
                    j16 = jB;
                    pVar5 = pVar11111110;
                    nVar2 = nVar3;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i23 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            g2VarF = m1.f12029a.f(pVarF, 6);
                            i12 &= -57345;
                        } else {
                            g2VarF = g2Var;
                        }
                        if ((i11 & 32) != 0) {
                            jC = m1.f12029a.c(pVarF, 6);
                            i12 &= -458753;
                        } else {
                            jC = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jD = m1.f12029a.d(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = m1.f12029a.b(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = m1.f12029a.e(pVarF, 6);
                            i12 &= -234881025;
                        }
                    } else {
                        if (i22 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i23 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            g2VarF = m1.f12029a.f(pVarF, 6);
                            i12 &= -57345;
                        } else {
                            g2VarF = g2Var;
                        }
                        if ((i11 & 32) != 0) {
                            jC = m1.f12029a.c(pVarF, 6);
                            i12 &= -458753;
                        } else {
                            jC = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jD = m1.f12029a.d(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = m1.f12029a.b(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = m1.f12029a.e(pVarF, 6);
                            i12 &= -234881025;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:91)");
                    }
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111 = pVar4;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111112 = pVar6;
                    final long j1111112 = jB;
                    final long j1111113 = jE;
                    final int i2111118 = i12;
                    final boolean z1111 = z11;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111113 = pVar6;
                    int i2111119 = 12779520 | (i12 & 14);
                    int i21111110 = i12 >> 9;
                    SurfaceKt.a(nVar3, g2VarF, jC, jD, 0.0f, t0.t0.f140362a.g(), null, androidx.compose.runtime.internal.b.b(pVarF, -1829663446, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar11111114, int i21111111) {
                            if ((i21111111 & 11) == 2 && pVar11111114.b()) {
                                pVar11111114.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1829663446, i21111111, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:109)");
                            }
                            o0 o0Var = o0.f12059a;
                            Typography typographyC = o0Var.c(pVar11111114, 6);
                            t0.t0 t0Var = t0.t0.f140362a;
                            TextStyle textStyleA = TypographyKt.a(typographyC, t0Var.p());
                            final TextStyle textStyleA2 = TypographyKt.a(o0Var.c(pVar11111114, 6), t0Var.d());
                            androidx.compose.runtime.k1[] k1VarArr = {TextKt.d().f(textStyleA)};
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111115 = pVar11111111;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111116 = content;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111117 = pVar11111112;
                            final long j1111114 = j1111112;
                            final long j20 = j1111113;
                            final int i21111112 = i2111118;
                            final boolean z1112 = z1111;
                            CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar11111114, 835891690, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar11111118, int i21111113) {
                                    if ((i21111113 & 11) == 2 && pVar11111118.b()) {
                                        pVar11111118.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(835891690, i21111113, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:112)");
                                    }
                                    if (pVar11111115 == null) {
                                        pVar11111118.T(-2104362770);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111119 = pVar11111116;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111110 = pVar11111117;
                                        TextStyle textStyle = textStyleA2;
                                        long j21 = j1111114;
                                        long j22 = j20;
                                        int i30 = i21111112;
                                        SnackbarKt.b(pVar11111119, null, pVar111111110, textStyle, j21, j22, pVar11111118, (57344 & (i30 >> 9)) | ((i30 >> 27) & 14) | 48 | (i30 & bb.c.b.f30796me) | ((i30 >> 9) & 458752));
                                        pVar11111118.c0();
                                    } else if (z1112) {
                                        pVar11111118.T(-2104362456);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111 = pVar11111116;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111112 = pVar11111115;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar11111117;
                                        TextStyle textStyle2 = textStyleA2;
                                        long j23 = j1111114;
                                        long j24 = j20;
                                        int i31 = i21111112;
                                        SnackbarKt.a(pVar111111111, pVar111111112, pVar20, textStyle2, j23, j24, pVar11111118, (57344 & (i31 >> 9)) | ((i31 >> 27) & 14) | (i31 & 112) | (i31 & bb.c.b.f30796me) | ((i31 >> 9) & 458752));
                                        pVar11111118.c0();
                                    } else {
                                        pVar11111118.T(-2104362176);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar21 = pVar11111116;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar22 = pVar11111115;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar23 = pVar11111117;
                                        TextStyle textStyle3 = textStyleA2;
                                        long j25 = j1111114;
                                        long j26 = j20;
                                        int i32 = i21111112;
                                        SnackbarKt.b(pVar21, pVar22, pVar23, textStyle3, j25, j26, pVar11111118, (57344 & (i32 >> 9)) | ((i32 >> 27) & 14) | (i32 & 112) | (i32 & bb.c.b.f30796me) | ((i32 >> 9) & 458752));
                                        pVar11111118.c0();
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111118, Integer num) {
                                    a(pVar11111118, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVar11111114, 56);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111114, Integer num) {
                            a(pVar11111114, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, (i21111110 & bb.c.g.f32954lc) | i2111119 | (i21111110 & 112) | (i21111110 & bb.c.b.f30796me), 80);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z12 = z11;
                    pVar7 = pVar4;
                    j14 = jC;
                    j15 = jE;
                    j16 = jB;
                    pVar5 = pVar11111113;
                    nVar2 = nVar3;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar13 = nVar2;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111114 = pVar5;
                final long j1111114 = jD;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar11111115, int i21111111) {
                        SnackbarKt.c(nVar13, pVar7, pVar11111114, z12, g2VarF, j14, j1111114, j16, j15, content, pVar11111115, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111115, Integer num) {
                        a(pVar11111115, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.d.f31193dj;
            if ((57344 & i10) != 0) {
                i12 |= ((i11 & 16) == 0 || !pVarF.s(g2Var)) ? 8192 : 16384;
            }
            if ((458752 & i10) != 0) {
                if ((i11 & 32) == 0) {
                    i21 = 65536;
                } else {
                    i21 = 65536;
                }
                i12 |= i21;
            }
            if ((3670016 & i10) != 0) {
                if ((i11 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            if ((29360128 & i10) != 0) {
                if ((i11 & 128) == 0) {
                    i19 = 4194304;
                } else {
                    i19 = 4194304;
                }
                i12 |= i19;
            }
            if ((234881024 & i10) == 0) {
                jE = j13;
                if ((i11 & 256) == 0) {
                    i18 = 33554432;
                } else {
                    i18 = 33554432;
                }
                i12 |= i18;
            } else {
                jE = j13;
            }
            if ((i11 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (pVarF.s(content)) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                }
                if ((1533916891 & i12) == 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i23 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            g2VarF = m1.f12029a.f(pVarF, 6);
                            i12 &= -57345;
                        } else {
                            g2VarF = g2Var;
                        }
                        if ((i11 & 32) != 0) {
                            jC = m1.f12029a.c(pVarF, 6);
                            i12 &= -458753;
                        } else {
                            jC = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jD = m1.f12029a.d(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = m1.f12029a.b(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = m1.f12029a.e(pVarF, 6);
                            i12 &= -234881025;
                        }
                    } else {
                        if (i22 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i23 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            g2VarF = m1.f12029a.f(pVarF, 6);
                            i12 &= -57345;
                        } else {
                            g2VarF = g2Var;
                        }
                        if ((i11 & 32) != 0) {
                            jC = m1.f12029a.c(pVarF, 6);
                            i12 &= -458753;
                        } else {
                            jC = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jD = m1.f12029a.d(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = m1.f12029a.b(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = m1.f12029a.e(pVarF, 6);
                            i12 &= -234881025;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:91)");
                    }
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111115 = pVar4;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111116 = pVar6;
                    final long j1111115 = jB;
                    final long j1111116 = jE;
                    final int i21111111 = i12;
                    final boolean z1112 = z11;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111117 = pVar6;
                    int i21111112 = 12779520 | (i12 & 14);
                    int i21111113 = i12 >> 9;
                    SurfaceKt.a(nVar3, g2VarF, jC, jD, 0.0f, t0.t0.f140362a.g(), null, androidx.compose.runtime.internal.b.b(pVarF, -1829663446, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar11111118, int i21111114) {
                            if ((i21111114 & 11) == 2 && pVar11111118.b()) {
                                pVar11111118.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1829663446, i21111114, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:109)");
                            }
                            o0 o0Var = o0.f12059a;
                            Typography typographyC = o0Var.c(pVar11111118, 6);
                            t0.t0 t0Var = t0.t0.f140362a;
                            TextStyle textStyleA = TypographyKt.a(typographyC, t0Var.p());
                            final TextStyle textStyleA2 = TypographyKt.a(o0Var.c(pVar11111118, 6), t0Var.d());
                            androidx.compose.runtime.k1[] k1VarArr = {TextKt.d().f(textStyleA)};
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111119 = pVar11111115;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111110 = content;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111 = pVar11111116;
                            final long j1111117 = j1111115;
                            final long j20 = j1111116;
                            final int i21111115 = i21111111;
                            final boolean z1113 = z1112;
                            CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar11111118, 835891690, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar111111112, int i21111116) {
                                    if ((i21111116 & 11) == 2 && pVar111111112.b()) {
                                        pVar111111112.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(835891690, i21111116, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:112)");
                                    }
                                    if (pVar11111119 == null) {
                                        pVar111111112.T(-2104362770);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111113 = pVar111111110;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111114 = pVar111111111;
                                        TextStyle textStyle = textStyleA2;
                                        long j21 = j1111117;
                                        long j22 = j20;
                                        int i30 = i21111115;
                                        SnackbarKt.b(pVar111111113, null, pVar111111114, textStyle, j21, j22, pVar111111112, (57344 & (i30 >> 9)) | ((i30 >> 27) & 14) | 48 | (i30 & bb.c.b.f30796me) | ((i30 >> 9) & 458752));
                                        pVar111111112.c0();
                                    } else if (z1113) {
                                        pVar111111112.T(-2104362456);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111115 = pVar111111110;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111116 = pVar11111119;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar111111111;
                                        TextStyle textStyle2 = textStyleA2;
                                        long j23 = j1111117;
                                        long j24 = j20;
                                        int i31 = i21111115;
                                        SnackbarKt.a(pVar111111115, pVar111111116, pVar20, textStyle2, j23, j24, pVar111111112, (57344 & (i31 >> 9)) | ((i31 >> 27) & 14) | (i31 & 112) | (i31 & bb.c.b.f30796me) | ((i31 >> 9) & 458752));
                                        pVar111111112.c0();
                                    } else {
                                        pVar111111112.T(-2104362176);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar21 = pVar111111110;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar22 = pVar11111119;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar23 = pVar111111111;
                                        TextStyle textStyle3 = textStyleA2;
                                        long j25 = j1111117;
                                        long j26 = j20;
                                        int i32 = i21111115;
                                        SnackbarKt.b(pVar21, pVar22, pVar23, textStyle3, j25, j26, pVar111111112, (57344 & (i32 >> 9)) | ((i32 >> 27) & 14) | (i32 & 112) | (i32 & bb.c.b.f30796me) | ((i32 >> 9) & 458752));
                                        pVar111111112.c0();
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111112, Integer num) {
                                    a(pVar111111112, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVar11111118, 56);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111118, Integer num) {
                            a(pVar11111118, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, (i21111113 & bb.c.g.f32954lc) | i21111112 | (i21111113 & 112) | (i21111113 & bb.c.b.f30796me), 80);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z12 = z11;
                    pVar7 = pVar4;
                    j14 = jC;
                    j15 = jE;
                    j16 = jB;
                    pVar5 = pVar11111117;
                    nVar2 = nVar3;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i23 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            g2VarF = m1.f12029a.f(pVarF, 6);
                            i12 &= -57345;
                        } else {
                            g2VarF = g2Var;
                        }
                        if ((i11 & 32) != 0) {
                            jC = m1.f12029a.c(pVarF, 6);
                            i12 &= -458753;
                        } else {
                            jC = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jD = m1.f12029a.d(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = m1.f12029a.b(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = m1.f12029a.e(pVarF, 6);
                            i12 &= -234881025;
                        }
                    } else {
                        if (i22 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i23 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            g2VarF = m1.f12029a.f(pVarF, 6);
                            i12 &= -57345;
                        } else {
                            g2VarF = g2Var;
                        }
                        if ((i11 & 32) != 0) {
                            jC = m1.f12029a.c(pVarF, 6);
                            i12 &= -458753;
                        } else {
                            jC = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jD = m1.f12029a.d(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = m1.f12029a.b(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = m1.f12029a.e(pVarF, 6);
                            i12 &= -234881025;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:91)");
                    }
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111118 = pVar4;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111119 = pVar6;
                    final long j1111117 = jB;
                    final long j1111118 = jE;
                    final int i21111114 = i12;
                    final boolean z1113 = z11;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111110 = pVar6;
                    int i21111115 = 12779520 | (i12 & 14);
                    int i21111116 = i12 >> 9;
                    SurfaceKt.a(nVar3, g2VarF, jC, jD, 0.0f, t0.t0.f140362a.g(), null, androidx.compose.runtime.internal.b.b(pVarF, -1829663446, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar111111111, int i21111117) {
                            if ((i21111117 & 11) == 2 && pVar111111111.b()) {
                                pVar111111111.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1829663446, i21111117, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:109)");
                            }
                            o0 o0Var = o0.f12059a;
                            Typography typographyC = o0Var.c(pVar111111111, 6);
                            t0.t0 t0Var = t0.t0.f140362a;
                            TextStyle textStyleA = TypographyKt.a(typographyC, t0Var.p());
                            final TextStyle textStyleA2 = TypographyKt.a(o0Var.c(pVar111111111, 6), t0Var.d());
                            androidx.compose.runtime.k1[] k1VarArr = {TextKt.d().f(textStyleA)};
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111112 = pVar11111118;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111113 = content;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111114 = pVar11111119;
                            final long j1111119 = j1111117;
                            final long j20 = j1111118;
                            final int i21111118 = i21111114;
                            final boolean z1114 = z1113;
                            CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar111111111, 835891690, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar111111115, int i21111119) {
                                    if ((i21111119 & 11) == 2 && pVar111111115.b()) {
                                        pVar111111115.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(835891690, i21111119, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:112)");
                                    }
                                    if (pVar111111112 == null) {
                                        pVar111111115.T(-2104362770);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111116 = pVar111111113;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111117 = pVar111111114;
                                        TextStyle textStyle = textStyleA2;
                                        long j21 = j1111119;
                                        long j22 = j20;
                                        int i30 = i21111118;
                                        SnackbarKt.b(pVar111111116, null, pVar111111117, textStyle, j21, j22, pVar111111115, (57344 & (i30 >> 9)) | ((i30 >> 27) & 14) | 48 | (i30 & bb.c.b.f30796me) | ((i30 >> 9) & 458752));
                                        pVar111111115.c0();
                                    } else if (z1114) {
                                        pVar111111115.T(-2104362456);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111118 = pVar111111113;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111119 = pVar111111112;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar111111114;
                                        TextStyle textStyle2 = textStyleA2;
                                        long j23 = j1111119;
                                        long j24 = j20;
                                        int i31 = i21111118;
                                        SnackbarKt.a(pVar111111118, pVar111111119, pVar20, textStyle2, j23, j24, pVar111111115, (57344 & (i31 >> 9)) | ((i31 >> 27) & 14) | (i31 & 112) | (i31 & bb.c.b.f30796me) | ((i31 >> 9) & 458752));
                                        pVar111111115.c0();
                                    } else {
                                        pVar111111115.T(-2104362176);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar21 = pVar111111113;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar22 = pVar111111112;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar23 = pVar111111114;
                                        TextStyle textStyle3 = textStyleA2;
                                        long j25 = j1111119;
                                        long j26 = j20;
                                        int i32 = i21111118;
                                        SnackbarKt.b(pVar21, pVar22, pVar23, textStyle3, j25, j26, pVar111111115, (57344 & (i32 >> 9)) | ((i32 >> 27) & 14) | (i32 & 112) | (i32 & bb.c.b.f30796me) | ((i32 >> 9) & 458752));
                                        pVar111111115.c0();
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111115, Integer num) {
                                    a(pVar111111115, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVar111111111, 56);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111111, Integer num) {
                            a(pVar111111111, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, (i21111116 & bb.c.g.f32954lc) | i21111115 | (i21111116 & 112) | (i21111116 & bb.c.b.f30796me), 80);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z12 = z11;
                    pVar7 = pVar4;
                    j14 = jC;
                    j15 = jE;
                    j16 = jB;
                    pVar5 = pVar111111110;
                    nVar2 = nVar3;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar14 = nVar2;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111 = pVar5;
                final long j1111119 = jD;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar111111112, int i21111117) {
                        SnackbarKt.c(nVar14, pVar7, pVar111111111, z12, g2VarF, j14, j1111119, j16, j15, content, pVar111111112, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111112, Integer num) {
                        a(pVar111111112, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i17 = com.google.android.exoplayer2.j.G;
            i12 |= i17;
            if ((1533916891 & i12) == 306783378) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i23 != 0) {
                        pVar4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        g2VarF = m1.f12029a.f(pVarF, 6);
                        i12 &= -57345;
                    } else {
                        g2VarF = g2Var;
                    }
                    if ((i11 & 32) != 0) {
                        jC = m1.f12029a.c(pVarF, 6);
                        i12 &= -458753;
                    } else {
                        jC = j10;
                    }
                    if ((i11 & 64) != 0) {
                        jD = m1.f12029a.d(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 128) != 0) {
                        jB = m1.f12029a.b(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i11 & 256) != 0) {
                        jE = m1.f12029a.e(pVarF, 6);
                        i12 &= -234881025;
                    }
                } else {
                    if (i22 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i23 != 0) {
                        pVar4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        g2VarF = m1.f12029a.f(pVarF, 6);
                        i12 &= -57345;
                    } else {
                        g2VarF = g2Var;
                    }
                    if ((i11 & 32) != 0) {
                        jC = m1.f12029a.c(pVarF, 6);
                        i12 &= -458753;
                    } else {
                        jC = j10;
                    }
                    if ((i11 & 64) != 0) {
                        jD = m1.f12029a.d(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 128) != 0) {
                        jB = m1.f12029a.b(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i11 & 256) != 0) {
                        jE = m1.f12029a.e(pVarF, 6);
                        i12 &= -234881025;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:91)");
                }
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111112 = pVar4;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111113 = pVar6;
                final long j11111110 = jB;
                final long j11111111 = jE;
                final int i21111117 = i12;
                final boolean z1114 = z11;
                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111114 = pVar6;
                int i21111118 = 12779520 | (i12 & 14);
                int i21111119 = i12 >> 9;
                SurfaceKt.a(nVar3, g2VarF, jC, jD, 0.0f, t0.t0.f140362a.g(), null, androidx.compose.runtime.internal.b.b(pVarF, -1829663446, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar111111115, int i211111110) {
                        if ((i211111110 & 11) == 2 && pVar111111115.b()) {
                            pVar111111115.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1829663446, i211111110, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:109)");
                        }
                        o0 o0Var = o0.f12059a;
                        Typography typographyC = o0Var.c(pVar111111115, 6);
                        t0.t0 t0Var = t0.t0.f140362a;
                        TextStyle textStyleA = TypographyKt.a(typographyC, t0Var.p());
                        final TextStyle textStyleA2 = TypographyKt.a(o0Var.c(pVar111111115, 6), t0Var.d());
                        androidx.compose.runtime.k1[] k1VarArr = {TextKt.d().f(textStyleA)};
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111116 = pVar111111112;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111117 = content;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111118 = pVar111111113;
                        final long j11111112 = j11111110;
                        final long j20 = j11111111;
                        final int i211111111 = i21111117;
                        final boolean z1115 = z1114;
                        CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar111111115, 835891690, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar111111119, int i211111112) {
                                if ((i211111112 & 11) == 2 && pVar111111119.b()) {
                                    pVar111111119.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(835891690, i211111112, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:112)");
                                }
                                if (pVar111111116 == null) {
                                    pVar111111119.T(-2104362770);
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111110 = pVar111111117;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111 = pVar111111118;
                                    TextStyle textStyle = textStyleA2;
                                    long j21 = j11111112;
                                    long j22 = j20;
                                    int i30 = i211111111;
                                    SnackbarKt.b(pVar1111111110, null, pVar1111111111, textStyle, j21, j22, pVar111111119, (57344 & (i30 >> 9)) | ((i30 >> 27) & 14) | 48 | (i30 & bb.c.b.f30796me) | ((i30 >> 9) & 458752));
                                    pVar111111119.c0();
                                } else if (z1115) {
                                    pVar111111119.T(-2104362456);
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111112 = pVar111111117;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111113 = pVar111111116;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar111111118;
                                    TextStyle textStyle2 = textStyleA2;
                                    long j23 = j11111112;
                                    long j24 = j20;
                                    int i31 = i211111111;
                                    SnackbarKt.a(pVar1111111112, pVar1111111113, pVar20, textStyle2, j23, j24, pVar111111119, (57344 & (i31 >> 9)) | ((i31 >> 27) & 14) | (i31 & 112) | (i31 & bb.c.b.f30796me) | ((i31 >> 9) & 458752));
                                    pVar111111119.c0();
                                } else {
                                    pVar111111119.T(-2104362176);
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar21 = pVar111111117;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar22 = pVar111111116;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar23 = pVar111111118;
                                    TextStyle textStyle3 = textStyleA2;
                                    long j25 = j11111112;
                                    long j26 = j20;
                                    int i32 = i211111111;
                                    SnackbarKt.b(pVar21, pVar22, pVar23, textStyle3, j25, j26, pVar111111119, (57344 & (i32 >> 9)) | ((i32 >> 27) & 14) | (i32 & 112) | (i32 & bb.c.b.f30796me) | ((i32 >> 9) & 458752));
                                    pVar111111119.c0();
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111119, Integer num) {
                                a(pVar111111119, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVar111111115, 56);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111115, Integer num) {
                        a(pVar111111115, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, (i21111119 & bb.c.g.f32954lc) | i21111118 | (i21111119 & 112) | (i21111119 & bb.c.b.f30796me), 80);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                z12 = z11;
                pVar7 = pVar4;
                j14 = jC;
                j15 = jE;
                j16 = jB;
                pVar5 = pVar111111114;
                nVar2 = nVar3;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i23 != 0) {
                        pVar4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        g2VarF = m1.f12029a.f(pVarF, 6);
                        i12 &= -57345;
                    } else {
                        g2VarF = g2Var;
                    }
                    if ((i11 & 32) != 0) {
                        jC = m1.f12029a.c(pVarF, 6);
                        i12 &= -458753;
                    } else {
                        jC = j10;
                    }
                    if ((i11 & 64) != 0) {
                        jD = m1.f12029a.d(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 128) != 0) {
                        jB = m1.f12029a.b(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i11 & 256) != 0) {
                        jE = m1.f12029a.e(pVarF, 6);
                        i12 &= -234881025;
                    }
                } else {
                    if (i22 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i23 != 0) {
                        pVar4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        g2VarF = m1.f12029a.f(pVarF, 6);
                        i12 &= -57345;
                    } else {
                        g2VarF = g2Var;
                    }
                    if ((i11 & 32) != 0) {
                        jC = m1.f12029a.c(pVarF, 6);
                        i12 &= -458753;
                    } else {
                        jC = j10;
                    }
                    if ((i11 & 64) != 0) {
                        jD = m1.f12029a.d(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 128) != 0) {
                        jB = m1.f12029a.b(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i11 & 256) != 0) {
                        jE = m1.f12029a.e(pVarF, 6);
                        i12 &= -234881025;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:91)");
                }
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111115 = pVar4;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111116 = pVar6;
                final long j11111112 = jB;
                final long j11111113 = jE;
                final int i211111110 = i12;
                final boolean z1115 = z11;
                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111117 = pVar6;
                int i211111111 = 12779520 | (i12 & 14);
                int i211111112 = i12 >> 9;
                SurfaceKt.a(nVar3, g2VarF, jC, jD, 0.0f, t0.t0.f140362a.g(), null, androidx.compose.runtime.internal.b.b(pVarF, -1829663446, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar111111118, int i211111113) {
                        if ((i211111113 & 11) == 2 && pVar111111118.b()) {
                            pVar111111118.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1829663446, i211111113, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:109)");
                        }
                        o0 o0Var = o0.f12059a;
                        Typography typographyC = o0Var.c(pVar111111118, 6);
                        t0.t0 t0Var = t0.t0.f140362a;
                        TextStyle textStyleA = TypographyKt.a(typographyC, t0Var.p());
                        final TextStyle textStyleA2 = TypographyKt.a(o0Var.c(pVar111111118, 6), t0Var.d());
                        androidx.compose.runtime.k1[] k1VarArr = {TextKt.d().f(textStyleA)};
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111119 = pVar111111115;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111110 = content;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111 = pVar111111116;
                        final long j11111114 = j11111112;
                        final long j20 = j11111113;
                        final int i211111114 = i211111110;
                        final boolean z1116 = z1115;
                        CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar111111118, 835891690, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar1111111112, int i211111115) {
                                if ((i211111115 & 11) == 2 && pVar1111111112.b()) {
                                    pVar1111111112.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(835891690, i211111115, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:112)");
                                }
                                if (pVar111111119 == null) {
                                    pVar1111111112.T(-2104362770);
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111113 = pVar1111111110;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111114 = pVar1111111111;
                                    TextStyle textStyle = textStyleA2;
                                    long j21 = j11111114;
                                    long j22 = j20;
                                    int i30 = i211111114;
                                    SnackbarKt.b(pVar1111111113, null, pVar1111111114, textStyle, j21, j22, pVar1111111112, (57344 & (i30 >> 9)) | ((i30 >> 27) & 14) | 48 | (i30 & bb.c.b.f30796me) | ((i30 >> 9) & 458752));
                                    pVar1111111112.c0();
                                } else if (z1116) {
                                    pVar1111111112.T(-2104362456);
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111115 = pVar1111111110;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111116 = pVar111111119;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar1111111111;
                                    TextStyle textStyle2 = textStyleA2;
                                    long j23 = j11111114;
                                    long j24 = j20;
                                    int i31 = i211111114;
                                    SnackbarKt.a(pVar1111111115, pVar1111111116, pVar20, textStyle2, j23, j24, pVar1111111112, (57344 & (i31 >> 9)) | ((i31 >> 27) & 14) | (i31 & 112) | (i31 & bb.c.b.f30796me) | ((i31 >> 9) & 458752));
                                    pVar1111111112.c0();
                                } else {
                                    pVar1111111112.T(-2104362176);
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar21 = pVar1111111110;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar22 = pVar111111119;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar23 = pVar1111111111;
                                    TextStyle textStyle3 = textStyleA2;
                                    long j25 = j11111114;
                                    long j26 = j20;
                                    int i32 = i211111114;
                                    SnackbarKt.b(pVar21, pVar22, pVar23, textStyle3, j25, j26, pVar1111111112, (57344 & (i32 >> 9)) | ((i32 >> 27) & 14) | (i32 & 112) | (i32 & bb.c.b.f30796me) | ((i32 >> 9) & 458752));
                                    pVar1111111112.c0();
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111111112, Integer num) {
                                a(pVar1111111112, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVar111111118, 56);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111118, Integer num) {
                        a(pVar111111118, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, (i211111112 & bb.c.g.f32954lc) | i211111111 | (i211111112 & 112) | (i211111112 & bb.c.b.f30796me), 80);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                z12 = z11;
                pVar7 = pVar4;
                j14 = jC;
                j15 = jE;
                j16 = jB;
                pVar5 = pVar111111117;
                nVar2 = nVar3;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar15 = nVar2;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111118 = pVar5;
            final long j11111114 = jD;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar111111119, int i211111113) {
                    SnackbarKt.c(nVar15, pVar7, pVar111111118, z12, g2VarF, j14, j11111114, j16, j15, content, pVar111111119, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111119, Integer num) {
                    a(pVar111111119, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= bb.c.b.f30966u4;
        pVar5 = pVar2;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & bb.c.g.f32954lc) == 0) {
                if (pVarF.u(z10)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((57344 & i10) != 0) {
                i12 |= ((i11 & 16) == 0 || !pVarF.s(g2Var)) ? 8192 : 16384;
            }
            if ((458752 & i10) != 0) {
                if ((i11 & 32) == 0) {
                    i21 = 65536;
                } else {
                    i21 = 65536;
                }
                i12 |= i21;
            }
            if ((3670016 & i10) != 0) {
                if ((i11 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            if ((29360128 & i10) != 0) {
                if ((i11 & 128) == 0) {
                    i19 = 4194304;
                } else {
                    i19 = 4194304;
                }
                i12 |= i19;
            }
            if ((234881024 & i10) == 0) {
                jE = j13;
                if ((i11 & 256) == 0) {
                    i18 = 33554432;
                } else {
                    i18 = 33554432;
                }
                i12 |= i18;
            } else {
                jE = j13;
            }
            if ((i11 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (pVarF.s(content)) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                }
                if ((1533916891 & i12) == 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i23 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            g2VarF = m1.f12029a.f(pVarF, 6);
                            i12 &= -57345;
                        } else {
                            g2VarF = g2Var;
                        }
                        if ((i11 & 32) != 0) {
                            jC = m1.f12029a.c(pVarF, 6);
                            i12 &= -458753;
                        } else {
                            jC = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jD = m1.f12029a.d(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = m1.f12029a.b(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = m1.f12029a.e(pVarF, 6);
                            i12 &= -234881025;
                        }
                    } else {
                        if (i22 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i23 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            g2VarF = m1.f12029a.f(pVarF, 6);
                            i12 &= -57345;
                        } else {
                            g2VarF = g2Var;
                        }
                        if ((i11 & 32) != 0) {
                            jC = m1.f12029a.c(pVarF, 6);
                            i12 &= -458753;
                        } else {
                            jC = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jD = m1.f12029a.d(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = m1.f12029a.b(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = m1.f12029a.e(pVarF, 6);
                            i12 &= -234881025;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:91)");
                    }
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111119 = pVar4;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111110 = pVar6;
                    final long j11111115 = jB;
                    final long j11111116 = jE;
                    final int i211111113 = i12;
                    final boolean z1116 = z11;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111111 = pVar6;
                    int i211111114 = 12779520 | (i12 & 14);
                    int i211111115 = i12 >> 9;
                    SurfaceKt.a(nVar3, g2VarF, jC, jD, 0.0f, t0.t0.f140362a.g(), null, androidx.compose.runtime.internal.b.b(pVarF, -1829663446, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar1111111112, int i211111116) {
                            if ((i211111116 & 11) == 2 && pVar1111111112.b()) {
                                pVar1111111112.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1829663446, i211111116, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:109)");
                            }
                            o0 o0Var = o0.f12059a;
                            Typography typographyC = o0Var.c(pVar1111111112, 6);
                            t0.t0 t0Var = t0.t0.f140362a;
                            TextStyle textStyleA = TypographyKt.a(typographyC, t0Var.p());
                            final TextStyle textStyleA2 = TypographyKt.a(o0Var.c(pVar1111111112, 6), t0Var.d());
                            androidx.compose.runtime.k1[] k1VarArr = {TextKt.d().f(textStyleA)};
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111113 = pVar111111119;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111114 = content;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111115 = pVar1111111110;
                            final long j11111117 = j11111115;
                            final long j20 = j11111116;
                            final int i211111117 = i211111113;
                            final boolean z1117 = z1116;
                            CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar1111111112, 835891690, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar1111111116, int i211111118) {
                                    if ((i211111118 & 11) == 2 && pVar1111111116.b()) {
                                        pVar1111111116.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(835891690, i211111118, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:112)");
                                    }
                                    if (pVar1111111113 == null) {
                                        pVar1111111116.T(-2104362770);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111117 = pVar1111111114;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111118 = pVar1111111115;
                                        TextStyle textStyle = textStyleA2;
                                        long j21 = j11111117;
                                        long j22 = j20;
                                        int i30 = i211111117;
                                        SnackbarKt.b(pVar1111111117, null, pVar1111111118, textStyle, j21, j22, pVar1111111116, (57344 & (i30 >> 9)) | ((i30 >> 27) & 14) | 48 | (i30 & bb.c.b.f30796me) | ((i30 >> 9) & 458752));
                                        pVar1111111116.c0();
                                    } else if (z1117) {
                                        pVar1111111116.T(-2104362456);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111119 = pVar1111111114;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111110 = pVar1111111113;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar1111111115;
                                        TextStyle textStyle2 = textStyleA2;
                                        long j23 = j11111117;
                                        long j24 = j20;
                                        int i31 = i211111117;
                                        SnackbarKt.a(pVar1111111119, pVar11111111110, pVar20, textStyle2, j23, j24, pVar1111111116, (57344 & (i31 >> 9)) | ((i31 >> 27) & 14) | (i31 & 112) | (i31 & bb.c.b.f30796me) | ((i31 >> 9) & 458752));
                                        pVar1111111116.c0();
                                    } else {
                                        pVar1111111116.T(-2104362176);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar21 = pVar1111111114;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar22 = pVar1111111113;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar23 = pVar1111111115;
                                        TextStyle textStyle3 = textStyleA2;
                                        long j25 = j11111117;
                                        long j26 = j20;
                                        int i32 = i211111117;
                                        SnackbarKt.b(pVar21, pVar22, pVar23, textStyle3, j25, j26, pVar1111111116, (57344 & (i32 >> 9)) | ((i32 >> 27) & 14) | (i32 & 112) | (i32 & bb.c.b.f30796me) | ((i32 >> 9) & 458752));
                                        pVar1111111116.c0();
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111111116, Integer num) {
                                    a(pVar1111111116, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVar1111111112, 56);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111111112, Integer num) {
                            a(pVar1111111112, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, (i211111115 & bb.c.g.f32954lc) | i211111114 | (i211111115 & 112) | (i211111115 & bb.c.b.f30796me), 80);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z12 = z11;
                    pVar7 = pVar4;
                    j14 = jC;
                    j15 = jE;
                    j16 = jB;
                    pVar5 = pVar1111111111;
                    nVar2 = nVar3;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i23 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            g2VarF = m1.f12029a.f(pVarF, 6);
                            i12 &= -57345;
                        } else {
                            g2VarF = g2Var;
                        }
                        if ((i11 & 32) != 0) {
                            jC = m1.f12029a.c(pVarF, 6);
                            i12 &= -458753;
                        } else {
                            jC = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jD = m1.f12029a.d(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = m1.f12029a.b(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = m1.f12029a.e(pVarF, 6);
                            i12 &= -234881025;
                        }
                    } else {
                        if (i22 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i23 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 16) != 0) {
                            g2VarF = m1.f12029a.f(pVarF, 6);
                            i12 &= -57345;
                        } else {
                            g2VarF = g2Var;
                        }
                        if ((i11 & 32) != 0) {
                            jC = m1.f12029a.c(pVarF, 6);
                            i12 &= -458753;
                        } else {
                            jC = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jD = m1.f12029a.d(pVarF, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = m1.f12029a.b(pVarF, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = m1.f12029a.e(pVarF, 6);
                            i12 &= -234881025;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:91)");
                    }
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111112 = pVar4;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111113 = pVar6;
                    final long j11111117 = jB;
                    final long j11111118 = jE;
                    final int i211111116 = i12;
                    final boolean z1117 = z11;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111114 = pVar6;
                    int i211111117 = 12779520 | (i12 & 14);
                    int i211111118 = i12 >> 9;
                    SurfaceKt.a(nVar3, g2VarF, jC, jD, 0.0f, t0.t0.f140362a.g(), null, androidx.compose.runtime.internal.b.b(pVarF, -1829663446, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar1111111115, int i211111119) {
                            if ((i211111119 & 11) == 2 && pVar1111111115.b()) {
                                pVar1111111115.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1829663446, i211111119, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:109)");
                            }
                            o0 o0Var = o0.f12059a;
                            Typography typographyC = o0Var.c(pVar1111111115, 6);
                            t0.t0 t0Var = t0.t0.f140362a;
                            TextStyle textStyleA = TypographyKt.a(typographyC, t0Var.p());
                            final TextStyle textStyleA2 = TypographyKt.a(o0Var.c(pVar1111111115, 6), t0Var.d());
                            androidx.compose.runtime.k1[] k1VarArr = {TextKt.d().f(textStyleA)};
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111116 = pVar1111111112;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111117 = content;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111118 = pVar1111111113;
                            final long j11111119 = j11111117;
                            final long j20 = j11111118;
                            final int i2111111110 = i211111116;
                            final boolean z1118 = z1117;
                            CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar1111111115, 835891690, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar1111111119, int i2111111111) {
                                    if ((i2111111111 & 11) == 2 && pVar1111111119.b()) {
                                        pVar1111111119.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(835891690, i2111111111, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:112)");
                                    }
                                    if (pVar1111111116 == null) {
                                        pVar1111111119.T(-2104362770);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111110 = pVar1111111117;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111111 = pVar1111111118;
                                        TextStyle textStyle = textStyleA2;
                                        long j21 = j11111119;
                                        long j22 = j20;
                                        int i30 = i2111111110;
                                        SnackbarKt.b(pVar11111111110, null, pVar11111111111, textStyle, j21, j22, pVar1111111119, (57344 & (i30 >> 9)) | ((i30 >> 27) & 14) | 48 | (i30 & bb.c.b.f30796me) | ((i30 >> 9) & 458752));
                                        pVar1111111119.c0();
                                    } else if (z1118) {
                                        pVar1111111119.T(-2104362456);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111112 = pVar1111111117;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111113 = pVar1111111116;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar1111111118;
                                        TextStyle textStyle2 = textStyleA2;
                                        long j23 = j11111119;
                                        long j24 = j20;
                                        int i31 = i2111111110;
                                        SnackbarKt.a(pVar11111111112, pVar11111111113, pVar20, textStyle2, j23, j24, pVar1111111119, (57344 & (i31 >> 9)) | ((i31 >> 27) & 14) | (i31 & 112) | (i31 & bb.c.b.f30796me) | ((i31 >> 9) & 458752));
                                        pVar1111111119.c0();
                                    } else {
                                        pVar1111111119.T(-2104362176);
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar21 = pVar1111111117;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar22 = pVar1111111116;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar23 = pVar1111111118;
                                        TextStyle textStyle3 = textStyleA2;
                                        long j25 = j11111119;
                                        long j26 = j20;
                                        int i32 = i2111111110;
                                        SnackbarKt.b(pVar21, pVar22, pVar23, textStyle3, j25, j26, pVar1111111119, (57344 & (i32 >> 9)) | ((i32 >> 27) & 14) | (i32 & 112) | (i32 & bb.c.b.f30796me) | ((i32 >> 9) & 458752));
                                        pVar1111111119.c0();
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111111119, Integer num) {
                                    a(pVar1111111119, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVar1111111115, 56);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111111115, Integer num) {
                            a(pVar1111111115, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, (i211111118 & bb.c.g.f32954lc) | i211111117 | (i211111118 & 112) | (i211111118 & bb.c.b.f30796me), 80);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z12 = z11;
                    pVar7 = pVar4;
                    j14 = jC;
                    j15 = jE;
                    j16 = jB;
                    pVar5 = pVar1111111114;
                    nVar2 = nVar3;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar16 = nVar2;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111115 = pVar5;
                final long j11111119 = jD;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar1111111116, int i211111119) {
                        SnackbarKt.c(nVar16, pVar7, pVar1111111115, z12, g2VarF, j14, j11111119, j16, j15, content, pVar1111111116, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111111116, Integer num) {
                        a(pVar1111111116, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i17 = com.google.android.exoplayer2.j.G;
            i12 |= i17;
            if ((1533916891 & i12) == 306783378) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i23 != 0) {
                        pVar4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        g2VarF = m1.f12029a.f(pVarF, 6);
                        i12 &= -57345;
                    } else {
                        g2VarF = g2Var;
                    }
                    if ((i11 & 32) != 0) {
                        jC = m1.f12029a.c(pVarF, 6);
                        i12 &= -458753;
                    } else {
                        jC = j10;
                    }
                    if ((i11 & 64) != 0) {
                        jD = m1.f12029a.d(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 128) != 0) {
                        jB = m1.f12029a.b(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i11 & 256) != 0) {
                        jE = m1.f12029a.e(pVarF, 6);
                        i12 &= -234881025;
                    }
                } else {
                    if (i22 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i23 != 0) {
                        pVar4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        g2VarF = m1.f12029a.f(pVarF, 6);
                        i12 &= -57345;
                    } else {
                        g2VarF = g2Var;
                    }
                    if ((i11 & 32) != 0) {
                        jC = m1.f12029a.c(pVarF, 6);
                        i12 &= -458753;
                    } else {
                        jC = j10;
                    }
                    if ((i11 & 64) != 0) {
                        jD = m1.f12029a.d(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 128) != 0) {
                        jB = m1.f12029a.b(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i11 & 256) != 0) {
                        jE = m1.f12029a.e(pVarF, 6);
                        i12 &= -234881025;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:91)");
                }
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111116 = pVar4;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111117 = pVar6;
                final long j111111110 = jB;
                final long j111111111 = jE;
                final int i211111119 = i12;
                final boolean z1118 = z11;
                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111118 = pVar6;
                int i2111111110 = 12779520 | (i12 & 14);
                int i2111111111 = i12 >> 9;
                SurfaceKt.a(nVar3, g2VarF, jC, jD, 0.0f, t0.t0.f140362a.g(), null, androidx.compose.runtime.internal.b.b(pVarF, -1829663446, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar1111111119, int i2111111112) {
                        if ((i2111111112 & 11) == 2 && pVar1111111119.b()) {
                            pVar1111111119.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1829663446, i2111111112, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:109)");
                        }
                        o0 o0Var = o0.f12059a;
                        Typography typographyC = o0Var.c(pVar1111111119, 6);
                        t0.t0 t0Var = t0.t0.f140362a;
                        TextStyle textStyleA = TypographyKt.a(typographyC, t0Var.p());
                        final TextStyle textStyleA2 = TypographyKt.a(o0Var.c(pVar1111111119, 6), t0Var.d());
                        androidx.compose.runtime.k1[] k1VarArr = {TextKt.d().f(textStyleA)};
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111110 = pVar1111111116;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111 = content;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111112 = pVar1111111117;
                        final long j111111112 = j111111110;
                        final long j20 = j111111111;
                        final int i2111111113 = i211111119;
                        final boolean z1119 = z1118;
                        CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar1111111119, 835891690, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar11111111113, int i2111111114) {
                                if ((i2111111114 & 11) == 2 && pVar11111111113.b()) {
                                    pVar11111111113.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(835891690, i2111111114, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:112)");
                                }
                                if (pVar11111111110 == null) {
                                    pVar11111111113.T(-2104362770);
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111114 = pVar11111111111;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111115 = pVar11111111112;
                                    TextStyle textStyle = textStyleA2;
                                    long j21 = j111111112;
                                    long j22 = j20;
                                    int i30 = i2111111113;
                                    SnackbarKt.b(pVar11111111114, null, pVar11111111115, textStyle, j21, j22, pVar11111111113, (57344 & (i30 >> 9)) | ((i30 >> 27) & 14) | 48 | (i30 & bb.c.b.f30796me) | ((i30 >> 9) & 458752));
                                    pVar11111111113.c0();
                                } else if (z1119) {
                                    pVar11111111113.T(-2104362456);
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111116 = pVar11111111111;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111117 = pVar11111111110;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar11111111112;
                                    TextStyle textStyle2 = textStyleA2;
                                    long j23 = j111111112;
                                    long j24 = j20;
                                    int i31 = i2111111113;
                                    SnackbarKt.a(pVar11111111116, pVar11111111117, pVar20, textStyle2, j23, j24, pVar11111111113, (57344 & (i31 >> 9)) | ((i31 >> 27) & 14) | (i31 & 112) | (i31 & bb.c.b.f30796me) | ((i31 >> 9) & 458752));
                                    pVar11111111113.c0();
                                } else {
                                    pVar11111111113.T(-2104362176);
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar21 = pVar11111111111;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar22 = pVar11111111110;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar23 = pVar11111111112;
                                    TextStyle textStyle3 = textStyleA2;
                                    long j25 = j111111112;
                                    long j26 = j20;
                                    int i32 = i2111111113;
                                    SnackbarKt.b(pVar21, pVar22, pVar23, textStyle3, j25, j26, pVar11111111113, (57344 & (i32 >> 9)) | ((i32 >> 27) & 14) | (i32 & 112) | (i32 & bb.c.b.f30796me) | ((i32 >> 9) & 458752));
                                    pVar11111111113.c0();
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111111113, Integer num) {
                                a(pVar11111111113, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVar1111111119, 56);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111111119, Integer num) {
                        a(pVar1111111119, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, (i2111111111 & bb.c.g.f32954lc) | i2111111110 | (i2111111111 & 112) | (i2111111111 & bb.c.b.f30796me), 80);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                z12 = z11;
                pVar7 = pVar4;
                j14 = jC;
                j15 = jE;
                j16 = jB;
                pVar5 = pVar1111111118;
                nVar2 = nVar3;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i23 != 0) {
                        pVar4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        g2VarF = m1.f12029a.f(pVarF, 6);
                        i12 &= -57345;
                    } else {
                        g2VarF = g2Var;
                    }
                    if ((i11 & 32) != 0) {
                        jC = m1.f12029a.c(pVarF, 6);
                        i12 &= -458753;
                    } else {
                        jC = j10;
                    }
                    if ((i11 & 64) != 0) {
                        jD = m1.f12029a.d(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 128) != 0) {
                        jB = m1.f12029a.b(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i11 & 256) != 0) {
                        jE = m1.f12029a.e(pVarF, 6);
                        i12 &= -234881025;
                    }
                } else {
                    if (i22 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i23 != 0) {
                        pVar4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        g2VarF = m1.f12029a.f(pVarF, 6);
                        i12 &= -57345;
                    } else {
                        g2VarF = g2Var;
                    }
                    if ((i11 & 32) != 0) {
                        jC = m1.f12029a.c(pVarF, 6);
                        i12 &= -458753;
                    } else {
                        jC = j10;
                    }
                    if ((i11 & 64) != 0) {
                        jD = m1.f12029a.d(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 128) != 0) {
                        jB = m1.f12029a.b(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i11 & 256) != 0) {
                        jE = m1.f12029a.e(pVarF, 6);
                        i12 &= -234881025;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:91)");
                }
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111119 = pVar4;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111110 = pVar6;
                final long j111111112 = jB;
                final long j111111113 = jE;
                final int i2111111112 = i12;
                final boolean z1119 = z11;
                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111111 = pVar6;
                int i2111111113 = 12779520 | (i12 & 14);
                int i2111111114 = i12 >> 9;
                SurfaceKt.a(nVar3, g2VarF, jC, jD, 0.0f, t0.t0.f140362a.g(), null, androidx.compose.runtime.internal.b.b(pVarF, -1829663446, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar11111111112, int i2111111115) {
                        if ((i2111111115 & 11) == 2 && pVar11111111112.b()) {
                            pVar11111111112.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1829663446, i2111111115, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:109)");
                        }
                        o0 o0Var = o0.f12059a;
                        Typography typographyC = o0Var.c(pVar11111111112, 6);
                        t0.t0 t0Var = t0.t0.f140362a;
                        TextStyle textStyleA = TypographyKt.a(typographyC, t0Var.p());
                        final TextStyle textStyleA2 = TypographyKt.a(o0Var.c(pVar11111111112, 6), t0Var.d());
                        androidx.compose.runtime.k1[] k1VarArr = {TextKt.d().f(textStyleA)};
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111113 = pVar1111111119;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111114 = content;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111115 = pVar11111111110;
                        final long j111111114 = j111111112;
                        final long j20 = j111111113;
                        final int i2111111116 = i2111111112;
                        final boolean z11110 = z1119;
                        CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar11111111112, 835891690, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar11111111116, int i2111111117) {
                                if ((i2111111117 & 11) == 2 && pVar11111111116.b()) {
                                    pVar11111111116.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(835891690, i2111111117, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:112)");
                                }
                                if (pVar11111111113 == null) {
                                    pVar11111111116.T(-2104362770);
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111117 = pVar11111111114;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111118 = pVar11111111115;
                                    TextStyle textStyle = textStyleA2;
                                    long j21 = j111111114;
                                    long j22 = j20;
                                    int i30 = i2111111116;
                                    SnackbarKt.b(pVar11111111117, null, pVar11111111118, textStyle, j21, j22, pVar11111111116, (57344 & (i30 >> 9)) | ((i30 >> 27) & 14) | 48 | (i30 & bb.c.b.f30796me) | ((i30 >> 9) & 458752));
                                    pVar11111111116.c0();
                                } else if (z11110) {
                                    pVar11111111116.T(-2104362456);
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111111119 = pVar11111111114;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111110 = pVar11111111113;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar11111111115;
                                    TextStyle textStyle2 = textStyleA2;
                                    long j23 = j111111114;
                                    long j24 = j20;
                                    int i31 = i2111111116;
                                    SnackbarKt.a(pVar11111111119, pVar111111111110, pVar20, textStyle2, j23, j24, pVar11111111116, (57344 & (i31 >> 9)) | ((i31 >> 27) & 14) | (i31 & 112) | (i31 & bb.c.b.f30796me) | ((i31 >> 9) & 458752));
                                    pVar11111111116.c0();
                                } else {
                                    pVar11111111116.T(-2104362176);
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar21 = pVar11111111114;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar22 = pVar11111111113;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar23 = pVar11111111115;
                                    TextStyle textStyle3 = textStyleA2;
                                    long j25 = j111111114;
                                    long j26 = j20;
                                    int i32 = i2111111116;
                                    SnackbarKt.b(pVar21, pVar22, pVar23, textStyle3, j25, j26, pVar11111111116, (57344 & (i32 >> 9)) | ((i32 >> 27) & 14) | (i32 & 112) | (i32 & bb.c.b.f30796me) | ((i32 >> 9) & 458752));
                                    pVar11111111116.c0();
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111111116, Integer num) {
                                a(pVar11111111116, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVar11111111112, 56);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111111112, Integer num) {
                        a(pVar11111111112, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, (i2111111114 & bb.c.g.f32954lc) | i2111111113 | (i2111111114 & 112) | (i2111111114 & bb.c.b.f30796me), 80);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                z12 = z11;
                pVar7 = pVar4;
                j14 = jC;
                j15 = jE;
                j16 = jB;
                pVar5 = pVar11111111111;
                nVar2 = nVar3;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar17 = nVar2;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111112 = pVar5;
            final long j111111114 = jD;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar11111111113, int i2111111115) {
                    SnackbarKt.c(nVar17, pVar7, pVar11111111112, z12, g2VarF, j14, j111111114, j16, j15, content, pVar11111111113, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111111113, Integer num) {
                    a(pVar11111111113, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= bb.c.d.f31193dj;
        if ((57344 & i10) != 0) {
            i12 |= ((i11 & 16) == 0 || !pVarF.s(g2Var)) ? 8192 : 16384;
        }
        if ((458752 & i10) != 0) {
            if ((i11 & 32) == 0) {
                i21 = 65536;
            } else {
                i21 = 65536;
            }
            i12 |= i21;
        }
        if ((3670016 & i10) != 0) {
            if ((i11 & 64) == 0) {
                i20 = 524288;
            } else {
                i20 = 524288;
            }
            i12 |= i20;
        }
        if ((29360128 & i10) != 0) {
            if ((i11 & 128) == 0) {
                i19 = 4194304;
            } else {
                i19 = 4194304;
            }
            i12 |= i19;
        }
        if ((234881024 & i10) == 0) {
            jE = j13;
            if ((i11 & 256) == 0) {
                i18 = 33554432;
            } else {
                i18 = 33554432;
            }
            i12 |= i18;
        } else {
            jE = j13;
        }
        if ((i11 & 512) != 0) {
            if ((1879048192 & i10) == 0) {
                if (pVarF.s(content)) {
                    i17 = 536870912;
                } else {
                    i17 = 268435456;
                }
            }
            if ((1533916891 & i12) == 306783378) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i23 != 0) {
                        pVar4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        g2VarF = m1.f12029a.f(pVarF, 6);
                        i12 &= -57345;
                    } else {
                        g2VarF = g2Var;
                    }
                    if ((i11 & 32) != 0) {
                        jC = m1.f12029a.c(pVarF, 6);
                        i12 &= -458753;
                    } else {
                        jC = j10;
                    }
                    if ((i11 & 64) != 0) {
                        jD = m1.f12029a.d(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 128) != 0) {
                        jB = m1.f12029a.b(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i11 & 256) != 0) {
                        jE = m1.f12029a.e(pVarF, 6);
                        i12 &= -234881025;
                    }
                } else {
                    if (i22 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i23 != 0) {
                        pVar4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        g2VarF = m1.f12029a.f(pVarF, 6);
                        i12 &= -57345;
                    } else {
                        g2VarF = g2Var;
                    }
                    if ((i11 & 32) != 0) {
                        jC = m1.f12029a.c(pVarF, 6);
                        i12 &= -458753;
                    } else {
                        jC = j10;
                    }
                    if ((i11 & 64) != 0) {
                        jD = m1.f12029a.d(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 128) != 0) {
                        jB = m1.f12029a.b(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i11 & 256) != 0) {
                        jE = m1.f12029a.e(pVarF, 6);
                        i12 &= -234881025;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:91)");
                }
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111113 = pVar4;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111114 = pVar6;
                final long j111111115 = jB;
                final long j111111116 = jE;
                final int i2111111115 = i12;
                final boolean z11110 = z11;
                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111115 = pVar6;
                int i2111111116 = 12779520 | (i12 & 14);
                int i2111111117 = i12 >> 9;
                SurfaceKt.a(nVar3, g2VarF, jC, jD, 0.0f, t0.t0.f140362a.g(), null, androidx.compose.runtime.internal.b.b(pVarF, -1829663446, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar11111111116, int i2111111118) {
                        if ((i2111111118 & 11) == 2 && pVar11111111116.b()) {
                            pVar11111111116.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1829663446, i2111111118, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:109)");
                        }
                        o0 o0Var = o0.f12059a;
                        Typography typographyC = o0Var.c(pVar11111111116, 6);
                        t0.t0 t0Var = t0.t0.f140362a;
                        TextStyle textStyleA = TypographyKt.a(typographyC, t0Var.p());
                        final TextStyle textStyleA2 = TypographyKt.a(o0Var.c(pVar11111111116, 6), t0Var.d());
                        androidx.compose.runtime.k1[] k1VarArr = {TextKt.d().f(textStyleA)};
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111117 = pVar11111111113;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111118 = content;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111119 = pVar11111111114;
                        final long j111111117 = j111111115;
                        final long j20 = j111111116;
                        final int i2111111119 = i2111111115;
                        final boolean z11111 = z11110;
                        CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar11111111116, 835891690, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar111111111110, int i21111111110) {
                                if ((i21111111110 & 11) == 2 && pVar111111111110.b()) {
                                    pVar111111111110.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(835891690, i21111111110, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:112)");
                                }
                                if (pVar11111111117 == null) {
                                    pVar111111111110.T(-2104362770);
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111111 = pVar11111111118;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111112 = pVar11111111119;
                                    TextStyle textStyle = textStyleA2;
                                    long j21 = j111111117;
                                    long j22 = j20;
                                    int i30 = i2111111119;
                                    SnackbarKt.b(pVar111111111111, null, pVar111111111112, textStyle, j21, j22, pVar111111111110, (57344 & (i30 >> 9)) | ((i30 >> 27) & 14) | 48 | (i30 & bb.c.b.f30796me) | ((i30 >> 9) & 458752));
                                    pVar111111111110.c0();
                                } else if (z11111) {
                                    pVar111111111110.T(-2104362456);
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111113 = pVar11111111118;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111114 = pVar11111111117;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar11111111119;
                                    TextStyle textStyle2 = textStyleA2;
                                    long j23 = j111111117;
                                    long j24 = j20;
                                    int i31 = i2111111119;
                                    SnackbarKt.a(pVar111111111113, pVar111111111114, pVar20, textStyle2, j23, j24, pVar111111111110, (57344 & (i31 >> 9)) | ((i31 >> 27) & 14) | (i31 & 112) | (i31 & bb.c.b.f30796me) | ((i31 >> 9) & 458752));
                                    pVar111111111110.c0();
                                } else {
                                    pVar111111111110.T(-2104362176);
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar21 = pVar11111111118;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar22 = pVar11111111117;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar23 = pVar11111111119;
                                    TextStyle textStyle3 = textStyleA2;
                                    long j25 = j111111117;
                                    long j26 = j20;
                                    int i32 = i2111111119;
                                    SnackbarKt.b(pVar21, pVar22, pVar23, textStyle3, j25, j26, pVar111111111110, (57344 & (i32 >> 9)) | ((i32 >> 27) & 14) | (i32 & 112) | (i32 & bb.c.b.f30796me) | ((i32 >> 9) & 458752));
                                    pVar111111111110.c0();
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111111110, Integer num) {
                                a(pVar111111111110, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVar11111111116, 56);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111111116, Integer num) {
                        a(pVar11111111116, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, (i2111111117 & bb.c.g.f32954lc) | i2111111116 | (i2111111117 & 112) | (i2111111117 & bb.c.b.f30796me), 80);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                z12 = z11;
                pVar7 = pVar4;
                j14 = jC;
                j15 = jE;
                j16 = jB;
                pVar5 = pVar11111111115;
                nVar2 = nVar3;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i23 != 0) {
                        pVar4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        g2VarF = m1.f12029a.f(pVarF, 6);
                        i12 &= -57345;
                    } else {
                        g2VarF = g2Var;
                    }
                    if ((i11 & 32) != 0) {
                        jC = m1.f12029a.c(pVarF, 6);
                        i12 &= -458753;
                    } else {
                        jC = j10;
                    }
                    if ((i11 & 64) != 0) {
                        jD = m1.f12029a.d(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 128) != 0) {
                        jB = m1.f12029a.b(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i11 & 256) != 0) {
                        jE = m1.f12029a.e(pVarF, 6);
                        i12 &= -234881025;
                    }
                } else {
                    if (i22 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i23 != 0) {
                        pVar4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 16) != 0) {
                        g2VarF = m1.f12029a.f(pVarF, 6);
                        i12 &= -57345;
                    } else {
                        g2VarF = g2Var;
                    }
                    if ((i11 & 32) != 0) {
                        jC = m1.f12029a.c(pVarF, 6);
                        i12 &= -458753;
                    } else {
                        jC = j10;
                    }
                    if ((i11 & 64) != 0) {
                        jD = m1.f12029a.d(pVarF, 6);
                        i12 &= -3670017;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 128) != 0) {
                        jB = m1.f12029a.b(pVarF, 6);
                        i12 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i11 & 256) != 0) {
                        jE = m1.f12029a.e(pVarF, 6);
                        i12 &= -234881025;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:91)");
                }
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111116 = pVar4;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111117 = pVar6;
                final long j111111117 = jB;
                final long j111111118 = jE;
                final int i2111111118 = i12;
                final boolean z11111 = z11;
                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111118 = pVar6;
                int i2111111119 = 12779520 | (i12 & 14);
                int i21111111110 = i12 >> 9;
                SurfaceKt.a(nVar3, g2VarF, jC, jD, 0.0f, t0.t0.f140362a.g(), null, androidx.compose.runtime.internal.b.b(pVarF, -1829663446, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar11111111119, int i21111111111) {
                        if ((i21111111111 & 11) == 2 && pVar11111111119.b()) {
                            pVar11111111119.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1829663446, i21111111111, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:109)");
                        }
                        o0 o0Var = o0.f12059a;
                        Typography typographyC = o0Var.c(pVar11111111119, 6);
                        t0.t0 t0Var = t0.t0.f140362a;
                        TextStyle textStyleA = TypographyKt.a(typographyC, t0Var.p());
                        final TextStyle textStyleA2 = TypographyKt.a(o0Var.c(pVar11111111119, 6), t0Var.d());
                        androidx.compose.runtime.k1[] k1VarArr = {TextKt.d().f(textStyleA)};
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111110 = pVar11111111116;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111 = content;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111112 = pVar11111111117;
                        final long j111111119 = j111111117;
                        final long j20 = j111111118;
                        final int i21111111112 = i2111111118;
                        final boolean z11112 = z11111;
                        CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar11111111119, 835891690, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar111111111113, int i21111111113) {
                                if ((i21111111113 & 11) == 2 && pVar111111111113.b()) {
                                    pVar111111111113.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(835891690, i21111111113, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:112)");
                                }
                                if (pVar111111111110 == null) {
                                    pVar111111111113.T(-2104362770);
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111114 = pVar111111111111;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111115 = pVar111111111112;
                                    TextStyle textStyle = textStyleA2;
                                    long j21 = j111111119;
                                    long j22 = j20;
                                    int i30 = i21111111112;
                                    SnackbarKt.b(pVar111111111114, null, pVar111111111115, textStyle, j21, j22, pVar111111111113, (57344 & (i30 >> 9)) | ((i30 >> 27) & 14) | 48 | (i30 & bb.c.b.f30796me) | ((i30 >> 9) & 458752));
                                    pVar111111111113.c0();
                                } else if (z11112) {
                                    pVar111111111113.T(-2104362456);
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111116 = pVar111111111111;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111117 = pVar111111111110;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar111111111112;
                                    TextStyle textStyle2 = textStyleA2;
                                    long j23 = j111111119;
                                    long j24 = j20;
                                    int i31 = i21111111112;
                                    SnackbarKt.a(pVar111111111116, pVar111111111117, pVar20, textStyle2, j23, j24, pVar111111111113, (57344 & (i31 >> 9)) | ((i31 >> 27) & 14) | (i31 & 112) | (i31 & bb.c.b.f30796me) | ((i31 >> 9) & 458752));
                                    pVar111111111113.c0();
                                } else {
                                    pVar111111111113.T(-2104362176);
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar21 = pVar111111111111;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar22 = pVar111111111110;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar23 = pVar111111111112;
                                    TextStyle textStyle3 = textStyleA2;
                                    long j25 = j111111119;
                                    long j26 = j20;
                                    int i32 = i21111111112;
                                    SnackbarKt.b(pVar21, pVar22, pVar23, textStyle3, j25, j26, pVar111111111113, (57344 & (i32 >> 9)) | ((i32 >> 27) & 14) | (i32 & 112) | (i32 & bb.c.b.f30796me) | ((i32 >> 9) & 458752));
                                    pVar111111111113.c0();
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111111113, Integer num) {
                                a(pVar111111111113, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVar11111111119, 56);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111111119, Integer num) {
                        a(pVar11111111119, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, (i21111111110 & bb.c.g.f32954lc) | i2111111119 | (i21111111110 & 112) | (i21111111110 & bb.c.b.f30796me), 80);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                z12 = z11;
                pVar7 = pVar4;
                j14 = jC;
                j15 = jE;
                j16 = jB;
                pVar5 = pVar11111111118;
                nVar2 = nVar3;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar18 = nVar2;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111119 = pVar5;
            final long j111111119 = jD;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar111111111110, int i21111111111) {
                    SnackbarKt.c(nVar18, pVar7, pVar11111111119, z12, g2VarF, j14, j111111119, j16, j15, content, pVar111111111110, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111111110, Integer num) {
                    a(pVar111111111110, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i17 = com.google.android.exoplayer2.j.G;
        i12 |= i17;
        if ((1533916891 & i12) == 306783378) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i22 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i23 != 0) {
                    pVar4 = null;
                }
                if (i13 == 0) {
                }
                if (i15 != 0) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                if ((i11 & 16) != 0) {
                    g2VarF = m1.f12029a.f(pVarF, 6);
                    i12 &= -57345;
                } else {
                    g2VarF = g2Var;
                }
                if ((i11 & 32) != 0) {
                    jC = m1.f12029a.c(pVarF, 6);
                    i12 &= -458753;
                } else {
                    jC = j10;
                }
                if ((i11 & 64) != 0) {
                    jD = m1.f12029a.d(pVarF, 6);
                    i12 &= -3670017;
                } else {
                    jD = j11;
                }
                if ((i11 & 128) != 0) {
                    jB = m1.f12029a.b(pVarF, 6);
                    i12 &= -29360129;
                } else {
                    jB = j12;
                }
                if ((i11 & 256) != 0) {
                    jE = m1.f12029a.e(pVarF, 6);
                    i12 &= -234881025;
                }
            } else {
                if (i22 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i23 != 0) {
                    pVar4 = null;
                }
                if (i13 == 0) {
                }
                if (i15 != 0) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                if ((i11 & 16) != 0) {
                    g2VarF = m1.f12029a.f(pVarF, 6);
                    i12 &= -57345;
                } else {
                    g2VarF = g2Var;
                }
                if ((i11 & 32) != 0) {
                    jC = m1.f12029a.c(pVarF, 6);
                    i12 &= -458753;
                } else {
                    jC = j10;
                }
                if ((i11 & 64) != 0) {
                    jD = m1.f12029a.d(pVarF, 6);
                    i12 &= -3670017;
                } else {
                    jD = j11;
                }
                if ((i11 & 128) != 0) {
                    jB = m1.f12029a.b(pVarF, 6);
                    i12 &= -29360129;
                } else {
                    jB = j12;
                }
                if ((i11 & 256) != 0) {
                    jE = m1.f12029a.e(pVarF, 6);
                    i12 &= -234881025;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:91)");
            }
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111110 = pVar4;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111111 = pVar6;
            final long j1111111110 = jB;
            final long j1111111111 = jE;
            final int i21111111111 = i12;
            final boolean z11112 = z11;
            yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111112 = pVar6;
            int i21111111112 = 12779520 | (i12 & 14);
            int i21111111113 = i12 >> 9;
            SurfaceKt.a(nVar3, g2VarF, jC, jD, 0.0f, t0.t0.f140362a.g(), null, androidx.compose.runtime.internal.b.b(pVarF, -1829663446, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar111111111113, int i21111111114) {
                    if ((i21111111114 & 11) == 2 && pVar111111111113.b()) {
                        pVar111111111113.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1829663446, i21111111114, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:109)");
                    }
                    o0 o0Var = o0.f12059a;
                    Typography typographyC = o0Var.c(pVar111111111113, 6);
                    t0.t0 t0Var = t0.t0.f140362a;
                    TextStyle textStyleA = TypographyKt.a(typographyC, t0Var.p());
                    final TextStyle textStyleA2 = TypographyKt.a(o0Var.c(pVar111111111113, 6), t0Var.d());
                    androidx.compose.runtime.k1[] k1VarArr = {TextKt.d().f(textStyleA)};
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111114 = pVar111111111110;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111115 = content;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111116 = pVar111111111111;
                    final long j1111111112 = j1111111110;
                    final long j20 = j1111111111;
                    final int i21111111115 = i21111111111;
                    final boolean z11113 = z11112;
                    CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar111111111113, 835891690, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar111111111117, int i21111111116) {
                            if ((i21111111116 & 11) == 2 && pVar111111111117.b()) {
                                pVar111111111117.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(835891690, i21111111116, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:112)");
                            }
                            if (pVar111111111114 == null) {
                                pVar111111111117.T(-2104362770);
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111118 = pVar111111111115;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111111119 = pVar111111111116;
                                TextStyle textStyle = textStyleA2;
                                long j21 = j1111111112;
                                long j22 = j20;
                                int i30 = i21111111115;
                                SnackbarKt.b(pVar111111111118, null, pVar111111111119, textStyle, j21, j22, pVar111111111117, (57344 & (i30 >> 9)) | ((i30 >> 27) & 14) | 48 | (i30 & bb.c.b.f30796me) | ((i30 >> 9) & 458752));
                                pVar111111111117.c0();
                            } else if (z11113) {
                                pVar111111111117.T(-2104362456);
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111110 = pVar111111111115;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111 = pVar111111111114;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar111111111116;
                                TextStyle textStyle2 = textStyleA2;
                                long j23 = j1111111112;
                                long j24 = j20;
                                int i31 = i21111111115;
                                SnackbarKt.a(pVar1111111111110, pVar1111111111111, pVar20, textStyle2, j23, j24, pVar111111111117, (57344 & (i31 >> 9)) | ((i31 >> 27) & 14) | (i31 & 112) | (i31 & bb.c.b.f30796me) | ((i31 >> 9) & 458752));
                                pVar111111111117.c0();
                            } else {
                                pVar111111111117.T(-2104362176);
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar21 = pVar111111111115;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar22 = pVar111111111114;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar23 = pVar111111111116;
                                TextStyle textStyle3 = textStyleA2;
                                long j25 = j1111111112;
                                long j26 = j20;
                                int i32 = i21111111115;
                                SnackbarKt.b(pVar21, pVar22, pVar23, textStyle3, j25, j26, pVar111111111117, (57344 & (i32 >> 9)) | ((i32 >> 27) & 14) | (i32 & 112) | (i32 & bb.c.b.f30796me) | ((i32 >> 9) & 458752));
                                pVar111111111117.c0();
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111111117, Integer num) {
                            a(pVar111111111117, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVar111111111113, 56);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111111113, Integer num) {
                    a(pVar111111111113, num.intValue());
                    return kotlin.b2.f124493a;
                }
            }), pVarF, (i21111111113 & bb.c.g.f32954lc) | i21111111112 | (i21111111113 & 112) | (i21111111113 & bb.c.b.f30796me), 80);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            z12 = z11;
            pVar7 = pVar4;
            j14 = jC;
            j15 = jE;
            j16 = jB;
            pVar5 = pVar111111111112;
            nVar2 = nVar3;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i22 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i23 != 0) {
                    pVar4 = null;
                }
                if (i13 == 0) {
                }
                if (i15 != 0) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                if ((i11 & 16) != 0) {
                    g2VarF = m1.f12029a.f(pVarF, 6);
                    i12 &= -57345;
                } else {
                    g2VarF = g2Var;
                }
                if ((i11 & 32) != 0) {
                    jC = m1.f12029a.c(pVarF, 6);
                    i12 &= -458753;
                } else {
                    jC = j10;
                }
                if ((i11 & 64) != 0) {
                    jD = m1.f12029a.d(pVarF, 6);
                    i12 &= -3670017;
                } else {
                    jD = j11;
                }
                if ((i11 & 128) != 0) {
                    jB = m1.f12029a.b(pVarF, 6);
                    i12 &= -29360129;
                } else {
                    jB = j12;
                }
                if ((i11 & 256) != 0) {
                    jE = m1.f12029a.e(pVarF, 6);
                    i12 &= -234881025;
                }
            } else {
                if (i22 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i23 != 0) {
                    pVar4 = null;
                }
                if (i13 == 0) {
                }
                if (i15 != 0) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                if ((i11 & 16) != 0) {
                    g2VarF = m1.f12029a.f(pVarF, 6);
                    i12 &= -57345;
                } else {
                    g2VarF = g2Var;
                }
                if ((i11 & 32) != 0) {
                    jC = m1.f12029a.c(pVarF, 6);
                    i12 &= -458753;
                } else {
                    jC = j10;
                }
                if ((i11 & 64) != 0) {
                    jD = m1.f12029a.d(pVarF, 6);
                    i12 &= -3670017;
                } else {
                    jD = j11;
                }
                if ((i11 & 128) != 0) {
                    jB = m1.f12029a.b(pVarF, 6);
                    i12 &= -29360129;
                } else {
                    jB = j12;
                }
                if ((i11 & 256) != 0) {
                    jE = m1.f12029a.e(pVarF, 6);
                    i12 &= -234881025;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1235788955, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:91)");
            }
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111113 = pVar4;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111114 = pVar6;
            final long j1111111112 = jB;
            final long j1111111113 = jE;
            final int i21111111114 = i12;
            final boolean z11113 = z11;
            yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111115 = pVar6;
            int i21111111115 = 12779520 | (i12 & 14);
            int i21111111116 = i12 >> 9;
            SurfaceKt.a(nVar3, g2VarF, jC, jD, 0.0f, t0.t0.f140362a.g(), null, androidx.compose.runtime.internal.b.b(pVarF, -1829663446, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar111111111116, int i21111111117) {
                    if ((i21111111117 & 11) == 2 && pVar111111111116.b()) {
                        pVar111111111116.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1829663446, i21111111117, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:109)");
                    }
                    o0 o0Var = o0.f12059a;
                    Typography typographyC = o0Var.c(pVar111111111116, 6);
                    t0.t0 t0Var = t0.t0.f140362a;
                    TextStyle textStyleA = TypographyKt.a(typographyC, t0Var.p());
                    final TextStyle textStyleA2 = TypographyKt.a(o0Var.c(pVar111111111116, 6), t0Var.d());
                    androidx.compose.runtime.k1[] k1VarArr = {TextKt.d().f(textStyleA)};
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111117 = pVar111111111113;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111118 = content;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111119 = pVar111111111114;
                    final long j1111111114 = j1111111112;
                    final long j20 = j1111111113;
                    final int i21111111118 = i21111111114;
                    final boolean z11114 = z11113;
                    CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar111111111116, 835891690, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar1111111111110, int i21111111119) {
                            if ((i21111111119 & 11) == 2 && pVar1111111111110.b()) {
                                pVar1111111111110.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(835891690, i21111111119, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:112)");
                            }
                            if (pVar111111111117 == null) {
                                pVar1111111111110.T(-2104362770);
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111111 = pVar111111111118;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111112 = pVar111111111119;
                                TextStyle textStyle = textStyleA2;
                                long j21 = j1111111114;
                                long j22 = j20;
                                int i30 = i21111111118;
                                SnackbarKt.b(pVar1111111111111, null, pVar1111111111112, textStyle, j21, j22, pVar1111111111110, (57344 & (i30 >> 9)) | ((i30 >> 27) & 14) | 48 | (i30 & bb.c.b.f30796me) | ((i30 >> 9) & 458752));
                                pVar1111111111110.c0();
                            } else if (z11114) {
                                pVar1111111111110.T(-2104362456);
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111113 = pVar111111111118;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111111114 = pVar111111111117;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar111111111119;
                                TextStyle textStyle2 = textStyleA2;
                                long j23 = j1111111114;
                                long j24 = j20;
                                int i31 = i21111111118;
                                SnackbarKt.a(pVar1111111111113, pVar1111111111114, pVar20, textStyle2, j23, j24, pVar1111111111110, (57344 & (i31 >> 9)) | ((i31 >> 27) & 14) | (i31 & 112) | (i31 & bb.c.b.f30796me) | ((i31 >> 9) & 458752));
                                pVar1111111111110.c0();
                            } else {
                                pVar1111111111110.T(-2104362176);
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar21 = pVar111111111118;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar22 = pVar111111111117;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar23 = pVar111111111119;
                                TextStyle textStyle3 = textStyleA2;
                                long j25 = j1111111114;
                                long j26 = j20;
                                int i32 = i21111111118;
                                SnackbarKt.b(pVar21, pVar22, pVar23, textStyle3, j25, j26, pVar1111111111110, (57344 & (i32 >> 9)) | ((i32 >> 27) & 14) | (i32 & 112) | (i32 & bb.c.b.f30796me) | ((i32 >> 9) & 458752));
                                pVar1111111111110.c0();
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111111111110, Integer num) {
                            a(pVar1111111111110, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVar111111111116, 56);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111111116, Integer num) {
                    a(pVar111111111116, num.intValue());
                    return kotlin.b2.f124493a;
                }
            }), pVarF, (i21111111116 & bb.c.g.f32954lc) | i21111111115 | (i21111111116 & 112) | (i21111111116 & bb.c.b.f30796me), 80);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            z12 = z11;
            pVar7 = pVar4;
            j14 = jC;
            j15 = jE;
            j16 = jB;
            pVar5 = pVar111111111115;
            nVar2 = nVar3;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        final androidx.compose.ui.n nVar19 = nVar2;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111116 = pVar5;
        final long j1111111114 = jD;
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar111111111117, int i21111111117) {
                SnackbarKt.c(nVar19, pVar7, pVar111111111116, z12, g2VarF, j14, j1111111114, j16, j15, content, pVar111111111117, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111111117, Integer num) {
                a(pVar111111111117, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:103:0x012b  */
    /* JADX WARN: Code duplicated, block: B:105:0x013e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0177 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x0179  */
    /* JADX WARN: Code duplicated, block: B:129:0x017c  */
    /* JADX WARN: Code duplicated, block: B:131:0x017f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0181  */
    /* JADX WARN: Code duplicated, block: B:135:0x0187  */
    /* JADX WARN: Code duplicated, block: B:136:0x0190  */
    /* JADX WARN: Code duplicated, block: B:139:0x0195  */
    /* JADX WARN: Code duplicated, block: B:140:0x019e  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:149:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:153:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:160:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:161:0x0211  */
    /* JADX WARN: Code duplicated, block: B:164:0x021d  */
    /* JADX WARN: Code duplicated, block: B:165:0x022f  */
    /* JADX WARN: Code duplicated, block: B:168:0x0286  */
    /* JADX WARN: Code duplicated, block: B:173:0x0296  */
    /* JADX WARN: Code duplicated, block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00df  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:94:0x0104  */
    /* JADX WARN: Code duplicated, block: B:96:0x0108  */
    /* JADX WARN: Code duplicated, block: B:99:0x0113  */
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void d(@dl.d final l1 snackbarData, @dl.e androidx.compose.ui.n nVar, boolean z10, @dl.e g2 g2Var, long j10, long j11, long j12, long j13, long j14, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        final int i12;
        androidx.compose.ui.n nVar2;
        int i13;
        boolean z11;
        int i14;
        g2 g2Var2;
        long jD;
        long jA;
        androidx.compose.ui.n nVar3;
        boolean z12;
        g2 g2VarF;
        long jC;
        long jB;
        long jE;
        long j15;
        final String actionLabel;
        boolean z13;
        androidx.compose.runtime.internal.a aVarB;
        final l1 l1Var;
        androidx.compose.runtime.internal.a aVarB2;
        long j16;
        final boolean z14;
        final g2 g2Var3;
        androidx.compose.runtime.u1 u1VarH;
        int i15;
        int i16;
        int i17;
        int i18;
        kotlin.jvm.internal.f0.p(snackbarData, "snackbarData");
        androidx.compose.runtime.p pVarF = pVar.F(274621471);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(snackbarData) ? 4 : 2) | i10;
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
                if ((i10 & 57344) != 0) {
                    i12 |= ((i11 & 16) == 0 || !pVarF.z(j10)) ? 8192 : 16384;
                }
                if ((i10 & 458752) == 0) {
                    jD = j11;
                    if ((i11 & 32) == 0 || !pVarF.z(jD)) {
                        i18 = 65536;
                    } else {
                        i18 = 131072;
                    }
                    i12 |= i18;
                } else {
                    jD = j11;
                }
                if ((i10 & 3670016) == 0) {
                    jA = j12;
                    if ((i11 & 64) == 0 || !pVarF.z(jA)) {
                        i17 = 524288;
                    } else {
                        i17 = 1048576;
                    }
                    i12 |= i17;
                } else {
                    jA = j12;
                }
                if ((i10 & 29360128) != 0) {
                    if ((i11 & 128) == 0 || !pVarF.z(j13)) {
                        i16 = 4194304;
                    } else {
                        i16 = 8388608;
                    }
                    i12 |= i16;
                }
                if ((i10 & 234881024) != 0) {
                    if ((i11 & 256) == 0 || !pVarF.z(j14)) {
                        i15 = 33554432;
                    } else {
                        i15 = 67108864;
                    }
                    i12 |= i15;
                }
                if ((191739611 & i12) == 38347922 || !pVarF.b()) {
                    pVarF.W();
                    if ((i10 & 1) != 0 || pVarF.o()) {
                        if (i19 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            g2VarF = m1.f12029a.f(pVarF, 6);
                            i12 &= -7169;
                        } else {
                            g2VarF = g2Var2;
                        }
                        if ((i11 & 16) != 0) {
                            jC = m1.f12029a.c(pVarF, 6);
                            i12 &= -57345;
                        } else {
                            jC = j10;
                        }
                        if ((i11 & 32) != 0) {
                            jD = m1.f12029a.d(pVarF, 6);
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            jA = m1.f12029a.a(pVarF, 6);
                            i12 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            jB = m1.f12029a.b(pVarF, 6);
                            i12 = (-29360129) & i12;
                        } else {
                            jB = j13;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            j15 = jB;
                            jE = m1.f12029a.e(pVarF, 6);
                        } else {
                            jE = j14;
                            j15 = jB;
                        }
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
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                        }
                        j15 = j13;
                        jE = j14;
                        nVar3 = nVar2;
                        z12 = z11;
                        g2VarF = g2Var2;
                        jC = j10;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(274621471, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:194)");
                    }
                    actionLabel = snackbarData.getVisuals().getActionLabel();
                    if (actionLabel != null) {
                        final long j17 = jA;
                        final int i21 = i12;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar2 = new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar3, int i22) {
                                if ((i22 & 11) == 2 && pVar3.b()) {
                                    pVar3.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1378313599, i22, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:207)");
                                }
                                e eVarU = f.f11853a.u(0L, j17, 0L, 0L, pVar3, ((i21 >> 15) & 112) | 24576, 13);
                                final l1 l1Var2 = snackbarData;
                                pVar3.T(1157296644);
                                boolean zS = pVar3.s(l1Var2);
                                Object objU = pVar3.U();
                                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$1$1
                                        {
                                            super(0);
                                        }

                                        @Override // yh.a
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                                            invoke2();
                                            return kotlin.b2.f124493a;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            l1Var2.b();
                                        }
                                    };
                                    pVar3.N(objU);
                                }
                                pVar3.c0();
                                final String str = actionLabel;
                                ButtonKt.e((yh.a) objU, null, false, null, eVarU, null, null, null, null, androidx.compose.runtime.internal.b.b(pVar3, 521110564, true, new yh.q<androidx.compose.foundation.layout.x0, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.d androidx.compose.foundation.layout.x0 TextButton, @dl.e androidx.compose.runtime.p pVar4, int i23) {
                                        kotlin.jvm.internal.f0.p(TextButton, "$this$TextButton");
                                        if ((i23 & 81) == 16 && pVar4.b()) {
                                            pVar4.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(521110564, i23, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:211)");
                                        }
                                        TextKt.c(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, pVar4, 0, 0, com.google.android.exoplayer2.audio.v0.f44322j);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.q
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.foundation.layout.x0 x0Var, androidx.compose.runtime.p pVar4, Integer num) {
                                        a(x0Var, pVar4, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                }), pVar3, com.google.android.exoplayer2.j.G, bb.c.b.A6);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                                a(pVar3, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        };
                        z13 = true;
                        aVarB = androidx.compose.runtime.internal.b.b(pVarF, -1378313599, true, pVar2);
                    } else {
                        z13 = true;
                        aVarB = null;
                    }
                    if (snackbarData.getVisuals().getWithDismissAction()) {
                        l1Var = snackbarData;
                        aVarB2 = androidx.compose.runtime.internal.b.b(pVarF, -1812633777, z13, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar3, int i22) {
                                if ((i22 & 11) == 2 && pVar3.b()) {
                                    pVar3.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1812633777, i22, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:219)");
                                }
                                final l1 l1Var2 = l1Var;
                                pVar3.T(1157296644);
                                boolean zS = pVar3.s(l1Var2);
                                Object objU = pVar3.U();
                                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1$1$1
                                        {
                                            super(0);
                                        }

                                        @Override // yh.a
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                                            invoke2();
                                            return kotlin.b2.f124493a;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            l1Var2.dismiss();
                                        }
                                    };
                                    pVar3.N(objU);
                                }
                                pVar3.c0();
                                IconButtonKt.e((yh.a) objU, null, false, null, null, ComposableSingletons$SnackbarKt.f9327a.a(), pVar3, androidx.profileinstaller.o.c.f26824k, 30);
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
                    } else {
                        l1Var = snackbarData;
                        aVarB2 = null;
                    }
                    androidx.compose.ui.n nVar4 = nVar3;
                    int i22 = i12 << 3;
                    c(PaddingKt.k(nVar3, s1.h.g(12)), aVarB, aVarB2, z12, g2VarF, jC, jD, j15, jE, androidx.compose.runtime.internal.b.b(pVarF, -1266389126, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$3
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar3, int i23) {
                            if ((i23 & 11) == 2 && pVar3.b()) {
                                pVar3.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1266389126, i23, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:243)");
                            }
                            TextKt.c(l1Var.getVisuals().getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, pVar3, 0, 0, com.google.android.exoplayer2.audio.v0.f44322j);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                            a(pVar3, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, 805306368 | (i22 & bb.c.g.f32954lc) | (57344 & i22) | (458752 & i22) | (i22 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    j16 = jA;
                    z14 = z12;
                    g2Var3 = g2VarF;
                    nVar2 = nVar4;
                } else {
                    pVarF.l();
                    j15 = j13;
                    jE = j14;
                    z14 = z11;
                    g2Var3 = g2Var2;
                    j16 = jA;
                    jC = j10;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar5 = nVar2;
                final long j18 = jC;
                final long j19 = jD;
                final long j20 = j16;
                final long j21 = j15;
                final long j22 = jE;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar3, int i23) {
                        SnackbarKt.d(snackbarData, nVar5, z14, g2Var3, j18, j19, j20, j21, j22, pVar3, i10 | 1, i11);
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
                    i12 |= i20;
                } else {
                    g2Var2 = g2Var;
                }
                i12 |= i20;
            } else {
                g2Var2 = g2Var;
            }
            if ((i10 & 57344) != 0) {
                i12 |= ((i11 & 16) == 0 || !pVarF.z(j10)) ? 8192 : 16384;
            }
            if ((i10 & 458752) == 0) {
                jD = j11;
                if ((i11 & 32) == 0) {
                    i18 = 65536;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            } else {
                jD = j11;
            }
            if ((i10 & 3670016) == 0) {
                jA = j12;
                if ((i11 & 64) == 0) {
                    i17 = 524288;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            } else {
                jA = j12;
            }
            if ((i10 & 29360128) != 0) {
                if ((i11 & 128) == 0) {
                    i16 = 4194304;
                } else {
                    i16 = 4194304;
                }
                i12 |= i16;
            }
            if ((i10 & 234881024) != 0) {
                if ((i11 & 256) == 0) {
                    i15 = 33554432;
                } else {
                    i15 = 33554432;
                }
                i12 |= i15;
            }
            if ((191739611 & i12) == 38347922) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        g2VarF = m1.f12029a.f(pVarF, 6);
                        i12 &= -7169;
                    } else {
                        g2VarF = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        jC = m1.f12029a.c(pVarF, 6);
                        i12 &= -57345;
                    } else {
                        jC = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jD = m1.f12029a.d(pVarF, 6);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        jA = m1.f12029a.a(pVarF, 6);
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jB = m1.f12029a.b(pVarF, 6);
                        i12 = (-29360129) & i12;
                    } else {
                        jB = j13;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        j15 = jB;
                        jE = m1.f12029a.e(pVarF, 6);
                    } else {
                        jE = j14;
                        j15 = jB;
                    }
                } else {
                    if (i19 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        g2VarF = m1.f12029a.f(pVarF, 6);
                        i12 &= -7169;
                    } else {
                        g2VarF = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        jC = m1.f12029a.c(pVarF, 6);
                        i12 &= -57345;
                    } else {
                        jC = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jD = m1.f12029a.d(pVarF, 6);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        jA = m1.f12029a.a(pVarF, 6);
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jB = m1.f12029a.b(pVarF, 6);
                        i12 = (-29360129) & i12;
                    } else {
                        jB = j13;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        j15 = jB;
                        jE = m1.f12029a.e(pVarF, 6);
                    } else {
                        jE = j14;
                        j15 = jB;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(274621471, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:194)");
                }
                actionLabel = snackbarData.getVisuals().getActionLabel();
                if (actionLabel != null) {
                    final long j110 = jA;
                    final int i23 = i12;
                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar3 = new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar4, int i24) {
                            if ((i24 & 11) == 2 && pVar4.b()) {
                                pVar4.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1378313599, i24, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:207)");
                            }
                            e eVarU = f.f11853a.u(0L, j110, 0L, 0L, pVar4, ((i23 >> 15) & 112) | 24576, 13);
                            final l1 l1Var2 = snackbarData;
                            pVar4.T(1157296644);
                            boolean zS = pVar4.s(l1Var2);
                            Object objU = pVar4.U();
                            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$1$1
                                    {
                                        super(0);
                                    }

                                    @Override // yh.a
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                                        invoke2();
                                        return kotlin.b2.f124493a;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        l1Var2.b();
                                    }
                                };
                                pVar4.N(objU);
                            }
                            pVar4.c0();
                            final String str = actionLabel;
                            ButtonKt.e((yh.a) objU, null, false, null, eVarU, null, null, null, null, androidx.compose.runtime.internal.b.b(pVar4, 521110564, true, new yh.q<androidx.compose.foundation.layout.x0, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d androidx.compose.foundation.layout.x0 TextButton, @dl.e androidx.compose.runtime.p pVar5, int i25) {
                                    kotlin.jvm.internal.f0.p(TextButton, "$this$TextButton");
                                    if ((i25 & 81) == 16 && pVar5.b()) {
                                        pVar5.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(521110564, i25, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:211)");
                                    }
                                    TextKt.c(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, pVar5, 0, 0, com.google.android.exoplayer2.audio.v0.f44322j);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.foundation.layout.x0 x0Var, androidx.compose.runtime.p pVar5, Integer num) {
                                    a(x0Var, pVar5, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVar4, com.google.android.exoplayer2.j.G, bb.c.b.A6);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar4, Integer num) {
                            a(pVar4, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    };
                    z13 = true;
                    aVarB = androidx.compose.runtime.internal.b.b(pVarF, -1378313599, true, pVar3);
                } else {
                    z13 = true;
                    aVarB = null;
                }
                if (snackbarData.getVisuals().getWithDismissAction()) {
                    l1Var = snackbarData;
                    aVarB2 = androidx.compose.runtime.internal.b.b(pVarF, -1812633777, z13, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar4, int i24) {
                            if ((i24 & 11) == 2 && pVar4.b()) {
                                pVar4.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1812633777, i24, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:219)");
                            }
                            final l1 l1Var2 = l1Var;
                            pVar4.T(1157296644);
                            boolean zS = pVar4.s(l1Var2);
                            Object objU = pVar4.U();
                            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1$1$1
                                    {
                                        super(0);
                                    }

                                    @Override // yh.a
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                                        invoke2();
                                        return kotlin.b2.f124493a;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        l1Var2.dismiss();
                                    }
                                };
                                pVar4.N(objU);
                            }
                            pVar4.c0();
                            IconButtonKt.e((yh.a) objU, null, false, null, null, ComposableSingletons$SnackbarKt.f9327a.a(), pVar4, androidx.profileinstaller.o.c.f26824k, 30);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar4, Integer num) {
                            a(pVar4, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                } else {
                    l1Var = snackbarData;
                    aVarB2 = null;
                }
                androidx.compose.ui.n nVar6 = nVar3;
                int i24 = i12 << 3;
                c(PaddingKt.k(nVar3, s1.h.g(12)), aVarB, aVarB2, z12, g2VarF, jC, jD, j15, jE, androidx.compose.runtime.internal.b.b(pVarF, -1266389126, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$3
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar4, int i25) {
                        if ((i25 & 11) == 2 && pVar4.b()) {
                            pVar4.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1266389126, i25, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:243)");
                        }
                        TextKt.c(l1Var.getVisuals().getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, pVar4, 0, 0, com.google.android.exoplayer2.audio.v0.f44322j);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar4, Integer num) {
                        a(pVar4, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, 805306368 | (i24 & bb.c.g.f32954lc) | (57344 & i24) | (458752 & i24) | (i24 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                j16 = jA;
                z14 = z12;
                g2Var3 = g2VarF;
                nVar2 = nVar6;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        g2VarF = m1.f12029a.f(pVarF, 6);
                        i12 &= -7169;
                    } else {
                        g2VarF = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        jC = m1.f12029a.c(pVarF, 6);
                        i12 &= -57345;
                    } else {
                        jC = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jD = m1.f12029a.d(pVarF, 6);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        jA = m1.f12029a.a(pVarF, 6);
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jB = m1.f12029a.b(pVarF, 6);
                        i12 = (-29360129) & i12;
                    } else {
                        jB = j13;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        j15 = jB;
                        jE = m1.f12029a.e(pVarF, 6);
                    } else {
                        jE = j14;
                        j15 = jB;
                    }
                } else {
                    if (i19 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        g2VarF = m1.f12029a.f(pVarF, 6);
                        i12 &= -7169;
                    } else {
                        g2VarF = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        jC = m1.f12029a.c(pVarF, 6);
                        i12 &= -57345;
                    } else {
                        jC = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jD = m1.f12029a.d(pVarF, 6);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        jA = m1.f12029a.a(pVarF, 6);
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jB = m1.f12029a.b(pVarF, 6);
                        i12 = (-29360129) & i12;
                    } else {
                        jB = j13;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        j15 = jB;
                        jE = m1.f12029a.e(pVarF, 6);
                    } else {
                        jE = j14;
                        j15 = jB;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(274621471, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:194)");
                }
                actionLabel = snackbarData.getVisuals().getActionLabel();
                if (actionLabel != null) {
                    final long j111 = jA;
                    final int i25 = i12;
                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar4 = new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                ComposerKt.w0(-1378313599, i26, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:207)");
                            }
                            e eVarU = f.f11853a.u(0L, j111, 0L, 0L, pVar5, ((i25 >> 15) & 112) | 24576, 13);
                            final l1 l1Var2 = snackbarData;
                            pVar5.T(1157296644);
                            boolean zS = pVar5.s(l1Var2);
                            Object objU = pVar5.U();
                            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$1$1
                                    {
                                        super(0);
                                    }

                                    @Override // yh.a
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                                        invoke2();
                                        return kotlin.b2.f124493a;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        l1Var2.b();
                                    }
                                };
                                pVar5.N(objU);
                            }
                            pVar5.c0();
                            final String str = actionLabel;
                            ButtonKt.e((yh.a) objU, null, false, null, eVarU, null, null, null, null, androidx.compose.runtime.internal.b.b(pVar5, 521110564, true, new yh.q<androidx.compose.foundation.layout.x0, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d androidx.compose.foundation.layout.x0 TextButton, @dl.e androidx.compose.runtime.p pVar6, int i27) {
                                    kotlin.jvm.internal.f0.p(TextButton, "$this$TextButton");
                                    if ((i27 & 81) == 16 && pVar6.b()) {
                                        pVar6.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(521110564, i27, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:211)");
                                    }
                                    TextKt.c(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, pVar6, 0, 0, com.google.android.exoplayer2.audio.v0.f44322j);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.foundation.layout.x0 x0Var, androidx.compose.runtime.p pVar6, Integer num) {
                                    a(x0Var, pVar6, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVar5, com.google.android.exoplayer2.j.G, bb.c.b.A6);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar5, Integer num) {
                            a(pVar5, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    };
                    z13 = true;
                    aVarB = androidx.compose.runtime.internal.b.b(pVarF, -1378313599, true, pVar4);
                } else {
                    z13 = true;
                    aVarB = null;
                }
                if (snackbarData.getVisuals().getWithDismissAction()) {
                    l1Var = snackbarData;
                    aVarB2 = androidx.compose.runtime.internal.b.b(pVarF, -1812633777, z13, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                ComposerKt.w0(-1812633777, i26, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:219)");
                            }
                            final l1 l1Var2 = l1Var;
                            pVar5.T(1157296644);
                            boolean zS = pVar5.s(l1Var2);
                            Object objU = pVar5.U();
                            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1$1$1
                                    {
                                        super(0);
                                    }

                                    @Override // yh.a
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                                        invoke2();
                                        return kotlin.b2.f124493a;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        l1Var2.dismiss();
                                    }
                                };
                                pVar5.N(objU);
                            }
                            pVar5.c0();
                            IconButtonKt.e((yh.a) objU, null, false, null, null, ComposableSingletons$SnackbarKt.f9327a.a(), pVar5, androidx.profileinstaller.o.c.f26824k, 30);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar5, Integer num) {
                            a(pVar5, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                } else {
                    l1Var = snackbarData;
                    aVarB2 = null;
                }
                androidx.compose.ui.n nVar7 = nVar3;
                int i26 = i12 << 3;
                c(PaddingKt.k(nVar3, s1.h.g(12)), aVarB, aVarB2, z12, g2VarF, jC, jD, j15, jE, androidx.compose.runtime.internal.b.b(pVarF, -1266389126, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$3
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar5, int i27) {
                        if ((i27 & 11) == 2 && pVar5.b()) {
                            pVar5.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1266389126, i27, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:243)");
                        }
                        TextKt.c(l1Var.getVisuals().getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, pVar5, 0, 0, com.google.android.exoplayer2.audio.v0.f44322j);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar5, Integer num) {
                        a(pVar5, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, 805306368 | (i26 & bb.c.g.f32954lc) | (57344 & i26) | (458752 & i26) | (i26 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                j16 = jA;
                z14 = z12;
                g2Var3 = g2VarF;
                nVar2 = nVar7;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar8 = nVar2;
            final long j112 = jC;
            final long j113 = jD;
            final long j23 = j16;
            final long j24 = j15;
            final long j25 = jE;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar5, int i27) {
                    SnackbarKt.d(snackbarData, nVar8, z14, g2Var3, j112, j113, j23, j24, j25, pVar5, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar5, Integer num) {
                    a(pVar5, num.intValue());
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
            if ((i10 & 57344) != 0) {
                i12 |= ((i11 & 16) == 0 || !pVarF.z(j10)) ? 8192 : 16384;
            }
            if ((i10 & 458752) == 0) {
                jD = j11;
                if ((i11 & 32) == 0) {
                    i18 = 65536;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            } else {
                jD = j11;
            }
            if ((i10 & 3670016) == 0) {
                jA = j12;
                if ((i11 & 64) == 0) {
                    i17 = 524288;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            } else {
                jA = j12;
            }
            if ((i10 & 29360128) != 0) {
                if ((i11 & 128) == 0) {
                    i16 = 4194304;
                } else {
                    i16 = 4194304;
                }
                i12 |= i16;
            }
            if ((i10 & 234881024) != 0) {
                if ((i11 & 256) == 0) {
                    i15 = 33554432;
                } else {
                    i15 = 33554432;
                }
                i12 |= i15;
            }
            if ((191739611 & i12) == 38347922) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        g2VarF = m1.f12029a.f(pVarF, 6);
                        i12 &= -7169;
                    } else {
                        g2VarF = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        jC = m1.f12029a.c(pVarF, 6);
                        i12 &= -57345;
                    } else {
                        jC = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jD = m1.f12029a.d(pVarF, 6);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        jA = m1.f12029a.a(pVarF, 6);
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jB = m1.f12029a.b(pVarF, 6);
                        i12 = (-29360129) & i12;
                    } else {
                        jB = j13;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        j15 = jB;
                        jE = m1.f12029a.e(pVarF, 6);
                    } else {
                        jE = j14;
                        j15 = jB;
                    }
                } else {
                    if (i19 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        g2VarF = m1.f12029a.f(pVarF, 6);
                        i12 &= -7169;
                    } else {
                        g2VarF = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        jC = m1.f12029a.c(pVarF, 6);
                        i12 &= -57345;
                    } else {
                        jC = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jD = m1.f12029a.d(pVarF, 6);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        jA = m1.f12029a.a(pVarF, 6);
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jB = m1.f12029a.b(pVarF, 6);
                        i12 = (-29360129) & i12;
                    } else {
                        jB = j13;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        j15 = jB;
                        jE = m1.f12029a.e(pVarF, 6);
                    } else {
                        jE = j14;
                        j15 = jB;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(274621471, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:194)");
                }
                actionLabel = snackbarData.getVisuals().getActionLabel();
                if (actionLabel != null) {
                    final long j114 = jA;
                    final int i27 = i12;
                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar5 = new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar6, int i28) {
                            if ((i28 & 11) == 2 && pVar6.b()) {
                                pVar6.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1378313599, i28, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:207)");
                            }
                            e eVarU = f.f11853a.u(0L, j114, 0L, 0L, pVar6, ((i27 >> 15) & 112) | 24576, 13);
                            final l1 l1Var2 = snackbarData;
                            pVar6.T(1157296644);
                            boolean zS = pVar6.s(l1Var2);
                            Object objU = pVar6.U();
                            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$1$1
                                    {
                                        super(0);
                                    }

                                    @Override // yh.a
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                                        invoke2();
                                        return kotlin.b2.f124493a;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        l1Var2.b();
                                    }
                                };
                                pVar6.N(objU);
                            }
                            pVar6.c0();
                            final String str = actionLabel;
                            ButtonKt.e((yh.a) objU, null, false, null, eVarU, null, null, null, null, androidx.compose.runtime.internal.b.b(pVar6, 521110564, true, new yh.q<androidx.compose.foundation.layout.x0, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d androidx.compose.foundation.layout.x0 TextButton, @dl.e androidx.compose.runtime.p pVar7, int i29) {
                                    kotlin.jvm.internal.f0.p(TextButton, "$this$TextButton");
                                    if ((i29 & 81) == 16 && pVar7.b()) {
                                        pVar7.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(521110564, i29, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:211)");
                                    }
                                    TextKt.c(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, pVar7, 0, 0, com.google.android.exoplayer2.audio.v0.f44322j);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.foundation.layout.x0 x0Var, androidx.compose.runtime.p pVar7, Integer num) {
                                    a(x0Var, pVar7, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVar6, com.google.android.exoplayer2.j.G, bb.c.b.A6);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar6, Integer num) {
                            a(pVar6, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    };
                    z13 = true;
                    aVarB = androidx.compose.runtime.internal.b.b(pVarF, -1378313599, true, pVar5);
                } else {
                    z13 = true;
                    aVarB = null;
                }
                if (snackbarData.getVisuals().getWithDismissAction()) {
                    l1Var = snackbarData;
                    aVarB2 = androidx.compose.runtime.internal.b.b(pVarF, -1812633777, z13, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar6, int i28) {
                            if ((i28 & 11) == 2 && pVar6.b()) {
                                pVar6.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1812633777, i28, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:219)");
                            }
                            final l1 l1Var2 = l1Var;
                            pVar6.T(1157296644);
                            boolean zS = pVar6.s(l1Var2);
                            Object objU = pVar6.U();
                            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1$1$1
                                    {
                                        super(0);
                                    }

                                    @Override // yh.a
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                                        invoke2();
                                        return kotlin.b2.f124493a;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        l1Var2.dismiss();
                                    }
                                };
                                pVar6.N(objU);
                            }
                            pVar6.c0();
                            IconButtonKt.e((yh.a) objU, null, false, null, null, ComposableSingletons$SnackbarKt.f9327a.a(), pVar6, androidx.profileinstaller.o.c.f26824k, 30);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar6, Integer num) {
                            a(pVar6, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                } else {
                    l1Var = snackbarData;
                    aVarB2 = null;
                }
                androidx.compose.ui.n nVar9 = nVar3;
                int i28 = i12 << 3;
                c(PaddingKt.k(nVar3, s1.h.g(12)), aVarB, aVarB2, z12, g2VarF, jC, jD, j15, jE, androidx.compose.runtime.internal.b.b(pVarF, -1266389126, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$3
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar6, int i29) {
                        if ((i29 & 11) == 2 && pVar6.b()) {
                            pVar6.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1266389126, i29, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:243)");
                        }
                        TextKt.c(l1Var.getVisuals().getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, pVar6, 0, 0, com.google.android.exoplayer2.audio.v0.f44322j);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar6, Integer num) {
                        a(pVar6, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, 805306368 | (i28 & bb.c.g.f32954lc) | (57344 & i28) | (458752 & i28) | (i28 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                j16 = jA;
                z14 = z12;
                g2Var3 = g2VarF;
                nVar2 = nVar9;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        g2VarF = m1.f12029a.f(pVarF, 6);
                        i12 &= -7169;
                    } else {
                        g2VarF = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        jC = m1.f12029a.c(pVarF, 6);
                        i12 &= -57345;
                    } else {
                        jC = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jD = m1.f12029a.d(pVarF, 6);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        jA = m1.f12029a.a(pVarF, 6);
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jB = m1.f12029a.b(pVarF, 6);
                        i12 = (-29360129) & i12;
                    } else {
                        jB = j13;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        j15 = jB;
                        jE = m1.f12029a.e(pVarF, 6);
                    } else {
                        jE = j14;
                        j15 = jB;
                    }
                } else {
                    if (i19 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        g2VarF = m1.f12029a.f(pVarF, 6);
                        i12 &= -7169;
                    } else {
                        g2VarF = g2Var2;
                    }
                    if ((i11 & 16) != 0) {
                        jC = m1.f12029a.c(pVarF, 6);
                        i12 &= -57345;
                    } else {
                        jC = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jD = m1.f12029a.d(pVarF, 6);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        jA = m1.f12029a.a(pVarF, 6);
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jB = m1.f12029a.b(pVarF, 6);
                        i12 = (-29360129) & i12;
                    } else {
                        jB = j13;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        j15 = jB;
                        jE = m1.f12029a.e(pVarF, 6);
                    } else {
                        jE = j14;
                        j15 = jB;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(274621471, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:194)");
                }
                actionLabel = snackbarData.getVisuals().getActionLabel();
                if (actionLabel != null) {
                    final long j115 = jA;
                    final int i29 = i12;
                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar6 = new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                ComposerKt.w0(-1378313599, i210, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:207)");
                            }
                            e eVarU = f.f11853a.u(0L, j115, 0L, 0L, pVar7, ((i29 >> 15) & 112) | 24576, 13);
                            final l1 l1Var2 = snackbarData;
                            pVar7.T(1157296644);
                            boolean zS = pVar7.s(l1Var2);
                            Object objU = pVar7.U();
                            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$1$1
                                    {
                                        super(0);
                                    }

                                    @Override // yh.a
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                                        invoke2();
                                        return kotlin.b2.f124493a;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        l1Var2.b();
                                    }
                                };
                                pVar7.N(objU);
                            }
                            pVar7.c0();
                            final String str = actionLabel;
                            ButtonKt.e((yh.a) objU, null, false, null, eVarU, null, null, null, null, androidx.compose.runtime.internal.b.b(pVar7, 521110564, true, new yh.q<androidx.compose.foundation.layout.x0, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d androidx.compose.foundation.layout.x0 TextButton, @dl.e androidx.compose.runtime.p pVar8, int i211) {
                                    kotlin.jvm.internal.f0.p(TextButton, "$this$TextButton");
                                    if ((i211 & 81) == 16 && pVar8.b()) {
                                        pVar8.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(521110564, i211, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:211)");
                                    }
                                    TextKt.c(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, pVar8, 0, 0, com.google.android.exoplayer2.audio.v0.f44322j);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.foundation.layout.x0 x0Var, androidx.compose.runtime.p pVar8, Integer num) {
                                    a(x0Var, pVar8, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVar7, com.google.android.exoplayer2.j.G, bb.c.b.A6);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar7, Integer num) {
                            a(pVar7, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    };
                    z13 = true;
                    aVarB = androidx.compose.runtime.internal.b.b(pVarF, -1378313599, true, pVar6);
                } else {
                    z13 = true;
                    aVarB = null;
                }
                if (snackbarData.getVisuals().getWithDismissAction()) {
                    l1Var = snackbarData;
                    aVarB2 = androidx.compose.runtime.internal.b.b(pVarF, -1812633777, z13, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                ComposerKt.w0(-1812633777, i210, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:219)");
                            }
                            final l1 l1Var2 = l1Var;
                            pVar7.T(1157296644);
                            boolean zS = pVar7.s(l1Var2);
                            Object objU = pVar7.U();
                            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1$1$1
                                    {
                                        super(0);
                                    }

                                    @Override // yh.a
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                                        invoke2();
                                        return kotlin.b2.f124493a;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        l1Var2.dismiss();
                                    }
                                };
                                pVar7.N(objU);
                            }
                            pVar7.c0();
                            IconButtonKt.e((yh.a) objU, null, false, null, null, ComposableSingletons$SnackbarKt.f9327a.a(), pVar7, androidx.profileinstaller.o.c.f26824k, 30);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar7, Integer num) {
                            a(pVar7, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                } else {
                    l1Var = snackbarData;
                    aVarB2 = null;
                }
                androidx.compose.ui.n nVar10 = nVar3;
                int i210 = i12 << 3;
                c(PaddingKt.k(nVar3, s1.h.g(12)), aVarB, aVarB2, z12, g2VarF, jC, jD, j15, jE, androidx.compose.runtime.internal.b.b(pVarF, -1266389126, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$3
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar7, int i211) {
                        if ((i211 & 11) == 2 && pVar7.b()) {
                            pVar7.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1266389126, i211, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:243)");
                        }
                        TextKt.c(l1Var.getVisuals().getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, pVar7, 0, 0, com.google.android.exoplayer2.audio.v0.f44322j);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar7, Integer num) {
                        a(pVar7, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, 805306368 | (i210 & bb.c.g.f32954lc) | (57344 & i210) | (458752 & i210) | (i210 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                j16 = jA;
                z14 = z12;
                g2Var3 = g2VarF;
                nVar2 = nVar10;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar11 = nVar2;
            final long j116 = jC;
            final long j117 = jD;
            final long j26 = j16;
            final long j27 = j15;
            final long j28 = jE;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar7, int i211) {
                    SnackbarKt.d(snackbarData, nVar11, z14, g2Var3, j116, j117, j26, j27, j28, pVar7, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar7, Integer num) {
                    a(pVar7, num.intValue());
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
        if ((i10 & 57344) != 0) {
            i12 |= ((i11 & 16) == 0 || !pVarF.z(j10)) ? 8192 : 16384;
        }
        if ((i10 & 458752) == 0) {
            jD = j11;
            if ((i11 & 32) == 0) {
                i18 = 65536;
            } else {
                i18 = 65536;
            }
            i12 |= i18;
        } else {
            jD = j11;
        }
        if ((i10 & 3670016) == 0) {
            jA = j12;
            if ((i11 & 64) == 0) {
                i17 = 524288;
            } else {
                i17 = 524288;
            }
            i12 |= i17;
        } else {
            jA = j12;
        }
        if ((i10 & 29360128) != 0) {
            if ((i11 & 128) == 0) {
                i16 = 4194304;
            } else {
                i16 = 4194304;
            }
            i12 |= i16;
        }
        if ((i10 & 234881024) != 0) {
            if ((i11 & 256) == 0) {
                i15 = 33554432;
            } else {
                i15 = 33554432;
            }
            i12 |= i15;
        }
        if ((191739611 & i12) == 38347922) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    z12 = false;
                } else {
                    z12 = z11;
                }
                if ((i11 & 8) != 0) {
                    g2VarF = m1.f12029a.f(pVarF, 6);
                    i12 &= -7169;
                } else {
                    g2VarF = g2Var2;
                }
                if ((i11 & 16) != 0) {
                    jC = m1.f12029a.c(pVarF, 6);
                    i12 &= -57345;
                } else {
                    jC = j10;
                }
                if ((i11 & 32) != 0) {
                    jD = m1.f12029a.d(pVarF, 6);
                    i12 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    jA = m1.f12029a.a(pVarF, 6);
                    i12 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    jB = m1.f12029a.b(pVarF, 6);
                    i12 = (-29360129) & i12;
                } else {
                    jB = j13;
                }
                if ((i11 & 256) != 0) {
                    i12 &= -234881025;
                    j15 = jB;
                    jE = m1.f12029a.e(pVarF, 6);
                } else {
                    jE = j14;
                    j15 = jB;
                }
            } else {
                if (i19 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    z12 = false;
                } else {
                    z12 = z11;
                }
                if ((i11 & 8) != 0) {
                    g2VarF = m1.f12029a.f(pVarF, 6);
                    i12 &= -7169;
                } else {
                    g2VarF = g2Var2;
                }
                if ((i11 & 16) != 0) {
                    jC = m1.f12029a.c(pVarF, 6);
                    i12 &= -57345;
                } else {
                    jC = j10;
                }
                if ((i11 & 32) != 0) {
                    jD = m1.f12029a.d(pVarF, 6);
                    i12 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    jA = m1.f12029a.a(pVarF, 6);
                    i12 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    jB = m1.f12029a.b(pVarF, 6);
                    i12 = (-29360129) & i12;
                } else {
                    jB = j13;
                }
                if ((i11 & 256) != 0) {
                    i12 &= -234881025;
                    j15 = jB;
                    jE = m1.f12029a.e(pVarF, 6);
                } else {
                    jE = j14;
                    j15 = jB;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(274621471, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:194)");
            }
            actionLabel = snackbarData.getVisuals().getActionLabel();
            if (actionLabel != null) {
                final long j118 = jA;
                final int i211 = i12;
                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar7 = new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar8, int i212) {
                        if ((i212 & 11) == 2 && pVar8.b()) {
                            pVar8.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1378313599, i212, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:207)");
                        }
                        e eVarU = f.f11853a.u(0L, j118, 0L, 0L, pVar8, ((i211 >> 15) & 112) | 24576, 13);
                        final l1 l1Var2 = snackbarData;
                        pVar8.T(1157296644);
                        boolean zS = pVar8.s(l1Var2);
                        Object objU = pVar8.U();
                        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$1$1
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                                    invoke2();
                                    return kotlin.b2.f124493a;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    l1Var2.b();
                                }
                            };
                            pVar8.N(objU);
                        }
                        pVar8.c0();
                        final String str = actionLabel;
                        ButtonKt.e((yh.a) objU, null, false, null, eVarU, null, null, null, null, androidx.compose.runtime.internal.b.b(pVar8, 521110564, true, new yh.q<androidx.compose.foundation.layout.x0, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d androidx.compose.foundation.layout.x0 TextButton, @dl.e androidx.compose.runtime.p pVar9, int i213) {
                                kotlin.jvm.internal.f0.p(TextButton, "$this$TextButton");
                                if ((i213 & 81) == 16 && pVar9.b()) {
                                    pVar9.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(521110564, i213, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:211)");
                                }
                                TextKt.c(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, pVar9, 0, 0, com.google.android.exoplayer2.audio.v0.f44322j);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.foundation.layout.x0 x0Var, androidx.compose.runtime.p pVar9, Integer num) {
                                a(x0Var, pVar9, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVar8, com.google.android.exoplayer2.j.G, bb.c.b.A6);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar8, Integer num) {
                        a(pVar8, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                };
                z13 = true;
                aVarB = androidx.compose.runtime.internal.b.b(pVarF, -1378313599, true, pVar7);
            } else {
                z13 = true;
                aVarB = null;
            }
            if (snackbarData.getVisuals().getWithDismissAction()) {
                l1Var = snackbarData;
                aVarB2 = androidx.compose.runtime.internal.b.b(pVarF, -1812633777, z13, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar8, int i212) {
                        if ((i212 & 11) == 2 && pVar8.b()) {
                            pVar8.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1812633777, i212, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:219)");
                        }
                        final l1 l1Var2 = l1Var;
                        pVar8.T(1157296644);
                        boolean zS = pVar8.s(l1Var2);
                        Object objU = pVar8.U();
                        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1$1$1
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                                    invoke2();
                                    return kotlin.b2.f124493a;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    l1Var2.dismiss();
                                }
                            };
                            pVar8.N(objU);
                        }
                        pVar8.c0();
                        IconButtonKt.e((yh.a) objU, null, false, null, null, ComposableSingletons$SnackbarKt.f9327a.a(), pVar8, androidx.profileinstaller.o.c.f26824k, 30);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar8, Integer num) {
                        a(pVar8, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            } else {
                l1Var = snackbarData;
                aVarB2 = null;
            }
            androidx.compose.ui.n nVar12 = nVar3;
            int i212 = i12 << 3;
            c(PaddingKt.k(nVar3, s1.h.g(12)), aVarB, aVarB2, z12, g2VarF, jC, jD, j15, jE, androidx.compose.runtime.internal.b.b(pVarF, -1266389126, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$3
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar8, int i213) {
                    if ((i213 & 11) == 2 && pVar8.b()) {
                        pVar8.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1266389126, i213, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:243)");
                    }
                    TextKt.c(l1Var.getVisuals().getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, pVar8, 0, 0, com.google.android.exoplayer2.audio.v0.f44322j);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar8, Integer num) {
                    a(pVar8, num.intValue());
                    return kotlin.b2.f124493a;
                }
            }), pVarF, 805306368 | (i212 & bb.c.g.f32954lc) | (57344 & i212) | (458752 & i212) | (i212 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            j16 = jA;
            z14 = z12;
            g2Var3 = g2VarF;
            nVar2 = nVar12;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    z12 = false;
                } else {
                    z12 = z11;
                }
                if ((i11 & 8) != 0) {
                    g2VarF = m1.f12029a.f(pVarF, 6);
                    i12 &= -7169;
                } else {
                    g2VarF = g2Var2;
                }
                if ((i11 & 16) != 0) {
                    jC = m1.f12029a.c(pVarF, 6);
                    i12 &= -57345;
                } else {
                    jC = j10;
                }
                if ((i11 & 32) != 0) {
                    jD = m1.f12029a.d(pVarF, 6);
                    i12 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    jA = m1.f12029a.a(pVarF, 6);
                    i12 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    jB = m1.f12029a.b(pVarF, 6);
                    i12 = (-29360129) & i12;
                } else {
                    jB = j13;
                }
                if ((i11 & 256) != 0) {
                    i12 &= -234881025;
                    j15 = jB;
                    jE = m1.f12029a.e(pVarF, 6);
                } else {
                    jE = j14;
                    j15 = jB;
                }
            } else {
                if (i19 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    z12 = false;
                } else {
                    z12 = z11;
                }
                if ((i11 & 8) != 0) {
                    g2VarF = m1.f12029a.f(pVarF, 6);
                    i12 &= -7169;
                } else {
                    g2VarF = g2Var2;
                }
                if ((i11 & 16) != 0) {
                    jC = m1.f12029a.c(pVarF, 6);
                    i12 &= -57345;
                } else {
                    jC = j10;
                }
                if ((i11 & 32) != 0) {
                    jD = m1.f12029a.d(pVarF, 6);
                    i12 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    jA = m1.f12029a.a(pVarF, 6);
                    i12 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    jB = m1.f12029a.b(pVarF, 6);
                    i12 = (-29360129) & i12;
                } else {
                    jB = j13;
                }
                if ((i11 & 256) != 0) {
                    i12 &= -234881025;
                    j15 = jB;
                    jE = m1.f12029a.e(pVarF, 6);
                } else {
                    jE = j14;
                    j15 = jB;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(274621471, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:194)");
            }
            actionLabel = snackbarData.getVisuals().getActionLabel();
            if (actionLabel != null) {
                final long j119 = jA;
                final int i213 = i12;
                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar8 = new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar9, int i214) {
                        if ((i214 & 11) == 2 && pVar9.b()) {
                            pVar9.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1378313599, i214, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:207)");
                        }
                        e eVarU = f.f11853a.u(0L, j119, 0L, 0L, pVar9, ((i213 >> 15) & 112) | 24576, 13);
                        final l1 l1Var2 = snackbarData;
                        pVar9.T(1157296644);
                        boolean zS = pVar9.s(l1Var2);
                        Object objU = pVar9.U();
                        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$1$1
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                                    invoke2();
                                    return kotlin.b2.f124493a;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    l1Var2.b();
                                }
                            };
                            pVar9.N(objU);
                        }
                        pVar9.c0();
                        final String str = actionLabel;
                        ButtonKt.e((yh.a) objU, null, false, null, eVarU, null, null, null, null, androidx.compose.runtime.internal.b.b(pVar9, 521110564, true, new yh.q<androidx.compose.foundation.layout.x0, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d androidx.compose.foundation.layout.x0 TextButton, @dl.e androidx.compose.runtime.p pVar10, int i215) {
                                kotlin.jvm.internal.f0.p(TextButton, "$this$TextButton");
                                if ((i215 & 81) == 16 && pVar10.b()) {
                                    pVar10.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(521110564, i215, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:211)");
                                }
                                TextKt.c(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, pVar10, 0, 0, com.google.android.exoplayer2.audio.v0.f44322j);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.foundation.layout.x0 x0Var, androidx.compose.runtime.p pVar10, Integer num) {
                                a(x0Var, pVar10, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVar9, com.google.android.exoplayer2.j.G, bb.c.b.A6);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar9, Integer num) {
                        a(pVar9, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                };
                z13 = true;
                aVarB = androidx.compose.runtime.internal.b.b(pVarF, -1378313599, true, pVar8);
            } else {
                z13 = true;
                aVarB = null;
            }
            if (snackbarData.getVisuals().getWithDismissAction()) {
                l1Var = snackbarData;
                aVarB2 = androidx.compose.runtime.internal.b.b(pVarF, -1812633777, z13, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar9, int i214) {
                        if ((i214 & 11) == 2 && pVar9.b()) {
                            pVar9.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1812633777, i214, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:219)");
                        }
                        final l1 l1Var2 = l1Var;
                        pVar9.T(1157296644);
                        boolean zS = pVar9.s(l1Var2);
                        Object objU = pVar9.U();
                        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1$1$1
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                                    invoke2();
                                    return kotlin.b2.f124493a;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    l1Var2.dismiss();
                                }
                            };
                            pVar9.N(objU);
                        }
                        pVar9.c0();
                        IconButtonKt.e((yh.a) objU, null, false, null, null, ComposableSingletons$SnackbarKt.f9327a.a(), pVar9, androidx.profileinstaller.o.c.f26824k, 30);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar9, Integer num) {
                        a(pVar9, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            } else {
                l1Var = snackbarData;
                aVarB2 = null;
            }
            androidx.compose.ui.n nVar13 = nVar3;
            int i214 = i12 << 3;
            c(PaddingKt.k(nVar3, s1.h.g(12)), aVarB, aVarB2, z12, g2VarF, jC, jD, j15, jE, androidx.compose.runtime.internal.b.b(pVarF, -1266389126, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$3
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar9, int i215) {
                    if ((i215 & 11) == 2 && pVar9.b()) {
                        pVar9.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1266389126, i215, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:243)");
                    }
                    TextKt.c(l1Var.getVisuals().getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, pVar9, 0, 0, com.google.android.exoplayer2.audio.v0.f44322j);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar9, Integer num) {
                    a(pVar9, num.intValue());
                    return kotlin.b2.f124493a;
                }
            }), pVarF, 805306368 | (i214 & bb.c.g.f32954lc) | (57344 & i214) | (458752 & i214) | (i214 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            j16 = jA;
            z14 = z12;
            g2Var3 = g2VarF;
            nVar2 = nVar13;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        final androidx.compose.ui.n nVar14 = nVar2;
        final long j1110 = jC;
        final long j1111 = jD;
        final long j29 = j16;
        final long j210 = j15;
        final long j211 = jE;
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar9, int i215) {
                SnackbarKt.d(snackbarData, nVar14, z14, g2Var3, j1110, j1111, j29, j210, j211, pVar9, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar9, Integer num) {
                a(pVar9, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }
}
