package com.max.hbcustomview.shinebuttonlib;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.p0;
import androidx.core.content.res.i;
import androidx.core.view.j1;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes10.dex */
public class ShineButton extends PorterShapeImageView {
    private static final String T = "ShineButton";
    public static ChangeQuickRedirect changeQuickRedirect;
    private int A;
    private int B;
    private ValueAnimator C;
    int D;
    int E;
    DisplayMetrics F;
    Activity G;
    ShineView H;
    ValueAnimator I;
    ValueAnimator J;
    AnimatorSet K;
    ShineView.k L;
    g M;
    private int N;
    private int O;
    private com.max.hbcustomview.shinebuttonlib.a P;
    private boolean Q;
    private int R;
    private int S;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f69403z;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.f.fq, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            ShineButton.this.setProgressHeight(((Float) ShineButton.this.C.getAnimatedValue()).floatValue());
            ShineButton.this.invalidate();
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.f.gq, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            ShineButton.this.setProgressHeight(((Float) ShineButton.this.C.getAnimatedValue()).floatValue());
            ShineButton.this.invalidate();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.f.hq, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            ShineButton.this.setProgressHeight(((Float) ShineButton.this.C.getAnimatedValue()).floatValue());
            ShineButton.this.invalidate();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.f.iq, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            ShineButton.this.setRotation(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.f.jq, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ShineButton.this.setScaleX(fFloatValue);
            ShineButton.this.setScaleY(fFloatValue);
        }
    }

    public class f implements Animator.AnimatorListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.f.mq, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            ShineButton shineButton = ShineButton.this;
            shineButton.setSrcColor(shineButton.A);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.f.lq, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            ShineButton shineButton = ShineButton.this;
            shineButton.setSrcColor(shineButton.f69403z ? ShineButton.this.B : ShineButton.this.A);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.f.kq, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            ShineButton shineButton = ShineButton.this;
            shineButton.setSrcColor(shineButton.B);
        }
    }

    public interface g {
        void a(View view, boolean z10);
    }

    public ShineButton(Context context) {
        this(context, null);
        if (context instanceof Activity) {
            v((Activity) context);
        }
    }

    public ShineButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
        w(context, attributeSet);
    }

    public ShineButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f69403z = false;
        this.D = 50;
        this.E = 50;
        this.F = new DisplayMetrics();
        this.L = new ShineView.k();
        this.Q = false;
        this.R = -1;
        this.S = -1;
        w(context, attributeSet);
    }

    private void o() {
        Activity activity;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.eq, new Class[0], Void.TYPE).isSupported || (activity = this.G) == null || this.F == null) {
            return;
        }
        activity.getWindowManager().getDefaultDisplay().getMetrics(this.F);
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        Rect rect = new Rect();
        this.G.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height();
        int i10 = iArr[1];
        this.O = iHeight - i10;
        this.N = this.F.heightPixels - i10;
    }

    private void q() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.cq, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(15.0f, 0.0f);
        this.I = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        invalidate();
        this.I.addUpdateListener(new d());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.1f, 1.0f);
        this.J = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.setInterpolator(this.P);
        this.J.addUpdateListener(new e());
        AnimatorSet animatorSet = new AnimatorSet();
        this.K = animatorSet;
        animatorSet.addListener(new f());
        this.K.setDuration(300L);
        this.K.playTogether(this.I, this.J);
        this.K.setStartDelay(30L);
        this.K.start();
    }

    private void w(Context context, AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{context, attributeSet}, this, changeQuickRedirect, false, bb.c.f.Kp, new Class[]{Context.class, AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        if (context instanceof Activity) {
            v((Activity) context);
        }
        this.P = new com.max.hbcustomview.shinebuttonlib.a(0.4f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.S2);
        this.A = typedArrayObtainStyledAttributes.getColor(R.styleable.ShineButton_btn_color, -7829368);
        this.B = typedArrayObtainStyledAttributes.getColor(R.styleable.ShineButton_btn_fill_color, j1.f21601t);
        this.L.f69447a = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ShineButton_allow_random_color, false);
        ShineView.k kVar = this.L;
        kVar.f69448b = typedArrayObtainStyledAttributes.getInteger(R.styleable.ShineButton_shine_animation_duration, (int) kVar.f69448b);
        ShineView.k kVar2 = this.L;
        kVar2.f69449c = typedArrayObtainStyledAttributes.getColor(R.styleable.ShineButton_big_shine_color, kVar2.f69449c);
        ShineView.k kVar3 = this.L;
        kVar3.f69450d = typedArrayObtainStyledAttributes.getInteger(R.styleable.ShineButton_click_animation_duration, (int) kVar3.f69450d);
        this.L.f69451e = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ShineButton_enable_flashing, false);
        ShineView.k kVar4 = this.L;
        kVar4.f69452f = typedArrayObtainStyledAttributes.getInteger(R.styleable.ShineButton_shine_count, kVar4.f69452f);
        ShineView.k kVar5 = this.L;
        kVar5.f69454h = typedArrayObtainStyledAttributes.getFloat(R.styleable.ShineButton_shine_distance_multiple, kVar5.f69454h);
        ShineView.k kVar6 = this.L;
        kVar6.f69453g = typedArrayObtainStyledAttributes.getFloat(R.styleable.ShineButton_shine_turn_angle, kVar6.f69453g);
        ShineView.k kVar7 = this.L;
        kVar7.f69456j = typedArrayObtainStyledAttributes.getColor(R.styleable.ShineButton_small_shine_color, kVar7.f69456j);
        ShineView.k kVar8 = this.L;
        kVar8.f69455i = typedArrayObtainStyledAttributes.getFloat(R.styleable.ShineButton_small_shine_offset_angle, kVar8.f69455i);
        ShineView.k kVar9 = this.L;
        kVar9.f69457k = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShineButton_shine_size, kVar9.f69457k);
        typedArrayObtainStyledAttributes.recycle();
        setSrcColor(this.A);
    }

    private void z(boolean z10) {
        g gVar;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.Pp, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || (gVar = this.M) == null) {
            return;
        }
        gVar.a(this, z10);
    }

    public void A() {
        ShineView shineView;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Wp, new Class[0], Void.TYPE).isSupported || (shineView = this.H) == null) {
            return;
        }
        B(shineView);
    }

    public void B(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.Vp, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        Activity activity = this.G;
        if (activity != null) {
            ((ViewGroup) activity.findViewById(android.R.id.content)).removeView(view);
        } else {
            Log.e(T, "Please init.");
        }
    }

    public void C() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Tp, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Activity activity = this.G;
        if (activity == null) {
            Log.e(T, "Please init.");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(android.R.id.content);
        ShineView shineView = new ShineView(this.G, this, this.L);
        this.H = shineView;
        if (viewGroup != null) {
            viewGroup.addView(shineView, new ViewGroup.LayoutParams(-1, -1));
            q();
        }
    }

    public void D(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Up, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getRootView();
        ShineView shineView = new ShineView(getContext(), this, this.L);
        this.H = shineView;
        viewGroup.addView(shineView, new ViewGroup.LayoutParams(i10, i11));
        this.Q = true;
        this.R = i12;
        this.S = i13;
        q();
    }

    public void E() {
        ValueAnimator valueAnimator;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.aq, new Class[0], Void.TYPE).isSupported || (valueAnimator = this.C) == null) {
            return;
        }
        valueAnimator.cancel();
        this.C.removeAllUpdateListeners();
    }

    public int getCenterX() {
        return this.R;
    }

    public int getCenterY() {
        return this.S;
    }

    public int getColor() {
        return this.B;
    }

    public float getProgressHeight() {
        return this.f69393o;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Sp, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onAttachedToWindow();
    }

    @Override // com.max.hbcustomview.shinebuttonlib.PorterImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.Rp, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onDraw(canvas);
        o();
    }

    @Override // com.max.hbcustomview.shinebuttonlib.PorterImageView, android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.dq, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void p() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.bq, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.C.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getProgressHeight(), 1.0f);
        this.C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new c());
        this.C.setDuration(500L);
        this.C.start();
    }

    public void r() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Yp, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.C.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new a());
        this.C.setDuration(2000L);
        this.C.setInterpolator(new LinearInterpolator());
        this.C.start();
    }

    public void s(@p0 AnimatorListenerAdapter animatorListenerAdapter) {
        if (PatchProxy.proxy(new Object[]{animatorListenerAdapter}, this, changeQuickRedirect, false, bb.c.f.Zp, new Class[]{AnimatorListenerAdapter.class}, Void.TYPE).isSupported) {
            return;
        }
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.C.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new b());
        if (animatorListenerAdapter != null) {
            this.C.addListener(animatorListenerAdapter);
        }
        this.C.setDuration(2000L);
        this.C.setInterpolator(new LinearInterpolator());
        this.C.start();
    }

    public void setAllowRandomColor(boolean z10) {
        this.L.f69447a = z10;
    }

    public void setAnimDuration(int i10) {
        this.L.f69448b = i10;
    }

    public void setBigShineColor(int i10) {
        this.L.f69449c = i10;
    }

    public void setBtnColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Lp, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.A = i10;
        setSrcColor(i10);
    }

    public void setBtnFillColor(int i10) {
        this.B = i10;
    }

    public void setCancel() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Qp, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setSrcColor(this.A);
        AnimatorSet animatorSet = this.K;
        if (animatorSet != null) {
            animatorSet.end();
            this.K.cancel();
        }
    }

    public void setCenterX(int i10) {
        this.R = i10;
    }

    public void setCenterY(int i10) {
        this.S = i10;
    }

    public void setChecked(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.Op, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setChecked(z10, false, false);
    }

    public void setChecked(boolean z10, boolean z11) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Mp, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        setChecked(z10, z11, true);
    }

    public void setChecked(boolean z10, boolean z11, boolean z12) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Np, new Class[]{cls, cls, cls}, Void.TYPE).isSupported || this.f69403z == z10) {
            return;
        }
        this.f69403z = z10;
        if (z10) {
            setSrcColor(this.B);
            this.f69403z = true;
            if (z11) {
                C();
            }
        } else {
            setSrcColor(this.A);
            this.f69403z = false;
            if (z11) {
                setCancel();
            }
        }
        if (z12) {
            z(z10);
        }
    }

    public void setClickAnimDuration(int i10) {
        this.L.f69450d = i10;
    }

    public void setOnCheckStateChangeListener(g gVar) {
        this.M = gVar;
    }

    public void setProgressHeight(float f10) {
        this.f69393o = f10;
    }

    public void setShapeResource(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Xp, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setShape(i.g(getContext().getResources(), i10, null));
    }

    public void setShineCount(int i10) {
        this.L.f69452f = i10;
    }

    public void setShineDistanceMultiple(float f10) {
        this.L.f69454h = f10;
    }

    public void setShineSize(int i10) {
        this.L.f69457k = i10;
    }

    public void setShineTurnAngle(float f10) {
        this.L.f69453g = f10;
    }

    public void setSmallShineColor(int i10) {
        this.L.f69456j = i10;
    }

    public void setSmallShineOffAngle(float f10) {
        this.L.f69455i = f10;
    }

    public void setUseSetLocation(boolean z10) {
        this.Q = z10;
    }

    public void t(boolean z10) {
        this.L.f69451e = z10;
    }

    public int u(boolean z10) {
        return z10 ? this.O : this.N;
    }

    public void v(Activity activity) {
        this.G = activity;
    }

    public boolean x() {
        return this.f69403z;
    }

    public boolean y() {
        return this.Q;
    }
}
