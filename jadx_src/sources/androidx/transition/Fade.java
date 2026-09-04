package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.j1;

/* JADX INFO: loaded from: classes6.dex */
public class Fade extends Visibility {

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final String f27700p1 = "android:fade:transitionAlpha";

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final int f27701p2 = 2;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private static final String f27702x1 = "Fade";

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final int f27703y1 = 1;

    public class a extends u {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f27704b;

        a(View view) {
            this.f27704b = view;
        }

        @Override // androidx.transition.u, androidx.transition.Transition.h
        public void d(@androidx.annotation.n0 Transition transition) {
            l0.h(this.f27704b, 1.0f);
            l0.a(this.f27704b);
            transition.n0(this);
        }
    }

    public static class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f27706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f27707c = false;

        b(View view) {
            this.f27706b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            l0.h(this.f27706b, 1.0f);
            if (this.f27707c) {
                this.f27706b.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (j1.L0(this.f27706b) && this.f27706b.getLayerType() == 0) {
                this.f27707c = true;
                this.f27706b.setLayerType(2, null);
            }
        }
    }

    public Fade() {
    }

    public Fade(int i10) {
        Q0(i10);
    }

    @SuppressLint({"RestrictedApi"})
    public Fade(@androidx.annotation.n0 Context context, @androidx.annotation.n0 AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f27911f);
        Q0(androidx.core.content.res.q.k(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, J0()));
        typedArrayObtainStyledAttributes.recycle();
    }

    private Animator R0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        l0.h(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, l0.f27885c, f11);
        objectAnimatorOfFloat.addListener(new b(view));
        a(new a(view));
        return objectAnimatorOfFloat;
    }

    private static float S0(z zVar, float f10) {
        Float f11;
        return (zVar == null || (f11 = (Float) zVar.f27973a.get(f27700p1)) == null) ? f10 : f11.floatValue();
    }

    @Override // androidx.transition.Visibility
    @androidx.annotation.p0
    public Animator M0(ViewGroup viewGroup, View view, z zVar, z zVar2) {
        float fS0 = S0(zVar, 0.0f);
        return R0(view, fS0 != 1.0f ? fS0 : 0.0f, 1.0f);
    }

    @Override // androidx.transition.Visibility
    @androidx.annotation.p0
    public Animator O0(ViewGroup viewGroup, View view, z zVar, z zVar2) {
        l0.e(view);
        return R0(view, S0(zVar, 1.0f), 0.0f);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void m(@androidx.annotation.n0 z zVar) {
        super.m(zVar);
        zVar.f27973a.put(f27700p1, Float.valueOf(l0.c(zVar.f27974b)));
    }
}
