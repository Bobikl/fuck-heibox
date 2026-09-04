package com.max.hbcustomview.Shimmer;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.n0;
import androidx.annotation.p0;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ShimmerDrawable.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends Drawable {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ValueAnimator.AnimatorUpdateListener f68876a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f68877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f68878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Matrix f68879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private ValueAnimator f68880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private com.max.hbcustomview.Shimmer.a f68881f;

    /* JADX INFO: compiled from: ShimmerDrawable.java */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, c.f.f32536rb, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            b.this.invalidateSelf();
        }
    }

    public b() {
        Paint paint = new Paint();
        this.f68877b = paint;
        this.f68878c = new Rect();
        this.f68879d = new Matrix();
        paint.setAntiAlias(true);
    }

    private float c(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    private void g() {
        com.max.hbcustomview.Shimmer.a aVar;
        Shader radialGradient;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.f32514qb, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (iWidth == 0 || iHeight == 0 || (aVar = this.f68881f) == null) {
            return;
        }
        int iE = aVar.e(iWidth);
        int iA = this.f68881f.a(iHeight);
        com.max.hbcustomview.Shimmer.a aVar2 = this.f68881f;
        boolean z10 = true;
        if (aVar2.f68856g != 1) {
            int i10 = aVar2.f68853d;
            if (i10 != 1 && i10 != 3) {
                z10 = false;
            }
            if (z10) {
                iE = 0;
            }
            int i11 = z10 ? iA : 0;
            com.max.hbcustomview.Shimmer.a aVar3 = this.f68881f;
            radialGradient = new LinearGradient(0.0f, 0.0f, iE, i11, aVar3.f68851b, aVar3.f68850a, Shader.TileMode.CLAMP);
        } else {
            float f10 = iE / 2.0f;
            float f11 = iA / 2.0f;
            float fMax = (float) (((double) Math.max(iE, iA)) / Math.sqrt(2.0d));
            com.max.hbcustomview.Shimmer.a aVar4 = this.f68881f;
            radialGradient = new RadialGradient(f10, f11, fMax, aVar4.f68851b, aVar4.f68850a, Shader.TileMode.CLAMP);
        }
        this.f68877b.setShader(radialGradient);
    }

    private void h() {
        boolean zIsStarted;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.f32468ob, new Class[0], Void.TYPE).isSupported || this.f68881f == null) {
            return;
        }
        ValueAnimator valueAnimator = this.f68880e;
        if (valueAnimator != null) {
            zIsStarted = valueAnimator.isStarted();
            this.f68880e.cancel();
            this.f68880e.removeAllUpdateListeners();
        } else {
            zIsStarted = false;
        }
        com.max.hbcustomview.Shimmer.a aVar = this.f68881f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (aVar.f68870u / aVar.f68869t) + 1.0f);
        this.f68880e = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setRepeatMode(this.f68881f.f68868s);
        this.f68880e.setRepeatCount(this.f68881f.f68867r);
        ValueAnimator valueAnimator2 = this.f68880e;
        com.max.hbcustomview.Shimmer.a aVar2 = this.f68881f;
        valueAnimator2.setDuration(aVar2.f68869t + aVar2.f68870u);
        this.f68880e.addUpdateListener(this.f68876a);
        if (zIsStarted) {
            this.f68880e.start();
        }
    }

    public boolean a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.f32399lb, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        ValueAnimator valueAnimator = this.f68880e;
        return valueAnimator != null && valueAnimator.isStarted();
    }

    void b() {
        ValueAnimator valueAnimator;
        com.max.hbcustomview.Shimmer.a aVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.f32491pb, new Class[0], Void.TYPE).isSupported || (valueAnimator = this.f68880e) == null || valueAnimator.isStarted() || (aVar = this.f68881f) == null || !aVar.f68865p || getCallback() == null) {
            return;
        }
        this.f68880e.start();
    }

    public void d(com.max.hbcustomview.Shimmer.a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, c.f.f32330ib, new Class[]{com.max.hbcustomview.Shimmer.a.class}, Void.TYPE).isSupported) {
            return;
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Given null shimmer");
        }
        this.f68881f = aVar;
        this.f68877b.setXfermode(new PorterDuffXfermode(this.f68881f.f68866q ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        g();
        h();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@n0 Canvas canvas) {
        float fC;
        float fC2;
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, c.f.f32445nb, new Class[]{Canvas.class}, Void.TYPE).isSupported || this.f68881f == null || this.f68877b.getShader() == null) {
            return;
        }
        float fTan = (float) Math.tan(Math.toRadians(this.f68881f.f68863n));
        float fHeight = this.f68878c.height() + (this.f68878c.width() * fTan);
        float fWidth = this.f68878c.width() + (fTan * this.f68878c.height());
        ValueAnimator valueAnimator = this.f68880e;
        float f10 = 0.0f;
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        int i10 = this.f68881f.f68853d;
        if (i10 != 1) {
            if (i10 == 2) {
                fC2 = c(fWidth, -fWidth, animatedFraction);
            } else if (i10 != 3) {
                fC2 = c(-fWidth, fWidth, animatedFraction);
            } else {
                fC = c(fHeight, -fHeight, animatedFraction);
            }
            f10 = fC2;
            fC = 0.0f;
        } else {
            fC = c(-fHeight, fHeight, animatedFraction);
        }
        this.f68879d.reset();
        this.f68879d.setRotate(this.f68881f.f68863n, this.f68878c.width() / 2.0f, this.f68878c.height() / 2.0f);
        this.f68879d.postTranslate(f10, fC);
        this.f68877b.getShader().setLocalMatrix(this.f68879d);
        canvas.drawRect(this.f68878c, this.f68877b);
    }

    public void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.f32353jb, new Class[0], Void.TYPE).isSupported || this.f68880e == null || a() || getCallback() == null) {
            return;
        }
        this.f68880e.start();
    }

    public void f() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.f32376kb, new Class[0], Void.TYPE).isSupported || this.f68880e == null || !a()) {
            return;
        }
        this.f68880e.cancel();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        com.max.hbcustomview.Shimmer.a aVar = this.f68881f;
        return (aVar == null || !(aVar.f68864o || aVar.f68866q)) ? -1 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        if (PatchProxy.proxy(new Object[]{rect}, this, changeQuickRedirect, false, c.f.f32422mb, new Class[]{Rect.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onBoundsChange(rect);
        this.f68878c.set(0, 0, rect.width(), rect.height());
        g();
        b();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@p0 ColorFilter colorFilter) {
    }
}
