package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.RestrictTo;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.UrlAnnotation;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.g0;
import androidx.compose.ui.text.font.h0;
import androidx.compose.ui.text.font.m0;
import androidx.compose.ui.text.font.u;
import androidx.compose.ui.text.font.v;
import androidx.compose.ui.text.font.w;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.s0;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AndroidAccessibilitySpannableString.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u001a\u001c\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0007\u001a4\u0010\u0010\u001a\u00020\u000f*\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0002¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/d;", "Ls1/e;", "density", "Landroidx/compose/ui/text/font/u$b;", "resourceLoader", "Landroid/text/SpannableString;", "b", "Landroidx/compose/ui/text/font/v$b;", "fontFamilyResolver", ak.aF, "Landroidx/compose/ui/text/d0;", "spanStyle", "", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "Lkotlin/b2;", ak.av, "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class a {
    private static final void a(SpannableString spannableString, SpanStyle spanStyle, int i10, int i11, s1.e eVar, v.b bVar) {
        SpannableExtensions_androidKt.i(spannableString, spanStyle.m(), i10, i11);
        SpannableExtensions_androidKt.l(spannableString, spanStyle.getFontSize(), eVar, i10, i11);
        if (spanStyle.getFontWeight() != null || spanStyle.getFontStyle() != null) {
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.INSTANCE.m();
            }
            g0 fontStyle = spanStyle.getFontStyle();
            spannableString.setSpan(new StyleSpan(androidx.compose.ui.text.font.h.c(fontWeight, fontStyle != null ? fontStyle.j() : g0.INSTANCE.b())), i10, i11, 33);
        }
        if (spanStyle.getFontFamily() != null) {
            if (spanStyle.getFontFamily() instanceof m0) {
                spannableString.setSpan(new TypefaceSpan(((m0) spanStyle.getFontFamily()).getName()), i10, i11, 33);
            } else if (Build.VERSION.SDK_INT >= 28) {
                v fontFamily = spanStyle.getFontFamily();
                h0 fontSynthesis = spanStyle.getFontSynthesis();
                Object value = w.a(bVar, fontFamily, null, 0, fontSynthesis != null ? fontSynthesis.getValue() : h0.INSTANCE.a(), 6, null).getValue();
                f0.n(value, "null cannot be cast to non-null type android.graphics.Typeface");
                spannableString.setSpan(q.f16872a.a((Typeface) value), i10, i11, 33);
            }
        }
        if (spanStyle.getTextDecoration() != null) {
            androidx.compose.ui.text.style.i textDecoration = spanStyle.getTextDecoration();
            androidx.compose.ui.text.style.i.Companion companion = androidx.compose.ui.text.style.i.INSTANCE;
            if (textDecoration.d(companion.f())) {
                spannableString.setSpan(new UnderlineSpan(), i10, i11, 33);
            }
            if (spanStyle.getTextDecoration().d(companion.b())) {
                spannableString.setSpan(new StrikethroughSpan(), i10, i11, 33);
            }
        }
        if (spanStyle.getTextGeometricTransform() != null) {
            spannableString.setSpan(new ScaleXSpan(spanStyle.getTextGeometricTransform().getScaleX()), i10, i11, 33);
        }
        SpannableExtensions_androidKt.p(spannableString, spanStyle.getLocaleList(), i10, i11);
        SpannableExtensions_androidKt.f(spannableString, spanStyle.getBackground(), i10, i11);
    }

    @androidx.compose.ui.text.h
    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final SpannableString b(@dl.d androidx.compose.ui.text.d dVar, @dl.d s1.e density, @dl.d u.b resourceLoader) {
        f0.p(dVar, "<this>");
        f0.p(density, "density");
        f0.p(resourceLoader, "resourceLoader");
        return c(dVar, density, androidx.compose.ui.text.font.o.a(resourceLoader));
    }

    @androidx.compose.ui.text.h
    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final SpannableString c(@dl.d androidx.compose.ui.text.d dVar, @dl.d s1.e density, @dl.d v.b fontFamilyResolver) {
        f0.p(dVar, "<this>");
        f0.p(density, "density");
        f0.p(fontFamilyResolver, "fontFamilyResolver");
        SpannableString spannableString = new SpannableString(dVar.getText());
        List<androidx.compose.ui.text.d.Range<SpanStyle>> listE = dVar.e();
        int size = listE.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.ui.text.d.Range<SpanStyle> range = listE.get(i10);
            SpanStyle spanStyleA = range.a();
            a(spannableString, spanStyleA.c((16351 & 1) != 0 ? spanStyleA.m() : 0L, (16351 & 2) != 0 ? spanStyleA.fontSize : 0L, (16351 & 4) != 0 ? spanStyleA.fontWeight : null, (16351 & 8) != 0 ? spanStyleA.fontStyle : null, (16351 & 16) != 0 ? spanStyleA.fontSynthesis : null, (16351 & 32) != 0 ? spanStyleA.fontFamily : null, (16351 & 64) != 0 ? spanStyleA.fontFeatureSettings : null, (16351 & 128) != 0 ? spanStyleA.letterSpacing : 0L, (16351 & 256) != 0 ? spanStyleA.baselineShift : null, (16351 & 512) != 0 ? spanStyleA.textGeometricTransform : null, (16351 & 1024) != 0 ? spanStyleA.localeList : null, (16351 & 2048) != 0 ? spanStyleA.background : 0L, (16351 & 4096) != 0 ? spanStyleA.textDecoration : null, (16351 & 8192) != 0 ? spanStyleA.shadow : null), range.getStart(), range.getEnd(), density, fontFamilyResolver);
        }
        List<androidx.compose.ui.text.d.Range<s0>> listI = dVar.i(0, dVar.length());
        int size2 = listI.size();
        for (int i11 = 0; i11 < size2; i11++) {
            androidx.compose.ui.text.d.Range<s0> range2 = listI.get(i11);
            spannableString.setSpan(androidx.compose.ui.text.platform.extensions.f.a(range2.a()), range2.getStart(), range2.getEnd(), 33);
        }
        List<androidx.compose.ui.text.d.Range<UrlAnnotation>> listJ = dVar.j(0, dVar.length());
        int size3 = listJ.size();
        for (int i12 = 0; i12 < size3; i12++) {
            androidx.compose.ui.text.d.Range<UrlAnnotation> range3 = listJ.get(i12);
            spannableString.setSpan(androidx.compose.ui.text.platform.extensions.g.a(range3.a()), range3.getStart(), range3.getEnd(), 33);
        }
        return spannableString;
    }
}
