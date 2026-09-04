package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.view.j1;
import com.google.android.material.R;

/* JADX INFO: compiled from: DropdownMenuEndIconDelegate.java */
/* JADX INFO: loaded from: classes7.dex */
public class p extends r {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.k(api = 21)
    private static final boolean f55653s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f55654t = 50;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f55655u = 67;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f55656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f55657f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    private final TimeInterpolator f55658g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private AutoCompleteTextView f55659h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final View.OnClickListener f55660i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View.OnFocusChangeListener f55661j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final androidx.core.view.accessibility.c.e f55662k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f55663l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f55664m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f55665n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f55666o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private AccessibilityManager f55667p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ValueAnimator f55668q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ValueAnimator f55669r;

    /* JADX INFO: compiled from: DropdownMenuEndIconDelegate.java */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p.this.r();
            p.this.f55669r.start();
        }
    }

    p(@n0 EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        this.f55660i = new View.OnClickListener() { // from class: com.google.android.material.textfield.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f55646b.J(view);
            }
        };
        this.f55661j = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.j
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                this.f55647b.K(view, z10);
            }
        };
        this.f55662k = new androidx.core.view.accessibility.c.e() { // from class: com.google.android.material.textfield.k
            @Override // androidx.core.view.accessibility.c.e
            public final void onTouchExplorationStateChanged(boolean z10) {
                this.f55648a.L(z10);
            }
        };
        this.f55666o = Long.MAX_VALUE;
        Context context = endCompoundLayout.getContext();
        int i10 = R.attr.motionDurationShort3;
        this.f55657f = i9.a.f(context, i10, 67);
        this.f55656e = i9.a.f(endCompoundLayout.getContext(), i10, 50);
        this.f55658g = i9.a.g(endCompoundLayout.getContext(), R.attr.motionEasingLinearInterpolator, com.google.android.material.animation.b.f52896a);
    }

    @n0
    private static AutoCompleteTextView D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator E(int i10, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f55658g);
        valueAnimatorOfFloat.setDuration(i10);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.l
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f55649b.I(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void F() {
        this.f55669r = E(this.f55657f, 0.0f, 1.0f);
        ValueAnimator valueAnimatorE = E(this.f55656e, 1.0f, 0.0f);
        this.f55668q = valueAnimatorE;
        valueAnimatorE.addListener(new a());
    }

    private boolean G() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f55666o;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        boolean zIsPopupShowing = this.f55659h.isPopupShowing();
        O(zIsPopupShowing);
        this.f55664m = zIsPopupShowing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(ValueAnimator valueAnimator) {
        this.f55674d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(View view) {
        Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(View view, boolean z10) {
        this.f55663l = z10;
        r();
        if (z10) {
            return;
        }
        O(false);
        this.f55664m = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(boolean z10) {
        AutoCompleteTextView autoCompleteTextView = this.f55659h;
        if (autoCompleteTextView == null || q.a(autoCompleteTextView)) {
            return;
        }
        j1.R1(this.f55674d, z10 ? 2 : 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean M(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (G()) {
                this.f55664m = false;
            }
            Q();
            R();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N() {
        R();
        O(false);
    }

    private void O(boolean z10) {
        if (this.f55665n != z10) {
            this.f55665n = z10;
            this.f55669r.cancel();
            this.f55668q.start();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void P() {
        this.f55659h.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.n
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f55651b.M(view, motionEvent);
            }
        });
        if (f55653s) {
            this.f55659h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.o
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    this.f55652a.N();
                }
            });
        }
        this.f55659h.setThreshold(0);
    }

    private void Q() {
        if (this.f55659h == null) {
            return;
        }
        if (G()) {
            this.f55664m = false;
        }
        if (this.f55664m) {
            this.f55664m = false;
            return;
        }
        if (f55653s) {
            O(!this.f55665n);
        } else {
            this.f55665n = !this.f55665n;
            r();
        }
        if (!this.f55665n) {
            this.f55659h.dismissDropDown();
        } else {
            this.f55659h.requestFocus();
            this.f55659h.showDropDown();
        }
    }

    private void R() {
        this.f55664m = true;
        this.f55666o = System.currentTimeMillis();
    }

    @Override // com.google.android.material.textfield.r
    public void a(Editable editable) {
        if (this.f55667p.isTouchExplorationEnabled() && q.a(this.f55659h) && !this.f55674d.hasFocus()) {
            this.f55659h.dismissDropDown();
        }
        this.f55659h.post(new Runnable() { // from class: com.google.android.material.textfield.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f55650b.H();
            }
        });
    }

    @Override // com.google.android.material.textfield.r
    int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // com.google.android.material.textfield.r
    int d() {
        return f55653s ? R.drawable.mtrl_dropdown_arrow : R.drawable.mtrl_ic_arrow_drop_down;
    }

    @Override // com.google.android.material.textfield.r
    View.OnFocusChangeListener e() {
        return this.f55661j;
    }

    @Override // com.google.android.material.textfield.r
    View.OnClickListener f() {
        return this.f55660i;
    }

    @Override // com.google.android.material.textfield.r
    public androidx.core.view.accessibility.c.e h() {
        return this.f55662k;
    }

    @Override // com.google.android.material.textfield.r
    boolean i(int i10) {
        return i10 != 0;
    }

    @Override // com.google.android.material.textfield.r
    boolean j() {
        return true;
    }

    @Override // com.google.android.material.textfield.r
    boolean k() {
        return this.f55663l;
    }

    @Override // com.google.android.material.textfield.r
    boolean l() {
        return true;
    }

    @Override // com.google.android.material.textfield.r
    boolean m() {
        return this.f55665n;
    }

    @Override // com.google.android.material.textfield.r
    public void n(@p0 EditText editText) {
        this.f55659h = D(editText);
        P();
        this.f55671a.setErrorIconDrawable((Drawable) null);
        if (!q.a(editText) && this.f55667p.isTouchExplorationEnabled()) {
            j1.R1(this.f55674d, 2);
        }
        this.f55671a.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.r
    public void o(View view, @n0 androidx.core.view.accessibility.a0 a0Var) {
        if (!q.a(this.f55659h)) {
            a0Var.b1(Spinner.class.getName());
        }
        if (a0Var.D0()) {
            a0Var.q1(null);
        }
    }

    @Override // com.google.android.material.textfield.r
    @SuppressLint({"WrongConstant"})
    public void p(View view, @n0 AccessibilityEvent accessibilityEvent) {
        if (!this.f55667p.isEnabled() || q.a(this.f55659h)) {
            return;
        }
        boolean z10 = accessibilityEvent.getEventType() == 32768 && this.f55665n && !this.f55659h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z10) {
            Q();
            R();
        }
    }

    @Override // com.google.android.material.textfield.r
    void s() {
        F();
        this.f55667p = (AccessibilityManager) this.f55673c.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.r
    boolean t() {
        return true;
    }

    @Override // com.google.android.material.textfield.r
    @SuppressLint({"ClickableViewAccessibility"})
    void u() {
        AutoCompleteTextView autoCompleteTextView = this.f55659h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (f55653s) {
                this.f55659h.setOnDismissListener(null);
            }
        }
    }
}
