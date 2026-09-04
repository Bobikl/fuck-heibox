package com.transitionseverywhere.extra;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.transition.Transition;
import androidx.transition.z;
import com.transitionseverywhere.utils.c;

/* JADX INFO: loaded from: classes4.dex */
@TargetApi(14)
public class Translation extends Transition {
    private static final String W = "Translation:translationX";
    private static final String X = "Translation:translationY";
    private static final String[] Y = {W, X};

    @p0
    private static final Property<View, PointF> Z = new a(PointF.class, "translation");

    public class a extends Property<View, PointF> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(@n0 View view) {
            return new PointF(view.getTranslationX(), view.getTranslationY());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@n0 View view, @n0 PointF pointF) {
            view.setTranslationX(pointF.x);
            view.setTranslationY(pointF.y);
        }
    }

    public Translation() {
    }

    public Translation(@n0 Context context, @n0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void I0(@n0 z zVar) {
        zVar.f27973a.put(W, Float.valueOf(zVar.f27974b.getTranslationX()));
        zVar.f27973a.put(X, Float.valueOf(zVar.f27974b.getTranslationY()));
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

    @Override // androidx.transition.Transition
    @p0
    public Animator q(@n0 ViewGroup viewGroup, @p0 z zVar, @p0 z zVar2) {
        if (zVar == null || zVar2 == null) {
            return null;
        }
        float fFloatValue = ((Float) zVar.f27973a.get(W)).floatValue();
        float fFloatValue2 = ((Float) zVar.f27973a.get(X)).floatValue();
        float fFloatValue3 = ((Float) zVar2.f27973a.get(W)).floatValue();
        float fFloatValue4 = ((Float) zVar2.f27973a.get(X)).floatValue();
        zVar2.f27974b.setTranslationX(fFloatValue);
        zVar2.f27974b.setTranslationY(fFloatValue2);
        Property<View, PointF> property = Z;
        if (property != null) {
            return ObjectAnimator.ofObject(zVar2.f27974b, (Property<View, V>) property, (TypeConverter) null, P().a(fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4));
        }
        return c.a(fFloatValue == fFloatValue3 ? null : ObjectAnimator.ofFloat(zVar2.f27974b, (Property<View, Float>) View.TRANSLATION_X, fFloatValue, fFloatValue3), fFloatValue2 != fFloatValue4 ? ObjectAnimator.ofFloat(zVar2.f27974b, (Property<View, Float>) View.TRANSLATION_Y, fFloatValue2, fFloatValue4) : null);
    }
}
