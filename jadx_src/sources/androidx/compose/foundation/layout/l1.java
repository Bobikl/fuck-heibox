package androidx.compose.foundation.layout;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.R;
import androidx.compose.ui.platform.ComposeView;
import com.max.xiaoheihe.bean.bbs.BBSTopicMenuObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: WindowInsets.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b?\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\"(\u0010\u000f\u001a\u00020\t*\u00020\b2\u0006\u0010\n\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\"\u0015\u0010\u0014\u001a\u00020\u0011*\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u0015\u0010\u0016\u001a\u00020\u0011*\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013\"\u0015\u0010\u0018\u001a\u00020\u0011*\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013\"\u0015\u0010\u001a\u001a\u00020\u0011*\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013\"\u0015\u0010\u001c\u001a\u00020\u0011*\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0013\"\u0015\u0010\u001e\u001a\u00020\u0011*\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0013\"\u0015\u0010 \u001a\u00020\u0011*\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0013\"\u0015\u0010\"\u001a\u00020\u0011*\u00020\u00108G¢\u0006\u0006\u001a\u0004\b!\u0010\u0013\"\u0015\u0010$\u001a\u00020\u0011*\u00020\u00108G¢\u0006\u0006\u001a\u0004\b#\u0010\u0013\"\u0015\u0010&\u001a\u00020\u0011*\u00020\u00108G¢\u0006\u0006\u001a\u0004\b%\u0010\u0013\"\u0015\u0010(\u001a\u00020\u0011*\u00020\u00108G¢\u0006\u0006\u001a\u0004\b'\u0010\u0013\"\u0015\u0010*\u001a\u00020\u0011*\u00020\u00108G¢\u0006\u0006\u001a\u0004\b)\u0010\u0013\"\u0015\u0010,\u001a\u00020\u0011*\u00020\u00108G¢\u0006\u0006\u001a\u0004\b+\u0010\u0013\"\u001e\u00100\u001a\u00020\u0011*\u00020\u00108GX\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u0013\"\u001e\u00103\u001a\u00020\u0011*\u00020\u00108GX\u0087\u0004¢\u0006\f\u0012\u0004\b2\u0010/\u001a\u0004\b1\u0010\u0013\"\u001e\u00106\u001a\u00020\u0011*\u00020\u00108GX\u0087\u0004¢\u0006\f\u0012\u0004\b5\u0010/\u001a\u0004\b4\u0010\u0013\"\u001e\u00109\u001a\u00020\u0011*\u00020\u00108GX\u0087\u0004¢\u0006\f\u0012\u0004\b8\u0010/\u001a\u0004\b7\u0010\u0013\"\u001e\u0010<\u001a\u00020\u0011*\u00020\u00108GX\u0087\u0004¢\u0006\f\u0012\u0004\b;\u0010/\u001a\u0004\b:\u0010\u0013\"\u001e\u0010@\u001a\u00020\t*\u00020\u00108GX\u0087\u0004¢\u0006\f\u0012\u0004\b?\u0010/\u001a\u0004\b=\u0010>\"\u001e\u0010C\u001a\u00020\t*\u00020\u00108GX\u0087\u0004¢\u0006\f\u0012\u0004\bB\u0010/\u001a\u0004\bA\u0010>\"\u001e\u0010F\u001a\u00020\t*\u00020\u00108GX\u0087\u0004¢\u0006\f\u0012\u0004\bE\u0010/\u001a\u0004\bD\u0010>\"\u001e\u0010I\u001a\u00020\t*\u00020\u00108GX\u0087\u0004¢\u0006\f\u0012\u0004\bH\u0010/\u001a\u0004\bG\u0010>\"\u001e\u0010L\u001a\u00020\t*\u00020\u00108GX\u0087\u0004¢\u0006\f\u0012\u0004\bK\u0010/\u001a\u0004\bJ\u0010>\"\u001e\u0010O\u001a\u00020\t*\u00020\u00108GX\u0087\u0004¢\u0006\f\u0012\u0004\bN\u0010/\u001a\u0004\bM\u0010>¨\u0006P"}, d2 = {"Landroidx/core/graphics/h0;", "Landroidx/compose/foundation/layout/a0;", "M", "insets", "", "name", "Landroidx/compose/foundation/layout/f1;", ak.av, "Landroidx/compose/ui/platform/ComposeView;", "", "value", "k", "(Landroidx/compose/ui/platform/ComposeView;)Z", "L", "(Landroidx/compose/ui/platform/ComposeView;Z)V", "consumeWindowInsets", "Landroidx/compose/foundation/layout/h1$a;", "Landroidx/compose/foundation/layout/h1;", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/compose/foundation/layout/h1$a;Landroidx/compose/runtime/p;I)Landroidx/compose/foundation/layout/h1;", "captionBar", "l", "displayCutout", "m", "ime", "n", "mandatorySystemGestures", "o", "navigationBars", ak.aG, "statusBars", "x", "systemBars", androidx.exifinterface.media.a.W4, "systemGestures", "B", "tappableElement", androidx.exifinterface.media.a.S4, BBSTopicMenuObj.TYPE_WATERFALL, ak.aB, "safeDrawing", "t", "safeGestures", "r", "safeContent", "i", "getCaptionBarIgnoringVisibility$annotations", "(Landroidx/compose/foundation/layout/h1$a;)V", "captionBarIgnoringVisibility", "p", "getNavigationBarsIgnoringVisibility$annotations", "navigationBarsIgnoringVisibility", "v", "getStatusBarsIgnoringVisibility$annotations", "statusBarsIgnoringVisibility", "y", "getSystemBarsIgnoringVisibility$annotations", "systemBarsIgnoringVisibility", "C", "getTappableElementIgnoringVisibility$annotations", "tappableElementIgnoringVisibility", "F", "(Landroidx/compose/foundation/layout/h1$a;Landroidx/compose/runtime/p;I)Z", "isCaptionBarVisible$annotations", "isCaptionBarVisible", "H", "isImeVisible$annotations", "isImeVisible", "d", "getAreStatusBarsVisible$annotations", "areStatusBarsVisible", "b", "getAreNavigationBarsVisible$annotations", "areNavigationBarsVisible", "f", "getAreSystemBarsVisible$annotations", "areSystemBarsVisible", "J", "isTappableElementVisible$annotations", "isTappableElementVisible", "foundation-layout_release"}, k = 2, mv = {1, 7, 1})
public final class l1 {
    @dl.d
    @xh.h(name = "getSystemGestures")
    @androidx.compose.runtime.h
    public static final h1 A(@dl.d h1.Companion companion, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(companion, "<this>");
        pVar.T(989216224);
        if (ComposerKt.g0()) {
            ComposerKt.w0(989216224, i10, -1, "androidx.compose.foundation.layout.<get-systemGestures> (WindowInsets.android.kt:191)");
        }
        f fVarS = WindowInsetsHolder.INSTANCE.c(pVar, 8).getSystemGestures();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return fVarS;
    }

    @dl.d
    @xh.h(name = "getTappableElement")
    @androidx.compose.runtime.h
    public static final h1 B(@dl.d h1.Companion companion, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(companion, "<this>");
        pVar.T(-1994205284);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1994205284, i10, -1, "androidx.compose.foundation.layout.<get-tappableElement> (WindowInsets.android.kt:199)");
        }
        f fVarT = WindowInsetsHolder.INSTANCE.c(pVar, 8).getTappableElement();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return fVarT;
    }

    @dl.d
    @t
    @xh.h(name = "getTappableElementIgnoringVisibility")
    @androidx.compose.runtime.h
    public static final h1 C(@dl.d h1.Companion companion, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(companion, "<this>");
        pVar.T(-1488788292);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1488788292, i10, -1, "androidx.compose.foundation.layout.<get-tappableElementIgnoringVisibility> (WindowInsets.android.kt:301)");
        }
        f1 f1VarU = WindowInsetsHolder.INSTANCE.c(pVar, 8).getTappableElementIgnoringVisibility();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return f1VarU;
    }

    @t
    public static /* synthetic */ void D(h1.Companion companion) {
    }

    @dl.d
    @xh.h(name = "getWaterfall")
    @androidx.compose.runtime.h
    public static final h1 E(@dl.d h1.Companion companion, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(companion, "<this>");
        pVar.T(1943241020);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1943241020, i10, -1, "androidx.compose.foundation.layout.<get-waterfall> (WindowInsets.android.kt:207)");
        }
        f1 f1VarV = WindowInsetsHolder.INSTANCE.c(pVar, 8).getCom.max.xiaoheihe.bean.bbs.BBSTopicMenuObj.TYPE_WATERFALL java.lang.String();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return f1VarV;
    }

    @t
    @xh.h(name = "isCaptionBarVisible")
    @androidx.compose.runtime.h
    public static final boolean F(@dl.d h1.Companion companion, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(companion, "<this>");
        pVar.T(-501076620);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-501076620, i10, -1, "androidx.compose.foundation.layout.<get-isCaptionBarVisible> (WindowInsets.android.kt:313)");
        }
        boolean zG = WindowInsetsHolder.INSTANCE.c(pVar, 8).getCaptionBar().g();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return zG;
    }

    @t
    public static /* synthetic */ void G(h1.Companion companion) {
    }

    @t
    @xh.h(name = "isImeVisible")
    @androidx.compose.runtime.h
    public static final boolean H(@dl.d h1.Companion companion, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(companion, "<this>");
        pVar.T(-1873571424);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1873571424, i10, -1, "androidx.compose.foundation.layout.<get-isImeVisible> (WindowInsets.android.kt:325)");
        }
        boolean zG = WindowInsetsHolder.INSTANCE.c(pVar, 8).getIme().g();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return zG;
    }

    @t
    public static /* synthetic */ void I(h1.Companion companion) {
    }

    @t
    @xh.h(name = "isTappableElementVisible")
    @androidx.compose.runtime.h
    public static final boolean J(@dl.d h1.Companion companion, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(companion, "<this>");
        pVar.T(-1737201120);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1737201120, i10, -1, "androidx.compose.foundation.layout.<get-isTappableElementVisible> (WindowInsets.android.kt:372)");
        }
        boolean zG = WindowInsetsHolder.INSTANCE.c(pVar, 8).getTappableElement().g();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return zG;
    }

    @t
    public static /* synthetic */ void K(h1.Companion companion) {
    }

    public static final void L(@dl.d ComposeView composeView, boolean z10) {
        kotlin.jvm.internal.f0.p(composeView, "<this>");
        composeView.setTag(R.id.consume_window_insets_tag, Boolean.valueOf(z10));
    }

    @dl.d
    public static final InsetsValues M(@dl.d androidx.core.graphics.h0 h0Var) {
        kotlin.jvm.internal.f0.p(h0Var, "<this>");
        return new InsetsValues(h0Var.f20742a, h0Var.f20743b, h0Var.f20744c, h0Var.f20745d);
    }

    @dl.d
    public static final f1 a(@dl.d androidx.core.graphics.h0 insets, @dl.d String name) {
        kotlin.jvm.internal.f0.p(insets, "insets");
        kotlin.jvm.internal.f0.p(name, "name");
        return new f1(M(insets), name);
    }

    @t
    @xh.h(name = "getAreNavigationBarsVisible")
    @androidx.compose.runtime.h
    public static final boolean b(@dl.d h1.Companion companion, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(companion, "<this>");
        pVar.T(710310464);
        if (ComposerKt.g0()) {
            ComposerKt.w0(710310464, i10, -1, "androidx.compose.foundation.layout.<get-areNavigationBarsVisible> (WindowInsets.android.kt:349)");
        }
        boolean zG = WindowInsetsHolder.INSTANCE.c(pVar, 8).getNavigationBars().g();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return zG;
    }

    @t
    public static /* synthetic */ void c(h1.Companion companion) {
    }

    @t
    @xh.h(name = "getAreStatusBarsVisible")
    @androidx.compose.runtime.h
    public static final boolean d(@dl.d h1.Companion companion, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(companion, "<this>");
        pVar.T(1613283456);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1613283456, i10, -1, "androidx.compose.foundation.layout.<get-areStatusBarsVisible> (WindowInsets.android.kt:337)");
        }
        boolean zG = WindowInsetsHolder.INSTANCE.c(pVar, 8).getStatusBars().g();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return zG;
    }

    @t
    public static /* synthetic */ void e(h1.Companion companion) {
    }

    @t
    @xh.h(name = "getAreSystemBarsVisible")
    @androidx.compose.runtime.h
    public static final boolean f(@dl.d h1.Companion companion, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(companion, "<this>");
        pVar.T(1985490720);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1985490720, i10, -1, "androidx.compose.foundation.layout.<get-areSystemBarsVisible> (WindowInsets.android.kt:361)");
        }
        boolean zG = WindowInsetsHolder.INSTANCE.c(pVar, 8).getSystemBars().g();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return zG;
    }

    @t
    public static /* synthetic */ void g(h1.Companion companion) {
    }

    @dl.d
    @xh.h(name = "getCaptionBar")
    @androidx.compose.runtime.h
    public static final h1 h(@dl.d h1.Companion companion, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(companion, "<this>");
        pVar.T(-1832025528);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1832025528, i10, -1, "androidx.compose.foundation.layout.<get-captionBar> (WindowInsets.android.kt:125)");
        }
        f fVarD = WindowInsetsHolder.INSTANCE.c(pVar, 8).getCaptionBar();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return fVarD;
    }

    @dl.d
    @t
    @xh.h(name = "getCaptionBarIgnoringVisibility")
    @androidx.compose.runtime.h
    public static final h1 i(@dl.d h1.Companion companion, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(companion, "<this>");
        pVar.T(-1731251574);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1731251574, i10, -1, "androidx.compose.foundation.layout.<get-captionBarIgnoringVisibility> (WindowInsets.android.kt:249)");
        }
        f1 f1VarE = WindowInsetsHolder.INSTANCE.c(pVar, 8).getCaptionBarIgnoringVisibility();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return f1VarE;
    }

    @t
    public static /* synthetic */ void j(h1.Companion companion) {
    }

    public static final boolean k(@dl.d ComposeView composeView) {
        kotlin.jvm.internal.f0.p(composeView, "<this>");
        Object tag = composeView.getTag(R.id.consume_window_insets_tag);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @dl.d
    @xh.h(name = "getDisplayCutout")
    @androidx.compose.runtime.h
    public static final h1 l(@dl.d h1.Companion companion, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(companion, "<this>");
        pVar.T(1324817724);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1324817724, i10, -1, "androidx.compose.foundation.layout.<get-displayCutout> (WindowInsets.android.kt:134)");
        }
        f fVarG = WindowInsetsHolder.INSTANCE.c(pVar, 8).getDisplayCutout();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return fVarG;
    }

    @dl.d
    @xh.h(name = "getIme")
    @androidx.compose.runtime.h
    public static final h1 m(@dl.d h1.Companion companion, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(companion, "<this>");
        pVar.T(-1466917860);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1466917860, i10, -1, "androidx.compose.foundation.layout.<get-ime> (WindowInsets.android.kt:148)");
        }
        f fVarH = WindowInsetsHolder.INSTANCE.c(pVar, 8).getIme();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return fVarH;
    }

    @dl.d
    @xh.h(name = "getMandatorySystemGestures")
    @androidx.compose.runtime.h
    public static final h1 n(@dl.d h1.Companion companion, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(companion, "<this>");
        pVar.T(1369492988);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1369492988, i10, -1, "androidx.compose.foundation.layout.<get-mandatorySystemGestures> (WindowInsets.android.kt:157)");
        }
        f fVarI = WindowInsetsHolder.INSTANCE.c(pVar, 8).getMandatorySystemGestures();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return fVarI;
    }

    @dl.d
    @xh.h(name = "getNavigationBars")
    @androidx.compose.runtime.h
    public static final h1 o(@dl.d h1.Companion companion, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(companion, "<this>");
        pVar.T(1596175702);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1596175702, i10, -1, "androidx.compose.foundation.layout.<get-navigationBars> (WindowInsets.android.kt:167)");
        }
        f fVarJ = WindowInsetsHolder.INSTANCE.c(pVar, 8).getNavigationBars();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return fVarJ;
    }

    @dl.d
    @t
    @xh.h(name = "getNavigationBarsIgnoringVisibility")
    @androidx.compose.runtime.h
    public static final h1 p(@dl.d h1.Companion companion, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(companion, "<this>");
        pVar.T(-1990981160);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1990981160, i10, -1, "androidx.compose.foundation.layout.<get-navigationBarsIgnoringVisibility> (WindowInsets.android.kt:263)");
        }
        f1 f1VarK = WindowInsetsHolder.INSTANCE.c(pVar, 8).getNavigationBarsIgnoringVisibility();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return f1VarK;
    }

    @t
    public static /* synthetic */ void q(h1.Companion companion) {
    }

    @dl.d
    @xh.h(name = "getSafeContent")
    @androidx.compose.runtime.h
    public static final h1 r(@dl.d h1.Companion companion, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(companion, "<this>");
        pVar.T(-2026663876);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-2026663876, i10, -1, "androidx.compose.foundation.layout.<get-safeContent> (WindowInsets.android.kt:237)");
        }
        h1 h1VarL = WindowInsetsHolder.INSTANCE.c(pVar, 8).getSafeContent();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return h1VarL;
    }

    @dl.d
    @xh.h(name = "getSafeDrawing")
    @androidx.compose.runtime.h
    public static final h1 s(@dl.d h1.Companion companion, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(companion, "<this>");
        pVar.T(-49441252);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-49441252, i10, -1, "androidx.compose.foundation.layout.<get-safeDrawing> (WindowInsets.android.kt:217)");
        }
        h1 h1VarM = WindowInsetsHolder.INSTANCE.c(pVar, 8).getSafeDrawing();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return h1VarM;
    }

    @dl.d
    @xh.h(name = "getSafeGestures")
    @androidx.compose.runtime.h
    public static final h1 t(@dl.d h1.Companion companion, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(companion, "<this>");
        pVar.T(-1594247780);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1594247780, i10, -1, "androidx.compose.foundation.layout.<get-safeGestures> (WindowInsets.android.kt:228)");
        }
        h1 h1VarN = WindowInsetsHolder.INSTANCE.c(pVar, 8).getSafeGestures();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return h1VarN;
    }

    @dl.d
    @xh.h(name = "getStatusBars")
    @androidx.compose.runtime.h
    public static final h1 u(@dl.d h1.Companion companion, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(companion, "<this>");
        pVar.T(-675090670);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-675090670, i10, -1, "androidx.compose.foundation.layout.<get-statusBars> (WindowInsets.android.kt:175)");
        }
        f fVarO = WindowInsetsHolder.INSTANCE.c(pVar, 8).getStatusBars();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return fVarO;
    }

    @dl.d
    @t
    @xh.h(name = "getStatusBarsIgnoringVisibility")
    @androidx.compose.runtime.h
    public static final h1 v(@dl.d h1.Companion companion, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(companion, "<this>");
        pVar.T(594020756);
        if (ComposerKt.g0()) {
            ComposerKt.w0(594020756, i10, -1, "androidx.compose.foundation.layout.<get-statusBarsIgnoringVisibility> (WindowInsets.android.kt:275)");
        }
        f1 f1VarP = WindowInsetsHolder.INSTANCE.c(pVar, 8).getStatusBarsIgnoringVisibility();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return f1VarP;
    }

    @t
    public static /* synthetic */ void w(h1.Companion companion) {
    }

    @dl.d
    @xh.h(name = "getSystemBars")
    @androidx.compose.runtime.h
    public static final h1 x(@dl.d h1.Companion companion, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(companion, "<this>");
        pVar.T(-282936756);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-282936756, i10, -1, "androidx.compose.foundation.layout.<get-systemBars> (WindowInsets.android.kt:183)");
        }
        f fVarQ = WindowInsetsHolder.INSTANCE.c(pVar, 8).getSystemBars();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return fVarQ;
    }

    @dl.d
    @t
    @xh.h(name = "getSystemBarsIgnoringVisibility")
    @androidx.compose.runtime.h
    public static final h1 y(@dl.d h1.Companion companion, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(companion, "<this>");
        pVar.T(1564566798);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1564566798, i10, -1, "androidx.compose.foundation.layout.<get-systemBarsIgnoringVisibility> (WindowInsets.android.kt:288)");
        }
        f1 f1VarR = WindowInsetsHolder.INSTANCE.c(pVar, 8).getSystemBarsIgnoringVisibility();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return f1VarR;
    }

    @t
    public static /* synthetic */ void z(h1.Companion companion) {
    }
}
