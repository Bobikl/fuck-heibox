package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.utils.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ShineMvpView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class ShineMvpView extends CardView {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f86991p = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f86992k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f86993l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f86994m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f86995n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f86996o;

    /* JADX INFO: compiled from: ShineMvpView.kt */
    public static final class a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageView f86997b;

        a(ImageView imageView) {
            this.f86997b = imageView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37017, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            float fW = ViewUtils.W(this.f86997b);
            float fV = ViewUtils.V(this.f86997b);
            if (fW > 0.0f && fV > 0.0f) {
                float f10 = fW <= fV ? fV / fW : fW / fV;
                float fSqrt = (float) Math.sqrt((f10 * f10) + 1.0f);
                this.f86997b.setScaleX(fSqrt);
                this.f86997b.setScaleY(fSqrt);
            }
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setDuration(6000L);
            rotateAnimation.setRepeatCount(-1);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            this.f86997b.clearAnimation();
            this.f86997b.startAnimation(rotateAnimation);
        }
    }

    public ShineMvpView(@e Context context) {
        this(context, null);
    }

    public ShineMvpView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShineMvpView(@e Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.m(context);
        h();
    }

    private final void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37014, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setCardElevation(0.0f);
        setCardBackgroundColor(d.F(getContext(), R.color.transparent));
        this.f86992k = ViewUtils.f(getContext(), 2.0f);
        this.f86993l = ViewUtils.f(getContext(), 2.0f);
        this.f86994m = ViewUtils.f(getContext(), 22.0f);
        this.f86995n = ViewUtils.f(getContext(), 12.0f);
        this.f86996o = ViewUtils.f(getContext(), 3.0f);
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.view_mvp, (ViewGroup) null);
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(viewInflate);
        i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@dl.d Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, 37015, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
        Path path = new Path();
        float f10 = this.f86992k;
        path.moveTo(this.f86993l + f10, f10);
        path.lineTo(getWidth() - this.f86994m, this.f86992k);
        path.lineTo(getWidth() - this.f86994m, this.f86995n - this.f86996o);
        path.quadTo(getWidth() - this.f86994m, this.f86995n, (getWidth() - this.f86994m) + this.f86996o, this.f86995n);
        path.lineTo(getWidth() - this.f86992k, this.f86995n);
        path.lineTo(getWidth() - this.f86992k, (getHeight() - this.f86992k) - this.f86993l);
        path.quadTo(getWidth() - this.f86992k, getHeight() - this.f86992k, (getWidth() - this.f86992k) - this.f86993l, getHeight() - this.f86992k);
        path.lineTo(this.f86992k + this.f86993l, getHeight() - this.f86992k);
        float f11 = this.f86992k;
        float height = getHeight();
        float f12 = this.f86992k;
        path.quadTo(f11, height - f12, f12, (getHeight() - this.f86992k) - this.f86993l);
        float f13 = this.f86992k;
        path.lineTo(f13, this.f86993l + f13);
        float f14 = this.f86992k;
        path.quadTo(f14, f14, this.f86993l + f14, f14);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        i();
        super.dispatchDraw(canvas);
    }

    public final float getInsetRadius() {
        return this.f86993l;
    }

    public final float getMvpHeight() {
        return this.f86995n;
    }

    public final float getMvpRadius() {
        return this.f86996o;
    }

    public final float getMvpWidth() {
        return this.f86994m;
    }

    public final float getStrokeWidth() {
        return this.f86992k;
    }

    public final void i() {
        ImageView imageView;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37016, new Class[0], Void.TYPE).isSupported || (imageView = (ImageView) findViewById(R.id.iv_animator)) == null) {
            return;
        }
        imageView.post(new a(imageView));
    }

    public final void setInsetRadius(float f10) {
        this.f86993l = f10;
    }

    public final void setMvpHeight(float f10) {
        this.f86995n = f10;
    }

    public final void setMvpRadius(float f10) {
        this.f86996o = f10;
    }

    public final void setMvpWidth(float f10) {
        this.f86994m = f10;
    }

    public final void setStrokeWidth(float f10) {
        this.f86992k = f10;
    }
}
