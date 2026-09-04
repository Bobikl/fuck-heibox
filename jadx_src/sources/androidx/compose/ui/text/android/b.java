package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: BoringLayoutFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(33)
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007Jf\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\nH\u0007J\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0018¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/text/android/b;", "", "", "text", "Landroid/text/TextPaint;", "paint", "Landroid/text/TextDirectionHeuristic;", "textDir", "Landroid/text/BoringLayout$Metrics;", ak.aF, "", "width", "Landroid/text/Layout$Alignment;", "alignment", "", "lineSpacingMultiplier", "lineSpacingExtra", "metrics", "", "includePadding", "useFallbackLineSpacing", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "ellipsizedWidth", "Landroid/text/BoringLayout;", ak.av, com.google.android.exoplayer2.text.ttml.d.f49813w, "d", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final b f16280a = new b();

    private b() {
    }

    @androidx.annotation.u
    @dl.d
    @xh.m
    public static final BoringLayout a(@dl.d CharSequence text, @dl.d TextPaint paint, int width, @dl.d Layout.Alignment alignment, float lineSpacingMultiplier, float lineSpacingExtra, @dl.d BoringLayout.Metrics metrics, boolean includePadding, boolean useFallbackLineSpacing, @dl.e TextUtils.TruncateAt ellipsize, int ellipsizedWidth) {
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(paint, "paint");
        kotlin.jvm.internal.f0.p(alignment, "alignment");
        kotlin.jvm.internal.f0.p(metrics, "metrics");
        BoringLayout boringLayoutA = a.a(text, paint, width, alignment, lineSpacingMultiplier, lineSpacingExtra, metrics, includePadding, ellipsize, ellipsizedWidth, useFallbackLineSpacing);
        kotlin.jvm.internal.f0.o(boringLayoutA, "create(\n            text…backLineSpacing\n        )");
        return boringLayoutA;
    }

    @androidx.annotation.u
    @dl.e
    @xh.m
    public static final BoringLayout.Metrics c(@dl.d CharSequence text, @dl.d TextPaint paint, @dl.d TextDirectionHeuristic textDir) {
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(paint, "paint");
        kotlin.jvm.internal.f0.p(textDir, "textDir");
        return BoringLayout.isBoring(text, paint, textDir, true, null);
    }

    public final boolean d(@dl.d BoringLayout layout) {
        kotlin.jvm.internal.f0.p(layout, "layout");
        return layout.isFallbackLineSpacingEnabled();
    }
}
