package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.g;
import androidx.constraintlayout.core.widgets.j;
import androidx.constraintlayout.core.widgets.l;
import androidx.constraintlayout.widget.VirtualLayout;

/* JADX INFO: loaded from: classes.dex */
public class MotionPlaceholder extends VirtualLayout {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f18576n = "MotionPlaceholder";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    j f18577m;

    public MotionPlaceholder(Context context) {
        super(context);
    }

    public MotionPlaceholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MotionPlaceholder(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public MotionPlaceholder(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void G(d dVar, g gVar, SparseArray<ConstraintWidget> sparseArray) {
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public void J(l lVar, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (lVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            lVar.p2(mode, size, mode2, size2);
            setMeasuredDimension(lVar.k2(), lVar.j2());
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    @SuppressLint({"WrongCall"})
    protected void onMeasure(int i10, int i11) {
        J(this.f18577m, i10, i11);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    protected void y(AttributeSet attributeSet) {
        super.y(attributeSet);
        this.f19251e = new j();
        I();
    }
}
