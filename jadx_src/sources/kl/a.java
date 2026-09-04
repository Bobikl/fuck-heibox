package kl;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.n0;
import androidx.annotation.x;

/* JADX INFO: compiled from: CornerRadiusTransform.java */
/* JADX INFO: loaded from: classes5.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f124470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Shader f124471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f124472c = new RectF();

    public a(@x(from = 0.0d) float f10) {
        f(f10);
    }

    private void f(@x(from = 0.0d) float f10) {
        float fMax = Math.max(0.0f, f10);
        if (fMax != this.f124470a) {
            this.f124470a = fMax;
            this.f124471b = null;
        }
    }

    @Override // kl.b
    public void a(Canvas canvas, Paint paint, Bitmap bitmap) {
        if (this.f124470a == 0.0f) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f124472c, paint);
            return;
        }
        if (this.f124471b == null) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f124471b = new BitmapShader(bitmap, tileMode, tileMode);
            Matrix matrix = new Matrix();
            RectF rectF = this.f124472c;
            matrix.setTranslate(rectF.left, rectF.top);
            matrix.preScale(this.f124472c.width() / bitmap.getWidth(), this.f124472c.height() / bitmap.getHeight());
            this.f124471b.setLocalMatrix(matrix);
        }
        paint.setShader(this.f124471b);
        RectF rectF2 = this.f124472c;
        float f10 = this.f124470a;
        canvas.drawRoundRect(rectF2, f10, f10, paint);
    }

    @Override // kl.b
    public void b(Rect rect) {
        this.f124472c.set(rect);
        this.f124471b = null;
    }

    @n0
    public RectF c() {
        return this.f124472c;
    }

    @x(from = 0.0d)
    public float d() {
        return this.f124470a;
    }

    public void e(@x(from = 0.0d) float f10) {
        f(f10);
    }
}
