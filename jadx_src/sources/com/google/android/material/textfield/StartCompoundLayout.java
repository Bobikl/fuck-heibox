package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.e1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.x0;
import androidx.core.view.j1;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.j0;

/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"ViewConstructor"})
public class StartCompoundLayout extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextInputLayout f55560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextView f55561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private CharSequence f55562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CheckableImageButton f55563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ColorStateList f55564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f55565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f55566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @n0
    private ImageView.ScaleType f55567i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View.OnLongClickListener f55568j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f55569k;

    StartCompoundLayout(TextInputLayout textInputLayout, x0 x0Var) {
        super(textInputLayout.getContext());
        this.f55560b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, androidx.core.view.n.f21701b));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f55563e = checkableImageButton;
        s.e(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f55561c = appCompatTextView;
        b(x0Var);
        a(x0Var);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    private void a(x0 x0Var) {
        this.f55561c.setVisibility(8);
        this.f55561c.setId(R.id.textinput_prefix_text);
        this.f55561c.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        j1.D1(this.f55561c, 1);
        setPrefixTextAppearance(x0Var.u(R.styleable.TextInputLayout_prefixTextAppearance, 0));
        int i10 = R.styleable.TextInputLayout_prefixTextColor;
        if (x0Var.C(i10)) {
            setPrefixTextColor(x0Var.d(i10));
        }
        setPrefixText(x0Var.x(R.styleable.TextInputLayout_prefixText));
    }

    private void b(x0 x0Var) {
        if (com.google.android.material.resources.c.i(getContext())) {
            androidx.core.view.s.g((ViewGroup.MarginLayoutParams) this.f55563e.getLayoutParams(), 0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        int i10 = R.styleable.TextInputLayout_startIconTint;
        if (x0Var.C(i10)) {
            this.f55564f = com.google.android.material.resources.c.b(getContext(), x0Var, i10);
        }
        int i11 = R.styleable.TextInputLayout_startIconTintMode;
        if (x0Var.C(i11)) {
            this.f55565g = j0.r(x0Var.o(i11, -1), null);
        }
        int i12 = R.styleable.TextInputLayout_startIconDrawable;
        if (x0Var.C(i12)) {
            setStartIconDrawable(x0Var.h(i12));
            int i13 = R.styleable.TextInputLayout_startIconContentDescription;
            if (x0Var.C(i13)) {
                setStartIconContentDescription(x0Var.x(i13));
            }
            setStartIconCheckable(x0Var.a(R.styleable.TextInputLayout_startIconCheckable, true));
        }
        setStartIconMinSize(x0Var.g(R.styleable.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size)));
        int i14 = R.styleable.TextInputLayout_startIconScaleType;
        if (x0Var.C(i14)) {
            setStartIconScaleType(s.b(x0Var.o(i14, -1)));
        }
    }

    private void h() {
        int i10 = (this.f55562d == null || this.f55569k) ? 8 : 0;
        setVisibility(this.f55563e.getVisibility() == 0 || i10 == 0 ? 0 : 8);
        this.f55561c.setVisibility(i10);
        this.f55560b.D0();
    }

    boolean c() {
        return this.f55563e.a();
    }

    boolean d() {
        return this.f55563e.getVisibility() == 0;
    }

    void e(boolean z10) {
        this.f55569k = z10;
        h();
    }

    void f() {
        s.d(this.f55560b, this.f55563e, this.f55564f);
    }

    void g() {
        EditText editText = this.f55560b.f55590e;
        if (editText == null) {
            return;
        }
        j1.d2(this.f55561c, d() ? 0 : j1.k0(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    @p0
    CharSequence getPrefixText() {
        return this.f55562d;
    }

    @p0
    ColorStateList getPrefixTextColor() {
        return this.f55561c.getTextColors();
    }

    @n0
    TextView getPrefixTextView() {
        return this.f55561c;
    }

    @p0
    CharSequence getStartIconContentDescription() {
        return this.f55563e.getContentDescription();
    }

    @p0
    Drawable getStartIconDrawable() {
        return this.f55563e.getDrawable();
    }

    int getStartIconMinSize() {
        return this.f55566h;
    }

    @n0
    ImageView.ScaleType getStartIconScaleType() {
        return this.f55567i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        g();
    }

    void setPrefixText(@p0 CharSequence charSequence) {
        this.f55562d = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f55561c.setText(charSequence);
        h();
    }

    void setPrefixTextAppearance(@e1 int i10) {
        androidx.core.widget.q.E(this.f55561c, i10);
    }

    void setPrefixTextColor(@n0 ColorStateList colorStateList) {
        this.f55561c.setTextColor(colorStateList);
    }

    void setStartIconCheckable(boolean z10) {
        this.f55563e.setCheckable(z10);
    }

    void setStartIconContentDescription(@p0 CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f55563e.setContentDescription(charSequence);
        }
    }

    void setStartIconDrawable(@p0 Drawable drawable) {
        this.f55563e.setImageDrawable(drawable);
        if (drawable != null) {
            s.a(this.f55560b, this.f55563e, this.f55564f, this.f55565g);
            setStartIconVisible(true);
            f();
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription(null);
        }
    }

    void setStartIconMinSize(@t0 int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i10 != this.f55566h) {
            this.f55566h = i10;
            s.g(this.f55563e, i10);
        }
    }

    void setStartIconOnClickListener(@p0 View.OnClickListener onClickListener) {
        s.h(this.f55563e, onClickListener, this.f55568j);
    }

    void setStartIconOnLongClickListener(@p0 View.OnLongClickListener onLongClickListener) {
        this.f55568j = onLongClickListener;
        s.i(this.f55563e, onLongClickListener);
    }

    void setStartIconScaleType(@n0 ImageView.ScaleType scaleType) {
        this.f55567i = scaleType;
        s.j(this.f55563e, scaleType);
    }

    void setStartIconTintList(@p0 ColorStateList colorStateList) {
        if (this.f55564f != colorStateList) {
            this.f55564f = colorStateList;
            s.a(this.f55560b, this.f55563e, colorStateList, this.f55565g);
        }
    }

    void setStartIconTintMode(@p0 PorterDuff.Mode mode) {
        if (this.f55565g != mode) {
            this.f55565g = mode;
            s.a(this.f55560b, this.f55563e, this.f55564f, mode);
        }
    }

    void setStartIconVisible(boolean z10) {
        if (d() != z10) {
            this.f55563e.setVisibility(z10 ? 0 : 8);
            g();
            h();
        }
    }

    void setupAccessibilityNodeInfo(@n0 androidx.core.view.accessibility.a0 a0Var) {
        if (this.f55561c.getVisibility() != 0) {
            a0Var.Y1(this.f55563e);
        } else {
            a0Var.t1(this.f55561c);
            a0Var.Y1(this.f55561c);
        }
    }
}
