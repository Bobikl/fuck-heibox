package n1;

import android.graphics.Paint;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LineHeightStyleSpan.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"Landroid/graphics/Paint$FontMetricsInt;", "", ak.av, "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class i {
    public static final int a(@dl.d Paint.FontMetricsInt fontMetricsInt) {
        f0.p(fontMetricsInt, "<this>");
        return fontMetricsInt.descent - fontMetricsInt.ascent;
    }
}
