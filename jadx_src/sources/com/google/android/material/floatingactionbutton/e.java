package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.core.util.o;
import com.google.android.material.R;
import com.google.android.material.shape.k;
import com.google.android.material.shape.p;
import java.util.ArrayList;

/* JADX INFO: compiled from: FloatingActionButtonImplLollipop.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(21)
public class e extends d {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @p0
    private StateListAnimator f54345c0;

    /* JADX INFO: compiled from: FloatingActionButtonImplLollipop.java */
    public static class a extends k {
        a(p pVar) {
            super(pVar);
        }

        @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    e(FloatingActionButton floatingActionButton, com.google.android.material.shadow.c cVar) {
        super(floatingActionButton, cVar);
    }

    @n0
    private StateListAnimator m0(float f10, float f11, float f12) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(d.W, n0(f10, f12));
        stateListAnimator.addState(d.X, n0(f10, f11));
        stateListAnimator.addState(d.Y, n0(f10, f11));
        stateListAnimator.addState(d.Z, n0(f10, f11));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f54313w, "elevation", f10).setDuration(0L));
        if (Build.VERSION.SDK_INT <= 24) {
            FloatingActionButton floatingActionButton = this.f54313w;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f54313w, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(d.D);
        stateListAnimator.addState(d.f54289a0, animatorSet);
        stateListAnimator.addState(d.f54290b0, n0(0.0f, 0.0f));
        return stateListAnimator;
    }

    @n0
    private Animator n0(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f54313w, "elevation", f10).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f54313w, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(d.D);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void A() {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void C() {
        i0();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void E(int[] iArr) {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void F(float f10, float f11, float f12) {
        if (this.f54313w.getStateListAnimator() == this.f54345c0) {
            StateListAnimator stateListAnimatorM0 = m0(f10, f11, f12);
            this.f54345c0 = stateListAnimatorM0;
            this.f54313w.setStateListAnimator(stateListAnimatorM0);
        }
        if (c0()) {
            i0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    boolean N() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void Y(@p0 ColorStateList colorStateList) {
        Drawable drawable = this.f54293c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(com.google.android.material.ripple.b.e(colorStateList));
        } else {
            super.Y(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    boolean c0() {
        return this.f54314x.c() || !e0();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void g0() {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    @n0
    k l() {
        return new a((p) o.l(this.f54291a));
    }

    @n0
    c l0(int i10, ColorStateList colorStateList) {
        Context context = this.f54313w.getContext();
        c cVar = new c((p) o.l(this.f54291a));
        cVar.f(androidx.core.content.d.f(context, R.color.design_fab_stroke_top_outer_color), androidx.core.content.d.f(context, R.color.design_fab_stroke_top_inner_color), androidx.core.content.d.f(context, R.color.design_fab_stroke_end_inner_color), androidx.core.content.d.f(context, R.color.design_fab_stroke_end_outer_color));
        cVar.e(i10);
        cVar.d(colorStateList);
        return cVar;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public float n() {
        return this.f54313w.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void s(@n0 Rect rect) {
        if (this.f54314x.c()) {
            super.s(rect);
        } else if (e0()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.f54301k - this.f54313w.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void x(ColorStateList colorStateList, @p0 PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        Drawable layerDrawable;
        k kVarL = l();
        this.f54292b = kVarL;
        kVarL.setTintList(colorStateList);
        if (mode != null) {
            this.f54292b.setTintMode(mode);
        }
        this.f54292b.Z(this.f54313w.getContext());
        if (i10 > 0) {
            this.f54294d = l0(i10, colorStateList);
            layerDrawable = new LayerDrawable(new Drawable[]{(Drawable) o.l(this.f54294d), (Drawable) o.l(this.f54292b)});
        } else {
            this.f54294d = null;
            layerDrawable = this.f54292b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(com.google.android.material.ripple.b.e(colorStateList2), layerDrawable, null);
        this.f54293c = rippleDrawable;
        this.f54295e = rippleDrawable;
    }
}
