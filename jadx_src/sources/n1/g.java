package n1;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LineHeightSpan.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J8\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016R\u0017\u0010\b\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Ln1/g;", "Landroid/text/style/LineHeightSpan;", "", "text", "", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "spanstartVertical", "lineHeight", "Landroid/graphics/Paint$FontMetricsInt;", "fontMetricsInt", "Lkotlin/b2;", "chooseHeight", "", "F", ak.av, "()F", "<init>", "(F)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
@androidx.compose.ui.text.android.g
public final class g implements LineHeightSpan {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f131947c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f131948b;

    public g(float f10) {
        this.f131948b = f10;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getF131948b() {
        return this.f131948b;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(@dl.d CharSequence text, int i10, int i11, int i12, int i13, @dl.d Paint.FontMetricsInt fontMetricsInt) {
        f0.p(text, "text");
        f0.p(fontMetricsInt, "fontMetricsInt");
        int iA = i.a(fontMetricsInt);
        if (iA <= 0) {
            return;
        }
        int iCeil = (int) Math.ceil(this.f131948b);
        int iCeil2 = (int) Math.ceil(((double) fontMetricsInt.descent) * ((double) ((iCeil * 1.0f) / iA)));
        fontMetricsInt.descent = iCeil2;
        fontMetricsInt.ascent = iCeil2 - iCeil;
    }
}
