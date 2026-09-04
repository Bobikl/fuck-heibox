package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.text.SpannableString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.g0;
import androidx.compose.ui.text.font.h0;
import androidx.compose.ui.text.font.v;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextIndent;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AndroidParagraphHelper.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a{\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00062\u0006\u0010\r\u001a\u00020\f2&\u0010\u0014\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u000eH\u0000ø\u0001\u0000\u001a\f\u0010\u0018\u001a\u00020\u0017*\u00020\u0004H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"", "text", "", "contextFontSize", "Landroidx/compose/ui/text/q0;", "contextTextStyle", "", "Landroidx/compose/ui/text/d$b;", "Landroidx/compose/ui/text/d0;", "spanStyles", "Landroidx/compose/ui/text/w;", "placeholders", "Ls1/e;", "density", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/v;", "Landroidx/compose/ui/text/font/k0;", "Landroidx/compose/ui/text/font/g0;", "Landroidx/compose/ui/text/font/h0;", "Landroid/graphics/Typeface;", "resolveTypeface", "", ak.av, "", "b", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class f {
    @dl.d
    public static final CharSequence a(@dl.d String text, float f10, @dl.d TextStyle contextTextStyle, @dl.d List<androidx.compose.ui.text.d.Range<SpanStyle>> spanStyles, @dl.d List<androidx.compose.ui.text.d.Range<Placeholder>> placeholders, @dl.d s1.e density, @dl.d yh.r<? super v, ? super FontWeight, ? super g0, ? super h0, ? extends Typeface> resolveTypeface) {
        f0.p(text, "text");
        f0.p(contextTextStyle, "contextTextStyle");
        f0.p(spanStyles, "spanStyles");
        f0.p(placeholders, "placeholders");
        f0.p(density, "density");
        f0.p(resolveTypeface, "resolveTypeface");
        if (spanStyles.isEmpty() && placeholders.isEmpty() && f0.g(contextTextStyle.M(), TextIndent.INSTANCE.a()) && s1.v.s(contextTextStyle.B())) {
            return text;
        }
        SpannableString spannableString = new SpannableString(text);
        if (b(contextTextStyle) && contextTextStyle.C() == null) {
            SpannableExtensions_androidKt.o(spannableString, contextTextStyle.B(), f10, density);
        } else {
            LineHeightStyle lineHeightStyleC = contextTextStyle.C();
            if (lineHeightStyleC == null) {
                lineHeightStyleC = LineHeightStyle.INSTANCE.a();
            }
            SpannableExtensions_androidKt.n(spannableString, contextTextStyle.B(), f10, density, lineHeightStyleC);
        }
        SpannableExtensions_androidKt.v(spannableString, contextTextStyle.M(), f10, density);
        SpannableExtensions_androidKt.t(spannableString, contextTextStyle, spanStyles, density, resolveTypeface);
        androidx.compose.ui.text.platform.extensions.c.f(spannableString, placeholders, density);
        return spannableString;
    }

    public static final boolean b(@dl.d TextStyle textStyle) {
        PlatformParagraphStyle paragraphSyle;
        f0.p(textStyle, "<this>");
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        if (platformStyle == null || (paragraphSyle = platformStyle.getParagraphSyle()) == null) {
            return true;
        }
        return paragraphSyle.getIncludeFontPadding();
    }
}
