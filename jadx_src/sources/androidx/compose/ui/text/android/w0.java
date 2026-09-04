package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;

/* JADX INFO: compiled from: TextLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0018\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0005*\u00020\u0004H\u0002\u001a-\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0005*\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a?\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00000\u0005*\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0014\u0010\u0017\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0000H\u0000\" \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"", "textDirectionHeuristic", "Landroid/text/TextDirectionHeuristic;", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/compose/ui/text/android/TextLayout;", "Lkotlin/Pair;", "i", "", "Ln1/h;", "lineHeightSpans", "f", "(Landroidx/compose/ui/text/android/TextLayout;[Ln1/h;)Lkotlin/Pair;", "Landroid/text/TextPaint;", "textPaint", "frameworkTextDir", "Landroid/graphics/Paint$FontMetricsInt;", "e", "(Landroidx/compose/ui/text/android/TextLayout;Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;[Ln1/h;)Lkotlin/Pair;", "g", "(Landroidx/compose/ui/text/android/TextLayout;)[Ln1/h;", "Landroid/text/Layout;", "lineIndex", "", "j", ak.av, "Lkotlin/Pair;", "EmptyPair", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final Pair<Integer, Integer> f16356a = new Pair<>(0, 0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<Paint.FontMetricsInt, Integer> e(TextLayout textLayout, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, n1.h[] hVarArr) {
        int iQ = textLayout.q() - 1;
        if (textLayout.j().getLineStart(iQ) == textLayout.j().getLineEnd(iQ)) {
            if (true ^ (hVarArr.length == 0)) {
                SpannableString spannableString = new SpannableString("\u200b");
                n1.h hVar = (n1.h) ArraysKt___ArraysKt.sc(hVarArr);
                spannableString.setSpan(hVar.b(0, spannableString.length(), (iQ == 0 || !hVar.getF131954f()) ? hVar.getF131954f() : false), 0, spannableString.length(), 33);
                StaticLayout staticLayoutA = x.f16357a.a(spannableString, (2072512 & 2) != 0 ? 0 : 0, (2072512 & 4) != 0 ? spannableString.length() : spannableString.length(), textPaint, Integer.MAX_VALUE, (2072512 & 32) != 0 ? h.f16314a.b() : textDirectionHeuristic, (2072512 & 64) != 0 ? h.f16314a.a() : null, (2072512 & 128) != 0 ? Integer.MAX_VALUE : 0, (2072512 & 256) != 0 ? null : null, (2072512 & 512) != 0 ? Integer.MAX_VALUE : 0, (2072512 & 1024) != 0 ? 1.0f : 0.0f, (2072512 & 2048) != 0 ? 0.0f : 0.0f, (2072512 & 4096) != 0 ? 0 : 0, (2072512 & 8192) != 0 ? false : textLayout.i(), (2072512 & 16384) != 0 ? true : textLayout.f(), (32768 & 2072512) != 0 ? 0 : 0, (65536 & 2072512) != 0 ? 0 : 0, (131072 & 2072512) != 0 ? 0 : 0, (262144 & 2072512) != 0 ? 0 : 0, (524288 & 2072512) != 0 ? null : null, (2072512 & 1048576) != 0 ? null : null);
                Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = staticLayoutA.getLineAscent(0);
                fontMetricsInt.descent = staticLayoutA.getLineDescent(0);
                fontMetricsInt.top = staticLayoutA.getLineTop(0);
                int lineBottom = staticLayoutA.getLineBottom(0);
                fontMetricsInt.bottom = lineBottom;
                return new Pair<>(fontMetricsInt, Integer.valueOf(lineBottom - ((int) textLayout.x(iQ))));
            }
        }
        return new Pair<>(null, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<Integer, Integer> f(TextLayout textLayout, n1.h[] hVarArr) {
        int iMax = 0;
        int iMax2 = 0;
        for (n1.h hVar : hVarArr) {
            if (hVar.getF131960l() < 0) {
                iMax = Math.max(iMax, Math.abs(hVar.getF131960l()));
            }
            if (hVar.getF131961m() < 0) {
                iMax2 = Math.max(iMax, Math.abs(hVar.getF131961m()));
            }
        }
        return (iMax == 0 && iMax2 == 0) ? f16356a : new Pair<>(Integer.valueOf(iMax), Integer.valueOf(iMax2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n1.h[] g(TextLayout textLayout) {
        if (!(textLayout.O() instanceof Spanned)) {
            return new n1.h[0];
        }
        CharSequence charSequenceO = textLayout.O();
        kotlin.jvm.internal.f0.n(charSequenceO, "null cannot be cast to non-null type android.text.Spanned");
        n1.h[] lineHeightStyleSpans = (n1.h[]) ((Spanned) charSequenceO).getSpans(0, textLayout.O().length(), n1.h.class);
        kotlin.jvm.internal.f0.o(lineHeightStyleSpans, "lineHeightStyleSpans");
        return lineHeightStyleSpans.length == 0 ? new n1.h[0] : lineHeightStyleSpans;
    }

    @dl.d
    public static final TextDirectionHeuristic h(int i10) {
        if (i10 == 0) {
            TextDirectionHeuristic LTR = TextDirectionHeuristics.LTR;
            kotlin.jvm.internal.f0.o(LTR, "LTR");
            return LTR;
        }
        if (i10 == 1) {
            TextDirectionHeuristic RTL = TextDirectionHeuristics.RTL;
            kotlin.jvm.internal.f0.o(RTL, "RTL");
            return RTL;
        }
        if (i10 == 2) {
            TextDirectionHeuristic FIRSTSTRONG_LTR = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            kotlin.jvm.internal.f0.o(FIRSTSTRONG_LTR, "FIRSTSTRONG_LTR");
            return FIRSTSTRONG_LTR;
        }
        if (i10 == 3) {
            TextDirectionHeuristic FIRSTSTRONG_RTL = TextDirectionHeuristics.FIRSTSTRONG_RTL;
            kotlin.jvm.internal.f0.o(FIRSTSTRONG_RTL, "FIRSTSTRONG_RTL");
            return FIRSTSTRONG_RTL;
        }
        if (i10 == 4) {
            TextDirectionHeuristic ANYRTL_LTR = TextDirectionHeuristics.ANYRTL_LTR;
            kotlin.jvm.internal.f0.o(ANYRTL_LTR, "ANYRTL_LTR");
            return ANYRTL_LTR;
        }
        if (i10 != 5) {
            TextDirectionHeuristic FIRSTSTRONG_LTR2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            kotlin.jvm.internal.f0.o(FIRSTSTRONG_LTR2, "FIRSTSTRONG_LTR");
            return FIRSTSTRONG_LTR2;
        }
        TextDirectionHeuristic LOCALE = TextDirectionHeuristics.LOCALE;
        kotlin.jvm.internal.f0.o(LOCALE, "LOCALE");
        return LOCALE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<Integer, Integer> i(TextLayout textLayout) {
        if (textLayout.i() || textLayout.R()) {
            return new Pair<>(0, 0);
        }
        TextPaint paint = textLayout.j().getPaint();
        CharSequence text = textLayout.j().getText();
        kotlin.jvm.internal.f0.o(paint, "paint");
        kotlin.jvm.internal.f0.o(text, "text");
        Rect rectC = p.c(paint, text, textLayout.j().getLineStart(0), textLayout.j().getLineEnd(0));
        int lineAscent = textLayout.j().getLineAscent(0);
        int i10 = rectC.top;
        int topPadding = i10 < lineAscent ? lineAscent - i10 : textLayout.j().getTopPadding();
        if (textLayout.q() != 1) {
            int iQ = textLayout.q() - 1;
            rectC = p.c(paint, text, textLayout.j().getLineStart(iQ), textLayout.j().getLineEnd(iQ));
        }
        int lineDescent = textLayout.j().getLineDescent(textLayout.q() - 1);
        int i11 = rectC.bottom;
        int bottomPadding = i11 > lineDescent ? i11 - lineDescent : textLayout.j().getBottomPadding();
        return (topPadding == 0 && bottomPadding == 0) ? f16356a : new Pair<>(Integer.valueOf(topPadding), Integer.valueOf(bottomPadding));
    }

    public static final boolean j(@dl.d Layout layout, int i10) {
        kotlin.jvm.internal.f0.p(layout, "<this>");
        return layout.getEllipsisCount(i10) > 0;
    }
}
