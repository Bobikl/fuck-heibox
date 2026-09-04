package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.annotation.d1;
import androidx.annotation.e1;
import androidx.annotation.f0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.b0;
import androidx.appcompat.widget.x0;
import androidx.core.view.j1;
import androidx.customview.view.AbsSavedState;
import androidx.transition.Fade;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.j0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes7.dex */
public class TextInputLayout extends LinearLayout {
    private static final int X3 = 167;
    private static final int Y3 = 87;
    private static final int Z3 = 67;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private static final int f55572a4 = -1;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private static final int f55573b4 = -1;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    private static final String f55575d4 = "TextInputLayout";

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    public static final int f55576e4 = 0;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    public static final int f55577f4 = 1;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    public static final int f55578g4 = 2;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    public static final int f55579h4 = -1;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public static final int f55580i4 = 0;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    public static final int f55581j4 = 1;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    public static final int f55582k4 = 2;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    public static final int f55583l4 = 3;

    @p0
    private ColorStateList A;
    private boolean B;
    private CharSequence C;
    private boolean D;

    @p0
    private com.google.android.material.shape.k E;
    private com.google.android.material.shape.k F;
    private StateListDrawable G;

    @androidx.annotation.l
    private int G2;

    @androidx.annotation.l
    private int G3;
    private boolean H;

    @p0
    private com.google.android.material.shape.k I;

    @p0
    private com.google.android.material.shape.k J;
    private ColorStateList J3;

    @n0
    private com.google.android.material.shape.p K;

    @androidx.annotation.l
    private int K3;
    private boolean L;

    @androidx.annotation.l
    private int L3;
    private final int M;

    @androidx.annotation.l
    private int M3;
    private int N;

    @androidx.annotation.l
    private int N3;
    private int O;

    @androidx.annotation.l
    private int O3;
    private int P;
    private boolean P3;
    private int Q;
    final com.google.android.material.internal.b Q3;
    private int R;
    private boolean R3;

    @androidx.annotation.l
    private int S;
    private boolean S3;

    @androidx.annotation.l
    private int T;
    private ValueAnimator T3;
    private final Rect U;
    private boolean U3;
    private final Rect V;
    private boolean V3;
    private final RectF W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private Typeface f55584a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final FrameLayout f55585b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @p0
    private Drawable f55586b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    private final StartCompoundLayout f55587c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f55588c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    private final EndCompoundLayout f55589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    EditText f55590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f55591f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f55592g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f55593h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f55594i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f55595j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final t f55596k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f55597l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f55598m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f55599n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @n0
    private h f55600o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private TextView f55601p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private final LinkedHashSet<i> f55602p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private Drawable f55603p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @androidx.annotation.l
    private int f55604p3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f55605q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f55606r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f55607s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f55608t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private TextView f55609u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @p0
    private ColorStateList f55610v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f55611w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @p0
    private Fade f55612x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @p0
    private Drawable f55613x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private ColorStateList f55614x2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @p0
    private Fade f55615y;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private int f55616y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private ColorStateList f55617y2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @p0
    private ColorStateList f55618z;
    private static final int W3 = R.style.Widget_Design_TextInputLayout;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    private static final int[][] f55574c4 = {new int[]{android.R.attr.state_pressed}, new int[0]};

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        CharSequence f55619b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f55620c;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @p0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@n0 Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @n0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@n0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @n0
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(@n0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f55619b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f55620c = parcel.readInt() == 1;
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @n0
        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f55619b) + z5.g.f141884d;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@n0 Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f55619b, parcel, i10);
            parcel.writeInt(this.f55620c ? 1 : 0);
        }
    }

    public class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@n0 Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.I0(!textInputLayout.V3);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f55597l) {
                textInputLayout2.z0(editable);
            }
            if (TextInputLayout.this.f55608t) {
                TextInputLayout.this.M0(editable);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f55589d.i();
        }
    }

    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f55590e.requestLayout();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@n0 ValueAnimator valueAnimator) {
            TextInputLayout.this.Q3.A0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends androidx.core.view.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextInputLayout f55625a;

        public e(@n0 TextInputLayout textInputLayout) {
            this.f55625a = textInputLayout;
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(@n0 View view, @n0 androidx.core.view.accessibility.a0 a0Var) {
            super.onInitializeAccessibilityNodeInfo(view, a0Var);
            EditText editText = this.f55625a.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f55625a.getHint();
            CharSequence error = this.f55625a.getError();
            CharSequence placeholderText = this.f55625a.getPlaceholderText();
            int counterMaxLength = this.f55625a.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f55625a.getCounterOverflowDescription();
            boolean z10 = !TextUtils.isEmpty(text);
            boolean z11 = !TextUtils.isEmpty(hint);
            boolean z12 = !this.f55625a.Y();
            boolean z13 = !TextUtils.isEmpty(error);
            boolean z14 = z13 || !TextUtils.isEmpty(counterOverflowDescription);
            String string = z11 ? hint.toString() : "";
            this.f55625a.f55587c.setupAccessibilityNodeInfo(a0Var);
            if (z10) {
                a0Var.S1(text);
            } else if (!TextUtils.isEmpty(string)) {
                a0Var.S1(string);
                if (z12 && placeholderText != null) {
                    a0Var.S1(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                a0Var.S1(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    a0Var.q1(string);
                } else {
                    if (z10) {
                        string = ((Object) text) + ", " + string;
                    }
                    a0Var.S1(string);
                }
                a0Var.O1(!z10);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            a0Var.z1(counterMaxLength);
            if (z14) {
                if (!z13) {
                    error = counterOverflowDescription;
                }
                a0Var.m1(error);
            }
            View viewU = this.f55625a.f55596k.u();
            if (viewU != null) {
                a0Var.t1(viewU);
            }
            this.f55625a.f55589d.getEndIconDelegate().o(view, a0Var);
        }

        @Override // androidx.core.view.a
        public void onPopulateAccessibilityEvent(@n0 View view, @n0 AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            this.f55625a.f55589d.getEndIconDelegate().p(view, accessibilityEvent);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface g {
    }

    public interface h {
        int a(@p0 Editable editable);
    }

    public interface i {
        void a(@n0 TextInputLayout textInputLayout);
    }

    public interface j {
        void a(@n0 TextInputLayout textInputLayout, int i10);
    }

    public TextInputLayout(@n0 Context context) {
        this(context, null);
    }

    public TextInputLayout(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textInputStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v66 */
    public TextInputLayout(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        ?? r10;
        int i11 = W3;
        super(j9.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f55592g = -1;
        this.f55593h = -1;
        this.f55594i = -1;
        this.f55595j = -1;
        this.f55596k = new t(this);
        this.f55600o = new h() { // from class: com.google.android.material.textfield.a0
            @Override // com.google.android.material.textfield.TextInputLayout.h
            public final int a(Editable editable) {
                return TextInputLayout.e0(editable);
            }
        };
        this.U = new Rect();
        this.V = new Rect();
        this.W = new RectF();
        this.f55602p1 = new LinkedHashSet<>();
        com.google.android.material.internal.b bVar = new com.google.android.material.internal.b(this);
        this.Q3 = bVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f55585b = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = com.google.android.material.animation.b.f52896a;
        bVar.N0(timeInterpolator);
        bVar.I0(timeInterpolator);
        bVar.l0(8388659);
        int[] iArr = R.styleable.B1;
        int i12 = R.styleable.TextInputLayout_counterTextAppearance;
        int i13 = R.styleable.TextInputLayout_counterOverflowTextAppearance;
        int i14 = R.styleable.TextInputLayout_errorTextAppearance;
        int i15 = R.styleable.TextInputLayout_helperTextTextAppearance;
        int i16 = R.styleable.TextInputLayout_hintTextAppearance;
        x0 x0VarL = c0.l(context2, attributeSet, iArr, i10, i11, i12, i13, i14, i15, i16);
        StartCompoundLayout startCompoundLayout = new StartCompoundLayout(this, x0VarL);
        this.f55587c = startCompoundLayout;
        this.B = x0VarL.a(R.styleable.TextInputLayout_hintEnabled, true);
        setHint(x0VarL.x(R.styleable.TextInputLayout_android_hint));
        this.S3 = x0VarL.a(R.styleable.TextInputLayout_hintAnimationEnabled, true);
        this.R3 = x0VarL.a(R.styleable.TextInputLayout_expandedHintEnabled, true);
        int i17 = R.styleable.TextInputLayout_android_minEms;
        if (x0VarL.C(i17)) {
            setMinEms(x0VarL.o(i17, -1));
        } else {
            int i18 = R.styleable.TextInputLayout_android_minWidth;
            if (x0VarL.C(i18)) {
                setMinWidth(x0VarL.g(i18, -1));
            }
        }
        int i19 = R.styleable.TextInputLayout_android_maxEms;
        if (x0VarL.C(i19)) {
            setMaxEms(x0VarL.o(i19, -1));
        } else {
            int i20 = R.styleable.TextInputLayout_android_maxWidth;
            if (x0VarL.C(i20)) {
                setMaxWidth(x0VarL.g(i20, -1));
            }
        }
        this.K = com.google.android.material.shape.p.e(context2, attributeSet, i10, i11).m();
        this.M = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.O = x0VarL.f(R.styleable.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.Q = x0VarL.g(R.styleable.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.R = x0VarL.g(R.styleable.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.P = this.Q;
        float fE = x0VarL.e(R.styleable.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float fE2 = x0VarL.e(R.styleable.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float fE3 = x0VarL.e(R.styleable.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float fE4 = x0VarL.e(R.styleable.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        com.google.android.material.shape.p.b bVarV = this.K.v();
        if (fE >= 0.0f) {
            bVarV.K(fE);
        }
        if (fE2 >= 0.0f) {
            bVarV.P(fE2);
        }
        if (fE3 >= 0.0f) {
            bVarV.C(fE3);
        }
        if (fE4 >= 0.0f) {
            bVarV.x(fE4);
        }
        this.K = bVarV.m();
        ColorStateList colorStateListB = com.google.android.material.resources.c.b(context2, x0VarL, R.styleable.TextInputLayout_boxBackgroundColor);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.K3 = defaultColor;
            this.T = defaultColor;
            if (colorStateListB.isStateful()) {
                this.L3 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.M3 = colorStateListB.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
                this.N3 = colorStateListB.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            } else {
                this.M3 = this.K3;
                ColorStateList colorStateListA = b0.a.a(context2, R.color.mtrl_filled_background_color);
                this.L3 = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                this.N3 = colorStateListA.getColorForState(new int[]{android.R.attr.state_hovered}, -1);
            }
        } else {
            this.T = 0;
            this.K3 = 0;
            this.L3 = 0;
            this.M3 = 0;
            this.N3 = 0;
        }
        int i21 = R.styleable.TextInputLayout_android_textColorHint;
        if (x0VarL.C(i21)) {
            ColorStateList colorStateListD = x0VarL.d(i21);
            this.f55617y2 = colorStateListD;
            this.f55614x2 = colorStateListD;
        }
        int i22 = R.styleable.TextInputLayout_boxStrokeColor;
        ColorStateList colorStateListB2 = com.google.android.material.resources.c.b(context2, x0VarL, i22);
        this.G3 = x0VarL.c(i22, 0);
        this.G2 = androidx.core.content.d.f(context2, R.color.mtrl_textinput_default_box_stroke_color);
        this.O3 = androidx.core.content.d.f(context2, R.color.mtrl_textinput_disabled_color);
        this.f55604p3 = androidx.core.content.d.f(context2, R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListB2 != null) {
            setBoxStrokeColorStateList(colorStateListB2);
        }
        int i23 = R.styleable.TextInputLayout_boxStrokeErrorColor;
        if (x0VarL.C(i23)) {
            setBoxStrokeErrorColor(com.google.android.material.resources.c.b(context2, x0VarL, i23));
        }
        if (x0VarL.u(i16, -1) != -1) {
            r10 = 0;
            setHintTextAppearance(x0VarL.u(i16, 0));
        } else {
            r10 = 0;
        }
        int iU = x0VarL.u(i14, r10);
        CharSequence charSequenceX = x0VarL.x(R.styleable.TextInputLayout_errorContentDescription);
        int iO = x0VarL.o(R.styleable.TextInputLayout_errorAccessibilityLiveRegion, 1);
        boolean zA = x0VarL.a(R.styleable.TextInputLayout_errorEnabled, r10);
        int iU2 = x0VarL.u(i15, r10);
        boolean zA2 = x0VarL.a(R.styleable.TextInputLayout_helperTextEnabled, r10);
        CharSequence charSequenceX2 = x0VarL.x(R.styleable.TextInputLayout_helperText);
        int iU3 = x0VarL.u(R.styleable.TextInputLayout_placeholderTextAppearance, r10);
        CharSequence charSequenceX3 = x0VarL.x(R.styleable.TextInputLayout_placeholderText);
        boolean zA3 = x0VarL.a(R.styleable.TextInputLayout_counterEnabled, r10);
        setCounterMaxLength(x0VarL.o(R.styleable.TextInputLayout_counterMaxLength, -1));
        this.f55606r = x0VarL.u(i12, 0);
        this.f55605q = x0VarL.u(i13, 0);
        setBoxBackgroundMode(x0VarL.o(R.styleable.TextInputLayout_boxBackgroundMode, 0));
        setErrorContentDescription(charSequenceX);
        setErrorAccessibilityLiveRegion(iO);
        setCounterOverflowTextAppearance(this.f55605q);
        setHelperTextTextAppearance(iU2);
        setErrorTextAppearance(iU);
        setCounterTextAppearance(this.f55606r);
        setPlaceholderText(charSequenceX3);
        setPlaceholderTextAppearance(iU3);
        int i24 = R.styleable.TextInputLayout_errorTextColor;
        if (x0VarL.C(i24)) {
            setErrorTextColor(x0VarL.d(i24));
        }
        int i25 = R.styleable.TextInputLayout_helperTextTextColor;
        if (x0VarL.C(i25)) {
            setHelperTextColor(x0VarL.d(i25));
        }
        int i26 = R.styleable.TextInputLayout_hintTextColor;
        if (x0VarL.C(i26)) {
            setHintTextColor(x0VarL.d(i26));
        }
        int i27 = R.styleable.TextInputLayout_counterTextColor;
        if (x0VarL.C(i27)) {
            setCounterTextColor(x0VarL.d(i27));
        }
        int i28 = R.styleable.TextInputLayout_counterOverflowTextColor;
        if (x0VarL.C(i28)) {
            setCounterOverflowTextColor(x0VarL.d(i28));
        }
        int i29 = R.styleable.TextInputLayout_placeholderTextColor;
        if (x0VarL.C(i29)) {
            setPlaceholderTextColor(x0VarL.d(i29));
        }
        EndCompoundLayout endCompoundLayout = new EndCompoundLayout(this, x0VarL);
        this.f55589d = endCompoundLayout;
        boolean zA4 = x0VarL.a(R.styleable.TextInputLayout_android_enabled, true);
        x0VarL.I();
        j1.R1(this, 2);
        if (Build.VERSION.SDK_INT >= 26) {
            j1.S1(this, 1);
        }
        frameLayout.addView(startCompoundLayout);
        frameLayout.addView(endCompoundLayout);
        addView(frameLayout);
        setEnabled(zA4);
        setHelperTextEnabled(zA2);
        setErrorEnabled(zA);
        setCounterEnabled(zA3);
        setHelperText(charSequenceX2);
    }

    private void A() {
        if (D()) {
            ((com.google.android.material.textfield.h) this.E).T0();
        }
    }

    private static void A0(@n0 Context context, @n0 TextView textView, int i10, int i11, boolean z10) {
        textView.setContentDescription(context.getString(z10 ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    private void B(boolean z10) {
        ValueAnimator valueAnimator = this.T3;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.T3.cancel();
        }
        if (z10 && this.S3) {
            l(1.0f);
        } else {
            this.Q3.A0(1.0f);
        }
        this.P3 = false;
        if (D()) {
            g0();
        }
        L0();
        this.f55587c.e(false);
        this.f55589d.w(false);
    }

    private void B0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f55601p;
        if (textView != null) {
            r0(textView, this.f55599n ? this.f55605q : this.f55606r);
            if (!this.f55599n && (colorStateList2 = this.f55618z) != null) {
                this.f55601p.setTextColor(colorStateList2);
            }
            if (!this.f55599n || (colorStateList = this.A) == null) {
                return;
            }
            this.f55601p.setTextColor(colorStateList);
        }
    }

    private Fade C() {
        Fade fade = new Fade();
        fade.w0(i9.a.f(getContext(), R.attr.motionDurationShort2, 87));
        fade.y0(i9.a.g(getContext(), R.attr.motionEasingLinearInterpolator, com.google.android.material.animation.b.f52896a));
        return fade;
    }

    @TargetApi(29)
    private void C0(boolean z10) {
        ColorStateList colorStateListJ = com.google.android.material.color.m.j(getContext(), R.attr.colorControlActivated);
        EditText editText = this.f55590e;
        if (editText == null || editText.getTextCursorDrawable() == null || colorStateListJ == null) {
            return;
        }
        Drawable textCursorDrawable = this.f55590e.getTextCursorDrawable();
        if (z10) {
            ColorStateList colorStateListValueOf = this.J3;
            if (colorStateListValueOf == null) {
                colorStateListValueOf = ColorStateList.valueOf(this.S);
            }
            colorStateListJ = colorStateListValueOf;
        }
        androidx.core.graphics.drawable.d.o(textCursorDrawable, colorStateListJ);
    }

    private boolean D() {
        return this.B && !TextUtils.isEmpty(this.C) && (this.E instanceof com.google.android.material.textfield.h);
    }

    private void F() {
        Iterator<i> it = this.f55602p1.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private void G(Canvas canvas) {
        com.google.android.material.shape.k kVar;
        if (this.J == null || (kVar = this.I) == null) {
            return;
        }
        kVar.draw(canvas);
        if (this.f55590e.isFocused()) {
            Rect bounds = this.J.getBounds();
            Rect bounds2 = this.I.getBounds();
            float fG = this.Q3.G();
            int iCenterX = bounds2.centerX();
            bounds.left = com.google.android.material.animation.b.c(iCenterX, bounds2.left, fG);
            bounds.right = com.google.android.material.animation.b.c(iCenterX, bounds2.right, fG);
            this.J.draw(canvas);
        }
    }

    private boolean G0() {
        int iMax;
        if (this.f55590e == null || this.f55590e.getMeasuredHeight() >= (iMax = Math.max(this.f55589d.getMeasuredHeight(), this.f55587c.getMeasuredHeight()))) {
            return false;
        }
        this.f55590e.setMinimumHeight(iMax);
        return true;
    }

    private void H(@n0 Canvas canvas) {
        if (this.B) {
            this.Q3.l(canvas);
        }
    }

    private void H0() {
        if (this.N != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f55585b.getLayoutParams();
            int iV = v();
            if (iV != layoutParams.topMargin) {
                layoutParams.topMargin = iV;
                this.f55585b.requestLayout();
            }
        }
    }

    private void I(boolean z10) {
        ValueAnimator valueAnimator = this.T3;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.T3.cancel();
        }
        if (z10 && this.S3) {
            l(0.0f);
        } else {
            this.Q3.A0(0.0f);
        }
        if (D() && ((com.google.android.material.textfield.h) this.E).S0()) {
            A();
        }
        this.P3 = true;
        O();
        this.f55587c.e(true);
        this.f55589d.w(true);
    }

    private com.google.android.material.shape.k J(boolean z10) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float f10 = z10 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f55590e;
        float popupElevation = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).getPopupElevation() : getResources().getDimensionPixelOffset(R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        com.google.android.material.shape.p pVarM = com.google.android.material.shape.p.a().K(f10).P(f10).x(dimensionPixelOffset).C(dimensionPixelOffset).m();
        com.google.android.material.shape.k kVarN = com.google.android.material.shape.k.n(getContext(), popupElevation);
        kVarN.setShapeAppearanceModel(pVarM);
        kVarN.q0(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return kVarN;
    }

    private void J0(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f55590e;
        boolean z12 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f55590e;
        boolean z13 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f55614x2;
        if (colorStateList2 != null) {
            this.Q3.f0(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f55614x2;
            this.Q3.f0(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.O3) : this.O3));
        } else if (s0()) {
            this.Q3.f0(this.f55596k.s());
        } else if (this.f55599n && (textView = this.f55601p) != null) {
            this.Q3.f0(textView.getTextColors());
        } else if (z13 && (colorStateList = this.f55617y2) != null) {
            this.Q3.k0(colorStateList);
        }
        if (z12 || !this.R3 || (isEnabled() && z13)) {
            if (z11 || this.P3) {
                B(z10);
                return;
            }
            return;
        }
        if (z11 || !this.P3) {
            I(z10);
        }
    }

    private static Drawable K(com.google.android.material.shape.k kVar, int i10, int i11, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{com.google.android.material.color.m.o(i11, i10, 0.1f), i10}), kVar, kVar);
    }

    private void K0() {
        EditText editText;
        if (this.f55609u == null || (editText = this.f55590e) == null) {
            return;
        }
        this.f55609u.setGravity(editText.getGravity());
        this.f55609u.setPadding(this.f55590e.getCompoundPaddingLeft(), this.f55590e.getCompoundPaddingTop(), this.f55590e.getCompoundPaddingRight(), this.f55590e.getCompoundPaddingBottom());
    }

    private int L(int i10, boolean z10) {
        int compoundPaddingLeft = i10 + this.f55590e.getCompoundPaddingLeft();
        return (getPrefixText() == null || z10) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    private void L0() {
        EditText editText = this.f55590e;
        M0(editText == null ? null : editText.getText());
    }

    private int M(int i10, boolean z10) {
        int compoundPaddingRight = i10 - this.f55590e.getCompoundPaddingRight();
        return (getPrefixText() == null || !z10) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M0(@p0 Editable editable) {
        if (this.f55600o.a(editable) != 0 || this.P3) {
            O();
        } else {
            v0();
        }
    }

    private static Drawable N(Context context, com.google.android.material.shape.k kVar, int i10, int[][] iArr) {
        int iC = com.google.android.material.color.m.c(context, R.attr.colorSurface, f55575d4);
        com.google.android.material.shape.k kVar2 = new com.google.android.material.shape.k(kVar.getShapeAppearanceModel());
        int iO = com.google.android.material.color.m.o(i10, iC, 0.1f);
        kVar2.o0(new ColorStateList(iArr, new int[]{iO, 0}));
        kVar2.setTint(iC);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iO, iC});
        com.google.android.material.shape.k kVar3 = new com.google.android.material.shape.k(kVar.getShapeAppearanceModel());
        kVar3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, kVar2, kVar3), kVar});
    }

    private void N0(boolean z10, boolean z11) {
        int defaultColor = this.J3.getDefaultColor();
        int colorForState = this.J3.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.J3.getColorForState(new int[]{android.R.attr.state_activated, android.R.attr.state_enabled}, defaultColor);
        if (z10) {
            this.S = colorForState2;
        } else if (z11) {
            this.S = colorForState;
        } else {
            this.S = defaultColor;
        }
    }

    private void O() {
        TextView textView = this.f55609u;
        if (textView == null || !this.f55608t) {
            return;
        }
        textView.setText((CharSequence) null);
        androidx.transition.v.b(this.f55585b, this.f55615y);
        this.f55609u.setVisibility(4);
    }

    private boolean b0() {
        return this.N == 1 && this.f55590e.getMinLines() <= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int e0(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    private void f0() {
        p();
        F0();
        O0();
        w0();
        k();
        if (this.N != 0) {
            H0();
        }
        q0();
    }

    private void g0() {
        if (D()) {
            RectF rectF = this.W;
            this.Q3.o(rectF, this.f55590e.getWidth(), this.f55590e.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            o(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.P);
            ((com.google.android.material.textfield.h) this.E).V0(rectF);
        }
    }

    @p0
    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f55590e;
        if (!(editText instanceof AutoCompleteTextView) || q.a(editText)) {
            return this.E;
        }
        int iD = com.google.android.material.color.m.d(this.f55590e, R.attr.colorControlHighlight);
        int i10 = this.N;
        if (i10 == 2) {
            return N(getContext(), this.E, iD, f55574c4);
        }
        if (i10 == 1) {
            return K(this.E, this.T, iD, f55574c4);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.G == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.G = stateListDrawable;
            stateListDrawable.addState(new int[]{android.R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.G.addState(new int[0], J(false));
        }
        return this.G;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.F == null) {
            this.F = J(true);
        }
        return this.F;
    }

    private void i0() {
        if (!D() || this.P3) {
            return;
        }
        A();
        g0();
    }

    private void j() {
        TextView textView = this.f55609u;
        if (textView != null) {
            this.f55585b.addView(textView);
            this.f55609u.setVisibility(0);
        }
    }

    private static void j0(@n0 ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                j0((ViewGroup) childAt, z10);
            }
        }
    }

    private void k() {
        if (this.f55590e == null || this.N != 1) {
            return;
        }
        if (com.google.android.material.resources.c.j(getContext())) {
            EditText editText = this.f55590e;
            j1.d2(editText, j1.k0(editText), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), j1.j0(this.f55590e), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (com.google.android.material.resources.c.i(getContext())) {
            EditText editText2 = this.f55590e;
            j1.d2(editText2, j1.k0(editText2), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), j1.j0(this.f55590e), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    private void m() {
        com.google.android.material.shape.k kVar = this.E;
        if (kVar == null) {
            return;
        }
        com.google.android.material.shape.p shapeAppearanceModel = kVar.getShapeAppearanceModel();
        com.google.android.material.shape.p pVar = this.K;
        if (shapeAppearanceModel != pVar) {
            this.E.setShapeAppearanceModel(pVar);
        }
        if (w()) {
            this.E.D0(this.P, this.S);
        }
        int iQ = q();
        this.T = iQ;
        this.E.o0(ColorStateList.valueOf(iQ));
        n();
        F0();
    }

    private void n() {
        if (this.I == null || this.J == null) {
            return;
        }
        if (x()) {
            this.I.o0(this.f55590e.isFocused() ? ColorStateList.valueOf(this.G2) : ColorStateList.valueOf(this.S));
            this.J.o0(ColorStateList.valueOf(this.S));
        }
        invalidate();
    }

    private void o(@n0 RectF rectF) {
        float f10 = rectF.left;
        int i10 = this.M;
        rectF.left = f10 - i10;
        rectF.right += i10;
    }

    private void p() {
        int i10 = this.N;
        if (i10 == 0) {
            this.E = null;
            this.I = null;
            this.J = null;
            return;
        }
        if (i10 == 1) {
            this.E = new com.google.android.material.shape.k(this.K);
            this.I = new com.google.android.material.shape.k();
            this.J = new com.google.android.material.shape.k();
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(this.N + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.B || (this.E instanceof com.google.android.material.textfield.h)) {
                this.E = new com.google.android.material.shape.k(this.K);
            } else {
                this.E = com.google.android.material.textfield.h.Q0(this.K);
            }
            this.I = null;
            this.J = null;
        }
    }

    private void p0() {
        TextView textView = this.f55609u;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private int q() {
        return this.N == 1 ? com.google.android.material.color.m.n(com.google.android.material.color.m.e(this, R.attr.colorSurface, 0), this.T) : this.T;
    }

    private void q0() {
        EditText editText = this.f55590e;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i10 = this.N;
                if (i10 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i10 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    @n0
    private Rect r(@n0 Rect rect) {
        if (this.f55590e == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.V;
        boolean zQ = j0.q(this);
        rect2.bottom = rect.bottom;
        int i10 = this.N;
        if (i10 == 1) {
            rect2.left = L(rect.left, zQ);
            rect2.top = rect.top + this.O;
            rect2.right = M(rect.right, zQ);
            return rect2;
        }
        if (i10 != 2) {
            rect2.left = L(rect.left, zQ);
            rect2.top = getPaddingTop();
            rect2.right = M(rect.right, zQ);
            return rect2;
        }
        rect2.left = rect.left + this.f55590e.getPaddingLeft();
        rect2.top = rect.top - v();
        rect2.right = rect.right - this.f55590e.getPaddingRight();
        return rect2;
    }

    private int s(@n0 Rect rect, @n0 Rect rect2, float f10) {
        return b0() ? (int) (rect2.top + f10) : rect.bottom - this.f55590e.getCompoundPaddingBottom();
    }

    private void setEditText(EditText editText) {
        if (this.f55590e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i(f55575d4, "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f55590e = editText;
        int i10 = this.f55592g;
        if (i10 != -1) {
            setMinEms(i10);
        } else {
            setMinWidth(this.f55594i);
        }
        int i11 = this.f55593h;
        if (i11 != -1) {
            setMaxEms(i11);
        } else {
            setMaxWidth(this.f55595j);
        }
        this.H = false;
        f0();
        setTextInputAccessibilityDelegate(new e(this));
        this.Q3.P0(this.f55590e.getTypeface());
        this.Q3.x0(this.f55590e.getTextSize());
        this.Q3.s0(this.f55590e.getLetterSpacing());
        int gravity = this.f55590e.getGravity();
        this.Q3.l0((gravity & com.ss.android.ttvecamera.o.f97695q) | 48);
        this.Q3.w0(gravity);
        this.f55590e.addTextChangedListener(new a());
        if (this.f55614x2 == null) {
            this.f55614x2 = this.f55590e.getHintTextColors();
        }
        if (this.B) {
            if (TextUtils.isEmpty(this.C)) {
                CharSequence hint = this.f55590e.getHint();
                this.f55591f = hint;
                setHint(hint);
                this.f55590e.setHint((CharSequence) null);
            }
            this.D = true;
        }
        if (this.f55601p != null) {
            z0(this.f55590e.getText());
        }
        E0();
        this.f55596k.f();
        this.f55587c.bringToFront();
        this.f55589d.bringToFront();
        F();
        this.f55589d.I();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        J0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.C)) {
            return;
        }
        this.C = charSequence;
        this.Q3.M0(charSequence);
        if (this.P3) {
            return;
        }
        g0();
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f55608t == z10) {
            return;
        }
        if (z10) {
            j();
        } else {
            p0();
            this.f55609u = null;
        }
        this.f55608t = z10;
    }

    private int t(@n0 Rect rect, float f10) {
        return b0() ? (int) (rect.centerY() - (f10 / 2.0f)) : rect.top + this.f55590e.getCompoundPaddingTop();
    }

    private boolean t0() {
        return (this.f55589d.u() || ((this.f55589d.n() && R()) || this.f55589d.getSuffixText() != null)) && this.f55589d.getMeasuredWidth() > 0;
    }

    @n0
    private Rect u(@n0 Rect rect) {
        if (this.f55590e == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.V;
        float fD = this.Q3.D();
        rect2.left = rect.left + this.f55590e.getCompoundPaddingLeft();
        rect2.top = t(rect, fD);
        rect2.right = rect.right - this.f55590e.getCompoundPaddingRight();
        rect2.bottom = s(rect, rect2, fD);
        return rect2;
    }

    private boolean u0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f55587c.getMeasuredWidth() > 0;
    }

    private int v() {
        float fR;
        if (!this.B) {
            return 0;
        }
        int i10 = this.N;
        if (i10 == 0) {
            fR = this.Q3.r();
        } else {
            if (i10 != 2) {
                return 0;
            }
            fR = this.Q3.r() / 2.0f;
        }
        return (int) fR;
    }

    private void v0() {
        if (this.f55609u == null || !this.f55608t || TextUtils.isEmpty(this.f55607s)) {
            return;
        }
        this.f55609u.setText(this.f55607s);
        androidx.transition.v.b(this.f55585b, this.f55612x);
        this.f55609u.setVisibility(0);
        this.f55609u.bringToFront();
        announceForAccessibility(this.f55607s);
    }

    private boolean w() {
        return this.N == 2 && x();
    }

    private void w0() {
        if (this.N == 1) {
            if (com.google.android.material.resources.c.j(getContext())) {
                this.O = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (com.google.android.material.resources.c.i(getContext())) {
                this.O = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
    }

    private boolean x() {
        return this.P > -1 && this.S != 0;
    }

    private void x0(@n0 Rect rect) {
        com.google.android.material.shape.k kVar = this.I;
        if (kVar != null) {
            int i10 = rect.bottom;
            kVar.setBounds(rect.left, i10 - this.Q, rect.right, i10);
        }
        com.google.android.material.shape.k kVar2 = this.J;
        if (kVar2 != null) {
            int i11 = rect.bottom;
            kVar2.setBounds(rect.left, i11 - this.R, rect.right, i11);
        }
    }

    private void y0() {
        if (this.f55601p != null) {
            EditText editText = this.f55590e;
            z0(editText == null ? null : editText.getText());
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    boolean D0() {
        boolean z10;
        if (this.f55590e == null) {
            return false;
        }
        boolean z11 = true;
        if (u0()) {
            int measuredWidth = this.f55587c.getMeasuredWidth() - this.f55590e.getPaddingLeft();
            if (this.f55586b0 == null || this.f55588c0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f55586b0 = colorDrawable;
                this.f55588c0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrH = androidx.core.widget.q.h(this.f55590e);
            Drawable drawable = drawableArrH[0];
            Drawable drawable2 = this.f55586b0;
            if (drawable != drawable2) {
                androidx.core.widget.q.w(this.f55590e, drawable2, drawableArrH[1], drawableArrH[2], drawableArrH[3]);
                z10 = true;
            } else {
                z10 = false;
            }
        } else if (this.f55586b0 != null) {
            Drawable[] drawableArrH2 = androidx.core.widget.q.h(this.f55590e);
            androidx.core.widget.q.w(this.f55590e, null, drawableArrH2[1], drawableArrH2[2], drawableArrH2[3]);
            this.f55586b0 = null;
            z10 = true;
        } else {
            z10 = false;
        }
        if (t0()) {
            int measuredWidth2 = this.f55589d.getSuffixTextView().getMeasuredWidth() - this.f55590e.getPaddingRight();
            CheckableImageButton currentEndIconView = this.f55589d.getCurrentEndIconView();
            if (currentEndIconView != null) {
                measuredWidth2 = measuredWidth2 + currentEndIconView.getMeasuredWidth() + androidx.core.view.s.c((ViewGroup.MarginLayoutParams) currentEndIconView.getLayoutParams());
            }
            Drawable[] drawableArrH3 = androidx.core.widget.q.h(this.f55590e);
            Drawable drawable3 = this.f55613x1;
            if (drawable3 == null || this.f55616y1 == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f55613x1 = colorDrawable2;
                    this.f55616y1 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = drawableArrH3[2];
                Drawable drawable5 = this.f55613x1;
                if (drawable4 != drawable5) {
                    this.f55603p2 = drawable4;
                    androidx.core.widget.q.w(this.f55590e, drawableArrH3[0], drawableArrH3[1], drawable5, drawableArrH3[3]);
                } else {
                    z11 = z10;
                }
            } else {
                this.f55616y1 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                androidx.core.widget.q.w(this.f55590e, drawableArrH3[0], drawableArrH3[1], this.f55613x1, drawableArrH3[3]);
            }
        } else {
            if (this.f55613x1 == null) {
                return z10;
            }
            Drawable[] drawableArrH4 = androidx.core.widget.q.h(this.f55590e);
            if (drawableArrH4[2] == this.f55613x1) {
                androidx.core.widget.q.w(this.f55590e, drawableArrH4[0], drawableArrH4[1], this.f55603p2, drawableArrH4[3]);
            } else {
                z11 = z10;
            }
            this.f55613x1 = null;
        }
        return z11;
    }

    @androidx.annotation.j1
    boolean E() {
        return D() && ((com.google.android.material.textfield.h) this.E).S0();
    }

    void E0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f55590e;
        if (editText == null || this.N != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (b0.a(background)) {
            background = background.mutate();
        }
        if (s0()) {
            background.setColorFilter(androidx.appcompat.widget.f.e(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f55599n && (textView = this.f55601p) != null) {
            background.setColorFilter(androidx.appcompat.widget.f.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            androidx.core.graphics.drawable.d.c(background);
            this.f55590e.refreshDrawableState();
        }
    }

    void F0() {
        EditText editText = this.f55590e;
        if (editText == null || this.E == null) {
            return;
        }
        if ((this.H || editText.getBackground() == null) && this.N != 0) {
            j1.I1(this.f55590e, getEditTextBoxBackground());
            this.H = true;
        }
    }

    void I0(boolean z10) {
        J0(z10, false);
    }

    void O0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.E == null || this.N == 0) {
            return;
        }
        boolean z10 = false;
        boolean z11 = isFocused() || ((editText2 = this.f55590e) != null && editText2.hasFocus());
        boolean z12 = isHovered() || ((editText = this.f55590e) != null && editText.isHovered());
        if (s0() || (this.f55601p != null && this.f55599n)) {
            z10 = true;
        }
        if (!isEnabled()) {
            this.S = this.O3;
        } else if (s0()) {
            if (this.J3 != null) {
                N0(z11, z12);
            } else {
                this.S = getErrorCurrentTextColors();
            }
        } else if (!this.f55599n || (textView = this.f55601p) == null) {
            if (z11) {
                this.S = this.G3;
            } else if (z12) {
                this.S = this.f55604p3;
            } else {
                this.S = this.G2;
            }
        } else if (this.J3 != null) {
            N0(z11, z12);
        } else {
            this.S = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            C0(z10);
        }
        this.f55589d.x();
        m0();
        if (this.N == 2) {
            int i10 = this.P;
            if (z11 && isEnabled()) {
                this.P = this.R;
            } else {
                this.P = this.Q;
            }
            if (this.P != i10) {
                i0();
            }
        }
        if (this.N == 1) {
            if (!isEnabled()) {
                this.T = this.L3;
            } else if (z12 && !z11) {
                this.T = this.N3;
            } else if (z11) {
                this.T = this.M3;
            } else {
                this.T = this.K3;
            }
        }
        m();
    }

    public boolean P() {
        return this.f55597l;
    }

    public boolean Q() {
        return this.f55589d.r();
    }

    public boolean R() {
        return this.f55589d.t();
    }

    public boolean S() {
        return this.f55596k.F();
    }

    public boolean T() {
        return this.R3;
    }

    @androidx.annotation.j1
    final boolean U() {
        return this.f55596k.y();
    }

    public boolean V() {
        return this.f55596k.G();
    }

    public boolean W() {
        return this.S3;
    }

    public boolean X() {
        return this.B;
    }

    final boolean Y() {
        return this.P3;
    }

    @Deprecated
    public boolean Z() {
        return this.f55589d.v();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean a0() {
        return this.D;
    }

    @Override // android.view.ViewGroup
    public void addView(@n0 View view, int i10, @n0 ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & com.ss.android.ttvecamera.o.f97695q) | 16;
        this.f55585b.addView(view, layoutParams2);
        this.f55585b.setLayoutParams(layoutParams);
        H0();
        setEditText((EditText) view);
    }

    public boolean c0() {
        return this.f55587c.c();
    }

    public boolean d0() {
        return this.f55587c.d();
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(@n0 ViewStructure viewStructure, int i10) {
        EditText editText = this.f55590e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f55591f != null) {
            boolean z10 = this.D;
            this.D = false;
            CharSequence hint = editText.getHint();
            this.f55590e.setHint(this.f55591f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f55590e.setHint(hint);
                this.D = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        viewStructure.setChildCount(this.f55585b.getChildCount());
        for (int i11 = 0; i11 < this.f55585b.getChildCount(); i11++) {
            View childAt = this.f55585b.getChildAt(i11);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i10);
            if (childAt == this.f55590e) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(@n0 SparseArray<Parcelable> sparseArray) {
        this.V3 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.V3 = false;
    }

    @Override // android.view.View
    public void draw(@n0 Canvas canvas) {
        super.draw(canvas);
        H(canvas);
        G(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.U3) {
            return;
        }
        this.U3 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.b bVar = this.Q3;
        boolean zK0 = bVar != null ? bVar.K0(drawableState) | false : false;
        if (this.f55590e != null) {
            I0(j1.U0(this) && isEnabled());
        }
        E0();
        O0();
        if (zK0) {
            invalidate();
        }
        this.U3 = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f55590e;
        return editText != null ? editText.getBaseline() + getPaddingTop() + v() : super.getBaseline();
    }

    @n0
    com.google.android.material.shape.k getBoxBackground() {
        int i10 = this.N;
        if (i10 == 1 || i10 == 2) {
            return this.E;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.T;
    }

    public int getBoxBackgroundMode() {
        return this.N;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.O;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return j0.q(this) ? this.K.j().a(this.W) : this.K.l().a(this.W);
    }

    public float getBoxCornerRadiusBottomStart() {
        return j0.q(this) ? this.K.l().a(this.W) : this.K.j().a(this.W);
    }

    public float getBoxCornerRadiusTopEnd() {
        return j0.q(this) ? this.K.r().a(this.W) : this.K.t().a(this.W);
    }

    public float getBoxCornerRadiusTopStart() {
        return j0.q(this) ? this.K.t().a(this.W) : this.K.r().a(this.W);
    }

    public int getBoxStrokeColor() {
        return this.G3;
    }

    @p0
    public ColorStateList getBoxStrokeErrorColor() {
        return this.J3;
    }

    public int getBoxStrokeWidth() {
        return this.Q;
    }

    public int getBoxStrokeWidthFocused() {
        return this.R;
    }

    public int getCounterMaxLength() {
        return this.f55598m;
    }

    @p0
    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f55597l && this.f55599n && (textView = this.f55601p) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    @p0
    public ColorStateList getCounterOverflowTextColor() {
        return this.A;
    }

    @p0
    public ColorStateList getCounterTextColor() {
        return this.f55618z;
    }

    @p0
    public ColorStateList getDefaultHintTextColor() {
        return this.f55614x2;
    }

    @p0
    public EditText getEditText() {
        return this.f55590e;
    }

    @p0
    public CharSequence getEndIconContentDescription() {
        return this.f55589d.getEndIconContentDescription();
    }

    @p0
    public Drawable getEndIconDrawable() {
        return this.f55589d.getEndIconDrawable();
    }

    public int getEndIconMinSize() {
        return this.f55589d.getEndIconMinSize();
    }

    public int getEndIconMode() {
        return this.f55589d.getEndIconMode();
    }

    @n0
    public ImageView.ScaleType getEndIconScaleType() {
        return this.f55589d.getEndIconScaleType();
    }

    @n0
    CheckableImageButton getEndIconView() {
        return this.f55589d.getEndIconView();
    }

    @p0
    public CharSequence getError() {
        if (this.f55596k.F()) {
            return this.f55596k.q();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f55596k.o();
    }

    @p0
    public CharSequence getErrorContentDescription() {
        return this.f55596k.p();
    }

    @androidx.annotation.l
    public int getErrorCurrentTextColors() {
        return this.f55596k.r();
    }

    @p0
    public Drawable getErrorIconDrawable() {
        return this.f55589d.getErrorIconDrawable();
    }

    @p0
    public CharSequence getHelperText() {
        if (this.f55596k.G()) {
            return this.f55596k.t();
        }
        return null;
    }

    @androidx.annotation.l
    public int getHelperTextCurrentTextColor() {
        return this.f55596k.w();
    }

    @p0
    public CharSequence getHint() {
        if (this.B) {
            return this.C;
        }
        return null;
    }

    @androidx.annotation.j1
    final float getHintCollapsedTextHeight() {
        return this.Q3.r();
    }

    @androidx.annotation.j1
    final int getHintCurrentCollapsedTextColor() {
        return this.Q3.w();
    }

    @p0
    public ColorStateList getHintTextColor() {
        return this.f55617y2;
    }

    @n0
    public h getLengthCounter() {
        return this.f55600o;
    }

    public int getMaxEms() {
        return this.f55593h;
    }

    @t0
    public int getMaxWidth() {
        return this.f55595j;
    }

    public int getMinEms() {
        return this.f55592g;
    }

    @t0
    public int getMinWidth() {
        return this.f55594i;
    }

    @p0
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f55589d.getPasswordVisibilityToggleContentDescription();
    }

    @p0
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f55589d.getPasswordVisibilityToggleDrawable();
    }

    @p0
    public CharSequence getPlaceholderText() {
        if (this.f55608t) {
            return this.f55607s;
        }
        return null;
    }

    @e1
    public int getPlaceholderTextAppearance() {
        return this.f55611w;
    }

    @p0
    public ColorStateList getPlaceholderTextColor() {
        return this.f55610v;
    }

    @p0
    public CharSequence getPrefixText() {
        return this.f55587c.getPrefixText();
    }

    @p0
    public ColorStateList getPrefixTextColor() {
        return this.f55587c.getPrefixTextColor();
    }

    @n0
    public TextView getPrefixTextView() {
        return this.f55587c.getPrefixTextView();
    }

    @n0
    public com.google.android.material.shape.p getShapeAppearanceModel() {
        return this.K;
    }

    @p0
    public CharSequence getStartIconContentDescription() {
        return this.f55587c.getStartIconContentDescription();
    }

    @p0
    public Drawable getStartIconDrawable() {
        return this.f55587c.getStartIconDrawable();
    }

    public int getStartIconMinSize() {
        return this.f55587c.getStartIconMinSize();
    }

    @n0
    public ImageView.ScaleType getStartIconScaleType() {
        return this.f55587c.getStartIconScaleType();
    }

    @p0
    public CharSequence getSuffixText() {
        return this.f55589d.getSuffixText();
    }

    @p0
    public ColorStateList getSuffixTextColor() {
        return this.f55589d.getSuffixTextColor();
    }

    @n0
    public TextView getSuffixTextView() {
        return this.f55589d.getSuffixTextView();
    }

    @p0
    public Typeface getTypeface() {
        return this.f55584a0;
    }

    public void h(@n0 i iVar) {
        this.f55602p1.add(iVar);
        if (this.f55590e != null) {
            iVar.a(this);
        }
    }

    @Deprecated
    public void h0(boolean z10) {
        this.f55589d.F(z10);
    }

    public void i(@n0 j jVar) {
        this.f55589d.g(jVar);
    }

    public void k0() {
        this.f55589d.y();
    }

    @androidx.annotation.j1
    void l(float f10) {
        if (this.Q3.G() == f10) {
            return;
        }
        if (this.T3 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.T3 = valueAnimator;
            valueAnimator.setInterpolator(i9.a.g(getContext(), R.attr.motionEasingEmphasizedInterpolator, com.google.android.material.animation.b.f52897b));
            this.T3.setDuration(i9.a.f(getContext(), R.attr.motionDurationMedium4, 167));
            this.T3.addUpdateListener(new d());
        }
        this.T3.setFloatValues(this.Q3.G(), f10);
        this.T3.start();
    }

    public void l0() {
        this.f55589d.z();
    }

    public void m0() {
        this.f55587c.f();
    }

    public void n0(@n0 i iVar) {
        this.f55602p1.remove(iVar);
    }

    public void o0(@n0 j jVar) {
        this.f55589d.B(jVar);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(@n0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.Q3.a0(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f55590e;
        if (editText != null) {
            Rect rect = this.U;
            com.google.android.material.internal.d.a(this, editText, rect);
            x0(rect);
            if (this.B) {
                this.Q3.x0(this.f55590e.getTextSize());
                int gravity = this.f55590e.getGravity();
                this.Q3.l0((gravity & com.ss.android.ttvecamera.o.f97695q) | 48);
                this.Q3.w0(gravity);
                this.Q3.h0(r(rect));
                this.Q3.r0(u(rect));
                this.Q3.c0();
                if (!D() || this.P3) {
                    return;
                }
                g0();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        boolean zG0 = G0();
        boolean zD0 = D0();
        if (zG0 || zD0) {
            this.f55590e.post(new c());
        }
        K0();
        this.f55589d.I();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(@p0 Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setError(savedState.f55619b);
        if (savedState.f55620c) {
            post(new b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = i10 == 1;
        if (z10 != this.L) {
            float fA = this.K.r().a(this.W);
            float fA2 = this.K.t().a(this.W);
            com.google.android.material.shape.p pVarM = com.google.android.material.shape.p.a().J(this.K.s()).O(this.K.q()).w(this.K.k()).B(this.K.i()).K(fA2).P(fA).x(this.K.l().a(this.W)).C(this.K.j().a(this.W)).m();
            this.L = z10;
            setShapeAppearanceModel(pVarM);
        }
    }

    @Override // android.view.View
    @p0
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (s0()) {
            savedState.f55619b = getError();
        }
        savedState.f55620c = this.f55589d.s();
        return savedState;
    }

    void r0(@n0 TextView textView, @e1 int i10) {
        boolean z10 = true;
        try {
            androidx.core.widget.q.E(textView, i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z10 = false;
            }
        } catch (Exception unused) {
        }
        if (z10) {
            androidx.core.widget.q.E(textView, R.style.TextAppearance_AppCompat_Caption);
            textView.setTextColor(androidx.core.content.d.f(getContext(), R.color.design_error));
        }
    }

    boolean s0() {
        return this.f55596k.m();
    }

    public void setBoxBackgroundColor(@androidx.annotation.l int i10) {
        if (this.T != i10) {
            this.T = i10;
            this.K3 = i10;
            this.M3 = i10;
            this.N3 = i10;
            m();
        }
    }

    public void setBoxBackgroundColorResource(@androidx.annotation.n int i10) {
        setBoxBackgroundColor(androidx.core.content.d.f(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(@n0 ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.K3 = defaultColor;
        this.T = defaultColor;
        this.L3 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.M3 = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        this.N3 = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
        m();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.N) {
            return;
        }
        this.N = i10;
        if (this.f55590e != null) {
            f0();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.O = i10;
    }

    public void setBoxCornerFamily(int i10) {
        this.K = this.K.v().I(i10, this.K.r()).N(i10, this.K.t()).v(i10, this.K.j()).A(i10, this.K.l()).m();
        m();
    }

    public void setBoxCornerRadii(float f10, float f11, float f12, float f13) {
        boolean zQ = j0.q(this);
        this.L = zQ;
        float f14 = zQ ? f11 : f10;
        if (!zQ) {
            f10 = f11;
        }
        float f15 = zQ ? f13 : f12;
        if (!zQ) {
            f12 = f13;
        }
        com.google.android.material.shape.k kVar = this.E;
        if (kVar != null && kVar.S() == f14 && this.E.T() == f10 && this.E.t() == f15 && this.E.u() == f12) {
            return;
        }
        this.K = this.K.v().K(f14).P(f10).x(f15).C(f12).m();
        m();
    }

    public void setBoxCornerRadiiResources(@androidx.annotation.q int i10, @androidx.annotation.q int i11, @androidx.annotation.q int i12, @androidx.annotation.q int i13) {
        setBoxCornerRadii(getContext().getResources().getDimension(i10), getContext().getResources().getDimension(i11), getContext().getResources().getDimension(i13), getContext().getResources().getDimension(i12));
    }

    public void setBoxStrokeColor(@androidx.annotation.l int i10) {
        if (this.G3 != i10) {
            this.G3 = i10;
            O0();
        }
    }

    public void setBoxStrokeColorStateList(@n0 ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.G2 = colorStateList.getDefaultColor();
            this.O3 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f55604p3 = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            this.G3 = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        } else if (this.G3 != colorStateList.getDefaultColor()) {
            this.G3 = colorStateList.getDefaultColor();
        }
        O0();
    }

    public void setBoxStrokeErrorColor(@p0 ColorStateList colorStateList) {
        if (this.J3 != colorStateList) {
            this.J3 = colorStateList;
            O0();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.Q = i10;
        O0();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.R = i10;
        O0();
    }

    public void setBoxStrokeWidthFocusedResource(@androidx.annotation.q int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(@androidx.annotation.q int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f55597l != z10) {
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f55601p = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_counter);
                Typeface typeface = this.f55584a0;
                if (typeface != null) {
                    this.f55601p.setTypeface(typeface);
                }
                this.f55601p.setMaxLines(1);
                this.f55596k.e(this.f55601p, 2);
                androidx.core.view.s.h((ViewGroup.MarginLayoutParams) this.f55601p.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                B0();
                y0();
            } else {
                this.f55596k.H(this.f55601p, 2);
                this.f55601p = null;
            }
            this.f55597l = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f55598m != i10) {
            if (i10 > 0) {
                this.f55598m = i10;
            } else {
                this.f55598m = -1;
            }
            if (this.f55597l) {
                y0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f55605q != i10) {
            this.f55605q = i10;
            B0();
        }
    }

    public void setCounterOverflowTextColor(@p0 ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            B0();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f55606r != i10) {
            this.f55606r = i10;
            B0();
        }
    }

    public void setCounterTextColor(@p0 ColorStateList colorStateList) {
        if (this.f55618z != colorStateList) {
            this.f55618z = colorStateList;
            B0();
        }
    }

    public void setDefaultHintTextColor(@p0 ColorStateList colorStateList) {
        this.f55614x2 = colorStateList;
        this.f55617y2 = colorStateList;
        if (this.f55590e != null) {
            I0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        j0(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f55589d.setEndIconActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f55589d.setEndIconCheckable(z10);
    }

    public void setEndIconContentDescription(@d1 int i10) {
        this.f55589d.setEndIconContentDescription(i10);
    }

    public void setEndIconContentDescription(@p0 CharSequence charSequence) {
        this.f55589d.setEndIconContentDescription(charSequence);
    }

    public void setEndIconDrawable(@androidx.annotation.v int i10) {
        this.f55589d.setEndIconDrawable(i10);
    }

    public void setEndIconDrawable(@p0 Drawable drawable) {
        this.f55589d.setEndIconDrawable(drawable);
    }

    public void setEndIconMinSize(@f0(from = 0) int i10) {
        this.f55589d.setEndIconMinSize(i10);
    }

    public void setEndIconMode(int i10) {
        this.f55589d.setEndIconMode(i10);
    }

    public void setEndIconOnClickListener(@p0 View.OnClickListener onClickListener) {
        this.f55589d.setEndIconOnClickListener(onClickListener);
    }

    public void setEndIconOnLongClickListener(@p0 View.OnLongClickListener onLongClickListener) {
        this.f55589d.setEndIconOnLongClickListener(onLongClickListener);
    }

    public void setEndIconScaleType(@n0 ImageView.ScaleType scaleType) {
        this.f55589d.setEndIconScaleType(scaleType);
    }

    public void setEndIconTintList(@p0 ColorStateList colorStateList) {
        this.f55589d.setEndIconTintList(colorStateList);
    }

    public void setEndIconTintMode(@p0 PorterDuff.Mode mode) {
        this.f55589d.setEndIconTintMode(mode);
    }

    public void setEndIconVisible(boolean z10) {
        this.f55589d.setEndIconVisible(z10);
    }

    public void setError(@p0 CharSequence charSequence) {
        if (!this.f55596k.F()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f55596k.A();
        } else {
            this.f55596k.V(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        this.f55596k.J(i10);
    }

    public void setErrorContentDescription(@p0 CharSequence charSequence) {
        this.f55596k.K(charSequence);
    }

    public void setErrorEnabled(boolean z10) {
        this.f55596k.L(z10);
    }

    public void setErrorIconDrawable(@androidx.annotation.v int i10) {
        this.f55589d.setErrorIconDrawable(i10);
    }

    public void setErrorIconDrawable(@p0 Drawable drawable) {
        this.f55589d.setErrorIconDrawable(drawable);
    }

    public void setErrorIconOnClickListener(@p0 View.OnClickListener onClickListener) {
        this.f55589d.setErrorIconOnClickListener(onClickListener);
    }

    public void setErrorIconOnLongClickListener(@p0 View.OnLongClickListener onLongClickListener) {
        this.f55589d.setErrorIconOnLongClickListener(onLongClickListener);
    }

    public void setErrorIconTintList(@p0 ColorStateList colorStateList) {
        this.f55589d.setErrorIconTintList(colorStateList);
    }

    public void setErrorIconTintMode(@p0 PorterDuff.Mode mode) {
        this.f55589d.setErrorIconTintMode(mode);
    }

    public void setErrorTextAppearance(@e1 int i10) {
        this.f55596k.M(i10);
    }

    public void setErrorTextColor(@p0 ColorStateList colorStateList) {
        this.f55596k.N(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.R3 != z10) {
            this.R3 = z10;
            I0(false);
        }
    }

    public void setHelperText(@p0 CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (V()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!V()) {
                setHelperTextEnabled(true);
            }
            this.f55596k.W(charSequence);
        }
    }

    public void setHelperTextColor(@p0 ColorStateList colorStateList) {
        this.f55596k.Q(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.f55596k.P(z10);
    }

    public void setHelperTextTextAppearance(@e1 int i10) {
        this.f55596k.O(i10);
    }

    public void setHint(@d1 int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setHint(@p0 CharSequence charSequence) {
        if (this.B) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.S3 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.B) {
            this.B = z10;
            if (z10) {
                CharSequence hint = this.f55590e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.C)) {
                        setHint(hint);
                    }
                    this.f55590e.setHint((CharSequence) null);
                }
                this.D = true;
            } else {
                this.D = false;
                if (!TextUtils.isEmpty(this.C) && TextUtils.isEmpty(this.f55590e.getHint())) {
                    this.f55590e.setHint(this.C);
                }
                setHintInternal(null);
            }
            if (this.f55590e != null) {
                H0();
            }
        }
    }

    public void setHintTextAppearance(@e1 int i10) {
        this.Q3.i0(i10);
        this.f55617y2 = this.Q3.p();
        if (this.f55590e != null) {
            I0(false);
            H0();
        }
    }

    public void setHintTextColor(@p0 ColorStateList colorStateList) {
        if (this.f55617y2 != colorStateList) {
            if (this.f55614x2 == null) {
                this.Q3.k0(colorStateList);
            }
            this.f55617y2 = colorStateList;
            if (this.f55590e != null) {
                I0(false);
            }
        }
    }

    public void setLengthCounter(@n0 h hVar) {
        this.f55600o = hVar;
    }

    public void setMaxEms(int i10) {
        this.f55593h = i10;
        EditText editText = this.f55590e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(@t0 int i10) {
        this.f55595j = i10;
        EditText editText = this.f55590e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(@androidx.annotation.q int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f55592g = i10;
        EditText editText = this.f55590e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(@t0 int i10) {
        this.f55594i = i10;
        EditText editText = this.f55590e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(@androidx.annotation.q int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@d1 int i10) {
        this.f55589d.setPasswordVisibilityToggleContentDescription(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@p0 CharSequence charSequence) {
        this.f55589d.setPasswordVisibilityToggleContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@androidx.annotation.v int i10) {
        this.f55589d.setPasswordVisibilityToggleDrawable(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@p0 Drawable drawable) {
        this.f55589d.setPasswordVisibilityToggleDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        this.f55589d.setPasswordVisibilityToggleEnabled(z10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@p0 ColorStateList colorStateList) {
        this.f55589d.setPasswordVisibilityToggleTintList(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@p0 PorterDuff.Mode mode) {
        this.f55589d.setPasswordVisibilityToggleTintMode(mode);
    }

    public void setPlaceholderText(@p0 CharSequence charSequence) {
        if (this.f55609u == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f55609u = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_placeholder);
            j1.R1(this.f55609u, 2);
            Fade fadeC = C();
            this.f55612x = fadeC;
            fadeC.E0(67L);
            this.f55615y = C();
            setPlaceholderTextAppearance(this.f55611w);
            setPlaceholderTextColor(this.f55610v);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f55608t) {
                setPlaceholderTextEnabled(true);
            }
            this.f55607s = charSequence;
        }
        L0();
    }

    public void setPlaceholderTextAppearance(@e1 int i10) {
        this.f55611w = i10;
        TextView textView = this.f55609u;
        if (textView != null) {
            androidx.core.widget.q.E(textView, i10);
        }
    }

    public void setPlaceholderTextColor(@p0 ColorStateList colorStateList) {
        if (this.f55610v != colorStateList) {
            this.f55610v = colorStateList;
            TextView textView = this.f55609u;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(@p0 CharSequence charSequence) {
        this.f55587c.setPrefixText(charSequence);
    }

    public void setPrefixTextAppearance(@e1 int i10) {
        this.f55587c.setPrefixTextAppearance(i10);
    }

    public void setPrefixTextColor(@n0 ColorStateList colorStateList) {
        this.f55587c.setPrefixTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(@n0 com.google.android.material.shape.p pVar) {
        com.google.android.material.shape.k kVar = this.E;
        if (kVar == null || kVar.getShapeAppearanceModel() == pVar) {
            return;
        }
        this.K = pVar;
        m();
    }

    public void setStartIconCheckable(boolean z10) {
        this.f55587c.setStartIconCheckable(z10);
    }

    public void setStartIconContentDescription(@d1 int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconContentDescription(@p0 CharSequence charSequence) {
        this.f55587c.setStartIconContentDescription(charSequence);
    }

    public void setStartIconDrawable(@androidx.annotation.v int i10) {
        setStartIconDrawable(i10 != 0 ? b0.a.b(getContext(), i10) : null);
    }

    public void setStartIconDrawable(@p0 Drawable drawable) {
        this.f55587c.setStartIconDrawable(drawable);
    }

    public void setStartIconMinSize(@f0(from = 0) int i10) {
        this.f55587c.setStartIconMinSize(i10);
    }

    public void setStartIconOnClickListener(@p0 View.OnClickListener onClickListener) {
        this.f55587c.setStartIconOnClickListener(onClickListener);
    }

    public void setStartIconOnLongClickListener(@p0 View.OnLongClickListener onLongClickListener) {
        this.f55587c.setStartIconOnLongClickListener(onLongClickListener);
    }

    public void setStartIconScaleType(@n0 ImageView.ScaleType scaleType) {
        this.f55587c.setStartIconScaleType(scaleType);
    }

    public void setStartIconTintList(@p0 ColorStateList colorStateList) {
        this.f55587c.setStartIconTintList(colorStateList);
    }

    public void setStartIconTintMode(@p0 PorterDuff.Mode mode) {
        this.f55587c.setStartIconTintMode(mode);
    }

    public void setStartIconVisible(boolean z10) {
        this.f55587c.setStartIconVisible(z10);
    }

    public void setSuffixText(@p0 CharSequence charSequence) {
        this.f55589d.setSuffixText(charSequence);
    }

    public void setSuffixTextAppearance(@e1 int i10) {
        this.f55589d.setSuffixTextAppearance(i10);
    }

    public void setSuffixTextColor(@n0 ColorStateList colorStateList) {
        this.f55589d.setSuffixTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(@p0 e eVar) {
        EditText editText = this.f55590e;
        if (editText != null) {
            j1.B1(editText, eVar);
        }
    }

    public void setTypeface(@p0 Typeface typeface) {
        if (typeface != this.f55584a0) {
            this.f55584a0 = typeface;
            this.Q3.P0(typeface);
            this.f55596k.S(typeface);
            TextView textView = this.f55601p;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public void y() {
        this.f55602p1.clear();
    }

    public void z() {
        this.f55589d.j();
    }

    void z0(@p0 Editable editable) {
        int iA = this.f55600o.a(editable);
        boolean z10 = this.f55599n;
        int i10 = this.f55598m;
        if (i10 == -1) {
            this.f55601p.setText(String.valueOf(iA));
            this.f55601p.setContentDescription(null);
            this.f55599n = false;
        } else {
            this.f55599n = iA > i10;
            A0(getContext(), this.f55601p, iA, this.f55598m, this.f55599n);
            if (z10 != this.f55599n) {
                B0();
            }
            this.f55601p.setText(androidx.core.text.a.c().q(getContext().getString(R.string.character_counter_pattern, Integer.valueOf(iA), Integer.valueOf(this.f55598m))));
        }
        if (this.f55590e == null || z10 == this.f55599n) {
            return;
        }
        I0(false);
        O0();
        E0();
    }
}
