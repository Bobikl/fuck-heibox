package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class MotionHelper extends ConstraintHelper implements p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f18603k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f18604l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f18605m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected View[] f18606n;

    public MotionHelper(Context context) {
        super(context);
        this.f18603k = false;
        this.f18604l = false;
    }

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18603k = false;
        this.f18604l = false;
        y(attributeSet);
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f18603k = false;
        this.f18604l = false;
        y(attributeSet);
    }

    @Override // androidx.constraintlayout.motion.widget.p
    public void a(MotionLayout motionLayout) {
    }

    public void b(MotionLayout motionLayout, HashMap<View, o> map) {
    }

    @Override // androidx.constraintlayout.motion.widget.p
    public void c(Canvas canvas) {
    }

    @Override // androidx.constraintlayout.motion.widget.p
    public boolean d() {
        return this.f18603k;
    }

    @Override // androidx.constraintlayout.motion.widget.p
    public boolean e() {
        return this.f18604l;
    }

    public boolean f() {
        return false;
    }

    public void g(MotionLayout motionLayout, int i10, int i11, float f10) {
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public float getProgress() {
        return this.f18605m;
    }

    @Override // androidx.constraintlayout.motion.widget.p
    public void h(Canvas canvas) {
    }

    public void i(MotionLayout motionLayout, int i10) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.l
    public void j(MotionLayout motionLayout, int i10, int i11) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.l
    public void k(MotionLayout motionLayout, int i10, boolean z10, float f10) {
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public void setProgress(float f10) {
        this.f18605m = f10;
        int i10 = 0;
        if (this.f19249c > 0) {
            this.f18606n = w((ConstraintLayout) getParent());
            while (i10 < this.f19249c) {
                setProgress(this.f18606n[i10], f10);
                i10++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i10 < childCount) {
            View childAt = viewGroup.getChildAt(i10);
            if (!(childAt instanceof MotionHelper)) {
                setProgress(childAt, f10);
            }
            i10++;
        }
    }

    public void setProgress(View view, float f10) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void y(AttributeSet attributeSet) {
        super.y(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.Y);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.MotionHelper_onShow) {
                    this.f18603k = typedArrayObtainStyledAttributes.getBoolean(index, this.f18603k);
                } else if (index == R.styleable.MotionHelper_onHide) {
                    this.f18604l = typedArrayObtainStyledAttributes.getBoolean(index, this.f18604l);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
