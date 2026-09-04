package androidx.compose.foundation.text.selection;

import androidx.compose.ui.graphics.d0;
import androidx.compose.ui.graphics.y0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidSelectionHandles.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0003\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/text/selection/c;", "", "Landroidx/compose/ui/graphics/y0;", "b", "Landroidx/compose/ui/graphics/y0;", ak.aF, "()Landroidx/compose/ui/graphics/y0;", "f", "(Landroidx/compose/ui/graphics/y0;)V", "imageBitmap", "Landroidx/compose/ui/graphics/d0;", "Landroidx/compose/ui/graphics/d0;", ak.av, "()Landroidx/compose/ui/graphics/d0;", "d", "(Landroidx/compose/ui/graphics/d0;)V", "canvas", "Landroidx/compose/ui/graphics/drawscope/a;", "Landroidx/compose/ui/graphics/drawscope/a;", "()Landroidx/compose/ui/graphics/drawscope/a;", "e", "(Landroidx/compose/ui/graphics/drawscope/a;)V", "canvasDrawScope", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final c f8353a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private static y0 imageBitmap;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private static d0 canvas;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private static androidx.compose.ui.graphics.drawscope.a canvasDrawScope;

    private c() {
    }

    @dl.e
    public final d0 a() {
        return canvas;
    }

    @dl.e
    public final androidx.compose.ui.graphics.drawscope.a b() {
        return canvasDrawScope;
    }

    @dl.e
    public final y0 c() {
        return imageBitmap;
    }

    public final void d(@dl.e d0 d0Var) {
        canvas = d0Var;
    }

    public final void e(@dl.e androidx.compose.ui.graphics.drawscope.a aVar) {
        canvasDrawScope = aVar;
    }

    public final void f(@dl.e y0 y0Var) {
        imageBitmap = y0Var;
    }
}
