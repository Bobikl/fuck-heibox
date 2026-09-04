package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: CanvasUtils.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(29)
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/j0;", "", "Landroid/graphics/Canvas;", "canvas", "", "enable", "Lkotlin/b2;", ak.av, "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final j0 f13873a = new j0();

    private j0() {
    }

    @androidx.annotation.u
    public final void a(@dl.d Canvas canvas, boolean z10) {
        kotlin.jvm.internal.f0.p(canvas, "canvas");
        if (z10) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
