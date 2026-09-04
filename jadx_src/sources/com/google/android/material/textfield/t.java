package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.e1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.j1;
import com.google.android.material.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: IndicatorViewController.java */
/* JADX INFO: loaded from: classes7.dex */
public final class t {
    private static final int C = 217;
    private static final int D = 167;
    static final int E = 0;
    static final int F = 1;
    static final int G = 2;
    private static final int H = 0;
    private static final int I = 1;
    private static final int J = 2;

    @p0
    private ColorStateList A;
    private Typeface B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f55675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f55676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f55677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    private final TimeInterpolator f55678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    private final TimeInterpolator f55679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    private final TimeInterpolator f55680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f55681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    private final TextInputLayout f55682h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private LinearLayout f55683i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f55684j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private FrameLayout f55685k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private Animator f55686l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float f55687m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f55688n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f55689o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private CharSequence f55690p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f55691q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @p0
    private TextView f55692r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @p0
    private CharSequence f55693s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f55694t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f55695u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @p0
    private ColorStateList f55696v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private CharSequence f55697w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f55698x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @p0
    private TextView f55699y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f55700z;

    /* JADX INFO: compiled from: IndicatorViewController.java */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f55701b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextView f55702c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f55703d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextView f55704e;

        a(int i10, TextView textView, int i11, TextView textView2) {
            this.f55701b = i10;
            this.f55702c = textView;
            this.f55703d = i11;
            this.f55704e = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            t.this.f55688n = this.f55701b;
            t.this.f55686l = null;
            TextView textView = this.f55702c;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f55703d == 1 && t.this.f55692r != null) {
                    t.this.f55692r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f55704e;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f55704e.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f55704e;
            if (textView != null) {
                textView.setVisibility(0);
                this.f55704e.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: compiled from: IndicatorViewController.java */
    public class b extends View.AccessibilityDelegate {
        b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = t.this.f55682h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public t(@n0 TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f55681g = context;
        this.f55682h = textInputLayout;
        this.f55687m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        int i10 = R.attr.motionDurationShort4;
        this.f55675a = i9.a.f(context, i10, 217);
        this.f55676b = i9.a.f(context, R.attr.motionDurationMedium4, 167);
        this.f55677c = i9.a.f(context, i10, 167);
        int i11 = R.attr.motionEasingEmphasizedDecelerateInterpolator;
        this.f55678d = i9.a.g(context, i11, com.google.android.material.animation.b.f52899d);
        TimeInterpolator timeInterpolator = com.google.android.material.animation.b.f52896a;
        this.f55679e = i9.a.g(context, i11, timeInterpolator);
        this.f55680f = i9.a.g(context, R.attr.motionEasingLinearInterpolator, timeInterpolator);
    }

    private boolean C(int i10) {
        return (i10 != 1 || this.f55692r == null || TextUtils.isEmpty(this.f55690p)) ? false : true;
    }

    private boolean D(int i10) {
        return (i10 != 2 || this.f55699y == null || TextUtils.isEmpty(this.f55697w)) ? false : true;
    }

    private void I(int i10, int i11) {
        TextView textViewN;
        TextView textViewN2;
        if (i10 == i11) {
            return;
        }
        if (i11 != 0 && (textViewN2 = n(i11)) != null) {
            textViewN2.setVisibility(0);
            textViewN2.setAlpha(1.0f);
        }
        if (i10 != 0 && (textViewN = n(i10)) != null) {
            textViewN.setVisibility(4);
            if (i10 == 1) {
                textViewN.setText((CharSequence) null);
            }
        }
        this.f55688n = i11;
    }

    private void R(@p0 TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void T(@n0 ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean U(@p0 TextView textView, @n0 CharSequence charSequence) {
        return j1.U0(this.f55682h) && this.f55682h.isEnabled() && !(this.f55689o == this.f55688n && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    private void X(int i10, int i11, boolean z10) {
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f55686l = animatorSet;
            ArrayList arrayList = new ArrayList();
            i(arrayList, this.f55698x, this.f55699y, 2, i10, i11);
            i(arrayList, this.f55691q, this.f55692r, 1, i10, i11);
            com.google.android.material.animation.c.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i11, n(i10), i10, n(i11)));
            animatorSet.start();
        } else {
            I(i10, i11);
        }
        this.f55682h.E0();
        this.f55682h.I0(z10);
        this.f55682h.O0();
    }

    private boolean g() {
        return (this.f55683i == null || this.f55682h.getEditText() == null) ? false : true;
    }

    private void i(@n0 List<Animator> list, boolean z10, @p0 TextView textView, int i10, int i11, int i12) {
        if (textView == null || !z10) {
            return;
        }
        boolean z11 = false;
        if (i10 == i12 || i10 == i11) {
            ObjectAnimator objectAnimatorJ = j(textView, i12 == i10);
            if (i10 == i12 && i11 != 0) {
                z11 = true;
            }
            if (z11) {
                objectAnimatorJ.setStartDelay(this.f55677c);
            }
            list.add(objectAnimatorJ);
            if (i12 != i10 || i11 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorK = k(textView);
            objectAnimatorK.setStartDelay(this.f55677c);
            list.add(objectAnimatorK);
        }
    }

    private ObjectAnimator j(TextView textView, boolean z10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(z10 ? this.f55676b : this.f55677c);
        objectAnimatorOfFloat.setInterpolator(z10 ? this.f55679e : this.f55680f);
        return objectAnimatorOfFloat;
    }

    private ObjectAnimator k(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f55687m, 0.0f);
        objectAnimatorOfFloat.setDuration(this.f55675a);
        objectAnimatorOfFloat.setInterpolator(this.f55678d);
        return objectAnimatorOfFloat;
    }

    @p0
    private TextView n(int i10) {
        if (i10 == 1) {
            return this.f55692r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f55699y;
    }

    private int x(boolean z10, @androidx.annotation.q int i10, int i11) {
        return z10 ? this.f55681g.getResources().getDimensionPixelSize(i10) : i11;
    }

    void A() {
        this.f55690p = null;
        h();
        if (this.f55688n == 1) {
            if (!this.f55698x || TextUtils.isEmpty(this.f55697w)) {
                this.f55689o = 0;
            } else {
                this.f55689o = 2;
            }
        }
        X(this.f55688n, this.f55689o, U(this.f55692r, ""));
    }

    void B() {
        h();
        int i10 = this.f55688n;
        if (i10 == 2) {
            this.f55689o = 0;
        }
        X(i10, this.f55689o, U(this.f55699y, ""));
    }

    boolean E(int i10) {
        return i10 == 0 || i10 == 1;
    }

    boolean F() {
        return this.f55691q;
    }

    boolean G() {
        return this.f55698x;
    }

    void H(TextView textView, int i10) {
        FrameLayout frameLayout;
        if (this.f55683i == null) {
            return;
        }
        if (!E(i10) || (frameLayout = this.f55685k) == null) {
            this.f55683i.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i11 = this.f55684j - 1;
        this.f55684j = i11;
        T(this.f55683i, i11);
    }

    void J(int i10) {
        this.f55694t = i10;
        TextView textView = this.f55692r;
        if (textView != null) {
            j1.D1(textView, i10);
        }
    }

    void K(@p0 CharSequence charSequence) {
        this.f55693s = charSequence;
        TextView textView = this.f55692r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    void L(boolean z10) {
        if (this.f55691q == z10) {
            return;
        }
        h();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f55681g);
            this.f55692r = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_error);
            this.f55692r.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.f55692r.setTypeface(typeface);
            }
            M(this.f55695u);
            N(this.f55696v);
            K(this.f55693s);
            J(this.f55694t);
            this.f55692r.setVisibility(4);
            e(this.f55692r, 0);
        } else {
            A();
            H(this.f55692r, 0);
            this.f55692r = null;
            this.f55682h.E0();
            this.f55682h.O0();
        }
        this.f55691q = z10;
    }

    void M(@e1 int i10) {
        this.f55695u = i10;
        TextView textView = this.f55692r;
        if (textView != null) {
            this.f55682h.r0(textView, i10);
        }
    }

    void N(@p0 ColorStateList colorStateList) {
        this.f55696v = colorStateList;
        TextView textView = this.f55692r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void O(@e1 int i10) {
        this.f55700z = i10;
        TextView textView = this.f55699y;
        if (textView != null) {
            androidx.core.widget.q.E(textView, i10);
        }
    }

    void P(boolean z10) {
        if (this.f55698x == z10) {
            return;
        }
        h();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f55681g);
            this.f55699y = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_helper_text);
            this.f55699y.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.f55699y.setTypeface(typeface);
            }
            this.f55699y.setVisibility(4);
            j1.D1(this.f55699y, 1);
            O(this.f55700z);
            Q(this.A);
            e(this.f55699y, 1);
            this.f55699y.setAccessibilityDelegate(new b());
        } else {
            B();
            H(this.f55699y, 1);
            this.f55699y = null;
            this.f55682h.E0();
            this.f55682h.O0();
        }
        this.f55698x = z10;
    }

    void Q(@p0 ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f55699y;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void S(Typeface typeface) {
        if (typeface != this.B) {
            this.B = typeface;
            R(this.f55692r, typeface);
            R(this.f55699y, typeface);
        }
    }

    void V(CharSequence charSequence) {
        h();
        this.f55690p = charSequence;
        this.f55692r.setText(charSequence);
        int i10 = this.f55688n;
        if (i10 != 1) {
            this.f55689o = 1;
        }
        X(i10, this.f55689o, U(this.f55692r, charSequence));
    }

    void W(CharSequence charSequence) {
        h();
        this.f55697w = charSequence;
        this.f55699y.setText(charSequence);
        int i10 = this.f55688n;
        if (i10 != 2) {
            this.f55689o = 2;
        }
        X(i10, this.f55689o, U(this.f55699y, charSequence));
    }

    void e(TextView textView, int i10) {
        if (this.f55683i == null && this.f55685k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f55681g);
            this.f55683i = linearLayout;
            linearLayout.setOrientation(0);
            this.f55682h.addView(this.f55683i, -1, -2);
            this.f55685k = new FrameLayout(this.f55681g);
            this.f55683i.addView(this.f55685k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f55682h.getEditText() != null) {
                f();
            }
        }
        if (E(i10)) {
            this.f55685k.setVisibility(0);
            this.f55685k.addView(textView);
        } else {
            this.f55683i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f55683i.setVisibility(0);
        this.f55684j++;
    }

    void f() {
        if (g()) {
            EditText editText = this.f55682h.getEditText();
            boolean zI = com.google.android.material.resources.c.i(this.f55681g);
            LinearLayout linearLayout = this.f55683i;
            int i10 = R.dimen.material_helper_text_font_1_3_padding_horizontal;
            j1.d2(linearLayout, x(zI, i10, j1.k0(editText)), x(zI, R.dimen.material_helper_text_font_1_3_padding_top, this.f55681g.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top)), x(zI, i10, j1.j0(editText)), 0);
        }
    }

    void h() {
        Animator animator = this.f55686l;
        if (animator != null) {
            animator.cancel();
        }
    }

    boolean l() {
        return C(this.f55688n);
    }

    boolean m() {
        return C(this.f55689o);
    }

    int o() {
        return this.f55694t;
    }

    @p0
    CharSequence p() {
        return this.f55693s;
    }

    @p0
    CharSequence q() {
        return this.f55690p;
    }

    @androidx.annotation.l
    int r() {
        TextView textView = this.f55692r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    @p0
    ColorStateList s() {
        TextView textView = this.f55692r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    CharSequence t() {
        return this.f55697w;
    }

    @p0
    View u() {
        return this.f55699y;
    }

    @p0
    ColorStateList v() {
        TextView textView = this.f55699y;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    @androidx.annotation.l
    int w() {
        TextView textView = this.f55699y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    boolean y() {
        return D(this.f55688n);
    }

    boolean z() {
        return D(this.f55689o);
    }
}
