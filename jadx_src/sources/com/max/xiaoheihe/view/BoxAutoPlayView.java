package com.max.xiaoheihe.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes13.dex */
public class BoxAutoPlayView extends View {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Drawable f95794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f95795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f95796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f95797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ValueAnimator f95798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f95799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f95800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f95801i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f95802j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f95803k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f95804l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f95805m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f95806n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Path f95807o;

    public BoxAutoPlayView(Context context) {
        this(context, null);
    }

    public BoxAutoPlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BoxAutoPlayView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f95799g = true;
        this.f95800h = false;
        this.f95801i = false;
        this.f95805m = 0;
        this.f95806n = 5;
        this.f95807o = new Path();
        getContext().getTheme().obtainStyledAttributes(attributeSet, R.styleable.U, 0, 0);
    }

    public BoxAutoPlayView(Context context, boolean z10, int i10, int i11, int i12) {
        super(context);
        this.f95799g = true;
        this.f95800h = false;
        this.f95801i = false;
        this.f95805m = 0;
        this.f95806n = 5;
        this.f95807o = new Path();
        this.f95799g = z10;
        this.f95802j = i10;
        try {
            c(i11, i12);
            e();
        } catch (Exception e10) {
            com.max.hbcommon.utils.d.b("cqtest", e10.toString());
        }
    }

    public static Bitmap b(int i10, Bitmap bitmap) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), bitmap}, null, changeQuickRedirect, true, 49373, new Class[]{Integer.TYPE, Bitmap.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        int width = ((i10 + bitmap.getWidth()) - 1) / bitmap.getWidth();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth() * width, bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        for (int i11 = 0; i11 < width; i11++) {
            canvas.drawBitmap(bitmap, bitmap.getWidth() * i11, 0.0f, (Paint) null);
        }
        return bitmapCreateBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(ValueAnimator valueAnimator) {
        if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, 49378, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }

    public void c(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49370, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        Drawable drawable = getResources().getDrawable(this.f95802j);
        this.f95794b = drawable;
        if (i10 <= 0) {
            i10 = drawable.getMinimumHeight();
        }
        this.f95803k = i10;
        this.f95804l = i11;
        this.f95795c = this.f95794b.getMinimumWidth();
        this.f95796d = this.f95794b.getMinimumHeight();
        Log.d("BoxAutoPlayView", "mHeight:" + this.f95803k + " drawableHeight:" + this.f95796d + " mWidth:" + this.f95804l + " drawableWidth:" + this.f95795c);
        if (this.f95799g) {
            if (this.f95800h) {
                this.f95797e = this.f95795c / 2;
            } else {
                this.f95797e = this.f95795c - i11;
            }
            this.f95794b.setBounds(0, 0, this.f95795c, Math.max(this.f95796d, this.f95803k));
        } else {
            int i12 = i11 - this.f95795c;
            this.f95797e = i12;
            this.f95794b.setBounds(i12, 0, i11, Math.max(this.f95796d, this.f95803k));
        }
        if (this.f95805m == 0) {
            this.f95805m = ViewUtils.f(getContext(), 1.0f);
        }
    }

    public void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49375, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!isAttachedToWindow()) {
            this.f95801i = true;
            return;
        }
        ValueAnimator valueAnimator = this.f95798f;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, this.f95797e);
            this.f95798f = valueAnimatorOfInt;
            valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
            this.f95798f.setRepeatCount(-1);
            this.f95798f.setDuration(5000L);
            this.f95798f.setRepeatMode(1);
            this.f95798f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.max.xiaoheihe.view.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f95909b.d(valueAnimator2);
                }
            });
            this.f95798f.start();
        }
    }

    public void f() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49376, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f95801i = false;
        ValueAnimator valueAnimator = this.f95798f;
        if (valueAnimator != null && valueAnimator.isRunning() && this.f95798f.isStarted()) {
            this.f95798f.cancel();
        }
    }

    public int getRadius() {
        return this.f95805m;
    }

    public int getRadiusZone() {
        return this.f95806n;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49374, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        if (this.f95801i) {
            e();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49377, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ValueAnimator valueAnimator = this.f95798f;
        if (valueAnimator != null) {
            if (valueAnimator.isRunning() || this.f95798f.isStarted() || this.f95798f.isPaused()) {
                this.f95798f.removeAllUpdateListeners();
                this.f95798f.removeAllListeners();
                this.f95798f.cancel();
            }
            this.f95798f = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, 49372, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        canvas.save();
        int scrollX = getScrollX();
        this.f95807o.reset();
        this.f95807o.addRoundRect(new RectF(scrollX, 0.0f, scrollX + this.f95804l, this.f95803k), q.I(this.f95805m, this.f95806n), Path.Direction.CCW);
        canvas.clipPath(this.f95807o);
        Drawable drawable = this.f95794b;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49371, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode == 1073741824 && mode2 == 1073741824) {
            super.onMeasure(i10, i11);
            return;
        }
        try {
            setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(this.f95804l, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f95803k, 1073741824));
        } catch (Exception e10) {
            com.max.hbcommon.utils.d.b("cqtest", e10.toString());
        }
    }

    public void setDoublePicture(boolean z10) {
        this.f95800h = z10;
    }

    public void setRadius(int i10) {
        this.f95805m = i10;
    }

    public void setRadiusZone(int i10) {
        this.f95806n = i10;
    }

    public void setmResId(int i10) {
        this.f95802j = i10;
    }

    public void setmScrollltr(boolean z10) {
        this.f95799g = z10;
    }
}
