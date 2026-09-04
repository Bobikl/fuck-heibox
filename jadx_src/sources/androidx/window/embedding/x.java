package androidx.window.embedding;

import android.graphics.Rect;
import android.os.Build;
import android.view.WindowMetrics;
import androidx.annotation.w0;
import com.umeng.analytics.pro.ak;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SplitRule.kt */
/* JADX INFO: loaded from: classes6.dex */
@androidx.window.core.d
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001:\u0002\u0005\u000fB1\b\u0000\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Landroidx/window/embedding/x;", "Landroidx/window/embedding/m;", "Landroid/view/WindowMetrics;", "parentMetrics", "", ak.av, "", "other", "equals", "", "hashCode", "I", "d", "()I", "minWidth", "b", ak.aF, "minSmallestWidth", "", "F", "e", "()F", "splitRatio", "layoutDirection", "<init>", "(IIFI)V", "window_release"}, k = 1, mv = {1, 6, 0})
public class x extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int minWidth;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int minSmallestWidth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float splitRatio;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int layoutDirection;

    /* JADX INFO: compiled from: SplitRule.kt */
    @w0(30)
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Landroidx/window/embedding/x$a;", "", "Landroid/view/WindowMetrics;", "windowMetrics", "Landroid/graphics/Rect;", ak.av, "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final a f28564a = new a();

        private a() {
        }

        @androidx.annotation.u
        @dl.d
        public final Rect a(@dl.d WindowMetrics windowMetrics) {
            f0.p(windowMetrics, "windowMetrics");
            Rect bounds = windowMetrics.getBounds();
            f0.o(bounds, "windowMetrics.bounds");
            return bounds;
        }
    }

    /* JADX INFO: compiled from: SplitRule.kt */
    @mh.c(AnnotationRetention.SOURCE)
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/window/embedding/x$b;", "", "window_release"}, k = 1, mv = {1, 6, 0})
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public x() {
        this(0, 0, 0.0f, 0, 15, null);
    }

    public x(int i10, int i11, float f10, int i12) {
        this.minWidth = i10;
        this.minSmallestWidth = i11;
        this.splitRatio = f10;
        this.layoutDirection = i12;
    }

    public /* synthetic */ x(int i10, int i11, float f10, int i12, int i13, kotlin.jvm.internal.u uVar) {
        this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0.5f : f10, (i13 & 8) != 0 ? 3 : i12);
    }

    public final boolean a(@dl.d WindowMetrics parentMetrics) {
        f0.p(parentMetrics, "parentMetrics");
        if (Build.VERSION.SDK_INT <= 30) {
            return false;
        }
        Rect rectA = a.f28564a.a(parentMetrics);
        return (this.minWidth == 0 || rectA.width() >= this.minWidth) && (this.minSmallestWidth == 0 || Math.min(rectA.width(), rectA.height()) >= this.minSmallestWidth);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getLayoutDirection() {
        return this.layoutDirection;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMinSmallestWidth() {
        return this.minSmallestWidth;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMinWidth() {
        return this.minWidth;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getSplitRatio() {
        return this.splitRatio;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof x)) {
            return false;
        }
        x xVar = (x) other;
        if (this.minWidth == xVar.minWidth && this.minSmallestWidth == xVar.minSmallestWidth) {
            return ((this.splitRatio > xVar.splitRatio ? 1 : (this.splitRatio == xVar.splitRatio ? 0 : -1)) == 0) && this.layoutDirection == xVar.layoutDirection;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.minWidth * 31) + this.minSmallestWidth) * 31) + Float.floatToIntBits(this.splitRatio)) * 31) + this.layoutDirection;
    }
}
