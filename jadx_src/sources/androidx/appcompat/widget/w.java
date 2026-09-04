package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.annotation.j1;
import androidx.appcompat.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: AppCompatTextViewAutoSizeHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f2944l = "ACTVAutoSizeHelper";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f2946n = 12;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f2947o = 112;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f2948p = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final float f2951s = -1.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f2952t = 1048576;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2953a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f2954b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f2955c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f2956d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f2957e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f2958f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f2959g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TextPaint f2960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    private final TextView f2961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f2962j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final f f2963k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final RectF f2945m = new RectF();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Method> f2949q = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Field> f2950r = new ConcurrentHashMap<>();

    /* JADX INFO: compiled from: AppCompatTextViewAutoSizeHelper.java */
    @androidx.annotation.w0(16)
    public static final class a {
        private a() {
        }

        @androidx.annotation.n0
        @androidx.annotation.u
        static StaticLayout a(@androidx.annotation.n0 CharSequence charSequence, @androidx.annotation.n0 Layout.Alignment alignment, int i10, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i10, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        @androidx.annotation.u
        static int b(@androidx.annotation.n0 TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* JADX INFO: compiled from: AppCompatTextViewAutoSizeHelper.java */
    @androidx.annotation.w0(18)
    public static final class b {
        private b() {
        }

        @androidx.annotation.u
        static boolean a(@androidx.annotation.n0 View view) {
            return view.isInLayout();
        }
    }

    /* JADX INFO: compiled from: AppCompatTextViewAutoSizeHelper.java */
    @androidx.annotation.w0(23)
    public static final class c {
        private c() {
        }

        @androidx.annotation.n0
        @androidx.annotation.u
        static StaticLayout a(@androidx.annotation.n0 CharSequence charSequence, @androidx.annotation.n0 Layout.Alignment alignment, int i10, int i11, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextPaint textPaint, @androidx.annotation.n0 f fVar) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                fVar.a(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w(w.f2944l, "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    /* JADX INFO: compiled from: AppCompatTextViewAutoSizeHelper.java */
    @androidx.annotation.w0(23)
    public static class d extends f {
        d() {
        }

        @Override // androidx.appcompat.widget.w.f
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) w.p(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* JADX INFO: compiled from: AppCompatTextViewAutoSizeHelper.java */
    @androidx.annotation.w0(29)
    public static class e extends d {
        e() {
        }

        @Override // androidx.appcompat.widget.w.d, androidx.appcompat.widget.w.f
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.w.f
        boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* JADX INFO: compiled from: AppCompatTextViewAutoSizeHelper.java */
    public static class f {
        f() {
        }

        void a(StaticLayout.Builder builder, TextView textView) {
        }

        boolean b(TextView textView) {
            return ((Boolean) w.p(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    w(@androidx.annotation.n0 TextView textView) {
        this.f2961i = textView;
        this.f2962j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f2963k = new e();
        } else {
            this.f2963k = new d();
        }
    }

    private boolean A(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f2961i.getText();
        TransformationMethod transformationMethod = this.f2961i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f2961i)) != null) {
            text = transformation;
        }
        int iB = a.b(this.f2961i);
        o(i10);
        StaticLayout staticLayoutE = e(text, (Layout.Alignment) p(this.f2961i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), iB);
        return (iB == -1 || (staticLayoutE.getLineCount() <= iB && staticLayoutE.getLineEnd(staticLayoutE.getLineCount() - 1) == text.length())) && ((float) staticLayoutE.getHeight()) <= rectF.bottom;
    }

    private boolean B() {
        return !(this.f2961i instanceof AppCompatEditText);
    }

    private void C(float f10, float f11, float f12) throws IllegalArgumentException {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f2953a = 1;
        this.f2956d = f10;
        this.f2957e = f11;
        this.f2955c = f12;
        this.f2959g = false;
    }

    private static <T> T a(@androidx.annotation.n0 Object obj, @androidx.annotation.n0 String str, @androidx.annotation.n0 T t10) {
        try {
            Field fieldM = m(str);
            return fieldM == null ? t10 : (T) fieldM.get(obj);
        } catch (IllegalAccessException e10) {
            Log.w(f2944l, "Failed to access TextView#" + str + " member", e10);
            return t10;
        }
    }

    private int[] c(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    private void d() {
        this.f2953a = 0;
        this.f2956d = -1.0f;
        this.f2957e = -1.0f;
        this.f2955c = -1.0f;
        this.f2958f = new int[0];
        this.f2954b = false;
    }

    private StaticLayout f(CharSequence charSequence, Layout.Alignment alignment, int i10) {
        return new StaticLayout(charSequence, this.f2960h, i10, alignment, ((Float) a(this.f2961i, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) a(this.f2961i, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) a(this.f2961i, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    private int g(RectF rectF) {
        int length = this.f2958f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = 0;
        int i11 = 1;
        int i12 = length - 1;
        while (true) {
            int i13 = i11;
            int i14 = i10;
            i10 = i13;
            while (i10 <= i12) {
                int i15 = (i10 + i12) / 2;
                if (A(this.f2958f[i15], rectF)) {
                    i11 = i15 + 1;
                } else {
                    i14 = i15 - 1;
                    i12 = i14;
                }
            }
            return this.f2958f[i14];
        }
    }

    @androidx.annotation.p0
    private static Field m(@androidx.annotation.n0 String str) {
        try {
            Field declaredField = f2950r.get(str);
            if (declaredField == null && (declaredField = TextView.class.getDeclaredField(str)) != null) {
                declaredField.setAccessible(true);
                f2950r.put(str, declaredField);
            }
            return declaredField;
        } catch (NoSuchFieldException e10) {
            Log.w(f2944l, "Failed to access TextView#" + str + " member", e10);
            return null;
        }
    }

    @androidx.annotation.p0
    private static Method n(@androidx.annotation.n0 String str) {
        try {
            Method declaredMethod = f2949q.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                f2949q.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e10) {
            Log.w(f2944l, "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    static <T> T p(@androidx.annotation.n0 Object obj, @androidx.annotation.n0 String str, @androidx.annotation.n0 T t10) {
        try {
            return (T) n(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w(f2944l, "Failed to invoke TextView#" + str + "() method", e10);
            return t10;
        }
    }

    private void v(float f10) {
        if (f10 != this.f2961i.getPaint().getTextSize()) {
            this.f2961i.getPaint().setTextSize(f10);
            boolean zA = b.a(this.f2961i);
            if (this.f2961i.getLayout() != null) {
                this.f2954b = false;
                try {
                    Method methodN = n("nullLayouts");
                    if (methodN != null) {
                        methodN.invoke(this.f2961i, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w(f2944l, "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (zA) {
                    this.f2961i.forceLayout();
                } else {
                    this.f2961i.requestLayout();
                }
                this.f2961i.invalidate();
            }
        }
    }

    private boolean x() {
        if (B() && this.f2953a == 1) {
            if (!this.f2959g || this.f2958f.length == 0) {
                int iFloor = ((int) Math.floor((this.f2957e - this.f2956d) / this.f2955c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i10 = 0; i10 < iFloor; i10++) {
                    iArr[i10] = Math.round(this.f2956d + (i10 * this.f2955c));
                }
                this.f2958f = c(iArr);
            }
            this.f2954b = true;
        } else {
            this.f2954b = false;
        }
        return this.f2954b;
    }

    private void y(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f2958f = c(iArr);
            z();
        }
    }

    private boolean z() {
        int[] iArr = this.f2958f;
        int length = iArr.length;
        boolean z10 = length > 0;
        this.f2959g = z10;
        if (z10) {
            this.f2953a = 1;
            this.f2956d = iArr[0];
            this.f2957e = iArr[length - 1];
            this.f2955c = -1.0f;
        }
        return z10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    void b() {
        if (q()) {
            if (this.f2954b) {
                if (this.f2961i.getMeasuredHeight() <= 0 || this.f2961i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f2963k.b(this.f2961i) ? 1048576 : (this.f2961i.getMeasuredWidth() - this.f2961i.getTotalPaddingLeft()) - this.f2961i.getTotalPaddingRight();
                int height = (this.f2961i.getHeight() - this.f2961i.getCompoundPaddingBottom()) - this.f2961i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f2945m;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float fG = g(rectF);
                    if (fG != this.f2961i.getTextSize()) {
                        w(0, fG);
                    }
                }
            }
            this.f2954b = true;
        }
    }

    @j1
    @androidx.annotation.n0
    StaticLayout e(@androidx.annotation.n0 CharSequence charSequence, @androidx.annotation.n0 Layout.Alignment alignment, int i10, int i11) {
        return c.a(charSequence, alignment, i10, i11, this.f2961i, this.f2960h, this.f2963k);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    int h() {
        return Math.round(this.f2957e);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    int i() {
        return Math.round(this.f2956d);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    int j() {
        return Math.round(this.f2955c);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    int[] k() {
        return this.f2958f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    int l() {
        return this.f2953a;
    }

    @j1
    void o(int i10) {
        TextPaint textPaint = this.f2960h;
        if (textPaint == null) {
            this.f2960h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f2960h.set(this.f2961i.getPaint());
        this.f2960h.setTextSize(i10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    boolean q() {
        return B() && this.f2953a != 0;
    }

    void r(@androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        int resourceId;
        Context context = this.f2962j;
        int[] iArr = R.styleable.f1579l;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        TextView textView = this.f2961i;
        androidx.core.view.j1.z1(textView, textView.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        int i11 = R.styleable.AppCompatTextView_autoSizeTextType;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.f2953a = typedArrayObtainStyledAttributes.getInt(i11, 0);
        }
        int i12 = R.styleable.AppCompatTextView_autoSizeStepGranularity;
        float dimension = typedArrayObtainStyledAttributes.hasValue(i12) ? typedArrayObtainStyledAttributes.getDimension(i12, -1.0f) : -1.0f;
        int i13 = R.styleable.AppCompatTextView_autoSizeMinTextSize;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(i13) ? typedArrayObtainStyledAttributes.getDimension(i13, -1.0f) : -1.0f;
        int i14 = R.styleable.AppCompatTextView_autoSizeMaxTextSize;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(i14) ? typedArrayObtainStyledAttributes.getDimension(i14, -1.0f) : -1.0f;
        int i15 = R.styleable.AppCompatTextView_autoSizePresetSizes;
        if (typedArrayObtainStyledAttributes.hasValue(i15) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i15, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            y(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!B()) {
            this.f2953a = 0;
            return;
        }
        if (this.f2953a == 1) {
            if (!this.f2959g) {
                DisplayMetrics displayMetrics = this.f2962j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                C(dimension2, dimension3, dimension);
            }
            x();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    void s(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (B()) {
            DisplayMetrics displayMetrics = this.f2962j.getResources().getDisplayMetrics();
            C(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (x()) {
                b();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    void t(@androidx.annotation.n0 int[] iArr, int i10) throws IllegalArgumentException {
        if (B()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i10 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f2962j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArrCopyOf[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                this.f2958f = c(iArrCopyOf);
                if (!z()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f2959g = false;
            }
            if (x()) {
                b();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    void u(int i10) {
        if (B()) {
            if (i10 == 0) {
                d();
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
            }
            DisplayMetrics displayMetrics = this.f2962j.getResources().getDisplayMetrics();
            C(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (x()) {
                b();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    void w(int i10, float f10) {
        Context context = this.f2962j;
        v(TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
