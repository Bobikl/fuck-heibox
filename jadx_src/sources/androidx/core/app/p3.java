package androidx.core.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: SharedElementCallback.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class p3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f20355b = 1048576;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f20356c = "sharedElement:snapshot:bitmap";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f20357d = "sharedElement:snapshot:imageScaleType";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f20358e = "sharedElement:snapshot:imageMatrix";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Matrix f20359a;

    /* JADX INFO: compiled from: SharedElementCallback.java */
    public interface a {
        void onSharedElementsReady();
    }

    private static Bitmap a(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return null;
        }
        float fMin = Math.min(1.0f, 1048576.0f / (intrinsicWidth * intrinsicHeight));
        if ((drawable instanceof BitmapDrawable) && fMin == 1.0f) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int i10 = (int) (intrinsicWidth * fMin);
        int i11 = (int) (intrinsicHeight * fMin);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect bounds = drawable.getBounds();
        int i12 = bounds.left;
        int i13 = bounds.top;
        int i14 = bounds.right;
        int i15 = bounds.bottom;
        drawable.setBounds(0, 0, i10, i11);
        drawable.draw(canvas);
        drawable.setBounds(i12, i13, i14, i15);
        return bitmapCreateBitmap;
    }

    public Parcelable b(View view, Matrix matrix, RectF rectF) {
        Bitmap bitmapA;
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            Drawable drawable = imageView.getDrawable();
            Drawable background = imageView.getBackground();
            if (drawable != null && background == null && (bitmapA = a(drawable)) != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(f20356c, bitmapA);
                bundle.putString(f20357d, imageView.getScaleType().toString());
                if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                    float[] fArr = new float[9];
                    imageView.getImageMatrix().getValues(fArr);
                    bundle.putFloatArray(f20358e, fArr);
                }
                return bundle;
            }
        }
        int iRound = Math.round(rectF.width());
        int iRound2 = Math.round(rectF.height());
        if (iRound <= 0 || iRound2 <= 0) {
            return null;
        }
        float fMin = Math.min(1.0f, 1048576.0f / (iRound * iRound2));
        int i10 = (int) (iRound * fMin);
        int i11 = (int) (iRound2 * fMin);
        if (this.f20359a == null) {
            this.f20359a = new Matrix();
        }
        this.f20359a.set(matrix);
        this.f20359a.postTranslate(-rectF.left, -rectF.top);
        this.f20359a.postScale(fMin, fMin);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.concat(this.f20359a);
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    public View c(Context context, Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            if (!(parcelable instanceof Bitmap)) {
                return null;
            }
            ImageView imageView = new ImageView(context);
            imageView.setImageBitmap((Bitmap) parcelable);
            return imageView;
        }
        Bundle bundle = (Bundle) parcelable;
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f20356c);
        if (bitmap == null) {
            return null;
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageBitmap(bitmap);
        imageView2.setScaleType(ImageView.ScaleType.valueOf(bundle.getString(f20357d)));
        if (imageView2.getScaleType() != ImageView.ScaleType.MATRIX) {
            return imageView2;
        }
        float[] floatArray = bundle.getFloatArray(f20358e);
        Matrix matrix = new Matrix();
        matrix.setValues(floatArray);
        imageView2.setImageMatrix(matrix);
        return imageView2;
    }

    public void d(List<String> list, Map<String, View> map) {
    }

    public void e(List<View> list) {
    }

    public void f(List<String> list, List<View> list2, List<View> list3) {
    }

    public void g(List<String> list, List<View> list2, List<View> list3) {
    }

    public void h(List<String> list, List<View> list2, a aVar) {
        aVar.onSharedElementsReady();
    }
}
