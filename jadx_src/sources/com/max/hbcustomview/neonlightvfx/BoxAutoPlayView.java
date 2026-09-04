package com.max.hbcustomview.neonlightvfx;

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
import bb.c;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes10.dex */
public class BoxAutoPlayView extends View {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Drawable f69189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f69190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f69191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f69192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ValueAnimator f69193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f69194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f69195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f69196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f69197j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f69198k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f69199l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f69200m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Path f69201n;

    public BoxAutoPlayView(Context context) {
        this(context, null);
    }

    public BoxAutoPlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BoxAutoPlayView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f69194g = true;
        this.f69195h = false;
        this.f69199l = 0;
        this.f69200m = 5;
        this.f69201n = new Path();
    }

    public BoxAutoPlayView(Context context, boolean z10, int i10, int i11, int i12) {
        super(context);
        this.f69194g = true;
        this.f69195h = false;
        this.f69199l = 0;
        this.f69200m = 5;
        this.f69201n = new Path();
        this.f69194g = z10;
        this.f69196i = i10;
        try {
            c(i11, i12);
            e();
        } catch (Exception e10) {
            Log.d("cqtest", e10.toString());
        }
    }

    public static Bitmap b(int i10, Bitmap bitmap) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), bitmap}, null, changeQuickRedirect, true, c.f.f32386kl, new Class[]{Integer.TYPE, Bitmap.class}, Bitmap.class);
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
        if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, c.f.f32478ol, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }

    public void c(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.f32317hl, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        Drawable drawable = getResources().getDrawable(this.f69196i);
        this.f69189b = drawable;
        if (i10 <= 0) {
            i10 = drawable.getMinimumHeight();
        }
        this.f69197j = i10;
        this.f69198k = i11;
        this.f69190c = this.f69189b.getMinimumWidth();
        this.f69191d = this.f69189b.getMinimumHeight();
        Log.d("BoxAutoPlayView", "mHeight:" + this.f69197j + " drawableHeight:" + this.f69191d + " mWidth:" + this.f69198k + " drawableWidth:" + this.f69190c);
        if (this.f69194g) {
            if (this.f69195h) {
                this.f69192e = this.f69190c / 2;
            } else {
                this.f69192e = this.f69190c - i11;
            }
            this.f69189b.setBounds(0, 0, this.f69190c, Math.max(this.f69191d, this.f69197j));
        } else {
            int i12 = i11 - this.f69190c;
            this.f69192e = i12;
            this.f69189b.setBounds(i12, 0, i11, Math.max(this.f69191d, this.f69197j));
        }
        if (this.f69199l == 0) {
            this.f69199l = ViewUtils.f(getContext(), 1.0f);
        }
    }

    public void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.f32409ll, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ValueAnimator valueAnimator = this.f69193f;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, this.f69192e);
            this.f69193f = valueAnimatorOfInt;
            valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
            this.f69193f.setRepeatCount(-1);
            this.f69193f.setDuration(5000L);
            this.f69193f.setRepeatMode(1);
            this.f69193f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.max.hbcustomview.neonlightvfx.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f69202b.d(valueAnimator2);
                }
            });
            this.f69193f.start();
        }
    }

    public void f() {
        ValueAnimator valueAnimator;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.f32432ml, new Class[0], Void.TYPE).isSupported && (valueAnimator = this.f69193f) != null && valueAnimator.isRunning() && this.f69193f.isStarted()) {
            this.f69193f.cancel();
        }
    }

    public int getRadius() {
        return this.f69199l;
    }

    public int getRadiusZone() {
        return this.f69200m;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.f32455nl, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ValueAnimator valueAnimator = this.f69193f;
        if (valueAnimator != null) {
            if (valueAnimator.isRunning() || this.f69193f.isStarted() || this.f69193f.isPaused()) {
                this.f69193f.removeAllUpdateListeners();
                this.f69193f.removeAllListeners();
                this.f69193f.cancel();
            }
            this.f69193f = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, c.f.f32363jl, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        canvas.save();
        int scrollX = getScrollX();
        this.f69201n.reset();
        this.f69201n.addRoundRect(new RectF(scrollX, 0.0f, scrollX + this.f69198k, this.f69197j), q.I(this.f69199l, this.f69200m), Path.Direction.CCW);
        canvas.clipPath(this.f69201n);
        Drawable drawable = this.f69189b;
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
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.f32339il, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode == 1073741824 && mode2 == 1073741824) {
            super.onMeasure(i10, i11);
            return;
        }
        try {
            setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(this.f69198k, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f69197j, 1073741824));
        } catch (Exception e10) {
            Log.d("cqtest", e10.toString());
        }
    }

    public void setDoublePicture(boolean z10) {
        this.f69195h = z10;
    }

    public void setRadius(int i10) {
        this.f69199l = i10;
    }

    public void setRadiusZone(int i10) {
        this.f69200m = i10;
    }

    public void setmResId(int i10) {
        this.f69196i = i10;
    }

    public void setmScrollltr(boolean z10) {
        this.f69194g = z10;
    }
}
