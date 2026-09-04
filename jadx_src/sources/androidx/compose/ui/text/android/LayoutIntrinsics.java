package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import com.umeng.analytics.pro.ak;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX INFO: compiled from: LayoutIntrinsics.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001b\u0010\u000b\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\nR\u001b\u0010\f\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\b\u0010\n¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/android/LayoutIntrinsics;", "", "Landroid/text/BoringLayout$Metrics;", ak.av, "Lkotlin/z;", "()Landroid/text/BoringLayout$Metrics;", "boringMetrics", "", "b", ak.aF, "()F", "minIntrinsicWidth", "maxIntrinsicWidth", "", "charSequence", "Landroid/text/TextPaint;", "textPaint", "", "textDirectionHeuristic", "<init>", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
@g
public final class LayoutIntrinsics {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f16249d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlin.z boringMetrics;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlin.z minIntrinsicWidth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlin.z maxIntrinsicWidth;

    public LayoutIntrinsics(@dl.d final CharSequence charSequence, @dl.d final TextPaint textPaint, final int i10) {
        kotlin.jvm.internal.f0.p(charSequence, "charSequence");
        kotlin.jvm.internal.f0.p(textPaint, "textPaint");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.boringMetrics = kotlin.b0.b(lazyThreadSafetyMode, new yh.a<BoringLayout.Metrics>() { // from class: androidx.compose.ui.text.android.LayoutIntrinsics$boringMetrics$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BoringLayout.Metrics invoke() {
                return c.f16302a.d(charSequence, textPaint, w0.h(i10));
            }
        });
        this.minIntrinsicWidth = kotlin.b0.b(lazyThreadSafetyMode, new yh.a<Float>() { // from class: androidx.compose.ui.text.android.LayoutIntrinsics$minIntrinsicWidth$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(m.c(charSequence, textPaint));
            }
        });
        this.maxIntrinsicWidth = kotlin.b0.b(lazyThreadSafetyMode, new yh.a<Float>() { // from class: androidx.compose.ui.text.android.LayoutIntrinsics$maxIntrinsicWidth$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                BoringLayout.Metrics metricsA = this.f16256b.a();
                Float fValueOf = metricsA != null ? Float.valueOf(metricsA.width) : null;
                if (fValueOf == null) {
                    CharSequence charSequence2 = charSequence;
                    fValueOf = Float.valueOf((float) Math.ceil(Layout.getDesiredWidth(charSequence2, 0, charSequence2.length(), textPaint)));
                }
                return m.e(fValueOf.floatValue(), charSequence, textPaint) ? Float.valueOf(fValueOf.floatValue() + 0.5f) : fValueOf;
            }
        });
    }

    @dl.e
    public final BoringLayout.Metrics a() {
        return (BoringLayout.Metrics) this.boringMetrics.getValue();
    }

    public final float b() {
        return ((Number) this.maxIntrinsicWidth.getValue()).floatValue();
    }

    public final float c() {
        return ((Number) this.minIntrinsicWidth.getValue()).floatValue();
    }
}
