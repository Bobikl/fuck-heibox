package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public class Group extends ConstraintHelper {
    public Group(Context context) {
        super(context);
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void D(ConstraintLayout constraintLayout) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f19327u0.W1(0);
        layoutParams.f19327u0.s1(0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        p();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void r(ConstraintLayout constraintLayout) {
        q(constraintLayout);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        p();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        p();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void y(AttributeSet attributeSet) {
        super.y(attributeSet);
        this.f19252f = false;
    }
}
