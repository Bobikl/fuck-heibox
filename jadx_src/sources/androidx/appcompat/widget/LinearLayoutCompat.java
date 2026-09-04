package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.view.j1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    private static final int A = 3;
    private static final String B = "androidx.appcompat.widget.LinearLayoutCompat";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f2498q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f2499r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f2500s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f2501t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f2502u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f2503v = 4;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f2504w = 4;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f2505x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f2506y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f2507z = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f2508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f2511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f2512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f2513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f2514h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2515i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f2516j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int[] f2517k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f2518l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f2519m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f2520n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f2521o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f2522p;

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public LayoutParams(int i10, int i11) {
            super(i10, i11);
        }

        public LayoutParams(int i10, int i11, float f10) {
            super(i10, i11, f10);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface b {
    }

    public LinearLayoutCompat(@androidx.annotation.n0 Context context) {
        this(context, null);
    }

    public LinearLayoutCompat(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2508b = true;
        this.f2509c = -1;
        this.f2510d = 0;
        this.f2512f = 8388659;
        int[] iArr = R.styleable.f1585r;
        x0 x0VarG = x0.G(context, attributeSet, iArr, i10, 0);
        j1.z1(this, context, iArr, attributeSet, x0VarG.B(), i10, 0);
        int iO = x0VarG.o(R.styleable.LinearLayoutCompat_android_orientation, -1);
        if (iO >= 0) {
            setOrientation(iO);
        }
        int iO2 = x0VarG.o(R.styleable.LinearLayoutCompat_android_gravity, -1);
        if (iO2 >= 0) {
            setGravity(iO2);
        }
        boolean zA = x0VarG.a(R.styleable.LinearLayoutCompat_android_baselineAligned, true);
        if (!zA) {
            setBaselineAligned(zA);
        }
        this.f2514h = x0VarG.j(R.styleable.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f2509c = x0VarG.o(R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f2515i = x0VarG.a(R.styleable.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(x0VarG.h(R.styleable.LinearLayoutCompat_divider));
        this.f2521o = x0VarG.o(R.styleable.LinearLayoutCompat_showDividers, 0);
        this.f2522p = x0VarG.g(R.styleable.LinearLayoutCompat_dividerPadding, 0);
        x0VarG.I();
    }

    private void B(View view, int i10, int i11, int i12, int i13) {
        view.layout(i10, i11, i12 + i10, i13 + i11);
    }

    private void j(int i10, int i11) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i12 = 0; i12 < i10; i12++) {
            View viewR = r(i12);
            if (viewR.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) viewR.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).height == -1) {
                    int i13 = ((LinearLayout.LayoutParams) layoutParams).width;
                    ((LinearLayout.LayoutParams) layoutParams).width = viewR.getMeasuredWidth();
                    measureChildWithMargins(viewR, i11, 0, iMakeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) layoutParams).width = i13;
                }
            }
        }
    }

    private void k(int i10, int i11) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i12 = 0; i12 < i10; i12++) {
            View viewR = r(i12);
            if (viewR.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) viewR.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).width == -1) {
                    int i13 = ((LinearLayout.LayoutParams) layoutParams).height;
                    ((LinearLayout.LayoutParams) layoutParams).height = viewR.getMeasuredHeight();
                    measureChildWithMargins(viewR, iMakeMeasureSpec, 0, i11, 0);
                    ((LinearLayout.LayoutParams) layoutParams).height = i13;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0325  */
    /* JADX WARN: Code duplicated, block: B:156:0x0333  */
    void A(int i10, int i11) {
        int i12;
        int iCombineMeasuredStates;
        int iMax;
        int i13;
        int i14;
        int i15;
        boolean z10;
        boolean z11;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        View view;
        int iMax2;
        boolean z12;
        int iMax3;
        this.f2513g = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int i25 = this.f2509c;
        boolean z13 = this.f2515i;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int iMax4 = 0;
        int i29 = 0;
        int iO = 0;
        boolean z14 = false;
        boolean z15 = false;
        float f10 = 0.0f;
        boolean z16 = true;
        while (true) {
            int i30 = 8;
            int i31 = iMax4;
            if (iO >= virtualChildCount) {
                int i32 = i26;
                int i33 = i28;
                int i34 = i29;
                int i35 = virtualChildCount;
                int i36 = mode2;
                int iMax5 = i27;
                if (this.f2513g > 0) {
                    i12 = i35;
                    if (s(i12)) {
                        this.f2513g += this.f2520n;
                    }
                } else {
                    i12 = i35;
                }
                if (z13 && (i36 == Integer.MIN_VALUE || i36 == 0)) {
                    this.f2513g = 0;
                    int iO2 = 0;
                    while (iO2 < i12) {
                        View viewR = r(iO2);
                        if (viewR == null) {
                            this.f2513g += z(iO2);
                        } else if (viewR.getVisibility() == i30) {
                            iO2 += o(viewR, iO2);
                        } else {
                            LayoutParams layoutParams = (LayoutParams) viewR.getLayoutParams();
                            int i37 = this.f2513g;
                            this.f2513g = Math.max(i37, i37 + i33 + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + q(viewR));
                        }
                        iO2++;
                        i30 = 8;
                    }
                }
                int paddingTop = this.f2513g + getPaddingTop() + getPaddingBottom();
                this.f2513g = paddingTop;
                int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, 0);
                int i38 = (16777215 & iResolveSizeAndState) - this.f2513g;
                if (z14 || (i38 != 0 && f10 > 0.0f)) {
                    float f11 = this.f2514h;
                    if (f11 > 0.0f) {
                        f10 = f11;
                    }
                    this.f2513g = 0;
                    int i39 = i38;
                    int i40 = i34;
                    iCombineMeasuredStates = i32;
                    int i41 = 0;
                    while (i41 < i12) {
                        View viewR2 = r(i41);
                        if (viewR2.getVisibility() == 8) {
                            i13 = i39;
                        } else {
                            LayoutParams layoutParams2 = (LayoutParams) viewR2.getLayoutParams();
                            float f12 = ((LinearLayout.LayoutParams) layoutParams2).weight;
                            if (f12 > 0.0f) {
                                int i42 = (int) ((i39 * f12) / f10);
                                float f13 = f10 - f12;
                                i13 = i39 - i42;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin, ((LinearLayout.LayoutParams) layoutParams2).width);
                                if (((LinearLayout.LayoutParams) layoutParams2).height == 0) {
                                    i16 = 1073741824;
                                    if (i36 == 1073741824) {
                                        if (i42 <= 0) {
                                            i42 = 0;
                                        }
                                        viewR2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i42, 1073741824));
                                    }
                                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewR2.getMeasuredState() & androidx.core.view.o.f21773u);
                                    f10 = f13;
                                } else {
                                    i16 = 1073741824;
                                }
                                int measuredHeight = viewR2.getMeasuredHeight() + i42;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                viewR2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i16));
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewR2.getMeasuredState() & androidx.core.view.o.f21773u);
                                f10 = f13;
                            } else {
                                i13 = i39;
                            }
                            int i43 = ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                            int measuredWidth = viewR2.getMeasuredWidth() + i43;
                            iMax5 = Math.max(iMax5, measuredWidth);
                            float f14 = f10;
                            if (mode != 1073741824) {
                                i14 = iCombineMeasuredStates;
                                i15 = -1;
                                z10 = ((LinearLayout.LayoutParams) layoutParams2).width == -1;
                                if (!z10) {
                                    i43 = measuredWidth;
                                }
                                int iMax6 = Math.max(i40, i43);
                                if (z16 || ((LinearLayout.LayoutParams) layoutParams2).width != i15) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                                int i44 = this.f2513g;
                                this.f2513g = Math.max(i44, viewR2.getMeasuredHeight() + i44 + ((LinearLayout.LayoutParams) layoutParams2).topMargin + ((LinearLayout.LayoutParams) layoutParams2).bottomMargin + q(viewR2));
                                z16 = z11;
                                iCombineMeasuredStates = i14;
                                i40 = iMax6;
                                f10 = f14;
                            } else {
                                i14 = iCombineMeasuredStates;
                                i15 = -1;
                            }
                            if (!z10) {
                                i43 = measuredWidth;
                            }
                            int iMax7 = Math.max(i40, i43);
                            if (z16) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            int i45 = this.f2513g;
                            this.f2513g = Math.max(i45, viewR2.getMeasuredHeight() + i45 + ((LinearLayout.LayoutParams) layoutParams2).topMargin + ((LinearLayout.LayoutParams) layoutParams2).bottomMargin + q(viewR2));
                            z16 = z11;
                            iCombineMeasuredStates = i14;
                            i40 = iMax7;
                            f10 = f14;
                        }
                        i41++;
                        i39 = i13;
                    }
                    this.f2513g += getPaddingTop() + getPaddingBottom();
                    iMax = i40;
                } else {
                    iMax = Math.max(i34, i31);
                    if (z13 && i36 != 1073741824) {
                        for (int i46 = 0; i46 < i12; i46++) {
                            View viewR3 = r(i46);
                            if (viewR3 != null && viewR3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) viewR3.getLayoutParams())).weight > 0.0f) {
                                viewR3.measure(View.MeasureSpec.makeMeasureSpec(viewR3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i33, 1073741824));
                            }
                        }
                    }
                    iCombineMeasuredStates = i32;
                }
                if (z16 || mode == 1073741824) {
                    iMax = iMax5;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, iCombineMeasuredStates), iResolveSizeAndState);
                if (z15) {
                    k(i12, i11);
                    return;
                }
                return;
            }
            View viewR4 = r(iO);
            if (viewR4 == null) {
                this.f2513g += z(iO);
                i20 = virtualChildCount;
                i21 = mode2;
                iMax4 = i31;
            } else {
                int i47 = i26;
                if (viewR4.getVisibility() == 8) {
                    iO += o(viewR4, iO);
                    i20 = virtualChildCount;
                    iMax4 = i31;
                    i26 = i47;
                    i21 = mode2;
                } else {
                    if (s(iO)) {
                        this.f2513g += this.f2520n;
                    }
                    LayoutParams layoutParams3 = (LayoutParams) viewR4.getLayoutParams();
                    float f15 = ((LinearLayout.LayoutParams) layoutParams3).weight;
                    float f16 = f10 + f15;
                    if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) layoutParams3).height == 0 && f15 > 0.0f) {
                        int i48 = this.f2513g;
                        this.f2513g = Math.max(i48, ((LinearLayout.LayoutParams) layoutParams3).topMargin + i48 + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin);
                        iMax2 = i28;
                        view = viewR4;
                        i23 = i29;
                        z14 = true;
                        i18 = i47;
                        i19 = i27;
                        i20 = virtualChildCount;
                        i21 = mode2;
                        i22 = i31;
                        i24 = iO;
                    } else {
                        int i49 = i27;
                        if (((LinearLayout.LayoutParams) layoutParams3).height != 0 || f15 <= 0.0f) {
                            i17 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) layoutParams3).height = -2;
                            i17 = 0;
                        }
                        i18 = i47;
                        int i50 = i17;
                        i19 = i49;
                        int i51 = i28;
                        i20 = virtualChildCount;
                        i21 = mode2;
                        i22 = i31;
                        i23 = i29;
                        i24 = iO;
                        x(viewR4, iO, i10, 0, i11, f16 == 0.0f ? this.f2513g : 0);
                        if (i50 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) layoutParams3).height = i50;
                        }
                        int measuredHeight2 = viewR4.getMeasuredHeight();
                        int i52 = this.f2513g;
                        view = viewR4;
                        this.f2513g = Math.max(i52, i52 + measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin + q(view));
                        iMax2 = z13 ? Math.max(measuredHeight2, i51) : i51;
                    }
                    if (i25 >= 0 && i25 == i24 + 1) {
                        this.f2510d = this.f2513g;
                    }
                    if (i24 < i25 && ((LinearLayout.LayoutParams) layoutParams3).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode == 1073741824 || ((LinearLayout.LayoutParams) layoutParams3).width != -1) {
                        z12 = false;
                    } else {
                        z12 = true;
                        z15 = true;
                    }
                    int i53 = ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin;
                    int measuredWidth2 = view.getMeasuredWidth() + i53;
                    int iMax8 = Math.max(i19, measuredWidth2);
                    int iCombineMeasuredStates2 = View.combineMeasuredStates(i18, view.getMeasuredState());
                    z16 = z16 && ((LinearLayout.LayoutParams) layoutParams3).width == -1;
                    if (((LinearLayout.LayoutParams) layoutParams3).weight > 0.0f) {
                        if (!z12) {
                            i53 = measuredWidth2;
                        }
                        iMax4 = Math.max(i22, i53);
                        iMax3 = i23;
                    } else {
                        if (!z12) {
                            i53 = measuredWidth2;
                        }
                        iMax3 = Math.max(i23, i53);
                        iMax4 = i22;
                    }
                    int iO3 = o(view, i24) + i24;
                    i28 = iMax2;
                    f10 = f16;
                    i29 = iMax3;
                    i26 = iCombineMeasuredStates2;
                    iO = iO3;
                    i27 = iMax8;
                }
            }
            iO++;
            mode2 = i21;
            virtualChildCount = i20;
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    void f(Canvas canvas) {
        int right;
        int left;
        int i10;
        int virtualChildCount = getVirtualChildCount();
        boolean zB = h1.b(this);
        for (int i11 = 0; i11 < virtualChildCount; i11++) {
            View viewR = r(i11);
            if (viewR != null && viewR.getVisibility() != 8 && s(i11)) {
                LayoutParams layoutParams = (LayoutParams) viewR.getLayoutParams();
                i(canvas, zB ? viewR.getRight() + ((LinearLayout.LayoutParams) layoutParams).rightMargin : (viewR.getLeft() - ((LinearLayout.LayoutParams) layoutParams).leftMargin) - this.f2519m);
            }
        }
        if (s(virtualChildCount)) {
            View viewR2 = r(virtualChildCount - 1);
            if (viewR2 != null) {
                LayoutParams layoutParams2 = (LayoutParams) viewR2.getLayoutParams();
                if (zB) {
                    left = viewR2.getLeft() - ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                    i10 = this.f2519m;
                    right = left - i10;
                } else {
                    right = viewR2.getRight() + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                }
            } else if (zB) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i10 = this.f2519m;
                right = left - i10;
            }
            i(canvas, right);
        }
    }

    void g(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i10 = 0; i10 < virtualChildCount; i10++) {
            View viewR = r(i10);
            if (viewR != null && viewR.getVisibility() != 8 && s(i10)) {
                h(canvas, (viewR.getTop() - ((LinearLayout.LayoutParams) ((LayoutParams) viewR.getLayoutParams())).topMargin) - this.f2520n);
            }
        }
        if (s(virtualChildCount)) {
            View viewR2 = r(virtualChildCount - 1);
            h(canvas, viewR2 == null ? (getHeight() - getPaddingBottom()) - this.f2520n : viewR2.getBottom() + ((LinearLayout.LayoutParams) ((LayoutParams) viewR2.getLayoutParams())).bottomMargin);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f2509c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f2509c;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f2509c == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f2510d;
        if (this.f2511e == 1 && (i10 = this.f2512f & 112) != 48) {
            if (i10 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f2513g) / 2;
            } else if (i10 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f2513g;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f2509c;
    }

    public Drawable getDividerDrawable() {
        return this.f2518l;
    }

    public int getDividerPadding() {
        return this.f2522p;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getDividerWidth() {
        return this.f2519m;
    }

    @androidx.annotation.a0
    public int getGravity() {
        return this.f2512f;
    }

    public int getOrientation() {
        return this.f2511e;
    }

    public int getShowDividers() {
        return this.f2521o;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f2514h;
    }

    void h(Canvas canvas, int i10) {
        this.f2518l.setBounds(getPaddingLeft() + this.f2522p, i10, (getWidth() - getPaddingRight()) - this.f2522p, this.f2520n + i10);
        this.f2518l.draw(canvas);
    }

    void i(Canvas canvas, int i10) {
        this.f2518l.setBounds(i10, getPaddingTop() + this.f2522p, this.f2519m + i10, (getHeight() - getPaddingBottom()) - this.f2522p);
        this.f2518l.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        int i10 = this.f2511e;
        if (i10 == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i10 == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    int o(View view, int i10) {
        return 0;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f2518l == null) {
            return;
        }
        if (this.f2511e == 1) {
            g(canvas);
        } else {
            f(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(B);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(B);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f2511e == 1) {
            w(i10, i11, i12, i13);
        } else {
            v(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f2511e == 1) {
            A(i10, i11);
        } else {
            y(i10, i11);
        }
    }

    int p(View view) {
        return 0;
    }

    int q(View view) {
        return 0;
    }

    View r(int i10) {
        return getChildAt(i10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    protected boolean s(int i10) {
        if (i10 == 0) {
            return (this.f2521o & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.f2521o & 4) != 0;
        }
        if ((this.f2521o & 2) == 0) {
            return false;
        }
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (getChildAt(i11).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    public void setBaselineAligned(boolean z10) {
        this.f2508b = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f2509c = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f2518l) {
            return;
        }
        this.f2518l = drawable;
        if (drawable != null) {
            this.f2519m = drawable.getIntrinsicWidth();
            this.f2520n = drawable.getIntrinsicHeight();
        } else {
            this.f2519m = 0;
            this.f2520n = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f2522p = i10;
    }

    public void setGravity(@androidx.annotation.a0 int i10) {
        if (this.f2512f != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= androidx.core.view.n.f21701b;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f2512f = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & androidx.core.view.n.f21703d;
        int i12 = this.f2512f;
        if ((8388615 & i12) != i11) {
            this.f2512f = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f2515i = z10;
    }

    public void setOrientation(int i10) {
        if (this.f2511e != i10) {
            this.f2511e = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f2521o) {
            requestLayout();
        }
        this.f2521o = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f2512f;
        if ((i12 & 112) != i11) {
            this.f2512f = i11 | (i12 & com.ss.android.ttvecamera.o.f97695q);
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f2514h = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public boolean t() {
        return this.f2508b;
    }

    public boolean u() {
        return this.f2515i;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00df  */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ff  */
    void v(int i10, int i11, int i12, int i13) {
        int paddingLeft;
        int i14;
        int i15;
        boolean z10;
        int baseline;
        int i16;
        int i17;
        int measuredHeight;
        boolean zB = h1.b(this);
        int paddingTop = getPaddingTop();
        int i18 = i13 - i11;
        int paddingBottom = i18 - getPaddingBottom();
        int paddingBottom2 = (i18 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i19 = this.f2512f;
        int i20 = i19 & 112;
        boolean z11 = this.f2508b;
        int[] iArr = this.f2516j;
        int[] iArr2 = this.f2517k;
        int iD = androidx.core.view.n.d(8388615 & i19, j1.Z(this));
        boolean z12 = true;
        if (iD != 1) {
            paddingLeft = iD != 5 ? getPaddingLeft() : ((getPaddingLeft() + i12) - i10) - this.f2513g;
        } else {
            paddingLeft = getPaddingLeft() + (((i12 - i10) - this.f2513g) / 2);
        }
        if (zB) {
            i14 = virtualChildCount - 1;
            i15 = -1;
        } else {
            i14 = 0;
            i15 = 1;
        }
        int iO = 0;
        while (iO < virtualChildCount) {
            int i21 = i14 + (i15 * iO);
            View viewR = r(i21);
            if (viewR == null) {
                paddingLeft += z(i21);
                z10 = z12;
            } else {
                if (viewR.getVisibility() != 8) {
                    int measuredWidth = viewR.getMeasuredWidth();
                    int measuredHeight2 = viewR.getMeasuredHeight();
                    LayoutParams layoutParams = (LayoutParams) viewR.getLayoutParams();
                    int i22 = iO;
                    if (z11) {
                        virtualChildCount = virtualChildCount;
                        baseline = ((LinearLayout.LayoutParams) layoutParams).height != -1 ? viewR.getBaseline() : -1;
                        i16 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                        if (i16 < 0) {
                            i16 = i20;
                        }
                        i17 = i16 & 112;
                        i20 = i20;
                        if (i17 != 16) {
                            if (i17 != 48) {
                                measuredHeight = ((LinearLayout.LayoutParams) layoutParams).topMargin + paddingTop;
                                if (baseline != -1) {
                                    z10 = true;
                                    measuredHeight += iArr[1] - baseline;
                                }
                            } else if (i17 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                measuredHeight = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight -= iArr2[2] - (viewR.getMeasuredHeight() - baseline);
                                }
                            }
                            z10 = true;
                        } else {
                            z10 = true;
                            measuredHeight = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop) + ((LinearLayout.LayoutParams) layoutParams).topMargin) - ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                        }
                        if (s(i21)) {
                            paddingLeft += this.f2519m;
                        }
                        int i23 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + paddingLeft;
                        paddingTop = paddingTop;
                        B(viewR, i23 + p(viewR), measuredHeight, measuredWidth, measuredHeight2);
                        int iQ = i23 + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).rightMargin + q(viewR);
                        iO = i22 + o(viewR, i21);
                        paddingLeft = iQ;
                    } else {
                        virtualChildCount = virtualChildCount;
                    }
                    i16 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                    if (i16 < 0) {
                        i16 = i20;
                    }
                    i17 = i16 & 112;
                    i20 = i20;
                    if (i17 != 16) {
                        if (i17 != 48) {
                            measuredHeight = ((LinearLayout.LayoutParams) layoutParams).topMargin + paddingTop;
                            if (baseline != -1) {
                                z10 = true;
                                measuredHeight += iArr[1] - baseline;
                            }
                        } else if (i17 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            measuredHeight = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight -= iArr2[2] - (viewR.getMeasuredHeight() - baseline);
                            }
                        }
                        z10 = true;
                    } else {
                        z10 = true;
                        measuredHeight = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop) + ((LinearLayout.LayoutParams) layoutParams).topMargin) - ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    }
                    if (s(i21)) {
                        paddingLeft += this.f2519m;
                    }
                    int i24 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + paddingLeft;
                    paddingTop = paddingTop;
                    B(viewR, i24 + p(viewR), measuredHeight, measuredWidth, measuredHeight2);
                    int iQ2 = i24 + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).rightMargin + q(viewR);
                    iO = i22 + o(viewR, i21);
                    paddingLeft = iQ2;
                } else {
                    z10 = true;
                }
                iO++;
                virtualChildCount = virtualChildCount;
                i20 = i20;
                z12 = z10;
                paddingTop = paddingTop;
            }
            iO++;
            virtualChildCount = virtualChildCount;
            i20 = i20;
            z12 = z10;
            paddingTop = paddingTop;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009f  */
    void w(int i10, int i11, int i12, int i13) {
        int paddingTop;
        int i14;
        int i15;
        int i16;
        int i17;
        int paddingLeft = getPaddingLeft();
        int i18 = i12 - i10;
        int paddingRight = i18 - getPaddingRight();
        int paddingRight2 = (i18 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i19 = this.f2512f;
        int i20 = i19 & 112;
        int i21 = i19 & androidx.core.view.n.f21703d;
        if (i20 != 16) {
            paddingTop = i20 != 80 ? getPaddingTop() : ((getPaddingTop() + i13) - i11) - this.f2513g;
        } else {
            paddingTop = getPaddingTop() + (((i13 - i11) - this.f2513g) / 2);
        }
        int iO = 0;
        while (iO < virtualChildCount) {
            View viewR = r(iO);
            if (viewR == null) {
                paddingTop += z(iO);
            } else {
                if (viewR.getVisibility() != 8) {
                    int measuredWidth = viewR.getMeasuredWidth();
                    int measuredHeight = viewR.getMeasuredHeight();
                    LayoutParams layoutParams = (LayoutParams) viewR.getLayoutParams();
                    int i22 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                    if (i22 < 0) {
                        i22 = i21;
                    }
                    int iD = androidx.core.view.n.d(i22, j1.Z(this)) & 7;
                    if (iD != 1) {
                        if (iD != 5) {
                            i16 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + paddingLeft;
                        } else {
                            i14 = paddingRight - measuredWidth;
                            i15 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        }
                        int i23 = i16;
                        if (s(iO)) {
                            paddingTop += this.f2520n;
                        }
                        int i24 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                        B(viewR, i23, i24 + p(viewR), measuredWidth, measuredHeight);
                        int iQ = i24 + measuredHeight + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + q(viewR);
                        iO += o(viewR, iO);
                        paddingTop = iQ;
                        i17 = 1;
                    } else {
                        i14 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        i15 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    }
                    i16 = i14 - i15;
                    int i25 = i16;
                    if (s(iO)) {
                        paddingTop += this.f2520n;
                    }
                    int i26 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    B(viewR, i25, i26 + p(viewR), measuredWidth, measuredHeight);
                    int iQ2 = i26 + measuredHeight + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + q(viewR);
                    iO += o(viewR, iO);
                    paddingTop = iQ2;
                    i17 = 1;
                }
                iO += i17;
            }
            i17 = 1;
            iO += i17;
        }
    }

    void x(View view, int i10, int i11, int i12, int i13, int i14) {
        measureChildWithMargins(view, i11, i12, i13, i14);
    }

    /* JADX WARN: Code duplicated, block: B:197:0x0452  */
    /* JADX WARN: Code duplicated, block: B:60:0x0177  */
    /* JADX WARN: Code duplicated, block: B:67:0x0199  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:77:0x01cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:84:0x01dd  */
    void y(int i10, int i11) {
        int[] iArr;
        int i12;
        int iMax;
        int iMax2;
        int i13;
        int i14;
        int baseline;
        int i15;
        int i16;
        byte b10;
        int i17;
        int i18;
        boolean z10;
        boolean z11;
        View view;
        int i19;
        boolean z12;
        int i20;
        int measuredHeight;
        int iO;
        int baseline2;
        int i21;
        this.f2513g = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (this.f2516j == null || this.f2517k == null) {
            this.f2516j = new int[4];
            this.f2517k = new int[4];
        }
        int[] iArr2 = this.f2516j;
        int[] iArr3 = this.f2517k;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        boolean z13 = this.f2508b;
        boolean z14 = this.f2515i;
        int i22 = 1073741824;
        boolean z15 = mode == 1073741824;
        int iO2 = 0;
        int iMax3 = 0;
        int iMax4 = 0;
        int iMax5 = 0;
        int iMax6 = 0;
        boolean z16 = false;
        int iCombineMeasuredStates = 0;
        boolean z17 = false;
        boolean z18 = true;
        float f10 = 0.0f;
        while (true) {
            iArr = iArr3;
            if (iO2 >= virtualChildCount) {
                break;
            }
            View viewR = r(iO2);
            if (viewR == null) {
                this.f2513g += z(iO2);
            } else {
                if (viewR.getVisibility() == 8) {
                    iO2 += o(viewR, iO2);
                } else {
                    if (s(iO2)) {
                        this.f2513g += this.f2519m;
                    }
                    LayoutParams layoutParams = (LayoutParams) viewR.getLayoutParams();
                    float f11 = ((LinearLayout.LayoutParams) layoutParams).weight;
                    float f12 = f10 + f11;
                    if (mode == i22 && ((LinearLayout.LayoutParams) layoutParams).width == 0 && f11 > 0.0f) {
                        if (z15) {
                            this.f2513g += ((LinearLayout.LayoutParams) layoutParams).leftMargin + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        } else {
                            int i23 = this.f2513g;
                            this.f2513g = Math.max(i23, ((LinearLayout.LayoutParams) layoutParams).leftMargin + i23 + ((LinearLayout.LayoutParams) layoutParams).rightMargin);
                        }
                        if (z13) {
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                            viewR.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                            i18 = iO2;
                            z10 = z14;
                            z11 = z13;
                            view = viewR;
                        } else {
                            i18 = iO2;
                            z10 = z14;
                            z11 = z13;
                            view = viewR;
                            z16 = true;
                            i19 = 1073741824;
                        }
                        if (mode2 == i19 && ((LinearLayout.LayoutParams) layoutParams).height == -1) {
                            z12 = true;
                            z17 = true;
                        } else {
                            z12 = false;
                        }
                        i20 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i20;
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        if (z11 && (baseline2 = view.getBaseline()) != -1) {
                            i21 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                            if (i21 < 0) {
                                i21 = this.f2512f;
                            }
                            int i24 = (((i21 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i24] = Math.max(iArr2[i24], baseline2);
                            iArr[i24] = Math.max(iArr[i24], measuredHeight - baseline2);
                        }
                        iMax4 = Math.max(iMax4, measuredHeight);
                        if (z18 || ((LinearLayout.LayoutParams) layoutParams).height != -1) {
                            z18 = false;
                        } else {
                            z18 = true;
                        }
                        if (((LinearLayout.LayoutParams) layoutParams).weight > 0.0f) {
                            if (!z12) {
                                i20 = measuredHeight;
                            }
                            iMax6 = Math.max(iMax6, i20);
                        } else {
                            int i25 = iMax6;
                            if (!z12) {
                                i20 = measuredHeight;
                            }
                            iMax5 = Math.max(iMax5, i20);
                            iMax6 = i25;
                        }
                        int i26 = i18;
                        iO = o(view, i26) + i26;
                        f10 = f12;
                    } else {
                        if (((LinearLayout.LayoutParams) layoutParams).width != 0 || f11 <= 0.0f) {
                            b10 = -2;
                            i17 = Integer.MIN_VALUE;
                        } else {
                            b10 = -2;
                            ((LinearLayout.LayoutParams) layoutParams).width = -2;
                            i17 = 0;
                        }
                        i18 = iO2;
                        int i27 = i17;
                        z10 = z14;
                        z11 = z13;
                        x(viewR, i18, i10, f12 == 0.0f ? this.f2513g : 0, i11, 0);
                        if (i27 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) layoutParams).width = i27;
                        }
                        int measuredWidth = viewR.getMeasuredWidth();
                        if (z15) {
                            view = viewR;
                            this.f2513g += ((LinearLayout.LayoutParams) layoutParams).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).rightMargin + q(view);
                        } else {
                            view = viewR;
                            int i28 = this.f2513g;
                            this.f2513g = Math.max(i28, i28 + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).leftMargin + ((LinearLayout.LayoutParams) layoutParams).rightMargin + q(view));
                        }
                        if (z10) {
                            iMax3 = Math.max(measuredWidth, iMax3);
                        }
                    }
                    i19 = 1073741824;
                    if (mode2 == i19) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    i20 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i20;
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    if (z11) {
                        i21 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                        if (i21 < 0) {
                            i21 = this.f2512f;
                        }
                        int i29 = (((i21 & 112) >> 4) & (-2)) >> 1;
                        iArr2[i29] = Math.max(iArr2[i29], baseline2);
                        iArr[i29] = Math.max(iArr[i29], measuredHeight - baseline2);
                    }
                    iMax4 = Math.max(iMax4, measuredHeight);
                    if (z18) {
                        z18 = false;
                    } else {
                        z18 = false;
                    }
                    if (((LinearLayout.LayoutParams) layoutParams).weight > 0.0f) {
                        if (!z12) {
                            i20 = measuredHeight;
                        }
                        iMax6 = Math.max(iMax6, i20);
                    } else {
                        int i210 = iMax6;
                        if (!z12) {
                            i20 = measuredHeight;
                        }
                        iMax5 = Math.max(iMax5, i20);
                        iMax6 = i210;
                    }
                    int i211 = i18;
                    iO = o(view, i211) + i211;
                    f10 = f12;
                }
                int i30 = iO + 1;
                iArr3 = iArr;
                z14 = z10;
                z13 = z11;
                i22 = i19;
                iO2 = i30;
            }
            z10 = z14;
            z11 = z13;
            int i31 = i22;
            iO = iO2;
            i19 = i31;
            int i32 = iO + 1;
            iArr3 = iArr;
            z14 = z10;
            z13 = z11;
            i22 = i19;
            iO2 = i32;
        }
        boolean z19 = z14;
        boolean z20 = z13;
        int i33 = iMax4;
        int i34 = iMax5;
        int i35 = iMax6;
        int i36 = iCombineMeasuredStates;
        if (this.f2513g > 0 && s(virtualChildCount)) {
            this.f2513g += this.f2519m;
        }
        int i37 = iArr2[1];
        int iMax7 = (i37 == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) ? i33 : Math.max(i33, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(i37, iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        if (z19 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.f2513g = 0;
            int iO3 = 0;
            while (iO3 < virtualChildCount) {
                View viewR2 = r(iO3);
                if (viewR2 == null) {
                    this.f2513g += z(iO3);
                } else if (viewR2.getVisibility() == 8) {
                    iO3 += o(viewR2, iO3);
                } else {
                    LayoutParams layoutParams2 = (LayoutParams) viewR2.getLayoutParams();
                    if (z15) {
                        this.f2513g += ((LinearLayout.LayoutParams) layoutParams2).leftMargin + iMax3 + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + q(viewR2);
                    } else {
                        int i38 = this.f2513g;
                        this.f2513g = Math.max(i38, i38 + iMax3 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + q(viewR2));
                    }
                    iO3++;
                    iMax7 = iMax7;
                }
                iO3++;
                iMax7 = iMax7;
            }
        }
        int i39 = iMax7;
        int paddingLeft = this.f2513g + getPaddingLeft() + getPaddingRight();
        this.f2513g = paddingLeft;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, 0);
        int i40 = (16777215 & iResolveSizeAndState) - this.f2513g;
        if (z16 || (i40 != 0 && f10 > 0.0f)) {
            float f13 = this.f2514h;
            if (f13 > 0.0f) {
                f10 = f13;
            }
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            this.f2513g = 0;
            int i41 = i34;
            int iMax8 = -1;
            int iCombineMeasuredStates2 = i36;
            int i42 = 0;
            while (i42 < virtualChildCount) {
                View viewR3 = r(i42);
                if (viewR3 == null || viewR3.getVisibility() == 8) {
                    i13 = i40;
                    virtualChildCount = virtualChildCount;
                } else {
                    LayoutParams layoutParams3 = (LayoutParams) viewR3.getLayoutParams();
                    float f14 = ((LinearLayout.LayoutParams) layoutParams3).weight;
                    if (f14 > 0.0f) {
                        int i43 = (int) ((i40 * f14) / f10);
                        float f15 = f10 - f14;
                        int i44 = i40 - i43;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom() + ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin, ((LinearLayout.LayoutParams) layoutParams3).height);
                        if (((LinearLayout.LayoutParams) layoutParams3).width == 0) {
                            i16 = 1073741824;
                            if (mode == 1073741824) {
                                if (i43 <= 0) {
                                    i43 = 0;
                                }
                                viewR3.measure(View.MeasureSpec.makeMeasureSpec(i43, 1073741824), childMeasureSpec);
                            }
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewR3.getMeasuredState() & j1.f21601t);
                            f10 = f15;
                            i13 = i44;
                        } else {
                            i16 = 1073741824;
                        }
                        int measuredWidth2 = viewR3.getMeasuredWidth() + i43;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        viewR3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i16), childMeasureSpec);
                        iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewR3.getMeasuredState() & j1.f21601t);
                        f10 = f15;
                        i13 = i44;
                    } else {
                        i13 = i40;
                    }
                    if (z15) {
                        this.f2513g += viewR3.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + q(viewR3);
                    } else {
                        int i45 = this.f2513g;
                        this.f2513g = Math.max(i45, viewR3.getMeasuredWidth() + i45 + ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + q(viewR3));
                    }
                    boolean z21 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) layoutParams3).height == -1;
                    int i46 = ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin;
                    int measuredHeight2 = viewR3.getMeasuredHeight() + i46;
                    iMax8 = Math.max(iMax8, measuredHeight2);
                    if (!z21) {
                        i46 = measuredHeight2;
                    }
                    int iMax9 = Math.max(i41, i46);
                    if (z18) {
                        i14 = -1;
                        boolean z22 = ((LinearLayout.LayoutParams) layoutParams3).height == -1;
                        if (z20 && (baseline = viewR3.getBaseline()) != i14) {
                            i15 = ((LinearLayout.LayoutParams) layoutParams3).gravity;
                            if (i15 < 0) {
                                i15 = this.f2512f;
                            }
                            int i47 = (((i15 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i47] = Math.max(iArr2[i47], baseline);
                            iArr[i47] = Math.max(iArr[i47], measuredHeight2 - baseline);
                        }
                        z18 = z22;
                        i41 = iMax9;
                        f10 = f10;
                    } else {
                        i14 = -1;
                    }
                    if (z20) {
                        i15 = ((LinearLayout.LayoutParams) layoutParams3).gravity;
                        if (i15 < 0) {
                            i15 = this.f2512f;
                        }
                        int i48 = (((i15 & 112) >> 4) & (-2)) >> 1;
                        iArr2[i48] = Math.max(iArr2[i48], baseline);
                        iArr[i48] = Math.max(iArr[i48], measuredHeight2 - baseline);
                    }
                    z18 = z22;
                    i41 = iMax9;
                    f10 = f10;
                }
                i42++;
                i40 = i13;
                virtualChildCount = virtualChildCount;
            }
            i12 = virtualChildCount;
            this.f2513g += getPaddingLeft() + getPaddingRight();
            int i49 = iArr2[1];
            iMax = (i49 == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) ? iMax8 : Math.max(iMax8, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(i49, iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
            iMax2 = i41;
            i36 = iCombineMeasuredStates2;
        } else {
            iMax2 = Math.max(i34, i35);
            if (z19 && mode != 1073741824) {
                for (int i50 = 0; i50 < virtualChildCount; i50++) {
                    View viewR4 = r(i50);
                    if (viewR4 != null && viewR4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) viewR4.getLayoutParams())).weight > 0.0f) {
                        viewR4.measure(View.MeasureSpec.makeMeasureSpec(iMax3, 1073741824), View.MeasureSpec.makeMeasureSpec(viewR4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i12 = virtualChildCount;
            iMax = i39;
        }
        if (z18 || mode2 == 1073741824) {
            iMax2 = iMax;
        }
        setMeasuredDimension(iResolveSizeAndState | (i36 & j1.f21601t), View.resolveSizeAndState(Math.max(iMax2 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, i36 << 16));
        if (z17) {
            j(i12, i10);
        }
    }

    int z(int i10) {
        return 0;
    }
}
