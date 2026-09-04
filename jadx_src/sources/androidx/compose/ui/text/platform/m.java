package androidx.compose.ui.text.platform;

import android.graphics.Paint;
import android.text.TextPaint;
import androidx.compose.ui.graphics.j2;
import androidx.compose.ui.graphics.k2;
import com.umeng.analytics.pro.ak;
import fi.u;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AndroidTextPaint.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0014\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Landroidx/compose/ui/graphics/k2;", "Landroid/graphics/Paint$Join;", "e", "(I)Landroid/graphics/Paint$Join;", "Landroidx/compose/ui/graphics/j2;", "Landroid/graphics/Paint$Cap;", "d", "(I)Landroid/graphics/Paint$Cap;", "Landroid/text/TextPaint;", "", "alpha", "Lkotlin/b2;", ak.aF, "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class m {
    public static final void c(@dl.d TextPaint textPaint, float f10) {
        f0.p(textPaint, "<this>");
        if (Float.isNaN(f10)) {
            return;
        }
        textPaint.setAlpha(di.d.L0(u.H(f10, 0.0f, 1.0f) * 255));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint.Cap d(int i10) {
        j2.Companion companion = j2.INSTANCE;
        if (j2.g(i10, companion.a())) {
            return Paint.Cap.BUTT;
        }
        if (j2.g(i10, companion.b())) {
            return Paint.Cap.ROUND;
        }
        return j2.g(i10, companion.c()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint.Join e(int i10) {
        k2.Companion companion = k2.INSTANCE;
        if (k2.g(i10, companion.b())) {
            return Paint.Join.MITER;
        }
        if (k2.g(i10, companion.c())) {
            return Paint.Join.ROUND;
        }
        return k2.g(i10, companion.a()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }
}
