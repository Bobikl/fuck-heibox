package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.j1;

/* JADX INFO: loaded from: classes6.dex */
public class ChangeClipBounds extends Transition {
    private static final String X = "android:clipBounds:bounds";
    private static final String W = "android:clipBounds:clip";
    private static final String[] Y = {W};

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f27660b;

        a(View view) {
            this.f27660b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            j1.M1(this.f27660b, null);
        }
    }

    public ChangeClipBounds() {
    }

    public ChangeClipBounds(@androidx.annotation.n0 Context context, @androidx.annotation.n0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void I0(z zVar) {
        View view = zVar.f27974b;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect rectP = j1.P(view);
        zVar.f27973a.put(W, rectP);
        if (rectP == null) {
            zVar.f27973a.put(X, new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.n0
    public String[] Y() {
        return Y;
    }

    @Override // androidx.transition.Transition
    public void j(@androidx.annotation.n0 z zVar) {
        I0(zVar);
    }

    @Override // androidx.transition.Transition
    public void m(@androidx.annotation.n0 z zVar) {
        I0(zVar);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.p0
    public Animator q(@androidx.annotation.n0 ViewGroup viewGroup, @androidx.annotation.p0 z zVar, @androidx.annotation.p0 z zVar2) {
        ObjectAnimator objectAnimatorOfObject = null;
        if (zVar != null && zVar2 != null && zVar.f27973a.containsKey(W) && zVar2.f27973a.containsKey(W)) {
            Rect rect = (Rect) zVar.f27973a.get(W);
            Rect rect2 = (Rect) zVar2.f27973a.get(W);
            boolean z10 = rect2 == null;
            if (rect == null && rect2 == null) {
                return null;
            }
            if (rect == null) {
                rect = (Rect) zVar.f27973a.get(X);
            } else if (rect2 == null) {
                rect2 = (Rect) zVar2.f27973a.get(X);
            }
            if (rect.equals(rect2)) {
                return null;
            }
            j1.M1(zVar2.f27974b, rect);
            objectAnimatorOfObject = ObjectAnimator.ofObject(zVar2.f27974b, (Property<View, V>) l0.f27886d, (TypeEvaluator) new o(new Rect()), (Object[]) new Rect[]{rect, rect2});
            if (z10) {
                objectAnimatorOfObject.addListener(new a(zVar2.f27974b));
            }
        }
        return objectAnimatorOfObject;
    }
}
