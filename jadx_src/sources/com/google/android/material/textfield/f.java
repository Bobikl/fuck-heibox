package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.material.R;

/* JADX INFO: compiled from: ClearTextEndIconDelegate.java */
/* JADX INFO: loaded from: classes7.dex */
public class f extends r {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f55631n = 100;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f55632o = 150;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final float f55633p = 0.8f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f55634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f55635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    private final TimeInterpolator f55636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    private final TimeInterpolator f55637h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private EditText f55638i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View.OnClickListener f55639j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View.OnFocusChangeListener f55640k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private AnimatorSet f55641l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ValueAnimator f55642m;

    /* JADX INFO: compiled from: ClearTextEndIconDelegate.java */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.f55672b.setEndIconVisible(true);
        }
    }

    /* JADX INFO: compiled from: ClearTextEndIconDelegate.java */
    public class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.f55672b.setEndIconVisible(false);
        }
    }

    f(@n0 EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        this.f55639j = new View.OnClickListener() { // from class: com.google.android.material.textfield.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f55629b.G(view);
            }
        };
        this.f55640k = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.e
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                this.f55630b.H(view, z10);
            }
        };
        Context context = endCompoundLayout.getContext();
        int i10 = R.attr.motionDurationShort3;
        this.f55634e = i9.a.f(context, i10, 100);
        this.f55635f = i9.a.f(endCompoundLayout.getContext(), i10, 150);
        this.f55636g = i9.a.g(endCompoundLayout.getContext(), R.attr.motionEasingLinearInterpolator, com.google.android.material.animation.b.f52896a);
        this.f55637h = i9.a.g(endCompoundLayout.getContext(), R.attr.motionEasingEmphasizedInterpolator, com.google.android.material.animation.b.f52899d);
    }

    private void A(boolean z10) {
        boolean z11 = this.f55672b.t() == z10;
        if (z10 && !this.f55641l.isRunning()) {
            this.f55642m.cancel();
            this.f55641l.start();
            if (z11) {
                this.f55641l.end();
                return;
            }
            return;
        }
        if (z10) {
            return;
        }
        this.f55641l.cancel();
        this.f55642m.start();
        if (z11) {
            this.f55642m.end();
        }
    }

    private ValueAnimator B(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f55636g);
        valueAnimatorOfFloat.setDuration(this.f55634e);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f55628b.E(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private ValueAnimator C() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f55633p, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f55637h);
        valueAnimatorOfFloat.setDuration(this.f55635f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f55627b.F(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void D() {
        ValueAnimator valueAnimatorC = C();
        ValueAnimator valueAnimatorB = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f55641l = animatorSet;
        animatorSet.playTogether(valueAnimatorC, valueAnimatorB);
        this.f55641l.addListener(new a());
        ValueAnimator valueAnimatorB2 = B(1.0f, 0.0f);
        this.f55642m = valueAnimatorB2;
        valueAnimatorB2.addListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(ValueAnimator valueAnimator) {
        this.f55674d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f55674d.setScaleX(fFloatValue);
        this.f55674d.setScaleY(fFloatValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(View view) {
        EditText editText = this.f55638i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(View view, boolean z10) {
        A(J());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        A(true);
    }

    private boolean J() {
        EditText editText = this.f55638i;
        return editText != null && (editText.hasFocus() || this.f55674d.hasFocus()) && this.f55638i.getText().length() > 0;
    }

    @Override // com.google.android.material.textfield.r
    void a(@n0 Editable editable) {
        if (this.f55672b.getSuffixText() != null) {
            return;
        }
        A(J());
    }

    @Override // com.google.android.material.textfield.r
    int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // com.google.android.material.textfield.r
    int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // com.google.android.material.textfield.r
    View.OnFocusChangeListener e() {
        return this.f55640k;
    }

    @Override // com.google.android.material.textfield.r
    View.OnClickListener f() {
        return this.f55639j;
    }

    @Override // com.google.android.material.textfield.r
    View.OnFocusChangeListener g() {
        return this.f55640k;
    }

    @Override // com.google.android.material.textfield.r
    public void n(@p0 EditText editText) {
        this.f55638i = editText;
        this.f55671a.setEndIconVisible(J());
    }

    @Override // com.google.android.material.textfield.r
    void q(boolean z10) {
        if (this.f55672b.getSuffixText() == null) {
            return;
        }
        A(z10);
    }

    @Override // com.google.android.material.textfield.r
    void s() {
        D();
    }

    @Override // com.google.android.material.textfield.r
    void u() {
        EditText editText = this.f55638i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: com.google.android.material.textfield.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f55626b.I();
                }
            });
        }
    }
}
