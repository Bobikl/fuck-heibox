package androidx.compose.material3;

import androidx.compose.ui.text.TextStyle;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.material3.e2, reason: from toString */
/* JADX INFO: compiled from: Typography.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b,\u0010-J\u009c\u0001\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b%\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b&\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b'\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b(\u0010\u001cR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b!\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001a\u001a\u0004\b#\u0010\u001cR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001a\u001a\u0004\b)\u0010\u001cR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001a\u001a\u0004\b*\u0010\u001cR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001a\u001a\u0004\b+\u0010\u001c¨\u0006."}, d2 = {"Landroidx/compose/material3/e2;", "", "Landroidx/compose/ui/text/q0;", "displayLarge", "displayMedium", "displaySmall", "headlineLarge", "headlineMedium", "headlineSmall", "titleLarge", "titleMedium", "titleSmall", "bodyLarge", "bodyMedium", "bodySmall", "labelLarge", "labelMedium", "labelSmall", ak.av, "other", "", "equals", "", "hashCode", "", "toString", "Landroidx/compose/ui/text/q0;", "f", "()Landroidx/compose/ui/text/q0;", "b", "g", ak.aF, RXScreenCaptureService.KEY_HEIGHT, "d", "i", "e", "j", "k", "o", "p", "q", "l", "m", "n", "<init>", "(Landroidx/compose/ui/text/q0;Landroidx/compose/ui/text/q0;Landroidx/compose/ui/text/q0;Landroidx/compose/ui/text/q0;Landroidx/compose/ui/text/q0;Landroidx/compose/ui/text/q0;Landroidx/compose/ui/text/q0;Landroidx/compose/ui/text/q0;Landroidx/compose/ui/text/q0;Landroidx/compose/ui/text/q0;Landroidx/compose/ui/text/q0;Landroidx/compose/ui/text/q0;Landroidx/compose/ui/text/q0;Landroidx/compose/ui/text/q0;Landroidx/compose/ui/text/q0;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class Typography {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final TextStyle displayLarge;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final TextStyle displayMedium;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final TextStyle displaySmall;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final TextStyle headlineLarge;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final TextStyle headlineMedium;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final TextStyle headlineSmall;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final TextStyle titleLarge;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final TextStyle titleMedium;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final TextStyle titleSmall;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final TextStyle bodyLarge;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final TextStyle bodyMedium;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final TextStyle bodySmall;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final TextStyle labelLarge;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final TextStyle labelMedium;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final TextStyle labelSmall;

    public Typography() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    public Typography(@dl.d TextStyle displayLarge, @dl.d TextStyle displayMedium, @dl.d TextStyle displaySmall, @dl.d TextStyle headlineLarge, @dl.d TextStyle headlineMedium, @dl.d TextStyle headlineSmall, @dl.d TextStyle titleLarge, @dl.d TextStyle titleMedium, @dl.d TextStyle titleSmall, @dl.d TextStyle bodyLarge, @dl.d TextStyle bodyMedium, @dl.d TextStyle bodySmall, @dl.d TextStyle labelLarge, @dl.d TextStyle labelMedium, @dl.d TextStyle labelSmall) {
        kotlin.jvm.internal.f0.p(displayLarge, "displayLarge");
        kotlin.jvm.internal.f0.p(displayMedium, "displayMedium");
        kotlin.jvm.internal.f0.p(displaySmall, "displaySmall");
        kotlin.jvm.internal.f0.p(headlineLarge, "headlineLarge");
        kotlin.jvm.internal.f0.p(headlineMedium, "headlineMedium");
        kotlin.jvm.internal.f0.p(headlineSmall, "headlineSmall");
        kotlin.jvm.internal.f0.p(titleLarge, "titleLarge");
        kotlin.jvm.internal.f0.p(titleMedium, "titleMedium");
        kotlin.jvm.internal.f0.p(titleSmall, "titleSmall");
        kotlin.jvm.internal.f0.p(bodyLarge, "bodyLarge");
        kotlin.jvm.internal.f0.p(bodyMedium, "bodyMedium");
        kotlin.jvm.internal.f0.p(bodySmall, "bodySmall");
        kotlin.jvm.internal.f0.p(labelLarge, "labelLarge");
        kotlin.jvm.internal.f0.p(labelMedium, "labelMedium");
        kotlin.jvm.internal.f0.p(labelSmall, "labelSmall");
        this.displayLarge = displayLarge;
        this.displayMedium = displayMedium;
        this.displaySmall = displaySmall;
        this.headlineLarge = headlineLarge;
        this.headlineMedium = headlineMedium;
        this.headlineSmall = headlineSmall;
        this.titleLarge = titleLarge;
        this.titleMedium = titleMedium;
        this.titleSmall = titleSmall;
        this.bodyLarge = bodyLarge;
        this.bodyMedium = bodyMedium;
        this.bodySmall = bodySmall;
        this.labelLarge = labelLarge;
        this.labelMedium = labelMedium;
        this.labelSmall = labelSmall;
    }

    public /* synthetic */ Typography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? t0.e1.f139684a.d() : textStyle, (i10 & 2) != 0 ? t0.e1.f139684a.e() : textStyle2, (i10 & 4) != 0 ? t0.e1.f139684a.f() : textStyle3, (i10 & 8) != 0 ? t0.e1.f139684a.g() : textStyle4, (i10 & 16) != 0 ? t0.e1.f139684a.h() : textStyle5, (i10 & 32) != 0 ? t0.e1.f139684a.i() : textStyle6, (i10 & 64) != 0 ? t0.e1.f139684a.m() : textStyle7, (i10 & 128) != 0 ? t0.e1.f139684a.n() : textStyle8, (i10 & 256) != 0 ? t0.e1.f139684a.o() : textStyle9, (i10 & 512) != 0 ? t0.e1.f139684a.a() : textStyle10, (i10 & 1024) != 0 ? t0.e1.f139684a.b() : textStyle11, (i10 & 2048) != 0 ? t0.e1.f139684a.c() : textStyle12, (i10 & 4096) != 0 ? t0.e1.f139684a.j() : textStyle13, (i10 & 8192) != 0 ? t0.e1.f139684a.k() : textStyle14, (i10 & 16384) != 0 ? t0.e1.f139684a.l() : textStyle15);
    }

    @dl.d
    public final Typography a(@dl.d TextStyle displayLarge, @dl.d TextStyle displayMedium, @dl.d TextStyle displaySmall, @dl.d TextStyle headlineLarge, @dl.d TextStyle headlineMedium, @dl.d TextStyle headlineSmall, @dl.d TextStyle titleLarge, @dl.d TextStyle titleMedium, @dl.d TextStyle titleSmall, @dl.d TextStyle bodyLarge, @dl.d TextStyle bodyMedium, @dl.d TextStyle bodySmall, @dl.d TextStyle labelLarge, @dl.d TextStyle labelMedium, @dl.d TextStyle labelSmall) {
        kotlin.jvm.internal.f0.p(displayLarge, "displayLarge");
        kotlin.jvm.internal.f0.p(displayMedium, "displayMedium");
        kotlin.jvm.internal.f0.p(displaySmall, "displaySmall");
        kotlin.jvm.internal.f0.p(headlineLarge, "headlineLarge");
        kotlin.jvm.internal.f0.p(headlineMedium, "headlineMedium");
        kotlin.jvm.internal.f0.p(headlineSmall, "headlineSmall");
        kotlin.jvm.internal.f0.p(titleLarge, "titleLarge");
        kotlin.jvm.internal.f0.p(titleMedium, "titleMedium");
        kotlin.jvm.internal.f0.p(titleSmall, "titleSmall");
        kotlin.jvm.internal.f0.p(bodyLarge, "bodyLarge");
        kotlin.jvm.internal.f0.p(bodyMedium, "bodyMedium");
        kotlin.jvm.internal.f0.p(bodySmall, "bodySmall");
        kotlin.jvm.internal.f0.p(labelLarge, "labelLarge");
        kotlin.jvm.internal.f0.p(labelMedium, "labelMedium");
        kotlin.jvm.internal.f0.p(labelSmall, "labelSmall");
        return new Typography(displayLarge, displayMedium, displaySmall, headlineLarge, headlineMedium, headlineSmall, titleLarge, titleMedium, titleSmall, bodyLarge, bodyMedium, bodySmall, labelLarge, labelMedium, labelSmall);
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextStyle getBodyLarge() {
        return this.bodyLarge;
    }

    @dl.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextStyle getBodyMedium() {
        return this.bodyMedium;
    }

    @dl.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextStyle getBodySmall() {
        return this.bodySmall;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) other;
        return kotlin.jvm.internal.f0.g(this.displayLarge, typography.displayLarge) && kotlin.jvm.internal.f0.g(this.displayMedium, typography.displayMedium) && kotlin.jvm.internal.f0.g(this.displaySmall, typography.displaySmall) && kotlin.jvm.internal.f0.g(this.headlineLarge, typography.headlineLarge) && kotlin.jvm.internal.f0.g(this.headlineMedium, typography.headlineMedium) && kotlin.jvm.internal.f0.g(this.headlineSmall, typography.headlineSmall) && kotlin.jvm.internal.f0.g(this.titleLarge, typography.titleLarge) && kotlin.jvm.internal.f0.g(this.titleMedium, typography.titleMedium) && kotlin.jvm.internal.f0.g(this.titleSmall, typography.titleSmall) && kotlin.jvm.internal.f0.g(this.bodyLarge, typography.bodyLarge) && kotlin.jvm.internal.f0.g(this.bodyMedium, typography.bodyMedium) && kotlin.jvm.internal.f0.g(this.bodySmall, typography.bodySmall) && kotlin.jvm.internal.f0.g(this.labelLarge, typography.labelLarge) && kotlin.jvm.internal.f0.g(this.labelMedium, typography.labelMedium) && kotlin.jvm.internal.f0.g(this.labelSmall, typography.labelSmall);
    }

    @dl.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextStyle getDisplayLarge() {
        return this.displayLarge;
    }

    @dl.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextStyle getDisplayMedium() {
        return this.displayMedium;
    }

    @dl.d
    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextStyle getDisplaySmall() {
        return this.displaySmall;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.displayLarge.hashCode() * 31) + this.displayMedium.hashCode()) * 31) + this.displaySmall.hashCode()) * 31) + this.headlineLarge.hashCode()) * 31) + this.headlineMedium.hashCode()) * 31) + this.headlineSmall.hashCode()) * 31) + this.titleLarge.hashCode()) * 31) + this.titleMedium.hashCode()) * 31) + this.titleSmall.hashCode()) * 31) + this.bodyLarge.hashCode()) * 31) + this.bodyMedium.hashCode()) * 31) + this.bodySmall.hashCode()) * 31) + this.labelLarge.hashCode()) * 31) + this.labelMedium.hashCode()) * 31) + this.labelSmall.hashCode();
    }

    @dl.d
    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextStyle getHeadlineLarge() {
        return this.headlineLarge;
    }

    @dl.d
    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextStyle getHeadlineMedium() {
        return this.headlineMedium;
    }

    @dl.d
    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextStyle getHeadlineSmall() {
        return this.headlineSmall;
    }

    @dl.d
    /* JADX INFO: renamed from: l, reason: from getter */
    public final TextStyle getLabelLarge() {
        return this.labelLarge;
    }

    @dl.d
    /* JADX INFO: renamed from: m, reason: from getter */
    public final TextStyle getLabelMedium() {
        return this.labelMedium;
    }

    @dl.d
    /* JADX INFO: renamed from: n, reason: from getter */
    public final TextStyle getLabelSmall() {
        return this.labelSmall;
    }

    @dl.d
    /* JADX INFO: renamed from: o, reason: from getter */
    public final TextStyle getTitleLarge() {
        return this.titleLarge;
    }

    @dl.d
    /* JADX INFO: renamed from: p, reason: from getter */
    public final TextStyle getTitleMedium() {
        return this.titleMedium;
    }

    @dl.d
    /* JADX INFO: renamed from: q, reason: from getter */
    public final TextStyle getTitleSmall() {
        return this.titleSmall;
    }

    @dl.d
    public String toString() {
        return "Typography(displayLarge=" + this.displayLarge + ", displayMedium=" + this.displayMedium + ",displaySmall=" + this.displaySmall + ", headlineLarge=" + this.headlineLarge + ", headlineMedium=" + this.headlineMedium + ", headlineSmall=" + this.headlineSmall + ", titleLarge=" + this.titleLarge + ", titleMedium=" + this.titleMedium + ", titleSmall=" + this.titleSmall + ", bodyLarge=" + this.bodyLarge + ", bodyMedium=" + this.bodyMedium + ", bodySmall=" + this.bodySmall + ", labelLarge=" + this.labelLarge + ", labelMedium=" + this.labelMedium + ", labelSmall=" + this.labelSmall + ')';
    }
}
