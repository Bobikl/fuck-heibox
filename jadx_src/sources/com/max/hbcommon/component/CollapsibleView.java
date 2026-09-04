package com.max.hbcommon.component;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.Keep;
import androidx.core.view.j1;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes9.dex */
public class CollapsibleView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f66972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f66973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f66974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f66975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f66976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f66977g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f66978h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f66979i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f66980j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f66981k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f66982l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Paint f66983m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private RectF f66984n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f66985o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private View f66986p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f66987q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f66988r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private AnimatorSet f66989s;

    public class a implements Animator.AnimatorListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.d.O6, new Class[]{Animator.class}, Void.TYPE).isSupported || CollapsibleView.this.f66985o == null || CollapsibleView.this.f66986p == null) {
                return;
            }
            if (CollapsibleView.this.f66981k) {
                CollapsibleView.this.f66985o.setVisibility(0);
                CollapsibleView.this.f66986p.setVisibility(8);
            } else {
                CollapsibleView.this.f66985o.setVisibility(8);
                CollapsibleView.this.f66986p.setVisibility(0);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.d.N6, new Class[]{Animator.class}, Void.TYPE).isSupported || CollapsibleView.this.f66985o == null || CollapsibleView.this.f66986p == null) {
                return;
            }
            if (CollapsibleView.this.f66981k) {
                CollapsibleView.this.f66985o.setVisibility(8);
                CollapsibleView.this.f66986p.setVisibility(0);
            } else {
                CollapsibleView.this.f66985o.setVisibility(0);
                CollapsibleView.this.f66986p.setVisibility(8);
            }
        }
    }

    public CollapsibleView(@androidx.annotation.n0 Context context) {
        this(context, null);
    }

    public CollapsibleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CollapsibleView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f66982l = j1.f21601t;
        this.f66983m = new Paint();
        this.f66984n = new RectF();
        this.f66987q = 0.0f;
        this.f66988r = 0.0f;
        this.f66989s = new AnimatorSet();
        j();
    }

    public CollapsibleView(Context context, View view, View view2) {
        super(context);
        this.f66982l = j1.f21601t;
        this.f66983m = new Paint();
        this.f66984n = new RectF();
        this.f66987q = 0.0f;
        this.f66988r = 0.0f;
        this.f66989s = new AnimatorSet();
        this.f66985o = view2;
        this.f66986p = view;
        j();
    }

    private void j() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.G6, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setWillNotDraw(false);
        this.f66981k = false;
        this.f66983m.setAntiAlias(true);
        View view = this.f66986p;
        if (view != null && this.f66985o != null) {
            this.f66975e = ViewUtils.W(view);
            this.f66976f = ViewUtils.V(this.f66986p);
            this.f66977g = ViewUtils.W(this.f66985o);
            this.f66978h = ViewUtils.V(this.f66985o);
        }
        this.f66974d = ViewUtils.f(getContext(), 27.0f);
        this.f66973c = ViewUtils.f(getContext(), 4.0f);
        int i10 = this.f66982l;
        if (i10 != -16777216) {
            this.f66983m.setColor(i10);
        }
        this.f66972b = this.f66973c;
        this.f66980j = this.f66976f;
        this.f66979i = this.f66975e;
        View view2 = this.f66985o;
        if (view2 != null) {
            addView(view2);
        }
        View view3 = this.f66986p;
        if (view3 != null) {
            addView(view3);
        }
        this.f66989s.setDuration(250L);
        this.f66989s.addListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(ValueAnimator valueAnimator) {
        if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.d.M6, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f66988r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(ValueAnimator valueAnimator) {
        if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.d.L6, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f66987q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(ValueAnimator valueAnimator) {
        if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.d.K6, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f66988r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(ValueAnimator valueAnimator) {
        if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.d.J6, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f66987q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    public void h() {
        View view;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.E6, new Class[0], Void.TYPE).isSupported || this.f66981k || (view = this.f66985o) == null || this.f66986p == null) {
            return;
        }
        this.f66977g = ViewUtils.W(view);
        this.f66978h = ViewUtils.V(this.f66985o);
        this.f66981k = true;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f66985o, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f66986p, "alpha", 1.0f, 0.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.f66976f - this.f66978h);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, this.f66975e - this.f66977g);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this, "radius", this.f66973c, this.f66974d);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f66986p, com.google.android.exoplayer2.text.ttml.d.f49793l0, 0, (int) (this.f66975e - this.f66977g));
        ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt(this.f66986p, "top", 0, (int) (this.f66976f - this.f66978h));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.max.hbcommon.component.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f67202b.k(valueAnimator);
            }
        });
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.max.hbcommon.component.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f67403b.l(valueAnimator);
            }
        });
        this.f66989s.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, valueAnimatorOfFloat, valueAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfInt, objectAnimatorOfInt2);
        this.f66989s.start();
    }

    public void i() {
        View view;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.F6, new Class[0], Void.TYPE).isSupported || !this.f66981k || (view = this.f66985o) == null || this.f66986p == null) {
            return;
        }
        this.f66981k = false;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f66986p, "alpha", 0.0f, 1.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f66976f - this.f66978h, 0.0f);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.f66975e - this.f66977g, 0.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this, "radius", this.f66974d, this.f66973c);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f66986p, com.google.android.exoplayer2.text.ttml.d.f49793l0, (int) (this.f66975e - this.f66977g), 0);
        ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt(this.f66986p, "top", (int) (this.f66976f - this.f66978h), 0);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.max.hbcommon.component.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f67569b.m(valueAnimator);
            }
        });
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.max.hbcommon.component.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f67595b.n(valueAnimator);
            }
        });
        this.f66989s.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, valueAnimatorOfFloat, valueAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfInt, objectAnimatorOfInt2);
        this.f66989s.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.d.I6, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f66984n != null && this.f66986p != null && this.f66985o != null) {
            canvas.save();
            RectF rectF = this.f66984n;
            rectF.left = this.f66987q;
            rectF.top = this.f66988r;
            rectF.right = this.f66975e;
            rectF.bottom = this.f66976f;
            float f10 = this.f66972b;
            canvas.drawRoundRect(rectF, f10, f10, this.f66983m);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.H6, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setAnimationDuration(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.B6, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f66989s.setDuration(i10);
    }

    public void setBackgroundPaintColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.C6, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f66982l = i10;
        this.f66983m.setColor(i10);
    }

    @Keep
    public void setHeight(float f10) {
        this.f66980j = f10;
    }

    public void setRadius(float f10) {
        this.f66972b = f10;
    }

    public void setViews(@androidx.annotation.n0 View view, @androidx.annotation.n0 View view2) {
        if (PatchProxy.proxy(new Object[]{view, view2}, this, changeQuickRedirect, false, bb.c.d.D6, new Class[]{View.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f66986p = view;
        this.f66985o = view2;
        this.f66975e = ViewUtils.W(view);
        this.f66976f = ViewUtils.V(view);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams((int) this.f66975e, (int) this.f66976f);
        }
        layoutParams.height = (int) this.f66976f;
        layoutParams.width = (int) this.f66975e;
        removeAllViews();
        addView(view, (int) this.f66975e, (int) this.f66976f);
        view2.setVisibility(8);
        addView(view2);
        setAnimationDuration(250);
        setLayoutParams(layoutParams);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f66986p, com.google.android.exoplayer2.text.ttml.d.f49793l0, 0, 1);
        objectAnimatorOfInt.setDuration(1L);
        objectAnimatorOfInt.start();
    }

    @Keep
    public void setWidth(float f10) {
        this.f66979i = f10;
    }
}
