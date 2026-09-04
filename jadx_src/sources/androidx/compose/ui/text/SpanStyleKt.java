package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.f2;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.lzy.okgo.model.Progress;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import p1.LocaleList;

/* JADX INFO: compiled from: SpanStyle.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0003\u001a&\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\b\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0000\"\u0017\u0010\u0013\u001a\u00020\u00008\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0001\u0010\u0012\"\u0017\u0010\u0014\u001a\u00020\u00008\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0002\u0010\u0012\"\u0017\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\t\u0010\u0012\"\u0017\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Ls1/u;", ak.av, "b", "", "t", "e", "(JJF)J", androidx.exifinterface.media.a.f23244d5, Progress.G, ak.aF, "(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;", "Landroidx/compose/ui/text/d0;", com.google.android.exoplayer2.text.ttml.d.f49798o0, "stop", "Landroidx/compose/ui/text/z;", "d", "style", "f", "J", "DefaultFontSize", "DefaultLetterSpacing", "Landroidx/compose/ui/graphics/l0;", "DefaultBackgroundColor", "DefaultColor", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class SpanStyleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f16244a = s1.v.m(14);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f16245b = s1.v.m(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f16246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f16247d;

    static {
        androidx.compose.ui.graphics.l0.Companion companion = androidx.compose.ui.graphics.l0.INSTANCE;
        f16246c = companion.s();
        f16247d = companion.a();
    }

    @dl.d
    public static final SpanStyle b(@dl.d SpanStyle start, @dl.d SpanStyle stop, float f10) {
        kotlin.jvm.internal.f0.p(start, "start");
        kotlin.jvm.internal.f0.p(stop, "stop");
        androidx.compose.ui.text.style.l lVarB = androidx.compose.ui.text.style.k.b(start.getTextForegroundStyle(), stop.getTextForegroundStyle(), f10);
        androidx.compose.ui.text.font.v vVar = (androidx.compose.ui.text.font.v) c(start.getFontFamily(), stop.getFontFamily(), f10);
        long jE = e(start.getFontSize(), stop.getFontSize(), f10);
        FontWeight fontWeight = start.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.INSTANCE.m();
        }
        FontWeight fontWeight2 = stop.getFontWeight();
        if (fontWeight2 == null) {
            fontWeight2 = FontWeight.INSTANCE.m();
        }
        FontWeight fontWeightA = androidx.compose.ui.text.font.l0.a(fontWeight, fontWeight2, f10);
        androidx.compose.ui.text.font.g0 g0Var = (androidx.compose.ui.text.font.g0) c(start.getFontStyle(), stop.getFontStyle(), f10);
        androidx.compose.ui.text.font.h0 h0Var = (androidx.compose.ui.text.font.h0) c(start.getFontSynthesis(), stop.getFontSynthesis(), f10);
        String str = (String) c(start.getFontFeatureSettings(), stop.getFontFeatureSettings(), f10);
        long jE2 = e(start.getLetterSpacing(), stop.getLetterSpacing(), f10);
        androidx.compose.ui.text.style.a baselineShift = start.getBaselineShift();
        float fK = baselineShift != null ? baselineShift.k() : androidx.compose.ui.text.style.a.e(0.0f);
        androidx.compose.ui.text.style.a baselineShift2 = stop.getBaselineShift();
        float fA = androidx.compose.ui.text.style.b.a(fK, baselineShift2 != null ? baselineShift2.k() : androidx.compose.ui.text.style.a.e(0.0f), f10);
        TextGeometricTransform textGeometricTransform = start.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.INSTANCE.a();
        }
        TextGeometricTransform textGeometricTransform2 = stop.getTextGeometricTransform();
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = TextGeometricTransform.INSTANCE.a();
        }
        TextGeometricTransform textGeometricTransformA = androidx.compose.ui.text.style.n.a(textGeometricTransform, textGeometricTransform2, f10);
        LocaleList localeList = (LocaleList) c(start.getLocaleList(), stop.getLocaleList(), f10);
        long jO = androidx.compose.ui.graphics.n0.o(start.getBackground(), stop.getBackground(), f10);
        androidx.compose.ui.text.style.i iVar = (androidx.compose.ui.text.style.i) c(start.getTextDecoration(), stop.getTextDecoration(), f10);
        Shadow shadow = start.getShadow();
        if (shadow == null) {
            shadow = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        Shadow shadow2 = stop.getShadow();
        if (shadow2 == null) {
            shadow2 = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        return new SpanStyle(lVarB, jE, fontWeightA, g0Var, h0Var, vVar, str, jE2, androidx.compose.ui.text.style.a.d(fA), textGeometricTransformA, localeList, jO, iVar, f2.a(shadow, shadow2, f10), d(start.getPlatformStyle(), stop.getPlatformStyle(), f10), (kotlin.jvm.internal.u) null);
    }

    public static final <T> T c(T t10, T t11, float f10) {
        return ((double) f10) < 0.5d ? t10 : t11;
    }

    private static final z d(z zVar, z zVar2, float f10) {
        if (zVar == null && zVar2 == null) {
            return null;
        }
        if (zVar == null) {
            zVar = z.INSTANCE.a();
        }
        if (zVar2 == null) {
            zVar2 = z.INSTANCE.a();
        }
        return c.c(zVar, zVar2, f10);
    }

    public static final long e(long j10, long j11, float f10) {
        return (s1.v.s(j10) || s1.v.s(j11)) ? ((s1.u) c(s1.u.c(j10), s1.u.c(j11), f10)).getF139252a() : s1.v.u(j10, j11, f10);
    }

    @dl.d
    public static final SpanStyle f(@dl.d SpanStyle style) {
        kotlin.jvm.internal.f0.p(style, "style");
        androidx.compose.ui.text.style.l lVarB = style.getTextForegroundStyle().b(new yh.a<androidx.compose.ui.text.style.l>() { // from class: androidx.compose.ui.text.SpanStyleKt$resolveSpanStyleDefaults$1
            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.ui.text.style.l invoke() {
                return androidx.compose.ui.text.style.l.INSTANCE.b(SpanStyleKt.f16247d);
            }
        });
        long fontSize = s1.v.s(style.getFontSize()) ? f16244a : style.getFontSize();
        FontWeight fontWeight = style.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.INSTANCE.m();
        }
        FontWeight fontWeight2 = fontWeight;
        androidx.compose.ui.text.font.g0 fontStyle = style.getFontStyle();
        androidx.compose.ui.text.font.g0 g0VarC = androidx.compose.ui.text.font.g0.c(fontStyle != null ? fontStyle.j() : androidx.compose.ui.text.font.g0.INSTANCE.b());
        androidx.compose.ui.text.font.h0 fontSynthesis = style.getFontSynthesis();
        androidx.compose.ui.text.font.h0 h0VarE = androidx.compose.ui.text.font.h0.e(fontSynthesis != null ? fontSynthesis.getValue() : androidx.compose.ui.text.font.h0.INSTANCE.a());
        androidx.compose.ui.text.font.v fontFamily = style.getFontFamily();
        if (fontFamily == null) {
            fontFamily = androidx.compose.ui.text.font.v.INSTANCE.b();
        }
        androidx.compose.ui.text.font.v vVar = fontFamily;
        String fontFeatureSettings = style.getFontFeatureSettings();
        if (fontFeatureSettings == null) {
            fontFeatureSettings = "";
        }
        String str = fontFeatureSettings;
        long letterSpacing = s1.v.s(style.getLetterSpacing()) ? f16245b : style.getLetterSpacing();
        androidx.compose.ui.text.style.a baselineShift = style.getBaselineShift();
        androidx.compose.ui.text.style.a aVarD = androidx.compose.ui.text.style.a.d(baselineShift != null ? baselineShift.k() : androidx.compose.ui.text.style.a.INSTANCE.a());
        TextGeometricTransform textGeometricTransform = style.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.INSTANCE.a();
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList localeList = style.getLocaleList();
        if (localeList == null) {
            localeList = LocaleList.f138137d.a();
        }
        LocaleList localeList2 = localeList;
        long background = style.getBackground();
        if (!(background != androidx.compose.ui.graphics.l0.INSTANCE.u())) {
            background = f16246c;
        }
        long j10 = background;
        androidx.compose.ui.text.style.i textDecoration = style.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = androidx.compose.ui.text.style.i.INSTANCE.d();
        }
        androidx.compose.ui.text.style.i iVar = textDecoration;
        Shadow shadow = style.getShadow();
        if (shadow == null) {
            shadow = Shadow.INSTANCE.a();
        }
        return new SpanStyle(lVarB, fontSize, fontWeight2, g0VarC, h0VarE, vVar, str, letterSpacing, aVarD, textGeometricTransform2, localeList2, j10, iVar, shadow, style.getPlatformStyle(), (kotlin.jvm.internal.u) null);
    }
}
