package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.d0;
import androidx.annotation.d1;
import androidx.annotation.e1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.x0;
import androidx.core.view.j1;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.b0;
import com.google.android.material.internal.j0;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"ViewConstructor"})
public class EndCompoundLayout extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final TextInputLayout f55518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    private final FrameLayout f55519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    private final CheckableImageButton f55520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ColorStateList f55521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PorterDuff.Mode f55522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View.OnLongClickListener f55523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    private final CheckableImageButton f55524h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final d f55525i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f55526j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final LinkedHashSet<TextInputLayout.j> f55527k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ColorStateList f55528l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private PorterDuff.Mode f55529m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f55530n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @n0
    private ImageView.ScaleType f55531o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private View.OnLongClickListener f55532p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @p0
    private CharSequence f55533q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @n0
    private final TextView f55534r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f55535s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private EditText f55536t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @p0
    private final AccessibilityManager f55537u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @p0
    private androidx.core.view.accessibility.c.e f55538v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final TextWatcher f55539w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final TextInputLayout.i f55540x;

    public class a extends b0 {
        a() {
        }

        @Override // com.google.android.material.internal.b0, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            EndCompoundLayout.this.getEndIconDelegate().a(editable);
        }

        @Override // com.google.android.material.internal.b0, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            EndCompoundLayout.this.getEndIconDelegate().b(charSequence, i10, i11, i12);
        }
    }

    public class b implements TextInputLayout.i {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.i
        public void a(@n0 TextInputLayout textInputLayout) {
            if (EndCompoundLayout.this.f55536t == textInputLayout.getEditText()) {
                return;
            }
            if (EndCompoundLayout.this.f55536t != null) {
                EndCompoundLayout.this.f55536t.removeTextChangedListener(EndCompoundLayout.this.f55539w);
                if (EndCompoundLayout.this.f55536t.getOnFocusChangeListener() == EndCompoundLayout.this.getEndIconDelegate().e()) {
                    EndCompoundLayout.this.f55536t.setOnFocusChangeListener(null);
                }
            }
            EndCompoundLayout.this.f55536t = textInputLayout.getEditText();
            if (EndCompoundLayout.this.f55536t != null) {
                EndCompoundLayout.this.f55536t.addTextChangedListener(EndCompoundLayout.this.f55539w);
            }
            EndCompoundLayout.this.getEndIconDelegate().n(EndCompoundLayout.this.f55536t);
            EndCompoundLayout endCompoundLayout = EndCompoundLayout.this;
            endCompoundLayout.setOnFocusChangeListenersIfNeeded(endCompoundLayout.getEndIconDelegate());
        }
    }

    public class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            EndCompoundLayout.this.h();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            EndCompoundLayout.this.C();
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseArray<r> f55544a = new SparseArray<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final EndCompoundLayout f55545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f55546c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f55547d;

        d(EndCompoundLayout endCompoundLayout, x0 x0Var) {
            this.f55545b = endCompoundLayout;
            this.f55546c = x0Var.u(R.styleable.TextInputLayout_endIconDrawable, 0);
            this.f55547d = x0Var.u(R.styleable.TextInputLayout_passwordToggleDrawable, 0);
        }

        private r b(int i10) {
            if (i10 == -1) {
                return new g(this.f55545b);
            }
            if (i10 == 0) {
                return new u(this.f55545b);
            }
            if (i10 == 1) {
                return new w(this.f55545b, this.f55547d);
            }
            if (i10 == 2) {
                return new f(this.f55545b);
            }
            if (i10 == 3) {
                return new p(this.f55545b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i10);
        }

        r c(int i10) {
            r rVar = this.f55544a.get(i10);
            if (rVar != null) {
                return rVar;
            }
            r rVarB = b(i10);
            this.f55544a.append(i10, rVarB);
            return rVarB;
        }
    }

    EndCompoundLayout(TextInputLayout textInputLayout, x0 x0Var) {
        super(textInputLayout.getContext());
        this.f55526j = 0;
        this.f55527k = new LinkedHashSet<>();
        this.f55539w = new a();
        b bVar = new b();
        this.f55540x = bVar;
        this.f55537u = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f55518b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, androidx.core.view.n.f21702c));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f55519c = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonK = k(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f55520d = checkableImageButtonK;
        CheckableImageButton checkableImageButtonK2 = k(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f55524h = checkableImageButtonK2;
        this.f55525i = new d(this, x0Var);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f55534r = appCompatTextView;
        p(x0Var);
        o(x0Var);
        q(x0Var);
        frameLayout.addView(checkableImageButtonK2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonK);
        textInputLayout.h(bVar);
        addOnAttachStateChangeListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        AccessibilityManager accessibilityManager;
        androidx.core.view.accessibility.c.e eVar = this.f55538v;
        if (eVar == null || (accessibilityManager = this.f55537u) == null) {
            return;
        }
        androidx.core.view.accessibility.c.g(accessibilityManager, eVar);
    }

    private void D(@n0 r rVar) {
        C();
        this.f55538v = null;
        rVar.u();
    }

    private void E(boolean z10) {
        if (!z10 || getEndIconDrawable() == null) {
            s.a(this.f55518b, this.f55524h, this.f55528l, this.f55529m);
            return;
        }
        Drawable drawableMutate = androidx.core.graphics.drawable.d.r(getEndIconDrawable()).mutate();
        androidx.core.graphics.drawable.d.n(drawableMutate, this.f55518b.getErrorCurrentTextColors());
        this.f55524h.setImageDrawable(drawableMutate);
    }

    private void G() {
        this.f55519c.setVisibility((this.f55524h.getVisibility() != 0 || u()) ? 8 : 0);
        setVisibility(t() || u() || ((this.f55533q == null || this.f55535s) ? '\b' : (char) 0) == 0 ? 0 : 8);
    }

    private void H() {
        this.f55520d.setVisibility(getErrorIconDrawable() != null && this.f55518b.S() && this.f55518b.s0() ? 0 : 8);
        G();
        I();
        if (n()) {
            return;
        }
        this.f55518b.D0();
    }

    private void J() {
        int visibility = this.f55534r.getVisibility();
        int i10 = (this.f55533q == null || this.f55535s) ? 8 : 0;
        if (visibility != i10) {
            getEndIconDelegate().q(i10 == 0);
        }
        G();
        this.f55534r.setVisibility(i10);
        this.f55518b.D0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.f55538v == null || this.f55537u == null || !j1.O0(this)) {
            return;
        }
        androidx.core.view.accessibility.c.b(this.f55537u, this.f55538v);
    }

    private CheckableImageButton k(ViewGroup viewGroup, LayoutInflater layoutInflater, @d0 int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i10);
        s.e(checkableImageButton);
        if (com.google.android.material.resources.c.i(getContext())) {
            androidx.core.view.s.h((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    private void l(int i10) {
        Iterator<TextInputLayout.j> it = this.f55527k.iterator();
        while (it.hasNext()) {
            it.next().a(this.f55518b, i10);
        }
    }

    private int m(r rVar) {
        int i10 = this.f55525i.f55546c;
        return i10 == 0 ? rVar.d() : i10;
    }

    private void o(x0 x0Var) {
        int i10 = R.styleable.TextInputLayout_passwordToggleEnabled;
        if (!x0Var.C(i10)) {
            int i11 = R.styleable.TextInputLayout_endIconTint;
            if (x0Var.C(i11)) {
                this.f55528l = com.google.android.material.resources.c.b(getContext(), x0Var, i11);
            }
            int i12 = R.styleable.TextInputLayout_endIconTintMode;
            if (x0Var.C(i12)) {
                this.f55529m = j0.r(x0Var.o(i12, -1), null);
            }
        }
        int i13 = R.styleable.TextInputLayout_endIconMode;
        if (x0Var.C(i13)) {
            setEndIconMode(x0Var.o(i13, 0));
            int i14 = R.styleable.TextInputLayout_endIconContentDescription;
            if (x0Var.C(i14)) {
                setEndIconContentDescription(x0Var.x(i14));
            }
            setEndIconCheckable(x0Var.a(R.styleable.TextInputLayout_endIconCheckable, true));
        } else if (x0Var.C(i10)) {
            int i15 = R.styleable.TextInputLayout_passwordToggleTint;
            if (x0Var.C(i15)) {
                this.f55528l = com.google.android.material.resources.c.b(getContext(), x0Var, i15);
            }
            int i16 = R.styleable.TextInputLayout_passwordToggleTintMode;
            if (x0Var.C(i16)) {
                this.f55529m = j0.r(x0Var.o(i16, -1), null);
            }
            setEndIconMode(x0Var.a(i10, false) ? 1 : 0);
            setEndIconContentDescription(x0Var.x(R.styleable.TextInputLayout_passwordToggleContentDescription));
        }
        setEndIconMinSize(x0Var.g(R.styleable.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size)));
        int i17 = R.styleable.TextInputLayout_endIconScaleType;
        if (x0Var.C(i17)) {
            setEndIconScaleType(s.b(x0Var.o(i17, -1)));
        }
    }

    private void p(x0 x0Var) {
        int i10 = R.styleable.TextInputLayout_errorIconTint;
        if (x0Var.C(i10)) {
            this.f55521e = com.google.android.material.resources.c.b(getContext(), x0Var, i10);
        }
        int i11 = R.styleable.TextInputLayout_errorIconTintMode;
        if (x0Var.C(i11)) {
            this.f55522f = j0.r(x0Var.o(i11, -1), null);
        }
        int i12 = R.styleable.TextInputLayout_errorIconDrawable;
        if (x0Var.C(i12)) {
            setErrorIconDrawable(x0Var.h(i12));
        }
        this.f55520d.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        j1.R1(this.f55520d, 2);
        this.f55520d.setClickable(false);
        this.f55520d.setPressable(false);
        this.f55520d.setFocusable(false);
    }

    private void q(x0 x0Var) {
        this.f55534r.setVisibility(8);
        this.f55534r.setId(R.id.textinput_suffix_text);
        this.f55534r.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        j1.D1(this.f55534r, 1);
        setSuffixTextAppearance(x0Var.u(R.styleable.TextInputLayout_suffixTextAppearance, 0));
        int i10 = R.styleable.TextInputLayout_suffixTextColor;
        if (x0Var.C(i10)) {
            setSuffixTextColor(x0Var.d(i10));
        }
        setSuffixText(x0Var.x(R.styleable.TextInputLayout_suffixText));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnFocusChangeListenersIfNeeded(r rVar) {
        if (this.f55536t == null) {
            return;
        }
        if (rVar.e() != null) {
            this.f55536t.setOnFocusChangeListener(rVar.e());
        }
        if (rVar.g() != null) {
            this.f55524h.setOnFocusChangeListener(rVar.g());
        }
    }

    private void setUpDelegate(@n0 r rVar) {
        rVar.s();
        this.f55538v = rVar.h();
        h();
    }

    void A(boolean z10) {
        boolean z11;
        boolean zIsActivated;
        boolean zIsChecked;
        r endIconDelegate = getEndIconDelegate();
        boolean z12 = true;
        if (!endIconDelegate.l() || (zIsChecked = this.f55524h.isChecked()) == endIconDelegate.m()) {
            z11 = false;
        } else {
            this.f55524h.setChecked(!zIsChecked);
            z11 = true;
        }
        if (!endIconDelegate.j() || (zIsActivated = this.f55524h.isActivated()) == endIconDelegate.k()) {
            z12 = z11;
        } else {
            setEndIconActivated(!zIsActivated);
        }
        if (z10 || z12) {
            y();
        }
    }

    void B(@n0 TextInputLayout.j jVar) {
        this.f55527k.remove(jVar);
    }

    void F(boolean z10) {
        if (this.f55526j == 1) {
            this.f55524h.performClick();
            if (z10) {
                this.f55524h.jumpDrawablesToCurrentState();
            }
        }
    }

    void I() {
        if (this.f55518b.f55590e == null) {
            return;
        }
        j1.d2(this.f55534r, getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), this.f55518b.f55590e.getPaddingTop(), (t() || u()) ? 0 : j1.j0(this.f55518b.f55590e), this.f55518b.f55590e.getPaddingBottom());
    }

    void g(@n0 TextInputLayout.j jVar) {
        this.f55527k.add(jVar);
    }

    @p0
    CheckableImageButton getCurrentEndIconView() {
        if (u()) {
            return this.f55520d;
        }
        if (n() && t()) {
            return this.f55524h;
        }
        return null;
    }

    @p0
    CharSequence getEndIconContentDescription() {
        return this.f55524h.getContentDescription();
    }

    r getEndIconDelegate() {
        return this.f55525i.c(this.f55526j);
    }

    @p0
    Drawable getEndIconDrawable() {
        return this.f55524h.getDrawable();
    }

    int getEndIconMinSize() {
        return this.f55530n;
    }

    int getEndIconMode() {
        return this.f55526j;
    }

    @n0
    ImageView.ScaleType getEndIconScaleType() {
        return this.f55531o;
    }

    CheckableImageButton getEndIconView() {
        return this.f55524h;
    }

    Drawable getErrorIconDrawable() {
        return this.f55520d.getDrawable();
    }

    @p0
    CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f55524h.getContentDescription();
    }

    @p0
    Drawable getPasswordVisibilityToggleDrawable() {
        return this.f55524h.getDrawable();
    }

    @p0
    CharSequence getSuffixText() {
        return this.f55533q;
    }

    @p0
    ColorStateList getSuffixTextColor() {
        return this.f55534r.getTextColors();
    }

    TextView getSuffixTextView() {
        return this.f55534r;
    }

    void i() {
        this.f55524h.performClick();
        this.f55524h.jumpDrawablesToCurrentState();
    }

    void j() {
        this.f55527k.clear();
    }

    boolean n() {
        return this.f55526j != 0;
    }

    boolean r() {
        return this.f55524h.a();
    }

    boolean s() {
        return n() && this.f55524h.isChecked();
    }

    void setEndIconActivated(boolean z10) {
        this.f55524h.setActivated(z10);
    }

    void setEndIconCheckable(boolean z10) {
        this.f55524h.setCheckable(z10);
    }

    void setEndIconContentDescription(@d1 int i10) {
        setEndIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    void setEndIconContentDescription(@p0 CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f55524h.setContentDescription(charSequence);
        }
    }

    void setEndIconDrawable(@androidx.annotation.v int i10) {
        setEndIconDrawable(i10 != 0 ? b0.a.b(getContext(), i10) : null);
    }

    void setEndIconDrawable(@p0 Drawable drawable) {
        this.f55524h.setImageDrawable(drawable);
        if (drawable != null) {
            s.a(this.f55518b, this.f55524h, this.f55528l, this.f55529m);
            y();
        }
    }

    void setEndIconMinSize(@t0 int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i10 != this.f55530n) {
            this.f55530n = i10;
            s.g(this.f55524h, i10);
            s.g(this.f55520d, i10);
        }
    }

    void setEndIconMode(int i10) {
        if (this.f55526j == i10) {
            return;
        }
        D(getEndIconDelegate());
        int i11 = this.f55526j;
        this.f55526j = i10;
        l(i11);
        setEndIconVisible(i10 != 0);
        r endIconDelegate = getEndIconDelegate();
        setEndIconDrawable(m(endIconDelegate));
        setEndIconContentDescription(endIconDelegate.c());
        setEndIconCheckable(endIconDelegate.l());
        if (!endIconDelegate.i(this.f55518b.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f55518b.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        setUpDelegate(endIconDelegate);
        setEndIconOnClickListener(endIconDelegate.f());
        EditText editText = this.f55536t;
        if (editText != null) {
            endIconDelegate.n(editText);
            setOnFocusChangeListenersIfNeeded(endIconDelegate);
        }
        s.a(this.f55518b, this.f55524h, this.f55528l, this.f55529m);
        A(true);
    }

    void setEndIconOnClickListener(@p0 View.OnClickListener onClickListener) {
        s.h(this.f55524h, onClickListener, this.f55532p);
    }

    void setEndIconOnLongClickListener(@p0 View.OnLongClickListener onLongClickListener) {
        this.f55532p = onLongClickListener;
        s.i(this.f55524h, onLongClickListener);
    }

    void setEndIconScaleType(@n0 ImageView.ScaleType scaleType) {
        this.f55531o = scaleType;
        s.j(this.f55524h, scaleType);
        s.j(this.f55520d, scaleType);
    }

    void setEndIconTintList(@p0 ColorStateList colorStateList) {
        if (this.f55528l != colorStateList) {
            this.f55528l = colorStateList;
            s.a(this.f55518b, this.f55524h, colorStateList, this.f55529m);
        }
    }

    void setEndIconTintMode(@p0 PorterDuff.Mode mode) {
        if (this.f55529m != mode) {
            this.f55529m = mode;
            s.a(this.f55518b, this.f55524h, this.f55528l, mode);
        }
    }

    void setEndIconVisible(boolean z10) {
        if (t() != z10) {
            this.f55524h.setVisibility(z10 ? 0 : 8);
            G();
            I();
            this.f55518b.D0();
        }
    }

    void setErrorIconDrawable(@androidx.annotation.v int i10) {
        setErrorIconDrawable(i10 != 0 ? b0.a.b(getContext(), i10) : null);
        z();
    }

    void setErrorIconDrawable(@p0 Drawable drawable) {
        this.f55520d.setImageDrawable(drawable);
        H();
        s.a(this.f55518b, this.f55520d, this.f55521e, this.f55522f);
    }

    void setErrorIconOnClickListener(@p0 View.OnClickListener onClickListener) {
        s.h(this.f55520d, onClickListener, this.f55523g);
    }

    void setErrorIconOnLongClickListener(@p0 View.OnLongClickListener onLongClickListener) {
        this.f55523g = onLongClickListener;
        s.i(this.f55520d, onLongClickListener);
    }

    void setErrorIconTintList(@p0 ColorStateList colorStateList) {
        if (this.f55521e != colorStateList) {
            this.f55521e = colorStateList;
            s.a(this.f55518b, this.f55520d, colorStateList, this.f55522f);
        }
    }

    void setErrorIconTintMode(@p0 PorterDuff.Mode mode) {
        if (this.f55522f != mode) {
            this.f55522f = mode;
            s.a(this.f55518b, this.f55520d, this.f55521e, mode);
        }
    }

    void setPasswordVisibilityToggleContentDescription(@d1 int i10) {
        setPasswordVisibilityToggleContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    void setPasswordVisibilityToggleContentDescription(@p0 CharSequence charSequence) {
        this.f55524h.setContentDescription(charSequence);
    }

    void setPasswordVisibilityToggleDrawable(@androidx.annotation.v int i10) {
        setPasswordVisibilityToggleDrawable(i10 != 0 ? b0.a.b(getContext(), i10) : null);
    }

    void setPasswordVisibilityToggleDrawable(@p0 Drawable drawable) {
        this.f55524h.setImageDrawable(drawable);
    }

    void setPasswordVisibilityToggleEnabled(boolean z10) {
        if (z10 && this.f55526j != 1) {
            setEndIconMode(1);
        } else {
            if (z10) {
                return;
            }
            setEndIconMode(0);
        }
    }

    void setPasswordVisibilityToggleTintList(@p0 ColorStateList colorStateList) {
        this.f55528l = colorStateList;
        s.a(this.f55518b, this.f55524h, colorStateList, this.f55529m);
    }

    void setPasswordVisibilityToggleTintMode(@p0 PorterDuff.Mode mode) {
        this.f55529m = mode;
        s.a(this.f55518b, this.f55524h, this.f55528l, mode);
    }

    void setSuffixText(@p0 CharSequence charSequence) {
        this.f55533q = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f55534r.setText(charSequence);
        J();
    }

    void setSuffixTextAppearance(@e1 int i10) {
        androidx.core.widget.q.E(this.f55534r, i10);
    }

    void setSuffixTextColor(@n0 ColorStateList colorStateList) {
        this.f55534r.setTextColor(colorStateList);
    }

    boolean t() {
        return this.f55519c.getVisibility() == 0 && this.f55524h.getVisibility() == 0;
    }

    boolean u() {
        return this.f55520d.getVisibility() == 0;
    }

    boolean v() {
        return this.f55526j == 1;
    }

    void w(boolean z10) {
        this.f55535s = z10;
        J();
    }

    void x() {
        H();
        z();
        y();
        if (getEndIconDelegate().t()) {
            E(this.f55518b.s0());
        }
    }

    void y() {
        s.d(this.f55518b, this.f55524h, this.f55528l);
    }

    void z() {
        s.d(this.f55518b, this.f55520d, this.f55521e);
    }
}
