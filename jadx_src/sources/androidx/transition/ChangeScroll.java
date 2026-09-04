package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes6.dex */
public class ChangeScroll extends Transition {
    private static final String W = "android:changeScroll:x";
    private static final String X = "android:changeScroll:y";
    private static final String[] Y = {W, X};

    public ChangeScroll() {
    }

    public ChangeScroll(@androidx.annotation.n0 Context context, @androidx.annotation.n0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void I0(z zVar) {
        zVar.f27973a.put(W, Integer.valueOf(zVar.f27974b.getScrollX()));
        zVar.f27973a.put(X, Integer.valueOf(zVar.f27974b.getScrollY()));
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.p0
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
        ObjectAnimator objectAnimatorOfInt;
        ObjectAnimator objectAnimatorOfInt2 = null;
        if (zVar == null || zVar2 == null) {
            return null;
        }
        View view = zVar2.f27974b;
        int iIntValue = ((Integer) zVar.f27973a.get(W)).intValue();
        int iIntValue2 = ((Integer) zVar2.f27973a.get(W)).intValue();
        int iIntValue3 = ((Integer) zVar.f27973a.get(X)).intValue();
        int iIntValue4 = ((Integer) zVar2.f27973a.get(X)).intValue();
        if (iIntValue != iIntValue2) {
            view.setScrollX(iIntValue);
            objectAnimatorOfInt = ObjectAnimator.ofInt(view, "scrollX", iIntValue, iIntValue2);
        } else {
            objectAnimatorOfInt = null;
        }
        if (iIntValue3 != iIntValue4) {
            view.setScrollY(iIntValue3);
            objectAnimatorOfInt2 = ObjectAnimator.ofInt(view, "scrollY", iIntValue3, iIntValue4);
        }
        return y.c(objectAnimatorOfInt, objectAnimatorOfInt2);
    }
}
