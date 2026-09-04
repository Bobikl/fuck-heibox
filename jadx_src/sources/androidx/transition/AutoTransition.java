package androidx.transition;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes6.dex */
public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        g1();
    }

    public AutoTransition(@androidx.annotation.n0 Context context, @androidx.annotation.n0 AttributeSet attributeSet) {
        super(context, attributeSet);
        g1();
    }

    private void g1() {
        c1(1);
        N0(new Fade(2)).N0(new ChangeBounds()).N0(new Fade(1));
    }
}
