package androidx.compose.ui.text;

import androidx.compose.runtime.j2;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.LayoutDirection;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.lzy.okgo.model.Progress;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: ParagraphStyle.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u001a&\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0000\"\u0017\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0005\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/u;", com.google.android.exoplayer2.text.ttml.d.f49798o0, "stop", "", Progress.G, ak.av, "Landroidx/compose/ui/text/y;", "b", "style", "Landroidx/compose/ui/unit/LayoutDirection;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, ak.aF, "Ls1/u;", "J", "DefaultLineHeight", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f16987a = s1.u.f139249b.b();

    @j2
    @dl.d
    public static final ParagraphStyle a(@dl.d ParagraphStyle start, @dl.d ParagraphStyle stop, float f10) {
        kotlin.jvm.internal.f0.p(start, "start");
        kotlin.jvm.internal.f0.p(stop, "stop");
        androidx.compose.ui.text.style.h hVar = (androidx.compose.ui.text.style.h) SpanStyleKt.c(start.getTextAlign(), stop.getTextAlign(), f10);
        androidx.compose.ui.text.style.j jVar = (androidx.compose.ui.text.style.j) SpanStyleKt.c(start.getTextDirection(), stop.getTextDirection(), f10);
        long jE = SpanStyleKt.e(start.getLineHeight(), stop.getLineHeight(), f10);
        TextIndent textIndent = start.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.INSTANCE.a();
        }
        TextIndent textIndent2 = stop.getTextIndent();
        if (textIndent2 == null) {
            textIndent2 = TextIndent.INSTANCE.a();
        }
        return new ParagraphStyle(hVar, jVar, jE, androidx.compose.ui.text.style.p.a(textIndent, textIndent2, f10), b(start.getPlatformStyle(), stop.getPlatformStyle(), f10), (LineHeightStyle) SpanStyleKt.c(start.getLineHeightStyle(), stop.getLineHeightStyle(), f10), (LineBreak) SpanStyleKt.c(start.getLineBreak(), stop.getLineBreak(), f10), (androidx.compose.ui.text.style.e) SpanStyleKt.c(start.getHyphens(), stop.getHyphens(), f10), null);
    }

    private static final PlatformParagraphStyle b(PlatformParagraphStyle platformParagraphStyle, PlatformParagraphStyle platformParagraphStyle2, float f10) {
        if (platformParagraphStyle == null && platformParagraphStyle2 == null) {
            return null;
        }
        if (platformParagraphStyle == null) {
            platformParagraphStyle = PlatformParagraphStyle.INSTANCE.a();
        }
        if (platformParagraphStyle2 == null) {
            platformParagraphStyle2 = PlatformParagraphStyle.INSTANCE.a();
        }
        return c.b(platformParagraphStyle, platformParagraphStyle2, f10);
    }

    @dl.d
    public static final ParagraphStyle c(@dl.d ParagraphStyle style, @dl.d LayoutDirection direction) {
        kotlin.jvm.internal.f0.p(style, "style");
        kotlin.jvm.internal.f0.p(direction, "direction");
        androidx.compose.ui.text.style.h textAlign = style.getTextAlign();
        androidx.compose.ui.text.style.h hVarG = androidx.compose.ui.text.style.h.g(textAlign != null ? textAlign.getValue() : androidx.compose.ui.text.style.h.INSTANCE.f());
        androidx.compose.ui.text.style.j jVarF = androidx.compose.ui.text.style.j.f(r0.e(direction, style.getTextDirection()));
        long lineHeight = s1.v.s(style.getLineHeight()) ? f16987a : style.getLineHeight();
        TextIndent textIndent = style.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.INSTANCE.a();
        }
        TextIndent textIndent2 = textIndent;
        PlatformParagraphStyle platformStyle = style.getPlatformStyle();
        LineHeightStyle lineHeightStyle = style.getLineHeightStyle();
        LineBreak lineBreak = style.getLineBreak();
        if (lineBreak == null) {
            lineBreak = LineBreak.INSTANCE.c();
        }
        LineBreak lineBreak2 = lineBreak;
        androidx.compose.ui.text.style.e hyphens = style.getHyphens();
        if (hyphens == null) {
            hyphens = androidx.compose.ui.text.style.e.INSTANCE.b();
        }
        return new ParagraphStyle(hVarG, jVarF, lineHeight, textIndent2, platformStyle, lineHeightStyle, lineBreak2, hyphens, null);
    }
}
