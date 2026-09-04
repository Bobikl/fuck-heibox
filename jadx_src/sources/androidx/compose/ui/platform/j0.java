package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(29)
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/platform/j0;", "Landroidx/compose/ui/platform/g0;", "Landroid/view/View;", sd.b.f139384b, "Landroidx/compose/ui/graphics/c1;", "matrix", "Lkotlin/b2;", ak.av, "(Landroid/view/View;[F)V", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "tmpMatrix", "", "b", "[I", "tmpPosition", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class j0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Matrix tmpMatrix = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final int[] tmpPosition = new int[2];

    @Override // androidx.compose.ui.platform.g0
    @androidx.annotation.u
    public void a(@dl.d View view, @dl.d float[] matrix) {
        kotlin.jvm.internal.f0.p(view, "view");
        kotlin.jvm.internal.f0.p(matrix, "matrix");
        this.tmpMatrix.reset();
        view.transformMatrixToGlobal(this.tmpMatrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        view.getLocationOnScreen(this.tmpPosition);
        int[] iArr = this.tmpPosition;
        int i10 = iArr[0];
        int i11 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.tmpPosition;
        this.tmpMatrix.postTranslate(iArr2[0] - i10, iArr2[1] - i11);
        androidx.compose.ui.graphics.g.b(matrix, this.tmpMatrix);
    }
}
