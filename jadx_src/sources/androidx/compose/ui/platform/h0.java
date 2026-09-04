package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0010\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\bR\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u001d\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/platform/h0;", "Landroidx/compose/ui/platform/g0;", "Landroid/view/View;", sd.b.f139384b, "Landroidx/compose/ui/graphics/c1;", "matrix", "Lkotlin/b2;", "d", "(Landroid/view/View;[F)V", "Landroid/graphics/Matrix;", "other", "b", "([FLandroid/graphics/Matrix;)V", "", "x", "y", ak.aF, "([FFF)V", ak.av, "", "[I", "tmpLocation", "[F", "tmpMatrix", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class h0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final int[] tmpLocation = new int[2];

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final float[] tmpMatrix = androidx.compose.ui.graphics.c1.c(null, 1, null);

    private final void b(float[] fArr, Matrix matrix) {
        androidx.compose.ui.graphics.g.b(this.tmpMatrix, matrix);
        AndroidComposeView_androidKt.h(fArr, this.tmpMatrix);
    }

    private final void c(float[] fArr, float f10, float f11) {
        androidx.compose.ui.graphics.c1.m(this.tmpMatrix);
        androidx.compose.ui.graphics.c1.x(this.tmpMatrix, f10, f11, 0.0f, 4, null);
        AndroidComposeView_androidKt.h(fArr, this.tmpMatrix);
    }

    private final void d(View view, float[] matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            d((View) parent, matrix);
            c(matrix, -view.getScrollX(), -view.getScrollY());
            c(matrix, view.getLeft(), view.getTop());
        } else {
            int[] iArr = this.tmpLocation;
            view.getLocationInWindow(iArr);
            c(matrix, -view.getScrollX(), -view.getScrollY());
            c(matrix, iArr[0], iArr[1]);
        }
        Matrix viewMatrix = view.getMatrix();
        if (viewMatrix.isIdentity()) {
            return;
        }
        kotlin.jvm.internal.f0.o(viewMatrix, "viewMatrix");
        b(matrix, viewMatrix);
    }

    @Override // androidx.compose.ui.platform.g0
    public void a(@dl.d View view, @dl.d float[] matrix) {
        kotlin.jvm.internal.f0.p(view, "view");
        kotlin.jvm.internal.f0.p(matrix, "matrix");
        androidx.compose.ui.graphics.c1.m(matrix);
        d(view, matrix);
    }
}
