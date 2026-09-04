package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.j1;
import com.google.android.material.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class RadialViewGroup extends ConstraintLayout {
    private static final String M = "skip";
    static final int N = 1;
    static final int O = 2;
    static final float P = 0.66f;
    private final Runnable J;
    private int K;
    private com.google.android.material.shape.k L;

    public RadialViewGroup(@n0 Context context) {
        this(context, null);
    }

    public RadialViewGroup(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadialViewGroup(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        j1.I1(this, D());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f52826c1, i10, 0);
        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.RadialViewGroup_materialCircleRadius, 0);
        this.J = new Runnable() { // from class: com.google.android.material.timepicker.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f55807b.H();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    private void C(List<View> list, androidx.constraintlayout.widget.c cVar, int i10) {
        Iterator<View> it = list.iterator();
        float size = 0.0f;
        while (it.hasNext()) {
            cVar.M(it.next().getId(), R.id.circle_center, i10, size);
            size += 360.0f / list.size();
        }
    }

    private Drawable D() {
        com.google.android.material.shape.k kVar = new com.google.android.material.shape.k();
        this.L = kVar;
        kVar.l0(new com.google.android.material.shape.n(0.5f));
        this.L.o0(ColorStateList.valueOf(-1));
        return this.L;
    }

    private static boolean F(View view) {
        return "skip".equals(view.getTag());
    }

    private void I() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.J);
            handler.post(this.J);
        }
    }

    @r
    int E(int i10) {
        return i10 == 2 ? Math.round(this.K * P) : this.K;
    }

    protected void H() {
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.H(this);
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != R.id.circle_center && !F(childAt)) {
                int i11 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i11 == null) {
                    i11 = 1;
                }
                if (!map.containsKey(i11)) {
                    map.put(i11, new ArrayList());
                }
                ((List) map.get(i11)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            C((List) entry.getValue(), cVar, E(((Integer) entry.getKey()).intValue()));
        }
        cVar.r(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(j1.D());
        }
        I();
    }

    @r
    public int getRadius() {
        return this.K;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        H();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        I();
    }

    @Override // android.view.View
    public void setBackgroundColor(@androidx.annotation.l int i10) {
        this.L.o0(ColorStateList.valueOf(i10));
    }

    public void setRadius(@r int i10) {
        this.K = i10;
        H();
    }
}
