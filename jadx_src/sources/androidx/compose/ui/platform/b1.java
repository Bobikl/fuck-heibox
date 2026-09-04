package androidx.compose.ui.platform;

import android.graphics.Matrix;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: LayerMatrixCache.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B?\u00126\u0010\u001f\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00030\u001b¢\u0006\u0004\b \u0010!J\u0006\u0010\u0004\u001a\u00020\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\bR\u0018\u0010\f\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000bR!\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR!\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, d2 = {"Landroidx/compose/ui/platform/b1;", androidx.exifinterface.media.a.f23244d5, "", "Lkotlin/b2;", ak.aF, "target", "Landroidx/compose/ui/graphics/c1;", "b", "(Ljava/lang/Object;)[F", ak.av, "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "androidMatrixCache", "previousAndroidMatrix", "d", "[F", "matrixCache", "e", "inverseMatrixCache", "", "f", "Z", "isDirty", "g", "isInverseDirty", RXScreenCaptureService.KEY_HEIGHT, "isInverseValid", "Lkotlin/Function2;", "Lkotlin/m0;", "name", "matrix", "getMatrix", "<init>", "(Lyh/p;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class b1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final yh.p<T, Matrix, kotlin.b2> f15817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Matrix androidMatrixCache;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Matrix previousAndroidMatrix;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private float[] matrixCache;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private float[] inverseMatrixCache;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isDirty;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isInverseDirty;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isInverseValid;

    /* JADX WARN: Multi-variable type inference failed */
    public b1(@dl.d yh.p<? super T, ? super Matrix, kotlin.b2> getMatrix) {
        kotlin.jvm.internal.f0.p(getMatrix, "getMatrix");
        this.f15817a = getMatrix;
        this.isDirty = true;
        this.isInverseDirty = true;
        this.isInverseValid = true;
    }

    @dl.e
    public final float[] a(T target) {
        float[] fArrC = this.inverseMatrixCache;
        if (fArrC == null) {
            fArrC = androidx.compose.ui.graphics.c1.c(null, 1, null);
            this.inverseMatrixCache = fArrC;
        }
        if (this.isInverseDirty) {
            this.isInverseValid = z0.a(b(target), fArrC);
            this.isInverseDirty = false;
        }
        if (this.isInverseValid) {
            return fArrC;
        }
        return null;
    }

    @dl.d
    public final float[] b(T target) {
        float[] fArrC = this.matrixCache;
        if (fArrC == null) {
            fArrC = androidx.compose.ui.graphics.c1.c(null, 1, null);
            this.matrixCache = fArrC;
        }
        if (!this.isDirty) {
            return fArrC;
        }
        Matrix matrix = this.androidMatrixCache;
        if (matrix == null) {
            matrix = new Matrix();
            this.androidMatrixCache = matrix;
        }
        this.f15817a.invoke(target, matrix);
        Matrix matrix2 = this.previousAndroidMatrix;
        if (matrix2 == null || !kotlin.jvm.internal.f0.g(matrix, matrix2)) {
            androidx.compose.ui.graphics.g.b(fArrC, matrix);
            this.androidMatrixCache = matrix2;
            this.previousAndroidMatrix = matrix;
        }
        this.isDirty = false;
        return fArrC;
    }

    public final void c() {
        this.isDirty = true;
        this.isInverseDirty = true;
    }
}
