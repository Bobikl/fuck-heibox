package com.transitionseverywhere;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.transition.Transition;
import androidx.transition.z;

/* JADX INFO: compiled from: Rotate.java */
/* JADX INFO: loaded from: classes4.dex */
public class d extends Transition {
    private static final String W = "android:rotate:rotation";
    private static final String[] X = {W};

    @Override // androidx.transition.Transition
    @p0
    public String[] Y() {
        return X;
    }

    @Override // androidx.transition.Transition
    public void j(@n0 z zVar) {
        zVar.f27973a.put(W, Float.valueOf(zVar.f27974b.getRotation()));
    }

    @Override // androidx.transition.Transition
    public void m(@n0 z zVar) {
        zVar.f27973a.put(W, Float.valueOf(zVar.f27974b.getRotation()));
    }

    @Override // androidx.transition.Transition
    @p0
    public Animator q(@n0 ViewGroup viewGroup, @p0 z zVar, @p0 z zVar2) {
        if (zVar == null || zVar2 == null) {
            return null;
        }
        View view = zVar2.f27974b;
        float fFloatValue = ((Float) zVar.f27973a.get(W)).floatValue();
        float fFloatValue2 = ((Float) zVar2.f27973a.get(W)).floatValue();
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        view.setRotation(fFloatValue);
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ROTATION, fFloatValue, fFloatValue2);
    }
}
