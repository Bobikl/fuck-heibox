package com.transitionseverywhere.extra;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.transition.Transition;
import androidx.transition.Visibility;
import androidx.transition.u;
import androidx.transition.z;
import com.transitionseverywhere.R;
import com.transitionseverywhere.utils.c;

/* JADX INFO: loaded from: classes4.dex */
public class Scale extends Visibility {

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    static final String f104034x1 = "scale:scaleX";

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    static final String f104035y1 = "scale:scaleY";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private float f104036p1;

    public class a extends u {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f104037b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f104038c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f104039d;

        a(View view, float f10, float f11) {
            this.f104037b = view;
            this.f104038c = f10;
            this.f104039d = f11;
        }

        @Override // androidx.transition.u, androidx.transition.Transition.h
        public void d(@n0 Transition transition) {
            this.f104037b.setScaleX(this.f104038c);
            this.f104037b.setScaleY(this.f104039d);
            transition.n0(this);
        }
    }

    public Scale() {
        this.f104036p1 = 0.0f;
    }

    public Scale(float f10) {
        this.f104036p1 = 0.0f;
        S0(f10);
    }

    public Scale(@n0 Context context, @n0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f104036p1 = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f103972f);
        S0(typedArrayObtainStyledAttributes.getFloat(R.styleable.Scale_disappearedScale, this.f104036p1));
        typedArrayObtainStyledAttributes.recycle();
    }

    @p0
    private Animator R0(@n0 View view, float f10, float f11, @p0 z zVar) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        float fFloatValue = scaleX * f10;
        float f12 = scaleX * f11;
        float fFloatValue2 = f10 * scaleY;
        float f13 = f11 * scaleY;
        if (zVar != null) {
            Float f14 = (Float) zVar.f27973a.get(f104034x1);
            Float f15 = (Float) zVar.f27973a.get(f104035y1);
            if (f14 != null && f14.floatValue() != scaleX) {
                fFloatValue = f14.floatValue();
            }
            if (f15 != null && f15.floatValue() != scaleY) {
                fFloatValue2 = f15.floatValue();
            }
        }
        view.setScaleX(fFloatValue);
        view.setScaleY(fFloatValue2);
        Animator animatorA = c.a(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, fFloatValue, f12), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, fFloatValue2, f13));
        a(new a(view, scaleX, scaleY));
        return animatorA;
    }

    @Override // androidx.transition.Visibility
    @p0
    public Animator M0(@n0 ViewGroup viewGroup, @n0 View view, @p0 z zVar, @p0 z zVar2) {
        return R0(view, this.f104036p1, 1.0f, zVar);
    }

    @Override // androidx.transition.Visibility
    public Animator O0(@n0 ViewGroup viewGroup, @n0 View view, @p0 z zVar, @p0 z zVar2) {
        return R0(view, 1.0f, this.f104036p1, zVar);
    }

    @n0
    public Scale S0(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("disappearedScale cannot be negative!");
        }
        this.f104036p1 = f10;
        return this;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void m(@n0 z zVar) {
        super.m(zVar);
        zVar.f27973a.put(f104034x1, Float.valueOf(zVar.f27974b.getScaleX()));
        zVar.f27973a.put(f104035y1, Float.valueOf(zVar.f27974b.getScaleY()));
    }
}
