package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: compiled from: TransitionUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f27963a = 1048576;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f27964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f27965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f27966d;

    /* JADX INFO: compiled from: TransitionUtils.java */
    public static class a implements TypeEvaluator<Matrix> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float[] f27967a = new float[9];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float[] f27968b = new float[9];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Matrix f27969c = new Matrix();

        a() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            matrix.getValues(this.f27967a);
            matrix2.getValues(this.f27968b);
            for (int i10 = 0; i10 < 9; i10++) {
                float[] fArr = this.f27968b;
                float f11 = fArr[i10];
                float f12 = this.f27967a[i10];
                fArr[i10] = f12 + ((f11 - f12) * f10);
            }
            this.f27969c.setValues(this.f27968b);
            return this.f27969c;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f27964b = true;
        f27965c = true;
        f27966d = i10 >= 28;
    }

    private y() {
    }

    static View a(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        l0.j(view, matrix);
        l0.k(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int iRound = Math.round(rectF.left);
        int iRound2 = Math.round(rectF.top);
        int iRound3 = Math.round(rectF.right);
        int iRound4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap bitmapB = b(view, matrix, rectF, viewGroup);
        if (bitmapB != null) {
            imageView.setImageBitmap(bitmapB);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
        imageView.layout(iRound, iRound2, iRound3, iRound4);
        return imageView;
    }

    private static Bitmap b(View view, Matrix matrix, RectF rectF, ViewGroup viewGroup) {
        boolean z10;
        boolean zIsAttachedToWindow;
        int iIndexOfChild;
        ViewGroup viewGroup2;
        if (f27964b) {
            z10 = !view.isAttachedToWindow();
            zIsAttachedToWindow = viewGroup == null ? false : viewGroup.isAttachedToWindow();
        } else {
            z10 = false;
            zIsAttachedToWindow = false;
        }
        boolean z11 = f27965c;
        Bitmap bitmapCreateBitmap = null;
        if (!z11 || !z10) {
            iIndexOfChild = 0;
            viewGroup2 = null;
        } else {
            if (!zIsAttachedToWindow) {
                return null;
            }
            viewGroup2 = (ViewGroup) view.getParent();
            iIndexOfChild = viewGroup2.indexOfChild(view);
            viewGroup.getOverlay().add(view);
        }
        int iRound = Math.round(rectF.width());
        int iRound2 = Math.round(rectF.height());
        if (iRound > 0 && iRound2 > 0) {
            float fMin = Math.min(1.0f, 1048576.0f / (iRound * iRound2));
            int iRound3 = Math.round(iRound * fMin);
            int iRound4 = Math.round(iRound2 * fMin);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(fMin, fMin);
            if (f27966d) {
                Picture picture = new Picture();
                Canvas canvasBeginRecording = picture.beginRecording(iRound3, iRound4);
                canvasBeginRecording.concat(matrix);
                view.draw(canvasBeginRecording);
                picture.endRecording();
                bitmapCreateBitmap = Bitmap.createBitmap(picture);
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(iRound3, iRound4, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.concat(matrix);
                view.draw(canvas);
            }
        }
        if (z11 && z10) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, iIndexOfChild);
        }
        return bitmapCreateBitmap;
    }

    static Animator c(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}
