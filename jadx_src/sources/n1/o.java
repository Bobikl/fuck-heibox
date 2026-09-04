package n1;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TypefaceSpan.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Ln1/o;", "Landroid/text/style/MetricAffectingSpan;", "Landroid/graphics/Paint;", "paint", "Lkotlin/b2;", "b", "Landroid/text/TextPaint;", "ds", "updateDrawState", "updateMeasureState", "Landroid/graphics/Typeface;", "typeface", "Landroid/graphics/Typeface;", ak.av, "()Landroid/graphics/Typeface;", "<init>", "(Landroid/graphics/Typeface;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
@androidx.compose.ui.text.android.g
public final class o extends MetricAffectingSpan {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f131994c = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Typeface f131995b;

    public o(@dl.d Typeface typeface) {
        f0.p(typeface, "typeface");
        this.f131995b = typeface;
    }

    private final void b(Paint paint) {
        paint.setTypeface(this.f131995b);
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Typeface getF131995b() {
        return this.f131995b;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@dl.d TextPaint ds) {
        f0.p(ds, "ds");
        b(ds);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@dl.d TextPaint paint) {
        f0.p(paint, "paint");
        b(paint);
    }
}
