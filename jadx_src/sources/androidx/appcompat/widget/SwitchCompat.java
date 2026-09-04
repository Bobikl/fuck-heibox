package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.view.j1;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton implements d0 {
    private static final int T = 250;
    private static final int U = 0;
    private static final int V = 1;
    private static final int W = 2;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final String f2627a0 = "android.widget.Switch";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final int f2628b0 = 1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final int f2629c0 = 2;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final int f2630p1 = 3;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private static final Property<SwitchCompat, Float> f2631x1 = new a(Float.class, "thumbPos");

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private static final int[] f2632y1 = {R.attr.state_checked};
    float A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private boolean I;
    private final TextPaint J;
    private ColorStateList K;
    private Layout L;
    private Layout M;

    @androidx.annotation.p0
    private TransformationMethod N;
    ObjectAnimator O;
    private final p P;

    @androidx.annotation.n0
    private h Q;

    @androidx.annotation.p0
    private c R;
    private final Rect S;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Drawable f2633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ColorStateList f2634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private PorterDuff.Mode f2635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f2636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f2637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable f2638g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ColorStateList f2639h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private PorterDuff.Mode f2640i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f2641j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f2642k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f2643l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f2644m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f2645n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f2646o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f2647p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private CharSequence f2648q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CharSequence f2649r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f2650s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f2651t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f2652u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f2653v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f2654w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f2655x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private VelocityTracker f2656y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f2657z;

    public class a extends Property<SwitchCompat, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.A);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f10) {
            switchCompat.setThumbPosition(f10.floatValue());
        }
    }

    @androidx.annotation.w0(18)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static void a(ObjectAnimator objectAnimator, boolean z10) {
            objectAnimator.setAutoCancel(z10);
        }
    }

    public static class c extends androidx.emoji2.text.f.AbstractC0166f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Reference<SwitchCompat> f2658a;

        c(SwitchCompat switchCompat) {
            this.f2658a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.f.AbstractC0166f
        public void a(@androidx.annotation.p0 Throwable th2) {
            SwitchCompat switchCompat = this.f2658a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }

        @Override // androidx.emoji2.text.f.AbstractC0166f
        public void b() {
            SwitchCompat switchCompat = this.f2658a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }
    }

    public SwitchCompat(@androidx.annotation.n0 Context context) {
        this(context, null);
    }

    public SwitchCompat(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.switchStyle);
    }

    public SwitchCompat(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2634c = null;
        this.f2635d = null;
        this.f2636e = false;
        this.f2637f = false;
        this.f2639h = null;
        this.f2640i = null;
        this.f2641j = false;
        this.f2642k = false;
        this.f2656y = VelocityTracker.obtain();
        this.I = true;
        this.S = new Rect();
        s0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.J = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = androidx.appcompat.R.styleable.C;
        x0 x0VarG = x0.G(context, attributeSet, iArr, i10, 0);
        j1.z1(this, context, iArr, attributeSet, x0VarG.B(), i10, 0);
        Drawable drawableH = x0VarG.h(androidx.appcompat.R.styleable.SwitchCompat_android_thumb);
        this.f2633b = drawableH;
        if (drawableH != null) {
            drawableH.setCallback(this);
        }
        Drawable drawableH2 = x0VarG.h(androidx.appcompat.R.styleable.SwitchCompat_track);
        this.f2638g = drawableH2;
        if (drawableH2 != null) {
            drawableH2.setCallback(this);
        }
        setTextOnInternal(x0VarG.x(androidx.appcompat.R.styleable.SwitchCompat_android_textOn));
        setTextOffInternal(x0VarG.x(androidx.appcompat.R.styleable.SwitchCompat_android_textOff));
        this.f2651t = x0VarG.a(androidx.appcompat.R.styleable.SwitchCompat_showText, true);
        this.f2643l = x0VarG.g(androidx.appcompat.R.styleable.SwitchCompat_thumbTextPadding, 0);
        this.f2644m = x0VarG.g(androidx.appcompat.R.styleable.SwitchCompat_switchMinWidth, 0);
        this.f2645n = x0VarG.g(androidx.appcompat.R.styleable.SwitchCompat_switchPadding, 0);
        this.f2646o = x0VarG.a(androidx.appcompat.R.styleable.SwitchCompat_splitTrack, false);
        ColorStateList colorStateListD = x0VarG.d(androidx.appcompat.R.styleable.SwitchCompat_thumbTint);
        if (colorStateListD != null) {
            this.f2634c = colorStateListD;
            this.f2636e = true;
        }
        PorterDuff.Mode modeE = b0.e(x0VarG.o(androidx.appcompat.R.styleable.SwitchCompat_thumbTintMode, -1), null);
        if (this.f2635d != modeE) {
            this.f2635d = modeE;
            this.f2637f = true;
        }
        if (this.f2636e || this.f2637f) {
            b();
        }
        ColorStateList colorStateListD2 = x0VarG.d(androidx.appcompat.R.styleable.SwitchCompat_trackTint);
        if (colorStateListD2 != null) {
            this.f2639h = colorStateListD2;
            this.f2641j = true;
        }
        PorterDuff.Mode modeE2 = b0.e(x0VarG.o(androidx.appcompat.R.styleable.SwitchCompat_trackTintMode, -1), null);
        if (this.f2640i != modeE2) {
            this.f2640i = modeE2;
            this.f2642k = true;
        }
        if (this.f2641j || this.f2642k) {
            c();
        }
        int iU = x0VarG.u(androidx.appcompat.R.styleable.SwitchCompat_switchTextAppearance, 0);
        if (iU != 0) {
            setSwitchTextAppearance(context, iU);
        }
        p pVar = new p(this);
        this.P = pVar;
        pVar.m(attributeSet, i10);
        x0VarG.I();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2653v = viewConfiguration.getScaledTouchSlop();
        this.f2657z = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i10);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private void a(boolean z10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f2631x1, z10 ? 1.0f : 0.0f);
        this.O = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        b.a(this.O, true);
        this.O.start();
    }

    private void b() {
        Drawable drawable = this.f2633b;
        if (drawable != null) {
            if (this.f2636e || this.f2637f) {
                Drawable drawableMutate = androidx.core.graphics.drawable.d.r(drawable).mutate();
                this.f2633b = drawableMutate;
                if (this.f2636e) {
                    androidx.core.graphics.drawable.d.o(drawableMutate, this.f2634c);
                }
                if (this.f2637f) {
                    androidx.core.graphics.drawable.d.p(this.f2633b, this.f2635d);
                }
                if (this.f2633b.isStateful()) {
                    this.f2633b.setState(getDrawableState());
                }
            }
        }
    }

    private void c() {
        Drawable drawable = this.f2638g;
        if (drawable != null) {
            if (this.f2641j || this.f2642k) {
                Drawable drawableMutate = androidx.core.graphics.drawable.d.r(drawable).mutate();
                this.f2638g = drawableMutate;
                if (this.f2641j) {
                    androidx.core.graphics.drawable.d.o(drawableMutate, this.f2639h);
                }
                if (this.f2642k) {
                    androidx.core.graphics.drawable.d.p(this.f2638g, this.f2640i);
                }
                if (this.f2638g.isStateful()) {
                    this.f2638g.setState(getDrawableState());
                }
            }
        }
    }

    private void d() {
        ObjectAnimator objectAnimator = this.O;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void e(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    private static float f(float f10, float f11, float f12) {
        if (f10 < f11) {
            return f11;
        }
        return f10 > f12 ? f12 : f10;
    }

    @androidx.annotation.p0
    private CharSequence g(@androidx.annotation.p0 CharSequence charSequence) {
        TransformationMethod transformationMethodF = getEmojiTextViewHelper().f(this.N);
        return transformationMethodF != null ? transformationMethodF.getTransformation(charSequence, this) : charSequence;
    }

    @androidx.annotation.n0
    private h getEmojiTextViewHelper() {
        if (this.Q == null) {
            this.Q = new h(this);
        }
        return this.Q;
    }

    private boolean getTargetCheckedState() {
        return this.A > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((h1.b(this) ? 1.0f - this.A : this.A) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f2638g;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.S;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f2633b;
        Rect rectD = drawable2 != null ? b0.d(drawable2) : b0.f2738c;
        return ((((this.B - this.D) - rect.left) - rect.right) - rectD.left) - rectD.right;
    }

    private boolean h(float f10, float f11) {
        if (this.f2633b == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f2633b.getPadding(this.S);
        int i10 = this.F;
        int i11 = this.f2653v;
        int i12 = i10 - i11;
        int i13 = (this.E + thumbOffset) - i11;
        int i14 = this.D + i13;
        Rect rect = this.S;
        return f10 > ((float) i13) && f10 < ((float) (((i14 + rect.left) + rect.right) + i11)) && f11 > ((float) i12) && f11 < ((float) (this.H + i11));
    }

    private Layout i(CharSequence charSequence) {
        TextPaint textPaint = this.J;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f2649r;
            if (string == null) {
                string = getResources().getString(androidx.appcompat.R.string.abc_capital_off);
            }
            j1.q2(this, string);
        }
    }

    private void l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f2647p;
            if (string == null) {
                string = getResources().getString(androidx.appcompat.R.string.abc_capital_on);
            }
            j1.q2(this, string);
        }
    }

    private void m(int i10, int i11) {
        Typeface typeface;
        if (i10 == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i10 != 2) {
            typeface = i10 != 3 ? null : Typeface.MONOSPACE;
        } else {
            typeface = Typeface.SERIF;
        }
        setSwitchTypeface(typeface, i11);
    }

    private void n() {
        if (this.R == null && this.Q.b() && androidx.emoji2.text.f.n()) {
            androidx.emoji2.text.f fVarB = androidx.emoji2.text.f.b();
            int iF = fVarB.f();
            if (iF == 3 || iF == 0) {
                c cVar = new c(this);
                this.R = cVar;
                fVarB.y(cVar);
            }
        }
    }

    private void o(MotionEvent motionEvent) {
        this.f2652u = 0;
        boolean targetCheckedState = true;
        boolean z10 = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z10) {
            this.f2656y.computeCurrentVelocity(1000);
            float xVelocity = this.f2656y.getXVelocity();
            if (Math.abs(xVelocity) <= this.f2657z) {
                targetCheckedState = getTargetCheckedState();
            } else if (!h1.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                targetCheckedState = false;
            }
        } else {
            targetCheckedState = zIsChecked;
        }
        if (targetCheckedState != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(targetCheckedState);
        e(motionEvent);
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f2649r = charSequence;
        this.f2650s = g(charSequence);
        this.M = null;
        if (this.f2651t) {
            n();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f2647p = charSequence;
        this.f2648q = g(charSequence);
        this.L = null;
        if (this.f2651t) {
            n();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        int i11;
        Rect rect = this.S;
        int i12 = this.E;
        int i13 = this.F;
        int i14 = this.G;
        int i15 = this.H;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f2633b;
        Rect rectD = drawable != null ? b0.d(drawable) : b0.f2738c;
        Drawable drawable2 = this.f2638g;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i16 = rect.left;
            thumbOffset += i16;
            if (rectD != null) {
                int i17 = rectD.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = rectD.top;
                int i19 = rect.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = rectD.right;
                int i21 = rect.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = rectD.bottom;
                int i23 = rect.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                }
                this.f2638g.setBounds(i12, i10, i14, i11);
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f2638g.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f2633b;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.D + rect.right;
            this.f2633b.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                androidx.core.graphics.drawable.d.l(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f2633b;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.k(drawable, f10, f11);
        }
        Drawable drawable2 = this.f2638g;
        if (drawable2 != null) {
            androidx.core.graphics.drawable.d.k(drawable2, f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2633b;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f2638g;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!h1.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.B;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f2645n : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (h1.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.B;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f2645n : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    @androidx.annotation.p0
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.q.G(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f2651t;
    }

    public boolean getSplitTrack() {
        return this.f2646o;
    }

    public int getSwitchMinWidth() {
        return this.f2644m;
    }

    public int getSwitchPadding() {
        return this.f2645n;
    }

    public CharSequence getTextOff() {
        return this.f2649r;
    }

    public CharSequence getTextOn() {
        return this.f2647p;
    }

    public Drawable getThumbDrawable() {
        return this.f2633b;
    }

    @androidx.annotation.x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a)
    protected final float getThumbPosition() {
        return this.A;
    }

    public int getThumbTextPadding() {
        return this.f2643l;
    }

    @androidx.annotation.p0
    public ColorStateList getThumbTintList() {
        return this.f2634c;
    }

    @androidx.annotation.p0
    public PorterDuff.Mode getThumbTintMode() {
        return this.f2635d;
    }

    public Drawable getTrackDrawable() {
        return this.f2638g;
    }

    @androidx.annotation.p0
    public ColorStateList getTrackTintList() {
        return this.f2639h;
    }

    @androidx.annotation.p0
    public PorterDuff.Mode getTrackTintMode() {
        return this.f2640i;
    }

    @Override // androidx.appcompat.widget.d0
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    void j() {
        setTextOnInternal(this.f2647p);
        setTextOffInternal(this.f2649r);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2633b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f2638g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.O;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.O.end();
        this.O = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2632y1);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.S;
        Drawable drawable = this.f2638g;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.F;
        int i11 = this.H;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f2633b;
        if (drawable != null) {
            if (!this.f2646o || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectD = b0.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectD.left;
                rect.right -= rectD.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.L : this.M;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.K;
            if (colorStateList != null) {
                this.J.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.J.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i12 + i13) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(f2627a0);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(f2627a0);
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f2647p : this.f2649r;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(text);
            sb2.append(' ');
            sb2.append(charSequence);
            accessibilityNodeInfo.setText(sb2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iMax;
        int width;
        int paddingLeft;
        int i14;
        int paddingTop;
        int height;
        super.onLayout(z10, i10, i11, i12, i13);
        int iMax2 = 0;
        if (this.f2633b != null) {
            Rect rect = this.S;
            Drawable drawable = this.f2638g;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectD = b0.d(this.f2633b);
            iMax = Math.max(0, rectD.left - rect.left);
            iMax2 = Math.max(0, rectD.right - rect.right);
        } else {
            iMax = 0;
        }
        if (h1.b(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.B + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.B) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                paddingTop = getPaddingTop();
                i14 = this.C;
            } else {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.C;
            }
            this.E = paddingLeft;
            this.F = paddingTop;
            this.H = height;
            this.G = width;
        }
        int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
        i14 = this.C;
        paddingTop = paddingTop2 - (i14 / 2);
        height = i14 + paddingTop;
        this.E = paddingLeft;
        this.F = paddingTop;
        this.H = height;
        this.G = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.f2651t) {
            if (this.L == null) {
                this.L = i(this.f2648q);
            }
            if (this.M == null) {
                this.M = i(this.f2650s);
            }
        }
        Rect rect = this.S;
        Drawable drawable = this.f2633b;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f2633b.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f2633b.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.D = Math.max(this.f2651t ? Math.max(this.L.getWidth(), this.M.getWidth()) + (this.f2643l * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.f2638g;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f2638g.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f2633b;
        if (drawable3 != null) {
            Rect rectD = b0.d(drawable3);
            iMax = Math.max(iMax, rectD.left);
            iMax2 = Math.max(iMax2, rectD.right);
        }
        int iMax3 = this.I ? Math.max(this.f2644m, (this.D * 2) + iMax + iMax2) : this.f2644m;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.B = iMax3;
        this.C = iMax4;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f2647p : this.f2649r;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0089  */
    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0094  */
    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f10;
        this.f2656y.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (isEnabled() && h(x10, y10)) {
                this.f2652u = 1;
                this.f2654w = x10;
                this.f2655x = y10;
            }
        } else if (actionMasked == 1) {
            if (this.f2652u == 2) {
                o(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f2652u = 0;
            this.f2656y.clear();
        } else if (actionMasked == 2) {
            int i10 = this.f2652u;
            if (i10 == 1) {
                float x11 = motionEvent.getX();
                float y11 = motionEvent.getY();
                if (Math.abs(x11 - this.f2654w) > this.f2653v || Math.abs(y11 - this.f2655x) > this.f2653v) {
                    this.f2652u = 2;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.f2654w = x11;
                    this.f2655x = y11;
                    return true;
                }
            } else if (i10 == 2) {
                float x12 = motionEvent.getX();
                int thumbScrollRange = getThumbScrollRange();
                float f11 = x12 - this.f2654w;
                if (thumbScrollRange != 0) {
                    f10 = f11 / thumbScrollRange;
                } else {
                    f10 = f11 > 0.0f ? 1.0f : -1.0f;
                }
                if (h1.b(this)) {
                    f10 = -f10;
                }
                float f12 = f(this.A + f10, 0.0f, 1.0f);
                if (f12 != this.A) {
                    this.f2654w = x12;
                    setThumbPosition(f12);
                }
                return true;
            }
        } else if (actionMasked == 3) {
            if (this.f2652u == 2) {
                o(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f2652u = 0;
            this.f2656y.clear();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            l();
        } else {
            k();
        }
        if (getWindowToken() != null && j1.U0(this)) {
            a(zIsChecked);
        } else {
            d();
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@androidx.annotation.p0 ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.q.H(this, callback));
    }

    @Override // androidx.appcompat.widget.d0
    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
        setTextOnInternal(this.f2647p);
        setTextOffInternal(this.f2649r);
        requestLayout();
    }

    protected final void setEnforceSwitchWidth(boolean z10) {
        this.I = z10;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(@androidx.annotation.n0 InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.f2651t != z10) {
            this.f2651t = z10;
            requestLayout();
            if (z10) {
                n();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f2646o = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f2644m = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f2645n = i10;
        requestLayout();
    }

    public void setSwitchTextAppearance(Context context, int i10) {
        x0 x0VarE = x0.E(context, i10, androidx.appcompat.R.styleable.D);
        ColorStateList colorStateListD = x0VarE.d(androidx.appcompat.R.styleable.TextAppearance_android_textColor);
        if (colorStateListD != null) {
            this.K = colorStateListD;
        } else {
            this.K = getTextColors();
        }
        int iG = x0VarE.g(androidx.appcompat.R.styleable.TextAppearance_android_textSize, 0);
        if (iG != 0) {
            float f10 = iG;
            if (f10 != this.J.getTextSize()) {
                this.J.setTextSize(f10);
                requestLayout();
            }
        }
        m(x0VarE.o(androidx.appcompat.R.styleable.TextAppearance_android_typeface, -1), x0VarE.o(androidx.appcompat.R.styleable.TextAppearance_android_textStyle, -1));
        if (x0VarE.a(androidx.appcompat.R.styleable.TextAppearance_textAllCaps, false)) {
            this.N = new d0.a(getContext());
        } else {
            this.N = null;
        }
        setTextOnInternal(this.f2647p);
        setTextOffInternal(this.f2649r);
        x0VarE.I();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.J.getTypeface() == null || this.J.getTypeface().equals(typeface)) && (this.J.getTypeface() != null || typeface == null)) {
            return;
        }
        this.J.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setSwitchTypeface(Typeface typeface, int i10) {
        if (i10 <= 0) {
            this.J.setFakeBoldText(false);
            this.J.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i10) : Typeface.create(typeface, i10);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i11 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i10;
            this.J.setFakeBoldText((i11 & 1) != 0);
            this.J.setTextSkewX((i11 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        k();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2633b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2633b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f10) {
        this.A = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(b0.a.b(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f2643l = i10;
        requestLayout();
    }

    public void setThumbTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        this.f2634c = colorStateList;
        this.f2636e = true;
        b();
    }

    public void setThumbTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        this.f2635d = mode;
        this.f2637f = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2638g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2638g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(b0.a.b(getContext(), i10));
    }

    public void setTrackTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        this.f2639h = colorStateList;
        this.f2641j = true;
        c();
    }

    public void setTrackTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        this.f2640i = mode;
        this.f2642k = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2633b || drawable == this.f2638g;
    }
}
