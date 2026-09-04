package androidx.compose.ui.graphics;

import android.graphics.Paint;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidPaint.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(29)
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Landroidx/compose/ui/graphics/s2;", "", "Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/NativePaint;", "paint", "Landroidx/compose/ui/graphics/x;", "mode", "Lkotlin/b2;", ak.av, "(Landroid/graphics/Paint;I)V", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final s2 f14005a = new s2();

    private s2() {
    }

    @androidx.annotation.u
    public final void a(@dl.d Paint paint, int mode) {
        kotlin.jvm.internal.f0.p(paint, "paint");
        paint.setBlendMode(a.b(mode));
    }
}
