package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.transition.Transition;
import java.util.Map;

/* JADX INFO: compiled from: TextScale.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class a0 extends Transition {
    private static final String W = "android:textscale:scale";

    /* JADX INFO: compiled from: TextScale.java */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f54428b;

        a(TextView textView) {
            this.f54428b = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@n0 ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f54428b.setScaleX(fFloatValue);
            this.f54428b.setScaleY(fFloatValue);
        }
    }

    private void I0(@n0 androidx.transition.z zVar) {
        View view = zVar.f27974b;
        if (view instanceof TextView) {
            zVar.f27973a.put(W, Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.Transition
    public void j(@n0 androidx.transition.z zVar) {
        I0(zVar);
    }

    @Override // androidx.transition.Transition
    public void m(@n0 androidx.transition.z zVar) {
        I0(zVar);
    }

    @Override // androidx.transition.Transition
    public Animator q(@n0 ViewGroup viewGroup, @p0 androidx.transition.z zVar, @p0 androidx.transition.z zVar2) {
        if (zVar == null || zVar2 == null || !(zVar.f27974b instanceof TextView)) {
            return null;
        }
        View view = zVar2.f27974b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map<String, Object> map = zVar.f27973a;
        Map<String, Object> map2 = zVar2.f27973a;
        float fFloatValue = map.get(W) != null ? ((Float) map.get(W)).floatValue() : 1.0f;
        float fFloatValue2 = map2.get(W) != null ? ((Float) map2.get(W)).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new a(textView));
        return valueAnimatorOfFloat;
    }
}
