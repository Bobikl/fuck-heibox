package com.max.xiaoheihe;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.b1;
import androidx.compose.foundation.shape.o;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.o0;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.p;
import androidx.compose.runtime.u1;
import androidx.compose.runtime.v1;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.i0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.d2;
import androidx.compose.ui.unit.LayoutDirection;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.jvm.internal.t0;
import yh.q;

/* JADX INFO: compiled from: ComposeTestActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
@t0({"SMAP\nComposeTestActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeTestActivity.kt\ncom/max/xiaoheihe/ComposeTestActivityKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,75:1\n154#2:76\n154#2:110\n164#2:111\n154#2:112\n154#2:147\n75#3,6:77\n81#3:109\n85#3:157\n75#4:83\n76#4,11:85\n75#4:120\n76#4,11:122\n89#4:151\n89#4:156\n76#5:84\n76#5:121\n460#6,13:96\n460#6,13:133\n473#6,3:148\n473#6,3:153\n73#7,7:113\n80#7:146\n84#7:152\n*S KotlinDebug\n*F\n+ 1 ComposeTestActivity.kt\ncom/max/xiaoheihe/ComposeTestActivityKt\n*L\n45#1:76\n52#1:110\n54#1:111\n56#1:112\n65#1:147\n43#1:77,6\n43#1:109\n43#1:157\n43#1:83\n43#1:85,11\n58#1:120\n58#1:122,11\n58#1:151\n43#1:156\n43#1:84\n58#1:121\n43#1:96,13\n58#1:133,13\n58#1:148,3\n43#1:153,3\n58#1:113,7\n58#1:146\n58#1:152\n*E\n"})
public final class ComposeTestActivityKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @r1.c
    @androidx.compose.runtime.h
    public static final void a(@dl.e p pVar, final int i10) {
        if (PatchProxy.proxy(new Object[]{pVar, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.br, new Class[]{p.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        p pVarF = pVar.F(1616815543);
        if (i10 == 0 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(1616815543, i10, -1, "com.max.xiaoheihe.MessageCard (ComposeTestActivity.kt:41)");
            }
            androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
            float f10 = 8;
            androidx.compose.ui.n nVarD = BackgroundKt.d(PaddingKt.k(companion, s1.h.g(f10)), l0.INSTANCE.i(), null, 2, null);
            pVarF.T(693286680);
            Arrangement arrangement = Arrangement.f5896a;
            Arrangement.d dVarP = arrangement.p();
            androidx.compose.ui.c.Companion companion2 = androidx.compose.ui.c.INSTANCE;
            i0 i0VarD = RowKt.d(dVarP, companion2.w(), pVarF, 0);
            pVarF.T(-1323940314);
            s1.e eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            d2 d2Var = (d2) pVarF.K(CompositionLocalsKt.u());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            yh.a<ComposeUiNode> aVarA = companion3.a();
            q<v1<ComposeUiNode>, p, Integer, b2> qVarF = LayoutKt.f(nVarD);
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
            p pVarB = Updater.b(pVarF);
            Updater.j(pVarB, i0VarD, companion3.d());
            Updater.j(pVarB, eVar, companion3.b());
            Updater.j(pVarB, layoutDirection, companion3.c());
            Updater.j(pVarB, d2Var, companion3.f());
            pVarF.x();
            qVarF.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
            pVarF.T(2058660585);
            pVarF.T(-678309503);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6091a;
            pVarF.T(-1247887589);
            Painter painterD = j1.f.d(R.drawable.comment_steam_tag, pVarF, 0);
            androidx.compose.ui.n nVarA = androidx.compose.ui.draw.d.a(SizeKt.C(companion, s1.h.g(40)), o.k());
            float fG = s1.h.g((float) 1.5d);
            o0 o0Var = o0.f12059a;
            int i11 = o0.f12060b;
            ImageKt.b(painterD, null, BorderKt.h(nVarA, fG, o0Var.a(pVarF, i11).c(), o.k()), null, null, 0.0f, null, pVarF, 56, 120);
            b1.a(SizeKt.H(companion, s1.h.g(f10)), pVarF, 6);
            pVarF.T(-483455358);
            i0 i0VarB = ColumnKt.b(arrangement.r(), companion2.u(), pVarF, 0);
            pVarF.T(-1323940314);
            s1.e eVar2 = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection2 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            d2 d2Var2 = (d2) pVarF.K(CompositionLocalsKt.u());
            yh.a<ComposeUiNode> aVarA2 = companion3.a();
            q<v1<ComposeUiNode>, p, Integer, b2> qVarF2 = LayoutKt.f(companion);
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
            p pVarB2 = Updater.b(pVarF);
            Updater.j(pVarB2, i0VarB, companion3.d());
            Updater.j(pVarB2, eVar2, companion3.b());
            Updater.j(pVarB2, layoutDirection2, companion3.c());
            Updater.j(pVarB2, d2Var2, companion3.f());
            pVarF.x();
            qVarF2.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
            pVarF.T(2058660585);
            pVarF.T(-1163856341);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f5971a;
            pVarF.T(1395137425);
            TextKt.c("author  name ", null, o0Var.a(pVarF, i11).v(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, o0Var.c(pVarF, i11).getTitleMedium(), pVarF, 6, 0, 32762);
            b1.a(SizeKt.o(companion, s1.h.g(4)), pVarF, 6);
            TextKt.c("desc 123123123123123123", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, o0Var.c(pVarF, i11).getBodySmall(), pVarF, 6, 0, 32766);
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
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<p, Integer, b2>() { // from class: com.max.xiaoheihe.ComposeTestActivityKt$MessageCard$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e p pVar2, int i12) {
                if (PatchProxy.proxy(new Object[]{pVar2, new Integer(i12)}, this, changeQuickRedirect, false, bb.c.m.cr, new Class[]{p.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                ComposeTestActivityKt.a(pVar2, 1 | i10);
            }

            /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(p pVar2, Integer num) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{pVar2, num}, this, changeQuickRedirect, false, bb.c.m.dr, new Class[]{Object.class, Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }
}
