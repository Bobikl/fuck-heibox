package com.loper7.date_time_picker.number_picker;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.d1;
import androidx.annotation.n;
import androidx.annotation.q;
import androidx.core.view.j1;
import com.google.android.material.timepicker.TimeModel;
import com.loper7.date_time_picker.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class NumberPicker extends LinearLayout {
    private static final int A4 = 1;
    private static final int B4 = 3;
    private static final int C4 = 180;
    private static final int D4 = 58;
    private static final int E4 = 1;
    private static final int F4 = -16777216;
    private static final float G4 = 15.0f;
    private static final float H4 = 1.0f;
    private static final l I4 = new l();
    private static final char[] J4 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 1632, 1633, 1634, 1635, 1636, 1637, 1638, 1639, 1640, 1641, 1776, 1777, 1778, 1779, 1780, 1781, 1782, 1783, 1784, 1785, 2406, 2407, 2408, 2409, 2410, 2411, 2412, 2413, 2414, 2415, 2534, 2535, 2536, 2537, 2538, 2539, 2540, 2541, 2542, 2543, 3302, 3303, 3304, 3305, 3306, 3307, 3308, 3309, 3310, 3311, '-'};

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    public static final int f64510h4 = 1;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public static final int f64511i4 = 0;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    public static final int f64512j4 = 0;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    public static final int f64513k4 = 1;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    public static final int f64514l4 = 0;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    public static final int f64515m4 = 1;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    public static final int f64516n4 = 2;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    public static final int f64517o4 = 0;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    public static final int f64518p4 = 1;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    private static final long f64519q4 = 300;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    private static final int f64520r4 = 8;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    private static final int f64521s4 = 800;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    private static final int f64522t4 = 300;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    private static final float f64523u4 = 0.9f;

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    private static final int f64524v4 = 2;

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    private static final int f64525w4 = 48;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    private static final int f64526x4 = -1;

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    private static final int f64527y4 = -16777216;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    private static final int f64528z4 = 100;
    private String[] A;
    private int B;
    private int C;
    private int D;
    private View.OnClickListener E;
    private h F;
    private g G;
    private boolean G2;
    private Drawable G3;
    private e H;
    private long I;
    private final SparseArray<String> J;
    private int J3;
    private int K;
    private int K3;
    private int L;
    private int L3;
    private int M;
    private int M3;
    private int[] N;
    private int N3;
    private final Paint O;
    private int O3;
    private int P;
    private int P3;
    private int Q;
    private int Q3;
    private int R;
    private int R3;
    private final com.loper7.date_time_picker.number_picker.a S;
    private int S3;
    private final com.loper7.date_time_picker.number_picker.a T;
    private int T3;
    private int U;
    private boolean U3;
    private int V;
    private int V3;
    private k W;
    private int W3;
    private boolean X3;
    private float Y3;
    private boolean Z3;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private c f64529a0;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private float f64530a4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f64531b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private float f64532b0;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private int f64533b4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f64534c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private float f64535c0;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    private boolean f64536c4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f64537d;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    private Context f64538d4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EditText f64539e;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    private NumberFormat f64540e4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f64541f;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    private ViewConfiguration f64542f4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f64543g;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    private int f64544g4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f64545h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f64546i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f64547j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f64548k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f64549l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f64550m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f64551n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f64552o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f64553p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private float f64554p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private int f64555p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private boolean f64556p3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f64557q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Typeface f64558r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f64559s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f64560t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f64561u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f64562v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f64563w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Typeface f64564x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private float f64565x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f64566x2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f64567y;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private VelocityTracker f64568y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private int f64569y2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f64570z;

    public class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f64571a;

        a(String str) {
            this.f64571a = str;
        }

        @Override // com.loper7.date_time_picker.number_picker.NumberPicker.e
        public String a(int i10) {
            return String.format(Locale.getDefault(), this.f64571a, Integer.valueOf(i10));
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f64573b;

        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(boolean z10) {
            this.f64573b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            NumberPicker.this.i(this.f64573b);
            NumberPicker numberPicker = NumberPicker.this;
            numberPicker.postDelayed(this, numberPicker.I);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    public interface e {
        String a(int i10);
    }

    public class f extends NumberKeyListener {
        f() {
        }

        @Override // android.text.method.NumberKeyListener, android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
            if (NumberPicker.this.W != null) {
                NumberPicker.this.W.a();
            }
            if (NumberPicker.this.A == null) {
                CharSequence charSequenceFilter = super.filter(charSequence, i10, i11, spanned, i12, i13);
                if (charSequenceFilter == null) {
                    charSequenceFilter = charSequence.subSequence(i10, i11);
                }
                String str = String.valueOf(spanned.subSequence(0, i12)) + ((Object) charSequenceFilter) + ((Object) spanned.subSequence(i13, spanned.length()));
                if ("".equals(str)) {
                    return str;
                }
                return (NumberPicker.this.y(str) > NumberPicker.this.C || str.length() > String.valueOf(NumberPicker.this.C).length()) ? "" : charSequenceFilter;
            }
            String strValueOf = String.valueOf(charSequence.subSequence(i10, i11));
            if (TextUtils.isEmpty(strValueOf)) {
                return "";
            }
            String str2 = String.valueOf(spanned.subSequence(0, i12)) + ((Object) strValueOf) + ((Object) spanned.subSequence(i13, spanned.length()));
            String lowerCase = String.valueOf(str2).toLowerCase();
            for (String str3 : NumberPicker.this.A) {
                if (str3.toLowerCase().startsWith(lowerCase)) {
                    NumberPicker.this.T(str2.length(), str3.length());
                    return str3.subSequence(i12, str3.length());
                }
            }
            return "";
        }

        @Override // android.text.method.NumberKeyListener
        protected char[] getAcceptedChars() {
            return NumberPicker.J4;
        }

        @Override // android.text.method.KeyListener
        public int getInputType() {
            return 1;
        }
    }

    public interface g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f64576a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f64577b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f64578c = 2;

        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        void a(NumberPicker numberPicker, int i10);
    }

    public interface h {
        void a(NumberPicker numberPicker, int i10, int i11);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface i {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface j {
    }

    public static class k implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final EditText f64579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f64580c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f64581d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f64582e;

        k(EditText editText) {
            this.f64579b = editText;
        }

        void a() {
            if (this.f64582e) {
                this.f64579b.removeCallbacks(this);
                this.f64582e = false;
            }
        }

        void b(int i10, int i11) {
            this.f64580c = i10;
            this.f64581d = i11;
            if (this.f64582e) {
                return;
            }
            this.f64579b.post(this);
            this.f64582e = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f64582e = false;
            this.f64579b.setSelection(this.f64580c, this.f64581d);
        }
    }

    public static class l implements e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        char f64584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Formatter f64585c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final StringBuilder f64583a = new StringBuilder();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Object[] f64586d = new Object[1];

        l() {
            d(Locale.getDefault());
        }

        private Formatter b(Locale locale) {
            return new Formatter(this.f64583a, locale);
        }

        private static char c(Locale locale) {
            return new DecimalFormatSymbols(locale).getZeroDigit();
        }

        private void d(Locale locale) {
            this.f64585c = b(locale);
            this.f64584b = c(locale);
        }

        @Override // com.loper7.date_time_picker.number_picker.NumberPicker.e
        public String a(int i10) {
            Locale locale = Locale.getDefault();
            if (this.f64584b != c(locale)) {
                d(locale);
            }
            this.f64586d[0] = Integer.valueOf(i10);
            StringBuilder sb2 = this.f64583a;
            sb2.delete(0, sb2.length());
            this.f64585c.format(TimeModel.f55753i, this.f64586d);
            return this.f64585c.toString();
        }
    }

    public NumberPicker(Context context) {
        this(context, null);
    }

    public NumberPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NumberPicker(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        this.f64531b = "";
        this.f64534c = true;
        this.f64537d = true;
        this.f64550m = 1;
        this.f64551n = j1.f21601t;
        this.f64552o = G4;
        this.f64559s = 1;
        this.f64560t = j1.f21601t;
        this.f64561u = G4;
        this.B = 1;
        this.C = 100;
        this.I = 300L;
        this.J = new SparseArray<>();
        this.K = 3;
        this.L = 3;
        this.M = 3 / 2;
        this.N = new int[3];
        this.Q = Integer.MIN_VALUE;
        this.f64556p3 = true;
        this.J3 = j1.f21601t;
        this.S3 = 0;
        this.T3 = -1;
        this.X3 = true;
        this.Y3 = f64523u4;
        this.Z3 = true;
        this.f64530a4 = 1.0f;
        this.f64533b4 = 8;
        this.f64536c4 = true;
        this.f64544g4 = 0;
        this.f64538d4 = context;
        this.f64540e4 = NumberFormat.getInstance();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.M0, i10, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.NumberPicker_np_divider);
        if (drawable != null) {
            drawable.setCallback(this);
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
            this.G3 = drawable;
        } else {
            int color = typedArrayObtainStyledAttributes.getColor(R.styleable.NumberPicker_np_dividerColor, this.J3);
            this.J3 = color;
            setDividerColor(color);
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iApplyDimension = (int) TypedValue.applyDimension(1, 48.0f, displayMetrics);
        int iApplyDimension2 = (int) TypedValue.applyDimension(1, 2.0f, displayMetrics);
        this.K3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.NumberPicker_np_dividerDistance, iApplyDimension);
        this.L3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.NumberPicker_np_dividerLength, 0);
        this.M3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.NumberPicker_np_dividerThickness, iApplyDimension2);
        this.R3 = typedArrayObtainStyledAttributes.getInt(R.styleable.NumberPicker_np_dividerType, 0);
        this.W3 = typedArrayObtainStyledAttributes.getInt(R.styleable.NumberPicker_np_order, 0);
        this.V3 = typedArrayObtainStyledAttributes.getInt(R.styleable.NumberPicker_np_orientation, 1);
        float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.NumberPicker_np_width, -1);
        float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.NumberPicker_np_height, -1);
        a0();
        this.f64549l = true;
        this.D = typedArrayObtainStyledAttributes.getInt(R.styleable.NumberPicker_np_value, this.D);
        this.C = typedArrayObtainStyledAttributes.getInt(R.styleable.NumberPicker_np_max, this.C);
        this.B = typedArrayObtainStyledAttributes.getInt(R.styleable.NumberPicker_np_min, this.B);
        this.f64550m = typedArrayObtainStyledAttributes.getInt(R.styleable.NumberPicker_np_selectedTextAlign, this.f64550m);
        this.f64551n = typedArrayObtainStyledAttributes.getColor(R.styleable.NumberPicker_np_selectedTextColor, this.f64551n);
        this.f64552o = typedArrayObtainStyledAttributes.getDimension(R.styleable.NumberPicker_np_selectedTextSize, d0(this.f64552o));
        this.f64553p = typedArrayObtainStyledAttributes.getBoolean(R.styleable.NumberPicker_np_selectedTextStrikeThru, this.f64553p);
        this.f64557q = typedArrayObtainStyledAttributes.getBoolean(R.styleable.NumberPicker_np_selectedTextUnderline, this.f64557q);
        this.f64558r = Typeface.create(typedArrayObtainStyledAttributes.getString(R.styleable.NumberPicker_np_selectedTypeface), 0);
        this.f64559s = typedArrayObtainStyledAttributes.getInt(R.styleable.NumberPicker_np_textAlign, this.f64559s);
        this.f64560t = typedArrayObtainStyledAttributes.getColor(R.styleable.NumberPicker_np_textColor, this.f64560t);
        this.f64561u = typedArrayObtainStyledAttributes.getDimension(R.styleable.NumberPicker_np_textSize, d0(this.f64561u));
        this.f64562v = typedArrayObtainStyledAttributes.getBoolean(R.styleable.NumberPicker_np_textStrikeThru, this.f64562v);
        this.f64563w = typedArrayObtainStyledAttributes.getBoolean(R.styleable.NumberPicker_np_textUnderline, this.f64563w);
        this.f64564x = Typeface.create(typedArrayObtainStyledAttributes.getString(R.styleable.NumberPicker_np_typeface), 0);
        this.H = e0(typedArrayObtainStyledAttributes.getString(R.styleable.NumberPicker_np_formatter));
        this.X3 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.NumberPicker_np_fadingEdgeEnabled, this.X3);
        this.Y3 = typedArrayObtainStyledAttributes.getFloat(R.styleable.NumberPicker_np_fadingEdgeStrength, this.Y3);
        this.Z3 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.NumberPicker_np_scrollerEnabled, this.Z3);
        this.K = typedArrayObtainStyledAttributes.getInt(R.styleable.NumberPicker_np_wheelItemCount, this.K);
        this.f64530a4 = typedArrayObtainStyledAttributes.getFloat(R.styleable.NumberPicker_np_lineSpacingMultiplier, this.f64530a4);
        this.f64533b4 = typedArrayObtainStyledAttributes.getInt(R.styleable.NumberPicker_np_maxFlingVelocityCoefficient, this.f64533b4);
        this.U3 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.NumberPicker_np_hideWheelUntilFocused, false);
        this.f64536c4 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.NumberPicker_np_accessibilityDescriptionEnabled, true);
        this.f64544g4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.NumberPicker_np_itemSpacing, 0);
        this.f64534c = typedArrayObtainStyledAttributes.getBoolean(R.styleable.NumberPicker_np_textBold, this.f64534c);
        this.f64537d = typedArrayObtainStyledAttributes.getBoolean(R.styleable.NumberPicker_np_selectedTextBold, this.f64537d);
        setWillNotDraw(false);
        EditText editText = new EditText(context);
        this.f64539e = editText;
        editText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        editText.setGravity(17);
        editText.setSingleLine(true);
        editText.setImportantForAccessibility(2);
        editText.setEnabled(false);
        editText.setFocusable(false);
        editText.setVisibility(4);
        editText.setImeOptions(1);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        this.O = paint;
        setSelectedTextColor(this.f64551n);
        setTextColor(this.f64560t);
        setTextSize(this.f64561u);
        setSelectedTextSize(this.f64552o);
        setTypeface(this.f64564x);
        setSelectedTypeface(this.f64558r);
        setFormatter(this.H);
        h0();
        setValue(this.D);
        setMaxValue(this.C);
        setMinValue(this.B);
        setWheelItemCount(this.K);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.NumberPicker_np_wrapSelectorWheel, this.G2);
        this.G2 = z10;
        setWrapSelectorWheel(z10);
        if (dimensionPixelSize != -1.0f && dimensionPixelSize2 != -1.0f) {
            setScaleX(dimensionPixelSize / this.f64547j);
            setScaleY(dimensionPixelSize2 / this.f64546i);
        } else if (dimensionPixelSize != -1.0f) {
            float f10 = dimensionPixelSize / this.f64547j;
            setScaleX(f10);
            setScaleY(f10);
        } else if (dimensionPixelSize2 != -1.0f) {
            float f11 = dimensionPixelSize2 / this.f64546i;
            setScaleX(f11);
            setScaleY(f11);
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f64542f4 = viewConfiguration;
        this.f64555p2 = viewConfiguration.getScaledTouchSlop();
        this.f64566x2 = this.f64542f4.getScaledMinimumFlingVelocity();
        this.f64569y2 = this.f64542f4.getScaledMaximumFlingVelocity() / this.f64533b4;
        this.S = new com.loper7.date_time_picker.number_picker.a(context, null, true);
        this.T = new com.loper7.date_time_picker.number_picker.a(context, new DecelerateInterpolator(2.5f));
        int i11 = Build.VERSION.SDK_INT;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        if (i11 >= 26 && getFocusable() == 16) {
            setFocusable(1);
            setFocusableInTouchMode(true);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void A(int[] iArr) {
        int i10 = 0;
        while (i10 < iArr.length - 1) {
            int i11 = i10 + 1;
            iArr[i10] = iArr[i11];
            i10 = i11;
        }
        int i12 = iArr[iArr.length - 2] + 1;
        if (this.G2 && i12 > this.C) {
            i12 = this.B;
        }
        iArr[iArr.length - 1] = i12;
        r(i12);
    }

    private void B() {
        if (H()) {
            setHorizontalFadingEdgeEnabled(true);
            setVerticalFadingEdgeEnabled(false);
            setFadingEdgeLength(((getRight() - getLeft()) - ((int) this.f64561u)) / 2);
        } else {
            setHorizontalFadingEdgeEnabled(false);
            setVerticalFadingEdgeEnabled(true);
            setFadingEdgeLength(((getBottom() - getTop()) - ((int) this.f64561u)) / 2);
        }
    }

    private void C() {
        D();
        int[] selectorIndices = getSelectorIndices();
        int length = (int) (((selectorIndices.length - 1) * this.f64561u) + this.f64552o);
        float length2 = selectorIndices.length;
        if (H()) {
            this.f64567y = (int) (((getRight() - getLeft()) - length) / length2);
            int maxTextSize = ((int) getMaxTextSize()) + this.f64567y;
            this.P = maxTextSize;
            this.Q = (int) (this.f64541f - (maxTextSize * this.M));
        } else {
            this.f64570z = (int) (((getBottom() - getTop()) - length) / length2);
            int maxTextSize2 = ((int) getMaxTextSize()) + this.f64570z;
            this.P = maxTextSize2;
            this.Q = (int) (this.f64543g - (maxTextSize2 * this.M));
        }
        this.R = this.Q;
        h0();
    }

    private void D() {
        this.J.clear();
        int[] selectorIndices = getSelectorIndices();
        int value = getValue();
        for (int i10 = 0; i10 < selectorIndices.length; i10++) {
            int iZ = (i10 - this.M) + value;
            if (this.G2) {
                iZ = z(iZ);
            }
            selectorIndices[i10] = iZ;
            r(iZ);
        }
    }

    private boolean L() {
        return this.C - this.B >= this.N.length - 1;
    }

    private int M(int i10, int i11) {
        if (i11 == -1) {
            return i10;
        }
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i11), 1073741824);
        }
        if (mode == 0) {
            return View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        if (mode == 1073741824) {
            return i10;
        }
        throw new IllegalArgumentException("Unknown measure mode: " + mode);
    }

    private boolean N(com.loper7.date_time_picker.number_picker.a aVar) {
        aVar.f(true);
        if (H()) {
            int iK = aVar.k() - aVar.h();
            int i10 = this.Q - ((this.R + iK) % this.P);
            if (i10 != 0) {
                int iAbs = Math.abs(i10);
                int i11 = this.P;
                if (iAbs > i11 / 2) {
                    i10 = i10 > 0 ? i10 - i11 : i10 + i11;
                }
                scrollBy(iK + i10, 0);
                return true;
            }
        } else {
            int iL = aVar.l() - aVar.i();
            int i12 = this.Q - ((this.R + iL) % this.P);
            if (i12 != 0) {
                int iAbs2 = Math.abs(i12);
                int i13 = this.P;
                if (iAbs2 > i13 / 2) {
                    i12 = i12 > 0 ? i12 - i13 : i12 + i13;
                }
                scrollBy(0, iL + i12);
                return true;
            }
        }
        return false;
    }

    private void O(int i10, int i11) {
        h hVar = this.F;
        if (hVar != null) {
            hVar.a(this, i10, i11);
        }
    }

    private void P(int i10) {
        if (this.S3 == i10) {
            return;
        }
        this.S3 = i10;
        g gVar = this.G;
        if (gVar != null) {
            gVar.a(this, i10);
        }
    }

    private void Q(com.loper7.date_time_picker.number_picker.a aVar) {
        if (aVar == this.S) {
            s();
            h0();
            P(0);
        } else if (this.S3 != 1) {
            h0();
        }
    }

    private void R(boolean z10) {
        S(z10, ViewConfiguration.getLongPressTimeout());
    }

    private void S(boolean z10, long j10) {
        c cVar = this.f64529a0;
        if (cVar == null) {
            this.f64529a0 = new c();
        } else {
            removeCallbacks(cVar);
        }
        this.f64529a0.b(z10);
        postDelayed(this.f64529a0, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(int i10, int i11) {
        k kVar = this.W;
        if (kVar == null) {
            this.W = new k(this.f64539e);
        } else {
            kVar.b(i10, i11);
        }
    }

    private float U(float f10) {
        return f10 / getResources().getDisplayMetrics().density;
    }

    private float V(float f10) {
        return f10 / getResources().getDisplayMetrics().scaledDensity;
    }

    private void W() {
        c cVar = this.f64529a0;
        if (cVar != null) {
            removeCallbacks(cVar);
        }
        k kVar = this.W;
        if (kVar != null) {
            kVar.a();
        }
    }

    private void X() {
        c cVar = this.f64529a0;
        if (cVar != null) {
            removeCallbacks(cVar);
        }
    }

    private int Y(int i10, int i11, int i12) {
        return i10 != -1 ? resolveSizeAndState(Math.max(i10, i11), i12, 0) : i11;
    }

    private void Z(int i10, boolean z10) {
        if (this.D == i10) {
            return;
        }
        int iZ = this.G2 ? z(i10) : Math.min(Math.max(i10, this.B), this.C);
        int i11 = this.D;
        this.D = iZ;
        if (this.S3 != 2) {
            h0();
        }
        if (z10) {
            O(i11, iZ);
        }
        D();
        g0();
        invalidate();
    }

    private void a0() {
        if (H()) {
            this.f64545h = -1;
            this.f64546i = (int) n(58.0f);
            this.f64547j = (int) n(180.0f);
            this.f64548k = -1;
            return;
        }
        this.f64545h = -1;
        this.f64546i = (int) n(180.0f);
        this.f64547j = (int) n(58.0f);
        this.f64548k = -1;
    }

    private float d0(float f10) {
        return TypedValue.applyDimension(2, f10, getResources().getDisplayMetrics());
    }

    private e e0(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new a(str);
    }

    private void f0() {
        int i10;
        if (this.f64549l) {
            this.O.setTextSize(getMaxTextSize());
            String[] strArr = this.A;
            int i11 = 0;
            if (strArr == null) {
                float f10 = 0.0f;
                for (int i12 = 0; i12 <= 9; i12++) {
                    float fMeasureText = this.O.measureText(u(i12));
                    if (fMeasureText > f10) {
                        f10 = fMeasureText;
                    }
                }
                for (int i13 = this.C; i13 > 0; i13 /= 10) {
                    i11++;
                }
                i10 = (int) (i11 * f10);
            } else {
                int length = strArr.length;
                int i14 = 0;
                while (i11 < length) {
                    float fMeasureText2 = this.O.measureText(strArr[i11]);
                    if (fMeasureText2 > i14) {
                        i14 = (int) fMeasureText2;
                    }
                    i11++;
                }
                i10 = i14;
            }
            int paddingLeft = i10 + this.f64539e.getPaddingLeft() + this.f64539e.getPaddingRight();
            if (this.f64548k != paddingLeft) {
                this.f64548k = Math.max(paddingLeft, this.f64547j);
                invalidate();
            }
        }
    }

    private void g0() {
        if (this.f64536c4) {
            setContentDescription(String.valueOf(getValue()));
        }
    }

    private float getMaxTextSize() {
        return Math.max(this.f64561u, this.f64552o);
    }

    private int[] getSelectorIndices() {
        return this.N;
    }

    public static e getTwoDigitFormatter() {
        return I4;
    }

    private void h0() {
        String[] strArr = this.A;
        String strU = strArr == null ? u(this.D) : strArr[this.D - this.B];
        if (TextUtils.isEmpty(strU) || strU.equals(this.f64539e.getText().toString())) {
            return;
        }
        this.f64539e.setText(strU + this.f64531b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(boolean z10) {
        if (!N(this.S)) {
            N(this.T);
        }
        b0(z10, 1);
    }

    private void i0() {
        this.G2 = L() && this.f64556p3;
    }

    private int j(boolean z10) {
        return z10 ? getWidth() : getHeight();
    }

    private int k(boolean z10) {
        if (z10) {
            return this.R;
        }
        return 0;
    }

    private int l(boolean z10) {
        if (z10) {
            return ((this.C - this.B) + 1) * this.P;
        }
        return 0;
    }

    private void m(int[] iArr) {
        for (int length = iArr.length - 1; length > 0; length--) {
            iArr[length] = iArr[length - 1];
        }
        int i10 = iArr[1] - 1;
        if (this.G2 && i10 < this.B) {
            i10 = this.C;
        }
        iArr[0] = i10;
        r(i10);
    }

    private float n(float f10) {
        return f10 * getResources().getDisplayMetrics().density;
    }

    private void o(Canvas canvas) {
        int i10;
        int bottom;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.R3;
        if (i15 != 0) {
            if (i15 != 1) {
                return;
            }
            int i16 = this.L3;
            if (i16 <= 0 || i16 > (i14 = this.f64548k)) {
                i12 = this.P3;
                i13 = this.Q3;
            } else {
                i12 = (i14 - i16) / 2;
                i13 = i16 + i12;
            }
            int i17 = this.O3;
            this.G3.setBounds(i12, i17 - this.M3, i13, i17);
            this.G3.draw(canvas);
            return;
        }
        int i18 = this.L3;
        if (i18 <= 0 || i18 > (i11 = this.f64546i)) {
            i10 = 0;
            bottom = getBottom();
        } else {
            i10 = (i11 - i18) / 2;
            bottom = i18 + i10;
        }
        int i19 = this.P3;
        this.G3.setBounds(i19, i10, this.M3 + i19, bottom);
        this.G3.draw(canvas);
        int i20 = this.Q3;
        this.G3.setBounds(i20 - this.M3, i10, i20, bottom);
        this.G3.draw(canvas);
    }

    private void p(String str, float f10, float f11, Paint paint, Canvas canvas) {
        if (!str.contains("\n")) {
            canvas.drawText(str, f10, f11, paint);
            return;
        }
        String[] strArrSplit = str.split("\n");
        float fAbs = Math.abs(paint.descent() + paint.ascent()) * this.f64530a4;
        float length = f11 - (((strArrSplit.length - 1) * fAbs) / 2.0f);
        for (String str2 : strArrSplit) {
            canvas.drawText(str2, f10, length, paint);
            length += fAbs;
        }
    }

    private void q(Canvas canvas) {
        int i10;
        int right;
        int i11;
        int i12 = this.L3;
        if (i12 <= 0 || i12 > (i11 = this.f64548k)) {
            i10 = 0;
            right = getRight();
        } else {
            i10 = (i11 - i12) / 2;
            right = i12 + i10;
        }
        int i13 = this.R3;
        if (i13 != 0) {
            if (i13 != 1) {
                return;
            }
            int i14 = this.O3;
            this.G3.setBounds(i10, i14 - this.M3, right, i14);
            this.G3.draw(canvas);
            return;
        }
        int i15 = this.N3;
        this.G3.setBounds(i10, i15, right, this.M3 + i15);
        this.G3.draw(canvas);
        int i16 = this.O3;
        this.G3.setBounds(i10, i16 - this.M3, right, i16);
        this.G3.draw(canvas);
    }

    private void r(int i10) {
        String strU;
        SparseArray<String> sparseArray = this.J;
        if (sparseArray.get(i10) != null) {
            return;
        }
        int i11 = this.B;
        if (i10 < i11 || i10 > this.C) {
            strU = "";
        } else {
            String[] strArr = this.A;
            if (strArr != null) {
                int i12 = i10 - i11;
                if (i12 >= strArr.length) {
                    sparseArray.remove(i10);
                    return;
                }
                strU = strArr[i12];
            } else {
                strU = u(i10);
            }
        }
        sparseArray.put(i10, strU);
    }

    public static int resolveSizeAndState(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                i10 = size;
            }
        } else if (size < i10) {
            i10 = 16777216 | size;
        }
        return i10 | ((-16777216) & i12);
    }

    private void s() {
        int i10 = this.Q - this.R;
        if (i10 == 0) {
            return;
        }
        int iAbs = Math.abs(i10);
        int i11 = this.P;
        if (iAbs > i11 / 2) {
            if (i10 > 0) {
                i11 = -i11;
            }
            i10 += i11;
        }
        int i12 = i10;
        if (H()) {
            this.U = 0;
            this.T.x(0, 0, i12, 0, 800);
        } else {
            this.V = 0;
            this.T.x(0, 0, 0, i12, 800);
        }
        invalidate();
    }

    private void t(int i10) {
        if (H()) {
            this.U = 0;
            if (i10 > 0) {
                this.S.e(0, 0, i10, 0, 0, Integer.MAX_VALUE, 0, 0);
            } else {
                this.S.e(Integer.MAX_VALUE, 0, i10, 0, 0, Integer.MAX_VALUE, 0, 0);
            }
        } else {
            this.V = 0;
            if (i10 > 0) {
                this.S.e(0, 0, 0, i10, 0, 0, 0, Integer.MAX_VALUE);
            } else {
                this.S.e(0, Integer.MAX_VALUE, 0, i10, 0, 0, 0, Integer.MAX_VALUE);
            }
        }
        invalidate();
    }

    private String u(int i10) {
        e eVar = this.H;
        return eVar != null ? eVar.a(i10) : v(i10);
    }

    private String v(int i10) {
        return i10 + "";
    }

    private float w(boolean z10) {
        if (z10 && this.X3) {
            return this.Y3;
        }
        return 0.0f;
    }

    private float x(Paint.FontMetrics fontMetrics) {
        if (fontMetrics == null) {
            return 0.0f;
        }
        return Math.abs(fontMetrics.top + fontMetrics.bottom) / 2.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int y(String str) {
        try {
            if (this.A == null) {
                return Integer.parseInt(str);
            }
            for (int i10 = 0; i10 < this.A.length; i10++) {
                str = str.toLowerCase();
                if (this.A[i10].toLowerCase().startsWith(str)) {
                    return this.B + i10;
                }
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return this.B;
        }
    }

    private int z(int i10) {
        int i11 = this.C;
        if (i10 > i11) {
            int i12 = this.B;
            return (i12 + ((i10 - i11) % (i11 - i12))) - 1;
        }
        int i13 = this.B;
        return i10 < i13 ? (i11 - ((i13 - i10) % (i11 - i13))) + 1 : i10;
    }

    public boolean E() {
        return this.f64536c4;
    }

    public boolean F() {
        return getOrder() == 0;
    }

    public boolean G() {
        return this.X3;
    }

    public boolean H() {
        return getOrientation() == 0;
    }

    public boolean I() {
        return this.Z3;
    }

    public boolean J() {
        return this.f64537d;
    }

    public boolean K() {
        return this.f64534c;
    }

    public void b0(boolean z10, int i10) {
        int i11 = (z10 ? -this.P : this.P) * i10;
        if (H()) {
            this.U = 0;
            this.S.x(0, 0, i11, 0, 300);
        } else {
            this.V = 0;
            this.S.x(0, 0, 0, i11, 300);
        }
        invalidate();
    }

    public void c0(int i10) {
        int i11 = getSelectorIndices()[this.M];
        if (i11 == i10) {
            return;
        }
        b0(i10 > i11, Math.abs(i10 - i11));
    }

    @Override // android.view.View
    protected int computeHorizontalScrollExtent() {
        return j(H());
    }

    @Override // android.view.View
    protected int computeHorizontalScrollOffset() {
        return k(H());
    }

    @Override // android.view.View
    protected int computeHorizontalScrollRange() {
        return l(H());
    }

    @Override // android.view.View
    public void computeScroll() {
        if (I()) {
            com.loper7.date_time_picker.number_picker.a aVar = this.S;
            if (aVar.r()) {
                aVar = this.T;
                if (aVar.r()) {
                    return;
                }
            }
            aVar.c();
            if (H()) {
                int iH = aVar.h();
                if (this.U == 0) {
                    this.U = aVar.p();
                }
                scrollBy(iH - this.U, 0);
                this.U = iH;
            } else {
                int i10 = aVar.i();
                if (this.V == 0) {
                    this.V = aVar.q();
                }
                scrollBy(0, i10 - this.V);
                this.V = i10;
            }
            if (aVar.r()) {
                Q(aVar);
            } else {
                postInvalidate();
            }
        }
    }

    @Override // android.view.View
    protected int computeVerticalScrollExtent() {
        return j(H());
    }

    @Override // android.view.View
    protected int computeVerticalScrollOffset() {
        return k(!H());
    }

    @Override // android.view.View
    protected int computeVerticalScrollRange() {
        return l(!H());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19 || keyCode == 20) {
            int action = keyEvent.getAction();
            if (action == 0) {
                if (!this.G2) {
                    if (keyCode == 20) {
                    }
                }
                requestFocus();
                this.T3 = keyCode;
                W();
                if (this.S.r()) {
                    i(keyCode == 20);
                }
                return true;
            }
            if (action == 1 && this.T3 == keyCode) {
                this.T3 = -1;
                return true;
            }
        } else if (keyCode == 23 || keyCode == 66) {
            W();
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 1 || action == 3) {
            W();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 1 || action == 3) {
            W();
        }
        return super.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    @androidx.annotation.i
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.G3;
        if (drawable != null && drawable.isStateful() && this.G3.setState(getDrawableState())) {
            invalidateDrawable(this.G3);
        }
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        return w(!H());
    }

    public String[] getDisplayedValues() {
        return this.A;
    }

    public int getDividerColor() {
        return this.J3;
    }

    public float getDividerDistance() {
        return U(this.K3);
    }

    public float getDividerThickness() {
        return U(this.M3);
    }

    public float getFadingEdgeStrength() {
        return this.Y3;
    }

    public e getFormatter() {
        return this.H;
    }

    public String getLabel() {
        return this.f64531b;
    }

    @Override // android.view.View
    protected float getLeftFadingEdgeStrength() {
        return w(H());
    }

    public float getLineSpacingMultiplier() {
        return this.f64530a4;
    }

    public int getMaxFlingVelocityCoefficient() {
        return this.f64533b4;
    }

    public int getMaxValue() {
        return this.C;
    }

    public int getMinValue() {
        return this.B;
    }

    public int getOrder() {
        return this.W3;
    }

    @Override // android.widget.LinearLayout
    public int getOrientation() {
        return this.V3;
    }

    @Override // android.view.View
    protected float getRightFadingEdgeStrength() {
        return w(H());
    }

    public int getSelectedTextAlign() {
        return this.f64550m;
    }

    public int getSelectedTextColor() {
        return this.f64551n;
    }

    public float getSelectedTextSize() {
        return this.f64552o;
    }

    public boolean getSelectedTextStrikeThru() {
        return this.f64553p;
    }

    public boolean getSelectedTextUnderline() {
        return this.f64557q;
    }

    public int getTextAlign() {
        return this.f64559s;
    }

    public int getTextColor() {
        return this.f64560t;
    }

    public float getTextSize() {
        return d0(this.f64561u);
    }

    public boolean getTextStrikeThru() {
        return this.f64562v;
    }

    public boolean getTextUnderline() {
        return this.f64563w;
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        return w(!H());
    }

    public Typeface getTypeface() {
        return this.f64564x;
    }

    public int getValue() {
        return this.D;
    }

    public int getWheelItemCount() {
        return this.K;
    }

    public boolean getWrapSelectorWheel() {
        return this.G2;
    }

    @Override // android.view.ViewGroup, android.view.View
    @androidx.annotation.i
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.G3;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f64540e4 = NumberFormat.getInstance();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        W();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        float right;
        float baseline;
        String strReplace;
        int i10;
        int i11;
        canvas.save();
        boolean z10 = !this.U3 || hasFocus();
        if (H()) {
            right = this.R;
            baseline = this.f64539e.getBaseline() + this.f64539e.getTop();
            if (this.L < 3) {
                canvas.clipRect(this.P3, 0, this.Q3, getBottom());
            }
        } else {
            right = (getRight() - getLeft()) / 2.0f;
            baseline = this.R;
            if (this.L < 3) {
                canvas.clipRect(0, this.N3, getRight(), this.O3);
            }
        }
        int[] selectorIndices = getSelectorIndices();
        int i12 = 0;
        while (i12 < selectorIndices.length) {
            String str = this.J.get(selectorIndices[F() ? i12 : (selectorIndices.length - i12) - 1]);
            if (i12 == this.M) {
                this.O.setTextAlign(Paint.Align.values()[this.f64550m]);
                this.O.setTextSize(this.f64552o);
                this.O.setColor(this.f64551n);
                this.O.setFakeBoldText(this.f64537d);
                this.O.setStrikeThruText(this.f64553p);
                this.O.setUnderlineText(this.f64557q);
                this.O.setTypeface(this.f64558r);
                strReplace = str + this.f64531b;
            } else {
                this.O.setTextAlign(Paint.Align.values()[this.f64559s]);
                this.O.setTextSize(this.f64561u);
                this.O.setColor(this.f64560t);
                this.O.setFakeBoldText(this.f64534c);
                this.O.setStrikeThruText(this.f64562v);
                this.O.setUnderlineText(this.f64563w);
                this.O.setTypeface(this.f64564x);
                strReplace = str.replace(this.f64531b, "");
            }
            String str2 = strReplace;
            if (str2 != null) {
                if ((z10 && i12 != this.M) || (i12 == this.M && this.f64539e.getVisibility() != 0)) {
                    float fX = !H() ? x(this.O.getFontMetrics()) + baseline : baseline;
                    if (i12 == this.M || this.f64544g4 == 0) {
                        i10 = 0;
                        i11 = 0;
                    } else if (H()) {
                        i10 = i12 > this.M ? this.f64544g4 : -this.f64544g4;
                        i11 = 0;
                    } else {
                        i11 = i12 > this.M ? this.f64544g4 : -this.f64544g4;
                        i10 = 0;
                    }
                    p(str2, right + i10, fX + i11, this.O, canvas);
                }
                if (H()) {
                    right += this.P;
                } else {
                    baseline += this.P;
                }
            }
            i12++;
        }
        canvas.restore();
        if (!z10 || this.G3 == null) {
            return;
        }
        if (H()) {
            o(canvas);
        } else {
            q(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(NumberPicker.class.getName());
        accessibilityEvent.setScrollable(I());
        int i10 = this.B;
        int i11 = this.D + i10;
        int i12 = this.P;
        int i13 = i11 * i12;
        int i14 = (this.C - i10) * i12;
        if (H()) {
            accessibilityEvent.setScrollX(i13);
            accessibilityEvent.setMaxScrollX(i14);
        } else {
            accessibilityEvent.setScrollY(i13);
            accessibilityEvent.setMaxScrollY(i14);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || (motionEvent.getAction() & 255) != 0) {
            return false;
        }
        W();
        getParent().requestDisallowInterceptTouchEvent(true);
        if (H()) {
            float x10 = motionEvent.getX();
            this.f64532b0 = x10;
            this.f64554p1 = x10;
            if (!this.S.r()) {
                this.S.f(true);
                this.T.f(true);
                Q(this.S);
                P(0);
            } else if (this.T.r()) {
                float f10 = this.f64532b0;
                int i10 = this.P3;
                if (f10 >= i10 && f10 <= this.Q3) {
                    View.OnClickListener onClickListener = this.E;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                } else if (f10 < i10) {
                    R(false);
                } else if (f10 > this.Q3) {
                    R(true);
                }
            } else {
                this.S.f(true);
                this.T.f(true);
                Q(this.T);
            }
        } else {
            float y10 = motionEvent.getY();
            this.f64535c0 = y10;
            this.f64565x1 = y10;
            if (!this.S.r()) {
                this.S.f(true);
                this.T.f(true);
                P(0);
            } else if (this.T.r()) {
                float f11 = this.f64535c0;
                int i11 = this.N3;
                if (f11 >= i11 && f11 <= this.O3) {
                    View.OnClickListener onClickListener2 = this.E;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(this);
                    }
                } else if (f11 < i11) {
                    R(false);
                } else if (f11 > this.O3) {
                    R(true);
                }
            } else {
                this.S.f(true);
                this.T.f(true);
            }
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.f64539e.getMeasuredWidth();
        int measuredHeight2 = this.f64539e.getMeasuredHeight();
        int i14 = (measuredWidth - measuredWidth2) / 2;
        int i15 = (measuredHeight - measuredHeight2) / 2;
        this.f64539e.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
        this.f64541f = (this.f64539e.getX() + (this.f64539e.getMeasuredWidth() / 2.0f)) - 2.0f;
        this.f64543g = (this.f64539e.getY() + (this.f64539e.getMeasuredHeight() / 2.0f)) - 5.0f;
        if (z10) {
            C();
            B();
            int i16 = (this.M3 * 2) + this.K3;
            if (!H()) {
                int height = ((getHeight() - this.K3) / 2) - this.M3;
                this.N3 = height;
                this.O3 = height + i16;
            } else {
                int width = ((getWidth() - this.K3) / 2) - this.M3;
                this.P3 = width;
                this.Q3 = width + i16;
                this.O3 = getHeight();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(M(i10, this.f64548k), M(i11, this.f64546i));
        setMeasuredDimension(Y(this.f64547j, getMeasuredWidth(), i10), Y(this.f64545h, getMeasuredHeight(), i11));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || !I()) {
            return false;
        }
        if (this.f64568y1 == null) {
            this.f64568y1 = VelocityTracker.obtain();
        }
        this.f64568y1.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 1) {
            X();
            VelocityTracker velocityTracker = this.f64568y1;
            velocityTracker.computeCurrentVelocity(1000, this.f64569y2);
            if (H()) {
                int xVelocity = (int) velocityTracker.getXVelocity();
                if (Math.abs(xVelocity) > this.f64566x2) {
                    t(xVelocity);
                    P(2);
                } else {
                    int x10 = (int) motionEvent.getX();
                    if (((int) Math.abs(x10 - this.f64532b0)) <= this.f64555p2) {
                        int i10 = (x10 / this.P) - this.M;
                        if (i10 > 0) {
                            i(true);
                        } else if (i10 < 0) {
                            i(false);
                        } else {
                            s();
                        }
                    } else {
                        s();
                    }
                    P(0);
                }
            } else {
                int yVelocity = (int) velocityTracker.getYVelocity();
                if (Math.abs(yVelocity) > this.f64566x2) {
                    t(yVelocity);
                    P(2);
                } else {
                    int y10 = (int) motionEvent.getY();
                    if (((int) Math.abs(y10 - this.f64535c0)) <= this.f64555p2) {
                        int i11 = (y10 / this.P) - this.M;
                        if (i11 > 0) {
                            i(true);
                        } else if (i11 < 0) {
                            i(false);
                        } else {
                            s();
                        }
                    } else {
                        s();
                    }
                    P(0);
                }
            }
            this.f64568y1.recycle();
            this.f64568y1 = null;
        } else if (action == 2) {
            if (H()) {
                float x11 = motionEvent.getX();
                if (this.S3 == 1) {
                    scrollBy((int) (x11 - this.f64554p1), 0);
                    invalidate();
                } else if (((int) Math.abs(x11 - this.f64532b0)) > this.f64555p2) {
                    W();
                    P(1);
                }
                this.f64554p1 = x11;
            } else {
                float y11 = motionEvent.getY();
                if (this.S3 == 1) {
                    scrollBy(0, (int) (y11 - this.f64565x1));
                    invalidate();
                } else if (((int) Math.abs(y11 - this.f64535c0)) > this.f64555p2) {
                    W();
                    P(1);
                }
                this.f64565x1 = y11;
            }
        }
        return true;
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        int i12;
        if (I()) {
            int[] selectorIndices = getSelectorIndices();
            int i13 = this.R;
            int maxTextSize = (int) getMaxTextSize();
            if (H()) {
                if (F()) {
                    boolean z10 = this.G2;
                    if (!z10 && i10 > 0 && selectorIndices[this.M] <= this.B) {
                        this.R = this.Q;
                        return;
                    } else if (!z10 && i10 < 0 && selectorIndices[this.M] >= this.C) {
                        this.R = this.Q;
                        return;
                    }
                } else {
                    boolean z11 = this.G2;
                    if (!z11 && i10 > 0 && selectorIndices[this.M] >= this.C) {
                        this.R = this.Q;
                        return;
                    } else if (!z11 && i10 < 0 && selectorIndices[this.M] <= this.B) {
                        this.R = this.Q;
                        return;
                    }
                }
                this.R += i10;
            } else {
                if (F()) {
                    boolean z12 = this.G2;
                    if (!z12 && i11 > 0 && selectorIndices[this.M] <= this.B) {
                        this.R = this.Q;
                        return;
                    } else if (!z12 && i11 < 0 && selectorIndices[this.M] >= this.C) {
                        this.R = this.Q;
                        return;
                    }
                } else {
                    boolean z13 = this.G2;
                    if (!z13 && i11 > 0 && selectorIndices[this.M] >= this.C) {
                        this.R = this.Q;
                        return;
                    } else if (!z13 && i11 < 0 && selectorIndices[this.M] <= this.B) {
                        this.R = this.Q;
                        return;
                    }
                }
                this.R += i11;
            }
            while (true) {
                int i14 = this.R;
                if (i14 - this.Q <= maxTextSize) {
                    break;
                }
                this.R = i14 - this.P;
                if (F()) {
                    m(selectorIndices);
                } else {
                    A(selectorIndices);
                }
                Z(selectorIndices[this.M], true);
                if (!this.G2 && selectorIndices[this.M] < this.B) {
                    this.R = this.Q;
                }
            }
            while (true) {
                i12 = this.R;
                if (i12 - this.Q >= (-maxTextSize)) {
                    break;
                }
                this.R = i12 + this.P;
                if (F()) {
                    A(selectorIndices);
                } else {
                    m(selectorIndices);
                }
                Z(selectorIndices[this.M], true);
                if (!this.G2 && selectorIndices[this.M] > this.C) {
                    this.R = this.Q;
                }
            }
            if (i13 != i12) {
                if (H()) {
                    onScrollChanged(this.R, 0, i13, 0);
                } else {
                    onScrollChanged(0, this.R, 0, i13);
                }
            }
        }
    }

    public void setAccessibilityDescriptionEnabled(boolean z10) {
        this.f64536c4 = z10;
    }

    public void setDisplayedValues(String[] strArr) {
        if (this.A == strArr) {
            return;
        }
        this.A = strArr;
        if (strArr != null) {
            this.f64539e.setRawInputType(655360);
        } else {
            this.f64539e.setRawInputType(655360);
        }
        h0();
        D();
        f0();
    }

    public void setDividerColor(@androidx.annotation.l int i10) {
        this.J3 = i10;
        this.G3 = new ColorDrawable(i10);
        invalidate();
    }

    public void setDividerColorResource(@n int i10) {
        setDividerColor(androidx.core.content.d.f(this.f64538d4, i10));
    }

    public void setDividerDistance(int i10) {
        this.K3 = i10;
    }

    public void setDividerDistanceResource(@q int i10) {
        setDividerDistance(getResources().getDimensionPixelSize(i10));
    }

    public void setDividerThickness(int i10) {
        this.M3 = i10;
    }

    public void setDividerThicknessResource(@q int i10) {
        setDividerThickness(getResources().getDimensionPixelSize(i10));
    }

    public void setDividerType(int i10) {
        this.R3 = i10;
        invalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f64539e.setEnabled(z10);
    }

    public void setFadingEdgeEnabled(boolean z10) {
        this.X3 = z10;
    }

    public void setFadingEdgeStrength(float f10) {
        this.Y3 = f10;
    }

    public void setFormatter(@d1 int i10) {
        setFormatter(getResources().getString(i10));
    }

    public void setFormatter(e eVar) {
        if (eVar == this.H) {
            return;
        }
        this.H = eVar;
        D();
        h0();
    }

    public void setFormatter(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setFormatter(e0(str));
    }

    public void setItemSpacing(int i10) {
        this.f64544g4 = i10;
    }

    public void setLabel(String str) {
        this.f64531b = str;
    }

    public void setLineSpacingMultiplier(float f10) {
        this.f64530a4 = f10;
    }

    public void setMaxFlingVelocityCoefficient(int i10) {
        this.f64533b4 = i10;
        this.f64569y2 = this.f64542f4.getScaledMaximumFlingVelocity() / this.f64533b4;
    }

    public void setMaxValue(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
        this.C = i10;
        if (i10 < this.D) {
            this.D = i10;
        }
        i0();
        D();
        h0();
        f0();
        invalidate();
    }

    public void setMinValue(int i10) {
        this.B = i10;
        if (i10 > this.D) {
            this.D = i10;
        }
        i0();
        D();
        h0();
        f0();
        invalidate();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.E = onClickListener;
    }

    public void setOnLongPressUpdateInterval(long j10) {
        this.I = j10;
    }

    public void setOnScrollListener(g gVar) {
        this.G = gVar;
    }

    public void setOnValueChangedListener(h hVar) {
        this.F = hVar;
    }

    public void setOrder(int i10) {
        this.W3 = i10;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        this.V3 = i10;
        a0();
        requestLayout();
    }

    public void setScrollerEnabled(boolean z10) {
        this.Z3 = z10;
    }

    public void setSelectedTextAlign(int i10) {
        this.f64550m = i10;
    }

    public void setSelectedTextBold(boolean z10) {
        this.f64537d = z10;
    }

    public void setSelectedTextColor(@androidx.annotation.l int i10) {
        this.f64551n = i10;
        this.f64539e.setTextColor(i10);
        invalidate();
    }

    public void setSelectedTextColorResource(@n int i10) {
        setSelectedTextColor(androidx.core.content.d.f(this.f64538d4, i10));
    }

    public void setSelectedTextSize(float f10) {
        this.f64552o = f10;
        this.f64539e.setTextSize(V(f10));
        invalidate();
    }

    public void setSelectedTextSize(@q int i10) {
        setSelectedTextSize(getResources().getDimension(i10));
    }

    public void setSelectedTextStrikeThru(boolean z10) {
        this.f64553p = z10;
    }

    public void setSelectedTextUnderline(boolean z10) {
        this.f64557q = z10;
    }

    public void setSelectedTypeface(@d1 int i10) {
        setSelectedTypeface(i10, 0);
    }

    public void setSelectedTypeface(@d1 int i10, int i11) {
        setSelectedTypeface(getResources().getString(i10), i11);
    }

    public void setSelectedTypeface(Typeface typeface) {
        this.f64558r = typeface;
        if (typeface != null) {
            this.O.setTypeface(typeface);
        } else {
            Typeface typeface2 = this.f64564x;
            if (typeface2 != null) {
                this.O.setTypeface(typeface2);
            } else {
                this.O.setTypeface(Typeface.MONOSPACE);
            }
        }
        invalidate();
    }

    public void setSelectedTypeface(String str) {
        setSelectedTypeface(str, 0);
    }

    public void setSelectedTypeface(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setSelectedTypeface(Typeface.create(str, i10));
    }

    public void setTextAlign(int i10) {
        this.f64559s = i10;
    }

    public void setTextBold(boolean z10) {
        this.f64534c = z10;
    }

    public void setTextColor(@androidx.annotation.l int i10) {
        this.f64560t = i10;
        this.O.setColor(i10);
        invalidate();
    }

    public void setTextColorResource(@n int i10) {
        setTextColor(androidx.core.content.d.f(this.f64538d4, i10));
    }

    public void setTextSize(float f10) {
        this.f64561u = f10;
        this.O.setTextSize(f10);
        invalidate();
    }

    public void setTextSize(@q int i10) {
        setTextSize(getResources().getDimension(i10));
    }

    public void setTextStrikeThru(boolean z10) {
        this.f64562v = z10;
    }

    public void setTextUnderline(boolean z10) {
        this.f64563w = z10;
    }

    public void setTypeface(@d1 int i10) {
        setTypeface(i10, 0);
    }

    public void setTypeface(@d1 int i10, int i11) {
        setTypeface(getResources().getString(i10), i11);
    }

    public void setTypeface(Typeface typeface) {
        this.f64564x = typeface;
        if (typeface != null) {
            this.f64539e.setTypeface(typeface);
            setSelectedTypeface(this.f64558r);
        } else {
            this.f64539e.setTypeface(Typeface.MONOSPACE);
        }
        invalidate();
    }

    public void setTypeface(String str) {
        setTypeface(str, 0);
    }

    public void setTypeface(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setTypeface(Typeface.create(str, i10));
    }

    public void setValue(int i10) {
        Z(i10, false);
    }

    public void setWheelItemCount(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("Wheel item count must be >= 1");
        }
        this.L = i10;
        int iMax = Math.max(i10, 3);
        this.K = iMax;
        this.M = iMax / 2;
        this.N = new int[iMax];
    }

    public void setWrapSelectorWheel(boolean z10) {
        this.f64556p3 = z10;
        i0();
    }
}
