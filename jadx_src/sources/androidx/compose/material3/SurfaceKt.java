package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.g2;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.r;
import androidx.compose.ui.unit.LayoutDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Surface.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ap\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0092\u0001\u0010\u0017\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u009a\u0001\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a \u0001\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00132\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u001d2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001a;\u0010\"\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0007H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u001a%\u0010%\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0007H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\" \u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070'8\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b)\u0010*\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006,"}, d2 = {"Landroidx/compose/ui/n;", "modifier", "Landroidx/compose/ui/graphics/g2;", "shape", "Landroidx/compose/ui/graphics/l0;", "color", "contentColor", "Ls1/h;", "tonalElevation", "shadowElevation", "Landroidx/compose/foundation/g;", "border", "Lkotlin/Function0;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "content", ak.av, "(Landroidx/compose/ui/n;Landroidx/compose/ui/graphics/g2;JJFFLandroidx/compose/foundation/g;Lyh/p;Landroidx/compose/runtime/p;II)V", "onClick", "", "enabled", "Landroidx/compose/foundation/interaction/g;", "interactionSource", "d", "(Lyh/a;Landroidx/compose/ui/n;ZLandroidx/compose/ui/graphics/g2;JJFFLandroidx/compose/foundation/g;Landroidx/compose/foundation/interaction/g;Lyh/p;Landroidx/compose/runtime/p;III)V", "selected", "b", "(ZLyh/a;Landroidx/compose/ui/n;ZLandroidx/compose/ui/graphics/g2;JJFFLandroidx/compose/foundation/g;Landroidx/compose/foundation/interaction/g;Lyh/p;Landroidx/compose/runtime/p;III)V", "checked", "Lkotlin/Function1;", "onCheckedChange", ak.aF, "(ZLyh/l;Landroidx/compose/ui/n;ZLandroidx/compose/ui/graphics/g2;JJFFLandroidx/compose/foundation/g;Landroidx/compose/foundation/interaction/g;Lyh/p;Landroidx/compose/runtime/p;III)V", com.google.android.exoplayer2.text.ttml.d.H, RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/compose/ui/n;Landroidx/compose/ui/graphics/g2;JLandroidx/compose/foundation/g;F)Landroidx/compose/ui/n;", "elevation", "i", "(JFLandroidx/compose/runtime/p;I)J", "Landroidx/compose/runtime/j1;", "Landroidx/compose/runtime/j1;", "g", "()Landroidx/compose/runtime/j1;", "LocalAbsoluteTonalElevation", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class SurfaceKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.j1<s1.h> f10952a = CompositionLocalKt.d(null, new yh.a<s1.h>() { // from class: androidx.compose.material3.SurfaceKt$LocalAbsoluteTonalElevation$1
        public final float a() {
            return s1.h.g(0);
        }

        @Override // yh.a
        public /* bridge */ /* synthetic */ s1.h invoke() {
            return s1.h.d(a());
        }
    }, 1, null);

    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void a(@dl.e androidx.compose.ui.n nVar, @dl.e g2 g2Var, long j10, long j11, float f10, float f11, @dl.e BorderStroke borderStroke, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, int i11) {
        kotlin.jvm.internal.f0.p(content, "content");
        pVar.T(-513881741);
        final androidx.compose.ui.n nVar2 = (i11 & 1) != 0 ? androidx.compose.ui.n.INSTANCE : nVar;
        final g2 g2VarA = (i11 & 2) != 0 ? androidx.compose.ui.graphics.x1.a() : g2Var;
        final long jA = (i11 & 4) != 0 ? o0.f12059a.a(pVar, 6).A() : j10;
        long jC = (i11 & 8) != 0 ? ColorSchemeKt.c(jA, pVar, (i10 >> 6) & 14) : j11;
        float fG = (i11 & 16) != 0 ? s1.h.g(0) : f10;
        float fG2 = (i11 & 32) != 0 ? s1.h.g(0) : f11;
        BorderStroke borderStroke2 = (i11 & 64) != 0 ? null : borderStroke;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-513881741, i10, -1, "androidx.compose.material3.Surface (Surface.kt:98)");
        }
        androidx.compose.runtime.j1<s1.h> j1Var = f10952a;
        final float fG3 = s1.h.g(((s1.h) pVar.K(j1Var)).w() + fG);
        androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(jC)), j1Var.f(s1.h.d(fG3))};
        final BorderStroke borderStroke3 = borderStroke2;
        final float f12 = fG2;
        CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar, -70914509, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SurfaceKt$Surface$1

            /* JADX INFO: renamed from: androidx.compose.material3.SurfaceKt$Surface$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Surface.kt */
            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.SurfaceKt$Surface$1$2", f = "Surface.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass2 extends SuspendLambda implements yh.p<androidx.compose.ui.input.pointer.i0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f10963b;

                AnonymousClass2(kotlin.coroutines.c<? super AnonymousClass2> cVar) {
                    super(2, cVar);
                }

                @Override // yh.p
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@dl.d androidx.compose.ui.input.pointer.i0 i0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
                    return ((AnonymousClass2) create(i0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    return new AnonymousClass2(cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    kotlin.coroutines.intrinsics.b.h();
                    if (this.f10963b != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.t0.n(obj);
                    return kotlin.b2.f124493a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.h
            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i12) {
                if ((i12 & 11) == 2 && pVar2.b()) {
                    pVar2.l();
                    return;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-70914509, i12, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:112)");
                }
                androidx.compose.ui.n nVarC = SuspendingPointerInputFilterKt.c(SemanticsModifierKt.b(SurfaceKt.h(nVar2, g2VarA, SurfaceKt.i(jA, fG3, pVar2, (i10 >> 6) & 14), borderStroke3, f12), false, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.SurfaceKt$Surface$1.1
                    public final void a(@dl.d r semantics) {
                        kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                        a(rVar);
                        return kotlin.b2.f124493a;
                    }
                }), kotlin.b2.f124493a, new AnonymousClass2(null));
                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar3 = content;
                int i13 = i10;
                pVar2.T(733328855);
                androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), true, pVar2, 48);
                pVar2.T(-1323940314);
                s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                yh.a<ComposeUiNode> aVarA = companion.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarC);
                if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVar2.h();
                if (pVar2.D()) {
                    pVar2.L(aVarA);
                } else {
                    pVar2.d();
                }
                pVar2.Y();
                androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                Updater.j(pVarB, i0VarK, companion.d());
                Updater.j(pVarB, eVar, companion.b());
                Updater.j(pVarB, layoutDirection, companion.c());
                Updater.j(pVarB, d2Var, companion.f());
                pVar2.x();
                qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, 0);
                pVar2.T(2058660585);
                pVar2.T(-2137368960);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
                pVar2.T(1703151929);
                pVar3.invoke(pVar2, Integer.valueOf((i13 >> 21) & 14));
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
        }), pVar, 56);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
    }

    @w
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void b(final boolean z10, @dl.d final yh.a<kotlin.b2> onClick, @dl.e androidx.compose.ui.n nVar, boolean z11, @dl.e g2 g2Var, long j10, long j11, float f10, float f11, @dl.e BorderStroke borderStroke, @dl.e androidx.compose.foundation.interaction.g gVar, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11, int i12) {
        androidx.compose.foundation.interaction.g gVar2;
        kotlin.jvm.internal.f0.p(onClick, "onClick");
        kotlin.jvm.internal.f0.p(content, "content");
        pVar.T(540296512);
        androidx.compose.ui.n nVar2 = (i12 & 4) != 0 ? androidx.compose.ui.n.INSTANCE : nVar;
        final boolean z12 = (i12 & 8) != 0 ? true : z11;
        g2 g2VarA = (i12 & 16) != 0 ? androidx.compose.ui.graphics.x1.a() : g2Var;
        long jA = (i12 & 32) != 0 ? o0.f12059a.a(pVar, 6).A() : j10;
        long jC = (i12 & 64) != 0 ? ColorSchemeKt.c(jA, pVar, (i10 >> 15) & 14) : j11;
        float fG = (i12 & 128) != 0 ? s1.h.g(0) : f10;
        float fG2 = (i12 & 256) != 0 ? s1.h.g(0) : f11;
        BorderStroke borderStroke2 = (i12 & 512) != 0 ? null : borderStroke;
        if ((i12 & 1024) != 0) {
            pVar.T(-492369756);
            Object objU = pVar.U();
            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                objU = androidx.compose.foundation.interaction.f.a();
                pVar.N(objU);
            }
            pVar.c0();
            gVar2 = (androidx.compose.foundation.interaction.g) objU;
        } else {
            gVar2 = gVar;
        }
        if (ComposerKt.g0()) {
            ComposerKt.w0(540296512, i10, i11, "androidx.compose.material3.Surface (Surface.kt:311)");
        }
        androidx.compose.runtime.j1<s1.h> j1Var = f10952a;
        final float fG3 = s1.h.g(((s1.h) pVar.K(j1Var)).w() + fG);
        androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(jC)), j1Var.f(s1.h.d(fG3))};
        final androidx.compose.ui.n nVar3 = nVar2;
        final g2 g2Var2 = g2VarA;
        final long j12 = jA;
        final BorderStroke borderStroke3 = borderStroke2;
        final float f12 = fG2;
        final androidx.compose.foundation.interaction.g gVar3 = gVar2;
        CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar, -1164547968, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SurfaceKt$Surface$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.h
            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i13) {
                if ((i13 & 11) == 2 && pVar2.b()) {
                    pVar2.l();
                    return;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1164547968, i13, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:329)");
                }
                androidx.compose.ui.n nVarA = SelectableKt.a(SurfaceKt.h(TouchTargetKt.c(nVar3), g2Var2, SurfaceKt.i(j12, fG3, pVar2, (i10 >> 15) & 14), borderStroke3, f12), z10, gVar3, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar2, 0, 7), z12, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick);
                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar3 = content;
                int i14 = i11;
                pVar2.T(733328855);
                androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), true, pVar2, 48);
                pVar2.T(-1323940314);
                s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                yh.a<ComposeUiNode> aVarA = companion.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarA);
                if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVar2.h();
                if (pVar2.D()) {
                    pVar2.L(aVarA);
                } else {
                    pVar2.d();
                }
                pVar2.Y();
                androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                Updater.j(pVarB, i0VarK, companion.d());
                Updater.j(pVarB, eVar, companion.b());
                Updater.j(pVarB, layoutDirection, companion.c());
                Updater.j(pVarB, d2Var, companion.f());
                pVar2.x();
                qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, 0);
                pVar2.T(2058660585);
                pVar2.T(-2137368960);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
                pVar2.T(796134330);
                pVar3.invoke(pVar2, Integer.valueOf((i14 >> 3) & 14));
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
        }), pVar, 56);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
    }

    @w
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void c(final boolean z10, @dl.d final yh.l<? super Boolean, kotlin.b2> onCheckedChange, @dl.e androidx.compose.ui.n nVar, boolean z11, @dl.e g2 g2Var, long j10, long j11, float f10, float f11, @dl.e BorderStroke borderStroke, @dl.e androidx.compose.foundation.interaction.g gVar, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11, int i12) {
        androidx.compose.foundation.interaction.g gVar2;
        kotlin.jvm.internal.f0.p(onCheckedChange, "onCheckedChange");
        kotlin.jvm.internal.f0.p(content, "content");
        pVar.T(-1877401889);
        androidx.compose.ui.n nVar2 = (i12 & 4) != 0 ? androidx.compose.ui.n.INSTANCE : nVar;
        final boolean z12 = (i12 & 8) != 0 ? true : z11;
        g2 g2VarA = (i12 & 16) != 0 ? androidx.compose.ui.graphics.x1.a() : g2Var;
        long jA = (i12 & 32) != 0 ? o0.f12059a.a(pVar, 6).A() : j10;
        long jC = (i12 & 64) != 0 ? ColorSchemeKt.c(jA, pVar, (i10 >> 15) & 14) : j11;
        float fG = (i12 & 128) != 0 ? s1.h.g(0) : f10;
        float fG2 = (i12 & 256) != 0 ? s1.h.g(0) : f11;
        BorderStroke borderStroke2 = (i12 & 512) != 0 ? null : borderStroke;
        if ((i12 & 1024) != 0) {
            pVar.T(-492369756);
            Object objU = pVar.U();
            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                objU = androidx.compose.foundation.interaction.f.a();
                pVar.N(objU);
            }
            pVar.c0();
            gVar2 = (androidx.compose.foundation.interaction.g) objU;
        } else {
            gVar2 = gVar;
        }
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1877401889, i10, i11, "androidx.compose.material3.Surface (Surface.kt:424)");
        }
        androidx.compose.runtime.j1<s1.h> j1Var = f10952a;
        final float fG3 = s1.h.g(((s1.h) pVar.K(j1Var)).w() + fG);
        androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(jC)), j1Var.f(s1.h.d(fG3))};
        final androidx.compose.ui.n nVar3 = nVar2;
        final g2 g2Var2 = g2VarA;
        final long j12 = jA;
        final BorderStroke borderStroke3 = borderStroke2;
        final float f12 = fG2;
        final androidx.compose.foundation.interaction.g gVar3 = gVar2;
        CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar, 712720927, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SurfaceKt$Surface$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.h
            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i13) {
                if ((i13 & 11) == 2 && pVar2.b()) {
                    pVar2.l();
                    return;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(712720927, i13, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:442)");
                }
                androidx.compose.ui.n nVarA = ToggleableKt.a(SurfaceKt.h(TouchTargetKt.c(nVar3), g2Var2, SurfaceKt.i(j12, fG3, pVar2, (i10 >> 15) & 14), borderStroke3, f12), z10, gVar3, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar2, 0, 7), z12, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.e()), onCheckedChange);
                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar3 = content;
                int i14 = i11;
                pVar2.T(733328855);
                androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), true, pVar2, 48);
                pVar2.T(-1323940314);
                s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                yh.a<ComposeUiNode> aVarA = companion.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarA);
                if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVar2.h();
                if (pVar2.D()) {
                    pVar2.L(aVarA);
                } else {
                    pVar2.d();
                }
                pVar2.Y();
                androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                Updater.j(pVarB, i0VarK, companion.d());
                Updater.j(pVarB, eVar, companion.b());
                Updater.j(pVarB, layoutDirection, companion.c());
                Updater.j(pVarB, d2Var, companion.f());
                pVar2.x();
                qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, 0);
                pVar2.T(2058660585);
                pVar2.T(-2137368960);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
                pVar2.T(-1621564071);
                pVar3.invoke(pVar2, Integer.valueOf((i14 >> 3) & 14));
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
        }), pVar, 56);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
    }

    @w
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void d(@dl.d final yh.a<kotlin.b2> onClick, @dl.e androidx.compose.ui.n nVar, boolean z10, @dl.e g2 g2Var, long j10, long j11, float f10, float f11, @dl.e BorderStroke borderStroke, @dl.e androidx.compose.foundation.interaction.g gVar, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11, int i12) {
        androidx.compose.foundation.interaction.g gVar2;
        kotlin.jvm.internal.f0.p(onClick, "onClick");
        kotlin.jvm.internal.f0.p(content, "content");
        pVar.T(-789752804);
        androidx.compose.ui.n nVar2 = (i12 & 2) != 0 ? androidx.compose.ui.n.INSTANCE : nVar;
        final boolean z11 = (i12 & 4) != 0 ? true : z10;
        g2 g2VarA = (i12 & 8) != 0 ? androidx.compose.ui.graphics.x1.a() : g2Var;
        long jA = (i12 & 16) != 0 ? o0.f12059a.a(pVar, 6).A() : j10;
        long jC = (i12 & 32) != 0 ? ColorSchemeKt.c(jA, pVar, (i10 >> 12) & 14) : j11;
        float fG = (i12 & 64) != 0 ? s1.h.g(0) : f10;
        float fG2 = (i12 & 128) != 0 ? s1.h.g(0) : f11;
        BorderStroke borderStroke2 = (i12 & 256) != 0 ? null : borderStroke;
        if ((i12 & 512) != 0) {
            pVar.T(-492369756);
            Object objU = pVar.U();
            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                objU = androidx.compose.foundation.interaction.f.a();
                pVar.N(objU);
            }
            pVar.c0();
            gVar2 = (androidx.compose.foundation.interaction.g) objU;
        } else {
            gVar2 = gVar;
        }
        if (ComposerKt.g0()) {
            ComposerKt.w0(-789752804, i10, i11, "androidx.compose.material3.Surface (Surface.kt:200)");
        }
        androidx.compose.runtime.j1<s1.h> j1Var = f10952a;
        final float fG3 = s1.h.g(((s1.h) pVar.K(j1Var)).w() + fG);
        androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(jC)), j1Var.f(s1.h.d(fG3))};
        final androidx.compose.ui.n nVar3 = nVar2;
        final g2 g2Var2 = g2VarA;
        final long j12 = jA;
        final BorderStroke borderStroke3 = borderStroke2;
        final float f12 = fG2;
        final androidx.compose.foundation.interaction.g gVar3 = gVar2;
        CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar, 1279702876, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SurfaceKt$Surface$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.h
            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i13) {
                if ((i13 & 11) == 2 && pVar2.b()) {
                    pVar2.l();
                    return;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1279702876, i13, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:217)");
                }
                androidx.compose.ui.n nVarC = ClickableKt.c(SurfaceKt.h(TouchTargetKt.c(nVar3), g2Var2, SurfaceKt.i(j12, fG3, pVar2, (i10 >> 12) & 14), borderStroke3, f12), gVar3, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar2, 0, 7), z11, null, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.a()), onClick, 8, null);
                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar3 = content;
                int i14 = i11;
                pVar2.T(733328855);
                androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), true, pVar2, 48);
                pVar2.T(-1323940314);
                s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                yh.a<ComposeUiNode> aVarA = companion.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarC);
                if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVar2.h();
                if (pVar2.D()) {
                    pVar2.L(aVarA);
                } else {
                    pVar2.d();
                }
                pVar2.Y();
                androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                Updater.j(pVarB, i0VarK, companion.d());
                Updater.j(pVarB, eVar, companion.b());
                Updater.j(pVarB, layoutDirection, companion.c());
                Updater.j(pVarB, d2Var, companion.f());
                pVar2.x();
                qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, 0);
                pVar2.T(2058660585);
                pVar2.T(-2137368960);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
                pVar2.T(-126864234);
                pVar3.invoke(pVar2, Integer.valueOf(i14 & 14));
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
        }), pVar, 56);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
    }

    @dl.d
    public static final androidx.compose.runtime.j1<s1.h> g() {
        return f10952a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.n h(androidx.compose.ui.n nVar, g2 g2Var, long j10, BorderStroke borderStroke, float f10) {
        return androidx.compose.ui.draw.d.a(BackgroundKt.c(ShadowKt.b(nVar, f10, g2Var, false, 0L, 0L, 24, null).s0(borderStroke != null ? BorderKt.f(androidx.compose.ui.n.INSTANCE, borderStroke, g2Var) : androidx.compose.ui.n.INSTANCE), j10, g2Var), g2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.h
    public static final long i(long j10, float f10, androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-2079918090);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-2079918090, i10, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:481)");
        }
        o0 o0Var = o0.f12059a;
        if (androidx.compose.ui.graphics.l0.y(j10, o0Var.a(pVar, 6).A())) {
            j10 = ColorSchemeKt.j(o0Var.a(pVar, 6), f10);
        }
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return j10;
    }
}
