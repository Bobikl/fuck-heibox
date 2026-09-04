package androidx.compose.foundation.layout;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.j2;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: WindowInsetsPadding.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u0002\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u0007\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\b\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\t\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\n\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u000b\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\f\u001a\u00020\u0000*\u00020\u0000\u001aC\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\u0019\b\b\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u00102\u0019\b\u0004\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\r¢\u0006\u0002\b\u0010H\u0083\b¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/n;", "g", RXScreenCaptureService.KEY_HEIGHT, "f", "j", "b", "i", ak.aF, "e", ak.av, "l", "k", "d", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/b2;", "Lkotlin/t;", "inspectorInfo", "Landroidx/compose/foundation/layout/WindowInsetsHolder;", "Landroidx/compose/foundation/layout/h1;", "insetsCalculation", "m", "foundation-layout_release"}, k = 2, mv = {1, 7, 1})
public final class WindowInsetsPadding_androidKt {
    @dl.d
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$captionBarPadding$$inlined$debugInspectorInfo$1
            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("captionBarPadding");
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$captionBarPadding$$inlined$windowInsetsPadding$1
            /* JADX WARN: Multi-variable type inference failed */
            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(359872873);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolderC = WindowInsetsHolder.INSTANCE.c(pVar, 8);
                pVar.T(1157296644);
                boolean zS = pVar.s(windowInsetsHolderC);
                Object objU = pVar.U();
                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new InsetsPaddingModifier(windowInsetsHolderC.getCaptionBar(), null, 2, 0 == true ? 1 : 0);
                    pVar.N(objU);
                }
                pVar.c0();
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objU;
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return insetsPaddingModifier;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }

    @dl.d
    public static final androidx.compose.ui.n b(@dl.d androidx.compose.ui.n nVar) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$displayCutoutPadding$$inlined$debugInspectorInfo$1
            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("displayCutoutPadding");
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$displayCutoutPadding$$inlined$windowInsetsPadding$1
            /* JADX WARN: Multi-variable type inference failed */
            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(359872873);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolderC = WindowInsetsHolder.INSTANCE.c(pVar, 8);
                pVar.T(1157296644);
                boolean zS = pVar.s(windowInsetsHolderC);
                Object objU = pVar.U();
                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new InsetsPaddingModifier(windowInsetsHolderC.getDisplayCutout(), null, 2, 0 == true ? 1 : 0);
                    pVar.N(objU);
                }
                pVar.c0();
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objU;
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return insetsPaddingModifier;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }

    @dl.d
    public static final androidx.compose.ui.n c(@dl.d androidx.compose.ui.n nVar) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$imePadding$$inlined$debugInspectorInfo$1
            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("imePadding");
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$imePadding$$inlined$windowInsetsPadding$1
            /* JADX WARN: Multi-variable type inference failed */
            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(359872873);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolderC = WindowInsetsHolder.INSTANCE.c(pVar, 8);
                pVar.T(1157296644);
                boolean zS = pVar.s(windowInsetsHolderC);
                Object objU = pVar.U();
                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new InsetsPaddingModifier(windowInsetsHolderC.getIme(), null, 2, 0 == true ? 1 : 0);
                    pVar.N(objU);
                }
                pVar.c0();
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objU;
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return insetsPaddingModifier;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }

    @dl.d
    public static final androidx.compose.ui.n d(@dl.d androidx.compose.ui.n nVar) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$mandatorySystemGesturesPadding$$inlined$debugInspectorInfo$1
            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("mandatorySystemGesturesPadding");
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$mandatorySystemGesturesPadding$$inlined$windowInsetsPadding$1
            /* JADX WARN: Multi-variable type inference failed */
            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(359872873);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolderC = WindowInsetsHolder.INSTANCE.c(pVar, 8);
                pVar.T(1157296644);
                boolean zS = pVar.s(windowInsetsHolderC);
                Object objU = pVar.U();
                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new InsetsPaddingModifier(windowInsetsHolderC.getMandatorySystemGestures(), null, 2, 0 == true ? 1 : 0);
                    pVar.N(objU);
                }
                pVar.c0();
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objU;
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return insetsPaddingModifier;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }

    @dl.d
    public static final androidx.compose.ui.n e(@dl.d androidx.compose.ui.n nVar) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$navigationBarsPadding$$inlined$debugInspectorInfo$1
            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("navigationBarsPadding");
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$navigationBarsPadding$$inlined$windowInsetsPadding$1
            /* JADX WARN: Multi-variable type inference failed */
            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(359872873);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolderC = WindowInsetsHolder.INSTANCE.c(pVar, 8);
                pVar.T(1157296644);
                boolean zS = pVar.s(windowInsetsHolderC);
                Object objU = pVar.U();
                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new InsetsPaddingModifier(windowInsetsHolderC.getNavigationBars(), null, 2, 0 == true ? 1 : 0);
                    pVar.N(objU);
                }
                pVar.c0();
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objU;
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return insetsPaddingModifier;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }

    @dl.d
    public static final androidx.compose.ui.n f(@dl.d androidx.compose.ui.n nVar) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$safeContentPadding$$inlined$debugInspectorInfo$1
            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("safeContentPadding");
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$safeContentPadding$$inlined$windowInsetsPadding$1
            /* JADX WARN: Multi-variable type inference failed */
            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(359872873);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolderC = WindowInsetsHolder.INSTANCE.c(pVar, 8);
                pVar.T(1157296644);
                boolean zS = pVar.s(windowInsetsHolderC);
                Object objU = pVar.U();
                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new InsetsPaddingModifier(windowInsetsHolderC.getSafeContent(), null, 2, 0 == true ? 1 : 0);
                    pVar.N(objU);
                }
                pVar.c0();
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objU;
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return insetsPaddingModifier;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }

    @dl.d
    public static final androidx.compose.ui.n g(@dl.d androidx.compose.ui.n nVar) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$safeDrawingPadding$$inlined$debugInspectorInfo$1
            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("safeDrawingPadding");
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$safeDrawingPadding$$inlined$windowInsetsPadding$1
            /* JADX WARN: Multi-variable type inference failed */
            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(359872873);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolderC = WindowInsetsHolder.INSTANCE.c(pVar, 8);
                pVar.T(1157296644);
                boolean zS = pVar.s(windowInsetsHolderC);
                Object objU = pVar.U();
                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new InsetsPaddingModifier(windowInsetsHolderC.getSafeDrawing(), null, 2, 0 == true ? 1 : 0);
                    pVar.N(objU);
                }
                pVar.c0();
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objU;
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return insetsPaddingModifier;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }

    @dl.d
    public static final androidx.compose.ui.n h(@dl.d androidx.compose.ui.n nVar) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$safeGesturesPadding$$inlined$debugInspectorInfo$1
            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("safeGesturesPadding");
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$safeGesturesPadding$$inlined$windowInsetsPadding$1
            /* JADX WARN: Multi-variable type inference failed */
            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(359872873);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolderC = WindowInsetsHolder.INSTANCE.c(pVar, 8);
                pVar.T(1157296644);
                boolean zS = pVar.s(windowInsetsHolderC);
                Object objU = pVar.U();
                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new InsetsPaddingModifier(windowInsetsHolderC.getSafeGestures(), null, 2, 0 == true ? 1 : 0);
                    pVar.N(objU);
                }
                pVar.c0();
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objU;
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return insetsPaddingModifier;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }

    @dl.d
    public static final androidx.compose.ui.n i(@dl.d androidx.compose.ui.n nVar) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$debugInspectorInfo$1
            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("statusBarsPadding");
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1
            /* JADX WARN: Multi-variable type inference failed */
            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(359872873);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolderC = WindowInsetsHolder.INSTANCE.c(pVar, 8);
                pVar.T(1157296644);
                boolean zS = pVar.s(windowInsetsHolderC);
                Object objU = pVar.U();
                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new InsetsPaddingModifier(windowInsetsHolderC.getStatusBars(), null, 2, 0 == true ? 1 : 0);
                    pVar.N(objU);
                }
                pVar.c0();
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objU;
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return insetsPaddingModifier;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }

    @dl.d
    public static final androidx.compose.ui.n j(@dl.d androidx.compose.ui.n nVar) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$systemBarsPadding$$inlined$debugInspectorInfo$1
            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("systemBarsPadding");
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$systemBarsPadding$$inlined$windowInsetsPadding$1
            /* JADX WARN: Multi-variable type inference failed */
            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(359872873);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolderC = WindowInsetsHolder.INSTANCE.c(pVar, 8);
                pVar.T(1157296644);
                boolean zS = pVar.s(windowInsetsHolderC);
                Object objU = pVar.U();
                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new InsetsPaddingModifier(windowInsetsHolderC.getSystemBars(), null, 2, 0 == true ? 1 : 0);
                    pVar.N(objU);
                }
                pVar.c0();
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objU;
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return insetsPaddingModifier;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }

    @dl.d
    public static final androidx.compose.ui.n k(@dl.d androidx.compose.ui.n nVar) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$systemGesturesPadding$$inlined$debugInspectorInfo$1
            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("systemGesturesPadding");
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$systemGesturesPadding$$inlined$windowInsetsPadding$1
            /* JADX WARN: Multi-variable type inference failed */
            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(359872873);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolderC = WindowInsetsHolder.INSTANCE.c(pVar, 8);
                pVar.T(1157296644);
                boolean zS = pVar.s(windowInsetsHolderC);
                Object objU = pVar.U();
                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new InsetsPaddingModifier(windowInsetsHolderC.getSystemGestures(), null, 2, 0 == true ? 1 : 0);
                    pVar.N(objU);
                }
                pVar.c0();
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objU;
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return insetsPaddingModifier;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }

    @dl.d
    public static final androidx.compose.ui.n l(@dl.d androidx.compose.ui.n nVar) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$waterfallPadding$$inlined$debugInspectorInfo$1
            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("waterfallPadding");
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$waterfallPadding$$inlined$windowInsetsPadding$1
            /* JADX WARN: Multi-variable type inference failed */
            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(359872873);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolderC = WindowInsetsHolder.INSTANCE.c(pVar, 8);
                pVar.T(1157296644);
                boolean zS = pVar.s(windowInsetsHolderC);
                Object objU = pVar.U();
                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new InsetsPaddingModifier(windowInsetsHolderC.getCom.max.xiaoheihe.bean.bbs.BBSTopicMenuObj.TYPE_WATERFALL java.lang.String(), null, 2, 0 == true ? 1 : 0);
                    pVar.N(objU);
                }
                pVar.c0();
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objU;
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return insetsPaddingModifier;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }

    @j2
    private static final androidx.compose.ui.n m(androidx.compose.ui.n nVar, yh.l<? super androidx.compose.ui.platform.x0, b2> lVar, final yh.l<? super WindowInsetsHolder, ? extends h1> lVar2) {
        return ComposedModifierKt.g(nVar, lVar, new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$windowInsetsPadding$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(359872873);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolderC = WindowInsetsHolder.INSTANCE.c(pVar, 8);
                yh.l<WindowInsetsHolder, h1> lVar3 = lVar2;
                pVar.T(1157296644);
                boolean zS = pVar.s(windowInsetsHolderC);
                Object objU = pVar.U();
                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new InsetsPaddingModifier(lVar3.invoke(windowInsetsHolderC), null, 2, 0 == true ? 1 : 0);
                    pVar.N(objU);
                }
                pVar.c0();
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objU;
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return insetsPaddingModifier;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }
}
