package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: loaded from: classes.dex */
public class ReactiveGuide extends View implements e.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19444e;

    public ReactiveGuide(Context context) {
        super(context);
        this.f19441b = -1;
        this.f19442c = false;
        this.f19443d = 0;
        this.f19444e = true;
        super.setVisibility(8);
        c(null);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19441b = -1;
        this.f19442c = false;
        this.f19443d = 0;
        this.f19444e = true;
        super.setVisibility(8);
        c(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19441b = -1;
        this.f19442c = false;
        this.f19443d = 0;
        this.f19444e = true;
        super.setVisibility(8);
        c(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10);
        this.f19441b = -1;
        this.f19442c = false;
        this.f19443d = 0;
        this.f19444e = true;
        super.setVisibility(8);
        c(attributeSet);
    }

    private void b(int i10, int i11, MotionLayout motionLayout, int i12) {
        c cVarZ0 = motionLayout.z0(i12);
        cVarZ0.d1(i11, i10);
        motionLayout.h1(i12, cVarZ0);
    }

    private void c(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f19431v);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_valueId) {
                    this.f19441b = typedArrayObtainStyledAttributes.getResourceId(index, this.f19441b);
                } else if (index == R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_animateChange) {
                    this.f19442c = typedArrayObtainStyledAttributes.getBoolean(index, this.f19442c);
                } else if (index == R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToConstraintSet) {
                    this.f19443d = typedArrayObtainStyledAttributes.getResourceId(index, this.f19443d);
                } else if (index == R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToAllConstraintSets) {
                    this.f19444e = typedArrayObtainStyledAttributes.getBoolean(index, this.f19444e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f19441b != -1) {
            ConstraintLayout.getSharedValues().a(this.f19441b, this);
        }
    }

    @Override // androidx.constraintlayout.widget.e.a
    public void a(int i10, int i11, int i12) {
        setGuidelineBegin(i11);
        int id2 = getId();
        if (id2 > 0 && (getParent() instanceof MotionLayout)) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            int currentState = motionLayout.getCurrentState();
            int i13 = this.f19443d;
            if (i13 != 0) {
                currentState = i13;
            }
            int i14 = 0;
            if (!this.f19442c) {
                if (!this.f19444e) {
                    b(i11, id2, motionLayout, currentState);
                    return;
                }
                int[] constraintSetIds = motionLayout.getConstraintSetIds();
                while (i14 < constraintSetIds.length) {
                    b(i11, id2, motionLayout, constraintSetIds[i14]);
                    i14++;
                }
                return;
            }
            if (this.f19444e) {
                int[] constraintSetIds2 = motionLayout.getConstraintSetIds();
                while (i14 < constraintSetIds2.length) {
                    int i15 = constraintSetIds2[i14];
                    if (i15 != currentState) {
                        b(i11, id2, motionLayout, i15);
                    }
                    i14++;
                }
            }
            c cVarL0 = motionLayout.l0(currentState);
            cVarL0.d1(id2, i11);
            motionLayout.i1(currentState, cVarL0, 1000);
        }
    }

    public boolean d() {
        return this.f19442c;
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getApplyToConstraintSetId() {
        return this.f19443d;
    }

    public int getAttributeId() {
        return this.f19441b;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setAnimateChange(boolean z10) {
        this.f19442c = z10;
    }

    public void setApplyToConstraintSetId(int i10) {
        this.f19443d = i10;
    }

    public void setAttributeId(int i10) {
        e sharedValues = ConstraintLayout.getSharedValues();
        int i11 = this.f19441b;
        if (i11 != -1) {
            sharedValues.e(i11, this);
        }
        this.f19441b = i10;
        if (i10 != -1) {
            sharedValues.a(i10, this);
        }
    }

    public void setGuidelineBegin(int i10) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f19286a = i10;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i10) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f19288b = i10;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f10) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f19290c = f10;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
    }
}
