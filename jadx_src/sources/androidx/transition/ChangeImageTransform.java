package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class ChangeImageTransform extends Transition {
    private static final String W = "android:changeImageTransform:matrix";
    private static final String X = "android:changeImageTransform:bounds";
    private static final String[] Y = {W, X};
    private static final TypeEvaluator<Matrix> Z = new a();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final Property<ImageView, Matrix> f27662a0 = new b(Matrix.class, "animatedTransform");

    public class a implements TypeEvaluator<Matrix> {
        a() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    public class b extends Property<ImageView, Matrix> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(ImageView imageView, Matrix matrix) {
            j.a(imageView, matrix);
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27663a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f27663a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27663a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ChangeImageTransform() {
    }

    public ChangeImageTransform(@androidx.annotation.n0 Context context, @androidx.annotation.n0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void I0(z zVar) {
        View view = zVar.f27974b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            Map<String, Object> map = zVar.f27973a;
            map.put(X, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            map.put(W, K0(imageView));
        }
    }

    private static Matrix J0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = imageView.getWidth();
        float f10 = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = imageView.getHeight();
        float f11 = intrinsicHeight;
        float fMax = Math.max(width / f10, height / f11);
        int iRound = Math.round((width - (f10 * fMax)) / 2.0f);
        int iRound2 = Math.round((height - (f11 * fMax)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(fMax, fMax);
        matrix.postTranslate(iRound, iRound2);
        return matrix;
    }

    @androidx.annotation.n0
    private static Matrix K0(@androidx.annotation.n0 ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            return new Matrix(imageView.getImageMatrix());
        }
        int i10 = c.f27663a[imageView.getScaleType().ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? new Matrix(imageView.getImageMatrix()) : J0(imageView);
        }
        return N0(imageView);
    }

    private ObjectAnimator L0(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) f27662a0, (TypeEvaluator) new y.a(), (Object[]) new Matrix[]{matrix, matrix2});
    }

    @androidx.annotation.n0
    private ObjectAnimator M0(@androidx.annotation.n0 ImageView imageView) {
        Property<ImageView, Matrix> property = f27662a0;
        TypeEvaluator<Matrix> typeEvaluator = Z;
        Matrix matrix = k.f27882a;
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, (TypeEvaluator) typeEvaluator, (Object[]) new Matrix[]{matrix, matrix});
    }

    private static Matrix N0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(imageView.getWidth() / drawable.getIntrinsicWidth(), imageView.getHeight() / drawable.getIntrinsicHeight());
        return matrix;
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.n0
    public String[] Y() {
        return Y;
    }

    @Override // androidx.transition.Transition
    public void j(@androidx.annotation.n0 z zVar) {
        I0(zVar);
    }

    @Override // androidx.transition.Transition
    public void m(@androidx.annotation.n0 z zVar) {
        I0(zVar);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.p0
    public Animator q(@androidx.annotation.n0 ViewGroup viewGroup, @androidx.annotation.p0 z zVar, @androidx.annotation.p0 z zVar2) {
        if (zVar == null || zVar2 == null) {
            return null;
        }
        Rect rect = (Rect) zVar.f27973a.get(X);
        Rect rect2 = (Rect) zVar2.f27973a.get(X);
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) zVar.f27973a.get(W);
        Matrix matrix2 = (Matrix) zVar2.f27973a.get(W);
        boolean z10 = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z10) {
            return null;
        }
        ImageView imageView = (ImageView) zVar2.f27974b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return M0(imageView);
        }
        if (matrix == null) {
            matrix = k.f27882a;
        }
        if (matrix2 == null) {
            matrix2 = k.f27882a;
        }
        f27662a0.set(imageView, matrix);
        return L0(imageView, matrix, matrix2);
    }
}
