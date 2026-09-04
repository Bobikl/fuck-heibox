package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidCanvas.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\"\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007\"\u0019\u0010\f\u001a\u00060\u0004j\u0002`\t*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b*\n\u0010\r\"\u00020\u00042\u00020\u0004¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/graphics/y0;", "image", "Landroidx/compose/ui/graphics/d0;", ak.av, "Landroid/graphics/Canvas;", ak.aF, "b", "Landroid/graphics/Canvas;", "EmptyCanvas", "Landroidx/compose/ui/graphics/NativeCanvas;", "d", "(Landroidx/compose/ui/graphics/d0;)Landroid/graphics/Canvas;", "nativeCanvas", "NativeCanvas", "ui-graphics_release"}, k = 2, mv = {1, 7, 1})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final Canvas f13681a = new Canvas();

    @dl.d
    public static final d0 a(@dl.d y0 image) {
        kotlin.jvm.internal.f0.p(image, "image");
        b bVar = new b();
        bVar.K(new Canvas(f.b(image)));
        return bVar;
    }

    @dl.d
    public static final d0 b(@dl.d Canvas c10) {
        kotlin.jvm.internal.f0.p(c10, "c");
        b bVar = new b();
        bVar.K(c10);
        return bVar;
    }

    @dl.d
    public static final Canvas d(@dl.d d0 d0Var) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        return ((b) d0Var).I();
    }
}
