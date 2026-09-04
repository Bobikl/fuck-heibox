package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import android.os.Build;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.LocaleSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.c2;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.graphics.n0;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.g0;
import androidx.compose.ui.text.font.h0;
import androidx.compose.ui.text.font.v;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.i;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.m;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt___StringsKt;
import n1.h;
import n1.l;
import n1.n;
import n1.o;
import p1.LocaleList;
import s1.u;
import s1.w;
import yh.q;
import yh.r;

/* JADX INFO: compiled from: SpannableExtensions.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a$\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a&\u0010\u000e\u001a\u00020\u0006*\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000\u001a9\u0010\u0013\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a1\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a-\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a[\u0010&\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b2\u0006\u0010\r\u001a\u00020\f2&\u0010%\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\u001fH\u0000ø\u0001\u0001\u001a:\u0010,\u001a\u00020\u0006*\u00020\u00002\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\r\u001a\u00020\f2\u0016\u0010+\u001a\u0012\u0012\u0004\u0012\u00020)0(j\b\u0012\u0004\u0012\u00020)`*H\u0002\u001aS\u0010-\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b2&\u0010%\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\u001fH\u0002ø\u0001\u0001\u001aF\u00101\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b2\u001e\u00100\u001a\u001a\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060/H\u0000\u001a'\u00104\u001a\u0004\u0018\u0001032\u0006\u00102\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105\u001a&\u00108\u001a\u00020\u0006*\u00020\u00002\b\u00107\u001a\u0004\u0018\u0001062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a1\u0010;\u001a\u00020\u0006*\u00020\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b;\u0010<\u001a&\u0010?\u001a\u00020\u0006*\u00020\u00002\b\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a&\u0010B\u001a\u00020\u0006*\u00020\u00002\b\u0010A\u001a\u0004\u0018\u00010@2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a&\u0010E\u001a\u00020\u0006*\u00020\u00002\b\u0010D\u001a\u0004\u0018\u00010C2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a9\u0010G\u001a\u00020\u0006*\u00020\u00002\u0006\u0010F\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bG\u0010H\u001a&\u0010K\u001a\u00020\u0006*\u00020\u00002\b\u0010J\u001a\u0004\u0018\u00010I2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a1\u0010L\u001a\u00020\u0006*\u00020\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bL\u0010<\u001a3\u0010O\u001a\u00020\u0006*\u00020\u00002\b\u0010N\u001a\u0004\u0018\u00010M2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bO\u0010P\u001a.\u0010T\u001a\u00020\u0006*\u00020\u00002\b\u0010R\u001a\u0004\u0018\u00010Q2\u0006\u0010S\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a\f\u0010V\u001a\u00020U*\u00020\u0019H\u0002\u001a\u0016\u0010X\u001a\u00020\u001d*\u0004\u0018\u00010\u001d2\u0006\u0010W\u001a\u00020\u001dH\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006Y"}, d2 = {"Landroid/text/Spannable;", "", com.google.android.exoplayer2.text.ttml.d.f49805s, "", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "Lkotlin/b2;", "r", "Landroidx/compose/ui/text/style/o;", "textIndent", "", "contextFontSize", "Ls1/e;", "density", "v", "Ls1/u;", "lineHeight", "Landroidx/compose/ui/text/style/g;", "lineHeightStyle", "n", "(Landroid/text/Spannable;JFLs1/e;Landroidx/compose/ui/text/style/g;)V", "o", "(Landroid/text/Spannable;JFLs1/e;)V", "e", "(JFLs1/e;)F", "Landroidx/compose/ui/text/q0;", "contextTextStyle", "", "Landroidx/compose/ui/text/d$b;", "Landroidx/compose/ui/text/d0;", "spanStyles", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/v;", "Landroidx/compose/ui/text/font/k0;", "Landroidx/compose/ui/text/font/g0;", "Landroidx/compose/ui/text/font/h0;", "Landroid/graphics/Typeface;", "resolveTypeface", "t", "spanStyleRange", "Ljava/util/ArrayList;", "Landroidx/compose/ui/text/platform/extensions/d;", "Lkotlin/collections/ArrayList;", "lowPrioritySpans", ak.aB, "j", "contextFontSpanStyle", "Lkotlin/Function3;", "block", "b", "letterSpacing", "Landroid/text/style/MetricAffectingSpan;", ak.av, "(JLs1/e;)Landroid/text/style/MetricAffectingSpan;", "Landroidx/compose/ui/graphics/e2;", "shadow", "q", "Landroidx/compose/ui/graphics/l0;", "color", "f", "(Landroid/text/Spannable;JII)V", "Lp1/f;", "localeList", "p", "Landroidx/compose/ui/text/style/m;", "textGeometricTransform", "m", "", "fontFeatureSettings", "k", com.google.android.exoplayer2.text.ttml.d.J, "l", "(Landroid/text/Spannable;JLs1/e;II)V", "Landroidx/compose/ui/text/style/i;", com.google.android.exoplayer2.text.ttml.d.P, ak.aG, "i", "Landroidx/compose/ui/text/style/a;", "baselineShift", "g", "(Landroid/text/Spannable;Landroidx/compose/ui/text/style/a;II)V", "Landroidx/compose/ui/graphics/a0;", "brush", "alpha", RXScreenCaptureService.KEY_HEIGHT, "", ak.aF, "spanStyle", "d", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class SpannableExtensions_androidKt {
    private static final MetricAffectingSpan a(long j10, s1.e eVar) {
        long jM = u.m(j10);
        w.a aVar = w.f139257b;
        if (w.g(jM, aVar.b())) {
            return new n1.f(eVar.k1(j10));
        }
        if (w.g(jM, aVar.a())) {
            return new n1.e(u.n(j10));
        }
        return null;
    }

    public static final void b(@dl.e SpanStyle spanStyle, @dl.d List<androidx.compose.ui.text.d.Range<SpanStyle>> spanStyles, @dl.d q<? super SpanStyle, ? super Integer, ? super Integer, b2> block) {
        f0.p(spanStyles, "spanStyles");
        f0.p(block, "block");
        if (spanStyles.size() <= 1) {
            if (!spanStyles.isEmpty()) {
                block.invoke(d(spanStyle, spanStyles.get(0).h()), Integer.valueOf(spanStyles.get(0).i()), Integer.valueOf(spanStyles.get(0).g()));
                return;
            }
            return;
        }
        int size = spanStyles.size();
        int i10 = size * 2;
        Integer[] numArr = new Integer[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            numArr[i11] = 0;
        }
        int size2 = spanStyles.size();
        for (int i12 = 0; i12 < size2; i12++) {
            androidx.compose.ui.text.d.Range<SpanStyle> range = spanStyles.get(i12);
            numArr[i12] = Integer.valueOf(range.i());
            numArr[i12 + size] = Integer.valueOf(range.g());
        }
        m.v4(numArr);
        int iIntValue = ((Number) ArraysKt___ArraysKt.sc(numArr)).intValue();
        for (int i13 = 0; i13 < i10; i13++) {
            int iIntValue2 = numArr[i13].intValue();
            if (iIntValue2 != iIntValue) {
                int size3 = spanStyles.size();
                SpanStyle spanStyleD = spanStyle;
                for (int i14 = 0; i14 < size3; i14++) {
                    androidx.compose.ui.text.d.Range<SpanStyle> range2 = spanStyles.get(i14);
                    if (range2.i() != range2.g() && AnnotatedStringKt.o(iIntValue, iIntValue2, range2.i(), range2.g())) {
                        spanStyleD = d(spanStyleD, range2.h());
                    }
                }
                if (spanStyleD != null) {
                    block.invoke(spanStyleD, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
                }
                iIntValue = iIntValue2;
            }
        }
    }

    private static final boolean c(TextStyle textStyle) {
        return e.c(textStyle.X()) || textStyle.u() != null;
    }

    private static final SpanStyle d(SpanStyle spanStyle, SpanStyle spanStyle2) {
        return spanStyle == null ? spanStyle2 : spanStyle.D(spanStyle2);
    }

    private static final float e(long j10, float f10, s1.e eVar) {
        long jM = u.m(j10);
        w.a aVar = w.f139257b;
        if (w.g(jM, aVar.b())) {
            return eVar.k1(j10);
        }
        if (w.g(jM, aVar.a())) {
            return u.n(j10) * f10;
        }
        return Float.NaN;
    }

    public static final void f(@dl.d Spannable setBackground, long j10, int i10, int i11) {
        f0.p(setBackground, "$this$setBackground");
        if (j10 != l0.INSTANCE.u()) {
            r(setBackground, new BackgroundColorSpan(n0.s(j10)), i10, i11);
        }
    }

    private static final void g(Spannable spannable, androidx.compose.ui.text.style.a aVar, int i10, int i11) {
        if (aVar != null) {
            r(spannable, new n1.a(aVar.k()), i10, i11);
        }
    }

    private static final void h(Spannable spannable, a0 a0Var, float f10, int i10, int i11) {
        if (a0Var != null) {
            if (a0Var instanceof SolidColor) {
                i(spannable, ((SolidColor) a0Var).getValue(), i10, i11);
            } else if (a0Var instanceof c2) {
                r(spannable, new q1.a((c2) a0Var, f10), i10, i11);
            }
        }
    }

    public static final void i(@dl.d Spannable setColor, long j10, int i10, int i11) {
        f0.p(setColor, "$this$setColor");
        if (j10 != l0.INSTANCE.u()) {
            r(setColor, new ForegroundColorSpan(n0.s(j10)), i10, i11);
        }
    }

    private static final void j(final Spannable spannable, TextStyle textStyle, List<androidx.compose.ui.text.d.Range<SpanStyle>> list, final r<? super v, ? super FontWeight, ? super g0, ? super h0, ? extends Typeface> rVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.ui.text.d.Range<SpanStyle> range = list.get(i10);
            androidx.compose.ui.text.d.Range<SpanStyle> range2 = range;
            if (e.c(range2.h()) || range2.h().getFontSynthesis() != null) {
                arrayList.add(range);
            }
        }
        b(c(textStyle) ? new SpanStyle(0L, 0L, textStyle.v(), textStyle.t(), textStyle.u(), textStyle.q(), (String) null, 0L, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (i) null, (Shadow) null, 16323, (kotlin.jvm.internal.u) null) : null, arrayList, new q<SpanStyle, Integer, Integer, b2>() { // from class: androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt$setFontAttributes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            public final void a(@dl.d SpanStyle spanStyle, int i11, int i12) {
                f0.p(spanStyle, "spanStyle");
                Spannable spannable2 = spannable;
                r<v, FontWeight, g0, h0, Typeface> rVar2 = rVar;
                v fontFamily = spanStyle.getFontFamily();
                FontWeight fontWeight = spanStyle.getFontWeight();
                if (fontWeight == null) {
                    fontWeight = FontWeight.INSTANCE.m();
                }
                g0 fontStyle = spanStyle.getFontStyle();
                g0 g0VarC = g0.c(fontStyle != null ? fontStyle.j() : g0.INSTANCE.b());
                h0 fontSynthesis = spanStyle.getFontSynthesis();
                spannable2.setSpan(new o(rVar2.U0(fontFamily, fontWeight, g0VarC, h0.e(fontSynthesis != null ? fontSynthesis.getValue() : h0.INSTANCE.a()))), i11, i12, 33);
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ b2 invoke(SpanStyle spanStyle, Integer num, Integer num2) {
                a(spanStyle, num.intValue(), num2.intValue());
                return b2.f124493a;
            }
        });
    }

    private static final void k(Spannable spannable, String str, int i10, int i11) {
        if (str != null) {
            r(spannable, new n1.b(str), i10, i11);
        }
    }

    public static final void l(@dl.d Spannable setFontSize, long j10, @dl.d s1.e density, int i10, int i11) {
        f0.p(setFontSize, "$this$setFontSize");
        f0.p(density, "density");
        long jM = u.m(j10);
        w.a aVar = w.f139257b;
        if (w.g(jM, aVar.b())) {
            r(setFontSize, new AbsoluteSizeSpan(di.d.L0(density.k1(j10)), false), i10, i11);
        } else if (w.g(jM, aVar.a())) {
            r(setFontSize, new RelativeSizeSpan(u.n(j10)), i10, i11);
        }
    }

    private static final void m(Spannable spannable, TextGeometricTransform textGeometricTransform, int i10, int i11) {
        if (textGeometricTransform != null) {
            r(spannable, new ScaleXSpan(textGeometricTransform.getScaleX()), i10, i11);
            r(spannable, new n1.m(textGeometricTransform.getSkewX()), i10, i11);
        }
    }

    public static final void n(@dl.d Spannable setLineHeight, long j10, float f10, @dl.d s1.e density, @dl.d LineHeightStyle lineHeightStyle) {
        f0.p(setLineHeight, "$this$setLineHeight");
        f0.p(density, "density");
        f0.p(lineHeightStyle, "lineHeightStyle");
        float fE = e(j10, f10, density);
        if (Float.isNaN(fE)) {
            return;
        }
        r(setLineHeight, new h(fE, 0, ((setLineHeight.length() == 0) || StringsKt___StringsKt.u7(setLineHeight) == '\n') ? setLineHeight.length() + 1 : setLineHeight.length(), LineHeightStyle.c.j(lineHeightStyle.getTrim()), LineHeightStyle.c.k(lineHeightStyle.getTrim()), lineHeightStyle.getAlignment()), 0, setLineHeight.length());
    }

    public static final void o(@dl.d Spannable setLineHeight, long j10, float f10, @dl.d s1.e density) {
        f0.p(setLineHeight, "$this$setLineHeight");
        f0.p(density, "density");
        float fE = e(j10, f10, density);
        if (Float.isNaN(fE)) {
            return;
        }
        r(setLineHeight, new n1.g(fE), 0, setLineHeight.length());
    }

    public static final void p(@dl.d Spannable spannable, @dl.e LocaleList localeList, int i10, int i11) {
        Object localeSpan;
        f0.p(spannable, "<this>");
        if (localeList != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                localeSpan = b.f16858a.a(localeList);
            } else {
                localeSpan = new LocaleSpan(a.a(localeList.isEmpty() ? p1.e.f138135b.a() : localeList.e(0)));
            }
            r(spannable, localeSpan, i10, i11);
        }
    }

    private static final void q(Spannable spannable, Shadow shadow, int i10, int i11) {
        if (shadow != null) {
            r(spannable, new l(n0.s(shadow.getColor()), b1.f.p(shadow.getOffset()), b1.f.r(shadow.getOffset()), e.b(shadow.getBlurRadius())), i10, i11);
        }
    }

    public static final void r(@dl.d Spannable spannable, @dl.d Object span, int i10, int i11) {
        f0.p(spannable, "<this>");
        f0.p(span, "span");
        spannable.setSpan(span, i10, i11, 33);
    }

    private static final void s(Spannable spannable, androidx.compose.ui.text.d.Range<SpanStyle> range, s1.e eVar, ArrayList<SpanRange> arrayList) {
        int i10 = range.i();
        int iG = range.g();
        SpanStyle spanStyleH = range.h();
        g(spannable, spanStyleH.getBaselineShift(), i10, iG);
        i(spannable, spanStyleH.m(), i10, iG);
        h(spannable, spanStyleH.k(), spanStyleH.g(), i10, iG);
        u(spannable, spanStyleH.getTextDecoration(), i10, iG);
        l(spannable, spanStyleH.getFontSize(), eVar, i10, iG);
        k(spannable, spanStyleH.getFontFeatureSettings(), i10, iG);
        m(spannable, spanStyleH.getTextGeometricTransform(), i10, iG);
        p(spannable, spanStyleH.getLocaleList(), i10, iG);
        f(spannable, spanStyleH.getBackground(), i10, iG);
        q(spannable, spanStyleH.getShadow(), i10, iG);
        MetricAffectingSpan metricAffectingSpanA = a(spanStyleH.getLetterSpacing(), eVar);
        if (metricAffectingSpanA != null) {
            arrayList.add(new SpanRange(metricAffectingSpanA, i10, iG));
        }
    }

    public static final void t(@dl.d Spannable spannable, @dl.d TextStyle contextTextStyle, @dl.d List<androidx.compose.ui.text.d.Range<SpanStyle>> spanStyles, @dl.d s1.e density, @dl.d r<? super v, ? super FontWeight, ? super g0, ? super h0, ? extends Typeface> resolveTypeface) {
        f0.p(spannable, "<this>");
        f0.p(contextTextStyle, "contextTextStyle");
        f0.p(spanStyles, "spanStyles");
        f0.p(density, "density");
        f0.p(resolveTypeface, "resolveTypeface");
        j(spannable, contextTextStyle, spanStyles, resolveTypeface);
        ArrayList arrayList = new ArrayList();
        int size = spanStyles.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.ui.text.d.Range<SpanStyle> range = spanStyles.get(i10);
            int i11 = range.i();
            int iG = range.g();
            if (i11 >= 0 && i11 < spannable.length() && iG > i11 && iG <= spannable.length()) {
                s(spannable, range, density, arrayList);
            }
        }
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            SpanRange spanRange = (SpanRange) arrayList.get(i12);
            r(spannable, spanRange.getSpan(), spanRange.getStart(), spanRange.getEnd());
        }
    }

    public static final void u(@dl.d Spannable spannable, @dl.e i iVar, int i10, int i11) {
        f0.p(spannable, "<this>");
        if (iVar != null) {
            i.Companion companion = i.INSTANCE;
            r(spannable, new n(iVar.d(companion.f()), iVar.d(companion.b())), i10, i11);
        }
    }

    public static final void v(@dl.d Spannable spannable, @dl.e TextIndent textIndent, float f10, @dl.d s1.e density) {
        float fN;
        f0.p(spannable, "<this>");
        f0.p(density, "density");
        if (textIndent != null) {
            if ((u.j(textIndent.getFirstLine(), s1.v.m(0)) && u.j(textIndent.getRestLine(), s1.v.m(0))) || s1.v.s(textIndent.getFirstLine()) || s1.v.s(textIndent.getRestLine())) {
                return;
            }
            long jM = u.m(textIndent.getFirstLine());
            w.a aVar = w.f139257b;
            float fN2 = 0.0f;
            if (w.g(jM, aVar.b())) {
                fN = density.k1(textIndent.getFirstLine());
            } else {
                fN = w.g(jM, aVar.a()) ? u.n(textIndent.getFirstLine()) * f10 : 0.0f;
            }
            long jM2 = u.m(textIndent.getRestLine());
            if (w.g(jM2, aVar.b())) {
                fN2 = density.k1(textIndent.getRestLine());
            } else if (w.g(jM2, aVar.a())) {
                fN2 = u.n(textIndent.getRestLine()) * f10;
            }
            r(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(fN), (int) Math.ceil(fN2)), 0, spannable.length());
        }
    }
}
