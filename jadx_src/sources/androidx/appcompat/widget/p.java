package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.view.j1;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: compiled from: AppCompatTextHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f2871n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f2872o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f2873p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f2874q = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final TextView f2875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v0 f2876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private v0 f2877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private v0 f2878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private v0 f2879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private v0 f2880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private v0 f2881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private v0 f2882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    private final w f2883i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f2884j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f2885k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Typeface f2886l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f2887m;

    /* JADX INFO: compiled from: AppCompatTextHelper.java */
    public class a extends androidx.core.content.res.i.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f2888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f2889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f2890c;

        a(int i10, int i11, WeakReference weakReference) {
            this.f2888a = i10;
            this.f2889b = i11;
            this.f2890c = weakReference;
        }

        @Override // androidx.core.content.res.i.g
        /* JADX INFO: renamed from: h */
        public void f(int i10) {
        }

        @Override // androidx.core.content.res.i.g
        /* JADX INFO: renamed from: i */
        public void g(@androidx.annotation.n0 Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f2888a) != -1) {
                typeface = g.a(typeface, i10, (this.f2889b & 2) != 0);
            }
            p.this.n(this.f2890c, typeface);
        }
    }

    /* JADX INFO: compiled from: AppCompatTextHelper.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f2892b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Typeface f2893c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f2894d;

        b(TextView textView, Typeface typeface, int i10) {
            this.f2892b = textView;
            this.f2893c = typeface;
            this.f2894d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2892b.setTypeface(this.f2893c, this.f2894d);
        }
    }

    /* JADX INFO: compiled from: AppCompatTextHelper.java */
    @androidx.annotation.w0(17)
    public static class c {
        private c() {
        }

        @androidx.annotation.u
        static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        @androidx.annotation.u
        static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        @androidx.annotation.u
        static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* JADX INFO: compiled from: AppCompatTextHelper.java */
    @androidx.annotation.w0(21)
    public static class d {
        private d() {
        }

        @androidx.annotation.u
        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* JADX INFO: compiled from: AppCompatTextHelper.java */
    @androidx.annotation.w0(24)
    public static class e {
        private e() {
        }

        @androidx.annotation.u
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        @androidx.annotation.u
        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* JADX INFO: compiled from: AppCompatTextHelper.java */
    @androidx.annotation.w0(26)
    public static class f {
        private f() {
        }

        @androidx.annotation.u
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @androidx.annotation.u
        static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        @androidx.annotation.u
        static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        @androidx.annotation.u
        static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* JADX INFO: compiled from: AppCompatTextHelper.java */
    @androidx.annotation.w0(28)
    public static class g {
        private g() {
        }

        @androidx.annotation.u
        static Typeface a(Typeface typeface, int i10, boolean z10) {
            return Typeface.create(typeface, i10, z10);
        }
    }

    p(@androidx.annotation.n0 TextView textView) {
        this.f2875a = textView;
        this.f2883i = new w(textView);
    }

    private void B(int i10, float f10) {
        this.f2883i.w(i10, f10);
    }

    private void C(Context context, x0 x0Var) {
        String strW;
        this.f2884j = x0Var.o(R.styleable.TextAppearance_android_textStyle, this.f2884j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int iO = x0Var.o(R.styleable.TextAppearance_android_textFontWeight, -1);
            this.f2885k = iO;
            if (iO != -1) {
                this.f2884j = (this.f2884j & 2) | 0;
            }
        }
        int i11 = R.styleable.TextAppearance_android_fontFamily;
        if (!x0Var.C(i11) && !x0Var.C(R.styleable.TextAppearance_fontFamily)) {
            int i12 = R.styleable.TextAppearance_android_typeface;
            if (x0Var.C(i12)) {
                this.f2887m = false;
                int iO2 = x0Var.o(i12, 1);
                if (iO2 == 1) {
                    this.f2886l = Typeface.SANS_SERIF;
                    return;
                } else if (iO2 == 2) {
                    this.f2886l = Typeface.SERIF;
                    return;
                } else {
                    if (iO2 != 3) {
                        return;
                    }
                    this.f2886l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f2886l = null;
        int i13 = R.styleable.TextAppearance_fontFamily;
        if (x0Var.C(i13)) {
            i11 = i13;
        }
        int i14 = this.f2885k;
        int i15 = this.f2884j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceK = x0Var.k(i11, this.f2884j, new a(i14, i15, new WeakReference(this.f2875a)));
                if (typefaceK != null) {
                    if (i10 < 28 || this.f2885k == -1) {
                        this.f2886l = typefaceK;
                    } else {
                        this.f2886l = g.a(Typeface.create(typefaceK, 0), this.f2885k, (this.f2884j & 2) != 0);
                    }
                }
                this.f2887m = this.f2886l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f2886l != null || (strW = x0Var.w(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f2885k == -1) {
            this.f2886l = Typeface.create(strW, this.f2884j);
        } else {
            this.f2886l = g.a(Typeface.create(strW, 0), this.f2885k, (this.f2884j & 2) != 0);
        }
    }

    private void a(Drawable drawable, v0 v0Var) {
        if (drawable == null || v0Var == null) {
            return;
        }
        androidx.appcompat.widget.f.j(drawable, v0Var, this.f2875a.getDrawableState());
    }

    private static v0 d(Context context, androidx.appcompat.widget.f fVar, int i10) {
        ColorStateList colorStateListF = fVar.f(context, i10);
        if (colorStateListF == null) {
            return null;
        }
        v0 v0Var = new v0();
        v0Var.f2943d = true;
        v0Var.f2940a = colorStateListF;
        return v0Var;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] drawableArrA = c.a(this.f2875a);
            TextView textView = this.f2875a;
            if (drawable5 == null) {
                drawable5 = drawableArrA[0];
            }
            if (drawable2 == null) {
                drawable2 = drawableArrA[1];
            }
            if (drawable6 == null) {
                drawable6 = drawableArrA[2];
            }
            if (drawable4 == null) {
                drawable4 = drawableArrA[3];
            }
            c.b(textView, drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] drawableArrA2 = c.a(this.f2875a);
        Drawable drawable7 = drawableArrA2[0];
        if (drawable7 != null || drawableArrA2[2] != null) {
            TextView textView2 = this.f2875a;
            if (drawable2 == null) {
                drawable2 = drawableArrA2[1];
            }
            Drawable drawable8 = drawableArrA2[2];
            if (drawable4 == null) {
                drawable4 = drawableArrA2[3];
            }
            c.b(textView2, drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f2875a.getCompoundDrawables();
        TextView textView3 = this.f2875a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void z() {
        v0 v0Var = this.f2882h;
        this.f2876b = v0Var;
        this.f2877c = v0Var;
        this.f2878d = v0Var;
        this.f2879e = v0Var;
        this.f2880f = v0Var;
        this.f2881g = v0Var;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    void A(int i10, float f10) {
        if (androidx.core.widget.b.f21920t0 || l()) {
            return;
        }
        B(i10, f10);
    }

    void b() {
        if (this.f2876b != null || this.f2877c != null || this.f2878d != null || this.f2879e != null) {
            Drawable[] compoundDrawables = this.f2875a.getCompoundDrawables();
            a(compoundDrawables[0], this.f2876b);
            a(compoundDrawables[1], this.f2877c);
            a(compoundDrawables[2], this.f2878d);
            a(compoundDrawables[3], this.f2879e);
        }
        if (this.f2880f == null && this.f2881g == null) {
            return;
        }
        Drawable[] drawableArrA = c.a(this.f2875a);
        a(drawableArrA[0], this.f2880f);
        a(drawableArrA[2], this.f2881g);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    void c() {
        this.f2883i.b();
    }

    int e() {
        return this.f2883i.h();
    }

    int f() {
        return this.f2883i.i();
    }

    int g() {
        return this.f2883i.j();
    }

    int[] h() {
        return this.f2883i.k();
    }

    int i() {
        return this.f2883i.l();
    }

    @androidx.annotation.p0
    ColorStateList j() {
        v0 v0Var = this.f2882h;
        if (v0Var != null) {
            return v0Var.f2940a;
        }
        return null;
    }

    @androidx.annotation.p0
    PorterDuff.Mode k() {
        v0 v0Var = this.f2882h;
        if (v0Var != null) {
            return v0Var.f2941b;
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    boolean l() {
        return this.f2883i.q();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:44:0x0105  */
    @SuppressLint({"NewApi"})
    void m(@androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        boolean zA;
        boolean z10;
        String strW;
        String strW2;
        boolean z11;
        Context context = this.f2875a.getContext();
        androidx.appcompat.widget.f fVarB = androidx.appcompat.widget.f.b();
        int[] iArr = R.styleable.f1578k;
        x0 x0VarG = x0.G(context, attributeSet, iArr, i10, 0);
        TextView textView = this.f2875a;
        j1.z1(textView, textView.getContext(), iArr, attributeSet, x0VarG.B(), i10, 0);
        int iU = x0VarG.u(R.styleable.AppCompatTextHelper_android_textAppearance, -1);
        int i11 = R.styleable.AppCompatTextHelper_android_drawableLeft;
        if (x0VarG.C(i11)) {
            this.f2876b = d(context, fVarB, x0VarG.u(i11, 0));
        }
        int i12 = R.styleable.AppCompatTextHelper_android_drawableTop;
        if (x0VarG.C(i12)) {
            this.f2877c = d(context, fVarB, x0VarG.u(i12, 0));
        }
        int i13 = R.styleable.AppCompatTextHelper_android_drawableRight;
        if (x0VarG.C(i13)) {
            this.f2878d = d(context, fVarB, x0VarG.u(i13, 0));
        }
        int i14 = R.styleable.AppCompatTextHelper_android_drawableBottom;
        if (x0VarG.C(i14)) {
            this.f2879e = d(context, fVarB, x0VarG.u(i14, 0));
        }
        int i15 = Build.VERSION.SDK_INT;
        int i16 = R.styleable.AppCompatTextHelper_android_drawableStart;
        if (x0VarG.C(i16)) {
            this.f2880f = d(context, fVarB, x0VarG.u(i16, 0));
        }
        int i17 = R.styleable.AppCompatTextHelper_android_drawableEnd;
        if (x0VarG.C(i17)) {
            this.f2881g = d(context, fVarB, x0VarG.u(i17, 0));
        }
        x0VarG.I();
        boolean z12 = this.f2875a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (iU != -1) {
            x0 x0VarE = x0.E(context, iU, R.styleable.D);
            if (z12) {
                zA = false;
                z10 = false;
            } else {
                int i18 = R.styleable.TextAppearance_textAllCaps;
                if (x0VarE.C(i18)) {
                    zA = x0VarE.a(i18, false);
                    z10 = true;
                } else {
                    zA = false;
                    z10 = false;
                }
            }
            C(context, x0VarE);
            int i19 = R.styleable.TextAppearance_textLocale;
            strW2 = x0VarE.C(i19) ? x0VarE.w(i19) : null;
            if (i15 >= 26) {
                int i20 = R.styleable.TextAppearance_fontVariationSettings;
                if (x0VarE.C(i20)) {
                    strW = x0VarE.w(i20);
                } else {
                    strW = null;
                }
            } else {
                strW = null;
            }
            x0VarE.I();
        } else {
            zA = false;
            z10 = false;
            strW = null;
            strW2 = null;
        }
        x0 x0VarG2 = x0.G(context, attributeSet, R.styleable.D, i10, 0);
        if (z12) {
            z11 = z10;
        } else {
            int i21 = R.styleable.TextAppearance_textAllCaps;
            if (x0VarG2.C(i21)) {
                zA = x0VarG2.a(i21, false);
                z11 = true;
            } else {
                z11 = z10;
            }
        }
        int i22 = R.styleable.TextAppearance_textLocale;
        if (x0VarG2.C(i22)) {
            strW2 = x0VarG2.w(i22);
        }
        if (i15 >= 26) {
            int i23 = R.styleable.TextAppearance_fontVariationSettings;
            if (x0VarG2.C(i23)) {
                strW = x0VarG2.w(i23);
            }
        }
        if (i15 >= 28) {
            int i24 = R.styleable.TextAppearance_android_textSize;
            if (x0VarG2.C(i24) && x0VarG2.g(i24, -1) == 0) {
                this.f2875a.setTextSize(0, 0.0f);
            }
        }
        C(context, x0VarG2);
        x0VarG2.I();
        if (!z12 && z11) {
            s(zA);
        }
        Typeface typeface = this.f2886l;
        if (typeface != null) {
            if (this.f2885k == -1) {
                this.f2875a.setTypeface(typeface, this.f2884j);
            } else {
                this.f2875a.setTypeface(typeface);
            }
        }
        if (strW != null) {
            f.d(this.f2875a, strW);
        }
        if (strW2 != null) {
            if (i15 >= 24) {
                e.b(this.f2875a, e.a(strW2));
            } else {
                c.c(this.f2875a, d.a(strW2.split(Constants.ACCEPT_TIME_SEPARATOR_SP)[0]));
            }
        }
        this.f2883i.r(attributeSet, i10);
        if (androidx.core.widget.b.f21920t0 && this.f2883i.l() != 0) {
            int[] iArrK = this.f2883i.k();
            if (iArrK.length > 0) {
                if (f.a(this.f2875a) != -1.0f) {
                    f.b(this.f2875a, this.f2883i.i(), this.f2883i.h(), this.f2883i.j(), 0);
                } else {
                    f.c(this.f2875a, iArrK, 0);
                }
            }
        }
        x0 x0VarF = x0.F(context, attributeSet, R.styleable.f1579l);
        int iU2 = x0VarF.u(R.styleable.AppCompatTextView_drawableLeftCompat, -1);
        Drawable drawableC = iU2 != -1 ? fVarB.c(context, iU2) : null;
        int iU3 = x0VarF.u(R.styleable.AppCompatTextView_drawableTopCompat, -1);
        Drawable drawableC2 = iU3 != -1 ? fVarB.c(context, iU3) : null;
        int iU4 = x0VarF.u(R.styleable.AppCompatTextView_drawableRightCompat, -1);
        Drawable drawableC3 = iU4 != -1 ? fVarB.c(context, iU4) : null;
        int iU5 = x0VarF.u(R.styleable.AppCompatTextView_drawableBottomCompat, -1);
        Drawable drawableC4 = iU5 != -1 ? fVarB.c(context, iU5) : null;
        int iU6 = x0VarF.u(R.styleable.AppCompatTextView_drawableStartCompat, -1);
        Drawable drawableC5 = iU6 != -1 ? fVarB.c(context, iU6) : null;
        int iU7 = x0VarF.u(R.styleable.AppCompatTextView_drawableEndCompat, -1);
        y(drawableC, drawableC2, drawableC3, drawableC4, drawableC5, iU7 != -1 ? fVarB.c(context, iU7) : null);
        int i25 = R.styleable.AppCompatTextView_drawableTint;
        if (x0VarF.C(i25)) {
            androidx.core.widget.q.u(this.f2875a, x0VarF.d(i25));
        }
        int i26 = R.styleable.AppCompatTextView_drawableTintMode;
        if (x0VarF.C(i26)) {
            androidx.core.widget.q.v(this.f2875a, b0.e(x0VarF.o(i26, -1), null));
        }
        int iG = x0VarF.g(R.styleable.AppCompatTextView_firstBaselineToTopHeight, -1);
        int iG2 = x0VarF.g(R.styleable.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int iG3 = x0VarF.g(R.styleable.AppCompatTextView_lineHeight, -1);
        x0VarF.I();
        if (iG != -1) {
            androidx.core.widget.q.A(this.f2875a, iG);
        }
        if (iG2 != -1) {
            androidx.core.widget.q.B(this.f2875a, iG2);
        }
        if (iG3 != -1) {
            androidx.core.widget.q.C(this.f2875a, iG3);
        }
    }

    void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f2887m) {
            this.f2886l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (j1.O0(textView)) {
                    textView.post(new b(textView, typeface, this.f2884j));
                } else {
                    textView.setTypeface(typeface, this.f2884j);
                }
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    void o(boolean z10, int i10, int i11, int i12, int i13) {
        if (androidx.core.widget.b.f21920t0) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(Context context, int i10) {
        String strW;
        x0 x0VarE = x0.E(context, i10, R.styleable.D);
        int i11 = R.styleable.TextAppearance_textAllCaps;
        if (x0VarE.C(i11)) {
            s(x0VarE.a(i11, false));
        }
        int i12 = Build.VERSION.SDK_INT;
        int i13 = R.styleable.TextAppearance_android_textSize;
        if (x0VarE.C(i13) && x0VarE.g(i13, -1) == 0) {
            this.f2875a.setTextSize(0, 0.0f);
        }
        C(context, x0VarE);
        if (i12 >= 26) {
            int i14 = R.styleable.TextAppearance_fontVariationSettings;
            if (x0VarE.C(i14) && (strW = x0VarE.w(i14)) != null) {
                f.d(this.f2875a, strW);
            }
        }
        x0VarE.I();
        Typeface typeface = this.f2886l;
        if (typeface != null) {
            this.f2875a.setTypeface(typeface, this.f2884j);
        }
    }

    void r(@androidx.annotation.n0 TextView textView, @androidx.annotation.p0 InputConnection inputConnection, @androidx.annotation.n0 EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        androidx.core.view.inputmethod.e.j(editorInfo, textView.getText());
    }

    void s(boolean z10) {
        this.f2875a.setAllCaps(z10);
    }

    void t(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        this.f2883i.s(i10, i11, i12, i13);
    }

    void u(@androidx.annotation.n0 int[] iArr, int i10) throws IllegalArgumentException {
        this.f2883i.t(iArr, i10);
    }

    void v(int i10) {
        this.f2883i.u(i10);
    }

    void w(@androidx.annotation.p0 ColorStateList colorStateList) {
        if (this.f2882h == null) {
            this.f2882h = new v0();
        }
        v0 v0Var = this.f2882h;
        v0Var.f2940a = colorStateList;
        v0Var.f2943d = colorStateList != null;
        z();
    }

    void x(@androidx.annotation.p0 PorterDuff.Mode mode) {
        if (this.f2882h == null) {
            this.f2882h = new v0();
        }
        v0 v0Var = this.f2882h;
        v0Var.f2941b = mode;
        v0Var.f2942c = mode != null;
        z();
    }
}
