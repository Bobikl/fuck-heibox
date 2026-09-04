package n1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FontFeatureSpan.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Ln1/b;", "Landroid/text/style/MetricAffectingSpan;", "Landroid/text/TextPaint;", "textPaint", "Lkotlin/b2;", "updateMeasureState", "updateDrawState", "", "fontFeatureSettings", "Ljava/lang/String;", ak.av, "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
@androidx.compose.ui.text.android.g
public final class b extends MetricAffectingSpan {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f131938c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final String f131939b;

    public b(@dl.d String fontFeatureSettings) {
        f0.p(fontFeatureSettings, "fontFeatureSettings");
        this.f131939b = fontFeatureSettings;
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF131939b() {
        return this.f131939b;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@dl.d TextPaint textPaint) {
        f0.p(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f131939b);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@dl.d TextPaint textPaint) {
        f0.p(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f131939b);
    }
}
