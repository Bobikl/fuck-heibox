package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.d1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.x;
import androidx.core.view.accessibility.a0;
import androidx.core.view.j1;
import com.google.android.material.R;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class ClockFaceView extends RadialViewGroup implements ClockHandView.c {
    private static final int G2 = 12;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final String f55718p3 = "";

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private static final float f55719y2 = 0.001f;
    private final ClockHandView Q;
    private final Rect R;
    private final RectF S;
    private final Rect T;
    private final SparseArray<TextView> U;
    private final androidx.core.view.a V;
    private final int[] W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final float[] f55720a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final int f55721b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final int f55722c0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private final int f55723p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private float f55724p2;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private final int f55725x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final ColorStateList f55726x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private String[] f55727y1;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.setRadius(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.Q.getSelectorRadius()) - ClockFaceView.this.f55721b0);
            return true;
        }
    }

    public class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, @n0 a0 a0Var) {
            super.onInitializeAccessibilityNodeInfo(view, a0Var);
            int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
            if (iIntValue > 0) {
                a0Var.Y1((View) ClockFaceView.this.U.get(iIntValue - 1));
            }
            a0Var.e1(a0.e.h(0, 1, iIntValue, 1, false, view.isSelected()));
            a0Var.c1(true);
            a0Var.b(a0.a.f21380j);
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (i10 != 16) {
                return super.performAccessibilityAction(view, i10, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.R);
            float fCenterX = ClockFaceView.this.R.centerX();
            float fCenterY = ClockFaceView.this.R.centerY();
            ClockFaceView.this.Q.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
            ClockFaceView.this.Q.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
            return true;
        }
    }

    public ClockFaceView(@n0 Context context) {
        this(context, null);
    }

    public ClockFaceView(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.R = new Rect();
        this.S = new RectF();
        this.T = new Rect();
        this.U = new SparseArray<>();
        this.f55720a0 = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.F, i10, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListA = com.google.android.material.resources.c.a(context, typedArrayObtainStyledAttributes, R.styleable.ClockFaceView_clockNumberTextColor);
        this.f55726x2 = colorStateListA;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.Q = clockHandView;
        this.f55721b0 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListA.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListA.getDefaultColor());
        this.W = new int[]{colorForState, colorForState, colorStateListA.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = b0.a.a(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListA2 = com.google.android.material.resources.c.a(context, typedArrayObtainStyledAttributes, R.styleable.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(colorStateListA2 != null ? colorStateListA2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.V = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        setValues(strArr, 0);
        this.f55722c0 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f55723p1 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f55725x1 = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    private void N() {
        RectF currentSelectorBox = this.Q.getCurrentSelectorBox();
        TextView textViewQ = Q(currentSelectorBox);
        for (int i10 = 0; i10 < this.U.size(); i10++) {
            TextView textView = this.U.get(i10);
            if (textView != null) {
                textView.setSelected(textView == textViewQ);
                textView.getPaint().setShader(P(currentSelectorBox, textView));
                textView.invalidate();
            }
        }
    }

    @p0
    private RadialGradient P(RectF rectF, TextView textView) {
        textView.getHitRect(this.R);
        this.S.set(this.R);
        textView.getLineBounds(0, this.T);
        RectF rectF2 = this.S;
        Rect rect = this.T;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.S)) {
            return new RadialGradient(rectF.centerX() - this.S.left, rectF.centerY() - this.S.top, rectF.width() * 0.5f, this.W, this.f55720a0, Shader.TileMode.CLAMP);
        }
        return null;
    }

    @p0
    private TextView Q(RectF rectF) {
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i10 = 0; i10 < this.U.size(); i10++) {
            TextView textView2 = this.U.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(this.R);
                this.S.set(this.R);
                this.S.union(rectF);
                float fWidth = this.S.width() * this.S.height();
                if (fWidth < f10) {
                    textView = textView2;
                    f10 = fWidth;
                }
            }
        }
        return textView;
    }

    private static float R(float f10, float f11, float f12) {
        return Math.max(Math.max(f10, f11), f12);
    }

    private void S(@d1 int i10) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.U.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < Math.max(this.f55727y1.length, size); i11++) {
            TextView textView = this.U.get(i11);
            if (i11 >= this.f55727y1.length) {
                removeView(textView);
                this.U.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    this.U.put(i11, textView);
                    addView(textView);
                }
                textView.setText(this.f55727y1[i11]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i11));
                int i12 = (i11 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i12));
                if (i12 > 1) {
                    z10 = true;
                }
                j1.B1(textView, this.V);
                textView.setTextColor(this.f55726x2);
                if (i10 != 0) {
                    textView.setContentDescription(getResources().getString(i10, this.f55727y1[i11]));
                }
            }
        }
        this.Q.setMultiLevel(z10);
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    protected void H() {
        super.H();
        for (int i10 = 0; i10 < this.U.size(); i10++) {
            this.U.get(i10).setVisibility(0);
        }
    }

    @Override // com.google.android.material.timepicker.ClockHandView.c
    public void d(float f10, boolean z10) {
        if (Math.abs(this.f55724p2 - f10) > f55719y2) {
            this.f55724p2 = f10;
            N();
        }
    }

    int getCurrentLevel() {
        return this.Q.getCurrentLevel();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@n0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        a0.g2(accessibilityNodeInfo).d1(a0.d.f(1, this.f55727y1.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        N();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iR = (int) (this.f55725x1 / R(this.f55722c0 / displayMetrics.heightPixels, this.f55723p1 / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iR, 1073741824);
        setMeasuredDimension(iR, iR);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    void setCurrentLevel(int i10) {
        this.Q.setCurrentLevel(i10);
    }

    public void setHandRotation(@x(from = 0.0d, to = 360.0d) float f10) {
        this.Q.setHandRotation(f10);
        N();
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public void setRadius(int i10) {
        if (i10 != getRadius()) {
            super.setRadius(i10);
            this.Q.setCircleRadius(getRadius());
        }
    }

    public void setValues(String[] strArr, @d1 int i10) {
        this.f55727y1 = strArr;
        S(i10);
    }
}
