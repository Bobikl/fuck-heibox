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
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\"\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\\\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\nH\u0007J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0015H\u0007¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/text/android/c;", "", "", "text", "Landroid/text/TextPaint;", "paint", "Landroid/text/TextDirectionHeuristic;", "textDir", "Landroid/text/BoringLayout$Metrics;", "d", "", "width", "metrics", "Landroid/text/Layout$Alignment;", "alignment", "", "includePadding", "useFallbackLineSpacing", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "ellipsizedWidth", "Landroid/text/BoringLayout;", ak.av, com.google.android.exoplayer2.text.ttml.d.f49813w, ak.aF, "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final c f16302a = new c();

    private c() {
    }

    @androidx.annotation.r0(markerClass = {androidx.core.os.a.b.class})
    @dl.d
    public final BoringLayout a(@dl.d CharSequence text, @dl.d TextPaint paint, int width, @dl.d BoringLayout.Metrics metrics, @dl.d Layout.Alignment alignment, boolean includePadding, boolean useFallbackLineSpacing, @dl.e TextUtils.TruncateAt ellipsize, int ellipsizedWidth) {
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(paint, "paint");
        kotlin.jvm.internal.f0.p(metrics, "metrics");
        kotlin.jvm.internal.f0.p(alignment, "alignment");
        if (!(width >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (ellipsizedWidth >= 0) {
            return androidx.core.os.a.k() ? b.a(text, paint, width, alignment, 1.0f, 0.0f, metrics, includePadding, useFallbackLineSpacing, ellipsize, ellipsizedWidth) : d.a(text, paint, width, alignment, 1.0f, 0.0f, metrics, includePadding, ellipsize, ellipsizedWidth);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @androidx.annotation.r0(markerClass = {androidx.core.os.a.b.class})
    public final boolean c(@dl.d BoringLayout layout) {
        kotlin.jvm.internal.f0.p(layout, "layout");
        if (androidx.core.os.a.k()) {
            return b.f16280a.d(layout);
        }
        return false;
    }

    @androidx.annotation.r0(markerClass = {androidx.core.os.a.b.class})
    @dl.e
    public final BoringLayout.Metrics d(@dl.d CharSequence text, @dl.d TextPaint paint, @dl.d TextDirectionHeuristic textDir) {
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(paint, "paint");
        kotlin.jvm.internal.f0.p(textDir, "textDir");
        return androidx.core.os.a.k() ? b.c(text, paint, textDir) : d.c(text, paint, textDir);
    }
}
