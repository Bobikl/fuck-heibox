package n1;

import android.graphics.Paint;
import android.text.Layout;
import androidx.compose.ui.text.android.w0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: IndentationFixSpan.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u001e\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u001e\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¨\u0006\b"}, d2 = {"Landroid/text/Layout;", "", "lineIndex", "Landroid/graphics/Paint;", "paint", "", ak.av, ak.aF, "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final String f131941a = "…";

    /* JADX INFO: compiled from: IndentationFixSpan.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f131942a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            f131942a = iArr;
        }
    }

    public static final float a(@dl.d Layout layout, int i10, @dl.d Paint paint) {
        float fAbs;
        float width;
        f0.p(layout, "<this>");
        f0.p(paint, "paint");
        float lineLeft = layout.getLineLeft(i10);
        if (!w0.j(layout, i10) || layout.getParagraphDirection(i10) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float primaryHorizontal = (layout.getPrimaryHorizontal(layout.getLineStart(i10) + layout.getEllipsisStart(i10)) - lineLeft) + paint.measureText(f131941a);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
        if ((paragraphAlignment == null ? -1 : a.f131942a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - primaryHorizontal) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - primaryHorizontal;
        }
        return fAbs + width;
    }

    public static /* synthetic */ float b(Layout layout, int i10, Paint paint, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            paint = layout.getPaint();
            f0.o(paint, "this.paint");
        }
        return a(layout, i10, paint);
    }

    public static final float c(@dl.d Layout layout, int i10, @dl.d Paint paint) {
        float width;
        float width2;
        f0.p(layout, "<this>");
        f0.p(paint, "paint");
        if (!w0.j(layout, i10)) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i10) != -1 || layout.getWidth() >= layout.getLineRight(i10)) {
            return 0.0f;
        }
        float lineRight = (layout.getLineRight(i10) - layout.getPrimaryHorizontal(layout.getLineStart(i10) + layout.getEllipsisStart(i10))) + paint.measureText(f131941a);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
        if ((paragraphAlignment != null ? a.f131942a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i10);
            width2 = (layout.getWidth() - lineRight) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i10);
            width2 = layout.getWidth() - lineRight;
        }
        return width - width2;
    }

    public static /* synthetic */ float d(Layout layout, int i10, Paint paint, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            paint = layout.getPaint();
            f0.o(paint, "this.paint");
        }
        return c(layout, i10, paint);
    }
}
