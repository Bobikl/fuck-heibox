package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.g0;
import androidx.compose.ui.text.font.h0;
import androidx.compose.ui.text.font.v;
import androidx.compose.ui.text.platform.l;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.i;
import b1.m;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import p1.LocaleList;
import s1.u;
import s1.w;
import yh.r;

/* JADX INFO: compiled from: TextPaintExtensions.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001aG\u0010\f\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012&\u0010\t\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0000ø\u0001\u0000\u001a\f\u0010\u000e\u001a\u00020\r*\u00020\u0001H\u0000\u001a\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/platform/l;", "Landroidx/compose/ui/text/d0;", "style", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/v;", "Landroidx/compose/ui/text/font/k0;", "Landroidx/compose/ui/text/font/g0;", "Landroidx/compose/ui/text/font/h0;", "Landroid/graphics/Typeface;", "resolveTypeface", "Ls1/e;", "density", ak.av, "", ak.aF, "", "blurRadius", "b", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class e {
    /* JADX WARN: Code duplicated, block: B:56:0x01a3  */
    @dl.d
    public static final SpanStyle a(@dl.d l lVar, @dl.d SpanStyle style, @dl.d r<? super v, ? super FontWeight, ? super g0, ? super h0, ? extends Typeface> resolveTypeface, @dl.d s1.e density) {
        long jB;
        f0.p(lVar, "<this>");
        f0.p(style, "style");
        f0.p(resolveTypeface, "resolveTypeface");
        f0.p(density, "density");
        long jM = u.m(style.getFontSize());
        w.a aVar = w.f139257b;
        if (w.g(jM, aVar.b())) {
            lVar.setTextSize(density.k1(style.getFontSize()));
        } else if (w.g(jM, aVar.a())) {
            lVar.setTextSize(lVar.getTextSize() * u.n(style.getFontSize()));
        }
        if (c(style)) {
            v fontFamily = style.getFontFamily();
            FontWeight fontWeight = style.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.INSTANCE.m();
            }
            g0 fontStyle = style.getFontStyle();
            g0 g0VarC = g0.c(fontStyle != null ? fontStyle.j() : g0.INSTANCE.b());
            h0 fontSynthesis = style.getFontSynthesis();
            lVar.setTypeface(resolveTypeface.U0(fontFamily, fontWeight, g0VarC, h0.e(fontSynthesis != null ? fontSynthesis.getValue() : h0.INSTANCE.a())));
        }
        if (style.getLocaleList() != null && !f0.g(style.getLocaleList(), LocaleList.f138137d.a())) {
            if (Build.VERSION.SDK_INT >= 24) {
                b.f16858a.b(lVar, style.getLocaleList());
            } else {
                lVar.setTextLocale(a.a(style.getLocaleList().isEmpty() ? p1.e.f138135b.a() : style.getLocaleList().e(0)));
            }
        }
        long jM2 = u.m(style.getLetterSpacing());
        if (w.g(jM2, aVar.a())) {
            lVar.setLetterSpacing(u.n(style.getLetterSpacing()));
        } else {
            w.g(jM2, aVar.b());
        }
        if (style.getFontFeatureSettings() != null && !f0.g(style.getFontFeatureSettings(), "")) {
            lVar.setFontFeatureSettings(style.getFontFeatureSettings());
        }
        if (style.getTextGeometricTransform() != null && !f0.g(style.getTextGeometricTransform(), TextGeometricTransform.INSTANCE.a())) {
            lVar.setTextScaleX(lVar.getTextScaleX() * style.getTextGeometricTransform().getScaleX());
            lVar.setTextSkewX(lVar.getTextSkewX() + style.getTextGeometricTransform().getSkewX());
        }
        lVar.i(style.m());
        lVar.f(style.k(), m.f30386b.a(), style.g());
        lVar.k(style.getShadow());
        if (w.g(u.m(style.getLetterSpacing()), aVar.b())) {
            if (u.n(style.getLetterSpacing()) == 0.0f) {
                jB = u.f139249b.b();
            } else {
                jB = style.getLetterSpacing();
            }
        } else {
            jB = u.f139249b.b();
        }
        long j10 = jB;
        long background = style.getBackground();
        l0.Companion companion = l0.INSTANCE;
        long jU = l0.y(background, companion.s()) ? companion.u() : style.getBackground();
        androidx.compose.ui.text.style.a baselineShift = style.getBaselineShift();
        return new SpanStyle(0L, 0L, (FontWeight) null, (g0) null, (h0) null, (v) null, (String) null, j10, baselineShift != null ? androidx.compose.ui.text.style.a.g(baselineShift.k(), androidx.compose.ui.text.style.a.INSTANCE.a()) : false ? null : style.getBaselineShift(), (TextGeometricTransform) null, (LocaleList) null, jU, true ^ f0.g(style.getTextDecoration(), i.INSTANCE.d()) ? style.getTextDecoration() : null, (Shadow) null, bb.c.k.IB, (kotlin.jvm.internal.u) null);
    }

    public static final float b(float f10) {
        if (f10 == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f10;
    }

    public static final boolean c(@dl.d SpanStyle spanStyle) {
        f0.p(spanStyle, "<this>");
        return (spanStyle.getFontFamily() == null && spanStyle.getFontStyle() == null && spanStyle.getFontWeight() == null) ? false : true;
    }
}
