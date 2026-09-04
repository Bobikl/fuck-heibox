package com.max.hbcustomview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.p0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes10.dex */
public class AutoPlayView extends View {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Drawable f68332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Drawable f68333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f68334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f68335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f68336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ValueAnimator f68337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f68338h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f68339i;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.f.N2, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            AutoPlayView.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    public AutoPlayView(Context context) {
        super(context);
        this.f68338h = true;
        b();
        c();
    }

    public AutoPlayView(Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68338h = true;
        b();
        c();
    }

    public AutoPlayView(Context context, boolean z10, int i10) {
        super(context);
        this.f68338h = z10;
        this.f68339i = i10;
        b();
        c();
    }

    public static Bitmap a(int i10, Bitmap bitmap) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), bitmap}, null, changeQuickRedirect, true, bb.c.f.J2, new Class[]{Integer.TYPE, Bitmap.class}, Bitmap.class);
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

    private void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.G2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Drawable drawable = getContext().getResources().getDrawable(this.f68339i);
        this.f68332b = drawable;
        this.f68334d = drawable.getMinimumWidth();
        this.f68335e = this.f68332b.getMinimumHeight();
        ic.a aVar = ic.a.f119343a;
        int iD = aVar.d(getContext());
        if (this.f68338h) {
            this.f68336f = this.f68334d - aVar.d(getContext());
            this.f68332b.setBounds(0, 0, this.f68334d, this.f68335e);
        } else {
            int i10 = iD - this.f68334d;
            this.f68336f = i10;
            this.f68332b.setBounds(i10, 0, iD, this.f68335e);
        }
    }

    public void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.K2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, this.f68336f);
        this.f68337g = valueAnimatorOfInt;
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        this.f68337g.setDuration((Math.abs(this.f68336f) / ic.a.f119343a.b(getContext(), 135)) * 30000);
        this.f68337g.addUpdateListener(new a());
        this.f68337g.start();
    }

    public void d() {
        ValueAnimator valueAnimator;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.L2, new Class[0], Void.TYPE).isSupported && (valueAnimator = this.f68337g) != null && valueAnimator.isRunning() && this.f68337g.isStarted()) {
            this.f68337g.removeAllUpdateListeners();
            this.f68337g.cancel();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.M2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        d();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.I2, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f68332b.draw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.H2, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode == 1073741824 && mode2 == 1073741824) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(ic.a.f119343a.d(getContext()), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f68335e, 1073741824));
        }
    }

    public void setmResId(int i10) {
        this.f68339i = i10;
    }

    public void setmScrollltr(boolean z10) {
        this.f68338h = z10;
    }
}
