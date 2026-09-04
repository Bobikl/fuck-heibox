package com.transitionseverywhere;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.transition.Transition;
import androidx.transition.z;

/* JADX INFO: loaded from: classes4.dex */
public class Recolor extends Transition {
    private static final String W = "android:recolor:background";
    private static final String X = "android:recolor:textColor";
    private static final String[] Y = {W, X};

    @n0
    public static final Property<TextView, Integer> Z = new a().b();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @n0
    public static final Property<ColorDrawable, Integer> f103973a0 = new b().b();

    public class a extends com.transitionseverywhere.utils.b<TextView> {
        a() {
        }

        @Override // com.transitionseverywhere.utils.b, android.util.Property
        @n0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Integer get(TextView textView) {
            return 0;
        }

        @Override // com.transitionseverywhere.utils.b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(@n0 TextView textView, int i10) {
            textView.setTextColor(i10);
        }
    }

    public class b extends com.transitionseverywhere.utils.b<ColorDrawable> {
        b() {
        }

        @Override // com.transitionseverywhere.utils.b, android.util.Property
        @n0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Integer get(@n0 ColorDrawable colorDrawable) {
            return Integer.valueOf(colorDrawable.getColor());
        }

        @Override // com.transitionseverywhere.utils.b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(@n0 ColorDrawable colorDrawable, int i10) {
            colorDrawable.setColor(i10);
        }
    }

    public Recolor() {
    }

    public Recolor(@n0 Context context, @n0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void I0(z zVar) {
        zVar.f27973a.put(W, zVar.f27974b.getBackground());
        View view = zVar.f27974b;
        if (view instanceof TextView) {
            zVar.f27973a.put(X, Integer.valueOf(((TextView) view).getCurrentTextColor()));
        }
    }

    @Override // androidx.transition.Transition
    @p0
    public String[] Y() {
        return Y;
    }

    @Override // androidx.transition.Transition
    public void j(@n0 z zVar) {
        I0(zVar);
    }

    @Override // androidx.transition.Transition
    public void m(@n0 z zVar) {
        I0(zVar);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005e  */
    @Override // androidx.transition.Transition
    @p0
    public Animator q(@n0 ViewGroup viewGroup, @p0 z zVar, @p0 z zVar2) {
        ObjectAnimator objectAnimatorOfInt;
        ObjectAnimator objectAnimatorOfInt2 = null;
        if (zVar == null || zVar2 == null) {
            return null;
        }
        View view = zVar2.f27974b;
        Drawable drawable = (Drawable) zVar.f27973a.get(W);
        Drawable drawable2 = (Drawable) zVar2.f27973a.get(W);
        if ((drawable instanceof ColorDrawable) && (drawable2 instanceof ColorDrawable)) {
            ColorDrawable colorDrawable = (ColorDrawable) drawable;
            ColorDrawable colorDrawable2 = (ColorDrawable) drawable2;
            if (colorDrawable.getColor() != colorDrawable2.getColor()) {
                int color = colorDrawable2.getColor();
                ColorDrawable colorDrawable3 = (ColorDrawable) colorDrawable2.mutate();
                colorDrawable3.setColor(colorDrawable.getColor());
                objectAnimatorOfInt = ObjectAnimator.ofInt(colorDrawable3, f103973a0, colorDrawable.getColor(), color);
                objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
            } else {
                objectAnimatorOfInt = null;
            }
        } else {
            objectAnimatorOfInt = null;
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            int iIntValue = ((Integer) zVar.f27973a.get(X)).intValue();
            int iIntValue2 = ((Integer) zVar2.f27973a.get(X)).intValue();
            if (iIntValue != iIntValue2) {
                textView.setTextColor(iIntValue2);
                objectAnimatorOfInt2 = ObjectAnimator.ofInt(textView, Z, iIntValue, iIntValue2);
                objectAnimatorOfInt2.setEvaluator(new ArgbEvaluator());
            }
        }
        return com.transitionseverywhere.utils.c.a(objectAnimatorOfInt, objectAnimatorOfInt2);
    }
}
