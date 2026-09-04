package androidx.compose.ui.draw;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.p;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.q;

/* JADX INFO: compiled from: DrawModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004\u001a#\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0002\b\u0004\u001a#\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¨\u0006\r"}, d2 = {"Landroidx/compose/ui/n;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/b2;", "Lkotlin/t;", "onDraw", ak.av, "Landroidx/compose/ui/draw/CacheDrawScope;", "Landroidx/compose/ui/draw/k;", "onBuildDrawCache", "b", "Landroidx/compose/ui/graphics/drawscope/d;", ak.aF, "ui_release"}, k = 2, mv = {1, 7, 1})
public final class DrawModifierKt {
    @dl.d
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, @dl.d final yh.l<? super androidx.compose.ui.graphics.drawscope.g, b2> onDraw) {
        f0.p(nVar, "<this>");
        f0.p(onDraw, "onDraw");
        return nVar.s0(new e(onDraw, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.ui.draw.DrawModifierKt$drawBehind$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                f0.p(x0Var, "$this$null");
                x0Var.d("drawBehind");
                x0Var.getProperties().c("onDraw", onDraw);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b()));
    }

    @dl.d
    public static final androidx.compose.ui.n b(@dl.d androidx.compose.ui.n nVar, @dl.d final yh.l<? super CacheDrawScope, k> onBuildDrawCache) {
        f0.p(nVar, "<this>");
        f0.p(onBuildDrawCache, "onBuildDrawCache");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.ui.draw.DrawModifierKt$drawWithCache$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                f0.p(x0Var, "$this$null");
                x0Var.d("drawWithCache");
                x0Var.getProperties().c("onBuildDrawCache", onBuildDrawCache);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new q<androidx.compose.ui.n, p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.ui.draw.DrawModifierKt$drawWithCache$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e p pVar, int i10) {
                f0.p(composed, "$this$composed");
                pVar.T(-1689569019);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1689569019, i10, -1, "androidx.compose.ui.draw.drawWithCache.<anonymous> (DrawModifier.kt:141)");
                }
                pVar.T(-492369756);
                Object objU = pVar.U();
                if (objU == p.INSTANCE.a()) {
                    objU = new CacheDrawScope();
                    pVar.N(objU);
                }
                pVar.c0();
                androidx.compose.ui.n nVarS0 = composed.s0(new DrawContentCacheModifier((CacheDrawScope) objU, onBuildDrawCache));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return nVarS0;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }

    @dl.d
    public static final androidx.compose.ui.n c(@dl.d androidx.compose.ui.n nVar, @dl.d final yh.l<? super androidx.compose.ui.graphics.drawscope.d, b2> onDraw) {
        f0.p(nVar, "<this>");
        f0.p(onDraw, "onDraw");
        return nVar.s0(new l(onDraw, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.ui.draw.DrawModifierKt$drawWithContent$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                f0.p(x0Var, "$this$null");
                x0Var.d("drawWithContent");
                x0Var.getProperties().c("onDraw", onDraw);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b()));
    }
}
