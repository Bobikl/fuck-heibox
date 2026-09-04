package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: PaintExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(29)
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/android/o;", "", "Landroid/graphics/Paint;", "paint", "", "text", "", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "Landroid/graphics/Rect;", "rect", "Lkotlin/b2;", ak.av, "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final o f16351a = new o();

    private o() {
    }

    @androidx.annotation.u
    @xh.m
    public static final void a(@dl.d Paint paint, @dl.d CharSequence text, int i10, int i11, @dl.d Rect rect) {
        kotlin.jvm.internal.f0.p(paint, "paint");
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(rect, "rect");
        paint.getTextBounds(text, i10, i11, rect);
    }
}
