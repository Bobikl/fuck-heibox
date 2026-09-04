package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class Constraints extends ViewGroup {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f19377c = "Constraints";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    c f19378b;

    public static class LayoutParams extends ConstraintLayout.LayoutParams {
        public float U0;
        public boolean V0;
        public float W0;
        public float X0;
        public float Y0;
        public float Z0;

        /* JADX INFO: renamed from: a1, reason: collision with root package name */
        public float f19379a1;

        /* JADX INFO: renamed from: b1, reason: collision with root package name */
        public float f19380b1;

        /* JADX INFO: renamed from: c1, reason: collision with root package name */
        public float f19381c1;

        /* JADX INFO: renamed from: d1, reason: collision with root package name */
        public float f19382d1;

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        public float f19383e1;

        /* JADX INFO: renamed from: f1, reason: collision with root package name */
        public float f19384f1;

        /* JADX INFO: renamed from: g1, reason: collision with root package name */
        public float f19385g1;

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.U0 = 1.0f;
            this.V0 = false;
            this.W0 = 0.0f;
            this.X0 = 0.0f;
            this.Y0 = 0.0f;
            this.Z0 = 0.0f;
            this.f19379a1 = 1.0f;
            this.f19380b1 = 1.0f;
            this.f19381c1 = 0.0f;
            this.f19382d1 = 0.0f;
            this.f19383e1 = 0.0f;
            this.f19384f1 = 0.0f;
            this.f19385g1 = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.U0 = 1.0f;
            this.V0 = false;
            this.W0 = 0.0f;
            this.X0 = 0.0f;
            this.Y0 = 0.0f;
            this.Z0 = 0.0f;
            this.f19379a1 = 1.0f;
            this.f19380b1 = 1.0f;
            this.f19381c1 = 0.0f;
            this.f19382d1 = 0.0f;
            this.f19383e1 = 0.0f;
            this.f19384f1 = 0.0f;
            this.f19385g1 = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f19437y);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.ConstraintSet_android_alpha) {
                    this.U0 = typedArrayObtainStyledAttributes.getFloat(index, this.U0);
                } else if (index == R.styleable.ConstraintSet_android_elevation) {
                    this.W0 = typedArrayObtainStyledAttributes.getFloat(index, this.W0);
                    this.V0 = true;
                } else if (index == R.styleable.ConstraintSet_android_rotationX) {
                    this.Y0 = typedArrayObtainStyledAttributes.getFloat(index, this.Y0);
                } else if (index == R.styleable.ConstraintSet_android_rotationY) {
                    this.Z0 = typedArrayObtainStyledAttributes.getFloat(index, this.Z0);
                } else if (index == R.styleable.ConstraintSet_android_rotation) {
                    this.X0 = typedArrayObtainStyledAttributes.getFloat(index, this.X0);
                } else if (index == R.styleable.ConstraintSet_android_scaleX) {
                    this.f19379a1 = typedArrayObtainStyledAttributes.getFloat(index, this.f19379a1);
                } else if (index == R.styleable.ConstraintSet_android_scaleY) {
                    this.f19380b1 = typedArrayObtainStyledAttributes.getFloat(index, this.f19380b1);
                } else if (index == R.styleable.ConstraintSet_android_transformPivotX) {
                    this.f19381c1 = typedArrayObtainStyledAttributes.getFloat(index, this.f19381c1);
                } else if (index == R.styleable.ConstraintSet_android_transformPivotY) {
                    this.f19382d1 = typedArrayObtainStyledAttributes.getFloat(index, this.f19382d1);
                } else if (index == R.styleable.ConstraintSet_android_translationX) {
                    this.f19383e1 = typedArrayObtainStyledAttributes.getFloat(index, this.f19383e1);
                } else if (index == R.styleable.ConstraintSet_android_translationY) {
                    this.f19384f1 = typedArrayObtainStyledAttributes.getFloat(index, this.f19384f1);
                } else if (index == R.styleable.ConstraintSet_android_translationZ) {
                    this.f19385g1 = typedArrayObtainStyledAttributes.getFloat(index, this.f19385g1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ConstraintLayout.LayoutParams) layoutParams);
            this.U0 = 1.0f;
            this.V0 = false;
            this.W0 = 0.0f;
            this.X0 = 0.0f;
            this.Y0 = 0.0f;
            this.Z0 = 0.0f;
            this.f19379a1 = 1.0f;
            this.f19380b1 = 1.0f;
            this.f19381c1 = 0.0f;
            this.f19382d1 = 0.0f;
            this.f19383e1 = 0.0f;
            this.f19384f1 = 0.0f;
            this.f19385g1 = 0.0f;
        }
    }

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(attributeSet);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c(attributeSet);
        super.setVisibility(8);
    }

    private void c(AttributeSet attributeSet) {
        Log.v(f19377c, " ################# init");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    public c getConstraintSet() {
        if (this.f19378b == null) {
            this.f19378b = new c();
        }
        this.f19378b.J(this);
        return this.f19378b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
